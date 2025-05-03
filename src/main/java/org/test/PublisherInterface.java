package org.test;

import java.util.ArrayList;

public interface PublisherInterface {
    public ArrayList<PublisherActionListener> getListener();
    public void addListener(PublisherActionListener listener);
    public void removeListener(PublisherActionListener listener);
    public void removeAllListeners();
    public void notifySubscribers(String message);

}
