package com.kuliginstepan.dadata.client.domain.delivery;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Value;

/**
 * @see <a href="https://dadata.ru/api/delivery/">Delivery docs</a>
 */

@Value
public class Delivery {

    @JsonAlias("kladr_id")
    private String kladrId;
    @JsonAlias("fias_id")
    private String fiasId;
    @JsonAlias("boxberry_id")
    private String boxberryId;
    @JsonAlias("cdek_id")
    private String cdekId;
    @JsonAlias("dpd_id")
    private String dpdId;
}
