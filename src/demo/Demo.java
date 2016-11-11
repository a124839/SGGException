package demo;

public class Demo {
	public static void main(String[] args) {
		try {
			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);
			Def(i,j);
		} catch (NumberFormatException e) {
			System.out.println("数据类型不一致");
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("缺少命令行参数");
		}catch (ArithmeticException e) {
			System.out.println("被除数为0了");
		}catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void Def(int i, int j)throws MyException {
		if (i < 0 || j < 0) {
			throw new MyException("不能为负数");
		}
		System.out.println(i/j);
	}
}
