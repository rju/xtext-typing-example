/*
* generated by Xtext
*/
package de.cau.cs.se.lad.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.cau.cs.se.lad.services.AppLangGrammarAccess;

public class AppLangParser extends AbstractContentAssistParser {
	
	@Inject
	private AppLangGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.cau.cs.se.lad.ui.contentassist.antlr.internal.InternalAppLangParser createParser() {
		de.cau.cs.se.lad.ui.contentassist.antlr.internal.InternalAppLangParser result = new de.cau.cs.se.lad.ui.contentassist.antlr.internal.InternalAppLangParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModelAccess().getAlternatives_0(), "rule__Model__Alternatives_0");
					put(grammarAccess.getBaseExpressionAccess().getAlternatives(), "rule__BaseExpression__Alternatives");
					put(grammarAccess.getStringValueAccess().getAlternatives(), "rule__StringValue__Alternatives");
					put(grammarAccess.getInstanceAccess().getAlternatives(), "rule__Instance__Alternatives");
					put(grammarAccess.getViewContentAccess().getAlternatives(), "rule__ViewContent__Alternatives");
					put(grammarAccess.getLayoutAccess().getAlternatives(), "rule__Layout__Alternatives");
					put(grammarAccess.getFunctionEnumAccess().getAlternatives(), "rule__FunctionEnum__Alternatives");
					put(grammarAccess.getViewTypeAccess().getAlternatives(), "rule__ViewType__Alternatives");
					put(grammarAccess.getUnitAccess().getAlternatives(), "rule__Unit__Alternatives");
					put(grammarAccess.getDirectionAccess().getAlternatives(), "rule__Direction__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getClassAccess().getGroup(), "rule__Class__Group__0");
					put(grammarAccess.getClassAccess().getGroup_2(), "rule__Class__Group_2__0");
					put(grammarAccess.getServiceAccess().getGroup(), "rule__Service__Group__0");
					put(grammarAccess.getServiceAccess().getGroup_4(), "rule__Service__Group_4__0");
					put(grammarAccess.getOperationAccess().getGroup(), "rule__Operation__Group__0");
					put(grammarAccess.getOperationAccess().getGroup_4(), "rule__Operation__Group_4__0");
					put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
					put(grammarAccess.getStringExpressionAccess().getGroup(), "rule__StringExpression__Group__0");
					put(grammarAccess.getStringExpressionAccess().getGroup_1(), "rule__StringExpression__Group_1__0");
					put(grammarAccess.getNullLiteralAccess().getGroup(), "rule__NullLiteral__Group__0");
					put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
					put(grammarAccess.getFunctionAccess().getGroup_3(), "rule__Function__Group_3__0");
					put(grammarAccess.getPropertyAccess().getGroup(), "rule__Property__Group__0");
					put(grammarAccess.getDataModelAccess().getGroup(), "rule__DataModel__Group__0");
					put(grammarAccess.getArrayInstanceAccess().getGroup(), "rule__ArrayInstance__Group__0");
					put(grammarAccess.getSimpleInstanceAccess().getGroup(), "rule__SimpleInstance__Group__0");
					put(grammarAccess.getArrayTypeAccess().getGroup(), "rule__ArrayType__Group__0");
					put(grammarAccess.getViewAccess().getGroup(), "rule__View__Group__0");
					put(grammarAccess.getViewContainerAccess().getGroup(), "rule__ViewContainer__Group__0");
					put(grammarAccess.getViewElementAccess().getGroup(), "rule__ViewElement__Group__0");
					put(grammarAccess.getGridLayoutAccess().getGroup(), "rule__GridLayout__Group__0");
					put(grammarAccess.getFieldAccess().getGroup(), "rule__Field__Group__0");
					put(grammarAccess.getStackLayoutAccess().getGroup(), "rule__StackLayout__Group__0");
					put(grammarAccess.getSizeAccess().getGroup(), "rule__Size__Group__0");
					put(grammarAccess.getSizeExprAccess().getGroup(), "rule__SizeExpr__Group__0");
					put(grammarAccess.getModelAccess().getServicesAssignment_0_0(), "rule__Model__ServicesAssignment_0_0");
					put(grammarAccess.getModelAccess().getViewsAssignment_0_1(), "rule__Model__ViewsAssignment_0_1");
					put(grammarAccess.getModelAccess().getClassesAssignment_0_2(), "rule__Model__ClassesAssignment_0_2");
					put(grammarAccess.getModelAccess().getModelAssignment_1(), "rule__Model__ModelAssignment_1");
					put(grammarAccess.getClassAccess().getNameAssignment_1(), "rule__Class__NameAssignment_1");
					put(grammarAccess.getClassAccess().getParentAssignment_2_1(), "rule__Class__ParentAssignment_2_1");
					put(grammarAccess.getClassAccess().getPropertiesAssignment_4(), "rule__Class__PropertiesAssignment_4");
					put(grammarAccess.getServiceAccess().getNameAssignment_1(), "rule__Service__NameAssignment_1");
					put(grammarAccess.getServiceAccess().getConfigurationsAssignment_3(), "rule__Service__ConfigurationsAssignment_3");
					put(grammarAccess.getServiceAccess().getConfigurationsAssignment_4_1(), "rule__Service__ConfigurationsAssignment_4_1");
					put(grammarAccess.getServiceAccess().getOperationsAssignment_7(), "rule__Service__OperationsAssignment_7");
					put(grammarAccess.getOperationAccess().getTypeAssignment_0(), "rule__Operation__TypeAssignment_0");
					put(grammarAccess.getOperationAccess().getNameAssignment_1(), "rule__Operation__NameAssignment_1");
					put(grammarAccess.getOperationAccess().getParametersAssignment_3(), "rule__Operation__ParametersAssignment_3");
					put(grammarAccess.getOperationAccess().getParametersAssignment_4_1(), "rule__Operation__ParametersAssignment_4_1");
					put(grammarAccess.getOperationAccess().getExpressionAssignment_7(), "rule__Operation__ExpressionAssignment_7");
					put(grammarAccess.getExpressionAccess().getRightAssignment_1_2(), "rule__Expression__RightAssignment_1_2");
					put(grammarAccess.getStringExpressionAccess().getRightAssignment_1_2(), "rule__StringExpression__RightAssignment_1_2");
					put(grammarAccess.getStringPropertyAccess().getReferenceAssignment(), "rule__StringProperty__ReferenceAssignment");
					put(grammarAccess.getStringLiteralAccess().getLiteralAssignment(), "rule__StringLiteral__LiteralAssignment");
					put(grammarAccess.getFunctionAccess().getTypeAssignment_0(), "rule__Function__TypeAssignment_0");
					put(grammarAccess.getFunctionAccess().getExpressionsAssignment_2(), "rule__Function__ExpressionsAssignment_2");
					put(grammarAccess.getFunctionAccess().getExpressionsAssignment_3_1(), "rule__Function__ExpressionsAssignment_3_1");
					put(grammarAccess.getPropertyAccess().getTypeAssignment_0(), "rule__Property__TypeAssignment_0");
					put(grammarAccess.getPropertyAccess().getNameAssignment_1(), "rule__Property__NameAssignment_1");
					put(grammarAccess.getDataModelAccess().getInstancesAssignment_3(), "rule__DataModel__InstancesAssignment_3");
					put(grammarAccess.getDataModelAccess().getViewAssignment_5(), "rule__DataModel__ViewAssignment_5");
					put(grammarAccess.getArrayInstanceAccess().getTypeAssignment_1(), "rule__ArrayInstance__TypeAssignment_1");
					put(grammarAccess.getArrayInstanceAccess().getNameAssignment_2(), "rule__ArrayInstance__NameAssignment_2");
					put(grammarAccess.getSimpleInstanceAccess().getTypeAssignment_1(), "rule__SimpleInstance__TypeAssignment_1");
					put(grammarAccess.getSimpleInstanceAccess().getNameAssignment_2(), "rule__SimpleInstance__NameAssignment_2");
					put(grammarAccess.getArrayTypeAccess().getTypeAssignment_1(), "rule__ArrayType__TypeAssignment_1");
					put(grammarAccess.getArrayTypeAccess().getSizeAssignment_3(), "rule__ArrayType__SizeAssignment_3");
					put(grammarAccess.getViewAccess().getNameAssignment_1(), "rule__View__NameAssignment_1");
					put(grammarAccess.getViewAccess().getLayoutAssignment_3(), "rule__View__LayoutAssignment_3");
					put(grammarAccess.getViewAccess().getContentsAssignment_4(), "rule__View__ContentsAssignment_4");
					put(grammarAccess.getViewContainerAccess().getLayoutAssignment_2(), "rule__ViewContainer__LayoutAssignment_2");
					put(grammarAccess.getViewContainerAccess().getContentsAssignment_3(), "rule__ViewContainer__ContentsAssignment_3");
					put(grammarAccess.getViewElementAccess().getTypeAssignment_0(), "rule__ViewElement__TypeAssignment_0");
					put(grammarAccess.getViewElementAccess().getNameAssignment_1(), "rule__ViewElement__NameAssignment_1");
					put(grammarAccess.getGridLayoutAccess().getSizeAssignment_0(), "rule__GridLayout__SizeAssignment_0");
					put(grammarAccess.getGridLayoutAccess().getFieldsAssignment_1(), "rule__GridLayout__FieldsAssignment_1");
					put(grammarAccess.getFieldAccess().getWidthAssignment_1(), "rule__Field__WidthAssignment_1");
					put(grammarAccess.getFieldAccess().getHeightAssignment_3(), "rule__Field__HeightAssignment_3");
					put(grammarAccess.getStackLayoutAccess().getSizeAssignment_0(), "rule__StackLayout__SizeAssignment_0");
					put(grammarAccess.getStackLayoutAccess().getDirectionAssignment_1(), "rule__StackLayout__DirectionAssignment_1");
					put(grammarAccess.getSizeAccess().getWidthAssignment_1(), "rule__Size__WidthAssignment_1");
					put(grammarAccess.getSizeAccess().getHeightAssignment_3(), "rule__Size__HeightAssignment_3");
					put(grammarAccess.getSizeExprAccess().getValueAssignment_0(), "rule__SizeExpr__ValueAssignment_0");
					put(grammarAccess.getSizeExprAccess().getUnitAssignment_1(), "rule__SizeExpr__UnitAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.cau.cs.se.lad.ui.contentassist.antlr.internal.InternalAppLangParser typedParser = (de.cau.cs.se.lad.ui.contentassist.antlr.internal.InternalAppLangParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public AppLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AppLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}