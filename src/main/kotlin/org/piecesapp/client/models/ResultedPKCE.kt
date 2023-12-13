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

import com.squareup.moshi.Json

/**
 * A Model To Represent the Code Returned from a PKCE Response
 * @param code The PKCE Code to be used to access a Token.
 * @param state Likely the state that will be returned which should match the requested state as well as the nonce
 * @param schema 
 */

data class ResultedPKCE (
    /* The PKCE Code to be used to access a Token. */
    @Json(name = "code")
    val code: kotlin.String,
    /* Likely the state that will be returned which should match the requested state as well as the nonce */
    @Json(name = "state")
    val state: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null
)

