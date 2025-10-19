public class ReverseNumbers {
public static void main(String[] args) {

int num = 456;
int reverse = 0;

for(int i = 1; i <= num; i = i * 10) {
int digit = (num / i) % 10;
reverse = reverse * 10 + digit; 
System.out.println(reverse);
}
}
}




















