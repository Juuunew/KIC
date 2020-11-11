public class Ex4 {
    public static void main(String[] args) {
        long var1 = 10;
        long var2 = 20L;
       // long var3 = 100000000000000000; // int타입의 저장범위를 넘어서는 정수 리터럴에 L을 붙이지 않아 에러가 난다.
        long var4 = 100000000000000000L;

        System.out.println(var1);
        System.out.println(var2);
       // System.out.println(var3);
        System.out.println(var4);
    }
}