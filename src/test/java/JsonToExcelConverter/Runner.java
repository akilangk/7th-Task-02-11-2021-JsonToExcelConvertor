package JsonToExcelConverter;

public class Runner {
    public static void main(String[] args) {
        JsonToExcel run = new Implementor();
        run.readTheJsonFile();
        run.generateTheExcelFile();
    }
}
