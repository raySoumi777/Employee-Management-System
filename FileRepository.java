package Emp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

class FileRepository implements StorageRepository{
	@Override
	public void store(HashMap<String,HashMap> company){

		try {

			FileOutputStream fileOut = new FileOutputStream("new.txt");


			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);


			objectOut.writeObject(company);

			objectOut.close();
			System.out.println("Stored successfully");

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}