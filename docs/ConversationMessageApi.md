# ConversationMessageApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**associateAnnotation**](ConversationMessageApi.md#associateAnnotation) | **POST** /message/{message}/annotations/associate/{annotation} | /message/{message}/annotations/associate/{annotation} [POST]
[**disassociateAnnotation**](ConversationMessageApi.md#disassociateAnnotation) | **POST** /message/{message}/annotations/disassociate/{annotation} | /message/{message}/annotations/disassociate/{annotation} [POST]
[**messageScoresIncrement**](ConversationMessageApi.md#messageScoresIncrement) | **POST** /message/{message}/scores/increment | &#39;/message/{message}/scores/increment&#39; [POST]
[**messageSpecificMessageSnapshot**](ConversationMessageApi.md#messageSpecificMessageSnapshot) | **GET** /message/{message} | /message/{message} [GET]
[**messageSpecificMessageUpdate**](ConversationMessageApi.md#messageSpecificMessageUpdate) | **POST** /message/update | /message/update [GET]


<a name="associateAnnotation"></a>
# **associateAnnotation**
> associateAnnotation(annotation, message)

/message/{message}/annotations/associate/{annotation} [POST]

This will associate a message with an annotation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConversationMessageApi()
val annotation : kotlin.String = annotation_example // kotlin.String | This is a specific annotation uuid.
val message : kotlin.String = message_example // kotlin.String | This is the uuid of a message.
try {
    apiInstance.associateAnnotation(annotation, message)
} catch (e: ClientException) {
    println("4xx response calling ConversationMessageApi#associateAnnotation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationMessageApi#associateAnnotation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annotation** | **kotlin.String**| This is a specific annotation uuid. |
 **message** | **kotlin.String**| This is the uuid of a message. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="disassociateAnnotation"></a>
# **disassociateAnnotation**
> disassociateAnnotation(annotation, message)

/message/{message}/annotations/disassociate/{annotation} [POST]

This will enable us to dissassociate a message from an annotation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConversationMessageApi()
val annotation : kotlin.String = annotation_example // kotlin.String | This is a specific annotation uuid.
val message : kotlin.String = message_example // kotlin.String | This is the uuid of a message.
try {
    apiInstance.disassociateAnnotation(annotation, message)
} catch (e: ClientException) {
    println("4xx response calling ConversationMessageApi#disassociateAnnotation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationMessageApi#disassociateAnnotation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annotation** | **kotlin.String**| This is a specific annotation uuid. |
 **message** | **kotlin.String**| This is the uuid of a message. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="messageScoresIncrement"></a>
# **messageScoresIncrement**
> messageScoresIncrement(message, seededScoreIncrement)

&#39;/message/{message}/scores/increment&#39; [POST]

This will take in a SeededScoreIncrement and will increment the material relative to the incoming body.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConversationMessageApi()
val message : kotlin.String = message_example // kotlin.String | This is the uuid of a message.
val seededScoreIncrement : SeededScoreIncrement =  // SeededScoreIncrement | 
try {
    apiInstance.messageScoresIncrement(message, seededScoreIncrement)
} catch (e: ClientException) {
    println("4xx response calling ConversationMessageApi#messageScoresIncrement")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationMessageApi#messageScoresIncrement")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message** | **kotlin.String**| This is the uuid of a message. |
 **seededScoreIncrement** | [**SeededScoreIncrement**](SeededScoreIncrement.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="messageSpecificMessageSnapshot"></a>
# **messageSpecificMessageSnapshot**
> ConversationMessage messageSpecificMessageSnapshot(message, transferables)

/message/{message} [GET]

This will get a specific snapshot of a message

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConversationMessageApi()
val message : kotlin.String = message_example // kotlin.String | This is the uuid of a message.
val transferables : kotlin.Boolean = true // kotlin.Boolean | This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement)
try {
    val result : ConversationMessage = apiInstance.messageSpecificMessageSnapshot(message, transferables)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversationMessageApi#messageSpecificMessageSnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationMessageApi#messageSpecificMessageSnapshot")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message** | **kotlin.String**| This is the uuid of a message. |
 **transferables** | **kotlin.Boolean**| This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement) | [optional]

### Return type

[**ConversationMessage**](ConversationMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="messageSpecificMessageUpdate"></a>
# **messageSpecificMessageUpdate**
> ConversationMessage messageSpecificMessageUpdate(transferables, conversationMessage)

/message/update [GET]

This will update a conversation message.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConversationMessageApi()
val transferables : kotlin.Boolean = true // kotlin.Boolean | This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement)
val conversationMessage : ConversationMessage =  // ConversationMessage | 
try {
    val result : ConversationMessage = apiInstance.messageSpecificMessageUpdate(transferables, conversationMessage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversationMessageApi#messageSpecificMessageUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationMessageApi#messageSpecificMessageUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferables** | **kotlin.Boolean**| This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement) | [optional]
 **conversationMessage** | [**ConversationMessage**](ConversationMessage.md)|  | [optional]

### Return type

[**ConversationMessage**](ConversationMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

