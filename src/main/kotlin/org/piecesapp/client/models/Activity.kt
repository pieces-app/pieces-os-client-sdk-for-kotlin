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

import org.openapitools.client.models.Application
import org.openapitools.client.models.EmbeddedModelSchema
import org.openapitools.client.models.FlattenedAsset
import org.openapitools.client.models.FlattenedFormat
import org.openapitools.client.models.FlattenedUserProfile
import org.openapitools.client.models.GroupedTimestamp
import org.openapitools.client.models.MechanismEnum
import org.openapitools.client.models.SeededConnectorTracking

import com.squareup.moshi.Json

/**
 * consider a rename to Event? That being said if we go with event we need to think about a word to pre/post fix event because it is likely to be a reserved word.  additional documentation: https://www.notion.so/getpieces/Activity-4da8de193733441f85f87b510235fb74   Notes: - user/asset/format are all optional, NOT required that one of these are present. - if mechanism == internal we will not display to the user.  Thoughts around additional properties. - hmm dismissed array here, that is an array of strings, where the string is the userId that dismissed this notification? or we could potentially do it based on the os_ID. - 
 * @param id 
 * @param created 
 * @param updated 
 * @param event 
 * @param application 
 * @param mechanism 
 * @param schema 
 * @param deleted 
 * @param asset 
 * @param user 
 * @param format 
 * @param rank This is the numeric value assigned for this activity event. This number is based off the the type of activity event calcaulated on the server side.DO NOT MODIFY. To see what the value qualilates to, please refer to the function within the common sdk. The number here is based on the fib series. from 0 -> infinity but rn there arnt any value over 8.
 */

data class Activity (
    @Json(name = "id")
    val id: kotlin.String,
    @Json(name = "created")
    val created: GroupedTimestamp,
    @Json(name = "updated")
    val updated: GroupedTimestamp,
    @Json(name = "event")
    val event: SeededConnectorTracking,
    @Json(name = "application")
    val application: Application,
    @Json(name = "mechanism")
    val mechanism: MechanismEnum,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "deleted")
    val deleted: GroupedTimestamp? = null,
    @Json(name = "asset")
    val asset: FlattenedAsset? = null,
    @Json(name = "user")
    val user: FlattenedUserProfile? = null,
    @Json(name = "format")
    val format: FlattenedFormat? = null,
    /* This is the numeric value assigned for this activity event. This number is based off the the type of activity event calcaulated on the server side.DO NOT MODIFY. To see what the value qualilates to, please refer to the function within the common sdk. The number here is based on the fib series. from 0 -> infinity but rn there arnt any value over 8. */
    @Json(name = "rank")
    val rank: kotlin.Int? = null
)

