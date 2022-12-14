package com.mrprk;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		// To read the json data from file as array
		ObjectMapper objectMapper = new ObjectMapper();
		Student[] student = objectMapper.readValue(new File(
				"\\Users\\ATIM\\Desktop\\GSPL\\json-data-java-binding-class2\\src\\main\\resources\\studentRead.json"),
				Student[].class);

		// convert to list
		List<Student> std = Arrays.asList(objectMapper.readValue(new File(
				"\\Users\\ATIM\\Desktop\\GSPL\\json-data-java-binding-class2\\src\\main\\resources\\studentRead.json"),
				Student[].class));

		System.out.println(std);

		for (Student s : student) {
			System.out.println(s);
		}

		// To write the data
		ObjectMapper objectMaper1 = new ObjectMapper();
		objectMaper1.enable(SerializationFeature.INDENT_OUTPUT);
		Student student1 = new Student();
		student1.setName("Anil");
		student1.setAddress("Indore");
		objectMaper1.writeValue(new File(
				"\\Users\\ATIM\\Desktop\\GSPL\\json-data-java-binding-class2\\src\\main\\resources\\studentWrite.json"),
				student1);

	}
}
