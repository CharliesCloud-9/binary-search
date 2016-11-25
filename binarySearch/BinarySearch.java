package binarySearch;


public class BinarySearch {
	public int binarySearch(int[] list, int target) {
		int lo = 0, hi = list.length-1, midGuess;
		   
		while (lo <= hi) {				  			//***while loop*** -control flow, using logical operators <=
			midGuess = lo + (hi - lo)/2;			// mid = (low + high) / 2 is same thing pretty much.
			//System.out.println(midGuess); 		optional: this shows the step/guess count.
			
		    if (list[midGuess] == target) { 		//***if statement*** -control flow, using logical operators ==
		    	return midGuess;
		    }
		    else if (list[midGuess] < target) { 	//if guess was less than target, new low will be moved to one position to right of original guess.
		         lo = midGuess + 1;
		    }
		    else									//else if guess was more/higher than target, new hi will be moved to one position to left of original guess.
		         hi = midGuess - 1;
		}
		return -1;									//-1 in case of some program failure like ex: list was not originally sorted before Binary Search was implemented.
	}
	public static void main(String[] args) {
		BinarySearch bsObject = new BinarySearch();
		int[] arrayList = {2,3,6,8,52,57,71,89};
		int target = 89;  							//remember that the halving is not even though its 1-8, but its doing it through 0-7 index, so the number in index 7 will always be... 
						  							//...the maximum steps/guesses due to the fact that when halving, we have to halve with math.floor going a bit to the left at index 3.
		System.out.println("At index: "+ bsObject.binarySearch(arrayList, target));
	}
}
