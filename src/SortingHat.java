import java.util.Arrays;

public class SortingHat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int howMany = 1000;
		
		int[ ] nums = getRandom(howMany);
		int[] nums0 = getAscendingOrder(howMany);
		//int [] nums1 = nums0.clone();
		int [] nums3 = getDescendingOrder(howMany);
		int [] nums3A = nums3.clone();
		
		//int[ ] nums2 = getRandom(howMany);
	
		
		
		BubbleSort bSort = new BubbleSort(nums3, "Bubble Sort");
		//SelectionSort sSort = new SelectionSort(nums0, "Selection Sort");
		//System.out.println(sSort);
		//doTiming(sSort);
		doTiming1(bSort);
		
		//InsertionSort inS = new InsertionSort(nums0, "Insertion Sort Best");
		//doTiming(inS);
		
		InsertionSort inSW = new InsertionSort(nums3A, "Insertion Sort Worst");
		doTiming2(inSW);

		//bSort.executeAlgorithim();
		//sSort.executeAlgorithim();
		
		//Tiiming
		
		
		
		
		
	}
	
	public static void doTiming(ParentSort s) {
		
		System.out.println("Before " + s);
		long start = System.currentTimeMillis();
		long start2 = System.nanoTime();
		
		s.executeAlgorithim();
		
		long end = System.currentTimeMillis();
		long end2 = System.nanoTime(); 
		long theTime = end-start;
		long theTime2 = end2-start2;
		
		if(s.getLength() < 100) {
			System.out.println("Time for selection  sort on " + s.getLength() + " numbers is: " + (theTime2) + " nano seconds");
			System.out.println("After" + s);
			} else {
				System.out.println("Time for selection sort on " + s.getLength() + " numbers is: " + (theTime) + " milliseconds");
				
			}
	}
		public static void doTiming1(ParentSort b) {
			System.out.println("Before " + b);
			
			long start = System.currentTimeMillis();
			long start2 = System.nanoTime();
			
			b.executeAlgorithim();
			
			long end = System.currentTimeMillis();
			long end2 = System.nanoTime(); 
			long theTime = end-start;
			long theTime2 = end2-start2;
			
			if(b.getLength() < 100) {
				System.out.println("Time for bubble sort on " + b.getLength() + " numbers is: " + (theTime2) + " nano seconds");
				System.out.println("After: " + b);
				} else {
					System.out.println("Time for bubble sort on " + b.getLength() + " numbers is: " + (double)(theTime) + " milliseconds");
					System.out.println("After: " + b);
				}
	}
		public static void doTiming2(ParentSort inS) {
			System.out.println("Before " + inS);
			
			long start = System.currentTimeMillis();
			long start2 = System.nanoTime();
			
			inS.executeAlgorithim();
			
			long end = System.currentTimeMillis();
			long end2 = System.nanoTime(); 
			long theTime = end-start;
			long theTime2 = end2-start2;
			
			if(inS.getLength() < 100) {
				System.out.println("Time for insertion sort on " + inS.getLength() + " numbers is: " + (theTime2) + " nano seconds");
				System.out.println("After: " + inS);
				} else {
					System.out.println("Time for insertion sort on " + inS.getLength() + " numbers is: " + (double)(theTime) + " milliseconds");
					System.out.println("After: " + inS);
				}
	}
		
	public static int[] getRandom(int n){
		
		int[] nList = new int[n];
		for(int i = 0; i< nList.length; i++) {
			nList[i] = (int)(Math.random() * 1000);
		}
		
		
		return nList;
	}

	public static int[] getAscendingOrder (int n) {
		int [] nList = new int[n];
		for(int i = 0; i < nList.length; i++) {
			nList[i] = (int)(i);
		}
		return nList;
	}
	public static int[] getDescendingOrder (int n) {
		
		
		int [] nList = new int[n];
		for(int i = 0; i < nList.length; i++) {
			nList[i] = nList.length - i;
		}
		return nList;
	}
}
