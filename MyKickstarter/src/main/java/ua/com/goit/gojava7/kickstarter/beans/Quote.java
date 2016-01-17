package ua.com.goit.gojava7.kickstarter.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "quote")
public class Quote {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "text")
	private String text;
	@Column(name = "author")
	private String author;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String title) {
		this.text = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Quote : [text=" + text + ", author=" + author + "]";
	}

	@Override
	public boolean equals(Object that) {
		if (that == null) {
			return false;
		}
		if (!this.getClass().equals(that.getClass())) {
			return false;
		}

		Quote quote = (Quote) that;
		if (this.id == quote.getId() && this.text.equals(quote.getText()) && this.author.equals(quote.getAuthor())) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		int quoteHashCode = 0;
		quoteHashCode = (id + text + author).hashCode();
		return quoteHashCode;
	}
}
