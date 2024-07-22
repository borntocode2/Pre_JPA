package maxcounterex;

public class MaxCounter {
    private int max = 0;
    private int count = 0;

    public MaxCounter(int max){
        this.max = max;
}

public void increment() {
    if (max > count) {
        System.out.println("count를 증가합니다.");
        count += 1;
    }else{
        System.out.println("max값을 초과하였습니다.");
    }
}

public int getCount(){
    return count;
}



}


