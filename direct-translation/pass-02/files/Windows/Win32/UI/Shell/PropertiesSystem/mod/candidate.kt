// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// windows_link::link!("propsys.dll" "system" fn PSCoerceToCanonicalValue(key : *const super::super::super::Foundation:: PROPERTYKEY, ppropvar : *mut super::super::super::System::Com::StructuredStorage:: PROPVARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("propsys.dll" "system" fn PSCreateAdapterFromPropertyStore(pps : * mut core::ffi::c_void, riid : *const windows_sys::core::GUID, ppv : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("propsys.dll" "system" fn PSCreateDelayedMultiplexPropertyStore(flags : GETPROPERTYSTOREFLAGS, pdpsf : * mut core::ffi::c_void, rgstoreids : *const u32, cstores : u32, riid : *const windows_sys::core::GUID, ppv : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("propsys.dll" "system" fn PSCreateMemoryPropertyStore(riid : *const windows_sys::core::GUID, ppv : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("propsys.dll" "system" fn PSCreateMultiplexPropertyStore(prgpunkstores : *const * mut core::ffi::c_void, cstores : u32, riid : *const windows_sys::core::GUID, ppv : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// windows_link::link!("propsys.dll" "system" fn PSCreatePropertyChangeArray(rgpropkey : *const super::super::super::Foundation:: PROPERTYKEY, rgflags : *const PKA_FLAGS, rgpropvar : *const super::super::super::System::Com::StructuredStorage:: PROPVARIANT, cchanges : u32, riid : *const windows_sys::core::GUID, ppv : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("propsys.dll" "system" fn PSCreatePropertyStoreFromObject(punk : * mut core::ffi::c_void, grfmode : u32, riid : *const windows_sys::core::GUID, ppv : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSCreatePropertyStoreFromPropertySetStorage(ppss : * mut core::ffi::c_void, grfmode : u32, riid : *const windows_sys::core::GUID, ppv : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// windows_link::link!("propsys.dll" "system" fn PSCreateSimplePropertyChange(flags : PKA_FLAGS, key : *const super::super::super::Foundation:: PROPERTYKEY, propvar : *const super::super::super::System::Com::StructuredStorage:: PROPVARIANT, riid : *const windows_sys::core::GUID, ppv : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("propsys.dll" "system" fn PSEnumeratePropertyDescriptions(filteron : PROPDESC_ENUMFILTER, riid : *const windows_sys::core::GUID, ppv : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// windows_link::link!("propsys.dll" "system" fn PSFormatForDisplay(propkey : *const super::super::super::Foundation:: PROPERTYKEY, propvar : *const super::super::super::System::Com::StructuredStorage:: PROPVARIANT, pdfflags : PROPDESC_FORMAT_FLAGS, pwsztext : windows_sys::core::PWSTR, cchtext : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// windows_link::link!("propsys.dll" "system" fn PSFormatForDisplayAlloc(key : *const super::super::super::Foundation:: PROPERTYKEY, propvar : *const super::super::super::System::Com::StructuredStorage:: PROPVARIANT, pdff : PROPDESC_FORMAT_FLAGS, ppszdisplay : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("propsys.dll" "system" fn PSFormatPropertyValue(pps : * mut core::ffi::c_void, ppd : * mut core::ffi::c_void, pdff : PROPDESC_FORMAT_FLAGS, ppszdisplay : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// windows_link::link!("propsys.dll" "system" fn PSGetImageReferenceForValue(propkey : *const super::super::super::Foundation:: PROPERTYKEY, propvar : *const super::super::super::System::Com::StructuredStorage:: PROPVARIANT, ppszimageres : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("propsys.dll" "system" fn PSGetItemPropertyHandler(punkitem : * mut core::ffi::c_void, freadwrite : windows_sys::core::BOOL, riid : *const windows_sys::core::GUID, ppv : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("propsys.dll" "system" fn PSGetItemPropertyHandlerWithCreateObject(punkitem : * mut core::ffi::c_void, freadwrite : windows_sys::core::BOOL, punkcreateobject : * mut core::ffi::c_void, riid : *const windows_sys::core::GUID, ppv : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("propsys.dll" "system" fn PSGetNameFromPropertyKey(propkey : *const super::super::super::Foundation:: PROPERTYKEY, ppszcanonicalname : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// windows_link::link!("propsys.dll" "system" fn PSGetNamedPropertyFromPropertyStorage(psps : PCUSERIALIZEDPROPSTORAGE, cb : u32, pszname : windows_sys::core::PCWSTR, ppropvar : *mut super::super::super::System::Com::StructuredStorage:: PROPVARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("propsys.dll" "system" fn PSGetPropertyDescription(propkey : *const super::super::super::Foundation:: PROPERTYKEY, riid : *const windows_sys::core::GUID, ppv : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("propsys.dll" "system" fn PSGetPropertyDescriptionByName(pszcanonicalname : windows_sys::core::PCWSTR, riid : *const windows_sys::core::GUID, ppv : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("propsys.dll" "system" fn PSGetPropertyDescriptionListFromString(pszproplist : windows_sys::core::PCWSTR, riid : *const windows_sys::core::GUID, ppv : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// windows_link::link!("propsys.dll" "system" fn PSGetPropertyFromPropertyStorage(psps : PCUSERIALIZEDPROPSTORAGE, cb : u32, rpkey : *const super::super::super::Foundation:: PROPERTYKEY, ppropvar : *mut super::super::super::System::Com::StructuredStorage:: PROPVARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("propsys.dll" "system" fn PSGetPropertyKeyFromName(pszname : windows_sys::core::PCWSTR, ppropkey : *mut super::super::super::Foundation:: PROPERTYKEY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("propsys.dll" "system" fn PSGetPropertySystem(riid : *const windows_sys::core::GUID, ppv : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// windows_link::link!("propsys.dll" "system" fn PSGetPropertyValue(pps : * mut core::ffi::c_void, ppd : * mut core::ffi::c_void, ppropvar : *mut super::super::super::System::Com::StructuredStorage:: PROPVARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("propsys.dll" "system" fn PSLookupPropertyHandlerCLSID(pszfilepath : windows_sys::core::PCWSTR, pclsid : *mut windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_Delete(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_ReadBOOL(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, value : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_ReadBSTR(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, value : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_ReadDWORD(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, value : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_ReadGUID(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, value : *mut windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_ReadInt(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, value : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_ReadLONG(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, value : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_ReadPOINTL(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, value : *mut super::super::super::Foundation:: POINTL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_ReadPOINTS(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, value : *mut super::super::super::Foundation:: POINTS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_ReadPropertyKey(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, value : *mut super::super::super::Foundation:: PROPERTYKEY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_ReadRECTL(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, value : *mut super::super::super::Foundation:: RECTL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_ReadSHORT(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, value : *mut i16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_ReadStr(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, value : windows_sys::core::PWSTR, charactercount : i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_ReadStrAlloc(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, value : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_ReadStream(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, value : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_ReadType(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, var : *mut super::super::super::System::Variant:: VARIANT, r#type : super::super::super::System::Variant:: VARENUM) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_ReadULONGLONG(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, value : *mut u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_ReadUnknown(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, riid : *const windows_sys::core::GUID, ppv : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_WriteBOOL(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, value : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_WriteBSTR(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, value : windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_WriteDWORD(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, value : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_WriteGUID(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, value : *const windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_WriteInt(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, value : i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_WriteLONG(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, value : i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_WritePOINTL(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, value : *const super::super::super::Foundation:: POINTL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_WritePOINTS(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, value : *const super::super::super::Foundation:: POINTS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_WritePropertyKey(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, value : *const super::super::super::Foundation:: PROPERTYKEY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_WriteRECTL(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, value : *const super::super::super::Foundation:: RECTL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_WriteSHORT(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, value : i16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_WriteStr(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, value : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_WriteStream(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, value : * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_WriteULONGLONG(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, value : u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("propsys.dll" "system" fn PSPropertyBag_WriteUnknown(propbag : * mut core::ffi::c_void, propname : windows_sys::core::PCWSTR, punk : * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// windows_link::link!("propsys.dll" "system" fn PSPropertyKeyFromString(pszstring : windows_sys::core::PCWSTR, pkey : *mut super::super::super::Foundation:: PROPERTYKEY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// windows_link::link!("propsys.dll" "system" fn PSRefreshPropertySchema() -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// windows_link::link!("propsys.dll" "system" fn PSRegisterPropertySchema(pszpath : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// windows_link::link!("propsys.dll" "system" fn PSSetPropertyValue(pps : * mut core::ffi::c_void, ppd : * mut core::ffi::c_void, propvar : *const super::super::super::System::Com::StructuredStorage:: PROPVARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// windows_link::link!("propsys.dll" "system" fn PSStringFromPropertyKey(pkey : *const super::super::super::Foundation:: PROPERTYKEY, psz : windows_sys::core::PWSTR, cch : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("propsys.dll" "system" fn PSUnregisterPropertySchema(pszpath : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("shell32.dll" "system" fn PifMgr_CloseProperties(hprops : super::super::super::Foundation:: HANDLE, flopt : u32) -> super::super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// windows_link::link!("shell32.dll" "system" fn PifMgr_GetProperties(hprops : super::super::super::Foundation:: HANDLE, pszgroup : windows_sys::core::PCSTR, lpprops : *mut core::ffi::c_void, cbprops : i32, flopt : u32) -> i32);

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// windows_link::link!("shell32.dll" "system" fn PifMgr_OpenProperties(pszapp : windows_sys::core::PCWSTR, pszpif : windows_sys::core::PCWSTR, hinf : u32, flopt : u32) -> super::super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// windows_link::link!("shell32.dll" "system" fn PifMgr_SetProperties(hprops : super::super::super::Foundation:: HANDLE, pszgroup : windows_sys::core::PCSTR, lpprops : *const core::ffi::c_void, cbprops : i32, flopt : u32) -> i32);

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// windows_link::link!("shell32.dll" "system" fn SHAddDefaultPropertiesByExt(pszext : windows_sys::core::PCWSTR, ppropstore : * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// windows_link::link!("shell32.dll" "system" fn SHGetPropertyStoreForWindow(hwnd : super::super::super::Foundation:: HWND, riid : *const windows_sys::core::GUID, ppv : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_Shell_Common")]
// windows_link::link!("shell32.dll" "system" fn SHGetPropertyStoreFromIDList(pidl : *const super::Common:: ITEMIDLIST, flags : GETPROPERTYSTOREFLAGS, riid : *const windows_sys::core::GUID, ppv : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 118:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("shell32.dll" "system" fn SHGetPropertyStoreFromParsingName(pszpath : windows_sys::core::PCWSTR, pbc : * mut core::ffi::c_void, flags : GETPROPERTYSTOREFLAGS, riid : *const windows_sys::core::GUID, ppv : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 120:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("shell32.dll" "system" fn SHPropStgCreate(psstg : * mut core::ffi::c_void, fmtid : *const windows_sys::core::GUID, pclsid : *const windows_sys::core::GUID, grfflags : u32, grfmode : u32, dwdisposition : u32, ppstg : *mut * mut core::ffi::c_void, pucodepage : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 122:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// windows_link::link!("shell32.dll" "system" fn SHPropStgReadMultiple(pps : * mut core::ffi::c_void, ucodepage : u32, cpspec : u32, rgpspec : *const super::super::super::System::Com::StructuredStorage:: PROPSPEC, rgvar : *mut super::super::super::System::Com::StructuredStorage:: PROPVARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 124:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// windows_link::link!("shell32.dll" "system" fn SHPropStgWriteMultiple(pps : * mut core::ffi::c_void, pucodepage : *mut u32, cpspec : u32, rgpspec : *const super::super::super::System::Com::StructuredStorage:: PROPSPEC, rgvar : *mut super::super::super::System::Com::StructuredStorage:: PROPVARIANT, propidnamefirst : u32) -> windows_sys::core::HRESULT);

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
// UNSUPPORTED Rust 145:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const InMemoryPropertyStore: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9a02e012_6303_4e1e_b9a1_630f802592c5);

// UNSUPPORTED Rust 146:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
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
// UNSUPPORTED Rust 286:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct PROPPRG {
//     pub flPrg: u16,
//     pub flPrgInit: u16,
//     pub achTitle: [i8; 30],
//     pub achCmdLine: [i8; 128],
//     pub achWorkDir: [i8; 64],
//     pub wHotKey: u16,
//     pub achIconFile: [i8; 80],
//     pub wIconIndex: u16,
//     pub dwEnhModeFlags: u32,
//     pub dwRealModeFlags: u32,
//     pub achOtherFile: [i8; 80],
//     pub achPIFFile: [i8; 260],
// }

// UNSUPPORTED Rust 302:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 329:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
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
