package traductor;

import java.util.Enumeration;
import java.util.Hashtable;

public class Traducciones {

	Hashtable<String, String> numbers;
	Hashtable<String, String> house;

	public Traducciones() {
		setWordsNumbers();
		setWordsHouse();
	}

	/** Cambiar todo hasta... */
	private void setWordsNumbers() {

		numbers = new Hashtable<String, String>();

		numbers.put("uno", "one");
		numbers.put("dos", "two");
		numbers.put("tres", "three");
		numbers.put("cuatro", "four");
		numbers.put("cinco", "five");
		numbers.put("seis", "six");
		numbers.put("siete", "seven");
		numbers.put("ocho", "eight");
		numbers.put("nueve", "nine");
		numbers.put("diez", "ten");
		numbers.put("once", "eleven");
		numbers.put("doce", "twelve");
		numbers.put("trece", "thirteen");
		numbers.put("catorce", "fourteen");
		numbers.put("quince", "fifteen");
		numbers.put("dieciseis", "sixteen");
		numbers.put("diecisiete", "seventeen");
		numbers.put("dieciocho", "eighteen");
		numbers.put("diecinueve", "nineteen");
		numbers.put("veinte", "twenty");

	}

	private void setWordsHouse() {

		house = new Hashtable<String, String>();

		house.put("silla", "chair");
		house.put("mesa", "table");
		house.put("cama", "bed");
		house.put("cocina", "kitchen");
		house.put("armario", "wardrobe");
		house.put("microondas", "microwave");
		house.put("cortinas", "curtains");
		house.put("estufa", "stove");
		house.put("refrigerador", "refrigerator");
		house.put("sofá", "sofa");
		house.put("comedor", "dining room");
		house.put("baño", "bathroom");
		house.put("inodoro", "toilet");
		house.put("bañera", "tub");
		house.put("ventana", "window");
		house.put("puerta", "door");
		house.put("plato", "plate");
		house.put("vaso", "glass");
		house.put("televisión", "television");
		house.put("lámpara", "lamp");

	}

	public String getOptionsWords() {

		String s = "";

		Enumeration<String> e = house.keys();
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

		Enumeration<String> e = numbers.keys();
		Object clave;
		Object valor;
		while (e.hasMoreElements()) {
			clave = e.nextElement();
			valor = numbers.get(clave);

			//System.out.println(valor + " : " + clave);
			if (clave.toString().equalsIgnoreCase(key)) {

				return valor.toString();
			}

		}

		e = house.keys();

		while (e.hasMoreElements()) {
			clave = e.nextElement();
			valor = house.get(clave);

			//System.out.println(valor + " : " + clave);
			if (clave.toString().equalsIgnoreCase(key)) {

				return valor.toString();
			}

		}

		return "Not available";
	}

	public String getKeyWithValue(String value) {

		Enumeration<String> e = numbers.keys();
		Object clave;
		Object valor;
		while (e.hasMoreElements()) {
			clave = e.nextElement();
			valor = numbers.get(clave);

			//System.out.println(valor + " : " + clave);
			if (valor.toString().equalsIgnoreCase(value)) {

				return clave.toString();
			}

		}

		e = house.keys();

		while (e.hasMoreElements()) {
			clave = e.nextElement();
			valor = house.get(clave);

			//System.out.println(valor + " : " + clave);
			if (valor.toString().equalsIgnoreCase(value)) {

				return clave.toString();
			}

		}

		return "No disponible";
	}

	//acá :v
}
