package com.escuela.gce.rest.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@JsonPropertyOrder({ "record_count", "total_count" })
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaginationResponse {

	@JsonProperty("record_count")
	private long recordCount;

	@JsonProperty("total_count")
	private long totalCount;

    public long getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(long recordCount) {
        this.recordCount = recordCount;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public PaginationResponse() {
    }
        
        
}
