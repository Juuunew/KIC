class Constructor {
    // 없으면 컴파일러가 자동생성 - 기본생성자
    // public Constructor() {}
    Constructor() {
        System.out.println( "생성자 호출" );
    }
}


class Car {
    // 고정된 값 입력
    String name = "소나타";
    Car( String name ) {
        this.name = name;
    }
}
public class ConstructorEx01_1111_5 {
    public static void main(String[] args) {
        // Constructor()  - 생성자
        Constructor c = new Constructor();
        // 직접호출 불가능
        // c.Constructor();

        Car car = new Car( "그랜저" );
        System.out.println( car.name );
    }
}