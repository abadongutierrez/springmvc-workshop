package com.nearsoft.workshops.springmvc.web.view;

import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Map;

public class MyTxtView implements View {
   @Override
   public String getContentType() {
      return "text/plain";
   }

   @Override
   public void render(Map<String, ?> map, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
      StringBuilder stringBuilder = new StringBuilder();
      for (Map.Entry<String, ?> stringEntry : map.entrySet()) {
         stringBuilder.append(stringEntry).append("\n");
      }
      PrintWriter writer = httpServletResponse.getWriter();
      writer.append(stringBuilder.toString());
      writer.close();
   }
}
