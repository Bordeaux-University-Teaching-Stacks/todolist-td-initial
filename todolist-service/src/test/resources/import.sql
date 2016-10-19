-- TaskServiceTest
-- testlistThreeLastTasks
-- ID_USER = 1L
INSERT INTO user(name) VALUES('testNameUser')
-- ID_CATEGORY = 1L
INSERT INTO category(name) VALUES('testNameCategory')
-- ID_TASK = 1L
INSERT INTO task(label, id_user) VALUES('testFind3lastTask1DB', 1);
-- ID_TASK = 2L
INSERT INTO task(label, id_user) VALUES('testFind3lastTask2DB', 1);
-- ID_TASK = 3L
INSERT INTO task(label, id_user) VALUES('testFind3lastTask3DB', 1);