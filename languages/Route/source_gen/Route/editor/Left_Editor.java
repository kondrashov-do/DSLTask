package Route.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;

public class Left_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_tu0zma_a(editorContext, node);
  }
  private EditorCell createCollection_tu0zma_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_tu0zma_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createComponent_tu0zma_a0(editorContext, node));
    return editorCell;
  }
  private EditorCell createComponent_tu0zma_a0(EditorContext editorContext, SNode node) {
    EditorCell editorCell = editorContext.getCellFactory().createEditorComponentCell(node, "Route.editor.CommandComp");
    return editorCell;
  }
}