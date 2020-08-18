package test;

import com.mashibing.etl.util.IPSeekerExt;
import com.mashibing.etl.util.IPSeekerExt.RegionInfo;


public class TestIPSeekerExt {
	public static void main(String[] args) {
		IPSeekerExt ipSeekerExt = new IPSeekerExt();
		RegionInfo info = ipSeekerExt.analyticIp("183.62.168.218");
		System.out.println(info);

//		List<String> ips = ipSeekerExt.getAllIp();
//		for (String ip : ips) {
//			System.out.println(ip + " --- " + ipSeekerExt.analyticIp(ip));
//		}
	}
}
