package benq.apps.formatter;

import benq.apps.databinding.PhoneNumber;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class PhoneFormatter implements Formatter<PhoneNumber> {
    @Override
    public PhoneNumber parse(String s, Locale locale) throws ParseException {
        String[] temp = s.split("-");
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setAreaCode(temp[0]);
        phoneNumber.setNumber(temp[1]);
        return phoneNumber;
    }

    @Override
    public String print(PhoneNumber phoneNumber, Locale locale) {
        //return phoneNumber.getAreaCode() + "-" + phoneNumber.getNumber();
        return null;
    }
}
