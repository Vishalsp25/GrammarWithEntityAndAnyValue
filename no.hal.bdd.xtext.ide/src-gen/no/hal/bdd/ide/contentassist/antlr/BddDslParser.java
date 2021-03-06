/*
 * generated by Xtext 2.19.0
 */
package no.hal.bdd.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import no.hal.bdd.ide.contentassist.antlr.internal.InternalBddDslParser;
import no.hal.bdd.services.BddDslGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class BddDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(BddDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, BddDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getModelAccess().getAlternatives_1(), "rule__Model__Alternatives_1");
			builder.put(grammarAccess.getEntityDefAccess().getNameAlternatives_1_0(), "rule__EntityDef__NameAlternatives_1_0");
			builder.put(grammarAccess.getActionDefAccess().getAlternatives_2(), "rule__ActionDef__Alternatives_2");
			builder.put(grammarAccess.getPREPAccess().getAlternatives(), "rule__PREP__Alternatives");
			builder.put(grammarAccess.getID_OR_STRINGAccess().getAlternatives(), "rule__ID_OR_STRING__Alternatives");
			builder.put(grammarAccess.getStatePhraseAccess().getAlternatives(), "rule__StatePhrase__Alternatives");
			builder.put(grammarAccess.getENTITY_IDENTITYAccess().getAlternatives_1(), "rule__ENTITY_IDENTITY__Alternatives_1");
			builder.put(grammarAccess.getEntityRefAccess().getAlternatives(), "rule__EntityRef__Alternatives");
			builder.put(grammarAccess.getEntityPropertyStatePhraseAccess().getAlternatives_4(), "rule__EntityPropertyStatePhrase__Alternatives_4");
			builder.put(grammarAccess.getPropertyValueAccess().getAlternatives(), "rule__PropertyValue__Alternatives");
			builder.put(grammarAccess.getSimpleValueAccess().getAlternatives(), "rule__SimpleValue__Alternatives");
			builder.put(grammarAccess.getTRUEAccess().getAlternatives(), "rule__TRUE__Alternatives");
			builder.put(grammarAccess.getFALSEAccess().getAlternatives(), "rule__FALSE__Alternatives");
			builder.put(grammarAccess.getBooleanValueAccess().getValueAlternatives_0(), "rule__BooleanValue__ValueAlternatives_0");
			builder.put(grammarAccess.getActionPhraseAccess().getAlternatives(), "rule__ActionPhrase__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getModelAccess().getGroup_0(), "rule__Model__Group_0__0");
			builder.put(grammarAccess.getModelRefAccess().getGroup(), "rule__ModelRef__Group__0");
			builder.put(grammarAccess.getEntityDefAccess().getGroup(), "rule__EntityDef__Group__0");
			builder.put(grammarAccess.getEntityDefAccess().getGroup_2(), "rule__EntityDef__Group_2__0");
			builder.put(grammarAccess.getEntityDefAccess().getGroup_2_2(), "rule__EntityDef__Group_2_2__0");
			builder.put(grammarAccess.getEntityDefAccess().getGroup_4(), "rule__EntityDef__Group_4__0");
			builder.put(grammarAccess.getEntityDefAccess().getGroup_4_2(), "rule__EntityDef__Group_4_2__0");
			builder.put(grammarAccess.getEntityDefAccess().getGroup_5(), "rule__EntityDef__Group_5__0");
			builder.put(grammarAccess.getEntityDefAccess().getGroup_5_2(), "rule__EntityDef__Group_5_2__0");
			builder.put(grammarAccess.getEntityDefAccess().getGroup_6(), "rule__EntityDef__Group_6__0");
			builder.put(grammarAccess.getEntityDefAccess().getGroup_6_2(), "rule__EntityDef__Group_6_2__0");
			builder.put(grammarAccess.getActionDefAccess().getGroup(), "rule__ActionDef__Group__0");
			builder.put(grammarAccess.getActionDefAccess().getGroup_2_1(), "rule__ActionDef__Group_2_1__0");
			builder.put(grammarAccess.getStateDefAccess().getGroup(), "rule__StateDef__Group__0");
			builder.put(grammarAccess.getStateDefAccess().getGroup_1(), "rule__StateDef__Group_1__0");
			builder.put(grammarAccess.getPropertyDefAccess().getGroup(), "rule__PropertyDef__Group__0");
			builder.put(grammarAccess.getScenarioAccess().getGroup(), "rule__Scenario__Group__0");
			builder.put(grammarAccess.getScenarioStateAccess().getGroup(), "rule__ScenarioState__Group__0");
			builder.put(grammarAccess.getScenarioStateAccess().getGroup_1(), "rule__ScenarioState__Group_1__0");
			builder.put(grammarAccess.getScenarioActionAccess().getGroup(), "rule__ScenarioAction__Group__0");
			builder.put(grammarAccess.getScenarioActionAccess().getGroup_1(), "rule__ScenarioAction__Group_1__0");
			builder.put(grammarAccess.getENTITY_IDENTITYAccess().getGroup(), "rule__ENTITY_IDENTITY__Group__0");
			builder.put(grammarAccess.getEntityRefAccess().getGroup_0(), "rule__EntityRef__Group_0__0");
			builder.put(grammarAccess.getEntityStatePhraseAccess().getGroup(), "rule__EntityStatePhrase__Group__0");
			builder.put(grammarAccess.getEntityPropertyStatePhraseAccess().getGroup(), "rule__EntityPropertyStatePhrase__Group__0");
			builder.put(grammarAccess.getEntityPropertyStatePhraseAccess().getGroup_4_0(), "rule__EntityPropertyStatePhrase__Group_4_0__0");
			builder.put(grammarAccess.getEntityPropertyStatePhraseAccess().getGroup_4_1(), "rule__EntityPropertyStatePhrase__Group_4_1__0");
			builder.put(grammarAccess.getEntityPropertyStatePhraseAccess().getGroup_4_1_2(), "rule__EntityPropertyStatePhrase__Group_4_1_2__0");
			builder.put(grammarAccess.getListValueAccess().getGroup(), "rule__ListValue__Group__0");
			builder.put(grammarAccess.getListValueAccess().getGroup_2(), "rule__ListValue__Group_2__0");
			builder.put(grammarAccess.getListValueAccess().getGroup_2_1(), "rule__ListValue__Group_2_1__0");
			builder.put(grammarAccess.getSetValueAccess().getGroup(), "rule__SetValue__Group__0");
			builder.put(grammarAccess.getSetValueAccess().getGroup_2(), "rule__SetValue__Group_2__0");
			builder.put(grammarAccess.getSetValueAccess().getGroup_2_1(), "rule__SetValue__Group_2_1__0");
			builder.put(grammarAccess.getVerbActionAccess().getGroup(), "rule__VerbAction__Group__0");
			builder.put(grammarAccess.getActionRefAccess().getGroup(), "rule__ActionRef__Group__0");
			builder.put(grammarAccess.getVerifyActionAccess().getGroup(), "rule__VerifyAction__Group__0");
			builder.put(grammarAccess.getModelAccess().getNameAssignment_0_1(), "rule__Model__NameAssignment_0_1");
			builder.put(grammarAccess.getModelAccess().getModelRefsAssignment_1_0(), "rule__Model__ModelRefsAssignment_1_0");
			builder.put(grammarAccess.getModelAccess().getEntityDefsAssignment_1_1(), "rule__Model__EntityDefsAssignment_1_1");
			builder.put(grammarAccess.getModelAccess().getScenariosAssignment_1_2(), "rule__Model__ScenariosAssignment_1_2");
			builder.put(grammarAccess.getModelRefAccess().getModelRefAssignment_1(), "rule__ModelRef__ModelRefAssignment_1");
			builder.put(grammarAccess.getEntityDefAccess().getNameAssignment_1(), "rule__EntityDef__NameAssignment_1");
			builder.put(grammarAccess.getEntityDefAccess().getSuperEntitiesAssignment_2_1(), "rule__EntityDef__SuperEntitiesAssignment_2_1");
			builder.put(grammarAccess.getEntityDefAccess().getSuperEntitiesAssignment_2_2_1(), "rule__EntityDef__SuperEntitiesAssignment_2_2_1");
			builder.put(grammarAccess.getEntityDefAccess().getActionsAssignment_4_1(), "rule__EntityDef__ActionsAssignment_4_1");
			builder.put(grammarAccess.getEntityDefAccess().getActionsAssignment_4_2_1(), "rule__EntityDef__ActionsAssignment_4_2_1");
			builder.put(grammarAccess.getEntityDefAccess().getStatesAssignment_5_1(), "rule__EntityDef__StatesAssignment_5_1");
			builder.put(grammarAccess.getEntityDefAccess().getStatesAssignment_5_2_1(), "rule__EntityDef__StatesAssignment_5_2_1");
			builder.put(grammarAccess.getEntityDefAccess().getPropertiesAssignment_6_1(), "rule__EntityDef__PropertiesAssignment_6_1");
			builder.put(grammarAccess.getEntityDefAccess().getPropertiesAssignment_6_2_1(), "rule__EntityDef__PropertiesAssignment_6_2_1");
			builder.put(grammarAccess.getActionDefAccess().getNameAssignment_0(), "rule__ActionDef__NameAssignment_0");
			builder.put(grammarAccess.getActionDefAccess().getArgumentAssignment_1(), "rule__ActionDef__ArgumentAssignment_1");
			builder.put(grammarAccess.getActionDefAccess().getPrepositionAssignment_2_0(), "rule__ActionDef__PrepositionAssignment_2_0");
			builder.put(grammarAccess.getActionDefAccess().getOptionalPrefAssignment_2_1_0(), "rule__ActionDef__OptionalPrefAssignment_2_1_0");
			builder.put(grammarAccess.getActionDefAccess().getPrepositionAssignment_2_1_1(), "rule__ActionDef__PrepositionAssignment_2_1_1");
			builder.put(grammarAccess.getStateDefAccess().getPostiveAssignment_0(), "rule__StateDef__PostiveAssignment_0");
			builder.put(grammarAccess.getStateDefAccess().getNegativeAssignment_1_1(), "rule__StateDef__NegativeAssignment_1_1");
			builder.put(grammarAccess.getStateNameAccess().getNameAssignment(), "rule__StateName__NameAssignment");
			builder.put(grammarAccess.getPropertyDefAccess().getNameAssignment_0(), "rule__PropertyDef__NameAssignment_0");
			builder.put(grammarAccess.getPropertyDefAccess().getPluralAssignment_1(), "rule__PropertyDef__PluralAssignment_1");
			builder.put(grammarAccess.getScenarioAccess().getNameAssignment_1(), "rule__Scenario__NameAssignment_1");
			builder.put(grammarAccess.getScenarioAccess().getPreStateAssignment_3(), "rule__Scenario__PreStateAssignment_3");
			builder.put(grammarAccess.getScenarioAccess().getActionAssignment_6(), "rule__Scenario__ActionAssignment_6");
			builder.put(grammarAccess.getScenarioAccess().getPostStateAssignment_8(), "rule__Scenario__PostStateAssignment_8");
			builder.put(grammarAccess.getScenarioStateAccess().getStatesAssignment_0(), "rule__ScenarioState__StatesAssignment_0");
			builder.put(grammarAccess.getScenarioStateAccess().getStatesAssignment_1_1(), "rule__ScenarioState__StatesAssignment_1_1");
			builder.put(grammarAccess.getScenarioActionAccess().getActionsAssignment_0(), "rule__ScenarioAction__ActionsAssignment_0");
			builder.put(grammarAccess.getScenarioActionAccess().getActionsAssignment_1_1(), "rule__ScenarioAction__ActionsAssignment_1_1");
			builder.put(grammarAccess.getScenarioRefAccess().getScenarioRefAssignment(), "rule__ScenarioRef__ScenarioRefAssignment");
			builder.put(grammarAccess.getEntityRefAccess().getEntityAssignment_0_1(), "rule__EntityRef__EntityAssignment_0_1");
			builder.put(grammarAccess.getEntityRefAccess().getNameAssignment_0_2(), "rule__EntityRef__NameAssignment_0_2");
			builder.put(grammarAccess.getEntityRefAccess().getNameAssignment_1(), "rule__EntityRef__NameAssignment_1");
			builder.put(grammarAccess.getEntityStatePhraseAccess().getEntityAssignment_0(), "rule__EntityStatePhrase__EntityAssignment_0");
			builder.put(grammarAccess.getEntityStatePhraseAccess().getStateAssignment_2(), "rule__EntityStatePhrase__StateAssignment_2");
			builder.put(grammarAccess.getEntityPropertyStatePhraseAccess().getPropertyAssignment_1(), "rule__EntityPropertyStatePhrase__PropertyAssignment_1");
			builder.put(grammarAccess.getEntityPropertyStatePhraseAccess().getEntityAssignment_3(), "rule__EntityPropertyStatePhrase__EntityAssignment_3");
			builder.put(grammarAccess.getEntityPropertyStatePhraseAccess().getValueAssignment_4_0_1(), "rule__EntityPropertyStatePhrase__ValueAssignment_4_0_1");
			builder.put(grammarAccess.getEntityPropertyStatePhraseAccess().getValuesAssignment_4_1_1(), "rule__EntityPropertyStatePhrase__ValuesAssignment_4_1_1");
			builder.put(grammarAccess.getEntityPropertyStatePhraseAccess().getValuesAssignment_4_1_2_1(), "rule__EntityPropertyStatePhrase__ValuesAssignment_4_1_2_1");
			builder.put(grammarAccess.getListValueAccess().getValuesAssignment_2_0(), "rule__ListValue__ValuesAssignment_2_0");
			builder.put(grammarAccess.getListValueAccess().getValuesAssignment_2_1_1(), "rule__ListValue__ValuesAssignment_2_1_1");
			builder.put(grammarAccess.getSetValueAccess().getValuesAssignment_2_0(), "rule__SetValue__ValuesAssignment_2_0");
			builder.put(grammarAccess.getSetValueAccess().getValuesAssignment_2_1_1(), "rule__SetValue__ValuesAssignment_2_1_1");
			builder.put(grammarAccess.getStringValueAccess().getValueAssignment(), "rule__StringValue__ValueAssignment");
			builder.put(grammarAccess.getIntValueAccess().getValueAssignment(), "rule__IntValue__ValueAssignment");
			builder.put(grammarAccess.getBooleanValueAccess().getValueAssignment(), "rule__BooleanValue__ValueAssignment");
			builder.put(grammarAccess.getVerbActionAccess().getActionAssignment_0(), "rule__VerbAction__ActionAssignment_0");
			builder.put(grammarAccess.getVerbActionAccess().getEntityAssignment_1(), "rule__VerbAction__EntityAssignment_1");
			builder.put(grammarAccess.getActionRefAccess().getVerbAssignment_0(), "rule__ActionRef__VerbAssignment_0");
			builder.put(grammarAccess.getActionRefAccess().getArgumentAssignment_1(), "rule__ActionRef__ArgumentAssignment_1");
			builder.put(grammarAccess.getActionRefAccess().getPrepositionAssignment_2(), "rule__ActionRef__PrepositionAssignment_2");
			builder.put(grammarAccess.getVerifyActionAccess().getStateAssignment_1(), "rule__VerifyAction__StateAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private BddDslGrammarAccess grammarAccess;

	@Override
	protected InternalBddDslParser createParser() {
		InternalBddDslParser result = new InternalBddDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public BddDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BddDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
