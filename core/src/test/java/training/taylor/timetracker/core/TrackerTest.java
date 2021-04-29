package training.taylor.timetracker.core;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import training.taylor.timetracker.core.dao.TimeEntry;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackerCoreConfig.class)
public class TrackerTest {
    @Autowired
    private Tracker tracker;

    @Test
    public void testMe() {
        assertNotNull(tracker);
    }

    @Test
    public void testAdd() {
        TimeEntry entry = new TimeEntry();
        entry.setDescription("Entry Test");
        entry.setRate(80.0f);
        entry.setTime(3);
        tracker.add(entry);
        assertTrue(tracker.size() > 0);
    }
    
    @Test
    public void testAnotherEntry() {
        TimeEntry entry = new TimeEntry();
        entry.setDescription("Entry Test");
        entry.setRate(81.0f);
        entry.setTime(4);
        tracker.add(entry);
        assertTrue(tracker.size() > 0);
    }
    
    @Test
    public void testAnotherEntry1() {
        TimeEntry entry = new TimeEntry();
        entry.setDescription("Entry Test");
        entry.setRate(82.0f);
        entry.setTime(5);
        tracker.add(entry);
        assertTrue(tracker.size() > 0);
    }
    
    @Test
    public void testAnotherEntry2() {
        TimeEntry entry = new TimeEntry();
        entry.setDescription("Entry Test");
        entry.setRate(83.0f);
        entry.setTime(6);
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
