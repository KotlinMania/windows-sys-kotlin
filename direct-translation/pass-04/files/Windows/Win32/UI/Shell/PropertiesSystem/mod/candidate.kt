// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSCoerceToCanonicalValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `PSCoerceToCanonicalValue`(`key` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`PROPERTYKEY`>?, `ppropvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`System`.`Com`.`StructuredStorage`.`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSCreateAdapterFromPropertyStore; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PSCreateAdapterFromPropertyStore`(`pps` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSCreateDelayedMultiplexPropertyStore; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PSCreateDelayedMultiplexPropertyStore`(`flags` : `GETPROPERTYSTOREFLAGS`, `pdpsf` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `rgstoreids` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `cstores` : UInt, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSCreateMemoryPropertyStore; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PSCreateMemoryPropertyStore`(`riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSCreateMultiplexPropertyStore; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PSCreateMultiplexPropertyStore`(`prgpunkstores` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `cstores` : UInt, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSCreatePropertyChangeArray; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `PSCreatePropertyChangeArray`(`rgpropkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`PROPERTYKEY`>?, `rgflags` : /* Rust *const */ kotlinx.cinterop.CPointer<`PKA_FLAGS`>?, `rgpropvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`System`.`Com`.`StructuredStorage`.`PROPVARIANT`>?, `cchanges` : UInt, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSCreatePropertyStoreFromObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PSCreatePropertyStoreFromObject`(`punk` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `grfmode` : UInt, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSCreatePropertyStoreFromPropertySetStorage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSCreatePropertyStoreFromPropertySetStorage`(`ppss` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `grfmode` : UInt, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSCreateSimplePropertyChange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `PSCreateSimplePropertyChange`(`flags` : `PKA_FLAGS`, `key` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`PROPERTYKEY`>?, `propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`System`.`Com`.`StructuredStorage`.`PROPVARIANT`>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSEnumeratePropertyDescriptions; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PSEnumeratePropertyDescriptions`(`filteron` : `PROPDESC_ENUMFILTER`, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSFormatForDisplay; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `PSFormatForDisplay`(`propkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`PROPERTYKEY`>?, `propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`System`.`Com`.`StructuredStorage`.`PROPVARIANT`>?, `pdfflags` : `PROPDESC_FORMAT_FLAGS`, `pwsztext` : `windows_sys`.`core`.`PWSTR`, `cchtext` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSFormatForDisplayAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `PSFormatForDisplayAlloc`(`key` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`PROPERTYKEY`>?, `propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`System`.`Com`.`StructuredStorage`.`PROPVARIANT`>?, `pdff` : `PROPDESC_FORMAT_FLAGS`, `ppszdisplay` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSFormatPropertyValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PSFormatPropertyValue`(`pps` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pdff` : `PROPDESC_FORMAT_FLAGS`, `ppszdisplay` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSGetImageReferenceForValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `PSGetImageReferenceForValue`(`propkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`PROPERTYKEY`>?, `propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`System`.`Com`.`StructuredStorage`.`PROPVARIANT`>?, `ppszimageres` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSGetItemPropertyHandler; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PSGetItemPropertyHandler`(`punkitem` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `freadwrite` : `windows_sys`.`core`.`BOOL`, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSGetItemPropertyHandlerWithCreateObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PSGetItemPropertyHandlerWithCreateObject`(`punkitem` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `freadwrite` : `windows_sys`.`core`.`BOOL`, `punkcreateobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSGetNameFromPropertyKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PSGetNameFromPropertyKey`(`propkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`PROPERTYKEY`>?, `ppszcanonicalname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSGetNamedPropertyFromPropertyStorage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `PSGetNamedPropertyFromPropertyStorage`(`psps` : `PCUSERIALIZEDPROPSTORAGE`, `cb` : UInt, `pszname` : `windows_sys`.`core`.`PCWSTR`, `ppropvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`System`.`Com`.`StructuredStorage`.`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSGetPropertyDescription; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PSGetPropertyDescription`(`propkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`PROPERTYKEY`>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSGetPropertyDescriptionByName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PSGetPropertyDescriptionByName`(`pszcanonicalname` : `windows_sys`.`core`.`PCWSTR`, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSGetPropertyDescriptionListFromString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PSGetPropertyDescriptionListFromString`(`pszproplist` : `windows_sys`.`core`.`PCWSTR`, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSGetPropertyFromPropertyStorage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `PSGetPropertyFromPropertyStorage`(`psps` : `PCUSERIALIZEDPROPSTORAGE`, `cb` : UInt, `rpkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`PROPERTYKEY`>?, `ppropvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`System`.`Com`.`StructuredStorage`.`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSGetPropertyKeyFromName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PSGetPropertyKeyFromName`(`pszname` : `windows_sys`.`core`.`PCWSTR`, `ppropkey` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`PROPERTYKEY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSGetPropertySystem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PSGetPropertySystem`(`riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSGetPropertyValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `PSGetPropertyValue`(`pps` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppropvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`System`.`Com`.`StructuredStorage`.`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSLookupPropertyHandlerCLSID; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PSLookupPropertyHandlerCLSID`(`pszfilepath` : `windows_sys`.`core`.`PCWSTR`, `pclsid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_Delete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_Delete`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_ReadBOOL; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_ReadBOOL`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_ReadBSTR; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_ReadBSTR`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_ReadDWORD; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_ReadDWORD`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_ReadGUID; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_ReadGUID`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_ReadInt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_ReadInt`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_ReadLONG; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_ReadLONG`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_ReadPOINTL; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_ReadPOINTL`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`POINTL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_ReadPOINTS; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_ReadPOINTS`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`POINTS`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_ReadPropertyKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_ReadPropertyKey`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`PROPERTYKEY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_ReadRECTL; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_ReadRECTL`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`RECTL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_ReadSHORT; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_ReadSHORT`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_ReadStr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_ReadStr`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `value` : `windows_sys`.`core`.`PWSTR`, `charactercount` : Int) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_ReadStrAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_ReadStrAlloc`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_ReadStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_ReadStream`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_ReadType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
public external fun `PSPropertyBag_ReadType`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `var` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`System`.`Variant`.`VARIANT`>?, `type` : `super`.`super`.`super`.`System`.`Variant`.`VARENUM`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_ReadULONGLONG; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_ReadULONGLONG`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_ReadUnknown; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_ReadUnknown`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_WriteBOOL; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_WriteBOOL`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `value` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_WriteBSTR; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_WriteBSTR`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `value` : `windows_sys`.`core`.`BSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_WriteDWORD; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_WriteDWORD`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `value` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_WriteGUID; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_WriteGUID`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `value` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_WriteInt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_WriteInt`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `value` : Int) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_WriteLONG; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_WriteLONG`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `value` : Int) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_WritePOINTL; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_WritePOINTL`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `value` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`POINTL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_WritePOINTS; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_WritePOINTS`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `value` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`POINTS`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_WritePropertyKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_WritePropertyKey`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `value` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`PROPERTYKEY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_WriteRECTL; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_WriteRECTL`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `value` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`RECTL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_WriteSHORT; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_WriteSHORT`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `value` : Short) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_WriteStr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_WriteStr`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `value` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_WriteStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_WriteStream`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_WriteULONGLONG; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_WriteULONGLONG`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `value` : ULong) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyBag_WriteUnknown; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `PSPropertyBag_WriteUnknown`(`propbag` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propname` : `windows_sys`.`core`.`PCWSTR`, `punk` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSPropertyKeyFromString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PSPropertyKeyFromString`(`pszstring` : `windows_sys`.`core`.`PCWSTR`, `pkey` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`PROPERTYKEY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSRefreshPropertySchema; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PSRefreshPropertySchema`() : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSRegisterPropertySchema; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PSRegisterPropertySchema`(`pszpath` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSSetPropertyValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `PSSetPropertyValue`(`pps` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`System`.`Com`.`StructuredStorage`.`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSStringFromPropertyKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PSStringFromPropertyKey`(`pkey` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`PROPERTYKEY`>?, `psz` : `windows_sys`.`core`.`PWSTR`, `cch` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PSUnregisterPropertySchema; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PSUnregisterPropertySchema`(`pszpath` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=shell32.dll, ABI=system, export=PifMgr_CloseProperties; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PifMgr_CloseProperties`(`hprops` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `flopt` : UInt) : `super`.`super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=shell32.dll, ABI=system, export=PifMgr_GetProperties; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PifMgr_GetProperties`(`hprops` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `pszgroup` : `windows_sys`.`core`.`PCSTR`, `lpprops` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbprops` : Int, `flopt` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=shell32.dll, ABI=system, export=PifMgr_OpenProperties; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PifMgr_OpenProperties`(`pszapp` : `windows_sys`.`core`.`PCWSTR`, `pszpif` : `windows_sys`.`core`.`PCWSTR`, `hinf` : UInt, `flopt` : UInt) : `super`.`super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=shell32.dll, ABI=system, export=PifMgr_SetProperties; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PifMgr_SetProperties`(`hprops` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `pszgroup` : `windows_sys`.`core`.`PCSTR`, `lpprops` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbprops` : Int, `flopt` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=shell32.dll, ABI=system, export=SHAddDefaultPropertiesByExt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SHAddDefaultPropertiesByExt`(`pszext` : `windows_sys`.`core`.`PCWSTR`, `ppropstore` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=shell32.dll, ABI=system, export=SHGetPropertyStoreForWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SHGetPropertyStoreForWindow`(`hwnd` : `super`.`super`.`super`.`Foundation`.`HWND`, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=shell32.dll, ABI=system, export=SHGetPropertyStoreFromIDList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Shell_Common")]
public external fun `SHGetPropertyStoreFromIDList`(`pidl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Common`.`ITEMIDLIST`>?, `flags` : `GETPROPERTYSTOREFLAGS`, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=shell32.dll, ABI=system, export=SHGetPropertyStoreFromParsingName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `SHGetPropertyStoreFromParsingName`(`pszpath` : `windows_sys`.`core`.`PCWSTR`, `pbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `flags` : `GETPROPERTYSTOREFLAGS`, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=shell32.dll, ABI=system, export=SHPropStgCreate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `SHPropStgCreate`(`psstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fmtid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pclsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `grfflags` : UInt, `grfmode` : UInt, `dwdisposition` : UInt, `ppstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `pucodepage` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=shell32.dll, ABI=system, export=SHPropStgReadMultiple; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `SHPropStgReadMultiple`(`pps` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ucodepage` : UInt, `cpspec` : UInt, `rgpspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`System`.`Com`.`StructuredStorage`.`PROPSPEC`>?, `rgvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`System`.`Com`.`StructuredStorage`.`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=shell32.dll, ABI=system, export=SHPropStgWriteMultiple; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `SHPropStgWriteMultiple`(`pps` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pucodepage` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `cpspec` : UInt, `rgpspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`System`.`Com`.`StructuredStorage`.`PROPSPEC`>?, `rgvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`System`.`Com`.`StructuredStorage`.`PROPVARIANT`>?, `propidnamefirst` : UInt) : `windows_sys`.`core`.`HRESULT`
public const val `FPSPS_DEFAULT`: `_PERSIST_SPROPSTORE_FLAGS` = 0;
public const val `FPSPS_READONLY`: `_PERSIST_SPROPSTORE_FLAGS` = 1;
public const val `FPSPS_TREAT_NEW_VALUES_AS_DIRTY`: `_PERSIST_SPROPSTORE_FLAGS` = 2;
public typealias `GETPROPERTYSTOREFLAGS` = Int;
public const val `GPS_BESTEFFORT`: `GETPROPERTYSTOREFLAGS` = 64;
public const val `GPS_DEFAULT`: `GETPROPERTYSTOREFLAGS` = 0;
public const val `GPS_DELAYCREATION`: `GETPROPERTYSTOREFLAGS` = 32;
public const val `GPS_EXTRINSICPROPERTIES`: `GETPROPERTYSTOREFLAGS` = 512;
public const val `GPS_EXTRINSICPROPERTIESONLY`: `GETPROPERTYSTOREFLAGS` = 1024;
public const val `GPS_FASTPROPERTIESONLY`: `GETPROPERTYSTOREFLAGS` = 8;
public const val `GPS_HANDLERPROPERTIESONLY`: `GETPROPERTYSTOREFLAGS` = 1;
public const val `GPS_MASK_VALID`: `GETPROPERTYSTOREFLAGS` = 8191;
public const val `GPS_NO_OPLOCK`: `GETPROPERTYSTOREFLAGS` = 128;
public const val `GPS_OPENSLOWITEM`: `GETPROPERTYSTOREFLAGS` = 16;
public const val `GPS_PREFERQUERYPROPERTIES`: `GETPROPERTYSTOREFLAGS` = 256;
public const val `GPS_READWRITE`: `GETPROPERTYSTOREFLAGS` = 2;
public const val `GPS_TEMPORARY`: `GETPROPERTYSTOREFLAGS` = 4;
public const val `GPS_VOLATILEPROPERTIES`: `GETPROPERTYSTOREFLAGS` = 2048;
public const val `GPS_VOLATILEPROPERTIESONLY`: `GETPROPERTYSTOREFLAGS` = 4096;
// UNSUPPORTED Rust 145:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const InMemoryPropertyStore: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9a02e012_6303_4e1e_b9a1_630f802592c5);

// UNSUPPORTED Rust 146:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const InMemoryPropertyStoreMarshalByValue: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd4ca0e2d_6da7_4b75_a97c_5f306f0eaedc);

public typealias `PCUSERIALIZEDPROPSTORAGE` = Long;
public const val `PDAT_AVERAGE`: `PROPDESC_AGGREGATION_TYPE` = 3;
public const val `PDAT_DATERANGE`: `PROPDESC_AGGREGATION_TYPE` = 4;
public const val `PDAT_DEFAULT`: `PROPDESC_AGGREGATION_TYPE` = 0;
public const val `PDAT_FIRST`: `PROPDESC_AGGREGATION_TYPE` = 1;
public const val `PDAT_MAX`: `PROPDESC_AGGREGATION_TYPE` = 6;
public const val `PDAT_MIN`: `PROPDESC_AGGREGATION_TYPE` = 7;
public const val `PDAT_SUM`: `PROPDESC_AGGREGATION_TYPE` = 2;
public const val `PDAT_UNION`: `PROPDESC_AGGREGATION_TYPE` = 5;
public const val `PDCIT_INMEMORY`: `PROPDESC_COLUMNINDEX_TYPE` = 2;
public const val `PDCIT_NONE`: `PROPDESC_COLUMNINDEX_TYPE` = 0;
public const val `PDCIT_ONDEMAND`: `PROPDESC_COLUMNINDEX_TYPE` = 3;
public const val `PDCIT_ONDISK`: `PROPDESC_COLUMNINDEX_TYPE` = 1;
public const val `PDCIT_ONDISKALL`: `PROPDESC_COLUMNINDEX_TYPE` = 4;
public const val `PDCIT_ONDISKVECTOR`: `PROPDESC_COLUMNINDEX_TYPE` = 5;
public const val `PDCOT_BOOLEAN`: `PROPDESC_CONDITION_TYPE` = 4;
public const val `PDCOT_DATETIME`: `PROPDESC_CONDITION_TYPE` = 3;
public const val `PDCOT_NONE`: `PROPDESC_CONDITION_TYPE` = 0;
public const val `PDCOT_NUMBER`: `PROPDESC_CONDITION_TYPE` = 5;
public const val `PDCOT_SIZE`: `PROPDESC_CONDITION_TYPE` = 2;
public const val `PDCOT_STRING`: `PROPDESC_CONDITION_TYPE` = 1;
public const val `PDDT_BOOLEAN`: `PROPDESC_DISPLAYTYPE` = 2;
public const val `PDDT_DATETIME`: `PROPDESC_DISPLAYTYPE` = 3;
public const val `PDDT_ENUMERATED`: `PROPDESC_DISPLAYTYPE` = 4;
public const val `PDDT_NUMBER`: `PROPDESC_DISPLAYTYPE` = 1;
public const val `PDDT_STRING`: `PROPDESC_DISPLAYTYPE` = 0;
public const val `PDEF_ALL`: `PROPDESC_ENUMFILTER` = 0;
public const val `PDEF_COLUMN`: `PROPDESC_ENUMFILTER` = 6;
public const val `PDEF_INFULLTEXTQUERY`: `PROPDESC_ENUMFILTER` = 5;
public const val `PDEF_NONSYSTEM`: `PROPDESC_ENUMFILTER` = 2;
public const val `PDEF_QUERYABLE`: `PROPDESC_ENUMFILTER` = 4;
public const val `PDEF_SYSTEM`: `PROPDESC_ENUMFILTER` = 1;
public const val `PDEF_VIEWABLE`: `PROPDESC_ENUMFILTER` = 3;
public const val `PDFF_ALWAYSKB`: `PROPDESC_FORMAT_FLAGS` = 4;
public const val `PDFF_DEFAULT`: `PROPDESC_FORMAT_FLAGS` = 0;
public const val `PDFF_FILENAME`: `PROPDESC_FORMAT_FLAGS` = 2;
public const val `PDFF_HIDEDATE`: `PROPDESC_FORMAT_FLAGS` = 512;
public const val `PDFF_HIDETIME`: `PROPDESC_FORMAT_FLAGS` = 64;
public const val `PDFF_LONGDATE`: `PROPDESC_FORMAT_FLAGS` = 256;
public const val `PDFF_LONGTIME`: `PROPDESC_FORMAT_FLAGS` = 32;
public const val `PDFF_NOAUTOREADINGORDER`: `PROPDESC_FORMAT_FLAGS` = 8192;
public const val `PDFF_PREFIXNAME`: `PROPDESC_FORMAT_FLAGS` = 1;
public const val `PDFF_READONLY`: `PROPDESC_FORMAT_FLAGS` = 4096;
public const val `PDFF_RELATIVEDATE`: `PROPDESC_FORMAT_FLAGS` = 1024;
public const val `PDFF_RESERVED_RIGHTTOLEFT`: `PROPDESC_FORMAT_FLAGS` = 8;
public const val `PDFF_SHORTDATE`: `PROPDESC_FORMAT_FLAGS` = 128;
public const val `PDFF_SHORTTIME`: `PROPDESC_FORMAT_FLAGS` = 16;
public const val `PDFF_USEEDITINVITATION`: `PROPDESC_FORMAT_FLAGS` = 2048;
public const val `PDGR_ALPHANUMERIC`: `PROPDESC_GROUPING_RANGE` = 1;
public const val `PDGR_DATE`: `PROPDESC_GROUPING_RANGE` = 4;
public const val `PDGR_DISCRETE`: `PROPDESC_GROUPING_RANGE` = 0;
public const val `PDGR_DYNAMIC`: `PROPDESC_GROUPING_RANGE` = 3;
public const val `PDGR_ENUMERATED`: `PROPDESC_GROUPING_RANGE` = 6;
public const val `PDGR_PERCENT`: `PROPDESC_GROUPING_RANGE` = 5;
public const val `PDGR_SIZE`: `PROPDESC_GROUPING_RANGE` = 2;
public typealias `PDOPSTATUS` = Int;
public const val `PDOPS_CANCELLED`: `PDOPSTATUS` = 3;
public const val `PDOPS_ERRORS`: `PDOPSTATUS` = 5;
public const val `PDOPS_PAUSED`: `PDOPSTATUS` = 2;
public const val `PDOPS_RUNNING`: `PDOPSTATUS` = 1;
public const val `PDOPS_STOPPED`: `PDOPSTATUS` = 4;
public const val `PDRDT_COUNT`: `PROPDESC_RELATIVEDESCRIPTION_TYPE` = 3;
public const val `PDRDT_DATE`: `PROPDESC_RELATIVEDESCRIPTION_TYPE` = 1;
public const val `PDRDT_DURATION`: `PROPDESC_RELATIVEDESCRIPTION_TYPE` = 6;
public const val `PDRDT_GENERAL`: `PROPDESC_RELATIVEDESCRIPTION_TYPE` = 0;
public const val `PDRDT_LENGTH`: `PROPDESC_RELATIVEDESCRIPTION_TYPE` = 5;
public const val `PDRDT_PRIORITY`: `PROPDESC_RELATIVEDESCRIPTION_TYPE` = 10;
public const val `PDRDT_RATE`: `PROPDESC_RELATIVEDESCRIPTION_TYPE` = 8;
public const val `PDRDT_RATING`: `PROPDESC_RELATIVEDESCRIPTION_TYPE` = 9;
public const val `PDRDT_REVISION`: `PROPDESC_RELATIVEDESCRIPTION_TYPE` = 4;
public const val `PDRDT_SIZE`: `PROPDESC_RELATIVEDESCRIPTION_TYPE` = 2;
public const val `PDRDT_SPEED`: `PROPDESC_RELATIVEDESCRIPTION_TYPE` = 7;
public const val `PDSD_A_Z`: `PROPDESC_SORTDESCRIPTION` = 1;
public const val `PDSD_GENERAL`: `PROPDESC_SORTDESCRIPTION` = 0;
public const val `PDSD_LOWEST_HIGHEST`: `PROPDESC_SORTDESCRIPTION` = 2;
public const val `PDSD_OLDEST_NEWEST`: `PROPDESC_SORTDESCRIPTION` = 4;
public const val `PDSD_SMALLEST_BIGGEST`: `PROPDESC_SORTDESCRIPTION` = 3;
public const val `PDSIF_ALWAYSINCLUDE`: `PROPDESC_SEARCHINFO_FLAGS` = 8;
public const val `PDSIF_DEFAULT`: `PROPDESC_SEARCHINFO_FLAGS` = 0;
public const val `PDSIF_ININVERTEDINDEX`: `PROPDESC_SEARCHINFO_FLAGS` = 1;
public const val `PDSIF_ISCOLUMN`: `PROPDESC_SEARCHINFO_FLAGS` = 2;
public const val `PDSIF_ISCOLUMNSPARSE`: `PROPDESC_SEARCHINFO_FLAGS` = 4;
public const val `PDSIF_USEFORTYPEAHEAD`: `PROPDESC_SEARCHINFO_FLAGS` = 16;
public const val `PDTF_ALWAYSINSUPPLEMENTALSTORE`: `PROPDESC_TYPE_FLAGS` = 4096u;
public const val `PDTF_CANBEPURGED`: `PROPDESC_TYPE_FLAGS` = 512u;
public const val `PDTF_CANGROUPBY`: `PROPDESC_TYPE_FLAGS` = 8u;
public const val `PDTF_CANSTACKBY`: `PROPDESC_TYPE_FLAGS` = 16u;
public const val `PDTF_DEFAULT`: `PROPDESC_TYPE_FLAGS` = 0u;
public const val `PDTF_DONTCOERCEEMPTYSTRINGS`: `PROPDESC_TYPE_FLAGS` = 2048u;
public const val `PDTF_INCLUDEINFULLTEXTQUERY`: `PROPDESC_TYPE_FLAGS` = 64u;
public const val `PDTF_ISGROUP`: `PROPDESC_TYPE_FLAGS` = 4u;
public const val `PDTF_ISINNATE`: `PROPDESC_TYPE_FLAGS` = 2u;
public const val `PDTF_ISQUERYABLE`: `PROPDESC_TYPE_FLAGS` = 256u;
public const val `PDTF_ISSYSTEMPROPERTY`: `PROPDESC_TYPE_FLAGS` = 2147483648u;
public const val `PDTF_ISTREEPROPERTY`: `PROPDESC_TYPE_FLAGS` = 32u;
public const val `PDTF_ISVIEWABLE`: `PROPDESC_TYPE_FLAGS` = 128u;
public const val `PDTF_MASK_ALL`: `PROPDESC_TYPE_FLAGS` = 2147491839u;
public const val `PDTF_MULTIPLEVALUES`: `PROPDESC_TYPE_FLAGS` = 1u;
public const val `PDTF_SEARCHRAWVALUE`: `PROPDESC_TYPE_FLAGS` = 1024u;
public const val `PDVF_BEGINNEWGROUP`: `PROPDESC_VIEW_FLAGS` = 4;
public const val `PDVF_CANWRAP`: `PROPDESC_VIEW_FLAGS` = 4096;
public const val `PDVF_CENTERALIGN`: `PROPDESC_VIEW_FLAGS` = 1;
public const val `PDVF_DEFAULT`: `PROPDESC_VIEW_FLAGS` = 0;
public const val `PDVF_FILLAREA`: `PROPDESC_VIEW_FLAGS` = 8;
public const val `PDVF_HIDDEN`: `PROPDESC_VIEW_FLAGS` = 2048;
public const val `PDVF_HIDELABEL`: `PROPDESC_VIEW_FLAGS` = 512;
public const val `PDVF_MASK_ALL`: `PROPDESC_VIEW_FLAGS` = 7167;
public const val `PDVF_RIGHTALIGN`: `PROPDESC_VIEW_FLAGS` = 2;
public const val `PDVF_SHOWBYDEFAULT`: `PROPDESC_VIEW_FLAGS` = 64;
public const val `PDVF_SHOWINPRIMARYLIST`: `PROPDESC_VIEW_FLAGS` = 128;
public const val `PDVF_SHOWINSECONDARYLIST`: `PROPDESC_VIEW_FLAGS` = 256;
public const val `PDVF_SHOWONLYIFPRESENT`: `PROPDESC_VIEW_FLAGS` = 32;
public const val `PDVF_SORTDESCENDING`: `PROPDESC_VIEW_FLAGS` = 16;
public const val `PET_DEFAULTVALUE`: `PROPENUMTYPE` = 2;
public const val `PET_DISCRETEVALUE`: `PROPENUMTYPE` = 0;
public const val `PET_ENDRANGE`: `PROPENUMTYPE` = 3;
public const val `PET_RANGEDVALUE`: `PROPENUMTYPE` = 1;
public const val `PKA_APPEND`: `PKA_FLAGS` = 1;
public const val `PKA_DELETE`: `PKA_FLAGS` = 2;
public typealias `PKA_FLAGS` = Int;
public const val `PKA_SET`: `PKA_FLAGS` = 0;
public const val `PKEY_PIDSTR_MAX`: UInt = 10u;
public typealias `PLACEHOLDER_STATES` = Int;
public typealias `PROPDESC_AGGREGATION_TYPE` = Int;
public typealias `PROPDESC_COLUMNINDEX_TYPE` = Int;
public typealias `PROPDESC_CONDITION_TYPE` = Int;
public typealias `PROPDESC_DISPLAYTYPE` = Int;
public typealias `PROPDESC_ENUMFILTER` = Int;
public typealias `PROPDESC_FORMAT_FLAGS` = Int;
public typealias `PROPDESC_GROUPING_RANGE` = Int;
public typealias `PROPDESC_RELATIVEDESCRIPTION_TYPE` = Int;
public typealias `PROPDESC_SEARCHINFO_FLAGS` = Int;
public typealias `PROPDESC_SORTDESCRIPTION` = Int;
public typealias `PROPDESC_TYPE_FLAGS` = UInt;
public typealias `PROPDESC_VIEW_FLAGS` = Int;
public typealias `PROPENUMTYPE` = Int;
public typealias `PROPERTYUI_FLAGS` = Int;
public typealias `PROPERTYUI_FORMAT_FLAGS` = Int;
public typealias `PROPERTYUI_NAME_FLAGS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 30 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 80 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROPPRG` (
    public var `flPrg`: UShort,
    public var `flPrgInit`: UShort,
    public var `achTitle`: ByteArray,
    public var `achCmdLine`: ByteArray,
    public var `achWorkDir`: ByteArray,
    public var `wHotKey`: UShort,
    public var `achIconFile`: ByteArray,
    public var `wIconIndex`: UShort,
    public var `dwEnhModeFlags`: UInt,
    public var `dwRealModeFlags`: UInt,
    public var `achOtherFile`: ByteArray,
    public var `achPIFFile`: ByteArray,
)
// UNSUPPORTED Rust 302:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROPPRG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PSC_DIRTY`: `PSC_STATE` = 2;
public const val `PSC_NORMAL`: `PSC_STATE` = 0;
public const val `PSC_NOTINSOURCE`: `PSC_STATE` = 1;
public const val `PSC_READONLY`: `PSC_STATE` = 3;
public typealias `PSC_STATE` = Int;
public const val `PS_ALL`: `PLACEHOLDER_STATES` = 15;
public const val `PS_CLOUDFILE_PLACEHOLDER`: `PLACEHOLDER_STATES` = 8;
public const val `PS_CREATE_FILE_ACCESSIBLE`: `PLACEHOLDER_STATES` = 4;
public const val `PS_DEFAULT`: `PLACEHOLDER_STATES` = 7;
public const val `PS_FULL_PRIMARY_STREAM_AVAILABLE`: `PLACEHOLDER_STATES` = 2;
public const val `PS_MARKED_FOR_OFFLINE_AVAILABILITY`: `PLACEHOLDER_STATES` = 1;
public const val `PS_NONE`: `PLACEHOLDER_STATES` = 0;
public const val `PUIFFDF_DEFAULT`: `PROPERTYUI_FORMAT_FLAGS` = 0;
public const val `PUIFFDF_FRIENDLYDATE`: `PROPERTYUI_FORMAT_FLAGS` = 8;
public const val `PUIFFDF_NOTIME`: `PROPERTYUI_FORMAT_FLAGS` = 4;
public const val `PUIFFDF_RIGHTTOLEFT`: `PROPERTYUI_FORMAT_FLAGS` = 1;
public const val `PUIFFDF_SHORTFORMAT`: `PROPERTYUI_FORMAT_FLAGS` = 2;
public const val `PUIFNF_DEFAULT`: `PROPERTYUI_NAME_FLAGS` = 0;
public const val `PUIFNF_MNEMONIC`: `PROPERTYUI_NAME_FLAGS` = 1;
public const val `PUIF_DEFAULT`: `PROPERTYUI_FLAGS` = 0;
public const val `PUIF_NOLABELININFOTIP`: `PROPERTYUI_FLAGS` = 2;
public const val `PUIF_RIGHTALIGN`: `PROPERTYUI_FLAGS` = 1;
// UNSUPPORTED Rust 329:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PropertySystem: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb8967f85_58ae_4f46_9fb2_5d7904798f4b);

public typealias `SERIALIZEDPROPSTORAGE` = Long;
public const val `SESF_ALL_FLAGS`: `SYNC_ENGINE_STATE_FLAGS` = 511;
public const val `SESF_AUTHENTICATION_ERROR`: `SYNC_ENGINE_STATE_FLAGS` = 4;
public const val `SESF_NONE`: `SYNC_ENGINE_STATE_FLAGS` = 0;
public const val `SESF_PAUSED_DUE_TO_CLIENT_POLICY`: `SYNC_ENGINE_STATE_FLAGS` = 32;
public const val `SESF_PAUSED_DUE_TO_DISK_SPACE_FULL`: `SYNC_ENGINE_STATE_FLAGS` = 16;
public const val `SESF_PAUSED_DUE_TO_METERED_NETWORK`: `SYNC_ENGINE_STATE_FLAGS` = 8;
public const val `SESF_PAUSED_DUE_TO_SERVICE_POLICY`: `SYNC_ENGINE_STATE_FLAGS` = 64;
public const val `SESF_PAUSED_DUE_TO_USER_REQUEST`: `SYNC_ENGINE_STATE_FLAGS` = 256;
public const val `SESF_SERVICE_QUOTA_EXCEEDED_LIMIT`: `SYNC_ENGINE_STATE_FLAGS` = 2;
public const val `SESF_SERVICE_QUOTA_NEARING_LIMIT`: `SYNC_ENGINE_STATE_FLAGS` = 1;
public const val `SESF_SERVICE_UNAVAILABLE`: `SYNC_ENGINE_STATE_FLAGS` = 128;
public const val `STS_EXCLUDED`: `SYNC_TRANSFER_STATUS` = 256;
public const val `STS_FETCHING_METADATA`: `SYNC_TRANSFER_STATUS` = 32;
public const val `STS_HASERROR`: `SYNC_TRANSFER_STATUS` = 16;
public const val `STS_HASWARNING`: `SYNC_TRANSFER_STATUS` = 128;
public const val `STS_INCOMPLETE`: `SYNC_TRANSFER_STATUS` = 512;
public const val `STS_NEEDSDOWNLOAD`: `SYNC_TRANSFER_STATUS` = 2;
public const val `STS_NEEDSUPLOAD`: `SYNC_TRANSFER_STATUS` = 1;
public const val `STS_NONE`: `SYNC_TRANSFER_STATUS` = 0;
public const val `STS_PAUSED`: `SYNC_TRANSFER_STATUS` = 8;
public const val `STS_PLACEHOLDER_IFEMPTY`: `SYNC_TRANSFER_STATUS` = 1024;
public const val `STS_TRANSFERRING`: `SYNC_TRANSFER_STATUS` = 4;
public const val `STS_USER_REQUESTED_REFRESH`: `SYNC_TRANSFER_STATUS` = 64;
public typealias `SYNC_ENGINE_STATE_FLAGS` = Int;
public typealias `SYNC_TRANSFER_STATUS` = Int;
public typealias `_PERSIST_SPROPSTORE_FLAGS` = Int;
