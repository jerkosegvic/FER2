package lab1;

public class Parser {
	public static void parse(String s , IntWordVisitor c) {
		int lastSpace = 0;
		for(int i = 0; i < s.length(); i++) {
			if( s.charAt(i) == ' ' || i == s.length() - 1) {
				boolean isInt = true;
				for(int j = lastSpace; j < i; j++) {
					if(s.charAt(j) > '9' || s.charAt(j) < '0') {
						isInt = false;
						break;
					}
				}
				///if(s.charAt(lastSpace) == '0')isInt = false;
				String stn; 
				if(i != s.length() - 1)stn = s.substring(lastSpace , i);
				else stn = s.substring(lastSpace);
				if(isInt) {
					c.foundInt(Integer.parseInt(stn));
				}
				else {
					c.foundWord(stn);
				}
				lastSpace = i + 1;
			}
		}
	}
}
