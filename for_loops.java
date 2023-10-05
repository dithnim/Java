import java.util.Scanner;

public class for_loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = input.nextInt();
        input.close();

        for (int i = 0; i<=num; i++ ){
            System.out.print(i+"\t");
        }
        System.out.print("\n\n");

        for (int j = num; j>=0; j--){
            System.out.print(j+"\t");
        }
    }
}