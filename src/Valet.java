public class Valet implements HotelService {

    private String plateNumber;

    public Valet(String plateNumber){
        this.plateNumber = plateNumber;
    }

    private void pickUpVehicle(String plateNumber){
        System.out.println("Valet is picking up the vehicle that contains the plate number: " + plateNumber);
    }

    @Override
    public void performService() {
        pickUpVehicle(plateNumber);
    }
}
