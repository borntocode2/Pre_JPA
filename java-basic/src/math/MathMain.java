package math;

public class MathMain {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};

        System.out.println("최솟값은 " + Math.min(values) + " 입니다 ");
        System.out.println("최대값은 " + Math.max(values) + " 입니다 ");
        System.out.println("평균값은 " + Math.average(values) + " 입니다 ");
        System.out.println("총합은 " + Math.sum(values) + " 입니다 ");
    }
}
