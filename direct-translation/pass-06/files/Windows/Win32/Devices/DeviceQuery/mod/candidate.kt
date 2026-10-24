// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-devices-query-l1-1-0.dll, ABI=system, export=DevCloseObjectQuery; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DevCloseObjectQuery`(`hdevquery` : `HDEVQUERY`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-devices-query-l1-1-0.dll, ABI=system, export=DevCreateObjectQuery; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Devices_Properties")]
public external fun `DevCreateObjectQuery`(`objecttype` : `DEV_OBJECT_TYPE`, `queryflags` : UInt, `crequestedproperties` : UInt, `prequestedproperties` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Properties`.`DEVPROPCOMPKEY`>?, `cfilterexpressioncount` : UInt, `pfilter` : /* Rust *const */ kotlinx.cinterop.CPointer<`DEVPROP_FILTER_EXPRESSION`>?, `pcallback` : `PDEV_QUERY_RESULT_CALLBACK`, `pcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phdevquery` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HDEVQUERY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-devices-query-l1-1-1.dll, ABI=system, export=DevCreateObjectQueryEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Devices_Properties")]
public external fun `DevCreateObjectQueryEx`(`objecttype` : `DEV_OBJECT_TYPE`, `queryflags` : UInt, `crequestedproperties` : UInt, `prequestedproperties` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Properties`.`DEVPROPCOMPKEY`>?, `cfilterexpressioncount` : UInt, `pfilter` : /* Rust *const */ kotlinx.cinterop.CPointer<`DEVPROP_FILTER_EXPRESSION`>?, `cextendedparametercount` : UInt, `pextendedparameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`DEV_QUERY_PARAMETER`>?, `pcallback` : `PDEV_QUERY_RESULT_CALLBACK`, `pcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phdevquery` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HDEVQUERY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-devices-query-l1-1-0.dll, ABI=system, export=DevCreateObjectQueryFromId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Devices_Properties")]
public external fun `DevCreateObjectQueryFromId`(`objecttype` : `DEV_OBJECT_TYPE`, `pszobjectid` : `windows_sys`.`core`.`PCWSTR`, `queryflags` : UInt, `crequestedproperties` : UInt, `prequestedproperties` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Properties`.`DEVPROPCOMPKEY`>?, `cfilterexpressioncount` : UInt, `pfilter` : /* Rust *const */ kotlinx.cinterop.CPointer<`DEVPROP_FILTER_EXPRESSION`>?, `pcallback` : `PDEV_QUERY_RESULT_CALLBACK`, `pcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phdevquery` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HDEVQUERY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-devices-query-l1-1-1.dll, ABI=system, export=DevCreateObjectQueryFromIdEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Devices_Properties")]
public external fun `DevCreateObjectQueryFromIdEx`(`objecttype` : `DEV_OBJECT_TYPE`, `pszobjectid` : `windows_sys`.`core`.`PCWSTR`, `queryflags` : UInt, `crequestedproperties` : UInt, `prequestedproperties` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Properties`.`DEVPROPCOMPKEY`>?, `cfilterexpressioncount` : UInt, `pfilter` : /* Rust *const */ kotlinx.cinterop.CPointer<`DEVPROP_FILTER_EXPRESSION`>?, `cextendedparametercount` : UInt, `pextendedparameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`DEV_QUERY_PARAMETER`>?, `pcallback` : `PDEV_QUERY_RESULT_CALLBACK`, `pcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phdevquery` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HDEVQUERY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-devices-query-l1-1-0.dll, ABI=system, export=DevCreateObjectQueryFromIds; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Devices_Properties")]
public external fun `DevCreateObjectQueryFromIds`(`objecttype` : `DEV_OBJECT_TYPE`, `pszzobjectids` : `windows_sys`.`core`.`PCWSTR`, `queryflags` : UInt, `crequestedproperties` : UInt, `prequestedproperties` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Properties`.`DEVPROPCOMPKEY`>?, `cfilterexpressioncount` : UInt, `pfilter` : /* Rust *const */ kotlinx.cinterop.CPointer<`DEVPROP_FILTER_EXPRESSION`>?, `pcallback` : `PDEV_QUERY_RESULT_CALLBACK`, `pcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phdevquery` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HDEVQUERY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-devices-query-l1-1-1.dll, ABI=system, export=DevCreateObjectQueryFromIdsEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Devices_Properties")]
public external fun `DevCreateObjectQueryFromIdsEx`(`objecttype` : `DEV_OBJECT_TYPE`, `pszzobjectids` : `windows_sys`.`core`.`PCWSTR`, `queryflags` : UInt, `crequestedproperties` : UInt, `prequestedproperties` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Properties`.`DEVPROPCOMPKEY`>?, `cfilterexpressioncount` : UInt, `pfilter` : /* Rust *const */ kotlinx.cinterop.CPointer<`DEVPROP_FILTER_EXPRESSION`>?, `cextendedparametercount` : UInt, `pextendedparameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`DEV_QUERY_PARAMETER`>?, `pcallback` : `PDEV_QUERY_RESULT_CALLBACK`, `pcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phdevquery` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HDEVQUERY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-devices-query-l1-1-0.dll, ABI=system, export=DevFindProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Devices_Properties")]
public external fun `DevFindProperty`(`pkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DEVPROPKEY`>?, `store` : `super`.`Properties`.`DEVPROPSTORE`, `pszlocalename` : `windows_sys`.`core`.`PCWSTR`, `cproperties` : UInt, `pproperties` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Properties`.`DEVPROPERTY`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Properties`.`DEVPROPERTY`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-devices-query-l1-1-0.dll, ABI=system, export=DevFreeObjectProperties; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Devices_Properties")]
public external fun `DevFreeObjectProperties`(`cpropertycount` : UInt, `pproperties` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Properties`.`DEVPROPERTY`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-devices-query-l1-1-0.dll, ABI=system, export=DevFreeObjects; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Devices_Properties")]
public external fun `DevFreeObjects`(`cobjectcount` : UInt, `pobjects` : /* Rust *const */ kotlinx.cinterop.CPointer<`DEV_OBJECT`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-devices-query-l1-1-0.dll, ABI=system, export=DevGetObjectProperties; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Devices_Properties")]
public external fun `DevGetObjectProperties`(`objecttype` : `DEV_OBJECT_TYPE`, `pszobjectid` : `windows_sys`.`core`.`PCWSTR`, `queryflags` : UInt, `crequestedproperties` : UInt, `prequestedproperties` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Properties`.`DEVPROPCOMPKEY`>?, `pcpropertycount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppproperties` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`Properties`.`DEVPROPERTY`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-devices-query-l1-1-1.dll, ABI=system, export=DevGetObjectPropertiesEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Devices_Properties")]
public external fun `DevGetObjectPropertiesEx`(`objecttype` : `DEV_OBJECT_TYPE`, `pszobjectid` : `windows_sys`.`core`.`PCWSTR`, `queryflags` : UInt, `crequestedproperties` : UInt, `prequestedproperties` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Properties`.`DEVPROPCOMPKEY`>?, `cextendedparametercount` : UInt, `pextendedparameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`DEV_QUERY_PARAMETER`>?, `pcpropertycount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppproperties` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`Properties`.`DEVPROPERTY`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-devices-query-l1-1-0.dll, ABI=system, export=DevGetObjects; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Devices_Properties")]
public external fun `DevGetObjects`(`objecttype` : `DEV_OBJECT_TYPE`, `queryflags` : UInt, `crequestedproperties` : UInt, `prequestedproperties` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Properties`.`DEVPROPCOMPKEY`>?, `cfilterexpressioncount` : UInt, `pfilter` : /* Rust *const */ kotlinx.cinterop.CPointer<`DEVPROP_FILTER_EXPRESSION`>?, `pcobjectcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppobjects` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DEV_OBJECT`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-devices-query-l1-1-1.dll, ABI=system, export=DevGetObjectsEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Devices_Properties")]
public external fun `DevGetObjectsEx`(`objecttype` : `DEV_OBJECT_TYPE`, `queryflags` : UInt, `crequestedproperties` : UInt, `prequestedproperties` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Properties`.`DEVPROPCOMPKEY`>?, `cfilterexpressioncount` : UInt, `pfilter` : /* Rust *const */ kotlinx.cinterop.CPointer<`DEVPROP_FILTER_EXPRESSION`>?, `cextendedparametercount` : UInt, `pextendedparameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`DEV_QUERY_PARAMETER`>?, `pcobjectcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppobjects` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DEV_OBJECT`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Devices_Properties")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVPROP_FILTER_EXPRESSION` (
    public var `Operator`: `DEVPROP_OPERATOR`,
    public var `Property`: `super`.`Properties`.`DEVPROPERTY`,
)
public typealias `DEVPROP_OPERATOR` = UInt;
public const val `DEVPROP_OPERATOR_AND_CLOSE`: `DEVPROP_OPERATOR` = 2097152u;
public const val `DEVPROP_OPERATOR_AND_OPEN`: `DEVPROP_OPERATOR` = 1048576u;
public const val `DEVPROP_OPERATOR_ARRAY_CONTAINS`: `DEVPROP_OPERATOR` = 268435456u;
public const val `DEVPROP_OPERATOR_BEGINS_WITH`: `DEVPROP_OPERATOR` = 9u;
public const val `DEVPROP_OPERATOR_BEGINS_WITH_IGNORE_CASE`: `DEVPROP_OPERATOR` = 131081u;
public const val `DEVPROP_OPERATOR_BITWISE_AND`: `DEVPROP_OPERATOR` = 7u;
public const val `DEVPROP_OPERATOR_BITWISE_OR`: `DEVPROP_OPERATOR` = 8u;
public const val `DEVPROP_OPERATOR_CONTAINS`: `DEVPROP_OPERATOR` = 11u;
public const val `DEVPROP_OPERATOR_CONTAINS_IGNORE_CASE`: `DEVPROP_OPERATOR` = 131083u;
public const val `DEVPROP_OPERATOR_ENDS_WITH`: `DEVPROP_OPERATOR` = 10u;
public const val `DEVPROP_OPERATOR_ENDS_WITH_IGNORE_CASE`: `DEVPROP_OPERATOR` = 131082u;
public const val `DEVPROP_OPERATOR_EQUALS`: `DEVPROP_OPERATOR` = 2u;
public const val `DEVPROP_OPERATOR_EQUALS_IGNORE_CASE`: `DEVPROP_OPERATOR` = 131074u;
public const val `DEVPROP_OPERATOR_EXISTS`: `DEVPROP_OPERATOR` = 1u;
public const val `DEVPROP_OPERATOR_GREATER_THAN`: `DEVPROP_OPERATOR` = 3u;
public const val `DEVPROP_OPERATOR_GREATER_THAN_EQUALS`: `DEVPROP_OPERATOR` = 5u;
public const val `DEVPROP_OPERATOR_LESS_THAN`: `DEVPROP_OPERATOR` = 4u;
public const val `DEVPROP_OPERATOR_LESS_THAN_EQUALS`: `DEVPROP_OPERATOR` = 6u;
public const val `DEVPROP_OPERATOR_LIST_CONTAINS`: `DEVPROP_OPERATOR` = 4096u;
public const val `DEVPROP_OPERATOR_LIST_CONTAINS_IGNORE_CASE`: `DEVPROP_OPERATOR` = 135168u;
public const val `DEVPROP_OPERATOR_LIST_ELEMENT_BEGINS_WITH`: `DEVPROP_OPERATOR` = 8192u;
public const val `DEVPROP_OPERATOR_LIST_ELEMENT_BEGINS_WITH_IGNORE_CASE`: `DEVPROP_OPERATOR` = 139264u;
public const val `DEVPROP_OPERATOR_LIST_ELEMENT_CONTAINS`: `DEVPROP_OPERATOR` = 16384u;
public const val `DEVPROP_OPERATOR_LIST_ELEMENT_CONTAINS_IGNORE_CASE`: `DEVPROP_OPERATOR` = 147456u;
public const val `DEVPROP_OPERATOR_LIST_ELEMENT_ENDS_WITH`: `DEVPROP_OPERATOR` = 12288u;
public const val `DEVPROP_OPERATOR_LIST_ELEMENT_ENDS_WITH_IGNORE_CASE`: `DEVPROP_OPERATOR` = 143360u;
public const val `DEVPROP_OPERATOR_MASK_ARRAY`: `DEVPROP_OPERATOR` = 4026531840u;
public const val `DEVPROP_OPERATOR_MASK_EVAL`: `DEVPROP_OPERATOR` = 4095u;
public const val `DEVPROP_OPERATOR_MASK_LIST`: `DEVPROP_OPERATOR` = 61440u;
public const val `DEVPROP_OPERATOR_MASK_LOGICAL`: `DEVPROP_OPERATOR` = 267386880u;
public const val `DEVPROP_OPERATOR_MASK_MODIFIER`: `DEVPROP_OPERATOR` = 983040u;
public const val `DEVPROP_OPERATOR_MASK_NOT_LOGICAL`: `DEVPROP_OPERATOR` = 4027580415u;
public const val `DEVPROP_OPERATOR_MODIFIER_IGNORE_CASE`: `DEVPROP_OPERATOR` = 131072u;
public const val `DEVPROP_OPERATOR_MODIFIER_NOT`: `DEVPROP_OPERATOR` = 65536u;
public const val `DEVPROP_OPERATOR_NONE`: `DEVPROP_OPERATOR` = 0u;
public const val `DEVPROP_OPERATOR_NOT_CLOSE`: `DEVPROP_OPERATOR` = 6291456u;
public const val `DEVPROP_OPERATOR_NOT_EQUALS`: `DEVPROP_OPERATOR` = 65538u;
public const val `DEVPROP_OPERATOR_NOT_EQUALS_IGNORE_CASE`: `DEVPROP_OPERATOR` = 196610u;
public const val `DEVPROP_OPERATOR_NOT_EXISTS`: `DEVPROP_OPERATOR` = 65537u;
public const val `DEVPROP_OPERATOR_NOT_OPEN`: `DEVPROP_OPERATOR` = 5242880u;
public const val `DEVPROP_OPERATOR_OR_CLOSE`: `DEVPROP_OPERATOR` = 4194304u;
public const val `DEVPROP_OPERATOR_OR_OPEN`: `DEVPROP_OPERATOR` = 3145728u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Devices_Properties")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEV_OBJECT` (
    public var `ObjectType`: `DEV_OBJECT_TYPE`,
    public var `pszObjectId`: `windows_sys`.`core`.`PCWSTR`,
    public var `cPropertyCount`: UInt,
    public var `pProperties`: /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Properties`.`DEVPROPERTY`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DEV_OBJECT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Devices_Properties")]

    public fun `DEV_OBJECT`.Companion.`default`() : `DEV_OBJECT` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `DEV_OBJECT_TYPE` = Int;
public typealias `DEV_QUERY_FLAGS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Devices_Properties")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEV_QUERY_PARAMETER` (
    public var `Key`: `super`.`super`.`Foundation`.`DEVPROPKEY`,
    public var `Type`: `super`.`Properties`.`DEVPROPTYPE`,
    public var `BufferSize`: UInt,
    public var `Buffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DEV_QUERY_PARAMETER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Devices_Properties")]

    public fun `DEV_QUERY_PARAMETER`.Companion.`default`() : `DEV_QUERY_PARAMETER` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `DEV_QUERY_RESULT_ACTION` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Devices_Properties")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEV_QUERY_RESULT_ACTION_DATA` (
    public var `Action`: `DEV_QUERY_RESULT_ACTION`,
    public var `Data`: `DEV_QUERY_RESULT_ACTION_DATA_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DEV_QUERY_RESULT_ACTION_DATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Devices_Properties")]

    public fun `DEV_QUERY_RESULT_ACTION_DATA`.Companion.`default`() : `DEV_QUERY_RESULT_ACTION_DATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 124:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Devices_Properties")]
// #[derive(Clone, Copy)]
// pub union DEV_QUERY_RESULT_ACTION_DATA_0 {
//     pub State: DEV_QUERY_STATE,
//     pub DeviceObject: DEV_OBJECT,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DEV_QUERY_RESULT_ACTION_DATA_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Devices_Properties")]

    public fun `DEV_QUERY_RESULT_ACTION_DATA_0`.Companion.`default`() : `DEV_QUERY_RESULT_ACTION_DATA_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `DEV_QUERY_STATE` = Int;
public const val `DevObjectTypeAEP`: `DEV_OBJECT_TYPE` = 5;
public const val `DevObjectTypeAEPContainer`: `DEV_OBJECT_TYPE` = 6;
public const val `DevObjectTypeAEPService`: `DEV_OBJECT_TYPE` = 10;
public const val `DevObjectTypeDevice`: `DEV_OBJECT_TYPE` = 3;
public const val `DevObjectTypeDeviceContainer`: `DEV_OBJECT_TYPE` = 2;
public const val `DevObjectTypeDeviceContainerDisplay`: `DEV_OBJECT_TYPE` = 9;
public const val `DevObjectTypeDeviceInstallerClass`: `DEV_OBJECT_TYPE` = 7;
public const val `DevObjectTypeDeviceInterface`: `DEV_OBJECT_TYPE` = 1;
public const val `DevObjectTypeDeviceInterfaceClass`: `DEV_OBJECT_TYPE` = 4;
public const val `DevObjectTypeDeviceInterfaceDisplay`: `DEV_OBJECT_TYPE` = 8;
public const val `DevObjectTypeDevicePanel`: `DEV_OBJECT_TYPE` = 11;
public const val `DevObjectTypeUnknown`: `DEV_OBJECT_TYPE` = 0;
public const val `DevQueryFlagAllProperties`: `DEV_QUERY_FLAGS` = 2;
public const val `DevQueryFlagAsyncClose`: `DEV_QUERY_FLAGS` = 8;
public const val `DevQueryFlagLocalize`: `DEV_QUERY_FLAGS` = 4;
public const val `DevQueryFlagNone`: `DEV_QUERY_FLAGS` = 0;
public const val `DevQueryFlagUpdateResults`: `DEV_QUERY_FLAGS` = 1;
public const val `DevQueryResultAdd`: `DEV_QUERY_RESULT_ACTION` = 1;
public const val `DevQueryResultRemove`: `DEV_QUERY_RESULT_ACTION` = 3;
public const val `DevQueryResultStateChange`: `DEV_QUERY_RESULT_ACTION` = 0;
public const val `DevQueryResultUpdate`: `DEV_QUERY_RESULT_ACTION` = 2;
public const val `DevQueryStateAborted`: `DEV_QUERY_STATE` = 2;
public const val `DevQueryStateClosed`: `DEV_QUERY_STATE` = 3;
public const val `DevQueryStateEnumCompleted`: `DEV_QUERY_STATE` = 1;
public const val `DevQueryStateInitialized`: `DEV_QUERY_STATE` = 0;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HDEVQUERY` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Devices_Properties")]
public typealias `PDEV_QUERY_RESULT_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`HDEVQUERY`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DEV_QUERY_RESULT_ACTION_DATA`>?) -> Unit>>>;
