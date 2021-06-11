import java.util.Scanner;

public class Management {

    public static Lop[] addClass(Lop[] arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Adding new Classes");
        System.out.println("Input ID");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Input Class name");
        String name = input.nextLine();
        Lop lop = new Lop(id, name);
        Lop[] newLop = new Lop[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newLop[i] = arr[i];
        }
        newLop[newLop.length - 1] = lop;
        return newLop;
    }

    public static Student[] addStudent(Student[] arr, Lop[] lop) {
        Scanner input = new Scanner(System.in);
        System.out.println("Adding new Student");
        System.out.println("Input ID");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Input Name");
        String name = input.nextLine();
        System.out.println("Input Gender");
        String gender = input.nextLine();
        System.out.println("Input Age");
        int age = input.nextInt();
        System.out.println("Choose your Class ID");
        for (Lop l : lop) {
            System.out.println(l);
        }
        int classID = input.nextInt();
        Lop chooseLop = null;
        for (int i = 0; i < lop.length; i++) {
            if (classID == lop[i].getId()) {
                chooseLop = lop[i];
            }
        }
        Student student = new Student(id, name, gender, age, chooseLop);
        Student[] newStudents = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newStudents[i] = arr[i];
        }
        newStudents[newStudents.length - 1] = student;
        return newStudents;
    }
}
