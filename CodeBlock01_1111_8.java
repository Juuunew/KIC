class CodeBlock {
    // 멤버필드의 초기화
    String name1;
    static String name2;
    {
        // 간접적으로 실행문 -> 생성자
        System.out.println( "인스턴스초기화 블럭" );
        this.name1 = "홍길동";
    }
    
    static {
        System.out.println( "클래스 초기화 블럭");
        CodeBlock.name2 = "박문수";
    }
}
public class CodeBlock01_1111_8 {
    public static void main(String[] args) {
        System.out.println( "시작" );
        CodeBlock cb = new CodeBlock();
        System.out.println( cb.name1 );
        System.out.println( CodeBlock.name2 );

        System.out.println( "끝" );
    }
}