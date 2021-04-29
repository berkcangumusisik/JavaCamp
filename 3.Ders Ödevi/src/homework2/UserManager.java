package homework2;

public class UserManager {
	public void add(User user) {
		System.out.println("User Added.");
	}
	public void addMultiple(User[] user) {
		for (User users : user) {
			add(users);
		}
	}
	public void delete(User user){
	        System.out.println(user.getFirstName() + " "+ user.getLastName()+": Deleted.");
	    }
	public void update(User user){
			System.out.println(user.getFirstName() +" "+ user.getLastName()+": Updated.");
	    }
}
