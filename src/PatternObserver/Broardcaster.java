package PatternObserver;

import java.util.ArrayList;

public class Broardcaster {
    private ArrayList<Watcher> watchers;

    public void attach (Watcher watcher) {
        this.watchers.add(watcher);
    }
}
