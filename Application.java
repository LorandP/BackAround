/**
 * Created by Lori on 2/1/2017.
 */
public class Application
{
    /**
     * This method is used to find the last character in the string and
     * add it to the beginning and the end of the original string
     * and then print the characters with the string.
     * @param string the string from which I will extract the last character.
     */
    private void backAround(String string)
    {
        if (string != null && !string.isEmpty())
        {
            String letter = Character.toString(string.charAt(string.length()-1));
            System.out.print(letter + string + letter);
        }
        else {
            System.out.println("You have entered an empty string.");
        }
    }
    public static void main (String []args)
    {
        Application application = new Application();

        application.backAround(null);
    }
}
