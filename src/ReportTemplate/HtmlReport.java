package ReportTemplate;

public class HtmlReport extends ReportGenerator {

    protected void createHeader(){
        System.out.println("<h1>HTML заголовок</h1>");
    }

    protected void createBody(){
        System.out.println("<p>HTML контент</p>");
    }

    protected void createFooter(){
        System.out.println("<footer>HTML подвал</footer>");
    }
}