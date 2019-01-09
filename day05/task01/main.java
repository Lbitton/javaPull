


public class main{
    public static void main(String[] args){
	ReadWrite RW = new ReadWrite();
	RW.ReadFile("test");
        RW.printRead();
	RW.setToWrite("Hello World\nFoo Bar\n" + RW.getRead());
	RW.WriteFile("test2", true);
	RW.setToWrite("nothingness");
	RW.WriteFile("test2", true);
	RW.ReadFile("test2");
	RW.printRead();
    }
}

