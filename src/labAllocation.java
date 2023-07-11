import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class labAllocation {
        public static void main(String[] arg)
        {
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            int n=sc.nextInt();
            ArrayList<Integer> l=new ArrayList<>();
            if(x>=n)
            {
                l.add(x);
            }
            if(y>=n)
            {
                l.add(y);
            }
            if(z>=n)
            {
                l.add(z);
            }
            Collections.sort(l);
            int smallest=l.get(0);
            if(smallest==x)
            {
                System.out.println(" alloted L1");
            }
            else if(smallest==y)
            {
                System.out.println("alloted L2");
            }
            else
            {
                System.out.println(" alloted L3");
            }
        }
}
