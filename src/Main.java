import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sc.nextInt();
        System.out.println("Enter the elements : ");
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Output : " + findTimeToEquality(array));
    }

    private static int findTimeToEquality(int[] array) {
        int sum = 0, max = Integer.MIN_VALUE;
        for( int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }

        for(int i = 0; i < array.length; i++){
            sum += max - array[i];
        }
        return sum;
    }
}