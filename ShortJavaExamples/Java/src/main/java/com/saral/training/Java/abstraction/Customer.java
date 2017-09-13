package com.saral.training.Java.abstraction;

public class Customer implements CustomerApi {

	 String name;
	
	public Customer(String name) {
		this.name = name;
	}
	
	public Customer(Customer oldCustomer) {
		this.name = oldCustomer.name;
	}

	/* (non-Javadoc)
	 * @see com.training.abstraction.bean.CustomerApi#getName()
	 */
	public String getName() {
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see com.training.abstraction.bean.CustomerApi#toString()
	 */
	@Override
	public String toString() {
		return "Customer [name=" + name + "]";
	}
}
