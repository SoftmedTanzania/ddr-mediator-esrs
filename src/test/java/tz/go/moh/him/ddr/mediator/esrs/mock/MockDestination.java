package tz.go.moh.him.ddr.mediator.esrs.mock;
import tz.go.moh.him.ddr.mediator.esrs.domain.TestRejections;
import tz.go.moh.him.mediator.core.serialization.JsonSerializer;
import org.junit.Assert;
import org.openhim.mediator.engine.messages.MediatorHTTPRequest;
import org.openhim.mediator.engine.testing.MockHTTPConnector;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Represents a mock destination.
 */
public class MockDestination extends MockHTTPConnector {
    /**
     * serializer initialization
     */
    public JsonSerializer serializer = new JsonSerializer();

    /**
     * The expected message type
     */
    private final String expectedMessageType;


    /**
     * Gets the response.
     *
     * @return Returns the response.
     */
    @Override
    public String getResponse() {
        return null;
    }

    /**
     * Gets the status code.
     *
     * @return Returns the status code.
     */
    @Override
    public Integer getStatus() {
        return 200;
    }

    /**
     * Gets the HTTP headers.
     *
     * @return Returns the HTTP headers.
     */
    @Override
    public Map<String, String> getHeaders() {
        return Collections.emptyMap();
    }


    public MockDestination(String expectedMessageType) {
        this.expectedMessageType = expectedMessageType;
    }
    /**
     * Handles the message.
     *
     * @param msg The message.
     */
    @Override
    public void executeOnReceive(MediatorHTTPRequest msg){
        System.out.println("Received body : " + msg.getBody());

        switch(expectedMessageType) {
            case "request":
                List<TestRejections> testRejections = Arrays.asList(serializer.deserialize(msg.getBody(), TestRejections[].class));
                Assert.assertNotNull(testRejections);
                Assert.assertEquals(1, testRejections.size());
                Assert.assertEquals("2022-09-22 10:38:36", testRejections.get(0).getDateTimeStamp());
                Assert.assertEquals("1.0", testRejections.get(0).getVersionStamp());
                Assert.assertEquals("2022-09-22 10:38:36", testRejections.get(0).getLimsDateTimeStamp());
                Assert.assertEquals("2", testRejections.get(0).getObrSetID());
                Assert.assertEquals("2022-01-28 10:30:00", testRejections.get(0).getSpecimenDateTime());
                Assert.assertEquals("2022-01-27 20:12:03", testRejections.get(0).getReceivedDateTime());
                Assert.assertEquals("2022-01-27 20:12:03", testRejections.get(0).getRegisteredDateTime());
                break;
            default:
                break;

        }
    }
}
