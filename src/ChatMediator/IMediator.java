package ChatMediator;

public interface IMediator {
    void send(String message, User user, String channel);
    void addUser(User user, String channel);
}