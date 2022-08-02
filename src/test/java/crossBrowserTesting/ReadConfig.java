package crossBrowserTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	public static Properties props;
	public void ReadConfig() throws IOException {
	
	FileInputStream fis=new FileInputStream("./data/config.properties");
	props=new Properties();
	props.load(fis);
	
	}
	
	public static String readUrl() {
		String url=props.getProperty("url");
		return url;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
