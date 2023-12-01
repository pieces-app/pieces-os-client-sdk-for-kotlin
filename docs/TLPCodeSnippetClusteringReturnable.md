
# TLPCodeSnippetClusteringReturnable

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**iterable** | [**kotlin.collections.List&lt;TLPCodeSnippetCluster&gt;**](TLPCodeSnippetCluster.md) |  | 
**duration** | **kotlin.Int** | this is the time (in milliseconds) it takes to process the cluster. | 
**maxImportSize** | **kotlin.Int** | The max number of snippets returned.(input Param) | 
**minSimilarity** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The minimum similarity between snippets for them to be in the same cluster. | 
**minPoints** | **kotlin.Int** | The minimum number of other points in a cluster. | 
**maxDepth** | **kotlin.Int** | The maximum parse depth for tree sitter. | 
**maxChildren** | **kotlin.Int** | The maximum parse breadth for expanding a node&#39;s children - tree sitter | 
**ext** | [**Ext**](Ext.md) |  |  [optional]



