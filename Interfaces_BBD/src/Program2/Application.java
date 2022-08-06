package Program2;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Task task1 = new Task("Listen to music");
Process gchrome = new Process("google_chrome.exe");
System.out.println(task1.getName());
System.out.println(gchrome.getProcessID());
System.out.println(task1.toString());
System.out.println(gchrome.toString());
gchrome.setPriority(1);
Process process2 = new Process("discord.exe");
System.out.println(gchrome.toString());
System.out.println(gchrome.compareTo(process2));
	}

}
