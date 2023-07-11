import java.util.Scanner;

public class topperProblem {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String x=Integer.toString(n);
        int len=x.length();
        // System.out.println(x.charAt(2));
        int h=x.charAt(0)-'0';
        int l=x.charAt(2)-'0';
        int m=x.charAt(1)-'0';
        if(len%2==1){

            if(h+l==m) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }

        else{
            System.out.println("no number exist");
        }
    }
}
