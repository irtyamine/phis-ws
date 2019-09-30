//******************************************************************************
//                             CallsResourceServiceTest.java
// SILEX-PHIS
// Copyright © INRA 2018
// Creation date: 26 nov. 2018
// Contact: morgane.vidal@inra.fr, anne.tireau@inra.fr, pascal.neveu@inra.fr
//******************************************************************************
package opensilex.service.resources.brapi;
import javax.ws.rs.core.Response;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;
import test.opensilex.server.rest.RestApplicationTest;

/**
 * Tests for the BrAPI Call service
 */
public class CallsResourceServiceTest extends RestApplicationTest {

    /**
     * Test if the returned code is 200 when the call is correct
     */
    @Test
    public void testCodeReturn() {
        final Response callResult = target("/brapi/v1/calls")
                .queryParam("datatype", "json")
                .queryParam("page", 0)
                .queryParam("pageSize", 1)
                .request().get();

        assertEquals(200, callResult.getStatus());
    }
}
