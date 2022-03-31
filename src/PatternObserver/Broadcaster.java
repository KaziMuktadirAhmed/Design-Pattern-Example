package PatternObserver;

import java.util.ArrayList;

public class Broadcaster {
    private ArrayList<Watcher> watchers = new ArrayList<>();
    private int time_count = 0;

    public void updateTime_count (int time_count) {
        this.time_count += time_count;
    }

    public int getTime_count() {
        return this.time_count;
    }

    public void attach (Watcher watcher) {
        this.watchers.add(watcher);
    }

    private void updateAll () {
        for (Watcher watcher:watchers) {
            if(this.time_count%10 < watcher.identifier) {
                watcher.watch(this.time_count);
                break;
            }
        }
    }

    public void start_time() {
        for (int i=0; i<100; i++) {
            updateAll();
            updateTime_count(1);
        }
    }
}
