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
import org.piecesapp.client.models.MechanismEnum

import com.squareup.moshi.Json

/**
 * This is the minimum information required to create a website for a specific asset.  you can optionally add an asset, or person id to attach this website directly to it  TODO consider updating these asset,format to referenced Models
 * @param url this is the url of the website.
 * @param name name of the website.(customizable and updateable as well.)
 * @param schema 
 * @param asset This is the specific asset that this website is going to get attached to!!
 * @param conversation This is the specific conversation that this website is going to get attached to!!
 * @param mechanism 
 * @param person this is a uuid of a person that we are going to add the website too.
 */

data class SeededWebsite (
    /* this is the url of the website. */
    @Json(name = "url")
    val url: kotlin.String,
    /* name of the website.(customizable and updateable as well.) */
    @Json(name = "name")
    val name: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    /* This is the specific asset that this website is going to get attached to!! */
    @Json(name = "asset")
    val asset: kotlin.String? = null,
    /* This is the specific conversation that this website is going to get attached to!! */
    @Json(name = "conversation")
    val conversation: kotlin.String? = null,
    @Json(name = "mechanism")
    val mechanism: MechanismEnum? = null,
    /* this is a uuid of a person that we are going to add the website too. */
    @Json(name = "person")
    val person: kotlin.String? = null
)

