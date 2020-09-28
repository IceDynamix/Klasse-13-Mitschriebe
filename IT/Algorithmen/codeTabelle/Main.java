package IT.Algorithmen.codeTabelle;

public class Main {

	public static void main(String[] args) {

		// Aufgabe: Rotiere ein Array nach links oder rechts

		String[][] a = { { "A1", "A2", "A3", "A4" }, { "B1", "B2", "B3", "B4" }, { "C1", "C2", "C3", "C4" } };
		CodeTabelle c = new CodeTabelle(a);
		System.out.println(c);
		c.rotate(false);
		System.out.println(c);

	}

}
