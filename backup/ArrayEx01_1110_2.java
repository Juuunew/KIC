public class ArrayEx01_1110_2 {
    public static void main(String[] args) {
        // 배열의 선언
        int[] arr1;
        int arr2[];

        // 배열의 생성
        arr1 = new int[3];

        // 초기화
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;

        System.out.println( arr1 ); // 참조값 ( cmd에 [I@15db9742 로 출력됨 )
        System.out.println( arr1[0] );
    }
}