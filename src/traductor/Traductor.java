package traductor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Traductor {

	private static Ventana ventana;

	public static void main(String[] args) {
		ventana = new Ventana("Translate", 650, 450);
		ventana.run();
		ventana.setVisible(true);

		//Traducciones traducciones = new Traducciones();

		//String options = traducciones.getOptionsWords();

		//ventana.showOptions(options);

		ventana.buttonTranslate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				translate();

			}

		});

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
