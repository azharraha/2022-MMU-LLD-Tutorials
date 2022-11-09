// SingletonPatternEx.java
package singleton.pattern.demo;

class MakeACaptain
{
	//private static MakeACaptain _captain; 
	//We make the constructor private to prevent the use of "new"
	private MakeACaptain() { } 
	
    private static class SingletonHelper {
        //Nested class is referenced after getCaptain() is called
        private static final MakeACaptain _captain = new MakeACaptain();
    }   //end class SingletonHelper

    /*
    //Thread Safe #1: Using Synchronized
    public static synchronized MakeACaptain getCaptain()
    {
        return SingletonHelper._captain;
    } 
    */    

    //Thread Safe #2: Using Eager Initialization
    private static MakeACaptain _captain = new MakeACaptain();

    public static MakeACaptain getCaptain() {
        return _captain;
    }

} //end class MakeACaptain

class SingletonPatternEx
{ 
	public static void main(String[] args)
    { 
		System.out.println("***Singleton Pattern Demo***\n");		
		System.out.println("Trying to make a captain for our team");
		//Put your code here

        MakeACaptain c1 = MakeACaptain.getCaptain();
        System.out.println("Trying to make another captain for our team");

        MakeACaptain c2 = MakeACaptain.getCaptain();
        if(c1 == c2) {
            System.out.println("c1 and c2 are same instance");
        }
	} 
}
