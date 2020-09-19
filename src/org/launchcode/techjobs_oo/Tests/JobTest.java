package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
//import org.launchcode.techjobs_oo.*;
import org.launchcode.techjobs_oo.PositionType;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.CoreCompetency;
import org.launchcode.techjobs_oo.Job;

import static org.junit.Assert.*;

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
        Job emptyConstructorTestJob = new Job();
        assertNotEquals(firstTestJob.getId(), null);
        assertNotEquals(emptyConstructorTestJob.getId(), null);
        assertNotEquals(firstTestJob.getId(), secondTestJob.getId());
        assertEquals(firstTestJob.getId() + 1, secondTestJob.getId(), 0.01);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job productTester = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        assertEquals(productTester.getCoreCompetency().getClass(), CoreCompetency);
//        assertEquals(productTester.getEmployer().getClass(), Employer);
//        assertEquals(productTester.getLocation().getClass(), Location);
//        assertEquals(productTester.getPositionType().getClass(), PositionType);
        assertEquals(productTester.getName(), "Product tester");
        assertEquals(productTester.getEmployer(), "ACME");
//System.out.println(productTester.getName().getClass().toString());
        assertEquals("class java.lang.String", productTester.getName().getClass().toString());
//        assertTrue(productTester.getName().getClass() == Job.getName().getClass());
//        assertEquals(productTester.getName().getClass(), Class String);
//        assertTrue(productTester.getName().getClass().getName() == String);


    }





}






