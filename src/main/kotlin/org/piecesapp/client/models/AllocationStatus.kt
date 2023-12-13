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

import org.piecesapp.client.models.AllocationStatusEnum

import com.squareup.moshi.Json

/**
 * 
 * @param pod 
 * @param dns 
 */

data class AllocationStatus (
    @Json(name = "pod")
    val pod: AllocationStatusEnum,
    @Json(name = "dns")
    val dns: AllocationStatusEnum
)

