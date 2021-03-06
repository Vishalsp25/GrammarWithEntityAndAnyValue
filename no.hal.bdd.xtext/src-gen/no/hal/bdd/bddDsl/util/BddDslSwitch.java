/**
 * generated by Xtext 2.19.0
 */
package no.hal.bdd.bddDsl.util;

import no.hal.bdd.bddDsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see no.hal.bdd.bddDsl.BddDslPackage
 * @generated
 */
public class BddDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BddDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BddDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = BddDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case BddDslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.MODEL_REF:
      {
        ModelRef modelRef = (ModelRef)theEObject;
        T result = caseModelRef(modelRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.ENTITY_DEF:
      {
        EntityDef entityDef = (EntityDef)theEObject;
        T result = caseEntityDef(entityDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.ACTION_DEF:
      {
        ActionDef actionDef = (ActionDef)theEObject;
        T result = caseActionDef(actionDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.STATE_DEF:
      {
        StateDef stateDef = (StateDef)theEObject;
        T result = caseStateDef(stateDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.STATE_NAME:
      {
        StateName stateName = (StateName)theEObject;
        T result = caseStateName(stateName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.PROPERTY_DEF:
      {
        PropertyDef propertyDef = (PropertyDef)theEObject;
        T result = casePropertyDef(propertyDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.SCENARIO:
      {
        Scenario scenario = (Scenario)theEObject;
        T result = caseScenario(scenario);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.SCENARIO_STATE:
      {
        ScenarioState scenarioState = (ScenarioState)theEObject;
        T result = caseScenarioState(scenarioState);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.SCENARIO_ACTION:
      {
        ScenarioAction scenarioAction = (ScenarioAction)theEObject;
        T result = caseScenarioAction(scenarioAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.STATE_PHRASE:
      {
        StatePhrase statePhrase = (StatePhrase)theEObject;
        T result = caseStatePhrase(statePhrase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.SCENARIO_REF:
      {
        ScenarioRef scenarioRef = (ScenarioRef)theEObject;
        T result = caseScenarioRef(scenarioRef);
        if (result == null) result = caseStatePhrase(scenarioRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.ENTITY_REF:
      {
        EntityRef entityRef = (EntityRef)theEObject;
        T result = caseEntityRef(entityRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.ENTITY_STATE_PHRASE:
      {
        EntityStatePhrase entityStatePhrase = (EntityStatePhrase)theEObject;
        T result = caseEntityStatePhrase(entityStatePhrase);
        if (result == null) result = caseStatePhrase(entityStatePhrase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE:
      {
        EntityPropertyStatePhrase entityPropertyStatePhrase = (EntityPropertyStatePhrase)theEObject;
        T result = caseEntityPropertyStatePhrase(entityPropertyStatePhrase);
        if (result == null) result = caseStatePhrase(entityPropertyStatePhrase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.PROPERTY_VALUE:
      {
        PropertyValue propertyValue = (PropertyValue)theEObject;
        T result = casePropertyValue(propertyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.SIMPLE_VALUE:
      {
        SimpleValue simpleValue = (SimpleValue)theEObject;
        T result = caseSimpleValue(simpleValue);
        if (result == null) result = casePropertyValue(simpleValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.LIST_VALUE:
      {
        ListValue listValue = (ListValue)theEObject;
        T result = caseListValue(listValue);
        if (result == null) result = casePropertyValue(listValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.SET_VALUE:
      {
        SetValue setValue = (SetValue)theEObject;
        T result = caseSetValue(setValue);
        if (result == null) result = casePropertyValue(setValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.STRING_VALUE:
      {
        StringValue stringValue = (StringValue)theEObject;
        T result = caseStringValue(stringValue);
        if (result == null) result = caseSimpleValue(stringValue);
        if (result == null) result = casePropertyValue(stringValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.INT_VALUE:
      {
        IntValue intValue = (IntValue)theEObject;
        T result = caseIntValue(intValue);
        if (result == null) result = caseSimpleValue(intValue);
        if (result == null) result = casePropertyValue(intValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.BOOLEAN_VALUE:
      {
        BooleanValue booleanValue = (BooleanValue)theEObject;
        T result = caseBooleanValue(booleanValue);
        if (result == null) result = caseSimpleValue(booleanValue);
        if (result == null) result = casePropertyValue(booleanValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.ACTION_PHRASE:
      {
        ActionPhrase actionPhrase = (ActionPhrase)theEObject;
        T result = caseActionPhrase(actionPhrase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.VERB_ACTION:
      {
        VerbAction verbAction = (VerbAction)theEObject;
        T result = caseVerbAction(verbAction);
        if (result == null) result = caseActionPhrase(verbAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.ACTION_REF:
      {
        ActionRef actionRef = (ActionRef)theEObject;
        T result = caseActionRef(actionRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BddDslPackage.VERIFY_ACTION:
      {
        VerifyAction verifyAction = (VerifyAction)theEObject;
        T result = caseVerifyAction(verifyAction);
        if (result == null) result = caseActionPhrase(verifyAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelRef(ModelRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityDef(EntityDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionDef(ActionDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateDef(StateDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateName(StateName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyDef(PropertyDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScenario(Scenario object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scenario State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scenario State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScenarioState(ScenarioState object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scenario Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scenario Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScenarioAction(ScenarioAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Phrase</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Phrase</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatePhrase(StatePhrase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scenario Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scenario Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScenarioRef(ScenarioRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityRef(EntityRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity State Phrase</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity State Phrase</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityStatePhrase(EntityStatePhrase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity Property State Phrase</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity Property State Phrase</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityPropertyStatePhrase(EntityPropertyStatePhrase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyValue(PropertyValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleValue(SimpleValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListValue(ListValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetValue(SetValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringValue(StringValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntValue(IntValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanValue(BooleanValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Phrase</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Phrase</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionPhrase(ActionPhrase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Verb Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Verb Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVerbAction(VerbAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionRef(ActionRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Verify Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Verify Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVerifyAction(VerifyAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //BddDslSwitch
