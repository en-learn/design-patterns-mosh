package com.eliasnorrby;

import com.eliasnorrby.memento.Editor;
import com.eliasnorrby.memento.History;
import com.eliasnorrby.state.Canvas;
import com.eliasnorrby.state.EraserTool;
import com.eliasnorrby.state.SelectionTool;

public class Main {

    public static void main(String[] args) {
      // mementoDemo();
      stateDemo();
    }

    private static void mementoDemo() {
      var editor = new Editor();
      var history = new History();

      editor.setContent("a");
      history.push(editor.createState());

      editor.setContent("b");
      history.push(editor.createState());

      editor.setContent("c");
      editor.restore(history.pop());
      editor.restore(history.pop());

      System.out.println("editor = " + editor.getContent());
    }

    private static void stateDemo() {
      var canvas = new Canvas();
      canvas.setCurrentTool(new SelectionTool());
      canvas.mouseDown();
      canvas.mouseUp();
      canvas.setCurrentTool(new EraserTool());
      canvas.mouseDown();
      canvas.mouseUp();
    }

}

