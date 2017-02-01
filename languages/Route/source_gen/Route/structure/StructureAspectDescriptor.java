package Route.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import java.util.Map;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.concept.SConceptAdapterById;
import jetbrains.mps.smodel.adapter.structure.concept.SInterfaceConceptAdapterById;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;
import jetbrains.mps.smodel.SNodePointer;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  private final Map<SConceptId, Integer> myIndexMap = new HashMap<SConceptId, Integer>(7);
  /*package*/ final ConceptDescriptor myConceptBack = createDescriptorForBack();
  /*package*/ final ConceptDescriptor myConceptCanvas = createDescriptorForCanvas();
  /*package*/ final ConceptDescriptor myConceptCommand = createDescriptorForCommand();
  /*package*/ final ConceptDescriptor myConceptForward = createDescriptorForForward();
  /*package*/ final ConceptDescriptor myConceptLeft = createDescriptorForLeft();
  /*package*/ final ConceptDescriptor myConceptRectangle = createDescriptorForRectangle();
  /*package*/ final ConceptDescriptor myConceptShape = createDescriptorForShape();

  public StructureAspectDescriptor() {
    myIndexMap.put(myConceptBack.getId(), 0);
    myIndexMap.put(myConceptCanvas.getId(), 1);
    myIndexMap.put(myConceptCommand.getId(), 2);
    myIndexMap.put(myConceptForward.getId(), 3);
    myIndexMap.put(myConceptLeft.getId(), 4);
    myIndexMap.put(myConceptRectangle.getId(), 5);
    myIndexMap.put(myConceptShape.getId(), 6);
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptBack, myConceptCanvas, myConceptCommand, myConceptForward, myConceptLeft, myConceptRectangle, myConceptShape);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    Integer index = myIndexMap.get(id);
    if (index == null) {
      return null;
    }
    switch (((int) index)) {
      case 0:
        return myConceptBack;
      case 1:
        return myConceptCanvas;
      case 2:
        return myConceptCommand;
      case 3:
        return myConceptForward;
      case 4:
        return myConceptLeft;
      case 5:
        return myConceptRectangle;
      case 6:
        return myConceptShape;
      default:
        throw new IllegalStateException();
    }
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    Integer res = null;
    if (c instanceof SConceptAdapterById) {
      res = myIndexMap.get(((SConceptAdapterById) c).getId());
    } else if (c instanceof SInterfaceConceptAdapterById) {
      res = myIndexMap.get(((SInterfaceConceptAdapterById) c).getId());
    }
    return (res == null ? -1 : res);
  }

  private static ConceptDescriptor createDescriptorForBack() {
    return new ConceptDescriptorBuilder("Route.structure.Back", MetaIdFactory.conceptId(0xa5a3f5242a154733L, 0xb0f02be616993f8dL, 0x1dd373fc5107614aL)).super_("Route.structure.Command").version(1).super_(MetaIdFactory.conceptId(0xa5a3f5242a154733L, 0xb0f02be616993f8dL, 0x19ddfc99899482afL)).parents("Route.structure.Command").parentIds(MetaIdFactory.conceptId(0xa5a3f5242a154733L, 0xb0f02be616993f8dL, 0x19ddfc99899482afL)).alias("turn backward", "").sourceNode(new SNodePointer("r:64d579f7-caba-44a4-bb25-9e317a59d220(Route.structure)", "2149188974714249546")).create();
  }
  private static ConceptDescriptor createDescriptorForCanvas() {
    return new ConceptDescriptorBuilder("Route.structure.Canvas", MetaIdFactory.conceptId(0xa5a3f5242a154733L, 0xb0f02be616993f8dL, 0x3d515f5bd038dcf8L)).super_("jetbrains.mps.lang.core.structure.BaseConcept").version(1).super_(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.execution.util.structure.IMainClass").parentIds(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL), MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L), MetaIdFactory.conceptId(0x4caf0310491e41f5L, 0x8a9b2006b3a94898L, 0x40c1a7cb987d20d5L)).childDescriptors(new ConceptDescriptorBuilder.Link(0x3d515f5bd038dd62L, "shapes", MetaIdFactory.conceptId(0xa5a3f5242a154733L, 0xb0f02be616993f8dL, 0x3d515f5bd038ddabL), true, true, false, new SNodePointer("r:64d579f7-caba-44a4-bb25-9e317a59d220(Route.structure)", "4418417557367217506")), new ConceptDescriptorBuilder.Link(0x19ddfc9989a24c69L, "commands", MetaIdFactory.conceptId(0xa5a3f5242a154733L, 0xb0f02be616993f8dL, 0x19ddfc99899482afL), true, true, false, new SNodePointer("r:64d579f7-caba-44a4-bb25-9e317a59d220(Route.structure)", "1863923557170564201"))).children(new String[]{"shapes", "commands"}, new boolean[]{true, true}).rootable().alias("canvas", "").sourceNode(new SNodePointer("r:64d579f7-caba-44a4-bb25-9e317a59d220(Route.structure)", "4418417557367217400")).create();
  }
  private static ConceptDescriptor createDescriptorForCommand() {
    return new ConceptDescriptorBuilder("Route.structure.Command", MetaIdFactory.conceptId(0xa5a3f5242a154733L, 0xb0f02be616993f8dL, 0x19ddfc99899482afL)).super_("jetbrains.mps.lang.core.structure.BaseConcept").version(1).super_(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).parents("jetbrains.mps.lang.core.structure.BaseConcept").parentIds(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).propertyDescriptors(new ConceptDescriptorBuilder.Prop(0x19ddfc9989948473L, "length", new SNodePointer("r:64d579f7-caba-44a4-bb25-9e317a59d220(Route.structure)", "1863923557169661043"))).properties("length").abstract_().sourceNode(new SNodePointer("r:64d579f7-caba-44a4-bb25-9e317a59d220(Route.structure)", "1863923557169660591")).create();
  }
  private static ConceptDescriptor createDescriptorForForward() {
    return new ConceptDescriptorBuilder("Route.structure.Forward", MetaIdFactory.conceptId(0xa5a3f5242a154733L, 0xb0f02be616993f8dL, 0x19ddfc99898cb901L)).super_("Route.structure.Command").version(1).super_(MetaIdFactory.conceptId(0xa5a3f5242a154733L, 0xb0f02be616993f8dL, 0x19ddfc99899482afL)).parents("Route.structure.Command").parentIds(MetaIdFactory.conceptId(0xa5a3f5242a154733L, 0xb0f02be616993f8dL, 0x19ddfc99899482afL)).alias("forward", "").sourceNode(new SNodePointer("r:64d579f7-caba-44a4-bb25-9e317a59d220(Route.structure)", "1863923557169150209")).create();
  }
  private static ConceptDescriptor createDescriptorForLeft() {
    return new ConceptDescriptorBuilder("Route.structure.Left", MetaIdFactory.conceptId(0xa5a3f5242a154733L, 0xb0f02be616993f8dL, 0x1dd373fc50ef8d9eL)).super_("Route.structure.Command").version(1).super_(MetaIdFactory.conceptId(0xa5a3f5242a154733L, 0xb0f02be616993f8dL, 0x19ddfc99899482afL)).parents("Route.structure.Command").parentIds(MetaIdFactory.conceptId(0xa5a3f5242a154733L, 0xb0f02be616993f8dL, 0x19ddfc99899482afL)).alias("turn left", "").sourceNode(new SNodePointer("r:64d579f7-caba-44a4-bb25-9e317a59d220(Route.structure)", "2149188974712688030")).create();
  }
  private static ConceptDescriptor createDescriptorForRectangle() {
    return new ConceptDescriptorBuilder("Route.structure.Rectangle", MetaIdFactory.conceptId(0xa5a3f5242a154733L, 0xb0f02be616993f8dL, 0x3d515f5bd038ddcfL)).super_("Route.structure.Shape").version(1).super_(MetaIdFactory.conceptId(0xa5a3f5242a154733L, 0xb0f02be616993f8dL, 0x3d515f5bd038ddabL)).parents("Route.structure.Shape").parentIds(MetaIdFactory.conceptId(0xa5a3f5242a154733L, 0xb0f02be616993f8dL, 0x3d515f5bd038ddabL)).propertyDescriptors(new ConceptDescriptorBuilder.Prop(0x3d515f5bd038de21L, "length", new SNodePointer("r:64d579f7-caba-44a4-bb25-9e317a59d220(Route.structure)", "4418417557367217697")), new ConceptDescriptorBuilder.Prop(0x3d515f5bd038de24L, "width", new SNodePointer("r:64d579f7-caba-44a4-bb25-9e317a59d220(Route.structure)", "4418417557367217700"))).properties("length", "width").alias("boundary", "").sourceNode(new SNodePointer("r:64d579f7-caba-44a4-bb25-9e317a59d220(Route.structure)", "4418417557367217615")).create();
  }
  private static ConceptDescriptor createDescriptorForShape() {
    return new ConceptDescriptorBuilder("Route.structure.Shape", MetaIdFactory.conceptId(0xa5a3f5242a154733L, 0xb0f02be616993f8dL, 0x3d515f5bd038ddabL)).super_("jetbrains.mps.lang.core.structure.BaseConcept").version(1).super_(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).parents("jetbrains.mps.lang.core.structure.BaseConcept").parentIds(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).propertyDescriptors(new ConceptDescriptorBuilder.Prop(0x3d515f5bd038ddcaL, "xPos", new SNodePointer("r:64d579f7-caba-44a4-bb25-9e317a59d220(Route.structure)", "4418417557367217610")), new ConceptDescriptorBuilder.Prop(0x3d515f5bd038ddc7L, "yPos", new SNodePointer("r:64d579f7-caba-44a4-bb25-9e317a59d220(Route.structure)", "4418417557367217607"))).properties("xPos", "yPos").abstract_().sourceNode(new SNodePointer("r:64d579f7-caba-44a4-bb25-9e317a59d220(Route.structure)", "4418417557367217579")).create();
  }
}
