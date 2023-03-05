package wo1261931780.stjavaWeb.history.aaa027javaweb20220726.service;

import com.stssm.github.io.javaweb.aaa027javaweb20220726.pojo.Bbb029TbBrand;

import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:brand-case
 * Package:com.itheima.service
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-20-19 星期二
 * @description
 * @return
 * @exception
 */
public interface Bbb031brandService {

	/**
	 * 查询所有数据
	 *
	 * @return
	 */
	List<Bbb029TbBrand> selectAll();

	/**
	 * 添加品牌
	 *
	 * @param brand
	 * @return
	 */
	Bbb029TbBrand addBrand(Bbb029TbBrand brand);
}
