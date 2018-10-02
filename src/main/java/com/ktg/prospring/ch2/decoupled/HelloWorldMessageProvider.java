/**
 * 
 */
package com.ktg.prospring.ch2.decoupled;

/**
 * @author luongtheoanh
 *
 */
public class HelloWorldMessageProvider implements MessageProvider {

	/* (non-Javadoc)
	 * @see com.ktg.prospring.ch2.decoupled.MessageProvider#getMessage()
	 */
	public String getMessage() {
		return "Hello World!";
	}

}
