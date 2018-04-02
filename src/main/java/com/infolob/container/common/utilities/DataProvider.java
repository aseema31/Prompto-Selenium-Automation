package main.java.com.infolob.container.common.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

import javax.xml.crypto.Data;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import main.java.com.infolob.container.bean.PlanBean;

public class DataProvider {
	private PlanBean bean;
	public  PlanBean getNewPlanDataObject(String dataExcel,int index)
	{
		this.bean = new PlanBean();
		fillPlanBean(dataExcel, index, this.bean);
		return this.bean;
	}

	public static void main(String...strings )
	{
		DataProvider dataProvider = new DataProvider();
		dataProvider.getNewPlanDataObject("C:\\Girish_Demo\\PromptoTestData.xlsx", 0);
	}
	private void fillPlanBean(String dataExcel,int index,PlanBean bean)
	{
		InputStream fIS;
		int rowIndex=0;
		try {
			fIS = new FileInputStream(dataExcel);
			XSSFWorkbook workbook1 = new XSSFWorkbook(fIS);
			XSSFSheet sheet = workbook1.getSheetAt(index);
			Random random = new Random();
			int num = random.nextInt(1000);
			String planName = sheet.getRow(rowIndex).getCell(0).getStringCellValue();
			System.out.println(planName+num);
			bean.setPlanName(planName+num);
			String planDescription = sheet.getRow(rowIndex).getCell(1).getStringCellValue();
			System.out.println(planDescription+num);
			bean.setPlanDescription(planDescription+num);
			int planAmount = Integer.valueOf(sheet.getRow(rowIndex).getCell(2).getRawValue());
			bean.setPlanAmount(Integer.toString(planAmount));
			int planDiscount = Integer.valueOf(sheet.getRow(rowIndex).getCell(3).getRawValue());
			bean.setPlanDiscount(Integer.toString(planDiscount));
			int recurring = Integer.valueOf(sheet.getRow(rowIndex).getCell(4).getRawValue());
			bean.setRecurring(recurring);
			int recurringTerm = Integer.valueOf(sheet.getRow(rowIndex).getCell(5).getRawValue());
			bean.setRecurringTerm(Integer.toString(recurringTerm));
			int recurringTermUnit = Integer.valueOf(sheet.getRow(rowIndex).getCell(6).getRawValue());
			bean.setRecurringTermUnit(recurringTermUnit);
			String gracePeriod = sheet.getRow(rowIndex).getCell(7).getRawValue().toString();
			bean.setGracePeriod(gracePeriod);
			int gracePeriodUnit = Integer.valueOf(sheet.getRow(rowIndex).getCell(6).getRawValue());
			bean.setGracePeriodUnit(gracePeriodUnit);
			bean.print();
			workbook1.close();
			fIS.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
