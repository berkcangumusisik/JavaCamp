package day5_homework1.core.adapters;

import day5_homework1.googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthServiceAdapter {

	@Override
	public void register(String email) {
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.register(email);		
	}

	@Override
	public void login(String email) {
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.login(email);		
	}

}
