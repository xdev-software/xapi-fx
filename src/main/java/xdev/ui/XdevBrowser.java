package xdev.ui;

import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;


/**
 * A web browser component to display HTML content.
 *
 * @author XDEV Software
 * @since 5.0
 *
 */
public class XdevBrowser extends XdevJFXPanel
{
	protected WebView webView;
	
	
	public XdevBrowser()
	{
		UIUtilsFX.runInJFXThread(() -> setScene(createScene()));
	}
	
	
	protected Scene createScene()
	{
		this.webView = createWebView();
		return new Scene(this.webView);
	}
	
	
	protected WebView createWebView()
	{
		return new WebView();
	}
	
	
	/**
	 * Returns the web view node which is used by this browser.
	 * 
	 * @return the web view node which is used by this browser.
	 */
	public WebView getWebView()
	{
		return this.webView;
	}
	
	
	/**
	 * Returns the web engine which is used by this browser.
	 * 
	 * @return the web engine which is used by this browser.
	 * 
	 */
	public WebEngine getWebEngine()
	{
		return this.webView.getEngine();
	}
	
	
	/**
	 * Returns the history of this browser.
	 * 
	 * @return the history of this browser.
	 * 
	 */
	public WebHistory getWebHistory()
	{
		return getWebEngine().getHistory();
	}
	
	
	/**
	 * Loads a Web page into this browser. This method starts asynchronous
	 * loading and returns immediately.
	 *
	 * @param url
	 *            URL of the web page to load
	 */
	public void load(final String url)
	{
		UIUtilsFX.runInJFXThread(() -> getWebEngine().load(url));
	}
	
	
	/**
	 * Loads the given HTML content directly. This method is useful when you
	 * have an HTML String composed in memory, or loaded from some system which
	 * cannot be reached via a URL (for example, the HTML text may have come
	 * from a database). As with {@link #load(String)}, this method is
	 * asynchronous.
	 * 
	 * @param html content to load
	 * 
	 */
	public void loadContent(final String html)
	{
		UIUtilsFX.runInJFXThread(() -> getWebEngine().loadContent(html));
	}
}
