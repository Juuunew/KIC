// 배열의 복사
public class SystemEx03 {
    public static void main(String[] args) {
        int[] src = { 1, 2, 3, 4, 5 };
        // 초기화 안하고 선언만
        int[] dest1 = null;

        // shadow copy
        dest1 = src;
        System.out.println( src[0] );
        System.out.println( dest1[0] );

        dest1[0] = 10;
        System.out.println( src[0] );
        System.out.println( dest1[0] );

        // deep copy ( 값 복사 )
        int[] dest2 = {0, 0, 0, 0, 0};
        System.arraycopy( src, 0, dest2, 0, src.length );

        dest2[0] = 20;
        System.out.println( src[0] );
        System.out.println( dest2[0] );
    }
}