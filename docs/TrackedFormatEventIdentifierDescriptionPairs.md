
# TrackedFormatEventIdentifierDescriptionPairs

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schema** | [**EmbeddedModelSchema**](EmbeddedModelSchema.md) |  |  [optional]
**formatCreated** | [**inline**](#FormatCreatedEnum) | The key value pair for an asset being created. |  [optional]
**formatCopied** | [**inline**](#FormatCopiedEnum) | If a format was copied entirely |  [optional]
**formatPartiallyCopied** | [**inline**](#FormatPartiallyCopiedEnum) | If a format was copied partially |  [optional]
**formatDownloaded** | [**inline**](#FormatDownloadedEnum) | If a format was downloaded |  [optional]
**formatDeleted** | [**inline**](#FormatDeletedEnum) | If an format was deleted |  [optional]
**formatGenericClassificationUpdated** | [**inline**](#FormatGenericClassificationUpdatedEnum) | If a generic classification was changed on a format |  [optional]
**formatSpecificClassificationUpdated** | [**inline**](#FormatSpecificClassificationUpdatedEnum) | If a specific classification was changed on a format |  [optional]
**formatUpdated** | [**inline**](#FormatUpdatedEnum) | a format was updated, generic update. |  [optional]
**formatInserted** | [**inline**](#FormatInsertedEnum) | a format was inserted |  [optional]
**formatValueEdited** | [**inline**](#FormatValueEditedEnum) | a format&#39;s value was update ie, the text, etc... |  [optional]


<a name="FormatCreatedEnum"></a>
## Enum: format_created
Name | Value
---- | -----
formatCreated | a_format_was_created


<a name="FormatCopiedEnum"></a>
## Enum: format_copied
Name | Value
---- | -----
formatCopied | if_a_format_was_entirely_copied


<a name="FormatPartiallyCopiedEnum"></a>
## Enum: format_partially_copied
Name | Value
---- | -----
formatPartiallyCopied | if_a_format_was_partially_copied


<a name="FormatDownloadedEnum"></a>
## Enum: format_downloaded
Name | Value
---- | -----
formatDownloaded | if_a_format_was_downloaded


<a name="FormatDeletedEnum"></a>
## Enum: format_deleted
Name | Value
---- | -----
formatDeleted | if_a_format_was_deleted


<a name="FormatGenericClassificationUpdatedEnum"></a>
## Enum: format_generic_classification_updated
Name | Value
---- | -----
formatGenericClassificationUpdated | if_a_generic_classification_was_changed_on_a_format


<a name="FormatSpecificClassificationUpdatedEnum"></a>
## Enum: format_specific_classification_updated
Name | Value
---- | -----
formatSpecificClassificationUpdated | if_a_specific_classification_was_changed_on_a_format


<a name="FormatUpdatedEnum"></a>
## Enum: format_updated
Name | Value
---- | -----
formatUpdated | a_format_was_updated


<a name="FormatInsertedEnum"></a>
## Enum: format_inserted
Name | Value
---- | -----
formatInserted | a_format_was_inserted


<a name="FormatValueEditedEnum"></a>
## Enum: format_value_edited
Name | Value
---- | -----
formatValueEdited | a_format_value_was_edited



