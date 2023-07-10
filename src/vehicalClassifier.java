class Vehilcal{
    void start(){
        System.out.println("Vehical started");
    }
    void stop(){
        System.out.println("Vehical stopped");
    }
}
class car extends Vehilcal{
    void start(){
        System.out.println("car started");
    }
    void stop(){
        System.out.println("car stopped");
    }
}
class MotorCycle extends Vehilcal{
    void start(){
        System.out.println("Motorcycle started");
    }
    void stop(){
        System.out.println("Motorcycle stopped");
    }
}
public class vehicalClassifier {
    public static void main(String[] args) {
        MotorCycle motorCycle=new MotorCycle();
        motorCycle.start();
        motorCycle.stop();
        car  Car=new car();
        Car.start();
        Car.stop();

    }
}

