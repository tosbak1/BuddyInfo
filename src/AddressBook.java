import java.util.ArrayList;


public class AddressBook {
	private ArrayList <BuddyInfo> buddyList;
	
	public AddressBook(){
		buddyList = new ArrayList<BuddyInfo>(); 
	}
	
	public void addBuddy(BuddyInfo b){
		if(b != null){
		buddyList.add(b);
		}
		
	}
	
	public void removeBuddy(int i){
		if (i>=0 && i<buddyList.size()){
			buddyList.remove(i);
			 
		}
	}
	
	//This is the main
	public static void main(String[] args){
		BuddyInfo b = new BuddyInfo("Bolt", "123 abc", "234");
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(b);
		addressBook.removeBuddy(0);
	}

}
