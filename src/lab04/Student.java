package lab04;

public class Student extends Person {
    private long uniRollNumber;
    private double currentCPI;

    public long getUniRollNumber() {
        return uniRollNumber;
    }

    public double getCurrentCPI() {
        return currentCPI;
    }

    public void setUniRollNumber(long uniRollNumber) {
        this.uniRollNumber = uniRollNumber;
    }

    public void setCurrentCPI(double currentCPI) {
        this.currentCPI = currentCPI;
    }

    public Student(String name, int age, char gender, long uniRollNumber, double currentCPI) {
        super(name, age, gender);
        this.uniRollNumber = getUniRollNumber();
        this.currentCPI = getCurrentCPI();

    }

    @Override
    public String toString() {
        StringBuilder response = new StringBuilder();
        response.append("Hello, my name is " + getName() + ". ");
        response.append("My universirty roll number is " + getUniRollNumber() + ",");
        response.append(" and my current CPI is " + getCurrentCPI() + ".");
        return response.toString();
    }
}
