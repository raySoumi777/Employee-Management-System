package Emp;

import java.util.HashMap;

import javax.swing.JTree;

public class EmployeeRepository implements BaseReository {

	private StorageRepository repository;

	   public EmployeeRepository(StorageRepository repository){
	        this.repository=repository;
	    }
		public StorageRepository getRepository(){
			return repository;
		}
	

	 @Override
		public void store(HashMap<String,HashMap> company) {

	        if (company == null ) {
	            System.out.println("no dettils here");
	        }
	        else {
	        	 repository.store(company);
	 	        System.out.println("Stored successfully in file");
	        }
	    }
	 
	

}
