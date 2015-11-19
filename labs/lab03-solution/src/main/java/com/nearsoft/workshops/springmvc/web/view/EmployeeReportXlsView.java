package com.nearsoft.workshops.springmvc.web.view;

import com.nearsoft.workshops.springmvc.domain.Employee;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

public class EmployeeReportXlsView extends AbstractXlsView {

   @Override
   protected void buildExcelDocument(Map<String, Object> map, Workbook workbook,
                                     HttpServletRequest httpServletRequest,
                                     HttpServletResponse httpServletResponse) throws Exception {
      Sheet sheet = workbook.createSheet("Employee Report");

      Row header = sheet.createRow(0);
      header.createCell(0).setCellValue("Name");
      header.createCell(1).setCellValue("Title");

      List<Employee> employees = (List<Employee>) map.get("employees");
      int rowNum = 1;
      for (Employee employee : employees) {
         Row row = sheet.createRow(rowNum++);
         row.createCell(0).setCellValue(employee.getName());
         row.createCell(1).setCellValue(employee.getTitle());
      }

      httpServletResponse.setHeader("Content-Disposition", "attachment; filename=\"employeeReport.xls\"");
   }
}
