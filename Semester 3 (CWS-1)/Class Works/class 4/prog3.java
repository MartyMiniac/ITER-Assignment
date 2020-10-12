
public class prog3
{
	public static void main(String args[])
	{
		StringBuilder strl = new StringBuilder("Rashimi Rekha Sahoo"); 
		System.out.println("string1 - " + strl); 
		
		// returns the current capacity of the string Builder 1 
		System.out.println("Old Capacity = " + strl. capacity()); 
		/* increases the capacity, as needed, to the specified amount in the 
		given StringBuiIder object */ 
		// returns twice the capacity plus 2 
		
		strl.ensureCapacity(40) ; 
		System.out.println("New Capacity = " + strl. capacity()); 
		StringBuilder str2 = new StringBuilder("compile online");
		System.out.println("String2  = " + str2); 
		
		// returns the current capacity of string Builder 2 
		System.out.println("Old Capacity = " + str2. capacity()); 
		/* returns the old capacity as the capacity 
		old capacity */ 
		str2.ensureCapacity(29);
		
		System.out.println("New Capacity = "+ str2.capacity());
	}
}
