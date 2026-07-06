public class TestFactory {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordFactory();
        DocumentFactory pdfFactory = new PdfFactory();
        DocumentFactory excelFactory = new ExcelFactory();

        System.out.println("=== Word Document ===");
        wordFactory.processDocument();

        System.out.println("\n=== PDF Document ===");
        pdfFactory.processDocument();

        System.out.println("\n=== Excel Document ===");
        excelFactory.processDocument();
    }
}