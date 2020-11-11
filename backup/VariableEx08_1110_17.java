class Variable {
    int data = 10;

    void dofunc1() {
        System.out.println( "dofunc1() 호출" );
        System.out.println( "data1 : " + this.data );
        this.dofunc2();
    }

    void dofunc2() {
        System.out.println( "dofunc2() 호출");
    }
}

public class VariableEx08_1110_17 {
    public static void main(String[] args) {
        Variable v = new Variable();
        v.dofunc1();
    }
}