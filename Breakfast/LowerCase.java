public class LowerCase {
public static void main(String[] args) {

String address = "Adekola Shaba Street";

int count = 0;
for(int i = 0; i < address.length(); i++) {
    char letter = address.charAt(i);
    if (Character.isLowerCase(letter)) {
     count++;    
     System.out.println(letter);
   
    
}
}
System.out.print(count);

}
}