/**
 * @author ��С�� E-mail:493026465@qq.com
 * @version ����ʱ�䣺2014��11��5�� ����1:06:01 ��˵��
 */
public class Hex {
	// ��ѡ�ַ�

	static final char digits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8',

	'9', 'A', 'B', 'C', 'D', 'E', 'F' };

	public static void main(String[] args) {
		int Num = 1;// Ҫת��������
		int length = 32;
		char[] result = new char[length];
		char[] finalresult = { '0', '0', '0', '0' };
		do {
			result[--length] = digits[Num & 15];
			Num >>>= 4;
		} while (Num != 0);
		for (int i = length, j = 3; i < result.length; i++, j--) {
			finalresult[j] = result[i];
		}
		String superfinalresult = new String(finalresult);

	}
}