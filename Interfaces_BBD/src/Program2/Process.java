package Program2;

public class Process implements Priority {
protected String processID;
protected int priority;
public void setPriority(int priority) { //sets priority
	this.priority=priority;
}
public int getPriority() { //returns priority
	return this.priority;
}

public int compareTo(Process processID) { //compares processes and returns higher priority
	if(processID.priority>this.priority)
		return processID.priority;
	else
		return this.priority;
}
public Process(String processID) { //basic setup for process
	this.processID=processID;
	this.priority=MED_PRIORITY;
}
public String getProcessID(){ //returns processID
	return this.processID;
}
public String toString() { //returns the process info
	String strng = "Process: " + processID + "\nPriority: " + priority;
	return strng;
}







}
