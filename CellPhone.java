
public class CellPhone {
	
	private String manufact;
	private String model;
	private double retailPrice;
	
	
	// ARG Constructor
	
	public CellPhone(String man, String mod, double price){
		
		manufact = man;
		model = mod;
		retailPrice = price;
	}
	
	public void setManufacturer(String man){
		manufact = man;
	}
	public void setModel(String mod){
		model = mod;
	}
	public void setPrice(double price){
		retailPrice = price;
	}
	public String getManufacturer(){
		return manufact;
	}
	public String getModel(){
		return model;
	}
	public double getPrice(){
		return retailPrice;
	}
	

}
