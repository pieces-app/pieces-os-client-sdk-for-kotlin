# HtmlApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**webpage**](HtmlApi.md#webpage) | **POST** /html/webpage | /html/webpage [POST]


<a name="webpage"></a>
# **webpage**
> kotlin.String webpage(htmlWebpage)

/html/webpage [POST]

This is the webpage endpoint.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = HtmlApi()
val htmlWebpage : HtmlWebpage =  // HtmlWebpage | 
try {
    val result : kotlin.String = apiInstance.webpage(htmlWebpage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling HtmlApi#webpage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HtmlApi#webpage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **htmlWebpage** | [**HtmlWebpage**](HtmlWebpage.md)|  | [optional]

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

