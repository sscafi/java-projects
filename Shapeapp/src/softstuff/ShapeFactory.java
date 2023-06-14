package softstuff;
import java.awt.*;
import java.util.Random;

public class ShapeFactory {
    private static Random randyandLahey = new Random();
    private static int posNow;
    public ShapeFactory() {
        randyandLahey = new Random();
    }
    public static rectGen createRectangle(int left, int top, int width, int height, Color color) {
    	
        return new rectGen(left, top, width, height, color);
    }

    public static circleGen createCircle(int left, int top, int radius, Color color) {
    	
        return new circleGen(left, top, radius, color);
    }

    public static suareGen createSquare(int left, int top, int size, Color color) {
    	
        return new suareGen(left, top, size, color);
    }

    public static Shape createRandomShape() {
    	
        if(posNow > 500)   posNow = 0;
        posNow += 75;
        int widthNow = Math.abs(randyandLahey.nextInt() % 120);
        
        widthNow = widthNow < 50 ? widthNow + 50 : widthNow;
        
        Color color = new Color(Math.abs(randyandLahey.nextInt() % 200) , Math.abs(randyandLahey.nextInt() % 200),      		
        Math.abs(randyandLahey.nextInt() % 200), 200);

        switch (widthNow % 3) {
        
            case 0 : {
                int heightNow = Math.abs(randyandLahey.nextInt() % 120);
                heightNow = heightNow < 50 ? heightNow + 50 : heightNow;
                return new rectGen(posNow, posNow, widthNow, heightNow, color);
            }
            case 1 : {
                return new circleGen(posNow, posNow, widthNow / 2, color);
            }
            case 2 : {
                return new circleGen(posNow, posNow, widthNow, color);
            }
        }
        return null;
    }
}