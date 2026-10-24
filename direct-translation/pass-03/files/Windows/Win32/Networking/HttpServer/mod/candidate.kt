// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpAddFragmentToCache; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `HttpAddFragmentToCache`(`requestqueuehandle` : `super`.`super`.`Foundation`.`HANDLE`, `urlprefix` : `windows_sys`.`core`.`PCWSTR`, `datachunk` : /* Rust *const */ kotlinx.cinterop.CPointer<`HTTP_DATA_CHUNK`>?, `cachepolicy` : /* Rust *const */ kotlinx.cinterop.CPointer<`HTTP_CACHE_POLICY`>?, `overlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpAddUrl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpAddUrl`(`requestqueuehandle` : `super`.`super`.`Foundation`.`HANDLE`, `fullyqualifiedurl` : `windows_sys`.`core`.`PCWSTR`, `reserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpAddUrlToUrlGroup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpAddUrlToUrlGroup`(`urlgroupid` : ULong, `pfullyqualifiedurl` : `windows_sys`.`core`.`PCWSTR`, `urlcontext` : ULong, `reserved` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpCancelHttpRequest; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `HttpCancelHttpRequest`(`requestqueuehandle` : `super`.`super`.`Foundation`.`HANDLE`, `requestid` : ULong, `overlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpCloseRequestQueue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpCloseRequestQueue`(`requestqueuehandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpCloseServerSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpCloseServerSession`(`serversessionid` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpCloseUrlGroup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpCloseUrlGroup`(`urlgroupid` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpCreateHttpHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpCreateHttpHandle`(`requestqueuehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?, `reserved` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpCreateRequestQueue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `HttpCreateRequestQueue`(`version` : `HTTPAPI_VERSION`, `name` : `windows_sys`.`core`.`PCWSTR`, `securityattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `flags` : UInt, `requestqueuehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpCreateServerSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpCreateServerSession`(`version` : `HTTPAPI_VERSION`, `serversessionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `reserved` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpCreateUrlGroup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpCreateUrlGroup`(`serversessionid` : ULong, `purlgroupid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `reserved` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpDeclarePush; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpDeclarePush`(`requestqueuehandle` : `super`.`super`.`Foundation`.`HANDLE`, `requestid` : ULong, `verb` : `HTTP_VERB`, `path` : `windows_sys`.`core`.`PCWSTR`, `query` : `windows_sys`.`core`.`PCSTR`, `headers` : /* Rust *const */ kotlinx.cinterop.CPointer<`HTTP_REQUEST_HEADERS`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpDelegateRequestEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpDelegateRequestEx`(`requestqueuehandle` : `super`.`super`.`Foundation`.`HANDLE`, `delegatequeuehandle` : `super`.`super`.`Foundation`.`HANDLE`, `requestid` : ULong, `delegateurlgroupid` : ULong, `propertyinfosetsize` : UInt, `propertyinfoset` : /* Rust *const */ kotlinx.cinterop.CPointer<`HTTP_DELEGATE_REQUEST_PROPERTY_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpDeleteServiceConfiguration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `HttpDeleteServiceConfiguration`(`servicehandle` : `super`.`super`.`Foundation`.`HANDLE`, `configid` : `HTTP_SERVICE_CONFIG_ID`, `pconfiginformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `configinformationlength` : UInt, `poverlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpFindUrlGroupId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpFindUrlGroupId`(`fullyqualifiedurl` : `windows_sys`.`core`.`PCWSTR`, `requestqueuehandle` : `super`.`super`.`Foundation`.`HANDLE`, `urlgroupid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpFlushResponseCache; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `HttpFlushResponseCache`(`requestqueuehandle` : `super`.`super`.`Foundation`.`HANDLE`, `urlprefix` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `overlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpGetExtension; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpGetExtension`(`version` : `HTTPAPI_VERSION`, `extension` : UInt, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffersize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpInitialize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpInitialize`(`version` : `HTTPAPI_VERSION`, `flags` : `HTTP_INITIALIZE`, `preserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpIsFeatureSupported; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpIsFeatureSupported`(`featureid` : `HTTP_FEATURE_ID`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpPrepareUrl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpPrepareUrl`(`reserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `flags` : UInt, `url` : `windows_sys`.`core`.`PCWSTR`, `preparedurl` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpQueryRequestQueueProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpQueryRequestQueueProperty`(`requestqueuehandle` : `super`.`super`.`Foundation`.`HANDLE`, `property` : `HTTP_SERVER_PROPERTY`, `propertyinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propertyinformationlength` : UInt, `reserved1` : UInt, `returnlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `reserved2` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpQueryServerSessionProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpQueryServerSessionProperty`(`serversessionid` : ULong, `property` : `HTTP_SERVER_PROPERTY`, `propertyinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propertyinformationlength` : UInt, `returnlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpQueryServiceConfiguration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `HttpQueryServiceConfiguration`(`servicehandle` : `super`.`super`.`Foundation`.`HANDLE`, `configid` : `HTTP_SERVICE_CONFIG_ID`, `pinput` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `inputlength` : UInt, `poutput` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `outputlength` : UInt, `preturnlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `poverlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpQueryUrlGroupProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpQueryUrlGroupProperty`(`urlgroupid` : ULong, `property` : `HTTP_SERVER_PROPERTY`, `propertyinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propertyinformationlength` : UInt, `returnlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpReadFragmentFromCache; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `HttpReadFragmentFromCache`(`requestqueuehandle` : `super`.`super`.`Foundation`.`HANDLE`, `urlprefix` : `windows_sys`.`core`.`PCWSTR`, `byterange` : /* Rust *const */ kotlinx.cinterop.CPointer<`HTTP_BYTE_RANGE`>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bufferlength` : UInt, `bytesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `overlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpReceiveClientCertificate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `HttpReceiveClientCertificate`(`requestqueuehandle` : `super`.`super`.`Foundation`.`HANDLE`, `connectionid` : ULong, `flags` : UInt, `sslclientcertinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HTTP_SSL_CLIENT_CERT_INFO`>?, `sslclientcertinfosize` : UInt, `bytesreceived` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `overlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpReceiveHttpRequest; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Networking_WinSock", feature = "Win32_System_IO"))]
public external fun `HttpReceiveHttpRequest`(`requestqueuehandle` : `super`.`super`.`Foundation`.`HANDLE`, `requestid` : ULong, `flags` : `HTTP_RECEIVE_HTTP_REQUEST_FLAGS`, `requestbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HTTP_REQUEST_V2`>?, `requestbufferlength` : UInt, `bytesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `overlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpReceiveRequestEntityBody; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `HttpReceiveRequestEntityBody`(`requestqueuehandle` : `super`.`super`.`Foundation`.`HANDLE`, `requestid` : ULong, `flags` : UInt, `entitybuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `entitybufferlength` : UInt, `bytesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `overlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpRemoveUrl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpRemoveUrl`(`requestqueuehandle` : `super`.`super`.`Foundation`.`HANDLE`, `fullyqualifiedurl` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpRemoveUrlFromUrlGroup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpRemoveUrlFromUrlGroup`(`urlgroupid` : ULong, `pfullyqualifiedurl` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpSendHttpResponse; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `HttpSendHttpResponse`(`requestqueuehandle` : `super`.`super`.`Foundation`.`HANDLE`, `requestid` : ULong, `flags` : UInt, `httpresponse` : /* Rust *const */ kotlinx.cinterop.CPointer<`HTTP_RESPONSE_V2`>?, `cachepolicy` : /* Rust *const */ kotlinx.cinterop.CPointer<`HTTP_CACHE_POLICY`>?, `bytessent` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `reserved1` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `reserved2` : UInt, `overlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?, `logdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`HTTP_LOG_DATA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpSendResponseEntityBody; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `HttpSendResponseEntityBody`(`requestqueuehandle` : `super`.`super`.`Foundation`.`HANDLE`, `requestid` : ULong, `flags` : UInt, `entitychunkcount` : UShort, `entitychunks` : /* Rust *const */ kotlinx.cinterop.CPointer<`HTTP_DATA_CHUNK`>?, `bytessent` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `reserved1` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `reserved2` : UInt, `overlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?, `logdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`HTTP_LOG_DATA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpSetRequestProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `HttpSetRequestProperty`(`requestqueuehandle` : `super`.`super`.`Foundation`.`HANDLE`, `id` : ULong, `propertyid` : `HTTP_REQUEST_PROPERTY`, `input` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `inputpropertysize` : UInt, `overlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpSetRequestQueueProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpSetRequestQueueProperty`(`requestqueuehandle` : `super`.`super`.`Foundation`.`HANDLE`, `property` : `HTTP_SERVER_PROPERTY`, `propertyinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propertyinformationlength` : UInt, `reserved1` : UInt, `reserved2` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpSetServerSessionProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpSetServerSessionProperty`(`serversessionid` : ULong, `property` : `HTTP_SERVER_PROPERTY`, `propertyinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propertyinformationlength` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpSetServiceConfiguration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `HttpSetServiceConfiguration`(`servicehandle` : `super`.`super`.`Foundation`.`HANDLE`, `configid` : `HTTP_SERVICE_CONFIG_ID`, `pconfiginformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `configinformationlength` : UInt, `poverlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpSetUrlGroupProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpSetUrlGroupProperty`(`urlgroupid` : ULong, `property` : `HTTP_SERVER_PROPERTY`, `propertyinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propertyinformationlength` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpShutdownRequestQueue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpShutdownRequestQueue`(`requestqueuehandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpTerminate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpTerminate`(`flags` : `HTTP_INITIALIZE`, `preserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpUpdateServiceConfiguration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `HttpUpdateServiceConfiguration`(`handle` : `super`.`super`.`Foundation`.`HANDLE`, `configid` : `HTTP_SERVICE_CONFIG_ID`, `configinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `configinfolength` : UInt, `overlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpWaitForDemandStart; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `HttpWaitForDemandStart`(`requestqueuehandle` : `super`.`super`.`Foundation`.`HANDLE`, `overlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpWaitForDisconnect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `HttpWaitForDisconnect`(`requestqueuehandle` : `super`.`super`.`Foundation`.`HANDLE`, `connectionid` : ULong, `overlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=httpapi.dll, ABI=system, export=HttpWaitForDisconnectEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `HttpWaitForDisconnectEx`(`requestqueuehandle` : `super`.`super`.`Foundation`.`HANDLE`, `connectionid` : ULong, `reserved` : UInt, `overlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : UInt
public const val `CacheRangeChunkSize`: `HTTP_SERVICE_CONFIG_CACHE_KEY` = 1;
public const val `CreateRequestQueueExternalIdProperty`: `HTTP_CREATE_REQUEST_QUEUE_PROPERTY_ID` = 1;
public const val `CreateRequestQueueMax`: `HTTP_CREATE_REQUEST_QUEUE_PROPERTY_ID` = 2;
public const val `DelegateRequestDelegateUrlProperty`: `HTTP_DELEGATE_REQUEST_PROPERTY_ID` = 1;
public const val `DelegateRequestReservedProperty`: `HTTP_DELEGATE_REQUEST_PROPERTY_ID` = 0;
public const val `ExParamTypeErrorHeaders`: `HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE` = 4;
public const val `ExParamTypeHttp2SettingsLimits`: `HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE` = 1;
public const val `ExParamTypeHttp2Window`: `HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE` = 0;
public const val `ExParamTypeHttpPerformance`: `HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE` = 2;
public const val `ExParamTypeMax`: `HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE` = 6;
public const val `ExParamTypeTlsRestrictions`: `HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE` = 3;
public const val `ExParamTypeTlsSessionTicketKeys`: `HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE` = 5;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP2_SETTINGS_LIMITS_PARAM` (
    public var `Http2MaxSettingsPerFrame`: UInt,
    public var `Http2MaxSettingsPerMinute`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP2_WINDOW_SIZE_PARAM` (
    public var `Http2ReceiveWindowSize`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTPAPI_VERSION` (
    public var `HttpApiMajorVersion`: UShort,
    public var `HttpApiMinorVersion`: UShort,
)
public typealias `HTTP_503_RESPONSE_VERBOSITY` = Int;
public typealias `HTTP_AUTHENTICATION_HARDENING_LEVELS` = Int;
public const val `HTTP_AUTH_ENABLE_BASIC`: UInt = 1u;
public const val `HTTP_AUTH_ENABLE_DIGEST`: UInt = 2u;
public const val `HTTP_AUTH_ENABLE_KERBEROS`: UInt = 16u;
public const val `HTTP_AUTH_ENABLE_NEGOTIATE`: UInt = 8u;
public const val `HTTP_AUTH_ENABLE_NTLM`: UInt = 4u;
public const val `HTTP_AUTH_EX_FLAG_CAPTURE_CREDENTIAL`: UInt = 2u;
public const val `HTTP_AUTH_EX_FLAG_ENABLE_KERBEROS_CREDENTIAL_CACHING`: UInt = 1u;
public typealias `HTTP_AUTH_STATUS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_BANDWIDTH_LIMIT_INFO` (
    public var `Flags`: `HTTP_PROPERTY_FLAGS`,
    public var `MaxBandwidth`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_BINDING_INFO` (
    public var `Flags`: `HTTP_PROPERTY_FLAGS`,
    public var `RequestQueueHandle`: `super`.`super`.`Foundation`.`HANDLE`,
)
// UNSUPPORTED Rust 113:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_BINDING_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_BYTE_RANGE` (
    public var `StartingOffset`: ULong,
    public var `Length`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_CACHE_POLICY` (
    public var `Policy`: `HTTP_CACHE_POLICY_TYPE`,
    public var `SecondsToLive`: UInt,
)
public typealias `HTTP_CACHE_POLICY_TYPE` = Int;
public const val `HTTP_CHANNEL_BIND_CLIENT_SERVICE`: UInt = 16u;
public const val `HTTP_CHANNEL_BIND_DOTLESS_SERVICE`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_CHANNEL_BIND_INFO` (
    public var `Hardening`: `HTTP_AUTHENTICATION_HARDENING_LEVELS`,
    public var `Flags`: UInt,
    public var `ServiceNames`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`HTTP_SERVICE_BINDING_BASE`>>?,
    public var `NumberOfServiceNames`: UInt,
)
// UNSUPPORTED Rust 141:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_CHANNEL_BIND_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HTTP_CHANNEL_BIND_NO_SERVICE_NAME_CHECK`: UInt = 2u;
public const val `HTTP_CHANNEL_BIND_PROXY`: UInt = 1u;
public const val `HTTP_CHANNEL_BIND_PROXY_COHOSTING`: UInt = 32u;
public const val `HTTP_CHANNEL_BIND_SECURE_CHANNEL_TOKEN`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_CONNECTION_LIMIT_INFO` (
    public var `Flags`: `HTTP_PROPERTY_FLAGS`,
    public var `MaxConnections`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_COOKED_URL` (
    public var `FullUrlLength`: UShort,
    public var `HostLength`: UShort,
    public var `AbsPathLength`: UShort,
    public var `QueryStringLength`: UShort,
    public var `pFullUrl`: `windows_sys`.`core`.`PCWSTR`,
    public var `pHost`: `windows_sys`.`core`.`PCWSTR`,
    public var `pAbsPath`: `windows_sys`.`core`.`PCWSTR`,
    public var `pQueryString`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 168:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_COOKED_URL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HTTP_CREATE_REQUEST_QUEUE_FLAG_CONTROLLER`: UInt = 2u;
public const val `HTTP_CREATE_REQUEST_QUEUE_FLAG_DELEGATION`: UInt = 8u;
public const val `HTTP_CREATE_REQUEST_QUEUE_FLAG_OPEN_EXISTING`: UInt = 1u;
public typealias `HTTP_CREATE_REQUEST_QUEUE_PROPERTY_ID` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_CREATE_REQUEST_QUEUE_PROPERTY_INFO` (
    public var `PropertyId`: `HTTP_CREATE_REQUEST_QUEUE_PROPERTY_ID`,
    public var `PropertyInfoLength`: UInt,
    public var `PropertyInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 184:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_CREATE_REQUEST_QUEUE_PROPERTY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_DATA_CHUNK` (
    public var `DataChunkType`: `HTTP_DATA_CHUNK_TYPE`,
    public var `Anonymous`: `HTTP_DATA_CHUNK_0`,
)
// UNSUPPORTED Rust 195:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_DATA_CHUNK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 200:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union HTTP_DATA_CHUNK_0 {
//     pub FromMemory: HTTP_DATA_CHUNK_0_0,
//     pub FromFileHandle: HTTP_DATA_CHUNK_0_1,
//     pub FromFragmentCache: HTTP_DATA_CHUNK_0_2,
//     pub FromFragmentCacheEx: HTTP_DATA_CHUNK_0_3,
//     pub Trailers: HTTP_DATA_CHUNK_0_4,
// }

// UNSUPPORTED Rust 209:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_DATA_CHUNK_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_DATA_CHUNK_0_1` (
    public var `ByteRange`: `HTTP_BYTE_RANGE`,
    public var `FileHandle`: `super`.`super`.`Foundation`.`HANDLE`,
)
// UNSUPPORTED Rust 220:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_DATA_CHUNK_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_DATA_CHUNK_0_3` (
    public var `ByteRange`: `HTTP_BYTE_RANGE`,
    public var `pFragmentName`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 231:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_DATA_CHUNK_0_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_DATA_CHUNK_0_2` (
    public var `FragmentNameLength`: UShort,
    public var `pFragmentName`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 242:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_DATA_CHUNK_0_2 {
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
public class `HTTP_DATA_CHUNK_0_0` (
    public var `pBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `BufferLength`: UInt,
)
// UNSUPPORTED Rust 253:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_DATA_CHUNK_0_0 {
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
public class `HTTP_DATA_CHUNK_0_4` (
    public var `TrailerCount`: UShort,
    public var `pTrailers`: /* Rust *mut */ kotlinx.cinterop.CPointer<`HTTP_UNKNOWN_HEADER`>?,
)
// UNSUPPORTED Rust 264:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_DATA_CHUNK_0_4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HTTP_DATA_CHUNK_TYPE` = Int;
public typealias `HTTP_DELEGATE_REQUEST_PROPERTY_ID` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_DELEGATE_REQUEST_PROPERTY_INFO` (
    public var `PropertyId`: `HTTP_DELEGATE_REQUEST_PROPERTY_ID`,
    public var `PropertyInfoLength`: UInt,
    public var `PropertyInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 278:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_DELEGATE_REQUEST_PROPERTY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HTTP_DEMAND_CBT`: UInt = 4u;
public typealias `HTTP_ENABLED_STATE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_ERROR_HEADERS_PARAM` (
    public var `StatusCode`: UShort,
    public var `HeaderCount`: UShort,
    public var `Headers`: /* Rust *mut */ kotlinx.cinterop.CPointer<`HTTP_UNKNOWN_HEADER`>?,
)
// UNSUPPORTED Rust 292:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_ERROR_HEADERS_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HTTP_FEATURE_ID` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_FLOWRATE_INFO` (
    public var `Flags`: `HTTP_PROPERTY_FLAGS`,
    public var `MaxBandwidth`: UInt,
    public var `MaxPeakBandwidth`: UInt,
    public var `BurstSize`: UInt,
)
public const val `HTTP_FLUSH_RESPONSE_FLAG_RECURSIVE`: UInt = 1u;
public typealias `HTTP_HEADER_ID` = Int;
public typealias `HTTP_INITIALIZE` = UInt;
public const val `HTTP_INITIALIZE_CONFIG`: `HTTP_INITIALIZE` = 2u;
public const val `HTTP_INITIALIZE_SERVER`: `HTTP_INITIALIZE` = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_KNOWN_HEADER` (
    public var `RawValueLength`: UShort,
    public var `pRawValue`: `windows_sys`.`core`.`PCSTR`,
)
// UNSUPPORTED Rust 317:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_KNOWN_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_LISTEN_ENDPOINT_INFO` (
    public var `Flags`: `HTTP_PROPERTY_FLAGS`,
    public var `EnableSharing`: Boolean,
)
public const val `HTTP_LOGGING_FLAG_LOCAL_TIME_ROLLOVER`: UInt = 1u;
public const val `HTTP_LOGGING_FLAG_LOG_ERRORS_ONLY`: UInt = 4u;
public const val `HTTP_LOGGING_FLAG_LOG_SUCCESS_ONLY`: UInt = 8u;
public const val `HTTP_LOGGING_FLAG_USE_UTF8_CONVERSION`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_LOGGING_INFO` (
    public var `Flags`: `HTTP_PROPERTY_FLAGS`,
    public var `LoggingFlags`: UInt,
    public var `SoftwareName`: `windows_sys`.`core`.`PCWSTR`,
    public var `SoftwareNameLength`: UShort,
    public var `DirectoryNameLength`: UShort,
    public var `DirectoryName`: `windows_sys`.`core`.`PCWSTR`,
    public var `Format`: `HTTP_LOGGING_TYPE`,
    public var `Fields`: UInt,
    public var `pExtFields`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `NumOfExtFields`: UShort,
    public var `MaxRecordSize`: UShort,
    public var `RolloverType`: `HTTP_LOGGING_ROLLOVER_TYPE`,
    public var `RolloverSize`: UInt,
    public var `pSecurityDescriptor`: `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`,
)
// UNSUPPORTED Rust 351:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for HTTP_LOGGING_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HTTP_LOGGING_ROLLOVER_TYPE` = Int;
public typealias `HTTP_LOGGING_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_LOG_DATA` (
    public var `Type`: `HTTP_LOG_DATA_TYPE`,
)
public typealias `HTTP_LOG_DATA_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_LOG_FIELDS_DATA` (
    public var `Base`: `HTTP_LOG_DATA`,
    public var `UserNameLength`: UShort,
    public var `UriStemLength`: UShort,
    public var `ClientIpLength`: UShort,
    public var `ServerNameLength`: UShort,
    public var `ServiceNameLength`: UShort,
    public var `ServerIpLength`: UShort,
    public var `MethodLength`: UShort,
    public var `UriQueryLength`: UShort,
    public var `HostLength`: UShort,
    public var `UserAgentLength`: UShort,
    public var `CookieLength`: UShort,
    public var `ReferrerLength`: UShort,
    public var `UserName`: `windows_sys`.`core`.`PWSTR`,
    public var `UriStem`: `windows_sys`.`core`.`PWSTR`,
    public var `ClientIp`: `windows_sys`.`core`.`PSTR`,
    public var `ServerName`: `windows_sys`.`core`.`PSTR`,
    public var `ServiceName`: `windows_sys`.`core`.`PSTR`,
    public var `ServerIp`: `windows_sys`.`core`.`PSTR`,
    public var `Method`: `windows_sys`.`core`.`PSTR`,
    public var `UriQuery`: `windows_sys`.`core`.`PSTR`,
    public var `Host`: `windows_sys`.`core`.`PSTR`,
    public var `UserAgent`: `windows_sys`.`core`.`PSTR`,
    public var `Cookie`: `windows_sys`.`core`.`PSTR`,
    public var `Referrer`: `windows_sys`.`core`.`PSTR`,
    public var `ServerPort`: UShort,
    public var `ProtocolStatus`: UShort,
    public var `Win32Status`: UInt,
    public var `MethodNum`: `HTTP_VERB`,
    public var `SubStatus`: UShort,
)
// UNSUPPORTED Rust 399:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_LOG_FIELDS_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HTTP_LOG_FIELD_BYTES_RECV`: UInt = 8192u;
public const val `HTTP_LOG_FIELD_BYTES_SENT`: UInt = 4096u;
public const val `HTTP_LOG_FIELD_CLIENT_IP`: UInt = 4u;
public const val `HTTP_LOG_FIELD_CLIENT_PORT`: UInt = 4194304u;
public const val `HTTP_LOG_FIELD_COMPUTER_NAME`: UInt = 32u;
public const val `HTTP_LOG_FIELD_COOKIE`: UInt = 131072u;
public const val `HTTP_LOG_FIELD_CORRELATION_ID`: UInt = 1073741824u;
public const val `HTTP_LOG_FIELD_DATE`: UInt = 1u;
public const val `HTTP_LOG_FIELD_FAULT_CODE`: UInt = 2147483648u;
public const val `HTTP_LOG_FIELD_HOST`: UInt = 1048576u;
public const val `HTTP_LOG_FIELD_METHOD`: UInt = 128u;
public const val `HTTP_LOG_FIELD_QUEUE_NAME`: UInt = 67108864u;
public const val `HTTP_LOG_FIELD_REASON`: UInt = 33554432u;
public const val `HTTP_LOG_FIELD_REFERER`: UInt = 262144u;
public const val `HTTP_LOG_FIELD_SERVER_IP`: UInt = 64u;
public const val `HTTP_LOG_FIELD_SERVER_PORT`: UInt = 32768u;
public const val `HTTP_LOG_FIELD_SITE_ID`: UInt = 16777216u;
public const val `HTTP_LOG_FIELD_SITE_NAME`: UInt = 16u;
public const val `HTTP_LOG_FIELD_STATUS`: UInt = 1024u;
public const val `HTTP_LOG_FIELD_STREAM_ID`: UInt = 134217728u;
public const val `HTTP_LOG_FIELD_STREAM_ID_EX`: UInt = 268435456u;
public const val `HTTP_LOG_FIELD_SUB_STATUS`: UInt = 2097152u;
public const val `HTTP_LOG_FIELD_TIME`: UInt = 2u;
public const val `HTTP_LOG_FIELD_TIME_TAKEN`: UInt = 16384u;
public const val `HTTP_LOG_FIELD_TRANSPORT_TYPE`: UInt = 536870912u;
public const val `HTTP_LOG_FIELD_URI`: UInt = 8388608u;
public const val `HTTP_LOG_FIELD_URI_QUERY`: UInt = 512u;
public const val `HTTP_LOG_FIELD_URI_STEM`: UInt = 256u;
public const val `HTTP_LOG_FIELD_USER_AGENT`: UInt = 65536u;
public const val `HTTP_LOG_FIELD_USER_NAME`: UInt = 8u;
public const val `HTTP_LOG_FIELD_VERSION`: UInt = 524288u;
public const val `HTTP_LOG_FIELD_WIN32_STATUS`: UInt = 2048u;
public const val `HTTP_MAX_SERVER_QUEUE_LENGTH`: UInt = 2147483647u;
public const val `HTTP_MIN_SERVER_QUEUE_LENGTH`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_MULTIPLE_KNOWN_HEADERS` (
    public var `HeaderId`: `HTTP_HEADER_ID`,
    public var `Flags`: UInt,
    public var `KnownHeaderCount`: UShort,
    public var `KnownHeaders`: /* Rust *mut */ kotlinx.cinterop.CPointer<`HTTP_KNOWN_HEADER`>?,
)
// UNSUPPORTED Rust 446:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_MULTIPLE_KNOWN_HEADERS {
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
public class `HTTP_PERFORMANCE_PARAM` (
    public var `Type`: `HTTP_PERFORMANCE_PARAM_TYPE`,
    public var `BufferSize`: UInt,
    public var `Buffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 458:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_PERFORMANCE_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HTTP_PERFORMANCE_PARAM_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_PROPERTY_FLAGS` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_PROTECTION_LEVEL_INFO` (
    public var `Flags`: `HTTP_PROPERTY_FLAGS`,
    public var `Level`: `HTTP_PROTECTION_LEVEL_TYPE`,
)
public typealias `HTTP_PROTECTION_LEVEL_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_QOS_SETTING_INFO` (
    public var `QosType`: `HTTP_QOS_SETTING_TYPE`,
    public var `QosSetting`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 482:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_QOS_SETTING_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HTTP_QOS_SETTING_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_QUERY_REQUEST_QUALIFIER_QUIC` (
    public var `Freshness`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_QUERY_REQUEST_QUALIFIER_TCP` (
    public var `Freshness`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_QUIC_API_TIMINGS` (
    public var `ConnectionTimings`: `HTTP_QUIC_CONNECTION_API_TIMINGS`,
    public var `StreamTimings`: `HTTP_QUIC_STREAM_API_TIMINGS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_QUIC_CONNECTION_API_TIMINGS` (
    public var `OpenTime`: ULong,
    public var `CloseTime`: ULong,
    public var `StartTime`: ULong,
    public var `ShutdownTime`: ULong,
    public var `SecConfigCreateTime`: ULong,
    public var `SecConfigDeleteTime`: ULong,
    public var `GetParamCount`: ULong,
    public var `GetParamSum`: ULong,
    public var `SetParamCount`: ULong,
    public var `SetParamSum`: ULong,
    public var `SetCallbackHandlerCount`: ULong,
    public var `SetCallbackHandlerSum`: ULong,
    public var `ControlStreamTimings`: `HTTP_QUIC_STREAM_API_TIMINGS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_QUIC_STREAM_API_TIMINGS` (
    public var `OpenCount`: ULong,
    public var `OpenSum`: ULong,
    public var `CloseCount`: ULong,
    public var `CloseSum`: ULong,
    public var `StartCount`: ULong,
    public var `StartSum`: ULong,
    public var `ShutdownCount`: ULong,
    public var `ShutdownSum`: ULong,
    public var `SendCount`: ULong,
    public var `SendSum`: ULong,
    public var `ReceiveSetEnabledCount`: ULong,
    public var `ReceiveSetEnabledSum`: ULong,
    public var `GetParamCount`: ULong,
    public var `GetParamSum`: ULong,
    public var `SetParamCount`: ULong,
    public var `SetParamSum`: ULong,
    public var `SetCallbackHandlerCount`: ULong,
    public var `SetCallbackHandlerSum`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_QUIC_STREAM_REQUEST_STATS` (
    public var `StreamWaitStart`: ULong,
    public var `StreamWaitEnd`: ULong,
    public var `RequestHeadersCompressionStart`: ULong,
    public var `RequestHeadersCompressionEnd`: ULong,
    public var `ResponseHeadersDecompressionStart`: ULong,
    public var `ResponseHeadersDecompressionEnd`: ULong,
    public var `RequestHeadersCompressedSize`: ULong,
    public var `ResponseHeadersCompressedSize`: ULong,
)
public const val `HTTP_RECEIVE_FULL_CHAIN`: UInt = 2u;
public typealias `HTTP_RECEIVE_HTTP_REQUEST_FLAGS` = UInt;
public const val `HTTP_RECEIVE_REQUEST_ENTITY_BODY_FLAG_FILL_BUFFER`: UInt = 1u;
public const val `HTTP_RECEIVE_REQUEST_FLAG_COPY_BODY`: `HTTP_RECEIVE_HTTP_REQUEST_FLAGS` = 1u;
public const val `HTTP_RECEIVE_REQUEST_FLAG_FLUSH_BODY`: `HTTP_RECEIVE_HTTP_REQUEST_FLAGS` = 2u;
public const val `HTTP_RECEIVE_SECURE_CHANNEL_TOKEN`: UInt = 1u;
public const val `HTTP_REQUEST_AUTH_FLAG_TOKEN_FOR_CACHED_CRED`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_REQUEST_AUTH_INFO` (
    public var `AuthStatus`: `HTTP_AUTH_STATUS`,
    public var `SecStatus`: `windows_sys`.`core`.`HRESULT`,
    public var `Flags`: UInt,
    public var `AuthType`: `HTTP_REQUEST_AUTH_TYPE`,
    public var `AccessToken`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `ContextAttributes`: UInt,
    public var `PackedContextLength`: UInt,
    public var `PackedContextType`: UInt,
    public var `PackedContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `MutualAuthDataLength`: UInt,
    public var `pMutualAuthData`: `windows_sys`.`core`.`PSTR`,
    public var `PackageNameLength`: UShort,
    public var `pPackageName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 579:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_REQUEST_AUTH_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HTTP_REQUEST_AUTH_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_REQUEST_CHANNEL_BIND_STATUS` (
    public var `ServiceName`: /* Rust *mut */ kotlinx.cinterop.CPointer<`HTTP_SERVICE_BINDING_BASE`>?,
    public var `ChannelToken`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `ChannelTokenSize`: UInt,
    public var `Flags`: UInt,
)
// UNSUPPORTED Rust 593:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_REQUEST_CHANNEL_BIND_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HTTP_REQUEST_FLAG_HTTP2`: UInt = 4u;
public const val `HTTP_REQUEST_FLAG_HTTP3`: UInt = 8u;
public const val `HTTP_REQUEST_FLAG_IP_ROUTED`: UInt = 2u;
public const val `HTTP_REQUEST_FLAG_MORE_ENTITY_BODY_EXISTS`: UInt = 1u;
// UNSUPPORTED Rust 602:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_REQUEST_HEADERS {
//     pub UnknownHeaderCount: u16,
//     pub pUnknownHeaders: *mut HTTP_UNKNOWN_HEADER,
//     pub TrailerCount: u16,
//     pub pTrailers: *mut HTTP_UNKNOWN_HEADER,
//     pub KnownHeaders: [HTTP_KNOWN_HEADER; 41],
// }

// UNSUPPORTED Rust 611:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_REQUEST_HEADERS {
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
public class `HTTP_REQUEST_INFO` (
    public var `InfoType`: `HTTP_REQUEST_INFO_TYPE`,
    public var `InfoLength`: UInt,
    public var `pInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 623:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_REQUEST_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HTTP_REQUEST_INFO_TYPE` = Int;
public typealias `HTTP_REQUEST_PROPERTY` = Int;
// UNSUPPORTED Rust 630:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_REQUEST_PROPERTY_SNI {
//     pub Hostname: [u16; 256],
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 636:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_REQUEST_PROPERTY_SNI {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HTTP_REQUEST_PROPERTY_SNI_FLAG_NO_SNI`: UInt = 2u;
public const val `HTTP_REQUEST_PROPERTY_SNI_FLAG_SNI_USED`: UInt = 1u;
public const val `HTTP_REQUEST_PROPERTY_SNI_HOST_MAX_LENGTH`: UInt = 255u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_REQUEST_PROPERTY_STREAM_ERROR` (
    public var `ErrorCode`: UInt,
)
// UNSUPPORTED Rust 649:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_REQUEST_SIZING_INFO {
//     pub Flags: u64,
//     pub RequestIndex: u32,
//     pub RequestSizingCount: u32,
//     pub RequestSizing: [u64; 5],
// }

// UNSUPPORTED Rust 657:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_REQUEST_SIZING_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HTTP_REQUEST_SIZING_INFO_FLAG_FIRST_REQUEST`: UInt = 8u;
public const val `HTTP_REQUEST_SIZING_INFO_FLAG_TCP_FAST_OPEN`: UInt = 1u;
public const val `HTTP_REQUEST_SIZING_INFO_FLAG_TLS_FALSE_START`: UInt = 4u;
public const val `HTTP_REQUEST_SIZING_INFO_FLAG_TLS_SESSION_RESUMPTION`: UInt = 2u;
public typealias `HTTP_REQUEST_SIZING_TYPE` = Int;
// UNSUPPORTED Rust 667:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_REQUEST_TIMING_INFO {
//     pub RequestTimingCount: u32,
//     pub RequestTiming: [u64; 30],
// }

// UNSUPPORTED Rust 673:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_REQUEST_TIMING_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HTTP_REQUEST_TIMING_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_REQUEST_TOKEN_BINDING_INFO` (
    public var `TokenBinding`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `TokenBindingSize`: UInt,
    public var `EKM`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `EKMSize`: UInt,
    public var `KeyType`: UByte,
)
// UNSUPPORTED Rust 688:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_REQUEST_TOKEN_BINDING_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_REQUEST_V1` (
    public var `Flags`: UInt,
    public var `ConnectionId`: ULong,
    public var `RequestId`: ULong,
    public var `UrlContext`: ULong,
    public var `Version`: `HTTP_VERSION`,
    public var `Verb`: `HTTP_VERB`,
    public var `UnknownVerbLength`: UShort,
    public var `RawUrlLength`: UShort,
    public var `pUnknownVerb`: `windows_sys`.`core`.`PCSTR`,
    public var `pRawUrl`: `windows_sys`.`core`.`PCSTR`,
    public var `CookedUrl`: `HTTP_COOKED_URL`,
    public var `Address`: `HTTP_TRANSPORT_ADDRESS`,
    public var `Headers`: `HTTP_REQUEST_HEADERS`,
    public var `BytesReceived`: ULong,
    public var `EntityChunkCount`: UShort,
    public var `pEntityChunks`: /* Rust *mut */ kotlinx.cinterop.CPointer<`HTTP_DATA_CHUNK`>?,
    public var `RawConnectionId`: ULong,
    public var `pSslInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`HTTP_SSL_INFO`>?,
)
// UNSUPPORTED Rust 716:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for HTTP_REQUEST_V1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_REQUEST_V2` (
    public var `Base`: `HTTP_REQUEST_V1`,
    public var `RequestInfoCount`: UShort,
    public var `pRequestInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`HTTP_REQUEST_INFO`>?,
)
// UNSUPPORTED Rust 730:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for HTTP_REQUEST_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HTTP_RESPONSE_FLAG_MORE_ENTITY_BODY_EXISTS`: UInt = 2u;
public const val `HTTP_RESPONSE_FLAG_MULTIPLE_ENCODINGS_AVAILABLE`: UInt = 1u;
// UNSUPPORTED Rust 738:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_RESPONSE_HEADERS {
//     pub UnknownHeaderCount: u16,
//     pub pUnknownHeaders: *mut HTTP_UNKNOWN_HEADER,
//     pub TrailerCount: u16,
//     pub pTrailers: *mut HTTP_UNKNOWN_HEADER,
//     pub KnownHeaders: [HTTP_KNOWN_HEADER; 30],
// }

// UNSUPPORTED Rust 747:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_RESPONSE_HEADERS {
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
public class `HTTP_RESPONSE_INFO` (
    public var `Type`: `HTTP_RESPONSE_INFO_TYPE`,
    public var `Length`: UInt,
    public var `pInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 759:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_RESPONSE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HTTP_RESPONSE_INFO_FLAGS_PRESERVE_ORDER`: UInt = 1u;
public typealias `HTTP_RESPONSE_INFO_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_RESPONSE_V1` (
    public var `Flags`: UInt,
    public var `Version`: `HTTP_VERSION`,
    public var `StatusCode`: UShort,
    public var `ReasonLength`: UShort,
    public var `pReason`: `windows_sys`.`core`.`PCSTR`,
    public var `Headers`: `HTTP_RESPONSE_HEADERS`,
    public var `EntityChunkCount`: UShort,
    public var `pEntityChunks`: /* Rust *mut */ kotlinx.cinterop.CPointer<`HTTP_DATA_CHUNK`>?,
)
// UNSUPPORTED Rust 778:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_RESPONSE_V1 {
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
public class `HTTP_RESPONSE_V2` (
    public var `Base`: `HTTP_RESPONSE_V1`,
    public var `ResponseInfoCount`: UShort,
    public var `pResponseInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`HTTP_RESPONSE_INFO`>?,
)
// UNSUPPORTED Rust 790:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_RESPONSE_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HTTP_SCHEME` = Int;
public const val `HTTP_SEND_RESPONSE_FLAG_BUFFER_DATA`: UInt = 4u;
public const val `HTTP_SEND_RESPONSE_FLAG_DISCONNECT`: UInt = 1u;
public const val `HTTP_SEND_RESPONSE_FLAG_ENABLE_NAGLING`: UInt = 8u;
public const val `HTTP_SEND_RESPONSE_FLAG_GOAWAY`: UInt = 256u;
public const val `HTTP_SEND_RESPONSE_FLAG_MORE_DATA`: UInt = 2u;
public const val `HTTP_SEND_RESPONSE_FLAG_OPAQUE`: UInt = 64u;
public const val `HTTP_SEND_RESPONSE_FLAG_PROCESS_RANGES`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_SERVER_AUTHENTICATION_BASIC_PARAMS` (
    public var `RealmLength`: UShort,
    public var `Realm`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 809:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_SERVER_AUTHENTICATION_BASIC_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_SERVER_AUTHENTICATION_DIGEST_PARAMS` (
    public var `DomainNameLength`: UShort,
    public var `DomainName`: `windows_sys`.`core`.`PWSTR`,
    public var `RealmLength`: UShort,
    public var `Realm`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 822:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_SERVER_AUTHENTICATION_DIGEST_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_SERVER_AUTHENTICATION_INFO` (
    public var `Flags`: `HTTP_PROPERTY_FLAGS`,
    public var `AuthSchemes`: UInt,
    public var `ReceiveMutualAuth`: Boolean,
    public var `ReceiveContextHandle`: Boolean,
    public var `DisableNTLMCredentialCaching`: Boolean,
    public var `ExFlags`: UByte,
    public var `DigestParams`: `HTTP_SERVER_AUTHENTICATION_DIGEST_PARAMS`,
    public var `BasicParams`: `HTTP_SERVER_AUTHENTICATION_BASIC_PARAMS`,
)
public typealias `HTTP_SERVER_PROPERTY` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_SERVICE_BINDING_A` (
    public var `Base`: `HTTP_SERVICE_BINDING_BASE`,
    public var `Buffer`: `windows_sys`.`core`.`PSTR`,
    public var `BufferSize`: UInt,
)
// UNSUPPORTED Rust 847:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_SERVICE_BINDING_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_SERVICE_BINDING_BASE` (
    public var `Type`: `HTTP_SERVICE_BINDING_TYPE`,
)
public typealias `HTTP_SERVICE_BINDING_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_SERVICE_BINDING_W` (
    public var `Base`: `HTTP_SERVICE_BINDING_BASE`,
    public var `Buffer`: `windows_sys`.`core`.`PWSTR`,
    public var `BufferSize`: UInt,
)
// UNSUPPORTED Rust 865:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_SERVICE_BINDING_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HTTP_SERVICE_CONFIG_CACHE_KEY` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_SERVICE_CONFIG_CACHE_SET` (
    public var `KeyDesc`: `HTTP_SERVICE_CONFIG_CACHE_KEY`,
    public var `ParamDesc`: UInt,
)
public typealias `HTTP_SERVICE_CONFIG_ID` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_SERVICE_CONFIG_IP_LISTEN_PARAM` (
    public var `AddrLength`: UShort,
    public var `pAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`WinSock`.`SOCKADDR`>?,
)
// UNSUPPORTED Rust 885:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for HTTP_SERVICE_CONFIG_IP_LISTEN_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 891:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct HTTP_SERVICE_CONFIG_IP_LISTEN_QUERY {
//     pub AddrCount: u32,
//     pub AddrList: [super::WinSock::SOCKADDR_STORAGE; 1],
// }

// UNSUPPORTED Rust 898:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for HTTP_SERVICE_CONFIG_IP_LISTEN_QUERY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HTTP_SERVICE_CONFIG_QUERY_TYPE` = Int;
public typealias `HTTP_SERVICE_CONFIG_SETTING_KEY` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_SERVICE_CONFIG_SETTING_SET` (
    public var `KeyDesc`: `HTTP_SERVICE_CONFIG_SETTING_KEY`,
    public var `ParamDesc`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_SERVICE_CONFIG_SSL_CCS_KEY` (
    public var `LocalAddress`: `super`.`WinSock`.`SOCKADDR_STORAGE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_SERVICE_CONFIG_SSL_CCS_QUERY` (
    public var `QueryDesc`: `HTTP_SERVICE_CONFIG_QUERY_TYPE`,
    public var `KeyDesc`: `HTTP_SERVICE_CONFIG_SSL_CCS_KEY`,
    public var `dwToken`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_SERVICE_CONFIG_SSL_CCS_QUERY_EX` (
    public var `QueryDesc`: `HTTP_SERVICE_CONFIG_QUERY_TYPE`,
    public var `KeyDesc`: `HTTP_SERVICE_CONFIG_SSL_CCS_KEY`,
    public var `dwToken`: UInt,
    public var `ParamType`: `HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_SERVICE_CONFIG_SSL_CCS_SET` (
    public var `KeyDesc`: `HTTP_SERVICE_CONFIG_SSL_CCS_KEY`,
    public var `ParamDesc`: `HTTP_SERVICE_CONFIG_SSL_PARAM`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_SERVICE_CONFIG_SSL_CCS_SET_EX` (
    public var `KeyDesc`: `HTTP_SERVICE_CONFIG_SSL_CCS_KEY`,
    public var `ParamDesc`: `HTTP_SERVICE_CONFIG_SSL_PARAM_EX`,
)
// UNSUPPORTED Rust 949:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for HTTP_SERVICE_CONFIG_SSL_CCS_SET_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HTTP_SERVICE_CONFIG_SSL_FLAG_DISABLE_HTTP2`: UInt = 16u;
public const val `HTTP_SERVICE_CONFIG_SSL_FLAG_DISABLE_LEGACY_TLS`: UInt = 1024u;
public const val `HTTP_SERVICE_CONFIG_SSL_FLAG_DISABLE_OCSP_STAPLING`: UInt = 128u;
public const val `HTTP_SERVICE_CONFIG_SSL_FLAG_DISABLE_QUIC`: UInt = 32u;
public const val `HTTP_SERVICE_CONFIG_SSL_FLAG_DISABLE_SESSION_ID`: UInt = 16384u;
public const val `HTTP_SERVICE_CONFIG_SSL_FLAG_DISABLE_TLS12`: UInt = 4096u;
public const val `HTTP_SERVICE_CONFIG_SSL_FLAG_DISABLE_TLS13`: UInt = 64u;
public const val `HTTP_SERVICE_CONFIG_SSL_FLAG_ENABLE_CLIENT_CORRELATION`: UInt = 8192u;
public const val `HTTP_SERVICE_CONFIG_SSL_FLAG_ENABLE_SESSION_TICKET`: UInt = 2048u;
public const val `HTTP_SERVICE_CONFIG_SSL_FLAG_ENABLE_TOKEN_BINDING`: UInt = 256u;
public const val `HTTP_SERVICE_CONFIG_SSL_FLAG_LOG_EXTENDED_EVENTS`: UInt = 512u;
public const val `HTTP_SERVICE_CONFIG_SSL_FLAG_NEGOTIATE_CLIENT_CERT`: UInt = 2u;
public const val `HTTP_SERVICE_CONFIG_SSL_FLAG_NO_RAW_FILTER`: UInt = 4u;
public const val `HTTP_SERVICE_CONFIG_SSL_FLAG_REJECT`: UInt = 8u;
public const val `HTTP_SERVICE_CONFIG_SSL_FLAG_USE_DS_MAPPER`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_SERVICE_CONFIG_SSL_KEY` (
    public var `pIpPort`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`WinSock`.`SOCKADDR`>?,
)
// UNSUPPORTED Rust 976:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for HTTP_SERVICE_CONFIG_SSL_KEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_SERVICE_CONFIG_SSL_KEY_EX` (
    public var `IpPort`: `super`.`WinSock`.`SOCKADDR_STORAGE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_SERVICE_CONFIG_SSL_PARAM` (
    public var `SslHashLength`: UInt,
    public var `pSslHash`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `AppId`: `windows_sys`.`core`.`GUID`,
    public var `pSslCertStoreName`: `windows_sys`.`core`.`PWSTR`,
    public var `DefaultCertCheckMode`: UInt,
    public var `DefaultRevocationFreshnessTime`: UInt,
    public var `DefaultRevocationUrlRetrievalTimeout`: UInt,
    public var `pDefaultSslCtlIdentifier`: `windows_sys`.`core`.`PWSTR`,
    public var `pDefaultSslCtlStoreName`: `windows_sys`.`core`.`PWSTR`,
    public var `DefaultFlags`: UInt,
)
// UNSUPPORTED Rust 1002:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_SERVICE_CONFIG_SSL_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_SERVICE_CONFIG_SSL_PARAM_EX` (
    public var `ParamType`: `HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE`,
    public var `Flags`: ULong,
    public var `Anonymous`: `HTTP_SERVICE_CONFIG_SSL_PARAM_EX_0`,
)
// UNSUPPORTED Rust 1014:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_SERVICE_CONFIG_SSL_PARAM_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1019:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union HTTP_SERVICE_CONFIG_SSL_PARAM_EX_0 {
//     pub Http2WindowSizeParam: HTTP2_WINDOW_SIZE_PARAM,
//     pub Http2SettingsLimitsParam: HTTP2_SETTINGS_LIMITS_PARAM,
//     pub HttpPerformanceParam: HTTP_PERFORMANCE_PARAM,
//     pub HttpTlsRestrictionsParam: HTTP_TLS_RESTRICTIONS_PARAM,
//     pub HttpErrorHeadersParam: HTTP_ERROR_HEADERS_PARAM,
//     pub HttpTlsSessionTicketKeysParam: HTTP_TLS_SESSION_TICKET_KEYS_PARAM,
// }

// UNSUPPORTED Rust 1029:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_SERVICE_CONFIG_SSL_PARAM_EX_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_SERVICE_CONFIG_SSL_QUERY` (
    public var `QueryDesc`: `HTTP_SERVICE_CONFIG_QUERY_TYPE`,
    public var `KeyDesc`: `HTTP_SERVICE_CONFIG_SSL_KEY`,
    public var `dwToken`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_SERVICE_CONFIG_SSL_QUERY_EX` (
    public var `QueryDesc`: `HTTP_SERVICE_CONFIG_QUERY_TYPE`,
    public var `KeyDesc`: `HTTP_SERVICE_CONFIG_SSL_KEY_EX`,
    public var `dwToken`: UInt,
    public var `ParamType`: `HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_SERVICE_CONFIG_SSL_SET` (
    public var `KeyDesc`: `HTTP_SERVICE_CONFIG_SSL_KEY`,
    public var `ParamDesc`: `HTTP_SERVICE_CONFIG_SSL_PARAM`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_SERVICE_CONFIG_SSL_SET_EX` (
    public var `KeyDesc`: `HTTP_SERVICE_CONFIG_SSL_KEY_EX`,
    public var `ParamDesc`: `HTTP_SERVICE_CONFIG_SSL_PARAM_EX`,
)
// UNSUPPORTED Rust 1065:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for HTTP_SERVICE_CONFIG_SSL_SET_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_SERVICE_CONFIG_SSL_SNI_KEY` (
    public var `IpPort`: `super`.`WinSock`.`SOCKADDR_STORAGE`,
    public var `Host`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 1078:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for HTTP_SERVICE_CONFIG_SSL_SNI_KEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_SERVICE_CONFIG_SSL_SNI_QUERY` (
    public var `QueryDesc`: `HTTP_SERVICE_CONFIG_QUERY_TYPE`,
    public var `KeyDesc`: `HTTP_SERVICE_CONFIG_SSL_SNI_KEY`,
    public var `dwToken`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_SERVICE_CONFIG_SSL_SNI_QUERY_EX` (
    public var `QueryDesc`: `HTTP_SERVICE_CONFIG_QUERY_TYPE`,
    public var `KeyDesc`: `HTTP_SERVICE_CONFIG_SSL_SNI_KEY`,
    public var `dwToken`: UInt,
    public var `ParamType`: `HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_SERVICE_CONFIG_SSL_SNI_SET` (
    public var `KeyDesc`: `HTTP_SERVICE_CONFIG_SSL_SNI_KEY`,
    public var `ParamDesc`: `HTTP_SERVICE_CONFIG_SSL_PARAM`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_SERVICE_CONFIG_SSL_SNI_SET_EX` (
    public var `KeyDesc`: `HTTP_SERVICE_CONFIG_SSL_SNI_KEY`,
    public var `ParamDesc`: `HTTP_SERVICE_CONFIG_SSL_PARAM_EX`,
)
// UNSUPPORTED Rust 1115:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for HTTP_SERVICE_CONFIG_SSL_SNI_SET_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HTTP_SERVICE_CONFIG_TIMEOUT_KEY` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_SERVICE_CONFIG_TIMEOUT_SET` (
    public var `KeyDesc`: `HTTP_SERVICE_CONFIG_TIMEOUT_KEY`,
    public var `ParamDesc`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_SERVICE_CONFIG_URLACL_KEY` (
    public var `pUrlPrefix`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 1133:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_SERVICE_CONFIG_URLACL_KEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_SERVICE_CONFIG_URLACL_PARAM` (
    public var `pStringSecurityDescriptor`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 1143:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_SERVICE_CONFIG_URLACL_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_SERVICE_CONFIG_URLACL_QUERY` (
    public var `QueryDesc`: `HTTP_SERVICE_CONFIG_QUERY_TYPE`,
    public var `KeyDesc`: `HTTP_SERVICE_CONFIG_URLACL_KEY`,
    public var `dwToken`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_SERVICE_CONFIG_URLACL_SET` (
    public var `KeyDesc`: `HTTP_SERVICE_CONFIG_URLACL_KEY`,
    public var `ParamDesc`: `HTTP_SERVICE_CONFIG_URLACL_PARAM`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_SSL_CLIENT_CERT_INFO` (
    public var `CertFlags`: UInt,
    public var `CertEncodedSize`: UInt,
    public var `pCertEncoded`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `Token`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `CertDeniedByMapper`: Boolean,
)
// UNSUPPORTED Rust 1170:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_SSL_CLIENT_CERT_INFO {
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
public class `HTTP_SSL_INFO` (
    public var `ServerCertKeySize`: UShort,
    public var `ConnectionKeySize`: UShort,
    public var `ServerCertIssuerSize`: UInt,
    public var `ServerCertSubjectSize`: UInt,
    public var `pServerCertIssuer`: `windows_sys`.`core`.`PCSTR`,
    public var `pServerCertSubject`: `windows_sys`.`core`.`PCSTR`,
    public var `pClientCertInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`HTTP_SSL_CLIENT_CERT_INFO`>?,
    public var `SslClientCertNegotiated`: UInt,
)
// UNSUPPORTED Rust 1187:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_SSL_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_SSL_PROTOCOL_INFO` (
    public var `Protocol`: UInt,
    public var `CipherType`: UInt,
    public var `CipherStrength`: UInt,
    public var `HashType`: UInt,
    public var `HashStrength`: UInt,
    public var `KeyExchangeType`: UInt,
    public var `KeyExchangeStrength`: UInt,
)
public typealias `HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_STATE_INFO` (
    public var `Flags`: `HTTP_PROPERTY_FLAGS`,
    public var `State`: `HTTP_ENABLED_STATE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_TIMEOUT_LIMIT_INFO` (
    public var `Flags`: `HTTP_PROPERTY_FLAGS`,
    public var `EntityBody`: UShort,
    public var `DrainEntityBody`: UShort,
    public var `RequestQueue`: UShort,
    public var `IdleConnection`: UShort,
    public var `HeaderWait`: UShort,
    public var `MinSendRate`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_TLS_RESTRICTIONS_PARAM` (
    public var `RestrictionCount`: UInt,
    public var `TlsRestrictions`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1227:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_TLS_RESTRICTIONS_PARAM {
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
public class `HTTP_TLS_SESSION_TICKET_KEYS_PARAM` (
    public var `SessionTicketKeyCount`: UInt,
    public var `SessionTicketKeys`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1238:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_TLS_SESSION_TICKET_KEYS_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_TRANSPORT_ADDRESS` (
    public var `pRemoteAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`WinSock`.`SOCKADDR`>?,
    public var `pLocalAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`WinSock`.`SOCKADDR`>?,
)
// UNSUPPORTED Rust 1250:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for HTTP_TRANSPORT_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_UNKNOWN_HEADER` (
    public var `NameLength`: UShort,
    public var `RawValueLength`: UShort,
    public var `pName`: `windows_sys`.`core`.`PCSTR`,
    public var `pRawValue`: `windows_sys`.`core`.`PCSTR`,
)
// UNSUPPORTED Rust 1264:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_UNKNOWN_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HTTP_URL_FLAG_REMOVE_ALL`: UInt = 1u;
public typealias `HTTP_VERB` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_VERSION` (
    public var `MajorVersion`: UShort,
    public var `MinorVersion`: UShort,
)
// UNSUPPORTED Rust 1277:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const HTTP_VERSION: windows_sys::core::PCWSTR = windows_sys::core::w!("HTTP/1.0");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_WSK_API_TIMINGS` (
    public var `ConnectCount`: ULong,
    public var `ConnectSum`: ULong,
    public var `DisconnectCount`: ULong,
    public var `DisconnectSum`: ULong,
    public var `SendCount`: ULong,
    public var `SendSum`: ULong,
    public var `ReceiveCount`: ULong,
    public var `ReceiveSum`: ULong,
    public var `ReleaseCount`: ULong,
    public var `ReleaseSum`: ULong,
    public var `ControlSocketCount`: ULong,
    public var `ControlSocketSum`: ULong,
)
public const val `HeaderWaitTimeout`: `HTTP_SERVICE_CONFIG_TIMEOUT_KEY` = 1;
public const val `Http503ResponseVerbosityBasic`: `HTTP_503_RESPONSE_VERBOSITY` = 0;
public const val `Http503ResponseVerbosityFull`: `HTTP_503_RESPONSE_VERBOSITY` = 2;
public const val `Http503ResponseVerbosityLimited`: `HTTP_503_RESPONSE_VERBOSITY` = 1;
public const val `HttpAuthStatusFailure`: `HTTP_AUTH_STATUS` = 2;
public const val `HttpAuthStatusNotAuthenticated`: `HTTP_AUTH_STATUS` = 1;
public const val `HttpAuthStatusSuccess`: `HTTP_AUTH_STATUS` = 0;
public const val `HttpAuthenticationHardeningLegacy`: `HTTP_AUTHENTICATION_HARDENING_LEVELS` = 0;
public const val `HttpAuthenticationHardeningMedium`: `HTTP_AUTHENTICATION_HARDENING_LEVELS` = 1;
public const val `HttpAuthenticationHardeningStrict`: `HTTP_AUTHENTICATION_HARDENING_LEVELS` = 2;
public const val `HttpCachePolicyMaximum`: `HTTP_CACHE_POLICY_TYPE` = 3;
public const val `HttpCachePolicyNocache`: `HTTP_CACHE_POLICY_TYPE` = 0;
public const val `HttpCachePolicyTimeToLive`: `HTTP_CACHE_POLICY_TYPE` = 2;
public const val `HttpCachePolicyUserInvalidates`: `HTTP_CACHE_POLICY_TYPE` = 1;
public const val `HttpDataChunkFromFileHandle`: `HTTP_DATA_CHUNK_TYPE` = 1;
public const val `HttpDataChunkFromFragmentCache`: `HTTP_DATA_CHUNK_TYPE` = 2;
public const val `HttpDataChunkFromFragmentCacheEx`: `HTTP_DATA_CHUNK_TYPE` = 3;
public const val `HttpDataChunkFromMemory`: `HTTP_DATA_CHUNK_TYPE` = 0;
public const val `HttpDataChunkMaximum`: `HTTP_DATA_CHUNK_TYPE` = 5;
public const val `HttpDataChunkTrailers`: `HTTP_DATA_CHUNK_TYPE` = 4;
public const val `HttpEnabledStateActive`: `HTTP_ENABLED_STATE` = 0;
public const val `HttpEnabledStateInactive`: `HTTP_ENABLED_STATE` = 1;
public const val `HttpFeatureApiTimings`: `HTTP_FEATURE_ID` = 2;
public const val `HttpFeatureDelegateEx`: `HTTP_FEATURE_ID` = 3;
public const val `HttpFeatureHttp3`: `HTTP_FEATURE_ID` = 4;
public const val `HttpFeatureLast`: `HTTP_FEATURE_ID` = 5;
public const val `HttpFeatureResponseTrailers`: `HTTP_FEATURE_ID` = 1;
public const val `HttpFeatureUnknown`: `HTTP_FEATURE_ID` = 0;
public const val `HttpFeaturemax`: `HTTP_FEATURE_ID` = -1;
public const val `HttpHeaderAccept`: `HTTP_HEADER_ID` = 20;
public const val `HttpHeaderAcceptCharset`: `HTTP_HEADER_ID` = 21;
public const val `HttpHeaderAcceptEncoding`: `HTTP_HEADER_ID` = 22;
public const val `HttpHeaderAcceptLanguage`: `HTTP_HEADER_ID` = 23;
public const val `HttpHeaderAcceptRanges`: `HTTP_HEADER_ID` = 20;
public const val `HttpHeaderAge`: `HTTP_HEADER_ID` = 21;
public const val `HttpHeaderAllow`: `HTTP_HEADER_ID` = 10;
public const val `HttpHeaderAuthorization`: `HTTP_HEADER_ID` = 24;
public const val `HttpHeaderCacheControl`: `HTTP_HEADER_ID` = 0;
public const val `HttpHeaderConnection`: `HTTP_HEADER_ID` = 1;
public const val `HttpHeaderContentEncoding`: `HTTP_HEADER_ID` = 13;
public const val `HttpHeaderContentLanguage`: `HTTP_HEADER_ID` = 14;
public const val `HttpHeaderContentLength`: `HTTP_HEADER_ID` = 11;
public const val `HttpHeaderContentLocation`: `HTTP_HEADER_ID` = 15;
public const val `HttpHeaderContentMd5`: `HTTP_HEADER_ID` = 16;
public const val `HttpHeaderContentRange`: `HTTP_HEADER_ID` = 17;
public const val `HttpHeaderContentType`: `HTTP_HEADER_ID` = 12;
public const val `HttpHeaderCookie`: `HTTP_HEADER_ID` = 25;
public const val `HttpHeaderDate`: `HTTP_HEADER_ID` = 2;
public const val `HttpHeaderEtag`: `HTTP_HEADER_ID` = 22;
public const val `HttpHeaderExpect`: `HTTP_HEADER_ID` = 26;
public const val `HttpHeaderExpires`: `HTTP_HEADER_ID` = 18;
public const val `HttpHeaderFrom`: `HTTP_HEADER_ID` = 27;
public const val `HttpHeaderHost`: `HTTP_HEADER_ID` = 28;
public const val `HttpHeaderIfMatch`: `HTTP_HEADER_ID` = 29;
public const val `HttpHeaderIfModifiedSince`: `HTTP_HEADER_ID` = 30;
public const val `HttpHeaderIfNoneMatch`: `HTTP_HEADER_ID` = 31;
public const val `HttpHeaderIfRange`: `HTTP_HEADER_ID` = 32;
public const val `HttpHeaderIfUnmodifiedSince`: `HTTP_HEADER_ID` = 33;
public const val `HttpHeaderKeepAlive`: `HTTP_HEADER_ID` = 3;
public const val `HttpHeaderLastModified`: `HTTP_HEADER_ID` = 19;
public const val `HttpHeaderLocation`: `HTTP_HEADER_ID` = 23;
public const val `HttpHeaderMaxForwards`: `HTTP_HEADER_ID` = 34;
public const val `HttpHeaderMaximum`: `HTTP_HEADER_ID` = 41;
public const val `HttpHeaderPragma`: `HTTP_HEADER_ID` = 4;
public const val `HttpHeaderProxyAuthenticate`: `HTTP_HEADER_ID` = 24;
public const val `HttpHeaderProxyAuthorization`: `HTTP_HEADER_ID` = 35;
public const val `HttpHeaderRange`: `HTTP_HEADER_ID` = 37;
public const val `HttpHeaderReferer`: `HTTP_HEADER_ID` = 36;
public const val `HttpHeaderRequestMaximum`: `HTTP_HEADER_ID` = 41;
public const val `HttpHeaderResponseMaximum`: `HTTP_HEADER_ID` = 30;
public const val `HttpHeaderRetryAfter`: `HTTP_HEADER_ID` = 25;
public const val `HttpHeaderServer`: `HTTP_HEADER_ID` = 26;
public const val `HttpHeaderSetCookie`: `HTTP_HEADER_ID` = 27;
public const val `HttpHeaderTe`: `HTTP_HEADER_ID` = 38;
public const val `HttpHeaderTrailer`: `HTTP_HEADER_ID` = 5;
public const val `HttpHeaderTransferEncoding`: `HTTP_HEADER_ID` = 6;
public const val `HttpHeaderTranslate`: `HTTP_HEADER_ID` = 39;
public const val `HttpHeaderUpgrade`: `HTTP_HEADER_ID` = 7;
public const val `HttpHeaderUserAgent`: `HTTP_HEADER_ID` = 40;
public const val `HttpHeaderVary`: `HTTP_HEADER_ID` = 28;
public const val `HttpHeaderVia`: `HTTP_HEADER_ID` = 8;
public const val `HttpHeaderWarning`: `HTTP_HEADER_ID` = 9;
public const val `HttpHeaderWwwAuthenticate`: `HTTP_HEADER_ID` = 29;
public const val `HttpLogDataTypeFields`: `HTTP_LOG_DATA_TYPE` = 0;
public const val `HttpLoggingRolloverDaily`: `HTTP_LOGGING_ROLLOVER_TYPE` = 1;
public const val `HttpLoggingRolloverHourly`: `HTTP_LOGGING_ROLLOVER_TYPE` = 4;
public const val `HttpLoggingRolloverMonthly`: `HTTP_LOGGING_ROLLOVER_TYPE` = 3;
public const val `HttpLoggingRolloverSize`: `HTTP_LOGGING_ROLLOVER_TYPE` = 0;
public const val `HttpLoggingRolloverWeekly`: `HTTP_LOGGING_ROLLOVER_TYPE` = 2;
public const val `HttpLoggingTypeIIS`: `HTTP_LOGGING_TYPE` = 1;
public const val `HttpLoggingTypeNCSA`: `HTTP_LOGGING_TYPE` = 2;
public const val `HttpLoggingTypeRaw`: `HTTP_LOGGING_TYPE` = 3;
public const val `HttpLoggingTypeW3C`: `HTTP_LOGGING_TYPE` = 0;
public const val `HttpNone`: `HTTP_SERVICE_CONFIG_SETTING_KEY` = 0;
public const val `HttpProtectionLevelEdgeRestricted`: `HTTP_PROTECTION_LEVEL_TYPE` = 1;
public const val `HttpProtectionLevelRestricted`: `HTTP_PROTECTION_LEVEL_TYPE` = 2;
public const val `HttpProtectionLevelUnrestricted`: `HTTP_PROTECTION_LEVEL_TYPE` = 0;
public const val `HttpQosSettingTypeBandwidth`: `HTTP_QOS_SETTING_TYPE` = 0;
public const val `HttpQosSettingTypeConnectionLimit`: `HTTP_QOS_SETTING_TYPE` = 1;
public const val `HttpQosSettingTypeFlowRate`: `HTTP_QOS_SETTING_TYPE` = 2;
public const val `HttpRequestAuthTypeBasic`: `HTTP_REQUEST_AUTH_TYPE` = 1;
public const val `HttpRequestAuthTypeDigest`: `HTTP_REQUEST_AUTH_TYPE` = 2;
public const val `HttpRequestAuthTypeKerberos`: `HTTP_REQUEST_AUTH_TYPE` = 5;
public const val `HttpRequestAuthTypeNTLM`: `HTTP_REQUEST_AUTH_TYPE` = 3;
public const val `HttpRequestAuthTypeNegotiate`: `HTTP_REQUEST_AUTH_TYPE` = 4;
public const val `HttpRequestAuthTypeNone`: `HTTP_REQUEST_AUTH_TYPE` = 0;
public const val `HttpRequestInfoTypeAuth`: `HTTP_REQUEST_INFO_TYPE` = 0;
public const val `HttpRequestInfoTypeChannelBind`: `HTTP_REQUEST_INFO_TYPE` = 1;
public const val `HttpRequestInfoTypeQuicStats`: `HTTP_REQUEST_INFO_TYPE` = 8;
public const val `HttpRequestInfoTypeRequestSizing`: `HTTP_REQUEST_INFO_TYPE` = 7;
public const val `HttpRequestInfoTypeRequestTiming`: `HTTP_REQUEST_INFO_TYPE` = 5;
public const val `HttpRequestInfoTypeSslProtocol`: `HTTP_REQUEST_INFO_TYPE` = 2;
public const val `HttpRequestInfoTypeSslTokenBinding`: `HTTP_REQUEST_INFO_TYPE` = 4;
public const val `HttpRequestInfoTypeSslTokenBindingDraft`: `HTTP_REQUEST_INFO_TYPE` = 3;
public const val `HttpRequestInfoTypeTcpInfoV0`: `HTTP_REQUEST_INFO_TYPE` = 6;
public const val `HttpRequestInfoTypeTcpInfoV1`: `HTTP_REQUEST_INFO_TYPE` = 9;
public const val `HttpRequestPropertyIsb`: `HTTP_REQUEST_PROPERTY` = 0;
public const val `HttpRequestPropertyQuicApiTimings`: `HTTP_REQUEST_PROPERTY` = 7;
public const val `HttpRequestPropertyQuicStats`: `HTTP_REQUEST_PROPERTY` = 2;
public const val `HttpRequestPropertySni`: `HTTP_REQUEST_PROPERTY` = 4;
public const val `HttpRequestPropertyStreamError`: `HTTP_REQUEST_PROPERTY` = 5;
public const val `HttpRequestPropertyTcpInfoV0`: `HTTP_REQUEST_PROPERTY` = 1;
public const val `HttpRequestPropertyTcpInfoV1`: `HTTP_REQUEST_PROPERTY` = 3;
public const val `HttpRequestPropertyWskApiTimings`: `HTTP_REQUEST_PROPERTY` = 6;
public const val `HttpRequestSizingTypeHeaders`: `HTTP_REQUEST_SIZING_TYPE` = 4;
public const val `HttpRequestSizingTypeMax`: `HTTP_REQUEST_SIZING_TYPE` = 5;
public const val `HttpRequestSizingTypeTlsHandshakeLeg1ClientData`: `HTTP_REQUEST_SIZING_TYPE` = 0;
public const val `HttpRequestSizingTypeTlsHandshakeLeg1ServerData`: `HTTP_REQUEST_SIZING_TYPE` = 1;
public const val `HttpRequestSizingTypeTlsHandshakeLeg2ClientData`: `HTTP_REQUEST_SIZING_TYPE` = 2;
public const val `HttpRequestSizingTypeTlsHandshakeLeg2ServerData`: `HTTP_REQUEST_SIZING_TYPE` = 3;
public const val `HttpRequestTimingTypeConnectionStart`: `HTTP_REQUEST_TIMING_TYPE` = 0;
public const val `HttpRequestTimingTypeDataStart`: `HTTP_REQUEST_TIMING_TYPE` = 1;
public const val `HttpRequestTimingTypeHttp2HeaderDecodeEnd`: `HTTP_REQUEST_TIMING_TYPE` = 14;
public const val `HttpRequestTimingTypeHttp2HeaderDecodeStart`: `HTTP_REQUEST_TIMING_TYPE` = 13;
public const val `HttpRequestTimingTypeHttp2StreamStart`: `HTTP_REQUEST_TIMING_TYPE` = 12;
public const val `HttpRequestTimingTypeHttp3HeaderDecodeEnd`: `HTTP_REQUEST_TIMING_TYPE` = 29;
public const val `HttpRequestTimingTypeHttp3HeaderDecodeStart`: `HTTP_REQUEST_TIMING_TYPE` = 28;
public const val `HttpRequestTimingTypeHttp3StreamStart`: `HTTP_REQUEST_TIMING_TYPE` = 27;
public const val `HttpRequestTimingTypeMax`: `HTTP_REQUEST_TIMING_TYPE` = 30;
public const val `HttpRequestTimingTypeRequestDeliveredForDelegation`: `HTTP_REQUEST_TIMING_TYPE` = 23;
public const val `HttpRequestTimingTypeRequestDeliveredForIO`: `HTTP_REQUEST_TIMING_TYPE` = 26;
public const val `HttpRequestTimingTypeRequestDeliveredForInspection`: `HTTP_REQUEST_TIMING_TYPE` = 20;
public const val `HttpRequestTimingTypeRequestHeaderParseEnd`: `HTTP_REQUEST_TIMING_TYPE` = 16;
public const val `HttpRequestTimingTypeRequestHeaderParseStart`: `HTTP_REQUEST_TIMING_TYPE` = 15;
public const val `HttpRequestTimingTypeRequestQueuedForDelegation`: `HTTP_REQUEST_TIMING_TYPE` = 22;
public const val `HttpRequestTimingTypeRequestQueuedForIO`: `HTTP_REQUEST_TIMING_TYPE` = 25;
public const val `HttpRequestTimingTypeRequestQueuedForInspection`: `HTTP_REQUEST_TIMING_TYPE` = 19;
public const val `HttpRequestTimingTypeRequestReturnedAfterDelegation`: `HTTP_REQUEST_TIMING_TYPE` = 24;
public const val `HttpRequestTimingTypeRequestReturnedAfterInspection`: `HTTP_REQUEST_TIMING_TYPE` = 21;
public const val `HttpRequestTimingTypeRequestRoutingEnd`: `HTTP_REQUEST_TIMING_TYPE` = 18;
public const val `HttpRequestTimingTypeRequestRoutingStart`: `HTTP_REQUEST_TIMING_TYPE` = 17;
public const val `HttpRequestTimingTypeTlsAttributesQueryEnd`: `HTTP_REQUEST_TIMING_TYPE` = 9;
public const val `HttpRequestTimingTypeTlsAttributesQueryStart`: `HTTP_REQUEST_TIMING_TYPE` = 8;
public const val `HttpRequestTimingTypeTlsCertificateLoadEnd`: `HTTP_REQUEST_TIMING_TYPE` = 3;
public const val `HttpRequestTimingTypeTlsCertificateLoadStart`: `HTTP_REQUEST_TIMING_TYPE` = 2;
public const val `HttpRequestTimingTypeTlsClientCertQueryEnd`: `HTTP_REQUEST_TIMING_TYPE` = 11;
public const val `HttpRequestTimingTypeTlsClientCertQueryStart`: `HTTP_REQUEST_TIMING_TYPE` = 10;
public const val `HttpRequestTimingTypeTlsHandshakeLeg1End`: `HTTP_REQUEST_TIMING_TYPE` = 5;
public const val `HttpRequestTimingTypeTlsHandshakeLeg1Start`: `HTTP_REQUEST_TIMING_TYPE` = 4;
public const val `HttpRequestTimingTypeTlsHandshakeLeg2End`: `HTTP_REQUEST_TIMING_TYPE` = 7;
public const val `HttpRequestTimingTypeTlsHandshakeLeg2Start`: `HTTP_REQUEST_TIMING_TYPE` = 6;
public const val `HttpResponseInfoTypeAuthenticationProperty`: `HTTP_RESPONSE_INFO_TYPE` = 1;
public const val `HttpResponseInfoTypeChannelBind`: `HTTP_RESPONSE_INFO_TYPE` = 3;
public const val `HttpResponseInfoTypeMultipleKnownHeaders`: `HTTP_RESPONSE_INFO_TYPE` = 0;
public const val `HttpResponseInfoTypeQoSProperty`: `HTTP_RESPONSE_INFO_TYPE` = 2;
public const val `HttpSchemeHttp`: `HTTP_SCHEME` = 0;
public const val `HttpSchemeHttps`: `HTTP_SCHEME` = 1;
public const val `HttpSchemeMaximum`: `HTTP_SCHEME` = 2;
public const val `HttpServer503VerbosityProperty`: `HTTP_SERVER_PROPERTY` = 6;
public const val `HttpServerAuthenticationProperty`: `HTTP_SERVER_PROPERTY` = 0;
public const val `HttpServerBindingProperty`: `HTTP_SERVER_PROPERTY` = 7;
public const val `HttpServerChannelBindProperty`: `HTTP_SERVER_PROPERTY` = 10;
public const val `HttpServerDelegationProperty`: `HTTP_SERVER_PROPERTY` = 16;
public const val `HttpServerExtendedAuthenticationProperty`: `HTTP_SERVER_PROPERTY` = 8;
public const val `HttpServerListenEndpointProperty`: `HTTP_SERVER_PROPERTY` = 9;
public const val `HttpServerLoggingProperty`: `HTTP_SERVER_PROPERTY` = 1;
public const val `HttpServerProtectionLevelProperty`: `HTTP_SERVER_PROPERTY` = 11;
public const val `HttpServerQosProperty`: `HTTP_SERVER_PROPERTY` = 2;
public const val `HttpServerQueueLengthProperty`: `HTTP_SERVER_PROPERTY` = 4;
public const val `HttpServerStateProperty`: `HTTP_SERVER_PROPERTY` = 5;
public const val `HttpServerTimeoutsProperty`: `HTTP_SERVER_PROPERTY` = 3;
public const val `HttpServiceBindingTypeA`: `HTTP_SERVICE_BINDING_TYPE` = 2;
public const val `HttpServiceBindingTypeNone`: `HTTP_SERVICE_BINDING_TYPE` = 0;
public const val `HttpServiceBindingTypeW`: `HTTP_SERVICE_BINDING_TYPE` = 1;
public const val `HttpServiceConfigCache`: `HTTP_SERVICE_CONFIG_ID` = 4;
public const val `HttpServiceConfigIPListenList`: `HTTP_SERVICE_CONFIG_ID` = 0;
public const val `HttpServiceConfigMax`: `HTTP_SERVICE_CONFIG_ID` = 13;
public const val `HttpServiceConfigQueryExact`: `HTTP_SERVICE_CONFIG_QUERY_TYPE` = 0;
public const val `HttpServiceConfigQueryMax`: `HTTP_SERVICE_CONFIG_QUERY_TYPE` = 2;
public const val `HttpServiceConfigQueryNext`: `HTTP_SERVICE_CONFIG_QUERY_TYPE` = 1;
public const val `HttpServiceConfigSSLCertInfo`: `HTTP_SERVICE_CONFIG_ID` = 1;
public const val `HttpServiceConfigSetting`: `HTTP_SERVICE_CONFIG_ID` = 7;
public const val `HttpServiceConfigSslCcsCertInfo`: `HTTP_SERVICE_CONFIG_ID` = 6;
public const val `HttpServiceConfigSslCcsCertInfoEx`: `HTTP_SERVICE_CONFIG_ID` = 10;
public const val `HttpServiceConfigSslCertInfoEx`: `HTTP_SERVICE_CONFIG_ID` = 8;
public const val `HttpServiceConfigSslScopedCcsCertInfo`: `HTTP_SERVICE_CONFIG_ID` = 11;
public const val `HttpServiceConfigSslScopedCcsCertInfoEx`: `HTTP_SERVICE_CONFIG_ID` = 12;
public const val `HttpServiceConfigSslSniCertInfo`: `HTTP_SERVICE_CONFIG_ID` = 5;
public const val `HttpServiceConfigSslSniCertInfoEx`: `HTTP_SERVICE_CONFIG_ID` = 9;
public const val `HttpServiceConfigTimeout`: `HTTP_SERVICE_CONFIG_ID` = 3;
public const val `HttpServiceConfigUrlAclInfo`: `HTTP_SERVICE_CONFIG_ID` = 2;
public const val `HttpTlsThrottle`: `HTTP_SERVICE_CONFIG_SETTING_KEY` = 1;
public const val `HttpVerbCONNECT`: `HTTP_VERB` = 10;
public const val `HttpVerbCOPY`: `HTTP_VERB` = 13;
public const val `HttpVerbDELETE`: `HTTP_VERB` = 8;
public const val `HttpVerbGET`: `HTTP_VERB` = 4;
public const val `HttpVerbHEAD`: `HTTP_VERB` = 5;
public const val `HttpVerbInvalid`: `HTTP_VERB` = 2;
public const val `HttpVerbLOCK`: `HTTP_VERB` = 17;
public const val `HttpVerbMKCOL`: `HTTP_VERB` = 16;
public const val `HttpVerbMOVE`: `HTTP_VERB` = 12;
public const val `HttpVerbMaximum`: `HTTP_VERB` = 20;
public const val `HttpVerbOPTIONS`: `HTTP_VERB` = 3;
public const val `HttpVerbPOST`: `HTTP_VERB` = 6;
public const val `HttpVerbPROPFIND`: `HTTP_VERB` = 14;
public const val `HttpVerbPROPPATCH`: `HTTP_VERB` = 15;
public const val `HttpVerbPUT`: `HTTP_VERB` = 7;
public const val `HttpVerbSEARCH`: `HTTP_VERB` = 19;
public const val `HttpVerbTRACE`: `HTTP_VERB` = 9;
public const val `HttpVerbTRACK`: `HTTP_VERB` = 11;
public const val `HttpVerbUNLOCK`: `HTTP_VERB` = 18;
public const val `HttpVerbUnknown`: `HTTP_VERB` = 1;
public const val `HttpVerbUnparsed`: `HTTP_VERB` = 0;
public const val `IdleConnectionTimeout`: `HTTP_SERVICE_CONFIG_TIMEOUT_KEY` = 0;
public const val `MaxCacheResponseSize`: `HTTP_SERVICE_CONFIG_CACHE_KEY` = 0;
public const val `PerformanceParamAggressiveICW`: `HTTP_PERFORMANCE_PARAM_TYPE` = 1;
public const val `PerformanceParamDecryptOnSspiThread`: `HTTP_PERFORMANCE_PARAM_TYPE` = 5;
public const val `PerformanceParamMax`: `HTTP_PERFORMANCE_PARAM_TYPE` = 6;
public const val `PerformanceParamMaxConcurrentClientStreams`: `HTTP_PERFORMANCE_PARAM_TYPE` = 3;
public const val `PerformanceParamMaxReceiveBufferSize`: `HTTP_PERFORMANCE_PARAM_TYPE` = 4;
public const val `PerformanceParamMaxSendBufferSize`: `HTTP_PERFORMANCE_PARAM_TYPE` = 2;
public const val `PerformanceParamSendBufferingFlags`: `HTTP_PERFORMANCE_PARAM_TYPE` = 0;
