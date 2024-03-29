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
import org.piecesapp.client.models.ReferencedConversation
import org.piecesapp.client.models.TrackedConversationEventIdentifierDescriptionPairs
import org.piecesapp.client.models.TrackedConversationEventMetadata

import com.squareup.moshi.Json

/**
 * This is a pre-created(seed) TrackedConversationEvent
 * @param identifierDescriptionPair 
 * @param conversation 
 * @param schema 
 * @param metadata 
 */

data class SeededTrackedConversationEvent (
    @Json(name = "identifier_description_pair")
    val identifierDescriptionPair: TrackedConversationEventIdentifierDescriptionPairs,
    @Json(name = "conversation")
    val conversation: ReferencedConversation,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "metadata")
    val metadata: TrackedConversationEventMetadata? = null
)

