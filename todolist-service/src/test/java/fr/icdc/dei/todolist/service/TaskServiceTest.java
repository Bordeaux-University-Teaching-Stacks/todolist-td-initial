package fr.icdc.dei.todolist.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TaskServiceTest extends AbstractServiceTest {

	@Autowired
	private TaskService taskService;

	@Test
	public void testListTasks() {
		assertEquals(taskService.list().size(), 3);
	}

}
