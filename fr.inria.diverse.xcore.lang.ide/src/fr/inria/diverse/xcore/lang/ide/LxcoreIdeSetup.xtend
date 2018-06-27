/*
 * generated by Xtext 2.12.0
 */
package fr.inria.diverse.xcore.lang.ide

import com.google.inject.Guice
import fr.inria.diverse.xcore.lang.LxcoreRuntimeModule
import fr.inria.diverse.xcore.lang.LxcoreStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class LxcoreIdeSetup extends LxcoreStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new LxcoreRuntimeModule, new LxcoreIdeModule))
	}
	
}