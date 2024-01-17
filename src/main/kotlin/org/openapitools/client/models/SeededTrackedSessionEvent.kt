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
import org.piecesapp.client.models.TrackedSessionEventIdentifierDescriptionPairs

import com.squareup.moshi.Json

/**
 * A simple model to capture a Tracked Session to be send to the Connection API
 * @param identifierDescriptionPair 
 * @param schema 
 */

data class SeededTrackedSessionEvent (
    @Json(name = "identifier_description_pair")
    val identifierDescriptionPair: TrackedSessionEventIdentifierDescriptionPairs,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null
)
