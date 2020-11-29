
public class Harry extends ConcreteObserver implements Runnable{

loc l;
	
Harry(Subject subject) {
		
	super(subject);
	
	//this.l = l1;
	Thread t = new Thread(this);
	t.start();
}
	
	public void run() {
		
		while(true)
		{

//		if(l.getState()=="Library") {
//			System.out.println("Found Hermione!");
//			break;
//			}
			
		}
	}
	
//	public void update(int sec) {
//		
//		if (sec>5)
//		{
//			System.out.println( "You have been caught... and the Marauder’s map has been confiscated.");
//			System.exit(0); 
//		}
//		System.out.println( sec +" minute passed...");
//		if(sec==5)
//		{
//			System.out.println( "Hide map contents before you get caught!...");
//		}
//		
//	
// }
}
