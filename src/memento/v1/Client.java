package memento.v1;

public class Client {

	public static void main(String[] args) {
		GameRole gm = new GameRole();
		gm.getInit();
		gm.dispaly();
		
		GameRole backup = new GameRole();
		backup.setVit(gm.getVit());
		backup.setAtk(gm.getAtk());
		backup.setDef(gm.getDef());
		
		gm.clear();
		gm.dispaly();
		
		gm.setVit(backup.getVit());
		gm.setAtk(backup.getAtk());
		gm.setDef(backup.getDef());
		gm.dispaly();
	}

}
