package Lessons;

public class MiddleNumber {
    public static void main(String[] args) {
        System.out.println(findMiddleNumber("123"));
    }

     public static String findMiddleNumber(String number){
        String middleNumber = String.valueOf(number.charAt((number.length()-1)/2));
        return middleNumber;
     }
}
