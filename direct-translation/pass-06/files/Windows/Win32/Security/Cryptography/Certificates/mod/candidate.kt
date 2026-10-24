// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=certadm.dll, ABI=system, export=CertSrvBackupClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CertSrvBackupClose`(`hbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=certadm.dll, ABI=system, export=CertSrvBackupEnd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CertSrvBackupEnd`(`hbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=certadm.dll, ABI=system, export=CertSrvBackupFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CertSrvBackupFree`(`pv` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=certadm.dll, ABI=system, export=CertSrvBackupGetBackupLogsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CertSrvBackupGetBackupLogsW`(`hbc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppwszzbackuplogfiles` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `pcbsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=certadm.dll, ABI=system, export=CertSrvBackupGetDatabaseNamesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CertSrvBackupGetDatabaseNamesW`(`hbc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppwszzattachmentinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `pcbsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=certadm.dll, ABI=system, export=CertSrvBackupGetDynamicFileListW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CertSrvBackupGetDynamicFileListW`(`hbc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppwszzfilelist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `pcbsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=certadm.dll, ABI=system, export=CertSrvBackupOpenFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CertSrvBackupOpenFileW`(`hbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwszattachmentname` : `windows_sys`.`core`.`PCWSTR`, `cbreadhintsize` : UInt, `plifilesize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=certadm.dll, ABI=system, export=CertSrvBackupPrepareW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CertSrvBackupPrepareW`(`pwszservername` : `windows_sys`.`core`.`PCWSTR`, `grbitjet` : UInt, `dwbackupflags` : `CSBACKUP_TYPE`, `phbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=certadm.dll, ABI=system, export=CertSrvBackupRead; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CertSrvBackupRead`(`hbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pvbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbbuffer` : UInt, `pcbread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=certadm.dll, ABI=system, export=CertSrvBackupTruncateLogs; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CertSrvBackupTruncateLogs`(`hbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=certadm.dll, ABI=system, export=CertSrvIsServerOnlineW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CertSrvIsServerOnlineW`(`pwszservername` : `windows_sys`.`core`.`PCWSTR`, `pfserveronline` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=certadm.dll, ABI=system, export=CertSrvRestoreEnd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CertSrvRestoreEnd`(`hbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=certadm.dll, ABI=system, export=CertSrvRestoreGetDatabaseLocationsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CertSrvRestoreGetDatabaseLocationsW`(`hbc` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppwszzdatabaselocationlist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `pcbsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=certadm.dll, ABI=system, export=CertSrvRestorePrepareW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CertSrvRestorePrepareW`(`pwszservername` : `windows_sys`.`core`.`PCWSTR`, `dwrestoreflags` : UInt, `phbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=certadm.dll, ABI=system, export=CertSrvRestoreRegisterComplete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CertSrvRestoreRegisterComplete`(`hbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `hrrestorestate` : `windows_sys`.`core`.`HRESULT`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=certadm.dll, ABI=system, export=CertSrvRestoreRegisterThroughFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CertSrvRestoreRegisterThroughFile`(`hbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwszcheckpointfilepath` : `windows_sys`.`core`.`PCWSTR`, `pwszlogpath` : `windows_sys`.`core`.`PCWSTR`, `rgrstmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CSEDB_RSTMAPW`>?, `crstmap` : Int, `pwszbackuplogpath` : `windows_sys`.`core`.`PCWSTR`, `genlow` : UInt, `genhigh` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=certadm.dll, ABI=system, export=CertSrvRestoreRegisterW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CertSrvRestoreRegisterW`(`hbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwszcheckpointfilepath` : `windows_sys`.`core`.`PCWSTR`, `pwszlogpath` : `windows_sys`.`core`.`PCWSTR`, `rgrstmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CSEDB_RSTMAPW`>?, `crstmap` : Int, `pwszbackuplogpath` : `windows_sys`.`core`.`PCWSTR`, `genlow` : UInt, `genhigh` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=certadm.dll, ABI=system, export=CertSrvServerControlW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CertSrvServerControlW`(`pwszservername` : `windows_sys`.`core`.`PCWSTR`, `dwcontrolflags` : UInt, `pcbout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppbout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=certpoleng.dll, ABI=system, export=PstAcquirePrivateKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PstAcquirePrivateKey`(`pcert` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`CERT_CONTEXT`>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=certpoleng.dll, ABI=system, export=PstGetCertificateChain; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Authentication_Identity")]
public external fun `PstGetCertificateChain`(`pcert` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`CERT_CONTEXT`>?, `ptrustedissuers` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Authentication`.`Identity`.`SecPkgContext_IssuerListInfoEx`>?, `ppcertchaincontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`CERT_CHAIN_CONTEXT`>>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=certpoleng.dll, ABI=system, export=PstGetCertificates; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PstGetCertificates`(`ptargetname` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`UNICODE_STRING`>?, `ccriteria` : UInt, `rgpcriteria` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`CERT_SELECT_CRITERIA`>?, `bisclient` : `windows_sys`.`core`.`BOOL`, `pdwcertchaincontextcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppcertchaincontexts` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`super`.`CERT_CHAIN_CONTEXT`>>>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=certpoleng.dll, ABI=system, export=PstGetTrustAnchors; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Authentication_Identity")]
public external fun `PstGetTrustAnchors`(`ptargetname` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`UNICODE_STRING`>?, `ccriteria` : UInt, `rgpcriteria` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`CERT_SELECT_CRITERIA`>?, `pptrustedissuers` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Authentication`.`Identity`.`SecPkgContext_IssuerListInfoEx`>>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=certpoleng.dll, ABI=system, export=PstGetTrustAnchorsEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Authentication_Identity")]
public external fun `PstGetTrustAnchorsEx`(`ptargetname` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`UNICODE_STRING`>?, `ccriteria` : UInt, `rgpcriteria` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`CERT_SELECT_CRITERIA`>?, `pcertcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`CERT_CONTEXT`>?, `pptrustedissuers` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Authentication`.`Identity`.`SecPkgContext_IssuerListInfoEx`>>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=certpoleng.dll, ABI=system, export=PstGetUserNameForCertificate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PstGetUserNameForCertificate`(`pcertcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`CERT_CONTEXT`>?, `username` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`UNICODE_STRING`>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=certpoleng.dll, ABI=system, export=PstMapCertificate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Authentication_Identity")]
public external fun `PstMapCertificate`(`pcert` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`CERT_CONTEXT`>?, `ptokeninformationtype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Authentication`.`Identity`.`LSA_TOKEN_INFORMATION_TYPE`>?, `pptokeninformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=certpoleng.dll, ABI=system, export=PstValidate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PstValidate`(`ptargetname` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`UNICODE_STRING`>?, `bisclient` : `windows_sys`.`core`.`BOOL`, `prequestedissuancepolicy` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`CERT_USAGE_MATCH`>?, `phadditionalcertstore` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`HCERTSTORE`>?, `pcert` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`CERT_CONTEXT`>?, `pprovguid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `super`.`super`.`super`.`Foundation`.`NTSTATUS`
public typealias `ADDED_CERT_TYPE` = Int;
public typealias `AlgorithmFlags` = Int;
public const val `AlgorithmFlagsNone`: `AlgorithmFlags` = 0;
public const val `AlgorithmFlagsWrap`: `AlgorithmFlags` = 1;
public typealias `AlgorithmOperationFlags` = Int;
public typealias `AlgorithmType` = Int;
public const val `AllowNoOutstandingRequest`: `InstallResponseRestrictionFlags` = 1;
public const val `AllowNone`: `InstallResponseRestrictionFlags` = 0;
public const val `AllowUntrustedCertificate`: `InstallResponseRestrictionFlags` = 2;
public const val `AllowUntrustedRoot`: `InstallResponseRestrictionFlags` = 4;
public const val `AllowedKeySignature`: `Pkcs10AllowedSignatureTypes` = 1;
public const val `AllowedNullSignature`: `Pkcs10AllowedSignatureTypes` = 2;
public typealias `AlternativeNameType` = Int;
public const val `CAIF_DSENTRY`: UInt = 1u;
public const val `CAIF_LOCAL`: UInt = 8u;
public const val `CAIF_REGISTRY`: UInt = 4u;
public const val `CAIF_REGISTRYPARENT`: UInt = 16u;
public const val `CAIF_SHAREDFOLDERENTRY`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CAINFO` (
    public var `cbSize`: UInt,
    public var `CAType`: `ENUM_CATYPES`,
    public var `cCASignatureCerts`: UInt,
    public var `cCAExchangeCerts`: UInt,
    public var `cExitModules`: UInt,
    public var `lPropIdMax`: Int,
    public var `lRoleSeparationEnabled`: Int,
    public var `cKRACertUsedCount`: UInt,
    public var `cKRACertCount`: UInt,
    public var `fAdvancedServer`: UInt,
)
public const val `CAPATHLENGTH_INFINITE`: UInt = 4294967295u;
public const val `CAPropCertificate`: `EnrollmentCAProperty` = 7;
public const val `CAPropCertificateTypes`: `EnrollmentCAProperty` = 6;
public const val `CAPropCommonName`: `EnrollmentCAProperty` = 1;
public const val `CAPropDNSName`: `EnrollmentCAProperty` = 5;
public const val `CAPropDescription`: `EnrollmentCAProperty` = 8;
public const val `CAPropDistinguishedName`: `EnrollmentCAProperty` = 2;
public const val `CAPropRenewalOnly`: `EnrollmentCAProperty` = 12;
public const val `CAPropSanitizedName`: `EnrollmentCAProperty` = 3;
public const val `CAPropSanitizedShortName`: `EnrollmentCAProperty` = 4;
public const val `CAPropSecurity`: `EnrollmentCAProperty` = 11;
public const val `CAPropSiteName`: `EnrollmentCAProperty` = 10;
public const val `CAPropWebServers`: `EnrollmentCAProperty` = 9;
public const val `CA_ACCESS_ADMIN`: `CERTADMIN_GET_ROLES_FLAGS` = 1u;
public const val `CA_ACCESS_AUDITOR`: `CERTADMIN_GET_ROLES_FLAGS` = 4u;
public const val `CA_ACCESS_ENROLL`: `CERTADMIN_GET_ROLES_FLAGS` = 512u;
public const val `CA_ACCESS_MASKROLES`: UInt = 255u;
public const val `CA_ACCESS_OFFICER`: `CERTADMIN_GET_ROLES_FLAGS` = 2u;
public const val `CA_ACCESS_OPERATOR`: `CERTADMIN_GET_ROLES_FLAGS` = 8u;
public const val `CA_ACCESS_READ`: `CERTADMIN_GET_ROLES_FLAGS` = 256u;
public const val `CA_CRL_BASE`: UInt = 1u;
public const val `CA_CRL_DELTA`: UInt = 2u;
public const val `CA_CRL_REPUBLISH`: UInt = 16u;
public const val `CA_DISP_ERROR`: UInt = 1u;
public const val `CA_DISP_INCOMPLETE`: UInt = 0u;
public const val `CA_DISP_INVALID`: UInt = 4u;
public const val `CA_DISP_REVOKED`: UInt = 2u;
public const val `CA_DISP_UNDER_SUBMISSION`: UInt = 5u;
public const val `CA_DISP_VALID`: UInt = 3u;
// UNSUPPORTED Rust 92:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CAlternativeName: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2013_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 93:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CAlternativeNames: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2014_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 94:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CBinaryConverter: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2002_217d_11da_b2a4_000e7bbb2b09);

public const val `CCLOCKSKEWMINUTESDEFAULT`: UInt = 10u;
public const val `CC_DEFAULTCONFIG`: `CERT_GET_CONFIG_FLAGS` = 0;
public const val `CC_FIRSTCONFIG`: `CERT_GET_CONFIG_FLAGS` = 2;
public const val `CC_LOCALACTIVECONFIG`: `CERT_GET_CONFIG_FLAGS` = 4;
public const val `CC_LOCALCONFIG`: `CERT_GET_CONFIG_FLAGS` = 3;
public const val `CC_UIPICKCONFIG`: `CERT_GET_CONFIG_FLAGS` = 1;
public const val `CC_UIPICKCONFIGSKIPLOCALCA`: `CERT_GET_CONFIG_FLAGS` = 5;
// UNSUPPORTED Rust 102:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCertAdmin: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x37eabaf0_7fb6_11d0_8817_00a0c903b83c);

// UNSUPPORTED Rust 103:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCertConfig: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x372fce38_4324_11d0_8810_00a0c903b83c);

// UNSUPPORTED Rust 104:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCertEncodeAltName: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1cfc4cda_1271_11d1_9bd4_00c04fb683fa);

// UNSUPPORTED Rust 105:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCertEncodeBitString: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6d6b3cd8_1278_11d1_9bd4_00c04fb683fa);

// UNSUPPORTED Rust 106:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCertEncodeCRLDistInfo: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x01fa60a0_bbff_11d0_8825_00a0c903b83c);

// UNSUPPORTED Rust 107:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCertEncodeDateArray: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x301f77b0_a470_11d0_8821_00a0c903b83c);

// UNSUPPORTED Rust 108:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCertEncodeLongArray: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4e0680a0_a0a2_11d0_8821_00a0c903b83c);

// UNSUPPORTED Rust 109:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCertEncodeStringArray: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x19a76fe0_7494_11d0_8816_00a0c903b83c);

// UNSUPPORTED Rust 110:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCertGetConfig: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc6cc49b0_ce17_11d0_8833_00a0c903b83c);

// UNSUPPORTED Rust 111:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCertProperties: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e202f_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 112:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCertProperty: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e202e_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 113:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCertPropertyArchived: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2037_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 114:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCertPropertyArchivedKeyHash: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e203b_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 115:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCertPropertyAutoEnroll: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2032_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 116:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCertPropertyBackedUp: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2038_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 117:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCertPropertyDescription: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2031_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 118:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCertPropertyEnrollment: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2039_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 119:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCertPropertyEnrollmentPolicyServer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e204c_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 120:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCertPropertyFriendlyName: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2030_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 121:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCertPropertyKeyProvInfo: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2036_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 122:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCertPropertyRenewal: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e203a_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 123:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCertPropertyRequestOriginator: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2033_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 124:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCertPropertySHA1Hash: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2034_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 125:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCertRequest: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x98aff3f0_5524_11d0_8812_00a0c903b83c);

// UNSUPPORTED Rust 126:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCertServerExit: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4c4a5e40_732c_11d0_8816_00a0c903b83c);

// UNSUPPORTED Rust 127:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCertServerPolicy: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaa000926_ffbe_11cf_8800_00a0c903b83c);

// UNSUPPORTED Rust 128:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCertView: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa12d0f7a_1e84_11d1_9bd6_00c04fb683fa);

// UNSUPPORTED Rust 129:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCertificateAttestationChallenge: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1362ada1_eb60_456a_b6e1_118050db741b);

// UNSUPPORTED Rust 130:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCertificatePolicies: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e201f_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 131:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCertificatePolicy: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e201e_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 132:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCryptAttribute: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e202c_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 133:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCryptAttributes: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e202d_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 134:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCspInformation: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2007_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 135:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCspInformations: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2008_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 136:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CCspStatus: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2009_217d_11da_b2a4_000e7bbb2b09);

public const val `CDR_EXPIRED`: `CERT_DELETE_ROW_FLAGS` = 1;
public const val `CDR_REQUEST_LAST_CHANGED`: `CERT_DELETE_ROW_FLAGS` = 2;
public typealias `CERTADMIN_GET_ROLES_FLAGS` = UInt;
public const val `CERTENROLL_INDEX_BASE`: UInt = 0u;
public typealias `CERTENROLL_OBJECTID` = Int;
public typealias `CERTENROLL_PROPERTYID` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CERTTRANSBLOB` (
    public var `cb`: UInt,
    public var `pb`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `CERTTRANSBLOB`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `CERTTRANSBLOB`.Companion.`default`() : `CERTTRANSBLOB` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CERTVIEWRESTRICTION` (
    public var `ColumnIndex`: UInt,
    public var `SeekOperator`: Int,
    public var `SortOrder`: Int,
    public var `pbValue`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbValue`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `CERTVIEWRESTRICTION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `CERTVIEWRESTRICTION`.Companion.`default`() : `CERTVIEWRESTRICTION` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `CERT_ALT_NAME` = Int;
public const val `CERT_ALT_NAME_DIRECTORY_NAME`: `CERT_ALT_NAME` = 5;
public const val `CERT_ALT_NAME_DNS_NAME`: `CERT_ALT_NAME` = 3;
public const val `CERT_ALT_NAME_IP_ADDRESS`: `CERT_ALT_NAME` = 8;
public const val `CERT_ALT_NAME_OTHER_NAME`: `CERT_ALT_NAME` = 1;
public const val `CERT_ALT_NAME_REGISTERED_ID`: `CERT_ALT_NAME` = 9;
public const val `CERT_ALT_NAME_RFC822_NAME`: `CERT_ALT_NAME` = 2;
public const val `CERT_ALT_NAME_URL`: `CERT_ALT_NAME` = 7;
public typealias `CERT_CREATE_REQUEST_FLAGS` = Int;
public typealias `CERT_DELETE_ROW_FLAGS` = Int;
public typealias `CERT_EXIT_EVENT_MASK` = UInt;
public typealias `CERT_GET_CONFIG_FLAGS` = Int;
public typealias `CERT_IMPORT_FLAGS` = Int;
public typealias `CERT_PROPERTY_TYPE` = Int;
public typealias `CERT_REQUEST_OUT_TYPE` = Int;
public typealias `CERT_VIEW_COLUMN_INDEX` = Int;
public typealias `CERT_VIEW_SEEK_OPERATOR_FLAGS` = Int;
// UNSUPPORTED Rust 185:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CEnroll: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x43f8f289_7a20_11d0_8f06_00c04fc295e1);

// UNSUPPORTED Rust 186:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CEnroll2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x127698e4_e730_4e5c_a2b1_21490a70c8a1);

public const val `CMM_READONLY`: UInt = 2u;
public const val `CMM_REFRESHONLY`: UInt = 1u;
// UNSUPPORTED Rust 189:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CObjectId: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2000_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 190:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CObjectIds: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2001_217d_11da_b2a4_000e7bbb2b09);

public const val `CPF_BADURL_ERROR`: UInt = 32u;
public const val `CPF_BASE`: UInt = 1u;
public const val `CPF_CASTORE_ERROR`: UInt = 16u;
public const val `CPF_COMPLETE`: UInt = 4u;
public const val `CPF_DELTA`: UInt = 2u;
public const val `CPF_FILE_ERROR`: UInt = 512u;
public const val `CPF_FTP_ERROR`: UInt = 1024u;
public const val `CPF_HTTP_ERROR`: UInt = 2048u;
public const val `CPF_LDAP_ERROR`: UInt = 256u;
public const val `CPF_MANUAL`: UInt = 64u;
public const val `CPF_POSTPONED_BASE_FILE_ERROR`: UInt = 8192u;
public const val `CPF_POSTPONED_BASE_LDAP_ERROR`: UInt = 4096u;
public const val `CPF_SHADOW`: UInt = 8u;
public const val `CPF_SIGNATURE_ERROR`: UInt = 128u;
// UNSUPPORTED Rust 205:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CPolicyQualifier: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e201c_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 206:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CPolicyQualifiers: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e201d_217d_11da_b2a4_000e7bbb2b09);

public const val `CRLF_ALLOW_REQUEST_ATTRIBUTE_SUBJECT`: UInt = 65536u;
public const val `CRLF_BUILD_ROOTCA_CRLENTRIES_BASEDONKEY`: UInt = 2097152u;
public const val `CRLF_CRLNUMBER_CRITICAL`: UInt = 4u;
public const val `CRLF_DELETE_EXPIRED_CRLS`: UInt = 2u;
public const val `CRLF_DELTA_USE_OLDEST_UNEXPIRED_BASE`: UInt = 1u;
public const val `CRLF_DISABLE_CHAIN_VERIFICATION`: UInt = 1048576u;
public const val `CRLF_DISABLE_RDN_REORDER`: UInt = 2048u;
public const val `CRLF_DISABLE_ROOT_CROSS_CERTS`: UInt = 4096u;
public const val `CRLF_ENFORCE_ENROLLMENT_AGENT`: UInt = 1024u;
public const val `CRLF_IGNORE_CROSS_CERT_TRUST_ERROR`: UInt = 256u;
public const val `CRLF_IGNORE_INVALID_POLICIES`: UInt = 16u;
public const val `CRLF_IGNORE_UNKNOWN_CMC_ATTRIBUTES`: UInt = 128u;
public const val `CRLF_LOG_FULL_RESPONSE`: UInt = 8192u;
public const val `CRLF_PRESERVE_EXPIRED_CA_CERTS`: UInt = 262144u;
public const val `CRLF_PRESERVE_REVOKED_CA_CERTS`: UInt = 524288u;
public const val `CRLF_PUBLISH_EXPIRED_CERT_CRLS`: UInt = 512u;
public const val `CRLF_REBUILD_MODIFIED_SUBJECT_ONLY`: UInt = 32u;
public const val `CRLF_REVCHECK_IGNORE_NOREVCHECK`: UInt = 131072u;
public const val `CRLF_REVCHECK_IGNORE_OFFLINE`: UInt = 8u;
public const val `CRLF_SAVE_FAILED_CERTS`: UInt = 64u;
public const val `CRLF_USE_CROSS_CERT_TEMPLATE`: UInt = 32768u;
public const val `CRLF_USE_XCHG_CERT_TEMPLATE`: UInt = 16384u;
public typealias `CRLRevocationReason` = Int;
public const val `CRYPT_ENUM_ALL_PROVIDERS`: UInt = 1u;
public typealias `CR_DISP` = UInt;
public const val `CR_DISP_DENIED`: `CR_DISP` = 2u;
public const val `CR_DISP_ERROR`: `CR_DISP` = 1u;
public const val `CR_DISP_INCOMPLETE`: `CR_DISP` = 0u;
public const val `CR_DISP_ISSUED`: `CR_DISP` = 3u;
public const val `CR_DISP_ISSUED_OUT_OF_BAND`: `CR_DISP` = 4u;
public const val `CR_DISP_REVOKED`: UInt = 6u;
public const val `CR_DISP_UNDER_SUBMISSION`: `CR_DISP` = 5u;
public const val `CR_FLG_CACROSSCERT`: UInt = 128u;
public const val `CR_FLG_CAXCHGCERT`: UInt = 8u;
public const val `CR_FLG_CHALLENGEPENDING`: UInt = 1024u;
public const val `CR_FLG_CHALLENGESATISFIED`: UInt = 2048u;
public const val `CR_FLG_DEFINEDCACERT`: UInt = 512u;
public const val `CR_FLG_ENFORCEUTF8`: UInt = 256u;
public const val `CR_FLG_ENROLLONBEHALFOF`: UInt = 16u;
public const val `CR_FLG_FORCETELETEX`: UInt = 1u;
public const val `CR_FLG_FORCEUTF8`: UInt = 4u;
public const val `CR_FLG_PUBLISHERROR`: UInt = 2147483648u;
public const val `CR_FLG_RENEWAL`: UInt = 2u;
public const val `CR_FLG_SUBJECTUNMODIFIED`: UInt = 32u;
public const val `CR_FLG_TRUSTEKCERT`: UInt = 8192u;
public const val `CR_FLG_TRUSTEKKEY`: UInt = 16384u;
public const val `CR_FLG_TRUSTONUSE`: UInt = 4096u;
public const val `CR_FLG_VALIDENCRYPTEDKEYHASH`: UInt = 64u;
public const val `CR_GEMT_DEFAULT`: UInt = 0u;
public const val `CR_GEMT_HRESULT_STRING`: UInt = 1u;
public const val `CR_GEMT_HTTP_ERROR`: UInt = 2u;
public const val `CR_IN_BASE64`: `CERT_IMPORT_FLAGS` = 1;
public const val `CR_IN_BASE64HEADER`: `CERT_IMPORT_FLAGS` = 0;
public const val `CR_IN_BINARY`: `CERT_IMPORT_FLAGS` = 2;
public const val `CR_IN_CERTIFICATETRANSPARENCY`: UInt = 67108864u;
public const val `CR_IN_CHALLENGERESPONSE`: UInt = 1280u;
public const val `CR_IN_CLIENTIDNONE`: UInt = 4194304u;
public const val `CR_IN_CMC`: UInt = 1024u;
public const val `CR_IN_CONNECTONLY`: UInt = 8388608u;
public const val `CR_IN_CRLS`: UInt = 524288u;
public const val `CR_IN_ENCODEANY`: UInt = 255u;
public const val `CR_IN_ENCODEMASK`: UInt = 255u;
public const val `CR_IN_FORMATANY`: UInt = 0u;
public const val `CR_IN_FORMATMASK`: UInt = 65280u;
public const val `CR_IN_FULLRESPONSE`: UInt = 262144u;
public const val `CR_IN_HTTP`: UInt = 196608u;
public const val `CR_IN_KEYGEN`: UInt = 512u;
public const val `CR_IN_MACHINE`: UInt = 1048576u;
public const val `CR_IN_PKCS10`: UInt = 256u;
public const val `CR_IN_PKCS7`: UInt = 768u;
public const val `CR_IN_RETURNCHALLENGE`: UInt = 16777216u;
public const val `CR_IN_ROBO`: UInt = 2097152u;
public const val `CR_IN_RPC`: UInt = 131072u;
public const val `CR_IN_SCEP`: UInt = 65536u;
public const val `CR_IN_SCEPPOST`: UInt = 33554432u;
public const val `CR_IN_SIGNEDCERTIFICATETIMESTAMPLIST`: UInt = 1536u;
public const val `CR_OUT_BASE64`: `CERT_REQUEST_OUT_TYPE` = 1;
public const val `CR_OUT_BASE64HEADER`: `CERT_REQUEST_OUT_TYPE` = 0;
public const val `CR_OUT_BASE64REQUESTHEADER`: UInt = 3u;
public const val `CR_OUT_BASE64X509CRLHEADER`: UInt = 9u;
public const val `CR_OUT_BINARY`: `CERT_REQUEST_OUT_TYPE` = 2;
public const val `CR_OUT_CHAIN`: UInt = 256u;
public const val `CR_OUT_CRLS`: UInt = 512u;
public const val `CR_OUT_ENCODEMASK`: UInt = 255u;
public const val `CR_OUT_HEX`: UInt = 4u;
public const val `CR_OUT_HEXADDR`: UInt = 10u;
public const val `CR_OUT_HEXASCII`: UInt = 5u;
public const val `CR_OUT_HEXASCIIADDR`: UInt = 11u;
public const val `CR_OUT_HEXRAW`: UInt = 12u;
public const val `CR_OUT_NOCR`: UInt = 2147483648u;
public const val `CR_OUT_NOCRLF`: UInt = 1073741824u;
public const val `CR_PROP_ADVANCEDSERVER`: UInt = 28u;
public const val `CR_PROP_BASECRL`: UInt = 17u;
public const val `CR_PROP_BASECRLPUBLISHSTATUS`: UInt = 30u;
public const val `CR_PROP_CABACKWARDCROSSCERT`: UInt = 36u;
public const val `CR_PROP_CABACKWARDCROSSCERTSTATE`: UInt = 38u;
public const val `CR_PROP_CACERTSTATE`: UInt = 19u;
public const val `CR_PROP_CACERTSTATUSCODE`: UInt = 34u;
public const val `CR_PROP_CACERTVERSION`: UInt = 39u;
public const val `CR_PROP_CAFORWARDCROSSCERT`: UInt = 35u;
public const val `CR_PROP_CAFORWARDCROSSCERTSTATE`: UInt = 37u;
public const val `CR_PROP_CANAME`: UInt = 6u;
public const val `CR_PROP_CAPROPIDMAX`: UInt = 21u;
public const val `CR_PROP_CASIGCERT`: UInt = 12u;
public const val `CR_PROP_CASIGCERTCHAIN`: UInt = 13u;
public const val `CR_PROP_CASIGCERTCOUNT`: UInt = 11u;
public const val `CR_PROP_CASIGCERTCRLCHAIN`: UInt = 32u;
public const val `CR_PROP_CATYPE`: UInt = 10u;
public const val `CR_PROP_CAXCHGCERT`: UInt = 15u;
public const val `CR_PROP_CAXCHGCERTCHAIN`: UInt = 16u;
public const val `CR_PROP_CAXCHGCERTCOUNT`: UInt = 14u;
public const val `CR_PROP_CAXCHGCERTCRLCHAIN`: UInt = 33u;
public const val `CR_PROP_CERTAIAOCSPURLS`: UInt = 43u;
public const val `CR_PROP_CERTAIAURLS`: UInt = 42u;
public const val `CR_PROP_CERTCDPURLS`: UInt = 41u;
public const val `CR_PROP_CRLSTATE`: UInt = 20u;
public const val `CR_PROP_DELTACRL`: UInt = 18u;
public const val `CR_PROP_DELTACRLPUBLISHSTATUS`: UInt = 31u;
public const val `CR_PROP_DNSNAME`: UInt = 22u;
public const val `CR_PROP_EXITCOUNT`: UInt = 3u;
public const val `CR_PROP_EXITDESCRIPTION`: UInt = 4u;
public const val `CR_PROP_FILEVERSION`: UInt = 1u;
public const val `CR_PROP_KRACERT`: UInt = 26u;
public const val `CR_PROP_KRACERTCOUNT`: UInt = 25u;
public const val `CR_PROP_KRACERTSTATE`: UInt = 27u;
public const val `CR_PROP_KRACERTUSEDCOUNT`: UInt = 24u;
public const val `CR_PROP_LOCALENAME`: UInt = 44u;
public const val `CR_PROP_NONE`: UInt = 0u;
public const val `CR_PROP_PARENTCA`: UInt = 9u;
public const val `CR_PROP_POLICYDESCRIPTION`: UInt = 5u;
public const val `CR_PROP_PRODUCTVERSION`: UInt = 2u;
public const val `CR_PROP_ROLESEPARATIONENABLED`: UInt = 23u;
public const val `CR_PROP_SANITIZEDCANAME`: UInt = 7u;
public const val `CR_PROP_SANITIZEDCASHORTNAME`: UInt = 40u;
public const val `CR_PROP_SCEPMAX`: UInt = 1002u;
public const val `CR_PROP_SCEPMIN`: UInt = 1000u;
public const val `CR_PROP_SCEPSERVERCAPABILITIES`: UInt = 1001u;
public const val `CR_PROP_SCEPSERVERCERTS`: UInt = 1000u;
public const val `CR_PROP_SCEPSERVERCERTSCHAIN`: UInt = 1002u;
public const val `CR_PROP_SHAREDFOLDER`: UInt = 8u;
public const val `CR_PROP_SUBJECTTEMPLATE_OIDS`: UInt = 45u;
public const val `CR_PROP_TEMPLATES`: UInt = 29u;
public const val `CSBACKUP_DISABLE_INCREMENTAL`: UInt = 4294967295u;
public typealias `CSBACKUP_TYPE` = UInt;
public const val `CSBACKUP_TYPE_FULL`: `CSBACKUP_TYPE` = 1u;
public const val `CSBACKUP_TYPE_LOGS_ONLY`: `CSBACKUP_TYPE` = 2u;
public const val `CSBACKUP_TYPE_MASK`: UInt = 3u;
public const val `CSBFT_DATABASE_DIRECTORY`: UInt = 64u;
public const val `CSBFT_DIRECTORY`: UInt = 128u;
public const val `CSBFT_LOG_DIRECTORY`: UInt = 32u;
public const val `CSCONTROL_RESTART`: ULong = 3uL;
public const val `CSCONTROL_SHUTDOWN`: ULong = 1uL;
public const val `CSCONTROL_SUSPEND`: ULong = 2uL;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CSEDB_RSTMAPW` (
    public var `pwszDatabaseName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszNewDatabaseName`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `CSEDB_RSTMAPW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `CSEDB_RSTMAPW`.Companion.`default`() : `CSEDB_RSTMAPW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `CSRESTORE_TYPE_CATCHUP`: UInt = 4u;
public const val `CSRESTORE_TYPE_FULL`: UInt = 1u;
public const val `CSRESTORE_TYPE_MASK`: UInt = 5u;
public const val `CSRESTORE_TYPE_ONLINE`: UInt = 2u;
public const val `CSURL_ADDTOCERTCDP`: UInt = 2u;
public const val `CSURL_ADDTOCERTOCSP`: UInt = 32u;
public const val `CSURL_ADDTOCRLCDP`: UInt = 8u;
public const val `CSURL_ADDTOFRESHESTCRL`: UInt = 4u;
public const val `CSURL_ADDTOIDP`: UInt = 128u;
public const val `CSURL_PUBLISHRETRY`: UInt = 16u;
public const val `CSURL_SERVERPUBLISH`: UInt = 1u;
public const val `CSURL_SERVERPUBLISHDELTA`: UInt = 64u;
public const val `CSVER_MAJOR`: UInt = 7u;
public const val `CSVER_MAJOR_LONGHORN`: UInt = 3u;
public const val `CSVER_MAJOR_THRESHOLD`: UInt = 7u;
public const val `CSVER_MAJOR_WHISTLER`: UInt = 2u;
public const val `CSVER_MAJOR_WIN2K`: UInt = 1u;
public const val `CSVER_MAJOR_WIN7`: UInt = 4u;
public const val `CSVER_MAJOR_WIN8`: UInt = 5u;
public const val `CSVER_MAJOR_WINBLUE`: UInt = 6u;
public const val `CSVER_MINOR`: UInt = 1u;
public const val `CSVER_MINOR_LONGHORN_BETA1`: UInt = 1u;
public const val `CSVER_MINOR_THRESHOLD`: UInt = 1u;
public const val `CSVER_MINOR_WHISTLER_BETA2`: UInt = 1u;
public const val `CSVER_MINOR_WHISTLER_BETA3`: UInt = 2u;
public const val `CSVER_MINOR_WIN2K`: UInt = 1u;
public const val `CSVER_MINOR_WIN7`: UInt = 1u;
public const val `CSVER_MINOR_WIN8`: UInt = 1u;
public const val `CSVER_MINOR_WINBLUE`: UInt = 1u;
// UNSUPPORTED Rust 400:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CSignerCertificate: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e203d_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 401:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CSmimeCapabilities: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e201a_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 402:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CSmimeCapability: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2019_217d_11da_b2a4_000e7bbb2b09);

public const val `CVIEWAGEMINUTESDEFAULT`: UInt = 16u;
public typealias `CVRC_COLUMN` = Int;
public const val `CVRC_COLUMN_MASK`: `CVRC_COLUMN` = 4095;
public const val `CVRC_COLUMN_RESULT`: `CVRC_COLUMN` = 1;
public const val `CVRC_COLUMN_SCHEMA`: `CVRC_COLUMN` = 0;
public const val `CVRC_COLUMN_VALUE`: `CVRC_COLUMN` = 2;
public typealias `CVRC_TABLE` = Int;
public const val `CVRC_TABLE_ATTRIBUTES`: `CVRC_TABLE` = 16384;
public const val `CVRC_TABLE_CRL`: `CVRC_TABLE` = 20480;
public const val `CVRC_TABLE_EXTENSIONS`: `CVRC_TABLE` = 12288;
public const val `CVRC_TABLE_MASK`: UInt = 61440u;
public const val `CVRC_TABLE_REQCERT`: `CVRC_TABLE` = 0;
public const val `CVRC_TABLE_SHIFT`: UInt = 12u;
public const val `CVR_SEEK_EQ`: `CERT_VIEW_SEEK_OPERATOR_FLAGS` = 1;
public const val `CVR_SEEK_GE`: `CERT_VIEW_SEEK_OPERATOR_FLAGS` = 8;
public const val `CVR_SEEK_GT`: `CERT_VIEW_SEEK_OPERATOR_FLAGS` = 16;
public const val `CVR_SEEK_LE`: `CERT_VIEW_SEEK_OPERATOR_FLAGS` = 4;
public const val `CVR_SEEK_LT`: `CERT_VIEW_SEEK_OPERATOR_FLAGS` = 2;
public const val `CVR_SEEK_MASK`: UInt = 255u;
public const val `CVR_SEEK_NODELTA`: UInt = 4096u;
public const val `CVR_SEEK_NONE`: UInt = 0u;
public const val `CVR_SORT_ASCEND`: UInt = 1u;
public const val `CVR_SORT_DESCEND`: UInt = 2u;
public const val `CVR_SORT_NONE`: UInt = 0u;
public const val `CV_COLUMN_ATTRIBUTE_DEFAULT`: Int = -5;
public const val `CV_COLUMN_CRL_DEFAULT`: Int = -6;
public const val `CV_COLUMN_EXTENSION_DEFAULT`: Int = -4;
public const val `CV_COLUMN_LOG_DEFAULT`: `CERT_VIEW_COLUMN_INDEX` = -2;
public const val `CV_COLUMN_LOG_FAILED_DEFAULT`: `CERT_VIEW_COLUMN_INDEX` = -3;
public const val `CV_COLUMN_LOG_REVOKED_DEFAULT`: Int = -7;
public const val `CV_COLUMN_QUEUE_DEFAULT`: `CERT_VIEW_COLUMN_INDEX` = -1;
public const val `CV_OUT_BASE64`: `ENUM_CERT_COLUMN_VALUE_FLAGS` = 1;
public const val `CV_OUT_BASE64HEADER`: `ENUM_CERT_COLUMN_VALUE_FLAGS` = 0;
public const val `CV_OUT_BASE64REQUESTHEADER`: `ENUM_CERT_COLUMN_VALUE_FLAGS` = 3;
public const val `CV_OUT_BASE64X509CRLHEADER`: `ENUM_CERT_COLUMN_VALUE_FLAGS` = 9;
public const val `CV_OUT_BINARY`: `ENUM_CERT_COLUMN_VALUE_FLAGS` = 2;
public const val `CV_OUT_ENCODEMASK`: UInt = 255u;
public const val `CV_OUT_HEX`: `ENUM_CERT_COLUMN_VALUE_FLAGS` = 4;
public const val `CV_OUT_HEXADDR`: `ENUM_CERT_COLUMN_VALUE_FLAGS` = 10;
public const val `CV_OUT_HEXASCII`: `ENUM_CERT_COLUMN_VALUE_FLAGS` = 5;
public const val `CV_OUT_HEXASCIIADDR`: `ENUM_CERT_COLUMN_VALUE_FLAGS` = 11;
public const val `CV_OUT_HEXRAW`: UInt = 12u;
public const val `CV_OUT_NOCR`: UInt = 2147483648u;
public const val `CV_OUT_NOCRLF`: UInt = 1073741824u;
// UNSUPPORTED Rust 447:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX500DistinguishedName: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2003_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 448:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509Attribute: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2022_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 449:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509AttributeArchiveKey: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2027_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 450:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509AttributeArchiveKeyHash: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2028_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 451:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509AttributeClientId: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2025_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 452:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509AttributeCspProvider: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e202b_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 453:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509AttributeExtensions: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2024_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 454:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509AttributeOSVersion: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e202a_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 455:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509AttributeRenewalCertificate: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2026_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 456:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509Attributes: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2023_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 457:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509CertificateRequestCertificate: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2043_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 458:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509CertificateRequestCmc: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2045_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 459:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509CertificateRequestPkcs10: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2042_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 460:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509CertificateRequestPkcs7: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2044_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 461:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509CertificateRevocationList: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2060_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 462:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509CertificateRevocationListEntries: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e205f_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 463:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509CertificateRevocationListEntry: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e205e_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 464:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509CertificateTemplateADWritable: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8336e323_2e6a_4a04_937c_548f681839b3);

// UNSUPPORTED Rust 465:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509EndorsementKey: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x11a25a1d_b9a3_4edd_af83_3b59adbed361);

// UNSUPPORTED Rust 466:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509Enrollment: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2046_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 467:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509EnrollmentHelper: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2050_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 468:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509EnrollmentPolicyActiveDirectory: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x91f39027_217f_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 469:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509EnrollmentPolicyWebService: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x91f39028_217f_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 470:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509EnrollmentWebClassFactory: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2049_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 471:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509Extension: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e200d_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 472:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509ExtensionAlternativeNames: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2015_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 473:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509ExtensionAuthorityKeyIdentifier: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2018_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 474:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509ExtensionBasicConstraints: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2016_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 475:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509ExtensionCertificatePolicies: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2020_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 476:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509ExtensionEnhancedKeyUsage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2010_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 477:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509ExtensionKeyUsage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e200f_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 478:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509ExtensionMSApplicationPolicies: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2021_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 479:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509ExtensionSmimeCapabilities: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e201b_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 480:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509ExtensionSubjectKeyIdentifier: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2017_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 481:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509ExtensionTemplate: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2012_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 482:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509ExtensionTemplateName: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2011_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 483:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509Extensions: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e200e_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 484:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509MachineEnrollmentFactory: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2051_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 485:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509NameValuePair: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e203f_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 486:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509PolicyServerListManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x91f39029_217f_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 487:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509PolicyServerUrl: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x91f3902a_217f_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 488:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509PrivateKey: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e200c_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 489:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509PublicKey: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e200b_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 490:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509SCEPEnrollment: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2061_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 491:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CX509SCEPEnrollmentHelper: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2062_217d_11da_b2a4_000e7bbb2b09);

public const val `ClientIdAutoEnroll`: `RequestClientInfoClientId` = 6;
public const val `ClientIdAutoEnroll2003`: `RequestClientInfoClientId` = 2;
public const val `ClientIdCertReq`: `RequestClientInfoClientId` = 9;
public const val `ClientIdCertReq2003`: `RequestClientInfoClientId` = 4;
public const val `ClientIdDefaultRequest`: `RequestClientInfoClientId` = 5;
public const val `ClientIdEOBO`: `RequestClientInfoClientId` = 8;
public const val `ClientIdNone`: `RequestClientInfoClientId` = 0;
public const val `ClientIdRequestWizard`: `RequestClientInfoClientId` = 7;
public const val `ClientIdTest`: `RequestClientInfoClientId` = 10;
public const val `ClientIdUserStart`: `RequestClientInfoClientId` = 1000;
public const val `ClientIdWinRT`: `RequestClientInfoClientId` = 11;
public const val `ClientIdWizard2003`: `RequestClientInfoClientId` = 3;
public const val `ClientIdXEnroll2003`: `RequestClientInfoClientId` = 1;
public const val `CommitFlagDeleteTemplate`: `CommitTemplateFlags` = 4;
public const val `CommitFlagSaveTemplateGenerateOID`: `CommitTemplateFlags` = 1;
public const val `CommitFlagSaveTemplateOverwrite`: `CommitTemplateFlags` = 3;
public const val `CommitFlagSaveTemplateUseCurrentOID`: `CommitTemplateFlags` = 2;
public typealias `CommitTemplateFlags` = Int;
public const val `ContextAdministratorForceMachine`: `X509CertificateEnrollmentContext` = 3;
public const val `ContextMachine`: `X509CertificateEnrollmentContext` = 2;
public const val `ContextNone`: `X509CertificateEnrollmentContext` = 0;
public const val `ContextUser`: `X509CertificateEnrollmentContext` = 1;
public const val `DBFLAGS_CHECKPOINTDEPTH60MB`: UInt = 32u;
public const val `DBFLAGS_CIRCULARLOGGING`: UInt = 4u;
public const val `DBFLAGS_CREATEIFNEEDED`: UInt = 2u;
public const val `DBFLAGS_DISABLESNAPSHOTBACKUP`: UInt = 1024u;
public const val `DBFLAGS_ENABLEVOLATILEREQUESTS`: UInt = 2048u;
public const val `DBFLAGS_LAZYFLUSH`: UInt = 8u;
public const val `DBFLAGS_LOGBUFFERSHUGE`: UInt = 128u;
public const val `DBFLAGS_LOGBUFFERSLARGE`: UInt = 64u;
public const val `DBFLAGS_LOGFILESIZE16MB`: UInt = 256u;
public const val `DBFLAGS_MAXCACHESIZEX100`: UInt = 16u;
public const val `DBFLAGS_MULTITHREADTRANSACTIONS`: UInt = 512u;
public const val `DBFLAGS_READONLY`: UInt = 1u;
public const val `DBG_CERTSRV`: UInt = 1u;
public const val `DBSESSIONCOUNTDEFAULT`: UInt = 100u;
public const val `DB_DISP_ACTIVE`: UInt = 8u;
public const val `DB_DISP_CA_CERT`: UInt = 15u;
public const val `DB_DISP_CA_CERT_CHAIN`: UInt = 16u;
public const val `DB_DISP_DENIED`: UInt = 31u;
public const val `DB_DISP_ERROR`: UInt = 30u;
public const val `DB_DISP_FOREIGN`: UInt = 12u;
public const val `DB_DISP_ISSUED`: UInt = 20u;
public const val `DB_DISP_KRA_CERT`: UInt = 17u;
public const val `DB_DISP_LOG_FAILED_MIN`: UInt = 30u;
public const val `DB_DISP_LOG_MIN`: UInt = 20u;
public const val `DB_DISP_PENDING`: UInt = 9u;
public const val `DB_DISP_QUEUE_MAX`: UInt = 9u;
public const val `DB_DISP_REVOKED`: UInt = 21u;
public const val `DefaultNone`: `EnrollmentPolicyServerPropertyFlags` = 0;
public const val `DefaultPolicyServer`: `EnrollmentPolicyServerPropertyFlags` = 1;
public typealias `DelayRetryAction` = Int;
public const val `DelayRetryLong`: `DelayRetryAction` = 3;
public const val `DelayRetryNone`: `DelayRetryAction` = 1;
public const val `DelayRetryPastSuccess`: `DelayRetryAction` = 5;
public const val `DelayRetryShort`: `DelayRetryAction` = 2;
public const val `DelayRetrySuccess`: `DelayRetryAction` = 4;
public const val `DelayRetryUnknown`: `DelayRetryAction` = 0;
public const val `DisableGroupPolicyList`: `EnrollmentPolicyFlags` = 2;
public const val `DisableUserServerList`: `EnrollmentPolicyFlags` = 4;
public const val `DisplayNo`: `EnrollmentDisplayStatus` = 0;
public const val `DisplayYes`: `EnrollmentDisplayStatus` = 1;
public const val `EANR_SUPPRESS_IA5CONVERSION`: UInt = 2147483648u;
public const val `EAN_NAMEOBJECTID`: UInt = 2147483648u;
public const val `EDITF_ADDOLDCERTTYPE`: UInt = 16u;
public const val `EDITF_ADDOLDKEYUSAGE`: UInt = 8u;
public const val `EDITF_ATTRIBUTECA`: UInt = 512u;
public const val `EDITF_ATTRIBUTEEKU`: UInt = 32768u;
public const val `EDITF_ATTRIBUTEENDDATE`: UInt = 32u;
public const val `EDITF_ATTRIBUTESUBJECTALTNAME2`: UInt = 262144u;
public const val `EDITF_AUDITCERTTEMPLATELOAD`: UInt = 2097152u;
public const val `EDITF_BASICCONSTRAINTSCA`: UInt = 128u;
public const val `EDITF_BASICCONSTRAINTSCRITICAL`: UInt = 64u;
public const val `EDITF_DISABLEEXTENSIONLIST`: UInt = 4u;
public const val `EDITF_DISABLELDAPPACKAGELIST`: UInt = 8388608u;
public const val `EDITF_DISABLEOLDOSCNUPN`: UInt = 4194304u;
public const val `EDITF_EMAILOPTIONAL`: UInt = 131072u;
public const val `EDITF_ENABLEAKICRITICAL`: UInt = 8192u;
public const val `EDITF_ENABLEAKIISSUERNAME`: UInt = 2048u;
public const val `EDITF_ENABLEAKIISSUERSERIAL`: UInt = 4096u;
public const val `EDITF_ENABLEAKIKEYID`: UInt = 256u;
public const val `EDITF_ENABLECHASECLIENTDC`: UInt = 1048576u;
public const val `EDITF_ENABLEDEFAULTSMIME`: UInt = 65536u;
public const val `EDITF_ENABLEKEYENCIPHERMENTCACERT`: UInt = 134217728u;
public const val `EDITF_ENABLELDAPREFERRALS`: UInt = 524288u;
public const val `EDITF_ENABLEOCSPREVNOCHECK`: UInt = 33554432u;
public const val `EDITF_ENABLERENEWONBEHALFOF`: UInt = 67108864u;
public const val `EDITF_ENABLEREQUESTEXTENSIONS`: UInt = 1u;
public const val `EDITF_ENABLEUPNMAP`: UInt = 16777216u;
public const val `EDITF_IGNOREREQUESTERGROUP`: UInt = 1024u;
public const val `EDITF_REQUESTEXTENSIONLIST`: UInt = 2u;
public const val `EDITF_SERVERUPGRADED`: UInt = 16384u;
public const val `ENUMEXT_OBJECTID`: UInt = 1u;
public typealias `ENUM_CATYPES` = Int;
public typealias `ENUM_CERT_COLUMN_VALUE_FLAGS` = Int;
public const val `ENUM_ENTERPRISE_ROOTCA`: `ENUM_CATYPES` = 0;
public const val `ENUM_ENTERPRISE_SUBCA`: `ENUM_CATYPES` = 1;
public const val `ENUM_STANDALONE_ROOTCA`: `ENUM_CATYPES` = 3;
public const val `ENUM_STANDALONE_SUBCA`: `ENUM_CATYPES` = 4;
public const val `ENUM_UNKNOWN_CA`: `ENUM_CATYPES` = 5;
public const val `EXITEVENT_CERTDENIED`: `CERT_EXIT_EVENT_MASK` = 4u;
public const val `EXITEVENT_CERTIMPORTED`: UInt = 512u;
public const val `EXITEVENT_CERTISSUED`: `CERT_EXIT_EVENT_MASK` = 1u;
public const val `EXITEVENT_CERTPENDING`: `CERT_EXIT_EVENT_MASK` = 2u;
public const val `EXITEVENT_CERTRETRIEVEPENDING`: `CERT_EXIT_EVENT_MASK` = 16u;
public const val `EXITEVENT_CERTREVOKED`: `CERT_EXIT_EVENT_MASK` = 8u;
public const val `EXITEVENT_CRLISSUED`: `CERT_EXIT_EVENT_MASK` = 32u;
public const val `EXITEVENT_INVALID`: UInt = 0u;
public const val `EXITEVENT_SHUTDOWN`: `CERT_EXIT_EVENT_MASK` = 64u;
public const val `EXITEVENT_STARTUP`: UInt = 128u;
public const val `EXITPUB_ACTIVEDIRECTORY`: UInt = 2u;
public const val `EXITPUB_DEFAULT_ENTERPRISE`: UInt = 2u;
public const val `EXITPUB_DEFAULT_STANDALONE`: UInt = 1u;
public const val `EXITPUB_FILE`: UInt = 1u;
public const val `EXITPUB_REMOVEOLDCERTS`: UInt = 16u;
public const val `EXTENSION_CRITICAL_FLAG`: UInt = 1u;
public const val `EXTENSION_DELETE_FLAG`: UInt = 4u;
public const val `EXTENSION_DISABLE_FLAG`: UInt = 2u;
public const val `EXTENSION_ORIGIN_ADMIN`: UInt = 196608u;
public const val `EXTENSION_ORIGIN_CACERT`: UInt = 589824u;
public const val `EXTENSION_ORIGIN_CMC`: UInt = 524288u;
public const val `EXTENSION_ORIGIN_IMPORTEDCERT`: UInt = 393216u;
public const val `EXTENSION_ORIGIN_MASK`: UInt = 983040u;
public const val `EXTENSION_ORIGIN_PKCS7`: UInt = 458752u;
public const val `EXTENSION_ORIGIN_POLICY`: UInt = 131072u;
public const val `EXTENSION_ORIGIN_RENEWALCERT`: UInt = 327680u;
public const val `EXTENSION_ORIGIN_REQUEST`: UInt = 65536u;
public const val `EXTENSION_ORIGIN_SERVER`: UInt = 262144u;
public const val `EXTENSION_POLICY_MASK`: UInt = 65535u;
public typealias `EncodingType` = Int;
public const val `EnrollDenied`: `EnrollmentEnrollStatus` = 256;
public const val `EnrollError`: `EnrollmentEnrollStatus` = 16;
public const val `EnrollPended`: `EnrollmentEnrollStatus` = 2;
public const val `EnrollPrompt`: `WebEnrollmentFlags` = 1;
public const val `EnrollSkipped`: `EnrollmentEnrollStatus` = 64;
public const val `EnrollUIDeferredEnrollmentRequired`: `EnrollmentEnrollStatus` = 4;
public const val `EnrollUnknown`: `EnrollmentEnrollStatus` = 32;
public const val `Enrolled`: `EnrollmentEnrollStatus` = 1;
public const val `EnrollmentAddOCSPNoCheck`: `X509CertificateTemplateEnrollmentFlag` = 4096;
public const val `EnrollmentAddTemplateName`: `X509CertificateTemplateEnrollmentFlag` = 512;
public const val `EnrollmentAllowEnrollOnBehalfOf`: `X509CertificateTemplateEnrollmentFlag` = 2048;
public const val `EnrollmentAutoEnrollment`: `X509CertificateTemplateEnrollmentFlag` = 32;
public const val `EnrollmentAutoEnrollmentCheckUserDSCertificate`: `X509CertificateTemplateEnrollmentFlag` = 16;
public typealias `EnrollmentCAProperty` = Int;
public const val `EnrollmentCertificateIssuancePoliciesFromRequest`: `X509CertificateTemplateEnrollmentFlag` = 131072;
public typealias `EnrollmentDisplayStatus` = Int;
public const val `EnrollmentDomainAuthenticationNotRequired`: `X509CertificateTemplateEnrollmentFlag` = 128;
public typealias `EnrollmentEnrollStatus` = Int;
public const val `EnrollmentIncludeBasicConstraintsForEECerts`: `X509CertificateTemplateEnrollmentFlag` = 32768;
public const val `EnrollmentIncludeSymmetricAlgorithms`: `X509CertificateTemplateEnrollmentFlag` = 1;
public const val `EnrollmentNoRevocationInfoInCerts`: `X509CertificateTemplateEnrollmentFlag` = 16384;
public const val `EnrollmentPendAllRequests`: `X509CertificateTemplateEnrollmentFlag` = 2;
public typealias `EnrollmentPolicyFlags` = Int;
public typealias `EnrollmentPolicyServerPropertyFlags` = Int;
public const val `EnrollmentPreviousApprovalKeyBasedValidateReenrollment`: `X509CertificateTemplateEnrollmentFlag` = 65536;
public const val `EnrollmentPreviousApprovalValidateReenrollment`: `X509CertificateTemplateEnrollmentFlag` = 64;
public const val `EnrollmentPublishToDS`: `X509CertificateTemplateEnrollmentFlag` = 8;
public const val `EnrollmentPublishToKRAContainer`: `X509CertificateTemplateEnrollmentFlag` = 4;
public const val `EnrollmentRemoveInvalidCertificateFromPersonalStore`: `X509CertificateTemplateEnrollmentFlag` = 1024;
public const val `EnrollmentReuseKeyOnFullSmartCard`: `X509CertificateTemplateEnrollmentFlag` = 8192;
public typealias `EnrollmentSelectionStatus` = Int;
public const val `EnrollmentSkipAutoRenewal`: `X509CertificateTemplateEnrollmentFlag` = 262144;
public typealias `EnrollmentTemplateProperty` = Int;
public const val `EnrollmentUserInteractionRequired`: `X509CertificateTemplateEnrollmentFlag` = 256;
public const val `ExportCAs`: `X509EnrollmentPolicyExportFlags` = 4;
public const val `ExportOIDs`: `X509EnrollmentPolicyExportFlags` = 2;
public const val `ExportTemplates`: `X509EnrollmentPolicyExportFlags` = 1;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FNCERTSRVBACKUPCLOSE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FNCERTSRVBACKUPEND` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FNCERTSRVBACKUPFREE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FNCERTSRVBACKUPGETBACKUPLOGSW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FNCERTSRVBACKUPGETDATABASENAMESW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FNCERTSRVBACKUPGETDYNAMICFILELISTW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FNCERTSRVBACKUPOPENFILEW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`PCWSTR`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FNCERTSRVBACKUPPREPAREW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FNCERTSRVBACKUPREAD` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FNCERTSRVBACKUPTRUNCATELOGS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FNCERTSRVISSERVERONLINEW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FNCERTSRVRESTOREEND` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FNCERTSRVRESTOREGETDATABASELOCATIONSW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FNCERTSRVRESTOREPREPAREW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FNCERTSRVRESTOREREGISTERCOMPLETE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`HRESULT`) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FNCERTSRVRESTOREREGISTERW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`CSEDB_RSTMAPW`>?, Int, `windows_sys`.`core`.`PCWSTR`, UInt, UInt) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FNCERTSRVSERVERCONTROLW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FNIMPORTPFXTOPROVIDER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HWND`, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt, `ImportPFXFlags`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`super`.`CERT_CONTEXT`>>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FNIMPORTPFXTOPROVIDERFREEDATA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`CERT_CONTEXT`>>?) -> Unit>>>;
public const val `FR_PROP_ATTESTATIONCHALLENGE`: `FULL_RESPONSE_PROPERTY_ID` = 20;
public const val `FR_PROP_ATTESTATIONPROVIDERNAME`: `FULL_RESPONSE_PROPERTY_ID` = 21;
public const val `FR_PROP_BODYPARTSTRING`: `FULL_RESPONSE_PROPERTY_ID` = 3;
public const val `FR_PROP_CAEXCHANGECERTIFICATE`: `FULL_RESPONSE_PROPERTY_ID` = 17;
public const val `FR_PROP_CAEXCHANGECERTIFICATECHAIN`: `FULL_RESPONSE_PROPERTY_ID` = 18;
public const val `FR_PROP_CAEXCHANGECERTIFICATECRLCHAIN`: `FULL_RESPONSE_PROPERTY_ID` = 19;
public const val `FR_PROP_CAEXCHANGECERTIFICATEHASH`: `FULL_RESPONSE_PROPERTY_ID` = 16;
public const val `FR_PROP_CLAIMCHALLENGE`: UInt = 22u;
public const val `FR_PROP_ENCRYPTEDKEYHASH`: `FULL_RESPONSE_PROPERTY_ID` = 14;
public const val `FR_PROP_FAILINFO`: `FULL_RESPONSE_PROPERTY_ID` = 7;
public const val `FR_PROP_FULLRESPONSE`: `FULL_RESPONSE_PROPERTY_ID` = 1;
public const val `FR_PROP_FULLRESPONSENOPKCS7`: `FULL_RESPONSE_PROPERTY_ID` = 15;
public const val `FR_PROP_ISSUEDCERTIFICATE`: `FULL_RESPONSE_PROPERTY_ID` = 11;
public const val `FR_PROP_ISSUEDCERTIFICATECHAIN`: `FULL_RESPONSE_PROPERTY_ID` = 12;
public const val `FR_PROP_ISSUEDCERTIFICATECRLCHAIN`: `FULL_RESPONSE_PROPERTY_ID` = 13;
public const val `FR_PROP_ISSUEDCERTIFICATEHASH`: `FULL_RESPONSE_PROPERTY_ID` = 10;
public const val `FR_PROP_NONE`: `FULL_RESPONSE_PROPERTY_ID` = 0;
public const val `FR_PROP_OTHERINFOCHOICE`: `FULL_RESPONSE_PROPERTY_ID` = 6;
public const val `FR_PROP_PENDINFOTIME`: `FULL_RESPONSE_PROPERTY_ID` = 9;
public const val `FR_PROP_PENDINFOTOKEN`: `FULL_RESPONSE_PROPERTY_ID` = 8;
public const val `FR_PROP_STATUS`: `FULL_RESPONSE_PROPERTY_ID` = 4;
public const val `FR_PROP_STATUSINFOCOUNT`: `FULL_RESPONSE_PROPERTY_ID` = 2;
public const val `FR_PROP_STATUSSTRING`: `FULL_RESPONSE_PROPERTY_ID` = 5;
public typealias `FULL_RESPONSE_PROPERTY_ID` = Int;
public const val `GeneralCA`: `X509CertificateTemplateGeneralFlag` = 128;
public const val `GeneralCrossCA`: `X509CertificateTemplateGeneralFlag` = 2048;
public const val `GeneralDefault`: `X509CertificateTemplateGeneralFlag` = 65536;
public const val `GeneralDonotPersist`: `X509CertificateTemplateGeneralFlag` = 4096;
public const val `GeneralMachineType`: `X509CertificateTemplateGeneralFlag` = 64;
public const val `GeneralModified`: `X509CertificateTemplateGeneralFlag` = 131072;
public const val `ICF_ALLOWFOREIGN`: UInt = 65536u;
public const val `ICF_EXISTINGROW`: UInt = 131072u;
public const val `IF_ENABLEADMINASAUDITOR`: UInt = 4096u;
public const val `IF_ENABLEEXITKEYRETRIEVAL`: UInt = 2048u;
public const val `IF_ENFORCEENCRYPTICERTADMIN`: UInt = 1024u;
public const val `IF_ENFORCEENCRYPTICERTREQUEST`: UInt = 512u;
public const val `IF_LOCKICERTREQUEST`: UInt = 1u;
public const val `IF_NOLOCALICERTADMIN`: UInt = 32u;
public const val `IF_NOLOCALICERTADMINBACKUP`: UInt = 128u;
public const val `IF_NOLOCALICERTREQUEST`: UInt = 4u;
public const val `IF_NOREMOTEICERTADMIN`: UInt = 16u;
public const val `IF_NOREMOTEICERTADMINBACKUP`: UInt = 64u;
public const val `IF_NOREMOTEICERTREQUEST`: UInt = 2u;
public const val `IF_NORPCICERTREQUEST`: UInt = 8u;
public const val `IF_NOSNAPSHOTBACKUP`: UInt = 256u;
public const val `IKF_OVERWRITE`: UInt = 65536u;
public const val `ISSCERT_DEFAULT_DS`: UInt = 256u;
public const val `ISSCERT_DEFAULT_NODS`: UInt = 256u;
public const val `ISSCERT_ENABLE`: UInt = 256u;
public const val `ISSCERT_FILEURL_OLD`: UInt = 8u;
public const val `ISSCERT_FTPURL_OLD`: UInt = 4u;
public const val `ISSCERT_HTTPURL_OLD`: UInt = 2u;
public const val `ISSCERT_LDAPURL_OLD`: UInt = 1u;
public const val `ISSCERT_URLMASK_OLD`: UInt = 255u;
public const val `ImportExportable`: `ImportPFXFlags` = 16;
public const val `ImportExportableEncrypted`: `ImportPFXFlags` = 32;
public const val `ImportForceOverwrite`: `ImportPFXFlags` = 2;
public const val `ImportInstallCertificate`: `ImportPFXFlags` = 512;
public const val `ImportInstallChain`: `ImportPFXFlags` = 1024;
public const val `ImportInstallChainAndRoot`: `ImportPFXFlags` = 2048;
public const val `ImportMachineContext`: `ImportPFXFlags` = 1;
public const val `ImportNoUserProtected`: `ImportPFXFlags` = 64;
public const val `ImportNone`: `ImportPFXFlags` = 0;
public typealias `ImportPFXFlags` = Int;
public const val `ImportSaveProperties`: `ImportPFXFlags` = 8;
public const val `ImportSilent`: `ImportPFXFlags` = 4;
public const val `ImportUserProtected`: `ImportPFXFlags` = 128;
public const val `ImportUserProtectedHigh`: `ImportPFXFlags` = 256;
public const val `InheritDefault`: `X509RequestInheritOptions` = 0;
public const val `InheritExtensionsFlag`: `X509RequestInheritOptions` = 256;
public const val `InheritKeyMask`: `X509RequestInheritOptions` = 15;
public const val `InheritNewDefaultKey`: `X509RequestInheritOptions` = 1;
public const val `InheritNewSimilarKey`: `X509RequestInheritOptions` = 2;
public const val `InheritNone`: `X509RequestInheritOptions` = 16;
public const val `InheritPrivateKey`: `X509RequestInheritOptions` = 3;
public const val `InheritPublicKey`: `X509RequestInheritOptions` = 4;
public const val `InheritRenewalCertificateFlag`: `X509RequestInheritOptions` = 32;
public const val `InheritReserved80000000`: `X509RequestInheritOptions` = -2147483648;
public const val `InheritSubjectAltNameFlag`: `X509RequestInheritOptions` = 512;
public const val `InheritSubjectFlag`: `X509RequestInheritOptions` = 128;
public const val `InheritTemplateFlag`: `X509RequestInheritOptions` = 64;
public const val `InheritValidityPeriodFlag`: `X509RequestInheritOptions` = 1024;
public typealias `InnerRequestLevel` = Int;
public typealias `InstallResponseRestrictionFlags` = Int;
public const val `KRAF_DISABLEUSEDEFAULTPROVIDER`: UInt = 8u;
public const val `KRAF_ENABLEARCHIVEALL`: UInt = 4u;
public const val `KRAF_ENABLEFOREIGN`: UInt = 1u;
public const val `KRAF_SAVEBADREQUESTKEY`: UInt = 2u;
public const val `KRA_DISP_EXPIRED`: UInt = 0u;
public const val `KRA_DISP_INVALID`: UInt = 4u;
public const val `KRA_DISP_NOTFOUND`: UInt = 1u;
public const val `KRA_DISP_NOTLOADED`: UInt = 6u;
public const val `KRA_DISP_REVOKED`: UInt = 2u;
public const val `KRA_DISP_UNTRUSTED`: UInt = 5u;
public const val `KRA_DISP_VALID`: UInt = 3u;
public const val `KR_ENABLE_MACHINE`: UInt = 1u;
public const val `KR_ENABLE_USER`: UInt = 2u;
public typealias `KeyAttestationClaimType` = Int;
public typealias `KeyIdentifierHashAlgorithm` = Int;
public const val `LDAPF_SIGNDISABLE`: UInt = 2u;
public const val `LDAPF_SSLENABLE`: UInt = 1u;
public const val `LevelInnermost`: `InnerRequestLevel` = 0;
public const val `LevelNext`: `InnerRequestLevel` = 1;
public const val `LevelSafe`: `WebSecurityLevel` = 1;
public const val `LevelUnsafe`: `WebSecurityLevel` = 0;
public const val `LoadOptionCacheOnly`: `X509EnrollmentPolicyLoadOption` = 1;
public const val `LoadOptionDefault`: `X509EnrollmentPolicyLoadOption` = 0;
public const val `LoadOptionRegisterForADChanges`: `X509EnrollmentPolicyLoadOption` = 4;
public const val `LoadOptionReload`: `X509EnrollmentPolicyLoadOption` = 2;
// UNSUPPORTED Rust 787:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const OCSPAdmin: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd3f73511_92c9_47cb_8ff2_8d891a7c4de4);

// UNSUPPORTED Rust 788:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const OCSPPropertyCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf935a528_ba8a_4dd9_ba79_f283275cb2de);

public typealias `OCSPRequestFlag` = Int;
public typealias `OCSPSigningFlag` = Int;
public const val `OCSP_RF_REJECT_SIGNED_REQUESTS`: `OCSPRequestFlag` = 1;
public const val `OCSP_SF_ALLOW_NONCE_EXTENSION`: `OCSPSigningFlag` = 256;
public const val `OCSP_SF_ALLOW_SIGNINGCERT_AUTOENROLLMENT`: `OCSPSigningFlag` = 512;
public const val `OCSP_SF_ALLOW_SIGNINGCERT_AUTORENEWAL`: `OCSPSigningFlag` = 4;
public const val `OCSP_SF_AUTODISCOVER_SIGNINGCERT`: `OCSPSigningFlag` = 16;
public const val `OCSP_SF_FORCE_SIGNINGCERT_ISSUER_ISCA`: `OCSPSigningFlag` = 8;
public const val `OCSP_SF_MANUAL_ASSIGN_SIGNINGCERT`: `OCSPSigningFlag` = 32;
public const val `OCSP_SF_RESPONDER_ID_KEYHASH`: `OCSPSigningFlag` = 64;
public const val `OCSP_SF_RESPONDER_ID_NAME`: `OCSPSigningFlag` = 128;
public const val `OCSP_SF_SILENT`: `OCSPSigningFlag` = 1;
public const val `OCSP_SF_USE_CACERT`: `OCSPSigningFlag` = 2;
public typealias `ObjectIdGroupId` = Int;
public typealias `ObjectIdPublicKeyFlags` = Int;
public typealias `PENDING_REQUEST_DESIRED_PROPERTY` = Int;
public const val `PFXExportChainNoRoot`: `PFXExportOptions` = 1;
public const val `PFXExportChainWithRoot`: `PFXExportOptions` = 2;
public const val `PFXExportEEOnly`: `PFXExportOptions` = 0;
public typealias `PFXExportOptions` = Int;
public const val `PROCFLG_ENFORCEGOODKEYS`: UInt = 1u;
public const val `PROCFLG_NONE`: UInt = 0u;
public const val `PROPCALLER_ADMIN`: UInt = 1024u;
public const val `PROPCALLER_EXIT`: UInt = 768u;
public const val `PROPCALLER_MASK`: UInt = 3840u;
public const val `PROPCALLER_POLICY`: UInt = 512u;
public const val `PROPCALLER_REQUEST`: UInt = 1280u;
public const val `PROPCALLER_SERVER`: UInt = 256u;
public const val `PROPFLAGS_INDEXED`: UInt = 65536u;
public const val `PROPTYPE_BINARY`: `CERT_PROPERTY_TYPE` = 3;
public const val `PROPTYPE_DATE`: `CERT_PROPERTY_TYPE` = 2;
public const val `PROPTYPE_LONG`: `CERT_PROPERTY_TYPE` = 1;
public const val `PROPTYPE_MASK`: UInt = 255u;
public const val `PROPTYPE_STRING`: `CERT_PROPERTY_TYPE` = 4;
public typealias `Pkcs10AllowedSignatureTypes` = Int;
public typealias `PolicyQualifierType` = Int;
public const val `PolicyQualifierTypeFlags`: `PolicyQualifierType` = 3;
public const val `PolicyQualifierTypeUnknown`: `PolicyQualifierType` = 0;
public const val `PolicyQualifierTypeUrl`: `PolicyQualifierType` = 1;
public const val `PolicyQualifierTypeUserNotice`: `PolicyQualifierType` = 2;
public typealias `PolicyServerUrlFlags` = Int;
public typealias `PolicyServerUrlPropertyID` = Int;
public const val `PrivateKeyAttestMask`: `X509CertificateTemplatePrivateKeyFlag` = 12288;
public const val `PrivateKeyAttestNone`: `X509CertificateTemplatePrivateKeyFlag` = 0;
public const val `PrivateKeyAttestPreferred`: `X509CertificateTemplatePrivateKeyFlag` = 4096;
public const val `PrivateKeyAttestRequired`: `X509CertificateTemplatePrivateKeyFlag` = 8192;
public const val `PrivateKeyAttestWithoutPolicy`: `X509CertificateTemplatePrivateKeyFlag` = 16384;
public const val `PrivateKeyClientVersionMask`: `X509CertificateTemplatePrivateKeyFlag` = 251658240;
public const val `PrivateKeyClientVersionShift`: `X509CertificateTemplatePrivateKeyFlag` = 24;
public const val `PrivateKeyEKTrustOnUse`: `X509CertificateTemplatePrivateKeyFlag` = 512;
public const val `PrivateKeyEKValidateCert`: `X509CertificateTemplatePrivateKeyFlag` = 1024;
public const val `PrivateKeyEKValidateKey`: `X509CertificateTemplatePrivateKeyFlag` = 2048;
public const val `PrivateKeyExportable`: `X509CertificateTemplatePrivateKeyFlag` = 16;
public const val `PrivateKeyHelloKspKey`: `X509CertificateTemplatePrivateKeyFlag` = 1048576;
public const val `PrivateKeyHelloLogonKey`: `X509CertificateTemplatePrivateKeyFlag` = 2097152;
public const val `PrivateKeyRequireAlternateSignatureAlgorithm`: `X509CertificateTemplatePrivateKeyFlag` = 64;
public const val `PrivateKeyRequireArchival`: `X509CertificateTemplatePrivateKeyFlag` = 1;
public const val `PrivateKeyRequireSameKeyRenewal`: `X509CertificateTemplatePrivateKeyFlag` = 128;
public const val `PrivateKeyRequireStrongKeyProtection`: `X509CertificateTemplatePrivateKeyFlag` = 32;
public const val `PrivateKeyServerVersionMask`: `X509CertificateTemplatePrivateKeyFlag` = 983040;
public const val `PrivateKeyServerVersionShift`: `X509CertificateTemplatePrivateKeyFlag` = 16;
public const val `PrivateKeyUseLegacyProvider`: `X509CertificateTemplatePrivateKeyFlag` = 256;
public const val `PsFriendlyName`: `PolicyServerUrlPropertyID` = 1;
public const val `PsPolicyID`: `PolicyServerUrlPropertyID` = 0;
public const val `PsfAllowUnTrustedCA`: `PolicyServerUrlFlags` = 32;
public const val `PsfAutoEnrollmentEnabled`: `PolicyServerUrlFlags` = 16;
public const val `PsfLocationGroupPolicy`: `PolicyServerUrlFlags` = 1;
public const val `PsfLocationRegistry`: `PolicyServerUrlFlags` = 2;
public const val `PsfNone`: `PolicyServerUrlFlags` = 0;
public const val `PsfUseClientId`: `PolicyServerUrlFlags` = 4;
public const val `REQDISP_DEFAULT_ENTERPRISE`: UInt = 1u;
public const val `REQDISP_DENY`: UInt = 2u;
public const val `REQDISP_ISSUE`: UInt = 1u;
public const val `REQDISP_MASK`: UInt = 255u;
public const val `REQDISP_PENDING`: UInt = 0u;
public const val `REQDISP_PENDINGFIRST`: UInt = 256u;
public const val `REQDISP_USEREQUESTATTRIBUTE`: UInt = 3u;
public const val `REVEXT_ASPENABLE`: UInt = 512u;
public const val `REVEXT_CDPENABLE`: UInt = 256u;
public const val `REVEXT_CDPFILEURL_OLD`: UInt = 8u;
public const val `REVEXT_CDPFTPURL_OLD`: UInt = 4u;
public const val `REVEXT_CDPHTTPURL_OLD`: UInt = 2u;
public const val `REVEXT_CDPLDAPURL_OLD`: UInt = 1u;
public const val `REVEXT_CDPURLMASK_OLD`: UInt = 255u;
public const val `REVEXT_DEFAULT_DS`: UInt = 256u;
public const val `REVEXT_DEFAULT_NODS`: UInt = 256u;
public typealias `RequestClientInfoClientId` = Int;
public const val `SCEPDispositionFailure`: `X509SCEPDisposition` = 2;
public const val `SCEPDispositionPending`: `X509SCEPDisposition` = 3;
public const val `SCEPDispositionPendingChallenge`: `X509SCEPDisposition` = 11;
public const val `SCEPDispositionSuccess`: `X509SCEPDisposition` = 0;
public const val `SCEPDispositionUnknown`: `X509SCEPDisposition` = -1;
public const val `SCEPFailBadAlgorithm`: `X509SCEPFailInfo` = 0;
public const val `SCEPFailBadCertId`: `X509SCEPFailInfo` = 4;
public const val `SCEPFailBadMessageCheck`: `X509SCEPFailInfo` = 1;
public const val `SCEPFailBadRequest`: `X509SCEPFailInfo` = 2;
public const val `SCEPFailBadTime`: `X509SCEPFailInfo` = 3;
public const val `SCEPFailUnknown`: `X509SCEPFailInfo` = -1;
public const val `SCEPMessageCertResponse`: `X509SCEPMessageType` = 3;
public const val `SCEPMessageClaimChallengeAnswer`: `X509SCEPMessageType` = 41;
public const val `SCEPMessageGetCRL`: `X509SCEPMessageType` = 22;
public const val `SCEPMessageGetCert`: `X509SCEPMessageType` = 21;
public const val `SCEPMessageGetCertInitial`: `X509SCEPMessageType` = 20;
public const val `SCEPMessagePKCSRequest`: `X509SCEPMessageType` = 19;
public const val `SCEPMessageUnknown`: `X509SCEPMessageType` = -1;
public const val `SCEPProcessDefault`: `X509SCEPProcessMessageFlags` = 0;
public const val `SCEPProcessSkipCertInstall`: `X509SCEPProcessMessageFlags` = 1;
public const val `SETUP_ATTEMPT_VROOT_CREATE`: UInt = 128u;
public const val `SETUP_CLIENT_FLAG`: UInt = 2u;
public const val `SETUP_CREATEDB_FLAG`: UInt = 64u;
public const val `SETUP_DCOM_SECURITY_UPDATED_FLAG`: UInt = 8192u;
public const val `SETUP_DENIED_FLAG`: UInt = 32u;
public const val `SETUP_FORCECRL_FLAG`: UInt = 256u;
public const val `SETUP_ONLINE_FLAG`: UInt = 16u;
public const val `SETUP_REQUEST_FLAG`: UInt = 8u;
public const val `SETUP_SECURITY_CHANGED`: UInt = 4096u;
public const val `SETUP_SERVER_FLAG`: UInt = 1u;
public const val `SETUP_SERVER_IS_UP_TO_DATE_FLAG`: UInt = 16384u;
public const val `SETUP_SERVER_UPGRADED_FLAG`: UInt = 1024u;
public const val `SETUP_SUSPEND_FLAG`: UInt = 4u;
public const val `SETUP_UPDATE_CAOBJECT_SVRTYPE`: UInt = 512u;
public const val `SETUP_W2K_SECURITY_NOT_UPGRADED_FLAG`: UInt = 2048u;
public const val `SKIHashCapiSha1`: `KeyIdentifierHashAlgorithm` = 2;
public const val `SKIHashDefault`: `KeyIdentifierHashAlgorithm` = 0;
public const val `SKIHashHPKP`: `KeyIdentifierHashAlgorithm` = 5;
public const val `SKIHashSha1`: `KeyIdentifierHashAlgorithm` = 1;
public const val `SKIHashSha256`: `KeyIdentifierHashAlgorithm` = 3;
public const val `SelectedNo`: `EnrollmentSelectionStatus` = 0;
public const val `SelectedYes`: `EnrollmentSelectionStatus` = 1;
public const val `SubjectAlternativeNameEnrolleeSupplies`: `X509CertificateTemplateSubjectNameFlag` = 65536;
public const val `SubjectAlternativeNameRequireDNS`: `X509CertificateTemplateSubjectNameFlag` = 134217728;
public const val `SubjectAlternativeNameRequireDirectoryGUID`: `X509CertificateTemplateSubjectNameFlag` = 16777216;
public const val `SubjectAlternativeNameRequireDomainDNS`: `X509CertificateTemplateSubjectNameFlag` = 4194304;
public const val `SubjectAlternativeNameRequireEmail`: `X509CertificateTemplateSubjectNameFlag` = 67108864;
public const val `SubjectAlternativeNameRequireSPN`: `X509CertificateTemplateSubjectNameFlag` = 8388608;
public const val `SubjectAlternativeNameRequireUPN`: `X509CertificateTemplateSubjectNameFlag` = 33554432;
public const val `SubjectNameAndAlternativeNameOldCertSupplies`: `X509CertificateTemplateSubjectNameFlag` = 8;
public const val `SubjectNameEnrolleeSupplies`: `X509CertificateTemplateSubjectNameFlag` = 1;
public const val `SubjectNameRequireCommonName`: `X509CertificateTemplateSubjectNameFlag` = 1073741824;
public const val `SubjectNameRequireDNS`: `X509CertificateTemplateSubjectNameFlag` = 268435456;
public const val `SubjectNameRequireDirectoryPath`: `X509CertificateTemplateSubjectNameFlag` = -2147483648;
public const val `SubjectNameRequireEmail`: `X509CertificateTemplateSubjectNameFlag` = 536870912;
public const val `TP_MACHINEPOLICY`: UInt = 1u;
public const val `TemplatePropAsymmetricAlgorithm`: `EnrollmentTemplateProperty` = 18;
public const val `TemplatePropCertificatePolicies`: `EnrollmentTemplateProperty` = 16;
public const val `TemplatePropCommonName`: `EnrollmentTemplateProperty` = 1;
public const val `TemplatePropCryptoProviders`: `EnrollmentTemplateProperty` = 4;
public const val `TemplatePropDescription`: `EnrollmentTemplateProperty` = 6;
public const val `TemplatePropEKUs`: `EnrollmentTemplateProperty` = 3;
public const val `TemplatePropEnrollmentFlags`: `EnrollmentTemplateProperty` = 24;
public const val `TemplatePropExtensions`: `EnrollmentTemplateProperty` = 29;
public const val `TemplatePropFriendlyName`: `EnrollmentTemplateProperty` = 2;
public const val `TemplatePropGeneralFlags`: `EnrollmentTemplateProperty` = 27;
public const val `TemplatePropHashAlgorithm`: `EnrollmentTemplateProperty` = 22;
public const val `TemplatePropKeySecurityDescriptor`: `EnrollmentTemplateProperty` = 19;
public const val `TemplatePropKeySpec`: `EnrollmentTemplateProperty` = 7;
public const val `TemplatePropKeyUsage`: `EnrollmentTemplateProperty` = 23;
public const val `TemplatePropMajorRevision`: `EnrollmentTemplateProperty` = 5;
public const val `TemplatePropMinimumKeySize`: `EnrollmentTemplateProperty` = 11;
public const val `TemplatePropMinorRevision`: `EnrollmentTemplateProperty` = 9;
public const val `TemplatePropOID`: `EnrollmentTemplateProperty` = 12;
public const val `TemplatePropPrivateKeyFlags`: `EnrollmentTemplateProperty` = 26;
public const val `TemplatePropRACertificatePolicies`: `EnrollmentTemplateProperty` = 14;
public const val `TemplatePropRAEKUs`: `EnrollmentTemplateProperty` = 15;
public const val `TemplatePropRASignatureCount`: `EnrollmentTemplateProperty` = 10;
public const val `TemplatePropRenewalPeriod`: `EnrollmentTemplateProperty` = 31;
public const val `TemplatePropSchemaVersion`: `EnrollmentTemplateProperty` = 8;
public const val `TemplatePropSecurityDescriptor`: `EnrollmentTemplateProperty` = 28;
public const val `TemplatePropSubjectNameFlags`: `EnrollmentTemplateProperty` = 25;
public const val `TemplatePropSupersede`: `EnrollmentTemplateProperty` = 13;
public const val `TemplatePropSymmetricAlgorithm`: `EnrollmentTemplateProperty` = 20;
public const val `TemplatePropSymmetricKeyLength`: `EnrollmentTemplateProperty` = 21;
public const val `TemplatePropV1ApplicationPolicy`: `EnrollmentTemplateProperty` = 17;
public const val `TemplatePropValidityPeriod`: `EnrollmentTemplateProperty` = 30;
public const val `TypeAny`: `X509RequestType` = 0;
public const val `TypeCertificate`: `X509RequestType` = 4;
public const val `TypeCmc`: `X509RequestType` = 3;
public const val `TypePkcs10`: `X509RequestType` = 1;
public const val `TypePkcs7`: `X509RequestType` = 2;
public const val `VR_INSTANT_BAD`: UInt = 2u;
public const val `VR_INSTANT_OK`: UInt = 1u;
public const val `VR_PENDING`: UInt = 0u;
public const val `VerifyAllowUI`: `X509PrivateKeyVerify` = 4;
public const val `VerifyNone`: `X509PrivateKeyVerify` = 0;
public const val `VerifySilent`: `X509PrivateKeyVerify` = 1;
public const val `VerifySmartCardNone`: `X509PrivateKeyVerify` = 2;
public const val `VerifySmartCardSilent`: `X509PrivateKeyVerify` = 3;
public typealias `WebEnrollmentFlags` = Int;
public typealias `WebSecurityLevel` = Int;
public typealias `X500NameFlags` = Int;
public const val `X509AuthAnonymous`: `X509EnrollmentAuthFlags` = 1;
public const val `X509AuthCertificate`: `X509EnrollmentAuthFlags` = 8;
public const val `X509AuthKerberos`: `X509EnrollmentAuthFlags` = 2;
public const val `X509AuthNone`: `X509EnrollmentAuthFlags` = 0;
public const val `X509AuthUsername`: `X509EnrollmentAuthFlags` = 4;
public typealias `X509CertificateEnrollmentContext` = Int;
public typealias `X509CertificateTemplateEnrollmentFlag` = Int;
public typealias `X509CertificateTemplateGeneralFlag` = Int;
public typealias `X509CertificateTemplatePrivateKeyFlag` = Int;
public typealias `X509CertificateTemplateSubjectNameFlag` = Int;
public typealias `X509EnrollmentAuthFlags` = Int;
public typealias `X509EnrollmentPolicyExportFlags` = Int;
public typealias `X509EnrollmentPolicyLoadOption` = Int;
public typealias `X509HardwareKeyUsageFlags` = Int;
public typealias `X509KeyParametersExportType` = Int;
public typealias `X509KeySpec` = Int;
public typealias `X509KeyUsageFlags` = Int;
public typealias `X509PrivateKeyExportFlags` = Int;
public typealias `X509PrivateKeyProtection` = Int;
public typealias `X509PrivateKeyUsageFlags` = Int;
public typealias `X509PrivateKeyVerify` = Int;
public typealias `X509ProviderType` = Int;
public typealias `X509RequestInheritOptions` = Int;
public typealias `X509RequestType` = Int;
public typealias `X509SCEPDisposition` = Int;
public typealias `X509SCEPFailInfo` = Int;
public typealias `X509SCEPMessageType` = Int;
public typealias `X509SCEPProcessMessageFlags` = Int;
public const val `XCN_AT_KEYEXCHANGE`: `X509KeySpec` = 1;
public const val `XCN_AT_NONE`: `X509KeySpec` = 0;
public const val `XCN_AT_SIGNATURE`: `X509KeySpec` = 2;
public const val `XCN_BCRYPT_ASYMMETRIC_ENCRYPTION_INTERFACE`: `AlgorithmType` = 3;
public const val `XCN_BCRYPT_CIPHER_INTERFACE`: `AlgorithmType` = 1;
public const val `XCN_BCRYPT_HASH_INTERFACE`: `AlgorithmType` = 2;
public const val `XCN_BCRYPT_KEY_DERIVATION_INTERFACE`: `AlgorithmType` = 7;
public const val `XCN_BCRYPT_RNG_INTERFACE`: `AlgorithmType` = 6;
public const val `XCN_BCRYPT_SECRET_AGREEMENT_INTERFACE`: `AlgorithmType` = 4;
public const val `XCN_BCRYPT_SIGNATURE_INTERFACE`: `AlgorithmType` = 5;
public const val `XCN_BCRYPT_UNKNOWN_INTERFACE`: `AlgorithmType` = 0;
public const val `XCN_CERT_ACCESS_STATE_PROP_ID`: `CERTENROLL_PROPERTYID` = 14;
public const val `XCN_CERT_AIA_URL_RETRIEVED_PROP_ID`: `CERTENROLL_PROPERTYID` = 67;
public const val `XCN_CERT_ALT_NAME_DIRECTORY_NAME`: `AlternativeNameType` = 5;
public const val `XCN_CERT_ALT_NAME_DNS_NAME`: `AlternativeNameType` = 3;
public const val `XCN_CERT_ALT_NAME_EDI_PARTY_NAME`: `AlternativeNameType` = 6;
public const val `XCN_CERT_ALT_NAME_GUID`: `AlternativeNameType` = 10;
public const val `XCN_CERT_ALT_NAME_IP_ADDRESS`: `AlternativeNameType` = 8;
public const val `XCN_CERT_ALT_NAME_OTHER_NAME`: `AlternativeNameType` = 1;
public const val `XCN_CERT_ALT_NAME_REGISTERED_ID`: `AlternativeNameType` = 9;
public const val `XCN_CERT_ALT_NAME_RFC822_NAME`: `AlternativeNameType` = 2;
public const val `XCN_CERT_ALT_NAME_UNKNOWN`: `AlternativeNameType` = 0;
public const val `XCN_CERT_ALT_NAME_URL`: `AlternativeNameType` = 7;
public const val `XCN_CERT_ALT_NAME_USER_PRINCIPLE_NAME`: `AlternativeNameType` = 11;
public const val `XCN_CERT_ALT_NAME_X400_ADDRESS`: `AlternativeNameType` = 4;
public const val `XCN_CERT_ARCHIVED_KEY_HASH_PROP_ID`: `CERTENROLL_PROPERTYID` = 65;
public const val `XCN_CERT_ARCHIVED_PROP_ID`: `CERTENROLL_PROPERTYID` = 19;
public const val `XCN_CERT_AUTHORITY_INFO_ACCESS_PROP_ID`: `CERTENROLL_PROPERTYID` = 68;
public const val `XCN_CERT_AUTH_ROOT_SHA256_HASH_PROP_ID`: `CERTENROLL_PROPERTYID` = 98;
public const val `XCN_CERT_AUTO_ENROLL_PROP_ID`: `CERTENROLL_PROPERTYID` = 21;
public const val `XCN_CERT_AUTO_ENROLL_RETRY_PROP_ID`: `CERTENROLL_PROPERTYID` = 66;
public const val `XCN_CERT_BACKED_UP_PROP_ID`: `CERTENROLL_PROPERTYID` = 69;
public const val `XCN_CERT_CA_DISABLE_CRL_PROP_ID`: `CERTENROLL_PROPERTYID` = 82;
public const val `XCN_CERT_CA_OCSP_AUTHORITY_INFO_ACCESS_PROP_ID`: `CERTENROLL_PROPERTYID` = 81;
public const val `XCN_CERT_CEP_PROP_ID`: `CERTENROLL_PROPERTYID` = 87;
public const val `XCN_CERT_CERT_NOT_BEFORE_ENHKEY_USAGE_PROP_ID`: `CERTENROLL_PROPERTYID` = 127;
public const val `XCN_CERT_CLR_DELETE_KEY_PROP_ID`: `CERTENROLL_PROPERTYID` = 125;
public const val `XCN_CERT_CRL_SIGN_KEY_USAGE`: `X509KeyUsageFlags` = 2;
public const val `XCN_CERT_CROSS_CERT_DIST_POINTS_PROP_ID`: `CERTENROLL_PROPERTYID` = 23;
public const val `XCN_CERT_CTL_USAGE_PROP_ID`: `CERTENROLL_PROPERTYID` = 9;
public const val `XCN_CERT_DATA_ENCIPHERMENT_KEY_USAGE`: `X509KeyUsageFlags` = 16;
public const val `XCN_CERT_DATE_STAMP_PROP_ID`: `CERTENROLL_PROPERTYID` = 27;
public const val `XCN_CERT_DECIPHER_ONLY_KEY_USAGE`: `X509KeyUsageFlags` = 32768;
public const val `XCN_CERT_DESCRIPTION_PROP_ID`: `CERTENROLL_PROPERTYID` = 13;
public const val `XCN_CERT_DIGITAL_SIGNATURE_KEY_USAGE`: `X509KeyUsageFlags` = 128;
public const val `XCN_CERT_DISALLOWED_ENHKEY_USAGE_PROP_ID`: `CERTENROLL_PROPERTYID` = 122;
public const val `XCN_CERT_DISALLOWED_FILETIME_PROP_ID`: `CERTENROLL_PROPERTYID` = 104;
public const val `XCN_CERT_EFS_PROP_ID`: `CERTENROLL_PROPERTYID` = 17;
public const val `XCN_CERT_ENCIPHER_ONLY_KEY_USAGE`: `X509KeyUsageFlags` = 1;
public const val `XCN_CERT_ENHKEY_USAGE_PROP_ID`: `CERTENROLL_PROPERTYID` = 9;
public const val `XCN_CERT_ENROLLMENT_PROP_ID`: `CERTENROLL_PROPERTYID` = 26;
public const val `XCN_CERT_EXTENDED_ERROR_INFO_PROP_ID`: `CERTENROLL_PROPERTYID` = 30;
public const val `XCN_CERT_FIRST_RESERVED_PROP_ID`: `CERTENROLL_PROPERTYID` = 129;
public const val `XCN_CERT_FIRST_USER_PROP_ID`: `CERTENROLL_PROPERTYID` = 32768;
public const val `XCN_CERT_FORTEZZA_DATA_PROP_ID`: `CERTENROLL_PROPERTYID` = 18;
public const val `XCN_CERT_FRIENDLY_NAME_PROP_ID`: `CERTENROLL_PROPERTYID` = 11;
public const val `XCN_CERT_HASH_PROP_ID`: `CERTENROLL_PROPERTYID` = 3;
public const val `XCN_CERT_HCRYPTPROV_OR_NCRYPT_KEY_HANDLE_PROP_ID`: `CERTENROLL_PROPERTYID` = 79;
public const val `XCN_CERT_HCRYPTPROV_TRANSFER_PROP_ID`: `CERTENROLL_PROPERTYID` = 100;
public const val `XCN_CERT_IE30_RESERVED_PROP_ID`: `CERTENROLL_PROPERTYID` = 7;
public const val `XCN_CERT_ISOLATED_KEY_PROP_ID`: `CERTENROLL_PROPERTYID` = 118;
public const val `XCN_CERT_ISSUER_CHAIN_PUB_KEY_CNG_ALG_BIT_LENGTH_PROP_ID`: `CERTENROLL_PROPERTYID` = 96;
public const val `XCN_CERT_ISSUER_CHAIN_SIGN_HASH_CNG_ALG_PROP_ID`: `CERTENROLL_PROPERTYID` = 95;
public const val `XCN_CERT_ISSUER_PUBLIC_KEY_MD5_HASH_PROP_ID`: `CERTENROLL_PROPERTYID` = 24;
public const val `XCN_CERT_ISSUER_PUB_KEY_BIT_LENGTH_PROP_ID`: `CERTENROLL_PROPERTYID` = 94;
public const val `XCN_CERT_ISSUER_SERIAL_NUMBER_MD5_HASH_PROP_ID`: `CERTENROLL_PROPERTYID` = 28;
public const val `XCN_CERT_KEY_AGREEMENT_KEY_USAGE`: `X509KeyUsageFlags` = 8;
public const val `XCN_CERT_KEY_CERT_SIGN_KEY_USAGE`: `X509KeyUsageFlags` = 4;
public const val `XCN_CERT_KEY_CLASSIFICATION_PROP_ID`: `CERTENROLL_PROPERTYID` = 120;
public const val `XCN_CERT_KEY_CONTEXT_PROP_ID`: `CERTENROLL_PROPERTYID` = 5;
public const val `XCN_CERT_KEY_ENCIPHERMENT_KEY_USAGE`: `X509KeyUsageFlags` = 32;
public const val `XCN_CERT_KEY_IDENTIFIER_PROP_ID`: `CERTENROLL_PROPERTYID` = 20;
public const val `XCN_CERT_KEY_PROV_HANDLE_PROP_ID`: `CERTENROLL_PROPERTYID` = 1;
public const val `XCN_CERT_KEY_PROV_INFO_PROP_ID`: `CERTENROLL_PROPERTYID` = 2;
public const val `XCN_CERT_KEY_REPAIR_ATTEMPTED_PROP_ID`: `CERTENROLL_PROPERTYID` = 103;
public const val `XCN_CERT_KEY_SPEC_PROP_ID`: `CERTENROLL_PROPERTYID` = 6;
public const val `XCN_CERT_LAST_RESERVED_PROP_ID`: `CERTENROLL_PROPERTYID` = 32767;
public const val `XCN_CERT_LAST_USER_PROP_ID`: `CERTENROLL_PROPERTYID` = 65535;
public const val `XCN_CERT_MD5_HASH_PROP_ID`: `CERTENROLL_PROPERTYID` = 4;
public const val `XCN_CERT_NAME_STR_AMBIGUOUS_SEPARATOR_FLAGS`: `X500NameFlags` = 1275068416;
public const val `XCN_CERT_NAME_STR_COMMA_FLAG`: `X500NameFlags` = 67108864;
public const val `XCN_CERT_NAME_STR_CRLF_FLAG`: `X500NameFlags` = 134217728;
public const val `XCN_CERT_NAME_STR_DISABLE_IE4_UTF8_FLAG`: `X500NameFlags` = 65536;
public const val `XCN_CERT_NAME_STR_DISABLE_UTF8_DIR_STR_FLAG`: `X500NameFlags` = 1048576;
public const val `XCN_CERT_NAME_STR_DS_ESCAPED`: `X500NameFlags` = 8388608;
public const val `XCN_CERT_NAME_STR_ENABLE_PUNYCODE_FLAG`: `X500NameFlags` = 2097152;
public const val `XCN_CERT_NAME_STR_ENABLE_T61_UNICODE_FLAG`: `X500NameFlags` = 131072;
public const val `XCN_CERT_NAME_STR_ENABLE_UTF8_UNICODE_FLAG`: `X500NameFlags` = 262144;
public const val `XCN_CERT_NAME_STR_FORCE_UTF8_DIR_STR_FLAG`: `X500NameFlags` = 524288;
public const val `XCN_CERT_NAME_STR_FORWARD_FLAG`: `X500NameFlags` = 16777216;
public const val `XCN_CERT_NAME_STR_NONE`: `X500NameFlags` = 0;
public const val `XCN_CERT_NAME_STR_NO_PLUS_FLAG`: `X500NameFlags` = 536870912;
public const val `XCN_CERT_NAME_STR_NO_QUOTING_FLAG`: `X500NameFlags` = 268435456;
public const val `XCN_CERT_NAME_STR_REVERSE_FLAG`: `X500NameFlags` = 33554432;
public const val `XCN_CERT_NAME_STR_SEMICOLON_FLAG`: `X500NameFlags` = 1073741824;
public const val `XCN_CERT_NCRYPT_KEY_HANDLE_PROP_ID`: `CERTENROLL_PROPERTYID` = 78;
public const val `XCN_CERT_NCRYPT_KEY_HANDLE_TRANSFER_PROP_ID`: `CERTENROLL_PROPERTYID` = 99;
public const val `XCN_CERT_NEW_KEY_PROP_ID`: `CERTENROLL_PROPERTYID` = 74;
public const val `XCN_CERT_NEXT_UPDATE_LOCATION_PROP_ID`: `CERTENROLL_PROPERTYID` = 10;
public const val `XCN_CERT_NONCOMPLIANT_ROOT_URL_PROP_ID`: `CERTENROLL_PROPERTYID` = 123;
public const val `XCN_CERT_NON_REPUDIATION_KEY_USAGE`: `X509KeyUsageFlags` = 64;
public const val `XCN_CERT_NOT_BEFORE_FILETIME_PROP_ID`: `CERTENROLL_PROPERTYID` = 126;
public const val `XCN_CERT_NO_AUTO_EXPIRE_CHECK_PROP_ID`: `CERTENROLL_PROPERTYID` = 77;
public const val `XCN_CERT_NO_EXPIRE_NOTIFICATION_PROP_ID`: `CERTENROLL_PROPERTYID` = 97;
public const val `XCN_CERT_NO_KEY_USAGE`: `X509KeyUsageFlags` = 0;
public const val `XCN_CERT_OCSP_CACHE_PREFIX_PROP_ID`: `CERTENROLL_PROPERTYID` = 75;
public const val `XCN_CERT_OCSP_RESPONSE_PROP_ID`: `CERTENROLL_PROPERTYID` = 70;
public const val `XCN_CERT_OFFLINE_CRL_SIGN_KEY_USAGE`: `X509KeyUsageFlags` = 2;
public const val `XCN_CERT_OID_NAME_STR`: `X500NameFlags` = 2;
public const val `XCN_CERT_PIN_SHA256_HASH_PROP_ID`: `CERTENROLL_PROPERTYID` = 124;
public const val `XCN_CERT_PUBKEY_ALG_PARA_PROP_ID`: `CERTENROLL_PROPERTYID` = 22;
public const val `XCN_CERT_PUBKEY_HASH_RESERVED_PROP_ID`: `CERTENROLL_PROPERTYID` = 8;
public const val `XCN_CERT_PUB_KEY_CNG_ALG_BIT_LENGTH_PROP_ID`: `CERTENROLL_PROPERTYID` = 93;
public const val `XCN_CERT_PVK_FILE_PROP_ID`: `CERTENROLL_PROPERTYID` = 12;
public const val `XCN_CERT_RENEWAL_PROP_ID`: `CERTENROLL_PROPERTYID` = 64;
public const val `XCN_CERT_REQUEST_ORIGINATOR_PROP_ID`: `CERTENROLL_PROPERTYID` = 71;
public const val `XCN_CERT_ROOT_PROGRAM_CERT_POLICIES_PROP_ID`: `CERTENROLL_PROPERTYID` = 83;
public const val `XCN_CERT_ROOT_PROGRAM_CHAIN_POLICIES_PROP_ID`: `CERTENROLL_PROPERTYID` = 105;
public const val `XCN_CERT_ROOT_PROGRAM_NAME_CONSTRAINTS_PROP_ID`: `CERTENROLL_PROPERTYID` = 84;
public const val `XCN_CERT_SCARD_PIN_ID_PROP_ID`: `CERTENROLL_PROPERTYID` = 90;
public const val `XCN_CERT_SCARD_PIN_INFO_PROP_ID`: `CERTENROLL_PROPERTYID` = 91;
public const val `XCN_CERT_SCEP_CA_CERT_PROP_ID`: `CERTENROLL_PROPERTYID` = 111;
public const val `XCN_CERT_SCEP_ENCRYPT_HASH_CNG_ALG_PROP_ID`: `CERTENROLL_PROPERTYID` = 114;
public const val `XCN_CERT_SCEP_FLAGS_PROP_ID`: `CERTENROLL_PROPERTYID` = 115;
public const val `XCN_CERT_SCEP_GUID_PROP_ID`: `CERTENROLL_PROPERTYID` = 116;
public const val `XCN_CERT_SCEP_NONCE_PROP_ID`: `CERTENROLL_PROPERTYID` = 113;
public const val `XCN_CERT_SCEP_RA_ENCRYPTION_CERT_PROP_ID`: `CERTENROLL_PROPERTYID` = 110;
public const val `XCN_CERT_SCEP_RA_SIGNATURE_CERT_PROP_ID`: `CERTENROLL_PROPERTYID` = 109;
public const val `XCN_CERT_SCEP_SERVER_CERTS_PROP_ID`: `CERTENROLL_PROPERTYID` = 108;
public const val `XCN_CERT_SCEP_SIGNER_CERT_PROP_ID`: `CERTENROLL_PROPERTYID` = 112;
public const val `XCN_CERT_SEND_AS_TRUSTED_ISSUER_PROP_ID`: `CERTENROLL_PROPERTYID` = 102;
public const val `XCN_CERT_SERIALIZABLE_KEY_CONTEXT_PROP_ID`: `CERTENROLL_PROPERTYID` = 117;
public const val `XCN_CERT_SERIAL_CHAIN_PROP_ID`: `CERTENROLL_PROPERTYID` = 119;
public const val `XCN_CERT_SHA1_HASH_PROP_ID`: `CERTENROLL_PROPERTYID` = 3;
public const val `XCN_CERT_SHA256_HASH_PROP_ID`: `CERTENROLL_PROPERTYID` = 107;
public const val `XCN_CERT_SIGNATURE_HASH_PROP_ID`: `CERTENROLL_PROPERTYID` = 15;
public const val `XCN_CERT_SIGN_HASH_CNG_ALG_PROP_ID`: `CERTENROLL_PROPERTYID` = 89;
public const val `XCN_CERT_SIMPLE_NAME_STR`: `X500NameFlags` = 1;
public const val `XCN_CERT_SMART_CARD_DATA_PROP_ID`: `CERTENROLL_PROPERTYID` = 16;
public const val `XCN_CERT_SMART_CARD_READER_NON_REMOVABLE_PROP_ID`: `CERTENROLL_PROPERTYID` = 106;
public const val `XCN_CERT_SMART_CARD_READER_PROP_ID`: `CERTENROLL_PROPERTYID` = 101;
public const val `XCN_CERT_SMART_CARD_ROOT_INFO_PROP_ID`: `CERTENROLL_PROPERTYID` = 76;
public const val `XCN_CERT_SOURCE_LOCATION_PROP_ID`: `CERTENROLL_PROPERTYID` = 72;
public const val `XCN_CERT_SOURCE_URL_PROP_ID`: `CERTENROLL_PROPERTYID` = 73;
public const val `XCN_CERT_STORE_LOCALIZED_NAME_PROP_ID`: `CERTENROLL_PROPERTYID` = 4096;
public const val `XCN_CERT_SUBJECT_DISABLE_CRL_PROP_ID`: `CERTENROLL_PROPERTYID` = 86;
public const val `XCN_CERT_SUBJECT_INFO_ACCESS_PROP_ID`: `CERTENROLL_PROPERTYID` = 80;
public const val `XCN_CERT_SUBJECT_NAME_MD5_HASH_PROP_ID`: `CERTENROLL_PROPERTYID` = 29;
public const val `XCN_CERT_SUBJECT_OCSP_AUTHORITY_INFO_ACCESS_PROP_ID`: `CERTENROLL_PROPERTYID` = 85;
public const val `XCN_CERT_SUBJECT_PUBLIC_KEY_MD5_HASH_PROP_ID`: `CERTENROLL_PROPERTYID` = 25;
public const val `XCN_CERT_SUBJECT_PUB_KEY_BIT_LENGTH_PROP_ID`: `CERTENROLL_PROPERTYID` = 92;
public const val `XCN_CERT_X500_NAME_STR`: `X500NameFlags` = 3;
public const val `XCN_CERT_XML_NAME_STR`: `X500NameFlags` = 4;
public const val `XCN_CRL_REASON_AA_COMPROMISE`: `CRLRevocationReason` = 10;
public const val `XCN_CRL_REASON_AFFILIATION_CHANGED`: `CRLRevocationReason` = 3;
public const val `XCN_CRL_REASON_CA_COMPROMISE`: `CRLRevocationReason` = 2;
public const val `XCN_CRL_REASON_CERTIFICATE_HOLD`: `CRLRevocationReason` = 6;
public const val `XCN_CRL_REASON_CESSATION_OF_OPERATION`: `CRLRevocationReason` = 5;
public const val `XCN_CRL_REASON_KEY_COMPROMISE`: `CRLRevocationReason` = 1;
public const val `XCN_CRL_REASON_PRIVILEGE_WITHDRAWN`: `CRLRevocationReason` = 9;
public const val `XCN_CRL_REASON_REMOVE_FROM_CRL`: `CRLRevocationReason` = 8;
public const val `XCN_CRL_REASON_SUPERSEDED`: `CRLRevocationReason` = 4;
public const val `XCN_CRL_REASON_UNSPECIFIED`: `CRLRevocationReason` = 0;
public const val `XCN_CRYPT_ANY_GROUP_ID`: `ObjectIdGroupId` = 0;
public const val `XCN_CRYPT_ENCRYPT_ALG_OID_GROUP_ID`: `ObjectIdGroupId` = 2;
public const val `XCN_CRYPT_ENHKEY_USAGE_OID_GROUP_ID`: `ObjectIdGroupId` = 7;
public const val `XCN_CRYPT_EXT_OR_ATTR_OID_GROUP_ID`: `ObjectIdGroupId` = 6;
public const val `XCN_CRYPT_FIRST_ALG_OID_GROUP_ID`: `ObjectIdGroupId` = 1;
public const val `XCN_CRYPT_GROUP_ID_MASK`: `ObjectIdGroupId` = 65535;
public const val `XCN_CRYPT_HASH_ALG_OID_GROUP_ID`: `ObjectIdGroupId` = 1;
public const val `XCN_CRYPT_KDF_OID_GROUP_ID`: `ObjectIdGroupId` = 10;
public const val `XCN_CRYPT_KEY_LENGTH_MASK`: `ObjectIdGroupId` = 268369920;
public const val `XCN_CRYPT_LAST_ALG_OID_GROUP_ID`: `ObjectIdGroupId` = 4;
public const val `XCN_CRYPT_LAST_OID_GROUP_ID`: `ObjectIdGroupId` = 10;
public const val `XCN_CRYPT_OID_DISABLE_SEARCH_DS_FLAG`: `ObjectIdGroupId` = -2147483648;
public const val `XCN_CRYPT_OID_INFO_OID_GROUP_BIT_LEN_MASK`: `ObjectIdGroupId` = 268369920;
public const val `XCN_CRYPT_OID_INFO_OID_GROUP_BIT_LEN_SHIFT`: `ObjectIdGroupId` = 16;
public const val `XCN_CRYPT_OID_INFO_PUBKEY_ANY`: `ObjectIdPublicKeyFlags` = 0;
public const val `XCN_CRYPT_OID_INFO_PUBKEY_ENCRYPT_KEY_FLAG`: `ObjectIdPublicKeyFlags` = 1073741824;
public const val `XCN_CRYPT_OID_INFO_PUBKEY_SIGN_KEY_FLAG`: `ObjectIdPublicKeyFlags` = -2147483648;
public const val `XCN_CRYPT_OID_PREFER_CNG_ALGID_FLAG`: `ObjectIdGroupId` = 1073741824;
public const val `XCN_CRYPT_OID_USE_CURVE_NAME_FOR_ENCODE_FLAG`: `X509KeyParametersExportType` = 536870912;
public const val `XCN_CRYPT_OID_USE_CURVE_NONE`: `X509KeyParametersExportType` = 0;
public const val `XCN_CRYPT_OID_USE_CURVE_PARAMETERS_FOR_ENCODE_FLAG`: `X509KeyParametersExportType` = 268435456;
public const val `XCN_CRYPT_POLICY_OID_GROUP_ID`: `ObjectIdGroupId` = 8;
public const val `XCN_CRYPT_PUBKEY_ALG_OID_GROUP_ID`: `ObjectIdGroupId` = 3;
public const val `XCN_CRYPT_RDN_ATTR_OID_GROUP_ID`: `ObjectIdGroupId` = 5;
public const val `XCN_CRYPT_SIGN_ALG_OID_GROUP_ID`: `ObjectIdGroupId` = 4;
public const val `XCN_CRYPT_STRING_ANY`: `EncodingType` = 7;
public const val `XCN_CRYPT_STRING_BASE64`: `EncodingType` = 1;
public const val `XCN_CRYPT_STRING_BASE64HEADER`: `EncodingType` = 0;
public const val `XCN_CRYPT_STRING_BASE64REQUESTHEADER`: `EncodingType` = 3;
public const val `XCN_CRYPT_STRING_BASE64URI`: `EncodingType` = 13;
public const val `XCN_CRYPT_STRING_BASE64X509CRLHEADER`: `EncodingType` = 9;
public const val `XCN_CRYPT_STRING_BASE64_ANY`: `EncodingType` = 6;
public const val `XCN_CRYPT_STRING_BINARY`: `EncodingType` = 2;
public const val `XCN_CRYPT_STRING_CHAIN`: `EncodingType` = 256;
public const val `XCN_CRYPT_STRING_ENCODEMASK`: `EncodingType` = 255;
public const val `XCN_CRYPT_STRING_HASHDATA`: `EncodingType` = 268435456;
public const val `XCN_CRYPT_STRING_HEX`: `EncodingType` = 4;
public const val `XCN_CRYPT_STRING_HEXADDR`: `EncodingType` = 10;
public const val `XCN_CRYPT_STRING_HEXASCII`: `EncodingType` = 5;
public const val `XCN_CRYPT_STRING_HEXASCIIADDR`: `EncodingType` = 11;
public const val `XCN_CRYPT_STRING_HEXRAW`: `EncodingType` = 12;
public const val `XCN_CRYPT_STRING_HEX_ANY`: `EncodingType` = 8;
public const val `XCN_CRYPT_STRING_NOCR`: `EncodingType` = -2147483648;
public const val `XCN_CRYPT_STRING_NOCRLF`: `EncodingType` = 1073741824;
public const val `XCN_CRYPT_STRING_PERCENTESCAPE`: `EncodingType` = 134217728;
public const val `XCN_CRYPT_STRING_STRICT`: `EncodingType` = 536870912;
public const val `XCN_CRYPT_STRING_TEXT`: `EncodingType` = 512;
public const val `XCN_CRYPT_TEMPLATE_OID_GROUP_ID`: `ObjectIdGroupId` = 9;
public const val `XCN_NCRYPT_ALLOW_ALL_USAGES`: `X509PrivateKeyUsageFlags` = 16777215;
public const val `XCN_NCRYPT_ALLOW_ARCHIVING_FLAG`: `X509PrivateKeyExportFlags` = 4;
public const val `XCN_NCRYPT_ALLOW_DECRYPT_FLAG`: `X509PrivateKeyUsageFlags` = 1;
public const val `XCN_NCRYPT_ALLOW_EXPORT_FLAG`: `X509PrivateKeyExportFlags` = 1;
public const val `XCN_NCRYPT_ALLOW_EXPORT_NONE`: `X509PrivateKeyExportFlags` = 0;
public const val `XCN_NCRYPT_ALLOW_KEY_AGREEMENT_FLAG`: `X509PrivateKeyUsageFlags` = 4;
public const val `XCN_NCRYPT_ALLOW_KEY_IMPORT_FLAG`: `X509PrivateKeyUsageFlags` = 8;
public const val `XCN_NCRYPT_ALLOW_PLAINTEXT_ARCHIVING_FLAG`: `X509PrivateKeyExportFlags` = 8;
public const val `XCN_NCRYPT_ALLOW_PLAINTEXT_EXPORT_FLAG`: `X509PrivateKeyExportFlags` = 2;
public const val `XCN_NCRYPT_ALLOW_SIGNING_FLAG`: `X509PrivateKeyUsageFlags` = 2;
public const val `XCN_NCRYPT_ALLOW_USAGES_NONE`: `X509PrivateKeyUsageFlags` = 0;
public const val `XCN_NCRYPT_ANY_ASYMMETRIC_OPERATION`: `AlgorithmOperationFlags` = 28;
public const val `XCN_NCRYPT_ASYMMETRIC_ENCRYPTION_OPERATION`: `AlgorithmOperationFlags` = 4;
public const val `XCN_NCRYPT_CIPHER_OPERATION`: `AlgorithmOperationFlags` = 1;
public const val `XCN_NCRYPT_CLAIM_AUTHORITY_AND_SUBJECT`: `KeyAttestationClaimType` = 3;
public const val `XCN_NCRYPT_CLAIM_AUTHORITY_ONLY`: `KeyAttestationClaimType` = 1;
public const val `XCN_NCRYPT_CLAIM_NONE`: `KeyAttestationClaimType` = 0;
public const val `XCN_NCRYPT_CLAIM_SUBJECT_ONLY`: `KeyAttestationClaimType` = 2;
public const val `XCN_NCRYPT_CLAIM_UNKNOWN`: `KeyAttestationClaimType` = 4096;
public const val `XCN_NCRYPT_EXACT_MATCH_OPERATION`: `AlgorithmOperationFlags` = 8388608;
public const val `XCN_NCRYPT_HASH_OPERATION`: `AlgorithmOperationFlags` = 2;
public const val `XCN_NCRYPT_KEY_DERIVATION_OPERATION`: `AlgorithmOperationFlags` = 64;
public const val `XCN_NCRYPT_NO_OPERATION`: `AlgorithmOperationFlags` = 0;
public const val `XCN_NCRYPT_PCP_ENCRYPTION_KEY`: `X509HardwareKeyUsageFlags` = 2;
public const val `XCN_NCRYPT_PCP_GENERIC_KEY`: `X509HardwareKeyUsageFlags` = 3;
public const val `XCN_NCRYPT_PCP_IDENTITY_KEY`: `X509HardwareKeyUsageFlags` = 8;
public const val `XCN_NCRYPT_PCP_NONE`: `X509HardwareKeyUsageFlags` = 0;
public const val `XCN_NCRYPT_PCP_SIGNATURE_KEY`: `X509HardwareKeyUsageFlags` = 1;
public const val `XCN_NCRYPT_PCP_STORAGE_KEY`: `X509HardwareKeyUsageFlags` = 4;
public const val `XCN_NCRYPT_PREFERENCE_MASK_OPERATION`: `AlgorithmOperationFlags` = 14680064;
public const val `XCN_NCRYPT_PREFER_NON_SIGNATURE_OPERATION`: `AlgorithmOperationFlags` = 4194304;
public const val `XCN_NCRYPT_PREFER_SIGNATURE_ONLY_OPERATION`: `AlgorithmOperationFlags` = 2097152;
public const val `XCN_NCRYPT_RNG_OPERATION`: `AlgorithmOperationFlags` = 32;
public const val `XCN_NCRYPT_SECRET_AGREEMENT_OPERATION`: `AlgorithmOperationFlags` = 8;
public const val `XCN_NCRYPT_SIGNATURE_OPERATION`: `AlgorithmOperationFlags` = 16;
public const val `XCN_NCRYPT_TPM12_PROVIDER`: `X509HardwareKeyUsageFlags` = 65536;
public const val `XCN_NCRYPT_UI_APPCONTAINER_ACCESS_MEDIUM_FLAG`: `X509PrivateKeyProtection` = 8;
public const val `XCN_NCRYPT_UI_FINGERPRINT_PROTECTION_FLAG`: `X509PrivateKeyProtection` = 4;
public const val `XCN_NCRYPT_UI_FORCE_HIGH_PROTECTION_FLAG`: `X509PrivateKeyProtection` = 2;
public const val `XCN_NCRYPT_UI_NO_PROTECTION_FLAG`: `X509PrivateKeyProtection` = 0;
public const val `XCN_NCRYPT_UI_PROTECT_KEY_FLAG`: `X509PrivateKeyProtection` = 1;
public const val `XCN_OIDVerisign_FailInfo`: `CERTENROLL_OBJECTID` = 431;
public const val `XCN_OIDVerisign_MessageType`: `CERTENROLL_OBJECTID` = 429;
public const val `XCN_OIDVerisign_PkiStatus`: `CERTENROLL_OBJECTID` = 430;
public const val `XCN_OIDVerisign_RecipientNonce`: `CERTENROLL_OBJECTID` = 433;
public const val `XCN_OIDVerisign_SenderNonce`: `CERTENROLL_OBJECTID` = 432;
public const val `XCN_OIDVerisign_TransactionID`: `CERTENROLL_OBJECTID` = 434;
public const val `XCN_OID_ANSI_X942`: `CERTENROLL_OBJECTID` = 53;
public const val `XCN_OID_ANSI_X942_DH`: `CERTENROLL_OBJECTID` = 54;
public const val `XCN_OID_ANY_APPLICATION_POLICY`: `CERTENROLL_OBJECTID` = 216;
public const val `XCN_OID_ANY_CERT_POLICY`: `CERTENROLL_OBJECTID` = 180;
public const val `XCN_OID_ANY_ENHANCED_KEY_USAGE`: `CERTENROLL_OBJECTID` = 352;
public const val `XCN_OID_APPLICATION_CERT_POLICIES`: `CERTENROLL_OBJECTID` = 229;
public const val `XCN_OID_APPLICATION_POLICY_CONSTRAINTS`: `CERTENROLL_OBJECTID` = 231;
public const val `XCN_OID_APPLICATION_POLICY_MAPPINGS`: `CERTENROLL_OBJECTID` = 230;
public const val `XCN_OID_ARCHIVED_KEY_ATTR`: `CERTENROLL_OBJECTID` = 232;
public const val `XCN_OID_ARCHIVED_KEY_CERT_HASH`: `CERTENROLL_OBJECTID` = 235;
public const val `XCN_OID_ATTR_SUPPORTED_ALGORITHMS`: `CERTENROLL_OBJECTID` = 355;
public const val `XCN_OID_ATTR_TPM_SECURITY_ASSERTIONS`: `CERTENROLL_OBJECTID` = 356;
public const val `XCN_OID_ATTR_TPM_SPECIFICATION`: `CERTENROLL_OBJECTID` = 357;
public const val `XCN_OID_AUTHORITY_INFO_ACCESS`: `CERTENROLL_OBJECTID` = 204;
public const val `XCN_OID_AUTHORITY_KEY_IDENTIFIER`: `CERTENROLL_OBJECTID` = 169;
public const val `XCN_OID_AUTHORITY_KEY_IDENTIFIER2`: `CERTENROLL_OBJECTID` = 181;
public const val `XCN_OID_AUTHORITY_REVOCATION_LIST`: `CERTENROLL_OBJECTID` = 156;
public const val `XCN_OID_AUTO_ENROLL_CTL_USAGE`: `CERTENROLL_OBJECTID` = 217;
public const val `XCN_OID_BACKGROUND_OTHER_LOGOTYPE`: `CERTENROLL_OBJECTID` = 327;
public const val `XCN_OID_BASIC_CONSTRAINTS`: `CERTENROLL_OBJECTID` = 175;
public const val `XCN_OID_BASIC_CONSTRAINTS2`: `CERTENROLL_OBJECTID` = 178;
public const val `XCN_OID_BIOMETRIC_EXT`: `CERTENROLL_OBJECTID` = 205;
public const val `XCN_OID_BUSINESS_CATEGORY`: `CERTENROLL_OBJECTID` = 133;
public const val `XCN_OID_CA_CERTIFICATE`: `CERTENROLL_OBJECTID` = 155;
public const val `XCN_OID_CERTIFICATE_REVOCATION_LIST`: `CERTENROLL_OBJECTID` = 157;
public const val `XCN_OID_CERTIFICATE_TEMPLATE`: `CERTENROLL_OBJECTID` = 226;
public const val `XCN_OID_CERTSRV_CA_VERSION`: `CERTENROLL_OBJECTID` = 220;
public const val `XCN_OID_CERTSRV_CROSSCA_VERSION`: `CERTENROLL_OBJECTID` = 240;
public const val `XCN_OID_CERTSRV_PREVIOUS_CERT_HASH`: `CERTENROLL_OBJECTID` = 221;
public const val `XCN_OID_CERT_DISALLOWED_FILETIME_PROP_ID`: `CERTENROLL_OBJECTID` = 358;
public const val `XCN_OID_CERT_EXTENSIONS`: `CERTENROLL_OBJECTID` = 207;
public const val `XCN_OID_CERT_ISSUER_SERIAL_NUMBER_MD5_HASH_PROP_ID`: `CERTENROLL_OBJECTID` = 339;
public const val `XCN_OID_CERT_KEY_IDENTIFIER_PROP_ID`: `CERTENROLL_OBJECTID` = 338;
public const val `XCN_OID_CERT_MANIFOLD`: `CERTENROLL_OBJECTID` = 219;
public const val `XCN_OID_CERT_MD5_HASH_PROP_ID`: `CERTENROLL_OBJECTID` = 341;
public const val `XCN_OID_CERT_POLICIES`: `CERTENROLL_OBJECTID` = 179;
public const val `XCN_OID_CERT_POLICIES_95`: `CERTENROLL_OBJECTID` = 171;
public const val `XCN_OID_CERT_POLICIES_95_QUALIFIER1`: `CERTENROLL_OBJECTID` = 281;
public const val `XCN_OID_CERT_PROP_ID_PREFIX`: `CERTENROLL_OBJECTID` = 337;
public const val `XCN_OID_CERT_SIGNATURE_HASH_PROP_ID`: `CERTENROLL_OBJECTID` = 359;
public const val `XCN_OID_CERT_STRONG_KEY_OS_1`: `CERTENROLL_OBJECTID` = 360;
public const val `XCN_OID_CERT_STRONG_KEY_OS_CURRENT`: `CERTENROLL_OBJECTID` = 361;
public const val `XCN_OID_CERT_STRONG_KEY_OS_PREFIX`: `CERTENROLL_OBJECTID` = 362;
public const val `XCN_OID_CERT_STRONG_SIGN_OS_1`: `CERTENROLL_OBJECTID` = 363;
public const val `XCN_OID_CERT_STRONG_SIGN_OS_CURRENT`: `CERTENROLL_OBJECTID` = 364;
public const val `XCN_OID_CERT_STRONG_SIGN_OS_PREFIX`: `CERTENROLL_OBJECTID` = 365;
public const val `XCN_OID_CERT_SUBJECT_NAME_MD5_HASH_PROP_ID`: `CERTENROLL_OBJECTID` = 340;
public const val `XCN_OID_CMC`: `CERTENROLL_OBJECTID` = 304;
public const val `XCN_OID_CMC_ADD_ATTRIBUTES`: `CERTENROLL_OBJECTID` = 325;
public const val `XCN_OID_CMC_ADD_EXTENSIONS`: `CERTENROLL_OBJECTID` = 312;
public const val `XCN_OID_CMC_DATA_RETURN`: `CERTENROLL_OBJECTID` = 308;
public const val `XCN_OID_CMC_DECRYPTED_POP`: `CERTENROLL_OBJECTID` = 314;
public const val `XCN_OID_CMC_ENCRYPTED_POP`: `CERTENROLL_OBJECTID` = 313;
public const val `XCN_OID_CMC_GET_CERT`: `CERTENROLL_OBJECTID` = 316;
public const val `XCN_OID_CMC_GET_CRL`: `CERTENROLL_OBJECTID` = 317;
public const val `XCN_OID_CMC_IDENTIFICATION`: `CERTENROLL_OBJECTID` = 306;
public const val `XCN_OID_CMC_IDENTITY_PROOF`: `CERTENROLL_OBJECTID` = 307;
public const val `XCN_OID_CMC_ID_CONFIRM_CERT_ACCEPTANCE`: `CERTENROLL_OBJECTID` = 324;
public const val `XCN_OID_CMC_ID_POP_LINK_RANDOM`: `CERTENROLL_OBJECTID` = 322;
public const val `XCN_OID_CMC_ID_POP_LINK_WITNESS`: `CERTENROLL_OBJECTID` = 323;
public const val `XCN_OID_CMC_LRA_POP_WITNESS`: `CERTENROLL_OBJECTID` = 315;
public const val `XCN_OID_CMC_QUERY_PENDING`: `CERTENROLL_OBJECTID` = 321;
public const val `XCN_OID_CMC_RECIPIENT_NONCE`: `CERTENROLL_OBJECTID` = 311;
public const val `XCN_OID_CMC_REG_INFO`: `CERTENROLL_OBJECTID` = 319;
public const val `XCN_OID_CMC_RESPONSE_INFO`: `CERTENROLL_OBJECTID` = 320;
public const val `XCN_OID_CMC_REVOKE_REQUEST`: `CERTENROLL_OBJECTID` = 318;
public const val `XCN_OID_CMC_SENDER_NONCE`: `CERTENROLL_OBJECTID` = 310;
public const val `XCN_OID_CMC_STATUS_INFO`: `CERTENROLL_OBJECTID` = 305;
public const val `XCN_OID_CMC_TRANSACTION_ID`: `CERTENROLL_OBJECTID` = 309;
public const val `XCN_OID_COMMON_NAME`: `CERTENROLL_OBJECTID` = 121;
public const val `XCN_OID_COUNTRY_NAME`: `CERTENROLL_OBJECTID` = 124;
public const val `XCN_OID_CRL_DIST_POINTS`: `CERTENROLL_OBJECTID` = 187;
public const val `XCN_OID_CRL_NEXT_PUBLISH`: `CERTENROLL_OBJECTID` = 223;
public const val `XCN_OID_CRL_NUMBER`: `CERTENROLL_OBJECTID` = 189;
public const val `XCN_OID_CRL_REASON_CODE`: `CERTENROLL_OBJECTID` = 185;
public const val `XCN_OID_CRL_SELF_CDP`: `CERTENROLL_OBJECTID` = 233;
public const val `XCN_OID_CRL_VIRTUAL_BASE`: `CERTENROLL_OBJECTID` = 222;
public const val `XCN_OID_CROSS_CERTIFICATE_PAIR`: `CERTENROLL_OBJECTID` = 158;
public const val `XCN_OID_CROSS_CERT_DIST_POINTS`: `CERTENROLL_OBJECTID` = 210;
public const val `XCN_OID_CTL`: `CERTENROLL_OBJECTID` = 211;
public const val `XCN_OID_CT_PKI_DATA`: `CERTENROLL_OBJECTID` = 301;
public const val `XCN_OID_CT_PKI_RESPONSE`: `CERTENROLL_OBJECTID` = 302;
public const val `XCN_OID_DELTA_CRL_INDICATOR`: `CERTENROLL_OBJECTID` = 190;
public const val `XCN_OID_DESCRIPTION`: `CERTENROLL_OBJECTID` = 131;
public const val `XCN_OID_DESTINATION_INDICATOR`: `CERTENROLL_OBJECTID` = 145;
public const val `XCN_OID_DEVICE_SERIAL_NUMBER`: `CERTENROLL_OBJECTID` = 123;
public const val `XCN_OID_DH_SINGLE_PASS_STDDH_SHA1_KDF`: `CERTENROLL_OBJECTID` = 366;
public const val `XCN_OID_DH_SINGLE_PASS_STDDH_SHA256_KDF`: `CERTENROLL_OBJECTID` = 367;
public const val `XCN_OID_DH_SINGLE_PASS_STDDH_SHA384_KDF`: `CERTENROLL_OBJECTID` = 368;
public const val `XCN_OID_DISALLOWED_HASH`: `CERTENROLL_OBJECTID` = 369;
public const val `XCN_OID_DISALLOWED_LIST`: `CERTENROLL_OBJECTID` = 370;
public const val `XCN_OID_DN_QUALIFIER`: `CERTENROLL_OBJECTID` = 161;
public const val `XCN_OID_DOMAIN_COMPONENT`: `CERTENROLL_OBJECTID` = 162;
public const val `XCN_OID_DRM`: `CERTENROLL_OBJECTID` = 273;
public const val `XCN_OID_DRM_INDIVIDUALIZATION`: `CERTENROLL_OBJECTID` = 274;
public const val `XCN_OID_DS`: `CERTENROLL_OBJECTID` = 58;
public const val `XCN_OID_DSALG`: `CERTENROLL_OBJECTID` = 59;
public const val `XCN_OID_DSALG_CRPT`: `CERTENROLL_OBJECTID` = 60;
public const val `XCN_OID_DSALG_HASH`: `CERTENROLL_OBJECTID` = 61;
public const val `XCN_OID_DSALG_RSA`: `CERTENROLL_OBJECTID` = 63;
public const val `XCN_OID_DSALG_SIGN`: `CERTENROLL_OBJECTID` = 62;
public const val `XCN_OID_DS_EMAIL_REPLICATION`: `CERTENROLL_OBJECTID` = 237;
public const val `XCN_OID_ECC_CURVE_P256`: `CERTENROLL_OBJECTID` = 371;
public const val `XCN_OID_ECC_CURVE_P384`: `CERTENROLL_OBJECTID` = 372;
public const val `XCN_OID_ECC_CURVE_P521`: `CERTENROLL_OBJECTID` = 373;
public const val `XCN_OID_ECC_PUBLIC_KEY`: `CERTENROLL_OBJECTID` = 349;
public const val `XCN_OID_ECDSA_SHA1`: `CERTENROLL_OBJECTID` = 350;
public const val `XCN_OID_ECDSA_SHA256`: `CERTENROLL_OBJECTID` = 374;
public const val `XCN_OID_ECDSA_SHA384`: `CERTENROLL_OBJECTID` = 375;
public const val `XCN_OID_ECDSA_SHA512`: `CERTENROLL_OBJECTID` = 376;
public const val `XCN_OID_ECDSA_SPECIFIED`: `CERTENROLL_OBJECTID` = 351;
public const val `XCN_OID_EFS_RECOVERY`: `CERTENROLL_OBJECTID` = 260;
public const val `XCN_OID_EMBEDDED_NT_CRYPTO`: `CERTENROLL_OBJECTID` = 264;
public const val `XCN_OID_ENCRYPTED_KEY_HASH`: `CERTENROLL_OBJECTID` = 239;
public const val `XCN_OID_ENHANCED_KEY_USAGE`: `CERTENROLL_OBJECTID` = 188;
public const val `XCN_OID_ENROLLMENT_AGENT`: `CERTENROLL_OBJECTID` = 201;
public const val `XCN_OID_ENROLLMENT_CSP_PROVIDER`: `CERTENROLL_OBJECTID` = 199;
public const val `XCN_OID_ENROLLMENT_NAME_VALUE_PAIR`: `CERTENROLL_OBJECTID` = 198;
public const val `XCN_OID_ENROLL_ATTESTATION_CHALLENGE`: `CERTENROLL_OBJECTID` = 435;
public const val `XCN_OID_ENROLL_ATTESTATION_STATEMENT`: `CERTENROLL_OBJECTID` = 436;
public const val `XCN_OID_ENROLL_CAXCHGCERT_HASH`: `CERTENROLL_OBJECTID` = 377;
public const val `XCN_OID_ENROLL_CERTTYPE_EXTENSION`: `CERTENROLL_OBJECTID` = 218;
public const val `XCN_OID_ENROLL_EKPUB_CHALLENGE`: `CERTENROLL_OBJECTID` = 379;
public const val `XCN_OID_ENROLL_EKVERIFYCERT`: `CERTENROLL_OBJECTID` = 380;
public const val `XCN_OID_ENROLL_EKVERIFYCREDS`: `CERTENROLL_OBJECTID` = 381;
public const val `XCN_OID_ENROLL_EKVERIFYKEY`: `CERTENROLL_OBJECTID` = 382;
public const val `XCN_OID_ENROLL_EK_INFO`: `CERTENROLL_OBJECTID` = 378;
public const val `XCN_OID_ENROLL_ENCRYPTION_ALGORITHM`: `CERTENROLL_OBJECTID` = 437;
public const val `XCN_OID_ENROLL_KSP_NAME`: `CERTENROLL_OBJECTID` = 438;
public const val `XCN_OID_ENROLL_SCEP_ERROR`: `CERTENROLL_OBJECTID` = 428;
public const val `XCN_OID_ENTERPRISE_OID_ROOT`: `CERTENROLL_OBJECTID` = 227;
public const val `XCN_OID_EV_RDN_COUNTRY`: `CERTENROLL_OBJECTID` = 383;
public const val `XCN_OID_EV_RDN_LOCALE`: `CERTENROLL_OBJECTID` = 384;
public const val `XCN_OID_EV_RDN_STATE_OR_PROVINCE`: `CERTENROLL_OBJECTID` = 385;
public const val `XCN_OID_FACSIMILE_TELEPHONE_NUMBER`: `CERTENROLL_OBJECTID` = 141;
public const val `XCN_OID_FRESHEST_CRL`: `CERTENROLL_OBJECTID` = 192;
public const val `XCN_OID_GIVEN_NAME`: `CERTENROLL_OBJECTID` = 159;
public const val `XCN_OID_INFOSEC`: `CERTENROLL_OBJECTID` = 99;
public const val `XCN_OID_INFOSEC_SuiteAConfidentiality`: `CERTENROLL_OBJECTID` = 113;
public const val `XCN_OID_INFOSEC_SuiteAIntegrity`: `CERTENROLL_OBJECTID` = 114;
public const val `XCN_OID_INFOSEC_SuiteAKMandSig`: `CERTENROLL_OBJECTID` = 117;
public const val `XCN_OID_INFOSEC_SuiteAKeyManagement`: `CERTENROLL_OBJECTID` = 116;
public const val `XCN_OID_INFOSEC_SuiteASignature`: `CERTENROLL_OBJECTID` = 112;
public const val `XCN_OID_INFOSEC_SuiteATokenProtection`: `CERTENROLL_OBJECTID` = 115;
public const val `XCN_OID_INFOSEC_mosaicConfidentiality`: `CERTENROLL_OBJECTID` = 103;
public const val `XCN_OID_INFOSEC_mosaicIntegrity`: `CERTENROLL_OBJECTID` = 105;
public const val `XCN_OID_INFOSEC_mosaicKMandSig`: `CERTENROLL_OBJECTID` = 111;
public const val `XCN_OID_INFOSEC_mosaicKMandUpdSig`: `CERTENROLL_OBJECTID` = 119;
public const val `XCN_OID_INFOSEC_mosaicKeyManagement`: `CERTENROLL_OBJECTID` = 109;
public const val `XCN_OID_INFOSEC_mosaicSignature`: `CERTENROLL_OBJECTID` = 101;
public const val `XCN_OID_INFOSEC_mosaicTokenProtection`: `CERTENROLL_OBJECTID` = 107;
public const val `XCN_OID_INFOSEC_mosaicUpdatedInteg`: `CERTENROLL_OBJECTID` = 120;
public const val `XCN_OID_INFOSEC_mosaicUpdatedSig`: `CERTENROLL_OBJECTID` = 118;
public const val `XCN_OID_INFOSEC_sdnsConfidentiality`: `CERTENROLL_OBJECTID` = 102;
public const val `XCN_OID_INFOSEC_sdnsIntegrity`: `CERTENROLL_OBJECTID` = 104;
public const val `XCN_OID_INFOSEC_sdnsKMandSig`: `CERTENROLL_OBJECTID` = 110;
public const val `XCN_OID_INFOSEC_sdnsKeyManagement`: `CERTENROLL_OBJECTID` = 108;
public const val `XCN_OID_INFOSEC_sdnsSignature`: `CERTENROLL_OBJECTID` = 100;
public const val `XCN_OID_INFOSEC_sdnsTokenProtection`: `CERTENROLL_OBJECTID` = 106;
public const val `XCN_OID_INHIBIT_ANY_POLICY`: `CERTENROLL_OBJECTID` = 386;
public const val `XCN_OID_INITIALS`: `CERTENROLL_OBJECTID` = 160;
public const val `XCN_OID_INTERNATIONALIZED_EMAIL_ADDRESS`: `CERTENROLL_OBJECTID` = 387;
public const val `XCN_OID_INTERNATIONAL_ISDN_NUMBER`: `CERTENROLL_OBJECTID` = 143;
public const val `XCN_OID_IPSEC_KP_IKE_INTERMEDIATE`: `CERTENROLL_OBJECTID` = 254;
public const val `XCN_OID_ISSUED_CERT_HASH`: `CERTENROLL_OBJECTID` = 236;
public const val `XCN_OID_ISSUER_ALT_NAME`: `CERTENROLL_OBJECTID` = 174;
public const val `XCN_OID_ISSUER_ALT_NAME2`: `CERTENROLL_OBJECTID` = 184;
public const val `XCN_OID_ISSUING_DIST_POINT`: `CERTENROLL_OBJECTID` = 191;
public const val `XCN_OID_KEYID_RDN`: `CERTENROLL_OBJECTID` = 168;
public const val `XCN_OID_KEY_ATTRIBUTES`: `CERTENROLL_OBJECTID` = 170;
public const val `XCN_OID_KEY_USAGE`: `CERTENROLL_OBJECTID` = 176;
public const val `XCN_OID_KEY_USAGE_RESTRICTION`: `CERTENROLL_OBJECTID` = 172;
public const val `XCN_OID_KP_CA_EXCHANGE`: `CERTENROLL_OBJECTID` = 224;
public const val `XCN_OID_KP_CSP_SIGNATURE`: `CERTENROLL_OBJECTID` = 272;
public const val `XCN_OID_KP_CTL_USAGE_SIGNING`: `CERTENROLL_OBJECTID` = 255;
public const val `XCN_OID_KP_DOCUMENT_SIGNING`: `CERTENROLL_OBJECTID` = 268;
public const val `XCN_OID_KP_EFS`: `CERTENROLL_OBJECTID` = 259;
public const val `XCN_OID_KP_KERNEL_MODE_CODE_SIGNING`: `CERTENROLL_OBJECTID` = 388;
public const val `XCN_OID_KP_KERNEL_MODE_HAL_EXTENSION_SIGNING`: `CERTENROLL_OBJECTID` = 389;
public const val `XCN_OID_KP_KERNEL_MODE_TRUSTED_BOOT_SIGNING`: `CERTENROLL_OBJECTID` = 390;
public const val `XCN_OID_KP_KEY_RECOVERY`: `CERTENROLL_OBJECTID` = 267;
public const val `XCN_OID_KP_KEY_RECOVERY_AGENT`: `CERTENROLL_OBJECTID` = 225;
public const val `XCN_OID_KP_LIFETIME_SIGNING`: `CERTENROLL_OBJECTID` = 269;
public const val `XCN_OID_KP_MOBILE_DEVICE_SOFTWARE`: `CERTENROLL_OBJECTID` = 270;
public const val `XCN_OID_KP_QUALIFIED_SUBORDINATION`: `CERTENROLL_OBJECTID` = 266;
public const val `XCN_OID_KP_SMARTCARD_LOGON`: `CERTENROLL_OBJECTID` = 277;
public const val `XCN_OID_KP_SMART_DISPLAY`: `CERTENROLL_OBJECTID` = 271;
public const val `XCN_OID_KP_TIME_STAMP_SIGNING`: `CERTENROLL_OBJECTID` = 256;
public const val `XCN_OID_KP_TPM_AIK_CERTIFICATE`: `CERTENROLL_OBJECTID` = 391;
public const val `XCN_OID_KP_TPM_EK_CERTIFICATE`: `CERTENROLL_OBJECTID` = 392;
public const val `XCN_OID_KP_TPM_PLATFORM_CERTIFICATE`: `CERTENROLL_OBJECTID` = 393;
public const val `XCN_OID_LEGACY_POLICY_MAPPINGS`: `CERTENROLL_OBJECTID` = 195;
public const val `XCN_OID_LICENSES`: `CERTENROLL_OBJECTID` = 275;
public const val `XCN_OID_LICENSE_SERVER`: `CERTENROLL_OBJECTID` = 276;
public const val `XCN_OID_LOCALITY_NAME`: `CERTENROLL_OBJECTID` = 125;
public const val `XCN_OID_LOCAL_MACHINE_KEYSET`: `CERTENROLL_OBJECTID` = 166;
public const val `XCN_OID_LOGOTYPE_EXT`: `CERTENROLL_OBJECTID` = 206;
public const val `XCN_OID_LOYALTY_OTHER_LOGOTYPE`: `CERTENROLL_OBJECTID` = 326;
public const val `XCN_OID_MEMBER`: `CERTENROLL_OBJECTID` = 149;
public const val `XCN_OID_NAME_CONSTRAINTS`: `CERTENROLL_OBJECTID` = 193;
public const val `XCN_OID_NETSCAPE`: `CERTENROLL_OBJECTID` = 289;
public const val `XCN_OID_NETSCAPE_BASE_URL`: `CERTENROLL_OBJECTID` = 292;
public const val `XCN_OID_NETSCAPE_CA_POLICY_URL`: `CERTENROLL_OBJECTID` = 296;
public const val `XCN_OID_NETSCAPE_CA_REVOCATION_URL`: `CERTENROLL_OBJECTID` = 294;
public const val `XCN_OID_NETSCAPE_CERT_EXTENSION`: `CERTENROLL_OBJECTID` = 290;
public const val `XCN_OID_NETSCAPE_CERT_RENEWAL_URL`: `CERTENROLL_OBJECTID` = 295;
public const val `XCN_OID_NETSCAPE_CERT_SEQUENCE`: `CERTENROLL_OBJECTID` = 300;
public const val `XCN_OID_NETSCAPE_CERT_TYPE`: `CERTENROLL_OBJECTID` = 291;
public const val `XCN_OID_NETSCAPE_COMMENT`: `CERTENROLL_OBJECTID` = 298;
public const val `XCN_OID_NETSCAPE_DATA_TYPE`: `CERTENROLL_OBJECTID` = 299;
public const val `XCN_OID_NETSCAPE_REVOCATION_URL`: `CERTENROLL_OBJECTID` = 293;
public const val `XCN_OID_NETSCAPE_SSL_SERVER_NAME`: `CERTENROLL_OBJECTID` = 297;
public const val `XCN_OID_NEXT_UPDATE_LOCATION`: `CERTENROLL_OBJECTID` = 208;
public const val `XCN_OID_NIST_AES128_CBC`: `CERTENROLL_OBJECTID` = 394;
public const val `XCN_OID_NIST_AES128_WRAP`: `CERTENROLL_OBJECTID` = 395;
public const val `XCN_OID_NIST_AES192_CBC`: `CERTENROLL_OBJECTID` = 396;
public const val `XCN_OID_NIST_AES192_WRAP`: `CERTENROLL_OBJECTID` = 397;
public const val `XCN_OID_NIST_AES256_CBC`: `CERTENROLL_OBJECTID` = 398;
public const val `XCN_OID_NIST_AES256_WRAP`: `CERTENROLL_OBJECTID` = 399;
public const val `XCN_OID_NIST_sha256`: `CERTENROLL_OBJECTID` = 345;
public const val `XCN_OID_NIST_sha384`: `CERTENROLL_OBJECTID` = 346;
public const val `XCN_OID_NIST_sha512`: `CERTENROLL_OBJECTID` = 347;
public const val `XCN_OID_NONE`: `CERTENROLL_OBJECTID` = 0;
public const val `XCN_OID_NT5_CRYPTO`: `CERTENROLL_OBJECTID` = 262;
public const val `XCN_OID_NTDS_REPLICATION`: `CERTENROLL_OBJECTID` = 241;
public const val `XCN_OID_NT_PRINCIPAL_NAME`: `CERTENROLL_OBJECTID` = 214;
public const val `XCN_OID_OEM_WHQL_CRYPTO`: `CERTENROLL_OBJECTID` = 263;
public const val `XCN_OID_OIW`: `CERTENROLL_OBJECTID` = 64;
public const val `XCN_OID_OIWDIR`: `CERTENROLL_OBJECTID` = 93;
public const val `XCN_OID_OIWDIR_CRPT`: `CERTENROLL_OBJECTID` = 94;
public const val `XCN_OID_OIWDIR_HASH`: `CERTENROLL_OBJECTID` = 95;
public const val `XCN_OID_OIWDIR_SIGN`: `CERTENROLL_OBJECTID` = 96;
public const val `XCN_OID_OIWDIR_md2`: `CERTENROLL_OBJECTID` = 97;
public const val `XCN_OID_OIWDIR_md2RSA`: `CERTENROLL_OBJECTID` = 98;
public const val `XCN_OID_OIWSEC`: `CERTENROLL_OBJECTID` = 65;
public const val `XCN_OID_OIWSEC_desCBC`: `CERTENROLL_OBJECTID` = 70;
public const val `XCN_OID_OIWSEC_desCFB`: `CERTENROLL_OBJECTID` = 72;
public const val `XCN_OID_OIWSEC_desECB`: `CERTENROLL_OBJECTID` = 69;
public const val `XCN_OID_OIWSEC_desEDE`: `CERTENROLL_OBJECTID` = 80;
public const val `XCN_OID_OIWSEC_desMAC`: `CERTENROLL_OBJECTID` = 73;
public const val `XCN_OID_OIWSEC_desOFB`: `CERTENROLL_OBJECTID` = 71;
public const val `XCN_OID_OIWSEC_dhCommMod`: `CERTENROLL_OBJECTID` = 79;
public const val `XCN_OID_OIWSEC_dsa`: `CERTENROLL_OBJECTID` = 75;
public const val `XCN_OID_OIWSEC_dsaComm`: `CERTENROLL_OBJECTID` = 83;
public const val `XCN_OID_OIWSEC_dsaCommSHA`: `CERTENROLL_OBJECTID` = 84;
public const val `XCN_OID_OIWSEC_dsaCommSHA1`: `CERTENROLL_OBJECTID` = 91;
public const val `XCN_OID_OIWSEC_dsaSHA1`: `CERTENROLL_OBJECTID` = 90;
public const val `XCN_OID_OIWSEC_keyHashSeal`: `CERTENROLL_OBJECTID` = 86;
public const val `XCN_OID_OIWSEC_md2RSASign`: `CERTENROLL_OBJECTID` = 87;
public const val `XCN_OID_OIWSEC_md4RSA`: `CERTENROLL_OBJECTID` = 66;
public const val `XCN_OID_OIWSEC_md4RSA2`: `CERTENROLL_OBJECTID` = 68;
public const val `XCN_OID_OIWSEC_md5RSA`: `CERTENROLL_OBJECTID` = 67;
public const val `XCN_OID_OIWSEC_md5RSASign`: `CERTENROLL_OBJECTID` = 88;
public const val `XCN_OID_OIWSEC_mdc2`: `CERTENROLL_OBJECTID` = 82;
public const val `XCN_OID_OIWSEC_mdc2RSA`: `CERTENROLL_OBJECTID` = 77;
public const val `XCN_OID_OIWSEC_rsaSign`: `CERTENROLL_OBJECTID` = 74;
public const val `XCN_OID_OIWSEC_rsaXchg`: `CERTENROLL_OBJECTID` = 85;
public const val `XCN_OID_OIWSEC_sha`: `CERTENROLL_OBJECTID` = 81;
public const val `XCN_OID_OIWSEC_sha1`: `CERTENROLL_OBJECTID` = 89;
public const val `XCN_OID_OIWSEC_sha1RSASign`: `CERTENROLL_OBJECTID` = 92;
public const val `XCN_OID_OIWSEC_shaDSA`: `CERTENROLL_OBJECTID` = 76;
public const val `XCN_OID_OIWSEC_shaRSA`: `CERTENROLL_OBJECTID` = 78;
public const val `XCN_OID_ORGANIZATIONAL_UNIT_NAME`: `CERTENROLL_OBJECTID` = 129;
public const val `XCN_OID_ORGANIZATION_NAME`: `CERTENROLL_OBJECTID` = 128;
public const val `XCN_OID_OS_VERSION`: `CERTENROLL_OBJECTID` = 200;
public const val `XCN_OID_OWNER`: `CERTENROLL_OBJECTID` = 150;
public const val `XCN_OID_PHYSICAL_DELIVERY_OFFICE_NAME`: `CERTENROLL_OBJECTID` = 137;
public const val `XCN_OID_PKCS`: `CERTENROLL_OBJECTID` = 2;
public const val `XCN_OID_PKCS_1`: `CERTENROLL_OBJECTID` = 5;
public const val `XCN_OID_PKCS_10`: `CERTENROLL_OBJECTID` = 14;
public const val `XCN_OID_PKCS_12`: `CERTENROLL_OBJECTID` = 15;
public const val `XCN_OID_PKCS_12_EXTENDED_ATTRIBUTES`: `CERTENROLL_OBJECTID` = 167;
public const val `XCN_OID_PKCS_12_FRIENDLY_NAME_ATTR`: `CERTENROLL_OBJECTID` = 163;
public const val `XCN_OID_PKCS_12_KEY_PROVIDER_NAME_ATTR`: `CERTENROLL_OBJECTID` = 165;
public const val `XCN_OID_PKCS_12_LOCAL_KEY_ID`: `CERTENROLL_OBJECTID` = 164;
public const val `XCN_OID_PKCS_12_PROTECTED_PASSWORD_SECRET_BAG_TYPE_ID`: `CERTENROLL_OBJECTID` = 407;
public const val `XCN_OID_PKCS_12_PbeIds`: `CERTENROLL_OBJECTID` = 400;
public const val `XCN_OID_PKCS_12_pbeWithSHA1And128BitRC2`: `CERTENROLL_OBJECTID` = 401;
public const val `XCN_OID_PKCS_12_pbeWithSHA1And128BitRC4`: `CERTENROLL_OBJECTID` = 402;
public const val `XCN_OID_PKCS_12_pbeWithSHA1And2KeyTripleDES`: `CERTENROLL_OBJECTID` = 403;
public const val `XCN_OID_PKCS_12_pbeWithSHA1And3KeyTripleDES`: `CERTENROLL_OBJECTID` = 404;
public const val `XCN_OID_PKCS_12_pbeWithSHA1And40BitRC2`: `CERTENROLL_OBJECTID` = 405;
public const val `XCN_OID_PKCS_12_pbeWithSHA1And40BitRC4`: `CERTENROLL_OBJECTID` = 406;
public const val `XCN_OID_PKCS_2`: `CERTENROLL_OBJECTID` = 6;
public const val `XCN_OID_PKCS_3`: `CERTENROLL_OBJECTID` = 7;
public const val `XCN_OID_PKCS_4`: `CERTENROLL_OBJECTID` = 8;
public const val `XCN_OID_PKCS_5`: `CERTENROLL_OBJECTID` = 9;
public const val `XCN_OID_PKCS_6`: `CERTENROLL_OBJECTID` = 10;
public const val `XCN_OID_PKCS_7`: `CERTENROLL_OBJECTID` = 11;
public const val `XCN_OID_PKCS_7_DATA`: `CERTENROLL_OBJECTID` = 329;
public const val `XCN_OID_PKCS_7_DIGESTED`: `CERTENROLL_OBJECTID` = 333;
public const val `XCN_OID_PKCS_7_ENCRYPTED`: `CERTENROLL_OBJECTID` = 334;
public const val `XCN_OID_PKCS_7_ENVELOPED`: `CERTENROLL_OBJECTID` = 331;
public const val `XCN_OID_PKCS_7_SIGNED`: `CERTENROLL_OBJECTID` = 330;
public const val `XCN_OID_PKCS_7_SIGNEDANDENVELOPED`: `CERTENROLL_OBJECTID` = 332;
public const val `XCN_OID_PKCS_8`: `CERTENROLL_OBJECTID` = 12;
public const val `XCN_OID_PKCS_9`: `CERTENROLL_OBJECTID` = 13;
public const val `XCN_OID_PKCS_9_CONTENT_TYPE`: `CERTENROLL_OBJECTID` = 335;
public const val `XCN_OID_PKCS_9_MESSAGE_DIGEST`: `CERTENROLL_OBJECTID` = 336;
public const val `XCN_OID_PKINIT_KP_KDC`: `CERTENROLL_OBJECTID` = 408;
public const val `XCN_OID_PKIX`: `CERTENROLL_OBJECTID` = 202;
public const val `XCN_OID_PKIX_ACC_DESCR`: `CERTENROLL_OBJECTID` = 282;
public const val `XCN_OID_PKIX_CA_ISSUERS`: `CERTENROLL_OBJECTID` = 284;
public const val `XCN_OID_PKIX_CA_REPOSITORY`: `CERTENROLL_OBJECTID` = 409;
public const val `XCN_OID_PKIX_KP`: `CERTENROLL_OBJECTID` = 243;
public const val `XCN_OID_PKIX_KP_CLIENT_AUTH`: `CERTENROLL_OBJECTID` = 245;
public const val `XCN_OID_PKIX_KP_CODE_SIGNING`: `CERTENROLL_OBJECTID` = 246;
public const val `XCN_OID_PKIX_KP_EMAIL_PROTECTION`: `CERTENROLL_OBJECTID` = 247;
public const val `XCN_OID_PKIX_KP_IPSEC_END_SYSTEM`: `CERTENROLL_OBJECTID` = 248;
public const val `XCN_OID_PKIX_KP_IPSEC_TUNNEL`: `CERTENROLL_OBJECTID` = 249;
public const val `XCN_OID_PKIX_KP_IPSEC_USER`: `CERTENROLL_OBJECTID` = 250;
public const val `XCN_OID_PKIX_KP_OCSP_SIGNING`: `CERTENROLL_OBJECTID` = 252;
public const val `XCN_OID_PKIX_KP_SERVER_AUTH`: `CERTENROLL_OBJECTID` = 244;
public const val `XCN_OID_PKIX_KP_TIMESTAMP_SIGNING`: `CERTENROLL_OBJECTID` = 251;
public const val `XCN_OID_PKIX_NO_SIGNATURE`: `CERTENROLL_OBJECTID` = 303;
public const val `XCN_OID_PKIX_OCSP`: `CERTENROLL_OBJECTID` = 283;
public const val `XCN_OID_PKIX_OCSP_BASIC_SIGNED_RESPONSE`: `CERTENROLL_OBJECTID` = 328;
public const val `XCN_OID_PKIX_OCSP_NOCHECK`: `CERTENROLL_OBJECTID` = 253;
public const val `XCN_OID_PKIX_OCSP_NONCE`: `CERTENROLL_OBJECTID` = 410;
public const val `XCN_OID_PKIX_PE`: `CERTENROLL_OBJECTID` = 203;
public const val `XCN_OID_PKIX_POLICY_QUALIFIER_CPS`: `CERTENROLL_OBJECTID` = 279;
public const val `XCN_OID_PKIX_POLICY_QUALIFIER_USERNOTICE`: `CERTENROLL_OBJECTID` = 280;
public const val `XCN_OID_PKIX_TIME_STAMPING`: `CERTENROLL_OBJECTID` = 411;
public const val `XCN_OID_POLICY_CONSTRAINTS`: `CERTENROLL_OBJECTID` = 196;
public const val `XCN_OID_POLICY_MAPPINGS`: `CERTENROLL_OBJECTID` = 194;
public const val `XCN_OID_POSTAL_ADDRESS`: `CERTENROLL_OBJECTID` = 134;
public const val `XCN_OID_POSTAL_CODE`: `CERTENROLL_OBJECTID` = 135;
public const val `XCN_OID_POST_OFFICE_BOX`: `CERTENROLL_OBJECTID` = 136;
public const val `XCN_OID_PREFERRED_DELIVERY_METHOD`: `CERTENROLL_OBJECTID` = 146;
public const val `XCN_OID_PRESENTATION_ADDRESS`: `CERTENROLL_OBJECTID` = 147;
public const val `XCN_OID_PRIVATEKEY_USAGE_PERIOD`: `CERTENROLL_OBJECTID` = 177;
public const val `XCN_OID_PRODUCT_UPDATE`: `CERTENROLL_OBJECTID` = 215;
public const val `XCN_OID_QC_EU_COMPLIANCE`: `CERTENROLL_OBJECTID` = 412;
public const val `XCN_OID_QC_SSCD`: `CERTENROLL_OBJECTID` = 413;
public const val `XCN_OID_QC_STATEMENTS_EXT`: `CERTENROLL_OBJECTID` = 414;
public const val `XCN_OID_RDN_DUMMY_SIGNER`: `CERTENROLL_OBJECTID` = 228;
public const val `XCN_OID_RDN_TPM_MANUFACTURER`: `CERTENROLL_OBJECTID` = 415;
public const val `XCN_OID_RDN_TPM_MODEL`: `CERTENROLL_OBJECTID` = 416;
public const val `XCN_OID_RDN_TPM_VERSION`: `CERTENROLL_OBJECTID` = 417;
public const val `XCN_OID_REASON_CODE_HOLD`: `CERTENROLL_OBJECTID` = 186;
public const val `XCN_OID_REGISTERED_ADDRESS`: `CERTENROLL_OBJECTID` = 144;
public const val `XCN_OID_REMOVE_CERTIFICATE`: `CERTENROLL_OBJECTID` = 209;
public const val `XCN_OID_RENEWAL_CERTIFICATE`: `CERTENROLL_OBJECTID` = 197;
public const val `XCN_OID_REQUEST_CLIENT_INFO`: `CERTENROLL_OBJECTID` = 238;
public const val `XCN_OID_REQUIRE_CERT_CHAIN_POLICY`: `CERTENROLL_OBJECTID` = 234;
public const val `XCN_OID_REVOKED_LIST_SIGNER`: `CERTENROLL_OBJECTID` = 418;
public const val `XCN_OID_RFC3161_counterSign`: `CERTENROLL_OBJECTID` = 419;
public const val `XCN_OID_ROLE_OCCUPANT`: `CERTENROLL_OBJECTID` = 151;
public const val `XCN_OID_ROOT_LIST_SIGNER`: `CERTENROLL_OBJECTID` = 265;
public const val `XCN_OID_ROOT_PROGRAM_AUTO_UPDATE_CA_REVOCATION`: `CERTENROLL_OBJECTID` = 420;
public const val `XCN_OID_ROOT_PROGRAM_AUTO_UPDATE_END_REVOCATION`: `CERTENROLL_OBJECTID` = 421;
public const val `XCN_OID_ROOT_PROGRAM_FLAGS`: `CERTENROLL_OBJECTID` = 422;
public const val `XCN_OID_ROOT_PROGRAM_NO_OCSP_FAILOVER_TO_CRL`: `CERTENROLL_OBJECTID` = 423;
public const val `XCN_OID_RSA`: `CERTENROLL_OBJECTID` = 1;
public const val `XCN_OID_RSAES_OAEP`: `CERTENROLL_OBJECTID` = 425;
public const val `XCN_OID_RSA_DES_EDE3_CBC`: `CERTENROLL_OBJECTID` = 51;
public const val `XCN_OID_RSA_DH`: `CERTENROLL_OBJECTID` = 22;
public const val `XCN_OID_RSA_ENCRYPT`: `CERTENROLL_OBJECTID` = 4;
public const val `XCN_OID_RSA_HASH`: `CERTENROLL_OBJECTID` = 3;
public const val `XCN_OID_RSA_MD2`: `CERTENROLL_OBJECTID` = 46;
public const val `XCN_OID_RSA_MD2RSA`: `CERTENROLL_OBJECTID` = 17;
public const val `XCN_OID_RSA_MD4`: `CERTENROLL_OBJECTID` = 47;
public const val `XCN_OID_RSA_MD4RSA`: `CERTENROLL_OBJECTID` = 18;
public const val `XCN_OID_RSA_MD5`: `CERTENROLL_OBJECTID` = 48;
public const val `XCN_OID_RSA_MD5RSA`: `CERTENROLL_OBJECTID` = 19;
public const val `XCN_OID_RSA_MGF1`: `CERTENROLL_OBJECTID` = 348;
public const val `XCN_OID_RSA_PSPECIFIED`: `CERTENROLL_OBJECTID` = 424;
public const val `XCN_OID_RSA_RC2CBC`: `CERTENROLL_OBJECTID` = 49;
public const val `XCN_OID_RSA_RC4`: `CERTENROLL_OBJECTID` = 50;
public const val `XCN_OID_RSA_RC5_CBCPad`: `CERTENROLL_OBJECTID` = 52;
public const val `XCN_OID_RSA_RSA`: `CERTENROLL_OBJECTID` = 16;
public const val `XCN_OID_RSA_SETOAEP_RSA`: `CERTENROLL_OBJECTID` = 21;
public const val `XCN_OID_RSA_SHA1RSA`: `CERTENROLL_OBJECTID` = 20;
public const val `XCN_OID_RSA_SHA256RSA`: `CERTENROLL_OBJECTID` = 342;
public const val `XCN_OID_RSA_SHA384RSA`: `CERTENROLL_OBJECTID` = 343;
public const val `XCN_OID_RSA_SHA512RSA`: `CERTENROLL_OBJECTID` = 344;
public const val `XCN_OID_RSA_SMIMECapabilities`: `CERTENROLL_OBJECTID` = 40;
public const val `XCN_OID_RSA_SMIMEalg`: `CERTENROLL_OBJECTID` = 42;
public const val `XCN_OID_RSA_SMIMEalgCMS3DESwrap`: `CERTENROLL_OBJECTID` = 44;
public const val `XCN_OID_RSA_SMIMEalgCMSRC2wrap`: `CERTENROLL_OBJECTID` = 45;
public const val `XCN_OID_RSA_SMIMEalgESDH`: `CERTENROLL_OBJECTID` = 43;
public const val `XCN_OID_RSA_SSA_PSS`: `CERTENROLL_OBJECTID` = 353;
public const val `XCN_OID_RSA_certExtensions`: `CERTENROLL_OBJECTID` = 39;
public const val `XCN_OID_RSA_challengePwd`: `CERTENROLL_OBJECTID` = 36;
public const val `XCN_OID_RSA_contentType`: `CERTENROLL_OBJECTID` = 32;
public const val `XCN_OID_RSA_counterSign`: `CERTENROLL_OBJECTID` = 35;
public const val `XCN_OID_RSA_data`: `CERTENROLL_OBJECTID` = 23;
public const val `XCN_OID_RSA_digestedData`: `CERTENROLL_OBJECTID` = 27;
public const val `XCN_OID_RSA_emailAddr`: `CERTENROLL_OBJECTID` = 30;
public const val `XCN_OID_RSA_encryptedData`: `CERTENROLL_OBJECTID` = 29;
public const val `XCN_OID_RSA_envelopedData`: `CERTENROLL_OBJECTID` = 25;
public const val `XCN_OID_RSA_extCertAttrs`: `CERTENROLL_OBJECTID` = 38;
public const val `XCN_OID_RSA_hashedData`: `CERTENROLL_OBJECTID` = 28;
public const val `XCN_OID_RSA_messageDigest`: `CERTENROLL_OBJECTID` = 33;
public const val `XCN_OID_RSA_preferSignedData`: `CERTENROLL_OBJECTID` = 41;
public const val `XCN_OID_RSA_signEnvData`: `CERTENROLL_OBJECTID` = 26;
public const val `XCN_OID_RSA_signedData`: `CERTENROLL_OBJECTID` = 24;
public const val `XCN_OID_RSA_signingTime`: `CERTENROLL_OBJECTID` = 34;
public const val `XCN_OID_RSA_unstructAddr`: `CERTENROLL_OBJECTID` = 37;
public const val `XCN_OID_RSA_unstructName`: `CERTENROLL_OBJECTID` = 31;
public const val `XCN_OID_SEARCH_GUIDE`: `CERTENROLL_OBJECTID` = 132;
public const val `XCN_OID_SEE_ALSO`: `CERTENROLL_OBJECTID` = 152;
public const val `XCN_OID_SERIALIZED`: `CERTENROLL_OBJECTID` = 213;
public const val `XCN_OID_SERVER_GATED_CRYPTO`: `CERTENROLL_OBJECTID` = 257;
public const val `XCN_OID_SGC_NETSCAPE`: `CERTENROLL_OBJECTID` = 258;
public const val `XCN_OID_SORTED_CTL`: `CERTENROLL_OBJECTID` = 212;
public const val `XCN_OID_STATE_OR_PROVINCE_NAME`: `CERTENROLL_OBJECTID` = 126;
public const val `XCN_OID_STREET_ADDRESS`: `CERTENROLL_OBJECTID` = 127;
public const val `XCN_OID_SUBJECT_ALT_NAME`: `CERTENROLL_OBJECTID` = 173;
public const val `XCN_OID_SUBJECT_ALT_NAME2`: `CERTENROLL_OBJECTID` = 183;
public const val `XCN_OID_SUBJECT_DIR_ATTRS`: `CERTENROLL_OBJECTID` = 242;
public const val `XCN_OID_SUBJECT_INFO_ACCESS`: `CERTENROLL_OBJECTID` = 426;
public const val `XCN_OID_SUBJECT_KEY_IDENTIFIER`: `CERTENROLL_OBJECTID` = 182;
public const val `XCN_OID_SUPPORTED_APPLICATION_CONTEXT`: `CERTENROLL_OBJECTID` = 148;
public const val `XCN_OID_SUR_NAME`: `CERTENROLL_OBJECTID` = 122;
public const val `XCN_OID_TELEPHONE_NUMBER`: `CERTENROLL_OBJECTID` = 138;
public const val `XCN_OID_TELETEXT_TERMINAL_IDENTIFIER`: `CERTENROLL_OBJECTID` = 140;
public const val `XCN_OID_TELEX_NUMBER`: `CERTENROLL_OBJECTID` = 139;
public const val `XCN_OID_TIMESTAMP_TOKEN`: `CERTENROLL_OBJECTID` = 427;
public const val `XCN_OID_TITLE`: `CERTENROLL_OBJECTID` = 130;
public const val `XCN_OID_USER_CERTIFICATE`: `CERTENROLL_OBJECTID` = 154;
public const val `XCN_OID_USER_PASSWORD`: `CERTENROLL_OBJECTID` = 153;
public const val `XCN_OID_VERISIGN_BITSTRING_6_13`: `CERTENROLL_OBJECTID` = 287;
public const val `XCN_OID_VERISIGN_ISS_STRONG_CRYPTO`: `CERTENROLL_OBJECTID` = 288;
public const val `XCN_OID_VERISIGN_ONSITE_JURISDICTION_HASH`: `CERTENROLL_OBJECTID` = 286;
public const val `XCN_OID_VERISIGN_PRIVATE_6_9`: `CERTENROLL_OBJECTID` = 285;
public const val `XCN_OID_WHQL_CRYPTO`: `CERTENROLL_OBJECTID` = 261;
public const val `XCN_OID_X21_ADDRESS`: `CERTENROLL_OBJECTID` = 142;
public const val `XCN_OID_X957`: `CERTENROLL_OBJECTID` = 55;
public const val `XCN_OID_X957_DSA`: `CERTENROLL_OBJECTID` = 56;
public const val `XCN_OID_X957_SHA1DSA`: `CERTENROLL_OBJECTID` = 57;
public const val `XCN_OID_YESNO_TRUST_ATTR`: `CERTENROLL_OBJECTID` = 278;
public const val `XCN_PROPERTYID_NONE`: `CERTENROLL_PROPERTYID` = 0;
public const val `XCN_PROV_DH_SCHANNEL`: `X509ProviderType` = 18;
public const val `XCN_PROV_DSS`: `X509ProviderType` = 3;
public const val `XCN_PROV_DSS_DH`: `X509ProviderType` = 13;
public const val `XCN_PROV_EC_ECDSA_FULL`: `X509ProviderType` = 16;
public const val `XCN_PROV_EC_ECDSA_SIG`: `X509ProviderType` = 14;
public const val `XCN_PROV_EC_ECNRA_FULL`: `X509ProviderType` = 17;
public const val `XCN_PROV_EC_ECNRA_SIG`: `X509ProviderType` = 15;
public const val `XCN_PROV_FORTEZZA`: `X509ProviderType` = 4;
public const val `XCN_PROV_INTEL_SEC`: `X509ProviderType` = 22;
public const val `XCN_PROV_MS_EXCHANGE`: `X509ProviderType` = 5;
public const val `XCN_PROV_NONE`: `X509ProviderType` = 0;
public const val `XCN_PROV_REPLACE_OWF`: `X509ProviderType` = 23;
public const val `XCN_PROV_RNG`: `X509ProviderType` = 21;
public const val `XCN_PROV_RSA_AES`: `X509ProviderType` = 24;
public const val `XCN_PROV_RSA_FULL`: `X509ProviderType` = 1;
public const val `XCN_PROV_RSA_SCHANNEL`: `X509ProviderType` = 12;
public const val `XCN_PROV_RSA_SIG`: `X509ProviderType` = 2;
public const val `XCN_PROV_SPYRUS_LYNKS`: `X509ProviderType` = 20;
public const val `XCN_PROV_SSL`: `X509ProviderType` = 6;
public const val `XECI_AUTOENROLL`: UInt = 2u;
public const val `XECI_CERTREQ`: UInt = 4u;
public const val `XECI_DISABLE`: UInt = 0u;
public const val `XECI_REQWIZARD`: UInt = 3u;
public const val `XECI_XENROLL`: UInt = 1u;
public const val `XECP_STRING_PROPERTY`: UInt = 1u;
public const val `XECR_CMC`: `CERT_CREATE_REQUEST_FLAGS` = 3;
public const val `XECR_PKCS10_V1_5`: `CERT_CREATE_REQUEST_FLAGS` = 4;
public const val `XECR_PKCS10_V2_0`: `CERT_CREATE_REQUEST_FLAGS` = 1;
public const val `XECR_PKCS7`: `CERT_CREATE_REQUEST_FLAGS` = 2;
public const val `XECT_EXTENSION_V1`: `ADDED_CERT_TYPE` = 1;
public const val `XECT_EXTENSION_V2`: `ADDED_CERT_TYPE` = 2;
public typealias `XEKL_KEYSIZE` = Int;
public const val `XEKL_KEYSIZE_DEFAULT`: UInt = 4u;
public const val `XEKL_KEYSIZE_INC`: `XEKL_KEYSIZE` = 3;
public const val `XEKL_KEYSIZE_MAX`: `XEKL_KEYSIZE` = 2;
public const val `XEKL_KEYSIZE_MIN`: `XEKL_KEYSIZE` = 1;
public typealias `XEKL_KEYSPEC` = Int;
public const val `XEKL_KEYSPEC_KEYX`: `XEKL_KEYSPEC` = 1;
public const val `XEKL_KEYSPEC_SIG`: `XEKL_KEYSPEC` = 2;
public const val `XEPR_CADNS`: `PENDING_REQUEST_DESIRED_PROPERTY` = 1;
public const val `XEPR_CAFRIENDLYNAME`: `PENDING_REQUEST_DESIRED_PROPERTY` = 3;
public const val `XEPR_CANAME`: `PENDING_REQUEST_DESIRED_PROPERTY` = 2;
public const val `XEPR_DATE`: UInt = 5u;
public const val `XEPR_ENUM_FIRST`: Int = -1;
public const val `XEPR_HASH`: `PENDING_REQUEST_DESIRED_PROPERTY` = 8;
public const val `XEPR_REQUESTID`: `PENDING_REQUEST_DESIRED_PROPERTY` = 4;
public const val `XEPR_TEMPLATENAME`: UInt = 6u;
public const val `XEPR_V1TEMPLATENAME`: UInt = 9u;
public const val `XEPR_V2TEMPLATEOID`: UInt = 16u;
public const val `XEPR_VERSION`: UInt = 7u;
public const val `dwCAXCHGOVERLAPPERIODCOUNTDEFAULT`: UInt = 1u;
public const val `dwCAXCHGVALIDITYPERIODCOUNTDEFAULT`: UInt = 1u;
public const val `dwCRLDELTAOVERLAPPERIODCOUNTDEFAULT`: UInt = 0u;
public const val `dwCRLDELTAPERIODCOUNTDEFAULT`: UInt = 1u;
public const val `dwCRLOVERLAPPERIODCOUNTDEFAULT`: UInt = 0u;
public const val `dwCRLPERIODCOUNTDEFAULT`: UInt = 1u;
public const val `dwVALIDITYPERIODCOUNTDEFAULT_ENTERPRISE`: UInt = 2u;
public const val `dwVALIDITYPERIODCOUNTDEFAULT_ROOT`: UInt = 5u;
public const val `dwVALIDITYPERIODCOUNTDEFAULT_STANDALONE`: UInt = 1u;
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `szBACKUPANNOTATION`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("Cert Server Backup Interface");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `szDBBASENAMEPARM`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("edb");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `szNAMESEPARATORDEFAULT`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("\u000a");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `szPROPASNTAG`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("{asn}");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `szRESTOREANNOTATION`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("Cert Server Restore Interface");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszAT_EKCERTINF`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("@EKCert");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszAT_TESTROOT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("@TestRoot");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCAPOLICYFILE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CAPolicy.inf");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCERTEXITMODULE_POSTFIX`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`(".Exit");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCERTIFICATETRANSPARENCYFLAGS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CertificateTransparencyFlags");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCERTMANAGE_SUFFIX`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Manage");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCERTPOLICYMODULE_POSTFIX`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`(".Policy");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCERT_TYPE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RequestType");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCERT_TYPE_CLIENT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Client");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCERT_TYPE_CODESIGN`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CodeSign");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCERT_TYPE_CUSTOMER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SetCustomer");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCERT_TYPE_MERCHANT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SetMerchant");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCERT_TYPE_PAYMENT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SetPayment");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCERT_TYPE_SERVER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Server");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCERT_VERSION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Version");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCERT_VERSION_1`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCERT_VERSION_2`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("2");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCERT_VERSION_3`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("3");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCLASS_CERTADMIN`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CertificateAuthority.Admin");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCLASS_CERTCONFIG`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CertificateAuthority.Config");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCLASS_CERTDBMEM`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CertificateAuthority.DBMem");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCLASS_CERTENCODE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CertificateAuthority.Encode");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCLASS_CERTGETCONFIG`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CertificateAuthority.GetConfig");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCLASS_CERTREQUEST`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CertificateAuthority.Request");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCLASS_CERTSERVEREXIT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CertificateAuthority.ServerExit");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCLASS_CERTSERVERPOLICY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CertificateAuthority.ServerPolicy");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCLASS_CERTVIEW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CertificateAuthority.View");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCMM_PROP_COPYRIGHT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Copyright");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCMM_PROP_DESCRIPTION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Description");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCMM_PROP_DISPLAY_HWND`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("HWND");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCMM_PROP_FILEVER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("File Version");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCMM_PROP_ISMULTITHREADED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("IsMultiThreaded");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCMM_PROP_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Name");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCMM_PROP_PRODUCTVER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Product Version");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCNGENCRYPTIONALGORITHM`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CNGEncryptionAlgorithm");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCNGHASHALGORITHM`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CNGHashAlgorithm");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCNGPUBLICKEYALGORITHM`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CNGPublicKeyAlgorithm");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCONFIG_AUTHORITY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Authority");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCONFIG_COMMENT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Comment");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCONFIG_COMMONNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CommonName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCONFIG_CONFIG`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Config");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCONFIG_COUNTRY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Country");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCONFIG_DESCRIPTION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Description");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCONFIG_EXCHANGECERTIFICATE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ExchangeCertificate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCONFIG_FLAGS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Flags");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCONFIG_LOCALITY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Locality");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCONFIG_ORGANIZATION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Organization");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCONFIG_ORGUNIT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("OrgUnit");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCONFIG_SANITIZEDNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SanitizedName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCONFIG_SANITIZEDSHORTNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SanitizedShortName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCONFIG_SERVER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Server");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCONFIG_SHORTNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ShortName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCONFIG_SIGNATURECERTIFICATE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SignatureCertificate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCONFIG_STATE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("State");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCONFIG_WEBENROLLMENTSERVERS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WebEnrollmentServers");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCRLPUBLISHRETRYCOUNT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLPublishRetryCount");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszCRTFILENAMEEXT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`(".crt");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszDATFILENAMEEXT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`(".dat");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszDBBACKUPCERTBACKDAT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("certbkxp.dat");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszDBBACKUPSUBDIR`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DataBase");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszDBFILENAMEEXT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`(".edb");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszENCRYPTIONALGORITHM`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EncryptionAlgorithm");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszENROLLMENTAGENTRIGHTS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EnrollmentAgentRights");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszHASHALGORITHM`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("HashAlgorithm");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_ALTERNATESIGNATUREALGORITHM`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AlternateSignatureAlgorithm");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_ATTESTPRIVATEKEY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AttestPrivateKey");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_CACAPABILITIES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CACapabilities");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_CACERTS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CACerts");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_CATHUMBPRINT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CAThumbprint");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_CCDPSYNCDELTATIME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SyncDeltaTime");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_CHALLENGEPASSWORD`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ChallengePassword");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_CONTINUE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("_continue_");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_CRITICAL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Critical");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_CRLDELTAPERIODCOUNT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLDeltaPeriodUnits");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_CRLDELTAPERIODSTRING`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLDeltaPeriod");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_CRLPERIODCOUNT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLPeriodUnits");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_CRLPERIODSTRING`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLPeriod");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_DIRECTORYNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DirectoryName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_DNS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DNS");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_ECCKEYPARAMETERS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EccKeyParameters");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_ECCKEYPARAMETERSTYPE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EccKeyParametersType");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_ECCKEYPARAMETERS_A`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EccKeyParameters_A");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_ECCKEYPARAMETERS_B`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EccKeyParameters_B");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_ECCKEYPARAMETERS_BASE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EccKeyParameters_Base");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_ECCKEYPARAMETERS_COFACTOR`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EccKeyParameters_Cofactor");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_ECCKEYPARAMETERS_ORDER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EccKeyParameters_Order");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_ECCKEYPARAMETERS_P`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EccKeyParameters_P");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_ECCKEYPARAMETERS_SEED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EccKeyParameters_Seed");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_EMAIL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EMail");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_EMPTY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Empty");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_ENABLEKEYCOUNTING`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EnableKeyCounting");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_ENCRYPTIONALGORITHM`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EncryptionAlgorithm");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_ENCRYPTIONLENGTH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EncryptionLength");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_EXCLUDE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Exclude");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_EXPORTABLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Exportable");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_EXPORTABLEENCRYPTED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ExportableEncrypted");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_FLAGS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Flags");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_FORCEUTF8`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ForceUTF8");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_FRIENDLYNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FriendlyName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_HASHALGORITHM`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("HashAlgorithm");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_INCLUDE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Include");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_INHIBITPOLICYMAPPING`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("InhibitPolicyMapping");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_IPADDRESS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("IPAddress");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_KEYALGORITHM`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KeyAlgorithm");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_KEYALGORITHMPARMETERS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KeyAlgorithmParameters");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_KEYCONTAINER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KeyContainer");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_KEYLENGTH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KeyLength");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_KEYPROTECTION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KeyProtection");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_KEYUSAGEEXTENSION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KeyUsage");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_KEYUSAGEPROPERTY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KeyUsageProperty");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_LEGACYKEYSPEC`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KeySpec");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_LOADDEFAULTTEMPLATES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LoadDefaultTemplates");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_MACHINEKEYSET`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MachineKeySet");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_NOTAFTER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NotAfter");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_NOTBEFORE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NotBefore");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_NOTICE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Notice");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_OID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("OID");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_OTHERNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("OtherName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_PATHLENGTH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PathLength");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_POLICIES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Policies");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_PRIVATEKEYARCHIVE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PrivateKeyArchive");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_PROVIDERNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ProviderName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_PROVIDERTYPE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ProviderType");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_PUBLICKEY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PublicKey");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_PUBLICKEYPARAMETERS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PublicKeyParameters");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_READERNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ReaderName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_REGISTEREDID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RegisteredId");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_RENEWALCERT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RenewalCert");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_RENEWALKEYLENGTH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RenewalKeyLength");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_RENEWALVALIDITYPERIODCOUNT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RenewalValidityPeriodUnits");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_RENEWALVALIDITYPERIODSTRING`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RenewalValidityPeriod");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_REQUESTTYPE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RequestType");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_REQUIREEXPLICITPOLICY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RequireExplicitPolicy");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_SECURITYDESCRIPTOR`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SecurityDescriptor");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_SERIALNUMBER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SerialNumber");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_SHOWALLCSPS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ShowAllCSPs");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_SILENT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Silent");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_SMIME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SMIME");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_SUBJECT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Subject");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_SUBJECTNAMEFLAGS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SubjectNameFlags");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_SUBTREE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SubTree");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_SUPPRESSDEFAULTS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SuppressDefaults");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_UICONTEXTMESSAGE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("UIContextMessage");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_UPN`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("UPN");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_URL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("URL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_USEEXISTINGKEY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("UseExistingKeySet");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_USERPROTECTED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("UserProtected");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_UTF8`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("UTF8");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFKEY_X500NAMEFLAGS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("X500NameFlags");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFSECTION_AIA`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AuthorityInformationAccess");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFSECTION_APPLICATIONPOLICYCONSTRAINTS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ApplicationPolicyConstraintsExtension");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFSECTION_APPLICATIONPOLICYMAPPINGS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ApplicationPolicyMappingsExtension");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFSECTION_APPLICATIONPOLICYSTATEMENT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ApplicationPolicyStatementExtension");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFSECTION_BASICCONSTRAINTS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BasicConstraintsExtension");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFSECTION_CAPOLICY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CAPolicy");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFSECTION_CCDP`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CrossCertificateDistributionPointsExtension");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFSECTION_CDP`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLDistributionPoint");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFSECTION_CERTSERVER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("certsrv_server");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFSECTION_EKU`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EnhancedKeyUsageExtension");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFSECTION_EXTENSIONS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Extensions");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFSECTION_NAMECONSTRAINTS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NameConstraintsExtension");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFSECTION_NEWREQUEST`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NewRequest");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFSECTION_POLICYCONSTRAINTS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PolicyConstraintsExtension");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFSECTION_POLICYMAPPINGS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PolicyMappingsExtension");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFSECTION_POLICYSTATEMENT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PolicyStatementExtension");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFSECTION_PROPERTIES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Properties");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFSECTION_REQUESTATTRIBUTES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RequestAttributes");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFVALUE_ENDORSEMENTKEY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EndorsementKey");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFVALUE_REQUESTTYPE_CERT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Cert");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFVALUE_REQUESTTYPE_CMC`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CMC");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFVALUE_REQUESTTYPE_PKCS10`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PKCS10");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFVALUE_REQUESTTYPE_PKCS7`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PKCS7");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszINFVALUE_REQUESTTYPE_SCEP`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SCEP");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszLDAPSESSIONOPTIONVALUE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LDAPSessionOptionValue");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszLOCALIZEDTIMEPERIODUNITS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LocalizedTimePeriodUnits");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszLOGFILENAMEEXT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`(".log");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszLOGPATH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CertLog");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszMACHINEKEYSET`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MachineKeyset");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszMICROSOFTCERTMODULE_PREFIX`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CertificateAuthority_MicrosoftDefault");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszNETSCAPEREVOCATIONTYPE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Netscape");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPCAPROP_CACERTIFICATE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CACertificate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPCAPROP_CACONFIG`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CAConfig");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPCAPROP_CSPNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CSPName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPCAPROP_ERRORCODE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ErrorCode");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPCAPROP_HASHALGORITHMID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("HashAlgorithmId");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPCAPROP_KEYSPEC`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KeySpec");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPCAPROP_LOCALREVOCATIONINFORMATION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LocalRevocationInformation");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPCAPROP_PROVIDERCLSID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ProviderCLSID");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPCAPROP_PROVIDERPROPERTIES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Provider");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPCAPROP_REMINDERDURATION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ReminderDuration");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPCAPROP_SIGNINGCERTIFICATE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SigningCertificate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPCAPROP_SIGNINGCERTIFICATETEMPLATE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SigningCertificateTemplate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPCAPROP_SIGNINGFLAGS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SigningFlags");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPCOMMONPROP_MAXINCOMINGMESSAGESIZE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MaxIncomingMessageSize");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPCOMMONPROP_MAXNUMOFREQUESTENTRIES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MaxNumOfRequestEntries");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPCOMMONPROP_REQFLAGS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RequestFlags");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPISAPIPROP_DEBUG`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ISAPIDebug");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPISAPIPROP_MAXAGE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MaxAge");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPISAPIPROP_MAXNUMOFCACHEENTRIES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MaxNumOfCacheEntries");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPISAPIPROP_NUMOFBACKENDCONNECTIONS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NumOfBackendConnections");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPISAPIPROP_NUMOFTHREADS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NumOfThreads");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPISAPIPROP_REFRESHRATE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RefreshRate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPISAPIPROP_VIRTUALROOTNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("VirtualRootName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPPROP_ARRAYCONTROLLER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ArrayController");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPPROP_ARRAYMEMBERS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ArrayMembers");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPPROP_AUDITFILTER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AuditFilter");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPPROP_DEBUG`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Debug");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPPROP_ENROLLPOLLINTERVAL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EnrollPollInterval");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPPROP_LOGLEVEL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LogLevel");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPREVPROP_BASECRL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BaseCrl");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPREVPROP_BASECRLURLS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BaseCrlUrls");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPREVPROP_CRLURLTIMEOUT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CrlUrlTimeOut");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPREVPROP_DELTACRL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DeltaCrl");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPREVPROP_DELTACRLURLS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DeltaCrlUrls");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPREVPROP_ERRORCODE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RevocationErrorCode");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPREVPROP_REFRESHTIMEOUT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RefreshTimeOut");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszOCSPREVPROP_SERIALNUMBERSDIRS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("IssuedSerialNumbersDirectories");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPERIODDAYS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Days");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPERIODHOURS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Hours");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPERIODMINUTES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Minutes");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPERIODMONTHS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Months");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPERIODSECONDS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Seconds");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPERIODWEEKS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Weeks");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPERIODYEARS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Years");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPFXFILENAMEEXT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`(".p12");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPATTESTATIONCHALLENGE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AttestationChallenge");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPATTRIBNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AttributeName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPATTRIBREQUESTID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AttributeRequestId");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPATTRIBVALUE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AttributeValue");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCALLERNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CallerName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCATYPE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CAType");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCERTCLIENTMACHINE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ccm");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCERTCOUNT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CertCount");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCERTIFICATEENROLLMENTFLAGS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EnrollmentFlags");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCERTIFICATEGENERALFLAGS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("GeneralFlags");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCERTIFICATEHASH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CertificateHash");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCERTIFICATENOTAFTERDATE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NotAfter");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCERTIFICATENOTBEFOREDATE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NotBefore");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCERTIFICATEPRIVATEKEYFLAGS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PrivatekeyFlags");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCERTIFICATEPUBLICKEYALGORITHM`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PublicKeyAlgorithm");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCERTIFICATEPUBLICKEYLENGTH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PublicKeyLength");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCERTIFICATERAWPUBLICKEY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RawPublicKey");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCERTIFICATERAWPUBLICKEYALGORITHMPARAMETERS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RawPublicKeyAlgorithmParameters");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCERTIFICATERAWSMIMECAPABILITIES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RawSMIMECapabilities");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCERTIFICATEREQUESTID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RequestID");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCERTIFICATESERIALNUMBER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SerialNumber");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCERTIFICATESUBJECTKEYIDENTIFIER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SubjectKeyIdentifier");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCERTIFICATETEMPLATE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CertificateTemplate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCERTIFICATETYPE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CertificateType");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCERTIFICATEUPN`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("UPN");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCERTSTATE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CertState");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCERTSUFFIX`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CertSuffix");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCERTTEMPLATE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CertificateTemplate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCERTTYPE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CertType");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCERTUSAGE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CertificateUsage");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCHALLENGE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Challenge");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCLIENTBROWSERMACHINE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("cbm");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCLIENTDCDNS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("cdc");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCOMMONNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CommonName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCONFIGDN`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ConfigDN");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCOUNTRY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Country");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCRITICALTAG`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{critical}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCRLCOUNT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLCount");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCRLEFFECTIVE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLEffective");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCRLINDEX`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLIndex");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCRLLASTPUBLISHED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLLastPublished");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCRLMINBASE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLMinBase");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCRLNAMEID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLNameId");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCRLNEXTPUBLISH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLNextPublish");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCRLNEXTUPDATE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLNextUpdate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCRLNUMBER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLNumber");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCRLPROPAGATIONCOMPLETE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLPropagationComplete");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCRLPUBLISHATTEMPTS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLPublishAttempts");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCRLPUBLISHERROR`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLPublishError");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCRLPUBLISHFLAGS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLPublishFlags");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCRLPUBLISHSTATUSCODE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLPublishStatusCode");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCRLRAWCRL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLRawCRL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCRLROWID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLRowId");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCRLSTATE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLState");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCRLSUFFIX`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLSuffix");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCRLTHISPUBLISH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLThisPublish");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCRLTHISUPDATE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLThisUpdate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPCROSSFOREST`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CrossForest");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPDCNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DCName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPDECIMALTAG`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{decimal}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPDELTACRLSDISABLED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("fDeltaCRLsDisabled");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPDEVICESERIALNUMBER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DeviceSerialNumber");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPDISPOSITION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Disposition");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPDISPOSITIONDENY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Deny");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPDISPOSITIONPENDING`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Pending");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPDISTINGUISHEDNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DistinguishedName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPDN`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("dn");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPDNS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("dns");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPDOMAINCOMPONENT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DomainComponent");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPDOMAINDN`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DomainDN");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPEMAIL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EMail");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPENDORSEMENTCERTIFICATEHASH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EndorsementCertificateHash");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPENDORSEMENTKEYHASH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EndorsementKeyHash");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPEVENTLOGERROR`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EventLogError");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPEVENTLOGEXHAUSTIVE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EventLogExhaustive");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPEVENTLOGTERSE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EventLogTerse");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPEVENTLOGVERBOSE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EventLogVerbose");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPEVENTLOGWARNING`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EventLogWarning");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPEXITCERTFILE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CertFile");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPEXPECTEDCHALLENGE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ExpectedChallenge");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPEXPIRATIONDATE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ExpirationDate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPEXTFLAGS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ExtensionFlags");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPEXTNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ExtensionName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPEXTRAWVALUE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ExtensionRawValue");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPEXTREQUESTID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ExtensionRequestId");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPFILETAG`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{file}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPGIVENNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("GivenName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPGUID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("guid");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPHEXTAG`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{hex}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPINITIALS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Initials");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPIPADDRESS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ipaddress");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPKEYARCHIVED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KeyArchived");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPLOCALITY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Locality");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPLOGLEVEL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LogLevel");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPMACHINEDNSNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MachineDNSName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPMODULEREGLOC`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ModuleRegistryLocation");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPNAMETYPE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NameType");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPOCTETTAG`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{octet}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPOFFICER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Officer");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPOID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("oid");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPORGANIZATION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Organization");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPORGUNIT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("OrgUnit");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPPUBLISHEXPIREDCERTINCRL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PublishExpiredCertInCRL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPRAWCACERTIFICATE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RawCACertificate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPRAWCERTIFICATE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RawCertificate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPRAWCRL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RawCRL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPRAWDELTACRL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RawDeltaCRL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPRAWNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RawName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPRAWPRECERTIFICATE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RawPrecertificate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPREQUESTARCHIVEDKEY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ArchivedKey");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPREQUESTATTRIBUTES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RequestAttributes");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPREQUESTCSPPROVIDER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RequestCSPProvider");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPREQUESTDISPOSITION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Disposition");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPREQUESTDISPOSITIONMESSAGE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DispositionMessage");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPREQUESTDOT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Request.");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPREQUESTERCAACCESS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RequesterCAAccess");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPREQUESTERDN`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RequesterDN");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPREQUESTERNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RequesterName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPREQUESTERNAMEFROMOLDCERTIFICATE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RequesterNameFromOldCertificate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPREQUESTERSAMNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RequesterSAMName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPREQUESTERUPN`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RequesterUPN");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPREQUESTFLAGS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RequestFlags");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPREQUESTKEYRECOVERYHASHES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KeyRecoveryHashes");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPREQUESTMACHINEDNS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("rmd");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPREQUESTOSVERSION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RequestOSVersion");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPREQUESTRAWARCHIVEDKEY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RawArchivedKey");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPREQUESTRAWOLDCERTIFICATE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RawOldCertificate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPREQUESTRAWREQUEST`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RawRequest");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPREQUESTREQUESTID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RequestID");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPREQUESTRESOLVEDWHEN`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ResolvedWhen");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPREQUESTREVOKEDEFFECTIVEWHEN`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RevokedEffectiveWhen");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPREQUESTREVOKEDREASON`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RevokedReason");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPREQUESTREVOKEDWHEN`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RevokedWhen");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPREQUESTSTATUSCODE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("StatusCode");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPREQUESTSUBMITTEDWHEN`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SubmittedWhen");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPREQUESTTYPE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RequestType");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPSANITIZEDCANAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SanitizedCAName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPSANITIZEDSHORTNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SanitizedShortName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPSEAUDITFILTER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SEAuditFilter");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPSEAUDITID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SEAuditId");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPSERVERUPGRADED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("fServerUpgraded");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPSESSIONCOUNT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SessionCount");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPSIGNERAPPLICATIONPOLICIES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SignerApplicationPolicies");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPSIGNERPOLICIES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SignerPolicies");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPSTATE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("State");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPSTREETADDRESS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("StreetAddress");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPSUBJECTALTNAME2`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("san");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPSUBJECTDOT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Subject.");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPSURNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SurName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPTEMPLATECHANGESEQUENCENUMBER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TemplateChangeSequenceNumber");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPTEXTTAG`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{text}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPTITLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Title");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPUNSTRUCTUREDADDRESS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("UnstructuredAddress");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPUNSTRUCTUREDNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("UnstructuredName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPUPN`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("upn");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPURL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("url");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPUSEDS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("fUseDS");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPUSERDN`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("UserDN");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPUTF8TAG`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{utf8}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPVALIDITYPERIODCOUNT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ValidityPeriodUnits");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPVALIDITYPERIODSTRING`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ValidityPeriod");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszPROPVOLATILEMODE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("VolatileMode");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGACTIVE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Active");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGAELOGLEVEL_OLD`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AEEventLogLevel");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGAIKCLOUDCAURL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AIKCloudCAURL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGAIKKEYALGORITHM`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AIKKeyAlgorithm");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGAIKKEYLENGTH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AIKKeyLength");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGALLPROVIDERS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("All");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGALTERNATEPUBLISHDOMAINS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AlternatePublishDomains");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGALTERNATESIGNATUREALGORITHM`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AlternateSignatureAlgorithm");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGAUDITFILTER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AuditFilter");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGB2ICERTMANAGEMODULE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ICertManageModule");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGBACKUPLOGDIRECTORY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BackupLogDirectory");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCACERTFILENAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CACertFileName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCACERTHASH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CACertHash");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCACERTPUBLICATIONURLS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CACertPublicationURLs");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCADESCRIPTION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CADescription");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCAPATHLENGTH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CAPathLength");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCASECURITY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Security");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCASERIALNUMBER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CACertSerialNumber");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCASERVERNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CAServerName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCATYPE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CAType");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCAUSEDS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("UseDS");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCAXCHGCERTHASH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CAXchgCertHash");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCAXCHGOVERLAPPERIODCOUNT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CAXchgOverlapPeriodUnits");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCAXCHGOVERLAPPERIODSTRING`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CAXchgOverlapPeriod");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCAXCHGVALIDITYPERIODCOUNT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CAXchgValidityPeriodUnits");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCAXCHGVALIDITYPERIODSTRING`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CAXchgValidityPeriod");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCERTENROLLCOMPATIBLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CertEnrollCompatible");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCERTIFICATETRANSPARENCYINFOOID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CTInformationExtensionOid");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCERTPUBLISHFLAGS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PublishCertFlags");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCERTSRVDEBUG`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Debug");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCHECKPOINTFILE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CheckPointFile");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCLOCKSKEWMINUTES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ClockSkewMinutes");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCOMMONNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CommonName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCRLATTEMPTREPUBLISH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLAttemptRepublish");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCRLDELTANEXTPUBLISH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLDeltaNextPublish");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCRLDELTAOVERLAPPERIODCOUNT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLDeltaOverlapUnits");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCRLDELTAOVERLAPPERIODSTRING`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLDeltaOverlapPeriod");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCRLDELTAPERIODCOUNT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLDeltaPeriodUnits");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCRLDELTAPERIODSTRING`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLDeltaPeriod");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCRLEDITFLAGS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLEditFlags");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCRLFLAGS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLFlags");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCRLNEXTPUBLISH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLNextPublish");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCRLOVERLAPPERIODCOUNT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLOverlapUnits");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCRLOVERLAPPERIODSTRING`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLOverlapPeriod");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCRLPATH_OLD`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLPath");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCRLPERIODCOUNT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLPeriodUnits");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCRLPERIODSTRING`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLPeriod");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGCRLPUBLICATIONURLS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLPublicationURLs");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGDATABASERECOVERED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DatabaseRecovered");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGDBDIRECTORY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DBDirectory");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGDBFLAGS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DBFlags");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGDBLASTFULLBACKUP`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DBLastFullBackup");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGDBLASTINCREMENTALBACKUP`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DBLastIncrementalBackup");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGDBLASTRECOVERY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DBLastRecovery");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGDBLOGDIRECTORY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DBLogDirectory");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGDBMAXREADSESSIONCOUNT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DBMaxReadSessionCount");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGDBSESSIONCOUNT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DBSessionCount");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGDBSYSDIRECTORY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DBSystemDirectory");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGDBTEMPDIRECTORY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DBTempDirectory");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGDEFAULTSMIME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DefaultSMIME");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGDIRECTORY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ConfigurationDirectory");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGDISABLEEXTENSIONLIST`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DisableExtensionList");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGDSCONFIGDN`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DSConfigDN");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGDSDOMAINDN`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DSDomainDN");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGEDITFLAGS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EditFlags");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGEKPUBLISTDIRECTORIES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EndorsementKeyListDirectories");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGEKUOIDSFORPUBLISHEXPIREDCERTINCRL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EKUOIDsForPublishExpiredCertInCRL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGEKUOIDSFORVOLATILEREQUESTS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EKUOIDsforVolatileRequests");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGENABLED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Enabled");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGENABLEDEKUFORDEFINEDCACERT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EnabledEKUForDefinedCACert");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGENABLEENROLLEEREQUESTEXTENSIONLIST`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EnableEnrolleeRequestExtensionList");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGENABLEREQUESTEXTENSIONLIST`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EnableRequestExtensionList");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGENFORCEX500NAMELENGTHS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EnforceX500NameLengths");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGENROLLFLAGS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EnrollFlags");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGEXITBODYARG`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BodyArg");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGEXITBODYFORMAT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BodyFormat");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGEXITCRLISSUEDKEY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CRLIssued");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGEXITDENIEDKEY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Denied");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGEXITIMPORTEDKEY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Imported");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGEXITISSUEDKEY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Issued");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGEXITPENDINGKEY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Pending");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGEXITPROPNOTFOUND`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("???");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGEXITREVOKEDKEY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Revoked");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGEXITSHUTDOWNKEY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Shutdown");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGEXITSMTPAUTHENTICATE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SMTPAuthenticate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGEXITSMTPCC`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Cc");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGEXITSMTPEVENTFILTER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EventFilter");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGEXITSMTPFROM`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("From");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGEXITSMTPKEY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SMTP");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGEXITSMTPSERVER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SMTPServer");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGEXITSMTPTEMPLATES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Templates");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGEXITSMTPTO`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("To");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGEXITSTARTUPKEY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Startup");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGEXITTITLEARG`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TitleArg");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGEXITTITLEFORMAT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TitleFormat");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGFILEISSUERCERTURL_OLD`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FileIssuerCertURL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGFILEREVOCATIONCRLURL_OLD`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FileRevocationCRLURL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGFORCETELETEX`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ForceTeletex");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGFTPISSUERCERTURL_OLD`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FTPIssuerCertURL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGFTPREVOCATIONCRLURL_OLD`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FTPRevocationCRLURL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGHIGHLOGNUMBER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("HighLogNumber");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGHIGHSERIAL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("HighSerial");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGINTERFACEFLAGS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("InterfaceFlags");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGISSUERCERTURLFLAGS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("IssuerCertURLFlags");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGISSUERCERTURL_OLD`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("IssuerCertURL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGKEYBASE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SYSTEM\\CurrentControlSet\\Services\\CertSvc");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGKEYCERTSVCPATH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SYSTEM\\CurrentControlSet\\Services\\CertSvc");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGKEYCONFIG`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Configuration");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGKEYCSP`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CSP");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGKEYDBPARAMETERS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DBParameters");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGKEYENCRYPTIONCSP`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EncryptionCSP");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGKEYENROLLMENT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Software\\Microsoft\\Cryptography\\AutoEnrollment");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGKEYEXITMODULES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ExitModules");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGKEYGROUPPOLICYENROLLMENT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Software\\Policies\\Microsoft\\Cryptography\\AutoEnrollment");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGKEYNOSYSTEMCERTSVCPATH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CurrentControlSet\\Services\\CertSvc");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGKEYPOLICYMODULES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PolicyModules");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGKEYREPAIR`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KeyRepair");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGKEYRESTOREINPROGRESS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RestoreInProgress");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGKEYSIZE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KeySize");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGKRACERTCOUNT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KRACertCount");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGKRACERTHASH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KRACertHash");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGKRAFLAGS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KRAFlags");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGLDAPFLAGS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LDAPFlags");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGLDAPISSUERCERTURL_OLD`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LDAPIssuerCertURL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGLDAPREVOCATIONCRLURL_OLD`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LDAPRevocationCRLURL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGLDAPREVOCATIONDNTEMPLATE_OLD`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LDAPRevocationDNTemplate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGLDAPREVOCATIONDN_OLD`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LDAPRevocationDN");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGLDAPSESSIONOPTIONS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LDAPSessionOptions");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGLOGLEVEL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LogLevel");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGLOGPATH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LogPath");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGLOWLOGNUMBER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LowLogNumber");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGMAXINCOMINGALLOCSIZE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MaxIncomingAllocSize");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGMAXINCOMINGMESSAGESIZE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MaxIncomingMessageSize");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGMAXPENDINGREQUESTDAYS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MaxPendingRequestDays");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGMAXSCTLISTSIZE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MaxSCTListSize");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGNAMESEPARATOR`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SubjectNameSeparator");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGNETSCAPECERTTYPE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NetscapeCertType");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGOFFICERRIGHTS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("OfficerRights");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGPARENTCAMACHINE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ParentCAMachine");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGPARENTCANAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ParentCAName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGPOLICYFLAGS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PolicyFlags");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGPRESERVESCEPDUMMYCERTS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PreserveSCEPDummyCerts");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGPROCESSINGFLAGS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ProcessingFlags");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGPROVIDER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Provider");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGPROVIDERTYPE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ProviderType");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGREQUESTDISPOSITION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RequestDisposition");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGREQUESTFILENAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RequestFileName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGREQUESTID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RequestId");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGREQUESTKEYCONTAINER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RequestKeyContainer");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGREQUESTKEYINDEX`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RequestKeyIndex");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGRESTOREMAP`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RestoreMap");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGRESTOREMAPCOUNT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RestoreMapCount");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGRESTORESTATUS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RestoreStatus");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGREVOCATIONCRLURL_OLD`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RevocationCRLURL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGREVOCATIONTYPE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RevocationType");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGREVOCATIONURL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RevocationURL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGROLESEPARATIONENABLED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RoleSeparationEnabled");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGSETUPSTATUS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SetupStatus");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGSP4DEFAULTCONFIGURATION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DefaultConfiguration");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGSP4KEYSETNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KeySetName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGSP4NAMES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Names");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGSP4QUERIES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Queries");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGSP4SUBJECTNAMESEPARATOR`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SubjectNameSeparator");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGSUBJECTALTNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SubjectAltName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGSUBJECTALTNAME2`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SubjectAltName2");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGSUBJECTTEMPLATE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SubjectTemplate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGSYMMETRICKEYSIZE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SymmetricKeySize");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGUNICODE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Unicode");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGUPNMAP`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("UPNMap");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGUSEDEFINEDCACERTINREQ`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("UseDefinedCACertInRequest");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGVALIDITYPERIODCOUNT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ValidityPeriodUnits");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGVALIDITYPERIODSTRING`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ValidityPeriod");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGVERIFYFLAGS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("VerifyFlags");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGVERSION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Version");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGVIEWAGEMINUTES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ViewAgeMinutes");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGVIEWIDLEMINUTES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ViewIdleMinutes");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGWEBCLIENTCAMACHINE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WebClientCAMachine");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGWEBCLIENTCANAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WebClientCAName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszREGWEBCLIENTCATYPE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WebClientCAType");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszSECUREDATTRIBUTES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SignedAttributes");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszSERVICE_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CertSvc");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `wszzDEFAULTSIGNEDATTRIBUTES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RequesterName\u0000");
