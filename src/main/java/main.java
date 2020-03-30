import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        ArrayList<IManuscript> documents = new ArrayList<IManuscript>();
        FAQ faq = new FAQ("Nonsense questions", new ArrayList<String>(Arrays.asList("first question", "second question")), new DoubleCharacterFormatter());
        Book book = new Book("Another book", "whatever text fits as content because this is a small book", "me",
                new BackwardsTextFormatter());

        Paper paper = new Paper("second year", "this is my master degree paper", "Smartest Ever", new NormalFormatter());

        documents.add(faq);
        documents.add(book);
        documents.add(paper);

        for (IManuscript docs: documents) {

            docs.Print();
            System.out.println();
        }

        //TODO: print the manuscripts backward, so that you can read them in the mirror
    }
}
