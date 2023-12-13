# BackupApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**backup**](BackupApi.md#backup) | **POST** /backup | /backup [POST]
[**backupAsset**](BackupApi.md#backupAsset) | **POST** /backup/asset | /backup/asset [POST]


<a name="backup"></a>
# **backup**
> backup(assets)

/backup [POST]

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BackupApi()
val assets : Assets =  // Assets | 
try {
    apiInstance.backup(assets)
} catch (e: ClientException) {
    println("4xx response calling BackupApi#backup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BackupApi#backup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assets** | [**Assets**](Assets.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="backupAsset"></a>
# **backupAsset**
> backupAsset(asset)

/backup/asset [POST]

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BackupApi()
val asset : Asset =  // Asset | 
try {
    apiInstance.backupAsset(asset)
} catch (e: ClientException) {
    println("4xx response calling BackupApi#backupAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BackupApi#backupAsset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asset** | [**Asset**](Asset.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

