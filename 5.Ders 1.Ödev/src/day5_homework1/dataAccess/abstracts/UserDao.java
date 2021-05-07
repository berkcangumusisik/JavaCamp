package day5_homework1.dataAccess.abstracts;

import java.util.List;

import day5_homework1.entities.concretes.User;

public interface UserDao {
	void register(User user);
	void login(User user);
	void update(User user);
	void delete(User user);
	User getUser(int id);
	User getUserByEmail(String email);
	List<User> getAll();
}
