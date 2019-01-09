

import java.io.Serializable;

public class Toy implements Serializable{

    private String name;
    private String comment;
    double price;

    public Toy(String _name, String _comment, double _price){
	name = _name;
	comment = _comment;
	price = _price;
    }

    public String toString(){
	return "Nom du jouer : " + name + "\n Style de jouet : " + comment + "\n Prix du jouet : " + price + "\n";
    }
    
}
