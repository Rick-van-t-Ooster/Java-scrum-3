package hoofdstuk11.quiz5;

public class Subklasse extends Superklasse {
	int mijnMethode (int i, int i2)
	{
		return mijnMethode(i) + x + i2;
	}
	public static void main(String[] args)
	{
		Subklasse subK = new Subklasse();
		System.out.print(subK.mijnMethode(2,8));
	}

}
