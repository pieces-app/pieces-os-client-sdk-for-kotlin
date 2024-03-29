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
import org.piecesapp.client.models.SeededTrackedAdoptionEvent
import org.piecesapp.client.models.SeededTrackedAssetEvent
import org.piecesapp.client.models.SeededTrackedAssetsEvent
import org.piecesapp.client.models.SeededTrackedConversationEvent
import org.piecesapp.client.models.SeededTrackedFormatEvent
import org.piecesapp.client.models.SeededTrackedInteractionEvent
import org.piecesapp.client.models.SeededTrackedKeyboardEvent
import org.piecesapp.client.models.SeededTrackedMachineLearningEvent
import org.piecesapp.client.models.SeededTrackedSessionEvent

import com.squareup.moshi.Json

/**
 * This model is designed to be light weight and low friction while most of the heavy lifting will be happening inside of the context servers.  This Model is important because this has references to our materials, instead of fully referenced materials.(very similar to our SeededTrackedEvent, consider consolidating and converting these to Referenced models instead of ID's)
 * @param schema 
 * @param format 
 * @param asset 
 * @param interaction 
 * @param keyboard 
 * @param session 
 * @param assets 
 * @param ml 
 * @param adoption 
 * @param conversation 
 */

data class SeededConnectorTracking (
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "format")
    val format: SeededTrackedFormatEvent? = null,
    @Json(name = "asset")
    val asset: SeededTrackedAssetEvent? = null,
    @Json(name = "interaction")
    val interaction: SeededTrackedInteractionEvent? = null,
    @Json(name = "keyboard")
    val keyboard: SeededTrackedKeyboardEvent? = null,
    @Json(name = "session")
    val session: SeededTrackedSessionEvent? = null,
    @Json(name = "assets")
    val assets: SeededTrackedAssetsEvent? = null,
    @Json(name = "ml")
    val ml: SeededTrackedMachineLearningEvent? = null,
    @Json(name = "adoption")
    val adoption: SeededTrackedAdoptionEvent? = null,
    @Json(name = "conversation")
    val conversation: SeededTrackedConversationEvent? = null
)

