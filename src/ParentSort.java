import java.util.Arrays;

public abstract class ParentSort {
	
	//abstract class has an element in it that is abstract
	
	private int [] myList;
	private String whichSort;
	public ParentSort (int [] l, String sortName) {
		myList = l;
		whichSort = sortName;
	}
	public void swap(int place1, int place2){
		int temp = myList[place2];
		myList[place2] = myList[place1];
		myList[place1] = temp;
		
		
	}
		
	public String toString() {
		String s = "";
		s += whichSort + ": ";
		return s+= Arrays.toString(myList);
	}
	public int[] getList(){
		return myList;
	}
	
	//add additional interface
	public int getElement(int whichE) {
		return myList[whichE];
	}
	
	public void setElement(int whichE, int val) {
		myList[whichE] = val;
	}
	
	public int getLength() {
		return myList.length;
	}
	public abstract void executeAlgorithim(); //no curly brackets – is an abstract
	
	public String getSortName() {
		return whichSort;
	}
}
