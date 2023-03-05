package wo1261931780.stjavaWeb.history.aaa006jdbc20220618.mapper;

import com.stssm.github.io.javaweb.aaa006jdbc20220618.pojo.TbBrand0618;

import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa004JDBC2022年6月18日.mapper
 * Bbb010User: liujiajun_junw
 * Time: 2022-06-21-20  星期六
 *
 * @author liujiajun_junw
 */
public interface BrandMapper0618 {
	/**
	 * 展示结果
	 *
	 * @return
	 */
	List<TbBrand0618> showRes();

	/**
	 * 登录功能
	 *
	 * @param id
	 * @return
	 */
	TbBrand0618 selectById(int id);


}
