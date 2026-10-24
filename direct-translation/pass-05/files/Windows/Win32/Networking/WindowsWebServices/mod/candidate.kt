// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webauthn.dll, ABI=system, export=WebAuthNAuthenticatorGetAssertion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WebAuthNAuthenticatorGetAssertion`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pwszrpid` : `windows_sys`.`core`.`PCWSTR`, `pwebauthnclientdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`WEBAUTHN_CLIENT_DATA`>?, `pwebauthngetassertionoptions` : /* Rust *const */ kotlinx.cinterop.CPointer<`WEBAUTHN_AUTHENTICATOR_GET_ASSERTION_OPTIONS`>?, `ppwebauthnassertion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WEBAUTHN_ASSERTION`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webauthn.dll, ABI=system, export=WebAuthNAuthenticatorMakeCredential; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WebAuthNAuthenticatorMakeCredential`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `prpinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`WEBAUTHN_RP_ENTITY_INFORMATION`>?, `puserinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`WEBAUTHN_USER_ENTITY_INFORMATION`>?, `ppubkeycredparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`WEBAUTHN_COSE_CREDENTIAL_PARAMETERS`>?, `pwebauthnclientdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`WEBAUTHN_CLIENT_DATA`>?, `pwebauthnmakecredentialoptions` : /* Rust *const */ kotlinx.cinterop.CPointer<`WEBAUTHN_AUTHENTICATOR_MAKE_CREDENTIAL_OPTIONS`>?, `ppwebauthncredentialattestation` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WEBAUTHN_CREDENTIAL_ATTESTATION`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webauthn.dll, ABI=system, export=WebAuthNCancelCurrentOperation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WebAuthNCancelCurrentOperation`(`pcancellationid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webauthn.dll, ABI=system, export=WebAuthNDeletePlatformCredential; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WebAuthNDeletePlatformCredential`(`cbcredentialid` : UInt, `pbcredentialid` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webauthn.dll, ABI=system, export=WebAuthNFreeAssertion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WebAuthNFreeAssertion`(`pwebauthnassertion` : /* Rust *const */ kotlinx.cinterop.CPointer<`WEBAUTHN_ASSERTION`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webauthn.dll, ABI=system, export=WebAuthNFreeCredentialAttestation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WebAuthNFreeCredentialAttestation`(`pwebauthncredentialattestation` : /* Rust *const */ kotlinx.cinterop.CPointer<`WEBAUTHN_CREDENTIAL_ATTESTATION`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webauthn.dll, ABI=system, export=WebAuthNFreePlatformCredentialList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WebAuthNFreePlatformCredentialList`(`pcredentialdetailslist` : /* Rust *const */ kotlinx.cinterop.CPointer<`WEBAUTHN_CREDENTIAL_DETAILS_LIST`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webauthn.dll, ABI=system, export=WebAuthNGetApiVersionNumber; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WebAuthNGetApiVersionNumber`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webauthn.dll, ABI=system, export=WebAuthNGetCancellationId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WebAuthNGetCancellationId`(`pcancellationid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webauthn.dll, ABI=system, export=WebAuthNGetErrorName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WebAuthNGetErrorName`(`hr` : `windows_sys`.`core`.`HRESULT`) : `windows_sys`.`core`.`PCWSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webauthn.dll, ABI=system, export=WebAuthNGetPlatformCredentialList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WebAuthNGetPlatformCredentialList`(`pgetcredentialsoptions` : /* Rust *const */ kotlinx.cinterop.CPointer<`WEBAUTHN_GET_CREDENTIALS_OPTIONS`>?, `ppcredentialdetailslist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WEBAUTHN_CREDENTIAL_DETAILS_LIST`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webauthn.dll, ABI=system, export=WebAuthNGetW3CExceptionDOMError; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WebAuthNGetW3CExceptionDOMError`(`hr` : `windows_sys`.`core`.`HRESULT`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webauthn.dll, ABI=system, export=WebAuthNIsUserVerifyingPlatformAuthenticatorAvailable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WebAuthNIsUserVerifyingPlatformAuthenticatorAvailable`(`pbisuserverifyingplatformauthenticatoravailable` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsAbandonCall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsAbandonCall`(`serviceproxy` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_SERVICE_PROXY`>?, `callid` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsAbandonMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsAbandonMessage`(`channel` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_CHANNEL`>?, `message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsAbortChannel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsAbortChannel`(`channel` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_CHANNEL`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsAbortListener; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsAbortListener`(`listener` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_LISTENER`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsAbortServiceHost; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsAbortServiceHost`(`servicehost` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_SERVICE_HOST`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsAbortServiceProxy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsAbortServiceProxy`(`serviceproxy` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_SERVICE_PROXY`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsAcceptChannel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsAcceptChannel`(`listener` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_LISTENER`>?, `channel` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_CHANNEL`>?, `asynccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsAddCustomHeader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsAddCustomHeader`(`message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `headerdescription` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ELEMENT_DESCRIPTION`>?, `writeoption` : `WS_WRITE_OPTION`, `value` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `headerattributes` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsAddErrorString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsAddErrorString`(`error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?, `string` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_STRING`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsAddMappedHeader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsAddMappedHeader`(`message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `headername` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `valuetype` : `WS_TYPE`, `writeoption` : `WS_WRITE_OPTION`, `value` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsAddressMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsAddressMessage`(`message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `address` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ENDPOINT_ADDRESS`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsAlloc`(`heap` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP`>?, `size` : ULong, `ptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsAsyncExecute; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsAsyncExecute`(`asyncstate` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_STATE`>?, `operation` : `WS_ASYNC_FUNCTION`, `callbackmodel` : `WS_CALLBACK_MODEL`, `callbackstate` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `asynccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsCall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsCall`(`serviceproxy` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_SERVICE_PROXY`>?, `operation` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_OPERATION_DESCRIPTION`>?, `arguments` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `heap` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP`>?, `callproperties` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_CALL_PROPERTY`>?, `callpropertycount` : UInt, `asynccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsCheckMustUnderstandHeaders; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsCheckMustUnderstandHeaders`(`message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsCloseChannel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsCloseChannel`(`channel` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_CHANNEL`>?, `asynccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsCloseListener; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsCloseListener`(`listener` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_LISTENER`>?, `asynccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsCloseServiceHost; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsCloseServiceHost`(`servicehost` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_SERVICE_HOST`>?, `asynccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsCloseServiceProxy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsCloseServiceProxy`(`serviceproxy` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_SERVICE_PROXY`>?, `asynccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsCombineUrl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsCombineUrl`(`baseurl` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_STRING`>?, `referenceurl` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_STRING`>?, `flags` : UInt, `heap` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP`>?, `resulturl` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_STRING`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsCopyError; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsCopyError`(`source` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?, `destination` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsCopyNode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsCopyNode`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsCreateChannel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsCreateChannel`(`channeltype` : `WS_CHANNEL_TYPE`, `channelbinding` : `WS_CHANNEL_BINDING`, `properties` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_CHANNEL_PROPERTY`>?, `propertycount` : UInt, `securitydescription` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_SECURITY_DESCRIPTION`>?, `channel` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_CHANNEL`>>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsCreateChannelForListener; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsCreateChannelForListener`(`listener` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_LISTENER`>?, `properties` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_CHANNEL_PROPERTY`>?, `propertycount` : UInt, `channel` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_CHANNEL`>>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsCreateError; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsCreateError`(`properties` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR_PROPERTY`>?, `propertycount` : UInt, `error` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_ERROR`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsCreateFaultFromError; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsCreateFaultFromError`(`error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?, `faulterrorcode` : `windows_sys`.`core`.`HRESULT`, `faultdisclosure` : `WS_FAULT_DISCLOSURE`, `heap` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP`>?, `fault` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_FAULT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsCreateHeap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsCreateHeap`(`maxsize` : ULong, `trimsize` : ULong, `properties` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP_PROPERTY`>?, `propertycount` : UInt, `heap` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_HEAP`>>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsCreateListener; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsCreateListener`(`channeltype` : `WS_CHANNEL_TYPE`, `channelbinding` : `WS_CHANNEL_BINDING`, `properties` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_LISTENER_PROPERTY`>?, `propertycount` : UInt, `securitydescription` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_SECURITY_DESCRIPTION`>?, `listener` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_LISTENER`>>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsCreateMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsCreateMessage`(`envelopeversion` : `WS_ENVELOPE_VERSION`, `addressingversion` : `WS_ADDRESSING_VERSION`, `properties` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE_PROPERTY`>?, `propertycount` : UInt, `message` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_MESSAGE`>>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsCreateMessageForChannel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsCreateMessageForChannel`(`channel` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_CHANNEL`>?, `properties` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE_PROPERTY`>?, `propertycount` : UInt, `message` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_MESSAGE`>>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsCreateMetadata; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsCreateMetadata`(`properties` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_METADATA_PROPERTY`>?, `propertycount` : UInt, `metadata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_METADATA`>>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsCreateReader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsCreateReader`(`properties` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER_PROPERTY`>?, `propertycount` : UInt, `reader` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_XML_READER`>>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsCreateServiceEndpointFromTemplate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsCreateServiceEndpointFromTemplate`(`channeltype` : `WS_CHANNEL_TYPE`, `properties` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_SERVICE_ENDPOINT_PROPERTY`>?, `propertycount` : UInt, `addressurl` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_STRING`>?, `contract` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_SERVICE_CONTRACT`>?, `authorizationcallback` : `WS_SERVICE_SECURITY_CALLBACK`, `heap` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP`>?, `templatetype` : `WS_BINDING_TEMPLATE_TYPE`, `templatevalue` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `templatesize` : UInt, `templatedescription` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `templatedescriptionsize` : UInt, `serviceendpoint` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_SERVICE_ENDPOINT`>>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsCreateServiceHost; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsCreateServiceHost`(`endpoints` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_SERVICE_ENDPOINT`>>?, `endpointcount` : UShort, `serviceproperties` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_SERVICE_PROPERTY`>?, `servicepropertycount` : UInt, `servicehost` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_SERVICE_HOST`>>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsCreateServiceProxy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsCreateServiceProxy`(`channeltype` : `WS_CHANNEL_TYPE`, `channelbinding` : `WS_CHANNEL_BINDING`, `securitydescription` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_SECURITY_DESCRIPTION`>?, `properties` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_PROXY_PROPERTY`>?, `propertycount` : UInt, `channelproperties` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_CHANNEL_PROPERTY`>?, `channelpropertycount` : UInt, `serviceproxy` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_SERVICE_PROXY`>>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsCreateServiceProxyFromTemplate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsCreateServiceProxyFromTemplate`(`channeltype` : `WS_CHANNEL_TYPE`, `properties` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_PROXY_PROPERTY`>?, `propertycount` : UInt, `templatetype` : `WS_BINDING_TEMPLATE_TYPE`, `templatevalue` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `templatesize` : UInt, `templatedescription` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `templatedescriptionsize` : UInt, `serviceproxy` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_SERVICE_PROXY`>>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsCreateWriter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsCreateWriter`(`properties` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER_PROPERTY`>?, `propertycount` : UInt, `writer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_XML_WRITER`>>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsCreateXmlBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsCreateXmlBuffer`(`heap` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP`>?, `properties` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_BUFFER_PROPERTY`>?, `propertycount` : UInt, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_XML_BUFFER`>>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsCreateXmlSecurityToken; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsCreateXmlSecurityToken`(`tokenxml` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_BUFFER`>?, `tokenkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_SECURITY_KEY_HANDLE`>?, `properties` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_SECURITY_TOKEN_PROPERTY`>?, `propertycount` : UInt, `token` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_SECURITY_TOKEN`>>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsDateTimeToFileTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsDateTimeToFileTime`(`datetime` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_DATETIME`>?, `filetime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsDecodeUrl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsDecodeUrl`(`url` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_STRING`>?, `flags` : UInt, `heap` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP`>?, `outurl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_URL`>>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsEncodeUrl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsEncodeUrl`(`url` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_URL`>?, `flags` : UInt, `heap` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP`>?, `outurl` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_STRING`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsEndReaderCanonicalization; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsEndReaderCanonicalization`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsEndWriterCanonicalization; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsEndWriterCanonicalization`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsFileTimeToDateTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsFileTimeToDateTime`(`filetime` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?, `datetime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_DATETIME`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsFillBody; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsFillBody`(`message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `minsize` : UInt, `asynccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsFillReader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsFillReader`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `minsize` : UInt, `asynccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsFindAttribute; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsFindAttribute`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `localname` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `ns` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `required` : `windows_sys`.`core`.`BOOL`, `attributeindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsFlushBody; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsFlushBody`(`message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `minsize` : UInt, `asynccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsFlushWriter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsFlushWriter`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `minsize` : UInt, `asynccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsFreeChannel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsFreeChannel`(`channel` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_CHANNEL`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsFreeError; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsFreeError`(`error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsFreeHeap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsFreeHeap`(`heap` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsFreeListener; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsFreeListener`(`listener` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_LISTENER`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsFreeMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsFreeMessage`(`message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsFreeMetadata; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsFreeMetadata`(`metadata` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_METADATA`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsFreeReader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsFreeReader`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsFreeSecurityToken; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsFreeSecurityToken`(`token` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_SECURITY_TOKEN`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsFreeServiceHost; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsFreeServiceHost`(`servicehost` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_SERVICE_HOST`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsFreeServiceProxy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsFreeServiceProxy`(`serviceproxy` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_SERVICE_PROXY`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsFreeWriter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsFreeWriter`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsGetChannelProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsGetChannelProperty`(`channel` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_CHANNEL`>?, `id` : `WS_CHANNEL_PROPERTY_ID`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsGetCustomHeader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsGetCustomHeader`(`message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `customheaderdescription` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ELEMENT_DESCRIPTION`>?, `repeatingoption` : `WS_REPEATING_HEADER_OPTION`, `headerindex` : UInt, `readoption` : `WS_READ_OPTION`, `heap` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP`>?, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `headerattributes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsGetDictionary; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsGetDictionary`(`encoding` : `WS_ENCODING`, `dictionary` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_XML_DICTIONARY`>>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsGetErrorProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsGetErrorProperty`(`error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?, `id` : `WS_ERROR_PROPERTY_ID`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffersize` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsGetErrorString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsGetErrorString`(`error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?, `index` : UInt, `string` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_STRING`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsGetFaultErrorDetail; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsGetFaultErrorDetail`(`error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?, `faultdetaildescription` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_FAULT_DETAIL_DESCRIPTION`>?, `readoption` : `WS_READ_OPTION`, `heap` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP`>?, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsGetFaultErrorProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsGetFaultErrorProperty`(`error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?, `id` : `WS_FAULT_ERROR_PROPERTY_ID`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffersize` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsGetHeader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsGetHeader`(`message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `headertype` : `WS_HEADER_TYPE`, `valuetype` : `WS_TYPE`, `readoption` : `WS_READ_OPTION`, `heap` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP`>?, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsGetHeaderAttributes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsGetHeaderAttributes`(`message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `headerattributes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsGetHeapProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsGetHeapProperty`(`heap` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP`>?, `id` : `WS_HEAP_PROPERTY_ID`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsGetListenerProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsGetListenerProperty`(`listener` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_LISTENER`>?, `id` : `WS_LISTENER_PROPERTY_ID`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsGetMappedHeader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsGetMappedHeader`(`message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `headername` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `repeatingoption` : `WS_REPEATING_HEADER_OPTION`, `headerindex` : UInt, `valuetype` : `WS_TYPE`, `readoption` : `WS_READ_OPTION`, `heap` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP`>?, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsGetMessageProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsGetMessageProperty`(`message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `id` : `WS_MESSAGE_PROPERTY_ID`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsGetMetadataEndpoints; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsGetMetadataEndpoints`(`metadata` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_METADATA`>?, `endpoints` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_METADATA_ENDPOINTS`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsGetMetadataProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsGetMetadataProperty`(`metadata` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_METADATA`>?, `id` : `WS_METADATA_PROPERTY_ID`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsGetMissingMetadataDocumentAddress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsGetMissingMetadataDocumentAddress`(`metadata` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_METADATA`>?, `address` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_ENDPOINT_ADDRESS`>>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsGetNamespaceFromPrefix; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsGetNamespaceFromPrefix`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `prefix` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `required` : `windows_sys`.`core`.`BOOL`, `ns` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_XML_STRING`>>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsGetOperationContextProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsGetOperationContextProperty`(`context` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_OPERATION_CONTEXT`>?, `id` : `WS_OPERATION_CONTEXT_PROPERTY_ID`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsGetPolicyAlternativeCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsGetPolicyAlternativeCount`(`policy` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_POLICY`>?, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsGetPolicyProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsGetPolicyProperty`(`policy` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_POLICY`>?, `id` : `WS_POLICY_PROPERTY_ID`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsGetPrefixFromNamespace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsGetPrefixFromNamespace`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `ns` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `required` : `windows_sys`.`core`.`BOOL`, `prefix` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_XML_STRING`>>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsGetReaderNode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsGetReaderNode`(`xmlreader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `node` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_XML_NODE`>>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsGetReaderPosition; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsGetReaderPosition`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `nodeposition` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_NODE_POSITION`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsGetReaderProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsGetReaderProperty`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `id` : `WS_XML_READER_PROPERTY_ID`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsGetSecurityContextProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsGetSecurityContextProperty`(`securitycontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_SECURITY_CONTEXT`>?, `id` : `WS_SECURITY_CONTEXT_PROPERTY_ID`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsGetSecurityTokenProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsGetSecurityTokenProperty`(`securitytoken` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_SECURITY_TOKEN`>?, `id` : `WS_SECURITY_TOKEN_PROPERTY_ID`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `heap` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsGetServiceHostProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsGetServiceHostProperty`(`servicehost` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_SERVICE_HOST`>?, `id` : `WS_SERVICE_PROPERTY_ID`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsGetServiceProxyProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsGetServiceProxyProperty`(`serviceproxy` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_SERVICE_PROXY`>?, `id` : `WS_PROXY_PROPERTY_ID`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsGetWriterPosition; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsGetWriterPosition`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `nodeposition` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_NODE_POSITION`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsGetWriterProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsGetWriterProperty`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `id` : `WS_XML_WRITER_PROPERTY_ID`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsGetXmlAttribute; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsGetXmlAttribute`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `localname` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `heap` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP`>?, `valuechars` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>?, `valuecharcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsInitializeMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsInitializeMessage`(`message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `initialization` : `WS_MESSAGE_INITIALIZATION`, `sourcemessage` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsMarkHeaderAsUnderstood; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsMarkHeaderAsUnderstood`(`message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `headerposition` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_NODE_POSITION`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsMatchPolicyAlternative; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsMatchPolicyAlternative`(`policy` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_POLICY`>?, `alternativeindex` : UInt, `policyconstraints` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_POLICY_CONSTRAINTS`>?, `matchrequired` : `windows_sys`.`core`.`BOOL`, `heap` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsMoveReader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsMoveReader`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `moveto` : `WS_MOVE_TO`, `found` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsMoveWriter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsMoveWriter`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `moveto` : `WS_MOVE_TO`, `found` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsOpenChannel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsOpenChannel`(`channel` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_CHANNEL`>?, `endpointaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ENDPOINT_ADDRESS`>?, `asynccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsOpenListener; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsOpenListener`(`listener` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_LISTENER`>?, `url` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_STRING`>?, `asynccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsOpenServiceHost; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsOpenServiceHost`(`servicehost` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_SERVICE_HOST`>?, `asynccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsOpenServiceProxy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsOpenServiceProxy`(`serviceproxy` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_SERVICE_PROXY`>?, `address` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ENDPOINT_ADDRESS`>?, `asynccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsPullBytes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsPullBytes`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `callback` : `WS_PULL_BYTES_CALLBACK`, `callbackstate` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsPushBytes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsPushBytes`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `callback` : `WS_PUSH_BYTES_CALLBACK`, `callbackstate` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsReadArray; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsReadArray`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `localname` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `ns` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `valuetype` : `WS_VALUE_TYPE`, `array` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `arraysize` : UInt, `itemoffset` : UInt, `itemcount` : UInt, `actualitemcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsReadAttribute; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsReadAttribute`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `attributedescription` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ATTRIBUTE_DESCRIPTION`>?, `readoption` : `WS_READ_OPTION`, `heap` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP`>?, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsReadBody; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsReadBody`(`message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `bodydescription` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ELEMENT_DESCRIPTION`>?, `readoption` : `WS_READ_OPTION`, `heap` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP`>?, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsReadBytes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsReadBytes`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `bytes` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `maxbytecount` : UInt, `actualbytecount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsReadChars; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsReadChars`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `chars` : `windows_sys`.`core`.`PWSTR`, `maxcharcount` : UInt, `actualcharcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsReadCharsUtf8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsReadCharsUtf8`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `bytes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `maxbytecount` : UInt, `actualbytecount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsReadElement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsReadElement`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `elementdescription` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ELEMENT_DESCRIPTION`>?, `readoption` : `WS_READ_OPTION`, `heap` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP`>?, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsReadEndAttribute; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsReadEndAttribute`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsReadEndElement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsReadEndElement`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsReadEndpointAddressExtension; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsReadEndpointAddressExtension`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `endpointaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ENDPOINT_ADDRESS`>?, `extensiontype` : `WS_ENDPOINT_ADDRESS_EXTENSION_TYPE`, `readoption` : `WS_READ_OPTION`, `heap` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP`>?, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsReadEnvelopeEnd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsReadEnvelopeEnd`(`message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsReadEnvelopeStart; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsReadEnvelopeStart`(`message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `donecallback` : `WS_MESSAGE_DONE_CALLBACK`, `donecallbackstate` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsReadMessageEnd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsReadMessageEnd`(`channel` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_CHANNEL`>?, `message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `asynccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsReadMessageStart; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsReadMessageStart`(`channel` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_CHANNEL`>?, `message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `asynccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsReadMetadata; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsReadMetadata`(`metadata` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_METADATA`>?, `reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `url` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_STRING`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsReadNode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsReadNode`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsReadQualifiedName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsReadQualifiedName`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `heap` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP`>?, `prefix` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `localname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `ns` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsReadStartAttribute; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsReadStartAttribute`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `attributeindex` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsReadStartElement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsReadStartElement`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsReadToStartElement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsReadToStartElement`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `localname` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `ns` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `found` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsReadType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsReadType`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `typemapping` : `WS_TYPE_MAPPING`, `type` : `WS_TYPE`, `typedescription` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `readoption` : `WS_READ_OPTION`, `heap` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP`>?, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsReadValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsReadValue`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `valuetype` : `WS_VALUE_TYPE`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsReadXmlBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsReadXmlBuffer`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `heap` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP`>?, `xmlbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_XML_BUFFER`>>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsReadXmlBufferFromBytes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsReadXmlBufferFromBytes`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `encoding` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER_ENCODING`>?, `properties` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER_PROPERTY`>?, `propertycount` : UInt, `bytes` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bytecount` : UInt, `heap` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP`>?, `xmlbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_XML_BUFFER`>>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsReceiveMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsReceiveMessage`(`channel` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_CHANNEL`>?, `message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `messagedescriptions` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_MESSAGE_DESCRIPTION`>>?, `messagedescriptioncount` : UInt, `receiveoption` : `WS_RECEIVE_OPTION`, `readbodyoption` : `WS_READ_OPTION`, `heap` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP`>?, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `index` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `asynccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsRegisterOperationForCancel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsRegisterOperationForCancel`(`context` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_OPERATION_CONTEXT`>?, `cancelcallback` : `WS_OPERATION_CANCEL_CALLBACK`, `freestatecallback` : `WS_OPERATION_FREE_STATE_CALLBACK`, `userstate` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsRemoveCustomHeader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsRemoveCustomHeader`(`message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `headername` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `headerns` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsRemoveHeader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsRemoveHeader`(`message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `headertype` : `WS_HEADER_TYPE`, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsRemoveMappedHeader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsRemoveMappedHeader`(`message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `headername` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsRemoveNode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsRemoveNode`(`nodeposition` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_NODE_POSITION`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsRequestReply; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsRequestReply`(`channel` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_CHANNEL`>?, `requestmessage` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `requestmessagedescription` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE_DESCRIPTION`>?, `writeoption` : `WS_WRITE_OPTION`, `requestbodyvalue` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `requestbodyvaluesize` : UInt, `replymessage` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `replymessagedescription` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE_DESCRIPTION`>?, `readoption` : `WS_READ_OPTION`, `heap` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP`>?, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `asynccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsRequestSecurityToken; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsRequestSecurityToken`(`channel` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_CHANNEL`>?, `properties` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_REQUEST_SECURITY_TOKEN_PROPERTY`>?, `propertycount` : UInt, `token` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_SECURITY_TOKEN`>>?, `asynccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsResetChannel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsResetChannel`(`channel` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_CHANNEL`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsResetError; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsResetError`(`error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsResetHeap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsResetHeap`(`heap` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsResetListener; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsResetListener`(`listener` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_LISTENER`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsResetMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsResetMessage`(`message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsResetMetadata; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsResetMetadata`(`metadata` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_METADATA`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsResetServiceHost; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsResetServiceHost`(`servicehost` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_SERVICE_HOST`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsResetServiceProxy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsResetServiceProxy`(`serviceproxy` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_SERVICE_PROXY`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsRevokeSecurityContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsRevokeSecurityContext`(`securitycontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_SECURITY_CONTEXT`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsSendFaultMessageForError; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsSendFaultMessageForError`(`channel` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_CHANNEL`>?, `replymessage` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `faulterror` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?, `faulterrorcode` : `windows_sys`.`core`.`HRESULT`, `faultdisclosure` : `WS_FAULT_DISCLOSURE`, `requestmessage` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `asynccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsSendMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsSendMessage`(`channel` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_CHANNEL`>?, `message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `messagedescription` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE_DESCRIPTION`>?, `writeoption` : `WS_WRITE_OPTION`, `bodyvalue` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bodyvaluesize` : UInt, `asynccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsSendReplyMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsSendReplyMessage`(`channel` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_CHANNEL`>?, `replymessage` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `replymessagedescription` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE_DESCRIPTION`>?, `writeoption` : `WS_WRITE_OPTION`, `replybodyvalue` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `replybodyvaluesize` : UInt, `requestmessage` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `asynccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsSetChannelProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsSetChannelProperty`(`channel` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_CHANNEL`>?, `id` : `WS_CHANNEL_PROPERTY_ID`, `value` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsSetErrorProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsSetErrorProperty`(`error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?, `id` : `WS_ERROR_PROPERTY_ID`, `value` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsSetFaultErrorDetail; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsSetFaultErrorDetail`(`error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?, `faultdetaildescription` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_FAULT_DETAIL_DESCRIPTION`>?, `writeoption` : `WS_WRITE_OPTION`, `value` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsSetFaultErrorProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsSetFaultErrorProperty`(`error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?, `id` : `WS_FAULT_ERROR_PROPERTY_ID`, `value` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsSetHeader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsSetHeader`(`message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `headertype` : `WS_HEADER_TYPE`, `valuetype` : `WS_TYPE`, `writeoption` : `WS_WRITE_OPTION`, `value` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsSetInput; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsSetInput`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `encoding` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER_ENCODING`>?, `input` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER_INPUT`>?, `properties` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER_PROPERTY`>?, `propertycount` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsSetInputToBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsSetInputToBuffer`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_BUFFER`>?, `properties` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER_PROPERTY`>?, `propertycount` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsSetListenerProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsSetListenerProperty`(`listener` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_LISTENER`>?, `id` : `WS_LISTENER_PROPERTY_ID`, `value` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsSetMessageProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsSetMessageProperty`(`message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `id` : `WS_MESSAGE_PROPERTY_ID`, `value` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsSetOutput; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsSetOutput`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `encoding` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER_ENCODING`>?, `output` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER_OUTPUT`>?, `properties` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER_PROPERTY`>?, `propertycount` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsSetOutputToBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsSetOutputToBuffer`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_BUFFER`>?, `properties` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER_PROPERTY`>?, `propertycount` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsSetReaderPosition; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsSetReaderPosition`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `nodeposition` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_NODE_POSITION`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsSetWriterPosition; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsSetWriterPosition`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `nodeposition` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_NODE_POSITION`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsShutdownSessionChannel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsShutdownSessionChannel`(`channel` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_CHANNEL`>?, `asynccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsSkipNode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsSkipNode`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsStartReaderCanonicalization; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsStartReaderCanonicalization`(`reader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `writecallback` : `WS_WRITE_CALLBACK`, `writecallbackstate` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `properties` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_CANONICALIZATION_PROPERTY`>?, `propertycount` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsStartWriterCanonicalization; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsStartWriterCanonicalization`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `writecallback` : `WS_WRITE_CALLBACK`, `writecallbackstate` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `properties` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_CANONICALIZATION_PROPERTY`>?, `propertycount` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsTrimXmlWhitespace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsTrimXmlWhitespace`(`chars` : `windows_sys`.`core`.`PCWSTR`, `charcount` : UInt, `trimmedchars` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>?, `trimmedcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsVerifyXmlNCName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsVerifyXmlNCName`(`ncnamechars` : `windows_sys`.`core`.`PCWSTR`, `ncnamecharcount` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsWriteArray; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsWriteArray`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `localname` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `ns` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `valuetype` : `WS_VALUE_TYPE`, `array` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `arraysize` : UInt, `itemoffset` : UInt, `itemcount` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsWriteAttribute; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsWriteAttribute`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `attributedescription` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ATTRIBUTE_DESCRIPTION`>?, `writeoption` : `WS_WRITE_OPTION`, `value` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsWriteBody; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsWriteBody`(`message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `bodydescription` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ELEMENT_DESCRIPTION`>?, `writeoption` : `WS_WRITE_OPTION`, `value` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsWriteBytes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsWriteBytes`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `bytes` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bytecount` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsWriteChars; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsWriteChars`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `chars` : `windows_sys`.`core`.`PCWSTR`, `charcount` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsWriteCharsUtf8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsWriteCharsUtf8`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `bytes` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `bytecount` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsWriteElement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsWriteElement`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `elementdescription` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ELEMENT_DESCRIPTION`>?, `writeoption` : `WS_WRITE_OPTION`, `value` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsWriteEndAttribute; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsWriteEndAttribute`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsWriteEndCData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsWriteEndCData`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsWriteEndElement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsWriteEndElement`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsWriteEndStartElement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsWriteEndStartElement`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsWriteEnvelopeEnd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsWriteEnvelopeEnd`(`message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsWriteEnvelopeStart; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsWriteEnvelopeStart`(`message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `donecallback` : `WS_MESSAGE_DONE_CALLBACK`, `donecallbackstate` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsWriteMessageEnd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsWriteMessageEnd`(`channel` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_CHANNEL`>?, `message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `asynccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsWriteMessageStart; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsWriteMessageStart`(`channel` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_CHANNEL`>?, `message` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, `asynccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsWriteNode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsWriteNode`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `node` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_NODE`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsWriteQualifiedName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsWriteQualifiedName`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `prefix` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `localname` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `ns` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsWriteStartAttribute; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsWriteStartAttribute`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `prefix` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `localname` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `ns` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `singlequote` : `windows_sys`.`core`.`BOOL`, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsWriteStartCData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsWriteStartCData`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsWriteStartElement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsWriteStartElement`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `prefix` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `localname` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `ns` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsWriteText; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsWriteText`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `text` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_TEXT`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsWriteType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsWriteType`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `typemapping` : `WS_TYPE_MAPPING`, `type` : `WS_TYPE`, `typedescription` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `writeoption` : `WS_WRITE_OPTION`, `value` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsWriteValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsWriteValue`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `valuetype` : `WS_VALUE_TYPE`, `value` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `valuesize` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsWriteXmlBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsWriteXmlBuffer`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `xmlbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_BUFFER`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsWriteXmlBufferToBytes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsWriteXmlBufferToBytes`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `xmlbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_BUFFER`>?, `encoding` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER_ENCODING`>?, `properties` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER_PROPERTY`>?, `propertycount` : UInt, `heap` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP`>?, `bytes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `bytecount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsWriteXmlnsAttribute; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsWriteXmlnsAttribute`(`writer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `prefix` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `ns` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `singlequote` : `windows_sys`.`core`.`BOOL`, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=webservices.dll, ABI=system, export=WsXmlStringEquals; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WsXmlStringEquals`(`string1` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `string2` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CTAPCBOR_HYBRID_STORAGE_LINKED_DATA` (
    public var `dwVersion`: UInt,
    public var `cbContactId`: UInt,
    public var `pbContactId`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbLinkId`: UInt,
    public var `pbLinkId`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbLinkSecret`: UInt,
    public var `pbLinkSecret`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbPublicKey`: UInt,
    public var `pbPublicKey`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `pwszAuthenticatorName`: `windows_sys`.`core`.`PCWSTR`,
    public var `wEncodedTunnelServerDomain`: UShort,
)
// UNSUPPORTED Rust 222:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CTAPCBOR_HYBRID_STORAGE_LINKED_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CTAPCBOR_HYBRID_STORAGE_LINKED_DATA_CURRENT_VERSION`: UInt = 1u;
public const val `CTAPCBOR_HYBRID_STORAGE_LINKED_DATA_VERSION_1`: UInt = 1u;
public const val `WEBAUTHN_API_CURRENT_VERSION`: UInt = 7u;
public const val `WEBAUTHN_API_VERSION_1`: UInt = 1u;
public const val `WEBAUTHN_API_VERSION_2`: UInt = 2u;
public const val `WEBAUTHN_API_VERSION_3`: UInt = 3u;
public const val `WEBAUTHN_API_VERSION_4`: UInt = 4u;
public const val `WEBAUTHN_API_VERSION_5`: UInt = 5u;
public const val `WEBAUTHN_API_VERSION_6`: UInt = 6u;
public const val `WEBAUTHN_API_VERSION_7`: UInt = 7u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WEBAUTHN_ASSERTION` (
    public var `dwVersion`: UInt,
    public var `cbAuthenticatorData`: UInt,
    public var `pbAuthenticatorData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbSignature`: UInt,
    public var `pbSignature`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `Credential`: `WEBAUTHN_CREDENTIAL`,
    public var `cbUserId`: UInt,
    public var `pbUserId`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `Extensions`: `WEBAUTHN_EXTENSIONS`,
    public var `cbCredLargeBlob`: UInt,
    public var `pbCredLargeBlob`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `dwCredLargeBlobStatus`: UInt,
    public var `pHmacSecret`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WEBAUTHN_HMAC_SECRET_SALT`>?,
    public var `dwUsedTransport`: UInt,
    public var `cbUnsignedExtensionOutputs`: UInt,
    public var `pbUnsignedExtensionOutputs`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 257:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WEBAUTHN_ASSERTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WEBAUTHN_ASSERTION_CURRENT_VERSION`: UInt = 5u;
public const val `WEBAUTHN_ASSERTION_VERSION_1`: UInt = 1u;
public const val `WEBAUTHN_ASSERTION_VERSION_2`: UInt = 2u;
public const val `WEBAUTHN_ASSERTION_VERSION_3`: UInt = 3u;
public const val `WEBAUTHN_ASSERTION_VERSION_4`: UInt = 4u;
public const val `WEBAUTHN_ASSERTION_VERSION_5`: UInt = 5u;
public const val `WEBAUTHN_ATTESTATION_CONVEYANCE_PREFERENCE_ANY`: UInt = 0u;
public const val `WEBAUTHN_ATTESTATION_CONVEYANCE_PREFERENCE_DIRECT`: UInt = 3u;
public const val `WEBAUTHN_ATTESTATION_CONVEYANCE_PREFERENCE_INDIRECT`: UInt = 2u;
public const val `WEBAUTHN_ATTESTATION_CONVEYANCE_PREFERENCE_NONE`: UInt = 1u;
public const val `WEBAUTHN_ATTESTATION_DECODE_COMMON`: UInt = 1u;
public const val `WEBAUTHN_ATTESTATION_DECODE_NONE`: UInt = 0u;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WEBAUTHN_ATTESTATION_TYPE_NONE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("none");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WEBAUTHN_ATTESTATION_TYPE_PACKED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("packed");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WEBAUTHN_ATTESTATION_TYPE_TPM`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("tpm");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WEBAUTHN_ATTESTATION_TYPE_U2F`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("fido-u2f");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WEBAUTHN_ATTESTATION_VER_TPM_2_0`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("2.0");
public const val `WEBAUTHN_AUTHENTICATOR_ATTACHMENT_ANY`: UInt = 0u;
public const val `WEBAUTHN_AUTHENTICATOR_ATTACHMENT_CROSS_PLATFORM`: UInt = 2u;
public const val `WEBAUTHN_AUTHENTICATOR_ATTACHMENT_CROSS_PLATFORM_U2F_V2`: UInt = 3u;
public const val `WEBAUTHN_AUTHENTICATOR_ATTACHMENT_PLATFORM`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WEBAUTHN_AUTHENTICATOR_GET_ASSERTION_OPTIONS` (
    public var `dwVersion`: UInt,
    public var `dwTimeoutMilliseconds`: UInt,
    public var `CredentialList`: `WEBAUTHN_CREDENTIALS`,
    public var `Extensions`: `WEBAUTHN_EXTENSIONS`,
    public var `dwAuthenticatorAttachment`: UInt,
    public var `dwUserVerificationRequirement`: UInt,
    public var `dwFlags`: UInt,
    public var `pwszU2fAppId`: `windows_sys`.`core`.`PCWSTR`,
    public var `pbU2fAppId`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?,
    public var `pCancellationId`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `pAllowCredentialList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WEBAUTHN_CREDENTIAL_LIST`>?,
    public var `dwCredLargeBlobOperation`: UInt,
    public var `cbCredLargeBlob`: UInt,
    public var `pbCredLargeBlob`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `pHmacSecretSaltValues`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WEBAUTHN_HMAC_SECRET_SALT_VALUES`>?,
    public var `bBrowserInPrivateMode`: `windows_sys`.`core`.`BOOL`,
    public var `pLinkedDevice`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CTAPCBOR_HYBRID_STORAGE_LINKED_DATA`>?,
    public var `bAutoFill`: `windows_sys`.`core`.`BOOL`,
    public var `cbJsonExt`: UInt,
    public var `pbJsonExt`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 307:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WEBAUTHN_AUTHENTICATOR_GET_ASSERTION_OPTIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WEBAUTHN_AUTHENTICATOR_GET_ASSERTION_OPTIONS_CURRENT_VERSION`: UInt = 7u;
public const val `WEBAUTHN_AUTHENTICATOR_GET_ASSERTION_OPTIONS_VERSION_1`: UInt = 1u;
public const val `WEBAUTHN_AUTHENTICATOR_GET_ASSERTION_OPTIONS_VERSION_2`: UInt = 2u;
public const val `WEBAUTHN_AUTHENTICATOR_GET_ASSERTION_OPTIONS_VERSION_3`: UInt = 3u;
public const val `WEBAUTHN_AUTHENTICATOR_GET_ASSERTION_OPTIONS_VERSION_4`: UInt = 4u;
public const val `WEBAUTHN_AUTHENTICATOR_GET_ASSERTION_OPTIONS_VERSION_5`: UInt = 5u;
public const val `WEBAUTHN_AUTHENTICATOR_GET_ASSERTION_OPTIONS_VERSION_6`: UInt = 6u;
public const val `WEBAUTHN_AUTHENTICATOR_GET_ASSERTION_OPTIONS_VERSION_7`: UInt = 7u;
public const val `WEBAUTHN_AUTHENTICATOR_HMAC_SECRET_VALUES_FLAG`: UInt = 1048576u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WEBAUTHN_AUTHENTICATOR_MAKE_CREDENTIAL_OPTIONS` (
    public var `dwVersion`: UInt,
    public var `dwTimeoutMilliseconds`: UInt,
    public var `CredentialList`: `WEBAUTHN_CREDENTIALS`,
    public var `Extensions`: `WEBAUTHN_EXTENSIONS`,
    public var `dwAuthenticatorAttachment`: UInt,
    public var `bRequireResidentKey`: `windows_sys`.`core`.`BOOL`,
    public var `dwUserVerificationRequirement`: UInt,
    public var `dwAttestationConveyancePreference`: UInt,
    public var `dwFlags`: UInt,
    public var `pCancellationId`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `pExcludeCredentialList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WEBAUTHN_CREDENTIAL_LIST`>?,
    public var `dwEnterpriseAttestation`: UInt,
    public var `dwLargeBlobSupport`: UInt,
    public var `bPreferResidentKey`: `windows_sys`.`core`.`BOOL`,
    public var `bBrowserInPrivateMode`: `windows_sys`.`core`.`BOOL`,
    public var `bEnablePrf`: `windows_sys`.`core`.`BOOL`,
    public var `pLinkedDevice`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CTAPCBOR_HYBRID_STORAGE_LINKED_DATA`>?,
    public var `cbJsonExt`: UInt,
    public var `pbJsonExt`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 344:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WEBAUTHN_AUTHENTICATOR_MAKE_CREDENTIAL_OPTIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WEBAUTHN_AUTHENTICATOR_MAKE_CREDENTIAL_OPTIONS_CURRENT_VERSION`: UInt = 7u;
public const val `WEBAUTHN_AUTHENTICATOR_MAKE_CREDENTIAL_OPTIONS_VERSION_1`: UInt = 1u;
public const val `WEBAUTHN_AUTHENTICATOR_MAKE_CREDENTIAL_OPTIONS_VERSION_2`: UInt = 2u;
public const val `WEBAUTHN_AUTHENTICATOR_MAKE_CREDENTIAL_OPTIONS_VERSION_3`: UInt = 3u;
public const val `WEBAUTHN_AUTHENTICATOR_MAKE_CREDENTIAL_OPTIONS_VERSION_4`: UInt = 4u;
public const val `WEBAUTHN_AUTHENTICATOR_MAKE_CREDENTIAL_OPTIONS_VERSION_5`: UInt = 5u;
public const val `WEBAUTHN_AUTHENTICATOR_MAKE_CREDENTIAL_OPTIONS_VERSION_6`: UInt = 6u;
public const val `WEBAUTHN_AUTHENTICATOR_MAKE_CREDENTIAL_OPTIONS_VERSION_7`: UInt = 7u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WEBAUTHN_CLIENT_DATA` (
    public var `dwVersion`: UInt,
    public var `cbClientDataJSON`: UInt,
    public var `pbClientDataJSON`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `pwszHashAlgId`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 365:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WEBAUTHN_CLIENT_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WEBAUTHN_CLIENT_DATA_CURRENT_VERSION`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WEBAUTHN_COMMON_ATTESTATION` (
    public var `dwVersion`: UInt,
    public var `pwszAlg`: `windows_sys`.`core`.`PCWSTR`,
    public var `lAlg`: Int,
    public var `cbSignature`: UInt,
    public var `pbSignature`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cX5c`: UInt,
    public var `pX5c`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WEBAUTHN_X5C`>?,
    public var `pwszVer`: `windows_sys`.`core`.`PCWSTR`,
    public var `cbCertInfo`: UInt,
    public var `pbCertInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbPubArea`: UInt,
    public var `pbPubArea`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 387:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WEBAUTHN_COMMON_ATTESTATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WEBAUTHN_COMMON_ATTESTATION_CURRENT_VERSION`: UInt = 1u;
public const val `WEBAUTHN_COSE_ALGORITHM_ECDSA_P256_WITH_SHA256`: Int = -7;
public const val `WEBAUTHN_COSE_ALGORITHM_ECDSA_P384_WITH_SHA384`: Int = -35;
public const val `WEBAUTHN_COSE_ALGORITHM_ECDSA_P521_WITH_SHA512`: Int = -36;
public const val `WEBAUTHN_COSE_ALGORITHM_RSASSA_PKCS1_V1_5_WITH_SHA256`: Int = -257;
public const val `WEBAUTHN_COSE_ALGORITHM_RSASSA_PKCS1_V1_5_WITH_SHA384`: Int = -258;
public const val `WEBAUTHN_COSE_ALGORITHM_RSASSA_PKCS1_V1_5_WITH_SHA512`: Int = -259;
public const val `WEBAUTHN_COSE_ALGORITHM_RSA_PSS_WITH_SHA256`: Int = -37;
public const val `WEBAUTHN_COSE_ALGORITHM_RSA_PSS_WITH_SHA384`: Int = -38;
public const val `WEBAUTHN_COSE_ALGORITHM_RSA_PSS_WITH_SHA512`: Int = -39;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WEBAUTHN_COSE_CREDENTIAL_PARAMETER` (
    public var `dwVersion`: UInt,
    public var `pwszCredentialType`: `windows_sys`.`core`.`PCWSTR`,
    public var `lAlg`: Int,
)
// UNSUPPORTED Rust 409:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WEBAUTHN_COSE_CREDENTIAL_PARAMETER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WEBAUTHN_COSE_CREDENTIAL_PARAMETERS` (
    public var `cCredentialParameters`: UInt,
    public var `pCredentialParameters`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WEBAUTHN_COSE_CREDENTIAL_PARAMETER`>?,
)
// UNSUPPORTED Rust 420:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WEBAUTHN_COSE_CREDENTIAL_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WEBAUTHN_COSE_CREDENTIAL_PARAMETER_CURRENT_VERSION`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WEBAUTHN_CREDENTIAL` (
    public var `dwVersion`: UInt,
    public var `cbId`: UInt,
    public var `pbId`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `pwszCredentialType`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 434:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WEBAUTHN_CREDENTIAL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WEBAUTHN_CREDENTIALS` (
    public var `cCredentials`: UInt,
    public var `pCredentials`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WEBAUTHN_CREDENTIAL`>?,
)
// UNSUPPORTED Rust 445:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WEBAUTHN_CREDENTIALS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WEBAUTHN_CREDENTIAL_ATTESTATION` (
    public var `dwVersion`: UInt,
    public var `pwszFormatType`: `windows_sys`.`core`.`PCWSTR`,
    public var `cbAuthenticatorData`: UInt,
    public var `pbAuthenticatorData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbAttestation`: UInt,
    public var `pbAttestation`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `dwAttestationDecodeType`: UInt,
    public var `pvAttestationDecode`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `cbAttestationObject`: UInt,
    public var `pbAttestationObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbCredentialId`: UInt,
    public var `pbCredentialId`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `Extensions`: `WEBAUTHN_EXTENSIONS`,
    public var `dwUsedTransport`: UInt,
    public var `bEpAtt`: `windows_sys`.`core`.`BOOL`,
    public var `bLargeBlobSupported`: `windows_sys`.`core`.`BOOL`,
    public var `bResidentKey`: `windows_sys`.`core`.`BOOL`,
    public var `bPrfEnabled`: `windows_sys`.`core`.`BOOL`,
    public var `cbUnsignedExtensionOutputs`: UInt,
    public var `pbUnsignedExtensionOutputs`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 474:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WEBAUTHN_CREDENTIAL_ATTESTATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WEBAUTHN_CREDENTIAL_ATTESTATION_CURRENT_VERSION`: UInt = 6u;
public const val `WEBAUTHN_CREDENTIAL_ATTESTATION_VERSION_1`: UInt = 1u;
public const val `WEBAUTHN_CREDENTIAL_ATTESTATION_VERSION_2`: UInt = 2u;
public const val `WEBAUTHN_CREDENTIAL_ATTESTATION_VERSION_3`: UInt = 3u;
public const val `WEBAUTHN_CREDENTIAL_ATTESTATION_VERSION_4`: UInt = 4u;
public const val `WEBAUTHN_CREDENTIAL_ATTESTATION_VERSION_5`: UInt = 5u;
public const val `WEBAUTHN_CREDENTIAL_ATTESTATION_VERSION_6`: UInt = 6u;
public const val `WEBAUTHN_CREDENTIAL_CURRENT_VERSION`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WEBAUTHN_CREDENTIAL_DETAILS` (
    public var `dwVersion`: UInt,
    public var `cbCredentialID`: UInt,
    public var `pbCredentialID`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `pRpInformation`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WEBAUTHN_RP_ENTITY_INFORMATION`>?,
    public var `pUserInformation`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WEBAUTHN_USER_ENTITY_INFORMATION`>?,
    public var `bRemovable`: `windows_sys`.`core`.`BOOL`,
    public var `bBackedUp`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 498:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WEBAUTHN_CREDENTIAL_DETAILS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WEBAUTHN_CREDENTIAL_DETAILS_CURRENT_VERSION`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WEBAUTHN_CREDENTIAL_DETAILS_LIST` (
    public var `cCredentialDetails`: UInt,
    public var `ppCredentialDetails`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WEBAUTHN_CREDENTIAL_DETAILS`>>?,
)
// UNSUPPORTED Rust 510:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WEBAUTHN_CREDENTIAL_DETAILS_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WEBAUTHN_CREDENTIAL_DETAILS_VERSION_1`: UInt = 1u;
public const val `WEBAUTHN_CREDENTIAL_DETAILS_VERSION_2`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WEBAUTHN_CREDENTIAL_EX` (
    public var `dwVersion`: UInt,
    public var `cbId`: UInt,
    public var `pbId`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `pwszCredentialType`: `windows_sys`.`core`.`PCWSTR`,
    public var `dwTransports`: UInt,
)
// UNSUPPORTED Rust 526:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WEBAUTHN_CREDENTIAL_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WEBAUTHN_CREDENTIAL_EX_CURRENT_VERSION`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WEBAUTHN_CREDENTIAL_LIST` (
    public var `cCredentials`: UInt,
    public var `ppCredentials`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WEBAUTHN_CREDENTIAL_EX`>>?,
)
// UNSUPPORTED Rust 538:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WEBAUTHN_CREDENTIAL_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WEBAUTHN_CREDENTIAL_TYPE_PUBLIC_KEY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("public-key");
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WEBAUTHN_CRED_BLOB_EXTENSION` (
    public var `cbCredBlob`: UInt,
    public var `pbCredBlob`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 550:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WEBAUTHN_CRED_BLOB_EXTENSION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WEBAUTHN_CRED_LARGE_BLOB_OPERATION_DELETE`: UInt = 3u;
public const val `WEBAUTHN_CRED_LARGE_BLOB_OPERATION_GET`: UInt = 1u;
public const val `WEBAUTHN_CRED_LARGE_BLOB_OPERATION_NONE`: UInt = 0u;
public const val `WEBAUTHN_CRED_LARGE_BLOB_OPERATION_SET`: UInt = 2u;
public const val `WEBAUTHN_CRED_LARGE_BLOB_STATUS_AUTHENTICATOR_ERROR`: UInt = 9u;
public const val `WEBAUTHN_CRED_LARGE_BLOB_STATUS_INVALID_DATA`: UInt = 3u;
public const val `WEBAUTHN_CRED_LARGE_BLOB_STATUS_INVALID_PARAMETER`: UInt = 4u;
public const val `WEBAUTHN_CRED_LARGE_BLOB_STATUS_LACK_OF_SPACE`: UInt = 7u;
public const val `WEBAUTHN_CRED_LARGE_BLOB_STATUS_MULTIPLE_CREDENTIALS`: UInt = 6u;
public const val `WEBAUTHN_CRED_LARGE_BLOB_STATUS_NONE`: UInt = 0u;
public const val `WEBAUTHN_CRED_LARGE_BLOB_STATUS_NOT_FOUND`: UInt = 5u;
public const val `WEBAUTHN_CRED_LARGE_BLOB_STATUS_NOT_SUPPORTED`: UInt = 2u;
public const val `WEBAUTHN_CRED_LARGE_BLOB_STATUS_PLATFORM_ERROR`: UInt = 8u;
public const val `WEBAUTHN_CRED_LARGE_BLOB_STATUS_SUCCESS`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WEBAUTHN_CRED_PROTECT_EXTENSION_IN` (
    public var `dwCredProtect`: UInt,
    public var `bRequireCredProtect`: `windows_sys`.`core`.`BOOL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WEBAUTHN_CRED_WITH_HMAC_SECRET_SALT` (
    public var `cbCredID`: UInt,
    public var `pbCredID`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `pHmacSecretSalt`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WEBAUTHN_HMAC_SECRET_SALT`>?,
)
// UNSUPPORTED Rust 582:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WEBAUTHN_CRED_WITH_HMAC_SECRET_SALT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WEBAUTHN_CTAP_ONE_HMAC_SECRET_LENGTH`: UInt = 32u;
public const val `WEBAUTHN_CTAP_TRANSPORT_BLE`: UInt = 4u;
public const val `WEBAUTHN_CTAP_TRANSPORT_FLAGS_MASK`: UInt = 63u;
public const val `WEBAUTHN_CTAP_TRANSPORT_HYBRID`: UInt = 32u;
public const val `WEBAUTHN_CTAP_TRANSPORT_INTERNAL`: UInt = 16u;
public const val `WEBAUTHN_CTAP_TRANSPORT_NFC`: UInt = 2u;
public const val `WEBAUTHN_CTAP_TRANSPORT_TEST`: UInt = 8u;
public const val `WEBAUTHN_CTAP_TRANSPORT_USB`: UInt = 1u;
public const val `WEBAUTHN_ENTERPRISE_ATTESTATION_NONE`: UInt = 0u;
public const val `WEBAUTHN_ENTERPRISE_ATTESTATION_PLATFORM_MANAGED`: UInt = 2u;
public const val `WEBAUTHN_ENTERPRISE_ATTESTATION_VENDOR_FACILITATED`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WEBAUTHN_EXTENSION` (
    public var `pwszExtensionIdentifier`: `windows_sys`.`core`.`PCWSTR`,
    public var `cbExtension`: UInt,
    public var `pvExtension`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 605:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WEBAUTHN_EXTENSION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WEBAUTHN_EXTENSIONS` (
    public var `cExtensions`: UInt,
    public var `pExtensions`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WEBAUTHN_EXTENSION`>?,
)
// UNSUPPORTED Rust 616:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WEBAUTHN_EXTENSIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WEBAUTHN_EXTENSIONS_IDENTIFIER_CRED_BLOB`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("credBlob");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WEBAUTHN_EXTENSIONS_IDENTIFIER_CRED_PROTECT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("credProtect");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WEBAUTHN_EXTENSIONS_IDENTIFIER_HMAC_SECRET`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("hmac-secret");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WEBAUTHN_EXTENSIONS_IDENTIFIER_MIN_PIN_LENGTH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("minPinLength");
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WEBAUTHN_GET_CREDENTIALS_OPTIONS` (
    public var `dwVersion`: UInt,
    public var `pwszRpId`: `windows_sys`.`core`.`PCWSTR`,
    public var `bBrowserInPrivateMode`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 632:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WEBAUTHN_GET_CREDENTIALS_OPTIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WEBAUTHN_GET_CREDENTIALS_OPTIONS_CURRENT_VERSION`: UInt = 1u;
public const val `WEBAUTHN_GET_CREDENTIALS_OPTIONS_VERSION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WEBAUTHN_HASH_ALGORITHM_SHA_256`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SHA-256");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WEBAUTHN_HASH_ALGORITHM_SHA_384`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SHA-384");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WEBAUTHN_HASH_ALGORITHM_SHA_512`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SHA-512");
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WEBAUTHN_HMAC_SECRET_SALT` (
    public var `cbFirst`: UInt,
    public var `pbFirst`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbSecond`: UInt,
    public var `pbSecond`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 650:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WEBAUTHN_HMAC_SECRET_SALT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WEBAUTHN_HMAC_SECRET_SALT_VALUES` (
    public var `pGlobalHmacSalt`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WEBAUTHN_HMAC_SECRET_SALT`>?,
    public var `cCredWithHmacSecretSaltList`: UInt,
    public var `pCredWithHmacSecretSaltList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WEBAUTHN_CRED_WITH_HMAC_SECRET_SALT`>?,
)
// UNSUPPORTED Rust 662:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WEBAUTHN_HMAC_SECRET_SALT_VALUES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WEBAUTHN_LARGE_BLOB_SUPPORT_NONE`: UInt = 0u;
public const val `WEBAUTHN_LARGE_BLOB_SUPPORT_PREFERRED`: UInt = 2u;
public const val `WEBAUTHN_LARGE_BLOB_SUPPORT_REQUIRED`: UInt = 1u;
public const val `WEBAUTHN_MAX_USER_ID_LENGTH`: UInt = 64u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WEBAUTHN_RP_ENTITY_INFORMATION` (
    public var `dwVersion`: UInt,
    public var `pwszId`: `windows_sys`.`core`.`PCWSTR`,
    public var `pwszName`: `windows_sys`.`core`.`PCWSTR`,
    public var `pwszIcon`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 679:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WEBAUTHN_RP_ENTITY_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WEBAUTHN_RP_ENTITY_INFORMATION_CURRENT_VERSION`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WEBAUTHN_USER_ENTITY_INFORMATION` (
    public var `dwVersion`: UInt,
    public var `cbId`: UInt,
    public var `pbId`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `pwszName`: `windows_sys`.`core`.`PCWSTR`,
    public var `pwszIcon`: `windows_sys`.`core`.`PCWSTR`,
    public var `pwszDisplayName`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 695:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WEBAUTHN_USER_ENTITY_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WEBAUTHN_USER_ENTITY_INFORMATION_CURRENT_VERSION`: UInt = 1u;
public const val `WEBAUTHN_USER_VERIFICATION_ANY`: UInt = 0u;
public const val `WEBAUTHN_USER_VERIFICATION_OPTIONAL`: UInt = 1u;
public const val `WEBAUTHN_USER_VERIFICATION_OPTIONAL_WITH_CREDENTIAL_ID_LIST`: UInt = 2u;
public const val `WEBAUTHN_USER_VERIFICATION_REQUIRED`: UInt = 3u;
public const val `WEBAUTHN_USER_VERIFICATION_REQUIREMENT_ANY`: UInt = 0u;
public const val `WEBAUTHN_USER_VERIFICATION_REQUIREMENT_DISCOURAGED`: UInt = 3u;
public const val `WEBAUTHN_USER_VERIFICATION_REQUIREMENT_PREFERRED`: UInt = 2u;
public const val `WEBAUTHN_USER_VERIFICATION_REQUIREMENT_REQUIRED`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WEBAUTHN_X5C` (
    public var `cbData`: UInt,
    public var `pbData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 715:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WEBAUTHN_X5C {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_ABANDON_MESSAGE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_ABORT_CHANNEL_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_ABORT_LISTENER_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_ACCEPT_CHANNEL_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
public const val `WS_ACTION_HEADER`: `WS_HEADER_TYPE` = 1;
public typealias `WS_ADDRESSING_VERSION` = Int;
public const val `WS_ADDRESSING_VERSION_0_9`: `WS_ADDRESSING_VERSION` = 1;
public const val `WS_ADDRESSING_VERSION_1_0`: `WS_ADDRESSING_VERSION` = 2;
public const val `WS_ADDRESSING_VERSION_TRANSPORT`: `WS_ADDRESSING_VERSION` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_ANY_ATTRIBUTE` (
    public var `localName`: `WS_XML_STRING`,
    public var `ns`: `WS_XML_STRING`,
    public var `value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_TEXT`>?,
)
// UNSUPPORTED Rust 736:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_ANY_ATTRIBUTE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_ANY_ATTRIBUTES` (
    public var `attributes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_ANY_ATTRIBUTE`>?,
    public var `attributeCount`: UInt,
)
// UNSUPPORTED Rust 747:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_ANY_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_ANY_ATTRIBUTES_FIELD_MAPPING`: `WS_FIELD_MAPPING` = 12;
public const val `WS_ANY_ATTRIBUTES_TYPE`: `WS_TYPE` = 34;
public const val `WS_ANY_CONTENT_FIELD_MAPPING`: `WS_FIELD_MAPPING` = 11;
public const val `WS_ANY_ELEMENT_FIELD_MAPPING`: `WS_FIELD_MAPPING` = 9;
public const val `WS_ANY_ELEMENT_TYPE_MAPPING`: `WS_TYPE_MAPPING` = 4;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_ASYNC_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`HRESULT`, `WS_CALLBACK_MODEL`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_ASYNC_CONTEXT` (
    public var `callback`: `WS_ASYNC_CALLBACK`,
    public var `callbackState`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 764:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_ASYNC_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_ASYNC_FUNCTION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`HRESULT`, `WS_CALLBACK_MODEL`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_ASYNC_OPERATION`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_ASYNC_OPERATION` (
    public var `function`: `WS_ASYNC_FUNCTION`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_ASYNC_STATE` (
    public var `internal0`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `internal1`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `internal2`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `internal3`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `internal4`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 784:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_ASYNC_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_ATTRIBUTE_DESCRIPTION` (
    public var `attributeLocalName`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `attributeNs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `type`: `WS_TYPE`,
    public var `typeDescription`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 797:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_ATTRIBUTE_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_ATTRIBUTE_FIELD_MAPPING`: `WS_FIELD_MAPPING` = 1;
public const val `WS_ATTRIBUTE_TYPE_MAPPING`: `WS_TYPE_MAPPING` = 2;
public const val `WS_AUTO_COOKIE_MODE`: `WS_COOKIE_MODE` = 2;
public typealias `WS_BINDING_TEMPLATE_TYPE` = Int;
public const val `WS_BLANK_MESSAGE`: `WS_MESSAGE_INITIALIZATION` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_BOOL_DESCRIPTION` (
    public var `value`: `windows_sys`.`core`.`BOOL`,
)
public const val `WS_BOOL_TYPE`: `WS_TYPE` = 0;
public const val `WS_BOOL_VALUE_TYPE`: `WS_VALUE_TYPE` = 0;
public const val `WS_BUFFERED_TRANSFER_MODE`: `WS_TRANSFER_MODE` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_BUFFERS` (
    public var `bufferCount`: UInt,
    public var `buffers`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_BYTES`>?,
)
// UNSUPPORTED Rust 821:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_BUFFERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_BYTES` (
    public var `length`: UInt,
    public var `bytes`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 832:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_BYTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_BYTES_DESCRIPTION` (
    public var `minByteCount`: UInt,
    public var `maxByteCount`: UInt,
)
public const val `WS_BYTES_TYPE`: `WS_TYPE` = 18;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_BYTE_ARRAY_DESCRIPTION` (
    public var `minByteCount`: UInt,
    public var `maxByteCount`: UInt,
)
public const val `WS_BYTE_ARRAY_TYPE`: `WS_TYPE` = 24;
public typealias `WS_CALLBACK_MODEL` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_CALL_PROPERTY` (
    public var `id`: `WS_CALL_PROPERTY_ID`,
    public var `value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `valueSize`: UInt,
)
// UNSUPPORTED Rust 859:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_CALL_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_CALL_PROPERTY_CALL_ID`: `WS_CALL_PROPERTY_ID` = 3;
public const val `WS_CALL_PROPERTY_CHECK_MUST_UNDERSTAND`: `WS_CALL_PROPERTY_ID` = 0;
public typealias `WS_CALL_PROPERTY_ID` = Int;
public const val `WS_CALL_PROPERTY_RECEIVE_MESSAGE_CONTEXT`: `WS_CALL_PROPERTY_ID` = 2;
public const val `WS_CALL_PROPERTY_SEND_MESSAGE_CONTEXT`: `WS_CALL_PROPERTY_ID` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_CAPI_ASYMMETRIC_SECURITY_KEY_HANDLE` (
    public var `keyHandle`: `WS_SECURITY_KEY_HANDLE`,
    public var `provider`: ULong,
    public var `keySpec`: UInt,
)
public const val `WS_CAPI_ASYMMETRIC_SECURITY_KEY_HANDLE_TYPE`: `WS_SECURITY_KEY_HANDLE_TYPE` = 3;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
public typealias `WS_CERTIFICATE_VALIDATION_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`Cryptography`.`CERT_CONTEXT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_CERTIFICATE_VALIDATION_CALLBACK_CONTEXT` (
    public var `callback`: `WS_CERTIFICATE_VALIDATION_CALLBACK`,
    public var `state`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 886:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for WS_CERTIFICATE_VALIDATION_CALLBACK_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_CERT_CREDENTIAL` (
    public var `credentialType`: `WS_CERT_CREDENTIAL_TYPE`,
)
public typealias `WS_CERT_CREDENTIAL_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_CERT_ENDPOINT_IDENTITY` (
    public var `identity`: `WS_ENDPOINT_IDENTITY`,
    public var `rawCertificateData`: `WS_BYTES`,
)
public const val `WS_CERT_ENDPOINT_IDENTITY_TYPE`: `WS_ENDPOINT_IDENTITY_TYPE` = 5;
public const val `WS_CERT_FAILURE_CN_MISMATCH`: Int = 1;
public const val `WS_CERT_FAILURE_INVALID_DATE`: Int = 2;
public const val `WS_CERT_FAILURE_REVOCATION_OFFLINE`: Int = 16;
public const val `WS_CERT_FAILURE_UNTRUSTED_ROOT`: Int = 4;
public const val `WS_CERT_FAILURE_WRONG_USAGE`: Int = 8;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Authentication_Identity", feature = "Win32_Security_Cryptography"))]
public typealias `WS_CERT_ISSUER_LIST_NOTIFICATION_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`Authentication`.`Identity`.`SecPkgContext_IssuerListInfoEx`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_CERT_MESSAGE_SECURITY_BINDING_CONSTRAINT` (
    public var `bindingConstraint`: `WS_SECURITY_BINDING_CONSTRAINT`,
    public var `bindingUsage`: `WS_MESSAGE_SECURITY_USAGE`,
)
public const val `WS_CERT_MESSAGE_SECURITY_BINDING_CONSTRAINT_TYPE`: `WS_SECURITY_BINDING_CONSTRAINT_TYPE` = 7;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_CERT_SIGNED_SAML_AUTHENTICATOR` (
    public var `authenticator`: `WS_SAML_AUTHENTICATOR`,
    public var `trustedIssuerCerts`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`Cryptography`.`CERT_CONTEXT`>>?,
    public var `trustedIssuerCertCount`: UInt,
    public var `decryptionCert`: /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`Cryptography`.`CERT_CONTEXT`>?,
    public var `samlValidator`: `WS_VALIDATE_SAML_CALLBACK`,
    public var `samlValidatorCallbackState`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 930:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for WS_CERT_SIGNED_SAML_AUTHENTICATOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_CERT_SIGNED_SAML_AUTHENTICATOR_TYPE`: `WS_SAML_AUTHENTICATOR_TYPE` = 1;
public typealias `WS_CHANNEL` = Long;
public typealias `WS_CHANNEL_BINDING` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_CHANNEL_DECODER` (
    public var `createContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `createDecoderCallback`: `WS_CREATE_DECODER_CALLBACK`,
    public var `decoderGetContentTypeCallback`: `WS_DECODER_GET_CONTENT_TYPE_CALLBACK`,
    public var `decoderStartCallback`: `WS_DECODER_START_CALLBACK`,
    public var `decoderDecodeCallback`: `WS_DECODER_DECODE_CALLBACK`,
    public var `decoderEndCallback`: `WS_DECODER_END_CALLBACK`,
    public var `freeDecoderCallback`: `WS_FREE_DECODER_CALLBACK`,
)
// UNSUPPORTED Rust 950:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_CHANNEL_DECODER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_CHANNEL_ENCODER` (
    public var `createContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `createEncoderCallback`: `WS_CREATE_ENCODER_CALLBACK`,
    public var `encoderGetContentTypeCallback`: `WS_ENCODER_GET_CONTENT_TYPE_CALLBACK`,
    public var `encoderStartCallback`: `WS_ENCODER_START_CALLBACK`,
    public var `encoderEncodeCallback`: `WS_ENCODER_ENCODE_CALLBACK`,
    public var `encoderEndCallback`: `WS_ENCODER_END_CALLBACK`,
    public var `freeEncoderCallback`: `WS_FREE_ENCODER_CALLBACK`,
)
// UNSUPPORTED Rust 966:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_CHANNEL_ENCODER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_CHANNEL_PROPERTIES` (
    public var `properties`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_CHANNEL_PROPERTY`>?,
    public var `propertyCount`: UInt,
)
// UNSUPPORTED Rust 977:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_CHANNEL_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_CHANNEL_PROPERTY` (
    public var `id`: `WS_CHANNEL_PROPERTY_ID`,
    public var `value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `valueSize`: UInt,
)
// UNSUPPORTED Rust 989:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_CHANNEL_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_CHANNEL_PROPERTY_ADDRESSING_VERSION`: `WS_CHANNEL_PROPERTY_ID` = 6;
public const val `WS_CHANNEL_PROPERTY_ALLOW_UNSECURED_FAULTS`: `WS_CHANNEL_PROPERTY_ID` = 46;
public const val `WS_CHANNEL_PROPERTY_ASYNC_CALLBACK_MODEL`: `WS_CHANNEL_PROPERTY_ID` = 9;
public const val `WS_CHANNEL_PROPERTY_CHANNEL_TYPE`: `WS_CHANNEL_PROPERTY_ID` = 34;
public const val `WS_CHANNEL_PROPERTY_CLOSE_TIMEOUT`: `WS_CHANNEL_PROPERTY_ID` = 16;
public const val `WS_CHANNEL_PROPERTY_CONNECT_TIMEOUT`: `WS_CHANNEL_PROPERTY_ID` = 12;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_CHANNEL_PROPERTY_CONSTRAINT` (
    public var `id`: `WS_CHANNEL_PROPERTY_ID`,
    public var `allowedValues`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `allowedValuesSize`: UInt,
    public var `out`: `WS_CHANNEL_PROPERTY_CONSTRAINT_0`,
)
// UNSUPPORTED Rust 1008:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_CHANNEL_PROPERTY_CONSTRAINT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_CHANNEL_PROPERTY_CONSTRAINT_0` (
    public var `channelProperty`: `WS_CHANNEL_PROPERTY`,
)
public const val `WS_CHANNEL_PROPERTY_COOKIE_MODE`: `WS_CHANNEL_PROPERTY_ID` = 39;
public const val `WS_CHANNEL_PROPERTY_CUSTOM_CHANNEL_CALLBACKS`: `WS_CHANNEL_PROPERTY_ID` = 24;
public const val `WS_CHANNEL_PROPERTY_CUSTOM_CHANNEL_INSTANCE`: `WS_CHANNEL_PROPERTY_ID` = 26;
public const val `WS_CHANNEL_PROPERTY_CUSTOM_CHANNEL_PARAMETERS`: `WS_CHANNEL_PROPERTY_ID` = 25;
public const val `WS_CHANNEL_PROPERTY_CUSTOM_HTTP_PROXY`: `WS_CHANNEL_PROPERTY_ID` = 41;
public const val `WS_CHANNEL_PROPERTY_DECODER`: `WS_CHANNEL_PROPERTY_ID` = 37;
public const val `WS_CHANNEL_PROPERTY_ENABLE_HTTP_REDIRECT`: `WS_CHANNEL_PROPERTY_ID` = 43;
public const val `WS_CHANNEL_PROPERTY_ENABLE_TIMEOUTS`: `WS_CHANNEL_PROPERTY_ID` = 17;
public const val `WS_CHANNEL_PROPERTY_ENCODER`: `WS_CHANNEL_PROPERTY_ID` = 36;
public const val `WS_CHANNEL_PROPERTY_ENCODING`: `WS_CHANNEL_PROPERTY_ID` = 4;
public const val `WS_CHANNEL_PROPERTY_ENVELOPE_VERSION`: `WS_CHANNEL_PROPERTY_ID` = 5;
public const val `WS_CHANNEL_PROPERTY_FAULTS_AS_ERRORS`: `WS_CHANNEL_PROPERTY_ID` = 45;
public const val `WS_CHANNEL_PROPERTY_HTTP_CONNECTION_ID`: `WS_CHANNEL_PROPERTY_ID` = 23;
public const val `WS_CHANNEL_PROPERTY_HTTP_MESSAGE_MAPPING`: `WS_CHANNEL_PROPERTY_ID` = 42;
public const val `WS_CHANNEL_PROPERTY_HTTP_PROXY_SETTING_MODE`: `WS_CHANNEL_PROPERTY_ID` = 40;
public const val `WS_CHANNEL_PROPERTY_HTTP_PROXY_SPN`: `WS_CHANNEL_PROPERTY_ID` = 48;
public const val `WS_CHANNEL_PROPERTY_HTTP_REDIRECT_CALLBACK_CONTEXT`: `WS_CHANNEL_PROPERTY_ID` = 44;
public const val `WS_CHANNEL_PROPERTY_HTTP_SERVER_SPN`: `WS_CHANNEL_PROPERTY_ID` = 47;
public typealias `WS_CHANNEL_PROPERTY_ID` = Int;
public const val `WS_CHANNEL_PROPERTY_IP_VERSION`: `WS_CHANNEL_PROPERTY_ID` = 10;
public const val `WS_CHANNEL_PROPERTY_IS_SESSION_SHUT_DOWN`: `WS_CHANNEL_PROPERTY_ID` = 33;
public const val `WS_CHANNEL_PROPERTY_KEEP_ALIVE_INTERVAL`: `WS_CHANNEL_PROPERTY_ID` = 31;
public const val `WS_CHANNEL_PROPERTY_KEEP_ALIVE_TIME`: `WS_CHANNEL_PROPERTY_ID` = 30;
public const val `WS_CHANNEL_PROPERTY_MAX_BUFFERED_MESSAGE_SIZE`: `WS_CHANNEL_PROPERTY_ID` = 0;
public const val `WS_CHANNEL_PROPERTY_MAX_HTTP_REQUEST_HEADERS_BUFFER_SIZE`: `WS_CHANNEL_PROPERTY_ID` = 49;
public const val `WS_CHANNEL_PROPERTY_MAX_HTTP_SERVER_CONNECTIONS`: `WS_CHANNEL_PROPERTY_ID` = 32;
public const val `WS_CHANNEL_PROPERTY_MAX_SESSION_DICTIONARY_SIZE`: `WS_CHANNEL_PROPERTY_ID` = 7;
public const val `WS_CHANNEL_PROPERTY_MAX_STREAMED_FLUSH_SIZE`: `WS_CHANNEL_PROPERTY_ID` = 3;
public const val `WS_CHANNEL_PROPERTY_MAX_STREAMED_MESSAGE_SIZE`: `WS_CHANNEL_PROPERTY_ID` = 1;
public const val `WS_CHANNEL_PROPERTY_MAX_STREAMED_START_SIZE`: `WS_CHANNEL_PROPERTY_ID` = 2;
public const val `WS_CHANNEL_PROPERTY_MULTICAST_HOPS`: `WS_CHANNEL_PROPERTY_ID` = 20;
public const val `WS_CHANNEL_PROPERTY_MULTICAST_INTERFACE`: `WS_CHANNEL_PROPERTY_ID` = 19;
public const val `WS_CHANNEL_PROPERTY_NO_DELAY`: `WS_CHANNEL_PROPERTY_ID` = 28;
public const val `WS_CHANNEL_PROPERTY_PROTECTION_LEVEL`: `WS_CHANNEL_PROPERTY_ID` = 38;
public const val `WS_CHANNEL_PROPERTY_RECEIVE_RESPONSE_TIMEOUT`: `WS_CHANNEL_PROPERTY_ID` = 14;
public const val `WS_CHANNEL_PROPERTY_RECEIVE_TIMEOUT`: `WS_CHANNEL_PROPERTY_ID` = 15;
public const val `WS_CHANNEL_PROPERTY_REMOTE_ADDRESS`: `WS_CHANNEL_PROPERTY_ID` = 21;
public const val `WS_CHANNEL_PROPERTY_REMOTE_IP_ADDRESS`: `WS_CHANNEL_PROPERTY_ID` = 22;
public const val `WS_CHANNEL_PROPERTY_RESOLVE_TIMEOUT`: `WS_CHANNEL_PROPERTY_ID` = 11;
public const val `WS_CHANNEL_PROPERTY_SEND_KEEP_ALIVES`: `WS_CHANNEL_PROPERTY_ID` = 29;
public const val `WS_CHANNEL_PROPERTY_SEND_TIMEOUT`: `WS_CHANNEL_PROPERTY_ID` = 13;
public const val `WS_CHANNEL_PROPERTY_STATE`: `WS_CHANNEL_PROPERTY_ID` = 8;
public const val `WS_CHANNEL_PROPERTY_TRANSFER_MODE`: `WS_CHANNEL_PROPERTY_ID` = 18;
public const val `WS_CHANNEL_PROPERTY_TRANSPORT_URL`: `WS_CHANNEL_PROPERTY_ID` = 27;
public const val `WS_CHANNEL_PROPERTY_TRIM_BUFFERED_MESSAGE_SIZE`: `WS_CHANNEL_PROPERTY_ID` = 35;
public typealias `WS_CHANNEL_STATE` = Int;
public const val `WS_CHANNEL_STATE_ACCEPTING`: `WS_CHANNEL_STATE` = 2;
public const val `WS_CHANNEL_STATE_CLOSED`: `WS_CHANNEL_STATE` = 6;
public const val `WS_CHANNEL_STATE_CLOSING`: `WS_CHANNEL_STATE` = 5;
public const val `WS_CHANNEL_STATE_CREATED`: `WS_CHANNEL_STATE` = 0;
public const val `WS_CHANNEL_STATE_FAULTED`: `WS_CHANNEL_STATE` = 4;
public const val `WS_CHANNEL_STATE_OPEN`: `WS_CHANNEL_STATE` = 3;
public const val `WS_CHANNEL_STATE_OPENING`: `WS_CHANNEL_STATE` = 1;
public typealias `WS_CHANNEL_TYPE` = Int;
public const val `WS_CHANNEL_TYPE_DUPLEX`: `WS_CHANNEL_TYPE` = 3;
public const val `WS_CHANNEL_TYPE_DUPLEX_SESSION`: `WS_CHANNEL_TYPE` = 7;
public const val `WS_CHANNEL_TYPE_INPUT`: `WS_CHANNEL_TYPE` = 1;
public const val `WS_CHANNEL_TYPE_INPUT_SESSION`: `WS_CHANNEL_TYPE` = 5;
public const val `WS_CHANNEL_TYPE_OUTPUT`: `WS_CHANNEL_TYPE` = 2;
public const val `WS_CHANNEL_TYPE_OUTPUT_SESSION`: `WS_CHANNEL_TYPE` = 6;
public const val `WS_CHANNEL_TYPE_REPLY`: `WS_CHANNEL_TYPE` = 16;
public const val `WS_CHANNEL_TYPE_REQUEST`: `WS_CHANNEL_TYPE` = 8;
public const val `WS_CHANNEL_TYPE_SESSION`: `WS_CHANNEL_TYPE` = 4;
public typealias `WS_CHARSET` = Int;
public const val `WS_CHARSET_AUTO`: `WS_CHARSET` = 0;
public const val `WS_CHARSET_UTF16BE`: `WS_CHARSET` = 3;
public const val `WS_CHARSET_UTF16LE`: `WS_CHARSET` = 2;
public const val `WS_CHARSET_UTF8`: `WS_CHARSET` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_CHAR_ARRAY_DESCRIPTION` (
    public var `minCharCount`: UInt,
    public var `maxCharCount`: UInt,
)
public const val `WS_CHAR_ARRAY_TYPE`: `WS_TYPE` = 22;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_CLOSE_CHANNEL_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_CLOSE_LISTENER_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_CONTRACT_DESCRIPTION` (
    public var `operationCount`: UInt,
    public var `operations`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_OPERATION_DESCRIPTION`>>?,
)
// UNSUPPORTED Rust 1101:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_CONTRACT_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WS_COOKIE_MODE` = Int;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_CREATE_CHANNEL_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`WS_CHANNEL_TYPE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_CREATE_CHANNEL_FOR_LISTENER_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_CREATE_DECODER_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `WS_READ_CALLBACK`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_CREATE_ENCODER_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `WS_WRITE_CALLBACK`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_CREATE_LISTENER_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`WS_CHANNEL_TYPE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Authentication_Identity", feature = "Win32_Security_Cryptography"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_CUSTOM_CERT_CREDENTIAL` (
    public var `credential`: `WS_CERT_CREDENTIAL`,
    public var `getCertCallback`: `WS_GET_CERT_CALLBACK`,
    public var `getCertCallbackState`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `certIssuerListNotificationCallback`: `WS_CERT_ISSUER_LIST_NOTIFICATION_CALLBACK`,
    public var `certIssuerListNotificationCallbackState`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1122:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Security_Authentication_Identity", feature = "Win32_Security_Cryptography"))]
// impl Default for WS_CUSTOM_CERT_CREDENTIAL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_CUSTOM_CERT_CREDENTIAL_TYPE`: `WS_CERT_CREDENTIAL_TYPE` = 3;
public const val `WS_CUSTOM_CHANNEL_BINDING`: `WS_CHANNEL_BINDING` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_CUSTOM_CHANNEL_CALLBACKS` (
    public var `createChannelCallback`: `WS_CREATE_CHANNEL_CALLBACK`,
    public var `freeChannelCallback`: `WS_FREE_CHANNEL_CALLBACK`,
    public var `resetChannelCallback`: `WS_RESET_CHANNEL_CALLBACK`,
    public var `openChannelCallback`: `WS_OPEN_CHANNEL_CALLBACK`,
    public var `closeChannelCallback`: `WS_CLOSE_CHANNEL_CALLBACK`,
    public var `abortChannelCallback`: `WS_ABORT_CHANNEL_CALLBACK`,
    public var `getChannelPropertyCallback`: `WS_GET_CHANNEL_PROPERTY_CALLBACK`,
    public var `setChannelPropertyCallback`: `WS_SET_CHANNEL_PROPERTY_CALLBACK`,
    public var `writeMessageStartCallback`: `WS_WRITE_MESSAGE_START_CALLBACK`,
    public var `writeMessageEndCallback`: `WS_WRITE_MESSAGE_END_CALLBACK`,
    public var `readMessageStartCallback`: `WS_READ_MESSAGE_START_CALLBACK`,
    public var `readMessageEndCallback`: `WS_READ_MESSAGE_END_CALLBACK`,
    public var `abandonMessageCallback`: `WS_ABANDON_MESSAGE_CALLBACK`,
    public var `shutdownSessionChannelCallback`: `WS_SHUTDOWN_SESSION_CHANNEL_CALLBACK`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_CUSTOM_HTTP_PROXY` (
    public var `servers`: `WS_STRING`,
    public var `bypass`: `WS_STRING`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_CUSTOM_LISTENER_CALLBACKS` (
    public var `createListenerCallback`: `WS_CREATE_LISTENER_CALLBACK`,
    public var `freeListenerCallback`: `WS_FREE_LISTENER_CALLBACK`,
    public var `resetListenerCallback`: `WS_RESET_LISTENER_CALLBACK`,
    public var `openListenerCallback`: `WS_OPEN_LISTENER_CALLBACK`,
    public var `closeListenerCallback`: `WS_CLOSE_LISTENER_CALLBACK`,
    public var `abortListenerCallback`: `WS_ABORT_LISTENER_CALLBACK`,
    public var `getListenerPropertyCallback`: `WS_GET_LISTENER_PROPERTY_CALLBACK`,
    public var `setListenerPropertyCallback`: `WS_SET_LISTENER_PROPERTY_CALLBACK`,
    public var `createChannelForListenerCallback`: `WS_CREATE_CHANNEL_FOR_LISTENER_CALLBACK`,
    public var `acceptChannelCallback`: `WS_ACCEPT_CHANNEL_CALLBACK`,
)
public const val `WS_CUSTOM_TYPE`: `WS_TYPE` = 27;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_CUSTOM_TYPE_DESCRIPTION` (
    public var `size`: UInt,
    public var `alignment`: UInt,
    public var `readCallback`: `WS_READ_TYPE_CALLBACK`,
    public var `writeCallback`: `WS_WRITE_TYPE_CALLBACK`,
    public var `descriptionData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `isDefaultValueCallback`: `WS_IS_DEFAULT_VALUE_CALLBACK`,
)
// UNSUPPORTED Rust 1179:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_CUSTOM_TYPE_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_DATETIME` (
    public var `ticks`: ULong,
    public var `format`: `WS_DATETIME_FORMAT`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_DATETIME_DESCRIPTION` (
    public var `minValue`: `WS_DATETIME`,
    public var `maxValue`: `WS_DATETIME`,
)
public typealias `WS_DATETIME_FORMAT` = Int;
public const val `WS_DATETIME_FORMAT_LOCAL`: `WS_DATETIME_FORMAT` = 1;
public const val `WS_DATETIME_FORMAT_NONE`: `WS_DATETIME_FORMAT` = 2;
public const val `WS_DATETIME_FORMAT_UTC`: `WS_DATETIME_FORMAT` = 0;
public const val `WS_DATETIME_TYPE`: `WS_TYPE` = 12;
public const val `WS_DATETIME_VALUE_TYPE`: `WS_VALUE_TYPE` = 12;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_DECIMAL_DESCRIPTION` (
    public var `minValue`: `super`.`super`.`Foundation`.`DECIMAL`,
    public var `maxValue`: `super`.`super`.`Foundation`.`DECIMAL`,
)
// UNSUPPORTED Rust 1208:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_DECIMAL_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_DECIMAL_TYPE`: `WS_TYPE` = 11;
public const val `WS_DECIMAL_VALUE_TYPE`: `WS_VALUE_TYPE` = 11;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_DECODER_DECODE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_DECODER_END_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_DECODER_GET_CONTENT_TYPE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_STRING`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_DECODER_START_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_DEFAULT_VALUE` (
    public var `value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `valueSize`: UInt,
)
// UNSUPPORTED Rust 1225:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_DEFAULT_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_DEFAULT_WINDOWS_INTEGRATED_AUTH_CREDENTIAL` (
    public var `credential`: `WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL`,
)
public const val `WS_DEFAULT_WINDOWS_INTEGRATED_AUTH_CREDENTIAL_TYPE`: `WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL_TYPE` = 2;
public const val `WS_DESCRIPTION_TYPE`: `WS_TYPE` = 25;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_DISALLOWED_USER_AGENT_SUBSTRINGS` (
    public var `subStringCount`: UInt,
    public var `subStrings`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_STRING`>>?,
)
// UNSUPPORTED Rust 1243:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_DISALLOWED_USER_AGENT_SUBSTRINGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_DNS_ENDPOINT_IDENTITY` (
    public var `identity`: `WS_ENDPOINT_IDENTITY`,
    public var `dns`: `WS_STRING`,
)
public const val `WS_DNS_ENDPOINT_IDENTITY_TYPE`: `WS_ENDPOINT_IDENTITY_TYPE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_DOUBLE_DESCRIPTION` (
    public var `minValue`: Double,
    public var `maxValue`: Double,
)
public const val `WS_DOUBLE_TYPE`: `WS_TYPE` = 10;
public const val `WS_DOUBLE_VALUE_TYPE`: `WS_VALUE_TYPE` = 10;
public const val `WS_DUPLICATE_MESSAGE`: `WS_MESSAGE_INITIALIZATION` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_DURATION` (
    public var `negative`: `windows_sys`.`core`.`BOOL`,
    public var `years`: UInt,
    public var `months`: UInt,
    public var `days`: UInt,
    public var `hours`: UInt,
    public var `minutes`: UInt,
    public var `seconds`: UInt,
    public var `milliseconds`: UInt,
    public var `ticks`: UInt,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_DURATION_COMPARISON_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`WS_DURATION`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_DURATION`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_DURATION_DESCRIPTION` (
    public var `minValue`: `WS_DURATION`,
    public var `maxValue`: `WS_DURATION`,
    public var `comparer`: `WS_DURATION_COMPARISON_CALLBACK`,
)
public const val `WS_DURATION_TYPE`: `WS_TYPE` = 32;
public const val `WS_DURATION_VALUE_TYPE`: `WS_VALUE_TYPE` = 15;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_DYNAMIC_STRING_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
public const val `WS_ELEMENT_CHOICE_FIELD_MAPPING`: `WS_FIELD_MAPPING` = 7;
public const val `WS_ELEMENT_CONTENT_TYPE_MAPPING`: `WS_TYPE_MAPPING` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_ELEMENT_DESCRIPTION` (
    public var `elementLocalName`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `elementNs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `type`: `WS_TYPE`,
    public var `typeDescription`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1298:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_ELEMENT_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_ELEMENT_FIELD_MAPPING`: `WS_FIELD_MAPPING` = 2;
public const val `WS_ELEMENT_TYPE_MAPPING`: `WS_TYPE_MAPPING` = 1;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_ENCODER_ENCODE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_BYTES`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_ENCODER_END_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_ENCODER_GET_CONTENT_TYPE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_STRING`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_STRING`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_ENCODER_START_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
public typealias `WS_ENCODING` = Int;
public const val `WS_ENCODING_RAW`: `WS_ENCODING` = 8;
public const val `WS_ENCODING_XML_BINARY_1`: `WS_ENCODING` = 0;
public const val `WS_ENCODING_XML_BINARY_SESSION_1`: `WS_ENCODING` = 1;
public const val `WS_ENCODING_XML_MTOM_UTF16BE`: `WS_ENCODING` = 3;
public const val `WS_ENCODING_XML_MTOM_UTF16LE`: `WS_ENCODING` = 4;
public const val `WS_ENCODING_XML_MTOM_UTF8`: `WS_ENCODING` = 2;
public const val `WS_ENCODING_XML_UTF16BE`: `WS_ENCODING` = 6;
public const val `WS_ENCODING_XML_UTF16LE`: `WS_ENCODING` = 7;
public const val `WS_ENCODING_XML_UTF8`: `WS_ENCODING` = 5;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_ENDPOINT_ADDRESS` (
    public var `url`: `WS_STRING`,
    public var `headers`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_BUFFER`>?,
    public var `extensions`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_BUFFER`>?,
    public var `identity`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_ENDPOINT_IDENTITY`>?,
)
// UNSUPPORTED Rust 1327:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_ENDPOINT_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_ENDPOINT_ADDRESS_DESCRIPTION` (
    public var `addressingVersion`: `WS_ADDRESSING_VERSION`,
)
public const val `WS_ENDPOINT_ADDRESS_EXTENSION_METADATA_ADDRESS`: `WS_ENDPOINT_ADDRESS_EXTENSION_TYPE` = 1;
public typealias `WS_ENDPOINT_ADDRESS_EXTENSION_TYPE` = Int;
public const val `WS_ENDPOINT_ADDRESS_TYPE`: `WS_TYPE` = 28;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_ENDPOINT_IDENTITY` (
    public var `identityType`: `WS_ENDPOINT_IDENTITY_TYPE`,
)
public typealias `WS_ENDPOINT_IDENTITY_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_ENDPOINT_POLICY_EXTENSION` (
    public var `policyExtension`: `WS_POLICY_EXTENSION`,
    public var `assertionName`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `assertionNs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `out`: `WS_ENDPOINT_POLICY_EXTENSION_0`,
)
// UNSUPPORTED Rust 1354:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_ENDPOINT_POLICY_EXTENSION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_ENDPOINT_POLICY_EXTENSION_0` (
    public var `assertionValue`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_BUFFER`>?,
)
// UNSUPPORTED Rust 1364:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_ENDPOINT_POLICY_EXTENSION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_ENDPOINT_POLICY_EXTENSION_TYPE`: `WS_POLICY_EXTENSION_TYPE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_ENUM_DESCRIPTION` (
    public var `values`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_ENUM_VALUE`>?,
    public var `valueCount`: UInt,
    public var `maxByteCount`: UInt,
    public var `nameIndices`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
)
// UNSUPPORTED Rust 1378:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_ENUM_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_ENUM_TYPE`: `WS_TYPE` = 31;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_ENUM_VALUE` (
    public var `value`: Int,
    public var `name`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
)
// UNSUPPORTED Rust 1390:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_ENUM_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WS_ENVELOPE_VERSION` = Int;
public const val `WS_ENVELOPE_VERSION_NONE`: `WS_ENVELOPE_VERSION` = 3;
public const val `WS_ENVELOPE_VERSION_SOAP_1_1`: `WS_ENVELOPE_VERSION` = 1;
public const val `WS_ENVELOPE_VERSION_SOAP_1_2`: `WS_ENVELOPE_VERSION` = 2;
public typealias `WS_ERROR` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_ERROR_PROPERTY` (
    public var `id`: `WS_ERROR_PROPERTY_ID`,
    public var `value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `valueSize`: UInt,
)
// UNSUPPORTED Rust 1407:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_ERROR_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WS_ERROR_PROPERTY_ID` = Int;
public const val `WS_ERROR_PROPERTY_LANGID`: `WS_ERROR_PROPERTY_ID` = 2;
public const val `WS_ERROR_PROPERTY_ORIGINAL_ERROR_CODE`: `WS_ERROR_PROPERTY_ID` = 1;
public const val `WS_ERROR_PROPERTY_STRING_COUNT`: `WS_ERROR_PROPERTY_ID` = 0;
public typealias `WS_EXCEPTION_CODE` = Int;
public const val `WS_EXCEPTION_CODE_INTERNAL_FAILURE`: `WS_EXCEPTION_CODE` = -1069744127;
public const val `WS_EXCEPTION_CODE_USAGE_FAILURE`: `WS_EXCEPTION_CODE` = -1069744128;
public const val `WS_EXCLUSIVE_WITH_COMMENTS_XML_CANONICALIZATION_ALGORITHM`: `WS_XML_CANONICALIZATION_ALGORITHM` = 1;
public const val `WS_EXCLUSIVE_XML_CANONICALIZATION_ALGORITHM`: `WS_XML_CANONICALIZATION_ALGORITHM` = 0;
public typealias `WS_EXTENDED_PROTECTION_POLICY` = Int;
public const val `WS_EXTENDED_PROTECTION_POLICY_ALWAYS`: `WS_EXTENDED_PROTECTION_POLICY` = 3;
public const val `WS_EXTENDED_PROTECTION_POLICY_NEVER`: `WS_EXTENDED_PROTECTION_POLICY` = 1;
public const val `WS_EXTENDED_PROTECTION_POLICY_WHEN_SUPPORTED`: `WS_EXTENDED_PROTECTION_POLICY` = 2;
public typealias `WS_EXTENDED_PROTECTION_SCENARIO` = Int;
public const val `WS_EXTENDED_PROTECTION_SCENARIO_BOUND_SERVER`: `WS_EXTENDED_PROTECTION_SCENARIO` = 1;
public const val `WS_EXTENDED_PROTECTION_SCENARIO_TERMINATED_SSL`: `WS_EXTENDED_PROTECTION_SCENARIO` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_FAULT` (
    public var `code`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_FAULT_CODE`>?,
    public var `reasons`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_FAULT_REASON`>?,
    public var `reasonCount`: UInt,
    public var `actor`: `WS_STRING`,
    public var `node`: `WS_STRING`,
    public var `detail`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_BUFFER`>?,
)
// UNSUPPORTED Rust 1438:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_FAULT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_FAULT_CODE` (
    public var `value`: `WS_XML_QNAME`,
    public var `subCode`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_FAULT_CODE`>?,
)
// UNSUPPORTED Rust 1449:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_FAULT_CODE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_FAULT_DESCRIPTION` (
    public var `envelopeVersion`: `WS_ENVELOPE_VERSION`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_FAULT_DETAIL_DESCRIPTION` (
    public var `action`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `detailElementDescription`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_ELEMENT_DESCRIPTION`>?,
)
// UNSUPPORTED Rust 1465:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_FAULT_DETAIL_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WS_FAULT_DISCLOSURE` = Int;
public const val `WS_FAULT_ERROR_PROPERTY_ACTION`: `WS_FAULT_ERROR_PROPERTY_ID` = 1;
public const val `WS_FAULT_ERROR_PROPERTY_FAULT`: `WS_FAULT_ERROR_PROPERTY_ID` = 0;
public const val `WS_FAULT_ERROR_PROPERTY_HEADER`: `WS_FAULT_ERROR_PROPERTY_ID` = 2;
public typealias `WS_FAULT_ERROR_PROPERTY_ID` = Int;
public const val `WS_FAULT_MESSAGE`: `WS_MESSAGE_INITIALIZATION` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_FAULT_REASON` (
    public var `text`: `WS_STRING`,
    public var `lang`: `WS_STRING`,
)
public const val `WS_FAULT_TO_HEADER`: `WS_HEADER_TYPE` = 7;
public const val `WS_FAULT_TYPE`: `WS_TYPE` = 29;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_FIELD_DESCRIPTION` (
    public var `mapping`: `WS_FIELD_MAPPING`,
    public var `localName`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `ns`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `type`: `WS_TYPE`,
    public var `typeDescription`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `offset`: UInt,
    public var `options`: UInt,
    public var `defaultValue`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_DEFAULT_VALUE`>?,
    public var `countOffset`: UInt,
    public var `itemLocalName`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `itemNs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `itemRange`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_ITEM_RANGE`>?,
)
// UNSUPPORTED Rust 1500:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_FIELD_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WS_FIELD_MAPPING` = Int;
public const val `WS_FIELD_NILLABLE`: Int = 4;
public const val `WS_FIELD_NILLABLE_ITEM`: Int = 8;
public const val `WS_FIELD_OPTIONAL`: Int = 2;
public const val `WS_FIELD_OTHER_NAMESPACE`: Int = 16;
public const val `WS_FIELD_POINTER`: Int = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_FLOAT_DESCRIPTION` (
    public var `minValue`: Float,
    public var `maxValue`: Float,
)
public const val `WS_FLOAT_TYPE`: `WS_TYPE` = 9;
public const val `WS_FLOAT_VALUE_TYPE`: `WS_VALUE_TYPE` = 9;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_FREE_CHANNEL_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_FREE_DECODER_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_FREE_ENCODER_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_FREE_LISTENER_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
public const val `WS_FROM_HEADER`: `WS_HEADER_TYPE` = 5;
public const val `WS_FULL_FAULT_DISCLOSURE`: `WS_FAULT_DISCLOSURE` = 1;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
public typealias `WS_GET_CERT_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ENDPOINT_ADDRESS`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_STRING`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`Cryptography`.`CERT_CONTEXT`>>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_GET_CHANNEL_PROPERTY_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `WS_CHANNEL_PROPERTY_ID`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_GET_LISTENER_PROPERTY_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `WS_LISTENER_PROPERTY_ID`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_GUID_DESCRIPTION` (
    public var `value`: `windows_sys`.`core`.`GUID`,
)
public const val `WS_GUID_TYPE`: `WS_TYPE` = 14;
public const val `WS_GUID_VALUE_TYPE`: `WS_VALUE_TYPE` = 14;
public typealias `WS_HEADER_TYPE` = Int;
public typealias `WS_HEAP` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_HEAP_PROPERTIES` (
    public var `properties`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_HEAP_PROPERTY`>?,
    public var `propertyCount`: UInt,
)
// UNSUPPORTED Rust 1544:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_HEAP_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_HEAP_PROPERTY` (
    public var `id`: `WS_HEAP_PROPERTY_ID`,
    public var `value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `valueSize`: UInt,
)
// UNSUPPORTED Rust 1556:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_HEAP_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_HEAP_PROPERTY_ACTUAL_SIZE`: `WS_HEAP_PROPERTY_ID` = 3;
public typealias `WS_HEAP_PROPERTY_ID` = Int;
public const val `WS_HEAP_PROPERTY_MAX_SIZE`: `WS_HEAP_PROPERTY_ID` = 0;
public const val `WS_HEAP_PROPERTY_REQUESTED_SIZE`: `WS_HEAP_PROPERTY_ID` = 2;
public const val `WS_HEAP_PROPERTY_TRIM_SIZE`: `WS_HEAP_PROPERTY_ID` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_HOST_NAMES` (
    public var `hostNames`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_STRING`>?,
    public var `hostNameCount`: UInt,
)
// UNSUPPORTED Rust 1572:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_HOST_NAMES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_HTTPS_URL` (
    public var `url`: `WS_URL`,
    public var `host`: `WS_STRING`,
    public var `port`: UShort,
    public var `portAsString`: `WS_STRING`,
    public var `path`: `WS_STRING`,
    public var `query`: `WS_STRING`,
    public var `fragment`: `WS_STRING`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_HTTP_BINDING_TEMPLATE` (
    public var `channelProperties`: `WS_CHANNEL_PROPERTIES`,
)
public const val `WS_HTTP_BINDING_TEMPLATE_TYPE`: `WS_BINDING_TEMPLATE_TYPE` = 0;
public const val `WS_HTTP_CHANNEL_BINDING`: `WS_CHANNEL_BINDING` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_HTTP_HEADER_AUTH_BINDING_TEMPLATE` (
    public var `channelProperties`: `WS_CHANNEL_PROPERTIES`,
    public var `securityProperties`: `WS_SECURITY_PROPERTIES`,
    public var `httpHeaderAuthSecurityBinding`: `WS_HTTP_HEADER_AUTH_SECURITY_BINDING_TEMPLATE`,
)
public const val `WS_HTTP_HEADER_AUTH_BINDING_TEMPLATE_TYPE`: `WS_BINDING_TEMPLATE_TYPE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_HTTP_HEADER_AUTH_POLICY_DESCRIPTION` (
    public var `channelProperties`: `WS_CHANNEL_PROPERTIES`,
    public var `securityProperties`: `WS_SECURITY_PROPERTIES`,
    public var `httpHeaderAuthSecurityBinding`: `WS_HTTP_HEADER_AUTH_SECURITY_BINDING_POLICY_DESCRIPTION`,
)
public const val `WS_HTTP_HEADER_AUTH_SCHEME_BASIC`: Int = 2;
public const val `WS_HTTP_HEADER_AUTH_SCHEME_DIGEST`: Int = 4;
public const val `WS_HTTP_HEADER_AUTH_SCHEME_NEGOTIATE`: Int = 16;
public const val `WS_HTTP_HEADER_AUTH_SCHEME_NONE`: Int = 1;
public const val `WS_HTTP_HEADER_AUTH_SCHEME_NTLM`: Int = 8;
public const val `WS_HTTP_HEADER_AUTH_SCHEME_PASSPORT`: Int = 32;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_HTTP_HEADER_AUTH_SECURITY_BINDING` (
    public var `binding`: `WS_SECURITY_BINDING`,
    public var `clientCredential`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL`>?,
)
// UNSUPPORTED Rust 1622:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_HTTP_HEADER_AUTH_SECURITY_BINDING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_HTTP_HEADER_AUTH_SECURITY_BINDING_CONSTRAINT` (
    public var `bindingConstraint`: `WS_SECURITY_BINDING_CONSTRAINT`,
)
public const val `WS_HTTP_HEADER_AUTH_SECURITY_BINDING_CONSTRAINT_TYPE`: `WS_SECURITY_BINDING_CONSTRAINT_TYPE` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_HTTP_HEADER_AUTH_SECURITY_BINDING_POLICY_DESCRIPTION` (
    public var `securityBindingProperties`: `WS_SECURITY_BINDING_PROPERTIES`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_HTTP_HEADER_AUTH_SECURITY_BINDING_TEMPLATE` (
    public var `securityBindingProperties`: `WS_SECURITY_BINDING_PROPERTIES`,
    public var `clientCredential`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL`>?,
)
// UNSUPPORTED Rust 1644:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_HTTP_HEADER_AUTH_SECURITY_BINDING_TEMPLATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_HTTP_HEADER_AUTH_SECURITY_BINDING_TYPE`: `WS_SECURITY_BINDING_TYPE` = 3;
public typealias `WS_HTTP_HEADER_AUTH_TARGET` = Int;
public const val `WS_HTTP_HEADER_AUTH_TARGET_PROXY`: `WS_HTTP_HEADER_AUTH_TARGET` = 2;
public const val `WS_HTTP_HEADER_AUTH_TARGET_SERVICE`: `WS_HTTP_HEADER_AUTH_TARGET` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_HTTP_HEADER_MAPPING` (
    public var `headerName`: `WS_XML_STRING`,
    public var `headerMappingOptions`: UInt,
)
public const val `WS_HTTP_HEADER_MAPPING_COMMA_SEPARATOR`: Int = 1;
public const val `WS_HTTP_HEADER_MAPPING_QUOTED_VALUE`: Int = 4;
public const val `WS_HTTP_HEADER_MAPPING_SEMICOLON_SEPARATOR`: Int = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_HTTP_MESSAGE_MAPPING` (
    public var `requestMappingOptions`: UInt,
    public var `responseMappingOptions`: UInt,
    public var `requestHeaderMappings`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_HTTP_HEADER_MAPPING`>>?,
    public var `requestHeaderMappingCount`: UInt,
    public var `responseHeaderMappings`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_HTTP_HEADER_MAPPING`>>?,
    public var `responseHeaderMappingCount`: UInt,
)
// UNSUPPORTED Rust 1672:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_HTTP_MESSAGE_MAPPING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_HTTP_POLICY_DESCRIPTION` (
    public var `channelProperties`: `WS_CHANNEL_PROPERTIES`,
)
public typealias `WS_HTTP_PROXY_SETTING_MODE` = Int;
public const val `WS_HTTP_PROXY_SETTING_MODE_AUTO`: `WS_HTTP_PROXY_SETTING_MODE` = 1;
public const val `WS_HTTP_PROXY_SETTING_MODE_CUSTOM`: `WS_HTTP_PROXY_SETTING_MODE` = 3;
public const val `WS_HTTP_PROXY_SETTING_MODE_NONE`: `WS_HTTP_PROXY_SETTING_MODE` = 2;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_HTTP_REDIRECT_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_STRING`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_HTTP_REDIRECT_CALLBACK_CONTEXT` (
    public var `callback`: `WS_HTTP_REDIRECT_CALLBACK`,
    public var `state`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1693:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_HTTP_REDIRECT_CALLBACK_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_HTTP_REQUEST_MAPPING_VERB`: Int = 2;
public const val `WS_HTTP_RESPONSE_MAPPING_STATUS_CODE`: Int = 1;
public const val `WS_HTTP_RESPONSE_MAPPING_STATUS_TEXT`: Int = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_HTTP_SSL_BINDING_TEMPLATE` (
    public var `channelProperties`: `WS_CHANNEL_PROPERTIES`,
    public var `securityProperties`: `WS_SECURITY_PROPERTIES`,
    public var `sslTransportSecurityBinding`: `WS_SSL_TRANSPORT_SECURITY_BINDING_TEMPLATE`,
)
public const val `WS_HTTP_SSL_BINDING_TEMPLATE_TYPE`: `WS_BINDING_TEMPLATE_TYPE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_HTTP_SSL_HEADER_AUTH_BINDING_TEMPLATE` (
    public var `channelProperties`: `WS_CHANNEL_PROPERTIES`,
    public var `securityProperties`: `WS_SECURITY_PROPERTIES`,
    public var `sslTransportSecurityBinding`: `WS_SSL_TRANSPORT_SECURITY_BINDING_TEMPLATE`,
    public var `httpHeaderAuthSecurityBinding`: `WS_HTTP_HEADER_AUTH_SECURITY_BINDING_TEMPLATE`,
)
public const val `WS_HTTP_SSL_HEADER_AUTH_BINDING_TEMPLATE_TYPE`: `WS_BINDING_TEMPLATE_TYPE` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_HTTP_SSL_HEADER_AUTH_POLICY_DESCRIPTION` (
    public var `channelProperties`: `WS_CHANNEL_PROPERTIES`,
    public var `securityProperties`: `WS_SECURITY_PROPERTIES`,
    public var `sslTransportSecurityBinding`: `WS_SSL_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION`,
    public var `httpHeaderAuthSecurityBinding`: `WS_HTTP_HEADER_AUTH_SECURITY_BINDING_POLICY_DESCRIPTION`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_HTTP_SSL_KERBEROS_APREQ_BINDING_TEMPLATE` (
    public var `channelProperties`: `WS_CHANNEL_PROPERTIES`,
    public var `securityProperties`: `WS_SECURITY_PROPERTIES`,
    public var `sslTransportSecurityBinding`: `WS_SSL_TRANSPORT_SECURITY_BINDING_TEMPLATE`,
    public var `kerberosApreqMessageSecurityBinding`: `WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_TEMPLATE`,
)
public const val `WS_HTTP_SSL_KERBEROS_APREQ_BINDING_TEMPLATE_TYPE`: `WS_BINDING_TEMPLATE_TYPE` = 5;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_HTTP_SSL_KERBEROS_APREQ_POLICY_DESCRIPTION` (
    public var `channelProperties`: `WS_CHANNEL_PROPERTIES`,
    public var `securityProperties`: `WS_SECURITY_PROPERTIES`,
    public var `sslTransportSecurityBinding`: `WS_SSL_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION`,
    public var `kerberosApreqMessageSecurityBinding`: `WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_HTTP_SSL_KERBEROS_APREQ_SECURITY_CONTEXT_BINDING_TEMPLATE` (
    public var `channelProperties`: `WS_CHANNEL_PROPERTIES`,
    public var `securityProperties`: `WS_SECURITY_PROPERTIES`,
    public var `sslTransportSecurityBinding`: `WS_SSL_TRANSPORT_SECURITY_BINDING_TEMPLATE`,
    public var `kerberosApreqMessageSecurityBinding`: `WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_TEMPLATE`,
    public var `securityContextSecurityBinding`: `WS_SECURITY_CONTEXT_SECURITY_BINDING_TEMPLATE`,
)
public const val `WS_HTTP_SSL_KERBEROS_APREQ_SECURITY_CONTEXT_BINDING_TEMPLATE_TYPE`: `WS_BINDING_TEMPLATE_TYPE` = 11;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_HTTP_SSL_KERBEROS_APREQ_SECURITY_CONTEXT_POLICY_DESCRIPTION` (
    public var `channelProperties`: `WS_CHANNEL_PROPERTIES`,
    public var `securityProperties`: `WS_SECURITY_PROPERTIES`,
    public var `sslTransportSecurityBinding`: `WS_SSL_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION`,
    public var `kerberosApreqMessageSecurityBinding`: `WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION`,
    public var `securityContextSecurityBinding`: `WS_SECURITY_CONTEXT_SECURITY_BINDING_POLICY_DESCRIPTION`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_HTTP_SSL_POLICY_DESCRIPTION` (
    public var `channelProperties`: `WS_CHANNEL_PROPERTIES`,
    public var `securityProperties`: `WS_SECURITY_PROPERTIES`,
    public var `sslTransportSecurityBinding`: `WS_SSL_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_HTTP_SSL_USERNAME_BINDING_TEMPLATE` (
    public var `channelProperties`: `WS_CHANNEL_PROPERTIES`,
    public var `securityProperties`: `WS_SECURITY_PROPERTIES`,
    public var `sslTransportSecurityBinding`: `WS_SSL_TRANSPORT_SECURITY_BINDING_TEMPLATE`,
    public var `usernameMessageSecurityBinding`: `WS_USERNAME_MESSAGE_SECURITY_BINDING_TEMPLATE`,
)
public const val `WS_HTTP_SSL_USERNAME_BINDING_TEMPLATE_TYPE`: `WS_BINDING_TEMPLATE_TYPE` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_HTTP_SSL_USERNAME_POLICY_DESCRIPTION` (
    public var `channelProperties`: `WS_CHANNEL_PROPERTIES`,
    public var `securityProperties`: `WS_SECURITY_PROPERTIES`,
    public var `sslTransportSecurityBinding`: `WS_SSL_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION`,
    public var `usernameMessageSecurityBinding`: `WS_USERNAME_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_HTTP_SSL_USERNAME_SECURITY_CONTEXT_BINDING_TEMPLATE` (
    public var `channelProperties`: `WS_CHANNEL_PROPERTIES`,
    public var `securityProperties`: `WS_SECURITY_PROPERTIES`,
    public var `sslTransportSecurityBinding`: `WS_SSL_TRANSPORT_SECURITY_BINDING_TEMPLATE`,
    public var `usernameMessageSecurityBinding`: `WS_USERNAME_MESSAGE_SECURITY_BINDING_TEMPLATE`,
    public var `securityContextSecurityBinding`: `WS_SECURITY_CONTEXT_SECURITY_BINDING_TEMPLATE`,
)
public const val `WS_HTTP_SSL_USERNAME_SECURITY_CONTEXT_BINDING_TEMPLATE_TYPE`: `WS_BINDING_TEMPLATE_TYPE` = 10;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_HTTP_SSL_USERNAME_SECURITY_CONTEXT_POLICY_DESCRIPTION` (
    public var `channelProperties`: `WS_CHANNEL_PROPERTIES`,
    public var `securityProperties`: `WS_SECURITY_PROPERTIES`,
    public var `sslTransportSecurityBinding`: `WS_SSL_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION`,
    public var `usernameMessageSecurityBinding`: `WS_USERNAME_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION`,
    public var `securityContextSecurityBinding`: `WS_SECURITY_CONTEXT_SECURITY_BINDING_POLICY_DESCRIPTION`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_HTTP_URL` (
    public var `url`: `WS_URL`,
    public var `host`: `WS_STRING`,
    public var `port`: UShort,
    public var `portAsString`: `WS_STRING`,
    public var `path`: `WS_STRING`,
    public var `query`: `WS_STRING`,
    public var `fragment`: `WS_STRING`,
)
public const val `WS_INCLUSIVE_WITH_COMMENTS_XML_CANONICALIZATION_ALGORITHM`: `WS_XML_CANONICALIZATION_ALGORITHM` = 3;
public const val `WS_INCLUSIVE_XML_CANONICALIZATION_ALGORITHM`: `WS_XML_CANONICALIZATION_ALGORITHM` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_INT16_DESCRIPTION` (
    public var `minValue`: Short,
    public var `maxValue`: Short,
)
public const val `WS_INT16_TYPE`: `WS_TYPE` = 2;
public const val `WS_INT16_VALUE_TYPE`: `WS_VALUE_TYPE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_INT32_DESCRIPTION` (
    public var `minValue`: Int,
    public var `maxValue`: Int,
)
public const val `WS_INT32_TYPE`: `WS_TYPE` = 3;
public const val `WS_INT32_VALUE_TYPE`: `WS_VALUE_TYPE` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_INT64_DESCRIPTION` (
    public var `minValue`: Long,
    public var `maxValue`: Long,
)
public const val `WS_INT64_TYPE`: `WS_TYPE` = 4;
public const val `WS_INT64_VALUE_TYPE`: `WS_VALUE_TYPE` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_INT8_DESCRIPTION` (
    public var `minValue`: Byte,
    public var `maxValue`: Byte,
)
public const val `WS_INT8_TYPE`: `WS_TYPE` = 1;
public const val `WS_INT8_VALUE_TYPE`: `WS_VALUE_TYPE` = 1;
public typealias `WS_IP_VERSION` = Int;
public const val `WS_IP_VERSION_4`: `WS_IP_VERSION` = 1;
public const val `WS_IP_VERSION_6`: `WS_IP_VERSION` = 2;
public const val `WS_IP_VERSION_AUTO`: `WS_IP_VERSION` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_ISSUED_TOKEN_MESSAGE_SECURITY_BINDING_CONSTRAINT` (
    public var `bindingConstraint`: `WS_SECURITY_BINDING_CONSTRAINT`,
    public var `bindingUsage`: `WS_MESSAGE_SECURITY_USAGE`,
    public var `claimConstraints`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `claimConstraintCount`: UInt,
    public var `requestSecurityTokenPropertyConstraints`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_REQUEST_SECURITY_TOKEN_PROPERTY_CONSTRAINT`>?,
    public var `requestSecurityTokenPropertyConstraintCount`: UInt,
    public var `out`: `WS_ISSUED_TOKEN_MESSAGE_SECURITY_BINDING_CONSTRAINT_0`,
)
// UNSUPPORTED Rust 1865:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_ISSUED_TOKEN_MESSAGE_SECURITY_BINDING_CONSTRAINT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_ISSUED_TOKEN_MESSAGE_SECURITY_BINDING_CONSTRAINT_0` (
    public var `issuerAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_ENDPOINT_ADDRESS`>?,
    public var `requestSecurityTokenTemplate`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_BUFFER`>?,
)
// UNSUPPORTED Rust 1876:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_ISSUED_TOKEN_MESSAGE_SECURITY_BINDING_CONSTRAINT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_ISSUED_TOKEN_MESSAGE_SECURITY_BINDING_CONSTRAINT_TYPE`: `WS_SECURITY_BINDING_CONSTRAINT_TYPE` = 6;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_IS_DEFAULT_VALUE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_ITEM_RANGE` (
    public var `minItemCount`: UInt,
    public var `maxItemCount`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING` (
    public var `binding`: `WS_SECURITY_BINDING`,
    public var `bindingUsage`: `WS_MESSAGE_SECURITY_USAGE`,
    public var `clientCredential`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL`>?,
)
// UNSUPPORTED Rust 1896:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_CONSTRAINT` (
    public var `bindingConstraint`: `WS_SECURITY_BINDING_CONSTRAINT`,
    public var `bindingUsage`: `WS_MESSAGE_SECURITY_USAGE`,
)
public const val `WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_CONSTRAINT_TYPE`: `WS_SECURITY_BINDING_CONSTRAINT_TYPE` = 5;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION` (
    public var `securityBindingProperties`: `WS_SECURITY_BINDING_PROPERTIES`,
    public var `bindingUsage`: `WS_MESSAGE_SECURITY_USAGE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_TEMPLATE` (
    public var `securityBindingProperties`: `WS_SECURITY_BINDING_PROPERTIES`,
    public var `clientCredential`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL`>?,
)
// UNSUPPORTED Rust 1920:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_TEMPLATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_TYPE`: `WS_SECURITY_BINDING_TYPE` = 5;
public typealias `WS_LISTENER` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_LISTENER_PROPERTIES` (
    public var `properties`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_LISTENER_PROPERTY`>?,
    public var `propertyCount`: UInt,
)
// UNSUPPORTED Rust 1933:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_LISTENER_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_LISTENER_PROPERTY` (
    public var `id`: `WS_LISTENER_PROPERTY_ID`,
    public var `value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `valueSize`: UInt,
)
// UNSUPPORTED Rust 1945:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_LISTENER_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_LISTENER_PROPERTY_ASYNC_CALLBACK_MODEL`: `WS_LISTENER_PROPERTY_ID` = 3;
public const val `WS_LISTENER_PROPERTY_CHANNEL_BINDING`: `WS_LISTENER_PROPERTY_ID` = 5;
public const val `WS_LISTENER_PROPERTY_CHANNEL_TYPE`: `WS_LISTENER_PROPERTY_ID` = 4;
public const val `WS_LISTENER_PROPERTY_CLOSE_TIMEOUT`: `WS_LISTENER_PROPERTY_ID` = 10;
public const val `WS_LISTENER_PROPERTY_CONNECT_TIMEOUT`: `WS_LISTENER_PROPERTY_ID` = 6;
public const val `WS_LISTENER_PROPERTY_CUSTOM_LISTENER_CALLBACKS`: `WS_LISTENER_PROPERTY_ID` = 13;
public const val `WS_LISTENER_PROPERTY_CUSTOM_LISTENER_INSTANCE`: `WS_LISTENER_PROPERTY_ID` = 15;
public const val `WS_LISTENER_PROPERTY_CUSTOM_LISTENER_PARAMETERS`: `WS_LISTENER_PROPERTY_ID` = 14;
public const val `WS_LISTENER_PROPERTY_DISALLOWED_USER_AGENT`: `WS_LISTENER_PROPERTY_ID` = 16;
public typealias `WS_LISTENER_PROPERTY_ID` = Int;
public const val `WS_LISTENER_PROPERTY_IP_VERSION`: `WS_LISTENER_PROPERTY_ID` = 1;
public const val `WS_LISTENER_PROPERTY_IS_MULTICAST`: `WS_LISTENER_PROPERTY_ID` = 7;
public const val `WS_LISTENER_PROPERTY_LISTEN_BACKLOG`: `WS_LISTENER_PROPERTY_ID` = 0;
public const val `WS_LISTENER_PROPERTY_MULTICAST_INTERFACES`: `WS_LISTENER_PROPERTY_ID` = 8;
public const val `WS_LISTENER_PROPERTY_MULTICAST_LOOPBACK`: `WS_LISTENER_PROPERTY_ID` = 9;
public const val `WS_LISTENER_PROPERTY_STATE`: `WS_LISTENER_PROPERTY_ID` = 2;
public const val `WS_LISTENER_PROPERTY_TO_HEADER_MATCHING_OPTIONS`: `WS_LISTENER_PROPERTY_ID` = 11;
public const val `WS_LISTENER_PROPERTY_TRANSPORT_URL_MATCHING_OPTIONS`: `WS_LISTENER_PROPERTY_ID` = 12;
public typealias `WS_LISTENER_STATE` = Int;
public const val `WS_LISTENER_STATE_CLOSED`: `WS_LISTENER_STATE` = 5;
public const val `WS_LISTENER_STATE_CLOSING`: `WS_LISTENER_STATE` = 4;
public const val `WS_LISTENER_STATE_CREATED`: `WS_LISTENER_STATE` = 0;
public const val `WS_LISTENER_STATE_FAULTED`: `WS_LISTENER_STATE` = 3;
public const val `WS_LISTENER_STATE_OPEN`: `WS_LISTENER_STATE` = 2;
public const val `WS_LISTENER_STATE_OPENING`: `WS_LISTENER_STATE` = 1;
public const val `WS_LONG_CALLBACK`: `WS_CALLBACK_MODEL` = 1;
public const val `WS_MANUAL_COOKIE_MODE`: `WS_COOKIE_MODE` = 1;
public const val `WS_MATCH_URL_DNS_FULLY_QUALIFIED_HOST`: Int = 2;
public const val `WS_MATCH_URL_DNS_HOST`: Int = 1;
public const val `WS_MATCH_URL_EXACT_PATH`: Int = 64;
public const val `WS_MATCH_URL_HOST_ADDRESSES`: Int = 16;
public const val `WS_MATCH_URL_LOCAL_HOST`: Int = 8;
public const val `WS_MATCH_URL_NETBIOS_HOST`: Int = 4;
public const val `WS_MATCH_URL_NO_QUERY`: Int = 256;
public const val `WS_MATCH_URL_PORT`: Int = 32;
public const val `WS_MATCH_URL_PREFIX_PATH`: Int = 128;
public const val `WS_MATCH_URL_THIS_HOST`: Int = 31;
public typealias `WS_MESSAGE` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_MESSAGE_DESCRIPTION` (
    public var `action`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `bodyElementDescription`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_ELEMENT_DESCRIPTION`>?,
)
// UNSUPPORTED Rust 1994:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_MESSAGE_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_MESSAGE_DONE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
public const val `WS_MESSAGE_ID_HEADER`: `WS_HEADER_TYPE` = 3;
public typealias `WS_MESSAGE_INITIALIZATION` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_MESSAGE_PROPERTIES` (
    public var `properties`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_MESSAGE_PROPERTY`>?,
    public var `propertyCount`: UInt,
)
// UNSUPPORTED Rust 2008:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_MESSAGE_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_MESSAGE_PROPERTY` (
    public var `id`: `WS_MESSAGE_PROPERTY_ID`,
    public var `value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `valueSize`: UInt,
)
// UNSUPPORTED Rust 2020:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_MESSAGE_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_MESSAGE_PROPERTY_ADDRESSING_VERSION`: `WS_MESSAGE_PROPERTY_ID` = 3;
public const val `WS_MESSAGE_PROPERTY_BODY_READER`: `WS_MESSAGE_PROPERTY_ID` = 6;
public const val `WS_MESSAGE_PROPERTY_BODY_WRITER`: `WS_MESSAGE_PROPERTY_ID` = 7;
public const val `WS_MESSAGE_PROPERTY_ENCODED_CERT`: `WS_MESSAGE_PROPERTY_ID` = 15;
public const val `WS_MESSAGE_PROPERTY_ENVELOPE_VERSION`: `WS_MESSAGE_PROPERTY_ID` = 2;
public const val `WS_MESSAGE_PROPERTY_HEADER_BUFFER`: `WS_MESSAGE_PROPERTY_ID` = 4;
public const val `WS_MESSAGE_PROPERTY_HEADER_POSITION`: `WS_MESSAGE_PROPERTY_ID` = 5;
public const val `WS_MESSAGE_PROPERTY_HEAP`: `WS_MESSAGE_PROPERTY_ID` = 1;
public const val `WS_MESSAGE_PROPERTY_HEAP_PROPERTIES`: `WS_MESSAGE_PROPERTY_ID` = 9;
public const val `WS_MESSAGE_PROPERTY_HTTP_HEADER_AUTH_WINDOWS_TOKEN`: `WS_MESSAGE_PROPERTY_ID` = 17;
public typealias `WS_MESSAGE_PROPERTY_ID` = Int;
public const val `WS_MESSAGE_PROPERTY_IS_ADDRESSED`: `WS_MESSAGE_PROPERTY_ID` = 8;
public const val `WS_MESSAGE_PROPERTY_IS_FAULT`: `WS_MESSAGE_PROPERTY_ID` = 12;
public const val `WS_MESSAGE_PROPERTY_MAX_PROCESSED_HEADERS`: `WS_MESSAGE_PROPERTY_ID` = 13;
public const val `WS_MESSAGE_PROPERTY_MESSAGE_SECURITY_WINDOWS_TOKEN`: `WS_MESSAGE_PROPERTY_ID` = 18;
public const val `WS_MESSAGE_PROPERTY_PROTECTION_LEVEL`: `WS_MESSAGE_PROPERTY_ID` = 21;
public const val `WS_MESSAGE_PROPERTY_SAML_ASSERTION`: `WS_MESSAGE_PROPERTY_ID` = 19;
public const val `WS_MESSAGE_PROPERTY_SECURITY_CONTEXT`: `WS_MESSAGE_PROPERTY_ID` = 20;
public const val `WS_MESSAGE_PROPERTY_STATE`: `WS_MESSAGE_PROPERTY_ID` = 0;
public const val `WS_MESSAGE_PROPERTY_TRANSPORT_SECURITY_WINDOWS_TOKEN`: `WS_MESSAGE_PROPERTY_ID` = 16;
public const val `WS_MESSAGE_PROPERTY_USERNAME`: `WS_MESSAGE_PROPERTY_ID` = 14;
public const val `WS_MESSAGE_PROPERTY_XML_READER_PROPERTIES`: `WS_MESSAGE_PROPERTY_ID` = 10;
public const val `WS_MESSAGE_PROPERTY_XML_WRITER_PROPERTIES`: `WS_MESSAGE_PROPERTY_ID` = 11;
public typealias `WS_MESSAGE_SECURITY_USAGE` = Int;
public typealias `WS_MESSAGE_STATE` = Int;
public const val `WS_MESSAGE_STATE_DONE`: `WS_MESSAGE_STATE` = 5;
public const val `WS_MESSAGE_STATE_EMPTY`: `WS_MESSAGE_STATE` = 1;
public const val `WS_MESSAGE_STATE_INITIALIZED`: `WS_MESSAGE_STATE` = 2;
public const val `WS_MESSAGE_STATE_READING`: `WS_MESSAGE_STATE` = 3;
public const val `WS_MESSAGE_STATE_WRITING`: `WS_MESSAGE_STATE` = 4;
public typealias `WS_METADATA` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_METADATA_ENDPOINT` (
    public var `endpointAddress`: `WS_ENDPOINT_ADDRESS`,
    public var `endpointPolicy`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_POLICY`>?,
    public var `portName`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `serviceName`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `serviceNs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `bindingName`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `bindingNs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `portTypeName`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `portTypeNs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
)
// UNSUPPORTED Rust 2069:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_METADATA_ENDPOINT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_METADATA_ENDPOINTS` (
    public var `endpoints`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_METADATA_ENDPOINT`>?,
    public var `endpointCount`: UInt,
)
// UNSUPPORTED Rust 2080:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_METADATA_ENDPOINTS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WS_METADATA_EXCHANGE_TYPE` = Int;
public const val `WS_METADATA_EXCHANGE_TYPE_HTTP_GET`: `WS_METADATA_EXCHANGE_TYPE` = 2;
public const val `WS_METADATA_EXCHANGE_TYPE_MEX`: `WS_METADATA_EXCHANGE_TYPE` = 1;
public const val `WS_METADATA_EXCHANGE_TYPE_NONE`: `WS_METADATA_EXCHANGE_TYPE` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_METADATA_PROPERTY` (
    public var `id`: `WS_METADATA_PROPERTY_ID`,
    public var `value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `valueSize`: UInt,
)
// UNSUPPORTED Rust 2096:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_METADATA_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_METADATA_PROPERTY_HEAP_PROPERTIES`: `WS_METADATA_PROPERTY_ID` = 2;
public const val `WS_METADATA_PROPERTY_HEAP_REQUESTED_SIZE`: `WS_METADATA_PROPERTY_ID` = 4;
public const val `WS_METADATA_PROPERTY_HOST_NAMES`: `WS_METADATA_PROPERTY_ID` = 6;
public typealias `WS_METADATA_PROPERTY_ID` = Int;
public const val `WS_METADATA_PROPERTY_MAX_DOCUMENTS`: `WS_METADATA_PROPERTY_ID` = 5;
public const val `WS_METADATA_PROPERTY_POLICY_PROPERTIES`: `WS_METADATA_PROPERTY_ID` = 3;
public const val `WS_METADATA_PROPERTY_STATE`: `WS_METADATA_PROPERTY_ID` = 1;
public const val `WS_METADATA_PROPERTY_VERIFY_HOST_NAMES`: `WS_METADATA_PROPERTY_ID` = 7;
public typealias `WS_METADATA_STATE` = Int;
public const val `WS_METADATA_STATE_CREATED`: `WS_METADATA_STATE` = 1;
public const val `WS_METADATA_STATE_FAULTED`: `WS_METADATA_STATE` = 3;
public const val `WS_METADATA_STATE_RESOLVED`: `WS_METADATA_STATE` = 2;
public const val `WS_MINIMAL_FAULT_DISCLOSURE`: `WS_FAULT_DISCLOSURE` = 0;
public typealias `WS_MOVE_TO` = Int;
public const val `WS_MOVE_TO_BOF`: `WS_MOVE_TO` = 9;
public const val `WS_MOVE_TO_CHILD_ELEMENT`: `WS_MOVE_TO` = 3;
public const val `WS_MOVE_TO_CHILD_NODE`: `WS_MOVE_TO` = 11;
public const val `WS_MOVE_TO_END_ELEMENT`: `WS_MOVE_TO` = 4;
public const val `WS_MOVE_TO_EOF`: `WS_MOVE_TO` = 10;
public const val `WS_MOVE_TO_FIRST_NODE`: `WS_MOVE_TO` = 8;
public const val `WS_MOVE_TO_NEXT_ELEMENT`: `WS_MOVE_TO` = 1;
public const val `WS_MOVE_TO_NEXT_NODE`: `WS_MOVE_TO` = 6;
public const val `WS_MOVE_TO_PARENT_ELEMENT`: `WS_MOVE_TO` = 5;
public const val `WS_MOVE_TO_PREVIOUS_ELEMENT`: `WS_MOVE_TO` = 2;
public const val `WS_MOVE_TO_PREVIOUS_NODE`: `WS_MOVE_TO` = 7;
public const val `WS_MOVE_TO_ROOT_ELEMENT`: `WS_MOVE_TO` = 0;
public const val `WS_MUST_UNDERSTAND_HEADER_ATTRIBUTE`: Int = 1;
public const val `WS_NAMEDPIPE_CHANNEL_BINDING`: `WS_CHANNEL_BINDING` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_NAMEDPIPE_SSPI_TRANSPORT_SECURITY_BINDING` (
    public var `binding`: `WS_SECURITY_BINDING`,
    public var `clientCredential`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL`>?,
)
// UNSUPPORTED Rust 2135:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_NAMEDPIPE_SSPI_TRANSPORT_SECURITY_BINDING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_NAMEDPIPE_SSPI_TRANSPORT_SECURITY_BINDING_TYPE`: `WS_SECURITY_BINDING_TYPE` = 9;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_NCRYPT_ASYMMETRIC_SECURITY_KEY_HANDLE` (
    public var `keyHandle`: `WS_SECURITY_KEY_HANDLE`,
    public var `asymmetricKey`: `super`.`super`.`Security`.`Cryptography`.`NCRYPT_KEY_HANDLE`,
)
public const val `WS_NCRYPT_ASYMMETRIC_SECURITY_KEY_HANDLE_TYPE`: `WS_SECURITY_KEY_HANDLE_TYPE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_NETPIPE_URL` (
    public var `url`: `WS_URL`,
    public var `host`: `WS_STRING`,
    public var `port`: UShort,
    public var `portAsString`: `WS_STRING`,
    public var `path`: `WS_STRING`,
    public var `query`: `WS_STRING`,
    public var `fragment`: `WS_STRING`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_NETTCP_URL` (
    public var `url`: `WS_URL`,
    public var `host`: `WS_STRING`,
    public var `port`: UShort,
    public var `portAsString`: `WS_STRING`,
    public var `path`: `WS_STRING`,
    public var `query`: `WS_STRING`,
    public var `fragment`: `WS_STRING`,
)
public const val `WS_NON_RPC_LITERAL_OPERATION`: `WS_OPERATION_STYLE` = 0;
public const val `WS_NO_FIELD_MAPPING`: `WS_FIELD_MAPPING` = 5;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_OPAQUE_WINDOWS_INTEGRATED_AUTH_CREDENTIAL` (
    public var `credential`: `WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL`,
    public var `opaqueAuthIdentity`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 2179:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_OPAQUE_WINDOWS_INTEGRATED_AUTH_CREDENTIAL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_OPAQUE_WINDOWS_INTEGRATED_AUTH_CREDENTIAL_TYPE`: `WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL_TYPE` = 3;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_OPEN_CHANNEL_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ENDPOINT_ADDRESS`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_OPEN_LISTENER_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_OPERATION_CANCEL_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`WS_SERVICE_CANCEL_REASON`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
public typealias `WS_OPERATION_CONTEXT` = Long;
public const val `WS_OPERATION_CONTEXT_PROPERTY_CHANNEL`: `WS_OPERATION_CONTEXT_PROPERTY_ID` = 0;
public const val `WS_OPERATION_CONTEXT_PROPERTY_CHANNEL_USER_STATE`: `WS_OPERATION_CONTEXT_PROPERTY_ID` = 3;
public const val `WS_OPERATION_CONTEXT_PROPERTY_CONTRACT_DESCRIPTION`: `WS_OPERATION_CONTEXT_PROPERTY_ID` = 1;
public const val `WS_OPERATION_CONTEXT_PROPERTY_ENDPOINT_ADDRESS`: `WS_OPERATION_CONTEXT_PROPERTY_ID` = 8;
public const val `WS_OPERATION_CONTEXT_PROPERTY_HEAP`: `WS_OPERATION_CONTEXT_PROPERTY_ID` = 6;
public const val `WS_OPERATION_CONTEXT_PROPERTY_HOST_USER_STATE`: `WS_OPERATION_CONTEXT_PROPERTY_ID` = 2;
public typealias `WS_OPERATION_CONTEXT_PROPERTY_ID` = Int;
public const val `WS_OPERATION_CONTEXT_PROPERTY_INPUT_MESSAGE`: `WS_OPERATION_CONTEXT_PROPERTY_ID` = 4;
public const val `WS_OPERATION_CONTEXT_PROPERTY_LISTENER`: `WS_OPERATION_CONTEXT_PROPERTY_ID` = 7;
public const val `WS_OPERATION_CONTEXT_PROPERTY_OUTPUT_MESSAGE`: `WS_OPERATION_CONTEXT_PROPERTY_ID` = 5;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_OPERATION_DESCRIPTION` (
    public var `versionInfo`: UInt,
    public var `inputMessageDescription`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_MESSAGE_DESCRIPTION`>?,
    public var `outputMessageDescription`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_MESSAGE_DESCRIPTION`>?,
    public var `inputMessageOptions`: UInt,
    public var `outputMessageOptions`: UInt,
    public var `parameterCount`: UShort,
    public var `parameterDescription`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_PARAMETER_DESCRIPTION`>?,
    public var `stubCallback`: `WS_SERVICE_STUB_CALLBACK`,
    public var `style`: `WS_OPERATION_STYLE`,
)
// UNSUPPORTED Rust 2212:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_OPERATION_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_OPERATION_FREE_STATE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
public typealias `WS_OPERATION_STYLE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_PARAMETER_DESCRIPTION` (
    public var `parameterType`: `WS_PARAMETER_TYPE`,
    public var `inputMessageIndex`: UShort,
    public var `outputMessageIndex`: UShort,
)
public typealias `WS_PARAMETER_TYPE` = Int;
public const val `WS_PARAMETER_TYPE_ARRAY`: `WS_PARAMETER_TYPE` = 1;
public const val `WS_PARAMETER_TYPE_ARRAY_COUNT`: `WS_PARAMETER_TYPE` = 2;
public const val `WS_PARAMETER_TYPE_MESSAGES`: `WS_PARAMETER_TYPE` = 3;
public const val `WS_PARAMETER_TYPE_NORMAL`: `WS_PARAMETER_TYPE` = 0;
public typealias `WS_POLICY` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_POLICY_CONSTRAINTS` (
    public var `channelBinding`: `WS_CHANNEL_BINDING`,
    public var `channelPropertyConstraints`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_CHANNEL_PROPERTY_CONSTRAINT`>?,
    public var `channelPropertyConstraintCount`: UInt,
    public var `securityConstraints`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_SECURITY_CONSTRAINTS`>?,
    public var `policyExtensions`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_POLICY_EXTENSION`>>?,
    public var `policyExtensionCount`: UInt,
)
// UNSUPPORTED Rust 2242:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_POLICY_CONSTRAINTS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_POLICY_EXTENSION` (
    public var `type`: `WS_POLICY_EXTENSION_TYPE`,
)
public typealias `WS_POLICY_EXTENSION_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_POLICY_PROPERTIES` (
    public var `properties`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_POLICY_PROPERTY`>?,
    public var `propertyCount`: UInt,
)
// UNSUPPORTED Rust 2259:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_POLICY_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_POLICY_PROPERTY` (
    public var `id`: `WS_POLICY_PROPERTY_ID`,
    public var `value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `valueSize`: UInt,
)
// UNSUPPORTED Rust 2271:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_POLICY_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WS_POLICY_PROPERTY_ID` = Int;
public const val `WS_POLICY_PROPERTY_MAX_ALTERNATIVES`: `WS_POLICY_PROPERTY_ID` = 2;
public const val `WS_POLICY_PROPERTY_MAX_DEPTH`: `WS_POLICY_PROPERTY_ID` = 3;
public const val `WS_POLICY_PROPERTY_MAX_EXTENSIONS`: `WS_POLICY_PROPERTY_ID` = 4;
public const val `WS_POLICY_PROPERTY_STATE`: `WS_POLICY_PROPERTY_ID` = 1;
public typealias `WS_POLICY_STATE` = Int;
public const val `WS_POLICY_STATE_CREATED`: `WS_POLICY_STATE` = 1;
public const val `WS_POLICY_STATE_FAULTED`: `WS_POLICY_STATE` = 2;
public typealias `WS_PROTECTION_LEVEL` = Int;
public const val `WS_PROTECTION_LEVEL_NONE`: `WS_PROTECTION_LEVEL` = 1;
public const val `WS_PROTECTION_LEVEL_SIGN`: `WS_PROTECTION_LEVEL` = 2;
public const val `WS_PROTECTION_LEVEL_SIGN_AND_ENCRYPT`: `WS_PROTECTION_LEVEL` = 3;
public const val `WS_PROXY_FAULT_LANG_ID`: `WS_PROXY_PROPERTY_ID` = 6;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_PROXY_MESSAGE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_PROXY_MESSAGE_CALLBACK_CONTEXT` (
    public var `callback`: `WS_PROXY_MESSAGE_CALLBACK`,
    public var `state`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 2296:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_PROXY_MESSAGE_CALLBACK_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_PROXY_PROPERTY` (
    public var `id`: `WS_PROXY_PROPERTY_ID`,
    public var `value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `valueSize`: UInt,
)
// UNSUPPORTED Rust 2308:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_PROXY_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_PROXY_PROPERTY_CALL_TIMEOUT`: `WS_PROXY_PROPERTY_ID` = 0;
public typealias `WS_PROXY_PROPERTY_ID` = Int;
public const val `WS_PROXY_PROPERTY_MAX_CALL_POOL_SIZE`: `WS_PROXY_PROPERTY_ID` = 2;
public const val `WS_PROXY_PROPERTY_MAX_CLOSE_TIMEOUT`: `WS_PROXY_PROPERTY_ID` = 5;
public const val `WS_PROXY_PROPERTY_MAX_PENDING_CALLS`: `WS_PROXY_PROPERTY_ID` = 4;
public const val `WS_PROXY_PROPERTY_MESSAGE_PROPERTIES`: `WS_PROXY_PROPERTY_ID` = 1;
public const val `WS_PROXY_PROPERTY_STATE`: `WS_PROXY_PROPERTY_ID` = 3;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_PULL_BYTES_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_PUSH_BYTES_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `WS_WRITE_CALLBACK`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_RAW_SYMMETRIC_SECURITY_KEY_HANDLE` (
    public var `keyHandle`: `WS_SECURITY_KEY_HANDLE`,
    public var `rawKeyBytes`: `WS_BYTES`,
)
public const val `WS_RAW_SYMMETRIC_SECURITY_KEY_HANDLE_TYPE`: `WS_SECURITY_KEY_HANDLE_TYPE` = 1;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_READ_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_READ_MESSAGE_END_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_READ_MESSAGE_START_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
public const val `WS_READ_NILLABLE_POINTER`: `WS_READ_OPTION` = 4;
public const val `WS_READ_NILLABLE_VALUE`: `WS_READ_OPTION` = 5;
public typealias `WS_READ_OPTION` = Int;
public const val `WS_READ_OPTIONAL_POINTER`: `WS_READ_OPTION` = 3;
public const val `WS_READ_REQUIRED_POINTER`: `WS_READ_OPTION` = 2;
public const val `WS_READ_REQUIRED_VALUE`: `WS_READ_OPTION` = 1;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_READ_TYPE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_READER`>?, `WS_TYPE_MAPPING`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_HEAP`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
public typealias `WS_RECEIVE_OPTION` = Int;
public const val `WS_RECEIVE_OPTIONAL_MESSAGE`: `WS_RECEIVE_OPTION` = 2;
public const val `WS_RECEIVE_REQUIRED_MESSAGE`: `WS_RECEIVE_OPTION` = 1;
public const val `WS_RELATES_TO_HEADER`: `WS_HEADER_TYPE` = 4;
public const val `WS_RELAY_HEADER_ATTRIBUTE`: Int = 2;
public const val `WS_REPEATING_ANY_ELEMENT_FIELD_MAPPING`: `WS_FIELD_MAPPING` = 10;
public const val `WS_REPEATING_ELEMENT_CHOICE_FIELD_MAPPING`: `WS_FIELD_MAPPING` = 8;
public const val `WS_REPEATING_ELEMENT_FIELD_MAPPING`: `WS_FIELD_MAPPING` = 3;
public const val `WS_REPEATING_HEADER`: `WS_REPEATING_HEADER_OPTION` = 1;
public typealias `WS_REPEATING_HEADER_OPTION` = Int;
public const val `WS_REPLY_MESSAGE`: `WS_MESSAGE_INITIALIZATION` = 3;
public const val `WS_REPLY_TO_HEADER`: `WS_HEADER_TYPE` = 6;
public const val `WS_REQUEST_MESSAGE`: `WS_MESSAGE_INITIALIZATION` = 2;
public typealias `WS_REQUEST_SECURITY_TOKEN_ACTION` = Int;
public const val `WS_REQUEST_SECURITY_TOKEN_ACTION_ISSUE`: `WS_REQUEST_SECURITY_TOKEN_ACTION` = 1;
public const val `WS_REQUEST_SECURITY_TOKEN_ACTION_NEW_CONTEXT`: `WS_REQUEST_SECURITY_TOKEN_ACTION` = 2;
public const val `WS_REQUEST_SECURITY_TOKEN_ACTION_RENEW_CONTEXT`: `WS_REQUEST_SECURITY_TOKEN_ACTION` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_REQUEST_SECURITY_TOKEN_PROPERTY` (
    public var `id`: `WS_REQUEST_SECURITY_TOKEN_PROPERTY_ID`,
    public var `value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `valueSize`: UInt,
)
// UNSUPPORTED Rust 2363:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_REQUEST_SECURITY_TOKEN_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_REQUEST_SECURITY_TOKEN_PROPERTY_APPLIES_TO`: `WS_REQUEST_SECURITY_TOKEN_PROPERTY_ID` = 1;
public const val `WS_REQUEST_SECURITY_TOKEN_PROPERTY_BEARER_KEY_TYPE_VERSION`: `WS_REQUEST_SECURITY_TOKEN_PROPERTY_ID` = 13;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_REQUEST_SECURITY_TOKEN_PROPERTY_CONSTRAINT` (
    public var `id`: `WS_REQUEST_SECURITY_TOKEN_PROPERTY_ID`,
    public var `allowedValues`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `allowedValuesSize`: UInt,
    public var `out`: `WS_REQUEST_SECURITY_TOKEN_PROPERTY_CONSTRAINT_0`,
)
// UNSUPPORTED Rust 2378:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_REQUEST_SECURITY_TOKEN_PROPERTY_CONSTRAINT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_REQUEST_SECURITY_TOKEN_PROPERTY_CONSTRAINT_0` (
    public var `requestSecurityTokenProperty`: `WS_REQUEST_SECURITY_TOKEN_PROPERTY`,
)
public const val `WS_REQUEST_SECURITY_TOKEN_PROPERTY_EXISTING_TOKEN`: `WS_REQUEST_SECURITY_TOKEN_PROPERTY_ID` = 6;
public typealias `WS_REQUEST_SECURITY_TOKEN_PROPERTY_ID` = Int;
public const val `WS_REQUEST_SECURITY_TOKEN_PROPERTY_ISSUED_TOKEN_KEY_ENTROPY`: `WS_REQUEST_SECURITY_TOKEN_PROPERTY_ID` = 9;
public const val `WS_REQUEST_SECURITY_TOKEN_PROPERTY_ISSUED_TOKEN_KEY_SIZE`: `WS_REQUEST_SECURITY_TOKEN_PROPERTY_ID` = 8;
public const val `WS_REQUEST_SECURITY_TOKEN_PROPERTY_ISSUED_TOKEN_KEY_TYPE`: `WS_REQUEST_SECURITY_TOKEN_PROPERTY_ID` = 7;
public const val `WS_REQUEST_SECURITY_TOKEN_PROPERTY_ISSUED_TOKEN_TYPE`: `WS_REQUEST_SECURITY_TOKEN_PROPERTY_ID` = 4;
public const val `WS_REQUEST_SECURITY_TOKEN_PROPERTY_LOCAL_REQUEST_PARAMETERS`: `WS_REQUEST_SECURITY_TOKEN_PROPERTY_ID` = 10;
public const val `WS_REQUEST_SECURITY_TOKEN_PROPERTY_MESSAGE_PROPERTIES`: `WS_REQUEST_SECURITY_TOKEN_PROPERTY_ID` = 12;
public const val `WS_REQUEST_SECURITY_TOKEN_PROPERTY_REQUEST_ACTION`: `WS_REQUEST_SECURITY_TOKEN_PROPERTY_ID` = 5;
public const val `WS_REQUEST_SECURITY_TOKEN_PROPERTY_SECURE_CONVERSATION_VERSION`: `WS_REQUEST_SECURITY_TOKEN_PROPERTY_ID` = 3;
public const val `WS_REQUEST_SECURITY_TOKEN_PROPERTY_SERVICE_REQUEST_PARAMETERS`: `WS_REQUEST_SECURITY_TOKEN_PROPERTY_ID` = 11;
public const val `WS_REQUEST_SECURITY_TOKEN_PROPERTY_TRUST_VERSION`: `WS_REQUEST_SECURITY_TOKEN_PROPERTY_ID` = 2;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_RESET_CHANNEL_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_RESET_LISTENER_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
public const val `WS_RPC_LITERAL_OPERATION`: `WS_OPERATION_STYLE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_RSA_ENDPOINT_IDENTITY` (
    public var `identity`: `WS_ENDPOINT_IDENTITY`,
    public var `modulus`: `WS_BYTES`,
    public var `exponent`: `WS_BYTES`,
)
public const val `WS_RSA_ENDPOINT_IDENTITY_TYPE`: `WS_ENDPOINT_IDENTITY_TYPE` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_SAML_AUTHENTICATOR` (
    public var `authenticatorType`: `WS_SAML_AUTHENTICATOR_TYPE`,
)
public typealias `WS_SAML_AUTHENTICATOR_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_SAML_MESSAGE_SECURITY_BINDING` (
    public var `binding`: `WS_SECURITY_BINDING`,
    public var `bindingUsage`: `WS_MESSAGE_SECURITY_USAGE`,
    public var `authenticator`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_SAML_AUTHENTICATOR`>?,
)
// UNSUPPORTED Rust 2424:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_SAML_MESSAGE_SECURITY_BINDING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_SAML_MESSAGE_SECURITY_BINDING_TYPE`: `WS_SECURITY_BINDING_TYPE` = 7;
public typealias `WS_SECURE_CONVERSATION_VERSION` = Int;
public const val `WS_SECURE_CONVERSATION_VERSION_1_3`: `WS_SECURE_CONVERSATION_VERSION` = 2;
public const val `WS_SECURE_CONVERSATION_VERSION_FEBRUARY_2005`: `WS_SECURE_CONVERSATION_VERSION` = 1;
public typealias `WS_SECURE_PROTOCOL` = Int;
public const val `WS_SECURE_PROTOCOL_SSL2`: `WS_SECURE_PROTOCOL` = 1;
public const val `WS_SECURE_PROTOCOL_SSL3`: `WS_SECURE_PROTOCOL` = 2;
public const val `WS_SECURE_PROTOCOL_TLS1_0`: `WS_SECURE_PROTOCOL` = 4;
public const val `WS_SECURE_PROTOCOL_TLS1_1`: `WS_SECURE_PROTOCOL` = 8;
public const val `WS_SECURE_PROTOCOL_TLS1_2`: `WS_SECURE_PROTOCOL` = 16;
public const val `WS_SECURITY_ALGORITHM_ASYMMETRIC_KEYWRAP_RSA_1_5`: `WS_SECURITY_ALGORITHM_ID` = 16;
public const val `WS_SECURITY_ALGORITHM_ASYMMETRIC_KEYWRAP_RSA_OAEP`: `WS_SECURITY_ALGORITHM_ID` = 17;
public const val `WS_SECURITY_ALGORITHM_ASYMMETRIC_SIGNATURE_DSA_SHA1`: `WS_SECURITY_ALGORITHM_ID` = 12;
public const val `WS_SECURITY_ALGORITHM_ASYMMETRIC_SIGNATURE_RSA_SHA1`: `WS_SECURITY_ALGORITHM_ID` = 11;
public const val `WS_SECURITY_ALGORITHM_ASYMMETRIC_SIGNATURE_RSA_SHA_256`: `WS_SECURITY_ALGORITHM_ID` = 13;
public const val `WS_SECURITY_ALGORITHM_ASYMMETRIC_SIGNATURE_RSA_SHA_384`: `WS_SECURITY_ALGORITHM_ID` = 14;
public const val `WS_SECURITY_ALGORITHM_ASYMMETRIC_SIGNATURE_RSA_SHA_512`: `WS_SECURITY_ALGORITHM_ID` = 15;
public const val `WS_SECURITY_ALGORITHM_CANONICALIZATION_EXCLUSIVE`: `WS_SECURITY_ALGORITHM_ID` = 1;
public const val `WS_SECURITY_ALGORITHM_CANONICALIZATION_EXCLUSIVE_WITH_COMMENTS`: `WS_SECURITY_ALGORITHM_ID` = 2;
public const val `WS_SECURITY_ALGORITHM_DEFAULT`: `WS_SECURITY_ALGORITHM_ID` = 0;
public const val `WS_SECURITY_ALGORITHM_DIGEST_SHA1`: `WS_SECURITY_ALGORITHM_ID` = 3;
public const val `WS_SECURITY_ALGORITHM_DIGEST_SHA_256`: `WS_SECURITY_ALGORITHM_ID` = 4;
public const val `WS_SECURITY_ALGORITHM_DIGEST_SHA_384`: `WS_SECURITY_ALGORITHM_ID` = 5;
public const val `WS_SECURITY_ALGORITHM_DIGEST_SHA_512`: `WS_SECURITY_ALGORITHM_ID` = 6;
public typealias `WS_SECURITY_ALGORITHM_ID` = Int;
public const val `WS_SECURITY_ALGORITHM_KEY_DERIVATION_P_SHA1`: `WS_SECURITY_ALGORITHM_ID` = 18;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_SECURITY_ALGORITHM_PROPERTY` (
    public var `id`: `WS_SECURITY_ALGORITHM_PROPERTY_ID`,
    public var `value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `valueSize`: UInt,
)
// UNSUPPORTED Rust 2462:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_SECURITY_ALGORITHM_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WS_SECURITY_ALGORITHM_PROPERTY_ID` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_SECURITY_ALGORITHM_SUITE` (
    public var `canonicalizationAlgorithm`: `WS_SECURITY_ALGORITHM_ID`,
    public var `digestAlgorithm`: `WS_SECURITY_ALGORITHM_ID`,
    public var `symmetricSignatureAlgorithm`: `WS_SECURITY_ALGORITHM_ID`,
    public var `asymmetricSignatureAlgorithm`: `WS_SECURITY_ALGORITHM_ID`,
    public var `encryptionAlgorithm`: `WS_SECURITY_ALGORITHM_ID`,
    public var `keyDerivationAlgorithm`: `WS_SECURITY_ALGORITHM_ID`,
    public var `symmetricKeyWrapAlgorithm`: `WS_SECURITY_ALGORITHM_ID`,
    public var `asymmetricKeyWrapAlgorithm`: `WS_SECURITY_ALGORITHM_ID`,
    public var `minSymmetricKeyLength`: UInt,
    public var `maxSymmetricKeyLength`: UInt,
    public var `minAsymmetricKeyLength`: UInt,
    public var `maxAsymmetricKeyLength`: UInt,
    public var `properties`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_SECURITY_ALGORITHM_PROPERTY`>?,
    public var `propertyCount`: UInt,
)
// UNSUPPORTED Rust 2486:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_SECURITY_ALGORITHM_SUITE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WS_SECURITY_ALGORITHM_SUITE_NAME` = Int;
public const val `WS_SECURITY_ALGORITHM_SUITE_NAME_BASIC128`: `WS_SECURITY_ALGORITHM_SUITE_NAME` = 3;
public const val `WS_SECURITY_ALGORITHM_SUITE_NAME_BASIC128_RSA15`: `WS_SECURITY_ALGORITHM_SUITE_NAME` = 6;
public const val `WS_SECURITY_ALGORITHM_SUITE_NAME_BASIC128_SHA256`: `WS_SECURITY_ALGORITHM_SUITE_NAME` = 9;
public const val `WS_SECURITY_ALGORITHM_SUITE_NAME_BASIC128_SHA256_RSA15`: `WS_SECURITY_ALGORITHM_SUITE_NAME` = 12;
public const val `WS_SECURITY_ALGORITHM_SUITE_NAME_BASIC192`: `WS_SECURITY_ALGORITHM_SUITE_NAME` = 2;
public const val `WS_SECURITY_ALGORITHM_SUITE_NAME_BASIC192_RSA15`: `WS_SECURITY_ALGORITHM_SUITE_NAME` = 5;
public const val `WS_SECURITY_ALGORITHM_SUITE_NAME_BASIC192_SHA256`: `WS_SECURITY_ALGORITHM_SUITE_NAME` = 8;
public const val `WS_SECURITY_ALGORITHM_SUITE_NAME_BASIC192_SHA256_RSA15`: `WS_SECURITY_ALGORITHM_SUITE_NAME` = 11;
public const val `WS_SECURITY_ALGORITHM_SUITE_NAME_BASIC256`: `WS_SECURITY_ALGORITHM_SUITE_NAME` = 1;
public const val `WS_SECURITY_ALGORITHM_SUITE_NAME_BASIC256_RSA15`: `WS_SECURITY_ALGORITHM_SUITE_NAME` = 4;
public const val `WS_SECURITY_ALGORITHM_SUITE_NAME_BASIC256_SHA256`: `WS_SECURITY_ALGORITHM_SUITE_NAME` = 7;
public const val `WS_SECURITY_ALGORITHM_SUITE_NAME_BASIC256_SHA256_RSA15`: `WS_SECURITY_ALGORITHM_SUITE_NAME` = 10;
public const val `WS_SECURITY_ALGORITHM_SYMMETRIC_SIGNATURE_HMAC_SHA1`: `WS_SECURITY_ALGORITHM_ID` = 7;
public const val `WS_SECURITY_ALGORITHM_SYMMETRIC_SIGNATURE_HMAC_SHA_256`: `WS_SECURITY_ALGORITHM_ID` = 8;
public const val `WS_SECURITY_ALGORITHM_SYMMETRIC_SIGNATURE_HMAC_SHA_384`: `WS_SECURITY_ALGORITHM_ID` = 9;
public const val `WS_SECURITY_ALGORITHM_SYMMETRIC_SIGNATURE_HMAC_SHA_512`: `WS_SECURITY_ALGORITHM_ID` = 10;
public typealias `WS_SECURITY_BEARER_KEY_TYPE_VERSION` = Int;
public const val `WS_SECURITY_BEARER_KEY_TYPE_VERSION_1_3_ERRATA_01`: `WS_SECURITY_BEARER_KEY_TYPE_VERSION` = 3;
public const val `WS_SECURITY_BEARER_KEY_TYPE_VERSION_1_3_ORIGINAL_SCHEMA`: `WS_SECURITY_BEARER_KEY_TYPE_VERSION` = 2;
public const val `WS_SECURITY_BEARER_KEY_TYPE_VERSION_1_3_ORIGINAL_SPECIFICATION`: `WS_SECURITY_BEARER_KEY_TYPE_VERSION` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_SECURITY_BINDING` (
    public var `bindingType`: `WS_SECURITY_BINDING_TYPE`,
    public var `properties`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_SECURITY_BINDING_PROPERTY`>?,
    public var `propertyCount`: UInt,
)
// UNSUPPORTED Rust 2519:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_SECURITY_BINDING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_SECURITY_BINDING_CONSTRAINT` (
    public var `type`: `WS_SECURITY_BINDING_CONSTRAINT_TYPE`,
    public var `propertyConstraints`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_SECURITY_BINDING_PROPERTY_CONSTRAINT`>?,
    public var `propertyConstraintCount`: UInt,
)
// UNSUPPORTED Rust 2531:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_SECURITY_BINDING_CONSTRAINT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WS_SECURITY_BINDING_CONSTRAINT_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_SECURITY_BINDING_PROPERTIES` (
    public var `properties`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_SECURITY_BINDING_PROPERTY`>?,
    public var `propertyCount`: UInt,
)
// UNSUPPORTED Rust 2543:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_SECURITY_BINDING_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_SECURITY_BINDING_PROPERTY` (
    public var `id`: `WS_SECURITY_BINDING_PROPERTY_ID`,
    public var `value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `valueSize`: UInt,
)
// UNSUPPORTED Rust 2555:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_SECURITY_BINDING_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_SECURITY_BINDING_PROPERTY_ALLOWED_IMPERSONATION_LEVEL`: `WS_SECURITY_BINDING_PROPERTY_ID` = 5;
public const val `WS_SECURITY_BINDING_PROPERTY_ALLOW_ANONYMOUS_CLIENTS`: `WS_SECURITY_BINDING_PROPERTY_ID` = 4;
public const val `WS_SECURITY_BINDING_PROPERTY_CERTIFICATE_VALIDATION_CALLBACK_CONTEXT`: `WS_SECURITY_BINDING_PROPERTY_ID` = 23;
public const val `WS_SECURITY_BINDING_PROPERTY_CERT_FAILURES_TO_IGNORE`: `WS_SECURITY_BINDING_PROPERTY_ID` = 20;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_SECURITY_BINDING_PROPERTY_CONSTRAINT` (
    public var `id`: `WS_SECURITY_BINDING_PROPERTY_ID`,
    public var `allowedValues`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `allowedValuesSize`: UInt,
    public var `out`: `WS_SECURITY_BINDING_PROPERTY_CONSTRAINT_0`,
)
// UNSUPPORTED Rust 2572:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_SECURITY_BINDING_PROPERTY_CONSTRAINT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_SECURITY_BINDING_PROPERTY_CONSTRAINT_0` (
    public var `securityBindingProperty`: `WS_SECURITY_BINDING_PROPERTY`,
)
public const val `WS_SECURITY_BINDING_PROPERTY_DISABLE_CERT_REVOCATION_CHECK`: `WS_SECURITY_BINDING_PROPERTY_ID` = 21;
public const val `WS_SECURITY_BINDING_PROPERTY_DISALLOWED_SECURE_PROTOCOLS`: `WS_SECURITY_BINDING_PROPERTY_ID` = 22;
public const val `WS_SECURITY_BINDING_PROPERTY_HTTP_HEADER_AUTH_BASIC_REALM`: `WS_SECURITY_BINDING_PROPERTY_ID` = 8;
public const val `WS_SECURITY_BINDING_PROPERTY_HTTP_HEADER_AUTH_DIGEST_DOMAIN`: `WS_SECURITY_BINDING_PROPERTY_ID` = 10;
public const val `WS_SECURITY_BINDING_PROPERTY_HTTP_HEADER_AUTH_DIGEST_REALM`: `WS_SECURITY_BINDING_PROPERTY_ID` = 9;
public const val `WS_SECURITY_BINDING_PROPERTY_HTTP_HEADER_AUTH_SCHEME`: `WS_SECURITY_BINDING_PROPERTY_ID` = 6;
public const val `WS_SECURITY_BINDING_PROPERTY_HTTP_HEADER_AUTH_TARGET`: `WS_SECURITY_BINDING_PROPERTY_ID` = 7;
public typealias `WS_SECURITY_BINDING_PROPERTY_ID` = Int;
public const val `WS_SECURITY_BINDING_PROPERTY_MESSAGE_PROPERTIES`: `WS_SECURITY_BINDING_PROPERTY_ID` = 13;
public const val `WS_SECURITY_BINDING_PROPERTY_REQUIRE_SERVER_AUTH`: `WS_SECURITY_BINDING_PROPERTY_ID` = 3;
public const val `WS_SECURITY_BINDING_PROPERTY_REQUIRE_SSL_CLIENT_CERT`: `WS_SECURITY_BINDING_PROPERTY_ID` = 1;
public const val `WS_SECURITY_BINDING_PROPERTY_SECURE_CONVERSATION_VERSION`: `WS_SECURITY_BINDING_PROPERTY_ID` = 16;
public const val `WS_SECURITY_BINDING_PROPERTY_SECURITY_CONTEXT_KEY_ENTROPY_MODE`: `WS_SECURITY_BINDING_PROPERTY_ID` = 12;
public const val `WS_SECURITY_BINDING_PROPERTY_SECURITY_CONTEXT_KEY_SIZE`: `WS_SECURITY_BINDING_PROPERTY_ID` = 11;
public const val `WS_SECURITY_BINDING_PROPERTY_SECURITY_CONTEXT_MAX_ACTIVE_CONTEXTS`: `WS_SECURITY_BINDING_PROPERTY_ID` = 15;
public const val `WS_SECURITY_BINDING_PROPERTY_SECURITY_CONTEXT_MAX_PENDING_CONTEXTS`: `WS_SECURITY_BINDING_PROPERTY_ID` = 14;
public const val `WS_SECURITY_BINDING_PROPERTY_SECURITY_CONTEXT_RENEWAL_INTERVAL`: `WS_SECURITY_BINDING_PROPERTY_ID` = 18;
public const val `WS_SECURITY_BINDING_PROPERTY_SECURITY_CONTEXT_ROLLOVER_INTERVAL`: `WS_SECURITY_BINDING_PROPERTY_ID` = 19;
public const val `WS_SECURITY_BINDING_PROPERTY_SECURITY_CONTEXT_SUPPORT_RENEW`: `WS_SECURITY_BINDING_PROPERTY_ID` = 17;
public const val `WS_SECURITY_BINDING_PROPERTY_WINDOWS_INTEGRATED_AUTH_PACKAGE`: `WS_SECURITY_BINDING_PROPERTY_ID` = 2;
public typealias `WS_SECURITY_BINDING_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_SECURITY_CONSTRAINTS` (
    public var `securityPropertyConstraints`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_SECURITY_PROPERTY_CONSTRAINT`>?,
    public var `securityPropertyConstraintCount`: UInt,
    public var `securityBindingConstraints`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_SECURITY_BINDING_CONSTRAINT`>>?,
    public var `securityBindingConstraintCount`: UInt,
)
// UNSUPPORTED Rust 2611:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_SECURITY_CONSTRAINTS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WS_SECURITY_CONTEXT` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_SECURITY_CONTEXT_MESSAGE_SECURITY_BINDING` (
    public var `binding`: `WS_SECURITY_BINDING`,
    public var `bindingUsage`: `WS_MESSAGE_SECURITY_USAGE`,
    public var `bootstrapSecurityDescription`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_SECURITY_DESCRIPTION`>?,
)
// UNSUPPORTED Rust 2624:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_SECURITY_CONTEXT_MESSAGE_SECURITY_BINDING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_SECURITY_CONTEXT_MESSAGE_SECURITY_BINDING_CONSTRAINT` (
    public var `bindingConstraint`: `WS_SECURITY_BINDING_CONSTRAINT`,
    public var `bindingUsage`: `WS_MESSAGE_SECURITY_USAGE`,
    public var `bootstrapSecurityConstraint`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_SECURITY_CONSTRAINTS`>?,
)
// UNSUPPORTED Rust 2636:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_SECURITY_CONTEXT_MESSAGE_SECURITY_BINDING_CONSTRAINT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_SECURITY_CONTEXT_MESSAGE_SECURITY_BINDING_CONSTRAINT_TYPE`: `WS_SECURITY_BINDING_CONSTRAINT_TYPE` = 8;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_SECURITY_CONTEXT_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION` (
    public var `securityBindingProperties`: `WS_SECURITY_BINDING_PROPERTIES`,
    public var `bindingUsage`: `WS_MESSAGE_SECURITY_USAGE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_SECURITY_CONTEXT_MESSAGE_SECURITY_BINDING_TEMPLATE` (
    public var `securityBindingProperties`: `WS_SECURITY_BINDING_PROPERTIES`,
)
public const val `WS_SECURITY_CONTEXT_MESSAGE_SECURITY_BINDING_TYPE`: `WS_SECURITY_BINDING_TYPE` = 8;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_SECURITY_CONTEXT_PROPERTY` (
    public var `id`: `WS_SECURITY_CONTEXT_PROPERTY_ID`,
    public var `value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `valueSize`: UInt,
)
// UNSUPPORTED Rust 2661:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_SECURITY_CONTEXT_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WS_SECURITY_CONTEXT_PROPERTY_ID` = Int;
public const val `WS_SECURITY_CONTEXT_PROPERTY_IDENTIFIER`: `WS_SECURITY_CONTEXT_PROPERTY_ID` = 1;
public const val `WS_SECURITY_CONTEXT_PROPERTY_MESSAGE_SECURITY_WINDOWS_TOKEN`: `WS_SECURITY_CONTEXT_PROPERTY_ID` = 3;
public const val `WS_SECURITY_CONTEXT_PROPERTY_SAML_ASSERTION`: `WS_SECURITY_CONTEXT_PROPERTY_ID` = 4;
public const val `WS_SECURITY_CONTEXT_PROPERTY_USERNAME`: `WS_SECURITY_CONTEXT_PROPERTY_ID` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_SECURITY_CONTEXT_SECURITY_BINDING_POLICY_DESCRIPTION` (
    public var `securityContextMessageSecurityBinding`: `WS_SECURITY_CONTEXT_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION`,
    public var `securityProperties`: `WS_SECURITY_PROPERTIES`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_SECURITY_CONTEXT_SECURITY_BINDING_TEMPLATE` (
    public var `securityContextMessageSecurityBinding`: `WS_SECURITY_CONTEXT_MESSAGE_SECURITY_BINDING_TEMPLATE`,
    public var `securityProperties`: `WS_SECURITY_PROPERTIES`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_SECURITY_DESCRIPTION` (
    public var `securityBindings`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_SECURITY_BINDING`>>?,
    public var `securityBindingCount`: UInt,
    public var `properties`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_SECURITY_PROPERTY`>?,
    public var `propertyCount`: UInt,
)
// UNSUPPORTED Rust 2691:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_SECURITY_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WS_SECURITY_HEADER_LAYOUT` = Int;
public const val `WS_SECURITY_HEADER_LAYOUT_LAX`: `WS_SECURITY_HEADER_LAYOUT` = 2;
public const val `WS_SECURITY_HEADER_LAYOUT_LAX_WITH_TIMESTAMP_FIRST`: `WS_SECURITY_HEADER_LAYOUT` = 3;
public const val `WS_SECURITY_HEADER_LAYOUT_LAX_WITH_TIMESTAMP_LAST`: `WS_SECURITY_HEADER_LAYOUT` = 4;
public const val `WS_SECURITY_HEADER_LAYOUT_STRICT`: `WS_SECURITY_HEADER_LAYOUT` = 1;
public typealias `WS_SECURITY_HEADER_VERSION` = Int;
public const val `WS_SECURITY_HEADER_VERSION_1_0`: `WS_SECURITY_HEADER_VERSION` = 1;
public const val `WS_SECURITY_HEADER_VERSION_1_1`: `WS_SECURITY_HEADER_VERSION` = 2;
public typealias `WS_SECURITY_KEY_ENTROPY_MODE` = Int;
public const val `WS_SECURITY_KEY_ENTROPY_MODE_CLIENT_ONLY`: `WS_SECURITY_KEY_ENTROPY_MODE` = 1;
public const val `WS_SECURITY_KEY_ENTROPY_MODE_COMBINED`: `WS_SECURITY_KEY_ENTROPY_MODE` = 3;
public const val `WS_SECURITY_KEY_ENTROPY_MODE_SERVER_ONLY`: `WS_SECURITY_KEY_ENTROPY_MODE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_SECURITY_KEY_HANDLE` (
    public var `keyHandleType`: `WS_SECURITY_KEY_HANDLE_TYPE`,
)
public typealias `WS_SECURITY_KEY_HANDLE_TYPE` = Int;
public typealias `WS_SECURITY_KEY_TYPE` = Int;
public const val `WS_SECURITY_KEY_TYPE_ASYMMETRIC`: `WS_SECURITY_KEY_TYPE` = 3;
public const val `WS_SECURITY_KEY_TYPE_NONE`: `WS_SECURITY_KEY_TYPE` = 1;
public const val `WS_SECURITY_KEY_TYPE_SYMMETRIC`: `WS_SECURITY_KEY_TYPE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_SECURITY_PROPERTIES` (
    public var `properties`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_SECURITY_PROPERTY`>?,
    public var `propertyCount`: UInt,
)
// UNSUPPORTED Rust 2724:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_SECURITY_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_SECURITY_PROPERTY` (
    public var `id`: `WS_SECURITY_PROPERTY_ID`,
    public var `value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `valueSize`: UInt,
)
// UNSUPPORTED Rust 2736:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_SECURITY_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_SECURITY_PROPERTY_ALGORITHM_SUITE`: `WS_SECURITY_PROPERTY_ID` = 2;
public const val `WS_SECURITY_PROPERTY_ALGORITHM_SUITE_NAME`: `WS_SECURITY_PROPERTY_ID` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_SECURITY_PROPERTY_CONSTRAINT` (
    public var `id`: `WS_SECURITY_PROPERTY_ID`,
    public var `allowedValues`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `allowedValuesSize`: UInt,
    public var `out`: `WS_SECURITY_PROPERTY_CONSTRAINT_0`,
)
// UNSUPPORTED Rust 2751:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_SECURITY_PROPERTY_CONSTRAINT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_SECURITY_PROPERTY_CONSTRAINT_0` (
    public var `securityProperty`: `WS_SECURITY_PROPERTY`,
)
public const val `WS_SECURITY_PROPERTY_EXTENDED_PROTECTION_POLICY`: `WS_SECURITY_PROPERTY_ID` = 10;
public const val `WS_SECURITY_PROPERTY_EXTENDED_PROTECTION_SCENARIO`: `WS_SECURITY_PROPERTY_ID` = 11;
public typealias `WS_SECURITY_PROPERTY_ID` = Int;
public const val `WS_SECURITY_PROPERTY_MAX_ALLOWED_CLOCK_SKEW`: `WS_SECURITY_PROPERTY_ID` = 6;
public const val `WS_SECURITY_PROPERTY_MAX_ALLOWED_LATENCY`: `WS_SECURITY_PROPERTY_ID` = 4;
public const val `WS_SECURITY_PROPERTY_SECURITY_HEADER_LAYOUT`: `WS_SECURITY_PROPERTY_ID` = 8;
public const val `WS_SECURITY_PROPERTY_SECURITY_HEADER_VERSION`: `WS_SECURITY_PROPERTY_ID` = 9;
public const val `WS_SECURITY_PROPERTY_SERVICE_IDENTITIES`: `WS_SECURITY_PROPERTY_ID` = 12;
public const val `WS_SECURITY_PROPERTY_TIMESTAMP_USAGE`: `WS_SECURITY_PROPERTY_ID` = 7;
public const val `WS_SECURITY_PROPERTY_TIMESTAMP_VALIDITY_DURATION`: `WS_SECURITY_PROPERTY_ID` = 5;
public const val `WS_SECURITY_PROPERTY_TRANSPORT_PROTECTION_LEVEL`: `WS_SECURITY_PROPERTY_ID` = 1;
public typealias `WS_SECURITY_TIMESTAMP_USAGE` = Int;
public const val `WS_SECURITY_TIMESTAMP_USAGE_ALWAYS`: `WS_SECURITY_TIMESTAMP_USAGE` = 1;
public const val `WS_SECURITY_TIMESTAMP_USAGE_NEVER`: `WS_SECURITY_TIMESTAMP_USAGE` = 2;
public const val `WS_SECURITY_TIMESTAMP_USAGE_REQUESTS_ONLY`: `WS_SECURITY_TIMESTAMP_USAGE` = 3;
public typealias `WS_SECURITY_TOKEN` = Long;
public const val `WS_SECURITY_TOKEN_PROPERTY_ATTACHED_REFERENCE_XML`: `WS_SECURITY_TOKEN_PROPERTY_ID` = 5;
public typealias `WS_SECURITY_TOKEN_PROPERTY_ID` = Int;
public const val `WS_SECURITY_TOKEN_PROPERTY_KEY_TYPE`: `WS_SECURITY_TOKEN_PROPERTY_ID` = 1;
public const val `WS_SECURITY_TOKEN_PROPERTY_SERIALIZED_XML`: `WS_SECURITY_TOKEN_PROPERTY_ID` = 4;
public const val `WS_SECURITY_TOKEN_PROPERTY_SYMMETRIC_KEY`: `WS_SECURITY_TOKEN_PROPERTY_ID` = 7;
public const val `WS_SECURITY_TOKEN_PROPERTY_UNATTACHED_REFERENCE_XML`: `WS_SECURITY_TOKEN_PROPERTY_ID` = 6;
public const val `WS_SECURITY_TOKEN_PROPERTY_VALID_FROM_TIME`: `WS_SECURITY_TOKEN_PROPERTY_ID` = 2;
public const val `WS_SECURITY_TOKEN_PROPERTY_VALID_TILL_TIME`: `WS_SECURITY_TOKEN_PROPERTY_ID` = 3;
public typealias `WS_SECURITY_TOKEN_REFERENCE_MODE` = Int;
public const val `WS_SECURITY_TOKEN_REFERENCE_MODE_CERT_THUMBPRINT`: `WS_SECURITY_TOKEN_REFERENCE_MODE` = 3;
public const val `WS_SECURITY_TOKEN_REFERENCE_MODE_LOCAL_ID`: `WS_SECURITY_TOKEN_REFERENCE_MODE` = 1;
public const val `WS_SECURITY_TOKEN_REFERENCE_MODE_SAML_ASSERTION_ID`: `WS_SECURITY_TOKEN_REFERENCE_MODE` = 5;
public const val `WS_SECURITY_TOKEN_REFERENCE_MODE_SECURITY_CONTEXT_ID`: `WS_SECURITY_TOKEN_REFERENCE_MODE` = 4;
public const val `WS_SECURITY_TOKEN_REFERENCE_MODE_XML_BUFFER`: `WS_SECURITY_TOKEN_REFERENCE_MODE` = 2;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_SERVICE_ACCEPT_CHANNEL_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`WS_OPERATION_CONTEXT`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
public typealias `WS_SERVICE_CANCEL_REASON` = Int;
public const val `WS_SERVICE_CHANNEL_FAULTED`: `WS_SERVICE_CANCEL_REASON` = 1;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_SERVICE_CLOSE_CHANNEL_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`WS_OPERATION_CONTEXT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_SERVICE_CONTRACT` (
    public var `contractDescription`: /* Rust *const */ kotlinx.cinterop.CPointer<`WS_CONTRACT_DESCRIPTION`>?,
    public var `defaultMessageHandlerCallback`: `WS_SERVICE_MESSAGE_RECEIVE_CALLBACK`,
    public var `methodTable`: /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 2802:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_SERVICE_CONTRACT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_SERVICE_ENDPOINT` (
    public var `address`: `WS_ENDPOINT_ADDRESS`,
    public var `channelBinding`: `WS_CHANNEL_BINDING`,
    public var `channelType`: `WS_CHANNEL_TYPE`,
    public var `securityDescription`: /* Rust *const */ kotlinx.cinterop.CPointer<`WS_SECURITY_DESCRIPTION`>?,
    public var `contract`: /* Rust *const */ kotlinx.cinterop.CPointer<`WS_SERVICE_CONTRACT`>?,
    public var `authorizationCallback`: `WS_SERVICE_SECURITY_CALLBACK`,
    public var `properties`: /* Rust *const */ kotlinx.cinterop.CPointer<`WS_SERVICE_ENDPOINT_PROPERTY`>?,
    public var `propertyCount`: UInt,
    public var `channelProperties`: `WS_CHANNEL_PROPERTIES`,
)
// UNSUPPORTED Rust 2820:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_SERVICE_ENDPOINT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_SERVICE_ENDPOINT_METADATA` (
    public var `portName`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `bindingName`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `bindingNs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
)
// UNSUPPORTED Rust 2832:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_SERVICE_ENDPOINT_METADATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_SERVICE_ENDPOINT_PROPERTY` (
    public var `id`: `WS_SERVICE_ENDPOINT_PROPERTY_ID`,
    public var `value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `valueSize`: UInt,
)
// UNSUPPORTED Rust 2844:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_SERVICE_ENDPOINT_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_SERVICE_ENDPOINT_PROPERTY_ACCEPT_CHANNEL_CALLBACK`: `WS_SERVICE_ENDPOINT_PROPERTY_ID` = 0;
public const val `WS_SERVICE_ENDPOINT_PROPERTY_BODY_HEAP_MAX_SIZE`: `WS_SERVICE_ENDPOINT_PROPERTY_ID` = 4;
public const val `WS_SERVICE_ENDPOINT_PROPERTY_BODY_HEAP_TRIM_SIZE`: `WS_SERVICE_ENDPOINT_PROPERTY_ID` = 5;
public const val `WS_SERVICE_ENDPOINT_PROPERTY_CHECK_MUST_UNDERSTAND`: `WS_SERVICE_ENDPOINT_PROPERTY_ID` = 10;
public const val `WS_SERVICE_ENDPOINT_PROPERTY_CLOSE_CHANNEL_CALLBACK`: `WS_SERVICE_ENDPOINT_PROPERTY_ID` = 1;
public typealias `WS_SERVICE_ENDPOINT_PROPERTY_ID` = Int;
public const val `WS_SERVICE_ENDPOINT_PROPERTY_LISTENER_PROPERTIES`: `WS_SERVICE_ENDPOINT_PROPERTY_ID` = 9;
public const val `WS_SERVICE_ENDPOINT_PROPERTY_MAX_ACCEPTING_CHANNELS`: `WS_SERVICE_ENDPOINT_PROPERTY_ID` = 2;
public const val `WS_SERVICE_ENDPOINT_PROPERTY_MAX_CALL_POOL_SIZE`: `WS_SERVICE_ENDPOINT_PROPERTY_ID` = 7;
public const val `WS_SERVICE_ENDPOINT_PROPERTY_MAX_CHANNELS`: `WS_SERVICE_ENDPOINT_PROPERTY_ID` = 14;
public const val `WS_SERVICE_ENDPOINT_PROPERTY_MAX_CHANNEL_POOL_SIZE`: `WS_SERVICE_ENDPOINT_PROPERTY_ID` = 8;
public const val `WS_SERVICE_ENDPOINT_PROPERTY_MAX_CONCURRENCY`: `WS_SERVICE_ENDPOINT_PROPERTY_ID` = 3;
public const val `WS_SERVICE_ENDPOINT_PROPERTY_MESSAGE_PROPERTIES`: `WS_SERVICE_ENDPOINT_PROPERTY_ID` = 6;
public const val `WS_SERVICE_ENDPOINT_PROPERTY_METADATA`: `WS_SERVICE_ENDPOINT_PROPERTY_ID` = 12;
public const val `WS_SERVICE_ENDPOINT_PROPERTY_METADATA_EXCHANGE_TYPE`: `WS_SERVICE_ENDPOINT_PROPERTY_ID` = 11;
public const val `WS_SERVICE_ENDPOINT_PROPERTY_METADATA_EXCHANGE_URL_SUFFIX`: `WS_SERVICE_ENDPOINT_PROPERTY_ID` = 13;
public typealias `WS_SERVICE_HOST` = Long;
public const val `WS_SERVICE_HOST_ABORT`: `WS_SERVICE_CANCEL_REASON` = 0;
public typealias `WS_SERVICE_HOST_STATE` = Int;
public const val `WS_SERVICE_HOST_STATE_CLOSED`: `WS_SERVICE_HOST_STATE` = 4;
public const val `WS_SERVICE_HOST_STATE_CLOSING`: `WS_SERVICE_HOST_STATE` = 3;
public const val `WS_SERVICE_HOST_STATE_CREATED`: `WS_SERVICE_HOST_STATE` = 0;
public const val `WS_SERVICE_HOST_STATE_FAULTED`: `WS_SERVICE_HOST_STATE` = 5;
public const val `WS_SERVICE_HOST_STATE_OPEN`: `WS_SERVICE_HOST_STATE` = 2;
public const val `WS_SERVICE_HOST_STATE_OPENING`: `WS_SERVICE_HOST_STATE` = 1;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_SERVICE_MESSAGE_RECEIVE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`WS_OPERATION_CONTEXT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_SERVICE_METADATA` (
    public var `documentCount`: UInt,
    public var `documents`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_SERVICE_METADATA_DOCUMENT`>>?,
    public var `serviceName`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `serviceNs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
)
// UNSUPPORTED Rust 2883:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_SERVICE_METADATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_SERVICE_METADATA_DOCUMENT` (
    public var `content`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `name`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_STRING`>?,
)
// UNSUPPORTED Rust 2894:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_SERVICE_METADATA_DOCUMENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_SERVICE_OPERATION_MESSAGE_NILLABLE_ELEMENT`: Int = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_SERVICE_PROPERTY` (
    public var `id`: `WS_SERVICE_PROPERTY_ID`,
    public var `value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `valueSize`: UInt,
)
// UNSUPPORTED Rust 2907:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_SERVICE_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_SERVICE_PROPERTY_ACCEPT_CALLBACK` (
    public var `callback`: `WS_SERVICE_ACCEPT_CHANNEL_CALLBACK`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_SERVICE_PROPERTY_CLOSE_CALLBACK` (
    public var `callback`: `WS_SERVICE_CLOSE_CHANNEL_CALLBACK`,
)
public const val `WS_SERVICE_PROPERTY_CLOSE_TIMEOUT`: `WS_SERVICE_PROPERTY_ID` = 5;
public const val `WS_SERVICE_PROPERTY_FAULT_DISCLOSURE`: `WS_SERVICE_PROPERTY_ID` = 1;
public const val `WS_SERVICE_PROPERTY_FAULT_LANGID`: `WS_SERVICE_PROPERTY_ID` = 2;
public const val `WS_SERVICE_PROPERTY_HOST_STATE`: `WS_SERVICE_PROPERTY_ID` = 3;
public const val `WS_SERVICE_PROPERTY_HOST_USER_STATE`: `WS_SERVICE_PROPERTY_ID` = 0;
public typealias `WS_SERVICE_PROPERTY_ID` = Int;
public const val `WS_SERVICE_PROPERTY_METADATA`: `WS_SERVICE_PROPERTY_ID` = 4;
public typealias `WS_SERVICE_PROXY` = Long;
public typealias `WS_SERVICE_PROXY_STATE` = Int;
public const val `WS_SERVICE_PROXY_STATE_CLOSED`: `WS_SERVICE_PROXY_STATE` = 4;
public const val `WS_SERVICE_PROXY_STATE_CLOSING`: `WS_SERVICE_PROXY_STATE` = 3;
public const val `WS_SERVICE_PROXY_STATE_CREATED`: `WS_SERVICE_PROXY_STATE` = 0;
public const val `WS_SERVICE_PROXY_STATE_FAULTED`: `WS_SERVICE_PROXY_STATE` = 5;
public const val `WS_SERVICE_PROXY_STATE_OPEN`: `WS_SERVICE_PROXY_STATE` = 2;
public const val `WS_SERVICE_PROXY_STATE_OPENING`: `WS_SERVICE_PROXY_STATE` = 1;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_SERVICE_SECURITY_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`WS_OPERATION_CONTEXT`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_SERVICE_SECURITY_IDENTITIES` (
    public var `serviceIdentities`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_STRING`>?,
    public var `serviceIdentityCount`: UInt,
)
// UNSUPPORTED Rust 2944:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_SERVICE_SECURITY_IDENTITIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_SERVICE_STUB_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`WS_OPERATION_CONTEXT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_SET_CHANNEL_PROPERTY_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `WS_CHANNEL_PROPERTY_ID`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_SET_LISTENER_PROPERTY_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `WS_LISTENER_PROPERTY_ID`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
public const val `WS_SHORT_CALLBACK`: `WS_CALLBACK_MODEL` = 0;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_SHUTDOWN_SESSION_CHANNEL_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
public const val `WS_SINGLETON_HEADER`: `WS_REPEATING_HEADER_OPTION` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_SOAPUDP_URL` (
    public var `url`: `WS_URL`,
    public var `host`: `WS_STRING`,
    public var `port`: UShort,
    public var `portAsString`: `WS_STRING`,
    public var `path`: `WS_STRING`,
    public var `query`: `WS_STRING`,
    public var `fragment`: `WS_STRING`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_SPN_ENDPOINT_IDENTITY` (
    public var `identity`: `WS_ENDPOINT_IDENTITY`,
    public var `spn`: `WS_STRING`,
)
public const val `WS_SPN_ENDPOINT_IDENTITY_TYPE`: `WS_ENDPOINT_IDENTITY_TYPE` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_SSL_TRANSPORT_SECURITY_BINDING` (
    public var `binding`: `WS_SECURITY_BINDING`,
    public var `localCertCredential`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_CERT_CREDENTIAL`>?,
)
// UNSUPPORTED Rust 2979:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_SSL_TRANSPORT_SECURITY_BINDING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_SSL_TRANSPORT_SECURITY_BINDING_CONSTRAINT` (
    public var `bindingConstraint`: `WS_SECURITY_BINDING_CONSTRAINT`,
    public var `out`: `WS_SSL_TRANSPORT_SECURITY_BINDING_CONSTRAINT_0`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_SSL_TRANSPORT_SECURITY_BINDING_CONSTRAINT_0` (
    public var `clientCertCredentialRequired`: `windows_sys`.`core`.`BOOL`,
)
public const val `WS_SSL_TRANSPORT_SECURITY_BINDING_CONSTRAINT_TYPE`: `WS_SECURITY_BINDING_CONSTRAINT_TYPE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_SSL_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION` (
    public var `securityBindingProperties`: `WS_SECURITY_BINDING_PROPERTIES`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_SSL_TRANSPORT_SECURITY_BINDING_TEMPLATE` (
    public var `securityBindingProperties`: `WS_SECURITY_BINDING_PROPERTIES`,
    public var `localCertCredential`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_CERT_CREDENTIAL`>?,
)
// UNSUPPORTED Rust 3007:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_SSL_TRANSPORT_SECURITY_BINDING_TEMPLATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_SSL_TRANSPORT_SECURITY_BINDING_TYPE`: `WS_SECURITY_BINDING_TYPE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_SSPI_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION` (
    public var `securityBindingProperties`: `WS_SECURITY_BINDING_PROPERTIES`,
)
public const val `WS_STREAMED_INPUT_TRANSFER_MODE`: `WS_TRANSFER_MODE` = 1;
public const val `WS_STREAMED_OUTPUT_TRANSFER_MODE`: `WS_TRANSFER_MODE` = 2;
public const val `WS_STREAMED_TRANSFER_MODE`: `WS_TRANSFER_MODE` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_STRING` (
    public var `length`: UInt,
    public var `chars`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 3027:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_STRING_DESCRIPTION` (
    public var `minCharCount`: UInt,
    public var `maxCharCount`: UInt,
)
public const val `WS_STRING_TYPE`: `WS_TYPE` = 16;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_STRING_USERNAME_CREDENTIAL` (
    public var `credential`: `WS_USERNAME_CREDENTIAL`,
    public var `username`: `WS_STRING`,
    public var `password`: `WS_STRING`,
)
public const val `WS_STRING_USERNAME_CREDENTIAL_TYPE`: `WS_USERNAME_CREDENTIAL_TYPE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_STRING_WINDOWS_INTEGRATED_AUTH_CREDENTIAL` (
    public var `credential`: `WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL`,
    public var `username`: `WS_STRING`,
    public var `password`: `WS_STRING`,
    public var `domain`: `WS_STRING`,
)
public const val `WS_STRING_WINDOWS_INTEGRATED_AUTH_CREDENTIAL_TYPE`: `WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL_TYPE` = 1;
public const val `WS_STRUCT_ABSTRACT`: Int = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_STRUCT_DESCRIPTION` (
    public var `size`: UInt,
    public var `alignment`: UInt,
    public var `fields`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_FIELD_DESCRIPTION`>>?,
    public var `fieldCount`: UInt,
    public var `typeLocalName`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `typeNs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `parentType`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_STRUCT_DESCRIPTION`>?,
    public var `subTypes`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_STRUCT_DESCRIPTION`>>?,
    public var `subTypeCount`: UInt,
    public var `structOptions`: UInt,
)
// UNSUPPORTED Rust 3071:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_STRUCT_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_STRUCT_IGNORE_TRAILING_ELEMENT_CONTENT`: Int = 2;
public const val `WS_STRUCT_IGNORE_UNHANDLED_ATTRIBUTES`: Int = 4;
public const val `WS_STRUCT_TYPE`: `WS_TYPE` = 26;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_SUBJECT_NAME_CERT_CREDENTIAL` (
    public var `credential`: `WS_CERT_CREDENTIAL`,
    public var `storeLocation`: UInt,
    public var `storeName`: `WS_STRING`,
    public var `subjectName`: `WS_STRING`,
)
public const val `WS_SUBJECT_NAME_CERT_CREDENTIAL_TYPE`: `WS_CERT_CREDENTIAL_TYPE` = 1;
public const val `WS_SUPPORTING_MESSAGE_SECURITY_USAGE`: `WS_MESSAGE_SECURITY_USAGE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_TCP_BINDING_TEMPLATE` (
    public var `channelProperties`: `WS_CHANNEL_PROPERTIES`,
)
public const val `WS_TCP_BINDING_TEMPLATE_TYPE`: `WS_BINDING_TEMPLATE_TYPE` = 6;
public const val `WS_TCP_CHANNEL_BINDING`: `WS_CHANNEL_BINDING` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_TCP_POLICY_DESCRIPTION` (
    public var `channelProperties`: `WS_CHANNEL_PROPERTIES`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_TCP_SSPI_BINDING_TEMPLATE` (
    public var `channelProperties`: `WS_CHANNEL_PROPERTIES`,
    public var `securityProperties`: `WS_SECURITY_PROPERTIES`,
    public var `sspiTransportSecurityBinding`: `WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_TEMPLATE`,
)
public const val `WS_TCP_SSPI_BINDING_TEMPLATE_TYPE`: `WS_BINDING_TEMPLATE_TYPE` = 7;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_TCP_SSPI_KERBEROS_APREQ_BINDING_TEMPLATE` (
    public var `channelProperties`: `WS_CHANNEL_PROPERTIES`,
    public var `securityProperties`: `WS_SECURITY_PROPERTIES`,
    public var `sspiTransportSecurityBinding`: `WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_TEMPLATE`,
    public var `kerberosApreqMessageSecurityBinding`: `WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_TEMPLATE`,
)
public const val `WS_TCP_SSPI_KERBEROS_APREQ_BINDING_TEMPLATE_TYPE`: `WS_BINDING_TEMPLATE_TYPE` = 9;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_TCP_SSPI_KERBEROS_APREQ_POLICY_DESCRIPTION` (
    public var `channelProperties`: `WS_CHANNEL_PROPERTIES`,
    public var `securityProperties`: `WS_SECURITY_PROPERTIES`,
    public var `sspiTransportSecurityBinding`: `WS_SSPI_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION`,
    public var `kerberosApreqMessageSecurityBinding`: `WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_TCP_SSPI_KERBEROS_APREQ_SECURITY_CONTEXT_BINDING_TEMPLATE` (
    public var `channelProperties`: `WS_CHANNEL_PROPERTIES`,
    public var `securityProperties`: `WS_SECURITY_PROPERTIES`,
    public var `sspiTransportSecurityBinding`: `WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_TEMPLATE`,
    public var `kerberosApreqMessageSecurityBinding`: `WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_TEMPLATE`,
    public var `securityContextSecurityBinding`: `WS_SECURITY_CONTEXT_SECURITY_BINDING_TEMPLATE`,
)
public const val `WS_TCP_SSPI_KERBEROS_APREQ_SECURITY_CONTEXT_BINDING_TEMPLATE_TYPE`: `WS_BINDING_TEMPLATE_TYPE` = 13;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_TCP_SSPI_KERBEROS_APREQ_SECURITY_CONTEXT_POLICY_DESCRIPTION` (
    public var `channelProperties`: `WS_CHANNEL_PROPERTIES`,
    public var `securityProperties`: `WS_SECURITY_PROPERTIES`,
    public var `sspiTransportSecurityBinding`: `WS_SSPI_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION`,
    public var `kerberosApreqMessageSecurityBinding`: `WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION`,
    public var `securityContextSecurityBinding`: `WS_SECURITY_CONTEXT_SECURITY_BINDING_POLICY_DESCRIPTION`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_TCP_SSPI_POLICY_DESCRIPTION` (
    public var `channelProperties`: `WS_CHANNEL_PROPERTIES`,
    public var `securityProperties`: `WS_SECURITY_PROPERTIES`,
    public var `sspiTransportSecurityBinding`: `WS_SSPI_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING` (
    public var `binding`: `WS_SECURITY_BINDING`,
    public var `clientCredential`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL`>?,
)
// UNSUPPORTED Rust 3158:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_CONSTRAINT` (
    public var `bindingConstraint`: `WS_SECURITY_BINDING_CONSTRAINT`,
)
public const val `WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_CONSTRAINT_TYPE`: `WS_SECURITY_BINDING_CONSTRAINT_TYPE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_TEMPLATE` (
    public var `securityBindingProperties`: `WS_SECURITY_BINDING_PROPERTIES`,
    public var `clientCredential`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL`>?,
)
// UNSUPPORTED Rust 3175:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_TEMPLATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_TYPE`: `WS_SECURITY_BINDING_TYPE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_TCP_SSPI_USERNAME_BINDING_TEMPLATE` (
    public var `channelProperties`: `WS_CHANNEL_PROPERTIES`,
    public var `securityProperties`: `WS_SECURITY_PROPERTIES`,
    public var `sspiTransportSecurityBinding`: `WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_TEMPLATE`,
    public var `usernameMessageSecurityBinding`: `WS_USERNAME_MESSAGE_SECURITY_BINDING_TEMPLATE`,
)
public const val `WS_TCP_SSPI_USERNAME_BINDING_TEMPLATE_TYPE`: `WS_BINDING_TEMPLATE_TYPE` = 8;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_TCP_SSPI_USERNAME_POLICY_DESCRIPTION` (
    public var `channelProperties`: `WS_CHANNEL_PROPERTIES`,
    public var `securityProperties`: `WS_SECURITY_PROPERTIES`,
    public var `sspiTransportSecurityBinding`: `WS_SSPI_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION`,
    public var `usernameMessageSecurityBinding`: `WS_USERNAME_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_TCP_SSPI_USERNAME_SECURITY_CONTEXT_BINDING_TEMPLATE` (
    public var `channelProperties`: `WS_CHANNEL_PROPERTIES`,
    public var `securityProperties`: `WS_SECURITY_PROPERTIES`,
    public var `sspiTransportSecurityBinding`: `WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_TEMPLATE`,
    public var `usernameMessageSecurityBinding`: `WS_USERNAME_MESSAGE_SECURITY_BINDING_TEMPLATE`,
    public var `securityContextSecurityBinding`: `WS_SECURITY_CONTEXT_SECURITY_BINDING_TEMPLATE`,
)
public const val `WS_TCP_SSPI_USERNAME_SECURITY_CONTEXT_BINDING_TEMPLATE_TYPE`: `WS_BINDING_TEMPLATE_TYPE` = 12;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_TCP_SSPI_USERNAME_SECURITY_CONTEXT_POLICY_DESCRIPTION` (
    public var `channelProperties`: `WS_CHANNEL_PROPERTIES`,
    public var `securityProperties`: `WS_SECURITY_PROPERTIES`,
    public var `sspiTransportSecurityBinding`: `WS_SSPI_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION`,
    public var `usernameMessageSecurityBinding`: `WS_USERNAME_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION`,
    public var `securityContextSecurityBinding`: `WS_SECURITY_CONTEXT_SECURITY_BINDING_POLICY_DESCRIPTION`,
)
public const val `WS_TEXT_FIELD_MAPPING`: `WS_FIELD_MAPPING` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_THUMBPRINT_CERT_CREDENTIAL` (
    public var `credential`: `WS_CERT_CREDENTIAL`,
    public var `storeLocation`: UInt,
    public var `storeName`: `WS_STRING`,
    public var `thumbprint`: `WS_STRING`,
)
public const val `WS_THUMBPRINT_CERT_CREDENTIAL_TYPE`: `WS_CERT_CREDENTIAL_TYPE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_TIMESPAN` (
    public var `ticks`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_TIMESPAN_DESCRIPTION` (
    public var `minValue`: `WS_TIMESPAN`,
    public var `maxValue`: `WS_TIMESPAN`,
)
public const val `WS_TIMESPAN_TYPE`: `WS_TYPE` = 13;
public const val `WS_TIMESPAN_VALUE_TYPE`: `WS_VALUE_TYPE` = 13;
public const val `WS_TO_HEADER`: `WS_HEADER_TYPE` = 2;
public typealias `WS_TRACE_API` = Int;
public const val `WS_TRACE_API_ABANDON_MESSAGE`: `WS_TRACE_API` = 86;
public const val `WS_TRACE_API_ABORT_CALL`: `WS_TRACE_API` = 174;
public const val `WS_TRACE_API_ABORT_CHANNEL`: `WS_TRACE_API` = 83;
public const val `WS_TRACE_API_ABORT_LISTENER`: `WS_TRACE_API` = 113;
public const val `WS_TRACE_API_ABORT_SERVICE_HOST`: `WS_TRACE_API` = 164;
public const val `WS_TRACE_API_ABORT_SERVICE_PROXY`: `WS_TRACE_API` = 171;
public const val `WS_TRACE_API_ACCEPT_CHANNEL`: `WS_TRACE_API` = 111;
public const val `WS_TRACE_API_ADDRESS_MESSAGE`: `WS_TRACE_API` = 142;
public const val `WS_TRACE_API_ADD_CUSTOM_HEADER`: `WS_TRACE_API` = 130;
public const val `WS_TRACE_API_ADD_ERROR_STRING`: `WS_TRACE_API` = 92;
public const val `WS_TRACE_API_ADD_MAPPED_HEADER`: `WS_TRACE_API` = 131;
public const val `WS_TRACE_API_ALLOC`: `WS_TRACE_API` = 105;
public const val `WS_TRACE_API_ASYNC_EXECUTE`: `WS_TRACE_API` = 68;
public const val `WS_TRACE_API_CALL`: `WS_TRACE_API` = 175;
public const val `WS_TRACE_API_CHECK_MUST_UNDERSTAND_HEADERS`: `WS_TRACE_API` = 143;
public const val `WS_TRACE_API_CLOSE_CHANNEL`: `WS_TRACE_API` = 82;
public const val `WS_TRACE_API_CLOSE_LISTENER`: `WS_TRACE_API` = 112;
public const val `WS_TRACE_API_CLOSE_SERVICE_HOST`: `WS_TRACE_API` = 163;
public const val `WS_TRACE_API_CLOSE_SERVICE_PROXY`: `WS_TRACE_API` = 170;
public const val `WS_TRACE_API_COMBINE_URL`: `WS_TRACE_API` = 178;
public const val `WS_TRACE_API_COPY_ERROR`: `WS_TRACE_API` = 94;
public const val `WS_TRACE_API_COPY_NODE`: `WS_TRACE_API` = 67;
public const val `WS_TRACE_API_CREATE_CHANNEL`: `WS_TRACE_API` = 69;
public const val `WS_TRACE_API_CREATE_CHANNEL_FOR_LISTENER`: `WS_TRACE_API` = 118;
public const val `WS_TRACE_API_CREATE_ERROR`: `WS_TRACE_API` = 91;
public const val `WS_TRACE_API_CREATE_FAULT_FROM_ERROR`: `WS_TRACE_API` = 101;
public const val `WS_TRACE_API_CREATE_HEAP`: `WS_TRACE_API` = 104;
public const val `WS_TRACE_API_CREATE_LISTENER`: `WS_TRACE_API` = 109;
public const val `WS_TRACE_API_CREATE_MESSAGE`: `WS_TRACE_API` = 119;
public const val `WS_TRACE_API_CREATE_MESSAGE_FOR_CHANNEL`: `WS_TRACE_API` = 120;
public const val `WS_TRACE_API_CREATE_METADATA`: `WS_TRACE_API` = 183;
public const val `WS_TRACE_API_CREATE_READER`: `WS_TRACE_API` = 6;
public const val `WS_TRACE_API_CREATE_SERVICE_HOST`: `WS_TRACE_API` = 161;
public const val `WS_TRACE_API_CREATE_SERVICE_PROXY`: `WS_TRACE_API` = 168;
public const val `WS_TRACE_API_CREATE_WRITER`: `WS_TRACE_API` = 29;
public const val `WS_TRACE_API_CREATE_XML_BUFFER`: `WS_TRACE_API` = 4;
public const val `WS_TRACE_API_CREATE_XML_SECURITY_TOKEN`: `WS_TRACE_API` = 149;
public const val `WS_TRACE_API_DATETIME_TO_FILETIME`: `WS_TRACE_API` = 179;
public const val `WS_TRACE_API_DECODE_URL`: `WS_TRACE_API` = 176;
public const val `WS_TRACE_API_DUMP_MEMORY`: `WS_TRACE_API` = 181;
public const val `WS_TRACE_API_ENCODE_URL`: `WS_TRACE_API` = 177;
public const val `WS_TRACE_API_END_READER_CANONICALIZATION`: `WS_TRACE_API` = 1;
public const val `WS_TRACE_API_END_WRITER_CANONICALIZATION`: `WS_TRACE_API` = 3;
public const val `WS_TRACE_API_FILETIME_TO_DATETIME`: `WS_TRACE_API` = 180;
public const val `WS_TRACE_API_FILL_BODY`: `WS_TRACE_API` = 145;
public const val `WS_TRACE_API_FILL_READER`: `WS_TRACE_API` = 12;
public const val `WS_TRACE_API_FIND_ATTRIBUTE`: `WS_TRACE_API` = 20;
public const val `WS_TRACE_API_FLUSH_BODY`: `WS_TRACE_API` = 146;
public const val `WS_TRACE_API_FLUSH_WRITER`: `WS_TRACE_API` = 34;
public const val `WS_TRACE_API_FREE_CHANNEL`: `WS_TRACE_API` = 84;
public const val `WS_TRACE_API_FREE_ERROR`: `WS_TRACE_API` = 98;
public const val `WS_TRACE_API_FREE_HEAP`: `WS_TRACE_API` = 108;
public const val `WS_TRACE_API_FREE_LISTENER`: `WS_TRACE_API` = 115;
public const val `WS_TRACE_API_FREE_MESSAGE`: `WS_TRACE_API` = 123;
public const val `WS_TRACE_API_FREE_METADATA`: `WS_TRACE_API` = 185;
public const val `WS_TRACE_API_FREE_SECURITY_TOKEN`: `WS_TRACE_API` = 150;
public const val `WS_TRACE_API_FREE_SERVICE_HOST`: `WS_TRACE_API` = 165;
public const val `WS_TRACE_API_FREE_SERVICE_PROXY`: `WS_TRACE_API` = 172;
public const val `WS_TRACE_API_FREE_XML_READER`: `WS_TRACE_API` = 9;
public const val `WS_TRACE_API_FREE_XML_WRITER`: `WS_TRACE_API` = 30;
public const val `WS_TRACE_API_GET_CHANNEL_PROPERTY`: `WS_TRACE_API` = 76;
public const val `WS_TRACE_API_GET_CONTEXT_PROPERTY`: `WS_TRACE_API` = 88;
public const val `WS_TRACE_API_GET_CUSTOM_HEADER`: `WS_TRACE_API` = 126;
public const val `WS_TRACE_API_GET_DICTIONARY`: `WS_TRACE_API` = 89;
public const val `WS_TRACE_API_GET_ERROR_PROPERTY`: `WS_TRACE_API` = 95;
public const val `WS_TRACE_API_GET_ERROR_STRING`: `WS_TRACE_API` = 93;
public const val `WS_TRACE_API_GET_FAULT_ERROR_DETAIL`: `WS_TRACE_API` = 103;
public const val `WS_TRACE_API_GET_FAULT_ERROR_PROPERTY`: `WS_TRACE_API` = 99;
public const val `WS_TRACE_API_GET_HEADER`: `WS_TRACE_API` = 125;
public const val `WS_TRACE_API_GET_HEADER_ATTRIBUTES`: `WS_TRACE_API` = 124;
public const val `WS_TRACE_API_GET_HEAP_PROPERTY`: `WS_TRACE_API` = 106;
public const val `WS_TRACE_API_GET_LISTENER_PROPERTY`: `WS_TRACE_API` = 116;
public const val `WS_TRACE_API_GET_MAPPED_HEADER`: `WS_TRACE_API` = 133;
public const val `WS_TRACE_API_GET_MESSAGE_PROPERTY`: `WS_TRACE_API` = 140;
public const val `WS_TRACE_API_GET_METADATA_ENDPOINTS`: `WS_TRACE_API` = 189;
public const val `WS_TRACE_API_GET_METADATA_PROPERTY`: `WS_TRACE_API` = 187;
public const val `WS_TRACE_API_GET_MISSING_METADATA_DOCUMENT_ADDRESS`: `WS_TRACE_API` = 188;
public const val `WS_TRACE_API_GET_POLICY_ALTERNATIVE_COUNT`: `WS_TRACE_API` = 192;
public const val `WS_TRACE_API_GET_POLICY_PROPERTY`: `WS_TRACE_API` = 191;
public const val `WS_TRACE_API_GET_READER_NODE`: `WS_TRACE_API` = 11;
public const val `WS_TRACE_API_GET_READER_POSITION`: `WS_TRACE_API` = 26;
public const val `WS_TRACE_API_GET_READER_PROPERTY`: `WS_TRACE_API` = 10;
public const val `WS_TRACE_API_GET_SECURITY_CONTEXT_PROPERTY`: `WS_TRACE_API` = 152;
public const val `WS_TRACE_API_GET_SECURITY_TOKEN_PROPERTY`: `WS_TRACE_API` = 148;
public const val `WS_TRACE_API_GET_SERVICE_HOST_PROPERTY`: `WS_TRACE_API` = 160;
public const val `WS_TRACE_API_GET_SERVICE_PROXY_PROPERTY`: `WS_TRACE_API` = 167;
public const val `WS_TRACE_API_GET_WRITER_POSITION`: `WS_TRACE_API` = 58;
public const val `WS_TRACE_API_GET_WRITER_PROPERTY`: `WS_TRACE_API` = 33;
public const val `WS_TRACE_API_GET_XML_ATTRIBUTE`: `WS_TRACE_API` = 66;
public const val `WS_TRACE_API_INITIALIZE_MESSAGE`: `WS_TRACE_API` = 121;
public const val `WS_TRACE_API_MARK_HEADER_AS_UNDERSTOOD`: `WS_TRACE_API` = 144;
public const val `WS_TRACE_API_MATCH_POLICY_ALTERNATIVE`: `WS_TRACE_API` = 190;
public const val `WS_TRACE_API_MOVE_READER`: `WS_TRACE_API` = 28;
public const val `WS_TRACE_API_MOVE_WRITER`: `WS_TRACE_API` = 60;
public const val `WS_TRACE_API_NAMESPACE_FROM_PREFIX`: `WS_TRACE_API` = 64;
public const val `WS_TRACE_API_NONE`: `WS_TRACE_API` = -1;
public const val `WS_TRACE_API_OPEN_CHANNEL`: `WS_TRACE_API` = 70;
public const val `WS_TRACE_API_OPEN_LISTENER`: `WS_TRACE_API` = 110;
public const val `WS_TRACE_API_OPEN_SERVICE_HOST`: `WS_TRACE_API` = 162;
public const val `WS_TRACE_API_OPEN_SERVICE_PROXY`: `WS_TRACE_API` = 169;
public const val `WS_TRACE_API_PREFIX_FROM_NAMESPACE`: `WS_TRACE_API` = 57;
public const val `WS_TRACE_API_PULL_BYTES`: `WS_TRACE_API` = 51;
public const val `WS_TRACE_API_PUSH_BYTES`: `WS_TRACE_API` = 50;
public const val `WS_TRACE_API_READ_ARRAY`: `WS_TRACE_API` = 25;
public const val `WS_TRACE_API_READ_ATTRIBUTE_TYPE`: `WS_TRACE_API` = 154;
public const val `WS_TRACE_API_READ_BODY`: `WS_TRACE_API` = 135;
public const val `WS_TRACE_API_READ_BYTES`: `WS_TRACE_API` = 24;
public const val `WS_TRACE_API_READ_CHARS`: `WS_TRACE_API` = 22;
public const val `WS_TRACE_API_READ_CHARS_UTF8`: `WS_TRACE_API` = 23;
public const val `WS_TRACE_API_READ_ELEMENT_TYPE`: `WS_TRACE_API` = 153;
public const val `WS_TRACE_API_READ_ELEMENT_VALUE`: `WS_TRACE_API` = 21;
public const val `WS_TRACE_API_READ_ENDPOINT_ADDRESS_EXTENSION`: `WS_TRACE_API` = 90;
public const val `WS_TRACE_API_READ_END_ATTRIBUTE`: `WS_TRACE_API` = 16;
public const val `WS_TRACE_API_READ_END_ELEMENT`: `WS_TRACE_API` = 19;
public const val `WS_TRACE_API_READ_ENVELOPE_END`: `WS_TRACE_API` = 139;
public const val `WS_TRACE_API_READ_ENVELOPE_START`: `WS_TRACE_API` = 138;
public const val `WS_TRACE_API_READ_MESSAGE_END`: `WS_TRACE_API` = 81;
public const val `WS_TRACE_API_READ_MESSAGE_START`: `WS_TRACE_API` = 80;
public const val `WS_TRACE_API_READ_METADATA`: `WS_TRACE_API` = 184;
public const val `WS_TRACE_API_READ_NODE`: `WS_TRACE_API` = 17;
public const val `WS_TRACE_API_READ_QUALIFIED_NAME`: `WS_TRACE_API` = 65;
public const val `WS_TRACE_API_READ_START_ATTRIBUTE`: `WS_TRACE_API` = 15;
public const val `WS_TRACE_API_READ_START_ELEMENT`: `WS_TRACE_API` = 13;
public const val `WS_TRACE_API_READ_TO_START_ELEMENT`: `WS_TRACE_API` = 14;
public const val `WS_TRACE_API_READ_TYPE`: `WS_TRACE_API` = 155;
public const val `WS_TRACE_API_READ_XML_BUFFER`: `WS_TRACE_API` = 42;
public const val `WS_TRACE_API_READ_XML_BUFFER_FROM_BYTES`: `WS_TRACE_API` = 44;
public const val `WS_TRACE_API_RECEIVE_MESSAGE`: `WS_TRACE_API` = 72;
public const val `WS_TRACE_API_REMOVE_CUSTOM_HEADER`: `WS_TRACE_API` = 129;
public const val `WS_TRACE_API_REMOVE_HEADER`: `WS_TRACE_API` = 127;
public const val `WS_TRACE_API_REMOVE_MAPPED_HEADER`: `WS_TRACE_API` = 132;
public const val `WS_TRACE_API_REMOVE_NODE`: `WS_TRACE_API` = 5;
public const val `WS_TRACE_API_REQUEST_REPLY`: `WS_TRACE_API` = 73;
public const val `WS_TRACE_API_REQUEST_SECURITY_TOKEN`: `WS_TRACE_API` = 147;
public const val `WS_TRACE_API_RESET_CHANNEL`: `WS_TRACE_API` = 85;
public const val `WS_TRACE_API_RESET_ERROR`: `WS_TRACE_API` = 97;
public const val `WS_TRACE_API_RESET_HEAP`: `WS_TRACE_API` = 107;
public const val `WS_TRACE_API_RESET_LISTENER`: `WS_TRACE_API` = 114;
public const val `WS_TRACE_API_RESET_MESSAGE`: `WS_TRACE_API` = 122;
public const val `WS_TRACE_API_RESET_METADATA`: `WS_TRACE_API` = 186;
public const val `WS_TRACE_API_RESET_SERVICE_HOST`: `WS_TRACE_API` = 166;
public const val `WS_TRACE_API_RESET_SERVICE_PROXY`: `WS_TRACE_API` = 173;
public const val `WS_TRACE_API_REVOKE_SECURITY_CONTEXT`: `WS_TRACE_API` = 151;
public const val `WS_TRACE_API_SEND_FAULT_MESSAGE_FOR_ERROR`: `WS_TRACE_API` = 75;
public const val `WS_TRACE_API_SEND_MESSAGE`: `WS_TRACE_API` = 71;
public const val `WS_TRACE_API_SEND_REPLY_MESSAGE`: `WS_TRACE_API` = 74;
public const val `WS_TRACE_API_SERVICE_REGISTER_FOR_CANCEL`: `WS_TRACE_API` = 159;
public const val `WS_TRACE_API_SET_AUTOFAIL`: `WS_TRACE_API` = 182;
public const val `WS_TRACE_API_SET_CHANNEL_PROPERTY`: `WS_TRACE_API` = 77;
public const val `WS_TRACE_API_SET_ERROR_PROPERTY`: `WS_TRACE_API` = 96;
public const val `WS_TRACE_API_SET_FAULT_ERROR_DETAIL`: `WS_TRACE_API` = 102;
public const val `WS_TRACE_API_SET_FAULT_ERROR_PROPERTY`: `WS_TRACE_API` = 100;
public const val `WS_TRACE_API_SET_HEADER`: `WS_TRACE_API` = 128;
public const val `WS_TRACE_API_SET_INPUT`: `WS_TRACE_API` = 7;
public const val `WS_TRACE_API_SET_INPUT_TO_BUFFER`: `WS_TRACE_API` = 8;
public const val `WS_TRACE_API_SET_LISTENER_PROPERTY`: `WS_TRACE_API` = 117;
public const val `WS_TRACE_API_SET_MESSAGE_PROPERTY`: `WS_TRACE_API` = 141;
public const val `WS_TRACE_API_SET_OUTPUT`: `WS_TRACE_API` = 31;
public const val `WS_TRACE_API_SET_OUTPUT_TO_BUFFER`: `WS_TRACE_API` = 32;
public const val `WS_TRACE_API_SET_READER_POSITION`: `WS_TRACE_API` = 27;
public const val `WS_TRACE_API_SET_WRITER_POSITION`: `WS_TRACE_API` = 59;
public const val `WS_TRACE_API_SHUTDOWN_SESSION_CHANNEL`: `WS_TRACE_API` = 87;
public const val `WS_TRACE_API_SKIP_NODE`: `WS_TRACE_API` = 18;
public const val `WS_TRACE_API_START_READER_CANONICALIZATION`: `WS_TRACE_API` = 0;
public const val `WS_TRACE_API_START_WRITER_CANONICALIZATION`: `WS_TRACE_API` = 2;
public const val `WS_TRACE_API_TRIM_XML_WHITESPACE`: `WS_TRACE_API` = 61;
public const val `WS_TRACE_API_VERIFY_XML_NCNAME`: `WS_TRACE_API` = 62;
public const val `WS_TRACE_API_WRITE_ARRAY`: `WS_TRACE_API` = 45;
public const val `WS_TRACE_API_WRITE_ATTRIBUTE_TYPE`: `WS_TRACE_API` = 157;
public const val `WS_TRACE_API_WRITE_BODY`: `WS_TRACE_API` = 134;
public const val `WS_TRACE_API_WRITE_BYTES`: `WS_TRACE_API` = 49;
public const val `WS_TRACE_API_WRITE_CHARS`: `WS_TRACE_API` = 47;
public const val `WS_TRACE_API_WRITE_CHARS_UTF8`: `WS_TRACE_API` = 48;
public const val `WS_TRACE_API_WRITE_ELEMENT_TYPE`: `WS_TRACE_API` = 156;
public const val `WS_TRACE_API_WRITE_END_ATTRIBUTE`: `WS_TRACE_API` = 39;
public const val `WS_TRACE_API_WRITE_END_CDATA`: `WS_TRACE_API` = 55;
public const val `WS_TRACE_API_WRITE_END_ELEMENT`: `WS_TRACE_API` = 52;
public const val `WS_TRACE_API_WRITE_END_START_ELEMENT`: `WS_TRACE_API` = 36;
public const val `WS_TRACE_API_WRITE_ENVELOPE_END`: `WS_TRACE_API` = 137;
public const val `WS_TRACE_API_WRITE_ENVELOPE_START`: `WS_TRACE_API` = 136;
public const val `WS_TRACE_API_WRITE_MESSAGE_END`: `WS_TRACE_API` = 79;
public const val `WS_TRACE_API_WRITE_MESSAGE_START`: `WS_TRACE_API` = 78;
public const val `WS_TRACE_API_WRITE_NODE`: `WS_TRACE_API` = 56;
public const val `WS_TRACE_API_WRITE_QUALIFIED_NAME`: `WS_TRACE_API` = 46;
public const val `WS_TRACE_API_WRITE_START_ATTRIBUTE`: `WS_TRACE_API` = 38;
public const val `WS_TRACE_API_WRITE_START_CDATA`: `WS_TRACE_API` = 54;
public const val `WS_TRACE_API_WRITE_START_ELEMENT`: `WS_TRACE_API` = 35;
public const val `WS_TRACE_API_WRITE_TEXT`: `WS_TRACE_API` = 53;
public const val `WS_TRACE_API_WRITE_TYPE`: `WS_TRACE_API` = 158;
public const val `WS_TRACE_API_WRITE_VALUE`: `WS_TRACE_API` = 40;
public const val `WS_TRACE_API_WRITE_XMLNS_ATTRIBUTE`: `WS_TRACE_API` = 37;
public const val `WS_TRACE_API_WRITE_XML_BUFFER`: `WS_TRACE_API` = 41;
public const val `WS_TRACE_API_WRITE_XML_BUFFER_TO_BYTES`: `WS_TRACE_API` = 43;
public const val `WS_TRACE_API_WS_CREATE_SERVICE_HOST_FROM_TEMPLATE`: `WS_TRACE_API` = 194;
public const val `WS_TRACE_API_WS_CREATE_SERVICE_PROXY_FROM_TEMPLATE`: `WS_TRACE_API` = 193;
public const val `WS_TRACE_API_XML_STRING_EQUALS`: `WS_TRACE_API` = 63;
public typealias `WS_TRANSFER_MODE` = Int;
public typealias `WS_TRUST_VERSION` = Int;
public const val `WS_TRUST_VERSION_1_3`: `WS_TRUST_VERSION` = 2;
public const val `WS_TRUST_VERSION_FEBRUARY_2005`: `WS_TRUST_VERSION` = 1;
public typealias `WS_TYPE` = Int;
public const val `WS_TYPE_ATTRIBUTE_FIELD_MAPPING`: `WS_FIELD_MAPPING` = 0;
public typealias `WS_TYPE_MAPPING` = Int;
public const val `WS_UDP_CHANNEL_BINDING`: `WS_CHANNEL_BINDING` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_UINT16_DESCRIPTION` (
    public var `minValue`: UShort,
    public var `maxValue`: UShort,
)
public const val `WS_UINT16_TYPE`: `WS_TYPE` = 6;
public const val `WS_UINT16_VALUE_TYPE`: `WS_VALUE_TYPE` = 6;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_UINT32_DESCRIPTION` (
    public var `minValue`: UInt,
    public var `maxValue`: UInt,
)
public const val `WS_UINT32_TYPE`: `WS_TYPE` = 7;
public const val `WS_UINT32_VALUE_TYPE`: `WS_VALUE_TYPE` = 7;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_UINT64_DESCRIPTION` (
    public var `minValue`: ULong,
    public var `maxValue`: ULong,
)
public const val `WS_UINT64_TYPE`: `WS_TYPE` = 8;
public const val `WS_UINT64_VALUE_TYPE`: `WS_VALUE_TYPE` = 8;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_UINT8_DESCRIPTION` (
    public var `minValue`: UByte,
    public var `maxValue`: UByte,
)
public const val `WS_UINT8_TYPE`: `WS_TYPE` = 5;
public const val `WS_UINT8_VALUE_TYPE`: `WS_VALUE_TYPE` = 5;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_UNION_DESCRIPTION` (
    public var `size`: UInt,
    public var `alignment`: UInt,
    public var `fields`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_UNION_FIELD_DESCRIPTION`>>?,
    public var `fieldCount`: UInt,
    public var `enumOffset`: UInt,
    public var `noneEnumValue`: Int,
    public var `valueIndices`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
)
// UNSUPPORTED Rust 3489:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_UNION_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_UNION_FIELD_DESCRIPTION` (
    public var `value`: Int,
    public var `field`: `WS_FIELD_DESCRIPTION`,
)
public const val `WS_UNION_TYPE`: `WS_TYPE` = 33;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_UNIQUE_ID` (
    public var `uri`: `WS_STRING`,
    public var `guid`: `windows_sys`.`core`.`GUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_UNIQUE_ID_DESCRIPTION` (
    public var `minCharCount`: UInt,
    public var `maxCharCount`: UInt,
)
public const val `WS_UNIQUE_ID_TYPE`: `WS_TYPE` = 15;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_UNKNOWN_ENDPOINT_IDENTITY` (
    public var `identity`: `WS_ENDPOINT_IDENTITY`,
    public var `element`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_BUFFER`>?,
)
// UNSUPPORTED Rust 3520:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_UNKNOWN_ENDPOINT_IDENTITY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_UNKNOWN_ENDPOINT_IDENTITY_TYPE`: `WS_ENDPOINT_IDENTITY_TYPE` = 6;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_UPN_ENDPOINT_IDENTITY` (
    public var `identity`: `WS_ENDPOINT_IDENTITY`,
    public var `upn`: `WS_STRING`,
)
public const val `WS_UPN_ENDPOINT_IDENTITY_TYPE`: `WS_ENDPOINT_IDENTITY_TYPE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_URL` (
    public var `scheme`: `WS_URL_SCHEME_TYPE`,
)
public const val `WS_URL_FLAGS_ALLOW_HOST_WILDCARDS`: Int = 1;
public const val `WS_URL_FLAGS_NO_PATH_COLLAPSE`: Int = 2;
public const val `WS_URL_FLAGS_ZERO_TERMINATE`: Int = 4;
public const val `WS_URL_HTTPS_SCHEME_TYPE`: `WS_URL_SCHEME_TYPE` = 1;
public const val `WS_URL_HTTP_SCHEME_TYPE`: `WS_URL_SCHEME_TYPE` = 0;
public const val `WS_URL_NETPIPE_SCHEME_TYPE`: `WS_URL_SCHEME_TYPE` = 4;
public const val `WS_URL_NETTCP_SCHEME_TYPE`: `WS_URL_SCHEME_TYPE` = 2;
public typealias `WS_URL_SCHEME_TYPE` = Int;
public const val `WS_URL_SOAPUDP_SCHEME_TYPE`: `WS_URL_SCHEME_TYPE` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_USERNAME_CREDENTIAL` (
    public var `credentialType`: `WS_USERNAME_CREDENTIAL_TYPE`,
)
public typealias `WS_USERNAME_CREDENTIAL_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_USERNAME_MESSAGE_SECURITY_BINDING` (
    public var `binding`: `WS_SECURITY_BINDING`,
    public var `bindingUsage`: `WS_MESSAGE_SECURITY_USAGE`,
    public var `clientCredential`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_USERNAME_CREDENTIAL`>?,
    public var `passwordValidator`: `WS_VALIDATE_PASSWORD_CALLBACK`,
    public var `passwordValidatorCallbackState`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 3562:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_USERNAME_MESSAGE_SECURITY_BINDING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_USERNAME_MESSAGE_SECURITY_BINDING_CONSTRAINT` (
    public var `bindingConstraint`: `WS_SECURITY_BINDING_CONSTRAINT`,
    public var `bindingUsage`: `WS_MESSAGE_SECURITY_USAGE`,
)
public const val `WS_USERNAME_MESSAGE_SECURITY_BINDING_CONSTRAINT_TYPE`: `WS_SECURITY_BINDING_CONSTRAINT_TYPE` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_USERNAME_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION` (
    public var `securityBindingProperties`: `WS_SECURITY_BINDING_PROPERTIES`,
    public var `bindingUsage`: `WS_MESSAGE_SECURITY_USAGE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_USERNAME_MESSAGE_SECURITY_BINDING_TEMPLATE` (
    public var `securityBindingProperties`: `WS_SECURITY_BINDING_PROPERTIES`,
    public var `clientCredential`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_USERNAME_CREDENTIAL`>?,
    public var `passwordValidator`: `WS_VALIDATE_PASSWORD_CALLBACK`,
    public var `passwordValidatorCallbackState`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 3588:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_USERNAME_MESSAGE_SECURITY_BINDING_TEMPLATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_USERNAME_MESSAGE_SECURITY_BINDING_TYPE`: `WS_SECURITY_BINDING_TYPE` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_UTF8_ARRAY_DESCRIPTION` (
    public var `minByteCount`: UInt,
    public var `maxByteCount`: UInt,
)
public const val `WS_UTF8_ARRAY_TYPE`: `WS_TYPE` = 23;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_VALIDATE_PASSWORD_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_STRING`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_VALIDATE_SAML_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_BUFFER`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
public typealias `WS_VALUE_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_VOID_DESCRIPTION` (
    public var `size`: UInt,
)
public const val `WS_VOID_TYPE`: `WS_TYPE` = 30;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL` (
    public var `credentialType`: `WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL_TYPE`,
)
public typealias `WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL_TYPE` = Int;
public typealias `WS_WINDOWS_INTEGRATED_AUTH_PACKAGE` = Int;
public const val `WS_WINDOWS_INTEGRATED_AUTH_PACKAGE_KERBEROS`: `WS_WINDOWS_INTEGRATED_AUTH_PACKAGE` = 1;
public const val `WS_WINDOWS_INTEGRATED_AUTH_PACKAGE_NTLM`: `WS_WINDOWS_INTEGRATED_AUTH_PACKAGE` = 2;
public const val `WS_WINDOWS_INTEGRATED_AUTH_PACKAGE_SPNEGO`: `WS_WINDOWS_INTEGRATED_AUTH_PACKAGE` = 3;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_WRITE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_BYTES`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_WRITE_MESSAGE_END_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_WRITE_MESSAGE_START_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_MESSAGE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ASYNC_CONTEXT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
public const val `WS_WRITE_NILLABLE_POINTER`: `WS_WRITE_OPTION` = 4;
public const val `WS_WRITE_NILLABLE_VALUE`: `WS_WRITE_OPTION` = 3;
public typealias `WS_WRITE_OPTION` = Int;
public const val `WS_WRITE_REQUIRED_POINTER`: `WS_WRITE_OPTION` = 2;
public const val `WS_WRITE_REQUIRED_VALUE`: `WS_WRITE_OPTION` = 1;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WS_WRITE_TYPE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`WS_XML_WRITER`>?, `WS_TYPE_MAPPING`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`WS_ERROR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_WSZ_DESCRIPTION` (
    public var `minCharCount`: UInt,
    public var `maxCharCount`: UInt,
)
public const val `WS_WSZ_TYPE`: `WS_TYPE` = 17;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_XML_ATTRIBUTE` (
    public var `singleQuote`: UByte,
    public var `isXmlNs`: UByte,
    public var `prefix`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `localName`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `ns`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_TEXT`>?,
)
// UNSUPPORTED Rust 3646:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_XML_ATTRIBUTE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_XML_ATTRIBUTE_FIELD_MAPPING`: `WS_FIELD_MAPPING` = 6;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_XML_BASE64_TEXT` (
    public var `text`: `WS_XML_TEXT`,
    public var `bytes`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `length`: UInt,
)
// UNSUPPORTED Rust 3659:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_XML_BASE64_TEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_XML_BOOL_TEXT` (
    public var `text`: `WS_XML_TEXT`,
    public var `value`: `windows_sys`.`core`.`BOOL`,
)
public typealias `WS_XML_BUFFER` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_XML_BUFFER_PROPERTY` (
    public var `id`: `WS_XML_BUFFER_PROPERTY_ID`,
    public var `value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `valueSize`: UInt,
)
// UNSUPPORTED Rust 3678:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_XML_BUFFER_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WS_XML_BUFFER_PROPERTY_ID` = Int;
public const val `WS_XML_BUFFER_TYPE`: `WS_TYPE` = 21;
public typealias `WS_XML_CANONICALIZATION_ALGORITHM` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_XML_CANONICALIZATION_INCLUSIVE_PREFIXES` (
    public var `prefixCount`: UInt,
    public var `prefixes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
)
// UNSUPPORTED Rust 3692:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_XML_CANONICALIZATION_INCLUSIVE_PREFIXES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_XML_CANONICALIZATION_PROPERTY` (
    public var `id`: `WS_XML_CANONICALIZATION_PROPERTY_ID`,
    public var `value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `valueSize`: UInt,
)
// UNSUPPORTED Rust 3704:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_XML_CANONICALIZATION_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_XML_CANONICALIZATION_PROPERTY_ALGORITHM`: `WS_XML_CANONICALIZATION_PROPERTY_ID` = 0;
public typealias `WS_XML_CANONICALIZATION_PROPERTY_ID` = Int;
public const val `WS_XML_CANONICALIZATION_PROPERTY_INCLUSIVE_PREFIXES`: `WS_XML_CANONICALIZATION_PROPERTY_ID` = 1;
public const val `WS_XML_CANONICALIZATION_PROPERTY_OMITTED_ELEMENT`: `WS_XML_CANONICALIZATION_PROPERTY_ID` = 2;
public const val `WS_XML_CANONICALIZATION_PROPERTY_OUTPUT_BUFFER_SIZE`: `WS_XML_CANONICALIZATION_PROPERTY_ID` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_XML_COMMENT_NODE` (
    public var `node`: `WS_XML_NODE`,
    public var `value`: `WS_XML_STRING`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_XML_DATETIME_TEXT` (
    public var `text`: `WS_XML_TEXT`,
    public var `value`: `WS_DATETIME`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_XML_DECIMAL_TEXT` (
    public var `text`: `WS_XML_TEXT`,
    public var `value`: `super`.`super`.`Foundation`.`DECIMAL`,
)
// UNSUPPORTED Rust 3732:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_XML_DECIMAL_TEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_XML_DICTIONARY` (
    public var `guid`: `windows_sys`.`core`.`GUID`,
    public var `strings`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `stringCount`: UInt,
    public var `isConst`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 3745:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_XML_DICTIONARY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_XML_DOUBLE_TEXT` (
    public var `text`: `WS_XML_TEXT`,
    public var `value`: Double,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_XML_ELEMENT_NODE` (
    public var `node`: `WS_XML_NODE`,
    public var `prefix`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `localName`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `ns`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `attributeCount`: UInt,
    public var `attributes`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_XML_ATTRIBUTE`>>?,
    public var `isEmpty`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 3767:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_XML_ELEMENT_NODE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_XML_FLOAT_TEXT` (
    public var `text`: `WS_XML_TEXT`,
    public var `value`: Float,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_XML_GUID_TEXT` (
    public var `text`: `WS_XML_TEXT`,
    public var `value`: `windows_sys`.`core`.`GUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_XML_INT32_TEXT` (
    public var `text`: `WS_XML_TEXT`,
    public var `value`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_XML_INT64_TEXT` (
    public var `text`: `WS_XML_TEXT`,
    public var `value`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_XML_LIST_TEXT` (
    public var `text`: `WS_XML_TEXT`,
    public var `itemCount`: UInt,
    public var `items`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WS_XML_TEXT`>>?,
)
// UNSUPPORTED Rust 3803:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_XML_LIST_TEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_XML_NODE` (
    public var `nodeType`: `WS_XML_NODE_TYPE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_XML_NODE_POSITION` (
    public var `buffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_BUFFER`>?,
    public var `node`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 3819:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_XML_NODE_POSITION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WS_XML_NODE_TYPE` = Int;
public const val `WS_XML_NODE_TYPE_BOF`: `WS_XML_NODE_TYPE` = 9;
public const val `WS_XML_NODE_TYPE_CDATA`: `WS_XML_NODE_TYPE` = 6;
public const val `WS_XML_NODE_TYPE_COMMENT`: `WS_XML_NODE_TYPE` = 4;
public const val `WS_XML_NODE_TYPE_ELEMENT`: `WS_XML_NODE_TYPE` = 1;
public const val `WS_XML_NODE_TYPE_END_CDATA`: `WS_XML_NODE_TYPE` = 7;
public const val `WS_XML_NODE_TYPE_END_ELEMENT`: `WS_XML_NODE_TYPE` = 3;
public const val `WS_XML_NODE_TYPE_EOF`: `WS_XML_NODE_TYPE` = 8;
public const val `WS_XML_NODE_TYPE_TEXT`: `WS_XML_NODE_TYPE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_XML_QNAME` (
    public var `localName`: `WS_XML_STRING`,
    public var `ns`: `WS_XML_STRING`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_XML_QNAME_DESCRIPTION` (
    public var `minLocalNameByteCount`: UInt,
    public var `maxLocalNameByteCount`: UInt,
    public var `minNsByteCount`: UInt,
    public var `maxNsByteCount`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_XML_QNAME_TEXT` (
    public var `text`: `WS_XML_TEXT`,
    public var `prefix`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `localName`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
    public var `ns`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_STRING`>?,
)
// UNSUPPORTED Rust 3855:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_XML_QNAME_TEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_XML_QNAME_TYPE`: `WS_TYPE` = 20;
public typealias `WS_XML_READER` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_XML_READER_BINARY_ENCODING` (
    public var `encoding`: `WS_XML_READER_ENCODING`,
    public var `staticDictionary`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_DICTIONARY`>?,
    public var `dynamicDictionary`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_DICTIONARY`>?,
)
// UNSUPPORTED Rust 3869:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_XML_READER_BINARY_ENCODING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_XML_READER_BUFFER_INPUT` (
    public var `input`: `WS_XML_READER_INPUT`,
    public var `encodedData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `encodedDataSize`: UInt,
)
// UNSUPPORTED Rust 3881:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_XML_READER_BUFFER_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_XML_READER_ENCODING` (
    public var `encodingType`: `WS_XML_READER_ENCODING_TYPE`,
)
public typealias `WS_XML_READER_ENCODING_TYPE` = Int;
public const val `WS_XML_READER_ENCODING_TYPE_BINARY`: `WS_XML_READER_ENCODING_TYPE` = 2;
public const val `WS_XML_READER_ENCODING_TYPE_MTOM`: `WS_XML_READER_ENCODING_TYPE` = 3;
public const val `WS_XML_READER_ENCODING_TYPE_RAW`: `WS_XML_READER_ENCODING_TYPE` = 4;
public const val `WS_XML_READER_ENCODING_TYPE_TEXT`: `WS_XML_READER_ENCODING_TYPE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_XML_READER_INPUT` (
    public var `inputType`: `WS_XML_READER_INPUT_TYPE`,
)
public typealias `WS_XML_READER_INPUT_TYPE` = Int;
public const val `WS_XML_READER_INPUT_TYPE_BUFFER`: `WS_XML_READER_INPUT_TYPE` = 1;
public const val `WS_XML_READER_INPUT_TYPE_STREAM`: `WS_XML_READER_INPUT_TYPE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_XML_READER_MTOM_ENCODING` (
    public var `encoding`: `WS_XML_READER_ENCODING`,
    public var `textEncoding`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_READER_ENCODING`>?,
    public var `readMimeHeader`: `windows_sys`.`core`.`BOOL`,
    public var `startInfo`: `WS_STRING`,
    public var `boundary`: `WS_STRING`,
    public var `startUri`: `WS_STRING`,
)
// UNSUPPORTED Rust 3914:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_XML_READER_MTOM_ENCODING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_XML_READER_PROPERTIES` (
    public var `properties`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_READER_PROPERTY`>?,
    public var `propertyCount`: UInt,
)
// UNSUPPORTED Rust 3925:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_XML_READER_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_XML_READER_PROPERTY` (
    public var `id`: `WS_XML_READER_PROPERTY_ID`,
    public var `value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `valueSize`: UInt,
)
// UNSUPPORTED Rust 3937:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_XML_READER_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_XML_READER_PROPERTY_ALLOW_FRAGMENT`: `WS_XML_READER_PROPERTY_ID` = 1;
public const val `WS_XML_READER_PROPERTY_ALLOW_INVALID_CHARACTER_REFERENCES`: `WS_XML_READER_PROPERTY_ID` = 13;
public const val `WS_XML_READER_PROPERTY_CHARSET`: `WS_XML_READER_PROPERTY_ID` = 4;
public const val `WS_XML_READER_PROPERTY_COLUMN`: `WS_XML_READER_PROPERTY_ID` = 6;
public typealias `WS_XML_READER_PROPERTY_ID` = Int;
public const val `WS_XML_READER_PROPERTY_IN_ATTRIBUTE`: `WS_XML_READER_PROPERTY_ID` = 9;
public const val `WS_XML_READER_PROPERTY_MAX_ATTRIBUTES`: `WS_XML_READER_PROPERTY_ID` = 2;
public const val `WS_XML_READER_PROPERTY_MAX_DEPTH`: `WS_XML_READER_PROPERTY_ID` = 0;
public const val `WS_XML_READER_PROPERTY_MAX_MIME_PARTS`: `WS_XML_READER_PROPERTY_ID` = 12;
public const val `WS_XML_READER_PROPERTY_MAX_NAMESPACES`: `WS_XML_READER_PROPERTY_ID` = 14;
public const val `WS_XML_READER_PROPERTY_READ_DECLARATION`: `WS_XML_READER_PROPERTY_ID` = 3;
public const val `WS_XML_READER_PROPERTY_ROW`: `WS_XML_READER_PROPERTY_ID` = 5;
public const val `WS_XML_READER_PROPERTY_STREAM_BUFFER_SIZE`: `WS_XML_READER_PROPERTY_ID` = 8;
public const val `WS_XML_READER_PROPERTY_STREAM_MAX_MIME_HEADERS_SIZE`: `WS_XML_READER_PROPERTY_ID` = 11;
public const val `WS_XML_READER_PROPERTY_STREAM_MAX_ROOT_MIME_PART_SIZE`: `WS_XML_READER_PROPERTY_ID` = 10;
public const val `WS_XML_READER_PROPERTY_UTF8_TRIM_SIZE`: `WS_XML_READER_PROPERTY_ID` = 7;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_XML_READER_RAW_ENCODING` (
    public var `encoding`: `WS_XML_READER_ENCODING`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_XML_READER_STREAM_INPUT` (
    public var `input`: `WS_XML_READER_INPUT`,
    public var `readCallback`: `WS_READ_CALLBACK`,
    public var `readCallbackState`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 3970:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_XML_READER_STREAM_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_XML_READER_TEXT_ENCODING` (
    public var `encoding`: `WS_XML_READER_ENCODING`,
    public var `charSet`: `WS_CHARSET`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_XML_SECURITY_TOKEN_PROPERTY` (
    public var `id`: `WS_XML_SECURITY_TOKEN_PROPERTY_ID`,
    public var `value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `valueSize`: UInt,
)
// UNSUPPORTED Rust 3988:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_XML_SECURITY_TOKEN_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_XML_SECURITY_TOKEN_PROPERTY_ATTACHED_REFERENCE`: `WS_XML_SECURITY_TOKEN_PROPERTY_ID` = 1;
public typealias `WS_XML_SECURITY_TOKEN_PROPERTY_ID` = Int;
public const val `WS_XML_SECURITY_TOKEN_PROPERTY_UNATTACHED_REFERENCE`: `WS_XML_SECURITY_TOKEN_PROPERTY_ID` = 2;
public const val `WS_XML_SECURITY_TOKEN_PROPERTY_VALID_FROM_TIME`: `WS_XML_SECURITY_TOKEN_PROPERTY_ID` = 3;
public const val `WS_XML_SECURITY_TOKEN_PROPERTY_VALID_TILL_TIME`: `WS_XML_SECURITY_TOKEN_PROPERTY_ID` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_XML_STRING` (
    public var `length`: UInt,
    public var `bytes`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `dictionary`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_DICTIONARY`>?,
    public var `id`: UInt,
)
// UNSUPPORTED Rust 4006:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_XML_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_XML_STRING_DESCRIPTION` (
    public var `minByteCount`: UInt,
    public var `maxByteCount`: UInt,
)
public const val `WS_XML_STRING_TYPE`: `WS_TYPE` = 19;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_XML_TEXT` (
    public var `textType`: `WS_XML_TEXT_TYPE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_XML_TEXT_NODE` (
    public var `node`: `WS_XML_NODE`,
    public var `text`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_TEXT`>?,
)
// UNSUPPORTED Rust 4029:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_XML_TEXT_NODE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WS_XML_TEXT_TYPE` = Int;
public const val `WS_XML_TEXT_TYPE_BASE64`: `WS_XML_TEXT_TYPE` = 3;
public const val `WS_XML_TEXT_TYPE_BOOL`: `WS_XML_TEXT_TYPE` = 4;
public const val `WS_XML_TEXT_TYPE_DATETIME`: `WS_XML_TEXT_TYPE` = 13;
public const val `WS_XML_TEXT_TYPE_DECIMAL`: `WS_XML_TEXT_TYPE` = 10;
public const val `WS_XML_TEXT_TYPE_DOUBLE`: `WS_XML_TEXT_TYPE` = 9;
public const val `WS_XML_TEXT_TYPE_FLOAT`: `WS_XML_TEXT_TYPE` = 8;
public const val `WS_XML_TEXT_TYPE_GUID`: `WS_XML_TEXT_TYPE` = 11;
public const val `WS_XML_TEXT_TYPE_INT32`: `WS_XML_TEXT_TYPE` = 5;
public const val `WS_XML_TEXT_TYPE_INT64`: `WS_XML_TEXT_TYPE` = 6;
public const val `WS_XML_TEXT_TYPE_LIST`: `WS_XML_TEXT_TYPE` = 16;
public const val `WS_XML_TEXT_TYPE_QNAME`: `WS_XML_TEXT_TYPE` = 15;
public const val `WS_XML_TEXT_TYPE_TIMESPAN`: `WS_XML_TEXT_TYPE` = 14;
public const val `WS_XML_TEXT_TYPE_UINT64`: `WS_XML_TEXT_TYPE` = 7;
public const val `WS_XML_TEXT_TYPE_UNIQUE_ID`: `WS_XML_TEXT_TYPE` = 12;
public const val `WS_XML_TEXT_TYPE_UTF16`: `WS_XML_TEXT_TYPE` = 2;
public const val `WS_XML_TEXT_TYPE_UTF8`: `WS_XML_TEXT_TYPE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_XML_TIMESPAN_TEXT` (
    public var `text`: `WS_XML_TEXT`,
    public var `value`: `WS_TIMESPAN`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_XML_TOKEN_MESSAGE_SECURITY_BINDING` (
    public var `binding`: `WS_SECURITY_BINDING`,
    public var `bindingUsage`: `WS_MESSAGE_SECURITY_USAGE`,
    public var `xmlToken`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_SECURITY_TOKEN`>?,
)
// UNSUPPORTED Rust 4064:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_XML_TOKEN_MESSAGE_SECURITY_BINDING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_XML_TOKEN_MESSAGE_SECURITY_BINDING_TYPE`: `WS_SECURITY_BINDING_TYPE` = 6;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_XML_UINT64_TEXT` (
    public var `text`: `WS_XML_TEXT`,
    public var `value`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_XML_UNIQUE_ID_TEXT` (
    public var `text`: `WS_XML_TEXT`,
    public var `value`: `windows_sys`.`core`.`GUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_XML_UTF16_TEXT` (
    public var `text`: `WS_XML_TEXT`,
    public var `bytes`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `byteCount`: UInt,
)
// UNSUPPORTED Rust 4089:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_XML_UTF16_TEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_XML_UTF8_TEXT` (
    public var `text`: `WS_XML_TEXT`,
    public var `value`: `WS_XML_STRING`,
)
public typealias `WS_XML_WRITER` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_XML_WRITER_BINARY_ENCODING` (
    public var `encoding`: `WS_XML_WRITER_ENCODING`,
    public var `staticDictionary`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_DICTIONARY`>?,
    public var `dynamicStringCallback`: `WS_DYNAMIC_STRING_CALLBACK`,
    public var `dynamicStringCallbackState`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 4109:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_XML_WRITER_BINARY_ENCODING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_XML_WRITER_BUFFER_OUTPUT` (
    public var `output`: `WS_XML_WRITER_OUTPUT`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_XML_WRITER_ENCODING` (
    public var `encodingType`: `WS_XML_WRITER_ENCODING_TYPE`,
)
public typealias `WS_XML_WRITER_ENCODING_TYPE` = Int;
public const val `WS_XML_WRITER_ENCODING_TYPE_BINARY`: `WS_XML_WRITER_ENCODING_TYPE` = 2;
public const val `WS_XML_WRITER_ENCODING_TYPE_MTOM`: `WS_XML_WRITER_ENCODING_TYPE` = 3;
public const val `WS_XML_WRITER_ENCODING_TYPE_RAW`: `WS_XML_WRITER_ENCODING_TYPE` = 4;
public const val `WS_XML_WRITER_ENCODING_TYPE_TEXT`: `WS_XML_WRITER_ENCODING_TYPE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_XML_WRITER_MTOM_ENCODING` (
    public var `encoding`: `WS_XML_WRITER_ENCODING`,
    public var `textEncoding`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_WRITER_ENCODING`>?,
    public var `writeMimeHeader`: `windows_sys`.`core`.`BOOL`,
    public var `boundary`: `WS_STRING`,
    public var `startInfo`: `WS_STRING`,
    public var `startUri`: `WS_STRING`,
    public var `maxInlineByteCount`: UInt,
)
// UNSUPPORTED Rust 4140:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_XML_WRITER_MTOM_ENCODING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_XML_WRITER_OUTPUT` (
    public var `outputType`: `WS_XML_WRITER_OUTPUT_TYPE`,
)
public typealias `WS_XML_WRITER_OUTPUT_TYPE` = Int;
public const val `WS_XML_WRITER_OUTPUT_TYPE_BUFFER`: `WS_XML_WRITER_OUTPUT_TYPE` = 1;
public const val `WS_XML_WRITER_OUTPUT_TYPE_STREAM`: `WS_XML_WRITER_OUTPUT_TYPE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_XML_WRITER_PROPERTIES` (
    public var `properties`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WS_XML_WRITER_PROPERTY`>?,
    public var `propertyCount`: UInt,
)
// UNSUPPORTED Rust 4159:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_XML_WRITER_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_XML_WRITER_PROPERTY` (
    public var `id`: `WS_XML_WRITER_PROPERTY_ID`,
    public var `value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `valueSize`: UInt,
)
// UNSUPPORTED Rust 4171:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_XML_WRITER_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_XML_WRITER_PROPERTY_ALLOW_FRAGMENT`: `WS_XML_WRITER_PROPERTY_ID` = 1;
public const val `WS_XML_WRITER_PROPERTY_ALLOW_INVALID_CHARACTER_REFERENCES`: `WS_XML_WRITER_PROPERTY_ID` = 13;
public const val `WS_XML_WRITER_PROPERTY_BUFFERS`: `WS_XML_WRITER_PROPERTY_ID` = 7;
public const val `WS_XML_WRITER_PROPERTY_BUFFER_MAX_SIZE`: `WS_XML_WRITER_PROPERTY_ID` = 8;
public const val `WS_XML_WRITER_PROPERTY_BUFFER_TRIM_SIZE`: `WS_XML_WRITER_PROPERTY_ID` = 5;
public const val `WS_XML_WRITER_PROPERTY_BYTES`: `WS_XML_WRITER_PROPERTY_ID` = 9;
public const val `WS_XML_WRITER_PROPERTY_BYTES_TO_CLOSE`: `WS_XML_WRITER_PROPERTY_ID` = 16;
public const val `WS_XML_WRITER_PROPERTY_BYTES_WRITTEN`: `WS_XML_WRITER_PROPERTY_ID` = 15;
public const val `WS_XML_WRITER_PROPERTY_CHARSET`: `WS_XML_WRITER_PROPERTY_ID` = 6;
public const val `WS_XML_WRITER_PROPERTY_COMPRESS_EMPTY_ELEMENTS`: `WS_XML_WRITER_PROPERTY_ID` = 17;
public const val `WS_XML_WRITER_PROPERTY_EMIT_UNCOMPRESSED_EMPTY_ELEMENTS`: `WS_XML_WRITER_PROPERTY_ID` = 18;
public typealias `WS_XML_WRITER_PROPERTY_ID` = Int;
public const val `WS_XML_WRITER_PROPERTY_INDENT`: `WS_XML_WRITER_PROPERTY_ID` = 4;
public const val `WS_XML_WRITER_PROPERTY_INITIAL_BUFFER`: `WS_XML_WRITER_PROPERTY_ID` = 12;
public const val `WS_XML_WRITER_PROPERTY_IN_ATTRIBUTE`: `WS_XML_WRITER_PROPERTY_ID` = 10;
public const val `WS_XML_WRITER_PROPERTY_MAX_ATTRIBUTES`: `WS_XML_WRITER_PROPERTY_ID` = 2;
public const val `WS_XML_WRITER_PROPERTY_MAX_DEPTH`: `WS_XML_WRITER_PROPERTY_ID` = 0;
public const val `WS_XML_WRITER_PROPERTY_MAX_MIME_PARTS_BUFFER_SIZE`: `WS_XML_WRITER_PROPERTY_ID` = 11;
public const val `WS_XML_WRITER_PROPERTY_MAX_NAMESPACES`: `WS_XML_WRITER_PROPERTY_ID` = 14;
public const val `WS_XML_WRITER_PROPERTY_WRITE_DECLARATION`: `WS_XML_WRITER_PROPERTY_ID` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_XML_WRITER_RAW_ENCODING` (
    public var `encoding`: `WS_XML_WRITER_ENCODING`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WS_XML_WRITER_STREAM_OUTPUT` (
    public var `output`: `WS_XML_WRITER_OUTPUT`,
    public var `writeCallback`: `WS_WRITE_CALLBACK`,
    public var `writeCallbackState`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 4208:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WS_XML_WRITER_STREAM_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WS_XML_WRITER_TEXT_ENCODING` (
    public var `encoding`: `WS_XML_WRITER_ENCODING`,
    public var `charSet`: `WS_CHARSET`,
)
