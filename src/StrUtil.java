
public class StrUtil {
	
	public static void main(String[] args) {
		System.out.println(repeatStr("-", 3));
	}
	
	public static String repeatStr(String str, int n) {
		String str1 = "";
		for(int i=0; i<n; i++) {
			str1 += str;
		}
		return str1;
	}
}
