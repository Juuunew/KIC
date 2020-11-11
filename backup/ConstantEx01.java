public class ConstantEx01 {
    public static void main(String[] args) {
        // 변수
        int num = 10;
        num = 20;
        System.out.println( num );

        // 상수 ( 일반적으로 대문자로 선언, 연결은 _ )
        // error: cannot assign ( 값을 배정할 수 없음)
        final int C_NUM = 10;
        System.out.println( C_NUM );
        C_NUM = 20;
        System.out.println( C_NUM );

    }
}