package composite.v1;

/**
 * 组合模式 -- 将对象组合成树形结构以展示“部分-整体”的层次结构，使得用户对单个对象和组合对象的使用具有一致性
 * @author lchan
 * @date 2020年5月7日
 */
public class Client {

	public static void main(String[] args) {
		Composite root = new Composite("root");
		root.add(new Leaf("Leaf A"));
		root.add(new Leaf("Leaf B"));
		
		Composite comp = new Composite("X");
		comp.add(new Leaf("Leaf XA"));
		comp.add(new Leaf("Leaf XB"));
		
		root.add(comp);
		
		Composite comp2 = new Composite("XY");
		comp2.add(new Leaf("Leaf XYA"));
		comp2.add(new Leaf("Leaf XYB"));
		
		comp.add(comp2);
		
		root.add(new Leaf("Leaf C"));
		
		root.display(0);
	}

}
