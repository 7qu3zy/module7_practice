package ChatMediator;

public class Main {

    public static void main(String[] args){

        IMediator mediator = new ChatMediatorImpl();

        User u1 = new User("Иван",mediator);
        User u2 = new User("Мария",mediator);

        mediator.addUser(u1,"general");
        mediator.addUser(u2,"general");

        u1.send("Привет всем","general");
    }
}