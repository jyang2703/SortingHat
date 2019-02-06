
public class InsertionSort extends ParentSort {

	public InsertionSort(int[] l, String sortName) {
		super(l, sortName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executeAlgorithim() {
		// TODO Auto-generated method stub
		
		for(int i = 1; i < this.getLength(); i++) {
		int j = i;
				while (j > 0 && this.getElement(j) < this.getElement(j-1)) {
					swap(j, j-1);
					j--;
					//System.out.println(this);
				}
		
		}
	}

}
