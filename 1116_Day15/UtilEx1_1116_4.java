public class UtilEx1_1116_4 {
    public String capitalizeName(String strName ) {
        String[] Names = strName.split( " " );
               
        String result = "";
        for( String name : Names ) {
            result += name.substring(0, 1).toUpperCase()
                        + name.substring( 1 )+ " ";
        }
        return result.trim();
    }

}