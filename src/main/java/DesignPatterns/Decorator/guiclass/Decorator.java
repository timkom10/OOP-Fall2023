package DesignPatterns.Decorator.guiclass;

public class Decorator implements GUIElement {

    public GUIElement element;

    public Decorator(GUIElement element) {
        this.element = element;
    }
    @Override
    public void render() {
        this.element.render();
    }
}
