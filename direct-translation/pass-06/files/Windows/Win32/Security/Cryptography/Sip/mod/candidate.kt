// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=crypt32.dll, ABI=system, export=CryptSIPAddProvider; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptSIPAddProvider`(`psnewprov` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SIP_ADD_NEWPROVIDER`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptSIPCreateIndirectData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Catalog")]
public external fun `CryptSIPCreateIndirectData`(`psubjectinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SIP_SUBJECTINFO`>?, `pcbindirectdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pindirectdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SIP_INDIRECT_DATA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptSIPGetCaps; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Catalog")]
public external fun `CryptSIPGetCaps`(`psubjinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`SIP_SUBJECTINFO`>?, `pcaps` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SIP_CAP_SET_V3`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptSIPGetSealedDigest; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Catalog")]
public external fun `CryptSIPGetSealedDigest`(`psubjectinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`SIP_SUBJECTINFO`>?, `psig` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwsig` : UInt, `pbdigest` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pcbdigest` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptSIPGetSignedDataMsg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Catalog")]
public external fun `CryptSIPGetSignedDataMsg`(`psubjectinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SIP_SUBJECTINFO`>?, `pdwencodingtype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`CERT_QUERY_ENCODING_TYPE`>?, `dwindex` : UInt, `pcbsigneddatamsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pbsigneddatamsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=crypt32.dll, ABI=system, export=CryptSIPLoad; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Catalog")]
public external fun `CryptSIPLoad`(`pgsubject` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dwflags` : UInt, `psipdispatch` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SIP_DISPATCH_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptSIPPutSignedDataMsg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Catalog")]
public external fun `CryptSIPPutSignedDataMsg`(`psubjectinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SIP_SUBJECTINFO`>?, `dwencodingtype` : `super`.`CERT_QUERY_ENCODING_TYPE`, `pdwindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `cbsigneddatamsg` : UInt, `pbsigneddatamsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=crypt32.dll, ABI=system, export=CryptSIPRemoveProvider; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptSIPRemoveProvider`(`pgprov` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptSIPRemoveSignedDataMsg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Catalog")]
public external fun `CryptSIPRemoveSignedDataMsg`(`psubjectinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SIP_SUBJECTINFO`>?, `dwindex` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=crypt32.dll, ABI=system, export=CryptSIPRetrieveSubjectGuid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptSIPRetrieveSubjectGuid`(`filename` : `windows_sys`.`core`.`PCWSTR`, `hfilein` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `pgsubject` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=crypt32.dll, ABI=system, export=CryptSIPRetrieveSubjectGuidForCatalogFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptSIPRetrieveSubjectGuidForCatalogFile`(`filename` : `windows_sys`.`core`.`PCWSTR`, `hfilein` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `pgsubject` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=CryptSIPVerifyIndirectData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Catalog")]
public external fun `CryptSIPVerifyIndirectData`(`psubjectinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SIP_SUBJECTINFO`>?, `pindirectdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SIP_INDIRECT_DATA`>?) : `windows_sys`.`core`.`BOOL`
public const val `MSSIP_ADDINFO_BLOB`: UInt = 3u;
public const val `MSSIP_ADDINFO_CATMEMBER`: UInt = 2u;
public const val `MSSIP_ADDINFO_FLAT`: UInt = 1u;
public const val `MSSIP_ADDINFO_NONE`: UInt = 0u;
public const val `MSSIP_ADDINFO_NONMSSIP`: UInt = 500u;
public const val `MSSIP_FLAGS_MULTI_HASH`: UInt = 262144u;
public const val `MSSIP_FLAGS_PROHIBIT_RESIZE_ON_CREATE`: UInt = 65536u;
public const val `MSSIP_FLAGS_USE_CATALOG`: UInt = 131072u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MS_ADDINFO_BLOB` (
    public var `cbStruct`: UInt,
    public var `cbMemObject`: UInt,
    public var `pbMemObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbMemSignedMsg`: UInt,
    public var `pbMemSignedMsg`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MS_ADDINFO_BLOB`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MS_ADDINFO_BLOB`.Companion.`default`() : `MS_ADDINFO_BLOB` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MS_ADDINFO_FLAT` (
    public var `cbStruct`: UInt,
    public var `pIndirectData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SIP_INDIRECT_DATA`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MS_ADDINFO_FLAT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MS_ADDINFO_FLAT`.Companion.`default`() : `MS_ADDINFO_FLAT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SIP_ADD_NEWPROVIDER` (
    public var `cbStruct`: UInt,
    public var `pgSubject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `pwszDLLFileName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszMagicNumber`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszIsFunctionName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszGetFuncName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszPutFuncName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszCreateFuncName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszVerifyFuncName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszRemoveFuncName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszIsFunctionNameFmt2`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszGetCapFuncName`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SIP_ADD_NEWPROVIDER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SIP_ADD_NEWPROVIDER`.Companion.`default`() : `SIP_ADD_NEWPROVIDER` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `SIP_CAP_FLAG_SEALING`: UInt = 1u;
public const val `SIP_CAP_SET_CUR_VER`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SIP_CAP_SET_V2` (
    public var `cbSize`: UInt,
    public var `dwVersion`: UInt,
    public var `isMultiSign`: `windows_sys`.`core`.`BOOL`,
    public var `dwReserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SIP_CAP_SET_V3` (
    public var `cbSize`: UInt,
    public var `dwVersion`: UInt,
    public var `isMultiSign`: `windows_sys`.`core`.`BOOL`,
    public var `Anonymous`: `SIP_CAP_SET_V3_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SIP_CAP_SET_V3`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SIP_CAP_SET_V3`.Companion.`default`() : `SIP_CAP_SET_V3` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 98:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SIP_CAP_SET_V3_0 {
//     pub dwFlags: u32,
//     pub dwReserved: u32,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SIP_CAP_SET_V3_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SIP_CAP_SET_V3_0`.Companion.`default`() : `SIP_CAP_SET_V3_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `SIP_CAP_SET_VERSION_2`: UInt = 2u;
public const val `SIP_CAP_SET_VERSION_3`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Catalog")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SIP_DISPATCH_INFO` (
    public var `cbSize`: UInt,
    public var `hSIP`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `pfGet`: `pCryptSIPGetSignedDataMsg`,
    public var `pfPut`: `pCryptSIPPutSignedDataMsg`,
    public var `pfCreate`: `pCryptSIPCreateIndirectData`,
    public var `pfVerify`: `pCryptSIPVerifyIndirectData`,
    public var `pfRemove`: `pCryptSIPRemoveSignedDataMsg`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SIP_DISPATCH_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Catalog")]

    public fun `SIP_DISPATCH_INFO`.Companion.`default`() : `SIP_DISPATCH_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SIP_INDIRECT_DATA` (
    public var `Data`: `super`.`CRYPT_ATTRIBUTE_TYPE_VALUE`,
    public var `DigestAlgorithm`: `super`.`CRYPT_ALGORITHM_IDENTIFIER`,
    public var `Digest`: `super`.`CRYPT_INTEGER_BLOB`,
)
public const val `SIP_MAX_MAGIC_NUMBER`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Catalog")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SIP_SUBJECTINFO` (
    public var `cbSize`: UInt,
    public var `pgSubjectType`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `hFile`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `pwsFileName`: `windows_sys`.`core`.`PCWSTR`,
    public var `pwsDisplayName`: `windows_sys`.`core`.`PCWSTR`,
    public var `dwReserved1`: UInt,
    public var `dwIntVersion`: UInt,
    public var `hProv`: ULong,
    public var `DigestAlgorithm`: `super`.`CRYPT_ALGORITHM_IDENTIFIER`,
    public var `dwFlags`: UInt,
    public var `dwEncodingType`: UInt,
    public var `dwReserved2`: UInt,
    public var `fdwCAPISettings`: UInt,
    public var `fdwSecuritySettings`: UInt,
    public var `dwIndex`: UInt,
    public var `dwUnionChoice`: UInt,
    public var `Anonymous`: `SIP_SUBJECTINFO_0`,
    public var `pClientData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SIP_SUBJECTINFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Catalog")]

    public fun `SIP_SUBJECTINFO`.Companion.`default`() : `SIP_SUBJECTINFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 166:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography_Catalog")]
// #[derive(Clone, Copy)]
// pub union SIP_SUBJECTINFO_0 {
//     pub psFlat: *mut MS_ADDINFO_FLAT,
//     pub psCatMember: *mut super::Catalog::MS_ADDINFO_CATALOGMEMBER,
//     pub psBlob: *mut MS_ADDINFO_BLOB,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SIP_SUBJECTINFO_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Catalog")]

    public fun `SIP_SUBJECTINFO_0`.Companion.`default`() : `SIP_SUBJECTINFO_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `SPC_MARKER_CHECK_CURRENTLY_SUPPORTED_FLAGS`: UInt = 1u;
public const val `SPC_MARKER_CHECK_SKIP_SIP_INDIRECT_DATA_FLAG`: UInt = 1u;
public const val `SPC_RELAXED_PE_MARKER_CHECK`: UInt = 2048u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Catalog")]
public typealias `pCryptSIPCreateIndirectData` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SIP_SUBJECTINFO`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SIP_INDIRECT_DATA`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Catalog")]
public typealias `pCryptSIPGetCaps` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`SIP_SUBJECTINFO`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SIP_CAP_SET_V3`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Catalog")]
public typealias `pCryptSIPGetSealedDigest` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`SIP_SUBJECTINFO`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Catalog")]
public typealias `pCryptSIPGetSignedDataMsg` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SIP_SUBJECTINFO`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Catalog")]
public typealias `pCryptSIPPutSignedDataMsg` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SIP_SUBJECTINFO`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Catalog")]
public typealias `pCryptSIPRemoveSignedDataMsg` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SIP_SUBJECTINFO`>?, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography_Catalog")]
public typealias `pCryptSIPVerifyIndirectData` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SIP_SUBJECTINFO`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SIP_INDIRECT_DATA`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `pfnIsFileSupported` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `pfnIsFileSupportedName` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) -> `windows_sys`.`core`.`BOOL`>>>;
