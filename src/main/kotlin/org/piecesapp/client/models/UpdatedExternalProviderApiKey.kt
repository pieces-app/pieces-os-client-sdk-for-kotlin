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

import org.piecesapp.client.models.Auth0UserMetadata
import org.piecesapp.client.models.EmbeddedModelSchema

import com.squareup.moshi.Json

/**
 * This is the update Auth0UserMetadata object, and the specific update output model for \"/external_provider/api_key/update\"
 * @param metadata 
 * @param schema 
 */

data class UpdatedExternalProviderApiKey (
    @Json(name = "metadata")
    val metadata: Auth0UserMetadata,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null
)

