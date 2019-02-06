import java.util.Arrays;

public class SelectionSort extends ParentSort {
	
	//data handled in higher class
	
	public SelectionSort(int[] l, String name) {
		super(l, name);
	}
	
	
	
	public void executeAlgorithim() {
		

		int biggest = super.getElement(0);
		int bigLoc = 0;
		
		for(int j = getList().length; j > 0; j--) {
			
			biggest = super.getElement(0);
			bigLoc = 0;
			
		for(int i = 0; i < j; i++) {
			if( biggest < super.getElement(i)) {
				biggest = super.getElement(i);
				bigLoc = i;
			}
		}
		
		swap(bigLoc, j-1);
		}
		//System.out.println(Arrays.toString(super.getEleme));
		
	}
	
	
}
