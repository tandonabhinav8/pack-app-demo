package com.basic.pack.app.demo.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Data

public class TennisRankingServiceResponse {

    private List<TennisRankingServiceResponseDetailsBean> data;
}





