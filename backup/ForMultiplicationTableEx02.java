public class ForMultiplicationTableEx02 {
    public static void main(String[] args){
        for ( int dan=1; dan<=9; dan++ ) {
            for( int col=1; col<=9; col++ ) {
                System.out.print(dan + "x" + col + "=" + (dan*col) + "\t");
            }
            System.out.println();
        }      
    }
}