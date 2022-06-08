/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.generator;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.example.mydsl.exTwentyOne.DataAccess;
import org.xtext.example.mydsl.exTwentyOne.Declaration;
import org.xtext.example.mydsl.exTwentyOne.Element;
import org.xtext.example.mydsl.exTwentyOne.Expression;
import org.xtext.example.mydsl.exTwentyOne.Function;
import org.xtext.example.mydsl.exTwentyOne.IfThenElse;
import org.xtext.example.mydsl.exTwentyOne.Input;
import org.xtext.example.mydsl.exTwentyOne.InputOrNode;
import org.xtext.example.mydsl.exTwentyOne.Lambda;
import org.xtext.example.mydsl.exTwentyOne.LetBinding;
import org.xtext.example.mydsl.exTwentyOne.LogicExp;
import org.xtext.example.mydsl.exTwentyOne.Minus;
import org.xtext.example.mydsl.exTwentyOne.NewInput;
import org.xtext.example.mydsl.exTwentyOne.Node;
import org.xtext.example.mydsl.exTwentyOne.NodeOrFunction;
import org.xtext.example.mydsl.exTwentyOne.Plus;
import org.xtext.example.mydsl.exTwentyOne.Program;
import org.xtext.example.mydsl.exTwentyOne.Stream;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class ExTwentyOneGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Program program = Iterators.<Program>filter(resource.getAllContents(), Program.class).next();
    String _name = program.getName();
    String _plus = ("x21/" + _name);
    String _plus_1 = (_plus + ".java");
    fsa.generateFile(_plus_1, 
      ExTwentyOneGenerator.compile(program));
  }
  
  public static CharSequence compile(final Program program) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _name = program.getName();
    _builder.append(_name);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    String _upper = ExTwentyOneGenerator.toUpper(program.getName());
    _builder.append(_upper);
    _builder.append("Main extends GenericMainX21 {");
    _builder.newLineIfNotEmpty();
    _builder.append("// Code for function add1");
    _builder.newLine();
    {
      List<Declaration> _filterDeclarations = ExTwentyOneGenerator.filterDeclarations(program.getDeclarations(), Function.class);
      for(final Declaration function : _filterDeclarations) {
        CharSequence _compileFunction = ExTwentyOneGenerator.compileFunction(((Function) function));
        _builder.append(_compileFunction);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("// Code for node add1node");
    _builder.newLine();
    {
      List<Declaration> _filterDeclarations_1 = ExTwentyOneGenerator.filterDeclarations(program.getDeclarations(), Node.class);
      for(final Declaration node : _filterDeclarations_1) {
        CharSequence _compileNode = ExTwentyOneGenerator.compileNode(((Node) node));
        _builder.append(_compileNode);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      ArrayList<Element> _outputNodes = ExTwentyOneGenerator.getOutputNodes(program.getDeclarations());
      for(final Element outputNode : _outputNodes) {
        CharSequence _compileOutputNode = ExTwentyOneGenerator.compileOutputNode(outputNode.getOutput());
        _builder.append(_compileOutputNode);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    ExTwentyOneGenerator.compileNodeInitialization(program.getDeclarations());
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _compileNodeNetwork = ExTwentyOneGenerator.compileNodeNetwork(program.getDeclarations());
    _builder.append(_compileNodeNetwork);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence compileFunction(final Function function) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private Object fun_");
    String _name = function.getName();
    _builder.append(_name);
    _builder.append("(Object arg) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return funimpl_");
    String _name_1 = function.getName();
    _builder.append(_name_1, "\t");
    _builder.append("((Integer)arg);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.append("private Object funimpl_");
    String _name_2 = function.getName();
    _builder.append(_name_2);
    _builder.append("(Integer _");
    String _name_3 = function.getLambda().getName();
    _builder.append(_name_3);
    _builder.append("){ return (");
    String _compileExpression = ExTwentyOneGenerator.compileExpression(function.getLambda().getLambdaExp());
    _builder.append(_compileExpression);
    _builder.append("); }");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence compileNode(final Node node) {
    CharSequence _xblockexpression = null;
    {
      String functionCompilation = "";
      Lambda _lambda = node.getLambda();
      boolean _tripleNotEquals = (_lambda != null);
      if (_tripleNotEquals) {
        StringConcatenation _builder = new StringConcatenation();
        String _compileExpression = ExTwentyOneGenerator.compileExpression(node.getLambda().getLambdaExp());
        _builder.append(_compileExpression);
        _builder.newLineIfNotEmpty();
        functionCompilation = _builder.toString();
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("fun_");
        String _name = node.getFunction().getName();
        _builder_1.append(_name);
        _builder_1.append("(input)");
        _builder_1.newLineIfNotEmpty();
        functionCompilation = _builder_1.toString();
      }
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("private ComputeNode <Object,Object> node_");
      String _name_1 = node.getName();
      _builder_2.append(_name_1);
      _builder_2.append(" = new AbstractComputeNode<Object,Object>() {");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t");
      _builder_2.append("protected Object function(Object input) {");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("return ");
      _builder_2.append(functionCompilation, "\t");
      _builder_2.append(";");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t");
      _builder_2.append("}");
      _builder_2.newLine();
      _builder_2.append("};");
      _builder_2.newLine();
      _xblockexpression = _builder_2;
    }
    return _xblockexpression;
  }
  
  public static CharSequence compileOutputNode(final String nodeName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private OutputNode<Object> node_");
    _builder.append(nodeName);
    _builder.append(" = new OutputNode<Object>();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("public List<Object> get");
    String _firstUpper = StringExtensions.toFirstUpper(nodeName);
    _builder.append(_firstUpper, "\t\t\t");
    _builder.append("() { return node_nodeName.getData(); }");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static void compileNodeInitialization(final List<Declaration> declarations) {
    ArrayList<InputOrNode> nodesAndInputs = ExTwentyOneGenerator.getNodesForInitialization(declarations);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Initialization of specific nodes");
    _builder.newLine();
    _builder.append("protected void initializeNodes() {");
    _builder.newLine();
    {
      for(final InputOrNode nodeOrInput : nodesAndInputs) {
        _builder.append("\t");
        _builder.append("super.addNode(");
        String _compileInputOrNode = ExTwentyOneGenerator.compileInputOrNode(nodeOrInput);
        _builder.append(_compileInputOrNode, "\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    String result = _builder.toString();
  }
  
  public static CharSequence compileNodeNetwork(final List<Declaration> declarations) {
    CharSequence _xblockexpression = null;
    {
      HashMap<String, String> relationMap = ExTwentyOneGenerator.getAllNetworkNodes(declarations);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("protected void initializeNetwork() {");
      _builder.newLine();
      {
        Set<String> _keySet = relationMap.keySet();
        for(final String relationMapKey : _keySet) {
          _builder.append("\t");
          _builder.append(relationMapKey, "\t");
          _builder.append(".addOutputNode(node_");
          String _get = relationMap.get(relationMapKey);
          _builder.append(_get, "\t");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public static String compileInputOrNode(final InputOrNode inputOrNode) {
    String _switchResult = null;
    boolean _matched = false;
    if (inputOrNode instanceof Input) {
      _matched=true;
      _switchResult = ((Input)inputOrNode).getName();
    }
    if (!_matched) {
      if (inputOrNode instanceof Node) {
        _matched=true;
        _switchResult = ((Node)inputOrNode).getName();
      }
    }
    return _switchResult;
  }
  
  public static String compileElement(final Element element) {
    NodeOrFunction _node = element.getNode();
    boolean _tripleNotEquals = (_node != null);
    if (_tripleNotEquals) {
      return ExTwentyOneGenerator.compileNodeOrFunction(element.getNode());
    }
    String _output = element.getOutput();
    boolean _tripleNotEquals_1 = (_output != null);
    if (_tripleNotEquals_1) {
      return element.getOutput();
    }
    String _element = element.getElement();
    boolean _tripleNotEquals_2 = (_element != null);
    if (_tripleNotEquals_2) {
      return element.getElement();
    }
    return "something went wrong in compileElement";
  }
  
  public static String compileNodeOrFunction(final NodeOrFunction nodeOrFunction) {
    String _switchResult = null;
    boolean _matched = false;
    if (nodeOrFunction instanceof Node) {
      _matched=true;
      _switchResult = ((Node)nodeOrFunction).getName();
    }
    if (!_matched) {
      _matched=true;
      if (!_matched) {
        if (nodeOrFunction instanceof Function) {
          _matched=true;
        }
      }
      if (_matched) {
        _switchResult = ((Function)nodeOrFunction).getName();
      }
    }
    return _switchResult;
  }
  
  protected static String _compileExpression(final Plus exp) {
    return "Plus!";
  }
  
  protected static String _compileExpression(final Minus exp) {
    return "Minus!";
  }
  
  protected static String _compileExpression(final LetBinding exp) {
    return "LetBinding!";
  }
  
  protected static String _compileExpression(final IfThenElse exp) {
    return "IfThenElse!";
  }
  
  protected static String _compileExpression(final LogicExp exp) {
    return "LogicExp!";
  }
  
  protected static String _compileExpression(final DataAccess exp) {
    return "DataAccess!";
  }
  
  protected static String _compileExpression(final NewInput exp) {
    return "NewInput!";
  }
  
  protected static String _compileExpression(final Expression exp) {
    return "Expression!";
  }
  
  public static String toUpper(final String it) {
    return it.toUpperCase();
  }
  
  public static List<Declaration> filterDeclarations(final List<Declaration> declarations, final Class<?> type) {
    final Predicate<Declaration> _function = (Declaration declaration) -> {
      return type.isInstance(declaration);
    };
    return declarations.stream().filter(_function).collect(Collectors.<Declaration>toList());
  }
  
  public static ArrayList<Element> getOutputNodes(final List<Declaration> declarations) {
    List<Declaration> streams = ExTwentyOneGenerator.filterDeclarations(declarations, Stream.class);
    ArrayList<Element> outputNodes = new ArrayList<Element>();
    for (final Declaration stream : streams) {
      final Function1<Element, Boolean> _function = (Element e) -> {
        String _output = e.getOutput();
        return Boolean.valueOf((_output != null));
      };
      Iterables.<Element>addAll(outputNodes, IterableExtensions.<Element>filter(((Stream) stream).getElements(), _function));
    }
    return outputNodes;
  }
  
  public static ArrayList<InputOrNode> getNodesForInitialization(final List<Declaration> declarations) {
    List<Declaration> inputs = ExTwentyOneGenerator.filterDeclarations(declarations, Input.class);
    List<Declaration> nodes = ExTwentyOneGenerator.filterDeclarations(declarations, Node.class);
    ArrayList<InputOrNode> nodesAndInputs = new ArrayList<InputOrNode>();
    for (final Declaration input : inputs) {
      nodesAndInputs.add(((Input) input));
    }
    for (final Declaration node : nodes) {
      nodesAndInputs.add(((Node) node));
    }
    return nodesAndInputs;
  }
  
  public static HashMap<String, String> getAllNetworkNodes(final List<Declaration> declarations) {
    List<Declaration> streams = ExTwentyOneGenerator.filterDeclarations(declarations, Stream.class);
    HashMap<String, String> relationMap = new HashMap<String, String>();
    for (final Declaration stream : streams) {
      EList<InputOrNode> _inputsOrNodes = ((Stream) stream).getInputsOrNodes();
      for (final InputOrNode inputOrNode : _inputsOrNodes) {
        EList<Element> _elements = ((Stream) stream).getElements();
        for (final Element element : _elements) {
          relationMap.put(ExTwentyOneGenerator.compileInputOrNode(inputOrNode), ExTwentyOneGenerator.compileElement(element));
        }
      }
    }
    return relationMap;
  }
  
  public static String compileExpression(final EObject exp) {
    if (exp instanceof DataAccess) {
      return _compileExpression((DataAccess)exp);
    } else if (exp instanceof IfThenElse) {
      return _compileExpression((IfThenElse)exp);
    } else if (exp instanceof LetBinding) {
      return _compileExpression((LetBinding)exp);
    } else if (exp instanceof Minus) {
      return _compileExpression((Minus)exp);
    } else if (exp instanceof NewInput) {
      return _compileExpression((NewInput)exp);
    } else if (exp instanceof Plus) {
      return _compileExpression((Plus)exp);
    } else if (exp instanceof Expression) {
      return _compileExpression((Expression)exp);
    } else if (exp instanceof LogicExp) {
      return _compileExpression((LogicExp)exp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp).toString());
    }
  }
}
