import java.awt.*;

/**
 * Created by Lori on 2/1/2017.
 */
public class Application
{
    private void backAround(String cat)
    {
        int i = 0;

        if (cat != null && !cat.isEmpty())
        {
            while (i < cat.length()-1) {
                i++;
            }
            String letter = Character.toString(cat.charAt(i));
            System.out.print(letter + cat + letter);
        }
    }
    public static void main (String []args)
    {
        Application application = new Application();

        application.backAround("cat");
    }
}
