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

import org.piecesapp.client.models.QGPTHintsInput
import org.piecesapp.client.models.QGPTPersonsRelatedInput
import org.piecesapp.client.models.QGPTPersonsRelatedOutput
import org.piecesapp.client.models.QGPTQuestionInput
import org.piecesapp.client.models.QGPTQuestionOutput
import org.piecesapp.client.models.QGPTRelevanceInput
import org.piecesapp.client.models.QGPTRelevanceOutput
import org.piecesapp.client.models.QGPTRepromptInput
import org.piecesapp.client.models.QGPTRepromptOutput
import org.piecesapp.client.models.QGPTStreamInput
import org.piecesapp.client.models.QGPTStreamOutput

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

class QGPTApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("org.piecesapp.client.baseUrl", "http://localhost:3000")
        }
    }

    /**
    * /qgpt/hints [POST]
    * This is only to generate suggested questions that the user can ask. ( we will provide the answer we displayed to the user, the relevant snippets used for the answer, and the previous query.  We will return a list of questions that can be displayed to the user.
    * @param qgPTHintsInput  (optional)
    * @return QGPTQuestionOutput
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun hints(qgPTHintsInput: QGPTHintsInput?) : QGPTQuestionOutput {
        val localVariableBody: kotlin.Any? = qgPTHintsInput
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/qgpt/hints",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<QGPTQuestionOutput>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as QGPTQuestionOutput
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
    * /qgpt/persons/related [POST]
    * This Endpoint is used for Who Support.  IE given context like a Seed, or a qgptConversation, who will be able to help out.   Input: - (optional) seed: Seed - ONLY GOING TO SUPPORT fragments.for now. - (optional) conversation: QGPTConversation.  Output: - persons: Persons
    * @param transferables This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement) (optional)
    * @param qgPTPersonsRelatedInput  (optional)
    * @return QGPTPersonsRelatedOutput
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun personsRelated(transferables: kotlin.Boolean?, qgPTPersonsRelatedInput: QGPTPersonsRelatedInput?) : QGPTPersonsRelatedOutput {
        val localVariableBody: kotlin.Any? = qgPTPersonsRelatedInput
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (transferables != null) {
                    put("transferables", listOf(transferables.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/qgpt/persons/related",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<QGPTPersonsRelatedOutput>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as QGPTPersonsRelatedOutput
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
    * /qgpt/stream [GET]
    * This is a version of qGPT stream that will stream the inputs.  This will handle relevance.  This will handle question.  This will throw an error if both are passed in. That being said if you want to utalize question &amp;&amp; relevant, you can get stream results by passing in relevance with options.question:true.  This will handle multiple conversations.  This is a Websocket.  StatusCodes of the output of this will be on the output of the websocket: 200: success 401: invalid authentication/api key 429: Rate limit/Quota exceeded 500: server had an error 503: the engine is currently overloaded
    * @param qgPTStreamInput  (optional)
    * @return QGPTStreamOutput
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun qgptStream(qgPTStreamInput: QGPTStreamInput?) : QGPTStreamOutput {
        val localVariableBody: kotlin.Any? = qgPTStreamInput
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/qgpt/stream",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<QGPTStreamOutput>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as QGPTStreamOutput
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
    * /qgpt/question [POST]
    * This is going to accept, relevant code snippets or uuids returned from the /qgpt/relevance endpoint, as well as a question query and we will return possible results to answer your question.  NOTE: - The relevant seeds, must require either an id, that was used within the /qgpt/relevance endpoint or a seed with afragment/string. or else we will throw and error.  This endpoint will take your query and your relevant snippets and use them to answer your question, returning multiple answers to your question all of which with scores.  200: success 401: invalid authentication/api key 429: Rate limit/Quota exceeded 500: server had an error 503: the engine is currently overloaded
    * @param qgPTQuestionInput  (optional)
    * @return QGPTQuestionOutput
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun question(qgPTQuestionInput: QGPTQuestionInput?) : QGPTQuestionOutput {
        val localVariableBody: kotlin.Any? = qgPTQuestionInput
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/qgpt/question",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<QGPTQuestionOutput>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as QGPTQuestionOutput
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
    * /qgpt/relevance [POST]
    * This is the first phase to the QGPT flow.  Please one of the following. 1. provide an absolute path on the users machine that we can use locally. 2. provide Seeds that you want to compare to, which will be ONLY fragment/string values(all other values will be ignored) 3. provide assets, here you can provide an iterable of the asset id, and we will do the rest 4. you can set your database boolean to true which will tell us to use your entire DB as the query space.  required - query: string; This is the question of the user. optional - question: boolean; This will by-pass the second endpoint and just ask the question and return the results(as an ease of use bool)  This endpoint will embed everything. and will return the relevance snippets that we will use in the next phase, to answer your question.  on the UI: we can show this to users (around this is the snippets we used to answer your question.)  Next: feed this information to the /qgpt/question [POST] endpoint to get your question answered.(unless you included the question:true optional boolean, then you will get the results from here.)
    * @param qgPTRelevanceInput  (optional)
    * @return QGPTRelevanceOutput
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun relevance(qgPTRelevanceInput: QGPTRelevanceInput?) : QGPTRelevanceOutput {
        val localVariableBody: kotlin.Any? = qgPTRelevanceInput
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/qgpt/relevance",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<QGPTRelevanceOutput>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as QGPTRelevanceOutput
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
    * /qgpt/reprompt [POST]
    * This will take in a followup question and the history of the conversation, and emit your a prompt or query that you can pass to the /qgpt/relevance and then the /qgpt/question endpoint to get your next answer.
    * @param qgPTRepromptInput  (optional)
    * @return QGPTRepromptOutput
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun reprompt(qgPTRepromptInput: QGPTRepromptInput?) : QGPTRepromptOutput {
        val localVariableBody: kotlin.Any? = qgPTRepromptInput
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/qgpt/reprompt",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<QGPTRepromptOutput>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as QGPTRepromptOutput
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