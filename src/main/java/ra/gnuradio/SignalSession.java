package ra.gnuradio;

import ra.common.network.NetworkClientSession;

public interface SignalSession extends NetworkClientSession {
    String getName();
    String getFullName();
    Integer getPort();
    String getGoverningBody();
    String getDescription();
    Integer getScore();
    Boolean getActive();
    Long getFloorFrequencyHz();
    Long getCeilingFrequencyHz();
    Long getCurrentFrequencyHz();
}
