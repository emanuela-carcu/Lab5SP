public class AlignLeft implements AlignStrategy{

    @Override
    public void render(Paragraph p) {
        System.out.println("Left align: "+ p.getText());
    }
}
