/**
 * Cat
 * 
 * @diego-ruben-cruz
 * @06-02-2021
 */
public class Cat
{
    private int age;
    
    /**
     * Basic constructor that takes input of user with respect to age.
     *
     * @param  ageToInit  The age that will be assigned to the cat object.
     */
    public Cat(int ageToInit){
        this.age = ageToInit;
    }

    /**
     * Utility operation to fetch the age of the cat.
     *
     * @return  the age of the cat.
     */
    public int getAge(){
        return this.age;
    }
}