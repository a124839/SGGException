package demo;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author k570
 * ����1.��ζ�ȡ�����ϵ���������
 * ����2.��β���ͬ���͵��쳣---����if����ж�
 * ����3.˼·
 * �Զ����쳣��Ҫʵ�����������������εĺͲ����ε�
 *
 */
public class EcmDef {
	public static void Def(double a,double b) throws MyException {
		double d;
		System.out.println("���������");
		System.out.println("�����뱻����");
		
		if (b == 0) {
			throw new MyException("������Ϊ0");
		}
		if (a < 0 ||b < 0) {
			throw new MyException("����Ϊ����");
		}
		
		d = a/b;

		
	}
	public static void main(String[] args) {
		EcmDef.Def(12, 6);
		
	}
}
