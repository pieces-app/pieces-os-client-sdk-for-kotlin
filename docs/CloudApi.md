# CloudApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloudSnapshot**](CloudApi.md#cloudSnapshot) | **GET** /cloud/{cloud} | /cloud/{cloud} [GET]
[**cloudUpdate**](CloudApi.md#cloudUpdate) | **POST** /cloud/update | /cloud/update [POST]
[**cloudVersionSync**](CloudApi.md#cloudVersionSync) | **POST** /cloud/version-sync | Version sync


<a name="cloudSnapshot"></a>
# **cloudSnapshot**
> Cloud cloudSnapshot(cloud)

/cloud/{cloud} [GET]

This will get a snapshot of a specific cloud.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = CloudApi()
val cloud : kotlin.String = cloud_example // kotlin.String | 
try {
    val result : Cloud = apiInstance.cloudSnapshot(cloud)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CloudApi#cloudSnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CloudApi#cloudSnapshot")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloud** | **kotlin.String**|  |

### Return type

[**Cloud**](Cloud.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cloudUpdate"></a>
# **cloudUpdate**
> Cloud cloudUpdate(cloud)

/cloud/update [POST]

This will update a specific cloud.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = CloudApi()
val cloud : Cloud =  // Cloud | 
try {
    val result : Cloud = apiInstance.cloudUpdate(cloud)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CloudApi#cloudUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CloudApi#cloudUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloud** | [**Cloud**](Cloud.md)|  | [optional]

### Return type

[**Cloud**](Cloud.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cloudVersionSync"></a>
# **cloudVersionSync**
> VersionSyncResponse cloudVersionSync(body)

Version sync

This allows for sending local semver and retrieving information on whether it is compatible with cloud server version or needs an update. It also receives cloud server&#39;s semver

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = CloudApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : VersionSyncResponse = apiInstance.cloudVersionSync(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CloudApi#cloudVersionSync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CloudApi#cloudVersionSync")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **kotlin.String**|  | [optional]

### Return type

[**VersionSyncResponse**](VersionSyncResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

