package cn.yafex.test;
import com.expressAli.sdk.ShareService;
import com.expressAli.sdk.ShareServiceImpl;
// import global.iop.api.MockIopClient;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ShareService shareService = new ShareServiceImpl();
        System.out.println(shareService.shareContent("123"));
    }
}
