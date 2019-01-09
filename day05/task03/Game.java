
import java.io.Serializable;

public class Game implements Serializable{
    private String name, comment;
    private double price;

    public Game(String _name, String _comment, double _price){
	name = _name;
	comment = _comment;
	price = _price;
    }

    public String toStrong(){
	return "Nom du jeu : " + name + "\n Style de jeu : " + comment + "\n Prix du jeu : " + price + "\n"; 
    }

}
