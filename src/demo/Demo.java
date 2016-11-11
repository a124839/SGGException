package demo;

public class Demo {
	public static void main(String[] args) {
		try {
			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);
			Def(i,j);
		} catch (NumberFormatException e) {
			System.out.println("�������Ͳ�һ��");
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ȱ�������в���");
		}catch (ArithmeticException e) {
			System.out.println("������Ϊ0��");
		}catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void Def(int i, int j)throws MyException {
		if (i < 0 || j < 0) {
			throw new MyException("����Ϊ����");
		}
		System.out.println(i/j);
	}
}
