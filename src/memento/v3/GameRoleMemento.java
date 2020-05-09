package memento.v3;

public class GameRoleMemento {

	private int vit;
	private int atk;
	private int def;
	
	public GameRoleMemento(int vit, int atk, int def) {
		this.vit = vit;
		this.atk = atk;
		this.def = def;
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
