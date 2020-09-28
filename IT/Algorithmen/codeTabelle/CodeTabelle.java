package IT.Algorithmen.codeTabelle;

public class CodeTabelle {
	public String[][] codeTabelle;

	public CodeTabelle(String[][] codeTabelle) {
		this.codeTabelle = codeTabelle;
	}

	public void transpose() {
		String[][] transposed = new String[colCount()][rowCount()];
		for (int i = 0; i < rowCount(); i++)
			for (int j = 0; j < codeTabelle[i].length; j++)
				transposed[j][i] = codeTabelle[i][j];
		codeTabelle = transposed;
	}

	public void mirror(boolean vertically) {
		String[][] mirrored = new String[rowCount()][colCount()];
		for (int i = 0; i < rowCount(); i++)
			for (int j = 0; j < codeTabelle[i].length; j++)
				mirrored[i][j] = vertically ? codeTabelle[i][colCount() - j - 1] : codeTabelle[rowCount() - i - 1][j];
		codeTabelle = mirrored;
	}

	public void rotate(boolean clockwise) {
		transpose();
		mirror(clockwise);
	}

	public int rowCount() {
		return codeTabelle.length;
	}

	public int colCount() {
		return codeTabelle[0].length;
	}

	@Override
	public String toString() {
		String[] rows = new String[codeTabelle.length];
		for (int i = 0; i < codeTabelle.length; i++) {
			rows[i] = " [";
			rows[i] += String.join(",", codeTabelle[i]);
			rows[i] += "]";
		}
		return "[\n" + String.join(",\n", rows) + "\n]";
	}
}
