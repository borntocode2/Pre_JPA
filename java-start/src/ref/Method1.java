package ref;

public class Method1 {
    public static void main(String[] args) {

        Student student1 = createStudent("이지원", 20, 80); //참조값을 전달하기 때문에 값이 변경됨
        Student student2 = createStudent( "정상화", 20, 80);
        printstudent(student1);
        printstudent(student2);
    }

    static Student createStudent(String name, int age, int grade){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student. grade = grade;

        return student;
    }
    static void studentinit(Student student, String name, int age, int grade){
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printstudent(Student student){
        System.out.println(student.name + student.age + student.grade);

    }
}
