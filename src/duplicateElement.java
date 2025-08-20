import java.util.Scanner;

public class duplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the elements of the array : ");
        for(int i=0;i<size;i++){
            int temp =  sc.nextInt();
            arr[i]=temp;
        }

        for(int i=0;i<size;i++){
            int temp =  arr[i];
            for(int j=i+1;j<size;j++){
                if(temp==arr[j]){
                    System.out.println(temp+" is a duplicate");
                }
            }
        }
    }
}
