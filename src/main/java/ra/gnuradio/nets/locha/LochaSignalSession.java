package ra.gnuradio.nets.locha;

import io.onemfive.network.sensors.fullspectrum.BaseSignalSession;

public class LochaSignalSession extends BaseSignalSession {

    public LochaSignalSession(BaseSensor sensor) {
        super(sensor);
    }

    @Override
    public boolean open(String address) {
        return false;
    }

    @Override
    public boolean connect() {
        return false;
    }

    @Override
    public boolean disconnect() {
        return false;
    }

    @Override
    public boolean isConnected() {
        return false;
    }

    @Override
    public boolean close() {
        return false;
    }

    @Override
    public Boolean send(NetworkPacket packet) {
        return null;
    }

    @Override
    public boolean send(NetworkRequestOp requestOp) {
        return false;
    }

    @Override
    public boolean notify(NetworkNotifyOp notifyOp) {
        return false;
    }
}