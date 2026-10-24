// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsAddResourceToOperation(operation : HCS_OPERATION, r#type : HCS_RESOURCE_TYPE, uri : windows_sys::core::PCWSTR, handle : super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("computestorage.dll" "system" fn HcsAttachLayerStorageFilter(layerpath : windows_sys::core::PCWSTR, layerdata : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsCancelOperation(operation : HCS_OPERATION) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsCloseComputeSystem(computesystem : HCS_SYSTEM));

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsCloseOperation(operation : HCS_OPERATION));

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsCloseProcess(process : HCS_PROCESS));

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsCrashComputeSystem(computesystem : HCS_SYSTEM, operation : HCS_OPERATION, options : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("computecore.dll" "system" fn HcsCreateComputeSystem(id : windows_sys::core::PCWSTR, configuration : windows_sys::core::PCWSTR, operation : HCS_OPERATION, securitydescriptor : *const super::super::Security:: SECURITY_DESCRIPTOR, computesystem : *mut HCS_SYSTEM) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsCreateComputeSystemInNamespace(idnamespace : windows_sys::core::PCWSTR, id : windows_sys::core::PCWSTR, configuration : windows_sys::core::PCWSTR, operation : HCS_OPERATION, options : *const HCS_CREATE_OPTIONS, computesystem : *mut HCS_SYSTEM) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsCreateEmptyGuestStateFile(gueststatefilepath : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsCreateEmptyRuntimeStateFile(runtimestatefilepath : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsCreateOperation(context : *const core::ffi::c_void, callback : HCS_OPERATION_COMPLETION) -> HCS_OPERATION);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsCreateOperationWithNotifications(eventtypes : HCS_OPERATION_OPTIONS, context : *const core::ffi::c_void, callback : HCS_EVENT_CALLBACK) -> HCS_OPERATION);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("computecore.dll" "system" fn HcsCreateProcess(computesystem : HCS_SYSTEM, processparameters : windows_sys::core::PCWSTR, operation : HCS_OPERATION, securitydescriptor : *const super::super::Security:: SECURITY_DESCRIPTOR, process : *mut HCS_PROCESS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("computestorage.dll" "system" fn HcsDestroyLayer(layerpath : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("computestorage.dll" "system" fn HcsDetachLayerStorageFilter(layerpath : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsEnumerateComputeSystems(query : windows_sys::core::PCWSTR, operation : HCS_OPERATION) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsEnumerateComputeSystemsInNamespace(idnamespace : windows_sys::core::PCWSTR, query : windows_sys::core::PCWSTR, operation : HCS_OPERATION) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("computestorage.dll" "system" fn HcsExportLayer(layerpath : windows_sys::core::PCWSTR, exportfolderpath : windows_sys::core::PCWSTR, layerdata : windows_sys::core::PCWSTR, options : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("computestorage.dll" "system" fn HcsExportLegacyWritableLayer(writablelayermountpath : windows_sys::core::PCWSTR, writablelayerfolderpath : windows_sys::core::PCWSTR, exportfolderpath : windows_sys::core::PCWSTR, layerdata : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("computestorage.dll" "system" fn HcsFormatWritableLayerVhd(vhdhandle : super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsGetComputeSystemFromOperation(operation : HCS_OPERATION) -> HCS_SYSTEM);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsGetComputeSystemProperties(computesystem : HCS_SYSTEM, operation : HCS_OPERATION, propertyquery : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("computestorage.dll" "system" fn HcsGetLayerVhdMountPath(vhdhandle : super::super::Foundation:: HANDLE, mountpath : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsGetOperationContext(operation : HCS_OPERATION) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsGetOperationId(operation : HCS_OPERATION) -> u64);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsGetOperationResult(operation : HCS_OPERATION, resultdocument : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsGetOperationResultAndProcessInfo(operation : HCS_OPERATION, processinformation : *mut HCS_PROCESS_INFORMATION, resultdocument : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsGetOperationType(operation : HCS_OPERATION) -> HCS_OPERATION_TYPE);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsGetProcessFromOperation(operation : HCS_OPERATION) -> HCS_PROCESS);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsGetProcessInfo(process : HCS_PROCESS, operation : HCS_OPERATION) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsGetProcessProperties(process : HCS_PROCESS, operation : HCS_OPERATION, propertyquery : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsGetProcessorCompatibilityFromSavedState(runtimefilename : windows_sys::core::PCWSTR, processorfeaturesstring : *mut windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsGetServiceProperties(propertyquery : windows_sys::core::PCWSTR, result : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsGrantVmAccess(vmid : windows_sys::core::PCWSTR, filepath : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsGrantVmGroupAccess(filepath : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("computestorage.dll" "system" fn HcsImportLayer(layerpath : windows_sys::core::PCWSTR, sourcefolderpath : windows_sys::core::PCWSTR, layerdata : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("computestorage.dll" "system" fn HcsInitializeLegacyWritableLayer(writablelayermountpath : windows_sys::core::PCWSTR, writablelayerfolderpath : windows_sys::core::PCWSTR, layerdata : windows_sys::core::PCWSTR, options : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("computestorage.dll" "system" fn HcsInitializeWritableLayer(writablelayerpath : windows_sys::core::PCWSTR, layerdata : windows_sys::core::PCWSTR, options : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsModifyComputeSystem(computesystem : HCS_SYSTEM, operation : HCS_OPERATION, configuration : windows_sys::core::PCWSTR, identity : super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsModifyProcess(process : HCS_PROCESS, operation : HCS_OPERATION, settings : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsModifyServiceSettings(settings : windows_sys::core::PCWSTR, result : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsOpenComputeSystem(id : windows_sys::core::PCWSTR, requestedaccess : u32, computesystem : *mut HCS_SYSTEM) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsOpenComputeSystemInNamespace(idnamespace : windows_sys::core::PCWSTR, id : windows_sys::core::PCWSTR, requestedaccess : u32, computesystem : *mut HCS_SYSTEM) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsOpenProcess(computesystem : HCS_SYSTEM, processid : u32, requestedaccess : u32, process : *mut HCS_PROCESS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsPauseComputeSystem(computesystem : HCS_SYSTEM, operation : HCS_OPERATION, options : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsResumeComputeSystem(computesystem : HCS_SYSTEM, operation : HCS_OPERATION, options : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsRevokeVmAccess(vmid : windows_sys::core::PCWSTR, filepath : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsRevokeVmGroupAccess(filepath : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsSaveComputeSystem(computesystem : HCS_SYSTEM, operation : HCS_OPERATION, options : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsSetComputeSystemCallback(computesystem : HCS_SYSTEM, callbackoptions : HCS_EVENT_OPTIONS, context : *const core::ffi::c_void, callback : HCS_EVENT_CALLBACK) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsSetOperationCallback(operation : HCS_OPERATION, context : *const core::ffi::c_void, callback : HCS_OPERATION_COMPLETION) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsSetOperationContext(operation : HCS_OPERATION, context : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsSetProcessCallback(process : HCS_PROCESS, callbackoptions : HCS_EVENT_OPTIONS, context : *const core::ffi::c_void, callback : HCS_EVENT_CALLBACK) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("computestorage.dll" "system" fn HcsSetupBaseOSLayer(layerpath : windows_sys::core::PCWSTR, vhdhandle : super::super::Foundation:: HANDLE, options : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("computestorage.dll" "system" fn HcsSetupBaseOSVolume(layerpath : windows_sys::core::PCWSTR, volumepath : windows_sys::core::PCWSTR, options : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsShutDownComputeSystem(computesystem : HCS_SYSTEM, operation : HCS_OPERATION, options : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsSignalProcess(process : HCS_PROCESS, operation : HCS_OPERATION, options : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsStartComputeSystem(computesystem : HCS_SYSTEM, operation : HCS_OPERATION, options : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsSubmitWerReport(settings : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsTerminateComputeSystem(computesystem : HCS_SYSTEM, operation : HCS_OPERATION, options : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsTerminateProcess(process : HCS_PROCESS, operation : HCS_OPERATION, options : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsWaitForComputeSystemExit(computesystem : HCS_SYSTEM, timeoutms : u32, result : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsWaitForOperationResult(operation : HCS_OPERATION, timeoutms : u32, resultdocument : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsWaitForOperationResultAndProcessInfo(operation : HCS_OPERATION, timeoutms : u32, processinformation : *mut HCS_PROCESS_INFORMATION, resultdocument : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("computecore.dll" "system" fn HcsWaitForProcessExit(computesystem : HCS_PROCESS, timeoutms : u32, result : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

public typealias `HCS_CREATE_OPTIONS` = Int;
// UNSUPPORTED Rust 70:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct HCS_CREATE_OPTIONS_1 {
//     pub Version: HCS_CREATE_OPTIONS,
//     pub UserToken: super::super::Foundation::HANDLE,
//     pub SecurityDescriptor: *mut super::super::Security::SECURITY_DESCRIPTOR,
//     pub CallbackOptions: HCS_EVENT_OPTIONS,
//     pub CallbackContext: *mut core::ffi::c_void,
//     pub Callback: HCS_EVENT_CALLBACK,
// }

// UNSUPPORTED Rust 81:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for HCS_CREATE_OPTIONS_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 87:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HCS_EVENT {
//     pub Type: HCS_EVENT_TYPE,
//     pub EventData: windows_sys::core::PCWSTR,
//     pub Operation: HCS_OPERATION,
// }

// UNSUPPORTED Rust 94:1: declaration Impl has no candidate rule
// impl Default for HCS_EVENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 99:1: generic scalar type unsupported
// pub type HCS_EVENT_CALLBACK = Option<unsafe extern "system" fn(event: *const HCS_EVENT, context: *const core::ffi::c_void)>;

public typealias `HCS_EVENT_OPTIONS` = Int;
public typealias `HCS_EVENT_TYPE` = Int;
public typealias `HCS_NOTIFICATIONS` = Int;
// UNSUPPORTED Rust 103:1: generic scalar type unsupported
// pub type HCS_NOTIFICATION_CALLBACK = Option<unsafe extern "system" fn(notificationtype: u32, context: *const core::ffi::c_void, notificationstatus: windows_sys::core::HRESULT, notificationdata: windows_sys::core::PCWSTR)>;

public typealias `HCS_NOTIFICATION_FLAGS` = Int;
// UNSUPPORTED Rust 105:1: non-scalar type Ptr unsupported
// pub type HCS_OPERATION = *mut core::ffi::c_void;

// UNSUPPORTED Rust 106:1: generic scalar type unsupported
// pub type HCS_OPERATION_COMPLETION = Option<unsafe extern "system" fn(operation: HCS_OPERATION, context: *const core::ffi::c_void)>;

public typealias `HCS_OPERATION_OPTIONS` = Int;
public typealias `HCS_OPERATION_TYPE` = Int;
// UNSUPPORTED Rust 109:1: non-scalar type Ptr unsupported
// pub type HCS_PROCESS = *mut core::ffi::c_void;

// UNSUPPORTED Rust 110:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HCS_PROCESS_INFORMATION {
//     pub ProcessId: u32,
//     pub Reserved: u32,
//     pub StdInput: super::super::Foundation::HANDLE,
//     pub StdOutput: super::super::Foundation::HANDLE,
//     pub StdError: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 119:1: declaration Impl has no candidate rule
// impl Default for HCS_PROCESS_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HCS_RESOURCE_TYPE` = Int;
// UNSUPPORTED Rust 125:1: non-scalar type Ptr unsupported
// pub type HCS_SYSTEM = *mut core::ffi::c_void;

public const val `HcsCreateOptions_1`: `HCS_CREATE_OPTIONS` = 65536;
public const val `HcsEventGroupOperationInfo`: `HCS_EVENT_TYPE` = -1073741823;
public const val `HcsEventGroupVmLifecycle`: `HCS_EVENT_TYPE` = -2147483646;
public const val `HcsEventInvalid`: `HCS_EVENT_TYPE` = 0;
public const val `HcsEventOperationCallback`: `HCS_EVENT_TYPE` = 16777216;
public const val `HcsEventOptionEnableOperationCallbacks`: `HCS_EVENT_OPTIONS` = 1;
public const val `HcsEventOptionEnableVmLifecycle`: `HCS_EVENT_OPTIONS` = 2;
public const val `HcsEventOptionNone`: `HCS_EVENT_OPTIONS` = 0;
public const val `HcsEventProcessExited`: `HCS_EVENT_TYPE` = 65536;
public const val `HcsEventServiceDisconnect`: `HCS_EVENT_TYPE` = 33554432;
public const val `HcsEventSystemCrashInitiated`: `HCS_EVENT_TYPE` = 2;
public const val `HcsEventSystemCrashReport`: `HCS_EVENT_TYPE` = 3;
public const val `HcsEventSystemExited`: `HCS_EVENT_TYPE` = 1;
public const val `HcsEventSystemGuestConnectionClosed`: `HCS_EVENT_TYPE` = 6;
public const val `HcsEventSystemRdpEnhancedModeStateChanged`: `HCS_EVENT_TYPE` = 4;
public const val `HcsEventSystemSiloJobCreated`: `HCS_EVENT_TYPE` = 5;
public const val `HcsNotificationFlagFailure`: `HCS_NOTIFICATION_FLAGS` = -2147483648;
public const val `HcsNotificationFlagSuccess`: `HCS_NOTIFICATION_FLAGS` = 0;
public const val `HcsNotificationFlagsReserved`: `HCS_NOTIFICATIONS` = -268435456;
public const val `HcsNotificationInvalid`: `HCS_NOTIFICATIONS` = 0;
public const val `HcsNotificationOperationProgressUpdate`: `HCS_NOTIFICATIONS` = 256;
public const val `HcsNotificationProcessExited`: `HCS_NOTIFICATIONS` = 65536;
public const val `HcsNotificationServiceDisconnect`: `HCS_NOTIFICATIONS` = 16777216;
public const val `HcsNotificationSystemCrashInitiated`: `HCS_NOTIFICATIONS` = 13;
public const val `HcsNotificationSystemCrashReport`: `HCS_NOTIFICATIONS` = 6;
public const val `HcsNotificationSystemCreateCompleted`: `HCS_NOTIFICATIONS` = 2;
public const val `HcsNotificationSystemExited`: `HCS_NOTIFICATIONS` = 1;
public const val `HcsNotificationSystemGetPropertiesCompleted`: `HCS_NOTIFICATIONS` = 11;
public const val `HcsNotificationSystemGuestConnectionClosed`: `HCS_NOTIFICATIONS` = 14;
public const val `HcsNotificationSystemModifyCompleted`: `HCS_NOTIFICATIONS` = 12;
public const val `HcsNotificationSystemOperationCompletion`: `HCS_NOTIFICATIONS` = 15;
public const val `HcsNotificationSystemPassThru`: `HCS_NOTIFICATIONS` = 16;
public const val `HcsNotificationSystemPauseCompleted`: `HCS_NOTIFICATIONS` = 4;
public const val `HcsNotificationSystemRdpEnhancedModeStateChanged`: `HCS_NOTIFICATIONS` = 9;
public const val `HcsNotificationSystemResumeCompleted`: `HCS_NOTIFICATIONS` = 5;
public const val `HcsNotificationSystemSaveCompleted`: `HCS_NOTIFICATIONS` = 8;
public const val `HcsNotificationSystemShutdownCompleted`: `HCS_NOTIFICATIONS` = 10;
public const val `HcsNotificationSystemShutdownFailed`: `HCS_NOTIFICATIONS` = 10;
public const val `HcsNotificationSystemSiloJobCreated`: `HCS_NOTIFICATIONS` = 7;
public const val `HcsNotificationSystemStartCompleted`: `HCS_NOTIFICATIONS` = 3;
public const val `HcsOperationOptionNone`: `HCS_OPERATION_OPTIONS` = 0;
public const val `HcsOperationOptionProgressUpdate`: `HCS_OPERATION_OPTIONS` = 1;
public const val `HcsOperationTypeCrash`: `HCS_OPERATION_TYPE` = 15;
public const val `HcsOperationTypeCreate`: `HCS_OPERATION_TYPE` = 1;
public const val `HcsOperationTypeCreateProcess`: `HCS_OPERATION_TYPE` = 10;
public const val `HcsOperationTypeEnumerate`: `HCS_OPERATION_TYPE` = 0;
public const val `HcsOperationTypeGetProcessInfo`: `HCS_OPERATION_TYPE` = 12;
public const val `HcsOperationTypeGetProcessProperties`: `HCS_OPERATION_TYPE` = 13;
public const val `HcsOperationTypeGetProperties`: `HCS_OPERATION_TYPE` = 9;
public const val `HcsOperationTypeModify`: `HCS_OPERATION_TYPE` = 8;
public const val `HcsOperationTypeModifyProcess`: `HCS_OPERATION_TYPE` = 14;
public const val `HcsOperationTypeNone`: `HCS_OPERATION_TYPE` = -1;
public const val `HcsOperationTypePause`: `HCS_OPERATION_TYPE` = 4;
public const val `HcsOperationTypeResume`: `HCS_OPERATION_TYPE` = 5;
public const val `HcsOperationTypeSave`: `HCS_OPERATION_TYPE` = 6;
public const val `HcsOperationTypeShutdown`: `HCS_OPERATION_TYPE` = 3;
public const val `HcsOperationTypeSignalProcess`: `HCS_OPERATION_TYPE` = 11;
public const val `HcsOperationTypeStart`: `HCS_OPERATION_TYPE` = 2;
public const val `HcsOperationTypeTerminate`: `HCS_OPERATION_TYPE` = 7;
public const val `HcsResourceTypeFile`: `HCS_RESOURCE_TYPE` = 1;
public const val `HcsResourceTypeJob`: `HCS_RESOURCE_TYPE` = 2;
public const val `HcsResourceTypeNone`: `HCS_RESOURCE_TYPE` = 0;
