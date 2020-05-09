package memento.v3;

public class Client {

	public static void main(String[] args) {
		GameRole gm = new GameRole();
		gm.getInit();
		gm.dispaly();
		
		RoleStateCareTaker taker = new RoleStateCareTaker();
		taker.setMemento(gm.saveState()) ;
		
		gm.clear();
		gm.dispaly();
		
		gm.recoveryState(taker.getMemento());
		gm.dispaly();
	}

}
