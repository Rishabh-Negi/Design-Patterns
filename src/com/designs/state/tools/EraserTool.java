package com.designs.state.tools;

public class EraserTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println( "EraserTool mouse up" );
    }

    @Override
    public void mouseDown() {
        System.out.println( "EraserTool mouse down" );
    }
}
