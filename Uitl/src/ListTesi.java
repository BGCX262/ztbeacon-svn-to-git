import java.util.ArrayList;
import java.util.List;

/**
 * @author ��С�� E-mail:493026465@qq.com
 * @version ����ʱ�䣺2014��11��6�� ����10:48:15 ��˵��
 */
public class ListTesi {
	public static void main(String[] args) {
		List<Integer> i =new ArrayList<Integer>();
		i.add(1);
		i.add(2);
		i.add(3);
		i.add(4);
		i.add(5);
		System.out.println(i.get(0));
		i.remove(0);
		System.out.println(i.get(0));
		int is=3;
		while(true){
			if(is==0)
				break;
			is--;
			System.out.println(is);
		}
		System.out.println(Math.sqrt(9));
		System.out.println(Math.atan(0)*180/Math.PI);
		System.out.println(Math.tan(Math.PI/4));
	}
	
}
