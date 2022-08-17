package stuff;

public class Stereo {
    private String place;

    public Stereo(String place) {
        this.place = place;
    }

    public void on() {
        System.out.println(String.format("%s 오디오가 켜졌습니다.", place));
    }

    public void off() {
        System.out.println(String.format("%s 오디오가 꺼졌습니다.", place));
    }

    public void setCd() {
        System.out.println(String.format("%s 오디오에서 CD가 재생됩니다.", place));
    }

    public void setDvd() {
        System.out.println(String.format("%s 오디오에서 DVD가 재생됩니다.", place));
    }

    public void setRadio() {
        System.out.println(String.format("%s 오디오에서 라디오가 재생됩니다.", place));
    }

    public void setVolume(int volume) {
        System.out.println(String.format("%s 오디오의 볼륨이 %d로 설정되었습니다.", place, volume));
    }
}
