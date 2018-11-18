import javax.xml.ws.Endpoint;

import ws.usersearch.UserLookupImp;

public class UserService {

	public static void main(String[] args) {
		try {
		Endpoint.publish("http://localhost:8090/ws.usersearch.UserLookupService", new UserLookupImp());
		System.out.println("Running...");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
