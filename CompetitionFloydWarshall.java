import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CompetitionFloydWarshall {
	
	
	
    /**
     * @param filename: A filename containing the details of the city road network
     * @param sA, sB, sC: speeds for 3 contestants
     */
	
	
	 int sA, sB, sC;
    CompetitionFloydWarshall (String filename, int sA, int sB, int sC){
    	
    	this.sA = sA;
    	this.sB = sB;
    	this.sC = sC;
    	parseData(filename);
    	dist = new double[numOfVertices][numOfVertices];
    	floydWarshall();
    	
        //TODO
    }
   
    
    private void floydWarshall() {
    	for(int k = 0; k < numOfVertices; k++) {
    		for(int i = 0; i < numOfVertices; i++) {
    			for(int j = 0; j < numOfVertices; j++) {
    				if(edges[k][i] +edges[j][k] < edges[j][i] && j != i) {
    					edges[j][i] = edges[k][i] + edges[j][k];
    				}
    				if(j == i) {
    					edges[j][i] = 0;
    				}
    			}
    		}
    	}
	}


	double edges[][];
	double dist[][]; 
	
    int numOfVertices = 0 ;
	int numOfEdges = 0;
    private void parseData(String filename) {
    	
    	
		File a = new File(filename);
	    Scanner input = null;
	    try {
	        input = new Scanner(a);
	    } catch (FileNotFoundException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	    numOfVertices = input.nextInt();
	    numOfEdges = input.nextInt();
	    edges = new double[numOfVertices][numOfVertices];
	    
	    for (int i = 0; i < numOfVertices; i++) {
	    	for(int j = 0; j < numOfVertices; j++) {
	    		edges[i][j] = Integer.MAX_VALUE;	
	    	}
	    }
	    
	    for(int i = 0; i < numOfEdges; i++) {
	    	int originVertex = input.nextInt();
	    	int destVertex = input.nextInt();
	    	double weight = input.nextDouble(); 
	    	edges[originVertex][destVertex] = weight;
//	    	input.close();
	    	
	    } 
	    
	    
	    
	    
    }
    /**
     * @return int: minimum minutes that will pass before the three contestants can meet
     */
    public int timeRequiredforCompetition(){
    	
//    	FloydWarshall competition = new FloydWarshall(graph);
    	double maxDistance = 0;
 	
    	int speed = 0;

    	for (int i = 0; i < numOfVertices; i++) {
    		for(int j= 0; j < numOfVertices; j++) {    			
    			if (edges[i][j] > maxDistance && edges[i][j] != Integer.MAX_VALUE) {
        			maxDistance = edges[i][j];
        		
        		}
    			if (edges[i][j] == Integer.MAX_VALUE) {
    				return -1;
    			}
    		}			
    	}
    	
       	if (sA < 50 || sA > 100 ) {
    		return -1;
    	}
    	
    	if (sB < 50 || sB > 100) {
    		return -1;
    		
    	}
    	if (sC < 50 || sC > 100) {
    		return -1;
    	}
    	
    	if (sA < sB) {
    		speed = sA;
    	}
    	else {
    		speed = sB;
    	}
    	
    	if(sC < speed) {
    		speed = sC;
    	}
    	
    	
    	int timeTaken = (int) Math.ceil((maxDistance*1000)/speed);
    	if (timeTaken == 0) {
    		return 0;
    	}
//    	return (int)timeTaken;
    	return timeTaken;
    	//TO DO
      
    }
}