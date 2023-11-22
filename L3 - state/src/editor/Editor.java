package editor;

import java.awt.Point;

import editor.herramientas.SelectionTool;

public class Editor {
	private Drawing drawing;
	private Tool selectedTool;
	private Tool defaultTool;

	public Editor(Drawing drawing) {
		setDrawing(drawing);
		defaultTool = new SelectionTool(this);
		selectedTool = defaultTool;
	}

	public Drawing getDrawing() {
		return drawing;
	}

	public void setDrawing(Drawing drawing) {
		this.drawing = drawing;
	}

	public void drawDocument() {
		drawing.draw();
	}

	public Tool getHerramientaSeleccionada() {
		return selectedTool;
	}

	public void setHerramientaSeleccionada(Tool herramienta) {
		this.selectedTool = herramienta;
	}

	public void pinchar(Point x) {
		selectedTool.pinchar(x);
	}

	public void mover(Point x) {
		selectedTool.mover(x);
	}

	public void soltar() {
		selectedTool.soltar();
		selectedTool = defaultTool;
	}
}
