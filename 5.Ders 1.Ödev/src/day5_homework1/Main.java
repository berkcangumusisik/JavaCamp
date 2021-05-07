package day5_homework1;

import day5_homework1.business.abstracts.AuthService;
import day5_homework1.business.concretes.AuthManager;
import day5_homework1.business.concretes.UserManager;
import day5_homework1.core.adapters.GoogleAuthManagerAdapter;
import day5_homework1.core.emailVerification.EmailManager;
import day5_homework1.dataAccess.concretes.HibernateUserDao;

public class Main {

	public static void main(String[] args) {
	    System.out.println("--------------E TİCARET SİTESİNE HOŞ GELDİNİZ----------------------");
	    AuthService authService = new AuthManager(new UserManager(new HibernateUserDao()),
				new GoogleAuthManagerAdapter(), new EmailManager());
	    System.out.println("--------------GOOGLE HESABI İLE İŞLEMLER----------------------");
		String googleAccount = "gumusisikberkcan@gmail.com";
		authService.register(googleAccount);
		authService.loginWithGoogle(googleAccount);
		System.out.println("--------------SİSTEME KAYIT OLMA VE GİRİŞ YAPMA (DOĞRU)----------------------");
		authService.register(1, "Berkcan", "Gümüşışık", "gumusisikberkcan@gmail.com", "12345678");;
		authService.login("gumusisikberkcan@gmail.com","12345678");
		System.out.println("--------------SİSTEME KAYIT OLMA VE GİRİŞ YAPMA (HATALI)----------------------");
		authService.register(2, "Berkcan", "Gümüşışık", "", "12345678");
		authService.register(3, "Berkcan", "Gümüşışık", "gumusisikberkcan", "12345678");
		authService.register(4, "Berkcan", "Gümüşışık", "gumusisikberkcan@gmail.com", "1234");
		authService.register(5, "B", "G", "gumusisikberkcan@gmail.com", "12345678");;
		authService.register(1, "Berkcan", "Gümüşışık", "gumusisikberkcan@gmail.com", "12345678");;
		authService.login("gumusisikberkcan","12345678");
		authService.login("","");




	}
}
