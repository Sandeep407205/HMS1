import java.util.ArrayList;

public class deluxeQueen extends room {
    private customer data;
    private int bed;
    private ArrayList<Amenities> amen;
//    room rm = new room();


    public deluxeQueen() {
    }

    public deluxeQueen(int RoomID, int bed, customer data, ArrayList<Amenities> amen) {
        super(RoomID,amen);
        this.bed = bed;
        this.data = data;
        this.amen = amen;

        switch (RoomID){
            case 1:
                setFeatures("deluxe queen");
                setDescription("good room");
                setPrice(200);
                setAmenities(amen);
                break;
            case 2:
                setFeatures("world");
    }


   }



    @Override
    public void setPrice(double price) {

        super.setPrice(price+50+total());
//        super.setAmenities(amenities);

//        System.out.println("hello"+getAmenities());
        System.out.println(getPrice());




    }
    public double total() {
        int i;
        double amenPrice = 0;
        for (i = 0; i < 2; i++) {
            amenPrice = amenPrice+amen.get(i).getPrice();
            System.out.println(i+"\t"+amenPrice);

        }
        return amenPrice;
    }
    @Override
    public String toString() {
       System.out.println(super.toString());
//        System.out.println("love"+amenities);

        return "deluxeQueen{" +
                "bed=" + bed +
                "amenities"+data+
                '}';
    }

}
