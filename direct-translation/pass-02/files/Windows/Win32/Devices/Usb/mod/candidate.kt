// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("winusb.dll" "system" fn WinUsb_AbortPipe(interfacehandle : WINUSB_INTERFACE_HANDLE, pipeid : u8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("winusb.dll" "system" fn WinUsb_ControlTransfer(interfacehandle : WINUSB_INTERFACE_HANDLE, setuppacket : WINUSB_SETUP_PACKET, buffer : *mut u8, bufferlength : u32, lengthtransferred : *mut u32, overlapped : *const super::super::System::IO:: OVERLAPPED) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("winusb.dll" "system" fn WinUsb_FlushPipe(interfacehandle : WINUSB_INTERFACE_HANDLE, pipeid : u8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("winusb.dll" "system" fn WinUsb_Free(interfacehandle : WINUSB_INTERFACE_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("winusb.dll" "system" fn WinUsb_GetAdjustedFrameNumber(currentframenumber : *mut u32, timestamp : i64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("winusb.dll" "system" fn WinUsb_GetAssociatedInterface(interfacehandle : WINUSB_INTERFACE_HANDLE, associatedinterfaceindex : u8, associatedinterfacehandle : *mut WINUSB_INTERFACE_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("winusb.dll" "system" fn WinUsb_GetCurrentAlternateSetting(interfacehandle : WINUSB_INTERFACE_HANDLE, settingnumber : *mut u8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("winusb.dll" "system" fn WinUsb_GetCurrentFrameNumber(interfacehandle : WINUSB_INTERFACE_HANDLE, currentframenumber : *mut u32, timestamp : *mut i64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("winusb.dll" "system" fn WinUsb_GetCurrentFrameNumberAndQpc(interfacehandle : WINUSB_INTERFACE_HANDLE, frameqpcinfo : *const USB_FRAME_NUMBER_AND_QPC_FOR_TIME_SYNC_INFORMATION) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("winusb.dll" "system" fn WinUsb_GetDescriptor(interfacehandle : WINUSB_INTERFACE_HANDLE, descriptortype : u8, index : u8, languageid : u16, buffer : *mut u8, bufferlength : u32, lengthtransferred : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("winusb.dll" "system" fn WinUsb_GetOverlappedResult(interfacehandle : WINUSB_INTERFACE_HANDLE, lpoverlapped : *const super::super::System::IO:: OVERLAPPED, lpnumberofbytestransferred : *mut u32, bwait : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("winusb.dll" "system" fn WinUsb_GetPipePolicy(interfacehandle : WINUSB_INTERFACE_HANDLE, pipeid : u8, policytype : WINUSB_PIPE_POLICY, valuelength : *mut u32, value : *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("winusb.dll" "system" fn WinUsb_GetPowerPolicy(interfacehandle : WINUSB_INTERFACE_HANDLE, policytype : WINUSB_POWER_POLICY, valuelength : *mut u32, value : *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("winusb.dll" "system" fn WinUsb_Initialize(devicehandle : super::super::Foundation:: HANDLE, interfacehandle : *mut WINUSB_INTERFACE_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("winusb.dll" "system" fn WinUsb_ParseConfigurationDescriptor(configurationdescriptor : *const USB_CONFIGURATION_DESCRIPTOR, startposition : *const core::ffi::c_void, interfacenumber : i32, alternatesetting : i32, interfaceclass : i32, interfacesubclass : i32, interfaceprotocol : i32) -> *mut USB_INTERFACE_DESCRIPTOR);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("winusb.dll" "system" fn WinUsb_ParseDescriptors(descriptorbuffer : *const core::ffi::c_void, totallength : u32, startposition : *const core::ffi::c_void, descriptortype : i32) -> *mut USB_COMMON_DESCRIPTOR);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("winusb.dll" "system" fn WinUsb_QueryDeviceInformation(interfacehandle : WINUSB_INTERFACE_HANDLE, informationtype : u32, bufferlength : *mut u32, buffer : *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("winusb.dll" "system" fn WinUsb_QueryInterfaceSettings(interfacehandle : WINUSB_INTERFACE_HANDLE, alternateinterfacenumber : u8, usbaltinterfacedescriptor : *mut USB_INTERFACE_DESCRIPTOR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("winusb.dll" "system" fn WinUsb_QueryPipe(interfacehandle : WINUSB_INTERFACE_HANDLE, alternateinterfacenumber : u8, pipeindex : u8, pipeinformation : *mut WINUSB_PIPE_INFORMATION) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("winusb.dll" "system" fn WinUsb_QueryPipeEx(interfacehandle : WINUSB_INTERFACE_HANDLE, alternatesettingnumber : u8, pipeindex : u8, pipeinformationex : *mut WINUSB_PIPE_INFORMATION_EX) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("winusb.dll" "system" fn WinUsb_ReadIsochPipe(bufferhandle : *const core::ffi::c_void, offset : u32, length : u32, framenumber : *mut u32, numberofpackets : u32, isopacketdescriptors : *mut USBD_ISO_PACKET_DESCRIPTOR, overlapped : *const super::super::System::IO:: OVERLAPPED) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("winusb.dll" "system" fn WinUsb_ReadIsochPipeAsap(bufferhandle : *const core::ffi::c_void, offset : u32, length : u32, continuestream : windows_sys::core::BOOL, numberofpackets : u32, isopacketdescriptors : *mut USBD_ISO_PACKET_DESCRIPTOR, overlapped : *const super::super::System::IO:: OVERLAPPED) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("winusb.dll" "system" fn WinUsb_ReadPipe(interfacehandle : WINUSB_INTERFACE_HANDLE, pipeid : u8, buffer : *mut u8, bufferlength : u32, lengthtransferred : *mut u32, overlapped : *const super::super::System::IO:: OVERLAPPED) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("winusb.dll" "system" fn WinUsb_RegisterIsochBuffer(interfacehandle : WINUSB_INTERFACE_HANDLE, pipeid : u8, buffer : *mut u8, bufferlength : u32, isochbufferhandle : *mut *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("winusb.dll" "system" fn WinUsb_ResetPipe(interfacehandle : WINUSB_INTERFACE_HANDLE, pipeid : u8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("winusb.dll" "system" fn WinUsb_SetCurrentAlternateSetting(interfacehandle : WINUSB_INTERFACE_HANDLE, settingnumber : u8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("winusb.dll" "system" fn WinUsb_SetPipePolicy(interfacehandle : WINUSB_INTERFACE_HANDLE, pipeid : u8, policytype : WINUSB_PIPE_POLICY, valuelength : u32, value : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("winusb.dll" "system" fn WinUsb_SetPowerPolicy(interfacehandle : WINUSB_INTERFACE_HANDLE, policytype : WINUSB_POWER_POLICY, valuelength : u32, value : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("winusb.dll" "system" fn WinUsb_StartTrackingForTimeSync(interfacehandle : WINUSB_INTERFACE_HANDLE, starttrackinginfo : *const USB_START_TRACKING_FOR_TIME_SYNC_INFORMATION) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("winusb.dll" "system" fn WinUsb_StopTrackingForTimeSync(interfacehandle : WINUSB_INTERFACE_HANDLE, stoptrackinginfo : *const USB_STOP_TRACKING_FOR_TIME_SYNC_INFORMATION) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("winusb.dll" "system" fn WinUsb_UnregisterIsochBuffer(isochbufferhandle : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("winusb.dll" "system" fn WinUsb_WriteIsochPipe(bufferhandle : *const core::ffi::c_void, offset : u32, length : u32, framenumber : *mut u32, overlapped : *const super::super::System::IO:: OVERLAPPED) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("winusb.dll" "system" fn WinUsb_WriteIsochPipeAsap(bufferhandle : *const core::ffi::c_void, offset : u32, length : u32, continuestream : windows_sys::core::BOOL, overlapped : *const super::super::System::IO:: OVERLAPPED) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("winusb.dll" "system" fn WinUsb_WritePipe(interfacehandle : WINUSB_INTERFACE_HANDLE, pipeid : u8, buffer : *const u8, bufferlength : u32, lengthtransferred : *mut u32, overlapped : *const super::super::System::IO:: OVERLAPPED) -> windows_sys::core::BOOL);

public const val `ALLOW_PARTIAL_READS`: `WINUSB_PIPE_POLICY` = 5u;
public const val `ALL_PIPE`: `PIPE_TYPE` = 3;
// UNSUPPORTED Rust 45:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ALTERNATE_INTERFACE {
//     pub InterfaceNumber: u16,
//     pub AlternateInterfaceNumber: u16,
// }

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
// UNSUPPORTED Rust 66:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union BM_REQUEST_TYPE {
//     pub s: BM_REQUEST_TYPE_0,
//     pub B: u8,
// }

// UNSUPPORTED Rust 72:1: declaration Impl has no candidate rule
// impl Default for BM_REQUEST_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 77:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BM_REQUEST_TYPE_0 {
//     pub _bitfield: u8,
// }

public const val `BULKIN_FLAG`: UInt = 128u;
// UNSUPPORTED Rust 83:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CHANNEL_INFO {
//     pub EventChannelSize: u32,
//     pub uReadDataAlignment: u32,
//     pub uWriteDataAlignment: u32,
// }

public const val `CompositeDevice`: `USB_WMI_DEVICE_NODE_TYPE` = 2;
// UNSUPPORTED Rust 91:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEVICE_DESCRIPTOR {
//     pub usVendorId: u16,
//     pub usProductId: u16,
//     pub usBcdDevice: u16,
//     pub usLanguageId: u16,
// }

public const val `DEVICE_SPEED`: UInt = 1u;
// UNSUPPORTED Rust 100:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DRV_VERSION {
//     pub major: u32,
//     pub minor: u32,
//     pub internal: u32,
// }

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
// UNSUPPORTED Rust 128:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVINTERFACE_USB_BILLBOARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5e9adaef_f879_473f_b807_4e5ea77d1b1c);

// UNSUPPORTED Rust 129:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVINTERFACE_USB_DEVICE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa5dcbf10_6530_11d2_901f_00c04fb951ed);

// UNSUPPORTED Rust 130:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVINTERFACE_USB_HOST_CONTROLLER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3abf6f2d_71c4_462a_8a92_1e6861e6af27);

// UNSUPPORTED Rust 131:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVINTERFACE_USB_HUB: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf18a0e88_c30c_11d0_8815_00a0c906bed8);

// UNSUPPORTED Rust 132:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_USB_MSOS20_PLATFORM_CAPABILITY_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd8dd60df_4589_4cc7_9cd2_659d9e648a9f);

// UNSUPPORTED Rust 133:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_USB_PERFORMANCE_TRACING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd5de77a6_6ae9_425c_b1e2_f5615fd348a9);

// UNSUPPORTED Rust 134:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_USB_TRANSFER_TRACING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x681eb8aa_403d_452c_9f8a_f0616fac9540);

// UNSUPPORTED Rust 135:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_USB_WMI_DEVICE_PERF_INFO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66c1aa3c_499f_49a0_a9a5_61e2359f6407);

// UNSUPPORTED Rust 136:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_USB_WMI_NODE_INFO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9c179357_dc7a_4f41_b66b_323b9ddcb5b1);

// UNSUPPORTED Rust 137:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_USB_WMI_STD_DATA: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4e623b20_cb14_11d1_b331_00a0c959bbd2);

// UNSUPPORTED Rust 138:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_USB_WMI_STD_NOTIFICATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4e623b20_cb14_11d1_b331_00a0c959bbd2);

// UNSUPPORTED Rust 139:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_USB_WMI_SURPRISE_REMOVAL_NOTIFICATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9bbbf831_a2f2_43b4_96d1_86944b5914b3);

// UNSUPPORTED Rust 140:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_USB_WMI_TRACING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3a61881b_b4e6_4bf9_ae0f_3cd8f394e52f);

public const val `HCD_DIAGNOSTIC_MODE_OFF`: UInt = 257u;
public const val `HCD_DIAGNOSTIC_MODE_ON`: UInt = 256u;
public const val `HCD_DISABLE_PORT`: UInt = 268u;
public const val `HCD_ENABLE_PORT`: UInt = 269u;
public const val `HCD_GET_DRIVERKEY_NAME`: UInt = 265u;
public const val `HCD_GET_ROOT_HUB_NAME`: UInt = 258u;
public const val `HCD_GET_STATS_1`: UInt = 255u;
public const val `HCD_GET_STATS_2`: UInt = 266u;
// UNSUPPORTED Rust 149:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct HCD_ISO_STAT_COUNTERS {
//     pub LateUrbs: u16,
//     pub DoubleBufferedPackets: u16,
//     pub TransfersCF_5ms: u16,
//     pub TransfersCF_2ms: u16,
//     pub TransfersCF_1ms: u16,
//     pub MaxInterruptLatency: u16,
//     pub BadStartFrame: u16,
//     pub StaleUrbs: u16,
//     pub IsoPacketNotAccesed: u16,
//     pub IsoPacketHWError: u16,
//     pub SmallestUrbPacketCount: u16,
//     pub LargestUrbPacketCount: u16,
//     pub IsoCRC_Error: u16,
//     pub IsoOVERRUN_Error: u16,
//     pub IsoINTERNAL_Error: u16,
//     pub IsoUNKNOWN_Error: u16,
//     pub IsoBytesTransferred: u32,
//     pub LateMissedCount: u16,
//     pub HWIsoMissedCount: u16,
//     pub Reserved7: [u32; 8],
// }

// UNSUPPORTED Rust 173:1: declaration Impl has no candidate rule
// impl Default for HCD_ISO_STAT_COUNTERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 178:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct HCD_STAT_COUNTERS {
//     pub BytesTransferred: u32,
//     pub IsoMissedCount: u16,
//     pub DataOverrunErrorCount: u16,
//     pub CrcErrorCount: u16,
//     pub ScheduleOverrunCount: u16,
//     pub TimeoutErrorCount: u16,
//     pub InternalHcErrorCount: u16,
//     pub BufferOverrunErrorCount: u16,
//     pub SWErrorCount: u16,
//     pub StallPidCount: u16,
//     pub PortDisableCount: u16,
// }

// UNSUPPORTED Rust 193:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct HCD_STAT_INFORMATION_1 {
//     pub Reserved1: u32,
//     pub Reserved2: u32,
//     pub ResetCounters: u32,
//     pub TimeRead: i64,
//     pub Counters: HCD_STAT_COUNTERS,
// }

// UNSUPPORTED Rust 202:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct HCD_STAT_INFORMATION_2 {
//     pub Reserved1: u32,
//     pub Reserved2: u32,
//     pub ResetCounters: u32,
//     pub TimeRead: i64,
//     pub LockedMemoryUsed: i32,
//     pub Counters: HCD_STAT_COUNTERS,
//     pub IsoCounters: HCD_ISO_STAT_COUNTERS,
// }

public const val `HCD_TRACE_READ_REQUEST`: UInt = 275u;
public const val `HCD_USER_REQUEST`: UInt = 270u;
// UNSUPPORTED Rust 215:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct HUB_DEVICE_CONFIG_INFO {
//     pub Version: u32,
//     pub Length: u32,
//     pub HubFlags: USB_HUB_CAP_FLAGS,
//     pub HardwareIds: USB_ID_STRING,
//     pub CompatibleIds: USB_ID_STRING,
//     pub DeviceDescription: USB_ID_STRING,
//     pub Reserved: [u32; 19],
//     pub UxdSettings: USB_HUB_DEVICE_UXD_SETTINGS,
// }

// UNSUPPORTED Rust 227:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 324:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IO_BLOCK {
//     pub uOffset: u32,
//     pub uLength: u32,
//     pub pbyData: *mut u8,
//     pub uIndex: u32,
// }

// UNSUPPORTED Rust 332:1: declaration Impl has no candidate rule
// impl Default for IO_BLOCK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 337:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IO_BLOCK_EX {
//     pub uOffset: u32,
//     pub uLength: u32,
//     pub pbyData: *mut u8,
//     pub uIndex: u32,
//     pub bRequest: u8,
//     pub bmRequestType: u8,
//     pub fTransferDirectionIn: u8,
// }

// UNSUPPORTED Rust 348:1: declaration Impl has no candidate rule
// impl Default for IO_BLOCK_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `InsufficentBandwidth`: `USB_NOTIFICATION_TYPE` = 1;
public const val `InsufficentPower`: `USB_NOTIFICATION_TYPE` = 2;
// UNSUPPORTED Rust 355:1: non-scalar type Ptr unsupported
// pub const KREGMANUSBFNENUMPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("\\Registry\\Machine\\SYSTEM\\CurrentControlSet\\Control\\ManufacturingMode\\Current\\USBFN\\");

// UNSUPPORTED Rust 356:1: non-scalar type Ptr unsupported
// pub const KREGUSBFNENUMPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("\\Registry\\Machine\\SYSTEM\\CurrentControlSet\\Control\\USBFN\\");

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
// UNSUPPORTED Rust 370:1: non-scalar type Ptr unsupported
// pub const MS_OS_STRING_SIGNATURE: windows_sys::core::PCWSTR = windows_sys::core::w!("MSFT100");

public const val `MS_POWER_DESCRIPTOR_INDEX`: UInt = 2u;
public const val `ModernDeviceInLegacyHub`: `USB_NOTIFICATION_TYPE` = 11;
public const val `NoDeviceConnected`: `USB_CONNECTION_STATUS` = 0;
public const val `OHCI_Generic`: `USB_CONTROLLER_FLAVOR` = 100;
public const val `OHCI_Hydra`: `USB_CONTROLLER_FLAVOR` = 101;
public const val `OHCI_NEC`: `USB_CONTROLLER_FLAVOR` = 102;
// UNSUPPORTED Rust 377:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OS_STRING {
//     pub bLength: u8,
//     pub bDescriptorType: u8,
//     pub MicrosoftString: [u16; 7],
//     pub bVendorCode: u8,
//     pub Anonymous: OS_STRING_0,
// }

// UNSUPPORTED Rust 386:1: declaration Impl has no candidate rule
// impl Default for OS_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 391:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union OS_STRING_0 {
//     pub bPad: u8,
//     pub bFlags: u8,
// }

// UNSUPPORTED Rust 397:1: declaration Impl has no candidate rule
// impl Default for OS_STRING_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OS_STRING_DESCRIPTOR_INDEX`: UInt = 238u;
public const val `OverCurrent`: `USB_NOTIFICATION_TYPE` = 3;
// UNSUPPORTED Rust 404:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct PACKET_PARAMETERS {
//     pub DeviceAddress: u8,
//     pub EndpointAddress: u8,
//     pub MaximumPacketSize: u16,
//     pub Timeout: u32,
//     pub Flags: u32,
//     pub DataLength: u32,
//     pub HubDeviceAddress: u16,
//     pub PortTTNumber: u16,
//     pub ErrorCount: u8,
//     pub Pad: [u8; 3],
//     pub UsbdStatusCode: i32,
//     pub Data: [u8; 4],
// }

// UNSUPPORTED Rust 420:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 442:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct RAW_RESET_PORT_PARAMETERS {
//     pub PortNumber: u16,
//     pub PortStatus: u16,
// }

// UNSUPPORTED Rust 448:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct RAW_ROOTPORT_FEATURE {
//     pub PortNumber: u16,
//     pub PortFeature: u16,
//     pub PortStatus: u16,
// }

// UNSUPPORTED Rust 455:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct RAW_ROOTPORT_PARAMETERS {
//     pub PortNumber: u16,
//     pub PortStatus: u16,
// }

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
// UNSUPPORTED Rust 483:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct URB {
//     pub Anonymous: URB_0,
// }

// UNSUPPORTED Rust 488:1: declaration Impl has no candidate rule
// impl Default for URB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 493:1: declaration Union has no candidate rule
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

// UNSUPPORTED Rust 518:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 583:1: non-scalar type Ptr unsupported
// pub const UREGMANUSBFNENUMPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("HKEY_LOCAL_MACHINE\\SYSTEM\\CurrentControlSet\\Control\\ManufacturingMode\\Current\\USBFN\\");

// UNSUPPORTED Rust 584:1: non-scalar type Ptr unsupported
// pub const UREGUSBFNENUMPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("HKEY_LOCAL_MACHINE\\SYSTEM\\CurrentControlSet\\Control\\USBFN\\");

public const val `USBDI_VERSION`: UInt = 1536u;
public const val `USBD_DEFAULT_MAXIMUM_TRANSFER_SIZE`: UInt = 4294967295u;
public const val `USBD_DEFAULT_PIPE_TRANSFER`: UInt = 8u;
// UNSUPPORTED Rust 588:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USBD_DEVICE_INFORMATION {
//     pub OffsetNext: u32,
//     pub UsbdDeviceHandle: *mut core::ffi::c_void,
//     pub DeviceDescriptor: USB_DEVICE_DESCRIPTOR,
// }

// UNSUPPORTED Rust 595:1: declaration Impl has no candidate rule
// impl Default for USBD_DEVICE_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 600:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USBD_ENDPOINT_OFFLOAD_INFORMATION {
//     pub Size: u32,
//     pub EndpointAddress: u16,
//     pub ResourceId: u32,
//     pub Mode: USBD_ENDPOINT_OFFLOAD_MODE,
//     pub _bitfield1: u32,
//     pub _bitfield2: u32,
//     pub TransferSegmentLA: i64,
//     pub TransferSegmentVA: *mut core::ffi::c_void,
//     pub TransferRingSize: usize,
//     pub TransferRingInitialCycleBit: u32,
//     pub MessageNumber: u32,
//     pub EventRingSegmentLA: i64,
//     pub EventRingSegmentVA: *mut core::ffi::c_void,
//     pub EventRingSize: usize,
//     pub EventRingInitialCycleBit: u32,
// }

// UNSUPPORTED Rust 619:1: declaration Impl has no candidate rule
// impl Default for USBD_ENDPOINT_OFFLOAD_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `USBD_ENDPOINT_OFFLOAD_MODE` = Int;
// UNSUPPORTED Rust 625:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USBD_INTERFACE_INFORMATION {
//     pub Length: u16,
//     pub InterfaceNumber: u8,
//     pub AlternateSetting: u8,
//     pub Class: u8,
//     pub SubClass: u8,
//     pub Protocol: u8,
//     pub Reserved: u8,
//     pub InterfaceHandle: *mut core::ffi::c_void,
//     pub NumberOfPipes: u32,
//     pub Pipes: [USBD_PIPE_INFORMATION; 1],
// }

// UNSUPPORTED Rust 639:1: declaration Impl has no candidate rule
// impl Default for USBD_INTERFACE_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 644:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USBD_ISO_PACKET_DESCRIPTOR {
//     pub Offset: u32,
//     pub Length: u32,
//     pub Status: i32,
// }

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
// UNSUPPORTED Rust 662:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USBD_PIPE_INFORMATION {
//     pub MaximumPacketSize: u16,
//     pub EndpointAddress: u8,
//     pub Interval: u8,
//     pub PipeType: USBD_PIPE_TYPE,
//     pub PipeHandle: *mut core::ffi::c_void,
//     pub MaximumTransferSize: u32,
//     pub PipeFlags: u32,
// }

// UNSUPPORTED Rust 673:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 683:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USBD_STREAM_INFORMATION {
//     pub PipeHandle: *mut core::ffi::c_void,
//     pub StreamID: u32,
//     pub MaximumTransferSize: u32,
//     pub PipeFlags: u32,
// }

// UNSUPPORTED Rust 691:1: declaration Impl has no candidate rule
// impl Default for USBD_STREAM_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `USBD_TRANSFER_DIRECTION`: UInt = 1u;
public const val `USBD_TRANSFER_DIRECTION_IN`: UInt = 1u;
public const val `USBD_TRANSFER_DIRECTION_OUT`: UInt = 0u;
// UNSUPPORTED Rust 699:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USBD_VERSION_INFORMATION {
//     pub USBDI_Version: u32,
//     pub Supported_USB_Version: u32,
// }

// UNSUPPORTED Rust 705:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USBFN_BUS_CONFIGURATION_INFO {
//     pub ConfigurationName: [u16; 40],
//     pub IsCurrent: bool,
//     pub IsActive: bool,
// }

// UNSUPPORTED Rust 712:1: declaration Impl has no candidate rule
// impl Default for USBFN_BUS_CONFIGURATION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `USBFN_BUS_SPEED` = Int;
// UNSUPPORTED Rust 718:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USBFN_CLASS_INFORMATION_PACKET {
//     pub FullSpeedClassInterface: USBFN_CLASS_INTERFACE,
//     pub HighSpeedClassInterface: USBFN_CLASS_INTERFACE,
//     pub InterfaceName: [u16; 40],
//     pub InterfaceGuid: [u16; 39],
//     pub HasInterfaceGuid: bool,
//     pub SuperSpeedClassInterface: USBFN_CLASS_INTERFACE,
// }

// UNSUPPORTED Rust 728:1: declaration Impl has no candidate rule
// impl Default for USBFN_CLASS_INFORMATION_PACKET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 733:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USBFN_CLASS_INFORMATION_PACKET_EX {
//     pub FullSpeedClassInterfaceEx: USBFN_CLASS_INTERFACE_EX,
//     pub HighSpeedClassInterfaceEx: USBFN_CLASS_INTERFACE_EX,
//     pub SuperSpeedClassInterfaceEx: USBFN_CLASS_INTERFACE_EX,
//     pub InterfaceName: [u16; 40],
//     pub InterfaceGuid: [u16; 39],
//     pub HasInterfaceGuid: bool,
// }

// UNSUPPORTED Rust 743:1: declaration Impl has no candidate rule
// impl Default for USBFN_CLASS_INFORMATION_PACKET_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 748:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USBFN_CLASS_INTERFACE {
//     pub InterfaceNumber: u8,
//     pub PipeCount: u8,
//     pub PipeArr: [USBFN_PIPE_INFORMATION; 16],
// }

// UNSUPPORTED Rust 755:1: declaration Impl has no candidate rule
// impl Default for USBFN_CLASS_INTERFACE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 760:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USBFN_CLASS_INTERFACE_EX {
//     pub BaseInterfaceNumber: u8,
//     pub InterfaceCount: u8,
//     pub PipeCount: u8,
//     pub PipeArr: [USBFN_PIPE_INFORMATION; 16],
// }

// UNSUPPORTED Rust 768:1: declaration Impl has no candidate rule
// impl Default for USBFN_CLASS_INTERFACE_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `USBFN_DEVICE_STATE` = Int;
public typealias `USBFN_DIRECTION` = Int;
public typealias `USBFN_EVENT` = Int;
// UNSUPPORTED Rust 776:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USBFN_INTERFACE_INFO {
//     pub InterfaceNumber: u8,
//     pub Speed: USBFN_BUS_SPEED,
//     pub Size: u16,
//     pub InterfaceDescriptorSet: [u8; 1],
// }

// UNSUPPORTED Rust 784:1: declaration Impl has no candidate rule
// impl Default for USBFN_INTERFACE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `USBFN_INTERRUPT_ENDPOINT_SIZE_NOT_UPDATEABLE_MASK`: UInt = 128u;
// UNSUPPORTED Rust 790:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USBFN_NOTIFICATION {
//     pub Event: USBFN_EVENT,
//     pub u: USBFN_NOTIFICATION_0,
// }

// UNSUPPORTED Rust 796:1: declaration Impl has no candidate rule
// impl Default for USBFN_NOTIFICATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 801:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union USBFN_NOTIFICATION_0 {
//     pub BusSpeed: USBFN_BUS_SPEED,
//     pub SetupPacket: USB_DEFAULT_PIPE_SETUP_PACKET,
//     pub ConfigurationValue: u16,
//     pub PortType: USBFN_PORT_TYPE,
//     pub AlternateInterface: ALTERNATE_INTERFACE,
// }

// UNSUPPORTED Rust 810:1: declaration Impl has no candidate rule
// impl Default for USBFN_NOTIFICATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 815:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USBFN_PIPE_INFORMATION {
//     pub EpDesc: USB_ENDPOINT_DESCRIPTOR,
//     pub PipeId: u32,
// }

public typealias `USBFN_PORT_TYPE` = Int;
// UNSUPPORTED Rust 822:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USBFN_USB_STRING {
//     pub StringIndex: u8,
//     pub UsbString: [u16; 255],
// }

// UNSUPPORTED Rust 828:1: declaration Impl has no candidate rule
// impl Default for USBFN_USB_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 833:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USBSCAN_GET_DESCRIPTOR {
//     pub DescriptorType: u8,
//     pub Index: u8,
//     pub LanguageId: u16,
// }

public const val `USBSCAN_PIPE_BULK`: `RAW_PIPE_TYPE` = 2;
// UNSUPPORTED Rust 841:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USBSCAN_PIPE_CONFIGURATION {
//     pub NumberOfPipes: u32,
//     pub PipeInfo: [USBSCAN_PIPE_INFORMATION; 8],
// }

// UNSUPPORTED Rust 847:1: declaration Impl has no candidate rule
// impl Default for USBSCAN_PIPE_CONFIGURATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `USBSCAN_PIPE_CONTROL`: `RAW_PIPE_TYPE` = 0;
// UNSUPPORTED Rust 853:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USBSCAN_PIPE_INFORMATION {
//     pub MaximumPacketSize: u16,
//     pub EndpointAddress: u8,
//     pub Interval: u8,
//     pub PipeType: RAW_PIPE_TYPE,
// }

public const val `USBSCAN_PIPE_INTERRUPT`: `RAW_PIPE_TYPE` = 3;
public const val `USBSCAN_PIPE_ISOCHRONOUS`: `RAW_PIPE_TYPE` = 1;
// UNSUPPORTED Rust 863:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USBSCAN_TIMEOUT {
//     pub TimeoutRead: u32,
//     pub TimeoutWrite: u32,
//     pub TimeoutEvent: u32,
// }

// UNSUPPORTED Rust 870:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USBUSER_BANDWIDTH_INFO_REQUEST {
//     pub Header: USBUSER_REQUEST_HEADER,
//     pub BandwidthInformation: USB_BANDWIDTH_INFO,
// }

// UNSUPPORTED Rust 876:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USBUSER_BUS_STATISTICS_0_REQUEST {
//     pub Header: USBUSER_REQUEST_HEADER,
//     pub BusStatistics0: USB_BUS_STATISTICS_0,
// }

public const val `USBUSER_CLEAR_ROOTPORT_FEATURE`: UInt = 536870918u;
// UNSUPPORTED Rust 883:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USBUSER_CLOSE_RAW_DEVICE {
//     pub Header: USBUSER_REQUEST_HEADER,
//     pub Parameters: USB_CLOSE_RAW_DEVICE_PARAMETERS,
// }

// UNSUPPORTED Rust 889:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USBUSER_CONTROLLER_INFO_0 {
//     pub Header: USBUSER_REQUEST_HEADER,
//     pub Info0: USB_CONTROLLER_INFO_0,
// }

// UNSUPPORTED Rust 895:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USBUSER_CONTROLLER_UNICODE_NAME {
//     pub Header: USBUSER_REQUEST_HEADER,
//     pub UnicodeName: USB_UNICODE_NAME,
// }

public const val `USBUSER_GET_BANDWIDTH_INFORMATION`: UInt = 5u;
public const val `USBUSER_GET_BUS_STATISTICS_0`: UInt = 6u;
public const val `USBUSER_GET_CONTROLLER_DRIVER_KEY`: UInt = 2u;
public const val `USBUSER_GET_CONTROLLER_INFO_0`: UInt = 1u;
// UNSUPPORTED Rust 905:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USBUSER_GET_DRIVER_VERSION {
//     pub Header: USBUSER_REQUEST_HEADER,
//     pub Parameters: USB_DRIVER_VERSION_PARAMETERS,
// }

public const val `USBUSER_GET_POWER_STATE_MAP`: UInt = 4u;
public const val `USBUSER_GET_ROOTHUB_SYMBOLIC_NAME`: UInt = 7u;
public const val `USBUSER_GET_ROOTPORT_STATUS`: UInt = 536870919u;
// UNSUPPORTED Rust 914:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USBUSER_GET_USB2HW_VERSION {
//     pub Header: USBUSER_REQUEST_HEADER,
//     pub Parameters: USB_USB2HW_VERSION_PARAMETERS,
// }

public const val `USBUSER_GET_USB2_HW_VERSION`: UInt = 9u;
public const val `USBUSER_GET_USB_DRIVER_VERSION`: UInt = 8u;
public const val `USBUSER_INVALID_REQUEST`: UInt = 4294967280u;
// UNSUPPORTED Rust 923:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USBUSER_OPEN_RAW_DEVICE {
//     pub Header: USBUSER_REQUEST_HEADER,
//     pub Parameters: USB_OPEN_RAW_DEVICE_PARAMETERS,
// }

public const val `USBUSER_OP_CLOSE_RAW_DEVICE`: UInt = 536870915u;
public const val `USBUSER_OP_MASK_DEVONLY_API`: UInt = 268435456u;
public const val `USBUSER_OP_MASK_HCTEST_API`: UInt = 536870912u;
public const val `USBUSER_OP_OPEN_RAW_DEVICE`: UInt = 536870914u;
public const val `USBUSER_OP_RAW_RESET_PORT`: UInt = 536870913u;
public const val `USBUSER_OP_SEND_ONE_PACKET`: UInt = 268435457u;
public const val `USBUSER_OP_SEND_RAW_COMMAND`: UInt = 536870916u;
public const val `USBUSER_PASS_THRU`: UInt = 3u;
// UNSUPPORTED Rust 937:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USBUSER_PASS_THRU_REQUEST {
//     pub Header: USBUSER_REQUEST_HEADER,
//     pub PassThru: USB_PASS_THRU_PARAMETERS,
// }

// UNSUPPORTED Rust 943:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USBUSER_POWER_INFO_REQUEST {
//     pub Header: USBUSER_REQUEST_HEADER,
//     pub PowerInformation: USB_POWER_INFO,
// }

// UNSUPPORTED Rust 949:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USBUSER_RAW_RESET_ROOT_PORT {
//     pub Header: USBUSER_REQUEST_HEADER,
//     pub Parameters: RAW_RESET_PORT_PARAMETERS,
// }

// UNSUPPORTED Rust 955:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USBUSER_REFRESH_HCT_REG {
//     pub Header: USBUSER_REQUEST_HEADER,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 961:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USBUSER_REQUEST_HEADER {
//     pub UsbUserRequest: u32,
//     pub UsbUserStatusCode: USB_USER_ERROR_CODE,
//     pub RequestBufferLength: u32,
//     pub ActualBufferLength: u32,
// }

// UNSUPPORTED Rust 969:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USBUSER_ROOTPORT_FEATURE_REQUEST {
//     pub Header: USBUSER_REQUEST_HEADER,
//     pub Parameters: RAW_ROOTPORT_FEATURE,
// }

// UNSUPPORTED Rust 975:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USBUSER_ROOTPORT_PARAMETERS {
//     pub Header: USBUSER_REQUEST_HEADER,
//     pub Parameters: RAW_ROOTPORT_PARAMETERS,
// }

// UNSUPPORTED Rust 981:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USBUSER_SEND_ONE_PACKET {
//     pub Header: USBUSER_REQUEST_HEADER,
//     pub PacketParameters: PACKET_PARAMETERS,
// }

// UNSUPPORTED Rust 987:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USBUSER_SEND_RAW_COMMAND {
//     pub Header: USBUSER_REQUEST_HEADER,
//     pub Parameters: USB_SEND_RAW_COMMAND_PARAMETERS,
// }

public const val `USBUSER_SET_ROOTPORT_FEATURE`: UInt = 536870917u;
public const val `USBUSER_USB_REFRESH_HCT_REG`: UInt = 10u;
public const val `USBUSER_VERSION`: UInt = 4u;
public const val `USB_20_ENDPOINT_TYPE_INTERRUPT_RESERVED_MASK`: UInt = 252u;
public const val `USB_20_HUB_DESCRIPTOR_TYPE`: UInt = 41u;
// UNSUPPORTED Rust 998:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_20_PORT_CHANGE {
//     pub AsUshort16: u16,
//     pub Anonymous: USB_20_PORT_CHANGE_0,
// }

// UNSUPPORTED Rust 1004:1: declaration Impl has no candidate rule
// impl Default for USB_20_PORT_CHANGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1009:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_20_PORT_CHANGE_0 {
//     pub _bitfield: u16,
// }

// UNSUPPORTED Rust 1014:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_20_PORT_STATUS {
//     pub AsUshort16: u16,
//     pub Anonymous: USB_20_PORT_STATUS_0,
// }

// UNSUPPORTED Rust 1020:1: declaration Impl has no candidate rule
// impl Default for USB_20_PORT_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1025:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_20_PORT_STATUS_0 {
//     pub _bitfield: u16,
// }

public const val `USB_30_ENDPOINT_TYPE_INTERRUPT_RESERVED_MASK`: UInt = 204u;
public const val `USB_30_ENDPOINT_TYPE_INTERRUPT_USAGE_MASK`: UInt = 48u;
public const val `USB_30_ENDPOINT_TYPE_INTERRUPT_USAGE_NOTIFICATION`: UInt = 16u;
public const val `USB_30_ENDPOINT_TYPE_INTERRUPT_USAGE_PERIODIC`: UInt = 0u;
public const val `USB_30_ENDPOINT_TYPE_INTERRUPT_USAGE_RESERVED10`: UInt = 32u;
public const val `USB_30_ENDPOINT_TYPE_INTERRUPT_USAGE_RESERVED11`: UInt = 48u;
// UNSUPPORTED Rust 1036:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_30_HUB_DESCRIPTOR {
//     pub bLength: u8,
//     pub bDescriptorType: u8,
//     pub bNumberOfPorts: u8,
//     pub wHubCharacteristics: u16,
//     pub bPowerOnToPowerGood: u8,
//     pub bHubControlCurrent: u8,
//     pub bHubHdrDecLat: u8,
//     pub wHubDelay: u16,
//     pub DeviceRemovable: u16,
// }

public const val `USB_30_HUB_DESCRIPTOR_TYPE`: UInt = 42u;
// UNSUPPORTED Rust 1050:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_30_PORT_CHANGE {
//     pub AsUshort16: u16,
//     pub Anonymous: USB_30_PORT_CHANGE_0,
// }

// UNSUPPORTED Rust 1056:1: declaration Impl has no candidate rule
// impl Default for USB_30_PORT_CHANGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1061:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_30_PORT_CHANGE_0 {
//     pub _bitfield: u16,
// }

// UNSUPPORTED Rust 1066:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_30_PORT_STATUS {
//     pub AsUshort16: u16,
//     pub Anonymous: USB_30_PORT_STATUS_0,
// }

// UNSUPPORTED Rust 1072:1: declaration Impl has no candidate rule
// impl Default for USB_30_PORT_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1077:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_30_PORT_STATUS_0 {
//     pub _bitfield: u16,
// }

// UNSUPPORTED Rust 1082:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_ACQUIRE_INFO {
//     pub NotificationType: USB_NOTIFICATION_TYPE,
//     pub TotalSize: u32,
//     pub Buffer: [u16; 1],
// }

// UNSUPPORTED Rust 1089:1: declaration Impl has no candidate rule
// impl Default for USB_ACQUIRE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `USB_ALLOW_FIRMWARE_UPDATE`: UInt = 1u;
// UNSUPPORTED Rust 1095:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_BANDWIDTH_INFO {
//     pub DeviceCount: u32,
//     pub TotalBusBandwidth: u32,
//     pub Total32secBandwidth: u32,
//     pub AllocedBulkAndControl: u32,
//     pub AllocedIso: u32,
//     pub AllocedInterrupt_1ms: u32,
//     pub AllocedInterrupt_2ms: u32,
//     pub AllocedInterrupt_4ms: u32,
//     pub AllocedInterrupt_8ms: u32,
//     pub AllocedInterrupt_16ms: u32,
//     pub AllocedInterrupt_32ms: u32,
// }

// UNSUPPORTED Rust 1110:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_BOS_DESCRIPTOR {
//     pub bLength: u8,
//     pub bDescriptorType: u8,
//     pub wTotalLength: u16,
//     pub bNumDeviceCaps: u8,
// }

public const val `USB_BOS_DESCRIPTOR_TYPE`: UInt = 15u;
// UNSUPPORTED Rust 1119:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_BUS_NOTIFICATION {
//     pub NotificationType: USB_NOTIFICATION_TYPE,
//     pub TotalBandwidth: u32,
//     pub ConsumedBandwidth: u32,
//     pub ControllerNameLength: u32,
// }

// UNSUPPORTED Rust 1127:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_BUS_STATISTICS_0 {
//     pub DeviceCount: u32,
//     pub CurrentSystemTime: i64,
//     pub CurrentUsbFrame: u32,
//     pub BulkBytes: u32,
//     pub IsoBytes: u32,
//     pub InterruptBytes: u32,
//     pub ControlDataBytes: u32,
//     pub PciInterruptCount: u32,
//     pub HardResetCount: u32,
//     pub WorkerSignalCount: u32,
//     pub CommonBufferBytes: u32,
//     pub WorkerIdleTimeMs: u32,
//     pub RootHubEnabled: bool,
//     pub RootHubDevicePowerState: u8,
//     pub Unused: u8,
//     pub NameIndex: u8,
// }

// UNSUPPORTED Rust 1147:1: non-scalar type Ptr unsupported
// pub type USB_CHANGE_REGISTRATION_HANDLE = *mut core::ffi::c_void;

public const val `USB_CHARGING_POLICY_DEFAULT`: UInt = 0u;
public const val `USB_CHARGING_POLICY_ICCHPF`: UInt = 1u;
public const val `USB_CHARGING_POLICY_ICCLPF`: UInt = 2u;
public const val `USB_CHARGING_POLICY_NO_POWER`: UInt = 3u;
// UNSUPPORTED Rust 1152:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_CLOSE_RAW_DEVICE_PARAMETERS {
//     pub xxx: u32,
// }

// UNSUPPORTED Rust 1157:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USB_COMMON_DESCRIPTOR {
//     pub bLength: u8,
//     pub bDescriptorType: u8,
// }

// UNSUPPORTED Rust 1163:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USB_COMPOSITE_DEVICE_INFO {
//     pub DeviceDescriptor: USB_DEVICE_DESCRIPTOR,
//     pub CurrentConfigDescriptor: USB_CONFIGURATION_DESCRIPTOR,
//     pub CurrentConfigurationValue: u8,
//     pub NumberOfFunctions: u8,
//     pub FunctionInfo: [USB_COMPOSITE_FUNCTION_INFO; 1],
// }

// UNSUPPORTED Rust 1172:1: declaration Impl has no candidate rule
// impl Default for USB_COMPOSITE_DEVICE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1177:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USB_COMPOSITE_FUNCTION_INFO {
//     pub FunctionNumber: u8,
//     pub BaseInterfaceNumber: u8,
//     pub NumberOfInterfaces: u8,
//     pub FunctionIsIdle: bool,
// }

// UNSUPPORTED Rust 1185:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_CONFIGURATION_DESCRIPTOR {
//     pub bLength: u8,
//     pub bDescriptorType: u8,
//     pub wTotalLength: u16,
//     pub bNumInterfaces: u8,
//     pub bConfigurationValue: u8,
//     pub iConfiguration: u8,
//     pub bmAttributes: u8,
//     pub MaxPower: u8,
// }

public const val `USB_CONFIGURATION_DESCRIPTOR_TYPE`: UInt = 2u;
// UNSUPPORTED Rust 1198:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_CONFIGURATION_POWER_DESCRIPTOR {
//     pub bLength: u8,
//     pub bDescriptorType: u8,
//     pub SelfPowerConsumedD0: [u8; 3],
//     pub bPowerSummaryId: u8,
//     pub bBusPowerSavingD1: u8,
//     pub bSelfPowerSavingD1: u8,
//     pub bBusPowerSavingD2: u8,
//     pub bSelfPowerSavingD2: u8,
//     pub bBusPowerSavingD3: u8,
//     pub bSelfPowerSavingD3: u8,
//     pub TransitionTimeFromD1: u16,
//     pub TransitionTimeFromD2: u16,
//     pub TransitionTimeFromD3: u16,
// }

// UNSUPPORTED Rust 1215:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 1226:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_CONNECTION_NOTIFICATION {
//     pub NotificationType: USB_NOTIFICATION_TYPE,
//     pub ConnectionNumber: u32,
//     pub RequestedBandwidth: u32,
//     pub EnumerationFailReason: u32,
//     pub PowerRequested: u32,
//     pub HubNameLength: u32,
// }

public typealias `USB_CONNECTION_STATUS` = Int;
// UNSUPPORTED Rust 1237:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_CONTROLLER_DEVICE_INFO {
//     pub PciVendorId: u32,
//     pub PciDeviceId: u32,
//     pub PciRevision: u32,
//     pub NumberOfRootPorts: u32,
//     pub HcFeatureFlags: u32,
// }

public typealias `USB_CONTROLLER_FLAVOR` = Int;
// UNSUPPORTED Rust 1247:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_CONTROLLER_INFO_0 {
//     pub PciVendorId: u32,
//     pub PciDeviceId: u32,
//     pub PciRevision: u32,
//     pub NumberOfRootPorts: u32,
//     pub ControllerFlavor: USB_CONTROLLER_FLAVOR,
//     pub HcFeatureFlags: u32,
// }

public const val `USB_CYCLE_PORT`: UInt = 7u;
// UNSUPPORTED Rust 1258:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_CYCLE_PORT_PARAMS {
//     pub ConnectionIndex: u32,
//     pub StatusReturned: u32,
// }

public const val `USB_DEBUG_DESCRIPTOR_TYPE`: UInt = 10u;
public const val `USB_DEFAULT_DEVICE_ADDRESS`: UInt = 0u;
public const val `USB_DEFAULT_ENDPOINT_ADDRESS`: UInt = 0u;
public const val `USB_DEFAULT_MAX_PACKET`: UInt = 64u;
// UNSUPPORTED Rust 1268:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_DEFAULT_PIPE_SETUP_PACKET {
//     pub bmRequestType: BM_REQUEST_TYPE,
//     pub bRequest: u8,
//     pub wValue: USB_DEFAULT_PIPE_SETUP_PACKET_0,
//     pub wIndex: USB_DEFAULT_PIPE_SETUP_PACKET_1,
//     pub wLength: u16,
// }

// UNSUPPORTED Rust 1277:1: declaration Impl has no candidate rule
// impl Default for USB_DEFAULT_PIPE_SETUP_PACKET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1282:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_DEFAULT_PIPE_SETUP_PACKET_1 {
//     pub Anonymous: USB_DEFAULT_PIPE_SETUP_PACKET_1_0,
//     pub W: u16,
// }

// UNSUPPORTED Rust 1288:1: declaration Impl has no candidate rule
// impl Default for USB_DEFAULT_PIPE_SETUP_PACKET_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1293:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USB_DEFAULT_PIPE_SETUP_PACKET_1_0 {
//     pub LowByte: u8,
//     pub HiByte: u8,
// }

// UNSUPPORTED Rust 1299:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_DEFAULT_PIPE_SETUP_PACKET_0 {
//     pub Anonymous: USB_DEFAULT_PIPE_SETUP_PACKET_0_0,
//     pub W: u16,
// }

// UNSUPPORTED Rust 1305:1: declaration Impl has no candidate rule
// impl Default for USB_DEFAULT_PIPE_SETUP_PACKET_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1310:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USB_DEFAULT_PIPE_SETUP_PACKET_0_0 {
//     pub LowByte: u8,
//     pub HiByte: u8,
// }

// UNSUPPORTED Rust 1316:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_DESCRIPTOR_REQUEST {
//     pub ConnectionIndex: u32,
//     pub SetupPacket: USB_DESCRIPTOR_REQUEST_0,
//     pub Data: [u8; 1],
// }

// UNSUPPORTED Rust 1323:1: declaration Impl has no candidate rule
// impl Default for USB_DESCRIPTOR_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1328:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_DESCRIPTOR_REQUEST_0 {
//     pub bmRequest: u8,
//     pub bRequest: u8,
//     pub wValue: u16,
//     pub wIndex: u16,
//     pub wLength: u16,
// }

public const val `USB_DEVICE_CAPABILITY_BATTERY_INFO`: UInt = 7u;
public const val `USB_DEVICE_CAPABILITY_BILLBOARD`: UInt = 13u;
// UNSUPPORTED Rust 1339:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_DEVICE_CAPABILITY_BILLBOARD_DESCRIPTOR {
//     pub bLength: u8,
//     pub bDescriptorType: u8,
//     pub bDevCapabilityType: u8,
//     pub iAddtionalInfoURL: u8,
//     pub bNumberOfAlternateModes: u8,
//     pub bPreferredAlternateMode: u8,
//     pub VconnPower: USB_DEVICE_CAPABILITY_BILLBOARD_DESCRIPTOR_0,
//     pub bmConfigured: [u8; 32],
//     pub bReserved: u32,
//     pub AlternateMode: [USB_DEVICE_CAPABILITY_BILLBOARD_DESCRIPTOR_1; 1],
// }

// UNSUPPORTED Rust 1353:1: declaration Impl has no candidate rule
// impl Default for USB_DEVICE_CAPABILITY_BILLBOARD_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1358:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_DEVICE_CAPABILITY_BILLBOARD_DESCRIPTOR_1 {
//     pub wSVID: u16,
//     pub bAlternateMode: u8,
//     pub iAlternateModeSetting: u8,
// }

// UNSUPPORTED Rust 1365:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_DEVICE_CAPABILITY_BILLBOARD_DESCRIPTOR_0 {
//     pub AsUshort: u16,
//     pub Anonymous: USB_DEVICE_CAPABILITY_BILLBOARD_DESCRIPTOR_0_0,
// }

// UNSUPPORTED Rust 1371:1: declaration Impl has no candidate rule
// impl Default for USB_DEVICE_CAPABILITY_BILLBOARD_DESCRIPTOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1376:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_DEVICE_CAPABILITY_BILLBOARD_DESCRIPTOR_0_0 {
//     pub _bitfield: u16,
// }

public const val `USB_DEVICE_CAPABILITY_CONTAINER_ID`: UInt = 4u;
// UNSUPPORTED Rust 1382:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USB_DEVICE_CAPABILITY_CONTAINER_ID_DESCRIPTOR {
//     pub bLength: u8,
//     pub bDescriptorType: u8,
//     pub bDevCapabilityType: u8,
//     pub bReserved: u8,
//     pub ContainerID: [u8; 16],
// }

// UNSUPPORTED Rust 1391:1: declaration Impl has no candidate rule
// impl Default for USB_DEVICE_CAPABILITY_CONTAINER_ID_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1396:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USB_DEVICE_CAPABILITY_DESCRIPTOR {
//     pub bLength: u8,
//     pub bDescriptorType: u8,
//     pub bDevCapabilityType: u8,
// }

public const val `USB_DEVICE_CAPABILITY_DESCRIPTOR_TYPE`: UInt = 16u;
public const val `USB_DEVICE_CAPABILITY_FIRMWARE_STATUS`: UInt = 17u;
// UNSUPPORTED Rust 1405:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USB_DEVICE_CAPABILITY_FIRMWARE_STATUS_DESCRIPTOR {
//     pub bLength: u8,
//     pub bDescriptorType: u8,
//     pub bDevCapabilityType: u8,
//     pub bcdDescriptorVersion: u8,
//     pub bmAttributes: USB_DEVICE_CAPABILITY_FIRMWARE_STATUS_DESCRIPTOR_0,
// }

// UNSUPPORTED Rust 1414:1: declaration Impl has no candidate rule
// impl Default for USB_DEVICE_CAPABILITY_FIRMWARE_STATUS_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1419:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_DEVICE_CAPABILITY_FIRMWARE_STATUS_DESCRIPTOR_0 {
//     pub AsUlong: u32,
//     pub Anonymous: USB_DEVICE_CAPABILITY_FIRMWARE_STATUS_DESCRIPTOR_0_0,
// }

// UNSUPPORTED Rust 1425:1: declaration Impl has no candidate rule
// impl Default for USB_DEVICE_CAPABILITY_FIRMWARE_STATUS_DESCRIPTOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1430:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_DEVICE_CAPABILITY_FIRMWARE_STATUS_DESCRIPTOR_0_0 {
//     pub _bitfield: u32,
// }

public const val `USB_DEVICE_CAPABILITY_MAX_U1_LATENCY`: UInt = 10u;
public const val `USB_DEVICE_CAPABILITY_MAX_U2_LATENCY`: UInt = 2047u;
public const val `USB_DEVICE_CAPABILITY_PD_CONSUMER_PORT`: UInt = 8u;
// UNSUPPORTED Rust 1438:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_DEVICE_CAPABILITY_PD_CONSUMER_PORT_DESCRIPTOR {
//     pub bLength: u8,
//     pub bDescriptorType: u8,
//     pub bDevCapabilityType: u8,
//     pub bReserved: u8,
//     pub bmCapabilities: USB_DEVICE_CAPABILITY_PD_CONSUMER_PORT_DESCRIPTOR_0,
//     pub wMinVoltage: u16,
//     pub wMaxVoltage: u16,
//     pub wReserved: u16,
//     pub dwMaxOperatingPower: u32,
//     pub dwMaxPeakPower: u32,
//     pub dwMaxPeakPowerTime: u32,
// }

// UNSUPPORTED Rust 1453:1: declaration Impl has no candidate rule
// impl Default for USB_DEVICE_CAPABILITY_PD_CONSUMER_PORT_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1458:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_DEVICE_CAPABILITY_PD_CONSUMER_PORT_DESCRIPTOR_0 {
//     pub AsUshort: u16,
//     pub Anonymous: USB_DEVICE_CAPABILITY_PD_CONSUMER_PORT_DESCRIPTOR_0_0,
// }

// UNSUPPORTED Rust 1464:1: declaration Impl has no candidate rule
// impl Default for USB_DEVICE_CAPABILITY_PD_CONSUMER_PORT_DESCRIPTOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1469:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_DEVICE_CAPABILITY_PD_CONSUMER_PORT_DESCRIPTOR_0_0 {
//     pub _bitfield: u16,
// }

public const val `USB_DEVICE_CAPABILITY_PD_PROVIDER_PORT`: UInt = 9u;
public const val `USB_DEVICE_CAPABILITY_PLATFORM`: UInt = 5u;
// UNSUPPORTED Rust 1476:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_DEVICE_CAPABILITY_PLATFORM_DESCRIPTOR {
//     pub bLength: u8,
//     pub bDescriptorType: u8,
//     pub bDevCapabilityType: u8,
//     pub bReserved: u8,
//     pub PlatformCapabilityUuid: windows_sys::core::GUID,
//     pub CapabililityData: [u8; 1],
// }

// UNSUPPORTED Rust 1486:1: declaration Impl has no candidate rule
// impl Default for USB_DEVICE_CAPABILITY_PLATFORM_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `USB_DEVICE_CAPABILITY_POWER_DELIVERY`: UInt = 6u;
// UNSUPPORTED Rust 1492:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_DEVICE_CAPABILITY_POWER_DELIVERY_DESCRIPTOR {
//     pub bLength: u8,
//     pub bDescriptorType: u8,
//     pub bDevCapabilityType: u8,
//     pub bReserved: u8,
//     pub bmAttributes: USB_DEVICE_CAPABILITY_POWER_DELIVERY_DESCRIPTOR_0,
//     pub bmProviderPorts: u16,
//     pub bmConsumerPorts: u16,
//     pub bcdBCVersion: u16,
//     pub bcdPDVersion: u16,
//     pub bcdUSBTypeCVersion: u16,
// }

// UNSUPPORTED Rust 1506:1: declaration Impl has no candidate rule
// impl Default for USB_DEVICE_CAPABILITY_POWER_DELIVERY_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1511:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_DEVICE_CAPABILITY_POWER_DELIVERY_DESCRIPTOR_0 {
//     pub AsUlong: u32,
//     pub Anonymous: USB_DEVICE_CAPABILITY_POWER_DELIVERY_DESCRIPTOR_0_0,
// }

// UNSUPPORTED Rust 1517:1: declaration Impl has no candidate rule
// impl Default for USB_DEVICE_CAPABILITY_POWER_DELIVERY_DESCRIPTOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1522:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_DEVICE_CAPABILITY_POWER_DELIVERY_DESCRIPTOR_0_0 {
//     pub _bitfield: u32,
// }

public const val `USB_DEVICE_CAPABILITY_PRECISION_TIME_MEASUREMENT`: UInt = 11u;
// UNSUPPORTED Rust 1528:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_SPEED {
//     pub AsUlong32: u32,
//     pub Anonymous: USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_SPEED_0,
// }

// UNSUPPORTED Rust 1534:1: declaration Impl has no candidate rule
// impl Default for USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_SPEED {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1539:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_SPEED_0 {
//     pub _bitfield: u32,
// }

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
// UNSUPPORTED Rust 1555:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR {
//     pub bLength: u8,
//     pub bDescriptorType: u8,
//     pub bDevCapabilityType: u8,
//     pub bReserved: u8,
//     pub bmAttributes: USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_0,
//     pub wFunctionalitySupport: USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_1,
//     pub wReserved: u16,
//     pub bmSublinkSpeedAttr: [USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_SPEED; 1],
// }

// UNSUPPORTED Rust 1567:1: declaration Impl has no candidate rule
// impl Default for USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1572:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_0 {
//     pub AsUlong: u32,
//     pub Anonymous: USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_0_0,
// }

// UNSUPPORTED Rust 1578:1: declaration Impl has no candidate rule
// impl Default for USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1583:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_0_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 1588:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_1 {
//     pub AsUshort: u16,
//     pub Anonymous: USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_1_0,
// }

// UNSUPPORTED Rust 1594:1: declaration Impl has no candidate rule
// impl Default for USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1599:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_DEVICE_CAPABILITY_SUPERSPEEDPLUS_USB_DESCRIPTOR_1_0 {
//     pub _bitfield: u16,
// }

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
// UNSUPPORTED Rust 1614:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_DEVICE_CAPABILITY_SUPERSPEED_USB_DESCRIPTOR {
//     pub bLength: u8,
//     pub bDescriptorType: u8,
//     pub bDevCapabilityType: u8,
//     pub bmAttributes: u8,
//     pub wSpeedsSupported: u16,
//     pub bFunctionalitySupport: u8,
//     pub bU1DevExitLat: u8,
//     pub wU2DevExitLat: u16,
// }

public const val `USB_DEVICE_CAPABILITY_USB20_EXTENSION`: UInt = 2u;
public const val `USB_DEVICE_CAPABILITY_USB20_EXTENSION_BMATTRIBUTES_RESERVED_MASK`: UInt = 4294901985u;
// UNSUPPORTED Rust 1628:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USB_DEVICE_CAPABILITY_USB20_EXTENSION_DESCRIPTOR {
//     pub bLength: u8,
//     pub bDescriptorType: u8,
//     pub bDevCapabilityType: u8,
//     pub bmAttributes: USB_DEVICE_CAPABILITY_USB20_EXTENSION_DESCRIPTOR_0,
// }

// UNSUPPORTED Rust 1636:1: declaration Impl has no candidate rule
// impl Default for USB_DEVICE_CAPABILITY_USB20_EXTENSION_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1641:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_DEVICE_CAPABILITY_USB20_EXTENSION_DESCRIPTOR_0 {
//     pub AsUlong: u32,
//     pub Anonymous: USB_DEVICE_CAPABILITY_USB20_EXTENSION_DESCRIPTOR_0_0,
// }

// UNSUPPORTED Rust 1647:1: declaration Impl has no candidate rule
// impl Default for USB_DEVICE_CAPABILITY_USB20_EXTENSION_DESCRIPTOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1652:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_DEVICE_CAPABILITY_USB20_EXTENSION_DESCRIPTOR_0_0 {
//     pub _bitfield: u32,
// }

public const val `USB_DEVICE_CAPABILITY_WIRELESS_USB`: UInt = 1u;
// UNSUPPORTED Rust 1658:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_DEVICE_CHARACTERISTICS {
//     pub Version: u32,
//     pub Reserved: [u32; 2],
//     pub UsbDeviceCharacteristicsFlags: u32,
//     pub MaximumSendPathDelayInMilliSeconds: u32,
//     pub MaximumCompletionPathDelayInMilliSeconds: u32,
// }

// UNSUPPORTED Rust 1667:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 1697:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_DEVICE_DESCRIPTOR {
//     pub bLength: u8,
//     pub bDescriptorType: u8,
//     pub bcdUSB: u16,
//     pub bDeviceClass: u8,
//     pub bDeviceSubClass: u8,
//     pub bDeviceProtocol: u8,
//     pub bMaxPacketSize0: u8,
//     pub idVendor: u16,
//     pub idProduct: u16,
//     pub bcdDevice: u16,
//     pub iManufacturer: u8,
//     pub iProduct: u8,
//     pub iSerialNumber: u8,
//     pub bNumConfigurations: u8,
// }

public const val `USB_DEVICE_DESCRIPTOR_TYPE`: UInt = 1u;
public const val `USB_DEVICE_FIRMWARE_HASH_LENGTH`: UInt = 32u;
// UNSUPPORTED Rust 1717:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_DEVICE_INFO {
//     pub DeviceState: USB_DEVICE_STATE,
//     pub PortNumber: u16,
//     pub DeviceDescriptor: USB_DEVICE_DESCRIPTOR,
//     pub CurrentConfigurationValue: u8,
//     pub Speed: USB_DEVICE_SPEED,
//     pub DeviceAddress: u16,
//     pub ConnectionIndex: u32,
//     pub ConnectionStatus: USB_CONNECTION_STATUS,
//     pub PnpHardwareId: [u16; 128],
//     pub PnpCompatibleId: [u16; 128],
//     pub SerialNumberId: [u16; 128],
//     pub PnpDeviceDescription: [u16; 128],
//     pub NumberOfOpenPipes: u32,
//     pub PipeList: [USB_PIPE_INFO; 1],
// }

// UNSUPPORTED Rust 1735:1: declaration Impl has no candidate rule
// impl Default for USB_DEVICE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1740:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_DEVICE_NODE_INFO {
//     pub Sig: u32,
//     pub LengthInBytes: u32,
//     pub DeviceDescription: [u16; 40],
//     pub NodeType: USB_WMI_DEVICE_NODE_TYPE,
//     pub BusAddress: USB_TOPOLOGY_ADDRESS,
//     pub Anonymous: USB_DEVICE_NODE_INFO_0,
// }

// UNSUPPORTED Rust 1750:1: declaration Impl has no candidate rule
// impl Default for USB_DEVICE_NODE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1755:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union USB_DEVICE_NODE_INFO_0 {
//     pub UsbDeviceInfo: USB_DEVICE_INFO,
//     pub HubDeviceInfo: USB_HUB_DEVICE_INFO,
//     pub CompositeDeviceInfo: USB_COMPOSITE_DEVICE_INFO,
//     pub ControllerDeviceInfo: USB_CONTROLLER_DEVICE_INFO,
//     pub DeviceInformation: [u8; 4],
// }

// UNSUPPORTED Rust 1764:1: declaration Impl has no candidate rule
// impl Default for USB_DEVICE_NODE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1769:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_DEVICE_PERFORMANCE_INFO {
//     pub BulkBytes: u32,
//     pub ControlDataBytes: u32,
//     pub IsoBytes: u32,
//     pub InterruptBytes: u32,
//     pub BulkUrbCount: u32,
//     pub ControlUrbCount: u32,
//     pub IsoUrbCount: u32,
//     pub InterruptUrbCount: u32,
//     pub AllocedInterrupt: [u32; 6],
//     pub AllocedIso: u32,
//     pub Total32secBandwidth: u32,
//     pub TotalTtBandwidth: u32,
//     pub DeviceDescription: [u16; 60],
//     pub DeviceSpeed: USB_DEVICE_SPEED,
//     pub TotalIsoLatency: u32,
//     pub DroppedIsoPackets: u32,
//     pub TransferErrors: u32,
//     pub PciInterruptCount: u32,
//     pub HcIdleState: u32,
//     pub HcAsyncIdleState: u32,
//     pub HcAsyncCacheFlushCount: u32,
//     pub HcPeriodicIdleState: u32,
//     pub HcPeriodicCacheFlushCount: u32,
// }

// UNSUPPORTED Rust 1796:1: declaration Impl has no candidate rule
// impl Default for USB_DEVICE_PERFORMANCE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1801:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_DEVICE_QUALIFIER_DESCRIPTOR {
//     pub bLength: u8,
//     pub bDescriptorType: u8,
//     pub bcdUSB: u16,
//     pub bDeviceClass: u8,
//     pub bDeviceSubClass: u8,
//     pub bDeviceProtocol: u8,
//     pub bMaxPacketSize0: u8,
//     pub bNumConfigurations: u8,
//     pub bReserved: u8,
// }

public const val `USB_DEVICE_QUALIFIER_DESCRIPTOR_TYPE`: UInt = 6u;
public typealias `USB_DEVICE_SPEED` = Int;
// UNSUPPORTED Rust 1816:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_DEVICE_STATE {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 1821:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_DEVICE_STATUS {
//     pub AsUshort16: u16,
//     pub Anonymous: USB_DEVICE_STATUS_0,
// }

// UNSUPPORTED Rust 1827:1: declaration Impl has no candidate rule
// impl Default for USB_DEVICE_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1832:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_DEVICE_STATUS_0 {
//     pub _bitfield: u16,
// }

public typealias `USB_DEVICE_TYPE` = Int;
public const val `USB_DIAG_IGNORE_HUBS_OFF`: UInt = 263u;
public const val `USB_DIAG_IGNORE_HUBS_ON`: UInt = 262u;
public const val `USB_DISALLOW_FIRMWARE_UPDATE`: UInt = 0u;
// UNSUPPORTED Rust 1841:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_DRIVER_VERSION_PARAMETERS {
//     pub DriverTrackingCode: u32,
//     pub USBDI_Version: u32,
//     pub USBUSER_Version: u32,
//     pub CheckedPortDriver: bool,
//     pub CheckedMiniportDriver: bool,
//     pub USB_Version: u16,
// }

public const val `USB_ENABLE_PORT`: UInt = 5u;
public const val `USB_ENDPOINT_ADDRESS_MASK`: UInt = 15u;
// UNSUPPORTED Rust 1853:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_ENDPOINT_DESCRIPTOR {
//     pub bLength: u8,
//     pub bDescriptorType: u8,
//     pub bEndpointAddress: u8,
//     pub bmAttributes: u8,
//     pub wMaxPacketSize: u16,
//     pub bInterval: u8,
// }

public const val `USB_ENDPOINT_DESCRIPTOR_TYPE`: UInt = 5u;
public const val `USB_ENDPOINT_DIRECTION_MASK`: UInt = 128u;
// UNSUPPORTED Rust 1865:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_ENDPOINT_STATUS {
//     pub AsUshort16: u16,
//     pub Anonymous: USB_ENDPOINT_STATUS_0,
// }

// UNSUPPORTED Rust 1871:1: declaration Impl has no candidate rule
// impl Default for USB_ENDPOINT_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1876:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_ENDPOINT_STATUS_0 {
//     pub _bitfield: u16,
// }

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
// UNSUPPORTED Rust 1920:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_FRAME_NUMBER_AND_QPC_FOR_TIME_SYNC_INFORMATION {
//     pub TimeTrackingHandle: super::super::Foundation::HANDLE,
//     pub InputFrameNumber: u32,
//     pub InputMicroFrameNumber: u32,
//     pub QueryPerformanceCounterAtInputFrameOrMicroFrame: i64,
//     pub QueryPerformanceCounterFrequency: i64,
//     pub PredictedAccuracyInMicroSeconds: u32,
//     pub CurrentGenerationID: u32,
//     pub CurrentQueryPerformanceCounter: i64,
//     pub CurrentHardwareFrameNumber: u32,
//     pub CurrentHardwareMicroFrameNumber: u32,
//     pub CurrentUSBFrameNumber: u32,
// }

// UNSUPPORTED Rust 1935:1: declaration Impl has no candidate rule
// impl Default for USB_FRAME_NUMBER_AND_QPC_FOR_TIME_SYNC_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1940:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union USB_FUNCTION_SUSPEND_OPTIONS {
//     pub AsUchar: u8,
//     pub Anonymous: USB_FUNCTION_SUSPEND_OPTIONS_0,
// }

// UNSUPPORTED Rust 1946:1: declaration Impl has no candidate rule
// impl Default for USB_FUNCTION_SUSPEND_OPTIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1951:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USB_FUNCTION_SUSPEND_OPTIONS_0 {
//     pub _bitfield: u8,
// }

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
// UNSUPPORTED Rust 1991:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_HCD_DRIVERKEY_NAME {
//     pub ActualLength: u32,
//     pub DriverKeyName: [u16; 1],
// }

// UNSUPPORTED Rust 1997:1: declaration Impl has no candidate rule
// impl Default for USB_HCD_DRIVERKEY_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `USB_HC_FEATURE_FLAG_PORT_POWER_SWITCHING`: UInt = 1u;
public const val `USB_HC_FEATURE_FLAG_SEL_SUSPEND`: UInt = 2u;
public const val `USB_HC_FEATURE_LEGACY_BIOS`: UInt = 4u;
public const val `USB_HC_FEATURE_TIME_SYNC_API`: UInt = 8u;
// UNSUPPORTED Rust 2006:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_HIGH_SPEED_MAXPACKET {
//     pub us: u16,
// }

// UNSUPPORTED Rust 2011:1: declaration Impl has no candidate rule
// impl Default for USB_HIGH_SPEED_MAXPACKET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2016:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_HIGH_SPEED_MAXPACKET_0 {
//     pub _bitfield: u16,
// }

// UNSUPPORTED Rust 2021:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union USB_HUB_30_PORT_REMOTE_WAKE_MASK {
//     pub AsUchar8: u8,
//     pub Anonymous: USB_HUB_30_PORT_REMOTE_WAKE_MASK_0,
// }

// UNSUPPORTED Rust 2027:1: declaration Impl has no candidate rule
// impl Default for USB_HUB_30_PORT_REMOTE_WAKE_MASK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2032:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USB_HUB_30_PORT_REMOTE_WAKE_MASK_0 {
//     pub _bitfield: u8,
// }

// UNSUPPORTED Rust 2037:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_HUB_CAPABILITIES {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 2042:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USB_HUB_CAPABILITIES_EX {
//     pub CapabilityFlags: USB_HUB_CAP_FLAGS,
// }

// UNSUPPORTED Rust 2047:1: declaration Impl has no candidate rule
// impl Default for USB_HUB_CAPABILITIES_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2052:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_HUB_CAP_FLAGS {
//     pub ul: u32,
//     pub Anonymous: USB_HUB_CAP_FLAGS_0,
// }

// UNSUPPORTED Rust 2058:1: declaration Impl has no candidate rule
// impl Default for USB_HUB_CAP_FLAGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2063:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_HUB_CAP_FLAGS_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 2068:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_HUB_CHANGE {
//     pub AsUshort16: u16,
//     pub Anonymous: USB_HUB_CHANGE_0,
// }

// UNSUPPORTED Rust 2074:1: declaration Impl has no candidate rule
// impl Default for USB_HUB_CHANGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2079:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_HUB_CHANGE_0 {
//     pub _bitfield: u16,
// }

public const val `USB_HUB_CYCLE_PORT`: UInt = 273u;
// UNSUPPORTED Rust 2085:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_HUB_DESCRIPTOR {
//     pub bDescriptorLength: u8,
//     pub bDescriptorType: u8,
//     pub bNumberOfPorts: u8,
//     pub wHubCharacteristics: u16,
//     pub bPowerOnToPowerGood: u8,
//     pub bHubControlCurrent: u8,
//     pub bRemoveAndPowerMask: [u8; 64],
// }

// UNSUPPORTED Rust 2096:1: declaration Impl has no candidate rule
// impl Default for USB_HUB_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2101:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_HUB_DEVICE_INFO {
//     pub HubDescriptor: USB_HUB_DESCRIPTOR,
//     pub HubNumber: u32,
//     pub DeviceAddress: u16,
//     pub HubIsSelfPowered: bool,
//     pub HubIsRootHub: bool,
//     pub HubCapabilities: USB_HUB_CAPABILITIES,
//     pub NumberOfHubPorts: u32,
//     pub PortInfo: [USB_HUB_PORT_INFORMATION; 1],
// }

// UNSUPPORTED Rust 2113:1: declaration Impl has no candidate rule
// impl Default for USB_HUB_DEVICE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2118:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_HUB_DEVICE_UXD_SETTINGS {
//     pub Version: u32,
//     pub PnpGuid: windows_sys::core::GUID,
//     pub OwnerGuid: windows_sys::core::GUID,
//     pub DeleteOnShutdown: u32,
//     pub DeleteOnReload: u32,
//     pub DeleteOnDisconnect: u32,
//     pub Reserved: [u32; 5],
// }

// UNSUPPORTED Rust 2129:1: declaration Impl has no candidate rule
// impl Default for USB_HUB_DEVICE_UXD_SETTINGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2134:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USB_HUB_INFORMATION {
//     pub HubDescriptor: USB_HUB_DESCRIPTOR,
//     pub HubIsBusPowered: bool,
// }

// UNSUPPORTED Rust 2140:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_HUB_INFORMATION_EX {
//     pub HubType: USB_HUB_TYPE,
//     pub HighestPortNumber: u16,
//     pub u: USB_HUB_INFORMATION_EX_0,
// }

// UNSUPPORTED Rust 2147:1: declaration Impl has no candidate rule
// impl Default for USB_HUB_INFORMATION_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2152:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union USB_HUB_INFORMATION_EX_0 {
//     pub UsbHubDescriptor: USB_HUB_DESCRIPTOR,
//     pub Usb30HubDescriptor: USB_30_HUB_DESCRIPTOR,
// }

// UNSUPPORTED Rust 2158:1: declaration Impl has no candidate rule
// impl Default for USB_HUB_INFORMATION_EX_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2163:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_HUB_NAME {
//     pub ActualLength: u32,
//     pub HubName: [u16; 1],
// }

// UNSUPPORTED Rust 2169:1: declaration Impl has no candidate rule
// impl Default for USB_HUB_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `USB_HUB_NODE` = Int;
// UNSUPPORTED Rust 2175:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_HUB_PORT_INFORMATION {
//     pub DeviceState: USB_DEVICE_STATE,
//     pub PortNumber: u16,
//     pub DeviceAddress: u16,
//     pub ConnectionIndex: u32,
//     pub ConnectionStatus: USB_CONNECTION_STATUS,
// }

// UNSUPPORTED Rust 2184:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_HUB_STATUS {
//     pub AsUshort16: u16,
//     pub Anonymous: USB_HUB_STATUS_0,
// }

// UNSUPPORTED Rust 2190:1: declaration Impl has no candidate rule
// impl Default for USB_HUB_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2195:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_HUB_STATUS_0 {
//     pub _bitfield: u16,
// }

// UNSUPPORTED Rust 2200:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_HUB_STATUS_AND_CHANGE {
//     pub AsUlong32: u32,
//     pub Anonymous: USB_HUB_STATUS_AND_CHANGE_0,
// }

// UNSUPPORTED Rust 2206:1: declaration Impl has no candidate rule
// impl Default for USB_HUB_STATUS_AND_CHANGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2211:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USB_HUB_STATUS_AND_CHANGE_0 {
//     pub HubStatus: USB_HUB_STATUS,
//     pub HubChange: USB_HUB_CHANGE,
// }

// UNSUPPORTED Rust 2217:1: declaration Impl has no candidate rule
// impl Default for USB_HUB_STATUS_AND_CHANGE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `USB_HUB_TYPE` = Int;
public const val `USB_HcGeneric`: `USB_CONTROLLER_FLAVOR` = 0;
// UNSUPPORTED Rust 2224:1: generic scalar type unsupported
// pub type USB_IDLE_CALLBACK = Option<unsafe extern "system" fn(context: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 2225:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USB_IDLE_CALLBACK_INFO {
//     pub IdleCallback: USB_IDLE_CALLBACK,
//     pub IdleContext: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 2231:1: declaration Impl has no candidate rule
// impl Default for USB_IDLE_CALLBACK_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `USB_IDLE_NOTIFICATION`: UInt = 9u;
public const val `USB_IDLE_NOTIFICATION_EX`: UInt = 272u;
// UNSUPPORTED Rust 2238:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_ID_STRING {
//     pub LanguageId: u16,
//     pub Pad: u16,
//     pub LengthInBytes: u32,
//     pub Buffer: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2246:1: declaration Impl has no candidate rule
// impl Default for USB_ID_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2251:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USB_INTERFACE_ASSOCIATION_DESCRIPTOR {
//     pub bLength: u8,
//     pub bDescriptorType: u8,
//     pub bFirstInterface: u8,
//     pub bInterfaceCount: u8,
//     pub bFunctionClass: u8,
//     pub bFunctionSubClass: u8,
//     pub bFunctionProtocol: u8,
//     pub iFunction: u8,
// }

public const val `USB_INTERFACE_ASSOCIATION_DESCRIPTOR_TYPE`: UInt = 11u;
// UNSUPPORTED Rust 2264:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USB_INTERFACE_DESCRIPTOR {
//     pub bLength: u8,
//     pub bDescriptorType: u8,
//     pub bInterfaceNumber: u8,
//     pub bAlternateSetting: u8,
//     pub bNumEndpoints: u8,
//     pub bInterfaceClass: u8,
//     pub bInterfaceSubClass: u8,
//     pub bInterfaceProtocol: u8,
//     pub iInterface: u8,
// }

public const val `USB_INTERFACE_DESCRIPTOR_TYPE`: UInt = 4u;
// UNSUPPORTED Rust 2278:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_INTERFACE_POWER_DESCRIPTOR {
//     pub bLength: u8,
//     pub bDescriptorType: u8,
//     pub bmCapabilitiesFlags: u8,
//     pub bBusPowerSavingD1: u8,
//     pub bSelfPowerSavingD1: u8,
//     pub bBusPowerSavingD2: u8,
//     pub bSelfPowerSavingD2: u8,
//     pub bBusPowerSavingD3: u8,
//     pub bSelfPowerSavingD3: u8,
//     pub TransitionTimeFromD1: u16,
//     pub TransitionTimeFromD2: u16,
//     pub TransitionTimeFromD3: u16,
// }

public const val `USB_INTERFACE_POWER_DESCRIPTOR_TYPE`: UInt = 8u;
// UNSUPPORTED Rust 2295:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_INTERFACE_STATUS {
//     pub AsUshort16: u16,
//     pub Anonymous: USB_INTERFACE_STATUS_0,
// }

// UNSUPPORTED Rust 2301:1: declaration Impl has no candidate rule
// impl Default for USB_INTERFACE_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2306:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_INTERFACE_STATUS_0 {
//     pub _bitfield: u16,
// }

// UNSUPPORTED Rust 2311:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_MI_PARENT_INFORMATION {
//     pub NumberOfInterfaces: u32,
// }

// UNSUPPORTED Rust 2316:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_NODE_CONNECTION_ATTRIBUTES {
//     pub ConnectionIndex: u32,
//     pub ConnectionStatus: USB_CONNECTION_STATUS,
//     pub PortAttributes: u32,
// }

// UNSUPPORTED Rust 2323:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_NODE_CONNECTION_DRIVERKEY_NAME {
//     pub ConnectionIndex: u32,
//     pub ActualLength: u32,
//     pub DriverKeyName: [u16; 1],
// }

// UNSUPPORTED Rust 2330:1: declaration Impl has no candidate rule
// impl Default for USB_NODE_CONNECTION_DRIVERKEY_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2335:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_NODE_CONNECTION_INFORMATION {
//     pub ConnectionIndex: u32,
//     pub DeviceDescriptor: USB_DEVICE_DESCRIPTOR,
//     pub CurrentConfigurationValue: u8,
//     pub LowSpeed: bool,
//     pub DeviceIsHub: bool,
//     pub DeviceAddress: u16,
//     pub NumberOfOpenPipes: u32,
//     pub ConnectionStatus: USB_CONNECTION_STATUS,
//     pub PipeList: [USB_PIPE_INFO; 1],
// }

// UNSUPPORTED Rust 2348:1: declaration Impl has no candidate rule
// impl Default for USB_NODE_CONNECTION_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2353:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_NODE_CONNECTION_INFORMATION_EX {
//     pub ConnectionIndex: u32,
//     pub DeviceDescriptor: USB_DEVICE_DESCRIPTOR,
//     pub CurrentConfigurationValue: u8,
//     pub Speed: u8,
//     pub DeviceIsHub: bool,
//     pub DeviceAddress: u16,
//     pub NumberOfOpenPipes: u32,
//     pub ConnectionStatus: USB_CONNECTION_STATUS,
//     pub PipeList: [USB_PIPE_INFO; 1],
// }

// UNSUPPORTED Rust 2366:1: declaration Impl has no candidate rule
// impl Default for USB_NODE_CONNECTION_INFORMATION_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2371:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_NODE_CONNECTION_INFORMATION_EX_V2 {
//     pub ConnectionIndex: u32,
//     pub Length: u32,
//     pub SupportedUsbProtocols: USB_PROTOCOLS,
//     pub Flags: USB_NODE_CONNECTION_INFORMATION_EX_V2_FLAGS,
// }

// UNSUPPORTED Rust 2379:1: declaration Impl has no candidate rule
// impl Default for USB_NODE_CONNECTION_INFORMATION_EX_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2384:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_NODE_CONNECTION_INFORMATION_EX_V2_FLAGS {
//     pub ul: u32,
//     pub Anonymous: USB_NODE_CONNECTION_INFORMATION_EX_V2_FLAGS_0,
// }

// UNSUPPORTED Rust 2390:1: declaration Impl has no candidate rule
// impl Default for USB_NODE_CONNECTION_INFORMATION_EX_V2_FLAGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2395:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_NODE_CONNECTION_INFORMATION_EX_V2_FLAGS_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 2400:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_NODE_CONNECTION_NAME {
//     pub ConnectionIndex: u32,
//     pub ActualLength: u32,
//     pub NodeName: [u16; 1],
// }

// UNSUPPORTED Rust 2407:1: declaration Impl has no candidate rule
// impl Default for USB_NODE_CONNECTION_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2412:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_NODE_INFORMATION {
//     pub NodeType: USB_HUB_NODE,
//     pub u: USB_NODE_INFORMATION_0,
// }

// UNSUPPORTED Rust 2418:1: declaration Impl has no candidate rule
// impl Default for USB_NODE_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2423:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union USB_NODE_INFORMATION_0 {
//     pub HubInformation: USB_HUB_INFORMATION,
//     pub MiParentInformation: USB_MI_PARENT_INFORMATION,
// }

// UNSUPPORTED Rust 2429:1: declaration Impl has no candidate rule
// impl Default for USB_NODE_INFORMATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2434:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_NOTIFICATION {
//     pub NotificationType: USB_NOTIFICATION_TYPE,
// }

public typealias `USB_NOTIFICATION_TYPE` = Int;
public const val `USB_NOTIFY_ON_TRANSPORT_CHARACTERISTICS_CHANGE`: UInt = 283u;
// UNSUPPORTED Rust 2441:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_OPEN_RAW_DEVICE_PARAMETERS {
//     pub PortStatus: u16,
//     pub MaxPacketEp0: u16,
// }

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
// UNSUPPORTED Rust 2459:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_PASS_THRU_PARAMETERS {
//     pub FunctionGUID: windows_sys::core::GUID,
//     pub ParameterLength: u32,
//     pub Parameters: [u8; 4],
// }

// UNSUPPORTED Rust 2466:1: declaration Impl has no candidate rule
// impl Default for USB_PASS_THRU_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2471:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_PIPE_INFO {
//     pub EndpointDescriptor: USB_ENDPOINT_DESCRIPTOR,
//     pub ScheduleOffset: u32,
// }

public const val `USB_PORTATTR_MINI_CONNECTOR`: UInt = 4u;
public const val `USB_PORTATTR_NO_CONNECTOR`: UInt = 1u;
public const val `USB_PORTATTR_NO_OVERCURRENT_UI`: UInt = 33554432u;
public const val `USB_PORTATTR_OEM_CONNECTOR`: UInt = 8u;
public const val `USB_PORTATTR_OWNED_BY_CC`: UInt = 16777216u;
public const val `USB_PORTATTR_SHARED_USB2`: UInt = 2u;
// UNSUPPORTED Rust 2483:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_PORT_CHANGE {
//     pub AsUshort16: u16,
//     pub Usb20PortChange: USB_20_PORT_CHANGE,
//     pub Usb30PortChange: USB_30_PORT_CHANGE,
// }

// UNSUPPORTED Rust 2490:1: declaration Impl has no candidate rule
// impl Default for USB_PORT_CHANGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2495:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_PORT_CONNECTOR_PROPERTIES {
//     pub ConnectionIndex: u32,
//     pub ActualLength: u32,
//     pub UsbPortProperties: USB_PORT_PROPERTIES,
//     pub CompanionIndex: u16,
//     pub CompanionPortNumber: u16,
//     pub CompanionHubSymbolicLinkName: [u16; 1],
// }

// UNSUPPORTED Rust 2505:1: declaration Impl has no candidate rule
// impl Default for USB_PORT_CONNECTOR_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2510:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_PORT_EXT_STATUS {
//     pub AsUlong32: u32,
//     pub Anonymous: USB_PORT_EXT_STATUS_0,
// }

// UNSUPPORTED Rust 2516:1: declaration Impl has no candidate rule
// impl Default for USB_PORT_EXT_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2521:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_PORT_EXT_STATUS_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 2526:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_PORT_EXT_STATUS_AND_CHANGE {
//     pub AsUlong64: u64,
//     pub Anonymous: USB_PORT_EXT_STATUS_AND_CHANGE_0,
// }

// UNSUPPORTED Rust 2532:1: declaration Impl has no candidate rule
// impl Default for USB_PORT_EXT_STATUS_AND_CHANGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2537:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USB_PORT_EXT_STATUS_AND_CHANGE_0 {
//     pub PortStatusChange: USB_PORT_STATUS_AND_CHANGE,
//     pub PortExtStatus: USB_PORT_EXT_STATUS,
// }

// UNSUPPORTED Rust 2543:1: declaration Impl has no candidate rule
// impl Default for USB_PORT_EXT_STATUS_AND_CHANGE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2548:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_PORT_PROPERTIES {
//     pub ul: u32,
//     pub Anonymous: USB_PORT_PROPERTIES_0,
// }

// UNSUPPORTED Rust 2554:1: declaration Impl has no candidate rule
// impl Default for USB_PORT_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2559:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_PORT_PROPERTIES_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 2564:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_PORT_STATUS {
//     pub AsUshort16: u16,
//     pub Usb20PortStatus: USB_20_PORT_STATUS,
//     pub Usb30PortStatus: USB_30_PORT_STATUS,
// }

// UNSUPPORTED Rust 2571:1: declaration Impl has no candidate rule
// impl Default for USB_PORT_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2576:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_PORT_STATUS_AND_CHANGE {
//     pub AsUlong32: u32,
//     pub Anonymous: USB_PORT_STATUS_AND_CHANGE_0,
// }

// UNSUPPORTED Rust 2582:1: declaration Impl has no candidate rule
// impl Default for USB_PORT_STATUS_AND_CHANGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2587:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USB_PORT_STATUS_AND_CHANGE_0 {
//     pub PortStatus: USB_PORT_STATUS,
//     pub PortChange: USB_PORT_CHANGE,
// }

// UNSUPPORTED Rust 2593:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 2606:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_POWER_INFO {
//     pub SystemState: WDMUSB_POWER_STATE,
//     pub HcDevicePowerState: WDMUSB_POWER_STATE,
//     pub HcDeviceWake: WDMUSB_POWER_STATE,
//     pub HcSystemWake: WDMUSB_POWER_STATE,
//     pub RhDevicePowerState: WDMUSB_POWER_STATE,
//     pub RhDeviceWake: WDMUSB_POWER_STATE,
//     pub RhSystemWake: WDMUSB_POWER_STATE,
//     pub LastSystemSleepState: WDMUSB_POWER_STATE,
//     pub CanWakeup: bool,
//     pub IsPowered: bool,
// }

// UNSUPPORTED Rust 2620:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union USB_PROTOCOLS {
//     pub ul: u32,
//     pub Anonymous: USB_PROTOCOLS_0,
// }

// UNSUPPORTED Rust 2626:1: declaration Impl has no candidate rule
// impl Default for USB_PROTOCOLS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2631:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_PROTOCOLS_0 {
//     pub _bitfield: u32,
// }

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
// UNSUPPORTED Rust 2670:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_ROOT_HUB_NAME {
//     pub ActualLength: u32,
//     pub RootHubName: [u16; 1],
// }

// UNSUPPORTED Rust 2676:1: declaration Impl has no candidate rule
// impl Default for USB_ROOT_HUB_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2681:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_SEND_RAW_COMMAND_PARAMETERS {
//     pub Usb_bmRequest: u8,
//     pub Usb_bRequest: u8,
//     pub Usb_wVlaue: u16,
//     pub Usb_wIndex: u16,
//     pub Usb_wLength: u16,
//     pub DeviceAddress: u16,
//     pub MaximumPacketSize: u16,
//     pub Timeout: u32,
//     pub DataLength: u32,
//     pub UsbdStatusCode: i32,
//     pub Data: [u8; 4],
// }

// UNSUPPORTED Rust 2696:1: declaration Impl has no candidate rule
// impl Default for USB_SEND_RAW_COMMAND_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `USB_START_TRACKING_FOR_TIME_SYNC`: UInt = 285u;
// UNSUPPORTED Rust 2702:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_START_TRACKING_FOR_TIME_SYNC_INFORMATION {
//     pub TimeTrackingHandle: super::super::Foundation::HANDLE,
//     pub IsStartupDelayTolerable: bool,
// }

// UNSUPPORTED Rust 2708:1: declaration Impl has no candidate rule
// impl Default for USB_START_TRACKING_FOR_TIME_SYNC_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `USB_STATUS_EXT_PORT_STATUS`: UInt = 2u;
public const val `USB_STATUS_PD_STATUS`: UInt = 1u;
public const val `USB_STATUS_PORT_STATUS`: UInt = 0u;
public const val `USB_STOP_TRACKING_FOR_TIME_SYNC`: UInt = 287u;
// UNSUPPORTED Rust 2717:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_STOP_TRACKING_FOR_TIME_SYNC_INFORMATION {
//     pub TimeTrackingHandle: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 2722:1: declaration Impl has no candidate rule
// impl Default for USB_STOP_TRACKING_FOR_TIME_SYNC_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2727:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_STRING_DESCRIPTOR {
//     pub bLength: u8,
//     pub bDescriptorType: u8,
//     pub bString: [u16; 1],
// }

// UNSUPPORTED Rust 2734:1: declaration Impl has no candidate rule
// impl Default for USB_STRING_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `USB_STRING_DESCRIPTOR_TYPE`: UInt = 3u;
public const val `USB_SUBMIT_URB`: UInt = 0u;
public const val `USB_SUPERSPEEDPLUS_ISOCHRONOUS_MAX_BYTESPERINTERVAL`: UInt = 16777215u;
public const val `USB_SUPERSPEEDPLUS_ISOCHRONOUS_MIN_BYTESPERINTERVAL`: UInt = 49153u;
// UNSUPPORTED Rust 2743:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_SUPERSPEEDPLUS_ISOCH_ENDPOINT_COMPANION_DESCRIPTOR {
//     pub bLength: u8,
//     pub bDescriptorType: u8,
//     pub wReserved: u16,
//     pub dwBytesPerInterval: u32,
// }

public const val `USB_SUPERSPEEDPLUS_ISOCH_ENDPOINT_COMPANION_DESCRIPTOR_TYPE`: UInt = 49u;
// UNSUPPORTED Rust 2752:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_SUPERSPEED_ENDPOINT_COMPANION_DESCRIPTOR {
//     pub bLength: u8,
//     pub bDescriptorType: u8,
//     pub bMaxBurst: u8,
//     pub bmAttributes: USB_SUPERSPEED_ENDPOINT_COMPANION_DESCRIPTOR_0,
//     pub wBytesPerInterval: u16,
// }

// UNSUPPORTED Rust 2761:1: declaration Impl has no candidate rule
// impl Default for USB_SUPERSPEED_ENDPOINT_COMPANION_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2766:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union USB_SUPERSPEED_ENDPOINT_COMPANION_DESCRIPTOR_0 {
//     pub AsUchar: u8,
//     pub Bulk: USB_SUPERSPEED_ENDPOINT_COMPANION_DESCRIPTOR_0_0,
//     pub Isochronous: USB_SUPERSPEED_ENDPOINT_COMPANION_DESCRIPTOR_0_1,
// }

// UNSUPPORTED Rust 2773:1: declaration Impl has no candidate rule
// impl Default for USB_SUPERSPEED_ENDPOINT_COMPANION_DESCRIPTOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2778:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USB_SUPERSPEED_ENDPOINT_COMPANION_DESCRIPTOR_0_0 {
//     pub _bitfield: u8,
// }

// UNSUPPORTED Rust 2783:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USB_SUPERSPEED_ENDPOINT_COMPANION_DESCRIPTOR_0_1 {
//     pub _bitfield: u8,
// }

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
// UNSUPPORTED Rust 2801:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USB_TOPOLOGY_ADDRESS {
//     pub PciBusNumber: u32,
//     pub PciDeviceNumber: u32,
//     pub PciFunctionNumber: u32,
//     pub Reserved: u32,
//     pub RootHubPortNumber: u16,
//     pub HubPortNumber: [u16; 5],
//     pub Reserved2: u16,
// }

// UNSUPPORTED Rust 2812:1: declaration Impl has no candidate rule
// impl Default for USB_TOPOLOGY_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2817:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_TRANSPORT_CHARACTERISTICS {
//     pub Version: u32,
//     pub TransportCharacteristicsFlags: u32,
//     pub CurrentRoundtripLatencyInMilliSeconds: u64,
//     pub MaxPotentialBandwidth: u64,
// }

public const val `USB_TRANSPORT_CHARACTERISTICS_BANDWIDTH_AVAILABLE`: UInt = 2u;
// UNSUPPORTED Rust 2826:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_TRANSPORT_CHARACTERISTICS_CHANGE_NOTIFICATION {
//     pub Handle: USB_CHANGE_REGISTRATION_HANDLE,
//     pub UsbTransportCharacteristics: USB_TRANSPORT_CHARACTERISTICS,
// }

// UNSUPPORTED Rust 2832:1: declaration Impl has no candidate rule
// impl Default for USB_TRANSPORT_CHARACTERISTICS_CHANGE_NOTIFICATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2837:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_TRANSPORT_CHARACTERISTICS_CHANGE_REGISTRATION {
//     pub ChangeNotificationInputFlags: u32,
//     pub Handle: USB_CHANGE_REGISTRATION_HANDLE,
//     pub UsbTransportCharacteristics: USB_TRANSPORT_CHARACTERISTICS,
// }

// UNSUPPORTED Rust 2844:1: declaration Impl has no candidate rule
// impl Default for USB_TRANSPORT_CHARACTERISTICS_CHANGE_REGISTRATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2849:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_TRANSPORT_CHARACTERISTICS_CHANGE_UNREGISTRATION {
//     pub Handle: USB_CHANGE_REGISTRATION_HANDLE,
// }

// UNSUPPORTED Rust 2854:1: declaration Impl has no candidate rule
// impl Default for USB_TRANSPORT_CHARACTERISTICS_CHANGE_UNREGISTRATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `USB_TRANSPORT_CHARACTERISTICS_LATENCY_AVAILABLE`: UInt = 1u;
public const val `USB_TRANSPORT_CHARACTERISTICS_VERSION_1`: UInt = 1u;
// UNSUPPORTED Rust 2861:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct USB_UNICODE_NAME {
//     pub Length: u32,
//     pub String: [u16; 1],
// }

// UNSUPPORTED Rust 2867:1: declaration Impl has no candidate rule
// impl Default for USB_UNICODE_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `USB_UNREGISTER_COMPOSITE_DEVICE`: UInt = 1u;
public const val `USB_UNREGISTER_FOR_TRANSPORT_CHARACTERISTICS_CHANGE`: UInt = 284u;
// UNSUPPORTED Rust 2874:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct USB_USB2HW_VERSION_PARAMETERS {
//     pub Usb2HwRevision: u8,
// }

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
// UNSUPPORTED Rust 2952:1: non-scalar type Ptr unsupported
// pub type WINUSB_INTERFACE_HANDLE = *mut core::ffi::c_void;

// UNSUPPORTED Rust 2953:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WINUSB_PIPE_INFORMATION {
//     pub PipeType: USBD_PIPE_TYPE,
//     pub PipeId: u8,
//     pub MaximumPacketSize: u16,
//     pub Interval: u8,
// }

// UNSUPPORTED Rust 2961:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WINUSB_PIPE_INFORMATION_EX {
//     pub PipeType: USBD_PIPE_TYPE,
//     pub PipeId: u8,
//     pub MaximumPacketSize: u16,
//     pub Interval: u8,
//     pub MaximumBytesPerInterval: u32,
// }

public typealias `WINUSB_PIPE_POLICY` = UInt;
public typealias `WINUSB_POWER_POLICY` = UInt;
// UNSUPPORTED Rust 2972:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct WINUSB_SETUP_PACKET {
//     pub RequestType: u8,
//     pub Request: u8,
//     pub Value: u16,
//     pub Index: u16,
//     pub Length: u16,
// }

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
// UNSUPPORTED Rust 3001:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WinUSB_TestGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xda812bff_12c3_46a2_8e2b_dbd3b7834c43);

// UNSUPPORTED Rust 3002:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct _URB_BULK_OR_INTERRUPT_TRANSFER {
//     pub Hdr: _URB_HEADER,
//     pub PipeHandle: *mut core::ffi::c_void,
//     pub TransferFlags: u32,
//     pub TransferBufferLength: u32,
//     pub TransferBuffer: *mut core::ffi::c_void,
//     pub TransferBufferMDL: *mut core::ffi::c_void,
//     pub UrbLink: *mut URB,
//     pub hca: _URB_HCD_AREA,
// }

// UNSUPPORTED Rust 3014:1: declaration Impl has no candidate rule
// impl Default for _URB_BULK_OR_INTERRUPT_TRANSFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3019:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct _URB_CONTROL_DESCRIPTOR_REQUEST {
//     pub Hdr: _URB_HEADER,
//     pub Reserved: *mut core::ffi::c_void,
//     pub Reserved0: u32,
//     pub TransferBufferLength: u32,
//     pub TransferBuffer: *mut core::ffi::c_void,
//     pub TransferBufferMDL: *mut core::ffi::c_void,
//     pub UrbLink: *mut URB,
//     pub hca: _URB_HCD_AREA,
//     pub Reserved1: u16,
//     pub Index: u8,
//     pub DescriptorType: u8,
//     pub LanguageId: u16,
//     pub Reserved2: u16,
// }

// UNSUPPORTED Rust 3036:1: declaration Impl has no candidate rule
// impl Default for _URB_CONTROL_DESCRIPTOR_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3041:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct _URB_CONTROL_FEATURE_REQUEST {
//     pub Hdr: _URB_HEADER,
//     pub Reserved: *mut core::ffi::c_void,
//     pub Reserved2: u32,
//     pub Reserved3: u32,
//     pub Reserved4: *mut core::ffi::c_void,
//     pub Reserved5: *mut core::ffi::c_void,
//     pub UrbLink: *mut URB,
//     pub hca: _URB_HCD_AREA,
//     pub Reserved0: u16,
//     pub FeatureSelector: u16,
//     pub Index: u16,
//     pub Reserved1: u16,
// }

// UNSUPPORTED Rust 3057:1: declaration Impl has no candidate rule
// impl Default for _URB_CONTROL_FEATURE_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3062:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct _URB_CONTROL_GET_CONFIGURATION_REQUEST {
//     pub Hdr: _URB_HEADER,
//     pub Reserved: *mut core::ffi::c_void,
//     pub Reserved0: u32,
//     pub TransferBufferLength: u32,
//     pub TransferBuffer: *mut core::ffi::c_void,
//     pub TransferBufferMDL: *mut core::ffi::c_void,
//     pub UrbLink: *mut URB,
//     pub hca: _URB_HCD_AREA,
//     pub Reserved1: [u8; 8],
// }

// UNSUPPORTED Rust 3075:1: declaration Impl has no candidate rule
// impl Default for _URB_CONTROL_GET_CONFIGURATION_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3080:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct _URB_CONTROL_GET_INTERFACE_REQUEST {
//     pub Hdr: _URB_HEADER,
//     pub Reserved: *mut core::ffi::c_void,
//     pub Reserved0: u32,
//     pub TransferBufferLength: u32,
//     pub TransferBuffer: *mut core::ffi::c_void,
//     pub TransferBufferMDL: *mut core::ffi::c_void,
//     pub UrbLink: *mut URB,
//     pub hca: _URB_HCD_AREA,
//     pub Reserved1: [u8; 4],
//     pub Interface: u16,
//     pub Reserved2: u16,
// }

// UNSUPPORTED Rust 3095:1: declaration Impl has no candidate rule
// impl Default for _URB_CONTROL_GET_INTERFACE_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3100:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct _URB_CONTROL_GET_STATUS_REQUEST {
//     pub Hdr: _URB_HEADER,
//     pub Reserved: *mut core::ffi::c_void,
//     pub Reserved0: u32,
//     pub TransferBufferLength: u32,
//     pub TransferBuffer: *mut core::ffi::c_void,
//     pub TransferBufferMDL: *mut core::ffi::c_void,
//     pub UrbLink: *mut URB,
//     pub hca: _URB_HCD_AREA,
//     pub Reserved1: [u8; 4],
//     pub Index: u16,
//     pub Reserved2: u16,
// }

// UNSUPPORTED Rust 3115:1: declaration Impl has no candidate rule
// impl Default for _URB_CONTROL_GET_STATUS_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3120:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct _URB_CONTROL_TRANSFER {
//     pub Hdr: _URB_HEADER,
//     pub PipeHandle: *mut core::ffi::c_void,
//     pub TransferFlags: u32,
//     pub TransferBufferLength: u32,
//     pub TransferBuffer: *mut core::ffi::c_void,
//     pub TransferBufferMDL: *mut core::ffi::c_void,
//     pub UrbLink: *mut URB,
//     pub hca: _URB_HCD_AREA,
//     pub SetupPacket: [u8; 8],
// }

// UNSUPPORTED Rust 3133:1: declaration Impl has no candidate rule
// impl Default for _URB_CONTROL_TRANSFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3138:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct _URB_CONTROL_TRANSFER_EX {
//     pub Hdr: _URB_HEADER,
//     pub PipeHandle: *mut core::ffi::c_void,
//     pub TransferFlags: u32,
//     pub TransferBufferLength: u32,
//     pub TransferBuffer: *mut core::ffi::c_void,
//     pub TransferBufferMDL: *mut core::ffi::c_void,
//     pub Timeout: u32,
//     pub hca: _URB_HCD_AREA,
//     pub SetupPacket: [u8; 8],
// }

// UNSUPPORTED Rust 3151:1: declaration Impl has no candidate rule
// impl Default for _URB_CONTROL_TRANSFER_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3156:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct _URB_CONTROL_VENDOR_OR_CLASS_REQUEST {
//     pub Hdr: _URB_HEADER,
//     pub Reserved: *mut core::ffi::c_void,
//     pub TransferFlags: u32,
//     pub TransferBufferLength: u32,
//     pub TransferBuffer: *mut core::ffi::c_void,
//     pub TransferBufferMDL: *mut core::ffi::c_void,
//     pub UrbLink: *mut URB,
//     pub hca: _URB_HCD_AREA,
//     pub RequestTypeReservedBits: u8,
//     pub Request: u8,
//     pub Value: u16,
//     pub Index: u16,
//     pub Reserved1: u16,
// }

// UNSUPPORTED Rust 3173:1: declaration Impl has no candidate rule
// impl Default for _URB_CONTROL_VENDOR_OR_CLASS_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3178:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct _URB_FRAME_LENGTH_CONTROL {
//     pub Hdr: _URB_HEADER,
// }

// UNSUPPORTED Rust 3183:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct _URB_GET_CURRENT_FRAME_NUMBER {
//     pub Hdr: _URB_HEADER,
//     pub FrameNumber: u32,
// }

// UNSUPPORTED Rust 3189:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct _URB_GET_FRAME_LENGTH {
//     pub Hdr: _URB_HEADER,
//     pub FrameLength: u32,
//     pub FrameNumber: u32,
// }

// UNSUPPORTED Rust 3196:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct _URB_GET_ISOCH_PIPE_TRANSFER_PATH_DELAYS {
//     pub Hdr: _URB_HEADER,
//     pub PipeHandle: *mut core::ffi::c_void,
//     pub MaximumSendPathDelayInMilliSeconds: u32,
//     pub MaximumCompletionPathDelayInMilliSeconds: u32,
// }

// UNSUPPORTED Rust 3204:1: declaration Impl has no candidate rule
// impl Default for _URB_GET_ISOCH_PIPE_TRANSFER_PATH_DELAYS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3209:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct _URB_HCD_AREA {
//     pub Reserved8: [*mut core::ffi::c_void; 8],
// }

// UNSUPPORTED Rust 3214:1: declaration Impl has no candidate rule
// impl Default for _URB_HCD_AREA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3219:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct _URB_HEADER {
//     pub Length: u16,
//     pub Function: u16,
//     pub Status: i32,
//     pub UsbdDeviceHandle: *mut core::ffi::c_void,
//     pub UsbdFlags: u32,
// }

// UNSUPPORTED Rust 3228:1: declaration Impl has no candidate rule
// impl Default for _URB_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3233:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct _URB_ISOCH_TRANSFER {
//     pub Hdr: _URB_HEADER,
//     pub PipeHandle: *mut core::ffi::c_void,
//     pub TransferFlags: u32,
//     pub TransferBufferLength: u32,
//     pub TransferBuffer: *mut core::ffi::c_void,
//     pub TransferBufferMDL: *mut core::ffi::c_void,
//     pub UrbLink: *mut URB,
//     pub hca: _URB_HCD_AREA,
//     pub StartFrame: u32,
//     pub NumberOfPackets: u32,
//     pub ErrorCount: u32,
//     pub IsoPacket: [USBD_ISO_PACKET_DESCRIPTOR; 1],
// }

// UNSUPPORTED Rust 3249:1: declaration Impl has no candidate rule
// impl Default for _URB_ISOCH_TRANSFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3254:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct _URB_OPEN_STATIC_STREAMS {
//     pub Hdr: _URB_HEADER,
//     pub PipeHandle: *mut core::ffi::c_void,
//     pub NumberOfStreams: u32,
//     pub StreamInfoVersion: u16,
//     pub StreamInfoSize: u16,
//     pub Streams: *mut USBD_STREAM_INFORMATION,
// }

// UNSUPPORTED Rust 3264:1: declaration Impl has no candidate rule
// impl Default for _URB_OPEN_STATIC_STREAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3269:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct _URB_OS_FEATURE_DESCRIPTOR_REQUEST {
//     pub Hdr: _URB_HEADER,
//     pub Reserved: *mut core::ffi::c_void,
//     pub Reserved0: u32,
//     pub TransferBufferLength: u32,
//     pub TransferBuffer: *mut core::ffi::c_void,
//     pub TransferBufferMDL: *mut core::ffi::c_void,
//     pub UrbLink: *mut URB,
//     pub hca: _URB_HCD_AREA,
//     pub _bitfield: u8,
//     pub Reserved2: u8,
//     pub InterfaceNumber: u8,
//     pub MS_PageIndex: u8,
//     pub MS_FeatureDescriptorIndex: u16,
//     pub Reserved3: u16,
// }

// UNSUPPORTED Rust 3287:1: declaration Impl has no candidate rule
// impl Default for _URB_OS_FEATURE_DESCRIPTOR_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3292:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct _URB_PIPE_REQUEST {
//     pub Hdr: _URB_HEADER,
//     pub PipeHandle: *mut core::ffi::c_void,
//     pub Reserved: u32,
// }

// UNSUPPORTED Rust 3299:1: declaration Impl has no candidate rule
// impl Default for _URB_PIPE_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3304:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct _URB_SELECT_CONFIGURATION {
//     pub Hdr: _URB_HEADER,
//     pub ConfigurationDescriptor: *mut USB_CONFIGURATION_DESCRIPTOR,
//     pub ConfigurationHandle: *mut core::ffi::c_void,
//     pub Interface: USBD_INTERFACE_INFORMATION,
// }

// UNSUPPORTED Rust 3312:1: declaration Impl has no candidate rule
// impl Default for _URB_SELECT_CONFIGURATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3317:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct _URB_SELECT_INTERFACE {
//     pub Hdr: _URB_HEADER,
//     pub ConfigurationHandle: *mut core::ffi::c_void,
//     pub Interface: USBD_INTERFACE_INFORMATION,
// }

// UNSUPPORTED Rust 3324:1: declaration Impl has no candidate rule
// impl Default for _URB_SELECT_INTERFACE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3329:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct _URB_SET_FRAME_LENGTH {
//     pub Hdr: _URB_HEADER,
//     pub FrameLengthDelta: i32,
// }

