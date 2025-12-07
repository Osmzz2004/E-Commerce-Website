import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

public class MyProfile implements SessionAware {

    private Map<String, Object> session;
    private User currentUser;


    public String viewProfile() {
        currentUser = (User) session.get("currentUser");
            return "success"; 

    }


	@Override
	public void setSession(Map map) {
		session = map;
		
	}
}
