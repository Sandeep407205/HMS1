import java.util.ArrayList;

public class room {
   private int RoomID ;
   private String features ;
   private String Description ;
   private double Price;
   ArrayList<Amenities> amenities = new ArrayList<>();

    public room() {
    }

    public room(int RoomID, String features, String description, double price) {
        this.RoomID = RoomID;
        this.features = features;
        this.Description = Description;
        this.Price = Price;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "room{" +
                "RoomID=" + RoomID +
                ", features='" + features + '\'' +
                ", Description='" + Description + '\'' +
                ", Price=" + Price +
                '}';
    }
//    amenities tori = new amenities();


}
    class deluxe_queen_room extends room{

        @Override
        public void setPrice(double Price) {
            super.setPrice(Price);
        }
    }

        class deluxe_two_queen extends room{
            @Override
            public void setPrice(double Price) {
                super.setPrice(Price);
            }
        }

        class deluxe_spa extends room{
            @Override
            public void setPrice(double Price) {
                super.setPrice(Price);
            }
        }

        class family_suite extends room{
            @Override
            public void setPrice(double Price) {
                super.setPrice(Price);
            }
        }

        class family_suite_two_bed extends room{
            @Override
            public void setPrice(double Price) {
                super.setPrice(Price);
            }
        }

