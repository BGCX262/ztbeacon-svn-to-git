/**
 * @author ��С�� E-mail:493026465@qq.com
 * @version ����ʱ�䣺2014��11��7�� ����10:04:40 ��˵��
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
