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

import com.squareup.moshi.Json

/**
 * Only supporting a single api key per user.
 * @param schema 
 * @param apiKey 
 * @param apiKeyName 
 * @param organizationKey 
 */

data class Auth0OpenAIUserMetadata (
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "api_key")
    val apiKey: kotlin.String? = null,
    @Json(name = "api_key_name")
    val apiKeyName: kotlin.String? = null,
    @Json(name = "organization_key")
    val organizationKey: kotlin.String? = null
)
