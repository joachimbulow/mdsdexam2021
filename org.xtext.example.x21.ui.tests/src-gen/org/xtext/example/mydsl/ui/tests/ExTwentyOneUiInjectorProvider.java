/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.x21.ui.internal.X21Activator;

public class ExTwentyOneUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return X21Activator.getInstance().getInjector("org.xtext.example.mydsl.ExTwentyOne");
	}

}
