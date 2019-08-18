import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrocaData {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("(\\d{4})(-)(\\d{2})(-)(\\d{2})");
		Matcher matcher = pattern.matcher("2007-12-31");
		if(matcher.matches()) {
			String ano = matcher.group(1);
			String mes = matcher.group(3);
			String dia = matcher.group(5);
			String sep1 = matcher.group(2);
			String sep2 = matcher.group(4);
			String sep3 = sep1.replaceAll("-", "/");
			String sep4 = sep2.replaceAll("-", "/");
			System.out.println(dia + sep3 + mes + sep4 + ano);
		}
		
	}

}
