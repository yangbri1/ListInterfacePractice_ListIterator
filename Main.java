public class Main {
    // stdard static 
    public static void main(String[] args) {
        // create a 'ListPractice' obj 'extraList' to call practiceList() method (this step necessary as practiceList() method was NOT static)
        ListPractice extraList = new ListPractice();
        // invoke practiceList() method from 'ListPractice' class using dot notation
        extraList.practiceList();
    }
}