import java.text.NumberFormat;
import java.util.Locale;


public class Module6_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getInstance(Locale.US);
		nf.setMaximumFractionDigits(4);
		nf.setMinimumFractionDigits(2);
		String a = nf.format(3.1415926);
		System.out.println(a);
		String b = nf.format(2);
		System.out.println(b);
		
		System.out.format("Pi is approximately %f", Math.PI);
		System.out.printf("E is approximately %b", Math.E);
			

	}

}
