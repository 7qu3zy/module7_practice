package ChatMediator;

import java.util.*;

public class ChatMediatorImpl implements IMediator {

    private Map<String, List<User>> channels = new HashMap<>();

    public void addUser(User user, String channel){

        channels.computeIfAbsent(channel,k->new ArrayList<>()).add(user);
        System.out.println(user.getName() + " подключился к " + channel);
    }

    public void send(String message, User sender, String channel){

        if(!channels.containsKey(channel)){
            System.out.println("Канал не существует");
            return;
        }

        for(User u : channels.get(channel)){
            if(u != sender)
                u.receive(message);
        }
    }
}