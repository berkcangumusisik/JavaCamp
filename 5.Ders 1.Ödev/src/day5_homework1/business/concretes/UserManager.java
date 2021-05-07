package day5_homework1.business.concretes;

import java.util.List;
import day5_homework1.business.abstracts.UserService;
import day5_homework1.dataAccess.abstracts.UserDao;
import day5_homework1.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void register(User user) {
		userDao.register(user);		
	}

	@Override
	public void login(User user) {
		userDao.login(user);		
	}

	@Override
	public void update(User user) {
		userDao.update(user);		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);		
	}

	@Override
	public User getUser(int id) {
		return userDao.getUser(id);
	}

	@Override
	public User getUserByEmail(String email) {
		return userDao.getUserByEmail(email);
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}
    
}


