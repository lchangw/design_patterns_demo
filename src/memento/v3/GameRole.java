package memento.v3;

public class GameRole {

	private int vit;
	private int atk;
	private int def;
	
	public GameRoleMemento saveState() {
		return new GameRoleMemento(vit, atk, def);
	}
	
	public void recoveryState(GameRoleMemento state) {
		this.vit = state.getVit();
		this.atk = state.getAtk();
		this.def = state.getDef();
	}
	
	public void dispaly() {
		System.out.println("��ɫ��ǰ״̬��");
		System.out.println("������" + vit);
		System.out.println("��������" + atk);
		System.out.println("��������" + def);
	}
	
	public void getInit() {
		vit = 100;
		atk = 100;
		def = 100;
	}
	
	public void clear() {
		vit = 0;
		atk = 0;
		def = 0;
	}
	
	public int getVit() {
		return vit;
	}
	public void setVit(int vit) {
		this.vit = vit;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	
}
