package memento.v1;

public class GameRole {

	private int vit;
	private int atk;
	private int def;
	
	public void dispaly() {
		System.out.println("角色当前状态：");
		System.out.println("体力：" + vit);
		System.out.println("攻击力：" + atk);
		System.out.println("防御力：" + def);
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
