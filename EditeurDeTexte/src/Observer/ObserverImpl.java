package Observer;

import Invoker.IHM;
import Receiver.Buffer;

/**
 * Created by Alex on 28/11/2014.
 */
public class ObserverImpl implements Observer {

    protected Subject subject;

    public ObserverImpl(Subject sub) {
        subject = sub;
    }

    @Override
    public void notifyMe() {
        Buffer buffer = (Buffer) subject;

    }
}
