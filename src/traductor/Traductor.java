package traductor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Traductor {

	private static Ventana ventana;

	static Traducciones traducciones;

	public static void main(String[] args) {
		ventana = new Ventana("Translate", 650, 450);
		ventana.run();
		ventana.setVisible(true);

		traducciones = new Traducciones();

		ventana.buttonTranslate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				translate();

			}

		});

		showOptionsWordHouse(ventana.option);

	}

	//Muestra las palabras disponibles para la option "house"
	public static void showOptionsWordHouse(String option) {

		String s = "";

		if (option.equals("numbers")) {
			s = "Los numeros del 1 al 20 de manera escrita\n";

		} else {
			s = "Los objetos de la casa\n";

			s += traducciones.getOptionsWords();
		}

		ventana.infoOption.setText(s);
	}

	//Es el encargado de traducir 
	private static void translate() {

		String traduccion = ventana.input.getText(), s;

		if (ventana.inputHeader.getText().equals("Spanish")) {

			s = traducciones.getValueWithKey(traduccion);

		} else {

			s = traducciones.getKeyWithValue(traduccion);

		}

		ventana.output.setText(s);
	}

}
