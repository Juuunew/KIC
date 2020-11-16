public class ProcessBuilderEx01 {
    public static void main(String[] args) throws Exception {
        ProcessBuilder processBuilder
            //= new ProcessBuilder( "C:\\Program Files\\Internet Explorer\\iexplore" );
            //= new ProcessBuilder( "C:\\Program Files\\Internet Explorer\\iexplore", "www.naver.com" );
            = new ProcessBuilder( "C:\\Windows\\System32\\mspaint.exe", "C:\\html\\Chrysanthemum.jpg" );
        processBuilder.start();
    }
}