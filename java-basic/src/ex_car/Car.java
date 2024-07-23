package ex_car;

public class Car {
    private String name;
    private static int count;

    public Car(String name){
        this.name = name;
        count++;
    }

    public static void Count1(){
        System.out.println("현재까지 추가한 차의 대수는 " + count + " 입니다.");
    }




}
