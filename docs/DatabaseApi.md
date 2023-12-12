# DatabaseApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**databaseExport**](DatabaseApi.md#databaseExport) | **GET** /database/export | Your GET endpoint
[**databaseImport**](DatabaseApi.md#databaseImport) | **POST** /database/import | /database/import [POST]


<a name="databaseExport"></a>
# **databaseExport**
> ExportedDatabase databaseExport()

Your GET endpoint

This is going to export your current database.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = DatabaseApi()
try {
    val result : ExportedDatabase = apiInstance.databaseExport()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DatabaseApi#databaseExport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DatabaseApi#databaseExport")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ExportedDatabase**](ExportedDatabase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="databaseImport"></a>
# **databaseImport**
> databaseImport(exportedDatabase)

/database/import [POST]

This is going to take in a database, and merge it with the current database. This will revert your database back to it original form if this request fails.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = DatabaseApi()
val exportedDatabase : ExportedDatabase =  // ExportedDatabase | 
try {
    apiInstance.databaseImport(exportedDatabase)
} catch (e: ClientException) {
    println("4xx response calling DatabaseApi#databaseImport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DatabaseApi#databaseImport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exportedDatabase** | [**ExportedDatabase**](ExportedDatabase.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

