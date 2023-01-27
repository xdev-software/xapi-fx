package xdev.ui;

import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;


/**
 * A component to embed JavaFX content into Swing applications. The content to
 * be displayed is specified with the {@link #setScene} method that accepts an
 * instance of JavaFX {@code Scene}. After the scene is assigned, it gets
 * repainted automatically. All the input and focus events are forwarded to the
 * scene transparently to the developer.
 * <p>
 * There are some restrictions related to this component. As a Swing component,
 * it should only be accessed from the event dispatch thread, except the
 * {@link #setScene} method, which can be called either on the event dispatch
 * thread or on the JavaFX application thread.
 *
 * @author XDEV Software
 * @since 5.0
 *
 */
public class XdevJFXPanel extends JFXPanel
{
	/**
	 * Creates a new {@code XdevJFXPanel} object.
	 * <p>
	 * <b>Implementation note</b>: when the first {@code XdevJFXPanel} object is
	 * created, it implicitly initializes the JavaFX runtime. This is the
	 * preferred way to initialize JavaFX in Swing.
	 */
	public XdevJFXPanel()
	{
		// this constructor exists only so we can add the javadoc :)
	}


	/**
	 * Attaches a {@code Scene} object to display in this {@code
	 * XdevJFXPanel}. This method can be called either on the event dispatch
	 * thread or the JavaFX application thread.
	 *
	 * @param newScene
	 *            a scene to display in this {@code XdevJFXpanel}
	 */
	@Override
	public void setScene(final Scene newScene)
	{
		super.setScene(newScene);
	}
}
