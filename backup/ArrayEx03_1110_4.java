public class ArrayEx03_1110_4 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30 };
        
        for( int i=0; i<arr.length ; i++ ){
            System.out.println( arr[i] );
            
        }

        // 향상된 for 문
        for( int data : arr) {
            System.out.println( data );
        }

        System.out.println( arr[0] );
        // 실행시 발생할 수 있는 Exception(예외) Error
        System.out.println( arr[3] );
    }
}