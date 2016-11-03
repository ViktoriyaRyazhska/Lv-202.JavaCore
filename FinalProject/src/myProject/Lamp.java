package myProject;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class Lamp extends RoomEquipment {
	

	protected TypeOfLamp typeOflump;

	public Lamp() {
	}

	public Lamp(String maker, String model, int year, double inputAmperage, double inputVoltage, boolean isTurned, String typeOflump) {
		super(maker, model, year, inputAmperage, inputVoltage, isTurned);
		if(typeOflump !=null){
			switch(typeOflump){
			case "Economic" : this.typeOflump = TypeOfLamp.ECONOMIC;
			break;
			
			case "Led" : this.typeOflump = TypeOfLamp.LED;
			break;
			
			case "Incandescent" : this.typeOflump = TypeOfLamp.INCANDESCENT;
			break;
			
			default : System.out.println("Invalid type of lamp!");
			break;
			}
		}
	}

	public TypeOfLamp getTypeOflump() {
		return typeOflump;
	}

	public void setTypeOflump(String typeOflump) {
		if(typeOflump !=null){
			switch(typeOflump){
			case "Economic" : this.typeOflump = TypeOfLamp.ECONOMIC;
			break;
			
			case "Led" : this.typeOflump = TypeOfLamp.LED;
			break;
			
			case "Incandescent" : this.typeOflump = TypeOfLamp.INCANDESCENT;
			break;
			
			default : System.out.println("Invalid type of lamp!");
			break;
			}
		}
	}
	
	 public void light() throws IOException {
		 File f = new File("src/myProject/1.txt");
		 BufferedReader reader = new BufferedReader(new FileReader(f));
		 String line;
		 while ((line = reader.readLine()) != null) System.out.println(line);
		reader.close();
	}  
	
	 @Override
		public String toString() {
			return "Lamp [maker=" + maker + ", model=" + model + "]";
		}
}
