// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mmdevapi.dll, ABI=system, export=ActivateAudioInterfaceAsync; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
public external fun `ActivateAudioInterfaceAsync`(`deviceinterfacepath` : `windows_sys`.`core`.`PCWSTR`, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `activationparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Com`.`StructuredStorage`.`PROPVARIANT`>?, `completionhandler` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `activationoperation` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=CoRegisterMessageFilter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoRegisterMessageFilter`(`lpmessagefilter` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lplpmessagefilter` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=windows.media.mediacontrol.dll, ABI=system, export=CreateCaptureAudioStateMonitor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateCaptureAudioStateMonitor`(`audiostatemonitor` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=windows.media.mediacontrol.dll, ABI=system, export=CreateCaptureAudioStateMonitorForCategory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateCaptureAudioStateMonitorForCategory`(`category` : `AUDIO_STREAM_CATEGORY`, `audiostatemonitor` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=windows.media.mediacontrol.dll, ABI=system, export=CreateCaptureAudioStateMonitorForCategoryAndDeviceId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateCaptureAudioStateMonitorForCategoryAndDeviceId`(`category` : `AUDIO_STREAM_CATEGORY`, `deviceid` : `windows_sys`.`core`.`PCWSTR`, `audiostatemonitor` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=windows.media.mediacontrol.dll, ABI=system, export=CreateCaptureAudioStateMonitorForCategoryAndDeviceRole; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateCaptureAudioStateMonitorForCategoryAndDeviceRole`(`category` : `AUDIO_STREAM_CATEGORY`, `role` : `ERole`, `audiostatemonitor` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=windows.media.mediacontrol.dll, ABI=system, export=CreateRenderAudioStateMonitor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateRenderAudioStateMonitor`(`audiostatemonitor` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=windows.media.mediacontrol.dll, ABI=system, export=CreateRenderAudioStateMonitorForCategory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateRenderAudioStateMonitorForCategory`(`category` : `AUDIO_STREAM_CATEGORY`, `audiostatemonitor` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=windows.media.mediacontrol.dll, ABI=system, export=CreateRenderAudioStateMonitorForCategoryAndDeviceId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateRenderAudioStateMonitorForCategoryAndDeviceId`(`category` : `AUDIO_STREAM_CATEGORY`, `deviceid` : `windows_sys`.`core`.`PCWSTR`, `audiostatemonitor` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=windows.media.mediacontrol.dll, ABI=system, export=CreateRenderAudioStateMonitorForCategoryAndDeviceRole; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateRenderAudioStateMonitorForCategoryAndDeviceRole`(`category` : `AUDIO_STREAM_CATEGORY`, `role` : `ERole`, `audiostatemonitor` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=PlaySoundA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PlaySoundA`(`pszsound` : `windows_sys`.`core`.`PCSTR`, `hmod` : `super`.`super`.`Foundation`.`HMODULE`, `fdwsound` : `SND_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=PlaySoundW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PlaySoundW`(`pszsound` : `windows_sys`.`core`.`PCWSTR`, `hmod` : `super`.`super`.`Foundation`.`HMODULE`, `fdwsound` : `SND_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmDriverAddA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmDriverAddA`(`phadid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HACMDRIVERID`>?, `hinstmodule` : `super`.`super`.`Foundation`.`HINSTANCE`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`, `dwpriority` : UInt, `fdwadd` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmDriverAddW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmDriverAddW`(`phadid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HACMDRIVERID`>?, `hinstmodule` : `super`.`super`.`Foundation`.`HINSTANCE`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`, `dwpriority` : UInt, `fdwadd` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmDriverClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmDriverClose`(`had` : `HACMDRIVER`, `fdwclose` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmDriverDetailsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `acmDriverDetailsA`(`hadid` : `HACMDRIVERID`, `padd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ACMDRIVERDETAILSA`>?, `fdwdetails` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmDriverDetailsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `acmDriverDetailsW`(`hadid` : `HACMDRIVERID`, `padd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ACMDRIVERDETAILSW`>?, `fdwdetails` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmDriverEnum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmDriverEnum`(`fncallback` : `ACMDRIVERENUMCB`, `dwinstance` : ULong, `fdwenum` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmDriverID; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmDriverID`(`hao` : `HACMOBJ`, `phadid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HACMDRIVERID`>?, `fdwdriverid` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmDriverMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmDriverMessage`(`had` : `HACMDRIVER`, `umsg` : UInt, `lparam1` : `super`.`super`.`Foundation`.`LPARAM`, `lparam2` : `super`.`super`.`Foundation`.`LPARAM`) : `super`.`super`.`Foundation`.`LRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmDriverOpen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmDriverOpen`(`phad` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HACMDRIVER`>?, `hadid` : `HACMDRIVERID`, `fdwopen` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmDriverPriority; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmDriverPriority`(`hadid` : `HACMDRIVERID`, `dwpriority` : UInt, `fdwpriority` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmDriverRemove; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmDriverRemove`(`hadid` : `HACMDRIVERID`, `fdwremove` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmFilterChooseA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmFilterChooseA`(`pafltrc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ACMFILTERCHOOSEA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmFilterChooseW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmFilterChooseW`(`pafltrc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ACMFILTERCHOOSEW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmFilterDetailsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmFilterDetailsA`(`had` : `HACMDRIVER`, `pafd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ACMFILTERDETAILSA`>?, `fdwdetails` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmFilterDetailsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmFilterDetailsW`(`had` : `HACMDRIVER`, `pafd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ACMFILTERDETAILSW`>?, `fdwdetails` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmFilterEnumA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmFilterEnumA`(`had` : `HACMDRIVER`, `pafd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ACMFILTERDETAILSA`>?, `fncallback` : `ACMFILTERENUMCBA`, `dwinstance` : ULong, `fdwenum` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmFilterEnumW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmFilterEnumW`(`had` : `HACMDRIVER`, `pafd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ACMFILTERDETAILSW`>?, `fncallback` : `ACMFILTERENUMCBW`, `dwinstance` : ULong, `fdwenum` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmFilterTagDetailsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmFilterTagDetailsA`(`had` : `HACMDRIVER`, `paftd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ACMFILTERTAGDETAILSA`>?, `fdwdetails` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmFilterTagDetailsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmFilterTagDetailsW`(`had` : `HACMDRIVER`, `paftd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ACMFILTERTAGDETAILSW`>?, `fdwdetails` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmFilterTagEnumA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmFilterTagEnumA`(`had` : `HACMDRIVER`, `paftd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ACMFILTERTAGDETAILSA`>?, `fncallback` : `ACMFILTERTAGENUMCBA`, `dwinstance` : ULong, `fdwenum` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmFilterTagEnumW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmFilterTagEnumW`(`had` : `HACMDRIVER`, `paftd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ACMFILTERTAGDETAILSW`>?, `fncallback` : `ACMFILTERTAGENUMCBW`, `dwinstance` : ULong, `fdwenum` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmFormatChooseA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmFormatChooseA`(`pafmtc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ACMFORMATCHOOSEA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmFormatChooseW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmFormatChooseW`(`pafmtc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ACMFORMATCHOOSEW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmFormatDetailsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmFormatDetailsA`(`had` : `HACMDRIVER`, `pafd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ACMFORMATDETAILSA`>?, `fdwdetails` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmFormatDetailsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmFormatDetailsW`(`had` : `HACMDRIVER`, `pafd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`tACMFORMATDETAILSW`>?, `fdwdetails` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmFormatEnumA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmFormatEnumA`(`had` : `HACMDRIVER`, `pafd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ACMFORMATDETAILSA`>?, `fncallback` : `ACMFORMATENUMCBA`, `dwinstance` : ULong, `fdwenum` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmFormatEnumW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmFormatEnumW`(`had` : `HACMDRIVER`, `pafd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`tACMFORMATDETAILSW`>?, `fncallback` : `ACMFORMATENUMCBW`, `dwinstance` : ULong, `fdwenum` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmFormatSuggest; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmFormatSuggest`(`had` : `HACMDRIVER`, `pwfxsrc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEFORMATEX`>?, `pwfxdst` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEFORMATEX`>?, `cbwfxdst` : UInt, `fdwsuggest` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmFormatTagDetailsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmFormatTagDetailsA`(`had` : `HACMDRIVER`, `paftd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ACMFORMATTAGDETAILSA`>?, `fdwdetails` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmFormatTagDetailsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmFormatTagDetailsW`(`had` : `HACMDRIVER`, `paftd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ACMFORMATTAGDETAILSW`>?, `fdwdetails` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmFormatTagEnumA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmFormatTagEnumA`(`had` : `HACMDRIVER`, `paftd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ACMFORMATTAGDETAILSA`>?, `fncallback` : `ACMFORMATTAGENUMCBA`, `dwinstance` : ULong, `fdwenum` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmFormatTagEnumW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmFormatTagEnumW`(`had` : `HACMDRIVER`, `paftd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ACMFORMATTAGDETAILSW`>?, `fncallback` : `ACMFORMATTAGENUMCBW`, `dwinstance` : ULong, `fdwenum` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmGetVersion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmGetVersion`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmMetrics; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmMetrics`(`hao` : `HACMOBJ`, `umetric` : UInt, `pmetric` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmStreamClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmStreamClose`(`has` : `HACMSTREAM`, `fdwclose` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmStreamConvert; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmStreamConvert`(`has` : `HACMSTREAM`, `pash` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ACMSTREAMHEADER`>?, `fdwconvert` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmStreamMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmStreamMessage`(`has` : `HACMSTREAM`, `umsg` : UInt, `lparam1` : `super`.`super`.`Foundation`.`LPARAM`, `lparam2` : `super`.`super`.`Foundation`.`LPARAM`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmStreamOpen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmStreamOpen`(`phas` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HACMSTREAM`>?, `had` : `HACMDRIVER`, `pwfxsrc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEFORMATEX`>?, `pwfxdst` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEFORMATEX`>?, `pwfltr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEFILTER`>?, `dwcallback` : ULong, `dwinstance` : ULong, `fdwopen` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmStreamPrepareHeader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmStreamPrepareHeader`(`has` : `HACMSTREAM`, `pash` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ACMSTREAMHEADER`>?, `fdwprepare` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmStreamReset; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmStreamReset`(`has` : `HACMSTREAM`, `fdwreset` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmStreamSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmStreamSize`(`has` : `HACMSTREAM`, `cbinput` : UInt, `pdwoutputbytes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `fdwsize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msacm32.dll, ABI=system, export=acmStreamUnprepareHeader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `acmStreamUnprepareHeader`(`has` : `HACMSTREAM`, `pash` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ACMSTREAMHEADER`>?, `fdwunprepare` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=auxGetDevCapsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `auxGetDevCapsA`(`udeviceid` : ULong, `pac` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AUXCAPSA`>?, `cbac` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=auxGetDevCapsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `auxGetDevCapsW`(`udeviceid` : ULong, `pac` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AUXCAPSW`>?, `cbac` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=auxGetNumDevs; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `auxGetNumDevs`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=auxGetVolume; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `auxGetVolume`(`udeviceid` : UInt, `pdwvolume` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=auxOutMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `auxOutMessage`(`udeviceid` : UInt, `umsg` : UInt, `dw1` : ULong, `dw2` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=auxSetVolume; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `auxSetVolume`(`udeviceid` : UInt, `dwvolume` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiConnect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiConnect`(`hmi` : `HMIDI`, `hmo` : `HMIDIOUT`, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiDisconnect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiDisconnect`(`hmi` : `HMIDI`, `hmo` : `HMIDIOUT`, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiInAddBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiInAddBuffer`(`hmi` : `HMIDIIN`, `pmh` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDIHDR`>?, `cbmh` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiInClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiInClose`(`hmi` : `HMIDIIN`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiInGetDevCapsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiInGetDevCapsA`(`udeviceid` : ULong, `pmic` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDIINCAPSA`>?, `cbmic` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiInGetDevCapsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiInGetDevCapsW`(`udeviceid` : ULong, `pmic` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDIINCAPSW`>?, `cbmic` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiInGetErrorTextA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiInGetErrorTextA`(`mmrerror` : UInt, `psztext` : `windows_sys`.`core`.`PSTR`, `cchtext` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiInGetErrorTextW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiInGetErrorTextW`(`mmrerror` : UInt, `psztext` : `windows_sys`.`core`.`PWSTR`, `cchtext` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiInGetID; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiInGetID`(`hmi` : `HMIDIIN`, `pudeviceid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiInGetNumDevs; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiInGetNumDevs`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiInMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiInMessage`(`hmi` : `HMIDIIN`, `umsg` : UInt, `dw1` : ULong, `dw2` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiInOpen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiInOpen`(`phmi` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HMIDIIN`>?, `udeviceid` : UInt, `dwcallback` : ULong, `dwinstance` : ULong, `fdwopen` : `MIDI_WAVE_OPEN_TYPE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiInPrepareHeader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiInPrepareHeader`(`hmi` : `HMIDIIN`, `pmh` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDIHDR`>?, `cbmh` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiInReset; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiInReset`(`hmi` : `HMIDIIN`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiInStart; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiInStart`(`hmi` : `HMIDIIN`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiInStop; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiInStop`(`hmi` : `HMIDIIN`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiInUnprepareHeader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiInUnprepareHeader`(`hmi` : `HMIDIIN`, `pmh` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDIHDR`>?, `cbmh` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiOutCacheDrumPatches; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiOutCacheDrumPatches`(`hmo` : `HMIDIOUT`, `upatch` : UInt, `pwkya` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `fucache` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiOutCachePatches; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiOutCachePatches`(`hmo` : `HMIDIOUT`, `ubank` : UInt, `pwpa` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `fucache` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiOutClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiOutClose`(`hmo` : `HMIDIOUT`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiOutGetDevCapsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiOutGetDevCapsA`(`udeviceid` : ULong, `pmoc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDIOUTCAPSA`>?, `cbmoc` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiOutGetDevCapsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiOutGetDevCapsW`(`udeviceid` : ULong, `pmoc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDIOUTCAPSW`>?, `cbmoc` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiOutGetErrorTextA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiOutGetErrorTextA`(`mmrerror` : UInt, `psztext` : `windows_sys`.`core`.`PSTR`, `cchtext` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiOutGetErrorTextW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiOutGetErrorTextW`(`mmrerror` : UInt, `psztext` : `windows_sys`.`core`.`PWSTR`, `cchtext` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiOutGetID; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiOutGetID`(`hmo` : `HMIDIOUT`, `pudeviceid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiOutGetNumDevs; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiOutGetNumDevs`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiOutGetVolume; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiOutGetVolume`(`hmo` : `HMIDIOUT`, `pdwvolume` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiOutLongMsg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiOutLongMsg`(`hmo` : `HMIDIOUT`, `pmh` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIDIHDR`>?, `cbmh` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiOutMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiOutMessage`(`hmo` : `HMIDIOUT`, `umsg` : UInt, `dw1` : ULong, `dw2` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiOutOpen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiOutOpen`(`phmo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HMIDIOUT`>?, `udeviceid` : UInt, `dwcallback` : ULong, `dwinstance` : ULong, `fdwopen` : `MIDI_WAVE_OPEN_TYPE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiOutPrepareHeader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiOutPrepareHeader`(`hmo` : `HMIDIOUT`, `pmh` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDIHDR`>?, `cbmh` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiOutReset; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiOutReset`(`hmo` : `HMIDIOUT`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiOutSetVolume; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiOutSetVolume`(`hmo` : `HMIDIOUT`, `dwvolume` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiOutShortMsg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiOutShortMsg`(`hmo` : `HMIDIOUT`, `dwmsg` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiOutUnprepareHeader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiOutUnprepareHeader`(`hmo` : `HMIDIOUT`, `pmh` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDIHDR`>?, `cbmh` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiStreamClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiStreamClose`(`hms` : `HMIDISTRM`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiStreamOpen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiStreamOpen`(`phms` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HMIDISTRM`>?, `pudeviceid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `cmidi` : UInt, `dwcallback` : ULong, `dwinstance` : ULong, `fdwopen` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiStreamOut; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiStreamOut`(`hms` : `HMIDISTRM`, `pmh` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDIHDR`>?, `cbmh` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiStreamPause; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiStreamPause`(`hms` : `HMIDISTRM`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiStreamPosition; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiStreamPosition`(`hms` : `HMIDISTRM`, `lpmmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`MMTIME`>?, `cbmmt` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiStreamProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiStreamProperty`(`hms` : `HMIDISTRM`, `lppropdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwproperty` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiStreamRestart; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiStreamRestart`(`hms` : `HMIDISTRM`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=midiStreamStop; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `midiStreamStop`(`hms` : `HMIDISTRM`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=mixerClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `mixerClose`(`hmx` : `HMIXER`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=mixerGetControlDetailsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `mixerGetControlDetailsA`(`hmxobj` : `HMIXEROBJ`, `pmxcd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIXERCONTROLDETAILS`>?, `fdwdetails` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=mixerGetControlDetailsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `mixerGetControlDetailsW`(`hmxobj` : `HMIXEROBJ`, `pmxcd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIXERCONTROLDETAILS`>?, `fdwdetails` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=mixerGetDevCapsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `mixerGetDevCapsA`(`umxid` : ULong, `pmxcaps` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIXERCAPSA`>?, `cbmxcaps` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=mixerGetDevCapsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `mixerGetDevCapsW`(`umxid` : ULong, `pmxcaps` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIXERCAPSW`>?, `cbmxcaps` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=mixerGetID; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `mixerGetID`(`hmxobj` : `HMIXEROBJ`, `pumxid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `fdwid` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=mixerGetLineControlsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `mixerGetLineControlsA`(`hmxobj` : `HMIXEROBJ`, `pmxlc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIXERLINECONTROLSA`>?, `fdwcontrols` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=mixerGetLineControlsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `mixerGetLineControlsW`(`hmxobj` : `HMIXEROBJ`, `pmxlc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIXERLINECONTROLSW`>?, `fdwcontrols` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=mixerGetLineInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `mixerGetLineInfoA`(`hmxobj` : `HMIXEROBJ`, `pmxl` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIXERLINEA`>?, `fdwinfo` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=mixerGetLineInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `mixerGetLineInfoW`(`hmxobj` : `HMIXEROBJ`, `pmxl` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIXERLINEW`>?, `fdwinfo` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=mixerGetNumDevs; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `mixerGetNumDevs`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=mixerMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `mixerMessage`(`hmx` : `HMIXER`, `umsg` : UInt, `dwparam1` : ULong, `dwparam2` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=mixerOpen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `mixerOpen`(`phmx` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HMIXER`>?, `umxid` : UInt, `dwcallback` : ULong, `dwinstance` : ULong, `fdwopen` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=mixerSetControlDetails; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `mixerSetControlDetails`(`hmxobj` : `HMIXEROBJ`, `pmxcd` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIXERCONTROLDETAILS`>?, `fdwdetails` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=sndPlaySoundA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `sndPlaySoundA`(`pszsound` : `windows_sys`.`core`.`PCSTR`, `fusound` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=sndPlaySoundW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `sndPlaySoundW`(`pszsound` : `windows_sys`.`core`.`PCWSTR`, `fusound` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveInAddBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveInAddBuffer`(`hwi` : `HWAVEIN`, `pwh` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEHDR`>?, `cbwh` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveInClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveInClose`(`hwi` : `HWAVEIN`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveInGetDevCapsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveInGetDevCapsA`(`udeviceid` : ULong, `pwic` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEINCAPSA`>?, `cbwic` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveInGetDevCapsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveInGetDevCapsW`(`udeviceid` : ULong, `pwic` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEINCAPSW`>?, `cbwic` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveInGetErrorTextA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveInGetErrorTextA`(`mmrerror` : UInt, `psztext` : `windows_sys`.`core`.`PSTR`, `cchtext` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveInGetErrorTextW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveInGetErrorTextW`(`mmrerror` : UInt, `psztext` : `windows_sys`.`core`.`PWSTR`, `cchtext` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveInGetID; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveInGetID`(`hwi` : `HWAVEIN`, `pudeviceid` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveInGetNumDevs; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveInGetNumDevs`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveInGetPosition; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveInGetPosition`(`hwi` : `HWAVEIN`, `pmmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`MMTIME`>?, `cbmmt` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveInMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveInMessage`(`hwi` : `HWAVEIN`, `umsg` : UInt, `dw1` : ULong, `dw2` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveInOpen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveInOpen`(`phwi` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HWAVEIN`>?, `udeviceid` : UInt, `pwfx` : /* Rust *const */ kotlinx.cinterop.CPointer<`WAVEFORMATEX`>?, `dwcallback` : ULong, `dwinstance` : ULong, `fdwopen` : `MIDI_WAVE_OPEN_TYPE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveInPrepareHeader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveInPrepareHeader`(`hwi` : `HWAVEIN`, `pwh` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEHDR`>?, `cbwh` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveInReset; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveInReset`(`hwi` : `HWAVEIN`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveInStart; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveInStart`(`hwi` : `HWAVEIN`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveInStop; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveInStop`(`hwi` : `HWAVEIN`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveInUnprepareHeader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveInUnprepareHeader`(`hwi` : `HWAVEIN`, `pwh` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEHDR`>?, `cbwh` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveOutBreakLoop; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveOutBreakLoop`(`hwo` : `HWAVEOUT`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveOutClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveOutClose`(`hwo` : `HWAVEOUT`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveOutGetDevCapsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveOutGetDevCapsA`(`udeviceid` : ULong, `pwoc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEOUTCAPSA`>?, `cbwoc` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveOutGetDevCapsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveOutGetDevCapsW`(`udeviceid` : ULong, `pwoc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEOUTCAPSW`>?, `cbwoc` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveOutGetErrorTextA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveOutGetErrorTextA`(`mmrerror` : UInt, `psztext` : `windows_sys`.`core`.`PSTR`, `cchtext` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveOutGetErrorTextW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveOutGetErrorTextW`(`mmrerror` : UInt, `psztext` : `windows_sys`.`core`.`PWSTR`, `cchtext` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveOutGetID; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveOutGetID`(`hwo` : `HWAVEOUT`, `pudeviceid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveOutGetNumDevs; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveOutGetNumDevs`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveOutGetPitch; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveOutGetPitch`(`hwo` : `HWAVEOUT`, `pdwpitch` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveOutGetPlaybackRate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveOutGetPlaybackRate`(`hwo` : `HWAVEOUT`, `pdwrate` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveOutGetPosition; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveOutGetPosition`(`hwo` : `HWAVEOUT`, `pmmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`MMTIME`>?, `cbmmt` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveOutGetVolume; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveOutGetVolume`(`hwo` : `HWAVEOUT`, `pdwvolume` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveOutMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveOutMessage`(`hwo` : `HWAVEOUT`, `umsg` : UInt, `dw1` : ULong, `dw2` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveOutOpen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveOutOpen`(`phwo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HWAVEOUT`>?, `udeviceid` : UInt, `pwfx` : /* Rust *const */ kotlinx.cinterop.CPointer<`WAVEFORMATEX`>?, `dwcallback` : ULong, `dwinstance` : ULong, `fdwopen` : `MIDI_WAVE_OPEN_TYPE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveOutPause; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveOutPause`(`hwo` : `HWAVEOUT`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveOutPrepareHeader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveOutPrepareHeader`(`hwo` : `HWAVEOUT`, `pwh` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEHDR`>?, `cbwh` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveOutReset; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveOutReset`(`hwo` : `HWAVEOUT`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveOutRestart; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveOutRestart`(`hwo` : `HWAVEOUT`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveOutSetPitch; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveOutSetPitch`(`hwo` : `HWAVEOUT`, `dwpitch` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveOutSetPlaybackRate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveOutSetPlaybackRate`(`hwo` : `HWAVEOUT`, `dwrate` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveOutSetVolume; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveOutSetVolume`(`hwo` : `HWAVEOUT`, `dwvolume` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveOutUnprepareHeader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveOutUnprepareHeader`(`hwo` : `HWAVEOUT`, `pwh` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEHDR`>?, `cbwh` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=waveOutWrite; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `waveOutWrite`(`hwo` : `HWAVEOUT`, `pwh` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEHDR`>?, `cbwh` : UInt) : UInt
public const val `ACMDM_DRIVER_ABOUT`: UInt = 24587u;
public const val `ACMDM_DRIVER_DETAILS`: UInt = 24586u;
public const val `ACMDM_DRIVER_NOTIFY`: UInt = 24577u;
public const val `ACMDM_FILTERTAG_DETAILS`: UInt = 24626u;
public const val `ACMDM_FILTER_DETAILS`: UInt = 24627u;
public const val `ACMDM_FORMATTAG_DETAILS`: UInt = 24601u;
public const val `ACMDM_FORMAT_DETAILS`: UInt = 24602u;
public const val `ACMDM_FORMAT_SUGGEST`: UInt = 24603u;
public const val `ACMDM_HARDWARE_WAVE_CAPS_INPUT`: UInt = 24596u;
public const val `ACMDM_HARDWARE_WAVE_CAPS_OUTPUT`: UInt = 24597u;
public const val `ACMDM_RESERVED_HIGH`: UInt = 28671u;
public const val `ACMDM_RESERVED_LOW`: UInt = 24576u;
public const val `ACMDM_STREAM_CLOSE`: UInt = 24653u;
public const val `ACMDM_STREAM_CONVERT`: UInt = 24655u;
public const val `ACMDM_STREAM_OPEN`: UInt = 24652u;
public const val `ACMDM_STREAM_PREPARE`: UInt = 24657u;
public const val `ACMDM_STREAM_RESET`: UInt = 24656u;
public const val `ACMDM_STREAM_SIZE`: UInt = 24654u;
public const val `ACMDM_STREAM_UNPREPARE`: UInt = 24658u;
public const val `ACMDM_STREAM_UPDATE`: UInt = 24659u;
public const val `ACMDM_USER`: UInt = 16384u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 80 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 512 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACMDRIVERDETAILSA` (
    public var `cbStruct`: UInt,
    public var `fccType`: UInt,
    public var `fccComp`: UInt,
    public var `wMid`: UShort,
    public var `wPid`: UShort,
    public var `vdwACM`: UInt,
    public var `vdwDriver`: UInt,
    public var `fdwSupport`: UInt,
    public var `cFormatTags`: UInt,
    public var `cFilterTags`: UInt,
    public var `hicon`: `super`.`super`.`UI`.`WindowsAndMessaging`.`HICON`,
    public var `szShortName`: ByteArray,
    public var `szLongName`: ByteArray,
    public var `szCopyright`: ByteArray,
    public var `szLicensing`: ByteArray,
    public var `szFeatures`: ByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ACMDRIVERDETAILSA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]

    public fun `ACMDRIVERDETAILSA`.Companion.`default`() : `ACMDRIVERDETAILSA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 80 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 512 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACMDRIVERDETAILSW` (
    public var `cbStruct`: UInt,
    public var `fccType`: UInt,
    public var `fccComp`: UInt,
    public var `wMid`: UShort,
    public var `wPid`: UShort,
    public var `vdwACM`: UInt,
    public var `vdwDriver`: UInt,
    public var `fdwSupport`: UInt,
    public var `cFormatTags`: UInt,
    public var `cFilterTags`: UInt,
    public var `hicon`: `super`.`super`.`UI`.`WindowsAndMessaging`.`HICON`,
    public var `szShortName`: UShortArray,
    public var `szLongName`: UShortArray,
    public var `szCopyright`: UShortArray,
    public var `szLicensing`: UShortArray,
    public var `szFeatures`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ACMDRIVERDETAILSW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]

    public fun `ACMDRIVERDETAILSW`.Companion.`default`() : `ACMDRIVERDETAILSW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `ACMDRIVERDETAILS_COPYRIGHT_CHARS`: UInt = 80u;
public const val `ACMDRIVERDETAILS_FEATURES_CHARS`: UInt = 512u;
public const val `ACMDRIVERDETAILS_LICENSING_CHARS`: UInt = 128u;
public const val `ACMDRIVERDETAILS_LONGNAME_CHARS`: UInt = 128u;
public const val `ACMDRIVERDETAILS_SHORTNAME_CHARS`: UInt = 32u;
public const val `ACMDRIVERDETAILS_SUPPORTF_ASYNC`: Int = 16;
public const val `ACMDRIVERDETAILS_SUPPORTF_CODEC`: Int = 1;
public const val `ACMDRIVERDETAILS_SUPPORTF_CONVERTER`: Int = 2;
public const val `ACMDRIVERDETAILS_SUPPORTF_DISABLED`: Int = -2147483648;
public const val `ACMDRIVERDETAILS_SUPPORTF_FILTER`: Int = 4;
public const val `ACMDRIVERDETAILS_SUPPORTF_HARDWARE`: Int = 8;
public const val `ACMDRIVERDETAILS_SUPPORTF_LOCAL`: Int = 1073741824;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `ACMDRIVERENUMCB` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`HACMDRIVERID`, ULong, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACMDRVFORMATSUGGEST` (
    public var `cbStruct`: UInt,
    public var `fdwSuggest`: UInt,
    public var `pwfxSrc`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEFORMATEX`>?,
    public var `cbwfxSrc`: UInt,
    public var `pwfxDst`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEFORMATEX`>?,
    public var `cbwfxDst`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ACMDRVFORMATSUGGEST`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ACMDRVFORMATSUGGEST`.Companion.`default`() : `ACMDRVFORMATSUGGEST` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACMDRVOPENDESCA` (
    public var `cbStruct`: UInt,
    public var `fccType`: UInt,
    public var `fccComp`: UInt,
    public var `dwVersion`: UInt,
    public var `dwFlags`: UInt,
    public var `dwError`: UInt,
    public var `pszSectionName`: `windows_sys`.`core`.`PCSTR`,
    public var `pszAliasName`: `windows_sys`.`core`.`PCSTR`,
    public var `dnDevNode`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ACMDRVOPENDESCA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ACMDRVOPENDESCA`.Companion.`default`() : `ACMDRVOPENDESCA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACMDRVOPENDESCW` (
    public var `cbStruct`: UInt,
    public var `fccType`: UInt,
    public var `fccComp`: UInt,
    public var `dwVersion`: UInt,
    public var `dwFlags`: UInt,
    public var `dwError`: UInt,
    public var `pszSectionName`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszAliasName`: `windows_sys`.`core`.`PCWSTR`,
    public var `dnDevNode`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ACMDRVOPENDESCW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ACMDRVOPENDESCW`.Companion.`default`() : `ACMDRVOPENDESCW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACMDRVSTREAMHEADER` (
    public var `cbStruct`: UInt,
    public var `fdwStatus`: UInt,
    public var `dwUser`: ULong,
    public var `pbSrc`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbSrcLength`: UInt,
    public var `cbSrcLengthUsed`: UInt,
    public var `dwSrcUser`: ULong,
    public var `pbDst`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbDstLength`: UInt,
    public var `cbDstLengthUsed`: UInt,
    public var `dwDstUser`: ULong,
    public var `fdwConvert`: UInt,
    public var `padshNext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ACMDRVSTREAMHEADER`>?,
    public var `fdwDriver`: UInt,
    public var `dwDriver`: ULong,
    public var `fdwPrepared`: UInt,
    public var `dwPrepared`: ULong,
    public var `pbPreparedSrc`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbPreparedSrcLength`: UInt,
    public var `pbPreparedDst`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbPreparedDstLength`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ACMDRVSTREAMHEADER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ACMDRVSTREAMHEADER`.Companion.`default`() : `ACMDRVSTREAMHEADER` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACMDRVSTREAMINSTANCE` (
    public var `cbStruct`: UInt,
    public var `pwfxSrc`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEFORMATEX`>?,
    public var `pwfxDst`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEFORMATEX`>?,
    public var `pwfltr`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEFILTER`>?,
    public var `dwCallback`: ULong,
    public var `dwInstance`: ULong,
    public var `fdwOpen`: UInt,
    public var `fdwDriver`: UInt,
    public var `dwDriver`: ULong,
    public var `has`: `HACMSTREAM`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ACMDRVSTREAMINSTANCE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ACMDRVSTREAMINSTANCE`.Companion.`default`() : `ACMDRVSTREAMINSTANCE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ACMDRVSTREAMSIZE` (
    public var `cbStruct`: UInt,
    public var `fdwSize`: UInt,
    public var `cbSrcLength`: UInt,
    public var `cbDstLength`: UInt,
)
public const val `ACMERR_BASE`: UInt = 512u;
public const val `ACMERR_BUSY`: UInt = 513u;
public const val `ACMERR_CANCELED`: UInt = 515u;
public const val `ACMERR_NOTPOSSIBLE`: UInt = 512u;
public const val `ACMERR_UNPREPARED`: UInt = 514u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 48 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACMFILTERCHOOSEA` (
    public var `cbStruct`: UInt,
    public var `fdwStyle`: UInt,
    public var `hwndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `pwfltr`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEFILTER`>?,
    public var `cbwfltr`: UInt,
    public var `pszTitle`: `windows_sys`.`core`.`PCSTR`,
    public var `szFilterTag`: ByteArray,
    public var `szFilter`: ByteArray,
    public var `pszName`: `windows_sys`.`core`.`PSTR`,
    public var `cchName`: UInt,
    public var `fdwEnum`: UInt,
    public var `pwfltrEnum`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEFILTER`>?,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `pszTemplateName`: `windows_sys`.`core`.`PCSTR`,
    public var `lCustData`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `pfnHook`: `ACMFILTERCHOOSEHOOKPROCA`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ACMFILTERCHOOSEA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ACMFILTERCHOOSEA`.Companion.`default`() : `ACMFILTERCHOOSEA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `ACMFILTERCHOOSEHOOKPROCA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, UInt, `super`.`super`.`Foundation`.`WPARAM`, `super`.`super`.`Foundation`.`LPARAM`) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `ACMFILTERCHOOSEHOOKPROCW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, UInt, `super`.`super`.`Foundation`.`WPARAM`, `super`.`super`.`Foundation`.`LPARAM`) -> UInt>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 48 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACMFILTERCHOOSEW` (
    public var `cbStruct`: UInt,
    public var `fdwStyle`: UInt,
    public var `hwndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `pwfltr`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEFILTER`>?,
    public var `cbwfltr`: UInt,
    public var `pszTitle`: `windows_sys`.`core`.`PCWSTR`,
    public var `szFilterTag`: UShortArray,
    public var `szFilter`: UShortArray,
    public var `pszName`: `windows_sys`.`core`.`PWSTR`,
    public var `cchName`: UInt,
    public var `fdwEnum`: UInt,
    public var `pwfltrEnum`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEFILTER`>?,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `pszTemplateName`: `windows_sys`.`core`.`PCWSTR`,
    public var `lCustData`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `pfnHook`: `ACMFILTERCHOOSEHOOKPROCW`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ACMFILTERCHOOSEW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ACMFILTERCHOOSEW`.Companion.`default`() : `ACMFILTERCHOOSEW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `ACMFILTERCHOOSE_STYLEF_CONTEXTHELP`: Int = 128;
public const val `ACMFILTERCHOOSE_STYLEF_ENABLEHOOK`: Int = 8;
public const val `ACMFILTERCHOOSE_STYLEF_ENABLETEMPLATE`: Int = 16;
public const val `ACMFILTERCHOOSE_STYLEF_ENABLETEMPLATEHANDLE`: Int = 32;
public const val `ACMFILTERCHOOSE_STYLEF_INITTOFILTERSTRUCT`: Int = 64;
public const val `ACMFILTERCHOOSE_STYLEF_SHOWHELP`: Int = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACMFILTERDETAILSA` (
    public var `cbStruct`: UInt,
    public var `dwFilterIndex`: UInt,
    public var `dwFilterTag`: UInt,
    public var `fdwSupport`: UInt,
    public var `pwfltr`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEFILTER`>?,
    public var `cbwfltr`: UInt,
    public var `szFilter`: ByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ACMFILTERDETAILSA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ACMFILTERDETAILSA`.Companion.`default`() : `ACMFILTERDETAILSA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACMFILTERDETAILSW` (
    public var `cbStruct`: UInt,
    public var `dwFilterIndex`: UInt,
    public var `dwFilterTag`: UInt,
    public var `fdwSupport`: UInt,
    public var `pwfltr`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEFILTER`>?,
    public var `cbwfltr`: UInt,
    public var `szFilter`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ACMFILTERDETAILSW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ACMFILTERDETAILSW`.Companion.`default`() : `ACMFILTERDETAILSW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `ACMFILTERDETAILS_FILTER_CHARS`: UInt = 128u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `ACMFILTERENUMCBA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`HACMDRIVERID`, /* Rust *mut */ kotlinx.cinterop.CPointer<`ACMFILTERDETAILSA`>?, ULong, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `ACMFILTERENUMCBW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`HACMDRIVERID`, /* Rust *mut */ kotlinx.cinterop.CPointer<`ACMFILTERDETAILSW`>?, ULong, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 48 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACMFILTERTAGDETAILSA` (
    public var `cbStruct`: UInt,
    public var `dwFilterTagIndex`: UInt,
    public var `dwFilterTag`: UInt,
    public var `cbFilterSize`: UInt,
    public var `fdwSupport`: UInt,
    public var `cStandardFilters`: UInt,
    public var `szFilterTag`: ByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ACMFILTERTAGDETAILSA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ACMFILTERTAGDETAILSA`.Companion.`default`() : `ACMFILTERTAGDETAILSA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 48 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACMFILTERTAGDETAILSW` (
    public var `cbStruct`: UInt,
    public var `dwFilterTagIndex`: UInt,
    public var `dwFilterTag`: UInt,
    public var `cbFilterSize`: UInt,
    public var `fdwSupport`: UInt,
    public var `cStandardFilters`: UInt,
    public var `szFilterTag`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ACMFILTERTAGDETAILSW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ACMFILTERTAGDETAILSW`.Companion.`default`() : `ACMFILTERTAGDETAILSW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `ACMFILTERTAGDETAILS_FILTERTAG_CHARS`: UInt = 48u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `ACMFILTERTAGENUMCBA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`HACMDRIVERID`, /* Rust *mut */ kotlinx.cinterop.CPointer<`ACMFILTERTAGDETAILSA`>?, ULong, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `ACMFILTERTAGENUMCBW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`HACMDRIVERID`, /* Rust *mut */ kotlinx.cinterop.CPointer<`ACMFILTERTAGDETAILSW`>?, ULong, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 48 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACMFORMATCHOOSEA` (
    public var `cbStruct`: UInt,
    public var `fdwStyle`: UInt,
    public var `hwndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `pwfx`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEFORMATEX`>?,
    public var `cbwfx`: UInt,
    public var `pszTitle`: `windows_sys`.`core`.`PCSTR`,
    public var `szFormatTag`: ByteArray,
    public var `szFormat`: ByteArray,
    public var `pszName`: `windows_sys`.`core`.`PSTR`,
    public var `cchName`: UInt,
    public var `fdwEnum`: UInt,
    public var `pwfxEnum`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEFORMATEX`>?,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `pszTemplateName`: `windows_sys`.`core`.`PCSTR`,
    public var `lCustData`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `pfnHook`: `ACMFORMATCHOOSEHOOKPROCA`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ACMFORMATCHOOSEA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ACMFORMATCHOOSEA`.Companion.`default`() : `ACMFORMATCHOOSEA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `ACMFORMATCHOOSEHOOKPROCA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, UInt, `super`.`super`.`Foundation`.`WPARAM`, `super`.`super`.`Foundation`.`LPARAM`) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `ACMFORMATCHOOSEHOOKPROCW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, UInt, `super`.`super`.`Foundation`.`WPARAM`, `super`.`super`.`Foundation`.`LPARAM`) -> UInt>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 48 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACMFORMATCHOOSEW` (
    public var `cbStruct`: UInt,
    public var `fdwStyle`: UInt,
    public var `hwndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `pwfx`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEFORMATEX`>?,
    public var `cbwfx`: UInt,
    public var `pszTitle`: `windows_sys`.`core`.`PCWSTR`,
    public var `szFormatTag`: UShortArray,
    public var `szFormat`: UShortArray,
    public var `pszName`: `windows_sys`.`core`.`PWSTR`,
    public var `cchName`: UInt,
    public var `fdwEnum`: UInt,
    public var `pwfxEnum`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEFORMATEX`>?,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `pszTemplateName`: `windows_sys`.`core`.`PCWSTR`,
    public var `lCustData`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `pfnHook`: `ACMFORMATCHOOSEHOOKPROCW`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ACMFORMATCHOOSEW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ACMFORMATCHOOSEW`.Companion.`default`() : `ACMFORMATCHOOSEW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `ACMFORMATCHOOSE_STYLEF_CONTEXTHELP`: Int = 128;
public const val `ACMFORMATCHOOSE_STYLEF_ENABLEHOOK`: Int = 8;
public const val `ACMFORMATCHOOSE_STYLEF_ENABLETEMPLATE`: Int = 16;
public const val `ACMFORMATCHOOSE_STYLEF_ENABLETEMPLATEHANDLE`: Int = 32;
public const val `ACMFORMATCHOOSE_STYLEF_INITTOWFXSTRUCT`: Int = 64;
public const val `ACMFORMATCHOOSE_STYLEF_SHOWHELP`: Int = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACMFORMATDETAILSA` (
    public var `cbStruct`: UInt,
    public var `dwFormatIndex`: UInt,
    public var `dwFormatTag`: UInt,
    public var `fdwSupport`: UInt,
    public var `pwfx`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEFORMATEX`>?,
    public var `cbwfx`: UInt,
    public var `szFormat`: ByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ACMFORMATDETAILSA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ACMFORMATDETAILSA`.Companion.`default`() : `ACMFORMATDETAILSA` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `ACMFORMATDETAILS_FORMAT_CHARS`: UInt = 128u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `ACMFORMATENUMCBA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`HACMDRIVERID`, /* Rust *mut */ kotlinx.cinterop.CPointer<`ACMFORMATDETAILSA`>?, ULong, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `ACMFORMATENUMCBW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`HACMDRIVERID`, /* Rust *mut */ kotlinx.cinterop.CPointer<`tACMFORMATDETAILSW`>?, ULong, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 48 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACMFORMATTAGDETAILSA` (
    public var `cbStruct`: UInt,
    public var `dwFormatTagIndex`: UInt,
    public var `dwFormatTag`: UInt,
    public var `cbFormatSize`: UInt,
    public var `fdwSupport`: UInt,
    public var `cStandardFormats`: UInt,
    public var `szFormatTag`: ByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ACMFORMATTAGDETAILSA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ACMFORMATTAGDETAILSA`.Companion.`default`() : `ACMFORMATTAGDETAILSA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 48 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACMFORMATTAGDETAILSW` (
    public var `cbStruct`: UInt,
    public var `dwFormatTagIndex`: UInt,
    public var `dwFormatTag`: UInt,
    public var `cbFormatSize`: UInt,
    public var `fdwSupport`: UInt,
    public var `cStandardFormats`: UInt,
    public var `szFormatTag`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ACMFORMATTAGDETAILSW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ACMFORMATTAGDETAILSW`.Companion.`default`() : `ACMFORMATTAGDETAILSW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `ACMFORMATTAGDETAILS_FORMATTAG_CHARS`: UInt = 48u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `ACMFORMATTAGENUMCBA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`HACMDRIVERID`, /* Rust *mut */ kotlinx.cinterop.CPointer<`ACMFORMATTAGDETAILSA`>?, ULong, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `ACMFORMATTAGENUMCBW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`HACMDRIVERID`, /* Rust *mut */ kotlinx.cinterop.CPointer<`ACMFORMATTAGDETAILSW`>?, ULong, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `ACMHELPMSGCONTEXTHELP`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("acmchoose_contexthelp");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `ACMHELPMSGCONTEXTHELPA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("acmchoose_contexthelp");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `ACMHELPMSGCONTEXTHELPW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("acmchoose_contexthelp");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `ACMHELPMSGCONTEXTMENU`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("acmchoose_contextmenu");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `ACMHELPMSGCONTEXTMENUA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("acmchoose_contextmenu");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `ACMHELPMSGCONTEXTMENUW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("acmchoose_contextmenu");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `ACMHELPMSGSTRING`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("acmchoose_help");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `ACMHELPMSGSTRINGA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("acmchoose_help");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `ACMHELPMSGSTRINGW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("acmchoose_help");
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 10 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACMSTREAMHEADER` (
    public var `cbStruct`: UInt,
    public var `fdwStatus`: UInt,
    public var `dwUser`: ULong,
    public var `pbSrc`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbSrcLength`: UInt,
    public var `cbSrcLengthUsed`: UInt,
    public var `dwSrcUser`: ULong,
    public var `pbDst`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbDstLength`: UInt,
    public var `cbDstLengthUsed`: UInt,
    public var `dwDstUser`: ULong,
    public var `dwReservedDriver`: UIntArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ACMSTREAMHEADER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]

    public fun `ACMSTREAMHEADER`.Companion.`default`() : `ACMSTREAMHEADER` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 15 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACMSTREAMHEADER` (
    public var `cbStruct`: UInt,
    public var `fdwStatus`: UInt,
    public var `dwUser`: ULong,
    public var `pbSrc`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbSrcLength`: UInt,
    public var `cbSrcLengthUsed`: UInt,
    public var `dwSrcUser`: ULong,
    public var `pbDst`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbDstLength`: UInt,
    public var `cbDstLengthUsed`: UInt,
    public var `dwDstUser`: ULong,
    public var `dwReservedDriver`: UIntArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ACMSTREAMHEADER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]

    public fun `ACMSTREAMHEADER`.Companion.`default`() : `ACMSTREAMHEADER` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `ACMSTREAMHEADER_STATUSF_DONE`: Int = 65536;
public const val `ACMSTREAMHEADER_STATUSF_INQUEUE`: Int = 1048576;
public const val `ACMSTREAMHEADER_STATUSF_PREPARED`: Int = 131072;
public const val `ACM_DRIVERADDF_FUNCTION`: Int = 3;
public const val `ACM_DRIVERADDF_GLOBAL`: Int = 8;
public const val `ACM_DRIVERADDF_LOCAL`: Int = 0;
public const val `ACM_DRIVERADDF_NAME`: Int = 1;
public const val `ACM_DRIVERADDF_NOTIFYHWND`: Int = 4;
public const val `ACM_DRIVERADDF_TYPEMASK`: Int = 7;
public const val `ACM_DRIVERENUMF_DISABLED`: Int = -2147483648;
public const val `ACM_DRIVERENUMF_NOLOCAL`: Int = 1073741824;
public const val `ACM_DRIVERPRIORITYF_ABLEMASK`: Int = 3;
public const val `ACM_DRIVERPRIORITYF_BEGIN`: Int = 65536;
public const val `ACM_DRIVERPRIORITYF_DEFERMASK`: Int = 196608;
public const val `ACM_DRIVERPRIORITYF_DISABLE`: Int = 2;
public const val `ACM_DRIVERPRIORITYF_ENABLE`: Int = 1;
public const val `ACM_DRIVERPRIORITYF_END`: Int = 131072;
public const val `ACM_FILTERDETAILSF_FILTER`: Int = 1;
public const val `ACM_FILTERDETAILSF_INDEX`: Int = 0;
public const val `ACM_FILTERDETAILSF_QUERYMASK`: Int = 15;
public const val `ACM_FILTERENUMF_DWFILTERTAG`: Int = 65536;
public const val `ACM_FILTERTAGDETAILSF_FILTERTAG`: Int = 1;
public const val `ACM_FILTERTAGDETAILSF_INDEX`: Int = 0;
public const val `ACM_FILTERTAGDETAILSF_LARGESTSIZE`: Int = 2;
public const val `ACM_FILTERTAGDETAILSF_QUERYMASK`: Int = 15;
public const val `ACM_FORMATDETAILSF_FORMAT`: Int = 1;
public const val `ACM_FORMATDETAILSF_INDEX`: Int = 0;
public const val `ACM_FORMATDETAILSF_QUERYMASK`: Int = 15;
public const val `ACM_FORMATENUMF_CONVERT`: Int = 1048576;
public const val `ACM_FORMATENUMF_HARDWARE`: Int = 4194304;
public const val `ACM_FORMATENUMF_INPUT`: Int = 8388608;
public const val `ACM_FORMATENUMF_NCHANNELS`: Int = 131072;
public const val `ACM_FORMATENUMF_NSAMPLESPERSEC`: Int = 262144;
public const val `ACM_FORMATENUMF_OUTPUT`: Int = 16777216;
public const val `ACM_FORMATENUMF_SUGGEST`: Int = 2097152;
public const val `ACM_FORMATENUMF_WBITSPERSAMPLE`: Int = 524288;
public const val `ACM_FORMATENUMF_WFORMATTAG`: Int = 65536;
public const val `ACM_FORMATSUGGESTF_NCHANNELS`: Int = 131072;
public const val `ACM_FORMATSUGGESTF_NSAMPLESPERSEC`: Int = 262144;
public const val `ACM_FORMATSUGGESTF_TYPEMASK`: Int = 16711680;
public const val `ACM_FORMATSUGGESTF_WBITSPERSAMPLE`: Int = 524288;
public const val `ACM_FORMATSUGGESTF_WFORMATTAG`: Int = 65536;
public const val `ACM_FORMATTAGDETAILSF_FORMATTAG`: Int = 1;
public const val `ACM_FORMATTAGDETAILSF_INDEX`: Int = 0;
public const val `ACM_FORMATTAGDETAILSF_LARGESTSIZE`: Int = 2;
public const val `ACM_FORMATTAGDETAILSF_QUERYMASK`: Int = 15;
public const val `ACM_METRIC_COUNT_CODECS`: UInt = 2u;
public const val `ACM_METRIC_COUNT_CONVERTERS`: UInt = 3u;
public const val `ACM_METRIC_COUNT_DISABLED`: UInt = 5u;
public const val `ACM_METRIC_COUNT_DRIVERS`: UInt = 1u;
public const val `ACM_METRIC_COUNT_FILTERS`: UInt = 4u;
public const val `ACM_METRIC_COUNT_HARDWARE`: UInt = 6u;
public const val `ACM_METRIC_COUNT_LOCAL_CODECS`: UInt = 21u;
public const val `ACM_METRIC_COUNT_LOCAL_CONVERTERS`: UInt = 22u;
public const val `ACM_METRIC_COUNT_LOCAL_DISABLED`: UInt = 24u;
public const val `ACM_METRIC_COUNT_LOCAL_DRIVERS`: UInt = 20u;
public const val `ACM_METRIC_COUNT_LOCAL_FILTERS`: UInt = 23u;
public const val `ACM_METRIC_DRIVER_PRIORITY`: UInt = 101u;
public const val `ACM_METRIC_DRIVER_SUPPORT`: UInt = 100u;
public const val `ACM_METRIC_HARDWARE_WAVE_INPUT`: UInt = 30u;
public const val `ACM_METRIC_HARDWARE_WAVE_OUTPUT`: UInt = 31u;
public const val `ACM_METRIC_MAX_SIZE_FILTER`: UInt = 51u;
public const val `ACM_METRIC_MAX_SIZE_FORMAT`: UInt = 50u;
public const val `ACM_STREAMCONVERTF_BLOCKALIGN`: UInt = 4u;
public const val `ACM_STREAMCONVERTF_END`: UInt = 32u;
public const val `ACM_STREAMCONVERTF_START`: UInt = 16u;
public const val `ACM_STREAMOPENF_ASYNC`: UInt = 2u;
public const val `ACM_STREAMOPENF_NONREALTIME`: UInt = 4u;
public const val `ACM_STREAMOPENF_QUERY`: UInt = 1u;
public const val `ACM_STREAMSIZEF_DESTINATION`: Int = 1;
public const val `ACM_STREAMSIZEF_QUERYMASK`: Int = 15;
public const val `ACM_STREAMSIZEF_SOURCE`: Int = 0;
public typealias `AMBISONICS_CHANNEL_ORDERING` = Int;
public const val `AMBISONICS_CHANNEL_ORDERING_ACN`: `AMBISONICS_CHANNEL_ORDERING` = 0;
public typealias `AMBISONICS_NORMALIZATION` = Int;
public const val `AMBISONICS_NORMALIZATION_N3D`: `AMBISONICS_NORMALIZATION` = 1;
public const val `AMBISONICS_NORMALIZATION_SN3D`: `AMBISONICS_NORMALIZATION` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AMBISONICS_PARAMS` (
    public var `u32Size`: UInt,
    public var `u32Version`: UInt,
    public var `u32Type`: `AMBISONICS_TYPE`,
    public var `u32ChannelOrdering`: `AMBISONICS_CHANNEL_ORDERING`,
    public var `u32Normalization`: `AMBISONICS_NORMALIZATION`,
    public var `u32Order`: UInt,
    public var `u32NumChannels`: UInt,
    public var `pu32ChannelMap`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `AMBISONICS_PARAMS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `AMBISONICS_PARAMS`.Companion.`default`() : `AMBISONICS_PARAMS` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `AMBISONICS_PARAM_VERSION_1`: UInt = 1u;
public typealias `AMBISONICS_TYPE` = Int;
public const val `AMBISONICS_TYPE_FULL3D`: `AMBISONICS_TYPE` = 0;
public const val `AUDCLNT_BUFFERFLAGS_DATA_DISCONTINUITY`: `_AUDCLNT_BUFFERFLAGS` = 1;
public const val `AUDCLNT_BUFFERFLAGS_SILENT`: `_AUDCLNT_BUFFERFLAGS` = 2;
public const val `AUDCLNT_BUFFERFLAGS_TIMESTAMP_ERROR`: `_AUDCLNT_BUFFERFLAGS` = 4;
public const val `AUDCLNT_E_ALREADY_INITIALIZED`: Int = -2004287486;
public const val `AUDCLNT_E_BUFDURATION_PERIOD_NOT_EQUAL`: Int = -2004287469;
public const val `AUDCLNT_E_BUFFER_ERROR`: Int = -2004287464;
public const val `AUDCLNT_E_BUFFER_OPERATION_PENDING`: Int = -2004287477;
public const val `AUDCLNT_E_BUFFER_SIZE_ERROR`: Int = -2004287466;
public const val `AUDCLNT_E_BUFFER_SIZE_NOT_ALIGNED`: Int = -2004287463;
public const val `AUDCLNT_E_BUFFER_TOO_LARGE`: Int = -2004287482;
public const val `AUDCLNT_E_CPUUSAGE_EXCEEDED`: Int = -2004287465;
public const val `AUDCLNT_E_DEVICE_INVALIDATED`: Int = -2004287484;
public const val `AUDCLNT_E_DEVICE_IN_USE`: Int = -2004287478;
public const val `AUDCLNT_E_EFFECT_NOT_AVAILABLE`: Int = -2004287423;
public const val `AUDCLNT_E_EFFECT_STATE_READ_ONLY`: Int = -2004287422;
public const val `AUDCLNT_E_ENDPOINT_CREATE_FAILED`: Int = -2004287473;
public const val `AUDCLNT_E_ENDPOINT_OFFLOAD_NOT_CAPABLE`: Int = -2004287454;
public const val `AUDCLNT_E_ENGINE_FORMAT_LOCKED`: Int = -2004287447;
public const val `AUDCLNT_E_ENGINE_PERIODICITY_LOCKED`: Int = -2004287448;
public const val `AUDCLNT_E_EVENTHANDLE_NOT_EXPECTED`: Int = -2004287471;
public const val `AUDCLNT_E_EVENTHANDLE_NOT_SET`: Int = -2004287468;
public const val `AUDCLNT_E_EXCLUSIVE_MODE_NOT_ALLOWED`: Int = -2004287474;
public const val `AUDCLNT_E_EXCLUSIVE_MODE_ONLY`: Int = -2004287470;
public const val `AUDCLNT_E_HEADTRACKING_ENABLED`: Int = -2004287440;
public const val `AUDCLNT_E_HEADTRACKING_UNSUPPORTED`: Int = -2004287424;
public const val `AUDCLNT_E_INCORRECT_BUFFER_SIZE`: Int = -2004287467;
public const val `AUDCLNT_E_INVALID_DEVICE_PERIOD`: Int = -2004287456;
public const val `AUDCLNT_E_INVALID_SIZE`: Int = -2004287479;
public const val `AUDCLNT_E_INVALID_STREAM_FLAG`: Int = -2004287455;
public const val `AUDCLNT_E_NONOFFLOAD_MODE_ONLY`: Int = -2004287451;
public const val `AUDCLNT_E_NOT_INITIALIZED`: Int = -2004287487;
public const val `AUDCLNT_E_NOT_STOPPED`: Int = -2004287483;
public const val `AUDCLNT_E_OFFLOAD_MODE_ONLY`: Int = -2004287452;
public const val `AUDCLNT_E_OUT_OF_OFFLOAD_RESOURCES`: Int = -2004287453;
public const val `AUDCLNT_E_OUT_OF_ORDER`: Int = -2004287481;
public const val `AUDCLNT_E_RAW_MODE_UNSUPPORTED`: Int = -2004287449;
public const val `AUDCLNT_E_RESOURCES_INVALIDATED`: Int = -2004287450;
public const val `AUDCLNT_E_SERVICE_NOT_RUNNING`: Int = -2004287472;
public const val `AUDCLNT_E_THREAD_NOT_REGISTERED`: Int = -2004287476;
public const val `AUDCLNT_E_UNSUPPORTED_FORMAT`: Int = -2004287480;
public const val `AUDCLNT_E_WRONG_ENDPOINT_TYPE`: Int = -2004287485;
public const val `AUDCLNT_SESSIONFLAGS_DISPLAY_HIDE`: UInt = 536870912u;
public const val `AUDCLNT_SESSIONFLAGS_DISPLAY_HIDEWHENEXPIRED`: UInt = 1073741824u;
public const val `AUDCLNT_SESSIONFLAGS_EXPIREWHENUNOWNED`: UInt = 268435456u;
public typealias `AUDCLNT_SHAREMODE` = Int;
public const val `AUDCLNT_SHAREMODE_EXCLUSIVE`: `AUDCLNT_SHAREMODE` = 1;
public const val `AUDCLNT_SHAREMODE_SHARED`: `AUDCLNT_SHAREMODE` = 0;
public const val `AUDCLNT_STREAMFLAGS_AUTOCONVERTPCM`: UInt = 2147483648u;
public const val `AUDCLNT_STREAMFLAGS_CROSSPROCESS`: UInt = 65536u;
public const val `AUDCLNT_STREAMFLAGS_EVENTCALLBACK`: UInt = 262144u;
public const val `AUDCLNT_STREAMFLAGS_LOOPBACK`: UInt = 131072u;
public const val `AUDCLNT_STREAMFLAGS_NOPERSIST`: UInt = 524288u;
public const val `AUDCLNT_STREAMFLAGS_RATEADJUST`: UInt = 1048576u;
public const val `AUDCLNT_STREAMFLAGS_SRC_DEFAULT_QUALITY`: UInt = 134217728u;
public typealias `AUDCLNT_STREAMOPTIONS` = Int;
public const val `AUDCLNT_STREAMOPTIONS_AMBISONICS`: `AUDCLNT_STREAMOPTIONS` = 4;
public const val `AUDCLNT_STREAMOPTIONS_MATCH_FORMAT`: `AUDCLNT_STREAMOPTIONS` = 2;
public const val `AUDCLNT_STREAMOPTIONS_NONE`: `AUDCLNT_STREAMOPTIONS` = 0;
public const val `AUDCLNT_STREAMOPTIONS_RAW`: `AUDCLNT_STREAMOPTIONS` = 1;
public const val `AUDCLNT_S_BUFFER_EMPTY`: Int = 143196161;
public const val `AUDCLNT_S_POSITION_STALLED`: Int = 143196163;
public const val `AUDCLNT_S_THREAD_ALREADY_REGISTERED`: Int = 143196162;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AUDIOCLIENT_ACTIVATION_PARAMS` (
    public var `ActivationType`: `AUDIOCLIENT_ACTIVATION_TYPE`,
    public var `Anonymous`: `AUDIOCLIENT_ACTIVATION_PARAMS_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `AUDIOCLIENT_ACTIVATION_PARAMS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `AUDIOCLIENT_ACTIVATION_PARAMS`.Companion.`default`() : `AUDIOCLIENT_ACTIVATION_PARAMS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 828:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union AUDIOCLIENT_ACTIVATION_PARAMS_0 {
//     pub ProcessLoopbackParams: AUDIOCLIENT_PROCESS_LOOPBACK_PARAMS,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `AUDIOCLIENT_ACTIVATION_PARAMS_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `AUDIOCLIENT_ACTIVATION_PARAMS_0`.Companion.`default`() : `AUDIOCLIENT_ACTIVATION_PARAMS_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `AUDIOCLIENT_ACTIVATION_TYPE` = Int;
public const val `AUDIOCLIENT_ACTIVATION_TYPE_DEFAULT`: `AUDIOCLIENT_ACTIVATION_TYPE` = 0;
public const val `AUDIOCLIENT_ACTIVATION_TYPE_PROCESS_LOOPBACK`: `AUDIOCLIENT_ACTIVATION_TYPE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `AUDIOCLIENT_PROCESS_LOOPBACK_PARAMS` (
    public var `TargetProcessId`: UInt,
    public var `ProcessLoopbackMode`: `PROCESS_LOOPBACK_MODE`,
)
public const val `AUDIOCLOCK_CHARACTERISTIC_FIXED_FREQ`: UInt = 1u;
public typealias `AUDIO_DUCKING_OPTIONS` = Int;
public const val `AUDIO_DUCKING_OPTIONS_DEFAULT`: `AUDIO_DUCKING_OPTIONS` = 0;
public const val `AUDIO_DUCKING_OPTIONS_DO_NOT_DUCK_OTHER_STREAMS`: `AUDIO_DUCKING_OPTIONS` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `AUDIO_EFFECT` (
    public var `id`: `windows_sys`.`core`.`GUID`,
    public var `canSetState`: `windows_sys`.`core`.`BOOL`,
    public var `state`: `AUDIO_EFFECT_STATE`,
)
public typealias `AUDIO_EFFECT_STATE` = Int;
public const val `AUDIO_EFFECT_STATE_OFF`: `AUDIO_EFFECT_STATE` = 0;
public const val `AUDIO_EFFECT_STATE_ON`: `AUDIO_EFFECT_STATE` = 1;
public typealias `AUDIO_STREAM_CATEGORY` = Int;
public typealias `AUDIO_SYSTEMEFFECTS_PROPERTYSTORE_TYPE` = Int;
public const val `AUDIO_SYSTEMEFFECTS_PROPERTYSTORE_TYPE_DEFAULT`: `AUDIO_SYSTEMEFFECTS_PROPERTYSTORE_TYPE` = 0;
public const val `AUDIO_SYSTEMEFFECTS_PROPERTYSTORE_TYPE_ENUM_COUNT`: `AUDIO_SYSTEMEFFECTS_PROPERTYSTORE_TYPE` = 3;
public const val `AUDIO_SYSTEMEFFECTS_PROPERTYSTORE_TYPE_USER`: `AUDIO_SYSTEMEFFECTS_PROPERTYSTORE_TYPE` = 1;
public const val `AUDIO_SYSTEMEFFECTS_PROPERTYSTORE_TYPE_VOLATILE`: `AUDIO_SYSTEMEFFECTS_PROPERTYSTORE_TYPE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AUDIO_VOLUME_NOTIFICATION_DATA` (
    public var `guidEventContext`: `windows_sys`.`core`.`GUID`,
    public var `bMuted`: `windows_sys`.`core`.`BOOL`,
    public var `fMasterVolume`: Float,
    public var `nChannels`: UInt,
    public var `afChannelVolumes`: FloatArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `AUDIO_VOLUME_NOTIFICATION_DATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `AUDIO_VOLUME_NOTIFICATION_DATA`.Companion.`default`() : `AUDIO_VOLUME_NOTIFICATION_DATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AUXCAPS2A` (
    public var `wMid`: UShort,
    public var `wPid`: UShort,
    public var `vDriverVersion`: UInt,
    public var `szPname`: ByteArray,
    public var `wTechnology`: UShort,
    public var `wReserved1`: UShort,
    public var `dwSupport`: UInt,
    public var `ManufacturerGuid`: `windows_sys`.`core`.`GUID`,
    public var `ProductGuid`: `windows_sys`.`core`.`GUID`,
    public var `NameGuid`: `windows_sys`.`core`.`GUID`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `AUXCAPS2A`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `AUXCAPS2A`.Companion.`default`() : `AUXCAPS2A` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AUXCAPS2W` (
    public var `wMid`: UShort,
    public var `wPid`: UShort,
    public var `vDriverVersion`: UInt,
    public var `szPname`: UShortArray,
    public var `wTechnology`: UShort,
    public var `wReserved1`: UShort,
    public var `dwSupport`: UInt,
    public var `ManufacturerGuid`: `windows_sys`.`core`.`GUID`,
    public var `ProductGuid`: `windows_sys`.`core`.`GUID`,
    public var `NameGuid`: `windows_sys`.`core`.`GUID`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `AUXCAPS2W`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `AUXCAPS2W`.Companion.`default`() : `AUXCAPS2W` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AUXCAPSA` (
    public var `wMid`: UShort,
    public var `wPid`: UShort,
    public var `vDriverVersion`: UInt,
    public var `szPname`: ByteArray,
    public var `wTechnology`: UShort,
    public var `wReserved1`: UShort,
    public var `dwSupport`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `AUXCAPSA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `AUXCAPSA`.Companion.`default`() : `AUXCAPSA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AUXCAPSW` (
    public var `wMid`: UShort,
    public var `wPid`: UShort,
    public var `vDriverVersion`: UInt,
    public var `szPname`: UShortArray,
    public var `wTechnology`: UShort,
    public var `wReserved1`: UShort,
    public var `dwSupport`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `AUXCAPSW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `AUXCAPSW`.Companion.`default`() : `AUXCAPSW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `AUXCAPS_AUXIN`: UInt = 2u;
public const val `AUXCAPS_CDAUDIO`: UInt = 1u;
public const val `AUXCAPS_LRVOLUME`: UInt = 2u;
public const val `AUXCAPS_VOLUME`: UInt = 1u;
public const val `AudioCategory_Alerts`: `AUDIO_STREAM_CATEGORY` = 4;
public const val `AudioCategory_Communications`: `AUDIO_STREAM_CATEGORY` = 3;
public const val `AudioCategory_FarFieldSpeech`: `AUDIO_STREAM_CATEGORY` = 12;
public const val `AudioCategory_ForegroundOnlyMedia`: `AUDIO_STREAM_CATEGORY` = 1;
public const val `AudioCategory_GameChat`: `AUDIO_STREAM_CATEGORY` = 8;
public const val `AudioCategory_GameEffects`: `AUDIO_STREAM_CATEGORY` = 6;
public const val `AudioCategory_GameMedia`: `AUDIO_STREAM_CATEGORY` = 7;
public const val `AudioCategory_Media`: `AUDIO_STREAM_CATEGORY` = 11;
public const val `AudioCategory_Movie`: `AUDIO_STREAM_CATEGORY` = 10;
public const val `AudioCategory_Other`: `AUDIO_STREAM_CATEGORY` = 0;
public const val `AudioCategory_SoundEffects`: `AUDIO_STREAM_CATEGORY` = 5;
public const val `AudioCategory_Speech`: `AUDIO_STREAM_CATEGORY` = 9;
public const val `AudioCategory_UniformSpeech`: `AUDIO_STREAM_CATEGORY` = 13;
public const val `AudioCategory_VoiceTyping`: `AUDIO_STREAM_CATEGORY` = 14;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `AudioClient3ActivationParams` (
    public var `tracingContextId`: `windows_sys`.`core`.`GUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `AudioClientProperties` (
    public var `cbSize`: UInt,
    public var `bIsOffload`: `windows_sys`.`core`.`BOOL`,
    public var `eCategory`: `AUDIO_STREAM_CATEGORY`,
    public var `Options`: `AUDCLNT_STREAMOPTIONS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AudioExtensionParams` (
    public var `AddPageParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `pEndpoint`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pPnpInterface`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pPnpDevnode`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `AudioExtensionParams`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `AudioExtensionParams`.Companion.`default`() : `AudioExtensionParams` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `AudioObjectType` = Int;
public const val `AudioObjectType_BackCenter`: `AudioObjectType` = 131072;
public const val `AudioObjectType_BackLeft`: `AudioObjectType` = 128;
public const val `AudioObjectType_BackRight`: `AudioObjectType` = 256;
public const val `AudioObjectType_BottomBackLeft`: `AudioObjectType` = 32768;
public const val `AudioObjectType_BottomBackRight`: `AudioObjectType` = 65536;
public const val `AudioObjectType_BottomFrontLeft`: `AudioObjectType` = 8192;
public const val `AudioObjectType_BottomFrontRight`: `AudioObjectType` = 16384;
public const val `AudioObjectType_Dynamic`: `AudioObjectType` = 1;
public const val `AudioObjectType_FrontCenter`: `AudioObjectType` = 8;
public const val `AudioObjectType_FrontLeft`: `AudioObjectType` = 2;
public const val `AudioObjectType_FrontRight`: `AudioObjectType` = 4;
public const val `AudioObjectType_LowFrequency`: `AudioObjectType` = 16;
public const val `AudioObjectType_None`: `AudioObjectType` = 0;
public const val `AudioObjectType_SideLeft`: `AudioObjectType` = 32;
public const val `AudioObjectType_SideRight`: `AudioObjectType` = 64;
public const val `AudioObjectType_TopBackLeft`: `AudioObjectType` = 2048;
public const val `AudioObjectType_TopBackRight`: `AudioObjectType` = 4096;
public const val `AudioObjectType_TopFrontLeft`: `AudioObjectType` = 512;
public const val `AudioObjectType_TopFrontRight`: `AudioObjectType` = 1024;
public typealias `AudioSessionDisconnectReason` = Int;
public typealias `AudioSessionState` = Int;
public const val `AudioSessionStateActive`: `AudioSessionState` = 1;
public const val `AudioSessionStateExpired`: `AudioSessionState` = 2;
public const val `AudioSessionStateInactive`: `AudioSessionState` = 0;
public typealias `AudioStateMonitorSoundLevel` = Int;
public const val `CALLBACK_EVENT`: `MIDI_WAVE_OPEN_TYPE` = 327680u;
public const val `CALLBACK_FUNCTION`: `MIDI_WAVE_OPEN_TYPE` = 196608u;
public const val `CALLBACK_NULL`: `MIDI_WAVE_OPEN_TYPE` = 0u;
public const val `CALLBACK_TASK`: `MIDI_WAVE_OPEN_TYPE` = 131072u;
public const val `CALLBACK_THREAD`: `MIDI_WAVE_OPEN_TYPE` = 131072u;
public const val `CALLBACK_TYPEMASK`: `MIDI_WAVE_OPEN_TYPE` = 458752u;
public const val `CALLBACK_WINDOW`: `MIDI_WAVE_OPEN_TYPE` = 65536u;
public const val `Connector`: `PartType` = 0;
// UNSUPPORTED Rust 1029:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(transparent)]
// #[derive(Clone, Copy)]
// pub struct ConnectorType(pub i32);

// UNSUPPORTED Rust 1032:1: declaration Impl has no candidate rule; syntax: factory impl contains Const; no associated items are omitted
// impl ConnectorType {
//     pub const Unknown_Connector: Self = Self(0i32);
//     pub const Physical_Internal: Self = Self(1i32);
//     pub const Physical_External: Self = Self(2i32);
//     pub const Software_IO: Self = Self(3i32);
//     pub const Software_Fixed: Self = Self(4i32);
//     pub const Network: Self = Self(5i32);
// }

public typealias `DEVICE_STATE` = UInt;
public const val `DEVICE_STATEMASK_ALL`: UInt = 15u;
public const val `DEVICE_STATE_ACTIVE`: `DEVICE_STATE` = 1u;
public const val `DEVICE_STATE_DISABLED`: `DEVICE_STATE` = 2u;
public const val `DEVICE_STATE_NOTPRESENT`: `DEVICE_STATE` = 4u;
public const val `DEVICE_STATE_UNPLUGGED`: `DEVICE_STATE` = 8u;
// UNSUPPORTED Rust 1046:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const DEVINTERFACE_AUDIO_CAPTURE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2eef81be_33fa_4800_9670_1cd474972c3f);

// UNSUPPORTED Rust 1047:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const DEVINTERFACE_AUDIO_RENDER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe6327cad_dcec_4949_ae8a_991e976a79d2);

// UNSUPPORTED Rust 1048:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const DEVINTERFACE_MIDI_INPUT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x504be32c_ccf6_4d2c_b73f_6f8b3747e22b);

// UNSUPPORTED Rust 1049:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const DEVINTERFACE_MIDI_OUTPUT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6dc23320_ab33_4ce4_80d4_bbb3ebbf2814);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DIRECTX_AUDIO_ACTIVATION_PARAMS` (
    public var `cbDirectXAudioActivationParams`: UInt,
    public var `guidAudioSession`: `windows_sys`.`core`.`GUID`,
    public var `dwAudioStreamFlags`: UInt,
)
public const val `DRVM_MAPPER`: UInt = 8192u;
public const val `DRVM_MAPPER_STATUS`: UInt = 8192u;
public const val `DRV_MAPPER_PREFERRED_INPUT_GET`: UInt = 16384u;
public const val `DRV_MAPPER_PREFERRED_OUTPUT_GET`: UInt = 16386u;
public typealias `DataFlow` = Int;
// UNSUPPORTED Rust 1062:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const DeviceTopology: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1df639d0_5ec1_47aa_9379_828dc1aa8c59);

public const val `DigitalAudioDisplayDevice`: `EndpointFormFactor` = 9;
public const val `DisconnectReasonDeviceRemoval`: `AudioSessionDisconnectReason` = 0;
public const val `DisconnectReasonExclusiveModeOverride`: `AudioSessionDisconnectReason` = 5;
public const val `DisconnectReasonFormatChanged`: `AudioSessionDisconnectReason` = 2;
public const val `DisconnectReasonServerShutdown`: `AudioSessionDisconnectReason` = 1;
public const val `DisconnectReasonSessionDisconnected`: `AudioSessionDisconnectReason` = 4;
public const val `DisconnectReasonSessionLogoff`: `AudioSessionDisconnectReason` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ECHOWAVEFILTER` (
    public var `wfltr`: `WAVEFILTER`,
    public var `dwVolume`: UInt,
    public var `dwDelay`: UInt,
)
public typealias `EDataFlow` = Int;
public const val `EDataFlow_enum_count`: `EDataFlow` = 3;
public const val `ENDPOINT_FORMAT_RESET_MIX_ONLY`: UInt = 1u;
public const val `ENDPOINT_HARDWARE_SUPPORT_METER`: UInt = 4u;
public const val `ENDPOINT_HARDWARE_SUPPORT_MUTE`: UInt = 2u;
public const val `ENDPOINT_HARDWARE_SUPPORT_VOLUME`: UInt = 1u;
public const val `ENDPOINT_SYSFX_DISABLED`: UInt = 1u;
public const val `ENDPOINT_SYSFX_ENABLED`: UInt = 0u;
public typealias `ERole` = Int;
public const val `ERole_enum_count`: `ERole` = 3;
// UNSUPPORTED Rust 1087:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const EVENTCONTEXT_VOLUMESLIDER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe2c2e9de_09b1_4b04_84e5_07931225ee04);

public typealias `EndpointFormFactor` = Int;
public const val `EndpointFormFactor_enum_count`: `EndpointFormFactor` = 11;
public const val `FILTERCHOOSE_CUSTOM_VERIFY`: UInt = 2u;
public const val `FILTERCHOOSE_FILTERTAG_VERIFY`: UInt = 0u;
public const val `FILTERCHOOSE_FILTER_VERIFY`: UInt = 1u;
public const val `FILTERCHOOSE_MESSAGE`: UInt = 0u;
public const val `FORMATCHOOSE_CUSTOM_VERIFY`: UInt = 2u;
public const val `FORMATCHOOSE_FORMATTAG_VERIFY`: UInt = 0u;
public const val `FORMATCHOOSE_FORMAT_VERIFY`: UInt = 1u;
public const val `FORMATCHOOSE_MESSAGE`: UInt = 0u;
public const val `Full`: `AudioStateMonitorSoundLevel` = 2;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HACMDRIVER` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HACMDRIVERID` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HACMOBJ` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HACMSTREAM` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HMIDI` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HMIDIIN` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HMIDIOUT` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HMIDISTRM` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HMIXER` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HMIXEROBJ` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HWAVE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HWAVEIN` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HWAVEOUT` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public const val `Handset`: `EndpointFormFactor` = 6;
public const val `Headphones`: `EndpointFormFactor` = 3;
public const val `Headset`: `EndpointFormFactor` = 5;
public const val `In`: `DataFlow` = 0;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPACMDRIVERPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, `HACMDRIVERID`, UInt, `super`.`super`.`Foundation`.`LPARAM`, `super`.`super`.`Foundation`.`LPARAM`) -> `super`.`super`.`Foundation`.`LRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Media_Multimedia")]
public typealias `LPMIDICALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`Multimedia`.`HDRVR`, UInt, ULong, ULong, ULong) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Media_Multimedia")]
public typealias `LPWAVECALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`Multimedia`.`HDRVR`, UInt, ULong, ULong, ULong) -> Unit>>>;
public const val `LineLevel`: `EndpointFormFactor` = 2;
public const val `Low`: `AudioStateMonitorSoundLevel` = 1;
public const val `MEVT_COMMENT`: UByte = 130u;
public const val `MEVT_F_CALLBACK`: Int = 1073741824;
public const val `MEVT_F_LONG`: Int = -2147483648;
public const val `MEVT_F_SHORT`: Int = 0;
public const val `MEVT_LONGMSG`: UByte = 128u;
public const val `MEVT_NOP`: UByte = 2u;
public const val `MEVT_SHORTMSG`: UByte = 0u;
public const val `MEVT_TEMPO`: UByte = 1u;
public const val `MEVT_VERSION`: UByte = 132u;
public const val `MHDR_DONE`: UInt = 1u;
public const val `MHDR_INQUEUE`: UInt = 4u;
public const val `MHDR_ISSTRM`: UInt = 8u;
public const val `MHDR_PREPARED`: UInt = 2u;
public const val `MIDICAPS_CACHE`: UInt = 4u;
public const val `MIDICAPS_LRVOLUME`: UInt = 2u;
public const val `MIDICAPS_STREAM`: UInt = 8u;
public const val `MIDICAPS_VOLUME`: UInt = 1u;
public const val `MIDIERR_BADOPENMODE`: UInt = 70u;
public const val `MIDIERR_DONT_CONTINUE`: UInt = 71u;
public const val `MIDIERR_INVALIDSETUP`: UInt = 69u;
public const val `MIDIERR_LASTERROR`: UInt = 71u;
public const val `MIDIERR_NODEVICE`: UInt = 68u;
public const val `MIDIERR_NOMAP`: UInt = 66u;
public const val `MIDIERR_NOTREADY`: UInt = 67u;
public const val `MIDIERR_STILLPLAYING`: UInt = 65u;
public const val `MIDIERR_UNPREPARED`: UInt = 64u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIDIEVENT` (
    public var `dwDeltaTime`: UInt,
    public var `dwStreamID`: UInt,
    public var `dwEvent`: UInt,
    public var `dwParms`: UIntArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIDIEVENT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIDIEVENT`.Companion.`default`() : `MIDIEVENT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIDIHDR` (
    public var `lpData`: `windows_sys`.`core`.`PSTR`,
    public var `dwBufferLength`: UInt,
    public var `dwBytesRecorded`: UInt,
    public var `dwUser`: ULong,
    public var `dwFlags`: UInt,
    public var `lpNext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDIHDR`>?,
    public var `reserved`: ULong,
    public var `dwOffset`: UInt,
    public var `dwReserved`: ULongArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIDIHDR`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIDIHDR`.Companion.`default`() : `MIDIHDR` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIDIINCAPS2A` (
    public var `wMid`: UShort,
    public var `wPid`: UShort,
    public var `vDriverVersion`: UInt,
    public var `szPname`: ByteArray,
    public var `dwSupport`: UInt,
    public var `ManufacturerGuid`: `windows_sys`.`core`.`GUID`,
    public var `ProductGuid`: `windows_sys`.`core`.`GUID`,
    public var `NameGuid`: `windows_sys`.`core`.`GUID`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIDIINCAPS2A`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIDIINCAPS2A`.Companion.`default`() : `MIDIINCAPS2A` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIDIINCAPS2W` (
    public var `wMid`: UShort,
    public var `wPid`: UShort,
    public var `vDriverVersion`: UInt,
    public var `szPname`: UShortArray,
    public var `dwSupport`: UInt,
    public var `ManufacturerGuid`: `windows_sys`.`core`.`GUID`,
    public var `ProductGuid`: `windows_sys`.`core`.`GUID`,
    public var `NameGuid`: `windows_sys`.`core`.`GUID`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIDIINCAPS2W`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIDIINCAPS2W`.Companion.`default`() : `MIDIINCAPS2W` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIDIINCAPSA` (
    public var `wMid`: UShort,
    public var `wPid`: UShort,
    public var `vDriverVersion`: UInt,
    public var `szPname`: ByteArray,
    public var `dwSupport`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIDIINCAPSA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIDIINCAPSA`.Companion.`default`() : `MIDIINCAPSA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIDIINCAPSW` (
    public var `wMid`: UShort,
    public var `wPid`: UShort,
    public var `vDriverVersion`: UInt,
    public var `szPname`: UShortArray,
    public var `dwSupport`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIDIINCAPSW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIDIINCAPSW`.Companion.`default`() : `MIDIINCAPSW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIDIOUTCAPS2A` (
    public var `wMid`: UShort,
    public var `wPid`: UShort,
    public var `vDriverVersion`: UInt,
    public var `szPname`: ByteArray,
    public var `wTechnology`: UShort,
    public var `wVoices`: UShort,
    public var `wNotes`: UShort,
    public var `wChannelMask`: UShort,
    public var `dwSupport`: UInt,
    public var `ManufacturerGuid`: `windows_sys`.`core`.`GUID`,
    public var `ProductGuid`: `windows_sys`.`core`.`GUID`,
    public var `NameGuid`: `windows_sys`.`core`.`GUID`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIDIOUTCAPS2A`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIDIOUTCAPS2A`.Companion.`default`() : `MIDIOUTCAPS2A` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIDIOUTCAPS2W` (
    public var `wMid`: UShort,
    public var `wPid`: UShort,
    public var `vDriverVersion`: UInt,
    public var `szPname`: UShortArray,
    public var `wTechnology`: UShort,
    public var `wVoices`: UShort,
    public var `wNotes`: UShort,
    public var `wChannelMask`: UShort,
    public var `dwSupport`: UInt,
    public var `ManufacturerGuid`: `windows_sys`.`core`.`GUID`,
    public var `ProductGuid`: `windows_sys`.`core`.`GUID`,
    public var `NameGuid`: `windows_sys`.`core`.`GUID`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIDIOUTCAPS2W`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIDIOUTCAPS2W`.Companion.`default`() : `MIDIOUTCAPS2W` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIDIOUTCAPSA` (
    public var `wMid`: UShort,
    public var `wPid`: UShort,
    public var `vDriverVersion`: UInt,
    public var `szPname`: ByteArray,
    public var `wTechnology`: UShort,
    public var `wVoices`: UShort,
    public var `wNotes`: UShort,
    public var `wChannelMask`: UShort,
    public var `dwSupport`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIDIOUTCAPSA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIDIOUTCAPSA`.Companion.`default`() : `MIDIOUTCAPSA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIDIOUTCAPSW` (
    public var `wMid`: UShort,
    public var `wPid`: UShort,
    public var `vDriverVersion`: UInt,
    public var `szPname`: UShortArray,
    public var `wTechnology`: UShort,
    public var `wVoices`: UShort,
    public var `wNotes`: UShort,
    public var `wChannelMask`: UShort,
    public var `dwSupport`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIDIOUTCAPSW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIDIOUTCAPSW`.Companion.`default`() : `MIDIOUTCAPSW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `MIDIPATCHSIZE`: UInt = 128u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIDIPROPTEMPO` (
    public var `cbStruct`: UInt,
    public var `dwTempo`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIDIPROPTIMEDIV` (
    public var `cbStruct`: UInt,
    public var `dwTimeDiv`: UInt,
)
public const val `MIDIPROP_GET`: Int = 1073741824;
public const val `MIDIPROP_SET`: Int = -2147483648;
public const val `MIDIPROP_TEMPO`: Int = 2;
public const val `MIDIPROP_TIMEDIV`: Int = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIDISTRMBUFFVER` (
    public var `dwVersion`: UInt,
    public var `dwMid`: UInt,
    public var `dwOEMVersion`: UInt,
)
public const val `MIDISTRM_ERROR`: Int = -2;
public const val `MIDI_CACHE_ALL`: UInt = 1u;
public const val `MIDI_CACHE_BESTFIT`: UInt = 2u;
public const val `MIDI_CACHE_QUERY`: UInt = 3u;
public const val `MIDI_IO_STATUS`: `MIDI_WAVE_OPEN_TYPE` = 32u;
public const val `MIDI_UNCACHE`: UInt = 4u;
public typealias `MIDI_WAVE_OPEN_TYPE` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIXERCAPS2A` (
    public var `wMid`: UShort,
    public var `wPid`: UShort,
    public var `vDriverVersion`: UInt,
    public var `szPname`: ByteArray,
    public var `fdwSupport`: UInt,
    public var `cDestinations`: UInt,
    public var `ManufacturerGuid`: `windows_sys`.`core`.`GUID`,
    public var `ProductGuid`: `windows_sys`.`core`.`GUID`,
    public var `NameGuid`: `windows_sys`.`core`.`GUID`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIXERCAPS2A`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIXERCAPS2A`.Companion.`default`() : `MIXERCAPS2A` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIXERCAPS2W` (
    public var `wMid`: UShort,
    public var `wPid`: UShort,
    public var `vDriverVersion`: UInt,
    public var `szPname`: UShortArray,
    public var `fdwSupport`: UInt,
    public var `cDestinations`: UInt,
    public var `ManufacturerGuid`: `windows_sys`.`core`.`GUID`,
    public var `ProductGuid`: `windows_sys`.`core`.`GUID`,
    public var `NameGuid`: `windows_sys`.`core`.`GUID`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIXERCAPS2W`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIXERCAPS2W`.Companion.`default`() : `MIXERCAPS2W` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIXERCAPSA` (
    public var `wMid`: UShort,
    public var `wPid`: UShort,
    public var `vDriverVersion`: UInt,
    public var `szPname`: ByteArray,
    public var `fdwSupport`: UInt,
    public var `cDestinations`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIXERCAPSA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIXERCAPSA`.Companion.`default`() : `MIXERCAPSA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIXERCAPSW` (
    public var `wMid`: UShort,
    public var `wPid`: UShort,
    public var `vDriverVersion`: UInt,
    public var `szPname`: UShortArray,
    public var `fdwSupport`: UInt,
    public var `cDestinations`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIXERCAPSW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIXERCAPSW`.Companion.`default`() : `MIXERCAPSW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIXERCONTROLA` (
    public var `cbStruct`: UInt,
    public var `dwControlID`: UInt,
    public var `dwControlType`: UInt,
    public var `fdwControl`: UInt,
    public var `cMultipleItems`: UInt,
    public var `szShortName`: ByteArray,
    public var `szName`: ByteArray,
    public var `Bounds`: `MIXERCONTROLA_0`,
    public var `Metrics`: `MIXERCONTROLA_1`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIXERCONTROLA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIXERCONTROLA`.Companion.`default`() : `MIXERCONTROLA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1435:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union MIXERCONTROLA_0 {
//     pub Anonymous1: MIXERCONTROLA_0_0,
//     pub Anonymous2: MIXERCONTROLA_0_1,
//     pub dwReserved: [u32; 6],
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIXERCONTROLA_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIXERCONTROLA_0`.Companion.`default`() : `MIXERCONTROLA_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIXERCONTROLA_0_0` (
    public var `lMinimum`: Int,
    public var `lMaximum`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIXERCONTROLA_0_1` (
    public var `dwMinimum`: UInt,
    public var `dwMaximum`: UInt,
)
// UNSUPPORTED Rust 1459:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union MIXERCONTROLA_1 {
//     pub cSteps: u32,
//     pub cbCustomData: u32,
//     pub dwReserved: [u32; 6],
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIXERCONTROLA_1`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIXERCONTROLA_1`.Companion.`default`() : `MIXERCONTROLA_1` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIXERCONTROLDETAILS` (
    public var `cbStruct`: UInt,
    public var `dwControlID`: UInt,
    public var `cChannels`: UInt,
    public var `Anonymous`: `MIXERCONTROLDETAILS_0`,
    public var `cbDetails`: UInt,
    public var `paDetails`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIXERCONTROLDETAILS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIXERCONTROLDETAILS`.Companion.`default`() : `MIXERCONTROLDETAILS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1486:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union MIXERCONTROLDETAILS_0 {
//     pub hwndOwner: super::super::Foundation::HWND,
//     pub cMultipleItems: u32,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIXERCONTROLDETAILS_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIXERCONTROLDETAILS_0`.Companion.`default`() : `MIXERCONTROLDETAILS_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIXERCONTROLDETAILS_BOOLEAN` (
    public var `fValue`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIXERCONTROLDETAILS_LISTTEXTA` (
    public var `dwParam1`: UInt,
    public var `dwParam2`: UInt,
    public var `szName`: ByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIXERCONTROLDETAILS_LISTTEXTA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIXERCONTROLDETAILS_LISTTEXTA`.Companion.`default`() : `MIXERCONTROLDETAILS_LISTTEXTA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIXERCONTROLDETAILS_LISTTEXTW` (
    public var `dwParam1`: UInt,
    public var `dwParam2`: UInt,
    public var `szName`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIXERCONTROLDETAILS_LISTTEXTW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIXERCONTROLDETAILS_LISTTEXTW`.Companion.`default`() : `MIXERCONTROLDETAILS_LISTTEXTW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIXERCONTROLDETAILS_SIGNED` (
    public var `lValue`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIXERCONTROLDETAILS_UNSIGNED` (
    public var `dwValue`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIXERCONTROLW` (
    public var `cbStruct`: UInt,
    public var `dwControlID`: UInt,
    public var `dwControlType`: UInt,
    public var `fdwControl`: UInt,
    public var `cMultipleItems`: UInt,
    public var `szShortName`: UShortArray,
    public var `szName`: UShortArray,
    public var `Bounds`: `MIXERCONTROLW_0`,
    public var `Metrics`: `MIXERCONTROLW_1`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIXERCONTROLW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIXERCONTROLW`.Companion.`default`() : `MIXERCONTROLW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1554:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union MIXERCONTROLW_0 {
//     pub Anonymous1: MIXERCONTROLW_0_0,
//     pub Anonymous2: MIXERCONTROLW_0_1,
//     pub dwReserved: [u32; 6],
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIXERCONTROLW_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIXERCONTROLW_0`.Companion.`default`() : `MIXERCONTROLW_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIXERCONTROLW_0_0` (
    public var `lMinimum`: Int,
    public var `lMaximum`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIXERCONTROLW_0_1` (
    public var `dwMinimum`: UInt,
    public var `dwMaximum`: UInt,
)
// UNSUPPORTED Rust 1578:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union MIXERCONTROLW_1 {
//     pub cSteps: u32,
//     pub cbCustomData: u32,
//     pub dwReserved: [u32; 6],
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIXERCONTROLW_1`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIXERCONTROLW_1`.Companion.`default`() : `MIXERCONTROLW_1` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `MIXERCONTROL_CONTROLF_DISABLED`: Int = -2147483648;
public const val `MIXERCONTROL_CONTROLF_MULTIPLE`: Int = 2;
public const val `MIXERCONTROL_CONTROLF_UNIFORM`: Int = 1;
public const val `MIXERCONTROL_CONTROLTYPE_BASS`: UInt = 1342373890u;
public const val `MIXERCONTROL_CONTROLTYPE_BASS_BOOST`: UInt = 536945271u;
public const val `MIXERCONTROL_CONTROLTYPE_BOOLEAN`: UInt = 536936448u;
public const val `MIXERCONTROL_CONTROLTYPE_BOOLEANMETER`: UInt = 268500992u;
public const val `MIXERCONTROL_CONTROLTYPE_BUTTON`: UInt = 553713664u;
public const val `MIXERCONTROL_CONTROLTYPE_CUSTOM`: UInt = 0u;
public const val `MIXERCONTROL_CONTROLTYPE_DECIBELS`: UInt = 805568512u;
public const val `MIXERCONTROL_CONTROLTYPE_EQUALIZER`: UInt = 1342373892u;
public const val `MIXERCONTROL_CONTROLTYPE_FADER`: UInt = 1342373888u;
public const val `MIXERCONTROL_CONTROLTYPE_LOUDNESS`: UInt = 536936452u;
public const val `MIXERCONTROL_CONTROLTYPE_MICROTIME`: UInt = 1610809344u;
public const val `MIXERCONTROL_CONTROLTYPE_MILLITIME`: UInt = 1627586560u;
public const val `MIXERCONTROL_CONTROLTYPE_MIXER`: UInt = 1895890945u;
public const val `MIXERCONTROL_CONTROLTYPE_MONO`: UInt = 536936451u;
public const val `MIXERCONTROL_CONTROLTYPE_MULTIPLESELECT`: UInt = 1895890944u;
public const val `MIXERCONTROL_CONTROLTYPE_MUTE`: UInt = 536936450u;
public const val `MIXERCONTROL_CONTROLTYPE_MUX`: UInt = 1879113729u;
public const val `MIXERCONTROL_CONTROLTYPE_ONOFF`: UInt = 536936449u;
public const val `MIXERCONTROL_CONTROLTYPE_PAN`: UInt = 1073872897u;
public const val `MIXERCONTROL_CONTROLTYPE_PEAKMETER`: UInt = 268566529u;
public const val `MIXERCONTROL_CONTROLTYPE_PERCENT`: UInt = 805634048u;
public const val `MIXERCONTROL_CONTROLTYPE_QSOUNDPAN`: UInt = 1073872898u;
public const val `MIXERCONTROL_CONTROLTYPE_SIGNED`: UInt = 805437440u;
public const val `MIXERCONTROL_CONTROLTYPE_SIGNEDMETER`: UInt = 268566528u;
public const val `MIXERCONTROL_CONTROLTYPE_SINGLESELECT`: UInt = 1879113728u;
public const val `MIXERCONTROL_CONTROLTYPE_SLIDER`: UInt = 1073872896u;
public const val `MIXERCONTROL_CONTROLTYPE_STEREOENH`: UInt = 536936453u;
public const val `MIXERCONTROL_CONTROLTYPE_TREBLE`: UInt = 1342373891u;
public const val `MIXERCONTROL_CONTROLTYPE_UNSIGNED`: UInt = 805502976u;
public const val `MIXERCONTROL_CONTROLTYPE_UNSIGNEDMETER`: UInt = 268632064u;
public const val `MIXERCONTROL_CONTROLTYPE_VOLUME`: UInt = 1342373889u;
public const val `MIXERCONTROL_CT_CLASS_CUSTOM`: Int = 0;
public const val `MIXERCONTROL_CT_CLASS_FADER`: Int = 1342177280;
public const val `MIXERCONTROL_CT_CLASS_LIST`: Int = 1879048192;
public const val `MIXERCONTROL_CT_CLASS_MASK`: Int = -268435456;
public const val `MIXERCONTROL_CT_CLASS_METER`: Int = 268435456;
public const val `MIXERCONTROL_CT_CLASS_NUMBER`: Int = 805306368;
public const val `MIXERCONTROL_CT_CLASS_SLIDER`: Int = 1073741824;
public const val `MIXERCONTROL_CT_CLASS_SWITCH`: Int = 536870912;
public const val `MIXERCONTROL_CT_CLASS_TIME`: Int = 1610612736;
public const val `MIXERCONTROL_CT_SC_LIST_MULTIPLE`: Int = 16777216;
public const val `MIXERCONTROL_CT_SC_LIST_SINGLE`: Int = 0;
public const val `MIXERCONTROL_CT_SC_METER_POLLED`: Int = 0;
public const val `MIXERCONTROL_CT_SC_SWITCH_BOOLEAN`: Int = 0;
public const val `MIXERCONTROL_CT_SC_SWITCH_BUTTON`: Int = 16777216;
public const val `MIXERCONTROL_CT_SC_TIME_MICROSECS`: Int = 0;
public const val `MIXERCONTROL_CT_SC_TIME_MILLISECS`: Int = 16777216;
public const val `MIXERCONTROL_CT_SUBCLASS_MASK`: Int = 251658240;
public const val `MIXERCONTROL_CT_UNITS_BOOLEAN`: Int = 65536;
public const val `MIXERCONTROL_CT_UNITS_CUSTOM`: Int = 0;
public const val `MIXERCONTROL_CT_UNITS_DECIBELS`: Int = 262144;
public const val `MIXERCONTROL_CT_UNITS_MASK`: Int = 16711680;
public const val `MIXERCONTROL_CT_UNITS_PERCENT`: Int = 327680;
public const val `MIXERCONTROL_CT_UNITS_SIGNED`: Int = 131072;
public const val `MIXERCONTROL_CT_UNITS_UNSIGNED`: Int = 196608;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIXERLINEA` (
    public var `cbStruct`: UInt,
    public var `dwDestination`: UInt,
    public var `dwSource`: UInt,
    public var `dwLineID`: UInt,
    public var `fdwLine`: UInt,
    public var `dwUser`: ULong,
    public var `dwComponentType`: `MIXERLINE_COMPONENTTYPE`,
    public var `cChannels`: UInt,
    public var `cConnections`: UInt,
    public var `cControls`: UInt,
    public var `szShortName`: ByteArray,
    public var `szName`: ByteArray,
    public var `Target`: `MIXERLINEA_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIXERLINEA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIXERLINEA`.Companion.`default`() : `MIXERLINEA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIXERLINEA_0` (
    public var `dwType`: UInt,
    public var `dwDeviceID`: UInt,
    public var `wMid`: UShort,
    public var `wPid`: UShort,
    public var `vDriverVersion`: UInt,
    public var `szPname`: ByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIXERLINEA_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIXERLINEA_0`.Companion.`default`() : `MIXERLINEA_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIXERLINECONTROLSA` (
    public var `cbStruct`: UInt,
    public var `dwLineID`: UInt,
    public var `Anonymous`: `MIXERLINECONTROLSA_0`,
    public var `cControls`: UInt,
    public var `cbmxctrl`: UInt,
    public var `pamxctrl`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MIXERCONTROLA`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIXERLINECONTROLSA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIXERLINECONTROLSA`.Companion.`default`() : `MIXERLINECONTROLSA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1700:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union MIXERLINECONTROLSA_0 {
//     pub dwControlID: u32,
//     pub dwControlType: u32,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIXERLINECONTROLSA_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIXERLINECONTROLSA_0`.Companion.`default`() : `MIXERLINECONTROLSA_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIXERLINECONTROLSW` (
    public var `cbStruct`: UInt,
    public var `dwLineID`: UInt,
    public var `Anonymous`: `MIXERLINECONTROLSW_0`,
    public var `cControls`: UInt,
    public var `cbmxctrl`: UInt,
    public var `pamxctrl`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MIXERCONTROLW`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIXERLINECONTROLSW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIXERLINECONTROLSW`.Companion.`default`() : `MIXERLINECONTROLSW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1726:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union MIXERLINECONTROLSW_0 {
//     pub dwControlID: u32,
//     pub dwControlType: u32,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIXERLINECONTROLSW_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIXERLINECONTROLSW_0`.Companion.`default`() : `MIXERLINECONTROLSW_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIXERLINEW` (
    public var `cbStruct`: UInt,
    public var `dwDestination`: UInt,
    public var `dwSource`: UInt,
    public var `dwLineID`: UInt,
    public var `fdwLine`: UInt,
    public var `dwUser`: ULong,
    public var `dwComponentType`: `MIXERLINE_COMPONENTTYPE`,
    public var `cChannels`: UInt,
    public var `cConnections`: UInt,
    public var `cControls`: UInt,
    public var `szShortName`: UShortArray,
    public var `szName`: UShortArray,
    public var `Target`: `MIXERLINEW_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIXERLINEW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIXERLINEW`.Companion.`default`() : `MIXERLINEW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIXERLINEW_0` (
    public var `dwType`: UInt,
    public var `dwDeviceID`: UInt,
    public var `wMid`: UShort,
    public var `wPid`: UShort,
    public var `vDriverVersion`: UInt,
    public var `szPname`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIXERLINEW_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIXERLINEW_0`.Companion.`default`() : `MIXERLINEW_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `MIXERLINE_COMPONENTTYPE` = UInt;
public const val `MIXERLINE_COMPONENTTYPE_DST_DIGITAL`: `MIXERLINE_COMPONENTTYPE` = 1u;
public const val `MIXERLINE_COMPONENTTYPE_DST_FIRST`: Int = 0;
public const val `MIXERLINE_COMPONENTTYPE_DST_HEADPHONES`: `MIXERLINE_COMPONENTTYPE` = 5u;
public const val `MIXERLINE_COMPONENTTYPE_DST_LAST`: UInt = 8u;
public const val `MIXERLINE_COMPONENTTYPE_DST_LINE`: `MIXERLINE_COMPONENTTYPE` = 2u;
public const val `MIXERLINE_COMPONENTTYPE_DST_MONITOR`: `MIXERLINE_COMPONENTTYPE` = 3u;
public const val `MIXERLINE_COMPONENTTYPE_DST_SPEAKERS`: `MIXERLINE_COMPONENTTYPE` = 4u;
public const val `MIXERLINE_COMPONENTTYPE_DST_TELEPHONE`: `MIXERLINE_COMPONENTTYPE` = 6u;
public const val `MIXERLINE_COMPONENTTYPE_DST_UNDEFINED`: `MIXERLINE_COMPONENTTYPE` = 0u;
public const val `MIXERLINE_COMPONENTTYPE_DST_VOICEIN`: `MIXERLINE_COMPONENTTYPE` = 8u;
public const val `MIXERLINE_COMPONENTTYPE_DST_WAVEIN`: `MIXERLINE_COMPONENTTYPE` = 7u;
public const val `MIXERLINE_COMPONENTTYPE_SRC_ANALOG`: `MIXERLINE_COMPONENTTYPE` = 4106u;
public const val `MIXERLINE_COMPONENTTYPE_SRC_AUXILIARY`: `MIXERLINE_COMPONENTTYPE` = 4105u;
public const val `MIXERLINE_COMPONENTTYPE_SRC_COMPACTDISC`: `MIXERLINE_COMPONENTTYPE` = 4101u;
public const val `MIXERLINE_COMPONENTTYPE_SRC_DIGITAL`: `MIXERLINE_COMPONENTTYPE` = 4097u;
public const val `MIXERLINE_COMPONENTTYPE_SRC_FIRST`: Int = 4096;
public const val `MIXERLINE_COMPONENTTYPE_SRC_LAST`: UInt = 4106u;
public const val `MIXERLINE_COMPONENTTYPE_SRC_LINE`: `MIXERLINE_COMPONENTTYPE` = 4098u;
public const val `MIXERLINE_COMPONENTTYPE_SRC_MICROPHONE`: `MIXERLINE_COMPONENTTYPE` = 4099u;
public const val `MIXERLINE_COMPONENTTYPE_SRC_PCSPEAKER`: `MIXERLINE_COMPONENTTYPE` = 4103u;
public const val `MIXERLINE_COMPONENTTYPE_SRC_SYNTHESIZER`: `MIXERLINE_COMPONENTTYPE` = 4100u;
public const val `MIXERLINE_COMPONENTTYPE_SRC_TELEPHONE`: `MIXERLINE_COMPONENTTYPE` = 4102u;
public const val `MIXERLINE_COMPONENTTYPE_SRC_UNDEFINED`: `MIXERLINE_COMPONENTTYPE` = 4096u;
public const val `MIXERLINE_COMPONENTTYPE_SRC_WAVEOUT`: `MIXERLINE_COMPONENTTYPE` = 4104u;
public const val `MIXERLINE_LINEF_ACTIVE`: Int = 1;
public const val `MIXERLINE_LINEF_DISCONNECTED`: Int = 32768;
public const val `MIXERLINE_LINEF_SOURCE`: Int = -2147483648;
public const val `MIXERLINE_TARGETTYPE_AUX`: UInt = 5u;
public const val `MIXERLINE_TARGETTYPE_MIDIIN`: UInt = 4u;
public const val `MIXERLINE_TARGETTYPE_MIDIOUT`: UInt = 3u;
public const val `MIXERLINE_TARGETTYPE_UNDEFINED`: UInt = 0u;
public const val `MIXERLINE_TARGETTYPE_WAVEIN`: UInt = 2u;
public const val `MIXERLINE_TARGETTYPE_WAVEOUT`: UInt = 1u;
public const val `MIXERR_INVALCONTROL`: UInt = 1025u;
public const val `MIXERR_INVALLINE`: UInt = 1024u;
public const val `MIXERR_INVALVALUE`: UInt = 1026u;
public const val `MIXERR_LASTERROR`: UInt = 1026u;
public const val `MIXER_GETCONTROLDETAILSF_LISTTEXT`: Int = 1;
public const val `MIXER_GETCONTROLDETAILSF_QUERYMASK`: Int = 15;
public const val `MIXER_GETCONTROLDETAILSF_VALUE`: Int = 0;
public const val `MIXER_GETLINECONTROLSF_ALL`: Int = 0;
public const val `MIXER_GETLINECONTROLSF_ONEBYID`: Int = 1;
public const val `MIXER_GETLINECONTROLSF_ONEBYTYPE`: Int = 2;
public const val `MIXER_GETLINECONTROLSF_QUERYMASK`: Int = 15;
public const val `MIXER_GETLINEINFOF_COMPONENTTYPE`: Int = 3;
public const val `MIXER_GETLINEINFOF_DESTINATION`: Int = 0;
public const val `MIXER_GETLINEINFOF_LINEID`: Int = 2;
public const val `MIXER_GETLINEINFOF_QUERYMASK`: Int = 15;
public const val `MIXER_GETLINEINFOF_SOURCE`: Int = 1;
public const val `MIXER_GETLINEINFOF_TARGETTYPE`: Int = 4;
public const val `MIXER_LONG_NAME_CHARS`: UInt = 64u;
public const val `MIXER_OBJECTF_AUX`: Int = 1342177280;
public const val `MIXER_OBJECTF_HANDLE`: Int = -2147483648;
public const val `MIXER_OBJECTF_MIDIIN`: Int = 1073741824;
public const val `MIXER_OBJECTF_MIDIOUT`: Int = 805306368;
public const val `MIXER_OBJECTF_MIXER`: Int = 0;
public const val `MIXER_OBJECTF_WAVEIN`: Int = 536870912;
public const val `MIXER_OBJECTF_WAVEOUT`: Int = 268435456;
public const val `MIXER_SETCONTROLDETAILSF_CUSTOM`: Int = 1;
public const val `MIXER_SETCONTROLDETAILSF_QUERYMASK`: Int = 15;
public const val `MIXER_SETCONTROLDETAILSF_VALUE`: Int = 0;
public const val `MIXER_SHORT_NAME_CHARS`: UInt = 16u;
// UNSUPPORTED Rust 1837:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const MMDeviceEnumerator: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbcde0395_e52f_467c_8e3d_c4579291692e);

public const val `MM_ACM_FILTERCHOOSE`: UInt = 32768u;
public const val `MM_ACM_FORMATCHOOSE`: UInt = 32768u;
public const val `MOD_FMSYNTH`: UInt = 4u;
public const val `MOD_MAPPER`: UInt = 5u;
public const val `MOD_MIDIPORT`: UInt = 1u;
public const val `MOD_SQSYNTH`: UInt = 3u;
public const val `MOD_SWSYNTH`: UInt = 7u;
public const val `MOD_SYNTH`: UInt = 2u;
public const val `MOD_WAVETABLE`: UInt = 6u;
public const val `Microphone`: `EndpointFormFactor` = 4;
public const val `Muted`: `AudioStateMonitorSoundLevel` = 0;
public const val `Out`: `DataFlow` = 1;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PAudioStateMonitorCallback` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PCMWAVEFORMAT` (
    public var `wf`: `WAVEFORMAT`,
    public var `wBitsPerSample`: UShort,
)
// UNSUPPORTED Rust 1857:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const PKEY_AudioEndpointLogo_IconEffects: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xf1ab780d_2010_4ed3_a3a6_8b87f0f0c476), pid: 0 };

// UNSUPPORTED Rust 1858:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const PKEY_AudioEndpointLogo_IconPath: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xf1ab780d_2010_4ed3_a3a6_8b87f0f0c476), pid: 1 };

// UNSUPPORTED Rust 1859:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const PKEY_AudioEndpointSettings_LaunchContract: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x14242002_0320_4de4_9555_a7d82b73c286), pid: 1 };

// UNSUPPORTED Rust 1860:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const PKEY_AudioEndpointSettings_MenuText: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x14242002_0320_4de4_9555_a7d82b73c286), pid: 0 };

// UNSUPPORTED Rust 1861:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const PKEY_AudioEndpoint_Association: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1da5d803_d492_4edd_8c23_e0c0ffee7f0e), pid: 2 };

// UNSUPPORTED Rust 1862:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const PKEY_AudioEndpoint_ControlPanelPageProvider: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1da5d803_d492_4edd_8c23_e0c0ffee7f0e), pid: 1 };

// UNSUPPORTED Rust 1863:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const PKEY_AudioEndpoint_Default_VolumeInDb: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1da5d803_d492_4edd_8c23_e0c0ffee7f0e), pid: 9 };

// UNSUPPORTED Rust 1864:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const PKEY_AudioEndpoint_Disable_SysFx: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1da5d803_d492_4edd_8c23_e0c0ffee7f0e), pid: 5 };

// UNSUPPORTED Rust 1865:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const PKEY_AudioEndpoint_FormFactor: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1da5d803_d492_4edd_8c23_e0c0ffee7f0e), pid: 0 };

// UNSUPPORTED Rust 1866:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const PKEY_AudioEndpoint_FullRangeSpeakers: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1da5d803_d492_4edd_8c23_e0c0ffee7f0e), pid: 6 };

// UNSUPPORTED Rust 1867:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const PKEY_AudioEndpoint_GUID: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1da5d803_d492_4edd_8c23_e0c0ffee7f0e), pid: 4 };

// UNSUPPORTED Rust 1868:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const PKEY_AudioEndpoint_JackSubType: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1da5d803_d492_4edd_8c23_e0c0ffee7f0e), pid: 8 };

// UNSUPPORTED Rust 1869:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const PKEY_AudioEndpoint_PhysicalSpeakers: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1da5d803_d492_4edd_8c23_e0c0ffee7f0e), pid: 3 };

// UNSUPPORTED Rust 1870:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const PKEY_AudioEndpoint_Supports_EventDriven_Mode: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1da5d803_d492_4edd_8c23_e0c0ffee7f0e), pid: 7 };

// UNSUPPORTED Rust 1871:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const PKEY_AudioEngine_DeviceFormat: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xf19f064d_082c_4e27_bc73_6882a1bb8e4c), pid: 0 };

// UNSUPPORTED Rust 1872:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const PKEY_AudioEngine_OEMFormat: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xe4870e26_3cc5_4cd2_ba46_ca0a9a70ed04), pid: 3 };

public typealias `PROCESS_LOOPBACK_MODE` = Int;
public const val `PROCESS_LOOPBACK_MODE_EXCLUDE_TARGET_PROCESS_TREE`: `PROCESS_LOOPBACK_MODE` = 1;
public const val `PROCESS_LOOPBACK_MODE_INCLUDE_TARGET_PROCESS_TREE`: `PROCESS_LOOPBACK_MODE` = 0;
public typealias `PartType` = Int;
public const val `RemoteNetworkDevice`: `EndpointFormFactor` = 0;
public const val `SND_ALIAS`: `SND_FLAGS` = 65536u;
public const val `SND_ALIAS_ID`: `SND_FLAGS` = 1114112u;
public const val `SND_ALIAS_START`: UInt = 0u;
public const val `SND_APPLICATION`: `SND_FLAGS` = 128u;
public const val `SND_ASYNC`: `SND_FLAGS` = 1u;
public const val `SND_FILENAME`: `SND_FLAGS` = 131072u;
public typealias `SND_FLAGS` = UInt;
public const val `SND_LOOP`: `SND_FLAGS` = 8u;
public const val `SND_MEMORY`: `SND_FLAGS` = 4u;
public const val `SND_NODEFAULT`: `SND_FLAGS` = 2u;
public const val `SND_NOSTOP`: `SND_FLAGS` = 16u;
public const val `SND_NOWAIT`: `SND_FLAGS` = 8192u;
public const val `SND_PURGE`: `SND_FLAGS` = 64u;
public const val `SND_RESOURCE`: `SND_FLAGS` = 262148u;
public const val `SND_RING`: Int = 1048576;
public const val `SND_SENTRY`: `SND_FLAGS` = 524288u;
public const val `SND_SYNC`: `SND_FLAGS` = 0u;
public const val `SND_SYSTEM`: `SND_FLAGS` = 2097152u;
public const val `SPATIAL_AUDIO_POSITION`: UInt = 200u;
public const val `SPATIAL_AUDIO_STANDARD_COMMANDS_START`: UInt = 200u;
public typealias `SPATIAL_AUDIO_STREAM_OPTIONS` = Int;
public const val `SPATIAL_AUDIO_STREAM_OPTIONS_NONE`: `SPATIAL_AUDIO_STREAM_OPTIONS` = 0;
public const val `SPATIAL_AUDIO_STREAM_OPTIONS_OFFLOAD`: `SPATIAL_AUDIO_STREAM_OPTIONS` = 1;
public const val `SPDIF`: `EndpointFormFactor` = 8;
public const val `SPTLAUDCLNT_E_DESTROYED`: Int = -2004287232;
public const val `SPTLAUDCLNT_E_ERRORS_IN_OBJECT_CALLS`: Int = -2004287227;
public const val `SPTLAUDCLNT_E_INTERNAL`: Int = -2004287219;
public const val `SPTLAUDCLNT_E_INVALID_LICENSE`: Int = -2004287224;
public const val `SPTLAUDCLNT_E_METADATA_FORMAT_NOT_SUPPORTED`: Int = -2004287226;
public const val `SPTLAUDCLNT_E_NO_MORE_OBJECTS`: Int = -2004287229;
public const val `SPTLAUDCLNT_E_OBJECT_ALREADY_ACTIVE`: Int = -2004287220;
public const val `SPTLAUDCLNT_E_OUT_OF_ORDER`: Int = -2004287231;
public const val `SPTLAUDCLNT_E_PROPERTY_NOT_SUPPORTED`: Int = -2004287228;
public const val `SPTLAUDCLNT_E_RESOURCES_INVALIDATED`: Int = -2004287230;
public const val `SPTLAUDCLNT_E_STATIC_OBJECT_NOT_AVAILABLE`: Int = -2004287221;
public const val `SPTLAUDCLNT_E_STREAM_NOT_AVAILABLE`: Int = -2004287225;
public const val `SPTLAUDCLNT_E_STREAM_NOT_STOPPED`: Int = -2004287222;
public const val `SPTLAUD_MD_CLNT_E_ATTACH_FAILED_INTERNAL_BUFFER`: Int = -2004286956;
public const val `SPTLAUD_MD_CLNT_E_BUFFER_ALREADY_ATTACHED`: Int = -2004286969;
public const val `SPTLAUD_MD_CLNT_E_BUFFER_NOT_ATTACHED`: Int = -2004286968;
public const val `SPTLAUD_MD_CLNT_E_BUFFER_STILL_ATTACHED`: Int = -2004286940;
public const val `SPTLAUD_MD_CLNT_E_COMMAND_ALREADY_WRITTEN`: Int = -2004286942;
public const val `SPTLAUD_MD_CLNT_E_COMMAND_NOT_FOUND`: Int = -2004286976;
public const val `SPTLAUD_MD_CLNT_E_DETACH_FAILED_INTERNAL_BUFFER`: Int = -2004286955;
public const val `SPTLAUD_MD_CLNT_E_FORMAT_MISMATCH`: Int = -2004286941;
public const val `SPTLAUD_MD_CLNT_E_FRAMECOUNT_OUT_OF_RANGE`: Int = -2004286967;
public const val `SPTLAUD_MD_CLNT_E_FRAMEOFFSET_OUT_OF_RANGE`: Int = -2004286952;
public const val `SPTLAUD_MD_CLNT_E_INVALID_ARGS`: Int = -2004286974;
public const val `SPTLAUD_MD_CLNT_E_ITEMS_ALREADY_OPEN`: Int = -2004286957;
public const val `SPTLAUD_MD_CLNT_E_ITEMS_LOCKED_FOR_WRITING`: Int = -2004286939;
public const val `SPTLAUD_MD_CLNT_E_ITEM_COPY_OVERFLOW`: Int = -2004286959;
public const val `SPTLAUD_MD_CLNT_E_ITEM_MUST_HAVE_COMMANDS`: Int = -2004286951;
public const val `SPTLAUD_MD_CLNT_E_MEMORY_BOUNDS`: Int = -2004286971;
public const val `SPTLAUD_MD_CLNT_E_METADATA_FORMAT_NOT_FOUND`: Int = -2004286973;
public const val `SPTLAUD_MD_CLNT_E_NO_BUFFER_ATTACHED`: Int = -2004286954;
public const val `SPTLAUD_MD_CLNT_E_NO_ITEMOFFSET_WRITTEN`: Int = -2004286944;
public const val `SPTLAUD_MD_CLNT_E_NO_ITEMS_FOUND`: Int = -2004286960;
public const val `SPTLAUD_MD_CLNT_E_NO_ITEMS_OPEN`: Int = -2004286958;
public const val `SPTLAUD_MD_CLNT_E_NO_ITEMS_WRITTEN`: Int = -2004286943;
public const val `SPTLAUD_MD_CLNT_E_NO_MORE_COMMANDS`: Int = -2004286970;
public const val `SPTLAUD_MD_CLNT_E_NO_MORE_ITEMS`: Int = -2004286953;
public const val `SPTLAUD_MD_CLNT_E_OBJECT_NOT_INITIALIZED`: Int = -2004286975;
public const val `SPTLAUD_MD_CLNT_E_VALUE_BUFFER_INCORRECT_SIZE`: Int = -2004286972;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SpatialAudioClientActivationParams` (
    public var `tracingContextId`: `windows_sys`.`core`.`GUID`,
    public var `appId`: `windows_sys`.`core`.`GUID`,
    public var `majorVersion`: Int,
    public var `minorVersion1`: Int,
    public var `minorVersion2`: Int,
    public var `minorVersion3`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SpatialAudioHrtfActivationParams` (
    public var `ObjectFormat`: /* Rust *const */ kotlinx.cinterop.CPointer<`WAVEFORMATEX`>?,
    public var `StaticObjectTypeMask`: `AudioObjectType`,
    public var `MinDynamicObjectCount`: UInt,
    public var `MaxDynamicObjectCount`: UInt,
    public var `Category`: `AUDIO_STREAM_CATEGORY`,
    public var `EventHandle`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `NotifyObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `DistanceDecay`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SpatialAudioHrtfDistanceDecay`>?,
    public var `Directivity`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SpatialAudioHrtfDirectivityUnion`>?,
    public var `Environment`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SpatialAudioHrtfEnvironmentType`>?,
    public var `Orientation`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SpatialAudioHrtfActivationParams`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SpatialAudioHrtfActivationParams`.Companion.`default`() : `SpatialAudioHrtfActivationParams` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SpatialAudioHrtfActivationParams2` (
    public var `ObjectFormat`: /* Rust *const */ kotlinx.cinterop.CPointer<`WAVEFORMATEX`>?,
    public var `StaticObjectTypeMask`: `AudioObjectType`,
    public var `MinDynamicObjectCount`: UInt,
    public var `MaxDynamicObjectCount`: UInt,
    public var `Category`: `AUDIO_STREAM_CATEGORY`,
    public var `EventHandle`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `NotifyObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `DistanceDecay`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SpatialAudioHrtfDistanceDecay`>?,
    public var `Directivity`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SpatialAudioHrtfDirectivityUnion`>?,
    public var `Environment`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SpatialAudioHrtfEnvironmentType`>?,
    public var `Orientation`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?,
    public var `Options`: `SPATIAL_AUDIO_STREAM_OPTIONS`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SpatialAudioHrtfActivationParams2`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SpatialAudioHrtfActivationParams2`.Companion.`default`() : `SpatialAudioHrtfActivationParams2` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SpatialAudioHrtfDirectivity` (
    public var `Type`: `SpatialAudioHrtfDirectivityType`,
    public var `Scaling`: Float,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SpatialAudioHrtfDirectivityCardioid` (
    public var `directivity`: `SpatialAudioHrtfDirectivity`,
    public var `Order`: Float,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SpatialAudioHrtfDirectivityCone` (
    public var `directivity`: `SpatialAudioHrtfDirectivity`,
    public var `InnerAngle`: Float,
    public var `OuterAngle`: Float,
)
public typealias `SpatialAudioHrtfDirectivityType` = Int;
// UNSUPPORTED Rust 2012:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SpatialAudioHrtfDirectivityUnion {
//     pub Cone: SpatialAudioHrtfDirectivityCone,
//     pub Cardiod: SpatialAudioHrtfDirectivityCardioid,
//     pub Omni: SpatialAudioHrtfDirectivity,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SpatialAudioHrtfDirectivityUnion`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SpatialAudioHrtfDirectivityUnion`.Companion.`default`() : `SpatialAudioHrtfDirectivityUnion` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `SpatialAudioHrtfDirectivity_Cardioid`: `SpatialAudioHrtfDirectivityType` = 1;
public const val `SpatialAudioHrtfDirectivity_Cone`: `SpatialAudioHrtfDirectivityType` = 2;
public const val `SpatialAudioHrtfDirectivity_OmniDirectional`: `SpatialAudioHrtfDirectivityType` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SpatialAudioHrtfDistanceDecay` (
    public var `Type`: `SpatialAudioHrtfDistanceDecayType`,
    public var `MaxGain`: Float,
    public var `MinGain`: Float,
    public var `UnityGainDistance`: Float,
    public var `CutoffDistance`: Float,
)
public typealias `SpatialAudioHrtfDistanceDecayType` = Int;
public const val `SpatialAudioHrtfDistanceDecay_CustomDecay`: `SpatialAudioHrtfDistanceDecayType` = 1;
public const val `SpatialAudioHrtfDistanceDecay_NaturalDecay`: `SpatialAudioHrtfDistanceDecayType` = 0;
public typealias `SpatialAudioHrtfEnvironmentType` = Int;
public const val `SpatialAudioHrtfEnvironment_Average`: `SpatialAudioHrtfEnvironmentType` = 4;
public const val `SpatialAudioHrtfEnvironment_Large`: `SpatialAudioHrtfEnvironmentType` = 2;
public const val `SpatialAudioHrtfEnvironment_Medium`: `SpatialAudioHrtfEnvironmentType` = 1;
public const val `SpatialAudioHrtfEnvironment_Outdoors`: `SpatialAudioHrtfEnvironmentType` = 3;
public const val `SpatialAudioHrtfEnvironment_Small`: `SpatialAudioHrtfEnvironmentType` = 0;
public typealias `SpatialAudioMetadataCopyMode` = Int;
public const val `SpatialAudioMetadataCopy_Append`: `SpatialAudioMetadataCopyMode` = 1;
public const val `SpatialAudioMetadataCopy_AppendMergeWithFirst`: `SpatialAudioMetadataCopyMode` = 3;
public const val `SpatialAudioMetadataCopy_AppendMergeWithLast`: `SpatialAudioMetadataCopyMode` = 2;
public const val `SpatialAudioMetadataCopy_Overwrite`: `SpatialAudioMetadataCopyMode` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SpatialAudioMetadataItemsInfo` (
    public var `FrameCount`: UShort,
    public var `ItemCount`: UShort,
    public var `MaxItemCount`: UShort,
    public var `MaxValueBufferLength`: UInt,
)
public typealias `SpatialAudioMetadataWriterOverflowMode` = Int;
public const val `SpatialAudioMetadataWriterOverflow_Fail`: `SpatialAudioMetadataWriterOverflowMode` = 0;
public const val `SpatialAudioMetadataWriterOverflow_MergeWithLast`: `SpatialAudioMetadataWriterOverflowMode` = 2;
public const val `SpatialAudioMetadataWriterOverflow_MergeWithNew`: `SpatialAudioMetadataWriterOverflowMode` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SpatialAudioObjectRenderStreamActivationParams` (
    public var `ObjectFormat`: /* Rust *const */ kotlinx.cinterop.CPointer<`WAVEFORMATEX`>?,
    public var `StaticObjectTypeMask`: `AudioObjectType`,
    public var `MinDynamicObjectCount`: UInt,
    public var `MaxDynamicObjectCount`: UInt,
    public var `Category`: `AUDIO_STREAM_CATEGORY`,
    public var `EventHandle`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `NotifyObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SpatialAudioObjectRenderStreamActivationParams`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SpatialAudioObjectRenderStreamActivationParams`.Companion.`default`() : `SpatialAudioObjectRenderStreamActivationParams` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SpatialAudioObjectRenderStreamActivationParams2` (
    public var `ObjectFormat`: /* Rust *const */ kotlinx.cinterop.CPointer<`WAVEFORMATEX`>?,
    public var `StaticObjectTypeMask`: `AudioObjectType`,
    public var `MinDynamicObjectCount`: UInt,
    public var `MaxDynamicObjectCount`: UInt,
    public var `Category`: `AUDIO_STREAM_CATEGORY`,
    public var `EventHandle`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `NotifyObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Options`: `SPATIAL_AUDIO_STREAM_OPTIONS`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SpatialAudioObjectRenderStreamActivationParams2`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SpatialAudioObjectRenderStreamActivationParams2`.Companion.`default`() : `SpatialAudioObjectRenderStreamActivationParams2` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SpatialAudioObjectRenderStreamForMetadataActivationParams` (
    public var `ObjectFormat`: /* Rust *const */ kotlinx.cinterop.CPointer<`WAVEFORMATEX`>?,
    public var `StaticObjectTypeMask`: `AudioObjectType`,
    public var `MinDynamicObjectCount`: UInt,
    public var `MaxDynamicObjectCount`: UInt,
    public var `Category`: `AUDIO_STREAM_CATEGORY`,
    public var `EventHandle`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `MetadataFormatId`: `windows_sys`.`core`.`GUID`,
    public var `MaxMetadataItemCount`: UShort,
    public var `MetadataActivationParams`: /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Com`.`StructuredStorage`.`PROPVARIANT`>?,
    public var `NotifyObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SpatialAudioObjectRenderStreamForMetadataActivationParams`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]

    public fun `SpatialAudioObjectRenderStreamForMetadataActivationParams`.Companion.`default`() : `SpatialAudioObjectRenderStreamForMetadataActivationParams` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SpatialAudioObjectRenderStreamForMetadataActivationParams2` (
    public var `ObjectFormat`: /* Rust *const */ kotlinx.cinterop.CPointer<`WAVEFORMATEX`>?,
    public var `StaticObjectTypeMask`: `AudioObjectType`,
    public var `MinDynamicObjectCount`: UInt,
    public var `MaxDynamicObjectCount`: UInt,
    public var `Category`: `AUDIO_STREAM_CATEGORY`,
    public var `EventHandle`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `MetadataFormatId`: `windows_sys`.`core`.`GUID`,
    public var `MaxMetadataItemCount`: UInt,
    public var `MetadataActivationParams`: /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Com`.`StructuredStorage`.`PROPVARIANT`>?,
    public var `NotifyObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Options`: `SPATIAL_AUDIO_STREAM_OPTIONS`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SpatialAudioObjectRenderStreamForMetadataActivationParams2`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]

    public fun `SpatialAudioObjectRenderStreamForMetadataActivationParams2`.Companion.`default`() : `SpatialAudioObjectRenderStreamForMetadataActivationParams2` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `Speakers`: `EndpointFormFactor` = 1;
public const val `Subunit`: `PartType` = 1;
public const val `UnknownDigitalPassthrough`: `EndpointFormFactor` = 7;
public const val `UnknownFormFactor`: `EndpointFormFactor` = 10;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VIRTUAL_AUDIO_DEVICE_PROCESS_LOOPBACK`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("VAD\\Process_Loopback");
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VOLUMEWAVEFILTER` (
    public var `wfltr`: `WAVEFILTER`,
    public var `dwVolume`: UInt,
)
public const val `WAVECAPS_LRVOLUME`: UInt = 8u;
public const val `WAVECAPS_PITCH`: UInt = 1u;
public const val `WAVECAPS_PLAYBACKRATE`: UInt = 2u;
public const val `WAVECAPS_SAMPLEACCURATE`: UInt = 32u;
public const val `WAVECAPS_SYNC`: UInt = 16u;
public const val `WAVECAPS_VOLUME`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 5 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WAVEFILTER` (
    public var `cbStruct`: UInt,
    public var `dwFilterTag`: UInt,
    public var `fdwFilter`: UInt,
    public var `dwReserved`: UIntArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WAVEFILTER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WAVEFILTER`.Companion.`default`() : `WAVEFILTER` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WAVEFORMAT` (
    public var `wFormatTag`: UShort,
    public var `nChannels`: UShort,
    public var `nSamplesPerSec`: UInt,
    public var `nAvgBytesPerSec`: UInt,
    public var `nBlockAlign`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WAVEFORMATEX` (
    public var `wFormatTag`: UShort,
    public var `nChannels`: UShort,
    public var `nSamplesPerSec`: UInt,
    public var `nAvgBytesPerSec`: UInt,
    public var `nBlockAlign`: UShort,
    public var `wBitsPerSample`: UShort,
    public var `cbSize`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WAVEFORMATEXTENSIBLE` (
    public var `Format`: `WAVEFORMATEX`,
    public var `Samples`: `WAVEFORMATEXTENSIBLE_0`,
    public var `dwChannelMask`: UInt,
    public var `SubFormat`: `windows_sys`.`core`.`GUID`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WAVEFORMATEXTENSIBLE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WAVEFORMATEXTENSIBLE`.Companion.`default`() : `WAVEFORMATEXTENSIBLE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 2201:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union WAVEFORMATEXTENSIBLE_0 {
//     pub wValidBitsPerSample: u16,
//     pub wSamplesPerBlock: u16,
//     pub wReserved: u16,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WAVEFORMATEXTENSIBLE_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WAVEFORMATEXTENSIBLE_0`.Companion.`default`() : `WAVEFORMATEXTENSIBLE_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WAVEHDR` (
    public var `lpData`: `windows_sys`.`core`.`PSTR`,
    public var `dwBufferLength`: UInt,
    public var `dwBytesRecorded`: UInt,
    public var `dwUser`: ULong,
    public var `dwFlags`: UInt,
    public var `dwLoops`: UInt,
    public var `lpNext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEHDR`>?,
    public var `reserved`: ULong,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WAVEHDR`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WAVEHDR`.Companion.`default`() : `WAVEHDR` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WAVEINCAPS2A` (
    public var `wMid`: UShort,
    public var `wPid`: UShort,
    public var `vDriverVersion`: UInt,
    public var `szPname`: ByteArray,
    public var `dwFormats`: UInt,
    public var `wChannels`: UShort,
    public var `wReserved1`: UShort,
    public var `ManufacturerGuid`: `windows_sys`.`core`.`GUID`,
    public var `ProductGuid`: `windows_sys`.`core`.`GUID`,
    public var `NameGuid`: `windows_sys`.`core`.`GUID`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WAVEINCAPS2A`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WAVEINCAPS2A`.Companion.`default`() : `WAVEINCAPS2A` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WAVEINCAPS2W` (
    public var `wMid`: UShort,
    public var `wPid`: UShort,
    public var `vDriverVersion`: UInt,
    public var `szPname`: UShortArray,
    public var `dwFormats`: UInt,
    public var `wChannels`: UShort,
    public var `wReserved1`: UShort,
    public var `ManufacturerGuid`: `windows_sys`.`core`.`GUID`,
    public var `ProductGuid`: `windows_sys`.`core`.`GUID`,
    public var `NameGuid`: `windows_sys`.`core`.`GUID`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WAVEINCAPS2W`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WAVEINCAPS2W`.Companion.`default`() : `WAVEINCAPS2W` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WAVEINCAPSA` (
    public var `wMid`: UShort,
    public var `wPid`: UShort,
    public var `vDriverVersion`: UInt,
    public var `szPname`: ByteArray,
    public var `dwFormats`: UInt,
    public var `wChannels`: UShort,
    public var `wReserved1`: UShort,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WAVEINCAPSA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WAVEINCAPSA`.Companion.`default`() : `WAVEINCAPSA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WAVEINCAPSW` (
    public var `wMid`: UShort,
    public var `wPid`: UShort,
    public var `vDriverVersion`: UInt,
    public var `szPname`: UShortArray,
    public var `dwFormats`: UInt,
    public var `wChannels`: UShort,
    public var `wReserved1`: UShort,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WAVEINCAPSW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WAVEINCAPSW`.Companion.`default`() : `WAVEINCAPSW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `WAVEIN_MAPPER_STATUS_DEVICE`: UInt = 0u;
public const val `WAVEIN_MAPPER_STATUS_FORMAT`: UInt = 2u;
public const val `WAVEIN_MAPPER_STATUS_MAPPED`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WAVEOUTCAPS2A` (
    public var `wMid`: UShort,
    public var `wPid`: UShort,
    public var `vDriverVersion`: UInt,
    public var `szPname`: ByteArray,
    public var `dwFormats`: UInt,
    public var `wChannels`: UShort,
    public var `wReserved1`: UShort,
    public var `dwSupport`: UInt,
    public var `ManufacturerGuid`: `windows_sys`.`core`.`GUID`,
    public var `ProductGuid`: `windows_sys`.`core`.`GUID`,
    public var `NameGuid`: `windows_sys`.`core`.`GUID`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WAVEOUTCAPS2A`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WAVEOUTCAPS2A`.Companion.`default`() : `WAVEOUTCAPS2A` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WAVEOUTCAPS2W` (
    public var `wMid`: UShort,
    public var `wPid`: UShort,
    public var `vDriverVersion`: UInt,
    public var `szPname`: UShortArray,
    public var `dwFormats`: UInt,
    public var `wChannels`: UShort,
    public var `wReserved1`: UShort,
    public var `dwSupport`: UInt,
    public var `ManufacturerGuid`: `windows_sys`.`core`.`GUID`,
    public var `ProductGuid`: `windows_sys`.`core`.`GUID`,
    public var `NameGuid`: `windows_sys`.`core`.`GUID`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WAVEOUTCAPS2W`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WAVEOUTCAPS2W`.Companion.`default`() : `WAVEOUTCAPS2W` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WAVEOUTCAPSA` (
    public var `wMid`: UShort,
    public var `wPid`: UShort,
    public var `vDriverVersion`: UInt,
    public var `szPname`: ByteArray,
    public var `dwFormats`: UInt,
    public var `wChannels`: UShort,
    public var `wReserved1`: UShort,
    public var `dwSupport`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WAVEOUTCAPSA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WAVEOUTCAPSA`.Companion.`default`() : `WAVEOUTCAPSA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WAVEOUTCAPSW` (
    public var `wMid`: UShort,
    public var `wPid`: UShort,
    public var `vDriverVersion`: UInt,
    public var `szPname`: UShortArray,
    public var `dwFormats`: UInt,
    public var `wChannels`: UShort,
    public var `wReserved1`: UShort,
    public var `dwSupport`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WAVEOUTCAPSW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WAVEOUTCAPSW`.Companion.`default`() : `WAVEOUTCAPSW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `WAVEOUT_MAPPER_STATUS_DEVICE`: UInt = 0u;
public const val `WAVEOUT_MAPPER_STATUS_FORMAT`: UInt = 2u;
public const val `WAVEOUT_MAPPER_STATUS_MAPPED`: UInt = 1u;
public const val `WAVERR_BADFORMAT`: UInt = 32u;
public const val `WAVERR_LASTERROR`: UInt = 35u;
public const val `WAVERR_STILLPLAYING`: UInt = 33u;
public const val `WAVERR_SYNC`: UInt = 35u;
public const val `WAVERR_UNPREPARED`: UInt = 34u;
public const val `WAVE_ALLOWSYNC`: `MIDI_WAVE_OPEN_TYPE` = 2u;
public const val `WAVE_FORMAT_1M08`: UInt = 1u;
public const val `WAVE_FORMAT_1M16`: UInt = 4u;
public const val `WAVE_FORMAT_1S08`: UInt = 2u;
public const val `WAVE_FORMAT_1S16`: UInt = 8u;
public const val `WAVE_FORMAT_2M08`: UInt = 16u;
public const val `WAVE_FORMAT_2M16`: UInt = 64u;
public const val `WAVE_FORMAT_2S08`: UInt = 32u;
public const val `WAVE_FORMAT_2S16`: UInt = 128u;
public const val `WAVE_FORMAT_44M08`: UInt = 256u;
public const val `WAVE_FORMAT_44M16`: UInt = 1024u;
public const val `WAVE_FORMAT_44S08`: UInt = 512u;
public const val `WAVE_FORMAT_44S16`: UInt = 2048u;
public const val `WAVE_FORMAT_48M08`: UInt = 4096u;
public const val `WAVE_FORMAT_48M16`: UInt = 16384u;
public const val `WAVE_FORMAT_48S08`: UInt = 8192u;
public const val `WAVE_FORMAT_48S16`: UInt = 32768u;
public const val `WAVE_FORMAT_4M08`: UInt = 256u;
public const val `WAVE_FORMAT_4M16`: UInt = 1024u;
public const val `WAVE_FORMAT_4S08`: UInt = 512u;
public const val `WAVE_FORMAT_4S16`: UInt = 2048u;
public const val `WAVE_FORMAT_96M08`: UInt = 65536u;
public const val `WAVE_FORMAT_96M16`: UInt = 262144u;
public const val `WAVE_FORMAT_96S08`: UInt = 131072u;
public const val `WAVE_FORMAT_96S16`: UInt = 524288u;
public const val `WAVE_FORMAT_DIRECT`: `MIDI_WAVE_OPEN_TYPE` = 8u;
public const val `WAVE_FORMAT_DIRECT_QUERY`: `MIDI_WAVE_OPEN_TYPE` = 9u;
public const val `WAVE_FORMAT_PCM`: UInt = 1u;
public const val `WAVE_FORMAT_QUERY`: `MIDI_WAVE_OPEN_TYPE` = 1u;
public const val `WAVE_INVALIDFORMAT`: UInt = 0u;
public const val `WAVE_MAPPED`: `MIDI_WAVE_OPEN_TYPE` = 4u;
public const val `WAVE_MAPPED_DEFAULT_COMMUNICATION_DEVICE`: `MIDI_WAVE_OPEN_TYPE` = 16u;
public const val `WAVE_MAPPER`: UInt = 4294967295u;
public const val `WHDR_BEGINLOOP`: UInt = 4u;
public const val `WHDR_DONE`: UInt = 1u;
public const val `WHDR_ENDLOOP`: UInt = 8u;
public const val `WHDR_INQUEUE`: UInt = 16u;
public const val `WHDR_PREPARED`: UInt = 2u;
public const val `WIDM_MAPPER_STATUS`: UInt = 8192u;
public const val `WODM_MAPPER_STATUS`: UInt = 8192u;
public typealias `_AUDCLNT_BUFFERFLAGS` = Int;
public const val `eAll`: `EDataFlow` = 2;
public const val `eCapture`: `EDataFlow` = 1;
public const val `eCommunications`: `ERole` = 2;
public const val `eConsole`: `ERole` = 0;
public const val `eMultimedia`: `ERole` = 1;
public const val `eRender`: `EDataFlow` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `tACMFORMATDETAILSW` (
    public var `cbStruct`: UInt,
    public var `dwFormatIndex`: UInt,
    public var `dwFormatTag`: UInt,
    public var `fdwSupport`: UInt,
    public var `pwfx`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WAVEFORMATEX`>?,
    public var `cbwfx`: UInt,
    public var `szFormat`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `tACMFORMATDETAILSW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `tACMFORMATDETAILSW`.Companion.`default`() : `tACMFORMATDETAILSW` {
        return run { `core`.`mem`.`zeroed`() }
    }

