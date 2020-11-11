class Method {
    void dofunc1() {
        System.out.println( "dofunc1() 호출" );
    }

    void dofunc2(int data1) {
        System.out.println( "dofunc2() 호출 : " + data1 );
    }
    void dofunc3(int data1, int data2) {
        System.out.println( "dofunc3() 호출 : " + data1 );
        System.out.println( "dofunc3() 호출 : " + data2 );
    }

    // return의 자료형태
    // return이 없을 경우 void 처리
    int dofunc4(int data1, int data2 ) {
        int sum = data1 + data2;
        return sum;
    }
}

public class StudentEx02_1110_11 {
    public static void main(String[] args) {
        Method m = new Method();
        // 호출
        m.dofunc1();
        m.dofunc2( 10 );
        m.dofunc3( 10, 20 );

        int result = m.dofunc4( 100, 200 );
        System.out.println( "결과 : " + result  );
        System.out.println( "결과 : " + m.dofunc4( 200, 300 )  );

    }
}