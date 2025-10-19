import java.util.Scanner;
public class Binary {
     public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     

     System.out.print("Enter digits: ");
     int digit = input.nextInt();


     for(int i = digit; digit <= digit; digit = digit / 2) {
     
     int reminder = digit % 2;
     if (digit == 0) break;
     
     System.out.print(reminder);
  }
 }
}