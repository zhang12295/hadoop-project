package test;

import com.mashibing.etl.util.ip.IPSeeker;

public class TestIPSeeker {
	public static void main(String[] args) {
		IPSeeker ipSeeker = IPSeeker.getInstance();
		System.out.println(ipSeeker.getCountry("120.197.87.216"));
		System.out.println(ipSeeker.getCountry("183.62.168.218"));
	}
}
