package global.iop.api;

public class MockIopResponse implements IopResponse {
	public MockIopResponse(int numerb, String msg) {
		System.out.println("MockIopResponse: "+numerb+" "+msg);
	}
}
