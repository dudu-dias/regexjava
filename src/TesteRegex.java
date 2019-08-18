import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TesteRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern pattern = Pattern.compile("(\\d\\d)(\\w)");
		Matcher matcher = pattern.matcher("11a22b33c");
		
				
		while(matcher.find()) {
			String match = matcher.group();
			String grupo1 = matcher.group(1);
			String grupo2 =matcher.group(2);
			System.out.printf("%s | %s | %s %n", match, grupo1, grupo2);
		}
		

	}

}
