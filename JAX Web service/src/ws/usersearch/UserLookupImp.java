package ws.usersearch;

import javax.jws.WebService;

import ws.bean.UserRequest;
//Service Implementation
@WebService(endpointInterface = "ws.usersearch.UserLookupService")
public class UserLookupImp implements UserLookupService {

	@Override
	public String UserSearch(String UserName) {
		// TODO Auto-generated method stub
		return UserName;
	}

	@Override
	public UserRequest UserData(String UserName) {
		// TODO Auto-generated method stub
		return null;
	}

}
