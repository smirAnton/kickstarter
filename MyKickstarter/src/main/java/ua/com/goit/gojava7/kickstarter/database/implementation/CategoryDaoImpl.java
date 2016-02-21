package ua.com.goit.gojava7.kickstarter.database.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ua.com.goit.gojava7.kickstarter.database.contract.CategoryDao;
import ua.com.goit.gojava7.kickstarter.domains.Category;

@Repository
public class CategoryDaoImpl implements CategoryDao {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public List<Category> getAll() {
		return entityManager.createNamedQuery("Category.findAll").getResultList();
	}

	public Category getCategoryById(int id) {
		return (Category) entityManager.createNamedQuery("Category.findById").setParameter("id", 1).getSingleResult();
	}
	
	@SuppressWarnings("unchecked")
	public List<Object[]> getTop10Categories() {
		String query = "SELECT category.name, SUM(coalesce(payment.pledge,0)) AS money "
					 + "FROM category " 
					 + "LEFT JOIN project ON category.id = project.category_id "
					 + "LEFT JOIN payment ON project.id = payment.project_id " 
					 + "GROUP BY category.id "
					 + "ORDER BY money DESC limit 10";

		return entityManager.createNativeQuery(query).getResultList();
	}

	@Transactional
	public void add(Category category) {
		entityManager.persist(category);
	}

	@Transactional
	public void remove(Category category) {
		entityManager.remove(category);
	}
}
