package assignments;

    public class Car {

//        data fields
        private String plateNumber;
        private String carModel;
        private double dailyRate;
        private boolean rent;


        public static String companyName = "JUST Rentals";
        public static int totalCars = 0;

        public Car() {
            this.plateNumber = "Unknown";
            this.carModel = "Unknown";
            this.dailyRate = 0.0;
            this.rent = false;

            totalCars++;
        }


        public Car(String plateNumber, String model, double dailyRate) {
            this.plateNumber = plateNumber;
            this.carModel = model;

            //  Validation

            if (dailyRate < 0) {
                System.out.println("Daily rate cannot be negative.");
                this.dailyRate = 0.0;
            } else {
                this.dailyRate = dailyRate;
            }

            this.rent = false;

            totalCars++;
        }


        public String getPlateNumber() {
            return plateNumber;
        }


        public String getModel() {
            return carModel;
        }


        public double getDailyRate() {
            return dailyRate;
        }


        public boolean isRented() {
            return rent;
        }


        public void setDailyRate(double rate) {

            if (rate < 0) {
                System.out.println("Daily rate cannot be negative.");
            } else {
                this.dailyRate = rate;
                System.out.println("Daily rate changed : $" + dailyRate);
            }
        }


        public void rent() {

            if (rent) {
                System.out.println("Car " + plateNumber + " is already rented.");
            } else {
                rent = true;

                System.out.println("Car " + plateNumber + " has been rented.");
            }
        }


        public void returnCar() {

            if (!rent) {
                System.out.println("Car " + plateNumber + " is  available.");
            } else {
                rent = false;

                System.out.println("Car " + plateNumber + " has been returned.");
            }
        }

//         display

        public void displayInfo() {

            System.out.println("Plate Number: " + plateNumber);
            System.out.println("Model: " + carModel);
            System.out.println("Daily Rate: $" + dailyRate);
            System.out.println("Status: " + (rent ? "Rented" : "Available"));
        }


        public static void displayCompanyName() {
            System.out.println("Company Name: " + companyName);
        }


        public static void displayTotalCars() {
            System.out.println("Total Cars: " + totalCars);
        }
    }






 class TestCar {

    public static void main(String[] args) {

        Car car1 = new Car("ABC-595", "Toyota ", -30.0);

        Car car2 = new Car("XYZ-976", "Honda ", 40.0);


        Car.displayCompanyName();



        car1.displayInfo();

        car2.displayInfo();



        System.out.println("\n===== RENTING CAR 1 =====");

        car1.rent();



        System.out.println("\n===== CAR 1 AFTER RENTING =====");

        car1.displayInfo();



        System.out.println("\n===== RENT CAR 1 AGAIN =====");

        car1.rent();



        System.out.println("\n===== RETURNING CAR 1 =====");

        car1.returnCar();

        System.out.println("\n===== CAR 1 AFTER RETURN =====");

        car1.displayInfo();



        System.out.println("\n===== CHANGING DAILY RATE =====");

        car1.setDailyRate(35.0);

        car1.displayInfo();

        System.out.println("\n===== TESTING NEGATIVE RATE =====");

        car1.setDailyRate(-50);

        System.out.println("\n===== TOTAL CARS =====");

        Car.displayTotalCars();
    }
}