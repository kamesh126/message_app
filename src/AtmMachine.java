import java.util.Scanner;


public class AtmMachine {
    public static void main(String[] args){

        MyAccount myAccount=new MyAccount();

        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("Enter 1 for deposit or 2 for withdrawal or 3 to check your balance or 4 for exit");
            int option=scanner.nextInt();
            switch(option){
                case 1:
                    System.out.println("Enter the amount to deposit");
                    int Depositamount=scanner.nextInt();
                    Deposit(Depositamount,myAccount);
                    break;
                case 2:
                    System.out.println("Enter the amount to Withdraw");
                    int WithdrawAmount=scanner.nextInt();
                    try{
                        Withdraw(WithdrawAmount,myAccount);
                    }
                    catch (InvalidAmountException error){
                        System.out.println("Withdrawal is unsuccessfull!!!\n"+error+"\n");
                    }
                    catch (InsufficientFundsException error){
                        System.out.println("Withdrawal is unsuccessfull!!!\n"+error+"\n");
                    }
                    break;
                case 3:
                    checkBalance(myAccount);
                    break;
                case 4:
                    System.exit(0);
            }
        }
        while(true);
    }

    public static void checkBalance(MyAccount myAccount){
        int Balance= myAccount.getBalance();
        System.out.println("Your current balance is :"+Balance+"\n");
    }

    public static void Withdraw(int amount,MyAccount myAccount) throws InsufficientFundsException,InvalidAmountException {
        int Balance= myAccount.getBalance();

        if (amount>Balance){
            throw new InsufficientFundsException("Withdrawal amount is greater than your balance");
        }
        else if(amount<1){
            throw new InvalidAmountException("Amount you trying to withdraw is invalid");
        }
        else{
            int newBalance= Balance - amount;
            myAccount.setBalance(newBalance);
            System.out.println("Withdrawal is successfull!!!\nYour current Balance is: "+ myAccount.getBalance()+"\n");
        }
    }

    public static void Deposit(int amount,MyAccount myAccount) {
        int Balance= myAccount.getBalance();
        int newBalnce =Balance +amount;
        myAccount.setBalance(newBalnce);
        System.out.println("Deposit is Successful!!!\nYour current Balance is: "+ myAccount.getBalance()+"\n");
    }
}

class MyAccount{
    private int Balance=10000;

    public int getBalance(){
        return Balance;
    }

    public void setBalance(int balance){
        this.Balance=balance;
    }
}

class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String errorMessage){
        super(errorMessage);
    }
}

class InvalidAmountException extends Exception{
    public InvalidAmountException(String errorMessage){
        super(errorMessage);
    }
}

