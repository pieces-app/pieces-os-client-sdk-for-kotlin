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
import org.openapitools.client.models.ReferencedAsset
import org.openapitools.client.models.Score

import com.squareup.moshi.Json

/**
 * A collection of Assets specific to the authenticated user. [DAG Compatible - Directed Acyclic Graph Data Structure]  FlattenedAssets prevent Cycles in Reference because all outbound references are strings as opposed to crosspollinated objects.  i.e. Asset asset = FlattenedAssets.iterable[0] => Format format = asset.preview => String id = format.asset => String id
 * @param schema 
 * @param iterable 
 * @param indices This is a Map<String, int> where the the key is an asset id.
 * @param score 
 */

data class FlattenedAssets (
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "iterable")
    val iterable: kotlin.collections.List<ReferencedAsset>? = null,
    /* This is a Map<String, int> where the the key is an asset id. */
    @Json(name = "indices")
    val indices: kotlin.collections.Map<kotlin.String, kotlin.Int>? = null,
    @Json(name = "score")
    val score: Score? = null
)

