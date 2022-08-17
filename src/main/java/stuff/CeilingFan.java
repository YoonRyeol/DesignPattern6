package stuff;

public class CeilingFan {
    public enum FanSpeed {
        OFF(0), LOW(1), MEDIUM(2), HIGH(3);

        private int speed;

        FanSpeed(int speed) {
            this.speed = speed;
        }

        public int getSpeed() {
            return this.speed;
        }
    }

    private String place;
    FanSpeed fanSpeed;

    public CeilingFan(String place) {
        this.place = place;
    }

    public FanSpeed getFanSpeed() {
        return fanSpeed;
    }

    public void off() {
        fanSpeed = FanSpeed.OFF;
        System.out.println(String.format("%s 선풍기가 꺼졌습니다.", place));
    }

    public void low() {
        fanSpeed = FanSpeed.LOW;
        printSpeed();
    }

    public void medium() {
        fanSpeed = FanSpeed.MEDIUM;
        printSpeed();
    }

    public void high() {
        fanSpeed = FanSpeed.HIGH;
        printSpeed();
    }

    private void printSpeed() {
        System.out.println(String.format("%s 선풍기의 속도가 %d로 설정되었습니다.", place, fanSpeed.getSpeed()));
    }

}
