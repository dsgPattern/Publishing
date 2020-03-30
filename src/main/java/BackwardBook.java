public class BackwardBook extends  Book{

    public BackwardBook(String title, String text, String author) {
        super(title, text, author, new BackwardsTextFormatter());
    }
}
