/**
* Pieces Isomorphic OpenAPI
* Endpoints for Assets, Formats, Users, Asset, Format, User.
*
* The version of the OpenAPI document: 1.0
* Contact: tsavo@pieces.app
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models

import org.openapitools.client.models.EmbeddedModelSchema
import org.openapitools.client.models.Format

import com.squareup.moshi.Json

/**
 * A base class for a collection of formats and some additional meta properties.
 * @param iterable 
 * @param schema 
 */

data class Formats (
    @Json(name = "iterable")
    val iterable: kotlin.collections.List<Format>,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null
)

