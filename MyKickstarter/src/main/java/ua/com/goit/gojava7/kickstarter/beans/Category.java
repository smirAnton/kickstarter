package ua.com.goit.gojava7.kickstarter.beans;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
@NamedQueries({ @NamedQuery(name = "Category.findById", query = "SELECT c FROM Category c WHERE c.id = :id"),
				@NamedQuery(name = "Category.findAll", query = "SELECT c FROM Category c") })
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@OneToMany
	private Set<Project> projects;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return String.format("Category : [name=%s]", name);
	}

	@Override
	public boolean equals(Object that) {
		if (that == null) {
			return false;
		}
		if (!this.getClass().equals(that.getClass())) {
			return false;
		}

		Category category = (Category) that;
		if (this.id == category.getId() && this.name.equals(category.getName())) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		int categoryHashCode = 0;
		categoryHashCode = (id + name).hashCode();
		return categoryHashCode;
	}
}
