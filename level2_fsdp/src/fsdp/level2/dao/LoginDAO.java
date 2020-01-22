package fsdp.level2.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.HibernateTemplate;

import fsdp.level2.model.Student;


public class LoginDAO {
	
	@Autowired @Qualifier("hibernateTemplate")
	private HibernateTemplate hibernateTemplate;

    @Autowired
    private SessionFactory sessionFactory;
  
    public List < Student > getPersonList() {
    	String hql = "from Person";		
		List<Student> list = sessionFactory.getCurrentSession().createQuery(hql).list();
		return list;
    }   
    public void deletePerson(int id) throws Exception {
    	Student obj;
		DetachedCriteria criteria = DetachedCriteria.forClass(Student.class);
		criteria.add(Restrictions.eq("id", id));

		List<Student> gr = hibernateTemplate.findByCriteria(criteria);
		if (gr.size() > 0) {
			obj = gr.get(0);
			hibernateTemplate.delete(obj);
		} else {
			throw new Exception("NO record found.");
		}		
    }  
    
    public Student savePerson(Student student) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(student);
        return student;
    }
    public Student getPerson(int id) throws Exception {

    	Student obj=null;
		DetachedCriteria criteria = DetachedCriteria.forClass(Student.class);
		criteria.add(Restrictions.eq("id", id));

		List<Student> gr = hibernateTemplate.findByCriteria(criteria);
		if (gr.size() > 0) {
			obj = gr.get(0);			
		} else {
			throw new Exception("No record found.");
		}
		return obj;
    }
}
