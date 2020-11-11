class Variable {
    // 멤버변수 / 필드
    // instance 필드
    int data1 = 10;
    // static(클래스) 필드
    static int data2 = 10;

    void dofunc1() {
        System.out.println( "dofunc1() 호출" );
        System.out.println( this.data1 );
        System.out.println( this.data2 );
    }

    static void dofunc2(){
        System.out.println( "dofunc2() 호출" );
        // this(x)
        //System.out.println( data1 );
        System.out.println( Variable.data2 );
        
    }
}

public class VariableEx09_1110_18 {
    public static void main(String[] args) {
        Variable v = new Variable();
        System.out.println( v.data1 );
        System.out.println( v.data2 );

        System.out.println( Variable.data2 );

        v.dofunc1();
        v.dofunc2();

        Variable.dofunc2();
    }
}