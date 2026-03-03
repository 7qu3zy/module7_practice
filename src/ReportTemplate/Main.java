package ReportTemplate;

public class Main {

    public static void main(String[] args){

        ReportGenerator pdf = new PdfReport();
        pdf.generate();

        System.out.println();

        ReportGenerator html = new HtmlReport();
        html.generate();
    }
}