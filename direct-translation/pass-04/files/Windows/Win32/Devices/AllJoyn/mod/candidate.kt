// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=AllJoynAcceptBusConnection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AllJoynAcceptBusConnection`(`serverbushandle` : `super`.`super`.`Foundation`.`HANDLE`, `abortevent` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=AllJoynCloseBusHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AllJoynCloseBusHandle`(`bushandle` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=AllJoynConnectToBus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AllJoynConnectToBus`(`connectionspec` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=AllJoynCreateBus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `AllJoynCreateBus`(`outbuffersize` : UInt, `inbuffersize` : UInt, `lpsecurityattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=AllJoynEnumEvents; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AllJoynEnumEvents`(`connectedbushandle` : `super`.`super`.`Foundation`.`HANDLE`, `eventtoreset` : `super`.`super`.`Foundation`.`HANDLE`, `eventtypes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=AllJoynEventSelect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AllJoynEventSelect`(`connectedbushandle` : `super`.`super`.`Foundation`.`HANDLE`, `eventhandle` : `super`.`super`.`Foundation`.`HANDLE`, `eventtypes` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=AllJoynReceiveFromBus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AllJoynReceiveFromBus`(`connectedbushandle` : `super`.`super`.`Foundation`.`HANDLE`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bytestoread` : UInt, `bytestransferred` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `reserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=AllJoynSendToBus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AllJoynSendToBus`(`connectedbushandle` : `super`.`super`.`Foundation`.`HANDLE`, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bytestowrite` : UInt, `bytestransferred` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `reserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=QCC_StatusText; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QCC_StatusText`(`status` : `QStatus`) : `windows_sys`.`core`.`PCSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_create`(`defaultlanguage` : `windows_sys`.`core`.`PCSTR`) : `alljoyn_aboutdata`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_create_empty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_create_empty`() : `alljoyn_aboutdata`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_create_full; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_create_full`(`arg` : `alljoyn_msgarg`, `language` : `windows_sys`.`core`.`PCSTR`) : `alljoyn_aboutdata`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_createfrommsgarg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_createfrommsgarg`(`data` : `alljoyn_aboutdata`, `arg` : `alljoyn_msgarg`, `language` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_createfromxml; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_createfromxml`(`data` : `alljoyn_aboutdata`, `aboutdataxml` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_destroy`(`data` : `alljoyn_aboutdata`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_getaboutdata; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_getaboutdata`(`data` : `alljoyn_aboutdata`, `msgarg` : `alljoyn_msgarg`, `language` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_getajsoftwareversion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_getajsoftwareversion`(`data` : `alljoyn_aboutdata`, `ajsoftwareversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_getannouncedaboutdata; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_getannouncedaboutdata`(`data` : `alljoyn_aboutdata`, `msgarg` : `alljoyn_msgarg`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_getappid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_getappid`(`data` : `alljoyn_aboutdata`, `appid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `num` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_getappname; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_getappname`(`data` : `alljoyn_aboutdata`, `appname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `language` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_getdateofmanufacture; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_getdateofmanufacture`(`data` : `alljoyn_aboutdata`, `dateofmanufacture` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_getdefaultlanguage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_getdefaultlanguage`(`data` : `alljoyn_aboutdata`, `defaultlanguage` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_getdescription; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_getdescription`(`data` : `alljoyn_aboutdata`, `description` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `language` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_getdeviceid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_getdeviceid`(`data` : `alljoyn_aboutdata`, `deviceid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_getdevicename; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_getdevicename`(`data` : `alljoyn_aboutdata`, `devicename` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `language` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_getfield; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_getfield`(`data` : `alljoyn_aboutdata`, `name` : `windows_sys`.`core`.`PCSTR`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`alljoyn_msgarg`>?, `language` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_getfields; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_getfields`(`data` : `alljoyn_aboutdata`, `fields` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `num_fields` : ULong) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_getfieldsignature; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_getfieldsignature`(`data` : `alljoyn_aboutdata`, `fieldname` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`PCSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_gethardwareversion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_gethardwareversion`(`data` : `alljoyn_aboutdata`, `hardwareversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_getmanufacturer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_getmanufacturer`(`data` : `alljoyn_aboutdata`, `manufacturer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `language` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_getmodelnumber; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_getmodelnumber`(`data` : `alljoyn_aboutdata`, `modelnumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_getsoftwareversion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_getsoftwareversion`(`data` : `alljoyn_aboutdata`, `softwareversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_getsupportedlanguages; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_getsupportedlanguages`(`data` : `alljoyn_aboutdata`, `languagetags` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `num` : ULong) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_getsupporturl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_getsupporturl`(`data` : `alljoyn_aboutdata`, `supporturl` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_isfieldannounced; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_isfieldannounced`(`data` : `alljoyn_aboutdata`, `fieldname` : `windows_sys`.`core`.`PCSTR`) : UByte
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_isfieldlocalized; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_isfieldlocalized`(`data` : `alljoyn_aboutdata`, `fieldname` : `windows_sys`.`core`.`PCSTR`) : UByte
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_isfieldrequired; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_isfieldrequired`(`data` : `alljoyn_aboutdata`, `fieldname` : `windows_sys`.`core`.`PCSTR`) : UByte
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_isvalid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_isvalid`(`data` : `alljoyn_aboutdata`, `language` : `windows_sys`.`core`.`PCSTR`) : UByte
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_setappid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_setappid`(`data` : `alljoyn_aboutdata`, `appid` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `num` : ULong) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_setappid_fromstring; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_setappid_fromstring`(`data` : `alljoyn_aboutdata`, `appid` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_setappname; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_setappname`(`data` : `alljoyn_aboutdata`, `appname` : `windows_sys`.`core`.`PCSTR`, `language` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_setdateofmanufacture; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_setdateofmanufacture`(`data` : `alljoyn_aboutdata`, `dateofmanufacture` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_setdefaultlanguage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_setdefaultlanguage`(`data` : `alljoyn_aboutdata`, `defaultlanguage` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_setdescription; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_setdescription`(`data` : `alljoyn_aboutdata`, `description` : `windows_sys`.`core`.`PCSTR`, `language` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_setdeviceid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_setdeviceid`(`data` : `alljoyn_aboutdata`, `deviceid` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_setdevicename; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_setdevicename`(`data` : `alljoyn_aboutdata`, `devicename` : `windows_sys`.`core`.`PCSTR`, `language` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_setfield; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_setfield`(`data` : `alljoyn_aboutdata`, `name` : `windows_sys`.`core`.`PCSTR`, `value` : `alljoyn_msgarg`, `language` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_sethardwareversion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_sethardwareversion`(`data` : `alljoyn_aboutdata`, `hardwareversion` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_setmanufacturer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_setmanufacturer`(`data` : `alljoyn_aboutdata`, `manufacturer` : `windows_sys`.`core`.`PCSTR`, `language` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_setmodelnumber; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_setmodelnumber`(`data` : `alljoyn_aboutdata`, `modelnumber` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_setsoftwareversion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_setsoftwareversion`(`data` : `alljoyn_aboutdata`, `softwareversion` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_setsupportedlanguage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_setsupportedlanguage`(`data` : `alljoyn_aboutdata`, `language` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdata_setsupporturl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdata_setsupporturl`(`data` : `alljoyn_aboutdata`, `supporturl` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdatalistener_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdatalistener_create`(`callbacks` : /* Rust *const */ kotlinx.cinterop.CPointer<`alljoyn_aboutdatalistener_callbacks`>?, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `alljoyn_aboutdatalistener`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutdatalistener_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutdatalistener_destroy`(`listener` : `alljoyn_aboutdatalistener`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_abouticon_clear; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_abouticon_clear`(`icon` : `alljoyn_abouticon`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_abouticon_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_abouticon_create`() : `alljoyn_abouticon`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_abouticon_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_abouticon_destroy`(`icon` : `alljoyn_abouticon`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_abouticon_getcontent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_abouticon_getcontent`(`icon` : `alljoyn_abouticon`, `data` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_abouticon_geturl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_abouticon_geturl`(`icon` : `alljoyn_abouticon`, `type` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `url` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_abouticon_setcontent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_abouticon_setcontent`(`icon` : `alljoyn_abouticon`, `type` : `windows_sys`.`core`.`PCSTR`, `data` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `csize` : ULong, `ownsdata` : UByte) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_abouticon_setcontent_frommsgarg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_abouticon_setcontent_frommsgarg`(`icon` : `alljoyn_abouticon`, `arg` : `alljoyn_msgarg`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_abouticon_seturl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_abouticon_seturl`(`icon` : `alljoyn_abouticon`, `type` : `windows_sys`.`core`.`PCSTR`, `url` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_abouticonobj_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_abouticonobj_create`(`bus` : `alljoyn_busattachment`, `icon` : `alljoyn_abouticon`) : `alljoyn_abouticonobj`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_abouticonobj_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_abouticonobj_destroy`(`icon` : `alljoyn_abouticonobj`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_abouticonproxy_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_abouticonproxy_create`(`bus` : `alljoyn_busattachment`, `busname` : `windows_sys`.`core`.`PCSTR`, `sessionid` : UInt) : `alljoyn_abouticonproxy`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_abouticonproxy_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_abouticonproxy_destroy`(`proxy` : `alljoyn_abouticonproxy`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_abouticonproxy_geticon; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_abouticonproxy_geticon`(`proxy` : `alljoyn_abouticonproxy`, `icon` : `alljoyn_abouticon`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_abouticonproxy_getversion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_abouticonproxy_getversion`(`proxy` : `alljoyn_abouticonproxy`, `version` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutlistener_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutlistener_create`(`callback` : /* Rust *const */ kotlinx.cinterop.CPointer<`alljoyn_aboutlistener_callback`>?, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `alljoyn_aboutlistener`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutlistener_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutlistener_destroy`(`listener` : `alljoyn_aboutlistener`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutobj_announce; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutobj_announce`(`obj` : `alljoyn_aboutobj`, `sessionport` : UShort, `aboutdata` : `alljoyn_aboutdata`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutobj_announce_using_datalistener; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutobj_announce_using_datalistener`(`obj` : `alljoyn_aboutobj`, `sessionport` : UShort, `aboutlistener` : `alljoyn_aboutdatalistener`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutobj_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutobj_create`(`bus` : `alljoyn_busattachment`, `isannounced` : `alljoyn_about_announceflag`) : `alljoyn_aboutobj`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutobj_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutobj_destroy`(`obj` : `alljoyn_aboutobj`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutobj_unannounce; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutobj_unannounce`(`obj` : `alljoyn_aboutobj`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutobjectdescription_clear; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutobjectdescription_clear`(`description` : `alljoyn_aboutobjectdescription`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutobjectdescription_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutobjectdescription_create`() : `alljoyn_aboutobjectdescription`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutobjectdescription_create_full; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutobjectdescription_create_full`(`arg` : `alljoyn_msgarg`) : `alljoyn_aboutobjectdescription`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutobjectdescription_createfrommsgarg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutobjectdescription_createfrommsgarg`(`description` : `alljoyn_aboutobjectdescription`, `arg` : `alljoyn_msgarg`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutobjectdescription_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutobjectdescription_destroy`(`description` : `alljoyn_aboutobjectdescription`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutobjectdescription_getinterfacepaths; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutobjectdescription_getinterfacepaths`(`description` : `alljoyn_aboutobjectdescription`, `interfacename` : `windows_sys`.`core`.`PCSTR`, `paths` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `numpaths` : ULong) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutobjectdescription_getinterfaces; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutobjectdescription_getinterfaces`(`description` : `alljoyn_aboutobjectdescription`, `path` : `windows_sys`.`core`.`PCSTR`, `interfaces` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `numinterfaces` : ULong) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutobjectdescription_getmsgarg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutobjectdescription_getmsgarg`(`description` : `alljoyn_aboutobjectdescription`, `msgarg` : `alljoyn_msgarg`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutobjectdescription_getpaths; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutobjectdescription_getpaths`(`description` : `alljoyn_aboutobjectdescription`, `paths` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `numpaths` : ULong) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutobjectdescription_hasinterface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutobjectdescription_hasinterface`(`description` : `alljoyn_aboutobjectdescription`, `interfacename` : `windows_sys`.`core`.`PCSTR`) : UByte
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutobjectdescription_hasinterfaceatpath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutobjectdescription_hasinterfaceatpath`(`description` : `alljoyn_aboutobjectdescription`, `path` : `windows_sys`.`core`.`PCSTR`, `interfacename` : `windows_sys`.`core`.`PCSTR`) : UByte
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutobjectdescription_haspath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutobjectdescription_haspath`(`description` : `alljoyn_aboutobjectdescription`, `path` : `windows_sys`.`core`.`PCSTR`) : UByte
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutproxy_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutproxy_create`(`bus` : `alljoyn_busattachment`, `busname` : `windows_sys`.`core`.`PCSTR`, `sessionid` : UInt) : `alljoyn_aboutproxy`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutproxy_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutproxy_destroy`(`proxy` : `alljoyn_aboutproxy`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutproxy_getaboutdata; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutproxy_getaboutdata`(`proxy` : `alljoyn_aboutproxy`, `language` : `windows_sys`.`core`.`PCSTR`, `data` : `alljoyn_msgarg`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutproxy_getobjectdescription; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutproxy_getobjectdescription`(`proxy` : `alljoyn_aboutproxy`, `objectdesc` : `alljoyn_msgarg`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_aboutproxy_getversion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_aboutproxy_getversion`(`proxy` : `alljoyn_aboutproxy`, `version` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_applicationstatelistener_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_applicationstatelistener_create`(`callbacks` : /* Rust *const */ kotlinx.cinterop.CPointer<`alljoyn_applicationstatelistener_callbacks`>?, `context` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `alljoyn_applicationstatelistener`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_applicationstatelistener_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_applicationstatelistener_destroy`(`listener` : `alljoyn_applicationstatelistener`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_authlistener_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_authlistener_create`(`callbacks` : /* Rust *const */ kotlinx.cinterop.CPointer<`alljoyn_authlistener_callbacks`>?, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `alljoyn_authlistener`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_authlistener_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_authlistener_destroy`(`listener` : `alljoyn_authlistener`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_authlistener_requestcredentialsresponse; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_authlistener_requestcredentialsresponse`(`listener` : `alljoyn_authlistener`, `authcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `accept` : Int, `credentials` : `alljoyn_credentials`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_authlistener_setsharedsecret; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_authlistener_setsharedsecret`(`listener` : `alljoyn_authlistener`, `sharedsecret` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `sharedsecretsize` : ULong) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_authlistener_verifycredentialsresponse; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_authlistener_verifycredentialsresponse`(`listener` : `alljoyn_authlistener`, `authcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `accept` : Int) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_authlistenerasync_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_authlistenerasync_create`(`callbacks` : /* Rust *const */ kotlinx.cinterop.CPointer<`alljoyn_authlistenerasync_callbacks`>?, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `alljoyn_authlistener`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_authlistenerasync_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_authlistenerasync_destroy`(`listener` : `alljoyn_authlistener`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_autopinger_adddestination; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_autopinger_adddestination`(`autopinger` : `alljoyn_autopinger`, `group` : `windows_sys`.`core`.`PCSTR`, `destination` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_autopinger_addpinggroup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_autopinger_addpinggroup`(`autopinger` : `alljoyn_autopinger`, `group` : `windows_sys`.`core`.`PCSTR`, `listener` : `alljoyn_pinglistener`, `pinginterval` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_autopinger_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_autopinger_create`(`bus` : `alljoyn_busattachment`) : `alljoyn_autopinger`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_autopinger_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_autopinger_destroy`(`autopinger` : `alljoyn_autopinger`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_autopinger_pause; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_autopinger_pause`(`autopinger` : `alljoyn_autopinger`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_autopinger_removedestination; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_autopinger_removedestination`(`autopinger` : `alljoyn_autopinger`, `group` : `windows_sys`.`core`.`PCSTR`, `destination` : `windows_sys`.`core`.`PCSTR`, `removeall` : Int) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_autopinger_removepinggroup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_autopinger_removepinggroup`(`autopinger` : `alljoyn_autopinger`, `group` : `windows_sys`.`core`.`PCSTR`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_autopinger_resume; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_autopinger_resume`(`autopinger` : `alljoyn_autopinger`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_autopinger_setpinginterval; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_autopinger_setpinginterval`(`autopinger` : `alljoyn_autopinger`, `group` : `windows_sys`.`core`.`PCSTR`, `pinginterval` : UInt) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_addlogonentry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_addlogonentry`(`bus` : `alljoyn_busattachment`, `authmechanism` : `windows_sys`.`core`.`PCSTR`, `username` : `windows_sys`.`core`.`PCSTR`, `password` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_addmatch; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_addmatch`(`bus` : `alljoyn_busattachment`, `rule` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_advertisename; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_advertisename`(`bus` : `alljoyn_busattachment`, `name` : `windows_sys`.`core`.`PCSTR`, `transports` : UShort) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_bindsessionport; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_bindsessionport`(`bus` : `alljoyn_busattachment`, `sessionport` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `opts` : `alljoyn_sessionopts`, `listener` : `alljoyn_sessionportlistener`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_canceladvertisename; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_canceladvertisename`(`bus` : `alljoyn_busattachment`, `name` : `windows_sys`.`core`.`PCSTR`, `transports` : UShort) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_cancelfindadvertisedname; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_cancelfindadvertisedname`(`bus` : `alljoyn_busattachment`, `nameprefix` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_cancelfindadvertisednamebytransport; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_cancelfindadvertisednamebytransport`(`bus` : `alljoyn_busattachment`, `nameprefix` : `windows_sys`.`core`.`PCSTR`, `transports` : UShort) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_cancelwhoimplements_interface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_cancelwhoimplements_interface`(`bus` : `alljoyn_busattachment`, `implementsinterface` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_cancelwhoimplements_interfaces; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_cancelwhoimplements_interfaces`(`bus` : `alljoyn_busattachment`, `implementsinterfaces` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `numberinterfaces` : ULong) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_clearkeys; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_clearkeys`(`bus` : `alljoyn_busattachment`, `guid` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_clearkeystore; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_clearkeystore`(`bus` : `alljoyn_busattachment`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_connect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_connect`(`bus` : `alljoyn_busattachment`, `connectspec` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_create`(`applicationname` : `windows_sys`.`core`.`PCSTR`, `allowremotemessages` : Int) : `alljoyn_busattachment`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_create_concurrency; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_create_concurrency`(`applicationname` : `windows_sys`.`core`.`PCSTR`, `allowremotemessages` : Int, `concurrency` : UInt) : `alljoyn_busattachment`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_createinterface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_createinterface`(`bus` : `alljoyn_busattachment`, `name` : `windows_sys`.`core`.`PCSTR`, `iface` : /* Rust *mut */ kotlinx.cinterop.CPointer<`alljoyn_interfacedescription`>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_createinterface_secure; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_createinterface_secure`(`bus` : `alljoyn_busattachment`, `name` : `windows_sys`.`core`.`PCSTR`, `iface` : /* Rust *mut */ kotlinx.cinterop.CPointer<`alljoyn_interfacedescription`>?, `secpolicy` : `alljoyn_interfacedescription_securitypolicy`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_createinterfacesfromxml; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_createinterfacesfromxml`(`bus` : `alljoyn_busattachment`, `xml` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_deletedefaultkeystore; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_deletedefaultkeystore`(`applicationname` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_deleteinterface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_deleteinterface`(`bus` : `alljoyn_busattachment`, `iface` : `alljoyn_interfacedescription`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_destroy`(`bus` : `alljoyn_busattachment`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_disconnect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_disconnect`(`bus` : `alljoyn_busattachment`, `unused` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_enableconcurrentcallbacks; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_enableconcurrentcallbacks`(`bus` : `alljoyn_busattachment`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_enablepeersecurity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_enablepeersecurity`(`bus` : `alljoyn_busattachment`, `authmechanisms` : `windows_sys`.`core`.`PCSTR`, `listener` : `alljoyn_authlistener`, `keystorefilename` : `windows_sys`.`core`.`PCSTR`, `isshared` : Int) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_enablepeersecuritywithpermissionconfigurationlistener; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_enablepeersecuritywithpermissionconfigurationlistener`(`bus` : `alljoyn_busattachment`, `authmechanisms` : `windows_sys`.`core`.`PCSTR`, `authlistener` : `alljoyn_authlistener`, `keystorefilename` : `windows_sys`.`core`.`PCSTR`, `isshared` : Int, `permissionconfigurationlistener` : `alljoyn_permissionconfigurationlistener`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_findadvertisedname; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_findadvertisedname`(`bus` : `alljoyn_busattachment`, `nameprefix` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_findadvertisednamebytransport; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_findadvertisednamebytransport`(`bus` : `alljoyn_busattachment`, `nameprefix` : `windows_sys`.`core`.`PCSTR`, `transports` : UShort) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_getalljoyndebugobj; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_getalljoyndebugobj`(`bus` : `alljoyn_busattachment`) : `alljoyn_proxybusobject`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_getalljoynproxyobj; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_getalljoynproxyobj`(`bus` : `alljoyn_busattachment`) : `alljoyn_proxybusobject`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_getconcurrency; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_getconcurrency`(`bus` : `alljoyn_busattachment`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_getconnectspec; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_getconnectspec`(`bus` : `alljoyn_busattachment`) : `windows_sys`.`core`.`PCSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_getdbusproxyobj; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_getdbusproxyobj`(`bus` : `alljoyn_busattachment`) : `alljoyn_proxybusobject`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_getglobalguidstring; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_getglobalguidstring`(`bus` : `alljoyn_busattachment`) : `windows_sys`.`core`.`PCSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_getinterface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_getinterface`(`bus` : `alljoyn_busattachment`, `name` : `windows_sys`.`core`.`PCSTR`) : `alljoyn_interfacedescription`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_getinterfaces; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_getinterfaces`(`bus` : `alljoyn_busattachment`, `ifaces` : /* Rust *const */ kotlinx.cinterop.CPointer<`alljoyn_interfacedescription`>?, `numifaces` : ULong) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_getkeyexpiration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_getkeyexpiration`(`bus` : `alljoyn_busattachment`, `guid` : `windows_sys`.`core`.`PCSTR`, `timeout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_getpeerguid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_getpeerguid`(`bus` : `alljoyn_busattachment`, `name` : `windows_sys`.`core`.`PCSTR`, `guid` : `windows_sys`.`core`.`PCSTR`, `guidsz` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_getpermissionconfigurator; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_getpermissionconfigurator`(`bus` : `alljoyn_busattachment`) : `alljoyn_permissionconfigurator`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_gettimestamp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_gettimestamp`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_getuniquename; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_getuniquename`(`bus` : `alljoyn_busattachment`) : `windows_sys`.`core`.`PCSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_isconnected; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_isconnected`(`bus` : `alljoyn_busattachment`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_ispeersecurityenabled; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_ispeersecurityenabled`(`bus` : `alljoyn_busattachment`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_isstarted; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_isstarted`(`bus` : `alljoyn_busattachment`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_isstopping; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_isstopping`(`bus` : `alljoyn_busattachment`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_join; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_join`(`bus` : `alljoyn_busattachment`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_joinsession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_joinsession`(`bus` : `alljoyn_busattachment`, `sessionhost` : `windows_sys`.`core`.`PCSTR`, `sessionport` : UShort, `listener` : `alljoyn_sessionlistener`, `sessionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `opts` : `alljoyn_sessionopts`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_joinsessionasync; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_joinsessionasync`(`bus` : `alljoyn_busattachment`, `sessionhost` : `windows_sys`.`core`.`PCSTR`, `sessionport` : UShort, `listener` : `alljoyn_sessionlistener`, `opts` : `alljoyn_sessionopts`, `callback` : `alljoyn_busattachment_joinsessioncb_ptr`, `context` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_leavesession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_leavesession`(`bus` : `alljoyn_busattachment`, `sessionid` : UInt) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_namehasowner; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_namehasowner`(`bus` : `alljoyn_busattachment`, `name` : `windows_sys`.`core`.`PCSTR`, `hasowner` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_ping; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_ping`(`bus` : `alljoyn_busattachment`, `name` : `windows_sys`.`core`.`PCSTR`, `timeout` : UInt) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_registeraboutlistener; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_registeraboutlistener`(`bus` : `alljoyn_busattachment`, `aboutlistener` : `alljoyn_aboutlistener`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_registerapplicationstatelistener; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_registerapplicationstatelistener`(`bus` : `alljoyn_busattachment`, `listener` : `alljoyn_applicationstatelistener`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_registerbuslistener; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_registerbuslistener`(`bus` : `alljoyn_busattachment`, `listener` : `alljoyn_buslistener`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_registerbusobject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_registerbusobject`(`bus` : `alljoyn_busattachment`, `obj` : `alljoyn_busobject`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_registerbusobject_secure; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_registerbusobject_secure`(`bus` : `alljoyn_busattachment`, `obj` : `alljoyn_busobject`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_registerkeystorelistener; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_registerkeystorelistener`(`bus` : `alljoyn_busattachment`, `listener` : `alljoyn_keystorelistener`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_registersignalhandler; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_registersignalhandler`(`bus` : `alljoyn_busattachment`, `signal_handler` : `alljoyn_messagereceiver_signalhandler_ptr`, `member` : `alljoyn_interfacedescription_member`, `srcpath` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_registersignalhandlerwithrule; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_registersignalhandlerwithrule`(`bus` : `alljoyn_busattachment`, `signal_handler` : `alljoyn_messagereceiver_signalhandler_ptr`, `member` : `alljoyn_interfacedescription_member`, `matchrule` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_releasename; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_releasename`(`bus` : `alljoyn_busattachment`, `name` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_reloadkeystore; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_reloadkeystore`(`bus` : `alljoyn_busattachment`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_removematch; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_removematch`(`bus` : `alljoyn_busattachment`, `rule` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_removesessionmember; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_removesessionmember`(`bus` : `alljoyn_busattachment`, `sessionid` : UInt, `membername` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_requestname; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_requestname`(`bus` : `alljoyn_busattachment`, `requestedname` : `windows_sys`.`core`.`PCSTR`, `flags` : UInt) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_secureconnection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_secureconnection`(`bus` : `alljoyn_busattachment`, `name` : `windows_sys`.`core`.`PCSTR`, `forceauth` : Int) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_secureconnectionasync; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_secureconnectionasync`(`bus` : `alljoyn_busattachment`, `name` : `windows_sys`.`core`.`PCSTR`, `forceauth` : Int) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_setdaemondebug; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_setdaemondebug`(`bus` : `alljoyn_busattachment`, `module` : `windows_sys`.`core`.`PCSTR`, `level` : UInt) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_setkeyexpiration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_setkeyexpiration`(`bus` : `alljoyn_busattachment`, `guid` : `windows_sys`.`core`.`PCSTR`, `timeout` : UInt) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_setlinktimeout; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_setlinktimeout`(`bus` : `alljoyn_busattachment`, `sessionid` : UInt, `linktimeout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_setlinktimeoutasync; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_setlinktimeoutasync`(`bus` : `alljoyn_busattachment`, `sessionid` : UInt, `linktimeout` : UInt, `callback` : `alljoyn_busattachment_setlinktimeoutcb_ptr`, `context` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_setsessionlistener; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_setsessionlistener`(`bus` : `alljoyn_busattachment`, `sessionid` : UInt, `listener` : `alljoyn_sessionlistener`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_start; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_start`(`bus` : `alljoyn_busattachment`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_stop; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_stop`(`bus` : `alljoyn_busattachment`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_unbindsessionport; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_unbindsessionport`(`bus` : `alljoyn_busattachment`, `sessionport` : UShort) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_unregisteraboutlistener; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_unregisteraboutlistener`(`bus` : `alljoyn_busattachment`, `aboutlistener` : `alljoyn_aboutlistener`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_unregisterallaboutlisteners; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_unregisterallaboutlisteners`(`bus` : `alljoyn_busattachment`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_unregisterallhandlers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_unregisterallhandlers`(`bus` : `alljoyn_busattachment`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_unregisterapplicationstatelistener; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_unregisterapplicationstatelistener`(`bus` : `alljoyn_busattachment`, `listener` : `alljoyn_applicationstatelistener`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_unregisterbuslistener; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_unregisterbuslistener`(`bus` : `alljoyn_busattachment`, `listener` : `alljoyn_buslistener`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_unregisterbusobject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_unregisterbusobject`(`bus` : `alljoyn_busattachment`, `object` : `alljoyn_busobject`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_unregistersignalhandler; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_unregistersignalhandler`(`bus` : `alljoyn_busattachment`, `signal_handler` : `alljoyn_messagereceiver_signalhandler_ptr`, `member` : `alljoyn_interfacedescription_member`, `srcpath` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_unregistersignalhandlerwithrule; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_unregistersignalhandlerwithrule`(`bus` : `alljoyn_busattachment`, `signal_handler` : `alljoyn_messagereceiver_signalhandler_ptr`, `member` : `alljoyn_interfacedescription_member`, `matchrule` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_whoimplements_interface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_whoimplements_interface`(`bus` : `alljoyn_busattachment`, `implementsinterface` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busattachment_whoimplements_interfaces; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busattachment_whoimplements_interfaces`(`bus` : `alljoyn_busattachment`, `implementsinterfaces` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `numberinterfaces` : ULong) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_buslistener_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_buslistener_create`(`callbacks` : /* Rust *const */ kotlinx.cinterop.CPointer<`alljoyn_buslistener_callbacks`>?, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `alljoyn_buslistener`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_buslistener_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_buslistener_destroy`(`listener` : `alljoyn_buslistener`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busobject_addinterface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busobject_addinterface`(`bus` : `alljoyn_busobject`, `iface` : `alljoyn_interfacedescription`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busobject_addinterface_announced; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busobject_addinterface_announced`(`bus` : `alljoyn_busobject`, `iface` : `alljoyn_interfacedescription`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busobject_addmethodhandler; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busobject_addmethodhandler`(`bus` : `alljoyn_busobject`, `member` : `alljoyn_interfacedescription_member`, `handler` : `alljoyn_messagereceiver_methodhandler_ptr`, `context` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busobject_addmethodhandlers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busobject_addmethodhandlers`(`bus` : `alljoyn_busobject`, `entries` : /* Rust *const */ kotlinx.cinterop.CPointer<`alljoyn_busobject_methodentry`>?, `numentries` : ULong) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busobject_cancelsessionlessmessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busobject_cancelsessionlessmessage`(`bus` : `alljoyn_busobject`, `msg` : `alljoyn_message`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busobject_cancelsessionlessmessage_serial; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busobject_cancelsessionlessmessage_serial`(`bus` : `alljoyn_busobject`, `serialnumber` : UInt) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busobject_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busobject_create`(`path` : `windows_sys`.`core`.`PCSTR`, `isplaceholder` : Int, `callbacks_in` : /* Rust *const */ kotlinx.cinterop.CPointer<`alljoyn_busobject_callbacks`>?, `context_in` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `alljoyn_busobject`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busobject_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busobject_destroy`(`bus` : `alljoyn_busobject`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busobject_emitpropertieschanged; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busobject_emitpropertieschanged`(`bus` : `alljoyn_busobject`, `ifcname` : `windows_sys`.`core`.`PCSTR`, `propnames` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `numprops` : ULong, `id` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busobject_emitpropertychanged; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busobject_emitpropertychanged`(`bus` : `alljoyn_busobject`, `ifcname` : `windows_sys`.`core`.`PCSTR`, `propname` : `windows_sys`.`core`.`PCSTR`, `val` : `alljoyn_msgarg`, `id` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busobject_getannouncedinterfacenames; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busobject_getannouncedinterfacenames`(`bus` : `alljoyn_busobject`, `interfaces` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `numinterfaces` : ULong) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busobject_getbusattachment; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busobject_getbusattachment`(`bus` : `alljoyn_busobject`) : `alljoyn_busattachment`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busobject_getname; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busobject_getname`(`bus` : `alljoyn_busobject`, `buffer` : `windows_sys`.`core`.`PCSTR`, `buffersz` : ULong) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busobject_getpath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busobject_getpath`(`bus` : `alljoyn_busobject`) : `windows_sys`.`core`.`PCSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busobject_issecure; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busobject_issecure`(`bus` : `alljoyn_busobject`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busobject_methodreply_args; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busobject_methodreply_args`(`bus` : `alljoyn_busobject`, `msg` : `alljoyn_message`, `args` : `alljoyn_msgarg`, `numargs` : ULong) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busobject_methodreply_err; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busobject_methodreply_err`(`bus` : `alljoyn_busobject`, `msg` : `alljoyn_message`, `error` : `windows_sys`.`core`.`PCSTR`, `errormessage` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busobject_methodreply_status; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busobject_methodreply_status`(`bus` : `alljoyn_busobject`, `msg` : `alljoyn_message`, `status` : `QStatus`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busobject_setannounceflag; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busobject_setannounceflag`(`bus` : `alljoyn_busobject`, `iface` : `alljoyn_interfacedescription`, `isannounced` : `alljoyn_about_announceflag`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_busobject_signal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_busobject_signal`(`bus` : `alljoyn_busobject`, `destination` : `windows_sys`.`core`.`PCSTR`, `sessionid` : UInt, `signal` : `alljoyn_interfacedescription_member`, `args` : `alljoyn_msgarg`, `numargs` : ULong, `timetolive` : UShort, `flags` : UByte, `msg` : `alljoyn_message`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_credentials_clear; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_credentials_clear`(`cred` : `alljoyn_credentials`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_credentials_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_credentials_create`() : `alljoyn_credentials`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_credentials_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_credentials_destroy`(`cred` : `alljoyn_credentials`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_credentials_getcertchain; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_credentials_getcertchain`(`cred` : `alljoyn_credentials`) : `windows_sys`.`core`.`PCSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_credentials_getexpiration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_credentials_getexpiration`(`cred` : `alljoyn_credentials`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_credentials_getlogonentry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_credentials_getlogonentry`(`cred` : `alljoyn_credentials`) : `windows_sys`.`core`.`PCSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_credentials_getpassword; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_credentials_getpassword`(`cred` : `alljoyn_credentials`) : `windows_sys`.`core`.`PCSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_credentials_getprivateKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_credentials_getprivateKey`(`cred` : `alljoyn_credentials`) : `windows_sys`.`core`.`PCSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_credentials_getusername; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_credentials_getusername`(`cred` : `alljoyn_credentials`) : `windows_sys`.`core`.`PCSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_credentials_isset; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_credentials_isset`(`cred` : `alljoyn_credentials`, `creds` : UShort) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_credentials_setcertchain; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_credentials_setcertchain`(`cred` : `alljoyn_credentials`, `certchain` : `windows_sys`.`core`.`PCSTR`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_credentials_setexpiration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_credentials_setexpiration`(`cred` : `alljoyn_credentials`, `expiration` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_credentials_setlogonentry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_credentials_setlogonentry`(`cred` : `alljoyn_credentials`, `logonentry` : `windows_sys`.`core`.`PCSTR`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_credentials_setpassword; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_credentials_setpassword`(`cred` : `alljoyn_credentials`, `pwd` : `windows_sys`.`core`.`PCSTR`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_credentials_setprivatekey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_credentials_setprivatekey`(`cred` : `alljoyn_credentials`, `pk` : `windows_sys`.`core`.`PCSTR`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_credentials_setusername; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_credentials_setusername`(`cred` : `alljoyn_credentials`, `username` : `windows_sys`.`core`.`PCSTR`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_getbuildinfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_getbuildinfo`() : `windows_sys`.`core`.`PCSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_getnumericversion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_getnumericversion`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_getversion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_getversion`() : `windows_sys`.`core`.`PCSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_init; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_init`() : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_activate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_activate`(`iface` : `alljoyn_interfacedescription`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_addannotation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_addannotation`(`iface` : `alljoyn_interfacedescription`, `name` : `windows_sys`.`core`.`PCSTR`, `value` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_addargannotation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_addargannotation`(`iface` : `alljoyn_interfacedescription`, `member` : `windows_sys`.`core`.`PCSTR`, `argname` : `windows_sys`.`core`.`PCSTR`, `name` : `windows_sys`.`core`.`PCSTR`, `value` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_addmember; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_addmember`(`iface` : `alljoyn_interfacedescription`, `type` : `alljoyn_messagetype`, `name` : `windows_sys`.`core`.`PCSTR`, `inputsig` : `windows_sys`.`core`.`PCSTR`, `outsig` : `windows_sys`.`core`.`PCSTR`, `argnames` : `windows_sys`.`core`.`PCSTR`, `annotation` : UByte) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_addmemberannotation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_addmemberannotation`(`iface` : `alljoyn_interfacedescription`, `member` : `windows_sys`.`core`.`PCSTR`, `name` : `windows_sys`.`core`.`PCSTR`, `value` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_addmethod; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_addmethod`(`iface` : `alljoyn_interfacedescription`, `name` : `windows_sys`.`core`.`PCSTR`, `inputsig` : `windows_sys`.`core`.`PCSTR`, `outsig` : `windows_sys`.`core`.`PCSTR`, `argnames` : `windows_sys`.`core`.`PCSTR`, `annotation` : UByte, `accessperms` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_addproperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_addproperty`(`iface` : `alljoyn_interfacedescription`, `name` : `windows_sys`.`core`.`PCSTR`, `signature` : `windows_sys`.`core`.`PCSTR`, `access` : UByte) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_addpropertyannotation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_addpropertyannotation`(`iface` : `alljoyn_interfacedescription`, `property` : `windows_sys`.`core`.`PCSTR`, `name` : `windows_sys`.`core`.`PCSTR`, `value` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_addsignal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_addsignal`(`iface` : `alljoyn_interfacedescription`, `name` : `windows_sys`.`core`.`PCSTR`, `sig` : `windows_sys`.`core`.`PCSTR`, `argnames` : `windows_sys`.`core`.`PCSTR`, `annotation` : UByte, `accessperms` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_eql; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_eql`(`one` : `alljoyn_interfacedescription`, `other` : `alljoyn_interfacedescription`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_getannotation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_getannotation`(`iface` : `alljoyn_interfacedescription`, `name` : `windows_sys`.`core`.`PCSTR`, `value` : `windows_sys`.`core`.`PCSTR`, `value_size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_getannotationatindex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_getannotationatindex`(`iface` : `alljoyn_interfacedescription`, `index` : ULong, `name` : `windows_sys`.`core`.`PCSTR`, `name_size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `value` : `windows_sys`.`core`.`PCSTR`, `value_size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_getannotationscount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_getannotationscount`(`iface` : `alljoyn_interfacedescription`) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_getargdescriptionforlanguage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_getargdescriptionforlanguage`(`iface` : `alljoyn_interfacedescription`, `member` : `windows_sys`.`core`.`PCSTR`, `arg` : `windows_sys`.`core`.`PCSTR`, `description` : `windows_sys`.`core`.`PCSTR`, `maxlanguagelength` : ULong, `languagetag` : `windows_sys`.`core`.`PCSTR`) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_getdescriptionforlanguage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_getdescriptionforlanguage`(`iface` : `alljoyn_interfacedescription`, `description` : `windows_sys`.`core`.`PCSTR`, `maxlanguagelength` : ULong, `languagetag` : `windows_sys`.`core`.`PCSTR`) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_getdescriptionlanguages; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_getdescriptionlanguages`(`iface` : `alljoyn_interfacedescription`, `languages` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `size` : ULong) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_getdescriptionlanguages2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_getdescriptionlanguages2`(`iface` : `alljoyn_interfacedescription`, `languages` : `windows_sys`.`core`.`PCSTR`, `languagessize` : ULong) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_getdescriptiontranslationcallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_getdescriptiontranslationcallback`(`iface` : `alljoyn_interfacedescription`) : `alljoyn_interfacedescription_translation_callback_ptr`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_getmember; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_getmember`(`iface` : `alljoyn_interfacedescription`, `name` : `windows_sys`.`core`.`PCSTR`, `member` : /* Rust *mut */ kotlinx.cinterop.CPointer<`alljoyn_interfacedescription_member`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_getmemberannotation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_getmemberannotation`(`iface` : `alljoyn_interfacedescription`, `member` : `windows_sys`.`core`.`PCSTR`, `name` : `windows_sys`.`core`.`PCSTR`, `value` : `windows_sys`.`core`.`PCSTR`, `value_size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_getmemberargannotation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_getmemberargannotation`(`iface` : `alljoyn_interfacedescription`, `member` : `windows_sys`.`core`.`PCSTR`, `argname` : `windows_sys`.`core`.`PCSTR`, `name` : `windows_sys`.`core`.`PCSTR`, `value` : `windows_sys`.`core`.`PCSTR`, `value_size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_getmemberdescriptionforlanguage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_getmemberdescriptionforlanguage`(`iface` : `alljoyn_interfacedescription`, `member` : `windows_sys`.`core`.`PCSTR`, `description` : `windows_sys`.`core`.`PCSTR`, `maxlanguagelength` : ULong, `languagetag` : `windows_sys`.`core`.`PCSTR`) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_getmembers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_getmembers`(`iface` : `alljoyn_interfacedescription`, `members` : /* Rust *mut */ kotlinx.cinterop.CPointer<`alljoyn_interfacedescription_member`>?, `nummembers` : ULong) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_getmethod; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_getmethod`(`iface` : `alljoyn_interfacedescription`, `name` : `windows_sys`.`core`.`PCSTR`, `member` : /* Rust *mut */ kotlinx.cinterop.CPointer<`alljoyn_interfacedescription_member`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_getname; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_getname`(`iface` : `alljoyn_interfacedescription`) : `windows_sys`.`core`.`PCSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_getproperties; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_getproperties`(`iface` : `alljoyn_interfacedescription`, `props` : /* Rust *mut */ kotlinx.cinterop.CPointer<`alljoyn_interfacedescription_property`>?, `numprops` : ULong) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_getproperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_getproperty`(`iface` : `alljoyn_interfacedescription`, `name` : `windows_sys`.`core`.`PCSTR`, `property` : /* Rust *mut */ kotlinx.cinterop.CPointer<`alljoyn_interfacedescription_property`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_getpropertyannotation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_getpropertyannotation`(`iface` : `alljoyn_interfacedescription`, `property` : `windows_sys`.`core`.`PCSTR`, `name` : `windows_sys`.`core`.`PCSTR`, `value` : `windows_sys`.`core`.`PCSTR`, `str_size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_getpropertydescriptionforlanguage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_getpropertydescriptionforlanguage`(`iface` : `alljoyn_interfacedescription`, `property` : `windows_sys`.`core`.`PCSTR`, `description` : `windows_sys`.`core`.`PCSTR`, `maxlanguagelength` : ULong, `languagetag` : `windows_sys`.`core`.`PCSTR`) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_getsecuritypolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_getsecuritypolicy`(`iface` : `alljoyn_interfacedescription`) : `alljoyn_interfacedescription_securitypolicy`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_getsignal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_getsignal`(`iface` : `alljoyn_interfacedescription`, `name` : `windows_sys`.`core`.`PCSTR`, `member` : /* Rust *mut */ kotlinx.cinterop.CPointer<`alljoyn_interfacedescription_member`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_hasdescription; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_hasdescription`(`iface` : `alljoyn_interfacedescription`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_hasmember; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_hasmember`(`iface` : `alljoyn_interfacedescription`, `name` : `windows_sys`.`core`.`PCSTR`, `insig` : `windows_sys`.`core`.`PCSTR`, `outsig` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_hasproperties; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_hasproperties`(`iface` : `alljoyn_interfacedescription`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_hasproperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_hasproperty`(`iface` : `alljoyn_interfacedescription`, `name` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_introspect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_introspect`(`iface` : `alljoyn_interfacedescription`, `str` : `windows_sys`.`core`.`PCSTR`, `buf` : ULong, `indent` : ULong) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_issecure; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_issecure`(`iface` : `alljoyn_interfacedescription`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_member_eql; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_member_eql`(`one` : `alljoyn_interfacedescription_member`, `other` : `alljoyn_interfacedescription_member`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_member_getannotation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_member_getannotation`(`member` : `alljoyn_interfacedescription_member`, `name` : `windows_sys`.`core`.`PCSTR`, `value` : `windows_sys`.`core`.`PCSTR`, `value_size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_member_getannotationatindex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_member_getannotationatindex`(`member` : `alljoyn_interfacedescription_member`, `index` : ULong, `name` : `windows_sys`.`core`.`PCSTR`, `name_size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `value` : `windows_sys`.`core`.`PCSTR`, `value_size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_member_getannotationscount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_member_getannotationscount`(`member` : `alljoyn_interfacedescription_member`) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_member_getargannotation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_member_getargannotation`(`member` : `alljoyn_interfacedescription_member`, `argname` : `windows_sys`.`core`.`PCSTR`, `name` : `windows_sys`.`core`.`PCSTR`, `value` : `windows_sys`.`core`.`PCSTR`, `value_size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_member_getargannotationatindex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_member_getargannotationatindex`(`member` : `alljoyn_interfacedescription_member`, `argname` : `windows_sys`.`core`.`PCSTR`, `index` : ULong, `name` : `windows_sys`.`core`.`PCSTR`, `name_size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `value` : `windows_sys`.`core`.`PCSTR`, `value_size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_member_getargannotationscount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_member_getargannotationscount`(`member` : `alljoyn_interfacedescription_member`, `argname` : `windows_sys`.`core`.`PCSTR`) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_property_eql; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_property_eql`(`one` : `alljoyn_interfacedescription_property`, `other` : `alljoyn_interfacedescription_property`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_property_getannotation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_property_getannotation`(`property` : `alljoyn_interfacedescription_property`, `name` : `windows_sys`.`core`.`PCSTR`, `value` : `windows_sys`.`core`.`PCSTR`, `value_size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_property_getannotationatindex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_property_getannotationatindex`(`property` : `alljoyn_interfacedescription_property`, `index` : ULong, `name` : `windows_sys`.`core`.`PCSTR`, `name_size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `value` : `windows_sys`.`core`.`PCSTR`, `value_size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_property_getannotationscount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_property_getannotationscount`(`property` : `alljoyn_interfacedescription_property`) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_setargdescription; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_setargdescription`(`iface` : `alljoyn_interfacedescription`, `member` : `windows_sys`.`core`.`PCSTR`, `argname` : `windows_sys`.`core`.`PCSTR`, `description` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_setargdescriptionforlanguage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_setargdescriptionforlanguage`(`iface` : `alljoyn_interfacedescription`, `member` : `windows_sys`.`core`.`PCSTR`, `arg` : `windows_sys`.`core`.`PCSTR`, `description` : `windows_sys`.`core`.`PCSTR`, `languagetag` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_setdescription; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_setdescription`(`iface` : `alljoyn_interfacedescription`, `description` : `windows_sys`.`core`.`PCSTR`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_setdescriptionforlanguage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_setdescriptionforlanguage`(`iface` : `alljoyn_interfacedescription`, `description` : `windows_sys`.`core`.`PCSTR`, `languagetag` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_setdescriptionlanguage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_setdescriptionlanguage`(`iface` : `alljoyn_interfacedescription`, `language` : `windows_sys`.`core`.`PCSTR`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_setdescriptiontranslationcallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_setdescriptiontranslationcallback`(`iface` : `alljoyn_interfacedescription`, `translationcallback` : `alljoyn_interfacedescription_translation_callback_ptr`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_setmemberdescription; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_setmemberdescription`(`iface` : `alljoyn_interfacedescription`, `member` : `windows_sys`.`core`.`PCSTR`, `description` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_setmemberdescriptionforlanguage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_setmemberdescriptionforlanguage`(`iface` : `alljoyn_interfacedescription`, `member` : `windows_sys`.`core`.`PCSTR`, `description` : `windows_sys`.`core`.`PCSTR`, `languagetag` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_setpropertydescription; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_setpropertydescription`(`iface` : `alljoyn_interfacedescription`, `name` : `windows_sys`.`core`.`PCSTR`, `description` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_interfacedescription_setpropertydescriptionforlanguage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_interfacedescription_setpropertydescriptionforlanguage`(`iface` : `alljoyn_interfacedescription`, `name` : `windows_sys`.`core`.`PCSTR`, `description` : `windows_sys`.`core`.`PCSTR`, `languagetag` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_keystorelistener_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_keystorelistener_create`(`callbacks` : /* Rust *const */ kotlinx.cinterop.CPointer<`alljoyn_keystorelistener_callbacks`>?, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `alljoyn_keystorelistener`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_keystorelistener_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_keystorelistener_destroy`(`listener` : `alljoyn_keystorelistener`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_keystorelistener_getkeys; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_keystorelistener_getkeys`(`listener` : `alljoyn_keystorelistener`, `keystore` : `alljoyn_keystore`, `sink` : `windows_sys`.`core`.`PCSTR`, `sink_sz` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_keystorelistener_putkeys; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_keystorelistener_putkeys`(`listener` : `alljoyn_keystorelistener`, `keystore` : `alljoyn_keystore`, `source` : `windows_sys`.`core`.`PCSTR`, `password` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_keystorelistener_with_synchronization_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_keystorelistener_with_synchronization_create`(`callbacks` : /* Rust *const */ kotlinx.cinterop.CPointer<`alljoyn_keystorelistener_with_synchronization_callbacks`>?, `context` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `alljoyn_keystorelistener`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_message_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_message_create`(`bus` : `alljoyn_busattachment`) : `alljoyn_message`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_message_description; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_message_description`(`msg` : `alljoyn_message`, `str` : `windows_sys`.`core`.`PCSTR`, `buf` : ULong) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_message_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_message_destroy`(`msg` : `alljoyn_message`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_message_eql; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_message_eql`(`one` : `alljoyn_message`, `other` : `alljoyn_message`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_message_getarg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_message_getarg`(`msg` : `alljoyn_message`, `argn` : ULong) : `alljoyn_msgarg`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_message_getargs; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_message_getargs`(`msg` : `alljoyn_message`, `numargs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `args` : /* Rust *mut */ kotlinx.cinterop.CPointer<`alljoyn_msgarg`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_message_getauthmechanism; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_message_getauthmechanism`(`msg` : `alljoyn_message`) : `windows_sys`.`core`.`PCSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_message_getcallserial; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_message_getcallserial`(`msg` : `alljoyn_message`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_message_getcompressiontoken; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_message_getcompressiontoken`(`msg` : `alljoyn_message`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_message_getdestination; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_message_getdestination`(`msg` : `alljoyn_message`) : `windows_sys`.`core`.`PCSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_message_geterrorname; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_message_geterrorname`(`msg` : `alljoyn_message`, `errormessage` : `windows_sys`.`core`.`PCSTR`, `errormessage_size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`PCSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_message_getflags; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_message_getflags`(`msg` : `alljoyn_message`) : UByte
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_message_getinterface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_message_getinterface`(`msg` : `alljoyn_message`) : `windows_sys`.`core`.`PCSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_message_getmembername; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_message_getmembername`(`msg` : `alljoyn_message`) : `windows_sys`.`core`.`PCSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_message_getobjectpath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_message_getobjectpath`(`msg` : `alljoyn_message`) : `windows_sys`.`core`.`PCSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_message_getreceiveendpointname; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_message_getreceiveendpointname`(`msg` : `alljoyn_message`) : `windows_sys`.`core`.`PCSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_message_getreplyserial; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_message_getreplyserial`(`msg` : `alljoyn_message`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_message_getsender; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_message_getsender`(`msg` : `alljoyn_message`) : `windows_sys`.`core`.`PCSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_message_getsessionid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_message_getsessionid`(`msg` : `alljoyn_message`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_message_getsignature; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_message_getsignature`(`msg` : `alljoyn_message`) : `windows_sys`.`core`.`PCSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_message_gettimestamp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_message_gettimestamp`(`msg` : `alljoyn_message`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_message_gettype; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_message_gettype`(`msg` : `alljoyn_message`) : `alljoyn_messagetype`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_message_isbroadcastsignal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_message_isbroadcastsignal`(`msg` : `alljoyn_message`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_message_isencrypted; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_message_isencrypted`(`msg` : `alljoyn_message`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_message_isexpired; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_message_isexpired`(`msg` : `alljoyn_message`, `tillexpirems` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_message_isglobalbroadcast; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_message_isglobalbroadcast`(`msg` : `alljoyn_message`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_message_issessionless; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_message_issessionless`(`msg` : `alljoyn_message`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_message_isunreliable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_message_isunreliable`(`msg` : `alljoyn_message`) : Int
// UNSUPPORTED Rust 328:1: foreign declaration requires explicit native target and interop package; syntax: foreign signature shape unsupported
// windows_link::link!("msajapi.dll" "C" fn alljoyn_message_parseargs(msg : alljoyn_message, signature : windows_sys::core::PCSTR, ...) -> QStatus);

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_message_setendianess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_message_setendianess`(`endian` : Byte)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_message_tostring; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_message_tostring`(`msg` : `alljoyn_message`, `str` : `windows_sys`.`core`.`PCSTR`, `buf` : ULong) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_array_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_array_create`(`size` : ULong) : `alljoyn_msgarg`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_array_element; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_array_element`(`arg` : `alljoyn_msgarg`, `index` : ULong) : `alljoyn_msgarg`
// UNSUPPORTED Rust 333:1: foreign declaration requires explicit native target and interop package; syntax: foreign signature shape unsupported
// windows_link::link!("msajapi.dll" "C" fn alljoyn_msgarg_array_get(args : alljoyn_msgarg, numargs : usize, signature : windows_sys::core::PCSTR, ...) -> QStatus);

// UNSUPPORTED Rust 334:1: foreign declaration requires explicit native target and interop package; syntax: foreign signature shape unsupported
// windows_link::link!("msajapi.dll" "C" fn alljoyn_msgarg_array_set(args : alljoyn_msgarg, numargs : *mut usize, signature : windows_sys::core::PCSTR, ...) -> QStatus);

// UNSUPPORTED Rust 335:1: foreign declaration requires explicit native target and interop package; syntax: foreign signature shape unsupported
// windows_link::link!("msajapi.dll" "C" fn alljoyn_msgarg_array_set_offset(args : alljoyn_msgarg, argoffset : usize, numargs : *mut usize, signature : windows_sys::core::PCSTR, ...) -> QStatus);

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_array_signature; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_array_signature`(`values` : `alljoyn_msgarg`, `numvalues` : ULong, `str` : `windows_sys`.`core`.`PCSTR`, `buf` : ULong) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_array_tostring; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_array_tostring`(`args` : `alljoyn_msgarg`, `numargs` : ULong, `str` : `windows_sys`.`core`.`PCSTR`, `buf` : ULong, `indent` : ULong) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_clear; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_clear`(`arg` : `alljoyn_msgarg`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_clone; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_clone`(`destination` : `alljoyn_msgarg`, `source` : `alljoyn_msgarg`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_copy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_copy`(`source` : `alljoyn_msgarg`) : `alljoyn_msgarg`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_create`() : `alljoyn_msgarg`
// UNSUPPORTED Rust 342:1: foreign declaration requires explicit native target and interop package; syntax: foreign signature shape unsupported
// windows_link::link!("msajapi.dll" "C" fn alljoyn_msgarg_create_and_set(signature : windows_sys::core::PCSTR, ...) -> alljoyn_msgarg);

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_destroy`(`arg` : `alljoyn_msgarg`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_equal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_equal`(`lhv` : `alljoyn_msgarg`, `rhv` : `alljoyn_msgarg`) : Int
// UNSUPPORTED Rust 345:1: foreign declaration requires explicit native target and interop package; syntax: foreign signature shape unsupported
// windows_link::link!("msajapi.dll" "C" fn alljoyn_msgarg_get(arg : alljoyn_msgarg, signature : windows_sys::core::PCSTR, ...) -> QStatus);

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_get_array_element; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_get_array_element`(`arg` : `alljoyn_msgarg`, `index` : ULong, `element` : /* Rust *mut */ kotlinx.cinterop.CPointer<`alljoyn_msgarg`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_get_array_elementsignature; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_get_array_elementsignature`(`arg` : `alljoyn_msgarg`, `index` : ULong) : `windows_sys`.`core`.`PCSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_get_array_numberofelements; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_get_array_numberofelements`(`arg` : `alljoyn_msgarg`) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_get_bool; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_get_bool`(`arg` : `alljoyn_msgarg`, `b` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_get_bool_array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_get_bool_array`(`arg` : `alljoyn_msgarg`, `length` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `ab` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_get_double; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_get_double`(`arg` : `alljoyn_msgarg`, `d` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_get_double_array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_get_double_array`(`arg` : `alljoyn_msgarg`, `length` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `ad` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_get_int16; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_get_int16`(`arg` : `alljoyn_msgarg`, `n` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_get_int16_array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_get_int16_array`(`arg` : `alljoyn_msgarg`, `length` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `an` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_get_int32; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_get_int32`(`arg` : `alljoyn_msgarg`, `i` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_get_int32_array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_get_int32_array`(`arg` : `alljoyn_msgarg`, `length` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `ai` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_get_int64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_get_int64`(`arg` : `alljoyn_msgarg`, `x` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_get_int64_array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_get_int64_array`(`arg` : `alljoyn_msgarg`, `length` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `ax` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_get_objectpath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_get_objectpath`(`arg` : `alljoyn_msgarg`, `o` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_get_signature; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_get_signature`(`arg` : `alljoyn_msgarg`, `g` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_get_string; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_get_string`(`arg` : `alljoyn_msgarg`, `s` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_get_uint16; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_get_uint16`(`arg` : `alljoyn_msgarg`, `q` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_get_uint16_array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_get_uint16_array`(`arg` : `alljoyn_msgarg`, `length` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `aq` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_get_uint32; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_get_uint32`(`arg` : `alljoyn_msgarg`, `u` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_get_uint32_array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_get_uint32_array`(`arg` : `alljoyn_msgarg`, `length` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `au` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_get_uint64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_get_uint64`(`arg` : `alljoyn_msgarg`, `t` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_get_uint64_array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_get_uint64_array`(`arg` : `alljoyn_msgarg`, `length` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `at` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_get_uint8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_get_uint8`(`arg` : `alljoyn_msgarg`, `y` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_get_uint8_array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_get_uint8_array`(`arg` : `alljoyn_msgarg`, `length` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `ay` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_get_variant; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_get_variant`(`arg` : `alljoyn_msgarg`, `v` : `alljoyn_msgarg`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_get_variant_array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_get_variant_array`(`arg` : `alljoyn_msgarg`, `signature` : `windows_sys`.`core`.`PCSTR`, `length` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `av` : /* Rust *mut */ kotlinx.cinterop.CPointer<`alljoyn_msgarg`>?) : `QStatus`
// UNSUPPORTED Rust 372:1: foreign declaration requires explicit native target and interop package; syntax: foreign signature shape unsupported
// windows_link::link!("msajapi.dll" "C" fn alljoyn_msgarg_getdictelement(arg : alljoyn_msgarg, elemsig : windows_sys::core::PCSTR, ...) -> QStatus);

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_getkey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_getkey`(`arg` : `alljoyn_msgarg`) : `alljoyn_msgarg`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_getmember; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_getmember`(`arg` : `alljoyn_msgarg`, `index` : ULong) : `alljoyn_msgarg`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_getnummembers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_getnummembers`(`arg` : `alljoyn_msgarg`) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_gettype; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_gettype`(`arg` : `alljoyn_msgarg`) : `alljoyn_typeid`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_getvalue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_getvalue`(`arg` : `alljoyn_msgarg`) : `alljoyn_msgarg`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_hassignature; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_hassignature`(`arg` : `alljoyn_msgarg`, `signature` : `windows_sys`.`core`.`PCSTR`) : Int
// UNSUPPORTED Rust 379:1: foreign declaration requires explicit native target and interop package; syntax: foreign signature shape unsupported
// windows_link::link!("msajapi.dll" "C" fn alljoyn_msgarg_set(arg : alljoyn_msgarg, signature : windows_sys::core::PCSTR, ...) -> QStatus);

// UNSUPPORTED Rust 380:1: foreign declaration requires explicit native target and interop package; syntax: foreign signature shape unsupported
// windows_link::link!("msajapi.dll" "C" fn alljoyn_msgarg_set_and_stabilize(arg : alljoyn_msgarg, signature : windows_sys::core::PCSTR, ...) -> QStatus);

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_set_bool; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_set_bool`(`arg` : `alljoyn_msgarg`, `b` : Int) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_set_bool_array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_set_bool_array`(`arg` : `alljoyn_msgarg`, `length` : ULong, `ab` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_set_double; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_set_double`(`arg` : `alljoyn_msgarg`, `d` : Double) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_set_double_array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_set_double_array`(`arg` : `alljoyn_msgarg`, `length` : ULong, `ad` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_set_int16; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_set_int16`(`arg` : `alljoyn_msgarg`, `n` : Short) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_set_int16_array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_set_int16_array`(`arg` : `alljoyn_msgarg`, `length` : ULong, `an` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_set_int32; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_set_int32`(`arg` : `alljoyn_msgarg`, `i` : Int) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_set_int32_array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_set_int32_array`(`arg` : `alljoyn_msgarg`, `length` : ULong, `ai` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_set_int64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_set_int64`(`arg` : `alljoyn_msgarg`, `x` : Long) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_set_int64_array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_set_int64_array`(`arg` : `alljoyn_msgarg`, `length` : ULong, `ax` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_set_objectpath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_set_objectpath`(`arg` : `alljoyn_msgarg`, `o` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_set_objectpath_array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_set_objectpath_array`(`arg` : `alljoyn_msgarg`, `length` : ULong, `ao` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_set_signature; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_set_signature`(`arg` : `alljoyn_msgarg`, `g` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_set_signature_array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_set_signature_array`(`arg` : `alljoyn_msgarg`, `length` : ULong, `ag` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_set_string; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_set_string`(`arg` : `alljoyn_msgarg`, `s` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_set_string_array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_set_string_array`(`arg` : `alljoyn_msgarg`, `length` : ULong, `as` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_set_uint16; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_set_uint16`(`arg` : `alljoyn_msgarg`, `q` : UShort) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_set_uint16_array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_set_uint16_array`(`arg` : `alljoyn_msgarg`, `length` : ULong, `aq` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_set_uint32; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_set_uint32`(`arg` : `alljoyn_msgarg`, `u` : UInt) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_set_uint32_array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_set_uint32_array`(`arg` : `alljoyn_msgarg`, `length` : ULong, `au` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_set_uint64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_set_uint64`(`arg` : `alljoyn_msgarg`, `t` : ULong) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_set_uint64_array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_set_uint64_array`(`arg` : `alljoyn_msgarg`, `length` : ULong, `at` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_set_uint8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_set_uint8`(`arg` : `alljoyn_msgarg`, `y` : UByte) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_set_uint8_array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_set_uint8_array`(`arg` : `alljoyn_msgarg`, `length` : ULong, `ay` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_setdictentry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_setdictentry`(`arg` : `alljoyn_msgarg`, `key` : `alljoyn_msgarg`, `value` : `alljoyn_msgarg`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_setstruct; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_setstruct`(`arg` : `alljoyn_msgarg`, `struct_members` : `alljoyn_msgarg`, `num_members` : ULong) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_signature; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_signature`(`arg` : `alljoyn_msgarg`, `str` : `windows_sys`.`core`.`PCSTR`, `buf` : ULong) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_stabilize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_stabilize`(`arg` : `alljoyn_msgarg`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_msgarg_tostring; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_msgarg_tostring`(`arg` : `alljoyn_msgarg`, `str` : `windows_sys`.`core`.`PCSTR`, `buf` : ULong, `indent` : ULong) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_observer_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_observer_create`(`bus` : `alljoyn_busattachment`, `mandatoryinterfaces` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `nummandatoryinterfaces` : ULong) : `alljoyn_observer`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_observer_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_observer_destroy`(`observer` : `alljoyn_observer`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_observer_get; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_observer_get`(`observer` : `alljoyn_observer`, `uniquebusname` : `windows_sys`.`core`.`PCSTR`, `objectpath` : `windows_sys`.`core`.`PCSTR`) : `alljoyn_proxybusobject_ref`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_observer_getfirst; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_observer_getfirst`(`observer` : `alljoyn_observer`) : `alljoyn_proxybusobject_ref`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_observer_getnext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_observer_getnext`(`observer` : `alljoyn_observer`, `proxyref` : `alljoyn_proxybusobject_ref`) : `alljoyn_proxybusobject_ref`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_observer_registerlistener; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_observer_registerlistener`(`observer` : `alljoyn_observer`, `listener` : `alljoyn_observerlistener`, `triggeronexisting` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_observer_unregisteralllisteners; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_observer_unregisteralllisteners`(`observer` : `alljoyn_observer`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_observer_unregisterlistener; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_observer_unregisterlistener`(`observer` : `alljoyn_observer`, `listener` : `alljoyn_observerlistener`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_observerlistener_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_observerlistener_create`(`callback` : /* Rust *const */ kotlinx.cinterop.CPointer<`alljoyn_observerlistener_callback`>?, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `alljoyn_observerlistener`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_observerlistener_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_observerlistener_destroy`(`listener` : `alljoyn_observerlistener`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_passwordmanager_setcredentials; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_passwordmanager_setcredentials`(`authmechanism` : `windows_sys`.`core`.`PCSTR`, `password` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurationlistener_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurationlistener_create`(`callbacks` : /* Rust *const */ kotlinx.cinterop.CPointer<`alljoyn_permissionconfigurationlistener_callbacks`>?, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `alljoyn_permissionconfigurationlistener`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurationlistener_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurationlistener_destroy`(`listener` : `alljoyn_permissionconfigurationlistener`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_certificatechain_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_certificatechain_destroy`(`certificatechain` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_certificateid_cleanup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_certificateid_cleanup`(`certificateid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`alljoyn_certificateid`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_certificateidarray_cleanup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_certificateidarray_cleanup`(`certificateidarray` : /* Rust *mut */ kotlinx.cinterop.CPointer<`alljoyn_certificateidarray`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_claim; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_claim`(`configurator` : `alljoyn_permissionconfigurator`, `cakey` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `identitycertificatechain` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `groupid` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `groupsize` : ULong, `groupauthority` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `manifestsxmls` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `manifestscount` : ULong) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_endmanagement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_endmanagement`(`configurator` : `alljoyn_permissionconfigurator`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_getapplicationstate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_getapplicationstate`(`configurator` : `alljoyn_permissionconfigurator`, `state` : /* Rust *mut */ kotlinx.cinterop.CPointer<`alljoyn_applicationstate`>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_getclaimcapabilities; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_getclaimcapabilities`(`configurator` : `alljoyn_permissionconfigurator`, `claimcapabilities` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_getclaimcapabilitiesadditionalinfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_getclaimcapabilitiesadditionalinfo`(`configurator` : `alljoyn_permissionconfigurator`, `additionalinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_getdefaultclaimcapabilities; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_getdefaultclaimcapabilities`() : UShort
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_getdefaultpolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_getdefaultpolicy`(`configurator` : `alljoyn_permissionconfigurator`, `policyxml` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_getidentity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_getidentity`(`configurator` : `alljoyn_permissionconfigurator`, `identitycertificatechain` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_getidentitycertificateid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_getidentitycertificateid`(`configurator` : `alljoyn_permissionconfigurator`, `certificateid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`alljoyn_certificateid`>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_getmanifests; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_getmanifests`(`configurator` : `alljoyn_permissionconfigurator`, `manifestarray` : /* Rust *mut */ kotlinx.cinterop.CPointer<`alljoyn_manifestarray`>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_getmanifesttemplate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_getmanifesttemplate`(`configurator` : `alljoyn_permissionconfigurator`, `manifesttemplatexml` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_getmembershipsummaries; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_getmembershipsummaries`(`configurator` : `alljoyn_permissionconfigurator`, `certificateids` : /* Rust *mut */ kotlinx.cinterop.CPointer<`alljoyn_certificateidarray`>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_getpolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_getpolicy`(`configurator` : `alljoyn_permissionconfigurator`, `policyxml` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_getpublickey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_getpublickey`(`configurator` : `alljoyn_permissionconfigurator`, `publickey` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_installmanifests; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_installmanifests`(`configurator` : `alljoyn_permissionconfigurator`, `manifestsxmls` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `manifestscount` : ULong, `append` : Int) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_installmembership; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_installmembership`(`configurator` : `alljoyn_permissionconfigurator`, `membershipcertificatechain` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_manifestarray_cleanup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_manifestarray_cleanup`(`manifestarray` : /* Rust *mut */ kotlinx.cinterop.CPointer<`alljoyn_manifestarray`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_manifesttemplate_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_manifesttemplate_destroy`(`manifesttemplatexml` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_policy_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_policy_destroy`(`policyxml` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_publickey_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_publickey_destroy`(`publickey` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_removemembership; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_removemembership`(`configurator` : `alljoyn_permissionconfigurator`, `serial` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `seriallen` : ULong, `issuerpublickey` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `issueraki` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `issuerakilen` : ULong) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_reset; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_reset`(`configurator` : `alljoyn_permissionconfigurator`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_resetpolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_resetpolicy`(`configurator` : `alljoyn_permissionconfigurator`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_setapplicationstate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_setapplicationstate`(`configurator` : `alljoyn_permissionconfigurator`, `state` : `alljoyn_applicationstate`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_setclaimcapabilities; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_setclaimcapabilities`(`configurator` : `alljoyn_permissionconfigurator`, `claimcapabilities` : UShort) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_setclaimcapabilitiesadditionalinfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_setclaimcapabilitiesadditionalinfo`(`configurator` : `alljoyn_permissionconfigurator`, `additionalinfo` : UShort) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_setmanifesttemplatefromxml; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_setmanifesttemplatefromxml`(`configurator` : `alljoyn_permissionconfigurator`, `manifesttemplatexml` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_startmanagement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_startmanagement`(`configurator` : `alljoyn_permissionconfigurator`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_updateidentity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_updateidentity`(`configurator` : `alljoyn_permissionconfigurator`, `identitycertificatechain` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `manifestsxmls` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `manifestscount` : ULong) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_permissionconfigurator_updatepolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_permissionconfigurator_updatepolicy`(`configurator` : `alljoyn_permissionconfigurator`, `policyxml` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_pinglistener_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_pinglistener_create`(`callback` : /* Rust *const */ kotlinx.cinterop.CPointer<`alljoyn_pinglistener_callback`>?, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `alljoyn_pinglistener`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_pinglistener_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_pinglistener_destroy`(`listener` : `alljoyn_pinglistener`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_addchild; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_addchild`(`proxyobj` : `alljoyn_proxybusobject`, `child` : `alljoyn_proxybusobject`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_addinterface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_addinterface`(`proxyobj` : `alljoyn_proxybusobject`, `iface` : `alljoyn_interfacedescription`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_addinterface_by_name; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_addinterface_by_name`(`proxyobj` : `alljoyn_proxybusobject`, `name` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_copy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_copy`(`source` : `alljoyn_proxybusobject`) : `alljoyn_proxybusobject`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_create`(`bus` : `alljoyn_busattachment`, `service` : `windows_sys`.`core`.`PCSTR`, `path` : `windows_sys`.`core`.`PCSTR`, `sessionid` : UInt) : `alljoyn_proxybusobject`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_create_secure; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_create_secure`(`bus` : `alljoyn_busattachment`, `service` : `windows_sys`.`core`.`PCSTR`, `path` : `windows_sys`.`core`.`PCSTR`, `sessionid` : UInt) : `alljoyn_proxybusobject`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_destroy`(`proxyobj` : `alljoyn_proxybusobject`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_enablepropertycaching; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_enablepropertycaching`(`proxyobj` : `alljoyn_proxybusobject`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_getallproperties; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_getallproperties`(`proxyobj` : `alljoyn_proxybusobject`, `iface` : `windows_sys`.`core`.`PCSTR`, `values` : `alljoyn_msgarg`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_getallpropertiesasync; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_getallpropertiesasync`(`proxyobj` : `alljoyn_proxybusobject`, `iface` : `windows_sys`.`core`.`PCSTR`, `callback` : `alljoyn_proxybusobject_listener_getallpropertiescb_ptr`, `timeout` : UInt, `context` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_getchild; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_getchild`(`proxyobj` : `alljoyn_proxybusobject`, `path` : `windows_sys`.`core`.`PCSTR`) : `alljoyn_proxybusobject`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_getchildren; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_getchildren`(`proxyobj` : `alljoyn_proxybusobject`, `children` : /* Rust *mut */ kotlinx.cinterop.CPointer<`alljoyn_proxybusobject`>?, `numchildren` : ULong) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_getinterface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_getinterface`(`proxyobj` : `alljoyn_proxybusobject`, `iface` : `windows_sys`.`core`.`PCSTR`) : `alljoyn_interfacedescription`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_getinterfaces; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_getinterfaces`(`proxyobj` : `alljoyn_proxybusobject`, `ifaces` : /* Rust *const */ kotlinx.cinterop.CPointer<`alljoyn_interfacedescription`>?, `numifaces` : ULong) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_getpath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_getpath`(`proxyobj` : `alljoyn_proxybusobject`) : `windows_sys`.`core`.`PCSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_getproperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_getproperty`(`proxyobj` : `alljoyn_proxybusobject`, `iface` : `windows_sys`.`core`.`PCSTR`, `property` : `windows_sys`.`core`.`PCSTR`, `value` : `alljoyn_msgarg`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_getpropertyasync; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_getpropertyasync`(`proxyobj` : `alljoyn_proxybusobject`, `iface` : `windows_sys`.`core`.`PCSTR`, `property` : `windows_sys`.`core`.`PCSTR`, `callback` : `alljoyn_proxybusobject_listener_getpropertycb_ptr`, `timeout` : UInt, `context` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_getservicename; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_getservicename`(`proxyobj` : `alljoyn_proxybusobject`) : `windows_sys`.`core`.`PCSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_getsessionid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_getsessionid`(`proxyobj` : `alljoyn_proxybusobject`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_getuniquename; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_getuniquename`(`proxyobj` : `alljoyn_proxybusobject`) : `windows_sys`.`core`.`PCSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_implementsinterface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_implementsinterface`(`proxyobj` : `alljoyn_proxybusobject`, `iface` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_introspectremoteobject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_introspectremoteobject`(`proxyobj` : `alljoyn_proxybusobject`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_introspectremoteobjectasync; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_introspectremoteobjectasync`(`proxyobj` : `alljoyn_proxybusobject`, `callback` : `alljoyn_proxybusobject_listener_introspectcb_ptr`, `context` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_issecure; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_issecure`(`proxyobj` : `alljoyn_proxybusobject`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_isvalid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_isvalid`(`proxyobj` : `alljoyn_proxybusobject`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_methodcall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_methodcall`(`proxyobj` : `alljoyn_proxybusobject`, `ifacename` : `windows_sys`.`core`.`PCSTR`, `methodname` : `windows_sys`.`core`.`PCSTR`, `args` : `alljoyn_msgarg`, `numargs` : ULong, `replymsg` : `alljoyn_message`, `timeout` : UInt, `flags` : UByte) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_methodcall_member; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_methodcall_member`(`proxyobj` : `alljoyn_proxybusobject`, `method` : `alljoyn_interfacedescription_member`, `args` : `alljoyn_msgarg`, `numargs` : ULong, `replymsg` : `alljoyn_message`, `timeout` : UInt, `flags` : UByte) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_methodcall_member_noreply; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_methodcall_member_noreply`(`proxyobj` : `alljoyn_proxybusobject`, `method` : `alljoyn_interfacedescription_member`, `args` : `alljoyn_msgarg`, `numargs` : ULong, `flags` : UByte) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_methodcall_noreply; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_methodcall_noreply`(`proxyobj` : `alljoyn_proxybusobject`, `ifacename` : `windows_sys`.`core`.`PCSTR`, `methodname` : `windows_sys`.`core`.`PCSTR`, `args` : `alljoyn_msgarg`, `numargs` : ULong, `flags` : UByte) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_methodcallasync; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_methodcallasync`(`proxyobj` : `alljoyn_proxybusobject`, `ifacename` : `windows_sys`.`core`.`PCSTR`, `methodname` : `windows_sys`.`core`.`PCSTR`, `replyfunc` : `alljoyn_messagereceiver_replyhandler_ptr`, `args` : `alljoyn_msgarg`, `numargs` : ULong, `context` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `timeout` : UInt, `flags` : UByte) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_methodcallasync_member; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_methodcallasync_member`(`proxyobj` : `alljoyn_proxybusobject`, `method` : `alljoyn_interfacedescription_member`, `replyfunc` : `alljoyn_messagereceiver_replyhandler_ptr`, `args` : `alljoyn_msgarg`, `numargs` : ULong, `context` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `timeout` : UInt, `flags` : UByte) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_parsexml; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_parsexml`(`proxyobj` : `alljoyn_proxybusobject`, `xml` : `windows_sys`.`core`.`PCSTR`, `identifier` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_ref_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_ref_create`(`proxy` : `alljoyn_proxybusobject`) : `alljoyn_proxybusobject_ref`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_ref_decref; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_ref_decref`(`ref` : `alljoyn_proxybusobject_ref`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_ref_get; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_ref_get`(`ref` : `alljoyn_proxybusobject_ref`) : `alljoyn_proxybusobject`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_ref_incref; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_ref_incref`(`ref` : `alljoyn_proxybusobject_ref`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_registerpropertieschangedlistener; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_registerpropertieschangedlistener`(`proxyobj` : `alljoyn_proxybusobject`, `iface` : `windows_sys`.`core`.`PCSTR`, `properties` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `numproperties` : ULong, `callback` : `alljoyn_proxybusobject_listener_propertieschanged_ptr`, `context` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_removechild; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_removechild`(`proxyobj` : `alljoyn_proxybusobject`, `path` : `windows_sys`.`core`.`PCSTR`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_secureconnection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_secureconnection`(`proxyobj` : `alljoyn_proxybusobject`, `forceauth` : Int) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_secureconnectionasync; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_secureconnectionasync`(`proxyobj` : `alljoyn_proxybusobject`, `forceauth` : Int) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_setproperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_setproperty`(`proxyobj` : `alljoyn_proxybusobject`, `iface` : `windows_sys`.`core`.`PCSTR`, `property` : `windows_sys`.`core`.`PCSTR`, `value` : `alljoyn_msgarg`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_setpropertyasync; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_setpropertyasync`(`proxyobj` : `alljoyn_proxybusobject`, `iface` : `windows_sys`.`core`.`PCSTR`, `property` : `windows_sys`.`core`.`PCSTR`, `value` : `alljoyn_msgarg`, `callback` : `alljoyn_proxybusobject_listener_setpropertycb_ptr`, `timeout` : UInt, `context` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_proxybusobject_unregisterpropertieschangedlistener; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_proxybusobject_unregisterpropertieschangedlistener`(`proxyobj` : `alljoyn_proxybusobject`, `iface` : `windows_sys`.`core`.`PCSTR`, `callback` : `alljoyn_proxybusobject_listener_propertieschanged_ptr`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_routerinit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_routerinit`() : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_routerinitwithconfig; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_routerinitwithconfig`(`configxml` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_routershutdown; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_routershutdown`() : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_securityapplicationproxy_claim; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_securityapplicationproxy_claim`(`proxy` : `alljoyn_securityapplicationproxy`, `cakey` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `identitycertificatechain` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `groupid` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `groupsize` : ULong, `groupauthority` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `manifestsxmls` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `manifestscount` : ULong) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_securityapplicationproxy_computemanifestdigest; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_securityapplicationproxy_computemanifestdigest`(`unsignedmanifestxml` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `identitycertificatepem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `digest` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `digestsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_securityapplicationproxy_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_securityapplicationproxy_create`(`bus` : `alljoyn_busattachment`, `appbusname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `sessionid` : UInt) : `alljoyn_securityapplicationproxy`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_securityapplicationproxy_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_securityapplicationproxy_destroy`(`proxy` : `alljoyn_securityapplicationproxy`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_securityapplicationproxy_digest_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_securityapplicationproxy_digest_destroy`(`digest` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_securityapplicationproxy_eccpublickey_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_securityapplicationproxy_eccpublickey_destroy`(`eccpublickey` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_securityapplicationproxy_endmanagement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_securityapplicationproxy_endmanagement`(`proxy` : `alljoyn_securityapplicationproxy`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_securityapplicationproxy_getapplicationstate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_securityapplicationproxy_getapplicationstate`(`proxy` : `alljoyn_securityapplicationproxy`, `applicationstate` : /* Rust *mut */ kotlinx.cinterop.CPointer<`alljoyn_applicationstate`>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_securityapplicationproxy_getclaimcapabilities; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_securityapplicationproxy_getclaimcapabilities`(`proxy` : `alljoyn_securityapplicationproxy`, `capabilities` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_securityapplicationproxy_getclaimcapabilitiesadditionalinfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_securityapplicationproxy_getclaimcapabilitiesadditionalinfo`(`proxy` : `alljoyn_securityapplicationproxy`, `additionalinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_securityapplicationproxy_getdefaultpolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_securityapplicationproxy_getdefaultpolicy`(`proxy` : `alljoyn_securityapplicationproxy`, `policyxml` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_securityapplicationproxy_geteccpublickey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_securityapplicationproxy_geteccpublickey`(`proxy` : `alljoyn_securityapplicationproxy`, `eccpublickey` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_securityapplicationproxy_getmanifesttemplate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_securityapplicationproxy_getmanifesttemplate`(`proxy` : `alljoyn_securityapplicationproxy`, `manifesttemplatexml` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_securityapplicationproxy_getpermissionmanagementsessionport; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_securityapplicationproxy_getpermissionmanagementsessionport`() : UShort
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_securityapplicationproxy_getpolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_securityapplicationproxy_getpolicy`(`proxy` : `alljoyn_securityapplicationproxy`, `policyxml` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_securityapplicationproxy_installmembership; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_securityapplicationproxy_installmembership`(`proxy` : `alljoyn_securityapplicationproxy`, `membershipcertificatechain` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_securityapplicationproxy_manifest_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_securityapplicationproxy_manifest_destroy`(`signedmanifestxml` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_securityapplicationproxy_manifesttemplate_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_securityapplicationproxy_manifesttemplate_destroy`(`manifesttemplatexml` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_securityapplicationproxy_policy_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_securityapplicationproxy_policy_destroy`(`policyxml` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_securityapplicationproxy_reset; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_securityapplicationproxy_reset`(`proxy` : `alljoyn_securityapplicationproxy`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_securityapplicationproxy_resetpolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_securityapplicationproxy_resetpolicy`(`proxy` : `alljoyn_securityapplicationproxy`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_securityapplicationproxy_setmanifestsignature; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_securityapplicationproxy_setmanifestsignature`(`unsignedmanifestxml` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `identitycertificatepem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `signature` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `signaturesize` : ULong, `signedmanifestxml` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_securityapplicationproxy_signmanifest; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_securityapplicationproxy_signmanifest`(`unsignedmanifestxml` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `identitycertificatepem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `signingprivatekeypem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `signedmanifestxml` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_securityapplicationproxy_startmanagement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_securityapplicationproxy_startmanagement`(`proxy` : `alljoyn_securityapplicationproxy`) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_securityapplicationproxy_updateidentity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_securityapplicationproxy_updateidentity`(`proxy` : `alljoyn_securityapplicationproxy`, `identitycertificatechain` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `manifestsxmls` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `manifestscount` : ULong) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_securityapplicationproxy_updatepolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_securityapplicationproxy_updatepolicy`(`proxy` : `alljoyn_securityapplicationproxy`, `policyxml` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?) : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_sessionlistener_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_sessionlistener_create`(`callbacks` : /* Rust *const */ kotlinx.cinterop.CPointer<`alljoyn_sessionlistener_callbacks`>?, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `alljoyn_sessionlistener`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_sessionlistener_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_sessionlistener_destroy`(`listener` : `alljoyn_sessionlistener`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_sessionopts_cmp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_sessionopts_cmp`(`one` : `alljoyn_sessionopts`, `other` : `alljoyn_sessionopts`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_sessionopts_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_sessionopts_create`(`traffic` : UByte, `ismultipoint` : Int, `proximity` : UByte, `transports` : UShort) : `alljoyn_sessionopts`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_sessionopts_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_sessionopts_destroy`(`opts` : `alljoyn_sessionopts`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_sessionopts_get_multipoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_sessionopts_get_multipoint`(`opts` : `alljoyn_sessionopts`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_sessionopts_get_proximity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_sessionopts_get_proximity`(`opts` : `alljoyn_sessionopts`) : UByte
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_sessionopts_get_traffic; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_sessionopts_get_traffic`(`opts` : `alljoyn_sessionopts`) : UByte
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_sessionopts_get_transports; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_sessionopts_get_transports`(`opts` : `alljoyn_sessionopts`) : UShort
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_sessionopts_iscompatible; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_sessionopts_iscompatible`(`one` : `alljoyn_sessionopts`, `other` : `alljoyn_sessionopts`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_sessionopts_set_multipoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_sessionopts_set_multipoint`(`opts` : `alljoyn_sessionopts`, `ismultipoint` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_sessionopts_set_proximity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_sessionopts_set_proximity`(`opts` : `alljoyn_sessionopts`, `proximity` : UByte)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_sessionopts_set_traffic; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_sessionopts_set_traffic`(`opts` : `alljoyn_sessionopts`, `traffic` : UByte)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_sessionopts_set_transports; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_sessionopts_set_transports`(`opts` : `alljoyn_sessionopts`, `transports` : UShort)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_sessionportlistener_create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_sessionportlistener_create`(`callbacks` : /* Rust *const */ kotlinx.cinterop.CPointer<`alljoyn_sessionportlistener_callbacks`>?, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `alljoyn_sessionportlistener`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_sessionportlistener_destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_sessionportlistener_destroy`(`listener` : `alljoyn_sessionportlistener`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_shutdown; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_shutdown`() : `QStatus`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_unity_deferred_callbacks_process; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_unity_deferred_callbacks_process`() : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msajapi.dll, ABI=system, export=alljoyn_unity_set_deferred_callback_mainthread_only; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `alljoyn_unity_set_deferred_callback_mainthread_only`(`mainthread_only` : Int)
public const val `AJ_IFC_SECURITY_INHERIT`: `alljoyn_interfacedescription_securitypolicy` = 0;
public const val `AJ_IFC_SECURITY_OFF`: `alljoyn_interfacedescription_securitypolicy` = 2;
public const val `AJ_IFC_SECURITY_REQUIRED`: `alljoyn_interfacedescription_securitypolicy` = 1;
public const val `ALLJOYN_ARRAY`: `alljoyn_typeid` = 97;
public const val `ALLJOYN_BIG_ENDIAN`: UByte = 66u;
public const val `ALLJOYN_BOOLEAN`: `alljoyn_typeid` = 98;
public const val `ALLJOYN_BOOLEAN_ARRAY`: `alljoyn_typeid` = 25185;
public const val `ALLJOYN_BYTE`: `alljoyn_typeid` = 121;
public const val `ALLJOYN_BYTE_ARRAY`: `alljoyn_typeid` = 31073;
public const val `ALLJOYN_CRED_CERT_CHAIN`: UShort = 4u;
public const val `ALLJOYN_CRED_EXPIRATION`: UShort = 32u;
public const val `ALLJOYN_CRED_LOGON_ENTRY`: UShort = 16u;
public const val `ALLJOYN_CRED_NEW_PASSWORD`: UShort = 4097u;
public const val `ALLJOYN_CRED_ONE_TIME_PWD`: UShort = 8193u;
public const val `ALLJOYN_CRED_PASSWORD`: UShort = 1u;
public const val `ALLJOYN_CRED_PRIVATE_KEY`: UShort = 8u;
public const val `ALLJOYN_CRED_USER_NAME`: UShort = 2u;
public const val `ALLJOYN_DICT_ENTRY`: `alljoyn_typeid` = 101;
public const val `ALLJOYN_DICT_ENTRY_CLOSE`: `alljoyn_typeid` = 125;
public const val `ALLJOYN_DICT_ENTRY_OPEN`: `alljoyn_typeid` = 123;
public const val `ALLJOYN_DISCONNECTED`: UInt = 4u;
public const val `ALLJOYN_DOUBLE`: `alljoyn_typeid` = 100;
public const val `ALLJOYN_DOUBLE_ARRAY`: `alljoyn_typeid` = 25697;
public const val `ALLJOYN_HANDLE`: `alljoyn_typeid` = 104;
public const val `ALLJOYN_INT16`: `alljoyn_typeid` = 110;
public const val `ALLJOYN_INT16_ARRAY`: `alljoyn_typeid` = 28257;
public const val `ALLJOYN_INT32`: `alljoyn_typeid` = 105;
public const val `ALLJOYN_INT32_ARRAY`: `alljoyn_typeid` = 26977;
public const val `ALLJOYN_INT64`: `alljoyn_typeid` = 120;
public const val `ALLJOYN_INT64_ARRAY`: `alljoyn_typeid` = 30817;
public const val `ALLJOYN_INVALID`: `alljoyn_typeid` = 0;
public const val `ALLJOYN_LITTLE_ENDIAN`: UByte = 108u;
public const val `ALLJOYN_MEMBER_ANNOTATE_DEPRECATED`: UByte = 2u;
public const val `ALLJOYN_MEMBER_ANNOTATE_GLOBAL_BROADCAST`: UByte = 32u;
public const val `ALLJOYN_MEMBER_ANNOTATE_NO_REPLY`: UByte = 1u;
public const val `ALLJOYN_MEMBER_ANNOTATE_SESSIONCAST`: UByte = 4u;
public const val `ALLJOYN_MEMBER_ANNOTATE_SESSIONLESS`: UByte = 8u;
public const val `ALLJOYN_MEMBER_ANNOTATE_UNICAST`: UByte = 16u;
public const val `ALLJOYN_MESSAGE_DEFAULT_TIMEOUT`: UInt = 25000u;
public const val `ALLJOYN_MESSAGE_ERROR`: `alljoyn_messagetype` = 3;
public const val `ALLJOYN_MESSAGE_FLAG_ALLOW_REMOTE_MSG`: UInt = 4u;
public const val `ALLJOYN_MESSAGE_FLAG_AUTO_START`: UInt = 2u;
public const val `ALLJOYN_MESSAGE_FLAG_ENCRYPTED`: UInt = 128u;
public const val `ALLJOYN_MESSAGE_FLAG_GLOBAL_BROADCAST`: UInt = 32u;
public const val `ALLJOYN_MESSAGE_FLAG_NO_REPLY_EXPECTED`: UInt = 1u;
public const val `ALLJOYN_MESSAGE_FLAG_SESSIONLESS`: UInt = 16u;
public const val `ALLJOYN_MESSAGE_INVALID`: `alljoyn_messagetype` = 0;
public const val `ALLJOYN_MESSAGE_METHOD_CALL`: `alljoyn_messagetype` = 1;
public const val `ALLJOYN_MESSAGE_METHOD_RET`: `alljoyn_messagetype` = 2;
public const val `ALLJOYN_MESSAGE_SIGNAL`: `alljoyn_messagetype` = 4;
// UNSUPPORTED Rust 599:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ALLJOYN_NAMED_PIPE_CONNECT_SPEC: windows_sys::core::PCWSTR = windows_sys::core::w!("npipe:");

public const val `ALLJOYN_OBJECT_PATH`: `alljoyn_typeid` = 111;
public const val `ALLJOYN_PROP_ACCESS_READ`: UByte = 1u;
public const val `ALLJOYN_PROP_ACCESS_RW`: UByte = 3u;
public const val `ALLJOYN_PROP_ACCESS_WRITE`: UByte = 2u;
public const val `ALLJOYN_PROXIMITY_ANY`: UInt = 255u;
public const val `ALLJOYN_PROXIMITY_NETWORK`: UInt = 2u;
public const val `ALLJOYN_PROXIMITY_PHYSICAL`: UInt = 1u;
public const val `ALLJOYN_READ_READY`: UInt = 1u;
public const val `ALLJOYN_SESSIONLOST_INVALID`: `alljoyn_sessionlostreason` = 0;
public const val `ALLJOYN_SESSIONLOST_LINK_TIMEOUT`: `alljoyn_sessionlostreason` = 4;
public const val `ALLJOYN_SESSIONLOST_REASON_OTHER`: `alljoyn_sessionlostreason` = 5;
public const val `ALLJOYN_SESSIONLOST_REMOTE_END_CLOSED_ABRUPTLY`: `alljoyn_sessionlostreason` = 2;
public const val `ALLJOYN_SESSIONLOST_REMOTE_END_LEFT_SESSION`: `alljoyn_sessionlostreason` = 1;
public const val `ALLJOYN_SESSIONLOST_REMOVED_BY_BINDER`: `alljoyn_sessionlostreason` = 3;
public const val `ALLJOYN_SIGNATURE`: `alljoyn_typeid` = 103;
public const val `ALLJOYN_STRING`: `alljoyn_typeid` = 115;
public const val `ALLJOYN_STRUCT`: `alljoyn_typeid` = 114;
public const val `ALLJOYN_STRUCT_CLOSE`: `alljoyn_typeid` = 41;
public const val `ALLJOYN_STRUCT_OPEN`: `alljoyn_typeid` = 40;
public const val `ALLJOYN_TRAFFIC_TYPE_MESSAGES`: UInt = 1u;
public const val `ALLJOYN_TRAFFIC_TYPE_RAW_RELIABLE`: UInt = 4u;
public const val `ALLJOYN_TRAFFIC_TYPE_RAW_UNRELIABLE`: UInt = 2u;
public const val `ALLJOYN_UINT16`: `alljoyn_typeid` = 113;
public const val `ALLJOYN_UINT16_ARRAY`: `alljoyn_typeid` = 29025;
public const val `ALLJOYN_UINT32`: `alljoyn_typeid` = 117;
public const val `ALLJOYN_UINT32_ARRAY`: `alljoyn_typeid` = 30049;
public const val `ALLJOYN_UINT64`: `alljoyn_typeid` = 116;
public const val `ALLJOYN_UINT64_ARRAY`: `alljoyn_typeid` = 29793;
public const val `ALLJOYN_VARIANT`: `alljoyn_typeid` = 118;
public const val `ALLJOYN_WILDCARD`: `alljoyn_typeid` = 42;
public const val `ALLJOYN_WRITE_READY`: UInt = 2u;
public const val `ANNOUNCED`: `alljoyn_about_announceflag` = 1;
public const val `CAPABLE_ECDHE_ECDSA`: `alljoyn_claimcapability_masks` = 4;
public const val `CAPABLE_ECDHE_NULL`: `alljoyn_claimcapability_masks` = 1;
public const val `CAPABLE_ECDHE_SPEKE`: `alljoyn_claimcapability_masks` = 8;
public const val `CLAIMABLE`: `alljoyn_applicationstate` = 1;
public const val `CLAIMED`: `alljoyn_applicationstate` = 2;
public const val `ER_ABOUT_ABOUTDATA_MISSING_REQUIRED_FIELD`: `QStatus` = 37157;
public const val `ER_ABOUT_DEFAULT_LANGUAGE_NOT_SPECIFIED`: `QStatus` = 37155;
public const val `ER_ABOUT_FIELD_ALREADY_SPECIFIED`: `QStatus` = 37147;
public const val `ER_ABOUT_INVALID_ABOUTDATA_FIELD_APPID_SIZE`: `QStatus` = 37163;
public const val `ER_ABOUT_INVALID_ABOUTDATA_FIELD_VALUE`: `QStatus` = 37162;
public const val `ER_ABOUT_INVALID_ABOUTDATA_LISTENER`: `QStatus` = 37158;
public const val `ER_ABOUT_SESSIONPORT_NOT_BOUND`: `QStatus` = 37156;
public const val `ER_ALERTED_THREAD`: `QStatus` = 4098;
public const val `ER_ALLJOYN_ACCESS_PERMISSION_ERROR`: `QStatus` = 37028;
public const val `ER_ALLJOYN_ACCESS_PERMISSION_WARNING`: `QStatus` = 37027;
public const val `ER_ALLJOYN_ADVERTISENAME_REPLY_ALREADY_ADVERTISING`: `QStatus` = 37005;
public const val `ER_ALLJOYN_ADVERTISENAME_REPLY_FAILED`: `QStatus` = 37006;
public const val `ER_ALLJOYN_ADVERTISENAME_REPLY_TRANSPORT_NOT_AVAILABLE`: `QStatus` = 37004;
public const val `ER_ALLJOYN_BINDSESSIONPORT_REPLY_ALREADY_EXISTS`: `QStatus` = 36992;
public const val `ER_ALLJOYN_BINDSESSIONPORT_REPLY_FAILED`: `QStatus` = 36993;
public const val `ER_ALLJOYN_BINDSESSIONPORT_REPLY_INVALID_OPTS`: `QStatus` = 37018;
public const val `ER_ALLJOYN_CANCELADVERTISENAME_REPLY_FAILED`: `QStatus` = 37008;
public const val `ER_ALLJOYN_CANCELFINDADVERTISEDNAME_REPLY_FAILED`: `QStatus` = 37013;
public const val `ER_ALLJOYN_FINDADVERTISEDNAME_REPLY_ALREADY_DISCOVERING`: `QStatus` = 37010;
public const val `ER_ALLJOYN_FINDADVERTISEDNAME_REPLY_FAILED`: `QStatus` = 37011;
public const val `ER_ALLJOYN_FINDADVERTISEDNAME_REPLY_TRANSPORT_NOT_AVAILABLE`: `QStatus` = 37009;
public const val `ER_ALLJOYN_JOINSESSION_REPLY_ALREADY_JOINED`: `QStatus` = 37019;
public const val `ER_ALLJOYN_JOINSESSION_REPLY_BAD_SESSION_OPTS`: `QStatus` = 36999;
public const val `ER_ALLJOYN_JOINSESSION_REPLY_CONNECT_FAILED`: `QStatus` = 36997;
public const val `ER_ALLJOYN_JOINSESSION_REPLY_FAILED`: `QStatus` = 37000;
public const val `ER_ALLJOYN_JOINSESSION_REPLY_NO_SESSION`: `QStatus` = 36995;
public const val `ER_ALLJOYN_JOINSESSION_REPLY_REJECTED`: `QStatus` = 36998;
public const val `ER_ALLJOYN_JOINSESSION_REPLY_UNREACHABLE`: `QStatus` = 36996;
public const val `ER_ALLJOYN_LEAVESESSION_REPLY_FAILED`: `QStatus` = 37003;
public const val `ER_ALLJOYN_LEAVESESSION_REPLY_NO_SESSION`: `QStatus` = 37002;
public const val `ER_ALLJOYN_ONAPPRESUME_REPLY_FAILED`: `QStatus` = 37100;
public const val `ER_ALLJOYN_ONAPPRESUME_REPLY_UNSUPPORTED`: `QStatus` = 37101;
public const val `ER_ALLJOYN_ONAPPSUSPEND_REPLY_FAILED`: `QStatus` = 37098;
public const val `ER_ALLJOYN_ONAPPSUSPEND_REPLY_UNSUPPORTED`: `QStatus` = 37099;
public const val `ER_ALLJOYN_PING_FAILED`: `QStatus` = 37111;
public const val `ER_ALLJOYN_PING_REPLY_FAILED`: `QStatus` = 37143;
public const val `ER_ALLJOYN_PING_REPLY_INCOMPATIBLE_REMOTE_ROUTING_NODE`: `QStatus` = 37140;
public const val `ER_ALLJOYN_PING_REPLY_IN_PROGRESS`: `QStatus` = 37145;
public const val `ER_ALLJOYN_PING_REPLY_TIMEOUT`: `QStatus` = 37141;
public const val `ER_ALLJOYN_PING_REPLY_UNKNOWN_NAME`: `QStatus` = 37142;
public const val `ER_ALLJOYN_PING_REPLY_UNREACHABLE`: `QStatus` = 37112;
public const val `ER_ALLJOYN_REMOVESESSIONMEMBER_INCOMPATIBLE_REMOTE_DAEMON`: `QStatus` = 37107;
public const val `ER_ALLJOYN_REMOVESESSIONMEMBER_NOT_BINDER`: `QStatus` = 37104;
public const val `ER_ALLJOYN_REMOVESESSIONMEMBER_NOT_FOUND`: `QStatus` = 37106;
public const val `ER_ALLJOYN_REMOVESESSIONMEMBER_NOT_MULTIPOINT`: `QStatus` = 37105;
public const val `ER_ALLJOYN_REMOVESESSIONMEMBER_REPLY_FAILED`: `QStatus` = 37108;
public const val `ER_ALLJOYN_REMOVESESSIONMEMBER_REPLY_NO_SESSION`: `QStatus` = 37103;
public const val `ER_ALLJOYN_SETLINKTIMEOUT_REPLY_FAILED`: `QStatus` = 37026;
public const val `ER_ALLJOYN_SETLINKTIMEOUT_REPLY_NOT_SUPPORTED`: `QStatus` = 37024;
public const val `ER_ALLJOYN_SETLINKTIMEOUT_REPLY_NO_DEST_SUPPORT`: `QStatus` = 37025;
public const val `ER_ALLJOYN_UNBINDSESSIONPORT_REPLY_BAD_PORT`: `QStatus` = 37016;
public const val `ER_ALLJOYN_UNBINDSESSIONPORT_REPLY_FAILED`: `QStatus` = 37017;
public const val `ER_APPLICATION_STATE_LISTENER_ALREADY_EXISTS`: `QStatus` = 37184;
public const val `ER_APPLICATION_STATE_LISTENER_NO_SUCH_LISTENER`: `QStatus` = 37185;
public const val `ER_ARDP_BACKPRESSURE`: `QStatus` = 37122;
public const val `ER_ARDP_DISCONNECTING`: `QStatus` = 37139;
public const val `ER_ARDP_INVALID_CONNECTION`: `QStatus` = 37135;
public const val `ER_ARDP_INVALID_RESPONSE`: `QStatus` = 37134;
public const val `ER_ARDP_INVALID_STATE`: `QStatus` = 37124;
public const val `ER_ARDP_PERSIST_TIMEOUT`: `QStatus` = 37126;
public const val `ER_ARDP_PROBE_TIMEOUT`: `QStatus` = 37127;
public const val `ER_ARDP_REMOTE_CONNECTION_RESET`: `QStatus` = 37128;
public const val `ER_ARDP_TTL_EXPIRED`: `QStatus` = 37125;
public const val `ER_ARDP_VERSION_NOT_SUPPORTED`: `QStatus` = 37151;
public const val `ER_ARDP_WRITE_BLOCKED`: `QStatus` = 37153;
public const val `ER_AUTH_FAIL`: `QStatus` = 4100;
public const val `ER_AUTH_USER_REJECT`: `QStatus` = 4101;
public const val `ER_BAD_ARG_1`: `QStatus` = 12;
public const val `ER_BAD_ARG_2`: `QStatus` = 13;
public const val `ER_BAD_ARG_3`: `QStatus` = 14;
public const val `ER_BAD_ARG_4`: `QStatus` = 15;
public const val `ER_BAD_ARG_5`: `QStatus` = 16;
public const val `ER_BAD_ARG_6`: `QStatus` = 17;
public const val `ER_BAD_ARG_7`: `QStatus` = 18;
public const val `ER_BAD_ARG_8`: `QStatus` = 19;
public const val `ER_BAD_ARG_COUNT`: `QStatus` = 28;
public const val `ER_BAD_HOSTNAME`: `QStatus` = 4112;
public const val `ER_BAD_STRING_ENCODING`: `QStatus` = 4120;
public const val `ER_BAD_TRANSPORT_MASK`: `QStatus` = 37088;
public const val `ER_BUFFER_TOO_SMALL`: `QStatus` = 3;
public const val `ER_BUS_ALREADY_CONNECTED`: `QStatus` = 36932;
public const val `ER_BUS_ALREADY_LISTENING`: `QStatus` = 36934;
public const val `ER_BUS_ANNOTATION_ALREADY_EXISTS`: `QStatus` = 37082;
public const val `ER_BUS_AUTHENTICATION_PENDING`: `QStatus` = 37031;
public const val `ER_BUS_BAD_BODY_LEN`: `QStatus` = 36879;
public const val `ER_BUS_BAD_BUS_NAME`: `QStatus` = 36874;
public const val `ER_BUS_BAD_CHILD_PATH`: `QStatus` = 36927;
public const val `ER_BUS_BAD_ERROR_NAME`: `QStatus` = 36873;
public const val `ER_BUS_BAD_HDR_FLAGS`: `QStatus` = 36878;
public const val `ER_BUS_BAD_HEADER_FIELD`: `QStatus` = 36868;
public const val `ER_BUS_BAD_HEADER_LEN`: `QStatus` = 36880;
public const val `ER_BUS_BAD_INTERFACE_NAME`: `QStatus` = 36872;
public const val `ER_BUS_BAD_LENGTH`: `QStatus` = 36876;
public const val `ER_BUS_BAD_MEMBER_NAME`: `QStatus` = 36871;
public const val `ER_BUS_BAD_OBJ_PATH`: `QStatus` = 36870;
public const val `ER_BUS_BAD_SENDER_ID`: `QStatus` = 36908;
public const val `ER_BUS_BAD_SEND_PARAMETER`: `QStatus` = 36906;
public const val `ER_BUS_BAD_SESSION_OPTS`: `QStatus` = 36980;
public const val `ER_BUS_BAD_SIGNATURE`: `QStatus` = 36869;
public const val `ER_BUS_BAD_TRANSPORT_ARGS`: `QStatus` = 36903;
public const val `ER_BUS_BAD_VALUE`: `QStatus` = 36877;
public const val `ER_BUS_BAD_VALUE_TYPE`: `QStatus` = 36867;
public const val `ER_BUS_BAD_XML`: `QStatus` = 36926;
public const val `ER_BUS_BLOCKING_CALL_NOT_ALLOWED`: `QStatus` = 36960;
public const val `ER_BUS_BUS_ALREADY_STARTED`: `QStatus` = 36939;
public const val `ER_BUS_BUS_NOT_STARTED`: `QStatus` = 36940;
public const val `ER_BUS_CANNOT_ADD_HANDLER`: `QStatus` = 36965;
public const val `ER_BUS_CANNOT_ADD_INTERFACE`: `QStatus` = 36964;
public const val `ER_BUS_CANNOT_EXPAND_MESSAGE`: `QStatus` = 36930;
public const val `ER_BUS_CONNECTION_REJECTED`: `QStatus` = 36981;
public const val `ER_BUS_CONNECT_FAILED`: `QStatus` = 36913;
public const val `ER_BUS_CORRUPT_KEYSTORE`: `QStatus` = 36952;
public const val `ER_BUS_DESCRIPTION_ALREADY_EXISTS`: `QStatus` = 37188;
public const val `ER_BUS_DESTINATION_NOT_AUTHENTICATED`: `QStatus` = 37029;
public const val `ER_BUS_ELEMENT_NOT_FOUND`: `QStatus` = 36976;
public const val `ER_BUS_EMPTY_MESSAGE`: `QStatus` = 36910;
public const val `ER_BUS_ENDPOINT_CLOSING`: `QStatus` = 36920;
public const val `ER_BUS_ENDPOINT_REDIRECTED`: `QStatus` = 37030;
public const val `ER_BUS_ERRORS`: `QStatus` = 36864;
public const val `ER_BUS_ERROR_NAME_MISSING`: `QStatus` = 36890;
public const val `ER_BUS_ERROR_RESPONSE`: `QStatus` = 36925;
public const val `ER_BUS_ESTABLISH_FAILED`: `QStatus` = 36884;
public const val `ER_BUS_HANDLES_MISMATCH`: `QStatus` = 36973;
public const val `ER_BUS_HANDLES_NOT_ENABLED`: `QStatus` = 36972;
public const val `ER_BUS_HDR_EXPANSION_INVALID`: `QStatus` = 36946;
public const val `ER_BUS_IFACE_ALREADY_EXISTS`: `QStatus` = 36924;
public const val `ER_BUS_INCOMPATIBLE_DAEMON`: `QStatus` = 37094;
public const val `ER_BUS_INTERFACE_ACTIVATED`: `QStatus` = 37015;
public const val `ER_BUS_INTERFACE_MISMATCH`: `QStatus` = 36921;
public const val `ER_BUS_INTERFACE_MISSING`: `QStatus` = 36886;
public const val `ER_BUS_INTERFACE_NO_SUCH_MEMBER`: `QStatus` = 36891;
public const val `ER_BUS_INVALID_AUTH_MECHANISM`: `QStatus` = 36958;
public const val `ER_BUS_INVALID_HEADER_CHECKSUM`: `QStatus` = 36942;
public const val `ER_BUS_INVALID_HEADER_SERIAL`: `QStatus` = 36944;
public const val `ER_BUS_KEYBLOB_OP_INVALID`: `QStatus` = 36941;
public const val `ER_BUS_KEYSTORE_NOT_LOADED`: `QStatus` = 36966;
public const val `ER_BUS_KEYSTORE_VERSION_MISMATCH`: `QStatus` = 36959;
public const val `ER_BUS_KEY_EXPIRED`: `QStatus` = 36951;
public const val `ER_BUS_KEY_STORE_NOT_LOADED`: `QStatus` = 36937;
public const val `ER_BUS_KEY_UNAVAILABLE`: `QStatus` = 36935;
public const val `ER_BUS_LISTENER_ALREADY_SET`: `QStatus` = 37022;
public const val `ER_BUS_MATCH_RULE_NOT_FOUND`: `QStatus` = 37110;
public const val `ER_BUS_MEMBER_ALREADY_EXISTS`: `QStatus` = 36922;
public const val `ER_BUS_MEMBER_MISSING`: `QStatus` = 36888;
public const val `ER_BUS_MEMBER_NO_SUCH_SIGNATURE`: `QStatus` = 36896;
public const val `ER_BUS_MESSAGE_DECRYPTION_FAILED`: `QStatus` = 36949;
public const val `ER_BUS_MESSAGE_NOT_ENCRYPTED`: `QStatus` = 36943;
public const val `ER_BUS_METHOD_CALL_ABORTED`: `QStatus` = 36963;
public const val `ER_BUS_MISSING_COMPRESSION_TOKEN`: `QStatus` = 36947;
public const val `ER_BUS_NAME_TOO_LONG`: `QStatus` = 36875;
public const val `ER_BUS_NOT_ALLOWED`: `QStatus` = 36918;
public const val `ER_BUS_NOT_AUTHENTICATING`: `QStatus` = 36915;
public const val `ER_BUS_NOT_AUTHORIZED`: `QStatus` = 37032;
public const val `ER_BUS_NOT_A_COMPLETE_TYPE`: `QStatus` = 36954;
public const val `ER_BUS_NOT_A_DICTIONARY`: `QStatus` = 36977;
public const val `ER_BUS_NOT_COMPRESSED`: `QStatus` = 36931;
public const val `ER_BUS_NOT_CONNECTED`: `QStatus` = 36933;
public const val `ER_BUS_NOT_NUL_TERMINATED`: `QStatus` = 36897;
public const val `ER_BUS_NOT_OWNER`: `QStatus` = 36911;
public const val `ER_BUS_NO_AUTHENTICATION_MECHANISM`: `QStatus` = 36938;
public const val `ER_BUS_NO_CALL_FOR_REPLY`: `QStatus` = 36953;
public const val `ER_BUS_NO_ENDPOINT`: `QStatus` = 36905;
public const val `ER_BUS_NO_LISTENER`: `QStatus` = 36916;
public const val `ER_BUS_NO_PEER_GUID`: `QStatus` = 36948;
public const val `ER_BUS_NO_ROUTE`: `QStatus` = 36904;
public const val `ER_BUS_NO_SESSION`: `QStatus` = 36975;
public const val `ER_BUS_NO_SUCH_ANNOTATION`: `QStatus` = 37081;
public const val `ER_BUS_NO_SUCH_HANDLE`: `QStatus` = 36971;
public const val `ER_BUS_NO_SUCH_INTERFACE`: `QStatus` = 36895;
public const val `ER_BUS_NO_SUCH_MESSAGE`: `QStatus` = 37102;
public const val `ER_BUS_NO_SUCH_OBJECT`: `QStatus` = 36892;
public const val `ER_BUS_NO_SUCH_PROPERTY`: `QStatus` = 36898;
public const val `ER_BUS_NO_SUCH_SERVICE`: `QStatus` = 36956;
public const val `ER_BUS_NO_TRANSPORTS`: `QStatus` = 36902;
public const val `ER_BUS_OBJECT_NOT_REGISTERED`: `QStatus` = 37091;
public const val `ER_BUS_OBJECT_NO_SUCH_INTERFACE`: `QStatus` = 36894;
public const val `ER_BUS_OBJECT_NO_SUCH_MEMBER`: `QStatus` = 36893;
public const val `ER_BUS_OBJ_ALREADY_EXISTS`: `QStatus` = 36928;
public const val `ER_BUS_OBJ_NOT_FOUND`: `QStatus` = 36929;
public const val `ER_BUS_PATH_MISSING`: `QStatus` = 36887;
public const val `ER_BUS_PEER_AUTH_VERSION_MISMATCH`: `QStatus` = 37023;
public const val `ER_BUS_PING_GROUP_NOT_FOUND`: `QStatus` = 37159;
public const val `ER_BUS_POLICY_VIOLATION`: `QStatus` = 36955;
public const val `ER_BUS_PROPERTY_ACCESS_DENIED`: `QStatus` = 36901;
public const val `ER_BUS_PROPERTY_ALREADY_EXISTS`: `QStatus` = 36923;
public const val `ER_BUS_PROPERTY_VALUE_NOT_SET`: `QStatus` = 36900;
public const val `ER_BUS_READ_ERROR`: `QStatus` = 36865;
public const val `ER_BUS_REMOVED_BY_BINDER`: `QStatus` = 37109;
public const val `ER_BUS_REMOVED_BY_BINDER_SELF`: `QStatus` = 37160;
public const val `ER_BUS_REPLY_IS_ERROR_MESSAGE`: `QStatus` = 36914;
public const val `ER_BUS_REPLY_SERIAL_MISSING`: `QStatus` = 36889;
public const val `ER_BUS_SECURITY_FATAL`: `QStatus` = 36950;
public const val `ER_BUS_SECURITY_NOT_ENABLED`: `QStatus` = 37021;
public const val `ER_BUS_SELF_CONNECT`: `QStatus` = 37020;
public const val `ER_BUS_SET_PROPERTY_REJECTED`: `QStatus` = 36912;
public const val `ER_BUS_SET_WRONG_SIGNATURE`: `QStatus` = 36899;
public const val `ER_BUS_SIGNATURE_MISMATCH`: `QStatus` = 36961;
public const val `ER_BUS_STOPPING`: `QStatus` = 36962;
public const val `ER_BUS_TIME_TO_LIVE_EXPIRED`: `QStatus` = 36945;
public const val `ER_BUS_TRANSPORT_ACCESS_DENIED`: `QStatus` = 37164;
public const val `ER_BUS_TRANSPORT_NOT_AVAILABLE`: `QStatus` = 36957;
public const val `ER_BUS_TRANSPORT_NOT_STARTED`: `QStatus` = 36909;
public const val `ER_BUS_TRUNCATED`: `QStatus` = 36936;
public const val `ER_BUS_UNEXPECTED_DISPOSITION`: `QStatus` = 37014;
public const val `ER_BUS_UNEXPECTED_SIGNATURE`: `QStatus` = 36885;
public const val `ER_BUS_UNKNOWN_INTERFACE`: `QStatus` = 36883;
public const val `ER_BUS_UNKNOWN_PATH`: `QStatus` = 36882;
public const val `ER_BUS_UNKNOWN_SERIAL`: `QStatus` = 36881;
public const val `ER_BUS_UNMATCHED_REPLY_SERIAL`: `QStatus` = 36907;
public const val `ER_BUS_WAIT_FAILED`: `QStatus` = 36978;
public const val `ER_BUS_WRITE_ERROR`: `QStatus` = 36866;
public const val `ER_BUS_WRITE_QUEUE_FULL`: `QStatus` = 36919;
public const val `ER_CERTIFICATE_NOT_FOUND`: `QStatus` = 37166;
public const val `ER_COMMON_ERRORS`: `QStatus` = 4096;
public const val `ER_CONNECTION_LIMIT_EXCEEDED`: `QStatus` = 37152;
public const val `ER_CONN_REFUSED`: `QStatus` = 27;
public const val `ER_CORRUPT_KEYBLOB`: `QStatus` = 4115;
public const val `ER_CRYPTO_ERROR`: `QStatus` = 4109;
public const val `ER_CRYPTO_HASH_UNINITIALIZED`: `QStatus` = 4123;
public const val `ER_CRYPTO_ILLEGAL_PARAMETERS`: `QStatus` = 4122;
public const val `ER_CRYPTO_INSUFFICIENT_SECURITY`: `QStatus` = 4121;
public const val `ER_CRYPTO_KEY_UNAVAILABLE`: `QStatus` = 4111;
public const val `ER_CRYPTO_KEY_UNUSABLE`: `QStatus` = 4113;
public const val `ER_CRYPTO_TRUNCATED`: `QStatus` = 4110;
public const val `ER_DBUS_RELEASE_NAME_REPLY_NON_EXISTENT`: `QStatus` = 36987;
public const val `ER_DBUS_RELEASE_NAME_REPLY_NOT_OWNER`: `QStatus` = 36988;
public const val `ER_DBUS_RELEASE_NAME_REPLY_RELEASED`: `QStatus` = 36986;
public const val `ER_DBUS_REQUEST_NAME_REPLY_ALREADY_OWNER`: `QStatus` = 36985;
public const val `ER_DBUS_REQUEST_NAME_REPLY_EXISTS`: `QStatus` = 36984;
public const val `ER_DBUS_REQUEST_NAME_REPLY_IN_QUEUE`: `QStatus` = 36983;
public const val `ER_DBUS_REQUEST_NAME_REPLY_PRIMARY_OWNER`: `QStatus` = 36982;
public const val `ER_DBUS_START_REPLY_ALREADY_RUNNING`: `QStatus` = 36990;
public const val `ER_DEADLOCK`: `QStatus` = 31;
public const val `ER_DEAD_THREAD`: `QStatus` = 4117;
public const val `ER_DIGEST_MISMATCH`: `QStatus` = 37170;
public const val `ER_DUPLICATE_CERTIFICATE`: `QStatus` = 37167;
public const val `ER_DUPLICATE_KEY`: `QStatus` = 37171;
public const val `ER_EMPTY_KEY_BLOB`: `QStatus` = 4114;
public const val `ER_END_OF_DATA`: `QStatus` = 26;
public const val `ER_EOF`: `QStatus` = 30;
public const val `ER_EXTERNAL_THREAD`: `QStatus` = 4108;
public const val `ER_FAIL`: `QStatus` = 1;
public const val `ER_FEATURE_NOT_AVAILABLE`: `QStatus` = 37177;
public const val `ER_INIT_FAILED`: `QStatus` = 7;
public const val `ER_INVALID_ADDRESS`: `QStatus` = 20;
public const val `ER_INVALID_APPLICATION_STATE`: `QStatus` = 37176;
public const val `ER_INVALID_CERTIFICATE`: `QStatus` = 37165;
public const val `ER_INVALID_CERTIFICATE_USAGE`: `QStatus` = 37182;
public const val `ER_INVALID_CERT_CHAIN`: `QStatus` = 37174;
public const val `ER_INVALID_CONFIG`: `QStatus` = 37161;
public const val `ER_INVALID_DATA`: `QStatus` = 21;
public const val `ER_INVALID_GUID`: `QStatus` = 4126;
public const val `ER_INVALID_HTTP_METHOD_USED_FOR_RENDEZVOUS_SERVER_INTERFACE_MESSAGE`: `QStatus` = 37075;
public const val `ER_INVALID_KEY_ENCODING`: `QStatus` = 4116;
public const val `ER_INVALID_ON_DEMAND_CONNECTION_MESSAGE_RESPONSE`: `QStatus` = 37074;
public const val `ER_INVALID_PERSISTENT_CONNECTION_MESSAGE_RESPONSE`: `QStatus` = 37073;
public const val `ER_INVALID_RENDEZVOUS_SERVER_INTERFACE_MESSAGE`: `QStatus` = 37072;
public const val `ER_INVALID_SIGNAL_EMISSION_TYPE`: `QStatus` = 37183;
public const val `ER_INVALID_STREAM`: `QStatus` = 4129;
public const val `ER_IODISPATCH_STOPPING`: `QStatus` = 4131;
public const val `ER_KEY_STORE_ALREADY_INITIALIZED`: `QStatus` = 37178;
public const val `ER_KEY_STORE_ID_NOT_YET_SET`: `QStatus` = 37179;
public const val `ER_LANGUAGE_NOT_SUPPORTED`: `QStatus` = 37146;
public const val `ER_MANAGEMENT_ALREADY_STARTED`: `QStatus` = 37186;
public const val `ER_MANAGEMENT_NOT_STARTED`: `QStatus` = 37187;
public const val `ER_MANIFEST_NOT_FOUND`: `QStatus` = 37173;
public const val `ER_MANIFEST_REJECTED`: `QStatus` = 37181;
public const val `ER_MISSING_DIGEST_IN_CERTIFICATE`: `QStatus` = 37169;
public const val `ER_NONE`: `QStatus` = 65535;
public const val `ER_NOT_CONN`: `QStatus` = 4141;
public const val `ER_NOT_CONNECTED_TO_RENDEZVOUS_SERVER`: `QStatus` = 37070;
public const val `ER_NOT_IMPLEMENTED`: `QStatus` = 9;
public const val `ER_NO_COMMON_TRUST`: `QStatus` = 37172;
public const val `ER_NO_SUCH_ALARM`: `QStatus` = 4102;
public const val `ER_NO_SUCH_DEVICE`: `QStatus` = 37084;
public const val `ER_NO_TRUST_ANCHOR`: `QStatus` = 37175;
public const val `ER_OK`: `QStatus` = 0;
public const val `ER_OPEN_FAILED`: `QStatus` = 24;
public const val `ER_OS_ERROR`: `QStatus` = 4;
public const val `ER_OUT_OF_MEMORY`: `QStatus` = 5;
public const val `ER_P2P`: `QStatus` = 37085;
public const val `ER_P2P_BUSY`: `QStatus` = 37093;
public const val `ER_P2P_DISABLED`: `QStatus` = 37092;
public const val `ER_P2P_FORBIDDEN`: `QStatus` = 37097;
public const val `ER_P2P_NOT_CONNECTED`: `QStatus` = 37087;
public const val `ER_P2P_NO_GO`: `QStatus` = 37095;
public const val `ER_P2P_NO_STA`: `QStatus` = 37096;
public const val `ER_P2P_TIMEOUT`: `QStatus` = 37086;
public const val `ER_PACKET_BAD_CRC`: `QStatus` = 37039;
public const val `ER_PACKET_BAD_FORMAT`: `QStatus` = 37034;
public const val `ER_PACKET_BAD_PARAMETER`: `QStatus` = 37038;
public const val `ER_PACKET_BUS_NO_SUCH_CHANNEL`: `QStatus` = 37033;
public const val `ER_PACKET_CHANNEL_FAIL`: `QStatus` = 37036;
public const val `ER_PACKET_CONNECT_TIMEOUT`: `QStatus` = 37035;
public const val `ER_PACKET_TOO_LARGE`: `QStatus` = 37037;
public const val `ER_PARSE_ERROR`: `QStatus` = 25;
public const val `ER_PERMISSION_DENIED`: `QStatus` = 37154;
public const val `ER_POLICY_NOT_NEWER`: `QStatus` = 37180;
public const val `ER_PROXIMITY_CONNECTION_ESTABLISH_FAIL`: `QStatus` = 37089;
public const val `ER_PROXIMITY_NO_PEERS_FOUND`: `QStatus` = 37090;
public const val `ER_READ_ERROR`: `QStatus` = 22;
public const val `ER_RENDEZVOUS_SERVER_DEACTIVATED_USER`: `QStatus` = 37067;
public const val `ER_RENDEZVOUS_SERVER_ERR401_UNAUTHORIZED_REQUEST`: `QStatus` = 37078;
public const val `ER_RENDEZVOUS_SERVER_ERR500_INTERNAL_ERROR`: `QStatus` = 37076;
public const val `ER_RENDEZVOUS_SERVER_ERR503_STATUS_UNAVAILABLE`: `QStatus` = 37077;
public const val `ER_RENDEZVOUS_SERVER_ROOT_CERTIFICATE_UNINITIALIZED`: `QStatus` = 37080;
public const val `ER_RENDEZVOUS_SERVER_UNKNOWN_USER`: `QStatus` = 37068;
public const val `ER_RENDEZVOUS_SERVER_UNRECOVERABLE_ERROR`: `QStatus` = 37079;
public const val `ER_SLAP_CRC_ERROR`: `QStatus` = 4137;
public const val `ER_SLAP_ERROR`: `QStatus` = 4138;
public const val `ER_SLAP_HDR_CHECKSUM_ERROR`: `QStatus` = 4133;
public const val `ER_SLAP_INVALID_PACKET_LEN`: `QStatus` = 4132;
public const val `ER_SLAP_INVALID_PACKET_TYPE`: `QStatus` = 4134;
public const val `ER_SLAP_LEN_MISMATCH`: `QStatus` = 4135;
public const val `ER_SLAP_OTHER_END_CLOSED`: `QStatus` = 4139;
public const val `ER_SLAP_PACKET_TYPE_MISMATCH`: `QStatus` = 4136;
public const val `ER_SOCKET_BIND_ERROR`: `QStatus` = 6;
public const val `ER_SOCK_CLOSING`: `QStatus` = 37083;
public const val `ER_SOCK_OTHER_END_CLOSED`: `QStatus` = 11;
public const val `ER_SSL_CONNECT`: `QStatus` = 4106;
public const val `ER_SSL_ERRORS`: `QStatus` = 4104;
public const val `ER_SSL_INIT`: `QStatus` = 4105;
public const val `ER_SSL_VERIFY`: `QStatus` = 4107;
public const val `ER_STOPPING_THREAD`: `QStatus` = 4097;
public const val `ER_TCP_MAX_UNTRUSTED`: `QStatus` = 37144;
public const val `ER_THREADPOOL_EXHAUSTED`: `QStatus` = 4127;
public const val `ER_THREADPOOL_STOPPING`: `QStatus` = 4128;
public const val `ER_THREAD_NO_WAIT`: `QStatus` = 4124;
public const val `ER_THREAD_RUNNING`: `QStatus` = 4118;
public const val `ER_THREAD_STOPPING`: `QStatus` = 4119;
public const val `ER_TIMEOUT`: `QStatus` = 10;
public const val `ER_TIMER_EXITING`: `QStatus` = 4125;
public const val `ER_TIMER_FALLBEHIND`: `QStatus` = 4103;
public const val `ER_TIMER_FULL`: `QStatus` = 4130;
public const val `ER_TIMER_NOT_ALLOWED`: `QStatus` = 4140;
public const val `ER_UDP_BACKPRESSURE`: `QStatus` = 37123;
public const val `ER_UDP_BUSHELLO`: `QStatus` = 37129;
public const val `ER_UDP_DEMUX_NO_ENDPOINT`: `QStatus` = 37114;
public const val `ER_UDP_DISCONNECT`: `QStatus` = 37118;
public const val `ER_UDP_EARLY_EXIT`: `QStatus` = 37137;
public const val `ER_UDP_ENDPOINT_NOT_STARTED`: `QStatus` = 37149;
public const val `ER_UDP_ENDPOINT_REMOVED`: `QStatus` = 37150;
public const val `ER_UDP_ENDPOINT_STALLED`: `QStatus` = 37133;
public const val `ER_UDP_INVALID`: `QStatus` = 37131;
public const val `ER_UDP_LOCAL_DISCONNECT`: `QStatus` = 37136;
public const val `ER_UDP_LOCAL_DISCONNECT_FAIL`: `QStatus` = 37138;
public const val `ER_UDP_MESSAGE`: `QStatus` = 37130;
public const val `ER_UDP_MSG_TOO_LONG`: `QStatus` = 37113;
public const val `ER_UDP_NOT_DISCONNECTED`: `QStatus` = 37148;
public const val `ER_UDP_NOT_IMPLEMENTED`: `QStatus` = 37119;
public const val `ER_UDP_NO_LISTENER`: `QStatus` = 37120;
public const val `ER_UDP_NO_NETWORK`: `QStatus` = 37115;
public const val `ER_UDP_STOPPING`: `QStatus` = 37121;
public const val `ER_UDP_UNEXPECTED_FLOW`: `QStatus` = 37117;
public const val `ER_UDP_UNEXPECTED_LENGTH`: `QStatus` = 37116;
public const val `ER_UDP_UNSUPPORTED`: `QStatus` = 37132;
public const val `ER_UNABLE_TO_CONNECT_TO_RENDEZVOUS_SERVER`: `QStatus` = 37069;
public const val `ER_UNABLE_TO_SEND_MESSAGE_TO_RENDEZVOUS_SERVER`: `QStatus` = 37071;
public const val `ER_UNKNOWN_CERTIFICATE`: `QStatus` = 37168;
public const val `ER_UTF_CONVERSION_FAILED`: `QStatus` = 2;
public const val `ER_WARNING`: `QStatus` = 29;
public const val `ER_WOULDBLOCK`: `QStatus` = 8;
public const val `ER_WRITE_ERROR`: `QStatus` = 23;
public const val `ER_XML_ACLS_MISSING`: `QStatus` = 8211;
public const val `ER_XML_ACL_ALL_TYPE_PEER_WITH_OTHERS`: `QStatus` = 8207;
public const val `ER_XML_ACL_PEERS_MISSING`: `QStatus` = 8212;
public const val `ER_XML_ACL_PEER_NOT_UNIQUE`: `QStatus` = 8209;
public const val `ER_XML_ACL_PEER_PUBLIC_KEY_SET`: `QStatus` = 8210;
public const val `ER_XML_ANNOTATION_NOT_UNIQUE`: `QStatus` = 8222;
public const val `ER_XML_CONVERTER_ERROR`: `QStatus` = 8192;
public const val `ER_XML_INTERFACE_MEMBERS_MISSING`: `QStatus` = 8194;
public const val `ER_XML_INTERFACE_NAME_NOT_UNIQUE`: `QStatus` = 8219;
public const val `ER_XML_INVALID_ACL_PEER_CHILDREN_COUNT`: `QStatus` = 8206;
public const val `ER_XML_INVALID_ACL_PEER_PUBLIC_KEY`: `QStatus` = 8208;
public const val `ER_XML_INVALID_ACL_PEER_TYPE`: `QStatus` = 8205;
public const val `ER_XML_INVALID_ANNOTATIONS_COUNT`: `QStatus` = 8198;
public const val `ER_XML_INVALID_ATTRIBUTE_VALUE`: `QStatus` = 8200;
public const val `ER_XML_INVALID_BASE64`: `QStatus` = 8218;
public const val `ER_XML_INVALID_ELEMENT_CHILDREN_COUNT`: `QStatus` = 8202;
public const val `ER_XML_INVALID_ELEMENT_NAME`: `QStatus` = 8199;
public const val `ER_XML_INVALID_INTERFACE_NAME`: `QStatus` = 8214;
public const val `ER_XML_INVALID_MANIFEST_VERSION`: `QStatus` = 8216;
public const val `ER_XML_INVALID_MEMBER_ACTION`: `QStatus` = 8196;
public const val `ER_XML_INVALID_MEMBER_NAME`: `QStatus` = 8215;
public const val `ER_XML_INVALID_MEMBER_TYPE`: `QStatus` = 8195;
public const val `ER_XML_INVALID_OBJECT_PATH`: `QStatus` = 8213;
public const val `ER_XML_INVALID_OID`: `QStatus` = 8217;
public const val `ER_XML_INVALID_POLICY_SERIAL_NUMBER`: `QStatus` = 8204;
public const val `ER_XML_INVALID_POLICY_VERSION`: `QStatus` = 8203;
public const val `ER_XML_INVALID_RULES_COUNT`: `QStatus` = 8193;
public const val `ER_XML_INVALID_SECURITY_LEVEL_ANNOTATION_VALUE`: `QStatus` = 8201;
public const val `ER_XML_MALFORMED`: `QStatus` = 4099;
public const val `ER_XML_MEMBER_DENY_ACTION_WITH_OTHER`: `QStatus` = 8197;
public const val `ER_XML_MEMBER_NAME_NOT_UNIQUE`: `QStatus` = 8220;
public const val `ER_XML_OBJECT_PATH_NOT_UNIQUE`: `QStatus` = 8221;
public const val `NEED_UPDATE`: `alljoyn_applicationstate` = 3;
public const val `NOT_CLAIMABLE`: `alljoyn_applicationstate` = 0;
public const val `PASSWORD_GENERATED_BY_APPLICATION`: `alljoyn_claimcapabilityadditionalinfo_masks` = 2;
public const val `PASSWORD_GENERATED_BY_SECURITY_MANAGER`: `alljoyn_claimcapabilityadditionalinfo_masks` = 1;
public const val `QCC_FALSE`: UInt = 0u;
public const val `QCC_TRUE`: UInt = 1u;
public typealias `QStatus` = Int;
public const val `UNANNOUNCED`: `alljoyn_about_announceflag` = 0;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_about_announced_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`PCSTR`, UShort, UShort, `alljoyn_msgarg`, `alljoyn_msgarg`) -> Unit>>>;
public typealias `alljoyn_about_announceflag` = Int;
public typealias `alljoyn_aboutdata` = Long;
public typealias `alljoyn_aboutdatalistener` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `alljoyn_aboutdatalistener_callbacks` (
    public var `about_datalistener_getaboutdata`: `alljoyn_aboutdatalistener_getaboutdata_ptr`,
    public var `about_datalistener_getannouncedaboutdata`: `alljoyn_aboutdatalistener_getannouncedaboutdata_ptr`,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_aboutdatalistener_getaboutdata_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `alljoyn_msgarg`, `windows_sys`.`core`.`PCSTR`) -> `QStatus`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_aboutdatalistener_getannouncedaboutdata_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `alljoyn_msgarg`) -> `QStatus`>>>;
public typealias `alljoyn_abouticon` = Long;
public typealias `alljoyn_abouticonobj` = Long;
public typealias `alljoyn_abouticonproxy` = Long;
public typealias `alljoyn_aboutlistener` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `alljoyn_aboutlistener_callback` (
    public var `about_listener_announced`: `alljoyn_about_announced_ptr`,
)
public typealias `alljoyn_aboutobj` = Long;
public typealias `alljoyn_aboutobjectdescription` = Long;
public typealias `alljoyn_aboutproxy` = Long;
public typealias `alljoyn_applicationstate` = Int;
public typealias `alljoyn_applicationstatelistener` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `alljoyn_applicationstatelistener_callbacks` (
    public var `state`: `alljoyn_applicationstatelistener_state_ptr`,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_applicationstatelistener_state_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `alljoyn_applicationstate`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
public typealias `alljoyn_authlistener` = Long;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_authlistener_authenticationcomplete_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, Int) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `alljoyn_authlistener_callbacks` (
    public var `request_credentials`: `alljoyn_authlistener_requestcredentials_ptr`,
    public var `verify_credentials`: `alljoyn_authlistener_verifycredentials_ptr`,
    public var `security_violation`: `alljoyn_authlistener_securityviolation_ptr`,
    public var `authentication_complete`: `alljoyn_authlistener_authenticationcomplete_ptr`,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_authlistener_requestcredentials_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, UShort, `windows_sys`.`core`.`PCSTR`, UShort, `alljoyn_credentials`) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_authlistener_requestcredentialsasync_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `alljoyn_authlistener`, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, UShort, `windows_sys`.`core`.`PCSTR`, UShort, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `QStatus`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_authlistener_securityviolation_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `QStatus`, `alljoyn_message`) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_authlistener_verifycredentials_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, `alljoyn_credentials`) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_authlistener_verifycredentialsasync_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `alljoyn_authlistener`, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, `alljoyn_credentials`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `QStatus`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `alljoyn_authlistenerasync_callbacks` (
    public var `request_credentials`: `alljoyn_authlistener_requestcredentialsasync_ptr`,
    public var `verify_credentials`: `alljoyn_authlistener_verifycredentialsasync_ptr`,
    public var `security_violation`: `alljoyn_authlistener_securityviolation_ptr`,
    public var `authentication_complete`: `alljoyn_authlistener_authenticationcomplete_ptr`,
)
public typealias `alljoyn_autopinger` = Long;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_autopinger_destination_found_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_autopinger_destination_lost_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`) -> Unit>>>;
public typealias `alljoyn_busattachment` = Long;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_busattachment_joinsessioncb_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`QStatus`, UInt, `alljoyn_sessionopts`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_busattachment_setlinktimeoutcb_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`QStatus`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
public typealias `alljoyn_buslistener` = Long;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_buslistener_bus_disconnected_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_buslistener_bus_prop_changed_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`PCSTR`, `alljoyn_msgarg`) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_buslistener_bus_stopping_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `alljoyn_buslistener_callbacks` (
    public var `listener_registered`: `alljoyn_buslistener_listener_registered_ptr`,
    public var `listener_unregistered`: `alljoyn_buslistener_listener_unregistered_ptr`,
    public var `found_advertised_name`: `alljoyn_buslistener_found_advertised_name_ptr`,
    public var `lost_advertised_name`: `alljoyn_buslistener_lost_advertised_name_ptr`,
    public var `name_owner_changed`: `alljoyn_buslistener_name_owner_changed_ptr`,
    public var `bus_stopping`: `alljoyn_buslistener_bus_stopping_ptr`,
    public var `bus_disconnected`: `alljoyn_buslistener_bus_disconnected_ptr`,
    public var `property_changed`: `alljoyn_buslistener_bus_prop_changed_ptr`,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_buslistener_found_advertised_name_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`PCSTR`, UShort, `windows_sys`.`core`.`PCSTR`) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_buslistener_listener_registered_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `alljoyn_busattachment`) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_buslistener_listener_unregistered_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_buslistener_lost_advertised_name_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`PCSTR`, UShort, `windows_sys`.`core`.`PCSTR`) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_buslistener_name_owner_changed_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`) -> Unit>>>;
public typealias `alljoyn_busobject` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `alljoyn_busobject_callbacks` (
    public var `property_get`: `alljoyn_busobject_prop_get_ptr`,
    public var `property_set`: `alljoyn_busobject_prop_set_ptr`,
    public var `object_registered`: `alljoyn_busobject_object_registration_ptr`,
    public var `object_unregistered`: `alljoyn_busobject_object_registration_ptr`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `alljoyn_busobject_methodentry` (
    public var `member`: /* Rust *const */ kotlinx.cinterop.CPointer<`alljoyn_interfacedescription_member`>?,
    public var `method_handler`: `alljoyn_messagereceiver_methodhandler_ptr`,
)
// UNSUPPORTED Rust 1137:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for alljoyn_busobject_methodentry {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_busobject_object_registration_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_busobject_prop_get_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, `alljoyn_msgarg`) -> `QStatus`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_busobject_prop_set_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, `alljoyn_msgarg`) -> `QStatus`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `alljoyn_certificateid` (
    public var `serial`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `serialLen`: ULong,
    public var `issuerPublicKey`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `issuerAki`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `issuerAkiLen`: ULong,
)
// UNSUPPORTED Rust 1154:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for alljoyn_certificateid {
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
public class `alljoyn_certificateidarray` (
    public var `count`: ULong,
    public var `ids`: /* Rust *mut */ kotlinx.cinterop.CPointer<`alljoyn_certificateid`>?,
)
// UNSUPPORTED Rust 1165:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for alljoyn_certificateidarray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `alljoyn_claimcapability_masks` = Int;
public typealias `alljoyn_claimcapabilityadditionalinfo_masks` = Int;
public typealias `alljoyn_credentials` = Long;
public typealias `alljoyn_interfacedescription` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `alljoyn_interfacedescription_member` (
    public var `iface`: `alljoyn_interfacedescription`,
    public var `memberType`: `alljoyn_messagetype`,
    public var `name`: `windows_sys`.`core`.`PCSTR`,
    public var `signature`: `windows_sys`.`core`.`PCSTR`,
    public var `returnSignature`: `windows_sys`.`core`.`PCSTR`,
    public var `argNames`: `windows_sys`.`core`.`PCSTR`,
    public var `internal_member`: /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1185:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for alljoyn_interfacedescription_member {
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
public class `alljoyn_interfacedescription_property` (
    public var `name`: `windows_sys`.`core`.`PCSTR`,
    public var `signature`: `windows_sys`.`core`.`PCSTR`,
    public var `access`: UByte,
    public var `internal_property`: /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1198:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for alljoyn_interfacedescription_property {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `alljoyn_interfacedescription_securitypolicy` = Int;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_interfacedescription_translation_callback_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`) -> `windows_sys`.`core`.`PCSTR`>>>;
public typealias `alljoyn_keystore` = Long;
public typealias `alljoyn_keystorelistener` = Long;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_keystorelistener_acquireexclusivelock_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `alljoyn_keystorelistener`) -> `QStatus`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `alljoyn_keystorelistener_callbacks` (
    public var `load_request`: `alljoyn_keystorelistener_loadrequest_ptr`,
    public var `store_request`: `alljoyn_keystorelistener_storerequest_ptr`,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_keystorelistener_loadrequest_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `alljoyn_keystorelistener`, `alljoyn_keystore`) -> `QStatus`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_keystorelistener_releaseexclusivelock_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `alljoyn_keystorelistener`) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_keystorelistener_storerequest_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `alljoyn_keystorelistener`, `alljoyn_keystore`) -> `QStatus`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `alljoyn_keystorelistener_with_synchronization_callbacks` (
    public var `load_request`: `alljoyn_keystorelistener_loadrequest_ptr`,
    public var `store_request`: `alljoyn_keystorelistener_storerequest_ptr`,
    public var `acquire_exclusive_lock`: `alljoyn_keystorelistener_acquireexclusivelock_ptr`,
    public var `release_exclusive_lock`: `alljoyn_keystorelistener_releaseexclusivelock_ptr`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `alljoyn_manifestarray` (
    public var `count`: ULong,
    public var `xmls`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?,
)
// UNSUPPORTED Rust 1231:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for alljoyn_manifestarray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `alljoyn_message` = Long;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_messagereceiver_methodhandler_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`alljoyn_busobject`, /* Rust *const */ kotlinx.cinterop.CPointer<`alljoyn_interfacedescription_member`>?, `alljoyn_message`) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_messagereceiver_replyhandler_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`alljoyn_message`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_messagereceiver_signalhandler_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`alljoyn_interfacedescription_member`>?, `windows_sys`.`core`.`PCSTR`, `alljoyn_message`) -> Unit>>>;
public typealias `alljoyn_messagetype` = Int;
public typealias `alljoyn_msgarg` = Long;
public typealias `alljoyn_observer` = Long;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_observer_object_discovered_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `alljoyn_proxybusobject_ref`) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_observer_object_lost_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `alljoyn_proxybusobject_ref`) -> Unit>>>;
public typealias `alljoyn_observerlistener` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `alljoyn_observerlistener_callback` (
    public var `object_discovered`: `alljoyn_observer_object_discovered_ptr`,
    public var `object_lost`: `alljoyn_observer_object_lost_ptr`,
)
public typealias `alljoyn_permissionconfigurationlistener` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `alljoyn_permissionconfigurationlistener_callbacks` (
    public var `factory_reset`: `alljoyn_permissionconfigurationlistener_factoryreset_ptr`,
    public var `policy_changed`: `alljoyn_permissionconfigurationlistener_policychanged_ptr`,
    public var `start_management`: `alljoyn_permissionconfigurationlistener_startmanagement_ptr`,
    public var `end_management`: `alljoyn_permissionconfigurationlistener_endmanagement_ptr`,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_permissionconfigurationlistener_endmanagement_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_permissionconfigurationlistener_factoryreset_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `QStatus`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_permissionconfigurationlistener_policychanged_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_permissionconfigurationlistener_startmanagement_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
public typealias `alljoyn_permissionconfigurator` = Long;
public typealias `alljoyn_pinglistener` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `alljoyn_pinglistener_callback` (
    public var `destination_found`: `alljoyn_autopinger_destination_found_ptr`,
    public var `destination_lost`: `alljoyn_autopinger_destination_lost_ptr`,
)
public typealias `alljoyn_proxybusobject` = Long;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_proxybusobject_listener_getallpropertiescb_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`QStatus`, `alljoyn_proxybusobject`, `alljoyn_msgarg`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_proxybusobject_listener_getpropertycb_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`QStatus`, `alljoyn_proxybusobject`, `alljoyn_msgarg`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_proxybusobject_listener_introspectcb_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`QStatus`, `alljoyn_proxybusobject`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_proxybusobject_listener_propertieschanged_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`alljoyn_proxybusobject`, `windows_sys`.`core`.`PCSTR`, `alljoyn_msgarg`, `alljoyn_msgarg`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_proxybusobject_listener_setpropertycb_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`QStatus`, `alljoyn_proxybusobject`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
public typealias `alljoyn_proxybusobject_ref` = Long;
public typealias `alljoyn_securityapplicationproxy` = Long;
public typealias `alljoyn_sessionlistener` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `alljoyn_sessionlistener_callbacks` (
    public var `session_lost`: `alljoyn_sessionlistener_sessionlost_ptr`,
    public var `session_member_added`: `alljoyn_sessionlistener_sessionmemberadded_ptr`,
    public var `session_member_removed`: `alljoyn_sessionlistener_sessionmemberremoved_ptr`,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_sessionlistener_sessionlost_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, `alljoyn_sessionlostreason`) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_sessionlistener_sessionmemberadded_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, `windows_sys`.`core`.`PCSTR`) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_sessionlistener_sessionmemberremoved_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, `windows_sys`.`core`.`PCSTR`) -> Unit>>>;
public typealias `alljoyn_sessionlostreason` = Int;
public typealias `alljoyn_sessionopts` = Long;
public typealias `alljoyn_sessionportlistener` = Long;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_sessionportlistener_acceptsessionjoiner_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UShort, `windows_sys`.`core`.`PCSTR`, `alljoyn_sessionopts`) -> Int>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `alljoyn_sessionportlistener_callbacks` (
    public var `accept_session_joiner`: `alljoyn_sessionportlistener_acceptsessionjoiner_ptr`,
    public var `session_joined`: `alljoyn_sessionportlistener_sessionjoined_ptr`,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `alljoyn_sessionportlistener_sessionjoined_ptr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UShort, UInt, `windows_sys`.`core`.`PCSTR`) -> Unit>>>;
public typealias `alljoyn_typeid` = Int;
