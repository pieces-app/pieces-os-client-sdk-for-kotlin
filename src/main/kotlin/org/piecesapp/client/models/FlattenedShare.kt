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

import org.piecesapp.client.models.AccessEnum
import org.piecesapp.client.models.Accessors
import org.piecesapp.client.models.EmbeddedModelSchema
import org.piecesapp.client.models.FlattenedAssets
import org.piecesapp.client.models.FlattenedDistributions
import org.piecesapp.client.models.GroupedTimestamp
import org.piecesapp.client.models.Score

import com.squareup.moshi.Json

/**
 * This is a dag safe version of the Share.  if user is undefined && access is public then we have an asset that is publicly available.
 * @param id This references the share it self.
 * @param link this is the prebuilt link.
 * @param access 
 * @param accessors 
 * @param created 
 * @param short This is a shortened version of our uuid.
 * @param schema 
 * @param asset this is the asset id on the flattened share.
 * @param user this is the uuid of the user that the share is created for.
 * @param name 
 * @param assets 
 * @param distributions 
 * @param score 
 */

data class FlattenedShare (
    /* This references the share it self. */
    @Json(name = "id")
    val id: kotlin.String,
    /* this is the prebuilt link. */
    @Json(name = "link")
    val link: kotlin.String,
    @Json(name = "access")
    val access: AccessEnum,
    @Json(name = "accessors")
    val accessors: Accessors,
    @Json(name = "created")
    val created: GroupedTimestamp,
    /* This is a shortened version of our uuid. */
    @Json(name = "short")
    val short: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    /* this is the asset id on the flattened share. */
    @Json(name = "asset")
    val asset: kotlin.String? = null,
    /* this is the uuid of the user that the share is created for. */
    @Json(name = "user")
    val user: kotlin.String? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "assets")
    val assets: FlattenedAssets? = null,
    @Json(name = "distributions")
    val distributions: FlattenedDistributions? = null,
    @Json(name = "score")
    val score: Score? = null
)

