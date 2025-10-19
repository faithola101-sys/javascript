public class Prime {
  public static void main(String[] args) {

  Boolean isPrime = true;
  int num = 20;
  int count = 0;

   for(int i = 2; i < num; i++) {
     isPrime = true;
   
   for(int j = 2; j < i; j++) 
   if(i % j == 0) isPrime = false;
   
   if(isPrime)
   count++;
   System.out.println(i + " ");
  } 
   System.out.println("Total number of Prime is " + count);
 }
}