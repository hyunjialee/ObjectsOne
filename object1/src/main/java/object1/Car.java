package object1;

public class Car { // THE CLASS
    private String make;
    private String model;
    private int year;
    private int mileage;
// above is the class variables above, these have no values
    // you want class variables to be "private" so that class can only use it
    public Car(String make, String model, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    } // this is the constructor above, as the constructor gives values to the class variables

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
//void - not expected to return a value any type, any method that doesn't return a value will use void
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}

