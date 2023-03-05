package wo1261931780.stjavaWeb.history.aaa025javaweb20220724;

/**
 * Created by Intellij IDEA.
 * Project:ajax-demo
 * Package:com.itheima.web.servlet
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-10-56  星期日
 * @description
 * @return
 * @exception
 */
public class Bbb015brandPojo {
	private String name;
	private Integer age;
	private String address;

	public Bbb015brandPojo() {
	}

	public Bbb015brandPojo(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Bbb015brandPojo{" +
				       "name='" + name + '\'' +
				       ", age=" + age +
				       ", address='" + address + '\'' +
				       '}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
