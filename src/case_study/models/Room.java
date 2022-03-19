package case_study.models;

public class Room extends Facility {
    private String serviceFree;

    public Room(){}

    public Room(String nameService, double area, double cost, int maxPeople, String rentalType, String serviceFree) {
        super(nameService, area, cost, maxPeople, rentalType);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String toString() {
        return "Room{" +super.toString()+
                ", serviceFree='" + serviceFree + '\'' +
                '}';
    }
}
