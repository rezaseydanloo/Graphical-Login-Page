package User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class email {

    public boolean chekemail(String emailString){


        Pattern emailpattern = Pattern.compile("^[a-zA-Z0-9]+@([a-zA-Z]+\\.)+[a-zA-Z]+$");
        Matcher emailmatcher = emailpattern.matcher(emailString);

        if (emailmatcher.matches()){
            return true;
        }
        else
            return false;

    }
}
