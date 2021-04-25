
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account firstAccount = new Account("first Account",100.00);
      
        
        System.out.println("Initial State");
        System.out.println(firstAccount);
     
        
        firstAccount.deposit(20);
        System.out.println("the balance of first Account is : "  + firstAccount.toString());
      
        
    }
}
