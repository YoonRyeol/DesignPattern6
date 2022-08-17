package stuff;

public class GarageDoor {
    private String place;

    public GarageDoor(String place) {
        this.place = place;
    }

    public void up() {
        System.out.println(String.format("%s 차고 문이 열렸습니다.", place));
    }

    public void down() {
        System.out.println(String.format("%s 차고 문이 닫혔습니다.", place));
    }

    public void stop() {
        System.out.println(String.format("%s 차고 문이 멈췄습니다.", place));
    }

    public void lightOn() {
        System.out.println(String.format("%s 차고 조명이 켜졌습니다.", place));
    }

    public void lightOff() {
        System.out.println(String.format("%s 차고 문이 닫혔습니다.", place));
    }
}
