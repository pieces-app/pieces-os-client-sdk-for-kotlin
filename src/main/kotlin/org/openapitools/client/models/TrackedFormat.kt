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

import org.piecesapp.client.models.Classification
import org.piecesapp.client.models.EmbeddedModelSchema
import org.piecesapp.client.models.Role

import com.squareup.moshi.Json

/**
 * A minimal format to send to Mixpanel
 * @param id The UUID of the format
 * @param classification 
 * @param role 
 * @param asset The UUID of the asset associated
 * @param fragment 
 * @param file 
 * @param schema 
 */

data class TrackedFormat (
    /* The UUID of the format */
    @Json(name = "id")
    val id: kotlin.String,
    @Json(name = "classification")
    val classification: Classification,
    @Json(name = "role")
    val role: Role,
    /* The UUID of the asset associated */
    @Json(name = "asset")
    val asset: kotlin.String,
    @Json(name = "fragment")
    val fragment: kotlin.Boolean,
    @Json(name = "file")
    val file: kotlin.Boolean,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null
)
