public class Animal{
    public String name;
    public int numLegs;
    public Animal(String name, int numLegs){
	this.name = name;
	this.numLegs = numLegs;
    }
    public String toString(){
	return name + " " + numLegs;
    }
    public int getLegs(){
	return this.numLegs;
    }
}
