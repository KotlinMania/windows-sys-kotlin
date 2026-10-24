// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltAcknowledgeEcp(filter : PFLT_FILTER, ecpcontext : *const core::ffi::c_void));

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltAcquirePushLockExclusive(pushlock : *mut usize));

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltAcquirePushLockExclusiveEx(pushlock : *mut usize, flags : u32));

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltAcquirePushLockShared(pushlock : *mut usize));

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltAcquirePushLockSharedEx(pushlock : *mut usize, flags : u32));

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("fltmgr.sys" "system" fn FltAcquireResourceExclusive(resource : *mut super::super::super::Foundation:: ERESOURCE));

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("fltmgr.sys" "system" fn FltAcquireResourceShared(resource : *mut super::super::super::Foundation:: ERESOURCE));

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltAddOpenReparseEntry(filter : PFLT_FILTER, data : *const FLT_CALLBACK_DATA, openreparseentry : *const super:: OPEN_REPARSE_LIST_ENTRY) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltAdjustDeviceStackSizeForIoRedirection(sourceinstance : PFLT_INSTANCE, targetinstance : PFLT_INSTANCE, sourcedevicestacksizemodified : *mut bool) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltAllocateCallbackData(instance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, retnewcallbackdata : *mut *mut FLT_CALLBACK_DATA) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltAllocateCallbackDataEx(instance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, flags : u32, retnewcallbackdata : *mut *mut FLT_CALLBACK_DATA) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("fltmgr.sys" "system" fn FltAllocateContext(filter : PFLT_FILTER, contexttype : u16, contextsize : usize, pooltype : super::super::super::Foundation:: POOL_TYPE, returnedcontext : *mut PFLT_CONTEXT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltAllocateDeferredIoWorkItem() -> PFLT_DEFERRED_IO_WORKITEM);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltAllocateExtraCreateParameter(filter : PFLT_FILTER, ecptype : *const windows_sys::core::GUID, sizeofcontext : u32, flags : u32, cleanupcallback : super:: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, pooltag : u32, ecpcontext : *mut *mut core::ffi::c_void) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltAllocateExtraCreateParameterFromLookasideList(filter : PFLT_FILTER, ecptype : *const windows_sys::core::GUID, sizeofcontext : u32, flags : u32, cleanupcallback : super:: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, lookasidelist : *mut core::ffi::c_void, ecpcontext : *mut *mut core::ffi::c_void) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("fltmgr.sys" "system" fn FltAllocateExtraCreateParameterList(filter : PFLT_FILTER, flags : u32, ecplist : *mut *mut super::super::super::Foundation:: ECP_LIST) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltAllocateFileLock(completelockcallbackdataroutine : PFLT_COMPLETE_LOCK_CALLBACK_DATA_ROUTINE, unlockroutine : super:: PUNLOCK_ROUTINE) -> *mut super:: FILE_LOCK);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltAllocateGenericWorkItem() -> PFLT_GENERIC_WORKITEM);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("fltmgr.sys" "system" fn FltAllocatePoolAlignedWithTag(instance : PFLT_INSTANCE, pooltype : super::super::super::Foundation:: POOL_TYPE, numberofbytes : usize, tag : u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("fltmgr.sys" "system" fn FltApplyPriorityInfoThread(inputpriorityinfo : *const super:: IO_PRIORITY_INFO, outputpriorityinfo : *mut super:: IO_PRIORITY_INFO, thread : super::super::super::Foundation:: PETHREAD) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltAttachVolume(filter : PFLT_FILTER, volume : PFLT_VOLUME, instancename : *const super::super::super::super::Win32::Foundation:: UNICODE_STRING, retinstance : *mut PFLT_INSTANCE) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltAttachVolumeAtAltitude(filter : PFLT_FILTER, volume : PFLT_VOLUME, altitude : *const super::super::super::super::Win32::Foundation:: UNICODE_STRING, instancename : *const super::super::super::super::Win32::Foundation:: UNICODE_STRING, retinstance : *mut PFLT_INSTANCE) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fltmgr.sys" "system" fn FltBuildDefaultSecurityDescriptor(securitydescriptor : *mut super::super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, desiredaccess : u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltCancelFileOpen(instance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT));

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltCancelIo(callbackdata : *const FLT_CALLBACK_DATA) -> bool);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltCancellableWaitForMultipleObjects(count : u32, objectarray : *const *const core::ffi::c_void, waittype : super::super::super::super::Win32::System::Kernel:: WAIT_TYPE, timeout : *const i64, waitblockarray : *const super::super::super::Foundation:: KWAIT_BLOCK, callbackdata : *const FLT_CALLBACK_DATA) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltCancellableWaitForSingleObject(object : *const core::ffi::c_void, timeout : *const i64, callbackdata : *const FLT_CALLBACK_DATA) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltCbdqDisable(cbdq : *mut FLT_CALLBACK_DATA_QUEUE));

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltCbdqEnable(cbdq : *mut FLT_CALLBACK_DATA_QUEUE));

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltCbdqInitialize(instance : PFLT_INSTANCE, cbdq : *mut FLT_CALLBACK_DATA_QUEUE, cbdqinsertio : PFLT_CALLBACK_DATA_QUEUE_INSERT_IO, cbdqremoveio : PFLT_CALLBACK_DATA_QUEUE_REMOVE_IO, cbdqpeeknextio : PFLT_CALLBACK_DATA_QUEUE_PEEK_NEXT_IO, cbdqacquire : PFLT_CALLBACK_DATA_QUEUE_ACQUIRE, cbdqrelease : PFLT_CALLBACK_DATA_QUEUE_RELEASE, cbdqcompletecanceledio : PFLT_CALLBACK_DATA_QUEUE_COMPLETE_CANCELED_IO) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltCbdqInsertIo(cbdq : *mut FLT_CALLBACK_DATA_QUEUE, cbd : *const FLT_CALLBACK_DATA, context : *const super::super::super::System::SystemServices:: IO_CSQ_IRP_CONTEXT, insertcontext : *const core::ffi::c_void) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltCbdqRemoveIo(cbdq : *mut FLT_CALLBACK_DATA_QUEUE, context : *const super::super::super::System::SystemServices:: IO_CSQ_IRP_CONTEXT) -> *mut FLT_CALLBACK_DATA);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltCbdqRemoveNextIo(cbdq : *mut FLT_CALLBACK_DATA_QUEUE, peekcontext : *const core::ffi::c_void) -> *mut FLT_CALLBACK_DATA);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltCheckAndGrowNameControl(namectrl : *mut FLT_NAME_CONTROL, newsize : u16) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltCheckLockForReadAccess(filelock : *const super:: FILE_LOCK, callbackdata : *const FLT_CALLBACK_DATA) -> bool);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltCheckLockForWriteAccess(filelock : *const super:: FILE_LOCK, callbackdata : *const FLT_CALLBACK_DATA) -> bool);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltCheckOplock(oplock : *const *const core::ffi::c_void, callbackdata : *const FLT_CALLBACK_DATA, context : *const core::ffi::c_void, waitcompletionroutine : PFLTOPLOCK_WAIT_COMPLETE_ROUTINE, prepostcallbackdataroutine : PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE) -> FLT_PREOP_CALLBACK_STATUS);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltCheckOplockEx(oplock : *const *const core::ffi::c_void, callbackdata : *const FLT_CALLBACK_DATA, flags : u32, context : *const core::ffi::c_void, waitcompletionroutine : PFLTOPLOCK_WAIT_COMPLETE_ROUTINE, prepostcallbackdataroutine : PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE) -> FLT_PREOP_CALLBACK_STATUS);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltClearCallbackDataDirty(data : *mut FLT_CALLBACK_DATA));

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltClearCancelCompletion(callbackdata : *const FLT_CALLBACK_DATA) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltClose(filehandle : super::super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltCloseClientPort(filter : PFLT_FILTER, clientport : *mut PFLT_PORT));

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltCloseCommunicationPort(serverport : PFLT_PORT));

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltCloseSectionForDataScan(sectioncontext : PFLT_CONTEXT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("fltmgr.sys" "system" fn FltCommitComplete(instance : PFLT_INSTANCE, transaction : *const super::super::super::Foundation:: KTRANSACTION, transactioncontext : PFLT_CONTEXT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("fltmgr.sys" "system" fn FltCommitFinalizeComplete(instance : PFLT_INSTANCE, transaction : *const super::super::super::Foundation:: KTRANSACTION, transactioncontext : PFLT_CONTEXT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltCompareInstanceAltitudes(instance1 : PFLT_INSTANCE, instance2 : PFLT_INSTANCE) -> i32);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltCompletePendedPostOperation(callbackdata : *const FLT_CALLBACK_DATA));

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltCompletePendedPreOperation(callbackdata : *const FLT_CALLBACK_DATA, callbackstatus : FLT_PREOP_CALLBACK_STATUS, context : *const core::ffi::c_void));

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltCopyOpenReparseList(filter : PFLT_FILTER, data : *const FLT_CALLBACK_DATA, ecplist : *mut super::super::super::Foundation:: ECP_LIST) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("fltmgr.sys" "system" fn FltCreateCommunicationPort(filter : PFLT_FILTER, serverport : *mut PFLT_PORT, objectattributes : *const super::super::super::Foundation:: OBJECT_ATTRIBUTES, serverportcookie : *const core::ffi::c_void, connectnotifycallback : PFLT_CONNECT_NOTIFY, disconnectnotifycallback : PFLT_DISCONNECT_NOTIFY, messagenotifycallback : PFLT_MESSAGE_NOTIFY, maxconnections : i32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security", feature = "Win32_System_IO"))]
// windows_link::link!("fltmgr.sys" "system" fn FltCreateFile(filter : PFLT_FILTER, instance : PFLT_INSTANCE, filehandle : *mut super::super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::super::Foundation:: OBJECT_ATTRIBUTES, iostatusblock : *mut super::super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, allocationsize : *const i64, fileattributes : u32, shareaccess : u32, createdisposition : u32, createoptions : u32, eabuffer : *const core::ffi::c_void, ealength : u32, flags : u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltCreateFileEx(filter : PFLT_FILTER, instance : PFLT_INSTANCE, filehandle : *mut super::super::super::super::Win32::Foundation:: HANDLE, fileobject : *mut *mut super::super::super::Foundation:: FILE_OBJECT, desiredaccess : u32, objectattributes : *const super::super::super::Foundation:: OBJECT_ATTRIBUTES, iostatusblock : *mut super::super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, allocationsize : *const i64, fileattributes : u32, shareaccess : u32, createdisposition : u32, createoptions : u32, eabuffer : *const core::ffi::c_void, ealength : u32, flags : u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltCreateFileEx2(filter : PFLT_FILTER, instance : PFLT_INSTANCE, filehandle : *mut super::super::super::super::Win32::Foundation:: HANDLE, fileobject : *mut *mut super::super::super::Foundation:: FILE_OBJECT, desiredaccess : u32, objectattributes : *const super::super::super::Foundation:: OBJECT_ATTRIBUTES, iostatusblock : *mut super::super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, allocationsize : *const i64, fileattributes : u32, shareaccess : u32, createdisposition : u32, createoptions : u32, eabuffer : *const core::ffi::c_void, ealength : u32, flags : u32, drivercontext : *const super::super::super::System::SystemServices:: IO_DRIVER_CREATE_CONTEXT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltCreateMailslotFile(filter : PFLT_FILTER, instance : PFLT_INSTANCE, filehandle : *mut super::super::super::super::Win32::Foundation:: HANDLE, fileobject : *mut *mut super::super::super::Foundation:: FILE_OBJECT, desiredaccess : u32, objectattributes : *const super::super::super::Foundation:: OBJECT_ATTRIBUTES, iostatusblock : *mut super::super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, createoptions : u32, mailslotquota : u32, maximummessagesize : u32, readtimeout : *const i64, drivercontext : *const super::super::super::System::SystemServices:: IO_DRIVER_CREATE_CONTEXT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltCreateNamedPipeFile(filter : PFLT_FILTER, instance : PFLT_INSTANCE, filehandle : *mut super::super::super::super::Win32::Foundation:: HANDLE, fileobject : *mut *mut super::super::super::Foundation:: FILE_OBJECT, desiredaccess : u32, objectattributes : *const super::super::super::Foundation:: OBJECT_ATTRIBUTES, iostatusblock : *mut super::super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, shareaccess : u32, createdisposition : u32, createoptions : u32, namedpipetype : u32, readmode : u32, completionmode : u32, maximuminstances : u32, inboundquota : u32, outboundquota : u32, defaulttimeout : *const i64, drivercontext : *const super::super::super::System::SystemServices:: IO_DRIVER_CREATE_CONTEXT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltCreateSectionForDataScan(instance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, sectioncontext : PFLT_CONTEXT, desiredaccess : u32, objectattributes : *const super::super::super::Foundation:: OBJECT_ATTRIBUTES, maximumsize : *const i64, sectionpageprotection : u32, allocationattributes : u32, flags : u32, sectionhandle : *mut super::super::super::super::Win32::Foundation:: HANDLE, sectionobject : *mut *mut core::ffi::c_void, sectionfilesize : *mut i64) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltCreateSystemVolumeInformationFolder(instance : PFLT_INSTANCE) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltCurrentBatchOplock(oplock : *const *const core::ffi::c_void) -> bool);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltCurrentOplock(oplock : *const *const core::ffi::c_void) -> bool);

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltCurrentOplockH(oplock : *const *const core::ffi::c_void) -> bool);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltDecodeParameters(callbackdata : *const FLT_CALLBACK_DATA, mdladdresspointer : *mut *mut *mut super::super::super::Foundation:: MDL, buffer : *mut *mut *mut core::ffi::c_void, length : *mut *mut u32, desiredaccess : *mut super::super::super::System::SystemServices:: LOCK_OPERATION) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltDeleteContext(context : PFLT_CONTEXT));

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltDeleteExtraCreateParameterLookasideList(filter : PFLT_FILTER, lookaside : *mut core::ffi::c_void, flags : u32));

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltDeleteFileContext(instance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, oldcontext : *mut PFLT_CONTEXT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltDeleteInstanceContext(instance : PFLT_INSTANCE, oldcontext : *mut PFLT_CONTEXT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltDeletePushLock(pushlock : *const usize));

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltDeleteStreamContext(instance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, oldcontext : *mut PFLT_CONTEXT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltDeleteStreamHandleContext(instance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, oldcontext : *mut PFLT_CONTEXT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("fltmgr.sys" "system" fn FltDeleteTransactionContext(instance : PFLT_INSTANCE, transaction : *const super::super::super::Foundation:: KTRANSACTION, oldcontext : *mut PFLT_CONTEXT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltDeleteVolumeContext(filter : PFLT_FILTER, volume : PFLT_VOLUME, oldcontext : *mut PFLT_CONTEXT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltDetachVolume(filter : PFLT_FILTER, volume : PFLT_VOLUME, instancename : *const super::super::super::super::Win32::Foundation:: UNICODE_STRING) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltDeviceIoControlFile(instance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, iocontrolcode : u32, inputbuffer : *const core::ffi::c_void, inputbufferlength : u32, outputbuffer : *mut core::ffi::c_void, outputbufferlength : u32, lengthreturned : *mut u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 119:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltDoCompletionProcessingWhenSafe(data : *const FLT_CALLBACK_DATA, fltobjects : *const FLT_RELATED_OBJECTS, completioncontext : *const core::ffi::c_void, flags : u32, safepostcallback : PFLT_POST_OPERATION_CALLBACK, retpostoperationstatus : *mut FLT_POSTOP_CALLBACK_STATUS) -> bool);

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("fltmgr.sys" "system" fn FltEnlistInTransaction(instance : PFLT_INSTANCE, transaction : *const super::super::super::Foundation:: KTRANSACTION, transactioncontext : PFLT_CONTEXT, notificationmask : u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Storage_InstallableFileSystems")]
// windows_link::link!("fltmgr.sys" "system" fn FltEnumerateFilterInformation(index : u32, informationclass : super::super::super::super::Win32::Storage::InstallableFileSystems:: FILTER_INFORMATION_CLASS, buffer : *mut core::ffi::c_void, buffersize : u32, bytesreturned : *mut u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltEnumerateFilters(filterlist : *mut PFLT_FILTER, filterlistsize : u32, numberfiltersreturned : *mut u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 126:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_Storage_InstallableFileSystems", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltEnumerateInstanceInformationByDeviceObject(deviceobject : *const super::super::super::Foundation:: DEVICE_OBJECT, index : u32, informationclass : super::super::super::super::Win32::Storage::InstallableFileSystems:: INSTANCE_INFORMATION_CLASS, buffer : *mut core::ffi::c_void, buffersize : u32, bytesreturned : *mut u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 128:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Storage_InstallableFileSystems")]
// windows_link::link!("fltmgr.sys" "system" fn FltEnumerateInstanceInformationByFilter(filter : PFLT_FILTER, index : u32, informationclass : super::super::super::super::Win32::Storage::InstallableFileSystems:: INSTANCE_INFORMATION_CLASS, buffer : *mut core::ffi::c_void, buffersize : u32, bytesreturned : *mut u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 130:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Storage_InstallableFileSystems")]
// windows_link::link!("fltmgr.sys" "system" fn FltEnumerateInstanceInformationByVolume(volume : PFLT_VOLUME, index : u32, informationclass : super::super::super::super::Win32::Storage::InstallableFileSystems:: INSTANCE_INFORMATION_CLASS, buffer : *mut core::ffi::c_void, buffersize : u32, bytesreturned : *mut u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 132:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Storage_InstallableFileSystems")]
// windows_link::link!("fltmgr.sys" "system" fn FltEnumerateInstanceInformationByVolumeName(volumename : *const super::super::super::super::Win32::Foundation:: UNICODE_STRING, index : u32, informationclass : super::super::super::super::Win32::Storage::InstallableFileSystems:: INSTANCE_INFORMATION_CLASS, buffer : *mut core::ffi::c_void, buffersize : u32, bytesreturned : *mut u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 134:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltEnumerateInstances(volume : PFLT_VOLUME, filter : PFLT_FILTER, instancelist : *mut PFLT_INSTANCE, instancelistsize : u32, numberinstancesreturned : *mut u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Storage_InstallableFileSystems")]
// windows_link::link!("fltmgr.sys" "system" fn FltEnumerateVolumeInformation(filter : PFLT_FILTER, index : u32, informationclass : super::super::super::super::Win32::Storage::InstallableFileSystems:: FILTER_VOLUME_INFORMATION_CLASS, buffer : *mut core::ffi::c_void, buffersize : u32, bytesreturned : *mut u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltEnumerateVolumes(filter : PFLT_FILTER, volumelist : *mut PFLT_VOLUME, volumelistsize : u32, numbervolumesreturned : *mut u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 138:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltFastIoMdlRead(initiatinginstance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, fileoffset : *const i64, length : u32, lockkey : u32, mdlchain : *mut *mut super::super::super::Foundation:: MDL, iostatus : *mut super::super::super::super::Win32::System::IO:: IO_STATUS_BLOCK) -> bool);

// UNSUPPORTED Rust 140:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltFastIoMdlReadComplete(initiatinginstance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, mdlchain : *const super::super::super::Foundation:: MDL) -> bool);

// UNSUPPORTED Rust 142:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltFastIoMdlWriteComplete(initiatinginstance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, fileoffset : *const i64, mdlchain : *const super::super::super::Foundation:: MDL) -> bool);

// UNSUPPORTED Rust 144:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltFastIoPrepareMdlWrite(initiatinginstance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, fileoffset : *const i64, length : u32, lockkey : u32, mdlchain : *mut *mut super::super::super::Foundation:: MDL, iostatus : *mut super::super::super::super::Win32::System::IO:: IO_STATUS_BLOCK) -> bool);

// UNSUPPORTED Rust 146:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("fltmgr.sys" "system" fn FltFindExtraCreateParameter(filter : PFLT_FILTER, ecplist : *const super::super::super::Foundation:: ECP_LIST, ecptype : *const windows_sys::core::GUID, ecpcontext : *mut *mut core::ffi::c_void, ecpcontextsize : *mut u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 148:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltFlushBuffers(instance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 150:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltFlushBuffers2(instance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, flushtype : u32, callbackdata : *const FLT_CALLBACK_DATA) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 152:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltFreeCallbackData(callbackdata : *const FLT_CALLBACK_DATA));

// UNSUPPORTED Rust 154:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltFreeDeferredIoWorkItem(fltworkitem : PFLT_DEFERRED_IO_WORKITEM));

// UNSUPPORTED Rust 155:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltFreeExtraCreateParameter(filter : PFLT_FILTER, ecpcontext : *const core::ffi::c_void));

// UNSUPPORTED Rust 156:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("fltmgr.sys" "system" fn FltFreeExtraCreateParameterList(filter : PFLT_FILTER, ecplist : *const super::super::super::Foundation:: ECP_LIST));

// UNSUPPORTED Rust 158:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltFreeFileLock(filelock : *const super:: FILE_LOCK));

// UNSUPPORTED Rust 160:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltFreeGenericWorkItem(fltworkitem : PFLT_GENERIC_WORKITEM));

// UNSUPPORTED Rust 161:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("fltmgr.sys" "system" fn FltFreeOpenReparseList(filter : PFLT_FILTER, ecplist : *const super::super::super::Foundation:: ECP_LIST));

// UNSUPPORTED Rust 163:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltFreePoolAlignedWithTag(instance : PFLT_INSTANCE, buffer : *const core::ffi::c_void, tag : u32));

// UNSUPPORTED Rust 164:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fltmgr.sys" "system" fn FltFreeSecurityDescriptor(securitydescriptor : super::super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR));

// UNSUPPORTED Rust 166:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltFsControlFile(instance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, fscontrolcode : u32, inputbuffer : *const core::ffi::c_void, inputbufferlength : u32, outputbuffer : *mut core::ffi::c_void, outputbufferlength : u32, lengthreturned : *mut u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 168:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltGetActivityIdCallbackData(callbackdata : *const FLT_CALLBACK_DATA, guid : *mut windows_sys::core::GUID) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 170:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltGetBottomInstance(volume : PFLT_VOLUME, instance : *mut PFLT_INSTANCE) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 171:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltGetContexts(fltobjects : *const FLT_RELATED_OBJECTS, desiredcontexts : u16, contexts : *mut FLT_RELATED_CONTEXTS));

// UNSUPPORTED Rust 173:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltGetContextsEx(fltobjects : *const FLT_RELATED_OBJECTS, desiredcontexts : u16, contextssize : usize, contexts : *mut FLT_RELATED_CONTEXTS_EX) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 175:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltGetDestinationFileNameInformation(instance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, rootdirectory : super::super::super::super::Win32::Foundation:: HANDLE, filename : windows_sys::core::PCWSTR, filenamelength : u32, nameoptions : u32, retfilenameinformation : *mut *mut FLT_FILE_NAME_INFORMATION) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 177:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltGetDeviceObject(volume : PFLT_VOLUME, deviceobject : *mut *mut super::super::super::Foundation:: DEVICE_OBJECT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 179:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltGetDiskDeviceObject(volume : PFLT_VOLUME, diskdeviceobject : *mut *mut super::super::super::Foundation:: DEVICE_OBJECT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 181:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltGetEcpListFromCallbackData(filter : PFLT_FILTER, callbackdata : *const FLT_CALLBACK_DATA, ecplist : *mut *mut super::super::super::Foundation:: ECP_LIST) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 183:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltGetFileContext(instance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, context : *mut PFLT_CONTEXT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 185:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltGetFileNameInformation(callbackdata : *const FLT_CALLBACK_DATA, nameoptions : u32, filenameinformation : *mut *mut FLT_FILE_NAME_INFORMATION) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 187:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltGetFileNameInformationUnsafe(fileobject : *const super::super::super::Foundation:: FILE_OBJECT, instance : PFLT_INSTANCE, nameoptions : u32, filenameinformation : *mut *mut FLT_FILE_NAME_INFORMATION) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 189:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Storage_InstallableFileSystems")]
// windows_link::link!("fltmgr.sys" "system" fn FltGetFileSystemType(fltobject : *const core::ffi::c_void, filesystemtype : *mut super::super::super::super::Win32::Storage::InstallableFileSystems:: FLT_FILESYSTEM_TYPE) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 191:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltGetFilterFromInstance(instance : PFLT_INSTANCE, retfilter : *mut PFLT_FILTER) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 192:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltGetFilterFromName(filtername : *const super::super::super::super::Win32::Foundation:: UNICODE_STRING, retfilter : *mut PFLT_FILTER) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 193:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Storage_InstallableFileSystems")]
// windows_link::link!("fltmgr.sys" "system" fn FltGetFilterInformation(filter : PFLT_FILTER, informationclass : super::super::super::super::Win32::Storage::InstallableFileSystems:: FILTER_INFORMATION_CLASS, buffer : *mut core::ffi::c_void, buffersize : u32, bytesreturned : *mut u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 195:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltGetFsZeroingOffset(data : *const FLT_CALLBACK_DATA, zeroingoffset : *mut u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 197:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltGetInstanceContext(instance : PFLT_INSTANCE, context : *mut PFLT_CONTEXT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 198:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Storage_InstallableFileSystems")]
// windows_link::link!("fltmgr.sys" "system" fn FltGetInstanceInformation(instance : PFLT_INSTANCE, informationclass : super::super::super::super::Win32::Storage::InstallableFileSystems:: INSTANCE_INFORMATION_CLASS, buffer : *mut core::ffi::c_void, buffersize : u32, bytesreturned : *mut u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 200:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltGetIoAttributionHandleFromCallbackData(data : *const FLT_CALLBACK_DATA) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 202:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltGetIoPriorityHint(data : *const FLT_CALLBACK_DATA) -> super::super::super::Foundation:: IO_PRIORITY_HINT);

// UNSUPPORTED Rust 204:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltGetIoPriorityHintFromCallbackData(data : *const FLT_CALLBACK_DATA) -> super::super::super::Foundation:: IO_PRIORITY_HINT);

// UNSUPPORTED Rust 206:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltGetIoPriorityHintFromFileObject(fileobject : *const super::super::super::Foundation:: FILE_OBJECT) -> super::super::super::Foundation:: IO_PRIORITY_HINT);

// UNSUPPORTED Rust 208:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("fltmgr.sys" "system" fn FltGetIoPriorityHintFromThread(thread : super::super::super::Foundation:: PETHREAD) -> super::super::super::Foundation:: IO_PRIORITY_HINT);

// UNSUPPORTED Rust 210:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltGetIrpName(irpmajorcode : u8) -> windows_sys::core::PSTR);

// UNSUPPORTED Rust 211:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltGetLowerInstance(currentinstance : PFLT_INSTANCE, lowerinstance : *mut PFLT_INSTANCE) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 212:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltGetNewSystemBufferAddress(callbackdata : *const FLT_CALLBACK_DATA) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 214:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("fltmgr.sys" "system" fn FltGetNextExtraCreateParameter(filter : PFLT_FILTER, ecplist : *const super::super::super::Foundation:: ECP_LIST, currentecpcontext : *const core::ffi::c_void, nextecptype : *mut windows_sys::core::GUID, nextecpcontext : *mut *mut core::ffi::c_void, nextecpcontextsize : *mut u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 216:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltGetRequestorProcess(callbackdata : *const FLT_CALLBACK_DATA) -> super::super::super::Foundation:: PEPROCESS);

// UNSUPPORTED Rust 218:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltGetRequestorProcessId(callbackdata : *const FLT_CALLBACK_DATA) -> u32);

// UNSUPPORTED Rust 220:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltGetRequestorProcessIdEx(callbackdata : *const FLT_CALLBACK_DATA) -> super::super::super::super::Win32::Foundation:: HANDLE);

// UNSUPPORTED Rust 222:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltGetRequestorSessionId(callbackdata : *const FLT_CALLBACK_DATA, sessionid : *mut u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 224:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltGetRoutineAddress(fltmgrroutinename : windows_sys::core::PCSTR) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 225:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltGetSectionContext(instance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, context : *mut PFLT_CONTEXT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 227:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltGetStreamContext(instance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, context : *mut PFLT_CONTEXT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 229:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltGetStreamHandleContext(instance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, context : *mut PFLT_CONTEXT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 231:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltGetSwappedBufferMdlAddress(callbackdata : *const FLT_CALLBACK_DATA) -> *mut super::super::super::Foundation:: MDL);

// UNSUPPORTED Rust 233:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltGetTopInstance(volume : PFLT_VOLUME, instance : *mut PFLT_INSTANCE) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 234:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("fltmgr.sys" "system" fn FltGetTransactionContext(instance : PFLT_INSTANCE, transaction : *const super::super::super::Foundation:: KTRANSACTION, context : *mut PFLT_CONTEXT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 236:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltGetTunneledName(callbackdata : *const FLT_CALLBACK_DATA, filenameinformation : *const FLT_FILE_NAME_INFORMATION, rettunneledfilenameinformation : *mut *mut FLT_FILE_NAME_INFORMATION) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 238:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltGetUpperInstance(currentinstance : PFLT_INSTANCE, upperinstance : *mut PFLT_INSTANCE) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 239:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltGetVolumeContext(filter : PFLT_FILTER, volume : PFLT_VOLUME, context : *mut PFLT_CONTEXT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 240:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltGetVolumeFromDeviceObject(filter : PFLT_FILTER, deviceobject : *const super::super::super::Foundation:: DEVICE_OBJECT, retvolume : *mut PFLT_VOLUME) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 242:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltGetVolumeFromFileObject(filter : PFLT_FILTER, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, retvolume : *mut PFLT_VOLUME) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 244:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltGetVolumeFromInstance(instance : PFLT_INSTANCE, retvolume : *mut PFLT_VOLUME) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 245:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltGetVolumeFromName(filter : PFLT_FILTER, volumename : *const super::super::super::super::Win32::Foundation:: UNICODE_STRING, retvolume : *mut PFLT_VOLUME) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 246:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltGetVolumeGuidName(volume : PFLT_VOLUME, volumeguidname : *mut super::super::super::super::Win32::Foundation:: UNICODE_STRING, buffersizeneeded : *mut u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 247:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Storage_InstallableFileSystems")]
// windows_link::link!("fltmgr.sys" "system" fn FltGetVolumeInformation(volume : PFLT_VOLUME, informationclass : super::super::super::super::Win32::Storage::InstallableFileSystems:: FILTER_VOLUME_INFORMATION_CLASS, buffer : *mut core::ffi::c_void, buffersize : u32, bytesreturned : *mut u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 249:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltGetVolumeInstanceFromName(filter : PFLT_FILTER, volume : PFLT_VOLUME, instancename : *const super::super::super::super::Win32::Foundation:: UNICODE_STRING, retinstance : *mut PFLT_INSTANCE) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 250:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltGetVolumeName(volume : PFLT_VOLUME, volumename : *mut super::super::super::super::Win32::Foundation:: UNICODE_STRING, buffersizeneeded : *mut u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 251:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltGetVolumeProperties(volume : PFLT_VOLUME, volumeproperties : *mut FLT_VOLUME_PROPERTIES, volumepropertieslength : u32, lengthreturned : *mut u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 252:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltInitExtraCreateParameterLookasideList(filter : PFLT_FILTER, lookaside : *mut core::ffi::c_void, flags : u32, size : usize, tag : u32));

// UNSUPPORTED Rust 253:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltInitializeFileLock(filelock : *mut super:: FILE_LOCK));

// UNSUPPORTED Rust 255:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltInitializeOplock(oplock : *mut *mut core::ffi::c_void));

// UNSUPPORTED Rust 256:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltInitializePushLock(pushlock : *mut usize));

// UNSUPPORTED Rust 257:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("fltmgr.sys" "system" fn FltInsertExtraCreateParameter(filter : PFLT_FILTER, ecplist : *mut super::super::super::Foundation:: ECP_LIST, ecpcontext : *mut core::ffi::c_void) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 259:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltIs32bitProcess(callbackdata : *const FLT_CALLBACK_DATA) -> bool);

// UNSUPPORTED Rust 261:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltIsCallbackDataDirty(data : *const FLT_CALLBACK_DATA) -> bool);

// UNSUPPORTED Rust 263:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltIsDirectory(fileobject : *const super::super::super::Foundation:: FILE_OBJECT, instance : PFLT_INSTANCE, isdirectory : *mut bool) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 265:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltIsEcpAcknowledged(filter : PFLT_FILTER, ecpcontext : *const core::ffi::c_void) -> bool);

// UNSUPPORTED Rust 266:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltIsEcpFromUserMode(filter : PFLT_FILTER, ecpcontext : *const core::ffi::c_void) -> bool);

// UNSUPPORTED Rust 267:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltIsFltMgrVolumeDeviceObject(deviceobject : *const super::super::super::Foundation:: DEVICE_OBJECT) -> bool);

// UNSUPPORTED Rust 269:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltIsIoCanceled(callbackdata : *const FLT_CALLBACK_DATA) -> bool);

// UNSUPPORTED Rust 271:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltIsIoRedirectionAllowed(sourceinstance : PFLT_INSTANCE, targetinstance : PFLT_INSTANCE, redirectionallowed : *mut bool) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 272:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltIsIoRedirectionAllowedForOperation(data : *const FLT_CALLBACK_DATA, targetinstance : PFLT_INSTANCE, redirectionallowedthisio : *mut bool, redirectionallowedallio : *mut bool) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 274:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltIsOperationSynchronous(callbackdata : *const FLT_CALLBACK_DATA) -> bool);

// UNSUPPORTED Rust 276:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltIsVolumeSnapshot(fltobject : *const core::ffi::c_void, issnapshotvolume : *mut bool) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 277:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltIsVolumeWritable(fltobject : *const core::ffi::c_void, iswritable : *mut bool) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 278:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltLoadFilter(filtername : *const super::super::super::super::Win32::Foundation:: UNICODE_STRING) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 279:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltLockUserBuffer(callbackdata : *const FLT_CALLBACK_DATA) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 281:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltNotifyFilterChangeDirectory(notifysync : super::super::super::Foundation:: PNOTIFY_SYNC, notifylist : *mut super::super::super::super::Win32::System::Kernel:: LIST_ENTRY, fscontext : *const core::ffi::c_void, fulldirectoryname : *const super::super::super::super::Win32::System::Kernel:: STRING, watchtree : bool, ignorebuffer : bool, completionfilter : u32, notifycallbackdata : *const FLT_CALLBACK_DATA, traversecallback : super:: PCHECK_FOR_TRAVERSE_ACCESS, subjectcontext : *const super::super::super::Foundation:: SECURITY_SUBJECT_CONTEXT, filtercallback : super:: PFILTER_REPORT_CHANGE));

// UNSUPPORTED Rust 283:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltObjectDereference(fltobject : *mut core::ffi::c_void));

// UNSUPPORTED Rust 284:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltObjectReference(fltobject : *mut core::ffi::c_void) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 285:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltOpenVolume(instance : PFLT_INSTANCE, volumehandle : *mut super::super::super::super::Win32::Foundation:: HANDLE, volumefileobject : *mut *mut super::super::super::Foundation:: FILE_OBJECT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 287:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltOplockBreakH(oplock : *const *const core::ffi::c_void, callbackdata : *const FLT_CALLBACK_DATA, flags : u32, context : *const core::ffi::c_void, waitcompletionroutine : PFLTOPLOCK_WAIT_COMPLETE_ROUTINE, prepostcallbackdataroutine : PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE) -> FLT_PREOP_CALLBACK_STATUS);

// UNSUPPORTED Rust 289:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltOplockBreakToNone(oplock : *const *const core::ffi::c_void, callbackdata : *const FLT_CALLBACK_DATA, context : *const core::ffi::c_void, waitcompletionroutine : PFLTOPLOCK_WAIT_COMPLETE_ROUTINE, prepostcallbackdataroutine : PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE) -> FLT_PREOP_CALLBACK_STATUS);

// UNSUPPORTED Rust 291:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltOplockBreakToNoneEx(oplock : *const *const core::ffi::c_void, callbackdata : *const FLT_CALLBACK_DATA, flags : u32, context : *const core::ffi::c_void, waitcompletionroutine : PFLTOPLOCK_WAIT_COMPLETE_ROUTINE, prepostcallbackdataroutine : PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE) -> FLT_PREOP_CALLBACK_STATUS);

// UNSUPPORTED Rust 293:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltOplockFsctrl(oplock : *const *const core::ffi::c_void, callbackdata : *const FLT_CALLBACK_DATA, opencount : u32) -> FLT_PREOP_CALLBACK_STATUS);

// UNSUPPORTED Rust 295:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltOplockFsctrlEx(oplock : *const *const core::ffi::c_void, callbackdata : *const FLT_CALLBACK_DATA, opencount : u32, flags : u32) -> FLT_PREOP_CALLBACK_STATUS);

// UNSUPPORTED Rust 297:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltOplockIsFastIoPossible(oplock : *const *const core::ffi::c_void) -> bool);

// UNSUPPORTED Rust 298:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltOplockIsSharedRequest(callbackdata : *const FLT_CALLBACK_DATA) -> bool);

// UNSUPPORTED Rust 300:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltOplockKeysEqual(fo1 : *const super::super::super::Foundation:: FILE_OBJECT, fo2 : *const super::super::super::Foundation:: FILE_OBJECT) -> bool);

// UNSUPPORTED Rust 302:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltParseFileName(filename : *const super::super::super::super::Win32::Foundation:: UNICODE_STRING, extension : *mut super::super::super::super::Win32::Foundation:: UNICODE_STRING, stream : *mut super::super::super::super::Win32::Foundation:: UNICODE_STRING, finalcomponent : *mut super::super::super::super::Win32::Foundation:: UNICODE_STRING) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 303:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltParseFileNameInformation(filenameinformation : *mut FLT_FILE_NAME_INFORMATION) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 304:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltPerformAsynchronousIo(callbackdata : *mut FLT_CALLBACK_DATA, callbackroutine : PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext : *const core::ffi::c_void) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 306:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltPerformSynchronousIo(callbackdata : *mut FLT_CALLBACK_DATA));

// UNSUPPORTED Rust 308:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("fltmgr.sys" "system" fn FltPrePrepareComplete(instance : PFLT_INSTANCE, transaction : *const super::super::super::Foundation:: KTRANSACTION, transactioncontext : PFLT_CONTEXT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 310:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("fltmgr.sys" "system" fn FltPrepareComplete(instance : PFLT_INSTANCE, transaction : *const super::super::super::Foundation:: KTRANSACTION, transactioncontext : PFLT_CONTEXT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 312:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltPrepareToReuseEcp(filter : PFLT_FILTER, ecpcontext : *const core::ffi::c_void));

// UNSUPPORTED Rust 313:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltProcessFileLock(filelock : *const super:: FILE_LOCK, callbackdata : *const FLT_CALLBACK_DATA, context : *const core::ffi::c_void) -> FLT_PREOP_CALLBACK_STATUS);

// UNSUPPORTED Rust 315:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltPropagateActivityIdToThread(callbackdata : *const FLT_CALLBACK_DATA, propagateid : *mut windows_sys::core::GUID, originalid : *mut *mut windows_sys::core::GUID) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 317:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltPropagateIrpExtension(sourcedata : *const FLT_CALLBACK_DATA, targetdata : *mut FLT_CALLBACK_DATA, flags : u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 319:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltPurgeFileNameInformationCache(instance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 321:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltQueryDirectoryFile(instance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, fileinformation : *mut core::ffi::c_void, length : u32, fileinformationclass : super:: FILE_INFORMATION_CLASS, returnsingleentry : bool, filename : *const super::super::super::super::Win32::Foundation:: UNICODE_STRING, restartscan : bool, lengthreturned : *mut u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 323:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltQueryDirectoryFileEx(instance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, fileinformation : *mut core::ffi::c_void, length : u32, fileinformationclass : super:: FILE_INFORMATION_CLASS, queryflags : u32, filename : *const super::super::super::super::Win32::Foundation:: UNICODE_STRING, lengthreturned : *mut u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 325:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltQueryEaFile(instance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, returnedeadata : *mut core::ffi::c_void, length : u32, returnsingleentry : bool, ealist : *const core::ffi::c_void, ealistlength : u32, eaindex : *const u32, restartscan : bool, lengthreturned : *mut u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 327:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO"))]
// windows_link::link!("fltmgr.sys" "system" fn FltQueryInformationByName(filter : PFLT_FILTER, instance : PFLT_INSTANCE, objectattributes : *const super::super::super::Foundation:: OBJECT_ATTRIBUTES, iostatusblock : *mut super::super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, fileinformation : *mut core::ffi::c_void, length : u32, fileinformationclass : super:: FILE_INFORMATION_CLASS, drivercontext : *const super::super::super::System::SystemServices:: IO_DRIVER_CREATE_CONTEXT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 329:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltQueryInformationFile(instance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, fileinformation : *mut core::ffi::c_void, length : u32, fileinformationclass : super:: FILE_INFORMATION_CLASS, lengthreturned : *mut u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 331:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltQueryQuotaInformationFile(instance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, iostatusblock : *mut super::super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, buffer : *mut core::ffi::c_void, length : u32, returnsingleentry : bool, sidlist : *const core::ffi::c_void, sidlistlength : u32, startsid : *const u32, restartscan : bool, lengthreturned : *mut u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 333:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltQuerySecurityObject(instance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, securityinformation : u32, securitydescriptor : super::super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, length : u32, lengthneeded : *mut u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 335:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("fltmgr.sys" "system" fn FltQueryVolumeInformation(instance : PFLT_INSTANCE, iosb : *mut super::super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, fsinformation : *mut core::ffi::c_void, length : u32, fsinformationclass : super:: FS_INFORMATION_CLASS) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 337:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltQueryVolumeInformationFile(instance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, fsinformation : *mut core::ffi::c_void, length : u32, fsinformationclass : super:: FS_INFORMATION_CLASS, lengthreturned : *mut u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 339:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltQueueDeferredIoWorkItem(fltworkitem : PFLT_DEFERRED_IO_WORKITEM, data : *const FLT_CALLBACK_DATA, workerroutine : PFLT_DEFERRED_IO_WORKITEM_ROUTINE, queuetype : super::super::super::System::SystemServices:: WORK_QUEUE_TYPE, context : *const core::ffi::c_void) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 341:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_System_SystemServices")]
// windows_link::link!("fltmgr.sys" "system" fn FltQueueGenericWorkItem(fltworkitem : PFLT_GENERIC_WORKITEM, fltobject : *const core::ffi::c_void, workerroutine : PFLT_GENERIC_WORKITEM_ROUTINE, queuetype : super::super::super::System::SystemServices:: WORK_QUEUE_TYPE, context : *const core::ffi::c_void) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 343:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltReadFile(initiatinginstance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, byteoffset : *const i64, length : u32, buffer : *mut core::ffi::c_void, flags : u32, bytesread : *mut u32, callbackroutine : PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext : *const core::ffi::c_void) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 345:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltReadFileEx(initiatinginstance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, byteoffset : *const i64, length : u32, buffer : *mut core::ffi::c_void, flags : u32, bytesread : *mut u32, callbackroutine : PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext : *const core::ffi::c_void, key : *const u32, mdl : *const super::super::super::Foundation:: MDL) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 347:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltReferenceContext(context : PFLT_CONTEXT));

// UNSUPPORTED Rust 348:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltReferenceFileNameInformation(filenameinformation : *const FLT_FILE_NAME_INFORMATION));

// UNSUPPORTED Rust 349:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_Storage_InstallableFileSystems", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltRegisterFilter(driver : *const super::super::super::Foundation:: DRIVER_OBJECT, registration : *const FLT_REGISTRATION, retfilter : *mut PFLT_FILTER) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 351:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltRegisterForDataScan(instance : PFLT_INSTANCE) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 352:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltReissueSynchronousIo(initiatinginstance : PFLT_INSTANCE, callbackdata : *const FLT_CALLBACK_DATA));

// UNSUPPORTED Rust 354:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltReleaseContext(context : PFLT_CONTEXT));

// UNSUPPORTED Rust 355:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltReleaseContexts(contexts : *const FLT_RELATED_CONTEXTS));

// UNSUPPORTED Rust 356:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltReleaseContextsEx(contextssize : usize, contexts : *const FLT_RELATED_CONTEXTS_EX));

// UNSUPPORTED Rust 357:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltReleaseFileNameInformation(filenameinformation : *const FLT_FILE_NAME_INFORMATION));

// UNSUPPORTED Rust 358:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltReleasePushLock(pushlock : *mut usize));

// UNSUPPORTED Rust 359:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltReleasePushLockEx(pushlock : *mut usize, flags : u32));

// UNSUPPORTED Rust 360:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("fltmgr.sys" "system" fn FltReleaseResource(resource : *mut super::super::super::Foundation:: ERESOURCE));

// UNSUPPORTED Rust 362:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("fltmgr.sys" "system" fn FltRemoveExtraCreateParameter(filter : PFLT_FILTER, ecplist : *mut super::super::super::Foundation:: ECP_LIST, ecptype : *const windows_sys::core::GUID, ecpcontext : *mut *mut core::ffi::c_void, ecpcontextsize : *mut u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 364:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltRemoveOpenReparseEntry(filter : PFLT_FILTER, data : *const FLT_CALLBACK_DATA, openreparseentry : *const super:: OPEN_REPARSE_LIST_ENTRY));

// UNSUPPORTED Rust 366:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltRequestFileInfoOnCreateCompletion(filter : PFLT_FILTER, data : *const FLT_CALLBACK_DATA, infoclassflags : u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 368:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltRequestOperationStatusCallback(data : *const FLT_CALLBACK_DATA, callbackroutine : PFLT_GET_OPERATION_STATUS_CALLBACK, requestercontext : *const core::ffi::c_void) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 370:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltRetainSwappedBufferMdlAddress(callbackdata : *const FLT_CALLBACK_DATA));

// UNSUPPORTED Rust 372:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltRetrieveFileInfoOnCreateCompletion(filter : PFLT_FILTER, data : *const FLT_CALLBACK_DATA, infoclass : u32, size : *mut u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 374:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltRetrieveFileInfoOnCreateCompletionEx(filter : PFLT_FILTER, data : *const FLT_CALLBACK_DATA, infoclass : u32, retinfosize : *mut u32, retinfobuffer : *mut *mut core::ffi::c_void) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 376:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltRetrieveIoPriorityInfo(data : *const FLT_CALLBACK_DATA, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, thread : super::super::super::Foundation:: PETHREAD, priorityinfo : *mut super:: IO_PRIORITY_INFO) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 378:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltReuseCallbackData(callbackdata : *mut FLT_CALLBACK_DATA));

// UNSUPPORTED Rust 380:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("fltmgr.sys" "system" fn FltRollbackComplete(instance : PFLT_INSTANCE, transaction : *const super::super::super::Foundation:: KTRANSACTION, transactioncontext : PFLT_CONTEXT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 382:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("fltmgr.sys" "system" fn FltRollbackEnlistment(instance : PFLT_INSTANCE, transaction : *const super::super::super::Foundation:: KTRANSACTION, transactioncontext : PFLT_CONTEXT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 384:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltSendMessage(filter : PFLT_FILTER, clientport : *const PFLT_PORT, senderbuffer : *const core::ffi::c_void, senderbufferlength : u32, replybuffer : *mut core::ffi::c_void, replylength : *mut u32, timeout : *const i64) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 385:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltSetActivityIdCallbackData(callbackdata : *mut FLT_CALLBACK_DATA, guid : *const windows_sys::core::GUID) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 387:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltSetCallbackDataDirty(data : *mut FLT_CALLBACK_DATA));

// UNSUPPORTED Rust 389:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltSetCancelCompletion(callbackdata : *const FLT_CALLBACK_DATA, canceledcallback : PFLT_COMPLETE_CANCELED_CALLBACK) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 391:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltSetEaFile(instance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, eabuffer : *const core::ffi::c_void, length : u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 393:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltSetEcpListIntoCallbackData(filter : PFLT_FILTER, callbackdata : *const FLT_CALLBACK_DATA, ecplist : *const super::super::super::Foundation:: ECP_LIST) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 395:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltSetFileContext(instance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, operation : FLT_SET_CONTEXT_OPERATION, newcontext : PFLT_CONTEXT, oldcontext : *mut PFLT_CONTEXT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 397:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltSetFsZeroingOffset(data : *const FLT_CALLBACK_DATA, zeroingoffset : u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 399:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltSetFsZeroingOffsetRequired(data : *const FLT_CALLBACK_DATA) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 401:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltSetInformationFile(instance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, fileinformation : *const core::ffi::c_void, length : u32, fileinformationclass : super:: FILE_INFORMATION_CLASS) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 403:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltSetInstanceContext(instance : PFLT_INSTANCE, operation : FLT_SET_CONTEXT_OPERATION, newcontext : PFLT_CONTEXT, oldcontext : *mut PFLT_CONTEXT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 404:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltSetIoPriorityHintIntoCallbackData(data : *const FLT_CALLBACK_DATA, priorityhint : super::super::super::Foundation:: IO_PRIORITY_HINT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 406:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltSetIoPriorityHintIntoFileObject(fileobject : *const super::super::super::Foundation:: FILE_OBJECT, priorityhint : super::super::super::Foundation:: IO_PRIORITY_HINT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 408:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("fltmgr.sys" "system" fn FltSetIoPriorityHintIntoThread(thread : super::super::super::Foundation:: PETHREAD, priorityhint : super::super::super::Foundation:: IO_PRIORITY_HINT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 410:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltSetQuotaInformationFile(instance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, buffer : *const core::ffi::c_void, length : u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 412:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltSetSecurityObject(instance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, securityinformation : u32, securitydescriptor : super::super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 414:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltSetStreamContext(instance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, operation : FLT_SET_CONTEXT_OPERATION, newcontext : PFLT_CONTEXT, oldcontext : *mut PFLT_CONTEXT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 416:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltSetStreamHandleContext(instance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, operation : FLT_SET_CONTEXT_OPERATION, newcontext : PFLT_CONTEXT, oldcontext : *mut PFLT_CONTEXT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 418:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("fltmgr.sys" "system" fn FltSetTransactionContext(instance : PFLT_INSTANCE, transaction : *const super::super::super::Foundation:: KTRANSACTION, operation : FLT_SET_CONTEXT_OPERATION, newcontext : PFLT_CONTEXT, oldcontext : *mut PFLT_CONTEXT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 420:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltSetVolumeContext(volume : PFLT_VOLUME, operation : FLT_SET_CONTEXT_OPERATION, newcontext : PFLT_CONTEXT, oldcontext : *mut PFLT_CONTEXT) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 421:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("fltmgr.sys" "system" fn FltSetVolumeInformation(instance : PFLT_INSTANCE, iosb : *mut super::super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, fsinformation : *mut core::ffi::c_void, length : u32, fsinformationclass : super:: FS_INFORMATION_CLASS) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 423:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltStartFiltering(filter : PFLT_FILTER) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 424:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltSupportsFileContexts(fileobject : *const super::super::super::Foundation:: FILE_OBJECT) -> bool);

// UNSUPPORTED Rust 426:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltSupportsFileContextsEx(fileobject : *const super::super::super::Foundation:: FILE_OBJECT, instance : PFLT_INSTANCE) -> bool);

// UNSUPPORTED Rust 428:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltSupportsStreamContexts(fileobject : *const super::super::super::Foundation:: FILE_OBJECT) -> bool);

// UNSUPPORTED Rust 430:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltSupportsStreamHandleContexts(fileobject : *const super::super::super::Foundation:: FILE_OBJECT) -> bool);

// UNSUPPORTED Rust 432:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltTagFile(initiatinginstance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, filetag : u32, guid : *const windows_sys::core::GUID, databuffer : *const core::ffi::c_void, databufferlength : u16) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 434:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltTagFileEx(initiatinginstance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, filetag : u32, guid : *const windows_sys::core::GUID, databuffer : *const core::ffi::c_void, databufferlength : u16, existingfiletag : u32, existingguid : *const windows_sys::core::GUID, flags : u32) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 436:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltUninitializeFileLock(filelock : *const super:: FILE_LOCK));

// UNSUPPORTED Rust 438:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltUninitializeOplock(oplock : *const *const core::ffi::c_void));

// UNSUPPORTED Rust 439:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltUnloadFilter(filtername : *const super::super::super::super::Win32::Foundation:: UNICODE_STRING) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 440:1: declaration Macro has no candidate rule
// windows_link::link!("fltmgr.sys" "system" fn FltUnregisterFilter(filter : PFLT_FILTER));

// UNSUPPORTED Rust 441:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltUntagFile(initiatinginstance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, filetag : u32, guid : *const windows_sys::core::GUID) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 443:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltVetoBypassIo(callbackdata : *const FLT_CALLBACK_DATA, fltobjects : *const FLT_RELATED_OBJECTS, operationstatus : super::super::super::super::Win32::Foundation:: NTSTATUS, failurereason : *const super::super::super::super::Win32::Foundation:: UNICODE_STRING) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 445:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltWriteFile(initiatinginstance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, byteoffset : *const i64, length : u32, buffer : *const core::ffi::c_void, flags : u32, byteswritten : *mut u32, callbackroutine : PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext : *const core::ffi::c_void) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 447:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltWriteFileEx(initiatinginstance : PFLT_INSTANCE, fileobject : *const super::super::super::Foundation:: FILE_OBJECT, byteoffset : *const i64, length : u32, buffer : *const core::ffi::c_void, flags : u32, byteswritten : *mut u32, callbackroutine : PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext : *const core::ffi::c_void, key : *const u32, mdl : *const super::super::super::Foundation:: MDL) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 449:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("fltmgr.sys" "system" fn FltpTraceRedirectedFileIo(originatingfileobject : *const super::super::super::Foundation:: FILE_OBJECT, childcallbackdata : *mut FLT_CALLBACK_DATA) -> super::super::super::super::Win32::Foundation:: NTSTATUS);

public const val `FLTFL_CALLBACK_DATA_DIRTY`: UInt = 2147483648u;
public const val `FLTFL_CALLBACK_DATA_DRAINING_IO`: UInt = 262144u;
public const val `FLTFL_CALLBACK_DATA_FAST_IO_OPERATION`: UInt = 2u;
public const val `FLTFL_CALLBACK_DATA_FS_FILTER_OPERATION`: UInt = 4u;
public const val `FLTFL_CALLBACK_DATA_GENERATED_IO`: UInt = 65536u;
public const val `FLTFL_CALLBACK_DATA_IRP_OPERATION`: UInt = 1u;
public const val `FLTFL_CALLBACK_DATA_NEW_SYSTEM_BUFFER`: UInt = 1048576u;
public const val `FLTFL_CALLBACK_DATA_POST_OPERATION`: UInt = 524288u;
public const val `FLTFL_CALLBACK_DATA_REISSUED_IO`: UInt = 131072u;
public const val `FLTFL_CALLBACK_DATA_REISSUE_MASK`: UInt = 65535u;
public const val `FLTFL_CALLBACK_DATA_SYSTEM_BUFFER`: UInt = 8u;
public const val `FLTFL_CONTEXT_REGISTRATION_NO_EXACT_SIZE_MATCH`: UInt = 1u;
public const val `FLTFL_FILE_NAME_PARSED_EXTENSION`: UInt = 2u;
public const val `FLTFL_FILE_NAME_PARSED_FINAL_COMPONENT`: UInt = 1u;
public const val `FLTFL_FILE_NAME_PARSED_PARENT_DIR`: UInt = 8u;
public const val `FLTFL_FILE_NAME_PARSED_STREAM`: UInt = 4u;
public const val `FLTFL_FILTER_UNLOAD_MANDATORY`: UInt = 1u;
public const val `FLTFL_INSTANCE_SETUP_AUTOMATIC_ATTACHMENT`: UInt = 1u;
public const val `FLTFL_INSTANCE_SETUP_DETACHED_VOLUME`: UInt = 8u;
public const val `FLTFL_INSTANCE_SETUP_MANUAL_ATTACHMENT`: UInt = 2u;
public const val `FLTFL_INSTANCE_SETUP_NEWLY_MOUNTED_VOLUME`: UInt = 4u;
public const val `FLTFL_INSTANCE_TEARDOWN_FILTER_UNLOAD`: UInt = 2u;
public const val `FLTFL_INSTANCE_TEARDOWN_INTERNAL_ERROR`: UInt = 16u;
public const val `FLTFL_INSTANCE_TEARDOWN_MANDATORY_FILTER_UNLOAD`: UInt = 4u;
public const val `FLTFL_INSTANCE_TEARDOWN_MANUAL`: UInt = 1u;
public const val `FLTFL_INSTANCE_TEARDOWN_VOLUME_DISMOUNT`: UInt = 8u;
public const val `FLTFL_IO_OPERATION_DO_NOT_UPDATE_BYTE_OFFSET`: UInt = 4u;
public const val `FLTFL_IO_OPERATION_NON_CACHED`: UInt = 1u;
public const val `FLTFL_IO_OPERATION_PAGING`: UInt = 2u;
public const val `FLTFL_IO_OPERATION_SYNCHRONOUS_PAGING`: UInt = 8u;
public const val `FLTFL_NORMALIZE_NAME_CASE_SENSITIVE`: UInt = 1u;
public const val `FLTFL_NORMALIZE_NAME_DESTINATION_FILE_NAME`: UInt = 2u;
public const val `FLTFL_OPERATION_REGISTRATION_SKIP_CACHED_IO`: UInt = 2u;
public const val `FLTFL_OPERATION_REGISTRATION_SKIP_NON_CACHED_NON_PAGING_IO`: UInt = 8u;
public const val `FLTFL_OPERATION_REGISTRATION_SKIP_NON_DASD_IO`: UInt = 4u;
public const val `FLTFL_OPERATION_REGISTRATION_SKIP_PAGING_IO`: UInt = 1u;
public const val `FLTFL_POST_OPERATION_DRAINING`: UInt = 1u;
public const val `FLTFL_REGISTRATION_DO_NOT_SUPPORT_SERVICE_STOP`: UInt = 1u;
public const val `FLTFL_REGISTRATION_SUPPORT_DAX_VOLUME`: UInt = 4u;
public const val `FLTFL_REGISTRATION_SUPPORT_NPFS_MSFS`: UInt = 2u;
public const val `FLTFL_REGISTRATION_SUPPORT_WCOS`: UInt = 8u;
public const val `FLTTCFL_AUTO_REPARSE`: UInt = 1u;
public const val `FLT_ALLOCATE_CALLBACK_DATA_PREALLOCATE_ALL_MEMORY`: UInt = 1u;
// UNSUPPORTED Rust 494:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_CALLBACK_DATA {
//     pub Flags: u32,
//     pub Thread: super::super::super::Foundation::PETHREAD,
//     pub Iopb: *const FLT_IO_PARAMETER_BLOCK,
//     pub IoStatus: super::super::super::super::Win32::System::IO::IO_STATUS_BLOCK,
//     pub TagData: *mut FLT_TAG_DATA_BUFFER,
//     pub Anonymous: FLT_CALLBACK_DATA_0,
//     pub RequestorMode: i8,
// }

// UNSUPPORTED Rust 506:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_CALLBACK_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 512:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub union FLT_CALLBACK_DATA_0 {
//     pub Anonymous: FLT_CALLBACK_DATA_0_0,
//     pub FilterContext: [*mut core::ffi::c_void; 4],
// }

// UNSUPPORTED Rust 519:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_CALLBACK_DATA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 525:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_CALLBACK_DATA_0_0 {
//     pub QueueLinks: super::super::super::super::Win32::System::Kernel::LIST_ENTRY,
//     pub QueueContext: [*mut core::ffi::c_void; 2],
// }

// UNSUPPORTED Rust 532:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_CALLBACK_DATA_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 538:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy, Default)]
// pub struct FLT_CALLBACK_DATA_QUEUE {
//     pub Csq: super::super::super::System::SystemServices::IO_CSQ,
//     pub Flags: FLT_CALLBACK_DATA_QUEUE_FLAGS,
//     pub Instance: PFLT_INSTANCE,
//     pub InsertIo: PFLT_CALLBACK_DATA_QUEUE_INSERT_IO,
//     pub RemoveIo: PFLT_CALLBACK_DATA_QUEUE_REMOVE_IO,
//     pub PeekNextIo: PFLT_CALLBACK_DATA_QUEUE_PEEK_NEXT_IO,
//     pub Acquire: PFLT_CALLBACK_DATA_QUEUE_ACQUIRE,
//     pub Release: PFLT_CALLBACK_DATA_QUEUE_RELEASE,
//     pub CompleteCanceledIo: PFLT_CALLBACK_DATA_QUEUE_COMPLETE_CANCELED_IO,
// }

public typealias `FLT_CALLBACK_DATA_QUEUE_FLAGS` = Int;
public const val `FLT_CONTEXT_END`: UInt = 65535u;
// UNSUPPORTED Rust 554:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Wdk_Foundation")]
// #[derive(Clone, Copy)]
// pub struct FLT_CONTEXT_REGISTRATION {
//     pub ContextType: u16,
//     pub Flags: u16,
//     pub ContextCleanupCallback: PFLT_CONTEXT_CLEANUP_CALLBACK,
//     pub Size: usize,
//     pub PoolTag: u32,
//     pub ContextAllocateCallback: PFLT_CONTEXT_ALLOCATE_CALLBACK,
//     pub ContextFreeCallback: PFLT_CONTEXT_FREE_CALLBACK,
//     pub Reserved1: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 567:1: declaration Impl has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// impl Default for FLT_CONTEXT_REGISTRATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 573:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FLT_CREATEFILE_TARGET_ECP_CONTEXT {
//     pub Instance: PFLT_INSTANCE,
//     pub Volume: PFLT_VOLUME,
//     pub FileNameInformation: *mut FLT_FILE_NAME_INFORMATION,
//     pub Flags: u16,
// }

// UNSUPPORTED Rust 581:1: declaration Impl has no candidate rule
// impl Default for FLT_CREATEFILE_TARGET_ECP_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FLT_FILE_CONTEXT`: UInt = 4u;
public const val `FLT_FILE_NAME_ALLOW_QUERY_ON_REPARSE`: UInt = 67108864u;
public const val `FLT_FILE_NAME_DO_NOT_CACHE`: UInt = 33554432u;
// UNSUPPORTED Rust 589:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FLT_FILE_NAME_INFORMATION {
//     pub Size: u16,
//     pub NamesParsed: u16,
//     pub Format: u32,
//     pub Name: super::super::super::super::Win32::Foundation::UNICODE_STRING,
//     pub Volume: super::super::super::super::Win32::Foundation::UNICODE_STRING,
//     pub Share: super::super::super::super::Win32::Foundation::UNICODE_STRING,
//     pub Extension: super::super::super::super::Win32::Foundation::UNICODE_STRING,
//     pub Stream: super::super::super::super::Win32::Foundation::UNICODE_STRING,
//     pub FinalComponent: super::super::super::super::Win32::Foundation::UNICODE_STRING,
//     pub ParentDir: super::super::super::super::Win32::Foundation::UNICODE_STRING,
// }

public const val `FLT_FILE_NAME_NORMALIZED`: UInt = 1u;
public const val `FLT_FILE_NAME_OPENED`: UInt = 2u;
public const val `FLT_FILE_NAME_QUERY_ALWAYS_ALLOW_CACHE_LOOKUP`: UInt = 1024u;
public const val `FLT_FILE_NAME_QUERY_CACHE_ONLY`: UInt = 512u;
public const val `FLT_FILE_NAME_QUERY_DEFAULT`: UInt = 256u;
public const val `FLT_FILE_NAME_QUERY_FILESYSTEM_ONLY`: UInt = 768u;
public const val `FLT_FILE_NAME_REQUEST_FROM_CURRENT_PROVIDER`: UInt = 16777216u;
public const val `FLT_FILE_NAME_SHORT`: UInt = 3u;
public const val `FLT_FLUSH_TYPE_DATA_SYNC_ONLY`: UInt = 8u;
public const val `FLT_FLUSH_TYPE_FILE_DATA_ONLY`: UInt = 2u;
public const val `FLT_FLUSH_TYPE_FLUSH_AND_PURGE`: UInt = 1u;
public const val `FLT_FLUSH_TYPE_NO_SYNC`: UInt = 4u;
public const val `FLT_INSTANCE_CONTEXT`: UInt = 2u;
public const val `FLT_INTERNAL_OPERATION_COUNT`: UInt = 22u;
// UNSUPPORTED Rust 617:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_IO_PARAMETER_BLOCK {
//     pub IrpFlags: u32,
//     pub MajorFunction: u8,
//     pub MinorFunction: u8,
//     pub OperationFlags: u8,
//     pub Reserved: u8,
//     pub TargetFileObject: *mut super::super::super::Foundation::FILE_OBJECT,
//     pub TargetInstance: PFLT_INSTANCE,
//     pub Parameters: FLT_PARAMETERS,
// }

// UNSUPPORTED Rust 630:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_IO_PARAMETER_BLOCK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FLT_MAX_DEVICE_REPARSE_ATTEMPTS`: UInt = 64u;
// UNSUPPORTED Rust 637:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FLT_NAME_CONTROL {
//     pub Name: super::super::super::super::Win32::Foundation::UNICODE_STRING,
// }

// UNSUPPORTED Rust 642:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_OPERATION_REGISTRATION {
//     pub MajorFunction: u8,
//     pub Flags: u32,
//     pub PreOperation: PFLT_PRE_OPERATION_CALLBACK,
//     pub PostOperation: PFLT_POST_OPERATION_CALLBACK,
//     pub Reserved1: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 652:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_OPERATION_REGISTRATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 658:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub union FLT_PARAMETERS {
//     pub Create: FLT_PARAMETERS_0,
//     pub CreatePipe: FLT_PARAMETERS_1,
//     pub CreateMailslot: FLT_PARAMETERS_2,
//     pub Read: FLT_PARAMETERS_3,
//     pub Write: FLT_PARAMETERS_4,
//     pub QueryFileInformation: FLT_PARAMETERS_5,
//     pub SetFileInformation: FLT_PARAMETERS_6,
//     pub QueryEa: FLT_PARAMETERS_7,
//     pub SetEa: FLT_PARAMETERS_8,
//     pub QueryVolumeInformation: FLT_PARAMETERS_9,
//     pub SetVolumeInformation: FLT_PARAMETERS_10,
//     pub DirectoryControl: FLT_PARAMETERS_11,
//     pub FileSystemControl: FLT_PARAMETERS_12,
//     pub DeviceIoControl: FLT_PARAMETERS_13,
//     pub LockControl: FLT_PARAMETERS_14,
//     pub QuerySecurity: FLT_PARAMETERS_15,
//     pub SetSecurity: FLT_PARAMETERS_16,
//     pub WMI: FLT_PARAMETERS_17,
//     pub QueryQuota: FLT_PARAMETERS_18,
//     pub SetQuota: FLT_PARAMETERS_19,
//     pub Pnp: FLT_PARAMETERS_20,
//     pub AcquireForSectionSynchronization: FLT_PARAMETERS_21,
//     pub AcquireForModifiedPageWriter: FLT_PARAMETERS_22,
//     pub ReleaseForModifiedPageWriter: FLT_PARAMETERS_23,
//     pub QueryOpen: FLT_PARAMETERS_24,
//     pub FastIoCheckIfPossible: FLT_PARAMETERS_25,
//     pub NetworkQueryOpen: FLT_PARAMETERS_26,
//     pub MdlRead: FLT_PARAMETERS_27,
//     pub MdlReadComplete: FLT_PARAMETERS_28,
//     pub PrepareMdlWrite: FLT_PARAMETERS_29,
//     pub MdlWriteComplete: FLT_PARAMETERS_30,
//     pub MountVolume: FLT_PARAMETERS_31,
//     pub Others: FLT_PARAMETERS_32,
// }

// UNSUPPORTED Rust 696:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 702:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_22 {
//     pub EndingOffset: *mut i64,
//     pub ResourceToRelease: *mut *mut super::super::super::Foundation::ERESOURCE,
// }

// UNSUPPORTED Rust 709:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_22 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 715:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_21 {
//     pub SyncType: super::FS_FILTER_SECTION_SYNC_TYPE,
//     pub PageProtection: u32,
//     pub OutputInformation: *mut super::FS_FILTER_SECTION_SYNC_OUTPUT,
//     pub Flags: u32,
//     pub AllocationAttributes: u32,
// }

// UNSUPPORTED Rust 725:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_21 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 731:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_2 {
//     pub SecurityContext: *mut super::super::super::Foundation::IO_SECURITY_CONTEXT,
//     pub Options: u32,
//     pub Reserved: u16,
//     pub ShareAccess: u16,
//     pub Parameters: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 741:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 747:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_1 {
//     pub SecurityContext: *mut super::super::super::Foundation::IO_SECURITY_CONTEXT,
//     pub Options: u32,
//     pub Reserved: u16,
//     pub ShareAccess: u16,
//     pub Parameters: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 757:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 763:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_0 {
//     pub SecurityContext: *mut super::super::super::Foundation::IO_SECURITY_CONTEXT,
//     pub Options: u32,
//     pub FileAttributes: u16,
//     pub ShareAccess: u16,
//     pub EaLength: u32,
//     pub EaBuffer: *mut core::ffi::c_void,
//     pub AllocationSize: i64,
// }

// UNSUPPORTED Rust 775:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 781:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub union FLT_PARAMETERS_13 {
//     pub Common: FLT_PARAMETERS_13_0,
//     pub Neither: FLT_PARAMETERS_13_1,
//     pub Buffered: FLT_PARAMETERS_13_2,
//     pub Direct: FLT_PARAMETERS_13_3,
//     pub FastIo: FLT_PARAMETERS_13_4,
// }

// UNSUPPORTED Rust 791:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_13 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 797:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_13_2 {
//     pub OutputBufferLength: u32,
//     pub InputBufferLength: u32,
//     pub IoControlCode: u32,
//     pub SystemBuffer: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 806:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_13_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 812:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy, Default)]
// pub struct FLT_PARAMETERS_13_0 {
//     pub OutputBufferLength: u32,
//     pub InputBufferLength: u32,
//     pub IoControlCode: u32,
// }

// UNSUPPORTED Rust 820:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_13_3 {
//     pub OutputBufferLength: u32,
//     pub InputBufferLength: u32,
//     pub IoControlCode: u32,
//     pub InputSystemBuffer: *mut core::ffi::c_void,
//     pub OutputBuffer: *mut core::ffi::c_void,
//     pub OutputMdlAddress: *mut super::super::super::Foundation::MDL,
// }

// UNSUPPORTED Rust 831:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_13_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 837:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_13_4 {
//     pub OutputBufferLength: u32,
//     pub InputBufferLength: u32,
//     pub IoControlCode: u32,
//     pub InputBuffer: *mut core::ffi::c_void,
//     pub OutputBuffer: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 847:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_13_4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 853:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_13_1 {
//     pub OutputBufferLength: u32,
//     pub InputBufferLength: u32,
//     pub IoControlCode: u32,
//     pub InputBuffer: *mut core::ffi::c_void,
//     pub OutputBuffer: *mut core::ffi::c_void,
//     pub OutputMdlAddress: *mut super::super::super::Foundation::MDL,
// }

// UNSUPPORTED Rust 864:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_13_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 870:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub union FLT_PARAMETERS_11 {
//     pub QueryDirectory: FLT_PARAMETERS_11_0,
//     pub NotifyDirectory: FLT_PARAMETERS_11_1,
//     pub NotifyDirectoryEx: FLT_PARAMETERS_11_2,
// }

// UNSUPPORTED Rust 878:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_11 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 884:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_11_2 {
//     pub Length: u32,
//     pub CompletionFilter: u32,
//     pub DirectoryNotifyInformationClass: super::super::super::System::SystemServices::DIRECTORY_NOTIFY_INFORMATION_CLASS,
//     pub Spare2: u32,
//     pub DirectoryBuffer: *mut core::ffi::c_void,
//     pub MdlAddress: *mut super::super::super::Foundation::MDL,
// }

// UNSUPPORTED Rust 895:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_11_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 901:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_11_1 {
//     pub Length: u32,
//     pub CompletionFilter: u32,
//     pub Spare1: u32,
//     pub Spare2: u32,
//     pub DirectoryBuffer: *mut core::ffi::c_void,
//     pub MdlAddress: *mut super::super::super::Foundation::MDL,
// }

// UNSUPPORTED Rust 912:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_11_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 918:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_11_0 {
//     pub Length: u32,
//     pub FileName: *mut super::super::super::super::Win32::Foundation::UNICODE_STRING,
//     pub FileInformationClass: super::FILE_INFORMATION_CLASS,
//     pub FileIndex: u32,
//     pub DirectoryBuffer: *mut core::ffi::c_void,
//     pub MdlAddress: *mut super::super::super::Foundation::MDL,
// }

// UNSUPPORTED Rust 929:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_11_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 935:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy, Default)]
// pub struct FLT_PARAMETERS_25 {
//     pub FileOffset: i64,
//     pub Length: u32,
//     pub LockKey: u32,
//     pub CheckForReadOperation: bool,
// }

// UNSUPPORTED Rust 944:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub union FLT_PARAMETERS_12 {
//     pub VerifyVolume: FLT_PARAMETERS_12_0,
//     pub Common: FLT_PARAMETERS_12_1,
//     pub Neither: FLT_PARAMETERS_12_2,
//     pub Buffered: FLT_PARAMETERS_12_3,
//     pub Direct: FLT_PARAMETERS_12_4,
// }

// UNSUPPORTED Rust 954:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_12 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 960:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_12_3 {
//     pub OutputBufferLength: u32,
//     pub InputBufferLength: u32,
//     pub FsControlCode: u32,
//     pub SystemBuffer: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 969:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_12_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 975:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy, Default)]
// pub struct FLT_PARAMETERS_12_1 {
//     pub OutputBufferLength: u32,
//     pub InputBufferLength: u32,
//     pub FsControlCode: u32,
// }

// UNSUPPORTED Rust 983:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_12_4 {
//     pub OutputBufferLength: u32,
//     pub InputBufferLength: u32,
//     pub FsControlCode: u32,
//     pub InputSystemBuffer: *mut core::ffi::c_void,
//     pub OutputBuffer: *mut core::ffi::c_void,
//     pub OutputMdlAddress: *mut super::super::super::Foundation::MDL,
// }

// UNSUPPORTED Rust 994:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_12_4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1000:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_12_2 {
//     pub OutputBufferLength: u32,
//     pub InputBufferLength: u32,
//     pub FsControlCode: u32,
//     pub InputBuffer: *mut core::ffi::c_void,
//     pub OutputBuffer: *mut core::ffi::c_void,
//     pub OutputMdlAddress: *mut super::super::super::Foundation::MDL,
// }

// UNSUPPORTED Rust 1011:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_12_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1017:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_12_0 {
//     pub Vpb: *mut super::super::super::Foundation::VPB,
//     pub DeviceObject: *mut super::super::super::Foundation::DEVICE_OBJECT,
// }

// UNSUPPORTED Rust 1024:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_12_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1030:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_14 {
//     pub Length: *mut i64,
//     pub Key: u32,
//     pub ByteOffset: i64,
//     pub ProcessId: super::super::super::Foundation::PEPROCESS,
//     pub FailImmediately: bool,
//     pub ExclusiveLock: bool,
// }

// UNSUPPORTED Rust 1041:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_14 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1047:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_28 {
//     pub MdlChain: *mut super::super::super::Foundation::MDL,
// }

// UNSUPPORTED Rust 1053:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_28 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1059:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_27 {
//     pub FileOffset: i64,
//     pub Length: u32,
//     pub Key: u32,
//     pub MdlChain: *mut *mut super::super::super::Foundation::MDL,
// }

// UNSUPPORTED Rust 1068:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_27 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1074:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_30 {
//     pub FileOffset: i64,
//     pub MdlChain: *mut super::super::super::Foundation::MDL,
// }

// UNSUPPORTED Rust 1081:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_30 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1087:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy, Default)]
// pub struct FLT_PARAMETERS_31 {
//     pub DeviceType: u32,
// }

// UNSUPPORTED Rust 1093:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_26 {
//     pub Irp: *mut super::super::super::Foundation::IRP,
//     pub NetworkInformation: *mut super::FILE_NETWORK_OPEN_INFORMATION,
// }

// UNSUPPORTED Rust 1100:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_26 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1106:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_32 {
//     pub Argument1: *mut core::ffi::c_void,
//     pub Argument2: *mut core::ffi::c_void,
//     pub Argument3: *mut core::ffi::c_void,
//     pub Argument4: *mut core::ffi::c_void,
//     pub Argument5: *mut core::ffi::c_void,
//     pub Argument6: i64,
// }

// UNSUPPORTED Rust 1117:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1123:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub union FLT_PARAMETERS_20 {
//     pub StartDevice: FLT_PARAMETERS_20_0,
//     pub QueryDeviceRelations: FLT_PARAMETERS_20_1,
//     pub QueryInterface: FLT_PARAMETERS_20_2,
//     pub DeviceCapabilities: FLT_PARAMETERS_20_3,
//     pub FilterResourceRequirements: FLT_PARAMETERS_20_4,
//     pub ReadWriteConfig: FLT_PARAMETERS_20_5,
//     pub SetLock: FLT_PARAMETERS_20_6,
//     pub QueryId: FLT_PARAMETERS_20_7,
//     pub QueryDeviceText: FLT_PARAMETERS_20_8,
//     pub UsageNotification: FLT_PARAMETERS_20_9,
// }

// UNSUPPORTED Rust 1138:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_20 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1144:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_20_3 {
//     pub Capabilities: *mut super::super::super::System::SystemServices::DEVICE_CAPABILITIES,
// }

// UNSUPPORTED Rust 1150:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_20_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1156:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_20_4 {
//     pub IoResourceRequirementList: *mut super::super::super::System::SystemServices::IO_RESOURCE_REQUIREMENTS_LIST,
// }

// UNSUPPORTED Rust 1162:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_20_4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1168:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy, Default)]
// pub struct FLT_PARAMETERS_20_1 {
//     pub Type: super::super::super::System::SystemServices::DEVICE_RELATION_TYPE,
// }

// UNSUPPORTED Rust 1174:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy, Default)]
// pub struct FLT_PARAMETERS_20_8 {
//     pub DeviceTextType: super::super::super::System::SystemServices::DEVICE_TEXT_TYPE,
//     pub LocaleId: u32,
// }

// UNSUPPORTED Rust 1181:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy, Default)]
// pub struct FLT_PARAMETERS_20_7 {
//     pub IdType: super::super::super::System::SystemServices::BUS_QUERY_ID_TYPE,
// }

// UNSUPPORTED Rust 1187:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_20_2 {
//     pub InterfaceType: *const windows_sys::core::GUID,
//     pub Size: u16,
//     pub Version: u16,
//     pub Interface: *mut super::super::super::System::SystemServices::INTERFACE,
//     pub InterfaceSpecificData: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1197:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_20_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1203:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_20_5 {
//     pub WhichSpace: u32,
//     pub Buffer: *mut core::ffi::c_void,
//     pub Offset: u32,
//     pub Length: u32,
// }

// UNSUPPORTED Rust 1212:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_20_5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1218:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy, Default)]
// pub struct FLT_PARAMETERS_20_6 {
//     pub Lock: bool,
// }

// UNSUPPORTED Rust 1224:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_20_0 {
//     pub AllocatedResources: *mut super::super::super::System::SystemServices::CM_RESOURCE_LIST,
//     pub AllocatedResourcesTranslated: *mut super::super::super::System::SystemServices::CM_RESOURCE_LIST,
// }

// UNSUPPORTED Rust 1231:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_20_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1237:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_20_9 {
//     pub InPath: bool,
//     pub Reserved: [bool; 3],
//     pub Type: super::super::super::System::SystemServices::DEVICE_USAGE_NOTIFICATION_TYPE,
// }

// UNSUPPORTED Rust 1245:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_20_9 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1251:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_29 {
//     pub FileOffset: i64,
//     pub Length: u32,
//     pub Key: u32,
//     pub MdlChain: *mut *mut super::super::super::Foundation::MDL,
// }

// UNSUPPORTED Rust 1260:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_29 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1266:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_7 {
//     pub Length: u32,
//     pub EaList: *mut core::ffi::c_void,
//     pub EaListLength: u32,
//     pub EaIndex: u32,
//     pub EaBuffer: *mut core::ffi::c_void,
//     pub MdlAddress: *mut super::super::super::Foundation::MDL,
// }

// UNSUPPORTED Rust 1277:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_7 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1283:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_5 {
//     pub Length: u32,
//     pub FileInformationClass: super::FILE_INFORMATION_CLASS,
//     pub InfoBuffer: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1291:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1297:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_24 {
//     pub Irp: *mut super::super::super::Foundation::IRP,
//     pub FileInformation: *mut core::ffi::c_void,
//     pub Length: *mut u32,
//     pub FileInformationClass: super::FILE_INFORMATION_CLASS,
// }

// UNSUPPORTED Rust 1306:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_24 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1312:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_18 {
//     pub Length: u32,
//     pub StartSid: super::super::super::super::Win32::Security::PSID,
//     pub SidList: *mut super::FILE_GET_QUOTA_INFORMATION,
//     pub SidListLength: u32,
//     pub QuotaBuffer: *mut core::ffi::c_void,
//     pub MdlAddress: *mut super::super::super::Foundation::MDL,
// }

// UNSUPPORTED Rust 1323:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_18 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1329:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_15 {
//     pub SecurityInformation: u32,
//     pub Length: u32,
//     pub SecurityBuffer: *mut core::ffi::c_void,
//     pub MdlAddress: *mut super::super::super::Foundation::MDL,
// }

// UNSUPPORTED Rust 1338:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_15 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1344:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_9 {
//     pub Length: u32,
//     pub FsInformationClass: super::FS_INFORMATION_CLASS,
//     pub VolumeBuffer: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1352:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_9 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1358:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_3 {
//     pub Length: u32,
//     pub Key: u32,
//     pub ByteOffset: i64,
//     pub ReadBuffer: *mut core::ffi::c_void,
//     pub MdlAddress: *mut super::super::super::Foundation::MDL,
// }

// UNSUPPORTED Rust 1368:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1374:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_23 {
//     pub ResourceToRelease: *mut super::super::super::Foundation::ERESOURCE,
// }

// UNSUPPORTED Rust 1380:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_23 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1386:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_8 {
//     pub Length: u32,
//     pub EaBuffer: *mut core::ffi::c_void,
//     pub MdlAddress: *mut super::super::super::Foundation::MDL,
// }

// UNSUPPORTED Rust 1394:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_8 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1400:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_6 {
//     pub Length: u32,
//     pub FileInformationClass: super::FILE_INFORMATION_CLASS,
//     pub ParentOfTarget: *mut super::super::super::Foundation::FILE_OBJECT,
//     pub Anonymous: FLT_PARAMETERS_6_0,
//     pub InfoBuffer: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1410:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_6 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1416:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub union FLT_PARAMETERS_6_0 {
//     pub Anonymous: FLT_PARAMETERS_6_0_0,
//     pub ClusterCount: u32,
//     pub DeleteHandle: super::super::super::super::Win32::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 1424:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_6_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1430:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy, Default)]
// pub struct FLT_PARAMETERS_6_0_0 {
//     pub ReplaceIfExists: bool,
//     pub AdvanceOnly: bool,
// }

// UNSUPPORTED Rust 1437:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_19 {
//     pub Length: u32,
//     pub QuotaBuffer: *mut core::ffi::c_void,
//     pub MdlAddress: *mut super::super::super::Foundation::MDL,
// }

// UNSUPPORTED Rust 1445:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_19 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1451:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_16 {
//     pub SecurityInformation: u32,
//     pub SecurityDescriptor: super::super::super::super::Win32::Security::PSECURITY_DESCRIPTOR,
// }

// UNSUPPORTED Rust 1458:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_16 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1464:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_10 {
//     pub Length: u32,
//     pub FsInformationClass: super::FS_INFORMATION_CLASS,
//     pub VolumeBuffer: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1472:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_10 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1478:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_17 {
//     pub ProviderId: usize,
//     pub DataPath: *mut core::ffi::c_void,
//     pub BufferSize: u32,
//     pub Buffer: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1487:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_17 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1493:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_PARAMETERS_4 {
//     pub Length: u32,
//     pub Key: u32,
//     pub ByteOffset: i64,
//     pub WriteBuffer: *mut core::ffi::c_void,
//     pub MdlAddress: *mut super::super::super::Foundation::MDL,
// }

// UNSUPPORTED Rust 1503:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_PARAMETERS_4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FLT_PORT_CONNECT`: UInt = 1u;
public typealias `FLT_POSTOP_CALLBACK_STATUS` = Int;
public const val `FLT_POSTOP_DISALLOW_FSFILTER_IO`: `FLT_POSTOP_CALLBACK_STATUS` = 2;
public const val `FLT_POSTOP_FINISHED_PROCESSING`: `FLT_POSTOP_CALLBACK_STATUS` = 0;
public const val `FLT_POSTOP_MORE_PROCESSING_REQUIRED`: `FLT_POSTOP_CALLBACK_STATUS` = 1;
public typealias `FLT_PREOP_CALLBACK_STATUS` = Int;
public const val `FLT_PREOP_COMPLETE`: `FLT_PREOP_CALLBACK_STATUS` = 4;
public const val `FLT_PREOP_DISALLOW_FASTIO`: `FLT_PREOP_CALLBACK_STATUS` = 3;
public const val `FLT_PREOP_DISALLOW_FSFILTER_IO`: `FLT_PREOP_CALLBACK_STATUS` = 6;
public const val `FLT_PREOP_PENDING`: `FLT_PREOP_CALLBACK_STATUS` = 2;
public const val `FLT_PREOP_SUCCESS_NO_CALLBACK`: `FLT_PREOP_CALLBACK_STATUS` = 1;
public const val `FLT_PREOP_SUCCESS_WITH_CALLBACK`: `FLT_PREOP_CALLBACK_STATUS` = 0;
public const val `FLT_PREOP_SYNCHRONIZE`: `FLT_PREOP_CALLBACK_STATUS` = 5;
public const val `FLT_PUSH_LOCK_DISABLE_AUTO_BOOST`: UInt = 2u;
public const val `FLT_PUSH_LOCK_ENABLE_AUTO_BOOST`: UInt = 1u;
public const val `FLT_PUSH_LOCK_VALID_FLAGS`: UInt = 3u;
// UNSUPPORTED Rust 1525:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_Storage_InstallableFileSystems", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_REGISTRATION {
//     pub Size: u16,
//     pub Version: u16,
//     pub Flags: u32,
//     pub ContextRegistration: *const FLT_CONTEXT_REGISTRATION,
//     pub OperationRegistration: *const FLT_OPERATION_REGISTRATION,
//     pub FilterUnloadCallback: PFLT_FILTER_UNLOAD_CALLBACK,
//     pub InstanceSetupCallback: PFLT_INSTANCE_SETUP_CALLBACK,
//     pub InstanceQueryTeardownCallback: PFLT_INSTANCE_QUERY_TEARDOWN_CALLBACK,
//     pub InstanceTeardownStartCallback: PFLT_INSTANCE_TEARDOWN_CALLBACK,
//     pub InstanceTeardownCompleteCallback: PFLT_INSTANCE_TEARDOWN_CALLBACK,
//     pub GenerateFileNameCallback: PFLT_GENERATE_FILE_NAME,
//     pub NormalizeNameComponentCallback: PFLT_NORMALIZE_NAME_COMPONENT,
//     pub NormalizeContextCleanupCallback: PFLT_NORMALIZE_CONTEXT_CLEANUP,
//     pub TransactionNotificationCallback: PFLT_TRANSACTION_NOTIFICATION_CALLBACK,
//     pub NormalizeNameComponentExCallback: PFLT_NORMALIZE_NAME_COMPONENT_EX,
//     pub SectionNotificationCallback: PFLT_SECTION_CONFLICT_NOTIFICATION_CALLBACK,
// }

// UNSUPPORTED Rust 1546:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_Storage_InstallableFileSystems", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_REGISTRATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FLT_REGISTRATION_VERSION`: UInt = 515u;
public const val `FLT_REGISTRATION_VERSION_0200`: UInt = 512u;
public const val `FLT_REGISTRATION_VERSION_0201`: UInt = 513u;
public const val `FLT_REGISTRATION_VERSION_0202`: UInt = 514u;
public const val `FLT_REGISTRATION_VERSION_0203`: UInt = 515u;
// UNSUPPORTED Rust 1557:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FLT_RELATED_CONTEXTS {
//     pub VolumeContext: PFLT_CONTEXT,
//     pub InstanceContext: PFLT_CONTEXT,
//     pub FileContext: PFLT_CONTEXT,
//     pub StreamContext: PFLT_CONTEXT,
//     pub StreamHandleContext: PFLT_CONTEXT,
//     pub TransactionContext: PFLT_CONTEXT,
// }

// UNSUPPORTED Rust 1567:1: declaration Impl has no candidate rule
// impl Default for FLT_RELATED_CONTEXTS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1572:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FLT_RELATED_CONTEXTS_EX {
//     pub VolumeContext: PFLT_CONTEXT,
//     pub InstanceContext: PFLT_CONTEXT,
//     pub FileContext: PFLT_CONTEXT,
//     pub StreamContext: PFLT_CONTEXT,
//     pub StreamHandleContext: PFLT_CONTEXT,
//     pub TransactionContext: PFLT_CONTEXT,
//     pub SectionContext: PFLT_CONTEXT,
// }

// UNSUPPORTED Rust 1583:1: declaration Impl has no candidate rule
// impl Default for FLT_RELATED_CONTEXTS_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1588:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FLT_RELATED_OBJECTS {
//     pub Size: u16,
//     pub TransactionContext: u16,
//     pub Filter: PFLT_FILTER,
//     pub Volume: PFLT_VOLUME,
//     pub Instance: PFLT_INSTANCE,
//     pub FileObject: *const super::super::super::Foundation::FILE_OBJECT,
//     pub Transaction: *const super::super::super::Foundation::KTRANSACTION,
// }

// UNSUPPORTED Rust 1600:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FLT_RELATED_OBJECTS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FLT_SECTION_CONTEXT`: UInt = 64u;
public const val `FLT_SET_CONTEXT_KEEP_IF_EXISTS`: `FLT_SET_CONTEXT_OPERATION` = 1;
public typealias `FLT_SET_CONTEXT_OPERATION` = Int;
public const val `FLT_SET_CONTEXT_REPLACE_IF_EXISTS`: `FLT_SET_CONTEXT_OPERATION` = 0;
public const val `FLT_STREAMHANDLE_CONTEXT`: UInt = 16u;
public const val `FLT_STREAM_CONTEXT`: UInt = 8u;
// UNSUPPORTED Rust 1612:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FLT_TAG_DATA_BUFFER {
//     pub FileTag: u32,
//     pub TagDataLength: u16,
//     pub UnparsedNameLength: u16,
//     pub Anonymous: FLT_TAG_DATA_BUFFER_0,
// }

// UNSUPPORTED Rust 1620:1: declaration Impl has no candidate rule
// impl Default for FLT_TAG_DATA_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1625:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FLT_TAG_DATA_BUFFER_0 {
//     pub SymbolicLinkReparseBuffer: FLT_TAG_DATA_BUFFER_0_0,
//     pub MountPointReparseBuffer: FLT_TAG_DATA_BUFFER_0_1,
//     pub GenericReparseBuffer: FLT_TAG_DATA_BUFFER_0_2,
//     pub GenericGUIDReparseBuffer: FLT_TAG_DATA_BUFFER_0_3,
// }

// UNSUPPORTED Rust 1633:1: declaration Impl has no candidate rule
// impl Default for FLT_TAG_DATA_BUFFER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1638:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FLT_TAG_DATA_BUFFER_0_3 {
//     pub TagGuid: windows_sys::core::GUID,
//     pub DataBuffer: [u8; 1],
// }

// UNSUPPORTED Rust 1644:1: declaration Impl has no candidate rule
// impl Default for FLT_TAG_DATA_BUFFER_0_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1649:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FLT_TAG_DATA_BUFFER_0_2 {
//     pub DataBuffer: [u8; 1],
// }

// UNSUPPORTED Rust 1654:1: declaration Impl has no candidate rule
// impl Default for FLT_TAG_DATA_BUFFER_0_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1659:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FLT_TAG_DATA_BUFFER_0_1 {
//     pub SubstituteNameOffset: u16,
//     pub SubstituteNameLength: u16,
//     pub PrintNameOffset: u16,
//     pub PrintNameLength: u16,
//     pub PathBuffer: [u16; 1],
// }

// UNSUPPORTED Rust 1668:1: declaration Impl has no candidate rule
// impl Default for FLT_TAG_DATA_BUFFER_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1673:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FLT_TAG_DATA_BUFFER_0_0 {
//     pub SubstituteNameOffset: u16,
//     pub SubstituteNameLength: u16,
//     pub PrintNameOffset: u16,
//     pub PrintNameLength: u16,
//     pub Flags: u32,
//     pub PathBuffer: [u16; 1],
// }

// UNSUPPORTED Rust 1683:1: declaration Impl has no candidate rule
// impl Default for FLT_TAG_DATA_BUFFER_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FLT_TRANSACTION_CONTEXT`: UInt = 32u;
public const val `FLT_VALID_FILE_NAME_FLAGS`: UInt = 4278190080u;
public const val `FLT_VALID_FILE_NAME_FORMATS`: UInt = 255u;
public const val `FLT_VALID_FILE_NAME_QUERY_METHODS`: UInt = 65280u;
public const val `FLT_VOLUME_CONTEXT`: UInt = 1u;
// UNSUPPORTED Rust 1693:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FLT_VOLUME_PROPERTIES {
//     pub DeviceType: u32,
//     pub DeviceCharacteristics: u32,
//     pub DeviceObjectFlags: u32,
//     pub AlignmentRequirement: u32,
//     pub SectorSize: u16,
//     pub Flags: u16,
//     pub FileSystemDriverName: super::super::super::super::Win32::Foundation::UNICODE_STRING,
//     pub FileSystemDeviceName: super::super::super::super::Win32::Foundation::UNICODE_STRING,
//     pub RealDeviceName: super::super::super::super::Win32::Foundation::UNICODE_STRING,
// }

// UNSUPPORTED Rust 1706:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_ECP_FLT_CREATEFILE_TARGET: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xce08041d_f411_447f_b70d_ccee45c23fac);

public const val `IRP_MJ_ACQUIRE_FOR_CC_FLUSH`: UShort = 65531u;
public const val `IRP_MJ_ACQUIRE_FOR_MOD_WRITE`: UShort = 65533u;
public const val `IRP_MJ_ACQUIRE_FOR_SECTION_SYNCHRONIZATION`: UShort = 65535u;
public const val `IRP_MJ_FAST_IO_CHECK_IF_POSSIBLE`: UShort = 65523u;
public const val `IRP_MJ_MDL_READ`: UShort = 65521u;
public const val `IRP_MJ_MDL_READ_COMPLETE`: UShort = 65520u;
public const val `IRP_MJ_MDL_WRITE_COMPLETE`: UShort = 65518u;
public const val `IRP_MJ_NETWORK_QUERY_OPEN`: UShort = 65522u;
public const val `IRP_MJ_OPERATION_END`: UShort = 128u;
public const val `IRP_MJ_PREPARE_MDL_WRITE`: UShort = 65519u;
public const val `IRP_MJ_QUERY_OPEN`: UShort = 65529u;
public const val `IRP_MJ_RELEASE_FOR_CC_FLUSH`: UShort = 65530u;
public const val `IRP_MJ_RELEASE_FOR_MOD_WRITE`: UShort = 65532u;
public const val `IRP_MJ_RELEASE_FOR_SECTION_SYNCHRONIZATION`: UShort = 65534u;
public const val `IRP_MJ_VOLUME_DISMOUNT`: UShort = 65516u;
public const val `IRP_MJ_VOLUME_MOUNT`: UShort = 65517u;
// UNSUPPORTED Rust 1723:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// pub type PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE = Option<unsafe extern "system" fn(callbackdata: *const FLT_CALLBACK_DATA, context: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 1725:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// pub type PFLTOPLOCK_WAIT_COMPLETE_ROUTINE = Option<unsafe extern "system" fn(callbackdata: *const FLT_CALLBACK_DATA, context: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 1727:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// pub type PFLT_CALLBACK_DATA_QUEUE_ACQUIRE = Option<unsafe extern "system" fn(cbdq: *mut FLT_CALLBACK_DATA_QUEUE, irql: *mut u8)>;

// UNSUPPORTED Rust 1729:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// pub type PFLT_CALLBACK_DATA_QUEUE_COMPLETE_CANCELED_IO = Option<unsafe extern "system" fn(cbdq: *mut FLT_CALLBACK_DATA_QUEUE, cbd: *mut FLT_CALLBACK_DATA)>;

// UNSUPPORTED Rust 1731:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// pub type PFLT_CALLBACK_DATA_QUEUE_INSERT_IO = Option<unsafe extern "system" fn(cbdq: *mut FLT_CALLBACK_DATA_QUEUE, cbd: *const FLT_CALLBACK_DATA, insertcontext: *const core::ffi::c_void) -> super::super::super::super::Win32::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1733:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// pub type PFLT_CALLBACK_DATA_QUEUE_PEEK_NEXT_IO = Option<unsafe extern "system" fn(cbdq: *const FLT_CALLBACK_DATA_QUEUE, cbd: *const FLT_CALLBACK_DATA, peekcontext: *const core::ffi::c_void) -> *mut FLT_CALLBACK_DATA>;

// UNSUPPORTED Rust 1735:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// pub type PFLT_CALLBACK_DATA_QUEUE_RELEASE = Option<unsafe extern "system" fn(cbdq: *mut FLT_CALLBACK_DATA_QUEUE, irql: u8)>;

// UNSUPPORTED Rust 1737:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// pub type PFLT_CALLBACK_DATA_QUEUE_REMOVE_IO = Option<unsafe extern "system" fn(cbdq: *mut FLT_CALLBACK_DATA_QUEUE, cbd: *const FLT_CALLBACK_DATA)>;

// UNSUPPORTED Rust 1739:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// pub type PFLT_COMPLETED_ASYNC_IO_CALLBACK = Option<unsafe extern "system" fn(callbackdata: *const FLT_CALLBACK_DATA, context: PFLT_CONTEXT)>;

// UNSUPPORTED Rust 1741:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// pub type PFLT_COMPLETE_CANCELED_CALLBACK = Option<unsafe extern "system" fn(callbackdata: *const FLT_CALLBACK_DATA)>;

// UNSUPPORTED Rust 1743:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// pub type PFLT_COMPLETE_LOCK_CALLBACK_DATA_ROUTINE = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, callbackdata: *const FLT_CALLBACK_DATA) -> super::super::super::super::Win32::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1745:1: generic scalar type unsupported
// pub type PFLT_CONNECT_NOTIFY = Option<unsafe extern "system" fn(clientport: PFLT_PORT, serverportcookie: *const core::ffi::c_void, connectioncontext: *const core::ffi::c_void, sizeofcontext: u32, connectionportcookie: *mut *mut core::ffi::c_void) -> super::super::super::super::Win32::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1746:1: non-scalar type Ptr unsupported
// pub type PFLT_CONTEXT = *mut core::ffi::c_void;

// UNSUPPORTED Rust 1747:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Wdk_Foundation")]
// pub type PFLT_CONTEXT_ALLOCATE_CALLBACK = Option<unsafe extern "system" fn(pooltype: super::super::super::Foundation::POOL_TYPE, size: usize, contexttype: u16) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 1749:1: generic scalar type unsupported
// pub type PFLT_CONTEXT_CLEANUP_CALLBACK = Option<unsafe extern "system" fn(context: PFLT_CONTEXT, contexttype: u16)>;

// UNSUPPORTED Rust 1750:1: generic scalar type unsupported
// pub type PFLT_CONTEXT_FREE_CALLBACK = Option<unsafe extern "system" fn(pool: *const core::ffi::c_void, contexttype: u16)>;

public typealias `PFLT_DEFERRED_IO_WORKITEM` = Long;
// UNSUPPORTED Rust 1752:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// pub type PFLT_DEFERRED_IO_WORKITEM_ROUTINE = Option<unsafe extern "system" fn(fltworkitem: PFLT_DEFERRED_IO_WORKITEM, callbackdata: *const FLT_CALLBACK_DATA, context: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 1754:1: generic scalar type unsupported
// pub type PFLT_DISCONNECT_NOTIFY = Option<unsafe extern "system" fn(connectioncookie: *const core::ffi::c_void)>;

public typealias `PFLT_FILTER` = Long;
// UNSUPPORTED Rust 1756:1: generic scalar type unsupported
// pub type PFLT_FILTER_UNLOAD_CALLBACK = Option<unsafe extern "system" fn(flags: u32) -> super::super::super::super::Win32::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1757:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// pub type PFLT_GENERATE_FILE_NAME = Option<unsafe extern "system" fn(instance: PFLT_INSTANCE, fileobject: *const super::super::super::Foundation::FILE_OBJECT, callbackdata: *const FLT_CALLBACK_DATA, nameoptions: u32, cachefilenameinformation: *mut bool, filename: *mut FLT_NAME_CONTROL) -> super::super::super::super::Win32::Foundation::NTSTATUS>;

public typealias `PFLT_GENERIC_WORKITEM` = Long;
// UNSUPPORTED Rust 1760:1: generic scalar type unsupported
// pub type PFLT_GENERIC_WORKITEM_ROUTINE = Option<unsafe extern "system" fn(fltworkitem: PFLT_GENERIC_WORKITEM, fltobject: *const core::ffi::c_void, context: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 1761:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// pub type PFLT_GET_OPERATION_STATUS_CALLBACK = Option<unsafe extern "system" fn(fltobjects: *const FLT_RELATED_OBJECTS, iopbsnapshot: *const FLT_IO_PARAMETER_BLOCK, operationstatus: super::super::super::super::Win32::Foundation::NTSTATUS, requestercontext: *const core::ffi::c_void)>;

public typealias `PFLT_INSTANCE` = Long;
// UNSUPPORTED Rust 1764:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// pub type PFLT_INSTANCE_QUERY_TEARDOWN_CALLBACK = Option<unsafe extern "system" fn(fltobjects: *const FLT_RELATED_OBJECTS, flags: u32) -> super::super::super::super::Win32::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1766:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_Storage_InstallableFileSystems", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// pub type PFLT_INSTANCE_SETUP_CALLBACK = Option<unsafe extern "system" fn(fltobjects: *const FLT_RELATED_OBJECTS, flags: u32, volumedevicetype: u32, volumefilesystemtype: super::super::super::super::Win32::Storage::InstallableFileSystems::FLT_FILESYSTEM_TYPE) -> super::super::super::super::Win32::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1768:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// pub type PFLT_INSTANCE_TEARDOWN_CALLBACK = Option<unsafe extern "system" fn(fltobjects: *const FLT_RELATED_OBJECTS, reason: u32)>;

// UNSUPPORTED Rust 1770:1: generic scalar type unsupported
// pub type PFLT_MESSAGE_NOTIFY = Option<unsafe extern "system" fn(portcookie: *const core::ffi::c_void, inputbuffer: *const core::ffi::c_void, inputbufferlength: u32, outputbuffer: *mut core::ffi::c_void, outputbufferlength: u32, returnoutputbufferlength: *mut u32) -> super::super::super::super::Win32::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1771:1: generic scalar type unsupported
// pub type PFLT_NORMALIZE_CONTEXT_CLEANUP = Option<unsafe extern "system" fn(normalizationcontext: *const *const core::ffi::c_void)>;

// UNSUPPORTED Rust 1772:1: generic scalar type unsupported
// pub type PFLT_NORMALIZE_NAME_COMPONENT = Option<unsafe extern "system" fn(instance: PFLT_INSTANCE, parentdirectory: *const super::super::super::super::Win32::Foundation::UNICODE_STRING, volumenamelength: u16, component: *const super::super::super::super::Win32::Foundation::UNICODE_STRING, expandcomponentname: *mut super::FILE_NAMES_INFORMATION, expandcomponentnamelength: u32, flags: u32, normalizationcontext: *mut *mut core::ffi::c_void) -> super::super::super::super::Win32::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1773:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// pub type PFLT_NORMALIZE_NAME_COMPONENT_EX = Option<unsafe extern "system" fn(instance: PFLT_INSTANCE, fileobject: *const super::super::super::Foundation::FILE_OBJECT, parentdirectory: *const super::super::super::super::Win32::Foundation::UNICODE_STRING, volumenamelength: u16, component: *const super::super::super::super::Win32::Foundation::UNICODE_STRING, expandcomponentname: *mut super::FILE_NAMES_INFORMATION, expandcomponentnamelength: u32, flags: u32, normalizationcontext: *mut *mut core::ffi::c_void) -> super::super::super::super::Win32::Foundation::NTSTATUS>;

public typealias `PFLT_PORT` = Long;
// UNSUPPORTED Rust 1776:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// pub type PFLT_POST_OPERATION_CALLBACK = Option<unsafe extern "system" fn(data: *mut FLT_CALLBACK_DATA, fltobjects: *const FLT_RELATED_OBJECTS, completioncontext: *const core::ffi::c_void, flags: u32) -> FLT_POSTOP_CALLBACK_STATUS>;

// UNSUPPORTED Rust 1778:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// pub type PFLT_PRE_OPERATION_CALLBACK = Option<unsafe extern "system" fn(data: *mut FLT_CALLBACK_DATA, fltobjects: *const FLT_RELATED_OBJECTS, completioncontext: *mut *mut core::ffi::c_void) -> FLT_PREOP_CALLBACK_STATUS>;

// UNSUPPORTED Rust 1780:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// pub type PFLT_SECTION_CONFLICT_NOTIFICATION_CALLBACK = Option<unsafe extern "system" fn(instance: PFLT_INSTANCE, sectioncontext: PFLT_CONTEXT, data: *const FLT_CALLBACK_DATA) -> super::super::super::super::Win32::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1782:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// pub type PFLT_TRANSACTION_NOTIFICATION_CALLBACK = Option<unsafe extern "system" fn(fltobjects: *const FLT_RELATED_OBJECTS, transactioncontext: PFLT_CONTEXT, notificationmask: u32) -> super::super::super::super::Win32::Foundation::NTSTATUS>;

public typealias `PFLT_VOLUME` = Long;
public const val `VOL_PROP_FL_DAX_VOLUME`: UInt = 1u;
