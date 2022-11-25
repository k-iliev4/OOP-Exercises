//You have to make a catalog for vehicles. You will receive two types of vehicles - a car or a truck.
//Until you receive the command "End" you will receive lines of input in the format:
//{typeOfVehicle} {model} {color} {horsepower}
//After the "End" command, you will start receiving models of vehicles. Print for every received vehicle its data in the format:
//Type: {typeOfVehicle}
//Model: {modelOfVehicle}
//Color: {colorOfVehicle}
//Horsepower: {horsepowerOfVehicle}
//
//When you receive the command "Close the Catalogue", stop receiving input and print the average horsepower for the cars and the trucks in the format:
//"{typeOfVehicles} have average horsepower of {averageHorsepower}."
//The average horsepower is calculated by dividing the sum of horsepower for all vehicles of the type by the total count of vehicles from the same type.
//Format the answer to the 2nd decimal point.


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class vehicleCatalogue {
    public static class Car {
        private String type;
        private String model;
        private String color;
        private int horsePower;

        public Car(String type, String model, String color, int horsePower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getHorsePower() {
            return horsePower;
        }

        public void setHorsePower(int horsePower) {
            this.horsePower = horsePower;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Car> listOfAllVehiclesAdded = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] toArray = input.split(" ");
            Car newCar = new Car(toArray[0], toArray[1], toArray[2], Integer.parseInt(toArray[3]));
            listOfAllVehiclesAdded.add(newCar);
            input = scanner.nextLine();
        }
        String readingModels = scanner.nextLine();
        List<String> types = new ArrayList<>();
        while(!readingModels.equals("Close the Catalogue")){
            types.add(readingModels);
            for (int i = 0; i < listOfAllVehiclesAdded.size(); i++) {
                if (readingModels.equals(listOfAllVehiclesAdded.get(i).getModel())){
                    System.out.println("Type: " + listOfAllVehiclesAdded.get(i).getType());
                    System.out.println("Model: " + listOfAllVehiclesAdded.get(i).getModel());
                    System.out.println("Color: " + listOfAllVehiclesAdded.get(i).getColor());
                    System.out.println("Horsepower: " + listOfAllVehiclesAdded.get(i).getHorsePower());
                }
            }
            readingModels = scanner.nextLine();
        }
        double sumCarsHP = 0;
        int carCounter = 0;
        double sumTrucksHP = 0;
        int truckCounter = 0;
        for (int i = 0; i < listOfAllVehiclesAdded.size(); i++) {

            if (listOfAllVehiclesAdded.get(i).getType().equals("car")) {
                sumCarsHP += listOfAllVehiclesAdded.get(i).getHorsePower();
                carCounter++;
            }else{
                sumTrucksHP += listOfAllVehiclesAdded.get(i).getHorsePower();
                truckCounter++;
            }
        }
        System.out.printf("Cars have average horsepower of: %.2f\n",sumCarsHP / carCounter);
        System.out.printf("Trucks have average horsepower of %.2f",sumTrucksHP / truckCounter);
    }
}
