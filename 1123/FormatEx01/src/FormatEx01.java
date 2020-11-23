import java.text.DecimalFormat;

public class FormatEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println( df.format(num));
		
		df = new DecimalFormat("000000000.0");
		System.out.println( df.format(num));
		
	}

}
