package com.global.iop.api;

public interface IopClient {
	public IopResponse execute(IopRequest request, String token, int protocolId);
}
