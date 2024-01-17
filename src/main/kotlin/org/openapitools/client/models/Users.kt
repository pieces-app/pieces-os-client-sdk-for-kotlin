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
import org.piecesapp.client.models.UserProfile

import com.squareup.moshi.Json

/**
 * A base class for a collection of users and some additional meta properties.
 * @param schema 
 * @param iterable 
 */

data class Users (
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "iterable")
    val iterable: kotlin.collections.List<UserProfile>? = null
)
