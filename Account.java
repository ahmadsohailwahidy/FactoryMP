class Account{
    int acc_no;
    String name;
    float amount;

    void insert(int a, String n, float am){
        acc_no = a;
        name = n;
        amount = am;
    }

    void deposit(float amt){
        amount += amt;
        System.out.println(amt + " deposited");
    }

    void whithdraw(float amt){
        if (amount < amt){
            System.out.println("Insufficient balance");
        } else {
            amount -= amt;
            System.out.println(amt + " withdrawn");
        }
    }

    void checkBalance(){
        System.out.println("Balance is: "+amount);
    }

       void display() {
        System.out.println(acc_no + " " + name + " " + amount);
    }
}