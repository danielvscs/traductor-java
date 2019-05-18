package traductor;

import java.util.Enumeration;
import java.util.Hashtable;

public class Traducciones {

	private Hashtable<String, String> options;

	public Traducciones() {
		setOptionsWords();
	}

	private void setOptionsWords() {

		options = new Hashtable<String, String>();

		options.put("casa", "house");
		options.put("perro", "dog");
		options.put("madre", "mom");
		options.put("Mesa", "table");
		options.put("pajaro", "bird");
		options.put("luna", "moon");
		options.put("sol", "sun");
		options.put("manzana", "apple");
		options.put("door", "puerta");
		options.put("calle", "street");
		options.put("huevo", "egg");
		options.put("ni�a", "girl");
		options.put("ni�o", "boy");
		options.put("oro", "gold");
		options.put("caballo", "horse");
		options.put("isla", "Island");
		options.put("m�quina", "machine");
		options.put("n�mero", "number");
		options.put("mar", "sea");

	}

	public String getOptionsWords() {

		String s = "";

		Enumeration e = options.keys();
		Object clave;

		int i = 1;

		while (e.hasMoreElements()) {
			clave = e.nextElement();

			s += i + ") " + clave + "\n";

			i++;
		}

		return s;
	}

}
