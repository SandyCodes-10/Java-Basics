import java.util.Scanner;

public class placeValue {
    public static void main(String[] args) {
        int a = placeValue(5871);
        System.out.println(a);
    }

    public static int placeValue(int number) {
        int pv=1;
        while(number/pv!=0){
            pv=pv*10;
        }
        pv=pv/10;
        return pv;
    }

}
