package wo1261931780.stjavaWeb.history.aaa030javaweb20220729;


import java.util.List;

/**
 * @author liujiajun_junw
 */
public interface BrandService {

	/**
	 * 查询所有
	 *
	 * @return 结果list
	 */
	List<Brand> selectAll();

	/**
	 * 添加数据
	 *
	 * @param brand
	 */
	void add(Brand brand);


	/**
	 * 批量删除
	 *
	 * @param ids
	 */
	void deleteByIds(int[] ids);

	/**
	 * 分页查询
	 *
	 * @param currentPage 当前页码
	 * @param pageSize    每页展示条数
	 * @return
	 */
	// PageBean<Brand> selectByPage(int currentPage, int pageSize);

	/**
	 * 分页条件查询
	 *
	 * @param currentPage
	 * @param pageSize
	 * @param brand
	 * @return
	 */
	// PageBean<Brand> selectByPageAndCondition(int currentPage, int pageSize, Brand brand);


	/**
	 * 批量删除
	 *
	 * @param ids
	 * @return
	 */
	boolean delByIds(int[] ids);

	/**
	 * 查询所有
	 *
	 * @param page
	 * @param size
	 * @return brand类
	 */
	Page<Brand> selectAllData(int page, int size);


}
