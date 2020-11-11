class Method {
    // 메서드 오버로딩(overloading)
    void dofunc1(double data1, int data2) {
    //void dofunc1() {
        System.out.println( "dofunc1() 호출 1" );

    }

    //void dofunc1() {
        void dofunc1(int data1, double data2) {
        System.out.println( "dofunc1() 호출 2");

    }
}

public class MethodEx02_1110_12 { 
    public static void main(String[] args) {
        Method m = new Method();
        m.dofunc1(10.5, 10);
        m.dofunc1(10, 10.5);
    }
}