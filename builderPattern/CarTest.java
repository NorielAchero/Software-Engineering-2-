package builderPattern;

import java.util.*;

public class CarTest{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        System.out.println("!!Input Noriel Achero's Vehicle Information!!");
        System.out.println();
        System.out.println();
        System.out.print("Brand: ");
        String brand = scan.next();
        System.out.print("Engine Type: (G = Gasoline | D = Diesel) ");
        char engineOption = scan.next().charAt(0);
        String engineType = "";
        if(engineOption == 'G'){
            engineType = "Gasoline";
        }
        else if(engineOption == 'D'){
            engineType = "Diesel";
        }

        System.out.print("Tranmission Type: (A = Automatic | M = Manual) ");
        char transmissionOption = scan.next().charAt(0);
        String transmission = "";
        if(transmissionOption == 'A'){
            transmission = "Automatic";
        }
        else if(transmissionOption == 'M'){
            transmission = "Manual";
        }

        System.out.print("Color: ");
        String color = scan.next();

        System.out.print("Passenger Capacity: ");
        Integer passengerCapacity = scan.nextInt();



        Car broomBroomNiNoriel = new Car.CarBuilder()
        .passengerCapacity(passengerCapacity)
        .transmission(transmission)
        .brand(brand)
        .engineType(engineType)
        .color(color)
        .build();

        System.out.println();
        System.out.println("Noriel Achero's Vehicle Information");
        System.out.println();
        System.out.println("Brand: " + broomBroomNiNoriel.brand);
        System.out.println("Engine Type: " + broomBroomNiNoriel.engineType);
        System.out.println("Transmission Type: " + broomBroomNiNoriel.transmission);
        System.out.println("Paint Color: " + broomBroomNiNoriel.color);
        System.out.println("Passenger Capacity: " + broomBroomNiNoriel.passengerCapacity);
        
    }
}
