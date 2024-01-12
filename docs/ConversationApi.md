# ConversationApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversationAssociateAnchor**](ConversationApi.md#conversationAssociateAnchor) | **POST** /conversation/{conversation}/anchors/associate/{anchor} | /conversation/{conversation}/anchors/associate/{anchor} [POST]
[**conversationAssociateAsset**](ConversationApi.md#conversationAssociateAsset) | **POST** /conversation/{conversation}/assets/associate/{asset} | /conversation/{conversation}/assets/associate/{asset} [POST]
[**conversationDeleteAnchor**](ConversationApi.md#conversationDeleteAnchor) | **POST** /conversation/{conversation}/anchors/delete/{anchor} | /conversation/{conversation}/anchors/delete/{anchor} [POST]
[**conversationDeleteAsset**](ConversationApi.md#conversationDeleteAsset) | **POST** /conversation/{conversation}/assets/delete/{asset} | /conversation/{conversation}/assets/delete/{asset} [POST]
[**conversationGetSpecificConversation**](ConversationApi.md#conversationGetSpecificConversation) | **GET** /conversation/{conversation} | /conversation/{conversation} [GET]
[**conversationGroundingMessagesAssociateMessage**](ConversationApi.md#conversationGroundingMessagesAssociateMessage) | **POST** /conversation/{conversation}/grounding/messages/associate/{message} | /conversation/{conversation}/grounding/messages/associate/{message} [POST]
[**conversationGroundingMessagesDisassociateMessage**](ConversationApi.md#conversationGroundingMessagesDisassociateMessage) | **POST** /conversation/{conversation}/grounding/messages/disassociate/{message} | /conversation/{conversation}/grounding/messages/disassociate/{message} [POST]
[**conversationScoresIncrement**](ConversationApi.md#conversationScoresIncrement) | **POST** /conversation/{conversation}/scores/increment | &#39;/conversation/{conversation}/scores/increment&#39; [POST]
[**conversationSpecificConversationMessages**](ConversationApi.md#conversationSpecificConversationMessages) | **GET** /conversation/{conversation}/messages | /conversation/{conversation}/messages [GET]
[**conversationSpecificConversationRename**](ConversationApi.md#conversationSpecificConversationRename) | **POST** /conversation/{conversation}/rename | /conversation/{conversation}/rename [POST]
[**conversationSummarize**](ConversationApi.md#conversationSummarize) | **POST** /conversation/{conversation}/summarize | /conversation/{conversation}/summarize [POST]
[**conversationUpdate**](ConversationApi.md#conversationUpdate) | **POST** /conversation/update | /conversation/update [POST]


<a name="conversationAssociateAnchor"></a>
# **conversationAssociateAnchor**
> conversationAssociateAnchor(conversation, anchor)

/conversation/{conversation}/anchors/associate/{anchor} [POST]

This will update both the anchor and the conversation.  and associate the 2 together

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = ConversationApi()
val conversation : kotlin.String = conversation_example // kotlin.String | This is the uuid of a conversation.
val anchor : kotlin.String = anchor_example // kotlin.String | This is the specific uuid of an anchor.
try {
    apiInstance.conversationAssociateAnchor(conversation, anchor)
} catch (e: ClientException) {
    println("4xx response calling ConversationApi#conversationAssociateAnchor")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationApi#conversationAssociateAnchor")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversation** | **kotlin.String**| This is the uuid of a conversation. |
 **anchor** | **kotlin.String**| This is the specific uuid of an anchor. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="conversationAssociateAsset"></a>
# **conversationAssociateAsset**
> conversationAssociateAsset(conversation, asset)

/conversation/{conversation}/assets/associate/{asset} [POST]

This will update both the asset and the conversation.  and associate the 2 together

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = ConversationApi()
val conversation : kotlin.String = conversation_example // kotlin.String | This is the uuid of a conversation.
val asset : java.util.UUID = 2254f2c8-5797-40e8-ac56-41166dc0e159 // java.util.UUID | The id (uuid) of the asset that you are trying to access.
try {
    apiInstance.conversationAssociateAsset(conversation, asset)
} catch (e: ClientException) {
    println("4xx response calling ConversationApi#conversationAssociateAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationApi#conversationAssociateAsset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversation** | **kotlin.String**| This is the uuid of a conversation. |
 **asset** | [**java.util.UUID**](.md)| The id (uuid) of the asset that you are trying to access. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="conversationDeleteAnchor"></a>
# **conversationDeleteAnchor**
> conversationDeleteAnchor(conversation, anchor)

/conversation/{conversation}/anchors/delete/{anchor} [POST]

This will update both the anchor and the conversation.  and delete(disacioate) the 2 together

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = ConversationApi()
val conversation : kotlin.String = conversation_example // kotlin.String | This is the uuid of a conversation.
val anchor : kotlin.String = anchor_example // kotlin.String | This is the specific uuid of an anchor.
try {
    apiInstance.conversationDeleteAnchor(conversation, anchor)
} catch (e: ClientException) {
    println("4xx response calling ConversationApi#conversationDeleteAnchor")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationApi#conversationDeleteAnchor")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversation** | **kotlin.String**| This is the uuid of a conversation. |
 **anchor** | **kotlin.String**| This is the specific uuid of an anchor. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="conversationDeleteAsset"></a>
# **conversationDeleteAsset**
> conversationDeleteAsset(conversation, asset)

/conversation/{conversation}/assets/delete/{asset} [POST]

This will update both the asset and the conversation.  and delete(disacioate) the 2.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = ConversationApi()
val conversation : kotlin.String = conversation_example // kotlin.String | This is the uuid of a conversation.
val asset : java.util.UUID = 2254f2c8-5797-40e8-ac56-41166dc0e159 // java.util.UUID | The id (uuid) of the asset that you are trying to access.
try {
    apiInstance.conversationDeleteAsset(conversation, asset)
} catch (e: ClientException) {
    println("4xx response calling ConversationApi#conversationDeleteAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationApi#conversationDeleteAsset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversation** | **kotlin.String**| This is the uuid of a conversation. |
 **asset** | [**java.util.UUID**](.md)| The id (uuid) of the asset that you are trying to access. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="conversationGetSpecificConversation"></a>
# **conversationGetSpecificConversation**
> Conversation conversationGetSpecificConversation(conversation, transferables)

/conversation/{conversation} [GET]

This will get a specific conversation.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = ConversationApi()
val conversation : kotlin.String = conversation_example // kotlin.String | This is the uuid of a conversation.
val transferables : kotlin.Boolean = true // kotlin.Boolean | This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement)
try {
    val result : Conversation = apiInstance.conversationGetSpecificConversation(conversation, transferables)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversationApi#conversationGetSpecificConversation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationApi#conversationGetSpecificConversation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversation** | **kotlin.String**| This is the uuid of a conversation. |
 **transferables** | **kotlin.Boolean**| This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement) | [optional]

### Return type

[**Conversation**](Conversation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="conversationGroundingMessagesAssociateMessage"></a>
# **conversationGroundingMessagesAssociateMessage**
> conversationGroundingMessagesAssociateMessage(conversation, message)

/conversation/{conversation}/grounding/messages/associate/{message} [POST]

This will save the grounding context for a conversation. This will enable us to associate a message to the conversation.grounding object.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = ConversationApi()
val conversation : kotlin.String = conversation_example // kotlin.String | This is the uuid of a conversation.
val message : kotlin.String = message_example // kotlin.String | This is the uuid of a message.
try {
    apiInstance.conversationGroundingMessagesAssociateMessage(conversation, message)
} catch (e: ClientException) {
    println("4xx response calling ConversationApi#conversationGroundingMessagesAssociateMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationApi#conversationGroundingMessagesAssociateMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversation** | **kotlin.String**| This is the uuid of a conversation. |
 **message** | **kotlin.String**| This is the uuid of a message. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="conversationGroundingMessagesDisassociateMessage"></a>
# **conversationGroundingMessagesDisassociateMessage**
> conversationGroundingMessagesDisassociateMessage(conversation, message)

/conversation/{conversation}/grounding/messages/disassociate/{message} [POST]

This will remove specific grounding context for a conversation. This will enable us to dissassociate a message from the conversation.grounding object.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = ConversationApi()
val conversation : kotlin.String = conversation_example // kotlin.String | This is the uuid of a conversation.
val message : kotlin.String = message_example // kotlin.String | This is the uuid of a message.
try {
    apiInstance.conversationGroundingMessagesDisassociateMessage(conversation, message)
} catch (e: ClientException) {
    println("4xx response calling ConversationApi#conversationGroundingMessagesDisassociateMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationApi#conversationGroundingMessagesDisassociateMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversation** | **kotlin.String**| This is the uuid of a conversation. |
 **message** | **kotlin.String**| This is the uuid of a message. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="conversationScoresIncrement"></a>
# **conversationScoresIncrement**
> conversationScoresIncrement(conversation, seededScoreIncrement)

&#39;/conversation/{conversation}/scores/increment&#39; [POST]

This will take in a SeededScoreIncrement and will increment the material relative to the incoming body.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = ConversationApi()
val conversation : kotlin.String = conversation_example // kotlin.String | This is the uuid of a conversation.
val seededScoreIncrement : SeededScoreIncrement =  // SeededScoreIncrement | 
try {
    apiInstance.conversationScoresIncrement(conversation, seededScoreIncrement)
} catch (e: ClientException) {
    println("4xx response calling ConversationApi#conversationScoresIncrement")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationApi#conversationScoresIncrement")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversation** | **kotlin.String**| This is the uuid of a conversation. |
 **seededScoreIncrement** | [**SeededScoreIncrement**](SeededScoreIncrement.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="conversationSpecificConversationMessages"></a>
# **conversationSpecificConversationMessages**
> ConversationMessages conversationSpecificConversationMessages(conversation, transferables)

/conversation/{conversation}/messages [GET]

This will get a specific conversations messages

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = ConversationApi()
val conversation : kotlin.String = conversation_example // kotlin.String | This is the uuid of a conversation.
val transferables : kotlin.Boolean = true // kotlin.Boolean | This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement)
try {
    val result : ConversationMessages = apiInstance.conversationSpecificConversationMessages(conversation, transferables)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversationApi#conversationSpecificConversationMessages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationApi#conversationSpecificConversationMessages")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversation** | **kotlin.String**| This is the uuid of a conversation. |
 **transferables** | **kotlin.Boolean**| This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement) | [optional]

### Return type

[**ConversationMessages**](ConversationMessages.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="conversationSpecificConversationRename"></a>
# **conversationSpecificConversationRename**
> Conversation conversationSpecificConversationRename(conversation, transferables)

/conversation/{conversation}/rename [POST]

This will take a specific converssation and it will rename using ML.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = ConversationApi()
val conversation : kotlin.String = conversation_example // kotlin.String | This is the uuid of a conversation.
val transferables : kotlin.Boolean = true // kotlin.Boolean | This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement)
try {
    val result : Conversation = apiInstance.conversationSpecificConversationRename(conversation, transferables)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversationApi#conversationSpecificConversationRename")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationApi#conversationSpecificConversationRename")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversation** | **kotlin.String**| This is the uuid of a conversation. |
 **transferables** | **kotlin.Boolean**| This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement) | [optional]

### Return type

[**Conversation**](Conversation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="conversationSummarize"></a>
# **conversationSummarize**
> ConversationSummarizeOutput conversationSummarize(conversation, conversationSummarizeInput)

/conversation/{conversation}/summarize [POST]

This will take a current conversation and create a summary of the conversation and save it as an annotation on the conversation.  will return the annotation reference used as the summary.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = ConversationApi()
val conversation : kotlin.String = conversation_example // kotlin.String | This is the uuid of a conversation.
val conversationSummarizeInput : ConversationSummarizeInput =  // ConversationSummarizeInput | 
try {
    val result : ConversationSummarizeOutput = apiInstance.conversationSummarize(conversation, conversationSummarizeInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversationApi#conversationSummarize")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationApi#conversationSummarize")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversation** | **kotlin.String**| This is the uuid of a conversation. |
 **conversationSummarizeInput** | [**ConversationSummarizeInput**](ConversationSummarizeInput.md)|  | [optional]

### Return type

[**ConversationSummarizeOutput**](ConversationSummarizeOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="conversationUpdate"></a>
# **conversationUpdate**
> Conversation conversationUpdate(transferables, conversation)

/conversation/update [POST]

This will update a specific conversation.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = ConversationApi()
val transferables : kotlin.Boolean = true // kotlin.Boolean | This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement)
val conversation : Conversation =  // Conversation | 
try {
    val result : Conversation = apiInstance.conversationUpdate(transferables, conversation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversationApi#conversationUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationApi#conversationUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferables** | **kotlin.Boolean**| This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement) | [optional]
 **conversation** | [**Conversation**](Conversation.md)|  | [optional]

### Return type

[**Conversation**](Conversation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

