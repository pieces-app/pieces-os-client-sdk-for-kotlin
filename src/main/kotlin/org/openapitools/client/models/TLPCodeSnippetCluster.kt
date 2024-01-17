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
import org.piecesapp.client.models.TLPCodeSnippetClusterMember

import com.squareup.moshi.Json

/**
 * This is the model that gets returned from the SnippetClusteringReturnable. The text here is the representative (seed) of the cluster.
 * @param text The text here is the representative (seed) of the cluster.
 * @param size This was the size of the original cluster.
 * @param index This is the original index of the snippet, or where it was within the input array.
 * @param schema 
 * @param related This is all of the other snippets within the cluster that were NOT chosen to represent(seed), but are included in the cluster itself.
 */

data class TLPCodeSnippetCluster (
    /* The text here is the representative (seed) of the cluster. */
    @Json(name = "text")
    val text: kotlin.String,
    /* This was the size of the original cluster. */
    @Json(name = "size")
    val size: kotlin.Int,
    /* This is the original index of the snippet, or where it was within the input array. */
    @Json(name = "index")
    val index: kotlin.Int,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    /* This is all of the other snippets within the cluster that were NOT chosen to represent(seed), but are included in the cluster itself. */
    @Json(name = "related")
    val related: kotlin.collections.List<TLPCodeSnippetClusterMember>? = null
)
