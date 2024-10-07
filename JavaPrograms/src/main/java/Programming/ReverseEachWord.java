package Programming;

public class ReverseEachWord
{
    static void reverseEachWordOfString(String inputString)
    {
        String[] words = inputString.split(" ");
         
        String reverseString = "";
         
        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
             
            String reverseWord = "";
             
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }
             
            reverseString = reverseString + reverseWord + " ";
        }
      
         
        System.out.println(reverseString);

    }
     
    public static void main(String[] args) 
    {
        reverseEachWordOfString("Java Concept Of The Day");
        
    }
}