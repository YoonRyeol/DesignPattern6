package stuff;

public class TV {
    private String place;

    public TV(String place) {
        this.place = place;
    }

    public void on() {
        System.out.println(String.format("%s TV가 켜졌습니다.", place));
    }

    public void off() {
        System.out.println(String.format("%s TV가 꺼졌습니다.", place));
    }

}
