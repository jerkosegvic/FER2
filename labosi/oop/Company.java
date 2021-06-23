package lab4;

import java.util.ArrayList;
import java.util.HashMap;
///import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Company {
	String name;
	Map<String, Worker> teamCoordinators;
	Map<String, List<Worker>> teamGroup;
	public Company(String name , ArrayList<Worker> workers) {
		this.name = name;
		teamCoordinators  = new HashMap<String, Worker>();
		teamGroup = new HashMap<String, List<Worker>>();
		teamGroup.put("Unsorted" , workers);
	}
	
	public String getName() {
		return this.name;
	} 
	public Map<String, Worker> getTeamCoordinators(){
		return this.teamCoordinators;
	}
	public Map<String, List<Worker>> getTeamGroup(){
		return this.teamGroup;
	} 
	public boolean createNewTeam(String team, Worker teamCoordinator) {
		if(teamCoordinators.containsKey(team)) {
			return false;
		}
		else {
			teamCoordinators.put(team, teamCoordinator);
			//List<Worker> ls = new List<Worker>();
			teamGroup.put(team, new ArrayList<Worker>() );
			return true;
		}
	}
	public void addWorkerToTeam(String oldTeam, String newTeam, String id) {
		for(Worker wr : teamGroup.get(oldTeam)) {
			if(wr.getId() == id) {
				teamGroup.get(newTeam).add(wr);
				teamGroup.get(oldTeam).remove(wr);
				break;
			}
		}
	}
	public void reviseTeam(String teamName) {
		/*
		Iterator<Worker> it = teamGroup.get(teamName).iterator();
		while(it.hasNext()) {
			Worker wr = it.next();
			if(wr.getYearOfExperience() > teamCoordinators.get(teamName).getYearOfExperience()) {
				Worker cord = new Worker(wr.getId() , wr.getName() , wr.getYearOfExperience());
				teamGroup.get(teamName).remove(wr);
				teamGroup.get(teamName).add(teamCoordinators.get(teamName));
				teamCoordinators.put(teamName, cord);
		}

		}
		*/
		for(Worker wr : teamGroup.get(teamName)) {	
			if(wr.getYearOfExperience() > teamCoordinators.get(teamName).getYearOfExperience()) {
				Worker cord = new Worker(wr.getId() , wr.getName() , wr.getYearOfExperience());
				teamGroup.get(teamName).remove(wr);
				teamGroup.get(teamName).add(teamCoordinators.get(teamName));
				teamCoordinators.put(teamName, cord);
			}
		}
	} 
}
