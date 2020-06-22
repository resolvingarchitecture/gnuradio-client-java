package ra.gnuradio;

public interface SignalSession extends ProtocolSession {
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
