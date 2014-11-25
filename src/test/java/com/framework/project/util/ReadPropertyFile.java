package com.framework.project.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
      public String fetchUrl() throws FileNotFoundException, IOException{
    	  Properties pro=new Properties();
    	  pro.load(new FileInputStream("src/test/resources/Data/my.properties"));
    	  String url=pro.getProperty("Url");
    	  return url;
      }
}