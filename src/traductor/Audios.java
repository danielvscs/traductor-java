package traductor;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.swing.JOptionPane;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Audios {

	public static void reproducirAudio(String palabra) {

		BufferedInputStream bis = new BufferedInputStream(getArchivoAudio(palabra));

		try {
			Player player = new Player(bis);
			player.play();
		} catch (JavaLayerException e) {
			e.printStackTrace();
		}

	}

	public static FileInputStream getArchivoAudio(String palabra) {
		FileInputStream archivo = null;
		try {
			archivo = new FileInputStream("sounds/" + palabra + ".mp3");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Lo sentimos, ha ocurrido un error D:\n\n\n" + e.getMessage(),
					"Error al obtener audio", JOptionPane.ERROR_MESSAGE);
		}

		return archivo;
	}

}
