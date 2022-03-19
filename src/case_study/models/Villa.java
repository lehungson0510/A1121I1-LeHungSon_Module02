package case_study.models;

public class Villa extends Facility {
    private String standardRoom;
    private double areaPool;
    private int numOfFloor;

    public Villa() {
    }

    public Villa(String nameService, double area, double cost, int maxPeople, String rentalType, String standardRoom, double areaPool, int numOfFloor) {
        super(nameService, area, cost, maxPeople, rentalType);
        this.standardRoom = standardRoom;
        this.areaPool = areaPool;
        this.numOfFloor = numOfFloor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumOfFloor() {
        return numOfFloor;
    }

    public void setNumOfFloor(int numOfFloor) {
        this.numOfFloor = numOfFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +super.toString()+
                ", standardRoom='" + standardRoom + '\'' +
                ", areaPool=" + areaPool +
                ", numOfFloor=" + numOfFloor +
                '}';
    }
}
