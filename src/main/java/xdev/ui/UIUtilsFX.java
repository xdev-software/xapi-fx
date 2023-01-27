package xdev.ui;

import javafx.application.Platform;

/**
 * <p>
 * The <code>UIUtilsFX</code> class provides utility methods for dialog, window
 * and general UI (user interface) handling.
 * </p>
 *
 * @since 1.0
 *
 * @author XDEV Software
 */
public final class UIUtilsFX
{
	
	/**
	 * {@link UIUtilsFX} class can not be instantiated. The class should be
	 * used as utility class: <code>UIUtilsFX.runInJFXThread(runnable);</code>.
	 */
	private UIUtilsFX()
	{
	}
	
	/**
	 * Ensures that the runnable is executed in the Java FX thread.
	 *
	 * @param runnable to run on Java FX thread.
	 * 
	 * @since 5.0
	 */
	public static void runInJFXThread(final Runnable runnable)
	{
		if(Platform.isFxApplicationThread())
		{
			runnable.run();
		}
		else
		{
			Platform.runLater(runnable);
		}
	}
}
