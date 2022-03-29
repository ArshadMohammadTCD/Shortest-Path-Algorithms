import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CompetitionTests {

    @Test
    public void testDijkstraConstructor() {
    	CompetitionDijkstra CP	= new CompetitionDijkstra("C:\\Users\\arsha\\eclipse-workspace\\Exam\\input-B.txt", 100, 100, 200 );
    	
    	
    }

    @Test
    public void testFWConstructor() {
    	CompetitionFloydWarshall WP = new CompetitionFloydWarshall("C:\\Users\\arsha\\eclipse-workspace\\Exam\\input-B.txt", 100, 100, 200);
        //TODO
    }
    @Test
    public void testDijkstraInputA() {
    	CompetitionDijkstra CD	= new CompetitionDijkstra("C:\\Users\\arsha\\eclipse-workspace\\Exam\\input-A.txt", 200, 200, 100 );
    	assertEquals( "Checking insertBefore to a list containing 3 elements at position 0", 1500, CD.timeRequiredforCompetition());
    }
    @Test
    public void testDijkstraInputB() {
    	CompetitionDijkstra CD	= new CompetitionDijkstra("C:\\Users\\arsha\\eclipse-workspace\\Exam\\input-B.txt", 200, 100, 200 );
    	assertEquals( "Checking insertBefore to a list containing 3 elements at position 0", 5000, CD.timeRequiredforCompetition());
    }
    @Test
    public void testDijkstraInputC() {
    	CompetitionDijkstra CD	= new CompetitionDijkstra("C:\\Users\\arsha\\eclipse-workspace\\Exam\\input-C.txt", 100, 200, 200 );
    	assertEquals( "Checking insertBefore to a list containing 3 elements at position 0", 2000, CD.timeRequiredforCompetition());
    }
    @Test
    public void testFloydWarshallInputA() {
    	CompetitionFloydWarshall CFW= new CompetitionFloydWarshall("C:\\Users\\arsha\\eclipse-workspace\\Exam\\input-A.txt", 100, 100, 200 );
    	assertEquals( "Checking insertBefore to a list containing 3 elements at position 0", 1500, CFW.timeRequiredforCompetition());
    }
    
    @Test
    public void testFloydWarshallInputB() {
    	CompetitionFloydWarshall CFW= new CompetitionFloydWarshall("C:\\Users\\arsha\\eclipse-workspace\\Exam\\input-B.txt", 100, 100, 200 );
    	assertEquals( "Checking insertBefore to a list containing 3 elements at position 0", 5000, CFW.timeRequiredforCompetition());
    }
    
    @Test
    public void testFloydWarshallInputC() {
    	CompetitionFloydWarshall CFW= new CompetitionFloydWarshall("C:\\Users\\arsha\\eclipse-workspace\\Exam\\input-C.txt", 100, 100, 200 );
    	assertEquals( "Checking insertBefore to a list containing 3 elements at position 0", 2000, CFW.timeRequiredforCompetition());
    }
    
    
    
    //TODO - more tests
    
}
