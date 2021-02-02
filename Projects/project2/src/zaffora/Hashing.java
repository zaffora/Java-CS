
package  zaffora;

public class Hashing<T> {
	
	
	public int getIntForString(String Str) {
		
		int result = 0;
		
		for(int i =0; i < Str.length(); i++)
		{
			char c = Str.charAt(i);
			int value = c;
			result = result + value;
			
		}
		
		return result;
	}
	
	
	public int getHashIndexfromString(String str, int hashlength)
	{
		   int sum = getIntForString(str);
		   int hashIndex = sum % hashlength;
		   
		   if (hashIndex < 0)
			{
				hashIndex = hashIndex + hashlength;
			} // end if

			return hashIndex;
	
	}
	
	public int getHashIndex(T key, int hashlength)
	{
		int hashIndex = key.hashCode() % hashlength;
		
		if (hashIndex < 0)
		{
			hashIndex = hashIndex + hashlength;
		} // end if

		return hashIndex;
	} // end getHashIndex
	
	

}
