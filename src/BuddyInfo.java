
public class BuddyInfo {
	
	private String name,address, number;
	
	

	
	public BuddyInfo(String name, String address, String number){
		this.name=name;
		this.address=address;
		this.number=number;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getNumber() {
		return number;
	}



	public void setNumber(String number) {
		this.number = number;
	}


	/*
	public static void main(String[] args){
		BuddyInfo b =  new BuddyInfo("Elia", "123 KDD", "42435");
		
		
		System.out.println("name is: "+ b.getName()); 
		
		
	}
	*/ 
	

}
