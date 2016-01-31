package ua.com.goit.gojava7.kickstarter.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ua.com.goit.gojava7.kickstarter.database.contract.QuoteDao;

@RestController
@RequestMapping("/show")
public class QuoteService {
	
	@Autowired
	private QuoteDao quoteDao;	
	
	@RequestMapping(value = "/quote", method = RequestMethod.GET, produces = "application/json")
	public String getMovie() {
		return quoteDao.getRandomQuote().toString();
	}
}
