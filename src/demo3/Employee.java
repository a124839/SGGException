package demo3;

import java.util.Comparator;
import java.util.Date;

/**
 * @author k570
 * 一定要重写equals方法
 *
 */
public class Employee implements Comparator,Comparable{
	private String name;
	private Integer id;
	private MyDate birthday;
	
	public Employee(String name, Integer id, MyDate birthday) {
		super();
		this.name = name;
		this.id = id;
		this.birthday = birthday;
	}
	
	public Employee() {
		
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public MyDate getBirthday() {
		return birthday;
	}
	public void setBirthday(MyDate birthday) {
		this.birthday = birthday;
	}
	@Override
	public int compare(Object o1, Object o2) {
		if (o1 == o2) {
			return 0;
		}else {
			Employee employee = new Employee();
			
		}
		return 0;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 * 1.判断传入的参数类型是否为Employee类型
	 * 2.把形参o向下转型为Employee类型
	 * 3.return this。name（）.compareto方法；
	 */
	@Override
	public int compareTo(Object o) {
		if (o instanceof Employee) {
			Employee employee = (Employee) o;
			
			return this.getName().compareTo(employee.name);
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", birthday=" + birthday + "]";
	}
	
}
