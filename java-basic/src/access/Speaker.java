package access;

public class Speaker {
    private int volume; //private이 붙으면 이 클래스 안에서만 volume에 접근할 수 있다.

    Speaker(int volume){
        this.volume = volume;
    }

    void VolumeUp(){

        if(volume >= 100) {
            System.out.println("스피커 볼륨은 100을 넘을 수 없습니다");

        }else{
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void VolumeDown(){
        volume -= 10;
        System.out.println("음량을 10 감소합니다.");
    }

    void ShowVolume(){

        System.out.println("현재 음량은: " + volume);

    }


}
