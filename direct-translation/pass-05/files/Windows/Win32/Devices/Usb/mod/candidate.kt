// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_AbortPipe; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinUsb_AbortPipe`(`interfacehandle` : `WINUSB_INTERFACE_HANDLE`, `pipeid` : UByte) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_ControlTransfer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `WinUsb_ControlTransfer`(`interfacehandle` : `WINUSB_INTERFACE_HANDLE`, `setuppacket` : `WINUSB_SETUP_PACKET`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `bufferlength` : UInt, `lengthtransferred` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `overlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_FlushPipe; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinUsb_FlushPipe`(`interfacehandle` : `WINUSB_INTERFACE_HANDLE`, `pipeid` : UByte) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_Free; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinUsb_Free`(`interfacehandle` : `WINUSB_INTERFACE_HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_GetAdjustedFrameNumber; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinUsb_GetAdjustedFrameNumber`(`currentframenumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `timestamp` : Long) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_GetAssociatedInterface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinUsb_GetAssociatedInterface`(`interfacehandle` : `WINUSB_INTERFACE_HANDLE`, `associatedinterfaceindex` : UByte, `associatedinterfacehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WINUSB_INTERFACE_HANDLE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_GetCurrentAlternateSetting; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinUsb_GetCurrentAlternateSetting`(`interfacehandle` : `WINUSB_INTERFACE_HANDLE`, `settingnumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_GetCurrentFrameNumber; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinUsb_GetCurrentFrameNumber`(`interfacehandle` : `WINUSB_INTERFACE_HANDLE`, `currentframenumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `timestamp` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_GetCurrentFrameNumberAndQpc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinUsb_GetCurrentFrameNumberAndQpc`(`interfacehandle` : `WINUSB_INTERFACE_HANDLE`, `frameqpcinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`USB_FRAME_NUMBER_AND_QPC_FOR_TIME_SYNC_INFORMATION`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_GetDescriptor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinUsb_GetDescriptor`(`interfacehandle` : `WINUSB_INTERFACE_HANDLE`, `descriptortype` : UByte, `index` : UByte, `languageid` : UShort, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `bufferlength` : UInt, `lengthtransferred` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_GetOverlappedResult; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `WinUsb_GetOverlappedResult`(`interfacehandle` : `WINUSB_INTERFACE_HANDLE`, `lpoverlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?, `lpnumberofbytestransferred` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `bwait` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_GetPipePolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinUsb_GetPipePolicy`(`interfacehandle` : `WINUSB_INTERFACE_HANDLE`, `pipeid` : UByte, `policytype` : `WINUSB_PIPE_POLICY`, `valuelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_GetPowerPolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinUsb_GetPowerPolicy`(`interfacehandle` : `WINUSB_INTERFACE_HANDLE`, `policytype` : `WINUSB_POWER_POLICY`, `valuelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_Initialize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinUsb_Initialize`(`devicehandle` : `super`.`super`.`Foundation`.`HANDLE`, `interfacehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WINUSB_INTERFACE_HANDLE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_ParseConfigurationDescriptor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinUsb_ParseConfigurationDescriptor`(`configurationdescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`USB_CONFIGURATION_DESCRIPTOR`>?, `startposition` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `interfacenumber` : Int, `alternatesetting` : Int, `interfaceclass` : Int, `interfacesubclass` : Int, `interfaceprotocol` : Int) : /* Rust *mut */ kotlinx.cinterop.CPointer<`USB_INTERFACE_DESCRIPTOR`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_ParseDescriptors; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinUsb_ParseDescriptors`(`descriptorbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `totallength` : UInt, `startposition` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `descriptortype` : Int) : /* Rust *mut */ kotlinx.cinterop.CPointer<`USB_COMMON_DESCRIPTOR`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_QueryDeviceInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinUsb_QueryDeviceInformation`(`interfacehandle` : `WINUSB_INTERFACE_HANDLE`, `informationtype` : UInt, `bufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_QueryInterfaceSettings; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinUsb_QueryInterfaceSettings`(`interfacehandle` : `WINUSB_INTERFACE_HANDLE`, `alternateinterfacenumber` : UByte, `usbaltinterfacedescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`USB_INTERFACE_DESCRIPTOR`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_QueryPipe; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinUsb_QueryPipe`(`interfacehandle` : `WINUSB_INTERFACE_HANDLE`, `alternateinterfacenumber` : UByte, `pipeindex` : UByte, `pipeinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WINUSB_PIPE_INFORMATION`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_QueryPipeEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinUsb_QueryPipeEx`(`interfacehandle` : `WINUSB_INTERFACE_HANDLE`, `alternatesettingnumber` : UByte, `pipeindex` : UByte, `pipeinformationex` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WINUSB_PIPE_INFORMATION_EX`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_ReadIsochPipe; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `WinUsb_ReadIsochPipe`(`bufferhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `offset` : UInt, `length` : UInt, `framenumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `numberofpackets` : UInt, `isopacketdescriptors` : /* Rust *mut */ kotlinx.cinterop.CPointer<`USBD_ISO_PACKET_DESCRIPTOR`>?, `overlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_ReadIsochPipeAsap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `WinUsb_ReadIsochPipeAsap`(`bufferhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `offset` : UInt, `length` : UInt, `continuestream` : `windows_sys`.`core`.`BOOL`, `numberofpackets` : UInt, `isopacketdescriptors` : /* Rust *mut */ kotlinx.cinterop.CPointer<`USBD_ISO_PACKET_DESCRIPTOR`>?, `overlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_ReadPipe; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `WinUsb_ReadPipe`(`interfacehandle` : `WINUSB_INTERFACE_HANDLE`, `pipeid` : UByte, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `bufferlength` : UInt, `lengthtransferred` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `overlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_RegisterIsochBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinUsb_RegisterIsochBuffer`(`interfacehandle` : `WINUSB_INTERFACE_HANDLE`, `pipeid` : UByte, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `bufferlength` : UInt, `isochbufferhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_ResetPipe; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinUsb_ResetPipe`(`interfacehandle` : `WINUSB_INTERFACE_HANDLE`, `pipeid` : UByte) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_SetCurrentAlternateSetting; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinUsb_SetCurrentAlternateSetting`(`interfacehandle` : `WINUSB_INTERFACE_HANDLE`, `settingnumber` : UByte) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_SetPipePolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinUsb_SetPipePolicy`(`interfacehandle` : `WINUSB_INTERFACE_HANDLE`, `pipeid` : UByte, `policytype` : `WINUSB_PIPE_POLICY`, `valuelength` : UInt, `value` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_SetPowerPolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinUsb_SetPowerPolicy`(`interfacehandle` : `WINUSB_INTERFACE_HANDLE`, `policytype` : `WINUSB_POWER_POLICY`, `valuelength` : UInt, `value` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_StartTrackingForTimeSync; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinUsb_StartTrackingForTimeSync`(`interfacehandle` : `WINUSB_INTERFACE_HANDLE`, `starttrackinginfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`USB_START_TRACKING_FOR_TIME_SYNC_INFORMATION`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_StopTrackingForTimeSync; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinUsb_StopTrackingForTimeSync`(`interfacehandle` : `WINUSB_INTERFACE_HANDLE`, `stoptrackinginfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`USB_STOP_TRACKING_FOR_TIME_SYNC_INFORMATION`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_UnregisterIsochBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinUsb_UnregisterIsochBuffer`(`isochbufferhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_WriteIsochPipe; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `WinUsb_WriteIsochPipe`(`bufferhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `offset` : UInt, `length` : UInt, `framenumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `overlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_WriteIsochPipeAsap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `WinUsb_WriteIsochPipeAsap`(`bufferhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `offset` : UInt, `length` : UInt, `continuestream` : `windows_sys`.`core`.`BOOL`, `overlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winusb.dll, ABI=system, export=WinUsb_WritePipe; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `WinUsb_WritePipe`(`interfacehandle` : `WINUSB_INTERFACE_HANDLE`, `pipeid` : UByte, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `bufferlength` : UInt, `lengthtransferred` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `overlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
public const val `ALLOW_PARTIAL_READS`: `WINUSB_PIPE_POLICY` = 5u;
public const val `ALL_PIPE`: `PIPE_TYPE` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ALTERNATE_INTERFACE` (
    public var `InterfaceNumber`: UShort,
    public var `AlternateInterfaceNumber`: UShort,
)
public const val `AUTO_CLEAR_STALL`: `WINUSB_PIPE_POLICY` = 2u;
public const val `AUTO_FLUSH`: `WINUSB_PIPE_POLICY` = 6u;
public const val `AUTO_SUSPEND`: `WINUSB_POWER_POLICY` = 129u;
public const val `AcquireBusInfo`: `USB_NOTIFICATION_TYPE` = 5;
public const val `AcquireControllerName`: `USB_NOTIFICATION_TYPE` = 7;
public const val `AcquireHubName`: `USB_NOTIFICATION_TYPE` = 6;
public const val `BMREQUEST_CLASS`: UInt = 1u;
public const val `BMREQUEST_DEVICE_TO_HOST`: UInt = 1u;
public const val `BMREQUEST_HOST_TO_DEVICE`: UInt = 0u;
public const val `BMREQUEST_STANDARD`: UInt = 0u;
public const val `BMREQUEST_TO_DEVICE`: UInt = 0u;
public const val `BMREQUEST_TO_ENDPOINT`: UInt = 2u;
public const val `BMREQUEST_TO_INTERFACE`: UInt = 1u;
public const val `BMREQUEST_TO_OTHER`: UInt = 3u;
public const val `BMREQUEST_VENDOR`: UInt = 2u;
// UNSUPPORTED Rust 66:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union BM_REQUEST_TYPE {
//     pub s: BM_REQUEST_TYPE_0,
//     pub B: u8,
// }

// UNSUPPORTED Rust 72:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BM_REQUEST_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BM_REQUEST_TYPE_0` (
    public var `_bitfield`: UByte,
)
public const val `BULKIN_FLAG`: UInt = 128u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CHANNEL_INFO` (
    public var `EventChannelSize`: UInt,
    public var `uReadDataAlignment`: UInt,
    public var `uWriteDataAlignment`: UInt,
)
public const val `CompositeDevice`: `USB_WMI_DEVICE_NODE_TYPE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICE_DESCRIPTOR` (
    public var `usVendorId`: UShort,
    public var `usProductId`: UShort,
    public var `usBcdDevice`: UShort,
    public var `usLanguageId`: UShort,
)
public const val `DEVICE_SPEED`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DRV_VERSION` (
    public var `major`: UInt,
    public var `minor`: UInt,
    public var `internal`: UInt,
)
public const val `DeviceCausedOvercurrent`: `USB_CONNECTION_STATUS` = 4;
public const val `DeviceConnected`: `USB_CONNECTION_STATUS` = 1;
public const val `DeviceEnumerating`: `USB_CONNECTION_STATUS` = 9;
public const val `DeviceFailedEnumeration`: `USB_CONNECTION_STATUS` = 2;
public const val `DeviceGeneralFailure`: `USB_CONNECTION_STATUS` = 3;
public const val `DeviceHubNestedTooDeeply`: `USB_CONNECTION_STATUS` = 7;
public const val `DeviceInLegacyHub`: `USB_CONNECTION_STATUS` = 8;
public const val `DeviceNotEnoughBandwidth`: `USB_CONNECTION_STATUS` = 6;
public const val `DeviceNotEnoughPower`: `USB_CONNECTION_STATUS` = 5;
public const val `DeviceReset`: `USB_CONNECTION_STATUS` = 10;
public const val `EHCI_Generic`: `USB_CONTROLLER_FLAVOR` = 1000;
public const val `EHCI_Intel_Medfield`: `USB_CONTROLLER_FLAVOR` = 5001;
public const val `EHCI_Lucent`: `USB_CONTROLLER_FLAVOR` = 3000;
public const val `EHCI_NEC`: `USB_CONTROLLER_FLAVOR` = 2000;
public const val `EHCI_NVIDIA_Tegra2`: `USB_CONTROLLER_FLAVOR` = 4000;
public const val `EHCI_NVIDIA_Tegra3`: `USB_CONTROLLER_FLAVOR` = 4001;
public const val `EVENT_PIPE`: `PIPE_TYPE` = 0;
public const val `EnumerationFailure`: `USB_NOTIFICATION_TYPE` = 0;
public const val `FILE_DEVICE_USB`: UInt = 34u;
public const val `FILE_DEVICE_USB_SCAN`: UInt = 32768u;
public const val `FullSpeed`: UInt = 2u;
// UNSUPPORTED Rust 128:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_DEVINTERFACE_USB_BILLBOARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5e9adaef_f879_473f_b807_4e5ea77d1b1c);

// UNSUPPORTED Rust 129:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_DEVINTERFACE_USB_DEVICE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa5dcbf10_6530_11d2_901f_00c04fb951ed);

// UNSUPPORTED Rust 130:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_DEVINTERFACE_USB_HOST_CONTROLLER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3abf6f2d_71c4_462a_8a92_1e6861e6af27);

// UNSUPPORTED Rust 131:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_DEVINTERFACE_USB_HUB: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf18a0e88_c30c_11d0_8815_00a0c906bed8);

// UNSUPPORTED Rust 132:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_USB_MSOS20_PLATFORM_CAPABILITY_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd8dd60df_4589_4cc7_9cd2_659d9e648a9f);

// UNSUPPORTED Rust 133:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_USB_PERFORMANCE_TRACING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd5de77a6_6ae9_425c_b1e2_f5615fd348a9);

// UNSUPPORTED Rust 134:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_USB_TRANSFER_TRACING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x681eb8aa_403d_452c_9f8a_f0616fac9540);

// UNSUPPORTED Rust 135:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_USB_WMI_DEVICE_PERF_INFO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66c1aa3c_499f_49a0_a9a5_61e2359f6407);

// UNSUPPORTED Rust 136:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_USB_WMI_NODE_INFO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9c179357_dc7a_4f41_b66b_323b9ddcb5b1);

// UNSUPPORTED Rust 137:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_USB_WMI_STD_DATA: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4e623b20_cb14_11d1_b331_00a0c959bbd2);

// UNSUPPORTED Rust 138:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_USB_WMI_STD_NOTIFICATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4e623b20_cb14_11d1_b331_00a0c959bbd2);

// UNSUPPORTED Rust 139:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_USB_WMI_SURPRISE_REMOVAL_NOTIFICATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9bbbf831_a2f2_43b4_96d1_86944b5914b3);

// UNSUPPORTED Rust 140:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_USB_WMI_TRACING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3a61881b_b4e6_4bf9_ae0f_3cd8f394e52f);

public const val `HCD_DIAGNOSTIC_MODE_OFF`: UInt = 257u;
public const val `HCD_DIAGNOSTIC_MODE_ON`: UInt = 256u;
public const val `HCD_DISABLE_PORT`: UInt = 268u;
public const val `HCD_ENABLE_PORT`: UInt = 269u;
public const val `HCD_GET_DRIVERKEY_NAME`: UInt = 265u;
public const val `HCD_GET_ROOT_HUB_NAME`: UInt = 258u;
public const val `HCD_GET_STATS_1`: UInt = 255u;
public const val `HCD_GET_STATS_2`: UInt = 266u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HCD_ISO_STAT_COUNTERS` (
    public var `LateUrbs`: UShort,
    public var `DoubleBufferedPackets`: UShort,
    public var `TransfersCF_5ms`: UShort,
    public var `TransfersCF_2ms`: UShort,
    public var `TransfersCF_1ms`: UShort,
    public var `MaxInterruptLatency`: UShort,
    public var `BadStartFrame`: UShort,
    public var `StaleUrbs`: UShort,
    public var `IsoPacketNotAccesed`: UShort,
    public var `IsoPacketHWError`: UShort,
    public var `SmallestUrbPacketCount`: UShort,
    public var `LargestUrbPacketCount`: UShort,
    public var `IsoCRC_Error`: UShort,
    public var `IsoOVERRUN_Error`: UShort,
    public var `IsoINTERNAL_Error`: UShort,
    public var `IsoUNKNOWN_Error`: UShort,
    public var `IsoBytesTransferred`: UInt,
    public var `LateMissedCount`: UShort,
    public var `HWIsoMissedCount`: UShort,
    public var `Reserved7`: UIntArray,
)
// UNSUPPORTED Rust 173:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HCD_ISO_STAT_COUNTERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HCD_STAT_COUNTERS` (
    public var `BytesTransferred`: UInt,
    public var `IsoMissedCount`: UShort,
    public var `DataOverrunErrorCount`: UShort,
    public var `CrcErrorCount`: UShort,
    public var `ScheduleOverrunCount`: UShort,
    public var `TimeoutErrorCount`: UShort,
    public var `InternalHcErrorCount`: UShort,
    public var `BufferOverrunErrorCount`: UShort,
    public var `SWErrorCount`: UShort,
    public var `StallPidCount`: UShort,
    public var `PortDisableCount`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HCD_STAT_INFORMATION_1` (
    public var `Reserved1`: UInt,
    public var `Reserved2`: UInt,
    public var `ResetCounters`: UInt,
    public var `TimeRead`: Long,
    public var `Counters`: `HCD_STAT_COUNTERS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HCD_STAT_INFORMATION_2` (
    public var `Reserved1`: UInt,
    public var `Reserved2`: UInt,
    public var `ResetCounters`: UInt,
    public var `TimeRead`: Long,
    public var `LockedMemoryUsed`: Int,
    public var `Counters`: `HCD_STAT_COUNTERS`,
    public var `IsoCounters`: `HCD_ISO_STAT_COUNTERS`,
)
public const val `HCD_TRACE_READ_REQUEST`: UInt = 275u;
public const val `HCD_USER_REQUEST`: UInt = 270u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 19 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HUB_DEVICE_CONFIG_INFO` (
    public var `Version`: UInt,
    public var `Length`: UInt,
    public var `HubFlags`: `USB_HUB_CAP_FLAGS`,
    public var `HardwareIds`: `USB_ID_STRING`,
    public var `CompatibleIds`: `USB_ID_STRING`,
    public var `DeviceDescription`: `USB_ID_STRING`,
    public var `Reserved`: UIntArray,
    public var `UxdSettings`: `USB_HUB_DEVICE_UXD_SETTINGS`,
)
// UNSUPPORTED Rust 227:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HUB_DEVICE_CONFIG_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HighSpeed`: UInt = 3u;
public const val `HubDevice`: `USB_WMI_DEVICE_NODE_TYPE` = 1;
public const val `HubNestedTooDeeply`: `USB_NOTIFICATION_TYPE` = 10;
public const val `HubOvercurrent`: `USB_NOTIFICATION_TYPE` = 8;
public const val `HubPowerChange`: `USB_NOTIFICATION_TYPE` = 9;
public const val `IGNORE_SHORT_PACKETS`: `WINUSB_PIPE_POLICY` = 4u;
public const val `IOCTL_ABORT_PIPE`: UInt = 2147491844u;
public const val `IOCTL_CANCEL_IO`: UInt = 2147491844u;
public const val `IOCTL_GENERICUSBFN_ACTIVATE_USB_BUS`: UInt = 2277420u;
public const val `IOCTL_GENERICUSBFN_BUS_EVENT_NOTIFICATION`: UInt = 2277430u;
public const val `IOCTL_GENERICUSBFN_CONTROL_STATUS_HANDSHAKE_IN`: UInt = 2277400u;
public const val `IOCTL_GENERICUSBFN_CONTROL_STATUS_HANDSHAKE_OUT`: UInt = 2277404u;
public const val `IOCTL_GENERICUSBFN_DEACTIVATE_USB_BUS`: UInt = 2277424u;
public const val `IOCTL_GENERICUSBFN_GET_CLASS_INFO`: UInt = 2277410u;
public const val `IOCTL_GENERICUSBFN_GET_CLASS_INFO_EX`: UInt = 2277434u;
public const val `IOCTL_GENERICUSBFN_GET_INTERFACE_DESCRIPTOR_SET`: UInt = 2277438u;
public const val `IOCTL_GENERICUSBFN_GET_PIPE_STATE`: UInt = 2277414u;
public const val `IOCTL_GENERICUSBFN_REGISTER_USB_STRING`: UInt = 2277441u;
public const val `IOCTL_GENERICUSBFN_SET_PIPE_STATE`: UInt = 2277417u;
public const val `IOCTL_GENERICUSBFN_TRANSFER_IN`: UInt = 2277389u;
public const val `IOCTL_GENERICUSBFN_TRANSFER_IN_APPEND_ZERO_PKT`: UInt = 2277393u;
public const val `IOCTL_GENERICUSBFN_TRANSFER_OUT`: UInt = 2277398u;
public const val `IOCTL_GET_CHANNEL_ALIGN_RQST`: UInt = 2147491860u;
public const val `IOCTL_GET_DEVICE_DESCRIPTOR`: UInt = 2147491864u;
public const val `IOCTL_GET_HCD_DRIVERKEY_NAME`: UInt = 2229284u;
public const val `IOCTL_GET_PIPE_CONFIGURATION`: UInt = 2147491880u;
public const val `IOCTL_GET_USB_DESCRIPTOR`: UInt = 2147491872u;
public const val `IOCTL_GET_VERSION`: UInt = 2147491840u;
public const val `IOCTL_INDEX`: UInt = 2048u;
public const val `IOCTL_INTERNAL_USB_CYCLE_PORT`: UInt = 2228255u;
public const val `IOCTL_INTERNAL_USB_ENABLE_PORT`: UInt = 2228247u;
public const val `IOCTL_INTERNAL_USB_FAIL_GET_STATUS_FROM_DEVICE`: UInt = 2229347u;
public const val `IOCTL_INTERNAL_USB_GET_BUSGUID_INFO`: UInt = 2229288u;
public const val `IOCTL_INTERNAL_USB_GET_BUS_INFO`: UInt = 2229280u;
public const val `IOCTL_INTERNAL_USB_GET_CONTROLLER_NAME`: UInt = 2229284u;
public const val `IOCTL_INTERNAL_USB_GET_DEVICE_CONFIG_INFO`: UInt = 2229327u;
public const val `IOCTL_INTERNAL_USB_GET_DEVICE_HANDLE`: UInt = 2229299u;
public const val `IOCTL_INTERNAL_USB_GET_DEVICE_HANDLE_EX`: UInt = 2229303u;
public const val `IOCTL_INTERNAL_USB_GET_HUB_COUNT`: UInt = 2228251u;
public const val `IOCTL_INTERNAL_USB_GET_HUB_NAME`: UInt = 2228256u;
public const val `IOCTL_INTERNAL_USB_GET_PARENT_HUB_INFO`: UInt = 2229292u;
public const val `IOCTL_INTERNAL_USB_GET_PORT_STATUS`: UInt = 2228243u;
public const val `IOCTL_INTERNAL_USB_GET_ROOTHUB_PDO`: UInt = 2228239u;
public const val `IOCTL_INTERNAL_USB_GET_TOPOLOGY_ADDRESS`: UInt = 2229311u;
public const val `IOCTL_INTERNAL_USB_GET_TT_DEVICE_HANDLE`: UInt = 2229307u;
public const val `IOCTL_INTERNAL_USB_NOTIFY_IDLE_READY`: UInt = 2229315u;
public const val `IOCTL_INTERNAL_USB_RECORD_FAILURE`: UInt = 2228267u;
public const val `IOCTL_INTERNAL_USB_REGISTER_COMPOSITE_DEVICE`: UInt = 4784131u;
public const val `IOCTL_INTERNAL_USB_REQUEST_REMOTE_WAKE_NOTIFICATION`: UInt = 4784139u;
public const val `IOCTL_INTERNAL_USB_REQ_GLOBAL_RESUME`: UInt = 2229323u;
public const val `IOCTL_INTERNAL_USB_REQ_GLOBAL_SUSPEND`: UInt = 2229319u;
public const val `IOCTL_INTERNAL_USB_RESET_PORT`: UInt = 2228231u;
public const val `IOCTL_INTERNAL_USB_SUBMIT_IDLE_NOTIFICATION`: UInt = 2228263u;
public const val `IOCTL_INTERNAL_USB_SUBMIT_URB`: UInt = 2228227u;
public const val `IOCTL_INTERNAL_USB_UNREGISTER_COMPOSITE_DEVICE`: UInt = 4784135u;
public const val `IOCTL_READ_REGISTERS`: UInt = 2147491852u;
public const val `IOCTL_RESET_PIPE`: UInt = 2147491868u;
public const val `IOCTL_SEND_USB_REQUEST`: UInt = 2147491876u;
public const val `IOCTL_SET_TIMEOUT`: UInt = 2147491884u;
public const val `IOCTL_USB_DIAGNOSTIC_MODE_OFF`: UInt = 2229252u;
public const val `IOCTL_USB_DIAGNOSTIC_MODE_ON`: UInt = 2229248u;
public const val `IOCTL_USB_DIAG_IGNORE_HUBS_OFF`: UInt = 2229276u;
public const val `IOCTL_USB_DIAG_IGNORE_HUBS_ON`: UInt = 2229272u;
public const val `IOCTL_USB_GET_DESCRIPTOR_FROM_NODE_CONNECTION`: UInt = 2229264u;
public const val `IOCTL_USB_GET_DEVICE_CHARACTERISTICS`: UInt = 2229376u;
public const val `IOCTL_USB_GET_FRAME_NUMBER_AND_QPC_FOR_TIME_SYNC`: UInt = 2229368u;
public const val `IOCTL_USB_GET_HUB_CAPABILITIES`: UInt = 2229308u;
public const val `IOCTL_USB_GET_HUB_CAPABILITIES_EX`: UInt = 2229328u;
public const val `IOCTL_USB_GET_HUB_INFORMATION_EX`: UInt = 2229332u;
public const val `IOCTL_USB_GET_NODE_CONNECTION_ATTRIBUTES`: UInt = 2229312u;
public const val `IOCTL_USB_GET_NODE_CONNECTION_DRIVERKEY_NAME`: UInt = 2229280u;
public const val `IOCTL_USB_GET_NODE_CONNECTION_INFORMATION`: UInt = 2229260u;
public const val `IOCTL_USB_GET_NODE_CONNECTION_INFORMATION_EX`: UInt = 2229320u;
public const val `IOCTL_USB_GET_NODE_CONNECTION_INFORMATION_EX_V2`: UInt = 2229340u;
public const val `IOCTL_USB_GET_NODE_CONNECTION_NAME`: UInt = 2229268u;
public const val `IOCTL_USB_GET_NODE_INFORMATION`: UInt = 2229256u;
public const val `IOCTL_USB_GET_PORT_CONNECTOR_PROPERTIES`: UInt = 2229336u;
public const val `IOCTL_USB_GET_ROOT_HUB_NAME`: UInt = 2229256u;
public const val `IOCTL_USB_GET_TRANSPORT_CHARACTERISTICS`: UInt = 2229348u;
public const val `IOCTL_USB_HCD_DISABLE_PORT`: UInt = 2229296u;
public const val `IOCTL_USB_HCD_ENABLE_PORT`: UInt = 2229300u;
public const val `IOCTL_USB_HCD_GET_STATS_1`: UInt = 2229244u;
public const val `IOCTL_USB_HCD_GET_STATS_2`: UInt = 2229288u;
public const val `IOCTL_USB_HUB_CYCLE_PORT`: UInt = 2229316u;
public const val `IOCTL_USB_NOTIFY_ON_TRANSPORT_CHARACTERISTICS_CHANGE`: UInt = 2229356u;
public const val `IOCTL_USB_REGISTER_FOR_TRANSPORT_CHARACTERISTICS_CHANGE`: UInt = 2229352u;
public const val `IOCTL_USB_RESET_HUB`: UInt = 2229324u;
public const val `IOCTL_USB_START_TRACKING_FOR_TIME_SYNC`: UInt = 2229364u;
public const val `IOCTL_USB_STOP_TRACKING_FOR_TIME_SYNC`: UInt = 2229372u;
public const val `IOCTL_USB_UNREGISTER_FOR_TRANSPORT_CHARACTERISTICS_CHANGE`: UInt = 2229360u;
public const val `IOCTL_WAIT_ON_DEVICE_EVENT`: UInt = 2147491848u;
public const val `IOCTL_WRITE_REGISTERS`: UInt = 2147491856u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IO_BLOCK` (
    public var `uOffset`: UInt,
    public var `uLength`: UInt,
    public var `pbyData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `uIndex`: UInt,
)
// UNSUPPORTED Rust 332:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IO_BLOCK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IO_BLOCK_EX` (
    public var `uOffset`: UInt,
    public var `uLength`: UInt,
    public var `pbyData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `uIndex`: UInt,
    public var `bRequest`: UByte,
    public var `bmRequestType`: UByte,
    public var `fTransferDirectionIn`: UByte,
)
// UNSUPPORTED Rust 348:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IO_BLOCK_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `InsufficentBandwidth`: `USB_NOTIFICATION_TYPE` = 1;
public const val `InsufficentPower`: `USB_NOTIFICATION_TYPE` = 2;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `KREGMANUSBFNENUMPATH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("\\Registry\\Machine\\SYSTEM\\CurrentControlSet\\Control\\ManufacturingMode\\Current\\USBFN\\");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `KREGUSBFNENUMPATH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("\\Registry\\Machine\\SYSTEM\\CurrentControlSet\\Control\\USBFN\\");
public const val `LowSpeed`: UInt = 1u;
public const val `MAXIMUM_TRANSFER_SIZE`: `WINUSB_PIPE_POLICY` = 8u;
public const val `MAXIMUM_USB_STRING_LENGTH`: UInt = 255u;
public const val `MAX_ALTERNATE_NAME_LENGTH`: UInt = 40u;
public const val `MAX_ASSOCIATION_NAME_LENGTH`: UInt = 40u;
public const val `MAX_CONFIGURATION_NAME_LENGTH`: UInt = 40u;
public const val `MAX_INTERFACE_NAME_LENGTH`: UInt = 40u;
public const val `MAX_NUM_PIPES`: UInt = 8u;
public const val `MAX_NUM_USBFN_ENDPOINTS`: UInt = 15u;
public const val `MAX_SUPPORTED_CONFIGURATIONS`: UInt = 12u;
public const val `MAX_USB_STRING_LENGTH`: UInt = 255u;
public const val `MS_GENRE_DESCRIPTOR_INDEX`: UInt = 1u;
public const val `MS_OS_FLAGS_CONTAINERID`: UInt = 2u;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `MS_OS_STRING_SIGNATURE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MSFT100");
public const val `MS_POWER_DESCRIPTOR_INDEX`: UInt = 2u;
public const val `ModernDeviceInLegacyHub`: `USB_NOTIFICATION_TYPE` = 11;
public const val `NoDeviceConnected`: `USB_CONNECTION_STATUS` = 0;
public const val `OHCI_Generic`: `USB_CONTROLLER_FLAVOR` = 100;
public const val `OHCI_Hydra`: `USB_CONTROLLER_FLAVOR` = 101;
public const val `OHCI_NEC`: `USB_CONTROLLER_FLAVOR` = 102;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 7 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OS_STRING` (
    public var `bLength`: UByte,
    public var `bDescriptorType`: UByte,
    public var `MicrosoftString`: UShortArray,
    public var `bVendorCode`: UByte,
    public var `Anonymous`: `OS_STRING_0`,
)
// UNSUPPORTED Rust 386:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OS_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 391:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union OS_STRING_0 {
//     pub bPad: u8,
//     pub bFlags: u8,
// }

// UNSUPPORTED Rust 397:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OS_STRING_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OS_STRING_DESCRIPTOR_INDEX`: UInt = 238u;
public const val `OverCurrent`: `USB_NOTIFICATION_TYPE` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PACKET_PARAMETERS` (
    public var `DeviceAddress`: UByte,
    public var `EndpointAddress`: UByte,
    public var `MaximumPacketSize`: UShort,
    public var `Timeout`: UInt,
    public var `Flags`: UInt,
    public var `DataLength`: UInt,
    public var `HubDeviceAddress`: UShort,
    public var `PortTTNumber`: UShort,
    public var `ErrorCount`: UByte,
    public var `Pad`: UByteArray,
    public var `UsbdStatusCode`: Int,
    public var `Data`: UByteArray,
)
// UNSUPPORTED Rust 420:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PACKET_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PIPE_TRANSFER_TIMEOUT`: `WINUSB_PIPE_POLICY` = 3u;
public typealias `PIPE_TYPE` = Int;
public const val `PORT_LINK_STATE_COMPLIANCE_MODE`: UInt = 10u;
public const val `PORT_LINK_STATE_DISABLED`: UInt = 4u;
public const val `PORT_LINK_STATE_HOT_RESET`: UInt = 9u;
public const val `PORT_LINK_STATE_INACTIVE`: UInt = 6u;
public const val `PORT_LINK_STATE_LOOPBACK`: UInt = 11u;
public const val `PORT_LINK_STATE_POLLING`: UInt = 7u;
public const val `PORT_LINK_STATE_RECOVERY`: UInt = 8u;
public const val `PORT_LINK_STATE_RX_DETECT`: UInt = 5u;
public const val `PORT_LINK_STATE_TEST_MODE`: UInt = 11u;
public const val `PORT_LINK_STATE_U0`: UInt = 0u;
public const val `PORT_LINK_STATE_U1`: UInt = 1u;
public const val `PORT_LINK_STATE_U2`: UInt = 2u;
public const val `PORT_LINK_STATE_U3`: UInt = 3u;
public const val `RAW_IO`: `WINUSB_PIPE_POLICY` = 7u;
public typealias `RAW_PIPE_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RAW_RESET_PORT_PARAMETERS` (
    public var `PortNumber`: UShort,
    public var `PortStatus`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RAW_ROOTPORT_FEATURE` (
    public var `PortNumber`: UShort,
    public var `PortFeature`: UShort,
    public var `PortStatus`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RAW_ROOTPORT_PARAMETERS` (
    public var `PortNumber`: UShort,
    public var `PortStatus`: UShort,
)
public const val `READ_DATA_PIPE`: `PIPE_TYPE` = 1;
public const val `RESET_PIPE_ON_RESUME`: `WINUSB_PIPE_POLICY` = 9u;
public const val `ResetOvercurrent`: `USB_NOTIFICATION_TYPE` = 4;
public const val `SHORT_PACKET_TERMINATE`: `WINUSB_PIPE_POLICY` = 1u;
public const val `SUSPEND_DELAY`: `WINUSB_POWER_POLICY` = 131u;
public const val `UHCI_Generic`: `USB_CONTROLLER_FLAVOR` = 200;
public const val `UHCI_Ich1`: `USB_CONTROLLER_FLAVOR` = 205;
public const val `UHCI_Ich2`: `USB_CONTROLLER_FLAVOR` = 203;
public const val `UHCI_Ich3m`: `USB_CONTROLLER_FLAVOR` = 206;
public const val `UHCI_Ich4`: `USB_CONTROLLER_FLAVOR` = 207;
public const val `UHCI_Ich5`: `USB_CONTROLLER_FLAVOR` = 208;
public const val `UHCI_Ich6`: `USB_CONTROLLER_FLAVOR` = 209;
public const val `UHCI_Intel`: `USB_CONTROLLER_FLAVOR` = 249;
public const val `UHCI_Piix3`: `USB_CONTROLLER_FLAVOR` = 202;
public const val `UHCI_Piix4`: `USB_CONTROLLER_FLAVOR` = 201;
public const val `UHCI_Reserved204`: `USB_CONTROLLER_FLAVOR` = 204;
public const val `UHCI_VIA`: `USB_CONTROLLER_FLAVOR` = 250;
public const val `UHCI_VIA_x01`: `USB_CONTROLLER_FLAVOR` = 251;
public const val `UHCI_VIA_x02`: `USB_CONTROLLER_FLAVOR` = 252;
public const val `UHCI_VIA_x03`: `USB_CONTROLLER_FLAVOR` = 253;
public const val `UHCI_VIA_x04`: `USB_CONTROLLER_FLAVOR` = 254;
public const val `UHCI_VIA_x0E_FIFO`: `USB_CONTROLLER_FLAVOR` = 264;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `URB` (
    public var `Anonymous`: `URB_0`,
)
// UNSUPPORTED Rust 488:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for URB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 493:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union URB_0 {
//     pub UrbHeader: _URB_HEADER,
//     pub UrbSelectInterface: _URB_SELECT_INTERFACE,
//     pub UrbSelectConfiguration: _URB_SELECT_CONFIGURATION,
//     pub UrbPipeRequest: _URB_PIPE_REQUEST,
//     pub UrbFrameLengthControl: _URB_FRAME_LENGTH_CONTROL,
//     pub UrbGetFrameLength: _URB_GET_FRAME_LENGTH,
//     pub UrbSetFrameLength: _URB_SET_FRAME_LENGTH,
//     pub UrbGetCurrentFrameNumber: _URB_GET_CURRENT_FRAME_NUMBER,
//     pub UrbControlTransfer: _URB_CONTROL_TRANSFER,
//     pub UrbControlTransferEx: _URB_CONTROL_TRANSFER_EX,
//     pub UrbBulkOrInterruptTransfer: _URB_BULK_OR_INTERRUPT_TRANSFER,
//     pub UrbIsochronousTransfer: _URB_ISOCH_TRANSFER,
//     pub UrbControlDescriptorRequest: _URB_CONTROL_DESCRIPTOR_REQUEST,
//     pub UrbControlGetStatusRequest: _URB_CONTROL_GET_STATUS_REQUEST,
//     pub UrbControlFeatureRequest: _URB_CONTROL_FEATURE_REQUEST,
//     pub UrbControlVendorClassRequest: _URB_CONTROL_VENDOR_OR_CLASS_REQUEST,
//     pub UrbControlGetInterfaceRequest: _URB_CONTROL_GET_INTERFACE_REQUEST,
//     pub UrbControlGetConfigurationRequest: _URB_CONTROL_GET_CONFIGURATION_REQUEST,
//     pub UrbOSFeatureDescriptorRequest: _URB_OS_FEATURE_DESCRIPTOR_REQUEST,
//     pub UrbOpenStaticStreams: _URB_OPEN_STATIC_STREAMS,
//     pub UrbGetIsochPipeTransferPathDelays: _URB_GET_ISOCH_PIPE_TRANSFER_PATH_DELAYS,
// }

// UNSUPPORTED Rust 518:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for URB_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `URB_FUNCTION_ABORT_PIPE`: UInt = 2u;
public const val `URB_FUNCTION_BULK_OR_INTERRUPT_TRANSFER`: UInt = 9u;
public const val `URB_FUNCTION_BULK_OR_INTERRUPT_TRANSFER_USING_CHAINED_MDL`: UInt = 55u;
public const val `URB_FUNCTION_CLASS_DEVICE`: UInt = 26u;
public const val `URB_FUNCTION_CLASS_ENDPOINT`: UInt = 28u;
public const val `URB_FUNCTION_CLASS_INTERFACE`: UInt = 27u;
public const val `URB_FUNCTION_CLASS_OTHER`: UInt = 31u;
public const val `URB_FUNCTION_CLEAR_FEATURE_TO_DEVICE`: UInt = 16u;
public const val `URB_FUNCTION_CLEAR_FEATURE_TO_ENDPOINT`: UInt = 18u;
public const val `URB_FUNCTION_CLEAR_FEATURE_TO_INTERFACE`: UInt = 17u;
public const val `URB_FUNCTION_CLEAR_FEATURE_TO_OTHER`: UInt = 34u;
public const val `URB_FUNCTION_CLOSE_STATIC_STREAMS`: UInt = 54u;
public const val `URB_FUNCTION_CONTROL_TRANSFER`: UInt = 8u;
public const val `URB_FUNCTION_CONTROL_TRANSFER_EX`: UInt = 50u;
public const val `URB_FUNCTION_GET_CONFIGURATION`: UInt = 38u;
public const val `URB_FUNCTION_GET_CURRENT_FRAME_NUMBER`: UInt = 7u;
public const val `URB_FUNCTION_GET_DESCRIPTOR_FROM_DEVICE`: UInt = 11u;
public const val `URB_FUNCTION_GET_DESCRIPTOR_FROM_ENDPOINT`: UInt = 36u;
public const val `URB_FUNCTION_GET_DESCRIPTOR_FROM_INTERFACE`: UInt = 40u;
public const val `URB_FUNCTION_GET_FRAME_LENGTH`: UInt = 5u;
public const val `URB_FUNCTION_GET_INTERFACE`: UInt = 39u;
public const val `URB_FUNCTION_GET_ISOCH_PIPE_TRANSFER_PATH_DELAYS`: UInt = 61u;
public const val `URB_FUNCTION_GET_MS_FEATURE_DESCRIPTOR`: UInt = 42u;
public const val `URB_FUNCTION_GET_STATUS_FROM_DEVICE`: UInt = 19u;
public const val `URB_FUNCTION_GET_STATUS_FROM_ENDPOINT`: UInt = 21u;
public const val `URB_FUNCTION_GET_STATUS_FROM_INTERFACE`: UInt = 20u;
public const val `URB_FUNCTION_GET_STATUS_FROM_OTHER`: UInt = 33u;
public const val `URB_FUNCTION_ISOCH_TRANSFER`: UInt = 10u;
public const val `URB_FUNCTION_ISOCH_TRANSFER_USING_CHAINED_MDL`: UInt = 56u;
public const val `URB_FUNCTION_OPEN_STATIC_STREAMS`: UInt = 53u;
public const val `URB_FUNCTION_RELEASE_FRAME_LENGTH_CONTROL`: UInt = 4u;
public const val `URB_FUNCTION_RESERVED_0X0016`: UInt = 22u;
public const val `URB_FUNCTION_RESERVE_0X001D`: UInt = 29u;
public const val `URB_FUNCTION_RESERVE_0X002B`: UInt = 43u;
public const val `URB_FUNCTION_RESERVE_0X002C`: UInt = 44u;
public const val `URB_FUNCTION_RESERVE_0X002D`: UInt = 45u;
public const val `URB_FUNCTION_RESERVE_0X002E`: UInt = 46u;
public const val `URB_FUNCTION_RESERVE_0X002F`: UInt = 47u;
public const val `URB_FUNCTION_RESERVE_0X0033`: UInt = 51u;
public const val `URB_FUNCTION_RESERVE_0X0034`: UInt = 52u;
public const val `URB_FUNCTION_RESET_PIPE`: UInt = 30u;
public const val `URB_FUNCTION_SELECT_CONFIGURATION`: UInt = 0u;
public const val `URB_FUNCTION_SELECT_INTERFACE`: UInt = 1u;
public const val `URB_FUNCTION_SET_DESCRIPTOR_TO_DEVICE`: UInt = 12u;
public const val `URB_FUNCTION_SET_DESCRIPTOR_TO_ENDPOINT`: UInt = 37u;
public const val `URB_FUNCTION_SET_DESCRIPTOR_TO_INTERFACE`: UInt = 41u;
public const val `URB_FUNCTION_SET_FEATURE_TO_DEVICE`: UInt = 13u;
public const val `URB_FUNCTION_SET_FEATURE_TO_ENDPOINT`: UInt = 15u;
public const val `URB_FUNCTION_SET_FEATURE_TO_INTERFACE`: UInt = 14u;
public const val `URB_FUNCTION_SET_FEATURE_TO_OTHER`: UInt = 35u;
public const val `URB_FUNCTION_SET_FRAME_LENGTH`: UInt = 6u;
public const val `URB_FUNCTION_SYNC_CLEAR_STALL`: UInt = 49u;
public const val `URB_FUNCTION_SYNC_RESET_PIPE`: UInt = 48u;
public const val `URB_FUNCTION_SYNC_RESET_PIPE_AND_CLEAR_STALL`: UInt = 30u;
public const val `URB_FUNCTION_TAKE_FRAME_LENGTH_CONTROL`: UInt = 3u;
public const val `URB_FUNCTION_VENDOR_DEVICE`: UInt = 23u;
public const val `URB_FUNCTION_VENDOR_ENDPOINT`: UInt = 25u;
public const val `URB_FUNCTION_VENDOR_INTERFACE`: UInt = 24u;
public const val `URB_FUNCTION_VENDOR_OTHER`: UInt = 32u;
public const val `URB_OPEN_STATIC_STREAMS_VERSION_100`: UInt = 256u;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `UREGMANUSBFNENUMPATH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("HKEY_LOCAL_MACHINE\\SYSTEM\\CurrentControlSet\\Control\\ManufacturingMode\\Current\\USBFN\\");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `UREGUSBFNENUMPATH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("HKEY_LOCAL_MACHINE\\SYSTEM\\CurrentControlSet\\Control\\USBFN\\");
public const val `USBDI_VERSION`: UInt = 1536u;
public const val `USBD_DEFAULT_MAXIMUM_TRANSFER_SIZE`: UInt = 4294967295u;
public const val `USBD_DEFAULT_PIPE_TRANSFER`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USBD_DEVICE_INFORMATION` (
    public var `OffsetNext`: UInt,
    public var `UsbdDeviceHandle`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `DeviceDescriptor`: `USB_DEVICE_DESCRIPTOR`,
)
// UNSUPPORTED Rust 595:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USBD_DEVICE_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USBD_ENDPOINT_OFFLOAD_INFORMATION` (
    public var `Size`: UInt,
    public var `EndpointAddress`: UShort,
    public var `ResourceId`: UInt,
    public var `Mode`: `USBD_ENDPOINT_OFFLOAD_MODE`,
    public var `_bitfield1`: UInt,
    public var `_bitfield2`: UInt,
    public var `TransferSegmentLA`: Long,
    public var `TransferSegmentVA`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `TransferRingSize`: ULong,
    public var `TransferRingInitialCycleBit`: UInt,
    public var `MessageNumber`: UInt,
    public var `EventRingSegmentLA`: Long,
    public var `EventRingSegmentVA`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `EventRingSize`: ULong,
    public var `EventRingInitialCycleBit`: UInt,
)
// UNSUPPORTED Rust 619:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USBD_ENDPOINT_OFFLOAD_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `USBD_ENDPOINT_OFFLOAD_MODE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USBD_INTERFACE_INFORMATION` (
    public var `Length`: UShort,
    public var `InterfaceNumber`: UByte,
    public var `AlternateSetting`: UByte,
    public var `Class`: UByte,
    public var `SubClass`: UByte,
    public var `Protocol`: UByte,
    public var `Reserved`: UByte,
    public var `InterfaceHandle`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `NumberOfPipes`: UInt,
    public var `Pipes`: Array<`USBD_PIPE_INFORMATION`>,
)
// UNSUPPORTED Rust 639:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USBD_INTERFACE_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USBD_ISO_PACKET_DESCRIPTOR` (
    public var `Offset`: UInt,
    public var `Length`: UInt,
    public var `Status`: Int,
)
public const val `USBD_ISO_START_FRAME_RANGE`: UInt = 1024u;
public const val `USBD_PF_CHANGE_MAX_PACKET`: UInt = 1u;
public const val `USBD_PF_ENABLE_RT_THREAD_ACCESS`: UInt = 4u;
public const val `USBD_PF_HANDLES_SSP_HIGH_BANDWIDTH_ISOCH`: UInt = 256u;
public const val `USBD_PF_INTERACTIVE_PRIORITY`: UInt = 48u;
public const val `USBD_PF_MAP_ADD_TRANSFERS`: UInt = 8u;
public const val `USBD_PF_PRIORITY_MASK`: UInt = 240u;
public const val `USBD_PF_SHORT_PACKET_OPT`: UInt = 2u;
public const val `USBD_PF_SSP_HIGH_BANDWIDTH_ISOCH`: UInt = 65536u;
public const val `USBD_PF_VIDEO_PRIORITY`: UInt = 16u;
public const val `USBD_PF_VOICE_PRIORITY`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USBD_PIPE_INFORMATION` (
    public var `MaximumPacketSize`: UShort,
    public var `EndpointAddress`: UByte,
    public var `Interval`: UByte,
    public var `PipeType`: `USBD_PIPE_TYPE`,
    public var `PipeHandle`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `MaximumTransferSize`: UInt,
    public var `PipeFlags`: UInt,
)
// UNSUPPORTED Rust 673:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USBD_PIPE_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `USBD_PIPE_TYPE` = Int;
public const val `USBD_PORT_CONNECTED`: UInt = 2u;
public const val `USBD_PORT_ENABLED`: UInt = 1u;
public const val `USBD_SHORT_TRANSFER_OK`: UInt = 2u;
public const val `USBD_START_ISO_TRANSFER_ASAP`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USBD_STREAM_INFORMATION` (
    public var `PipeHandle`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `StreamID`: UInt,
    public var `MaximumTransferSize`: UInt,
    public var `PipeFlags`: UInt,
)
// UNSUPPORTED Rust 691:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USBD_STREAM_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `USBD_TRANSFER_DIRECTION`: UInt = 1u;
public const val `USBD_TRANSFER_DIRECTION_IN`: UInt = 1u;
public const val `USBD_TRANSFER_DIRECTION_OUT`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USBD_VERSION_INFORMATION` (
    public var `USBDI_Version`: UInt,
    public var `Supported_USB_Version`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 40 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USBFN_BUS_CONFIGURATION_INFO` (
    public var `ConfigurationName`: UShortArray,
    public var `IsCurrent`: Boolean,
    public var `IsActive`: Boolean,
)
// UNSUPPORTED Rust 712:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USBFN_BUS_CONFIGURATION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `USBFN_BUS_SPEED` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 40 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 39 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USBFN_CLASS_INFORMATION_PACKET` (
    public var `FullSpeedClassInterface`: `USBFN_CLASS_INTERFACE`,
    public var `HighSpeedClassInterface`: `USBFN_CLASS_INTERFACE`,
    public var `InterfaceName`: UShortArray,
    public var `InterfaceGuid`: UShortArray,
    public var `HasInterfaceGuid`: Boolean,
    public var `SuperSpeedClassInterface`: `USBFN_CLASS_INTERFACE`,
)
// UNSUPPORTED Rust 728:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USBFN_CLASS_INFORMATION_PACKET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 40 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 39 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USBFN_CLASS_INFORMATION_PACKET_EX` (
    public var `FullSpeedClassInterfaceEx`: `USBFN_CLASS_INTERFACE_EX`,
    public var `HighSpeedClassInterfaceEx`: `USBFN_CLASS_INTERFACE_EX`,
    public var `SuperSpeedClassInterfaceEx`: `USBFN_CLASS_INTERFACE_EX`,
    public var `InterfaceName`: UShortArray,
    public var `InterfaceGuid`: UShortArray,
    public var `HasInterfaceGuid`: Boolean,
)
// UNSUPPORTED Rust 743:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USBFN_CLASS_INFORMATION_PACKET_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USBFN_CLASS_INTERFACE` (
    public var `InterfaceNumber`: UByte,
    public var `PipeCount`: UByte,
    public var `PipeArr`: Array<`USBFN_PIPE_INFORMATION`>,
)
// UNSUPPORTED Rust 755:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USBFN_CLASS_INTERFACE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USBFN_CLASS_INTERFACE_EX` (
    public var `BaseInterfaceNumber`: UByte,
    public var `InterfaceCount`: UByte,
    public var `PipeCount`: UByte,
    public var `PipeArr`: Array<`USBFN_PIPE_INFORMATION`>,
)
// UNSUPPORTED Rust 768:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USBFN_CLASS_INTERFACE_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `USBFN_DEVICE_STATE` = Int;
public typealias `USBFN_DIRECTION` = Int;
public typealias `USBFN_EVENT` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USBFN_INTERFACE_INFO` (
    public var `InterfaceNumber`: UByte,
    public var `Speed`: `USBFN_BUS_SPEED`,
    public var `Size`: UShort,
    public var `InterfaceDescriptorSet`: UByteArray,
)
// UNSUPPORTED Rust 784:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USBFN_INTERFACE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `USBFN_INTERRUPT_ENDPOINT_SIZE_NOT_UPDATEABLE_MASK`: UInt = 128u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USBFN_NOTIFICATION` (
    public var `Event`: `USBFN_EVENT`,
    public var `u`: `USBFN_NOTIFICATION_0`,
)
// UNSUPPORTED Rust 796:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USBFN_NOTIFICATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 801:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union USBFN_NOTIFICATION_0 {
//     pub BusSpeed: USBFN_BUS_SPEED,
//     pub SetupPacket: USB_DEFAULT_PIPE_SETUP_PACKET,
//     pub ConfigurationValue: u16,
//     pub PortType: USBFN_PORT_TYPE,
//     pub AlternateInterface: ALTERNATE_INTERFACE,
// }

// UNSUPPORTED Rust 810:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USBFN_NOTIFICATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USBFN_PIPE_INFORMATION` (
    public var `EpDesc`: `USB_ENDPOINT_DESCRIPTOR`,
    public var `PipeId`: UInt,
)
public typealias `USBFN_PORT_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 255 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USBFN_USB_STRING` (
    public var `StringIndex`: UByte,
    public var `UsbString`: UShortArray,
)
// UNSUPPORTED Rust 828:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USBFN_USB_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USBSCAN_GET_DESCRIPTOR` (
    public var `DescriptorType`: UByte,
    public var `Index`: UByte,
    public var `LanguageId`: UShort,
)
public const val `USBSCAN_PIPE_BULK`: `RAW_PIPE_TYPE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USBSCAN_PIPE_CONFIGURATION` (
    public var `NumberOfPipes`: UInt,
    public var `PipeInfo`: Array<`USBSCAN_PIPE_INFORMATION`>,
)
// UNSUPPORTED Rust 847:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USBSCAN_PIPE_CONFIGURATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `USBSCAN_PIPE_CONTROL`: `RAW_PIPE_TYPE` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USBSCAN_PIPE_INFORMATION` (
    public var `MaximumPacketSize`: UShort,
    public var `EndpointAddress`: UByte,
    public var `Interval`: UByte,
    public var `PipeType`: `RAW_PIPE_TYPE`,
)
public const val `USBSCAN_PIPE_INTERRUPT`: `RAW_PIPE_TYPE` = 3;
public const val `USBSCAN_PIPE_ISOCHRONOUS`: `RAW_PIPE_TYPE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USBSCAN_TIMEOUT` (
    public var `TimeoutRead`: UInt,
    public var `TimeoutWrite`: UInt,
    public var `TimeoutEvent`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USBUSER_BANDWIDTH_INFO_REQUEST` (
    public var `Header`: `USBUSER_REQUEST_HEADER`,
    public var `BandwidthInformation`: `USB_BANDWIDTH_INFO`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USBUSER_BUS_STATISTICS_0_REQUEST` (
    public var `Header`: `USBUSER_REQUEST_HEADER`,
    public var `BusStatistics0`: `USB_BUS_STATISTICS_0`,
)
public const val `USBUSER_CLEAR_ROOTPORT_FEATURE`: UInt = 536870918u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USBUSER_CLOSE_RAW_DEVICE` (
    public var `Header`: `USBUSER_REQUEST_HEADER`,
    public var `Parameters`: `USB_CLOSE_RAW_DEVICE_PARAMETERS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USBUSER_CONTROLLER_INFO_0` (
    public var `Header`: `USBUSER_REQUEST_HEADER`,
    public var `Info0`: `USB_CONTROLLER_INFO_0`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USBUSER_CONTROLLER_UNICODE_NAME` (
    public var `Header`: `USBUSER_REQUEST_HEADER`,
    public var `UnicodeName`: `USB_UNICODE_NAME`,
)
public const val `USBUSER_GET_BANDWIDTH_INFORMATION`: UInt = 5u;
public const val `USBUSER_GET_BUS_STATISTICS_0`: UInt = 6u;
public const val `USBUSER_GET_CONTROLLER_DRIVER_KEY`: UInt = 2u;
public const val `USBUSER_GET_CONTROLLER_INFO_0`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USBUSER_GET_DRIVER_VERSION` (
    public var `Header`: `USBUSER_REQUEST_HEADER`,
    public var `Parameters`: `USB_DRIVER_VERSION_PARAMETERS`,
)
public const val `USBUSER_GET_POWER_STATE_MAP`: UInt = 4u;
public const val `USBUSER_GET_ROOTHUB_SYMBOLIC_NAME`: UInt = 7u;
public const val `USBUSER_GET_ROOTPORT_STATUS`: UInt = 536870919u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USBUSER_GET_USB2HW_VERSION` (
    public var `Header`: `USBUSER_REQUEST_HEADER`,
    public var `Parameters`: `USB_USB2HW_VERSION_PARAMETERS`,
)
public const val `USBUSER_GET_USB2_HW_VERSION`: UInt = 9u;
public const val `USBUSER_GET_USB_DRIVER_VERSION`: UInt = 8u;
public const val `USBUSER_INVALID_REQUEST`: UInt = 4294967280u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USBUSER_OPEN_RAW_DEVICE` (
    public var `Header`: `USBUSER_REQUEST_HEADER`,
    public var `Parameters`: `USB_OPEN_RAW_DEVICE_PARAMETERS`,
)
public const val `USBUSER_OP_CLOSE_RAW_DEVICE`: UInt = 536870915u;
public const val `USBUSER_OP_MASK_DEVONLY_API`: UInt = 268435456u;
public const val `USBUSER_OP_MASK_HCTEST_API`: UInt = 536870912u;
public const val `USBUSER_OP_OPEN_RAW_DEVICE`: UInt = 536870914u;
public const val `USBUSER_OP_RAW_RESET_PORT`: UInt = 536870913u;
public const val `USBUSER_OP_SEND_ONE_PACKET`: UInt = 268435457u;
public const val `USBUSER_OP_SEND_RAW_COMMAND`: UInt = 536870916u;
public const val `USBUSER_PASS_THRU`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USBUSER_PASS_THRU_REQUEST` (
    public var `Header`: `USBUSER_REQUEST_HEADER`,
    public var `PassThru`: `USB_PASS_THRU_PARAMETERS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USBUSER_POWER_INFO_REQUEST` (
    public var `Header`: `USBUSER_REQUEST_HEADER`,
    public var `PowerInformation`: `USB_POWER_INFO`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USBUSER_RAW_RESET_ROOT_PORT` (
    public var `Header`: `USBUSER_REQUEST_HEADER`,
    public var `Parameters`: `RAW_RESET_PORT_PARAMETERS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USBUSER_REFRESH_HCT_REG` (
    public var `Header`: `USBUSER_REQUEST_HEADER`,
    public var `Flags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USBUSER_REQUEST_HEADER` (
    public var `UsbUserRequest`: UInt,
    public var `UsbUserStatusCode`: `USB_USER_ERROR_CODE`,
    public var `RequestBufferLength`: UInt,
    public var `ActualBufferLength`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USBUSER_ROOTPORT_FEATURE_REQUEST` (
    public var `Header`: `USBUSER_REQUEST_HEADER`,
    public var `Parameters`: `RAW_ROOTPORT_FEATURE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USBUSER_ROOTPORT_PARAMETERS` (
    public var `Header`: `USBUSER_REQUEST_HEADER`,
    public var `Parameters`: `RAW_ROOTPORT_PARAMETERS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USBUSER_SEND_ONE_PACKET` (
    public var `Header`: `USBUSER_REQUEST_HEADER`,
    public var `PacketParameters`: `PACKET_PARAMETERS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USBUSER_SEND_RAW_COMMAND` (
    public var `Header`: `USBUSER_REQUEST_HEADER`,
    public var `Parameters`: `USB_SEND_RAW_COMMAND_PARAMETERS`,
)
public const val `USBUSER_SET_ROOTPORT_FEATURE`: UInt = 536870917u;
public const val `USBUSER_USB_REFRESH_HCT_REG`: UInt = 10u;
public const val `USBUSER_VERSION`: UInt = 4u;
public const val `USB_20_ENDPOINT_TYPE_INTERRUPT_RESERVED_MASK`: UInt = 252u;
public const val `USB_20_HUB_DESCRIPTOR_TYPE`: UInt = 41u;
// UNSUPPORTED Rust 998:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_20_PORT_CHANGE {
//     pub AsUshort16: u16,
//     pub Anonymous: USB_20_PORT_CHANGE_0,
// }

// UNSUPPORTED Rust 1004:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_20_PORT_CHANGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_20_PORT_CHANGE_0` (
    public var `_bitfield`: UShort,
)
// UNSUPPORTED Rust 1014:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_20_PORT_STATUS {
//     pub AsUshort16: u16,
//     pub Anonymous: USB_20_PORT_STATUS_0,
// }

// UNSUPPORTED Rust 1020:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_20_PORT_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_20_PORT_STATUS_0` (
    public var `_bitfield`: UShort,
)
public const val `USB_30_ENDPOINT_TYPE_INTERRUPT_RESERVED_MASK`: UInt = 204u;
public const val `USB_30_ENDPOINT_TYPE_INTERRUPT_USAGE_MASK`: UInt = 48u;
public const val `USB_30_ENDPOINT_TYPE_INTERRUPT_USAGE_NOTIFICATION`: UInt = 16u;
public const val `USB_30_ENDPOINT_TYPE_INTERRUPT_USAGE_PERIODIC`: UInt = 0u;
public const val `USB_30_ENDPOINT_TYPE_INTERRUPT_USAGE_RESERVED10`: UInt = 32u;
public const val `USB_30_ENDPOINT_TYPE_INTERRUPT_USAGE_RESERVED11`: UInt = 48u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_30_HUB_DESCRIPTOR` (
    public var `bLength`: UByte,
    public var `bDescriptorType`: UByte,
    public var `bNumberOfPorts`: UByte,
    public var `wHubCharacteristics`: UShort,
    public var `bPowerOnToPowerGood`: UByte,
    public var `bHubControlCurrent`: UByte,
    public var `bHubHdrDecLat`: UByte,
    public var `wHubDelay`: UShort,
    public var `DeviceRemovable`: UShort,
)
public const val `USB_30_HUB_DESCRIPTOR_TYPE`: UInt = 42u;
// UNSUPPORTED Rust 1050:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_30_PORT_CHANGE {
//     pub AsUshort16: u16,
//     pub Anonymous: USB_30_PORT_CHANGE_0,
// }

// UNSUPPORTED Rust 1056:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_30_PORT_CHANGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_30_PORT_CHANGE_0` (
    public var `_bitfield`: UShort,
)
// UNSUPPORTED Rust 1066:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_30_PORT_STATUS {
//     pub AsUshort16: u16,
//     pub Anonymous: USB_30_PORT_STATUS_0,
// }

// UNSUPPORTED Rust 1072:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_30_PORT_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_30_PORT_STATUS_0` (
    public var `_bitfield`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_ACQUIRE_INFO` (
    public var `NotificationType`: `USB_NOTIFICATION_TYPE`,
    public var `TotalSize`: UInt,
    public var `Buffer`: UShortArray,
)
// UNSUPPORTED Rust 1089:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_ACQUIRE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `USB_ALLOW_FIRMWARE_UPDATE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_BANDWIDTH_INFO` (
    public var `DeviceCount`: UInt,
    public var `TotalBusBandwidth`: UInt,
    public var `Total32secBandwidth`: UInt,
    public var `AllocedBulkAndControl`: UInt,
    public var `AllocedIso`: UInt,
    public var `AllocedInterrupt_1ms`: UInt,
    public var `AllocedInterrupt_2ms`: UInt,
    public var `AllocedInterrupt_4ms`: UInt,
    public var `AllocedInterrupt_8ms`: UInt,
    public var `AllocedInterrupt_16ms`: UInt,
    public var `AllocedInterrupt_32ms`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_BOS_DESCRIPTOR` (
    public var `bLength`: UByte,
    public var `bDescriptorType`: UByte,
    public var `wTotalLength`: UShort,
    public var `bNumDeviceCaps`: UByte,
)
public const val `USB_BOS_DESCRIPTOR_TYPE`: UInt = 15u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_BUS_NOTIFICATION` (
    public var `NotificationType`: `USB_NOTIFICATION_TYPE`,
    public var `TotalBandwidth`: UInt,
    public var `ConsumedBandwidth`: UInt,
    public var `ControllerNameLength`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_BUS_STATISTICS_0` (
    public var `DeviceCount`: UInt,
    public var `CurrentSystemTime`: Long,
    public var `CurrentUsbFrame`: UInt,
    public var `BulkBytes`: UInt,
    public var `IsoBytes`: UInt,
    public var `InterruptBytes`: UInt,
    public var `ControlDataBytes`: UInt,
    public var `PciInterruptCount`: UInt,
    public var `HardResetCount`: UInt,
    public var `WorkerSignalCount`: UInt,
    public var `CommonBufferBytes`: UInt,
    public var `WorkerIdleTimeMs`: UInt,
    public var `RootHubEnabled`: Boolean,
    public var `RootHubDevicePowerState`: UByte,
    public var `Unused`: UByte,
    public var `NameIndex`: UByte,
)
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `USB_CHANGE_REGISTRATION_HANDLE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public const val `USB_CHARGING_POLICY_DEFAULT`: UInt = 0u;
public const val `USB_CHARGING_POLICY_ICCHPF`: UInt = 1u;
public const val `USB_CHARGING_POLICY_ICCLPF`: UInt = 2u;
public const val `USB_CHARGING_POLICY_NO_POWER`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_CLOSE_RAW_DEVICE_PARAMETERS` (
    public var `xxx`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_COMMON_DESCRIPTOR` (
    public var `bLength`: UByte,
    public var `bDescriptorType`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_COMPOSITE_DEVICE_INFO` (
    public var `DeviceDescriptor`: `USB_DEVICE_DESCRIPTOR`,
    public var `CurrentConfigDescriptor`: `USB_CONFIGURATION_DESCRIPTOR`,
    public var `CurrentConfigurationValue`: UByte,
    public var `NumberOfFunctions`: UByte,
    public var `FunctionInfo`: Array<`USB_COMPOSITE_FUNCTION_INFO`>,
)
// UNSUPPORTED Rust 1172:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_COMPOSITE_DEVICE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_COMPOSITE_FUNCTION_INFO` (
    public var `FunctionNumber`: UByte,
    public var `BaseInterfaceNumber`: UByte,
    public var `NumberOfInterfaces`: UByte,
    public var `FunctionIsIdle`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_CONFIGURATION_DESCRIPTOR` (
    public var `bLength`: UByte,
    public var `bDescriptorType`: UByte,
    public var `wTotalLength`: UShort,
    public var `bNumInterfaces`: UByte,
    public var `bConfigurationValue`: UByte,
    public var `iConfiguration`: UByte,
    public var `bmAttributes`: UByte,
    public var `MaxPower`: UByte,
)
public const val `USB_CONFIGURATION_DESCRIPTOR_TYPE`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_CONFIGURATION_POWER_DESCRIPTOR` (
    public var `bLength`: UByte,
    public var `bDescriptorType`: UByte,
    public var `SelfPowerConsumedD0`: UByteArray,
    public var `bPowerSummaryId`: UByte,
    public var `bBusPowerSavingD1`: UByte,
    public var `bSelfPowerSavingD1`: UByte,
    public var `bBusPowerSavingD2`: UByte,
    public var `bSelfPowerSavingD2`: UByte,
    public var `bBusPowerSavingD3`: UByte,
    public var `bSelfPowerSavingD3`: UByte,
    public var `TransitionTimeFromD1`: UShort,
    public var `TransitionTimeFromD2`: UShort,
    public var `TransitionTimeFromD3`: UShort,
)
// UNSUPPORTED Rust 1215:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_CONFIGURATION_POWER_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `USB_CONFIG_BUS_POWERED`: UInt = 128u;
public const val `USB_CONFIG_POWERED_MASK`: UInt = 192u;
public const val `USB_CONFIG_POWER_DESCRIPTOR_TYPE`: UInt = 7u;
public const val `USB_CONFIG_REMOTE_WAKEUP`: UInt = 32u;
public const val `USB_CONFIG_RESERVED`: UInt = 31u;
public const val `USB_CONFIG_SELF_POWERED`: UInt = 64u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_CONNECTION_NOTIFICATION` (
    public var `NotificationType`: `USB_NOTIFICATION_TYPE`,
    public var `ConnectionNumber`: UInt,
    public var `RequestedBandwidth`: UInt,
    public var `EnumerationFailReason`: UInt,
    public var `PowerRequested`: UInt,
    public var `HubNameLength`: UInt,
)
public typealias `USB_CONNECTION_STATUS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_CONTROLLER_DEVICE_INFO` (
    public var `PciVendorId`: UInt,
    public var `PciDeviceId`: UInt,
    public var `PciRevision`: UInt,
    public var `NumberOfRootPorts`: UInt,
    public var `HcFeatureFlags`: UInt,
)
public typealias `USB_CONTROLLER_FLAVOR` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_CONTROLLER_INFO_0` (
    public var `PciVendorId`: UInt,
    public var `PciDeviceId`: UInt,
    public var `PciRevision`: UInt,
    public var `NumberOfRootPorts`: UInt,
    public var `ControllerFlavor`: `USB_CONTROLLER_FLAVOR`,
    public var `HcFeatureFlags`: UInt,
)
public const val `USB_CYCLE_PORT`: UInt = 7u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_CYCLE_PORT_PARAMS` (
    public var `ConnectionIndex`: UInt,
    public var `StatusReturned`: UInt,
)
public const val `USB_DEBUG_DESCRIPTOR_TYPE`: UInt = 10u;
public const val `USB_DEFAULT_DEVICE_ADDRESS`: UInt = 0u;
public const val `USB_DEFAULT_ENDPOINT_ADDRESS`: UInt = 0u;
public const val `USB_DEFAULT_MAX_PACKET`: UInt = 64u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_DEFAULT_PIPE_SETUP_PACKET` (
    public var `bmRequestType`: `BM_REQUEST_TYPE`,
    public var `bRequest`: UByte,
    public var `wValue`: `USB_DEFAULT_PIPE_SETUP_PACKET_0`,
    public var `wIndex`: `USB_DEFAULT_PIPE_SETUP_PACKET_1`,
    public var `wLength`: UShort,
)
// UNSUPPORTED Rust 1277:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_DEFAULT_PIPE_SETUP_PACKET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1282:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_DEFAULT_PIPE_SETUP_PACKET_1 {
//     pub Anonymous: USB_DEFAULT_PIPE_SETUP_PACKET_1_0,
//     pub W: u16,
// }

// UNSUPPORTED Rust 1288:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_DEFAULT_PIPE_SETUP_PACKET_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_DEFAULT_PIPE_SETUP_PACKET_1_0` (
    public var `LowByte`: UByte,
    public var `HiByte`: UByte,
)
// UNSUPPORTED Rust 1299:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_DEFAULT_PIPE_SETUP_PACKET_0 {
//     pub Anonymous: USB_DEFAULT_PIPE_SETUP_PACKET_0_0,
//     pub W: u16,
// }

// UNSUPPORTED Rust 1305:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_DEFAULT_PIPE_SETUP_PACKET_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_DEFAULT_PIPE_SETUP_PACKET_0_0` (
    public var `LowByte`: UByte,
    public var `HiByte`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_DESCRIPTOR_REQUEST` (
    public var `ConnectionIndex`: UInt,
    public var `SetupPacket`: `USB_DESCRIPTOR_REQUEST_0`,
    public var `Data`: UByteArray,
)
// UNSUPPORTED Rust 1323:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_DESCRIPTOR_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_DESCRIPTOR_REQUEST_0` (
    public var `bmRequest`: UByte,
    public var `bRequest`: UByte,
    public var `wValue`: UShort,
    public var `wIndex`: UShort,
    public var `wLength`: UShort,
)
public const val `USB_DEVICE_CAPABILITY_BATTERY_INFO`: UInt = 7u;
public const val `USB_DEVICE_CAPABILITY_BILLBOARD`: UInt = 13u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_DEVICE_CAPABILITY_BILLBOARD_DESCRIPTOR` (
    public var `bLength`: UByte,
    public var `bDescriptorType`: UByte,
    public var `bDevCapabilityType`: UByte,
    public var `iAddtionalInfoURL`: UByte,
    public var `bNumberOfAlternateModes`: UByte,
    public var `bPreferredAlternateMode`: UByte,
    public var `VconnPower`: `USB_DEVICE_CAPABILITY_BILLBOARD_DESCRIPTOR_0`,
    public var `bmConfigured`: UByteArray,
    public var `bReserved`: UInt,
    public var `AlternateMode`: Array<`USB_DEVICE_CAPABILITY_BILLBOARD_DESCRIPTOR_1`>,
)
// UNSUPPORTED Rust 1353:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_DEVICE_CAPABILITY_BILLBOARD_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_DEVICE_CAPABILITY_BILLBOARD_DESCRIPTOR_1` (
    public var `wSVID`: UShort,
    public var `bAlternateMode`: UByte,
    public var `iAlternateModeSetting`: UByte,
)
// UNSUPPORTED Rust 1365:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_DEVICE_CAPABILITY_BILLBOARD_DESCRIPTOR_0 {
//     pub AsUshort: u16,
//     pub Anonymous: USB_DEVICE_CAPABILITY_BILLBOARD_DESCRIPTOR_0_0,
// }

// UNSUPPORTED Rust 1371:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_DEVICE_CAPABILITY_BILLBOARD_DESCRIPTOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_DEVICE_CAPABILITY_BILLBOARD_DESCRIPTOR_0_0` (
    public var `_bitfield`: UShort,
)
public const val `USB_DEVICE_CAPABILITY_CONTAINER_ID`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_DEVICE_CAPABILITY_CONTAINER_ID_DESCRIPTOR` (
    public var `bLength`: UByte,
    public var `bDescriptorType`: UByte,
    public var `bDevCapabilityType`: UByte,
    public var `bReserved`: UByte,
    public var `ContainerID`: UByteArray,
)
// UNSUPPORTED Rust 1391:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_DEVICE_CAPABILITY_CONTAINER_ID_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_DEVICE_CAPABILITY_DESCRIPTOR` (
    public var `bLength`: UByte,
    public var `bDescriptorType`: UByte,
    public var `bDevCapabilityType`: UByte,
)
public const val `USB_DEVICE_CAPABILITY_DESCRIPTOR_TYPE`: UInt = 16u;
public const val `USB_DEVICE_CAPABILITY_FIRMWARE_STATUS`: UInt = 17u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_DEVICE_CAPABILITY_FIRMWARE_STATUS_DESCRIPTOR` (
    public var `bLength`: UByte,
    public var `bDescriptorType`: UByte,
    public var `bDevCapabilityType`: UByte,
    public var `bcdDescriptorVersion`: UByte,
    public var `bmAttributes`: `USB_DEVICE_CAPABILITY_FIRMWARE_STATUS_DESCRIPTOR_0`,
)
// UNSUPPORTED Rust 1414:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_DEVICE_CAPABILITY_FIRMWARE_STATUS_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1419:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_DEVICE_CAPABILITY_FIRMWARE_STATUS_DESCRIPTOR_0 {
//     pub AsUlong: u32,
//     pub Anonymous: USB_DEVICE_CAPABILITY_FIRMWARE_STATUS_DESCRIPTOR_0_0,
// }

// UNSUPPORTED Rust 1425:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_DEVICE_CAPABILITY_FIRMWARE_STATUS_DESCRIPTOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_DEVICE_CAPABILITY_FIRMWARE_STATUS_DESCRIPTOR_0_0` (
    public var `_bitfield`: UInt,
)
public const val `USB_DEVICE_CAPABILITY_MAX_U1_LATENCY`: UInt = 10u;
public const val `USB_DEVICE_CAPABILITY_MAX_U2_LATENCY`: UInt = 2047u;
public const val `USB_DEVICE_CAPABILITY_PD_CONSUMER_PORT`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_DEVICE_CAPABILITY_PD_CONSUMER_PORT_DESCRIPTOR` (
    public var `bLength`: UByte,
    public var `bDescriptorType`: UByte,
    public var `bDevCapabilityType`: UByte,
    public var `bReserved`: UByte,
    public var `bmCapabilities`: `USB_DEVICE_CAPABILITY_PD_CONSUMER_PORT_DESCRIPTOR_0`,
    public var `wMinVoltage`: UShort,
    public var `wMaxVoltage`: UShort,
    public var `wReserved`: UShort,
    public var `dwMaxOperatingPower`: UInt,
    public var `dwMaxPeakPower`: UInt,
    public var `dwMaxPeakPowerTime`: UInt,
)
// UNSUPPORTED Rust 1453:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_DEVICE_CAPABILITY_PD_CONSUMER_PORT_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1458:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_DEVICE_CAPABILITY_PD_CONSUMER_PORT_DESCRIPTOR_0 {
//     pub AsUshort: u16,
//     pub Anonymous: USB_DEVICE_CAPABILITY_PD_CONSUMER_PORT_DESCRIPTOR_0_0,
// }

// UNSUPPORTED Rust 1464:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_DEVICE_CAPABILITY_PD_CONSUMER_PORT_DESCRIPTOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_DEVICE_CAPABILITY_PD_CONSUMER_PORT_DESCRIPTOR_0_0` (
    public var `_bitfield`: UShort,
)
public const val `USB_DEVICE_CAPABILITY_PD_PROVIDER_PORT`: UInt = 9u;
public const val `USB_DEVICE_CAPABILITY_PLATFORM`: UInt = 5u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_DEVICE_CAPABILITY_PLATFORM_DESCRIPTOR` (
    public var `bLength`: UByte,
    public var `bDescriptorType`: UByte,
    public var `bDevCapabilityType`: UByte,
    public var `bReserved`: UByte,
    public var `PlatformCapabilityUuid`: `windows_sys`.`core`.`GUID`,
    public var `CapabililityData`: UByteArray,
)
// UNSUPPORTED Rust 1486:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_DEVICE_CAPABILITY_PLATFORM_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `USB_DEVICE_CAPABILITY_POWER_DELIVERY`: UInt = 6u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_DEVICE_CAPABILITY_POWER_DELIVERY_DESCRIPTOR` (
    public var `bLength`: UByte,
    public var `bDescriptorType`: UByte,
    public var `bDevCapabilityType`: UByte,
    public var `bReserved`: UByte,
    public var `bmAttributes`: `USB_DEVICE_CAPABILITY_POWER_DELIVERY_DESCRIPTOR_0`,
    public var `bmProviderPorts`: UShort,
    public var `bmConsumerPorts`: UShort,
    public var `bcdBCVersion`: UShort,
    public var `bcdPDVersion`: UShort,
    public var `bcdUSBTypeCVersion`: UShort,
)
// UNSUPPORTED Rust 1506:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_DEVICE_CAPABILITY_POWER_DELIVERY_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1511:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_DEVICE_CAPABILITY_POWER_DELIVERY_DESCRIPTOR_0 {
//     pub AsUlong: u32,
//     pub Anonymous: USB_DEVICE_CAPABILITY_POWER_DELIVERY_DESCRIPTOR_0_0,
// }

// UNSUPPORTED Rust 1517:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_DEVICE_CAPABILITY_POWER_DELIVERY_DESCRIPTOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_DEVICE_CAPABILITY_POWER_DELIVERY_DESCRIPTOR_0_0` (
    public var `_bitfield`: UInt,
)
public const val `USB_DEVICE_CAPABILITY_PRECISION_TIME_MEASUREMENT`: UInt = 11u;
// UNSUPPORTED Rust 1528:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_SPEED {
//     pub AsUlong32: u32,
//     pub Anonymous: USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_SPEED_0,
// }

// UNSUPPORTED Rust 1534:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_SPEED {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_SPEED_0` (
    public var `_bitfield`: UInt,
)
public const val `USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_SPEED_DIR_RX`: UInt = 0u;
public const val `USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_SPEED_DIR_TX`: UInt = 1u;
public const val `USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_SPEED_LSE_BPS`: UInt = 0u;
public const val `USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_SPEED_LSE_GBPS`: UInt = 3u;
public const val `USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_SPEED_LSE_KBPS`: UInt = 1u;
public const val `USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_SPEED_LSE_MBPS`: UInt = 2u;
public const val `USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_SPEED_MODE_ASYMMETRIC`: UInt = 1u;
public const val `USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_SPEED_MODE_SYMMETRIC`: UInt = 0u;
public const val `USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_SPEED_PROTOCOL_SS`: UInt = 0u;
public const val `USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_SPEED_PROTOCOL_SSP`: UInt = 1u;
public const val `USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB`: UInt = 10u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR` (
    public var `bLength`: UByte,
    public var `bDescriptorType`: UByte,
    public var `bDevCapabilityType`: UByte,
    public var `bReserved`: UByte,
    public var `bmAttributes`: `USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_0`,
    public var `wFunctionalitySupport`: `USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_1`,
    public var `wReserved`: UShort,
    public var `bmSublinkSpeedAttr`: Array<`USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_SPEED`>,
)
// UNSUPPORTED Rust 1567:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1572:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_0 {
//     pub AsUlong: u32,
//     pub Anonymous: USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_0_0,
// }

// UNSUPPORTED Rust 1578:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_0_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 1588:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_1 {
//     pub AsUshort: u16,
//     pub Anonymous: USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_1_0,
// }

// UNSUPPORTED Rust 1594:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_1_0` (
    public var `_bitfield`: UShort,
)
public const val `USB_DEVICE_CAPABILITY_SUPERSPEED_BMATTRIBUTES_LTM_CAPABLE`: UInt = 2u;
public const val `USB_DEVICE_CAPABILITY_SUPERSPEED_BMATTRIBUTES_RESERVED_MASK`: UInt = 253u;
public const val `USB_DEVICE_CAPABILITY_SUPERSPEED_SPEEDS_SUPPORTED_FULL`: UInt = 2u;
public const val `USB_DEVICE_CAPABILITY_SUPERSPEED_SPEEDS_SUPPORTED_HIGH`: UInt = 4u;
public const val `USB_DEVICE_CAPABILITY_SUPERSPEED_SPEEDS_SUPPORTED_LOW`: UInt = 1u;
public const val `USB_DEVICE_CAPABILITY_SUPERSPEED_SPEEDS_SUPPORTED_RESERVED_MASK`: UInt = 65520u;
public const val `USB_DEVICE_CAPABILITY_SUPERSPEED_SPEEDS_SUPPORTED_SUPER`: UInt = 8u;
public const val `USB_DEVICE_CAPABILITY_SUPERSPEED_U1_DEVICE_EXIT_MAX_VALUE`: UInt = 10u;
public const val `USB_DEVICE_CAPABILITY_SUPERSPEED_U2_DEVICE_EXIT_MAX_VALUE`: UInt = 2047u;
public const val `USB_DEVICE_CAPABILITY_SUPERSPEED_USB`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_DEVICE_CAPABILITY_SUPERSPEED_USB_DESCRIPTOR` (
    public var `bLength`: UByte,
    public var `bDescriptorType`: UByte,
    public var `bDevCapabilityType`: UByte,
    public var `bmAttributes`: UByte,
    public var `wSpeedsSupported`: UShort,
    public var `bFunctionalitySupport`: UByte,
    public var `bU1DevExitLat`: UByte,
    public var `wU2DevExitLat`: UShort,
)
public const val `USB_DEVICE_CAPABILITY_USB20_EXTENSION`: UInt = 2u;
public const val `USB_DEVICE_CAPABILITY_USB20_EXTENSION_BMATTRIBUTES_RESERVED_MASK`: UInt = 4294901985u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_DEVICE_CAPABILITY_USB20_EXTENSION_DESCRIPTOR` (
    public var `bLength`: UByte,
    public var `bDescriptorType`: UByte,
    public var `bDevCapabilityType`: UByte,
    public var `bmAttributes`: `USB_DEVICE_CAPABILITY_USB20_EXTENSION_DESCRIPTOR_0`,
)
// UNSUPPORTED Rust 1636:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_DEVICE_CAPABILITY_USB20_EXTENSION_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1641:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_DEVICE_CAPABILITY_USB20_EXTENSION_DESCRIPTOR_0 {
//     pub AsUlong: u32,
//     pub Anonymous: USB_DEVICE_CAPABILITY_USB20_EXTENSION_DESCRIPTOR_0_0,
// }

// UNSUPPORTED Rust 1647:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_DEVICE_CAPABILITY_USB20_EXTENSION_DESCRIPTOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_DEVICE_CAPABILITY_USB20_EXTENSION_DESCRIPTOR_0_0` (
    public var `_bitfield`: UInt,
)
public const val `USB_DEVICE_CAPABILITY_WIRELESS_USB`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_DEVICE_CHARACTERISTICS` (
    public var `Version`: UInt,
    public var `Reserved`: UIntArray,
    public var `UsbDeviceCharacteristicsFlags`: UInt,
    public var `MaximumSendPathDelayInMilliSeconds`: UInt,
    public var `MaximumCompletionPathDelayInMilliSeconds`: UInt,
)
// UNSUPPORTED Rust 1667:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_DEVICE_CHARACTERISTICS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `USB_DEVICE_CHARACTERISTICS_MAXIMUM_PATH_DELAYS_AVAILABLE`: UInt = 1u;
public const val `USB_DEVICE_CHARACTERISTICS_VERSION_1`: UInt = 1u;
public const val `USB_DEVICE_CLASS_APPLICATION_SPECIFIC`: UInt = 254u;
public const val `USB_DEVICE_CLASS_AUDIO`: UInt = 1u;
public const val `USB_DEVICE_CLASS_AUDIO_VIDEO`: UInt = 16u;
public const val `USB_DEVICE_CLASS_BILLBOARD`: UInt = 17u;
public const val `USB_DEVICE_CLASS_CDC_DATA`: UInt = 10u;
public const val `USB_DEVICE_CLASS_COMMUNICATIONS`: UInt = 2u;
public const val `USB_DEVICE_CLASS_CONTENT_SECURITY`: UInt = 13u;
public const val `USB_DEVICE_CLASS_DIAGNOSTIC_DEVICE`: UInt = 220u;
public const val `USB_DEVICE_CLASS_HUB`: UInt = 9u;
public const val `USB_DEVICE_CLASS_HUMAN_INTERFACE`: UInt = 3u;
public const val `USB_DEVICE_CLASS_IMAGE`: UInt = 6u;
public const val `USB_DEVICE_CLASS_MISCELLANEOUS`: UInt = 239u;
public const val `USB_DEVICE_CLASS_MONITOR`: UInt = 4u;
public const val `USB_DEVICE_CLASS_PERSONAL_HEALTHCARE`: UInt = 15u;
public const val `USB_DEVICE_CLASS_PHYSICAL_INTERFACE`: UInt = 5u;
public const val `USB_DEVICE_CLASS_POWER`: UInt = 6u;
public const val `USB_DEVICE_CLASS_PRINTER`: UInt = 7u;
public const val `USB_DEVICE_CLASS_RESERVED`: UInt = 0u;
public const val `USB_DEVICE_CLASS_SMART_CARD`: UInt = 11u;
public const val `USB_DEVICE_CLASS_STORAGE`: UInt = 8u;
public const val `USB_DEVICE_CLASS_VENDOR_SPECIFIC`: UInt = 255u;
public const val `USB_DEVICE_CLASS_VIDEO`: UInt = 14u;
public const val `USB_DEVICE_CLASS_WIRELESS_CONTROLLER`: UInt = 224u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_DEVICE_DESCRIPTOR` (
    public var `bLength`: UByte,
    public var `bDescriptorType`: UByte,
    public var `bcdUSB`: UShort,
    public var `bDeviceClass`: UByte,
    public var `bDeviceSubClass`: UByte,
    public var `bDeviceProtocol`: UByte,
    public var `bMaxPacketSize0`: UByte,
    public var `idVendor`: UShort,
    public var `idProduct`: UShort,
    public var `bcdDevice`: UShort,
    public var `iManufacturer`: UByte,
    public var `iProduct`: UByte,
    public var `iSerialNumber`: UByte,
    public var `bNumConfigurations`: UByte,
)
public const val `USB_DEVICE_DESCRIPTOR_TYPE`: UInt = 1u;
public const val `USB_DEVICE_FIRMWARE_HASH_LENGTH`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_DEVICE_INFO` (
    public var `DeviceState`: `USB_DEVICE_STATE`,
    public var `PortNumber`: UShort,
    public var `DeviceDescriptor`: `USB_DEVICE_DESCRIPTOR`,
    public var `CurrentConfigurationValue`: UByte,
    public var `Speed`: `USB_DEVICE_SPEED`,
    public var `DeviceAddress`: UShort,
    public var `ConnectionIndex`: UInt,
    public var `ConnectionStatus`: `USB_CONNECTION_STATUS`,
    public var `PnpHardwareId`: UShortArray,
    public var `PnpCompatibleId`: UShortArray,
    public var `SerialNumberId`: UShortArray,
    public var `PnpDeviceDescription`: UShortArray,
    public var `NumberOfOpenPipes`: UInt,
    public var `PipeList`: Array<`USB_PIPE_INFO`>,
)
// UNSUPPORTED Rust 1735:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_DEVICE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 40 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_DEVICE_NODE_INFO` (
    public var `Sig`: UInt,
    public var `LengthInBytes`: UInt,
    public var `DeviceDescription`: UShortArray,
    public var `NodeType`: `USB_WMI_DEVICE_NODE_TYPE`,
    public var `BusAddress`: `USB_TOPOLOGY_ADDRESS`,
    public var `Anonymous`: `USB_DEVICE_NODE_INFO_0`,
)
// UNSUPPORTED Rust 1750:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_DEVICE_NODE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1755:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union USB_DEVICE_NODE_INFO_0 {
//     pub UsbDeviceInfo: USB_DEVICE_INFO,
//     pub HubDeviceInfo: USB_HUB_DEVICE_INFO,
//     pub CompositeDeviceInfo: USB_COMPOSITE_DEVICE_INFO,
//     pub ControllerDeviceInfo: USB_CONTROLLER_DEVICE_INFO,
//     pub DeviceInformation: [u8; 4],
// }

// UNSUPPORTED Rust 1764:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_DEVICE_NODE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 60 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_DEVICE_PERFORMANCE_INFO` (
    public var `BulkBytes`: UInt,
    public var `ControlDataBytes`: UInt,
    public var `IsoBytes`: UInt,
    public var `InterruptBytes`: UInt,
    public var `BulkUrbCount`: UInt,
    public var `ControlUrbCount`: UInt,
    public var `IsoUrbCount`: UInt,
    public var `InterruptUrbCount`: UInt,
    public var `AllocedInterrupt`: UIntArray,
    public var `AllocedIso`: UInt,
    public var `Total32secBandwidth`: UInt,
    public var `TotalTtBandwidth`: UInt,
    public var `DeviceDescription`: UShortArray,
    public var `DeviceSpeed`: `USB_DEVICE_SPEED`,
    public var `TotalIsoLatency`: UInt,
    public var `DroppedIsoPackets`: UInt,
    public var `TransferErrors`: UInt,
    public var `PciInterruptCount`: UInt,
    public var `HcIdleState`: UInt,
    public var `HcAsyncIdleState`: UInt,
    public var `HcAsyncCacheFlushCount`: UInt,
    public var `HcPeriodicIdleState`: UInt,
    public var `HcPeriodicCacheFlushCount`: UInt,
)
// UNSUPPORTED Rust 1796:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_DEVICE_PERFORMANCE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_DEVICE_QUALIFIER_DESCRIPTOR` (
    public var `bLength`: UByte,
    public var `bDescriptorType`: UByte,
    public var `bcdUSB`: UShort,
    public var `bDeviceClass`: UByte,
    public var `bDeviceSubClass`: UByte,
    public var `bDeviceProtocol`: UByte,
    public var `bMaxPacketSize0`: UByte,
    public var `bNumConfigurations`: UByte,
    public var `bReserved`: UByte,
)
public const val `USB_DEVICE_QUALIFIER_DESCRIPTOR_TYPE`: UInt = 6u;
public typealias `USB_DEVICE_SPEED` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_DEVICE_STATE` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 1821:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_DEVICE_STATUS {
//     pub AsUshort16: u16,
//     pub Anonymous: USB_DEVICE_STATUS_0,
// }

// UNSUPPORTED Rust 1827:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_DEVICE_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_DEVICE_STATUS_0` (
    public var `_bitfield`: UShort,
)
public typealias `USB_DEVICE_TYPE` = Int;
public const val `USB_DIAG_IGNORE_HUBS_OFF`: UInt = 263u;
public const val `USB_DIAG_IGNORE_HUBS_ON`: UInt = 262u;
public const val `USB_DISALLOW_FIRMWARE_UPDATE`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_DRIVER_VERSION_PARAMETERS` (
    public var `DriverTrackingCode`: UInt,
    public var `USBDI_Version`: UInt,
    public var `USBUSER_Version`: UInt,
    public var `CheckedPortDriver`: Boolean,
    public var `CheckedMiniportDriver`: Boolean,
    public var `USB_Version`: UShort,
)
public const val `USB_ENABLE_PORT`: UInt = 5u;
public const val `USB_ENDPOINT_ADDRESS_MASK`: UInt = 15u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_ENDPOINT_DESCRIPTOR` (
    public var `bLength`: UByte,
    public var `bDescriptorType`: UByte,
    public var `bEndpointAddress`: UByte,
    public var `bmAttributes`: UByte,
    public var `wMaxPacketSize`: UShort,
    public var `bInterval`: UByte,
)
public const val `USB_ENDPOINT_DESCRIPTOR_TYPE`: UInt = 5u;
public const val `USB_ENDPOINT_DIRECTION_MASK`: UInt = 128u;
// UNSUPPORTED Rust 1865:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_ENDPOINT_STATUS {
//     pub AsUshort16: u16,
//     pub Anonymous: USB_ENDPOINT_STATUS_0,
// }

// UNSUPPORTED Rust 1871:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_ENDPOINT_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_ENDPOINT_STATUS_0` (
    public var `_bitfield`: UShort,
)
public const val `USB_ENDPOINT_SUPERSPEED_BULK_MAX_PACKET_SIZE`: UInt = 1024u;
public const val `USB_ENDPOINT_SUPERSPEED_CONTROL_MAX_PACKET_SIZE`: UInt = 512u;
public const val `USB_ENDPOINT_SUPERSPEED_INTERRUPT_MAX_PACKET_SIZE`: UInt = 1024u;
public const val `USB_ENDPOINT_SUPERSPEED_ISO_MAX_PACKET_SIZE`: UInt = 1024u;
public const val `USB_ENDPOINT_TYPE_BULK`: UInt = 2u;
public const val `USB_ENDPOINT_TYPE_BULK_RESERVED_MASK`: UInt = 252u;
public const val `USB_ENDPOINT_TYPE_CONTROL`: UInt = 0u;
public const val `USB_ENDPOINT_TYPE_CONTROL_RESERVED_MASK`: UInt = 252u;
public const val `USB_ENDPOINT_TYPE_INTERRUPT`: UInt = 3u;
public const val `USB_ENDPOINT_TYPE_ISOCHRONOUS`: UInt = 1u;
public const val `USB_ENDPOINT_TYPE_ISOCHRONOUS_RESERVED_MASK`: UInt = 192u;
public const val `USB_ENDPOINT_TYPE_ISOCHRONOUS_SYNCHRONIZATION_ADAPTIVE`: UInt = 8u;
public const val `USB_ENDPOINT_TYPE_ISOCHRONOUS_SYNCHRONIZATION_ASYNCHRONOUS`: UInt = 4u;
public const val `USB_ENDPOINT_TYPE_ISOCHRONOUS_SYNCHRONIZATION_MASK`: UInt = 12u;
public const val `USB_ENDPOINT_TYPE_ISOCHRONOUS_SYNCHRONIZATION_NO_SYNCHRONIZATION`: UInt = 0u;
public const val `USB_ENDPOINT_TYPE_ISOCHRONOUS_SYNCHRONIZATION_SYNCHRONOUS`: UInt = 12u;
public const val `USB_ENDPOINT_TYPE_ISOCHRONOUS_USAGE_DATA_ENDOINT`: UInt = 0u;
public const val `USB_ENDPOINT_TYPE_ISOCHRONOUS_USAGE_FEEDBACK_ENDPOINT`: UInt = 16u;
public const val `USB_ENDPOINT_TYPE_ISOCHRONOUS_USAGE_IMPLICIT_FEEDBACK_DATA_ENDPOINT`: UInt = 32u;
public const val `USB_ENDPOINT_TYPE_ISOCHRONOUS_USAGE_MASK`: UInt = 48u;
public const val `USB_ENDPOINT_TYPE_ISOCHRONOUS_USAGE_RESERVED`: UInt = 48u;
public const val `USB_ENDPOINT_TYPE_MASK`: UInt = 3u;
public const val `USB_FAIL_GET_STATUS`: UInt = 280u;
public const val `USB_FEATURE_BATTERY_WAKE_MASK`: UInt = 40u;
public const val `USB_FEATURE_CHARGING_POLICY`: UInt = 54u;
public const val `USB_FEATURE_ENDPOINT_STALL`: UInt = 0u;
public const val `USB_FEATURE_FUNCTION_SUSPEND`: UInt = 0u;
public const val `USB_FEATURE_INTERFACE_POWER_D0`: UInt = 2u;
public const val `USB_FEATURE_INTERFACE_POWER_D1`: UInt = 3u;
public const val `USB_FEATURE_INTERFACE_POWER_D2`: UInt = 4u;
public const val `USB_FEATURE_INTERFACE_POWER_D3`: UInt = 5u;
public const val `USB_FEATURE_LDM_ENABLE`: UInt = 53u;
public const val `USB_FEATURE_LTM_ENABLE`: UInt = 50u;
public const val `USB_FEATURE_OS_IS_PD_AWARE`: UInt = 41u;
public const val `USB_FEATURE_POLICY_MODE`: UInt = 42u;
public const val `USB_FEATURE_REMOTE_WAKEUP`: UInt = 1u;
public const val `USB_FEATURE_TEST_MODE`: UInt = 2u;
public const val `USB_FEATURE_U1_ENABLE`: UInt = 48u;
public const val `USB_FEATURE_U2_ENABLE`: UInt = 49u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_FRAME_NUMBER_AND_QPC_FOR_TIME_SYNC_INFORMATION` (
    public var `TimeTrackingHandle`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `InputFrameNumber`: UInt,
    public var `InputMicroFrameNumber`: UInt,
    public var `QueryPerformanceCounterAtInputFrameOrMicroFrame`: Long,
    public var `QueryPerformanceCounterFrequency`: Long,
    public var `PredictedAccuracyInMicroSeconds`: UInt,
    public var `CurrentGenerationID`: UInt,
    public var `CurrentQueryPerformanceCounter`: Long,
    public var `CurrentHardwareFrameNumber`: UInt,
    public var `CurrentHardwareMicroFrameNumber`: UInt,
    public var `CurrentUSBFrameNumber`: UInt,
)
// UNSUPPORTED Rust 1935:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_FRAME_NUMBER_AND_QPC_FOR_TIME_SYNC_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1940:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union USB_FUNCTION_SUSPEND_OPTIONS {
//     pub AsUchar: u8,
//     pub Anonymous: USB_FUNCTION_SUSPEND_OPTIONS_0,
// }

// UNSUPPORTED Rust 1946:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_FUNCTION_SUSPEND_OPTIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_FUNCTION_SUSPEND_OPTIONS_0` (
    public var `_bitfield`: UByte,
)
public const val `USB_GETSTATUS_LTM_ENABLE`: UInt = 16u;
public const val `USB_GETSTATUS_REMOTE_WAKEUP_ENABLED`: UInt = 2u;
public const val `USB_GETSTATUS_SELF_POWERED`: UInt = 1u;
public const val `USB_GETSTATUS_U1_ENABLE`: UInt = 4u;
public const val `USB_GETSTATUS_U2_ENABLE`: UInt = 8u;
public const val `USB_GET_BUSGUID_INFO`: UInt = 266u;
public const val `USB_GET_BUS_INFO`: UInt = 264u;
public const val `USB_GET_CONTROLLER_NAME`: UInt = 265u;
public const val `USB_GET_DESCRIPTOR_FROM_NODE_CONNECTION`: UInt = 260u;
public const val `USB_GET_DEVICE_CHARACTERISTICS`: UInt = 288u;
public const val `USB_GET_DEVICE_HANDLE`: UInt = 268u;
public const val `USB_GET_DEVICE_HANDLE_EX`: UInt = 269u;
public const val `USB_GET_FIRMWARE_ALLOWED_OR_DISALLOWED_STATE`: UInt = 0u;
public const val `USB_GET_FIRMWARE_HASH`: UInt = 1u;
public const val `USB_GET_FRAME_NUMBER_AND_QPC_FOR_TIME_SYNC`: UInt = 286u;
public const val `USB_GET_HUB_CAPABILITIES`: UInt = 271u;
public const val `USB_GET_HUB_CAPABILITIES_EX`: UInt = 276u;
public const val `USB_GET_HUB_CONFIG_INFO`: UInt = 275u;
public const val `USB_GET_HUB_COUNT`: UInt = 6u;
public const val `USB_GET_HUB_INFORMATION_EX`: UInt = 277u;
public const val `USB_GET_HUB_NAME`: UInt = 8u;
public const val `USB_GET_NODE_CONNECTION_ATTRIBUTES`: UInt = 272u;
public const val `USB_GET_NODE_CONNECTION_DRIVERKEY_NAME`: UInt = 264u;
public const val `USB_GET_NODE_CONNECTION_INFORMATION`: UInt = 259u;
public const val `USB_GET_NODE_CONNECTION_INFORMATION_EX`: UInt = 274u;
public const val `USB_GET_NODE_CONNECTION_INFORMATION_EX_V2`: UInt = 279u;
public const val `USB_GET_NODE_CONNECTION_NAME`: UInt = 261u;
public const val `USB_GET_NODE_INFORMATION`: UInt = 258u;
public const val `USB_GET_PARENT_HUB_INFO`: UInt = 267u;
public const val `USB_GET_PORT_CONNECTOR_PROPERTIES`: UInt = 278u;
public const val `USB_GET_PORT_STATUS`: UInt = 4u;
public const val `USB_GET_ROOTHUB_PDO`: UInt = 3u;
public const val `USB_GET_TOPOLOGY_ADDRESS`: UInt = 271u;
public const val `USB_GET_TRANSPORT_CHARACTERISTICS`: UInt = 281u;
public const val `USB_GET_TT_DEVICE_HANDLE`: UInt = 270u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_HCD_DRIVERKEY_NAME` (
    public var `ActualLength`: UInt,
    public var `DriverKeyName`: UShortArray,
)
// UNSUPPORTED Rust 1997:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_HCD_DRIVERKEY_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `USB_HC_FEATURE_FLAG_PORT_POWER_SWITCHING`: UInt = 1u;
public const val `USB_HC_FEATURE_FLAG_SEL_SUSPEND`: UInt = 2u;
public const val `USB_HC_FEATURE_LEGACY_BIOS`: UInt = 4u;
public const val `USB_HC_FEATURE_TIME_SYNC_API`: UInt = 8u;
// UNSUPPORTED Rust 2006:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_HIGH_SPEED_MAXPACKET {
//     pub us: u16,
// }

// UNSUPPORTED Rust 2011:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_HIGH_SPEED_MAXPACKET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_HIGH_SPEED_MAXPACKET_0` (
    public var `_bitfield`: UShort,
)
// UNSUPPORTED Rust 2021:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union USB_HUB_30_PORT_REMOTE_WAKE_MASK {
//     pub AsUchar8: u8,
//     pub Anonymous: USB_HUB_30_PORT_REMOTE_WAKE_MASK_0,
// }

// UNSUPPORTED Rust 2027:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_HUB_30_PORT_REMOTE_WAKE_MASK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_HUB_30_PORT_REMOTE_WAKE_MASK_0` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_HUB_CAPABILITIES` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_HUB_CAPABILITIES_EX` (
    public var `CapabilityFlags`: `USB_HUB_CAP_FLAGS`,
)
// UNSUPPORTED Rust 2047:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_HUB_CAPABILITIES_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2052:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_HUB_CAP_FLAGS {
//     pub ul: u32,
//     pub Anonymous: USB_HUB_CAP_FLAGS_0,
// }

// UNSUPPORTED Rust 2058:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_HUB_CAP_FLAGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_HUB_CAP_FLAGS_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 2068:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_HUB_CHANGE {
//     pub AsUshort16: u16,
//     pub Anonymous: USB_HUB_CHANGE_0,
// }

// UNSUPPORTED Rust 2074:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_HUB_CHANGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_HUB_CHANGE_0` (
    public var `_bitfield`: UShort,
)
public const val `USB_HUB_CYCLE_PORT`: UInt = 273u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_HUB_DESCRIPTOR` (
    public var `bDescriptorLength`: UByte,
    public var `bDescriptorType`: UByte,
    public var `bNumberOfPorts`: UByte,
    public var `wHubCharacteristics`: UShort,
    public var `bPowerOnToPowerGood`: UByte,
    public var `bHubControlCurrent`: UByte,
    public var `bRemoveAndPowerMask`: UByteArray,
)
// UNSUPPORTED Rust 2096:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_HUB_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_HUB_DEVICE_INFO` (
    public var `HubDescriptor`: `USB_HUB_DESCRIPTOR`,
    public var `HubNumber`: UInt,
    public var `DeviceAddress`: UShort,
    public var `HubIsSelfPowered`: Boolean,
    public var `HubIsRootHub`: Boolean,
    public var `HubCapabilities`: `USB_HUB_CAPABILITIES`,
    public var `NumberOfHubPorts`: UInt,
    public var `PortInfo`: Array<`USB_HUB_PORT_INFORMATION`>,
)
// UNSUPPORTED Rust 2113:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_HUB_DEVICE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 5 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_HUB_DEVICE_UXD_SETTINGS` (
    public var `Version`: UInt,
    public var `PnpGuid`: `windows_sys`.`core`.`GUID`,
    public var `OwnerGuid`: `windows_sys`.`core`.`GUID`,
    public var `DeleteOnShutdown`: UInt,
    public var `DeleteOnReload`: UInt,
    public var `DeleteOnDisconnect`: UInt,
    public var `Reserved`: UIntArray,
)
// UNSUPPORTED Rust 2129:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_HUB_DEVICE_UXD_SETTINGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_HUB_INFORMATION` (
    public var `HubDescriptor`: `USB_HUB_DESCRIPTOR`,
    public var `HubIsBusPowered`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_HUB_INFORMATION_EX` (
    public var `HubType`: `USB_HUB_TYPE`,
    public var `HighestPortNumber`: UShort,
    public var `u`: `USB_HUB_INFORMATION_EX_0`,
)
// UNSUPPORTED Rust 2147:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_HUB_INFORMATION_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2152:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union USB_HUB_INFORMATION_EX_0 {
//     pub UsbHubDescriptor: USB_HUB_DESCRIPTOR,
//     pub Usb30HubDescriptor: USB_30_HUB_DESCRIPTOR,
// }

// UNSUPPORTED Rust 2158:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_HUB_INFORMATION_EX_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_HUB_NAME` (
    public var `ActualLength`: UInt,
    public var `HubName`: UShortArray,
)
// UNSUPPORTED Rust 2169:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_HUB_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `USB_HUB_NODE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_HUB_PORT_INFORMATION` (
    public var `DeviceState`: `USB_DEVICE_STATE`,
    public var `PortNumber`: UShort,
    public var `DeviceAddress`: UShort,
    public var `ConnectionIndex`: UInt,
    public var `ConnectionStatus`: `USB_CONNECTION_STATUS`,
)
// UNSUPPORTED Rust 2184:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_HUB_STATUS {
//     pub AsUshort16: u16,
//     pub Anonymous: USB_HUB_STATUS_0,
// }

// UNSUPPORTED Rust 2190:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_HUB_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_HUB_STATUS_0` (
    public var `_bitfield`: UShort,
)
// UNSUPPORTED Rust 2200:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_HUB_STATUS_AND_CHANGE {
//     pub AsUlong32: u32,
//     pub Anonymous: USB_HUB_STATUS_AND_CHANGE_0,
// }

// UNSUPPORTED Rust 2206:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_HUB_STATUS_AND_CHANGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_HUB_STATUS_AND_CHANGE_0` (
    public var `HubStatus`: `USB_HUB_STATUS`,
    public var `HubChange`: `USB_HUB_CHANGE`,
)
// UNSUPPORTED Rust 2217:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_HUB_STATUS_AND_CHANGE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `USB_HUB_TYPE` = Int;
public const val `USB_HcGeneric`: `USB_CONTROLLER_FLAVOR` = 0;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `USB_IDLE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_IDLE_CALLBACK_INFO` (
    public var `IdleCallback`: `USB_IDLE_CALLBACK`,
    public var `IdleContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 2231:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_IDLE_CALLBACK_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `USB_IDLE_NOTIFICATION`: UInt = 9u;
public const val `USB_IDLE_NOTIFICATION_EX`: UInt = 272u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_ID_STRING` (
    public var `LanguageId`: UShort,
    public var `Pad`: UShort,
    public var `LengthInBytes`: UInt,
    public var `Buffer`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 2246:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_ID_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_INTERFACE_ASSOCIATION_DESCRIPTOR` (
    public var `bLength`: UByte,
    public var `bDescriptorType`: UByte,
    public var `bFirstInterface`: UByte,
    public var `bInterfaceCount`: UByte,
    public var `bFunctionClass`: UByte,
    public var `bFunctionSubClass`: UByte,
    public var `bFunctionProtocol`: UByte,
    public var `iFunction`: UByte,
)
public const val `USB_INTERFACE_ASSOCIATION_DESCRIPTOR_TYPE`: UInt = 11u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_INTERFACE_DESCRIPTOR` (
    public var `bLength`: UByte,
    public var `bDescriptorType`: UByte,
    public var `bInterfaceNumber`: UByte,
    public var `bAlternateSetting`: UByte,
    public var `bNumEndpoints`: UByte,
    public var `bInterfaceClass`: UByte,
    public var `bInterfaceSubClass`: UByte,
    public var `bInterfaceProtocol`: UByte,
    public var `iInterface`: UByte,
)
public const val `USB_INTERFACE_DESCRIPTOR_TYPE`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_INTERFACE_POWER_DESCRIPTOR` (
    public var `bLength`: UByte,
    public var `bDescriptorType`: UByte,
    public var `bmCapabilitiesFlags`: UByte,
    public var `bBusPowerSavingD1`: UByte,
    public var `bSelfPowerSavingD1`: UByte,
    public var `bBusPowerSavingD2`: UByte,
    public var `bSelfPowerSavingD2`: UByte,
    public var `bBusPowerSavingD3`: UByte,
    public var `bSelfPowerSavingD3`: UByte,
    public var `TransitionTimeFromD1`: UShort,
    public var `TransitionTimeFromD2`: UShort,
    public var `TransitionTimeFromD3`: UShort,
)
public const val `USB_INTERFACE_POWER_DESCRIPTOR_TYPE`: UInt = 8u;
// UNSUPPORTED Rust 2295:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_INTERFACE_STATUS {
//     pub AsUshort16: u16,
//     pub Anonymous: USB_INTERFACE_STATUS_0,
// }

// UNSUPPORTED Rust 2301:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_INTERFACE_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_INTERFACE_STATUS_0` (
    public var `_bitfield`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_MI_PARENT_INFORMATION` (
    public var `NumberOfInterfaces`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_NODE_CONNECTION_ATTRIBUTES` (
    public var `ConnectionIndex`: UInt,
    public var `ConnectionStatus`: `USB_CONNECTION_STATUS`,
    public var `PortAttributes`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_NODE_CONNECTION_DRIVERKEY_NAME` (
    public var `ConnectionIndex`: UInt,
    public var `ActualLength`: UInt,
    public var `DriverKeyName`: UShortArray,
)
// UNSUPPORTED Rust 2330:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_NODE_CONNECTION_DRIVERKEY_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_NODE_CONNECTION_INFORMATION` (
    public var `ConnectionIndex`: UInt,
    public var `DeviceDescriptor`: `USB_DEVICE_DESCRIPTOR`,
    public var `CurrentConfigurationValue`: UByte,
    public var `LowSpeed`: Boolean,
    public var `DeviceIsHub`: Boolean,
    public var `DeviceAddress`: UShort,
    public var `NumberOfOpenPipes`: UInt,
    public var `ConnectionStatus`: `USB_CONNECTION_STATUS`,
    public var `PipeList`: Array<`USB_PIPE_INFO`>,
)
// UNSUPPORTED Rust 2348:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_NODE_CONNECTION_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_NODE_CONNECTION_INFORMATION_EX` (
    public var `ConnectionIndex`: UInt,
    public var `DeviceDescriptor`: `USB_DEVICE_DESCRIPTOR`,
    public var `CurrentConfigurationValue`: UByte,
    public var `Speed`: UByte,
    public var `DeviceIsHub`: Boolean,
    public var `DeviceAddress`: UShort,
    public var `NumberOfOpenPipes`: UInt,
    public var `ConnectionStatus`: `USB_CONNECTION_STATUS`,
    public var `PipeList`: Array<`USB_PIPE_INFO`>,
)
// UNSUPPORTED Rust 2366:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_NODE_CONNECTION_INFORMATION_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_NODE_CONNECTION_INFORMATION_EX_V2` (
    public var `ConnectionIndex`: UInt,
    public var `Length`: UInt,
    public var `SupportedUsbProtocols`: `USB_PROTOCOLS`,
    public var `Flags`: `USB_NODE_CONNECTION_INFORMATION_EX_V2_FLAGS`,
)
// UNSUPPORTED Rust 2379:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_NODE_CONNECTION_INFORMATION_EX_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2384:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_NODE_CONNECTION_INFORMATION_EX_V2_FLAGS {
//     pub ul: u32,
//     pub Anonymous: USB_NODE_CONNECTION_INFORMATION_EX_V2_FLAGS_0,
// }

// UNSUPPORTED Rust 2390:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_NODE_CONNECTION_INFORMATION_EX_V2_FLAGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_NODE_CONNECTION_INFORMATION_EX_V2_FLAGS_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_NODE_CONNECTION_NAME` (
    public var `ConnectionIndex`: UInt,
    public var `ActualLength`: UInt,
    public var `NodeName`: UShortArray,
)
// UNSUPPORTED Rust 2407:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_NODE_CONNECTION_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_NODE_INFORMATION` (
    public var `NodeType`: `USB_HUB_NODE`,
    public var `u`: `USB_NODE_INFORMATION_0`,
)
// UNSUPPORTED Rust 2418:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_NODE_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2423:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union USB_NODE_INFORMATION_0 {
//     pub HubInformation: USB_HUB_INFORMATION,
//     pub MiParentInformation: USB_MI_PARENT_INFORMATION,
// }

// UNSUPPORTED Rust 2429:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_NODE_INFORMATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_NOTIFICATION` (
    public var `NotificationType`: `USB_NOTIFICATION_TYPE`,
)
public typealias `USB_NOTIFICATION_TYPE` = Int;
public const val `USB_NOTIFY_ON_TRANSPORT_CHARACTERISTICS_CHANGE`: UInt = 283u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_OPEN_RAW_DEVICE_PARAMETERS` (
    public var `PortStatus`: UShort,
    public var `MaxPacketEp0`: UShort,
)
public const val `USB_OTG_DESCRIPTOR_TYPE`: UInt = 9u;
public const val `USB_OTHER_SPEED_CONFIGURATION_DESCRIPTOR_TYPE`: UInt = 7u;
public const val `USB_PACKETFLAG_ASYNC_IN`: UInt = 8u;
public const val `USB_PACKETFLAG_ASYNC_OUT`: UInt = 16u;
public const val `USB_PACKETFLAG_FULL_SPEED`: UInt = 2u;
public const val `USB_PACKETFLAG_HIGH_SPEED`: UInt = 4u;
public const val `USB_PACKETFLAG_ISO_IN`: UInt = 32u;
public const val `USB_PACKETFLAG_ISO_OUT`: UInt = 64u;
public const val `USB_PACKETFLAG_LOW_SPEED`: UInt = 1u;
public const val `USB_PACKETFLAG_SETUP`: UInt = 128u;
public const val `USB_PACKETFLAG_TOGGLE0`: UInt = 256u;
public const val `USB_PACKETFLAG_TOGGLE1`: UInt = 512u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_PASS_THRU_PARAMETERS` (
    public var `FunctionGUID`: `windows_sys`.`core`.`GUID`,
    public var `ParameterLength`: UInt,
    public var `Parameters`: UByteArray,
)
// UNSUPPORTED Rust 2466:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_PASS_THRU_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_PIPE_INFO` (
    public var `EndpointDescriptor`: `USB_ENDPOINT_DESCRIPTOR`,
    public var `ScheduleOffset`: UInt,
)
public const val `USB_PORTATTR_MINI_CONNECTOR`: UInt = 4u;
public const val `USB_PORTATTR_NO_CONNECTOR`: UInt = 1u;
public const val `USB_PORTATTR_NO_OVERCURRENT_UI`: UInt = 33554432u;
public const val `USB_PORTATTR_OEM_CONNECTOR`: UInt = 8u;
public const val `USB_PORTATTR_OWNED_BY_CC`: UInt = 16777216u;
public const val `USB_PORTATTR_SHARED_USB2`: UInt = 2u;
// UNSUPPORTED Rust 2483:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_PORT_CHANGE {
//     pub AsUshort16: u16,
//     pub Usb20PortChange: USB_20_PORT_CHANGE,
//     pub Usb30PortChange: USB_30_PORT_CHANGE,
// }

// UNSUPPORTED Rust 2490:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_PORT_CHANGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_PORT_CONNECTOR_PROPERTIES` (
    public var `ConnectionIndex`: UInt,
    public var `ActualLength`: UInt,
    public var `UsbPortProperties`: `USB_PORT_PROPERTIES`,
    public var `CompanionIndex`: UShort,
    public var `CompanionPortNumber`: UShort,
    public var `CompanionHubSymbolicLinkName`: UShortArray,
)
// UNSUPPORTED Rust 2505:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_PORT_CONNECTOR_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2510:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_PORT_EXT_STATUS {
//     pub AsUlong32: u32,
//     pub Anonymous: USB_PORT_EXT_STATUS_0,
// }

// UNSUPPORTED Rust 2516:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_PORT_EXT_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_PORT_EXT_STATUS_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 2526:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_PORT_EXT_STATUS_AND_CHANGE {
//     pub AsUlong64: u64,
//     pub Anonymous: USB_PORT_EXT_STATUS_AND_CHANGE_0,
// }

// UNSUPPORTED Rust 2532:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_PORT_EXT_STATUS_AND_CHANGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_PORT_EXT_STATUS_AND_CHANGE_0` (
    public var `PortStatusChange`: `USB_PORT_STATUS_AND_CHANGE`,
    public var `PortExtStatus`: `USB_PORT_EXT_STATUS`,
)
// UNSUPPORTED Rust 2543:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_PORT_EXT_STATUS_AND_CHANGE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2548:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_PORT_PROPERTIES {
//     pub ul: u32,
//     pub Anonymous: USB_PORT_PROPERTIES_0,
// }

// UNSUPPORTED Rust 2554:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_PORT_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_PORT_PROPERTIES_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 2564:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_PORT_STATUS {
//     pub AsUshort16: u16,
//     pub Usb20PortStatus: USB_20_PORT_STATUS,
//     pub Usb30PortStatus: USB_30_PORT_STATUS,
// }

// UNSUPPORTED Rust 2571:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_PORT_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2576:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_PORT_STATUS_AND_CHANGE {
//     pub AsUlong32: u32,
//     pub Anonymous: USB_PORT_STATUS_AND_CHANGE_0,
// }

// UNSUPPORTED Rust 2582:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_PORT_STATUS_AND_CHANGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_PORT_STATUS_AND_CHANGE_0` (
    public var `PortStatus`: `USB_PORT_STATUS`,
    public var `PortChange`: `USB_PORT_CHANGE`,
)
// UNSUPPORTED Rust 2593:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_PORT_STATUS_AND_CHANGE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `USB_PORT_STATUS_CONNECT`: UInt = 1u;
public const val `USB_PORT_STATUS_ENABLE`: UInt = 2u;
public const val `USB_PORT_STATUS_HIGH_SPEED`: UInt = 1024u;
public const val `USB_PORT_STATUS_LOW_SPEED`: UInt = 512u;
public const val `USB_PORT_STATUS_OVER_CURRENT`: UInt = 8u;
public const val `USB_PORT_STATUS_POWER`: UInt = 256u;
public const val `USB_PORT_STATUS_RESET`: UInt = 16u;
public const val `USB_PORT_STATUS_SUSPEND`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_POWER_INFO` (
    public var `SystemState`: `WDMUSB_POWER_STATE`,
    public var `HcDevicePowerState`: `WDMUSB_POWER_STATE`,
    public var `HcDeviceWake`: `WDMUSB_POWER_STATE`,
    public var `HcSystemWake`: `WDMUSB_POWER_STATE`,
    public var `RhDevicePowerState`: `WDMUSB_POWER_STATE`,
    public var `RhDeviceWake`: `WDMUSB_POWER_STATE`,
    public var `RhSystemWake`: `WDMUSB_POWER_STATE`,
    public var `LastSystemSleepState`: `WDMUSB_POWER_STATE`,
    public var `CanWakeup`: Boolean,
    public var `IsPowered`: Boolean,
)
// UNSUPPORTED Rust 2620:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_PROTOCOLS {
//     pub ul: u32,
//     pub Anonymous: USB_PROTOCOLS_0,
// }

// UNSUPPORTED Rust 2626:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_PROTOCOLS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_PROTOCOLS_0` (
    public var `_bitfield`: UInt,
)
public const val `USB_RECORD_FAILURE`: UInt = 10u;
public const val `USB_REGISTER_COMPOSITE_DEVICE`: UInt = 0u;
public const val `USB_REGISTER_FOR_TRANSPORT_BANDWIDTH_CHANGE`: UInt = 2u;
public const val `USB_REGISTER_FOR_TRANSPORT_CHARACTERISTICS_CHANGE`: UInt = 282u;
public const val `USB_REGISTER_FOR_TRANSPORT_LATENCY_CHANGE`: UInt = 1u;
public const val `USB_REQUEST_CLEAR_FEATURE`: UInt = 1u;
public const val `USB_REQUEST_CLEAR_TT_BUFFER`: UInt = 8u;
public const val `USB_REQUEST_GET_CONFIGURATION`: UInt = 8u;
public const val `USB_REQUEST_GET_DESCRIPTOR`: UInt = 6u;
public const val `USB_REQUEST_GET_FIRMWARE_STATUS`: UInt = 26u;
public const val `USB_REQUEST_GET_INTERFACE`: UInt = 10u;
public const val `USB_REQUEST_GET_PORT_ERR_COUNT`: UInt = 13u;
public const val `USB_REQUEST_GET_STATE`: UInt = 2u;
public const val `USB_REQUEST_GET_STATUS`: UInt = 0u;
public const val `USB_REQUEST_GET_TT_STATE`: UInt = 10u;
public const val `USB_REQUEST_ISOCH_DELAY`: UInt = 49u;
public const val `USB_REQUEST_REMOTE_WAKE_NOTIFICATION`: UInt = 2u;
public const val `USB_REQUEST_RESET_TT`: UInt = 9u;
public const val `USB_REQUEST_SET_ADDRESS`: UInt = 5u;
public const val `USB_REQUEST_SET_CONFIGURATION`: UInt = 9u;
public const val `USB_REQUEST_SET_DESCRIPTOR`: UInt = 7u;
public const val `USB_REQUEST_SET_FEATURE`: UInt = 3u;
public const val `USB_REQUEST_SET_FIRMWARE_STATUS`: UInt = 27u;
public const val `USB_REQUEST_SET_HUB_DEPTH`: UInt = 12u;
public const val `USB_REQUEST_SET_INTERFACE`: UInt = 11u;
public const val `USB_REQUEST_SET_SEL`: UInt = 48u;
public const val `USB_REQUEST_STOP_TT`: UInt = 11u;
public const val `USB_REQUEST_SYNC_FRAME`: UInt = 12u;
public const val `USB_REQ_GLOBAL_RESUME`: UInt = 274u;
public const val `USB_REQ_GLOBAL_SUSPEND`: UInt = 273u;
public const val `USB_RESERVED_DESCRIPTOR_TYPE`: UInt = 6u;
public const val `USB_RESERVED_USER_BASE`: UInt = 1024u;
public const val `USB_RESET_HUB`: UInt = 275u;
public const val `USB_RESET_PORT`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_ROOT_HUB_NAME` (
    public var `ActualLength`: UInt,
    public var `RootHubName`: UShortArray,
)
// UNSUPPORTED Rust 2676:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_ROOT_HUB_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_SEND_RAW_COMMAND_PARAMETERS` (
    public var `Usb_bmRequest`: UByte,
    public var `Usb_bRequest`: UByte,
    public var `Usb_wVlaue`: UShort,
    public var `Usb_wIndex`: UShort,
    public var `Usb_wLength`: UShort,
    public var `DeviceAddress`: UShort,
    public var `MaximumPacketSize`: UShort,
    public var `Timeout`: UInt,
    public var `DataLength`: UInt,
    public var `UsbdStatusCode`: Int,
    public var `Data`: UByteArray,
)
// UNSUPPORTED Rust 2696:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_SEND_RAW_COMMAND_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `USB_START_TRACKING_FOR_TIME_SYNC`: UInt = 285u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_START_TRACKING_FOR_TIME_SYNC_INFORMATION` (
    public var `TimeTrackingHandle`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `IsStartupDelayTolerable`: Boolean,
)
// UNSUPPORTED Rust 2708:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_START_TRACKING_FOR_TIME_SYNC_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `USB_STATUS_EXT_PORT_STATUS`: UInt = 2u;
public const val `USB_STATUS_PD_STATUS`: UInt = 1u;
public const val `USB_STATUS_PORT_STATUS`: UInt = 0u;
public const val `USB_STOP_TRACKING_FOR_TIME_SYNC`: UInt = 287u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_STOP_TRACKING_FOR_TIME_SYNC_INFORMATION` (
    public var `TimeTrackingHandle`: `super`.`super`.`Foundation`.`HANDLE`,
)
// UNSUPPORTED Rust 2722:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_STOP_TRACKING_FOR_TIME_SYNC_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_STRING_DESCRIPTOR` (
    public var `bLength`: UByte,
    public var `bDescriptorType`: UByte,
    public var `bString`: UShortArray,
)
// UNSUPPORTED Rust 2734:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_STRING_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `USB_STRING_DESCRIPTOR_TYPE`: UInt = 3u;
public const val `USB_SUBMIT_URB`: UInt = 0u;
public const val `USB_SUPERSPEEDPLUS_ISOCHRONOUS_MAX_BYTESPERINTERVAL`: UInt = 16777215u;
public const val `USB_SUPERSPEEDPLUS_ISOCHRONOUS_MIN_BYTESPERINTERVAL`: UInt = 49153u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_SUPERSPEEDPLUS_ISOCH_ENDPOINT_COMPANION_DESCRIPTOR` (
    public var `bLength`: UByte,
    public var `bDescriptorType`: UByte,
    public var `wReserved`: UShort,
    public var `dwBytesPerInterval`: UInt,
)
public const val `USB_SUPERSPEEDPLUS_ISOCH_ENDPOINT_COMPANION_DESCRIPTOR_TYPE`: UInt = 49u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_SUPERSPEED_ENDPOINT_COMPANION_DESCRIPTOR` (
    public var `bLength`: UByte,
    public var `bDescriptorType`: UByte,
    public var `bMaxBurst`: UByte,
    public var `bmAttributes`: `USB_SUPERSPEED_ENDPOINT_COMPANION_DESCRIPTOR_0`,
    public var `wBytesPerInterval`: UShort,
)
// UNSUPPORTED Rust 2761:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_SUPERSPEED_ENDPOINT_COMPANION_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2766:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union USB_SUPERSPEED_ENDPOINT_COMPANION_DESCRIPTOR_0 {
//     pub AsUchar: u8,
//     pub Bulk: USB_SUPERSPEED_ENDPOINT_COMPANION_DESCRIPTOR_0_0,
//     pub Isochronous: USB_SUPERSPEED_ENDPOINT_COMPANION_DESCRIPTOR_0_1,
// }

// UNSUPPORTED Rust 2773:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_SUPERSPEED_ENDPOINT_COMPANION_DESCRIPTOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_SUPERSPEED_ENDPOINT_COMPANION_DESCRIPTOR_0_0` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_SUPERSPEED_ENDPOINT_COMPANION_DESCRIPTOR_0_1` (
    public var `_bitfield`: UByte,
)
public const val `USB_SUPERSPEED_ENDPOINT_COMPANION_DESCRIPTOR_TYPE`: UInt = 48u;
public const val `USB_SUPERSPEED_ISOCHRONOUS_MAX_MULTIPLIER`: UInt = 2u;
public const val `USB_SUPPORT_D0_COMMAND`: UInt = 1u;
public const val `USB_SUPPORT_D1_COMMAND`: UInt = 2u;
public const val `USB_SUPPORT_D1_WAKEUP`: UInt = 16u;
public const val `USB_SUPPORT_D2_COMMAND`: UInt = 4u;
public const val `USB_SUPPORT_D2_WAKEUP`: UInt = 32u;
public const val `USB_SUPPORT_D3_COMMAND`: UInt = 8u;
public const val `USB_TEST_MODE_TEST_FORCE_ENABLE`: UInt = 5u;
public const val `USB_TEST_MODE_TEST_J`: UInt = 1u;
public const val `USB_TEST_MODE_TEST_K`: UInt = 2u;
public const val `USB_TEST_MODE_TEST_PACKET`: UInt = 4u;
public const val `USB_TEST_MODE_TEST_SE0_NAK`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 5 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_TOPOLOGY_ADDRESS` (
    public var `PciBusNumber`: UInt,
    public var `PciDeviceNumber`: UInt,
    public var `PciFunctionNumber`: UInt,
    public var `Reserved`: UInt,
    public var `RootHubPortNumber`: UShort,
    public var `HubPortNumber`: UShortArray,
    public var `Reserved2`: UShort,
)
// UNSUPPORTED Rust 2812:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_TOPOLOGY_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_TRANSPORT_CHARACTERISTICS` (
    public var `Version`: UInt,
    public var `TransportCharacteristicsFlags`: UInt,
    public var `CurrentRoundtripLatencyInMilliSeconds`: ULong,
    public var `MaxPotentialBandwidth`: ULong,
)
public const val `USB_TRANSPORT_CHARACTERISTICS_BANDWIDTH_AVAILABLE`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_TRANSPORT_CHARACTERISTICS_CHANGE_NOTIFICATION` (
    public var `Handle`: `USB_CHANGE_REGISTRATION_HANDLE`,
    public var `UsbTransportCharacteristics`: `USB_TRANSPORT_CHARACTERISTICS`,
)
// UNSUPPORTED Rust 2832:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_TRANSPORT_CHARACTERISTICS_CHANGE_NOTIFICATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_TRANSPORT_CHARACTERISTICS_CHANGE_REGISTRATION` (
    public var `ChangeNotificationInputFlags`: UInt,
    public var `Handle`: `USB_CHANGE_REGISTRATION_HANDLE`,
    public var `UsbTransportCharacteristics`: `USB_TRANSPORT_CHARACTERISTICS`,
)
// UNSUPPORTED Rust 2844:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_TRANSPORT_CHARACTERISTICS_CHANGE_REGISTRATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_TRANSPORT_CHARACTERISTICS_CHANGE_UNREGISTRATION` (
    public var `Handle`: `USB_CHANGE_REGISTRATION_HANDLE`,
)
// UNSUPPORTED Rust 2854:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_TRANSPORT_CHARACTERISTICS_CHANGE_UNREGISTRATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `USB_TRANSPORT_CHARACTERISTICS_LATENCY_AVAILABLE`: UInt = 1u;
public const val `USB_TRANSPORT_CHARACTERISTICS_VERSION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USB_UNICODE_NAME` (
    public var `Length`: UInt,
    public var `String`: UShortArray,
)
// UNSUPPORTED Rust 2867:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USB_UNICODE_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `USB_UNREGISTER_COMPOSITE_DEVICE`: UInt = 1u;
public const val `USB_UNREGISTER_FOR_TRANSPORT_CHARACTERISTICS_CHANGE`: UInt = 284u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USB_USB2HW_VERSION_PARAMETERS` (
    public var `Usb2HwRevision`: UByte,
)
public typealias `USB_USER_ERROR_CODE` = Int;
public typealias `USB_WMI_DEVICE_NODE_TYPE` = Int;
public const val `Usb11Device`: `USB_DEVICE_TYPE` = 0;
public const val `Usb20Device`: `USB_DEVICE_TYPE` = 1;
public const val `Usb20Hub`: `USB_HUB_TYPE` = 2;
public const val `Usb30Hub`: `USB_HUB_TYPE` = 3;
public const val `UsbController`: `USB_WMI_DEVICE_NODE_TYPE` = 3;
public const val `UsbDevice`: `USB_WMI_DEVICE_NODE_TYPE` = 0;
public const val `UsbFullSpeed`: `USB_DEVICE_SPEED` = 1;
public const val `UsbHighSpeed`: `USB_DEVICE_SPEED` = 2;
public const val `UsbHub`: `USB_HUB_NODE` = 0;
public const val `UsbLowSpeed`: `USB_DEVICE_SPEED` = 0;
public const val `UsbMIParent`: `USB_HUB_NODE` = 1;
public const val `UsbRootHub`: `USB_HUB_TYPE` = 1;
public const val `UsbSuperSpeed`: `USB_DEVICE_SPEED` = 3;
public const val `UsbUserBufferTooSmall`: `USB_USER_ERROR_CODE` = 7;
public const val `UsbUserDeviceNotStarted`: `USB_USER_ERROR_CODE` = 9;
public const val `UsbUserErrorNotMapped`: `USB_USER_ERROR_CODE` = 8;
public const val `UsbUserFeatureDisabled`: `USB_USER_ERROR_CODE` = 3;
public const val `UsbUserInvalidHeaderParameter`: `USB_USER_ERROR_CODE` = 4;
public const val `UsbUserInvalidParameter`: `USB_USER_ERROR_CODE` = 5;
public const val `UsbUserInvalidRequestCode`: `USB_USER_ERROR_CODE` = 2;
public const val `UsbUserMiniportError`: `USB_USER_ERROR_CODE` = 6;
public const val `UsbUserNoDeviceConnected`: `USB_USER_ERROR_CODE` = 10;
public const val `UsbUserNotSupported`: `USB_USER_ERROR_CODE` = 1;
public const val `UsbUserSuccess`: `USB_USER_ERROR_CODE` = 0;
public const val `UsbdEndpointOffloadHardwareAssisted`: `USBD_ENDPOINT_OFFLOAD_MODE` = 2;
public const val `UsbdEndpointOffloadModeNotSupported`: `USBD_ENDPOINT_OFFLOAD_MODE` = 0;
public const val `UsbdEndpointOffloadSoftwareAssisted`: `USBD_ENDPOINT_OFFLOAD_MODE` = 1;
public const val `UsbdPipeTypeBulk`: `USBD_PIPE_TYPE` = 2;
public const val `UsbdPipeTypeControl`: `USBD_PIPE_TYPE` = 0;
public const val `UsbdPipeTypeInterrupt`: `USBD_PIPE_TYPE` = 3;
public const val `UsbdPipeTypeIsochronous`: `USBD_PIPE_TYPE` = 1;
public const val `UsbfnBusSpeedFull`: `USBFN_BUS_SPEED` = 1;
public const val `UsbfnBusSpeedHigh`: `USBFN_BUS_SPEED` = 2;
public const val `UsbfnBusSpeedLow`: `USBFN_BUS_SPEED` = 0;
public const val `UsbfnBusSpeedMaximum`: `USBFN_BUS_SPEED` = 4;
public const val `UsbfnBusSpeedSuper`: `USBFN_BUS_SPEED` = 3;
public const val `UsbfnChargingDownstreamPort`: `USBFN_PORT_TYPE` = 2;
public const val `UsbfnDedicatedChargingPort`: `USBFN_PORT_TYPE` = 3;
public const val `UsbfnDeviceStateAddressed`: `USBFN_DEVICE_STATE` = 4;
public const val `UsbfnDeviceStateAttached`: `USBFN_DEVICE_STATE` = 1;
public const val `UsbfnDeviceStateConfigured`: `USBFN_DEVICE_STATE` = 5;
public const val `UsbfnDeviceStateDefault`: `USBFN_DEVICE_STATE` = 2;
public const val `UsbfnDeviceStateDetached`: `USBFN_DEVICE_STATE` = 3;
public const val `UsbfnDeviceStateMinimum`: `USBFN_DEVICE_STATE` = 0;
public const val `UsbfnDeviceStateStateMaximum`: `USBFN_DEVICE_STATE` = 7;
public const val `UsbfnDeviceStateSuspended`: `USBFN_DEVICE_STATE` = 6;
public const val `UsbfnDirectionIn`: `USBFN_DIRECTION` = 1;
public const val `UsbfnDirectionMaximum`: `USBFN_DIRECTION` = 3;
public const val `UsbfnDirectionMinimum`: `USBFN_DIRECTION` = 0;
public const val `UsbfnDirectionOut`: `USBFN_DIRECTION` = 2;
public const val `UsbfnDirectionRx`: `USBFN_DIRECTION` = 2;
public const val `UsbfnDirectionTx`: `USBFN_DIRECTION` = 1;
public const val `UsbfnEventAttach`: `USBFN_EVENT` = 1;
public const val `UsbfnEventBusTearDown`: `USBFN_EVENT` = 10;
public const val `UsbfnEventConfigured`: `USBFN_EVENT` = 7;
public const val `UsbfnEventDetach`: `USBFN_EVENT` = 3;
public const val `UsbfnEventMaximum`: `USBFN_EVENT` = 12;
public const val `UsbfnEventMinimum`: `USBFN_EVENT` = 0;
public const val `UsbfnEventPortType`: `USBFN_EVENT` = 9;
public const val `UsbfnEventReset`: `USBFN_EVENT` = 2;
public const val `UsbfnEventResume`: `USBFN_EVENT` = 5;
public const val `UsbfnEventSetInterface`: `USBFN_EVENT` = 11;
public const val `UsbfnEventSetupPacket`: `USBFN_EVENT` = 6;
public const val `UsbfnEventSuspend`: `USBFN_EVENT` = 4;
public const val `UsbfnEventUnConfigured`: `USBFN_EVENT` = 8;
public const val `UsbfnInvalidDedicatedChargingPort`: `USBFN_PORT_TYPE` = 4;
public const val `UsbfnPortTypeMaximum`: `USBFN_PORT_TYPE` = 6;
public const val `UsbfnProprietaryDedicatedChargingPort`: `USBFN_PORT_TYPE` = 5;
public const val `UsbfnStandardDownstreamPort`: `USBFN_PORT_TYPE` = 1;
public const val `UsbfnUnknownPort`: `USBFN_PORT_TYPE` = 0;
public typealias `WDMUSB_POWER_STATE` = Int;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WINUSB_INTERFACE_HANDLE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINUSB_PIPE_INFORMATION` (
    public var `PipeType`: `USBD_PIPE_TYPE`,
    public var `PipeId`: UByte,
    public var `MaximumPacketSize`: UShort,
    public var `Interval`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINUSB_PIPE_INFORMATION_EX` (
    public var `PipeType`: `USBD_PIPE_TYPE`,
    public var `PipeId`: UByte,
    public var `MaximumPacketSize`: UShort,
    public var `Interval`: UByte,
    public var `MaximumBytesPerInterval`: UInt,
)
public typealias `WINUSB_PIPE_POLICY` = UInt;
public typealias `WINUSB_POWER_POLICY` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINUSB_SETUP_PACKET` (
    public var `RequestType`: UByte,
    public var `Request`: UByte,
    public var `Value`: UShort,
    public var `Index`: UShort,
    public var `Length`: UShort,
)
public const val `WMI_USB_DEVICE_NODE_INFORMATION`: UInt = 2u;
public const val `WMI_USB_DRIVER_INFORMATION`: UInt = 0u;
public const val `WMI_USB_DRIVER_NOTIFICATION`: UInt = 1u;
public const val `WMI_USB_HUB_NODE_INFORMATION`: UInt = 4u;
public const val `WMI_USB_PERFORMANCE_INFORMATION`: UInt = 1u;
public const val `WMI_USB_POWER_DEVICE_ENABLE`: UInt = 2u;
public const val `WRITE_DATA_PIPE`: `PIPE_TYPE` = 2;
public const val `WdmUsbPowerDeviceD0`: `WDMUSB_POWER_STATE` = 201;
public const val `WdmUsbPowerDeviceD1`: `WDMUSB_POWER_STATE` = 202;
public const val `WdmUsbPowerDeviceD2`: `WDMUSB_POWER_STATE` = 203;
public const val `WdmUsbPowerDeviceD3`: `WDMUSB_POWER_STATE` = 204;
public const val `WdmUsbPowerDeviceUnspecified`: `WDMUSB_POWER_STATE` = 200;
public const val `WdmUsbPowerNotMapped`: `WDMUSB_POWER_STATE` = 0;
public const val `WdmUsbPowerSystemHibernate`: `WDMUSB_POWER_STATE` = 105;
public const val `WdmUsbPowerSystemShutdown`: `WDMUSB_POWER_STATE` = 106;
public const val `WdmUsbPowerSystemSleeping1`: `WDMUSB_POWER_STATE` = 102;
public const val `WdmUsbPowerSystemSleeping2`: `WDMUSB_POWER_STATE` = 103;
public const val `WdmUsbPowerSystemSleeping3`: `WDMUSB_POWER_STATE` = 104;
public const val `WdmUsbPowerSystemUnspecified`: `WDMUSB_POWER_STATE` = 100;
public const val `WdmUsbPowerSystemWorking`: `WDMUSB_POWER_STATE` = 101;
// UNSUPPORTED Rust 3001:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WinUSB_TestGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xda812bff_12c3_46a2_8e2b_dbd3b7834c43);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `_URB_BULK_OR_INTERRUPT_TRANSFER` (
    public var `Hdr`: `_URB_HEADER`,
    public var `PipeHandle`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `TransferFlags`: UInt,
    public var `TransferBufferLength`: UInt,
    public var `TransferBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `TransferBufferMDL`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `UrbLink`: /* Rust *mut */ kotlinx.cinterop.CPointer<`URB`>?,
    public var `hca`: `_URB_HCD_AREA`,
)
// UNSUPPORTED Rust 3014:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for _URB_BULK_OR_INTERRUPT_TRANSFER {
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
public class `_URB_CONTROL_DESCRIPTOR_REQUEST` (
    public var `Hdr`: `_URB_HEADER`,
    public var `Reserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Reserved0`: UInt,
    public var `TransferBufferLength`: UInt,
    public var `TransferBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `TransferBufferMDL`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `UrbLink`: /* Rust *mut */ kotlinx.cinterop.CPointer<`URB`>?,
    public var `hca`: `_URB_HCD_AREA`,
    public var `Reserved1`: UShort,
    public var `Index`: UByte,
    public var `DescriptorType`: UByte,
    public var `LanguageId`: UShort,
    public var `Reserved2`: UShort,
)
// UNSUPPORTED Rust 3036:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for _URB_CONTROL_DESCRIPTOR_REQUEST {
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
public class `_URB_CONTROL_FEATURE_REQUEST` (
    public var `Hdr`: `_URB_HEADER`,
    public var `Reserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Reserved2`: UInt,
    public var `Reserved3`: UInt,
    public var `Reserved4`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Reserved5`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `UrbLink`: /* Rust *mut */ kotlinx.cinterop.CPointer<`URB`>?,
    public var `hca`: `_URB_HCD_AREA`,
    public var `Reserved0`: UShort,
    public var `FeatureSelector`: UShort,
    public var `Index`: UShort,
    public var `Reserved1`: UShort,
)
// UNSUPPORTED Rust 3057:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for _URB_CONTROL_FEATURE_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `_URB_CONTROL_GET_CONFIGURATION_REQUEST` (
    public var `Hdr`: `_URB_HEADER`,
    public var `Reserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Reserved0`: UInt,
    public var `TransferBufferLength`: UInt,
    public var `TransferBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `TransferBufferMDL`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `UrbLink`: /* Rust *mut */ kotlinx.cinterop.CPointer<`URB`>?,
    public var `hca`: `_URB_HCD_AREA`,
    public var `Reserved1`: UByteArray,
)
// UNSUPPORTED Rust 3075:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for _URB_CONTROL_GET_CONFIGURATION_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `_URB_CONTROL_GET_INTERFACE_REQUEST` (
    public var `Hdr`: `_URB_HEADER`,
    public var `Reserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Reserved0`: UInt,
    public var `TransferBufferLength`: UInt,
    public var `TransferBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `TransferBufferMDL`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `UrbLink`: /* Rust *mut */ kotlinx.cinterop.CPointer<`URB`>?,
    public var `hca`: `_URB_HCD_AREA`,
    public var `Reserved1`: UByteArray,
    public var `Interface`: UShort,
    public var `Reserved2`: UShort,
)
// UNSUPPORTED Rust 3095:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for _URB_CONTROL_GET_INTERFACE_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `_URB_CONTROL_GET_STATUS_REQUEST` (
    public var `Hdr`: `_URB_HEADER`,
    public var `Reserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Reserved0`: UInt,
    public var `TransferBufferLength`: UInt,
    public var `TransferBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `TransferBufferMDL`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `UrbLink`: /* Rust *mut */ kotlinx.cinterop.CPointer<`URB`>?,
    public var `hca`: `_URB_HCD_AREA`,
    public var `Reserved1`: UByteArray,
    public var `Index`: UShort,
    public var `Reserved2`: UShort,
)
// UNSUPPORTED Rust 3115:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for _URB_CONTROL_GET_STATUS_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `_URB_CONTROL_TRANSFER` (
    public var `Hdr`: `_URB_HEADER`,
    public var `PipeHandle`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `TransferFlags`: UInt,
    public var `TransferBufferLength`: UInt,
    public var `TransferBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `TransferBufferMDL`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `UrbLink`: /* Rust *mut */ kotlinx.cinterop.CPointer<`URB`>?,
    public var `hca`: `_URB_HCD_AREA`,
    public var `SetupPacket`: UByteArray,
)
// UNSUPPORTED Rust 3133:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for _URB_CONTROL_TRANSFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `_URB_CONTROL_TRANSFER_EX` (
    public var `Hdr`: `_URB_HEADER`,
    public var `PipeHandle`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `TransferFlags`: UInt,
    public var `TransferBufferLength`: UInt,
    public var `TransferBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `TransferBufferMDL`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Timeout`: UInt,
    public var `hca`: `_URB_HCD_AREA`,
    public var `SetupPacket`: UByteArray,
)
// UNSUPPORTED Rust 3151:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for _URB_CONTROL_TRANSFER_EX {
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
public class `_URB_CONTROL_VENDOR_OR_CLASS_REQUEST` (
    public var `Hdr`: `_URB_HEADER`,
    public var `Reserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `TransferFlags`: UInt,
    public var `TransferBufferLength`: UInt,
    public var `TransferBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `TransferBufferMDL`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `UrbLink`: /* Rust *mut */ kotlinx.cinterop.CPointer<`URB`>?,
    public var `hca`: `_URB_HCD_AREA`,
    public var `RequestTypeReservedBits`: UByte,
    public var `Request`: UByte,
    public var `Value`: UShort,
    public var `Index`: UShort,
    public var `Reserved1`: UShort,
)
// UNSUPPORTED Rust 3173:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for _URB_CONTROL_VENDOR_OR_CLASS_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `_URB_FRAME_LENGTH_CONTROL` (
    public var `Hdr`: `_URB_HEADER`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `_URB_GET_CURRENT_FRAME_NUMBER` (
    public var `Hdr`: `_URB_HEADER`,
    public var `FrameNumber`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `_URB_GET_FRAME_LENGTH` (
    public var `Hdr`: `_URB_HEADER`,
    public var `FrameLength`: UInt,
    public var `FrameNumber`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `_URB_GET_ISOCH_PIPE_TRANSFER_PATH_DELAYS` (
    public var `Hdr`: `_URB_HEADER`,
    public var `PipeHandle`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `MaximumSendPathDelayInMilliSeconds`: UInt,
    public var `MaximumCompletionPathDelayInMilliSeconds`: UInt,
)
// UNSUPPORTED Rust 3204:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for _URB_GET_ISOCH_PIPE_TRANSFER_PATH_DELAYS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `_URB_HCD_AREA` (
    public var `Reserved8`: Array</* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>,
)
// UNSUPPORTED Rust 3214:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for _URB_HCD_AREA {
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
public class `_URB_HEADER` (
    public var `Length`: UShort,
    public var `Function`: UShort,
    public var `Status`: Int,
    public var `UsbdDeviceHandle`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `UsbdFlags`: UInt,
)
// UNSUPPORTED Rust 3228:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for _URB_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `_URB_ISOCH_TRANSFER` (
    public var `Hdr`: `_URB_HEADER`,
    public var `PipeHandle`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `TransferFlags`: UInt,
    public var `TransferBufferLength`: UInt,
    public var `TransferBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `TransferBufferMDL`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `UrbLink`: /* Rust *mut */ kotlinx.cinterop.CPointer<`URB`>?,
    public var `hca`: `_URB_HCD_AREA`,
    public var `StartFrame`: UInt,
    public var `NumberOfPackets`: UInt,
    public var `ErrorCount`: UInt,
    public var `IsoPacket`: Array<`USBD_ISO_PACKET_DESCRIPTOR`>,
)
// UNSUPPORTED Rust 3249:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for _URB_ISOCH_TRANSFER {
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
public class `_URB_OPEN_STATIC_STREAMS` (
    public var `Hdr`: `_URB_HEADER`,
    public var `PipeHandle`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `NumberOfStreams`: UInt,
    public var `StreamInfoVersion`: UShort,
    public var `StreamInfoSize`: UShort,
    public var `Streams`: /* Rust *mut */ kotlinx.cinterop.CPointer<`USBD_STREAM_INFORMATION`>?,
)
// UNSUPPORTED Rust 3264:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for _URB_OPEN_STATIC_STREAMS {
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
public class `_URB_OS_FEATURE_DESCRIPTOR_REQUEST` (
    public var `Hdr`: `_URB_HEADER`,
    public var `Reserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Reserved0`: UInt,
    public var `TransferBufferLength`: UInt,
    public var `TransferBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `TransferBufferMDL`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `UrbLink`: /* Rust *mut */ kotlinx.cinterop.CPointer<`URB`>?,
    public var `hca`: `_URB_HCD_AREA`,
    public var `_bitfield`: UByte,
    public var `Reserved2`: UByte,
    public var `InterfaceNumber`: UByte,
    public var `MS_PageIndex`: UByte,
    public var `MS_FeatureDescriptorIndex`: UShort,
    public var `Reserved3`: UShort,
)
// UNSUPPORTED Rust 3287:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for _URB_OS_FEATURE_DESCRIPTOR_REQUEST {
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
public class `_URB_PIPE_REQUEST` (
    public var `Hdr`: `_URB_HEADER`,
    public var `PipeHandle`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Reserved`: UInt,
)
// UNSUPPORTED Rust 3299:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for _URB_PIPE_REQUEST {
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
public class `_URB_SELECT_CONFIGURATION` (
    public var `Hdr`: `_URB_HEADER`,
    public var `ConfigurationDescriptor`: /* Rust *mut */ kotlinx.cinterop.CPointer<`USB_CONFIGURATION_DESCRIPTOR`>?,
    public var `ConfigurationHandle`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Interface`: `USBD_INTERFACE_INFORMATION`,
)
// UNSUPPORTED Rust 3312:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for _URB_SELECT_CONFIGURATION {
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
public class `_URB_SELECT_INTERFACE` (
    public var `Hdr`: `_URB_HEADER`,
    public var `ConfigurationHandle`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Interface`: `USBD_INTERFACE_INFORMATION`,
)
// UNSUPPORTED Rust 3324:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for _URB_SELECT_INTERFACE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `_URB_SET_FRAME_LENGTH` (
    public var `Hdr`: `_URB_HEADER`,
    public var `FrameLengthDelta`: Int,
)
