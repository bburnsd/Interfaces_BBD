package Program2;

interface Priority{
	public void setPriority(int priority);
	public int getPriority();
	final int MED_PRIORITY =5;
	final int MIN_PRIORITY =1;
	final int MAX_PRIORITY = 10;
	
}
public class Task implements Priority{
protected String name;
protected int priority;

public Task(String name) { //basic setup for task
	this.name=name;
	this.priority=MED_PRIORITY;
}

public void setPriority(int priority) {//sets priority
	this.priority=priority;
}

public int getPriority() { //returns priority
	return priority;
}

public String getName() { //returns name
	return name;
}
public void setName(String name) { //sets name
	this.name=name;
}
//compareTo returns the higher priority of the two processes
public int compareTo(Process processID) {
	if(processID.priority>this.priority)
		return processID.priority;
	else
		return this.priority;
}
public String toString() { //returns task info
	String strng = "Task name: " + name + "\nPriority: " + priority;
	return strng;
}












}


