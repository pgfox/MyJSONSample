package com.acme;

import java.io.IOException;
import java.io.StringWriter;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.acme.model.auto.Car;
import com.acme.model.auto.CarFactory;



public class GenerateJSON {

	public static void main( String[] args ) throws JsonGenerationException, JsonMappingException, IOException
    {
		StringWriter stringWriter = new StringWriter();
		
		Car car = CarFactory.createCar();
		
		ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally
		mapper.writeValue(stringWriter, car);
		
		System.out.println("The JSON for object is :"+stringWriter);
		
    }
	
}
