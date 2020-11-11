class Method {
    // 가변인자 / 오버로딩
    void dofunc( int ... datas) {
        System.out.println( datas.length);

        for( int data : datas) {
            System.out.print( data + "\t");
        }
        System.out.println();
    }   
}

public class MethodEx03_1110_14 {
    public static void main(String[] args) {
        Method m = new Method();
        m.dofunc();
        m.dofunc( 10 );
        m.dofunc( 10, 20 );
    }
}