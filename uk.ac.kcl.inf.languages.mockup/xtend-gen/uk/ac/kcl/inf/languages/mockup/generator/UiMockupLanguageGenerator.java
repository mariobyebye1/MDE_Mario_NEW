/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.languages.mockup.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Attribute;
import uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.DataType;
import uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Entity;
import uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Expression;
import uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Model;
import uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Navigation;
import uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Screen;
import uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.Widget;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class UiMockupLanguageGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final Model model = ((Model) _head);
    this.generate(model, fsa);
  }
  
  public void generate(final Model model, final IFileSystemAccess2 fsa) {
    EList<EObject> _elements = model.getElements();
    for (final EObject element : _elements) {
      boolean _matched = false;
      if (element instanceof Entity) {
        _matched=true;
        this.generate(((Entity)element), fsa);
      }
      if (!_matched) {
        if (element instanceof Screen) {
          _matched=true;
          this.generate(((Screen)element), fsa);
        }
      }
      if (!_matched) {
        if (element instanceof Navigation) {
          _matched=true;
          this.generate(((Navigation)element), fsa);
        }
      }
    }
  }
  
  public void generate(final Entity entity, final IFileSystemAccess2 fsa) {
    String _name = entity.getName();
    String _plus = (_name + ".java");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.awt.Dimension;");
    _builder.newLine();
    _builder.append("import javax.swing.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name_1 = entity.getName();
    _builder.append(_name_1);
    _builder.append(" extends JPanel {");
    _builder.newLineIfNotEmpty();
    {
      Entity _extendsEntity = entity.getExtendsEntity();
      boolean _tripleNotEquals = (_extendsEntity != null);
      if (_tripleNotEquals) {
        _builder.append("\t");
        _builder.append("private ");
        String _name_2 = entity.getExtendsEntity().getName();
        _builder.append(_name_2, "\t");
        _builder.append(" ");
        String _firstLower = StringExtensions.toFirstLower(entity.getExtendsEntity().getName());
        _builder.append(_firstLower, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Attribute> _attributes = entity.getAttributes();
      for(final Attribute attribute : _attributes) {
        _builder.append("\t");
        _builder.append("private ");
        DataType _type = attribute.getType();
        _builder.append(_type, "\t");
        _builder.append(" ");
        String _firstLower_1 = StringExtensions.toFirstLower(attribute.getName());
        _builder.append(_firstLower_1, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_3 = entity.getName();
    _builder.append(_name_3, "\t");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("initComponents();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private void initComponents() {");
    _builder.newLine();
    {
      EList<Attribute> _attributes_1 = entity.getAttributes();
      for(final Attribute attribute_1 : _attributes_1) {
        _builder.append("\t\t");
        String _firstLower_2 = StringExtensions.toFirstLower(attribute_1.getName());
        _builder.append(_firstLower_2, "\t\t");
        _builder.append(" = new ");
        DataType _type_1 = attribute_1.getType();
        _builder.append(_type_1, "\t\t");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("add(new JLabel(\"");
        String _name_4 = attribute_1.getName();
        _builder.append(_name_4, "\t\t");
        _builder.append("\"));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("add(");
        String _firstLower_3 = StringExtensions.toFirstLower(attribute_1.getName());
        _builder.append(_firstLower_3, "\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    fsa.generateFile(_plus, _builder);
  }
  
  public void generate(final Screen screen, final IFileSystemAccess2 fsa) {
    String _name = screen.getName();
    String _plus = (_name + "Screen.java");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.awt.Dimension;");
    _builder.newLine();
    _builder.append("import javax.swing.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name_1 = screen.getName();
    _builder.append(_name_1);
    _builder.append("Screen extends JFrame {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private ");
    String _name_2 = screen.getEntity().getName();
    _builder.append(_name_2, "\t");
    _builder.append(" ");
    String _firstLower = StringExtensions.toFirstLower(screen.getEntity().getName());
    _builder.append(_firstLower, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    {
      EList<Widget> _widgets = screen.getWidgets();
      for(final Widget widget : _widgets) {
        _builder.append("\t");
        _builder.append("private ");
        Expression _label = widget.getLabel();
        _builder.append(_label, "\t");
        _builder.append(" ");
        String _firstLower_1 = StringExtensions.toFirstLower(widget.getName());
        _builder.append(_firstLower_1, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_3 = screen.getName();
    _builder.append(_name_3, "\t");
    _builder.append("Screen() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("setTitle(\"");
    String _name_4 = screen.getName();
    _builder.append(_name_4, "\t\t");
    _builder.append(" Screen\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("initComponents();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("pack();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("setVisible(true);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private void initComponents() {");
    _builder.newLine();
    _builder.append("\t\t");
    String _firstLower_2 = StringExtensions.toFirstLower(screen.getEntity().getName());
    _builder.append(_firstLower_2, "\t\t");
    _builder.append(" = new ");
    String _name_5 = screen.getEntity().getName();
    _builder.append(_name_5, "\t\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("add(");
    String _firstLower_3 = StringExtensions.toFirstLower(screen.getEntity().getName());
    _builder.append(_firstLower_3, "\t\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    {
      EList<Widget> _widgets_1 = screen.getWidgets();
      for(final Widget widget_1 : _widgets_1) {
        _builder.append("\t\t");
        String _firstLower_4 = StringExtensions.toFirstLower(widget_1.getName());
        _builder.append(_firstLower_4, "\t\t");
        _builder.append(" = new ");
        Expression _label_1 = widget_1.getLabel();
        _builder.append(_label_1, "\t\t");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        String _firstLower_5 = StringExtensions.toFirstLower(screen.getEntity().getName());
        _builder.append(_firstLower_5, "\t\t");
        _builder.append(".add(new JLabel(\"");
        String _name_6 = widget_1.getName();
        _builder.append(_name_6, "\t\t");
        _builder.append("\"));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        String _firstLower_6 = StringExtensions.toFirstLower(screen.getEntity().getName());
        _builder.append(_firstLower_6, "\t\t");
        _builder.append(".add(");
        String _firstLower_7 = StringExtensions.toFirstLower(widget_1.getName());
        _builder.append(_firstLower_7, "\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    fsa.generateFile(_plus, _builder);
  }
  
  public void generate(final Navigation navigation, final IFileSystemAccess2 fsa) {
    String _name = navigation.getSource().getName();
    String _plus = ("Navigation" + _name);
    String _plus_1 = (_plus + "To");
    String _name_1 = navigation.getTarget().getName();
    String _plus_2 = (_plus_1 + _name_1);
    String _plus_3 = (_plus_2 + ".java");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class Navigation");
    String _name_2 = navigation.getSource().getName();
    _builder.append(_name_2);
    _builder.append("To");
    String _name_3 = navigation.getTarget().getName();
    _builder.append(_name_3);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public void navigate() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    fsa.generateFile(_plus_3, _builder);
  }
  
  public String getJavaType(final DataType dataType) {
    if (dataType != null) {
      switch (dataType) {
        case STRING:
          return "JTextField";
        case BOOLEAN:
          return "JCheckBox";
        case INTEGER:
          return "JTextField";
        default:
          return "JComponent";
      }
    } else {
      return "JComponent";
    }
  }
}
