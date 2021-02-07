/**
 * CatOps
 * 
 * @diego-ruben-cruz
 * @06-02-2021
 */
public class CatOps
{
    /**
     * Utility method that shortens system.out.println
     *
     * @param  input  the input for the 
     */
    public static void sopln(String input) {
		System.out.println(input);
	}

  /**
     * Main method used to test the Cat class.
     */
   public static void main(String[] args){
       // Build Artyom, cute cat from LifeOfBoris YT Channel.
       Cat artyom = new Cat(2);
      // Fetch Artyom's Age
      int artyomAge = artyom.getAge();
       
      // Print out basic output message describing Artyom and what he does.
       sopln("Artyom is a youthful cat, with only " + artyomAge + " years of life so far...");
       sopln("He is quite the curious cat, and a great defense against Vadim stealing the cookies that Boris bought");

}
}