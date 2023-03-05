package wo1261931780.stjavaWeb.history.aaa029javaweb20220728;

import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:brand-case
 * Package:com.itheima.pojo
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-21-58  星期四
 * @description
 * @return
 * @exception
 */
public class Page<T> {
	private int totalResultNumber;
	private List<T> listResult;

	public int getTotalResultNumber() {
		return totalResultNumber;
	}

	public void setTotalResultNumber(int totalResultNumber) {
		this.totalResultNumber = totalResultNumber;
	}

	public List<T> getListResult() {
		return listResult;
	}

	public void setListResult(List<T> listResult) {
		this.listResult = listResult;
	}
}
