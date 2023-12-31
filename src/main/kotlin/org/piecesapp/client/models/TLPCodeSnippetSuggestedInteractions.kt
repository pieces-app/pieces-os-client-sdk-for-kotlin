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
import org.piecesapp.client.models.TLPCodeFragmentSuggestedReuse
import org.piecesapp.client.models.TLPCodeFragmentSuggestedSave

import com.squareup.moshi.Json

/**
 * 
 * @param schema 
 * @param save 
 * @param reuse 
 */

data class TLPCodeSnippetSuggestedInteractions (
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "save")
    val save: TLPCodeFragmentSuggestedSave? = null,
    @Json(name = "reuse")
    val reuse: TLPCodeFragmentSuggestedReuse? = null
)

