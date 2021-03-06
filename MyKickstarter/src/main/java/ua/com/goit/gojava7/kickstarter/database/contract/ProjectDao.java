package ua.com.goit.gojava7.kickstarter.database.contract;

import java.util.List;

import ua.com.goit.gojava7.kickstarter.domains.Project;

public interface ProjectDao {

	public void add(Project project);

	public void remove(Project project);

	public List<Project> getProjectsFromCategory(int categoryId);

	public Project getProjectById(int projectId);
}
