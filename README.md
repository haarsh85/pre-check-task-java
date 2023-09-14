# Pre-Check Task Java

Matriculation Number: 7218924 <br />
GitHub Link: https://github.com/haarsh85/pre-check-task-java.git

# Development Environment:

- java 20.0.2 2023-07-18
Java(TM) SE Runtime Environment (build 20.0.2+9-78)
Java HotSpot(TM) 64-Bit Server VM (build 20.0.2+9-78, mixed mode, sharing)

-	IDE
Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
Version: 2023-06 (4.28.0)

# Solution Description:
The project consists of 02 java files (Participant.java, ParticipantTest.java). The contents explained below for each file.

Participant.java
-	Code is packaged for better organization.
-	Imported ArrayList and List using the java.util package for use during the implementation.
-	Created class Participant using the respective attributes.
-	Used List to store awards.
-	Created constructor with name, surname, age, sportType. Awards are included outside of constructor parameters to ensure all participants have empty list of awards during creation. Assumption: There can be participants without any awards.
-	Added necessary getters to get the values during the implementation. No setters were used since objects will not be changed after creation. 
-	“addAwards” method is used to  add awards to the participants.

ParticipantTest.java
-	This has the main method, which is used to run the code.
-	Created an array to hold only 5 participants and added participants to each index. All participants have awards except for the participant at index 3.
-	Filtering criteria is defined using the sportTypeFilter, nationalAwardsFilter, internationalAwardsFilter variables.
-	Used for loop to iterate through the participants array and count the number of national and international awards. 
-	Declared condition to filter the respective participant based on the given conditions. This checks both the type of sport and whether a participant has equal or greater number of awards. If matched, participant’s name, surname, age, number of national and international awards are displayed. 
-	If a participant is not available, a message is displayed. 
