package oop1.ex;

public class Rectangle {
    int width;
    int height;
    int area;
    int perimeter;
    boolean square;

    void Area(){
        area = width * height;
        System.out.println("넓이: "+ area);
    }

    void Perimeter(){
        perimeter = 2 * (width + height);
        System.out.println("둘레: "+ perimeter);
    }

    void Square(){
        if (width != height){
            square = true;
            System.out.println("직사각형입니다.");
        }
        else{
            square = false;
            System.out.println("정사각형입니다. ");
        }
    }

}
