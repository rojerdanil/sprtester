package com.project.tester;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFileTester {
	String filename;
	public PropertyFileTester(String filename)
	{
		this.filename=filename;
		
	}
	 public String getPropertyByName(String name) {

			Properties prop = new Properties();
			InputStream input = null;
			String value=null;
			/*String workingDir = System.getProperty("user.dir");
			System.out.println("Current working directory : " + workingDir);
*/
			try {

				input = new FileInputStream(filename);

				// load a properties file
				prop.load(input);

				// get the property value and print it out
				
				return prop.getProperty(name);

			} catch (IOException ex) {
				ex.printStackTrace();
			} finally {
				if (input != null) {
					try {
						input.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			return value;
}
}