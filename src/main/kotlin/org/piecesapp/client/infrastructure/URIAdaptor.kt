package org.openapitools.client.infrastructure

import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson
import java.net.URI

class URIAdaptor {
    @FromJson fun fromJson(string: String) = URI(string)

    @ToJson fun toJson(value: URI) = value.toString()
}
