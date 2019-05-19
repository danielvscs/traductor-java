package traductor;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Ventana extends JFrame {

	//public static void main()

	/**
	 * 
	 */
	private static final long serialVersionUID = -4896609577006027592L;

	final int WIDTH, HEIGHT;

	public String option;

	private JPanel header;
	JPanel languages;
	JPanel inputs;

	JButton change;
	JButton listen;
	JButton buttonTranslate;
	JButton optionNumbers;
	JButton optionHouse;

	JTextField input;
	JTextField output;
	JTextField optionsField;

	JTextArea infoOption;
	JTextPane infoTextTranslated;

	JLabel title;
	JLabel inputHeader;
	JLabel outputHeader;

	public Ventana(String title, int width, int height) {

		WIDTH = width;
		HEIGHT = height;

		option = "numbers";

		input = new JTextField();
		output = new JTextField();
		optionsField = new JTextField();

		this.title = new JLabel(title);

	}

	public void run() {
		setWindow();

		startHeaderPanel();
		startPanelenguages();
		startInputsPanel();

		showTitle();
		showInput();
		buttonChange();
		showOutput();
		showButtonlisten();
		showButtonOptions();

		showButtonTranslate();
		showInfoOption(option);

	}

	//start panels and fields

	//Pane donde se muestra las cabeceras del input y output
	private void startPanelenguages() {

		languages = new JPanel();
		languages.setVisible(true);
		languages.setBackground(Color.WHITE);
		languages.setBounds(0, 40, WIDTH, 25);

		add(languages);

		showInputHeader();
		showOutputHeader();
	}

	//Muestra el idioma del input
	private void showInputHeader() {
		inputHeader = new JLabel();
		inputHeader.setText("Spanish");
		inputHeader.setPreferredSize(new Dimension(300, languages.getHeight()));
		inputHeader.setBackground(Color.WHITE);

		languages.add(inputHeader);

	}

	//Muestra el idioma del output
	private void showOutputHeader() {
		outputHeader = new JLabel();
		outputHeader.setText("English");
		outputHeader.setPreferredSize(new Dimension(200, languages.getHeight()));
		outputHeader.setBackground(Color.white);

		languages.add(outputHeader);

	}

	//titulo del programa (franja azul)
	private void startHeaderPanel() {
		header = new JPanel();
		header.setBackground(Color.decode("#5C99B2"));
		header.setBounds(0, 0, WIDTH, 40);
		add(header);
	}

	//Panel donde estan los input y output
	private void startInputsPanel() {
		inputs = new JPanel();
		inputs.setBackground(Color.white);
		inputs.setBounds(0, 80, WIDTH, 38);
		inputs.setLayout(new FlowLayout());
		add(inputs);
	}

	private void showTitle() {

		Font auxFont = header.getFont();

		title.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 20));
		title.setForeground(Color.WHITE);
		title.setBounds(WIDTH / 2 - 50, 5, 100, 30);
		title.setAlignmentX(CENTER_ALIGNMENT);

		header.add(title);
	}

	private void showInput() {
		input.setEditable(true);
		//input.setBounds(0, 0, 100, 10);
		input.setPreferredSize(new Dimension(225, 30));
		input.setVisible(true);

		inputs.add(input);
	}

	private void showOutput() {
		output.setEditable(false);
		output.setPreferredSize(new Dimension(255, 30));
		output.setBackground(Color.WHITE);
		output.setVisible(true);

		inputs.add(output);
	}

	private void setWindow() {

		setSize(WIDTH, HEIGHT);
		setTitle("Translate");
		setBackground(Color.WHITE);

		ImageIcon ImageIcon = new ImageIcon("icons/translate.gif");
		Image image = ImageIcon.getImage();

		this.setIconImage(image);

		this.getContentPane().setBackground(Color.WHITE);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);

	}

	//show additional fields

	//muestra las palabras disponibles e instrucciones
	private void showInfoOption(String option) {
		infoOption = new JTextArea();
		infoOption.setBackground(Color.decode("#F4F7F7"));
		infoOption.setEditable(false);
		infoOption.setBounds(30, 160, 200, 230);
		infoOption.setAutoscrolls(true);

		add(infoOption);
	}

	//buttons

	//botones de las diferentes opciones
	private void showButtonOptions() {
		optionNumbers = new JButton();
		optionHouse = new JButton();

		optionNumbers.setText("Numbers");
		optionNumbers.setForeground(Color.WHITE);
		optionNumbers.setBackground(Color.decode("#5C99B2"));
		optionNumbers.setBounds(30, 130, 100, 30);

		optionNumbers.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				option = "numbers";
				Traductor.showOptionsWordHouse(option);
			}

		});

		add(optionNumbers);

		optionHouse.setText("House");
		optionHouse.setForeground(Color.WHITE);
		optionHouse.setBackground(Color.decode("#5C99B2"));
		optionHouse.setBounds(130, 130, 100, 30);

		optionHouse.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				option = "house";
				Traductor.showOptionsWordHouse(option);
			}

		});

		add(optionHouse);

	}

	private void showButtonlisten() {
		listen = new JButton();
		listen.setIcon(new ImageIcon("icons/icon_sound.gif"));
		listen.setBorderPainted(false);
		listen.setBackground(Color.decode("#F4F7F7"));
		listen.setPreferredSize(new Dimension(32, 32));
		listen.setToolTipText("Reproduce the pronunciation of the word");

		inputs.add(listen);
	}

	//intercambia los idiomas
	private void buttonChange() {

		change = new JButton();

		change.setText("<===>");
		change.setBackground(Color.decode("#AACFD0"));
		change.setForeground(Color.WHITE);
		change.setPreferredSize(new Dimension(70, 30));
		change.setVisible(true);
		change.setToolTipText("Change language");

		change.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				changeLanguageActionPerformed(e);

			}

		});

		inputs.add(change);
	}

	private void showButtonTranslate() {
		buttonTranslate = new JButton();
		buttonTranslate.setText("translate");
		buttonTranslate.setBackground(Color.decode("#AACFD0"));
		buttonTranslate.setForeground(Color.WHITE);
		buttonTranslate.setBounds(WIDTH - 135, 128, 100, 25);
		add(buttonTranslate);
	}

	//actions listener

	private void changeLanguageActionPerformed(ActionEvent e) {

		if (inputHeader.getText().equals("Spanish")) {
			inputHeader.setText("English");
			outputHeader.setText("Spanish");
		} else {
			inputHeader.setText("Spanish");
			outputHeader.setText("English");
		}

		String o = input.getText();
		input.setText(output.getText());
		output.setText(o);

	}

	//Getters and setter

	public String getInput() {

		return input.getText();

	}

}
