package com.basic.pack.app.demo.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data

public class TennisRankingServiceResponseDetailsBean {

    @JsonProperty("Name")
    private String name;
}