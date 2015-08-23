/**
 * @author 王小红 E-mail:493026465@qq.com
 * @version 创建时间：2014年11月3日 下午3:41:51 类说明
 */
public class Diatance {
	protected static double calculateAccuracy(int txPower, double rssi) {
		if (rssi == 0) {
			return -1.0; // if we cannot determine accuracy, return -1.
		}

		double ratio = rssi * 1.0 / txPower;
		if (ratio < 1.0) {
			return Math.pow(ratio, 10);
		} else {
			double accuracy = (0.89976) * Math.pow(ratio, 7.7095) + 0.111;
			return accuracy;
		}
	}
	public static void main(String[] args) {
		System.out.println(calculateAccuracy(-65, -60));
	}
}
