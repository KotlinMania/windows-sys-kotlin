// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=CollectionsListAllocateBufferAndSerialize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `CollectionsListAllocateBufferAndSerialize`(`sourcecollection` : /* Rust *const */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?, `ptargetbuffersizeinbytes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ptargetbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=CollectionsListCopyAndMarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `CollectionsListCopyAndMarshall`(`target` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?, `source` : /* Rust *const */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=CollectionsListDeserializeFromBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `CollectionsListDeserializeFromBuffer`(`sourcebuffersizeinbytes` : UInt, `sourcebuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `targetcollection` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=CollectionsListGetFillableCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CollectionsListGetFillableCount`(`buffersizebytes` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=CollectionsListGetMarshalledSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `CollectionsListGetMarshalledSize`(`collection` : /* Rust *const */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=CollectionsListGetMarshalledSizeWithoutSerialization; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `CollectionsListGetMarshalledSizeWithoutSerialization`(`collection` : /* Rust *const */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=CollectionsListGetSerializedSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `CollectionsListGetSerializedSize`(`collection` : /* Rust *const */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=CollectionsListMarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `CollectionsListMarshall`(`target` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=CollectionsListSerializeToBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `CollectionsListSerializeToBuffer`(`sourcecollection` : /* Rust *const */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?, `targetbuffersizeinbytes` : UInt, `targetbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=CollectionsListSortSubscribedActivitiesByConfidence; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `CollectionsListSortSubscribedActivitiesByConfidence`(`thresholds` : /* Rust *const */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?, `pcollection` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=CollectionsListUpdateMarshalledPointer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `CollectionsListUpdateMarshalledPointer`(`collection` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=EvaluateActivityThresholds; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `EvaluateActivityThresholds`(`newsample` : /* Rust *const */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?, `oldsample` : /* Rust *const */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?, `thresholds` : /* Rust *const */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=GetPerformanceTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPerformanceTime`(`timems` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=InitPropVariantFromCLSIDArray; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `InitPropVariantFromCLSIDArray`(`members` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `size` : UInt, `ppropvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Com`.`StructuredStorage`.`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=InitPropVariantFromFloat; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `InitPropVariantFromFloat`(`fltval` : Float, `ppropvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Com`.`StructuredStorage`.`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=IsCollectionListSame; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `IsCollectionListSame`(`lista` : /* Rust *const */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?, `listb` : /* Rust *const */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=IsGUIDPresentInList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsGUIDPresentInList`(`guidarray` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `arraylength` : UInt, `guidelem` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=IsKeyPresentInCollectionList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `IsKeyPresentInCollectionList`(`plist` : /* Rust *const */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?, `pkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`PROPERTYKEY`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=IsKeyPresentInPropertyList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsKeyPresentInPropertyList`(`plist` : /* Rust *const */ kotlinx.cinterop.CPointer<`SENSOR_PROPERTY_LIST`>?, `pkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`PROPERTYKEY`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=IsSensorSubscribed; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `IsSensorSubscribed`(`subscriptionlist` : /* Rust *const */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?, `currenttype` : `windows_sys`.`core`.`GUID`) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=PropKeyFindKeyGetBool; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `PropKeyFindKeyGetBool`(`plist` : /* Rust *const */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?, `pkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`PROPERTYKEY`>?, `pretvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=PropKeyFindKeyGetDouble; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `PropKeyFindKeyGetDouble`(`plist` : /* Rust *const */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?, `pkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`PROPERTYKEY`>?, `pretvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=PropKeyFindKeyGetFileTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `PropKeyFindKeyGetFileTime`(`plist` : /* Rust *const */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?, `pkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`PROPERTYKEY`>?, `pretvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=PropKeyFindKeyGetFloat; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `PropKeyFindKeyGetFloat`(`plist` : /* Rust *const */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?, `pkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`PROPERTYKEY`>?, `pretvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=PropKeyFindKeyGetGuid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `PropKeyFindKeyGetGuid`(`plist` : /* Rust *const */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?, `pkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`PROPERTYKEY`>?, `pretvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=PropKeyFindKeyGetInt32; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `PropKeyFindKeyGetInt32`(`plist` : /* Rust *const */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?, `pkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`PROPERTYKEY`>?, `pretvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=PropKeyFindKeyGetInt64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `PropKeyFindKeyGetInt64`(`plist` : /* Rust *const */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?, `pkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`PROPERTYKEY`>?, `pretvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=PropKeyFindKeyGetNthInt64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `PropKeyFindKeyGetNthInt64`(`plist` : /* Rust *const */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?, `pkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`PROPERTYKEY`>?, `occurrence` : UInt, `pretvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=PropKeyFindKeyGetNthUlong; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `PropKeyFindKeyGetNthUlong`(`plist` : /* Rust *const */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?, `pkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`PROPERTYKEY`>?, `occurrence` : UInt, `pretvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=PropKeyFindKeyGetNthUshort; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `PropKeyFindKeyGetNthUshort`(`plist` : /* Rust *const */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?, `pkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`PROPERTYKEY`>?, `occurrence` : UInt, `pretvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=PropKeyFindKeyGetPropVariant; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `PropKeyFindKeyGetPropVariant`(`plist` : /* Rust *const */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?, `pkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`PROPERTYKEY`>?, `typecheck` : Boolean, `pvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Com`.`StructuredStorage`.`PROPVARIANT`>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=PropKeyFindKeyGetUlong; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `PropKeyFindKeyGetUlong`(`plist` : /* Rust *const */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?, `pkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`PROPERTYKEY`>?, `pretvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=PropKeyFindKeyGetUshort; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `PropKeyFindKeyGetUshort`(`plist` : /* Rust *const */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?, `pkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`PROPERTYKEY`>?, `pretvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=PropKeyFindKeySetPropVariant; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `PropKeyFindKeySetPropVariant`(`plist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?, `pkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`PROPERTYKEY`>?, `typecheck` : Boolean, `pvalue` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Com`.`StructuredStorage`.`PROPVARIANT`>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=PropVariantGetInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Devices_Properties", feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `PropVariantGetInformation`(`propvariantvalue` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Com`.`StructuredStorage`.`PROPVARIANT`>?, `propvariantoffset` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `propvariantsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `propvariantpointer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `remappedtype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Properties`.`DEVPROPTYPE`>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=PropertiesListCopy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PropertiesListCopy`(`target` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SENSOR_PROPERTY_LIST`>?, `source` : /* Rust *const */ kotlinx.cinterop.CPointer<`SENSOR_PROPERTY_LIST`>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=PropertiesListGetFillableCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PropertiesListGetFillableCount`(`buffersizebytes` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=SensorCollectionGetAt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `SensorCollectionGetAt`(`index` : UInt, `psensorslist` : /* Rust *const */ kotlinx.cinterop.CPointer<`SENSOR_COLLECTION_LIST`>?, `pkey` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`PROPERTYKEY`>?, `pvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Com`.`StructuredStorage`.`PROPVARIANT`>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=SerializationBufferAllocate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SerializationBufferAllocate`(`sizeinbytes` : UInt, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensorsutilsv2.dll, ABI=system, export=SerializationBufferFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SerializationBufferFree`(`buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
public typealias `ACTIVITY_STATE` = Int;
public typealias `ACTIVITY_STATE_COUNT` = Int;
public typealias `AXIS` = Int;
public const val `AXIS_MAX`: `AXIS` = 3;
public const val `AXIS_X`: `AXIS` = 0;
public const val `AXIS_Y`: `AXIS` = 1;
public const val `AXIS_Z`: `AXIS` = 2;
public const val `ActivityStateCount`: `ACTIVITY_STATE_COUNT` = 8;
public const val `ActivityState_Biking`: `ACTIVITY_STATE` = 64;
public const val `ActivityState_Fidgeting`: `ACTIVITY_STATE` = 4;
public const val `ActivityState_Force_Dword`: `ACTIVITY_STATE` = -1;
public const val `ActivityState_Idle`: `ACTIVITY_STATE` = 128;
public const val `ActivityState_InVehicle`: `ACTIVITY_STATE` = 32;
public const val `ActivityState_Max`: `ACTIVITY_STATE` = 256;
public const val `ActivityState_Running`: `ACTIVITY_STATE` = 16;
public const val `ActivityState_Stationary`: `ACTIVITY_STATE` = 2;
public const val `ActivityState_Unknown`: `ACTIVITY_STATE` = 1;
public const val `ActivityState_Walking`: `ACTIVITY_STATE` = 8;
public typealias `ELEVATION_CHANGE_MODE` = Int;
public const val `ElevationChangeMode_Elevator`: `ELEVATION_CHANGE_MODE` = 1;
public const val `ElevationChangeMode_Force_Dword`: `ELEVATION_CHANGE_MODE` = -1;
public const val `ElevationChangeMode_Max`: `ELEVATION_CHANGE_MODE` = 3;
public const val `ElevationChangeMode_Stepping`: `ELEVATION_CHANGE_MODE` = 2;
public const val `ElevationChangeMode_Unknown`: `ELEVATION_CHANGE_MODE` = 0;
public const val `GNSS_CLEAR_ALL_ASSISTANCE_DATA`: UInt = 1u;
// UNSUPPORTED Rust 98:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVINTERFACE_SENSOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xba1bb692_9b7a_4833_9a1e_525ed134e7e2);

// UNSUPPORTED Rust 99:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorCategory_All: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc317c286_c468_4288_9975_d4c4587c442c);

// UNSUPPORTED Rust 100:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorCategory_Biometric: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xca19690f_a2c7_477d_a99e_99ec6e2b5648);

// UNSUPPORTED Rust 101:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorCategory_Electrical: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfb73fcd8_fc4a_483c_ac58_27b691c6beff);

// UNSUPPORTED Rust 102:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorCategory_Environmental: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x323439aa_7f66_492b_ba0c_73e9aa0a65d5);

// UNSUPPORTED Rust 103:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorCategory_Light: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x17a665c0_9063_4216_b202_5c7a255e18ce);

// UNSUPPORTED Rust 104:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorCategory_Location: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbfa794e4_f964_4fdb_90f6_51056bfe4b44);

// UNSUPPORTED Rust 105:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorCategory_Mechanical: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8d131d68_8ef7_4656_80b5_cccbd93791c5);

// UNSUPPORTED Rust 106:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorCategory_Motion: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcd09daf1_3b2e_4c3d_b598_b5e5ff93fd46);

// UNSUPPORTED Rust 107:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorCategory_Orientation: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9e6c04b6_96fe_4954_b726_68682a473f69);

// UNSUPPORTED Rust 108:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorCategory_Other: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2c90e7a9_f4c9_4fa2_af37_56d471fe5a3d);

// UNSUPPORTED Rust 109:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorCategory_PersonalActivity: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf1609081_1e12_412b_a14d_cbb0e95bd2e5);

// UNSUPPORTED Rust 110:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorCategory_Scanner: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb000e77e_f5b5_420f_815d_0270a726f270);

// UNSUPPORTED Rust 111:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorCategory_Unsupported: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2beae7fa_19b0_48c5_a1f6_b5480dc206b0);

// UNSUPPORTED Rust 112:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorType_Accelerometer3D: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc2fb0f5f_e2d2_4c78_bcd0_352a9582819d);

// UNSUPPORTED Rust 113:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorType_ActivityDetection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9d9e0118_1807_4f2e_96e4_2ce57142e196);

// UNSUPPORTED Rust 114:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorType_AmbientLight: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x97f115c8_599a_4153_8894_d2d12899918a);

// UNSUPPORTED Rust 115:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorType_Barometer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0e903829_ff8a_4a93_97df_3dcbde402288);

// UNSUPPORTED Rust 116:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorType_Custom: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe83af229_8640_4d18_a213_e22675ebb2c3);

// UNSUPPORTED Rust 117:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorType_FloorElevation: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xade4987f_7ac4_4dfa_9722_0a027181c747);

// UNSUPPORTED Rust 118:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorType_GeomagneticOrientation: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe77195f8_2d1f_4823_971b_1c4467556c9d);

// UNSUPPORTED Rust 119:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorType_GravityVector: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03b52c73_bb76_463f_9524_38de76eb700b);

// UNSUPPORTED Rust 120:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorType_Gyrometer3D: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x09485f5a_759e_42c2_bd4b_a349b75c8643);

// UNSUPPORTED Rust 121:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorType_HingeAngle: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x82358065_f4c4_4da1_b272_13c23332a207);

// UNSUPPORTED Rust 122:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorType_Humidity: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5c72bf67_bd7e_4257_990b_98a3ba3b400a);

// UNSUPPORTED Rust 123:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorType_LinearAccelerometer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x038b0283_97b4_41c8_bc24_5ff1aa48fec7);

// UNSUPPORTED Rust 124:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorType_Magnetometer3D: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x55e5effb_15c7_40df_8698_a84b7c863c53);

// UNSUPPORTED Rust 125:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorType_Orientation: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcdb5d8f7_3cfd_41c8_8542_cce622cf5d6e);

// UNSUPPORTED Rust 126:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorType_Pedometer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb19f89af_e3eb_444b_8dea_202575a71599);

// UNSUPPORTED Rust 127:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorType_Proximity: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5220dae9_3179_4430_9f90_06266d2a34de);

// UNSUPPORTED Rust 128:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorType_RelativeOrientation: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x40993b51_4706_44dc_98d5_c920c037ffab);

// UNSUPPORTED Rust 129:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorType_SimpleDeviceOrientation: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x86a19291_0482_402c_bf4c_addac52b1c39);

// UNSUPPORTED Rust 130:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SensorType_Temperature: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x04fd0ec4_d5da_45fa_95a9_5db38ee19306);

public typealias `HUMAN_PRESENCE_DETECTION_TYPE` = Int;
public typealias `HUMAN_PRESENCE_DETECTION_TYPE_COUNT` = Int;
public const val `HumanPresenceDetectionTypeCount`: `HUMAN_PRESENCE_DETECTION_TYPE_COUNT` = 4;
public const val `HumanPresenceDetectionType_AudioBiometric`: `HUMAN_PRESENCE_DETECTION_TYPE` = 8;
public const val `HumanPresenceDetectionType_FacialBiometric`: `HUMAN_PRESENCE_DETECTION_TYPE` = 4;
public const val `HumanPresenceDetectionType_Force_Dword`: `HUMAN_PRESENCE_DETECTION_TYPE` = -1;
public const val `HumanPresenceDetectionType_Undefined`: `HUMAN_PRESENCE_DETECTION_TYPE` = 0;
public const val `HumanPresenceDetectionType_VendorDefinedBiometric`: `HUMAN_PRESENCE_DETECTION_TYPE` = 2;
public const val `HumanPresenceDetectionType_VendorDefinedNonBiometric`: `HUMAN_PRESENCE_DETECTION_TYPE` = 1;
public typealias `LOCATION_DESIRED_ACCURACY` = Int;
public const val `LOCATION_DESIRED_ACCURACY_DEFAULT`: `LOCATION_DESIRED_ACCURACY` = 0;
public const val `LOCATION_DESIRED_ACCURACY_HIGH`: `LOCATION_DESIRED_ACCURACY` = 1;
public typealias `LOCATION_POSITION_SOURCE` = Int;
public const val `LOCATION_POSITION_SOURCE_CELLULAR`: `LOCATION_POSITION_SOURCE` = 0;
public const val `LOCATION_POSITION_SOURCE_IPADDRESS`: `LOCATION_POSITION_SOURCE` = 3;
public const val `LOCATION_POSITION_SOURCE_SATELLITE`: `LOCATION_POSITION_SOURCE` = 1;
public const val `LOCATION_POSITION_SOURCE_UNKNOWN`: `LOCATION_POSITION_SOURCE` = 4;
public const val `LOCATION_POSITION_SOURCE_WIFI`: `LOCATION_POSITION_SOURCE` = 2;
public typealias `MAGNETOMETER_ACCURACY` = Int;
public const val `MAGNETOMETER_ACCURACY_APPROXIMATE`: `MagnetometerAccuracy` = 2;
public const val `MAGNETOMETER_ACCURACY_HIGH`: `MagnetometerAccuracy` = 3;
public const val `MAGNETOMETER_ACCURACY_UNKNOWN`: `MagnetometerAccuracy` = 0;
public const val `MAGNETOMETER_ACCURACY_UNRELIABLE`: `MagnetometerAccuracy` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MATRIX3X3` (
    public var `Anonymous`: `MATRIX3X3_0`,
)
// UNSUPPORTED Rust 159:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MATRIX3X3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 164:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MATRIX3X3_0 {
//     pub Anonymous1: MATRIX3X3_0_0,
//     pub Anonymous2: MATRIX3X3_0_1,
//     pub M: [f32; 9],
// }

// UNSUPPORTED Rust 171:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MATRIX3X3_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MATRIX3X3_0_0` (
    public var `A11`: Float,
    public var `A12`: Float,
    public var `A13`: Float,
    public var `A21`: Float,
    public var `A22`: Float,
    public var `A23`: Float,
    public var `A31`: Float,
    public var `A32`: Float,
    public var `A33`: Float,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MATRIX3X3_0_1` (
    public var `V1`: `VEC3D`,
    public var `V2`: `VEC3D`,
    public var `V3`: `VEC3D`,
)
public typealias `MagnetometerAccuracy` = Int;
public const val `MagnetometerAccuracy_Approximate`: `MAGNETOMETER_ACCURACY` = 2;
public const val `MagnetometerAccuracy_High`: `MAGNETOMETER_ACCURACY` = 3;
public const val `MagnetometerAccuracy_Unknown`: `MAGNETOMETER_ACCURACY` = 0;
public const val `MagnetometerAccuracy_Unreliable`: `MAGNETOMETER_ACCURACY` = 1;
public typealias `PEDOMETER_STEP_TYPE` = Int;
public typealias `PEDOMETER_STEP_TYPE_COUNT` = Int;
public typealias `PROXIMITY_SENSOR_CAPABILITIES` = Int;
public typealias `PROXIMITY_TYPE` = Int;
public const val `PedometerStepTypeCount`: `PEDOMETER_STEP_TYPE_COUNT` = 3;
public const val `PedometerStepType_Force_Dword`: `PEDOMETER_STEP_TYPE` = -1;
public const val `PedometerStepType_Max`: `PEDOMETER_STEP_TYPE` = 8;
public const val `PedometerStepType_Running`: `PEDOMETER_STEP_TYPE` = 4;
public const val `PedometerStepType_Unknown`: `PEDOMETER_STEP_TYPE` = 1;
public const val `PedometerStepType_Walking`: `PEDOMETER_STEP_TYPE` = 2;
public const val `ProximityType_Force_Dword`: `PROXIMITY_TYPE` = -1;
public const val `ProximityType_HumanProximity`: `PROXIMITY_TYPE` = 1;
public const val `ProximityType_ObjectProximity`: `PROXIMITY_TYPE` = 0;
public const val `Proximity_Sensor_Human_Engagement_Capable`: `PROXIMITY_SENSOR_CAPABILITIES` = 2;
public const val `Proximity_Sensor_Human_Presence_Capable`: `PROXIMITY_SENSOR_CAPABILITIES` = 1;
public const val `Proximity_Sensor_Supported_Capabilities`: `PROXIMITY_SENSOR_CAPABILITIES` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `QUATERNION` (
    public var `X`: Float,
    public var `Y`: Float,
    public var `Z`: Float,
    public var `W`: Float,
)
// UNSUPPORTED Rust 225:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_CATEGORY_ALL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc317c286_c468_4288_9975_d4c4587c442c);

// UNSUPPORTED Rust 226:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_CATEGORY_BIOMETRIC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xca19690f_a2c7_477d_a99e_99ec6e2b5648);

// UNSUPPORTED Rust 227:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_CATEGORY_ELECTRICAL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfb73fcd8_fc4a_483c_ac58_27b691c6beff);

// UNSUPPORTED Rust 228:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_CATEGORY_ENVIRONMENTAL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x323439aa_7f66_492b_ba0c_73e9aa0a65d5);

// UNSUPPORTED Rust 229:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_CATEGORY_LIGHT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x17a665c0_9063_4216_b202_5c7a255e18ce);

// UNSUPPORTED Rust 230:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_CATEGORY_LOCATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbfa794e4_f964_4fdb_90f6_51056bfe4b44);

// UNSUPPORTED Rust 231:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_CATEGORY_MECHANICAL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8d131d68_8ef7_4656_80b5_cccbd93791c5);

// UNSUPPORTED Rust 232:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_CATEGORY_MOTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcd09daf1_3b2e_4c3d_b598_b5e5ff93fd46);

// UNSUPPORTED Rust 233:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_CATEGORY_ORIENTATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9e6c04b6_96fe_4954_b726_68682a473f69);

// UNSUPPORTED Rust 234:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_CATEGORY_OTHER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2c90e7a9_f4c9_4fa2_af37_56d471fe5a3d);

// UNSUPPORTED Rust 235:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_CATEGORY_SCANNER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb000e77e_f5b5_420f_815d_0270a726f270);

// UNSUPPORTED Rust 236:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_CATEGORY_UNSUPPORTED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2beae7fa_19b0_48c5_a1f6_b5480dc206b0);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SENSOR_COLLECTION_LIST` (
    public var `AllocatedSizeInBytes`: UInt,
    public var `Count`: UInt,
    public var `List`: Array<`SENSOR_VALUE_PAIR`>,
)
// UNSUPPORTED Rust 245:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// impl Default for SENSOR_COLLECTION_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SENSOR_CONNECTION_TYPES` = Int;
public const val `SENSOR_CONNECTION_TYPE_PC_ATTACHED`: `SensorConnectionType` = 1;
public const val `SENSOR_CONNECTION_TYPE_PC_EXTERNAL`: `SensorConnectionType` = 2;
public const val `SENSOR_CONNECTION_TYPE_PC_INTEGRATED`: `SensorConnectionType` = 0;
// UNSUPPORTED Rust 255:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_ABSOLUTE_PRESSURE_PASCAL: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x38564a7c_f2f2_49bb_9b2b_ba60f66a58df), pid: 5 };

// UNSUPPORTED Rust 256:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_ACCELERATION_X_G: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x3f8a69a2_07c5_4e48_a965_cd797aab56d5), pid: 2 };

// UNSUPPORTED Rust 257:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_ACCELERATION_Y_G: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x3f8a69a2_07c5_4e48_a965_cd797aab56d5), pid: 3 };

// UNSUPPORTED Rust 258:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_ACCELERATION_Z_G: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x3f8a69a2_07c5_4e48_a965_cd797aab56d5), pid: 4 };

// UNSUPPORTED Rust 259:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_ADDRESS1: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 23 };

// UNSUPPORTED Rust 260:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_ADDRESS2: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 24 };

// UNSUPPORTED Rust 261:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_ALTITUDE_ANTENNA_SEALEVEL_METERS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 36 };

// UNSUPPORTED Rust 262:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_ALTITUDE_ELLIPSOID_ERROR_METERS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 29 };

// UNSUPPORTED Rust 263:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_ALTITUDE_ELLIPSOID_METERS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 5 };

// UNSUPPORTED Rust 264:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_ALTITUDE_SEALEVEL_ERROR_METERS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 30 };

// UNSUPPORTED Rust 265:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_ALTITUDE_SEALEVEL_METERS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 4 };

// UNSUPPORTED Rust 266:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_ANGULAR_ACCELERATION_X_DEGREES_PER_SECOND_SQUARED: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x3f8a69a2_07c5_4e48_a965_cd797aab56d5), pid: 5 };

// UNSUPPORTED Rust 267:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_ANGULAR_ACCELERATION_Y_DEGREES_PER_SECOND_SQUARED: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x3f8a69a2_07c5_4e48_a965_cd797aab56d5), pid: 6 };

// UNSUPPORTED Rust 268:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_ANGULAR_ACCELERATION_Z_DEGREES_PER_SECOND_SQUARED: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x3f8a69a2_07c5_4e48_a965_cd797aab56d5), pid: 7 };

// UNSUPPORTED Rust 269:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_ANGULAR_VELOCITY_X_DEGREES_PER_SECOND: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x3f8a69a2_07c5_4e48_a965_cd797aab56d5), pid: 10 };

// UNSUPPORTED Rust 270:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_ANGULAR_VELOCITY_Y_DEGREES_PER_SECOND: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x3f8a69a2_07c5_4e48_a965_cd797aab56d5), pid: 11 };

// UNSUPPORTED Rust 271:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_ANGULAR_VELOCITY_Z_DEGREES_PER_SECOND: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x3f8a69a2_07c5_4e48_a965_cd797aab56d5), pid: 12 };

// UNSUPPORTED Rust 272:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_ATMOSPHERIC_PRESSURE_BAR: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x8b0aa2f1_2d57_42ee_8cc0_4d27622b46c4), pid: 4 };

// UNSUPPORTED Rust 273:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_BIOMETRIC_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2299288a_6d9e_4b0b_b7ec_3528f89e40af);

// UNSUPPORTED Rust 274:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_BOOLEAN_SWITCH_ARRAY_STATES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x38564a7c_f2f2_49bb_9b2b_ba60f66a58df), pid: 10 };

// UNSUPPORTED Rust 275:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_BOOLEAN_SWITCH_STATE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x38564a7c_f2f2_49bb_9b2b_ba60f66a58df), pid: 2 };

// UNSUPPORTED Rust 276:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CAPACITANCE_FARAD: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xbbb246d1_e242_4780_a2d3_cded84f35842), pid: 4 };

// UNSUPPORTED Rust 277:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CITY: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 25 };

// UNSUPPORTED Rust 278:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_COMMON_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdb5e0cf2_cf1f_4c18_b46c_d86011d62150);

// UNSUPPORTED Rust 279:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_COUNTRY_REGION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 28 };

// UNSUPPORTED Rust 280:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CURRENT_AMPS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xbbb246d1_e242_4780_a2d3_cded84f35842), pid: 3 };

// UNSUPPORTED Rust 281:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CUSTOM_BOOLEAN_ARRAY: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb14c764f_07cf_41e8_9d82_ebe3d0776a6f), pid: 6 };

// UNSUPPORTED Rust 282:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CUSTOM_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb14c764f_07cf_41e8_9d82_ebe3d0776a6f);

// UNSUPPORTED Rust 283:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CUSTOM_USAGE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb14c764f_07cf_41e8_9d82_ebe3d0776a6f), pid: 5 };

// UNSUPPORTED Rust 284:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CUSTOM_VALUE1: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb14c764f_07cf_41e8_9d82_ebe3d0776a6f), pid: 7 };

// UNSUPPORTED Rust 285:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CUSTOM_VALUE10: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb14c764f_07cf_41e8_9d82_ebe3d0776a6f), pid: 16 };

// UNSUPPORTED Rust 286:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CUSTOM_VALUE11: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb14c764f_07cf_41e8_9d82_ebe3d0776a6f), pid: 17 };

// UNSUPPORTED Rust 287:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CUSTOM_VALUE12: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb14c764f_07cf_41e8_9d82_ebe3d0776a6f), pid: 18 };

// UNSUPPORTED Rust 288:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CUSTOM_VALUE13: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb14c764f_07cf_41e8_9d82_ebe3d0776a6f), pid: 19 };

// UNSUPPORTED Rust 289:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CUSTOM_VALUE14: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb14c764f_07cf_41e8_9d82_ebe3d0776a6f), pid: 20 };

// UNSUPPORTED Rust 290:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CUSTOM_VALUE15: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb14c764f_07cf_41e8_9d82_ebe3d0776a6f), pid: 21 };

// UNSUPPORTED Rust 291:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CUSTOM_VALUE16: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb14c764f_07cf_41e8_9d82_ebe3d0776a6f), pid: 22 };

// UNSUPPORTED Rust 292:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CUSTOM_VALUE17: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb14c764f_07cf_41e8_9d82_ebe3d0776a6f), pid: 23 };

// UNSUPPORTED Rust 293:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CUSTOM_VALUE18: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb14c764f_07cf_41e8_9d82_ebe3d0776a6f), pid: 24 };

// UNSUPPORTED Rust 294:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CUSTOM_VALUE19: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb14c764f_07cf_41e8_9d82_ebe3d0776a6f), pid: 25 };

// UNSUPPORTED Rust 295:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CUSTOM_VALUE2: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb14c764f_07cf_41e8_9d82_ebe3d0776a6f), pid: 8 };

// UNSUPPORTED Rust 296:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CUSTOM_VALUE20: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb14c764f_07cf_41e8_9d82_ebe3d0776a6f), pid: 26 };

// UNSUPPORTED Rust 297:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CUSTOM_VALUE21: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb14c764f_07cf_41e8_9d82_ebe3d0776a6f), pid: 27 };

// UNSUPPORTED Rust 298:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CUSTOM_VALUE22: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb14c764f_07cf_41e8_9d82_ebe3d0776a6f), pid: 28 };

// UNSUPPORTED Rust 299:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CUSTOM_VALUE23: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb14c764f_07cf_41e8_9d82_ebe3d0776a6f), pid: 29 };

// UNSUPPORTED Rust 300:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CUSTOM_VALUE24: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb14c764f_07cf_41e8_9d82_ebe3d0776a6f), pid: 30 };

// UNSUPPORTED Rust 301:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CUSTOM_VALUE25: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb14c764f_07cf_41e8_9d82_ebe3d0776a6f), pid: 31 };

// UNSUPPORTED Rust 302:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CUSTOM_VALUE26: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb14c764f_07cf_41e8_9d82_ebe3d0776a6f), pid: 32 };

// UNSUPPORTED Rust 303:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CUSTOM_VALUE27: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb14c764f_07cf_41e8_9d82_ebe3d0776a6f), pid: 33 };

// UNSUPPORTED Rust 304:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CUSTOM_VALUE28: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb14c764f_07cf_41e8_9d82_ebe3d0776a6f), pid: 34 };

// UNSUPPORTED Rust 305:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CUSTOM_VALUE3: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb14c764f_07cf_41e8_9d82_ebe3d0776a6f), pid: 9 };

// UNSUPPORTED Rust 306:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CUSTOM_VALUE4: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb14c764f_07cf_41e8_9d82_ebe3d0776a6f), pid: 10 };

// UNSUPPORTED Rust 307:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CUSTOM_VALUE5: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb14c764f_07cf_41e8_9d82_ebe3d0776a6f), pid: 11 };

// UNSUPPORTED Rust 308:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CUSTOM_VALUE6: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb14c764f_07cf_41e8_9d82_ebe3d0776a6f), pid: 12 };

// UNSUPPORTED Rust 309:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CUSTOM_VALUE7: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb14c764f_07cf_41e8_9d82_ebe3d0776a6f), pid: 13 };

// UNSUPPORTED Rust 310:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CUSTOM_VALUE8: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb14c764f_07cf_41e8_9d82_ebe3d0776a6f), pid: 14 };

// UNSUPPORTED Rust 311:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_CUSTOM_VALUE9: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb14c764f_07cf_41e8_9d82_ebe3d0776a6f), pid: 15 };

// UNSUPPORTED Rust 312:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_DGPS_DATA_AGE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 35 };

// UNSUPPORTED Rust 313:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_DIFFERENTIAL_REFERENCE_STATION_ID: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 37 };

// UNSUPPORTED Rust 314:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_DISTANCE_X_METERS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1637d8a2_4248_4275_865d_558de84aedfd), pid: 8 };

// UNSUPPORTED Rust 315:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_DISTANCE_Y_METERS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1637d8a2_4248_4275_865d_558de84aedfd), pid: 9 };

// UNSUPPORTED Rust 316:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_DISTANCE_Z_METERS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1637d8a2_4248_4275_865d_558de84aedfd), pid: 10 };

// UNSUPPORTED Rust 317:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_ELECTRICAL_FREQUENCY_HERTZ: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xbbb246d1_e242_4780_a2d3_cded84f35842), pid: 9 };

// UNSUPPORTED Rust 318:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_ELECTRICAL_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbbb246d1_e242_4780_a2d3_cded84f35842);

// UNSUPPORTED Rust 319:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_ELECTRICAL_PERCENT_OF_RANGE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xbbb246d1_e242_4780_a2d3_cded84f35842), pid: 8 };

// UNSUPPORTED Rust 320:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_ELECTRICAL_POWER_WATTS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xbbb246d1_e242_4780_a2d3_cded84f35842), pid: 7 };

// UNSUPPORTED Rust 321:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_ENVIRONMENTAL_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8b0aa2f1_2d57_42ee_8cc0_4d27622b46c4);

// UNSUPPORTED Rust 322:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_ERROR_RADIUS_METERS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 22 };

// UNSUPPORTED Rust 323:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_FIX_QUALITY: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 10 };

// UNSUPPORTED Rust 324:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_FIX_TYPE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 11 };

// UNSUPPORTED Rust 325:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_FORCE_NEWTONS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x38564a7c_f2f2_49bb_9b2b_ba60f66a58df), pid: 4 };

// UNSUPPORTED Rust 326:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_GAUGE_PRESSURE_PASCAL: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x38564a7c_f2f2_49bb_9b2b_ba60f66a58df), pid: 6 };

// UNSUPPORTED Rust 327:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_GEOIDAL_SEPARATION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 34 };

// UNSUPPORTED Rust 328:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_GPS_OPERATION_MODE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 32 };

// UNSUPPORTED Rust 329:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_GPS_SELECTION_MODE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 31 };

// UNSUPPORTED Rust 330:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_GPS_STATUS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 33 };

// UNSUPPORTED Rust 331:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_GUID_MECHANICAL_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x38564a7c_f2f2_49bb_9b2b_ba60f66a58df);

// UNSUPPORTED Rust 332:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_HORIZONAL_DILUTION_OF_PRECISION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 13 };

// UNSUPPORTED Rust 333:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_HUMAN_PRESENCE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2299288a_6d9e_4b0b_b7ec_3528f89e40af), pid: 2 };

// UNSUPPORTED Rust 334:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_HUMAN_PROXIMITY_METERS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2299288a_6d9e_4b0b_b7ec_3528f89e40af), pid: 3 };

// UNSUPPORTED Rust 335:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_INDUCTANCE_HENRY: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xbbb246d1_e242_4780_a2d3_cded84f35842), pid: 6 };

// UNSUPPORTED Rust 336:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_LATITUDE_DEGREES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 2 };

// UNSUPPORTED Rust 337:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_LIGHT_CHROMACITY: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xe4c77ce2_dcb7_46e9_8439_4fec548833a6), pid: 4 };

// UNSUPPORTED Rust 338:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_LIGHT_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe4c77ce2_dcb7_46e9_8439_4fec548833a6);

// UNSUPPORTED Rust 339:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_LIGHT_LEVEL_LUX: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xe4c77ce2_dcb7_46e9_8439_4fec548833a6), pid: 2 };

// UNSUPPORTED Rust 340:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_LIGHT_TEMPERATURE_KELVIN: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xe4c77ce2_dcb7_46e9_8439_4fec548833a6), pid: 3 };

// UNSUPPORTED Rust 341:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_LOCATION_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4);

// UNSUPPORTED Rust 342:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_LOCATION_SOURCE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 40 };

// UNSUPPORTED Rust 343:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_LONGITUDE_DEGREES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 3 };

// UNSUPPORTED Rust 344:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_MAGNETIC_FIELD_STRENGTH_X_MILLIGAUSS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1637d8a2_4248_4275_865d_558de84aedfd), pid: 19 };

// UNSUPPORTED Rust 345:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_MAGNETIC_FIELD_STRENGTH_Y_MILLIGAUSS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1637d8a2_4248_4275_865d_558de84aedfd), pid: 20 };

// UNSUPPORTED Rust 346:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_MAGNETIC_FIELD_STRENGTH_Z_MILLIGAUSS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1637d8a2_4248_4275_865d_558de84aedfd), pid: 21 };

// UNSUPPORTED Rust 347:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_MAGNETIC_HEADING_COMPENSATED_MAGNETIC_NORTH_DEGREES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1637d8a2_4248_4275_865d_558de84aedfd), pid: 11 };

// UNSUPPORTED Rust 348:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_MAGNETIC_HEADING_COMPENSATED_TRUE_NORTH_DEGREES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1637d8a2_4248_4275_865d_558de84aedfd), pid: 12 };

// UNSUPPORTED Rust 349:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_MAGNETIC_HEADING_DEGREES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 8 };

// UNSUPPORTED Rust 350:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_MAGNETIC_HEADING_MAGNETIC_NORTH_DEGREES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1637d8a2_4248_4275_865d_558de84aedfd), pid: 13 };

// UNSUPPORTED Rust 351:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_MAGNETIC_HEADING_TRUE_NORTH_DEGREES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1637d8a2_4248_4275_865d_558de84aedfd), pid: 14 };

// UNSUPPORTED Rust 352:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_MAGNETIC_HEADING_X_DEGREES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1637d8a2_4248_4275_865d_558de84aedfd), pid: 5 };

// UNSUPPORTED Rust 353:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_MAGNETIC_HEADING_Y_DEGREES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1637d8a2_4248_4275_865d_558de84aedfd), pid: 6 };

// UNSUPPORTED Rust 354:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_MAGNETIC_HEADING_Z_DEGREES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1637d8a2_4248_4275_865d_558de84aedfd), pid: 7 };

// UNSUPPORTED Rust 355:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_MAGNETIC_VARIATION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 9 };

// UNSUPPORTED Rust 356:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_MAGNETOMETER_ACCURACY: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1637d8a2_4248_4275_865d_558de84aedfd), pid: 22 };

// UNSUPPORTED Rust 357:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_MOTION_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3f8a69a2_07c5_4e48_a965_cd797aab56d5);

// UNSUPPORTED Rust 358:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_MOTION_STATE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x3f8a69a2_07c5_4e48_a965_cd797aab56d5), pid: 9 };

// UNSUPPORTED Rust 359:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_MULTIVALUE_SWITCH_STATE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x38564a7c_f2f2_49bb_9b2b_ba60f66a58df), pid: 3 };

// UNSUPPORTED Rust 360:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_NMEA_SENTENCE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 38 };

// UNSUPPORTED Rust 361:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_ORIENTATION_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1637d8a2_4248_4275_865d_558de84aedfd);

// UNSUPPORTED Rust 362:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_POSITION_DILUTION_OF_PRECISION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 12 };

// UNSUPPORTED Rust 363:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_POSTALCODE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 27 };

// UNSUPPORTED Rust 364:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_QUADRANT_ANGLE_DEGREES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1637d8a2_4248_4275_865d_558de84aedfd), pid: 15 };

// UNSUPPORTED Rust 365:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_QUATERNION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1637d8a2_4248_4275_865d_558de84aedfd), pid: 17 };

// UNSUPPORTED Rust 366:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_RELATIVE_HUMIDITY_PERCENT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x8b0aa2f1_2d57_42ee_8cc0_4d27622b46c4), pid: 3 };

// UNSUPPORTED Rust 367:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_RESISTANCE_OHMS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xbbb246d1_e242_4780_a2d3_cded84f35842), pid: 5 };

// UNSUPPORTED Rust 368:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_RFID_TAG_40_BIT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xd7a59a3c_3421_44ab_8d3a_9de8ab6c4cae), pid: 2 };

// UNSUPPORTED Rust 369:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_ROTATION_MATRIX: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1637d8a2_4248_4275_865d_558de84aedfd), pid: 16 };

// UNSUPPORTED Rust 370:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_SATELLITES_IN_VIEW: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 17 };

// UNSUPPORTED Rust 371:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_SATELLITES_IN_VIEW_AZIMUTH: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 20 };

// UNSUPPORTED Rust 372:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_SATELLITES_IN_VIEW_ELEVATION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 19 };

// UNSUPPORTED Rust 373:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_SATELLITES_IN_VIEW_ID: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 39 };

// UNSUPPORTED Rust 374:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_SATELLITES_IN_VIEW_PRNS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 18 };

// UNSUPPORTED Rust 375:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_SATELLITES_IN_VIEW_STN_RATIO: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 21 };

// UNSUPPORTED Rust 376:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_SATELLITES_USED_COUNT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 15 };

// UNSUPPORTED Rust 377:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_SATELLITES_USED_PRNS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 16 };

// UNSUPPORTED Rust 378:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_SATELLITES_USED_PRNS_AND_CONSTELLATIONS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 41 };

// UNSUPPORTED Rust 379:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_SCANNER_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd7a59a3c_3421_44ab_8d3a_9de8ab6c4cae);

// UNSUPPORTED Rust 380:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_SIMPLE_DEVICE_ORIENTATION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1637d8a2_4248_4275_865d_558de84aedfd), pid: 18 };

// UNSUPPORTED Rust 381:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_SPEED_KNOTS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 6 };

// UNSUPPORTED Rust 382:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_SPEED_METERS_PER_SECOND: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x3f8a69a2_07c5_4e48_a965_cd797aab56d5), pid: 8 };

// UNSUPPORTED Rust 383:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_STATE_PROVINCE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 26 };

// UNSUPPORTED Rust 384:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_STRAIN: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x38564a7c_f2f2_49bb_9b2b_ba60f66a58df), pid: 7 };

// UNSUPPORTED Rust 385:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_TEMPERATURE_CELSIUS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x8b0aa2f1_2d57_42ee_8cc0_4d27622b46c4), pid: 2 };

// UNSUPPORTED Rust 386:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_TILT_X_DEGREES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1637d8a2_4248_4275_865d_558de84aedfd), pid: 2 };

// UNSUPPORTED Rust 387:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_TILT_Y_DEGREES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1637d8a2_4248_4275_865d_558de84aedfd), pid: 3 };

// UNSUPPORTED Rust 388:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_TILT_Z_DEGREES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1637d8a2_4248_4275_865d_558de84aedfd), pid: 4 };

// UNSUPPORTED Rust 389:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_TIMESTAMP: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xdb5e0cf2_cf1f_4c18_b46c_d86011d62150), pid: 2 };

// UNSUPPORTED Rust 390:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_TOUCH_STATE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2299288a_6d9e_4b0b_b7ec_3528f89e40af), pid: 4 };

// UNSUPPORTED Rust 391:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_TRUE_HEADING_DEGREES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 7 };

// UNSUPPORTED Rust 392:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_VERTICAL_DILUTION_OF_PRECISION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x055c74d8_ca6f_47d6_95c6_1ed3637a0ff4), pid: 14 };

// UNSUPPORTED Rust 393:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_VOLTAGE_VOLTS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xbbb246d1_e242_4780_a2d3_cded84f35842), pid: 2 };

// UNSUPPORTED Rust 394:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_WEIGHT_KILOGRAMS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x38564a7c_f2f2_49bb_9b2b_ba60f66a58df), pid: 8 };

// UNSUPPORTED Rust 395:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_WIND_DIRECTION_DEGREES_ANTICLOCKWISE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x8b0aa2f1_2d57_42ee_8cc0_4d27622b46c4), pid: 5 };

// UNSUPPORTED Rust 396:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_DATA_TYPE_WIND_SPEED_METERS_PER_SECOND: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x8b0aa2f1_2d57_42ee_8cc0_4d27622b46c4), pid: 6 };

// UNSUPPORTED Rust 397:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_ERROR_PARAMETER_COMMON_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x77112bcd_fce1_4f43_b8b8_a88256adb4b3);

// UNSUPPORTED Rust 398:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_EVENT_ACCELEROMETER_SHAKE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x825f5a94_0f48_4396_9ca0_6ecb5c99d915);

// UNSUPPORTED Rust 399:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_EVENT_DATA_UPDATED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2ed0f2a4_0087_41d3_87db_6773370b3c88);

// UNSUPPORTED Rust 400:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_EVENT_PARAMETER_COMMON_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x64346e30_8728_4b34_bdf6_4f52442c5c28);

// UNSUPPORTED Rust 401:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_EVENT_PARAMETER_EVENT_ID: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x64346e30_8728_4b34_bdf6_4f52442c5c28), pid: 2 };

// UNSUPPORTED Rust 402:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_EVENT_PARAMETER_STATE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x64346e30_8728_4b34_bdf6_4f52442c5c28), pid: 3 };

// UNSUPPORTED Rust 403:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_EVENT_PROPERTY_CHANGED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2358f099_84c9_4d3d_90df_c2421e2b2045);

// UNSUPPORTED Rust 404:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_EVENT_STATE_CHANGED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbfd96016_6bd7_4560_ad34_f2f6607e8f81);

// UNSUPPORTED Rust 405:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_PROPERTY_ACCURACY: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7f8383ec_d3ec_495c_a8cf_b8bbe85c2920), pid: 17 };

// UNSUPPORTED Rust 406:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_PROPERTY_CHANGE_SENSITIVITY: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7f8383ec_d3ec_495c_a8cf_b8bbe85c2920), pid: 14 };

// UNSUPPORTED Rust 407:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_PROPERTY_CLEAR_ASSISTANCE_DATA: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xe1e962f4_6e65_45f7_9c36_d487b7b1bd34), pid: 2 };

// UNSUPPORTED Rust 408:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_PROPERTY_COMMON_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7f8383ec_d3ec_495c_a8cf_b8bbe85c2920);

// UNSUPPORTED Rust 409:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_PROPERTY_CONNECTION_TYPE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7f8383ec_d3ec_495c_a8cf_b8bbe85c2920), pid: 11 };

// UNSUPPORTED Rust 410:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_PROPERTY_CURRENT_REPORT_INTERVAL: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7f8383ec_d3ec_495c_a8cf_b8bbe85c2920), pid: 13 };

// UNSUPPORTED Rust 411:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_PROPERTY_DESCRIPTION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7f8383ec_d3ec_495c_a8cf_b8bbe85c2920), pid: 10 };

// UNSUPPORTED Rust 412:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_PROPERTY_DEVICE_PATH: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7f8383ec_d3ec_495c_a8cf_b8bbe85c2920), pid: 15 };

// UNSUPPORTED Rust 413:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_PROPERTY_FRIENDLY_NAME: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7f8383ec_d3ec_495c_a8cf_b8bbe85c2920), pid: 9 };

// UNSUPPORTED Rust 414:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_PROPERTY_HID_USAGE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7f8383ec_d3ec_495c_a8cf_b8bbe85c2920), pid: 22 };

// UNSUPPORTED Rust 415:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_PROPERTY_LIGHT_RESPONSE_CURVE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7f8383ec_d3ec_495c_a8cf_b8bbe85c2920), pid: 16 };

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SENSOR_PROPERTY_LIST` (
    public var `AllocatedSizeInBytes`: UInt,
    public var `Count`: UInt,
    public var `List`: Array<`super`.`super`.`Foundation`.`PROPERTYKEY`>,
)
// UNSUPPORTED Rust 423:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SENSOR_PROPERTY_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SENSOR_PROPERTY_LIST_HEADER_SIZE`: UInt = 8u;
// UNSUPPORTED Rust 429:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_PROPERTY_LOCATION_DESIRED_ACCURACY: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7f8383ec_d3ec_495c_a8cf_b8bbe85c2920), pid: 19 };

// UNSUPPORTED Rust 430:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_PROPERTY_MANUFACTURER: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7f8383ec_d3ec_495c_a8cf_b8bbe85c2920), pid: 6 };

// UNSUPPORTED Rust 431:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_PROPERTY_MIN_REPORT_INTERVAL: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7f8383ec_d3ec_495c_a8cf_b8bbe85c2920), pid: 12 };

// UNSUPPORTED Rust 432:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_PROPERTY_MODEL: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7f8383ec_d3ec_495c_a8cf_b8bbe85c2920), pid: 7 };

// UNSUPPORTED Rust 433:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_PROPERTY_PERSISTENT_UNIQUE_ID: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7f8383ec_d3ec_495c_a8cf_b8bbe85c2920), pid: 5 };

// UNSUPPORTED Rust 434:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_PROPERTY_RADIO_STATE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7f8383ec_d3ec_495c_a8cf_b8bbe85c2920), pid: 23 };

// UNSUPPORTED Rust 435:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_PROPERTY_RADIO_STATE_PREVIOUS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7f8383ec_d3ec_495c_a8cf_b8bbe85c2920), pid: 24 };

// UNSUPPORTED Rust 436:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_PROPERTY_RANGE_MAXIMUM: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7f8383ec_d3ec_495c_a8cf_b8bbe85c2920), pid: 21 };

// UNSUPPORTED Rust 437:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_PROPERTY_RANGE_MINIMUM: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7f8383ec_d3ec_495c_a8cf_b8bbe85c2920), pid: 20 };

// UNSUPPORTED Rust 438:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_PROPERTY_RESOLUTION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7f8383ec_d3ec_495c_a8cf_b8bbe85c2920), pid: 18 };

// UNSUPPORTED Rust 439:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_PROPERTY_SERIAL_NUMBER: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7f8383ec_d3ec_495c_a8cf_b8bbe85c2920), pid: 8 };

// UNSUPPORTED Rust 440:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_PROPERTY_STATE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7f8383ec_d3ec_495c_a8cf_b8bbe85c2920), pid: 3 };

// UNSUPPORTED Rust 441:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_PROPERTY_TEST_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe1e962f4_6e65_45f7_9c36_d487b7b1bd34);

// UNSUPPORTED Rust 442:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_PROPERTY_TURN_ON_OFF_NMEA: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xe1e962f4_6e65_45f7_9c36_d487b7b1bd34), pid: 3 };

// UNSUPPORTED Rust 443:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: no per-file syntax rule for Const
// pub const SENSOR_PROPERTY_TYPE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7f8383ec_d3ec_495c_a8cf_b8bbe85c2920), pid: 2 };

public typealias `SENSOR_STATE` = Int;
public const val `SENSOR_STATE_ACCESS_DENIED`: `SensorState` = 4;
public const val `SENSOR_STATE_ERROR`: `SensorState` = 5;
public const val `SENSOR_STATE_INITIALIZING`: `SensorState` = 3;
public const val `SENSOR_STATE_MAX`: `SensorState` = 5;
public const val `SENSOR_STATE_MIN`: `SensorState` = 0;
public const val `SENSOR_STATE_NOT_AVAILABLE`: `SensorState` = 1;
public const val `SENSOR_STATE_NO_DATA`: `SensorState` = 2;
public const val `SENSOR_STATE_READY`: `SensorState` = 0;
// UNSUPPORTED Rust 453:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_ACCELEROMETER_1D: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc04d2387_7340_4cc2_991e_3b18cb8ef2f4);

// UNSUPPORTED Rust 454:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_ACCELEROMETER_2D: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb2c517a8_f6b5_4ba6_a423_5df560b4cc07);

// UNSUPPORTED Rust 455:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_ACCELEROMETER_3D: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc2fb0f5f_e2d2_4c78_bcd0_352a9582819d);

// UNSUPPORTED Rust 456:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_AGGREGATED_DEVICE_ORIENTATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcdb5d8f7_3cfd_41c8_8542_cce622cf5d6e);

// UNSUPPORTED Rust 457:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_AGGREGATED_QUADRANT_ORIENTATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9f81f1af_c4ab_4307_9904_c828bfb90829);

// UNSUPPORTED Rust 458:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_AGGREGATED_SIMPLE_DEVICE_ORIENTATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x86a19291_0482_402c_bf4c_addac52b1c39);

// UNSUPPORTED Rust 459:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_AMBIENT_LIGHT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x97f115c8_599a_4153_8894_d2d12899918a);

// UNSUPPORTED Rust 460:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_BARCODE_SCANNER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x990b3d8f_85bb_45ff_914d_998c04f372df);

// UNSUPPORTED Rust 461:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_BOOLEAN_SWITCH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9c7e371f_1041_460b_8d5c_71e4752e350c);

// UNSUPPORTED Rust 462:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_BOOLEAN_SWITCH_ARRAY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x545c8ba5_b143_4545_868f_ca7fd986b4f6);

// UNSUPPORTED Rust 463:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_CAPACITANCE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xca2ffb1c_2317_49c0_a0b4_b63ce63461a0);

// UNSUPPORTED Rust 464:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_COMPASS_1D: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa415f6c5_cb50_49d0_8e62_a8270bd7a26c);

// UNSUPPORTED Rust 465:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_COMPASS_2D: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x15655cc0_997a_4d30_84db_57caba3648bb);

// UNSUPPORTED Rust 466:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_COMPASS_3D: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x76b5ce0d_17dd_414d_93a1_e127f40bdf6e);

// UNSUPPORTED Rust 467:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_CURRENT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5adc9fce_15a0_4bbe_a1ad_2d38a9ae831c);

// UNSUPPORTED Rust 468:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_CUSTOM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe83af229_8640_4d18_a213_e22675ebb2c3);

// UNSUPPORTED Rust 469:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_DISTANCE_1D: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5f14ab2f_1407_4306_a93f_b1dbabe4f9c0);

// UNSUPPORTED Rust 470:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_DISTANCE_2D: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5cf9a46c_a9a2_4e55_b6a1_a04aafa95a92);

// UNSUPPORTED Rust 471:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_DISTANCE_3D: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa20cae31_0e25_4772_9fe5_96608a1354b2);

// UNSUPPORTED Rust 472:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_ELECTRICAL_POWER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x212f10f5_14ab_4376_9a43_a7794098c2fe);

// UNSUPPORTED Rust 473:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_ENVIRONMENTAL_ATMOSPHERIC_PRESSURE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0e903829_ff8a_4a93_97df_3dcbde402288);

// UNSUPPORTED Rust 474:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_ENVIRONMENTAL_HUMIDITY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5c72bf67_bd7e_4257_990b_98a3ba3b400a);

// UNSUPPORTED Rust 475:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_ENVIRONMENTAL_TEMPERATURE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x04fd0ec4_d5da_45fa_95a9_5db38ee19306);

// UNSUPPORTED Rust 476:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_ENVIRONMENTAL_WIND_DIRECTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9ef57a35_9306_434d_af09_37fa5a9c00bd);

// UNSUPPORTED Rust 477:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_ENVIRONMENTAL_WIND_SPEED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdd50607b_a45f_42cd_8efd_ec61761c4226);

// UNSUPPORTED Rust 478:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_FORCE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc2ab2b02_1a1c_4778_a81b_954a1788cc75);

// UNSUPPORTED Rust 479:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_FREQUENCY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8cd2cbb6_73e6_4640_a709_72ae8fb60d7f);

// UNSUPPORTED Rust 480:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_GYROMETER_1D: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfa088734_f552_4584_8324_edfaf649652c);

// UNSUPPORTED Rust 481:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_GYROMETER_2D: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x31ef4f83_919b_48bf_8de0_5d7a9d240556);

// UNSUPPORTED Rust 482:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_GYROMETER_3D: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x09485f5a_759e_42c2_bd4b_a349b75c8643);

// UNSUPPORTED Rust 483:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_HUMAN_PRESENCE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc138c12b_ad52_451c_9375_87f518ff10c6);

// UNSUPPORTED Rust 484:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_HUMAN_PROXIMITY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5220dae9_3179_4430_9f90_06266d2a34de);

// UNSUPPORTED Rust 485:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_INCLINOMETER_1D: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb96f98c5_7a75_4ba7_94e9_ac868c966dd8);

// UNSUPPORTED Rust 486:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_INCLINOMETER_2D: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xab140f6d_83eb_4264_b70b_b16a5b256a01);

// UNSUPPORTED Rust 487:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_INCLINOMETER_3D: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb84919fb_ea85_4976_8444_6f6f5c6d31db);

// UNSUPPORTED Rust 488:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_INDUCTANCE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdc1d933f_c435_4c7d_a2fe_607192a524d3);

// UNSUPPORTED Rust 489:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_LOCATION_BROADCAST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd26988cf_5162_4039_bb17_4c58b698e44a);

// UNSUPPORTED Rust 490:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_LOCATION_DEAD_RECKONING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1a37d538_f28b_42da_9fce_a9d0a2a6d829);

// UNSUPPORTED Rust 491:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_LOCATION_GPS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xed4ca589_327a_4ff9_a560_91da4b48275e);

// UNSUPPORTED Rust 492:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_LOCATION_LOOKUP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3b2eae4a_72ce_436d_96d2_3c5b8570e987);

// UNSUPPORTED Rust 493:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_LOCATION_OTHER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9b2d0566_0368_4f71_b88d_533f132031de);

// UNSUPPORTED Rust 494:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_LOCATION_STATIC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x095f8184_0fa9_4445_8e6e_b70f320b6b4c);

// UNSUPPORTED Rust 495:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_LOCATION_TRIANGULATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x691c341a_5406_4fe1_942f_2246cbeb39e0);

// UNSUPPORTED Rust 496:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_MOTION_DETECTOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5c7c1a12_30a5_43b9_a4b2_cf09ec5b7be8);

// UNSUPPORTED Rust 497:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_MULTIVALUE_SWITCH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb3ee4d76_37a4_4402_b25e_99c60a775fa1);

// UNSUPPORTED Rust 498:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_POTENTIOMETER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2b3681a9_cadc_45aa_a6ff_54957c8bb440);

// UNSUPPORTED Rust 499:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_PRESSURE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x26d31f34_6352_41cf_b793_ea0713d53d77);

// UNSUPPORTED Rust 500:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_RESISTANCE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9993d2c8_c157_4a52_a7b5_195c76037231);

// UNSUPPORTED Rust 501:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_RFID_SCANNER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x44328ef5_02dd_4e8d_ad5d_9249832b2eca);

// UNSUPPORTED Rust 502:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_SCALE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc06dd92c_7feb_438e_9bf6_82207fff5bb8);

// UNSUPPORTED Rust 503:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_SPEEDOMETER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6bd73c1f_0bb4_4310_81b2_dfc18a52bf94);

// UNSUPPORTED Rust 504:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_STRAIN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc6d1ec0e_6803_4361_ad3d_85bcc58c6d29);

// UNSUPPORTED Rust 505:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_TOUCH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x17db3018_06c4_4f7d_81af_9274b7599c27);

// UNSUPPORTED Rust 506:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_UNKNOWN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x10ba83e3_ef4f_41ed_9885_a87d6435a8e1);

// UNSUPPORTED Rust 507:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SENSOR_TYPE_VOLTAGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc5484637_4fb7_4953_98b8_a56d8aa1fb1e);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SENSOR_VALUE_PAIR` (
    public var `Key`: `super`.`super`.`Foundation`.`PROPERTYKEY`,
    public var `Value`: `super`.`super`.`System`.`Com`.`StructuredStorage`.`PROPVARIANT`,
)
// UNSUPPORTED Rust 515:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// impl Default for SENSOR_VALUE_PAIR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SIMPLE_DEVICE_ORIENTATION` = Int;
public const val `SIMPLE_DEVICE_ORIENTATION_NOT_ROTATED`: `SimpleDeviceOrientation` = 0;
public const val `SIMPLE_DEVICE_ORIENTATION_ROTATED_180`: `SimpleDeviceOrientation` = 2;
public const val `SIMPLE_DEVICE_ORIENTATION_ROTATED_270`: `SimpleDeviceOrientation` = 3;
public const val `SIMPLE_DEVICE_ORIENTATION_ROTATED_90`: `SimpleDeviceOrientation` = 1;
public const val `SIMPLE_DEVICE_ORIENTATION_ROTATED_FACE_DOWN`: `SimpleDeviceOrientation` = 5;
public const val `SIMPLE_DEVICE_ORIENTATION_ROTATED_FACE_UP`: `SimpleDeviceOrientation` = 4;
// UNSUPPORTED Rust 528:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Sensor: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe97ced00_523a_4133_bf6f_d3a2dae7f6ba);

// UNSUPPORTED Rust 529:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SensorCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x79c43adb_a429_469f_aa39_2f2b74b75937);

public typealias `SensorConnectionType` = Int;
public const val `SensorConnectionType_Attached`: `SENSOR_CONNECTION_TYPES` = 1;
public const val `SensorConnectionType_External`: `SENSOR_CONNECTION_TYPES` = 2;
public const val `SensorConnectionType_Integrated`: `SENSOR_CONNECTION_TYPES` = 0;
// UNSUPPORTED Rust 534:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SensorDataReport: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4ea9d6ef_694b_4218_8816_ccda8da74bba);

// UNSUPPORTED Rust 535:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SensorManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x77a1c827_fcd2_4689_8915_9d613cc5fa3e);

public typealias `SensorState` = Int;
public const val `SensorState_Active`: `SENSOR_STATE` = 2;
public const val `SensorState_Error`: `SENSOR_STATE` = 3;
public const val `SensorState_Idle`: `SENSOR_STATE` = 1;
public const val `SensorState_Initializing`: `SENSOR_STATE` = 0;
public typealias `SimpleDeviceOrientation` = Int;
public const val `SimpleDeviceOrientation_Facedown`: `SIMPLE_DEVICE_ORIENTATION` = 5;
public const val `SimpleDeviceOrientation_Faceup`: `SIMPLE_DEVICE_ORIENTATION` = 4;
public const val `SimpleDeviceOrientation_NotRotated`: `SIMPLE_DEVICE_ORIENTATION` = 0;
public const val `SimpleDeviceOrientation_Rotated180DegreesCounterclockwise`: `SIMPLE_DEVICE_ORIENTATION` = 2;
public const val `SimpleDeviceOrientation_Rotated270DegreesCounterclockwise`: `SIMPLE_DEVICE_ORIENTATION` = 3;
public const val `SimpleDeviceOrientation_Rotated90DegreesCounterclockwise`: `SIMPLE_DEVICE_ORIENTATION` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VEC3D` (
    public var `X`: Float,
    public var `Y`: Float,
    public var `Z`: Float,
)
