public class Car {
//    Class attributes
    String brand;
    String model;
    int year;

//    Method the prints the car details
    public void displayInfo(){
        System.out.printf("The brand is %s, the model is %s and the year it was made in is %d.",brand,model,year);
    }
}

//Creating Main class. Remember only one class can be public
class Main_{
    public static void main(String[] args){

//        Creating Car object
        Car firstcar = new Car();
//        Giving attributes value
        firstcar.model = "Swift";
        firstcar.brand = "Suzuki";
        firstcar.year = 2023;
//        Calling on method to use attributes
        firstcar.displayInfo();
    }
}
