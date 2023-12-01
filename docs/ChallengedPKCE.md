
# ChallengedPKCE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state** | [**java.util.UUID**](java.util.UUID.md) | An opaque value the clients adds to the initial request that Auth0 includes when redirecting the back to the client. This value must be used by the client to prevent CSRF attacks. | 
**nonce** | [**java.util.UUID**](java.util.UUID.md) | A local key that is held as the comparator to state, thus they should be the same. | 
**challenge** | **kotlin.String** | Generated challenge from the code_verifier. | 
**method** | [**inline**](#MethodEnum) | Method used to generate the challenge. The PKCE spec defines two methods, S256 and plain, however, Auth0 supports only S256 since the latter is discouraged. | 
**verifier** | **kotlin.String** | Cryptographically random key that was used to generate the code_challenge passed to /authorize. | 
**schema** | [**EmbeddedModelSchema**](EmbeddedModelSchema.md) |  |  [optional]


<a name="MethodEnum"></a>
## Enum: method
Name | Value
---- | -----
method | S256



