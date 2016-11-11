package demo3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestMain {

	public static void main(String[] args) {
		TreeSet eSet = new TreeSet();
		Employee employee1 =new Employee("aa",10,new MyDate(12,12,1992));
		Employee employee2 =new Employee("dd",10,new MyDate(10,10,1990));
		Employee employee3 =new Employee("gg",10,new MyDate(9,9,1999));
		Employee employee4 =new Employee("yy",10,new MyDate(8,8,1998));
		Employee employee5 =new Employee("nn",10,new MyDate(7,7,1992));
//		Employee employee6 =new Employee("nn",1,new MyDate(7,7,1992));
		eSet.add(employee1);
		eSet.add(employee2);
		eSet.add(employee3);
		eSet.add(employee4);
		eSet.add(employee5);
//		eSet.add(employee6);
		System.out.println(eSet.toString());
		Iterator iterator = eSet.iterator();//把set类型转换为iterator类型
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		//1.新建一个comparator对象并重写compare方法
		Comparator comparator = new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				if (o1 instanceof Employee1 && o2 instanceof Employee1) {
					Employee1 employee11 = (Employee1) o1;
					Employee1 employee12 = (Employee1) o2;
					MyDate i1 = employee11.getBirthday();
					MyDate i2 = employee12.getBirthday();
					if (i1 != i2) {
						return i1.getYear()-i2.getYear();
					}else{
						if (i1.getMonth() != i2.getMonth()) {
							return i1.getMonth() - i2.getMonth();
						}else {
							return i1.getDay()-i2.getDay();
						}
					}
				}
				return 0;
			}
		};
		//2.把对象传入Tree Set中
		TreeSet treeSet = new TreeSet(comparator);
		Employee1 employee101 =new Employee1("aa",10,new MyDate(12,12,1992));
		Employee1 employee102 =new Employee1("dd",10,new MyDate(10,10,1990));
		Employee1 employee103 =new Employee1("gg",10,new MyDate(9,9,1999));
		Employee1 employee104 =new Employee1("yy",10,new MyDate(8,8,1998));
		Employee1 employee105 =new Employee1("nn",10,new MyDate(7,7,1992));
		treeSet.add(employee105);
		treeSet.add(employee104);
		treeSet.add(employee103);
		treeSet.add(employee102);
		treeSet.add(employee101);
		System.out.println();
		System.out.println();
		Iterator iterator2 = treeSet.iterator();
		while (iterator2.hasNext()) {
			Object object = (Object) iterator2.next();
			System.out.println(object);
		}
	}

}
