package com.example.stax.create;

import java.io.IOException;
import java.util.List;

import javax.xml.stream.XMLStreamException;

import com.example.dataprovider.DataProvider;
import com.example.model.Customer;
import com.example.utilities.Stopwatch;

public class CreateXMLWithStAX {

	public static void main(String[] args) throws XMLStreamException, IOException {

		List<Customer> data = DataProvider.getData(DataProvider.SMALL);
		Stopwatch watch = new Stopwatch().start("create xml with stax");
		StAXStreamCreator creator = new StAXStreamCreator();
		creator.createDocument(data, "./output/customers.xml");
		watch.stop();
		
	}
}
