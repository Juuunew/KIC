public class OperatorEx02 {
    public static void main(String[] args) {
        // 정수 / 정수 => 정수 => 몫만 표출 ( 소수점 이하가 없어짐 )
        System.out.println( 3 / 2);             // 1
        // 소수점 이하 까지 보는 방법 double or .
        System.out.println( 3 / (double)2 );    // 1.5
        System.out.println( 3 / 2. );           // 1.5
    }
}