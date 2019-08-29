package ar.edu.itba.sia.gps.searchAlgorithms;

import java.util.List;

import ar.edu.itba.sia.gps.GPSNode;
import ar.edu.itba.sia.gps.api.Heuristic;

public class AStar implements SearchAlgorithmLogic {

	@Override
	public void pushNode(List<GPSNode> frontierNodes, List<GPSNode> allNodes, GPSNode node, Heuristic h){
		
		//streamear
		frontierNodes.add(node);
		frontierNodes.sort((n1,n2)-> (n1.getCost() + h.getValue(n1.getState()))  - (n2.getCost() + h.getValue(n2.getState())));
	}
	
	
}
