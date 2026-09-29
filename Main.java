public class Main {

    // int id;
    // String name;

    

    Main(){}
    
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student();


        student1.studentId = 3;
        student1.studentName = "Jon Doe";
        // student.studentCreation(1, "John Doe");
        student.studentId = 2;
        student.studentName = "Jane Smith";

        // System.out.println(student1.studentId);
        // System.out.println(student1.studentName);
        // System.out.println(student.studentId);
        // System.out.println(student.studentName);

        student1.insertRecord(6, "This is some name");
        student.insertRecord(4, "Ahmad Asma");
        student.displayInfo();
        student1.displayInfo();



        // Main m1 = new Main();
        // System.out.println(m1.id + " " + m1.name);
    }

}