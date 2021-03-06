/**
 * generated by Xtext 2.19.0
 */
package no.hal.bdd.bddDsl.impl;

import no.hal.bdd.bddDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BddDslFactoryImpl extends EFactoryImpl implements BddDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BddDslFactory init()
  {
    try
    {
      BddDslFactory theBddDslFactory = (BddDslFactory)EPackage.Registry.INSTANCE.getEFactory(BddDslPackage.eNS_URI);
      if (theBddDslFactory != null)
      {
        return theBddDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BddDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BddDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BddDslPackage.MODEL: return createModel();
      case BddDslPackage.MODEL_REF: return createModelRef();
      case BddDslPackage.ENTITY_DEF: return createEntityDef();
      case BddDslPackage.ACTION_DEF: return createActionDef();
      case BddDslPackage.STATE_DEF: return createStateDef();
      case BddDslPackage.STATE_NAME: return createStateName();
      case BddDslPackage.PROPERTY_DEF: return createPropertyDef();
      case BddDslPackage.SCENARIO: return createScenario();
      case BddDslPackage.SCENARIO_STATE: return createScenarioState();
      case BddDslPackage.SCENARIO_ACTION: return createScenarioAction();
      case BddDslPackage.STATE_PHRASE: return createStatePhrase();
      case BddDslPackage.SCENARIO_REF: return createScenarioRef();
      case BddDslPackage.ENTITY_REF: return createEntityRef();
      case BddDslPackage.ENTITY_STATE_PHRASE: return createEntityStatePhrase();
      case BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE: return createEntityPropertyStatePhrase();
      case BddDslPackage.PROPERTY_VALUE: return createPropertyValue();
      case BddDslPackage.SIMPLE_VALUE: return createSimpleValue();
      case BddDslPackage.LIST_VALUE: return createListValue();
      case BddDslPackage.SET_VALUE: return createSetValue();
      case BddDslPackage.STRING_VALUE: return createStringValue();
      case BddDslPackage.INT_VALUE: return createIntValue();
      case BddDslPackage.BOOLEAN_VALUE: return createBooleanValue();
      case BddDslPackage.ACTION_PHRASE: return createActionPhrase();
      case BddDslPackage.VERB_ACTION: return createVerbAction();
      case BddDslPackage.ACTION_REF: return createActionRef();
      case BddDslPackage.VERIFY_ACTION: return createVerifyAction();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ModelRef createModelRef()
  {
    ModelRefImpl modelRef = new ModelRefImpl();
    return modelRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityDef createEntityDef()
  {
    EntityDefImpl entityDef = new EntityDefImpl();
    return entityDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ActionDef createActionDef()
  {
    ActionDefImpl actionDef = new ActionDefImpl();
    return actionDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StateDef createStateDef()
  {
    StateDefImpl stateDef = new StateDefImpl();
    return stateDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StateName createStateName()
  {
    StateNameImpl stateName = new StateNameImpl();
    return stateName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertyDef createPropertyDef()
  {
    PropertyDefImpl propertyDef = new PropertyDefImpl();
    return propertyDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Scenario createScenario()
  {
    ScenarioImpl scenario = new ScenarioImpl();
    return scenario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ScenarioState createScenarioState()
  {
    ScenarioStateImpl scenarioState = new ScenarioStateImpl();
    return scenarioState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ScenarioAction createScenarioAction()
  {
    ScenarioActionImpl scenarioAction = new ScenarioActionImpl();
    return scenarioAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StatePhrase createStatePhrase()
  {
    StatePhraseImpl statePhrase = new StatePhraseImpl();
    return statePhrase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ScenarioRef createScenarioRef()
  {
    ScenarioRefImpl scenarioRef = new ScenarioRefImpl();
    return scenarioRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityRef createEntityRef()
  {
    EntityRefImpl entityRef = new EntityRefImpl();
    return entityRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityStatePhrase createEntityStatePhrase()
  {
    EntityStatePhraseImpl entityStatePhrase = new EntityStatePhraseImpl();
    return entityStatePhrase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityPropertyStatePhrase createEntityPropertyStatePhrase()
  {
    EntityPropertyStatePhraseImpl entityPropertyStatePhrase = new EntityPropertyStatePhraseImpl();
    return entityPropertyStatePhrase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertyValue createPropertyValue()
  {
    PropertyValueImpl propertyValue = new PropertyValueImpl();
    return propertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SimpleValue createSimpleValue()
  {
    SimpleValueImpl simpleValue = new SimpleValueImpl();
    return simpleValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ListValue createListValue()
  {
    ListValueImpl listValue = new ListValueImpl();
    return listValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SetValue createSetValue()
  {
    SetValueImpl setValue = new SetValueImpl();
    return setValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringValue createStringValue()
  {
    StringValueImpl stringValue = new StringValueImpl();
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntValue createIntValue()
  {
    IntValueImpl intValue = new IntValueImpl();
    return intValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanValue createBooleanValue()
  {
    BooleanValueImpl booleanValue = new BooleanValueImpl();
    return booleanValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ActionPhrase createActionPhrase()
  {
    ActionPhraseImpl actionPhrase = new ActionPhraseImpl();
    return actionPhrase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VerbAction createVerbAction()
  {
    VerbActionImpl verbAction = new VerbActionImpl();
    return verbAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ActionRef createActionRef()
  {
    ActionRefImpl actionRef = new ActionRefImpl();
    return actionRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VerifyAction createVerifyAction()
  {
    VerifyActionImpl verifyAction = new VerifyActionImpl();
    return verifyAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BddDslPackage getBddDslPackage()
  {
    return (BddDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BddDslPackage getPackage()
  {
    return BddDslPackage.eINSTANCE;
  }

} //BddDslFactoryImpl
