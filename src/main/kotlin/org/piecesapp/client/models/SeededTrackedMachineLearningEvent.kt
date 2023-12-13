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
import org.piecesapp.client.models.GraphicalMachineLearningProcessingEvent
import org.piecesapp.client.models.TLPMachineLearningProcessingEvent

import com.squareup.moshi.Json

/**
 * 
 * @param schema 
 * @param tlp 
 * @param graphical 
 */

data class SeededTrackedMachineLearningEvent (
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "tlp")
    val tlp: TLPMachineLearningProcessingEvent? = null,
    @Json(name = "graphical")
    val graphical: GraphicalMachineLearningProcessingEvent? = null
)

