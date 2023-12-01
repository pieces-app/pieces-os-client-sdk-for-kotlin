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
import org.openapitools.client.models.SensitiveCategoryEnum
import org.openapitools.client.models.SensitiveMetadata
import org.openapitools.client.models.SensitiveSeverityEnum

import com.squareup.moshi.Json

/**
 * This is the seededAssetSensitive, this does not have an id yet as we will add it on the server side.  can optionally pass in our mechanism here, as the default will be manual unless specified.  This is different that hte SeededSensitive as this is pre-before the asset has been created.(but added when the asset is created.
 * @param text this is the string representative of the sensative piece of data.
 * @param category 
 * @param severity 
 * @param name 
 * @param description 
 * @param schema 
 * @param mechanism 
 * @param metadata 
 */

data class SeededAssetSensitive (
    /* this is the string representative of the sensative piece of data. */
    @Json(name = "text")
    val text: kotlin.String,
    @Json(name = "category")
    val category: SensitiveCategoryEnum,
    @Json(name = "severity")
    val severity: SensitiveSeverityEnum,
    @Json(name = "name")
    val name: kotlin.String,
    @Json(name = "description")
    val description: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "mechanism")
    val mechanism: MechanismEnum? = null,
    @Json(name = "metadata")
    val metadata: SensitiveMetadata? = null
)

