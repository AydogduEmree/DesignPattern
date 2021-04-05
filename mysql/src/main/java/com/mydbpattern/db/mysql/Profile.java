package com.mydbpattern.db.mysql;

import java.io.IOException;
import java.util.Properties;

public class Profile {
	public static Properties getProperties(String name) {
		Properties prop = new Properties();

		String env = System.getProperty("env");

		if (env == null) {
			env = "dev";
		}

		String propertiesFile = String.format("/config/%s.%s.properties",name, env);
											 // "/config/db."+env+ ".properties";
		try {
			prop.load(AppProperties.class.getResourceAsStream(propertiesFile));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("Can not load propertiesFile :" + propertiesFile);
			e1.printStackTrace();
		}
		
		return prop;
	}
}
