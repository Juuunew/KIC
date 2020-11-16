public class BoxingUnBoingEx01 {
    public static void main(String[] args) {
        // Boxing
        Integer obj1 = new Integer( 100 );
        Integer obj2 = new Integer( "200" );
        Integer obj3 = Integer.valueOf( "300" );

        // Unboxing

        int value1 = obj1.intValue();
        int value2 = obj2.intValue();
        int value3 = obj3.intValue();

        System.out.println(vlaue1);
        System.out.println(vlaue2);
        System.out.println(vlaue3);
    }
}