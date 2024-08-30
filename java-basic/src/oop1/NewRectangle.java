package oop1;

public class NewRectangle {
    int width;
    int height;

    int calculateArea(){
        return width * height;
    }
    int CalculatePerimeter(){
        return 2*(width + height);
    }
    boolean isSquare(){
        return width == height;
    }
}
