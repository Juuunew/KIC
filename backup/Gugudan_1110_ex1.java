class Util {
    /*
    void doGugudan1(int dan) {
        for( int i=1; i<=9; i++ ) {
            System.out.println( dan + " X " + i + " = " + (dan*i) );
        }
    }
    */
    // 메서드 안쪽 에서는 print - 
    String doGugudan2(int dan) {
        String result = "";
        for(int i = 1; i<=9; i++ ) {
            result += dan + " X " + i + " = " + (dan*i) + "\n";
        }
        return result;
    }
}

public class Gugudan_1110_ex1 {
    public static void main(String[] args) {
        Util u = new Util();
        u.doGugudan2(5);
        System.out.println( u.doGugudan2(5) );

    }
}


