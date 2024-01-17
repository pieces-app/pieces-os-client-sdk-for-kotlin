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
package org.piecesapp.client.apis

import org.piecesapp.client.models.Analysis
import org.piecesapp.client.models.Format
import org.piecesapp.client.models.FormatReclassification
import org.piecesapp.client.models.SeededTrackedFormatEvent
import org.piecesapp.client.models.TrackedFormatEvent

import org.piecesapp.client.infrastructure.ApiClient
import org.piecesapp.client.infrastructure.ClientException
import org.piecesapp.client.infrastructure.ClientError
import org.piecesapp.client.infrastructure.ServerException
import org.piecesapp.client.infrastructure.ServerError
import org.piecesapp.client.infrastructure.MultiValueMap
import org.piecesapp.client.infrastructure.RequestConfig
import org.piecesapp.client.infrastructure.RequestMethod
import org.piecesapp.client.infrastructure.ResponseType
import org.piecesapp.client.infrastructure.Success
import org.piecesapp.client.infrastructure.toMultiValue

class FormatApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("org.piecesapp.client.baseUrl", "http://localhost:3000")
        }
    }

    /**
    * /format/{format}/analysis [GET]
    * This will get an analysis from a format&#39;s id.
    * @param format The id (uuid) for a specific format. 
    * @return Analysis
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun formatAnalysis(format: java.util.UUID) : Analysis {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/format/{format}/analysis".replace("{"+"format"+"}", "$format"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<Analysis>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Analysis
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * /format/reclassify [POST]
    * This endpoint will be used to reclassify a single Format.
    * @param transferable This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement) (optional)
    * @param formatReclassification  (optional)
    * @return Format
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun formatReclassify(transferable: kotlin.Boolean?, formatReclassification: FormatReclassification?) : Format {
        val localVariableBody: kotlin.Any? = formatReclassification
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (transferable != null) {
                    put("transferable", listOf(transferable.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/format/reclassify",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<Format>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Format
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * /format/{format} [GET] Scoped to Format
    * Get a snapshot of a specific format.
    * @param format The id (uuid) for a specific format. 
    * @param transferable This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement) (optional)
    * @return Format
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun formatSnapshot(format: java.util.UUID, transferable: kotlin.Boolean?) : Format {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (transferable != null) {
                    put("transferable", listOf(transferable.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/format/{format}".replace("{"+"format"+"}", "$format"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<Format>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Format
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * [POST] /format/update/value
    * This will update a format&#39;s value, ie, a formats fragment or file depending on what is provided.  code/text fragment behavior: If this format is an asset.preview.base we will update the asset.original&#39;s value. if this format is an asset.preview.original we will update the asset.preview.base&#39;s value.  code/text file behavior: If the the format that is update is the asset.preview.base is a fragment and the asset.original is file then we will update the asset.original&#39;s value to be bytes or string respectively. This goes the same for orignal to preview but will be go the reverse order so if the original is a file we will update the preview base&#39;s fragment string.  image fragment/file: We will not modify preview -&gt; orignal or original -&gt; preview here. so there are zero side effects in this case, and will update as normal. (this will be the case for all other value updates.)
    * @param transferable This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement) (optional)
    * @param format This is the format that you want to update. (optional)
    * @return Format
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun formatUpdateValue(transferable: kotlin.Boolean?, format: Format?) : Format {
        val localVariableBody: kotlin.Any? = format
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (transferable != null) {
                    put("transferable", listOf(transferable.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/format/update/value",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<Format>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Format
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * /format/usage/event [POST] Scoped to Format
    * This is an analytics endpoint that will enable us to know when a user has copied/downloaded/beamed/viewed a format.
    * @param seededTrackedFormatEvent This is a SeededTrackedFormatEvent, per tracked event:) (optional)
    * @return TrackedFormatEvent
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun formatUsageEvent(seededTrackedFormatEvent: SeededTrackedFormatEvent?) : TrackedFormatEvent {
        val localVariableBody: kotlin.Any? = seededTrackedFormatEvent
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/format/usage/event",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<TrackedFormatEvent>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TrackedFormatEvent
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

}