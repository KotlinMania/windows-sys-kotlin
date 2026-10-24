// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=activeds.dll, ABI=system, export=ADsBuildEnumerator; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `ADsBuildEnumerator`(`padscontainer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppenumvariant` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=activeds.dll, ABI=system, export=ADsBuildVarArrayInt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
public external fun `ADsBuildVarArrayInt`(`lpdwobjecttypes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwobjecttypes` : UInt, `pvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Variant`.`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=activeds.dll, ABI=system, export=ADsBuildVarArrayStr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
public external fun `ADsBuildVarArrayStr`(`lpppathnames` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, `dwpathnames` : UInt, `pvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Variant`.`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=activeds.dll, ABI=system, export=ADsDecodeBinaryData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ADsDecodeBinaryData`(`szsrcdata` : `windows_sys`.`core`.`PCWSTR`, `ppbdestdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `pdwdestlen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=activeds.dll, ABI=system, export=ADsEncodeBinaryData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ADsEncodeBinaryData`(`pbsrcdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwsrclen` : UInt, `ppszdestdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=activeds.dll, ABI=system, export=ADsEnumerateNext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
public external fun `ADsEnumerateNext`(`penumvariant` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `celements` : UInt, `pvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Variant`.`VARIANT`>?, `pcelementsfetched` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=activeds.dll, ABI=system, export=ADsFreeEnumerator; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Ole")]
public external fun `ADsFreeEnumerator`(`penumvariant` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=activeds.dll, ABI=system, export=ADsGetLastError; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ADsGetLastError`(`lperror` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lperrorbuf` : `windows_sys`.`core`.`PWSTR`, `dwerrorbuflen` : UInt, `lpnamebuf` : `windows_sys`.`core`.`PWSTR`, `dwnamebuflen` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=activeds.dll, ABI=system, export=ADsGetObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ADsGetObject`(`lpszpathname` : `windows_sys`.`core`.`PCWSTR`, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=activeds.dll, ABI=system, export=ADsOpenObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ADsOpenObject`(`lpszpathname` : `windows_sys`.`core`.`PCWSTR`, `lpszusername` : `windows_sys`.`core`.`PCWSTR`, `lpszpassword` : `windows_sys`.`core`.`PCWSTR`, `dwreserved` : `ADS_AUTHENTICATION_ENUM`, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dsprop.dll, ABI=system, export=ADsPropCheckIfWritable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ADsPropCheckIfWritable`(`pwzattr` : `windows_sys`.`core`.`PCWSTR`, `pwritableattrs` : /* Rust *const */ kotlinx.cinterop.CPointer<`ADS_ATTR_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dsprop.dll, ABI=system, export=ADsPropCreateNotifyObj; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `ADsPropCreateNotifyObj`(`pappthddataobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwzadsobjname` : `windows_sys`.`core`.`PCWSTR`, `phnotifyobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HWND`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dsprop.dll, ABI=system, export=ADsPropGetInitInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ADsPropGetInitInfo`(`hnotifyobj` : `super`.`super`.`Foundation`.`HWND`, `pinitparams` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ADSPROPINITPARAMS`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dsprop.dll, ABI=system, export=ADsPropSendErrorMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ADsPropSendErrorMessage`(`hnotifyobj` : `super`.`super`.`Foundation`.`HWND`, `perror` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ADSPROPERROR`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dsprop.dll, ABI=system, export=ADsPropSetHwnd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ADsPropSetHwnd`(`hnotifyobj` : `super`.`super`.`Foundation`.`HWND`, `hpage` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dsprop.dll, ABI=system, export=ADsPropSetHwndWithTitle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ADsPropSetHwndWithTitle`(`hnotifyobj` : `super`.`super`.`Foundation`.`HWND`, `hpage` : `super`.`super`.`Foundation`.`HWND`, `ptztitle` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dsprop.dll, ABI=system, export=ADsPropShowErrorDialog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ADsPropShowErrorDialog`(`hnotifyobj` : `super`.`super`.`Foundation`.`HWND`, `hpage` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=activeds.dll, ABI=system, export=ADsSetLastError; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ADsSetLastError`(`dwerr` : UInt, `pszerror` : `windows_sys`.`core`.`PCWSTR`, `pszprovider` : `windows_sys`.`core`.`PCWSTR`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=activeds.dll, ABI=system, export=AdsFreeAdsValues; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AdsFreeAdsValues`(`padsvalues` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ADSVALUE`>?, `dwnumvalues` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=activeds.dll, ABI=system, export=AdsTypeToPropVariant; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
public external fun `AdsTypeToPropVariant`(`padsvalues` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ADSVALUE`>?, `dwnumvalues` : UInt, `pvariant` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Variant`.`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=activeds.dll, ABI=system, export=AllocADsMem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AllocADsMem`(`cb` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=activeds.dll, ABI=system, export=AllocADsStr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AllocADsStr`(`pstr` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`PWSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=activeds.dll, ABI=system, export=BinarySDToSecurityDescriptor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security", feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
public external fun `BinarySDToSecurityDescriptor`(`psecuritydescriptor` : `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`, `pvarsec` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Variant`.`VARIANT`>?, `pszservername` : `windows_sys`.`core`.`PCWSTR`, `username` : `windows_sys`.`core`.`PCWSTR`, `password` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsAddSidHistoryA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsAddSidHistoryA`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `flags` : UInt, `srcdomain` : `windows_sys`.`core`.`PCSTR`, `srcprincipal` : `windows_sys`.`core`.`PCSTR`, `srcdomaincontroller` : `windows_sys`.`core`.`PCSTR`, `srcdomaincreds` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dstdomain` : `windows_sys`.`core`.`PCSTR`, `dstprincipal` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsAddSidHistoryW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsAddSidHistoryW`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `flags` : UInt, `srcdomain` : `windows_sys`.`core`.`PCWSTR`, `srcprincipal` : `windows_sys`.`core`.`PCWSTR`, `srcdomaincontroller` : `windows_sys`.`core`.`PCWSTR`, `srcdomaincreds` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dstdomain` : `windows_sys`.`core`.`PCWSTR`, `dstprincipal` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=DsAddressToSiteNamesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `DsAddressToSiteNamesA`(`computername` : `windows_sys`.`core`.`PCSTR`, `entrycount` : UInt, `socketaddresses` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`WinSock`.`SOCKET_ADDRESS`>?, `sitenames` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`PSTR`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=DsAddressToSiteNamesExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `DsAddressToSiteNamesExA`(`computername` : `windows_sys`.`core`.`PCSTR`, `entrycount` : UInt, `socketaddresses` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`WinSock`.`SOCKET_ADDRESS`>?, `sitenames` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`PSTR`>>?, `subnetnames` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`PSTR`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=DsAddressToSiteNamesExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `DsAddressToSiteNamesExW`(`computername` : `windows_sys`.`core`.`PCWSTR`, `entrycount` : UInt, `socketaddresses` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`WinSock`.`SOCKET_ADDRESS`>?, `sitenames` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`PWSTR`>>?, `subnetnames` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`PWSTR`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=DsAddressToSiteNamesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `DsAddressToSiteNamesW`(`computername` : `windows_sys`.`core`.`PCWSTR`, `entrycount` : UInt, `socketaddresses` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`WinSock`.`SOCKET_ADDRESS`>?, `sitenames` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`PWSTR`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsBindA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsBindA`(`domaincontrollername` : `windows_sys`.`core`.`PCSTR`, `dnsdomainname` : `windows_sys`.`core`.`PCSTR`, `phds` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsBindByInstanceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsBindByInstanceA`(`servername` : `windows_sys`.`core`.`PCSTR`, `annotation` : `windows_sys`.`core`.`PCSTR`, `instanceguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dnsdomainname` : `windows_sys`.`core`.`PCSTR`, `authidentity` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `serviceprincipalname` : `windows_sys`.`core`.`PCSTR`, `bindflags` : UInt, `phds` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsBindByInstanceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsBindByInstanceW`(`servername` : `windows_sys`.`core`.`PCWSTR`, `annotation` : `windows_sys`.`core`.`PCWSTR`, `instanceguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dnsdomainname` : `windows_sys`.`core`.`PCWSTR`, `authidentity` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `serviceprincipalname` : `windows_sys`.`core`.`PCWSTR`, `bindflags` : UInt, `phds` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsBindToISTGA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsBindToISTGA`(`sitename` : `windows_sys`.`core`.`PCSTR`, `phds` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsBindToISTGW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsBindToISTGW`(`sitename` : `windows_sys`.`core`.`PCWSTR`, `phds` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsBindW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsBindW`(`domaincontrollername` : `windows_sys`.`core`.`PCWSTR`, `dnsdomainname` : `windows_sys`.`core`.`PCWSTR`, `phds` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsBindWithCredA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsBindWithCredA`(`domaincontrollername` : `windows_sys`.`core`.`PCSTR`, `dnsdomainname` : `windows_sys`.`core`.`PCSTR`, `authidentity` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phds` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsBindWithCredW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsBindWithCredW`(`domaincontrollername` : `windows_sys`.`core`.`PCWSTR`, `dnsdomainname` : `windows_sys`.`core`.`PCWSTR`, `authidentity` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phds` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsBindWithSpnA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsBindWithSpnA`(`domaincontrollername` : `windows_sys`.`core`.`PCSTR`, `dnsdomainname` : `windows_sys`.`core`.`PCSTR`, `authidentity` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `serviceprincipalname` : `windows_sys`.`core`.`PCSTR`, `phds` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsBindWithSpnExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsBindWithSpnExA`(`domaincontrollername` : `windows_sys`.`core`.`PCSTR`, `dnsdomainname` : `windows_sys`.`core`.`PCSTR`, `authidentity` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `serviceprincipalname` : `windows_sys`.`core`.`PCSTR`, `bindflags` : UInt, `phds` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsBindWithSpnExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsBindWithSpnExW`(`domaincontrollername` : `windows_sys`.`core`.`PCWSTR`, `dnsdomainname` : `windows_sys`.`core`.`PCWSTR`, `authidentity` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `serviceprincipalname` : `windows_sys`.`core`.`PCWSTR`, `bindflags` : UInt, `phds` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsBindWithSpnW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsBindWithSpnW`(`domaincontrollername` : `windows_sys`.`core`.`PCWSTR`, `dnsdomainname` : `windows_sys`.`core`.`PCWSTR`, `authidentity` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `serviceprincipalname` : `windows_sys`.`core`.`PCWSTR`, `phds` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsBindingSetTimeout; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsBindingSetTimeout`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `ctimeoutsecs` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dsuiext.dll, ABI=system, export=DsBrowseForContainerA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Shell")]
public external fun `DsBrowseForContainerA`(`pinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DSBROWSEINFOA`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dsuiext.dll, ABI=system, export=DsBrowseForContainerW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Shell")]
public external fun `DsBrowseForContainerW`(`pinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DSBROWSEINFOW`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsClientMakeSpnForTargetServerA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsClientMakeSpnForTargetServerA`(`serviceclass` : `windows_sys`.`core`.`PCSTR`, `servicename` : `windows_sys`.`core`.`PCSTR`, `pcspnlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pszspn` : `windows_sys`.`core`.`PSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsClientMakeSpnForTargetServerW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsClientMakeSpnForTargetServerW`(`serviceclass` : `windows_sys`.`core`.`PCWSTR`, `servicename` : `windows_sys`.`core`.`PCWSTR`, `pcspnlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pszspn` : `windows_sys`.`core`.`PWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsCrackNamesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsCrackNamesA`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `flags` : `DS_NAME_FLAGS`, `formatoffered` : `DS_NAME_FORMAT`, `formatdesired` : `DS_NAME_FORMAT`, `cnames` : UInt, `rpnames` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCSTR`>?, `ppresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DS_NAME_RESULTA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsCrackNamesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsCrackNamesW`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `flags` : `DS_NAME_FLAGS`, `formatoffered` : `DS_NAME_FORMAT`, `formatdesired` : `DS_NAME_FORMAT`, `cnames` : UInt, `rpnames` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, `ppresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DS_NAME_RESULTW`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dsparse.dll, ABI=system, export=DsCrackSpn2A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsCrackSpn2A`(`pszspn` : `windows_sys`.`core`.`PCSTR`, `cspn` : UInt, `pcserviceclass` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `serviceclass` : `windows_sys`.`core`.`PSTR`, `pcservicename` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `servicename` : `windows_sys`.`core`.`PSTR`, `pcinstancename` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `instancename` : `windows_sys`.`core`.`PSTR`, `pinstanceport` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dsparse.dll, ABI=system, export=DsCrackSpn2W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsCrackSpn2W`(`pszspn` : `windows_sys`.`core`.`PCWSTR`, `cspn` : UInt, `pcserviceclass` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `serviceclass` : `windows_sys`.`core`.`PWSTR`, `pcservicename` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `servicename` : `windows_sys`.`core`.`PWSTR`, `pcinstancename` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `instancename` : `windows_sys`.`core`.`PWSTR`, `pinstanceport` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dsparse.dll, ABI=system, export=DsCrackSpn3W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsCrackSpn3W`(`pszspn` : `windows_sys`.`core`.`PCWSTR`, `cspn` : UInt, `pchostname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `hostname` : `windows_sys`.`core`.`PWSTR`, `pcinstancename` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `instancename` : `windows_sys`.`core`.`PWSTR`, `pportnumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pcdomainname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `domainname` : `windows_sys`.`core`.`PWSTR`, `pcrealmname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `realmname` : `windows_sys`.`core`.`PWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dsparse.dll, ABI=system, export=DsCrackSpn4W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsCrackSpn4W`(`pszspn` : `windows_sys`.`core`.`PCWSTR`, `cspn` : UInt, `pchostname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `hostname` : `windows_sys`.`core`.`PWSTR`, `pcinstancename` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `instancename` : `windows_sys`.`core`.`PWSTR`, `pcportname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `portname` : `windows_sys`.`core`.`PWSTR`, `pcdomainname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `domainname` : `windows_sys`.`core`.`PWSTR`, `pcrealmname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `realmname` : `windows_sys`.`core`.`PWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dsparse.dll, ABI=system, export=DsCrackSpnA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsCrackSpnA`(`pszspn` : `windows_sys`.`core`.`PCSTR`, `pcserviceclass` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `serviceclass` : `windows_sys`.`core`.`PSTR`, `pcservicename` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `servicename` : `windows_sys`.`core`.`PSTR`, `pcinstancename` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `instancename` : `windows_sys`.`core`.`PSTR`, `pinstanceport` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dsparse.dll, ABI=system, export=DsCrackSpnW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsCrackSpnW`(`pszspn` : `windows_sys`.`core`.`PCWSTR`, `pcserviceclass` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `serviceclass` : `windows_sys`.`core`.`PWSTR`, `pcservicename` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `servicename` : `windows_sys`.`core`.`PWSTR`, `pcinstancename` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `instancename` : `windows_sys`.`core`.`PWSTR`, `pinstanceport` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dsparse.dll, ABI=system, export=DsCrackUnquotedMangledRdnA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsCrackUnquotedMangledRdnA`(`pszrdn` : `windows_sys`.`core`.`PCSTR`, `cchrdn` : UInt, `pguid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pedsmanglefor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DS_MANGLE_FOR`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dsparse.dll, ABI=system, export=DsCrackUnquotedMangledRdnW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsCrackUnquotedMangledRdnW`(`pszrdn` : `windows_sys`.`core`.`PCWSTR`, `cchrdn` : UInt, `pguid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pedsmanglefor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DS_MANGLE_FOR`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=DsDeregisterDnsHostRecordsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsDeregisterDnsHostRecordsA`(`servername` : `windows_sys`.`core`.`PCSTR`, `dnsdomainname` : `windows_sys`.`core`.`PCSTR`, `domainguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dsaguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dnshostname` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=DsDeregisterDnsHostRecordsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsDeregisterDnsHostRecordsW`(`servername` : `windows_sys`.`core`.`PCWSTR`, `dnsdomainname` : `windows_sys`.`core`.`PCWSTR`, `domainguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dsaguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dnshostname` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=DsEnumerateDomainTrustsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `DsEnumerateDomainTrustsA`(`servername` : `windows_sys`.`core`.`PCSTR`, `flags` : UInt, `domains` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DS_DOMAIN_TRUSTSA`>>?, `domaincount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=DsEnumerateDomainTrustsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `DsEnumerateDomainTrustsW`(`servername` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `domains` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DS_DOMAIN_TRUSTSW`>>?, `domaincount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsFreeDomainControllerInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsFreeDomainControllerInfoA`(`infolevel` : UInt, `cinfo` : UInt, `pinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsFreeDomainControllerInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsFreeDomainControllerInfoW`(`infolevel` : UInt, `cinfo` : UInt, `pinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsFreeNameResultA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsFreeNameResultA`(`presult` : /* Rust *const */ kotlinx.cinterop.CPointer<`DS_NAME_RESULTA`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsFreeNameResultW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsFreeNameResultW`(`presult` : /* Rust *const */ kotlinx.cinterop.CPointer<`DS_NAME_RESULTW`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsFreePasswordCredentials; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsFreePasswordCredentials`(`authidentity` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsFreeSchemaGuidMapA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsFreeSchemaGuidMapA`(`pguidmap` : /* Rust *const */ kotlinx.cinterop.CPointer<`DS_SCHEMA_GUID_MAPA`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsFreeSchemaGuidMapW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsFreeSchemaGuidMapW`(`pguidmap` : /* Rust *const */ kotlinx.cinterop.CPointer<`DS_SCHEMA_GUID_MAPW`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsFreeSpnArrayA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsFreeSpnArrayA`(`cspn` : UInt, `rpszspn` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsFreeSpnArrayW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsFreeSpnArrayW`(`cspn` : UInt, `rpszspn` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=DsGetDcCloseW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsGetDcCloseW`(`getdccontexthandle` : `super`.`super`.`Foundation`.`HANDLE`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=DsGetDcNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsGetDcNameA`(`computername` : `windows_sys`.`core`.`PCSTR`, `domainname` : `windows_sys`.`core`.`PCSTR`, `domainguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `sitename` : `windows_sys`.`core`.`PCSTR`, `flags` : UInt, `domaincontrollerinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DOMAIN_CONTROLLER_INFOA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=DsGetDcNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsGetDcNameW`(`computername` : `windows_sys`.`core`.`PCWSTR`, `domainname` : `windows_sys`.`core`.`PCWSTR`, `domainguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `sitename` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `domaincontrollerinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DOMAIN_CONTROLLER_INFOW`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=DsGetDcNextA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `DsGetDcNextA`(`getdccontexthandle` : `super`.`super`.`Foundation`.`HANDLE`, `sockaddresscount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `sockaddresses` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`WinSock`.`SOCKET_ADDRESS`>>?, `dnshostname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=DsGetDcNextW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `DsGetDcNextW`(`getdccontexthandle` : `super`.`super`.`Foundation`.`HANDLE`, `sockaddresscount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `sockaddresses` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`WinSock`.`SOCKET_ADDRESS`>>?, `dnshostname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=DsGetDcOpenA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsGetDcOpenA`(`dnsname` : `windows_sys`.`core`.`PCSTR`, `optionflags` : UInt, `sitename` : `windows_sys`.`core`.`PCSTR`, `domainguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dnsforestname` : `windows_sys`.`core`.`PCSTR`, `dcflags` : UInt, `retgetdccontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=DsGetDcOpenW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsGetDcOpenW`(`dnsname` : `windows_sys`.`core`.`PCWSTR`, `optionflags` : UInt, `sitename` : `windows_sys`.`core`.`PCWSTR`, `domainguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dnsforestname` : `windows_sys`.`core`.`PCWSTR`, `dcflags` : UInt, `retgetdccontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=DsGetDcSiteCoverageA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsGetDcSiteCoverageA`(`servername` : `windows_sys`.`core`.`PCSTR`, `entrycount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `sitenames` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`PSTR`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=DsGetDcSiteCoverageW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsGetDcSiteCoverageW`(`servername` : `windows_sys`.`core`.`PCWSTR`, `entrycount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `sitenames` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`PWSTR`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsGetDomainControllerInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsGetDomainControllerInfoA`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `domainname` : `windows_sys`.`core`.`PCSTR`, `infolevel` : UInt, `pcout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsGetDomainControllerInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsGetDomainControllerInfoW`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `domainname` : `windows_sys`.`core`.`PCWSTR`, `infolevel` : UInt, `pcout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=DsGetForestTrustInformationW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Authentication_Identity")]
public external fun `DsGetForestTrustInformationW`(`servername` : `windows_sys`.`core`.`PCWSTR`, `trusteddomainname` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `foresttrustinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`Authentication`.`Identity`.`LSA_FOREST_TRUST_INFORMATION`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dsuiext.dll, ABI=system, export=DsGetFriendlyClassName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsGetFriendlyClassName`(`pszobjectclass` : `windows_sys`.`core`.`PCWSTR`, `pszbuffer` : `windows_sys`.`core`.`PWSTR`, `cchbuffer` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dsuiext.dll, ABI=system, export=DsGetIcon; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `DsGetIcon`(`dwflags` : UInt, `pszobjectclass` : `windows_sys`.`core`.`PCWSTR`, `cximage` : Int, `cyimage` : Int) : `super`.`super`.`UI`.`WindowsAndMessaging`.`HICON`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dsparse.dll, ABI=system, export=DsGetRdnW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsGetRdnW`(`ppdn` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `pcdn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppkey` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `pckey` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppval` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `pcval` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=DsGetSiteNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsGetSiteNameA`(`computername` : `windows_sys`.`core`.`PCSTR`, `sitename` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=DsGetSiteNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsGetSiteNameW`(`computername` : `windows_sys`.`core`.`PCWSTR`, `sitename` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsGetSpnA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsGetSpnA`(`servicetype` : `DS_SPN_NAME_TYPE`, `serviceclass` : `windows_sys`.`core`.`PCSTR`, `servicename` : `windows_sys`.`core`.`PCSTR`, `instanceport` : UShort, `cinstancenames` : UShort, `pinstancenames` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCSTR`>?, `pinstanceports` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pcspn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `prpszspn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`PSTR`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsGetSpnW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsGetSpnW`(`servicetype` : `DS_SPN_NAME_TYPE`, `serviceclass` : `windows_sys`.`core`.`PCWSTR`, `servicename` : `windows_sys`.`core`.`PCWSTR`, `instanceport` : UShort, `cinstancenames` : UShort, `pinstancenames` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, `pinstanceports` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pcspn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `prpszspn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`PWSTR`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsInheritSecurityIdentityA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsInheritSecurityIdentityA`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `flags` : UInt, `srcprincipal` : `windows_sys`.`core`.`PCSTR`, `dstprincipal` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsInheritSecurityIdentityW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsInheritSecurityIdentityW`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `flags` : UInt, `srcprincipal` : `windows_sys`.`core`.`PCWSTR`, `dstprincipal` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dsparse.dll, ABI=system, export=DsIsMangledDnA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsIsMangledDnA`(`pszdn` : `windows_sys`.`core`.`PCSTR`, `edsmanglefor` : `DS_MANGLE_FOR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dsparse.dll, ABI=system, export=DsIsMangledDnW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsIsMangledDnW`(`pszdn` : `windows_sys`.`core`.`PCWSTR`, `edsmanglefor` : `DS_MANGLE_FOR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dsparse.dll, ABI=system, export=DsIsMangledRdnValueA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsIsMangledRdnValueA`(`pszrdn` : `windows_sys`.`core`.`PCSTR`, `crdn` : UInt, `edsmanglefordesired` : `DS_MANGLE_FOR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dsparse.dll, ABI=system, export=DsIsMangledRdnValueW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsIsMangledRdnValueW`(`pszrdn` : `windows_sys`.`core`.`PCWSTR`, `crdn` : UInt, `edsmanglefordesired` : `DS_MANGLE_FOR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsListDomainsInSiteA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsListDomainsInSiteA`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `site` : `windows_sys`.`core`.`PCSTR`, `ppdomains` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DS_NAME_RESULTA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsListDomainsInSiteW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsListDomainsInSiteW`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `site` : `windows_sys`.`core`.`PCWSTR`, `ppdomains` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DS_NAME_RESULTW`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsListInfoForServerA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsListInfoForServerA`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `server` : `windows_sys`.`core`.`PCSTR`, `ppinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DS_NAME_RESULTA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsListInfoForServerW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsListInfoForServerW`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `server` : `windows_sys`.`core`.`PCWSTR`, `ppinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DS_NAME_RESULTW`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsListRolesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsListRolesA`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `pproles` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DS_NAME_RESULTA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsListRolesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsListRolesW`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `pproles` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DS_NAME_RESULTW`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsListServersForDomainInSiteA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsListServersForDomainInSiteA`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `domain` : `windows_sys`.`core`.`PCSTR`, `site` : `windows_sys`.`core`.`PCSTR`, `ppservers` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DS_NAME_RESULTA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsListServersForDomainInSiteW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsListServersForDomainInSiteW`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `domain` : `windows_sys`.`core`.`PCWSTR`, `site` : `windows_sys`.`core`.`PCWSTR`, `ppservers` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DS_NAME_RESULTW`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsListServersInSiteA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsListServersInSiteA`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `site` : `windows_sys`.`core`.`PCSTR`, `ppservers` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DS_NAME_RESULTA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsListServersInSiteW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsListServersInSiteW`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `site` : `windows_sys`.`core`.`PCWSTR`, `ppservers` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DS_NAME_RESULTW`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsListSitesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsListSitesA`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `ppsites` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DS_NAME_RESULTA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsListSitesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsListSitesW`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `ppsites` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DS_NAME_RESULTW`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsMakePasswordCredentialsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsMakePasswordCredentialsA`(`user` : `windows_sys`.`core`.`PCSTR`, `domain` : `windows_sys`.`core`.`PCSTR`, `password` : `windows_sys`.`core`.`PCSTR`, `pauthidentity` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsMakePasswordCredentialsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsMakePasswordCredentialsW`(`user` : `windows_sys`.`core`.`PCWSTR`, `domain` : `windows_sys`.`core`.`PCWSTR`, `password` : `windows_sys`.`core`.`PCWSTR`, `pauthidentity` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dsparse.dll, ABI=system, export=DsMakeSpnA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsMakeSpnA`(`serviceclass` : `windows_sys`.`core`.`PCSTR`, `servicename` : `windows_sys`.`core`.`PCSTR`, `instancename` : `windows_sys`.`core`.`PCSTR`, `instanceport` : UShort, `referrer` : `windows_sys`.`core`.`PCSTR`, `pcspnlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pszspn` : `windows_sys`.`core`.`PSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dsparse.dll, ABI=system, export=DsMakeSpnW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsMakeSpnW`(`serviceclass` : `windows_sys`.`core`.`PCWSTR`, `servicename` : `windows_sys`.`core`.`PCWSTR`, `instancename` : `windows_sys`.`core`.`PCWSTR`, `instanceport` : UShort, `referrer` : `windows_sys`.`core`.`PCWSTR`, `pcspnlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pszspn` : `windows_sys`.`core`.`PWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsMapSchemaGuidsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsMapSchemaGuidsA`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `cguids` : UInt, `rguids` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppguidmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DS_SCHEMA_GUID_MAPA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsMapSchemaGuidsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsMapSchemaGuidsW`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `cguids` : UInt, `rguids` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppguidmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DS_SCHEMA_GUID_MAPW`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=DsMergeForestTrustInformationW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Authentication_Identity")]
public external fun `DsMergeForestTrustInformationW`(`domainname` : `windows_sys`.`core`.`PCWSTR`, `newforesttrustinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`Authentication`.`Identity`.`LSA_FOREST_TRUST_INFORMATION`>?, `oldforesttrustinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`Authentication`.`Identity`.`LSA_FOREST_TRUST_INFORMATION`>?, `mergedforesttrustinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`Authentication`.`Identity`.`LSA_FOREST_TRUST_INFORMATION`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsQuerySitesByCostA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsQuerySitesByCostA`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `pszfromsite` : `windows_sys`.`core`.`PCSTR`, `rgsztosites` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCSTR`>?, `ctosites` : UInt, `dwflags` : UInt, `prgsiteinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DS_SITE_COST_INFO`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsQuerySitesByCostW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsQuerySitesByCostW`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `pwszfromsite` : `windows_sys`.`core`.`PCWSTR`, `rgwsztosites` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, `ctosites` : UInt, `dwflags` : UInt, `prgsiteinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DS_SITE_COST_INFO`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsQuerySitesFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsQuerySitesFree`(`rgsiteinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DS_SITE_COST_INFO`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dsparse.dll, ABI=system, export=DsQuoteRdnValueA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsQuoteRdnValueA`(`cunquotedrdnvaluelength` : UInt, `psunquotedrdnvalue` : `windows_sys`.`core`.`PCSTR`, `pcquotedrdnvaluelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `psquotedrdnvalue` : `windows_sys`.`core`.`PSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dsparse.dll, ABI=system, export=DsQuoteRdnValueW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsQuoteRdnValueW`(`cunquotedrdnvaluelength` : UInt, `psunquotedrdnvalue` : `windows_sys`.`core`.`PCWSTR`, `pcquotedrdnvaluelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `psquotedrdnvalue` : `windows_sys`.`core`.`PWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsRemoveDsDomainA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsRemoveDsDomainA`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `domaindn` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsRemoveDsDomainW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsRemoveDsDomainW`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `domaindn` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsRemoveDsServerA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsRemoveDsServerA`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `serverdn` : `windows_sys`.`core`.`PCSTR`, `domaindn` : `windows_sys`.`core`.`PCSTR`, `flastdcindomain` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `fcommit` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsRemoveDsServerW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsRemoveDsServerW`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `serverdn` : `windows_sys`.`core`.`PCWSTR`, `domaindn` : `windows_sys`.`core`.`PCWSTR`, `flastdcindomain` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `fcommit` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsReplicaAddA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsReplicaAddA`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `namecontext` : `windows_sys`.`core`.`PCSTR`, `sourcedsadn` : `windows_sys`.`core`.`PCSTR`, `transportdn` : `windows_sys`.`core`.`PCSTR`, `sourcedsaaddress` : `windows_sys`.`core`.`PCSTR`, `pschedule` : /* Rust *const */ kotlinx.cinterop.CPointer<`SCHEDULE`>?, `options` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsReplicaAddW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsReplicaAddW`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `namecontext` : `windows_sys`.`core`.`PCWSTR`, `sourcedsadn` : `windows_sys`.`core`.`PCWSTR`, `transportdn` : `windows_sys`.`core`.`PCWSTR`, `sourcedsaaddress` : `windows_sys`.`core`.`PCWSTR`, `pschedule` : /* Rust *const */ kotlinx.cinterop.CPointer<`SCHEDULE`>?, `options` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsReplicaConsistencyCheck; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsReplicaConsistencyCheck`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `taskid` : `DS_KCC_TASKID`, `dwflags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsReplicaDelA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsReplicaDelA`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `namecontext` : `windows_sys`.`core`.`PCSTR`, `dsasrc` : `windows_sys`.`core`.`PCSTR`, `options` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsReplicaDelW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsReplicaDelW`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `namecontext` : `windows_sys`.`core`.`PCWSTR`, `dsasrc` : `windows_sys`.`core`.`PCWSTR`, `options` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsReplicaFreeInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsReplicaFreeInfo`(`infotype` : `DS_REPL_INFO_TYPE`, `pinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsReplicaGetInfo2W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsReplicaGetInfo2W`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `infotype` : `DS_REPL_INFO_TYPE`, `pszobject` : `windows_sys`.`core`.`PCWSTR`, `puuidforsourcedsaobjguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pszattributename` : `windows_sys`.`core`.`PCWSTR`, `pszvalue` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt, `dwenumerationcontext` : UInt, `ppinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsReplicaGetInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsReplicaGetInfoW`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `infotype` : `DS_REPL_INFO_TYPE`, `pszobject` : `windows_sys`.`core`.`PCWSTR`, `puuidforsourcedsaobjguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsReplicaModifyA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsReplicaModifyA`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `namecontext` : `windows_sys`.`core`.`PCSTR`, `puuidsourcedsa` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `transportdn` : `windows_sys`.`core`.`PCSTR`, `sourcedsaaddress` : `windows_sys`.`core`.`PCSTR`, `pschedule` : /* Rust *const */ kotlinx.cinterop.CPointer<`SCHEDULE`>?, `replicaflags` : UInt, `modifyfields` : UInt, `options` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsReplicaModifyW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsReplicaModifyW`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `namecontext` : `windows_sys`.`core`.`PCWSTR`, `puuidsourcedsa` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `transportdn` : `windows_sys`.`core`.`PCWSTR`, `sourcedsaaddress` : `windows_sys`.`core`.`PCWSTR`, `pschedule` : /* Rust *const */ kotlinx.cinterop.CPointer<`SCHEDULE`>?, `replicaflags` : UInt, `modifyfields` : UInt, `options` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsReplicaSyncA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsReplicaSyncA`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `namecontext` : `windows_sys`.`core`.`PCSTR`, `puuiddsasrc` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `options` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsReplicaSyncAllA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsReplicaSyncAllA`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `psznamecontext` : `windows_sys`.`core`.`PCSTR`, `ulflags` : UInt, `pfncallback` : Long, `pcallbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `perrors` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`DS_REPSYNCALL_ERRINFOA`>>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsReplicaSyncAllW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsReplicaSyncAllW`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `psznamecontext` : `windows_sys`.`core`.`PCWSTR`, `ulflags` : UInt, `pfncallback` : Long, `pcallbackdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `perrors` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`DS_REPSYNCALL_ERRINFOW`>>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsReplicaSyncW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsReplicaSyncW`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `namecontext` : `windows_sys`.`core`.`PCWSTR`, `puuiddsasrc` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `options` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsReplicaUpdateRefsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsReplicaUpdateRefsA`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `namecontext` : `windows_sys`.`core`.`PCSTR`, `dsadest` : `windows_sys`.`core`.`PCSTR`, `puuiddsadest` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `options` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsReplicaUpdateRefsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsReplicaUpdateRefsW`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `namecontext` : `windows_sys`.`core`.`PCWSTR`, `dsadest` : `windows_sys`.`core`.`PCWSTR`, `puuiddsadest` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `options` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsReplicaVerifyObjectsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsReplicaVerifyObjectsA`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `namecontext` : `windows_sys`.`core`.`PCSTR`, `puuiddsasrc` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `uloptions` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsReplicaVerifyObjectsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsReplicaVerifyObjectsW`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `namecontext` : `windows_sys`.`core`.`PCWSTR`, `puuiddsasrc` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `uloptions` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=DsRoleFreeMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsRoleFreeMemory`(`buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=DsRoleGetPrimaryDomainInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsRoleGetPrimaryDomainInformation`(`lpserver` : `windows_sys`.`core`.`PCWSTR`, `infolevel` : `DSROLE_PRIMARY_DOMAIN_INFO_LEVEL`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsServerRegisterSpnA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsServerRegisterSpnA`(`operation` : `DS_SPN_WRITE_OP`, `serviceclass` : `windows_sys`.`core`.`PCSTR`, `userobjectdn` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsServerRegisterSpnW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsServerRegisterSpnW`(`operation` : `DS_SPN_WRITE_OP`, `serviceclass` : `windows_sys`.`core`.`PCWSTR`, `userobjectdn` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsUnBindA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsUnBindA`(`phds` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsUnBindW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsUnBindW`(`phds` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dsparse.dll, ABI=system, export=DsUnquoteRdnValueA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsUnquoteRdnValueA`(`cquotedrdnvaluelength` : UInt, `psquotedrdnvalue` : `windows_sys`.`core`.`PCSTR`, `pcunquotedrdnvaluelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `psunquotedrdnvalue` : `windows_sys`.`core`.`PSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dsparse.dll, ABI=system, export=DsUnquoteRdnValueW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsUnquoteRdnValueW`(`cquotedrdnvaluelength` : UInt, `psquotedrdnvalue` : `windows_sys`.`core`.`PCWSTR`, `pcunquotedrdnvaluelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `psunquotedrdnvalue` : `windows_sys`.`core`.`PWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=DsValidateSubnetNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsValidateSubnetNameA`(`subnetname` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=DsValidateSubnetNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsValidateSubnetNameW`(`subnetname` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsWriteAccountSpnA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsWriteAccountSpnA`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `operation` : `DS_SPN_WRITE_OP`, `pszaccount` : `windows_sys`.`core`.`PCSTR`, `cspn` : UInt, `rpszspn` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdsapi.dll, ABI=system, export=DsWriteAccountSpnW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DsWriteAccountSpnW`(`hds` : `super`.`super`.`Foundation`.`HANDLE`, `operation` : `DS_SPN_WRITE_OP`, `pszaccount` : `windows_sys`.`core`.`PCWSTR`, `cspn` : UInt, `rpszspn` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=activeds.dll, ABI=system, export=FreeADsMem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FreeADsMem`(`pmem` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=activeds.dll, ABI=system, export=FreeADsStr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FreeADsStr`(`pstr` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=activeds.dll, ABI=system, export=PropVariantToAdsType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
public external fun `PropVariantToAdsType`(`pvariant` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Variant`.`VARIANT`>?, `dwnumvariant` : UInt, `ppadsvalues` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`ADSVALUE`>>?, `pdwnumvalues` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=activeds.dll, ABI=system, export=ReallocADsMem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReallocADsMem`(`poldmem` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbold` : UInt, `cbnew` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=activeds.dll, ABI=system, export=ReallocADsStr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReallocADsStr`(`ppstr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `pstr` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=activeds.dll, ABI=system, export=SecurityDescriptorToBinarySD; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security", feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
public external fun `SecurityDescriptorToBinarySD`(`vvarsecdes` : `super`.`super`.`System`.`Variant`.`VARIANT`, `ppsecuritydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`>?, `pdwsdlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pszservername` : `windows_sys`.`core`.`PCWSTR`, `username` : `windows_sys`.`core`.`PCWSTR`, `password` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt) : `windows_sys`.`core`.`HRESULT`
public const val `ACTRL_DS_CONTROL_ACCESS`: UInt = 256u;
public const val `ACTRL_DS_CREATE_CHILD`: UInt = 1u;
public const val `ACTRL_DS_DELETE_CHILD`: UInt = 2u;
public const val `ACTRL_DS_DELETE_TREE`: UInt = 64u;
public const val `ACTRL_DS_LIST`: UInt = 4u;
public const val `ACTRL_DS_LIST_OBJECT`: UInt = 128u;
public const val `ACTRL_DS_OPEN`: UInt = 0u;
public const val `ACTRL_DS_READ_PROP`: UInt = 16u;
public const val `ACTRL_DS_SELF`: UInt = 8u;
public const val `ACTRL_DS_WRITE_PROP`: UInt = 32u;
public const val `ADAM_REPL_AUTHENTICATION_MODE_MUTUAL_AUTH_REQUIRED`: UInt = 2u;
public const val `ADAM_REPL_AUTHENTICATION_MODE_NEGOTIATE`: UInt = 1u;
public const val `ADAM_REPL_AUTHENTICATION_MODE_NEGOTIATE_PASS_THROUGH`: UInt = 0u;
// UNSUPPORTED Rust 195:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ADAM_SCP_FSMO_NAMING_STRING: windows_sys::core::PCSTR = windows_sys::core::s!("naming");

// UNSUPPORTED Rust 196:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ADAM_SCP_FSMO_NAMING_STRING_W: windows_sys::core::PCWSTR = windows_sys::core::w!("naming");

// UNSUPPORTED Rust 197:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ADAM_SCP_FSMO_SCHEMA_STRING: windows_sys::core::PCSTR = windows_sys::core::s!("schema");

// UNSUPPORTED Rust 198:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ADAM_SCP_FSMO_SCHEMA_STRING_W: windows_sys::core::PCWSTR = windows_sys::core::w!("schema");

// UNSUPPORTED Rust 199:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ADAM_SCP_FSMO_STRING: windows_sys::core::PCSTR = windows_sys::core::s!("fsmo:");

// UNSUPPORTED Rust 200:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ADAM_SCP_FSMO_STRING_W: windows_sys::core::PCWSTR = windows_sys::core::w!("fsmo:");

// UNSUPPORTED Rust 201:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ADAM_SCP_INSTANCE_NAME_STRING: windows_sys::core::PCSTR = windows_sys::core::s!("instance:");

// UNSUPPORTED Rust 202:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ADAM_SCP_INSTANCE_NAME_STRING_W: windows_sys::core::PCWSTR = windows_sys::core::w!("instance:");

// UNSUPPORTED Rust 203:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ADAM_SCP_PARTITION_STRING: windows_sys::core::PCSTR = windows_sys::core::s!("partition:");

// UNSUPPORTED Rust 204:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ADAM_SCP_PARTITION_STRING_W: windows_sys::core::PCWSTR = windows_sys::core::w!("partition:");

// UNSUPPORTED Rust 205:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ADAM_SCP_SITE_NAME_STRING: windows_sys::core::PCSTR = windows_sys::core::s!("site:");

// UNSUPPORTED Rust 206:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ADAM_SCP_SITE_NAME_STRING_W: windows_sys::core::PCWSTR = windows_sys::core::w!("site:");

public const val `ADSIPROP_ADSIFLAG`: `ADS_PREFERENCES_ENUM` = 12;
public const val `ADSIPROP_ASYNCHRONOUS`: `ADS_PREFERENCES_ENUM` = 0;
public const val `ADSIPROP_ATTRIBTYPES_ONLY`: `ADS_PREFERENCES_ENUM` = 4;
public const val `ADSIPROP_CACHE_RESULTS`: `ADS_PREFERENCES_ENUM` = 11;
public const val `ADSIPROP_CHASE_REFERRALS`: `ADS_PREFERENCES_ENUM` = 9;
public const val `ADSIPROP_DEREF_ALIASES`: `ADS_PREFERENCES_ENUM` = 1;
public const val `ADSIPROP_PAGED_TIME_LIMIT`: `ADS_PREFERENCES_ENUM` = 8;
public const val `ADSIPROP_PAGESIZE`: `ADS_PREFERENCES_ENUM` = 7;
public const val `ADSIPROP_SEARCH_SCOPE`: `ADS_PREFERENCES_ENUM` = 5;
public const val `ADSIPROP_SIZE_LIMIT`: `ADS_PREFERENCES_ENUM` = 2;
public const val `ADSIPROP_SORT_ON`: `ADS_PREFERENCES_ENUM` = 10;
public const val `ADSIPROP_TIMEOUT`: `ADS_PREFERENCES_ENUM` = 6;
public const val `ADSIPROP_TIME_LIMIT`: `ADS_PREFERENCES_ENUM` = 3;
public typealias `ADSI_DIALECT_ENUM` = Int;
public const val `ADSI_DIALECT_LDAP`: `ADSI_DIALECT_ENUM` = 0;
public const val `ADSI_DIALECT_SQL`: `ADSI_DIALECT_ENUM` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ADSPROPERROR` (
    public var `hwndPage`: `super`.`super`.`Foundation`.`HWND`,
    public var `pszPageTitle`: `windows_sys`.`core`.`PWSTR`,
    public var `pszObjPath`: `windows_sys`.`core`.`PWSTR`,
    public var `pszObjClass`: `windows_sys`.`core`.`PWSTR`,
    public var `hr`: `windows_sys`.`core`.`HRESULT`,
    public var `pszError`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 233:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ADSPROPERROR {
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
public class `ADSPROPINITPARAMS` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `hr`: `windows_sys`.`core`.`HRESULT`,
    public var `pDsObj`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pwzCN`: `windows_sys`.`core`.`PWSTR`,
    public var `pWritableAttrs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ADS_ATTR_INFO`>?,
)
// UNSUPPORTED Rust 248:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ADSPROPINITPARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ADSTYPE` = Int;
public const val `ADSTYPE_BACKLINK`: `ADSTYPE` = 18;
public const val `ADSTYPE_BOOLEAN`: `ADSTYPE` = 6;
public const val `ADSTYPE_CASEIGNORE_LIST`: `ADSTYPE` = 13;
public const val `ADSTYPE_CASE_EXACT_STRING`: `ADSTYPE` = 2;
public const val `ADSTYPE_CASE_IGNORE_STRING`: `ADSTYPE` = 3;
public const val `ADSTYPE_DN_STRING`: `ADSTYPE` = 1;
public const val `ADSTYPE_DN_WITH_BINARY`: `ADSTYPE` = 27;
public const val `ADSTYPE_DN_WITH_STRING`: `ADSTYPE` = 28;
public const val `ADSTYPE_EMAIL`: `ADSTYPE` = 24;
public const val `ADSTYPE_FAXNUMBER`: `ADSTYPE` = 23;
public const val `ADSTYPE_HOLD`: `ADSTYPE` = 20;
public const val `ADSTYPE_INTEGER`: `ADSTYPE` = 7;
public const val `ADSTYPE_INVALID`: `ADSTYPE` = 0;
public const val `ADSTYPE_LARGE_INTEGER`: `ADSTYPE` = 10;
public const val `ADSTYPE_NETADDRESS`: `ADSTYPE` = 21;
public const val `ADSTYPE_NT_SECURITY_DESCRIPTOR`: `ADSTYPE` = 25;
public const val `ADSTYPE_NUMERIC_STRING`: `ADSTYPE` = 5;
public const val `ADSTYPE_OBJECT_CLASS`: `ADSTYPE` = 12;
public const val `ADSTYPE_OCTET_LIST`: `ADSTYPE` = 14;
public const val `ADSTYPE_OCTET_STRING`: `ADSTYPE` = 8;
public const val `ADSTYPE_PATH`: `ADSTYPE` = 15;
public const val `ADSTYPE_POSTALADDRESS`: `ADSTYPE` = 16;
public const val `ADSTYPE_PRINTABLE_STRING`: `ADSTYPE` = 4;
public const val `ADSTYPE_PROV_SPECIFIC`: `ADSTYPE` = 11;
public const val `ADSTYPE_REPLICAPOINTER`: `ADSTYPE` = 22;
public const val `ADSTYPE_TIMESTAMP`: `ADSTYPE` = 17;
public const val `ADSTYPE_TYPEDNAME`: `ADSTYPE` = 19;
public const val `ADSTYPE_UNKNOWN`: `ADSTYPE` = 26;
public const val `ADSTYPE_UTC_TIME`: `ADSTYPE` = 9;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ADSVALUE` (
    public var `dwType`: `ADSTYPE`,
    public var `Anonymous`: `ADSVALUE_0`,
)
// UNSUPPORTED Rust 289:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ADSVALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 294:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union ADSVALUE_0 {
//     pub DNString: *mut u16,
//     pub CaseExactString: *mut u16,
//     pub CaseIgnoreString: *mut u16,
//     pub PrintableString: *mut u16,
//     pub NumericString: *mut u16,
//     pub Boolean: u32,
//     pub Integer: u32,
//     pub OctetString: ADS_OCTET_STRING,
//     pub UTCTime: super::super::Foundation::SYSTEMTIME,
//     pub LargeInteger: i64,
//     pub ClassName: *mut u16,
//     pub ProviderSpecific: ADS_PROV_SPECIFIC,
//     pub pCaseIgnoreList: *mut ADS_CASEIGNORE_LIST,
//     pub pOctetList: *mut ADS_OCTET_LIST,
//     pub pPath: *mut ADS_PATH,
//     pub pPostalAddress: *mut ADS_POSTALADDRESS,
//     pub Timestamp: ADS_TIMESTAMP,
//     pub BackLink: ADS_BACKLINK,
//     pub pTypedName: *mut ADS_TYPEDNAME,
//     pub Hold: ADS_HOLD,
//     pub pNetAddress: *mut ADS_NETADDRESS,
//     pub pReplicaPointer: *mut ADS_REPLICAPOINTER,
//     pub pFaxNumber: *mut ADS_FAXNUMBER,
//     pub Email: ADS_EMAIL,
//     pub SecurityDescriptor: ADS_NT_SECURITY_DESCRIPTOR,
//     pub pDNWithBinary: *mut ADS_DN_WITH_BINARY,
//     pub pDNWithString: *mut ADS_DN_WITH_STRING,
// }

// UNSUPPORTED Rust 325:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ADSVALUE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ADS_ACEFLAG_ENUM` = Int;
public const val `ADS_ACEFLAG_FAILED_ACCESS`: `ADS_ACEFLAG_ENUM` = 128;
public const val `ADS_ACEFLAG_INHERITED_ACE`: `ADS_ACEFLAG_ENUM` = 16;
public const val `ADS_ACEFLAG_INHERIT_ACE`: `ADS_ACEFLAG_ENUM` = 2;
public const val `ADS_ACEFLAG_INHERIT_ONLY_ACE`: `ADS_ACEFLAG_ENUM` = 8;
public const val `ADS_ACEFLAG_NO_PROPAGATE_INHERIT_ACE`: `ADS_ACEFLAG_ENUM` = 4;
public const val `ADS_ACEFLAG_SUCCESSFUL_ACCESS`: `ADS_ACEFLAG_ENUM` = 64;
public const val `ADS_ACEFLAG_VALID_INHERIT_FLAGS`: `ADS_ACEFLAG_ENUM` = 31;
public const val `ADS_ACETYPE_ACCESS_ALLOWED`: `ADS_ACETYPE_ENUM` = 0;
public const val `ADS_ACETYPE_ACCESS_ALLOWED_CALLBACK`: `ADS_ACETYPE_ENUM` = 9;
public const val `ADS_ACETYPE_ACCESS_ALLOWED_CALLBACK_OBJECT`: `ADS_ACETYPE_ENUM` = 11;
public const val `ADS_ACETYPE_ACCESS_ALLOWED_OBJECT`: `ADS_ACETYPE_ENUM` = 5;
public const val `ADS_ACETYPE_ACCESS_DENIED`: `ADS_ACETYPE_ENUM` = 1;
public const val `ADS_ACETYPE_ACCESS_DENIED_CALLBACK`: `ADS_ACETYPE_ENUM` = 10;
public const val `ADS_ACETYPE_ACCESS_DENIED_CALLBACK_OBJECT`: `ADS_ACETYPE_ENUM` = 12;
public const val `ADS_ACETYPE_ACCESS_DENIED_OBJECT`: `ADS_ACETYPE_ENUM` = 6;
public typealias `ADS_ACETYPE_ENUM` = Int;
public const val `ADS_ACETYPE_SYSTEM_ALARM_CALLBACK`: `ADS_ACETYPE_ENUM` = 14;
public const val `ADS_ACETYPE_SYSTEM_ALARM_CALLBACK_OBJECT`: `ADS_ACETYPE_ENUM` = 16;
public const val `ADS_ACETYPE_SYSTEM_ALARM_OBJECT`: `ADS_ACETYPE_ENUM` = 8;
public const val `ADS_ACETYPE_SYSTEM_AUDIT`: `ADS_ACETYPE_ENUM` = 2;
public const val `ADS_ACETYPE_SYSTEM_AUDIT_CALLBACK`: `ADS_ACETYPE_ENUM` = 13;
public const val `ADS_ACETYPE_SYSTEM_AUDIT_CALLBACK_OBJECT`: `ADS_ACETYPE_ENUM` = 15;
public const val `ADS_ACETYPE_SYSTEM_AUDIT_OBJECT`: `ADS_ACETYPE_ENUM` = 7;
public const val `ADS_ATTR_APPEND`: UInt = 3u;
public const val `ADS_ATTR_CLEAR`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ADS_ATTR_DEF` (
    public var `pszAttrName`: `windows_sys`.`core`.`PWSTR`,
    public var `dwADsType`: `ADSTYPE`,
    public var `dwMinRange`: UInt,
    public var `dwMaxRange`: UInt,
    public var `fMultiValued`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 365:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ADS_ATTR_DEF {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ADS_ATTR_DELETE`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ADS_ATTR_INFO` (
    public var `pszAttrName`: `windows_sys`.`core`.`PWSTR`,
    public var `dwControlCode`: UInt,
    public var `dwADsType`: `ADSTYPE`,
    public var `pADsValues`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ADSVALUE`>?,
    public var `dwNumValues`: UInt,
)
// UNSUPPORTED Rust 380:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ADS_ATTR_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ADS_ATTR_UPDATE`: UInt = 2u;
public typealias `ADS_AUTHENTICATION_ENUM` = UInt;
public const val `ADS_AUTH_RESERVED`: `ADS_AUTHENTICATION_ENUM` = 2147483648u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ADS_BACKLINK` (
    public var `RemoteID`: UInt,
    public var `ObjectName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 394:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ADS_BACKLINK {
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
public class `ADS_CASEIGNORE_LIST` (
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ADS_CASEIGNORE_LIST`>?,
    public var `String`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 405:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ADS_CASEIGNORE_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ADS_CHASE_REFERRALS_ALWAYS`: `ADS_CHASE_REFERRALS_ENUM` = 96;
public typealias `ADS_CHASE_REFERRALS_ENUM` = Int;
public const val `ADS_CHASE_REFERRALS_EXTERNAL`: `ADS_CHASE_REFERRALS_ENUM` = 64;
public const val `ADS_CHASE_REFERRALS_NEVER`: `ADS_CHASE_REFERRALS_ENUM` = 0;
public const val `ADS_CHASE_REFERRALS_SUBORDINATE`: `ADS_CHASE_REFERRALS_ENUM` = 32;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ADS_CLASS_DEF` (
    public var `pszClassName`: `windows_sys`.`core`.`PWSTR`,
    public var `dwMandatoryAttrs`: UInt,
    public var `ppszMandatoryAttrs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?,
    public var `optionalAttrs`: UInt,
    public var `ppszOptionalAttrs`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`PWSTR`>>?,
    public var `dwNamingAttrs`: UInt,
    public var `ppszNamingAttrs`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`PWSTR`>>?,
    public var `dwSuperClasses`: UInt,
    public var `ppszSuperClasses`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`PWSTR`>>?,
    public var `fIsContainer`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 429:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ADS_CLASS_DEF {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ADS_DEREFENUM` = Int;
public const val `ADS_DEREF_ALWAYS`: `ADS_DEREFENUM` = 3;
public const val `ADS_DEREF_FINDING`: `ADS_DEREFENUM` = 2;
public const val `ADS_DEREF_NEVER`: `ADS_DEREFENUM` = 0;
public const val `ADS_DEREF_SEARCHING`: `ADS_DEREFENUM` = 1;
public typealias `ADS_DISPLAY_ENUM` = Int;
public const val `ADS_DISPLAY_FULL`: `ADS_DISPLAY_ENUM` = 1;
public const val `ADS_DISPLAY_VALUE_ONLY`: `ADS_DISPLAY_ENUM` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ADS_DN_WITH_BINARY` (
    public var `dwLength`: UInt,
    public var `lpBinaryValue`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `pszDNString`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 449:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ADS_DN_WITH_BINARY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ADS_DN_WITH_STRING` (
    public var `pszStringValue`: `windows_sys`.`core`.`PWSTR`,
    public var `pszDNString`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 460:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ADS_DN_WITH_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ADS_EMAIL` (
    public var `Address`: `windows_sys`.`core`.`PWSTR`,
    public var `Type`: UInt,
)
// UNSUPPORTED Rust 471:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ADS_EMAIL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ADS_ESCAPEDMODE_DEFAULT`: `ADS_ESCAPE_MODE_ENUM` = 1;
public const val `ADS_ESCAPEDMODE_OFF`: `ADS_ESCAPE_MODE_ENUM` = 3;
public const val `ADS_ESCAPEDMODE_OFF_EX`: `ADS_ESCAPE_MODE_ENUM` = 4;
public const val `ADS_ESCAPEDMODE_ON`: `ADS_ESCAPE_MODE_ENUM` = 2;
public typealias `ADS_ESCAPE_MODE_ENUM` = Int;
public const val `ADS_EXT_INITCREDENTIALS`: UInt = 1u;
public const val `ADS_EXT_INITIALIZE_COMPLETE`: UInt = 2u;
public const val `ADS_EXT_MAXEXTDISPID`: UInt = 16777215u;
public const val `ADS_EXT_MINEXTDISPID`: UInt = 1u;
public const val `ADS_FAST_BIND`: `ADS_AUTHENTICATION_ENUM` = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ADS_FAXNUMBER` (
    public var `TelephoneNumber`: `windows_sys`.`core`.`PWSTR`,
    public var `NumberOfBits`: UInt,
    public var `Parameters`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 493:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ADS_FAXNUMBER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ADS_FLAGTYPE_ENUM` = Int;
public const val `ADS_FLAG_INHERITED_OBJECT_TYPE_PRESENT`: `ADS_FLAGTYPE_ENUM` = 2;
public const val `ADS_FLAG_OBJECT_TYPE_PRESENT`: `ADS_FLAGTYPE_ENUM` = 1;
public typealias `ADS_FORMAT_ENUM` = Int;
public const val `ADS_FORMAT_LEAF`: `ADS_FORMAT_ENUM` = 11;
public const val `ADS_FORMAT_PROVIDER`: `ADS_FORMAT_ENUM` = 10;
public const val `ADS_FORMAT_SERVER`: `ADS_FORMAT_ENUM` = 9;
public const val `ADS_FORMAT_WINDOWS`: `ADS_FORMAT_ENUM` = 1;
public const val `ADS_FORMAT_WINDOWS_DN`: `ADS_FORMAT_ENUM` = 3;
public const val `ADS_FORMAT_WINDOWS_NO_SERVER`: `ADS_FORMAT_ENUM` = 2;
public const val `ADS_FORMAT_WINDOWS_PARENT`: `ADS_FORMAT_ENUM` = 4;
public const val `ADS_FORMAT_X500`: `ADS_FORMAT_ENUM` = 5;
public const val `ADS_FORMAT_X500_DN`: `ADS_FORMAT_ENUM` = 7;
public const val `ADS_FORMAT_X500_NO_SERVER`: `ADS_FORMAT_ENUM` = 6;
public const val `ADS_FORMAT_X500_PARENT`: `ADS_FORMAT_ENUM` = 8;
public const val `ADS_GROUP_TYPE_DOMAIN_LOCAL_GROUP`: `ADS_GROUP_TYPE_ENUM` = 4;
public typealias `ADS_GROUP_TYPE_ENUM` = Int;
public const val `ADS_GROUP_TYPE_GLOBAL_GROUP`: `ADS_GROUP_TYPE_ENUM` = 2;
public const val `ADS_GROUP_TYPE_LOCAL_GROUP`: `ADS_GROUP_TYPE_ENUM` = 4;
public const val `ADS_GROUP_TYPE_SECURITY_ENABLED`: `ADS_GROUP_TYPE_ENUM` = -2147483648;
public const val `ADS_GROUP_TYPE_UNIVERSAL_GROUP`: `ADS_GROUP_TYPE_ENUM` = 8;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ADS_HOLD` (
    public var `ObjectName`: `windows_sys`.`core`.`PWSTR`,
    public var `Amount`: UInt,
)
// UNSUPPORTED Rust 525:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ADS_HOLD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ADS_NAME_INITTYPE_DOMAIN`: `ADS_NAME_INITTYPE_ENUM` = 1;
public typealias `ADS_NAME_INITTYPE_ENUM` = Int;
public const val `ADS_NAME_INITTYPE_GC`: `ADS_NAME_INITTYPE_ENUM` = 3;
public const val `ADS_NAME_INITTYPE_SERVER`: `ADS_NAME_INITTYPE_ENUM` = 2;
public const val `ADS_NAME_TYPE_1779`: `ADS_NAME_TYPE_ENUM` = 1;
public const val `ADS_NAME_TYPE_CANONICAL`: `ADS_NAME_TYPE_ENUM` = 2;
public const val `ADS_NAME_TYPE_CANONICAL_EX`: `ADS_NAME_TYPE_ENUM` = 10;
public const val `ADS_NAME_TYPE_DISPLAY`: `ADS_NAME_TYPE_ENUM` = 4;
public const val `ADS_NAME_TYPE_DOMAIN_SIMPLE`: `ADS_NAME_TYPE_ENUM` = 5;
public const val `ADS_NAME_TYPE_ENTERPRISE_SIMPLE`: `ADS_NAME_TYPE_ENUM` = 6;
public typealias `ADS_NAME_TYPE_ENUM` = Int;
public const val `ADS_NAME_TYPE_GUID`: `ADS_NAME_TYPE_ENUM` = 7;
public const val `ADS_NAME_TYPE_NT4`: `ADS_NAME_TYPE_ENUM` = 3;
public const val `ADS_NAME_TYPE_SERVICE_PRINCIPAL_NAME`: `ADS_NAME_TYPE_ENUM` = 11;
public const val `ADS_NAME_TYPE_SID_OR_SID_HISTORY_NAME`: `ADS_NAME_TYPE_ENUM` = 12;
public const val `ADS_NAME_TYPE_UNKNOWN`: `ADS_NAME_TYPE_ENUM` = 8;
public const val `ADS_NAME_TYPE_USER_PRINCIPAL_NAME`: `ADS_NAME_TYPE_ENUM` = 9;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ADS_NETADDRESS` (
    public var `AddressType`: UInt,
    public var `AddressLength`: UInt,
    public var `Address`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 554:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ADS_NETADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ADS_NO_AUTHENTICATION`: `ADS_AUTHENTICATION_ENUM` = 16u;
public const val `ADS_NO_REFERRAL_CHASING`: `ADS_AUTHENTICATION_ENUM` = 1024u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ADS_NT_SECURITY_DESCRIPTOR` (
    public var `dwLength`: UInt,
    public var `lpValue`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 567:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ADS_NT_SECURITY_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ADS_OBJECT_INFO` (
    public var `pszRDN`: `windows_sys`.`core`.`PWSTR`,
    public var `pszObjectDN`: `windows_sys`.`core`.`PWSTR`,
    public var `pszParentDN`: `windows_sys`.`core`.`PWSTR`,
    public var `pszSchemaDN`: `windows_sys`.`core`.`PWSTR`,
    public var `pszClassName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 581:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ADS_OBJECT_INFO {
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
public class `ADS_OCTET_LIST` (
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ADS_OCTET_LIST`>?,
    public var `Length`: UInt,
    public var `Data`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 593:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ADS_OCTET_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ADS_OCTET_STRING` (
    public var `dwLength`: UInt,
    public var `lpValue`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 604:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ADS_OCTET_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ADS_OPTION_ACCUMULATIVE_MODIFICATION`: `ADS_OPTION_ENUM` = 8;
public typealias `ADS_OPTION_ENUM` = Int;
public const val `ADS_OPTION_MUTUAL_AUTH_STATUS`: `ADS_OPTION_ENUM` = 4;
public const val `ADS_OPTION_PAGE_SIZE`: `ADS_OPTION_ENUM` = 2;
public const val `ADS_OPTION_PASSWORD_METHOD`: `ADS_OPTION_ENUM` = 7;
public const val `ADS_OPTION_PASSWORD_PORTNUMBER`: `ADS_OPTION_ENUM` = 6;
public const val `ADS_OPTION_QUOTA`: `ADS_OPTION_ENUM` = 5;
public const val `ADS_OPTION_REFERRALS`: `ADS_OPTION_ENUM` = 1;
public const val `ADS_OPTION_SECURITY_MASK`: `ADS_OPTION_ENUM` = 3;
public const val `ADS_OPTION_SERVERNAME`: `ADS_OPTION_ENUM` = 0;
public const val `ADS_OPTION_SKIP_SID_LOOKUP`: `ADS_OPTION_ENUM` = 9;
public const val `ADS_PASSWORD_ENCODE_CLEAR`: `ADS_PASSWORD_ENCODING_ENUM` = 1;
public const val `ADS_PASSWORD_ENCODE_REQUIRE_SSL`: `ADS_PASSWORD_ENCODING_ENUM` = 0;
public typealias `ADS_PASSWORD_ENCODING_ENUM` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ADS_PATH` (
    public var `Type`: UInt,
    public var `VolumeName`: `windows_sys`.`core`.`PWSTR`,
    public var `Path`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 630:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ADS_PATH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ADS_PATHTYPE_ENUM` = Int;
public const val `ADS_PATH_FILE`: `ADS_PATHTYPE_ENUM` = 1;
public const val `ADS_PATH_FILESHARE`: `ADS_PATHTYPE_ENUM` = 2;
public const val `ADS_PATH_REGISTRY`: `ADS_PATHTYPE_ENUM` = 3;
// UNSUPPORTED Rust 639:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADS_POSTALADDRESS {
//     pub PostalAddress: [windows_sys::core::PWSTR; 6],
// }

// UNSUPPORTED Rust 644:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ADS_POSTALADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ADS_PREFERENCES_ENUM` = Int;
public const val `ADS_PROMPT_CREDENTIALS`: `ADS_AUTHENTICATION_ENUM` = 8u;
public const val `ADS_PROPERTY_APPEND`: `ADS_PROPERTY_OPERATION_ENUM` = 3;
public const val `ADS_PROPERTY_CLEAR`: `ADS_PROPERTY_OPERATION_ENUM` = 1;
public const val `ADS_PROPERTY_DELETE`: `ADS_PROPERTY_OPERATION_ENUM` = 4;
public typealias `ADS_PROPERTY_OPERATION_ENUM` = Int;
public const val `ADS_PROPERTY_UPDATE`: `ADS_PROPERTY_OPERATION_ENUM` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ADS_PROV_SPECIFIC` (
    public var `dwLength`: UInt,
    public var `lpValue`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 662:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ADS_PROV_SPECIFIC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ADS_READONLY_SERVER`: `ADS_AUTHENTICATION_ENUM` = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ADS_REPLICAPOINTER` (
    public var `ServerName`: `windows_sys`.`core`.`PWSTR`,
    public var `ReplicaType`: UInt,
    public var `ReplicaNumber`: UInt,
    public var `Count`: UInt,
    public var `ReplicaAddressHints`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ADS_NETADDRESS`>?,
)
// UNSUPPORTED Rust 677:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ADS_REPLICAPOINTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ADS_RIGHTS_ENUM` = Int;
public const val `ADS_RIGHT_ACCESS_SYSTEM_SECURITY`: `ADS_RIGHTS_ENUM` = 16777216;
public const val `ADS_RIGHT_ACTRL_DS_LIST`: `ADS_RIGHTS_ENUM` = 4;
public const val `ADS_RIGHT_DELETE`: `ADS_RIGHTS_ENUM` = 65536;
public const val `ADS_RIGHT_DS_CONTROL_ACCESS`: `ADS_RIGHTS_ENUM` = 256;
public const val `ADS_RIGHT_DS_CREATE_CHILD`: `ADS_RIGHTS_ENUM` = 1;
public const val `ADS_RIGHT_DS_DELETE_CHILD`: `ADS_RIGHTS_ENUM` = 2;
public const val `ADS_RIGHT_DS_DELETE_TREE`: `ADS_RIGHTS_ENUM` = 64;
public const val `ADS_RIGHT_DS_LIST_OBJECT`: `ADS_RIGHTS_ENUM` = 128;
public const val `ADS_RIGHT_DS_READ_PROP`: `ADS_RIGHTS_ENUM` = 16;
public const val `ADS_RIGHT_DS_SELF`: `ADS_RIGHTS_ENUM` = 8;
public const val `ADS_RIGHT_DS_WRITE_PROP`: `ADS_RIGHTS_ENUM` = 32;
public const val `ADS_RIGHT_GENERIC_ALL`: `ADS_RIGHTS_ENUM` = 268435456;
public const val `ADS_RIGHT_GENERIC_EXECUTE`: `ADS_RIGHTS_ENUM` = 536870912;
public const val `ADS_RIGHT_GENERIC_READ`: `ADS_RIGHTS_ENUM` = -2147483648;
public const val `ADS_RIGHT_GENERIC_WRITE`: `ADS_RIGHTS_ENUM` = 1073741824;
public const val `ADS_RIGHT_READ_CONTROL`: `ADS_RIGHTS_ENUM` = 131072;
public const val `ADS_RIGHT_SYNCHRONIZE`: `ADS_RIGHTS_ENUM` = 1048576;
public const val `ADS_RIGHT_WRITE_DAC`: `ADS_RIGHTS_ENUM` = 262144;
public const val `ADS_RIGHT_WRITE_OWNER`: `ADS_RIGHTS_ENUM` = 524288;
public typealias `ADS_SCOPEENUM` = Int;
public const val `ADS_SCOPE_BASE`: `ADS_SCOPEENUM` = 0;
public const val `ADS_SCOPE_ONELEVEL`: `ADS_SCOPEENUM` = 1;
public const val `ADS_SCOPE_SUBTREE`: `ADS_SCOPEENUM` = 2;
public typealias `ADS_SD_CONTROL_ENUM` = Int;
public const val `ADS_SD_CONTROL_SE_DACL_AUTO_INHERITED`: `ADS_SD_CONTROL_ENUM` = 1024;
public const val `ADS_SD_CONTROL_SE_DACL_AUTO_INHERIT_REQ`: `ADS_SD_CONTROL_ENUM` = 256;
public const val `ADS_SD_CONTROL_SE_DACL_DEFAULTED`: `ADS_SD_CONTROL_ENUM` = 8;
public const val `ADS_SD_CONTROL_SE_DACL_PRESENT`: `ADS_SD_CONTROL_ENUM` = 4;
public const val `ADS_SD_CONTROL_SE_DACL_PROTECTED`: `ADS_SD_CONTROL_ENUM` = 4096;
public const val `ADS_SD_CONTROL_SE_GROUP_DEFAULTED`: `ADS_SD_CONTROL_ENUM` = 2;
public const val `ADS_SD_CONTROL_SE_OWNER_DEFAULTED`: `ADS_SD_CONTROL_ENUM` = 1;
public const val `ADS_SD_CONTROL_SE_SACL_AUTO_INHERITED`: `ADS_SD_CONTROL_ENUM` = 2048;
public const val `ADS_SD_CONTROL_SE_SACL_AUTO_INHERIT_REQ`: `ADS_SD_CONTROL_ENUM` = 512;
public const val `ADS_SD_CONTROL_SE_SACL_DEFAULTED`: `ADS_SD_CONTROL_ENUM` = 32;
public const val `ADS_SD_CONTROL_SE_SACL_PRESENT`: `ADS_SD_CONTROL_ENUM` = 16;
public const val `ADS_SD_CONTROL_SE_SACL_PROTECTED`: `ADS_SD_CONTROL_ENUM` = 8192;
public const val `ADS_SD_CONTROL_SE_SELF_RELATIVE`: `ADS_SD_CONTROL_ENUM` = 32768;
public typealias `ADS_SD_FORMAT_ENUM` = Int;
public const val `ADS_SD_FORMAT_HEXSTRING`: `ADS_SD_FORMAT_ENUM` = 3;
public const val `ADS_SD_FORMAT_IID`: `ADS_SD_FORMAT_ENUM` = 1;
public const val `ADS_SD_FORMAT_RAW`: `ADS_SD_FORMAT_ENUM` = 2;
public const val `ADS_SD_REVISION_DS`: `ADS_SD_REVISION_ENUM` = 4;
public typealias `ADS_SD_REVISION_ENUM` = Int;
public const val `ADS_SEARCHPREF_ASYNCHRONOUS`: `ADS_SEARCHPREF_ENUM` = 0;
public const val `ADS_SEARCHPREF_ATTRIBTYPES_ONLY`: `ADS_SEARCHPREF_ENUM` = 4;
public const val `ADS_SEARCHPREF_ATTRIBUTE_QUERY`: `ADS_SEARCHPREF_ENUM` = 15;
public const val `ADS_SEARCHPREF_CACHE_RESULTS`: `ADS_SEARCHPREF_ENUM` = 11;
public const val `ADS_SEARCHPREF_CHASE_REFERRALS`: `ADS_SEARCHPREF_ENUM` = 9;
public const val `ADS_SEARCHPREF_DEREF_ALIASES`: `ADS_SEARCHPREF_ENUM` = 1;
public const val `ADS_SEARCHPREF_DIRSYNC`: `ADS_SEARCHPREF_ENUM` = 12;
public const val `ADS_SEARCHPREF_DIRSYNC_FLAG`: `ADS_SEARCHPREF_ENUM` = 17;
public typealias `ADS_SEARCHPREF_ENUM` = Int;
public const val `ADS_SEARCHPREF_EXTENDED_DN`: `ADS_SEARCHPREF_ENUM` = 18;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ADS_SEARCHPREF_INFO` (
    public var `dwSearchPref`: `ADS_SEARCHPREF_ENUM`,
    public var `vValue`: `ADSVALUE`,
    public var `dwStatus`: `ADS_STATUSENUM`,
)
// UNSUPPORTED Rust 743:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ADS_SEARCHPREF_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ADS_SEARCHPREF_PAGED_TIME_LIMIT`: `ADS_SEARCHPREF_ENUM` = 8;
public const val `ADS_SEARCHPREF_PAGESIZE`: `ADS_SEARCHPREF_ENUM` = 7;
public const val `ADS_SEARCHPREF_SEARCH_SCOPE`: `ADS_SEARCHPREF_ENUM` = 5;
public const val `ADS_SEARCHPREF_SECURITY_MASK`: `ADS_SEARCHPREF_ENUM` = 16;
public const val `ADS_SEARCHPREF_SIZE_LIMIT`: `ADS_SEARCHPREF_ENUM` = 2;
public const val `ADS_SEARCHPREF_SORT_ON`: `ADS_SEARCHPREF_ENUM` = 10;
public const val `ADS_SEARCHPREF_TIMEOUT`: `ADS_SEARCHPREF_ENUM` = 6;
public const val `ADS_SEARCHPREF_TIME_LIMIT`: `ADS_SEARCHPREF_ENUM` = 3;
public const val `ADS_SEARCHPREF_TOMBSTONE`: `ADS_SEARCHPREF_ENUM` = 13;
public const val `ADS_SEARCHPREF_VLV`: `ADS_SEARCHPREF_ENUM` = 14;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ADS_SEARCH_COLUMN` (
    public var `pszAttrName`: `windows_sys`.`core`.`PWSTR`,
    public var `dwADsType`: `ADSTYPE`,
    public var `pADsValues`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ADSVALUE`>?,
    public var `dwNumValues`: UInt,
    public var `hReserved`: `super`.`super`.`Foundation`.`HANDLE`,
)
// UNSUPPORTED Rust 767:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ADS_SEARCH_COLUMN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ADS_SEARCH_HANDLE` = Long;
public const val `ADS_SECURE_AUTHENTICATION`: `ADS_AUTHENTICATION_ENUM` = 1u;
public const val `ADS_SECURITY_INFO_DACL`: `ADS_SECURITY_INFO_ENUM` = 4;
public typealias `ADS_SECURITY_INFO_ENUM` = Int;
public const val `ADS_SECURITY_INFO_GROUP`: `ADS_SECURITY_INFO_ENUM` = 2;
public const val `ADS_SECURITY_INFO_OWNER`: `ADS_SECURITY_INFO_ENUM` = 1;
public const val `ADS_SECURITY_INFO_SACL`: `ADS_SECURITY_INFO_ENUM` = 8;
public const val `ADS_SERVER_BIND`: `ADS_AUTHENTICATION_ENUM` = 512u;
public const val `ADS_SETTYPE_DN`: `ADS_SETTYPE_ENUM` = 4;
public typealias `ADS_SETTYPE_ENUM` = Int;
public const val `ADS_SETTYPE_FULL`: `ADS_SETTYPE_ENUM` = 1;
public const val `ADS_SETTYPE_PROVIDER`: `ADS_SETTYPE_ENUM` = 2;
public const val `ADS_SETTYPE_SERVER`: `ADS_SETTYPE_ENUM` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ADS_SORTKEY` (
    public var `pszAttrType`: `windows_sys`.`core`.`PWSTR`,
    public var `pszReserved`: `windows_sys`.`core`.`PWSTR`,
    public var `fReverseorder`: Boolean,
)
// UNSUPPORTED Rust 792:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ADS_SORTKEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ADS_STATUSENUM` = Int;
public const val `ADS_STATUS_INVALID_SEARCHPREF`: `ADS_STATUSENUM` = 1;
public const val `ADS_STATUS_INVALID_SEARCHPREFVALUE`: `ADS_STATUSENUM` = 2;
public const val `ADS_STATUS_S_OK`: `ADS_STATUSENUM` = 0;
public const val `ADS_SYSTEMFLAG_ATTR_IS_CONSTRUCTED`: `ADS_SYSTEMFLAG_ENUM` = 4;
public const val `ADS_SYSTEMFLAG_ATTR_NOT_REPLICATED`: `ADS_SYSTEMFLAG_ENUM` = 1;
public const val `ADS_SYSTEMFLAG_CONFIG_ALLOW_LIMITED_MOVE`: `ADS_SYSTEMFLAG_ENUM` = 268435456;
public const val `ADS_SYSTEMFLAG_CONFIG_ALLOW_MOVE`: `ADS_SYSTEMFLAG_ENUM` = 536870912;
public const val `ADS_SYSTEMFLAG_CONFIG_ALLOW_RENAME`: `ADS_SYSTEMFLAG_ENUM` = 1073741824;
public const val `ADS_SYSTEMFLAG_CR_NTDS_DOMAIN`: `ADS_SYSTEMFLAG_ENUM` = 2;
public const val `ADS_SYSTEMFLAG_CR_NTDS_NC`: `ADS_SYSTEMFLAG_ENUM` = 1;
public const val `ADS_SYSTEMFLAG_DISALLOW_DELETE`: `ADS_SYSTEMFLAG_ENUM` = -2147483648;
public const val `ADS_SYSTEMFLAG_DOMAIN_DISALLOW_MOVE`: `ADS_SYSTEMFLAG_ENUM` = 67108864;
public const val `ADS_SYSTEMFLAG_DOMAIN_DISALLOW_RENAME`: `ADS_SYSTEMFLAG_ENUM` = 134217728;
public typealias `ADS_SYSTEMFLAG_ENUM` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ADS_TIMESTAMP` (
    public var `WholeSeconds`: UInt,
    public var `EventID`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ADS_TYPEDNAME` (
    public var `ObjectName`: `windows_sys`.`core`.`PWSTR`,
    public var `Level`: UInt,
    public var `Interval`: UInt,
)
// UNSUPPORTED Rust 825:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ADS_TYPEDNAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ADS_UF_ACCOUNTDISABLE`: `ADS_USER_FLAG_ENUM` = 2;
public const val `ADS_UF_DONT_EXPIRE_PASSWD`: `ADS_USER_FLAG_ENUM` = 65536;
public const val `ADS_UF_DONT_REQUIRE_PREAUTH`: `ADS_USER_FLAG_ENUM` = 4194304;
public const val `ADS_UF_ENCRYPTED_TEXT_PASSWORD_ALLOWED`: `ADS_USER_FLAG_ENUM` = 128;
public const val `ADS_UF_HOMEDIR_REQUIRED`: `ADS_USER_FLAG_ENUM` = 8;
public const val `ADS_UF_INTERDOMAIN_TRUST_ACCOUNT`: `ADS_USER_FLAG_ENUM` = 2048;
public const val `ADS_UF_LOCKOUT`: `ADS_USER_FLAG_ENUM` = 16;
public const val `ADS_UF_MNS_LOGON_ACCOUNT`: `ADS_USER_FLAG_ENUM` = 131072;
public const val `ADS_UF_NORMAL_ACCOUNT`: `ADS_USER_FLAG_ENUM` = 512;
public const val `ADS_UF_NOT_DELEGATED`: `ADS_USER_FLAG_ENUM` = 1048576;
public const val `ADS_UF_PASSWD_CANT_CHANGE`: `ADS_USER_FLAG_ENUM` = 64;
public const val `ADS_UF_PASSWD_NOTREQD`: `ADS_USER_FLAG_ENUM` = 32;
public const val `ADS_UF_PASSWORD_EXPIRED`: `ADS_USER_FLAG_ENUM` = 8388608;
public const val `ADS_UF_SCRIPT`: `ADS_USER_FLAG_ENUM` = 1;
public const val `ADS_UF_SERVER_TRUST_ACCOUNT`: `ADS_USER_FLAG_ENUM` = 8192;
public const val `ADS_UF_SMARTCARD_REQUIRED`: `ADS_USER_FLAG_ENUM` = 262144;
public const val `ADS_UF_TEMP_DUPLICATE_ACCOUNT`: `ADS_USER_FLAG_ENUM` = 256;
public const val `ADS_UF_TRUSTED_FOR_DELEGATION`: `ADS_USER_FLAG_ENUM` = 524288;
public const val `ADS_UF_TRUSTED_TO_AUTHENTICATE_FOR_DELEGATION`: `ADS_USER_FLAG_ENUM` = 16777216;
public const val `ADS_UF_USE_DES_KEY_ONLY`: `ADS_USER_FLAG_ENUM` = 2097152;
public const val `ADS_UF_WORKSTATION_TRUST_ACCOUNT`: `ADS_USER_FLAG_ENUM` = 4096;
public typealias `ADS_USER_FLAG_ENUM` = Int;
public const val `ADS_USE_DELEGATION`: `ADS_AUTHENTICATION_ENUM` = 256u;
public const val `ADS_USE_ENCRYPTION`: `ADS_AUTHENTICATION_ENUM` = 2u;
public const val `ADS_USE_SEALING`: `ADS_AUTHENTICATION_ENUM` = 128u;
public const val `ADS_USE_SIGNING`: `ADS_AUTHENTICATION_ENUM` = 64u;
public const val `ADS_USE_SSL`: `ADS_AUTHENTICATION_ENUM` = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ADS_VLV` (
    public var `dwBeforeCount`: UInt,
    public var `dwAfterCount`: UInt,
    public var `dwOffset`: UInt,
    public var `dwContentCount`: UInt,
    public var `pszTarget`: `windows_sys`.`core`.`PWSTR`,
    public var `dwContextIDLength`: UInt,
    public var `lpContextID`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 868:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ADS_VLV {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 873:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ADSystemInfo: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x50b6327f_afd1_11d2_9cb9_0000f87a369e);

// UNSUPPORTED Rust 874:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ADsSecurityUtility: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf270c64a_ffb8_4ae4_85fe_3a75e5347966);

// UNSUPPORTED Rust 875:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AccessControlEntry: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb75ac000_9bdd_11d0_852c_00c04fd8d503);

// UNSUPPORTED Rust 876:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AccessControlList: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb85ea052_9bdd_11d0_852c_00c04fd8d503);

// UNSUPPORTED Rust 877:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const BackLink: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfcbf906f_4080_11d1_a3ac_00c04fb950dc);

// UNSUPPORTED Rust 878:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CFSTR_DSDISPLAYSPECOPTIONS: windows_sys::core::PCWSTR = windows_sys::core::w!("DsDisplaySpecOptions");

// UNSUPPORTED Rust 879:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CFSTR_DSOBJECTNAMES: windows_sys::core::PCWSTR = windows_sys::core::w!("DsObjectNames");

// UNSUPPORTED Rust 880:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CFSTR_DSOP_DS_SELECTION_LIST: windows_sys::core::PCWSTR = windows_sys::core::w!("CFSTR_DSOP_DS_SELECTION_LIST");

// UNSUPPORTED Rust 881:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CFSTR_DSPROPERTYPAGEINFO: windows_sys::core::PCWSTR = windows_sys::core::w!("DsPropPageInfo");

// UNSUPPORTED Rust 882:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CFSTR_DSQUERYPARAMS: windows_sys::core::PCWSTR = windows_sys::core::w!("DsQueryParameters");

// UNSUPPORTED Rust 883:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CFSTR_DSQUERYSCOPE: windows_sys::core::PCWSTR = windows_sys::core::w!("DsQueryScope");

// UNSUPPORTED Rust 884:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CFSTR_DS_DISPLAY_SPEC_OPTIONS: windows_sys::core::PCWSTR = windows_sys::core::w!("DsDisplaySpecOptions");

// UNSUPPORTED Rust 885:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_CommonQuery: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x83bc5ec0_6f2a_11d0_a1c4_00aa00c16e65);

// UNSUPPORTED Rust 886:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_DsAdminCreateObj: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe301a009_f901_11d2_82b9_00c04f68928b);

// UNSUPPORTED Rust 887:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_DsDisplaySpecifier: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1ab4a8c0_6a0b_11d2_ad49_00c04fa31a86);

// UNSUPPORTED Rust 888:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_DsDomainTreeBrowser: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1698790a_e2b4_11d0_b0b1_00c04fd8dca6);

// UNSUPPORTED Rust 889:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_DsFindAdvanced: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x83ee3fe3_57d9_11d0_b932_00a024ab2dbb);

// UNSUPPORTED Rust 890:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_DsFindComputer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x16006700_87ad_11d0_9140_00aa00c16e65);

// UNSUPPORTED Rust 891:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_DsFindContainer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc1b3cbf2_886a_11d0_9140_00aa00c16e65);

// UNSUPPORTED Rust 892:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_DsFindDomainController: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x538c7b7e_d25e_11d0_9742_00a0c906af45);

// UNSUPPORTED Rust 893:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_DsFindFrsMembers: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x94ce4b18_b3d3_11d1_b9b4_00c04fd8d5b0);

// UNSUPPORTED Rust 894:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_DsFindObjects: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x83ee3fe1_57d9_11d0_b932_00a024ab2dbb);

// UNSUPPORTED Rust 895:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_DsFindPeople: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x83ee3fe2_57d9_11d0_b932_00a024ab2dbb);

// UNSUPPORTED Rust 896:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_DsFindPrinter: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb577f070_7ee2_11d0_913f_00aa00c16e65);

// UNSUPPORTED Rust 897:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_DsFindVolume: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc1b3cbf1_886a_11d0_9140_00aa00c16e65);

// UNSUPPORTED Rust 898:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_DsFindWriteableDomainController: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7cbef079_aa84_444b_bc70_68e41283eabc);

// UNSUPPORTED Rust 899:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_DsFolderProperties: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9e51e0d0_6e0f_11d2_9601_00c04fa31a86);

// UNSUPPORTED Rust 900:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_DsObjectPicker: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x17d6ccd8_3b7b_11d2_b9e0_00c04fd8dbf7);

// UNSUPPORTED Rust 901:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_DsPropertyPages: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0d45d530_764b_11d0_a1ca_00aa00c16e65);

// UNSUPPORTED Rust 902:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_DsQuery: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8a23e65e_31c2_11d0_891c_00a024ab2dbb);

// UNSUPPORTED Rust 903:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_MicrosoftDS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfe1290f0_cfbd_11cf_a330_00aa00c16e65);

public const val `CQFF_ISOPTIONAL`: UInt = 2u;
public const val `CQFF_NOGLOBALPAGES`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CQFORM` (
    public var `cbStruct`: UInt,
    public var `dwFlags`: UInt,
    public var `clsid`: `windows_sys`.`core`.`GUID`,
    public var `hIcon`: `super`.`super`.`UI`.`WindowsAndMessaging`.`HICON`,
    public var `pszTitle`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 916:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for CQFORM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CQPAGE` (
    public var `cbStruct`: UInt,
    public var `dwFlags`: UInt,
    public var `pPageProc`: `LPCQPAGEPROC`,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `idPageName`: Int,
    public var `idPageTemplate`: Int,
    public var `pDlgProc`: `super`.`super`.`UI`.`WindowsAndMessaging`.`DLGPROC`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
)
// UNSUPPORTED Rust 935:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for CQPAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CQPM_CLEARFORM`: UInt = 6u;
public const val `CQPM_ENABLE`: UInt = 3u;
public const val `CQPM_GETPARAMETERS`: UInt = 5u;
public const val `CQPM_HANDLERSPECIFIC`: UInt = 268435456u;
public const val `CQPM_HELP`: UInt = 8u;
public const val `CQPM_INITIALIZE`: UInt = 1u;
public const val `CQPM_PERSIST`: UInt = 7u;
public const val `CQPM_RELEASE`: UInt = 2u;
public const val `CQPM_SETDEFAULTPARAMETERS`: UInt = 9u;
// UNSUPPORTED Rust 950:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CaseIgnoreList: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x15f88a55_4680_11d1_a3b4_00c04fb950dc);

public const val `DBDTF_RETURNEXTERNAL`: UInt = 4u;
public const val `DBDTF_RETURNFQDN`: UInt = 1u;
public const val `DBDTF_RETURNINBOUND`: UInt = 8u;
public const val `DBDTF_RETURNINOUTBOUND`: UInt = 16u;
public const val `DBDTF_RETURNMIXEDDOMAINS`: UInt = 2u;
// UNSUPPORTED Rust 956:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DNWithBinary: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7e99c0a3_f935_11d2_ba96_00c04fb6d0d1);

// UNSUPPORTED Rust 957:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DNWithString: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x334857cc_f934_11d2_ba96_00c04fb6d0d1);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOMAINDESC` (
    public var `pszName`: `windows_sys`.`core`.`PWSTR`,
    public var `pszPath`: `windows_sys`.`core`.`PWSTR`,
    public var `pszNCName`: `windows_sys`.`core`.`PWSTR`,
    public var `pszTrustParent`: `windows_sys`.`core`.`PWSTR`,
    public var `pszObjectClass`: `windows_sys`.`core`.`PWSTR`,
    public var `ulFlags`: UInt,
    public var `fDownLevel`: `windows_sys`.`core`.`BOOL`,
    public var `pdChildList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DOMAINDESC`>?,
    public var `pdNextSibling`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DOMAINDESC`>?,
)
// UNSUPPORTED Rust 971:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOMAINDESC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOMAIN_CONTROLLER_INFOA` (
    public var `DomainControllerName`: `windows_sys`.`core`.`PSTR`,
    public var `DomainControllerAddress`: `windows_sys`.`core`.`PSTR`,
    public var `DomainControllerAddressType`: UInt,
    public var `DomainGuid`: `windows_sys`.`core`.`GUID`,
    public var `DomainName`: `windows_sys`.`core`.`PSTR`,
    public var `DnsForestName`: `windows_sys`.`core`.`PSTR`,
    public var `Flags`: UInt,
    public var `DcSiteName`: `windows_sys`.`core`.`PSTR`,
    public var `ClientSiteName`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 989:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOMAIN_CONTROLLER_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOMAIN_CONTROLLER_INFOW` (
    public var `DomainControllerName`: `windows_sys`.`core`.`PWSTR`,
    public var `DomainControllerAddress`: `windows_sys`.`core`.`PWSTR`,
    public var `DomainControllerAddressType`: UInt,
    public var `DomainGuid`: `windows_sys`.`core`.`GUID`,
    public var `DomainName`: `windows_sys`.`core`.`PWSTR`,
    public var `DnsForestName`: `windows_sys`.`core`.`PWSTR`,
    public var `Flags`: UInt,
    public var `DcSiteName`: `windows_sys`.`core`.`PWSTR`,
    public var `ClientSiteName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 1007:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOMAIN_CONTROLLER_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1012:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOMAIN_TREE {
//     pub dsSize: u32,
//     pub dwCount: u32,
//     pub aDomains: [DOMAINDESC; 1],
// }

// UNSUPPORTED Rust 1019:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOMAIN_TREE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DSA_NEWOBJ_CTX_CLEANUP`: UInt = 4u;
public const val `DSA_NEWOBJ_CTX_COMMIT`: UInt = 2u;
public const val `DSA_NEWOBJ_CTX_POSTCOMMIT`: UInt = 3u;
public const val `DSA_NEWOBJ_CTX_PRECOMMIT`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DSA_NEWOBJ_DISPINFO` (
    public var `dwSize`: UInt,
    public var `hObjClassIcon`: `super`.`super`.`UI`.`WindowsAndMessaging`.`HICON`,
    public var `lpszWizTitle`: `windows_sys`.`core`.`PWSTR`,
    public var `lpszContDisplayName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 1037:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for DSA_NEWOBJ_DISPINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DSA_NOTIFY_DEL`: UInt = 1u;
public const val `DSA_NOTIFY_FLAG_ADDITIONAL_DATA`: UInt = 2u;
public const val `DSA_NOTIFY_FLAG_FORCE_ADDITIONAL_DATA`: UInt = 1u;
public const val `DSA_NOTIFY_MOV`: UInt = 4u;
public const val `DSA_NOTIFY_PROP`: UInt = 8u;
public const val `DSA_NOTIFY_REN`: UInt = 2u;
public const val `DSBF_DISPLAYNAME`: UInt = 4u;
public const val `DSBF_ICONLOCATION`: UInt = 2u;
public const val `DSBF_STATE`: UInt = 1u;
public const val `DSBID_BANNER`: UInt = 256u;
public const val `DSBID_CONTAINERLIST`: UInt = 257u;
// UNSUPPORTED Rust 1054:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DSBITEMA {
//     pub cbStruct: u32,
//     pub pszADsPath: windows_sys::core::PCWSTR,
//     pub pszClass: windows_sys::core::PCWSTR,
//     pub dwMask: u32,
//     pub dwState: u32,
//     pub dwStateMask: u32,
//     pub szDisplayName: [i8; 64],
//     pub szIconLocation: [i8; 260],
//     pub iIconResID: i32,
// }

// UNSUPPORTED Rust 1067:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DSBITEMA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1072:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DSBITEMW {
//     pub cbStruct: u32,
//     pub pszADsPath: windows_sys::core::PCWSTR,
//     pub pszClass: windows_sys::core::PCWSTR,
//     pub dwMask: u32,
//     pub dwState: u32,
//     pub dwStateMask: u32,
//     pub szDisplayName: [u16; 64],
//     pub szIconLocation: [u16; 260],
//     pub iIconResID: i32,
// }

// UNSUPPORTED Rust 1085:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DSBITEMW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DSBI_CHECKBOXES`: UInt = 256u;
public const val `DSBI_DONTSIGNSEAL`: UInt = 33554432u;
public const val `DSBI_ENTIREDIRECTORY`: UInt = 589824u;
public const val `DSBI_EXPANDONOPEN`: UInt = 262144u;
public const val `DSBI_HASCREDENTIALS`: UInt = 2097152u;
public const val `DSBI_IGNORETREATASLEAF`: UInt = 4194304u;
public const val `DSBI_INCLUDEHIDDEN`: UInt = 131072u;
public const val `DSBI_NOBUTTONS`: UInt = 1u;
public const val `DSBI_NOLINES`: UInt = 2u;
public const val `DSBI_NOLINESATROOT`: UInt = 4u;
public const val `DSBI_NOROOT`: UInt = 65536u;
public const val `DSBI_RETURNOBJECTCLASS`: UInt = 16777216u;
public const val `DSBI_RETURN_FORMAT`: UInt = 1048576u;
public const val `DSBI_SIMPLEAUTHENTICATE`: UInt = 8388608u;
public const val `DSBM_CHANGEIMAGESTATE`: UInt = 102u;
public const val `DSBM_CONTEXTMENU`: UInt = 104u;
public const val `DSBM_HELP`: UInt = 103u;
public const val `DSBM_QUERYINSERT`: UInt = 100u;
public const val `DSBM_QUERYINSERTA`: UInt = 101u;
public const val `DSBM_QUERYINSERTW`: UInt = 100u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Shell")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DSBROWSEINFOA` (
    public var `cbStruct`: UInt,
    public var `hwndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `pszCaption`: `windows_sys`.`core`.`PCSTR`,
    public var `pszTitle`: `windows_sys`.`core`.`PCSTR`,
    public var `pszRoot`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszPath`: `windows_sys`.`core`.`PWSTR`,
    public var `cchPath`: UInt,
    public var `dwFlags`: UInt,
    public var `pfnCallback`: `super`.`super`.`UI`.`Shell`.`BFFCALLBACK`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `dwReturnFormat`: UInt,
    public var `pUserName`: `windows_sys`.`core`.`PCWSTR`,
    public var `pPassword`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszObjectClass`: `windows_sys`.`core`.`PWSTR`,
    public var `cchObjectClass`: UInt,
)
// UNSUPPORTED Rust 1130:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_Shell")]
// impl Default for DSBROWSEINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Shell")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DSBROWSEINFOW` (
    public var `cbStruct`: UInt,
    public var `hwndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `pszCaption`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszTitle`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszRoot`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszPath`: `windows_sys`.`core`.`PWSTR`,
    public var `cchPath`: UInt,
    public var `dwFlags`: UInt,
    public var `pfnCallback`: `super`.`super`.`UI`.`Shell`.`BFFCALLBACK`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `dwReturnFormat`: UInt,
    public var `pUserName`: `windows_sys`.`core`.`PCWSTR`,
    public var `pPassword`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszObjectClass`: `windows_sys`.`core`.`PWSTR`,
    public var `cchObjectClass`: UInt,
)
// UNSUPPORTED Rust 1156:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_Shell")]
// impl Default for DSBROWSEINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DSBS_CHECKED`: UInt = 1u;
public const val `DSBS_HIDDEN`: UInt = 2u;
public const val `DSBS_ROOT`: UInt = 4u;
public const val `DSB_MAX_DISPLAYNAME_CHARS`: UInt = 64u;
public const val `DSCCIF_HASWIZARDDIALOG`: UInt = 1u;
public const val `DSCCIF_HASWIZARDPRIMARYPAGE`: UInt = 2u;
// UNSUPPORTED Rust 1168:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DSCLASSCREATIONINFO {
//     pub dwFlags: u32,
//     pub clsidWizardDialog: windows_sys::core::GUID,
//     pub clsidWizardPrimaryPage: windows_sys::core::GUID,
//     pub cWizardExtensions: u32,
//     pub aWizardExtensions: [windows_sys::core::GUID; 1],
// }

// UNSUPPORTED Rust 1177:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DSCLASSCREATIONINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DSCOLUMN` (
    public var `dwFlags`: UInt,
    public var `fmt`: Int,
    public var `cx`: Int,
    public var `idsName`: Int,
    public var `offsetProperty`: Int,
    public var `dwReserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DSDISPLAYSPECOPTIONS` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `offsetAttribPrefix`: UInt,
    public var `offsetUserName`: UInt,
    public var `offsetPassword`: UInt,
    public var `offsetServer`: UInt,
    public var `offsetServerConfigPath`: UInt,
)
public const val `DSDSOF_DONTSIGNSEAL`: UInt = 4u;
public const val `DSDSOF_DSAVAILABLE`: UInt = 1073741824u;
public const val `DSDSOF_HASUSERANDSERVERINFO`: UInt = 1u;
public const val `DSDSOF_SIMPLEAUTHENTICATE`: UInt = 2u;
public const val `DSECAF_NOTLISTED`: UInt = 1u;
public const val `DSGIF_DEFAULTISCONTAINER`: UInt = 32u;
public const val `DSGIF_GETDEFAULTICON`: UInt = 16u;
public const val `DSGIF_ISDISABLED`: UInt = 2u;
public const val `DSGIF_ISMASK`: UInt = 15u;
public const val `DSGIF_ISNORMAL`: UInt = 0u;
public const val `DSGIF_ISOPEN`: UInt = 1u;
public const val `DSICCF_IGNORETREATASLEAF`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DSOBJECT` (
    public var `dwFlags`: UInt,
    public var `dwProviderFlags`: UInt,
    public var `offsetName`: UInt,
    public var `offsetClass`: UInt,
)
// UNSUPPORTED Rust 1223:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DSOBJECTNAMES {
//     pub clsidNamespace: windows_sys::core::GUID,
//     pub cItems: u32,
//     pub aObjects: [DSOBJECT; 1],
// }

// UNSUPPORTED Rust 1230:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DSOBJECTNAMES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DSOBJECT_ISCONTAINER`: UInt = 1u;
public const val `DSOBJECT_READONLYPAGES`: UInt = 2147483648u;
public const val `DSOP_DOWNLEVEL_FILTER_ALL_APP_PACKAGES`: UInt = 2281701376u;
public const val `DSOP_DOWNLEVEL_FILTER_ALL_WELLKNOWN_SIDS`: UInt = 2147614720u;
public const val `DSOP_DOWNLEVEL_FILTER_ANONYMOUS`: UInt = 2147483712u;
public const val `DSOP_DOWNLEVEL_FILTER_AUTHENTICATED_USER`: UInt = 2147483680u;
public const val `DSOP_DOWNLEVEL_FILTER_BATCH`: UInt = 2147483776u;
public const val `DSOP_DOWNLEVEL_FILTER_COMPUTERS`: UInt = 2147483656u;
public const val `DSOP_DOWNLEVEL_FILTER_CREATOR_GROUP`: UInt = 2147484160u;
public const val `DSOP_DOWNLEVEL_FILTER_CREATOR_OWNER`: UInt = 2147483904u;
public const val `DSOP_DOWNLEVEL_FILTER_DIALUP`: UInt = 2147484672u;
public const val `DSOP_DOWNLEVEL_FILTER_EXCLUDE_BUILTIN_GROUPS`: UInt = 2147516416u;
public const val `DSOP_DOWNLEVEL_FILTER_GLOBAL_GROUPS`: UInt = 2147483652u;
public const val `DSOP_DOWNLEVEL_FILTER_IIS_APP_POOL`: UInt = 2214592512u;
public const val `DSOP_DOWNLEVEL_FILTER_INTERACTIVE`: UInt = 2147485696u;
public const val `DSOP_DOWNLEVEL_FILTER_INTERNET_USER`: UInt = 2149580800u;
public const val `DSOP_DOWNLEVEL_FILTER_LOCAL_ACCOUNTS`: UInt = 2415919104u;
public const val `DSOP_DOWNLEVEL_FILTER_LOCAL_GROUPS`: UInt = 2147483650u;
public const val `DSOP_DOWNLEVEL_FILTER_LOCAL_LOGON`: UInt = 2164260864u;
public const val `DSOP_DOWNLEVEL_FILTER_LOCAL_SERVICE`: UInt = 2147745792u;
public const val `DSOP_DOWNLEVEL_FILTER_NETWORK`: UInt = 2147487744u;
public const val `DSOP_DOWNLEVEL_FILTER_NETWORK_SERVICE`: UInt = 2148007936u;
public const val `DSOP_DOWNLEVEL_FILTER_OWNER_RIGHTS`: UInt = 2151677952u;
public const val `DSOP_DOWNLEVEL_FILTER_REMOTE_LOGON`: UInt = 2148532224u;
public const val `DSOP_DOWNLEVEL_FILTER_SERVICE`: UInt = 2147491840u;
public const val `DSOP_DOWNLEVEL_FILTER_SERVICES`: UInt = 2155872256u;
public const val `DSOP_DOWNLEVEL_FILTER_SYSTEM`: UInt = 2147500032u;
public const val `DSOP_DOWNLEVEL_FILTER_TERMINAL_SERVER`: UInt = 2147549184u;
public const val `DSOP_DOWNLEVEL_FILTER_THIS_ORG_CERT`: UInt = 2181038080u;
public const val `DSOP_DOWNLEVEL_FILTER_USERS`: UInt = 2147483649u;
public const val `DSOP_DOWNLEVEL_FILTER_WORLD`: UInt = 2147483664u;
public const val `DSOP_FILTER_BUILTIN_GROUPS`: UInt = 4u;
public const val `DSOP_FILTER_COMPUTERS`: UInt = 2048u;
public const val `DSOP_FILTER_CONTACTS`: UInt = 1024u;
public const val `DSOP_FILTER_DOMAIN_LOCAL_GROUPS_DL`: UInt = 256u;
public const val `DSOP_FILTER_DOMAIN_LOCAL_GROUPS_SE`: UInt = 512u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DSOP_FILTER_FLAGS` (
    public var `Uplevel`: `DSOP_UPLEVEL_FILTER_FLAGS`,
    public var `flDownlevel`: UInt,
)
public const val `DSOP_FILTER_GLOBAL_GROUPS_DL`: UInt = 64u;
public const val `DSOP_FILTER_GLOBAL_GROUPS_SE`: UInt = 128u;
public const val `DSOP_FILTER_INCLUDE_ADVANCED_VIEW`: UInt = 1u;
public const val `DSOP_FILTER_PASSWORDSETTINGS_OBJECTS`: UInt = 8192u;
public const val `DSOP_FILTER_SERVICE_ACCOUNTS`: UInt = 4096u;
public const val `DSOP_FILTER_UNIVERSAL_GROUPS_DL`: UInt = 16u;
public const val `DSOP_FILTER_UNIVERSAL_GROUPS_SE`: UInt = 32u;
public const val `DSOP_FILTER_USERS`: UInt = 2u;
public const val `DSOP_FILTER_WELL_KNOWN_PRINCIPALS`: UInt = 8u;
public const val `DSOP_FLAG_MULTISELECT`: UInt = 1u;
public const val `DSOP_FLAG_SKIP_TARGET_COMPUTER_DC_CHECK`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DSOP_INIT_INFO` (
    public var `cbSize`: UInt,
    public var `pwzTargetComputer`: `windows_sys`.`core`.`PCWSTR`,
    public var `cDsScopeInfos`: UInt,
    public var `aDsScopeInfos`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DSOP_SCOPE_INIT_INFO`>?,
    public var `flOptions`: UInt,
    public var `cAttributesToFetch`: UInt,
    public var `apwzAttributeNames`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?,
)
// UNSUPPORTED Rust 1299:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DSOP_INIT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DSOP_SCOPE_FLAG_DEFAULT_FILTER_COMPUTERS`: UInt = 256u;
public const val `DSOP_SCOPE_FLAG_DEFAULT_FILTER_CONTACTS`: UInt = 512u;
public const val `DSOP_SCOPE_FLAG_DEFAULT_FILTER_GROUPS`: UInt = 128u;
public const val `DSOP_SCOPE_FLAG_DEFAULT_FILTER_PASSWORDSETTINGS_OBJECTS`: UInt = 2048u;
public const val `DSOP_SCOPE_FLAG_DEFAULT_FILTER_SERVICE_ACCOUNTS`: UInt = 1024u;
public const val `DSOP_SCOPE_FLAG_DEFAULT_FILTER_USERS`: UInt = 64u;
public const val `DSOP_SCOPE_FLAG_STARTING_SCOPE`: UInt = 1u;
public const val `DSOP_SCOPE_FLAG_WANT_DOWNLEVEL_BUILTIN_PATH`: UInt = 32u;
public const val `DSOP_SCOPE_FLAG_WANT_PROVIDER_GC`: UInt = 8u;
public const val `DSOP_SCOPE_FLAG_WANT_PROVIDER_LDAP`: UInt = 4u;
public const val `DSOP_SCOPE_FLAG_WANT_PROVIDER_WINNT`: UInt = 2u;
public const val `DSOP_SCOPE_FLAG_WANT_SID_PATH`: UInt = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DSOP_SCOPE_INIT_INFO` (
    public var `cbSize`: UInt,
    public var `flType`: UInt,
    public var `flScope`: UInt,
    public var `FilterFlags`: `DSOP_FILTER_FLAGS`,
    public var `pwzDcName`: `windows_sys`.`core`.`PCWSTR`,
    public var `pwzADsPath`: `windows_sys`.`core`.`PCWSTR`,
    public var `hr`: `windows_sys`.`core`.`HRESULT`,
)
// UNSUPPORTED Rust 1327:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DSOP_SCOPE_INIT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DSOP_SCOPE_TYPE_DOWNLEVEL_JOINED_DOMAIN`: UInt = 4u;
public const val `DSOP_SCOPE_TYPE_ENTERPRISE_DOMAIN`: UInt = 8u;
public const val `DSOP_SCOPE_TYPE_EXTERNAL_DOWNLEVEL_DOMAIN`: UInt = 64u;
public const val `DSOP_SCOPE_TYPE_EXTERNAL_UPLEVEL_DOMAIN`: UInt = 32u;
public const val `DSOP_SCOPE_TYPE_GLOBAL_CATALOG`: UInt = 16u;
public const val `DSOP_SCOPE_TYPE_TARGET_COMPUTER`: UInt = 1u;
public const val `DSOP_SCOPE_TYPE_UPLEVEL_JOINED_DOMAIN`: UInt = 2u;
public const val `DSOP_SCOPE_TYPE_USER_ENTERED_DOWNLEVEL_SCOPE`: UInt = 512u;
public const val `DSOP_SCOPE_TYPE_USER_ENTERED_UPLEVEL_SCOPE`: UInt = 256u;
public const val `DSOP_SCOPE_TYPE_WORKGROUP`: UInt = 128u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DSOP_UPLEVEL_FILTER_FLAGS` (
    public var `flBothModes`: UInt,
    public var `flMixedModeOnly`: UInt,
    public var `flNativeModeOnly`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DSPROPERTYPAGEINFO` (
    public var `offsetString`: UInt,
)
// UNSUPPORTED Rust 1354:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DSPROP_ATTRCHANGED_MSG: windows_sys::core::PCWSTR = windows_sys::core::w!("DsPropAttrChanged");

public const val `DSPROVIDER_ADVANCED`: UInt = 16u;
public const val `DSPROVIDER_AD_LDS`: UInt = 32u;
public const val `DSPROVIDER_UNUSED_0`: UInt = 1u;
public const val `DSPROVIDER_UNUSED_1`: UInt = 2u;
public const val `DSPROVIDER_UNUSED_2`: UInt = 4u;
public const val `DSPROVIDER_UNUSED_3`: UInt = 8u;
public const val `DSQPF_ENABLEADMINFEATURES`: UInt = 8u;
public const val `DSQPF_ENABLEADVANCEDFEATURES`: UInt = 16u;
public const val `DSQPF_HASCREDENTIALS`: UInt = 32u;
public const val `DSQPF_NOCHOOSECOLUMNS`: UInt = 64u;
public const val `DSQPF_NOSAVE`: UInt = 1u;
public const val `DSQPF_SAVELOCATION`: UInt = 2u;
public const val `DSQPF_SHOWHIDDENOBJECTS`: UInt = 4u;
public const val `DSQPM_GETCLASSLIST`: UInt = 268435456u;
public const val `DSQPM_HELPTOPICS`: UInt = 268435457u;
// UNSUPPORTED Rust 1370:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DSQUERYCLASSLIST {
//     pub cbStruct: u32,
//     pub cClasses: i32,
//     pub offsetClass: [u32; 1],
// }

// UNSUPPORTED Rust 1377:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DSQUERYCLASSLIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DSQUERYINITPARAMS` (
    public var `cbStruct`: UInt,
    public var `dwFlags`: UInt,
    public var `pDefaultScope`: `windows_sys`.`core`.`PWSTR`,
    public var `pDefaultSaveLocation`: `windows_sys`.`core`.`PWSTR`,
    public var `pUserName`: `windows_sys`.`core`.`PWSTR`,
    public var `pPassword`: `windows_sys`.`core`.`PWSTR`,
    public var `pServer`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 1393:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DSQUERYINITPARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1398:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DSQUERYPARAMS {
//     pub cbStruct: u32,
//     pub dwFlags: u32,
//     pub hInstance: super::super::Foundation::HINSTANCE,
//     pub offsetQuery: i32,
//     pub iColumns: i32,
//     pub dwReserved: u32,
//     pub aColumns: [DSCOLUMN; 1],
// }

// UNSUPPORTED Rust 1409:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DSQUERYPARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DSROLE_MACHINE_ROLE` = Int;
public typealias `DSROLE_OPERATION_STATE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DSROLE_OPERATION_STATE_INFO` (
    public var `OperationState`: `DSROLE_OPERATION_STATE`,
)
public const val `DSROLE_PRIMARY_DOMAIN_GUID_PRESENT`: UInt = 16777216u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DSROLE_PRIMARY_DOMAIN_INFO_BASIC` (
    public var `MachineRole`: `DSROLE_MACHINE_ROLE`,
    public var `Flags`: UInt,
    public var `DomainNameFlat`: `windows_sys`.`core`.`PWSTR`,
    public var `DomainNameDns`: `windows_sys`.`core`.`PWSTR`,
    public var `DomainForestName`: `windows_sys`.`core`.`PWSTR`,
    public var `DomainGuid`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 1432:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DSROLE_PRIMARY_DOMAIN_INFO_BASIC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DSROLE_PRIMARY_DOMAIN_INFO_LEVEL` = Int;
public const val `DSROLE_PRIMARY_DS_MIXED_MODE`: UInt = 2u;
public const val `DSROLE_PRIMARY_DS_READONLY`: UInt = 8u;
public const val `DSROLE_PRIMARY_DS_RUNNING`: UInt = 1u;
public typealias `DSROLE_SERVER_STATE` = Int;
public const val `DSROLE_UPGRADE_IN_PROGRESS`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DSROLE_UPGRADE_STATUS_INFO` (
    public var `OperationState`: UInt,
    public var `PreviousServerState`: `DSROLE_SERVER_STATE`,
)
public const val `DSSSF_DONTSIGNSEAL`: UInt = 2u;
public const val `DSSSF_DSAVAILABLE`: UInt = 2147483648u;
public const val `DSSSF_SIMPLEAUTHENTICATE`: UInt = 1u;
public const val `DS_AVOID_SELF`: UInt = 16384u;
public const val `DS_BACKGROUND_ONLY`: UInt = 256u;
public const val `DS_BEHAVIOR_LONGHORN`: UInt = 3u;
public const val `DS_BEHAVIOR_WIN2000`: UInt = 0u;
public const val `DS_BEHAVIOR_WIN2003`: UInt = 2u;
public const val `DS_BEHAVIOR_WIN2003_WITH_MIXED_DOMAINS`: UInt = 1u;
public const val `DS_BEHAVIOR_WIN2008`: UInt = 3u;
public const val `DS_BEHAVIOR_WIN2008R2`: UInt = 4u;
public const val `DS_BEHAVIOR_WIN2012`: UInt = 5u;
public const val `DS_BEHAVIOR_WIN2012R2`: UInt = 6u;
public const val `DS_BEHAVIOR_WIN2016`: UInt = 7u;
public const val `DS_BEHAVIOR_WIN7`: UInt = 4u;
public const val `DS_BEHAVIOR_WIN8`: UInt = 5u;
public const val `DS_BEHAVIOR_WINBLUE`: UInt = 6u;
public const val `DS_BEHAVIOR_WINTHRESHOLD`: UInt = 7u;
public const val `DS_CANONICAL_NAME`: `DS_NAME_FORMAT` = 7;
public const val `DS_CANONICAL_NAME_EX`: `DS_NAME_FORMAT` = 9;
public const val `DS_CLOSEST_FLAG`: UInt = 128u;
public const val `DS_DIRECTORY_SERVICE_10_REQUIRED`: UInt = 8388608u;
public const val `DS_DIRECTORY_SERVICE_6_REQUIRED`: UInt = 524288u;
public const val `DS_DIRECTORY_SERVICE_8_REQUIRED`: UInt = 2097152u;
public const val `DS_DIRECTORY_SERVICE_9_REQUIRED`: UInt = 4194304u;
public const val `DS_DIRECTORY_SERVICE_PREFERRED`: UInt = 32u;
public const val `DS_DIRECTORY_SERVICE_REQUIRED`: UInt = 16u;
public const val `DS_DISPLAY_NAME`: `DS_NAME_FORMAT` = 3;
public const val `DS_DNS_CONTROLLER_FLAG`: UInt = 536870912u;
public const val `DS_DNS_DOMAIN_FLAG`: UInt = 1073741824u;
public const val `DS_DNS_DOMAIN_NAME`: `DS_NAME_FORMAT` = 12;
public const val `DS_DNS_FOREST_FLAG`: UInt = 2147483648u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DS_DOMAIN_CONTROLLER_INFO_1A` (
    public var `NetbiosName`: `windows_sys`.`core`.`PSTR`,
    public var `DnsHostName`: `windows_sys`.`core`.`PSTR`,
    public var `SiteName`: `windows_sys`.`core`.`PSTR`,
    public var `ComputerObjectName`: `windows_sys`.`core`.`PSTR`,
    public var `ServerObjectName`: `windows_sys`.`core`.`PSTR`,
    public var `fIsPdc`: `windows_sys`.`core`.`BOOL`,
    public var `fDsEnabled`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 1492:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_DOMAIN_CONTROLLER_INFO_1A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DS_DOMAIN_CONTROLLER_INFO_1W` (
    public var `NetbiosName`: `windows_sys`.`core`.`PWSTR`,
    public var `DnsHostName`: `windows_sys`.`core`.`PWSTR`,
    public var `SiteName`: `windows_sys`.`core`.`PWSTR`,
    public var `ComputerObjectName`: `windows_sys`.`core`.`PWSTR`,
    public var `ServerObjectName`: `windows_sys`.`core`.`PWSTR`,
    public var `fIsPdc`: `windows_sys`.`core`.`BOOL`,
    public var `fDsEnabled`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 1508:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_DOMAIN_CONTROLLER_INFO_1W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DS_DOMAIN_CONTROLLER_INFO_2A` (
    public var `NetbiosName`: `windows_sys`.`core`.`PSTR`,
    public var `DnsHostName`: `windows_sys`.`core`.`PSTR`,
    public var `SiteName`: `windows_sys`.`core`.`PSTR`,
    public var `SiteObjectName`: `windows_sys`.`core`.`PSTR`,
    public var `ComputerObjectName`: `windows_sys`.`core`.`PSTR`,
    public var `ServerObjectName`: `windows_sys`.`core`.`PSTR`,
    public var `NtdsDsaObjectName`: `windows_sys`.`core`.`PSTR`,
    public var `fIsPdc`: `windows_sys`.`core`.`BOOL`,
    public var `fDsEnabled`: `windows_sys`.`core`.`BOOL`,
    public var `fIsGc`: `windows_sys`.`core`.`BOOL`,
    public var `SiteObjectGuid`: `windows_sys`.`core`.`GUID`,
    public var `ComputerObjectGuid`: `windows_sys`.`core`.`GUID`,
    public var `ServerObjectGuid`: `windows_sys`.`core`.`GUID`,
    public var `NtdsDsaObjectGuid`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 1531:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_DOMAIN_CONTROLLER_INFO_2A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DS_DOMAIN_CONTROLLER_INFO_2W` (
    public var `NetbiosName`: `windows_sys`.`core`.`PWSTR`,
    public var `DnsHostName`: `windows_sys`.`core`.`PWSTR`,
    public var `SiteName`: `windows_sys`.`core`.`PWSTR`,
    public var `SiteObjectName`: `windows_sys`.`core`.`PWSTR`,
    public var `ComputerObjectName`: `windows_sys`.`core`.`PWSTR`,
    public var `ServerObjectName`: `windows_sys`.`core`.`PWSTR`,
    public var `NtdsDsaObjectName`: `windows_sys`.`core`.`PWSTR`,
    public var `fIsPdc`: `windows_sys`.`core`.`BOOL`,
    public var `fDsEnabled`: `windows_sys`.`core`.`BOOL`,
    public var `fIsGc`: `windows_sys`.`core`.`BOOL`,
    public var `SiteObjectGuid`: `windows_sys`.`core`.`GUID`,
    public var `ComputerObjectGuid`: `windows_sys`.`core`.`GUID`,
    public var `ServerObjectGuid`: `windows_sys`.`core`.`GUID`,
    public var `NtdsDsaObjectGuid`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 1554:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_DOMAIN_CONTROLLER_INFO_2W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DS_DOMAIN_CONTROLLER_INFO_3A` (
    public var `NetbiosName`: `windows_sys`.`core`.`PSTR`,
    public var `DnsHostName`: `windows_sys`.`core`.`PSTR`,
    public var `SiteName`: `windows_sys`.`core`.`PSTR`,
    public var `SiteObjectName`: `windows_sys`.`core`.`PSTR`,
    public var `ComputerObjectName`: `windows_sys`.`core`.`PSTR`,
    public var `ServerObjectName`: `windows_sys`.`core`.`PSTR`,
    public var `NtdsDsaObjectName`: `windows_sys`.`core`.`PSTR`,
    public var `fIsPdc`: `windows_sys`.`core`.`BOOL`,
    public var `fDsEnabled`: `windows_sys`.`core`.`BOOL`,
    public var `fIsGc`: `windows_sys`.`core`.`BOOL`,
    public var `fIsRodc`: `windows_sys`.`core`.`BOOL`,
    public var `SiteObjectGuid`: `windows_sys`.`core`.`GUID`,
    public var `ComputerObjectGuid`: `windows_sys`.`core`.`GUID`,
    public var `ServerObjectGuid`: `windows_sys`.`core`.`GUID`,
    public var `NtdsDsaObjectGuid`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 1578:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_DOMAIN_CONTROLLER_INFO_3A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DS_DOMAIN_CONTROLLER_INFO_3W` (
    public var `NetbiosName`: `windows_sys`.`core`.`PWSTR`,
    public var `DnsHostName`: `windows_sys`.`core`.`PWSTR`,
    public var `SiteName`: `windows_sys`.`core`.`PWSTR`,
    public var `SiteObjectName`: `windows_sys`.`core`.`PWSTR`,
    public var `ComputerObjectName`: `windows_sys`.`core`.`PWSTR`,
    public var `ServerObjectName`: `windows_sys`.`core`.`PWSTR`,
    public var `NtdsDsaObjectName`: `windows_sys`.`core`.`PWSTR`,
    public var `fIsPdc`: `windows_sys`.`core`.`BOOL`,
    public var `fDsEnabled`: `windows_sys`.`core`.`BOOL`,
    public var `fIsGc`: `windows_sys`.`core`.`BOOL`,
    public var `fIsRodc`: `windows_sys`.`core`.`BOOL`,
    public var `SiteObjectGuid`: `windows_sys`.`core`.`GUID`,
    public var `ComputerObjectGuid`: `windows_sys`.`core`.`GUID`,
    public var `ServerObjectGuid`: `windows_sys`.`core`.`GUID`,
    public var `NtdsDsaObjectGuid`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 1602:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_DOMAIN_CONTROLLER_INFO_3W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DS_DOMAIN_DIRECT_INBOUND`: UInt = 32u;
public const val `DS_DOMAIN_DIRECT_OUTBOUND`: UInt = 2u;
public const val `DS_DOMAIN_IN_FOREST`: UInt = 1u;
public const val `DS_DOMAIN_NATIVE_MODE`: UInt = 16u;
public const val `DS_DOMAIN_PRIMARY`: UInt = 8u;
public const val `DS_DOMAIN_TREE_ROOT`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DS_DOMAIN_TRUSTSA` (
    public var `NetbiosDomainName`: `windows_sys`.`core`.`PSTR`,
    public var `DnsDomainName`: `windows_sys`.`core`.`PSTR`,
    public var `Flags`: UInt,
    public var `ParentIndex`: UInt,
    public var `TrustType`: UInt,
    public var `TrustAttributes`: UInt,
    public var `DomainSid`: `super`.`super`.`Security`.`PSID`,
    public var `DomainGuid`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 1626:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for DS_DOMAIN_TRUSTSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DS_DOMAIN_TRUSTSW` (
    public var `NetbiosDomainName`: `windows_sys`.`core`.`PWSTR`,
    public var `DnsDomainName`: `windows_sys`.`core`.`PWSTR`,
    public var `Flags`: UInt,
    public var `ParentIndex`: UInt,
    public var `TrustType`: UInt,
    public var `TrustAttributes`: UInt,
    public var `DomainSid`: `super`.`super`.`Security`.`PSID`,
    public var `DomainGuid`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 1645:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for DS_DOMAIN_TRUSTSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DS_DS_10_FLAG`: UInt = 65536u;
public const val `DS_DS_8_FLAG`: UInt = 16384u;
public const val `DS_DS_9_FLAG`: UInt = 32768u;
public const val `DS_DS_FLAG`: UInt = 16u;
public const val `DS_EXIST_ADVISORY_MODE`: UInt = 1u;
public const val `DS_FORCE_REDISCOVERY`: UInt = 1u;
public const val `DS_FQDN_1779_NAME`: `DS_NAME_FORMAT` = 1;
public const val `DS_FULL_SECRET_DOMAIN_6_FLAG`: UInt = 4096u;
public const val `DS_GC_FLAG`: UInt = 4u;
public const val `DS_GC_SERVER_REQUIRED`: UInt = 64u;
public const val `DS_GFTI_UPDATE_TDO`: UInt = 1u;
public const val `DS_GFTI_VALID_FLAGS`: UInt = 1u;
public const val `DS_GOOD_TIMESERV_FLAG`: UInt = 512u;
public const val `DS_GOOD_TIMESERV_PREFERRED`: UInt = 8192u;
public const val `DS_INSTANCETYPE_IS_NC_HEAD`: UInt = 1u;
public const val `DS_INSTANCETYPE_NC_COMING`: UInt = 16u;
public const val `DS_INSTANCETYPE_NC_GOING`: UInt = 32u;
public const val `DS_INSTANCETYPE_NC_IS_WRITEABLE`: UInt = 4u;
public const val `DS_IP_REQUIRED`: UInt = 512u;
public const val `DS_IS_DNS_NAME`: UInt = 131072u;
public const val `DS_IS_FLAT_NAME`: UInt = 65536u;
public const val `DS_KCC_FLAG_ASYNC_OP`: UInt = 1u;
public const val `DS_KCC_FLAG_DAMPED`: UInt = 2u;
public typealias `DS_KCC_TASKID` = Int;
public const val `DS_KCC_TASKID_UPDATE_TOPOLOGY`: `DS_KCC_TASKID` = 0;
public const val `DS_KDC_FLAG`: UInt = 32u;
public const val `DS_KDC_REQUIRED`: UInt = 1024u;
public const val `DS_KEY_LIST_FLAG`: UInt = 131072u;
public const val `DS_KEY_LIST_SUPPORT_REQUIRED`: UInt = 16777216u;
public const val `DS_LDAP_FLAG`: UInt = 8u;
public const val `DS_LIST_ACCOUNT_OBJECT_FOR_SERVER`: UInt = 2u;
public const val `DS_LIST_DNS_HOST_NAME_FOR_SERVER`: UInt = 1u;
public const val `DS_LIST_DSA_OBJECT_FOR_SERVER`: UInt = 0u;
public typealias `DS_MANGLE_FOR` = Int;
public const val `DS_MANGLE_OBJECT_RDN_FOR_DELETION`: `DS_MANGLE_FOR` = 1;
public const val `DS_MANGLE_OBJECT_RDN_FOR_NAME_CONFLICT`: `DS_MANGLE_FOR` = 2;
public const val `DS_MANGLE_UNKNOWN`: `DS_MANGLE_FOR` = 0;
public typealias `DS_NAME_ERROR` = Int;
public const val `DS_NAME_ERROR_DOMAIN_ONLY`: `DS_NAME_ERROR` = 5;
public const val `DS_NAME_ERROR_NOT_FOUND`: `DS_NAME_ERROR` = 2;
public const val `DS_NAME_ERROR_NOT_UNIQUE`: `DS_NAME_ERROR` = 3;
public const val `DS_NAME_ERROR_NO_MAPPING`: `DS_NAME_ERROR` = 4;
public const val `DS_NAME_ERROR_NO_SYNTACTICAL_MAPPING`: `DS_NAME_ERROR` = 6;
public const val `DS_NAME_ERROR_RESOLVING`: `DS_NAME_ERROR` = 1;
public const val `DS_NAME_ERROR_TRUST_REFERRAL`: `DS_NAME_ERROR` = 7;
public typealias `DS_NAME_FLAGS` = Int;
public const val `DS_NAME_FLAG_EVAL_AT_DC`: `DS_NAME_FLAGS` = 2;
public const val `DS_NAME_FLAG_GCVERIFY`: `DS_NAME_FLAGS` = 4;
public const val `DS_NAME_FLAG_SYNTACTICAL_ONLY`: `DS_NAME_FLAGS` = 1;
public const val `DS_NAME_FLAG_TRUST_REFERRAL`: `DS_NAME_FLAGS` = 8;
public typealias `DS_NAME_FORMAT` = Int;
public const val `DS_NAME_NO_ERROR`: `DS_NAME_ERROR` = 0;
public const val `DS_NAME_NO_FLAGS`: `DS_NAME_FLAGS` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DS_NAME_RESULTA` (
    public var `cItems`: UInt,
    public var `rItems`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DS_NAME_RESULT_ITEMA`>?,
)
// UNSUPPORTED Rust 1710:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_NAME_RESULTA {
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
public class `DS_NAME_RESULTW` (
    public var `cItems`: UInt,
    public var `rItems`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DS_NAME_RESULT_ITEMW`>?,
)
// UNSUPPORTED Rust 1721:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_NAME_RESULTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DS_NAME_RESULT_ITEMA` (
    public var `status`: UInt,
    public var `pDomain`: `windows_sys`.`core`.`PSTR`,
    public var `pName`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 1733:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_NAME_RESULT_ITEMA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DS_NAME_RESULT_ITEMW` (
    public var `status`: UInt,
    public var `pDomain`: `windows_sys`.`core`.`PWSTR`,
    public var `pName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 1745:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_NAME_RESULT_ITEMW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DS_NDNC_FLAG`: UInt = 1024u;
public const val `DS_NOTIFY_AFTER_SITE_RECORDS`: UInt = 2u;
public const val `DS_NT4_ACCOUNT_NAME`: `DS_NAME_FORMAT` = 2;
public const val `DS_ONLY_DO_SITE_NAME`: UInt = 1u;
public const val `DS_ONLY_LDAP_NEEDED`: UInt = 32768u;
public const val `DS_PDC_FLAG`: UInt = 1u;
public const val `DS_PDC_REQUIRED`: UInt = 128u;
public const val `DS_PING_FLAGS`: UInt = 1048575u;
// UNSUPPORTED Rust 1758:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DS_PROP_ADMIN_PREFIX: windows_sys::core::PCWSTR = windows_sys::core::w!("admin");

// UNSUPPORTED Rust 1759:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DS_PROP_SHELL_PREFIX: windows_sys::core::PCWSTR = windows_sys::core::w!("shell");

public const val `DS_REPADD_ASYNCHRONOUS_OPERATION`: UInt = 1u;
public const val `DS_REPADD_ASYNCHRONOUS_REPLICA`: UInt = 32u;
public const val `DS_REPADD_CRITICAL`: UInt = 2048u;
public const val `DS_REPADD_DISABLE_NOTIFICATION`: UInt = 64u;
public const val `DS_REPADD_DISABLE_PERIODIC`: UInt = 128u;
public const val `DS_REPADD_INITIAL`: UInt = 4u;
public const val `DS_REPADD_INTERSITE_MESSAGING`: UInt = 16u;
public const val `DS_REPADD_NEVER_NOTIFY`: UInt = 512u;
public const val `DS_REPADD_NONGC_RO_REPLICA`: UInt = 16777216u;
public const val `DS_REPADD_PERIODIC`: UInt = 8u;
public const val `DS_REPADD_SELECT_SECRETS`: UInt = 4096u;
public const val `DS_REPADD_TWO_WAY`: UInt = 1024u;
public const val `DS_REPADD_USE_COMPRESSION`: UInt = 256u;
public const val `DS_REPADD_WRITEABLE`: UInt = 2u;
public const val `DS_REPDEL_ASYNCHRONOUS_OPERATION`: UInt = 1u;
public const val `DS_REPDEL_IGNORE_ERRORS`: UInt = 8u;
public const val `DS_REPDEL_INTERSITE_MESSAGING`: UInt = 4u;
public const val `DS_REPDEL_LOCAL_ONLY`: UInt = 16u;
public const val `DS_REPDEL_NO_SOURCE`: UInt = 32u;
public const val `DS_REPDEL_REF_OK`: UInt = 64u;
public const val `DS_REPDEL_WRITEABLE`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DS_REPL_ATTR_META_DATA` (
    public var `pszAttributeName`: `windows_sys`.`core`.`PWSTR`,
    public var `dwVersion`: UInt,
    public var `ftimeLastOriginatingChange`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `uuidLastOriginatingDsaInvocationID`: `windows_sys`.`core`.`GUID`,
    public var `usnOriginatingChange`: Long,
    public var `usnLocalChange`: Long,
)
// UNSUPPORTED Rust 1791:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_REPL_ATTR_META_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DS_REPL_ATTR_META_DATA_2` (
    public var `pszAttributeName`: `windows_sys`.`core`.`PWSTR`,
    public var `dwVersion`: UInt,
    public var `ftimeLastOriginatingChange`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `uuidLastOriginatingDsaInvocationID`: `windows_sys`.`core`.`GUID`,
    public var `usnOriginatingChange`: Long,
    public var `usnLocalChange`: Long,
    public var `pszLastOriginatingDsaDN`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 1807:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_REPL_ATTR_META_DATA_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DS_REPL_ATTR_META_DATA_BLOB` (
    public var `oszAttributeName`: UInt,
    public var `dwVersion`: UInt,
    public var `ftimeLastOriginatingChange`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `uuidLastOriginatingDsaInvocationID`: `windows_sys`.`core`.`GUID`,
    public var `usnOriginatingChange`: Long,
    public var `usnLocalChange`: Long,
    public var `oszLastOriginatingDsaDN`: UInt,
)
// UNSUPPORTED Rust 1823:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPL_ATTR_VALUE_META_DATA {
//     pub cNumEntries: u32,
//     pub dwEnumerationContext: u32,
//     pub rgMetaData: [DS_REPL_VALUE_META_DATA; 1],
// }

// UNSUPPORTED Rust 1830:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_REPL_ATTR_VALUE_META_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1835:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPL_ATTR_VALUE_META_DATA_2 {
//     pub cNumEntries: u32,
//     pub dwEnumerationContext: u32,
//     pub rgMetaData: [DS_REPL_VALUE_META_DATA_2; 1],
// }

// UNSUPPORTED Rust 1842:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_REPL_ATTR_VALUE_META_DATA_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1847:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPL_ATTR_VALUE_META_DATA_EXT {
//     pub cNumEntries: u32,
//     pub dwEnumerationContext: u32,
//     pub rgMetaData: [DS_REPL_VALUE_META_DATA_EXT; 1],
// }

// UNSUPPORTED Rust 1854:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_REPL_ATTR_VALUE_META_DATA_EXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DS_REPL_CURSOR` (
    public var `uuidSourceDsaInvocationID`: `windows_sys`.`core`.`GUID`,
    public var `usnAttributeFilter`: Long,
)
// UNSUPPORTED Rust 1865:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPL_CURSORS {
//     pub cNumCursors: u32,
//     pub dwReserved: u32,
//     pub rgCursor: [DS_REPL_CURSOR; 1],
// }

// UNSUPPORTED Rust 1872:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_REPL_CURSORS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1877:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPL_CURSORS_2 {
//     pub cNumCursors: u32,
//     pub dwEnumerationContext: u32,
//     pub rgCursor: [DS_REPL_CURSOR_2; 1],
// }

// UNSUPPORTED Rust 1884:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_REPL_CURSORS_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1889:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPL_CURSORS_3W {
//     pub cNumCursors: u32,
//     pub dwEnumerationContext: u32,
//     pub rgCursor: [DS_REPL_CURSOR_3W; 1],
// }

// UNSUPPORTED Rust 1896:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_REPL_CURSORS_3W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DS_REPL_CURSOR_2` (
    public var `uuidSourceDsaInvocationID`: `windows_sys`.`core`.`GUID`,
    public var `usnAttributeFilter`: Long,
    public var `ftimeLastSyncSuccess`: `super`.`super`.`Foundation`.`FILETIME`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DS_REPL_CURSOR_3W` (
    public var `uuidSourceDsaInvocationID`: `windows_sys`.`core`.`GUID`,
    public var `usnAttributeFilter`: Long,
    public var `ftimeLastSyncSuccess`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `pszSourceDsaDN`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 1916:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_REPL_CURSOR_3W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DS_REPL_CURSOR_BLOB` (
    public var `uuidSourceDsaInvocationID`: `windows_sys`.`core`.`GUID`,
    public var `usnAttributeFilter`: Long,
    public var `ftimeLastSyncSuccess`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `oszSourceDsaDN`: UInt,
)
public const val `DS_REPL_INFO_CURSORS_2_FOR_NC`: `DS_REPL_INFO_TYPE` = 7;
public const val `DS_REPL_INFO_CURSORS_3_FOR_NC`: `DS_REPL_INFO_TYPE` = 8;
public const val `DS_REPL_INFO_CURSORS_FOR_NC`: `DS_REPL_INFO_TYPE` = 1;
public const val `DS_REPL_INFO_FLAG_IMPROVE_LINKED_ATTRS`: UInt = 1u;
public const val `DS_REPL_INFO_KCC_DSA_CONNECT_FAILURES`: `DS_REPL_INFO_TYPE` = 3;
public const val `DS_REPL_INFO_KCC_DSA_LINK_FAILURES`: `DS_REPL_INFO_TYPE` = 4;
public const val `DS_REPL_INFO_METADATA_2_FOR_ATTR_VALUE`: `DS_REPL_INFO_TYPE` = 10;
public const val `DS_REPL_INFO_METADATA_2_FOR_OBJ`: `DS_REPL_INFO_TYPE` = 9;
public const val `DS_REPL_INFO_METADATA_EXT_FOR_ATTR_VALUE`: `DS_REPL_INFO_TYPE` = 11;
public const val `DS_REPL_INFO_METADATA_FOR_ATTR_VALUE`: `DS_REPL_INFO_TYPE` = 6;
public const val `DS_REPL_INFO_METADATA_FOR_OBJ`: `DS_REPL_INFO_TYPE` = 2;
public const val `DS_REPL_INFO_NEIGHBORS`: `DS_REPL_INFO_TYPE` = 0;
public const val `DS_REPL_INFO_PENDING_OPS`: `DS_REPL_INFO_TYPE` = 5;
public typealias `DS_REPL_INFO_TYPE` = Int;
public const val `DS_REPL_INFO_TYPE_MAX`: `DS_REPL_INFO_TYPE` = 12;
// UNSUPPORTED Rust 1944:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPL_KCC_DSA_FAILURESW {
//     pub cNumEntries: u32,
//     pub dwReserved: u32,
//     pub rgDsaFailure: [DS_REPL_KCC_DSA_FAILUREW; 1],
// }

// UNSUPPORTED Rust 1951:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_REPL_KCC_DSA_FAILURESW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DS_REPL_KCC_DSA_FAILUREW` (
    public var `pszDsaDN`: `windows_sys`.`core`.`PWSTR`,
    public var `uuidDsaObjGuid`: `windows_sys`.`core`.`GUID`,
    public var `ftimeFirstFailure`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `cNumFailures`: UInt,
    public var `dwLastResult`: UInt,
)
// UNSUPPORTED Rust 1965:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_REPL_KCC_DSA_FAILUREW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DS_REPL_KCC_DSA_FAILUREW_BLOB` (
    public var `oszDsaDN`: UInt,
    public var `uuidDsaObjGuid`: `windows_sys`.`core`.`GUID`,
    public var `ftimeFirstFailure`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `cNumFailures`: UInt,
    public var `dwLastResult`: UInt,
)
public const val `DS_REPL_NBR_COMPRESS_CHANGES`: UInt = 268435456u;
public const val `DS_REPL_NBR_DISABLE_SCHEDULED_SYNC`: UInt = 134217728u;
public const val `DS_REPL_NBR_DO_SCHEDULED_SYNCS`: UInt = 64u;
public const val `DS_REPL_NBR_FULL_SYNC_IN_PROGRESS`: UInt = 65536u;
public const val `DS_REPL_NBR_FULL_SYNC_NEXT_PACKET`: UInt = 131072u;
public const val `DS_REPL_NBR_GCSPN`: UInt = 1048576u;
public const val `DS_REPL_NBR_IGNORE_CHANGE_NOTIFICATIONS`: UInt = 67108864u;
public const val `DS_REPL_NBR_NEVER_SYNCED`: UInt = 2097152u;
public const val `DS_REPL_NBR_NONGC_RO_REPLICA`: UInt = 1024u;
public const val `DS_REPL_NBR_NO_CHANGE_NOTIFICATIONS`: UInt = 536870912u;
public const val `DS_REPL_NBR_PARTIAL_ATTRIBUTE_SET`: UInt = 1073741824u;
public const val `DS_REPL_NBR_PREEMPTED`: UInt = 16777216u;
public const val `DS_REPL_NBR_RETURN_OBJECT_PARENTS`: UInt = 2048u;
public const val `DS_REPL_NBR_SELECT_SECRETS`: UInt = 4096u;
public const val `DS_REPL_NBR_SYNC_ON_STARTUP`: UInt = 32u;
public const val `DS_REPL_NBR_TWO_WAY_SYNC`: UInt = 512u;
public const val `DS_REPL_NBR_USE_ASYNC_INTERSITE_TRANSPORT`: UInt = 128u;
public const val `DS_REPL_NBR_WRITEABLE`: UInt = 16u;
// UNSUPPORTED Rust 1997:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPL_NEIGHBORSW {
//     pub cNumNeighbors: u32,
//     pub dwReserved: u32,
//     pub rgNeighbor: [DS_REPL_NEIGHBORW; 1],
// }

// UNSUPPORTED Rust 2004:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_REPL_NEIGHBORSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DS_REPL_NEIGHBORW` (
    public var `pszNamingContext`: `windows_sys`.`core`.`PWSTR`,
    public var `pszSourceDsaDN`: `windows_sys`.`core`.`PWSTR`,
    public var `pszSourceDsaAddress`: `windows_sys`.`core`.`PWSTR`,
    public var `pszAsyncIntersiteTransportDN`: `windows_sys`.`core`.`PWSTR`,
    public var `dwReplicaFlags`: UInt,
    public var `dwReserved`: UInt,
    public var `uuidNamingContextObjGuid`: `windows_sys`.`core`.`GUID`,
    public var `uuidSourceDsaObjGuid`: `windows_sys`.`core`.`GUID`,
    public var `uuidSourceDsaInvocationID`: `windows_sys`.`core`.`GUID`,
    public var `uuidAsyncIntersiteTransportObjGuid`: `windows_sys`.`core`.`GUID`,
    public var `usnLastObjChangeSynced`: Long,
    public var `usnAttributeFilter`: Long,
    public var `ftimeLastSyncSuccess`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `ftimeLastSyncAttempt`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `dwLastSyncResult`: UInt,
    public var `cNumConsecutiveSyncFailures`: UInt,
)
// UNSUPPORTED Rust 2029:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_REPL_NEIGHBORW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DS_REPL_NEIGHBORW_BLOB` (
    public var `oszNamingContext`: UInt,
    public var `oszSourceDsaDN`: UInt,
    public var `oszSourceDsaAddress`: UInt,
    public var `oszAsyncIntersiteTransportDN`: UInt,
    public var `dwReplicaFlags`: UInt,
    public var `dwReserved`: UInt,
    public var `uuidNamingContextObjGuid`: `windows_sys`.`core`.`GUID`,
    public var `uuidSourceDsaObjGuid`: `windows_sys`.`core`.`GUID`,
    public var `uuidSourceDsaInvocationID`: `windows_sys`.`core`.`GUID`,
    public var `uuidAsyncIntersiteTransportObjGuid`: `windows_sys`.`core`.`GUID`,
    public var `usnLastObjChangeSynced`: Long,
    public var `usnAttributeFilter`: Long,
    public var `ftimeLastSyncSuccess`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `ftimeLastSyncAttempt`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `dwLastSyncResult`: UInt,
    public var `cNumConsecutiveSyncFailures`: UInt,
)
// UNSUPPORTED Rust 2054:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPL_OBJ_META_DATA {
//     pub cNumEntries: u32,
//     pub dwReserved: u32,
//     pub rgMetaData: [DS_REPL_ATTR_META_DATA; 1],
// }

// UNSUPPORTED Rust 2061:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_REPL_OBJ_META_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2066:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPL_OBJ_META_DATA_2 {
//     pub cNumEntries: u32,
//     pub dwReserved: u32,
//     pub rgMetaData: [DS_REPL_ATTR_META_DATA_2; 1],
// }

// UNSUPPORTED Rust 2073:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_REPL_OBJ_META_DATA_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DS_REPL_OPW` (
    public var `ftimeEnqueued`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `ulSerialNumber`: UInt,
    public var `ulPriority`: UInt,
    public var `OpType`: `DS_REPL_OP_TYPE`,
    public var `ulOptions`: UInt,
    public var `pszNamingContext`: `windows_sys`.`core`.`PWSTR`,
    public var `pszDsaDN`: `windows_sys`.`core`.`PWSTR`,
    public var `pszDsaAddress`: `windows_sys`.`core`.`PWSTR`,
    public var `uuidNamingContextObjGuid`: `windows_sys`.`core`.`GUID`,
    public var `uuidDsaObjGuid`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 2092:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_REPL_OPW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DS_REPL_OPW_BLOB` (
    public var `ftimeEnqueued`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `ulSerialNumber`: UInt,
    public var `ulPriority`: UInt,
    public var `OpType`: `DS_REPL_OP_TYPE`,
    public var `ulOptions`: UInt,
    public var `oszNamingContext`: UInt,
    public var `oszDsaDN`: UInt,
    public var `oszDsaAddress`: UInt,
    public var `uuidNamingContextObjGuid`: `windows_sys`.`core`.`GUID`,
    public var `uuidDsaObjGuid`: `windows_sys`.`core`.`GUID`,
)
public typealias `DS_REPL_OP_TYPE` = Int;
public const val `DS_REPL_OP_TYPE_ADD`: `DS_REPL_OP_TYPE` = 1;
public const val `DS_REPL_OP_TYPE_DELETE`: `DS_REPL_OP_TYPE` = 2;
public const val `DS_REPL_OP_TYPE_MODIFY`: `DS_REPL_OP_TYPE` = 3;
public const val `DS_REPL_OP_TYPE_SYNC`: `DS_REPL_OP_TYPE` = 0;
public const val `DS_REPL_OP_TYPE_UPDATE_REFS`: `DS_REPL_OP_TYPE` = 4;
// UNSUPPORTED Rust 2117:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPL_PENDING_OPSW {
//     pub ftimeCurrentOpStarted: super::super::Foundation::FILETIME,
//     pub cNumPendingOps: u32,
//     pub rgPendingOp: [DS_REPL_OPW; 1],
// }

// UNSUPPORTED Rust 2124:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_REPL_PENDING_OPSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DS_REPL_QUEUE_STATISTICSW` (
    public var `ftimeCurrentOpStarted`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `cNumPendingOps`: UInt,
    public var `ftimeOldestSync`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `ftimeOldestAdd`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `ftimeOldestMod`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `ftimeOldestDel`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `ftimeOldestUpdRefs`: `super`.`super`.`Foundation`.`FILETIME`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DS_REPL_VALUE_META_DATA` (
    public var `pszAttributeName`: `windows_sys`.`core`.`PWSTR`,
    public var `pszObjectDn`: `windows_sys`.`core`.`PWSTR`,
    public var `cbData`: UInt,
    public var `pbData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `ftimeDeleted`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `ftimeCreated`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `dwVersion`: UInt,
    public var `ftimeLastOriginatingChange`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `uuidLastOriginatingDsaInvocationID`: `windows_sys`.`core`.`GUID`,
    public var `usnOriginatingChange`: Long,
    public var `usnLocalChange`: Long,
)
// UNSUPPORTED Rust 2155:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_REPL_VALUE_META_DATA {
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
public class `DS_REPL_VALUE_META_DATA_2` (
    public var `pszAttributeName`: `windows_sys`.`core`.`PWSTR`,
    public var `pszObjectDn`: `windows_sys`.`core`.`PWSTR`,
    public var `cbData`: UInt,
    public var `pbData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `ftimeDeleted`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `ftimeCreated`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `dwVersion`: UInt,
    public var `ftimeLastOriginatingChange`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `uuidLastOriginatingDsaInvocationID`: `windows_sys`.`core`.`GUID`,
    public var `usnOriginatingChange`: Long,
    public var `usnLocalChange`: Long,
    public var `pszLastOriginatingDsaDN`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 2176:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_REPL_VALUE_META_DATA_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DS_REPL_VALUE_META_DATA_BLOB` (
    public var `oszAttributeName`: UInt,
    public var `oszObjectDn`: UInt,
    public var `cbData`: UInt,
    public var `obData`: UInt,
    public var `ftimeDeleted`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `ftimeCreated`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `dwVersion`: UInt,
    public var `ftimeLastOriginatingChange`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `uuidLastOriginatingDsaInvocationID`: `windows_sys`.`core`.`GUID`,
    public var `usnOriginatingChange`: Long,
    public var `usnLocalChange`: Long,
    public var `oszLastOriginatingDsaDN`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DS_REPL_VALUE_META_DATA_BLOB_EXT` (
    public var `oszAttributeName`: UInt,
    public var `oszObjectDn`: UInt,
    public var `cbData`: UInt,
    public var `obData`: UInt,
    public var `ftimeDeleted`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `ftimeCreated`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `dwVersion`: UInt,
    public var `ftimeLastOriginatingChange`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `uuidLastOriginatingDsaInvocationID`: `windows_sys`.`core`.`GUID`,
    public var `usnOriginatingChange`: Long,
    public var `usnLocalChange`: Long,
    public var `oszLastOriginatingDsaDN`: UInt,
    public var `dwUserIdentifier`: UInt,
    public var `dwPriorLinkState`: UInt,
    public var `dwCurrentLinkState`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DS_REPL_VALUE_META_DATA_EXT` (
    public var `pszAttributeName`: `windows_sys`.`core`.`PWSTR`,
    public var `pszObjectDn`: `windows_sys`.`core`.`PWSTR`,
    public var `cbData`: UInt,
    public var `pbData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `ftimeDeleted`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `ftimeCreated`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `dwVersion`: UInt,
    public var `ftimeLastOriginatingChange`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `uuidLastOriginatingDsaInvocationID`: `windows_sys`.`core`.`GUID`,
    public var `usnOriginatingChange`: Long,
    public var `usnLocalChange`: Long,
    public var `pszLastOriginatingDsaDN`: `windows_sys`.`core`.`PWSTR`,
    public var `dwUserIdentifier`: UInt,
    public var `dwPriorLinkState`: UInt,
    public var `dwCurrentLinkState`: UInt,
)
// UNSUPPORTED Rust 2235:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_REPL_VALUE_META_DATA_EXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DS_REPMOD_ASYNCHRONOUS_OPERATION`: UInt = 1u;
public const val `DS_REPMOD_UPDATE_ADDRESS`: UInt = 2u;
public const val `DS_REPMOD_UPDATE_FLAGS`: UInt = 1u;
public const val `DS_REPMOD_UPDATE_INSTANCE`: UInt = 2u;
public const val `DS_REPMOD_UPDATE_RESULT`: UInt = 8u;
public const val `DS_REPMOD_UPDATE_SCHEDULE`: UInt = 4u;
public const val `DS_REPMOD_UPDATE_TRANSPORT`: UInt = 16u;
public const val `DS_REPMOD_WRITEABLE`: UInt = 2u;
public const val `DS_REPSYNCALL_ABORT_IF_SERVER_UNAVAILABLE`: UInt = 1u;
public const val `DS_REPSYNCALL_CROSS_SITE_BOUNDARIES`: UInt = 64u;
public const val `DS_REPSYNCALL_DO_NOT_SYNC`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DS_REPSYNCALL_ERRINFOA` (
    public var `pszSvrId`: `windows_sys`.`core`.`PSTR`,
    public var `error`: `DS_REPSYNCALL_ERROR`,
    public var `dwWin32Err`: UInt,
    public var `pszSrcId`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 2259:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_REPSYNCALL_ERRINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DS_REPSYNCALL_ERRINFOW` (
    public var `pszSvrId`: `windows_sys`.`core`.`PWSTR`,
    public var `error`: `DS_REPSYNCALL_ERROR`,
    public var `dwWin32Err`: UInt,
    public var `pszSrcId`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 2272:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_REPSYNCALL_ERRINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DS_REPSYNCALL_ERROR` = Int;
public typealias `DS_REPSYNCALL_EVENT` = Int;
public const val `DS_REPSYNCALL_EVENT_ERROR`: `DS_REPSYNCALL_EVENT` = 0;
public const val `DS_REPSYNCALL_EVENT_FINISHED`: `DS_REPSYNCALL_EVENT` = 3;
public const val `DS_REPSYNCALL_EVENT_SYNC_COMPLETED`: `DS_REPSYNCALL_EVENT` = 2;
public const val `DS_REPSYNCALL_EVENT_SYNC_STARTED`: `DS_REPSYNCALL_EVENT` = 1;
public const val `DS_REPSYNCALL_ID_SERVERS_BY_DN`: UInt = 4u;
public const val `DS_REPSYNCALL_NO_OPTIONS`: UInt = 0u;
public const val `DS_REPSYNCALL_PUSH_CHANGES_OUTWARD`: UInt = 32u;
public const val `DS_REPSYNCALL_SERVER_UNREACHABLE`: `DS_REPSYNCALL_ERROR` = 2;
public const val `DS_REPSYNCALL_SKIP_INITIAL_CHECK`: UInt = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DS_REPSYNCALL_SYNCA` (
    public var `pszSrcId`: `windows_sys`.`core`.`PSTR`,
    public var `pszDstId`: `windows_sys`.`core`.`PSTR`,
    public var `pszNC`: `windows_sys`.`core`.`PSTR`,
    public var `pguidSrc`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `pguidDst`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
)
// UNSUPPORTED Rust 2297:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_REPSYNCALL_SYNCA {
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
public class `DS_REPSYNCALL_SYNCW` (
    public var `pszSrcId`: `windows_sys`.`core`.`PWSTR`,
    public var `pszDstId`: `windows_sys`.`core`.`PWSTR`,
    public var `pszNC`: `windows_sys`.`core`.`PWSTR`,
    public var `pguidSrc`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `pguidDst`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
)
// UNSUPPORTED Rust 2311:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_REPSYNCALL_SYNCW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DS_REPSYNCALL_SYNC_ADJACENT_SERVERS_ONLY`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DS_REPSYNCALL_UPDATEA` (
    public var `event`: `DS_REPSYNCALL_EVENT`,
    public var `pErrInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DS_REPSYNCALL_ERRINFOA`>?,
    public var `pSync`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DS_REPSYNCALL_SYNCA`>?,
)
// UNSUPPORTED Rust 2324:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_REPSYNCALL_UPDATEA {
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
public class `DS_REPSYNCALL_UPDATEW` (
    public var `event`: `DS_REPSYNCALL_EVENT`,
    public var `pErrInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DS_REPSYNCALL_ERRINFOW`>?,
    public var `pSync`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DS_REPSYNCALL_SYNCW`>?,
)
// UNSUPPORTED Rust 2336:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_REPSYNCALL_UPDATEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DS_REPSYNCALL_WIN32_ERROR_CONTACTING_SERVER`: `DS_REPSYNCALL_ERROR` = 0;
public const val `DS_REPSYNCALL_WIN32_ERROR_REPLICATING`: `DS_REPSYNCALL_ERROR` = 1;
public const val `DS_REPSYNC_ABANDONED`: UInt = 32768u;
public const val `DS_REPSYNC_ADD_REFERENCE`: UInt = 512u;
public const val `DS_REPSYNC_ASYNCHRONOUS_OPERATION`: UInt = 1u;
public const val `DS_REPSYNC_ASYNCHRONOUS_REPLICA`: UInt = 1048576u;
public const val `DS_REPSYNC_CRITICAL`: UInt = 2097152u;
public const val `DS_REPSYNC_FORCE`: UInt = 256u;
public const val `DS_REPSYNC_FULL`: UInt = 32u;
public const val `DS_REPSYNC_FULL_IN_PROGRESS`: UInt = 4194304u;
public const val `DS_REPSYNC_INITIAL`: UInt = 8192u;
public const val `DS_REPSYNC_INITIAL_IN_PROGRESS`: UInt = 65536u;
public const val `DS_REPSYNC_INTERSITE_MESSAGING`: UInt = 8u;
public const val `DS_REPSYNC_NEVER_COMPLETED`: UInt = 1024u;
public const val `DS_REPSYNC_NEVER_NOTIFY`: UInt = 4096u;
public const val `DS_REPSYNC_NONGC_RO_REPLICA`: UInt = 16777216u;
public const val `DS_REPSYNC_NOTIFICATION`: UInt = 524288u;
public const val `DS_REPSYNC_NO_DISCARD`: UInt = 128u;
public const val `DS_REPSYNC_PARTIAL_ATTRIBUTE_SET`: UInt = 131072u;
public const val `DS_REPSYNC_PERIODIC`: UInt = 4u;
public const val `DS_REPSYNC_PREEMPTED`: UInt = 8388608u;
public const val `DS_REPSYNC_REQUEUE`: UInt = 262144u;
public const val `DS_REPSYNC_SELECT_SECRETS`: UInt = 32768u;
public const val `DS_REPSYNC_TWO_WAY`: UInt = 2048u;
public const val `DS_REPSYNC_URGENT`: UInt = 64u;
public const val `DS_REPSYNC_USE_COMPRESSION`: UInt = 16384u;
public const val `DS_REPSYNC_WRITEABLE`: UInt = 2u;
public const val `DS_REPUPD_ADD_REFERENCE`: UInt = 4u;
public const val `DS_REPUPD_ASYNCHRONOUS_OPERATION`: UInt = 1u;
public const val `DS_REPUPD_DELETE_REFERENCE`: UInt = 8u;
public const val `DS_REPUPD_REFERENCE_GCSPN`: UInt = 16u;
public const val `DS_REPUPD_WRITEABLE`: UInt = 2u;
public const val `DS_RETURN_DNS_NAME`: UInt = 1073741824u;
public const val `DS_RETURN_FLAT_NAME`: UInt = 2147483648u;
public const val `DS_ROLE_DOMAIN_OWNER`: UInt = 1u;
public const val `DS_ROLE_INFRASTRUCTURE_OWNER`: UInt = 4u;
public const val `DS_ROLE_PDC_OWNER`: UInt = 2u;
public const val `DS_ROLE_RID_OWNER`: UInt = 3u;
public const val `DS_ROLE_SCHEMA_OWNER`: UInt = 0u;
public const val `DS_SCHEMA_GUID_ATTR`: UInt = 1u;
public const val `DS_SCHEMA_GUID_ATTR_SET`: UInt = 2u;
public const val `DS_SCHEMA_GUID_CLASS`: UInt = 3u;
public const val `DS_SCHEMA_GUID_CONTROL_RIGHT`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DS_SCHEMA_GUID_MAPA` (
    public var `guid`: `windows_sys`.`core`.`GUID`,
    public var `guidType`: UInt,
    public var `pName`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 2391:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_SCHEMA_GUID_MAPA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DS_SCHEMA_GUID_MAPW` (
    public var `guid`: `windows_sys`.`core`.`GUID`,
    public var `guidType`: UInt,
    public var `pName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 2403:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DS_SCHEMA_GUID_MAPW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DS_SCHEMA_GUID_NOT_FOUND`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DS_SELECTION` (
    public var `pwzName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwzADsPath`: `windows_sys`.`core`.`PWSTR`,
    public var `pwzClass`: `windows_sys`.`core`.`PWSTR`,
    public var `pwzUPN`: `windows_sys`.`core`.`PWSTR`,
    public var `pvarFetchedAttributes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Variant`.`VARIANT`>?,
    public var `flScopeType`: UInt,
)
// UNSUPPORTED Rust 2420:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// impl Default for DS_SELECTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2426:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// #[derive(Clone, Copy)]
// pub struct DS_SELECTION_LIST {
//     pub cItems: u32,
//     pub cFetchedAttributes: u32,
//     pub aDsSelection: [DS_SELECTION; 1],
// }

// UNSUPPORTED Rust 2434:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// impl Default for DS_SELECTION_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DS_SELECT_SECRET_DOMAIN_6_FLAG`: UInt = 2048u;
public const val `DS_SERVICE_PRINCIPAL_NAME`: `DS_NAME_FORMAT` = 10;
public const val `DS_SID_OR_SID_HISTORY_NAME`: `DS_NAME_FORMAT` = 11;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DS_SITE_COST_INFO` (
    public var `errorCode`: UInt,
    public var `cost`: UInt,
)
public const val `DS_SPN_ADD_SPN_OP`: `DS_SPN_WRITE_OP` = 0;
public const val `DS_SPN_DELETE_SPN_OP`: `DS_SPN_WRITE_OP` = 2;
public const val `DS_SPN_DNS_HOST`: `DS_SPN_NAME_TYPE` = 0;
public const val `DS_SPN_DN_HOST`: `DS_SPN_NAME_TYPE` = 1;
public const val `DS_SPN_DOMAIN`: `DS_SPN_NAME_TYPE` = 3;
public typealias `DS_SPN_NAME_TYPE` = Int;
public const val `DS_SPN_NB_DOMAIN`: `DS_SPN_NAME_TYPE` = 4;
public const val `DS_SPN_NB_HOST`: `DS_SPN_NAME_TYPE` = 2;
public const val `DS_SPN_REPLACE_SPN_OP`: `DS_SPN_WRITE_OP` = 1;
public const val `DS_SPN_SERVICE`: `DS_SPN_NAME_TYPE` = 5;
public typealias `DS_SPN_WRITE_OP` = Int;
// UNSUPPORTED Rust 2460:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DS_SYNCED_EVENT_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("NTDSInitialSyncsCompleted");

// UNSUPPORTED Rust 2461:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DS_SYNCED_EVENT_NAME_W: windows_sys::core::PCWSTR = windows_sys::core::w!("NTDSInitialSyncsCompleted");

public const val `DS_TIMESERV_FLAG`: UInt = 64u;
public const val `DS_TIMESERV_REQUIRED`: UInt = 2048u;
public const val `DS_TRY_NEXTCLOSEST_SITE`: UInt = 262144u;
public const val `DS_UNIQUE_ID_NAME`: `DS_NAME_FORMAT` = 6;
public const val `DS_UNKNOWN_NAME`: `DS_NAME_FORMAT` = 0;
public const val `DS_USER_PRINCIPAL_NAME`: `DS_NAME_FORMAT` = 8;
public const val `DS_WEB_SERVICE_REQUIRED`: UInt = 1048576u;
public const val `DS_WRITABLE_FLAG`: UInt = 256u;
public const val `DS_WRITABLE_REQUIRED`: UInt = 4096u;
public const val `DS_WS_FLAG`: UInt = 8192u;
public const val `DsRoleOperationActive`: `DSROLE_OPERATION_STATE` = 1;
public const val `DsRoleOperationIdle`: `DSROLE_OPERATION_STATE` = 0;
public const val `DsRoleOperationNeedReboot`: `DSROLE_OPERATION_STATE` = 2;
public const val `DsRoleOperationState`: `DSROLE_PRIMARY_DOMAIN_INFO_LEVEL` = 3;
public const val `DsRolePrimaryDomainInfoBasic`: `DSROLE_PRIMARY_DOMAIN_INFO_LEVEL` = 1;
public const val `DsRoleServerBackup`: `DSROLE_SERVER_STATE` = 2;
public const val `DsRoleServerPrimary`: `DSROLE_SERVER_STATE` = 1;
public const val `DsRoleServerUnknown`: `DSROLE_SERVER_STATE` = 0;
public const val `DsRoleUpgradeStatus`: `DSROLE_PRIMARY_DOMAIN_INFO_LEVEL` = 2;
public const val `DsRole_RoleBackupDomainController`: `DSROLE_MACHINE_ROLE` = 4;
public const val `DsRole_RoleMemberServer`: `DSROLE_MACHINE_ROLE` = 3;
public const val `DsRole_RoleMemberWorkstation`: `DSROLE_MACHINE_ROLE` = 1;
public const val `DsRole_RolePrimaryDomainController`: `DSROLE_MACHINE_ROLE` = 5;
public const val `DsRole_RoleStandaloneServer`: `DSROLE_MACHINE_ROLE` = 2;
public const val `DsRole_RoleStandaloneWorkstation`: `DSROLE_MACHINE_ROLE` = 0;
// UNSUPPORTED Rust 2487:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Email: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8f92a857_478e_11d1_a3b4_00c04fb950dc);

public const val `FACILITY_BACKUP`: UInt = 2047u;
public const val `FACILITY_NTDSB`: UInt = 2048u;
public const val `FACILITY_SYSTEM`: UInt = 0u;
public const val `FLAG_DISABLABLE_OPTIONAL_FEATURE`: UInt = 4u;
public const val `FLAG_DOMAIN_OPTIONAL_FEATURE`: UInt = 2u;
public const val `FLAG_FOREST_OPTIONAL_FEATURE`: UInt = 1u;
public const val `FLAG_SERVER_OPTIONAL_FEATURE`: UInt = 8u;
public const val `FRSCONN_MAX_PRIORITY`: UInt = 8u;
public const val `FRSCONN_PRIORITY_MASK`: UInt = 1879048192u;
// UNSUPPORTED Rust 2497:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FaxNumber: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa5062215_4681_11d1_a3b4_00c04fb950dc);

// UNSUPPORTED Rust 2498:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GUID_COMPUTRS_CONTAINER_A: windows_sys::core::PCSTR = windows_sys::core::s!("aa312825768811d1aded00c04fd8d5cd");

// UNSUPPORTED Rust 2499:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GUID_COMPUTRS_CONTAINER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("aa312825768811d1aded00c04fd8d5cd");

// UNSUPPORTED Rust 2500:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GUID_DELETED_OBJECTS_CONTAINER_A: windows_sys::core::PCSTR = windows_sys::core::s!("18e2ea80684f11d2b9aa00c04f79f805");

// UNSUPPORTED Rust 2501:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GUID_DELETED_OBJECTS_CONTAINER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("18e2ea80684f11d2b9aa00c04f79f805");

// UNSUPPORTED Rust 2502:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GUID_DOMAIN_CONTROLLERS_CONTAINER_A: windows_sys::core::PCSTR = windows_sys::core::s!("a361b2ffffd211d1aa4b00c04fd7d83a");

// UNSUPPORTED Rust 2503:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GUID_DOMAIN_CONTROLLERS_CONTAINER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("a361b2ffffd211d1aa4b00c04fd7d83a");

// UNSUPPORTED Rust 2504:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GUID_FOREIGNSECURITYPRINCIPALS_CONTAINER_A: windows_sys::core::PCSTR = windows_sys::core::s!("22b70c67d56e4efb91e9300fca3dc1aa");

// UNSUPPORTED Rust 2505:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GUID_FOREIGNSECURITYPRINCIPALS_CONTAINER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("22b70c67d56e4efb91e9300fca3dc1aa");

// UNSUPPORTED Rust 2506:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GUID_INFRASTRUCTURE_CONTAINER_A: windows_sys::core::PCSTR = windows_sys::core::s!("2fbac1870ade11d297c400c04fd8d5cd");

// UNSUPPORTED Rust 2507:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GUID_INFRASTRUCTURE_CONTAINER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("2fbac1870ade11d297c400c04fd8d5cd");

// UNSUPPORTED Rust 2508:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GUID_KEYS_CONTAINER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("683A24E2E8164BD3AF86AC3C2CF3F981");

// UNSUPPORTED Rust 2509:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GUID_LOSTANDFOUND_CONTAINER_A: windows_sys::core::PCSTR = windows_sys::core::s!("ab8153b7768811d1aded00c04fd8d5cd");

// UNSUPPORTED Rust 2510:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GUID_LOSTANDFOUND_CONTAINER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("ab8153b7768811d1aded00c04fd8d5cd");

// UNSUPPORTED Rust 2511:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GUID_MANAGED_SERVICE_ACCOUNTS_CONTAINER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1EB93889E40C45DF9F0C64D23BBB6237");

// UNSUPPORTED Rust 2512:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GUID_MICROSOFT_PROGRAM_DATA_CONTAINER_A: windows_sys::core::PCSTR = windows_sys::core::s!("f4be92a4c777485e878e9421d53087db");

// UNSUPPORTED Rust 2513:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GUID_MICROSOFT_PROGRAM_DATA_CONTAINER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("f4be92a4c777485e878e9421d53087db");

// UNSUPPORTED Rust 2514:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GUID_NTDS_QUOTAS_CONTAINER_A: windows_sys::core::PCSTR = windows_sys::core::s!("6227f0af1fc2410d8e3bb10615bb5b0f");

// UNSUPPORTED Rust 2515:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GUID_NTDS_QUOTAS_CONTAINER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("6227f0af1fc2410d8e3bb10615bb5b0f");

// UNSUPPORTED Rust 2516:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GUID_PRIVILEGED_ACCESS_MANAGEMENT_OPTIONAL_FEATURE_A: windows_sys::core::PCSTR = windows_sys::core::s!("73e843ece8cc4046b4ab07ffe4ab5bcd");

// UNSUPPORTED Rust 2517:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GUID_PRIVILEGED_ACCESS_MANAGEMENT_OPTIONAL_FEATURE_W: windows_sys::core::PCWSTR = windows_sys::core::w!("73e843ece8cc4046b4ab07ffe4ab5bcd");

// UNSUPPORTED Rust 2518:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GUID_PROGRAM_DATA_CONTAINER_A: windows_sys::core::PCSTR = windows_sys::core::s!("09460c08ae1e4a4ea0f64aee7daa1e5a");

// UNSUPPORTED Rust 2519:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GUID_PROGRAM_DATA_CONTAINER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("09460c08ae1e4a4ea0f64aee7daa1e5a");

// UNSUPPORTED Rust 2520:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GUID_RECYCLE_BIN_OPTIONAL_FEATURE_A: windows_sys::core::PCSTR = windows_sys::core::s!("d8dc6d76d0ac5e44f3b9a7f9b6744f2a");

// UNSUPPORTED Rust 2521:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GUID_RECYCLE_BIN_OPTIONAL_FEATURE_W: windows_sys::core::PCWSTR = windows_sys::core::w!("d8dc6d76d0ac5e44f3b9a7f9b6744f2a");

// UNSUPPORTED Rust 2522:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GUID_SYSTEMS_CONTAINER_A: windows_sys::core::PCSTR = windows_sys::core::s!("ab1d30f3768811d1aded00c04fd8d5cd");

// UNSUPPORTED Rust 2523:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GUID_SYSTEMS_CONTAINER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("ab1d30f3768811d1aded00c04fd8d5cd");

// UNSUPPORTED Rust 2524:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GUID_USERS_CONTAINER_A: windows_sys::core::PCSTR = windows_sys::core::s!("a9d1ca15768811d1aded00c04fd8d5cd");

// UNSUPPORTED Rust 2525:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GUID_USERS_CONTAINER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("a9d1ca15768811d1aded00c04fd8d5cd");

// UNSUPPORTED Rust 2526:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Hold: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb3ad3e13_4080_11d1_a3ac_00c04fb950dc);

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public typealias `LPCQADDFORMSPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`LPARAM`, /* Rust *mut */ kotlinx.cinterop.CPointer<`CQFORM`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public typealias `LPCQADDPAGESPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`LPARAM`, /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`CQPAGE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public typealias `LPCQPAGEPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`CQPAGE`>?, `super`.`super`.`Foundation`.`HWND`, UInt, `super`.`super`.`Foundation`.`WPARAM`, `super`.`super`.`Foundation`.`LPARAM`) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPDSENUMATTRIBUTES` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`LPARAM`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, UInt) -> `windows_sys`.`core`.`HRESULT`>>>;
// UNSUPPORTED Rust 2534:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LargeInteger: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x927971f5_0939_11d1_8be1_00c04fd8d503);

public const val `NTDSAPI_BIND_ALLOW_DELEGATION`: UInt = 1u;
public const val `NTDSAPI_BIND_FIND_BINDING`: UInt = 2u;
public const val `NTDSAPI_BIND_FORCE_KERBEROS`: UInt = 4u;
public const val `NTDSCONN_KCC_GC_TOPOLOGY`: UInt = 1u;
public const val `NTDSCONN_KCC_INTERSITE_GC_TOPOLOGY`: UInt = 32u;
public const val `NTDSCONN_KCC_INTERSITE_TOPOLOGY`: UInt = 64u;
public const val `NTDSCONN_KCC_MINIMIZE_HOPS_TOPOLOGY`: UInt = 4u;
public const val `NTDSCONN_KCC_NO_REASON`: UInt = 0u;
public const val `NTDSCONN_KCC_OSCILLATING_CONNECTION_TOPOLOGY`: UInt = 16u;
public const val `NTDSCONN_KCC_REDUNDANT_SERVER_TOPOLOGY`: UInt = 512u;
public const val `NTDSCONN_KCC_RING_TOPOLOGY`: UInt = 2u;
public const val `NTDSCONN_KCC_SERVER_FAILOVER_TOPOLOGY`: UInt = 128u;
public const val `NTDSCONN_KCC_SITE_FAILOVER_TOPOLOGY`: UInt = 256u;
public const val `NTDSCONN_KCC_STALE_SERVERS_TOPOLOGY`: UInt = 8u;
public const val `NTDSCONN_OPT_DISABLE_INTERSITE_COMPRESSION`: UInt = 16u;
public const val `NTDSCONN_OPT_IGNORE_SCHEDULE_MASK`: UInt = 2147483648u;
public const val `NTDSCONN_OPT_IS_GENERATED`: UInt = 1u;
public const val `NTDSCONN_OPT_OVERRIDE_NOTIFY_DEFAULT`: UInt = 4u;
public const val `NTDSCONN_OPT_RODC_TOPOLOGY`: UInt = 64u;
public const val `NTDSCONN_OPT_TWOWAY_SYNC`: UInt = 2u;
public const val `NTDSCONN_OPT_USER_OWNED_SCHEDULE`: UInt = 32u;
public const val `NTDSCONN_OPT_USE_NOTIFY`: UInt = 8u;
public const val `NTDSDSA_OPT_BLOCK_RPC`: UInt = 64u;
public const val `NTDSDSA_OPT_DISABLE_INBOUND_REPL`: UInt = 2u;
public const val `NTDSDSA_OPT_DISABLE_NTDSCONN_XLATE`: UInt = 8u;
public const val `NTDSDSA_OPT_DISABLE_OUTBOUND_REPL`: UInt = 4u;
public const val `NTDSDSA_OPT_DISABLE_SPN_REGISTRATION`: UInt = 16u;
public const val `NTDSDSA_OPT_GENERATE_OWN_TOPO`: UInt = 32u;
public const val `NTDSDSA_OPT_IS_GC`: UInt = 1u;
public const val `NTDSSETTINGS_DEFAULT_SERVER_REDUNDANCY`: UInt = 2u;
public const val `NTDSSETTINGS_OPT_FORCE_KCC_W2K_ELECTION`: UInt = 128u;
public const val `NTDSSETTINGS_OPT_FORCE_KCC_WHISTLER_BEHAVIOR`: UInt = 64u;
public const val `NTDSSETTINGS_OPT_IS_AUTO_TOPOLOGY_DISABLED`: UInt = 1u;
public const val `NTDSSETTINGS_OPT_IS_GROUP_CACHING_ENABLED`: UInt = 32u;
public const val `NTDSSETTINGS_OPT_IS_INTER_SITE_AUTO_TOPOLOGY_DISABLED`: UInt = 16u;
public const val `NTDSSETTINGS_OPT_IS_RAND_BH_SELECTION_DISABLED`: UInt = 256u;
public const val `NTDSSETTINGS_OPT_IS_REDUNDANT_SERVER_TOPOLOGY_ENABLED`: UInt = 1024u;
public const val `NTDSSETTINGS_OPT_IS_SCHEDULE_HASHING_ENABLED`: UInt = 512u;
public const val `NTDSSETTINGS_OPT_IS_TOPL_CLEANUP_DISABLED`: UInt = 2u;
public const val `NTDSSETTINGS_OPT_IS_TOPL_DETECT_STALE_DISABLED`: UInt = 8u;
public const val `NTDSSETTINGS_OPT_IS_TOPL_MIN_HOPS_DISABLED`: UInt = 4u;
public const val `NTDSSETTINGS_OPT_W2K3_BRIDGES_REQUIRED`: UInt = 4096u;
public const val `NTDSSETTINGS_OPT_W2K3_IGNORE_SCHEDULES`: UInt = 2048u;
public const val `NTDSSITECONN_OPT_DISABLE_COMPRESSION`: UInt = 4u;
public const val `NTDSSITECONN_OPT_TWOWAY_SYNC`: UInt = 2u;
public const val `NTDSSITECONN_OPT_USE_NOTIFY`: UInt = 1u;
public const val `NTDSSITELINK_OPT_DISABLE_COMPRESSION`: UInt = 4u;
public const val `NTDSSITELINK_OPT_TWOWAY_SYNC`: UInt = 2u;
public const val `NTDSSITELINK_OPT_USE_NOTIFY`: UInt = 1u;
public const val `NTDSTRANSPORT_OPT_BRIDGES_REQUIRED`: UInt = 2u;
public const val `NTDSTRANSPORT_OPT_IGNORE_SCHEDULES`: UInt = 1u;
// UNSUPPORTED Rust 2586:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const NameTranslate: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x274fae1f_3626_11d1_a3a4_00c04fb950dc);

// UNSUPPORTED Rust 2587:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const NetAddress: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb0b71247_4080_11d1_a3ac_00c04fb950dc);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OPENQUERYWINDOW` (
    public var `cbStruct`: UInt,
    public var `dwFlags`: UInt,
    public var `clsidHandler`: `windows_sys`.`core`.`GUID`,
    public var `pHandlerParameters`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `clsidDefaultForm`: `windows_sys`.`core`.`GUID`,
    public var `pPersistQuery`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Anonymous`: `OPENQUERYWINDOW_0`,
)
// UNSUPPORTED Rust 2600:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// impl Default for OPENQUERYWINDOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2606:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// #[derive(Clone, Copy)]
// pub union OPENQUERYWINDOW_0 {
//     pub pFormParameters: *mut core::ffi::c_void,
//     pub ppbFormParameters: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 2613:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// impl Default for OPENQUERYWINDOW_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OQWF_DEFAULTFORM`: UInt = 2u;
public const val `OQWF_HIDEMENUS`: UInt = 1024u;
public const val `OQWF_HIDESEARCHUI`: UInt = 2048u;
public const val `OQWF_ISSUEONOPEN`: UInt = 64u;
public const val `OQWF_LOADQUERY`: UInt = 8u;
public const val `OQWF_OKCANCEL`: UInt = 1u;
public const val `OQWF_PARAMISPROPERTYBAG`: UInt = 2147483648u;
public const val `OQWF_REMOVEFORMS`: UInt = 32u;
public const val `OQWF_REMOVESCOPES`: UInt = 16u;
public const val `OQWF_SAVEQUERYONOK`: UInt = 512u;
public const val `OQWF_SHOWOPTIONAL`: UInt = 128u;
public const val `OQWF_SINGLESELECT`: UInt = 4u;
// UNSUPPORTED Rust 2631:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const OctetList: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1241400f_4680_11d1_a3b4_00c04fb950dc);

// UNSUPPORTED Rust 2632:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Path: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb2538919_4080_11d1_a3ac_00c04fb950dc);

// UNSUPPORTED Rust 2633:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Pathname: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x080d0d78_f421_11d0_a36e_00c04fb950dc);

// UNSUPPORTED Rust 2634:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PostalAddress: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0a75afcd_4680_11d1_a3b4_00c04fb950dc);

// UNSUPPORTED Rust 2635:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PropertyEntry: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x72d3edc2_a4c4_11d0_8533_00c04fd8d503);

// UNSUPPORTED Rust 2636:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PropertyValue: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7b9e38b0_a97c_11d0_8534_00c04fd8d503);

public const val `QUERYFORM_CHANGESFORMLIST`: ULong = 1uL;
public const val `QUERYFORM_CHANGESOPTFORMLIST`: ULong = 2uL;
// UNSUPPORTED Rust 2639:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ReplicaPointer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf5d1badf_4080_11d1_a3ac_00c04fb950dc);

// UNSUPPORTED Rust 2640:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SCHEDULE {
//     pub Size: u32,
//     pub Bandwidth: u32,
//     pub NumberOfSchedules: u32,
//     pub Schedules: [SCHEDULE_HEADER; 1],
// }

// UNSUPPORTED Rust 2648:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCHEDULE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SCHEDULE_BANDWIDTH`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCHEDULE_HEADER` (
    public var `Type`: UInt,
    public var `Offset`: UInt,
)
public const val `SCHEDULE_INTERVAL`: UInt = 0u;
public const val `SCHEDULE_PRIORITY`: UInt = 2u;
// UNSUPPORTED Rust 2662:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SecurityDescriptor: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb958f73c_9bdd_11d0_852c_00c04fd8d503);

// UNSUPPORTED Rust 2663:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Timestamp: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb2bed2eb_4080_11d1_a3ac_00c04fb950dc);

// UNSUPPORTED Rust 2664:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const TypedName: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb33143cb_4080_11d1_a3ac_00c04fb950dc);

public const val `WM_ADSPROP_NOTIFY_APPLY`: UInt = 2128u;
public const val `WM_ADSPROP_NOTIFY_CHANGE`: UInt = 2127u;
public const val `WM_ADSPROP_NOTIFY_ERROR`: UInt = 2134u;
public const val `WM_ADSPROP_NOTIFY_EXIT`: UInt = 2131u;
public const val `WM_ADSPROP_NOTIFY_FOREGROUND`: UInt = 2130u;
public const val `WM_ADSPROP_NOTIFY_PAGEHWND`: UInt = 2126u;
public const val `WM_ADSPROP_NOTIFY_PAGEINIT`: UInt = 2125u;
public const val `WM_ADSPROP_NOTIFY_SETFOCUS`: UInt = 2129u;
// UNSUPPORTED Rust 2673:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WinNTSystemInfo: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66182ec4_afd1_11d2_9cb9_0000f87a369e);

public const val `hrAccessDenied`: Int = -939522189;
public const val `hrAfterInitialization`: Int = -939522246;
public const val `hrAlreadyInitialized`: Int = -939523066;
public const val `hrAlreadyOpen`: Int = -939589627;
public const val `hrAlreadyPrepared`: Int = -939522489;
public const val `hrBFInUse`: Int = -939523894;
public const val `hrBFNotSynchronous`: Int = -2013265720;
public const val `hrBFPageNotFound`: Int = -2013265719;
public const val `hrBackupDirectoryNotEmpty`: Int = -939523592;
public const val `hrBackupInProgress`: Int = -939523591;
public const val `hrBackupNotAllowedYet`: Int = -939523573;
public const val `hrBadBackupDatabaseSize`: Int = -939523535;
public const val `hrBadCheckpointSignature`: Int = -939523564;
public const val `hrBadColumnId`: Int = -939522579;
public const val `hrBadDbSignature`: Int = -939523565;
public const val `hrBadItagSequence`: Int = -939522578;
public const val `hrBadLogSignature`: Int = -939523566;
public const val `hrBadLogVersion`: Int = -939523582;
public const val `hrBufferTooSmall`: Int = -939523058;
public const val `hrBufferTruncated`: Int = -2013264914;
public const val `hrCannotBeTagged`: Int = -939522575;
public const val `hrCannotRename`: Int = -939522790;
public const val `hrCheckpointCorrupt`: Int = -939523563;
public const val `hrCircularLogging`: Int = -939589621;
public const val `hrColumn2ndSysMaint`: Int = -939522586;
public const val `hrColumnCannotIndex`: Int = -939522583;
public const val `hrColumnDoesNotFit`: Int = -939522593;
public const val `hrColumnDuplicate`: Int = -939522588;
public const val `hrColumnInUse`: Int = -939523050;
public const val `hrColumnIndexed`: Int = -939522591;
public const val `hrColumnLong`: Int = -939522595;
public const val `hrColumnMaxTruncated`: Int = -2013264408;
public const val `hrColumnNotFound`: Int = -939522589;
public const val `hrColumnNotUpdatable`: Int = -939523048;
public const val `hrColumnNull`: Int = -2013264916;
public const val `hrColumnSetNull`: Int = -2013264852;
public const val `hrColumnTooBig`: Int = -939522590;
public const val `hrCommunicationError`: Int = -939589619;
public const val `hrConsistentTimeMismatch`: Int = -939523545;
public const val `hrContainerNotEmpty`: Int = -939523053;
public const val `hrContentsExpired`: Int = -939589615;
public const val `hrCouldNotConnect`: Int = -939589625;
public const val `hrCreateIndexFailed`: Int = -2013264511;
public const val `hrCurrencyStackOutOfMemory`: Int = -939523026;
public const val `hrDatabaseAttached`: Int = -2013264913;
public const val `hrDatabaseCorrupted`: Int = -939522890;
public const val `hrDatabaseDuplicate`: Int = -939522895;
public const val `hrDatabaseInUse`: Int = -939522894;
public const val `hrDatabaseInconsistent`: Int = -939523546;
public const val `hrDatabaseInvalidName`: Int = -939522892;
public const val `hrDatabaseInvalidPages`: Int = -939522891;
public const val `hrDatabaseLocked`: Int = -939522889;
public const val `hrDatabaseNotFound`: Int = -939522893;
public const val `hrDeleteBackupFileFail`: Int = -939523572;
public const val `hrDensityInvalid`: Int = -939522789;
public const val `hrDiskFull`: Int = -939522288;
public const val `hrDiskIO`: Int = -939523074;
public const val `hrError`: Int = -939589630;
public const val `hrExistingLogFileHasBadSignature`: Int = -2013265362;
public const val `hrExistingLogFileIsNotContiguous`: Int = -2013265361;
public const val `hrFLDKeyTooBig`: Int = -2013265520;
public const val `hrFLDNullKey`: Int = -2013265518;
public const val `hrFLDTooManySegments`: Int = -939523695;
public const val `hrFeatureNotAvailable`: Int = -939523095;
public const val `hrFileAccessDenied`: Int = -939523064;
public const val `hrFileClose`: Int = -939523994;
public const val `hrFileNotFound`: Int = -939522285;
public const val `hrFileOpenReadOnly`: Int = -2013264107;
public const val `hrFullBackupNotTaken`: Int = -939589618;
public const val `hrGivenLogFileHasBadSignature`: Int = -939523541;
public const val `hrGivenLogFileIsNotContiguous`: Int = -939523540;
public const val `hrIllegalOperation`: Int = -939522784;
public const val `hrInTransaction`: Int = -939522988;
public const val `hrIncrementalBackupDisabled`: Int = -939589623;
public const val `hrIndexCantBuild`: Int = -939522695;
public const val `hrIndexDuplicate`: Int = -939522693;
public const val `hrIndexHasClustered`: Int = -939522688;
public const val `hrIndexHasPrimary`: Int = -939522694;
public const val `hrIndexInUse`: Int = -939523045;
public const val `hrIndexInvalidDef`: Int = -939522690;
public const val `hrIndexMustStay`: Int = -939522691;
public const val `hrIndexNotFound`: Int = -939522692;
public const val `hrInvalidBackup`: Int = -939523570;
public const val `hrInvalidBackupSequence`: Int = -939523575;
public const val `hrInvalidBookmark`: Int = -939523051;
public const val `hrInvalidBufferSize`: Int = -939523049;
public const val `hrInvalidCodePage`: Int = -939523033;
public const val `hrInvalidColumnType`: Int = -939522585;
public const val `hrInvalidCountry`: Int = -939523035;
public const val `hrInvalidDatabase`: Int = -939523068;
public const val `hrInvalidDatabaseId`: Int = -939523086;
public const val `hrInvalidFilename`: Int = -939523052;
public const val `hrInvalidHandle`: Int = -939589629;
public const val `hrInvalidLanguageId`: Int = -939523034;
public const val `hrInvalidLogSequence`: Int = -939523581;
public const val `hrInvalidName`: Int = -939523094;
public const val `hrInvalidObject`: Int = -939522780;
public const val `hrInvalidOnSort`: Int = -939522394;
public const val `hrInvalidOperation`: Int = -939522190;
public const val `hrInvalidParam`: Int = -939589631;
public const val `hrInvalidParameter`: Int = -939523093;
public const val `hrInvalidPath`: Int = -939523073;
public const val `hrInvalidRecips`: Int = -939589626;
public const val `hrInvalidSesid`: Int = -939522992;
public const val `hrInvalidTableId`: Int = -939522786;
public const val `hrKeyChanged`: Int = -2013264302;
public const val `hrKeyDuplicate`: Int = -939522491;
public const val `hrKeyIsMade`: Int = -939522580;
public const val `hrKeyNotMade`: Int = -939522488;
public const val `hrLogBufferTooSmall`: Int = -939523579;
public const val `hrLogCorrupted`: Int = -939522244;
public const val `hrLogDiskFull`: Int = -939523567;
public const val `hrLogFileCorrupt`: Int = -939523595;
public const val `hrLogFileNotFound`: Int = -939589622;
public const val `hrLogSequenceEnd`: Int = -939523577;
public const val `hrLogWriteFail`: Int = -939523586;
public const val `hrLoggingDisabled`: Int = -939523580;
public const val `hrMakeBackupDirectoryFail`: Int = -939523571;
public const val `hrMissingExpiryToken`: Int = -939589617;
public const val `hrMissingFullBackup`: Int = -939523536;
public const val `hrMissingLogFile`: Int = -939523568;
public const val `hrMissingPreviousLogFile`: Int = -939523587;
public const val `hrMissingRestoreLogFiles`: Int = -939523539;
public const val `hrNoBackup`: Int = -939523576;
public const val `hrNoBackupDirectory`: Int = -939523593;
public const val `hrNoCurrentIndex`: Int = -939522581;
public const val `hrNoCurrentRecord`: Int = -939522493;
public const val `hrNoFullRestore`: Int = -939589620;
public const val `hrNoIdleActivity`: Int = -2013264862;
public const val `hrNoWriteLock`: Int = -2013264853;
public const val `hrNone`: Int = 0;
public const val `hrNotInTransaction`: Int = -939523042;
public const val `hrNotInitialized`: Int = -939523067;
public const val `hrNullInvalid`: Int = -939522592;
public const val `hrNullKeyDisallowed`: Int = -939523043;
public const val `hrNyi`: Int = -1073741823;
public const val `hrObjectDuplicate`: Int = -939522782;
public const val `hrObjectNotFound`: Int = -939522791;
public const val `hrOutOfBuffers`: Int = -939523082;
public const val `hrOutOfCursors`: Int = -939523083;
public const val `hrOutOfDatabaseSpace`: Int = -939523084;
public const val `hrOutOfFileHandles`: Int = -939523076;
public const val `hrOutOfMemory`: Int = -939523085;
public const val `hrOutOfSessions`: Int = -939522995;
public const val `hrOutOfThreads`: Int = -939523993;
public const val `hrPMRecDeleted`: Int = -939523794;
public const val `hrPatchFileMismatch`: Int = -939523544;
public const val `hrPermissionDenied`: Int = -939522287;
public const val `hrReadVerifyFailure`: Int = -939523078;
public const val `hrRecordClusteredChanged`: Int = -939522492;
public const val `hrRecordDeleted`: Int = -939523079;
public const val `hrRecordNotFound`: Int = -939522495;
public const val `hrRecordTooBig`: Int = -939523070;
public const val `hrRecoveredWithErrors`: Int = -939523569;
public const val `hrRemainingVersions`: Int = -2013265599;
public const val `hrRestoreInProgress`: Int = -939589628;
public const val `hrRestoreLogTooHigh`: Int = -939523542;
public const val `hrRestoreLogTooLow`: Int = -939523543;
public const val `hrRestoreMapExists`: Int = -939589624;
public const val `hrSeekNotEqual`: Int = -2013264881;
public const val `hrSessionWriteConflict`: Int = -939522989;
public const val `hrTableDuplicate`: Int = -939522793;
public const val `hrTableEmpty`: Int = -2013264619;
public const val `hrTableInUse`: Int = -939522792;
public const val `hrTableLocked`: Int = -939522794;
public const val `hrTableNotEmpty`: Int = -939522788;
public const val `hrTaggedNotNULL`: Int = -939522582;
public const val `hrTempFileOpenError`: Int = -939522293;
public const val `hrTermInProgress`: Int = -939523096;
public const val `hrTooManyActiveUsers`: Int = -939523037;
public const val `hrTooManyAttachedDatabases`: Int = -939522291;
public const val `hrTooManyColumns`: Int = -939523056;
public const val `hrTooManyIO`: Int = -939523991;
public const val `hrTooManyIndexes`: Int = -939523081;
public const val `hrTooManyKeys`: Int = -939523080;
public const val `hrTooManyOpenDatabases`: Int = -939523069;
public const val `hrTooManyOpenIndexes`: Int = -939522686;
public const val `hrTooManyOpenTables`: Int = -939522785;
public const val `hrTooManySorts`: Int = -939522395;
public const val `hrTransTooDeep`: Int = -939522993;
public const val `hrUnknownExpiryTokenFormat`: Int = -939589616;
public const val `hrUpdateNotPrepared`: Int = -939522487;
public const val `hrVersionStoreOutOfMemory`: Int = -939523027;
public const val `hrWriteConflict`: Int = -939522994;
public const val `hrerrDataHasChanged`: Int = -939522485;
public const val `hrwrnDataHasChanged`: Int = -2013264310;
