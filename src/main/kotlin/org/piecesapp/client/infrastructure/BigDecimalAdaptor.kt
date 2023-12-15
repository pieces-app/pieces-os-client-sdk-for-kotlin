package org.openapitools.client.infrastructure

import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson
import java.math.BigDecimal

class BigDecimalAdaptor {
    @FromJson fun fromJson(string: String) = BigDecimal(string)

    @ToJson fun toJson(value: BigDecimal) = value.toString()
}
