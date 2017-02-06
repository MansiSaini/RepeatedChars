/*
 * write a program to find out duplicate or repeated characters in a string.
 * and calculate the count of repition.
 */
package repeatedchars;


public class RepeatedChars 
{
    public void find_repeats (String str)
    {
        char [] str_char;
        int counter = 0;
        //converts the string into an array of chars
        str_char = str.toCharArray();
        
        for(int i =0; i<str_char.length; i++)
        {
            for(int j=0; j < i; j++)
            {
                if(str_char[i] == str_char[j])
                {
                    counter++;
                }
            }
        }
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
