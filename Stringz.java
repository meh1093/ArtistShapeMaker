/**
 * Created by manuelhernandez on 11/5/17.
 */
public class Stringz implements Drawable {
    protected String fontName="Time New Roman";
    protected double fontSize = 12;
    protected String fontOrientation="Regular";

    public void draw() {
        System.out.println("You drew a" +fontOrientation+" line with font size "+ fontSize+ "in the "+ fontName+ " font");

    }
}
