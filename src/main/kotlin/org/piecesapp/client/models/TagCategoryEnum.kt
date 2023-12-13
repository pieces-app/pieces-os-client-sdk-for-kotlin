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


import com.squareup.moshi.Json

/**
* This is an enum that describes the category that that this tag is apart of.
* Values: hANDLE,eMAIL,uNKNOWN
*/

enum class TagCategoryEnum(val value: kotlin.String){


    @Json(name = "HANDLE")
    hANDLE("HANDLE"),


    @Json(name = "EMAIL")
    eMAIL("EMAIL"),


    @Json(name = "UNKNOWN")
    uNKNOWN("UNKNOWN");



    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }

}

