/**
 * @author 王小红 E-mail:493026465@qq.com
 * @version 创建时间：2014年11月7日 上午10:04:40 类说明
 */
public class Break {
	public static void main(String[] args) {
		for (int s = 0; s < 10; s++) {
			System.out.println(s);
			if (s == 5) {
				for (int i = 10; i < 20; i++) {
					System.out.println(i);
				}
				 break;
			}
		}
	}
}
