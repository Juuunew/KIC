class Method {
    String doGugudan3(int ... dans) {
        String result = "";
        for( int dan : dans ) {
            for( int j=1; j<=9; j++) {
                result += dan + " X " + j + " = " + (dan * j ) + "\t";
            }
            result +="\n";
        }
        return result;
    }
}

public class GugudanEx02_1110_15 {
    public static void main(String[] args) {
        Method m = new Method();
        System.out.println( m.doGugudan3( 1, 3) );
    }
}


