package chap06problem;

public class MemberService {
	String id;
	String pwd;
	boolean loginBoolean = false;
	
	public MemberService() {
		super();
	}

	public MemberService(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}
	
	public boolean login(String id, String pwd) {
		if(id=="hong" && pwd=="12345") 
		loginBoolean = true;
		return loginBoolean;
	}
	
	public void logout(String id) {
		System.out.println(id+"·Î±×¾Æ¿ô µÇ¼Ì½À´Ï´Ù.");
	}
	
}
