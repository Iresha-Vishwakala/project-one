
public class ControlClass {

	public ControlClass() {
		// TODO Auto-generated constructor stub
	}

	//main method
    public static void main(String []args){
       System.out.println("Starting point----");

     //create a obj to Passenger car
       PassengerCar toyotaPassenger = new PassengerCar();
       System.out.println("Toyota Passenger car");
       toyotaPassenger.paint("blue");
       toyotaPassenger.speed(80);
       
       RacingCar hondaRacing = new RacingCar();
       System.out.println("Honda Racing car");
       hondaRacing.paint("red");
       hondaRacing.speed(120);
    }

}
