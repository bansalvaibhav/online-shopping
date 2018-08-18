/**
 * 
 */
package learn.vaibhav.shoppingService.daoImpl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import learn.vaibhav.shoppingService.dao.GenericDao;

/**
 * @author vaibhav.bansal
 *
 */
@Transactional
public class GenericDaoImpl<T extends Serializable> implements GenericDao<T> {

	@Autowired
	SessionFactory session;
	
	

	@Override
	public T get(Class<T> clas, int id) {
		// TODO Auto-generated method stub
		return session.getCurrentSession().get(clas, id);
	}

	@Override
	public boolean addItem(T item) {
		try{
		session.getCurrentSession().persist(item);
		return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateItem(T item) {
		try{
			session.getCurrentSession().update(item);
			return true;
			}catch(Exception e){
				e.printStackTrace();
				return false;
			}
	}

}
