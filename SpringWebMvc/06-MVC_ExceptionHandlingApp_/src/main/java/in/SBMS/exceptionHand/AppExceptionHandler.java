package in.SBMS.exceptionHand;

import java.time.LocalDate;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(value = NullPointerException.class)
	public String handleNPException(NullPointerException ex, Model model) {

		System.out.println();

		model.addAttribute("errorMsg", ex.getMessage());
		model.addAttribute("date", LocalDate.now());
		
		return "error";

	}

	@ExceptionHandler(value = Exception.class)
	public String handleException(Exception ex, Model model) {

		System.out.println();

		model.addAttribute("errorMsg", ex.getMessage());
		model.addAttribute("date", LocalDate.now());

		return "error";
	}

}
