package homework2;

public class InstructorManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("Instructor : "+ user.getFirstName()+" "+ user.getLastName() +" Added." );
		
	}
	@Override
    public void delete(User user) {
        System.out.println("Instructor : "+ user.getFirstName() +" "+ user.getLastName() + " Deleted.");
    }

    @Override
    public void update(User user) {
        System.out.println("Instructor : "+ user.getFirstName() +" "+ user.getLastName() + " Updated.");

    }
}