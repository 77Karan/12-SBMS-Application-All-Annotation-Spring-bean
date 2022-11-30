package in.ashokit.config;
import org.springframework.context.annotation.Configuration;
import in.ashokit.service.PasswordService;
import org.springframework.context.annotation.Bean;
@Configuration
public class AppConfig 
{
	public AppConfig()
	{
		System.out.println("Creating App config object");
	}
	
	@Bean
	public void getPasswordService()
	{
		System.out.println();
		PasswordService ps = new PasswordService("password hidden");
		
	}

}
