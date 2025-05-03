package org.test;

public class Publisher implements PublisherInterface{

    private ArrayList<PublisherActionListener> listeners = new ArrayList<>();

    @Override
    public ArrayList<PublisherActionListener> getListener(){
        return listener;
    }

    @Override
    public void addListener(PublisherActionListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(PublisherActionListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeAllListeners() {
        listeners.clear();
    }

    @Override
    public void notifySubscriber(String message) {
        for(PublisherActionListener  actionListener : listeners)
        {
            actionListener.doAction(message);
        }
    }

    public void createNewMessage(String message)
    {
        System.out.println("Publisher printed message" + message);
        notifySubscribers(message);
    }
}
