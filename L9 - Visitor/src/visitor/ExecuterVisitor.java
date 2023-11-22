package visitor;

import java.io.Console;
import java.util.HashMap;

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

public class ExecuterVisitor implements Visitor {
	HashMap<String, Integer> map = new HashMap<>();
	@Override
	public Object visit(Programa program, Object param) {
		for(Sentencia statement : program.sentencias)
			statement.accept(this, param);
		return null;
	}

	@Override
	public Object visit(Print p, Object param) {
		System.out.println(p.expr.accept(this, null));
		return null;
	}

	@Override
	public Object visit(Asignacion a, Object param) {
		String x = (String)a.variable.accept(this, "izq");
		int y = (int)a.expr.accept(this, param);
		map.put(x, y);
		System.out.println(x+" - "+y);
		return null;
	}

	@Override
	public Object visit(ConstanteInt c, Object param) {
		return Integer.parseInt(c.valor);
	}

	@Override
	public Object visit(Division d, Object param) {
//		int left = (int)d.left.accept(this, null);
//		int right = (int)d.right.accept(this, null);
//		int res = left / right;
//		return res;
		return (Integer) d.left.accept(this, null) / (Integer) d.right.accept(this, null);
	}

	@Override
	public Object visit(Producto p, Object param) {
//		int left = (int)p.left.accept(this, null);
//		
//		int right = (int)p.right.accept(this, null);
//		int res = left * right;
//		return res;
		return (Integer) p.left.accept(this, null) * (Integer) p.right.accept(this, null);
	}

	@Override
	public Object visit(Read r, Object param) {
		int valor;
		System.out.print("Introduzca el valor para la variable " + r.var.name + ": ");
		try {
			valor = System.in.read();
		} catch (Exception e) {
			valor = 0;
		}
		map.put(r.var.name, valor);
		return null;
	}

	@Override
	public Object visit(Suma s, Object param) {
		int left = (int)s.left.accept(this, null);
		int right = (int)s.right.accept(this, null);
		int res = left + right;
		return res;
	}

	@Override
	public Object visit(Variable var, Object param) {
		if (param == "izq") {
			return var.name;
		} else {
			Integer valor = map.get(var.name);
			if (valor == null)
				valor = 0;
			return valor;			
		}
	}
}
