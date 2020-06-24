package ra.gnuradio;

import ra.common.network.NetworkSession;

public interface SignalSession extends NetworkSession {
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
