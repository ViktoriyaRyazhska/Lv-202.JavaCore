enum Color {red, blue, yellow}

enum Type {rose, chamomile, tulip}

class Plant{
	private Type type;
	private Color color;
	private int size;
	public Plant(String type, String color, int size) throws TypeException, ColorException {
		Type t = typeStrToEnum(type); 
		Color c = colorStrToEnum(color);
		this.type = t;
		this.color = c;
		this.size = size;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String toString() {
		return "Plants [type=" + type + ", color=" + color + ", size=" + size + "]";
	}
	private static Type typeStrToEnum(String type) throws TypeException{
		switch (type) {
		case "rose" : return Type.rose;
		case "chamomile" : return Type.chamomile;
		case "tulip" : return Type.tulip;
		default : throw new TypeException("Input only type rose, chamomile or tulip");
				}
	}
	private static Color colorStrToEnum(String color) throws ColorException{
		switch (color) {
		case "red" : return Color.red;
		case "blue" : return Color.blue;
		case "yellow" : return Color.yellow;
		default : throw new ColorException("Input only color red, blue or yellow");
				}
	}
}

class ColorException extends Exception{
	   public ColorException(String arg0) {
	      super(arg0);
	   }
	}
class TypeException extends Exception{
	   public TypeException(String arg0) {
	      super(arg0);
	   }
	}

public class PT8_2 {

	public static void main(String[] args) {
		   try {
			      Plant pl = new Plant("rose", "blue", 5);
			      System.out.println(pl);
			   } catch (ColorException | TypeException e) {
			      System.err.println(e.getMessage() + "\n");
			      //e.printStackTrace();
			   }
	
	}

}
