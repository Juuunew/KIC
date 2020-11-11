public class VariableEx03 {
    public static void main(String[] args) {
        // 문자 = char 로 처리
        char c1 = 'a';
        // '' = 문자(한글자) / "" = 문자열 (데이터 형태가 틀림)
        // char c2 = "a'";
        // char c2 = 'ab';
        char c2 = '한';
        // ASCII - 영어, 특수문자, 숫자, 글자는 코드값으로 처리
        // 대문자는 65부터 소문자는 97부터
        char c3 = 97 + 1;
        // unicode - 다국어 
        char c4 = '\uc790';
        System.out.println( c4 );

        // 이스케이프 코드
        // \n \t \' \"
        // \n = 엔터키

        char s1 = 'a';
        char s2 = '\t';
        char s3 = 'b';

        System.out.println( "" + s1 + s2 + s3 );
    }
}