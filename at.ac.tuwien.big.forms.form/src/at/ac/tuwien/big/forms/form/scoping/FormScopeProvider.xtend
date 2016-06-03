package at.ac.tuwien.big.forms.form.scoping

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;

import at.ac.tuwien.big.forms.Attribute;
import at.ac.tuwien.big.forms.AttributePageElement;
import at.ac.tuwien.big.forms.AttributeType;
import at.ac.tuwien.big.forms.AttributeValueCondition;
import at.ac.tuwien.big.forms.Column;
import at.ac.tuwien.big.forms.Entity;
import at.ac.tuwien.big.forms.Feature;
import at.ac.tuwien.big.forms.Form;
import at.ac.tuwien.big.forms.Relationship;
import at.ac.tuwien.big.forms.RelationshipPageElement;
import at.ac.tuwien.big.forms.SelectionField;
import at.ac.tuwien.big.forms.Table;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 *
 */
class FormScopeProvider extends FormScopeProviderBase {
	
	def IScope scope_AttributePageElement_attribute(AttributePageElement pageElement, EReference reference) {
		if (pageElement instanceof SelectionField) {
			return scope_SelectionField_attribute(pageElement, reference);
		} else if (pageElement instanceof Column) {
			return scope_Column_attribute(pageElement, reference);
		}
		
		val form = getForm(pageElement);
		val attributes = getAttributes(form.getEntity());
		return Scopes.scopeFor(attributes);
	}
	
	def IScope scope_RelationshipPageElement_relationship(RelationshipPageElement pageElement, EReference reference) {
		val form = getForm(pageElement);
		return Scopes.scopeFor(getRelationships(form.getEntity()));
	}
	
	def IScope scope_AttributeValueCondition_attribute(AttributeValueCondition attributeValueCondition, EReference eReference) { 
		val form = getForm(attributeValueCondition);
		return Scopes.scopeFor(getAttributes(form.getEntity()));	
	}
	
	def IScope scope_Column_attribute(Column column, EReference eReference){
		val table = column.eContainer() as Table;
		val form = table.getEditingForm();
		return Scopes.scopeFor(getAttributes(form.getEntity()));
	}
	
	def IScope scope_SelectionField_attribute(SelectionField selectionField, EReference eReference){
		val form = getForm(selectionField);
		val Collection<Attribute> attributes = getAttributes(form.getEntity());
		val Iterator<Attribute> iter = attributes.iterator();
		
		while(iter.hasNext()) {
			val Attribute attribute = iter.next();
			if (attribute.getType() != AttributeType.BOOLEAN && attribute.getEnumeration() == null) {
				iter.remove();
			}
		}
		
		return Scopes.scopeFor(attributes);
	}
	
	def Form getForm(EObject object) {
		var currentObject = object;
		while (currentObject != null && !(currentObject instanceof Form)) {
			currentObject = currentObject.eContainer();
		}
		
		return currentObject as Form;
	}
	
	def Collection<Attribute> getAttributes(Entity entity) {
		var Entity currentEntity = entity;
		val Collection<Attribute> attributes = new HashSet<Attribute>();

		while(currentEntity != null){
			for (Feature feature : currentEntity.getFeatures()) {
				if(feature instanceof Attribute){
					attributes.add(feature);
				}
			}
			
			currentEntity = currentEntity.getSuperType();
		}
		
		return attributes;
	}
	
	def Collection<Relationship> getRelationships(Entity entity) {
		var Entity currentEntity = entity;
		val Collection<Relationship> relationships = new HashSet<Relationship>();

		while(currentEntity != null){
			for (Feature feature : currentEntity.getFeatures()) {
				if(feature instanceof Relationship){
					relationships.add(feature);
				}
			}
			
			currentEntity = currentEntity.getSuperType();
		}
		
		return relationships;
	}
}