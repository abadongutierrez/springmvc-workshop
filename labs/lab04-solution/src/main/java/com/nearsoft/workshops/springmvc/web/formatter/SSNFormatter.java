package com.nearsoft.workshops.springmvc.web.formatter;

import com.nearsoft.workshops.springmvc.domain.SocialSecurityNumber;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class SSNFormatter implements Formatter<SocialSecurityNumber> {

   public static final Logger LOGGER = LoggerFactory.getLogger(SSNFormatter.class);

   @Override
   public SocialSecurityNumber parse(String s, Locale locale)
         throws ParseException {
      if (StringUtils.isBlank(s) || s.length() != 9) {
         throw new ParseException("SSN incorrect format", 0);
      }
      SocialSecurityNumber socialSecurityNumber = new SocialSecurityNumber();
      socialSecurityNumber.setAreaNumber(s.substring(0, 3));
      socialSecurityNumber.setGroupNumber(s.substring(3, 5));
      socialSecurityNumber.setSerialNumber(s.substring(5, 9));
      return socialSecurityNumber;
   }

   @Override
   public String print(SocialSecurityNumber socialSecurityNumber, Locale locale) {
      return socialSecurityNumber.getAreaNumber() +
            socialSecurityNumber.getGroupNumber() +
            socialSecurityNumber.getSerialNumber();
   }
}
