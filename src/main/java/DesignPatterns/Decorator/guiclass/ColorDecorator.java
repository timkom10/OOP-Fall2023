package DesignPatterns.Decorator.guiclass;

public class ColorDecorator extends Decorator {
    public ColorDecorator(GUIElement element) {
        super(element);
    }

    @Override
    public void render() {
        super.render();
        System.out.println("Rendering a colored element");

    }
}
