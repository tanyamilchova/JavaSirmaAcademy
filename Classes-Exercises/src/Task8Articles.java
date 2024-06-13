public class Task8Articles {
    //Create an article class with the following properties:
    // Title – a string
    // Content – a string
    // Author – a string
    //The class should have a constructor and the following methods:
    // Edit (new content) – change the old content with the new one
    // ChangeAuthor (new author) – change the author
    // Rename (new title) – change the title of the article
    // override ToString – print the article in the following format:
    //&quot;{title} - {content}: {author}&quot;
    //Write a program that reads an article in the following format &quot;{title}, {content},
    //{author}&quot;. On the next line, you will get the number n. On the next n lines, you will get one
    //of the following commands:
    // &quot;Edit: {new content}&quot;
    // &quot;ChangeAuthor: {new author}&quot;
    // &quot;Rename: {new title}&quot;.
    //Examples
    //Input Output
    //some title, some content, some author
    //3
    //Edit: best content
    //ChangeAuthor: best author
    //Rename: best title
    //
    //best title - best content: best author
    private String title;
    private String content;
    private  String author;

    public Task8Articles(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
    public Task8Articles() {
    }
    public void rename(String title){
        this.title=title;
        System.out.println(title);
    }
    public void edit(String content){
        this.content=content;
        System.out.println(content);
    }
    public void changeAuthor(String author){
        this.title=title;
        System.out.println(author);
    }

    @Override
    public String toString() {
        return "Task8Articles{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                '}';
    }


    public static void main(String[] args) {
        Task8Articles article1=new Task8Articles();
        String input="some title, some content, some author\n" +
                "3\n" +
                "Edit: best content\n" +
                "ChangeAuthor: best author\n" +
                "Rename: best title";
        String []rowInput=input.split("\n");
        int lines=0;
        if(rowInput.length>0) {
            String obj=rowInput[0].trim();
            String[]objArr=obj.split(",");
            article1.title=objArr[0].trim();
            article1.content=objArr[1].trim();
            article1.author=objArr[2].trim();
            System.out.println(article1);


           lines  = Integer.parseInt(rowInput[1].trim());
        }
        for (int i = 2; i < lines+2; i++) {
            String row=rowInput[i];
            String[]rowQuiery=row.split(":");
            String query=rowQuiery[0].trim();
            String queryText=rowQuiery[1].trim();
            switch (query){
                case "Rename"->article1.rename(queryText);
                case "Edit"->article1.edit(queryText);
                case "ChangeAuthor"->article1.changeAuthor(queryText);
            }
        }
    }
}
