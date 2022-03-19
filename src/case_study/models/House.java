package case_study.models;

public class House extends Facility {
    private String standardRoom;
    private int numOfFloor;

    public House(){}

    public House(String nameService, double area, double cost, int maxPeople, String rentalType, String standardRoom, int numOfFloor) {
        super(nameService, area, cost, maxPeople, rentalType);
        this.standardRoom = standardRoom;
        this.numOfFloor = numOfFloor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getNumOfFloor() {
        return numOfFloor;
    }

    public void setNumOfFloor(int numOfFloor) {
        this.numOfFloor = numOfFloor;
    }

    @Override
    public String toString() {
        return "House{" + super.toString()+
                ", standardRoom='" + standardRoom + '\'' +
                ", numOfFloor=" + numOfFloor +
                '}';
    }
}
