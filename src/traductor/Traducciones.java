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

		words.put("uno", "one");
		words.put("dos", "two");
		words.put("tres", "three");
		words.put("cuatro", "four");
		words.put("cinco", "five");
		words.put("seis", "six");
		words.put("siete", "seven");
		words.put("ocho", "eight");
		words.put("nueve", "nine");
		words.put("diez", "ten");
		words.put("once", "eleven");
		words.put("doce", "twelve");
		words.put("trece", "thirteen");
		words.put("catorce", "fourteen");
		words.put("quince", "fifteen");
		words.put("dieciseis", "sixteen");
		words.put("diecisiete", "seventeen");
		words.put("dieciocho", "eighteen");
		words.put("diecinueve", "nineteen");
                words.put("veinte","twenty");

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
