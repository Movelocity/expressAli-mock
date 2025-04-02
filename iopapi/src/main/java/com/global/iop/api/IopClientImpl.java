package com.global.iop.api;
import com.global.iop.domain.Protocol;

public class IopClientImpl implements IopClient {

	public IopClientImpl(String url, String appKey, String certKey) {
		System.out.println("本地包初始化 IopClientImpl: " + url + " " + appKey + " " + certKey);
	}

	@Override
	public IopResponse execute(IopRequest request, String token, int protocolId) {
		System.out.println("IopClientImpl.exectue: " + request + " " + token + " " + protocolId);
		if(protocolId == Protocol.TOP) {
			System.out.println("Contratulations, IopClientImpl.exectue: TOP");
		}
		return new IopResponse(protocolId);
	}
}
