package stuff;

public class Light {
    private String place;

    public Light(String place) {
        this.place = place;
    }

    public void on() {
        System.out.println(String.format("%s 조명이 켜졌습니다.", place));
    }

    public void off() {
        System.out.println(String.format("%s 조명이 꺼졌습니다.", place));
    }
}
