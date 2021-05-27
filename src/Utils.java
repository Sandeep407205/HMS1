
import java.util.Scanner;
public class Utils {
    public static int enterInteger(String title){
        System.out.println(title);
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        return operation;
    }

    public static String enterString(String title) {
        System.out.println(title);
        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();
        return ans;
    }

    public static void main(String[] args) {

    }
}
