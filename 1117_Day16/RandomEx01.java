import java.util.Random;

public class RandomEx01 {
    public static void main( String[] args ) {
        int[] selectNumber = new int[6];

        Random random = new Random();
        for( int i=0; i<6; i++ ) {
            selectNumber[i] = random.nextInt(45) + 1;
            System.out.print( selectNumber[i] + " " );
        }
        System.out.println();
    }
}