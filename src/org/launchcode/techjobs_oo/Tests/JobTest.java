package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class JobTest {

    @Before
    Employer boeing = new Employer("Boeing");
    Employer monsanto = new Employer("Bayer");
    Location stLouis = new Location("St. Louis");
    Location chicago = new Location("Chicago");
    CoreCompetency busyWork = new CoreCompetency("Busy Work");
    CoreCompetency projectManagement = new CoreCompetency("Project Management");
    PositionType workerBee = new PositionType("Worker Bee");
    PositionType projectManager = new PositionType("Project Manager");
    Job testJob1 = new Job("Thing Doer II", boeing, stLouis, workerBee, busyWork);
    Job testJob2 = new Job("Project Manager III", monsanto, chicago, projectManager, projectManagement);

    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }

    @Test
    public void testSettingJobId(){
        assertNotEquals(testJob1.getId(), null);
    }



}
