// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=drt.dll, ABI=system, export=DrtClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrtClose`(`hdrt` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=drt.dll, ABI=system, export=DrtContinueSearch; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrtContinueSearch`(`hsearchcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=drtprov.dll, ABI=system, export=DrtCreateDerivedKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
public external fun `DrtCreateDerivedKey`(`plocalcert` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`Cryptography`.`CERT_CONTEXT`>?, `pkey` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DRT_DATA`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=drtprov.dll, ABI=system, export=DrtCreateDerivedKeySecurityProvider; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
public external fun `DrtCreateDerivedKeySecurityProvider`(`prootcert` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`Cryptography`.`CERT_CONTEXT`>?, `plocalcert` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`Cryptography`.`CERT_CONTEXT`>?, `ppsecurityprovider` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DRT_SECURITY_PROVIDER`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=drtprov.dll, ABI=system, export=DrtCreateDnsBootstrapResolver; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrtCreateDnsBootstrapResolver`(`port` : UShort, `pwszaddress` : `windows_sys`.`core`.`PCWSTR`, `ppmodule` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DRT_BOOTSTRAP_PROVIDER`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=drttransport.dll, ABI=system, export=DrtCreateIpv6UdpTransport; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrtCreateIpv6UdpTransport`(`scope` : `DRT_SCOPE`, `dwscopeid` : UInt, `dwlocalitythreshold` : UInt, `pwport` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `phtransport` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=drtprov.dll, ABI=system, export=DrtCreateNullSecurityProvider; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrtCreateNullSecurityProvider`(`ppsecurityprovider` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DRT_SECURITY_PROVIDER`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=drtprov.dll, ABI=system, export=DrtCreatePnrpBootstrapResolver; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrtCreatePnrpBootstrapResolver`(`fpublish` : `windows_sys`.`core`.`BOOL`, `pwzpeername` : `windows_sys`.`core`.`PCWSTR`, `pwzcloudname` : `windows_sys`.`core`.`PCWSTR`, `pwzpublishingidentity` : `windows_sys`.`core`.`PCWSTR`, `ppresolver` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DRT_BOOTSTRAP_PROVIDER`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=drtprov.dll, ABI=system, export=DrtDeleteDerivedKeySecurityProvider; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrtDeleteDerivedKeySecurityProvider`(`psecurityprovider` : /* Rust *const */ kotlinx.cinterop.CPointer<`DRT_SECURITY_PROVIDER`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=drtprov.dll, ABI=system, export=DrtDeleteDnsBootstrapResolver; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrtDeleteDnsBootstrapResolver`(`presolver` : /* Rust *const */ kotlinx.cinterop.CPointer<`DRT_BOOTSTRAP_PROVIDER`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=drttransport.dll, ABI=system, export=DrtDeleteIpv6UdpTransport; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrtDeleteIpv6UdpTransport`(`htransport` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=drtprov.dll, ABI=system, export=DrtDeleteNullSecurityProvider; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrtDeleteNullSecurityProvider`(`psecurityprovider` : /* Rust *const */ kotlinx.cinterop.CPointer<`DRT_SECURITY_PROVIDER`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=drtprov.dll, ABI=system, export=DrtDeletePnrpBootstrapResolver; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrtDeletePnrpBootstrapResolver`(`presolver` : /* Rust *const */ kotlinx.cinterop.CPointer<`DRT_BOOTSTRAP_PROVIDER`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=drt.dll, ABI=system, export=DrtEndSearch; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrtEndSearch`(`hsearchcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=drt.dll, ABI=system, export=DrtGetEventData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `DrtGetEventData`(`hdrt` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `uleventdatalen` : UInt, `peventdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DRT_EVENT_DATA`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=drt.dll, ABI=system, export=DrtGetEventDataSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrtGetEventDataSize`(`hdrt` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `puleventdatalen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=drt.dll, ABI=system, export=DrtGetInstanceName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrtGetInstanceName`(`hdrt` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ulcbinstancenamesize` : UInt, `pwzdrtinstancename` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=drt.dll, ABI=system, export=DrtGetInstanceNameSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrtGetInstanceNameSize`(`hdrt` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pulcbinstancenamesize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=drt.dll, ABI=system, export=DrtGetSearchPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `DrtGetSearchPath`(`hsearchcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ulsearchpathsize` : UInt, `psearchpath` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DRT_ADDRESS_LIST`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=drt.dll, ABI=system, export=DrtGetSearchPathSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrtGetSearchPathSize`(`hsearchcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pulsearchpathsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=drt.dll, ABI=system, export=DrtGetSearchResult; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrtGetSearchResult`(`hsearchcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ulsearchresultsize` : UInt, `psearchresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DRT_SEARCH_RESULT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=drt.dll, ABI=system, export=DrtGetSearchResultSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrtGetSearchResultSize`(`hsearchcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pulsearchresultsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=drt.dll, ABI=system, export=DrtOpen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrtOpen`(`psettings` : /* Rust *const */ kotlinx.cinterop.CPointer<`DRT_SETTINGS`>?, `hevent` : `super`.`super`.`Foundation`.`HANDLE`, `pvcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phdrt` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=drt.dll, ABI=system, export=DrtRegisterKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrtRegisterKey`(`hdrt` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pregistration` : /* Rust *const */ kotlinx.cinterop.CPointer<`DRT_REGISTRATION`>?, `pvkeycontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phkeyregistration` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=drt.dll, ABI=system, export=DrtStartSearch; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrtStartSearch`(`hdrt` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`DRT_DATA`>?, `pinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DRT_SEARCH_INFO`>?, `timeout` : UInt, `hevent` : `super`.`super`.`Foundation`.`HANDLE`, `pvcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `hsearchcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=drt.dll, ABI=system, export=DrtUnregisterKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrtUnregisterKey`(`hkeyregistration` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=drt.dll, ABI=system, export=DrtUpdateKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrtUpdateKey`(`hkeyregistration` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pappdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`DRT_DATA`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabAddContact; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerCollabAddContact`(`pwzcontactdata` : `windows_sys`.`core`.`PCWSTR`, `ppcontact` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`PEER_CONTACT`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabAsyncInviteContact; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `PeerCollabAsyncInviteContact`(`pccontact` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_CONTACT`>?, `pcendpoint` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_ENDPOINT`>?, `pcinvitation` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_INVITATION`>?, `hevent` : `super`.`super`.`Foundation`.`HANDLE`, `phinvitation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabAsyncInviteEndpoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `PeerCollabAsyncInviteEndpoint`(`pcendpoint` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_ENDPOINT`>?, `pcinvitation` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_INVITATION`>?, `hevent` : `super`.`super`.`Foundation`.`HANDLE`, `phinvitation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabCancelInvitation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerCollabCancelInvitation`(`hinvitation` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabCloseHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerCollabCloseHandle`(`hinvitation` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabDeleteContact; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerCollabDeleteContact`(`pwzpeername` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabDeleteEndpointData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `PeerCollabDeleteEndpointData`(`pcendpoint` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_ENDPOINT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabDeleteObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerCollabDeleteObject`(`pobjectid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabEnumApplicationRegistrationInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerCollabEnumApplicationRegistrationInfo`(`registrationtype` : `PEER_APPLICATION_REGISTRATION_TYPE`, `phpeerenum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabEnumApplications; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `PeerCollabEnumApplications`(`pcendpoint` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_ENDPOINT`>?, `papplicationid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `phpeerenum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabEnumContacts; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerCollabEnumContacts`(`phpeerenum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabEnumEndpoints; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerCollabEnumEndpoints`(`pccontact` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_CONTACT`>?, `phpeerenum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabEnumObjects; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `PeerCollabEnumObjects`(`pcendpoint` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_ENDPOINT`>?, `pobjectid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `phpeerenum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabEnumPeopleNearMe; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerCollabEnumPeopleNearMe`(`phpeerenum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabExportContact; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerCollabExportContact`(`pwzpeername` : `windows_sys`.`core`.`PCWSTR`, `ppwzcontactdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabGetAppLaunchInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `PeerCollabGetAppLaunchInfo`(`pplaunchinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`PEER_APP_LAUNCH_INFO`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabGetApplicationRegistrationInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerCollabGetApplicationRegistrationInfo`(`papplicationid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `registrationtype` : `PEER_APPLICATION_REGISTRATION_TYPE`, `ppapplication` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`PEER_APPLICATION_REGISTRATION_INFO`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabGetContact; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerCollabGetContact`(`pwzpeername` : `windows_sys`.`core`.`PCWSTR`, `ppcontact` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`PEER_CONTACT`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabGetEndpointName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerCollabGetEndpointName`(`ppwzendpointname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabGetEventData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `PeerCollabGetEventData`(`hpeerevent` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppeventdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`PEER_COLLAB_EVENT_DATA`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabGetInvitationResponse; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerCollabGetInvitationResponse`(`hinvitation` : `super`.`super`.`Foundation`.`HANDLE`, `ppinvitationresponse` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`PEER_INVITATION_RESPONSE`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabGetPresenceInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `PeerCollabGetPresenceInfo`(`pcendpoint` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_ENDPOINT`>?, `pppresenceinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`PEER_PRESENCE_INFO`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabGetSigninOptions; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerCollabGetSigninOptions`(`pdwsigninoptions` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabInviteContact; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `PeerCollabInviteContact`(`pccontact` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_CONTACT`>?, `pcendpoint` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_ENDPOINT`>?, `pcinvitation` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_INVITATION`>?, `ppresponse` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`PEER_INVITATION_RESPONSE`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabInviteEndpoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `PeerCollabInviteEndpoint`(`pcendpoint` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_ENDPOINT`>?, `pcinvitation` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_INVITATION`>?, `ppresponse` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`PEER_INVITATION_RESPONSE`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabParseContact; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerCollabParseContact`(`pwzcontactdata` : `windows_sys`.`core`.`PCWSTR`, `ppcontact` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`PEER_CONTACT`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabQueryContactData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `PeerCollabQueryContactData`(`pcendpoint` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_ENDPOINT`>?, `ppwzcontactdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabRefreshEndpointData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `PeerCollabRefreshEndpointData`(`pcendpoint` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_ENDPOINT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabRegisterApplication; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerCollabRegisterApplication`(`pcapplication` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_APPLICATION_REGISTRATION_INFO`>?, `registrationtype` : `PEER_APPLICATION_REGISTRATION_TYPE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabRegisterEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerCollabRegisterEvent`(`hevent` : `super`.`super`.`Foundation`.`HANDLE`, `ceventregistration` : UInt, `peventregistrations` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_COLLAB_EVENT_REGISTRATION`>?, `phpeerevent` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabSetEndpointName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerCollabSetEndpointName`(`pwzendpointname` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabSetObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerCollabSetObject`(`pcobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_OBJECT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabSetPresenceInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerCollabSetPresenceInfo`(`pcpresenceinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_PRESENCE_INFO`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabShutdown; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerCollabShutdown`() : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabSignin; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerCollabSignin`(`hwndparent` : `super`.`super`.`Foundation`.`HWND`, `dwsigninoptions` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabSignout; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerCollabSignout`(`dwsigninoptions` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabStartup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerCollabStartup`(`wversionrequested` : UShort) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabSubscribeEndpointData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `PeerCollabSubscribeEndpointData`(`pcendpoint` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_ENDPOINT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabUnregisterApplication; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerCollabUnregisterApplication`(`papplicationid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `registrationtype` : `PEER_APPLICATION_REGISTRATION_TYPE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabUnregisterEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerCollabUnregisterEvent`(`hpeerevent` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabUnsubscribeEndpointData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `PeerCollabUnsubscribeEndpointData`(`pcendpoint` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_ENDPOINT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCollabUpdateContact; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerCollabUpdateContact`(`pcontact` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_CONTACT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerCreatePeerName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerCreatePeerName`(`pwzidentity` : `windows_sys`.`core`.`PCWSTR`, `pwzclassifier` : `windows_sys`.`core`.`PCWSTR`, `ppwzpeername` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=peerdist.dll, ABI=system, export=PeerDistClientAddContentInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `PeerDistClientAddContentInformation`(`hpeerdist` : Long, `hcontenthandle` : Long, `cbnumberofbytes` : UInt, `pbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `lpoverlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=peerdist.dll, ABI=system, export=PeerDistClientAddData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `PeerDistClientAddData`(`hpeerdist` : Long, `hcontenthandle` : Long, `cbnumberofbytes` : UInt, `pbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `lpoverlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=peerdist.dll, ABI=system, export=PeerDistClientBlockRead; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `PeerDistClientBlockRead`(`hpeerdist` : Long, `hcontenthandle` : Long, `cbmaxnumberofbytes` : UInt, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwtimeoutinmilliseconds` : UInt, `lpoverlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=peerdist.dll, ABI=system, export=PeerDistClientCancelAsyncOperation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `PeerDistClientCancelAsyncOperation`(`hpeerdist` : Long, `hcontenthandle` : Long, `poverlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=peerdist.dll, ABI=system, export=PeerDistClientCloseContent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerDistClientCloseContent`(`hpeerdist` : Long, `hcontenthandle` : Long) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=peerdist.dll, ABI=system, export=PeerDistClientCompleteContentInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `PeerDistClientCompleteContentInformation`(`hpeerdist` : Long, `hcontenthandle` : Long, `lpoverlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=peerdist.dll, ABI=system, export=PeerDistClientFlushContent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `PeerDistClientFlushContent`(`hpeerdist` : Long, `pcontenttag` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEERDIST_CONTENT_TAG`>?, `hcompletionport` : `super`.`super`.`Foundation`.`HANDLE`, `ulcompletionkey` : ULong, `lpoverlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=peerdist.dll, ABI=system, export=PeerDistClientGetInformationByHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerDistClientGetInformationByHandle`(`hpeerdist` : Long, `hcontenthandle` : Long, `peerdistclientinfoclass` : `PEERDIST_CLIENT_INFO_BY_HANDLE_CLASS`, `dwbuffersize` : UInt, `lpinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=peerdist.dll, ABI=system, export=PeerDistClientOpenContent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerDistClientOpenContent`(`hpeerdist` : Long, `pcontenttag` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEERDIST_CONTENT_TAG`>?, `hcompletionport` : `super`.`super`.`Foundation`.`HANDLE`, `ulcompletionkey` : ULong, `phcontenthandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=peerdist.dll, ABI=system, export=PeerDistClientStreamRead; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `PeerDistClientStreamRead`(`hpeerdist` : Long, `hcontenthandle` : Long, `cbmaxnumberofbytes` : UInt, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwtimeoutinmilliseconds` : UInt, `lpoverlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=peerdist.dll, ABI=system, export=PeerDistGetOverlappedResult; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `PeerDistGetOverlappedResult`(`lpoverlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?, `lpnumberofbytestransferred` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `bwait` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=peerdist.dll, ABI=system, export=PeerDistGetStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerDistGetStatus`(`hpeerdist` : Long, `ppeerdiststatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PEERDIST_STATUS`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=peerdist.dll, ABI=system, export=PeerDistGetStatusEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerDistGetStatusEx`(`hpeerdist` : Long, `ppeerdiststatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PEERDIST_STATUS_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=peerdist.dll, ABI=system, export=PeerDistRegisterForStatusChangeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `PeerDistRegisterForStatusChangeNotification`(`hpeerdist` : Long, `hcompletionport` : `super`.`super`.`Foundation`.`HANDLE`, `ulcompletionkey` : ULong, `lpoverlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?, `ppeerdiststatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PEERDIST_STATUS`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=peerdist.dll, ABI=system, export=PeerDistRegisterForStatusChangeNotificationEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `PeerDistRegisterForStatusChangeNotificationEx`(`hpeerdist` : Long, `hcompletionport` : `super`.`super`.`Foundation`.`HANDLE`, `ulcompletionkey` : ULong, `lpoverlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?, `ppeerdiststatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PEERDIST_STATUS_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=peerdist.dll, ABI=system, export=PeerDistServerCancelAsyncOperation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `PeerDistServerCancelAsyncOperation`(`hpeerdist` : Long, `cbcontentidentifier` : UInt, `pcontentidentifier` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `poverlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=peerdist.dll, ABI=system, export=PeerDistServerCloseContentInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerDistServerCloseContentInformation`(`hpeerdist` : Long, `hcontentinfo` : Long) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=peerdist.dll, ABI=system, export=PeerDistServerCloseStreamHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerDistServerCloseStreamHandle`(`hpeerdist` : Long, `hstream` : Long) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=peerdist.dll, ABI=system, export=PeerDistServerOpenContentInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerDistServerOpenContentInformation`(`hpeerdist` : Long, `cbcontentidentifier` : UInt, `pcontentidentifier` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `ullcontentoffset` : ULong, `cbcontentlength` : ULong, `hcompletionport` : `super`.`super`.`Foundation`.`HANDLE`, `ulcompletionkey` : ULong, `phcontentinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=peerdist.dll, ABI=system, export=PeerDistServerOpenContentInformationEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerDistServerOpenContentInformationEx`(`hpeerdist` : Long, `cbcontentidentifier` : UInt, `pcontentidentifier` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `ullcontentoffset` : ULong, `cbcontentlength` : ULong, `pretrievaloptions` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEERDIST_RETRIEVAL_OPTIONS`>?, `hcompletionport` : `super`.`super`.`Foundation`.`HANDLE`, `ulcompletionkey` : ULong, `phcontentinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=peerdist.dll, ABI=system, export=PeerDistServerPublishAddToStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `PeerDistServerPublishAddToStream`(`hpeerdist` : Long, `hstream` : Long, `cbnumberofbytes` : UInt, `pbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `lpoverlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=peerdist.dll, ABI=system, export=PeerDistServerPublishCompleteStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `PeerDistServerPublishCompleteStream`(`hpeerdist` : Long, `hstream` : Long, `lpoverlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=peerdist.dll, ABI=system, export=PeerDistServerPublishStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerDistServerPublishStream`(`hpeerdist` : Long, `cbcontentidentifier` : UInt, `pcontentidentifier` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbcontentlength` : ULong, `ppublishoptions` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEERDIST_PUBLICATION_OPTIONS`>?, `hcompletionport` : `super`.`super`.`Foundation`.`HANDLE`, `ulcompletionkey` : ULong, `phstream` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=peerdist.dll, ABI=system, export=PeerDistServerRetrieveContentInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `PeerDistServerRetrieveContentInformation`(`hpeerdist` : Long, `hcontentinfo` : Long, `cbmaxnumberofbytes` : UInt, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `lpoverlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=peerdist.dll, ABI=system, export=PeerDistServerUnpublish; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerDistServerUnpublish`(`hpeerdist` : Long, `cbcontentidentifier` : UInt, `pcontentidentifier` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=peerdist.dll, ABI=system, export=PeerDistShutdown; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerDistShutdown`(`hpeerdist` : Long) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=peerdist.dll, ABI=system, export=PeerDistStartup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerDistStartup`(`dwversionrequested` : UInt, `phpeerdist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `pdwsupportedversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=peerdist.dll, ABI=system, export=PeerDistUnregisterForStatusChangeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerDistUnregisterForStatusChangeNotification`(`hpeerdist` : Long) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerEndEnumeration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerEndEnumeration`(`hpeerenum` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerEnumGroups; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerEnumGroups`(`pwzidentity` : `windows_sys`.`core`.`PCWSTR`, `phpeerenum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerEnumIdentities; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerEnumIdentities`(`phpeerenum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerFreeData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerFreeData`(`pvdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGetItemCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGetItemCount`(`hpeerenum` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGetNextItem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGetNextItem`(`hpeerenum` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pppvitems` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphAddRecord; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphAddRecord`(`hgraph` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `precord` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_RECORD`>?, `precordid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphClose`(`hgraph` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphCloseDirectConnection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphCloseDirectConnection`(`hgraph` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ullconnectionid` : ULong) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphConnect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `PeerGraphConnect`(`hgraph` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwzpeerid` : `windows_sys`.`core`.`PCWSTR`, `paddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_ADDRESS`>?, `pullconnectionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphCreate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphCreate`(`pgraphproperties` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_GRAPH_PROPERTIES`>?, `pwzdatabasename` : `windows_sys`.`core`.`PCWSTR`, `psecurityinterface` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_SECURITY_INTERFACE`>?, `phgraph` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphDelete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphDelete`(`pwzgraphid` : `windows_sys`.`core`.`PCWSTR`, `pwzpeerid` : `windows_sys`.`core`.`PCWSTR`, `pwzdatabasename` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphDeleteRecord; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphDeleteRecord`(`hgraph` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `precordid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `flocal` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphEndEnumeration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphEndEnumeration`(`hpeerenum` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphEnumConnections; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphEnumConnections`(`hgraph` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwflags` : UInt, `phpeerenum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphEnumNodes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphEnumNodes`(`hgraph` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwzpeerid` : `windows_sys`.`core`.`PCWSTR`, `phpeerenum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphEnumRecords; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphEnumRecords`(`hgraph` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `precordtype` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pwzpeerid` : `windows_sys`.`core`.`PCWSTR`, `phpeerenum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphExportDatabase; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphExportDatabase`(`hgraph` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwzfilepath` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphFreeData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphFreeData`(`pvdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphGetEventData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphGetEventData`(`hpeerevent` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppeventdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`PEER_GRAPH_EVENT_DATA`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphGetItemCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphGetItemCount`(`hpeerenum` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphGetNextItem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphGetNextItem`(`hpeerenum` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pppvitems` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphGetNodeInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `PeerGraphGetNodeInfo`(`hgraph` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ullnodeid` : ULong, `ppnodeinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`PEER_NODE_INFO`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphGetProperties; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphGetProperties`(`hgraph` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppgraphproperties` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`PEER_GRAPH_PROPERTIES`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphGetRecord; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphGetRecord`(`hgraph` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `precordid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pprecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`PEER_RECORD`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphGetStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphGetStatus`(`hgraph` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pdwstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphImportDatabase; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphImportDatabase`(`hgraph` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwzfilepath` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphListen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphListen`(`hgraph` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwscope` : UInt, `dwscopeid` : UInt, `wport` : UShort) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphOpen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphOpen`(`pwzgraphid` : `windows_sys`.`core`.`PCWSTR`, `pwzpeerid` : `windows_sys`.`core`.`PCWSTR`, `pwzdatabasename` : `windows_sys`.`core`.`PCWSTR`, `psecurityinterface` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_SECURITY_INTERFACE`>?, `crecordtypesyncprecedence` : UInt, `precordtypesyncprecedence` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `phgraph` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphOpenDirectConnection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `PeerGraphOpenDirectConnection`(`hgraph` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwzpeerid` : `windows_sys`.`core`.`PCWSTR`, `paddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_ADDRESS`>?, `pullconnectionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphPeerTimeToUniversalTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphPeerTimeToUniversalTime`(`hgraph` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pftpeertime` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?, `pftuniversaltime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphRegisterEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphRegisterEvent`(`hgraph` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `hevent` : `super`.`super`.`Foundation`.`HANDLE`, `ceventregistrations` : UInt, `peventregistrations` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_GRAPH_EVENT_REGISTRATION`>?, `phpeerevent` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphSearchRecords; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphSearchRecords`(`hgraph` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwzcriteria` : `windows_sys`.`core`.`PCWSTR`, `phpeerenum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphSendData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphSendData`(`hgraph` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ullconnectionid` : ULong, `ptype` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `cbdata` : UInt, `pvdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphSetNodeAttributes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphSetNodeAttributes`(`hgraph` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwzattributes` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphSetPresence; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphSetPresence`(`hgraph` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fpresent` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphSetProperties; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphSetProperties`(`hgraph` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pgraphproperties` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_GRAPH_PROPERTIES`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphShutdown; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphShutdown`() : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphStartup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphStartup`(`wversionrequested` : UShort, `pversiondata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PEER_VERSION_DATA`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphUniversalTimeToPeerTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphUniversalTimeToPeerTime`(`hgraph` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pftuniversaltime` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?, `pftpeertime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphUnregisterEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphUnregisterEvent`(`hpeerevent` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphUpdateRecord; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphUpdateRecord`(`hgraph` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `precord` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_RECORD`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2pgraph.dll, ABI=system, export=PeerGraphValidateDeferredRecords; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGraphValidateDeferredRecords`(`hgraph` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `crecordids` : UInt, `precordids` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupAddRecord; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupAddRecord`(`hgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `precord` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_RECORD`>?, `precordid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupClose`(`hgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupCloseDirectConnection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupCloseDirectConnection`(`hgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ullconnectionid` : ULong) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupConnect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupConnect`(`hgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupConnectByAddress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `PeerGroupConnectByAddress`(`hgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `caddresses` : UInt, `paddresses` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_ADDRESS`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupCreate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupCreate`(`pproperties` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_GROUP_PROPERTIES`>?, `phgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupCreateInvitation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupCreateInvitation`(`hgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwzidentityinfo` : `windows_sys`.`core`.`PCWSTR`, `pftexpiration` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?, `croles` : UInt, `proles` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppwzinvitation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupCreatePasswordInvitation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupCreatePasswordInvitation`(`hgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppwzinvitation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupDelete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupDelete`(`pwzidentity` : `windows_sys`.`core`.`PCWSTR`, `pwzgrouppeername` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupDeleteRecord; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupDeleteRecord`(`hgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `precordid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupEnumConnections; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupEnumConnections`(`hgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwflags` : UInt, `phpeerenum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupEnumMembers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupEnumMembers`(`hgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwflags` : UInt, `pwzidentity` : `windows_sys`.`core`.`PCWSTR`, `phpeerenum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupEnumRecords; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupEnumRecords`(`hgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `precordtype` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `phpeerenum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupExportConfig; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupExportConfig`(`hgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwzpassword` : `windows_sys`.`core`.`PCWSTR`, `ppwzxml` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupExportDatabase; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupExportDatabase`(`hgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwzfilepath` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupGetEventData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupGetEventData`(`hpeerevent` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppeventdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`PEER_GROUP_EVENT_DATA`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupGetProperties; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupGetProperties`(`hgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppproperties` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`PEER_GROUP_PROPERTIES`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupGetRecord; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupGetRecord`(`hgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `precordid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pprecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`PEER_RECORD`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupGetStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupGetStatus`(`hgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pdwstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupImportConfig; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupImportConfig`(`pwzxml` : `windows_sys`.`core`.`PCWSTR`, `pwzpassword` : `windows_sys`.`core`.`PCWSTR`, `foverwrite` : `windows_sys`.`core`.`BOOL`, `ppwzidentity` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `ppwzgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupImportDatabase; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupImportDatabase`(`hgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwzfilepath` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupIssueCredentials; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
public external fun `PeerGroupIssueCredentials`(`hgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwzsubjectidentity` : `windows_sys`.`core`.`PCWSTR`, `pcredentialinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_CREDENTIAL_INFO`>?, `dwflags` : UInt, `ppwzinvitation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupJoin; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupJoin`(`pwzidentity` : `windows_sys`.`core`.`PCWSTR`, `pwzinvitation` : `windows_sys`.`core`.`PCWSTR`, `pwzcloud` : `windows_sys`.`core`.`PCWSTR`, `phgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupOpen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupOpen`(`pwzidentity` : `windows_sys`.`core`.`PCWSTR`, `pwzgrouppeername` : `windows_sys`.`core`.`PCWSTR`, `pwzcloud` : `windows_sys`.`core`.`PCWSTR`, `phgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupOpenDirectConnection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `PeerGroupOpenDirectConnection`(`hgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwzidentity` : `windows_sys`.`core`.`PCWSTR`, `paddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_ADDRESS`>?, `pullconnectionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupParseInvitation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
public external fun `PeerGroupParseInvitation`(`pwzinvitation` : `windows_sys`.`core`.`PCWSTR`, `ppinvitationinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`PEER_INVITATION_INFO`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupPasswordJoin; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupPasswordJoin`(`pwzidentity` : `windows_sys`.`core`.`PCWSTR`, `pwzinvitation` : `windows_sys`.`core`.`PCWSTR`, `pwzpassword` : `windows_sys`.`core`.`PCWSTR`, `pwzcloud` : `windows_sys`.`core`.`PCWSTR`, `phgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupPeerTimeToUniversalTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupPeerTimeToUniversalTime`(`hgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pftpeertime` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?, `pftuniversaltime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupRegisterEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupRegisterEvent`(`hgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `hevent` : `super`.`super`.`Foundation`.`HANDLE`, `ceventregistration` : UInt, `peventregistrations` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_GROUP_EVENT_REGISTRATION`>?, `phpeerevent` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupResumePasswordAuthentication; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupResumePasswordAuthentication`(`hgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `hpeereventhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupSearchRecords; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupSearchRecords`(`hgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwzcriteria` : `windows_sys`.`core`.`PCWSTR`, `phpeerenum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupSendData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupSendData`(`hgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ullconnectionid` : ULong, `ptype` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `cbdata` : UInt, `pvdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupSetProperties; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupSetProperties`(`hgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pproperties` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_GROUP_PROPERTIES`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupShutdown; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupShutdown`() : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupStartup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupStartup`(`wversionrequested` : UShort, `pversiondata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PEER_VERSION_DATA`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupUniversalTimeToPeerTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupUniversalTimeToPeerTime`(`hgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pftuniversaltime` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?, `pftpeertime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupUnregisterEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupUnregisterEvent`(`hpeerevent` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerGroupUpdateRecord; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerGroupUpdateRecord`(`hgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `precord` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_RECORD`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerHostNameToPeerName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerHostNameToPeerName`(`pwzhostname` : `windows_sys`.`core`.`PCWSTR`, `ppwzpeername` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerIdentityCreate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerIdentityCreate`(`pwzclassifier` : `windows_sys`.`core`.`PCWSTR`, `pwzfriendlyname` : `windows_sys`.`core`.`PCWSTR`, `hcryptprov` : ULong, `ppwzidentity` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerIdentityDelete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerIdentityDelete`(`pwzidentity` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerIdentityExport; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerIdentityExport`(`pwzidentity` : `windows_sys`.`core`.`PCWSTR`, `pwzpassword` : `windows_sys`.`core`.`PCWSTR`, `ppwzexportxml` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerIdentityGetCryptKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerIdentityGetCryptKey`(`pwzidentity` : `windows_sys`.`core`.`PCWSTR`, `phcryptprov` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerIdentityGetDefault; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerIdentityGetDefault`(`ppwzpeername` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerIdentityGetFriendlyName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerIdentityGetFriendlyName`(`pwzidentity` : `windows_sys`.`core`.`PCWSTR`, `ppwzfriendlyname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerIdentityGetXML; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerIdentityGetXML`(`pwzidentity` : `windows_sys`.`core`.`PCWSTR`, `ppwzidentityxml` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerIdentityImport; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerIdentityImport`(`pwzimportxml` : `windows_sys`.`core`.`PCWSTR`, `pwzpassword` : `windows_sys`.`core`.`PCWSTR`, `ppwzidentity` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerIdentitySetFriendlyName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerIdentitySetFriendlyName`(`pwzidentity` : `windows_sys`.`core`.`PCWSTR`, `pwzfriendlyname` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerNameToPeerHostName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerNameToPeerHostName`(`pwzpeername` : `windows_sys`.`core`.`PCWSTR`, `ppwzhostname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerPnrpEndResolve; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerPnrpEndResolve`(`hresolve` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerPnrpGetCloudInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerPnrpGetCloudInfo`(`pcnumclouds` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppcloudinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`PEER_PNRP_CLOUD_INFO`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerPnrpGetEndpoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `PeerPnrpGetEndpoint`(`hresolve` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppendpoint` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`PEER_PNRP_ENDPOINT_INFO`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerPnrpRegister; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `PeerPnrpRegister`(`pcwzpeername` : `windows_sys`.`core`.`PCWSTR`, `pregistrationinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_PNRP_REGISTRATION_INFO`>?, `phregistration` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerPnrpResolve; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `PeerPnrpResolve`(`pcwzpeername` : `windows_sys`.`core`.`PCWSTR`, `pcwzcloudname` : `windows_sys`.`core`.`PCWSTR`, `pcendpoints` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppendpoints` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`PEER_PNRP_ENDPOINT_INFO`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerPnrpShutdown; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerPnrpShutdown`() : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerPnrpStartResolve; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerPnrpStartResolve`(`pcwzpeername` : `windows_sys`.`core`.`PCWSTR`, `pcwzcloudname` : `windows_sys`.`core`.`PCWSTR`, `cmaxendpoints` : UInt, `hevent` : `super`.`super`.`Foundation`.`HANDLE`, `phresolve` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerPnrpStartup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerPnrpStartup`(`wversionrequested` : UShort) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerPnrpUnregister; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeerPnrpUnregister`(`hregistration` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=p2p.dll, ABI=system, export=PeerPnrpUpdateRegistration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `PeerPnrpUpdateRegistration`(`hregistration` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pregistrationinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_PNRP_REGISTRATION_INFO`>?) : `windows_sys`.`core`.`HRESULT`
public const val `DRT_ACTIVE`: `DRT_STATUS` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DRT_ADDRESS` (
    public var `socketAddress`: `super`.`super`.`Networking`.`WinSock`.`SOCKADDR_STORAGE`,
    public var `flags`: UInt,
    public var `nearness`: Int,
    public var `latency`: UInt,
)
public typealias `DRT_ADDRESS_FLAGS` = Int;
public const val `DRT_ADDRESS_FLAG_ACCEPTED`: `DRT_ADDRESS_FLAGS` = 1;
public const val `DRT_ADDRESS_FLAG_BAD_VALIDATE_ID`: `DRT_ADDRESS_FLAGS` = 32;
public const val `DRT_ADDRESS_FLAG_INQUIRE`: `DRT_ADDRESS_FLAGS` = 128;
public const val `DRT_ADDRESS_FLAG_LOOP`: `DRT_ADDRESS_FLAGS` = 8;
public const val `DRT_ADDRESS_FLAG_REJECTED`: `DRT_ADDRESS_FLAGS` = 2;
public const val `DRT_ADDRESS_FLAG_SUSPECT_UNREGISTERED_ID`: `DRT_ADDRESS_FLAGS` = 64;
public const val `DRT_ADDRESS_FLAG_TOO_BUSY`: `DRT_ADDRESS_FLAGS` = 16;
public const val `DRT_ADDRESS_FLAG_UNREACHABLE`: `DRT_ADDRESS_FLAGS` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRT_ADDRESS_LIST` (
    public var `AddressCount`: UInt,
    public var `AddressList`: Array<`DRT_ADDRESS`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DRT_ADDRESS_LIST`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `DRT_ADDRESS_LIST`.Companion.`default`() : `DRT_ADDRESS_LIST` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `DRT_ALONE`: `DRT_STATUS` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRT_BOOTSTRAP_PROVIDER` (
    public var `pvContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Attach`: Long,
    public var `Detach`: Long,
    public var `InitResolve`: Long,
    public var `IssueResolve`: Long,
    public var `EndResolve`: Long,
    public var `Register`: Long,
    public var `Unregister`: Long,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DRT_BOOTSTRAP_PROVIDER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DRT_BOOTSTRAP_PROVIDER`.Companion.`default`() : `DRT_BOOTSTRAP_PROVIDER` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public typealias `DRT_BOOTSTRAP_RESOLVE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`HRESULT`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Networking`.`WinSock`.`SOCKET_ADDRESS_LIST`>?, `windows_sys`.`core`.`BOOL`) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRT_DATA` (
    public var `cb`: UInt,
    public var `pb`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DRT_DATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DRT_DATA`.Companion.`default`() : `DRT_DATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRT_EVENT_DATA` (
    public var `type`: `DRT_EVENT_TYPE`,
    public var `hr`: `windows_sys`.`core`.`HRESULT`,
    public var `pvContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Anonymous`: `DRT_EVENT_DATA_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DRT_EVENT_DATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `DRT_EVENT_DATA`.Companion.`default`() : `DRT_EVENT_DATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 322:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union DRT_EVENT_DATA_0 {
//     pub leafsetKeyChange: DRT_EVENT_DATA_0_0,
//     pub registrationStateChange: DRT_EVENT_DATA_0_1,
//     pub statusChange: DRT_EVENT_DATA_0_2,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DRT_EVENT_DATA_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `DRT_EVENT_DATA_0`.Companion.`default`() : `DRT_EVENT_DATA_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DRT_EVENT_DATA_0_0` (
    public var `change`: `DRT_LEAFSET_KEY_CHANGE_TYPE`,
    public var `localKey`: `DRT_DATA`,
    public var `remoteKey`: `DRT_DATA`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DRT_EVENT_DATA_0_1` (
    public var `state`: `DRT_REGISTRATION_STATE`,
    public var `localKey`: `DRT_DATA`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DRT_EVENT_DATA_0_2` (
    public var `status`: `DRT_STATUS`,
    public var `bootstrapAddresses`: `DRT_EVENT_DATA_0_2_0`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRT_EVENT_DATA_0_2_0` (
    public var `cntAddress`: UInt,
    public var `pAddresses`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Networking`.`WinSock`.`SOCKADDR_STORAGE`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DRT_EVENT_DATA_0_2_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `DRT_EVENT_DATA_0_2_0`.Companion.`default`() : `DRT_EVENT_DATA_0_2_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `DRT_EVENT_LEAFSET_KEY_CHANGED`: `DRT_EVENT_TYPE` = 1;
public const val `DRT_EVENT_REGISTRATION_STATE_CHANGED`: `DRT_EVENT_TYPE` = 2;
public const val `DRT_EVENT_STATUS_CHANGED`: `DRT_EVENT_TYPE` = 0;
public typealias `DRT_EVENT_TYPE` = Int;
public const val `DRT_E_BOOTSTRAPPROVIDER_IN_USE`: Int = -2141052914;
public const val `DRT_E_BOOTSTRAPPROVIDER_NOT_ATTACHED`: Int = -2141052913;
public const val `DRT_E_CAPABILITY_MISMATCH`: Int = -2141052657;
public const val `DRT_E_DUPLICATE_KEY`: Int = -2141052919;
public const val `DRT_E_FAULTED`: Int = -2141052662;
public const val `DRT_E_INSUFFICIENT_BUFFER`: Int = -2141052660;
public const val `DRT_E_INVALID_ADDRESS`: Int = -2141052923;
public const val `DRT_E_INVALID_BOOTSTRAP_PROVIDER`: Int = -2141052924;
public const val `DRT_E_INVALID_CERT_CHAIN`: Int = -2141057020;
public const val `DRT_E_INVALID_INSTANCE_PREFIX`: Int = -2141052659;
public const val `DRT_E_INVALID_KEY`: Int = -2141057015;
public const val `DRT_E_INVALID_KEY_SIZE`: Int = -2141057022;
public const val `DRT_E_INVALID_MAX_ADDRESSES`: Int = -2141057017;
public const val `DRT_E_INVALID_MAX_ENDPOINTS`: Int = -2141057007;
public const val `DRT_E_INVALID_MESSAGE`: Int = -2141057019;
public const val `DRT_E_INVALID_PORT`: Int = -2141052928;
public const val `DRT_E_INVALID_SCOPE`: Int = -2141052922;
public const val `DRT_E_INVALID_SEARCH_INFO`: Int = -2141052663;
public const val `DRT_E_INVALID_SEARCH_RANGE`: Int = -2141057006;
public const val `DRT_E_INVALID_SECURITY_MODE`: Int = -2141052658;
public const val `DRT_E_INVALID_SECURITY_PROVIDER`: Int = -2141052926;
public const val `DRT_E_INVALID_SETTINGS`: Int = -2141052664;
public const val `DRT_E_INVALID_TRANSPORT_PROVIDER`: Int = -2141052927;
public const val `DRT_E_NO_ADDRESSES_AVAILABLE`: Int = -2141052920;
public const val `DRT_E_NO_MORE`: Int = -2141057018;
public const val `DRT_E_SEARCH_IN_PROGRESS`: Int = -2141057016;
public const val `DRT_E_SECURITYPROVIDER_IN_USE`: Int = -2141052916;
public const val `DRT_E_SECURITYPROVIDER_NOT_ATTACHED`: Int = -2141052915;
public const val `DRT_E_STILL_IN_USE`: Int = -2141052925;
public const val `DRT_E_TIMEOUT`: Int = -2141057023;
public const val `DRT_E_TRANSPORTPROVIDER_IN_USE`: Int = -2141052918;
public const val `DRT_E_TRANSPORTPROVIDER_NOT_ATTACHED`: Int = -2141052917;
public const val `DRT_E_TRANSPORT_ALREADY_BOUND`: Int = -2141052671;
public const val `DRT_E_TRANSPORT_ALREADY_EXISTS_FOR_SCOPE`: Int = -2141052665;
public const val `DRT_E_TRANSPORT_EXECUTING_CALLBACK`: Int = -2141052666;
public const val `DRT_E_TRANSPORT_INVALID_ARGUMENT`: Int = -2141052668;
public const val `DRT_E_TRANSPORT_NOT_BOUND`: Int = -2141052670;
public const val `DRT_E_TRANSPORT_NO_DEST_ADDRESSES`: Int = -2141052667;
public const val `DRT_E_TRANSPORT_SHUTTING_DOWN`: Int = -2141052921;
public const val `DRT_E_TRANSPORT_STILL_BOUND`: Int = -2141052661;
public const val `DRT_E_TRANSPORT_UNEXPECTED`: Int = -2141052669;
public const val `DRT_FAULTED`: `DRT_STATUS` = 20;
public const val `DRT_GLOBAL_SCOPE`: `DRT_SCOPE` = 1;
public const val `DRT_LEAFSET_KEY_ADDED`: `DRT_LEAFSET_KEY_CHANGE_TYPE` = 0;
public typealias `DRT_LEAFSET_KEY_CHANGE_TYPE` = Int;
public const val `DRT_LEAFSET_KEY_DELETED`: `DRT_LEAFSET_KEY_CHANGE_TYPE` = 1;
public const val `DRT_LINK_LOCAL_ISATAP_SCOPEID`: UInt = 4294967295u;
public const val `DRT_LINK_LOCAL_SCOPE`: `DRT_SCOPE` = 3;
public const val `DRT_MATCH_EXACT`: `DRT_MATCH_TYPE` = 0;
public const val `DRT_MATCH_INTERMEDIATE`: `DRT_MATCH_TYPE` = 2;
public const val `DRT_MATCH_NEAR`: `DRT_MATCH_TYPE` = 1;
public typealias `DRT_MATCH_TYPE` = Int;
public const val `DRT_MAX_INSTANCE_PREFIX_LEN`: UInt = 128u;
public const val `DRT_MAX_PAYLOAD_SIZE`: UInt = 5120u;
public const val `DRT_MAX_ROUTING_ADDRESSES`: UInt = 20u;
public const val `DRT_MIN_ROUTING_ADDRESSES`: UInt = 1u;
public const val `DRT_NO_NETWORK`: `DRT_STATUS` = 10;
public const val `DRT_PAYLOAD_REVOKED`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DRT_REGISTRATION` (
    public var `key`: `DRT_DATA`,
    public var `appData`: `DRT_DATA`,
)
public typealias `DRT_REGISTRATION_STATE` = Int;
public const val `DRT_REGISTRATION_STATE_UNRESOLVEABLE`: `DRT_REGISTRATION_STATE` = 1;
public typealias `DRT_SCOPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRT_SEARCH_INFO` (
    public var `dwSize`: UInt,
    public var `fIterative`: `windows_sys`.`core`.`BOOL`,
    public var `fAllowCurrentInstanceMatch`: `windows_sys`.`core`.`BOOL`,
    public var `fAnyMatchInRange`: `windows_sys`.`core`.`BOOL`,
    public var `cMaxEndpoints`: UInt,
    public var `pMaximumKey`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DRT_DATA`>?,
    public var `pMinimumKey`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DRT_DATA`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DRT_SEARCH_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DRT_SEARCH_INFO`.Companion.`default`() : `DRT_SEARCH_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRT_SEARCH_RESULT` (
    public var `dwSize`: UInt,
    public var `type`: `DRT_MATCH_TYPE`,
    public var `pvContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `registration`: `DRT_REGISTRATION`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DRT_SEARCH_RESULT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DRT_SEARCH_RESULT`.Companion.`default`() : `DRT_SEARCH_RESULT` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `DRT_SECURE_CONFIDENTIALPAYLOAD`: `DRT_SECURITY_MODE` = 2;
public const val `DRT_SECURE_MEMBERSHIP`: `DRT_SECURITY_MODE` = 1;
public const val `DRT_SECURE_RESOLVE`: `DRT_SECURITY_MODE` = 0;
public typealias `DRT_SECURITY_MODE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRT_SECURITY_PROVIDER` (
    public var `pvContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Attach`: Long,
    public var `Detach`: Long,
    public var `RegisterKey`: Long,
    public var `UnregisterKey`: Long,
    public var `ValidateAndUnpackPayload`: Long,
    public var `SecureAndPackPayload`: Long,
    public var `FreeData`: Long,
    public var `EncryptData`: Long,
    public var `DecryptData`: Long,
    public var `GetSerializedCredential`: Long,
    public var `ValidateRemoteCredential`: Long,
    public var `SignData`: Long,
    public var `VerifyData`: Long,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DRT_SECURITY_PROVIDER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DRT_SECURITY_PROVIDER`.Companion.`default`() : `DRT_SECURITY_PROVIDER` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRT_SETTINGS` (
    public var `dwSize`: UInt,
    public var `cbKey`: UInt,
    public var `bProtocolMajorVersion`: UByte,
    public var `bProtocolMinorVersion`: UByte,
    public var `ulMaxRoutingAddresses`: UInt,
    public var `pwzDrtInstancePrefix`: `windows_sys`.`core`.`PWSTR`,
    public var `hTransport`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pSecurityProvider`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DRT_SECURITY_PROVIDER`>?,
    public var `pBootstrapProvider`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DRT_BOOTSTRAP_PROVIDER`>?,
    public var `eSecurityMode`: `DRT_SECURITY_MODE`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DRT_SETTINGS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DRT_SETTINGS`.Companion.`default`() : `DRT_SETTINGS` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `DRT_SITE_LOCAL_SCOPE`: `DRT_SCOPE` = 2;
public typealias `DRT_STATUS` = Int;
public const val `DRT_S_RETRY`: Int = 6426640;
public const val `FACILITY_DRT`: UInt = 98u;
public const val `MaximumPeerDistClientInfoByHandlesClass`: `PEERDIST_CLIENT_INFO_BY_HANDLE_CLASS` = 1;
public const val `NS_PNRPCLOUD`: UInt = 39u;
public const val `NS_PNRPNAME`: UInt = 38u;
// UNSUPPORTED Rust 524:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const NS_PROVIDER_PNRPCLOUD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03fe89ce_766d_4976_b9c1_bb9bc42c7b4d);

// UNSUPPORTED Rust 525:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const NS_PROVIDER_PNRPNAME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03fe89cd_766d_4976_b9c1_bb9bc42c7b4d);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PEERDIST_CLIENT_BASIC_INFO` (
    public var `fFlashCrowd`: `windows_sys`.`core`.`BOOL`,
)
public typealias `PEERDIST_CLIENT_INFO_BY_HANDLE_CLASS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEERDIST_CONTENT_TAG` (
    public var `Data`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEERDIST_CONTENT_TAG`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PEERDIST_CONTENT_TAG`.Companion.`default`() : `PEERDIST_CONTENT_TAG` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PEERDIST_PUBLICATION_OPTIONS` (
    public var `dwVersion`: UInt,
    public var `dwFlags`: UInt,
)
public const val `PEERDIST_PUBLICATION_OPTIONS_VERSION`: Int = 2;
public const val `PEERDIST_PUBLICATION_OPTIONS_VERSION_1`: Int = 1;
public const val `PEERDIST_PUBLICATION_OPTIONS_VERSION_2`: Int = 2;
public const val `PEERDIST_READ_TIMEOUT_DEFAULT`: UInt = 4294967294u;
public const val `PEERDIST_READ_TIMEOUT_LOCAL_CACHE_ONLY`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PEERDIST_RETRIEVAL_OPTIONS` (
    public var `cbSize`: UInt,
    public var `dwContentInfoMinVersion`: UInt,
    public var `dwContentInfoMaxVersion`: UInt,
    public var `dwReserved`: UInt,
)
public const val `PEERDIST_RETRIEVAL_OPTIONS_CONTENTINFO_VERSION`: `PEERDIST_RETRIEVAL_OPTIONS_CONTENTINFO_VERSION_VALUE` = 2u;
public const val `PEERDIST_RETRIEVAL_OPTIONS_CONTENTINFO_VERSION_1`: `PEERDIST_RETRIEVAL_OPTIONS_CONTENTINFO_VERSION_VALUE` = 1u;
public const val `PEERDIST_RETRIEVAL_OPTIONS_CONTENTINFO_VERSION_2`: `PEERDIST_RETRIEVAL_OPTIONS_CONTENTINFO_VERSION_VALUE` = 2u;
public typealias `PEERDIST_RETRIEVAL_OPTIONS_CONTENTINFO_VERSION_VALUE` = UInt;
public typealias `PEERDIST_STATUS` = Int;
public const val `PEERDIST_STATUS_AVAILABLE`: `PEERDIST_STATUS` = 2;
public const val `PEERDIST_STATUS_DISABLED`: `PEERDIST_STATUS` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PEERDIST_STATUS_INFO` (
    public var `cbSize`: UInt,
    public var `status`: `PEERDIST_STATUS`,
    public var `dwMinVer`: `PEERDIST_RETRIEVAL_OPTIONS_CONTENTINFO_VERSION_VALUE`,
    public var `dwMaxVer`: `PEERDIST_RETRIEVAL_OPTIONS_CONTENTINFO_VERSION_VALUE`,
)
public const val `PEERDIST_STATUS_UNAVAILABLE`: `PEERDIST_STATUS` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_ADDRESS` (
    public var `dwSize`: UInt,
    public var `sin6`: `super`.`super`.`Networking`.`WinSock`.`SOCKADDR_IN6`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_ADDRESS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `PEER_ADDRESS`.Companion.`default`() : `PEER_ADDRESS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_APPLICATION` (
    public var `id`: `windows_sys`.`core`.`GUID`,
    public var `data`: `PEER_DATA`,
    public var `pwzDescription`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_APPLICATION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PEER_APPLICATION`.Companion.`default`() : `PEER_APPLICATION` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `PEER_APPLICATION_ALL_USERS`: `PEER_APPLICATION_REGISTRATION_TYPE` = 1;
public const val `PEER_APPLICATION_CURRENT_USER`: `PEER_APPLICATION_REGISTRATION_TYPE` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_APPLICATION_REGISTRATION_INFO` (
    public var `application`: `PEER_APPLICATION`,
    public var `pwzApplicationToLaunch`: `windows_sys`.`core`.`PWSTR`,
    public var `pwzApplicationArguments`: `windows_sys`.`core`.`PWSTR`,
    public var `dwPublicationScope`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_APPLICATION_REGISTRATION_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PEER_APPLICATION_REGISTRATION_INFO`.Companion.`default`() : `PEER_APPLICATION_REGISTRATION_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `PEER_APPLICATION_REGISTRATION_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_APP_LAUNCH_INFO` (
    public var `pContact`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PEER_CONTACT`>?,
    public var `pEndpoint`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PEER_ENDPOINT`>?,
    public var `pInvitation`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PEER_INVITATION`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_APP_LAUNCH_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `PEER_APP_LAUNCH_INFO`.Companion.`default`() : `PEER_APP_LAUNCH_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `PEER_CHANGE_ADDED`: `PEER_CHANGE_TYPE` = 0;
public const val `PEER_CHANGE_DELETED`: `PEER_CHANGE_TYPE` = 1;
public typealias `PEER_CHANGE_TYPE` = Int;
public const val `PEER_CHANGE_UPDATED`: `PEER_CHANGE_TYPE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_COLLAB_EVENT_DATA` (
    public var `eventType`: `PEER_COLLAB_EVENT_TYPE`,
    public var `Anonymous`: `PEER_COLLAB_EVENT_DATA_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_COLLAB_EVENT_DATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `PEER_COLLAB_EVENT_DATA`.Companion.`default`() : `PEER_COLLAB_EVENT_DATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 649:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union PEER_COLLAB_EVENT_DATA_0 {
//     pub watchListChangedData: PEER_EVENT_WATCHLIST_CHANGED_DATA,
//     pub presenceChangedData: PEER_EVENT_PRESENCE_CHANGED_DATA,
//     pub applicationChangedData: PEER_EVENT_APPLICATION_CHANGED_DATA,
//     pub objectChangedData: PEER_EVENT_OBJECT_CHANGED_DATA,
//     pub endpointChangedData: PEER_EVENT_ENDPOINT_CHANGED_DATA,
//     pub peopleNearMeChangedData: PEER_EVENT_PEOPLE_NEAR_ME_CHANGED_DATA,
//     pub requestStatusChangedData: PEER_EVENT_REQUEST_STATUS_CHANGED_DATA,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_COLLAB_EVENT_DATA_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `PEER_COLLAB_EVENT_DATA_0`.Companion.`default`() : `PEER_COLLAB_EVENT_DATA_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_COLLAB_EVENT_REGISTRATION` (
    public var `eventType`: `PEER_COLLAB_EVENT_TYPE`,
    public var `pInstance`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_COLLAB_EVENT_REGISTRATION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PEER_COLLAB_EVENT_REGISTRATION`.Companion.`default`() : `PEER_COLLAB_EVENT_REGISTRATION` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `PEER_COLLAB_EVENT_TYPE` = Int;
// UNSUPPORTED Rust 679:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PEER_COLLAB_OBJECTID_USER_PICTURE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdd15f41f_fc4e_4922_b035_4c06a754d01d);

public const val `PEER_CONNECTED`: `PEER_CONNECTION_STATUS` = 1;
public const val `PEER_CONNECTION_DIRECT`: `PEER_CONNECTION_FLAGS` = 2;
public const val `PEER_CONNECTION_FAILED`: `PEER_CONNECTION_STATUS` = 3;
public typealias `PEER_CONNECTION_FLAGS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_CONNECTION_INFO` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `ullConnectionId`: ULong,
    public var `ullNodeId`: ULong,
    public var `pwzPeerId`: `windows_sys`.`core`.`PWSTR`,
    public var `address`: `PEER_ADDRESS`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_CONNECTION_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `PEER_CONNECTION_INFO`.Companion.`default`() : `PEER_CONNECTION_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `PEER_CONNECTION_NEIGHBOR`: `PEER_CONNECTION_FLAGS` = 1;
public typealias `PEER_CONNECTION_STATUS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_CONTACT` (
    public var `pwzPeerName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwzNickName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwzDisplayName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwzEmailAddress`: `windows_sys`.`core`.`PWSTR`,
    public var `fWatch`: `windows_sys`.`core`.`BOOL`,
    public var `WatcherPermissions`: `PEER_WATCH_PERMISSION`,
    public var `credentials`: `PEER_DATA`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_CONTACT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PEER_CONTACT`.Companion.`default`() : `PEER_CONTACT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_CREDENTIAL_INFO` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `pwzFriendlyName`: `windows_sys`.`core`.`PWSTR`,
    public var `pPublicKey`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`Cryptography`.`CERT_PUBLIC_KEY_INFO`>?,
    public var `pwzIssuerPeerName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwzIssuerFriendlyName`: `windows_sys`.`core`.`PWSTR`,
    public var `ftValidityStart`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `ftValidityEnd`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `cRoles`: UInt,
    public var `pRoles`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_CREDENTIAL_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]

    public fun `PEER_CREDENTIAL_INFO`.Companion.`default`() : `PEER_CREDENTIAL_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_DATA` (
    public var `cbData`: UInt,
    public var `pbData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_DATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PEER_DATA`.Companion.`default`() : `PEER_DATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `PEER_DEFER_EXPIRATION`: `PEER_GROUP_PROPERTY_FLAGS` = 4;
public const val `PEER_DISABLE_PRESENCE`: `PEER_GROUP_PROPERTY_FLAGS` = 2;
public const val `PEER_DISCONNECTED`: `PEER_CONNECTION_STATUS` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_ENDPOINT` (
    public var `address`: `PEER_ADDRESS`,
    public var `pwzEndpointName`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_ENDPOINT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `PEER_ENDPOINT`.Companion.`default`() : `PEER_ENDPOINT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_EVENT_APPLICATION_CHANGED_DATA` (
    public var `pContact`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PEER_CONTACT`>?,
    public var `pEndpoint`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PEER_ENDPOINT`>?,
    public var `changeType`: `PEER_CHANGE_TYPE`,
    public var `pApplication`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PEER_APPLICATION`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_EVENT_APPLICATION_CHANGED_DATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `PEER_EVENT_APPLICATION_CHANGED_DATA`.Companion.`default`() : `PEER_EVENT_APPLICATION_CHANGED_DATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PEER_EVENT_CONNECTION_CHANGE_DATA` (
    public var `dwSize`: UInt,
    public var `status`: `PEER_CONNECTION_STATUS`,
    public var `ullConnectionId`: ULong,
    public var `ullNodeId`: ULong,
    public var `ullNextConnectionId`: ULong,
    public var `hrConnectionFailedReason`: `windows_sys`.`core`.`HRESULT`,
)
public const val `PEER_EVENT_ENDPOINT_APPLICATION_CHANGED`: `PEER_COLLAB_EVENT_TYPE` = 4;
public const val `PEER_EVENT_ENDPOINT_CHANGED`: `PEER_COLLAB_EVENT_TYPE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_EVENT_ENDPOINT_CHANGED_DATA` (
    public var `pContact`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PEER_CONTACT`>?,
    public var `pEndpoint`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PEER_ENDPOINT`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_EVENT_ENDPOINT_CHANGED_DATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `PEER_EVENT_ENDPOINT_CHANGED_DATA`.Companion.`default`() : `PEER_EVENT_ENDPOINT_CHANGED_DATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `PEER_EVENT_ENDPOINT_OBJECT_CHANGED`: `PEER_COLLAB_EVENT_TYPE` = 5;
public const val `PEER_EVENT_ENDPOINT_PRESENCE_CHANGED`: `PEER_COLLAB_EVENT_TYPE` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PEER_EVENT_INCOMING_DATA` (
    public var `dwSize`: UInt,
    public var `ullConnectionId`: ULong,
    public var `type`: `windows_sys`.`core`.`GUID`,
    public var `data`: `PEER_DATA`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_EVENT_MEMBER_CHANGE_DATA` (
    public var `dwSize`: UInt,
    public var `changeType`: `PEER_MEMBER_CHANGE_TYPE`,
    public var `pwzIdentity`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_EVENT_MEMBER_CHANGE_DATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PEER_EVENT_MEMBER_CHANGE_DATA`.Companion.`default`() : `PEER_EVENT_MEMBER_CHANGE_DATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `PEER_EVENT_MY_APPLICATION_CHANGED`: `PEER_COLLAB_EVENT_TYPE` = 8;
public const val `PEER_EVENT_MY_ENDPOINT_CHANGED`: `PEER_COLLAB_EVENT_TYPE` = 6;
public const val `PEER_EVENT_MY_OBJECT_CHANGED`: `PEER_COLLAB_EVENT_TYPE` = 9;
public const val `PEER_EVENT_MY_PRESENCE_CHANGED`: `PEER_COLLAB_EVENT_TYPE` = 7;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_EVENT_NODE_CHANGE_DATA` (
    public var `dwSize`: UInt,
    public var `changeType`: `PEER_NODE_CHANGE_TYPE`,
    public var `ullNodeId`: ULong,
    public var `pwzPeerId`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_EVENT_NODE_CHANGE_DATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PEER_EVENT_NODE_CHANGE_DATA`.Companion.`default`() : `PEER_EVENT_NODE_CHANGE_DATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_EVENT_OBJECT_CHANGED_DATA` (
    public var `pContact`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PEER_CONTACT`>?,
    public var `pEndpoint`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PEER_ENDPOINT`>?,
    public var `changeType`: `PEER_CHANGE_TYPE`,
    public var `pObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PEER_OBJECT`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_EVENT_OBJECT_CHANGED_DATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `PEER_EVENT_OBJECT_CHANGED_DATA`.Companion.`default`() : `PEER_EVENT_OBJECT_CHANGED_DATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `PEER_EVENT_PEOPLE_NEAR_ME_CHANGED`: `PEER_COLLAB_EVENT_TYPE` = 10;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_EVENT_PEOPLE_NEAR_ME_CHANGED_DATA` (
    public var `changeType`: `PEER_CHANGE_TYPE`,
    public var `pPeopleNearMe`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PEER_PEOPLE_NEAR_ME`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_EVENT_PEOPLE_NEAR_ME_CHANGED_DATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `PEER_EVENT_PEOPLE_NEAR_ME_CHANGED_DATA`.Companion.`default`() : `PEER_EVENT_PEOPLE_NEAR_ME_CHANGED_DATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_EVENT_PRESENCE_CHANGED_DATA` (
    public var `pContact`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PEER_CONTACT`>?,
    public var `pEndpoint`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PEER_ENDPOINT`>?,
    public var `changeType`: `PEER_CHANGE_TYPE`,
    public var `pPresenceInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PEER_PRESENCE_INFO`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_EVENT_PRESENCE_CHANGED_DATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `PEER_EVENT_PRESENCE_CHANGED_DATA`.Companion.`default`() : `PEER_EVENT_PRESENCE_CHANGED_DATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PEER_EVENT_RECORD_CHANGE_DATA` (
    public var `dwSize`: UInt,
    public var `changeType`: `PEER_RECORD_CHANGE_TYPE`,
    public var `recordId`: `windows_sys`.`core`.`GUID`,
    public var `recordType`: `windows_sys`.`core`.`GUID`,
)
public const val `PEER_EVENT_REQUEST_STATUS_CHANGED`: `PEER_COLLAB_EVENT_TYPE` = 11;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_EVENT_REQUEST_STATUS_CHANGED_DATA` (
    public var `pEndpoint`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PEER_ENDPOINT`>?,
    public var `hrChange`: `windows_sys`.`core`.`HRESULT`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_EVENT_REQUEST_STATUS_CHANGED_DATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `PEER_EVENT_REQUEST_STATUS_CHANGED_DATA`.Companion.`default`() : `PEER_EVENT_REQUEST_STATUS_CHANGED_DATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PEER_EVENT_SYNCHRONIZED_DATA` (
    public var `dwSize`: UInt,
    public var `recordType`: `windows_sys`.`core`.`GUID`,
)
public const val `PEER_EVENT_WATCHLIST_CHANGED`: `PEER_COLLAB_EVENT_TYPE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_EVENT_WATCHLIST_CHANGED_DATA` (
    public var `pContact`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PEER_CONTACT`>?,
    public var `changeType`: `PEER_CHANGE_TYPE`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_EVENT_WATCHLIST_CHANGED_DATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PEER_EVENT_WATCHLIST_CHANGED_DATA`.Companion.`default`() : `PEER_EVENT_WATCHLIST_CHANGED_DATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `PEER_E_ALREADY_EXISTS`: Int = -2147024713;
public const val `PEER_E_CLIENT_INVALID_COMPARTMENT_ID`: Int = -2147013390;
public const val `PEER_E_CLOUD_DISABLED`: Int = -2147013394;
public const val `PEER_E_CLOUD_IS_DEAD`: Int = -2147013387;
public const val `PEER_E_CLOUD_IS_SEARCH_ONLY`: Int = -2147013391;
public const val `PEER_E_CLOUD_NOT_FOUND`: Int = -2147013395;
public const val `PEER_E_DISK_FULL`: Int = -2147024784;
public const val `PEER_E_DUPLICATE_PEER_NAME`: Int = -2147013388;
public const val `PEER_E_INVALID_IDENTITY`: Int = -2147013393;
public const val `PEER_E_NOT_FOUND`: Int = -2147023728;
public const val `PEER_E_TOO_MUCH_LOAD`: Int = -2147013392;
public const val `PEER_GRAPH_EVENT_CONNECTION_REQUIRED`: `PEER_GRAPH_EVENT_TYPE` = 7;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_GRAPH_EVENT_DATA` (
    public var `eventType`: `PEER_GRAPH_EVENT_TYPE`,
    public var `Anonymous`: `PEER_GRAPH_EVENT_DATA_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_GRAPH_EVENT_DATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PEER_GRAPH_EVENT_DATA`.Companion.`default`() : `PEER_GRAPH_EVENT_DATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 953:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PEER_GRAPH_EVENT_DATA_0 {
//     pub dwStatus: PEER_GRAPH_STATUS_FLAGS,
//     pub incomingData: PEER_EVENT_INCOMING_DATA,
//     pub recordChangeData: PEER_EVENT_RECORD_CHANGE_DATA,
//     pub connectionChangeData: PEER_EVENT_CONNECTION_CHANGE_DATA,
//     pub nodeChangeData: PEER_EVENT_NODE_CHANGE_DATA,
//     pub synchronizedData: PEER_EVENT_SYNCHRONIZED_DATA,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_GRAPH_EVENT_DATA_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PEER_GRAPH_EVENT_DATA_0`.Companion.`default`() : `PEER_GRAPH_EVENT_DATA_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `PEER_GRAPH_EVENT_DIRECT_CONNECTION`: `PEER_GRAPH_EVENT_TYPE` = 4;
public const val `PEER_GRAPH_EVENT_INCOMING_DATA`: `PEER_GRAPH_EVENT_TYPE` = 6;
public const val `PEER_GRAPH_EVENT_NEIGHBOR_CONNECTION`: `PEER_GRAPH_EVENT_TYPE` = 5;
public const val `PEER_GRAPH_EVENT_NODE_CHANGED`: `PEER_GRAPH_EVENT_TYPE` = 8;
public const val `PEER_GRAPH_EVENT_PROPERTY_CHANGED`: `PEER_GRAPH_EVENT_TYPE` = 2;
public const val `PEER_GRAPH_EVENT_RECORD_CHANGED`: `PEER_GRAPH_EVENT_TYPE` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_GRAPH_EVENT_REGISTRATION` (
    public var `eventType`: `PEER_GRAPH_EVENT_TYPE`,
    public var `pType`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_GRAPH_EVENT_REGISTRATION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PEER_GRAPH_EVENT_REGISTRATION`.Companion.`default`() : `PEER_GRAPH_EVENT_REGISTRATION` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `PEER_GRAPH_EVENT_STATUS_CHANGED`: `PEER_GRAPH_EVENT_TYPE` = 1;
public const val `PEER_GRAPH_EVENT_SYNCHRONIZED`: `PEER_GRAPH_EVENT_TYPE` = 9;
public typealias `PEER_GRAPH_EVENT_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_GRAPH_PROPERTIES` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `dwScope`: UInt,
    public var `dwMaxRecordSize`: UInt,
    public var `pwzGraphId`: `windows_sys`.`core`.`PWSTR`,
    public var `pwzCreatorId`: `windows_sys`.`core`.`PWSTR`,
    public var `pwzFriendlyName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwzComment`: `windows_sys`.`core`.`PWSTR`,
    public var `ulPresenceLifetime`: UInt,
    public var `cPresenceMax`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_GRAPH_PROPERTIES`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PEER_GRAPH_PROPERTIES`.Companion.`default`() : `PEER_GRAPH_PROPERTIES` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `PEER_GRAPH_PROPERTY_DEFER_EXPIRATION`: `PEER_GRAPH_PROPERTY_FLAGS` = 2;
public typealias `PEER_GRAPH_PROPERTY_FLAGS` = Int;
public const val `PEER_GRAPH_PROPERTY_HEARTBEATS`: `PEER_GRAPH_PROPERTY_FLAGS` = 1;
public typealias `PEER_GRAPH_SCOPE` = Int;
public const val `PEER_GRAPH_SCOPE_ANY`: `PEER_GRAPH_SCOPE` = 0;
public const val `PEER_GRAPH_SCOPE_GLOBAL`: `PEER_GRAPH_SCOPE` = 1;
public const val `PEER_GRAPH_SCOPE_LINKLOCAL`: `PEER_GRAPH_SCOPE` = 3;
public const val `PEER_GRAPH_SCOPE_LOOPBACK`: `PEER_GRAPH_SCOPE` = 4;
public const val `PEER_GRAPH_SCOPE_SITELOCAL`: `PEER_GRAPH_SCOPE` = 2;
public typealias `PEER_GRAPH_STATUS_FLAGS` = Int;
public const val `PEER_GRAPH_STATUS_HAS_CONNECTIONS`: `PEER_GRAPH_STATUS_FLAGS` = 2;
public const val `PEER_GRAPH_STATUS_LISTENING`: `PEER_GRAPH_STATUS_FLAGS` = 1;
public const val `PEER_GRAPH_STATUS_SYNCHRONIZED`: `PEER_GRAPH_STATUS_FLAGS` = 4;
public typealias `PEER_GROUP_AUTHENTICATION_SCHEME` = Int;
public const val `PEER_GROUP_EVENT_AUTHENTICATION_FAILED`: `PEER_GROUP_EVENT_TYPE` = 11;
public const val `PEER_GROUP_EVENT_CONNECTION_FAILED`: `PEER_GROUP_EVENT_TYPE` = 10;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_GROUP_EVENT_DATA` (
    public var `eventType`: `PEER_GROUP_EVENT_TYPE`,
    public var `Anonymous`: `PEER_GROUP_EVENT_DATA_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_GROUP_EVENT_DATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PEER_GROUP_EVENT_DATA`.Companion.`default`() : `PEER_GROUP_EVENT_DATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1034:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PEER_GROUP_EVENT_DATA_0 {
//     pub dwStatus: PEER_GROUP_STATUS,
//     pub incomingData: PEER_EVENT_INCOMING_DATA,
//     pub recordChangeData: PEER_EVENT_RECORD_CHANGE_DATA,
//     pub connectionChangeData: PEER_EVENT_CONNECTION_CHANGE_DATA,
//     pub memberChangeData: PEER_EVENT_MEMBER_CHANGE_DATA,
//     pub hrConnectionFailedReason: windows_sys::core::HRESULT,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_GROUP_EVENT_DATA_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PEER_GROUP_EVENT_DATA_0`.Companion.`default`() : `PEER_GROUP_EVENT_DATA_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `PEER_GROUP_EVENT_DIRECT_CONNECTION`: `PEER_GROUP_EVENT_TYPE` = 4;
public const val `PEER_GROUP_EVENT_INCOMING_DATA`: `PEER_GROUP_EVENT_TYPE` = 6;
public const val `PEER_GROUP_EVENT_MEMBER_CHANGED`: `PEER_GROUP_EVENT_TYPE` = 8;
public const val `PEER_GROUP_EVENT_NEIGHBOR_CONNECTION`: `PEER_GROUP_EVENT_TYPE` = 5;
public const val `PEER_GROUP_EVENT_PROPERTY_CHANGED`: `PEER_GROUP_EVENT_TYPE` = 2;
public const val `PEER_GROUP_EVENT_RECORD_CHANGED`: `PEER_GROUP_EVENT_TYPE` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_GROUP_EVENT_REGISTRATION` (
    public var `eventType`: `PEER_GROUP_EVENT_TYPE`,
    public var `pType`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_GROUP_EVENT_REGISTRATION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PEER_GROUP_EVENT_REGISTRATION`.Companion.`default`() : `PEER_GROUP_EVENT_REGISTRATION` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `PEER_GROUP_EVENT_STATUS_CHANGED`: `PEER_GROUP_EVENT_TYPE` = 1;
public typealias `PEER_GROUP_EVENT_TYPE` = Int;
public const val `PEER_GROUP_GMC_AUTHENTICATION`: `PEER_GROUP_AUTHENTICATION_SCHEME` = 1;
public typealias `PEER_GROUP_ISSUE_CREDENTIAL_FLAGS` = Int;
public const val `PEER_GROUP_PASSWORD_AUTHENTICATION`: `PEER_GROUP_AUTHENTICATION_SCHEME` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_GROUP_PROPERTIES` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `pwzCloud`: `windows_sys`.`core`.`PWSTR`,
    public var `pwzClassifier`: `windows_sys`.`core`.`PWSTR`,
    public var `pwzGroupPeerName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwzCreatorPeerName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwzFriendlyName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwzComment`: `windows_sys`.`core`.`PWSTR`,
    public var `ulMemberDataLifetime`: UInt,
    public var `ulPresenceLifetime`: UInt,
    public var `dwAuthenticationSchemes`: UInt,
    public var `pwzGroupPassword`: `windows_sys`.`core`.`PWSTR`,
    public var `groupPasswordRole`: `windows_sys`.`core`.`GUID`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_GROUP_PROPERTIES`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PEER_GROUP_PROPERTIES`.Companion.`default`() : `PEER_GROUP_PROPERTIES` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `PEER_GROUP_PROPERTY_FLAGS` = Int;
// UNSUPPORTED Rust 1094:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PEER_GROUP_ROLE_ADMIN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x04387127_aa56_450a_8ce5_4f565c6790f4);

// UNSUPPORTED Rust 1095:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PEER_GROUP_ROLE_INVITING_MEMBER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4370fd89_dc18_4cfb_8dbf_9853a8a9f905);

// UNSUPPORTED Rust 1096:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PEER_GROUP_ROLE_MEMBER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf12dc4c7_0857_4ca0_93fc_b1bb19a3d8c2);

public typealias `PEER_GROUP_STATUS` = Int;
public const val `PEER_GROUP_STATUS_HAS_CONNECTIONS`: `PEER_GROUP_STATUS` = 2;
public const val `PEER_GROUP_STATUS_LISTENING`: `PEER_GROUP_STATUS` = 1;
public const val `PEER_GROUP_STORE_CREDENTIALS`: `PEER_GROUP_ISSUE_CREDENTIAL_FLAGS` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_INVITATION` (
    public var `applicationId`: `windows_sys`.`core`.`GUID`,
    public var `applicationData`: `PEER_DATA`,
    public var `pwzMessage`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_INVITATION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PEER_INVITATION`.Companion.`default`() : `PEER_INVITATION` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_INVITATION_INFO` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `pwzCloudName`: `windows_sys`.`core`.`PWSTR`,
    public var `dwScope`: UInt,
    public var `dwCloudFlags`: UInt,
    public var `pwzGroupPeerName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwzIssuerPeerName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwzSubjectPeerName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwzGroupFriendlyName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwzIssuerFriendlyName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwzSubjectFriendlyName`: `windows_sys`.`core`.`PWSTR`,
    public var `ftValidityStart`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `ftValidityEnd`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `cRoles`: UInt,
    public var `pRoles`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `cClassifiers`: UInt,
    public var `ppwzClassifiers`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?,
    public var `pSubjectPublicKey`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`Cryptography`.`CERT_PUBLIC_KEY_INFO`>?,
    public var `authScheme`: `PEER_GROUP_AUTHENTICATION_SCHEME`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_INVITATION_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]

    public fun `PEER_INVITATION_INFO`.Companion.`default`() : `PEER_INVITATION_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_INVITATION_RESPONSE` (
    public var `action`: `PEER_INVITATION_RESPONSE_TYPE`,
    public var `pwzMessage`: `windows_sys`.`core`.`PWSTR`,
    public var `hrExtendedInfo`: `windows_sys`.`core`.`HRESULT`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_INVITATION_RESPONSE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PEER_INVITATION_RESPONSE`.Companion.`default`() : `PEER_INVITATION_RESPONSE` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `PEER_INVITATION_RESPONSE_ACCEPTED`: `PEER_INVITATION_RESPONSE_TYPE` = 1;
public const val `PEER_INVITATION_RESPONSE_DECLINED`: `PEER_INVITATION_RESPONSE_TYPE` = 0;
public const val `PEER_INVITATION_RESPONSE_ERROR`: `PEER_INVITATION_RESPONSE_TYPE` = 3;
public const val `PEER_INVITATION_RESPONSE_EXPIRED`: `PEER_INVITATION_RESPONSE_TYPE` = 2;
public typealias `PEER_INVITATION_RESPONSE_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Networking_WinSock", feature = "Win32_Security_Cryptography"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_MEMBER` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `pwzIdentity`: `windows_sys`.`core`.`PWSTR`,
    public var `pwzAttributes`: `windows_sys`.`core`.`PWSTR`,
    public var `ullNodeId`: ULong,
    public var `cAddresses`: UInt,
    public var `pAddresses`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PEER_ADDRESS`>?,
    public var `pCredentialInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PEER_CREDENTIAL_INFO`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_MEMBER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Networking_WinSock", feature = "Win32_Security_Cryptography"))]

    public fun `PEER_MEMBER`.Companion.`default`() : `PEER_MEMBER` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `PEER_MEMBER_CHANGE_TYPE` = Int;
public const val `PEER_MEMBER_CONNECTED`: `PEER_MEMBER_CHANGE_TYPE` = 1;
public const val `PEER_MEMBER_DATA_OPTIONAL`: `PEER_GROUP_PROPERTY_FLAGS` = 1;
public const val `PEER_MEMBER_DISCONNECTED`: `PEER_MEMBER_CHANGE_TYPE` = 2;
public typealias `PEER_MEMBER_FLAGS` = Int;
public const val `PEER_MEMBER_JOINED`: `PEER_MEMBER_CHANGE_TYPE` = 4;
public const val `PEER_MEMBER_LEFT`: `PEER_MEMBER_CHANGE_TYPE` = 5;
public const val `PEER_MEMBER_PRESENT`: `PEER_MEMBER_FLAGS` = 1;
public const val `PEER_MEMBER_UPDATED`: `PEER_MEMBER_CHANGE_TYPE` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_NAME_PAIR` (
    public var `dwSize`: UInt,
    public var `pwzPeerName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwzFriendlyName`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_NAME_PAIR`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PEER_NAME_PAIR`.Companion.`default`() : `PEER_NAME_PAIR` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `PEER_NODE_CHANGE_CONNECTED`: `PEER_NODE_CHANGE_TYPE` = 1;
public const val `PEER_NODE_CHANGE_DISCONNECTED`: `PEER_NODE_CHANGE_TYPE` = 2;
public typealias `PEER_NODE_CHANGE_TYPE` = Int;
public const val `PEER_NODE_CHANGE_UPDATED`: `PEER_NODE_CHANGE_TYPE` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_NODE_INFO` (
    public var `dwSize`: UInt,
    public var `ullNodeId`: ULong,
    public var `pwzPeerId`: `windows_sys`.`core`.`PWSTR`,
    public var `cAddresses`: UInt,
    public var `pAddresses`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PEER_ADDRESS`>?,
    public var `pwzAttributes`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_NODE_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `PEER_NODE_INFO`.Companion.`default`() : `PEER_NODE_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PEER_OBJECT` (
    public var `id`: `windows_sys`.`core`.`GUID`,
    public var `data`: `PEER_DATA`,
    public var `dwPublicationScope`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_PEOPLE_NEAR_ME` (
    public var `pwzNickName`: `windows_sys`.`core`.`PWSTR`,
    public var `endpoint`: `PEER_ENDPOINT`,
    public var `id`: `windows_sys`.`core`.`GUID`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_PEOPLE_NEAR_ME`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `PEER_PEOPLE_NEAR_ME`.Companion.`default`() : `PEER_PEOPLE_NEAR_ME` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `PEER_PNRP_ALL_LINK_CLOUDS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PEER_PNRP_ALL_LINKS");
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_PNRP_CLOUD_INFO` (
    public var `pwzCloudName`: `windows_sys`.`core`.`PWSTR`,
    public var `dwScope`: `PNRP_SCOPE`,
    public var `dwScopeId`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_PNRP_CLOUD_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PEER_PNRP_CLOUD_INFO`.Companion.`default`() : `PEER_PNRP_CLOUD_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_PNRP_ENDPOINT_INFO` (
    public var `pwzPeerName`: `windows_sys`.`core`.`PWSTR`,
    public var `cAddresses`: UInt,
    public var `ppAddresses`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Networking`.`WinSock`.`SOCKADDR`>>?,
    public var `pwzComment`: `windows_sys`.`core`.`PWSTR`,
    public var `payload`: `PEER_DATA`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_PNRP_ENDPOINT_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `PEER_PNRP_ENDPOINT_INFO`.Companion.`default`() : `PEER_PNRP_ENDPOINT_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_PNRP_REGISTRATION_INFO` (
    public var `pwzCloudName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwzPublishingIdentity`: `windows_sys`.`core`.`PWSTR`,
    public var `cAddresses`: UInt,
    public var `ppAddresses`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Networking`.`WinSock`.`SOCKADDR`>>?,
    public var `wPort`: UShort,
    public var `pwzComment`: `windows_sys`.`core`.`PWSTR`,
    public var `payload`: `PEER_DATA`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_PNRP_REGISTRATION_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `PEER_PNRP_REGISTRATION_INFO`.Companion.`default`() : `PEER_PNRP_REGISTRATION_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `PEER_PRESENCE_AWAY`: `PEER_PRESENCE_STATUS` = 2;
public const val `PEER_PRESENCE_BE_RIGHT_BACK`: `PEER_PRESENCE_STATUS` = 3;
public const val `PEER_PRESENCE_BUSY`: `PEER_PRESENCE_STATUS` = 5;
public const val `PEER_PRESENCE_IDLE`: `PEER_PRESENCE_STATUS` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_PRESENCE_INFO` (
    public var `status`: `PEER_PRESENCE_STATUS`,
    public var `pwzDescriptiveText`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_PRESENCE_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PEER_PRESENCE_INFO`.Companion.`default`() : `PEER_PRESENCE_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `PEER_PRESENCE_OFFLINE`: `PEER_PRESENCE_STATUS` = 0;
public const val `PEER_PRESENCE_ONLINE`: `PEER_PRESENCE_STATUS` = 7;
public const val `PEER_PRESENCE_ON_THE_PHONE`: `PEER_PRESENCE_STATUS` = 6;
public const val `PEER_PRESENCE_OUT_TO_LUNCH`: `PEER_PRESENCE_STATUS` = 1;
public typealias `PEER_PRESENCE_STATUS` = Int;
public typealias `PEER_PUBLICATION_SCOPE` = Int;
public const val `PEER_PUBLICATION_SCOPE_ALL`: `PEER_PUBLICATION_SCOPE` = 3;
public const val `PEER_PUBLICATION_SCOPE_INTERNET`: `PEER_PUBLICATION_SCOPE` = 2;
public const val `PEER_PUBLICATION_SCOPE_NEAR_ME`: `PEER_PUBLICATION_SCOPE` = 1;
public const val `PEER_PUBLICATION_SCOPE_NONE`: `PEER_PUBLICATION_SCOPE` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_RECORD` (
    public var `dwSize`: UInt,
    public var `type`: `windows_sys`.`core`.`GUID`,
    public var `id`: `windows_sys`.`core`.`GUID`,
    public var `dwVersion`: UInt,
    public var `dwFlags`: UInt,
    public var `pwzCreatorId`: `windows_sys`.`core`.`PWSTR`,
    public var `pwzModifiedById`: `windows_sys`.`core`.`PWSTR`,
    public var `pwzAttributes`: `windows_sys`.`core`.`PWSTR`,
    public var `ftCreation`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `ftExpiration`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `ftLastModified`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `securityData`: `PEER_DATA`,
    public var `data`: `PEER_DATA`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_RECORD`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PEER_RECORD`.Companion.`default`() : `PEER_RECORD` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `PEER_RECORD_ADDED`: `PEER_RECORD_CHANGE_TYPE` = 1;
public typealias `PEER_RECORD_CHANGE_TYPE` = Int;
public const val `PEER_RECORD_DELETED`: `PEER_RECORD_CHANGE_TYPE` = 3;
public const val `PEER_RECORD_EXPIRED`: `PEER_RECORD_CHANGE_TYPE` = 4;
public typealias `PEER_RECORD_FLAGS` = Int;
public const val `PEER_RECORD_FLAG_AUTOREFRESH`: `PEER_RECORD_FLAGS` = 1;
public const val `PEER_RECORD_FLAG_DELETED`: `PEER_RECORD_FLAGS` = 2;
public const val `PEER_RECORD_UPDATED`: `PEER_RECORD_CHANGE_TYPE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PEER_SECURITY_INTERFACE` (
    public var `dwSize`: UInt,
    public var `pwzSspFilename`: `windows_sys`.`core`.`PWSTR`,
    public var `pwzPackageName`: `windows_sys`.`core`.`PWSTR`,
    public var `cbSecurityInfo`: UInt,
    public var `pbSecurityInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `pvContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pfnValidateRecord`: `PFNPEER_VALIDATE_RECORD`,
    public var `pfnSecureRecord`: `PFNPEER_SECURE_RECORD`,
    public var `pfnFreeSecurityData`: `PFNPEER_FREE_SECURITY_DATA`,
    public var `pfnAuthFailed`: `PFNPEER_ON_PASSWORD_AUTH_FAILED`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PEER_SECURITY_INTERFACE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PEER_SECURITY_INTERFACE`.Companion.`default`() : `PEER_SECURITY_INTERFACE` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `PEER_SIGNIN_ALL`: `PEER_SIGNIN_FLAGS` = 3;
public typealias `PEER_SIGNIN_FLAGS` = Int;
public const val `PEER_SIGNIN_INTERNET`: `PEER_SIGNIN_FLAGS` = 2;
public const val `PEER_SIGNIN_NEAR_ME`: `PEER_SIGNIN_FLAGS` = 1;
public const val `PEER_SIGNIN_NONE`: `PEER_SIGNIN_FLAGS` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PEER_VERSION_DATA` (
    public var `wVersion`: UShort,
    public var `wHighestVersion`: UShort,
)
public const val `PEER_WATCH_ALLOWED`: `PEER_WATCH_PERMISSION` = 1;
public const val `PEER_WATCH_BLOCKED`: `PEER_WATCH_PERMISSION` = 0;
public typealias `PEER_WATCH_PERMISSION` = Int;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNPEER_FREE_SECURITY_DATA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_DATA`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNPEER_ON_PASSWORD_AUTH_FAILED` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNPEER_SECURE_RECORD` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_RECORD`>?, `PEER_RECORD_CHANGE_TYPE`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`PEER_DATA`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNPEER_VALIDATE_RECORD` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`PEER_RECORD`>?, `PEER_RECORD_CHANGE_TYPE`) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PNRPCLOUDINFO` (
    public var `dwSize`: UInt,
    public var `Cloud`: `PNRP_CLOUD_ID`,
    public var `enCloudState`: `PNRP_CLOUD_STATE`,
    public var `enCloudFlags`: `PNRP_CLOUD_FLAGS`,
)
public const val `PNRPINFO_HINT`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PNRPINFO_V1` (
    public var `dwSize`: UInt,
    public var `lpwszIdentity`: `windows_sys`.`core`.`PWSTR`,
    public var `nMaxResolve`: UInt,
    public var `dwTimeout`: UInt,
    public var `dwLifetime`: UInt,
    public var `enResolveCriteria`: `PNRP_RESOLVE_CRITERIA`,
    public var `dwFlags`: UInt,
    public var `saHint`: `super`.`super`.`Networking`.`WinSock`.`SOCKET_ADDRESS`,
    public var `enNameState`: `PNRP_REGISTERED_ID_STATE`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PNRPINFO_V1`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `PNRPINFO_V1`.Companion.`default`() : `PNRPINFO_V1` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Networking_WinSock", feature = "Win32_System_Com"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PNRPINFO_V2` (
    public var `dwSize`: UInt,
    public var `lpwszIdentity`: `windows_sys`.`core`.`PWSTR`,
    public var `nMaxResolve`: UInt,
    public var `dwTimeout`: UInt,
    public var `dwLifetime`: UInt,
    public var `enResolveCriteria`: `PNRP_RESOLVE_CRITERIA`,
    public var `dwFlags`: UInt,
    public var `saHint`: `super`.`super`.`Networking`.`WinSock`.`SOCKET_ADDRESS`,
    public var `enNameState`: `PNRP_REGISTERED_ID_STATE`,
    public var `enExtendedPayloadType`: `PNRP_EXTENDED_PAYLOAD_TYPE`,
    public var `Anonymous`: `PNRPINFO_V2_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PNRPINFO_V2`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Networking_WinSock", feature = "Win32_System_Com"))]

    public fun `PNRPINFO_V2`.Companion.`default`() : `PNRPINFO_V2` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1432:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Networking_WinSock", feature = "Win32_System_Com"))]
// #[derive(Clone, Copy)]
// pub union PNRPINFO_V2_0 {
//     pub blobPayload: super::super::System::Com::BLOB,
//     pub pwszPayload: windows_sys::core::PWSTR,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PNRPINFO_V2_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Networking_WinSock", feature = "Win32_System_Com"))]

    public fun `PNRPINFO_V2_0`.Companion.`default`() : `PNRPINFO_V2_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `PNRP_CLOUD_FLAGS` = Int;
public const val `PNRP_CLOUD_FULL_PARTICIPANT`: `PNRP_CLOUD_FLAGS` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PNRP_CLOUD_ID` (
    public var `AddressFamily`: Int,
    public var `Scope`: `PNRP_SCOPE`,
    public var `ScopeId`: UInt,
)
public const val `PNRP_CLOUD_NAME_LOCAL`: `PNRP_CLOUD_FLAGS` = 1;
public const val `PNRP_CLOUD_NO_FLAGS`: `PNRP_CLOUD_FLAGS` = 0;
public const val `PNRP_CLOUD_RESOLVE_ONLY`: `PNRP_CLOUD_FLAGS` = 2;
public typealias `PNRP_CLOUD_STATE` = Int;
public const val `PNRP_CLOUD_STATE_ACTIVE`: `PNRP_CLOUD_STATE` = 2;
public const val `PNRP_CLOUD_STATE_ALONE`: `PNRP_CLOUD_STATE` = 6;
public const val `PNRP_CLOUD_STATE_DEAD`: `PNRP_CLOUD_STATE` = 3;
public const val `PNRP_CLOUD_STATE_DISABLED`: `PNRP_CLOUD_STATE` = 4;
public const val `PNRP_CLOUD_STATE_NO_NET`: `PNRP_CLOUD_STATE` = 5;
public const val `PNRP_CLOUD_STATE_SYNCHRONISING`: `PNRP_CLOUD_STATE` = 1;
public const val `PNRP_CLOUD_STATE_VIRTUAL`: `PNRP_CLOUD_STATE` = 0;
public typealias `PNRP_EXTENDED_PAYLOAD_TYPE` = Int;
public const val `PNRP_EXTENDED_PAYLOAD_TYPE_BINARY`: `PNRP_EXTENDED_PAYLOAD_TYPE` = 1;
public const val `PNRP_EXTENDED_PAYLOAD_TYPE_NONE`: `PNRP_EXTENDED_PAYLOAD_TYPE` = 0;
public const val `PNRP_EXTENDED_PAYLOAD_TYPE_STRING`: `PNRP_EXTENDED_PAYLOAD_TYPE` = 2;
public const val `PNRP_GLOBAL_SCOPE`: `PNRP_SCOPE` = 1;
public const val `PNRP_LINK_LOCAL_SCOPE`: `PNRP_SCOPE` = 3;
public const val `PNRP_MAX_ENDPOINT_ADDRESSES`: UInt = 10u;
public const val `PNRP_MAX_EXTENDED_PAYLOAD_BYTES`: UInt = 4096u;
public typealias `PNRP_REGISTERED_ID_STATE` = Int;
public const val `PNRP_REGISTERED_ID_STATE_OK`: `PNRP_REGISTERED_ID_STATE` = 1;
public const val `PNRP_REGISTERED_ID_STATE_PROBLEM`: `PNRP_REGISTERED_ID_STATE` = 2;
public typealias `PNRP_RESOLVE_CRITERIA` = Int;
public const val `PNRP_RESOLVE_CRITERIA_ANY_PEER_NAME`: `PNRP_RESOLVE_CRITERIA` = 5;
public const val `PNRP_RESOLVE_CRITERIA_DEFAULT`: `PNRP_RESOLVE_CRITERIA` = 0;
public const val `PNRP_RESOLVE_CRITERIA_NEAREST_NON_CURRENT_PROCESS_PEER_NAME`: `PNRP_RESOLVE_CRITERIA` = 4;
public const val `PNRP_RESOLVE_CRITERIA_NEAREST_PEER_NAME`: `PNRP_RESOLVE_CRITERIA` = 6;
public const val `PNRP_RESOLVE_CRITERIA_NEAREST_REMOTE_PEER_NAME`: `PNRP_RESOLVE_CRITERIA` = 2;
public const val `PNRP_RESOLVE_CRITERIA_NON_CURRENT_PROCESS_PEER_NAME`: `PNRP_RESOLVE_CRITERIA` = 3;
public const val `PNRP_RESOLVE_CRITERIA_REMOTE_PEER_NAME`: `PNRP_RESOLVE_CRITERIA` = 1;
public typealias `PNRP_SCOPE` = Int;
public const val `PNRP_SCOPE_ANY`: `PNRP_SCOPE` = 0;
public const val `PNRP_SITE_LOCAL_SCOPE`: `PNRP_SCOPE` = 2;
public const val `PeerDistClientBasicInfo`: `PEERDIST_CLIENT_INFO_BY_HANDLE_CLASS` = 0;
// UNSUPPORTED Rust 1488:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SVCID_PNRPCLOUD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc2239ce6_00c0_4fbf_bad6_18139385a49a);

// UNSUPPORTED Rust 1489:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SVCID_PNRPNAME_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc2239ce5_00c0_4fbf_bad6_18139385a49a);

// UNSUPPORTED Rust 1490:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SVCID_PNRPNAME_V2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc2239ce7_00c0_4fbf_bad6_18139385a49a);

public const val `WSA_PNRP_CLIENT_INVALID_COMPARTMENT_ID`: UInt = 11506u;
public const val `WSA_PNRP_CLOUD_DISABLED`: UInt = 11502u;
public const val `WSA_PNRP_CLOUD_IS_DEAD`: UInt = 11509u;
public const val `WSA_PNRP_CLOUD_IS_SEARCH_ONLY`: UInt = 11505u;
public const val `WSA_PNRP_CLOUD_NOT_FOUND`: UInt = 11501u;
public const val `WSA_PNRP_DUPLICATE_PEER_NAME`: UInt = 11508u;
public const val `WSA_PNRP_ERROR_BASE`: UInt = 11500u;
public const val `WSA_PNRP_INVALID_IDENTITY`: UInt = 11503u;
public const val `WSA_PNRP_TOO_MUCH_LOAD`: UInt = 11504u;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WSZ_SCOPE_GLOBAL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("GLOBAL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WSZ_SCOPE_LINKLOCAL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LINKLOCAL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WSZ_SCOPE_SITELOCAL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SITELOCAL");
