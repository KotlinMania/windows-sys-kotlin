// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=AssociateColorProfileWithDeviceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AssociateColorProfileWithDeviceA`(`pmachinename` : `windows_sys`.`core`.`PCSTR`, `pprofilename` : `windows_sys`.`core`.`PCSTR`, `pdevicename` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=AssociateColorProfileWithDeviceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AssociateColorProfileWithDeviceW`(`pmachinename` : `windows_sys`.`core`.`PCWSTR`, `pprofilename` : `windows_sys`.`core`.`PCWSTR`, `pdevicename` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=icm32.dll, ABI=system, export=CMCheckColors; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CMCheckColors`(`hcmtransform` : Long, `lpainputcolors` : /* Rust *const */ kotlinx.cinterop.CPointer<`COLOR`>?, `ncolors` : UInt, `ctinput` : `COLORTYPE`, `lparesult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=icm32.dll, ABI=system, export=CMCheckColorsInGamut; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `CMCheckColorsInGamut`(`hcmtransform` : Long, `lpargbtriple` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`RGBTRIPLE`>?, `lparesult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `ncount` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=icm32.dll, ABI=system, export=CMCheckRGBs; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CMCheckRGBs`(`hcmtransform` : Long, `lpsrcbits` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bminput` : `BMFORMAT`, `dwwidth` : UInt, `dwheight` : UInt, `dwstride` : UInt, `lparesult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pfncallback` : `LPBMCALLBACKFN`, `ulcallbackdata` : `super`.`super`.`Foundation`.`LPARAM`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=icm32.dll, ABI=system, export=CMConvertColorNameToIndex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CMConvertColorNameToIndex`(`hprofile` : Long, `pacolorname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `paindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwcount` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=icm32.dll, ABI=system, export=CMConvertIndexToColorName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CMConvertIndexToColorName`(`hprofile` : Long, `paindex` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pacolorname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `dwcount` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=icm32.dll, ABI=system, export=CMCreateDeviceLinkProfile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CMCreateDeviceLinkProfile`(`pahprofiles` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `nprofiles` : UInt, `padwintents` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `nintents` : UInt, `dwflags` : UInt, `lpprofiledata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=icm32.dll, ABI=system, export=CMCreateMultiProfileTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CMCreateMultiProfileTransform`(`pahprofiles` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `nprofiles` : UInt, `padwintents` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `nintents` : UInt, `dwflags` : UInt) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=icm32.dll, ABI=system, export=CMCreateProfile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `CMCreateProfile`(`lpcolorspace` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LOGCOLORSPACEA`>?, `lpprofiledata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=icm32.dll, ABI=system, export=CMCreateProfileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `CMCreateProfileW`(`lpcolorspace` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LOGCOLORSPACEW`>?, `lpprofiledata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=icm32.dll, ABI=system, export=CMCreateTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `CMCreateTransform`(`lpcolorspace` : /* Rust *const */ kotlinx.cinterop.CPointer<`LOGCOLORSPACEA`>?, `lpdevcharacter` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lptargetdevcharacter` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=icm32.dll, ABI=system, export=CMCreateTransformExt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `CMCreateTransformExt`(`lpcolorspace` : /* Rust *const */ kotlinx.cinterop.CPointer<`LOGCOLORSPACEA`>?, `lpdevcharacter` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lptargetdevcharacter` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwflags` : UInt) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=icm32.dll, ABI=system, export=CMCreateTransformExtW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `CMCreateTransformExtW`(`lpcolorspace` : /* Rust *const */ kotlinx.cinterop.CPointer<`LOGCOLORSPACEW`>?, `lpdevcharacter` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lptargetdevcharacter` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwflags` : UInt) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=icm32.dll, ABI=system, export=CMCreateTransformW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `CMCreateTransformW`(`lpcolorspace` : /* Rust *const */ kotlinx.cinterop.CPointer<`LOGCOLORSPACEW`>?, `lpdevcharacter` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lptargetdevcharacter` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=icm32.dll, ABI=system, export=CMDeleteTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CMDeleteTransform`(`hcmtransform` : Long) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=icm32.dll, ABI=system, export=CMGetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CMGetInfo`(`dwinfo` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=icm32.dll, ABI=system, export=CMGetNamedProfileInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CMGetNamedProfileInfo`(`hprofile` : Long, `pnamedprofileinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`NAMED_PROFILE_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=icm32.dll, ABI=system, export=CMIsProfileValid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CMIsProfileValid`(`hprofile` : Long, `lpbvalid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=icm32.dll, ABI=system, export=CMTranslateColors; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CMTranslateColors`(`hcmtransform` : Long, `lpainputcolors` : /* Rust *const */ kotlinx.cinterop.CPointer<`COLOR`>?, `ncolors` : UInt, `ctinput` : `COLORTYPE`, `lpaoutputcolors` : /* Rust *mut */ kotlinx.cinterop.CPointer<`COLOR`>?, `ctoutput` : `COLORTYPE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=icm32.dll, ABI=system, export=CMTranslateRGB; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CMTranslateRGB`(`hcmtransform` : Long, `colorref` : `super`.`super`.`Foundation`.`COLORREF`, `lpcolorref` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwflags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=icm32.dll, ABI=system, export=CMTranslateRGBs; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CMTranslateRGBs`(`hcmtransform` : Long, `lpsrcbits` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bminput` : `BMFORMAT`, `dwwidth` : UInt, `dwheight` : UInt, `dwstride` : UInt, `lpdestbits` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bmoutput` : `BMFORMAT`, `dwtranslatedirection` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=icm32.dll, ABI=system, export=CMTranslateRGBsExt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CMTranslateRGBsExt`(`hcmtransform` : Long, `lpsrcbits` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bminput` : `BMFORMAT`, `dwwidth` : UInt, `dwheight` : UInt, `dwinputstride` : UInt, `lpdestbits` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bmoutput` : `BMFORMAT`, `dwoutputstride` : UInt, `lpfncallback` : `LPBMCALLBACKFN`, `ulcallbackdata` : `super`.`super`.`Foundation`.`LPARAM`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=CheckBitmapBits; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CheckBitmapBits`(`hcolortransform` : Long, `psrcbits` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bminput` : `BMFORMAT`, `dwwidth` : UInt, `dwheight` : UInt, `dwstride` : UInt, `paresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pfncallback` : `LPBMCALLBACKFN`, `lpcallbackdata` : `super`.`super`.`Foundation`.`LPARAM`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=CheckColors; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CheckColors`(`hcolortransform` : Long, `painputcolors` : /* Rust *const */ kotlinx.cinterop.CPointer<`COLOR`>?, `ncolors` : UInt, `ctinput` : `COLORTYPE`, `paresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CheckColorsInGamut; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `CheckColorsInGamut`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `lprgbtriple` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`RGBTRIPLE`>?, `dlpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ncount` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=CloseColorProfile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CloseColorProfile`(`hprofile` : Long) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=ColorCorrectPalette; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `ColorCorrectPalette`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `hpal` : `super`.`super`.`Graphics`.`Gdi`.`HPALETTE`, `defirst` : UInt, `num` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=ColorMatchToTarget; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `ColorMatchToTarget`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `hdctarget` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `action` : `COLOR_MATCH_TO_TARGET_ACTION`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=ColorProfileAddDisplayAssociation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ColorProfileAddDisplayAssociation`(`scope` : `WCS_PROFILE_MANAGEMENT_SCOPE`, `profilename` : `windows_sys`.`core`.`PCWSTR`, `targetadapterid` : `super`.`super`.`Foundation`.`LUID`, `sourceid` : UInt, `setasdefault` : `windows_sys`.`core`.`BOOL`, `associateasadvancedcolor` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=ColorProfileGetDisplayDefault; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ColorProfileGetDisplayDefault`(`scope` : `WCS_PROFILE_MANAGEMENT_SCOPE`, `targetadapterid` : `super`.`super`.`Foundation`.`LUID`, `sourceid` : UInt, `profiletype` : `COLORPROFILETYPE`, `profilesubtype` : `COLORPROFILESUBTYPE`, `profilename` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=ColorProfileGetDisplayList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ColorProfileGetDisplayList`(`scope` : `WCS_PROFILE_MANAGEMENT_SCOPE`, `targetadapterid` : `super`.`super`.`Foundation`.`LUID`, `sourceid` : UInt, `profilelist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`PWSTR`>>?, `profilecount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=ColorProfileGetDisplayUserScope; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ColorProfileGetDisplayUserScope`(`targetadapterid` : `super`.`super`.`Foundation`.`LUID`, `sourceid` : UInt, `scope` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WCS_PROFILE_MANAGEMENT_SCOPE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=ColorProfileRemoveDisplayAssociation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ColorProfileRemoveDisplayAssociation`(`scope` : `WCS_PROFILE_MANAGEMENT_SCOPE`, `profilename` : `windows_sys`.`core`.`PCWSTR`, `targetadapterid` : `super`.`super`.`Foundation`.`LUID`, `sourceid` : UInt, `dissociateadvancedcolor` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=ColorProfileSetDisplayDefaultAssociation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ColorProfileSetDisplayDefaultAssociation`(`scope` : `WCS_PROFILE_MANAGEMENT_SCOPE`, `profilename` : `windows_sys`.`core`.`PCWSTR`, `profiletype` : `COLORPROFILETYPE`, `profilesubtype` : `COLORPROFILESUBTYPE`, `targetadapterid` : `super`.`super`.`Foundation`.`LUID`, `sourceid` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=ConvertColorNameToIndex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ConvertColorNameToIndex`(`hprofile` : Long, `pacolorname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `paindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwcount` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=ConvertIndexToColorName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ConvertIndexToColorName`(`hprofile` : Long, `paindex` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pacolorname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `dwcount` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateColorSpaceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `CreateColorSpaceA`(`lplcs` : /* Rust *const */ kotlinx.cinterop.CPointer<`LOGCOLORSPACEA`>?) : `HCOLORSPACE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateColorSpaceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `CreateColorSpaceW`(`lplcs` : /* Rust *const */ kotlinx.cinterop.CPointer<`LOGCOLORSPACEW`>?) : `HCOLORSPACE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=CreateColorTransformA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `CreateColorTransformA`(`plogcolorspace` : /* Rust *const */ kotlinx.cinterop.CPointer<`LOGCOLORSPACEA`>?, `hdestprofile` : Long, `htargetprofile` : Long, `dwflags` : UInt) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=CreateColorTransformW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `CreateColorTransformW`(`plogcolorspace` : /* Rust *const */ kotlinx.cinterop.CPointer<`LOGCOLORSPACEW`>?, `hdestprofile` : Long, `htargetprofile` : Long, `dwflags` : UInt) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=CreateDeviceLinkProfile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateDeviceLinkProfile`(`hprofile` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `nprofiles` : UInt, `padwintent` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `nintents` : UInt, `dwflags` : UInt, `pprofiledata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `indexpreferredcmm` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=CreateMultiProfileTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateMultiProfileTransform`(`pahprofiles` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `nprofiles` : UInt, `padwintent` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `nintents` : UInt, `dwflags` : UInt, `indexpreferredcmm` : UInt) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=CreateProfileFromLogColorSpaceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `CreateProfileFromLogColorSpaceA`(`plogcolorspace` : /* Rust *const */ kotlinx.cinterop.CPointer<`LOGCOLORSPACEA`>?, `pprofile` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=CreateProfileFromLogColorSpaceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `CreateProfileFromLogColorSpaceW`(`plogcolorspace` : /* Rust *const */ kotlinx.cinterop.CPointer<`LOGCOLORSPACEW`>?, `pprofile` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=DeleteColorSpace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteColorSpace`(`hcs` : `HCOLORSPACE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=DeleteColorTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteColorTransform`(`hxform` : Long) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=DisassociateColorProfileFromDeviceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DisassociateColorProfileFromDeviceA`(`pmachinename` : `windows_sys`.`core`.`PCSTR`, `pprofilename` : `windows_sys`.`core`.`PCSTR`, `pdevicename` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=DisassociateColorProfileFromDeviceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DisassociateColorProfileFromDeviceW`(`pmachinename` : `windows_sys`.`core`.`PCWSTR`, `pprofilename` : `windows_sys`.`core`.`PCWSTR`, `pdevicename` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=EnumColorProfilesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumColorProfilesA`(`pmachinename` : `windows_sys`.`core`.`PCSTR`, `penumrecord` : /* Rust *const */ kotlinx.cinterop.CPointer<`ENUMTYPEA`>?, `penumerationbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pdwsizeofenumerationbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pnprofiles` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=EnumColorProfilesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumColorProfilesW`(`pmachinename` : `windows_sys`.`core`.`PCWSTR`, `penumrecord` : /* Rust *const */ kotlinx.cinterop.CPointer<`ENUMTYPEW`>?, `penumerationbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pdwsizeofenumerationbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pnprofiles` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EnumICMProfilesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `EnumICMProfilesA`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `proc` : `ICMENUMPROCA`, `param2` : `super`.`super`.`Foundation`.`LPARAM`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EnumICMProfilesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `EnumICMProfilesW`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `proc` : `ICMENUMPROCW`, `param2` : `super`.`super`.`Foundation`.`LPARAM`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=GetCMMInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCMMInfo`(`hcolortransform` : Long, `param1` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=GetColorDirectoryA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetColorDirectoryA`(`pmachinename` : `windows_sys`.`core`.`PCSTR`, `pbuffer` : `windows_sys`.`core`.`PSTR`, `pdwsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=GetColorDirectoryW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetColorDirectoryW`(`pmachinename` : `windows_sys`.`core`.`PCWSTR`, `pbuffer` : `windows_sys`.`core`.`PWSTR`, `pdwsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=GetColorProfileElement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetColorProfileElement`(`hprofile` : Long, `tag` : UInt, `dwoffset` : UInt, `pcbelement` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pelement` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pbreference` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=GetColorProfileElementTag; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetColorProfileElementTag`(`hprofile` : Long, `dwindex` : UInt, `ptag` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=GetColorProfileFromHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetColorProfileFromHandle`(`hprofile` : Long, `pprofile` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pcbprofile` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=GetColorProfileHeader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetColorProfileHeader`(`hprofile` : Long, `pheader` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROFILEHEADER`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetColorSpace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetColorSpace`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`) : `HCOLORSPACE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=GetCountColorProfileElements; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCountColorProfileElements`(`hprofile` : Long, `pnelementcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetDeviceGammaRamp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetDeviceGammaRamp`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `lpramp` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetICMProfileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetICMProfileA`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `pbufsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pszfilename` : `windows_sys`.`core`.`PSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetICMProfileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetICMProfileW`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `pbufsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pszfilename` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetLogColorSpaceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetLogColorSpaceA`(`hcolorspace` : `HCOLORSPACE`, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LOGCOLORSPACEA`>?, `nsize` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetLogColorSpaceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetLogColorSpaceW`(`hcolorspace` : `HCOLORSPACE`, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LOGCOLORSPACEW`>?, `nsize` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=GetNamedProfileInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetNamedProfileInfo`(`hprofile` : Long, `pnamedprofileinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`NAMED_PROFILE_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=GetPS2ColorRenderingDictionary; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPS2ColorRenderingDictionary`(`hprofile` : Long, `dwintent` : UInt, `pps2colorrenderingdictionary` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pcbps2colorrenderingdictionary` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pbbinary` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=GetPS2ColorRenderingIntent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPS2ColorRenderingIntent`(`hprofile` : Long, `dwintent` : UInt, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pcbps2colorrenderingintent` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=GetPS2ColorSpaceArray; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPS2ColorSpaceArray`(`hprofile` : Long, `dwintent` : UInt, `dwcsatype` : UInt, `pps2colorspacearray` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pcbps2colorspacearray` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pbbinary` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=GetStandardColorSpaceProfileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetStandardColorSpaceProfileA`(`pmachinename` : `windows_sys`.`core`.`PCSTR`, `dwscs` : UInt, `pbuffer` : `windows_sys`.`core`.`PSTR`, `pcbsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=GetStandardColorSpaceProfileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetStandardColorSpaceProfileW`(`pmachinename` : `windows_sys`.`core`.`PCWSTR`, `dwscs` : UInt, `pbuffer` : `windows_sys`.`core`.`PWSTR`, `pcbsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=InstallColorProfileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InstallColorProfileA`(`pmachinename` : `windows_sys`.`core`.`PCSTR`, `pprofilename` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=InstallColorProfileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InstallColorProfileW`(`pmachinename` : `windows_sys`.`core`.`PCWSTR`, `pprofilename` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=IsColorProfileTagPresent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsColorProfileTagPresent`(`hprofile` : Long, `tag` : UInt, `pbpresent` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=IsColorProfileValid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsColorProfileValid`(`hprofile` : Long, `pbvalid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=OpenColorProfileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenColorProfileA`(`pprofile` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROFILE`>?, `dwdesiredaccess` : UInt, `dwsharemode` : UInt, `dwcreationmode` : UInt) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=OpenColorProfileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenColorProfileW`(`pprofile` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROFILE`>?, `dwdesiredaccess` : UInt, `dwsharemode` : UInt, `dwcreationmode` : UInt) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=RegisterCMMA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterCMMA`(`pmachinename` : `windows_sys`.`core`.`PCSTR`, `cmmid` : UInt, `pcmmdll` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=RegisterCMMW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterCMMW`(`pmachinename` : `windows_sys`.`core`.`PCWSTR`, `cmmid` : UInt, `pcmmdll` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=SelectCMM; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SelectCMM`(`dwcmmtype` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=SetColorProfileElement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetColorProfileElement`(`hprofile` : Long, `tag` : UInt, `dwoffset` : UInt, `pcbelement` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pelement` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=SetColorProfileElementReference; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetColorProfileElementReference`(`hprofile` : Long, `newtag` : UInt, `reftag` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=SetColorProfileElementSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetColorProfileElementSize`(`hprofile` : Long, `tagtype` : UInt, `pcbelement` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=SetColorProfileHeader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `SetColorProfileHeader`(`hprofile` : Long, `pheader` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROFILEHEADER`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetColorSpace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `SetColorSpace`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `hcs` : `HCOLORSPACE`) : `HCOLORSPACE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetDeviceGammaRamp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `SetDeviceGammaRamp`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `lpramp` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetICMMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `SetICMMode`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `mode` : `ICM_MODE`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetICMProfileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `SetICMProfileA`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `lpfilename` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetICMProfileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `SetICMProfileW`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `lpfilename` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=SetStandardColorSpaceProfileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetStandardColorSpaceProfileA`(`pmachinename` : `windows_sys`.`core`.`PCSTR`, `dwprofileid` : UInt, `pprofilename` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=SetStandardColorSpaceProfileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetStandardColorSpaceProfileW`(`pmachinename` : `windows_sys`.`core`.`PCWSTR`, `dwprofileid` : UInt, `pprofilename` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=icmui.dll, ABI=system, export=SetupColorMatchingA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `SetupColorMatchingA`(`pcms` : /* Rust *mut */ kotlinx.cinterop.CPointer<`COLORMATCHSETUPA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=icmui.dll, ABI=system, export=SetupColorMatchingW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `SetupColorMatchingW`(`pcms` : /* Rust *mut */ kotlinx.cinterop.CPointer<`COLORMATCHSETUPW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=TranslateBitmapBits; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TranslateBitmapBits`(`hcolortransform` : Long, `psrcbits` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bminput` : `BMFORMAT`, `dwwidth` : UInt, `dwheight` : UInt, `dwinputstride` : UInt, `pdestbits` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bmoutput` : `BMFORMAT`, `dwoutputstride` : UInt, `pfncallback` : `LPBMCALLBACKFN`, `ulcallbackdata` : `super`.`super`.`Foundation`.`LPARAM`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=TranslateColors; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TranslateColors`(`hcolortransform` : Long, `painputcolors` : /* Rust *const */ kotlinx.cinterop.CPointer<`COLOR`>?, `ncolors` : UInt, `ctinput` : `COLORTYPE`, `paoutputcolors` : /* Rust *mut */ kotlinx.cinterop.CPointer<`COLOR`>?, `ctoutput` : `COLORTYPE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=UninstallColorProfileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UninstallColorProfileA`(`pmachinename` : `windows_sys`.`core`.`PCSTR`, `pprofilename` : `windows_sys`.`core`.`PCSTR`, `bdelete` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=UninstallColorProfileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UninstallColorProfileW`(`pmachinename` : `windows_sys`.`core`.`PCWSTR`, `pprofilename` : `windows_sys`.`core`.`PCWSTR`, `bdelete` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=UnregisterCMMA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnregisterCMMA`(`pmachinename` : `windows_sys`.`core`.`PCSTR`, `cmmid` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=UnregisterCMMW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnregisterCMMW`(`pmachinename` : `windows_sys`.`core`.`PCWSTR`, `cmmid` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=UpdateICMRegKeyA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UpdateICMRegKeyA`(`reserved` : UInt, `lpszcmid` : `windows_sys`.`core`.`PCSTR`, `lpszfilename` : `windows_sys`.`core`.`PCSTR`, `command` : `ICM_COMMAND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=UpdateICMRegKeyW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UpdateICMRegKeyW`(`reserved` : UInt, `lpszcmid` : `windows_sys`.`core`.`PCWSTR`, `lpszfilename` : `windows_sys`.`core`.`PCWSTR`, `command` : `ICM_COMMAND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=WcsAssociateColorProfileWithDevice; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WcsAssociateColorProfileWithDevice`(`scope` : `WCS_PROFILE_MANAGEMENT_SCOPE`, `pprofilename` : `windows_sys`.`core`.`PCWSTR`, `pdevicename` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=WcsCheckColors; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WcsCheckColors`(`hcolortransform` : Long, `ncolors` : UInt, `ninputchannels` : UInt, `cdtinput` : `COLORDATATYPE`, `cbinput` : UInt, `pinputdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `paresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=WcsCreateIccProfile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WcsCreateIccProfile`(`hwcsprofile` : Long, `dwoptions` : UInt) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=WcsDisassociateColorProfileFromDevice; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WcsDisassociateColorProfileFromDevice`(`scope` : `WCS_PROFILE_MANAGEMENT_SCOPE`, `pprofilename` : `windows_sys`.`core`.`PCWSTR`, `pdevicename` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=WcsEnumColorProfiles; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WcsEnumColorProfiles`(`scope` : `WCS_PROFILE_MANAGEMENT_SCOPE`, `penumrecord` : /* Rust *const */ kotlinx.cinterop.CPointer<`ENUMTYPEW`>?, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwsize` : UInt, `pnprofiles` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=WcsEnumColorProfilesSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WcsEnumColorProfilesSize`(`scope` : `WCS_PROFILE_MANAGEMENT_SCOPE`, `penumrecord` : /* Rust *const */ kotlinx.cinterop.CPointer<`ENUMTYPEW`>?, `pdwsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=WcsGetCalibrationManagementState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WcsGetCalibrationManagementState`(`pbisenabled` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=WcsGetDefaultColorProfile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WcsGetDefaultColorProfile`(`scope` : `WCS_PROFILE_MANAGEMENT_SCOPE`, `pdevicename` : `windows_sys`.`core`.`PCWSTR`, `cptcolorprofiletype` : `COLORPROFILETYPE`, `cpstcolorprofilesubtype` : `COLORPROFILESUBTYPE`, `dwprofileid` : UInt, `cbprofilename` : UInt, `pprofilename` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=WcsGetDefaultColorProfileSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WcsGetDefaultColorProfileSize`(`scope` : `WCS_PROFILE_MANAGEMENT_SCOPE`, `pdevicename` : `windows_sys`.`core`.`PCWSTR`, `cptcolorprofiletype` : `COLORPROFILETYPE`, `cpstcolorprofilesubtype` : `COLORPROFILESUBTYPE`, `dwprofileid` : UInt, `pcbprofilename` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=WcsGetDefaultRenderingIntent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WcsGetDefaultRenderingIntent`(`scope` : `WCS_PROFILE_MANAGEMENT_SCOPE`, `pdwrenderingintent` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=WcsGetUsePerUserProfiles; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WcsGetUsePerUserProfiles`(`pdevicename` : `windows_sys`.`core`.`PCWSTR`, `dwdeviceclass` : UInt, `puseperuserprofiles` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=WcsOpenColorProfileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WcsOpenColorProfileA`(`pcdmpprofile` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROFILE`>?, `pcampprofile` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROFILE`>?, `pgmmpprofile` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROFILE`>?, `dwdesireaccess` : UInt, `dwsharemode` : UInt, `dwcreationmode` : UInt, `dwflags` : UInt) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=WcsOpenColorProfileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WcsOpenColorProfileW`(`pcdmpprofile` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROFILE`>?, `pcampprofile` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROFILE`>?, `pgmmpprofile` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROFILE`>?, `dwdesireaccess` : UInt, `dwsharemode` : UInt, `dwcreationmode` : UInt, `dwflags` : UInt) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=WcsSetCalibrationManagementState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WcsSetCalibrationManagementState`(`bisenabled` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=WcsSetDefaultColorProfile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WcsSetDefaultColorProfile`(`scope` : `WCS_PROFILE_MANAGEMENT_SCOPE`, `pdevicename` : `windows_sys`.`core`.`PCWSTR`, `cptcolorprofiletype` : `COLORPROFILETYPE`, `cpstcolorprofilesubtype` : `COLORPROFILESUBTYPE`, `dwprofileid` : UInt, `pprofilename` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=WcsSetDefaultRenderingIntent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WcsSetDefaultRenderingIntent`(`scope` : `WCS_PROFILE_MANAGEMENT_SCOPE`, `dwrenderingintent` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=WcsSetUsePerUserProfiles; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WcsSetUsePerUserProfiles`(`pdevicename` : `windows_sys`.`core`.`PCWSTR`, `dwdeviceclass` : UInt, `useperuserprofiles` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscms.dll, ABI=system, export=WcsTranslateColors; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WcsTranslateColors`(`hcolortransform` : Long, `ncolors` : UInt, `ninputchannels` : UInt, `cdtinput` : `COLORDATATYPE`, `cbinput` : UInt, `pinputdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `noutputchannels` : UInt, `cdtoutput` : `COLORDATATYPE`, `cboutput` : UInt, `poutputdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
public const val `ATTRIB_MATTE`: UInt = 2u;
public const val `ATTRIB_TRANSPARENCY`: UInt = 1u;
public const val `BEST_MODE`: UInt = 3u;
public typealias `BMFORMAT` = Int;
public const val `BM_10b_G3CH`: `BMFORMAT` = 1028;
public const val `BM_10b_Lab`: `BMFORMAT` = 1027;
public const val `BM_10b_RGB`: `BMFORMAT` = 9;
public const val `BM_10b_XYZ`: `BMFORMAT` = 1025;
public const val `BM_10b_Yxy`: `BMFORMAT` = 1026;
public const val `BM_16b_G3CH`: `BMFORMAT` = 1284;
public const val `BM_16b_GRAY`: `BMFORMAT` = 1285;
public const val `BM_16b_Lab`: `BMFORMAT` = 1283;
public const val `BM_16b_RGB`: `BMFORMAT` = 10;
public const val `BM_16b_XYZ`: `BMFORMAT` = 1281;
public const val `BM_16b_Yxy`: `BMFORMAT` = 1282;
public const val `BM_32b_scARGB`: `BMFORMAT` = 1538;
public const val `BM_32b_scRGB`: `BMFORMAT` = 1537;
public const val `BM_565RGB`: `BMFORMAT` = 1;
public const val `BM_5CHANNEL`: `BMFORMAT` = 517;
public const val `BM_6CHANNEL`: `BMFORMAT` = 518;
public const val `BM_7CHANNEL`: `BMFORMAT` = 519;
public const val `BM_8CHANNEL`: `BMFORMAT` = 520;
public const val `BM_BGRTRIPLETS`: `BMFORMAT` = 4;
public const val `BM_CMYKQUADS`: `BMFORMAT` = 32;
public const val `BM_G3CHTRIPLETS`: `BMFORMAT` = 516;
public const val `BM_GRAY`: `BMFORMAT` = 521;
public const val `BM_KYMCQUADS`: `BMFORMAT` = 773;
public const val `BM_LabTRIPLETS`: `BMFORMAT` = 515;
public const val `BM_NAMED_INDEX`: `BMFORMAT` = 1029;
public const val `BM_R10G10B10A2`: `BMFORMAT` = 1793;
public const val `BM_R10G10B10A2_XR`: `BMFORMAT` = 1794;
public const val `BM_R16G16B16A16_FLOAT`: `BMFORMAT` = 1795;
public const val `BM_RGBTRIPLETS`: `BMFORMAT` = 2;
public const val `BM_S2DOT13FIXED_scARGB`: `BMFORMAT` = 1540;
public const val `BM_S2DOT13FIXED_scRGB`: `BMFORMAT` = 1539;
public const val `BM_XYZTRIPLETS`: `BMFORMAT` = 513;
public const val `BM_YxyTRIPLETS`: `BMFORMAT` = 514;
public const val `BM_x555G3CH`: `BMFORMAT` = 260;
public const val `BM_x555Lab`: `BMFORMAT` = 259;
public const val `BM_x555RGB`: `BMFORMAT` = 0;
public const val `BM_x555XYZ`: `BMFORMAT` = 257;
public const val `BM_x555Yxy`: `BMFORMAT` = 258;
public const val `BM_xBGRQUADS`: `BMFORMAT` = 16;
public const val `BM_xG3CHQUADS`: `BMFORMAT` = 772;
public const val `BM_xRGBQUADS`: `BMFORMAT` = 8;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BlackInformation` (
    public var `fBlackOnly`: `windows_sys`.`core`.`BOOL`,
    public var `blackWeight`: Float,
)
// UNSUPPORTED Rust 206:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CATID_WcsPlugin: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa0b402e0_8240_405f_8a16_8a5b4df2f0dd);

public const val `CMM_DESCRIPTION`: UInt = 5u;
public const val `CMM_DLL_VERSION`: UInt = 3u;
public const val `CMM_DRIVER_VERSION`: UInt = 2u;
public const val `CMM_FROM_PROFILE`: UInt = 0u;
public const val `CMM_IDENT`: UInt = 1u;
public const val `CMM_LOGOICON`: UInt = 6u;
public const val `CMM_VERSION`: UInt = 4u;
public const val `CMM_WIN_VERSION`: UInt = 0u;
public const val `CMS_BACKWARD`: UInt = 1u;
public const val `CMS_DISABLEICM`: UInt = 1u;
public const val `CMS_DISABLEINTENT`: UInt = 1024u;
public const val `CMS_DISABLERENDERINTENT`: UInt = 2048u;
public const val `CMS_ENABLEPROOFING`: UInt = 2u;
public const val `CMS_FORWARD`: UInt = 0u;
public const val `CMS_MONITOROVERFLOW`: Int = -2147483648;
public const val `CMS_PRINTEROVERFLOW`: Int = 1073741824;
public const val `CMS_SETMONITORPROFILE`: UInt = 16u;
public const val `CMS_SETPRINTERPROFILE`: UInt = 32u;
public const val `CMS_SETPROOFINTENT`: UInt = 8u;
public const val `CMS_SETRENDERINTENT`: UInt = 4u;
public const val `CMS_SETTARGETPROFILE`: UInt = 64u;
public const val `CMS_TARGETOVERFLOW`: Int = 536870912;
public const val `CMS_USEAPPLYCALLBACK`: UInt = 256u;
public const val `CMS_USEDESCRIPTION`: UInt = 512u;
public const val `CMS_USEHOOK`: UInt = 128u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CMYKCOLOR` (
    public var `cyan`: UShort,
    public var `magenta`: UShort,
    public var `yellow`: UShort,
    public var `black`: UShort,
)
// UNSUPPORTED Rust 240:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union COLOR {
//     pub gray: GRAYCOLOR,
//     pub rgb: RGBCOLOR,
//     pub cmyk: CMYKCOLOR,
//     pub XYZ: XYZCOLOR,
//     pub Yxy: YxyCOLOR,
//     pub Lab: LabCOLOR,
//     pub gen3ch: GENERIC3CHANNEL,
//     pub named: NAMEDCOLOR,
//     pub hifi: HiFiCOLOR,
//     pub Anonymous: COLOR_0,
// }

// UNSUPPORTED Rust 254:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for COLOR {
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
public class `COLOR_0` (
    public var `reserved1`: UInt,
    public var `reserved2`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 265:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for COLOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `COLORDATATYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `COLORMATCHSETUPA` (
    public var `dwSize`: UInt,
    public var `dwVersion`: UInt,
    public var `dwFlags`: UInt,
    public var `hwndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `pSourceName`: `windows_sys`.`core`.`PCSTR`,
    public var `pDisplayName`: `windows_sys`.`core`.`PCSTR`,
    public var `pPrinterName`: `windows_sys`.`core`.`PCSTR`,
    public var `dwRenderIntent`: UInt,
    public var `dwProofingIntent`: UInt,
    public var `pMonitorProfile`: `windows_sys`.`core`.`PSTR`,
    public var `ccMonitorProfile`: UInt,
    public var `pPrinterProfile`: `windows_sys`.`core`.`PSTR`,
    public var `ccPrinterProfile`: UInt,
    public var `pTargetProfile`: `windows_sys`.`core`.`PSTR`,
    public var `ccTargetProfile`: UInt,
    public var `lpfnHook`: `super`.`WindowsAndMessaging`.`DLGPROC`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `lpfnApplyCallback`: `PCMSCALLBACKA`,
    public var `lParamApplyCallback`: `super`.`super`.`Foundation`.`LPARAM`,
)
// UNSUPPORTED Rust 295:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for COLORMATCHSETUPA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `COLORMATCHSETUPW` (
    public var `dwSize`: UInt,
    public var `dwVersion`: UInt,
    public var `dwFlags`: UInt,
    public var `hwndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `pSourceName`: `windows_sys`.`core`.`PCWSTR`,
    public var `pDisplayName`: `windows_sys`.`core`.`PCWSTR`,
    public var `pPrinterName`: `windows_sys`.`core`.`PCWSTR`,
    public var `dwRenderIntent`: UInt,
    public var `dwProofingIntent`: UInt,
    public var `pMonitorProfile`: `windows_sys`.`core`.`PWSTR`,
    public var `ccMonitorProfile`: UInt,
    public var `pPrinterProfile`: `windows_sys`.`core`.`PWSTR`,
    public var `ccPrinterProfile`: UInt,
    public var `pTargetProfile`: `windows_sys`.`core`.`PWSTR`,
    public var `ccTargetProfile`: UInt,
    public var `lpfnHook`: `super`.`WindowsAndMessaging`.`DLGPROC`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `lpfnApplyCallback`: `PCMSCALLBACKW`,
    public var `lParamApplyCallback`: `super`.`super`.`Foundation`.`LPARAM`,
)
// UNSUPPORTED Rust 325:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for COLORMATCHSETUPW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `COLORPROFILESUBTYPE` = Int;
public typealias `COLORPROFILETYPE` = Int;
public typealias `COLORTYPE` = Int;
public const val `COLOR_10b_R10G10B10A2`: `COLORDATATYPE` = 5;
public const val `COLOR_10b_R10G10B10A2_XR`: `COLORDATATYPE` = 6;
public const val `COLOR_3_CHANNEL`: `COLORTYPE` = 6;
public const val `COLOR_5_CHANNEL`: `COLORTYPE` = 8;
public const val `COLOR_6_CHANNEL`: `COLORTYPE` = 9;
public const val `COLOR_7_CHANNEL`: `COLORTYPE` = 10;
public const val `COLOR_8_CHANNEL`: `COLORTYPE` = 11;
public const val `COLOR_BYTE`: `COLORDATATYPE` = 1;
public const val `COLOR_CMYK`: `COLORTYPE` = 7;
public const val `COLOR_FLOAT`: `COLORDATATYPE` = 3;
public const val `COLOR_FLOAT16`: `COLORDATATYPE` = 7;
public const val `COLOR_GRAY`: `COLORTYPE` = 1;
public const val `COLOR_Lab`: `COLORTYPE` = 5;
public typealias `COLOR_MATCH_TO_TARGET_ACTION` = UInt;
public const val `COLOR_MATCH_VERSION`: UInt = 512u;
public const val `COLOR_NAMED`: `COLORTYPE` = 12;
public const val `COLOR_RGB`: `COLORTYPE` = 2;
public const val `COLOR_S2DOT13FIXED`: `COLORDATATYPE` = 4;
public const val `COLOR_WORD`: `COLORDATATYPE` = 2;
public const val `COLOR_XYZ`: `COLORTYPE` = 3;
public const val `COLOR_Yxy`: `COLORTYPE` = 4;
public const val `CPST_ABSOLUTE_COLORIMETRIC`: `COLORPROFILESUBTYPE` = 3;
public const val `CPST_CUSTOM_WORKING_SPACE`: `COLORPROFILESUBTYPE` = 6;
public const val `CPST_EXTENDED_DISPLAY_COLOR_MODE`: `COLORPROFILESUBTYPE` = 8;
public const val `CPST_NONE`: `COLORPROFILESUBTYPE` = 4;
public const val `CPST_PERCEPTUAL`: `COLORPROFILESUBTYPE` = 0;
public const val `CPST_RELATIVE_COLORIMETRIC`: `COLORPROFILESUBTYPE` = 1;
public const val `CPST_RGB_WORKING_SPACE`: `COLORPROFILESUBTYPE` = 5;
public const val `CPST_SATURATION`: `COLORPROFILESUBTYPE` = 2;
public const val `CPST_STANDARD_DISPLAY_COLOR_MODE`: `COLORPROFILESUBTYPE` = 7;
public const val `CPT_CAMP`: `COLORPROFILETYPE` = 2;
public const val `CPT_DMP`: `COLORPROFILETYPE` = 1;
public const val `CPT_GMMP`: `COLORPROFILETYPE` = 3;
public const val `CPT_ICC`: `COLORPROFILETYPE` = 0;
public const val `CSA_A`: UInt = 1u;
public const val `CSA_ABC`: UInt = 2u;
public const val `CSA_CMYK`: UInt = 7u;
public const val `CSA_DEF`: UInt = 3u;
public const val `CSA_DEFG`: UInt = 4u;
public const val `CSA_GRAY`: UInt = 5u;
public const val `CSA_Lab`: UInt = 8u;
public const val `CSA_RGB`: UInt = 6u;
public const val `CS_DELETE_TRANSFORM`: `COLOR_MATCH_TO_TARGET_ACTION` = 3u;
public const val `CS_DISABLE`: `COLOR_MATCH_TO_TARGET_ACTION` = 2u;
public const val `CS_ENABLE`: `COLOR_MATCH_TO_TARGET_ACTION` = 1u;
public const val `DONT_USE_EMBEDDED_WCS_PROFILES`: Int = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRCREATECOLORSPACE` (
    public var `emr`: `super`.`super`.`Graphics`.`Gdi`.`EMR`,
    public var `ihCS`: UInt,
    public var `lcs`: `LOGCOLORSPACEA`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EMRCREATECOLORSPACEW` (
    public var `emr`: `super`.`super`.`Graphics`.`Gdi`.`EMR`,
    public var `ihCS`: UInt,
    public var `lcs`: `LOGCOLORSPACEW`,
    public var `dwFlags`: UInt,
    public var `cbData`: UInt,
    public var `Data`: UByteArray,
)
// UNSUPPORTED Rust 399:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for EMRCREATECOLORSPACEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ENABLE_GAMUT_CHECKING`: UInt = 65536u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ENUMTYPEA` (
    public var `dwSize`: UInt,
    public var `dwVersion`: UInt,
    public var `dwFields`: UInt,
    public var `pDeviceName`: `windows_sys`.`core`.`PCSTR`,
    public var `dwMediaType`: UInt,
    public var `dwDitheringMode`: UInt,
    public var `dwResolution`: UIntArray,
    public var `dwCMMType`: UInt,
    public var `dwClass`: UInt,
    public var `dwDataColorSpace`: UInt,
    public var `dwConnectionSpace`: UInt,
    public var `dwSignature`: UInt,
    public var `dwPlatform`: UInt,
    public var `dwProfileFlags`: UInt,
    public var `dwManufacturer`: UInt,
    public var `dwModel`: UInt,
    public var `dwAttributes`: UIntArray,
    public var `dwRenderingIntent`: UInt,
    public var `dwCreator`: UInt,
    public var `dwDeviceClass`: UInt,
)
// UNSUPPORTED Rust 430:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ENUMTYPEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ENUMTYPEW` (
    public var `dwSize`: UInt,
    public var `dwVersion`: UInt,
    public var `dwFields`: UInt,
    public var `pDeviceName`: `windows_sys`.`core`.`PCWSTR`,
    public var `dwMediaType`: UInt,
    public var `dwDitheringMode`: UInt,
    public var `dwResolution`: UIntArray,
    public var `dwCMMType`: UInt,
    public var `dwClass`: UInt,
    public var `dwDataColorSpace`: UInt,
    public var `dwConnectionSpace`: UInt,
    public var `dwSignature`: UInt,
    public var `dwPlatform`: UInt,
    public var `dwProfileFlags`: UInt,
    public var `dwManufacturer`: UInt,
    public var `dwModel`: UInt,
    public var `dwAttributes`: UIntArray,
    public var `dwRenderingIntent`: UInt,
    public var `dwCreator`: UInt,
    public var `dwDeviceClass`: UInt,
)
// UNSUPPORTED Rust 459:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ENUMTYPEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ENUM_TYPE_VERSION`: UInt = 768u;
public const val `ET_ATTRIBUTES`: UInt = 8192u;
public const val `ET_CLASS`: UInt = 32u;
public const val `ET_CMMTYPE`: UInt = 16u;
public const val `ET_CONNECTIONSPACE`: UInt = 128u;
public const val `ET_CREATOR`: UInt = 32768u;
public const val `ET_DATACOLORSPACE`: UInt = 64u;
public const val `ET_DEVICECLASS`: UInt = 65536u;
public const val `ET_DEVICENAME`: UInt = 1u;
public const val `ET_DITHERMODE`: UInt = 4u;
public const val `ET_EXTENDEDDISPLAYCOLOR`: UInt = 262144u;
public const val `ET_MANUFACTURER`: UInt = 2048u;
public const val `ET_MEDIATYPE`: UInt = 2u;
public const val `ET_MODEL`: UInt = 4096u;
public const val `ET_PLATFORM`: UInt = 512u;
public const val `ET_PROFILEFLAGS`: UInt = 1024u;
public const val `ET_RENDERINGINTENT`: UInt = 16384u;
public const val `ET_RESOLUTION`: UInt = 8u;
public const val `ET_SIGNATURE`: UInt = 256u;
public const val `ET_STANDARDDISPLAYCOLOR`: UInt = 131072u;
public const val `FAST_TRANSLATE`: UInt = 262144u;
public const val `FLAG_DEPENDENTONDATA`: UInt = 2u;
public const val `FLAG_EMBEDDEDPROFILE`: UInt = 1u;
public const val `FLAG_ENABLE_CHROMATIC_ADAPTATION`: UInt = 33554432u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GENERIC3CHANNEL` (
    public var `ch1`: UShort,
    public var `ch2`: UShort,
    public var `ch3`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GRAYCOLOR` (
    public var `gray`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GamutBoundaryDescription` (
    public var `pPrimaries`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PrimaryJabColors`>?,
    public var `cNeutralSamples`: UInt,
    public var `pNeutralSamples`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JabColorF`>?,
    public var `pReferenceShell`: /* Rust *mut */ kotlinx.cinterop.CPointer<`GamutShell`>?,
    public var `pPlausibleShell`: /* Rust *mut */ kotlinx.cinterop.CPointer<`GamutShell`>?,
    public var `pPossibleShell`: /* Rust *mut */ kotlinx.cinterop.CPointer<`GamutShell`>?,
)
// UNSUPPORTED Rust 510:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GamutBoundaryDescription {
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
public class `GamutShell` (
    public var `JMin`: Float,
    public var `JMax`: Float,
    public var `cVertices`: UInt,
    public var `cTriangles`: UInt,
    public var `pVertices`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JabColorF`>?,
    public var `pTriangles`: /* Rust *mut */ kotlinx.cinterop.CPointer<`GamutShellTriangle`>?,
)
// UNSUPPORTED Rust 525:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GamutShell {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GamutShellTriangle` (
    public var `aVertexIndex`: UIntArray,
)
// UNSUPPORTED Rust 535:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GamutShellTriangle {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HCOLORSPACE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HiFiCOLOR` (
    public var `channel`: UByteArray,
)
// UNSUPPORTED Rust 546:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HiFiCOLOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `ICMENUMPROCA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, `super`.`super`.`Foundation`.`LPARAM`) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `ICMENUMPROCW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `super`.`super`.`Foundation`.`LPARAM`) -> Int>>>;
public const val `ICM_ADDPROFILE`: `ICM_COMMAND` = 1u;
public typealias `ICM_COMMAND` = UInt;
public const val `ICM_DELETEPROFILE`: `ICM_COMMAND` = 2u;
public const val `ICM_DONE_OUTSIDEDC`: `ICM_MODE` = 4;
public typealias `ICM_MODE` = Int;
public const val `ICM_OFF`: `ICM_MODE` = 1;
public const val `ICM_ON`: `ICM_MODE` = 2;
public const val `ICM_QUERY`: `ICM_MODE` = 3;
public const val `ICM_QUERYMATCH`: `ICM_COMMAND` = 7u;
public const val `ICM_QUERYPROFILE`: `ICM_COMMAND` = 3u;
public const val `ICM_REGISTERICMATCHER`: `ICM_COMMAND` = 5u;
public const val `ICM_SETDEFAULTPROFILE`: `ICM_COMMAND` = 4u;
public const val `ICM_UNREGISTERICMATCHER`: `ICM_COMMAND` = 6u;
public const val `INDEX_DONT_CARE`: UInt = 0u;
public const val `INTENT_ABSOLUTE_COLORIMETRIC`: UInt = 3u;
public const val `INTENT_PERCEPTUAL`: UInt = 0u;
public const val `INTENT_RELATIVE_COLORIMETRIC`: UInt = 1u;
public const val `INTENT_SATURATION`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JChColorF` (
    public var `J`: Float,
    public var `C`: Float,
    public var `h`: Float,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JabColorF` (
    public var `J`: Float,
    public var `a`: Float,
    public var `b`: Float,
)
public typealias `LCSCSTYPE` = Int;
public const val `LCS_CALIBRATED_RGB`: `LCSCSTYPE` = 0;
public const val `LCS_WINDOWS_COLOR_SPACE`: `LCSCSTYPE` = 1466527264;
public const val `LCS_sRGB`: `LCSCSTYPE` = 1934772034;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LOGCOLORSPACEA` (
    public var `lcsSignature`: UInt,
    public var `lcsVersion`: UInt,
    public var `lcsSize`: UInt,
    public var `lcsCSType`: `LCSCSTYPE`,
    public var `lcsIntent`: Int,
    public var `lcsEndpoints`: `super`.`super`.`Graphics`.`Gdi`.`CIEXYZTRIPLE`,
    public var `lcsGammaRed`: UInt,
    public var `lcsGammaGreen`: UInt,
    public var `lcsGammaBlue`: UInt,
    public var `lcsFilename`: ByteArray,
)
// UNSUPPORTED Rust 604:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for LOGCOLORSPACEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LOGCOLORSPACEW` (
    public var `lcsSignature`: UInt,
    public var `lcsVersion`: UInt,
    public var `lcsSize`: UInt,
    public var `lcsCSType`: `LCSCSTYPE`,
    public var `lcsIntent`: Int,
    public var `lcsEndpoints`: `super`.`super`.`Graphics`.`Gdi`.`CIEXYZTRIPLE`,
    public var `lcsGammaRed`: UInt,
    public var `lcsGammaGreen`: UInt,
    public var `lcsGammaBlue`: UInt,
    public var `lcsFilename`: UShortArray,
)
// UNSUPPORTED Rust 625:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for LOGCOLORSPACEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPBMCALLBACKFN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, `super`.`super`.`Foundation`.`LPARAM`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LabCOLOR` (
    public var `L`: UShort,
    public var `a`: UShort,
    public var `b`: UShort,
)
public const val `MAX_COLOR_CHANNELS`: UInt = 8u;
public const val `MicrosoftHardwareColorV2`: `WCS_DEVICE_CAPABILITIES_TYPE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NAMEDCOLOR` (
    public var `dwIndex`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NAMED_PROFILE_INFO` (
    public var `dwFlags`: UInt,
    public var `dwCount`: UInt,
    public var `dwCountDevCoordinates`: UInt,
    public var `szPrefix`: ByteArray,
    public var `szSuffix`: ByteArray,
)
// UNSUPPORTED Rust 655:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NAMED_PROFILE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NORMAL_MODE`: UInt = 2u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public typealias `PCMSCALLBACKA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`COLORMATCHSETUPA`>?, `super`.`super`.`Foundation`.`LPARAM`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public typealias `PCMSCALLBACKW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`COLORMATCHSETUPW`>?, `super`.`super`.`Foundation`.`LPARAM`) -> `windows_sys`.`core`.`BOOL`>>>;
public const val `PRESERVEBLACK`: UInt = 1048576u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROFILE` (
    public var `dwType`: UInt,
    public var `pProfileData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `cbDataSize`: UInt,
)
// UNSUPPORTED Rust 673:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROFILE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 44 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROFILEHEADER` (
    public var `phSize`: UInt,
    public var `phCMMType`: UInt,
    public var `phVersion`: UInt,
    public var `phClass`: UInt,
    public var `phDataColorSpace`: UInt,
    public var `phConnectionSpace`: UInt,
    public var `phDateTime`: UIntArray,
    public var `phSignature`: UInt,
    public var `phPlatform`: UInt,
    public var `phProfileFlags`: UInt,
    public var `phManufacturer`: UInt,
    public var `phModel`: UInt,
    public var `phAttributes`: UIntArray,
    public var `phRenderingIntent`: UInt,
    public var `phIlluminant`: `super`.`super`.`Graphics`.`Gdi`.`CIEXYZ`,
    public var `phCreator`: UInt,
    public var `phReserved`: UByteArray,
)
// UNSUPPORTED Rust 700:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for PROFILEHEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PROFILE_FILENAME`: UInt = 1u;
public const val `PROFILE_MEMBUFFER`: UInt = 2u;
public const val `PROFILE_READ`: UInt = 1u;
public const val `PROFILE_READWRITE`: UInt = 2u;
public const val `PROOF_MODE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PrimaryJabColors` (
    public var `red`: `JabColorF`,
    public var `yellow`: `JabColorF`,
    public var `green`: `JabColorF`,
    public var `cyan`: `JabColorF`,
    public var `blue`: `JabColorF`,
    public var `magenta`: `JabColorF`,
    public var `black`: `JabColorF`,
    public var `white`: `JabColorF`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PrimaryXYZColors` (
    public var `red`: `XYZColorF`,
    public var `yellow`: `XYZColorF`,
    public var `green`: `XYZColorF`,
    public var `cyan`: `XYZColorF`,
    public var `blue`: `XYZColorF`,
    public var `magenta`: `XYZColorF`,
    public var `black`: `XYZColorF`,
    public var `white`: `XYZColorF`,
)
public const val `RESERVED`: UInt = 2147483648u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RGBCOLOR` (
    public var `red`: UShort,
    public var `green`: UShort,
    public var `blue`: UShort,
)
public const val `SEQUENTIAL_TRANSFORM`: UInt = 2155872256u;
public const val `USE_RELATIVE_COLORIMETRIC`: UInt = 131072u;
public const val `VideoCardGammaTable`: `WCS_DEVICE_CAPABILITIES_TYPE` = 1;
public const val `WCS_ALWAYS`: UInt = 2097152u;
public const val `WCS_DEFAULT`: Int = 0;
public typealias `WCS_DEVICE_CAPABILITIES_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WCS_DEVICE_MHC2_CAPABILITIES` (
    public var `Size`: UInt,
    public var `SupportsMhc2`: `windows_sys`.`core`.`BOOL`,
    public var `RegammaLutEntryCount`: UInt,
    public var `CscXyzMatrixRows`: UInt,
    public var `CscXyzMatrixColumns`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WCS_DEVICE_VCGT_CAPABILITIES` (
    public var `Size`: UInt,
    public var `SupportsVcgt`: `windows_sys`.`core`.`BOOL`,
)
public const val `WCS_ICCONLY`: Int = 65536;
public typealias `WCS_PROFILE_MANAGEMENT_SCOPE` = Int;
public const val `WCS_PROFILE_MANAGEMENT_SCOPE_CURRENT_USER`: `WCS_PROFILE_MANAGEMENT_SCOPE` = 1;
public const val `WCS_PROFILE_MANAGEMENT_SCOPE_SYSTEM_WIDE`: `WCS_PROFILE_MANAGEMENT_SCOPE` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `XYZCOLOR` (
    public var `X`: UShort,
    public var `Y`: UShort,
    public var `Z`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `XYZColorF` (
    public var `X`: Float,
    public var `Y`: Float,
    public var `Z`: Float,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `YxyCOLOR` (
    public var `Y`: UShort,
    public var `x`: UShort,
    public var `y`: UShort,
)
