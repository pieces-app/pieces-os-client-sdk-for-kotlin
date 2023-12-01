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
import org.openapitools.client.models.FlattenedShare
import org.openapitools.client.models.GitHubDistribution
import org.openapitools.client.models.GroupedTimestamp
import org.openapitools.client.models.MailgunDistribution

import com.squareup.moshi.Json

/**
 * This is a fully referenced version of a Distribution. TODO add additional distributions such as slack, google_chat, ...etc
 * @param id 
 * @param share 
 * @param created 
 * @param updated 
 * @param schema 
 * @param deleted 
 * @param mailgun 
 * @param github 
 */

data class Distribution (
    @Json(name = "id")
    val id: kotlin.String,
    @Json(name = "share")
    val share: FlattenedShare,
    @Json(name = "created")
    val created: GroupedTimestamp,
    @Json(name = "updated")
    val updated: GroupedTimestamp,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "deleted")
    val deleted: GroupedTimestamp? = null,
    @Json(name = "mailgun")
    val mailgun: MailgunDistribution? = null,
    @Json(name = "github")
    val github: GitHubDistribution? = null
)

