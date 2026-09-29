public class Main {

    // int id;
    // String name;

    

    Main(){}
    
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student();

        Rectangle rect = new Rectangle();
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();


        student1.studentId = 3;
        student1.studentName = "Jon Doe";
        // student.studentCreation(1, "John Doe");
        student.studentId = 2;
        student.studentName = "Jane Smith";

        // System.out.println(student1.studentId);
        // System.out.println(student1.studentName);
        // System.out.println(student.studentId);
        // System.out.println(student.studentName);

        // student1.insertRecord(6, "This is some name");
        // student.insertRecord(4, "Ahmad Asma");
        // student.displayInfo();
        // student1.displayInfo();

        Employee emp = new Employee();
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        emp3.insert(4, "Bob Brown", 80000);
        emp2.insert(3, "Alice Johnson", 70000);
        emp1.insert(2, "Jane Smith", 60000);
        emp.insert(1, "John Doe", 50000);

        // emp.display();
        // System.out.println("-------------------");
        // System.out.println("-------------------");
        // System.out.println("-------------------");
        // System.out.println("-------------------");
        // emp1.display();
        // System.out.println("-------------------");
        // System.out.println("-------------------");
        // System.out.println("-------------------");
        // System.out.println("-------------------");
        // emp2.display();
        // System.out.println("-------------------");
        // System.out.println("-------------------");
        // System.out.println("-------------------");
        // System.out.println("-------------------");
        // emp3.display();


        rect.insert(5, 10);
        rect1.insert(3, 6);
        rect2.insert(7, 14);

        rect.display();
        rect1.display();
        rect2.display();

        // Main m1 = new Main();
        // System.out.println(m1.id + " " + m1.name);
    }

}