package day5_homework1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import day5_homework1.dataAccess.abstracts.UserDao;
import day5_homework1.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	List<User> users = new ArrayList<User>();


	@Override
	public void register(User user) {
        users.add(user);
        System.out.println(user.getFirstName() +" "+ user.getLastName()+" Hibernate İle Sisteme Başarıyla Kayıt Edildi.");
		
	}

	@Override
	public void login(User user) {
        System.out.println(user.getFirstName() +" "+ user.getLastName()+" Hibernate İle Sisteme Başarıyla Giriş Yaptı.");
		
	}

	@Override
	public void delete(User user) {
        users.remove(user);
		System.out.println(user.getFirstName() +" "+ user.getLastName()+" Hibernate İle Sistemden Başarıyla Silindi.");
		
	}


	@Override
	public void update(User user) {
		User updatedUser = getUser(user.getId());
		updatedUser.setFirstName(user.getFirstName());
		updatedUser.setLastName(user.getLastName());
		updatedUser.setPassword(user.getPassword());
		System.out.println(user.getFirstName() +" "+ user.getLastName()+" Hibernate İle Bilgileriniz Başarıyla Güncellendi..");
		
	}

	@Override
	public User getUser(int id) {
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	@Override
	public User getUserByEmail(String email) {
		for (User user : users) {
			if (user.getEmail() == email) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		return users;
	}
}
