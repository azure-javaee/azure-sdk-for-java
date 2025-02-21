// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementUsage;
import com.azure.resourcemanager.recoveryservicesbackup.models.UsagesUnit;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class BackupUsageSummariesListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"unit\":\"CountPerSecond\",\"quotaPeriod\":\"eclcdigptajbrzm\",\"nextResetTime\":\"2021-01-02T14:42:29Z\",\"currentValue\":5595546031390029493,\"limit\":6681748780880268415,\"name\":{\"value\":\"xiutgjcyzyzj\",\"localizedValue\":\"r\"}}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        RecoveryServicesBackupManager manager =
            RecoveryServicesBackupManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<BackupManagementUsage> response =
            manager
                .backupUsageSummaries()
                .list("inzcpdltkrlgj", "tbdrvcqgue", "zhomp", "eqdurelyujlfyoum", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(UsagesUnit.COUNT_PER_SECOND, response.iterator().next().unit());
        Assertions.assertEquals("eclcdigptajbrzm", response.iterator().next().quotaPeriod());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-01-02T14:42:29Z"), response.iterator().next().nextResetTime());
        Assertions.assertEquals(5595546031390029493L, response.iterator().next().currentValue());
        Assertions.assertEquals(6681748780880268415L, response.iterator().next().limit());
        Assertions.assertEquals("xiutgjcyzyzj", response.iterator().next().name().value());
        Assertions.assertEquals("r", response.iterator().next().name().localizedValue());
    }
}
