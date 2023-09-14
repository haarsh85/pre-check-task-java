package com.pre.check.java;

import java.util.List;

public class ParticipantTest {
	
	public static void main (String[] args) {
		
		//Array of Participants
		Participant[] participants = new Participant[5];
		
		//Adding participant details and awards
		participants[0] = new Participant("Michael", "Phelps", 25, "Swimming");
		participants[0].addAwards("Olympic Swimming Award - International");
		participants[0].addAwards("World Swimming Award - International");
		participants[0].addAwards("Swimming Award - National");
		
		participants[1] = new Participant("Venus", "Williams", 28, "Tennis");
		participants[1].addAwards("World Tennis Award - International");
		participants[1].addAwards("Tennis Award - National");
		participants[1].addAwards("Tennis Award - National");
		
		participants[2] = new Participant("William", "Robinson", 30, "Swimming");
		participants[2].addAwards("World Swimming Award - International");
		participants[2].addAwards("Swimming Award - National");
		participants[2].addAwards("Swimming Award - National");
		
		participants[3] = new Participant("Simone", "Biles ", 22, "Gymnastics");
		
		participants[4] = new Participant("Larisa", "Latynina", 20, "Gymnastics");
		participants[4].addAwards("Olympic Gymnastics Award - International");
		participants[4].addAwards("World Gymnastics Award - International");
		
		//Setting filtering criteria
		String sportTypeFilter = "Swimming";
		int nationalAwardsFilter = 2;
		int internationalAwardsFilter = 1;
		boolean participantAvailable = false;
		
		System.out.println("Participant Details: ");
		
		//Looping through participants
		for (int i=0; i < participants.length; i++) {
			Participant participant = participants[i];
			int nationalAwardCount = 0;
			int internationalAwardCount = 0;
			
			//Get awards for participants
			List<String> awards = participant.getAwards();
			
			//Checking if the award is National or International
			for (int j=0; j < awards.size(); j++) {
				String award = awards.get(j);
				if (award.contains("National")) {
					nationalAwardCount++;
				}
				else if (award.contains("International")) {
					internationalAwardCount++;
				}
			}
			
			//Conditions to filter participants
			if (participant.getSportType().equals(sportTypeFilter) && nationalAwardCount >= nationalAwardsFilter && internationalAwardCount >= internationalAwardsFilter) {
				System.out.println("First Name: " + participant.getName() + "\n" + "Surname: " + participant.getSurname() + "\n" + "Age: " + participant.getAge() + "\n" + "National Awards: " + nationalAwardCount + "\n" + "International Awards: " + internationalAwardCount + "\n");
				participantAvailable = true;
			}
			
		}
		
		//When no participant match with above conditions
		if (!participantAvailable) {
			System.out.println("No participants available for teh conditions");
		}

		
	}

}
