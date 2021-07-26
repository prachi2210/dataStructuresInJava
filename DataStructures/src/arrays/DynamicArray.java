package arrays;

public class DynamicArray {

	private int length;
	private Object data[];

	public DynamicArray() {
		length = 0;
		data = new Object[1];
	}

	public Object getItemsofArray(int index) {
		return data[index];
	}

	public Object addItemsToArray(Object obj) {

		resizeIfFull();

		data[length] = obj;
		length++;

		return obj;
	}
	
	public void addItemsToIndex(int index, Object obj)
	{
		resizeIfFull();
		
		for(int i = index; i<length-1; i++)
		{
		data[i] = data[i+1];
		
		}
		
		for(int i = 0; i<length; i++)
		{
			System.out.println("Shifted "+getItemsofArray(i));
		}
		
		
		data[index] = obj;
		
		length++;
	}
	
	
	

	public void resizeIfFull() {


		if (length < data.length) {
			

			return;

		}

		Object biggerArray[] = new Object[2 * data.length];

		for (int i = 0; i < data.length; i++) {
			biggerArray[i] = data[i];

		}

		data = biggerArray;


		
	}

	public static void main(String[] args) {

		DynamicArray obj = new DynamicArray();

		obj.addItemsToArray("Hii");
		obj.addItemsToArray("I");
		obj.addItemsToArray("am");
		obj.addItemsToArray("Prachi");

		obj.addItemsToIndex(1, "you");
		
		
		for(int i = 0; i<obj.length-1; i++)
		{
			System.out.println(obj.getItemsofArray(i));
		}


	}
	
	
	
	

}
