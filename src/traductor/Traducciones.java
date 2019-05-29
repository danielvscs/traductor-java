package traductor;

public class Traducciones {

	private String[][] palabras = new String[4][20];

	public Traducciones() {
		setPalabras();
	}

	public void setPalabras() {

		String[] numerosSpanish = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez",
				"once", "doce", "trece", "catorce", "quince", "dieciseis", "diecisiete", "dieciocho", "diecinueve",
				"veinte"};
		String[] numerosIngles = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
				"twenty"};

		String[] casaSpanish = {"silla", "mesa", "cama", "cocina", "armario", "microondas", "cortinas", "estufa",
				"refrigerador", "sofá", "comedor", "baño", "inodoro", "bañera", "ventana", "puerta", "plato", "vaso",
				"televisión", "lámpara"};

		String[] casaIngles = {"chair", "table", "bed", "kitchen", "wardrobe", "microwave", "curtains", "stove",
				"refrigerator", "sofa", "dining room", "bathroom", "toilet", "bath", "window", "door", "plate", "glass",
				"television", "lamp"};

		palabras[0] = numerosSpanish;
		palabras[1] = numerosIngles;
		palabras[2] = casaSpanish;
		palabras[3] = casaIngles;

	}

	/** Cambiar todo hasta... */
	public String letras() {

		String s = "";

		for (int i = 0; i < palabras[0].length; i++) {
			s += palabras[2][i];

			if (i % 2 == 0) {
				for (int j = 0; j < 30 - palabras[2][i].length(); j++) {
					s += " ";
				}
			} else {
				s += "\n";
			}

		}

		return s;

	}

	public String traducirAlIngles(String palabra) {

		for (int i = 0; i < palabras[0].length; i++) {

			if (palabra.equalsIgnoreCase(palabras[0][i])) {
				return palabras[1][i];
			}

		}

		for (int i = 0; i < palabras[2].length; i++) {

			if (palabra.equalsIgnoreCase(palabras[2][i])) {
				return palabras[3][i];
			}

		}

		return "Not available";
	}

	public String traducirAlSpanish(String palabra) {
		for (int i = 0; i < palabras[1].length; i++) {

			if (palabra.equalsIgnoreCase(palabras[1][i])) {
				return palabras[0][i];
			}

		}

		for (int i = 0; i < palabras[3].length; i++) {

			if (palabra.equalsIgnoreCase(palabras[3][i])) {
				return palabras[2][i];
			}

		}
		return "No disponible";
	}

}
