package fr.icdc.dei.todolist.persistence.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import fr.icdc.dei.todolist.persistence.entity.Task;

public class TaskDaoTest extends AbstractDaoTest {

	private static final String TEST_FINDABLE_LABEL = "testFindableLabel";

	@Autowired
	private TaskDao taskDao;
	
	private final static Task task = new Task();

	@Test
	public void testCreateTask() {
		task.setLabel("");
		assertNotNull(taskDao.save(task));
	}
	
	@Test
	public void testTaskIsFindableByLabel() {
		assertNotNull(taskDao.findByLabel(TEST_FINDABLE_LABEL));
	}

}
