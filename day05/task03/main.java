



public class main{
    public static void main(String[] args){
	Toy t1 = new Toy("Buzz Lightning", "Space toy", 45.69);
	Game g1 = new Game("Tomb Raider", "Plateformer", 23.45); 
	System.out.println(g1.toStrong());
	
	Serialize<Toy> s = new Serialize<Toy>();
	Serialize<Game> z = new Serialize<Game>();
					  
	s.SerializeFile("t1", t1);
	z.SerializeFile("g1", g1);
	s.UnserializeFile("t1");
	z.UnserializeFile("g1");
        Toy t = (Toy) s.getUnserialized();
	Game g = (Game) z.getUnserialized();
	System.out.println(t.toString());
	System.out.println(g.toStrong());
    }


}
