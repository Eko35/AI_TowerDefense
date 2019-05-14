/**
 * @(#)PathFinder.java
 *
 *
 * @author 
 * @version 1.00 2017/12/9
 */
import java.util.*;
public class PathFinder {
		ArrayList<Node> open;
		ArrayList<Node closed;
		int startX;
		int startY;
		int endX;
		int endY;
        rectGraph graph;
    
    public PathFinder(rectGraph graph, int startX, int startY, int endX, int endY) {
    	this.graph = graph;
    	this.startX = startX;
    	this.startY = startY;
    	this.endX = endX;
    	this.endY = endY;
    	open = new ArrayList<Node>();
    	closed = new ArrayList<Node>();
    }
    

    
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
