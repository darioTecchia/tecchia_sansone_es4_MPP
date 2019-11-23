package syntax.statement;

import java_cup.runtime.ComplexSymbolFactory.Location;
import syntax.expr.Id;
import visitor.Visitor;
import syntax.*;

public class AssignStatement extends Statement {

  private Id id;
  private Expr expr;

  public AssignStatement(Location leftLocation, Location rightLocation, Id id, Expr expr) {
    super(leftLocation, rightLocation);
    this.id = id;
    this.expr = expr;
  }

  /**
   * @return the expr
   */
  public Expr getExpr() {
    return expr;
  }

  /**
   * @return the id
   */
  public Id getId() {
    return id;
  }

  @Override
  public <T, P> T accept(Visitor<T, P> visitor, P arg) {
    return visitor.visit(this, arg);
  }

  
}