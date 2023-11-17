package com.designs;

import com.designs.memento.Editor;
import com.designs.memento.History;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push( editor.createState() );
        editor.setContent("b");
        history.push( editor.createState() );
        editor.setContent("c");

        editor.restorState( history.pop() );
        editor.restorState( history.pop() );

        System.out.println(editor.getContent());
    }
}
