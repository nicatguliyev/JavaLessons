package Lessons;

public class VowelCounts {
    public static void main(String[] args) {
         System.out.println(findVowelCount("Hello World"));
    }

    public static int findVowelCount(String data){
        String[] vowels = {"A", "a", "E", "e", "I", "i", "O", "o", "U", "u"};
        int count = 0;
        for(int i = 0; i < data.length(); i++){
            for(int j = 0; j<vowels.length; j++){
                if(String.valueOf(data.charAt(i)).equals(vowels[j]) ){
                    count++;
                }
            }
        }
        return count;
    }
}
