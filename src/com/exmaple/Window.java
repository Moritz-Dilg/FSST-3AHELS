package com.exmaple;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class Window {

	// Breite und H�he

	/** Variable, welche die Breite des Fensters definiert. */
	public static int WINDOW_WIDTH = 800;

	/** Variable, welche die Hoehe des Fensters definiert. */
	public static int WINDOW_HEIGHT = 600;

	// open

	/**
	 * Initialisiert das Ausgabefenster und �ffnet es.
	 */
	public static void open() {
		open(WINDOW_WIDTH, WINDOW_HEIGHT);
	}

	/**
	 * Initialisiert das Ausgabefenster und �ffnet es.
	 * 
	 * @param width
	 *            Die Breite f�r das
	 * @param width
	 *            Die Hoehe f�r das Fenster
	 */
	public static void open(int width, int height) {
		windowO = new Frame("Window");
		contentPane = new WindowOPanel();
		windowO.add(contentPane);
		image = new BufferedImage(WINDOW_WIDTH, WINDOW_HEIGHT,
				BufferedImage.TYPE_INT_RGB);
		image.getGraphics().fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
		windowO.setSize(width + 12, height + headerHeight + 12);
		windowO.addWindowListener(new Window.WindowClosingAdapter(true));
		windowO.setVisible(true);
	}

	/** L�scht den Inhalt des Fensters */
	public static void clear() {
		image.getGraphics().fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
		contentPane.repaint();
	}

	// Methoden zum Zeichnen.

	/** Zeichnet einen Punkt bei der angebenen Position (x, y). */
	public static void drawPoint(int x, int y) {
		Graphics g = image.getGraphics();
		g.setColor(Color.black);
		g.fillRect(x - 1, y - 1, 3, 3);
		contentPane.repaint();
	}

	/** Zeichnet eine Linie von Position (x1, y1) zu Position (x2, y2). */
	public static void drawLine(int x1, int y1, int x2, int y2) {
		Graphics g = image.getGraphics();
		g.setColor(Color.black);
		g.drawLine(x1, y1, x2, y2);
		contentPane.repaint();
	}

	/** Zeichnet ein Rechteck bei Position (x, y) mit Breite w und H�he h. */
	public static void drawRectangle(int x, int y, int w, int h) {
		Graphics g = image.getGraphics();
		g.setColor(Color.black);
		g.drawRect(x, y, w, h);
		contentPane.repaint();
	}

	/** Zeichnet einen Kreis mit Mittelpunkt (x, y) und Radius r. */
	public static void drawCircle(int x, int y, int r) {
		Graphics g = image.getGraphics();
		g.setColor(Color.black);
		g.drawOval(x - r, y - r, 2 * r, 2 * r);
		contentPane.repaint();
	}

	/** Zeichnet einen Punkt bei der angebenen Position (x, y) mit Farbe color. */
	public static void drawPoint(int x, int y, Color color) {
		Graphics g = image.getGraphics();
		g.setColor(color);
		g.fillRect(x - 1, y - 1, 3, 3);
		contentPane.repaint();
	}

	/**
	 * Zeichnet eine Linie von Position (x1, y1) zu Position (x2, y2) mit Farbe
	 * color.
	 */
	public static void drawLine(int x1, int y1, int x2, int y2, Color color) {
		Graphics g = image.getGraphics();
		g.setColor(color);
		g.drawLine(x1, y1, x2, y2);
		contentPane.repaint();
	}

	/**
	 * Zeichnet ein Rechteck bei Position (x, y) mit Breite w und H�he h mit
	 * Farbe color.
	 */
	public static void drawRectangle(int x, int y, int w, int h, Color color) {
		Graphics g = image.getGraphics();
		g.setColor(color);
		g.drawRect(x, y, w, h);
		contentPane.repaint();
	}

	/**
	 * Zeichnet einen Kreis Zeichnet einen Kreis mit Mittelpunkt (x, y) und
	 * Radius r mit Farbe color.
	 */
	public static void drawCircle(int x, int y, int r, Color color) {
		Graphics g = image.getGraphics();
		g.setColor(color);
		g.drawOval(x - r, y - r, 2 * r, 2 * r);
		contentPane.repaint();
	}

	/**
	 * Zeichnet ein Rechteck bei Position (x, y) mit Breite w und H�he h mit
	 * Farbe color.
	 */
	public static void fillRectangle(int x, int y, int w, int h, Color color) {
		Graphics g = image.getGraphics();
		g.setColor(color);
		g.fillRect(x, y, w, h);
		contentPane.repaint();
	}

	/**
	 * Zeichnet einen Kreis Zeichnet einen Kreis mit Mittelpunkt (x, y) und
	 * Radius r mit Farbe color.
	 */
	public static void fillCircle(int x, int y, int r, Color color) {
		Graphics g = image.getGraphics();
		g.setColor(color);
		g.fillOval(x - r, y - r, 2 * r, 2 * r);
		contentPane.repaint();
	}

	// Privater Bereich
	// --------------------------------------------------------------------------------

	/** Main-Frame */
	private static Frame windowO;

	/**
	 * Panel mit Inhalt. Ist von Klasse WindowOPanel, welches das BufferedImage
	 * image zeichnet
	 */
	private static WindowOPanel contentPane;

	/**
	 * BufferedImage, in welches gezeichnet wird und welches dann in contentPane
	 * ausgegeben wird
	 */
	private static Image image = new BufferedImage(WINDOW_WIDTH, WINDOW_HEIGHT,
			BufferedImage.TYPE_INT_RGB);

	/** Variable, die die Hoehe des Headers des Frame definiert */
	private static int headerHeight = 24;

	/** Innere Klasse zum Schlie�en des Frame */
	static class WindowClosingAdapter extends WindowAdapter {

		private boolean exitSystem;

		/**
		 * Erzeugt einen WindowClosingAdapter zum Schliessen des Fensters. Ist
		 * exitSystem true, wird das komplette Programm beendet.
		 */
		public WindowClosingAdapter(boolean exitSystem) {
			this.exitSystem = exitSystem;
		}

		/**
		 * Erzeugt einen WindowClosingAdapter zum Schliessen des Fensters. Das
		 * Programm wird nicht beendet.
		 */
		public WindowClosingAdapter() {
			this(true);
		}

		/** Schlie�t das Fenster und terminiert die Anwendung */
		public void windowClosing(WindowEvent event) {
			event.getWindow().setVisible(false);
			event.getWindow().dispose();
			if (exitSystem) {
				System.exit(0);
			}
		}
	}

	/**
	 * Klasse f�r die contentPane im WindowO Frame. Es wird paint von Component
	 * �berschrieben und das BufferedImage image gezeichnet.
	 */
	static class WindowOPanel extends Component {

		public void paint(Graphics g) {
			g.drawImage(image, 0, 0, null);
		}
	}

}