// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpAddRequestHeaders; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpAddRequestHeaders`(`hrequest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszheaders` : `windows_sys`.`core`.`PCWSTR`, `dwheaderslength` : UInt, `dwmodifiers` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpAddRequestHeadersEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpAddRequestHeadersEx`(`hrequest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwmodifiers` : UInt, `ullflags` : ULong, `ullextra` : ULong, `cheaders` : UInt, `pheaders` : /* Rust *const */ kotlinx.cinterop.CPointer<`WINHTTP_EXTENDED_HEADER`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpCheckPlatform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpCheckPlatform`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpCloseHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpCloseHandle`(`hinternet` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpConnect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpConnect`(`hsession` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pswzservername` : `windows_sys`.`core`.`PCWSTR`, `nserverport` : UShort, `dwreserved` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpCrackUrl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpCrackUrl`(`pwszurl` : `windows_sys`.`core`.`PCWSTR`, `dwurllength` : UInt, `dwflags` : UInt, `lpurlcomponents` : /* Rust *mut */ kotlinx.cinterop.CPointer<`URL_COMPONENTS`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpCreateProxyResolver; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpCreateProxyResolver`(`hsession` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phresolver` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpCreateUrl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpCreateUrl`(`lpurlcomponents` : /* Rust *const */ kotlinx.cinterop.CPointer<`URL_COMPONENTS`>?, `dwflags` : `WIN_HTTP_CREATE_URL_FLAGS`, `pwszurl` : `windows_sys`.`core`.`PWSTR`, `pdwurllength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpDetectAutoProxyConfigUrl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpDetectAutoProxyConfigUrl`(`dwautodetectflags` : UInt, `ppwstrautoconfigurl` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpFreeProxyResult; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpFreeProxyResult`(`pproxyresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WINHTTP_PROXY_RESULT`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpFreeProxyResultEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpFreeProxyResultEx`(`pproxyresultex` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WINHTTP_PROXY_RESULT_EX`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpFreeProxySettings; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpFreeProxySettings`(`pwinhttpproxysettings` : /* Rust *const */ kotlinx.cinterop.CPointer<`WINHTTP_PROXY_SETTINGS`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpFreeProxySettingsEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpFreeProxySettingsEx`(`proxysettingstype` : `WINHTTP_PROXY_SETTINGS_TYPE`, `pproxysettingsex` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpFreeQueryConnectionGroupResult; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpFreeQueryConnectionGroupResult`(`presult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WINHTTP_QUERY_CONNECTION_GROUP_RESULT`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpGetDefaultProxyConfiguration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpGetDefaultProxyConfiguration`(`pproxyinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WINHTTP_PROXY_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpGetIEProxyConfigForCurrentUser; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpGetIEProxyConfigForCurrentUser`(`pproxyconfig` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WINHTTP_CURRENT_USER_IE_PROXY_CONFIG`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpGetProxyForUrl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpGetProxyForUrl`(`hsession` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpcwszurl` : `windows_sys`.`core`.`PCWSTR`, `pautoproxyoptions` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WINHTTP_AUTOPROXY_OPTIONS`>?, `pproxyinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WINHTTP_PROXY_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpGetProxyForUrlEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpGetProxyForUrlEx`(`hresolver` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pcwszurl` : `windows_sys`.`core`.`PCWSTR`, `pautoproxyoptions` : /* Rust *const */ kotlinx.cinterop.CPointer<`WINHTTP_AUTOPROXY_OPTIONS`>?, `pcontext` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpGetProxyForUrlEx2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpGetProxyForUrlEx2`(`hresolver` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pcwszurl` : `windows_sys`.`core`.`PCWSTR`, `pautoproxyoptions` : /* Rust *const */ kotlinx.cinterop.CPointer<`WINHTTP_AUTOPROXY_OPTIONS`>?, `cbinterfaceselectioncontext` : UInt, `pinterfaceselectioncontext` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pcontext` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpGetProxyResult; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpGetProxyResult`(`hresolver` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pproxyresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WINHTTP_PROXY_RESULT`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpGetProxyResultEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpGetProxyResultEx`(`hresolver` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pproxyresultex` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WINHTTP_PROXY_RESULT_EX`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpGetProxySettingsEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpGetProxySettingsEx`(`hresolver` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `proxysettingstype` : `WINHTTP_PROXY_SETTINGS_TYPE`, `pproxysettingsparam` : /* Rust *const */ kotlinx.cinterop.CPointer<`WINHTTP_PROXY_SETTINGS_PARAM`>?, `pcontext` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpGetProxySettingsResultEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpGetProxySettingsResultEx`(`hresolver` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pproxysettingsex` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpGetProxySettingsVersion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpGetProxySettingsVersion`(`hsession` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pdwproxysettingsversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpOpen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpOpen`(`pszagentw` : `windows_sys`.`core`.`PCWSTR`, `dwaccesstype` : `WINHTTP_ACCESS_TYPE`, `pszproxyw` : `windows_sys`.`core`.`PCWSTR`, `pszproxybypassw` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpOpenRequest; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpOpenRequest`(`hconnect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwszverb` : `windows_sys`.`core`.`PCWSTR`, `pwszobjectname` : `windows_sys`.`core`.`PCWSTR`, `pwszversion` : `windows_sys`.`core`.`PCWSTR`, `pwszreferrer` : `windows_sys`.`core`.`PCWSTR`, `ppwszaccepttypes` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, `dwflags` : `WINHTTP_OPEN_REQUEST_FLAGS`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpQueryAuthSchemes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpQueryAuthSchemes`(`hrequest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpdwsupportedschemes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwfirstscheme` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwauthtarget` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpQueryConnectionGroup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpQueryConnectionGroup`(`hinternet` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pguidconnection` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ullflags` : ULong, `ppresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WINHTTP_QUERY_CONNECTION_GROUP_RESULT`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpQueryDataAvailable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpQueryDataAvailable`(`hrequest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpdwnumberofbytesavailable` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpQueryHeaders; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpQueryHeaders`(`hrequest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwinfolevel` : UInt, `pwszname` : `windows_sys`.`core`.`PCWSTR`, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpdwbufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpQueryHeadersEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpQueryHeadersEx`(`hrequest` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwinfolevel` : UInt, `ullflags` : ULong, `uicodepage` : UInt, `pdwindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pheadername` : /* Rust *const */ kotlinx.cinterop.CPointer<`WINHTTP_HEADER_NAME`>?, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pdwbufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppheaders` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WINHTTP_EXTENDED_HEADER`>>?, `pdwheaderscount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpQueryOption; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpQueryOption`(`hinternet` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwoption` : UInt, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpdwbufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpReadData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpReadData`(`hrequest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwnumberofbytestoread` : UInt, `lpdwnumberofbytesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpReadDataEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpReadDataEx`(`hrequest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwnumberofbytestoread` : UInt, `lpdwnumberofbytesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ullflags` : ULong, `cbproperty` : UInt, `pvproperty` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpReadProxySettings; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpReadProxySettings`(`hsession` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pcwszconnectionname` : `windows_sys`.`core`.`PCWSTR`, `ffallbacktodefaultsettings` : `windows_sys`.`core`.`BOOL`, `fsetautodiscoverfordefaultsettings` : `windows_sys`.`core`.`BOOL`, `pdwsettingsversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pfdefaultsettingsarereturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `pwinhttpproxysettings` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WINHTTP_PROXY_SETTINGS`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpReceiveResponse; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpReceiveResponse`(`hrequest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpreserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpRegisterProxyChangeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpRegisterProxyChangeNotification`(`ullflags` : ULong, `pfncallback` : `WINHTTP_PROXY_CHANGE_CALLBACK`, `pvcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `hregistration` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpResetAutoProxy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpResetAutoProxy`(`hsession` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwflags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpSendRequest; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpSendRequest`(`hrequest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszheaders` : `windows_sys`.`core`.`PCWSTR`, `dwheaderslength` : UInt, `lpoptional` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwoptionallength` : UInt, `dwtotallength` : UInt, `dwcontext` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpSetCredentials; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpSetCredentials`(`hrequest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `authtargets` : UInt, `authscheme` : UInt, `pwszusername` : `windows_sys`.`core`.`PCWSTR`, `pwszpassword` : `windows_sys`.`core`.`PCWSTR`, `pauthparams` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpSetDefaultProxyConfiguration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpSetDefaultProxyConfiguration`(`pproxyinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WINHTTP_PROXY_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpSetOption; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpSetOption`(`hinternet` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwoption` : UInt, `lpbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwbufferlength` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpSetProxySettingsPerUser; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpSetProxySettingsPerUser`(`fproxysettingsperuser` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpSetStatusCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpSetStatusCallback`(`hinternet` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpfninternetcallback` : `WINHTTP_STATUS_CALLBACK`, `dwnotificationflags` : UInt, `dwreserved` : ULong) : `WINHTTP_STATUS_CALLBACK`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpSetTimeouts; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpSetTimeouts`(`hinternet` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `nresolvetimeout` : Int, `nconnecttimeout` : Int, `nsendtimeout` : Int, `nreceivetimeout` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpTimeFromSystemTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpTimeFromSystemTime`(`pst` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?, `pwsztime` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpTimeToSystemTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpTimeToSystemTime`(`pwsztime` : `windows_sys`.`core`.`PCWSTR`, `pst` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpUnregisterProxyChangeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpUnregisterProxyChangeNotification`(`hregistration` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpWebSocketClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpWebSocketClose`(`hwebsocket` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `usstatus` : UShort, `pvreason` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwreasonlength` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpWebSocketCompleteUpgrade; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpWebSocketCompleteUpgrade`(`hrequest` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pcontext` : ULong) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpWebSocketQueryCloseStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpWebSocketQueryCloseStatus`(`hwebsocket` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pusstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pvreason` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwreasonlength` : UInt, `pdwreasonlengthconsumed` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpWebSocketReceive; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpWebSocketReceive`(`hwebsocket` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pvbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwbufferlength` : UInt, `pdwbytesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pebuffertype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WINHTTP_WEB_SOCKET_BUFFER_TYPE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpWebSocketSend; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpWebSocketSend`(`hwebsocket` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ebuffertype` : `WINHTTP_WEB_SOCKET_BUFFER_TYPE`, `pvbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwbufferlength` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpWebSocketShutdown; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpWebSocketShutdown`(`hwebsocket` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `usstatus` : UShort, `pvreason` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwreasonlength` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpWriteData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpWriteData`(`hrequest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwnumberofbytestowrite` : UInt, `lpdwnumberofbyteswritten` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhttp.dll, ABI=system, export=WinHttpWriteProxySettings; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinHttpWriteProxySettings`(`hsession` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fforceupdate` : `windows_sys`.`core`.`BOOL`, `pwinhttpproxysettings` : /* Rust *const */ kotlinx.cinterop.CPointer<`WINHTTP_PROXY_SETTINGS`>?) : UInt
public const val `API_GET_PROXY_FOR_URL`: UInt = 6u;
public const val `API_GET_PROXY_SETTINGS`: UInt = 7u;
public const val `API_QUERY_DATA_AVAILABLE`: UInt = 2u;
public const val `API_READ_DATA`: UInt = 3u;
public const val `API_RECEIVE_RESPONSE`: UInt = 1u;
public const val `API_SEND_REQUEST`: UInt = 5u;
public const val `API_WRITE_DATA`: UInt = 4u;
public const val `AutoLogonPolicy_Always`: `WinHttpRequestAutoLogonPolicy` = 0;
public const val `AutoLogonPolicy_Never`: `WinHttpRequestAutoLogonPolicy` = 2;
public const val `AutoLogonPolicy_OnlyIfBypassProxy`: `WinHttpRequestAutoLogonPolicy` = 1;
public const val `ERROR_WINHTTP_AUTODETECTION_FAILED`: UInt = 12180u;
public const val `ERROR_WINHTTP_AUTO_PROXY_SERVICE_ERROR`: UInt = 12178u;
public const val `ERROR_WINHTTP_BAD_AUTO_PROXY_SCRIPT`: UInt = 12166u;
public const val `ERROR_WINHTTP_CANNOT_CALL_AFTER_OPEN`: UInt = 12103u;
public const val `ERROR_WINHTTP_CANNOT_CALL_AFTER_SEND`: UInt = 12102u;
public const val `ERROR_WINHTTP_CANNOT_CALL_BEFORE_OPEN`: UInt = 12100u;
public const val `ERROR_WINHTTP_CANNOT_CALL_BEFORE_SEND`: UInt = 12101u;
public const val `ERROR_WINHTTP_CANNOT_CONNECT`: UInt = 12029u;
public const val `ERROR_WINHTTP_CHUNKED_ENCODING_HEADER_SIZE_OVERFLOW`: UInt = 12183u;
public const val `ERROR_WINHTTP_CLIENT_AUTH_CERT_NEEDED`: UInt = 12044u;
public const val `ERROR_WINHTTP_CLIENT_AUTH_CERT_NEEDED_PROXY`: UInt = 12187u;
public const val `ERROR_WINHTTP_CLIENT_CERT_NO_ACCESS_PRIVATE_KEY`: UInt = 12186u;
public const val `ERROR_WINHTTP_CLIENT_CERT_NO_PRIVATE_KEY`: UInt = 12185u;
public const val `ERROR_WINHTTP_CONNECTION_ERROR`: UInt = 12030u;
public const val `ERROR_WINHTTP_FEATURE_DISABLED`: UInt = 12192u;
public const val `ERROR_WINHTTP_GLOBAL_CALLBACK_FAILED`: UInt = 12191u;
public const val `ERROR_WINHTTP_HEADER_ALREADY_EXISTS`: UInt = 12155u;
public const val `ERROR_WINHTTP_HEADER_COUNT_EXCEEDED`: UInt = 12181u;
public const val `ERROR_WINHTTP_HEADER_NOT_FOUND`: UInt = 12150u;
public const val `ERROR_WINHTTP_HEADER_SIZE_OVERFLOW`: UInt = 12182u;
public const val `ERROR_WINHTTP_HTTP_PROTOCOL_MISMATCH`: UInt = 12190u;
public const val `ERROR_WINHTTP_INCORRECT_HANDLE_STATE`: UInt = 12019u;
public const val `ERROR_WINHTTP_INCORRECT_HANDLE_TYPE`: UInt = 12018u;
public const val `ERROR_WINHTTP_INTERNAL_ERROR`: UInt = 12004u;
public const val `ERROR_WINHTTP_INVALID_HEADER`: UInt = 12153u;
public const val `ERROR_WINHTTP_INVALID_OPTION`: UInt = 12009u;
public const val `ERROR_WINHTTP_INVALID_QUERY_REQUEST`: UInt = 12154u;
public const val `ERROR_WINHTTP_INVALID_SERVER_RESPONSE`: UInt = 12152u;
public const val `ERROR_WINHTTP_INVALID_URL`: UInt = 12005u;
public const val `ERROR_WINHTTP_LOGIN_FAILURE`: UInt = 12015u;
public const val `ERROR_WINHTTP_NAME_NOT_RESOLVED`: UInt = 12007u;
public const val `ERROR_WINHTTP_NOT_INITIALIZED`: UInt = 12172u;
public const val `ERROR_WINHTTP_OPERATION_CANCELLED`: UInt = 12017u;
public const val `ERROR_WINHTTP_OPTION_NOT_SETTABLE`: UInt = 12011u;
public const val `ERROR_WINHTTP_OUT_OF_HANDLES`: UInt = 12001u;
public const val `ERROR_WINHTTP_REDIRECT_FAILED`: UInt = 12156u;
public const val `ERROR_WINHTTP_RESEND_REQUEST`: UInt = 12032u;
public const val `ERROR_WINHTTP_RESERVED_189`: UInt = 12189u;
public const val `ERROR_WINHTTP_RESPONSE_DRAIN_OVERFLOW`: UInt = 12184u;
public const val `ERROR_WINHTTP_SCRIPT_EXECUTION_ERROR`: UInt = 12177u;
public const val `ERROR_WINHTTP_SECURE_CERT_CN_INVALID`: UInt = 12038u;
public const val `ERROR_WINHTTP_SECURE_CERT_DATE_INVALID`: UInt = 12037u;
public const val `ERROR_WINHTTP_SECURE_CERT_REVOKED`: UInt = 12170u;
public const val `ERROR_WINHTTP_SECURE_CERT_REV_FAILED`: UInt = 12057u;
public const val `ERROR_WINHTTP_SECURE_CERT_WRONG_USAGE`: UInt = 12179u;
public const val `ERROR_WINHTTP_SECURE_CHANNEL_ERROR`: UInt = 12157u;
public const val `ERROR_WINHTTP_SECURE_FAILURE`: UInt = 12175u;
public const val `ERROR_WINHTTP_SECURE_FAILURE_PROXY`: UInt = 12188u;
public const val `ERROR_WINHTTP_SECURE_INVALID_CA`: UInt = 12045u;
public const val `ERROR_WINHTTP_SECURE_INVALID_CERT`: UInt = 12169u;
public const val `ERROR_WINHTTP_SHUTDOWN`: UInt = 12012u;
public const val `ERROR_WINHTTP_TIMEOUT`: UInt = 12002u;
public const val `ERROR_WINHTTP_UNABLE_TO_DOWNLOAD_SCRIPT`: UInt = 12167u;
public const val `ERROR_WINHTTP_UNHANDLED_SCRIPT_TYPE`: UInt = 12176u;
public const val `ERROR_WINHTTP_UNRECOGNIZED_SCHEME`: UInt = 12006u;
public const val `HTTPREQUEST_PROXYSETTING_DEFAULT`: UInt = 0u;
public const val `HTTPREQUEST_PROXYSETTING_DIRECT`: UInt = 1u;
public const val `HTTPREQUEST_PROXYSETTING_PRECONFIG`: UInt = 0u;
public const val `HTTPREQUEST_PROXYSETTING_PROXY`: UInt = 2u;
public const val `HTTPREQUEST_SETCREDENTIALS_FOR_PROXY`: UInt = 1u;
public const val `HTTPREQUEST_SETCREDENTIALS_FOR_SERVER`: UInt = 0u;
public const val `HTTP_STATUS_ACCEPTED`: UInt = 202u;
public const val `HTTP_STATUS_AMBIGUOUS`: UInt = 300u;
public const val `HTTP_STATUS_BAD_GATEWAY`: UInt = 502u;
public const val `HTTP_STATUS_BAD_METHOD`: UInt = 405u;
public const val `HTTP_STATUS_BAD_REQUEST`: UInt = 400u;
public const val `HTTP_STATUS_CONFLICT`: UInt = 409u;
public const val `HTTP_STATUS_CONTINUE`: UInt = 100u;
public const val `HTTP_STATUS_CREATED`: UInt = 201u;
public const val `HTTP_STATUS_DENIED`: UInt = 401u;
public const val `HTTP_STATUS_FIRST`: UInt = 100u;
public const val `HTTP_STATUS_FORBIDDEN`: UInt = 403u;
public const val `HTTP_STATUS_GATEWAY_TIMEOUT`: UInt = 504u;
public const val `HTTP_STATUS_GONE`: UInt = 410u;
public const val `HTTP_STATUS_LAST`: UInt = 505u;
public const val `HTTP_STATUS_LENGTH_REQUIRED`: UInt = 411u;
public const val `HTTP_STATUS_MOVED`: UInt = 301u;
public const val `HTTP_STATUS_NONE_ACCEPTABLE`: UInt = 406u;
public const val `HTTP_STATUS_NOT_FOUND`: UInt = 404u;
public const val `HTTP_STATUS_NOT_MODIFIED`: UInt = 304u;
public const val `HTTP_STATUS_NOT_SUPPORTED`: UInt = 501u;
public const val `HTTP_STATUS_NO_CONTENT`: UInt = 204u;
public const val `HTTP_STATUS_OK`: UInt = 200u;
public const val `HTTP_STATUS_PARTIAL`: UInt = 203u;
public const val `HTTP_STATUS_PARTIAL_CONTENT`: UInt = 206u;
public const val `HTTP_STATUS_PAYMENT_REQ`: UInt = 402u;
public const val `HTTP_STATUS_PERMANENT_REDIRECT`: UInt = 308u;
public const val `HTTP_STATUS_PRECOND_FAILED`: UInt = 412u;
public const val `HTTP_STATUS_PROXY_AUTH_REQ`: UInt = 407u;
public const val `HTTP_STATUS_REDIRECT`: UInt = 302u;
public const val `HTTP_STATUS_REDIRECT_KEEP_VERB`: UInt = 307u;
public const val `HTTP_STATUS_REDIRECT_METHOD`: UInt = 303u;
public const val `HTTP_STATUS_REQUEST_TIMEOUT`: UInt = 408u;
public const val `HTTP_STATUS_REQUEST_TOO_LARGE`: UInt = 413u;
public const val `HTTP_STATUS_RESET_CONTENT`: UInt = 205u;
public const val `HTTP_STATUS_RETRY_WITH`: UInt = 449u;
public const val `HTTP_STATUS_SERVER_ERROR`: UInt = 500u;
public const val `HTTP_STATUS_SERVICE_UNAVAIL`: UInt = 503u;
public const val `HTTP_STATUS_SWITCH_PROTOCOLS`: UInt = 101u;
public const val `HTTP_STATUS_UNSUPPORTED_MEDIA`: UInt = 415u;
public const val `HTTP_STATUS_URI_TOO_LONG`: UInt = 414u;
public const val `HTTP_STATUS_USE_PROXY`: UInt = 305u;
public const val `HTTP_STATUS_VERSION_NOT_SUP`: UInt = 505u;
public const val `HTTP_STATUS_WEBDAV_MULTI_STATUS`: UInt = 207u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_VERSION_INFO` (
    public var `dwMajorVersion`: UInt,
    public var `dwMinorVersion`: UInt,
)
public const val `ICU_BROWSER_MODE`: UInt = 33554432u;
public const val `ICU_DECODE`: `WIN_HTTP_CREATE_URL_FLAGS` = 268435456u;
public const val `ICU_ENCODE_PERCENT`: UInt = 4096u;
public const val `ICU_ENCODE_SPACES_ONLY`: UInt = 67108864u;
public const val `ICU_ESCAPE`: `WIN_HTTP_CREATE_URL_FLAGS` = 2147483648u;
public const val `ICU_ESCAPE_AUTHORITY`: UInt = 8192u;
public const val `ICU_NO_ENCODE`: UInt = 536870912u;
public const val `ICU_NO_META`: UInt = 134217728u;
public const val `ICU_REJECT_USERPWD`: `WIN_HTTP_CREATE_URL_FLAGS` = 16384u;
public const val `INTERNET_DEFAULT_HTTPS_PORT`: UShort = 443u;
public const val `INTERNET_DEFAULT_HTTP_PORT`: UShort = 80u;
public const val `INTERNET_DEFAULT_PORT`: UShort = 0u;
public const val `NETWORKING_KEY_BUFSIZE`: UInt = 128u;
public const val `SECURITY_FLAG_IGNORE_CERT_CN_INVALID`: UInt = 4096u;
public const val `SECURITY_FLAG_IGNORE_CERT_DATE_INVALID`: UInt = 8192u;
public const val `SECURITY_FLAG_IGNORE_CERT_WRONG_USAGE`: UInt = 512u;
public const val `SECURITY_FLAG_IGNORE_UNKNOWN_CA`: UInt = 256u;
public const val `SECURITY_FLAG_SECURE`: UInt = 1u;
public const val `SECURITY_FLAG_STRENGTH_MEDIUM`: UInt = 1073741824u;
public const val `SECURITY_FLAG_STRENGTH_STRONG`: UInt = 536870912u;
public const val `SECURITY_FLAG_STRENGTH_WEAK`: UInt = 268435456u;
public const val `SecureProtocol_ALL`: `WinHttpRequestSecureProtocols` = 168;
public const val `SecureProtocol_SSL2`: `WinHttpRequestSecureProtocols` = 8;
public const val `SecureProtocol_SSL3`: `WinHttpRequestSecureProtocols` = 32;
public const val `SecureProtocol_TLS1`: `WinHttpRequestSecureProtocols` = 128;
public const val `SecureProtocol_TLS1_1`: `WinHttpRequestSecureProtocols` = 512;
public const val `SecureProtocol_TLS1_2`: `WinHttpRequestSecureProtocols` = 2048;
public const val `SslErrorFlag_CertCNInvalid`: `WinHttpRequestSslErrorFlags` = 4096;
public const val `SslErrorFlag_CertDateInvalid`: `WinHttpRequestSslErrorFlags` = 8192;
public const val `SslErrorFlag_CertWrongUsage`: `WinHttpRequestSslErrorFlags` = 512;
public const val `SslErrorFlag_Ignore_All`: `WinHttpRequestSslErrorFlags` = 13056;
public const val `SslErrorFlag_UnknownCA`: `WinHttpRequestSslErrorFlags` = 256;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `URL_COMPONENTS` (
    public var `dwStructSize`: UInt,
    public var `lpszScheme`: `windows_sys`.`core`.`PWSTR`,
    public var `dwSchemeLength`: UInt,
    public var `nScheme`: `WINHTTP_INTERNET_SCHEME`,
    public var `lpszHostName`: `windows_sys`.`core`.`PWSTR`,
    public var `dwHostNameLength`: UInt,
    public var `nPort`: UShort,
    public var `lpszUserName`: `windows_sys`.`core`.`PWSTR`,
    public var `dwUserNameLength`: UInt,
    public var `lpszPassword`: `windows_sys`.`core`.`PWSTR`,
    public var `dwPasswordLength`: UInt,
    public var `lpszUrlPath`: `windows_sys`.`core`.`PWSTR`,
    public var `dwUrlPathLength`: UInt,
    public var `lpszExtraInfo`: `windows_sys`.`core`.`PWSTR`,
    public var `dwExtraInfoLength`: UInt,
)
// UNSUPPORTED Rust 228:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for URL_COMPONENTS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WINHTTP_ACCESS_TYPE` = UInt;
public const val `WINHTTP_ACCESS_TYPE_AUTOMATIC_PROXY`: `WINHTTP_ACCESS_TYPE` = 4u;
public const val `WINHTTP_ACCESS_TYPE_DEFAULT_PROXY`: `WINHTTP_ACCESS_TYPE` = 0u;
public const val `WINHTTP_ACCESS_TYPE_NAMED_PROXY`: `WINHTTP_ACCESS_TYPE` = 3u;
public const val `WINHTTP_ACCESS_TYPE_NO_PROXY`: `WINHTTP_ACCESS_TYPE` = 1u;
public const val `WINHTTP_ADDREQ_FLAGS_MASK`: UInt = 4294901760u;
public const val `WINHTTP_ADDREQ_FLAG_ADD`: UInt = 536870912u;
public const val `WINHTTP_ADDREQ_FLAG_ADD_IF_NEW`: UInt = 268435456u;
public const val `WINHTTP_ADDREQ_FLAG_COALESCE`: UInt = 1073741824u;
public const val `WINHTTP_ADDREQ_FLAG_COALESCE_WITH_COMMA`: UInt = 1073741824u;
public const val `WINHTTP_ADDREQ_FLAG_COALESCE_WITH_SEMICOLON`: UInt = 16777216u;
public const val `WINHTTP_ADDREQ_FLAG_REPLACE`: UInt = 2147483648u;
public const val `WINHTTP_ADDREQ_INDEX_MASK`: UInt = 65535u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINHTTP_ASYNC_RESULT` (
    public var `dwResult`: ULong,
    public var `dwError`: UInt,
)
public const val `WINHTTP_AUTH_SCHEME_BASIC`: `WINHTTP_CREDS_AUTHSCHEME` = 1u;
public const val `WINHTTP_AUTH_SCHEME_DIGEST`: UInt = 8u;
public const val `WINHTTP_AUTH_SCHEME_NEGOTIATE`: `WINHTTP_CREDS_AUTHSCHEME` = 16u;
public const val `WINHTTP_AUTH_SCHEME_NTLM`: `WINHTTP_CREDS_AUTHSCHEME` = 2u;
public const val `WINHTTP_AUTH_SCHEME_PASSPORT`: UInt = 4u;
public const val `WINHTTP_AUTH_TARGET_PROXY`: UInt = 1u;
public const val `WINHTTP_AUTH_TARGET_SERVER`: UInt = 0u;
public const val `WINHTTP_AUTOLOGON_SECURITY_LEVEL_DEFAULT`: UInt = 0u;
public const val `WINHTTP_AUTOLOGON_SECURITY_LEVEL_HIGH`: UInt = 2u;
public const val `WINHTTP_AUTOLOGON_SECURITY_LEVEL_LOW`: UInt = 1u;
public const val `WINHTTP_AUTOLOGON_SECURITY_LEVEL_MAX`: UInt = 3u;
public const val `WINHTTP_AUTOLOGON_SECURITY_LEVEL_MEDIUM`: UInt = 0u;
public const val `WINHTTP_AUTOLOGON_SECURITY_LEVEL_PROXY_ONLY`: UInt = 3u;
public const val `WINHTTP_AUTOPROXY_ALLOW_AUTOCONFIG`: UInt = 256u;
public const val `WINHTTP_AUTOPROXY_ALLOW_CM`: UInt = 1024u;
public const val `WINHTTP_AUTOPROXY_ALLOW_STATIC`: UInt = 512u;
public const val `WINHTTP_AUTOPROXY_AUTO_DETECT`: UInt = 1u;
public const val `WINHTTP_AUTOPROXY_CONFIG_URL`: UInt = 2u;
public const val `WINHTTP_AUTOPROXY_HOST_KEEPCASE`: UInt = 4u;
public const val `WINHTTP_AUTOPROXY_HOST_LOWERCASE`: UInt = 8u;
public const val `WINHTTP_AUTOPROXY_NO_CACHE_CLIENT`: UInt = 524288u;
public const val `WINHTTP_AUTOPROXY_NO_CACHE_SVC`: UInt = 1048576u;
public const val `WINHTTP_AUTOPROXY_NO_DIRECTACCESS`: UInt = 262144u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINHTTP_AUTOPROXY_OPTIONS` (
    public var `dwFlags`: UInt,
    public var `dwAutoDetectFlags`: UInt,
    public var `lpszAutoConfigUrl`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpvReserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwReserved`: UInt,
    public var `fAutoLogonIfChallenged`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 285:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINHTTP_AUTOPROXY_OPTIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WINHTTP_AUTOPROXY_RUN_INPROCESS`: UInt = 65536u;
public const val `WINHTTP_AUTOPROXY_RUN_OUTPROCESS_ONLY`: UInt = 131072u;
public const val `WINHTTP_AUTOPROXY_SORT_RESULTS`: UInt = 4194304u;
public const val `WINHTTP_AUTOPROXY_USE_INTERFACE_CONFIG`: UInt = 2048u;
public const val `WINHTTP_AUTO_DETECT_TYPE_DHCP`: UInt = 1u;
public const val `WINHTTP_AUTO_DETECT_TYPE_DNS_A`: UInt = 2u;
public const val `WINHTTP_CALLBACK_FLAG_ALL_NOTIFICATIONS`: UInt = 4294967295u;
public const val `WINHTTP_CALLBACK_FLAG_DATA_AVAILABLE`: UInt = 262144u;
public const val `WINHTTP_CALLBACK_FLAG_DETECTING_PROXY`: UInt = 4096u;
public const val `WINHTTP_CALLBACK_FLAG_GETPROXYFORURL_COMPLETE`: UInt = 16777216u;
public const val `WINHTTP_CALLBACK_FLAG_GETPROXYSETTINGS_COMPLETE`: UInt = 134217728u;
public const val `WINHTTP_CALLBACK_FLAG_HEADERS_AVAILABLE`: UInt = 131072u;
public const val `WINHTTP_CALLBACK_FLAG_INTERMEDIATE_RESPONSE`: UInt = 32768u;
public const val `WINHTTP_CALLBACK_FLAG_READ_COMPLETE`: UInt = 524288u;
public const val `WINHTTP_CALLBACK_FLAG_REDIRECT`: UInt = 16384u;
public const val `WINHTTP_CALLBACK_FLAG_REQUEST_ERROR`: UInt = 2097152u;
public const val `WINHTTP_CALLBACK_FLAG_SECURE_FAILURE`: UInt = 65536u;
public const val `WINHTTP_CALLBACK_FLAG_SENDREQUEST_COMPLETE`: UInt = 4194304u;
public const val `WINHTTP_CALLBACK_FLAG_WRITE_COMPLETE`: UInt = 1048576u;
public const val `WINHTTP_CALLBACK_STATUS_CLOSE_COMPLETE`: UInt = 33554432u;
public const val `WINHTTP_CALLBACK_STATUS_CLOSING_CONNECTION`: UInt = 256u;
public const val `WINHTTP_CALLBACK_STATUS_CONNECTED_TO_SERVER`: UInt = 8u;
public const val `WINHTTP_CALLBACK_STATUS_CONNECTING_TO_SERVER`: UInt = 4u;
public const val `WINHTTP_CALLBACK_STATUS_CONNECTION_CLOSED`: UInt = 512u;
public const val `WINHTTP_CALLBACK_STATUS_DATA_AVAILABLE`: UInt = 262144u;
public const val `WINHTTP_CALLBACK_STATUS_DETECTING_PROXY`: UInt = 4096u;
public const val `WINHTTP_CALLBACK_STATUS_FLAG_CERT_CN_INVALID`: UInt = 16u;
public const val `WINHTTP_CALLBACK_STATUS_FLAG_CERT_DATE_INVALID`: UInt = 32u;
public const val `WINHTTP_CALLBACK_STATUS_FLAG_CERT_REVOKED`: UInt = 4u;
public const val `WINHTTP_CALLBACK_STATUS_FLAG_CERT_REV_FAILED`: UInt = 1u;
public const val `WINHTTP_CALLBACK_STATUS_FLAG_CERT_WRONG_USAGE`: UInt = 64u;
public const val `WINHTTP_CALLBACK_STATUS_FLAG_INVALID_CA`: UInt = 8u;
public const val `WINHTTP_CALLBACK_STATUS_FLAG_INVALID_CERT`: UInt = 2u;
public const val `WINHTTP_CALLBACK_STATUS_FLAG_SECURITY_CHANNEL_ERROR`: UInt = 2147483648u;
public const val `WINHTTP_CALLBACK_STATUS_GETPROXYFORURL_COMPLETE`: UInt = 16777216u;
public const val `WINHTTP_CALLBACK_STATUS_GETPROXYSETTINGS_COMPLETE`: UInt = 134217728u;
public const val `WINHTTP_CALLBACK_STATUS_HANDLE_CLOSING`: UInt = 2048u;
public const val `WINHTTP_CALLBACK_STATUS_HANDLE_CREATED`: UInt = 1024u;
public const val `WINHTTP_CALLBACK_STATUS_HEADERS_AVAILABLE`: UInt = 131072u;
public const val `WINHTTP_CALLBACK_STATUS_INTERMEDIATE_RESPONSE`: UInt = 32768u;
public const val `WINHTTP_CALLBACK_STATUS_NAME_RESOLVED`: UInt = 2u;
public const val `WINHTTP_CALLBACK_STATUS_READ_COMPLETE`: UInt = 524288u;
public const val `WINHTTP_CALLBACK_STATUS_RECEIVING_RESPONSE`: UInt = 64u;
public const val `WINHTTP_CALLBACK_STATUS_REDIRECT`: UInt = 16384u;
public const val `WINHTTP_CALLBACK_STATUS_REQUEST_ERROR`: UInt = 2097152u;
public const val `WINHTTP_CALLBACK_STATUS_REQUEST_SENT`: UInt = 32u;
public const val `WINHTTP_CALLBACK_STATUS_RESOLVING_NAME`: UInt = 1u;
public const val `WINHTTP_CALLBACK_STATUS_RESPONSE_RECEIVED`: UInt = 128u;
public const val `WINHTTP_CALLBACK_STATUS_SECURE_FAILURE`: UInt = 65536u;
public const val `WINHTTP_CALLBACK_STATUS_SENDING_REQUEST`: UInt = 16u;
public const val `WINHTTP_CALLBACK_STATUS_SENDREQUEST_COMPLETE`: UInt = 4194304u;
public const val `WINHTTP_CALLBACK_STATUS_SETTINGS_READ_COMPLETE`: UInt = 536870912u;
public const val `WINHTTP_CALLBACK_STATUS_SETTINGS_WRITE_COMPLETE`: UInt = 268435456u;
public const val `WINHTTP_CALLBACK_STATUS_SHUTDOWN_COMPLETE`: UInt = 67108864u;
public const val `WINHTTP_CALLBACK_STATUS_WRITE_COMPLETE`: UInt = 1048576u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINHTTP_CERTIFICATE_INFO` (
    public var `ftExpiry`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `ftStart`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `lpszSubjectInfo`: `windows_sys`.`core`.`PWSTR`,
    public var `lpszIssuerInfo`: `windows_sys`.`core`.`PWSTR`,
    public var `lpszProtocolName`: `windows_sys`.`core`.`PWSTR`,
    public var `lpszSignatureAlgName`: `windows_sys`.`core`.`PWSTR`,
    public var `lpszEncryptionAlgName`: `windows_sys`.`core`.`PWSTR`,
    public var `dwKeySize`: UInt,
)
// UNSUPPORTED Rust 357:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINHTTP_CERTIFICATE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINHTTP_CONNECTION_GROUP` (
    public var `cConnections`: UInt,
    public var `guidGroup`: `windows_sys`.`core`.`GUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINHTTP_CONNECTION_INFO` (
    public var `cbSize`: UInt,
    public var `LocalAddress`: `super`.`WinSock`.`SOCKADDR_STORAGE`,
    public var `RemoteAddress`: `super`.`WinSock`.`SOCKADDR_STORAGE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINHTTP_CONNECTION_INFO` (
    public var `cbSize`: UInt,
    public var `LocalAddress`: `super`.`WinSock`.`SOCKADDR_STORAGE`,
    public var `RemoteAddress`: `super`.`WinSock`.`SOCKADDR_STORAGE`,
)
public const val `WINHTTP_CONNECTION_RETRY_CONDITION_408`: UInt = 1u;
public const val `WINHTTP_CONNECTION_RETRY_CONDITION_SSL_HANDSHAKE`: UInt = 2u;
public const val `WINHTTP_CONNECTION_RETRY_CONDITION_STALE_CONNECTION`: UInt = 4u;
public const val `WINHTTP_CONNS_PER_SERVER_UNLIMITED`: UInt = 4294967295u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINHTTP_CREDS` (
    public var `lpszUserName`: `windows_sys`.`core`.`PSTR`,
    public var `lpszPassword`: `windows_sys`.`core`.`PSTR`,
    public var `lpszRealm`: `windows_sys`.`core`.`PSTR`,
    public var `dwAuthScheme`: `WINHTTP_CREDS_AUTHSCHEME`,
    public var `lpszHostName`: `windows_sys`.`core`.`PSTR`,
    public var `dwPort`: UInt,
)
// UNSUPPORTED Rust 400:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINHTTP_CREDS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WINHTTP_CREDS_AUTHSCHEME` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINHTTP_CREDS_EX` (
    public var `lpszUserName`: `windows_sys`.`core`.`PSTR`,
    public var `lpszPassword`: `windows_sys`.`core`.`PSTR`,
    public var `lpszRealm`: `windows_sys`.`core`.`PSTR`,
    public var `dwAuthScheme`: `WINHTTP_CREDS_AUTHSCHEME`,
    public var `lpszHostName`: `windows_sys`.`core`.`PSTR`,
    public var `dwPort`: UInt,
    public var `lpszUrl`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 417:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINHTTP_CREDS_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINHTTP_CURRENT_USER_IE_PROXY_CONFIG` (
    public var `fAutoDetect`: `windows_sys`.`core`.`BOOL`,
    public var `lpszAutoConfigUrl`: `windows_sys`.`core`.`PWSTR`,
    public var `lpszProxy`: `windows_sys`.`core`.`PWSTR`,
    public var `lpszProxyBypass`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 430:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINHTTP_CURRENT_USER_IE_PROXY_CONFIG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WINHTTP_DECOMPRESSION_FLAG_DEFLATE`: UInt = 2u;
public const val `WINHTTP_DECOMPRESSION_FLAG_GZIP`: UInt = 1u;
public const val `WINHTTP_DISABLE_AUTHENTICATION`: UInt = 4u;
public const val `WINHTTP_DISABLE_COOKIES`: UInt = 1u;
public const val `WINHTTP_DISABLE_KEEP_ALIVE`: UInt = 8u;
public const val `WINHTTP_DISABLE_PASSPORT_AUTH`: UInt = 0u;
public const val `WINHTTP_DISABLE_PASSPORT_KEYRING`: UInt = 536870912u;
public const val `WINHTTP_DISABLE_REDIRECTS`: UInt = 2u;
public const val `WINHTTP_DISABLE_SPN_SERVER_PORT`: UInt = 0u;
public const val `WINHTTP_ENABLE_PASSPORT_AUTH`: UInt = 268435456u;
public const val `WINHTTP_ENABLE_PASSPORT_KEYRING`: UInt = 1073741824u;
public const val `WINHTTP_ENABLE_SPN_SERVER_PORT`: UInt = 1u;
public const val `WINHTTP_ENABLE_SSL_REVERT_IMPERSONATION`: UInt = 2u;
public const val `WINHTTP_ENABLE_SSL_REVOCATION`: UInt = 1u;
public const val `WINHTTP_ERROR_BASE`: UInt = 12000u;
public const val `WINHTTP_ERROR_LAST`: UInt = 12192u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINHTTP_EXTENDED_HEADER` (
    public var `Anonymous1`: `WINHTTP_EXTENDED_HEADER_0`,
    public var `Anonymous2`: `WINHTTP_EXTENDED_HEADER_1`,
)
// UNSUPPORTED Rust 457:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINHTTP_EXTENDED_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 462:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WINHTTP_EXTENDED_HEADER_0 {
//     pub pwszName: windows_sys::core::PCWSTR,
//     pub pszName: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 468:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINHTTP_EXTENDED_HEADER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 473:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WINHTTP_EXTENDED_HEADER_1 {
//     pub pwszValue: windows_sys::core::PCWSTR,
//     pub pszValue: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 479:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINHTTP_EXTENDED_HEADER_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WINHTTP_EXTENDED_HEADER_FLAG_UNICODE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINHTTP_FAILED_CONNECTION_RETRIES` (
    public var `dwMaxRetries`: UInt,
    public var `dwAllowedRetryConditions`: UInt,
)
public const val `WINHTTP_FEATURE_ADD_REQUEST_HEADERS_EX`: UInt = 46u;
public const val `WINHTTP_FEATURE_BACKGROUND_CONNECTIONS`: UInt = 34u;
public const val `WINHTTP_FEATURE_CONNECTION_GUID`: UInt = 38u;
public const val `WINHTTP_FEATURE_CONNECTION_STATS_V0`: UInt = 3u;
public const val `WINHTTP_FEATURE_CONNECTION_STATS_V1`: UInt = 12u;
public const val `WINHTTP_FEATURE_DISABLE_CERT_CHAIN_BUILDING`: UInt = 33u;
public const val `WINHTTP_FEATURE_DISABLE_PROXY_AUTH_SCHEMES`: UInt = 74u;
public const val `WINHTTP_FEATURE_DISABLE_SECURE_PROTOCOL_FALLBACK`: UInt = 6u;
public const val `WINHTTP_FEATURE_DISABLE_STREAM_QUEUE`: UInt = 1u;
public const val `WINHTTP_FEATURE_ENABLE_HTTP2_PLUS_CLIENT_CERT`: UInt = 23u;
public const val `WINHTTP_FEATURE_EXPIRE_CONNECTION`: UInt = 5u;
public const val `WINHTTP_FEATURE_EXTENDED_HEADER_FLAG_UNICODE`: UInt = 54u;
public const val `WINHTTP_FEATURE_FAILED_CONNECTION_RETRIES`: UInt = 24u;
public const val `WINHTTP_FEATURE_FIRST_AVAILABLE_CONNECTION`: UInt = 35u;
public const val `WINHTTP_FEATURE_FLAG_AUTOMATIC_CHUNKING`: UInt = 59u;
public const val `WINHTTP_FEATURE_FLAG_SECURE_DEFAULTS`: UInt = 53u;
public const val `WINHTTP_FEATURE_FREE_QUERY_CONNECTION_GROUP_RESULT`: UInt = 51u;
public const val `WINHTTP_FEATURE_HTTP2_KEEPALIVE`: UInt = 26u;
public const val `WINHTTP_FEATURE_HTTP2_PLUS_TRANSFER_ENCODING`: UInt = 31u;
public const val `WINHTTP_FEATURE_HTTP2_RECEIVE_WINDOW`: UInt = 43u;
public const val `WINHTTP_FEATURE_HTTP3_HANDSHAKE_TIMEOUT`: UInt = 70u;
public const val `WINHTTP_FEATURE_HTTP3_INITIAL_RTT`: UInt = 71u;
public const val `WINHTTP_FEATURE_HTTP3_KEEPALIVE`: UInt = 69u;
public const val `WINHTTP_FEATURE_HTTP3_STREAM_ERROR_CODE`: UInt = 72u;
public const val `WINHTTP_FEATURE_HTTP_PROTOCOL_REQUIRED`: UInt = 7u;
public const val `WINHTTP_FEATURE_IGNORE_CERT_REVOCATION_OFFLINE`: UInt = 17u;
public const val `WINHTTP_FEATURE_IPV6_FAST_FALLBACK`: UInt = 2u;
public const val `WINHTTP_FEATURE_IS_FEATURE_SUPPORTED`: UInt = 44u;
public const val `WINHTTP_FEATURE_MATCH_CONNECTION_GUID`: UInt = 39u;
public const val `WINHTTP_FEATURE_MATCH_CONNECTION_GUID_FLAG_REQUIRE_MARKED_CONNECTION`: UInt = 61u;
public const val `WINHTTP_FEATURE_QUERY_CONNECTION_GROUP`: UInt = 50u;
public const val `WINHTTP_FEATURE_QUERY_CONNECTION_GROUP_FLAG_INSECURE`: UInt = 60u;
public const val `WINHTTP_FEATURE_QUERY_EX_ALL_HEADERS`: UInt = 62u;
public const val `WINHTTP_FEATURE_QUERY_FLAG_TRAILERS`: UInt = 55u;
public const val `WINHTTP_FEATURE_QUERY_FLAG_WIRE_ENCODING`: UInt = 56u;
public const val `WINHTTP_FEATURE_QUERY_HEADERS_EX`: UInt = 49u;
public const val `WINHTTP_FEATURE_QUIC_STATS`: UInt = 66u;
public const val `WINHTTP_FEATURE_READ_DATA_EX`: UInt = 48u;
public const val `WINHTTP_FEATURE_READ_DATA_EX_FLAG_FILL_BUFFER`: UInt = 63u;
public const val `WINHTTP_FEATURE_REFERER_TOKEN_BINDING_HOSTNAME`: UInt = 30u;
public const val `WINHTTP_FEATURE_REQUEST_ANNOTATION`: UInt = 73u;
public const val `WINHTTP_FEATURE_REQUEST_STATS`: UInt = 8u;
public const val `WINHTTP_FEATURE_REQUEST_TIMES`: UInt = 4u;
public const val `WINHTTP_FEATURE_REQUIRE_STREAM_END`: UInt = 22u;
public const val `WINHTTP_FEATURE_RESOLUTION_HOSTNAME`: UInt = 27u;
public const val `WINHTTP_FEATURE_RESOLVER_CACHE_CONFIG`: UInt = 32u;
public const val `WINHTTP_FEATURE_RESOLVER_CACHE_CONFIG_FLAG_BYPASS_CACHE`: UInt = 58u;
public const val `WINHTTP_FEATURE_RESOLVER_CACHE_CONFIG_FLAG_CONN_USE_TTL`: UInt = 65u;
public const val `WINHTTP_FEATURE_RESOLVER_CACHE_CONFIG_FLAG_SOFT_LIMIT`: UInt = 57u;
public const val `WINHTTP_FEATURE_RESOLVER_CACHE_CONFIG_FLAG_USE_DNS_TTL`: UInt = 64u;
public const val `WINHTTP_FEATURE_REVERT_IMPERSONATION_SERVER_CERT`: UInt = 75u;
public const val `WINHTTP_FEATURE_SECURITY_FLAG_IGNORE_ALL_CERT_ERRORS`: UInt = 52u;
public const val `WINHTTP_FEATURE_SECURITY_INFO`: UInt = 13u;
public const val `WINHTTP_FEATURE_SERVER_CERT_CHAIN_CONTEXT`: UInt = 9u;
public const val `WINHTTP_FEATURE_SET_PROXY_SETINGS_PER_USER`: UInt = 47u;
public const val `WINHTTP_FEATURE_SET_TOKEN_BINDING`: UInt = 28u;
public const val `WINHTTP_FEATURE_STREAM_ERROR_CODE`: UInt = 21u;
public const val `WINHTTP_FEATURE_TCP_FAST_OPEN`: UInt = 15u;
public const val `WINHTTP_FEATURE_TCP_KEEPALIVE`: UInt = 14u;
public const val `WINHTTP_FEATURE_TCP_PRIORITY_STATUS`: UInt = 37u;
public const val `WINHTTP_FEATURE_TLS_FALSE_START`: UInt = 16u;
public const val `WINHTTP_FEATURE_TLS_PROTOCOL_INSECURE_FALLBACK`: UInt = 20u;
public const val `WINHTTP_FEATURE_TOKEN_BINDING_PUBLIC_KEY`: UInt = 29u;
public const val `WINHTTP_FLAG_ASYNC`: UInt = 268435456u;
public const val `WINHTTP_FLAG_AUTOMATIC_CHUNKING`: UInt = 512u;
public const val `WINHTTP_FLAG_BYPASS_PROXY_CACHE`: `WINHTTP_OPEN_REQUEST_FLAGS` = 256u;
public const val `WINHTTP_FLAG_ESCAPE_DISABLE`: `WINHTTP_OPEN_REQUEST_FLAGS` = 64u;
public const val `WINHTTP_FLAG_ESCAPE_DISABLE_QUERY`: `WINHTTP_OPEN_REQUEST_FLAGS` = 128u;
public const val `WINHTTP_FLAG_ESCAPE_PERCENT`: `WINHTTP_OPEN_REQUEST_FLAGS` = 4u;
public const val `WINHTTP_FLAG_NULL_CODEPAGE`: `WINHTTP_OPEN_REQUEST_FLAGS` = 8u;
public const val `WINHTTP_FLAG_REFRESH`: `WINHTTP_OPEN_REQUEST_FLAGS` = 256u;
public const val `WINHTTP_FLAG_SECURE`: `WINHTTP_OPEN_REQUEST_FLAGS` = 8388608u;
public const val `WINHTTP_FLAG_SECURE_DEFAULTS`: UInt = 805306368u;
public const val `WINHTTP_FLAG_SECURE_PROTOCOL_SSL2`: UInt = 8u;
public const val `WINHTTP_FLAG_SECURE_PROTOCOL_SSL3`: UInt = 32u;
public const val `WINHTTP_FLAG_SECURE_PROTOCOL_TLS1`: UInt = 128u;
public const val `WINHTTP_FLAG_SECURE_PROTOCOL_TLS1_1`: UInt = 512u;
public const val `WINHTTP_FLAG_SECURE_PROTOCOL_TLS1_2`: UInt = 2048u;
public const val `WINHTTP_FLAG_SECURE_PROTOCOL_TLS1_3`: UInt = 8192u;
public const val `WINHTTP_HANDLE_TYPE_CONNECT`: UInt = 2u;
public const val `WINHTTP_HANDLE_TYPE_PROXY_RESOLVER`: UInt = 4u;
public const val `WINHTTP_HANDLE_TYPE_REQUEST`: UInt = 3u;
public const val `WINHTTP_HANDLE_TYPE_SESSION`: UInt = 1u;
public const val `WINHTTP_HANDLE_TYPE_WEBSOCKET`: UInt = 5u;
// UNSUPPORTED Rust 575:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WINHTTP_HEADER_NAME {
//     pub pwszName: windows_sys::core::PCWSTR,
//     pub pszName: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 581:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINHTTP_HEADER_NAME {
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
public class `WINHTTP_HOST_CONNECTION_GROUP` (
    public var `pwszHost`: `windows_sys`.`core`.`PCWSTR`,
    public var `cConnectionGroups`: UInt,
    public var `pConnectionGroups`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WINHTTP_CONNECTION_GROUP`>?,
)
// UNSUPPORTED Rust 593:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINHTTP_HOST_CONNECTION_GROUP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINHTTP_HTTP2_RECEIVE_WINDOW` (
    public var `ulStreamWindow`: UInt,
    public var `ulStreamWindowUpdateDelta`: UInt,
)
public const val `WINHTTP_IGNORE_REQUEST_TOTAL_LENGTH`: UInt = 0u;
public typealias `WINHTTP_INTERNET_SCHEME` = Int;
public const val `WINHTTP_INTERNET_SCHEME_FTP`: `WINHTTP_INTERNET_SCHEME` = 3;
public const val `WINHTTP_INTERNET_SCHEME_HTTP`: `WINHTTP_INTERNET_SCHEME` = 1;
public const val `WINHTTP_INTERNET_SCHEME_HTTPS`: `WINHTTP_INTERNET_SCHEME` = 2;
public const val `WINHTTP_INTERNET_SCHEME_SOCKS`: `WINHTTP_INTERNET_SCHEME` = 4;
public const val `WINHTTP_LAST_OPTION`: UInt = 196u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINHTTP_MATCH_CONNECTION_GUID` (
    public var `ConnectionGuid`: `windows_sys`.`core`.`GUID`,
    public var `ullFlags`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINHTTP_MATCH_CONNECTION_GUID` (
    public var `ConnectionGuid`: `windows_sys`.`core`.`GUID`,
    public var `ullFlags`: ULong,
)
public const val `WINHTTP_MATCH_CONNECTION_GUID_FLAGS_MASK`: UInt = 1u;
public const val `WINHTTP_MATCH_CONNECTION_GUID_FLAG_REQUIRE_MARKED_CONNECTION`: UInt = 1u;
public typealias `WINHTTP_OPEN_REQUEST_FLAGS` = UInt;
public const val `WINHTTP_OPTION_ASSURED_NON_BLOCKING_CALLBACKS`: UInt = 111u;
public const val `WINHTTP_OPTION_AUTOLOGON_POLICY`: UInt = 77u;
public const val `WINHTTP_OPTION_BACKGROUND_CONNECTIONS`: UInt = 172u;
public const val `WINHTTP_OPTION_CALLBACK`: UInt = 1u;
public const val `WINHTTP_OPTION_CLIENT_CERT_CONTEXT`: UInt = 47u;
public const val `WINHTTP_OPTION_CLIENT_CERT_ISSUER_LIST`: UInt = 94u;
public const val `WINHTTP_OPTION_CODEPAGE`: UInt = 68u;
public const val `WINHTTP_OPTION_CONFIGURE_PASSPORT_AUTH`: UInt = 83u;
public const val `WINHTTP_OPTION_CONNECTION_FILTER`: UInt = 131u;
public const val `WINHTTP_OPTION_CONNECTION_GUID`: UInt = 178u;
public const val `WINHTTP_OPTION_CONNECTION_INFO`: UInt = 93u;
public const val `WINHTTP_OPTION_CONNECTION_STATS_V0`: UInt = 141u;
public const val `WINHTTP_OPTION_CONNECTION_STATS_V1`: UInt = 150u;
public const val `WINHTTP_OPTION_CONNECT_RETRIES`: UInt = 4u;
public const val `WINHTTP_OPTION_CONNECT_TIMEOUT`: UInt = 3u;
public const val `WINHTTP_OPTION_CONTEXT_VALUE`: UInt = 45u;
public const val `WINHTTP_OPTION_DECOMPRESSION`: UInt = 118u;
public const val `WINHTTP_OPTION_DISABLE_CERT_CHAIN_BUILDING`: UInt = 171u;
public const val `WINHTTP_OPTION_DISABLE_FEATURE`: UInt = 63u;
public const val `WINHTTP_OPTION_DISABLE_GLOBAL_POOLING`: UInt = 195u;
public const val `WINHTTP_OPTION_DISABLE_PROXY_AUTH_SCHEMES`: UInt = 193u;
public const val `WINHTTP_OPTION_DISABLE_SECURE_PROTOCOL_FALLBACK`: UInt = 144u;
public const val `WINHTTP_OPTION_DISABLE_STREAM_QUEUE`: UInt = 139u;
public const val `WINHTTP_OPTION_ENABLETRACING`: UInt = 85u;
public const val `WINHTTP_OPTION_ENABLE_FEATURE`: UInt = 79u;
public const val `WINHTTP_OPTION_ENABLE_HTTP2_PLUS_CLIENT_CERT`: UInt = 161u;
public const val `WINHTTP_OPTION_ENABLE_HTTP_PROTOCOL`: UInt = 133u;
public const val `WINHTTP_OPTION_ENCODE_EXTRA`: UInt = 138u;
public const val `WINHTTP_OPTION_EXPIRE_CONNECTION`: UInt = 143u;
public const val `WINHTTP_OPTION_EXTENDED_ERROR`: UInt = 24u;
public const val `WINHTTP_OPTION_FAILED_CONNECTION_RETRIES`: UInt = 162u;
public const val `WINHTTP_OPTION_FEATURE_SUPPORTED`: UInt = 184u;
public const val `WINHTTP_OPTION_FIRST_AVAILABLE_CONNECTION`: UInt = 173u;
public const val `WINHTTP_OPTION_GLOBAL_PROXY_CREDS`: UInt = 97u;
public const val `WINHTTP_OPTION_GLOBAL_SERVER_CREDS`: UInt = 98u;
public const val `WINHTTP_OPTION_HANDLE_TYPE`: UInt = 9u;
public const val `WINHTTP_OPTION_HTTP2_KEEPALIVE`: UInt = 164u;
public const val `WINHTTP_OPTION_HTTP2_PLUS_TRANSFER_ENCODING`: UInt = 169u;
public const val `WINHTTP_OPTION_HTTP2_RECEIVE_WINDOW`: UInt = 183u;
public const val `WINHTTP_OPTION_HTTP3_HANDSHAKE_TIMEOUT`: UInt = 189u;
public const val `WINHTTP_OPTION_HTTP3_INITIAL_RTT`: UInt = 190u;
public const val `WINHTTP_OPTION_HTTP3_KEEPALIVE`: UInt = 188u;
public const val `WINHTTP_OPTION_HTTP3_STREAM_ERROR_CODE`: UInt = 191u;
public const val `WINHTTP_OPTION_HTTP_PROTOCOL_REQUIRED`: UInt = 145u;
public const val `WINHTTP_OPTION_HTTP_PROTOCOL_USED`: UInt = 134u;
public const val `WINHTTP_OPTION_HTTP_VERSION`: UInt = 59u;
public const val `WINHTTP_OPTION_IGNORE_CERT_REVOCATION_OFFLINE`: UInt = 155u;
public const val `WINHTTP_OPTION_IPV6_FAST_FALLBACK`: UInt = 140u;
public const val `WINHTTP_OPTION_IS_PROXY_CONNECT_RESPONSE`: UInt = 104u;
public const val `WINHTTP_OPTION_KDC_PROXY_SETTINGS`: UInt = 136u;
public const val `WINHTTP_OPTION_MATCH_CONNECTION_GUID`: UInt = 179u;
public const val `WINHTTP_OPTION_MAX_CONNS_PER_1_0_SERVER`: UInt = 74u;
public const val `WINHTTP_OPTION_MAX_CONNS_PER_SERVER`: UInt = 73u;
public const val `WINHTTP_OPTION_MAX_HTTP_AUTOMATIC_REDIRECTS`: UInt = 89u;
public const val `WINHTTP_OPTION_MAX_HTTP_STATUS_CONTINUE`: UInt = 90u;
public const val `WINHTTP_OPTION_MAX_RESPONSE_DRAIN_SIZE`: UInt = 92u;
public const val `WINHTTP_OPTION_MAX_RESPONSE_HEADER_SIZE`: UInt = 91u;
public const val `WINHTTP_OPTION_NETWORK_INTERFACE_AFFINITY`: UInt = 105u;
public const val `WINHTTP_OPTION_PARENT_HANDLE`: UInt = 21u;
public const val `WINHTTP_OPTION_PASSPORT_COBRANDING_TEXT`: UInt = 81u;
public const val `WINHTTP_OPTION_PASSPORT_COBRANDING_URL`: UInt = 82u;
public const val `WINHTTP_OPTION_PASSPORT_RETURN_URL`: UInt = 87u;
public const val `WINHTTP_OPTION_PASSPORT_SIGN_OUT`: UInt = 86u;
public const val `WINHTTP_OPTION_PASSWORD`: UInt = 4097u;
public const val `WINHTTP_OPTION_PROXY`: UInt = 38u;
public const val `WINHTTP_OPTION_PROXY_DISABLE_SERVICE_CALLS`: UInt = 137u;
public const val `WINHTTP_OPTION_PROXY_PASSWORD`: UInt = 4099u;
public const val `WINHTTP_OPTION_PROXY_RESULT_ENTRY`: UInt = 39u;
public const val `WINHTTP_OPTION_PROXY_SPN_USED`: UInt = 107u;
public const val `WINHTTP_OPTION_PROXY_USERNAME`: UInt = 4098u;
public const val `WINHTTP_OPTION_QUIC_STATS`: UInt = 185u;
public const val `WINHTTP_OPTION_READ_BUFFER_SIZE`: UInt = 12u;
public const val `WINHTTP_OPTION_RECEIVE_PROXY_CONNECT_RESPONSE`: UInt = 103u;
public const val `WINHTTP_OPTION_RECEIVE_RESPONSE_TIMEOUT`: UInt = 7u;
public const val `WINHTTP_OPTION_RECEIVE_TIMEOUT`: UInt = 6u;
public const val `WINHTTP_OPTION_REDIRECT_POLICY`: UInt = 88u;
public const val `WINHTTP_OPTION_REDIRECT_POLICY_ALWAYS`: UInt = 2u;
public const val `WINHTTP_OPTION_REDIRECT_POLICY_DEFAULT`: UInt = 1u;
public const val `WINHTTP_OPTION_REDIRECT_POLICY_DISALLOW_HTTPS_TO_HTTP`: UInt = 1u;
public const val `WINHTTP_OPTION_REDIRECT_POLICY_LAST`: UInt = 2u;
public const val `WINHTTP_OPTION_REDIRECT_POLICY_NEVER`: UInt = 0u;
public const val `WINHTTP_OPTION_REFERER_TOKEN_BINDING_HOSTNAME`: UInt = 168u;
public const val `WINHTTP_OPTION_REJECT_USERPWD_IN_URL`: UInt = 100u;
public const val `WINHTTP_OPTION_REQUEST_ANNOTATION`: UInt = 192u;
public const val `WINHTTP_OPTION_REQUEST_ANNOTATION_MAX_LENGTH`: UInt = 64000u;
public const val `WINHTTP_OPTION_REQUEST_PRIORITY`: UInt = 58u;
public const val `WINHTTP_OPTION_REQUEST_STATS`: UInt = 146u;
public const val `WINHTTP_OPTION_REQUEST_TIMES`: UInt = 142u;
public const val `WINHTTP_OPTION_REQUIRE_STREAM_END`: UInt = 160u;
public const val `WINHTTP_OPTION_RESOLUTION_HOSTNAME`: UInt = 165u;
public const val `WINHTTP_OPTION_RESOLVER_CACHE_CONFIG`: UInt = 170u;
public const val `WINHTTP_OPTION_RESOLVE_TIMEOUT`: UInt = 2u;
public const val `WINHTTP_OPTION_REVERT_IMPERSONATION_SERVER_CERT`: UInt = 194u;
public const val `WINHTTP_OPTION_SECURE_PROTOCOLS`: UInt = 84u;
public const val `WINHTTP_OPTION_SECURITY_CERTIFICATE_STRUCT`: UInt = 32u;
public const val `WINHTTP_OPTION_SECURITY_FLAGS`: UInt = 31u;
public const val `WINHTTP_OPTION_SECURITY_INFO`: UInt = 151u;
public const val `WINHTTP_OPTION_SECURITY_KEY_BITNESS`: UInt = 36u;
public const val `WINHTTP_OPTION_SEND_TIMEOUT`: UInt = 5u;
public const val `WINHTTP_OPTION_SERVER_CBT`: UInt = 108u;
public const val `WINHTTP_OPTION_SERVER_CERT_CHAIN_CONTEXT`: UInt = 147u;
public const val `WINHTTP_OPTION_SERVER_CERT_CONTEXT`: UInt = 78u;
public const val `WINHTTP_OPTION_SERVER_SPN_USED`: UInt = 106u;
public const val `WINHTTP_OPTION_SET_TOKEN_BINDING`: UInt = 166u;
public const val `WINHTTP_OPTION_SPN`: UInt = 96u;
public const val `WINHTTP_OPTION_SPN_MASK`: UInt = 1u;
public const val `WINHTTP_OPTION_STREAM_ERROR_CODE`: UInt = 159u;
public const val `WINHTTP_OPTION_TCP_FAST_OPEN`: UInt = 153u;
public const val `WINHTTP_OPTION_TCP_KEEPALIVE`: UInt = 152u;
public const val `WINHTTP_OPTION_TCP_PRIORITY_HINT`: UInt = 128u;
public const val `WINHTTP_OPTION_TCP_PRIORITY_STATUS`: UInt = 177u;
public const val `WINHTTP_OPTION_TLS_FALSE_START`: UInt = 154u;
public const val `WINHTTP_OPTION_TLS_PROTOCOL_INSECURE_FALLBACK`: UInt = 158u;
public const val `WINHTTP_OPTION_TOKEN_BINDING_PUBLIC_KEY`: UInt = 167u;
public const val `WINHTTP_OPTION_UNLOAD_NOTIFY_EVENT`: UInt = 99u;
public const val `WINHTTP_OPTION_UNSAFE_HEADER_PARSING`: UInt = 110u;
public const val `WINHTTP_OPTION_UPGRADE_TO_WEB_SOCKET`: UInt = 114u;
public const val `WINHTTP_OPTION_URL`: UInt = 34u;
public const val `WINHTTP_OPTION_USERNAME`: UInt = 4096u;
public const val `WINHTTP_OPTION_USER_AGENT`: UInt = 41u;
public const val `WINHTTP_OPTION_USE_GLOBAL_SERVER_CREDENTIALS`: UInt = 101u;
public const val `WINHTTP_OPTION_USE_SESSION_SCH_CRED`: UInt = 196u;
public const val `WINHTTP_OPTION_WEB_SOCKET_CLOSE_TIMEOUT`: UInt = 115u;
public const val `WINHTTP_OPTION_WEB_SOCKET_KEEPALIVE_INTERVAL`: UInt = 116u;
public const val `WINHTTP_OPTION_WEB_SOCKET_RECEIVE_BUFFER_SIZE`: UInt = 122u;
public const val `WINHTTP_OPTION_WEB_SOCKET_SEND_BUFFER_SIZE`: UInt = 123u;
public const val `WINHTTP_OPTION_WORKER_THREAD_COUNT`: UInt = 80u;
public const val `WINHTTP_OPTION_WRITE_BUFFER_SIZE`: UInt = 13u;
public const val `WINHTTP_PROTOCOL_FLAG_HTTP2`: UInt = 1u;
public const val `WINHTTP_PROTOCOL_FLAG_HTTP3`: UInt = 2u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WINHTTP_PROXY_CHANGE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
public const val `WINHTTP_PROXY_DISABLE_AUTH_LOCAL_SERVICE`: UInt = 256u;
public const val `WINHTTP_PROXY_DISABLE_SCHEME_BASIC`: UInt = 1u;
public const val `WINHTTP_PROXY_DISABLE_SCHEME_DIGEST`: UInt = 2u;
public const val `WINHTTP_PROXY_DISABLE_SCHEME_KERBEROS`: UInt = 8u;
public const val `WINHTTP_PROXY_DISABLE_SCHEME_NEGOTIATE`: UInt = 16u;
public const val `WINHTTP_PROXY_DISABLE_SCHEME_NTLM`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINHTTP_PROXY_INFO` (
    public var `dwAccessType`: `WINHTTP_ACCESS_TYPE`,
    public var `lpszProxy`: `windows_sys`.`core`.`PWSTR`,
    public var `lpszProxyBypass`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 772:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINHTTP_PROXY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 777:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WINHTTP_PROXY_NETWORKING_KEY {
//     pub pbBuffer: [u8; 128],
// }

// UNSUPPORTED Rust 782:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINHTTP_PROXY_NETWORKING_KEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WINHTTP_PROXY_NOTIFY_CHANGE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINHTTP_PROXY_RESULT` (
    public var `cEntries`: UInt,
    public var `pEntries`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WINHTTP_PROXY_RESULT_ENTRY`>?,
)
// UNSUPPORTED Rust 794:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINHTTP_PROXY_RESULT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINHTTP_PROXY_RESULT_ENTRY` (
    public var `fProxy`: `windows_sys`.`core`.`BOOL`,
    public var `fBypass`: `windows_sys`.`core`.`BOOL`,
    public var `ProxyScheme`: `WINHTTP_INTERNET_SCHEME`,
    public var `pwszProxy`: `windows_sys`.`core`.`PWSTR`,
    public var `ProxyPort`: UShort,
)
// UNSUPPORTED Rust 808:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINHTTP_PROXY_RESULT_ENTRY {
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
public class `WINHTTP_PROXY_RESULT_EX` (
    public var `cEntries`: UInt,
    public var `pEntries`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WINHTTP_PROXY_RESULT_ENTRY`>?,
    public var `hProxyDetectionHandle`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `dwProxyInterfaceAffinity`: UInt,
)
// UNSUPPORTED Rust 821:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINHTTP_PROXY_RESULT_EX {
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
public class `WINHTTP_PROXY_SETTINGS` (
    public var `dwStructSize`: UInt,
    public var `dwFlags`: UInt,
    public var `dwCurrentSettingsVersion`: UInt,
    public var `pwszConnectionName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszProxy`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszProxyBypass`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszAutoconfigUrl`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszAutoconfigSecondaryUrl`: `windows_sys`.`core`.`PWSTR`,
    public var `dwAutoDiscoveryFlags`: UInt,
    public var `pwszLastKnownGoodAutoConfigUrl`: `windows_sys`.`core`.`PWSTR`,
    public var `dwAutoconfigReloadDelayMins`: UInt,
    public var `ftLastKnownDetectTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `dwDetectedInterfaceIpCount`: UInt,
    public var `pdwDetectedInterfaceIp`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `cNetworkKeys`: UInt,
    public var `pNetworkKeys`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WINHTTP_PROXY_NETWORKING_KEY`>?,
)
// UNSUPPORTED Rust 846:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINHTTP_PROXY_SETTINGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINHTTP_PROXY_SETTINGS_EX` (
    public var `ullGenerationId`: ULong,
    public var `ullFlags`: ULong,
    public var `pcwszAutoconfigUrl`: `windows_sys`.`core`.`PCWSTR`,
    public var `pcwszProxy`: `windows_sys`.`core`.`PCWSTR`,
    public var `pcwszSecureProxy`: `windows_sys`.`core`.`PCWSTR`,
    public var `cProxyBypasses`: UInt,
    public var `rgpcwszProxyBypasses`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?,
    public var `dwInterfaceIndex`: UInt,
    public var `pcwszConnectionName`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 865:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for WINHTTP_PROXY_SETTINGS_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINHTTP_PROXY_SETTINGS_EX` (
    public var `ullGenerationId`: ULong,
    public var `ullFlags`: ULong,
    public var `pcwszAutoconfigUrl`: `windows_sys`.`core`.`PCWSTR`,
    public var `pcwszProxy`: `windows_sys`.`core`.`PCWSTR`,
    public var `pcwszSecureProxy`: `windows_sys`.`core`.`PCWSTR`,
    public var `cProxyBypasses`: UInt,
    public var `rgpcwszProxyBypasses`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?,
    public var `dwInterfaceIndex`: UInt,
    public var `pcwszConnectionName`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 885:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for WINHTTP_PROXY_SETTINGS_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINHTTP_PROXY_SETTINGS_PARAM` (
    public var `ullFlags`: ULong,
    public var `pcwszConnectionName`: `windows_sys`.`core`.`PCWSTR`,
    public var `pcwszProbeHost`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 899:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for WINHTTP_PROXY_SETTINGS_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINHTTP_PROXY_SETTINGS_PARAM` (
    public var `ullFlags`: ULong,
    public var `pcwszConnectionName`: `windows_sys`.`core`.`PCWSTR`,
    public var `pcwszProbeHost`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 913:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for WINHTTP_PROXY_SETTINGS_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WINHTTP_PROXY_SETTINGS_TYPE` = Int;
public const val `WINHTTP_PROXY_TYPE_AUTO_DETECT`: UInt = 8u;
public const val `WINHTTP_PROXY_TYPE_AUTO_PROXY_URL`: UInt = 4u;
public const val `WINHTTP_PROXY_TYPE_DIRECT`: UInt = 1u;
public const val `WINHTTP_PROXY_TYPE_PROXY`: UInt = 2u;
public const val `WINHTTP_QUERY_ACCEPT`: UInt = 24u;
public const val `WINHTTP_QUERY_ACCEPT_CHARSET`: UInt = 25u;
public const val `WINHTTP_QUERY_ACCEPT_ENCODING`: UInt = 26u;
public const val `WINHTTP_QUERY_ACCEPT_LANGUAGE`: UInt = 27u;
public const val `WINHTTP_QUERY_ACCEPT_RANGES`: UInt = 42u;
public const val `WINHTTP_QUERY_AGE`: UInt = 48u;
public const val `WINHTTP_QUERY_ALLOW`: UInt = 7u;
public const val `WINHTTP_QUERY_AUTHENTICATION_INFO`: UInt = 76u;
public const val `WINHTTP_QUERY_AUTHORIZATION`: UInt = 28u;
public const val `WINHTTP_QUERY_CACHE_CONTROL`: UInt = 49u;
public const val `WINHTTP_QUERY_CONNECTION`: UInt = 23u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINHTTP_QUERY_CONNECTION_GROUP_RESULT` (
    public var `cHosts`: UInt,
    public var `pHostConnectionGroups`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WINHTTP_HOST_CONNECTION_GROUP`>?,
)
// UNSUPPORTED Rust 941:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINHTTP_QUERY_CONNECTION_GROUP_RESULT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WINHTTP_QUERY_CONTENT_BASE`: UInt = 50u;
public const val `WINHTTP_QUERY_CONTENT_DESCRIPTION`: UInt = 4u;
public const val `WINHTTP_QUERY_CONTENT_DISPOSITION`: UInt = 47u;
public const val `WINHTTP_QUERY_CONTENT_ENCODING`: UInt = 29u;
public const val `WINHTTP_QUERY_CONTENT_ID`: UInt = 3u;
public const val `WINHTTP_QUERY_CONTENT_LANGUAGE`: UInt = 6u;
public const val `WINHTTP_QUERY_CONTENT_LENGTH`: UInt = 5u;
public const val `WINHTTP_QUERY_CONTENT_LOCATION`: UInt = 51u;
public const val `WINHTTP_QUERY_CONTENT_MD5`: UInt = 52u;
public const val `WINHTTP_QUERY_CONTENT_RANGE`: UInt = 53u;
public const val `WINHTTP_QUERY_CONTENT_TRANSFER_ENCODING`: UInt = 2u;
public const val `WINHTTP_QUERY_CONTENT_TYPE`: UInt = 1u;
public const val `WINHTTP_QUERY_COOKIE`: UInt = 44u;
public const val `WINHTTP_QUERY_COST`: UInt = 15u;
public const val `WINHTTP_QUERY_CUSTOM`: UInt = 65535u;
public const val `WINHTTP_QUERY_DATE`: UInt = 9u;
public const val `WINHTTP_QUERY_DERIVED_FROM`: UInt = 14u;
public const val `WINHTTP_QUERY_ETAG`: UInt = 54u;
public const val `WINHTTP_QUERY_EXPECT`: UInt = 68u;
public const val `WINHTTP_QUERY_EXPIRES`: UInt = 10u;
public const val `WINHTTP_QUERY_EX_ALL_HEADERS`: UInt = 21u;
public const val `WINHTTP_QUERY_FLAG_NUMBER`: UInt = 536870912u;
public const val `WINHTTP_QUERY_FLAG_NUMBER64`: UInt = 134217728u;
public const val `WINHTTP_QUERY_FLAG_REQUEST_HEADERS`: UInt = 2147483648u;
public const val `WINHTTP_QUERY_FLAG_SYSTEMTIME`: UInt = 1073741824u;
public const val `WINHTTP_QUERY_FLAG_TRAILERS`: UInt = 33554432u;
public const val `WINHTTP_QUERY_FLAG_WIRE_ENCODING`: UInt = 16777216u;
public const val `WINHTTP_QUERY_FORWARDED`: UInt = 30u;
public const val `WINHTTP_QUERY_FROM`: UInt = 31u;
public const val `WINHTTP_QUERY_HOST`: UInt = 55u;
public const val `WINHTTP_QUERY_IF_MATCH`: UInt = 56u;
public const val `WINHTTP_QUERY_IF_MODIFIED_SINCE`: UInt = 32u;
public const val `WINHTTP_QUERY_IF_NONE_MATCH`: UInt = 57u;
public const val `WINHTTP_QUERY_IF_RANGE`: UInt = 58u;
public const val `WINHTTP_QUERY_IF_UNMODIFIED_SINCE`: UInt = 59u;
public const val `WINHTTP_QUERY_LAST_MODIFIED`: UInt = 11u;
public const val `WINHTTP_QUERY_LINK`: UInt = 16u;
public const val `WINHTTP_QUERY_LOCATION`: UInt = 33u;
public const val `WINHTTP_QUERY_MAX`: UInt = 78u;
public const val `WINHTTP_QUERY_MAX_FORWARDS`: UInt = 60u;
public const val `WINHTTP_QUERY_MESSAGE_ID`: UInt = 12u;
public const val `WINHTTP_QUERY_MIME_VERSION`: UInt = 0u;
public const val `WINHTTP_QUERY_ORIG_URI`: UInt = 34u;
public const val `WINHTTP_QUERY_PASSPORT_CONFIG`: UInt = 78u;
public const val `WINHTTP_QUERY_PASSPORT_URLS`: UInt = 77u;
public const val `WINHTTP_QUERY_PRAGMA`: UInt = 17u;
public const val `WINHTTP_QUERY_PROXY_AUTHENTICATE`: UInt = 41u;
public const val `WINHTTP_QUERY_PROXY_AUTHORIZATION`: UInt = 61u;
public const val `WINHTTP_QUERY_PROXY_CONNECTION`: UInt = 69u;
public const val `WINHTTP_QUERY_PROXY_SUPPORT`: UInt = 75u;
public const val `WINHTTP_QUERY_PUBLIC`: UInt = 8u;
public const val `WINHTTP_QUERY_RANGE`: UInt = 62u;
public const val `WINHTTP_QUERY_RAW_HEADERS`: UInt = 21u;
public const val `WINHTTP_QUERY_RAW_HEADERS_CRLF`: UInt = 22u;
public const val `WINHTTP_QUERY_REFERER`: UInt = 35u;
public const val `WINHTTP_QUERY_REFRESH`: UInt = 46u;
public const val `WINHTTP_QUERY_REQUEST_METHOD`: UInt = 45u;
public const val `WINHTTP_QUERY_RETRY_AFTER`: UInt = 36u;
public const val `WINHTTP_QUERY_SERVER`: UInt = 37u;
public const val `WINHTTP_QUERY_SET_COOKIE`: UInt = 43u;
public const val `WINHTTP_QUERY_STATUS_CODE`: UInt = 19u;
public const val `WINHTTP_QUERY_STATUS_TEXT`: UInt = 20u;
public const val `WINHTTP_QUERY_TITLE`: UInt = 38u;
public const val `WINHTTP_QUERY_TRANSFER_ENCODING`: UInt = 63u;
public const val `WINHTTP_QUERY_UNLESS_MODIFIED_SINCE`: UInt = 70u;
public const val `WINHTTP_QUERY_UPGRADE`: UInt = 64u;
public const val `WINHTTP_QUERY_URI`: UInt = 13u;
public const val `WINHTTP_QUERY_USER_AGENT`: UInt = 39u;
public const val `WINHTTP_QUERY_VARY`: UInt = 65u;
public const val `WINHTTP_QUERY_VERSION`: UInt = 18u;
public const val `WINHTTP_QUERY_VIA`: UInt = 66u;
public const val `WINHTTP_QUERY_WARNING`: UInt = 67u;
public const val `WINHTTP_QUERY_WWW_AUTHENTICATE`: UInt = 40u;
// UNSUPPORTED Rust 1019:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C, packed(4))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct WINHTTP_REQUEST_STATS {
//     pub ullFlags: u64,
//     pub ulIndex: u32,
//     pub cStats: u32,
//     pub rgullStats: [u64; 32],
// }

// UNSUPPORTED Rust 1028:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for WINHTTP_REQUEST_STATS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1034:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct WINHTTP_REQUEST_STATS {
//     pub ullFlags: u64,
//     pub ulIndex: u32,
//     pub cStats: u32,
//     pub rgullStats: [u64; 32],
// }

// UNSUPPORTED Rust 1043:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for WINHTTP_REQUEST_STATS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WINHTTP_REQUEST_STAT_ENTRY` = Int;
public const val `WINHTTP_REQUEST_STAT_FLAG_FIRST_REQUEST`: UInt = 32u;
public const val `WINHTTP_REQUEST_STAT_FLAG_PROXY_TLS_FALSE_START`: UInt = 16u;
public const val `WINHTTP_REQUEST_STAT_FLAG_PROXY_TLS_SESSION_RESUMPTION`: UInt = 8u;
public const val `WINHTTP_REQUEST_STAT_FLAG_TCP_FAST_OPEN`: UInt = 1u;
public const val `WINHTTP_REQUEST_STAT_FLAG_TLS_FALSE_START`: UInt = 4u;
public const val `WINHTTP_REQUEST_STAT_FLAG_TLS_SESSION_RESUMPTION`: UInt = 2u;
// UNSUPPORTED Rust 1056:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C, packed(4))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct WINHTTP_REQUEST_TIMES {
//     pub cTimes: u32,
//     pub rgullTimes: [u64; 64],
// }

// UNSUPPORTED Rust 1063:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for WINHTTP_REQUEST_TIMES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1069:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct WINHTTP_REQUEST_TIMES {
//     pub cTimes: u32,
//     pub rgullTimes: [u64; 64],
// }

// UNSUPPORTED Rust 1076:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for WINHTTP_REQUEST_TIMES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WINHTTP_REQUEST_TIME_ENTRY` = Int;
public const val `WINHTTP_RESET_ALL`: UInt = 65535u;
public const val `WINHTTP_RESET_DISCARD_RESOLVERS`: UInt = 262144u;
public const val `WINHTTP_RESET_NOTIFY_NETWORK_CHANGED`: UInt = 65536u;
public const val `WINHTTP_RESET_OUT_OF_PROC`: UInt = 131072u;
public const val `WINHTTP_RESET_SCRIPT_CACHE`: UInt = 8u;
public const val `WINHTTP_RESET_STATE`: UInt = 1u;
public const val `WINHTTP_RESET_SWPAD_ALL`: UInt = 4u;
public const val `WINHTTP_RESET_SWPAD_CURRENT_NETWORK`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINHTTP_RESOLVER_CACHE_CONFIG` (
    public var `ulMaxResolverCacheEntries`: UInt,
    public var `ulMaxCacheEntryAge`: UInt,
    public var `ulMinCacheEntryTtl`: UInt,
    public var `SecureDnsSetting`: `WINHTTP_SECURE_DNS_SETTING`,
    public var `ullConnResolutionWaitTime`: ULong,
    public var `ullFlags`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINHTTP_RESOLVER_CACHE_CONFIG` (
    public var `ulMaxResolverCacheEntries`: UInt,
    public var `ulMaxCacheEntryAge`: UInt,
    public var `ulMinCacheEntryTtl`: UInt,
    public var `SecureDnsSetting`: `WINHTTP_SECURE_DNS_SETTING`,
    public var `ullConnResolutionWaitTime`: ULong,
    public var `ullFlags`: ULong,
)
public const val `WINHTTP_RESOLVER_CACHE_CONFIG_FLAG_BYPASS_CACHE`: UInt = 2u;
public const val `WINHTTP_RESOLVER_CACHE_CONFIG_FLAG_CONN_USE_TTL`: UInt = 8u;
public const val `WINHTTP_RESOLVER_CACHE_CONFIG_FLAG_SOFT_LIMIT`: UInt = 1u;
public const val `WINHTTP_RESOLVER_CACHE_CONFIG_FLAG_USE_DNS_TTL`: UInt = 4u;
public typealias `WINHTTP_SECURE_DNS_SETTING` = Int;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WINHTTP_STATUS_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, ULong, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> Unit>>>;
public const val `WINHTTP_TIME_FORMAT_BUFSIZE`: UInt = 62u;
public const val `WINHTTP_WEB_SOCKET_ABORTED_CLOSE_STATUS`: `WINHTTP_WEB_SOCKET_CLOSE_STATUS` = 1006;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINHTTP_WEB_SOCKET_ASYNC_RESULT` (
    public var `AsyncResult`: `WINHTTP_ASYNC_RESULT`,
    public var `Operation`: `WINHTTP_WEB_SOCKET_OPERATION`,
)
public const val `WINHTTP_WEB_SOCKET_BINARY_FRAGMENT_BUFFER_TYPE`: `WINHTTP_WEB_SOCKET_BUFFER_TYPE` = 1;
public const val `WINHTTP_WEB_SOCKET_BINARY_MESSAGE_BUFFER_TYPE`: `WINHTTP_WEB_SOCKET_BUFFER_TYPE` = 0;
public typealias `WINHTTP_WEB_SOCKET_BUFFER_TYPE` = Int;
public const val `WINHTTP_WEB_SOCKET_CLOSE_BUFFER_TYPE`: `WINHTTP_WEB_SOCKET_BUFFER_TYPE` = 4;
public const val `WINHTTP_WEB_SOCKET_CLOSE_OPERATION`: `WINHTTP_WEB_SOCKET_OPERATION` = 2;
public typealias `WINHTTP_WEB_SOCKET_CLOSE_STATUS` = Int;
public const val `WINHTTP_WEB_SOCKET_EMPTY_CLOSE_STATUS`: `WINHTTP_WEB_SOCKET_CLOSE_STATUS` = 1005;
public const val `WINHTTP_WEB_SOCKET_ENDPOINT_TERMINATED_CLOSE_STATUS`: `WINHTTP_WEB_SOCKET_CLOSE_STATUS` = 1001;
public const val `WINHTTP_WEB_SOCKET_INVALID_DATA_TYPE_CLOSE_STATUS`: `WINHTTP_WEB_SOCKET_CLOSE_STATUS` = 1003;
public const val `WINHTTP_WEB_SOCKET_INVALID_PAYLOAD_CLOSE_STATUS`: `WINHTTP_WEB_SOCKET_CLOSE_STATUS` = 1007;
public const val `WINHTTP_WEB_SOCKET_MAX_CLOSE_REASON_LENGTH`: UInt = 123u;
public const val `WINHTTP_WEB_SOCKET_MESSAGE_TOO_BIG_CLOSE_STATUS`: `WINHTTP_WEB_SOCKET_CLOSE_STATUS` = 1009;
public const val `WINHTTP_WEB_SOCKET_MIN_KEEPALIVE_VALUE`: UInt = 15000u;
public typealias `WINHTTP_WEB_SOCKET_OPERATION` = Int;
public const val `WINHTTP_WEB_SOCKET_POLICY_VIOLATION_CLOSE_STATUS`: `WINHTTP_WEB_SOCKET_CLOSE_STATUS` = 1008;
public const val `WINHTTP_WEB_SOCKET_PROTOCOL_ERROR_CLOSE_STATUS`: `WINHTTP_WEB_SOCKET_CLOSE_STATUS` = 1002;
public const val `WINHTTP_WEB_SOCKET_RECEIVE_OPERATION`: `WINHTTP_WEB_SOCKET_OPERATION` = 1;
public const val `WINHTTP_WEB_SOCKET_SECURE_HANDSHAKE_ERROR_CLOSE_STATUS`: `WINHTTP_WEB_SOCKET_CLOSE_STATUS` = 1015;
public const val `WINHTTP_WEB_SOCKET_SEND_OPERATION`: `WINHTTP_WEB_SOCKET_OPERATION` = 0;
public const val `WINHTTP_WEB_SOCKET_SERVER_ERROR_CLOSE_STATUS`: `WINHTTP_WEB_SOCKET_CLOSE_STATUS` = 1011;
public const val `WINHTTP_WEB_SOCKET_SHUTDOWN_OPERATION`: `WINHTTP_WEB_SOCKET_OPERATION` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINHTTP_WEB_SOCKET_STATUS` (
    public var `dwBytesTransferred`: UInt,
    public var `eBufferType`: `WINHTTP_WEB_SOCKET_BUFFER_TYPE`,
)
public const val `WINHTTP_WEB_SOCKET_SUCCESS_CLOSE_STATUS`: `WINHTTP_WEB_SOCKET_CLOSE_STATUS` = 1000;
public const val `WINHTTP_WEB_SOCKET_UNSUPPORTED_EXTENSIONS_CLOSE_STATUS`: `WINHTTP_WEB_SOCKET_CLOSE_STATUS` = 1010;
public const val `WINHTTP_WEB_SOCKET_UTF8_FRAGMENT_BUFFER_TYPE`: `WINHTTP_WEB_SOCKET_BUFFER_TYPE` = 3;
public const val `WINHTTP_WEB_SOCKET_UTF8_MESSAGE_BUFFER_TYPE`: `WINHTTP_WEB_SOCKET_BUFFER_TYPE` = 2;
public typealias `WIN_HTTP_CREATE_URL_FLAGS` = UInt;
public const val `WinHttpConnectFailureCount`: `WINHTTP_REQUEST_STAT_ENTRY` = 0;
public const val `WinHttpConnectionAcquireEnd`: `WINHTTP_REQUEST_TIME_ENTRY` = 4;
public const val `WinHttpConnectionAcquireStart`: `WINHTTP_REQUEST_TIME_ENTRY` = 2;
public const val `WinHttpConnectionAcquireWaitEnd`: `WINHTTP_REQUEST_TIME_ENTRY` = 3;
public const val `WinHttpConnectionEstablishmentEnd`: `WINHTTP_REQUEST_TIME_ENTRY` = 8;
public const val `WinHttpConnectionEstablishmentStart`: `WINHTTP_REQUEST_TIME_ENTRY` = 7;
public const val `WinHttpNameResolutionEnd`: `WINHTTP_REQUEST_TIME_ENTRY` = 6;
public const val `WinHttpNameResolutionStart`: `WINHTTP_REQUEST_TIME_ENTRY` = 5;
public const val `WinHttpProxyDetectionEnd`: `WINHTTP_REQUEST_TIME_ENTRY` = 1;
public const val `WinHttpProxyDetectionStart`: `WINHTTP_REQUEST_TIME_ENTRY` = 0;
public const val `WinHttpProxyFailureCount`: `WINHTTP_REQUEST_STAT_ENTRY` = 1;
public const val `WinHttpProxySettingsTypeUnknown`: `WINHTTP_PROXY_SETTINGS_TYPE` = 0;
public const val `WinHttpProxySettingsTypeWsa`: `WINHTTP_PROXY_SETTINGS_TYPE` = 2;
public const val `WinHttpProxySettingsTypeWsl`: `WINHTTP_PROXY_SETTINGS_TYPE` = 1;
public const val `WinHttpProxyTlsHandshakeClientLeg1End`: `WINHTTP_REQUEST_TIME_ENTRY` = 31;
public const val `WinHttpProxyTlsHandshakeClientLeg1Size`: `WINHTTP_REQUEST_STAT_ENTRY` = 12;
public const val `WinHttpProxyTlsHandshakeClientLeg1Start`: `WINHTTP_REQUEST_TIME_ENTRY` = 30;
public const val `WinHttpProxyTlsHandshakeClientLeg2End`: `WINHTTP_REQUEST_TIME_ENTRY` = 33;
public const val `WinHttpProxyTlsHandshakeClientLeg2Size`: `WINHTTP_REQUEST_STAT_ENTRY` = 14;
public const val `WinHttpProxyTlsHandshakeClientLeg2Start`: `WINHTTP_REQUEST_TIME_ENTRY` = 32;
public const val `WinHttpProxyTlsHandshakeClientLeg3End`: `WINHTTP_REQUEST_TIME_ENTRY` = 35;
public const val `WinHttpProxyTlsHandshakeClientLeg3Start`: `WINHTTP_REQUEST_TIME_ENTRY` = 34;
public const val `WinHttpProxyTlsHandshakeServerLeg1Size`: `WINHTTP_REQUEST_STAT_ENTRY` = 13;
public const val `WinHttpProxyTlsHandshakeServerLeg2Size`: `WINHTTP_REQUEST_STAT_ENTRY` = 15;
public const val `WinHttpProxyTunnelEnd`: `WINHTTP_REQUEST_TIME_ENTRY` = 29;
public const val `WinHttpProxyTunnelStart`: `WINHTTP_REQUEST_TIME_ENTRY` = 28;
public const val `WinHttpReceiveResponseBodyDecompressionDelta`: `WINHTTP_REQUEST_TIME_ENTRY` = 26;
public const val `WinHttpReceiveResponseEnd`: `WINHTTP_REQUEST_TIME_ENTRY` = 27;
public const val `WinHttpReceiveResponseHeadersDecompressionEnd`: `WINHTTP_REQUEST_TIME_ENTRY` = 24;
public const val `WinHttpReceiveResponseHeadersDecompressionStart`: `WINHTTP_REQUEST_TIME_ENTRY` = 23;
public const val `WinHttpReceiveResponseHeadersEnd`: `WINHTTP_REQUEST_TIME_ENTRY` = 25;
public const val `WinHttpReceiveResponseStart`: `WINHTTP_REQUEST_TIME_ENTRY` = 22;
// UNSUPPORTED Rust 1191:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WinHttpRequest: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2087c2f4_2cef_4953_a8ab_66779b670495);

public typealias `WinHttpRequestAutoLogonPolicy` = Int;
public const val `WinHttpRequestHeadersCompressedSize`: `WINHTTP_REQUEST_STAT_ENTRY` = 7;
public const val `WinHttpRequestHeadersSize`: `WINHTTP_REQUEST_STAT_ENTRY` = 6;
public typealias `WinHttpRequestOption` = Int;
public const val `WinHttpRequestOption_EnableCertificateRevocationCheck`: `WinHttpRequestOption` = 18;
public const val `WinHttpRequestOption_EnableHttp1_1`: `WinHttpRequestOption` = 17;
public const val `WinHttpRequestOption_EnableHttpsToHttpRedirects`: `WinHttpRequestOption` = 12;
public const val `WinHttpRequestOption_EnablePassportAuthentication`: `WinHttpRequestOption` = 13;
public const val `WinHttpRequestOption_EnableRedirects`: `WinHttpRequestOption` = 6;
public const val `WinHttpRequestOption_EnableTracing`: `WinHttpRequestOption` = 10;
public const val `WinHttpRequestOption_EscapePercentInURL`: `WinHttpRequestOption` = 3;
public const val `WinHttpRequestOption_MaxAutomaticRedirects`: `WinHttpRequestOption` = 14;
public const val `WinHttpRequestOption_MaxResponseDrainSize`: `WinHttpRequestOption` = 16;
public const val `WinHttpRequestOption_MaxResponseHeaderSize`: `WinHttpRequestOption` = 15;
public const val `WinHttpRequestOption_RejectUserpwd`: `WinHttpRequestOption` = 19;
public const val `WinHttpRequestOption_RevertImpersonationOverSsl`: `WinHttpRequestOption` = 11;
public const val `WinHttpRequestOption_SecureProtocols`: `WinHttpRequestOption` = 9;
public const val `WinHttpRequestOption_SelectCertificate`: `WinHttpRequestOption` = 5;
public const val `WinHttpRequestOption_SslErrorIgnoreFlags`: `WinHttpRequestOption` = 4;
public const val `WinHttpRequestOption_URL`: `WinHttpRequestOption` = 1;
public const val `WinHttpRequestOption_URLCodePage`: `WinHttpRequestOption` = 2;
public const val `WinHttpRequestOption_UrlEscapeDisable`: `WinHttpRequestOption` = 7;
public const val `WinHttpRequestOption_UrlEscapeDisableQuery`: `WinHttpRequestOption` = 8;
public const val `WinHttpRequestOption_UserAgentString`: `WinHttpRequestOption` = 0;
public typealias `WinHttpRequestSecureProtocols` = Int;
public typealias `WinHttpRequestSslErrorFlags` = Int;
public const val `WinHttpRequestStatLast`: `WINHTTP_REQUEST_STAT_ENTRY` = 16;
public const val `WinHttpRequestStatMax`: `WINHTTP_REQUEST_STAT_ENTRY` = 32;
public const val `WinHttpRequestTimeLast`: `WINHTTP_REQUEST_TIME_ENTRY` = 36;
public const val `WinHttpRequestTimeMax`: `WINHTTP_REQUEST_TIME_ENTRY` = 64;
public const val `WinHttpResponseBodyCompressedSize`: `WINHTTP_REQUEST_STAT_ENTRY` = 11;
public const val `WinHttpResponseBodySize`: `WINHTTP_REQUEST_STAT_ENTRY` = 10;
public const val `WinHttpResponseHeadersCompressedSize`: `WINHTTP_REQUEST_STAT_ENTRY` = 9;
public const val `WinHttpResponseHeadersSize`: `WINHTTP_REQUEST_STAT_ENTRY` = 8;
public const val `WinHttpSecureDnsSettingDefault`: `WINHTTP_SECURE_DNS_SETTING` = 0;
public const val `WinHttpSecureDnsSettingForcePlaintext`: `WINHTTP_SECURE_DNS_SETTING` = 1;
public const val `WinHttpSecureDnsSettingMax`: `WINHTTP_SECURE_DNS_SETTING` = 4;
public const val `WinHttpSecureDnsSettingRequireEncryption`: `WINHTTP_SECURE_DNS_SETTING` = 2;
public const val `WinHttpSecureDnsSettingTryEncryptionWithFallback`: `WINHTTP_SECURE_DNS_SETTING` = 3;
public const val `WinHttpSendRequestEnd`: `WINHTTP_REQUEST_TIME_ENTRY` = 21;
public const val `WinHttpSendRequestHeadersCompressionEnd`: `WINHTTP_REQUEST_TIME_ENTRY` = 19;
public const val `WinHttpSendRequestHeadersCompressionStart`: `WINHTTP_REQUEST_TIME_ENTRY` = 18;
public const val `WinHttpSendRequestHeadersEnd`: `WINHTTP_REQUEST_TIME_ENTRY` = 20;
public const val `WinHttpSendRequestStart`: `WINHTTP_REQUEST_TIME_ENTRY` = 17;
public const val `WinHttpStreamWaitEnd`: `WINHTTP_REQUEST_TIME_ENTRY` = 16;
public const val `WinHttpStreamWaitStart`: `WINHTTP_REQUEST_TIME_ENTRY` = 15;
public const val `WinHttpTlsHandshakeClientLeg1End`: `WINHTTP_REQUEST_TIME_ENTRY` = 10;
public const val `WinHttpTlsHandshakeClientLeg1Size`: `WINHTTP_REQUEST_STAT_ENTRY` = 2;
public const val `WinHttpTlsHandshakeClientLeg1Start`: `WINHTTP_REQUEST_TIME_ENTRY` = 9;
public const val `WinHttpTlsHandshakeClientLeg2End`: `WINHTTP_REQUEST_TIME_ENTRY` = 12;
public const val `WinHttpTlsHandshakeClientLeg2Size`: `WINHTTP_REQUEST_STAT_ENTRY` = 4;
public const val `WinHttpTlsHandshakeClientLeg2Start`: `WINHTTP_REQUEST_TIME_ENTRY` = 11;
public const val `WinHttpTlsHandshakeClientLeg3End`: `WINHTTP_REQUEST_TIME_ENTRY` = 14;
public const val `WinHttpTlsHandshakeClientLeg3Start`: `WINHTTP_REQUEST_TIME_ENTRY` = 13;
public const val `WinHttpTlsHandshakeServerLeg1Size`: `WINHTTP_REQUEST_STAT_ENTRY` = 3;
public const val `WinHttpTlsHandshakeServerLeg2Size`: `WINHTTP_REQUEST_STAT_ENTRY` = 5;
