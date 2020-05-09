package decorator.v2;

import decorator.v1.Person;

/**
 * װ����ģʽ -- ��̬�ĸ�һ���������һЩ����Ĺ��ܣ�������������
 * ��װҪװ�εĶ��󣬰���ĺ���ְ���װ�ι������ֿ���
 * ����˵����װ����ģʽ�ʹ���ģʽ���������������
 * װ����ģʽ������һЩֻ��ĳ���ض�����²Ż�ִ�е�������Ϊ����Ҫ����ÿ��Ҫװ�εĹ��ܷ��ڵ��������У�����������װ��Ҫװ�εĶ���
 * ����Ҫִ��������Ϊʱ���Ϳ���������ʱ������Ҫ��ѡ��ء���˳���ʹ�ð�װ���ܰ�װ�����ˡ�
 * @author lchan
 * @date 2020��5��4��
 */
public class Client {	
	
	public static void main(String[] args) {
		Person person = new Person("С��");
		System.out.println("��һ��װ�磺");
		
		TShirtsDecorator shirt = new TShirtsDecorator();
		BigTrouserDecorator trouser = new BigTrouserDecorator();
		SneakersDecorator sneaker = new SneakersDecorator();
		
		shirt.decorate(person);
		trouser.decorate(shirt);
		sneaker.decorate(trouser);
		sneaker.show();
		
		System.out.println("�ڶ���װ�磺");
		
		SuitsDecorator suit = new SuitsDecorator();
		TiesDecorator tie = new TiesDecorator();
		LeatherShoesDecorator shoe = new LeatherShoesDecorator();
		
		shoe.decorate(person);
		tie.decorate(shoe); //С�Ĳ�Ҫ�Լ�װ���Լ�������������ѭ��
		suit.decorate(tie); //ע��˳��Խ��װ�ε�Խ��չʾ
		suit.show();
	}

}
