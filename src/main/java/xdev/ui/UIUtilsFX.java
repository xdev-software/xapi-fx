package xdev.ui;

/*-
 * #%L
 * XDEV Application Framework JavaFX
 * %%
 * Copyright (C) 2021 XDEV Software
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */

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
public class UIUtilsFX
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
