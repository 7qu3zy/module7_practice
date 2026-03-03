package ReportTemplate;

public abstract class ReportGenerator {

    public final void generate(){

        createHeader();
        createBody();
        createFooter();

        if(userWantsSave())
            save();
    }

    protected abstract void createHeader();
    protected abstract void createBody();
    protected abstract void createFooter();

    protected void save(){
        System.out.println("Отчет сохранен");
    }

    protected boolean userWantsSave(){
        return true;
    }
}