import java.util.Scanner;

public class salaryCalculater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dayHours[]=new int[7];
        int totalHours=0;
        int Salary=0;
        int saturdaySalary=(((dayHours[6]*100)*((25/100)*(dayHours[6]*100))));
        int sundaySalary=(((dayHours[0]*100)*50));
        for(int i=0;i<7;i++){
            dayHours[i]=sc.nextInt();
            totalHours+=dayHours[i];
        }
        Salary=totalHours*100;

        for(int i=0;i<7;i++){
            if (dayHours[i]>8){
                Salary+=((dayHours[i]-8)*15);
            }
        }
        if(totalHours>40){
            Salary+=((totalHours-40)*25);
        }
        if (dayHours[0]>0){
            Salary+=sundaySalary;
        }
        if(dayHours[6]>0){
            Salary+=saturdaySalary;
        }
        System.out.println(Salary);
    }
}
