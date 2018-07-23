package nz.co.incognito.record;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainHandler implements RequestHandler {
    public static Logger LOG = LoggerFactory.getLogger(MainHandler.class);

    @Override
    public Object handleRequest(Object input, Context context) {
        LOG.info(input.toString(), context.toString());
        return input.toString() + " see if lambda is updated.";
    }
}
