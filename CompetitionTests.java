import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
	


public class CompetitionTests {

	
	
	@Test
	public void testDijkstraEmptyConstructor() {
    	CompetitionDijkstra CP	= new CompetitionDijkstra(null, 900, 0, 200 );
    	
    	
    }

    @Test
    public void testFWEmptyConstructor() {
    	CompetitionFloydWarshall WP = new CompetitionFloydWarshall(null, 100, 100, 200);
        //TODO
    }
    @Test
	public void testDijkstraEmptyFileConstructor() {
    	CompetitionDijkstra CP	= new CompetitionDijkstra("empty.txt", 900, 0, 200 );
    	
    	
    }

    @Test
    public void testFWEmptyFileConstructor() {
    	CompetitionFloydWarshall WP = new CompetitionFloydWarshall("empty.txt", 100, 100, 200);
        //TODO
    }
    @Test
    public void testDijkstraConstructor() {
    	CompetitionDijkstra CP	= new CompetitionDijkstra("input-A.txt", 100, 100, 200 );
    	
    	
    }

    @Test
    public void testFWConstructor() {
    	CompetitionFloydWarshall WP = new CompetitionFloydWarshall("input-B.txt", 100, 100, 200);
        //TODO
    }
    @Test
    public void testDijkstraInputA() {
    	CompetitionDijkstra CD	= new CompetitionDijkstra("input-A.txt", 100, 100, 100 );
    	assertEquals( "Checking insertBefore to a list containing 3 elements at position 0", -1, CD.timeRequiredforCompetition());
    }
    @Test
    public void testDijkstraInputB() {
    	CompetitionDijkstra CD	= new CompetitionDijkstra("input-B.txt", 100, 100, 100 );
    	assertEquals( "Checking insertBefore to a list containing 3 elements at position 0", 5000, CD.timeRequiredforCompetition());
    }
    @Test
    public void testDijkstraInputC() {
    	CompetitionDijkstra CD	= new CompetitionDijkstra("input-C.txt", 100, 100, 100 );
    	assertEquals( "Checking insertBefore to a list containing 3 elements at position 0", -1, CD.timeRequiredforCompetition());
    }
    @Test
    public void testDijkstraInputD() {
    	CompetitionDijkstra CD	= new CompetitionDijkstra("input-D.txt", 50, 80, 60 );
    	assertEquals( "Checking insertBefore to a list containing 3 elements at position 0", 38, CD.timeRequiredforCompetition());
    }
    @Test
    public void testDijkstraInputJ() {
    	CompetitionDijkstra CD	= new CompetitionDijkstra("input-J.txt", 60,75,61 );
    	assertEquals( "Checking insertBefore to a list containing 3 elements at position 0", -1, CD.timeRequiredforCompetition());
    }
    @Test
    public void testDijkstraInputJC() {
    	CompetitionDijkstra CD	= new CompetitionDijkstra("input-J.txt", 61,75,60 );
    	assertEquals( "Checking insertBefore to a list containing 3 elements at position 0", -1, CD.timeRequiredforCompetition());
    }
    @Test
    public void testFloydWarshallInputA() {
    	CompetitionFloydWarshall CFW= new CompetitionFloydWarshall("input-A.txt", 100, 100, 100 );
    	assertEquals( "Checking insertBefore to a list containing 3 elements at position 0", -1, CFW.timeRequiredforCompetition());
    }
    
    @Test
    public void testFloydWarshallInputB() {
    	CompetitionFloydWarshall CFW= new CompetitionFloydWarshall("input-B.txt", 100, 100, 100 );
    	assertEquals( "Checking insertBefore to a list containing 3 elements at position 0", 5000, CFW.timeRequiredforCompetition());
    }
    @Test
    public void testFloydWarshallInputC() {
    	CompetitionFloydWarshall CFW= new CompetitionFloydWarshall("input-C.txt", 100, 100, 100 );
    	assertEquals( "Checking insertBefore to a list containing 3 elements at position 0", -1, CFW.timeRequiredforCompetition());
    }
    @Test
    public void testFloydWarshallInputD() {
    	CompetitionFloydWarshall CFW= new CompetitionFloydWarshall("input-D.txt", 50, 80, 60 );
    	assertEquals( "Checking insertBefore to a list containing 3 elements at position 0", 38, CFW.timeRequiredforCompetition());
    }
    @Test
    public void testFloydWarshallInputJ() {
    	CompetitionFloydWarshall CFW= new CompetitionFloydWarshall("input-J.txt", 60,75,61 );
    	assertEquals( "Checking insertBefore to a list containing 3 elements at position 0", -1, CFW.timeRequiredforCompetition());
    }
    @Test
    public void testFloydWarshallInputJC() {
    	CompetitionFloydWarshall CFW= new CompetitionFloydWarshall("input-J.txt", 61,75,60 );
    	assertEquals( "Checking insertBefore to a list containing 3 elements at position 0", -1, CFW.timeRequiredforCompetition());
    }
    
    
    @Test
    public void testFloydWarshallInputSpeeds() {
    	CompetitionFloydWarshall CFW1 = new CompetitionFloydWarshall("input-C.txt", 100, 100 , 200);
    	CompetitionFloydWarshall CFW2 = new CompetitionFloydWarshall("input-C.txt", 100, 200 , 100);
    	CompetitionFloydWarshall CFW3 = new CompetitionFloydWarshall("input-C.txt", 200, 100 , 200);
    	CompetitionFloydWarshall CFW4 = new CompetitionFloydWarshall("input-C.txt", 100, 100 , 20);
    	CompetitionFloydWarshall CFW5 = new CompetitionFloydWarshall("input-C.txt", 100, 20 , 100);
    	CompetitionFloydWarshall CFW6 = new CompetitionFloydWarshall("input-C.txt", 20, 100 , 100);
    	assertEquals( "Checking speed fail conditions", -1, CFW1.timeRequiredforCompetition());
    	assertEquals( "Checking speed fail conditions", -1, CFW2.timeRequiredforCompetition());
    	assertEquals( "Checking speed fail conditions", -1, CFW3.timeRequiredforCompetition());
    	assertEquals( "Checking speed fail conditions", -1, CFW4.timeRequiredforCompetition());
    	assertEquals( "Checking speed fail conditions", -1, CFW5.timeRequiredforCompetition());
    	assertEquals( "Checking speed fail conditions", -1, CFW6.timeRequiredforCompetition());
    	
    
    
    }
    @Test
    public void testDijkstraInputSpeeds() {
    	CompetitionDijkstra CFW1 = new CompetitionDijkstra("input-C.txt", 100, 100 , 200);
    	CompetitionDijkstra CFW2 = new CompetitionDijkstra("input-C.txt", 100, 200 , 100);
    	CompetitionDijkstra CFW3 = new CompetitionDijkstra("input-C.txt", 200, 100 , 200);
    	CompetitionDijkstra CFW4 = new CompetitionDijkstra("input-C.txt", 100, 100 , 20);
    	CompetitionDijkstra CFW5 = new CompetitionDijkstra("input-C.txt", 100, 20 , 100);
    	CompetitionDijkstra CFW6 = new CompetitionDijkstra("input-C.txt", 20, 100 , 100);
    	assertEquals( "Checking speed fail conditions", -1, CFW1.timeRequiredforCompetition());
    	assertEquals( "Checking speed fail conditions", -1, CFW2.timeRequiredforCompetition());
    	assertEquals( "Checking speed fail conditions", -1, CFW3.timeRequiredforCompetition());
    	assertEquals( "Checking speed fail conditions", -1, CFW4.timeRequiredforCompetition());
    	assertEquals( "Checking speed fail conditions", -1, CFW5.timeRequiredforCompetition());
    	assertEquals( "Checking speed fail conditions", -1, CFW6.timeRequiredforCompetition());
    	
    
    
    }
    
    
    //TODO - more tests
    
}
