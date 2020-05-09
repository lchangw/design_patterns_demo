package interpreter.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * 解释器模式 -- 给定一个语言，定义它的一种文法表示，并定义一个解释器，用来解释语言中的句子
 * 正则表达式
 * 
 * 如果一种特定类型的问题发生的频率比较高，那么可能就值得将该问题的各个实例表述为一些简单的句子。这样就可以构造一个解释器，通过解释这些句子，来解决该问题
 * 
 * 当有一个语言需要解释执行，并且可将该语言中的句子表示成一个抽象语法树时，可用解释器模式
 * 可以容易的改变和扩展文法，因为该模式使用类来表示文法规则；也可以容易的实现文法，因为定义抽象语法树的各个节点的类的实现大体相似
 * 
 * 不足：解释器为文法中每一条规则至少定义了一个类，因此包含许多规则的文法可能难以管理和维护；建议当文法非常复杂时，使用其他技术如语法分析程序或者编译生成器来处理
 * @author lchan
 * @date 2020年5月8日
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
