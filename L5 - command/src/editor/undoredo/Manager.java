package editor.undoredo;

import java.awt.Desktop.Action;
import java.util.Stack;

import editor.core.Editor;

public class Manager {

	// actua de historial

	private Stack<Accion> redoList = new Stack<Accion>();
	private Stack<Accion> undoList = new Stack<Accion>();

	private Editor editor;

	public Manager(Editor editor) {
		this.editor = editor;
	}
	
	public void addUndo(Accion act) {
		undoList.push(act);
	}

	public void undo() {
		Accion action = undoList.pop(); //saca el ultimo de la lista
		action.undo(); // llamo a deshacer
		redoList.push(action); // mete en el top de la lista
	}

	public void redo() {
		Accion action = redoList.pop();
		action.redo();
		undoList.push(action);
	}

	public void clearR() {
		redoList.clear();
	}

	public void clearU() {
		undoList.clear();
	}
}
