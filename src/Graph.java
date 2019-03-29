import java.util.ArrayList;
import java.util.List;

public class Graph {
	List<Vertex> V;
	List<Edge> E = new ArrayList<Edge>();
	
	public Graph(List<Edge> edges) {
		this.E = edges;			
	}
	
	// use E.set(5,(edge)) para adicionar no quinto espaço do vetor
	// use E.get(5) para saber o valor do quinto espaço do vetor
	public List<Edge> ordenate(){
						
		return null;
	}
	
	public List<Edge> Kruskal(){
		List<List<Edge>> floresta = createFloresta();
		
		for(Edge e : this.E ) {
			List<Edge> aux = new ArrayList<Edge>();
			aux.add(e);
			floresta.add(aux);			
		}
		
		return floresta.get(0);
	}
	
	public List<List<Edge>> createFloresta(){
		List<List<Edge>> floresta = new ArrayList<List<Edge>>();		
		for(Edge e : this.E ) {
			List<Edge> aux = new ArrayList<Edge>();
			aux.add(e);
			floresta.add(aux);			
		}
		
		return floresta;
	}
	

}
