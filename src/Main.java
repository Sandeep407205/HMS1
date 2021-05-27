import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome");
        while(true) {
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
                    System.out.println("2");
                    order(2);
                    break;
                case 3:
                    System.out.println("3");


            }
        }

    }
    static void order(int id){
        ArrayList<Amenities> am = new ArrayList<>();
        am.add(new Amenities(id));
    }
    static void book(int sel){

    }
}



