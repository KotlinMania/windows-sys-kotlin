// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("webauthn.dll" "system" fn WebAuthNAuthenticatorGetAssertion(hwnd : super::super::Foundation:: HWND, pwszrpid : windows_sys::core::PCWSTR, pwebauthnclientdata : *const WEBAUTHN_CLIENT_DATA, pwebauthngetassertionoptions : *const WEBAUTHN_AUTHENTICATOR_GET_ASSERTION_OPTIONS, ppwebauthnassertion : *mut *mut WEBAUTHN_ASSERTION) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("webauthn.dll" "system" fn WebAuthNAuthenticatorMakeCredential(hwnd : super::super::Foundation:: HWND, prpinformation : *const WEBAUTHN_RP_ENTITY_INFORMATION, puserinformation : *const WEBAUTHN_USER_ENTITY_INFORMATION, ppubkeycredparams : *const WEBAUTHN_COSE_CREDENTIAL_PARAMETERS, pwebauthnclientdata : *const WEBAUTHN_CLIENT_DATA, pwebauthnmakecredentialoptions : *const WEBAUTHN_AUTHENTICATOR_MAKE_CREDENTIAL_OPTIONS, ppwebauthncredentialattestation : *mut *mut WEBAUTHN_CREDENTIAL_ATTESTATION) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("webauthn.dll" "system" fn WebAuthNCancelCurrentOperation(pcancellationid : *const windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("webauthn.dll" "system" fn WebAuthNDeletePlatformCredential(cbcredentialid : u32, pbcredentialid : *const u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("webauthn.dll" "system" fn WebAuthNFreeAssertion(pwebauthnassertion : *const WEBAUTHN_ASSERTION));

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("webauthn.dll" "system" fn WebAuthNFreeCredentialAttestation(pwebauthncredentialattestation : *const WEBAUTHN_CREDENTIAL_ATTESTATION));

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("webauthn.dll" "system" fn WebAuthNFreePlatformCredentialList(pcredentialdetailslist : *const WEBAUTHN_CREDENTIAL_DETAILS_LIST));

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("webauthn.dll" "system" fn WebAuthNGetApiVersionNumber() -> u32);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("webauthn.dll" "system" fn WebAuthNGetCancellationId(pcancellationid : *mut windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("webauthn.dll" "system" fn WebAuthNGetErrorName(hr : windows_sys::core::HRESULT) -> windows_sys::core::PCWSTR);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("webauthn.dll" "system" fn WebAuthNGetPlatformCredentialList(pgetcredentialsoptions : *const WEBAUTHN_GET_CREDENTIALS_OPTIONS, ppcredentialdetailslist : *mut *mut WEBAUTHN_CREDENTIAL_DETAILS_LIST) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("webauthn.dll" "system" fn WebAuthNGetW3CExceptionDOMError(hr : windows_sys::core::HRESULT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("webauthn.dll" "system" fn WebAuthNIsUserVerifyingPlatformAuthenticatorAvailable(pbisuserverifyingplatformauthenticatoravailable : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsAbandonCall(serviceproxy : *const WS_SERVICE_PROXY, callid : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsAbandonMessage(channel : *const WS_CHANNEL, message : *const WS_MESSAGE, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsAbortChannel(channel : *const WS_CHANNEL, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsAbortListener(listener : *const WS_LISTENER, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsAbortServiceHost(servicehost : *const WS_SERVICE_HOST, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsAbortServiceProxy(serviceproxy : *const WS_SERVICE_PROXY, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsAcceptChannel(listener : *const WS_LISTENER, channel : *const WS_CHANNEL, asynccontext : *const WS_ASYNC_CONTEXT, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsAddCustomHeader(message : *const WS_MESSAGE, headerdescription : *const WS_ELEMENT_DESCRIPTION, writeoption : WS_WRITE_OPTION, value : *const core::ffi::c_void, valuesize : u32, headerattributes : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsAddErrorString(error : *const WS_ERROR, string : *const WS_STRING) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsAddMappedHeader(message : *const WS_MESSAGE, headername : *const WS_XML_STRING, valuetype : WS_TYPE, writeoption : WS_WRITE_OPTION, value : *const core::ffi::c_void, valuesize : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsAddressMessage(message : *const WS_MESSAGE, address : *const WS_ENDPOINT_ADDRESS, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsAlloc(heap : *const WS_HEAP, size : usize, ptr : *mut *mut core::ffi::c_void, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsAsyncExecute(asyncstate : *const WS_ASYNC_STATE, operation : WS_ASYNC_FUNCTION, callbackmodel : WS_CALLBACK_MODEL, callbackstate : *const core::ffi::c_void, asynccontext : *const WS_ASYNC_CONTEXT, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsCall(serviceproxy : *const WS_SERVICE_PROXY, operation : *const WS_OPERATION_DESCRIPTION, arguments : *const *const core::ffi::c_void, heap : *const WS_HEAP, callproperties : *const WS_CALL_PROPERTY, callpropertycount : u32, asynccontext : *const WS_ASYNC_CONTEXT, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsCheckMustUnderstandHeaders(message : *const WS_MESSAGE, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsCloseChannel(channel : *const WS_CHANNEL, asynccontext : *const WS_ASYNC_CONTEXT, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsCloseListener(listener : *const WS_LISTENER, asynccontext : *const WS_ASYNC_CONTEXT, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsCloseServiceHost(servicehost : *const WS_SERVICE_HOST, asynccontext : *const WS_ASYNC_CONTEXT, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsCloseServiceProxy(serviceproxy : *const WS_SERVICE_PROXY, asynccontext : *const WS_ASYNC_CONTEXT, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsCombineUrl(baseurl : *const WS_STRING, referenceurl : *const WS_STRING, flags : u32, heap : *const WS_HEAP, resulturl : *mut WS_STRING, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsCopyError(source : *const WS_ERROR, destination : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsCopyNode(writer : *const WS_XML_WRITER, reader : *const WS_XML_READER, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsCreateChannel(channeltype : WS_CHANNEL_TYPE, channelbinding : WS_CHANNEL_BINDING, properties : *const WS_CHANNEL_PROPERTY, propertycount : u32, securitydescription : *const WS_SECURITY_DESCRIPTION, channel : *mut *mut WS_CHANNEL, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsCreateChannelForListener(listener : *const WS_LISTENER, properties : *const WS_CHANNEL_PROPERTY, propertycount : u32, channel : *mut *mut WS_CHANNEL, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsCreateError(properties : *const WS_ERROR_PROPERTY, propertycount : u32, error : *mut *mut WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsCreateFaultFromError(error : *const WS_ERROR, faulterrorcode : windows_sys::core::HRESULT, faultdisclosure : WS_FAULT_DISCLOSURE, heap : *const WS_HEAP, fault : *mut WS_FAULT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsCreateHeap(maxsize : usize, trimsize : usize, properties : *const WS_HEAP_PROPERTY, propertycount : u32, heap : *mut *mut WS_HEAP, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsCreateListener(channeltype : WS_CHANNEL_TYPE, channelbinding : WS_CHANNEL_BINDING, properties : *const WS_LISTENER_PROPERTY, propertycount : u32, securitydescription : *const WS_SECURITY_DESCRIPTION, listener : *mut *mut WS_LISTENER, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsCreateMessage(envelopeversion : WS_ENVELOPE_VERSION, addressingversion : WS_ADDRESSING_VERSION, properties : *const WS_MESSAGE_PROPERTY, propertycount : u32, message : *mut *mut WS_MESSAGE, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsCreateMessageForChannel(channel : *const WS_CHANNEL, properties : *const WS_MESSAGE_PROPERTY, propertycount : u32, message : *mut *mut WS_MESSAGE, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsCreateMetadata(properties : *const WS_METADATA_PROPERTY, propertycount : u32, metadata : *mut *mut WS_METADATA, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsCreateReader(properties : *const WS_XML_READER_PROPERTY, propertycount : u32, reader : *mut *mut WS_XML_READER, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsCreateServiceEndpointFromTemplate(channeltype : WS_CHANNEL_TYPE, properties : *const WS_SERVICE_ENDPOINT_PROPERTY, propertycount : u32, addressurl : *const WS_STRING, contract : *const WS_SERVICE_CONTRACT, authorizationcallback : WS_SERVICE_SECURITY_CALLBACK, heap : *const WS_HEAP, templatetype : WS_BINDING_TEMPLATE_TYPE, templatevalue : *const core::ffi::c_void, templatesize : u32, templatedescription : *const core::ffi::c_void, templatedescriptionsize : u32, serviceendpoint : *mut *mut WS_SERVICE_ENDPOINT, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsCreateServiceHost(endpoints : *const *const WS_SERVICE_ENDPOINT, endpointcount : u16, serviceproperties : *const WS_SERVICE_PROPERTY, servicepropertycount : u32, servicehost : *mut *mut WS_SERVICE_HOST, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsCreateServiceProxy(channeltype : WS_CHANNEL_TYPE, channelbinding : WS_CHANNEL_BINDING, securitydescription : *const WS_SECURITY_DESCRIPTION, properties : *const WS_PROXY_PROPERTY, propertycount : u32, channelproperties : *const WS_CHANNEL_PROPERTY, channelpropertycount : u32, serviceproxy : *mut *mut WS_SERVICE_PROXY, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsCreateServiceProxyFromTemplate(channeltype : WS_CHANNEL_TYPE, properties : *const WS_PROXY_PROPERTY, propertycount : u32, templatetype : WS_BINDING_TEMPLATE_TYPE, templatevalue : *const core::ffi::c_void, templatesize : u32, templatedescription : *const core::ffi::c_void, templatedescriptionsize : u32, serviceproxy : *mut *mut WS_SERVICE_PROXY, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsCreateWriter(properties : *const WS_XML_WRITER_PROPERTY, propertycount : u32, writer : *mut *mut WS_XML_WRITER, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsCreateXmlBuffer(heap : *const WS_HEAP, properties : *const WS_XML_BUFFER_PROPERTY, propertycount : u32, buffer : *mut *mut WS_XML_BUFFER, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsCreateXmlSecurityToken(tokenxml : *const WS_XML_BUFFER, tokenkey : *const WS_SECURITY_KEY_HANDLE, properties : *const WS_XML_SECURITY_TOKEN_PROPERTY, propertycount : u32, token : *mut *mut WS_SECURITY_TOKEN, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsDateTimeToFileTime(datetime : *const WS_DATETIME, filetime : *mut super::super::Foundation:: FILETIME, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsDecodeUrl(url : *const WS_STRING, flags : u32, heap : *const WS_HEAP, outurl : *mut *mut WS_URL, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsEncodeUrl(url : *const WS_URL, flags : u32, heap : *const WS_HEAP, outurl : *mut WS_STRING, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsEndReaderCanonicalization(reader : *const WS_XML_READER, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsEndWriterCanonicalization(writer : *const WS_XML_WRITER, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsFileTimeToDateTime(filetime : *const super::super::Foundation:: FILETIME, datetime : *mut WS_DATETIME, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsFillBody(message : *const WS_MESSAGE, minsize : u32, asynccontext : *const WS_ASYNC_CONTEXT, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsFillReader(reader : *const WS_XML_READER, minsize : u32, asynccontext : *const WS_ASYNC_CONTEXT, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsFindAttribute(reader : *const WS_XML_READER, localname : *const WS_XML_STRING, ns : *const WS_XML_STRING, required : windows_sys::core::BOOL, attributeindex : *mut u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsFlushBody(message : *const WS_MESSAGE, minsize : u32, asynccontext : *const WS_ASYNC_CONTEXT, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsFlushWriter(writer : *const WS_XML_WRITER, minsize : u32, asynccontext : *const WS_ASYNC_CONTEXT, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsFreeChannel(channel : *const WS_CHANNEL));

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsFreeError(error : *const WS_ERROR));

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsFreeHeap(heap : *const WS_HEAP));

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsFreeListener(listener : *const WS_LISTENER));

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsFreeMessage(message : *const WS_MESSAGE));

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsFreeMetadata(metadata : *const WS_METADATA));

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsFreeReader(reader : *const WS_XML_READER));

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsFreeSecurityToken(token : *const WS_SECURITY_TOKEN));

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsFreeServiceHost(servicehost : *const WS_SERVICE_HOST));

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsFreeServiceProxy(serviceproxy : *const WS_SERVICE_PROXY));

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsFreeWriter(writer : *const WS_XML_WRITER));

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsGetChannelProperty(channel : *const WS_CHANNEL, id : WS_CHANNEL_PROPERTY_ID, value : *mut core::ffi::c_void, valuesize : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsGetCustomHeader(message : *const WS_MESSAGE, customheaderdescription : *const WS_ELEMENT_DESCRIPTION, repeatingoption : WS_REPEATING_HEADER_OPTION, headerindex : u32, readoption : WS_READ_OPTION, heap : *const WS_HEAP, value : *mut core::ffi::c_void, valuesize : u32, headerattributes : *mut u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsGetDictionary(encoding : WS_ENCODING, dictionary : *mut *mut WS_XML_DICTIONARY, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsGetErrorProperty(error : *const WS_ERROR, id : WS_ERROR_PROPERTY_ID, buffer : *mut core::ffi::c_void, buffersize : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsGetErrorString(error : *const WS_ERROR, index : u32, string : *mut WS_STRING) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsGetFaultErrorDetail(error : *const WS_ERROR, faultdetaildescription : *const WS_FAULT_DETAIL_DESCRIPTION, readoption : WS_READ_OPTION, heap : *const WS_HEAP, value : *mut core::ffi::c_void, valuesize : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsGetFaultErrorProperty(error : *const WS_ERROR, id : WS_FAULT_ERROR_PROPERTY_ID, buffer : *mut core::ffi::c_void, buffersize : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsGetHeader(message : *const WS_MESSAGE, headertype : WS_HEADER_TYPE, valuetype : WS_TYPE, readoption : WS_READ_OPTION, heap : *const WS_HEAP, value : *mut core::ffi::c_void, valuesize : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsGetHeaderAttributes(message : *const WS_MESSAGE, reader : *const WS_XML_READER, headerattributes : *mut u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsGetHeapProperty(heap : *const WS_HEAP, id : WS_HEAP_PROPERTY_ID, value : *mut core::ffi::c_void, valuesize : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsGetListenerProperty(listener : *const WS_LISTENER, id : WS_LISTENER_PROPERTY_ID, value : *mut core::ffi::c_void, valuesize : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsGetMappedHeader(message : *const WS_MESSAGE, headername : *const WS_XML_STRING, repeatingoption : WS_REPEATING_HEADER_OPTION, headerindex : u32, valuetype : WS_TYPE, readoption : WS_READ_OPTION, heap : *const WS_HEAP, value : *mut core::ffi::c_void, valuesize : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsGetMessageProperty(message : *const WS_MESSAGE, id : WS_MESSAGE_PROPERTY_ID, value : *mut core::ffi::c_void, valuesize : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsGetMetadataEndpoints(metadata : *const WS_METADATA, endpoints : *mut WS_METADATA_ENDPOINTS, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsGetMetadataProperty(metadata : *const WS_METADATA, id : WS_METADATA_PROPERTY_ID, value : *mut core::ffi::c_void, valuesize : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsGetMissingMetadataDocumentAddress(metadata : *const WS_METADATA, address : *mut *mut WS_ENDPOINT_ADDRESS, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsGetNamespaceFromPrefix(reader : *const WS_XML_READER, prefix : *const WS_XML_STRING, required : windows_sys::core::BOOL, ns : *mut *mut WS_XML_STRING, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsGetOperationContextProperty(context : *const WS_OPERATION_CONTEXT, id : WS_OPERATION_CONTEXT_PROPERTY_ID, value : *mut core::ffi::c_void, valuesize : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsGetPolicyAlternativeCount(policy : *const WS_POLICY, count : *mut u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsGetPolicyProperty(policy : *const WS_POLICY, id : WS_POLICY_PROPERTY_ID, value : *mut core::ffi::c_void, valuesize : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsGetPrefixFromNamespace(writer : *const WS_XML_WRITER, ns : *const WS_XML_STRING, required : windows_sys::core::BOOL, prefix : *mut *mut WS_XML_STRING, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsGetReaderNode(xmlreader : *const WS_XML_READER, node : *mut *mut WS_XML_NODE, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsGetReaderPosition(reader : *const WS_XML_READER, nodeposition : *mut WS_XML_NODE_POSITION, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsGetReaderProperty(reader : *const WS_XML_READER, id : WS_XML_READER_PROPERTY_ID, value : *mut core::ffi::c_void, valuesize : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsGetSecurityContextProperty(securitycontext : *const WS_SECURITY_CONTEXT, id : WS_SECURITY_CONTEXT_PROPERTY_ID, value : *mut core::ffi::c_void, valuesize : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsGetSecurityTokenProperty(securitytoken : *const WS_SECURITY_TOKEN, id : WS_SECURITY_TOKEN_PROPERTY_ID, value : *mut core::ffi::c_void, valuesize : u32, heap : *const WS_HEAP, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsGetServiceHostProperty(servicehost : *const WS_SERVICE_HOST, id : WS_SERVICE_PROPERTY_ID, value : *mut core::ffi::c_void, valuesize : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsGetServiceProxyProperty(serviceproxy : *const WS_SERVICE_PROXY, id : WS_PROXY_PROPERTY_ID, value : *mut core::ffi::c_void, valuesize : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsGetWriterPosition(writer : *const WS_XML_WRITER, nodeposition : *mut WS_XML_NODE_POSITION, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsGetWriterProperty(writer : *const WS_XML_WRITER, id : WS_XML_WRITER_PROPERTY_ID, value : *mut core::ffi::c_void, valuesize : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsGetXmlAttribute(reader : *const WS_XML_READER, localname : *const WS_XML_STRING, heap : *const WS_HEAP, valuechars : *mut *mut u16, valuecharcount : *mut u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsInitializeMessage(message : *const WS_MESSAGE, initialization : WS_MESSAGE_INITIALIZATION, sourcemessage : *const WS_MESSAGE, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsMarkHeaderAsUnderstood(message : *const WS_MESSAGE, headerposition : *const WS_XML_NODE_POSITION, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsMatchPolicyAlternative(policy : *const WS_POLICY, alternativeindex : u32, policyconstraints : *const WS_POLICY_CONSTRAINTS, matchrequired : windows_sys::core::BOOL, heap : *const WS_HEAP, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsMoveReader(reader : *const WS_XML_READER, moveto : WS_MOVE_TO, found : *mut windows_sys::core::BOOL, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsMoveWriter(writer : *const WS_XML_WRITER, moveto : WS_MOVE_TO, found : *mut windows_sys::core::BOOL, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsOpenChannel(channel : *const WS_CHANNEL, endpointaddress : *const WS_ENDPOINT_ADDRESS, asynccontext : *const WS_ASYNC_CONTEXT, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsOpenListener(listener : *const WS_LISTENER, url : *const WS_STRING, asynccontext : *const WS_ASYNC_CONTEXT, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsOpenServiceHost(servicehost : *const WS_SERVICE_HOST, asynccontext : *const WS_ASYNC_CONTEXT, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsOpenServiceProxy(serviceproxy : *const WS_SERVICE_PROXY, address : *const WS_ENDPOINT_ADDRESS, asynccontext : *const WS_ASYNC_CONTEXT, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsPullBytes(writer : *const WS_XML_WRITER, callback : WS_PULL_BYTES_CALLBACK, callbackstate : *const core::ffi::c_void, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsPushBytes(writer : *const WS_XML_WRITER, callback : WS_PUSH_BYTES_CALLBACK, callbackstate : *const core::ffi::c_void, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsReadArray(reader : *const WS_XML_READER, localname : *const WS_XML_STRING, ns : *const WS_XML_STRING, valuetype : WS_VALUE_TYPE, array : *mut core::ffi::c_void, arraysize : u32, itemoffset : u32, itemcount : u32, actualitemcount : *mut u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 118:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsReadAttribute(reader : *const WS_XML_READER, attributedescription : *const WS_ATTRIBUTE_DESCRIPTION, readoption : WS_READ_OPTION, heap : *const WS_HEAP, value : *mut core::ffi::c_void, valuesize : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 119:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsReadBody(message : *const WS_MESSAGE, bodydescription : *const WS_ELEMENT_DESCRIPTION, readoption : WS_READ_OPTION, heap : *const WS_HEAP, value : *mut core::ffi::c_void, valuesize : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 120:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsReadBytes(reader : *const WS_XML_READER, bytes : *mut core::ffi::c_void, maxbytecount : u32, actualbytecount : *mut u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsReadChars(reader : *const WS_XML_READER, chars : windows_sys::core::PWSTR, maxcharcount : u32, actualcharcount : *mut u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 122:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsReadCharsUtf8(reader : *const WS_XML_READER, bytes : *mut u8, maxbytecount : u32, actualbytecount : *mut u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsReadElement(reader : *const WS_XML_READER, elementdescription : *const WS_ELEMENT_DESCRIPTION, readoption : WS_READ_OPTION, heap : *const WS_HEAP, value : *mut core::ffi::c_void, valuesize : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 124:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsReadEndAttribute(reader : *const WS_XML_READER, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsReadEndElement(reader : *const WS_XML_READER, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 126:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsReadEndpointAddressExtension(reader : *const WS_XML_READER, endpointaddress : *const WS_ENDPOINT_ADDRESS, extensiontype : WS_ENDPOINT_ADDRESS_EXTENSION_TYPE, readoption : WS_READ_OPTION, heap : *const WS_HEAP, value : *mut core::ffi::c_void, valuesize : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsReadEnvelopeEnd(message : *const WS_MESSAGE, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 128:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsReadEnvelopeStart(message : *const WS_MESSAGE, reader : *const WS_XML_READER, donecallback : WS_MESSAGE_DONE_CALLBACK, donecallbackstate : *const core::ffi::c_void, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 129:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsReadMessageEnd(channel : *const WS_CHANNEL, message : *const WS_MESSAGE, asynccontext : *const WS_ASYNC_CONTEXT, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 130:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsReadMessageStart(channel : *const WS_CHANNEL, message : *const WS_MESSAGE, asynccontext : *const WS_ASYNC_CONTEXT, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsReadMetadata(metadata : *const WS_METADATA, reader : *const WS_XML_READER, url : *const WS_STRING, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 132:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsReadNode(reader : *const WS_XML_READER, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 133:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsReadQualifiedName(reader : *const WS_XML_READER, heap : *const WS_HEAP, prefix : *mut WS_XML_STRING, localname : *mut WS_XML_STRING, ns : *mut WS_XML_STRING, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 134:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsReadStartAttribute(reader : *const WS_XML_READER, attributeindex : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsReadStartElement(reader : *const WS_XML_READER, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 136:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsReadToStartElement(reader : *const WS_XML_READER, localname : *const WS_XML_STRING, ns : *const WS_XML_STRING, found : *mut windows_sys::core::BOOL, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsReadType(reader : *const WS_XML_READER, typemapping : WS_TYPE_MAPPING, r#type : WS_TYPE, typedescription : *const core::ffi::c_void, readoption : WS_READ_OPTION, heap : *const WS_HEAP, value : *mut core::ffi::c_void, valuesize : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 138:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsReadValue(reader : *const WS_XML_READER, valuetype : WS_VALUE_TYPE, value : *mut core::ffi::c_void, valuesize : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 139:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsReadXmlBuffer(reader : *const WS_XML_READER, heap : *const WS_HEAP, xmlbuffer : *mut *mut WS_XML_BUFFER, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 140:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsReadXmlBufferFromBytes(reader : *const WS_XML_READER, encoding : *const WS_XML_READER_ENCODING, properties : *const WS_XML_READER_PROPERTY, propertycount : u32, bytes : *const core::ffi::c_void, bytecount : u32, heap : *const WS_HEAP, xmlbuffer : *mut *mut WS_XML_BUFFER, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 141:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsReceiveMessage(channel : *const WS_CHANNEL, message : *const WS_MESSAGE, messagedescriptions : *const *const WS_MESSAGE_DESCRIPTION, messagedescriptioncount : u32, receiveoption : WS_RECEIVE_OPTION, readbodyoption : WS_READ_OPTION, heap : *const WS_HEAP, value : *mut core::ffi::c_void, valuesize : u32, index : *mut u32, asynccontext : *const WS_ASYNC_CONTEXT, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 142:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsRegisterOperationForCancel(context : *const WS_OPERATION_CONTEXT, cancelcallback : WS_OPERATION_CANCEL_CALLBACK, freestatecallback : WS_OPERATION_FREE_STATE_CALLBACK, userstate : *const core::ffi::c_void, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 143:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsRemoveCustomHeader(message : *const WS_MESSAGE, headername : *const WS_XML_STRING, headerns : *const WS_XML_STRING, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 144:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsRemoveHeader(message : *const WS_MESSAGE, headertype : WS_HEADER_TYPE, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 145:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsRemoveMappedHeader(message : *const WS_MESSAGE, headername : *const WS_XML_STRING, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 146:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsRemoveNode(nodeposition : *const WS_XML_NODE_POSITION, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 147:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsRequestReply(channel : *const WS_CHANNEL, requestmessage : *const WS_MESSAGE, requestmessagedescription : *const WS_MESSAGE_DESCRIPTION, writeoption : WS_WRITE_OPTION, requestbodyvalue : *const core::ffi::c_void, requestbodyvaluesize : u32, replymessage : *const WS_MESSAGE, replymessagedescription : *const WS_MESSAGE_DESCRIPTION, readoption : WS_READ_OPTION, heap : *const WS_HEAP, value : *mut core::ffi::c_void, valuesize : u32, asynccontext : *const WS_ASYNC_CONTEXT, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 148:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsRequestSecurityToken(channel : *const WS_CHANNEL, properties : *const WS_REQUEST_SECURITY_TOKEN_PROPERTY, propertycount : u32, token : *mut *mut WS_SECURITY_TOKEN, asynccontext : *const WS_ASYNC_CONTEXT, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsResetChannel(channel : *const WS_CHANNEL, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 150:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsResetError(error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 151:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsResetHeap(heap : *const WS_HEAP, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 152:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsResetListener(listener : *const WS_LISTENER, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 153:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsResetMessage(message : *const WS_MESSAGE, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 154:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsResetMetadata(metadata : *const WS_METADATA, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 155:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsResetServiceHost(servicehost : *const WS_SERVICE_HOST, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 156:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsResetServiceProxy(serviceproxy : *const WS_SERVICE_PROXY, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 157:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsRevokeSecurityContext(securitycontext : *const WS_SECURITY_CONTEXT, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 158:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsSendFaultMessageForError(channel : *const WS_CHANNEL, replymessage : *const WS_MESSAGE, faulterror : *const WS_ERROR, faulterrorcode : windows_sys::core::HRESULT, faultdisclosure : WS_FAULT_DISCLOSURE, requestmessage : *const WS_MESSAGE, asynccontext : *const WS_ASYNC_CONTEXT, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 159:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsSendMessage(channel : *const WS_CHANNEL, message : *const WS_MESSAGE, messagedescription : *const WS_MESSAGE_DESCRIPTION, writeoption : WS_WRITE_OPTION, bodyvalue : *const core::ffi::c_void, bodyvaluesize : u32, asynccontext : *const WS_ASYNC_CONTEXT, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 160:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsSendReplyMessage(channel : *const WS_CHANNEL, replymessage : *const WS_MESSAGE, replymessagedescription : *const WS_MESSAGE_DESCRIPTION, writeoption : WS_WRITE_OPTION, replybodyvalue : *const core::ffi::c_void, replybodyvaluesize : u32, requestmessage : *const WS_MESSAGE, asynccontext : *const WS_ASYNC_CONTEXT, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 161:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsSetChannelProperty(channel : *const WS_CHANNEL, id : WS_CHANNEL_PROPERTY_ID, value : *const core::ffi::c_void, valuesize : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 162:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsSetErrorProperty(error : *const WS_ERROR, id : WS_ERROR_PROPERTY_ID, value : *const core::ffi::c_void, valuesize : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 163:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsSetFaultErrorDetail(error : *const WS_ERROR, faultdetaildescription : *const WS_FAULT_DETAIL_DESCRIPTION, writeoption : WS_WRITE_OPTION, value : *const core::ffi::c_void, valuesize : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 164:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsSetFaultErrorProperty(error : *const WS_ERROR, id : WS_FAULT_ERROR_PROPERTY_ID, value : *const core::ffi::c_void, valuesize : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 165:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsSetHeader(message : *const WS_MESSAGE, headertype : WS_HEADER_TYPE, valuetype : WS_TYPE, writeoption : WS_WRITE_OPTION, value : *const core::ffi::c_void, valuesize : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 166:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsSetInput(reader : *const WS_XML_READER, encoding : *const WS_XML_READER_ENCODING, input : *const WS_XML_READER_INPUT, properties : *const WS_XML_READER_PROPERTY, propertycount : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 167:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsSetInputToBuffer(reader : *const WS_XML_READER, buffer : *const WS_XML_BUFFER, properties : *const WS_XML_READER_PROPERTY, propertycount : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 168:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsSetListenerProperty(listener : *const WS_LISTENER, id : WS_LISTENER_PROPERTY_ID, value : *const core::ffi::c_void, valuesize : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 169:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsSetMessageProperty(message : *const WS_MESSAGE, id : WS_MESSAGE_PROPERTY_ID, value : *const core::ffi::c_void, valuesize : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 170:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsSetOutput(writer : *const WS_XML_WRITER, encoding : *const WS_XML_WRITER_ENCODING, output : *const WS_XML_WRITER_OUTPUT, properties : *const WS_XML_WRITER_PROPERTY, propertycount : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 171:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsSetOutputToBuffer(writer : *const WS_XML_WRITER, buffer : *const WS_XML_BUFFER, properties : *const WS_XML_WRITER_PROPERTY, propertycount : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 172:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsSetReaderPosition(reader : *const WS_XML_READER, nodeposition : *const WS_XML_NODE_POSITION, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 173:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsSetWriterPosition(writer : *const WS_XML_WRITER, nodeposition : *const WS_XML_NODE_POSITION, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 174:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsShutdownSessionChannel(channel : *const WS_CHANNEL, asynccontext : *const WS_ASYNC_CONTEXT, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 175:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsSkipNode(reader : *const WS_XML_READER, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 176:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsStartReaderCanonicalization(reader : *const WS_XML_READER, writecallback : WS_WRITE_CALLBACK, writecallbackstate : *const core::ffi::c_void, properties : *const WS_XML_CANONICALIZATION_PROPERTY, propertycount : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 177:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsStartWriterCanonicalization(writer : *const WS_XML_WRITER, writecallback : WS_WRITE_CALLBACK, writecallbackstate : *const core::ffi::c_void, properties : *const WS_XML_CANONICALIZATION_PROPERTY, propertycount : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 178:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsTrimXmlWhitespace(chars : windows_sys::core::PCWSTR, charcount : u32, trimmedchars : *mut *mut u16, trimmedcount : *mut u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 179:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsVerifyXmlNCName(ncnamechars : windows_sys::core::PCWSTR, ncnamecharcount : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 180:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsWriteArray(writer : *const WS_XML_WRITER, localname : *const WS_XML_STRING, ns : *const WS_XML_STRING, valuetype : WS_VALUE_TYPE, array : *const core::ffi::c_void, arraysize : u32, itemoffset : u32, itemcount : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 181:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsWriteAttribute(writer : *const WS_XML_WRITER, attributedescription : *const WS_ATTRIBUTE_DESCRIPTION, writeoption : WS_WRITE_OPTION, value : *const core::ffi::c_void, valuesize : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 182:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsWriteBody(message : *const WS_MESSAGE, bodydescription : *const WS_ELEMENT_DESCRIPTION, writeoption : WS_WRITE_OPTION, value : *const core::ffi::c_void, valuesize : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 183:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsWriteBytes(writer : *const WS_XML_WRITER, bytes : *const core::ffi::c_void, bytecount : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 184:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsWriteChars(writer : *const WS_XML_WRITER, chars : windows_sys::core::PCWSTR, charcount : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 185:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsWriteCharsUtf8(writer : *const WS_XML_WRITER, bytes : *const u8, bytecount : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 186:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsWriteElement(writer : *const WS_XML_WRITER, elementdescription : *const WS_ELEMENT_DESCRIPTION, writeoption : WS_WRITE_OPTION, value : *const core::ffi::c_void, valuesize : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 187:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsWriteEndAttribute(writer : *const WS_XML_WRITER, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 188:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsWriteEndCData(writer : *const WS_XML_WRITER, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 189:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsWriteEndElement(writer : *const WS_XML_WRITER, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 190:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsWriteEndStartElement(writer : *const WS_XML_WRITER, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 191:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsWriteEnvelopeEnd(message : *const WS_MESSAGE, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 192:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsWriteEnvelopeStart(message : *const WS_MESSAGE, writer : *const WS_XML_WRITER, donecallback : WS_MESSAGE_DONE_CALLBACK, donecallbackstate : *const core::ffi::c_void, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 193:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsWriteMessageEnd(channel : *const WS_CHANNEL, message : *const WS_MESSAGE, asynccontext : *const WS_ASYNC_CONTEXT, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 194:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsWriteMessageStart(channel : *const WS_CHANNEL, message : *const WS_MESSAGE, asynccontext : *const WS_ASYNC_CONTEXT, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 195:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsWriteNode(writer : *const WS_XML_WRITER, node : *const WS_XML_NODE, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 196:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsWriteQualifiedName(writer : *const WS_XML_WRITER, prefix : *const WS_XML_STRING, localname : *const WS_XML_STRING, ns : *const WS_XML_STRING, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 197:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsWriteStartAttribute(writer : *const WS_XML_WRITER, prefix : *const WS_XML_STRING, localname : *const WS_XML_STRING, ns : *const WS_XML_STRING, singlequote : windows_sys::core::BOOL, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 198:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsWriteStartCData(writer : *const WS_XML_WRITER, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 199:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsWriteStartElement(writer : *const WS_XML_WRITER, prefix : *const WS_XML_STRING, localname : *const WS_XML_STRING, ns : *const WS_XML_STRING, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 200:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsWriteText(writer : *const WS_XML_WRITER, text : *const WS_XML_TEXT, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 201:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsWriteType(writer : *const WS_XML_WRITER, typemapping : WS_TYPE_MAPPING, r#type : WS_TYPE, typedescription : *const core::ffi::c_void, writeoption : WS_WRITE_OPTION, value : *const core::ffi::c_void, valuesize : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 202:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsWriteValue(writer : *const WS_XML_WRITER, valuetype : WS_VALUE_TYPE, value : *const core::ffi::c_void, valuesize : u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 203:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsWriteXmlBuffer(writer : *const WS_XML_WRITER, xmlbuffer : *const WS_XML_BUFFER, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 204:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsWriteXmlBufferToBytes(writer : *const WS_XML_WRITER, xmlbuffer : *const WS_XML_BUFFER, encoding : *const WS_XML_WRITER_ENCODING, properties : *const WS_XML_WRITER_PROPERTY, propertycount : u32, heap : *const WS_HEAP, bytes : *mut *mut core::ffi::c_void, bytecount : *mut u32, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 205:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsWriteXmlnsAttribute(writer : *const WS_XML_WRITER, prefix : *const WS_XML_STRING, ns : *const WS_XML_STRING, singlequote : windows_sys::core::BOOL, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 206:1: declaration Macro has no candidate rule
// windows_link::link!("webservices.dll" "system" fn WsXmlStringEquals(string1 : *const WS_XML_STRING, string2 : *const WS_XML_STRING, error : *const WS_ERROR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 207:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CTAPCBOR_HYBRID_STORAGE_LINKED_DATA {
//     pub dwVersion: u32,
//     pub cbContactId: u32,
//     pub pbContactId: *mut u8,
//     pub cbLinkId: u32,
//     pub pbLinkId: *mut u8,
//     pub cbLinkSecret: u32,
//     pub pbLinkSecret: *mut u8,
//     pub cbPublicKey: u32,
//     pub pbPublicKey: *mut u8,
//     pub pwszAuthenticatorName: windows_sys::core::PCWSTR,
//     pub wEncodedTunnelServerDomain: u16,
// }

// UNSUPPORTED Rust 222:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 237:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WEBAUTHN_ASSERTION {
//     pub dwVersion: u32,
//     pub cbAuthenticatorData: u32,
//     pub pbAuthenticatorData: *mut u8,
//     pub cbSignature: u32,
//     pub pbSignature: *mut u8,
//     pub Credential: WEBAUTHN_CREDENTIAL,
//     pub cbUserId: u32,
//     pub pbUserId: *mut u8,
//     pub Extensions: WEBAUTHN_EXTENSIONS,
//     pub cbCredLargeBlob: u32,
//     pub pbCredLargeBlob: *mut u8,
//     pub dwCredLargeBlobStatus: u32,
//     pub pHmacSecret: *mut WEBAUTHN_HMAC_SECRET_SALT,
//     pub dwUsedTransport: u32,
//     pub cbUnsignedExtensionOutputs: u32,
//     pub pbUnsignedExtensionOutputs: *mut u8,
// }

// UNSUPPORTED Rust 257:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 274:1: non-scalar type Ptr unsupported
// pub const WEBAUTHN_ATTESTATION_TYPE_NONE: windows_sys::core::PCWSTR = windows_sys::core::w!("none");

// UNSUPPORTED Rust 275:1: non-scalar type Ptr unsupported
// pub const WEBAUTHN_ATTESTATION_TYPE_PACKED: windows_sys::core::PCWSTR = windows_sys::core::w!("packed");

// UNSUPPORTED Rust 276:1: non-scalar type Ptr unsupported
// pub const WEBAUTHN_ATTESTATION_TYPE_TPM: windows_sys::core::PCWSTR = windows_sys::core::w!("tpm");

// UNSUPPORTED Rust 277:1: non-scalar type Ptr unsupported
// pub const WEBAUTHN_ATTESTATION_TYPE_U2F: windows_sys::core::PCWSTR = windows_sys::core::w!("fido-u2f");

// UNSUPPORTED Rust 278:1: non-scalar type Ptr unsupported
// pub const WEBAUTHN_ATTESTATION_VER_TPM_2_0: windows_sys::core::PCWSTR = windows_sys::core::w!("2.0");

public const val `WEBAUTHN_AUTHENTICATOR_ATTACHMENT_ANY`: UInt = 0u;
public const val `WEBAUTHN_AUTHENTICATOR_ATTACHMENT_CROSS_PLATFORM`: UInt = 2u;
public const val `WEBAUTHN_AUTHENTICATOR_ATTACHMENT_CROSS_PLATFORM_U2F_V2`: UInt = 3u;
public const val `WEBAUTHN_AUTHENTICATOR_ATTACHMENT_PLATFORM`: UInt = 1u;
// UNSUPPORTED Rust 283:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WEBAUTHN_AUTHENTICATOR_GET_ASSERTION_OPTIONS {
//     pub dwVersion: u32,
//     pub dwTimeoutMilliseconds: u32,
//     pub CredentialList: WEBAUTHN_CREDENTIALS,
//     pub Extensions: WEBAUTHN_EXTENSIONS,
//     pub dwAuthenticatorAttachment: u32,
//     pub dwUserVerificationRequirement: u32,
//     pub dwFlags: u32,
//     pub pwszU2fAppId: windows_sys::core::PCWSTR,
//     pub pbU2fAppId: *mut windows_sys::core::BOOL,
//     pub pCancellationId: *mut windows_sys::core::GUID,
//     pub pAllowCredentialList: *mut WEBAUTHN_CREDENTIAL_LIST,
//     pub dwCredLargeBlobOperation: u32,
//     pub cbCredLargeBlob: u32,
//     pub pbCredLargeBlob: *mut u8,
//     pub pHmacSecretSaltValues: *mut WEBAUTHN_HMAC_SECRET_SALT_VALUES,
//     pub bBrowserInPrivateMode: windows_sys::core::BOOL,
//     pub pLinkedDevice: *mut CTAPCBOR_HYBRID_STORAGE_LINKED_DATA,
//     pub bAutoFill: windows_sys::core::BOOL,
//     pub cbJsonExt: u32,
//     pub pbJsonExt: *mut u8,
// }

// UNSUPPORTED Rust 307:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 321:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WEBAUTHN_AUTHENTICATOR_MAKE_CREDENTIAL_OPTIONS {
//     pub dwVersion: u32,
//     pub dwTimeoutMilliseconds: u32,
//     pub CredentialList: WEBAUTHN_CREDENTIALS,
//     pub Extensions: WEBAUTHN_EXTENSIONS,
//     pub dwAuthenticatorAttachment: u32,
//     pub bRequireResidentKey: windows_sys::core::BOOL,
//     pub dwUserVerificationRequirement: u32,
//     pub dwAttestationConveyancePreference: u32,
//     pub dwFlags: u32,
//     pub pCancellationId: *mut windows_sys::core::GUID,
//     pub pExcludeCredentialList: *mut WEBAUTHN_CREDENTIAL_LIST,
//     pub dwEnterpriseAttestation: u32,
//     pub dwLargeBlobSupport: u32,
//     pub bPreferResidentKey: windows_sys::core::BOOL,
//     pub bBrowserInPrivateMode: windows_sys::core::BOOL,
//     pub bEnablePrf: windows_sys::core::BOOL,
//     pub pLinkedDevice: *mut CTAPCBOR_HYBRID_STORAGE_LINKED_DATA,
//     pub cbJsonExt: u32,
//     pub pbJsonExt: *mut u8,
// }

// UNSUPPORTED Rust 344:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 357:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WEBAUTHN_CLIENT_DATA {
//     pub dwVersion: u32,
//     pub cbClientDataJSON: u32,
//     pub pbClientDataJSON: *mut u8,
//     pub pwszHashAlgId: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 365:1: declaration Impl has no candidate rule
// impl Default for WEBAUTHN_CLIENT_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WEBAUTHN_CLIENT_DATA_CURRENT_VERSION`: UInt = 1u;
// UNSUPPORTED Rust 371:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WEBAUTHN_COMMON_ATTESTATION {
//     pub dwVersion: u32,
//     pub pwszAlg: windows_sys::core::PCWSTR,
//     pub lAlg: i32,
//     pub cbSignature: u32,
//     pub pbSignature: *mut u8,
//     pub cX5c: u32,
//     pub pX5c: *mut WEBAUTHN_X5C,
//     pub pwszVer: windows_sys::core::PCWSTR,
//     pub cbCertInfo: u32,
//     pub pbCertInfo: *mut u8,
//     pub cbPubArea: u32,
//     pub pbPubArea: *mut u8,
// }

// UNSUPPORTED Rust 387:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 402:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WEBAUTHN_COSE_CREDENTIAL_PARAMETER {
//     pub dwVersion: u32,
//     pub pwszCredentialType: windows_sys::core::PCWSTR,
//     pub lAlg: i32,
// }

// UNSUPPORTED Rust 409:1: declaration Impl has no candidate rule
// impl Default for WEBAUTHN_COSE_CREDENTIAL_PARAMETER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 414:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WEBAUTHN_COSE_CREDENTIAL_PARAMETERS {
//     pub cCredentialParameters: u32,
//     pub pCredentialParameters: *mut WEBAUTHN_COSE_CREDENTIAL_PARAMETER,
// }

// UNSUPPORTED Rust 420:1: declaration Impl has no candidate rule
// impl Default for WEBAUTHN_COSE_CREDENTIAL_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WEBAUTHN_COSE_CREDENTIAL_PARAMETER_CURRENT_VERSION`: UInt = 1u;
// UNSUPPORTED Rust 426:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WEBAUTHN_CREDENTIAL {
//     pub dwVersion: u32,
//     pub cbId: u32,
//     pub pbId: *mut u8,
//     pub pwszCredentialType: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 434:1: declaration Impl has no candidate rule
// impl Default for WEBAUTHN_CREDENTIAL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 439:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WEBAUTHN_CREDENTIALS {
//     pub cCredentials: u32,
//     pub pCredentials: *mut WEBAUTHN_CREDENTIAL,
// }

// UNSUPPORTED Rust 445:1: declaration Impl has no candidate rule
// impl Default for WEBAUTHN_CREDENTIALS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 450:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WEBAUTHN_CREDENTIAL_ATTESTATION {
//     pub dwVersion: u32,
//     pub pwszFormatType: windows_sys::core::PCWSTR,
//     pub cbAuthenticatorData: u32,
//     pub pbAuthenticatorData: *mut u8,
//     pub cbAttestation: u32,
//     pub pbAttestation: *mut u8,
//     pub dwAttestationDecodeType: u32,
//     pub pvAttestationDecode: *mut core::ffi::c_void,
//     pub cbAttestationObject: u32,
//     pub pbAttestationObject: *mut u8,
//     pub cbCredentialId: u32,
//     pub pbCredentialId: *mut u8,
//     pub Extensions: WEBAUTHN_EXTENSIONS,
//     pub dwUsedTransport: u32,
//     pub bEpAtt: windows_sys::core::BOOL,
//     pub bLargeBlobSupported: windows_sys::core::BOOL,
//     pub bResidentKey: windows_sys::core::BOOL,
//     pub bPrfEnabled: windows_sys::core::BOOL,
//     pub cbUnsignedExtensionOutputs: u32,
//     pub pbUnsignedExtensionOutputs: *mut u8,
// }

// UNSUPPORTED Rust 474:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 487:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WEBAUTHN_CREDENTIAL_DETAILS {
//     pub dwVersion: u32,
//     pub cbCredentialID: u32,
//     pub pbCredentialID: *mut u8,
//     pub pRpInformation: *mut WEBAUTHN_RP_ENTITY_INFORMATION,
//     pub pUserInformation: *mut WEBAUTHN_USER_ENTITY_INFORMATION,
//     pub bRemovable: windows_sys::core::BOOL,
//     pub bBackedUp: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 498:1: declaration Impl has no candidate rule
// impl Default for WEBAUTHN_CREDENTIAL_DETAILS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WEBAUTHN_CREDENTIAL_DETAILS_CURRENT_VERSION`: UInt = 2u;
// UNSUPPORTED Rust 504:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WEBAUTHN_CREDENTIAL_DETAILS_LIST {
//     pub cCredentialDetails: u32,
//     pub ppCredentialDetails: *mut *mut WEBAUTHN_CREDENTIAL_DETAILS,
// }

// UNSUPPORTED Rust 510:1: declaration Impl has no candidate rule
// impl Default for WEBAUTHN_CREDENTIAL_DETAILS_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WEBAUTHN_CREDENTIAL_DETAILS_VERSION_1`: UInt = 1u;
public const val `WEBAUTHN_CREDENTIAL_DETAILS_VERSION_2`: UInt = 2u;
// UNSUPPORTED Rust 517:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WEBAUTHN_CREDENTIAL_EX {
//     pub dwVersion: u32,
//     pub cbId: u32,
//     pub pbId: *mut u8,
//     pub pwszCredentialType: windows_sys::core::PCWSTR,
//     pub dwTransports: u32,
// }

// UNSUPPORTED Rust 526:1: declaration Impl has no candidate rule
// impl Default for WEBAUTHN_CREDENTIAL_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WEBAUTHN_CREDENTIAL_EX_CURRENT_VERSION`: UInt = 1u;
// UNSUPPORTED Rust 532:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WEBAUTHN_CREDENTIAL_LIST {
//     pub cCredentials: u32,
//     pub ppCredentials: *mut *mut WEBAUTHN_CREDENTIAL_EX,
// }

// UNSUPPORTED Rust 538:1: declaration Impl has no candidate rule
// impl Default for WEBAUTHN_CREDENTIAL_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 543:1: non-scalar type Ptr unsupported
// pub const WEBAUTHN_CREDENTIAL_TYPE_PUBLIC_KEY: windows_sys::core::PCWSTR = windows_sys::core::w!("public-key");

// UNSUPPORTED Rust 544:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WEBAUTHN_CRED_BLOB_EXTENSION {
//     pub cbCredBlob: u32,
//     pub pbCredBlob: *mut u8,
// }

// UNSUPPORTED Rust 550:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 569:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WEBAUTHN_CRED_PROTECT_EXTENSION_IN {
//     pub dwCredProtect: u32,
//     pub bRequireCredProtect: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 575:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WEBAUTHN_CRED_WITH_HMAC_SECRET_SALT {
//     pub cbCredID: u32,
//     pub pbCredID: *mut u8,
//     pub pHmacSecretSalt: *mut WEBAUTHN_HMAC_SECRET_SALT,
// }

// UNSUPPORTED Rust 582:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 598:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WEBAUTHN_EXTENSION {
//     pub pwszExtensionIdentifier: windows_sys::core::PCWSTR,
//     pub cbExtension: u32,
//     pub pvExtension: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 605:1: declaration Impl has no candidate rule
// impl Default for WEBAUTHN_EXTENSION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 610:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WEBAUTHN_EXTENSIONS {
//     pub cExtensions: u32,
//     pub pExtensions: *mut WEBAUTHN_EXTENSION,
// }

// UNSUPPORTED Rust 616:1: declaration Impl has no candidate rule
// impl Default for WEBAUTHN_EXTENSIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 621:1: non-scalar type Ptr unsupported
// pub const WEBAUTHN_EXTENSIONS_IDENTIFIER_CRED_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("credBlob");

// UNSUPPORTED Rust 622:1: non-scalar type Ptr unsupported
// pub const WEBAUTHN_EXTENSIONS_IDENTIFIER_CRED_PROTECT: windows_sys::core::PCWSTR = windows_sys::core::w!("credProtect");

// UNSUPPORTED Rust 623:1: non-scalar type Ptr unsupported
// pub const WEBAUTHN_EXTENSIONS_IDENTIFIER_HMAC_SECRET: windows_sys::core::PCWSTR = windows_sys::core::w!("hmac-secret");

// UNSUPPORTED Rust 624:1: non-scalar type Ptr unsupported
// pub const WEBAUTHN_EXTENSIONS_IDENTIFIER_MIN_PIN_LENGTH: windows_sys::core::PCWSTR = windows_sys::core::w!("minPinLength");

// UNSUPPORTED Rust 625:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WEBAUTHN_GET_CREDENTIALS_OPTIONS {
//     pub dwVersion: u32,
//     pub pwszRpId: windows_sys::core::PCWSTR,
//     pub bBrowserInPrivateMode: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 632:1: declaration Impl has no candidate rule
// impl Default for WEBAUTHN_GET_CREDENTIALS_OPTIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WEBAUTHN_GET_CREDENTIALS_OPTIONS_CURRENT_VERSION`: UInt = 1u;
public const val `WEBAUTHN_GET_CREDENTIALS_OPTIONS_VERSION_1`: UInt = 1u;
// UNSUPPORTED Rust 639:1: non-scalar type Ptr unsupported
// pub const WEBAUTHN_HASH_ALGORITHM_SHA_256: windows_sys::core::PCWSTR = windows_sys::core::w!("SHA-256");

// UNSUPPORTED Rust 640:1: non-scalar type Ptr unsupported
// pub const WEBAUTHN_HASH_ALGORITHM_SHA_384: windows_sys::core::PCWSTR = windows_sys::core::w!("SHA-384");

// UNSUPPORTED Rust 641:1: non-scalar type Ptr unsupported
// pub const WEBAUTHN_HASH_ALGORITHM_SHA_512: windows_sys::core::PCWSTR = windows_sys::core::w!("SHA-512");

// UNSUPPORTED Rust 642:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WEBAUTHN_HMAC_SECRET_SALT {
//     pub cbFirst: u32,
//     pub pbFirst: *mut u8,
//     pub cbSecond: u32,
//     pub pbSecond: *mut u8,
// }

// UNSUPPORTED Rust 650:1: declaration Impl has no candidate rule
// impl Default for WEBAUTHN_HMAC_SECRET_SALT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 655:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WEBAUTHN_HMAC_SECRET_SALT_VALUES {
//     pub pGlobalHmacSalt: *mut WEBAUTHN_HMAC_SECRET_SALT,
//     pub cCredWithHmacSecretSaltList: u32,
//     pub pCredWithHmacSecretSaltList: *mut WEBAUTHN_CRED_WITH_HMAC_SECRET_SALT,
// }

// UNSUPPORTED Rust 662:1: declaration Impl has no candidate rule
// impl Default for WEBAUTHN_HMAC_SECRET_SALT_VALUES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WEBAUTHN_LARGE_BLOB_SUPPORT_NONE`: UInt = 0u;
public const val `WEBAUTHN_LARGE_BLOB_SUPPORT_PREFERRED`: UInt = 2u;
public const val `WEBAUTHN_LARGE_BLOB_SUPPORT_REQUIRED`: UInt = 1u;
public const val `WEBAUTHN_MAX_USER_ID_LENGTH`: UInt = 64u;
// UNSUPPORTED Rust 671:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WEBAUTHN_RP_ENTITY_INFORMATION {
//     pub dwVersion: u32,
//     pub pwszId: windows_sys::core::PCWSTR,
//     pub pwszName: windows_sys::core::PCWSTR,
//     pub pwszIcon: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 679:1: declaration Impl has no candidate rule
// impl Default for WEBAUTHN_RP_ENTITY_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WEBAUTHN_RP_ENTITY_INFORMATION_CURRENT_VERSION`: UInt = 1u;
// UNSUPPORTED Rust 685:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WEBAUTHN_USER_ENTITY_INFORMATION {
//     pub dwVersion: u32,
//     pub cbId: u32,
//     pub pbId: *mut u8,
//     pub pwszName: windows_sys::core::PCWSTR,
//     pub pwszIcon: windows_sys::core::PCWSTR,
//     pub pwszDisplayName: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 695:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 709:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WEBAUTHN_X5C {
//     pub cbData: u32,
//     pub pbData: *mut u8,
// }

// UNSUPPORTED Rust 715:1: declaration Impl has no candidate rule
// impl Default for WEBAUTHN_X5C {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 720:1: generic scalar type unsupported
// pub type WS_ABANDON_MESSAGE_CALLBACK = Option<unsafe extern "system" fn(channelinstance: *const core::ffi::c_void, message: *const WS_MESSAGE, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 721:1: generic scalar type unsupported
// pub type WS_ABORT_CHANNEL_CALLBACK = Option<unsafe extern "system" fn(channelinstance: *const core::ffi::c_void, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 722:1: generic scalar type unsupported
// pub type WS_ABORT_LISTENER_CALLBACK = Option<unsafe extern "system" fn(listenerinstance: *const core::ffi::c_void, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 723:1: generic scalar type unsupported
// pub type WS_ACCEPT_CHANNEL_CALLBACK = Option<unsafe extern "system" fn(listenerinstance: *const core::ffi::c_void, channelinstance: *const core::ffi::c_void, asynccontext: *const WS_ASYNC_CONTEXT, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

public const val `WS_ACTION_HEADER`: `WS_HEADER_TYPE` = 1;
public typealias `WS_ADDRESSING_VERSION` = Int;
public const val `WS_ADDRESSING_VERSION_0_9`: `WS_ADDRESSING_VERSION` = 1;
public const val `WS_ADDRESSING_VERSION_1_0`: `WS_ADDRESSING_VERSION` = 2;
public const val `WS_ADDRESSING_VERSION_TRANSPORT`: `WS_ADDRESSING_VERSION` = 3;
// UNSUPPORTED Rust 729:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_ANY_ATTRIBUTE {
//     pub localName: WS_XML_STRING,
//     pub ns: WS_XML_STRING,
//     pub value: *mut WS_XML_TEXT,
// }

// UNSUPPORTED Rust 736:1: declaration Impl has no candidate rule
// impl Default for WS_ANY_ATTRIBUTE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 741:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_ANY_ATTRIBUTES {
//     pub attributes: *mut WS_ANY_ATTRIBUTE,
//     pub attributeCount: u32,
// }

// UNSUPPORTED Rust 747:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 757:1: generic scalar type unsupported
// pub type WS_ASYNC_CALLBACK = Option<unsafe extern "system" fn(errorcode: windows_sys::core::HRESULT, callbackmodel: WS_CALLBACK_MODEL, callbackstate: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 758:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_ASYNC_CONTEXT {
//     pub callback: WS_ASYNC_CALLBACK,
//     pub callbackState: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 764:1: declaration Impl has no candidate rule
// impl Default for WS_ASYNC_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 769:1: generic scalar type unsupported
// pub type WS_ASYNC_FUNCTION = Option<unsafe extern "system" fn(hr: windows_sys::core::HRESULT, callbackmodel: WS_CALLBACK_MODEL, callbackstate: *const core::ffi::c_void, next: *mut WS_ASYNC_OPERATION, asynccontext: *const WS_ASYNC_CONTEXT, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 770:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_ASYNC_OPERATION {
//     pub function: WS_ASYNC_FUNCTION,
// }

// UNSUPPORTED Rust 775:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_ASYNC_STATE {
//     pub internal0: *mut core::ffi::c_void,
//     pub internal1: *mut core::ffi::c_void,
//     pub internal2: *mut core::ffi::c_void,
//     pub internal3: *mut core::ffi::c_void,
//     pub internal4: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 784:1: declaration Impl has no candidate rule
// impl Default for WS_ASYNC_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 789:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_ATTRIBUTE_DESCRIPTION {
//     pub attributeLocalName: *mut WS_XML_STRING,
//     pub attributeNs: *mut WS_XML_STRING,
//     pub r#type: WS_TYPE,
//     pub typeDescription: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 797:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 807:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_BOOL_DESCRIPTION {
//     pub value: windows_sys::core::BOOL,
// }

public const val `WS_BOOL_TYPE`: `WS_TYPE` = 0;
public const val `WS_BOOL_VALUE_TYPE`: `WS_VALUE_TYPE` = 0;
public const val `WS_BUFFERED_TRANSFER_MODE`: `WS_TRANSFER_MODE` = 0;
// UNSUPPORTED Rust 815:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_BUFFERS {
//     pub bufferCount: u32,
//     pub buffers: *mut WS_BYTES,
// }

// UNSUPPORTED Rust 821:1: declaration Impl has no candidate rule
// impl Default for WS_BUFFERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 826:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_BYTES {
//     pub length: u32,
//     pub bytes: *mut u8,
// }

// UNSUPPORTED Rust 832:1: declaration Impl has no candidate rule
// impl Default for WS_BYTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 837:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_BYTES_DESCRIPTION {
//     pub minByteCount: u32,
//     pub maxByteCount: u32,
// }

public const val `WS_BYTES_TYPE`: `WS_TYPE` = 18;
// UNSUPPORTED Rust 844:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_BYTE_ARRAY_DESCRIPTION {
//     pub minByteCount: u32,
//     pub maxByteCount: u32,
// }

public const val `WS_BYTE_ARRAY_TYPE`: `WS_TYPE` = 24;
public typealias `WS_CALLBACK_MODEL` = Int;
// UNSUPPORTED Rust 852:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_CALL_PROPERTY {
//     pub id: WS_CALL_PROPERTY_ID,
//     pub value: *mut core::ffi::c_void,
//     pub valueSize: u32,
// }

// UNSUPPORTED Rust 859:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 869:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_CAPI_ASYMMETRIC_SECURITY_KEY_HANDLE {
//     pub keyHandle: WS_SECURITY_KEY_HANDLE,
//     pub provider: usize,
//     pub keySpec: u32,
// }

public const val `WS_CAPI_ASYMMETRIC_SECURITY_KEY_HANDLE_TYPE`: `WS_SECURITY_KEY_HANDLE_TYPE` = 3;
// UNSUPPORTED Rust 877:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Cryptography")]
// pub type WS_CERTIFICATE_VALIDATION_CALLBACK = Option<unsafe extern "system" fn(certcontext: *const super::super::Security::Cryptography::CERT_CONTEXT, state: *const core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 879:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct WS_CERTIFICATE_VALIDATION_CALLBACK_CONTEXT {
//     pub callback: WS_CERTIFICATE_VALIDATION_CALLBACK,
//     pub state: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 886:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for WS_CERTIFICATE_VALIDATION_CALLBACK_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 892:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_CERT_CREDENTIAL {
//     pub credentialType: WS_CERT_CREDENTIAL_TYPE,
// }

public typealias `WS_CERT_CREDENTIAL_TYPE` = Int;
// UNSUPPORTED Rust 898:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_CERT_ENDPOINT_IDENTITY {
//     pub identity: WS_ENDPOINT_IDENTITY,
//     pub rawCertificateData: WS_BYTES,
// }

public const val `WS_CERT_ENDPOINT_IDENTITY_TYPE`: `WS_ENDPOINT_IDENTITY_TYPE` = 5;
public const val `WS_CERT_FAILURE_CN_MISMATCH`: Int = 1;
public const val `WS_CERT_FAILURE_INVALID_DATE`: Int = 2;
public const val `WS_CERT_FAILURE_REVOCATION_OFFLINE`: Int = 16;
public const val `WS_CERT_FAILURE_UNTRUSTED_ROOT`: Int = 4;
public const val `WS_CERT_FAILURE_WRONG_USAGE`: Int = 8;
// UNSUPPORTED Rust 910:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_Security_Authentication_Identity", feature = "Win32_Security_Cryptography"))]
// pub type WS_CERT_ISSUER_LIST_NOTIFICATION_CALLBACK = Option<unsafe extern "system" fn(certissuerlistnotificationcallbackstate: *const core::ffi::c_void, issuerlist: *const super::super::Security::Authentication::Identity::SecPkgContext_IssuerListInfoEx, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 912:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_CERT_MESSAGE_SECURITY_BINDING_CONSTRAINT {
//     pub bindingConstraint: WS_SECURITY_BINDING_CONSTRAINT,
//     pub bindingUsage: WS_MESSAGE_SECURITY_USAGE,
// }

public const val `WS_CERT_MESSAGE_SECURITY_BINDING_CONSTRAINT_TYPE`: `WS_SECURITY_BINDING_CONSTRAINT_TYPE` = 7;
// UNSUPPORTED Rust 919:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct WS_CERT_SIGNED_SAML_AUTHENTICATOR {
//     pub authenticator: WS_SAML_AUTHENTICATOR,
//     pub trustedIssuerCerts: *const *const super::super::Security::Cryptography::CERT_CONTEXT,
//     pub trustedIssuerCertCount: u32,
//     pub decryptionCert: *const super::super::Security::Cryptography::CERT_CONTEXT,
//     pub samlValidator: WS_VALIDATE_SAML_CALLBACK,
//     pub samlValidatorCallbackState: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 930:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for WS_CERT_SIGNED_SAML_AUTHENTICATOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_CERT_SIGNED_SAML_AUTHENTICATOR_TYPE`: `WS_SAML_AUTHENTICATOR_TYPE` = 1;
public typealias `WS_CHANNEL` = Long;
public typealias `WS_CHANNEL_BINDING` = Int;
// UNSUPPORTED Rust 939:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_CHANNEL_DECODER {
//     pub createContext: *mut core::ffi::c_void,
//     pub createDecoderCallback: WS_CREATE_DECODER_CALLBACK,
//     pub decoderGetContentTypeCallback: WS_DECODER_GET_CONTENT_TYPE_CALLBACK,
//     pub decoderStartCallback: WS_DECODER_START_CALLBACK,
//     pub decoderDecodeCallback: WS_DECODER_DECODE_CALLBACK,
//     pub decoderEndCallback: WS_DECODER_END_CALLBACK,
//     pub freeDecoderCallback: WS_FREE_DECODER_CALLBACK,
// }

// UNSUPPORTED Rust 950:1: declaration Impl has no candidate rule
// impl Default for WS_CHANNEL_DECODER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 955:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_CHANNEL_ENCODER {
//     pub createContext: *mut core::ffi::c_void,
//     pub createEncoderCallback: WS_CREATE_ENCODER_CALLBACK,
//     pub encoderGetContentTypeCallback: WS_ENCODER_GET_CONTENT_TYPE_CALLBACK,
//     pub encoderStartCallback: WS_ENCODER_START_CALLBACK,
//     pub encoderEncodeCallback: WS_ENCODER_ENCODE_CALLBACK,
//     pub encoderEndCallback: WS_ENCODER_END_CALLBACK,
//     pub freeEncoderCallback: WS_FREE_ENCODER_CALLBACK,
// }

// UNSUPPORTED Rust 966:1: declaration Impl has no candidate rule
// impl Default for WS_CHANNEL_ENCODER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 971:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_CHANNEL_PROPERTIES {
//     pub properties: *mut WS_CHANNEL_PROPERTY,
//     pub propertyCount: u32,
// }

// UNSUPPORTED Rust 977:1: declaration Impl has no candidate rule
// impl Default for WS_CHANNEL_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 982:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_CHANNEL_PROPERTY {
//     pub id: WS_CHANNEL_PROPERTY_ID,
//     pub value: *mut core::ffi::c_void,
//     pub valueSize: u32,
// }

// UNSUPPORTED Rust 989:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 1000:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_CHANNEL_PROPERTY_CONSTRAINT {
//     pub id: WS_CHANNEL_PROPERTY_ID,
//     pub allowedValues: *mut core::ffi::c_void,
//     pub allowedValuesSize: u32,
//     pub out: WS_CHANNEL_PROPERTY_CONSTRAINT_0,
// }

// UNSUPPORTED Rust 1008:1: declaration Impl has no candidate rule
// impl Default for WS_CHANNEL_PROPERTY_CONSTRAINT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1013:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_CHANNEL_PROPERTY_CONSTRAINT_0 {
//     pub channelProperty: WS_CHANNEL_PROPERTY,
// }

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
// UNSUPPORTED Rust 1086:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_CHAR_ARRAY_DESCRIPTION {
//     pub minCharCount: u32,
//     pub maxCharCount: u32,
// }

public const val `WS_CHAR_ARRAY_TYPE`: `WS_TYPE` = 22;
// UNSUPPORTED Rust 1093:1: generic scalar type unsupported
// pub type WS_CLOSE_CHANNEL_CALLBACK = Option<unsafe extern "system" fn(channelinstance: *const core::ffi::c_void, asynccontext: *const WS_ASYNC_CONTEXT, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1094:1: generic scalar type unsupported
// pub type WS_CLOSE_LISTENER_CALLBACK = Option<unsafe extern "system" fn(listenerinstance: *const core::ffi::c_void, asynccontext: *const WS_ASYNC_CONTEXT, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1095:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_CONTRACT_DESCRIPTION {
//     pub operationCount: u32,
//     pub operations: *mut *mut WS_OPERATION_DESCRIPTION,
// }

// UNSUPPORTED Rust 1101:1: declaration Impl has no candidate rule
// impl Default for WS_CONTRACT_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WS_COOKIE_MODE` = Int;
// UNSUPPORTED Rust 1107:1: generic scalar type unsupported
// pub type WS_CREATE_CHANNEL_CALLBACK = Option<unsafe extern "system" fn(channeltype: WS_CHANNEL_TYPE, channelparameters: *const core::ffi::c_void, channelparameterssize: u32, channelinstance: *mut *mut core::ffi::c_void, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1108:1: generic scalar type unsupported
// pub type WS_CREATE_CHANNEL_FOR_LISTENER_CALLBACK = Option<unsafe extern "system" fn(listenerinstance: *const core::ffi::c_void, channelparameters: *const core::ffi::c_void, channelparameterssize: u32, channelinstance: *mut *mut core::ffi::c_void, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1109:1: generic scalar type unsupported
// pub type WS_CREATE_DECODER_CALLBACK = Option<unsafe extern "system" fn(createcontext: *const core::ffi::c_void, readcallback: WS_READ_CALLBACK, readcontext: *const core::ffi::c_void, decodercontext: *mut *mut core::ffi::c_void, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1110:1: generic scalar type unsupported
// pub type WS_CREATE_ENCODER_CALLBACK = Option<unsafe extern "system" fn(createcontext: *const core::ffi::c_void, writecallback: WS_WRITE_CALLBACK, writecontext: *const core::ffi::c_void, encodercontext: *mut *mut core::ffi::c_void, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1111:1: generic scalar type unsupported
// pub type WS_CREATE_LISTENER_CALLBACK = Option<unsafe extern "system" fn(channeltype: WS_CHANNEL_TYPE, listenerparameters: *const core::ffi::c_void, listenerparameterssize: u32, listenerinstance: *mut *mut core::ffi::c_void, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1112:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Security_Authentication_Identity", feature = "Win32_Security_Cryptography"))]
// #[derive(Clone, Copy)]
// pub struct WS_CUSTOM_CERT_CREDENTIAL {
//     pub credential: WS_CERT_CREDENTIAL,
//     pub getCertCallback: WS_GET_CERT_CALLBACK,
//     pub getCertCallbackState: *mut core::ffi::c_void,
//     pub certIssuerListNotificationCallback: WS_CERT_ISSUER_LIST_NOTIFICATION_CALLBACK,
//     pub certIssuerListNotificationCallbackState: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1122:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Security_Authentication_Identity", feature = "Win32_Security_Cryptography"))]
// impl Default for WS_CUSTOM_CERT_CREDENTIAL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_CUSTOM_CERT_CREDENTIAL_TYPE`: `WS_CERT_CREDENTIAL_TYPE` = 3;
public const val `WS_CUSTOM_CHANNEL_BINDING`: `WS_CHANNEL_BINDING` = 3;
// UNSUPPORTED Rust 1130:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_CUSTOM_CHANNEL_CALLBACKS {
//     pub createChannelCallback: WS_CREATE_CHANNEL_CALLBACK,
//     pub freeChannelCallback: WS_FREE_CHANNEL_CALLBACK,
//     pub resetChannelCallback: WS_RESET_CHANNEL_CALLBACK,
//     pub openChannelCallback: WS_OPEN_CHANNEL_CALLBACK,
//     pub closeChannelCallback: WS_CLOSE_CHANNEL_CALLBACK,
//     pub abortChannelCallback: WS_ABORT_CHANNEL_CALLBACK,
//     pub getChannelPropertyCallback: WS_GET_CHANNEL_PROPERTY_CALLBACK,
//     pub setChannelPropertyCallback: WS_SET_CHANNEL_PROPERTY_CALLBACK,
//     pub writeMessageStartCallback: WS_WRITE_MESSAGE_START_CALLBACK,
//     pub writeMessageEndCallback: WS_WRITE_MESSAGE_END_CALLBACK,
//     pub readMessageStartCallback: WS_READ_MESSAGE_START_CALLBACK,
//     pub readMessageEndCallback: WS_READ_MESSAGE_END_CALLBACK,
//     pub abandonMessageCallback: WS_ABANDON_MESSAGE_CALLBACK,
//     pub shutdownSessionChannelCallback: WS_SHUTDOWN_SESSION_CHANNEL_CALLBACK,
// }

// UNSUPPORTED Rust 1148:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_CUSTOM_HTTP_PROXY {
//     pub servers: WS_STRING,
//     pub bypass: WS_STRING,
// }

// UNSUPPORTED Rust 1154:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_CUSTOM_LISTENER_CALLBACKS {
//     pub createListenerCallback: WS_CREATE_LISTENER_CALLBACK,
//     pub freeListenerCallback: WS_FREE_LISTENER_CALLBACK,
//     pub resetListenerCallback: WS_RESET_LISTENER_CALLBACK,
//     pub openListenerCallback: WS_OPEN_LISTENER_CALLBACK,
//     pub closeListenerCallback: WS_CLOSE_LISTENER_CALLBACK,
//     pub abortListenerCallback: WS_ABORT_LISTENER_CALLBACK,
//     pub getListenerPropertyCallback: WS_GET_LISTENER_PROPERTY_CALLBACK,
//     pub setListenerPropertyCallback: WS_SET_LISTENER_PROPERTY_CALLBACK,
//     pub createChannelForListenerCallback: WS_CREATE_CHANNEL_FOR_LISTENER_CALLBACK,
//     pub acceptChannelCallback: WS_ACCEPT_CHANNEL_CALLBACK,
// }

public const val `WS_CUSTOM_TYPE`: `WS_TYPE` = 27;
// UNSUPPORTED Rust 1169:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_CUSTOM_TYPE_DESCRIPTION {
//     pub size: u32,
//     pub alignment: u32,
//     pub readCallback: WS_READ_TYPE_CALLBACK,
//     pub writeCallback: WS_WRITE_TYPE_CALLBACK,
//     pub descriptionData: *mut core::ffi::c_void,
//     pub isDefaultValueCallback: WS_IS_DEFAULT_VALUE_CALLBACK,
// }

// UNSUPPORTED Rust 1179:1: declaration Impl has no candidate rule
// impl Default for WS_CUSTOM_TYPE_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1184:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_DATETIME {
//     pub ticks: u64,
//     pub format: WS_DATETIME_FORMAT,
// }

// UNSUPPORTED Rust 1190:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_DATETIME_DESCRIPTION {
//     pub minValue: WS_DATETIME,
//     pub maxValue: WS_DATETIME,
// }

public typealias `WS_DATETIME_FORMAT` = Int;
public const val `WS_DATETIME_FORMAT_LOCAL`: `WS_DATETIME_FORMAT` = 1;
public const val `WS_DATETIME_FORMAT_NONE`: `WS_DATETIME_FORMAT` = 2;
public const val `WS_DATETIME_FORMAT_UTC`: `WS_DATETIME_FORMAT` = 0;
public const val `WS_DATETIME_TYPE`: `WS_TYPE` = 12;
public const val `WS_DATETIME_VALUE_TYPE`: `WS_VALUE_TYPE` = 12;
// UNSUPPORTED Rust 1202:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_DECIMAL_DESCRIPTION {
//     pub minValue: super::super::Foundation::DECIMAL,
//     pub maxValue: super::super::Foundation::DECIMAL,
// }

// UNSUPPORTED Rust 1208:1: declaration Impl has no candidate rule
// impl Default for WS_DECIMAL_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_DECIMAL_TYPE`: `WS_TYPE` = 11;
public const val `WS_DECIMAL_VALUE_TYPE`: `WS_VALUE_TYPE` = 11;
// UNSUPPORTED Rust 1215:1: generic scalar type unsupported
// pub type WS_DECODER_DECODE_CALLBACK = Option<unsafe extern "system" fn(encodercontext: *const core::ffi::c_void, buffer: *mut core::ffi::c_void, maxlength: u32, length: *mut u32, asynccontext: *const WS_ASYNC_CONTEXT, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1216:1: generic scalar type unsupported
// pub type WS_DECODER_END_CALLBACK = Option<unsafe extern "system" fn(encodercontext: *const core::ffi::c_void, asynccontext: *const WS_ASYNC_CONTEXT, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1217:1: generic scalar type unsupported
// pub type WS_DECODER_GET_CONTENT_TYPE_CALLBACK = Option<unsafe extern "system" fn(decodercontext: *const core::ffi::c_void, contenttype: *const WS_STRING, contentencoding: *const WS_STRING, newcontenttype: *mut WS_STRING, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1218:1: generic scalar type unsupported
// pub type WS_DECODER_START_CALLBACK = Option<unsafe extern "system" fn(encodercontext: *const core::ffi::c_void, asynccontext: *const WS_ASYNC_CONTEXT, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1219:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_DEFAULT_VALUE {
//     pub value: *mut core::ffi::c_void,
//     pub valueSize: u32,
// }

// UNSUPPORTED Rust 1225:1: declaration Impl has no candidate rule
// impl Default for WS_DEFAULT_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1230:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_DEFAULT_WINDOWS_INTEGRATED_AUTH_CREDENTIAL {
//     pub credential: WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL,
// }

public const val `WS_DEFAULT_WINDOWS_INTEGRATED_AUTH_CREDENTIAL_TYPE`: `WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL_TYPE` = 2;
public const val `WS_DESCRIPTION_TYPE`: `WS_TYPE` = 25;
// UNSUPPORTED Rust 1237:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_DISALLOWED_USER_AGENT_SUBSTRINGS {
//     pub subStringCount: u32,
//     pub subStrings: *mut *mut WS_STRING,
// }

// UNSUPPORTED Rust 1243:1: declaration Impl has no candidate rule
// impl Default for WS_DISALLOWED_USER_AGENT_SUBSTRINGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1248:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_DNS_ENDPOINT_IDENTITY {
//     pub identity: WS_ENDPOINT_IDENTITY,
//     pub dns: WS_STRING,
// }

public const val `WS_DNS_ENDPOINT_IDENTITY_TYPE`: `WS_ENDPOINT_IDENTITY_TYPE` = 1;
// UNSUPPORTED Rust 1255:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_DOUBLE_DESCRIPTION {
//     pub minValue: f64,
//     pub maxValue: f64,
// }

public const val `WS_DOUBLE_TYPE`: `WS_TYPE` = 10;
public const val `WS_DOUBLE_VALUE_TYPE`: `WS_VALUE_TYPE` = 10;
public const val `WS_DUPLICATE_MESSAGE`: `WS_MESSAGE_INITIALIZATION` = 1;
// UNSUPPORTED Rust 1264:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_DURATION {
//     pub negative: windows_sys::core::BOOL,
//     pub years: u32,
//     pub months: u32,
//     pub days: u32,
//     pub hours: u32,
//     pub minutes: u32,
//     pub seconds: u32,
//     pub milliseconds: u32,
//     pub ticks: u32,
// }

// UNSUPPORTED Rust 1277:1: generic scalar type unsupported
// pub type WS_DURATION_COMPARISON_CALLBACK = Option<unsafe extern "system" fn(duration1: *const WS_DURATION, duration2: *const WS_DURATION, result: *mut i32, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1278:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_DURATION_DESCRIPTION {
//     pub minValue: WS_DURATION,
//     pub maxValue: WS_DURATION,
//     pub comparer: WS_DURATION_COMPARISON_CALLBACK,
// }

public const val `WS_DURATION_TYPE`: `WS_TYPE` = 32;
public const val `WS_DURATION_VALUE_TYPE`: `WS_VALUE_TYPE` = 15;
// UNSUPPORTED Rust 1287:1: generic scalar type unsupported
// pub type WS_DYNAMIC_STRING_CALLBACK = Option<unsafe extern "system" fn(callbackstate: *const core::ffi::c_void, string: *const WS_XML_STRING, found: *mut windows_sys::core::BOOL, id: *mut u32, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

public const val `WS_ELEMENT_CHOICE_FIELD_MAPPING`: `WS_FIELD_MAPPING` = 7;
public const val `WS_ELEMENT_CONTENT_TYPE_MAPPING`: `WS_TYPE_MAPPING` = 3;
// UNSUPPORTED Rust 1290:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_ELEMENT_DESCRIPTION {
//     pub elementLocalName: *mut WS_XML_STRING,
//     pub elementNs: *mut WS_XML_STRING,
//     pub r#type: WS_TYPE,
//     pub typeDescription: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1298:1: declaration Impl has no candidate rule
// impl Default for WS_ELEMENT_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_ELEMENT_FIELD_MAPPING`: `WS_FIELD_MAPPING` = 2;
public const val `WS_ELEMENT_TYPE_MAPPING`: `WS_TYPE_MAPPING` = 1;
// UNSUPPORTED Rust 1305:1: generic scalar type unsupported
// pub type WS_ENCODER_ENCODE_CALLBACK = Option<unsafe extern "system" fn(encodercontext: *const core::ffi::c_void, buffers: *const WS_BYTES, count: u32, asynccontext: *const WS_ASYNC_CONTEXT, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1306:1: generic scalar type unsupported
// pub type WS_ENCODER_END_CALLBACK = Option<unsafe extern "system" fn(encodercontext: *const core::ffi::c_void, asynccontext: *const WS_ASYNC_CONTEXT, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1307:1: generic scalar type unsupported
// pub type WS_ENCODER_GET_CONTENT_TYPE_CALLBACK = Option<unsafe extern "system" fn(encodercontext: *const core::ffi::c_void, contenttype: *const WS_STRING, newcontenttype: *mut WS_STRING, contentencoding: *mut WS_STRING, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1308:1: generic scalar type unsupported
// pub type WS_ENCODER_START_CALLBACK = Option<unsafe extern "system" fn(encodercontext: *const core::ffi::c_void, asynccontext: *const WS_ASYNC_CONTEXT, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

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
// UNSUPPORTED Rust 1319:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_ENDPOINT_ADDRESS {
//     pub url: WS_STRING,
//     pub headers: *mut WS_XML_BUFFER,
//     pub extensions: *mut WS_XML_BUFFER,
//     pub identity: *mut WS_ENDPOINT_IDENTITY,
// }

// UNSUPPORTED Rust 1327:1: declaration Impl has no candidate rule
// impl Default for WS_ENDPOINT_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1332:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_ENDPOINT_ADDRESS_DESCRIPTION {
//     pub addressingVersion: WS_ADDRESSING_VERSION,
// }

public const val `WS_ENDPOINT_ADDRESS_EXTENSION_METADATA_ADDRESS`: `WS_ENDPOINT_ADDRESS_EXTENSION_TYPE` = 1;
public typealias `WS_ENDPOINT_ADDRESS_EXTENSION_TYPE` = Int;
public const val `WS_ENDPOINT_ADDRESS_TYPE`: `WS_TYPE` = 28;
// UNSUPPORTED Rust 1340:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_ENDPOINT_IDENTITY {
//     pub identityType: WS_ENDPOINT_IDENTITY_TYPE,
// }

public typealias `WS_ENDPOINT_IDENTITY_TYPE` = Int;
// UNSUPPORTED Rust 1346:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_ENDPOINT_POLICY_EXTENSION {
//     pub policyExtension: WS_POLICY_EXTENSION,
//     pub assertionName: *mut WS_XML_STRING,
//     pub assertionNs: *mut WS_XML_STRING,
//     pub out: WS_ENDPOINT_POLICY_EXTENSION_0,
// }

// UNSUPPORTED Rust 1354:1: declaration Impl has no candidate rule
// impl Default for WS_ENDPOINT_POLICY_EXTENSION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1359:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_ENDPOINT_POLICY_EXTENSION_0 {
//     pub assertionValue: *mut WS_XML_BUFFER,
// }

// UNSUPPORTED Rust 1364:1: declaration Impl has no candidate rule
// impl Default for WS_ENDPOINT_POLICY_EXTENSION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_ENDPOINT_POLICY_EXTENSION_TYPE`: `WS_POLICY_EXTENSION_TYPE` = 1;
// UNSUPPORTED Rust 1370:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_ENUM_DESCRIPTION {
//     pub values: *mut WS_ENUM_VALUE,
//     pub valueCount: u32,
//     pub maxByteCount: u32,
//     pub nameIndices: *mut u32,
// }

// UNSUPPORTED Rust 1378:1: declaration Impl has no candidate rule
// impl Default for WS_ENUM_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_ENUM_TYPE`: `WS_TYPE` = 31;
// UNSUPPORTED Rust 1384:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_ENUM_VALUE {
//     pub value: i32,
//     pub name: *mut WS_XML_STRING,
// }

// UNSUPPORTED Rust 1390:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 1400:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_ERROR_PROPERTY {
//     pub id: WS_ERROR_PROPERTY_ID,
//     pub value: *mut core::ffi::c_void,
//     pub valueSize: u32,
// }

// UNSUPPORTED Rust 1407:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 1428:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_FAULT {
//     pub code: *mut WS_FAULT_CODE,
//     pub reasons: *mut WS_FAULT_REASON,
//     pub reasonCount: u32,
//     pub actor: WS_STRING,
//     pub node: WS_STRING,
//     pub detail: *mut WS_XML_BUFFER,
// }

// UNSUPPORTED Rust 1438:1: declaration Impl has no candidate rule
// impl Default for WS_FAULT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1443:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_FAULT_CODE {
//     pub value: WS_XML_QNAME,
//     pub subCode: *mut WS_FAULT_CODE,
// }

// UNSUPPORTED Rust 1449:1: declaration Impl has no candidate rule
// impl Default for WS_FAULT_CODE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1454:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_FAULT_DESCRIPTION {
//     pub envelopeVersion: WS_ENVELOPE_VERSION,
// }

// UNSUPPORTED Rust 1459:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_FAULT_DETAIL_DESCRIPTION {
//     pub action: *mut WS_XML_STRING,
//     pub detailElementDescription: *mut WS_ELEMENT_DESCRIPTION,
// }

// UNSUPPORTED Rust 1465:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 1476:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_FAULT_REASON {
//     pub text: WS_STRING,
//     pub lang: WS_STRING,
// }

public const val `WS_FAULT_TO_HEADER`: `WS_HEADER_TYPE` = 7;
public const val `WS_FAULT_TYPE`: `WS_TYPE` = 29;
// UNSUPPORTED Rust 1484:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_FIELD_DESCRIPTION {
//     pub mapping: WS_FIELD_MAPPING,
//     pub localName: *mut WS_XML_STRING,
//     pub ns: *mut WS_XML_STRING,
//     pub r#type: WS_TYPE,
//     pub typeDescription: *mut core::ffi::c_void,
//     pub offset: u32,
//     pub options: u32,
//     pub defaultValue: *mut WS_DEFAULT_VALUE,
//     pub countOffset: u32,
//     pub itemLocalName: *mut WS_XML_STRING,
//     pub itemNs: *mut WS_XML_STRING,
//     pub itemRange: *mut WS_ITEM_RANGE,
// }

// UNSUPPORTED Rust 1500:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 1511:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_FLOAT_DESCRIPTION {
//     pub minValue: f32,
//     pub maxValue: f32,
// }

public const val `WS_FLOAT_TYPE`: `WS_TYPE` = 9;
public const val `WS_FLOAT_VALUE_TYPE`: `WS_VALUE_TYPE` = 9;
// UNSUPPORTED Rust 1519:1: generic scalar type unsupported
// pub type WS_FREE_CHANNEL_CALLBACK = Option<unsafe extern "system" fn(channelinstance: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 1520:1: generic scalar type unsupported
// pub type WS_FREE_DECODER_CALLBACK = Option<unsafe extern "system" fn(decodercontext: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 1521:1: generic scalar type unsupported
// pub type WS_FREE_ENCODER_CALLBACK = Option<unsafe extern "system" fn(encodercontext: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 1522:1: generic scalar type unsupported
// pub type WS_FREE_LISTENER_CALLBACK = Option<unsafe extern "system" fn(listenerinstance: *const core::ffi::c_void)>;

public const val `WS_FROM_HEADER`: `WS_HEADER_TYPE` = 5;
public const val `WS_FULL_FAULT_DISCLOSURE`: `WS_FAULT_DISCLOSURE` = 1;
// UNSUPPORTED Rust 1525:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Cryptography")]
// pub type WS_GET_CERT_CALLBACK = Option<unsafe extern "system" fn(getcertcallbackstate: *const core::ffi::c_void, targetaddress: *const WS_ENDPOINT_ADDRESS, viauri: *const WS_STRING, cert: *mut *mut super::super::Security::Cryptography::CERT_CONTEXT, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1527:1: generic scalar type unsupported
// pub type WS_GET_CHANNEL_PROPERTY_CALLBACK = Option<unsafe extern "system" fn(channelinstance: *const core::ffi::c_void, id: WS_CHANNEL_PROPERTY_ID, value: *mut core::ffi::c_void, valuesize: u32, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1528:1: generic scalar type unsupported
// pub type WS_GET_LISTENER_PROPERTY_CALLBACK = Option<unsafe extern "system" fn(listenerinstance: *const core::ffi::c_void, id: WS_LISTENER_PROPERTY_ID, value: *mut core::ffi::c_void, valuesize: u32, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1529:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_GUID_DESCRIPTION {
//     pub value: windows_sys::core::GUID,
// }

public const val `WS_GUID_TYPE`: `WS_TYPE` = 14;
public const val `WS_GUID_VALUE_TYPE`: `WS_VALUE_TYPE` = 14;
public typealias `WS_HEADER_TYPE` = Int;
public typealias `WS_HEAP` = Long;
// UNSUPPORTED Rust 1538:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_HEAP_PROPERTIES {
//     pub properties: *mut WS_HEAP_PROPERTY,
//     pub propertyCount: u32,
// }

// UNSUPPORTED Rust 1544:1: declaration Impl has no candidate rule
// impl Default for WS_HEAP_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1549:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_HEAP_PROPERTY {
//     pub id: WS_HEAP_PROPERTY_ID,
//     pub value: *mut core::ffi::c_void,
//     pub valueSize: u32,
// }

// UNSUPPORTED Rust 1556:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 1566:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_HOST_NAMES {
//     pub hostNames: *mut WS_STRING,
//     pub hostNameCount: u32,
// }

// UNSUPPORTED Rust 1572:1: declaration Impl has no candidate rule
// impl Default for WS_HOST_NAMES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1577:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_HTTPS_URL {
//     pub url: WS_URL,
//     pub host: WS_STRING,
//     pub port: u16,
//     pub portAsString: WS_STRING,
//     pub path: WS_STRING,
//     pub query: WS_STRING,
//     pub fragment: WS_STRING,
// }

// UNSUPPORTED Rust 1588:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_HTTP_BINDING_TEMPLATE {
//     pub channelProperties: WS_CHANNEL_PROPERTIES,
// }

public const val `WS_HTTP_BINDING_TEMPLATE_TYPE`: `WS_BINDING_TEMPLATE_TYPE` = 0;
public const val `WS_HTTP_CHANNEL_BINDING`: `WS_CHANNEL_BINDING` = 0;
// UNSUPPORTED Rust 1595:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_HTTP_HEADER_AUTH_BINDING_TEMPLATE {
//     pub channelProperties: WS_CHANNEL_PROPERTIES,
//     pub securityProperties: WS_SECURITY_PROPERTIES,
//     pub httpHeaderAuthSecurityBinding: WS_HTTP_HEADER_AUTH_SECURITY_BINDING_TEMPLATE,
// }

public const val `WS_HTTP_HEADER_AUTH_BINDING_TEMPLATE_TYPE`: `WS_BINDING_TEMPLATE_TYPE` = 2;
// UNSUPPORTED Rust 1603:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_HTTP_HEADER_AUTH_POLICY_DESCRIPTION {
//     pub channelProperties: WS_CHANNEL_PROPERTIES,
//     pub securityProperties: WS_SECURITY_PROPERTIES,
//     pub httpHeaderAuthSecurityBinding: WS_HTTP_HEADER_AUTH_SECURITY_BINDING_POLICY_DESCRIPTION,
// }

public const val `WS_HTTP_HEADER_AUTH_SCHEME_BASIC`: Int = 2;
public const val `WS_HTTP_HEADER_AUTH_SCHEME_DIGEST`: Int = 4;
public const val `WS_HTTP_HEADER_AUTH_SCHEME_NEGOTIATE`: Int = 16;
public const val `WS_HTTP_HEADER_AUTH_SCHEME_NONE`: Int = 1;
public const val `WS_HTTP_HEADER_AUTH_SCHEME_NTLM`: Int = 8;
public const val `WS_HTTP_HEADER_AUTH_SCHEME_PASSPORT`: Int = 32;
// UNSUPPORTED Rust 1616:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_HTTP_HEADER_AUTH_SECURITY_BINDING {
//     pub binding: WS_SECURITY_BINDING,
//     pub clientCredential: *mut WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL,
// }

// UNSUPPORTED Rust 1622:1: declaration Impl has no candidate rule
// impl Default for WS_HTTP_HEADER_AUTH_SECURITY_BINDING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1627:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_HTTP_HEADER_AUTH_SECURITY_BINDING_CONSTRAINT {
//     pub bindingConstraint: WS_SECURITY_BINDING_CONSTRAINT,
// }

public const val `WS_HTTP_HEADER_AUTH_SECURITY_BINDING_CONSTRAINT_TYPE`: `WS_SECURITY_BINDING_CONSTRAINT_TYPE` = 3;
// UNSUPPORTED Rust 1633:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_HTTP_HEADER_AUTH_SECURITY_BINDING_POLICY_DESCRIPTION {
//     pub securityBindingProperties: WS_SECURITY_BINDING_PROPERTIES,
// }

// UNSUPPORTED Rust 1638:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_HTTP_HEADER_AUTH_SECURITY_BINDING_TEMPLATE {
//     pub securityBindingProperties: WS_SECURITY_BINDING_PROPERTIES,
//     pub clientCredential: *mut WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL,
// }

// UNSUPPORTED Rust 1644:1: declaration Impl has no candidate rule
// impl Default for WS_HTTP_HEADER_AUTH_SECURITY_BINDING_TEMPLATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_HTTP_HEADER_AUTH_SECURITY_BINDING_TYPE`: `WS_SECURITY_BINDING_TYPE` = 3;
public typealias `WS_HTTP_HEADER_AUTH_TARGET` = Int;
public const val `WS_HTTP_HEADER_AUTH_TARGET_PROXY`: `WS_HTTP_HEADER_AUTH_TARGET` = 2;
public const val `WS_HTTP_HEADER_AUTH_TARGET_SERVICE`: `WS_HTTP_HEADER_AUTH_TARGET` = 1;
// UNSUPPORTED Rust 1653:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_HTTP_HEADER_MAPPING {
//     pub headerName: WS_XML_STRING,
//     pub headerMappingOptions: u32,
// }

public const val `WS_HTTP_HEADER_MAPPING_COMMA_SEPARATOR`: Int = 1;
public const val `WS_HTTP_HEADER_MAPPING_QUOTED_VALUE`: Int = 4;
public const val `WS_HTTP_HEADER_MAPPING_SEMICOLON_SEPARATOR`: Int = 2;
// UNSUPPORTED Rust 1662:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_HTTP_MESSAGE_MAPPING {
//     pub requestMappingOptions: u32,
//     pub responseMappingOptions: u32,
//     pub requestHeaderMappings: *mut *mut WS_HTTP_HEADER_MAPPING,
//     pub requestHeaderMappingCount: u32,
//     pub responseHeaderMappings: *mut *mut WS_HTTP_HEADER_MAPPING,
//     pub responseHeaderMappingCount: u32,
// }

// UNSUPPORTED Rust 1672:1: declaration Impl has no candidate rule
// impl Default for WS_HTTP_MESSAGE_MAPPING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1677:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_HTTP_POLICY_DESCRIPTION {
//     pub channelProperties: WS_CHANNEL_PROPERTIES,
// }

public typealias `WS_HTTP_PROXY_SETTING_MODE` = Int;
public const val `WS_HTTP_PROXY_SETTING_MODE_AUTO`: `WS_HTTP_PROXY_SETTING_MODE` = 1;
public const val `WS_HTTP_PROXY_SETTING_MODE_CUSTOM`: `WS_HTTP_PROXY_SETTING_MODE` = 3;
public const val `WS_HTTP_PROXY_SETTING_MODE_NONE`: `WS_HTTP_PROXY_SETTING_MODE` = 2;
// UNSUPPORTED Rust 1686:1: generic scalar type unsupported
// pub type WS_HTTP_REDIRECT_CALLBACK = Option<unsafe extern "system" fn(state: *const core::ffi::c_void, originalurl: *const WS_STRING, newurl: *const WS_STRING) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1687:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_HTTP_REDIRECT_CALLBACK_CONTEXT {
//     pub callback: WS_HTTP_REDIRECT_CALLBACK,
//     pub state: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1693:1: declaration Impl has no candidate rule
// impl Default for WS_HTTP_REDIRECT_CALLBACK_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_HTTP_REQUEST_MAPPING_VERB`: Int = 2;
public const val `WS_HTTP_RESPONSE_MAPPING_STATUS_CODE`: Int = 1;
public const val `WS_HTTP_RESPONSE_MAPPING_STATUS_TEXT`: Int = 2;
// UNSUPPORTED Rust 1701:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_HTTP_SSL_BINDING_TEMPLATE {
//     pub channelProperties: WS_CHANNEL_PROPERTIES,
//     pub securityProperties: WS_SECURITY_PROPERTIES,
//     pub sslTransportSecurityBinding: WS_SSL_TRANSPORT_SECURITY_BINDING_TEMPLATE,
// }

public const val `WS_HTTP_SSL_BINDING_TEMPLATE_TYPE`: `WS_BINDING_TEMPLATE_TYPE` = 1;
// UNSUPPORTED Rust 1709:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_HTTP_SSL_HEADER_AUTH_BINDING_TEMPLATE {
//     pub channelProperties: WS_CHANNEL_PROPERTIES,
//     pub securityProperties: WS_SECURITY_PROPERTIES,
//     pub sslTransportSecurityBinding: WS_SSL_TRANSPORT_SECURITY_BINDING_TEMPLATE,
//     pub httpHeaderAuthSecurityBinding: WS_HTTP_HEADER_AUTH_SECURITY_BINDING_TEMPLATE,
// }

public const val `WS_HTTP_SSL_HEADER_AUTH_BINDING_TEMPLATE_TYPE`: `WS_BINDING_TEMPLATE_TYPE` = 3;
// UNSUPPORTED Rust 1718:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_HTTP_SSL_HEADER_AUTH_POLICY_DESCRIPTION {
//     pub channelProperties: WS_CHANNEL_PROPERTIES,
//     pub securityProperties: WS_SECURITY_PROPERTIES,
//     pub sslTransportSecurityBinding: WS_SSL_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION,
//     pub httpHeaderAuthSecurityBinding: WS_HTTP_HEADER_AUTH_SECURITY_BINDING_POLICY_DESCRIPTION,
// }

// UNSUPPORTED Rust 1726:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_HTTP_SSL_KERBEROS_APREQ_BINDING_TEMPLATE {
//     pub channelProperties: WS_CHANNEL_PROPERTIES,
//     pub securityProperties: WS_SECURITY_PROPERTIES,
//     pub sslTransportSecurityBinding: WS_SSL_TRANSPORT_SECURITY_BINDING_TEMPLATE,
//     pub kerberosApreqMessageSecurityBinding: WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_TEMPLATE,
// }

public const val `WS_HTTP_SSL_KERBEROS_APREQ_BINDING_TEMPLATE_TYPE`: `WS_BINDING_TEMPLATE_TYPE` = 5;
// UNSUPPORTED Rust 1735:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_HTTP_SSL_KERBEROS_APREQ_POLICY_DESCRIPTION {
//     pub channelProperties: WS_CHANNEL_PROPERTIES,
//     pub securityProperties: WS_SECURITY_PROPERTIES,
//     pub sslTransportSecurityBinding: WS_SSL_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION,
//     pub kerberosApreqMessageSecurityBinding: WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION,
// }

// UNSUPPORTED Rust 1743:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_HTTP_SSL_KERBEROS_APREQ_SECURITY_CONTEXT_BINDING_TEMPLATE {
//     pub channelProperties: WS_CHANNEL_PROPERTIES,
//     pub securityProperties: WS_SECURITY_PROPERTIES,
//     pub sslTransportSecurityBinding: WS_SSL_TRANSPORT_SECURITY_BINDING_TEMPLATE,
//     pub kerberosApreqMessageSecurityBinding: WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_TEMPLATE,
//     pub securityContextSecurityBinding: WS_SECURITY_CONTEXT_SECURITY_BINDING_TEMPLATE,
// }

public const val `WS_HTTP_SSL_KERBEROS_APREQ_SECURITY_CONTEXT_BINDING_TEMPLATE_TYPE`: `WS_BINDING_TEMPLATE_TYPE` = 11;
// UNSUPPORTED Rust 1753:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_HTTP_SSL_KERBEROS_APREQ_SECURITY_CONTEXT_POLICY_DESCRIPTION {
//     pub channelProperties: WS_CHANNEL_PROPERTIES,
//     pub securityProperties: WS_SECURITY_PROPERTIES,
//     pub sslTransportSecurityBinding: WS_SSL_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION,
//     pub kerberosApreqMessageSecurityBinding: WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION,
//     pub securityContextSecurityBinding: WS_SECURITY_CONTEXT_SECURITY_BINDING_POLICY_DESCRIPTION,
// }

// UNSUPPORTED Rust 1762:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_HTTP_SSL_POLICY_DESCRIPTION {
//     pub channelProperties: WS_CHANNEL_PROPERTIES,
//     pub securityProperties: WS_SECURITY_PROPERTIES,
//     pub sslTransportSecurityBinding: WS_SSL_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION,
// }

// UNSUPPORTED Rust 1769:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_HTTP_SSL_USERNAME_BINDING_TEMPLATE {
//     pub channelProperties: WS_CHANNEL_PROPERTIES,
//     pub securityProperties: WS_SECURITY_PROPERTIES,
//     pub sslTransportSecurityBinding: WS_SSL_TRANSPORT_SECURITY_BINDING_TEMPLATE,
//     pub usernameMessageSecurityBinding: WS_USERNAME_MESSAGE_SECURITY_BINDING_TEMPLATE,
// }

public const val `WS_HTTP_SSL_USERNAME_BINDING_TEMPLATE_TYPE`: `WS_BINDING_TEMPLATE_TYPE` = 4;
// UNSUPPORTED Rust 1778:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_HTTP_SSL_USERNAME_POLICY_DESCRIPTION {
//     pub channelProperties: WS_CHANNEL_PROPERTIES,
//     pub securityProperties: WS_SECURITY_PROPERTIES,
//     pub sslTransportSecurityBinding: WS_SSL_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION,
//     pub usernameMessageSecurityBinding: WS_USERNAME_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION,
// }

// UNSUPPORTED Rust 1786:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_HTTP_SSL_USERNAME_SECURITY_CONTEXT_BINDING_TEMPLATE {
//     pub channelProperties: WS_CHANNEL_PROPERTIES,
//     pub securityProperties: WS_SECURITY_PROPERTIES,
//     pub sslTransportSecurityBinding: WS_SSL_TRANSPORT_SECURITY_BINDING_TEMPLATE,
//     pub usernameMessageSecurityBinding: WS_USERNAME_MESSAGE_SECURITY_BINDING_TEMPLATE,
//     pub securityContextSecurityBinding: WS_SECURITY_CONTEXT_SECURITY_BINDING_TEMPLATE,
// }

public const val `WS_HTTP_SSL_USERNAME_SECURITY_CONTEXT_BINDING_TEMPLATE_TYPE`: `WS_BINDING_TEMPLATE_TYPE` = 10;
// UNSUPPORTED Rust 1796:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_HTTP_SSL_USERNAME_SECURITY_CONTEXT_POLICY_DESCRIPTION {
//     pub channelProperties: WS_CHANNEL_PROPERTIES,
//     pub securityProperties: WS_SECURITY_PROPERTIES,
//     pub sslTransportSecurityBinding: WS_SSL_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION,
//     pub usernameMessageSecurityBinding: WS_USERNAME_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION,
//     pub securityContextSecurityBinding: WS_SECURITY_CONTEXT_SECURITY_BINDING_POLICY_DESCRIPTION,
// }

// UNSUPPORTED Rust 1805:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_HTTP_URL {
//     pub url: WS_URL,
//     pub host: WS_STRING,
//     pub port: u16,
//     pub portAsString: WS_STRING,
//     pub path: WS_STRING,
//     pub query: WS_STRING,
//     pub fragment: WS_STRING,
// }

public const val `WS_INCLUSIVE_WITH_COMMENTS_XML_CANONICALIZATION_ALGORITHM`: `WS_XML_CANONICALIZATION_ALGORITHM` = 3;
public const val `WS_INCLUSIVE_XML_CANONICALIZATION_ALGORITHM`: `WS_XML_CANONICALIZATION_ALGORITHM` = 2;
// UNSUPPORTED Rust 1818:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_INT16_DESCRIPTION {
//     pub minValue: i16,
//     pub maxValue: i16,
// }

public const val `WS_INT16_TYPE`: `WS_TYPE` = 2;
public const val `WS_INT16_VALUE_TYPE`: `WS_VALUE_TYPE` = 2;
// UNSUPPORTED Rust 1826:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_INT32_DESCRIPTION {
//     pub minValue: i32,
//     pub maxValue: i32,
// }

public const val `WS_INT32_TYPE`: `WS_TYPE` = 3;
public const val `WS_INT32_VALUE_TYPE`: `WS_VALUE_TYPE` = 3;
// UNSUPPORTED Rust 1834:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_INT64_DESCRIPTION {
//     pub minValue: i64,
//     pub maxValue: i64,
// }

public const val `WS_INT64_TYPE`: `WS_TYPE` = 4;
public const val `WS_INT64_VALUE_TYPE`: `WS_VALUE_TYPE` = 4;
// UNSUPPORTED Rust 1842:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_INT8_DESCRIPTION {
//     pub minValue: i8,
//     pub maxValue: i8,
// }

public const val `WS_INT8_TYPE`: `WS_TYPE` = 1;
public const val `WS_INT8_VALUE_TYPE`: `WS_VALUE_TYPE` = 1;
public typealias `WS_IP_VERSION` = Int;
public const val `WS_IP_VERSION_4`: `WS_IP_VERSION` = 1;
public const val `WS_IP_VERSION_6`: `WS_IP_VERSION` = 2;
public const val `WS_IP_VERSION_AUTO`: `WS_IP_VERSION` = 3;
// UNSUPPORTED Rust 1854:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_ISSUED_TOKEN_MESSAGE_SECURITY_BINDING_CONSTRAINT {
//     pub bindingConstraint: WS_SECURITY_BINDING_CONSTRAINT,
//     pub bindingUsage: WS_MESSAGE_SECURITY_USAGE,
//     pub claimConstraints: *mut WS_XML_STRING,
//     pub claimConstraintCount: u32,
//     pub requestSecurityTokenPropertyConstraints: *mut WS_REQUEST_SECURITY_TOKEN_PROPERTY_CONSTRAINT,
//     pub requestSecurityTokenPropertyConstraintCount: u32,
//     pub out: WS_ISSUED_TOKEN_MESSAGE_SECURITY_BINDING_CONSTRAINT_0,
// }

// UNSUPPORTED Rust 1865:1: declaration Impl has no candidate rule
// impl Default for WS_ISSUED_TOKEN_MESSAGE_SECURITY_BINDING_CONSTRAINT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1870:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_ISSUED_TOKEN_MESSAGE_SECURITY_BINDING_CONSTRAINT_0 {
//     pub issuerAddress: *mut WS_ENDPOINT_ADDRESS,
//     pub requestSecurityTokenTemplate: *mut WS_XML_BUFFER,
// }

// UNSUPPORTED Rust 1876:1: declaration Impl has no candidate rule
// impl Default for WS_ISSUED_TOKEN_MESSAGE_SECURITY_BINDING_CONSTRAINT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_ISSUED_TOKEN_MESSAGE_SECURITY_BINDING_CONSTRAINT_TYPE`: `WS_SECURITY_BINDING_CONSTRAINT_TYPE` = 6;
// UNSUPPORTED Rust 1882:1: generic scalar type unsupported
// pub type WS_IS_DEFAULT_VALUE_CALLBACK = Option<unsafe extern "system" fn(descriptiondata: *const core::ffi::c_void, value: *const core::ffi::c_void, defaultvalue: *const core::ffi::c_void, valuesize: u32, isdefault: *mut windows_sys::core::BOOL, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1883:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_ITEM_RANGE {
//     pub minItemCount: u32,
//     pub maxItemCount: u32,
// }

// UNSUPPORTED Rust 1889:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING {
//     pub binding: WS_SECURITY_BINDING,
//     pub bindingUsage: WS_MESSAGE_SECURITY_USAGE,
//     pub clientCredential: *mut WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL,
// }

// UNSUPPORTED Rust 1896:1: declaration Impl has no candidate rule
// impl Default for WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1901:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_CONSTRAINT {
//     pub bindingConstraint: WS_SECURITY_BINDING_CONSTRAINT,
//     pub bindingUsage: WS_MESSAGE_SECURITY_USAGE,
// }

public const val `WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_CONSTRAINT_TYPE`: `WS_SECURITY_BINDING_CONSTRAINT_TYPE` = 5;
// UNSUPPORTED Rust 1908:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION {
//     pub securityBindingProperties: WS_SECURITY_BINDING_PROPERTIES,
//     pub bindingUsage: WS_MESSAGE_SECURITY_USAGE,
// }

// UNSUPPORTED Rust 1914:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_TEMPLATE {
//     pub securityBindingProperties: WS_SECURITY_BINDING_PROPERTIES,
//     pub clientCredential: *mut WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL,
// }

// UNSUPPORTED Rust 1920:1: declaration Impl has no candidate rule
// impl Default for WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_TEMPLATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_TYPE`: `WS_SECURITY_BINDING_TYPE` = 5;
public typealias `WS_LISTENER` = Long;
// UNSUPPORTED Rust 1927:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_LISTENER_PROPERTIES {
//     pub properties: *mut WS_LISTENER_PROPERTY,
//     pub propertyCount: u32,
// }

// UNSUPPORTED Rust 1933:1: declaration Impl has no candidate rule
// impl Default for WS_LISTENER_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1938:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_LISTENER_PROPERTY {
//     pub id: WS_LISTENER_PROPERTY_ID,
//     pub value: *mut core::ffi::c_void,
//     pub valueSize: u32,
// }

// UNSUPPORTED Rust 1945:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 1988:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_MESSAGE_DESCRIPTION {
//     pub action: *mut WS_XML_STRING,
//     pub bodyElementDescription: *mut WS_ELEMENT_DESCRIPTION,
// }

// UNSUPPORTED Rust 1994:1: declaration Impl has no candidate rule
// impl Default for WS_MESSAGE_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1999:1: generic scalar type unsupported
// pub type WS_MESSAGE_DONE_CALLBACK = Option<unsafe extern "system" fn(donecallbackstate: *const core::ffi::c_void)>;

public const val `WS_MESSAGE_ID_HEADER`: `WS_HEADER_TYPE` = 3;
public typealias `WS_MESSAGE_INITIALIZATION` = Int;
// UNSUPPORTED Rust 2002:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_MESSAGE_PROPERTIES {
//     pub properties: *mut WS_MESSAGE_PROPERTY,
//     pub propertyCount: u32,
// }

// UNSUPPORTED Rust 2008:1: declaration Impl has no candidate rule
// impl Default for WS_MESSAGE_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2013:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_MESSAGE_PROPERTY {
//     pub id: WS_MESSAGE_PROPERTY_ID,
//     pub value: *mut core::ffi::c_void,
//     pub valueSize: u32,
// }

// UNSUPPORTED Rust 2020:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 2056:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_METADATA_ENDPOINT {
//     pub endpointAddress: WS_ENDPOINT_ADDRESS,
//     pub endpointPolicy: *mut WS_POLICY,
//     pub portName: *mut WS_XML_STRING,
//     pub serviceName: *mut WS_XML_STRING,
//     pub serviceNs: *mut WS_XML_STRING,
//     pub bindingName: *mut WS_XML_STRING,
//     pub bindingNs: *mut WS_XML_STRING,
//     pub portTypeName: *mut WS_XML_STRING,
//     pub portTypeNs: *mut WS_XML_STRING,
// }

// UNSUPPORTED Rust 2069:1: declaration Impl has no candidate rule
// impl Default for WS_METADATA_ENDPOINT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2074:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_METADATA_ENDPOINTS {
//     pub endpoints: *mut WS_METADATA_ENDPOINT,
//     pub endpointCount: u32,
// }

// UNSUPPORTED Rust 2080:1: declaration Impl has no candidate rule
// impl Default for WS_METADATA_ENDPOINTS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WS_METADATA_EXCHANGE_TYPE` = Int;
public const val `WS_METADATA_EXCHANGE_TYPE_HTTP_GET`: `WS_METADATA_EXCHANGE_TYPE` = 2;
public const val `WS_METADATA_EXCHANGE_TYPE_MEX`: `WS_METADATA_EXCHANGE_TYPE` = 1;
public const val `WS_METADATA_EXCHANGE_TYPE_NONE`: `WS_METADATA_EXCHANGE_TYPE` = 0;
// UNSUPPORTED Rust 2089:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_METADATA_PROPERTY {
//     pub id: WS_METADATA_PROPERTY_ID,
//     pub value: *mut core::ffi::c_void,
//     pub valueSize: u32,
// }

// UNSUPPORTED Rust 2096:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 2129:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_NAMEDPIPE_SSPI_TRANSPORT_SECURITY_BINDING {
//     pub binding: WS_SECURITY_BINDING,
//     pub clientCredential: *mut WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL,
// }

// UNSUPPORTED Rust 2135:1: declaration Impl has no candidate rule
// impl Default for WS_NAMEDPIPE_SSPI_TRANSPORT_SECURITY_BINDING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_NAMEDPIPE_SSPI_TRANSPORT_SECURITY_BINDING_TYPE`: `WS_SECURITY_BINDING_TYPE` = 9;
// UNSUPPORTED Rust 2141:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy, Default)]
// pub struct WS_NCRYPT_ASYMMETRIC_SECURITY_KEY_HANDLE {
//     pub keyHandle: WS_SECURITY_KEY_HANDLE,
//     pub asymmetricKey: super::super::Security::Cryptography::NCRYPT_KEY_HANDLE,
// }

public const val `WS_NCRYPT_ASYMMETRIC_SECURITY_KEY_HANDLE_TYPE`: `WS_SECURITY_KEY_HANDLE_TYPE` = 2;
// UNSUPPORTED Rust 2149:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_NETPIPE_URL {
//     pub url: WS_URL,
//     pub host: WS_STRING,
//     pub port: u16,
//     pub portAsString: WS_STRING,
//     pub path: WS_STRING,
//     pub query: WS_STRING,
//     pub fragment: WS_STRING,
// }

// UNSUPPORTED Rust 2160:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_NETTCP_URL {
//     pub url: WS_URL,
//     pub host: WS_STRING,
//     pub port: u16,
//     pub portAsString: WS_STRING,
//     pub path: WS_STRING,
//     pub query: WS_STRING,
//     pub fragment: WS_STRING,
// }

public const val `WS_NON_RPC_LITERAL_OPERATION`: `WS_OPERATION_STYLE` = 0;
public const val `WS_NO_FIELD_MAPPING`: `WS_FIELD_MAPPING` = 5;
// UNSUPPORTED Rust 2173:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_OPAQUE_WINDOWS_INTEGRATED_AUTH_CREDENTIAL {
//     pub credential: WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL,
//     pub opaqueAuthIdentity: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 2179:1: declaration Impl has no candidate rule
// impl Default for WS_OPAQUE_WINDOWS_INTEGRATED_AUTH_CREDENTIAL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_OPAQUE_WINDOWS_INTEGRATED_AUTH_CREDENTIAL_TYPE`: `WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL_TYPE` = 3;
// UNSUPPORTED Rust 2185:1: generic scalar type unsupported
// pub type WS_OPEN_CHANNEL_CALLBACK = Option<unsafe extern "system" fn(channelinstance: *const core::ffi::c_void, endpointaddress: *const WS_ENDPOINT_ADDRESS, asynccontext: *const WS_ASYNC_CONTEXT, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 2186:1: generic scalar type unsupported
// pub type WS_OPEN_LISTENER_CALLBACK = Option<unsafe extern "system" fn(listenerinstance: *const core::ffi::c_void, url: *const WS_STRING, asynccontext: *const WS_ASYNC_CONTEXT, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 2187:1: generic scalar type unsupported
// pub type WS_OPERATION_CANCEL_CALLBACK = Option<unsafe extern "system" fn(reason: WS_SERVICE_CANCEL_REASON, state: *const core::ffi::c_void)>;

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
// UNSUPPORTED Rust 2199:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_OPERATION_DESCRIPTION {
//     pub versionInfo: u32,
//     pub inputMessageDescription: *mut WS_MESSAGE_DESCRIPTION,
//     pub outputMessageDescription: *mut WS_MESSAGE_DESCRIPTION,
//     pub inputMessageOptions: u32,
//     pub outputMessageOptions: u32,
//     pub parameterCount: u16,
//     pub parameterDescription: *mut WS_PARAMETER_DESCRIPTION,
//     pub stubCallback: WS_SERVICE_STUB_CALLBACK,
//     pub style: WS_OPERATION_STYLE,
// }

// UNSUPPORTED Rust 2212:1: declaration Impl has no candidate rule
// impl Default for WS_OPERATION_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2217:1: generic scalar type unsupported
// pub type WS_OPERATION_FREE_STATE_CALLBACK = Option<unsafe extern "system" fn(state: *const core::ffi::c_void)>;

public typealias `WS_OPERATION_STYLE` = Int;
// UNSUPPORTED Rust 2219:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_PARAMETER_DESCRIPTION {
//     pub parameterType: WS_PARAMETER_TYPE,
//     pub inputMessageIndex: u16,
//     pub outputMessageIndex: u16,
// }

public typealias `WS_PARAMETER_TYPE` = Int;
public const val `WS_PARAMETER_TYPE_ARRAY`: `WS_PARAMETER_TYPE` = 1;
public const val `WS_PARAMETER_TYPE_ARRAY_COUNT`: `WS_PARAMETER_TYPE` = 2;
public const val `WS_PARAMETER_TYPE_MESSAGES`: `WS_PARAMETER_TYPE` = 3;
public const val `WS_PARAMETER_TYPE_NORMAL`: `WS_PARAMETER_TYPE` = 0;
public typealias `WS_POLICY` = Long;
// UNSUPPORTED Rust 2232:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_POLICY_CONSTRAINTS {
//     pub channelBinding: WS_CHANNEL_BINDING,
//     pub channelPropertyConstraints: *mut WS_CHANNEL_PROPERTY_CONSTRAINT,
//     pub channelPropertyConstraintCount: u32,
//     pub securityConstraints: *mut WS_SECURITY_CONSTRAINTS,
//     pub policyExtensions: *mut *mut WS_POLICY_EXTENSION,
//     pub policyExtensionCount: u32,
// }

// UNSUPPORTED Rust 2242:1: declaration Impl has no candidate rule
// impl Default for WS_POLICY_CONSTRAINTS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2247:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_POLICY_EXTENSION {
//     pub r#type: WS_POLICY_EXTENSION_TYPE,
// }

public typealias `WS_POLICY_EXTENSION_TYPE` = Int;
// UNSUPPORTED Rust 2253:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_POLICY_PROPERTIES {
//     pub properties: *mut WS_POLICY_PROPERTY,
//     pub propertyCount: u32,
// }

// UNSUPPORTED Rust 2259:1: declaration Impl has no candidate rule
// impl Default for WS_POLICY_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2264:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_POLICY_PROPERTY {
//     pub id: WS_POLICY_PROPERTY_ID,
//     pub value: *mut core::ffi::c_void,
//     pub valueSize: u32,
// }

// UNSUPPORTED Rust 2271:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 2289:1: generic scalar type unsupported
// pub type WS_PROXY_MESSAGE_CALLBACK = Option<unsafe extern "system" fn(message: *const WS_MESSAGE, heap: *const WS_HEAP, state: *const core::ffi::c_void, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 2290:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_PROXY_MESSAGE_CALLBACK_CONTEXT {
//     pub callback: WS_PROXY_MESSAGE_CALLBACK,
//     pub state: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 2296:1: declaration Impl has no candidate rule
// impl Default for WS_PROXY_MESSAGE_CALLBACK_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2301:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_PROXY_PROPERTY {
//     pub id: WS_PROXY_PROPERTY_ID,
//     pub value: *mut core::ffi::c_void,
//     pub valueSize: u32,
// }

// UNSUPPORTED Rust 2308:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 2320:1: generic scalar type unsupported
// pub type WS_PULL_BYTES_CALLBACK = Option<unsafe extern "system" fn(callbackstate: *const core::ffi::c_void, bytes: *mut core::ffi::c_void, maxsize: u32, actualsize: *mut u32, asynccontext: *const WS_ASYNC_CONTEXT, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 2321:1: generic scalar type unsupported
// pub type WS_PUSH_BYTES_CALLBACK = Option<unsafe extern "system" fn(callbackstate: *const core::ffi::c_void, writecallback: WS_WRITE_CALLBACK, writecallbackstate: *const core::ffi::c_void, asynccontext: *const WS_ASYNC_CONTEXT, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 2322:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_RAW_SYMMETRIC_SECURITY_KEY_HANDLE {
//     pub keyHandle: WS_SECURITY_KEY_HANDLE,
//     pub rawKeyBytes: WS_BYTES,
// }

public const val `WS_RAW_SYMMETRIC_SECURITY_KEY_HANDLE_TYPE`: `WS_SECURITY_KEY_HANDLE_TYPE` = 1;
// UNSUPPORTED Rust 2329:1: generic scalar type unsupported
// pub type WS_READ_CALLBACK = Option<unsafe extern "system" fn(callbackstate: *const core::ffi::c_void, bytes: *mut core::ffi::c_void, maxsize: u32, actualsize: *mut u32, asynccontext: *const WS_ASYNC_CONTEXT, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 2330:1: generic scalar type unsupported
// pub type WS_READ_MESSAGE_END_CALLBACK = Option<unsafe extern "system" fn(channelinstance: *const core::ffi::c_void, message: *const WS_MESSAGE, asynccontext: *const WS_ASYNC_CONTEXT, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 2331:1: generic scalar type unsupported
// pub type WS_READ_MESSAGE_START_CALLBACK = Option<unsafe extern "system" fn(channelinstance: *const core::ffi::c_void, message: *const WS_MESSAGE, asynccontext: *const WS_ASYNC_CONTEXT, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

public const val `WS_READ_NILLABLE_POINTER`: `WS_READ_OPTION` = 4;
public const val `WS_READ_NILLABLE_VALUE`: `WS_READ_OPTION` = 5;
public typealias `WS_READ_OPTION` = Int;
public const val `WS_READ_OPTIONAL_POINTER`: `WS_READ_OPTION` = 3;
public const val `WS_READ_REQUIRED_POINTER`: `WS_READ_OPTION` = 2;
public const val `WS_READ_REQUIRED_VALUE`: `WS_READ_OPTION` = 1;
// UNSUPPORTED Rust 2338:1: generic scalar type unsupported
// pub type WS_READ_TYPE_CALLBACK = Option<unsafe extern "system" fn(reader: *const WS_XML_READER, typemapping: WS_TYPE_MAPPING, descriptiondata: *const core::ffi::c_void, heap: *const WS_HEAP, value: *mut core::ffi::c_void, valuesize: u32, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

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
// UNSUPPORTED Rust 2356:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_REQUEST_SECURITY_TOKEN_PROPERTY {
//     pub id: WS_REQUEST_SECURITY_TOKEN_PROPERTY_ID,
//     pub value: *mut core::ffi::c_void,
//     pub valueSize: u32,
// }

// UNSUPPORTED Rust 2363:1: declaration Impl has no candidate rule
// impl Default for WS_REQUEST_SECURITY_TOKEN_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_REQUEST_SECURITY_TOKEN_PROPERTY_APPLIES_TO`: `WS_REQUEST_SECURITY_TOKEN_PROPERTY_ID` = 1;
public const val `WS_REQUEST_SECURITY_TOKEN_PROPERTY_BEARER_KEY_TYPE_VERSION`: `WS_REQUEST_SECURITY_TOKEN_PROPERTY_ID` = 13;
// UNSUPPORTED Rust 2370:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_REQUEST_SECURITY_TOKEN_PROPERTY_CONSTRAINT {
//     pub id: WS_REQUEST_SECURITY_TOKEN_PROPERTY_ID,
//     pub allowedValues: *mut core::ffi::c_void,
//     pub allowedValuesSize: u32,
//     pub out: WS_REQUEST_SECURITY_TOKEN_PROPERTY_CONSTRAINT_0,
// }

// UNSUPPORTED Rust 2378:1: declaration Impl has no candidate rule
// impl Default for WS_REQUEST_SECURITY_TOKEN_PROPERTY_CONSTRAINT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2383:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_REQUEST_SECURITY_TOKEN_PROPERTY_CONSTRAINT_0 {
//     pub requestSecurityTokenProperty: WS_REQUEST_SECURITY_TOKEN_PROPERTY,
// }

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
// UNSUPPORTED Rust 2400:1: generic scalar type unsupported
// pub type WS_RESET_CHANNEL_CALLBACK = Option<unsafe extern "system" fn(channelinstance: *const core::ffi::c_void, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 2401:1: generic scalar type unsupported
// pub type WS_RESET_LISTENER_CALLBACK = Option<unsafe extern "system" fn(listenerinstance: *const core::ffi::c_void, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

public const val `WS_RPC_LITERAL_OPERATION`: `WS_OPERATION_STYLE` = 1;
// UNSUPPORTED Rust 2403:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_RSA_ENDPOINT_IDENTITY {
//     pub identity: WS_ENDPOINT_IDENTITY,
//     pub modulus: WS_BYTES,
//     pub exponent: WS_BYTES,
// }

public const val `WS_RSA_ENDPOINT_IDENTITY_TYPE`: `WS_ENDPOINT_IDENTITY_TYPE` = 4;
// UNSUPPORTED Rust 2411:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_SAML_AUTHENTICATOR {
//     pub authenticatorType: WS_SAML_AUTHENTICATOR_TYPE,
// }

public typealias `WS_SAML_AUTHENTICATOR_TYPE` = Int;
// UNSUPPORTED Rust 2417:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_SAML_MESSAGE_SECURITY_BINDING {
//     pub binding: WS_SECURITY_BINDING,
//     pub bindingUsage: WS_MESSAGE_SECURITY_USAGE,
//     pub authenticator: *mut WS_SAML_AUTHENTICATOR,
// }

// UNSUPPORTED Rust 2424:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 2455:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_SECURITY_ALGORITHM_PROPERTY {
//     pub id: WS_SECURITY_ALGORITHM_PROPERTY_ID,
//     pub value: *mut core::ffi::c_void,
//     pub valueSize: u32,
// }

// UNSUPPORTED Rust 2462:1: declaration Impl has no candidate rule
// impl Default for WS_SECURITY_ALGORITHM_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WS_SECURITY_ALGORITHM_PROPERTY_ID` = Int;
// UNSUPPORTED Rust 2468:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_SECURITY_ALGORITHM_SUITE {
//     pub canonicalizationAlgorithm: WS_SECURITY_ALGORITHM_ID,
//     pub digestAlgorithm: WS_SECURITY_ALGORITHM_ID,
//     pub symmetricSignatureAlgorithm: WS_SECURITY_ALGORITHM_ID,
//     pub asymmetricSignatureAlgorithm: WS_SECURITY_ALGORITHM_ID,
//     pub encryptionAlgorithm: WS_SECURITY_ALGORITHM_ID,
//     pub keyDerivationAlgorithm: WS_SECURITY_ALGORITHM_ID,
//     pub symmetricKeyWrapAlgorithm: WS_SECURITY_ALGORITHM_ID,
//     pub asymmetricKeyWrapAlgorithm: WS_SECURITY_ALGORITHM_ID,
//     pub minSymmetricKeyLength: u32,
//     pub maxSymmetricKeyLength: u32,
//     pub minAsymmetricKeyLength: u32,
//     pub maxAsymmetricKeyLength: u32,
//     pub properties: *mut WS_SECURITY_ALGORITHM_PROPERTY,
//     pub propertyCount: u32,
// }

// UNSUPPORTED Rust 2486:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 2512:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_SECURITY_BINDING {
//     pub bindingType: WS_SECURITY_BINDING_TYPE,
//     pub properties: *mut WS_SECURITY_BINDING_PROPERTY,
//     pub propertyCount: u32,
// }

// UNSUPPORTED Rust 2519:1: declaration Impl has no candidate rule
// impl Default for WS_SECURITY_BINDING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2524:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_SECURITY_BINDING_CONSTRAINT {
//     pub r#type: WS_SECURITY_BINDING_CONSTRAINT_TYPE,
//     pub propertyConstraints: *mut WS_SECURITY_BINDING_PROPERTY_CONSTRAINT,
//     pub propertyConstraintCount: u32,
// }

// UNSUPPORTED Rust 2531:1: declaration Impl has no candidate rule
// impl Default for WS_SECURITY_BINDING_CONSTRAINT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WS_SECURITY_BINDING_CONSTRAINT_TYPE` = Int;
// UNSUPPORTED Rust 2537:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_SECURITY_BINDING_PROPERTIES {
//     pub properties: *mut WS_SECURITY_BINDING_PROPERTY,
//     pub propertyCount: u32,
// }

// UNSUPPORTED Rust 2543:1: declaration Impl has no candidate rule
// impl Default for WS_SECURITY_BINDING_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2548:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_SECURITY_BINDING_PROPERTY {
//     pub id: WS_SECURITY_BINDING_PROPERTY_ID,
//     pub value: *mut core::ffi::c_void,
//     pub valueSize: u32,
// }

// UNSUPPORTED Rust 2555:1: declaration Impl has no candidate rule
// impl Default for WS_SECURITY_BINDING_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_SECURITY_BINDING_PROPERTY_ALLOWED_IMPERSONATION_LEVEL`: `WS_SECURITY_BINDING_PROPERTY_ID` = 5;
public const val `WS_SECURITY_BINDING_PROPERTY_ALLOW_ANONYMOUS_CLIENTS`: `WS_SECURITY_BINDING_PROPERTY_ID` = 4;
public const val `WS_SECURITY_BINDING_PROPERTY_CERTIFICATE_VALIDATION_CALLBACK_CONTEXT`: `WS_SECURITY_BINDING_PROPERTY_ID` = 23;
public const val `WS_SECURITY_BINDING_PROPERTY_CERT_FAILURES_TO_IGNORE`: `WS_SECURITY_BINDING_PROPERTY_ID` = 20;
// UNSUPPORTED Rust 2564:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_SECURITY_BINDING_PROPERTY_CONSTRAINT {
//     pub id: WS_SECURITY_BINDING_PROPERTY_ID,
//     pub allowedValues: *mut core::ffi::c_void,
//     pub allowedValuesSize: u32,
//     pub out: WS_SECURITY_BINDING_PROPERTY_CONSTRAINT_0,
// }

// UNSUPPORTED Rust 2572:1: declaration Impl has no candidate rule
// impl Default for WS_SECURITY_BINDING_PROPERTY_CONSTRAINT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2577:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_SECURITY_BINDING_PROPERTY_CONSTRAINT_0 {
//     pub securityBindingProperty: WS_SECURITY_BINDING_PROPERTY,
// }

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
// UNSUPPORTED Rust 2603:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_SECURITY_CONSTRAINTS {
//     pub securityPropertyConstraints: *mut WS_SECURITY_PROPERTY_CONSTRAINT,
//     pub securityPropertyConstraintCount: u32,
//     pub securityBindingConstraints: *mut *mut WS_SECURITY_BINDING_CONSTRAINT,
//     pub securityBindingConstraintCount: u32,
// }

// UNSUPPORTED Rust 2611:1: declaration Impl has no candidate rule
// impl Default for WS_SECURITY_CONSTRAINTS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WS_SECURITY_CONTEXT` = Long;
// UNSUPPORTED Rust 2617:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_SECURITY_CONTEXT_MESSAGE_SECURITY_BINDING {
//     pub binding: WS_SECURITY_BINDING,
//     pub bindingUsage: WS_MESSAGE_SECURITY_USAGE,
//     pub bootstrapSecurityDescription: *mut WS_SECURITY_DESCRIPTION,
// }

// UNSUPPORTED Rust 2624:1: declaration Impl has no candidate rule
// impl Default for WS_SECURITY_CONTEXT_MESSAGE_SECURITY_BINDING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2629:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_SECURITY_CONTEXT_MESSAGE_SECURITY_BINDING_CONSTRAINT {
//     pub bindingConstraint: WS_SECURITY_BINDING_CONSTRAINT,
//     pub bindingUsage: WS_MESSAGE_SECURITY_USAGE,
//     pub bootstrapSecurityConstraint: *mut WS_SECURITY_CONSTRAINTS,
// }

// UNSUPPORTED Rust 2636:1: declaration Impl has no candidate rule
// impl Default for WS_SECURITY_CONTEXT_MESSAGE_SECURITY_BINDING_CONSTRAINT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_SECURITY_CONTEXT_MESSAGE_SECURITY_BINDING_CONSTRAINT_TYPE`: `WS_SECURITY_BINDING_CONSTRAINT_TYPE` = 8;
// UNSUPPORTED Rust 2642:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_SECURITY_CONTEXT_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION {
//     pub securityBindingProperties: WS_SECURITY_BINDING_PROPERTIES,
//     pub bindingUsage: WS_MESSAGE_SECURITY_USAGE,
// }

// UNSUPPORTED Rust 2648:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_SECURITY_CONTEXT_MESSAGE_SECURITY_BINDING_TEMPLATE {
//     pub securityBindingProperties: WS_SECURITY_BINDING_PROPERTIES,
// }

public const val `WS_SECURITY_CONTEXT_MESSAGE_SECURITY_BINDING_TYPE`: `WS_SECURITY_BINDING_TYPE` = 8;
// UNSUPPORTED Rust 2654:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_SECURITY_CONTEXT_PROPERTY {
//     pub id: WS_SECURITY_CONTEXT_PROPERTY_ID,
//     pub value: *mut core::ffi::c_void,
//     pub valueSize: u32,
// }

// UNSUPPORTED Rust 2661:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 2671:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_SECURITY_CONTEXT_SECURITY_BINDING_POLICY_DESCRIPTION {
//     pub securityContextMessageSecurityBinding: WS_SECURITY_CONTEXT_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION,
//     pub securityProperties: WS_SECURITY_PROPERTIES,
// }

// UNSUPPORTED Rust 2677:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_SECURITY_CONTEXT_SECURITY_BINDING_TEMPLATE {
//     pub securityContextMessageSecurityBinding: WS_SECURITY_CONTEXT_MESSAGE_SECURITY_BINDING_TEMPLATE,
//     pub securityProperties: WS_SECURITY_PROPERTIES,
// }

// UNSUPPORTED Rust 2683:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_SECURITY_DESCRIPTION {
//     pub securityBindings: *mut *mut WS_SECURITY_BINDING,
//     pub securityBindingCount: u32,
//     pub properties: *mut WS_SECURITY_PROPERTY,
//     pub propertyCount: u32,
// }

// UNSUPPORTED Rust 2691:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 2708:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_SECURITY_KEY_HANDLE {
//     pub keyHandleType: WS_SECURITY_KEY_HANDLE_TYPE,
// }

public typealias `WS_SECURITY_KEY_HANDLE_TYPE` = Int;
public typealias `WS_SECURITY_KEY_TYPE` = Int;
public const val `WS_SECURITY_KEY_TYPE_ASYMMETRIC`: `WS_SECURITY_KEY_TYPE` = 3;
public const val `WS_SECURITY_KEY_TYPE_NONE`: `WS_SECURITY_KEY_TYPE` = 1;
public const val `WS_SECURITY_KEY_TYPE_SYMMETRIC`: `WS_SECURITY_KEY_TYPE` = 2;
// UNSUPPORTED Rust 2718:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_SECURITY_PROPERTIES {
//     pub properties: *mut WS_SECURITY_PROPERTY,
//     pub propertyCount: u32,
// }

// UNSUPPORTED Rust 2724:1: declaration Impl has no candidate rule
// impl Default for WS_SECURITY_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2729:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_SECURITY_PROPERTY {
//     pub id: WS_SECURITY_PROPERTY_ID,
//     pub value: *mut core::ffi::c_void,
//     pub valueSize: u32,
// }

// UNSUPPORTED Rust 2736:1: declaration Impl has no candidate rule
// impl Default for WS_SECURITY_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_SECURITY_PROPERTY_ALGORITHM_SUITE`: `WS_SECURITY_PROPERTY_ID` = 2;
public const val `WS_SECURITY_PROPERTY_ALGORITHM_SUITE_NAME`: `WS_SECURITY_PROPERTY_ID` = 3;
// UNSUPPORTED Rust 2743:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_SECURITY_PROPERTY_CONSTRAINT {
//     pub id: WS_SECURITY_PROPERTY_ID,
//     pub allowedValues: *mut core::ffi::c_void,
//     pub allowedValuesSize: u32,
//     pub out: WS_SECURITY_PROPERTY_CONSTRAINT_0,
// }

// UNSUPPORTED Rust 2751:1: declaration Impl has no candidate rule
// impl Default for WS_SECURITY_PROPERTY_CONSTRAINT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2756:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_SECURITY_PROPERTY_CONSTRAINT_0 {
//     pub securityProperty: WS_SECURITY_PROPERTY,
// }

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
// UNSUPPORTED Rust 2791:1: generic scalar type unsupported
// pub type WS_SERVICE_ACCEPT_CHANNEL_CALLBACK = Option<unsafe extern "system" fn(context: *const WS_OPERATION_CONTEXT, channelstate: *mut *mut core::ffi::c_void, asynccontext: *const WS_ASYNC_CONTEXT, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

public typealias `WS_SERVICE_CANCEL_REASON` = Int;
public const val `WS_SERVICE_CHANNEL_FAULTED`: `WS_SERVICE_CANCEL_REASON` = 1;
// UNSUPPORTED Rust 2794:1: generic scalar type unsupported
// pub type WS_SERVICE_CLOSE_CHANNEL_CALLBACK = Option<unsafe extern "system" fn(context: *const WS_OPERATION_CONTEXT, asynccontext: *const WS_ASYNC_CONTEXT) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 2795:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_SERVICE_CONTRACT {
//     pub contractDescription: *const WS_CONTRACT_DESCRIPTION,
//     pub defaultMessageHandlerCallback: WS_SERVICE_MESSAGE_RECEIVE_CALLBACK,
//     pub methodTable: *const core::ffi::c_void,
// }

// UNSUPPORTED Rust 2802:1: declaration Impl has no candidate rule
// impl Default for WS_SERVICE_CONTRACT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2807:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_SERVICE_ENDPOINT {
//     pub address: WS_ENDPOINT_ADDRESS,
//     pub channelBinding: WS_CHANNEL_BINDING,
//     pub channelType: WS_CHANNEL_TYPE,
//     pub securityDescription: *const WS_SECURITY_DESCRIPTION,
//     pub contract: *const WS_SERVICE_CONTRACT,
//     pub authorizationCallback: WS_SERVICE_SECURITY_CALLBACK,
//     pub properties: *const WS_SERVICE_ENDPOINT_PROPERTY,
//     pub propertyCount: u32,
//     pub channelProperties: WS_CHANNEL_PROPERTIES,
// }

// UNSUPPORTED Rust 2820:1: declaration Impl has no candidate rule
// impl Default for WS_SERVICE_ENDPOINT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2825:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_SERVICE_ENDPOINT_METADATA {
//     pub portName: *mut WS_XML_STRING,
//     pub bindingName: *mut WS_XML_STRING,
//     pub bindingNs: *mut WS_XML_STRING,
// }

// UNSUPPORTED Rust 2832:1: declaration Impl has no candidate rule
// impl Default for WS_SERVICE_ENDPOINT_METADATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2837:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_SERVICE_ENDPOINT_PROPERTY {
//     pub id: WS_SERVICE_ENDPOINT_PROPERTY_ID,
//     pub value: *mut core::ffi::c_void,
//     pub valueSize: u32,
// }

// UNSUPPORTED Rust 2844:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 2874:1: generic scalar type unsupported
// pub type WS_SERVICE_MESSAGE_RECEIVE_CALLBACK = Option<unsafe extern "system" fn(context: *const WS_OPERATION_CONTEXT, asynccontext: *const WS_ASYNC_CONTEXT, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 2875:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_SERVICE_METADATA {
//     pub documentCount: u32,
//     pub documents: *mut *mut WS_SERVICE_METADATA_DOCUMENT,
//     pub serviceName: *mut WS_XML_STRING,
//     pub serviceNs: *mut WS_XML_STRING,
// }

// UNSUPPORTED Rust 2883:1: declaration Impl has no candidate rule
// impl Default for WS_SERVICE_METADATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2888:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_SERVICE_METADATA_DOCUMENT {
//     pub content: *mut WS_XML_STRING,
//     pub name: *mut WS_STRING,
// }

// UNSUPPORTED Rust 2894:1: declaration Impl has no candidate rule
// impl Default for WS_SERVICE_METADATA_DOCUMENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_SERVICE_OPERATION_MESSAGE_NILLABLE_ELEMENT`: Int = 1;
// UNSUPPORTED Rust 2900:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_SERVICE_PROPERTY {
//     pub id: WS_SERVICE_PROPERTY_ID,
//     pub value: *mut core::ffi::c_void,
//     pub valueSize: u32,
// }

// UNSUPPORTED Rust 2907:1: declaration Impl has no candidate rule
// impl Default for WS_SERVICE_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2912:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_SERVICE_PROPERTY_ACCEPT_CALLBACK {
//     pub callback: WS_SERVICE_ACCEPT_CHANNEL_CALLBACK,
// }

// UNSUPPORTED Rust 2917:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_SERVICE_PROPERTY_CLOSE_CALLBACK {
//     pub callback: WS_SERVICE_CLOSE_CHANNEL_CALLBACK,
// }

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
// UNSUPPORTED Rust 2937:1: generic scalar type unsupported
// pub type WS_SERVICE_SECURITY_CALLBACK = Option<unsafe extern "system" fn(context: *const WS_OPERATION_CONTEXT, authorized: *mut windows_sys::core::BOOL, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 2938:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_SERVICE_SECURITY_IDENTITIES {
//     pub serviceIdentities: *mut WS_STRING,
//     pub serviceIdentityCount: u32,
// }

// UNSUPPORTED Rust 2944:1: declaration Impl has no candidate rule
// impl Default for WS_SERVICE_SECURITY_IDENTITIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2949:1: generic scalar type unsupported
// pub type WS_SERVICE_STUB_CALLBACK = Option<unsafe extern "system" fn(context: *const WS_OPERATION_CONTEXT, frame: *const core::ffi::c_void, callback: *const core::ffi::c_void, asynccontext: *const WS_ASYNC_CONTEXT, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 2950:1: generic scalar type unsupported
// pub type WS_SET_CHANNEL_PROPERTY_CALLBACK = Option<unsafe extern "system" fn(channelinstance: *const core::ffi::c_void, id: WS_CHANNEL_PROPERTY_ID, value: *const core::ffi::c_void, valuesize: u32, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 2951:1: generic scalar type unsupported
// pub type WS_SET_LISTENER_PROPERTY_CALLBACK = Option<unsafe extern "system" fn(listenerinstance: *const core::ffi::c_void, id: WS_LISTENER_PROPERTY_ID, value: *const core::ffi::c_void, valuesize: u32, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

public const val `WS_SHORT_CALLBACK`: `WS_CALLBACK_MODEL` = 0;
// UNSUPPORTED Rust 2953:1: generic scalar type unsupported
// pub type WS_SHUTDOWN_SESSION_CHANNEL_CALLBACK = Option<unsafe extern "system" fn(channelinstance: *const core::ffi::c_void, asynccontext: *const WS_ASYNC_CONTEXT, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

public const val `WS_SINGLETON_HEADER`: `WS_REPEATING_HEADER_OPTION` = 2;
// UNSUPPORTED Rust 2955:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_SOAPUDP_URL {
//     pub url: WS_URL,
//     pub host: WS_STRING,
//     pub port: u16,
//     pub portAsString: WS_STRING,
//     pub path: WS_STRING,
//     pub query: WS_STRING,
//     pub fragment: WS_STRING,
// }

// UNSUPPORTED Rust 2966:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_SPN_ENDPOINT_IDENTITY {
//     pub identity: WS_ENDPOINT_IDENTITY,
//     pub spn: WS_STRING,
// }

public const val `WS_SPN_ENDPOINT_IDENTITY_TYPE`: `WS_ENDPOINT_IDENTITY_TYPE` = 3;
// UNSUPPORTED Rust 2973:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_SSL_TRANSPORT_SECURITY_BINDING {
//     pub binding: WS_SECURITY_BINDING,
//     pub localCertCredential: *mut WS_CERT_CREDENTIAL,
// }

// UNSUPPORTED Rust 2979:1: declaration Impl has no candidate rule
// impl Default for WS_SSL_TRANSPORT_SECURITY_BINDING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2984:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_SSL_TRANSPORT_SECURITY_BINDING_CONSTRAINT {
//     pub bindingConstraint: WS_SECURITY_BINDING_CONSTRAINT,
//     pub out: WS_SSL_TRANSPORT_SECURITY_BINDING_CONSTRAINT_0,
// }

// UNSUPPORTED Rust 2990:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_SSL_TRANSPORT_SECURITY_BINDING_CONSTRAINT_0 {
//     pub clientCertCredentialRequired: windows_sys::core::BOOL,
// }

public const val `WS_SSL_TRANSPORT_SECURITY_BINDING_CONSTRAINT_TYPE`: `WS_SECURITY_BINDING_CONSTRAINT_TYPE` = 1;
// UNSUPPORTED Rust 2996:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_SSL_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION {
//     pub securityBindingProperties: WS_SECURITY_BINDING_PROPERTIES,
// }

// UNSUPPORTED Rust 3001:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_SSL_TRANSPORT_SECURITY_BINDING_TEMPLATE {
//     pub securityBindingProperties: WS_SECURITY_BINDING_PROPERTIES,
//     pub localCertCredential: *mut WS_CERT_CREDENTIAL,
// }

// UNSUPPORTED Rust 3007:1: declaration Impl has no candidate rule
// impl Default for WS_SSL_TRANSPORT_SECURITY_BINDING_TEMPLATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_SSL_TRANSPORT_SECURITY_BINDING_TYPE`: `WS_SECURITY_BINDING_TYPE` = 1;
// UNSUPPORTED Rust 3013:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_SSPI_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION {
//     pub securityBindingProperties: WS_SECURITY_BINDING_PROPERTIES,
// }

public const val `WS_STREAMED_INPUT_TRANSFER_MODE`: `WS_TRANSFER_MODE` = 1;
public const val `WS_STREAMED_OUTPUT_TRANSFER_MODE`: `WS_TRANSFER_MODE` = 2;
public const val `WS_STREAMED_TRANSFER_MODE`: `WS_TRANSFER_MODE` = 3;
// UNSUPPORTED Rust 3021:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_STRING {
//     pub length: u32,
//     pub chars: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 3027:1: declaration Impl has no candidate rule
// impl Default for WS_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3032:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_STRING_DESCRIPTION {
//     pub minCharCount: u32,
//     pub maxCharCount: u32,
// }

public const val `WS_STRING_TYPE`: `WS_TYPE` = 16;
// UNSUPPORTED Rust 3039:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_STRING_USERNAME_CREDENTIAL {
//     pub credential: WS_USERNAME_CREDENTIAL,
//     pub username: WS_STRING,
//     pub password: WS_STRING,
// }

public const val `WS_STRING_USERNAME_CREDENTIAL_TYPE`: `WS_USERNAME_CREDENTIAL_TYPE` = 1;
// UNSUPPORTED Rust 3047:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_STRING_WINDOWS_INTEGRATED_AUTH_CREDENTIAL {
//     pub credential: WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL,
//     pub username: WS_STRING,
//     pub password: WS_STRING,
//     pub domain: WS_STRING,
// }

public const val `WS_STRING_WINDOWS_INTEGRATED_AUTH_CREDENTIAL_TYPE`: `WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL_TYPE` = 1;
public const val `WS_STRUCT_ABSTRACT`: Int = 1;
// UNSUPPORTED Rust 3057:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_STRUCT_DESCRIPTION {
//     pub size: u32,
//     pub alignment: u32,
//     pub fields: *mut *mut WS_FIELD_DESCRIPTION,
//     pub fieldCount: u32,
//     pub typeLocalName: *mut WS_XML_STRING,
//     pub typeNs: *mut WS_XML_STRING,
//     pub parentType: *mut WS_STRUCT_DESCRIPTION,
//     pub subTypes: *mut *mut WS_STRUCT_DESCRIPTION,
//     pub subTypeCount: u32,
//     pub structOptions: u32,
// }

// UNSUPPORTED Rust 3071:1: declaration Impl has no candidate rule
// impl Default for WS_STRUCT_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_STRUCT_IGNORE_TRAILING_ELEMENT_CONTENT`: Int = 2;
public const val `WS_STRUCT_IGNORE_UNHANDLED_ATTRIBUTES`: Int = 4;
public const val `WS_STRUCT_TYPE`: `WS_TYPE` = 26;
// UNSUPPORTED Rust 3079:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_SUBJECT_NAME_CERT_CREDENTIAL {
//     pub credential: WS_CERT_CREDENTIAL,
//     pub storeLocation: u32,
//     pub storeName: WS_STRING,
//     pub subjectName: WS_STRING,
// }

public const val `WS_SUBJECT_NAME_CERT_CREDENTIAL_TYPE`: `WS_CERT_CREDENTIAL_TYPE` = 1;
public const val `WS_SUPPORTING_MESSAGE_SECURITY_USAGE`: `WS_MESSAGE_SECURITY_USAGE` = 1;
// UNSUPPORTED Rust 3089:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_TCP_BINDING_TEMPLATE {
//     pub channelProperties: WS_CHANNEL_PROPERTIES,
// }

public const val `WS_TCP_BINDING_TEMPLATE_TYPE`: `WS_BINDING_TEMPLATE_TYPE` = 6;
public const val `WS_TCP_CHANNEL_BINDING`: `WS_CHANNEL_BINDING` = 1;
// UNSUPPORTED Rust 3096:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_TCP_POLICY_DESCRIPTION {
//     pub channelProperties: WS_CHANNEL_PROPERTIES,
// }

// UNSUPPORTED Rust 3101:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_TCP_SSPI_BINDING_TEMPLATE {
//     pub channelProperties: WS_CHANNEL_PROPERTIES,
//     pub securityProperties: WS_SECURITY_PROPERTIES,
//     pub sspiTransportSecurityBinding: WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_TEMPLATE,
// }

public const val `WS_TCP_SSPI_BINDING_TEMPLATE_TYPE`: `WS_BINDING_TEMPLATE_TYPE` = 7;
// UNSUPPORTED Rust 3109:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_TCP_SSPI_KERBEROS_APREQ_BINDING_TEMPLATE {
//     pub channelProperties: WS_CHANNEL_PROPERTIES,
//     pub securityProperties: WS_SECURITY_PROPERTIES,
//     pub sspiTransportSecurityBinding: WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_TEMPLATE,
//     pub kerberosApreqMessageSecurityBinding: WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_TEMPLATE,
// }

public const val `WS_TCP_SSPI_KERBEROS_APREQ_BINDING_TEMPLATE_TYPE`: `WS_BINDING_TEMPLATE_TYPE` = 9;
// UNSUPPORTED Rust 3118:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_TCP_SSPI_KERBEROS_APREQ_POLICY_DESCRIPTION {
//     pub channelProperties: WS_CHANNEL_PROPERTIES,
//     pub securityProperties: WS_SECURITY_PROPERTIES,
//     pub sspiTransportSecurityBinding: WS_SSPI_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION,
//     pub kerberosApreqMessageSecurityBinding: WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION,
// }

// UNSUPPORTED Rust 3126:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_TCP_SSPI_KERBEROS_APREQ_SECURITY_CONTEXT_BINDING_TEMPLATE {
//     pub channelProperties: WS_CHANNEL_PROPERTIES,
//     pub securityProperties: WS_SECURITY_PROPERTIES,
//     pub sspiTransportSecurityBinding: WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_TEMPLATE,
//     pub kerberosApreqMessageSecurityBinding: WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_TEMPLATE,
//     pub securityContextSecurityBinding: WS_SECURITY_CONTEXT_SECURITY_BINDING_TEMPLATE,
// }

public const val `WS_TCP_SSPI_KERBEROS_APREQ_SECURITY_CONTEXT_BINDING_TEMPLATE_TYPE`: `WS_BINDING_TEMPLATE_TYPE` = 13;
// UNSUPPORTED Rust 3136:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_TCP_SSPI_KERBEROS_APREQ_SECURITY_CONTEXT_POLICY_DESCRIPTION {
//     pub channelProperties: WS_CHANNEL_PROPERTIES,
//     pub securityProperties: WS_SECURITY_PROPERTIES,
//     pub sspiTransportSecurityBinding: WS_SSPI_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION,
//     pub kerberosApreqMessageSecurityBinding: WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION,
//     pub securityContextSecurityBinding: WS_SECURITY_CONTEXT_SECURITY_BINDING_POLICY_DESCRIPTION,
// }

// UNSUPPORTED Rust 3145:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_TCP_SSPI_POLICY_DESCRIPTION {
//     pub channelProperties: WS_CHANNEL_PROPERTIES,
//     pub securityProperties: WS_SECURITY_PROPERTIES,
//     pub sspiTransportSecurityBinding: WS_SSPI_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION,
// }

// UNSUPPORTED Rust 3152:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING {
//     pub binding: WS_SECURITY_BINDING,
//     pub clientCredential: *mut WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL,
// }

// UNSUPPORTED Rust 3158:1: declaration Impl has no candidate rule
// impl Default for WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3163:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_CONSTRAINT {
//     pub bindingConstraint: WS_SECURITY_BINDING_CONSTRAINT,
// }

public const val `WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_CONSTRAINT_TYPE`: `WS_SECURITY_BINDING_CONSTRAINT_TYPE` = 2;
// UNSUPPORTED Rust 3169:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_TEMPLATE {
//     pub securityBindingProperties: WS_SECURITY_BINDING_PROPERTIES,
//     pub clientCredential: *mut WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL,
// }

// UNSUPPORTED Rust 3175:1: declaration Impl has no candidate rule
// impl Default for WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_TEMPLATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_TYPE`: `WS_SECURITY_BINDING_TYPE` = 2;
// UNSUPPORTED Rust 3181:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_TCP_SSPI_USERNAME_BINDING_TEMPLATE {
//     pub channelProperties: WS_CHANNEL_PROPERTIES,
//     pub securityProperties: WS_SECURITY_PROPERTIES,
//     pub sspiTransportSecurityBinding: WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_TEMPLATE,
//     pub usernameMessageSecurityBinding: WS_USERNAME_MESSAGE_SECURITY_BINDING_TEMPLATE,
// }

public const val `WS_TCP_SSPI_USERNAME_BINDING_TEMPLATE_TYPE`: `WS_BINDING_TEMPLATE_TYPE` = 8;
// UNSUPPORTED Rust 3190:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_TCP_SSPI_USERNAME_POLICY_DESCRIPTION {
//     pub channelProperties: WS_CHANNEL_PROPERTIES,
//     pub securityProperties: WS_SECURITY_PROPERTIES,
//     pub sspiTransportSecurityBinding: WS_SSPI_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION,
//     pub usernameMessageSecurityBinding: WS_USERNAME_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION,
// }

// UNSUPPORTED Rust 3198:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_TCP_SSPI_USERNAME_SECURITY_CONTEXT_BINDING_TEMPLATE {
//     pub channelProperties: WS_CHANNEL_PROPERTIES,
//     pub securityProperties: WS_SECURITY_PROPERTIES,
//     pub sspiTransportSecurityBinding: WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_TEMPLATE,
//     pub usernameMessageSecurityBinding: WS_USERNAME_MESSAGE_SECURITY_BINDING_TEMPLATE,
//     pub securityContextSecurityBinding: WS_SECURITY_CONTEXT_SECURITY_BINDING_TEMPLATE,
// }

public const val `WS_TCP_SSPI_USERNAME_SECURITY_CONTEXT_BINDING_TEMPLATE_TYPE`: `WS_BINDING_TEMPLATE_TYPE` = 12;
// UNSUPPORTED Rust 3208:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_TCP_SSPI_USERNAME_SECURITY_CONTEXT_POLICY_DESCRIPTION {
//     pub channelProperties: WS_CHANNEL_PROPERTIES,
//     pub securityProperties: WS_SECURITY_PROPERTIES,
//     pub sspiTransportSecurityBinding: WS_SSPI_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION,
//     pub usernameMessageSecurityBinding: WS_USERNAME_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION,
//     pub securityContextSecurityBinding: WS_SECURITY_CONTEXT_SECURITY_BINDING_POLICY_DESCRIPTION,
// }

public const val `WS_TEXT_FIELD_MAPPING`: `WS_FIELD_MAPPING` = 4;
// UNSUPPORTED Rust 3218:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_THUMBPRINT_CERT_CREDENTIAL {
//     pub credential: WS_CERT_CREDENTIAL,
//     pub storeLocation: u32,
//     pub storeName: WS_STRING,
//     pub thumbprint: WS_STRING,
// }

public const val `WS_THUMBPRINT_CERT_CREDENTIAL_TYPE`: `WS_CERT_CREDENTIAL_TYPE` = 2;
// UNSUPPORTED Rust 3227:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_TIMESPAN {
//     pub ticks: i64,
// }

// UNSUPPORTED Rust 3232:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_TIMESPAN_DESCRIPTION {
//     pub minValue: WS_TIMESPAN,
//     pub maxValue: WS_TIMESPAN,
// }

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
// UNSUPPORTED Rust 3446:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_UINT16_DESCRIPTION {
//     pub minValue: u16,
//     pub maxValue: u16,
// }

public const val `WS_UINT16_TYPE`: `WS_TYPE` = 6;
public const val `WS_UINT16_VALUE_TYPE`: `WS_VALUE_TYPE` = 6;
// UNSUPPORTED Rust 3454:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_UINT32_DESCRIPTION {
//     pub minValue: u32,
//     pub maxValue: u32,
// }

public const val `WS_UINT32_TYPE`: `WS_TYPE` = 7;
public const val `WS_UINT32_VALUE_TYPE`: `WS_VALUE_TYPE` = 7;
// UNSUPPORTED Rust 3462:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_UINT64_DESCRIPTION {
//     pub minValue: u64,
//     pub maxValue: u64,
// }

public const val `WS_UINT64_TYPE`: `WS_TYPE` = 8;
public const val `WS_UINT64_VALUE_TYPE`: `WS_VALUE_TYPE` = 8;
// UNSUPPORTED Rust 3470:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_UINT8_DESCRIPTION {
//     pub minValue: u8,
//     pub maxValue: u8,
// }

public const val `WS_UINT8_TYPE`: `WS_TYPE` = 5;
public const val `WS_UINT8_VALUE_TYPE`: `WS_VALUE_TYPE` = 5;
// UNSUPPORTED Rust 3478:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_UNION_DESCRIPTION {
//     pub size: u32,
//     pub alignment: u32,
//     pub fields: *mut *mut WS_UNION_FIELD_DESCRIPTION,
//     pub fieldCount: u32,
//     pub enumOffset: u32,
//     pub noneEnumValue: i32,
//     pub valueIndices: *mut u32,
// }

// UNSUPPORTED Rust 3489:1: declaration Impl has no candidate rule
// impl Default for WS_UNION_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3494:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_UNION_FIELD_DESCRIPTION {
//     pub value: i32,
//     pub field: WS_FIELD_DESCRIPTION,
// }

public const val `WS_UNION_TYPE`: `WS_TYPE` = 33;
// UNSUPPORTED Rust 3501:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_UNIQUE_ID {
//     pub uri: WS_STRING,
//     pub guid: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 3507:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_UNIQUE_ID_DESCRIPTION {
//     pub minCharCount: u32,
//     pub maxCharCount: u32,
// }

public const val `WS_UNIQUE_ID_TYPE`: `WS_TYPE` = 15;
// UNSUPPORTED Rust 3514:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_UNKNOWN_ENDPOINT_IDENTITY {
//     pub identity: WS_ENDPOINT_IDENTITY,
//     pub element: *mut WS_XML_BUFFER,
// }

// UNSUPPORTED Rust 3520:1: declaration Impl has no candidate rule
// impl Default for WS_UNKNOWN_ENDPOINT_IDENTITY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_UNKNOWN_ENDPOINT_IDENTITY_TYPE`: `WS_ENDPOINT_IDENTITY_TYPE` = 6;
// UNSUPPORTED Rust 3526:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_UPN_ENDPOINT_IDENTITY {
//     pub identity: WS_ENDPOINT_IDENTITY,
//     pub upn: WS_STRING,
// }

public const val `WS_UPN_ENDPOINT_IDENTITY_TYPE`: `WS_ENDPOINT_IDENTITY_TYPE` = 2;
// UNSUPPORTED Rust 3533:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_URL {
//     pub scheme: WS_URL_SCHEME_TYPE,
// }

public const val `WS_URL_FLAGS_ALLOW_HOST_WILDCARDS`: Int = 1;
public const val `WS_URL_FLAGS_NO_PATH_COLLAPSE`: Int = 2;
public const val `WS_URL_FLAGS_ZERO_TERMINATE`: Int = 4;
public const val `WS_URL_HTTPS_SCHEME_TYPE`: `WS_URL_SCHEME_TYPE` = 1;
public const val `WS_URL_HTTP_SCHEME_TYPE`: `WS_URL_SCHEME_TYPE` = 0;
public const val `WS_URL_NETPIPE_SCHEME_TYPE`: `WS_URL_SCHEME_TYPE` = 4;
public const val `WS_URL_NETTCP_SCHEME_TYPE`: `WS_URL_SCHEME_TYPE` = 2;
public typealias `WS_URL_SCHEME_TYPE` = Int;
public const val `WS_URL_SOAPUDP_SCHEME_TYPE`: `WS_URL_SCHEME_TYPE` = 3;
// UNSUPPORTED Rust 3547:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_USERNAME_CREDENTIAL {
//     pub credentialType: WS_USERNAME_CREDENTIAL_TYPE,
// }

public typealias `WS_USERNAME_CREDENTIAL_TYPE` = Int;
// UNSUPPORTED Rust 3553:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_USERNAME_MESSAGE_SECURITY_BINDING {
//     pub binding: WS_SECURITY_BINDING,
//     pub bindingUsage: WS_MESSAGE_SECURITY_USAGE,
//     pub clientCredential: *mut WS_USERNAME_CREDENTIAL,
//     pub passwordValidator: WS_VALIDATE_PASSWORD_CALLBACK,
//     pub passwordValidatorCallbackState: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 3562:1: declaration Impl has no candidate rule
// impl Default for WS_USERNAME_MESSAGE_SECURITY_BINDING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3567:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_USERNAME_MESSAGE_SECURITY_BINDING_CONSTRAINT {
//     pub bindingConstraint: WS_SECURITY_BINDING_CONSTRAINT,
//     pub bindingUsage: WS_MESSAGE_SECURITY_USAGE,
// }

public const val `WS_USERNAME_MESSAGE_SECURITY_BINDING_CONSTRAINT_TYPE`: `WS_SECURITY_BINDING_CONSTRAINT_TYPE` = 4;
// UNSUPPORTED Rust 3574:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_USERNAME_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION {
//     pub securityBindingProperties: WS_SECURITY_BINDING_PROPERTIES,
//     pub bindingUsage: WS_MESSAGE_SECURITY_USAGE,
// }

// UNSUPPORTED Rust 3580:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_USERNAME_MESSAGE_SECURITY_BINDING_TEMPLATE {
//     pub securityBindingProperties: WS_SECURITY_BINDING_PROPERTIES,
//     pub clientCredential: *mut WS_USERNAME_CREDENTIAL,
//     pub passwordValidator: WS_VALIDATE_PASSWORD_CALLBACK,
//     pub passwordValidatorCallbackState: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 3588:1: declaration Impl has no candidate rule
// impl Default for WS_USERNAME_MESSAGE_SECURITY_BINDING_TEMPLATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_USERNAME_MESSAGE_SECURITY_BINDING_TYPE`: `WS_SECURITY_BINDING_TYPE` = 4;
// UNSUPPORTED Rust 3594:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_UTF8_ARRAY_DESCRIPTION {
//     pub minByteCount: u32,
//     pub maxByteCount: u32,
// }

public const val `WS_UTF8_ARRAY_TYPE`: `WS_TYPE` = 23;
// UNSUPPORTED Rust 3601:1: generic scalar type unsupported
// pub type WS_VALIDATE_PASSWORD_CALLBACK = Option<unsafe extern "system" fn(passwordvalidatorcallbackstate: *const core::ffi::c_void, username: *const WS_STRING, password: *const WS_STRING, asynccontext: *const WS_ASYNC_CONTEXT, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3602:1: generic scalar type unsupported
// pub type WS_VALIDATE_SAML_CALLBACK = Option<unsafe extern "system" fn(samlvalidatorcallbackstate: *const core::ffi::c_void, samlassertion: *const WS_XML_BUFFER, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

public typealias `WS_VALUE_TYPE` = Int;
// UNSUPPORTED Rust 3604:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_VOID_DESCRIPTION {
//     pub size: u32,
// }

public const val `WS_VOID_TYPE`: `WS_TYPE` = 30;
// UNSUPPORTED Rust 3610:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL {
//     pub credentialType: WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL_TYPE,
// }

public typealias `WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL_TYPE` = Int;
public typealias `WS_WINDOWS_INTEGRATED_AUTH_PACKAGE` = Int;
public const val `WS_WINDOWS_INTEGRATED_AUTH_PACKAGE_KERBEROS`: `WS_WINDOWS_INTEGRATED_AUTH_PACKAGE` = 1;
public const val `WS_WINDOWS_INTEGRATED_AUTH_PACKAGE_NTLM`: `WS_WINDOWS_INTEGRATED_AUTH_PACKAGE` = 2;
public const val `WS_WINDOWS_INTEGRATED_AUTH_PACKAGE_SPNEGO`: `WS_WINDOWS_INTEGRATED_AUTH_PACKAGE` = 3;
// UNSUPPORTED Rust 3620:1: generic scalar type unsupported
// pub type WS_WRITE_CALLBACK = Option<unsafe extern "system" fn(callbackstate: *const core::ffi::c_void, buffers: *const WS_BYTES, count: u32, asynccontext: *const WS_ASYNC_CONTEXT, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3621:1: generic scalar type unsupported
// pub type WS_WRITE_MESSAGE_END_CALLBACK = Option<unsafe extern "system" fn(channelinstance: *const core::ffi::c_void, message: *const WS_MESSAGE, asynccontext: *const WS_ASYNC_CONTEXT, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3622:1: generic scalar type unsupported
// pub type WS_WRITE_MESSAGE_START_CALLBACK = Option<unsafe extern "system" fn(channelinstance: *const core::ffi::c_void, message: *const WS_MESSAGE, asynccontext: *const WS_ASYNC_CONTEXT, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

public const val `WS_WRITE_NILLABLE_POINTER`: `WS_WRITE_OPTION` = 4;
public const val `WS_WRITE_NILLABLE_VALUE`: `WS_WRITE_OPTION` = 3;
public typealias `WS_WRITE_OPTION` = Int;
public const val `WS_WRITE_REQUIRED_POINTER`: `WS_WRITE_OPTION` = 2;
public const val `WS_WRITE_REQUIRED_VALUE`: `WS_WRITE_OPTION` = 1;
// UNSUPPORTED Rust 3628:1: generic scalar type unsupported
// pub type WS_WRITE_TYPE_CALLBACK = Option<unsafe extern "system" fn(writer: *const WS_XML_WRITER, typemapping: WS_TYPE_MAPPING, descriptiondata: *const core::ffi::c_void, value: *const core::ffi::c_void, valuesize: u32, error: *const WS_ERROR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3629:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_WSZ_DESCRIPTION {
//     pub minCharCount: u32,
//     pub maxCharCount: u32,
// }

public const val `WS_WSZ_TYPE`: `WS_TYPE` = 17;
// UNSUPPORTED Rust 3636:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_XML_ATTRIBUTE {
//     pub singleQuote: u8,
//     pub isXmlNs: u8,
//     pub prefix: *mut WS_XML_STRING,
//     pub localName: *mut WS_XML_STRING,
//     pub ns: *mut WS_XML_STRING,
//     pub value: *mut WS_XML_TEXT,
// }

// UNSUPPORTED Rust 3646:1: declaration Impl has no candidate rule
// impl Default for WS_XML_ATTRIBUTE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_XML_ATTRIBUTE_FIELD_MAPPING`: `WS_FIELD_MAPPING` = 6;
// UNSUPPORTED Rust 3652:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_XML_BASE64_TEXT {
//     pub text: WS_XML_TEXT,
//     pub bytes: *mut u8,
//     pub length: u32,
// }

// UNSUPPORTED Rust 3659:1: declaration Impl has no candidate rule
// impl Default for WS_XML_BASE64_TEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3664:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_XML_BOOL_TEXT {
//     pub text: WS_XML_TEXT,
//     pub value: windows_sys::core::BOOL,
// }

public typealias `WS_XML_BUFFER` = Long;
// UNSUPPORTED Rust 3671:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_XML_BUFFER_PROPERTY {
//     pub id: WS_XML_BUFFER_PROPERTY_ID,
//     pub value: *mut core::ffi::c_void,
//     pub valueSize: u32,
// }

// UNSUPPORTED Rust 3678:1: declaration Impl has no candidate rule
// impl Default for WS_XML_BUFFER_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WS_XML_BUFFER_PROPERTY_ID` = Int;
public const val `WS_XML_BUFFER_TYPE`: `WS_TYPE` = 21;
public typealias `WS_XML_CANONICALIZATION_ALGORITHM` = Int;
// UNSUPPORTED Rust 3686:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_XML_CANONICALIZATION_INCLUSIVE_PREFIXES {
//     pub prefixCount: u32,
//     pub prefixes: *mut WS_XML_STRING,
// }

// UNSUPPORTED Rust 3692:1: declaration Impl has no candidate rule
// impl Default for WS_XML_CANONICALIZATION_INCLUSIVE_PREFIXES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3697:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_XML_CANONICALIZATION_PROPERTY {
//     pub id: WS_XML_CANONICALIZATION_PROPERTY_ID,
//     pub value: *mut core::ffi::c_void,
//     pub valueSize: u32,
// }

// UNSUPPORTED Rust 3704:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 3714:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_XML_COMMENT_NODE {
//     pub node: WS_XML_NODE,
//     pub value: WS_XML_STRING,
// }

// UNSUPPORTED Rust 3720:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_XML_DATETIME_TEXT {
//     pub text: WS_XML_TEXT,
//     pub value: WS_DATETIME,
// }

// UNSUPPORTED Rust 3726:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_XML_DECIMAL_TEXT {
//     pub text: WS_XML_TEXT,
//     pub value: super::super::Foundation::DECIMAL,
// }

// UNSUPPORTED Rust 3732:1: declaration Impl has no candidate rule
// impl Default for WS_XML_DECIMAL_TEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3737:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_XML_DICTIONARY {
//     pub guid: windows_sys::core::GUID,
//     pub strings: *mut WS_XML_STRING,
//     pub stringCount: u32,
//     pub isConst: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 3745:1: declaration Impl has no candidate rule
// impl Default for WS_XML_DICTIONARY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3750:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_XML_DOUBLE_TEXT {
//     pub text: WS_XML_TEXT,
//     pub value: f64,
// }

// UNSUPPORTED Rust 3756:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_XML_ELEMENT_NODE {
//     pub node: WS_XML_NODE,
//     pub prefix: *mut WS_XML_STRING,
//     pub localName: *mut WS_XML_STRING,
//     pub ns: *mut WS_XML_STRING,
//     pub attributeCount: u32,
//     pub attributes: *mut *mut WS_XML_ATTRIBUTE,
//     pub isEmpty: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 3767:1: declaration Impl has no candidate rule
// impl Default for WS_XML_ELEMENT_NODE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3772:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_XML_FLOAT_TEXT {
//     pub text: WS_XML_TEXT,
//     pub value: f32,
// }

// UNSUPPORTED Rust 3778:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_XML_GUID_TEXT {
//     pub text: WS_XML_TEXT,
//     pub value: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 3784:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_XML_INT32_TEXT {
//     pub text: WS_XML_TEXT,
//     pub value: i32,
// }

// UNSUPPORTED Rust 3790:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_XML_INT64_TEXT {
//     pub text: WS_XML_TEXT,
//     pub value: i64,
// }

// UNSUPPORTED Rust 3796:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_XML_LIST_TEXT {
//     pub text: WS_XML_TEXT,
//     pub itemCount: u32,
//     pub items: *mut *mut WS_XML_TEXT,
// }

// UNSUPPORTED Rust 3803:1: declaration Impl has no candidate rule
// impl Default for WS_XML_LIST_TEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3808:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_XML_NODE {
//     pub nodeType: WS_XML_NODE_TYPE,
// }

// UNSUPPORTED Rust 3813:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_XML_NODE_POSITION {
//     pub buffer: *mut WS_XML_BUFFER,
//     pub node: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 3819:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 3833:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_XML_QNAME {
//     pub localName: WS_XML_STRING,
//     pub ns: WS_XML_STRING,
// }

// UNSUPPORTED Rust 3839:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_XML_QNAME_DESCRIPTION {
//     pub minLocalNameByteCount: u32,
//     pub maxLocalNameByteCount: u32,
//     pub minNsByteCount: u32,
//     pub maxNsByteCount: u32,
// }

// UNSUPPORTED Rust 3847:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_XML_QNAME_TEXT {
//     pub text: WS_XML_TEXT,
//     pub prefix: *mut WS_XML_STRING,
//     pub localName: *mut WS_XML_STRING,
//     pub ns: *mut WS_XML_STRING,
// }

// UNSUPPORTED Rust 3855:1: declaration Impl has no candidate rule
// impl Default for WS_XML_QNAME_TEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_XML_QNAME_TYPE`: `WS_TYPE` = 20;
public typealias `WS_XML_READER` = Long;
// UNSUPPORTED Rust 3862:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_XML_READER_BINARY_ENCODING {
//     pub encoding: WS_XML_READER_ENCODING,
//     pub staticDictionary: *mut WS_XML_DICTIONARY,
//     pub dynamicDictionary: *mut WS_XML_DICTIONARY,
// }

// UNSUPPORTED Rust 3869:1: declaration Impl has no candidate rule
// impl Default for WS_XML_READER_BINARY_ENCODING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3874:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_XML_READER_BUFFER_INPUT {
//     pub input: WS_XML_READER_INPUT,
//     pub encodedData: *mut core::ffi::c_void,
//     pub encodedDataSize: u32,
// }

// UNSUPPORTED Rust 3881:1: declaration Impl has no candidate rule
// impl Default for WS_XML_READER_BUFFER_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3886:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_XML_READER_ENCODING {
//     pub encodingType: WS_XML_READER_ENCODING_TYPE,
// }

public typealias `WS_XML_READER_ENCODING_TYPE` = Int;
public const val `WS_XML_READER_ENCODING_TYPE_BINARY`: `WS_XML_READER_ENCODING_TYPE` = 2;
public const val `WS_XML_READER_ENCODING_TYPE_MTOM`: `WS_XML_READER_ENCODING_TYPE` = 3;
public const val `WS_XML_READER_ENCODING_TYPE_RAW`: `WS_XML_READER_ENCODING_TYPE` = 4;
public const val `WS_XML_READER_ENCODING_TYPE_TEXT`: `WS_XML_READER_ENCODING_TYPE` = 1;
// UNSUPPORTED Rust 3896:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_XML_READER_INPUT {
//     pub inputType: WS_XML_READER_INPUT_TYPE,
// }

public typealias `WS_XML_READER_INPUT_TYPE` = Int;
public const val `WS_XML_READER_INPUT_TYPE_BUFFER`: `WS_XML_READER_INPUT_TYPE` = 1;
public const val `WS_XML_READER_INPUT_TYPE_STREAM`: `WS_XML_READER_INPUT_TYPE` = 2;
// UNSUPPORTED Rust 3904:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_XML_READER_MTOM_ENCODING {
//     pub encoding: WS_XML_READER_ENCODING,
//     pub textEncoding: *mut WS_XML_READER_ENCODING,
//     pub readMimeHeader: windows_sys::core::BOOL,
//     pub startInfo: WS_STRING,
//     pub boundary: WS_STRING,
//     pub startUri: WS_STRING,
// }

// UNSUPPORTED Rust 3914:1: declaration Impl has no candidate rule
// impl Default for WS_XML_READER_MTOM_ENCODING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3919:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_XML_READER_PROPERTIES {
//     pub properties: *mut WS_XML_READER_PROPERTY,
//     pub propertyCount: u32,
// }

// UNSUPPORTED Rust 3925:1: declaration Impl has no candidate rule
// impl Default for WS_XML_READER_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3930:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_XML_READER_PROPERTY {
//     pub id: WS_XML_READER_PROPERTY_ID,
//     pub value: *mut core::ffi::c_void,
//     pub valueSize: u32,
// }

// UNSUPPORTED Rust 3937:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 3958:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_XML_READER_RAW_ENCODING {
//     pub encoding: WS_XML_READER_ENCODING,
// }

// UNSUPPORTED Rust 3963:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_XML_READER_STREAM_INPUT {
//     pub input: WS_XML_READER_INPUT,
//     pub readCallback: WS_READ_CALLBACK,
//     pub readCallbackState: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 3970:1: declaration Impl has no candidate rule
// impl Default for WS_XML_READER_STREAM_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3975:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_XML_READER_TEXT_ENCODING {
//     pub encoding: WS_XML_READER_ENCODING,
//     pub charSet: WS_CHARSET,
// }

// UNSUPPORTED Rust 3981:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_XML_SECURITY_TOKEN_PROPERTY {
//     pub id: WS_XML_SECURITY_TOKEN_PROPERTY_ID,
//     pub value: *mut core::ffi::c_void,
//     pub valueSize: u32,
// }

// UNSUPPORTED Rust 3988:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 3998:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_XML_STRING {
//     pub length: u32,
//     pub bytes: *mut u8,
//     pub dictionary: *mut WS_XML_DICTIONARY,
//     pub id: u32,
// }

// UNSUPPORTED Rust 4006:1: declaration Impl has no candidate rule
// impl Default for WS_XML_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4011:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_XML_STRING_DESCRIPTION {
//     pub minByteCount: u32,
//     pub maxByteCount: u32,
// }

public const val `WS_XML_STRING_TYPE`: `WS_TYPE` = 19;
// UNSUPPORTED Rust 4018:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_XML_TEXT {
//     pub textType: WS_XML_TEXT_TYPE,
// }

// UNSUPPORTED Rust 4023:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_XML_TEXT_NODE {
//     pub node: WS_XML_NODE,
//     pub text: *mut WS_XML_TEXT,
// }

// UNSUPPORTED Rust 4029:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 4051:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_XML_TIMESPAN_TEXT {
//     pub text: WS_XML_TEXT,
//     pub value: WS_TIMESPAN,
// }

// UNSUPPORTED Rust 4057:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_XML_TOKEN_MESSAGE_SECURITY_BINDING {
//     pub binding: WS_SECURITY_BINDING,
//     pub bindingUsage: WS_MESSAGE_SECURITY_USAGE,
//     pub xmlToken: *mut WS_SECURITY_TOKEN,
// }

// UNSUPPORTED Rust 4064:1: declaration Impl has no candidate rule
// impl Default for WS_XML_TOKEN_MESSAGE_SECURITY_BINDING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WS_XML_TOKEN_MESSAGE_SECURITY_BINDING_TYPE`: `WS_SECURITY_BINDING_TYPE` = 6;
// UNSUPPORTED Rust 4070:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_XML_UINT64_TEXT {
//     pub text: WS_XML_TEXT,
//     pub value: u64,
// }

// UNSUPPORTED Rust 4076:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_XML_UNIQUE_ID_TEXT {
//     pub text: WS_XML_TEXT,
//     pub value: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 4082:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_XML_UTF16_TEXT {
//     pub text: WS_XML_TEXT,
//     pub bytes: *mut u8,
//     pub byteCount: u32,
// }

// UNSUPPORTED Rust 4089:1: declaration Impl has no candidate rule
// impl Default for WS_XML_UTF16_TEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4094:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_XML_UTF8_TEXT {
//     pub text: WS_XML_TEXT,
//     pub value: WS_XML_STRING,
// }

public typealias `WS_XML_WRITER` = Long;
// UNSUPPORTED Rust 4101:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_XML_WRITER_BINARY_ENCODING {
//     pub encoding: WS_XML_WRITER_ENCODING,
//     pub staticDictionary: *mut WS_XML_DICTIONARY,
//     pub dynamicStringCallback: WS_DYNAMIC_STRING_CALLBACK,
//     pub dynamicStringCallbackState: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 4109:1: declaration Impl has no candidate rule
// impl Default for WS_XML_WRITER_BINARY_ENCODING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4114:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_XML_WRITER_BUFFER_OUTPUT {
//     pub output: WS_XML_WRITER_OUTPUT,
// }

// UNSUPPORTED Rust 4119:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_XML_WRITER_ENCODING {
//     pub encodingType: WS_XML_WRITER_ENCODING_TYPE,
// }

public typealias `WS_XML_WRITER_ENCODING_TYPE` = Int;
public const val `WS_XML_WRITER_ENCODING_TYPE_BINARY`: `WS_XML_WRITER_ENCODING_TYPE` = 2;
public const val `WS_XML_WRITER_ENCODING_TYPE_MTOM`: `WS_XML_WRITER_ENCODING_TYPE` = 3;
public const val `WS_XML_WRITER_ENCODING_TYPE_RAW`: `WS_XML_WRITER_ENCODING_TYPE` = 4;
public const val `WS_XML_WRITER_ENCODING_TYPE_TEXT`: `WS_XML_WRITER_ENCODING_TYPE` = 1;
// UNSUPPORTED Rust 4129:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_XML_WRITER_MTOM_ENCODING {
//     pub encoding: WS_XML_WRITER_ENCODING,
//     pub textEncoding: *mut WS_XML_WRITER_ENCODING,
//     pub writeMimeHeader: windows_sys::core::BOOL,
//     pub boundary: WS_STRING,
//     pub startInfo: WS_STRING,
//     pub startUri: WS_STRING,
//     pub maxInlineByteCount: u32,
// }

// UNSUPPORTED Rust 4140:1: declaration Impl has no candidate rule
// impl Default for WS_XML_WRITER_MTOM_ENCODING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4145:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_XML_WRITER_OUTPUT {
//     pub outputType: WS_XML_WRITER_OUTPUT_TYPE,
// }

public typealias `WS_XML_WRITER_OUTPUT_TYPE` = Int;
public const val `WS_XML_WRITER_OUTPUT_TYPE_BUFFER`: `WS_XML_WRITER_OUTPUT_TYPE` = 1;
public const val `WS_XML_WRITER_OUTPUT_TYPE_STREAM`: `WS_XML_WRITER_OUTPUT_TYPE` = 2;
// UNSUPPORTED Rust 4153:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_XML_WRITER_PROPERTIES {
//     pub properties: *mut WS_XML_WRITER_PROPERTY,
//     pub propertyCount: u32,
// }

// UNSUPPORTED Rust 4159:1: declaration Impl has no candidate rule
// impl Default for WS_XML_WRITER_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4164:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_XML_WRITER_PROPERTY {
//     pub id: WS_XML_WRITER_PROPERTY_ID,
//     pub value: *mut core::ffi::c_void,
//     pub valueSize: u32,
// }

// UNSUPPORTED Rust 4171:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 4196:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_XML_WRITER_RAW_ENCODING {
//     pub encoding: WS_XML_WRITER_ENCODING,
// }

// UNSUPPORTED Rust 4201:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WS_XML_WRITER_STREAM_OUTPUT {
//     pub output: WS_XML_WRITER_OUTPUT,
//     pub writeCallback: WS_WRITE_CALLBACK,
//     pub writeCallbackState: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 4208:1: declaration Impl has no candidate rule
// impl Default for WS_XML_WRITER_STREAM_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4213:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WS_XML_WRITER_TEXT_ENCODING {
//     pub encoding: WS_XML_WRITER_ENCODING,
//     pub charSet: WS_CHARSET,
// }

