package flyweight.v2;

import java.util.Hashtable;

public class WebSiteFactory {

	private Hashtable<String, WebSite> flyweights = new Hashtable<>(); //TODO  Hashtable HashMap???
	
	public WebSite getWebSite(String key) {
		if(!flyweights.containsKey(key)) {
			flyweights.put(key, new ConcreteWebSite(key));
		}
		return (WebSite) flyweights.get(key);
	}
	
	public int count() {
		return flyweights.size();
	}
}
