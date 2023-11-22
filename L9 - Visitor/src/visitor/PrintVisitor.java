package visitor;

import nodos.Asignacion;
import nodos.ConstanteInt;
import nodos.Division;
import nodos.Print;
import nodos.Producto;
import nodos.Programa;
import nodos.Read;
import nodos.Sentencia;
import nodos.Suma;
import nodos.Variable;

public class PrintVisitor implements Visitor {

	@Override
	public Object visit(Programa p, Object param) {
		for (Sentencia sent : p.sentencias)
			sent.accept(this, null);
		return null;

	}

	@Override
	public Object visit(Print p, Object param) {
		System.out.print("print ");
		p.expr.accept(this, null);
		System.out.println(";");
		return null;
	}

	@Override
	public Object visit(Asignacion a, Object param) {
		a.variable.accept(this, null);
		System.out.print(" = ");
		a.expr.accept(this, null);
		
		return null;
	}

	@Override
	public Object visit(ConstanteInt c, Object param) {
		System.out.print(" " + c.valor);
		
		return null;
	}

	@Override
	public Object visit(Division d, Object param) {
		d.left.accept(this, null);
		System.out.print(" / ");
		d.right.accept(this, null);
		return null;
	}

	@Override
	public Object visit(Producto p, Object param) {
		p.left.accept(this, null);
		System.out.print(" * ");
		p.right.accept(this, null);
		return null;
	}

	@Override
	public Object visit(Read r, Object param) {
		System.out.print("read ");
		r.var.accept(this, null);
		System.out.println(";");
		return null;
	}

	@Override
	public Object visit(Suma s, Object param) {
		s.left.accept(this, null);
		System.out.print(" + ");
		s.right.accept(this, null);
		return null;
	}

	@Override
	public Object visit(Variable var, Object param) {
		System.out.print(var.name);
		return null;
	}
}
