package Assignment3.Question2;

public class WinFactory implements GUIFactory{
    @Override
    public AbstractTextField createTextField(){

        return new WindowsTextField();
    }

    @Override
    public AbstractPushButton createPushButton() {

        return new WindowsPushButton();
    }

    @Override
    public AbstractListBox createListBox() {

        return new WindowsListBox();
    }
}
