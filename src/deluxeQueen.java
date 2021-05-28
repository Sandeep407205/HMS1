import java.util.ArrayList;

public class deluxeQueen extends room {
    private customer data;
    private int bed;

    public deluxeQueen() {
    }

    public deluxeQueen(int RoomID, int bed, customer data, ArrayList<Amenities> amenities) {
        super(RoomID,amenities);
        this.bed = bed;
        this.data = data;
        switch (RoomID){
            case 1:
                setFeatures("deluxe queen");
                setDescription("good room");
                setPrice(200);
                setAmenities(amenities);
                break;
            case 2:
                setFeatures("world");
    }



//    public deluxeQueen(int RoomID, String features, String description, double price, int bed) {
//        super(RoomID, features, description, price);
//        this.bed = bed;
//
//        }
   }

    @Override
    public String toString() {
        System.out.println(super.toString());
//        System.out.println(getFeatures());
        return "deluxeQueen{" +
                "bed=" + bed +
                "amenities"+amenities+
                '}';
    }
}
