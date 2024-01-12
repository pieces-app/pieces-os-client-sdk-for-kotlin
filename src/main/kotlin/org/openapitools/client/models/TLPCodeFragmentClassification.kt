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
import org.piecesapp.client.models.SystemExecutionInformation
import org.piecesapp.client.models.TLPCodeFragmentClassificationMetadata

import com.squareup.moshi.Json

/**
 * Model for ML big query classification.
 * @param asset 
 * @param model 
 * @param created 
 * @param classification 
 * @param probability 
 * @param context 
 * @param user identifier for the user
 * @param schema 
 * @param distribution 
 * @param metadata 
 * @param latency this is the time it takes to run this model.
 * @param system 
 */

data class TLPCodeFragmentClassification (
    @Json(name = "asset")
    val asset: kotlin.String,
    @Json(name = "model")
    val model: kotlin.String,
    @Json(name = "created")
    val created: kotlin.String,
    @Json(name = "classification")
    val classification: kotlin.String,
    @Json(name = "probability")
    val probability: java.math.BigDecimal,
    @Json(name = "context")
    val context: kotlin.String,
    /* identifier for the user */
    @Json(name = "user")
    val user: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "distribution")
    val distribution: kotlin.String? = null,
    @Json(name = "metadata")
    val metadata: TLPCodeFragmentClassificationMetadata? = null,
    /* this is the time it takes to run this model. */
    @Json(name = "latency")
    val latency: java.math.BigDecimal? = null,
    @Json(name = "system")
    val system: SystemExecutionInformation? = null
)
