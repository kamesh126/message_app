class SalariedEmployee{
    void calculatePay(String name,double Salary){
        System.out.println(name+","+Salary);
    }
}
class HourlyEmployee extends SalariedEmployee{
    void calculatePay(String name,double hourlyRate,double hoursWorked){
        System.out.println(name+","+hourlyRate+","+hoursWorked);
    }
}
public class payRoll {
    public static void main(String[] args) {
       HourlyEmployee sc=new HourlyEmployee();
        sc.calculatePay("TIGER",600000l);
        sc.calculatePay("kamesh",600000l,2000l);
    }
}
