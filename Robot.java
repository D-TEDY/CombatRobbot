package devoir2;

public class Robot {
	private String nom;
	private int nbrVie;
	
	public Robot()

	public Robot(String n)
	{ this.nom= "Robot " + n;
	this.nbrVie=10;}
	

	public void setnom(String n) {
		this.nom=n;
	}
	public void setnbrVie(int n) {
	 this.nbrVie=n;
	}
	
	public String getnom() {
		return nom;
	}
	
	public int getnbrVie() {
		return nbrVie;
	}
	 public void fire(Robot R)
	 {
		 R.nbrVie=R.nbrVie-2;
		 System.out.println(R.nom +" a ete touché par " + this.nom);
	 }
	 
	 public void fire(Fighter F)
	 {
		 F.setnbrVie(F.getnbrVie()-2);
		 System.out.println(F.getnom() +" a ete touché par " + this.nom);
	 }
	 
	 public boolean isDead() {
		 boolean etat=false;
		 if(this.nbrVie<=0) {etat=true;}
		 else {etat=false;}
			 return etat;
	 }
	

}
