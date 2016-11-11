package demo5;

public class StringDemo {
	public static void main(String[] args) {
		String str = " ads df ";
		String str1 = trim(str);
		System.out.println(str1);
		String str2 = "asdfsggh";
		String str3 = reverseString(str2, 2, 5);
		System.out.println(str3);
	}
	public static String trim(String str) {
		int len = str.length();
		int start = 0;
		int end = str.length() - 1;
		while (str.charAt(start) == ' ' && start < end) {
			start++;
			
		}
		while (str.charAt(end) == ' ' && start < end) {
			end--;
		}
		
		return str.substring(start, end + 1);
	}
	public static String reverseString(String str,int start,int end) {
		char[] c = str.toCharArray();
		return reverseChar(c, start, end);
		
	}
	public static String reverseChar(char[] c,int start,int end) {
		for (int i = start,j = end; i < j; i++,j--) {
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;
		}
		//字符数组转化为字符串，使用String的构造器
		return new String(c);
	}
}
