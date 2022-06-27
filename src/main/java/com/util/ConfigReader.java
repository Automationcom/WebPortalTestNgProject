package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
private Properties prop;
//Thsi method is used to load the properties from config.properties file
// thsi returns Proprties prop object


public Properties inti_prop() {
	prop = new Properties();
	FileInputStream File;
	try {
		File = new FileInputStream("./src/test/resources/configPackage/congig.properties");
		prop.load(File);
		
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
		
	}
	return prop;
	
}

}
