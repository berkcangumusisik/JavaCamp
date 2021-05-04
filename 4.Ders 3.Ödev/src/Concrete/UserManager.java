package Concrete;

import Abstract.UserService;
import Entity.User;

public class UserManager implements UserService  {

	@Override
	public void add(User user) {
		System.out.println(user.getUsername() + " kullanıcı adıyla Sisteme Kaydedildi");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getUsername() + " kullanıcı adıyla Sistemde Güncellendi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getUsername() + " kullanıcı adıyla Sistemden Silindi.");
		
	}

}
