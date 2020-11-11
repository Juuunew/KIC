public class AlphabetEx01_1110_1 {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++) {
            // 한 행을 출력
            String rowStr = "";
            for(int j=65; j<=64+i; j++ ){
                rowStr += ((char)j);
            }
            System.out.println( rowStr );
        }
    }
}