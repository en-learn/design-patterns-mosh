package com.eliasnorrby;

import com.eliasnorrby.iterator.BrowseHistory;
import com.eliasnorrby.iterator.Iterator;
import com.eliasnorrby.memento.Editor;
import com.eliasnorrby.memento.History;
import com.eliasnorrby.state.Canvas;
import com.eliasnorrby.state.EraserTool;
import com.eliasnorrby.state.SelectionTool;
import com.eliasnorrby.state.abuse.Stopwatch;

public class Main {

    public static void main(String[] args) {
      // mementoDemo();
      // stateDemo();
      // stateAbuseDemo();
      iteratorDemo();
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

    private static void stateAbuseDemo() {
      var stopwatch = new Stopwatch();
      stopwatch.click();
      stopwatch.click();
      stopwatch.click();
    }

    private static void iteratorDemo() {
      var history = new BrowseHistory();
      history.push("a");
      history.push("b");
      history.push("c");

      var iterator = history.createIterator();
      while (iterator.hasNext()) {
        String url = iterator.current();
        System.out.println("url = " + url);
        iterator.next();
      }
    }
}

