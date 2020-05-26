package teach.homework.hw8.hw8_3;

public class Book {
    String nameOfBook;
    Page[] page = new Page[5];

    public void printPages(){
        for (int i = 0; i < page.length; i++) {
            if (page[i] != null){
                System.out.println(page[i].number + " " + page[i].text);
            }
        }
    }
    public void printTextPage(int index){
        if(page[index] != null){
            System.out.println(page[index].text);
        }
    }
    public void changePageText(int pageIndex, String newText){
        for (int i = 0; i < page.length; i++) {
            if (pageIndex == page[i].number){
                page[i].text = newText;
            }
        }
    }
    public void swapPages(int index1, int index2){
        Page page0 = page[index1];
        page[index1] = page[index2];
        page[index2] = page0;
    }
    public void swapPageText(int pageIndex1, int pageIndex2){
        String newText = page[pageIndex1].text;
        page[pageIndex1].text = page[pageIndex2].text;
        page[pageIndex2].text = newText;
    }
    public void removePage(int pageIndex){
        page[pageIndex] = null;
    }
}
