// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.ChangeDataCaptureResource;
import com.azure.resourcemanager.datafactory.models.ConnectionType;
import com.azure.resourcemanager.datafactory.models.FrequencyType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ChangeDataCapturesListByFactoryMockTests {
    @Test
    public void testListByFactory() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"properties\":{\"folder\":{\"name\":\"f\"},\"description\":\"nmzaih\",\"sourceConnectionsInfo\":[{\"sourceEntities\":[{},{}],\"connection\":{\"linkedService\":{\"referenceName\":\"euhhfoh\"},\"linkedServiceType\":\"vbwj\",\"type\":\"linkedservicetype\",\"isInlineDataset\":false,\"commonDslConnectorProperties\":[{},{},{}]}}],\"targetConnectionsInfo\":[{\"targetEntities\":[{},{}],\"connection\":{\"linkedService\":{\"referenceName\":\"corydjsaki\"},\"linkedServiceType\":\"lmiglnqrmqefdq\",\"type\":\"linkedservicetype\",\"isInlineDataset\":false,\"commonDslConnectorProperties\":[{},{}]},\"dataMapperMappings\":[{},{},{},{}],\"relationships\":[\"datapdiekylioagvij\"]},{\"targetEntities\":[{},{},{},{}],\"connection\":{\"linkedService\":{\"referenceName\":\"ejljdre\"},\"linkedServiceType\":\"jw\",\"type\":\"linkedservicetype\",\"isInlineDataset\":false,\"commonDslConnectorProperties\":[{},{}]},\"dataMapperMappings\":[{},{}],\"relationships\":[\"datazbddcxfuiz\"]}],\"policy\":{\"mode\":\"zme\",\"recurrence\":{\"frequency\":\"Second\",\"interval\":1878878407}},\"allowVNetOverride\":false,\"status\":\"qot\"},\"name\":\"bi\",\"type\":\"s\",\"etag\":\"vuptretlau\",\"\":{\"egcogyctekaaju\":\"datatstpbinab\",\"cbjsyorsojv\":\"datakxbgfed\"},\"id\":\"qragqcmouxs\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        DataFactoryManager manager = DataFactoryManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ChangeDataCaptureResource> response
            = manager.changeDataCaptures().listByFactory("da", "dneb", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("qragqcmouxs", response.iterator().next().id());
        Assertions.assertEquals("f", response.iterator().next().folder().name());
        Assertions.assertEquals("nmzaih", response.iterator().next().description());
        Assertions.assertEquals("euhhfoh",
            response.iterator().next().sourceConnectionsInfo().get(0).connection().linkedService().referenceName());
        Assertions.assertEquals("vbwj",
            response.iterator().next().sourceConnectionsInfo().get(0).connection().linkedServiceType());
        Assertions.assertEquals(ConnectionType.LINKEDSERVICETYPE,
            response.iterator().next().sourceConnectionsInfo().get(0).connection().type());
        Assertions.assertEquals(false,
            response.iterator().next().sourceConnectionsInfo().get(0).connection().isInlineDataset());
        Assertions.assertEquals("corydjsaki",
            response.iterator().next().targetConnectionsInfo().get(0).connection().linkedService().referenceName());
        Assertions.assertEquals("lmiglnqrmqefdq",
            response.iterator().next().targetConnectionsInfo().get(0).connection().linkedServiceType());
        Assertions.assertEquals(ConnectionType.LINKEDSERVICETYPE,
            response.iterator().next().targetConnectionsInfo().get(0).connection().type());
        Assertions.assertEquals(false,
            response.iterator().next().targetConnectionsInfo().get(0).connection().isInlineDataset());
        Assertions.assertEquals("zme", response.iterator().next().policy().mode());
        Assertions.assertEquals(FrequencyType.SECOND, response.iterator().next().policy().recurrence().frequency());
        Assertions.assertEquals(1878878407, response.iterator().next().policy().recurrence().interval());
        Assertions.assertEquals(false, response.iterator().next().allowVNetOverride());
        Assertions.assertEquals("qot", response.iterator().next().status());
    }
}
