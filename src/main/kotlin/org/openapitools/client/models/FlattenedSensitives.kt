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
import org.piecesapp.client.models.ReferencedSensitive
import org.piecesapp.client.models.Score

import com.squareup.moshi.Json

/**
 * This is a flattened representation of multiple sensitive pieces of data.
 * @param iterable 
 * @param schema 
 * @param score 
 */

data class FlattenedSensitives (
    @Json(name = "iterable")
    val iterable: kotlin.collections.List<ReferencedSensitive>,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "score")
    val score: Score? = null
)
