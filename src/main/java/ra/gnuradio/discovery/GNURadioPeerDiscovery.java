package ra.gnuradio.discovery;


import ra.gnuradio.GNURadioService;
import ra.util.tasks.BaseTask;
import ra.util.tasks.TaskRunner;

import java.util.logging.Logger;

public class GNURadioPeerDiscovery extends BaseTask {

    private Logger LOG = Logger.getLogger(GNURadioPeerDiscovery.class.getName());

    private GNURadioService service;

    public GNURadioPeerDiscovery(TaskRunner taskRunner, GNURadioService service) {
        super(GNURadioPeerDiscovery.class.getSimpleName(), taskRunner);
        this.service = service;
    }

    @Override
    public Boolean execute() {
        return null;
    }
}
