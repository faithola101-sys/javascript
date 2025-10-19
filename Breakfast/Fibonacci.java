public class Fibonacci {
public static void main(String[] args) {

int num = 20;

int a = 1;
int b = 0;
int sum = 0;

for(int i = 0; i < num; i++ ) {

sum = a + b;
a = b;
b = sum;
 
System.out.println(a);
}
}
}