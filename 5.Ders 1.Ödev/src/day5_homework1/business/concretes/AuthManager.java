package day5_homework1.business.concretes;

import java.util.Scanner;
import java.util.regex.Pattern;

import day5_homework1.business.abstracts.AuthService;
import day5_homework1.business.abstracts.UserService;
import day5_homework1.core.adapters.AuthServiceAdapter;
import day5_homework1.core.emailVerification.EmailService;
import day5_homework1.entities.concretes.User;

public class AuthManager implements AuthService{
	private UserService userService;
	private AuthServiceAdapter authServiceAdapter;
	private EmailService emailService;
	public AuthManager(UserService userService, AuthServiceAdapter authServiceAdapter, EmailService emailService) {
		super();
		this.userService = userService;
		this.authServiceAdapter = authServiceAdapter;
		this.emailService = emailService;
	}

	@Override
	public void register(int id, String firstName, String lastName, String email, String password) {
		User registerUser = new User(id, firstName, lastName, email, password);
		if (!fillAllInformation(registerUser.getFirstName(), registerUser.getLastName(), registerUser.getEmail(),
				registerUser.getPassword())) {
			return;
		}
		if (!nameLengthValid(registerUser.getFirstName(), registerUser.getLastName())) {
			return;
		} else if (!checkEmailFormat(registerUser.getEmail())) {
			return;
		} else if (!exsistEmail(registerUser.getEmail())) {
			return;
		} else if (!passwordLengthValid(registerUser.getPassword())) {
			return;
		} else {
			this.emailService.sendVerificationMail(registerUser.getEmail());

			Scanner scanner = new Scanner(System.in);
			System.out.println("Doğrulama Kodunuz:'1234567890'dır. Yeniden Siteye Giderek Hesabınızı Aktif Hale Getiriniz.");
			String option = scanner.nextLine();

			if (this.emailService.isVerified(option)) {
				this.userService.register(registerUser);
			} else {
				System.out.println("Kayıt İşlemi Gerçekleştirilemedi.");
			}
		}
	}

	private boolean exsistEmail(String email) {
		if (userService.getUserByEmail(email) == null) {
			return true;
		}
		else {
		System.out.println("Bu Mail Adresi Sistemde Kayıtlıdır..");
		return false;
		}
	}

	private boolean checkEmailFormat(String email) {
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern = Pattern.compile(regex);

		if (pattern.matcher(email).matches()) {
			return true;
		}
		else {
		System.out.println("Mail Adresi Geçersizdir. Mail Adresi Formatı example@example.com olması gerekir");
		return false;
		}
	}

	private boolean nameLengthValid(String firstName, String lastName) {
			if (firstName.length() >= 2 && lastName.length() >= 2) {
				return true;
			}
			System.out.println("Adınız ve Soyadınız En Az 2 Karakterden Oluşması Gerekmektedir.");
			return false;
		
	}

	private boolean fillAllInformation(String firstName, String lastName, String email, String password) {
		if (firstName.length() > 0 && lastName.length() > 0 && email.length() > 0 && password.length() > 0) {
			return true;
		}
		else {
		System.out.println("Lütfen Tüm Alanları Doldurunuz. Boş Alan Bırakılamaz.");
		return false;
		}
	}
		

	private boolean passwordLengthValid(String password) {
		if (password.length() >= 6) {
			return true;
		}
		else{
		System.out.println("Şifreniz Güvenlik Açısından En Az 6 Karakter Olması Gerekir.");
		return false;
		}
	}

	@Override
	public void login(String email, String password) {
		User loginUser = userService.getUserByEmail(email);
		if (loginUser == null) {
			System.out.println("Geçersiz Bir Kullanıcı Girdiniz.");
		} else if (email.length() <= 0 || password.length() <= 0) {
			System.out.println("Şifre ve email boş geçilemez. Tüm alanları doldurup tekrar deneyiniz.");
		} else if (loginUser.getEmail() != email) {
			System.out.println("Hatalı E-mail Girişi Yaptınız.");
		} else if (loginUser.getPassword() != password) {
			System.out.println("Hatalı Şifre Girdiniz.");
		} else {
			System.out.println(
					"Sisteme Başarıyla Giriş Yaptınız: " + loginUser.getFirstName() + " " + loginUser.getLastName());
		}		
	}

	@Override
	public void loginWithGoogle(String email) {
		authServiceAdapter.login(email);

	}

	@Override
	public void register(String email) {
		authServiceAdapter.register(email);

		
	}
	

}
