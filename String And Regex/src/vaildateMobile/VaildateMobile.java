package vaildateMobile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VaildateMobile {
    private Pattern pattern;
    private final String MOBILE_REGEX="^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
    public VaildateMobile(){
        pattern=Pattern.compile(MOBILE_REGEX);
    }
    public boolean vaildate(String regex){
        Matcher matcher= pattern.matcher(regex);
        return matcher.matches();
    }
}
