package chain.v3;

import chain.v2.Request;

public abstract class Manager {

	protected String name;
	protected Manager superior;
	
	public Manager(String name) {
		this.name = name;
	}
	
	public void setManager(Manager superior) {
		this.superior = superior;
	}
	
	public abstract void request(Request request);
}
