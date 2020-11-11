public class CastingEx01 {
    public static void main(String[] args) {
    int intValue = 103029770;
    System.out.println( intValue );

    /*
    int intValue = 103029770;
    System.out.println( intValue );

    byte byteValue = intValiue;
    System.out.println( byteValue);
    */
    
    // 강제 형 변환
    byte byteValue= (byte) intValue;
    System.out.println( byteValue );
    }
}