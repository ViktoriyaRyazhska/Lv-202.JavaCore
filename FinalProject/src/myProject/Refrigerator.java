package myProject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Refrigerator extends KitchenAppliances {

	protected Set<String> products = new HashSet<String>();

	public Refrigerator() {
	}

	public Refrigerator(String maker, String model, int year, double inputAmperage, double inputVoltage,
			boolean isTurned) {
		super(maker, model, year, inputAmperage, inputVoltage, isTurned);
	}
	
	public void getProducts() {
		System.out.println("I have in there:"+"\n");
		if (products.size() > 0) {
			for (String product : products) {
				System.out.println(product);
			}
		} else {
			System.out.println("... nothing");
		}
	}

	public void setProducts(String ... product) {
		for(int i =0; i<product.length; i++){
			products.add(product[i]);
		}
	}
	
	public void removeProduct(String remonedProduct){
		
		boolean isProduct = false;
		for(String product : products){
			if(remonedProduct.equalsIgnoreCase(product)){
				products.remove(product);
				isProduct = true;
			}
		} 
		if(!isProduct){
			System.out.println("There isn't this prodbct!");
		}
		
	}
	
	public void addToListOfProductsToFile() throws IOException{
		BufferedWriter writer  = new BufferedWriter(new FileWriter("src/myProject/ProductsList.txt"));
		writer.write("I have in there:"+"\n");
		if(products.size()>0){
			for(String s : products){
				writer.write(s+"\n");
			}
			System.out.println("Success!");
		}
		else{
			System.out.println("The Refrigerator is ampty!");
		}
		writer.close();
		
	}

	@Override
	public String toString() {
		return "Refrigerator [maker=" + maker + ", model=" + model + "]";
	}

}
