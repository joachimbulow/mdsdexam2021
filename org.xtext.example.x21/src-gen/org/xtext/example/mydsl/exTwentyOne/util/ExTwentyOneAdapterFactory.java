/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.exTwentyOne.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.mydsl.exTwentyOne.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.exTwentyOne.ExTwentyOnePackage
 * @generated
 */
public class ExTwentyOneAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ExTwentyOnePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExTwentyOneAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ExTwentyOnePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExTwentyOneSwitch<Adapter> modelSwitch =
    new ExTwentyOneSwitch<Adapter>()
    {
      @Override
      public Adapter caseProgram(Program object)
      {
        return createProgramAdapter();
      }
      @Override
      public Adapter caseDeclaration(Declaration object)
      {
        return createDeclarationAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseFunction(Function object)
      {
        return createFunctionAdapter();
      }
      @Override
      public Adapter caseLambda(Lambda object)
      {
        return createLambdaAdapter();
      }
      @Override
      public Adapter caseInput(Input object)
      {
        return createInputAdapter();
      }
      @Override
      public Adapter caseNode(Node object)
      {
        return createNodeAdapter();
      }
      @Override
      public Adapter caseStream(Stream object)
      {
        return createStreamAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseDataDecl(DataDecl object)
      {
        return createDataDeclAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseInputOrNode(InputOrNode object)
      {
        return createInputOrNodeAdapter();
      }
      @Override
      public Adapter caseNodeOrFunction(NodeOrFunction object)
      {
        return createNodeOrFunctionAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseNewInput(NewInput object)
      {
        return createNewInputAdapter();
      }
      @Override
      public Adapter caseLogicExp(LogicExp object)
      {
        return createLogicExpAdapter();
      }
      @Override
      public Adapter casePlus(Plus object)
      {
        return createPlusAdapter();
      }
      @Override
      public Adapter caseMinus(Minus object)
      {
        return createMinusAdapter();
      }
      @Override
      public Adapter caseMult(Mult object)
      {
        return createMultAdapter();
      }
      @Override
      public Adapter caseDivide(Divide object)
      {
        return createDivideAdapter();
      }
      @Override
      public Adapter caseParenthesis(Parenthesis object)
      {
        return createParenthesisAdapter();
      }
      @Override
      public Adapter caseDataAccess(DataAccess object)
      {
        return createDataAccessAdapter();
      }
      @Override
      public Adapter caseIfThenElse(IfThenElse object)
      {
        return createIfThenElseAdapter();
      }
      @Override
      public Adapter caseLetBinding(LetBinding object)
      {
        return createLetBindingAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.exTwentyOne.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.exTwentyOne.Program
   * @generated
   */
  public Adapter createProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.exTwentyOne.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.exTwentyOne.Declaration
   * @generated
   */
  public Adapter createDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.exTwentyOne.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.exTwentyOne.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.exTwentyOne.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.exTwentyOne.Function
   * @generated
   */
  public Adapter createFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.exTwentyOne.Lambda <em>Lambda</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.exTwentyOne.Lambda
   * @generated
   */
  public Adapter createLambdaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.exTwentyOne.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.exTwentyOne.Input
   * @generated
   */
  public Adapter createInputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.exTwentyOne.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.exTwentyOne.Node
   * @generated
   */
  public Adapter createNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.exTwentyOne.Stream <em>Stream</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.exTwentyOne.Stream
   * @generated
   */
  public Adapter createStreamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.exTwentyOne.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.exTwentyOne.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.exTwentyOne.DataDecl <em>Data Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.exTwentyOne.DataDecl
   * @generated
   */
  public Adapter createDataDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.exTwentyOne.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.exTwentyOne.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.exTwentyOne.InputOrNode <em>Input Or Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.exTwentyOne.InputOrNode
   * @generated
   */
  public Adapter createInputOrNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.exTwentyOne.NodeOrFunction <em>Node Or Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.exTwentyOne.NodeOrFunction
   * @generated
   */
  public Adapter createNodeOrFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.exTwentyOne.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.exTwentyOne.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.exTwentyOne.NewInput <em>New Input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.exTwentyOne.NewInput
   * @generated
   */
  public Adapter createNewInputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.exTwentyOne.LogicExp <em>Logic Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.exTwentyOne.LogicExp
   * @generated
   */
  public Adapter createLogicExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.exTwentyOne.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.exTwentyOne.Plus
   * @generated
   */
  public Adapter createPlusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.exTwentyOne.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.exTwentyOne.Minus
   * @generated
   */
  public Adapter createMinusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.exTwentyOne.Mult <em>Mult</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.exTwentyOne.Mult
   * @generated
   */
  public Adapter createMultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.exTwentyOne.Divide <em>Divide</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.exTwentyOne.Divide
   * @generated
   */
  public Adapter createDivideAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.exTwentyOne.Parenthesis <em>Parenthesis</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.exTwentyOne.Parenthesis
   * @generated
   */
  public Adapter createParenthesisAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.exTwentyOne.DataAccess <em>Data Access</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.exTwentyOne.DataAccess
   * @generated
   */
  public Adapter createDataAccessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.exTwentyOne.IfThenElse <em>If Then Else</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.exTwentyOne.IfThenElse
   * @generated
   */
  public Adapter createIfThenElseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.exTwentyOne.LetBinding <em>Let Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.exTwentyOne.LetBinding
   * @generated
   */
  public Adapter createLetBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ExTwentyOneAdapterFactory
