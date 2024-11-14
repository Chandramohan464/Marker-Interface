interface Car{

}

interface Engine{

}

class Vehicle implements Car{
    public void isVehicle(){
        System.out.println("Yes Car is a Vehice");
    }
}

class Status implements Engine{
    public void isWorking(){
        System.out.println("Yes Engine is Working");
    }
}

public class CustomMarkerInterface {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Status status = new Status();
        vehicle.isVehicle();
        status.isWorking();
    }
}
