package com.learn.structural.facade;

import java.sql.Connection;

public class TestFacade {

	public static void main(String[] args) {
		String tableName="Employee";
		
		//generating MySql HTML report and Oracle PDF report without using Facade
		Connection con = MySqlHelper.getMySqlDBConnection();
		MySqlHelper mySqlHelper = new MySqlHelper();
		mySqlHelper.generateMySqlHTMLReport(tableName, con);
		
		Connection con1 = OracleHelper.getOracleDBConnection();
		OracleHelper oracleHelper = new OracleHelper();
		oracleHelper.generateOraclePDFReport(tableName, con1);
		
		//generating MySql HTML report and Oracle PDF report using Facade
		Facade.generateReport(Facade.DBTypes.MYSQL, Facade.ReportTypes.HTML, tableName);
		Facade.generateReport(Facade.DBTypes.ORACLE,Facade.ReportTypes.PDF, tableName);
	}

}