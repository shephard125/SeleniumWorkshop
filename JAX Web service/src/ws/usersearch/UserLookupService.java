package ws.usersearch;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import ws.bean.UserRequest;
//Service Implementation
@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL) //optional
public interface UserLookupService {
	
@WebMethod	
public String UserSearch (String UserName);

@WebMethod
public UserRequest UserData (String UserName);


}
