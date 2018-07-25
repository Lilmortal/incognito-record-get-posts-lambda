package nz.co.incognito.record;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class MainHandler implements RequestStreamHandler {
    public static Logger LOG = LoggerFactory.getLogger(MainHandler.class);


    @Override
    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while((line = reader.readLine()) != "") {
            LOG.info(line);
        }

        LOG.info("Test that it works");
        LOG.warn("AAAA");
        OutputStreamWriter writer = new OutputStreamWriter(outputStream, "UTF-8");
        outputStream.write("Test".getBytes());
        outputStream.close();
    }
}
