package observer.v2;

public interface Subject {

	void add(Observer observer);
	void remove(Observer observer);
	void notifyObservers();
	String getAction();
	void setAction(String action);
}
