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
 * This is a pre-created accessor that simply takes an os id and an optional user(flattened)
 * @param os this is an os id.
 * @param share this is the share that the asset is apart of.
 * @param schema 
 * @param user 
 */

data class SeededAccessor (
    /* this is an os id. */
    @Json(name = "os")
    val os: kotlin.String,
    /* this is the share that the asset is apart of. */
    @Json(name = "share")
    val share: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "user")
    val user: FlattenedUserProfile? = null
)

