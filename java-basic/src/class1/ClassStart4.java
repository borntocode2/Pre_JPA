package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1; //클래스 Student에 student1 변수 -> Student 타입의 student1 변수
        student1 = new Student(); // new Student()로 student1을 이름으로 하는 메모리를 할당함, 객체가 생성된 것

        student1.name = "학생1";
        student1.age = 15; 
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2];

        students[0] = student1;
        students[1] = student2;

        System.out.println("이름: " + students[0].name + "나이: " + students[0].age + "점수: " + students[0].grade);
        System.out.println("이름: " + students[1].name + "나이: " + students[1].age + "점수: " + students[1].grade);
    }
}
