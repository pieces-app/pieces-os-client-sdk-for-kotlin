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
import org.openapitools.client.models.FlattenedConversationMessages
import org.openapitools.client.models.RelevantQGPTSeeds

import com.squareup.moshi.Json

/**
 * This is the body input for the /code_gpt/question.  Note: - each relevant seed, must require at minimum a Seed or an id used from the /code_gpt/relevance endpoint or we will throw an error.
 * @param relevant 
 * @param query This is the user asked question.
 * @param schema 
 * @param application optional application id
 * @param model optional model id
 * @param messages 
 */

data class QGPTQuestionInput (
    @Json(name = "relevant")
    val relevant: RelevantQGPTSeeds,
    /* This is the user asked question. */
    @Json(name = "query")
    val query: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    /* optional application id */
    @Json(name = "application")
    val application: kotlin.String? = null,
    /* optional model id */
    @Json(name = "model")
    val model: kotlin.String? = null,
    @Json(name = "messages")
    val messages: FlattenedConversationMessages? = null
)

