public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        HotelService valetService = new Valet("ZEL081");
        HotelService housekeepingService = new HouseKeeping(406);
        HotelService cartService = new Cart(2);

        frontDesk.coordinateRequest(valetService);
        frontDesk.coordinateRequest(housekeepingService);
        frontDesk.coordinateRequest(cartService);
    }
}
