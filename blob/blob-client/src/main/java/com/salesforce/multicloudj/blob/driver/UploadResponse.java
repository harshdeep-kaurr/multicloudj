package com.salesforce.multicloudj.blob.driver;

import lombok.Builder;
import lombok.Value;

/**
 * Wrapper object for upload result data
 */
@Builder
@Value
public class UploadResponse {
    String key;
    String versionId;
    String eTag;
    
    /**
     * Get the ETag with capital 'T' to maintain compatibility with AbstractBlobBenchmarkTest
     * @return the ETag value
     */
    public String getETag() {
        return eTag;
    }
}
