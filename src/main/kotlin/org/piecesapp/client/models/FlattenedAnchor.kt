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

import org.openapitools.client.models.AnchorTypeEnum
import org.openapitools.client.models.EmbeddedModelSchema
import org.openapitools.client.models.FlattenedAnchorPoints
import org.openapitools.client.models.FlattenedAnnotations
import org.openapitools.client.models.FlattenedAssets
import org.openapitools.client.models.FlattenedConversations
import org.openapitools.client.models.GroupedTimestamp
import org.openapitools.client.models.Score

import com.squareup.moshi.Json

/**
 * 
 * @param id 
 * @param type 
 * @param points 
 * @param created 
 * @param updated 
 * @param schema 
 * @param watch 
 * @param deleted 
 * @param assets 
 * @param name 
 * @param annotations 
 * @param conversations 
 * @param score 
 */

data class FlattenedAnchor (
    @Json(name = "id")
    val id: kotlin.String,
    @Json(name = "type")
    val type: AnchorTypeEnum,
    @Json(name = "points")
    val points: FlattenedAnchorPoints,
    @Json(name = "created")
    val created: GroupedTimestamp,
    @Json(name = "updated")
    val updated: GroupedTimestamp,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "watch")
    val watch: kotlin.Boolean? = null,
    @Json(name = "deleted")
    val deleted: GroupedTimestamp? = null,
    @Json(name = "assets")
    val assets: FlattenedAssets? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "annotations")
    val annotations: FlattenedAnnotations? = null,
    @Json(name = "conversations")
    val conversations: FlattenedConversations? = null,
    @Json(name = "score")
    val score: Score? = null
)

