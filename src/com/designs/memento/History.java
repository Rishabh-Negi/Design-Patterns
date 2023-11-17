package com.designs.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
   private List<EditorState> states = new ArrayList<>();

   public void push( EditorState state ){
       states.add( state );
   }

   public EditorState pop(  ){
       int index = states.size() - 1;
       EditorState lastState = states.get( index );
       states.remove( lastState );

       return lastState;
   }
}
