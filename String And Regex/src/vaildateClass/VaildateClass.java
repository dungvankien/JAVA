package vaildateClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VaildateClass {
    private static Pattern pattern;
    private static final String CLASS_REGEX="[CAP]\\d{4}[GHIKLM]";
    public VaildateClass(){
        pattern=Pattern.compile(CLASS_REGEX);
    }
    public boolean vaildate(String regex){
        Matcher matcher= pattern.matcher(regex);
        return matcher.matches();
    }
}
