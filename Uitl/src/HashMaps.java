import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author  王小红  E-mail:493026465@qq.com
 * @version 创建时间：2014年10月31日 上午9:48:40
 * 类说明
 */
public class HashMaps {
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("one", new Integer(111));
		map.put("two", new Integer(22));
		map.put("three", new Integer(3333));
		
		List<String> keyList = new ArrayList<String>(map.keySet());
		List<Integer> valueList = new ArrayList<Integer>(map.values());
		
		for(int i = 0; i < map.size(); i++){
			System.out.print("Key list element: " + keyList.get(i));
			System.out.println("\nValue list element: " + valueList.get(i));
			System.out.println();
			
		}
		
		
		
	}
	
	
}
