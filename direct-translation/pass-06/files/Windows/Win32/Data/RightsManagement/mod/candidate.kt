// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMAcquireAdvisories; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMAcquireAdvisories`(`hlicensestorage` : UInt, `wszlicense` : `windows_sys`.`core`.`PCWSTR`, `wszurl` : `windows_sys`.`core`.`PCWSTR`, `pvcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMAcquireIssuanceLicenseTemplate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMAcquireIssuanceLicenseTemplate`(`hclient` : UInt, `uflags` : UInt, `pvreserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ctemplates` : UInt, `pwsztemplateids` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, `wszurl` : `windows_sys`.`core`.`PCWSTR`, `pvcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMAcquireLicense; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMAcquireLicense`(`hsession` : UInt, `uflags` : UInt, `wszgroupidentitycredential` : `windows_sys`.`core`.`PCWSTR`, `wszrequestedrights` : `windows_sys`.`core`.`PCWSTR`, `wszcustomdata` : `windows_sys`.`core`.`PCWSTR`, `wszurl` : `windows_sys`.`core`.`PCWSTR`, `pvcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMActivate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMActivate`(`hclient` : UInt, `uflags` : UInt, `ulangid` : UInt, `pactservinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DRM_ACTSERV_INFO`>?, `pvcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `hparentwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMAddLicense; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMAddLicense`(`hlicensestorage` : UInt, `uflags` : UInt, `wszlicense` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMAddRightWithUser; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMAddRightWithUser`(`hissuancelicense` : UInt, `hright` : UInt, `huser` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMAttest; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMAttest`(`henablingprincipal` : UInt, `wszdata` : `windows_sys`.`core`.`PCWSTR`, `etype` : `DRMATTESTTYPE`, `pcattestedblob` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszattestedblob` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMCheckSecurity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMCheckSecurity`(`henv` : UInt, `clevel` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMClearAllRights; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMClearAllRights`(`hissuancelicense` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMCloseEnvironmentHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMCloseEnvironmentHandle`(`henv` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMCloseHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMCloseHandle`(`handle` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMClosePubHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMClosePubHandle`(`hpub` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMCloseQueryHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMCloseQueryHandle`(`hquery` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMCloseSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMCloseSession`(`hsession` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMConstructCertificateChain; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMConstructCertificateChain`(`ccertificates` : UInt, `rgwszcertificates` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, `pcchain` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszchain` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMCreateBoundLicense; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMCreateBoundLicense`(`henv` : UInt, `pparams` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DRMBOUNDLICENSEPARAMS`>?, `wszlicensechain` : `windows_sys`.`core`.`PCWSTR`, `phboundlicense` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pherrorlog` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMCreateClientSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMCreateClientSession`(`pfncallback` : `DRMCALLBACK`, `ucallbackversion` : UInt, `wszgroupidprovidertype` : `windows_sys`.`core`.`PCWSTR`, `wszgroupid` : `windows_sys`.`core`.`PCWSTR`, `phclient` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMCreateEnablingBitsDecryptor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMCreateEnablingBitsDecryptor`(`hboundlicense` : UInt, `wszright` : `windows_sys`.`core`.`PCWSTR`, `hauxlib` : UInt, `wszauxplug` : `windows_sys`.`core`.`PCWSTR`, `phdecryptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMCreateEnablingBitsEncryptor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMCreateEnablingBitsEncryptor`(`hboundlicense` : UInt, `wszright` : `windows_sys`.`core`.`PCWSTR`, `hauxlib` : UInt, `wszauxplug` : `windows_sys`.`core`.`PCWSTR`, `phencryptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMCreateEnablingPrincipal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMCreateEnablingPrincipal`(`henv` : UInt, `hlibrary` : UInt, `wszobject` : `windows_sys`.`core`.`PCWSTR`, `pidprincipal` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DRMID`>?, `wszcredentials` : `windows_sys`.`core`.`PCWSTR`, `phenablingprincipal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMCreateIssuanceLicense; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMCreateIssuanceLicense`(`psttimefrom` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?, `psttimeuntil` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?, `wszreferralinfoname` : `windows_sys`.`core`.`PCWSTR`, `wszreferralinfourl` : `windows_sys`.`core`.`PCWSTR`, `howner` : UInt, `wszissuancelicense` : `windows_sys`.`core`.`PCWSTR`, `hboundlicense` : UInt, `phissuancelicense` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMCreateLicenseStorageSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMCreateLicenseStorageSession`(`henv` : UInt, `hdefaultlibrary` : UInt, `hclient` : UInt, `uflags` : UInt, `wszissuancelicense` : `windows_sys`.`core`.`PCWSTR`, `phlicensestorage` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMCreateRight; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMCreateRight`(`wszrightname` : `windows_sys`.`core`.`PCWSTR`, `pstfrom` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?, `pstuntil` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?, `cextendedinfo` : UInt, `pwszextendedinfoname` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, `pwszextendedinfovalue` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, `phright` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMCreateUser; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMCreateUser`(`wszusername` : `windows_sys`.`core`.`PCWSTR`, `wszuserid` : `windows_sys`.`core`.`PCWSTR`, `wszuseridtype` : `windows_sys`.`core`.`PCWSTR`, `phuser` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMDecode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMDecode`(`wszalgid` : `windows_sys`.`core`.`PCWSTR`, `wszencodedstring` : `windows_sys`.`core`.`PCWSTR`, `pudecodeddatalen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pbdecodeddata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMDeconstructCertificateChain; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMDeconstructCertificateChain`(`wszchain` : `windows_sys`.`core`.`PCWSTR`, `iwhich` : UInt, `pccert` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszcert` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMDecrypt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMDecrypt`(`hcryptoprovider` : UInt, `iposition` : UInt, `cnuminbytes` : UInt, `pbindata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pcnumoutbytes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pboutdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMDeleteLicense; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMDeleteLicense`(`hsession` : UInt, `wszlicenseid` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMDuplicateEnvironmentHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMDuplicateEnvironmentHandle`(`htocopy` : UInt, `phcopy` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMDuplicateHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMDuplicateHandle`(`htocopy` : UInt, `phcopy` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMDuplicatePubHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMDuplicatePubHandle`(`hpubin` : UInt, `phpubout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMDuplicateSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMDuplicateSession`(`hsessionin` : UInt, `phsessionout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMEncode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMEncode`(`wszalgid` : `windows_sys`.`core`.`PCWSTR`, `udatalen` : UInt, `pbdecodeddata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `puencodedstringlen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszencodedstring` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMEncrypt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMEncrypt`(`hcryptoprovider` : UInt, `iposition` : UInt, `cnuminbytes` : UInt, `pbindata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pcnumoutbytes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pboutdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMEnumerateLicense; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMEnumerateLicense`(`hsession` : UInt, `uflags` : UInt, `uindex` : UInt, `pfsharedflag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `pucertificatedatalen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszcertificatedata` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetApplicationSpecificData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetApplicationSpecificData`(`hissuancelicense` : UInt, `uindex` : UInt, `punamelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszname` : `windows_sys`.`core`.`PWSTR`, `puvaluelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszvalue` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetBoundLicenseAttribute; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetBoundLicenseAttribute`(`hqueryroot` : UInt, `wszattribute` : `windows_sys`.`core`.`PCWSTR`, `iwhich` : UInt, `peencoding` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DRMENCODINGTYPE`>?, `pcbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetBoundLicenseAttributeCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetBoundLicenseAttributeCount`(`hqueryroot` : UInt, `wszattribute` : `windows_sys`.`core`.`PCWSTR`, `pcattributes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetBoundLicenseObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetBoundLicenseObject`(`hqueryroot` : UInt, `wszsubobjecttype` : `windows_sys`.`core`.`PCWSTR`, `iwhich` : UInt, `phsubobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetBoundLicenseObjectCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetBoundLicenseObjectCount`(`hqueryroot` : UInt, `wszsubobjecttype` : `windows_sys`.`core`.`PCWSTR`, `pcsubobjects` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetCertificateChainCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetCertificateChainCount`(`wszchain` : `windows_sys`.`core`.`PCWSTR`, `pccertcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetClientVersion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetClientVersion`(`pdrmclientversioninfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DRM_CLIENT_VERSION_INFO`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetEnvironmentInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetEnvironmentInfo`(`handle` : UInt, `wszattribute` : `windows_sys`.`core`.`PCWSTR`, `peencoding` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DRMENCODINGTYPE`>?, `pcbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetInfo`(`handle` : UInt, `wszattribute` : `windows_sys`.`core`.`PCWSTR`, `peencoding` : /* Rust *const */ kotlinx.cinterop.CPointer<`DRMENCODINGTYPE`>?, `pcbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetIntervalTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetIntervalTime`(`hissuancelicense` : UInt, `pcdays` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetIssuanceLicenseInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetIssuanceLicenseInfo`(`hissuancelicense` : UInt, `psttimefrom` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?, `psttimeuntil` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?, `uflags` : UInt, `pudistributionpointnamelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszdistributionpointname` : `windows_sys`.`core`.`PWSTR`, `pudistributionpointurllength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszdistributionpointurl` : `windows_sys`.`core`.`PWSTR`, `phowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pfofficial` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetIssuanceLicenseTemplate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetIssuanceLicenseTemplate`(`hissuancelicense` : UInt, `puissuancelicensetemplatelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszissuancelicensetemplate` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetMetaData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetMetaData`(`hissuancelicense` : UInt, `pucontentidlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszcontentid` : `windows_sys`.`core`.`PWSTR`, `pucontentidtypelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszcontentidtype` : `windows_sys`.`core`.`PWSTR`, `puskuidlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszskuid` : `windows_sys`.`core`.`PWSTR`, `puskuidtypelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszskuidtype` : `windows_sys`.`core`.`PWSTR`, `pucontenttypelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszcontenttype` : `windows_sys`.`core`.`PWSTR`, `pucontentnamelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszcontentname` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetNameAndDescription; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetNameAndDescription`(`hissuancelicense` : UInt, `uindex` : UInt, `pulcid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `punamelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszname` : `windows_sys`.`core`.`PWSTR`, `pudescriptionlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszdescription` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetOwnerLicense; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetOwnerLicense`(`hissuancelicense` : UInt, `puownerlicenselength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszownerlicense` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetProcAddress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetProcAddress`(`hlibrary` : UInt, `wszprocname` : `windows_sys`.`core`.`PCWSTR`, `ppfnprocaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FARPROC`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetRevocationPoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetRevocationPoint`(`hissuancelicense` : UInt, `puidlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszid` : `windows_sys`.`core`.`PWSTR`, `puidtypelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszidtype` : `windows_sys`.`core`.`PWSTR`, `puurllength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszrl` : `windows_sys`.`core`.`PWSTR`, `pstfrequency` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?, `punamelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszname` : `windows_sys`.`core`.`PWSTR`, `pupublickeylength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszpublickey` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetRightExtendedInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetRightExtendedInfo`(`hright` : UInt, `uindex` : UInt, `puextendedinfonamelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszextendedinfoname` : `windows_sys`.`core`.`PWSTR`, `puextendedinfovaluelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszextendedinfovalue` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetRightInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetRightInfo`(`hright` : UInt, `purightnamelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszrightname` : `windows_sys`.`core`.`PWSTR`, `pstfrom` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?, `pstuntil` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetSecurityProvider; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetSecurityProvider`(`uflags` : UInt, `putypelen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wsztype` : `windows_sys`.`core`.`PWSTR`, `pupathlen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszpath` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetServiceLocation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetServiceLocation`(`hclient` : UInt, `uservicetype` : UInt, `uservicelocation` : UInt, `wszissuancelicense` : `windows_sys`.`core`.`PCWSTR`, `puserviceurllength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszserviceurl` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetSignedIssuanceLicense; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetSignedIssuanceLicense`(`henv` : UInt, `hissuancelicense` : UInt, `uflags` : UInt, `pbsymkey` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbsymkey` : UInt, `wszsymkeytype` : `windows_sys`.`core`.`PCWSTR`, `wszclientlicensorcertificate` : `windows_sys`.`core`.`PCWSTR`, `pfncallback` : `DRMCALLBACK`, `wszurl` : `windows_sys`.`core`.`PCWSTR`, `pvcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetSignedIssuanceLicenseEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetSignedIssuanceLicenseEx`(`henv` : UInt, `hissuancelicense` : UInt, `uflags` : UInt, `pbsymkey` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbsymkey` : UInt, `wszsymkeytype` : `windows_sys`.`core`.`PCWSTR`, `pvreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `henablingprincipal` : UInt, `hboundlicenseclc` : UInt, `pfncallback` : `DRMCALLBACK`, `pvcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetTime`(`henv` : UInt, `etimeridtype` : `DRMTIMETYPE`, `potimeobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetUnboundLicenseAttribute; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetUnboundLicenseAttribute`(`hqueryroot` : UInt, `wszattributetype` : `windows_sys`.`core`.`PCWSTR`, `iwhich` : UInt, `peencoding` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DRMENCODINGTYPE`>?, `pcbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetUnboundLicenseAttributeCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetUnboundLicenseAttributeCount`(`hqueryroot` : UInt, `wszattributetype` : `windows_sys`.`core`.`PCWSTR`, `pcattributes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetUnboundLicenseObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetUnboundLicenseObject`(`hqueryroot` : UInt, `wszsubobjecttype` : `windows_sys`.`core`.`PCWSTR`, `iindex` : UInt, `phsubquery` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetUnboundLicenseObjectCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetUnboundLicenseObjectCount`(`hqueryroot` : UInt, `wszsubobjecttype` : `windows_sys`.`core`.`PCWSTR`, `pcsubobjects` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetUsagePolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetUsagePolicy`(`hissuancelicense` : UInt, `uindex` : UInt, `peusagepolicytype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DRM_USAGEPOLICY_TYPE`>?, `pfexclusion` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `punamelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszname` : `windows_sys`.`core`.`PWSTR`, `puminversionlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszminversion` : `windows_sys`.`core`.`PWSTR`, `pumaxversionlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszmaxversion` : `windows_sys`.`core`.`PWSTR`, `pupublickeylength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszpublickey` : `windows_sys`.`core`.`PWSTR`, `pudigestalgorithmlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszdigestalgorithm` : `windows_sys`.`core`.`PWSTR`, `pcbdigest` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pbdigest` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetUserInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetUserInfo`(`huser` : UInt, `puusernamelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszusername` : `windows_sys`.`core`.`PWSTR`, `puuseridlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszuserid` : `windows_sys`.`core`.`PWSTR`, `puuseridtypelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszuseridtype` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetUserRights; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetUserRights`(`hissuancelicense` : UInt, `huser` : UInt, `uindex` : UInt, `phright` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMGetUsers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMGetUsers`(`hissuancelicense` : UInt, `uindex` : UInt, `phuser` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMInitEnvironment; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMInitEnvironment`(`esecurityprovidertype` : `DRMSECURITYPROVIDERTYPE`, `especification` : `DRMSPECTYPE`, `wszsecurityprovider` : `windows_sys`.`core`.`PCWSTR`, `wszmanifestcredentials` : `windows_sys`.`core`.`PCWSTR`, `wszmachinecredentials` : `windows_sys`.`core`.`PCWSTR`, `phenv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `phdefaultlibrary` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMIsActivated; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMIsActivated`(`hclient` : UInt, `uflags` : UInt, `pactservinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DRM_ACTSERV_INFO`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMIsWindowProtected; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMIsWindowProtected`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pfprotected` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMLoadLibrary; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMLoadLibrary`(`henv` : UInt, `especification` : `DRMSPECTYPE`, `wszlibraryprovider` : `windows_sys`.`core`.`PCWSTR`, `wszcredentials` : `windows_sys`.`core`.`PCWSTR`, `phlibrary` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMParseUnboundLicense; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMParseUnboundLicense`(`wszcertificate` : `windows_sys`.`core`.`PCWSTR`, `phqueryroot` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMRegisterContent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMRegisterContent`(`fregister` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMRegisterProtectedWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMRegisterProtectedWindow`(`henv` : UInt, `hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMRegisterRevocationList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMRegisterRevocationList`(`henv` : UInt, `wszrevocationlist` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMRepair; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMRepair`() : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMSetApplicationSpecificData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMSetApplicationSpecificData`(`hissuancelicense` : UInt, `fdelete` : `windows_sys`.`core`.`BOOL`, `wszname` : `windows_sys`.`core`.`PCWSTR`, `wszvalue` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMSetGlobalOptions; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMSetGlobalOptions`(`eglobaloptions` : `DRMGLOBALOPTIONS`, `pvdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwlen` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMSetIntervalTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMSetIntervalTime`(`hissuancelicense` : UInt, `cdays` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMSetMetaData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMSetMetaData`(`hissuancelicense` : UInt, `wszcontentid` : `windows_sys`.`core`.`PCWSTR`, `wszcontentidtype` : `windows_sys`.`core`.`PCWSTR`, `wszskuid` : `windows_sys`.`core`.`PCWSTR`, `wszskuidtype` : `windows_sys`.`core`.`PCWSTR`, `wszcontenttype` : `windows_sys`.`core`.`PCWSTR`, `wszcontentname` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMSetNameAndDescription; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMSetNameAndDescription`(`hissuancelicense` : UInt, `fdelete` : `windows_sys`.`core`.`BOOL`, `lcid` : UInt, `wszname` : `windows_sys`.`core`.`PCWSTR`, `wszdescription` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMSetRevocationPoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMSetRevocationPoint`(`hissuancelicense` : UInt, `fdelete` : `windows_sys`.`core`.`BOOL`, `wszid` : `windows_sys`.`core`.`PCWSTR`, `wszidtype` : `windows_sys`.`core`.`PCWSTR`, `wszurl` : `windows_sys`.`core`.`PCWSTR`, `pstfrequency` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?, `wszname` : `windows_sys`.`core`.`PCWSTR`, `wszpublickey` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMSetUsagePolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMSetUsagePolicy`(`hissuancelicense` : UInt, `eusagepolicytype` : `DRM_USAGEPOLICY_TYPE`, `fdelete` : `windows_sys`.`core`.`BOOL`, `fexclusion` : `windows_sys`.`core`.`BOOL`, `wszname` : `windows_sys`.`core`.`PCWSTR`, `wszminversion` : `windows_sys`.`core`.`PCWSTR`, `wszmaxversion` : `windows_sys`.`core`.`PCWSTR`, `wszpublickey` : `windows_sys`.`core`.`PCWSTR`, `wszdigestalgorithm` : `windows_sys`.`core`.`PCWSTR`, `pbdigest` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbdigest` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msdrm.dll, ABI=system, export=DRMVerify; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DRMVerify`(`wszdata` : `windows_sys`.`core`.`PCWSTR`, `pcattesteddata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszattesteddata` : `windows_sys`.`core`.`PWSTR`, `petype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DRMATTESTTYPE`>?, `pcprincipal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszprincipal` : `windows_sys`.`core`.`PWSTR`, `pcmanifest` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `wszmanifest` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`HRESULT`
public const val `DRMACTSERVINFOVERSION`: UInt = 0u;
public typealias `DRMATTESTTYPE` = Int;
public const val `DRMATTESTTYPE_FULLENVIRONMENT`: `DRMATTESTTYPE` = 0;
public const val `DRMATTESTTYPE_HASHONLY`: `DRMATTESTTYPE` = 1;
public const val `DRMBINDINGFLAGS_IGNORE_VALIDITY_INTERVALS`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRMBOUNDLICENSEPARAMS` (
    public var `uVersion`: UInt,
    public var `hEnablingPrincipal`: UInt,
    public var `hSecureStore`: UInt,
    public var `wszRightsRequested`: `windows_sys`.`core`.`PWSTR`,
    public var `wszRightsGroup`: `windows_sys`.`core`.`PWSTR`,
    public var `idResource`: `DRMID`,
    public var `cAuthenticatorCount`: UInt,
    public var `rghAuthenticators`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `wszDefaultEnablingPrincipalCredentials`: `windows_sys`.`core`.`PWSTR`,
    public var `dwFlags`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DRMBOUNDLICENSEPARAMS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DRMBOUNDLICENSEPARAMS`.Companion.`default`() : `DRMBOUNDLICENSEPARAMS` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `DRMBOUNDLICENSEPARAMSVERSION`: UInt = 1u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DRMCALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DRM_STATUS_MSG`, `windows_sys`.`core`.`HRESULT`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
public const val `DRMCALLBACKVERSION`: UInt = 1u;
public const val `DRMCLIENTSTRUCTVERSION`: UInt = 1u;
public typealias `DRMENCODINGTYPE` = Int;
public const val `DRMENCODINGTYPE_BASE64`: `DRMENCODINGTYPE` = 0;
public const val `DRMENCODINGTYPE_LONG`: `DRMENCODINGTYPE` = 2;
public const val `DRMENCODINGTYPE_RAW`: `DRMENCODINGTYPE` = 5;
public const val `DRMENCODINGTYPE_STRING`: `DRMENCODINGTYPE` = 1;
public const val `DRMENCODINGTYPE_TIME`: `DRMENCODINGTYPE` = 3;
public const val `DRMENCODINGTYPE_UINT`: `DRMENCODINGTYPE` = 4;
public const val `DRMENVHANDLE_INVALID`: UInt = 0u;
public typealias `DRMGLOBALOPTIONS` = Int;
public const val `DRMGLOBALOPTIONS_USE_SERVERSECURITYPROCESSOR`: `DRMGLOBALOPTIONS` = 1;
public const val `DRMGLOBALOPTIONS_USE_WINHTTP`: `DRMGLOBALOPTIONS` = 0;
public const val `DRMHANDLE_INVALID`: UInt = 0u;
public const val `DRMHSESSION_INVALID`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRMID` (
    public var `uVersion`: UInt,
    public var `wszIDType`: `windows_sys`.`core`.`PWSTR`,
    public var `wszID`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DRMID`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DRMID`.Companion.`default`() : `DRMID` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `DRMIDVERSION`: UInt = 0u;
public const val `DRMLICENSEACQDATAVERSION`: UInt = 0u;
public const val `DRMPUBHANDLE_INVALID`: UInt = 0u;
public const val `DRMQUERYHANDLE_INVALID`: UInt = 0u;
public typealias `DRMSECURITYPROVIDERTYPE` = Int;
public const val `DRMSECURITYPROVIDERTYPE_SOFTWARESECREP`: `DRMSECURITYPROVIDERTYPE` = 0;
public typealias `DRMSPECTYPE` = Int;
public const val `DRMSPECTYPE_FILENAME`: `DRMSPECTYPE` = 1;
public const val `DRMSPECTYPE_UNKNOWN`: `DRMSPECTYPE` = 0;
public typealias `DRMTIMETYPE` = Int;
public const val `DRMTIMETYPE_SYSTEMLOCAL`: `DRMTIMETYPE` = 1;
public const val `DRMTIMETYPE_SYSTEMUTC`: `DRMTIMETYPE` = 0;
public const val `DRM_ACTIVATE_CANCEL`: UInt = 8u;
public const val `DRM_ACTIVATE_DELAYED`: UInt = 64u;
public const val `DRM_ACTIVATE_GROUPIDENTITY`: UInt = 2u;
public const val `DRM_ACTIVATE_MACHINE`: UInt = 1u;
public const val `DRM_ACTIVATE_SHARED_GROUPIDENTITY`: UInt = 32u;
public const val `DRM_ACTIVATE_SILENT`: UInt = 16u;
public const val `DRM_ACTIVATE_TEMPORARY`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRM_ACTSERV_INFO` (
    public var `uVersion`: UInt,
    public var `wszPubKey`: `windows_sys`.`core`.`PWSTR`,
    public var `wszURL`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DRM_ACTSERV_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DRM_ACTSERV_INFO`.Companion.`default`() : `DRM_ACTSERV_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `DRM_ADD_LICENSE_NOPERSIST`: UInt = 0u;
public const val `DRM_ADD_LICENSE_PERSIST`: UInt = 1u;
public const val `DRM_AILT_CANCEL`: UInt = 4u;
public const val `DRM_AILT_NONSILENT`: UInt = 1u;
public const val `DRM_AILT_OBTAIN_ALL`: UInt = 2u;
public const val `DRM_AL_CANCEL`: UInt = 4u;
public const val `DRM_AL_FETCHNOADVISORY`: UInt = 8u;
public const val `DRM_AL_NONSILENT`: UInt = 1u;
public const val `DRM_AL_NOPERSIST`: UInt = 2u;
public const val `DRM_AL_NOUI`: UInt = 16u;
public const val `DRM_AUTO_GENERATE_KEY`: UInt = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRM_CLIENT_VERSION_INFO` (
    public var `uStructVersion`: UInt,
    public var `dwVersion`: UIntArray,
    public var `wszHierarchy`: UShortArray,
    public var `wszProductId`: UShortArray,
    public var `wszProductDescription`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DRM_CLIENT_VERSION_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DRM_CLIENT_VERSION_INFO`.Companion.`default`() : `DRM_CLIENT_VERSION_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `DRM_DEFAULTGROUPIDTYPE_PASSPORT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PassportAuthProvider");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `DRM_DEFAULTGROUPIDTYPE_WINDOWSAUTH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WindowsAuthProvider");
public typealias `DRM_DISTRIBUTION_POINT_INFO` = Int;
public const val `DRM_DISTRIBUTION_POINT_LICENSE_ACQUISITION`: `DRM_DISTRIBUTION_POINT_INFO` = 0;
public const val `DRM_DISTRIBUTION_POINT_PUBLISHING`: `DRM_DISTRIBUTION_POINT_INFO` = 1;
public const val `DRM_DISTRIBUTION_POINT_REFERRAL_INFO`: `DRM_DISTRIBUTION_POINT_INFO` = 2;
public const val `DRM_EL_CLIENTLICENSOR`: UInt = 128u;
public const val `DRM_EL_CLIENTLICENSOR_LID`: UInt = 256u;
public const val `DRM_EL_EUL`: UInt = 32u;
public const val `DRM_EL_EUL_LID`: UInt = 64u;
public const val `DRM_EL_EXPIRED`: UInt = 4096u;
public const val `DRM_EL_GROUPIDENTITY`: UInt = 2u;
public const val `DRM_EL_GROUPIDENTITY_LID`: UInt = 8u;
public const val `DRM_EL_GROUPIDENTITY_NAME`: UInt = 4u;
public const val `DRM_EL_ISSUANCELICENSE_TEMPLATE`: UInt = 16384u;
public const val `DRM_EL_ISSUANCELICENSE_TEMPLATE_LID`: UInt = 32768u;
public const val `DRM_EL_ISSUERNAME`: UInt = 8192u;
public const val `DRM_EL_MACHINE`: UInt = 1u;
public const val `DRM_EL_REVOCATIONLIST`: UInt = 1024u;
public const val `DRM_EL_REVOCATIONLIST_LID`: UInt = 2048u;
public const val `DRM_EL_SPECIFIED_CLIENTLICENSOR`: UInt = 512u;
public const val `DRM_EL_SPECIFIED_GROUPIDENTITY`: UInt = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRM_LICENSE_ACQ_DATA` (
    public var `uVersion`: UInt,
    public var `wszURL`: `windows_sys`.`core`.`PWSTR`,
    public var `wszLocalFilename`: `windows_sys`.`core`.`PWSTR`,
    public var `pbPostData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `dwPostDataSize`: UInt,
    public var `wszFriendlyName`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DRM_LICENSE_ACQ_DATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DRM_LICENSE_ACQ_DATA`.Companion.`default`() : `DRM_LICENSE_ACQ_DATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `DRM_LOCKBOXTYPE_BLACKBOX`: UInt = 2u;
public const val `DRM_LOCKBOXTYPE_DEFAULT`: UInt = 2u;
public const val `DRM_LOCKBOXTYPE_NONE`: UInt = 0u;
public const val `DRM_LOCKBOXTYPE_WHITEBOX`: UInt = 1u;
public const val `DRM_MSG_ACQUIRE_ADVISORY`: `DRM_STATUS_MSG` = 3;
public const val `DRM_MSG_ACQUIRE_CLIENTLICENSOR`: `DRM_STATUS_MSG` = 5;
public const val `DRM_MSG_ACQUIRE_ISSUANCE_LICENSE_TEMPLATE`: `DRM_STATUS_MSG` = 6;
public const val `DRM_MSG_ACQUIRE_LICENSE`: `DRM_STATUS_MSG` = 2;
public const val `DRM_MSG_ACTIVATE_GROUPIDENTITY`: `DRM_STATUS_MSG` = 1;
public const val `DRM_MSG_ACTIVATE_MACHINE`: `DRM_STATUS_MSG` = 0;
public const val `DRM_MSG_SIGN_ISSUANCE_LICENSE`: `DRM_STATUS_MSG` = 4;
public const val `DRM_OWNER_LICENSE_NOPERSIST`: UInt = 32u;
public const val `DRM_REUSE_KEY`: UInt = 64u;
public const val `DRM_SERVER_ISSUANCELICENSE`: UInt = 8u;
public const val `DRM_SERVICE_LOCATION_ENTERPRISE`: UInt = 2u;
public const val `DRM_SERVICE_LOCATION_INTERNET`: UInt = 1u;
public const val `DRM_SERVICE_TYPE_ACTIVATION`: UInt = 1u;
public const val `DRM_SERVICE_TYPE_CERTIFICATION`: UInt = 2u;
public const val `DRM_SERVICE_TYPE_CLIENTLICENSOR`: UInt = 8u;
public const val `DRM_SERVICE_TYPE_PUBLISHING`: UInt = 4u;
public const val `DRM_SERVICE_TYPE_SILENT`: UInt = 16u;
public const val `DRM_SIGN_CANCEL`: UInt = 4u;
public const val `DRM_SIGN_OFFLINE`: UInt = 2u;
public const val `DRM_SIGN_ONLINE`: UInt = 1u;
public typealias `DRM_STATUS_MSG` = Int;
public typealias `DRM_USAGEPOLICY_TYPE` = Int;
public const val `DRM_USAGEPOLICY_TYPE_BYDIGEST`: `DRM_USAGEPOLICY_TYPE` = 2;
public const val `DRM_USAGEPOLICY_TYPE_BYNAME`: `DRM_USAGEPOLICY_TYPE` = 0;
public const val `DRM_USAGEPOLICY_TYPE_BYPUBLICKEY`: `DRM_USAGEPOLICY_TYPE` = 1;
public const val `DRM_USAGEPOLICY_TYPE_OSEXCLUSION`: `DRM_USAGEPOLICY_TYPE` = 3;
public const val `MSDRM_CLIENT_ZONE`: UInt = 52992u;
public const val `MSDRM_POLICY_ZONE`: UInt = 37632u;
