import java.util.ArrayList;

public class Main {

    static Objects hotel_ob = new Objects();
    static room test = new room();


    public static void main(String[] args) {

        int rn,am;
        String name;
        String status;



        System.out.println("Welcome");
        while (true) {
            int value = Utils.enterInteger("What do you want to do?" +
                    "\n1:Book a room." +
                    "\n2:Room Details." +
                    "\n3:Exit");
            switch (value) {
                case 1:
                    int value1 = Utils.enterInteger("\n1:Deluxe Queen Room" +
                            "\n2:Deluxe Double Queen" +
                            "\n3:Deluxe Spa" +
                            "\n4:Family Suite" +
                            "\n5:Family suite Two ");
                    rn = Utils.enterInteger("\nenter room number");
                    name = Utils.enterString("enter your name");
                    status = Utils.enterString("enter your status");
                    while (true) {
                        am = Utils.enterInteger("Do you want to add amenities?\n1:Netflix\t2:Wifi\t3:Exit");
                        switch (am) {
                            case 1:
                                 test.amenities.add(new Amenities(am,"Netflix"));
                                break;

                        }
                        if(am==3){
                            break;
                        }

                    }
                    book(rn,name,status, test.amenities);
                    break;
                case 2:
                    System.out.println(hotel_ob.deluxeQueen[1]);
//                    order(2);
                    break;



            }
            if(value == 3){
                break;
            }
        }

    }


    public static void book(int rn,String name,String status,ArrayList<Amenities> amenities) {
        customer custom;



        custom=new customer(name,status);
        hotel_ob.deluxeQueen[rn]= new deluxeQueen(rn,rn,custom,amenities);
//        System.out.println(amenities);
        System.out.println(hotel_ob.deluxeQueen[rn]);
//        System.out.println(custom);


//

    }

}



