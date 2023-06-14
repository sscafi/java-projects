package softstuff;
import java.awt.*;

public class rectGen extends Shape{

    private int top ;
    private int left ;
    private int width ;
    private int height ;
    private Color shapeColor;

    public rectGen(int left, int top, int width, int height, Color shapeColor){
        this.setTop(top);
        this.setLeft(left);
        this.setWidth(width);
        this.setHeight(height);
        this.setShapeColor(shapeColor);
    }

    @Override
    public int compareTo(Shape o) {
    	
        return (int) Math.ceil(this.getArea() - o.getArea());
    }

    @Override
    public void drawShape(Graphics form) {
    	
        form.setColor(shapeColor);
        form.fillRect(this.getLeft(), this.getTop(), this.getWidth(), this.getHeight());
    }

    @Override
    public int getArea() {
    	
        return getWidth() * getHeight();
    }

    public int getTop() {
    	
        return top;
    }

    public void setTop(int top) {
    	
        this.top = top;
    }

    public int getLeft() {
    	
        return left;
    }

    public void setLeft(int left) {
    	
        this.left = left;
    }

    public int getWidth() {
    	
        return width;
    }

    public void setWidth(int width) {
    	
        this.width = width;
    }

    public int getHeight() {
    	
        return height;
    }

    public void setHeight(int height) {
    	
        this.height = height;
    }

    public Color getShapeColor() {
    	
        return shapeColor;
    }

    public void setShapeColor(Color shapeColor) {
    	
        this.shapeColor = shapeColor;
    }

    public Shape copy() {
    	
        return new rectGen(this.left, this.top, this.width, this.height, this.shapeColor);
    }
}