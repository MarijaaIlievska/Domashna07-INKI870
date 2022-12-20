package zad05b;

import java.util.Set;
import java.util.TreeSet;

public class Glavna {

	public static void main(String[] args) {
		Set<String> mnozestvo1 = new TreeSet<String> ();
		mnozestvo1.add("bela");
		mnozestvo1.add("crna");
		mnozestvo1.add("crvena");

		Set<String> mnozestvo2 = new TreeSet<String> ();
		mnozestvo2.add("bela");
		mnozestvo2.add("crna");
		mnozestvo2.add("zelena");

		System.out.println("Unija od dvete mnozhestva");
		mnozestvo1.addAll(mnozestvo2);
		System.out.println(mnozestvo1);
	}
}
