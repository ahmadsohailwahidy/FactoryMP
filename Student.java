public class Student{

    int studentId;
    String studentName;

    public void studentCreation(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void insertRecord(int r, String s){
        studentId = r;
        studentName = s;
    }

    public void displayInfo(){
        System.out.println(studentId+" "+studentName);
    }

}