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
package org.piecesapp.client.models

import org.piecesapp.client.models.EmbeddedModelSchema

import com.squareup.moshi.Json

/**
 * Model for collecting descriptive statistics of images uploaded to Pieces
 * @param width 
 * @param height 
 * @param channels 
 * @param asset 
 * @param created 
 * @param os 
 * @param schema 
 * @param user 
 */

data class GraphicalImageDescriptiveStatistics (
    @Json(name = "width")
    val width: kotlin.String,
    @Json(name = "height")
    val height: kotlin.String,
    @Json(name = "channels")
    val channels: kotlin.String,
    @Json(name = "asset")
    val asset: kotlin.String,
    @Json(name = "created")
    val created: kotlin.String,
    @Json(name = "os")
    val os: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "user")
    val user: kotlin.String? = null
)
