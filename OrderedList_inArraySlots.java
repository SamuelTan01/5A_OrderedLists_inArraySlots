public class OrderedList_inArraySlots{
	// ==================================================
	// FIELDS
	private List_inArraySlots list;
	
	// ==================================================
	// CONSTRUCTORS
	public OrderedList_inArraySlots(){
		list = new List_inArraySlots(); // instantiate empty list
	}

	// ==================================================
	// METHODS

	/**
	  @return string representation of ordered list

	  format: [ element0, element1, element2]

	*/
	public String toString(){
		return "";
	}

	/**
	  @returns index of given value
	*/
	public int getIndex( int val){
		return 0;
	}

	/**
	  @return value of the Object at given index
	 */
	public int get(int index){
		return 0;
	}

	/**
	  Appends @value in the right spot
	*/
	public void add( int value){
	}

	/**
	  Removes given @value from the list

	  @return value removed, by convention
	*/
	public int remove( int value) {
		return value;
	}

	/**
	  Removes value at given @index

	  @return value removed, by convention
	*/
	public int removeAtIndex( int index){
		return 0;
	}
}
