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


import com.squareup.moshi.Json

/**
 * Strongly-typed returnable object for the language classifer with prior.
 * @param top5SortedDesc 
 * @param top5Colours 
 * @param prediction This is the final language predition from the language classifier prior.(the final language to be used as the classification)
 * @param duration This is the time it takes to run this function.
 */

data class LanguageClassifierPriorReturnable (
    @Json(name = "top5SortedDesc")
    val top5SortedDesc: kotlin.collections.List<kotlin.String>,
    @Json(name = "top5Colours")
    val top5Colours: kotlin.collections.List<kotlin.Int>,
    /* This is the final language predition from the language classifier prior.(the final language to be used as the classification) */
    @Json(name = "prediction")
    val prediction: kotlin.String,
    /* This is the time it takes to run this function. */
    @Json(name = "duration")
    val duration: kotlin.Int
)
