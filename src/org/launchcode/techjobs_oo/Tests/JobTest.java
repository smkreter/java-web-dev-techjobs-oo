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
        assertEquals(productTester.getName(), "Product tester");
        assertTrue(productTester.getEmployer() instanceof Employer);
        assertEquals(productTester.getEmployer().getValue(), "ACME");
        assertTrue(productTester.getLocation() instanceof Location);
        assertEquals(productTester.getLocation().getValue(), "Desert");
        assertTrue(productTester.getPositionType() instanceof PositionType);
        assertEquals(productTester.getPositionType().getValue(), "Quality control");
        assertTrue(productTester.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(productTester.getCoreCompetency().getValue(), "Persistence");
//        assertEquals("class java.lang.String", productTester.getName().getClass().toString());
    }

    @Test
    public void testJobsForEquality() {
        Job firstIdenticalJob = new Job("Fart sniffer", new Employer("My butt"), new Location ("Still my butt"), new PositionType("Posterior Specialist"), new CoreCompetency("Open-mindedness"));
        Job secondIdenticalJob = new Job("Fart sniffer", new Employer("My butt"), new Location ("Still my butt"), new PositionType("Posterior Specialist"), new CoreCompetency("Open-mindedness"));
//        assertNotEquals(firstIdenticalJob, secondIdenticalJob);
        assertFalse(firstIdenticalJob.equals(secondIdenticalJob));
    }

    @Test
    public void testToString(){
        //should return a string that contains a blank line before and after the job information
        Job stringJob = new Job("String Attacker", new Employer( "Me"), new Location("My office"), new PositionType("Cat"), new CoreCompetency("Clawing"));
//        System.out.println(stringJob.toString().toCharArray());
//        System.out.println(stringJob.toString().toCharArray()[0]);
//        System.out.println("thisisastring".toCharArray()[2]);
        assertEquals(stringJob.toString().toCharArray()[0], "\n".toCharArray()[0]);
        assertEquals(stringJob.toString().toCharArray()[(stringJob.toString().toCharArray().length)-1], "\n".toCharArray()[0]);
    }



}






