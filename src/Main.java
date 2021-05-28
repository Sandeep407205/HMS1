import java.util.ArrayList;

public class Main {
    static Objects hotel_ob = new Objects();
    public static void main(String[] args) {



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
                    book(value1);

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


    public static void book(int sel) {

        int rn;
        String name;
        String status;
        rn = Utils.enterInteger("\nenter room number");
        name = Utils.enterString("enter your name");
        status = Utils.enterString("enter your status");
        hotel_ob.deluxeQueen[rn]= new deluxeQueen(rn,sel);
        hotel_ob.customers[rn]=new customer(name,status);
        System.out.println(hotel_ob.deluxeQueen[rn]);
        System.out.println(hotel_ob.customers[rn]);


//

    }
}



