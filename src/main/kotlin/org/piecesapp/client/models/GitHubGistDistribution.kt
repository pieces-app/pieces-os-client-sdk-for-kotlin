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
import org.piecesapp.client.models.GroupedTimestamp
import org.piecesapp.client.models.Recipients

import com.squareup.moshi.Json

/**
 * This is a published Github Gist.
 * @param recipients 
 * @param public This will let us know if the gist is public or private.
 * @param name This is the name of the gist you will add.
 * @param created 
 * @param updated 
 * @param githubId This is the id that github uses to represent the gist.
 * @param url This is the url where the gist is.
 * @param schema 
 * @param description This is the description of the Gist Distribution
 * @param deleted 
 */

data class GitHubGistDistribution (
    @Json(name = "recipients")
    val recipients: Recipients,
    /* This will let us know if the gist is public or private. */
    @Json(name = "public")
    val public: kotlin.Boolean,
    /* This is the name of the gist you will add. */
    @Json(name = "name")
    val name: kotlin.String,
    @Json(name = "created")
    val created: GroupedTimestamp,
    @Json(name = "updated")
    val updated: GroupedTimestamp,
    /* This is the id that github uses to represent the gist. */
    @Json(name = "github_id")
    val githubId: kotlin.String,
    /* This is the url where the gist is. */
    @Json(name = "url")
    val url: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    /* This is the description of the Gist Distribution */
    @Json(name = "description")
    val description: kotlin.String? = null,
    @Json(name = "deleted")
    val deleted: GroupedTimestamp? = null
)

