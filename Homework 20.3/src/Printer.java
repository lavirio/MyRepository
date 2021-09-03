public class Printer {
    int pagesCount = 0;
    int documentCount = 0;
    int totalPagesCount = 0;
    int totalDocumentCount = 0;
    String queue = "";

    public void append(String documentName) {
        append(documentName,"Текста нет", 1);
    }
    public void append(String documentName,String containsText) {
        append(documentName, containsText, 1);
    }
    public void append(String documentName, String containsText, int pages) {
            queue = queue + "\nИмя документа: " + documentName + "\nТекст документа: " + containsText + "\nКоличество страниц: " + pages;
            pagesCount = pagesCount + pages;
            documentCount++;
            totalDocumentCount++;
            totalPagesCount = totalPagesCount + pages;
    }
    public  void print(String title){
        System.out.print(title);
        System.out.println(queue);
        clear();
    }

    public void getPagesCount () {
        System.out.println("Общее количество страниц на печать: " + pagesCount);
    }

    public void getDocumentCount () {
        System.out.println("Общее количество документов на печать: " + documentCount);
    }

    public void printerCheck(){
        System.out.println(totalDocumentCount);
        System.out.println(totalPagesCount);
    }
    public void clear(){
        queue = "";
        pagesCount = 0;
        documentCount = 0;
    }
}
