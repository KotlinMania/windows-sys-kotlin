// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetDfsAdd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetDfsAdd`(`dfsentrypath` : `windows_sys`.`core`.`PCWSTR`, `servername` : `windows_sys`.`core`.`PCWSTR`, `sharename` : `windows_sys`.`core`.`PCWSTR`, `comment` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetDfsAddFtRoot; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetDfsAddFtRoot`(`servername` : `windows_sys`.`core`.`PCWSTR`, `rootshare` : `windows_sys`.`core`.`PCWSTR`, `ftdfsname` : `windows_sys`.`core`.`PCWSTR`, `comment` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetDfsAddRootTarget; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetDfsAddRootTarget`(`pdfspath` : `windows_sys`.`core`.`PCWSTR`, `ptargetpath` : `windows_sys`.`core`.`PCWSTR`, `majorversion` : UInt, `pcomment` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetDfsAddStdRoot; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetDfsAddStdRoot`(`servername` : `windows_sys`.`core`.`PCWSTR`, `rootshare` : `windows_sys`.`core`.`PCWSTR`, `comment` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetDfsEnum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetDfsEnum`(`dfsname` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `prefmaxlen` : UInt, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `entriesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `resumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetDfsGetClientInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetDfsGetClientInfo`(`dfsentrypath` : `windows_sys`.`core`.`PCWSTR`, `servername` : `windows_sys`.`core`.`PCWSTR`, `sharename` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetDfsGetFtContainerSecurity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `NetDfsGetFtContainerSecurity`(`domainname` : `windows_sys`.`core`.`PCWSTR`, `securityinformation` : UInt, `ppsecuritydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`>?, `lpcbsecuritydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetDfsGetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetDfsGetInfo`(`dfsentrypath` : `windows_sys`.`core`.`PCWSTR`, `servername` : `windows_sys`.`core`.`PCWSTR`, `sharename` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetDfsGetSecurity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `NetDfsGetSecurity`(`dfsentrypath` : `windows_sys`.`core`.`PCWSTR`, `securityinformation` : UInt, `ppsecuritydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`>?, `lpcbsecuritydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetDfsGetStdContainerSecurity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `NetDfsGetStdContainerSecurity`(`machinename` : `windows_sys`.`core`.`PCWSTR`, `securityinformation` : UInt, `ppsecuritydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`>?, `lpcbsecuritydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetDfsGetSupportedNamespaceVersion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetDfsGetSupportedNamespaceVersion`(`origin` : `DFS_NAMESPACE_VERSION_ORIGIN`, `pname` : `windows_sys`.`core`.`PCWSTR`, `ppversioninfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DFS_SUPPORTED_NAMESPACE_VERSION_INFO`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetDfsMove; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetDfsMove`(`olddfsentrypath` : `windows_sys`.`core`.`PCWSTR`, `newdfsentrypath` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetDfsRemove; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetDfsRemove`(`dfsentrypath` : `windows_sys`.`core`.`PCWSTR`, `servername` : `windows_sys`.`core`.`PCWSTR`, `sharename` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetDfsRemoveFtRoot; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetDfsRemoveFtRoot`(`servername` : `windows_sys`.`core`.`PCWSTR`, `rootshare` : `windows_sys`.`core`.`PCWSTR`, `ftdfsname` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetDfsRemoveFtRootForced; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetDfsRemoveFtRootForced`(`domainname` : `windows_sys`.`core`.`PCWSTR`, `servername` : `windows_sys`.`core`.`PCWSTR`, `rootshare` : `windows_sys`.`core`.`PCWSTR`, `ftdfsname` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetDfsRemoveRootTarget; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetDfsRemoveRootTarget`(`pdfspath` : `windows_sys`.`core`.`PCWSTR`, `ptargetpath` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetDfsRemoveStdRoot; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetDfsRemoveStdRoot`(`servername` : `windows_sys`.`core`.`PCWSTR`, `rootshare` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetDfsSetClientInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetDfsSetClientInfo`(`dfsentrypath` : `windows_sys`.`core`.`PCWSTR`, `servername` : `windows_sys`.`core`.`PCWSTR`, `sharename` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetDfsSetFtContainerSecurity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `NetDfsSetFtContainerSecurity`(`domainname` : `windows_sys`.`core`.`PCWSTR`, `securityinformation` : UInt, `psecuritydescriptor` : `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetDfsSetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetDfsSetInfo`(`dfsentrypath` : `windows_sys`.`core`.`PCWSTR`, `servername` : `windows_sys`.`core`.`PCWSTR`, `sharename` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetDfsSetSecurity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `NetDfsSetSecurity`(`dfsentrypath` : `windows_sys`.`core`.`PCWSTR`, `securityinformation` : UInt, `psecuritydescriptor` : `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetDfsSetStdContainerSecurity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `NetDfsSetStdContainerSecurity`(`machinename` : `windows_sys`.`core`.`PCWSTR`, `securityinformation` : UInt, `psecuritydescriptor` : `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`) : UInt
public const val `DFS_ADD_VOLUME`: UInt = 1u;
public const val `DFS_FORCE_REMOVE`: UInt = 2147483648u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DFS_GET_PKT_ENTRY_STATE_ARG` (
    public var `DfsEntryPathLen`: UShort,
    public var `ServerNameLen`: UShort,
    public var `ShareNameLen`: UShort,
    public var `Level`: UInt,
    public var `Buffer`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DFS_GET_PKT_ENTRY_STATE_ARG`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DFS_GET_PKT_ENTRY_STATE_ARG`.Companion.`default`() : `DFS_GET_PKT_ENTRY_STATE_ARG` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DFS_INFO_1` (
    public var `EntryPath`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DFS_INFO_1`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DFS_INFO_1`.Companion.`default`() : `DFS_INFO_1` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DFS_INFO_100` (
    public var `Comment`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DFS_INFO_100`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DFS_INFO_100`.Companion.`default`() : `DFS_INFO_100` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DFS_INFO_101` (
    public var `State`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DFS_INFO_102` (
    public var `Timeout`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DFS_INFO_103` (
    public var `PropertyFlagMask`: UInt,
    public var `PropertyFlags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DFS_INFO_104` (
    public var `TargetPriority`: `DFS_TARGET_PRIORITY`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DFS_INFO_105` (
    public var `Comment`: `windows_sys`.`core`.`PWSTR`,
    public var `State`: UInt,
    public var `Timeout`: UInt,
    public var `PropertyFlagMask`: UInt,
    public var `PropertyFlags`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DFS_INFO_105`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DFS_INFO_105`.Companion.`default`() : `DFS_INFO_105` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DFS_INFO_106` (
    public var `State`: UInt,
    public var `TargetPriority`: `DFS_TARGET_PRIORITY`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DFS_INFO_107` (
    public var `Comment`: `windows_sys`.`core`.`PWSTR`,
    public var `State`: UInt,
    public var `Timeout`: UInt,
    public var `PropertyFlagMask`: UInt,
    public var `PropertyFlags`: UInt,
    public var `SdLengthReserved`: UInt,
    public var `pSecurityDescriptor`: `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DFS_INFO_107`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]

    public fun `DFS_INFO_107`.Companion.`default`() : `DFS_INFO_107` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DFS_INFO_150` (
    public var `SdLengthReserved`: UInt,
    public var `pSecurityDescriptor`: `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DFS_INFO_150`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]

    public fun `DFS_INFO_150`.Companion.`default`() : `DFS_INFO_150` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DFS_INFO_1_32` (
    public var `EntryPath`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DFS_INFO_2` (
    public var `EntryPath`: `windows_sys`.`core`.`PWSTR`,
    public var `Comment`: `windows_sys`.`core`.`PWSTR`,
    public var `State`: UInt,
    public var `NumberOfStorages`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DFS_INFO_2`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DFS_INFO_2`.Companion.`default`() : `DFS_INFO_2` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DFS_INFO_200` (
    public var `FtDfsName`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DFS_INFO_200`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DFS_INFO_200`.Companion.`default`() : `DFS_INFO_200` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DFS_INFO_2_32` (
    public var `EntryPath`: UInt,
    public var `Comment`: UInt,
    public var `State`: UInt,
    public var `NumberOfStorages`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DFS_INFO_3` (
    public var `EntryPath`: `windows_sys`.`core`.`PWSTR`,
    public var `Comment`: `windows_sys`.`core`.`PWSTR`,
    public var `State`: UInt,
    public var `NumberOfStorages`: UInt,
    public var `Storage`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DFS_STORAGE_INFO`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DFS_INFO_3`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DFS_INFO_3`.Companion.`default`() : `DFS_INFO_3` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DFS_INFO_300` (
    public var `Flags`: UInt,
    public var `DfsName`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DFS_INFO_300`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DFS_INFO_300`.Companion.`default`() : `DFS_INFO_300` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DFS_INFO_3_32` (
    public var `EntryPath`: UInt,
    public var `Comment`: UInt,
    public var `State`: UInt,
    public var `NumberOfStorages`: UInt,
    public var `Storage`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DFS_INFO_4` (
    public var `EntryPath`: `windows_sys`.`core`.`PWSTR`,
    public var `Comment`: `windows_sys`.`core`.`PWSTR`,
    public var `State`: UInt,
    public var `Timeout`: UInt,
    public var `Guid`: `windows_sys`.`core`.`GUID`,
    public var `NumberOfStorages`: UInt,
    public var `Storage`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DFS_STORAGE_INFO`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DFS_INFO_4`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DFS_INFO_4`.Companion.`default`() : `DFS_INFO_4` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DFS_INFO_4_32` (
    public var `EntryPath`: UInt,
    public var `Comment`: UInt,
    public var `State`: UInt,
    public var `Timeout`: UInt,
    public var `Guid`: `windows_sys`.`core`.`GUID`,
    public var `NumberOfStorages`: UInt,
    public var `Storage`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DFS_INFO_5` (
    public var `EntryPath`: `windows_sys`.`core`.`PWSTR`,
    public var `Comment`: `windows_sys`.`core`.`PWSTR`,
    public var `State`: UInt,
    public var `Timeout`: UInt,
    public var `Guid`: `windows_sys`.`core`.`GUID`,
    public var `PropertyFlags`: UInt,
    public var `MetadataSize`: UInt,
    public var `NumberOfStorages`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DFS_INFO_5`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DFS_INFO_5`.Companion.`default`() : `DFS_INFO_5` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DFS_INFO_50` (
    public var `NamespaceMajorVersion`: UInt,
    public var `NamespaceMinorVersion`: UInt,
    public var `NamespaceCapabilities`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DFS_INFO_6` (
    public var `EntryPath`: `windows_sys`.`core`.`PWSTR`,
    public var `Comment`: `windows_sys`.`core`.`PWSTR`,
    public var `State`: UInt,
    public var `Timeout`: UInt,
    public var `Guid`: `windows_sys`.`core`.`GUID`,
    public var `PropertyFlags`: UInt,
    public var `MetadataSize`: UInt,
    public var `NumberOfStorages`: UInt,
    public var `Storage`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DFS_STORAGE_INFO_1`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DFS_INFO_6`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DFS_INFO_6`.Companion.`default`() : `DFS_INFO_6` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DFS_INFO_7` (
    public var `GenerationGuid`: `windows_sys`.`core`.`GUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DFS_INFO_8` (
    public var `EntryPath`: `windows_sys`.`core`.`PWSTR`,
    public var `Comment`: `windows_sys`.`core`.`PWSTR`,
    public var `State`: UInt,
    public var `Timeout`: UInt,
    public var `Guid`: `windows_sys`.`core`.`GUID`,
    public var `PropertyFlags`: UInt,
    public var `MetadataSize`: UInt,
    public var `SdLengthReserved`: UInt,
    public var `pSecurityDescriptor`: `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`,
    public var `NumberOfStorages`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DFS_INFO_8`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]

    public fun `DFS_INFO_8`.Companion.`default`() : `DFS_INFO_8` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DFS_INFO_9` (
    public var `EntryPath`: `windows_sys`.`core`.`PWSTR`,
    public var `Comment`: `windows_sys`.`core`.`PWSTR`,
    public var `State`: UInt,
    public var `Timeout`: UInt,
    public var `Guid`: `windows_sys`.`core`.`GUID`,
    public var `PropertyFlags`: UInt,
    public var `MetadataSize`: UInt,
    public var `SdLengthReserved`: UInt,
    public var `pSecurityDescriptor`: `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`,
    public var `NumberOfStorages`: UInt,
    public var `Storage`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DFS_STORAGE_INFO_1`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DFS_INFO_9`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]

    public fun `DFS_INFO_9`.Companion.`default`() : `DFS_INFO_9` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `DFS_MOVE_FLAG_REPLACE_IF_EXISTS`: UInt = 1u;
public typealias `DFS_NAMESPACE_VERSION_ORIGIN` = Int;
public const val `DFS_NAMESPACE_VERSION_ORIGIN_COMBINED`: `DFS_NAMESPACE_VERSION_ORIGIN` = 0;
public const val `DFS_NAMESPACE_VERSION_ORIGIN_DOMAIN`: `DFS_NAMESPACE_VERSION_ORIGIN` = 2;
public const val `DFS_NAMESPACE_VERSION_ORIGIN_SERVER`: `DFS_NAMESPACE_VERSION_ORIGIN` = 1;
public const val `DFS_PROPERTY_FLAG_ABDE`: UInt = 32u;
public const val `DFS_PROPERTY_FLAG_CLUSTER_ENABLED`: UInt = 16u;
public const val `DFS_PROPERTY_FLAG_INSITE_REFERRALS`: UInt = 1u;
public const val `DFS_PROPERTY_FLAG_ROOT_SCALABILITY`: UInt = 2u;
public const val `DFS_PROPERTY_FLAG_SITE_COSTING`: UInt = 4u;
public const val `DFS_PROPERTY_FLAG_TARGET_FAILBACK`: UInt = 8u;
public const val `DFS_RESTORE_VOLUME`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DFS_SITELIST_INFO` (
    public var `cSites`: UInt,
    public var `Site`: Array<`DFS_SITENAME_INFO`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DFS_SITELIST_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DFS_SITELIST_INFO`.Companion.`default`() : `DFS_SITELIST_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DFS_SITENAME_INFO` (
    public var `SiteFlags`: UInt,
    public var `SiteName`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DFS_SITENAME_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DFS_SITENAME_INFO`.Companion.`default`() : `DFS_SITENAME_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `DFS_SITE_PRIMARY`: UInt = 1u;
public const val `DFS_STORAGE_FLAVOR_UNUSED2`: UInt = 768u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DFS_STORAGE_INFO` (
    public var `State`: UInt,
    public var `ServerName`: `windows_sys`.`core`.`PWSTR`,
    public var `ShareName`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DFS_STORAGE_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DFS_STORAGE_INFO`.Companion.`default`() : `DFS_STORAGE_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DFS_STORAGE_INFO_0_32` (
    public var `State`: UInt,
    public var `ServerName`: UInt,
    public var `ShareName`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DFS_STORAGE_INFO_1` (
    public var `State`: UInt,
    public var `ServerName`: `windows_sys`.`core`.`PWSTR`,
    public var `ShareName`: `windows_sys`.`core`.`PWSTR`,
    public var `TargetPriority`: `DFS_TARGET_PRIORITY`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DFS_STORAGE_INFO_1`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DFS_STORAGE_INFO_1`.Companion.`default`() : `DFS_STORAGE_INFO_1` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `DFS_STORAGE_STATES`: UInt = 15u;
public const val `DFS_STORAGE_STATE_ACTIVE`: UInt = 4u;
public const val `DFS_STORAGE_STATE_OFFLINE`: UInt = 1u;
public const val `DFS_STORAGE_STATE_ONLINE`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DFS_SUPPORTED_NAMESPACE_VERSION_INFO` (
    public var `DomainDfsMajorVersion`: UInt,
    public var `DomainDfsMinorVersion`: UInt,
    public var `DomainDfsCapabilities`: ULong,
    public var `StandaloneDfsMajorVersion`: UInt,
    public var `StandaloneDfsMinorVersion`: UInt,
    public var `StandaloneDfsCapabilities`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DFS_TARGET_PRIORITY` (
    public var `TargetPriorityClass`: `DFS_TARGET_PRIORITY_CLASS`,
    public var `TargetPriorityRank`: UShort,
    public var `Reserved`: UShort,
)
public typealias `DFS_TARGET_PRIORITY_CLASS` = Int;
public const val `DFS_VOLUME_FLAVORS`: UInt = 768u;
public const val `DFS_VOLUME_FLAVOR_AD_BLOB`: UInt = 512u;
public const val `DFS_VOLUME_FLAVOR_STANDALONE`: UInt = 256u;
public const val `DFS_VOLUME_FLAVOR_UNUSED1`: UInt = 0u;
public const val `DFS_VOLUME_STATES`: UInt = 15u;
public const val `DFS_VOLUME_STATE_FORCE_SYNC`: UInt = 64u;
public const val `DFS_VOLUME_STATE_INCONSISTENT`: UInt = 2u;
public const val `DFS_VOLUME_STATE_OFFLINE`: UInt = 3u;
public const val `DFS_VOLUME_STATE_OK`: UInt = 1u;
public const val `DFS_VOLUME_STATE_ONLINE`: UInt = 4u;
public const val `DFS_VOLUME_STATE_RESYNCHRONIZE`: UInt = 16u;
public const val `DFS_VOLUME_STATE_STANDBY`: UInt = 32u;
public const val `DfsGlobalHighPriorityClass`: `DFS_TARGET_PRIORITY_CLASS` = 1;
public const val `DfsGlobalLowPriorityClass`: `DFS_TARGET_PRIORITY_CLASS` = 4;
public const val `DfsInvalidPriorityClass`: `DFS_TARGET_PRIORITY_CLASS` = -1;
public const val `DfsSiteCostHighPriorityClass`: `DFS_TARGET_PRIORITY_CLASS` = 2;
public const val `DfsSiteCostLowPriorityClass`: `DFS_TARGET_PRIORITY_CLASS` = 3;
public const val `DfsSiteCostNormalPriorityClass`: `DFS_TARGET_PRIORITY_CLASS` = 0;
public const val `FSCTL_DFS_BASE`: UInt = 6u;
public const val `FSCTL_DFS_GET_PKT_ENTRY_STATE`: UInt = 401340u;
public const val `NET_DFS_SETDC_FLAGS`: UInt = 0u;
public const val `NET_DFS_SETDC_INITPKT`: UInt = 2u;
public const val `NET_DFS_SETDC_TIMEOUT`: UInt = 1u;
