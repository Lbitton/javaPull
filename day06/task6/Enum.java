
import java.util.*;


public class Enum{

    public enum Bullet{
	HEAD,
	BODY,
	CASING,
	POWDER
    }

    public enum Body{
	CANON("Un joli M125 double barrel"),
	CRAWLER("Les chenilles pour avancer"),
	COCKPIT("Living space"),
	FRONT_PLATING("avant"),
	BACK_PLATING("arrière"),
	SIDE_PLATING("cotés");

        private String str;

	Body(String thisStr){
	    this.str = thisStr;
	}

	public String getStr(){
	    return str;
	}
    }
	public enum Canon{
	    INUT(Arrays.asList(Bullet.CASING, Bullet.HEAD)),
	    GTRET(Arrays.asList(Bullet.CASING, Bullet.BODY)),
	    GALAHAD(Arrays.asList(Bullet.CASING, Bullet.POWDER));


	    private List<Bullet> data;

	    Canon(List<Bullet> data){
		this.data = data;
	    }

	    public List<Bullet> getData(){
		return this.data;
	    }
    
	    //List<Bullet> canon = new ArrayList<Bullet>();
	}

    public static void main(String[] args){

	for(Bullet bullet : Bullet.values()){
	    System.out.println(bullet);
	}
	
	System.out.println("");
	
	for(Body body : Body.values()){
	    System.out.println(body.getStr());
	}

	for(Canon canon : Canon.values()){
	    System.out.println(canon.getData());
	}
    }

}
