
# TrackedAssetEventIdentifierDescriptionPairs

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schema** | [**EmbeddedModelSchema**](EmbeddedModelSchema.md) |  |  [optional]
**assetCreated** | [**inline**](#AssetCreatedEnum) | The key value pair for an asset being created. |  [optional]
**assetViewed** | [**inline**](#AssetViewedEnum) | An asset was viewed |  [optional]
**assetFormatCopied** | [**inline**](#AssetFormatCopiedEnum) | An asset&#39;s format was copied |  [optional]
**assetFormatDownloaded** | [**inline**](#AssetFormatDownloadedEnum) | An asset&#39;s format was downloaded |  [optional]
**assetDeleted** | [**inline**](#AssetDeletedEnum) | An asset was deleted or not |  [optional]
**assetDescriptionUpdated** | [**inline**](#AssetDescriptionUpdatedEnum) | An asset was redescribed by the user |  [optional]
**assetNameUpdated** | [**inline**](#AssetNameUpdatedEnum) | An asset was renamed by the user |  [optional]
**assetFormatGenericClassificationUpdated** | [**inline**](#AssetFormatGenericClassificationUpdatedEnum) | A generic classification was changed on a format within an asset |  [optional]
**assetFormatSpecificClassificationUpdated** | [**inline**](#AssetFormatSpecificClassificationUpdatedEnum) | A specific classification was changed on a format within an asset |  [optional]
**assetCreationFailed** | [**inline**](#AssetCreationFailedEnum) |  |  [optional]
**assetTagAdded** | [**inline**](#AssetTagAddedEnum) |  |  [optional]
**assetLinkAdded** | [**inline**](#AssetLinkAddedEnum) |  |  [optional]
**assetLinkGenerated** | [**inline**](#AssetLinkGeneratedEnum) | user generated a link for the asset |  [optional]
**assetLinkDeleted** | [**inline**](#AssetLinkDeletedEnum) |  |  [optional]
**assetTagDeleted** | [**inline**](#AssetTagDeletedEnum) |  |  [optional]
**assetUpdated** | [**inline**](#AssetUpdatedEnum) | This is just a generic string for an asset was updated. |  [optional]
**assetFormatValueEdited** | [**inline**](#AssetFormatValueEditedEnum) | This is a side effect event for a format value getting edited that exists on an asset. |  [optional]
**assetFormatUpdated** | [**inline**](#AssetFormatUpdatedEnum) | This is a generic activity event for an asset getting updated because our format was updated for some reason. |  [optional]
**assetLinkRevoked** | [**inline**](#AssetLinkRevokedEnum) | This means that a shareable link was revoked. |  [optional]
**assetPersonAdded** | [**inline**](#AssetPersonAddedEnum) | This just means that a person was added via the user. |  [optional]
**assetPersonDeleted** | [**inline**](#AssetPersonDeletedEnum) | This just means that a person was deleted via the user. |  [optional]
**assetSensitiveAdded** | [**inline**](#AssetSensitiveAddedEnum) | This just means that a sensitive was added via the user. |  [optional]
**assetSensitiveDeleted** | [**inline**](#AssetSensitiveDeletedEnum) | This just means that a sensitive was deleted via the user. |  [optional]
**suggestedAssetReferenced** | [**inline**](#SuggestedAssetReferencedEnum) | This means that an asset was view/used while the user was looking at the suggestion view. |  [optional]
**searchedAssetReferenced** | [**inline**](#SearchedAssetReferencedEnum) | This means that an asset was view/used while the user was looking at the searching view. |  [optional]
**assetReferenced** | [**inline**](#AssetReferencedEnum) | This means that an asset was view/used while the user was looking at the default view. |  [optional]
**activityAssetReferenced** | [**inline**](#ActivityAssetReferencedEnum) | This means that a user referenced an asset by first clicking on an asset within an activity event.(ie from the activity view) |  [optional]
**assetAnnotationAdded** | [**inline**](#AssetAnnotationAddedEnum) |  |  [optional]
**assetAnnotationDeleted** | [**inline**](#AssetAnnotationDeletedEnum) |  |  [optional]
**assetAnnotationUpdated** | [**inline**](#AssetAnnotationUpdatedEnum) |  |  [optional]
**assetHintAdded** | [**inline**](#AssetHintAddedEnum) |  |  [optional]
**assetHintDeleted** | [**inline**](#AssetHintDeletedEnum) |  |  [optional]
**assetHintUpdated** | [**inline**](#AssetHintUpdatedEnum) |  |  [optional]
**assetAnchorAdded** | [**inline**](#AssetAnchorAddedEnum) |  |  [optional]
**assetAnchorDeleted** | [**inline**](#AssetAnchorDeletedEnum) |  |  [optional]
**assetAnchorUpdated** | [**inline**](#AssetAnchorUpdatedEnum) |  |  [optional]


<a name="AssetCreatedEnum"></a>
## Enum: asset_created
Name | Value
---- | -----
assetCreated | an_asset_was_created


<a name="AssetViewedEnum"></a>
## Enum: asset_viewed
Name | Value
---- | -----
assetViewed | an_asset_was_viewed


<a name="AssetFormatCopiedEnum"></a>
## Enum: asset_format_copied
Name | Value
---- | -----
assetFormatCopied | an_asset_preview_format_was_copied


<a name="AssetFormatDownloadedEnum"></a>
## Enum: asset_format_downloaded
Name | Value
---- | -----
assetFormatDownloaded | an_asset_format_was_downloaded


<a name="AssetDeletedEnum"></a>
## Enum: asset_deleted
Name | Value
---- | -----
assetDeleted | an_asset_was_deleted


<a name="AssetDescriptionUpdatedEnum"></a>
## Enum: asset_description_updated
Name | Value
---- | -----
assetDescriptionUpdated | an_asset_was_redescribed_by_the_user


<a name="AssetNameUpdatedEnum"></a>
## Enum: asset_name_updated
Name | Value
---- | -----
assetNameUpdated | an_asset_was_renamed_by_the_user


<a name="AssetFormatGenericClassificationUpdatedEnum"></a>
## Enum: asset_format_generic_classification_updated
Name | Value
---- | -----
assetFormatGenericClassificationUpdated | a_generic_classification_was_changed_on_a_format_within_an_asset


<a name="AssetFormatSpecificClassificationUpdatedEnum"></a>
## Enum: asset_format_specific_classification_updated
Name | Value
---- | -----
assetFormatSpecificClassificationUpdated | a_specific_classification_was_changed_on_a_format_within_an_asset


<a name="AssetCreationFailedEnum"></a>
## Enum: asset_creation_failed
Name | Value
---- | -----
assetCreationFailed | an_asset_failed_to_be_created


<a name="AssetTagAddedEnum"></a>
## Enum: asset_tag_added
Name | Value
---- | -----
assetTagAdded | a_tag_was_added_by_the_user


<a name="AssetLinkAddedEnum"></a>
## Enum: asset_link_added
Name | Value
---- | -----
assetLinkAdded | a_link_was_added_by_the_user


<a name="AssetLinkGeneratedEnum"></a>
## Enum: asset_link_generated
Name | Value
---- | -----
assetLinkGenerated | an_asset_link_was_generated


<a name="AssetLinkDeletedEnum"></a>
## Enum: asset_link_deleted
Name | Value
---- | -----
assetLinkDeleted | a_link_was_deleted_by_the_user


<a name="AssetTagDeletedEnum"></a>
## Enum: asset_tag_deleted
Name | Value
---- | -----
assetTagDeleted | a_tag_was_deleted_by_the_user


<a name="AssetUpdatedEnum"></a>
## Enum: asset_updated
Name | Value
---- | -----
assetUpdated | an_asset_was_updated


<a name="AssetFormatValueEditedEnum"></a>
## Enum: asset_format_value_edited
Name | Value
---- | -----
assetFormatValueEdited | a_specific_format_value_was_edited_on_an_asset


<a name="AssetFormatUpdatedEnum"></a>
## Enum: asset_format_updated
Name | Value
---- | -----
assetFormatUpdated | a_specific_format_was_updated_on_an_asset


<a name="AssetLinkRevokedEnum"></a>
## Enum: asset_link_revoked
Name | Value
---- | -----
assetLinkRevoked | an_asset_link_was_revoked


<a name="AssetPersonAddedEnum"></a>
## Enum: asset_person_added
Name | Value
---- | -----
assetPersonAdded | a_person_was_added_by_the_user


<a name="AssetPersonDeletedEnum"></a>
## Enum: asset_person_deleted
Name | Value
---- | -----
assetPersonDeleted | a_person_was_deleted_by_the_user


<a name="AssetSensitiveAddedEnum"></a>
## Enum: asset_sensitive_added
Name | Value
---- | -----
assetSensitiveAdded | a_sensitive_was_added_by_the_user


<a name="AssetSensitiveDeletedEnum"></a>
## Enum: asset_sensitive_deleted
Name | Value
---- | -----
assetSensitiveDeleted | a_sensitive_was_deleted_by_the_user


<a name="SuggestedAssetReferencedEnum"></a>
## Enum: suggested_asset_referenced
Name | Value
---- | -----
suggestedAssetReferenced | a_suggested_asset_was_referenced_by_the_user


<a name="SearchedAssetReferencedEnum"></a>
## Enum: searched_asset_referenced
Name | Value
---- | -----
searchedAssetReferenced | a_searched_asset_was_referenced_by_the_user


<a name="AssetReferencedEnum"></a>
## Enum: asset_referenced
Name | Value
---- | -----
assetReferenced | an_asset_was_referenced_by_the_user


<a name="ActivityAssetReferencedEnum"></a>
## Enum: activity_asset_referenced
Name | Value
---- | -----
activityAssetReferenced | an_activity_asset_was_referenced_by_the_user


<a name="AssetAnnotationAddedEnum"></a>
## Enum: asset_annotation_added
Name | Value
---- | -----
assetAnnotationAdded | an_annotation_was_added_by_the_user


<a name="AssetAnnotationDeletedEnum"></a>
## Enum: asset_annotation_deleted
Name | Value
---- | -----
assetAnnotationDeleted | an_annotation_was_deleted_by_the_user


<a name="AssetAnnotationUpdatedEnum"></a>
## Enum: asset_annotation_updated
Name | Value
---- | -----
assetAnnotationUpdated | an_annotation_was_updated_by_the_user


<a name="AssetHintAddedEnum"></a>
## Enum: asset_hint_added
Name | Value
---- | -----
assetHintAdded | a_hint_was_added_by_the_user


<a name="AssetHintDeletedEnum"></a>
## Enum: asset_hint_deleted
Name | Value
---- | -----
assetHintDeleted | a_hint_was_deleted_by_the_user


<a name="AssetHintUpdatedEnum"></a>
## Enum: asset_hint_updated
Name | Value
---- | -----
assetHintUpdated | a_hint_was_updated_by_the_user


<a name="AssetAnchorAddedEnum"></a>
## Enum: asset_anchor_added
Name | Value
---- | -----
assetAnchorAdded | a_anchor_was_added_by_the_user


<a name="AssetAnchorDeletedEnum"></a>
## Enum: asset_anchor_deleted
Name | Value
---- | -----
assetAnchorDeleted | a_anchor_was_deleted_by_the_user


<a name="AssetAnchorUpdatedEnum"></a>
## Enum: asset_anchor_updated
Name | Value
---- | -----
assetAnchorUpdated | a_anchor_was_updated_by_the_user



