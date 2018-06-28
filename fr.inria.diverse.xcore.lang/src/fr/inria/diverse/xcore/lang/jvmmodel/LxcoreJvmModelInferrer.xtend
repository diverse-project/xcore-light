package fr.inria.diverse.xcore.lang.jvmmodel

import com.google.inject.Inject
import lcore.*
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.XbaseFactory
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.TypesFactory

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class LxcoreJvmModelInferrer extends AbstractModelInferrer {

	/**
	 * convenience API to build and initialize JVM types and their members.
	 */
	@Inject extension JvmTypesBuilder

	/**
	 * The dispatch method {@code infer} is called for each instance of the
	 * given element's type that is contained in a resource.
	 * 
	 * @param element
	 *            the model to create one or more
	 *            {@link org.eclipse.xtext.common.types.JvmDeclaredType declared
	 *            types} from.
	 * @param acceptor
	 *            each created
	 *            {@link org.eclipse.xtext.common.types.JvmDeclaredType type}
	 *            without a container should be passed to the acceptor in order
	 *            get attached to the current resource. The acceptor's
	 *            {@link IJvmDeclaredTypeAcceptor#accept(org.eclipse.xtext.common.types.JvmDeclaredType)
	 *            accept(..)} method takes the constructed empty type for the
	 *            pre-indexing phase. This one is further initialized in the
	 *            indexing phase using the lambda you pass as the last argument.
	 * @param isPreIndexingPhase
	 *            whether the method is called in a pre-indexing phase, i.e.
	 *            when the global index is not yet fully updated. You must not
	 *            rely on linking using the index if isPreIndexingPhase is
	 *            <code>true</code>.
	 */
	def dispatch void infer(XPackage xpack, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		for(XClassifier classifier:  xpack.classifiers) {
			inferClassifier(classifier, acceptor, xpack.name)
			
		}
	}
	
	def dispatch void inferClassifier(XEnum xenum, IJvmDeclaredTypeAcceptor acceptor, String xpackName) {
		acceptor.accept(xenum.toEnumerationType(xpackName + "." + xenum.name)) [
			for (XEnumLiteral enumLiteral: xenum.literals) {
				it.members += enumLiteral.toEnumerationLiteral(enumLiteral.name) [
					documentation = enumLiteral.documentation
					val valLit = XbaseFactory.eINSTANCE.createXNumberLiteral()
					valLit.value = enumLiteral.value + ""
					it.initializer = valLit //
				]
			}
		]
	}
	
	def dispatch void inferClassifier(XClass xclass, IJvmDeclaredTypeAcceptor acceptor, String xpackName) {
		acceptor.accept(xclass.toClass(xpackName + "." + xclass.name)) [
			it.abstract = xclass.abstract
			it.interface = xclass.interface
			//todo manage generic type
			//todo manage super type
			//todo manage wraps
			
			for(XMember member: xclass.members) {
				inferMember(member, acceptor, it)
			}
		]		
	}
	
	def dispatch void inferMember(XAttribute attr, IJvmDeclaredTypeAcceptor acceptor, JvmGenericType newType) {
		val jvmType = TypesFactory.eINSTANCE.createJvmPrimitiveType()
		jvmType.simpleName = "int"
		val typeRef = TypesFactory.eINSTANCE.createJvmParameterizedTypeReference
		typeRef.type = jvmType
		newType.members += attr.toField(attr.name, typeRef) 
	}
	
	def dispatch void inferMember(XOperation op, IJvmDeclaredTypeAcceptor acceptor, JvmGenericType type) {
		
	}
	
	
	def dispatch void inferMember(XReference ref, IJvmDeclaredTypeAcceptor acceptor, JvmGenericType type) {
		
		
	}
}
