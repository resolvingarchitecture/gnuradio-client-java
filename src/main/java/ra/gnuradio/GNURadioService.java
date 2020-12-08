package ra.gnuradio;

import ra.common.Envelope;
import ra.common.messaging.MessageProducer;
import ra.common.network.*;
import ra.common.service.ServiceStatusObserver;
import ra.util.tasks.TaskRunner;

import java.util.Properties;
import java.util.logging.Logger;

/**
 * Wrapper for GNU Radio and other radio nets like Locha Mesh.
 * https://www.gnuradio.org
 * GNU Radio is licensed under the GPLv3 as of August 2019.
 *
 */
public final class GNURadioService extends NetworkService {

    private Logger LOG = Logger.getLogger(GNURadioService.class.getName());

    public GNURadioService() {
        super(Network.FSRadio);
    }

    public GNURadioService(MessageProducer producer, ServiceStatusObserver observer) {
        super(Network.FSRadio, producer, observer);
    }

    /**
     * Sends UTF-8 content to a Radio Peer using Software Defined Radio (SDR).
     * @param envelope Envelope containing data.
     *                 To DID must contain base64 encoded Radio destination key.
     * @return boolean was successful
     */
    @Override
    public Boolean sendOut(Envelope envelope) {
        LOG.info("Sending Radio Message...");

        return true;
    }

    /**
     * Will be called only if you register via addSessionListener().
     *
     * After this is called, the client should call receiveMessage(msgId).
     * There is currently no method for the client to reject the message.
     * If the client does not call receiveMessage() within a timeout period
     * (currently 30 seconds), the session will delete the message and
     * log an error.
     *
     * @param session session to notify
     */
    public void messageAvailable(SignalSession session) {
//        RadioDatagram d = session.receiveDatagram(port);
//        LOG.info("Received Radio Message:\n\tFrom: " + d.from.getSDRAddress());
//        Envelope e = Envelope.eventFactory(EventMessage.Type.TEXT);
//        DID did = new DID();
//        did.addPeer(d.from);
//        e.setDID(did);
//        EventMessage m = (EventMessage) e.getMessage();
//        m.setName(d.from.getSDRFingerprint());
//        m.setMessage(d);
//        DLC.addRoute(NotificationService.class, NotificationService.OPERATION_PUBLISH, e);
//        LOG.info("Sending Event Message to Notification Service...");
//        sendIn(e);
    }

    @Override
    public boolean start(Properties properties) {

//        taskRunnerThread = new Thread(taskRunner);
//        taskRunnerThread.setDaemon(true);
//        taskRunnerThread.setName("FullSpectrumRadioSensor-TaskRunnerThread");
//        taskRunnerThread.start();
        return true;
    }

    @Override
    public boolean pause() {
        return false;
    }

    @Override
    public boolean unpause() {
        return false;
    }

    @Override
    public boolean restart() {
        return false;
    }
}
