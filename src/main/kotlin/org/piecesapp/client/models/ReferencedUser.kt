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
import org.openapitools.client.models.FlattenedUserProfile

import com.squareup.moshi.Json

/**
 * A object to reference a user's ID and optionally a FlattenedUserProfile Instance 
 * @param id 
 * @param schema 
 * @param reference 
 */

data class ReferencedUser (
    @Json(name = "id")
    val id: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "reference")
    val reference: FlattenedUserProfile? = null
)

