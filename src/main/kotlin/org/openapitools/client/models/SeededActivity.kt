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

import org.piecesapp.client.models.Application
import org.piecesapp.client.models.MechanismEnum
import org.piecesapp.client.models.ReferencedAsset
import org.piecesapp.client.models.ReferencedConversation
import org.piecesapp.client.models.ReferencedFormat
import org.piecesapp.client.models.ReferencedUser
import org.piecesapp.client.models.SeededConnectorTracking

import com.squareup.moshi.Json

/**
 * This is the preseed to a full blown Activity.  This is the minimum information needed to create an Activity, used within our [POST] /activities/create  if mechenism is not passed in we will default to AUTOMATIC  NOT required to pass in an asset/user/format.
 * @param event 
 * @param application 
 * @param asset 
 * @param user 
 * @param format 
 * @param mechanism 
 * @param conversation 
 */

data class SeededActivity (
    @Json(name = "event")
    val event: SeededConnectorTracking,
    @Json(name = "application")
    val application: Application,
    @Json(name = "asset")
    val asset: ReferencedAsset? = null,
    @Json(name = "user")
    val user: ReferencedUser? = null,
    @Json(name = "format")
    val format: ReferencedFormat? = null,
    @Json(name = "mechanism")
    val mechanism: MechanismEnum? = null,
    @Json(name = "conversation")
    val conversation: ReferencedConversation? = null
)
