public class deluxeQueen extends room {
    private int bed;

    public deluxeQueen() {


    }

    public deluxeQueen(int RoomID,int bed) {
        super(RoomID);
        this.bed = bed;
        switch (RoomID){
            case 1:
                setFeatures("deluxe queen");
                setDescription("good room");
                setPrice(200);
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
                '}';
    }
}
