class Car {
    String serial;    
    String name;
    
    // this, this() 차이 구분할 것!
    Car( ) {
       // this.serial = "0000";
       // this.name = "소나타";
       // 생성자는 직접호출이 불가하므로 Car( ) 대신 this( ) 로 쓴다.
       // 위에 주석 이외엔 아무것도 올 수 없다.
       this( "0000", "소나타" );

    }
    Car( String name ) { 
       // this.serial = "0001";
       // this.name = name;
       this( "0001", name );
    }
    Car( String serial, String name ) { 
        this.serial = serial;
        this.name = name;
    }
}
public class ConstructorEx03_1111_7 {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println( car1.name );

        Car car2 = new Car( "그랜저" );
        System.out.println( car2.name );

        Car car3 = new Car( "0002", "아반테" );
        System.out.println( car3.name );
    }
}