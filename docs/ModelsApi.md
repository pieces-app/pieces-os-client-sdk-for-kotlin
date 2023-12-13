# ModelsApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**modelsCreateNewModel**](ModelsApi.md#modelsCreateNewModel) | **POST** /models/create | /models/create [POST]
[**modelsDeleteSpecificModel**](ModelsApi.md#modelsDeleteSpecificModel) | **POST** /models/{model}/delete | /models/{model}/delete [POST]
[**modelsSnapshot**](ModelsApi.md#modelsSnapshot) | **GET** /models | /models [GET]
[**unloadModels**](ModelsApi.md#unloadModels) | **POST** /models/unload | /models/unload [POST]


<a name="modelsCreateNewModel"></a>
# **modelsCreateNewModel**
> Model modelsCreateNewModel(seededModel)

/models/create [POST]

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ModelsApi()
val seededModel : SeededModel =  // SeededModel | 
try {
    val result : Model = apiInstance.modelsCreateNewModel(seededModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModelsApi#modelsCreateNewModel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModelsApi#modelsCreateNewModel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **seededModel** | [**SeededModel**](SeededModel.md)|  | [optional]

### Return type

[**Model**](Model.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="modelsDeleteSpecificModel"></a>
# **modelsDeleteSpecificModel**
> modelsDeleteSpecificModel(model)

/models/{model}/delete [POST]

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ModelsApi()
val model : kotlin.String = model_example // kotlin.String | model id
try {
    apiInstance.modelsDeleteSpecificModel(model)
} catch (e: ClientException) {
    println("4xx response calling ModelsApi#modelsDeleteSpecificModel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModelsApi#modelsDeleteSpecificModel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **kotlin.String**| model id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="modelsSnapshot"></a>
# **modelsSnapshot**
> Models modelsSnapshot()

/models [GET]

This will get a snapshot of all of your models.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ModelsApi()
try {
    val result : Models = apiInstance.modelsSnapshot()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModelsApi#modelsSnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModelsApi#modelsSnapshot")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Models**](Models.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unloadModels"></a>
# **unloadModels**
> unloadModels()

/models/unload [POST]

This will unload all of the ml models.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ModelsApi()
try {
    apiInstance.unloadModels()
} catch (e: ClientException) {
    println("4xx response calling ModelsApi#unloadModels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModelsApi#unloadModels")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

