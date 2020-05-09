package bridge.v2;

/**
 * 桥接模式 -- 将抽象部分与它的实现部分分离，使它们可以独立变化
 * 实现系统可能有多角度分类，每一种分类都有可能变化，那么就让这多种角度分离出来让它们独自变化，减少它们之间的耦合
 * @author lchan
 * @date 2020年5月8日
 */
public class Client {

	public static void main(String[] args) {
		HandsetBrand hb;
		hb = new HandsetBrandM();
		
		hb.setHandsetSoft(new HandsetGame());
		hb.run();
		
		hb.setHandsetSoft(new HandsetAddress());
		hb.run();
	}
}
