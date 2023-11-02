package Assignment3.Question2;

public class MacFactory implements GUIFactory{
    @Override
    public AbstractTextField createTextField() {

        return new MacTextField();
    }

    @Override
    public AbstractPushButton createPushButton() {

        return new MacPushButton();
    }

    @Override
    public AbstractListBox createListBox() {

        return new MacListBox();
    }
}
