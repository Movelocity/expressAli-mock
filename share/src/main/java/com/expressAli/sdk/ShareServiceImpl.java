package com.expressAli.sdk;

import com.global.iop.api.IopResponse;

public class ShareServiceImpl implements ShareService {
	@Override
	public String shareContent(String orderId) {
		IopResponse resp = new IopResponse(123);
		System.out.println(resp);
		return "http://www.baidu.com";
	}
}
