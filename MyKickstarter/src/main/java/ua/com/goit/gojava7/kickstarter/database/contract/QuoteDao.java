package ua.com.goit.gojava7.kickstarter.database.contract;

import ua.com.goit.gojava7.kickstarter.domains.Quote;

public interface QuoteDao {

	public void add(Quote quote);

	public void remove(Quote quote);

	public Quote getRandomQuote();
}
