public class OddSum15 {
public static void main(String[] args) {

int oddsum = 0;
int num = 10;

for(int i = 2; i <= num; i++) {
     
   if(i % 2 != 0) {
   oddsum = oddsum + i;
 } 
} 
System.out.println(oddsum);
 
 }
}