
class Employee{
    int id;
    String name;
    int salary;

    void insert(int i, String n, int s){
        id = i;
        name = n;
        salary = s;
    }

    void display(){
        System.out.println("Id number: "+id+"\nName: "+name+"\nSalary: "+salary+"$");
    }

}