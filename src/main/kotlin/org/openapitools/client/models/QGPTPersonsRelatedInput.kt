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
import org.piecesapp.client.models.QGPTConversation
import org.piecesapp.client.models.Seed

import com.squareup.moshi.Json

/**
 * This is used for /qgpt/persons/related.  will accept a seed, or conversation all optionally. 
 * @param schema 
 * @param seed 
 * @param conversation 
 * @param application optional application id
 * @param model optional model id
 */

data class QGPTPersonsRelatedInput (
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "seed")
    val seed: Seed? = null,
    @Json(name = "conversation")
    val conversation: QGPTConversation? = null,
    /* optional application id */
    @Json(name = "application")
    val application: kotlin.String? = null,
    /* optional model id */
    @Json(name = "model")
    val model: kotlin.String? = null
)
