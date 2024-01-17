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
import org.piecesapp.client.models.FlattenedAsset
import org.piecesapp.client.models.GroupedTimestamp
import org.piecesapp.client.models.MechanismEnum
import org.piecesapp.client.models.Score
import org.piecesapp.client.models.SensitiveCategoryEnum
import org.piecesapp.client.models.SensitiveMetadata
import org.piecesapp.client.models.SensitiveSeverityEnum

import com.squareup.moshi.Json

/**
 * This is a fully referenced representation of a sensitive pieces of data.
 * @param id 
 * @param created 
 * @param updated 
 * @param asset 
 * @param text 
 * @param mechanism 
 * @param category 
 * @param severity 
 * @param name 
 * @param description 
 * @param schema 
 * @param deleted 
 * @param metadata 
 * @param interactions This is an optional value that will keep track of the number of times this has been interacted with.
 * @param score 
 */

data class Sensitive (
    @Json(name = "id")
    val id: kotlin.String,
    @Json(name = "created")
    val created: GroupedTimestamp,
    @Json(name = "updated")
    val updated: GroupedTimestamp,
    @Json(name = "asset")
    val asset: FlattenedAsset,
    @Json(name = "text")
    val text: kotlin.String,
    @Json(name = "mechanism")
    val mechanism: MechanismEnum,
    @Json(name = "category")
    val category: SensitiveCategoryEnum,
    @Json(name = "severity")
    val severity: SensitiveSeverityEnum,
    @Json(name = "name")
    val name: kotlin.String,
    @Json(name = "description")
    val description: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "deleted")
    val deleted: GroupedTimestamp? = null,
    @Json(name = "metadata")
    val metadata: SensitiveMetadata? = null,
    /* This is an optional value that will keep track of the number of times this has been interacted with. */
    @Json(name = "interactions")
    val interactions: kotlin.Int? = null,
    @Json(name = "score")
    val score: Score? = null
)
