package ra.gnuradio.nets;

import ra.gnuradio.SignalSession;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseNet implements Net {

    private List<SignalSession> supportedSignals = new ArrayList<>();

    @Override
    public List<SignalSession> supportedSignals() {
        return supportedSignals;
    }
}
