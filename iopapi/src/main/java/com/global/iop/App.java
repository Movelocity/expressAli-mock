package com.global.iop;

import com.global.iop.api.IopClient;
import com.global.iop.api.IopClientImpl;
import com.global.iop.api.IopRequest;
import com.global.iop.domain.Protocol;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		IopRequest request = new IopRequest();
		String token = "token";
		IopClient client = new IopClientImpl("http://localhost:8080/iop/api/v1/", "appKey", "certKey");
		client.execute(request, token, Protocol.TOP);
    }
}
