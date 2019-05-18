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

		//String options = traducciones.getOptionsWords();

		//ventana.showOptions(options);

		ventana.buttonTranslate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				translate();

			}

		});

		showOptionsWordHouse(ventana.option);

	}

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

	private static void translate() {

		String traduccion = ventana.input.getText();;

		if (ventana.inputHeader.getText().equals("Spanish")) {
			ventana.output.setText("Translated: " + traduccion);
		} else {
			ventana.output.setText("Traducida: " + traduccion);
		}
	}

}
