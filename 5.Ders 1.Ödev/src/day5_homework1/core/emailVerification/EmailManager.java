package day5_homework1.core.emailVerification;

public class EmailManager implements EmailService{

	@Override
	public void sendVerificationMail(String email) {
		System.out.println(email + " Mail Adresinize Doğrulama E postası gönderilmiştir.");
		
	}

	@Override
	public boolean isVerified(String option) {
		if (option.equals("1234567890")) {
			System.out.println("E-mail adresiniz doğrulanmıştır. Hesabınıza Giriş Yapınız.");
			return true;
		}
		System.out.println("Hata: E- mail adresiniz doğrulanamadı. Gelen Kodu Giremediniz.");
		return false;
	}

}
