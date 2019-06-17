package hoofdstuk11.quiz4;
//door maarten
public class Subklasse extends SuperA
{
	public Subklasse()
	{
		int x = 0; //als int x niet geïnitialiseerd is runt het programma niet
		x += 2;
		y += 3;
		System.out.print(" x" + x);
		System.out.print(" y" + y);
	}
	public static void main(String[] args) 
	{
	Subklasse subK = new Subklasse();
	}

}
