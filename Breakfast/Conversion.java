import java.util.Scanner;
public class Conversion {
     public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     

     System.out.print("Enter digits: ");
     int digit = input.nextInt();


     for(int i = digit; digit <= digit; digit = digit / 2) {
     
     String reminder = digit % 2;
     if (digit == 0) break;
     
     System.out.print(reminder);
  }
 }
}