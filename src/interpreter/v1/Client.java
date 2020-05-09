package interpreter.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * ������ģʽ -- ����һ�����ԣ���������һ���ķ���ʾ��������һ�����������������������еľ���
 * ������ʽ
 * 
 * ���һ���ض����͵����ⷢ����Ƶ�ʱȽϸߣ���ô���ܾ�ֵ�ý�������ĸ���ʵ������ΪһЩ�򵥵ľ��ӡ������Ϳ��Թ���һ����������ͨ��������Щ���ӣ������������
 * 
 * ����һ��������Ҫ����ִ�У����ҿɽ��������еľ��ӱ�ʾ��һ�������﷨��ʱ�����ý�����ģʽ
 * �������׵ĸı����չ�ķ�����Ϊ��ģʽʹ��������ʾ�ķ�����Ҳ�������׵�ʵ���ķ�����Ϊ��������﷨���ĸ����ڵ�����ʵ�ִ�������
 * 
 * ���㣺������Ϊ�ķ���ÿһ���������ٶ�����һ���࣬��˰�����������ķ��������Թ����ά�������鵱�ķ��ǳ�����ʱ��ʹ�������������﷨����������߱���������������
 * @author lchan
 * @date 2020��5��8��
 */
public class Client {

	public static void main(String[] args) {
		Context context = new Context();
		List<Expression> list = new ArrayList<>();
		list.add(new TerminalExpression());
		list.add(new NonTerminalExpression());
		list.add(new TerminalExpression());
		
		for(Expression e : list) {
			e.interpret(context);
		}
	}

}
