package com.logfile;

import java.io.File;

import org.apache.log4j.*;

public class LogFile {

	static Logger logger = Logger.getLogger(LogFile.class);

	public static void main(String[] args) {
		/*
		 * File file = new File("log4j.properties"); String path =
		 * file.getAbsolutePath();// + File.separator + "Log4j.properties";
		 * System.out.println(path); String Log4jConfigFile = System.getProperty(path) +
		 * File.separator + "Log4j.properties"; System.out.println(Log4jConfigFile);
		 * PropertyConfigurator.configure(path); System.out.println("File path: " + new
		 * File("Log4j.properties").getAbsolutePath());
		 */
		LogFile lfile = new LogFile();

		try {
			lfile.divide();
		} catch (ArithmeticException ex) {
			logger.error("Error occured " + ex);
		}
	}

	@SuppressWarnings("unused")
	public void divide() {
		int i = 10 / 0;
	}
}
