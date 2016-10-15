import java.awt.Color;

public class Luminance {
	
	  // return the monochrome luminance of given color
    public static double lum(Color color) {
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();
	//include BT709 ,RMY and Y grey scale fields
	//below is Y fields
        return 0.299*r + 0.587*g + 0.114*b;
    }

    // return a gray version of this Color
    public static Color toGray(Color color) {
        int y = (int) (Math.round(lum(color)));   // round to nearest int
        Color gray = new Color(y, y, y);
        return gray;
    }

    // are the two colors compatible?
    public static boolean compatible(Color a, Color b) {
        return Math.abs(lum(a) - lum(b)) >= 128.0;
    }
}