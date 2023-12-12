# WebsiteApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**associateAsset**](WebsiteApi.md#associateAsset) | **POST** /website/{website}/assets/associate/{asset} | /website/{website}/assets/associate/{asset} [POST]
[**associatePerson**](WebsiteApi.md#associatePerson) | **POST** /website/{website}/persons/associate/{person} | /website/{website}/persons/associate/{person} [POST]
[**disassociateAsset**](WebsiteApi.md#disassociateAsset) | **POST** /website/{website}/assets/disassociate/{asset} | /website/{website}/assets/disassociate/{asset} [POST]
[**disassociatePerson**](WebsiteApi.md#disassociatePerson) | **POST** /website/{website}/persons/disassociate/{person} | /website/{website}/persons/disassociate/{person} [POST]
[**websiteScoresIncrement**](WebsiteApi.md#websiteScoresIncrement) | **POST** /website/{website}/scores/increment | &#39;/website/{website}/scores/increment&#39; [POST]
[**websiteUpdate**](WebsiteApi.md#websiteUpdate) | **POST** /website/update | /website/update [POST]
[**websitesSpecificWebsiteSnapshot**](WebsiteApi.md#websitesSpecificWebsiteSnapshot) | **GET** /website/{website} | /website/{website} [GET]


<a name="associateAsset"></a>
# **associateAsset**
> associateAsset(asset, website)

/website/{website}/assets/associate/{asset} [POST]

This will associate a website with a asset.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = WebsiteApi()
val asset : java.util.UUID = 2254f2c8-5797-40e8-ac56-41166dc0e159 // java.util.UUID | The id (uuid) of the asset that you are trying to access.
val website : kotlin.String = website_example // kotlin.String | website id
try {
    apiInstance.associateAsset(asset, website)
} catch (e: ClientException) {
    println("4xx response calling WebsiteApi#associateAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebsiteApi#associateAsset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asset** | [**java.util.UUID**](.md)| The id (uuid) of the asset that you are trying to access. |
 **website** | **kotlin.String**| website id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="associatePerson"></a>
# **associatePerson**
> associatePerson(website, person)

/website/{website}/persons/associate/{person} [POST]

This will associate a website with a person.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = WebsiteApi()
val website : kotlin.String = website_example // kotlin.String | website id
val person : kotlin.String = person_example // kotlin.String | This is a uuid that represents a person.
try {
    apiInstance.associatePerson(website, person)
} catch (e: ClientException) {
    println("4xx response calling WebsiteApi#associatePerson")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebsiteApi#associatePerson")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **website** | **kotlin.String**| website id |
 **person** | **kotlin.String**| This is a uuid that represents a person. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="disassociateAsset"></a>
# **disassociateAsset**
> disassociateAsset(website, asset)

/website/{website}/assets/disassociate/{asset} [POST]

This will enable us to dissassociate a website from a asset.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = WebsiteApi()
val website : kotlin.String = website_example // kotlin.String | website id
val asset : java.util.UUID = 2254f2c8-5797-40e8-ac56-41166dc0e159 // java.util.UUID | The id (uuid) of the asset that you are trying to access.
try {
    apiInstance.disassociateAsset(website, asset)
} catch (e: ClientException) {
    println("4xx response calling WebsiteApi#disassociateAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebsiteApi#disassociateAsset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **website** | **kotlin.String**| website id |
 **asset** | [**java.util.UUID**](.md)| The id (uuid) of the asset that you are trying to access. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="disassociatePerson"></a>
# **disassociatePerson**
> disassociatePerson(website, person)

/website/{website}/persons/disassociate/{person} [POST]

This will enable us to dissassociate a website from a person.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = WebsiteApi()
val website : kotlin.String = website_example // kotlin.String | website id
val person : kotlin.String = person_example // kotlin.String | This is a uuid that represents a person.
try {
    apiInstance.disassociatePerson(website, person)
} catch (e: ClientException) {
    println("4xx response calling WebsiteApi#disassociatePerson")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebsiteApi#disassociatePerson")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **website** | **kotlin.String**| website id |
 **person** | **kotlin.String**| This is a uuid that represents a person. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="websiteScoresIncrement"></a>
# **websiteScoresIncrement**
> websiteScoresIncrement(website, seededScoreIncrement)

&#39;/website/{website}/scores/increment&#39; [POST]

This will take in a SeededScoreIncrement and will increment the material relative to the incoming body.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = WebsiteApi()
val website : kotlin.String = website_example // kotlin.String | website id
val seededScoreIncrement : SeededScoreIncrement =  // SeededScoreIncrement | 
try {
    apiInstance.websiteScoresIncrement(website, seededScoreIncrement)
} catch (e: ClientException) {
    println("4xx response calling WebsiteApi#websiteScoresIncrement")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebsiteApi#websiteScoresIncrement")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **website** | **kotlin.String**| website id |
 **seededScoreIncrement** | [**SeededScoreIncrement**](SeededScoreIncrement.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="websiteUpdate"></a>
# **websiteUpdate**
> Website websiteUpdate(transferables, website)

/website/update [POST]

This will update a specific website.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = WebsiteApi()
val transferables : kotlin.Boolean = true // kotlin.Boolean | This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement)
val website : Website =  // Website | 
try {
    val result : Website = apiInstance.websiteUpdate(transferables, website)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebsiteApi#websiteUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebsiteApi#websiteUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferables** | **kotlin.Boolean**| This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement) | [optional]
 **website** | [**Website**](Website.md)|  | [optional]

### Return type

[**Website**](Website.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="websitesSpecificWebsiteSnapshot"></a>
# **websitesSpecificWebsiteSnapshot**
> Website websitesSpecificWebsiteSnapshot(website, transferables)

/website/{website} [GET]

This will get a snapshot of a single website.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = WebsiteApi()
val website : kotlin.String = website_example // kotlin.String | website id
val transferables : kotlin.Boolean = true // kotlin.Boolean | This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement)
try {
    val result : Website = apiInstance.websitesSpecificWebsiteSnapshot(website, transferables)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebsiteApi#websitesSpecificWebsiteSnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebsiteApi#websitesSpecificWebsiteSnapshot")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **website** | **kotlin.String**| website id |
 **transferables** | **kotlin.Boolean**| This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement) | [optional]

### Return type

[**Website**](Website.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

