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

    @Before
//    public void createTestObject1() {
//        // I'm genuinely curious why my Before never worked but it hardly really matters
//        Employer boeing = new Employer("Boeing");
//        Location stLouis = new Location("St. Louis");
//        CoreCompetency busyWork = new CoreCompetency("Busy Work");
//        PositionType workerBee = new PositionType("Worker Bee");
//        Job firstTestJob = new Job("Thing Doer II", boeing, stLouis, workerBee, busyWork);
//    }


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
        //instead, check that firstTestJob ID is definitely 1, and that secondTestJob is definitely 2
        //assumes jobID value actually matters
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
        assertEquals(stringJob.toString().toCharArray()[0], "\n".toCharArray()[0]);
        assertEquals(stringJob.toString().toCharArray()[(stringJob.toString().toCharArray().length)-1], "\n".toCharArray()[0]);
        //should have a label for each field
        //I'm defining a label as a thing with a colon and a space.
        //There should be n things with colons and spaces, where n is the number of values in the class, which is 6
        //should have each piece of info on its own line
        // therefore should have n+1 line breaks, where n is number of values in the class, which is 6
        char[] stringJobCharArray = stringJob.toString().toCharArray();
        int breakCounter = 0;
        int colonSpaceCounter = 0;
        for (int i = 0; i < stringJobCharArray.length; i++) {
            if (stringJobCharArray[i] == "\n".toCharArray()[0]) {
                breakCounter++;
            }
            if ((stringJobCharArray[i] == ":".toCharArray()[0]) && (stringJobCharArray[i+1] == " ".toCharArray()[0])) {
                colonSpaceCounter++;
            }
        }
        assertEquals(breakCounter, 7);
        assertEquals(colonSpaceCounter, 6);
        // should add "Data not available" if field is empty
        Job missingDataJob = new Job("Item Misplacer", new Employer("Me again"), new Location("Lost"), new PositionType("Middle Manager"), new CoreCompetency());
        assertTrue(missingDataJob.toString().contains("Data not available"));

    }

}






