package day5_homework1.business.abstracts;

public interface AuthService {
	void register(int id,String firstName, String lastName, String email, String password);

	void login(String email, String password);
	
	void loginWithGoogle(String email);
	
	void register(String email);
}
