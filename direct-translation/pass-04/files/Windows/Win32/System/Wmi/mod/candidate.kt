// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mi.dll, ABI=C, export=MI_Application_InitializeV1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MI_Application_InitializeV1`(`flags` : UInt, `applicationid` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `extendederror` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MI_Instance`>>?, `application` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MI_Application`>?) : `MI_Result`
public typealias `CIMTYPE_ENUMERATION` = Int;
public const val `CIM_BOOLEAN`: `CIMTYPE_ENUMERATION` = 11;
public const val `CIM_CHAR16`: `CIMTYPE_ENUMERATION` = 103;
public const val `CIM_DATETIME`: `CIMTYPE_ENUMERATION` = 101;
public const val `CIM_EMPTY`: `CIMTYPE_ENUMERATION` = 0;
public const val `CIM_FLAG_ARRAY`: `CIMTYPE_ENUMERATION` = 8192;
public const val `CIM_ILLEGAL`: `CIMTYPE_ENUMERATION` = 4095;
public const val `CIM_OBJECT`: `CIMTYPE_ENUMERATION` = 13;
public const val `CIM_REAL32`: `CIMTYPE_ENUMERATION` = 4;
public const val `CIM_REAL64`: `CIMTYPE_ENUMERATION` = 5;
public const val `CIM_REFERENCE`: `CIMTYPE_ENUMERATION` = 102;
public const val `CIM_SINT16`: `CIMTYPE_ENUMERATION` = 2;
public const val `CIM_SINT32`: `CIMTYPE_ENUMERATION` = 3;
public const val `CIM_SINT64`: `CIMTYPE_ENUMERATION` = 20;
public const val `CIM_SINT8`: `CIMTYPE_ENUMERATION` = 16;
public const val `CIM_STRING`: `CIMTYPE_ENUMERATION` = 8;
public const val `CIM_UINT16`: `CIMTYPE_ENUMERATION` = 18;
public const val `CIM_UINT32`: `CIMTYPE_ENUMERATION` = 19;
public const val `CIM_UINT64`: `CIMTYPE_ENUMERATION` = 21;
public const val `CIM_UINT8`: `CIMTYPE_ENUMERATION` = 17;
public const val `MI_ARRAY`: `MI_Type` = 16;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_Application` (
    public var `reserved1`: ULong,
    public var `reserved2`: Long,
    public var `ft`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_ApplicationFT`>?,
)
// UNSUPPORTED Rust 30:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_Application {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ApplicationFT` (
    public var `Close`: Long,
    public var `NewSession`: Long,
    public var `NewHostedProvider`: Long,
    public var `NewInstance`: Long,
    public var `NewDestinationOptions`: Long,
    public var `NewOperationOptions`: Long,
    public var `NewSubscriptionDeliveryOptions`: Long,
    public var `NewSerializer`: Long,
    public var `NewDeserializer`: Long,
    public var `NewInstanceFromClass`: Long,
    public var `NewClass`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_Array` (
    public var `data`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 56:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_Array {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ArrayField` (
    public var `value`: `MI_Array`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
public const val `MI_BOOLEAN`: `MI_Type` = 0;
public const val `MI_BOOLEANA`: `MI_Type` = 16;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_BooleanA` (
    public var `data`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 76:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_BooleanA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_BooleanAField` (
    public var `value`: `MI_BooleanA`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_BooleanField` (
    public var `value`: UByte,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
public const val `MI_CALLBACKMODE_IGNORE`: `MI_CallbackMode` = 2;
public const val `MI_CALLBACKMODE_INQUIRE`: `MI_CallbackMode` = 1;
public const val `MI_CALLBACKMODE_REPORT`: `MI_CallbackMode` = 0;
public const val `MI_CALL_VERSION`: UInt = 1u;
public const val `MI_CHAR16`: `MI_Type` = 11;
public const val `MI_CHAR16A`: `MI_Type` = 27;
public const val `MI_CHAR_TYPE`: UInt = 2u;
public typealias `MI_CallbackMode` = Int;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MI_CancelCallback` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`MI_CancellationReason`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
public typealias `MI_CancellationReason` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_Char16A` (
    public var `data`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 111:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_Char16A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_Char16AField` (
    public var `value`: `MI_Char16A`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_Char16Field` (
    public var `value`: UShort,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_Class` (
    public var `ft`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_ClassFT`>?,
    public var `classDecl`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_ClassDecl`>?,
    public var `namespaceName`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `serverName`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `reserved`: LongArray,
)
// UNSUPPORTED Rust 139:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_Class {
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
public class `MI_ClassDecl` (
    public var `flags`: UInt,
    public var `code`: UInt,
    public var `name`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `qualifiers`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MI_Qualifier`>>?,
    public var `numQualifiers`: UInt,
    public var `properties`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MI_PropertyDecl`>>?,
    public var `numProperties`: UInt,
    public var `size`: UInt,
    public var `superClass`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `superClassDecl`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_ClassDecl`>?,
    public var `methods`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MI_MethodDecl`>>?,
    public var `numMethods`: UInt,
    public var `schema`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_SchemaDecl`>?,
    public var `providerFT`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_ProviderFT`>?,
    public var `owningClass`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MI_Class`>?,
)
// UNSUPPORTED Rust 163:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_ClassDecl {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ClassFT` (
    public var `GetClassNameA`: Long,
    public var `GetNameSpace`: Long,
    public var `GetServerName`: Long,
    public var `GetElementCount`: Long,
    public var `GetElement`: Long,
    public var `GetElementAt`: Long,
    public var `GetClassQualifierSet`: Long,
    public var `GetMethodCount`: Long,
    public var `GetMethodAt`: Long,
    public var `GetMethod`: Long,
    public var `GetParentClassName`: Long,
    public var `GetParentClass`: Long,
    public var `Delete`: Long,
    public var `Clone`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_ClientFT_V1` (
    public var `applicationFT`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_ApplicationFT`>?,
    public var `sessionFT`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_SessionFT`>?,
    public var `operationFT`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_OperationFT`>?,
    public var `hostedProviderFT`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_HostedProviderFT`>?,
    public var `serializerFT`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_SerializerFT`>?,
    public var `deserializerFT`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_DeserializerFT`>?,
    public var `subscribeDeliveryOptionsFT`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_SubscriptionDeliveryOptionsFT`>?,
    public var `destinationOptionsFT`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_DestinationOptionsFT`>?,
    public var `operationOptionsFT`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_OperationOptionsFT`>?,
    public var `utilitiesFT`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_UtilitiesFT`>?,
)
// UNSUPPORTED Rust 200:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_ClientFT_V1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_ConstBooleanA` (
    public var `data`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 211:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_ConstBooleanA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ConstBooleanAField` (
    public var `value`: `MI_ConstBooleanA`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ConstBooleanField` (
    public var `value`: UByte,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_ConstChar16A` (
    public var `data`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 236:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_ConstChar16A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ConstChar16AField` (
    public var `value`: `MI_ConstChar16A`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ConstChar16Field` (
    public var `value`: UShort,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_ConstDatetimeA` (
    public var `data`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Datetime`>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 261:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_ConstDatetimeA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ConstDatetimeAField` (
    public var `value`: `MI_ConstDatetimeA`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_ConstDatetimeField` (
    public var `value`: `MI_Datetime`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// UNSUPPORTED Rust 280:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_ConstDatetimeField {
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
public class `MI_ConstInstanceA` (
    public var `data`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MI_Instance`>>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 291:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_ConstInstanceA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ConstInstanceAField` (
    public var `value`: `MI_ConstInstanceA`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_ConstInstanceField` (
    public var `value`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Instance`>?,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// UNSUPPORTED Rust 310:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_ConstInstanceField {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_ConstReal32A` (
    public var `data`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 321:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_ConstReal32A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ConstReal32AField` (
    public var `value`: `MI_ConstReal32A`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ConstReal32Field` (
    public var `value`: Float,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_ConstReal64A` (
    public var `data`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 346:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_ConstReal64A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ConstReal64AField` (
    public var `value`: `MI_ConstReal64A`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ConstReal64Field` (
    public var `value`: Double,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_ConstReferenceA` (
    public var `data`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MI_Instance`>>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 371:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_ConstReferenceA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ConstReferenceAField` (
    public var `value`: `MI_ConstReferenceA`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_ConstReferenceField` (
    public var `value`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Instance`>?,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// UNSUPPORTED Rust 390:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_ConstReferenceField {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_ConstSint16A` (
    public var `data`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 401:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_ConstSint16A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ConstSint16AField` (
    public var `value`: `MI_ConstSint16A`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ConstSint16Field` (
    public var `value`: Short,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_ConstSint32A` (
    public var `data`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 426:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_ConstSint32A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ConstSint32AField` (
    public var `value`: `MI_ConstSint32A`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ConstSint32Field` (
    public var `value`: Int,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_ConstSint64A` (
    public var `data`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 451:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_ConstSint64A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ConstSint64AField` (
    public var `value`: `MI_ConstSint64A`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ConstSint64Field` (
    public var `value`: Long,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_ConstSint8A` (
    public var `data`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 476:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_ConstSint8A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ConstSint8AField` (
    public var `value`: `MI_ConstSint8A`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ConstSint8Field` (
    public var `value`: Byte,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_ConstStringA` (
    public var `data`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 501:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_ConstStringA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ConstStringAField` (
    public var `value`: `MI_ConstStringA`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_ConstStringField` (
    public var `value`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// UNSUPPORTED Rust 520:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_ConstStringField {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_ConstUint16A` (
    public var `data`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 531:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_ConstUint16A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ConstUint16AField` (
    public var `value`: `MI_ConstUint16A`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ConstUint16Field` (
    public var `value`: UShort,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_ConstUint32A` (
    public var `data`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 556:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_ConstUint32A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ConstUint32AField` (
    public var `value`: `MI_ConstUint32A`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ConstUint32Field` (
    public var `value`: UInt,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_ConstUint64A` (
    public var `data`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 581:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_ConstUint64A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ConstUint64AField` (
    public var `value`: `MI_ConstUint64A`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ConstUint64Field` (
    public var `value`: ULong,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_ConstUint8A` (
    public var `data`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 606:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_ConstUint8A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ConstUint8AField` (
    public var `value`: `MI_ConstUint8A`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ConstUint8Field` (
    public var `value`: UByte,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_Context` (
    public var `ft`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_ContextFT`>?,
    public var `reserved`: LongArray,
)
// UNSUPPORTED Rust 631:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_Context {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ContextFT` (
    public var `PostResult`: Long,
    public var `PostInstance`: Long,
    public var `PostIndication`: Long,
    public var `ConstructInstance`: Long,
    public var `ConstructParameters`: Long,
    public var `NewInstance`: Long,
    public var `NewDynamicInstance`: Long,
    public var `NewParameters`: Long,
    public var `Canceled`: Long,
    public var `GetLocale`: Long,
    public var `RegisterCancel`: Long,
    public var `RequestUnload`: Long,
    public var `RefuseUnload`: Long,
    public var `GetLocalSession`: Long,
    public var `SetStringOption`: Long,
    public var `GetStringOption`: Long,
    public var `GetNumberOption`: Long,
    public var `GetCustomOption`: Long,
    public var `GetCustomOptionCount`: Long,
    public var `GetCustomOptionAt`: Long,
    public var `WriteMessage`: Long,
    public var `WriteProgress`: Long,
    public var `WriteStreamParameter`: Long,
    public var `WriteCimError`: Long,
    public var `PromptUser`: Long,
    public var `ShouldProcess`: Long,
    public var `ShouldContinue`: Long,
    public var `PostError`: Long,
    public var `PostCimError`: Long,
    public var `WriteError`: Long,
)
public const val `MI_DATETIME`: `MI_Type` = 12;
public const val `MI_DATETIMEA`: `MI_Type` = 28;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_Datetime` (
    public var `isTimestamp`: UInt,
    public var `u`: `MI_Datetime_0`,
)
// UNSUPPORTED Rust 678:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_Datetime {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 683:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MI_Datetime_0 {
//     pub timestamp: MI_Timestamp,
//     pub interval: MI_Interval,
// }

// UNSUPPORTED Rust 689:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_Datetime_0 {
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
public class `MI_DatetimeA` (
    public var `data`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MI_Datetime`>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 700:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_DatetimeA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_DatetimeAField` (
    public var `value`: `MI_DatetimeA`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_DatetimeField` (
    public var `value`: `MI_Datetime`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// UNSUPPORTED Rust 719:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_DatetimeField {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_Deserializer` (
    public var `reserved1`: ULong,
    public var `reserved2`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_DeserializerFT` (
    public var `Close`: Long,
    public var `DeserializeClass`: Long,
    public var `Class_GetClassName`: Long,
    public var `Class_GetParentClassName`: Long,
    public var `DeserializeInstance`: Long,
    public var `Instance_GetClassName`: Long,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MI_Deserializer_ClassObjectNeeded` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MI_Class`>>?) -> `MI_Result`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_DestinationOptions` (
    public var `reserved1`: ULong,
    public var `reserved2`: Long,
    public var `ft`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_DestinationOptionsFT`>?,
)
// UNSUPPORTED Rust 748:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_DestinationOptions {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_DestinationOptionsFT` (
    public var `Delete`: Long,
    public var `SetString`: Long,
    public var `SetNumber`: Long,
    public var `AddCredentials`: Long,
    public var `GetString`: Long,
    public var `GetNumber`: Long,
    public var `GetOptionCount`: Long,
    public var `GetOptionAt`: Long,
    public var `GetOption`: Long,
    public var `GetCredentialsCount`: Long,
    public var `GetCredentialsAt`: Long,
    public var `GetCredentialsPasswordAt`: Long,
    public var `Clone`: Long,
    public var `SetInterval`: Long,
    public var `GetInterval`: Long,
)
public typealias `MI_DestinationOptions_ImpersonationType` = Int;
public const val `MI_DestinationOptions_ImpersonationType_Default`: `MI_DestinationOptions_ImpersonationType` = 0;
public const val `MI_DestinationOptions_ImpersonationType_Delegate`: `MI_DestinationOptions_ImpersonationType` = 4;
public const val `MI_DestinationOptions_ImpersonationType_Identify`: `MI_DestinationOptions_ImpersonationType` = 2;
public const val `MI_DestinationOptions_ImpersonationType_Impersonate`: `MI_DestinationOptions_ImpersonationType` = 3;
public const val `MI_DestinationOptions_ImpersonationType_None`: `MI_DestinationOptions_ImpersonationType` = 1;
public const val `MI_ERRORCATEGORY_ACCESS_DENIED`: `MI_ErrorCategory` = 18;
public const val `MI_ERRORCATEGORY_AUTHENTICATION_ERROR`: `MI_ErrorCategory` = 28;
public const val `MI_ERRORCATEGORY_CLOS_EERROR`: `MI_ErrorCategory` = 2;
public const val `MI_ERRORCATEGORY_CONNECTION_ERROR`: `MI_ErrorCategory` = 27;
public const val `MI_ERRORCATEGORY_DEADLOCK_DETECTED`: `MI_ErrorCategory` = 4;
public const val `MI_ERRORCATEGORY_DEVICE_ERROR`: `MI_ErrorCategory` = 3;
public const val `MI_ERRORCATEGORY_FROM_STDERR`: `MI_ErrorCategory` = 24;
public const val `MI_ERRORCATEGORY_INVALID_ARGUMENT`: `MI_ErrorCategory` = 5;
public const val `MI_ERRORCATEGORY_INVALID_DATA`: `MI_ErrorCategory` = 6;
public const val `MI_ERRORCATEGORY_INVALID_OPERATION`: `MI_ErrorCategory` = 7;
public const val `MI_ERRORCATEGORY_INVALID_RESULT`: `MI_ErrorCategory` = 8;
public const val `MI_ERRORCATEGORY_INVALID_TYPE`: `MI_ErrorCategory` = 9;
public const val `MI_ERRORCATEGORY_LIMITS_EXCEEDED`: `MI_ErrorCategory` = 29;
public const val `MI_ERRORCATEGORY_METADATA_ERROR`: `MI_ErrorCategory` = 10;
public const val `MI_ERRORCATEGORY_NOT_ENABLED`: `MI_ErrorCategory` = 31;
public const val `MI_ERRORCATEGORY_NOT_IMPLEMENTED`: `MI_ErrorCategory` = 11;
public const val `MI_ERRORCATEGORY_NOT_INSTALLED`: `MI_ErrorCategory` = 12;
public const val `MI_ERRORCATEGORY_NOT_SPECIFIED`: `MI_ErrorCategory` = 0;
public const val `MI_ERRORCATEGORY_OBJECT_NOT_FOUND`: `MI_ErrorCategory` = 13;
public const val `MI_ERRORCATEGORY_OPEN_ERROR`: `MI_ErrorCategory` = 1;
public const val `MI_ERRORCATEGORY_OPERATION_STOPPED`: `MI_ErrorCategory` = 14;
public const val `MI_ERRORCATEGORY_OPERATION_TIMEOUT`: `MI_ErrorCategory` = 15;
public const val `MI_ERRORCATEGORY_PARSER_ERROR`: `MI_ErrorCategory` = 17;
public const val `MI_ERRORCATEGORY_PROTOCOL_ERROR`: `MI_ErrorCategory` = 26;
public const val `MI_ERRORCATEGORY_QUOTA_EXCEEDED`: `MI_ErrorCategory` = 30;
public const val `MI_ERRORCATEGORY_READ_ERROR`: `MI_ErrorCategory` = 22;
public const val `MI_ERRORCATEGORY_RESOURCE_BUSY`: `MI_ErrorCategory` = 19;
public const val `MI_ERRORCATEGORY_RESOURCE_EXISTS`: `MI_ErrorCategory` = 20;
public const val `MI_ERRORCATEGORY_RESOURCE_UNAVAILABLE`: `MI_ErrorCategory` = 21;
public const val `MI_ERRORCATEGORY_SECURITY_ERROR`: `MI_ErrorCategory` = 25;
public const val `MI_ERRORCATEGORY_SYNTAX_ERROR`: `MI_ErrorCategory` = 16;
public const val `MI_ERRORCATEGORY_WRITE_ERROR`: `MI_ErrorCategory` = 23;
public typealias `MI_ErrorCategory` = Int;
public const val `MI_FLAG_ABSTRACT`: UInt = 131072u;
public const val `MI_FLAG_ADOPT`: UInt = 2147483648u;
public const val `MI_FLAG_ANY`: UInt = 127u;
public const val `MI_FLAG_ASSOCIATION`: UInt = 16u;
public const val `MI_FLAG_BORROW`: UInt = 1073741824u;
public const val `MI_FLAG_CLASS`: UInt = 1u;
public const val `MI_FLAG_DISABLEOVERRIDE`: UInt = 256u;
public const val `MI_FLAG_ENABLEOVERRIDE`: UInt = 128u;
public const val `MI_FLAG_EXPENSIVE`: UInt = 524288u;
public const val `MI_FLAG_EXTENDED`: UInt = 4096u;
public const val `MI_FLAG_IN`: UInt = 8192u;
public const val `MI_FLAG_INDICATION`: UInt = 32u;
public const val `MI_FLAG_KEY`: UInt = 4096u;
public const val `MI_FLAG_METHOD`: UInt = 2u;
public const val `MI_FLAG_NOT_MODIFIED`: UInt = 33554432u;
public const val `MI_FLAG_NULL`: UInt = 536870912u;
public const val `MI_FLAG_OUT`: UInt = 16384u;
public const val `MI_FLAG_PARAMETER`: UInt = 8u;
public const val `MI_FLAG_PROPERTY`: UInt = 4u;
public const val `MI_FLAG_READONLY`: UInt = 2097152u;
public const val `MI_FLAG_REFERENCE`: UInt = 64u;
public const val `MI_FLAG_REQUIRED`: UInt = 32768u;
public const val `MI_FLAG_RESTRICTED`: UInt = 512u;
public const val `MI_FLAG_STATIC`: UInt = 65536u;
public const val `MI_FLAG_STREAM`: UInt = 1048576u;
public const val `MI_FLAG_TERMINAL`: UInt = 262144u;
public const val `MI_FLAG_TOSUBCLASS`: UInt = 1024u;
public const val `MI_FLAG_TRANSLATABLE`: UInt = 2048u;
public const val `MI_FLAG_VERSION`: UInt = 469762048u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_FeatureDecl` (
    public var `flags`: UInt,
    public var `code`: UInt,
    public var `name`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `qualifiers`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MI_Qualifier`>>?,
    public var `numQualifiers`: UInt,
)
// UNSUPPORTED Rust 849:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_FeatureDecl {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_Filter` (
    public var `ft`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_FilterFT`>?,
    public var `reserved`: LongArray,
)
// UNSUPPORTED Rust 860:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_Filter {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_FilterFT` (
    public var `Evaluate`: Long,
    public var `GetExpression`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_HostedProvider` (
    public var `reserved1`: ULong,
    public var `reserved2`: Long,
    public var `ft`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_HostedProviderFT`>?,
)
// UNSUPPORTED Rust 878:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_HostedProvider {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_HostedProviderFT` (
    public var `Close`: Long,
    public var `GetApplication`: Long,
)
public const val `MI_INSTANCE`: `MI_Type` = 15;
public const val `MI_INSTANCEA`: `MI_Type` = 31;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_Instance` (
    public var `ft`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_InstanceFT`>?,
    public var `classDecl`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_ClassDecl`>?,
    public var `serverName`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `nameSpace`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `reserved`: LongArray,
)
// UNSUPPORTED Rust 900:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_Instance {
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
public class `MI_InstanceA` (
    public var `data`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MI_Instance`>>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 911:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_InstanceA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_InstanceAField` (
    public var `value`: `MI_InstanceA`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_InstanceExFT` (
    public var `parent`: `MI_InstanceFT`,
    public var `Normalize`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_InstanceFT` (
    public var `Clone`: Long,
    public var `Destruct`: Long,
    public var `Delete`: Long,
    public var `IsA`: Long,
    public var `GetClassNameA`: Long,
    public var `SetNameSpace`: Long,
    public var `GetNameSpace`: Long,
    public var `GetElementCount`: Long,
    public var `AddElement`: Long,
    public var `SetElement`: Long,
    public var `SetElementAt`: Long,
    public var `GetElement`: Long,
    public var `GetElementAt`: Long,
    public var `ClearElement`: Long,
    public var `ClearElementAt`: Long,
    public var `GetServerName`: Long,
    public var `SetServerName`: Long,
    public var `GetClass`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_InstanceField` (
    public var `value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MI_Instance`>?,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// UNSUPPORTED Rust 958:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_InstanceField {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_Interval` (
    public var `days`: UInt,
    public var `hours`: UInt,
    public var `minutes`: UInt,
    public var `seconds`: UInt,
    public var `microseconds`: UInt,
    public var `__padding1`: UInt,
    public var `__padding2`: UInt,
    public var `__padding3`: UInt,
)
public const val `MI_LOCALE_TYPE_CLOSEST_DATA`: `MI_LocaleType` = 3;
public const val `MI_LOCALE_TYPE_CLOSEST_UI`: `MI_LocaleType` = 2;
public const val `MI_LOCALE_TYPE_REQUESTED_DATA`: `MI_LocaleType` = 1;
public const val `MI_LOCALE_TYPE_REQUESTED_UI`: `MI_LocaleType` = 0;
public typealias `MI_LocaleType` = Int;
public const val `MI_MAX_LOCALE_SIZE`: UInt = 128u;
public const val `MI_MODULE_FLAG_BOOLEANS`: UInt = 16u;
public const val `MI_MODULE_FLAG_CPLUSPLUS`: UInt = 32u;
public const val `MI_MODULE_FLAG_DESCRIPTIONS`: UInt = 2u;
public const val `MI_MODULE_FLAG_FILTER_SUPPORT`: UInt = 128u;
public const val `MI_MODULE_FLAG_LOCALIZED`: UInt = 64u;
public const val `MI_MODULE_FLAG_MAPPING_STRINGS`: UInt = 8u;
public const val `MI_MODULE_FLAG_STANDARD_QUALIFIERS`: UInt = 1u;
public const val `MI_MODULE_FLAG_VALUES`: UInt = 4u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MI_MainFunction` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`MI_Server`>?) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`MI_Module`>?>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_MethodDecl` (
    public var `flags`: UInt,
    public var `code`: UInt,
    public var `name`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `qualifiers`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MI_Qualifier`>>?,
    public var `numQualifiers`: UInt,
    public var `parameters`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MI_ParameterDecl`>>?,
    public var `numParameters`: UInt,
    public var `size`: UInt,
    public var `returnType`: UInt,
    public var `origin`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `propagator`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `schema`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_SchemaDecl`>?,
    public var `function`: `MI_MethodDecl_Invoke`,
)
// UNSUPPORTED Rust 1007:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_MethodDecl {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MI_MethodDecl_Invoke` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Context`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Instance`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Instance`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_Module` (
    public var `version`: UInt,
    public var `generatorVersion`: UInt,
    public var `flags`: UInt,
    public var `charSize`: UInt,
    public var `schemaDecl`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MI_SchemaDecl`>?,
    public var `Load`: `MI_Module_Load`,
    public var `Unload`: `MI_Module_Unload`,
    public var `dynamicProviderFT`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_ProviderFT`>?,
)
// UNSUPPORTED Rust 1025:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_Module {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MI_Module_Load` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MI_Module_Self`>>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Context`>?) -> Unit>>>;
public typealias `MI_Module_Self` = Long;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MI_Module_Unload` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`MI_Module_Self`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Context`>?) -> Unit>>>;
public const val `MI_OPERATIONFLAGS_BASIC_RTTI`: UInt = 2u;
public const val `MI_OPERATIONFLAGS_DEFAULT_RTTI`: UInt = 0u;
public const val `MI_OPERATIONFLAGS_EXPENSIVE_PROPERTIES`: UInt = 64u;
public const val `MI_OPERATIONFLAGS_FULL_RTTI`: UInt = 4u;
public const val `MI_OPERATIONFLAGS_LOCALIZED_QUALIFIERS`: UInt = 8u;
public const val `MI_OPERATIONFLAGS_MANUAL_ACK_RESULTS`: UInt = 1u;
public const val `MI_OPERATIONFLAGS_NO_RTTI`: UInt = 1024u;
public const val `MI_OPERATIONFLAGS_POLYMORPHISM_DEEP_BASE_PROPS_ONLY`: UInt = 384u;
public const val `MI_OPERATIONFLAGS_POLYMORPHISM_SHALLOW`: UInt = 128u;
public const val `MI_OPERATIONFLAGS_REPORT_OPERATION_STARTED`: UInt = 512u;
public const val `MI_OPERATIONFLAGS_STANDARD_RTTI`: UInt = 2048u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_ObjectDecl` (
    public var `flags`: UInt,
    public var `code`: UInt,
    public var `name`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `qualifiers`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MI_Qualifier`>>?,
    public var `numQualifiers`: UInt,
    public var `properties`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MI_PropertyDecl`>>?,
    public var `numProperties`: UInt,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 1056:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_ObjectDecl {
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
public class `MI_Operation` (
    public var `reserved1`: ULong,
    public var `reserved2`: Long,
    public var `ft`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_OperationFT`>?,
)
// UNSUPPORTED Rust 1068:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_Operation {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MI_OperationCallback_Class` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`MI_Operation`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Class`>?, UByte, `MI_Result`, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Instance`>?, Long) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MI_OperationCallback_Indication` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`MI_Operation`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Instance`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, UByte, `MI_Result`, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Instance`>?, Long) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MI_OperationCallback_Instance` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`MI_Operation`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Instance`>?, UByte, `MI_Result`, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Instance`>?, Long) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MI_OperationCallback_PromptUser` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`MI_Operation`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `MI_PromptType`, Long) -> Unit>>>;
public typealias `MI_OperationCallback_ResponseType` = Int;
public const val `MI_OperationCallback_ResponseType_No`: `MI_OperationCallback_ResponseType` = 0;
public const val `MI_OperationCallback_ResponseType_NoToAll`: `MI_OperationCallback_ResponseType` = 2;
public const val `MI_OperationCallback_ResponseType_Yes`: `MI_OperationCallback_ResponseType` = 1;
public const val `MI_OperationCallback_ResponseType_YesToAll`: `MI_OperationCallback_ResponseType` = 3;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MI_OperationCallback_StreamedParameter` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`MI_Operation`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `MI_Type`, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Value`>?, Long) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MI_OperationCallback_WriteError` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`MI_Operation`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Instance`>?, Long) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MI_OperationCallback_WriteMessage` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`MI_Operation`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MI_OperationCallback_WriteProgress` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`MI_Operation`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, UInt, UInt) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_OperationCallbacks` (
    public var `callbackContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `promptUser`: `MI_OperationCallback_PromptUser`,
    public var `writeError`: `MI_OperationCallback_WriteError`,
    public var `writeMessage`: `MI_OperationCallback_WriteMessage`,
    public var `writeProgress`: `MI_OperationCallback_WriteProgress`,
    public var `instanceResult`: `MI_OperationCallback_Instance`,
    public var `indicationResult`: `MI_OperationCallback_Indication`,
    public var `classResult`: `MI_OperationCallback_Class`,
    public var `streamedParameterResult`: `MI_OperationCallback_StreamedParameter`,
)
// UNSUPPORTED Rust 1099:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_OperationCallbacks {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_OperationFT` (
    public var `Close`: Long,
    public var `Cancel`: Long,
    public var `GetSession`: Long,
    public var `GetInstance`: Long,
    public var `GetIndication`: Long,
    public var `GetClass`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_OperationOptions` (
    public var `reserved1`: ULong,
    public var `reserved2`: Long,
    public var `ft`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_OperationOptionsFT`>?,
)
// UNSUPPORTED Rust 1121:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_OperationOptions {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_OperationOptionsFT` (
    public var `Delete`: Long,
    public var `SetString`: Long,
    public var `SetNumber`: Long,
    public var `SetCustomOption`: Long,
    public var `GetString`: Long,
    public var `GetNumber`: Long,
    public var `GetOptionCount`: Long,
    public var `GetOptionAt`: Long,
    public var `GetOption`: Long,
    public var `GetEnabledChannels`: Long,
    public var `Clone`: Long,
    public var `SetInterval`: Long,
    public var `GetInterval`: Long,
)
public const val `MI_PROMPTTYPE_CRITICAL`: `MI_PromptType` = 1;
public const val `MI_PROMPTTYPE_NORMAL`: `MI_PromptType` = 0;
public const val `MI_PROVIDER_ARCHITECTURE_32BIT`: `MI_ProviderArchitecture` = 0;
public const val `MI_PROVIDER_ARCHITECTURE_64BIT`: `MI_ProviderArchitecture` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_ParameterDecl` (
    public var `flags`: UInt,
    public var `code`: UInt,
    public var `name`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `qualifiers`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MI_Qualifier`>>?,
    public var `numQualifiers`: UInt,
    public var `type`: UInt,
    public var `className`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `subscript`: UInt,
    public var `offset`: UInt,
)
// UNSUPPORTED Rust 1160:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_ParameterDecl {
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
public class `MI_ParameterSet` (
    public var `reserved1`: ULong,
    public var `reserved2`: Long,
    public var `ft`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_ParameterSetFT`>?,
)
// UNSUPPORTED Rust 1172:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_ParameterSet {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ParameterSetFT` (
    public var `GetMethodReturnType`: Long,
    public var `GetParameterCount`: Long,
    public var `GetParameterAt`: Long,
    public var `GetParameter`: Long,
)
public typealias `MI_PromptType` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_PropertyDecl` (
    public var `flags`: UInt,
    public var `code`: UInt,
    public var `name`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `qualifiers`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MI_Qualifier`>>?,
    public var `numQualifiers`: UInt,
    public var `type`: UInt,
    public var `className`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `subscript`: UInt,
    public var `offset`: UInt,
    public var `origin`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `propagator`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `value`: /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1202:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_PropertyDecl {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_PropertySet` (
    public var `ft`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_PropertySetFT`>?,
    public var `reserved`: LongArray,
)
// UNSUPPORTED Rust 1213:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_PropertySet {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_PropertySetFT` (
    public var `GetElementCount`: Long,
    public var `ContainsElement`: Long,
    public var `AddElement`: Long,
    public var `GetElementAt`: Long,
    public var `Clear`: Long,
    public var `Destruct`: Long,
    public var `Delete`: Long,
    public var `Clone`: Long,
)
public typealias `MI_ProviderArchitecture` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ProviderFT` (
    public var `Load`: `MI_ProviderFT_Load`,
    public var `Unload`: `MI_ProviderFT_Unload`,
    public var `GetInstance`: `MI_ProviderFT_GetInstance`,
    public var `EnumerateInstances`: `MI_ProviderFT_EnumerateInstances`,
    public var `CreateInstance`: `MI_ProviderFT_CreateInstance`,
    public var `ModifyInstance`: `MI_ProviderFT_ModifyInstance`,
    public var `DeleteInstance`: `MI_ProviderFT_DeleteInstance`,
    public var `AssociatorInstances`: `MI_ProviderFT_AssociatorInstances`,
    public var `ReferenceInstances`: `MI_ProviderFT_ReferenceInstances`,
    public var `EnableIndications`: `MI_ProviderFT_EnableIndications`,
    public var `DisableIndications`: `MI_ProviderFT_DisableIndications`,
    public var `Subscribe`: `MI_ProviderFT_Subscribe`,
    public var `Unsubscribe`: `MI_ProviderFT_Unsubscribe`,
    public var `Invoke`: `MI_ProviderFT_Invoke`,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MI_ProviderFT_AssociatorInstances` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Context`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Instance`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_PropertySet`>?, UByte, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Filter`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MI_ProviderFT_CreateInstance` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Context`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Instance`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MI_ProviderFT_DeleteInstance` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Context`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Instance`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MI_ProviderFT_DisableIndications` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Context`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MI_ProviderFT_EnableIndications` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Context`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MI_ProviderFT_EnumerateInstances` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Context`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_PropertySet`>?, UByte, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Filter`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MI_ProviderFT_GetInstance` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Context`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Instance`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_PropertySet`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MI_ProviderFT_Invoke` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Context`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Instance`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Instance`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MI_ProviderFT_Load` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Module_Self`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Context`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MI_ProviderFT_ModifyInstance` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`MI_Context`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Instance`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_PropertySet`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MI_ProviderFT_ReferenceInstances` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Context`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Instance`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_PropertySet`>?, UByte, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Filter`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MI_ProviderFT_Subscribe` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Context`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Filter`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MI_ProviderFT_Unload` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Context`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MI_ProviderFT_Unsubscribe` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MI_Context`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_Qualifier` (
    public var `name`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `type`: UInt,
    public var `flavor`: UInt,
    public var `value`: /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1271:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_Qualifier {
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
public class `MI_QualifierDecl` (
    public var `name`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `type`: UInt,
    public var `scope`: UInt,
    public var `flavor`: UInt,
    public var `subscript`: UInt,
    public var `value`: /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1286:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_QualifierDecl {
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
public class `MI_QualifierSet` (
    public var `reserved1`: ULong,
    public var `reserved2`: Long,
    public var `ft`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_QualifierSetFT`>?,
)
// UNSUPPORTED Rust 1298:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_QualifierSet {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_QualifierSetFT` (
    public var `GetQualifierCount`: Long,
    public var `GetQualifierAt`: Long,
    public var `GetQualifier`: Long,
)
public const val `MI_REAL32`: `MI_Type` = 9;
public const val `MI_REAL32A`: `MI_Type` = 25;
public const val `MI_REAL64`: `MI_Type` = 10;
public const val `MI_REAL64A`: `MI_Type` = 26;
public const val `MI_REASON_NONE`: `MI_CancellationReason` = 0;
public const val `MI_REASON_SERVICESTOP`: `MI_CancellationReason` = 3;
public const val `MI_REASON_SHUTDOWN`: `MI_CancellationReason` = 2;
public const val `MI_REASON_TIMEOUT`: `MI_CancellationReason` = 1;
public const val `MI_REFERENCE`: `MI_Type` = 14;
public const val `MI_REFERENCEA`: `MI_Type` = 30;
public const val `MI_RESULT_ACCESS_DENIED`: `MI_Result` = 2;
public const val `MI_RESULT_ALREADY_EXISTS`: `MI_Result` = 11;
public const val `MI_RESULT_CLASS_HAS_CHILDREN`: `MI_Result` = 8;
public const val `MI_RESULT_CLASS_HAS_INSTANCES`: `MI_Result` = 9;
public const val `MI_RESULT_CONTINUATION_ON_ERROR_NOT_SUPPORTED`: `MI_Result` = 26;
public const val `MI_RESULT_FAILED`: `MI_Result` = 1;
public const val `MI_RESULT_FILTERED_ENUMERATION_NOT_SUPPORTED`: `MI_Result` = 25;
public const val `MI_RESULT_INVALID_CLASS`: `MI_Result` = 5;
public const val `MI_RESULT_INVALID_ENUMERATION_CONTEXT`: `MI_Result` = 21;
public const val `MI_RESULT_INVALID_NAMESPACE`: `MI_Result` = 3;
public const val `MI_RESULT_INVALID_OPERATION_TIMEOUT`: `MI_Result` = 22;
public const val `MI_RESULT_INVALID_PARAMETER`: `MI_Result` = 4;
public const val `MI_RESULT_INVALID_QUERY`: `MI_Result` = 15;
public const val `MI_RESULT_INVALID_SUPERCLASS`: `MI_Result` = 10;
public const val `MI_RESULT_METHOD_NOT_AVAILABLE`: `MI_Result` = 16;
public const val `MI_RESULT_METHOD_NOT_FOUND`: `MI_Result` = 17;
public const val `MI_RESULT_NAMESPACE_NOT_EMPTY`: `MI_Result` = 20;
public const val `MI_RESULT_NOT_FOUND`: `MI_Result` = 6;
public const val `MI_RESULT_NOT_SUPPORTED`: `MI_Result` = 7;
public const val `MI_RESULT_NO_SUCH_PROPERTY`: `MI_Result` = 12;
public const val `MI_RESULT_OK`: `MI_Result` = 0;
public const val `MI_RESULT_PULL_CANNOT_BE_ABANDONED`: `MI_Result` = 24;
public const val `MI_RESULT_PULL_HAS_BEEN_ABANDONED`: `MI_Result` = 23;
public const val `MI_RESULT_QUERY_LANGUAGE_NOT_SUPPORTED`: `MI_Result` = 14;
public const val `MI_RESULT_SERVER_IS_SHUTTING_DOWN`: `MI_Result` = 28;
public const val `MI_RESULT_SERVER_LIMITS_EXCEEDED`: `MI_Result` = 27;
public const val `MI_RESULT_TYPE_MISMATCH`: `MI_Result` = 13;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_Real32A` (
    public var `data`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 1353:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_Real32A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_Real32AField` (
    public var `value`: `MI_Real32A`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_Real32Field` (
    public var `value`: Float,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_Real64A` (
    public var `data`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 1378:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_Real64A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_Real64AField` (
    public var `value`: `MI_Real64A`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_Real64Field` (
    public var `value`: Double,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_ReferenceA` (
    public var `data`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MI_Instance`>>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 1403:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_ReferenceA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ReferenceAField` (
    public var `value`: `MI_ReferenceA`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_ReferenceField` (
    public var `value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MI_Instance`>?,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// UNSUPPORTED Rust 1422:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_ReferenceField {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `MI_Result` = Int;
public const val `MI_SERIALIZER_FLAGS_CLASS_DEEP`: UInt = 1u;
public const val `MI_SERIALIZER_FLAGS_INSTANCE_WITH_CLASS`: UInt = 1u;
public const val `MI_SINT16`: `MI_Type` = 4;
public const val `MI_SINT16A`: `MI_Type` = 20;
public const val `MI_SINT32`: `MI_Type` = 6;
public const val `MI_SINT32A`: `MI_Type` = 22;
public const val `MI_SINT64`: `MI_Type` = 8;
public const val `MI_SINT64A`: `MI_Type` = 24;
public const val `MI_SINT8`: `MI_Type` = 2;
public const val `MI_SINT8A`: `MI_Type` = 18;
public const val `MI_STRING`: `MI_Type` = 13;
public const val `MI_STRINGA`: `MI_Type` = 29;
// UNSUPPORTED Rust 1440:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MI_SUBSCRIBE_BOOKMARK_NEWEST: windows_sys::core::PCWSTR = windows_sys::core::w!("MI_SUBSCRIBE_BOOKMARK_NEWEST");

// UNSUPPORTED Rust 1441:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MI_SUBSCRIBE_BOOKMARK_OLDEST: windows_sys::core::PCWSTR = windows_sys::core::w!("MI_SUBSCRIBE_BOOKMARK_OLDEST");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_SchemaDecl` (
    public var `qualifierDecls`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MI_QualifierDecl`>>?,
    public var `numQualifierDecls`: UInt,
    public var `classDecls`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MI_ClassDecl`>>?,
    public var `numClassDecls`: UInt,
)
// UNSUPPORTED Rust 1450:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_SchemaDecl {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_Serializer` (
    public var `reserved1`: ULong,
    public var `reserved2`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_SerializerFT` (
    public var `Close`: Long,
    public var `SerializeClass`: Long,
    public var `SerializeInstance`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_Server` (
    public var `serverFT`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_ServerFT`>?,
    public var `contextFT`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_ContextFT`>?,
    public var `instanceFT`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_InstanceFT`>?,
    public var `propertySetFT`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_PropertySetFT`>?,
    public var `filterFT`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_FilterFT`>?,
)
// UNSUPPORTED Rust 1477:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_Server {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_ServerFT` (
    public var `GetVersion`: Long,
    public var `GetSystemName`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_Session` (
    public var `reserved1`: ULong,
    public var `reserved2`: Long,
    public var `ft`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_SessionFT`>?,
)
// UNSUPPORTED Rust 1495:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_Session {
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
public class `MI_SessionCallbacks` (
    public var `callbackContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `writeMessage`: Long,
    public var `writeError`: Long,
)
// UNSUPPORTED Rust 1507:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_SessionCallbacks {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_SessionFT` (
    public var `Close`: Long,
    public var `GetApplication`: Long,
    public var `GetInstance`: Long,
    public var `ModifyInstance`: Long,
    public var `CreateInstance`: Long,
    public var `DeleteInstance`: Long,
    public var `Invoke`: Long,
    public var `EnumerateInstances`: Long,
    public var `QueryInstances`: Long,
    public var `AssociatorInstances`: Long,
    public var `ReferenceInstances`: Long,
    public var `Subscribe`: Long,
    public var `GetClass`: Long,
    public var `EnumerateClasses`: Long,
    public var `TestConnection`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_Sint16A` (
    public var `data`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 1537:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_Sint16A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_Sint16AField` (
    public var `value`: `MI_Sint16A`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_Sint16Field` (
    public var `value`: Short,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_Sint32A` (
    public var `data`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 1562:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_Sint32A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_Sint32AField` (
    public var `value`: `MI_Sint32A`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_Sint32Field` (
    public var `value`: Int,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_Sint64A` (
    public var `data`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 1587:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_Sint64A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_Sint64AField` (
    public var `value`: `MI_Sint64A`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_Sint64Field` (
    public var `value`: Long,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_Sint8A` (
    public var `data`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 1612:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_Sint8A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_Sint8AField` (
    public var `value`: `MI_Sint8A`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_Sint8Field` (
    public var `value`: Byte,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_StringA` (
    public var `data`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 1637:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_StringA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_StringAField` (
    public var `value`: `MI_StringA`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_StringField` (
    public var `value`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// UNSUPPORTED Rust 1656:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_StringField {
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
public class `MI_SubscriptionDeliveryOptions` (
    public var `reserved1`: ULong,
    public var `reserved2`: Long,
    public var `ft`: /* Rust *const */ kotlinx.cinterop.CPointer<`MI_SubscriptionDeliveryOptionsFT`>?,
)
// UNSUPPORTED Rust 1668:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_SubscriptionDeliveryOptions {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_SubscriptionDeliveryOptionsFT` (
    public var `SetString`: Long,
    public var `SetNumber`: Long,
    public var `SetDateTime`: Long,
    public var `SetInterval`: Long,
    public var `AddCredentials`: Long,
    public var `Delete`: Long,
    public var `GetString`: Long,
    public var `GetNumber`: Long,
    public var `GetDateTime`: Long,
    public var `GetInterval`: Long,
    public var `GetOptionCount`: Long,
    public var `GetOptionAt`: Long,
    public var `GetOption`: Long,
    public var `GetCredentialsCount`: Long,
    public var `GetCredentialsAt`: Long,
    public var `GetCredentialsPasswordAt`: Long,
    public var `Clone`: Long,
)
public typealias `MI_SubscriptionDeliveryType` = Int;
public const val `MI_SubscriptionDeliveryType_Pull`: `MI_SubscriptionDeliveryType` = 1;
public const val `MI_SubscriptionDeliveryType_Push`: `MI_SubscriptionDeliveryType` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_Timestamp` (
    public var `year`: UInt,
    public var `month`: UInt,
    public var `day`: UInt,
    public var `hour`: UInt,
    public var `minute`: UInt,
    public var `second`: UInt,
    public var `microseconds`: UInt,
    public var `utc`: Int,
)
public typealias `MI_Type` = Int;
public const val `MI_UINT16`: `MI_Type` = 3;
public const val `MI_UINT16A`: `MI_Type` = 19;
public const val `MI_UINT32`: `MI_Type` = 5;
public const val `MI_UINT32A`: `MI_Type` = 21;
public const val `MI_UINT64`: `MI_Type` = 7;
public const val `MI_UINT64A`: `MI_Type` = 23;
public const val `MI_UINT8`: `MI_Type` = 1;
public const val `MI_UINT8A`: `MI_Type` = 17;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_Uint16A` (
    public var `data`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 1724:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_Uint16A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_Uint16AField` (
    public var `value`: `MI_Uint16A`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_Uint16Field` (
    public var `value`: UShort,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_Uint32A` (
    public var `data`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 1749:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_Uint32A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_Uint32AField` (
    public var `value`: `MI_Uint32A`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_Uint32Field` (
    public var `value`: UInt,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_Uint64A` (
    public var `data`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 1774:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_Uint64A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_Uint64AField` (
    public var `value`: `MI_Uint64A`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_Uint64Field` (
    public var `value`: ULong,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_Uint8A` (
    public var `data`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `size`: UInt,
)
// UNSUPPORTED Rust 1799:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_Uint8A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_Uint8AField` (
    public var `value`: `MI_Uint8A`,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_Uint8Field` (
    public var `value`: UByte,
    public var `exists`: UByte,
    public var `flags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_UserCredentials` (
    public var `authenticationType`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `credentials`: `MI_UserCredentials_0`,
)
// UNSUPPORTED Rust 1824:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_UserCredentials {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1829:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MI_UserCredentials_0 {
//     pub usernamePassword: MI_UsernamePasswordCreds,
//     pub certificateThumbprint: *const u16,
// }

// UNSUPPORTED Rust 1835:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_UserCredentials_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MI_UsernamePasswordCreds` (
    public var `domain`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `username`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `password`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
)
// UNSUPPORTED Rust 1847:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_UsernamePasswordCreds {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MI_UtilitiesFT` (
    public var `MapErrorToMiErrorCategory`: Long,
    public var `CimErrorFromErrorCode`: Long,
)
// UNSUPPORTED Rust 1858:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MI_Value {
//     pub boolean: u8,
//     pub uint8: u8,
//     pub sint8: i8,
//     pub uint16: u16,
//     pub sint16: i16,
//     pub uint32: u32,
//     pub sint32: i32,
//     pub uint64: u64,
//     pub sint64: i64,
//     pub real32: f32,
//     pub real64: f64,
//     pub char16: u16,
//     pub datetime: MI_Datetime,
//     pub string: *mut u16,
//     pub instance: *mut MI_Instance,
//     pub reference: *mut MI_Instance,
//     pub booleana: MI_BooleanA,
//     pub uint8a: MI_Uint8A,
//     pub sint8a: MI_Sint8A,
//     pub uint16a: MI_Uint16A,
//     pub sint16a: MI_Sint16A,
//     pub uint32a: MI_Uint32A,
//     pub sint32a: MI_Sint32A,
//     pub uint64a: MI_Uint64A,
//     pub sint64a: MI_Sint64A,
//     pub real32a: MI_Real32A,
//     pub real64a: MI_Real64A,
//     pub char16a: MI_Char16A,
//     pub datetimea: MI_DatetimeA,
//     pub stringa: MI_StringA,
//     pub referencea: MI_ReferenceA,
//     pub instancea: MI_InstanceA,
//     pub array: MI_Array,
// }

// UNSUPPORTED Rust 1895:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MI_Value {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MI_WRITEMESSAGE_CHANNEL_DEBUG`: UInt = 2u;
public const val `MI_WRITEMESSAGE_CHANNEL_VERBOSE`: UInt = 1u;
public const val `MI_WRITEMESSAGE_CHANNEL_WARNING`: UInt = 0u;
// UNSUPPORTED Rust 1903:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MofCompiler: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6daf9757_2e37_11d2_aec9_00c04fb68820);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SWbemAnalysisMatrix` (
    public var `m_uVersion`: UInt,
    public var `m_uMatrixType`: UInt,
    public var `m_pszProperty`: `windows_sys`.`core`.`PCWSTR`,
    public var `m_uPropertyType`: UInt,
    public var `m_uEntries`: UInt,
    public var `m_pValues`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?,
    public var `m_pbTruthTable`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?,
)
// UNSUPPORTED Rust 1915:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SWbemAnalysisMatrix {
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
public class `SWbemAnalysisMatrixList` (
    public var `m_uVersion`: UInt,
    public var `m_uMatrixType`: UInt,
    public var `m_uNumMatrices`: UInt,
    public var `m_pMatrices`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SWbemAnalysisMatrix`>?,
)
// UNSUPPORTED Rust 1928:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SWbemAnalysisMatrixList {
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
public class `SWbemAssocQueryInf` (
    public var `m_uVersion`: UInt,
    public var `m_uAnalysisType`: UInt,
    public var `m_uFeatureMask`: UInt,
    public var `m_pPath`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `m_pszPath`: `windows_sys`.`core`.`PWSTR`,
    public var `m_pszQueryText`: `windows_sys`.`core`.`PWSTR`,
    public var `m_pszResultClass`: `windows_sys`.`core`.`PWSTR`,
    public var `m_pszAssocClass`: `windows_sys`.`core`.`PWSTR`,
    public var `m_pszRole`: `windows_sys`.`core`.`PWSTR`,
    public var `m_pszResultRole`: `windows_sys`.`core`.`PWSTR`,
    public var `m_pszRequiredQualifier`: `windows_sys`.`core`.`PWSTR`,
    public var `m_pszRequiredAssocQualifier`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 1949:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SWbemAssocQueryInf {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1954:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SWbemDateTime: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x47dfbe54_cf76_11d3_b38f_00105a1f473a);

// UNSUPPORTED Rust 1955:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SWbemEventSource: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x04b83d58_21ae_11d2_8b33_00600806d9b6);

// UNSUPPORTED Rust 1956:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SWbemLastError: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc2feeeac_cfcd_11d1_8b05_00600806d9b6);

// UNSUPPORTED Rust 1957:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SWbemLocator: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x76a64158_cb41_11d1_8b02_00600806d9b6);

// UNSUPPORTED Rust 1958:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SWbemMethod: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x04b83d5b_21ae_11d2_8b33_00600806d9b6);

// UNSUPPORTED Rust 1959:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SWbemMethodSet: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x04b83d5a_21ae_11d2_8b33_00600806d9b6);

// UNSUPPORTED Rust 1960:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SWbemNamedValue: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x04b83d60_21ae_11d2_8b33_00600806d9b6);

// UNSUPPORTED Rust 1961:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SWbemNamedValueSet: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9aed384e_ce8b_11d1_8b05_00600806d9b6);

// UNSUPPORTED Rust 1962:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SWbemObject: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x04b83d62_21ae_11d2_8b33_00600806d9b6);

// UNSUPPORTED Rust 1963:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SWbemObjectEx: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd6bdafb2_9435_491f_bb87_6aa0f0bc31a2);

// UNSUPPORTED Rust 1964:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SWbemObjectPath: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5791bc26_ce9c_11d1_97bf_0000f81e849c);

// UNSUPPORTED Rust 1965:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SWbemObjectSet: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x04b83d61_21ae_11d2_8b33_00600806d9b6);

// UNSUPPORTED Rust 1966:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SWbemPrivilege: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x26ee67bc_5804_11d2_8b4a_00600806d9b6);

// UNSUPPORTED Rust 1967:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SWbemPrivilegeSet: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x26ee67be_5804_11d2_8b4a_00600806d9b6);

// UNSUPPORTED Rust 1968:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SWbemProperty: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x04b83d5d_21ae_11d2_8b33_00600806d9b6);

// UNSUPPORTED Rust 1969:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SWbemPropertySet: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x04b83d5c_21ae_11d2_8b33_00600806d9b6);

// UNSUPPORTED Rust 1970:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SWbemQualifier: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x04b83d5f_21ae_11d2_8b33_00600806d9b6);

// UNSUPPORTED Rust 1971:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SWbemQualifierSet: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x04b83d5e_21ae_11d2_8b33_00600806d9b6);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SWbemQueryQualifiedName` (
    public var `m_uVersion`: UInt,
    public var `m_uTokenType`: UInt,
    public var `m_uNameListSize`: UInt,
    public var `m_ppszNameList`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?,
    public var `m_bArraysUsed`: `windows_sys`.`core`.`BOOL`,
    public var `m_pbArrayElUsed`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?,
    public var `m_puArrayIndex`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
)
// UNSUPPORTED Rust 1983:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SWbemQueryQualifiedName {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1988:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SWbemRefreshableItem: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8c6854bc_de4b_11d3_b390_00105a1f473a);

// UNSUPPORTED Rust 1989:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SWbemRefresher: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd269bf5c_d9c1_11d3_b38f_00105a1f473a);

// UNSUPPORTED Rust 1990:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SWbemRpnConst {
//     pub m_pszStrVal: windows_sys::core::PCWSTR,
//     pub m_bBoolVal: windows_sys::core::BOOL,
//     pub m_lLongVal: i32,
//     pub m_uLongVal: u32,
//     pub m_dblVal: f64,
//     pub m_lVal64: i64,
//     pub m_uVal64: i64,
// }

// UNSUPPORTED Rust 2001:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SWbemRpnConst {
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
public class `SWbemRpnEncodedQuery` (
    public var `m_uVersion`: UInt,
    public var `m_uTokenType`: UInt,
    public var `m_uParsedFeatureMask`: ULong,
    public var `m_uDetectedArraySize`: UInt,
    public var `m_puDetectedFeatures`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `m_uSelectListSize`: UInt,
    public var `m_ppSelectList`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`SWbemQueryQualifiedName`>>?,
    public var `m_uFromTargetType`: UInt,
    public var `m_pszOptionalFromPath`: `windows_sys`.`core`.`PCWSTR`,
    public var `m_uFromListSize`: UInt,
    public var `m_ppszFromList`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?,
    public var `m_uWhereClauseSize`: UInt,
    public var `m_ppRpnWhereClause`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`SWbemRpnQueryToken`>>?,
    public var `m_dblWithinPolling`: Double,
    public var `m_dblWithinWindow`: Double,
    public var `m_uOrderByListSize`: UInt,
    public var `m_ppszOrderByList`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?,
    public var `m_uOrderDirectionEl`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
)
// UNSUPPORTED Rust 2028:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SWbemRpnEncodedQuery {
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
public class `SWbemRpnQueryToken` (
    public var `m_uVersion`: UInt,
    public var `m_uTokenType`: UInt,
    public var `m_uSubexpressionShape`: UInt,
    public var `m_uOperator`: UInt,
    public var `m_pRightIdent`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SWbemQueryQualifiedName`>?,
    public var `m_pLeftIdent`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SWbemQueryQualifiedName`>?,
    public var `m_uConstApparentType`: UInt,
    public var `m_Const`: `SWbemRpnConst`,
    public var `m_uConst2ApparentType`: UInt,
    public var `m_Const2`: `SWbemRpnConst`,
    public var `m_pszRightFunc`: `windows_sys`.`core`.`PCWSTR`,
    public var `m_pszLeftFunc`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 2049:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SWbemRpnQueryToken {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SWbemRpnTokenList` (
    public var `m_uVersion`: UInt,
    public var `m_uTokenType`: UInt,
    public var `m_uNumTokens`: UInt,
)
// UNSUPPORTED Rust 2061:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SWbemSecurity: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb54d66e9_2287_11d2_8b33_00600806d9b6);

// UNSUPPORTED Rust 2062:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SWbemServices: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x04b83d63_21ae_11d2_8b33_00600806d9b6);

// UNSUPPORTED Rust 2063:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SWbemServicesEx: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x62e522dc_8cf3_40a8_8b2e_37d595651e40);

// UNSUPPORTED Rust 2064:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SWbemSink: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x75718c9a_f029_11d1_a1ac_00c04fb6c223);

// UNSUPPORTED Rust 2065:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const UnsecuredApartment: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x49bd2028_1523_11d1_ad79_00c04fd8fdff);

public const val `WBEMESS_E_AUTHZ_NOT_PRIVILEGED`: `WBEMSTATUS` = -2147213309;
public const val `WBEMESS_E_REGISTRATION_TOO_BROAD`: `WBEMSTATUS` = -2147213311;
public const val `WBEMESS_E_REGISTRATION_TOO_PRECISE`: `WBEMSTATUS` = -2147213310;
public const val `WBEMMOF_E_ALIASES_IN_EMBEDDED`: `WBEMSTATUS` = -2147205089;
public const val `WBEMMOF_E_CIMTYPE_QUALIFIER`: `WBEMSTATUS` = -2147205094;
public const val `WBEMMOF_E_DUPLICATE_PROPERTY`: `WBEMSTATUS` = -2147205093;
public const val `WBEMMOF_E_DUPLICATE_QUALIFIER`: `WBEMSTATUS` = -2147205087;
public const val `WBEMMOF_E_ERROR_CREATING_TEMP_FILE`: `WBEMSTATUS` = -2147205073;
public const val `WBEMMOF_E_ERROR_INVALID_INCLUDE_FILE`: `WBEMSTATUS` = -2147205072;
public const val `WBEMMOF_E_EXPECTED_ALIAS_NAME`: `WBEMSTATUS` = -2147205098;
public const val `WBEMMOF_E_EXPECTED_BRACE_OR_BAD_TYPE`: `WBEMSTATUS` = -2147205079;
public const val `WBEMMOF_E_EXPECTED_CLASS_NAME`: `WBEMSTATUS` = -2147205100;
public const val `WBEMMOF_E_EXPECTED_CLOSE_BRACE`: `WBEMSTATUS` = -2147205116;
public const val `WBEMMOF_E_EXPECTED_CLOSE_BRACKET`: `WBEMSTATUS` = -2147205115;
public const val `WBEMMOF_E_EXPECTED_CLOSE_PAREN`: `WBEMSTATUS` = -2147205114;
public const val `WBEMMOF_E_EXPECTED_DOLLAR`: `WBEMSTATUS` = -2147205095;
public const val `WBEMMOF_E_EXPECTED_FLAVOR_TYPE`: `WBEMSTATUS` = -2147205086;
public const val `WBEMMOF_E_EXPECTED_OPEN_BRACE`: `WBEMSTATUS` = -2147205117;
public const val `WBEMMOF_E_EXPECTED_OPEN_PAREN`: `WBEMSTATUS` = -2147205111;
public const val `WBEMMOF_E_EXPECTED_PROPERTY_NAME`: `WBEMSTATUS` = -2147205108;
public const val `WBEMMOF_E_EXPECTED_QUALIFIER_NAME`: `WBEMSTATUS` = -2147205119;
public const val `WBEMMOF_E_EXPECTED_SEMI`: `WBEMSTATUS` = -2147205118;
public const val `WBEMMOF_E_EXPECTED_TYPE_IDENTIFIER`: `WBEMSTATUS` = -2147205112;
public const val `WBEMMOF_E_ILLEGAL_CONSTANT_VALUE`: `WBEMSTATUS` = -2147205113;
public const val `WBEMMOF_E_INCOMPATIBLE_FLAVOR_TYPES`: `WBEMSTATUS` = -2147205085;
public const val `WBEMMOF_E_INCOMPATIBLE_FLAVOR_TYPES2`: `WBEMSTATUS` = -2147205083;
public const val `WBEMMOF_E_INVALID_AMENDMENT_SYNTAX`: `WBEMSTATUS` = -2147205104;
public const val `WBEMMOF_E_INVALID_CLASS_DECLARATION`: `WBEMSTATUS` = -2147205097;
public const val `WBEMMOF_E_INVALID_DELETECLASS_SYNTAX`: `WBEMSTATUS` = -2147205071;
public const val `WBEMMOF_E_INVALID_DELETEINSTANCE_SYNTAX`: `WBEMSTATUS` = -2147205076;
public const val `WBEMMOF_E_INVALID_DUPLICATE_AMENDMENT`: `WBEMSTATUS` = -2147205103;
public const val `WBEMMOF_E_INVALID_FILE`: `WBEMSTATUS` = -2147205090;
public const val `WBEMMOF_E_INVALID_FLAGS_SYNTAX`: `WBEMSTATUS` = -2147205080;
public const val `WBEMMOF_E_INVALID_INSTANCE_DECLARATION`: `WBEMSTATUS` = -2147205096;
public const val `WBEMMOF_E_INVALID_NAMESPACE_SPECIFICATION`: `WBEMSTATUS` = -2147205092;
public const val `WBEMMOF_E_INVALID_NAMESPACE_SYNTAX`: `WBEMSTATUS` = -2147205101;
public const val `WBEMMOF_E_INVALID_PRAGMA`: `WBEMSTATUS` = -2147205102;
public const val `WBEMMOF_E_INVALID_QUALIFIER_SYNTAX`: `WBEMSTATUS` = -2147205075;
public const val `WBEMMOF_E_MULTIPLE_ALIASES`: `WBEMSTATUS` = -2147205084;
public const val `WBEMMOF_E_MUST_BE_IN_OR_OUT`: `WBEMSTATUS` = -2147205081;
public const val `WBEMMOF_E_NO_ARRAYS_RETURNED`: `WBEMSTATUS` = -2147205082;
public const val `WBEMMOF_E_NULL_ARRAY_ELEM`: `WBEMSTATUS` = -2147205088;
public const val `WBEMMOF_E_OUT_OF_RANGE`: `WBEMSTATUS` = -2147205091;
public const val `WBEMMOF_E_QUALIFIER_USED_OUTSIDE_SCOPE`: `WBEMSTATUS` = -2147205074;
public const val `WBEMMOF_E_TYPEDEF_NOT_SUPPORTED`: `WBEMSTATUS` = -2147205107;
public const val `WBEMMOF_E_TYPE_MISMATCH`: `WBEMSTATUS` = -2147205099;
public const val `WBEMMOF_E_UNEXPECTED_ALIAS`: `WBEMSTATUS` = -2147205106;
public const val `WBEMMOF_E_UNEXPECTED_ARRAY_INIT`: `WBEMSTATUS` = -2147205105;
public const val `WBEMMOF_E_UNRECOGNIZED_TOKEN`: `WBEMSTATUS` = -2147205110;
public const val `WBEMMOF_E_UNRECOGNIZED_TYPE`: `WBEMSTATUS` = -2147205109;
public const val `WBEMMOF_E_UNSUPPORTED_CIMV22_DATA_TYPE`: `WBEMSTATUS` = -2147205077;
public const val `WBEMMOF_E_UNSUPPORTED_CIMV22_QUAL_VALUE`: `WBEMSTATUS` = -2147205078;
public const val `WBEMPATH_COMPRESSED`: `WBEM_GET_TEXT_FLAGS` = 1;
public const val `WBEMPATH_CREATE_ACCEPT_ABSOLUTE`: `WBEM_PATH_CREATE_FLAG` = 2;
public const val `WBEMPATH_CREATE_ACCEPT_ALL`: `WBEM_PATH_CREATE_FLAG` = 4;
public const val `WBEMPATH_CREATE_ACCEPT_RELATIVE`: `WBEM_PATH_CREATE_FLAG` = 1;
public const val `WBEMPATH_GET_NAMESPACE_ONLY`: `WBEM_GET_TEXT_FLAGS` = 16;
public const val `WBEMPATH_GET_ORIGINAL`: `WBEM_GET_TEXT_FLAGS` = 32;
public const val `WBEMPATH_GET_RELATIVE_ONLY`: `WBEM_GET_TEXT_FLAGS` = 2;
public const val `WBEMPATH_GET_SERVER_AND_NAMESPACE_ONLY`: `WBEM_GET_TEXT_FLAGS` = 8;
public const val `WBEMPATH_GET_SERVER_TOO`: `WBEM_GET_TEXT_FLAGS` = 4;
public const val `WBEMPATH_INFO_ANON_LOCAL_MACHINE`: `WBEM_PATH_STATUS_FLAG` = 1;
public const val `WBEMPATH_INFO_CIM_COMPLIANT`: `WBEM_PATH_STATUS_FLAG` = 2048;
public const val `WBEMPATH_INFO_CONTAINS_SINGLETON`: `WBEM_PATH_STATUS_FLAG` = 256;
public const val `WBEMPATH_INFO_HAS_IMPLIED_KEY`: `WBEM_PATH_STATUS_FLAG` = 128;
public const val `WBEMPATH_INFO_HAS_MACHINE_NAME`: `WBEM_PATH_STATUS_FLAG` = 2;
public const val `WBEMPATH_INFO_HAS_SUBSCOPES`: `WBEM_PATH_STATUS_FLAG` = 16;
public const val `WBEMPATH_INFO_HAS_V2_REF_PATHS`: `WBEM_PATH_STATUS_FLAG` = 64;
public const val `WBEMPATH_INFO_IS_CLASS_REF`: `WBEM_PATH_STATUS_FLAG` = 4;
public const val `WBEMPATH_INFO_IS_COMPOUND`: `WBEM_PATH_STATUS_FLAG` = 32;
public const val `WBEMPATH_INFO_IS_INST_REF`: `WBEM_PATH_STATUS_FLAG` = 8;
public const val `WBEMPATH_INFO_IS_PARENT`: `WBEM_PATH_STATUS_FLAG` = 8192;
public const val `WBEMPATH_INFO_IS_SINGLETON`: `WBEM_PATH_STATUS_FLAG` = 4096;
public const val `WBEMPATH_INFO_NATIVE_PATH`: `WBEM_PATH_STATUS_FLAG` = 32768;
public const val `WBEMPATH_INFO_PATH_HAD_SERVER`: `WBEM_PATH_STATUS_FLAG` = 131072;
public const val `WBEMPATH_INFO_SERVER_NAMESPACE_ONLY`: `WBEM_PATH_STATUS_FLAG` = 16384;
public const val `WBEMPATH_INFO_V1_COMPLIANT`: `WBEM_PATH_STATUS_FLAG` = 512;
public const val `WBEMPATH_INFO_V2_COMPLIANT`: `WBEM_PATH_STATUS_FLAG` = 1024;
public const val `WBEMPATH_INFO_WMI_PATH`: `WBEM_PATH_STATUS_FLAG` = 65536;
public const val `WBEMPATH_QUOTEDTEXT`: `WBEM_GET_KEY_FLAGS` = 2;
public const val `WBEMPATH_TEXT`: `WBEM_GET_KEY_FLAGS` = 1;
public const val `WBEMPATH_TREAT_SINGLE_IDENT_AS_NS`: `WBEM_PATH_CREATE_FLAG` = 8;
public typealias `WBEMSTATUS` = Int;
public typealias `WBEMSTATUS_FORMAT` = Int;
public const val `WBEMSTATUS_FORMAT_NEWLINE`: `WBEMSTATUS_FORMAT` = 0;
public const val `WBEMSTATUS_FORMAT_NO_NEWLINE`: `WBEMSTATUS_FORMAT` = 1;
public const val `WBEMS_DISPID_COMPLETED`: UInt = 2u;
public const val `WBEMS_DISPID_CONNECTION_READY`: UInt = 5u;
public const val `WBEMS_DISPID_DERIVATION`: UInt = 23u;
public const val `WBEMS_DISPID_OBJECT_PUT`: UInt = 4u;
public const val `WBEMS_DISPID_OBJECT_READY`: UInt = 1u;
public const val `WBEMS_DISPID_PROGRESS`: UInt = 3u;
public const val `WBEM_AUTHENTICATION_METHOD_MASK`: `WBEM_LOGIN_TYPE` = 15;
public typealias `WBEM_BACKUP_RESTORE_FLAGS` = Int;
public typealias `WBEM_BATCH_TYPE` = Int;
public typealias `WBEM_CHANGE_FLAG_TYPE` = Int;
public typealias `WBEM_COMPARISON_FLAG` = Int;
public const val `WBEM_COMPARISON_INCLUDE_ALL`: `WBEM_COMPARISON_FLAG` = 0;
public typealias `WBEM_COMPILER_OPTIONS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WBEM_COMPILE_STATUS_INFO` (
    public var `lPhaseError`: Int,
    public var `hRes`: `windows_sys`.`core`.`HRESULT`,
    public var `ObjectNum`: Int,
    public var `FirstLine`: Int,
    public var `LastLine`: Int,
    public var `dwOutFlags`: UInt,
)
public typealias `WBEM_CONDITION_FLAG_TYPE` = Int;
public typealias `WBEM_CONNECT_OPTIONS` = Int;
public const val `WBEM_ENABLE`: `WBEM_SECURITY_FLAGS` = 1;
public typealias `WBEM_EXTRA_RETURN_CODES` = Int;
public const val `WBEM_E_ACCESS_DENIED`: `WBEMSTATUS` = -2147217405;
public const val `WBEM_E_AGGREGATING_BY_OBJECT`: `WBEMSTATUS` = -2147217315;
public const val `WBEM_E_ALREADY_EXISTS`: `WBEMSTATUS` = -2147217383;
public const val `WBEM_E_AMBIGUOUS_OPERATION`: `WBEMSTATUS` = -2147217301;
public const val `WBEM_E_AMENDED_OBJECT`: `WBEMSTATUS` = -2147217306;
public const val `WBEM_E_BACKUP_RESTORE_WINMGMT_RUNNING`: `WBEMSTATUS` = -2147217312;
public const val `WBEM_E_BUFFER_TOO_SMALL`: `WBEMSTATUS` = -2147217348;
public const val `WBEM_E_CALL_CANCELLED`: `WBEMSTATUS` = -2147217358;
public const val `WBEM_E_CANNOT_BE_ABSTRACT`: `WBEMSTATUS` = -2147217307;
public const val `WBEM_E_CANNOT_BE_KEY`: `WBEMSTATUS` = -2147217377;
public const val `WBEM_E_CANNOT_BE_SINGLETON`: `WBEMSTATUS` = -2147217364;
public const val `WBEM_E_CANNOT_CHANGE_INDEX_INHERITANCE`: `WBEMSTATUS` = -2147217328;
public const val `WBEM_E_CANNOT_CHANGE_KEY_INHERITANCE`: `WBEMSTATUS` = -2147217335;
public const val `WBEM_E_CIRCULAR_REFERENCE`: `WBEMSTATUS` = -2147217337;
public const val `WBEM_E_CLASS_HAS_CHILDREN`: `WBEMSTATUS` = -2147217371;
public const val `WBEM_E_CLASS_HAS_INSTANCES`: `WBEMSTATUS` = -2147217370;
public const val `WBEM_E_CLASS_NAME_TOO_WIDE`: `WBEMSTATUS` = -2147217292;
public const val `WBEM_E_CLIENT_TOO_SLOW`: `WBEMSTATUS` = -2147217305;
public const val `WBEM_E_CONNECTION_FAILED`: `WBEMSTATUS` = -2147217295;
public const val `WBEM_E_CRITICAL_ERROR`: `WBEMSTATUS` = -2147217398;
public const val `WBEM_E_DATABASE_VER_MISMATCH`: `WBEMSTATUS` = -2147217288;
public const val `WBEM_E_ENCRYPTED_CONNECTION_REQUIRED`: `WBEMSTATUS` = -2147217273;
public const val `WBEM_E_FAILED`: `WBEMSTATUS` = -2147217407;
public const val `WBEM_E_FATAL_TRANSPORT_ERROR`: `WBEMSTATUS` = -2147217274;
public const val `WBEM_E_HANDLE_OUT_OF_DATE`: `WBEMSTATUS` = -2147217296;
public const val `WBEM_E_ILLEGAL_NULL`: `WBEMSTATUS` = -2147217368;
public const val `WBEM_E_ILLEGAL_OPERATION`: `WBEMSTATUS` = -2147217378;
public const val `WBEM_E_INCOMPLETE_CLASS`: `WBEMSTATUS` = -2147217376;
public const val `WBEM_E_INITIALIZATION_FAILURE`: `WBEMSTATUS` = -2147217388;
public const val `WBEM_E_INVALID_ASSOCIATION`: `WBEMSTATUS` = -2147217302;
public const val `WBEM_E_INVALID_CIM_TYPE`: `WBEMSTATUS` = -2147217363;
public const val `WBEM_E_INVALID_CLASS`: `WBEMSTATUS` = -2147217392;
public const val `WBEM_E_INVALID_CONTEXT`: `WBEMSTATUS` = -2147217401;
public const val `WBEM_E_INVALID_DUPLICATE_PARAMETER`: `WBEMSTATUS` = -2147217341;
public const val `WBEM_E_INVALID_FLAVOR`: `WBEMSTATUS` = -2147217338;
public const val `WBEM_E_INVALID_HANDLE_REQUEST`: `WBEMSTATUS` = -2147217294;
public const val `WBEM_E_INVALID_LOCALE`: `WBEMSTATUS` = -2147217280;
public const val `WBEM_E_INVALID_METHOD`: `WBEMSTATUS` = -2147217362;
public const val `WBEM_E_INVALID_METHOD_PARAMETERS`: `WBEMSTATUS` = -2147217361;
public const val `WBEM_E_INVALID_NAMESPACE`: `WBEMSTATUS` = -2147217394;
public const val `WBEM_E_INVALID_OBJECT`: `WBEMSTATUS` = -2147217393;
public const val `WBEM_E_INVALID_OBJECT_PATH`: `WBEMSTATUS` = -2147217350;
public const val `WBEM_E_INVALID_OPERATION`: `WBEMSTATUS` = -2147217386;
public const val `WBEM_E_INVALID_OPERATOR`: `WBEMSTATUS` = -2147217309;
public const val `WBEM_E_INVALID_PARAMETER`: `WBEMSTATUS` = -2147217400;
public const val `WBEM_E_INVALID_PARAMETER_ID`: `WBEMSTATUS` = -2147217353;
public const val `WBEM_E_INVALID_PROPERTY`: `WBEMSTATUS` = -2147217359;
public const val `WBEM_E_INVALID_PROPERTY_TYPE`: `WBEMSTATUS` = -2147217366;
public const val `WBEM_E_INVALID_PROVIDER_REGISTRATION`: `WBEMSTATUS` = -2147217390;
public const val `WBEM_E_INVALID_QUALIFIER`: `WBEMSTATUS` = -2147217342;
public const val `WBEM_E_INVALID_QUALIFIER_TYPE`: `WBEMSTATUS` = -2147217367;
public const val `WBEM_E_INVALID_QUERY`: `WBEMSTATUS` = -2147217385;
public const val `WBEM_E_INVALID_QUERY_TYPE`: `WBEMSTATUS` = -2147217384;
public const val `WBEM_E_INVALID_STREAM`: `WBEMSTATUS` = -2147217397;
public const val `WBEM_E_INVALID_SUPERCLASS`: `WBEMSTATUS` = -2147217395;
public const val `WBEM_E_INVALID_SYNTAX`: `WBEMSTATUS` = -2147217375;
public const val `WBEM_E_LOCAL_CREDENTIALS`: `WBEMSTATUS` = -2147217308;
public const val `WBEM_E_MARSHAL_INVALID_SIGNATURE`: `WBEMSTATUS` = -2147217343;
public const val `WBEM_E_MARSHAL_VERSION_MISMATCH`: `WBEMSTATUS` = -2147217344;
public const val `WBEM_E_METHOD_DISABLED`: `WBEMSTATUS` = -2147217322;
public const val `WBEM_E_METHOD_NAME_TOO_WIDE`: `WBEMSTATUS` = -2147217291;
public const val `WBEM_E_METHOD_NOT_IMPLEMENTED`: `WBEMSTATUS` = -2147217323;
public const val `WBEM_E_MISSING_AGGREGATION_LIST`: `WBEMSTATUS` = -2147217317;
public const val `WBEM_E_MISSING_GROUP_WITHIN`: `WBEMSTATUS` = -2147217318;
public const val `WBEM_E_MISSING_PARAMETER_ID`: `WBEMSTATUS` = -2147217354;
public const val `WBEM_E_NONCONSECUTIVE_PARAMETER_IDS`: `WBEMSTATUS` = -2147217352;
public const val `WBEM_E_NONDECORATED_OBJECT`: `WBEMSTATUS` = -2147217374;
public const val `WBEM_E_NOT_AVAILABLE`: `WBEMSTATUS` = -2147217399;
public const val `WBEM_E_NOT_EVENT_CLASS`: `WBEMSTATUS` = -2147217319;
public const val `WBEM_E_NOT_FOUND`: `WBEMSTATUS` = -2147217406;
public const val `WBEM_E_NOT_SUPPORTED`: `WBEMSTATUS` = -2147217396;
public const val `WBEM_E_NO_KEY`: `WBEMSTATUS` = -2147217271;
public const val `WBEM_E_NO_SCHEMA`: `WBEMSTATUS` = -2147217277;
public const val `WBEM_E_NULL_SECURITY_DESCRIPTOR`: `WBEMSTATUS` = -2147217304;
public const val `WBEM_E_OUT_OF_DISK_SPACE`: `WBEMSTATUS` = -2147217349;
public const val `WBEM_E_OUT_OF_MEMORY`: `WBEMSTATUS` = -2147217402;
public const val `WBEM_E_OVERRIDE_NOT_ALLOWED`: `WBEMSTATUS` = -2147217382;
public const val `WBEM_E_PARAMETER_ID_ON_RETVAL`: `WBEMSTATUS` = -2147217351;
public const val `WBEM_E_PRIVILEGE_NOT_HELD`: `WBEMSTATUS` = -2147217310;
public const val `WBEM_E_PROPAGATED_METHOD`: `WBEMSTATUS` = -2147217356;
public const val `WBEM_E_PROPAGATED_PROPERTY`: `WBEMSTATUS` = -2147217380;
public const val `WBEM_E_PROPAGATED_QUALIFIER`: `WBEMSTATUS` = -2147217381;
public const val `WBEM_E_PROPERTY_NAME_TOO_WIDE`: `WBEMSTATUS` = -2147217293;
public const val `WBEM_E_PROPERTY_NOT_AN_OBJECT`: `WBEMSTATUS` = -2147217316;
public const val `WBEM_E_PROVIDER_ALREADY_REGISTERED`: `WBEMSTATUS` = -2147217276;
public const val `WBEM_E_PROVIDER_DISABLED`: `WBEMSTATUS` = -2147217270;
public const val `WBEM_E_PROVIDER_FAILURE`: `WBEMSTATUS` = -2147217404;
public const val `WBEM_E_PROVIDER_LOAD_FAILURE`: `WBEMSTATUS` = -2147217389;
public const val `WBEM_E_PROVIDER_NOT_CAPABLE`: `WBEMSTATUS` = -2147217372;
public const val `WBEM_E_PROVIDER_NOT_FOUND`: `WBEMSTATUS` = -2147217391;
public const val `WBEM_E_PROVIDER_NOT_REGISTERED`: `WBEMSTATUS` = -2147217275;
public const val `WBEM_E_PROVIDER_SUSPENDED`: `WBEMSTATUS` = -2147217279;
public const val `WBEM_E_PROVIDER_TIMED_OUT`: `WBEMSTATUS` = -2147217272;
public const val `WBEM_E_QUALIFIER_NAME_TOO_WIDE`: `WBEMSTATUS` = -2147217290;
public const val `WBEM_E_QUERY_NOT_IMPLEMENTED`: `WBEMSTATUS` = -2147217369;
public const val `WBEM_E_QUEUE_OVERFLOW`: `WBEMSTATUS` = -2147217311;
public const val `WBEM_E_QUOTA_VIOLATION`: `WBEMSTATUS` = -2147217300;
public const val `WBEM_E_READ_ONLY`: `WBEMSTATUS` = -2147217373;
public const val `WBEM_E_REFRESHER_BUSY`: `WBEMSTATUS` = -2147217321;
public const val `WBEM_E_RERUN_COMMAND`: `WBEMSTATUS` = -2147217289;
public const val `WBEM_E_RESERVED_001`: `WBEMSTATUS` = -2147217299;
public const val `WBEM_E_RESERVED_002`: `WBEMSTATUS` = -2147217298;
public const val `WBEM_E_RESOURCE_CONTENTION`: `WBEM_EXTRA_RETURN_CODES` = -2147209214;
public const val `WBEM_E_RETRY_LATER`: `WBEM_EXTRA_RETURN_CODES` = -2147209215;
public const val `WBEM_E_SERVER_TOO_BUSY`: `WBEMSTATUS` = -2147217339;
public const val `WBEM_E_SHUTTING_DOWN`: `WBEMSTATUS` = -2147217357;
public const val `WBEM_E_SYNCHRONIZATION_REQUIRED`: `WBEMSTATUS` = -2147217278;
public const val `WBEM_E_SYSTEM_PROPERTY`: `WBEMSTATUS` = -2147217360;
public const val `WBEM_E_TIMED_OUT`: `WBEMSTATUS` = -2147217303;
public const val `WBEM_E_TOO_MANY_PROPERTIES`: `WBEMSTATUS` = -2147217327;
public const val `WBEM_E_TOO_MUCH_DATA`: `WBEMSTATUS` = -2147217340;
public const val `WBEM_E_TRANSPORT_FAILURE`: `WBEMSTATUS` = -2147217387;
public const val `WBEM_E_TYPE_MISMATCH`: `WBEMSTATUS` = -2147217403;
public const val `WBEM_E_UNEXPECTED`: `WBEMSTATUS` = -2147217379;
public const val `WBEM_E_UNINTERPRETABLE_PROVIDER_QUERY`: `WBEMSTATUS` = -2147217313;
public const val `WBEM_E_UNKNOWN_OBJECT_TYPE`: `WBEMSTATUS` = -2147217346;
public const val `WBEM_E_UNKNOWN_PACKET_TYPE`: `WBEMSTATUS` = -2147217345;
public const val `WBEM_E_UNPARSABLE_QUERY`: `WBEMSTATUS` = -2147217320;
public const val `WBEM_E_UNSUPPORTED_CLASS_UPDATE`: `WBEMSTATUS` = -2147217336;
public const val `WBEM_E_UNSUPPORTED_LOCALE`: `WBEMSTATUS` = -2147217297;
public const val `WBEM_E_UNSUPPORTED_PARAMETER`: `WBEMSTATUS` = -2147217355;
public const val `WBEM_E_UNSUPPORTED_PUT_EXTENSION`: `WBEMSTATUS` = -2147217347;
public const val `WBEM_E_UPDATE_OVERRIDE_NOT_ALLOWED`: `WBEMSTATUS` = -2147217325;
public const val `WBEM_E_UPDATE_PROPAGATED_METHOD`: `WBEMSTATUS` = -2147217324;
public const val `WBEM_E_UPDATE_TYPE_MISMATCH`: `WBEMSTATUS` = -2147217326;
public const val `WBEM_E_VALUE_OUT_OF_RANGE`: `WBEMSTATUS` = -2147217365;
public const val `WBEM_E_VETO_DELETE`: `WBEMSTATUS` = -2147217287;
public const val `WBEM_E_VETO_PUT`: `WBEMSTATUS` = -2147217286;
public const val `WBEM_FLAG_ADVISORY`: `WBEM_CHANGE_FLAG_TYPE` = 65536;
public const val `WBEM_FLAG_ALLOW_READ`: `WBEM_LOCKING_FLAG_TYPE` = 1;
public const val `WBEM_FLAG_ALWAYS`: `WBEM_CONDITION_FLAG_TYPE` = 0;
public const val `WBEM_FLAG_AUTORECOVER`: `WBEM_COMPILER_OPTIONS` = 2;
public const val `WBEM_FLAG_BACKUP_RESTORE_DEFAULT`: `WBEM_BACKUP_RESTORE_FLAGS` = 0;
public const val `WBEM_FLAG_BACKUP_RESTORE_FORCE_SHUTDOWN`: `WBEM_BACKUP_RESTORE_FLAGS` = 1;
public const val `WBEM_FLAG_BATCH_IF_NEEDED`: `WBEM_BATCH_TYPE` = 0;
public const val `WBEM_FLAG_BIDIRECTIONAL`: `WBEM_GENERIC_FLAG_TYPE` = 0;
public const val `WBEM_FLAG_CHECK_ONLY`: `WBEM_COMPILER_OPTIONS` = 1;
public const val `WBEM_FLAG_CLASS_LOCAL_AND_OVERRIDES`: `WBEM_CONDITION_FLAG_TYPE` = 512;
public const val `WBEM_FLAG_CLASS_OVERRIDES_ONLY`: `WBEM_CONDITION_FLAG_TYPE` = 256;
public const val `WBEM_FLAG_CONNECT_PROVIDERS`: `WBEM_CONNECT_OPTIONS` = 256;
public const val `WBEM_FLAG_CONNECT_REPOSITORY_ONLY`: `WBEM_CONNECT_OPTIONS` = 64;
public const val `WBEM_FLAG_CONNECT_USE_MAX_WAIT`: `WBEM_CONNECT_OPTIONS` = 128;
public const val `WBEM_FLAG_CONSOLE_PRINT`: `WBEM_COMPILER_OPTIONS` = 8;
public const val `WBEM_FLAG_CREATE_ONLY`: `WBEM_CHANGE_FLAG_TYPE` = 2;
public const val `WBEM_FLAG_CREATE_OR_UPDATE`: `WBEM_CHANGE_FLAG_TYPE` = 0;
public const val `WBEM_FLAG_DEEP`: `WBEM_QUERY_FLAG_TYPE` = 0;
public const val `WBEM_FLAG_DIRECT_READ`: `WBEM_GENERIC_FLAG_TYPE` = 512;
public const val `WBEM_FLAG_DONT_ADD_TO_LIST`: `WBEM_COMPILER_OPTIONS` = 16;
public const val `WBEM_FLAG_DONT_SEND_STATUS`: `WBEM_GENERIC_FLAG_TYPE` = 0;
public const val `WBEM_FLAG_ENSURE_LOCATABLE`: `WBEM_GENERIC_FLAG_TYPE` = 256;
public const val `WBEM_FLAG_EXCLUDE_OBJECT_QUALIFIERS`: `WBEM_LIMITATION_FLAG_TYPE` = 16;
public const val `WBEM_FLAG_EXCLUDE_PROPERTY_QUALIFIERS`: `WBEM_LIMITATION_FLAG_TYPE` = 32;
public const val `WBEM_FLAG_FORWARD_ONLY`: `WBEM_GENERIC_FLAG_TYPE` = 32;
public const val `WBEM_FLAG_IGNORE_CASE`: `WBEM_COMPARISON_FLAG` = 16;
public const val `WBEM_FLAG_IGNORE_CLASS`: `WBEM_COMPARISON_FLAG` = 8;
public const val `WBEM_FLAG_IGNORE_DEFAULT_VALUES`: `WBEM_COMPARISON_FLAG` = 4;
public const val `WBEM_FLAG_IGNORE_FLAVOR`: `WBEM_COMPARISON_FLAG` = 32;
public const val `WBEM_FLAG_IGNORE_OBJECT_SOURCE`: `WBEM_COMPARISON_FLAG` = 2;
public const val `WBEM_FLAG_IGNORE_QUALIFIERS`: `WBEM_COMPARISON_FLAG` = 1;
public const val `WBEM_FLAG_INPROC_LOGIN`: `WBEM_LOGIN_TYPE` = 0;
public const val `WBEM_FLAG_KEYS_ONLY`: `WBEM_CONDITION_FLAG_TYPE` = 4;
public const val `WBEM_FLAG_LOCAL_LOGIN`: `WBEM_LOGIN_TYPE` = 1;
public const val `WBEM_FLAG_LOCAL_ONLY`: `WBEM_CONDITION_FLAG_TYPE` = 16;
public const val `WBEM_FLAG_LONG_NAME`: `WBEM_INFORMATION_FLAG_TYPE` = 2;
public const val `WBEM_FLAG_MUST_BATCH`: `WBEM_BATCH_TYPE` = 1;
public const val `WBEM_FLAG_MUST_NOT_BATCH`: `WBEM_BATCH_TYPE` = 2;
public const val `WBEM_FLAG_NONSYSTEM_ONLY`: `WBEM_CONDITION_FLAG_TYPE` = 64;
public const val `WBEM_FLAG_NO_ERROR_OBJECT`: `WBEM_GENERIC_FLAG_TYPE` = 64;
public const val `WBEM_FLAG_NO_FLAVORS`: `WBEM_TEXT_FLAG_TYPE` = 1;
public const val `WBEM_FLAG_ONLY_IF_FALSE`: `WBEM_CONDITION_FLAG_TYPE` = 2;
public const val `WBEM_FLAG_ONLY_IF_IDENTICAL`: `WBEM_CONDITION_FLAG_TYPE` = 3;
public const val `WBEM_FLAG_ONLY_IF_TRUE`: `WBEM_CONDITION_FLAG_TYPE` = 1;
public const val `WBEM_FLAG_OWNER_UPDATE`: `WBEM_PROVIDER_FLAGS` = 65536;
public const val `WBEM_FLAG_PROPAGATED_ONLY`: `WBEM_CONDITION_FLAG_TYPE` = 32;
public const val `WBEM_FLAG_PROTOTYPE`: `WBEM_QUERY_FLAG_TYPE` = 2;
public const val `WBEM_FLAG_REFRESH_AUTO_RECONNECT`: `WBEM_REFRESHER_FLAGS` = 0;
public const val `WBEM_FLAG_REFRESH_NO_AUTO_RECONNECT`: `WBEM_REFRESHER_FLAGS` = 1;
public const val `WBEM_FLAG_REFS_ONLY`: `WBEM_CONDITION_FLAG_TYPE` = 8;
public const val `WBEM_FLAG_REMOTE_LOGIN`: `WBEM_LOGIN_TYPE` = 2;
public const val `WBEM_FLAG_RETURN_ERROR_OBJECT`: `WBEM_GENERIC_FLAG_TYPE` = 0;
public const val `WBEM_FLAG_RETURN_IMMEDIATELY`: `WBEM_GENERIC_FLAG_TYPE` = 16;
public const val `WBEM_FLAG_RETURN_WBEM_COMPLETE`: `WBEM_GENERIC_FLAG_TYPE` = 0;
public const val `WBEM_FLAG_SEND_ONLY_SELECTED`: `WBEM_GENERIC_FLAG_TYPE` = 0;
public const val `WBEM_FLAG_SEND_STATUS`: `WBEM_GENERIC_FLAG_TYPE` = 128;
public const val `WBEM_FLAG_SHALLOW`: `WBEM_QUERY_FLAG_TYPE` = 1;
public const val `WBEM_FLAG_SHORT_NAME`: `WBEM_INFORMATION_FLAG_TYPE` = 1;
public const val `WBEM_FLAG_SPLIT_FILES`: `WBEM_COMPILER_OPTIONS` = 32;
public const val `WBEM_FLAG_STORE_FILE`: `WBEM_COMPILER_OPTIONS` = 256;
public const val `WBEM_FLAG_STRONG_VALIDATION`: `WBEM_GENERIC_FLAG_TYPE` = 1048576;
public const val `WBEM_FLAG_SYSTEM_ONLY`: `WBEM_CONDITION_FLAG_TYPE` = 48;
public const val `WBEM_FLAG_UNSECAPP_CHECK_ACCESS`: `WBEM_UNSECAPP_FLAG_TYPE` = 1;
public const val `WBEM_FLAG_UNSECAPP_DEFAULT_CHECK_ACCESS`: `WBEM_UNSECAPP_FLAG_TYPE` = 0;
public const val `WBEM_FLAG_UNSECAPP_DONT_CHECK_ACCESS`: `WBEM_UNSECAPP_FLAG_TYPE` = 2;
public const val `WBEM_FLAG_UPDATE_COMPATIBLE`: `WBEM_CHANGE_FLAG_TYPE` = 0;
public const val `WBEM_FLAG_UPDATE_FORCE_MODE`: `WBEM_CHANGE_FLAG_TYPE` = 64;
public const val `WBEM_FLAG_UPDATE_ONLY`: `WBEM_CHANGE_FLAG_TYPE` = 1;
public const val `WBEM_FLAG_UPDATE_SAFE_MODE`: `WBEM_CHANGE_FLAG_TYPE` = 32;
public const val `WBEM_FLAG_USE_AMENDED_QUALIFIERS`: `WBEM_GENERIC_FLAG_TYPE` = 131072;
public const val `WBEM_FLAG_USE_MULTIPLE_CHALLENGES`: `WBEM_LOGIN_TYPE` = 16;
public const val `WBEM_FLAG_WMI_CHECK`: `WBEM_COMPILER_OPTIONS` = 4;
public const val `WBEM_FLAVOR_AMENDED`: `WBEM_FLAVOR_TYPE` = 128;
public const val `WBEM_FLAVOR_DONT_PROPAGATE`: `WBEM_FLAVOR_TYPE` = 0;
public const val `WBEM_FLAVOR_FLAG_PROPAGATE_TO_DERIVED_CLASS`: `WBEM_FLAVOR_TYPE` = 2;
public const val `WBEM_FLAVOR_FLAG_PROPAGATE_TO_INSTANCE`: `WBEM_FLAVOR_TYPE` = 1;
public const val `WBEM_FLAVOR_MASK_AMENDED`: `WBEM_FLAVOR_TYPE` = 128;
public const val `WBEM_FLAVOR_MASK_ORIGIN`: `WBEM_FLAVOR_TYPE` = 96;
public const val `WBEM_FLAVOR_MASK_PERMISSIONS`: `WBEM_FLAVOR_TYPE` = 16;
public const val `WBEM_FLAVOR_MASK_PROPAGATION`: `WBEM_FLAVOR_TYPE` = 15;
public const val `WBEM_FLAVOR_NOT_AMENDED`: `WBEM_FLAVOR_TYPE` = 0;
public const val `WBEM_FLAVOR_NOT_OVERRIDABLE`: `WBEM_FLAVOR_TYPE` = 16;
public const val `WBEM_FLAVOR_ORIGIN_LOCAL`: `WBEM_FLAVOR_TYPE` = 0;
public const val `WBEM_FLAVOR_ORIGIN_PROPAGATED`: `WBEM_FLAVOR_TYPE` = 32;
public const val `WBEM_FLAVOR_ORIGIN_SYSTEM`: `WBEM_FLAVOR_TYPE` = 64;
public const val `WBEM_FLAVOR_OVERRIDABLE`: `WBEM_FLAVOR_TYPE` = 0;
public typealias `WBEM_FLAVOR_TYPE` = Int;
public const val `WBEM_FULL_WRITE_REP`: `WBEM_SECURITY_FLAGS` = 4;
public typealias `WBEM_GENERIC_FLAG_TYPE` = Int;
public const val `WBEM_GENUS_CLASS`: `WBEM_GENUS_TYPE` = 1;
public const val `WBEM_GENUS_INSTANCE`: `WBEM_GENUS_TYPE` = 2;
public typealias `WBEM_GENUS_TYPE` = Int;
public typealias `WBEM_GET_KEY_FLAGS` = Int;
public typealias `WBEM_GET_TEXT_FLAGS` = Int;
public const val `WBEM_INFINITE`: Int = -1;
public typealias `WBEM_INFORMATION_FLAG_TYPE` = Int;
public typealias `WBEM_LIMITATION_FLAG_TYPE` = Int;
public typealias `WBEM_LIMITS` = Int;
public typealias `WBEM_LOCKING_FLAG_TYPE` = Int;
public typealias `WBEM_LOGIN_TYPE` = Int;
public const val `WBEM_MASK_CLASS_CONDITION`: `WBEM_CONDITION_FLAG_TYPE` = 768;
public const val `WBEM_MASK_CONDITION_ORIGIN`: `WBEM_CONDITION_FLAG_TYPE` = 112;
public const val `WBEM_MASK_PRIMARY_CONDITION`: `WBEM_CONDITION_FLAG_TYPE` = 3;
public const val `WBEM_MASK_RESERVED_FLAGS`: `WBEM_GENERIC_FLAG_TYPE` = 126976;
public const val `WBEM_MASK_UPDATE_MODE`: `WBEM_CHANGE_FLAG_TYPE` = 96;
public const val `WBEM_MAX_IDENTIFIER`: `WBEM_LIMITS` = 4096;
public const val `WBEM_MAX_OBJECT_NESTING`: `WBEM_LIMITS` = 64;
public const val `WBEM_MAX_PATH`: `WBEM_LIMITS` = 8192;
public const val `WBEM_MAX_QUERY`: `WBEM_LIMITS` = 16384;
public const val `WBEM_MAX_USER_PROPERTIES`: `WBEM_LIMITS` = 1024;
public const val `WBEM_METHOD_EXECUTE`: `WBEM_SECURITY_FLAGS` = 2;
public const val `WBEM_NO_ERROR`: `WBEMSTATUS` = 0;
public const val `WBEM_NO_WAIT`: Int = 0;
public const val `WBEM_PARTIAL_WRITE_REP`: `WBEM_SECURITY_FLAGS` = 8;
public typealias `WBEM_PATH_CREATE_FLAG` = Int;
public typealias `WBEM_PATH_STATUS_FLAG` = Int;
public typealias `WBEM_PROVIDER_FLAGS` = Int;
public typealias `WBEM_PROVIDER_REQUIREMENTS_TYPE` = Int;
public typealias `WBEM_QUERY_FLAG_TYPE` = Int;
public typealias `WBEM_REFRESHER_FLAGS` = Int;
public const val `WBEM_REMOTE_ACCESS`: `WBEM_SECURITY_FLAGS` = 32;
public const val `WBEM_REQUIREMENTS_RECHECK_SUBSCRIPTIONS`: `WBEM_PROVIDER_REQUIREMENTS_TYPE` = 2;
public const val `WBEM_REQUIREMENTS_START_POSTFILTER`: `WBEM_PROVIDER_REQUIREMENTS_TYPE` = 0;
public const val `WBEM_REQUIREMENTS_STOP_POSTFILTER`: `WBEM_PROVIDER_REQUIREMENTS_TYPE` = 1;
public const val `WBEM_RETURN_IMMEDIATELY`: `WBEM_GENERIC_FLAG_TYPE` = 16;
public const val `WBEM_RETURN_WHEN_COMPLETE`: `WBEM_GENERIC_FLAG_TYPE` = 0;
public const val `WBEM_RIGHT_PUBLISH`: `WBEM_SECURITY_FLAGS` = 128;
public const val `WBEM_RIGHT_SUBSCRIBE`: `WBEM_SECURITY_FLAGS` = 64;
public typealias `WBEM_SECURITY_FLAGS` = Int;
public typealias `WBEM_SHUTDOWN_FLAGS` = Int;
public const val `WBEM_SHUTDOWN_OS`: `WBEM_SHUTDOWN_FLAGS` = 3;
public const val `WBEM_SHUTDOWN_UNLOAD_COMPONENT`: `WBEM_SHUTDOWN_FLAGS` = 1;
public const val `WBEM_SHUTDOWN_WMI`: `WBEM_SHUTDOWN_FLAGS` = 2;
public const val `WBEM_STATUS_COMPLETE`: `WBEM_STATUS_TYPE` = 0;
public const val `WBEM_STATUS_LOGGING_INFORMATION`: `WBEM_STATUS_TYPE` = 256;
public const val `WBEM_STATUS_LOGGING_INFORMATION_ESS`: `WBEM_STATUS_TYPE` = 4096;
public const val `WBEM_STATUS_LOGGING_INFORMATION_HOST`: `WBEM_STATUS_TYPE` = 1024;
public const val `WBEM_STATUS_LOGGING_INFORMATION_PROVIDER`: `WBEM_STATUS_TYPE` = 512;
public const val `WBEM_STATUS_LOGGING_INFORMATION_REPOSITORY`: `WBEM_STATUS_TYPE` = 2048;
public const val `WBEM_STATUS_PROGRESS`: `WBEM_STATUS_TYPE` = 2;
public const val `WBEM_STATUS_REQUIREMENTS`: `WBEM_STATUS_TYPE` = 1;
public typealias `WBEM_STATUS_TYPE` = Int;
public const val `WBEM_S_ACCESS_DENIED`: `WBEMSTATUS` = 262153;
public const val `WBEM_S_ALREADY_EXISTS`: `WBEMSTATUS` = 262145;
public const val `WBEM_S_DIFFERENT`: `WBEMSTATUS` = 262147;
public const val `WBEM_S_DUPLICATE_OBJECTS`: `WBEMSTATUS` = 262152;
public const val `WBEM_S_FALSE`: `WBEMSTATUS` = 1;
public const val `WBEM_S_INDIRECTLY_UPDATED`: `WBEM_EXTRA_RETURN_CODES` = 274434;
public const val `WBEM_S_INITIALIZED`: `WBEM_EXTRA_RETURN_CODES` = 0;
public const val `WBEM_S_LIMITED_SERVICE`: `WBEM_EXTRA_RETURN_CODES` = 274433;
public const val `WBEM_S_NO_ERROR`: `WBEMSTATUS` = 0;
public const val `WBEM_S_NO_MORE_DATA`: `WBEMSTATUS` = 262149;
public const val `WBEM_S_OPERATION_CANCELLED`: `WBEMSTATUS` = 262150;
public const val `WBEM_S_PARTIAL_RESULTS`: `WBEMSTATUS` = 262160;
public const val `WBEM_S_PENDING`: `WBEMSTATUS` = 262151;
public const val `WBEM_S_RESET_TO_DEFAULT`: `WBEMSTATUS` = 262146;
public const val `WBEM_S_SAME`: `WBEMSTATUS` = 0;
public const val `WBEM_S_SOURCE_NOT_AVAILABLE`: `WBEMSTATUS` = 262167;
public const val `WBEM_S_SUBJECT_TO_SDS`: `WBEM_EXTRA_RETURN_CODES` = 274435;
public const val `WBEM_S_TIMEDOUT`: `WBEMSTATUS` = 262148;
public typealias `WBEM_TEXT_FLAG_TYPE` = Int;
public typealias `WBEM_UNSECAPP_FLAG_TYPE` = Int;
public const val `WBEM_WRITE_PROVIDER`: `WBEM_SECURITY_FLAGS` = 16;
// UNSUPPORTED Rust 2470:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMIExtension: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf0975afe_5c7f_11d2_8b74_00104b2afb41);

public const val `WMIQ_ANALYSIS_ASSOC_QUERY`: `WMIQ_ANALYSIS_TYPE` = 2;
public const val `WMIQ_ANALYSIS_PROP_ANALYSIS_MATRIX`: `WMIQ_ANALYSIS_TYPE` = 3;
public const val `WMIQ_ANALYSIS_QUERY_TEXT`: `WMIQ_ANALYSIS_TYPE` = 4;
public const val `WMIQ_ANALYSIS_RESERVED`: `WMIQ_ANALYSIS_TYPE` = 134217728;
public const val `WMIQ_ANALYSIS_RPN_SEQUENCE`: `WMIQ_ANALYSIS_TYPE` = 1;
public typealias `WMIQ_ANALYSIS_TYPE` = Int;
public const val `WMIQ_ASSOCQ_ASSOCCLASS`: `WMIQ_ASSOCQ_FLAGS` = 8;
public const val `WMIQ_ASSOCQ_ASSOCIATORS`: `WMIQ_ASSOCQ_FLAGS` = 1;
public const val `WMIQ_ASSOCQ_CLASSDEFSONLY`: `WMIQ_ASSOCQ_FLAGS` = 256;
public const val `WMIQ_ASSOCQ_CLASSREFSONLY`: `WMIQ_ASSOCQ_FLAGS` = 2048;
public typealias `WMIQ_ASSOCQ_FLAGS` = Int;
public const val `WMIQ_ASSOCQ_KEYSONLY`: `WMIQ_ASSOCQ_FLAGS` = 512;
public const val `WMIQ_ASSOCQ_REFERENCES`: `WMIQ_ASSOCQ_FLAGS` = 2;
public const val `WMIQ_ASSOCQ_REQUIREDASSOCQUALIFIER`: `WMIQ_ASSOCQ_FLAGS` = 128;
public const val `WMIQ_ASSOCQ_REQUIREDQUALIFIER`: `WMIQ_ASSOCQ_FLAGS` = 64;
public const val `WMIQ_ASSOCQ_RESULTCLASS`: `WMIQ_ASSOCQ_FLAGS` = 4;
public const val `WMIQ_ASSOCQ_RESULTROLE`: `WMIQ_ASSOCQ_FLAGS` = 32;
public const val `WMIQ_ASSOCQ_ROLE`: `WMIQ_ASSOCQ_FLAGS` = 16;
public const val `WMIQ_ASSOCQ_SCHEMAONLY`: `WMIQ_ASSOCQ_FLAGS` = 1024;
public typealias `WMIQ_LANGUAGE_FEATURES` = Int;
public const val `WMIQ_LF10_COMPEX_SUBEXPRESSIONS`: `WMIQ_LANGUAGE_FEATURES` = 10;
public const val `WMIQ_LF11_ALIASING`: `WMIQ_LANGUAGE_FEATURES` = 11;
public const val `WMIQ_LF12_GROUP_BY_HAVING`: `WMIQ_LANGUAGE_FEATURES` = 12;
public const val `WMIQ_LF13_WMI_WITHIN`: `WMIQ_LANGUAGE_FEATURES` = 13;
public const val `WMIQ_LF14_SQL_WRITE_OPERATIONS`: `WMIQ_LANGUAGE_FEATURES` = 14;
public const val `WMIQ_LF15_GO`: `WMIQ_LANGUAGE_FEATURES` = 15;
public const val `WMIQ_LF16_SINGLE_LEVEL_TRANSACTIONS`: `WMIQ_LANGUAGE_FEATURES` = 16;
public const val `WMIQ_LF17_QUALIFIED_NAMES`: `WMIQ_LANGUAGE_FEATURES` = 17;
public const val `WMIQ_LF18_ASSOCIATONS`: `WMIQ_LANGUAGE_FEATURES` = 18;
public const val `WMIQ_LF19_SYSTEM_PROPERTIES`: `WMIQ_LANGUAGE_FEATURES` = 19;
public const val `WMIQ_LF1_BASIC_SELECT`: `WMIQ_LANGUAGE_FEATURES` = 1;
public const val `WMIQ_LF20_EXTENDED_SYSTEM_PROPERTIES`: `WMIQ_LANGUAGE_FEATURES` = 20;
public const val `WMIQ_LF21_SQL89_JOINS`: `WMIQ_LANGUAGE_FEATURES` = 21;
public const val `WMIQ_LF22_SQL92_JOINS`: `WMIQ_LANGUAGE_FEATURES` = 22;
public const val `WMIQ_LF23_SUBSELECTS`: `WMIQ_LANGUAGE_FEATURES` = 23;
public const val `WMIQ_LF24_UMI_EXTENSIONS`: `WMIQ_LANGUAGE_FEATURES` = 24;
public const val `WMIQ_LF25_DATEPART`: `WMIQ_LANGUAGE_FEATURES` = 25;
public const val `WMIQ_LF26_LIKE`: `WMIQ_LANGUAGE_FEATURES` = 26;
public const val `WMIQ_LF27_CIM_TEMPORAL_CONSTRUCTS`: `WMIQ_LANGUAGE_FEATURES` = 27;
public const val `WMIQ_LF28_STANDARD_AGGREGATES`: `WMIQ_LANGUAGE_FEATURES` = 28;
public const val `WMIQ_LF29_MULTI_LEVEL_ORDER_BY`: `WMIQ_LANGUAGE_FEATURES` = 29;
public const val `WMIQ_LF2_CLASS_NAME_IN_QUERY`: `WMIQ_LANGUAGE_FEATURES` = 2;
public const val `WMIQ_LF30_WMI_PRAGMAS`: `WMIQ_LANGUAGE_FEATURES` = 30;
public const val `WMIQ_LF31_QUALIFIER_TESTS`: `WMIQ_LANGUAGE_FEATURES` = 31;
public const val `WMIQ_LF32_SP_EXECUTE`: `WMIQ_LANGUAGE_FEATURES` = 32;
public const val `WMIQ_LF33_ARRAY_ACCESS`: `WMIQ_LANGUAGE_FEATURES` = 33;
public const val `WMIQ_LF34_UNION`: `WMIQ_LANGUAGE_FEATURES` = 34;
public const val `WMIQ_LF35_COMPLEX_SELECT_TARGET`: `WMIQ_LANGUAGE_FEATURES` = 35;
public const val `WMIQ_LF36_REFERENCE_TESTS`: `WMIQ_LANGUAGE_FEATURES` = 36;
public const val `WMIQ_LF37_SELECT_INTO`: `WMIQ_LANGUAGE_FEATURES` = 37;
public const val `WMIQ_LF38_BASIC_DATETIME_TESTS`: `WMIQ_LANGUAGE_FEATURES` = 38;
public const val `WMIQ_LF39_COUNT_COLUMN`: `WMIQ_LANGUAGE_FEATURES` = 39;
public const val `WMIQ_LF3_STRING_CASE_FUNCTIONS`: `WMIQ_LANGUAGE_FEATURES` = 3;
public const val `WMIQ_LF40_BETWEEN`: `WMIQ_LANGUAGE_FEATURES` = 40;
public const val `WMIQ_LF4_PROP_TO_PROP_TESTS`: `WMIQ_LANGUAGE_FEATURES` = 4;
public const val `WMIQ_LF5_COUNT_STAR`: `WMIQ_LANGUAGE_FEATURES` = 5;
public const val `WMIQ_LF6_ORDER_BY`: `WMIQ_LANGUAGE_FEATURES` = 6;
public const val `WMIQ_LF7_DISTINCT`: `WMIQ_LANGUAGE_FEATURES` = 7;
public const val `WMIQ_LF8_ISA`: `WMIQ_LANGUAGE_FEATURES` = 8;
public const val `WMIQ_LF9_THIS`: `WMIQ_LANGUAGE_FEATURES` = 9;
public const val `WMIQ_LF_LAST`: `WMIQ_LANGUAGE_FEATURES` = 40;
public const val `WMIQ_RPNF_ARRAY_ACCESS_USED`: `WMIQ_RPNF_FEATURE` = 8192;
public const val `WMIQ_RPNF_COUNT_STAR`: `WMIQ_RPNF_FEATURE` = 64;
public const val `WMIQ_RPNF_EQUALITY_TESTS_ONLY`: `WMIQ_RPNF_FEATURE` = 32;
public typealias `WMIQ_RPNF_FEATURE` = Int;
public const val `WMIQ_RPNF_FEATURE_SELECT_STAR`: `WMIQ_RPNF_FEATURE` = 16;
public const val `WMIQ_RPNF_GROUP_BY_HAVING`: `WMIQ_RPNF_FEATURE` = 4096;
public const val `WMIQ_RPNF_ISA_USED`: `WMIQ_RPNF_FEATURE` = 2048;
public const val `WMIQ_RPNF_ORDER_BY`: `WMIQ_RPNF_FEATURE` = 1024;
public const val `WMIQ_RPNF_PROJECTION`: `WMIQ_RPNF_FEATURE` = 8;
public const val `WMIQ_RPNF_PROP_TO_PROP_TESTS`: `WMIQ_RPNF_FEATURE` = 512;
public const val `WMIQ_RPNF_QUALIFIED_NAMES_USED`: `WMIQ_RPNF_FEATURE` = 128;
public const val `WMIQ_RPNF_QUERY_IS_CONJUNCTIVE`: `WMIQ_RPNF_FEATURE` = 2;
public const val `WMIQ_RPNF_QUERY_IS_DISJUNCTIVE`: `WMIQ_RPNF_FEATURE` = 4;
public const val `WMIQ_RPNF_SYSPROP_CLASS_USED`: `WMIQ_RPNF_FEATURE` = 256;
public const val `WMIQ_RPNF_WHERE_CLAUSE_PRESENT`: `WMIQ_RPNF_FEATURE` = 1;
public const val `WMIQ_RPN_CONST`: `WMIQ_RPN_TOKEN_FLAGS` = 8;
public const val `WMIQ_RPN_CONST2`: `WMIQ_RPN_TOKEN_FLAGS` = 4;
public const val `WMIQ_RPN_FROM_CLASS_LIST`: `WMIQ_RPN_TOKEN_FLAGS` = 4;
public const val `WMIQ_RPN_FROM_MULTIPLE`: `WMIQ_RPN_TOKEN_FLAGS` = 8;
public const val `WMIQ_RPN_FROM_PATH`: `WMIQ_RPN_TOKEN_FLAGS` = 2;
public const val `WMIQ_RPN_FROM_UNARY`: `WMIQ_RPN_TOKEN_FLAGS` = 1;
public const val `WMIQ_RPN_GET_EXPR_SHAPE`: `WMIQ_RPN_TOKEN_FLAGS` = 2;
public const val `WMIQ_RPN_GET_LEFT_FUNCTION`: `WMIQ_RPN_TOKEN_FLAGS` = 3;
public const val `WMIQ_RPN_GET_RELOP`: `WMIQ_RPN_TOKEN_FLAGS` = 5;
public const val `WMIQ_RPN_GET_RIGHT_FUNCTION`: `WMIQ_RPN_TOKEN_FLAGS` = 4;
public const val `WMIQ_RPN_GET_TOKEN_TYPE`: `WMIQ_RPN_TOKEN_FLAGS` = 1;
public const val `WMIQ_RPN_LEFT_FUNCTION`: `WMIQ_RPN_TOKEN_FLAGS` = 32;
public const val `WMIQ_RPN_LEFT_PROPERTY_NAME`: `WMIQ_RPN_TOKEN_FLAGS` = 1;
public const val `WMIQ_RPN_NEXT_TOKEN`: `WMIQ_RPN_TOKEN_FLAGS` = 1;
public const val `WMIQ_RPN_OP_EQ`: `WMIQ_RPN_TOKEN_FLAGS` = 1;
public const val `WMIQ_RPN_OP_GE`: `WMIQ_RPN_TOKEN_FLAGS` = 3;
public const val `WMIQ_RPN_OP_GT`: `WMIQ_RPN_TOKEN_FLAGS` = 6;
public const val `WMIQ_RPN_OP_ISA`: `WMIQ_RPN_TOKEN_FLAGS` = 8;
public const val `WMIQ_RPN_OP_ISNOTA`: `WMIQ_RPN_TOKEN_FLAGS` = 9;
public const val `WMIQ_RPN_OP_ISNOTNULL`: `WMIQ_RPN_TOKEN_FLAGS` = 11;
public const val `WMIQ_RPN_OP_ISNULL`: `WMIQ_RPN_TOKEN_FLAGS` = 10;
public const val `WMIQ_RPN_OP_LE`: `WMIQ_RPN_TOKEN_FLAGS` = 4;
public const val `WMIQ_RPN_OP_LIKE`: `WMIQ_RPN_TOKEN_FLAGS` = 7;
public const val `WMIQ_RPN_OP_LT`: `WMIQ_RPN_TOKEN_FLAGS` = 5;
public const val `WMIQ_RPN_OP_NE`: `WMIQ_RPN_TOKEN_FLAGS` = 2;
public const val `WMIQ_RPN_OP_UNDEFINED`: `WMIQ_RPN_TOKEN_FLAGS` = 0;
public const val `WMIQ_RPN_RELOP`: `WMIQ_RPN_TOKEN_FLAGS` = 16;
public const val `WMIQ_RPN_RIGHT_FUNCTION`: `WMIQ_RPN_TOKEN_FLAGS` = 64;
public const val `WMIQ_RPN_RIGHT_PROPERTY_NAME`: `WMIQ_RPN_TOKEN_FLAGS` = 2;
public const val `WMIQ_RPN_TOKEN_AND`: `WMIQ_RPN_TOKEN_FLAGS` = 2;
public const val `WMIQ_RPN_TOKEN_EXPRESSION`: `WMIQ_RPN_TOKEN_FLAGS` = 1;
public typealias `WMIQ_RPN_TOKEN_FLAGS` = Int;
public const val `WMIQ_RPN_TOKEN_NOT`: `WMIQ_RPN_TOKEN_FLAGS` = 4;
public const val `WMIQ_RPN_TOKEN_OR`: `WMIQ_RPN_TOKEN_FLAGS` = 3;
public typealias `WMI_OBJ_TEXT` = Int;
public const val `WMI_OBJ_TEXT_CIM_DTD_2_0`: `WMI_OBJ_TEXT` = 1;
public const val `WMI_OBJ_TEXT_LAST`: `WMI_OBJ_TEXT` = 13;
public const val `WMI_OBJ_TEXT_WMI_DTD_2_0`: `WMI_OBJ_TEXT` = 2;
public const val `WMI_OBJ_TEXT_WMI_EXT1`: `WMI_OBJ_TEXT` = 3;
public const val `WMI_OBJ_TEXT_WMI_EXT10`: `WMI_OBJ_TEXT` = 12;
public const val `WMI_OBJ_TEXT_WMI_EXT2`: `WMI_OBJ_TEXT` = 4;
public const val `WMI_OBJ_TEXT_WMI_EXT3`: `WMI_OBJ_TEXT` = 5;
public const val `WMI_OBJ_TEXT_WMI_EXT4`: `WMI_OBJ_TEXT` = 6;
public const val `WMI_OBJ_TEXT_WMI_EXT5`: `WMI_OBJ_TEXT` = 7;
public const val `WMI_OBJ_TEXT_WMI_EXT6`: `WMI_OBJ_TEXT` = 8;
public const val `WMI_OBJ_TEXT_WMI_EXT7`: `WMI_OBJ_TEXT` = 9;
public const val `WMI_OBJ_TEXT_WMI_EXT8`: `WMI_OBJ_TEXT` = 10;
public const val `WMI_OBJ_TEXT_WMI_EXT9`: `WMI_OBJ_TEXT` = 11;
// UNSUPPORTED Rust 2595:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WbemAdministrativeLocator: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcb8555cc_9128_11d1_ad9b_00c04fd8fdff);

// UNSUPPORTED Rust 2596:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WbemAuthenticatedLocator: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcd184336_9128_11d1_ad9b_00c04fd8fdff);

public typealias `WbemAuthenticationLevelEnum` = Int;
// UNSUPPORTED Rust 2598:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WbemBackupRestore: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc49e32c6_bc8b_11d2_85d4_00105a1f8304);

public typealias `WbemChangeFlagEnum` = Int;
public typealias `WbemCimtypeEnum` = Int;
// UNSUPPORTED Rust 2601:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WbemClassObject: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9a653086_174f_11d2_b5f9_00104b703efd);

public typealias `WbemComparisonFlagEnum` = Int;
public typealias `WbemConnectOptionsEnum` = Int;
// UNSUPPORTED Rust 2604:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WbemContext: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x674b6698_ee92_11d0_ad71_00c04fd8fdff);

// UNSUPPORTED Rust 2605:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WbemDCOMTransport: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf7ce2e13_8c90_11d1_9e7b_00c04fc324a8);

// UNSUPPORTED Rust 2606:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WbemDecoupledBasicEventProvider: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf5f75737_2843_4f22_933d_c76a97cda62f);

// UNSUPPORTED Rust 2607:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WbemDecoupledRegistrar: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4cfc7932_0f9d_4bef_9c32_8ea2a6b56fcb);

// UNSUPPORTED Rust 2608:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WbemDefPath: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcf4cc405_e2c5_4ddd_b3ce_5e7582d8c9fa);

public typealias `WbemErrorEnum` = Int;
public typealias `WbemFlagEnum` = Int;
public typealias `WbemImpersonationLevelEnum` = Int;
// UNSUPPORTED Rust 2612:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WbemLevel1Login: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8bc3f05e_d86b_11d0_a075_00c04fb68820);

// UNSUPPORTED Rust 2613:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WbemLocalAddrRes: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa1044801_8f7e_11d1_9e7c_00c04fc324a8);

// UNSUPPORTED Rust 2614:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WbemLocator: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4590f811_1d3a_11d0_891f_00aa004b2e24);

public typealias `WbemObjectTextFormatEnum` = Int;
// UNSUPPORTED Rust 2616:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WbemObjectTextSrc: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8d1c559d_84f0_4bb3_a7d5_56a7435a9ba6);

public typealias `WbemPrivilegeEnum` = Int;
// UNSUPPORTED Rust 2618:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WbemQuery: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeac8a024_21e2_4523_ad73_a71a0aa2f56a);

public typealias `WbemQueryFlagEnum` = Int;
// UNSUPPORTED Rust 2620:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WbemRefresher: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc71566f2_561e_11d1_ad87_00c04fd8fdff);

// UNSUPPORTED Rust 2621:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WbemStatusCodeText: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeb87e1bd_3233_11d2_aec9_00c04fb68820);

public typealias `WbemTextFlagEnum` = Int;
public typealias `WbemTimeout` = Int;
// UNSUPPORTED Rust 2624:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WbemUnauthenticatedLocator: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x443e7b79_de31_11d2_b340_00104bcc4b4a);

// UNSUPPORTED Rust 2625:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WbemUninitializedClassObject: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7a0227f6_7108_11d1_ad90_00c04fd8fdff);

public const val `wbemAuthenticationLevelCall`: `WbemAuthenticationLevelEnum` = 3;
public const val `wbemAuthenticationLevelConnect`: `WbemAuthenticationLevelEnum` = 2;
public const val `wbemAuthenticationLevelDefault`: `WbemAuthenticationLevelEnum` = 0;
public const val `wbemAuthenticationLevelNone`: `WbemAuthenticationLevelEnum` = 1;
public const val `wbemAuthenticationLevelPkt`: `WbemAuthenticationLevelEnum` = 4;
public const val `wbemAuthenticationLevelPktIntegrity`: `WbemAuthenticationLevelEnum` = 5;
public const val `wbemAuthenticationLevelPktPrivacy`: `WbemAuthenticationLevelEnum` = 6;
public const val `wbemChangeFlagAdvisory`: `WbemChangeFlagEnum` = 65536;
public const val `wbemChangeFlagCreateOnly`: `WbemChangeFlagEnum` = 2;
public const val `wbemChangeFlagCreateOrUpdate`: `WbemChangeFlagEnum` = 0;
public const val `wbemChangeFlagStrongValidation`: `WbemChangeFlagEnum` = 128;
public const val `wbemChangeFlagUpdateCompatible`: `WbemChangeFlagEnum` = 0;
public const val `wbemChangeFlagUpdateForceMode`: `WbemChangeFlagEnum` = 64;
public const val `wbemChangeFlagUpdateOnly`: `WbemChangeFlagEnum` = 1;
public const val `wbemChangeFlagUpdateSafeMode`: `WbemChangeFlagEnum` = 32;
public const val `wbemCimtypeBoolean`: `WbemCimtypeEnum` = 11;
public const val `wbemCimtypeChar16`: `WbemCimtypeEnum` = 103;
public const val `wbemCimtypeDatetime`: `WbemCimtypeEnum` = 101;
public const val `wbemCimtypeObject`: `WbemCimtypeEnum` = 13;
public const val `wbemCimtypeReal32`: `WbemCimtypeEnum` = 4;
public const val `wbemCimtypeReal64`: `WbemCimtypeEnum` = 5;
public const val `wbemCimtypeReference`: `WbemCimtypeEnum` = 102;
public const val `wbemCimtypeSint16`: `WbemCimtypeEnum` = 2;
public const val `wbemCimtypeSint32`: `WbemCimtypeEnum` = 3;
public const val `wbemCimtypeSint64`: `WbemCimtypeEnum` = 20;
public const val `wbemCimtypeSint8`: `WbemCimtypeEnum` = 16;
public const val `wbemCimtypeString`: `WbemCimtypeEnum` = 8;
public const val `wbemCimtypeUint16`: `WbemCimtypeEnum` = 18;
public const val `wbemCimtypeUint32`: `WbemCimtypeEnum` = 19;
public const val `wbemCimtypeUint64`: `WbemCimtypeEnum` = 21;
public const val `wbemCimtypeUint8`: `WbemCimtypeEnum` = 17;
public const val `wbemComparisonFlagIgnoreCase`: `WbemComparisonFlagEnum` = 16;
public const val `wbemComparisonFlagIgnoreClass`: `WbemComparisonFlagEnum` = 8;
public const val `wbemComparisonFlagIgnoreDefaultValues`: `WbemComparisonFlagEnum` = 4;
public const val `wbemComparisonFlagIgnoreFlavor`: `WbemComparisonFlagEnum` = 32;
public const val `wbemComparisonFlagIgnoreObjectSource`: `WbemComparisonFlagEnum` = 2;
public const val `wbemComparisonFlagIgnoreQualifiers`: `WbemComparisonFlagEnum` = 1;
public const val `wbemComparisonFlagIncludeAll`: `WbemComparisonFlagEnum` = 0;
public const val `wbemConnectFlagUseMaxWait`: `WbemConnectOptionsEnum` = 128;
public const val `wbemErrAccessDenied`: `WbemErrorEnum` = -2147217405;
public const val `wbemErrAggregatingByObject`: `WbemErrorEnum` = -2147217315;
public const val `wbemErrAlreadyExists`: `WbemErrorEnum` = -2147217383;
public const val `wbemErrAmbiguousOperation`: `WbemErrorEnum` = -2147217301;
public const val `wbemErrAmendedObject`: `WbemErrorEnum` = -2147217306;
public const val `wbemErrBackupRestoreWinmgmtRunning`: `WbemErrorEnum` = -2147217312;
public const val `wbemErrBufferTooSmall`: `WbemErrorEnum` = -2147217348;
public const val `wbemErrCallCancelled`: `WbemErrorEnum` = -2147217358;
public const val `wbemErrCannotBeAbstract`: `WbemErrorEnum` = -2147217307;
public const val `wbemErrCannotBeKey`: `WbemErrorEnum` = -2147217377;
public const val `wbemErrCannotBeSingleton`: `WbemErrorEnum` = -2147217364;
public const val `wbemErrCannotChangeIndexInheritance`: `WbemErrorEnum` = -2147217328;
public const val `wbemErrCannotChangeKeyInheritance`: `WbemErrorEnum` = -2147217335;
public const val `wbemErrCircularReference`: `WbemErrorEnum` = -2147217337;
public const val `wbemErrClassHasChildren`: `WbemErrorEnum` = -2147217371;
public const val `wbemErrClassHasInstances`: `WbemErrorEnum` = -2147217370;
public const val `wbemErrClassNameTooWide`: `WbemErrorEnum` = -2147217292;
public const val `wbemErrClientTooSlow`: `WbemErrorEnum` = -2147217305;
public const val `wbemErrConnectionFailed`: `WbemErrorEnum` = -2147217295;
public const val `wbemErrCriticalError`: `WbemErrorEnum` = -2147217398;
public const val `wbemErrDatabaseVerMismatch`: `WbemErrorEnum` = -2147217288;
public const val `wbemErrEncryptedConnectionRequired`: `WbemErrorEnum` = -2147217273;
public const val `wbemErrFailed`: `WbemErrorEnum` = -2147217407;
public const val `wbemErrFatalTransportError`: `WbemErrorEnum` = -2147217274;
public const val `wbemErrForcedRollback`: `WbemErrorEnum` = -2147217298;
public const val `wbemErrHandleOutOfDate`: `WbemErrorEnum` = -2147217296;
public const val `wbemErrIllegalNull`: `WbemErrorEnum` = -2147217368;
public const val `wbemErrIllegalOperation`: `WbemErrorEnum` = -2147217378;
public const val `wbemErrIncompleteClass`: `WbemErrorEnum` = -2147217376;
public const val `wbemErrInitializationFailure`: `WbemErrorEnum` = -2147217388;
public const val `wbemErrInvalidAssociation`: `WbemErrorEnum` = -2147217302;
public const val `wbemErrInvalidCimType`: `WbemErrorEnum` = -2147217363;
public const val `wbemErrInvalidClass`: `WbemErrorEnum` = -2147217392;
public const val `wbemErrInvalidContext`: `WbemErrorEnum` = -2147217401;
public const val `wbemErrInvalidDuplicateParameter`: `WbemErrorEnum` = -2147217341;
public const val `wbemErrInvalidFlavor`: `WbemErrorEnum` = -2147217338;
public const val `wbemErrInvalidHandleRequest`: `WbemErrorEnum` = -2147217294;
public const val `wbemErrInvalidLocale`: `WbemErrorEnum` = -2147217280;
public const val `wbemErrInvalidMethod`: `WbemErrorEnum` = -2147217362;
public const val `wbemErrInvalidMethodParameters`: `WbemErrorEnum` = -2147217361;
public const val `wbemErrInvalidNamespace`: `WbemErrorEnum` = -2147217394;
public const val `wbemErrInvalidObject`: `WbemErrorEnum` = -2147217393;
public const val `wbemErrInvalidObjectPath`: `WbemErrorEnum` = -2147217350;
public const val `wbemErrInvalidOperation`: `WbemErrorEnum` = -2147217386;
public const val `wbemErrInvalidOperator`: `WbemErrorEnum` = -2147217309;
public const val `wbemErrInvalidParameter`: `WbemErrorEnum` = -2147217400;
public const val `wbemErrInvalidParameterId`: `WbemErrorEnum` = -2147217353;
public const val `wbemErrInvalidProperty`: `WbemErrorEnum` = -2147217359;
public const val `wbemErrInvalidPropertyType`: `WbemErrorEnum` = -2147217366;
public const val `wbemErrInvalidProviderRegistration`: `WbemErrorEnum` = -2147217390;
public const val `wbemErrInvalidQualifier`: `WbemErrorEnum` = -2147217342;
public const val `wbemErrInvalidQualifierType`: `WbemErrorEnum` = -2147217367;
public const val `wbemErrInvalidQuery`: `WbemErrorEnum` = -2147217385;
public const val `wbemErrInvalidQueryType`: `WbemErrorEnum` = -2147217384;
public const val `wbemErrInvalidStream`: `WbemErrorEnum` = -2147217397;
public const val `wbemErrInvalidSuperclass`: `WbemErrorEnum` = -2147217395;
public const val `wbemErrInvalidSyntax`: `WbemErrorEnum` = -2147217375;
public const val `wbemErrLocalCredentials`: `WbemErrorEnum` = -2147217308;
public const val `wbemErrMarshalInvalidSignature`: `WbemErrorEnum` = -2147217343;
public const val `wbemErrMarshalVersionMismatch`: `WbemErrorEnum` = -2147217344;
public const val `wbemErrMethodDisabled`: `WbemErrorEnum` = -2147217322;
public const val `wbemErrMethodNameTooWide`: `WbemErrorEnum` = -2147217291;
public const val `wbemErrMethodNotImplemented`: `WbemErrorEnum` = -2147217323;
public const val `wbemErrMissingAggregationList`: `WbemErrorEnum` = -2147217317;
public const val `wbemErrMissingGroupWithin`: `WbemErrorEnum` = -2147217318;
public const val `wbemErrMissingParameter`: `WbemErrorEnum` = -2147217354;
public const val `wbemErrNoSchema`: `WbemErrorEnum` = -2147217277;
public const val `wbemErrNonConsecutiveParameterIds`: `WbemErrorEnum` = -2147217352;
public const val `wbemErrNondecoratedObject`: `WbemErrorEnum` = -2147217374;
public const val `wbemErrNotAvailable`: `WbemErrorEnum` = -2147217399;
public const val `wbemErrNotEventClass`: `WbemErrorEnum` = -2147217319;
public const val `wbemErrNotFound`: `WbemErrorEnum` = -2147217406;
public const val `wbemErrNotSupported`: `WbemErrorEnum` = -2147217396;
public const val `wbemErrNullSecurityDescriptor`: `WbemErrorEnum` = -2147217304;
public const val `wbemErrOutOfDiskSpace`: `WbemErrorEnum` = -2147217349;
public const val `wbemErrOutOfMemory`: `WbemErrorEnum` = -2147217402;
public const val `wbemErrOverrideNotAllowed`: `WbemErrorEnum` = -2147217382;
public const val `wbemErrParameterIdOnRetval`: `WbemErrorEnum` = -2147217351;
public const val `wbemErrPrivilegeNotHeld`: `WbemErrorEnum` = -2147217310;
public const val `wbemErrPropagatedMethod`: `WbemErrorEnum` = -2147217356;
public const val `wbemErrPropagatedProperty`: `WbemErrorEnum` = -2147217380;
public const val `wbemErrPropagatedQualifier`: `WbemErrorEnum` = -2147217381;
public const val `wbemErrPropertyNameTooWide`: `WbemErrorEnum` = -2147217293;
public const val `wbemErrPropertyNotAnObject`: `WbemErrorEnum` = -2147217316;
public const val `wbemErrProviderAlreadyRegistered`: `WbemErrorEnum` = -2147217276;
public const val `wbemErrProviderFailure`: `WbemErrorEnum` = -2147217404;
public const val `wbemErrProviderLoadFailure`: `WbemErrorEnum` = -2147217389;
public const val `wbemErrProviderNotCapable`: `WbemErrorEnum` = -2147217372;
public const val `wbemErrProviderNotFound`: `WbemErrorEnum` = -2147217391;
public const val `wbemErrProviderNotRegistered`: `WbemErrorEnum` = -2147217275;
public const val `wbemErrProviderSuspended`: `WbemErrorEnum` = -2147217279;
public const val `wbemErrQualifierNameTooWide`: `WbemErrorEnum` = -2147217290;
public const val `wbemErrQueryNotImplemented`: `WbemErrorEnum` = -2147217369;
public const val `wbemErrQueueOverflow`: `WbemErrorEnum` = -2147217311;
public const val `wbemErrQuotaViolation`: `WbemErrorEnum` = -2147217300;
public const val `wbemErrReadOnly`: `WbemErrorEnum` = -2147217373;
public const val `wbemErrRefresherBusy`: `WbemErrorEnum` = -2147217321;
public const val `wbemErrRegistrationTooBroad`: `WbemErrorEnum` = -2147213311;
public const val `wbemErrRegistrationTooPrecise`: `WbemErrorEnum` = -2147213310;
public const val `wbemErrRerunCommand`: `WbemErrorEnum` = -2147217289;
public const val `wbemErrResetToDefault`: `WbemErrorEnum` = -2147209214;
public const val `wbemErrServerTooBusy`: `WbemErrorEnum` = -2147217339;
public const val `wbemErrShuttingDown`: `WbemErrorEnum` = -2147217357;
public const val `wbemErrSynchronizationRequired`: `WbemErrorEnum` = -2147217278;
public const val `wbemErrSystemProperty`: `WbemErrorEnum` = -2147217360;
public const val `wbemErrTimedout`: `WbemErrorEnum` = -2147209215;
public const val `wbemErrTimeout`: `WbemErrorEnum` = -2147217303;
public const val `wbemErrTooManyProperties`: `WbemErrorEnum` = -2147217327;
public const val `wbemErrTooMuchData`: `WbemErrorEnum` = -2147217340;
public const val `wbemErrTransactionConflict`: `WbemErrorEnum` = -2147217299;
public const val `wbemErrTransportFailure`: `WbemErrorEnum` = -2147217387;
public const val `wbemErrTypeMismatch`: `WbemErrorEnum` = -2147217403;
public const val `wbemErrUnexpected`: `WbemErrorEnum` = -2147217379;
public const val `wbemErrUninterpretableProviderQuery`: `WbemErrorEnum` = -2147217313;
public const val `wbemErrUnknownObjectType`: `WbemErrorEnum` = -2147217346;
public const val `wbemErrUnknownPacketType`: `WbemErrorEnum` = -2147217345;
public const val `wbemErrUnparsableQuery`: `WbemErrorEnum` = -2147217320;
public const val `wbemErrUnsupportedClassUpdate`: `WbemErrorEnum` = -2147217336;
public const val `wbemErrUnsupportedLocale`: `WbemErrorEnum` = -2147217297;
public const val `wbemErrUnsupportedParameter`: `WbemErrorEnum` = -2147217355;
public const val `wbemErrUnsupportedPutExtension`: `WbemErrorEnum` = -2147217347;
public const val `wbemErrUpdateOverrideNotAllowed`: `WbemErrorEnum` = -2147217325;
public const val `wbemErrUpdatePropagatedMethod`: `WbemErrorEnum` = -2147217324;
public const val `wbemErrUpdateTypeMismatch`: `WbemErrorEnum` = -2147217326;
public const val `wbemErrValueOutOfRange`: `WbemErrorEnum` = -2147217365;
public const val `wbemErrVetoDelete`: `WbemErrorEnum` = -2147217286;
public const val `wbemErrVetoPut`: `WbemErrorEnum` = -2147217287;
public const val `wbemFlagBidirectional`: `WbemFlagEnum` = 0;
public const val `wbemFlagDirectRead`: `WbemFlagEnum` = 512;
public const val `wbemFlagDontSendStatus`: `WbemFlagEnum` = 0;
public const val `wbemFlagEnsureLocatable`: `WbemFlagEnum` = 256;
public const val `wbemFlagForwardOnly`: `WbemFlagEnum` = 32;
public const val `wbemFlagGetDefault`: `WbemFlagEnum` = 0;
public const val `wbemFlagNoErrorObject`: `WbemFlagEnum` = 64;
public const val `wbemFlagReturnErrorObject`: `WbemFlagEnum` = 0;
public const val `wbemFlagReturnImmediately`: `WbemFlagEnum` = 16;
public const val `wbemFlagReturnWhenComplete`: `WbemFlagEnum` = 0;
public const val `wbemFlagSendOnlySelected`: `WbemFlagEnum` = 0;
public const val `wbemFlagSendStatus`: `WbemFlagEnum` = 128;
public const val `wbemFlagSpawnInstance`: `WbemFlagEnum` = 1;
public const val `wbemFlagUseAmendedQualifiers`: `WbemFlagEnum` = 131072;
public const val `wbemFlagUseCurrentTime`: `WbemFlagEnum` = 1;
public const val `wbemImpersonationLevelAnonymous`: `WbemImpersonationLevelEnum` = 1;
public const val `wbemImpersonationLevelDelegate`: `WbemImpersonationLevelEnum` = 4;
public const val `wbemImpersonationLevelIdentify`: `WbemImpersonationLevelEnum` = 2;
public const val `wbemImpersonationLevelImpersonate`: `WbemImpersonationLevelEnum` = 3;
public const val `wbemNoErr`: `WbemErrorEnum` = 0;
public const val `wbemObjectTextFormatCIMDTD20`: `WbemObjectTextFormatEnum` = 1;
public const val `wbemObjectTextFormatWMIDTD20`: `WbemObjectTextFormatEnum` = 2;
public const val `wbemPrivilegeAudit`: `WbemPrivilegeEnum` = 20;
public const val `wbemPrivilegeBackup`: `WbemPrivilegeEnum` = 16;
public const val `wbemPrivilegeChangeNotify`: `WbemPrivilegeEnum` = 22;
public const val `wbemPrivilegeCreatePagefile`: `WbemPrivilegeEnum` = 14;
public const val `wbemPrivilegeCreatePermanent`: `WbemPrivilegeEnum` = 15;
public const val `wbemPrivilegeCreateToken`: `WbemPrivilegeEnum` = 1;
public const val `wbemPrivilegeDebug`: `WbemPrivilegeEnum` = 19;
public const val `wbemPrivilegeEnableDelegation`: `WbemPrivilegeEnum` = 26;
public const val `wbemPrivilegeIncreaseBasePriority`: `WbemPrivilegeEnum` = 13;
public const val `wbemPrivilegeIncreaseQuota`: `WbemPrivilegeEnum` = 4;
public const val `wbemPrivilegeLoadDriver`: `WbemPrivilegeEnum` = 9;
public const val `wbemPrivilegeLockMemory`: `WbemPrivilegeEnum` = 3;
public const val `wbemPrivilegeMachineAccount`: `WbemPrivilegeEnum` = 5;
public const val `wbemPrivilegeManageVolume`: `WbemPrivilegeEnum` = 27;
public const val `wbemPrivilegePrimaryToken`: `WbemPrivilegeEnum` = 2;
public const val `wbemPrivilegeProfileSingleProcess`: `WbemPrivilegeEnum` = 12;
public const val `wbemPrivilegeRemoteShutdown`: `WbemPrivilegeEnum` = 23;
public const val `wbemPrivilegeRestore`: `WbemPrivilegeEnum` = 17;
public const val `wbemPrivilegeSecurity`: `WbemPrivilegeEnum` = 7;
public const val `wbemPrivilegeShutdown`: `WbemPrivilegeEnum` = 18;
public const val `wbemPrivilegeSyncAgent`: `WbemPrivilegeEnum` = 25;
public const val `wbemPrivilegeSystemEnvironment`: `WbemPrivilegeEnum` = 21;
public const val `wbemPrivilegeSystemProfile`: `WbemPrivilegeEnum` = 10;
public const val `wbemPrivilegeSystemtime`: `WbemPrivilegeEnum` = 11;
public const val `wbemPrivilegeTakeOwnership`: `WbemPrivilegeEnum` = 8;
public const val `wbemPrivilegeTcb`: `WbemPrivilegeEnum` = 6;
public const val `wbemPrivilegeUndock`: `WbemPrivilegeEnum` = 24;
public const val `wbemQueryFlagDeep`: `WbemQueryFlagEnum` = 0;
public const val `wbemQueryFlagPrototype`: `WbemQueryFlagEnum` = 2;
public const val `wbemQueryFlagShallow`: `WbemQueryFlagEnum` = 1;
public const val `wbemTextFlagNoFlavors`: `WbemTextFlagEnum` = 1;
public const val `wbemTimeoutInfinite`: `WbemTimeout` = -1;
