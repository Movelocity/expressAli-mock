package global.iop.api;

public class MockIopClient implements IopClient {
    @Override
    public IopResponse execute(IopRequest request) {
        // 返回预设测试数据
        return new MockIopResponse(200, "Mock Success");
    }
}