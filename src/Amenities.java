//import theleo.jstruct.Struct;
public class Amenities {


    public int ID;
    private String name ;
    private String Description;
    private Double price;


    public Amenities() {


    }

    public Amenities(int ID) {
        this.ID = ID;
//        this.name = name;
//        Description = description;

        switch (ID){
            case 1:
                this.price = (double)50;

                break;
            case 2:
                this.price = (double)60;
        }
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

//amenities[] a_list = new amenities[13];


