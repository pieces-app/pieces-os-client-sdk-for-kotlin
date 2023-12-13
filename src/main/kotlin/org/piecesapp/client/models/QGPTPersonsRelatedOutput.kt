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
import org.openapitools.client.models.Persons

import com.squareup.moshi.Json

/**
 * This model is used for the output of the /qgpt/related/persons endpoint.  Explanations here is a custom object with key value pairs, when the key is the personUUId and the value is an explanation as to why this person was reccommended.
 * @param persons 
 * @param schema 
 * @param explanations This is a Map<String, String> where the the key is a person id. and the value is the explanation.
 */

data class QGPTPersonsRelatedOutput (
    @Json(name = "persons")
    val persons: Persons,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    /* This is a Map<String, String> where the the key is a person id. and the value is the explanation. */
    @Json(name = "explanations")
    val explanations: kotlin.collections.Map<kotlin.String, kotlin.String>? = null
)

