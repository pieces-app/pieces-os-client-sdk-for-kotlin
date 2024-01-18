/**
* This is an open API that holds specific endpoints as a base for Pieces Context Systems
* The point of this API is to allow us to organize and Auto Generate Code Specific for Connected Applications - this will allow for stateful context abstraction & less code within the Core Connector
*
* The version of the OpenAPI document: 1.0
* Contact: tsavo@pieces.app
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.piecesapp.client.apis

import org.piecesapp.client.models.ConnectorSnapshot
import org.piecesapp.client.models.Context
import org.piecesapp.client.models.Reaction
import org.piecesapp.client.models.Searched
import org.piecesapp.client.models.SeededConnectorAsset
import org.piecesapp.client.models.SeededConnectorConnection
import org.piecesapp.client.models.SeededConnectorCreation
import org.piecesapp.client.models.SeededConnectorTracking
import org.piecesapp.client.models.Suggestion

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

class ConnectorApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("org.piecesapp.client.baseUrl", "http://localhost:1000")
        }
    }

    /**
    * /connect [POST]
    * An endpoint which abstracts a bootup/connection for a specific context
    * @param seededConnectorConnection  (optional)
    * @return Context
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun connect(seededConnectorConnection: SeededConnectorConnection?) : Context {
        val localVariableBody: kotlin.Any? = seededConnectorConnection
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/connect",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<Context>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Context
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
    * /{application}/create [POST]
    * A simple endpoint to create either a format or asset depending on the data passed
    * @param application This is a uuid that represents an application 
    * @param seededConnectorCreation  (optional)
    * @return kotlin.String
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun create(application: kotlin.String, seededConnectorCreation: SeededConnectorCreation?) : kotlin.String {
        val localVariableBody: kotlin.Any? = seededConnectorCreation
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/{application}/create".replace("{"+"application"+"}", "$application"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.String>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.String
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
    * /{application}/intention [POST]
    * This can be used to send a SeededAsset over that you may use to compair in the future.
    * @param application  
    * @param seededConnectorAsset  (optional)
    * @return kotlin.String
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun intention(application: kotlin.String, seededConnectorAsset: SeededConnectorAsset?) : kotlin.String {
        val localVariableBody: kotlin.Any? = seededConnectorAsset
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/{application}/intention".replace("{"+"application"+"}", "$application"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.String>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.String
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
    * /onboarded [POST]
    * A consolidation endpoint to handle the updating of an onboarding process.
    * @param application This is a uuid that represents an application 
    * @param body Whether or not that application has been onboarded. (optional)
    * @return kotlin.String
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun onboarded(application: kotlin.String, body: kotlin.Boolean?) : kotlin.String {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/{application}/onboarded".replace("{"+"application"+"}", "$application"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.String>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.String
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
    * /{application}/reaction [POST]
    * This will react to the response returned from the /suggest endpoint. 
    * @param application  
    * @param reaction ** This body will need to be modified. (optional)
    * @return kotlin.String
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun react(application: kotlin.String, reaction: Reaction?) : kotlin.String {
        val localVariableBody: kotlin.Any? = reaction
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/{application}/reaction".replace("{"+"application"+"}", "$application"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.String>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.String
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
    * [GET] /{application}/search?query&#x3D;string
    * This is the connector search endpoint that will take a query parameter to search all of your assets! (soon) will also be able to search your formats as well!  Required to pass searchable_tags (csv of tags) or a query string.  if a query is passed we will run through fuzzy search.  if searchable_tags are passed we will run through tag_based_search.  if neither are passed in we will return a 500.
    * @param application This is a uuid that represents an application 
    * @param query This is a string that you can use to search your assets. (optional)
    * @param transferables This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement) (optional)
    * @param searchableTags This is a comma separated value of tags used for search. (optional)
    * @param pseudo This is helper boolean that will give you the ability to also include your pseudo assets, we will always default to false. (optional)
    * @return Searched
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun search(application: kotlin.String, query: kotlin.String?, transferables: kotlin.Boolean?, searchableTags: kotlin.String?, pseudo: kotlin.Boolean?) : Searched {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (query != null) {
                    put("query", listOf(query.toString()))
                }
                if (transferables != null) {
                    put("transferables", listOf(transferables.toString()))
                }
                if (searchableTags != null) {
                    put("searchable_tags", listOf(searchableTags.toString()))
                }
                if (pseudo != null) {
                    put("pseudo", listOf(pseudo.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/{application}/search".replace("{"+"application"+"}", "$application"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<Searched>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Searched
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
    * /snapshot [POST]
    * Getting the snapshot of the current context which is everything the current connected application could need to provide to the user.
    * @param application This is a uuid that represents an application 
    * @param transferables This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement) (optional)
    * @param suggested This will let us know if a developer, wants a snapshot related to suggested content or normal content (optional)
    * @param pseudo This is helper boolean that will give you the ability to also include your pseudo assets, we will always default to false. (optional)
    * @return ConnectorSnapshot
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun snapshot(application: kotlin.String, transferables: kotlin.Boolean?, suggested: kotlin.Boolean?, pseudo: kotlin.Boolean?) : ConnectorSnapshot {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (transferables != null) {
                    put("transferables", listOf(transferables.toString()))
                }
                if (suggested != null) {
                    put("suggested", listOf(suggested.toString()))
                }
                if (pseudo != null) {
                    put("pseudo", listOf(pseudo.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/{application}/snapshot".replace("{"+"application"+"}", "$application"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<ConnectorSnapshot>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ConnectorSnapshot
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
    * /{application}/suggestion [POST]
    * This can and should be called everytime a snippet is coppied from an integration. IE A Jetbrains user coppies some code, then this end point can get called to weigh if we want to suggest a piece to be reused (if reuse is true we should provide asset that the user may want to use) or saved or neither.   **Note: Could potentially accept a SeededFormat for the request body if we want.  TODO potentially just make this a get endpoint. (because we are trying to retireve data.
    * @param application  
    * @param seededConnectorCreation This is the Snippet that we will compare to all the saved assets to determine what we want to do with it! (optional)
    * @return Suggestion
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun suggest(application: kotlin.String, seededConnectorCreation: SeededConnectorCreation?) : Suggestion {
        val localVariableBody: kotlin.Any? = seededConnectorCreation
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/{application}/suggestion".replace("{"+"application"+"}", "$application"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<Suggestion>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Suggestion
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
    * /{application}/track [POST]
    * This is an endpoint specifically to abstract the work of packaging for segment on a per-context basis
    * @param application This is a uuid that represents an application 
    * @param seededConnectorTracking The body is able to take in several properties  (optional)
    * @return kotlin.String
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun track(application: kotlin.String, seededConnectorTracking: SeededConnectorTracking?) : kotlin.String {
        val localVariableBody: kotlin.Any? = seededConnectorTracking
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/{application}/track".replace("{"+"application"+"}", "$application"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.String>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.String
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
