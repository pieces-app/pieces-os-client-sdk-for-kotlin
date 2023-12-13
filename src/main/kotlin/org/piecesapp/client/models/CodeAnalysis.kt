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
package org.openapitools.client.models

import org.openapitools.client.models.ClassificationGenericEnum
import org.openapitools.client.models.EmbeddedModelSchema
import org.openapitools.client.models.Model

import com.squareup.moshi.Json

/**
 * This is the ML Analysis object Specific to code.  prediction and similarity are custom types {[string]: number}. ** please dont not modify **
 * @param type 
 * @param id 
 * @param analysis this is just a reference to the analysis parent object.
 * @param model 
 * @param schema 
 * @param tokenized 
 * @param language 
 * @param prediction 
 * @param similarity 
 * @param top5Colors 
 * @param top5Sorted 
 */

data class CodeAnalysis (
    @Json(name = "type")
    val type: ClassificationGenericEnum,
    @Json(name = "id")
    val id: kotlin.String,
    /* this is just a reference to the analysis parent object. */
    @Json(name = "analysis")
    val analysis: kotlin.String,
    @Json(name = "model")
    val model: Model,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "tokenized")
    val tokenized: kotlin.collections.List<kotlin.String>? = null,
    @Json(name = "language")
    val language: kotlin.String? = null,
    @Json(name = "prediction")
    val prediction: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>? = null,
    @Json(name = "similarity")
    val similarity: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>? = null,
    @Json(name = "top5Colors")
    val top5Colors: kotlin.collections.List<kotlin.Int>? = null,
    @Json(name = "top5Sorted")
    val top5Sorted: kotlin.collections.List<kotlin.String>? = null
)

