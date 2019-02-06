
public class BubbleSort extends ParentSort {

	public BubbleSort(int[] l, String name) {
		super(l, name);
		// TODO Auto-generated constructor stub
	}
	
	//one case
	private boolean bubbleIt(int end) {
			boolean didSwap = false;
			for(int i  = 0; i < end; i++) {
				
				
				if (super.getElement(i) > super.getElement(i+1)) {
					
					swap(i, i+1);
					didSwap = true;
				} 
				
			}
			return didSwap;
			
	}

	@Override
	public void executeAlgorithim() {
		// TODO Auto-generated method stub
		
		boolean notDone = true;
		int bubbleEnd = super.getList().length - 1;
			
		do {
			//System.out.println("Hi in executeAlgorithm and bubbleEnd is " + bubbleEnd);
			notDone = bubbleIt(bubbleEnd);
			if(notDone) {
				bubbleEnd -=1;
				//System.out.println("We are not done with Bubble Sort");
			} else {
				//System.out.println("We are done");
			}
			
			//System.out.println(this);
		} 
		
		while(notDone && bubbleEnd >= 1);

		
		
		}
	
	

}
