/**
 * @(#)Node.java
 *
 *
 * @author 
 * @version 1.00 2017/12/9
 */
import java.util.*;
public class Node {
    private int X;
    private int Y;
    private float cost;
    private ArrayList<Node> neighbors;
    
    
    
    public Node(int x, int y) {
    	X=x;
    	Y=y;
    	neighbors = new ArrayList<Node>();
    }
    public void calculateCost(int targetX, int targetY){
    	int diffX = getX() - targetX;
    	int diffY = getY() - targetY;
    	cost = (float) Math.sqrt(Math.pow(diffX,2) + Math.pow(diffY,2));
    }
    
    public int getX(){
    	return X;
    }
    
    public int getY(){
    	return Y;
    }
    
    public float getCost(){
    	return cost;
    }
    public ArrayList<Node> getNeigbors(){
    	return neighbors;
    }
    public void setX(int x){
    	X=x;
    }
    
    public void setY(int y){
    	Y=y;	
    }
    
    public void setCost(float c){
    	cost=c;
    }
    

    	
}
