package math;

public class Math {


    public static int sum(int[] array){
        int sumArray = 0;

        for(int i = 0; i < array.length; i++){
            sumArray += array[i];
        }
        return sumArray;
    }
    public static int max(int[] array){
        int maxArray = array[0];

        for(int i = 1; i< array.length; i++){
            if(maxArray < array[i]){
                maxArray = array[i];
            }
        }
        return maxArray;
    }
    public static int average(int[] array){
        int averageArray = 0;
        int sumArray2 = 0;

        for (int i = 0; i < array.length; i++){
            sumArray2 += array[i];
        }
        averageArray = sumArray2 / array.length;
        return averageArray;
    }

    public static int min(int[] array){
        int minArray = array[0];
        for (int i =1; i <array.length; i++){
            if (minArray > array[i]){
                minArray = array[i];
            }
        }
        return minArray;
    }
}
