/**
 * @author  王小红  E-mail:493026465@qq.com
 * @version 创建时间：2014年11月6日 上午10:24:57
 * 类说明
 */
public class Statictest {
	static class user{
		static int s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		user.s=1;
		Statictest.user user = null;
		System.out.println(user.s);
	}

}
