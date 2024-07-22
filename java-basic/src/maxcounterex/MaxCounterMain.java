package maxcounterex;

public class MaxCounterMain {
    public static void main(String[] args) {
        MaxCounter maxcounter = new MaxCounter(3);
        maxcounter.increment();
        maxcounter.increment();
        maxcounter.increment();
        maxcounter.increment();

        int count = maxcounter.getCount();
        System.out.println(count);

    }
}
