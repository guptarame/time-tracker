package training.taylor.timetracker.core;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import training.taylor.timetracker.core.dao.TimeEntry;

/**
 * Created by Jason on 6/19/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackerCoreConfig.class)
public class TrackerTest {
    @Autowired
    private Tracker tracker;

    @Test
    public void testMe() {
        System.out.println("testme test passed");
        assertNotNull(tracker);
    }

    @Test
    public void testAdd() {
        System.out.println("testadd  test passed");
        TimeEntry entry = new TimeEntry();
        entry.setDescription("Entry Test");
        entry.setRate(80.0f);
        entry.setTime(3);
        tracker.add(entry);
        assertTrue(tracker.size() > 0);
    }

    @Test
    public void testAnotherEntry3() {
        TimeEntry entry = new TimeEntry();
        entry.setDescription("Entry Test");
        entry.setRate(84.0f);
        entry.setTime(7);
        tracker.add(entry);
        assertTrue(tracker.size() > 0);
    }

    @Test
    public void testAnotherEntry4() {
        TimeEntry entry = new TimeEntry();
        entry.setDescription("Entry Test");
        entry.setRate(85.0f);
        entry.setTime(8);
        tracker.add(entry);
        assertTrue(tracker.size() > 0);
    }
}
