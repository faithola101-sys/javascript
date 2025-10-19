public class Evensum14 {
public static void main(String[] args) {

int evensum = 0;
int num = 10;

for(int i = 2; i <= num; i++) {
     
   if(i % 2 == 0) {
   evensum = evensum + i;
 } 
} 
System.out.println(evensum);
 
 }
}