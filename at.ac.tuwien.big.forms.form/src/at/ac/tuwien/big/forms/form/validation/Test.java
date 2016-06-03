package at.ac.tuwien.big.forms.form.validation;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.EvaluationVisitorImpl;

import at.ac.tuwien.big.forms.FormsPackage;
import at.ac.tuwien.big.oclgen.EClassReference;
import at.ac.tuwien.big.oclgen.ErrorFeatureFindingVisitor;
import at.ac.tuwien.big.oclgen.InterpretingOCLBooleanExpressionEvaluator;
import at.ac.tuwien.big.oclgen.OCL2JavaVisitor;
import at.ac.tuwien.big.oclgen.OCLBasedQuickfixDefinition;
import at.ac.tuwien.big.oclgen.OclExtractor;

public class Test {

	public static void main(String[] args) {
		String code;
		
//		code = OCL2JavaVisitor.toJava(FormsPackage.Literals.RELATIONSHIP_PAGE_ELEMENT, "self.editingForm.welcomeForm = false");
//		System.out.println(code);
		
//		code = OCL2JavaVisitor.toJava(FormsPackage.Literals.PAGE, "self.title.at(1).matches('[A-Z]')");
//		System.out.println(code);
		
//		code = OCL2JavaVisitor.toJava(FormsPackage.Literals.TIME_SELECTION_FIELD, "self.attribute.type = AttributeType::Time");
//		System.out.println(code);
		
//		code = OCL2JavaVisitor.toJava(FormsPackage.Literals.RELATIONSHIP, "self.opposite <> null implies self.target = Entity.allInstances() -> select(e | e.features -> select(f | f.oclIsKindOf(Relationship)) -> includes(self.opposite)) -> asOrderedSet() -> first()");
//		System.out.println(code);
		
//		code = OCL2JavaVisitor.toJava(FormsPackage.Literals.RELATIONSHIP, "self.opposite -> forAll(o | o.opposite = self)");
//		System.out.println(code);
		
//		code = OCL2JavaVisitor.toJava(FormsPackage.Literals.TABLE, "self.editingForm.entity.features -> union(self.editingForm.entity -> closure(superType).features) -> includesAll(self.columns.attribute)");
//		System.out.println(code);

//		code = ErrorFeatureFindingVisitor.findFeature(FormsPackage.Literals.PAGE, "self.title.at(1).matches('[A-Z]')");
//		System.out.println(code);
		
//		code = OCL2JavaVisitor.toJava(FormsPackage.Literals.FORM, "Tuple{ message = '', status = self.entity.features -> union(self.entity -> closure(superType).features) -> includesAll(self.pages.pageElements -> selectByKind(AttributePageElement).attribute.oclAsType(Feature) -> union(self.pages.pageElements -> selectByKind(RelationshipPageElement).relationship.oclAsType(Feature)))}.status");
//		System.out.println(code);
		
//		code = OCL2JavaVisitor.toJava(FormsPackage.Literals.ATTRIBUTE_PAGE_ELEMENT, "self.oclAsType(ecore::EObject) -> closure(eContainer()) -> selectByKind(Form).entity.features -> includes(self.attribute)");
//		System.out.println(code);
		
//		OclExtractor.getAllClassOCLExpressions(OclExtractor.getEcore(new File("input/forms.ecore")));
		
//		Map<EClassReference, Map<EClass, Set<String>>> map = OclExtractor.getScopingOCLExpressions(OclExtractor.getEcore(new File("input/forms.ecore")));
//		
//		for (Map.Entry<EClassReference, Map<EClass, Set<String>>> entry : map.entrySet()) {
//			String simpleClassName = entry.getKey().getEClass().getName();
//			String className = entry.getKey().getEClass().getInstanceClassName();
//			String referenceName = entry.getKey().getEReference().getName();
//			
//			System.out.println("def IScope scope_" + simpleClassName + "_" + referenceName + "(" + className + " element, EReference reference) {");
//			
//			for (Map.Entry<EClass, Set<String>> relevantEntry : entry.getValue().entrySet()) {
//				String relevantClassName = relevantEntry.getKey().getInstanceClassName();
//				System.out.println("\t" + relevantClassName);
//				
//				for (String constraintName : relevantEntry.getValue()) {
//					System.out.println("\t\t" + constraintName);
//				}
//			}
//			
//			System.out.println("}\n");
//		}
		
		List<OCLBasedQuickfixDefinition> l = OclExtractor.getQuickfixableOCLExpressions(OclExtractor.getEcore(new File("input/forms.ecore")));
		for (OCLBasedQuickfixDefinition d : l) {
			System.out.println(d.getConstraintName() + " - " + d.getValidatorClassName() + " - " + d.getElementClass().getName() + "." + d.getTargetAttribute().getName());
		}
	}
}
