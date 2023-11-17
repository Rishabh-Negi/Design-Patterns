package com.designs.state;

import com.designs.state.tools.Tool;

import static java.lang.System.out;

public class Canvas {
//    private final ToolType currentTool;
//
//    public Canvas( ToolType toolType ){
//        this.currentTool = toolType;
//    }
//
//    public void mouseUp(){
//        switch (currentTool) {
//            case Selection -> {
//                out.println("Selection Tool mouse up");
//            }
//            case Brush -> {
//                out.println("Brush Tool mouse up");
//            }
//            case Eraser -> {
//                out.println("Eraser Tool mouse up");
//            }
//        }
//    }
//    public void mouseDown(){
//        switch (currentTool) {
//            case Selection -> {
//                out.println("Selection Tool mouse down");
//            }
//            case Brush -> {
//                out.println("Brush Tool mouse down");
//            }
//            case Eraser -> {
//                out.println("Eraser Tool mouse down");
//            }
//        }
//    }
    private Tool currentTool;

    public void mouseUp(){
        currentTool.mouseUp();
    }

    public void mouseDown(){
        currentTool.mouseDown();
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
