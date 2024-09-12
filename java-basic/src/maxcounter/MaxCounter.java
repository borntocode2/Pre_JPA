package maxcounter;

public class MaxCounter {
    private int max;
    private int count;
    public MaxCounter(int max){
        this.max = max;
    }

    public void increment(){
        if (isVaildCount()){
            count += 1;
        }
    }

    private boolean isVaildCount(){
        if (count >= max){
            System.out.println("최대값을 초과할 수 없습니다.");
        }
        else{
            return true;
        }
        return false;
    }

    public int getCount(){
        return count;
    }




}
