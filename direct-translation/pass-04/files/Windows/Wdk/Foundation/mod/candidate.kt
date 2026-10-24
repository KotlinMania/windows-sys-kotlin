// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NtClose`(`handle` : `super`.`super`.`Win32`.`Foundation`.`HANDLE`) : `super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtQueryObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NtQueryObject`(`handle` : `super`.`super`.`Win32`.`Foundation`.`HANDLE`, `objectinformationclass` : `OBJECT_INFORMATION_CLASS`, `objectinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `objectinformationlength` : UInt, `returnlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_System_SystemServices", feature = "Win32_Security"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACCESS_STATE` (
    public var `OperationID`: `super`.`super`.`Win32`.`Foundation`.`LUID`,
    public var `SecurityEvaluated`: Boolean,
    public var `GenerateAudit`: Boolean,
    public var `GenerateOnClose`: Boolean,
    public var `PrivilegesAllocated`: Boolean,
    public var `Flags`: UInt,
    public var `RemainingDesiredAccess`: UInt,
    public var `PreviouslyGrantedAccess`: UInt,
    public var `OriginalDesiredAccess`: UInt,
    public var `SubjectSecurityContext`: `SECURITY_SUBJECT_CONTEXT`,
    public var `SecurityDescriptor`: `super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`,
    public var `AuxData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Privileges`: `ACCESS_STATE_0`,
    public var `AuditPrivileges`: Boolean,
    public var `ObjectName`: `super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`,
    public var `ObjectTypeName`: `super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`,
)
// UNSUPPORTED Rust 24:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_System_SystemServices", feature = "Win32_Security"))]
// impl Default for ACCESS_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 30:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Wdk_System_SystemServices", feature = "Win32_Security"))]
// #[derive(Clone, Copy)]
// pub union ACCESS_STATE_0 {
//     pub InitialPrivilegeSet: super::System::SystemServices::INITIAL_PRIVILEGE_SET,
//     pub PrivilegeSet: super::super::Win32::Security::PRIVILEGE_SET,
// }

// UNSUPPORTED Rust 37:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_System_SystemServices", feature = "Win32_Security"))]
// impl Default for ACCESS_STATE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICE_OBJECT` (
    public var `Type`: Short,
    public var `Size`: UShort,
    public var `ReferenceCount`: Int,
    public var `DriverObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DRIVER_OBJECT`>?,
    public var `NextDevice`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?,
    public var `AttachedDevice`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?,
    public var `CurrentIrp`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IRP`>?,
    public var `Timer`: `PIO_TIMER`,
    public var `Flags`: UInt,
    public var `Characteristics`: UInt,
    public var `Vpb`: /* Rust *mut */ kotlinx.cinterop.CPointer<`VPB`>?,
    public var `DeviceExtension`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `DeviceType`: UInt,
    public var `StackSize`: Byte,
    public var `Queue`: `DEVICE_OBJECT_0`,
    public var `AlignmentRequirement`: UInt,
    public var `DeviceQueue`: `KDEVICE_QUEUE`,
    public var `Dpc`: `KDPC`,
    public var `ActiveThreadCount`: UInt,
    public var `SecurityDescriptor`: `super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`,
    public var `DeviceLock`: `KEVENT`,
    public var `SectorSize`: UShort,
    public var `Spare1`: UShort,
    public var `DeviceObjectExtension`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DEVOBJ_EXTENSION`>?,
    public var `Reserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 73:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for DEVICE_OBJECT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 79:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub union DEVICE_OBJECT_0 {
//     pub ListEntry: super::super::Win32::System::Kernel::LIST_ENTRY,
//     pub Wcb: super::System::SystemServices::WAIT_CONTEXT_BLOCK,
// }

// UNSUPPORTED Rust 86:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for DEVICE_OBJECT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVOBJ_EXTENSION` (
    public var `Type`: Short,
    public var `Size`: UShort,
    public var `DeviceObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?,
    public var `PowerFlags`: UInt,
    public var `Dope`: /* Rust *mut */ kotlinx.cinterop.CPointer<`_DEVICE_OBJECT_POWER_EXTENSION`>?,
    public var `ExtensionFlags`: UInt,
    public var `DeviceNode`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `AttachedTo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?,
    public var `StartIoCount`: Int,
    public var `StartIoKey`: Int,
    public var `StartIoFlags`: UInt,
    public var `Vpb`: /* Rust *mut */ kotlinx.cinterop.CPointer<`VPB`>?,
    public var `DependencyNode`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `InterruptContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `InterruptCount`: Int,
    public var `VerifierContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 113:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for DEVOBJ_EXTENSION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISPATCHER_HEADER` (
    public var `Anonymous`: `DISPATCHER_HEADER_0`,
    public var `SignalState`: Int,
    public var `WaitListHead`: `super`.`super`.`Win32`.`System`.`Kernel`.`LIST_ENTRY`,
)
// UNSUPPORTED Rust 127:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for DISPATCHER_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 133:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub union DISPATCHER_HEADER_0 {
//     pub Anonymous1: DISPATCHER_HEADER_0_0,
//     pub Anonymous2: DISPATCHER_HEADER_0_1,
//     pub Anonymous3: DISPATCHER_HEADER_0_2,
//     pub Anonymous4: DISPATCHER_HEADER_0_3,
//     pub Anonymous5: DISPATCHER_HEADER_0_4,
//     pub Anonymous6: DISPATCHER_HEADER_0_5,
//     pub Anonymous7: DISPATCHER_HEADER_0_6,
// }

// UNSUPPORTED Rust 145:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for DISPATCHER_HEADER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 151:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub union DISPATCHER_HEADER_0_0 {
//     pub Lock: i32,
//     pub LockNV: i32,
// }

// UNSUPPORTED Rust 158:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for DISPATCHER_HEADER_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISPATCHER_HEADER_0_1` (
    public var `Type`: UByte,
    public var `Signalling`: UByte,
    public var `Size`: UByte,
    public var `Reserved1`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISPATCHER_HEADER_0_2` (
    public var `TimerType`: UByte,
    public var `Anonymous1`: `DISPATCHER_HEADER_0_2_0`,
    public var `Hand`: UByte,
    public var `Anonymous2`: `DISPATCHER_HEADER_0_2_1`,
)
// UNSUPPORTED Rust 182:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for DISPATCHER_HEADER_0_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 188:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub union DISPATCHER_HEADER_0_2_0 {
//     pub TimerControlFlags: u8,
//     pub Anonymous: DISPATCHER_HEADER_0_2_0_0,
// }

// UNSUPPORTED Rust 195:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for DISPATCHER_HEADER_0_2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISPATCHER_HEADER_0_2_0_0` (
    public var `_bitfield`: UByte,
)
// UNSUPPORTED Rust 207:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub union DISPATCHER_HEADER_0_2_1 {
//     pub TimerMiscFlags: u8,
//     pub Anonymous: DISPATCHER_HEADER_0_2_1_0,
// }

// UNSUPPORTED Rust 214:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for DISPATCHER_HEADER_0_2_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISPATCHER_HEADER_0_2_1_0` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISPATCHER_HEADER_0_3` (
    public var `Timer2Type`: UByte,
    public var `Anonymous`: `DISPATCHER_HEADER_0_3_0`,
    public var `Timer2ComponentId`: UByte,
    public var `Timer2RelativeId`: UByte,
)
// UNSUPPORTED Rust 235:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for DISPATCHER_HEADER_0_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 241:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub union DISPATCHER_HEADER_0_3_0 {
//     pub Timer2Flags: u8,
//     pub Anonymous: DISPATCHER_HEADER_0_3_0_0,
// }

// UNSUPPORTED Rust 248:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for DISPATCHER_HEADER_0_3_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISPATCHER_HEADER_0_3_0_0` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISPATCHER_HEADER_0_4` (
    public var `QueueType`: UByte,
    public var `Anonymous`: `DISPATCHER_HEADER_0_4_0`,
    public var `QueueSize`: UByte,
    public var `QueueReserved`: UByte,
)
// UNSUPPORTED Rust 269:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for DISPATCHER_HEADER_0_4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 275:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub union DISPATCHER_HEADER_0_4_0 {
//     pub QueueControlFlags: u8,
//     pub Anonymous: DISPATCHER_HEADER_0_4_0_0,
// }

// UNSUPPORTED Rust 282:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for DISPATCHER_HEADER_0_4_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISPATCHER_HEADER_0_4_0_0` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISPATCHER_HEADER_0_5` (
    public var `ThreadType`: UByte,
    public var `ThreadReserved`: UByte,
    public var `Anonymous1`: `DISPATCHER_HEADER_0_5_0`,
    public var `Anonymous2`: `DISPATCHER_HEADER_0_5_1`,
)
// UNSUPPORTED Rust 303:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for DISPATCHER_HEADER_0_5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 309:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub union DISPATCHER_HEADER_0_5_0 {
//     pub ThreadControlFlags: u8,
//     pub Anonymous: DISPATCHER_HEADER_0_5_0_0,
// }

// UNSUPPORTED Rust 316:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for DISPATCHER_HEADER_0_5_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISPATCHER_HEADER_0_5_0_0` (
    public var `_bitfield`: UByte,
)
// UNSUPPORTED Rust 328:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub union DISPATCHER_HEADER_0_5_1 {
//     pub DebugActive: u8,
// }

// UNSUPPORTED Rust 334:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for DISPATCHER_HEADER_0_5_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISPATCHER_HEADER_0_6` (
    public var `MutantType`: UByte,
    public var `MutantSize`: UByte,
    public var `DpcActive`: Boolean,
    public var `MutantReserved`: UByte,
)
public typealias `DMA_COMMON_BUFFER_VECTOR` = Long;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `DRIVER_ADD_DEVICE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`DRIVER_OBJECT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?) -> `super`.`super`.`Win32`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `DRIVER_CANCEL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`IRP`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `DRIVER_CONTROL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`IRP`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `super`.`System`.`SystemServices`.`IO_ALLOCATION_ACTION`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `DRIVER_DISPATCH` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`IRP`>?) -> `super`.`super`.`Win32`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `DRIVER_DISPATCH_PAGED` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`IRP`>?) -> `super`.`super`.`Win32`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRIVER_EXTENSION` (
    public var `DriverObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DRIVER_OBJECT`>?,
    public var `AddDevice`: `DRIVER_ADD_DEVICE`,
    public var `Count`: UInt,
    public var `ServiceKeyName`: `super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`,
)
// UNSUPPORTED Rust 369:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for DRIVER_EXTENSION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `DRIVER_FS_NOTIFICATION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?, Boolean) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `DRIVER_INITIALIZE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`DRIVER_OBJECT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?) -> `super`.`super`.`Win32`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DRIVER_NOTIFICATION_CALLBACK_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `super`.`super`.`Win32`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 28 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRIVER_OBJECT` (
    public var `Type`: Short,
    public var `Size`: Short,
    public var `DeviceObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?,
    public var `Flags`: UInt,
    public var `DriverStart`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `DriverSize`: UInt,
    public var `DriverSection`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `DriverExtension`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DRIVER_EXTENSION`>?,
    public var `DriverName`: `super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`,
    public var `HardwareDatabase`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?,
    public var `FastIoDispatch`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FAST_IO_DISPATCH`>?,
    public var `DriverInit`: `DRIVER_INITIALIZE`,
    public var `DriverStartIo`: `DRIVER_STARTIO`,
    public var `DriverUnload`: `DRIVER_UNLOAD`,
    public var `MajorFunction`: Array<`DRIVER_DISPATCH`>,
)
// UNSUPPORTED Rust 400:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for DRIVER_OBJECT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `DRIVER_REINITIALIZE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`DRIVER_OBJECT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `DRIVER_STARTIO` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`IRP`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `DRIVER_UNLOAD` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`DRIVER_OBJECT`>?) -> Unit>>>;
public const val `DontUseThisType`: `POOL_TYPE` = 3;
public const val `DontUseThisTypeSession`: `POOL_TYPE` = 35;
public typealias `ECP_HEADER` = Long;
public typealias `ECP_LIST` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ERESOURCE` (
    public var `SystemResourcesList`: `super`.`super`.`Win32`.`System`.`Kernel`.`LIST_ENTRY`,
    public var `OwnerTable`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OWNER_ENTRY`>?,
    public var `ActiveCount`: Short,
    public var `Anonymous1`: `ERESOURCE_0`,
    public var `SharedWaiters`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ExclusiveWaiters`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `OwnerEntry`: `OWNER_ENTRY`,
    public var `ActiveEntries`: UInt,
    public var `ContentionCount`: UInt,
    public var `NumberOfSharedWaiters`: UInt,
    public var `NumberOfExclusiveWaiters`: UInt,
    public var `Anonymous2`: `ERESOURCE_1`,
    public var `SpinLock`: ULong,
)
// UNSUPPORTED Rust 434:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for ERESOURCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 440:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub union ERESOURCE_0 {
//     pub Flag: u16,
//     pub Anonymous: ERESOURCE_0_0,
// }

// UNSUPPORTED Rust 447:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for ERESOURCE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ERESOURCE_0_0` (
    public var `ReservedLowFlags`: UByte,
    public var `WaiterPriority`: UByte,
)
// UNSUPPORTED Rust 460:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub union ERESOURCE_1 {
//     pub Address: *mut core::ffi::c_void,
//     pub CreatorBackTraceIndex: usize,
// }

// UNSUPPORTED Rust 467:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for ERESOURCE_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `FAST_IO_ACQUIRE_FILE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FILE_OBJECT`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `FAST_IO_ACQUIRE_FOR_CCFLUSH` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FILE_OBJECT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?) -> `super`.`super`.`Win32`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `FAST_IO_ACQUIRE_FOR_MOD_WRITE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FILE_OBJECT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`ERESOURCE`>>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?) -> `super`.`super`.`Win32`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `FAST_IO_CHECK_IF_POSSIBLE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FILE_OBJECT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, UInt, Boolean, UInt, Boolean, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Win32`.`System`.`IO`.`IO_STATUS_BLOCK`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?) -> Boolean>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `FAST_IO_DETACH_DEVICE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `FAST_IO_DEVICE_CONTROL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FILE_OBJECT`>?, Boolean, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Win32`.`System`.`IO`.`IO_STATUS_BLOCK`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?) -> Boolean>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FAST_IO_DISPATCH` (
    public var `SizeOfFastIoDispatch`: UInt,
    public var `FastIoCheckIfPossible`: `FAST_IO_CHECK_IF_POSSIBLE`,
    public var `FastIoRead`: `FAST_IO_READ`,
    public var `FastIoWrite`: `FAST_IO_WRITE`,
    public var `FastIoQueryBasicInfo`: `FAST_IO_QUERY_BASIC_INFO`,
    public var `FastIoQueryStandardInfo`: `FAST_IO_QUERY_STANDARD_INFO`,
    public var `FastIoLock`: `FAST_IO_LOCK`,
    public var `FastIoUnlockSingle`: `FAST_IO_UNLOCK_SINGLE`,
    public var `FastIoUnlockAll`: `FAST_IO_UNLOCK_ALL`,
    public var `FastIoUnlockAllByKey`: `FAST_IO_UNLOCK_ALL_BY_KEY`,
    public var `FastIoDeviceControl`: `FAST_IO_DEVICE_CONTROL`,
    public var `AcquireFileForNtCreateSection`: `FAST_IO_ACQUIRE_FILE`,
    public var `ReleaseFileForNtCreateSection`: `FAST_IO_RELEASE_FILE`,
    public var `FastIoDetachDevice`: `FAST_IO_DETACH_DEVICE`,
    public var `FastIoQueryNetworkOpenInfo`: `FAST_IO_QUERY_NETWORK_OPEN_INFO`,
    public var `AcquireForModWrite`: `FAST_IO_ACQUIRE_FOR_MOD_WRITE`,
    public var `MdlRead`: `FAST_IO_MDL_READ`,
    public var `MdlReadComplete`: `FAST_IO_MDL_READ_COMPLETE`,
    public var `PrepareMdlWrite`: `FAST_IO_PREPARE_MDL_WRITE`,
    public var `MdlWriteComplete`: `FAST_IO_MDL_WRITE_COMPLETE`,
    public var `FastIoReadCompressed`: `FAST_IO_READ_COMPRESSED`,
    public var `FastIoWriteCompressed`: `FAST_IO_WRITE_COMPRESSED`,
    public var `MdlReadCompleteCompressed`: `FAST_IO_MDL_READ_COMPLETE_COMPRESSED`,
    public var `MdlWriteCompleteCompressed`: `FAST_IO_MDL_WRITE_COMPLETE_COMPRESSED`,
    public var `FastIoQueryOpen`: `FAST_IO_QUERY_OPEN`,
    public var `ReleaseForModWrite`: `FAST_IO_RELEASE_FOR_MOD_WRITE`,
    public var `AcquireForCcFlush`: `FAST_IO_ACQUIRE_FOR_CCFLUSH`,
    public var `ReleaseForCcFlush`: `FAST_IO_RELEASE_FOR_CCFLUSH`,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `FAST_IO_LOCK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FILE_OBJECT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `PEPROCESS`, UInt, Boolean, Boolean, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Win32`.`System`.`IO`.`IO_STATUS_BLOCK`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?) -> Boolean>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `FAST_IO_MDL_READ` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FILE_OBJECT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MDL`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Win32`.`System`.`IO`.`IO_STATUS_BLOCK`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?) -> Boolean>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `FAST_IO_MDL_READ_COMPLETE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FILE_OBJECT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MDL`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?) -> Boolean>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `FAST_IO_MDL_READ_COMPLETE_COMPRESSED` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FILE_OBJECT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MDL`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?) -> Boolean>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `FAST_IO_MDL_WRITE_COMPLETE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FILE_OBJECT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MDL`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?) -> Boolean>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `FAST_IO_MDL_WRITE_COMPLETE_COMPRESSED` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FILE_OBJECT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MDL`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?) -> Boolean>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `FAST_IO_PREPARE_MDL_WRITE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FILE_OBJECT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MDL`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Win32`.`System`.`IO`.`IO_STATUS_BLOCK`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?) -> Boolean>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `FAST_IO_QUERY_BASIC_INFO` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FILE_OBJECT`>?, Boolean, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Storage`.`FileSystem`.`FILE_BASIC_INFORMATION`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Win32`.`System`.`IO`.`IO_STATUS_BLOCK`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?) -> Boolean>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `FAST_IO_QUERY_NETWORK_OPEN_INFO` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FILE_OBJECT`>?, Boolean, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Storage`.`FileSystem`.`FILE_NETWORK_OPEN_INFORMATION`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Win32`.`System`.`IO`.`IO_STATUS_BLOCK`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?) -> Boolean>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `FAST_IO_QUERY_OPEN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`IRP`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Storage`.`FileSystem`.`FILE_NETWORK_OPEN_INFORMATION`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?) -> Boolean>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `FAST_IO_QUERY_STANDARD_INFO` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FILE_OBJECT`>?, Boolean, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Storage`.`FileSystem`.`FILE_STANDARD_INFORMATION`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Win32`.`System`.`IO`.`IO_STATUS_BLOCK`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?) -> Boolean>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `FAST_IO_READ` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FILE_OBJECT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, UInt, Boolean, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Win32`.`System`.`IO`.`IO_STATUS_BLOCK`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?) -> Boolean>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `FAST_IO_READ_COMPRESSED` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FILE_OBJECT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MDL`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Win32`.`System`.`IO`.`IO_STATUS_BLOCK`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Storage`.`FileSystem`.`COMPRESSED_DATA_INFO`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?) -> Boolean>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `FAST_IO_RELEASE_FILE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FILE_OBJECT`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `FAST_IO_RELEASE_FOR_CCFLUSH` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FILE_OBJECT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?) -> `super`.`super`.`Win32`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `FAST_IO_RELEASE_FOR_MOD_WRITE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FILE_OBJECT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`ERESOURCE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?) -> `super`.`super`.`Win32`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `FAST_IO_UNLOCK_ALL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FILE_OBJECT`>?, `PEPROCESS`, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Win32`.`System`.`IO`.`IO_STATUS_BLOCK`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?) -> Boolean>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `FAST_IO_UNLOCK_ALL_BY_KEY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FILE_OBJECT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Win32`.`System`.`IO`.`IO_STATUS_BLOCK`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?) -> Boolean>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `FAST_IO_UNLOCK_SINGLE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FILE_OBJECT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `PEPROCESS`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Win32`.`System`.`IO`.`IO_STATUS_BLOCK`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?) -> Boolean>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `FAST_IO_WRITE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FILE_OBJECT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, UInt, Boolean, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Win32`.`System`.`IO`.`IO_STATUS_BLOCK`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?) -> Boolean>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
public typealias `FAST_IO_WRITE_COMPRESSED` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FILE_OBJECT`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, UInt, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MDL`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Win32`.`System`.`IO`.`IO_STATUS_BLOCK`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Storage`.`FileSystem`.`COMPRESSED_DATA_INFO`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?) -> Boolean>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FAST_MUTEX` (
    public var `Count`: Int,
    public var `Owner`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Contention`: UInt,
    public var `Event`: `KEVENT`,
    public var `OldIrql`: UInt,
)
// UNSUPPORTED Rust 570:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for FAST_MUTEX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FILE_OBJECT` (
    public var `Type`: Short,
    public var `Size`: Short,
    public var `DeviceObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?,
    public var `Vpb`: /* Rust *mut */ kotlinx.cinterop.CPointer<`VPB`>?,
    public var `FsContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `FsContext2`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `SectionObjectPointer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SECTION_OBJECT_POINTERS`>?,
    public var `PrivateCacheMap`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `FinalStatus`: `super`.`super`.`Win32`.`Foundation`.`NTSTATUS`,
    public var `RelatedFileObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FILE_OBJECT`>?,
    public var `LockOperation`: Boolean,
    public var `DeletePending`: Boolean,
    public var `ReadAccess`: Boolean,
    public var `WriteAccess`: Boolean,
    public var `DeleteAccess`: Boolean,
    public var `SharedRead`: Boolean,
    public var `SharedWrite`: Boolean,
    public var `SharedDelete`: Boolean,
    public var `Flags`: UInt,
    public var `FileName`: `super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`,
    public var `CurrentByteOffset`: Long,
    public var `Waiters`: UInt,
    public var `Busy`: UInt,
    public var `LastLock`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Lock`: `KEVENT`,
    public var `Event`: `KEVENT`,
    public var `CompletionContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IO_COMPLETION_CONTEXT`>?,
    public var `IrpListLock`: ULong,
    public var `IrpList`: `super`.`super`.`Win32`.`System`.`Kernel`.`LIST_ENTRY`,
    public var `FileObjectExtension`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 611:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FILE_OBJECT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `IOMMU_DMA_DEVICE` = Long;
public typealias `IOMMU_DMA_DOMAIN` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IO_COMPLETION_CONTEXT` (
    public var `Port`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Key`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `UsageCount`: Long,
)
// UNSUPPORTED Rust 626:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IO_COMPLETION_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `IO_PRIORITY_HINT` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_System_SystemServices", feature = "Win32_Security"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IO_SECURITY_CONTEXT` (
    public var `SecurityQos`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Win32`.`Security`.`SECURITY_QUALITY_OF_SERVICE`>?,
    public var `AccessState`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ACCESS_STATE`>?,
    public var `DesiredAccess`: UInt,
    public var `FullCreateOptions`: UInt,
)
// UNSUPPORTED Rust 641:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_System_SystemServices", feature = "Win32_Security"))]
// impl Default for IO_SECURITY_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IO_STACK_LOCATION` (
    public var `MajorFunction`: UByte,
    public var `MinorFunction`: UByte,
    public var `Flags`: UByte,
    public var `Control`: UByte,
    public var `Parameters`: `IO_STACK_LOCATION_0`,
    public var `DeviceObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?,
    public var `FileObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FILE_OBJECT`>?,
    public var `CompletionRoutine`: `PIO_COMPLETION_ROUTINE`,
    public var `Context`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 661:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IO_STACK_LOCATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 667:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub union IO_STACK_LOCATION_0 {
//     pub Create: IO_STACK_LOCATION_0_0,
//     pub CreatePipe: IO_STACK_LOCATION_0_1,
//     pub CreateMailslot: IO_STACK_LOCATION_0_2,
//     pub Read: IO_STACK_LOCATION_0_3,
//     pub Write: IO_STACK_LOCATION_0_4,
//     pub QueryDirectory: IO_STACK_LOCATION_0_5,
//     pub NotifyDirectory: IO_STACK_LOCATION_0_6,
//     pub NotifyDirectoryEx: IO_STACK_LOCATION_0_7,
//     pub QueryFile: IO_STACK_LOCATION_0_8,
//     pub SetFile: IO_STACK_LOCATION_0_9,
//     pub QueryEa: IO_STACK_LOCATION_0_10,
//     pub SetEa: IO_STACK_LOCATION_0_11,
//     pub QueryVolume: IO_STACK_LOCATION_0_12,
//     pub SetVolume: IO_STACK_LOCATION_0_13,
//     pub FileSystemControl: IO_STACK_LOCATION_0_14,
//     pub LockControl: IO_STACK_LOCATION_0_15,
//     pub DeviceIoControl: IO_STACK_LOCATION_0_16,
//     pub QuerySecurity: IO_STACK_LOCATION_0_17,
//     pub SetSecurity: IO_STACK_LOCATION_0_18,
//     pub MountVolume: IO_STACK_LOCATION_0_19,
//     pub VerifyVolume: IO_STACK_LOCATION_0_20,
//     pub Scsi: IO_STACK_LOCATION_0_21,
//     pub QueryQuota: IO_STACK_LOCATION_0_22,
//     pub SetQuota: IO_STACK_LOCATION_0_23,
//     pub QueryDeviceRelations: IO_STACK_LOCATION_0_24,
//     pub QueryInterface: IO_STACK_LOCATION_0_25,
//     pub DeviceCapabilities: IO_STACK_LOCATION_0_26,
//     pub FilterResourceRequirements: IO_STACK_LOCATION_0_27,
//     pub ReadWriteConfig: IO_STACK_LOCATION_0_28,
//     pub SetLock: IO_STACK_LOCATION_0_29,
//     pub QueryId: IO_STACK_LOCATION_0_30,
//     pub QueryDeviceText: IO_STACK_LOCATION_0_31,
//     pub UsageNotification: IO_STACK_LOCATION_0_32,
//     pub WaitWake: IO_STACK_LOCATION_0_33,
//     pub PowerSequence: IO_STACK_LOCATION_0_34,
//     pub Power: IO_STACK_LOCATION_0_35,
//     pub StartDevice: IO_STACK_LOCATION_0_36,
//     pub WMI: IO_STACK_LOCATION_0_37,
//     pub Others: IO_STACK_LOCATION_0_38,
// }

// UNSUPPORTED Rust 711:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IO_STACK_LOCATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IO_STACK_LOCATION_0_2` (
    public var `SecurityContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IO_SECURITY_CONTEXT`>?,
    public var `Options`: UInt,
    public var `Reserved`: UShort,
    public var `ShareAccess`: UShort,
    public var `Parameters`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`System`.`SystemServices`.`MAILSLOT_CREATE_PARAMETERS`>?,
)
// UNSUPPORTED Rust 727:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IO_STACK_LOCATION_0_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IO_STACK_LOCATION_0_1` (
    public var `SecurityContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IO_SECURITY_CONTEXT`>?,
    public var `Options`: UInt,
    public var `Reserved`: UShort,
    public var `ShareAccess`: UShort,
    public var `Parameters`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`System`.`SystemServices`.`NAMED_PIPE_CREATE_PARAMETERS`>?,
)
// UNSUPPORTED Rust 743:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IO_STACK_LOCATION_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IO_STACK_LOCATION_0_0` (
    public var `SecurityContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IO_SECURITY_CONTEXT`>?,
    public var `Options`: UInt,
    public var `FileAttributes`: UShort,
    public var `ShareAccess`: UShort,
    public var `EaLength`: UInt,
)
// UNSUPPORTED Rust 759:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IO_STACK_LOCATION_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IO_STACK_LOCATION_0_26` (
    public var `Capabilities`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`System`.`SystemServices`.`DEVICE_CAPABILITIES`>?,
)
// UNSUPPORTED Rust 771:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IO_STACK_LOCATION_0_26 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IO_STACK_LOCATION_0_16` (
    public var `OutputBufferLength`: UInt,
    public var `InputBufferLength`: UInt,
    public var `IoControlCode`: UInt,
    public var `Type3InputBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 786:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IO_STACK_LOCATION_0_16 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IO_STACK_LOCATION_0_14` (
    public var `OutputBufferLength`: UInt,
    public var `InputBufferLength`: UInt,
    public var `FsControlCode`: UInt,
    public var `Type3InputBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 801:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IO_STACK_LOCATION_0_14 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IO_STACK_LOCATION_0_27` (
    public var `IoResourceRequirementList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`System`.`SystemServices`.`IO_RESOURCE_REQUIREMENTS_LIST`>?,
)
// UNSUPPORTED Rust 813:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IO_STACK_LOCATION_0_27 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IO_STACK_LOCATION_0_15` (
    public var `Length`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?,
    public var `Key`: UInt,
    public var `ByteOffset`: Long,
)
// UNSUPPORTED Rust 827:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IO_STACK_LOCATION_0_15 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IO_STACK_LOCATION_0_19` (
    public var `Vpb`: /* Rust *mut */ kotlinx.cinterop.CPointer<`VPB`>?,
    public var `DeviceObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?,
)
// UNSUPPORTED Rust 840:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IO_STACK_LOCATION_0_19 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IO_STACK_LOCATION_0_7` (
    public var `Length`: UInt,
    public var `CompletionFilter`: UInt,
    public var `DirectoryNotifyInformationClass`: `super`.`System`.`SystemServices`.`DIRECTORY_NOTIFY_INFORMATION_CLASS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IO_STACK_LOCATION_0_6` (
    public var `Length`: UInt,
    public var `CompletionFilter`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IO_STACK_LOCATION_0_38` (
    public var `Argument1`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Argument2`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Argument3`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Argument4`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 870:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IO_STACK_LOCATION_0_38 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IO_STACK_LOCATION_0_34` (
    public var `PowerSequence`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`System`.`SystemServices`.`POWER_SEQUENCE`>?,
)
// UNSUPPORTED Rust 882:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IO_STACK_LOCATION_0_34 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IO_STACK_LOCATION_0_35` (
    public var `Anonymous`: `IO_STACK_LOCATION_0_35_0`,
    public var `Type`: `super`.`System`.`SystemServices`.`POWER_STATE_TYPE`,
    public var `State`: `super`.`System`.`SystemServices`.`POWER_STATE`,
    public var `ShutdownType`: `super`.`super`.`Win32`.`System`.`Power`.`POWER_ACTION`,
)
// UNSUPPORTED Rust 897:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IO_STACK_LOCATION_0_35 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 903:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub union IO_STACK_LOCATION_0_35_0 {
//     pub SystemContext: u32,
//     pub SystemPowerStateContext: super::System::SystemServices::SYSTEM_POWER_STATE_CONTEXT,
// }

// UNSUPPORTED Rust 910:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IO_STACK_LOCATION_0_35_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IO_STACK_LOCATION_0_24` (
    public var `Type`: `super`.`System`.`SystemServices`.`DEVICE_RELATION_TYPE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IO_STACK_LOCATION_0_31` (
    public var `DeviceTextType`: `super`.`System`.`SystemServices`.`DEVICE_TEXT_TYPE`,
    public var `LocaleId`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IO_STACK_LOCATION_0_5` (
    public var `Length`: UInt,
    public var `FileName`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?,
    public var `FileInformationClass`: `super`.`Storage`.`FileSystem`.`FILE_INFORMATION_CLASS`,
    public var `FileIndex`: UInt,
)
// UNSUPPORTED Rust 938:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IO_STACK_LOCATION_0_5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IO_STACK_LOCATION_0_10` (
    public var `Length`: UInt,
    public var `EaList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `EaListLength`: UInt,
    public var `EaIndex`: UInt,
)
// UNSUPPORTED Rust 953:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IO_STACK_LOCATION_0_10 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IO_STACK_LOCATION_0_8` (
    public var `Length`: UInt,
    public var `FileInformationClass`: `super`.`Storage`.`FileSystem`.`FILE_INFORMATION_CLASS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IO_STACK_LOCATION_0_30` (
    public var `IdType`: `super`.`System`.`SystemServices`.`BUS_QUERY_ID_TYPE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IO_STACK_LOCATION_0_25` (
    public var `InterfaceType`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `Size`: UShort,
    public var `Version`: UShort,
    public var `Interface`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`System`.`SystemServices`.`INTERFACE`>?,
    public var `InterfaceSpecificData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 982:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IO_STACK_LOCATION_0_25 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IO_STACK_LOCATION_0_22` (
    public var `Length`: UInt,
    public var `StartSid`: `super`.`super`.`Win32`.`Security`.`PSID`,
    public var `SidList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Storage`.`FileSystem`.`FILE_GET_QUOTA_INFORMATION`>?,
    public var `SidListLength`: UInt,
)
// UNSUPPORTED Rust 997:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IO_STACK_LOCATION_0_22 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IO_STACK_LOCATION_0_17` (
    public var `SecurityInformation`: UInt,
    public var `Length`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IO_STACK_LOCATION_0_12` (
    public var `Length`: UInt,
    public var `FsInformationClass`: `super`.`Storage`.`FileSystem`.`FS_INFORMATION_CLASS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IO_STACK_LOCATION_0_28` (
    public var `WhichSpace`: UInt,
    public var `Buffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Offset`: UInt,
    public var `Length`: UInt,
)
// UNSUPPORTED Rust 1026:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IO_STACK_LOCATION_0_28 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IO_STACK_LOCATION_0_3` (
    public var `Length`: UInt,
    public var `Key`: UInt,
    public var `ByteOffset`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IO_STACK_LOCATION_0_21` (
    public var `Srb`: /* Rust *mut */ kotlinx.cinterop.CPointer<`_SCSI_REQUEST_BLOCK`>?,
)
// UNSUPPORTED Rust 1046:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IO_STACK_LOCATION_0_21 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IO_STACK_LOCATION_0_11` (
    public var `Length`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IO_STACK_LOCATION_0_9` (
    public var `Length`: UInt,
    public var `FileInformationClass`: `super`.`Storage`.`FileSystem`.`FILE_INFORMATION_CLASS`,
    public var `FileObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FILE_OBJECT`>?,
    public var `Anonymous`: `IO_STACK_LOCATION_0_9_0`,
)
// UNSUPPORTED Rust 1067:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IO_STACK_LOCATION_0_9 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1073:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub union IO_STACK_LOCATION_0_9_0 {
//     pub Anonymous: IO_STACK_LOCATION_0_9_0_0,
//     pub ClusterCount: u32,
//     pub DeleteHandle: super::super::Win32::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 1081:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IO_STACK_LOCATION_0_9_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IO_STACK_LOCATION_0_9_0_0` (
    public var `ReplaceIfExists`: Boolean,
    public var `AdvanceOnly`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IO_STACK_LOCATION_0_29` (
    public var `Lock`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IO_STACK_LOCATION_0_23` (
    public var `Length`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IO_STACK_LOCATION_0_18` (
    public var `SecurityInformation`: UInt,
    public var `SecurityDescriptor`: `super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`,
)
// UNSUPPORTED Rust 1113:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IO_STACK_LOCATION_0_18 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IO_STACK_LOCATION_0_13` (
    public var `Length`: UInt,
    public var `FsInformationClass`: `super`.`Storage`.`FileSystem`.`FS_INFORMATION_CLASS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IO_STACK_LOCATION_0_36` (
    public var `AllocatedResources`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`System`.`SystemServices`.`CM_RESOURCE_LIST`>?,
    public var `AllocatedResourcesTranslated`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`System`.`SystemServices`.`CM_RESOURCE_LIST`>?,
)
// UNSUPPORTED Rust 1133:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IO_STACK_LOCATION_0_36 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IO_STACK_LOCATION_0_32` (
    public var `InPath`: Boolean,
    public var `Reserved`: BooleanArray,
    public var `Type`: `super`.`System`.`SystemServices`.`DEVICE_USAGE_NOTIFICATION_TYPE`,
)
// UNSUPPORTED Rust 1147:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IO_STACK_LOCATION_0_32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IO_STACK_LOCATION_0_20` (
    public var `Vpb`: /* Rust *mut */ kotlinx.cinterop.CPointer<`VPB`>?,
    public var `DeviceObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?,
)
// UNSUPPORTED Rust 1160:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IO_STACK_LOCATION_0_20 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IO_STACK_LOCATION_0_37` (
    public var `ProviderId`: ULong,
    public var `DataPath`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `BufferSize`: UInt,
    public var `Buffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1175:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IO_STACK_LOCATION_0_37 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IO_STACK_LOCATION_0_33` (
    public var `PowerState`: `super`.`super`.`Win32`.`System`.`Power`.`SYSTEM_POWER_STATE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IO_STACK_LOCATION_0_4` (
    public var `Length`: UInt,
    public var `Key`: UInt,
    public var `ByteOffset`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IRP` (
    public var `Type`: Short,
    public var `Size`: UShort,
    public var `MdlAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MDL`>?,
    public var `Flags`: UInt,
    public var `AssociatedIrp`: `IRP_0`,
    public var `ThreadListEntry`: `super`.`super`.`Win32`.`System`.`Kernel`.`LIST_ENTRY`,
    public var `IoStatus`: `super`.`super`.`Win32`.`System`.`IO`.`IO_STATUS_BLOCK`,
    public var `RequestorMode`: Byte,
    public var `PendingReturned`: Boolean,
    public var `StackCount`: Byte,
    public var `CurrentLocation`: Byte,
    public var `Cancel`: Boolean,
    public var `CancelIrql`: UByte,
    public var `ApcEnvironment`: Byte,
    public var `AllocationFlags`: UByte,
    public var `Anonymous`: `IRP_1`,
    public var `UserEvent`: /* Rust *mut */ kotlinx.cinterop.CPointer<`KEVENT`>?,
    public var `Overlay`: `IRP_2`,
    public var `CancelRoutine`: `DRIVER_CANCEL`,
    public var `UserBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Tail`: `IRP_3`,
)
// UNSUPPORTED Rust 1221:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IRP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1227:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub union IRP_1 {
//     pub UserIosb: *mut super::super::Win32::System::IO::IO_STATUS_BLOCK,
//     pub IoRingContext: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1234:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IRP_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1240:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub union IRP_0 {
//     pub MasterIrp: *mut IRP,
//     pub IrpCount: i32,
//     pub SystemBuffer: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1248:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IRP_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1254:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub union IRP_2 {
//     pub AsynchronousParameters: IRP_2_0,
//     pub AllocationSize: i64,
// }

// UNSUPPORTED Rust 1261:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IRP_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IRP_2_0` (
    public var `Anonymous1`: `IRP_2_0_0`,
    public var `Anonymous2`: `IRP_2_0_1`,
)
// UNSUPPORTED Rust 1274:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IRP_2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1280:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub union IRP_2_0_0 {
//     pub UserApcRoutine: super::super::Win32::System::IO::PIO_APC_ROUTINE,
//     pub IssuingProcess: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1287:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IRP_2_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1293:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub union IRP_2_0_1 {
//     pub UserApcContext: *mut core::ffi::c_void,
//     pub IoRing: *mut _IORING_OBJECT,
// }

// UNSUPPORTED Rust 1300:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IRP_2_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1306:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub union IRP_3 {
//     pub Overlay: IRP_3_0,
//     pub Apc: super::System::SystemServices::KAPC,
//     pub CompletionKey: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1314:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IRP_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IRP_3_0` (
    public var `Anonymous1`: `IRP_3_0_0`,
    public var `Thread`: `PETHREAD`,
    public var `AuxiliaryBuffer`: `windows_sys`.`core`.`PSTR`,
    public var `Anonymous2`: `IRP_3_0_1`,
    public var `OriginalFileObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FILE_OBJECT`>?,
)
// UNSUPPORTED Rust 1330:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IRP_3_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1336:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub union IRP_3_0_0 {
//     pub DeviceQueueEntry: super::System::SystemServices::KDEVICE_QUEUE_ENTRY,
//     pub Anonymous: IRP_3_0_0_0,
// }

// UNSUPPORTED Rust 1343:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IRP_3_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IRP_3_0_0_0` (
    public var `DriverContext`: Array</* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>,
)
// UNSUPPORTED Rust 1355:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IRP_3_0_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IRP_3_0_1` (
    public var `ListEntry`: `super`.`super`.`Win32`.`System`.`Kernel`.`LIST_ENTRY`,
    public var `Anonymous`: `IRP_3_0_1_0`,
)
// UNSUPPORTED Rust 1368:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IRP_3_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1374:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub union IRP_3_0_1_0 {
//     pub CurrentStackLocation: *mut IO_STACK_LOCATION,
//     pub PacketType: u32,
// }

// UNSUPPORTED Rust 1381:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IRP_3_0_1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IoPriorityCritical`: `IO_PRIORITY_HINT` = 4;
public const val `IoPriorityHigh`: `IO_PRIORITY_HINT` = 3;
public const val `IoPriorityLow`: `IO_PRIORITY_HINT` = 1;
public const val `IoPriorityNormal`: `IO_PRIORITY_HINT` = 2;
public const val `IoPriorityVeryLow`: `IO_PRIORITY_HINT` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KDEVICE_QUEUE` (
    public var `Type`: Short,
    public var `Size`: Short,
    public var `DeviceListHead`: `super`.`super`.`Win32`.`System`.`Kernel`.`LIST_ENTRY`,
    public var `Lock`: ULong,
    public var `Busy`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KDPC` (
    public var `Anonymous`: `KDPC_0`,
    public var `DpcListEntry`: `super`.`super`.`Win32`.`System`.`Kernel`.`SINGLE_LIST_ENTRY`,
    public var `ProcessorHistory`: ULong,
    public var `DeferredRoutine`: `PKDEFERRED_ROUTINE`,
    public var `DeferredContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `SystemArgument1`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `SystemArgument2`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `DpcData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1415:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for KDPC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1421:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub union KDPC_0 {
//     pub TargetInfoAsUlong: u32,
//     pub Anonymous: KDPC_0_0,
// }

// UNSUPPORTED Rust 1428:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for KDPC_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KDPC_0_0` (
    public var `Type`: UByte,
    public var `Importance`: UByte,
    public var `Number`: UShort,
)
public typealias `KENLISTMENT` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KEVENT` (
    public var `Header`: `DISPATCHER_HEADER`,
)
// UNSUPPORTED Rust 1449:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for KEVENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `KGDT` = Long;
public typealias `KIDT` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KMUTANT` (
    public var `Header`: `DISPATCHER_HEADER`,
    public var `MutantListEntry`: `super`.`super`.`Win32`.`System`.`Kernel`.`LIST_ENTRY`,
    public var `OwnerThread`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?,
    public var `Anonymous`: `KMUTANT_0`,
    public var `ApcDisable`: UByte,
)
// UNSUPPORTED Rust 1467:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for KMUTANT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1473:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub union KMUTANT_0 {
//     pub MutantFlags: u8,
//     pub Anonymous: KMUTANT_0_0,
// }

// UNSUPPORTED Rust 1480:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for KMUTANT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KMUTANT_0_0` (
    public var `_bitfield`: UByte,
)
public typealias `KPCR` = Long;
public typealias `KPRCB` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KQUEUE` (
    public var `Header`: `DISPATCHER_HEADER`,
    public var `EntryListHead`: `super`.`super`.`Win32`.`System`.`Kernel`.`LIST_ENTRY`,
    public var `CurrentCount`: UInt,
    public var `MaximumCount`: UInt,
    public var `ThreadListHead`: `super`.`super`.`Win32`.`System`.`Kernel`.`LIST_ENTRY`,
)
// UNSUPPORTED Rust 1504:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for KQUEUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `KRESOURCEMANAGER` = Long;
public typealias `KSPIN_LOCK_QUEUE_NUMBER` = Int;
public typealias `KTM` = Long;
public typealias `KTRANSACTION` = Long;
public typealias `KTSS` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KWAIT_BLOCK` (
    public var `WaitListEntry`: `super`.`super`.`Win32`.`System`.`Kernel`.`LIST_ENTRY`,
    public var `WaitType`: UByte,
    public var `BlockState`: UByte,
    public var `WaitKey`: UShort,
    public var `Anonymous`: `KWAIT_BLOCK_0`,
    public var `Object`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `SparePtr`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1527:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for KWAIT_BLOCK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1533:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub union KWAIT_BLOCK_0 {
//     pub Thread: *mut isize,
//     pub NotificationQueue: *mut KQUEUE,
//     pub Dpc: *mut KDPC,
// }

// UNSUPPORTED Rust 1541:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for KWAIT_BLOCK_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `LOADER_PARAMETER_BLOCK` = Long;
public const val `LockQueueAfdWorkQueueLock`: `KSPIN_LOCK_QUEUE_NUMBER` = 13;
public const val `LockQueueBcbLock`: `KSPIN_LOCK_QUEUE_NUMBER` = 14;
public const val `LockQueueIoCancelLock`: `KSPIN_LOCK_QUEUE_NUMBER` = 7;
public const val `LockQueueIoCompletionLock`: `KSPIN_LOCK_QUEUE_NUMBER` = 11;
public const val `LockQueueIoDatabaseLock`: `KSPIN_LOCK_QUEUE_NUMBER` = 10;
public const val `LockQueueIoVpbLock`: `KSPIN_LOCK_QUEUE_NUMBER` = 9;
public const val `LockQueueMasterLock`: `KSPIN_LOCK_QUEUE_NUMBER` = 5;
public const val `LockQueueMaximumLock`: `KSPIN_LOCK_QUEUE_NUMBER` = 17;
public const val `LockQueueNonPagedPoolLock`: `KSPIN_LOCK_QUEUE_NUMBER` = 6;
public const val `LockQueueNtfsStructLock`: `KSPIN_LOCK_QUEUE_NUMBER` = 12;
public const val `LockQueueUnusedSpare0`: `KSPIN_LOCK_QUEUE_NUMBER` = 0;
public const val `LockQueueUnusedSpare1`: `KSPIN_LOCK_QUEUE_NUMBER` = 1;
public const val `LockQueueUnusedSpare15`: `KSPIN_LOCK_QUEUE_NUMBER` = 15;
public const val `LockQueueUnusedSpare16`: `KSPIN_LOCK_QUEUE_NUMBER` = 16;
public const val `LockQueueUnusedSpare2`: `KSPIN_LOCK_QUEUE_NUMBER` = 2;
public const val `LockQueueUnusedSpare3`: `KSPIN_LOCK_QUEUE_NUMBER` = 3;
public const val `LockQueueUnusedSpare8`: `KSPIN_LOCK_QUEUE_NUMBER` = 8;
public const val `LockQueueVacbLock`: `KSPIN_LOCK_QUEUE_NUMBER` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MDL` (
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MDL`>?,
    public var `Size`: Short,
    public var `MdlFlags`: Short,
    public var `Process`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?,
    public var `MappedSystemVa`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `StartVa`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ByteCount`: UInt,
    public var `ByteOffset`: UInt,
)
// UNSUPPORTED Rust 1578:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MDL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MaxIoPriorityTypes`: `IO_PRIORITY_HINT` = 5;
public const val `MaxPoolType`: `POOL_TYPE` = 7;
public const val `NTSTRSAFE_MAX_CCH`: UInt = 2147483647u;
public const val `NTSTRSAFE_MAX_LENGTH`: UInt = 2147483646u;
public const val `NTSTRSAFE_UNICODE_STRING_MAX_CCH`: UInt = 32767u;
public const val `NTSTRSAFE_USE_SECURE_CRT`: UInt = 0u;
public const val `NonPagedPool`: `POOL_TYPE` = 0;
public const val `NonPagedPoolBase`: `POOL_TYPE` = 0;
public const val `NonPagedPoolBaseCacheAligned`: `POOL_TYPE` = 4;
public const val `NonPagedPoolBaseCacheAlignedMustS`: `POOL_TYPE` = 6;
public const val `NonPagedPoolBaseMustSucceed`: `POOL_TYPE` = 2;
public const val `NonPagedPoolCacheAligned`: `POOL_TYPE` = 4;
public const val `NonPagedPoolCacheAlignedMustS`: `POOL_TYPE` = 6;
public const val `NonPagedPoolCacheAlignedMustSSession`: `POOL_TYPE` = 38;
public const val `NonPagedPoolCacheAlignedSession`: `POOL_TYPE` = 36;
public const val `NonPagedPoolExecute`: `POOL_TYPE` = 0;
public const val `NonPagedPoolMustSucceed`: `POOL_TYPE` = 2;
public const val `NonPagedPoolMustSucceedSession`: `POOL_TYPE` = 34;
public const val `NonPagedPoolNx`: `POOL_TYPE` = 512;
public const val `NonPagedPoolNxCacheAligned`: `POOL_TYPE` = 516;
public const val `NonPagedPoolSession`: `POOL_TYPE` = 32;
public const val `NonPagedPoolSessionNx`: `POOL_TYPE` = 544;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OBJECT_ATTRIBUTES` (
    public var `Length`: UInt,
    public var `RootDirectory`: `super`.`super`.`Win32`.`Foundation`.`HANDLE`,
    public var `ObjectName`: /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?,
    public var `Attributes`: `super`.`super`.`Win32`.`Foundation`.`OBJECT_ATTRIBUTE_FLAGS`,
    public var `SecurityDescriptor`: /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Win32`.`Security`.`SECURITY_DESCRIPTOR`>?,
    public var `SecurityQualityOfService`: /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Win32`.`Security`.`SECURITY_QUALITY_OF_SERVICE`>?,
)
// UNSUPPORTED Rust 1616:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for OBJECT_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OBJECT_ATTRIBUTES32` (
    public var `Length`: UInt,
    public var `RootDirectory`: UInt,
    public var `ObjectName`: UInt,
    public var `Attributes`: `super`.`super`.`Win32`.`Foundation`.`OBJECT_ATTRIBUTE_FLAGS`,
    public var `SecurityDescriptor`: /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Win32`.`Security`.`SECURITY_DESCRIPTOR`>?,
    public var `SecurityQualityOfService`: /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Win32`.`Security`.`SECURITY_QUALITY_OF_SERVICE`>?,
)
// UNSUPPORTED Rust 1633:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for OBJECT_ATTRIBUTES32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OBJECT_ATTRIBUTES64` (
    public var `Length`: UInt,
    public var `RootDirectory`: ULong,
    public var `ObjectName`: ULong,
    public var `Attributes`: `super`.`super`.`Win32`.`Foundation`.`OBJECT_ATTRIBUTE_FLAGS`,
    public var `SecurityDescriptor`: /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Win32`.`Security`.`SECURITY_DESCRIPTOR`>?,
    public var `SecurityQualityOfService`: /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Win32`.`Security`.`SECURITY_QUALITY_OF_SERVICE`>?,
)
// UNSUPPORTED Rust 1650:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for OBJECT_ATTRIBUTES64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `OBJECT_INFORMATION_CLASS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `OBJECT_NAME_INFORMATION` (
    public var `Name`: `super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OWNER_ENTRY` (
    public var `OwnerThread`: ULong,
    public var `Anonymous`: `OWNER_ENTRY_0`,
)
// UNSUPPORTED Rust 1668:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OWNER_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1673:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union OWNER_ENTRY_0 {
//     pub Anonymous: OWNER_ENTRY_0_0,
//     pub TableSize: u32,
// }

// UNSUPPORTED Rust 1679:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OWNER_ENTRY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `OWNER_ENTRY_0_0` (
    public var `_bitfield`: UInt,
)
public const val `ObjectBasicInformation`: `OBJECT_INFORMATION_CLASS` = 0;
public const val `ObjectTypeInformation`: `OBJECT_INFORMATION_CLASS` = 2;
public typealias `PAFFINITY_TOKEN` = Long;
public typealias `PBUS_HANDLER` = Long;
public typealias `PCALLBACK_OBJECT` = Long;
public typealias `PDEVICE_HANDLER_OBJECT` = Long;
public typealias `PEJOB` = Long;
public typealias `PEPROCESS` = Long;
public typealias `PESILO` = Long;
public typealias `PETHREAD` = Long;
public typealias `PEX_RUNDOWN_REF_CACHE_AWARE` = Long;
public typealias `PEX_TIMER` = Long;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFREE_FUNCTION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PIO_COMPLETION_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> `super`.`super`.`Win32`.`Foundation`.`NTSTATUS`>>>;
public typealias `PIO_REMOVE_LOCK_TRACKING_BLOCK` = Long;
public typealias `PIO_TIMER` = Long;
public typealias `PIO_WORKITEM` = Long;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PKDEFERRED_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Unit>>>;
public typealias `PKINTERRUPT` = Long;
public typealias `PKPROCESS` = Long;
public typealias `PKTHREAD` = Long;
public typealias `PNOTIFY_SYNC` = Long;
public typealias `POBJECT_TYPE` = Long;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `POHANDLE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public typealias `POOL_TYPE` = Int;
public typealias `PPCW_BUFFER` = Long;
public typealias `PPCW_INSTANCE` = Long;
public typealias `PPCW_REGISTRATION` = Long;
public typealias `PRKPROCESS` = Long;
public typealias `PRKTHREAD` = Long;
public typealias `PSILO_MONITOR` = Long;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWORKER_THREAD_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Unit>>>;
public const val `PagedPool`: `POOL_TYPE` = 1;
public const val `PagedPoolCacheAligned`: `POOL_TYPE` = 5;
public const val `PagedPoolCacheAlignedSession`: `POOL_TYPE` = 37;
public const val `PagedPoolSession`: `POOL_TYPE` = 33;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RTL_SPLAY_LINKS` (
    public var `Parent`: /* Rust *mut */ kotlinx.cinterop.CPointer<`RTL_SPLAY_LINKS`>?,
    public var `LeftChild`: /* Rust *mut */ kotlinx.cinterop.CPointer<`RTL_SPLAY_LINKS`>?,
    public var `RightChild`: /* Rust *mut */ kotlinx.cinterop.CPointer<`RTL_SPLAY_LINKS`>?,
)
// UNSUPPORTED Rust 1732:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RTL_SPLAY_LINKS {
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
public class `SECTION_OBJECT_POINTERS` (
    public var `DataSectionObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `SharedCacheMap`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ImageSectionObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1744:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SECTION_OBJECT_POINTERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SECURITY_SUBJECT_CONTEXT` (
    public var `ClientToken`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ImpersonationLevel`: `super`.`super`.`Win32`.`Security`.`SECURITY_IMPERSONATION_LEVEL`,
    public var `PrimaryToken`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ProcessAuditId`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1758:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for SECURITY_SUBJECT_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `STRSAFE_FILL_BEHIND`: UInt = 512u;
public const val `STRSAFE_FILL_BEHIND_NULL`: UInt = 512u;
public const val `STRSAFE_FILL_ON_FAILURE`: UInt = 1024u;
public const val `STRSAFE_IGNORE_NULLS`: UInt = 256u;
public const val `STRSAFE_NO_TRUNCATION`: UInt = 4096u;
public const val `STRSAFE_NULL_ON_FAILURE`: UInt = 2048u;
public const val `STRSAFE_ZERO_LENGTH_ON_FAILURE`: UInt = 2048u;
public typealias `SspiAsyncContext` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TARGET_DEVICE_CUSTOM_NOTIFICATION` (
    public var `Version`: UShort,
    public var `Size`: UShort,
    public var `Event`: `windows_sys`.`core`.`GUID`,
    public var `FileObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FILE_OBJECT`>?,
    public var `NameBufferOffset`: Int,
    public var `CustomDataBuffer`: UByteArray,
)
// UNSUPPORTED Rust 1783:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for TARGET_DEVICE_CUSTOM_NOTIFICATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VPB` (
    public var `Type`: Short,
    public var `Size`: Short,
    public var `Flags`: UShort,
    public var `VolumeLabelLength`: UShort,
    public var `DeviceObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?,
    public var `RealDevice`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DEVICE_OBJECT`>?,
    public var `SerialNumber`: UInt,
    public var `ReferenceCount`: UInt,
    public var `VolumeLabel`: UShortArray,
)
// UNSUPPORTED Rust 1803:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Wdk_Storage_FileSystem", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for VPB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WORK_QUEUE_ITEM` (
    public var `List`: `super`.`super`.`Win32`.`System`.`Kernel`.`LIST_ENTRY`,
    public var `WorkerRoutine`: `PWORKER_THREAD_ROUTINE`,
    public var `Parameter`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1817:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for WORK_QUEUE_ITEM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `_DEVICE_OBJECT_POWER_EXTENSION` = Long;
public typealias `_IORING_OBJECT` = Long;
public typealias `_SCSI_REQUEST_BLOCK` = Long;
public const val `__WARNING_BANNED_API_USAGE`: UInt = 28719u;
public const val `__WARNING_CYCLOMATIC_COMPLEXITY`: UInt = 28734u;
public const val `__WARNING_DEREF_NULL_PTR`: UInt = 6011u;
public const val `__WARNING_HIGH_PRIORITY_OVERFLOW_POSTCONDITION`: UInt = 26045u;
public const val `__WARNING_INCORRECT_ANNOTATION`: UInt = 26007u;
public const val `__WARNING_INVALID_PARAM_VALUE_1`: UInt = 6387u;
public const val `__WARNING_INVALID_PARAM_VALUE_3`: UInt = 28183u;
public const val `__WARNING_MISSING_ZERO_TERMINATION2`: UInt = 6054u;
public const val `__WARNING_POSTCONDITION_NULLTERMINATION_VIOLATION`: UInt = 26036u;
public const val `__WARNING_POST_EXPECTED`: UInt = 28210u;
public const val `__WARNING_POTENTIAL_BUFFER_OVERFLOW_HIGH_PRIORITY`: UInt = 26015u;
public const val `__WARNING_POTENTIAL_RANGE_POSTCONDITION_VIOLATION`: UInt = 26071u;
public const val `__WARNING_PRECONDITION_NULLTERMINATION_VIOLATION`: UInt = 26035u;
public const val `__WARNING_RANGE_POSTCONDITION_VIOLATION`: UInt = 26061u;
public const val `__WARNING_RETURNING_BAD_RESULT`: UInt = 28196u;
public const val `__WARNING_RETURN_UNINIT_VAR`: UInt = 6101u;
public const val `__WARNING_USING_UNINIT_VAR`: UInt = 6001u;
