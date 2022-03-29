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
    
    
    
    
    
    
    //TODO - more tests
    
}
