package com.global.iop.api;
import com.global.iop.util.FileItem;

public class IopRequest {
	public String apiName;

	public IopRequest() {
		System.out.println("IopRequest 初始化");
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
		System.out.println("setApiName "+apiName);
	}

	public String getApiParams() {
		return "Here you are, these are api params: 1, 2, 3";
	}

	public void addApiParameter(String key, String value) {
		System.out.println("addApiParameter "+key+" "+value);
	}

	public void addFileParameter(String key, FileItem fileItem) {
		System.out.println("addFileParameter "+key+" "+fileItem);
	}
}
