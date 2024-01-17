/**
* Runtime Common Library
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 1.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.piecesapp.client.models


import com.squareup.moshi.Json

/**
* This enum is used to label and identify unique filters used in post-processing the description
* Values: pUNCTUATION,aLPHABETICAL,rEPETITION
*/

enum class TLPDescriptionFilterEnum(val value: kotlin.String){


    @Json(name = "PUNCTUATION")
    pUNCTUATION("PUNCTUATION"),


    @Json(name = "ALPHABETICAL")
    aLPHABETICAL("ALPHABETICAL"),


    @Json(name = "REPETITION")
    rEPETITION("REPETITION");



    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }

}

