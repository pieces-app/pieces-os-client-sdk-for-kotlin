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
import org.openapitools.client.models.MechanismEnum
import org.openapitools.client.models.TagCategoryEnum

import com.squareup.moshi.Json

/**
 * This is the minimum information needed when creating a Tag.  Default we will attach manual to a tag unless otherwise specified for mechanism.  you can optionally add an asset, format, or person uuid to attach this tag directly to it  TODO consider updating these asset,format to referenced Models
 * @param text This is the description of the tag.
 * @param schema 
 * @param asset this is a uuid that references an asset.
 * @param mechanism 
 * @param category 
 * @param person uuid of the person, you want to add this tag too
 */

data class SeededTag (
    /* This is the description of the tag. */
    @Json(name = "text")
    val text: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    /* this is a uuid that references an asset. */
    @Json(name = "asset")
    val asset: kotlin.String? = null,
    @Json(name = "mechanism")
    val mechanism: MechanismEnum? = null,
    @Json(name = "category")
    val category: TagCategoryEnum? = null,
    /* uuid of the person, you want to add this tag too */
    @Json(name = "person")
    val person: kotlin.String? = null
)

