package com.global.iop.api;
import com.global.iop.domain.Protocol;

public class IopResponse {
	public int protocolId;

	public IopResponse() {
		this.protocolId = Protocol.TOP;
	}

	public IopResponse(int protocolId) {
		this.protocolId = protocolId;
	}

	public String toString() {
		return "protocolId:" + protocolId;
	}

	public String getBody() {
		return "nice body";
	}
}
