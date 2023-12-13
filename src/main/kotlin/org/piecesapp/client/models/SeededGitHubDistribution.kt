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
import org.piecesapp.client.models.SeededGitHubGistDistribution

import com.squareup.moshi.Json

/**
 * 
 * @param schema 
 * @param gist 
 */

data class SeededGitHubDistribution (
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "gist")
    val gist: SeededGitHubGistDistribution? = null
)

