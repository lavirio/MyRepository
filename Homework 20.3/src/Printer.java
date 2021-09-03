public class Printer {
    String totalDocumentName = "";
    String totalContainsText = "";
    int totalPages = 0;
    int totalDocumentsNumber = 0;

    public void append(String documentName) {
        append(documentName,"Текста нет", 1);
    }
    public void append(String documentName,String containsText) {
        append(documentName, containsText, 1);
    }
    public void append(String documentName, String containsText, int pages) {
            totalDocumentName =  totalDocumentName + documentName;
            totalContainsText = totalContainsText + containsText;
            totalPages++;
            totalDocumentsNumber++;

    }
    public  void print(String title){
        System.out.println(title);
        System.out.println("Загаловок: " + totalDocumentName + "\nТекст: " + totalContainsText + "\nКоличество страниц: " + totalPages + "\n");
    }

    public void getTotalPages () {
        int pages = totalPages;
        System.out.println("Общее количество страниц на печать: " + pages);
    }

    public void clear(){
        totalDocumentName = "";
        totalContainsText = "";
        totalPages = 0;
    }
}
