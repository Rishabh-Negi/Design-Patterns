package com.designs.state.tools;

public class BrushTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println( "BrushTool mouse up" );
    }

    @Override
    public void mouseDown() {
        System.out.println( "BrushTool mouse down" );
    }
}
