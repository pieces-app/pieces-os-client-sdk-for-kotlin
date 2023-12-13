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

import org.openapitools.client.models.EmbeddedModelSchema
import org.openapitools.client.models.HintTypeEnum
import org.openapitools.client.models.MechanismEnum

import com.squareup.moshi.Json

/**
 * 
 * @param type 
 * @param text This is the text of the hint.
 * @param schema 
 * @param mechanism 
 * @param asset This is an asset id that we are using to link this to an asset.
 * @param model this is a model id. that we are using to link this to a model.
 */

data class SeededHint (
    @Json(name = "type")
    val type: HintTypeEnum,
    /* This is the text of the hint. */
    @Json(name = "text")
    val text: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "mechanism")
    val mechanism: MechanismEnum? = null,
    /* This is an asset id that we are using to link this to an asset. */
    @Json(name = "asset")
    val asset: kotlin.String? = null,
    /* this is a model id. that we are using to link this to a model. */
    @Json(name = "model")
    val model: kotlin.String? = null
)

