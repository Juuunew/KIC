public class ArrayEx06_1110_7 {
    public static void main(String[] args) {
        // 다차원 배열(2차원)
        int[][] arr1;
        arr1 = new int[3][2]; // 3 X 2 (3행 2열)

        arr1[0][0] = 10;
        arr1[0][1] = 20;
        arr1[1][0] = 30;
        arr1[1][1] = 40;
        arr1[2][0] = 50;
        arr1[2][1] = 60;
        
        System.out.println( arr1[0][0] );
        System.out.println( arr1[2][1] );

        // 단계 줄이기
        int[][] arr2 = new int[][] { {10,20}, {30,40}, {50,60} };
        int[][] arr3 = { {10,20}, {30,40}, {50,60} };

        System.out.println( arr3 [0][0]);
        System.out.println( arr3 [2][1]);

        // for 문 돌리기
        System.out.println( arr1.length );  // 행에 대한 길이값만 출력됨
        System.out.println( arr1[0].length );  // 열에 대한 길이값 출력

        for( int row=0; row<arr1.length ; row++ ) {
            for( int col=0; col<arr1[row].length; col++ ) {
                System.out.print( arr1[row][col] + "\t" );
            }
            System.out.println();
        }

        // 향상된 for 문
        for ( int[] cols : arr1) {
            for(int data : cols ) {
            System.out.println( data );
            }
        }
        // 2차원 이상의 배열은 1차원 배열들의 결합
        System.out.println( arr1 );  
        System.out.println( arr1[0]);  
        System.out.println( arr1[0][0]);  
    }
}