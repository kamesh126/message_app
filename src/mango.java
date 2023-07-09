import java.util.Scanner;
public class mango {
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int columns=sc.nextInt();
        int n=sc.nextInt();
        int value=n%row;
        int nexValue=n%row;

        if(n<=row||value==1||nexValue==0){
                System.out.println("true");
        }
        else{
                System.out.println("false");
        }

    }
}
