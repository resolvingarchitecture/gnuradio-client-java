package ra.gnuradio.nets.locha;

import ra.common.network.NetworkPacket;
import ra.gnuradio.BaseSignalSession;

public class LochaSignalSession extends BaseSignalSession {

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

}
