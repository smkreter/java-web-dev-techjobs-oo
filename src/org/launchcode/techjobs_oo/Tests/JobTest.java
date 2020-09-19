package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class JobTest {

    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }

    @Before
    public void createTestObject1() {
//        Employer boeing = new Employer("Boeing");
//        Location stLouis = new Location("St. Louis");
//        CoreCompetency busyWork = new CoreCompetency("Busy Work");
//        PositionType workerBee = new PositionType("Worker Bee");
//        Job firstTestJob = new Job("Thing Doer II", boeing, stLouis, workerBee, busyWork);
    }

    @Before
    public void createTestObject2() {
//        Employer monsanto = new Employer("Bayer");
//        Location chicago = new Location("Chicago");
//        CoreCompetency projectManagement = new CoreCompetency("Project Management");
//        PositionType projectManager = new PositionType("Project Manager");
//        Job testJob2 = new Job("Project Manager III", monsanto, chicago, projectManager, projectManagement);
//        return testJob2;
    }

    @Test
    public void testSettingJobId(){
        // createTestObject1
        Employer boeing = new Employer("Boeing");
        Location stLouis = new Location("St. Louis");
        CoreCompetency busyWork = new CoreCompetency("Busy Work");
        PositionType workerBee = new PositionType("Worker Bee");
        Job firstTestJob = new Job("Thing Doer II", boeing, stLouis, workerBee, busyWork);
        // createTestObject2
        Employer monsanto = new Employer("Bayer");
        Location chicago = new Location("Chicago");
        CoreCompetency projectManagement = new CoreCompetency("Project Management");
        PositionType projectManager = new PositionType("Project Manager");
        Job secondTestJob = new Job("Project Manager III", monsanto, chicago, projectManager, projectManagement);
        assertNotEquals(firstTestJob.getId(), null);
        assertNotEquals(firstTestJob.getId(), secondTestJob.getId());
        assertEquals(firstTestJob.getId() + 1, secondTestJob.getId(), 0.01);
    }





}






