// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("vhfum.dll" "system" fn VhfAsyncOperationComplete(vhfoperationhandle : *const core::ffi::c_void, completionstatus : super::super::super::Win32::Foundation:: NTSTATUS) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("vhfum.dll" "system" fn VhfCreate(vhfconfig : *const VHF_CONFIG, vhfhandle : *mut *mut core::ffi::c_void) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("vhfum.dll" "system" fn VhfDelete(vhfhandle : *const core::ffi::c_void, wait : bool));

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("vhfum.dll" "system" fn VhfReadReportSubmit(vhfhandle : *const core::ffi::c_void, hidtransferpacket : *const HID_XFER_PACKET) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("vhfum.dll" "system" fn VhfStart(vhfhandle : *const core::ffi::c_void) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 6:1: generic scalar type unsupported
// pub type EVT_VHF_ASYNC_OPERATION = Option<unsafe extern "system" fn(vhfclientcontext: *const core::ffi::c_void, vhfoperationhandle: *const core::ffi::c_void, vhfoperationcontext: *const core::ffi::c_void, hidtransferpacket: *const HID_XFER_PACKET)>;

// UNSUPPORTED Rust 7:1: generic scalar type unsupported
// pub type EVT_VHF_CLEANUP = Option<unsafe extern "system" fn(vhfclientcontext: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 8:1: generic scalar type unsupported
// pub type EVT_VHF_READY_FOR_NEXT_READ_REPORT = Option<unsafe extern "system" fn(vhfclientcontext: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 9:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HID_XFER_PACKET {
//     pub reportBuffer: *mut u8,
//     pub reportBufferLen: u32,
//     pub reportId: u8,
// }

// UNSUPPORTED Rust 16:1: declaration Impl has no candidate rule
// impl Default for HID_XFER_PACKET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 21:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VHF_CONFIG {
//     pub Size: u32,
//     pub VhfClientContext: *mut core::ffi::c_void,
//     pub OperationContextSize: u32,
//     pub FileHandle: super::super::super::Win32::Foundation::HANDLE,
//     pub VendorID: u16,
//     pub ProductID: u16,
//     pub VersionNumber: u16,
//     pub ContainerID: windows_sys::core::GUID,
//     pub InstanceIDLength: u16,
//     pub InstanceID: windows_sys::core::PWSTR,
//     pub ReportDescriptorLength: u16,
//     pub ReportDescriptor: *mut u8,
//     pub EvtVhfReadyForNextReadReport: EVT_VHF_READY_FOR_NEXT_READ_REPORT,
//     pub EvtVhfAsyncOperationGetFeature: EVT_VHF_ASYNC_OPERATION,
//     pub EvtVhfAsyncOperationSetFeature: EVT_VHF_ASYNC_OPERATION,
//     pub EvtVhfAsyncOperationWriteReport: EVT_VHF_ASYNC_OPERATION,
//     pub EvtVhfAsyncOperationGetInputReport: EVT_VHF_ASYNC_OPERATION,
//     pub EvtVhfCleanup: EVT_VHF_CLEANUP,
//     pub HardwareIDsLength: u16,
//     pub HardwareIDs: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 45:1: declaration Impl has no candidate rule
// impl Default for VHF_CONFIG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

