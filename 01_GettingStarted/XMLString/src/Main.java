import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.example.dataprovider.DataProvider;


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String filename=DataProvider.DATADIR+"customers.xml";
		
		StringBuilder builder = new StringBuilder();
		FileReader reader = new FileReader(new File(filename));
		
		int content;
		while((content = reader.read())!=-1){
			builder.append((char)content);
		}
		reader.close();
		System.out.println(builder.toString());

	}

}
