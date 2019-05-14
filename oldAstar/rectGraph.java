/**
 * @(#)rectGraph.java
 *
 *
 * @author 
 * @version 1.00 2017/12/9
 */


public class rectGraph {
	int width;
	int height;
	Node[][] graph;

    public rectGraph(int w, int h) {
    	width = w;
    	height = h;
    	graph = new Node[w][h];
    	for(int i = 0; i < w; i++){
    		for(int j = 0; j < h; j++){
    			graph[i][j] = new Node(i,j);
    		}
 		}
    }
    public int getWidth(){
    	return width;
    }
    
    public int getHeigth(){
    	return height;
    }
    
    public Node[][] getGraph(){
    	return graph;
    }
    public void neighbor(){
		for(int i = 0; i < getWidth(); i++){
			for(int j = 0; j < getHeigth(); j++){
				if(i == 0 && j == 0){
					graph[i][i].getNeigbors().add(graph[i][j + 1]);
					graph[i][i].getNeigbors().add(graph[i + 1][j]);
				}
				if(i == 0 && j == getHeigth() - 1){
					graph[i][i].getNeigbors().add(graph[i][j - 1]);
					graph[i][i].getNeigbors().add(graph[i + 1][j]);
				}
			
				if(i == getWidth() - 1 && j == getHeigth() - 1){
					graph[i][i].getNeigbors().add(graph[i - 1][j]);
					graph[i][i].getNeigbors().add(graph[i][j - 1]);
				}
				if(i == getWidth() - 1 && j == 0){
					graph[i][i].getNeigbors().add(graph[i - 1][j]);
					graph[i][i].getNeigbors().add(graph[i][j + 1]);
				}
				if(i == 0 && (j > 0 && j < getHeigth() - 1)){
					graph[i][i].getNeigbors().add(graph[i + 1][j]);
					graph[i][i].getNeigbors().add(graph[i][j - 1]);
					graph[i][i].getNeigbors().add(graph[i][j + 1]);
				}
				if((i > 0 && i < getWidth() - 1) && j == getHeigth() - 1){
					graph[i][i].getNeigbors().add(graph[i - 1][j]);
					graph[i][i].getNeigbors().add(graph[i + 1][j]);
					graph[i][i].getNeigbors().add(graph[i][j - 1]);
				}
				if(i == getWidth() - 1 && (j > 0 && j < getWidth() - 1)){
					graph[i][i].getNeigbors().add(graph[i][j - 1]);
					graph[i][i].getNeigbors().add(graph[i][j + 1]);
					graph[i][i].getNeigbors().add(graph[i - 1][j]);
				}
				if(i > 0 && i < getWidth() - 1 && j == 0 ){
					graph[i][i].getNeigbors().add(graph[i - 1][j]);
					graph[i][i].getNeigbors().add(graph[i + 1][j]);
					graph[i][i].getNeigbors().add(graph[i][j + 1]);
				}
				else{
					graph[i][i].getNeigbors().add(graph[i + 1][j]);
					graph[i][i].getNeigbors().add(graph[i - 1][j]);
					graph[i][i].getNeigbors().add(graph[i][j + 1]);
					graph[i][i].getNeigbors().add(graph[i][j - 1]);
				}
			}
		}
    }
}