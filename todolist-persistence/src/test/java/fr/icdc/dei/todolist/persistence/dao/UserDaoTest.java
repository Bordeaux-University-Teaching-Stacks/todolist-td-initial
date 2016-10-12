package fr.icdc.dei.todolist.persistence.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import fr.icdc.dei.todolist.persistence.entity.User;

public class UserDaoTest extends AbstractDaoTest {
	
	@Autowired
	private UserDao userDao;
	
	private static final User user = new User();

	@Test
	public void testCreateUser() {
		assertNotNull(userDao.save(user));
	}

}
