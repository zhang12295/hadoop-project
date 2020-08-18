package com.zhang.test;


import com.zhang.client.AnalyticsEngineSDK;

public class Test {
	public static void main(String[] args) {
		AnalyticsEngineSDK.onChargeSuccess("orderid123", "zhangsan");
		AnalyticsEngineSDK.onChargeRefund("orderid456", "lisi");
	}
}
