interface RemoteControl {
    // 상수
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 추상 메소드
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    // 디폴트 메소드
    default void setMute(boolean mute) {
        if(mute) {
            System.out.println( "무음 처리합니다." );
        } else {
            System.out.println( "무음 해제합니다." );
        }
    }

    // 정적 메소드
    static void changeBattery() {
        System.out.println( "건전지를 교환합니다." );
    }
}

class Television implements RemoteControl {
    // 필드
    private int volume;

    // turnOn() 추상 메소드의 실체 메소드
    public void turnOn() {
        System.out.println( "TV를 켭니다." );
    }
    // turnOff() 추상 메소드의 실체 메소드
    public void turnOff() {
        System.out.println( "TV를 끕니다." );
    }
    // setVolume() 추상 메소드의 실체 메소드
    public void setVolume(int volume) {
        if(volume>RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if(volume<RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println( "현재 TV 볼륨 : " + this.volume );
    }
}

class Audio implements RemoteControl {
    //  필드
    private int volume;

    // turnOn() 추상 메소드의 실체 ㅔ소드
    public void turnOn() {
        System.out.println( "Audio를 켭니다." );
    }

    // turnOff() 추상 메소드의 실체 메소드
    public void turnOff() {
        System.out.println( "Audio를 끕니다." );
    }

    // setVolume() 추상 메소드의 실체 메소드
    public void setVolume(int volume) {
        if(volume>RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if(volume<RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println( "현재 Audio 볼륨 : " + this.volume);
    }
}

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
        rc = new Audio();
    }
}