package com.eliasnorrby.state;

public class Canvas {
  private ToolType currentTool;

  public void mouseDown() {
    switch (currentTool) {
      case SELECTION:
        System.out.println("Selection icon");
        break;
      case BRUSH:
        System.out.println("Brush icon");
        break;
      case ERASER:
        System.out.println("Eraser icon");
        break;
    }
  }

  public void mouseUp() {
    switch (currentTool) {
      case SELECTION:
        System.out.println("Draw dashed rectangle");
        break;
      case BRUSH:
        System.out.println("Draw a line");
        break;
      case ERASER:
        System.out.println("Erase something");
        break;
    }
  }

  public ToolType getCurrentTool() {
    return currentTool;
  }

  public void setCurrentTool(ToolType currentTool) {
    this.currentTool = currentTool;
  }

}
