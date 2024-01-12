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
 * 
 * @param distribution stringified array of numbers
 * @param inferredDistribution stringified array of numbers
 * @param tags stringified array of strings
 * @param inferredTags stringified array of strings
 * @param model this is the model version 
 * @param labelVersion This is the version of the file that we are using that contains all the possible tags
 * @param threshold this is the minimum score from the model that a tag needs to have to be included in the tags array.
 * @param inferredThreshold this is the minimum score from the postprocessing that a tag needs to have to be included in the inferred_tags array.
 * @param context this is the origin in which this asset was created, application(string representation)
 * @param asset This is the asset id.
 * @param schema 
 */

data class TLPCodeSnippetTagifyCode (
    /* stringified array of numbers */
    @Json(name = "distribution")
    val distribution: kotlin.String,
    /* stringified array of numbers */
    @Json(name = "inferred_distribution")
    val inferredDistribution: kotlin.String,
    /* stringified array of strings */
    @Json(name = "tags")
    val tags: kotlin.String,
    /* stringified array of strings */
    @Json(name = "inferred_tags")
    val inferredTags: kotlin.String,
    /* this is the model version  */
    @Json(name = "model")
    val model: kotlin.String,
    /* This is the version of the file that we are using that contains all the possible tags */
    @Json(name = "label_version")
    val labelVersion: kotlin.String,
    /* this is the minimum score from the model that a tag needs to have to be included in the tags array. */
    @Json(name = "threshold")
    val threshold: java.math.BigDecimal,
    /* this is the minimum score from the postprocessing that a tag needs to have to be included in the inferred_tags array. */
    @Json(name = "inferred_threshold")
    val inferredThreshold: java.math.BigDecimal,
    /* this is the origin in which this asset was created, application(string representation) */
    @Json(name = "context")
    val context: kotlin.String,
    /* This is the asset id. */
    @Json(name = "asset")
    val asset: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null
)
