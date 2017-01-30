package Route.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditorComponent;
import java.util.Map;
import java.util.HashMap;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    {
      SAbstractConcept cncpt = ((SAbstractConcept) concept);
      Integer preIndex = indices_xbvbvu_a0a.get(cncpt);
      int switchIndex = (preIndex == null ? -1 : preIndex);
      switch (switchIndex) {
        case 0:
          if (true) {
            return Collections.<ConceptEditor>singletonList(new Canvas_Editor());
          }
          break;
        case 1:
          if (true) {
            return Collections.<ConceptEditor>singletonList(new Rectangle_Editor());
          }
          break;
        default:
      }
    }
    return Collections.<ConceptEditor>emptyList();
  }

  @NotNull
  public Collection<ConceptEditorComponent> getDeclaredEditorComponents(SAbstractConcept concept, String editorComponentId) {
    {
      SAbstractConcept cncpt = ((SAbstractConcept) concept);
      Integer preIndex = indices_xbvbvu_a0c.get(cncpt);
      int switchIndex = (preIndex == null ? -1 : preIndex);
      switch (switchIndex) {
        case 0:
          if (true) {
            if ("Route.editor.ShapeComp".equals(editorComponentId)) {
              return Collections.<ConceptEditorComponent>singletonList(new ShapeComp());
            }
          }
          break;
        default:
      }
    }
    return Collections.<ConceptEditorComponent>emptyList();
  }


  private static Map<SAbstractConcept, Integer> buildConceptIndices(SAbstractConcept... concepts) {
    HashMap<SAbstractConcept, Integer> res = new HashMap<SAbstractConcept, Integer>();
    int counter = 0;
    for (SAbstractConcept c : concepts) {
      res.put(c, counter++);
    }
    return res;
  }
  private static final Map<SAbstractConcept, Integer> indices_xbvbvu_a0a = buildConceptIndices(MetaAdapterFactory.getConcept(0xa5a3f5242a154733L, 0xb0f02be616993f8dL, 0x3d515f5bd038dcf8L, "Route.structure.Canvas"), MetaAdapterFactory.getConcept(0xa5a3f5242a154733L, 0xb0f02be616993f8dL, 0x3d515f5bd038ddcfL, "Route.structure.Rectangle"));
  private static final Map<SAbstractConcept, Integer> indices_xbvbvu_a0c = buildConceptIndices(MetaAdapterFactory.getConcept(0xa5a3f5242a154733L, 0xb0f02be616993f8dL, 0x3d515f5bd038ddabL, "Route.structure.Shape"));
}
