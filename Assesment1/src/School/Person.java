package School;

abstract class Person {
	
	protected String nameIs;
	protected String addressIs;
	
	public Person(String name, String address) {
		nameIs = name;
		addressIs = address;
	}
	
	public String getName() {
		return nameIs;
	}
	
	public String getAddress() {
		return addressIs;
	}
	
	public void setAddress(String addressInput) {
		
		
	}
	
	public String toString() {
		return  nameIs +" ("+ addressIs + ") ";
	}
	
//	public void hello(String nameIs) {
//		System.out.println("Hello iam " + nameIs);
//	}
}
	
