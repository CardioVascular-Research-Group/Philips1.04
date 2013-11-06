package org.cvrgrid.philips;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.bind.JAXBException;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (String arg : args) {
			File input = new File(arg);
			try {
				SierraEcgFiles.preprocess(input, new File(input.getCanonicalPath() + ".decoded.xml"));
			} catch (FileNotFoundException e) {
				System.out.println("No such file: " + input);
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error reading file: " + input);
				e.printStackTrace();
			} catch (JAXBException e) {
				System.out.println("Error reading/writing XML: " + input);
				e.printStackTrace();
			}
		}
	}
}