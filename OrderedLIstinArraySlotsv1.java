public class List_inArraySlots_v1{
    // ===========================================================
    // FIELDS
    private ArrayList refArray;

    private static final int INITIAL_CAPACITY = 10;

    public List_inArraySlots_v1(){
        this.refArray = new int[INITIAL_CAPACITY];
        filledElements = 0;
    }

    // ===========================================================
    // CONSTRUCTORS

    /*
    To instantiate an array according to an existing array
    precondition: existing array does not have null elements
    */
    public List_inArraySlots_v1(int[] existingArray){
        this.refArray = existingArray;
    }


    // ===========================================================
    // METHODS from v0

    public int size(){
    return refArray.length;
    }

    /**
    @return a string representation of this list,
    in [a,b,c,] format
    */
    public String toString() {
        String ans = "[";
        for(int index = 0; index<filledElements; index++){
            ans += refArray[index] + ",";
        }

        ans += "]";
        return ans;
    }


    /**
    Appends @value to the end of this list.
    @return true, in keeping with conventions yet to be discussed
    */
    public boolean add( int value) {
        // first check if the list is already full
        // then add the value
        refArray += value;
        return true;
    }


    /**
    Double the capacity of the List_inArraySlots,
    preserving existing data
    */

    // ===========================================================
    // METHODS from v1

    /**
    accessor
    @return element @index from this list
    precondition: @index is within the bounds of the array.
    (Having warned the user about this precondition,
    you should NOT complicate your code to check
    whether user violated the condition.)
     */
    public int get( int index ) {
        return refArray[index];
    }

    /**
    Store et value at @index to @newValue
    @return old value at @index
    @precondition: @index is within the bounds of this list.
    */
    public int set( int index, int newValue ) {
        // store old value in local variable to return later
        int oldValue = refArray[index];

        // assign new value
        refArray[index] = newValue;

        return oldValue;
    }
    
    
    /**
      Remove the element at position @index in this list.
      Shift any subsequent elements to the left (that is,
      decrease the index associated with each).
      @return the value that was removed from the list
     */
     public int remove( int index) {
        int removed = refArray[index];

        for( ; index < refArray.length; index++){
            // set the element to the value of the element to the left
            refArray[index] = refArray[index + 1];
        }
        
        return removed;
     }


    /**
    Insert @value at position @index in this list.
    Shift the element currently at that position (if any)
    and any subsequent elements to the right
    (that is, increase the index associated with each).
    */
    public void add( int index, int value) {

        // keep track of element being moved and element that will be replaced
        int elemReplaced = 0;
        int elemShifting = refArray[index];

        // set the new value to given index
        refArray[index] = value;   


        //expand if necessary
        if (filledElements >= refArray.length) expand();

        // shift the rest of the elements by...
        for ( ++index; index < filledElements; index++){
            //  keep track of the element that will be replaced
            elemReplaced = refArray[index];

            // now replace with the element you were shifting
            refArray[index] = elemShifting;

            //update the element you are elemShifting
            elemShifting = elemReplaced;
        }
		
		public void addAsHead(int value){
			this.add(0, value);
		}
        
        
    }

}
