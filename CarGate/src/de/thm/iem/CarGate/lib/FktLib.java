package de.thm.iem.CarGate.lib;

import javax.swing.*;
import java.io.*;
import java.util.Properties;

/**
 * The class contains methods.This methods aren't related to a special class.
 * All methods are implemented as class methods. It's implemented as a function library
 * @author Yannick Lamprecht
 * @version 1.0
 */
public class FktLib {
	public final static String CR_LF = (String) System
			.getProperty("line.separator");
	public final static String TEXTAREA_LF = "\n";

	/**
     *
     * @param f is the window, bounded on dialog window
     * @param title title of the window
     * @param message printed message
     * @return boolean return the decision
     */
    public static int frage(JFrame f, String title, String message) {
        return JOptionPane.showOptionDialog(f, message, title,
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, null, null);
	}
	
	public static int beenden(JFrame f, String titel, String nachricht){
		return  JOptionPane.showOptionDialog(f, nachricht, titel,
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
				null, null, null);
	}
	

	/**
	 * Öffnet ein Dialogfenster das zur Eingabe eines Suchbegriffes auffordert
	 * 
	 * @param f ist das Fenster, an das das Dialogfenster gebunden ist
	 * @param title enthaelt den Fenstertitel des Dialogfensters
	 * @param label Beschriftung des Suchen labels
	 * @param ok_button Beschriftung des ok_buttons
	 * @param cancel_button Beschriftung des abbrechen_buttons
	 * @return begriff der begriff der eingegeben wird
	 */
	public static String gibSuchBegriff(JFrame f, String title, String label,
			String ok_button, String cancel_button) {
		return new SuchenDialog(f, title, label, ok_button, cancel_button)
				.getSearchText();
	}

	
	/**
	 * Liest das Textfile aus und gibt den text zurück.
	 * Das textfile wird hier Zeichenweise gelesen
	 * 
	 * @param f file das gelesen werden soll
	 * @return text der im File enthalten ist
	 * @throws IOException
	 */
	public static String readFileChar(File f) throws IOException {
		int iChar;
		char zeichen;
		boolean eof = false;
		StringBuffer puffer = new StringBuffer(200);
		String erg = "";
		
			FileReader iDatei = new FileReader(f);
			iChar = iDatei.read();
			eof = iChar == -1;
			while (!eof) {
				zeichen = (char) iChar;
				puffer.append(zeichen);
				iChar = iDatei.read();
				eof = iChar == -1;
			}
			erg = puffer.toString();
			iDatei.close();
		return erg;
	}
	
	
	/**
	 * Liest das Textfile Zeilenweise aus und gibt den text zurück.
     *
     * @param datei file das gelesen werden soll
     * @return text der im File enthalten ist
     * @throws IOException
	 */
	public static String readFile(File datei) throws IOException{
		String zeile;
		boolean eof = false;
		StringBuffer puffer = new StringBuffer(200);
		String erg = "";
			FileReader iDatei = new FileReader(datei);
			BufferedReader ibDatei = new BufferedReader(iDatei);
			zeile = ibDatei.readLine();
			eof = zeile == null;
			while (!eof) {
				puffer.append(zeile + TEXTAREA_LF);
				zeile = ibDatei.readLine();
				eof = zeile == null;
			}
			erg = puffer.toString();
			iDatei.close();
		return erg;
	}

	/**
	 * 
	 * @param datei in der der textPuffer gespeichert werden soll
	 * @param textPuffer der Inhalt der gespeichert werden soll
	 * @throws IOException
	 */
	public static void writeFile(File datei, String textPuffer) throws IOException{

		BufferedWriter bw;
			bw = new BufferedWriter(new FileWriter(datei));
			bw.write(textPuffer.replace("\n",
					new String(System.getProperty("line.separator"))));
			bw.flush();
			bw.close();
	}

	
	/**
	 * Liest die Initialisierungsdatei des Editors ein,
	 * welche Grösse, Sprache und weitere wichtige Informationen
	 * zur Initialisierung des Editors enthält
	 * 
	 * @param datei iniFile das gelesen werden soll
	 * @return eigenschaften
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static Properties readIniFile(File datei)
            throws IOException {

		Properties p = new Properties();
		p.load(new FileInputStream(datei));
		return p;
	}
	
	/**
	 * Schreibt das IniFile
	 * 
	 * @param datei 
	 * @param iFile 
	 * @throws IOException
	 */
	public static void storeIniFile(File datei, Properties iFile)throws IOException{
			iFile.store(new FileWriter(datei), "Editor ini");
	}

}