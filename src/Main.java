import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lop[] lop = new Lop[0];
        Student[] hocVien = new Student[0];
        int choice;
        while (true) {
            System.out.println("1.Lop");
            System.out.println("2.Student");
            System.out.println("3.Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("What to do with Lop?");
                    System.out.println("1.Add");
                    System.out.println("2.Show");
                    int select = input.nextInt();
                    switch (select) {
                        case 1 -> lop = Management.addClass(lop);
                        case 2 -> {
                            for (Lop l : lop) {
                                System.out.println(l);
                            }
                        }
                    }
                }
                case 2 -> {
                    System.out.println("What to do with Student?");
                    System.out.println("1.Add");
                    System.out.println("2.Changes");
                    System.out.println("3.Delete");
                    System.out.println("4.Display");
                    int select = input.nextInt();
                    switch (select) {
                        case 1 -> hocVien = Management.addStudent(hocVien, lop);
                        case 2 -> {
                            System.out.println("Input Student ID");
                            int id = input.nextInt();
                            Student target = null;
                            for (int i = 0; i < hocVien.length; i++) {
                                if (id == hocVien[i].getId()) {
                                    target = hocVien[i];
                                }
                            }
                            System.out.println("What to Change?");
                            System.out.println("1.Name");
                            System.out.println("2.ID");
                            System.out.println("3.Gender");
                            System.out.println("4.Age");
                            int selection = input.nextInt();
                            switch (selection) {
                                case 1 -> {
                                    System.out.println("Input new Name");
                                    String name = input.nextLine();
                                    target.setName(name);
                                }
                                case 2 -> {
                                    System.out.println("Input new ID");
                                    int newId = input.nextInt();
                                    target.setId(newId);
                                }
                                case 3 -> {
                                    System.out.println("Input new Gender");
                                    String gender = input.nextLine();
                                    target.setGender(gender);
                                }
                                case 4 -> {
                                    System.out.println("Input new Age");
                                    int age = input.nextInt();
                                    target.setAge(age);
                                }
                            }

                        }
                        case 3 ->hocVien = Management.delete(hocVien);
                        case 4 -> {
                            for (Student s : hocVien) {
                                System.out.println(s);
                            }
                        }
                    }
                }
                case 3 -> System.exit(0);
            }
        }
    }
}
