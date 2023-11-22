package visitorExe;

import nodos.Asignacion;
import nodos.ConstanteInt;
import nodos.Division;
import nodos.Print;
import nodos.Producto;
import nodos.Programa;
import nodos.Read;
import nodos.Suma;
import nodos.Variable;

public interface VisitorExecuter {
	public Object visit(Programa p, Object param);
	public Object visit(Print p, Object param);
	public Object visit(Asignacion p, Object param);
	public Object visit(ConstanteInt p, Object param);
	public Object visit(Division p, Object param);
	public Object visit(Producto p, Object param);
	public Object visit(Read p, Object param);
	public Object visit(Suma p, Object param);
	public Object visit(Variable p, Object param);
}
