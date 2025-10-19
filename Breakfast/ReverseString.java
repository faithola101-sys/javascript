public class ReverseString {
public static void main(String[] args) {

char ch = 0;
String days = "monday";

for(int i = 5; i < days.length(); i = i - 1) {
     if(i < 0) {
     break;
     } 
    ch = days.charAt(i);
    System.out.println(ch);
  }
 }
}



//using Array

public class ReverseString {
public static void main(String[] args) {

String[] days = {"m","o","n","d","a","y"};

for(int i = 5; i < days.length; i = i - 1) {
  if (i < 0) {
    break;
   }
System.out.println(days[i]);
  

  }
 }
}