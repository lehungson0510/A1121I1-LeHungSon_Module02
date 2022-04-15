package case_study.models;

public class Employee extends Person {
    private String educationLevel;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String fullName, String birthday, String gender, int idCard, int phoneNumber, String email, String educationLevel, String position, double salary) {
        super(id, fullName, birthday, gender, idCard, phoneNumber, email);
        this.educationLevel = educationLevel;
        this.position = position;
        this.salary = salary;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                ", educationLevel='" + educationLevel + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
