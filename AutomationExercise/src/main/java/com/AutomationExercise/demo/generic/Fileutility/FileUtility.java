package com.AutomationExercise.demo.generic.Fileutility;

import java.io.File;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
	public String getDataFromProperties(String key) throws Throwable{
		FileInputStream fi=new FileInputStream("./src/main/resources/Testdata/commondataAE.properties");
		Properties p=new Properties();
		p.load(fi);
		String data=p.getProperty(key);
		return data;
	}
	

}
