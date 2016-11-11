package demo4;

public class ThreadDemo {
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.start();
		for (int i = 0; i < 100; i++) {
			System.out.println(i + "=====" +Thread.currentThread().getName());
			if (i == 10) {
				boolean b = d.isAlive();
				System.out.println(b);
				Thread.yield();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
class Demo1 extends Thread{
	public void run(){
		for (int i = 0; i < 100; i++) {
			System.out.println(i +"----" + Thread.currentThread().getName());
		}
	}
}