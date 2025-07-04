class TrialAndPractice {

    int carWheels;
    String carName;
    int carPrice;
    int noOfDoors;


    public TrialAndPractice(int carWheels, String carName, int carPrice, int noOfDoors) {
        this.carWheels = carWheels;
        this.carName = carName;
        this.carPrice = carPrice;
        this.noOfDoors = noOfDoors;
    }

    @Override
    public String toString() {
        return "My Car name is "+ carName;
    }

    public static void main(String[] args) {
        System.out.println("Checking toString method for Object clearly");
        TrialAndPractice swiftCar = new TrialAndPractice(4,"Swift",400000,4);
        TrialAndPractice vernaCar = new TrialAndPractice(4,"Verna",1200000,4);
        System.out.printf("Prince is saying %s and it has %d wheels with %d doors and it only cost rupees %d.",
                swiftCar.toString(),swiftCar.carWheels,swiftCar.noOfDoors,swiftCar.carPrice
                );
        System.out.println();
        System.out.printf("Prince is saying %s and it has %d wheels with %d doors and it only cost rupees %d.",
                vernaCar.toString(),vernaCar.carWheels,vernaCar.noOfDoors,vernaCar.carPrice);


    }

}
