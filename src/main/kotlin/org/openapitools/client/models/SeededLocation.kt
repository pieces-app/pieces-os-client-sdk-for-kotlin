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
import org.piecesapp.client.models.LocationTypeEnum
import org.piecesapp.client.models.PlatformEnum

import com.squareup.moshi.Json

/**
 * 
 * @param type 
 * @param text 
 * @param schema 
 * @param watch 
 * @param asset You may associate a SeededLocation with an asset
 * @param platform 
 */

data class SeededLocation (
    @Json(name = "type")
    val type: LocationTypeEnum,
    @Json(name = "text")
    val text: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "watch")
    val watch: kotlin.Boolean? = null,
    /* You may associate a SeededLocation with an asset */
    @Json(name = "asset")
    val asset: kotlin.String? = null,
    @Json(name = "platform")
    val platform: PlatformEnum? = null
)
