// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATAdminAcquireContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptCATAdminAcquireContext`(`phcatadmin` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `pgsubsystem` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dwflags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATAdminAcquireContext2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptCATAdminAcquireContext2`(`phcatadmin` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `pgsubsystem` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pwszhashalgorithm` : `windows_sys`.`core`.`PCWSTR`, `pstronghashpolicy` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`CERT_STRONG_SIGN_PARA`>?, `dwflags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATAdminAddCatalog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptCATAdminAddCatalog`(`hcatadmin` : Long, `pwszcatalogfile` : `windows_sys`.`core`.`PCWSTR`, `pwszselectbasename` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATAdminCalcHashFromFileHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptCATAdminCalcHashFromFileHandle`(`hfile` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `pcbhash` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pbhash` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwflags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATAdminCalcHashFromFileHandle2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptCATAdminCalcHashFromFileHandle2`(`hcatadmin` : Long, `hfile` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `pcbhash` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pbhash` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwflags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATAdminEnumCatalogFromHash; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptCATAdminEnumCatalogFromHash`(`hcatadmin` : Long, `pbhash` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbhash` : UInt, `dwflags` : UInt, `phprevcatinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATAdminPauseServiceForBackup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptCATAdminPauseServiceForBackup`(`dwflags` : UInt, `fresume` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATAdminReleaseCatalogContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptCATAdminReleaseCatalogContext`(`hcatadmin` : Long, `hcatinfo` : Long, `dwflags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATAdminReleaseContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptCATAdminReleaseContext`(`hcatadmin` : Long, `dwflags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATAdminRemoveCatalog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptCATAdminRemoveCatalog`(`hcatadmin` : Long, `pwszcatalogfile` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATAdminResolveCatalogPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptCATAdminResolveCatalogPath`(`hcatadmin` : Long, `pwszcatalogfile` : `windows_sys`.`core`.`PCWSTR`, `pscatinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CATALOG_INFO`>?, `dwflags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATAllocSortedMemberInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Sip")]
public external fun `CryptCATAllocSortedMemberInfo`(`hcatalog` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `pwszreferencetag` : `windows_sys`.`core`.`PCWSTR`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATMEMBER`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATCDFClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptCATCDFClose`(`pcdf` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATCDF`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATCDFEnumAttributes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Sip")]
public external fun `CryptCATCDFEnumAttributes`(`pcdf` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATCDF`>?, `pmember` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATMEMBER`>?, `pprevattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATATTRIBUTE`>?, `pfnparseerror` : `PFN_CDF_PARSE_ERROR_CALLBACK`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATATTRIBUTE`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATCDFEnumAttributesWithCDFTag; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Sip")]
public external fun `CryptCATCDFEnumAttributesWithCDFTag`(`pcdf` : /* Rust *const */ kotlinx.cinterop.CPointer<`CRYPTCATCDF`>?, `pwszmembertag` : `windows_sys`.`core`.`PCWSTR`, `pmember` : /* Rust *const */ kotlinx.cinterop.CPointer<`CRYPTCATMEMBER`>?, `pprevattr` : /* Rust *const */ kotlinx.cinterop.CPointer<`CRYPTCATATTRIBUTE`>?, `pfnparseerror` : `PFN_CDF_PARSE_ERROR_CALLBACK`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATATTRIBUTE`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATCDFEnumCatAttributes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptCATCDFEnumCatAttributes`(`pcdf` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATCDF`>?, `pprevattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATATTRIBUTE`>?, `pfnparseerror` : `PFN_CDF_PARSE_ERROR_CALLBACK`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATATTRIBUTE`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATCDFEnumMembers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Sip")]
public external fun `CryptCATCDFEnumMembers`(`pcdf` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATCDF`>?, `pprevmember` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATMEMBER`>?, `pfnparseerror` : `PFN_CDF_PARSE_ERROR_CALLBACK`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATMEMBER`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATCDFEnumMembersByCDFTagEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Sip")]
public external fun `CryptCATCDFEnumMembersByCDFTagEx`(`pcdf` : /* Rust *const */ kotlinx.cinterop.CPointer<`CRYPTCATCDF`>?, `pwszprevcdftag` : `windows_sys`.`core`.`PWSTR`, `pfnparseerror` : `PFN_CDF_PARSE_ERROR_CALLBACK`, `ppmember` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`CRYPTCATMEMBER`>>?, `fcontinueonerror` : `windows_sys`.`core`.`BOOL`, `pvreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`PWSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATCDFOpen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptCATCDFOpen`(`pwszfilepath` : `windows_sys`.`core`.`PCWSTR`, `pfnparseerror` : `PFN_CDF_PARSE_ERROR_CALLBACK`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATCDF`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATCatalogInfoFromContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptCATCatalogInfoFromContext`(`hcatinfo` : Long, `pscatinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CATALOG_INFO`>?, `dwflags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptCATClose`(`hcatalog` : `super`.`super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATEnumerateAttr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Sip")]
public external fun `CryptCATEnumerateAttr`(`hcatalog` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `pcatmember` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATMEMBER`>?, `pprevattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATATTRIBUTE`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATATTRIBUTE`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATEnumerateCatAttr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptCATEnumerateCatAttr`(`hcatalog` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `pprevattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATATTRIBUTE`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATATTRIBUTE`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATEnumerateMember; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Sip")]
public external fun `CryptCATEnumerateMember`(`hcatalog` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `pprevmember` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATMEMBER`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATMEMBER`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATFreeSortedMemberInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Sip")]
public external fun `CryptCATFreeSortedMemberInfo`(`hcatalog` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `pcatmember` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATMEMBER`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATGetAttrInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Sip")]
public external fun `CryptCATGetAttrInfo`(`hcatalog` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `pcatmember` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATMEMBER`>?, `pwszreferencetag` : `windows_sys`.`core`.`PCWSTR`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATATTRIBUTE`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATGetCatAttrInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptCATGetCatAttrInfo`(`hcatalog` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `pwszreferencetag` : `windows_sys`.`core`.`PCWSTR`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATATTRIBUTE`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATGetMemberInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Sip")]
public external fun `CryptCATGetMemberInfo`(`hcatalog` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `pwszreferencetag` : `windows_sys`.`core`.`PCWSTR`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATMEMBER`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATHandleFromStore; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptCATHandleFromStore`(`pcatstore` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATSTORE`>?) : `super`.`super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATOpen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptCATOpen`(`pwszfilename` : `windows_sys`.`core`.`PCWSTR`, `fdwopenflags` : `CRYPTCAT_OPEN_FLAGS`, `hprov` : ULong, `dwpublicversion` : `CRYPTCAT_VERSION`, `dwencodingtype` : UInt) : `super`.`super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATPersistStore; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptCATPersistStore`(`hcatalog` : `super`.`super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATPutAttrInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Sip")]
public external fun `CryptCATPutAttrInfo`(`hcatalog` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `pcatmember` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATMEMBER`>?, `pwszreferencetag` : `windows_sys`.`core`.`PCWSTR`, `dwattrtypeandaction` : UInt, `cbdata` : UInt, `pbdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATATTRIBUTE`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATPutCatAttrInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptCATPutCatAttrInfo`(`hcatalog` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `pwszreferencetag` : `windows_sys`.`core`.`PCWSTR`, `dwattrtypeandaction` : UInt, `cbdata` : UInt, `pbdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATATTRIBUTE`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATPutMemberInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Sip")]
public external fun `CryptCATPutMemberInfo`(`hcatalog` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `pwszfilename` : `windows_sys`.`core`.`PCWSTR`, `pwszreferencetag` : `windows_sys`.`core`.`PCWSTR`, `pgsubjecttype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dwcertversion` : UInt, `cbsipindirectdata` : UInt, `pbsipindirectdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATMEMBER`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptCATStoreFromHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptCATStoreFromHandle`(`hcatalog` : `super`.`super`.`super`.`Foundation`.`HANDLE`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATSTORE`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=IsCatalogFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsCatalogFile`(`hfile` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `pwszfilename` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// UNSUPPORTED Rust 49:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CATALOG_INFO {
//     pub cbStruct: u32,
//     pub wszCatalogFile: [u16; 260],
// }

// UNSUPPORTED Rust 55:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CATALOG_INFO {
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
public class `CRYPTCATATTRIBUTE` (
    public var `cbStruct`: UInt,
    public var `pwszReferenceTag`: `windows_sys`.`core`.`PWSTR`,
    public var `dwAttrTypeAndAction`: `CRYPTCATATTRIBUTE_FLAGS`,
    public var `cbValue`: UInt,
    public var `pbValue`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `dwReserved`: UInt,
)
// UNSUPPORTED Rust 70:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CRYPTCATATTRIBUTE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CRYPTCATATTRIBUTE_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CRYPTCATCDF` (
    public var `cbStruct`: UInt,
    public var `hFile`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `dwCurFilePos`: UInt,
    public var `dwLastMemberOffset`: UInt,
    public var `fEOF`: `windows_sys`.`core`.`BOOL`,
    public var `pwszResultDir`: `windows_sys`.`core`.`PWSTR`,
    public var `hCATStore`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
)
// UNSUPPORTED Rust 87:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CRYPTCATCDF {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Sip")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CRYPTCATMEMBER` (
    public var `cbStruct`: UInt,
    public var `pwszReferenceTag`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszFileName`: `windows_sys`.`core`.`PWSTR`,
    public var `gSubjectType`: `windows_sys`.`core`.`GUID`,
    public var `fdwMemberFlags`: UInt,
    public var `pIndirectData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Sip`.`SIP_INDIRECT_DATA`>?,
    public var `dwCertVersion`: UInt,
    public var `dwReserved`: UInt,
    public var `hReserved`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `sEncodedIndirectData`: `super`.`CRYPT_INTEGER_BLOB`,
    public var `sEncodedMemberInfo`: `super`.`CRYPT_INTEGER_BLOB`,
)
// UNSUPPORTED Rust 108:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography_Sip")]
// impl Default for CRYPTCATMEMBER {
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
public class `CRYPTCATSTORE` (
    public var `cbStruct`: UInt,
    public var `dwPublicVersion`: UInt,
    public var `pwszP7File`: `windows_sys`.`core`.`PWSTR`,
    public var `hProv`: ULong,
    public var `dwEncodingType`: UInt,
    public var `fdwStoreFlags`: `CRYPTCAT_OPEN_FLAGS`,
    public var `hReserved`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `hAttrs`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `hCryptMsg`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `hSorted`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
)
// UNSUPPORTED Rust 128:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CRYPTCATSTORE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPTCAT_ADDCATALOG_HARDLINK`: UInt = 1u;
public const val `CRYPTCAT_ADDCATALOG_NONE`: UInt = 0u;
public const val `CRYPTCAT_ATTR_AUTHENTICATED`: `CRYPTCATATTRIBUTE_FLAGS` = 268435456u;
public const val `CRYPTCAT_ATTR_DATAASCII`: `CRYPTCATATTRIBUTE_FLAGS` = 65536u;
public const val `CRYPTCAT_ATTR_DATABASE64`: `CRYPTCATATTRIBUTE_FLAGS` = 131072u;
public const val `CRYPTCAT_ATTR_DATAREPLACE`: `CRYPTCATATTRIBUTE_FLAGS` = 262144u;
public const val `CRYPTCAT_ATTR_NAMEASCII`: `CRYPTCATATTRIBUTE_FLAGS` = 1u;
public const val `CRYPTCAT_ATTR_NAMEOBJID`: `CRYPTCATATTRIBUTE_FLAGS` = 2u;
public const val `CRYPTCAT_ATTR_NO_AUTO_COMPAT_ENTRY`: `CRYPTCATATTRIBUTE_FLAGS` = 16777216u;
public const val `CRYPTCAT_ATTR_UNAUTHENTICATED`: `CRYPTCATATTRIBUTE_FLAGS` = 536870912u;
public const val `CRYPTCAT_E_AREA_ATTRIBUTE`: UInt = 131072u;
public const val `CRYPTCAT_E_AREA_HEADER`: UInt = 0u;
public const val `CRYPTCAT_E_AREA_MEMBER`: UInt = 65536u;
public const val `CRYPTCAT_E_CDF_ATTR_TOOFEWVALUES`: UInt = 131074u;
public const val `CRYPTCAT_E_CDF_ATTR_TYPECOMBO`: UInt = 131076u;
public const val `CRYPTCAT_E_CDF_BAD_GUID_CONV`: UInt = 131073u;
public const val `CRYPTCAT_E_CDF_DUPLICATE`: UInt = 2u;
public const val `CRYPTCAT_E_CDF_MEMBER_FILENOTFOUND`: UInt = 65540u;
public const val `CRYPTCAT_E_CDF_MEMBER_FILE_PATH`: UInt = 65537u;
public const val `CRYPTCAT_E_CDF_MEMBER_INDIRECTDATA`: UInt = 65538u;
public const val `CRYPTCAT_E_CDF_TAGNOTFOUND`: UInt = 4u;
public const val `CRYPTCAT_E_CDF_UNSUPPORTED`: UInt = 1u;
// UNSUPPORTED Rust 155:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRYPTCAT_FILEEXT: windows_sys::core::PCWSTR = windows_sys::core::w!("CAT");

public const val `CRYPTCAT_MAX_MEMBERTAG`: UInt = 64u;
public const val `CRYPTCAT_MEMBER_SORTED`: UInt = 1073741824u;
public const val `CRYPTCAT_OPEN_ALWAYS`: `CRYPTCAT_OPEN_FLAGS` = 2u;
public const val `CRYPTCAT_OPEN_CREATENEW`: `CRYPTCAT_OPEN_FLAGS` = 1u;
public const val `CRYPTCAT_OPEN_EXCLUDE_PAGE_HASHES`: `CRYPTCAT_OPEN_FLAGS` = 65536u;
public const val `CRYPTCAT_OPEN_EXISTING`: `CRYPTCAT_OPEN_FLAGS` = 4u;
public typealias `CRYPTCAT_OPEN_FLAGS` = UInt;
public const val `CRYPTCAT_OPEN_FLAGS_MASK`: `CRYPTCAT_OPEN_FLAGS` = 4294901760u;
public const val `CRYPTCAT_OPEN_INCLUDE_PAGE_HASHES`: `CRYPTCAT_OPEN_FLAGS` = 131072u;
public const val `CRYPTCAT_OPEN_NO_CONTENT_HCRYPTMSG`: `CRYPTCAT_OPEN_FLAGS` = 536870912u;
public const val `CRYPTCAT_OPEN_SORTED`: `CRYPTCAT_OPEN_FLAGS` = 1073741824u;
public const val `CRYPTCAT_OPEN_VERIFYSIGHASH`: `CRYPTCAT_OPEN_FLAGS` = 268435456u;
public typealias `CRYPTCAT_VERSION` = UInt;
public const val `CRYPTCAT_VERSION_1`: `CRYPTCAT_VERSION` = 256u;
public const val `CRYPTCAT_VERSION_2`: `CRYPTCAT_VERSION` = 512u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Sip")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MS_ADDINFO_CATALOGMEMBER` (
    public var `cbStruct`: UInt,
    public var `pStore`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATSTORE`>?,
    public var `pMember`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTCATMEMBER`>?,
)
// UNSUPPORTED Rust 179:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography_Sip")]
// impl Default for MS_ADDINFO_CATALOGMEMBER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_CDF_PARSE_ERROR_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, `windows_sys`.`core`.`PCWSTR`) -> Unit>>>;
// UNSUPPORTED Rust 186:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const szOID_CATALOG_LIST: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.12.1.1");

// UNSUPPORTED Rust 187:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const szOID_CATALOG_LIST_MEMBER: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.12.1.2");

// UNSUPPORTED Rust 188:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const szOID_CATALOG_LIST_MEMBER2: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.12.1.3");

