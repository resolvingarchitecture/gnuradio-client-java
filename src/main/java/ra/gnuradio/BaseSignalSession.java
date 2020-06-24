package ra.gnuradio;

import ra.common.network.BaseSession;

public abstract class BaseSignalSession extends BaseSession implements SignalSession {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getFullName() {
        return null;
    }

    @Override
    public Integer getPort() {
        return null;
    }

    @Override
    public String getGoverningBody() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public Integer getScore() {
        return null;
    }

    @Override
    public Boolean getActive() {
        return null;
    }

    @Override
    public Long getFloorFrequencyHz() {
        return null;
    }

    @Override
    public Long getCeilingFrequencyHz() {
        return null;
    }

    @Override
    public Long getCurrentFrequencyHz() {
        return null;
    }
}
