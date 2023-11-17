package com.designs;

import com.designs.memento.Editor;
import com.designs.memento.History;
import com.designs.state.Canvas;
import com.designs.state.ToolType;
import com.designs.state.tools.BrushTool;
import com.designs.state.tools.EraserTool;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setCurrentTool( new BrushTool() );
        canvas.mouseUp();
        canvas.mouseDown();

        canvas.setCurrentTool( new EraserTool() );
        canvas.mouseUp();
        canvas.mouseDown();
    }
}
