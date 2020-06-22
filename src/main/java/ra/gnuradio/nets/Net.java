package ra.gnuradio.nets;

import ra.gnuradio.SignalSession;

import java.util.List;

public interface Net {
    List<SignalSession> supportedSignals();
}
