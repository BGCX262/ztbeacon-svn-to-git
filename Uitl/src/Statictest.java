/**
 * @author  ��С��  E-mail:493026465@qq.com
 * @version ����ʱ�䣺2014��11��6�� ����10:24:57
 * ��˵��
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
