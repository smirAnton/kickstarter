package ua.com.goit.gojava7.kickstarter.database.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ua.com.goit.gojava7.kickstarter.database.contract.ProjectDao;
import ua.com.goit.gojava7.kickstarter.domains.Project;

@Repository
public class ProjectDaoImpl implements ProjectDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")	
	public List<Project> getProjectsFromCategory(int categoryId) {
		return entityManager.createNamedQuery("Project.findProjectsFromCategory").setParameter("id", categoryId).getResultList();
	}

	public Project getProjectById(int projectId) {
		return (Project) entityManager.createNamedQuery("Project.findProject").setParameter("id", projectId).getSingleResult();
	}

	@Transactional
	public void add(Project project) {
		entityManager.persist(project);
	}

	@Transactional
	public void remove(Project project) {
		entityManager.remove(project);
	}
}
