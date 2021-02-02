package zaffora;

public class airplain {
    private int tailNumber;
    private String make, model;

    public airplain(int tailNumber, String make, String model) {
        this.tailNumber = tailNumber;
        this.make = make;
        this.model = model;
    }

    public int getTailNumber() {
        return tailNumber;
    }

    public void setTailNumber(int tailNumber) {
        this.tailNumber = tailNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        // System.out.println(make + " " + model + " flight: " + tailNumber);
        return make + " " + model + " flight: " + tailNumber;

    }
}
