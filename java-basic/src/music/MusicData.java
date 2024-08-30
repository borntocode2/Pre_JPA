package music;

//하나의 클래스안에 데이터와 메서드가 뭉쳐져 있는 것을 외부에 제공하는 것 -> 캡슐화
public class MusicData {
    int volume;
    boolean isOn = false;

    void on(){
        isOn = true;
        System.out.println("MusicPlayer is ON");
    }

    void off(MusicData data){
        isOn = false;
        System.out.println("MusicPlayer is OFF");
    }

    void volumeUp(){
        volume++;
        System.out.println("MusicPlayer's 1 volume up ");
    }

    void volumeDown(){
        volume--;
        System.out.println("MusicPlayer's 1 volume Down ");
    }
    void showStatus(){
        System.out.println("MusicPlayer volume is" + volume );
        System.out.println("MusicPlayer status is" + isOn );
    }
}
