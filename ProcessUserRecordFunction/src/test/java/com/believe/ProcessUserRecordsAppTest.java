package com.believe;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ProcessUserRecordsAppTest {
    private static final String MY_DETAIL_TYPE = "myDetailType";
/*
    @Test
    public void successfulResponse() throws IOException {
        AWSEvent<EC2InstanceStateChangeNotification> event =
                new AWSEvent<EC2InstanceStateChangeNotification>()
                .detail(new EC2InstanceStateChangeNotification())
                        .detailType(MY_DETAIL_TYPE);

        ByteArrayOutputStream handlerOutput = new ByteArrayOutputStream();

        ProcessUserRecordsApp app = new ProcessUserRecordsApp();
        app.handleRequest(toInputStream(event), handlerOutput, null);

        AWSEvent<EC2InstanceStateChangeNotification> responseEvent = fromOutputStream(handlerOutput);
        assertNotNull(responseEvent);
        assertEquals(String.format(ProcessUserRecordsApp.NEW_DETAIL_TYPE, MY_DETAIL_TYPE), responseEvent.getDetailType());
    }

   /* private InputStream toInputStream(AWSEvent<EC2InstanceStateChangeNotification> event) throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        Marshaller.marshal(output, event);

        return new ByteArrayInputStream(output.toByteArray());
    }

    private AWSEvent<EC2InstanceStateChangeNotification> fromOutputStream(ByteArrayOutputStream outputStream) throws IOException {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());

        return Marshaller.unmarshalEvent(inputStream, EC2InstanceStateChangeNotification.class);
    }*/
}

