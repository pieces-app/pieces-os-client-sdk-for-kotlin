# UltraSuiteApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assetsCreateUltraSuiteAsset**](UltraSuiteApi.md#assetsCreateUltraSuiteAsset) | **POST** /ultra_suite/assets/create | /ultra_suite/assets/create [POST]


<a name="assetsCreateUltraSuiteAsset"></a>
# **assetsCreateUltraSuiteAsset**
> Asset assetsCreateUltraSuiteAsset(seededUltraSuiteAsset)

/ultra_suite/assets/create [POST]

This Endpoint will create an Asset that is sent from UltraSuite.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = UltraSuiteApi()
val seededUltraSuiteAsset : SeededUltraSuiteAsset =  // SeededUltraSuiteAsset | 
try {
    val result : Asset = apiInstance.assetsCreateUltraSuiteAsset(seededUltraSuiteAsset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UltraSuiteApi#assetsCreateUltraSuiteAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UltraSuiteApi#assetsCreateUltraSuiteAsset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **seededUltraSuiteAsset** | [**SeededUltraSuiteAsset**](SeededUltraSuiteAsset.md)|  | [optional]

### Return type

[**Asset**](Asset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

