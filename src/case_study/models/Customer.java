package case_study.models;

public class Customer extends Person {
    private String typeGuest;
    private String address;

    public Customer(){}

    public Customer(int id, String fullName, String birthday, String gender, int idCard, int phoneNumber, String email, String typeGuest, String address) {
        super(id, fullName, birthday, gender, idCard, phoneNumber, email);
        this.typeGuest = typeGuest;
        this.address = address;
    }

    public String getTypeGuest() {
        return typeGuest;
    }

    public void setTypeGuest(String typeGuest) {
        this.typeGuest = typeGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString()+
                ", typeGuest='" + typeGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
