



public class main{
    public static void main(String[] args){
	Toy t1 = new Toy("Buzz Lékler", "Space Plastok", 36.98);
	Toy t2 = new Toy("Monsieur Patateur", "Mangeable", 23.46);
	Toy t3 = new Toy("Bois", "Garçon vache", 2.5);

	Serialize s = new Serialize();
	s.SerializeFile("serializedFile", t1);
	s.UnserializeFile("serializedFile");
	Toy t = (Toy) s.getUnserialized();
	System.out.println(t.toString());
    }


}
