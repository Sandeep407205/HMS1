import java.util.ArrayList;

 class room {
   private int RoomID ;
   private String features ;
   private String Description ;
   private double Price;
   ArrayList<Amenities> amenities = new ArrayList<>();



    public room() {
    }

     public room(int roomID, String features, String Description, double Price) {
         RoomID = roomID;
         this.features = features;
         this.Description = Description;
         this.Price = Price;

     }

//     public room(int RoomID) {
//        this.RoomID= RoomID;
//     }

     public room(int roomID, ArrayList<Amenities> amenities) {
     }

     public String getFeatures() {
         return features;
     }

     public void setFeatures(String features) {
         this.features = features;
     }

     public String getDescription() {
         return Description;
     }

     public void setDescription(String description) {
         Description = description;
     }

     public double getPrice() {
         return Price;
     }

     public void setPrice(double price) {
         Price = price;
     }
     public ArrayList<Amenities> getAmenities() {
         System.out.println("room"+amenities);
         return this.amenities;
     }
     public void setAmenities(ArrayList<Amenities> amenitiess) {
         System.out.println("set"+amenitiess);
         this.amenities= amenitiess;
     }



     @Override
     public String toString() {
         return "room{" +
                 "RoomID=" + RoomID +
                 ", features='" + features + '\'' +
                 ", Description='" + Description + '\'' +
                 ", Price=" + Price +
                 ", amenities=" + amenities +
                 '}';
     }
 }
