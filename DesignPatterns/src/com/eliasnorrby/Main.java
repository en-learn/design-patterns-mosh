package com.eliasnorrby;

import com.eliasnorrby.memento.Editor;
import com.eliasnorrby.memento.History;

public class Main {

    public static void main(String[] args) {
      mementoDemo();
    }

    public static void mementoDemo() {
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

}

