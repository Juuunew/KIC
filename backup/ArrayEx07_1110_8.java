public class ArrayEx07_1110_8 {
    public static void main(String[] args) {
        int[][] arrs = new int[3][];
        // 가변배열 열의 갯수가 다른 행으로 생성
        arrs[0] = new int[3];
        arrs[1] = new int[2];
        arrs[2] = new int[1];

        for( int row=0 ; row<arrs.length; row++ ) {
            System.out.println( arrs[row].length );
        }

        int[][] arrs2 = { {10, 20, 30}, { 40, 50 }, { 60 } };

        // 향상된 for문으로 출력하기
        for( int[] rows : arrs2) {
            for( int data : rows) {
                System.out.println( data );
            }
        }
    }
}
    