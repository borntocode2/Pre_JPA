package oop1;

import static oop1.originRectangle.calculateArea;

public class NewRectangleMain {
    public static void main(String[] args) {
        NewRectangle object = new  NewRectangle();
        object.width = 5;
        object.height = 8;

        int area = object.calculateArea();
        System.out.println("넓이는 : " + area);

        int perimeter = object.CalculatePerimeter();
        System.out.println("둘레는: " + perimeter);

        boolean squre = object.isSquare();
        System.out.println("정사각형 여부 : " + squre);
        object.calculateArea();
    }
}
