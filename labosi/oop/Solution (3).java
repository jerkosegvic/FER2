package tomin_labos;

import java.util.function.Predicate;

class Solution{

    enum CaseOption {UPPERCASE, LOWERCASE}

    public static Predicate<String> allLettersMatch(CaseOption option){
        return new Predicate<String>() {
        	@Override
            public boolean test(String s) {
        		if(option == CaseOption.UPPERCASE) {
        			for(int i = 0; i < s.length(); i++) {
        				if(s.charAt(i) < 'A' || s.charAt(i) > 'Z')return false;
        			}
        		}
        		else if(option == CaseOption.LOWERCASE) {
        			for(int i = 0; i < s.length(); i++) {
        				if(s.charAt(i) < 'a' || s.charAt(i) > 'z')return false;
        			}
        		}
        		return true;
        	}
        };
    }

}
