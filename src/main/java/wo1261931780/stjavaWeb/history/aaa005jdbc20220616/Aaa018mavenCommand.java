package wo1261931780.stjavaWeb.history.aaa005jdbc20220616;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa004JDBC2022年6月16日
 * Bbb010User:  liujiajun_junw
 * Time:  2022-06-20-07  星期五
 * @author liujiajun_junw
 */
public class Aaa018mavenCommand {
	public static void main(String[] args) {
		// 我们配置阿里云的私服，实际上就是让maven从私服优先下载
		// maven下载文件，首先是本地，如果私服存在，就会去私服
		// 这个时候，如果私服还没有，才会去远程仓库下载
		// 我们在xml中的各种配置，实际上就是在配置私服的地址，方便我们进行依赖的下载
		// *********************************************************************
		// 常见的maven命令，第一个就是compiler
		// 首先会下载一个安装文件，然后进行编译的过程
		// 编译完毕，会在本地的target目录放那些class文件
		// clean也是同理，但主要是删除target目录
		// *********************************************************************
		// 我们使用比较多的是package命令
		// 简单来说，就是通过maven，将一个java项目打包为可以执行的jar包
		// 但是这个打包的不是java文件，而是class文件
		// *********************************************************************
		// 除了上面这些以外，还有一个test命令
		// 这个命令，主要是用来执行test包下面的java文件
		// 要求的是，在没有打包的时候执行这个操作
		// *********************************************************************
		// maven 的生命周期，
		// 在同一个生命周期内，执行后面的命令，前面的命令会自动执行
		// 比如install的时候，前面的clean，package命令都会执行一次
		// *********************************************************************
		// snapshot，快照，没有编写完毕的版本
		// 如果写完了,就是一个realise版
		// *********************************************************************
		// 一般来说,添加maven项目,需要手动添加pom文件,这样才能导入
	}
}
