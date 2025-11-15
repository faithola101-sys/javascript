import java.util.Arrays;

public class BreakFastFour {

     public static void main(String...arg) {
     String month = "may";
     String result = display(month);
     System.out.println(result);
  }
   
     public static String display(String month) {

 String[] months = {"january", "febuary", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};

     for(int i = 0; i < months.length; i++) {
     
     if (month.equals(months[i])) {

     if(i < 3){ 
        return month + " is fisrtQuarter";
    } 
     else if (i < 6) {
       return  month + " is secondQuarter";
    }
      else if (i < 9) {
         return  month + " is thirdQuarter";
    } 
      else {
      return month + " is fourQuarter";
      
     }
    
 } 
}
  return "invalid";
}
}

