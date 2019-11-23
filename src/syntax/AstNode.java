package syntax;

import java_cup.runtime.ComplexSymbolFactory.Location;
import visitor.Visitable;

public abstract class AstNode implements Visitable {

  private final Location leftLocation;
  private final Location rightLocation;

  public AstNode(Location leftLocation, Location rightLocation) {
    this.leftLocation = leftLocation;
    this.rightLocation = rightLocation;
  }

  public Location getLeftLocation() {
    return leftLocation;
  }

  public Location getRightLocation() {
    return rightLocation;
  }
}
