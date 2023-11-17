package com.designs;

import com.designs.memento.Editor;
import com.designs.memento.History;
import com.designs.state.Canvas;
import com.designs.state.ToolType;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas( ToolType.Brush );
        canvas.mouseUp();
        canvas.mouseDown();

        canvas = new Canvas( ToolType.Eraser );
        canvas.mouseUp();
        canvas.mouseDown();
    }
}
