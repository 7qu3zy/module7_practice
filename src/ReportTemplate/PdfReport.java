package ReportTemplate;

public class PdfReport extends ReportGenerator {

    protected void createHeader(){
        System.out.println("PDF заголовок");
    }

    protected void createBody(){
        System.out.println("PDF данные");
    }

    protected void createFooter(){
        System.out.println("PDF подвал");
    }
}