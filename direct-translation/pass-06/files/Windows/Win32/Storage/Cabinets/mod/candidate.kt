// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cabinet.dll, ABI=C, export=FCIAddFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FCIAddFile`(`hfci` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pszsourcefile` : `windows_sys`.`core`.`PCSTR`, `pszfilename` : `windows_sys`.`core`.`PCSTR`, `fexecute` : `windows_sys`.`core`.`BOOL`, `pfnfcignc` : `PFNFCIGETNEXTCABINET`, `pfnfcis` : `PFNFCISTATUS`, `pfnfcigoi` : `PFNFCIGETOPENINFO`, `typecompress` : UShort) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cabinet.dll, ABI=C, export=FCICreate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FCICreate`(`perf` : /* Rust *const */ kotlinx.cinterop.CPointer<`ERF`>?, `pfnfcifp` : `PFNFCIFILEPLACED`, `pfna` : `PFNFCIALLOC`, `pfnf` : `PFNFCIFREE`, `pfnopen` : `PFNFCIOPEN`, `pfnread` : `PFNFCIREAD`, `pfnwrite` : `PFNFCIWRITE`, `pfnclose` : `PFNFCICLOSE`, `pfnseek` : `PFNFCISEEK`, `pfndelete` : `PFNFCIDELETE`, `pfnfcigtf` : `PFNFCIGETTEMPFILE`, `pccab` : /* Rust *const */ kotlinx.cinterop.CPointer<`CCAB`>?, `pv` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cabinet.dll, ABI=C, export=FCIDestroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FCIDestroy`(`hfci` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cabinet.dll, ABI=C, export=FCIFlushCabinet; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FCIFlushCabinet`(`hfci` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fgetnextcab` : `windows_sys`.`core`.`BOOL`, `pfnfcignc` : `PFNFCIGETNEXTCABINET`, `pfnfcis` : `PFNFCISTATUS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cabinet.dll, ABI=C, export=FCIFlushFolder; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FCIFlushFolder`(`hfci` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pfnfcignc` : `PFNFCIGETNEXTCABINET`, `pfnfcis` : `PFNFCISTATUS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cabinet.dll, ABI=C, export=FDICopy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FDICopy`(`hfdi` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pszcabinet` : `windows_sys`.`core`.`PCSTR`, `pszcabpath` : `windows_sys`.`core`.`PCSTR`, `flags` : Int, `pfnfdin` : `PFNFDINOTIFY`, `pfnfdid` : `PFNFDIDECRYPT`, `pvuser` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cabinet.dll, ABI=C, export=FDICreate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FDICreate`(`pfnalloc` : `PFNALLOC`, `pfnfree` : `PFNFREE`, `pfnopen` : `PFNOPEN`, `pfnread` : `PFNREAD`, `pfnwrite` : `PFNWRITE`, `pfnclose` : `PFNCLOSE`, `pfnseek` : `PFNSEEK`, `cputype` : `FDICREATE_CPU_TYPE`, `perf` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ERF`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cabinet.dll, ABI=C, export=FDIDestroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FDIDestroy`(`hfdi` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cabinet.dll, ABI=C, export=FDIIsCabinet; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FDIIsCabinet`(`hfdi` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `hf` : Long, `pfdici` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FDICABINETINFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cabinet.dll, ABI=C, export=FDITruncateCabinet; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FDITruncateCabinet`(`hfdi` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pszcabinetname` : `windows_sys`.`core`.`PCSTR`, `ifoldertodelete` : UShort) : `windows_sys`.`core`.`BOOL`
public const val `CB_MAX_CABINET_NAME`: UInt = 256u;
public const val `CB_MAX_CAB_PATH`: UInt = 256u;
public const val `CB_MAX_DISK`: Int = 2147483647;
public const val `CB_MAX_DISK_NAME`: UInt = 256u;
public const val `CB_MAX_FILENAME`: UInt = 256u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CCAB` (
    public var `cb`: UInt,
    public var `cbFolderThresh`: UInt,
    public var `cbReserveCFHeader`: UInt,
    public var `cbReserveCFFolder`: UInt,
    public var `cbReserveCFData`: UInt,
    public var `iCab`: Int,
    public var `iDisk`: Int,
    public var `fFailOnIncompressible`: Int,
    public var `setID`: UShort,
    public var `szDisk`: ByteArray,
    public var `szCab`: ByteArray,
    public var `szCabPath`: ByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `CCAB`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `CCAB`.Companion.`default`() : `CCAB` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ERF` (
    public var `erfOper`: Int,
    public var `erfType`: Int,
    public var `fError`: `windows_sys`.`core`.`BOOL`,
)
public typealias `FCIERROR` = Int;
public const val `FCIERR_ALLOC_FAIL`: `FCIERROR` = 3;
public const val `FCIERR_BAD_COMPR_TYPE`: `FCIERROR` = 5;
public const val `FCIERR_CAB_FILE`: `FCIERROR` = 6;
public const val `FCIERR_CAB_FORMAT_LIMIT`: `FCIERROR` = 9;
public const val `FCIERR_MCI_FAIL`: `FCIERROR` = 8;
public const val `FCIERR_NONE`: `FCIERROR` = 0;
public const val `FCIERR_OPEN_SRC`: `FCIERROR` = 1;
public const val `FCIERR_READ_SRC`: `FCIERROR` = 2;
public const val `FCIERR_TEMP_FILE`: `FCIERROR` = 4;
public const val `FCIERR_USER_ABORT`: `FCIERROR` = 7;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FDICABINETINFO` (
    public var `cbCabinet`: Int,
    public var `cFolders`: UShort,
    public var `cFiles`: UShort,
    public var `setID`: UShort,
    public var `iCabinet`: UShort,
    public var `fReserve`: `windows_sys`.`core`.`BOOL`,
    public var `hasprev`: `windows_sys`.`core`.`BOOL`,
    public var `hasnext`: `windows_sys`.`core`.`BOOL`,
)
public typealias `FDICREATE_CPU_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FDIDECRYPT` (
    public var `fdidt`: `FDIDECRYPTTYPE`,
    public var `pvUser`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Anonymous`: `FDIDECRYPT_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FDIDECRYPT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FDIDECRYPT`.Companion.`default`() : `FDIDECRYPT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 80:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FDIDECRYPT_0 {
//     pub cabinet: FDIDECRYPT_0_0,
//     pub folder: FDIDECRYPT_0_1,
//     pub decrypt: FDIDECRYPT_0_2,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FDIDECRYPT_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FDIDECRYPT_0`.Companion.`default`() : `FDIDECRYPT_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FDIDECRYPT_0_0` (
    public var `pHeaderReserve`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `cbHeaderReserve`: UShort,
    public var `setID`: UShort,
    public var `iCabinet`: Int,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FDIDECRYPT_0_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FDIDECRYPT_0_0`.Companion.`default`() : `FDIDECRYPT_0_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FDIDECRYPT_0_2` (
    public var `pDataReserve`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `cbDataReserve`: UShort,
    public var `pbData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `cbData`: UShort,
    public var `fSplit`: `windows_sys`.`core`.`BOOL`,
    public var `cbPartial`: UShort,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FDIDECRYPT_0_2`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FDIDECRYPT_0_2`.Companion.`default`() : `FDIDECRYPT_0_2` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FDIDECRYPT_0_1` (
    public var `pFolderReserve`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `cbFolderReserve`: UShort,
    public var `iFolder`: UShort,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FDIDECRYPT_0_1`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FDIDECRYPT_0_1`.Companion.`default`() : `FDIDECRYPT_0_1` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `FDIDECRYPTTYPE` = Int;
public typealias `FDIERROR` = Int;
public const val `FDIERROR_ALLOC_FAIL`: `FDIERROR` = 5;
public const val `FDIERROR_BAD_COMPR_TYPE`: `FDIERROR` = 6;
public const val `FDIERROR_CABINET_NOT_FOUND`: `FDIERROR` = 1;
public const val `FDIERROR_CORRUPT_CABINET`: `FDIERROR` = 4;
public const val `FDIERROR_EOF`: `FDIERROR` = 12;
public const val `FDIERROR_MDI_FAIL`: `FDIERROR` = 7;
public const val `FDIERROR_NONE`: `FDIERROR` = 0;
public const val `FDIERROR_NOT_A_CABINET`: `FDIERROR` = 2;
public const val `FDIERROR_RESERVE_MISMATCH`: `FDIERROR` = 9;
public const val `FDIERROR_TARGET_FILE`: `FDIERROR` = 8;
public const val `FDIERROR_UNKNOWN_CABINET_VERSION`: `FDIERROR` = 3;
public const val `FDIERROR_USER_ABORT`: `FDIERROR` = 11;
public const val `FDIERROR_WRONG_CABINET`: `FDIERROR` = 10;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FDINOTIFICATION` (
    public var `cb`: Int,
    public var `psz1`: `windows_sys`.`core`.`PSTR`,
    public var `psz2`: `windows_sys`.`core`.`PSTR`,
    public var `psz3`: `windows_sys`.`core`.`PSTR`,
    public var `pv`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `hf`: Long,
    public var `date`: UShort,
    public var `time`: UShort,
    public var `attribs`: UShort,
    public var `setID`: UShort,
    public var `iCabinet`: UShort,
    public var `iFolder`: UShort,
    public var `fdie`: `FDIERROR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FDINOTIFICATION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FDINOTIFICATION`.Companion.`default`() : `FDINOTIFICATION` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `FDINOTIFICATIONTYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FDISPILLFILE` (
    public var `ach`: ByteArray,
    public var `cbFile`: Int,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FDISPILLFILE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]

    public fun `FDISPILLFILE`.Companion.`default`() : `FDISPILLFILE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FDISPILLFILE` (
    public var `ach`: ByteArray,
    public var `cbFile`: Int,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FDISPILLFILE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]

    public fun `FDISPILLFILE`.Companion.`default`() : `FDISPILLFILE` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `INCLUDED_FCI`: UInt = 1u;
public const val `INCLUDED_FDI`: UInt = 1u;
public const val `INCLUDED_TYPES_FCI_FDI`: UInt = 1u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNALLOC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNCLOSE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Long) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNFCIALLOC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNFCICLOSE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Long, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNFCIDELETE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNFCIFILEPLACED` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`CCAB`>?, `windows_sys`.`core`.`PCSTR`, Int, `windows_sys`.`core`.`BOOL`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNFCIFREE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNFCIGETNEXTCABINET` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`CCAB`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNFCIGETOPENINFO` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Long>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNFCIGETTEMPFILE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PSTR`, Int, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNFCIOPEN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, Int, Int, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Long>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNFCIREAD` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Long, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNFCISEEK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Long, Int, Int, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNFCISTATUS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNFCIWRITE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Long, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNFDIDECRYPT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`FDIDECRYPT`>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNFDINOTIFY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`FDINOTIFICATIONTYPE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`FDINOTIFICATION`>?) -> Long>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNFREE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNOPEN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, Int, Int) -> Long>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNREAD` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Long, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNSEEK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Long, Int, Int) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNWRITE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Long, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> UInt>>>;
public const val `_A_EXEC`: UInt = 64u;
public const val `_A_NAME_IS_UTF`: UInt = 128u;
public const val `cpu80286`: `FDICREATE_CPU_TYPE` = 0;
public const val `cpu80386`: `FDICREATE_CPU_TYPE` = 1;
public const val `cpuUNKNOWN`: `FDICREATE_CPU_TYPE` = -1;
public const val `fdidtDECRYPT`: `FDIDECRYPTTYPE` = 2;
public const val `fdidtNEW_CABINET`: `FDIDECRYPTTYPE` = 0;
public const val `fdidtNEW_FOLDER`: `FDIDECRYPTTYPE` = 1;
public const val `fdintCABINET_INFO`: `FDINOTIFICATIONTYPE` = 0;
public const val `fdintCLOSE_FILE_INFO`: `FDINOTIFICATIONTYPE` = 3;
public const val `fdintCOPY_FILE`: `FDINOTIFICATIONTYPE` = 2;
public const val `fdintENUMERATE`: `FDINOTIFICATIONTYPE` = 5;
public const val `fdintNEXT_CABINET`: `FDINOTIFICATIONTYPE` = 4;
public const val `fdintPARTIAL_FILE`: `FDINOTIFICATIONTYPE` = 1;
public const val `statusCabinet`: UInt = 2u;
public const val `statusFile`: UInt = 0u;
public const val `statusFolder`: UInt = 1u;
public const val `tcompBAD`: UInt = 15u;
public const val `tcompLZX_WINDOW_HI`: UInt = 5376u;
public const val `tcompLZX_WINDOW_LO`: UInt = 3840u;
public const val `tcompMASK_LZX_WINDOW`: UInt = 7936u;
public const val `tcompMASK_QUANTUM_LEVEL`: UInt = 240u;
public const val `tcompMASK_QUANTUM_MEM`: UInt = 7936u;
public const val `tcompMASK_RESERVED`: UInt = 57344u;
public const val `tcompMASK_TYPE`: UInt = 15u;
public const val `tcompQUANTUM_LEVEL_HI`: UInt = 112u;
public const val `tcompQUANTUM_LEVEL_LO`: UInt = 16u;
public const val `tcompQUANTUM_MEM_HI`: UInt = 5376u;
public const val `tcompQUANTUM_MEM_LO`: UInt = 2560u;
public const val `tcompSHIFT_LZX_WINDOW`: UInt = 8u;
public const val `tcompSHIFT_QUANTUM_LEVEL`: UInt = 4u;
public const val `tcompSHIFT_QUANTUM_MEM`: UInt = 8u;
public const val `tcompTYPE_LZX`: UInt = 3u;
public const val `tcompTYPE_MSZIP`: UInt = 1u;
public const val `tcompTYPE_NONE`: UInt = 0u;
public const val `tcompTYPE_QUANTUM`: UInt = 2u;
