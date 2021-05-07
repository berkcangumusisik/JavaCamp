package day5_homework1.core.emailVerification;

public interface EmailService {
	void sendVerificationMail(String email);
	boolean isVerified(String option);
}
