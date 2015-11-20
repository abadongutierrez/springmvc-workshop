package com.nearsoft.workshops.springmvc.web.formatter;

import com.nearsoft.workshops.springmvc.domain.SocialSecurityNumber;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.Formatter;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.text.ParseException;
import java.util.Locale;

public class SSNFormatter implements Formatter<SocialSecurityNumber> {

   public static final Logger LOGGER = LoggerFactory.getLogger(SSNFormatter.class);

   @Override
   public SocialSecurityNumber parse(String s, Locale locale)
         throws ParseException {
      throw new NotImplementedException();
   }

   @Override
   public String print(SocialSecurityNumber socialSecurityNumber, Locale locale) {
      throw new NotImplementedException();
   }
}
