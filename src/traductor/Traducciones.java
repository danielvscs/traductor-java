package traductor;

import java.util.Enumeration;
import java.util.Hashtable;

public class Traducciones {

	Hashtable<String, String> words;

	public Traducciones() {
		setWordsHouse();
	}

	private void setWordsHouse() {

		words = new Hashtable<String, String>();

		words.put("casa", "house");
		words.put("perro", "dog");
		words.put("madre", "mom");
		words.put("Mesa", "table");
		words.put("pajaro", "bird");
		words.put("luna", "moon");
		words.put("sol", "sun");
		words.put("manzana", "apple");
		words.put("door", "puerta");
		words.put("calle", "street");
		words.put("huevo", "egg");
		words.put("niña", "girl");
		words.put("niño", "boy");
		words.put("oro", "gold");
		words.put("caballo", "horse");
		words.put("isla", "Island");
		words.put("máquina", "machine");
		words.put("número", "number");
		words.put("mar", "sea");

	}

	public String getOptionsWords() {

		String s = "";

		Enumeration<String> e = words.keys();
		Object clave;

		int i = 1;

		while (e.hasMoreElements()) {
			clave = e.nextElement();

			if (i % 2 != 0) {
				s += "-" + clave;

				for (int j = clave.toString().length(); j < 30 - clave.toString().length(); j++) {
					s += " ";
				}

			} else {
				s += "-" + clave + "\n";
			}

			i++;
		}

		return s;
	}

	public String getValueWithKey(String key) {

		Enumeration e = words.keys();
		Object clave;
		Object valor;
		while (e.hasMoreElements()) {
			clave = e.nextElement();
			valor = words.get(clave);

			//System.out.println(valor + " : " + clave);
			if (clave.toString().equalsIgnoreCase(key)) {

				return valor.toString();
			}

		}

		return "Not available";
	}

	public String getKeyWithValue(String value) {

		Enumeration e = words.keys();
		Object clave;
		Object valor;
		while (e.hasMoreElements()) {
			clave = e.nextElement();
			valor = words.get(clave);

			//System.out.println(valor + " : " + clave);
			if (valor.toString().equalsIgnoreCase(value)) {

				return clave.toString();
			}

		}

		return "No disponible";
	}

}
