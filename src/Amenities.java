import java.util.ArrayList;

public class Amenities {

    private int ID;
    private String name;
    private double price;
    private String description;

    public Amenities() {
    }

    public Amenities(int ID, String name) {
        this.ID = ID;
        this.name = name;
        switch (ID){
            case 1:
                this.price = 100;
                this.description = "Unlimited movies";

        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    //        this.price = price;
//        this.description = description;


    @Override
    public String toString() {
        return "Amenities{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

//    public static void main(String[] args) {
//
//        int id;
//        String name;
//        while (true) {
//            id = Utils.enterInteger("enter id");
//            name = Utils.enterString("enter name");
//            test.add(id, name);
//        }
//    }
}
// class test{
//
//     static ArrayList<Amenities> amenities = new ArrayList();
//
//    public static void add(int i, String n){
//
//      amenities.add(new Amenities(i,n));
//        System.out.println(amenities);
//    }
//}