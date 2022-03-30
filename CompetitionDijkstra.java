/*
 * A Contest to Meet (ACM) is a reality TV contest that sets three contestants at three random
 * city intersections. In order to win, the three contestants need all to meet at any intersection
 * of the city as fast as possible.
 * It should be clear that the contestants may arrive at the intersections at different times, in
 * which case, the first to arrive can wait until the others arrive.
 * From an estimated walking speed for each one of the three contestants, ACM wants to determine the
 * minimum time that a live TV broadcast should last to cover their journey regardless of the contestants’
 * initial positions and the intersection they finally meet. You are hired to help ACM answer this question.
 * You may assume the following:
 *     Each contestant walks at a given estimated speed.
 *     The city is a collection of intersections in which some pairs are connected by one-way
 * streets that the contestants can use to traverse the city.
 *
 * This class implements the competition using Dijkstra's algorithm
 */
import java.util.*;
//import java.util.Iterator;
//import java.lang.*;
//import java.lang.reflect.Array;  
import java.io.*;
public class CompetitionDijkstra {
    /**
     * @param filename: A filename containing the details of the city road network
     * @param sA, sB, sC: speeds for 3 contestants
    */	
	// A Java program for Dijkstra's single source shortest path algorithm.
	// The program is for adjacency matrix representation of the graph
	

	public class Edge{
		double weight;
		int	destVertex;
		Edge(int destVertex, double weight){
			this.destVertex = destVertex;
			this.weight = weight;
		}
	}
	
	
	HashMap<Integer, List<Edge>> Vertices = new HashMap<Integer, List<Edge>>();
	
	
	int numOfVertices = 0;
	int sA, sB, sC = 50;
	
	
	
    CompetitionDijkstra (String filename, int sA, int sB, int sC){
    	
    	
    	this.sA = sA;
    	this.sB = sB;
    	this.sC = sC;
    	
    	this.parseData(filename);
//    	dijkstra(2);
    	
    	
    	
    	//TODO
    }
//    LinkedList<CompetitionDijkstra.Edge>[] Vertices = new LinkedList[0];
    
    int min_distance(double[] dist, boolean[] finished) {
    	double min = Integer.MAX_VALUE;
    	// possible problem to note when debugging	
    	int index = 0;
    	for(int i = 0; i < numOfVertices; i++) {
    		if(dist[i] <= min && finished[i] == false) {
    			min = dist[i];
    			index = i;
    		}
    	}
    	return index;
    }	
    
    
    
    private double dijkstra(int src){ 
    	boolean[] finished;
    	finished = new boolean[numOfVertices];
	    
	    for (int i = 0; i < numOfVertices; i++) {
	    	finished[i] = false;
 	    }
    	double[] dist;
    	dist = new double[numOfVertices];
    	for (int i = 0; i < this.numOfVertices; i++) {
    		dist[i] = Integer.MAX_VALUE;
    	}
    	dist[src] = 0;
    	
    	
    	
    	for (int i = 0; i < numOfVertices-1; i++) {
    		int u = min_distance(dist, finished);
    		finished[u] = true;
    		List<Edge> workingEdges = Vertices.get(u);
    		
    		
    		
    		if (workingEdges != null) {
    			for(int j =0; j < workingEdges.size(); j++) {
        			if(!finished[workingEdges.get(j).destVertex]) {
        				int v = workingEdges.get(j).destVertex;
        				double alt = dist[u] + workingEdges.get(j).weight;
        				if (alt < dist[v]) {
        					dist[v] = alt; 
        				}
        			}
        		}
    		}	
    	}
    	double maxNum = 0;
    	for (int j = 0; j < numOfVertices; j++) {	
//    		this.dijkstra(j);
    		for(int i = 0; i < numOfVertices; i++) {
        		if (dist[i] > maxNum ) {
        			maxNum = dist[i];
        		}
        		
        		
        		
        	}
    		
    	}
//    	System.out.println(Arrays.toString(dist));
    	return maxNum;
    }
    
    
    private void parseData(String filename) {
    	int numOfVertices = 0 ;
    	
		File a = new File(filename);
	    Scanner input = null;
	    try {
	        input = new Scanner(a);
	    } catch (FileNotFoundException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	    numOfVertices = input.nextInt();
	    this.numOfVertices = numOfVertices;
	    
	    
	    
	    
	    int numOfEdges = input.nextInt();
	    

	    for(int i = 0; i < numOfEdges; i++) {
	    	int originVertex = input.nextInt();
	    	int destVertex = input.nextInt();
	    	double weight = input.nextDouble(); 
	    	ArrayList<Edge> list = new ArrayList<Edge>();
	    	if (Vertices.containsKey(originVertex)){
	    		list = (ArrayList<CompetitionDijkstra.Edge>) 
	    				Vertices.get(originVertex);
	    	}
	    	
	    	Edge workingEdge = new Edge(destVertex, weight);
	    	list.add(workingEdge);
	    	
	    	Vertices.put(originVertex, list);
	    	
	    }		
	    
	    // Test and see if it works (Delete later)

//	    
	}

    
	/**
    * @return int: minimum minutes that will pass before the three contestants can meet
     */
    public int timeRequiredforCompetition(){
    	
    	double maxNum = 0;
    	
    	
    	
    	
    	for (int j = 0; j < numOfVertices; j++) {	
    		double dijkstra = dijkstra(j);
        		if ( dijkstra > maxNum) {
        			maxNum = dijkstra;
        		if (dijkstra == Integer.MAX_VALUE) {
        			return -1;
        		}
        	}	
    	}
    	
    	int speed = 0;
    	
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
    	
    	
    	
    	int timeTaken = (int)Math.ceil((maxNum*1000)/speed);
    	if (timeTaken == 0) {
    		return 0;
    	}
    
    	return timeTaken;
    	
        //TO DO
        
    }
    public static void main(String[] args) {
    	CompetitionDijkstra CP	= new CompetitionDijkstra("input-J.txt", 60,75,61 );
    	CompetitionFloydWarshall WP = new CompetitionFloydWarshall("input-J.txt", 60,75,61);
    	
    	
    	//System.out.println(CP.numOfEdges); 
    	System.out.println(CP.timeRequiredforCompetition() + " time taken");
    	System.out.println(WP.timeRequiredforCompetition()+ " time taken");
//    	
//    	
    }
}
