package demo;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author k570
 * 问题1.如何读取键盘上的两个参数
 * 问题2.如何捕获不同类型的异常---》用if语句判断
 * 问题3.思路
 * 自定义异常类要实现两个构造器，带参的和不带参的
 *
 */
public class EcmDef {
	public static void Def(double a,double b) throws MyException {
		double d;
		System.out.println("请输入除数");
		System.out.println("请输入被除数");
		
		if (b == 0) {
			throw new MyException("被除数为0");
		}
		if (a < 0 ||b < 0) {
			throw new MyException("不能为负数");
		}
		
		d = a/b;

		
	}
	public static void main(String[] args) {
		EcmDef.Def(12, 6);
		
	}
}
