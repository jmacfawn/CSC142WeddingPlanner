/**
 * 
 */

/**
 * @author jmacfawn
 *
 */
public class Table {

	private int mSize;
	private int nSize;
	private int numOfGuests;
	
	/**
	 * @param m Max table size
	 * @param n Max table size - 1
	 */
	public Table(int m, int n)
	{
		mSize = m;
		nSize = m - 1;
		numOfGuests = n;
	}
	
	public int getMTableSize()
	{
		return mSize;
	}
	
	public int getNTableSize() 
	{
		return nSize;
	}

}
