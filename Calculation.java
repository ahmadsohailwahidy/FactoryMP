class Calculation{

    // 1 * 2 * 3 * 4 * 5 = 120
    void factorial(int n){
        int fact;
        for (int j=1; j<=n; j++){
            
            fact = n * (n-1);
        }
        System.out.println("The factorial of "+n+" is "+fact);
    }

  
}