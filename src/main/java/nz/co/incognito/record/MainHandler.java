package nz.co.incognito.record;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class MainHandler implements RequestHandler {
    public static Logger LOG = LoggerFactory.getLogger(MainHandler.class);

    public Object handleRequest(Object input, Context context) {
        LOG.info(input.toString(), context.toString());
        LOG.info("test");
        return input.toString() + " see if lambda works";
    }
}
