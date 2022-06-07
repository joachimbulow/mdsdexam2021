/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.exTwentyOne.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.exTwentyOne.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExTwentyOneFactoryImpl extends EFactoryImpl implements ExTwentyOneFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ExTwentyOneFactory init()
  {
    try
    {
      ExTwentyOneFactory theExTwentyOneFactory = (ExTwentyOneFactory)EPackage.Registry.INSTANCE.getEFactory(ExTwentyOnePackage.eNS_URI);
      if (theExTwentyOneFactory != null)
      {
        return theExTwentyOneFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ExTwentyOneFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExTwentyOneFactoryImpl()
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
      case ExTwentyOnePackage.PROGRAM: return createProgram();
      case ExTwentyOnePackage.DECLARATION: return createDeclaration();
      case ExTwentyOnePackage.PARAMETER: return createParameter();
      case ExTwentyOnePackage.FUNCTION: return createFunction();
      case ExTwentyOnePackage.LAMBDA: return createLambda();
      case ExTwentyOnePackage.INPUT: return createInput();
      case ExTwentyOnePackage.NODE: return createNode();
      case ExTwentyOnePackage.STREAM: return createStream();
      case ExTwentyOnePackage.ELEMENT: return createElement();
      case ExTwentyOnePackage.DATA_DECL: return createDataDecl();
      case ExTwentyOnePackage.INPUT_OR_NODE: return createInputOrNode();
      case ExTwentyOnePackage.NODE_OR_FUNCTION: return createNodeOrFunction();
      case ExTwentyOnePackage.EXPRESSION: return createExpression();
      case ExTwentyOnePackage.NEW_INPUT: return createNewInput();
      case ExTwentyOnePackage.LOGIC_EXP: return createLogicExp();
      case ExTwentyOnePackage.PLUS: return createPlus();
      case ExTwentyOnePackage.MINUS: return createMinus();
      case ExTwentyOnePackage.MULT: return createMult();
      case ExTwentyOnePackage.DIVIDE: return createDivide();
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
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Lambda createLambda()
  {
    LambdaImpl lambda = new LambdaImpl();
    return lambda;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Input createInput()
  {
    InputImpl input = new InputImpl();
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Node createNode()
  {
    NodeImpl node = new NodeImpl();
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Stream createStream()
  {
    StreamImpl stream = new StreamImpl();
    return stream;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataDecl createDataDecl()
  {
    DataDeclImpl dataDecl = new DataDeclImpl();
    return dataDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InputOrNode createInputOrNode()
  {
    InputOrNodeImpl inputOrNode = new InputOrNodeImpl();
    return inputOrNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NodeOrFunction createNodeOrFunction()
  {
    NodeOrFunctionImpl nodeOrFunction = new NodeOrFunctionImpl();
    return nodeOrFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NewInput createNewInput()
  {
    NewInputImpl newInput = new NewInputImpl();
    return newInput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LogicExp createLogicExp()
  {
    LogicExpImpl logicExp = new LogicExpImpl();
    return logicExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mult createMult()
  {
    MultImpl mult = new MultImpl();
    return mult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Divide createDivide()
  {
    DivideImpl divide = new DivideImpl();
    return divide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExTwentyOnePackage getExTwentyOnePackage()
  {
    return (ExTwentyOnePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ExTwentyOnePackage getPackage()
  {
    return ExTwentyOnePackage.eINSTANCE;
  }

} //ExTwentyOneFactoryImpl
