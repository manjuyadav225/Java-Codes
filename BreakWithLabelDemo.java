public class BreakWithLabelDemo {
    public static void main(String[] args) {
		
		int[][] arrayOfInts = {
				{2,4,8,16},
				{4,8,16,32},
				{12,24,48,96}};
		
		int searchFor = 12;
		int i=0,j=0;
		boolean foundIt = false;
		
		//search:
			for(i=0; i<arrayOfInts.length; i++)
			{
				for(j=0; j<arrayOfInts[i].length; j++)
				{
					//System.out.println(arrayOfInts[i][j]);
					if(arrayOfInts[i][j] == searchFor)
						{
						foundIt = true;
						//System.out.println(arrayOfInts[i][j]);
						break;
					    //break search;
						}
				}
			}
		
		if(foundIt)
			System.out.println("Found " +searchFor+ " at " +i+ "," +j);
		else
			System.out.println(searchFor + " not in the array");
		

	}

}
