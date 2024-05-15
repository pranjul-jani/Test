package factory;

public class PhoneFactory {

    public Phone getDesiredPhone(String s) {
        if(s.equals("Fun to Use")) {
            return new Android();
        } else {
            return new Ios();
        }
    }
}
