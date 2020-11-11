class Variable {
    // 전역
    // 멤버변수 - 자동초기화
    // 제어문(x)
    int data1;
    void dofunc() {
        // 지역
        // 지역변수 - 초기화해야지 사용가능
        // 제어문(o)

        int data2;
        data2 = 10;
        int data1 = 10;
        System.out.println( "data1 : " + data1 );
        // 자기참조
        System.out.println( "this.data1 : " + this.data1);
        System.out.println( "this : " + this);
        System.out.println( "data2 : " + data2 );
    }
}

public class VariableEx07_1110_16 {
    public static void main(String[] args) {
        Variable v = new Variable();
        v.dofunc();
        System.out.println( "v :" + v);
    }
}