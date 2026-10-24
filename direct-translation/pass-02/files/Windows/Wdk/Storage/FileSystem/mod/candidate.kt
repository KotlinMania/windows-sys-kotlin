// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Mod has no candidate rule
// #[cfg(feature = "Wdk_Storage_FileSystem_Minifilters")]
// pub mod Minifilters;

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn ApplyControlToken(phcontext : *const SecHandle, pinput : *const SecBufferDesc) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcAsyncCopyRead(fileobject : *const super::super::Foundation:: FILE_OBJECT, fileoffset : *const i64, length : u32, wait : bool, buffer : *mut core::ffi::c_void, iostatus : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, ioissuerthread : super::super::Foundation:: PETHREAD, asyncreadcontext : *const CC_ASYNC_READ_CONTEXT) -> bool);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcCanIWrite(fileobject : *const super::super::Foundation:: FILE_OBJECT, bytestowrite : u32, wait : bool, retrying : u8) -> bool);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_IO"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcCoherencyFlushAndPurgeCache(sectionobjectpointer : *const super::super::Foundation:: SECTION_OBJECT_POINTERS, fileoffset : *const i64, length : u32, iostatus : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, flags : u32));

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcCopyRead(fileobject : *const super::super::Foundation:: FILE_OBJECT, fileoffset : *const i64, length : u32, wait : bool, buffer : *mut core::ffi::c_void, iostatus : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK) -> bool);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcCopyReadEx(fileobject : *const super::super::Foundation:: FILE_OBJECT, fileoffset : *const i64, length : u32, wait : bool, buffer : *mut core::ffi::c_void, iostatus : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, ioissuerthread : super::super::Foundation:: PETHREAD) -> bool);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcCopyWrite(fileobject : *const super::super::Foundation:: FILE_OBJECT, fileoffset : *const i64, length : u32, wait : bool, buffer : *const core::ffi::c_void) -> bool);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcCopyWriteEx(fileobject : *const super::super::Foundation:: FILE_OBJECT, fileoffset : *const i64, length : u32, wait : bool, buffer : *const core::ffi::c_void, ioissuerthread : super::super::Foundation:: PETHREAD) -> bool);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcCopyWriteWontFlush(fileobject : *const super::super::Foundation:: FILE_OBJECT, fileoffset : *const i64, length : u32) -> bool);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcDeferWrite(fileobject : *const super::super::Foundation:: FILE_OBJECT, postroutine : PCC_POST_DEFERRED_WRITE, context1 : *const core::ffi::c_void, context2 : *const core::ffi::c_void, bytestowrite : u32, retrying : bool));

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn CcErrorCallbackRoutine(context : *const CC_ERROR_CALLBACK_CONTEXT) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcFastCopyRead(fileobject : *const super::super::Foundation:: FILE_OBJECT, fileoffset : u32, length : u32, pagecount : u32, buffer : *mut core::ffi::c_void, iostatus : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK));

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcFastCopyWrite(fileobject : *const super::super::Foundation:: FILE_OBJECT, fileoffset : u32, length : u32, buffer : *const core::ffi::c_void));

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_IO"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcFlushCache(sectionobjectpointer : *const super::super::Foundation:: SECTION_OBJECT_POINTERS, fileoffset : *const i64, length : u32, iostatus : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK));

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcGetDirtyPages(loghandle : *const core::ffi::c_void, dirtypageroutine : PDIRTY_PAGE_ROUTINE, context1 : *const core::ffi::c_void, context2 : *const core::ffi::c_void) -> i64);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcGetFileObjectFromBcb(bcb : *const core::ffi::c_void) -> *mut super::super::Foundation:: FILE_OBJECT);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcGetFileObjectFromSectionPtrs(sectionobjectpointer : *const super::super::Foundation:: SECTION_OBJECT_POINTERS) -> *mut super::super::Foundation:: FILE_OBJECT);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcGetFileObjectFromSectionPtrsRef(sectionobjectpointer : *const super::super::Foundation:: SECTION_OBJECT_POINTERS) -> *mut super::super::Foundation:: FILE_OBJECT);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn CcGetFlushedValidData(sectionobjectpointer : *const super::super::Foundation:: SECTION_OBJECT_POINTERS, bcblistheld : bool) -> i64);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcInitializeCacheMap(fileobject : *const super::super::Foundation:: FILE_OBJECT, filesizes : *const CC_FILE_SIZES, pinaccess : bool, callbacks : *const CACHE_MANAGER_CALLBACKS, lazywritecontext : *const core::ffi::c_void));

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcInitializeCacheMapEx(fileobject : *const super::super::Foundation:: FILE_OBJECT, filesizes : *const CC_FILE_SIZES, pinaccess : bool, callbacks : *const CACHE_MANAGER_CALLBACKS, lazywritecontext : *const core::ffi::c_void, flags : u32));

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn CcIsCacheManagerCallbackNeeded(status : super::super::super::Win32::Foundation:: NTSTATUS) -> bool);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcIsThereDirtyData(vpb : *const super::super::Foundation:: VPB) -> bool);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcIsThereDirtyDataEx(vpb : *const super::super::Foundation:: VPB, numberofdirtypages : *const u32) -> bool);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcMapData(fileobject : *const super::super::Foundation:: FILE_OBJECT, fileoffset : *const i64, length : u32, flags : u32, bcb : *mut *mut core::ffi::c_void, buffer : *mut *mut core::ffi::c_void) -> bool);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcMdlRead(fileobject : *const super::super::Foundation:: FILE_OBJECT, fileoffset : *const i64, length : u32, mdlchain : *mut *mut super::super::Foundation:: MDL, iostatus : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK));

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcMdlReadComplete(fileobject : *const super::super::Foundation:: FILE_OBJECT, mdlchain : *const super::super::Foundation:: MDL));

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcMdlWriteAbort(fileobject : *const super::super::Foundation:: FILE_OBJECT, mdlchain : *const super::super::Foundation:: MDL));

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcMdlWriteComplete(fileobject : *const super::super::Foundation:: FILE_OBJECT, fileoffset : *const i64, mdlchain : *const super::super::Foundation:: MDL));

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcPinMappedData(fileobject : *const super::super::Foundation:: FILE_OBJECT, fileoffset : *const i64, length : u32, flags : u32, bcb : *mut *mut core::ffi::c_void) -> bool);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcPinRead(fileobject : *const super::super::Foundation:: FILE_OBJECT, fileoffset : *const i64, length : u32, flags : u32, bcb : *mut *mut core::ffi::c_void, buffer : *mut *mut core::ffi::c_void) -> bool);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcPrepareMdlWrite(fileobject : *const super::super::Foundation:: FILE_OBJECT, fileoffset : *const i64, length : u32, mdlchain : *mut *mut super::super::Foundation:: MDL, iostatus : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK));

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcPreparePinWrite(fileobject : *const super::super::Foundation:: FILE_OBJECT, fileoffset : *const i64, length : u32, zero : bool, flags : u32, bcb : *mut *mut core::ffi::c_void, buffer : *mut *mut core::ffi::c_void) -> bool);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn CcPurgeCacheSection(sectionobjectpointer : *const super::super::Foundation:: SECTION_OBJECT_POINTERS, fileoffset : *const i64, length : u32, flags : u32) -> bool);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn CcRemapBcb(bcb : *const core::ffi::c_void) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn CcRepinBcb(bcb : *const core::ffi::c_void));

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcScheduleReadAhead(fileobject : *const super::super::Foundation:: FILE_OBJECT, fileoffset : *const i64, length : u32));

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcScheduleReadAheadEx(fileobject : *const super::super::Foundation:: FILE_OBJECT, fileoffset : *const i64, length : u32, ioissuerthread : super::super::Foundation:: PETHREAD));

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcSetAdditionalCacheAttributes(fileobject : *const super::super::Foundation:: FILE_OBJECT, disablereadahead : bool, disablewritebehind : bool));

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcSetAdditionalCacheAttributesEx(fileobject : *const super::super::Foundation:: FILE_OBJECT, flags : u32));

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn CcSetBcbOwnerPointer(bcb : *const core::ffi::c_void, ownerpointer : *const core::ffi::c_void));

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcSetDirtyPageThreshold(fileobject : *const super::super::Foundation:: FILE_OBJECT, dirtypagethreshold : u32));

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn CcSetDirtyPinnedData(bcbvoid : *const core::ffi::c_void, lsn : *const i64));

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcSetFileSizes(fileobject : *const super::super::Foundation:: FILE_OBJECT, filesizes : *const CC_FILE_SIZES));

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcSetFileSizesEx(fileobject : *const super::super::Foundation:: FILE_OBJECT, filesizes : *const CC_FILE_SIZES) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcSetLogHandleForFile(fileobject : *const super::super::Foundation:: FILE_OBJECT, loghandle : *const core::ffi::c_void, flushtolsnroutine : PFLUSH_TO_LSN));

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcSetParallelFlushFile(fileobject : *const super::super::Foundation:: FILE_OBJECT, enableparallelflush : bool));

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcSetReadAheadGranularity(fileobject : *const super::super::Foundation:: FILE_OBJECT, granularity : u32));

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcUninitializeCacheMap(fileobject : *const super::super::Foundation:: FILE_OBJECT, truncatesize : *const i64, uninitializeevent : *const CACHE_UNINITIALIZE_EVENT) -> bool);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn CcUnpinData(bcb : *const core::ffi::c_void));

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn CcUnpinDataForThread(bcb : *const core::ffi::c_void, resourcethreadid : usize));

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntoskrnl.exe" "system" fn CcUnpinRepinnedBcb(bcb : *const core::ffi::c_void, writethrough : bool, iostatus : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK));

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn CcWaitForCurrentLazyWriterActivity() -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn CcZeroData(fileobject : *const super::super::Foundation:: FILE_OBJECT, startoffset : *const i64, endoffset : *const i64, wait : bool) -> bool);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn CompleteAuthToken(phcontext : *const SecHandle, ptoken : *const SecBufferDesc) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn ExDisableResourceBoostLite(resource : *const super::super::Foundation:: ERESOURCE));

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn ExQueryPoolBlockSize(poolblock : *const core::ffi::c_void, quotacharged : *mut bool) -> usize);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn ExportSecurityContext(phcontext : *const SecHandle, fflags : u32, ppackedcontext : *mut SecBuffer, ptoken : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlAcknowledgeEcp(ecpcontext : *const core::ffi::c_void));

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlAcquireFileExclusive(fileobject : *const super::super::Foundation:: FILE_OBJECT));

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlAddBaseMcbEntry(mcb : *mut BASE_MCB, vbn : i64, lbn : i64, sectorcount : i64) -> bool);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlAddBaseMcbEntryEx(mcb : *mut BASE_MCB, vbn : i64, lbn : i64, sectorcount : i64) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlAddLargeMcbEntry(mcb : *mut LARGE_MCB, vbn : i64, lbn : i64, sectorcount : i64) -> bool);

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlAddMcbEntry(mcb : *mut MCB, vbn : u32, lbn : u32, sectorcount : u32) -> bool);

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlAddToTunnelCache(cache : *mut TUNNEL, directorykey : u64, shortname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, longname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, keybyshortname : bool, datalength : u32, data : *const core::ffi::c_void));

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlAddToTunnelCacheEx(cache : *mut TUNNEL, directorykey : u64, shortname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, longname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, flags : u32, datalength : u32, data : *const core::ffi::c_void));

// UNSUPPORTED Rust 119:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlAllocateAePushLock(pooltype : super::super::Foundation:: POOL_TYPE, tag : u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlAllocateExtraCreateParameter(ecptype : *const windows_sys::core::GUID, sizeofcontext : u32, flags : u32, cleanupcallback : PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, pooltag : u32, ecpcontext : *mut *mut core::ffi::c_void) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 122:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlAllocateExtraCreateParameterFromLookasideList(ecptype : *const windows_sys::core::GUID, sizeofcontext : u32, flags : u32, cleanupcallback : PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, lookasidelist : *mut core::ffi::c_void, ecpcontext : *mut *mut core::ffi::c_void) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlAllocateExtraCreateParameterList(flags : u32, ecplist : *mut *mut super::super::Foundation:: ECP_LIST) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlAllocateFileLock(completelockirproutine : PCOMPLETE_LOCK_IRP_ROUTINE, unlockroutine : PUNLOCK_ROUTINE) -> *mut FILE_LOCK);

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlAllocateResource() -> *mut super::super::Foundation:: ERESOURCE);

// UNSUPPORTED Rust 129:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlAreNamesEqual(constantnamea : *const super::super::super::Win32::Foundation:: UNICODE_STRING, constantnameb : *const super::super::super::Win32::Foundation:: UNICODE_STRING, ignorecase : bool, upcasetable : *const u16) -> bool);

// UNSUPPORTED Rust 130:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlAreThereCurrentOrInProgressFileLocks(filelock : *const FILE_LOCK) -> bool);

// UNSUPPORTED Rust 132:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlAreThereWaitingFileLocks(filelock : *const FILE_LOCK) -> bool);

// UNSUPPORTED Rust 134:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlAreVolumeStartupApplicationsComplete() -> bool);

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlBalanceReads(targetdevice : *const super::super::Foundation:: DEVICE_OBJECT) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlCancellableWaitForMultipleObjects(count : u32, objectarray : *const *const core::ffi::c_void, waittype : super::super::super::Win32::System::Kernel:: WAIT_TYPE, timeout : *const i64, waitblockarray : *const super::super::Foundation:: KWAIT_BLOCK, irp : *const super::super::Foundation:: IRP) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 139:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlCancellableWaitForSingleObject(object : *const core::ffi::c_void, timeout : *const i64, irp : *const super::super::Foundation:: IRP) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 141:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlChangeBackingFileObject(currentfileobject : *const super::super::Foundation:: FILE_OBJECT, newfileobject : *const super::super::Foundation:: FILE_OBJECT, changebackingtype : FSRTL_CHANGE_BACKING_TYPE, flags : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 143:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlCheckLockForOplockRequest(filelock : *const FILE_LOCK, allocationsize : *const i64) -> bool);

// UNSUPPORTED Rust 145:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlCheckLockForReadAccess(filelock : *const FILE_LOCK, irp : *const super::super::Foundation:: IRP) -> bool);

// UNSUPPORTED Rust 147:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlCheckLockForWriteAccess(filelock : *const FILE_LOCK, irp : *const super::super::Foundation:: IRP) -> bool);

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlCheckOplock(oplock : *const *const core::ffi::c_void, irp : *const super::super::Foundation:: IRP, context : *const core::ffi::c_void, completionroutine : POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine : POPLOCK_FS_PREPOST_IRP) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 151:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlCheckOplockEx(oplock : *const *const core::ffi::c_void, irp : *const super::super::Foundation:: IRP, flags : u32, context : *const core::ffi::c_void, completionroutine : POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine : POPLOCK_FS_PREPOST_IRP) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 153:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlCheckOplockEx2(oplock : *const *const core::ffi::c_void, irp : *const super::super::Foundation:: IRP, flags : u32, flagsex2 : u32, completionroutinecontext : *const core::ffi::c_void, completionroutine : POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine : POPLOCK_FS_PREPOST_IRP, timeout : u64, notifycontext : *const core::ffi::c_void, notifyroutine : POPLOCK_NOTIFY_ROUTINE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 155:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlCheckUpperOplock(oplock : *const *const core::ffi::c_void, newloweroplockstate : u32, completionroutinecontext : *const core::ffi::c_void, completionroutine : POPLOCK_WAIT_COMPLETE_ROUTINE, prependroutine : POPLOCK_FS_PREPOST_IRP, flags : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 157:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlCopyRead(fileobject : *const super::super::Foundation:: FILE_OBJECT, fileoffset : *const i64, length : u32, wait : bool, lockkey : u32, buffer : *mut core::ffi::c_void, iostatus : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, deviceobject : *const super::super::Foundation:: DEVICE_OBJECT) -> bool);

// UNSUPPORTED Rust 159:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlCopyWrite(fileobject : *const super::super::Foundation:: FILE_OBJECT, fileoffset : *const i64, length : u32, wait : bool, lockkey : u32, buffer : *const core::ffi::c_void, iostatus : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, deviceobject : *const super::super::Foundation:: DEVICE_OBJECT) -> bool);

// UNSUPPORTED Rust 161:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlCreateSectionForDataScan(sectionhandle : *mut super::super::super::Win32::Foundation:: HANDLE, sectionobject : *mut *mut core::ffi::c_void, sectionfilesize : *mut i64, fileobject : *const super::super::Foundation:: FILE_OBJECT, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES, maximumsize : *const i64, sectionpageprotection : u32, allocationattributes : u32, flags : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 163:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlCurrentBatchOplock(oplock : *const *const core::ffi::c_void) -> bool);

// UNSUPPORTED Rust 164:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlCurrentOplock(oplock : *const *const core::ffi::c_void) -> bool);

// UNSUPPORTED Rust 165:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlCurrentOplockH(oplock : *const *const core::ffi::c_void) -> bool);

// UNSUPPORTED Rust 166:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlDeleteExtraCreateParameterLookasideList(lookaside : *mut core::ffi::c_void, flags : u32));

// UNSUPPORTED Rust 167:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlDeleteKeyFromTunnelCache(cache : *mut TUNNEL, directorykey : u64));

// UNSUPPORTED Rust 169:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlDeleteTunnelCache(cache : *mut TUNNEL));

// UNSUPPORTED Rust 171:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlDeregisterUncProvider(handle : super::super::super::Win32::Foundation:: HANDLE));

// UNSUPPORTED Rust 172:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlDismountComplete(deviceobject : *const super::super::Foundation:: DEVICE_OBJECT, dismountstatus : super::super::super::Win32::Foundation:: NTSTATUS));

// UNSUPPORTED Rust 174:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlDissectDbcs(path : super::super::super::Win32::System::Kernel:: STRING, firstname : *mut super::super::super::Win32::System::Kernel:: STRING, remainingname : *mut super::super::super::Win32::System::Kernel:: STRING));

// UNSUPPORTED Rust 176:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlDissectName(path : super::super::super::Win32::Foundation:: UNICODE_STRING, firstname : *mut super::super::super::Win32::Foundation:: UNICODE_STRING, remainingname : *mut super::super::super::Win32::Foundation:: UNICODE_STRING));

// UNSUPPORTED Rust 177:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlDoesDbcsContainWildCards(name : *const super::super::super::Win32::System::Kernel:: STRING) -> bool);

// UNSUPPORTED Rust 179:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlDoesNameContainWildCards(name : *const super::super::super::Win32::Foundation:: UNICODE_STRING) -> bool);

// UNSUPPORTED Rust 180:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlFastCheckLockForRead(filelock : *const FILE_LOCK, startingbyte : *const i64, length : *const i64, key : u32, fileobject : *const super::super::Foundation:: FILE_OBJECT, processid : *const core::ffi::c_void) -> bool);

// UNSUPPORTED Rust 182:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlFastCheckLockForWrite(filelock : *const FILE_LOCK, startingbyte : *const i64, length : *const i64, key : u32, fileobject : *const core::ffi::c_void, processid : *const core::ffi::c_void) -> bool);

// UNSUPPORTED Rust 184:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlFastUnlockAll(filelock : *const FILE_LOCK, fileobject : *const super::super::Foundation:: FILE_OBJECT, processid : super::super::Foundation:: PEPROCESS, context : *const core::ffi::c_void) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 186:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlFastUnlockAllByKey(filelock : *const FILE_LOCK, fileobject : *const super::super::Foundation:: FILE_OBJECT, processid : super::super::Foundation:: PEPROCESS, key : u32, context : *const core::ffi::c_void) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 188:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlFastUnlockSingle(filelock : *const FILE_LOCK, fileobject : *const super::super::Foundation:: FILE_OBJECT, fileoffset : *const i64, length : *const i64, processid : super::super::Foundation:: PEPROCESS, key : u32, context : *const core::ffi::c_void, alreadysynchronized : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 190:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlFindExtraCreateParameter(ecplist : *const super::super::Foundation:: ECP_LIST, ecptype : *const windows_sys::core::GUID, ecpcontext : *mut *mut core::ffi::c_void, ecpcontextsize : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 192:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlFindInTunnelCache(cache : *const TUNNEL, directorykey : u64, name : *const super::super::super::Win32::Foundation:: UNICODE_STRING, shortname : *mut super::super::super::Win32::Foundation:: UNICODE_STRING, longname : *mut super::super::super::Win32::Foundation:: UNICODE_STRING, datalength : *mut u32, data : *mut core::ffi::c_void) -> bool);

// UNSUPPORTED Rust 194:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlFindInTunnelCacheEx(cache : *const TUNNEL, directorykey : u64, name : *const super::super::super::Win32::Foundation:: UNICODE_STRING, shortname : *mut super::super::super::Win32::Foundation:: UNICODE_STRING, longname : *mut super::super::super::Win32::Foundation:: UNICODE_STRING, flags : u32, datalength : *mut u32, data : *mut core::ffi::c_void) -> bool);

// UNSUPPORTED Rust 196:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlFreeAePushLock(aepushlock : *mut core::ffi::c_void));

// UNSUPPORTED Rust 197:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlFreeExtraCreateParameter(ecpcontext : *const core::ffi::c_void));

// UNSUPPORTED Rust 198:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlFreeExtraCreateParameterList(ecplist : *const super::super::Foundation:: ECP_LIST));

// UNSUPPORTED Rust 200:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlFreeFileLock(filelock : *const FILE_LOCK));

// UNSUPPORTED Rust 202:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlGetCurrentProcessLoaderList() -> *mut super::super::super::Win32::System::Kernel:: LIST_ENTRY);

// UNSUPPORTED Rust 204:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlGetEcpListFromIrp(irp : *const super::super::Foundation:: IRP, ecplist : *mut *mut super::super::Foundation:: ECP_LIST) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 206:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlGetFileSize(fileobject : *const super::super::Foundation:: FILE_OBJECT, filesize : *mut i64) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 208:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlGetNextBaseMcbEntry(mcb : *const BASE_MCB, runindex : u32, vbn : *mut i64, lbn : *mut i64, sectorcount : *mut i64) -> bool);

// UNSUPPORTED Rust 209:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlGetNextExtraCreateParameter(ecplist : *const super::super::Foundation:: ECP_LIST, currentecpcontext : *const core::ffi::c_void, nextecptype : *mut windows_sys::core::GUID, nextecpcontext : *mut *mut core::ffi::c_void, nextecpcontextsize : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 211:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlGetNextFileLock(filelock : *const FILE_LOCK, restart : bool) -> *mut FILE_LOCK_INFO);

// UNSUPPORTED Rust 213:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlGetNextLargeMcbEntry(mcb : *const LARGE_MCB, runindex : u32, vbn : *mut i64, lbn : *mut i64, sectorcount : *mut i64) -> bool);

// UNSUPPORTED Rust 215:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlGetNextMcbEntry(mcb : *const MCB, runindex : u32, vbn : *mut u32, lbn : *mut u32, sectorcount : *mut u32) -> bool);

// UNSUPPORTED Rust 217:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlGetSectorSizeInformation(deviceobject : *const super::super::Foundation:: DEVICE_OBJECT, sectorsizeinfo : *mut FILE_FS_SECTOR_SIZE_INFORMATION) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 219:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlGetSupportedFeatures(deviceobject : *const super::super::Foundation:: DEVICE_OBJECT, supportedfeatures : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 221:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlGetVirtualDiskNestingLevel(deviceobject : *const super::super::Foundation:: DEVICE_OBJECT, nestinglevel : *mut u32, nestingflags : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 223:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlIncrementCcFastMdlReadWait());

// UNSUPPORTED Rust 224:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlIncrementCcFastReadNoWait());

// UNSUPPORTED Rust 225:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlIncrementCcFastReadNotPossible());

// UNSUPPORTED Rust 226:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlIncrementCcFastReadResourceMiss());

// UNSUPPORTED Rust 227:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlIncrementCcFastReadWait());

// UNSUPPORTED Rust 228:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlInitExtraCreateParameterLookasideList(lookaside : *mut core::ffi::c_void, flags : u32, size : usize, tag : u32));

// UNSUPPORTED Rust 229:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlInitializeBaseMcb(mcb : *mut BASE_MCB, pooltype : super::super::Foundation:: POOL_TYPE));

// UNSUPPORTED Rust 231:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlInitializeBaseMcbEx(mcb : *mut BASE_MCB, pooltype : super::super::Foundation:: POOL_TYPE, flags : u16) -> bool);

// UNSUPPORTED Rust 233:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlInitializeExtraCreateParameter(ecp : *mut super::super::Foundation:: ECP_HEADER, ecpflags : u32, cleanupcallback : PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, totalsize : u32, ecptype : *const windows_sys::core::GUID, listallocatedfrom : *const core::ffi::c_void));

// UNSUPPORTED Rust 235:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlInitializeExtraCreateParameterList(ecplist : *mut super::super::Foundation:: ECP_LIST) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 237:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlInitializeFileLock(filelock : *mut FILE_LOCK, completelockirproutine : PCOMPLETE_LOCK_IRP_ROUTINE, unlockroutine : PUNLOCK_ROUTINE));

// UNSUPPORTED Rust 239:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlInitializeLargeMcb(mcb : *mut LARGE_MCB, pooltype : super::super::Foundation:: POOL_TYPE));

// UNSUPPORTED Rust 241:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlInitializeMcb(mcb : *mut MCB, pooltype : super::super::Foundation:: POOL_TYPE));

// UNSUPPORTED Rust 243:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlInitializeOplock(oplock : *mut *mut core::ffi::c_void));

// UNSUPPORTED Rust 244:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlInitializeTunnelCache(cache : *mut TUNNEL));

// UNSUPPORTED Rust 246:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlInsertExtraCreateParameter(ecplist : *mut super::super::Foundation:: ECP_LIST, ecpcontext : *mut core::ffi::c_void) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 248:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlInsertPerFileContext(perfilecontextpointer : *const *const core::ffi::c_void, ptr : *const FSRTL_PER_FILE_CONTEXT) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 250:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlInsertPerFileObjectContext(fileobject : *const super::super::Foundation:: FILE_OBJECT, ptr : *const FSRTL_PER_FILEOBJECT_CONTEXT) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 252:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlInsertPerStreamContext(perstreamcontext : *const FSRTL_ADVANCED_FCB_HEADER, ptr : *const FSRTL_PER_STREAM_CONTEXT) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 254:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlIs32BitProcess(process : super::super::Foundation:: PEPROCESS) -> bool);

// UNSUPPORTED Rust 256:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlIsDaxVolume(fileobject : *const super::super::Foundation:: FILE_OBJECT) -> bool);

// UNSUPPORTED Rust 258:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlIsDbcsInExpression(expression : *const super::super::super::Win32::System::Kernel:: STRING, name : *const super::super::super::Win32::System::Kernel:: STRING) -> bool);

// UNSUPPORTED Rust 260:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlIsEcpAcknowledged(ecpcontext : *const core::ffi::c_void) -> bool);

// UNSUPPORTED Rust 261:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlIsEcpFromUserMode(ecpcontext : *const core::ffi::c_void) -> bool);

// UNSUPPORTED Rust 262:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlIsExtentDangling(startpage : u32, numberofpages : u32, flags : u32) -> u32);

// UNSUPPORTED Rust 263:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlIsFatDbcsLegal(dbcsname : super::super::super::Win32::System::Kernel:: STRING, wildcardspermissible : bool, pathnamepermissible : bool, leadingbackslashpermissible : bool) -> bool);

// UNSUPPORTED Rust 265:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlIsHpfsDbcsLegal(dbcsname : super::super::super::Win32::System::Kernel:: STRING, wildcardspermissible : bool, pathnamepermissible : bool, leadingbackslashpermissible : bool) -> bool);

// UNSUPPORTED Rust 267:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlIsMobileOS() -> bool);

// UNSUPPORTED Rust 268:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlIsNameInExpression(expression : *const super::super::super::Win32::Foundation:: UNICODE_STRING, name : *const super::super::super::Win32::Foundation:: UNICODE_STRING, ignorecase : bool, upcasetable : windows_sys::core::PCWSTR) -> bool);

// UNSUPPORTED Rust 269:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlIsNameInUnUpcasedExpression(expression : *const super::super::super::Win32::Foundation:: UNICODE_STRING, name : *const super::super::super::Win32::Foundation:: UNICODE_STRING, ignorecase : bool, upcasetable : windows_sys::core::PCWSTR) -> bool);

// UNSUPPORTED Rust 270:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag : u32) -> bool);

// UNSUPPORTED Rust 271:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlIsNtstatusExpected(exception : super::super::super::Win32::Foundation:: NTSTATUS) -> bool);

// UNSUPPORTED Rust 272:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlIsPagingFile(fileobject : *const super::super::Foundation:: FILE_OBJECT) -> u32);

// UNSUPPORTED Rust 274:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlIsSystemPagingFile(fileobject : *const super::super::Foundation:: FILE_OBJECT) -> u32);

// UNSUPPORTED Rust 276:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlIssueDeviceIoControl(deviceobject : *const super::super::Foundation:: DEVICE_OBJECT, ioctl : u32, flags : u8, inputbuffer : *const core::ffi::c_void, inputbufferlength : u32, outputbuffer : *const core::ffi::c_void, outputbufferlength : u32, iosbinformation : *mut usize) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 278:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlKernelFsControlFile(fileobject : *const super::super::Foundation:: FILE_OBJECT, fscontrolcode : u32, inputbuffer : *const core::ffi::c_void, inputbufferlength : u32, outputbuffer : *mut core::ffi::c_void, outputbufferlength : u32, retoutputbuffersize : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 280:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlLogCcFlushError(filename : *const super::super::super::Win32::Foundation:: UNICODE_STRING, deviceobject : *const super::super::Foundation:: DEVICE_OBJECT, sectionobjectpointer : *const super::super::Foundation:: SECTION_OBJECT_POINTERS, flusherror : super::super::super::Win32::Foundation:: NTSTATUS, flags : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 282:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlLookupBaseMcbEntry(mcb : *const BASE_MCB, vbn : i64, lbn : *mut i64, sectorcountfromlbn : *mut i64, startinglbn : *mut i64, sectorcountfromstartinglbn : *mut i64, index : *mut u32) -> bool);

// UNSUPPORTED Rust 283:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlLookupLargeMcbEntry(mcb : *const LARGE_MCB, vbn : i64, lbn : *mut i64, sectorcountfromlbn : *mut i64, startinglbn : *mut i64, sectorcountfromstartinglbn : *mut i64, index : *mut u32) -> bool);

// UNSUPPORTED Rust 285:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlLookupLastBaseMcbEntry(mcb : *const BASE_MCB, vbn : *mut i64, lbn : *mut i64) -> bool);

// UNSUPPORTED Rust 286:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlLookupLastBaseMcbEntryAndIndex(opaquemcb : *const BASE_MCB, largevbn : *mut i64, largelbn : *mut i64, index : *mut u32) -> bool);

// UNSUPPORTED Rust 287:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlLookupLastLargeMcbEntry(mcb : *const LARGE_MCB, vbn : *mut i64, lbn : *mut i64) -> bool);

// UNSUPPORTED Rust 289:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlLookupLastLargeMcbEntryAndIndex(opaquemcb : *const LARGE_MCB, largevbn : *mut i64, largelbn : *mut i64, index : *mut u32) -> bool);

// UNSUPPORTED Rust 291:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlLookupLastMcbEntry(mcb : *const MCB, vbn : *mut u32, lbn : *mut u32) -> bool);

// UNSUPPORTED Rust 293:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlLookupMcbEntry(mcb : *const MCB, vbn : u32, lbn : *mut u32, sectorcount : *mut u32, index : *mut u32) -> bool);

// UNSUPPORTED Rust 295:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlLookupPerFileContext(perfilecontextpointer : *const *const core::ffi::c_void, ownerid : *const core::ffi::c_void, instanceid : *const core::ffi::c_void) -> *mut FSRTL_PER_FILE_CONTEXT);

// UNSUPPORTED Rust 297:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlLookupPerFileObjectContext(fileobject : *const super::super::Foundation:: FILE_OBJECT, ownerid : *const core::ffi::c_void, instanceid : *const core::ffi::c_void) -> *mut FSRTL_PER_FILEOBJECT_CONTEXT);

// UNSUPPORTED Rust 299:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlLookupPerStreamContextInternal(streamcontext : *const FSRTL_ADVANCED_FCB_HEADER, ownerid : *const core::ffi::c_void, instanceid : *const core::ffi::c_void) -> *mut FSRTL_PER_STREAM_CONTEXT);

// UNSUPPORTED Rust 301:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlMdlReadCompleteDev(fileobject : *const super::super::Foundation:: FILE_OBJECT, mdlchain : *const super::super::Foundation:: MDL, deviceobject : *const super::super::Foundation:: DEVICE_OBJECT) -> bool);

// UNSUPPORTED Rust 303:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlMdlReadDev(fileobject : *const super::super::Foundation:: FILE_OBJECT, fileoffset : *const i64, length : u32, lockkey : u32, mdlchain : *mut *mut super::super::Foundation:: MDL, iostatus : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, deviceobject : *const super::super::Foundation:: DEVICE_OBJECT) -> bool);

// UNSUPPORTED Rust 305:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlMdlReadEx(fileobject : *const super::super::Foundation:: FILE_OBJECT, fileoffset : *const i64, length : u32, lockkey : u32, mdlchain : *mut *mut super::super::Foundation:: MDL, iostatus : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 307:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlMdlWriteCompleteDev(fileobject : *const super::super::Foundation:: FILE_OBJECT, fileoffset : *const i64, mdlchain : *const super::super::Foundation:: MDL, deviceobject : *const super::super::Foundation:: DEVICE_OBJECT) -> bool);

// UNSUPPORTED Rust 309:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlMupGetProviderIdFromName(pprovidername : *const super::super::super::Win32::Foundation:: UNICODE_STRING, pproviderid : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 310:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlMupGetProviderInfoFromFileObject(pfileobject : *const super::super::Foundation:: FILE_OBJECT, level : u32, pbuffer : *mut core::ffi::c_void, pbuffersize : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 312:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlNormalizeNtstatus(exception : super::super::super::Win32::Foundation:: NTSTATUS, genericexception : super::super::super::Win32::Foundation:: NTSTATUS) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 313:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlNotifyCleanup(notifysync : super::super::Foundation:: PNOTIFY_SYNC, notifylist : *const super::super::super::Win32::System::Kernel:: LIST_ENTRY, fscontext : *const core::ffi::c_void));

// UNSUPPORTED Rust 315:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlNotifyCleanupAll(notifysync : super::super::Foundation:: PNOTIFY_SYNC, notifylist : *const super::super::super::Win32::System::Kernel:: LIST_ENTRY));

// UNSUPPORTED Rust 317:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlNotifyFilterChangeDirectory(notifysync : super::super::Foundation:: PNOTIFY_SYNC, notifylist : *const super::super::super::Win32::System::Kernel:: LIST_ENTRY, fscontext : *const core::ffi::c_void, fulldirectoryname : *const super::super::super::Win32::System::Kernel:: STRING, watchtree : bool, ignorebuffer : bool, completionfilter : u32, notifyirp : *const super::super::Foundation:: IRP, traversecallback : PCHECK_FOR_TRAVERSE_ACCESS, subjectcontext : *const super::super::Foundation:: SECURITY_SUBJECT_CONTEXT, filtercallback : PFILTER_REPORT_CHANGE));

// UNSUPPORTED Rust 319:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlNotifyFilterReportChange(notifysync : super::super::Foundation:: PNOTIFY_SYNC, notifylist : *const super::super::super::Win32::System::Kernel:: LIST_ENTRY, fulltargetname : *const super::super::super::Win32::System::Kernel:: STRING, targetnameoffset : u16, streamname : *const super::super::super::Win32::System::Kernel:: STRING, normalizedparentname : *const super::super::super::Win32::System::Kernel:: STRING, filtermatch : u32, action : u32, targetcontext : *const core::ffi::c_void, filtercontext : *const core::ffi::c_void));

// UNSUPPORTED Rust 321:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlNotifyFullChangeDirectory(notifysync : super::super::Foundation:: PNOTIFY_SYNC, notifylist : *const super::super::super::Win32::System::Kernel:: LIST_ENTRY, fscontext : *const core::ffi::c_void, fulldirectoryname : *mut super::super::super::Win32::System::Kernel:: STRING, watchtree : bool, ignorebuffer : bool, completionfilter : u32, notifyirp : *const super::super::Foundation:: IRP, traversecallback : PCHECK_FOR_TRAVERSE_ACCESS, subjectcontext : *const super::super::Foundation:: SECURITY_SUBJECT_CONTEXT));

// UNSUPPORTED Rust 323:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlNotifyFullReportChange(notifysync : super::super::Foundation:: PNOTIFY_SYNC, notifylist : *const super::super::super::Win32::System::Kernel:: LIST_ENTRY, fulltargetname : *const super::super::super::Win32::System::Kernel:: STRING, targetnameoffset : u16, streamname : *const super::super::super::Win32::System::Kernel:: STRING, normalizedparentname : *const super::super::super::Win32::System::Kernel:: STRING, filtermatch : u32, action : u32, targetcontext : *const core::ffi::c_void));

// UNSUPPORTED Rust 325:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlNotifyInitializeSync(notifysync : *mut super::super::Foundation:: PNOTIFY_SYNC));

// UNSUPPORTED Rust 327:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlNotifyUninitializeSync(notifysync : *mut super::super::Foundation:: PNOTIFY_SYNC));

// UNSUPPORTED Rust 329:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlNotifyVolumeEvent(fileobject : *const super::super::Foundation:: FILE_OBJECT, eventcode : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 331:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlNotifyVolumeEventEx(fileobject : *const super::super::Foundation:: FILE_OBJECT, eventcode : u32, event : *const super::super::Foundation:: TARGET_DEVICE_CUSTOM_NOTIFICATION) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 333:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlNumberOfRunsInBaseMcb(mcb : *const BASE_MCB) -> u32);

// UNSUPPORTED Rust 334:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlNumberOfRunsInLargeMcb(mcb : *const LARGE_MCB) -> u32);

// UNSUPPORTED Rust 336:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlNumberOfRunsInMcb(mcb : *const MCB) -> u32);

// UNSUPPORTED Rust 338:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlOplockBreakH(oplock : *const *const core::ffi::c_void, irp : *const super::super::Foundation:: IRP, flags : u32, context : *const core::ffi::c_void, completionroutine : POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine : POPLOCK_FS_PREPOST_IRP) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 340:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlOplockBreakH2(oplock : *const *const core::ffi::c_void, irp : *const super::super::Foundation:: IRP, flags : u32, context : *const core::ffi::c_void, completionroutine : POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine : POPLOCK_FS_PREPOST_IRP, grantedaccess : *const u32, shareaccess : *const u16) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 342:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlOplockBreakToNone(oplock : *mut *mut core::ffi::c_void, irpsp : *const super::super::Foundation:: IO_STACK_LOCATION, irp : *const super::super::Foundation:: IRP, context : *const core::ffi::c_void, completionroutine : POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine : POPLOCK_FS_PREPOST_IRP) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 344:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlOplockBreakToNoneEx(oplock : *mut *mut core::ffi::c_void, irp : *const super::super::Foundation:: IRP, flags : u32, context : *const core::ffi::c_void, completionroutine : POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine : POPLOCK_FS_PREPOST_IRP) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 346:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlOplockFsctrl(oplock : *const *const core::ffi::c_void, irp : *const super::super::Foundation:: IRP, opencount : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 348:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlOplockFsctrlEx(oplock : *const *const core::ffi::c_void, irp : *const super::super::Foundation:: IRP, opencount : u32, flags : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 350:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlOplockGetAnyBreakOwnerProcess(oplock : *const *const core::ffi::c_void) -> super::super::Foundation:: PEPROCESS);

// UNSUPPORTED Rust 352:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlOplockIsFastIoPossible(oplock : *const *const core::ffi::c_void) -> bool);

// UNSUPPORTED Rust 353:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlOplockIsSharedRequest(irp : *const super::super::Foundation:: IRP) -> bool);

// UNSUPPORTED Rust 355:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlOplockKeysEqual(fo1 : *const super::super::Foundation:: FILE_OBJECT, fo2 : *const super::super::Foundation:: FILE_OBJECT) -> bool);

// UNSUPPORTED Rust 357:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlPostPagingFileStackOverflow(context : *const core::ffi::c_void, event : *const super::super::Foundation:: KEVENT, stackoverflowroutine : PFSRTL_STACK_OVERFLOW_ROUTINE));

// UNSUPPORTED Rust 359:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlPostStackOverflow(context : *const core::ffi::c_void, event : *const super::super::Foundation:: KEVENT, stackoverflowroutine : PFSRTL_STACK_OVERFLOW_ROUTINE));

// UNSUPPORTED Rust 361:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlPrepareMdlWriteDev(fileobject : *const super::super::Foundation:: FILE_OBJECT, fileoffset : *const i64, length : u32, lockkey : u32, mdlchain : *mut *mut super::super::Foundation:: MDL, iostatus : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, deviceobject : *const super::super::Foundation:: DEVICE_OBJECT) -> bool);

// UNSUPPORTED Rust 363:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlPrepareMdlWriteEx(fileobject : *const super::super::Foundation:: FILE_OBJECT, fileoffset : *const i64, length : u32, lockkey : u32, mdlchain : *mut *mut super::super::Foundation:: MDL, iostatus : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 365:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlPrepareToReuseEcp(ecpcontext : *const core::ffi::c_void));

// UNSUPPORTED Rust 366:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlPrivateLock(filelock : *const FILE_LOCK, fileobject : *const super::super::Foundation:: FILE_OBJECT, fileoffset : *const i64, length : *const i64, processid : super::super::Foundation:: PEPROCESS, key : u32, failimmediately : bool, exclusivelock : bool, iosb : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, irp : *const super::super::Foundation:: IRP, context : *const core::ffi::c_void, alreadysynchronized : bool) -> bool);

// UNSUPPORTED Rust 368:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlProcessFileLock(filelock : *const FILE_LOCK, irp : *const super::super::Foundation:: IRP, context : *const core::ffi::c_void) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 370:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlQueryCachedVdl(fileobject : *const super::super::Foundation:: FILE_OBJECT, vdl : *mut i64) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 372:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlQueryInformationFile(fileobject : *const super::super::Foundation:: FILE_OBJECT, fileinformation : *mut core::ffi::c_void, length : u32, fileinformationclass : FILE_INFORMATION_CLASS, retfileinformationsize : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 374:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlQueryKernelEaFile(fileobject : *const super::super::Foundation:: FILE_OBJECT, returnedeadata : *mut core::ffi::c_void, length : u32, returnsingleentry : bool, ealist : *const core::ffi::c_void, ealistlength : u32, eaindex : *const u32, restartscan : bool, lengthreturned : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 376:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlQueryMaximumVirtualDiskNestingLevel() -> u32);

// UNSUPPORTED Rust 377:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlRegisterFileSystemFilterCallbacks(filterdriverobject : *const super::super::Foundation:: DRIVER_OBJECT, callbacks : *const FS_FILTER_CALLBACKS) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 379:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlRegisterUncProvider(muphandle : *mut super::super::super::Win32::Foundation:: HANDLE, redirectordevicename : *const super::super::super::Win32::Foundation:: UNICODE_STRING, mailslotssupported : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 380:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlRegisterUncProviderEx(muphandle : *mut super::super::super::Win32::Foundation:: HANDLE, redirdevname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, deviceobject : *const super::super::Foundation:: DEVICE_OBJECT, flags : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 382:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlRegisterUncProviderEx2(redirdevname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, deviceobject : *const super::super::Foundation:: DEVICE_OBJECT, registration : *const FSRTL_UNC_PROVIDER_REGISTRATION, muphandle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 384:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlReleaseFile(fileobject : *const super::super::Foundation:: FILE_OBJECT));

// UNSUPPORTED Rust 386:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlRemoveBaseMcbEntry(mcb : *mut BASE_MCB, vbn : i64, sectorcount : i64) -> bool);

// UNSUPPORTED Rust 387:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlRemoveDotsFromPath(originalstring : windows_sys::core::PWSTR, pathlength : u16, newlength : *mut u16) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 388:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlRemoveExtraCreateParameter(ecplist : *mut super::super::Foundation:: ECP_LIST, ecptype : *const windows_sys::core::GUID, ecpcontext : *mut *mut core::ffi::c_void, ecpcontextsize : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 390:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlRemoveLargeMcbEntry(mcb : *mut LARGE_MCB, vbn : i64, sectorcount : i64));

// UNSUPPORTED Rust 392:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlRemoveMcbEntry(mcb : *mut MCB, vbn : u32, sectorcount : u32));

// UNSUPPORTED Rust 394:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlRemovePerFileContext(perfilecontextpointer : *const *const core::ffi::c_void, ownerid : *const core::ffi::c_void, instanceid : *const core::ffi::c_void) -> *mut FSRTL_PER_FILE_CONTEXT);

// UNSUPPORTED Rust 396:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlRemovePerFileObjectContext(fileobject : *const super::super::Foundation:: FILE_OBJECT, ownerid : *const core::ffi::c_void, instanceid : *const core::ffi::c_void) -> *mut FSRTL_PER_FILEOBJECT_CONTEXT);

// UNSUPPORTED Rust 398:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlRemovePerStreamContext(streamcontext : *const FSRTL_ADVANCED_FCB_HEADER, ownerid : *const core::ffi::c_void, instanceid : *const core::ffi::c_void) -> *mut FSRTL_PER_STREAM_CONTEXT);

// UNSUPPORTED Rust 400:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlResetBaseMcb(mcb : *mut BASE_MCB));

// UNSUPPORTED Rust 401:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlResetLargeMcb(mcb : *mut LARGE_MCB, selfsynchronized : bool));

// UNSUPPORTED Rust 403:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlSetDriverBacking(driverobj : *const super::super::Foundation:: DRIVER_OBJECT, flags : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 405:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlSetEcpListIntoIrp(irp : *mut super::super::Foundation:: IRP, ecplist : *const super::super::Foundation:: ECP_LIST) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 407:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlSetKernelEaFile(fileobject : *const super::super::Foundation:: FILE_OBJECT, eabuffer : *const core::ffi::c_void, length : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 409:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlSplitBaseMcb(mcb : *mut BASE_MCB, vbn : i64, amount : i64) -> bool);

// UNSUPPORTED Rust 410:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlSplitLargeMcb(mcb : *mut LARGE_MCB, vbn : i64, amount : i64) -> bool);

// UNSUPPORTED Rust 412:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlTeardownPerFileContexts(perfilecontextpointer : *const *const core::ffi::c_void));

// UNSUPPORTED Rust 413:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlTeardownPerStreamContexts(advancedheader : *const FSRTL_ADVANCED_FCB_HEADER));

// UNSUPPORTED Rust 415:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlTruncateBaseMcb(mcb : *mut BASE_MCB, vbn : i64));

// UNSUPPORTED Rust 416:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlTruncateLargeMcb(mcb : *mut LARGE_MCB, vbn : i64));

// UNSUPPORTED Rust 418:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlTruncateMcb(mcb : *mut MCB, vbn : u32));

// UNSUPPORTED Rust 420:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlUninitializeBaseMcb(mcb : *const BASE_MCB));

// UNSUPPORTED Rust 421:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlUninitializeFileLock(filelock : *mut FILE_LOCK));

// UNSUPPORTED Rust 423:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlUninitializeLargeMcb(mcb : *mut LARGE_MCB));

// UNSUPPORTED Rust 425:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlUninitializeMcb(mcb : *mut MCB));

// UNSUPPORTED Rust 427:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlUninitializeOplock(oplock : *mut *mut core::ffi::c_void));

// UNSUPPORTED Rust 428:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlUpdateDiskCounters(bytesread : u64, byteswritten : u64));

// UNSUPPORTED Rust 429:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlUpperOplockFsctrl(oplock : *const *const core::ffi::c_void, irp : *const super::super::Foundation:: IRP, opencount : u32, loweroplockstate : u32, flags : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 431:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlValidateReparsePointBuffer(bufferlength : u32, reparsebuffer : *const REPARSE_DATA_BUFFER) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 432:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn FsRtlVolumeDeviceToCorrelationId(volumedeviceobject : *const super::super::Foundation:: DEVICE_OBJECT, guid : *mut windows_sys::core::GUID) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 434:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Authentication_Identity")]
// windows_link::link!("secur32.dll" "system" fn GetSecurityUserInfo(logonid : *const super::super::super::Win32::Foundation:: LUID, flags : u32, userinformation : *mut *mut super::super::super::Win32::Security::Authentication::Identity:: SECURITY_USER_DATA) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 436:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn IoAcquireVpbSpinLock(irql : *mut u8));

// UNSUPPORTED Rust 437:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn IoApplyPriorityInfoThread(inputpriorityinfo : *const IO_PRIORITY_INFO, outputpriorityinfo : *mut IO_PRIORITY_INFO, thread : super::super::Foundation:: PETHREAD) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 439:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn IoCheckDesiredAccess(desiredaccess : *mut u32, grantedaccess : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 440:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn IoCheckEaBufferValidity(eabuffer : *const FILE_FULL_EA_INFORMATION, ealength : u32, erroroffset : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 441:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn IoCheckFunctionAccess(grantedaccess : u32, majorfunction : u8, minorfunction : u8, iocontrolcode : u32, arg1 : *const core::ffi::c_void, arg2 : *const core::ffi::c_void) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 442:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn IoCheckQuerySetFileInformation(fileinformationclass : FILE_INFORMATION_CLASS, length : u32, setoperation : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 443:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn IoCheckQuerySetVolumeInformation(fsinformationclass : FS_INFORMATION_CLASS, length : u32, setoperation : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 444:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntoskrnl.exe" "system" fn IoCheckQuotaBufferValidity(quotabuffer : *const FILE_QUOTA_INFORMATION, quotalength : u32, erroroffset : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 446:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoClearFsTrackOffsetState(irp : *mut super::super::Foundation:: IRP) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 448:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoCreateStreamFileObject(fileobject : *const super::super::Foundation:: FILE_OBJECT, deviceobject : *const super::super::Foundation:: DEVICE_OBJECT) -> *mut super::super::Foundation:: FILE_OBJECT);

// UNSUPPORTED Rust 450:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoCreateStreamFileObjectEx(fileobject : *const super::super::Foundation:: FILE_OBJECT, deviceobject : *const super::super::Foundation:: DEVICE_OBJECT, filehandle : *mut super::super::super::Win32::Foundation:: HANDLE) -> *mut super::super::Foundation:: FILE_OBJECT);

// UNSUPPORTED Rust 452:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoCreateStreamFileObjectEx2(createoptions : *const IO_CREATE_STREAM_FILE_OPTIONS, fileobject : *const super::super::Foundation:: FILE_OBJECT, deviceobject : *const super::super::Foundation:: DEVICE_OBJECT, streamfileobject : *mut *mut super::super::Foundation:: FILE_OBJECT, filehandle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 454:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoCreateStreamFileObjectLite(fileobject : *const super::super::Foundation:: FILE_OBJECT, deviceobject : *const super::super::Foundation:: DEVICE_OBJECT) -> *mut super::super::Foundation:: FILE_OBJECT);

// UNSUPPORTED Rust 456:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoEnumerateDeviceObjectList(driverobject : *const super::super::Foundation:: DRIVER_OBJECT, deviceobjectlist : *mut *mut super::super::Foundation:: DEVICE_OBJECT, deviceobjectlistsize : u32, actualnumberdeviceobjects : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 458:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoEnumerateRegisteredFiltersList(driverobjectlist : *mut *mut super::super::Foundation:: DRIVER_OBJECT, driverobjectlistsize : u32, actualnumberdriverobjects : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 460:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security", feature = "Win32_System_IO"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoFastQueryNetworkAttributes(objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES, desiredaccess : u32, openoptions : u32, iostatus : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, buffer : *mut FILE_NETWORK_OPEN_INFORMATION) -> bool);

// UNSUPPORTED Rust 462:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoGetAttachedDevice(deviceobject : *const super::super::Foundation:: DEVICE_OBJECT) -> *mut super::super::Foundation:: DEVICE_OBJECT);

// UNSUPPORTED Rust 464:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoGetBaseFileSystemDeviceObject(fileobject : *const super::super::Foundation:: FILE_OBJECT) -> *mut super::super::Foundation:: DEVICE_OBJECT);

// UNSUPPORTED Rust 466:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoGetDeviceAttachmentBaseRef(deviceobject : *const super::super::Foundation:: DEVICE_OBJECT) -> *mut super::super::Foundation:: DEVICE_OBJECT);

// UNSUPPORTED Rust 468:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoGetDeviceToVerify(thread : super::super::Foundation:: PETHREAD) -> *mut super::super::Foundation:: DEVICE_OBJECT);

// UNSUPPORTED Rust 470:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoGetDiskDeviceObject(filesystemdeviceobject : *const super::super::Foundation:: DEVICE_OBJECT, diskdeviceobject : *mut *mut super::super::Foundation:: DEVICE_OBJECT) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 472:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Ioctl", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoGetFsTrackOffsetState(irp : *const super::super::Foundation:: IRP, retfstrackoffsetblob : *mut *mut super::super::super::Win32::System::Ioctl:: IO_IRP_EXT_TRACK_OFFSET_HEADER, rettrackedoffset : *mut i64) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 474:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoGetLowerDeviceObject(deviceobject : *const super::super::Foundation:: DEVICE_OBJECT) -> *mut super::super::Foundation:: DEVICE_OBJECT);

// UNSUPPORTED Rust 476:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoGetOplockKeyContext(fileobject : *const super::super::Foundation:: FILE_OBJECT) -> *mut OPLOCK_KEY_ECP_CONTEXT);

// UNSUPPORTED Rust 478:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoGetOplockKeyContextEx(fileobject : *const super::super::Foundation:: FILE_OBJECT) -> *mut OPLOCK_KEY_CONTEXT);

// UNSUPPORTED Rust 480:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoGetRequestorProcess(irp : *const super::super::Foundation:: IRP) -> super::super::Foundation:: PEPROCESS);

// UNSUPPORTED Rust 482:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoGetRequestorProcessId(irp : *const super::super::Foundation:: IRP) -> u32);

// UNSUPPORTED Rust 484:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoGetRequestorSessionId(irp : *const super::super::Foundation:: IRP, psessionid : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 486:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoIrpHasFsTrackOffsetExtensionType(irp : *const super::super::Foundation:: IRP) -> bool);

// UNSUPPORTED Rust 488:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoIsOperationSynchronous(irp : *const super::super::Foundation:: IRP) -> bool);

// UNSUPPORTED Rust 490:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn IoIsSystemThread(thread : super::super::Foundation:: PETHREAD) -> bool);

// UNSUPPORTED Rust 492:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoIsValidNameGraftingBuffer(irp : *const super::super::Foundation:: IRP, reparsebuffer : *const REPARSE_DATA_BUFFER) -> bool);

// UNSUPPORTED Rust 494:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoPageRead(fileobject : *const super::super::Foundation:: FILE_OBJECT, memorydescriptorlist : *const super::super::Foundation:: MDL, startingoffset : *const i64, event : *const super::super::Foundation:: KEVENT, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 496:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoQueryFileDosDeviceName(fileobject : *const super::super::Foundation:: FILE_OBJECT, objectnameinformation : *mut *mut super::super::Foundation:: OBJECT_NAME_INFORMATION) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 498:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoQueryFileInformation(fileobject : *const super::super::Foundation:: FILE_OBJECT, fileinformationclass : FILE_INFORMATION_CLASS, length : u32, fileinformation : *mut core::ffi::c_void, returnedlength : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 500:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoQueryVolumeInformation(fileobject : *const super::super::Foundation:: FILE_OBJECT, fsinformationclass : FS_INFORMATION_CLASS, length : u32, fsinformation : *mut core::ffi::c_void, returnedlength : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 502:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoQueueThreadIrp(irp : *const super::super::Foundation:: IRP));

// UNSUPPORTED Rust 504:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoRegisterFileSystem(deviceobject : *const super::super::Foundation:: DEVICE_OBJECT));

// UNSUPPORTED Rust 506:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoRegisterFsRegistrationChange(driverobject : *const super::super::Foundation:: DRIVER_OBJECT, drivernotificationroutine : super::super::Foundation:: DRIVER_FS_NOTIFICATION) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 508:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoRegisterFsRegistrationChangeMountAware(driverobject : *const super::super::Foundation:: DRIVER_OBJECT, drivernotificationroutine : super::super::Foundation:: DRIVER_FS_NOTIFICATION, synchronizewithmounts : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 510:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn IoReleaseVpbSpinLock(irql : u8));

// UNSUPPORTED Rust 511:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoReplaceFileObjectName(fileobject : *const super::super::Foundation:: FILE_OBJECT, newfilename : windows_sys::core::PCWSTR, filenamelength : u16) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 513:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoRequestDeviceRemovalForReset(physicaldeviceobject : *const super::super::Foundation:: DEVICE_OBJECT, flags : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 515:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoRetrievePriorityInfo(irp : *const super::super::Foundation:: IRP, fileobject : *const super::super::Foundation:: FILE_OBJECT, thread : super::super::Foundation:: PETHREAD, priorityinfo : *mut IO_PRIORITY_INFO) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 517:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoSetDeviceToVerify(thread : super::super::Foundation:: PETHREAD, deviceobject : *const super::super::Foundation:: DEVICE_OBJECT));

// UNSUPPORTED Rust 519:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Ioctl", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoSetFsTrackOffsetState(irp : *mut super::super::Foundation:: IRP, fstrackoffsetblob : *const super::super::super::Win32::System::Ioctl:: IO_IRP_EXT_TRACK_OFFSET_HEADER, trackedoffset : i64) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 521:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoSetInformation(fileobject : *const super::super::Foundation:: FILE_OBJECT, fileinformationclass : FILE_INFORMATION_CLASS, length : u32, fileinformation : *const core::ffi::c_void) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 523:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoSynchronousPageWrite(fileobject : *const super::super::Foundation:: FILE_OBJECT, memorydescriptorlist : *const super::super::Foundation:: MDL, startingoffset : *const i64, event : *const super::super::Foundation:: KEVENT, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 525:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn IoThreadToProcess(thread : super::super::Foundation:: PETHREAD) -> super::super::Foundation:: PEPROCESS);

// UNSUPPORTED Rust 527:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoUnregisterFileSystem(deviceobject : *const super::super::Foundation:: DEVICE_OBJECT));

// UNSUPPORTED Rust 529:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoUnregisterFsRegistrationChange(driverobject : *const super::super::Foundation:: DRIVER_OBJECT, drivernotificationroutine : super::super::Foundation:: DRIVER_FS_NOTIFICATION));

// UNSUPPORTED Rust 531:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn IoVerifyVolume(deviceobject : *const super::super::Foundation:: DEVICE_OBJECT, allowrawmount : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 533:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn KeAcquireQueuedSpinLock(number : super::super::Foundation:: KSPIN_LOCK_QUEUE_NUMBER) -> u8);

// UNSUPPORTED Rust 535:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn KeAcquireSpinLockRaiseToSynch(spinlock : *mut usize) -> u8);

// UNSUPPORTED Rust 536:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn KeAttachProcess(process : super::super::Foundation:: PRKPROCESS));

// UNSUPPORTED Rust 538:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn KeDetachProcess());

// UNSUPPORTED Rust 539:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn KeInitializeMutant(mutant : *mut super::super::Foundation:: KMUTANT, initialowner : bool));

// UNSUPPORTED Rust 541:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn KeInitializeQueue(queue : *mut super::super::Foundation:: KQUEUE, count : u32));

// UNSUPPORTED Rust 543:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn KeInsertHeadQueue(queue : *mut super::super::Foundation:: KQUEUE, entry : *mut super::super::super::Win32::System::Kernel:: LIST_ENTRY) -> i32);

// UNSUPPORTED Rust 545:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn KeInsertQueue(queue : *mut super::super::Foundation:: KQUEUE, entry : *mut super::super::super::Win32::System::Kernel:: LIST_ENTRY) -> i32);

// UNSUPPORTED Rust 547:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn KeReadStateMutant(mutant : *const super::super::Foundation:: KMUTANT) -> i32);

// UNSUPPORTED Rust 549:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn KeReadStateQueue(queue : *const super::super::Foundation:: KQUEUE) -> i32);

// UNSUPPORTED Rust 551:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn KeReleaseMutant(mutant : *mut super::super::Foundation:: KMUTANT, increment : i32, abandoned : bool, wait : bool) -> i32);

// UNSUPPORTED Rust 553:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn KeReleaseQueuedSpinLock(number : super::super::Foundation:: KSPIN_LOCK_QUEUE_NUMBER, oldirql : u8));

// UNSUPPORTED Rust 555:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn KeRemoveQueue(queue : *mut super::super::Foundation:: KQUEUE, waitmode : i8, timeout : *const i64) -> *mut super::super::super::Win32::System::Kernel:: LIST_ENTRY);

// UNSUPPORTED Rust 557:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn KeRemoveQueueEx(queue : *mut super::super::Foundation:: KQUEUE, waitmode : i8, alertable : bool, timeout : *const i64, entryarray : *mut *mut super::super::super::Win32::System::Kernel:: LIST_ENTRY, count : u32) -> u32);

// UNSUPPORTED Rust 559:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn KeRundownQueue(queue : *mut super::super::Foundation:: KQUEUE) -> *mut super::super::super::Win32::System::Kernel:: LIST_ENTRY);

// UNSUPPORTED Rust 561:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn KeSetIdealProcessorThread(thread : super::super::Foundation:: PKTHREAD, processor : u8) -> u8);

// UNSUPPORTED Rust 563:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn KeSetKernelStackSwapEnable(enable : bool) -> bool);

// UNSUPPORTED Rust 564:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn KeStackAttachProcess(process : super::super::Foundation:: PRKPROCESS, apcstate : *mut KAPC_STATE));

// UNSUPPORTED Rust 566:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn KeTryToAcquireQueuedSpinLock(number : super::super::Foundation:: KSPIN_LOCK_QUEUE_NUMBER, oldirql : *mut u8) -> u32);

// UNSUPPORTED Rust 568:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("ntoskrnl.exe" "system" fn KeUnstackDetachProcess(apcstate : *const KAPC_STATE));

// UNSUPPORTED Rust 570:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn MakeSignature(phcontext : *const SecHandle, fqop : u32, pmessage : *const SecBufferDesc, messageseqno : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 571:1: declaration Macro has no candidate rule
// windows_link::link!("ksecdd.sys" "system" fn MapSecurityError(secstatus : windows_sys::core::HRESULT) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 572:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn MmCanFileBeTruncated(sectionpointer : *const super::super::Foundation:: SECTION_OBJECT_POINTERS, newfilesize : *const i64) -> bool);

// UNSUPPORTED Rust 574:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn MmDoesFileHaveUserWritableReferences(sectionpointer : *const super::super::Foundation:: SECTION_OBJECT_POINTERS) -> u32);

// UNSUPPORTED Rust 576:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn MmFlushImageSection(sectionobjectpointer : *const super::super::Foundation:: SECTION_OBJECT_POINTERS, flushtype : MMFLUSH_TYPE) -> bool);

// UNSUPPORTED Rust 578:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn MmForceSectionClosed(sectionobjectpointer : *const super::super::Foundation:: SECTION_OBJECT_POINTERS, delayclose : bool) -> bool);

// UNSUPPORTED Rust 580:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn MmForceSectionClosedEx(sectionobjectpointer : *const super::super::Foundation:: SECTION_OBJECT_POINTERS, forcecloseflags : u32) -> bool);

// UNSUPPORTED Rust 582:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn MmGetMaximumFileSectionSize() -> u64);

// UNSUPPORTED Rust 583:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn MmIsFileSectionActive(fssectionpointer : *const super::super::Foundation:: SECTION_OBJECT_POINTERS, flags : u32, sectionisactive : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 585:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn MmIsRecursiveIoFault() -> bool);

// UNSUPPORTED Rust 586:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn MmMdlPagesAreZero(mdl : *const super::super::Foundation:: MDL) -> u32);

// UNSUPPORTED Rust 588:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_Storage_FileSystem", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// windows_link::link!("ntoskrnl.exe" "system" fn MmPrefetchPages(numberoflists : u32, readlists : *const *const READ_LIST) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 590:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn MmSetAddressRangeModified(address : *const core::ffi::c_void, length : usize) -> bool);

// UNSUPPORTED Rust 591:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn NtAccessCheckAndAuditAlarm(subsystemname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, handleid : *const core::ffi::c_void, objecttypename : *const super::super::super::Win32::Foundation:: UNICODE_STRING, objectname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, desiredaccess : u32, genericmapping : *const super::super::super::Win32::Security:: GENERIC_MAPPING, objectcreation : bool, grantedaccess : *mut u32, accessstatus : *mut i32, generateonclose : *mut bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 593:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn NtAccessCheckByTypeAndAuditAlarm(subsystemname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, handleid : *const core::ffi::c_void, objecttypename : *const super::super::super::Win32::Foundation:: UNICODE_STRING, objectname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, principalselfsid : super::super::super::Win32::Security:: PSID, desiredaccess : u32, audittype : super::super::super::Win32::Security:: AUDIT_EVENT_TYPE, flags : u32, objecttypelist : *const super::super::super::Win32::Security:: OBJECT_TYPE_LIST, objecttypelistlength : u32, genericmapping : *const super::super::super::Win32::Security:: GENERIC_MAPPING, objectcreation : bool, grantedaccess : *mut u32, accessstatus : *mut i32, generateonclose : *mut bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 595:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn NtAccessCheckByTypeResultListAndAuditAlarm(subsystemname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, handleid : *const core::ffi::c_void, objecttypename : *const super::super::super::Win32::Foundation:: UNICODE_STRING, objectname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, principalselfsid : super::super::super::Win32::Security:: PSID, desiredaccess : u32, audittype : super::super::super::Win32::Security:: AUDIT_EVENT_TYPE, flags : u32, objecttypelist : *const super::super::super::Win32::Security:: OBJECT_TYPE_LIST, objecttypelistlength : u32, genericmapping : *const super::super::super::Win32::Security:: GENERIC_MAPPING, objectcreation : bool, grantedaccess : *mut u32, accessstatus : *mut i32, generateonclose : *mut bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 597:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn NtAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, handleid : *const core::ffi::c_void, clienttoken : super::super::super::Win32::Foundation:: HANDLE, objecttypename : *const super::super::super::Win32::Foundation:: UNICODE_STRING, objectname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, principalselfsid : super::super::super::Win32::Security:: PSID, desiredaccess : u32, audittype : super::super::super::Win32::Security:: AUDIT_EVENT_TYPE, flags : u32, objecttypelist : *const super::super::super::Win32::Security:: OBJECT_TYPE_LIST, objecttypelistlength : u32, genericmapping : *const super::super::super::Win32::Security:: GENERIC_MAPPING, objectcreation : bool, grantedaccess : *mut u32, accessstatus : *mut i32, generateonclose : *mut bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 599:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn NtAdjustGroupsToken(tokenhandle : super::super::super::Win32::Foundation:: HANDLE, resettodefault : bool, newstate : *const super::super::super::Win32::Security:: TOKEN_GROUPS, bufferlength : u32, previousstate : *mut super::super::super::Win32::Security:: TOKEN_GROUPS, returnlength : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 601:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn NtAdjustPrivilegesToken(tokenhandle : super::super::super::Win32::Foundation:: HANDLE, disableallprivileges : bool, newstate : *const super::super::super::Win32::Security:: TOKEN_PRIVILEGES, bufferlength : u32, previousstate : *mut super::super::super::Win32::Security:: TOKEN_PRIVILEGES, returnlength : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 603:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtAllocateVirtualMemory(processhandle : super::super::super::Win32::Foundation:: HANDLE, baseaddress : *mut *mut core::ffi::c_void, zerobits : usize, regionsize : *mut usize, allocationtype : u32, protect : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 604:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Memory")]
// windows_link::link!("ntdll.dll" "system" fn NtAllocateVirtualMemoryEx(processhandle : super::super::super::Win32::Foundation:: HANDLE, baseaddress : *mut *mut core::ffi::c_void, regionsize : *mut usize, allocationtype : u32, pageprotection : u32, extendedparameters : *mut super::super::super::Win32::System::Memory:: MEM_EXTENDED_PARAMETER, extendedparametercount : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 606:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn NtCancelIoFileEx(filehandle : super::super::super::Win32::Foundation:: HANDLE, iorequesttocancel : *const super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 608:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtCloseObjectAuditAlarm(subsystemname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, handleid : *const core::ffi::c_void, generateonclose : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 609:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntdll.dll" "system" fn NtCreateDirectoryObject(directoryhandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 611:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntdll.dll" "system" fn NtCreateEvent(eventhandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES, eventtype : super::super::super::Win32::System::Kernel:: EVENT_TYPE, initialstate : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 613:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security", feature = "Win32_Storage_FileSystem", feature = "Win32_System_IO"))]
// windows_link::link!("ntdll.dll" "system" fn NtCreateFile(filehandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : super::super::super::Win32::Storage::FileSystem:: FILE_ACCESS_RIGHTS, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, allocationsize : *const i64, fileattributes : super::super::super::Win32::Storage::FileSystem:: FILE_FLAGS_AND_ATTRIBUTES, shareaccess : super::super::super::Win32::Storage::FileSystem:: FILE_SHARE_MODE, createdisposition : NTCREATEFILE_CREATE_DISPOSITION, createoptions : NTCREATEFILE_CREATE_OPTIONS, eabuffer : *const core::ffi::c_void, ealength : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 615:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntdll.dll" "system" fn NtCreateSection(sectionhandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES, maximumsize : *const i64, sectionpageprotection : u32, allocationattributes : u32, filehandle : super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 617:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security", feature = "Win32_System_Memory"))]
// windows_link::link!("ntdll.dll" "system" fn NtCreateSectionEx(sectionhandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES, maximumsize : *const i64, sectionpageprotection : u32, allocationattributes : u32, filehandle : super::super::super::Win32::Foundation:: HANDLE, extendedparameters : *mut super::super::super::Win32::System::Memory:: MEM_EXTENDED_PARAMETER, extendedparametercount : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 619:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntdll.dll" "system" fn NtDeleteFile(objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 621:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtDeleteObjectAuditAlarm(subsystemname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, handleid : *const core::ffi::c_void, generateonclose : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 622:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtDuplicateObject(sourceprocesshandle : super::super::super::Win32::Foundation:: HANDLE, sourcehandle : super::super::super::Win32::Foundation:: HANDLE, targetprocesshandle : super::super::super::Win32::Foundation:: HANDLE, targethandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, handleattributes : u32, options : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 623:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntdll.dll" "system" fn NtDuplicateToken(existingtokenhandle : super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES, effectiveonly : bool, tokentype : super::super::super::Win32::Security:: TOKEN_TYPE, newtokenhandle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 625:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn NtFilterToken(existingtokenhandle : super::super::super::Win32::Foundation:: HANDLE, flags : u32, sidstodisable : *const super::super::super::Win32::Security:: TOKEN_GROUPS, privilegestodelete : *const super::super::super::Win32::Security:: TOKEN_PRIVILEGES, restrictedsids : *const super::super::super::Win32::Security:: TOKEN_GROUPS, newtokenhandle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 627:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn NtFlushBuffersFile(filehandle : super::super::super::Win32::Foundation:: HANDLE, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 629:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn NtFlushBuffersFileEx(filehandle : super::super::super::Win32::Foundation:: HANDLE, flags : u32, parameters : *const core::ffi::c_void, parameterssize : u32, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 631:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn NtFlushVirtualMemory(processhandle : super::super::super::Win32::Foundation:: HANDLE, baseaddress : *mut *mut core::ffi::c_void, regionsize : *mut usize, iostatus : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 633:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtFreeVirtualMemory(processhandle : super::super::super::Win32::Foundation:: HANDLE, baseaddress : *mut *mut core::ffi::c_void, regionsize : *mut usize, freetype : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 634:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn NtFsControlFile(filehandle : super::super::super::Win32::Foundation:: HANDLE, event : super::super::super::Win32::Foundation:: HANDLE, apcroutine : super::super::super::Win32::System::IO:: PIO_APC_ROUTINE, apccontext : *const core::ffi::c_void, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, fscontrolcode : u32, inputbuffer : *const core::ffi::c_void, inputbufferlength : u32, outputbuffer : *mut core::ffi::c_void, outputbufferlength : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 636:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtImpersonateAnonymousToken(threadhandle : super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 637:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn NtLockFile(filehandle : super::super::super::Win32::Foundation:: HANDLE, event : super::super::super::Win32::Foundation:: HANDLE, apcroutine : super::super::super::Win32::System::IO:: PIO_APC_ROUTINE, apccontext : *const core::ffi::c_void, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, byteoffset : *const i64, length : *const i64, key : u32, failimmediately : bool, exclusivelock : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 639:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn NtNotifyChangeKey(keyhandle : super::super::super::Win32::Foundation:: HANDLE, event : super::super::super::Win32::Foundation:: HANDLE, apcroutine : super::super::super::Win32::System::IO:: PIO_APC_ROUTINE, apccontext : *const core::ffi::c_void, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, completionfilter : u32, watchtree : bool, buffer : *mut core::ffi::c_void, buffersize : u32, asynchronous : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 641:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntdll.dll" "system" fn NtOpenDirectoryObject(directoryhandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 643:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security", feature = "Win32_System_IO"))]
// windows_link::link!("ntdll.dll" "system" fn NtOpenFile(filehandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, shareaccess : u32, openoptions : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 645:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn NtOpenObjectAuditAlarm(subsystemname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, handleid : *const core::ffi::c_void, objecttypename : *const super::super::super::Win32::Foundation:: UNICODE_STRING, objectname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, clienttoken : super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, grantedaccess : u32, privileges : *const super::super::super::Win32::Security:: PRIVILEGE_SET, objectcreation : bool, accessgranted : bool, generateonclose : *mut bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 647:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtOpenProcessToken(processhandle : super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, tokenhandle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 648:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtOpenProcessTokenEx(processhandle : super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, handleattributes : u32, tokenhandle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 649:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntdll.dll" "system" fn NtOpenSymbolicLinkObject(linkhandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 651:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtOpenThreadToken(threadhandle : super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, openasself : bool, tokenhandle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 652:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtOpenThreadTokenEx(threadhandle : super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, openasself : bool, handleattributes : u32, tokenhandle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 653:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn NtPrivilegeCheck(clienttoken : super::super::super::Win32::Foundation:: HANDLE, requiredprivileges : *mut super::super::super::Win32::Security:: PRIVILEGE_SET, result : *mut bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 655:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn NtPrivilegeObjectAuditAlarm(subsystemname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, handleid : *const core::ffi::c_void, clienttoken : super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, privileges : *const super::super::super::Win32::Security:: PRIVILEGE_SET, accessgranted : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 657:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn NtPrivilegedServiceAuditAlarm(subsystemname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, servicename : *const super::super::super::Win32::Foundation:: UNICODE_STRING, clienttoken : super::super::super::Win32::Foundation:: HANDLE, privileges : *const super::super::super::Win32::Security:: PRIVILEGE_SET, accessgranted : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 659:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn NtQueryDirectoryFile(filehandle : super::super::super::Win32::Foundation:: HANDLE, event : super::super::super::Win32::Foundation:: HANDLE, apcroutine : super::super::super::Win32::System::IO:: PIO_APC_ROUTINE, apccontext : *const core::ffi::c_void, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, fileinformation : *mut core::ffi::c_void, length : u32, fileinformationclass : FILE_INFORMATION_CLASS, returnsingleentry : bool, filename : *const super::super::super::Win32::Foundation:: UNICODE_STRING, restartscan : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 661:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn NtQueryDirectoryFileEx(filehandle : super::super::super::Win32::Foundation:: HANDLE, event : super::super::super::Win32::Foundation:: HANDLE, apcroutine : super::super::super::Win32::System::IO:: PIO_APC_ROUTINE, apccontext : *const core::ffi::c_void, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, fileinformation : *mut core::ffi::c_void, length : u32, fileinformationclass : FILE_INFORMATION_CLASS, queryflags : u32, filename : *const super::super::super::Win32::Foundation:: UNICODE_STRING) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 663:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtQueryDirectoryObject(directoryhandle : super::super::super::Win32::Foundation:: HANDLE, buffer : *mut core::ffi::c_void, length : u32, returnsingleentry : bool, restartscan : bool, context : *mut u32, returnlength : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 664:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn NtQueryEaFile(filehandle : super::super::super::Win32::Foundation:: HANDLE, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, buffer : *mut core::ffi::c_void, length : u32, returnsingleentry : bool, ealist : *const core::ffi::c_void, ealistlength : u32, eaindex : *const u32, restartscan : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 666:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntdll.dll" "system" fn NtQueryFullAttributesFile(objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES, fileinformation : *mut FILE_NETWORK_OPEN_INFORMATION) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 668:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security", feature = "Win32_System_IO"))]
// windows_link::link!("ntdll.dll" "system" fn NtQueryInformationByName(objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, fileinformation : *mut core::ffi::c_void, length : u32, fileinformationclass : FILE_INFORMATION_CLASS) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 670:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn NtQueryInformationFile(filehandle : super::super::super::Win32::Foundation:: HANDLE, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, fileinformation : *mut core::ffi::c_void, length : u32, fileinformationclass : FILE_INFORMATION_CLASS) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 672:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn NtQueryInformationToken(tokenhandle : super::super::super::Win32::Foundation:: HANDLE, tokeninformationclass : super::super::super::Win32::Security:: TOKEN_INFORMATION_CLASS, tokeninformation : *mut core::ffi::c_void, tokeninformationlength : u32, returnlength : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 674:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Security", feature = "Win32_System_IO"))]
// windows_link::link!("ntdll.dll" "system" fn NtQueryQuotaInformationFile(filehandle : super::super::super::Win32::Foundation:: HANDLE, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, buffer : *mut core::ffi::c_void, length : u32, returnsingleentry : bool, sidlist : *const core::ffi::c_void, sidlistlength : u32, startsid : super::super::super::Win32::Security:: PSID, restartscan : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 676:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn NtQuerySecurityObject(handle : super::super::super::Win32::Foundation:: HANDLE, securityinformation : u32, securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, length : u32, lengthneeded : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 678:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtQuerySymbolicLinkObject(linkhandle : super::super::super::Win32::Foundation:: HANDLE, linktarget : *mut super::super::super::Win32::Foundation:: UNICODE_STRING, returnedlength : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 679:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtQueryVirtualMemory(processhandle : super::super::super::Win32::Foundation:: HANDLE, baseaddress : *const core::ffi::c_void, memoryinformationclass : MEMORY_INFORMATION_CLASS, memoryinformation : *mut core::ffi::c_void, memoryinformationlength : usize, returnlength : *mut usize) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 680:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn NtQueryVolumeInformationFile(filehandle : super::super::super::Win32::Foundation:: HANDLE, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, fsinformation : *mut core::ffi::c_void, length : u32, fsinformationclass : FS_INFORMATION_CLASS) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 682:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn NtReadFile(filehandle : super::super::super::Win32::Foundation:: HANDLE, event : super::super::super::Win32::Foundation:: HANDLE, apcroutine : super::super::super::Win32::System::IO:: PIO_APC_ROUTINE, apccontext : *const core::ffi::c_void, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, buffer : *mut core::ffi::c_void, length : u32, byteoffset : *const i64, key : *const u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 684:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn NtSetEaFile(filehandle : super::super::super::Win32::Foundation:: HANDLE, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, buffer : *const core::ffi::c_void, length : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 686:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtSetEvent(eventhandle : super::super::super::Win32::Foundation:: HANDLE, previousstate : *mut i32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 687:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn NtSetInformationFile(filehandle : super::super::super::Win32::Foundation:: HANDLE, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, fileinformation : *const core::ffi::c_void, length : u32, fileinformationclass : FILE_INFORMATION_CLASS) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 689:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn NtSetInformationToken(tokenhandle : super::super::super::Win32::Foundation:: HANDLE, tokeninformationclass : super::super::super::Win32::Security:: TOKEN_INFORMATION_CLASS, tokeninformation : *const core::ffi::c_void, tokeninformationlength : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 691:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtSetInformationVirtualMemory(processhandle : super::super::super::Win32::Foundation:: HANDLE, vminformationclass : VIRTUAL_MEMORY_INFORMATION_CLASS, numberofentries : usize, virtualaddresses : *const MEMORY_RANGE_ENTRY, vminformation : *const core::ffi::c_void, vminformationlength : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 692:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn NtSetQuotaInformationFile(filehandle : super::super::super::Win32::Foundation:: HANDLE, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, buffer : *const core::ffi::c_void, length : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 694:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn NtSetSecurityObject(handle : super::super::super::Win32::Foundation:: HANDLE, securityinformation : u32, securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 696:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn NtSetVolumeInformationFile(filehandle : super::super::super::Win32::Foundation:: HANDLE, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, fsinformation : *const core::ffi::c_void, length : u32, fsinformationclass : FS_INFORMATION_CLASS) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 698:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn NtUnlockFile(filehandle : super::super::super::Win32::Foundation:: HANDLE, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, byteoffset : *const i64, length : *const i64, key : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 700:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn NtWriteFile(filehandle : super::super::super::Win32::Foundation:: HANDLE, event : super::super::super::Win32::Foundation:: HANDLE, apcroutine : super::super::super::Win32::System::IO:: PIO_APC_ROUTINE, apccontext : *const core::ffi::c_void, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, buffer : *const core::ffi::c_void, length : u32, byteoffset : *const i64, key : *const u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 702:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn ObInsertObject(object : *const core::ffi::c_void, passedaccessstate : *mut super::super::Foundation:: ACCESS_STATE, desiredaccess : u32, objectpointerbias : u32, newobject : *mut *mut core::ffi::c_void, handle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 704:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn ObIsKernelHandle(handle : super::super::super::Win32::Foundation:: HANDLE) -> bool);

// UNSUPPORTED Rust 705:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn ObMakeTemporaryObject(object : *const core::ffi::c_void));

// UNSUPPORTED Rust 706:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn ObOpenObjectByPointer(object : *const core::ffi::c_void, handleattributes : u32, passedaccessstate : *const super::super::Foundation:: ACCESS_STATE, desiredaccess : u32, objecttype : super::super::Foundation:: POBJECT_TYPE, accessmode : i8, handle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 708:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn ObOpenObjectByPointerWithTag(object : *const core::ffi::c_void, handleattributes : u32, passedaccessstate : *const super::super::Foundation:: ACCESS_STATE, desiredaccess : u32, objecttype : super::super::Foundation:: POBJECT_TYPE, accessmode : i8, tag : u32, handle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 710:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn ObQueryNameString(object : *const core::ffi::c_void, objectnameinfo : *mut super::super::Foundation:: OBJECT_NAME_INFORMATION, length : u32, returnlength : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 712:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn ObQueryObjectAuditingByHandle(handle : super::super::super::Win32::Foundation:: HANDLE, generateonclose : *mut bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 713:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntdll.dll" "system" fn PfxFindPrefix(prefixtable : *const PREFIX_TABLE, fullname : *const super::super::super::Win32::System::Kernel:: STRING) -> *mut PREFIX_TABLE_ENTRY);

// UNSUPPORTED Rust 715:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntdll.dll" "system" fn PfxInitialize(prefixtable : *mut PREFIX_TABLE));

// UNSUPPORTED Rust 717:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntdll.dll" "system" fn PfxInsertPrefix(prefixtable : *const PREFIX_TABLE, prefix : *const super::super::super::Win32::System::Kernel:: STRING, prefixtableentry : *mut PREFIX_TABLE_ENTRY) -> bool);

// UNSUPPORTED Rust 719:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntdll.dll" "system" fn PfxRemovePrefix(prefixtable : *const PREFIX_TABLE, prefixtableentry : *const PREFIX_TABLE_ENTRY));

// UNSUPPORTED Rust 721:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntoskrnl.exe" "system" fn PoQueueShutdownWorkItem(workitem : *mut super::super::Foundation:: WORK_QUEUE_ITEM) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 723:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn PsAssignImpersonationToken(thread : super::super::Foundation:: PETHREAD, token : super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 725:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn PsChargePoolQuota(process : super::super::Foundation:: PEPROCESS, pooltype : super::super::Foundation:: POOL_TYPE, amount : usize));

// UNSUPPORTED Rust 727:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn PsChargeProcessPoolQuota(process : super::super::Foundation:: PEPROCESS, pooltype : super::super::Foundation:: POOL_TYPE, amount : usize) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 729:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn PsDereferenceImpersonationToken(impersonationtoken : *const core::ffi::c_void));

// UNSUPPORTED Rust 730:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn PsDereferencePrimaryToken(primarytoken : *const core::ffi::c_void));

// UNSUPPORTED Rust 731:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn PsDisableImpersonation(thread : super::super::Foundation:: PETHREAD, impersonationstate : *mut super::super::super::Win32::Security:: SE_IMPERSONATION_STATE) -> bool);

// UNSUPPORTED Rust 733:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn PsGetProcessExitTime() -> i64);

// UNSUPPORTED Rust 734:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn PsGetThreadProcess(thread : super::super::Foundation:: PETHREAD) -> super::super::Foundation:: PEPROCESS);

// UNSUPPORTED Rust 736:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn PsImpersonateClient(thread : super::super::Foundation:: PETHREAD, token : *const core::ffi::c_void, copyonopen : bool, effectiveonly : bool, impersonationlevel : super::super::super::Win32::Security:: SECURITY_IMPERSONATION_LEVEL) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 738:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn PsIsDiskCountersEnabled() -> bool);

// UNSUPPORTED Rust 739:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn PsIsSystemThread(thread : super::super::Foundation:: PETHREAD) -> bool);

// UNSUPPORTED Rust 741:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn PsIsThreadTerminating(thread : super::super::Foundation:: PETHREAD) -> bool);

// UNSUPPORTED Rust 743:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn PsLookupProcessByProcessId(processid : super::super::super::Win32::Foundation:: HANDLE, process : *mut super::super::Foundation:: PEPROCESS) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 745:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn PsLookupThreadByThreadId(threadid : super::super::super::Win32::Foundation:: HANDLE, thread : *mut super::super::Foundation:: PETHREAD) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 747:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn PsReferenceImpersonationToken(thread : super::super::Foundation:: PETHREAD, copyonopen : *mut bool, effectiveonly : *mut bool, impersonationlevel : *mut super::super::super::Win32::Security:: SECURITY_IMPERSONATION_LEVEL) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 749:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn PsReferencePrimaryToken(process : super::super::Foundation:: PEPROCESS) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 751:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn PsRestoreImpersonation(thread : super::super::Foundation:: PETHREAD, impersonationstate : *const super::super::super::Win32::Security:: SE_IMPERSONATION_STATE));

// UNSUPPORTED Rust 753:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn PsReturnPoolQuota(process : super::super::Foundation:: PEPROCESS, pooltype : super::super::Foundation:: POOL_TYPE, amount : usize));

// UNSUPPORTED Rust 755:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn PsRevertToSelf());

// UNSUPPORTED Rust 756:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn PsUpdateDiskCounters(process : super::super::Foundation:: PEPROCESS, bytesread : u64, byteswritten : u64, readoperationcount : u32, writeoperationcount : u32, flushoperationcount : u32));

// UNSUPPORTED Rust 758:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn QuerySecurityContextToken(phcontext : *const SecHandle, token : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 759:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn RtlAbsoluteToSelfRelativeSD(absolutesecuritydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, selfrelativesecuritydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, bufferlength : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 761:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn RtlAddAccessAllowedAce(acl : *mut super::super::super::Win32::Security:: ACL, acerevision : u32, accessmask : u32, sid : super::super::super::Win32::Security:: PSID) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 763:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn RtlAddAccessAllowedAceEx(acl : *mut super::super::super::Win32::Security:: ACL, acerevision : u32, aceflags : u32, accessmask : u32, sid : super::super::super::Win32::Security:: PSID) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 765:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn RtlAddAce(acl : *mut super::super::super::Win32::Security:: ACL, acerevision : u32, startingaceindex : u32, acelist : *const core::ffi::c_void, acelistlength : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 767:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn RtlAllocateAndInitializeSid(identifierauthority : *const super::super::super::Win32::Security:: SID_IDENTIFIER_AUTHORITY, subauthoritycount : u8, subauthority0 : u32, subauthority1 : u32, subauthority2 : u32, subauthority3 : u32, subauthority4 : u32, subauthority5 : u32, subauthority6 : u32, subauthority7 : u32, sid : *mut super::super::super::Win32::Security:: PSID) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 769:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn RtlAllocateAndInitializeSidEx(identifierauthority : *const super::super::super::Win32::Security:: SID_IDENTIFIER_AUTHORITY, subauthoritycount : u8, subauthorities : *const u32, sid : *mut super::super::super::Win32::Security:: PSID) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 771:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlAllocateHeap(heaphandle : *const core::ffi::c_void, flags : u32, size : usize) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 772:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("ntdll.dll" "system" fn RtlAppendStringToString(destination : *mut super::super::super::Win32::System::Kernel:: STRING, source : *const super::super::super::Win32::System::Kernel:: STRING) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 774:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlCompareAltitudes(altitude1 : *const super::super::super::Win32::Foundation:: UNICODE_STRING, altitude2 : *const super::super::super::Win32::Foundation:: UNICODE_STRING) -> i32);

// UNSUPPORTED Rust 775:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlCompareMemoryUlong(source : *const core::ffi::c_void, length : usize, pattern : u32) -> usize);

// UNSUPPORTED Rust 776:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlCompressBuffer(compressionformatandengine : u16, uncompressedbuffer : *const u8, uncompressedbuffersize : u32, compressedbuffer : *mut u8, compressedbuffersize : u32, uncompressedchunksize : u32, finalcompressedsize : *mut u32, workspace : *const core::ffi::c_void) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 777:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn RtlCompressChunks(uncompressedbuffer : *const u8, uncompressedbuffersize : u32, compressedbuffer : *mut u8, compressedbuffersize : u32, compresseddatainfo : *mut COMPRESSED_DATA_INFO, compresseddatainfolength : u32, workspace : *const core::ffi::c_void) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 778:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlCopyLuid(destinationluid : *mut super::super::super::Win32::Foundation:: LUID, sourceluid : *const super::super::super::Win32::Foundation:: LUID));

// UNSUPPORTED Rust 779:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn RtlCopySid(destinationsidlength : u32, destinationsid : super::super::super::Win32::Security:: PSID, sourcesid : super::super::super::Win32::Security:: PSID) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 781:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn RtlCreateAcl(acl : *mut super::super::super::Win32::Security:: ACL, acllength : u32, aclrevision : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 783:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlCreateHeap(flags : u32, heapbase : *const core::ffi::c_void, reservesize : usize, commitsize : usize, lock : *const core::ffi::c_void, parameters : *const RTL_HEAP_PARAMETERS) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 784:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn RtlCreateServiceSid(servicename : *const super::super::super::Win32::Foundation:: UNICODE_STRING, servicesid : super::super::super::Win32::Security:: PSID, servicesidlength : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 786:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlCreateSystemVolumeInformationFolder(volumerootpath : *const super::super::super::Win32::Foundation:: UNICODE_STRING) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 787:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlCreateUnicodeString(destinationstring : *mut super::super::super::Win32::Foundation:: UNICODE_STRING, sourcestring : windows_sys::core::PCWSTR) -> bool);

// UNSUPPORTED Rust 788:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn RtlCreateVirtualAccountSid(name : *const super::super::super::Win32::Foundation:: UNICODE_STRING, basesubauthority : u32, sid : super::super::super::Win32::Security:: PSID, sidlength : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 790:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlCustomCPToUnicodeN(customcp : *const CPTABLEINFO, unicodestring : windows_sys::core::PWSTR, maxbytesinunicodestring : u32, bytesinunicodestring : *mut u32, customcpstring : windows_sys::core::PCSTR, bytesincustomcpstring : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 791:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlDecompressBuffer(compressionformat : u16, uncompressedbuffer : *mut u8, uncompressedbuffersize : u32, compressedbuffer : *const u8, compressedbuffersize : u32, finaluncompressedsize : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 792:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlDecompressBufferEx(compressionformat : u16, uncompressedbuffer : *mut u8, uncompressedbuffersize : u32, compressedbuffer : *const u8, compressedbuffersize : u32, finaluncompressedsize : *mut u32, workspace : *const core::ffi::c_void) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 793:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn RtlDecompressBufferEx2(compressionformat : u16, uncompressedbuffer : *mut u8, uncompressedbuffersize : u32, compressedbuffer : *const u8, compressedbuffersize : u32, uncompressedchunksize : u32, finaluncompressedsize : *mut u32, workspace : *const core::ffi::c_void) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 794:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn RtlDecompressChunks(uncompressedbuffer : *mut u8, uncompressedbuffersize : u32, compressedbuffer : *const u8, compressedbuffersize : u32, compressedtail : *const u8, compressedtailsize : u32, compresseddatainfo : *const COMPRESSED_DATA_INFO) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 795:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlDecompressFragment(compressionformat : u16, uncompressedfragment : *mut u8, uncompressedfragmentsize : u32, compressedbuffer : *const u8, compressedbuffersize : u32, fragmentoffset : u32, finaluncompressedsize : *mut u32, workspace : *const core::ffi::c_void) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 796:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn RtlDecompressFragmentEx(compressionformat : u16, uncompressedfragment : *mut u8, uncompressedfragmentsize : u32, compressedbuffer : *const u8, compressedbuffersize : u32, fragmentoffset : u32, uncompressedchunksize : u32, finaluncompressedsize : *mut u32, workspace : *const core::ffi::c_void) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 797:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn RtlDeleteAce(acl : *mut super::super::super::Win32::Security:: ACL, aceindex : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 799:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn RtlDescribeChunk(compressionformat : u16, compressedbuffer : *mut *mut u8, endofcompressedbufferplus1 : *const u8, chunkbuffer : *mut *mut u8, chunksize : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 800:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlDestroyHeap(heaphandle : *const core::ffi::c_void) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 801:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlDosPathNameToNtPathName_U_WithStatus(dosfilename : windows_sys::core::PCWSTR, ntfilename : *mut super::super::super::Win32::Foundation:: UNICODE_STRING, filepart : *mut windows_sys::core::PWSTR, reserved : *const core::ffi::c_void) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 802:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlDowncaseUnicodeString(destinationstring : *mut super::super::super::Win32::Foundation:: UNICODE_STRING, sourcestring : *const super::super::super::Win32::Foundation:: UNICODE_STRING, allocatedestinationstring : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 803:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlDuplicateUnicodeString(flags : u32, stringin : *const super::super::super::Win32::Foundation:: UNICODE_STRING, stringout : *mut super::super::super::Win32::Foundation:: UNICODE_STRING) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 804:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn RtlEqualPrefixSid(sid1 : super::super::super::Win32::Security:: PSID, sid2 : super::super::super::Win32::Security:: PSID) -> bool);

// UNSUPPORTED Rust 806:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn RtlEqualSid(sid1 : super::super::super::Win32::Security:: PSID, sid2 : super::super::super::Win32::Security:: PSID) -> bool);

// UNSUPPORTED Rust 808:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn RtlFindUnicodePrefix(prefixtable : *const UNICODE_PREFIX_TABLE, fullname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, caseinsensitiveindex : u32) -> *mut UNICODE_PREFIX_TABLE_ENTRY);

// UNSUPPORTED Rust 810:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlFreeHeap(heaphandle : *const core::ffi::c_void, flags : u32, baseaddress : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 811:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn RtlFreeSid(sid : super::super::super::Win32::Security:: PSID) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 813:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlGenerate8dot3Name(name : *const super::super::super::Win32::Foundation:: UNICODE_STRING, allowextendedcharacters : bool, context : *mut GENERATE_NAME_CONTEXT, name8dot3 : *mut super::super::super::Win32::Foundation:: UNICODE_STRING) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 814:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn RtlGetAce(acl : *const super::super::super::Win32::Security:: ACL, aceindex : u32, ace : *mut *mut core::ffi::c_void) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 816:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlGetCompressionWorkSpaceSize(compressionformatandengine : u16, compressbufferworkspacesize : *mut u32, compressfragmentworkspacesize : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 817:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn RtlGetDaclSecurityDescriptor(securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, daclpresent : *mut bool, dacl : *mut *mut super::super::super::Win32::Security:: ACL, dacldefaulted : *mut bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 819:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn RtlGetGroupSecurityDescriptor(securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, group : *mut super::super::super::Win32::Security:: PSID, groupdefaulted : *mut bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 821:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn RtlGetOwnerSecurityDescriptor(securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, owner : *mut super::super::super::Win32::Security:: PSID, ownerdefaulted : *mut bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 823:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn RtlGetSaclSecurityDescriptor(securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, saclpresent : *mut bool, sacl : *mut *mut super::super::super::Win32::Security:: ACL, sacldefaulted : *mut bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 825:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn RtlIdentifierAuthoritySid(sid : super::super::super::Win32::Security:: PSID) -> *mut super::super::super::Win32::Security:: SID_IDENTIFIER_AUTHORITY);

// UNSUPPORTED Rust 827:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlIdnToAscii(flags : u32, sourcestring : windows_sys::core::PCWSTR, sourcestringlength : i32, destinationstring : windows_sys::core::PWSTR, destinationstringlength : *mut i32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 828:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlIdnToNameprepUnicode(flags : u32, sourcestring : windows_sys::core::PCWSTR, sourcestringlength : i32, destinationstring : windows_sys::core::PWSTR, destinationstringlength : *mut i32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 829:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlIdnToUnicode(flags : u32, sourcestring : windows_sys::core::PCWSTR, sourcestringlength : i32, destinationstring : windows_sys::core::PWSTR, destinationstringlength : *mut i32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 830:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlInitCodePageTable(tablebase : *const u16, codepagetable : *mut CPTABLEINFO));

// UNSUPPORTED Rust 831:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlInitUnicodeStringEx(destinationstring : *mut super::super::super::Win32::Foundation:: UNICODE_STRING, sourcestring : windows_sys::core::PCWSTR) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 832:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn RtlInitializeSid(sid : super::super::super::Win32::Security:: PSID, identifierauthority : *const super::super::super::Win32::Security:: SID_IDENTIFIER_AUTHORITY, subauthoritycount : u8) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 834:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "C" fn RtlInitializeSidEx(sid : super::super::super::Win32::Security:: PSID, identifierauthority : *const super::super::super::Win32::Security:: SID_IDENTIFIER_AUTHORITY, subauthoritycount : u8, ...) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 836:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn RtlInitializeUnicodePrefix(prefixtable : *mut UNICODE_PREFIX_TABLE));

// UNSUPPORTED Rust 838:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn RtlInsertUnicodePrefix(prefixtable : *const UNICODE_PREFIX_TABLE, prefix : *const super::super::super::Win32::Foundation:: UNICODE_STRING, prefixtableentry : *mut UNICODE_PREFIX_TABLE_ENTRY) -> bool);

// UNSUPPORTED Rust 840:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlIsCloudFilesPlaceholder(fileattributes : u32, reparsetag : u32) -> bool);

// UNSUPPORTED Rust 841:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlIsDosDeviceName_U(dosfilename : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 842:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag : u32) -> bool);

// UNSUPPORTED Rust 843:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlIsNormalizedString(normform : u32, sourcestring : windows_sys::core::PCWSTR, sourcestringlength : i32, normalized : *mut bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 844:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlIsPartialPlaceholder(fileattributes : u32, reparsetag : u32) -> bool);

// UNSUPPORTED Rust 845:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlIsPartialPlaceholderFileHandle(filehandle : super::super::super::Win32::Foundation:: HANDLE, ispartialplaceholder : *mut bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 846:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlIsPartialPlaceholderFileInfo(infobuffer : *const core::ffi::c_void, infoclass : FILE_INFORMATION_CLASS, ispartialplaceholder : *mut bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 847:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn RtlIsSandboxedToken(context : *const super::super::Foundation:: SECURITY_SUBJECT_CONTEXT, previousmode : i8) -> bool);

// UNSUPPORTED Rust 849:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn RtlIsValidOemCharacter(char : windows_sys::core::PWSTR) -> bool);

// UNSUPPORTED Rust 850:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlLengthRequiredSid(subauthoritycount : u32) -> u32);

// UNSUPPORTED Rust 851:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn RtlLengthSid(sid : super::super::super::Win32::Security:: PSID) -> u32);

// UNSUPPORTED Rust 853:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlMultiByteToUnicodeN(unicodestring : windows_sys::core::PWSTR, maxbytesinunicodestring : u32, bytesinunicodestring : *mut u32, multibytestring : windows_sys::core::PCSTR, bytesinmultibytestring : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 854:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlMultiByteToUnicodeSize(bytesinunicodestring : *mut u32, multibytestring : windows_sys::core::PCSTR, bytesinmultibytestring : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 855:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn RtlNextUnicodePrefix(prefixtable : *const UNICODE_PREFIX_TABLE, restart : bool) -> *mut UNICODE_PREFIX_TABLE_ENTRY);

// UNSUPPORTED Rust 857:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlNormalizeString(normform : u32, sourcestring : windows_sys::core::PCWSTR, sourcestringlength : i32, destinationstring : windows_sys::core::PWSTR, destinationstringlength : *mut i32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 858:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlNtStatusToDosErrorNoTeb(status : super::super::super::Win32::Foundation:: NTSTATUS) -> u32);

// UNSUPPORTED Rust 859:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("ntoskrnl.exe" "system" fn RtlOemStringToCountedUnicodeString(destinationstring : *mut super::super::super::Win32::Foundation:: UNICODE_STRING, sourcestring : *const super::super::super::Win32::System::Kernel:: STRING, allocatedestinationstring : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 861:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("ntdll.dll" "system" fn RtlOemStringToUnicodeString(destinationstring : *mut super::super::super::Win32::Foundation:: UNICODE_STRING, sourcestring : *const super::super::super::Win32::System::Kernel:: STRING, allocatedestinationstring : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 863:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlOemToUnicodeN(unicodestring : windows_sys::core::PWSTR, maxbytesinunicodestring : u32, bytesinunicodestring : *mut u32, oemstring : windows_sys::core::PCSTR, bytesinoemstring : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 864:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("ntdll.dll" "system" fn RtlPrefixString(string1 : *const super::super::super::Win32::System::Kernel:: STRING, string2 : *const super::super::super::Win32::System::Kernel:: STRING, caseinsensitive : bool) -> bool);

// UNSUPPORTED Rust 866:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlQueryPackageIdentity(tokenobject : *const core::ffi::c_void, packagefullname : windows_sys::core::PWSTR, packagesize : *mut usize, appid : windows_sys::core::PWSTR, appidsize : *mut usize, packaged : *mut bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 867:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlQueryPackageIdentityEx(tokenobject : *const core::ffi::c_void, packagefullname : windows_sys::core::PWSTR, packagesize : *mut usize, appid : windows_sys::core::PWSTR, appidsize : *mut usize, dynamicid : *mut windows_sys::core::GUID, flags : *mut u64) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 868:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlQueryProcessPlaceholderCompatibilityMode() -> i8);

// UNSUPPORTED Rust 869:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlQueryThreadPlaceholderCompatibilityMode() -> i8);

// UNSUPPORTED Rust 870:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlRandom(seed : *mut u32) -> u32);

// UNSUPPORTED Rust 871:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlRandomEx(seed : *mut u32) -> u32);

// UNSUPPORTED Rust 872:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn RtlRemoveUnicodePrefix(prefixtable : *const UNICODE_PREFIX_TABLE, prefixtableentry : *const UNICODE_PREFIX_TABLE_ENTRY));

// UNSUPPORTED Rust 874:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn RtlReplaceSidInSd(securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, oldsid : super::super::super::Win32::Security:: PSID, newsid : super::super::super::Win32::Security:: PSID, numchanges : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 876:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn RtlReserveChunk(compressionformat : u16, compressedbuffer : *mut *mut u8, endofcompressedbufferplus1 : *const u8, chunkbuffer : *mut *mut u8, chunksize : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 877:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlSecondsSince1970ToTime(elapsedseconds : u32, time : *mut i64));

// UNSUPPORTED Rust 878:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlSecondsSince1980ToTime(elapsedseconds : u32, time : *mut i64));

// UNSUPPORTED Rust 879:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn RtlSelfRelativeToAbsoluteSD(selfrelativesecuritydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, absolutesecuritydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, absolutesecuritydescriptorsize : *mut u32, dacl : *mut super::super::super::Win32::Security:: ACL, daclsize : *mut u32, sacl : *mut super::super::super::Win32::Security:: ACL, saclsize : *mut u32, owner : super::super::super::Win32::Security:: PSID, ownersize : *mut u32, primarygroup : super::super::super::Win32::Security:: PSID, primarygroupsize : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 881:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn RtlSetGroupSecurityDescriptor(securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, group : super::super::super::Win32::Security:: PSID, groupdefaulted : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 883:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn RtlSetOwnerSecurityDescriptor(securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, owner : super::super::super::Win32::Security:: PSID, ownerdefaulted : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 885:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlSetProcessPlaceholderCompatibilityMode(mode : i8) -> i8);

// UNSUPPORTED Rust 886:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlSetThreadPlaceholderCompatibilityMode(mode : i8) -> i8);

// UNSUPPORTED Rust 887:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn RtlSubAuthorityCountSid(sid : super::super::super::Win32::Security:: PSID) -> *mut u8);

// UNSUPPORTED Rust 889:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn RtlSubAuthoritySid(sid : super::super::super::Win32::Security:: PSID, subauthority : u32) -> *mut u32);

// UNSUPPORTED Rust 891:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlTimeToSecondsSince1980(time : *const i64, elapsedseconds : *mut u32) -> bool);

// UNSUPPORTED Rust 892:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("ntdll.dll" "system" fn RtlUnicodeStringToCountedOemString(destinationstring : *mut super::super::super::Win32::System::Kernel:: STRING, sourcestring : *const super::super::super::Win32::Foundation:: UNICODE_STRING, allocatedestinationstring : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 894:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlUnicodeToCustomCPN(customcp : *const CPTABLEINFO, customcpstring : windows_sys::core::PSTR, maxbytesincustomcpstring : u32, bytesincustomcpstring : *mut u32, unicodestring : windows_sys::core::PCWSTR, bytesinunicodestring : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 895:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlUnicodeToMultiByteN(multibytestring : windows_sys::core::PSTR, maxbytesinmultibytestring : u32, bytesinmultibytestring : *mut u32, unicodestring : *const u16, bytesinunicodestring : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 896:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlUnicodeToOemN(oemstring : windows_sys::core::PSTR, maxbytesinoemstring : u32, bytesinoemstring : *mut u32, unicodestring : *const u16, bytesinunicodestring : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 897:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("ntdll.dll" "system" fn RtlUpcaseUnicodeStringToCountedOemString(destinationstring : *mut super::super::super::Win32::System::Kernel:: STRING, sourcestring : *const super::super::super::Win32::Foundation:: UNICODE_STRING, allocatedestinationstring : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 899:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("ntdll.dll" "system" fn RtlUpcaseUnicodeStringToOemString(destinationstring : *mut super::super::super::Win32::System::Kernel:: STRING, sourcestring : *const super::super::super::Win32::Foundation:: UNICODE_STRING, allocatedestinationstring : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 901:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlUpcaseUnicodeToCustomCPN(customcp : *const CPTABLEINFO, customcpstring : windows_sys::core::PSTR, maxbytesincustomcpstring : u32, bytesincustomcpstring : *mut u32, unicodestring : windows_sys::core::PCWSTR, bytesinunicodestring : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 902:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlUpcaseUnicodeToMultiByteN(multibytestring : windows_sys::core::PSTR, maxbytesinmultibytestring : u32, bytesinmultibytestring : *mut u32, unicodestring : *const u16, bytesinunicodestring : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 903:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlUpcaseUnicodeToOemN(oemstring : windows_sys::core::PSTR, maxbytesinoemstring : u32, bytesinoemstring : *mut u32, unicodestring : *const u16, bytesinunicodestring : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 904:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn RtlValidSid(sid : super::super::super::Win32::Security:: PSID) -> bool);

// UNSUPPORTED Rust 906:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlValidateUnicodeString(flags : u32, string : *const super::super::super::Win32::Foundation:: UNICODE_STRING) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 907:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("ntdll.dll" "system" fn RtlxOemStringToUnicodeSize(oemstring : *const super::super::super::Win32::System::Kernel:: STRING) -> u32);

// UNSUPPORTED Rust 909:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlxUnicodeStringToOemSize(unicodestring : *const super::super::super::Win32::Foundation:: UNICODE_STRING) -> u32);

// UNSUPPORTED Rust 910:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntoskrnl.exe" "system" fn SeAccessCheckFromState(securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, primarytokeninformation : *const super::super::super::Win32::Security:: TOKEN_ACCESS_INFORMATION, clienttokeninformation : *const super::super::super::Win32::Security:: TOKEN_ACCESS_INFORMATION, desiredaccess : u32, previouslygrantedaccess : u32, privileges : *mut *mut super::super::super::Win32::Security:: PRIVILEGE_SET, genericmapping : *const super::super::super::Win32::Security:: GENERIC_MAPPING, accessmode : i8, grantedaccess : *mut u32, accessstatus : *mut i32) -> bool);

// UNSUPPORTED Rust 912:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntoskrnl.exe" "system" fn SeAccessCheckFromStateEx(securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, primarytoken : *const core::ffi::c_void, clienttoken : *const core::ffi::c_void, desiredaccess : u32, previouslygrantedaccess : u32, privileges : *mut *mut super::super::super::Win32::Security:: PRIVILEGE_SET, genericmapping : *const super::super::super::Win32::Security:: GENERIC_MAPPING, accessmode : i8, grantedaccess : *mut u32, accessstatus : *mut i32) -> bool);

// UNSUPPORTED Rust 914:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn SeAdjustAccessStateForAccessConstraints(objecttype : *const core::ffi::c_void, securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, accessstate : *mut super::super::Foundation:: ACCESS_STATE));

// UNSUPPORTED Rust 916:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn SeAdjustAccessStateForTrustLabel(objecttype : *const core::ffi::c_void, securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, accessstate : *mut super::super::Foundation:: ACCESS_STATE));

// UNSUPPORTED Rust 918:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn SeAdjustObjectSecurity(objectname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, originaldescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, proposeddescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, subjectsecuritycontext : *const super::super::Foundation:: SECURITY_SUBJECT_CONTEXT, adjusteddescriptor : *mut super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, applyadjusteddescriptor : *mut bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 920:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn SeAppendPrivileges(accessstate : *mut super::super::Foundation:: ACCESS_STATE, privileges : *const super::super::super::Win32::Security:: PRIVILEGE_SET) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 922:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn SeAuditFipsCryptoSelftests(bsuccess : bool, selftestcode : u32));

// UNSUPPORTED Rust 923:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn SeAuditHardLinkCreation(filename : *const super::super::super::Win32::Foundation:: UNICODE_STRING, linkname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, bsuccess : bool));

// UNSUPPORTED Rust 924:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn SeAuditHardLinkCreationWithTransaction(filename : *const super::super::super::Win32::Foundation:: UNICODE_STRING, linkname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, bsuccess : bool, transactionid : *const windows_sys::core::GUID));

// UNSUPPORTED Rust 925:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn SeAuditTransactionStateChange(transactionid : *const windows_sys::core::GUID, resourcemanagerid : *const windows_sys::core::GUID, newtransactionstate : u32));

// UNSUPPORTED Rust 926:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn SeAuditingAnyFileEventsWithContext(securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, subjectsecuritycontext : *const super::super::Foundation:: SECURITY_SUBJECT_CONTEXT) -> bool);

// UNSUPPORTED Rust 928:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn SeAuditingAnyFileEventsWithContextEx(securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, subjectsecuritycontext : *const super::super::Foundation:: SECURITY_SUBJECT_CONTEXT, stagingenabled : *mut bool) -> bool);

// UNSUPPORTED Rust 930:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntoskrnl.exe" "system" fn SeAuditingFileEvents(accessgranted : bool, securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR) -> bool);

// UNSUPPORTED Rust 932:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn SeAuditingFileEventsWithContext(accessgranted : bool, securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, subjectsecuritycontext : *const super::super::Foundation:: SECURITY_SUBJECT_CONTEXT) -> bool);

// UNSUPPORTED Rust 934:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn SeAuditingFileEventsWithContextEx(accessgranted : bool, securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, subjectsecuritycontext : *const super::super::Foundation:: SECURITY_SUBJECT_CONTEXT, stagingenabled : *mut bool) -> bool);

// UNSUPPORTED Rust 936:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn SeAuditingFileOrGlobalEvents(accessgranted : bool, securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, subjectsecuritycontext : *const super::super::Foundation:: SECURITY_SUBJECT_CONTEXT) -> bool);

// UNSUPPORTED Rust 938:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntoskrnl.exe" "system" fn SeAuditingHardLinkEvents(accessgranted : bool, securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR) -> bool);

// UNSUPPORTED Rust 940:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn SeAuditingHardLinkEventsWithContext(accessgranted : bool, securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, subjectsecuritycontext : *const super::super::Foundation:: SECURITY_SUBJECT_CONTEXT) -> bool);

// UNSUPPORTED Rust 942:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn SeCaptureSubjectContextEx(thread : super::super::Foundation:: PETHREAD, process : super::super::Foundation:: PEPROCESS, subjectcontext : *mut super::super::Foundation:: SECURITY_SUBJECT_CONTEXT));

// UNSUPPORTED Rust 944:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn SeCheckForCriticalAceRemoval(currentdescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, newdescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, subjectsecuritycontext : *const super::super::Foundation:: SECURITY_SUBJECT_CONTEXT, aceremoved : *mut bool));

// UNSUPPORTED Rust 946:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn SeCreateClientSecurity(clientthread : super::super::Foundation:: PETHREAD, clientsecurityqos : *const super::super::super::Win32::Security:: SECURITY_QUALITY_OF_SERVICE, remotesession : bool, clientcontext : *mut SECURITY_CLIENT_CONTEXT) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 948:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn SeCreateClientSecurityFromSubjectContext(subjectcontext : *const super::super::Foundation:: SECURITY_SUBJECT_CONTEXT, clientsecurityqos : *const super::super::super::Win32::Security:: SECURITY_QUALITY_OF_SERVICE, serverisremote : bool, clientcontext : *mut SECURITY_CLIENT_CONTEXT) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 950:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntoskrnl.exe" "system" fn SeDeleteClientSecurity(clientcontext : *mut SECURITY_CLIENT_CONTEXT));

// UNSUPPORTED Rust 952:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn SeDeleteObjectAuditAlarm(object : *const core::ffi::c_void, handle : super::super::super::Win32::Foundation:: HANDLE));

// UNSUPPORTED Rust 953:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn SeDeleteObjectAuditAlarmWithTransaction(object : *const core::ffi::c_void, handle : super::super::super::Win32::Foundation:: HANDLE, transactionid : *const windows_sys::core::GUID));

// UNSUPPORTED Rust 954:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntoskrnl.exe" "system" fn SeExamineSacl(sacl : *const super::super::super::Win32::Security:: ACL, resourcesacl : *const super::super::super::Win32::Security:: ACL, token : *const core::ffi::c_void, desiredaccess : u32, accessgranted : bool, generateaudit : *mut bool, generatealarm : *mut bool));

// UNSUPPORTED Rust 956:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntoskrnl.exe" "system" fn SeFilterToken(existingtoken : *const core::ffi::c_void, flags : u32, sidstodisable : *const super::super::super::Win32::Security:: TOKEN_GROUPS, privilegestodelete : *const super::super::super::Win32::Security:: TOKEN_PRIVILEGES, restrictedsids : *const super::super::super::Win32::Security:: TOKEN_GROUPS, filteredtoken : *mut *mut core::ffi::c_void) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 958:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntoskrnl.exe" "system" fn SeFreePrivileges(privileges : *const super::super::super::Win32::Security:: PRIVILEGE_SET));

// UNSUPPORTED Rust 960:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn SeImpersonateClient(clientcontext : *const SECURITY_CLIENT_CONTEXT, serverthread : super::super::Foundation:: PETHREAD));

// UNSUPPORTED Rust 962:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn SeImpersonateClientEx(clientcontext : *const SECURITY_CLIENT_CONTEXT, serverthread : super::super::Foundation:: PETHREAD) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 964:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn SeLocateProcessImageName(process : super::super::Foundation:: PEPROCESS, pimagefilename : *mut *mut super::super::super::Win32::Foundation:: UNICODE_STRING) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 966:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn SeMarkLogonSessionForTerminationNotification(logonid : *const super::super::super::Win32::Foundation:: LUID) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 967:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn SeMarkLogonSessionForTerminationNotificationEx(logonid : *const super::super::super::Win32::Foundation:: LUID, pserversilo : super::super::Foundation:: PESILO) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 969:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn SeOpenObjectAuditAlarm(objecttypename : *const super::super::super::Win32::Foundation:: UNICODE_STRING, object : *const core::ffi::c_void, absoluteobjectname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, accessstate : *const super::super::Foundation:: ACCESS_STATE, objectcreated : bool, accessgranted : bool, accessmode : i8, generateonclose : *mut bool));

// UNSUPPORTED Rust 971:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn SeOpenObjectAuditAlarmWithTransaction(objecttypename : *const super::super::super::Win32::Foundation:: UNICODE_STRING, object : *const core::ffi::c_void, absoluteobjectname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, accessstate : *const super::super::Foundation:: ACCESS_STATE, objectcreated : bool, accessgranted : bool, accessmode : i8, transactionid : *const windows_sys::core::GUID, generateonclose : *mut bool));

// UNSUPPORTED Rust 973:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn SeOpenObjectForDeleteAuditAlarm(objecttypename : *const super::super::super::Win32::Foundation:: UNICODE_STRING, object : *const core::ffi::c_void, absoluteobjectname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, accessstate : *const super::super::Foundation:: ACCESS_STATE, objectcreated : bool, accessgranted : bool, accessmode : i8, generateonclose : *mut bool));

// UNSUPPORTED Rust 975:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn SeOpenObjectForDeleteAuditAlarmWithTransaction(objecttypename : *const super::super::super::Win32::Foundation:: UNICODE_STRING, object : *const core::ffi::c_void, absoluteobjectname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, accessstate : *const super::super::Foundation:: ACCESS_STATE, objectcreated : bool, accessgranted : bool, accessmode : i8, transactionid : *const windows_sys::core::GUID, generateonclose : *mut bool));

// UNSUPPORTED Rust 977:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn SePrivilegeCheck(requiredprivileges : *mut super::super::super::Win32::Security:: PRIVILEGE_SET, subjectsecuritycontext : *const super::super::Foundation:: SECURITY_SUBJECT_CONTEXT, accessmode : i8) -> bool);

// UNSUPPORTED Rust 979:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn SeQueryAuthenticationIdToken(token : *const core::ffi::c_void, authenticationid : *mut super::super::super::Win32::Foundation:: LUID) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 980:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntoskrnl.exe" "system" fn SeQueryInformationToken(token : *const core::ffi::c_void, tokeninformationclass : super::super::super::Win32::Security:: TOKEN_INFORMATION_CLASS, tokeninformation : *mut *mut core::ffi::c_void) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 982:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntoskrnl.exe" "system" fn SeQuerySecurityDescriptorInfo(securityinformation : *const u32, securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, length : *mut u32, objectssecuritydescriptor : *mut super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 984:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntoskrnl.exe" "system" fn SeQueryServerSiloToken(token : *const core::ffi::c_void, pserversilo : *mut super::super::Foundation:: PESILO) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 986:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn SeQuerySessionIdToken(token : *const core::ffi::c_void, sessionid : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 987:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn SeQuerySessionIdTokenEx(token : *const core::ffi::c_void, sessionid : *mut u32, isservicesession : *mut bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 988:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn SeRegisterLogonSessionTerminatedRoutine(callbackroutine : PSE_LOGON_SESSION_TERMINATED_ROUTINE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 989:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn SeRegisterLogonSessionTerminatedRoutineEx(callbackroutine : PSE_LOGON_SESSION_TERMINATED_ROUTINE_EX, context : *const core::ffi::c_void) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 990:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Authentication_Identity")]
// windows_link::link!("ntoskrnl.exe" "system" fn SeReportSecurityEventWithSubCategory(flags : u32, sourcename : *const super::super::super::Win32::Foundation:: UNICODE_STRING, usersid : super::super::super::Win32::Security:: PSID, auditparameters : *const super::super::super::Win32::Security::Authentication::Identity:: SE_ADT_PARAMETER_ARRAY, auditsubcategoryid : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 992:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn SeSetAccessStateGenericMapping(accessstate : *mut super::super::Foundation:: ACCESS_STATE, genericmapping : *const super::super::super::Win32::Security:: GENERIC_MAPPING));

// UNSUPPORTED Rust 994:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn SeSetSecurityDescriptorInfo(object : *const core::ffi::c_void, securityinformation : *const u32, modificationdescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, objectssecuritydescriptor : *mut super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, pooltype : super::super::Foundation:: POOL_TYPE, genericmapping : *const super::super::super::Win32::Security:: GENERIC_MAPPING) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 996:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn SeSetSecurityDescriptorInfoEx(object : *const core::ffi::c_void, securityinformation : *const u32, modificationdescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, objectssecuritydescriptor : *mut super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, autoinheritflags : u32, pooltype : super::super::Foundation:: POOL_TYPE, genericmapping : *const super::super::super::Win32::Security:: GENERIC_MAPPING) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 998:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security"))]
// windows_link::link!("ntoskrnl.exe" "system" fn SeShouldCheckForAccessRightsFromParent(objecttype : *const core::ffi::c_void, childdescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, accessstate : *const super::super::Foundation:: ACCESS_STATE) -> bool);

// UNSUPPORTED Rust 1000:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntoskrnl.exe" "system" fn SeTokenFromAccessInformation(accessinformation : *const super::super::super::Win32::Security:: TOKEN_ACCESS_INFORMATION, token : *mut core::ffi::c_void, length : u32, requiredlength : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1002:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn SeTokenIsAdmin(token : *const core::ffi::c_void) -> bool);

// UNSUPPORTED Rust 1003:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn SeTokenIsRestricted(token : *const core::ffi::c_void) -> bool);

// UNSUPPORTED Rust 1004:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn SeTokenIsWriteRestricted(token : *const core::ffi::c_void) -> bool);

// UNSUPPORTED Rust 1005:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntoskrnl.exe" "system" fn SeTokenType(token : *const core::ffi::c_void) -> super::super::super::Win32::Security:: TOKEN_TYPE);

// UNSUPPORTED Rust 1007:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn SeUnregisterLogonSessionTerminatedRoutine(callbackroutine : PSE_LOGON_SESSION_TERMINATED_ROUTINE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1008:1: declaration Macro has no candidate rule
// windows_link::link!("ntoskrnl.exe" "system" fn SeUnregisterLogonSessionTerminatedRoutineEx(callbackroutine : PSE_LOGON_SESSION_TERMINATED_ROUTINE_EX, context : *const core::ffi::c_void) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1009:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ksecdd.sys" "system" fn SecLookupAccountName(name : *const super::super::super::Win32::Foundation:: UNICODE_STRING, sidsize : *mut u32, sid : super::super::super::Win32::Security:: PSID, nameuse : *mut super::super::super::Win32::Security:: SID_NAME_USE, domainsize : *mut u32, referenceddomain : *mut super::super::super::Win32::Foundation:: UNICODE_STRING) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1011:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ksecdd.sys" "system" fn SecLookupAccountSid(sid : super::super::super::Win32::Security:: PSID, namesize : *mut u32, namebuffer : *mut super::super::super::Win32::Foundation:: UNICODE_STRING, domainsize : *mut u32, domainbuffer : *mut super::super::super::Win32::Foundation:: UNICODE_STRING, nameuse : *mut super::super::super::Win32::Security:: SID_NAME_USE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1013:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ksecdd.sys" "system" fn SecLookupWellKnownSid(sidtype : super::super::super::Win32::Security:: WELL_KNOWN_SID_TYPE, sid : super::super::super::Win32::Security:: PSID, sidbuffersize : u32, sidsize : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1015:1: declaration Macro has no candidate rule
// windows_link::link!("ksecdd.sys" "system" fn SecMakeSPN(serviceclass : *mut super::super::super::Win32::Foundation:: UNICODE_STRING, servicename : *mut super::super::super::Win32::Foundation:: UNICODE_STRING, instancename : *mut super::super::super::Win32::Foundation:: UNICODE_STRING, instanceport : u16, referrer : *mut super::super::super::Win32::Foundation:: UNICODE_STRING, spn : *mut super::super::super::Win32::Foundation:: UNICODE_STRING, length : *mut u32, allocate : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1016:1: declaration Macro has no candidate rule
// windows_link::link!("ksecdd.sys" "system" fn SecMakeSPNEx(serviceclass : *mut super::super::super::Win32::Foundation:: UNICODE_STRING, servicename : *mut super::super::super::Win32::Foundation:: UNICODE_STRING, instancename : *mut super::super::super::Win32::Foundation:: UNICODE_STRING, instanceport : u16, referrer : *mut super::super::super::Win32::Foundation:: UNICODE_STRING, targetinfo : *mut super::super::super::Win32::Foundation:: UNICODE_STRING, spn : *mut super::super::super::Win32::Foundation:: UNICODE_STRING, length : *mut u32, allocate : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1017:1: declaration Macro has no candidate rule
// windows_link::link!("ksecdd.sys" "system" fn SecMakeSPNEx2(serviceclass : *mut super::super::super::Win32::Foundation:: UNICODE_STRING, servicename : *mut super::super::super::Win32::Foundation:: UNICODE_STRING, instancename : *mut super::super::super::Win32::Foundation:: UNICODE_STRING, instanceport : u16, referrer : *mut super::super::super::Win32::Foundation:: UNICODE_STRING, intargetinfo : *mut super::super::super::Win32::Foundation:: UNICODE_STRING, spn : *mut super::super::super::Win32::Foundation:: UNICODE_STRING, totalsize : *mut u32, allocate : bool, istargetinfomarshaled : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1018:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn SetContextAttributesW(phcontext : *const SecHandle, ulattribute : u32, pbuffer : *const core::ffi::c_void, cbbuffer : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 1019:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ksecdd.sys" "system" fn SspiAcceptSecurityContextAsync(asynccontext : *mut super::super::Foundation:: SspiAsyncContext, phcredential : *const SecHandle, phcontext : *const SecHandle, pinput : *const SecBufferDesc, fcontextreq : u32, targetdatarep : u32, phnewcontext : *const SecHandle, poutput : *const SecBufferDesc, pfcontextattr : *const u32, ptsexpiry : *const i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 1021:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security_Authentication_Identity"))]
// windows_link::link!("ksecdd.sys" "system" fn SspiAcquireCredentialsHandleAsyncA(asynccontext : *mut super::super::Foundation:: SspiAsyncContext, pszprincipal : windows_sys::core::PCSTR, pszpackage : windows_sys::core::PCSTR, fcredentialuse : u32, pvlogonid : *const core::ffi::c_void, pauthdata : *const core::ffi::c_void, pgetkeyfn : super::super::super::Win32::Security::Authentication::Identity:: SEC_GET_KEY_FN, pvgetkeyargument : *const core::ffi::c_void, phcredential : *const SecHandle, ptsexpiry : *const i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 1023:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security_Authentication_Identity"))]
// windows_link::link!("ksecdd.sys" "system" fn SspiAcquireCredentialsHandleAsyncW(asynccontext : *mut super::super::Foundation:: SspiAsyncContext, pszprincipal : *const super::super::super::Win32::Foundation:: UNICODE_STRING, pszpackage : *const super::super::super::Win32::Foundation:: UNICODE_STRING, fcredentialuse : u32, pvlogonid : *const core::ffi::c_void, pauthdata : *const core::ffi::c_void, pgetkeyfn : super::super::super::Win32::Security::Authentication::Identity:: SEC_GET_KEY_FN, pvgetkeyargument : *const core::ffi::c_void, phcredential : *const SecHandle, ptsexpiry : *const i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 1025:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ksecdd.sys" "system" fn SspiCreateAsyncContext() -> *mut super::super::Foundation:: SspiAsyncContext);

// UNSUPPORTED Rust 1027:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ksecdd.sys" "system" fn SspiDeleteSecurityContextAsync(asynccontext : *mut super::super::Foundation:: SspiAsyncContext, phcontext : *const SecHandle) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 1029:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ksecdd.sys" "system" fn SspiFreeAsyncContext(handle : *const super::super::Foundation:: SspiAsyncContext));

// UNSUPPORTED Rust 1031:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ksecdd.sys" "system" fn SspiFreeCredentialsHandleAsync(asynccontext : *mut super::super::Foundation:: SspiAsyncContext, phcredential : *const SecHandle) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 1033:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ksecdd.sys" "system" fn SspiGetAsyncCallStatus(handle : *const super::super::Foundation:: SspiAsyncContext) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 1035:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ksecdd.sys" "system" fn SspiInitializeSecurityContextAsyncA(asynccontext : *mut super::super::Foundation:: SspiAsyncContext, phcredential : *const SecHandle, phcontext : *const SecHandle, psztargetname : windows_sys::core::PCSTR, fcontextreq : u32, reserved1 : u32, targetdatarep : u32, pinput : *const SecBufferDesc, reserved2 : u32, phnewcontext : *const SecHandle, poutput : *const SecBufferDesc, pfcontextattr : *const u32, ptsexpiry : *const i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 1037:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ksecdd.sys" "system" fn SspiInitializeSecurityContextAsyncW(asynccontext : *mut super::super::Foundation:: SspiAsyncContext, phcredential : *const SecHandle, phcontext : *const SecHandle, psztargetname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, fcontextreq : u32, reserved1 : u32, targetdatarep : u32, pinput : *const SecBufferDesc, reserved2 : u32, phnewcontext : *const SecHandle, poutput : *const SecBufferDesc, pfcontextattr : *const u32, ptsexpiry : *const i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 1039:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ksecdd.sys" "system" fn SspiReinitAsyncContext(handle : *mut super::super::Foundation:: SspiAsyncContext) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1041:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ksecdd.sys" "system" fn SspiSetAsyncNotifyCallback(context : *const super::super::Foundation:: SspiAsyncContext, callback : SspiAsyncNotifyCallback, callbackdata : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 1043:1: declaration Macro has no candidate rule
// windows_link::link!("secur32.dll" "system" fn VerifySignature(phcontext : *const SecHandle, pmessage : *const SecBufferDesc, messageseqno : u32, pfqop : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 1044:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn ZwAccessCheckAndAuditAlarm(subsystemname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, handleid : *const core::ffi::c_void, objecttypename : *const super::super::super::Win32::Foundation:: UNICODE_STRING, objectname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, desiredaccess : u32, genericmapping : *const super::super::super::Win32::Security:: GENERIC_MAPPING, objectcreation : bool, grantedaccess : *mut u32, accessstatus : *mut i32, generateonclose : *mut bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1046:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn ZwAccessCheckByTypeAndAuditAlarm(subsystemname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, handleid : *const core::ffi::c_void, objecttypename : *const super::super::super::Win32::Foundation:: UNICODE_STRING, objectname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, principalselfsid : super::super::super::Win32::Security:: PSID, desiredaccess : u32, audittype : super::super::super::Win32::Security:: AUDIT_EVENT_TYPE, flags : u32, objecttypelist : *const super::super::super::Win32::Security:: OBJECT_TYPE_LIST, objecttypelistlength : u32, genericmapping : *const super::super::super::Win32::Security:: GENERIC_MAPPING, objectcreation : bool, grantedaccess : *mut u32, accessstatus : *mut i32, generateonclose : *mut bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1048:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn ZwAccessCheckByTypeResultListAndAuditAlarm(subsystemname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, handleid : *const core::ffi::c_void, objecttypename : *const super::super::super::Win32::Foundation:: UNICODE_STRING, objectname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, principalselfsid : super::super::super::Win32::Security:: PSID, desiredaccess : u32, audittype : super::super::super::Win32::Security:: AUDIT_EVENT_TYPE, flags : u32, objecttypelist : *const super::super::super::Win32::Security:: OBJECT_TYPE_LIST, objecttypelistlength : u32, genericmapping : *const super::super::super::Win32::Security:: GENERIC_MAPPING, objectcreation : bool, grantedaccess : *mut u32, accessstatus : *mut i32, generateonclose : *mut bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1050:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn ZwAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, handleid : *const core::ffi::c_void, clienttoken : super::super::super::Win32::Foundation:: HANDLE, objecttypename : *const super::super::super::Win32::Foundation:: UNICODE_STRING, objectname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, principalselfsid : super::super::super::Win32::Security:: PSID, desiredaccess : u32, audittype : super::super::super::Win32::Security:: AUDIT_EVENT_TYPE, flags : u32, objecttypelist : *const super::super::super::Win32::Security:: OBJECT_TYPE_LIST, objecttypelistlength : u32, genericmapping : *const super::super::super::Win32::Security:: GENERIC_MAPPING, objectcreation : bool, grantedaccess : *mut u32, accessstatus : *mut i32, generateonclose : *mut bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1052:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn ZwAdjustGroupsToken(tokenhandle : super::super::super::Win32::Foundation:: HANDLE, resettodefault : bool, newstate : *const super::super::super::Win32::Security:: TOKEN_GROUPS, bufferlength : u32, previousstate : *mut super::super::super::Win32::Security:: TOKEN_GROUPS, returnlength : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1054:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn ZwAdjustPrivilegesToken(tokenhandle : super::super::super::Win32::Foundation:: HANDLE, disableallprivileges : bool, newstate : *const super::super::super::Win32::Security:: TOKEN_PRIVILEGES, bufferlength : u32, previousstate : *mut super::super::super::Win32::Security:: TOKEN_PRIVILEGES, returnlength : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1056:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwAllocateVirtualMemory(processhandle : super::super::super::Win32::Foundation:: HANDLE, baseaddress : *mut *mut core::ffi::c_void, zerobits : usize, regionsize : *mut usize, allocationtype : u32, protect : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1057:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Memory")]
// windows_link::link!("ntdll.dll" "system" fn ZwAllocateVirtualMemoryEx(processhandle : super::super::super::Win32::Foundation:: HANDLE, baseaddress : *mut *mut core::ffi::c_void, regionsize : *mut usize, allocationtype : u32, pageprotection : u32, extendedparameters : *mut super::super::super::Win32::System::Memory:: MEM_EXTENDED_PARAMETER, extendedparametercount : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1059:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn ZwCancelIoFileEx(filehandle : super::super::super::Win32::Foundation:: HANDLE, iorequesttocancel : *const super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1061:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwCloseObjectAuditAlarm(subsystemname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, handleid : *const core::ffi::c_void, generateonclose : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1062:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntdll.dll" "system" fn ZwCreateDirectoryObject(directoryhandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1064:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security", feature = "Win32_System_Kernel"))]
// windows_link::link!("ntdll.dll" "system" fn ZwCreateEvent(eventhandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES, eventtype : super::super::super::Win32::System::Kernel:: EVENT_TYPE, initialstate : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1066:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security", feature = "Win32_System_Memory"))]
// windows_link::link!("ntdll.dll" "system" fn ZwCreateSectionEx(sectionhandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES, maximumsize : *const i64, sectionpageprotection : u32, allocationattributes : u32, filehandle : super::super::super::Win32::Foundation:: HANDLE, extendedparameters : *mut super::super::super::Win32::System::Memory:: MEM_EXTENDED_PARAMETER, extendedparametercount : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1068:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntdll.dll" "system" fn ZwDeleteFile(objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1070:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwDeleteObjectAuditAlarm(subsystemname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, handleid : *const core::ffi::c_void, generateonclose : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1071:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwDuplicateObject(sourceprocesshandle : super::super::super::Win32::Foundation:: HANDLE, sourcehandle : super::super::super::Win32::Foundation:: HANDLE, targetprocesshandle : super::super::super::Win32::Foundation:: HANDLE, targethandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, handleattributes : u32, options : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1072:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntdll.dll" "system" fn ZwDuplicateToken(existingtokenhandle : super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES, effectiveonly : bool, tokentype : super::super::super::Win32::Security:: TOKEN_TYPE, newtokenhandle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1074:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn ZwFilterToken(existingtokenhandle : super::super::super::Win32::Foundation:: HANDLE, flags : u32, sidstodisable : *const super::super::super::Win32::Security:: TOKEN_GROUPS, privilegestodelete : *const super::super::super::Win32::Security:: TOKEN_PRIVILEGES, restrictedsids : *const super::super::super::Win32::Security:: TOKEN_GROUPS, newtokenhandle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1076:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn ZwFlushBuffersFile(filehandle : super::super::super::Win32::Foundation:: HANDLE, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1078:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn ZwFlushBuffersFileEx(filehandle : super::super::super::Win32::Foundation:: HANDLE, flags : u32, parameters : *const core::ffi::c_void, parameterssize : u32, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1080:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn ZwFlushVirtualMemory(processhandle : super::super::super::Win32::Foundation:: HANDLE, baseaddress : *mut *mut core::ffi::c_void, regionsize : *mut usize, iostatus : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1082:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwFreeVirtualMemory(processhandle : super::super::super::Win32::Foundation:: HANDLE, baseaddress : *mut *mut core::ffi::c_void, regionsize : *mut usize, freetype : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1083:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn ZwFsControlFile(filehandle : super::super::super::Win32::Foundation:: HANDLE, event : super::super::super::Win32::Foundation:: HANDLE, apcroutine : super::super::super::Win32::System::IO:: PIO_APC_ROUTINE, apccontext : *const core::ffi::c_void, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, fscontrolcode : u32, inputbuffer : *const core::ffi::c_void, inputbufferlength : u32, outputbuffer : *mut core::ffi::c_void, outputbufferlength : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1085:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwImpersonateAnonymousToken(threadhandle : super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1086:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn ZwLockFile(filehandle : super::super::super::Win32::Foundation:: HANDLE, event : super::super::super::Win32::Foundation:: HANDLE, apcroutine : super::super::super::Win32::System::IO:: PIO_APC_ROUTINE, apccontext : *const core::ffi::c_void, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, byteoffset : *const i64, length : *const i64, key : u32, failimmediately : bool, exclusivelock : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1088:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn ZwNotifyChangeKey(keyhandle : super::super::super::Win32::Foundation:: HANDLE, event : super::super::super::Win32::Foundation:: HANDLE, apcroutine : super::super::super::Win32::System::IO:: PIO_APC_ROUTINE, apccontext : *const core::ffi::c_void, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, completionfilter : u32, watchtree : bool, buffer : *mut core::ffi::c_void, buffersize : u32, asynchronous : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1090:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntdll.dll" "system" fn ZwOpenDirectoryObject(directoryhandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1092:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn ZwOpenObjectAuditAlarm(subsystemname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, handleid : *const core::ffi::c_void, objecttypename : *const super::super::super::Win32::Foundation:: UNICODE_STRING, objectname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, clienttoken : super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, grantedaccess : u32, privileges : *const super::super::super::Win32::Security:: PRIVILEGE_SET, objectcreation : bool, accessgranted : bool, generateonclose : *mut bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1094:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwOpenProcessToken(processhandle : super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, tokenhandle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1095:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwOpenProcessTokenEx(processhandle : super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, handleattributes : u32, tokenhandle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1096:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwOpenThreadToken(threadhandle : super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, openasself : bool, tokenhandle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1097:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwOpenThreadTokenEx(threadhandle : super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, openasself : bool, handleattributes : u32, tokenhandle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1098:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn ZwPrivilegeCheck(clienttoken : super::super::super::Win32::Foundation:: HANDLE, requiredprivileges : *mut super::super::super::Win32::Security:: PRIVILEGE_SET, result : *mut bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1100:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn ZwPrivilegeObjectAuditAlarm(subsystemname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, handleid : *const core::ffi::c_void, clienttoken : super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, privileges : *const super::super::super::Win32::Security:: PRIVILEGE_SET, accessgranted : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1102:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn ZwPrivilegedServiceAuditAlarm(subsystemname : *const super::super::super::Win32::Foundation:: UNICODE_STRING, servicename : *const super::super::super::Win32::Foundation:: UNICODE_STRING, clienttoken : super::super::super::Win32::Foundation:: HANDLE, privileges : *const super::super::super::Win32::Security:: PRIVILEGE_SET, accessgranted : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1104:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn ZwQueryDirectoryFile(filehandle : super::super::super::Win32::Foundation:: HANDLE, event : super::super::super::Win32::Foundation:: HANDLE, apcroutine : super::super::super::Win32::System::IO:: PIO_APC_ROUTINE, apccontext : *const core::ffi::c_void, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, fileinformation : *mut core::ffi::c_void, length : u32, fileinformationclass : FILE_INFORMATION_CLASS, returnsingleentry : bool, filename : *const super::super::super::Win32::Foundation:: UNICODE_STRING, restartscan : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1106:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn ZwQueryDirectoryFileEx(filehandle : super::super::super::Win32::Foundation:: HANDLE, event : super::super::super::Win32::Foundation:: HANDLE, apcroutine : super::super::super::Win32::System::IO:: PIO_APC_ROUTINE, apccontext : *const core::ffi::c_void, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, fileinformation : *mut core::ffi::c_void, length : u32, fileinformationclass : FILE_INFORMATION_CLASS, queryflags : u32, filename : *const super::super::super::Win32::Foundation:: UNICODE_STRING) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1108:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwQueryDirectoryObject(directoryhandle : super::super::super::Win32::Foundation:: HANDLE, buffer : *mut core::ffi::c_void, length : u32, returnsingleentry : bool, restartscan : bool, context : *mut u32, returnlength : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1109:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn ZwQueryEaFile(filehandle : super::super::super::Win32::Foundation:: HANDLE, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, buffer : *mut core::ffi::c_void, length : u32, returnsingleentry : bool, ealist : *const core::ffi::c_void, ealistlength : u32, eaindex : *const u32, restartscan : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1111:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntdll.dll" "system" fn ZwQueryFullAttributesFile(objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES, fileinformation : *mut FILE_NETWORK_OPEN_INFORMATION) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1113:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn ZwQueryInformationToken(tokenhandle : super::super::super::Win32::Foundation:: HANDLE, tokeninformationclass : super::super::super::Win32::Security:: TOKEN_INFORMATION_CLASS, tokeninformation : *mut core::ffi::c_void, tokeninformationlength : u32, returnlength : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1115:1: declaration Macro has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// windows_link::link!("ntdll.dll" "system" fn ZwQueryObject(handle : super::super::super::Win32::Foundation:: HANDLE, objectinformationclass : super::super::Foundation:: OBJECT_INFORMATION_CLASS, objectinformation : *mut core::ffi::c_void, objectinformationlength : u32, returnlength : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1117:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Security", feature = "Win32_System_IO"))]
// windows_link::link!("ntdll.dll" "system" fn ZwQueryQuotaInformationFile(filehandle : super::super::super::Win32::Foundation:: HANDLE, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, buffer : *mut core::ffi::c_void, length : u32, returnsingleentry : bool, sidlist : *const core::ffi::c_void, sidlistlength : u32, startsid : super::super::super::Win32::Security:: PSID, restartscan : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1119:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn ZwQuerySecurityObject(handle : super::super::super::Win32::Foundation:: HANDLE, securityinformation : u32, securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, length : u32, lengthneeded : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1121:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwQueryVirtualMemory(processhandle : super::super::super::Win32::Foundation:: HANDLE, baseaddress : *const core::ffi::c_void, memoryinformationclass : MEMORY_INFORMATION_CLASS, memoryinformation : *mut core::ffi::c_void, memoryinformationlength : usize, returnlength : *mut usize) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1122:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn ZwQueryVolumeInformationFile(filehandle : super::super::super::Win32::Foundation:: HANDLE, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, fsinformation : *mut core::ffi::c_void, length : u32, fsinformationclass : FS_INFORMATION_CLASS) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1124:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn ZwSetEaFile(filehandle : super::super::super::Win32::Foundation:: HANDLE, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, buffer : *const core::ffi::c_void, length : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1126:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwSetEvent(eventhandle : super::super::super::Win32::Foundation:: HANDLE, previousstate : *mut i32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1127:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn ZwSetInformationToken(tokenhandle : super::super::super::Win32::Foundation:: HANDLE, tokeninformationclass : super::super::super::Win32::Security:: TOKEN_INFORMATION_CLASS, tokeninformation : *const core::ffi::c_void, tokeninformationlength : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1129:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwSetInformationVirtualMemory(processhandle : super::super::super::Win32::Foundation:: HANDLE, vminformationclass : VIRTUAL_MEMORY_INFORMATION_CLASS, numberofentries : usize, virtualaddresses : *const MEMORY_RANGE_ENTRY, vminformation : *const core::ffi::c_void, vminformationlength : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1130:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn ZwSetQuotaInformationFile(filehandle : super::super::super::Win32::Foundation:: HANDLE, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, buffer : *const core::ffi::c_void, length : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1132:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ntdll.dll" "system" fn ZwSetSecurityObject(handle : super::super::super::Win32::Foundation:: HANDLE, securityinformation : u32, securitydescriptor : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1134:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn ZwSetVolumeInformationFile(filehandle : super::super::super::Win32::Foundation:: HANDLE, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, fsinformation : *const core::ffi::c_void, length : u32, fsinformationclass : FS_INFORMATION_CLASS) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1136:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ntdll.dll" "system" fn ZwUnlockFile(filehandle : super::super::super::Win32::Foundation:: HANDLE, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, byteoffset : *const i64, length : *const i64, key : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 1138:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ACE_HEADER {
//     pub AceType: u8,
//     pub AceFlags: u8,
//     pub AceSize: u16,
// }

// UNSUPPORTED Rust 1145:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Memory")]
// pub type ALLOCATE_VIRTUAL_MEMORY_EX_CALLBACK = Option<unsafe extern "system" fn(callbackcontext: super::super::super::Win32::Foundation::HANDLE, processhandle: super::super::super::Win32::Foundation::HANDLE, baseaddress: *mut *mut core::ffi::c_void, regionsize: *mut usize, allocationtype: u32, pageprotection: u32, extendedparameters: *mut super::super::super::Win32::System::Memory::MEM_EXTENDED_PARAMETER, extendedparametercount: u32) -> super::super::super::Win32::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1147:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ATOMIC_CREATE_ECP_CONTEXT {
//     pub Size: u16,
//     pub InFlags: u16,
//     pub OutFlags: u16,
//     pub ReparseBufferLength: u16,
//     pub ReparseBuffer: *mut REPARSE_DATA_BUFFER,
//     pub FileSize: i64,
//     pub ValidDataLength: i64,
//     pub FileTimestamps: *mut FILE_TIMESTAMPS,
//     pub FileAttributes: u32,
//     pub UsnSourceInfo: u32,
//     pub Usn: i64,
//     pub SuppressFileAttributeInheritanceMask: u32,
//     pub InOpFlags: u32,
//     pub OutOpFlags: u32,
//     pub InGenFlags: u32,
//     pub OutGenFlags: u32,
//     pub CaseSensitiveFlagsMask: u32,
//     pub InCaseSensitiveFlags: u32,
//     pub OutCaseSensitiveFlags: u32,
// }

// UNSUPPORTED Rust 1170:1: declaration Impl has no candidate rule
// impl Default for ATOMIC_CREATE_ECP_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ATOMIC_CREATE_ECP_IN_FLAG_BEST_EFFORT`: UInt = 256u;
public const val `ATOMIC_CREATE_ECP_IN_FLAG_EOF_SPECIFIED`: UInt = 4u;
public const val `ATOMIC_CREATE_ECP_IN_FLAG_FILE_ATTRIBUTES_SPECIFIED`: UInt = 32u;
public const val `ATOMIC_CREATE_ECP_IN_FLAG_GEN_FLAGS_SPECIFIED`: UInt = 32768u;
public const val `ATOMIC_CREATE_ECP_IN_FLAG_MARK_USN_SOURCE_INFO`: UInt = 2048u;
public const val `ATOMIC_CREATE_ECP_IN_FLAG_OPERATION_MASK`: UInt = 255u;
public const val `ATOMIC_CREATE_ECP_IN_FLAG_OP_FLAGS_SPECIFIED`: UInt = 128u;
public const val `ATOMIC_CREATE_ECP_IN_FLAG_REPARSE_POINT_SPECIFIED`: UInt = 2u;
public const val `ATOMIC_CREATE_ECP_IN_FLAG_SPARSE_SPECIFIED`: UInt = 1u;
public const val `ATOMIC_CREATE_ECP_IN_FLAG_SUPPRESS_DIR_CHANGE_NOTIFY`: UInt = 1024u;
public const val `ATOMIC_CREATE_ECP_IN_FLAG_SUPPRESS_FILE_ATTRIBUTE_INHERITANCE`: UInt = 64u;
public const val `ATOMIC_CREATE_ECP_IN_FLAG_SUPPRESS_PARENT_TIMESTAMPS_UPDATE`: UInt = 512u;
public const val `ATOMIC_CREATE_ECP_IN_FLAG_TIMESTAMPS_SPECIFIED`: UInt = 16u;
public const val `ATOMIC_CREATE_ECP_IN_FLAG_VDL_SPECIFIED`: UInt = 8u;
public const val `ATOMIC_CREATE_ECP_IN_FLAG_WRITE_USN_CLOSE_RECORD`: UInt = 4096u;
public const val `ATOMIC_CREATE_ECP_IN_OP_FLAG_CASE_SENSITIVE_FLAGS_SPECIFIED`: UInt = 1u;
public const val `ATOMIC_CREATE_ECP_OUT_FLAG_EOF_SET`: UInt = 4u;
public const val `ATOMIC_CREATE_ECP_OUT_FLAG_FILE_ATTRIBUTES_RETURNED`: UInt = 512u;
public const val `ATOMIC_CREATE_ECP_OUT_FLAG_FILE_ATTRIBUTES_SET`: UInt = 32u;
public const val `ATOMIC_CREATE_ECP_OUT_FLAG_FILE_ATTRIBUTE_INHERITANCE_SUPPRESSED`: UInt = 64u;
public const val `ATOMIC_CREATE_ECP_OUT_FLAG_OPERATION_MASK`: UInt = 255u;
public const val `ATOMIC_CREATE_ECP_OUT_FLAG_OP_FLAGS_HONORED`: UInt = 128u;
public const val `ATOMIC_CREATE_ECP_OUT_FLAG_REPARSE_POINT_SET`: UInt = 2u;
public const val `ATOMIC_CREATE_ECP_OUT_FLAG_SPARSE_SET`: UInt = 1u;
public const val `ATOMIC_CREATE_ECP_OUT_FLAG_TIMESTAMPS_RETURNED`: UInt = 256u;
public const val `ATOMIC_CREATE_ECP_OUT_FLAG_TIMESTAMPS_SET`: UInt = 16u;
public const val `ATOMIC_CREATE_ECP_OUT_FLAG_USN_CLOSE_RECORD_WRITTEN`: UInt = 2048u;
public const val `ATOMIC_CREATE_ECP_OUT_FLAG_USN_RETURNED`: UInt = 4096u;
public const val `ATOMIC_CREATE_ECP_OUT_FLAG_USN_SOURCE_INFO_MARKED`: UInt = 1024u;
public const val `ATOMIC_CREATE_ECP_OUT_FLAG_VDL_SET`: UInt = 8u;
public const val `ATOMIC_CREATE_ECP_OUT_OP_FLAG_CASE_SENSITIVE_FLAGS_SET`: UInt = 1u;
public const val `AuditAccessCheck`: `SE_AUDIT_OPERATION` = 2;
public const val `AuditCloseNonObject`: `SE_AUDIT_OPERATION` = 9;
public const val `AuditCloseObject`: `SE_AUDIT_OPERATION` = 5;
public const val `AuditDeleteObject`: `SE_AUDIT_OPERATION` = 6;
public const val `AuditHandleCreation`: `SE_AUDIT_OPERATION` = 12;
public const val `AuditObjectReference`: `SE_AUDIT_OPERATION` = 11;
public const val `AuditOpenNonObject`: `SE_AUDIT_OPERATION` = 10;
public const val `AuditOpenObject`: `SE_AUDIT_OPERATION` = 3;
public const val `AuditOpenObjectForDelete`: `SE_AUDIT_OPERATION` = 7;
public const val `AuditOpenObjectForDeleteWithTransaction`: `SE_AUDIT_OPERATION` = 8;
public const val `AuditOpenObjectWithTransaction`: `SE_AUDIT_OPERATION` = 4;
public const val `AuditPrivilegeObject`: `SE_AUDIT_OPERATION` = 0;
public const val `AuditPrivilegeService`: `SE_AUDIT_OPERATION` = 1;
// UNSUPPORTED Rust 1219:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BASE_MCB {
//     pub MaximumPairCount: u32,
//     pub PairCount: u32,
//     pub PoolType: u16,
//     pub Flags: u16,
//     pub Mapping: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1228:1: declaration Impl has no candidate rule
// impl Default for BASE_MCB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1233:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BOOT_AREA_INFO {
//     pub BootSectorCount: u32,
//     pub BootSectors: [BOOT_AREA_INFO_0; 2],
// }

// UNSUPPORTED Rust 1239:1: declaration Impl has no candidate rule
// impl Default for BOOT_AREA_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1244:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BOOT_AREA_INFO_0 {
//     pub Offset: i64,
// }

// UNSUPPORTED Rust 1249:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CACHE_MANAGER_CALLBACKS {
//     pub AcquireForLazyWrite: PACQUIRE_FOR_LAZY_WRITE,
//     pub ReleaseFromLazyWrite: PRELEASE_FROM_LAZY_WRITE,
//     pub AcquireForReadAhead: PACQUIRE_FOR_READ_AHEAD,
//     pub ReleaseFromReadAhead: PRELEASE_FROM_READ_AHEAD,
// }

// UNSUPPORTED Rust 1257:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CACHE_MANAGER_CALLBACKS_EX {
//     pub Version: u16,
//     pub Size: u16,
//     pub Functions: CACHE_MANAGER_CALLBACK_FUNCTIONS,
// }

public const val `CACHE_MANAGER_CALLBACKS_EX_V1`: UInt = 1u;
// UNSUPPORTED Rust 1265:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CACHE_MANAGER_CALLBACK_FUNCTIONS {
//     pub AcquireForLazyWriteEx: PACQUIRE_FOR_LAZY_WRITE_EX,
//     pub ReleaseFromLazyWrite: PRELEASE_FROM_LAZY_WRITE,
//     pub AcquireForReadAhead: PACQUIRE_FOR_READ_AHEAD,
//     pub ReleaseFromReadAhead: PRELEASE_FROM_READ_AHEAD,
// }

// UNSUPPORTED Rust 1273:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// #[derive(Clone, Copy)]
// pub struct CACHE_UNINITIALIZE_EVENT {
//     pub Next: *mut CACHE_UNINITIALIZE_EVENT,
//     pub Event: super::super::Foundation::KEVENT,
// }

// UNSUPPORTED Rust 1280:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// impl Default for CACHE_UNINITIALIZE_EVENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CACHE_USE_DIRECT_ACCESS_MAPPING`: UInt = 1u;
public const val `CACHE_VALID_FLAGS`: UInt = 1u;
public const val `CC_ACQUIRE_DONT_WAIT`: UInt = 1u;
public const val `CC_ACQUIRE_SUPPORTS_ASYNC_LAZYWRITE`: UInt = 1u;
public const val `CC_AGGRESSIVE_UNMAP_BEHIND`: UInt = 1u;
// UNSUPPORTED Rust 1291:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Wdk_Foundation")]
// #[derive(Clone, Copy)]
// pub struct CC_ASYNC_READ_CONTEXT {
//     pub CompletionRoutine: PASYNC_READ_COMPLETION_CALLBACK,
//     pub Context: *mut core::ffi::c_void,
//     pub Mdl: *mut super::super::Foundation::MDL,
//     pub RequestorMode: i8,
//     pub NestingLevel: u32,
// }

// UNSUPPORTED Rust 1301:1: declaration Impl has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// impl Default for CC_ASYNC_READ_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CC_DISABLE_DIRTY_PAGE_TRACKING`: UInt = 8u;
public const val `CC_DISABLE_READ_AHEAD`: UInt = 2u;
public const val `CC_DISABLE_UNMAP_BEHIND`: UInt = 32u;
public const val `CC_DISABLE_WRITE_BEHIND`: UInt = 4u;
public const val `CC_ENABLE_CPU_CACHE`: UInt = 268435456u;
public const val `CC_ENABLE_DISK_IO_ACCOUNTING`: UInt = 16u;
// UNSUPPORTED Rust 1313:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CC_ERROR_CALLBACK_CONTEXT {
//     pub NodeByteSize: i16,
//     pub ErrorCode: super::super::super::Win32::Foundation::NTSTATUS,
// }

// UNSUPPORTED Rust 1319:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CC_FILE_SIZES {
//     pub AllocationSize: i64,
//     pub FileSize: i64,
//     pub ValidDataLength: i64,
// }

public const val `CC_FLUSH_AND_PURGE_GATHER_DIRTY_BITS`: UInt = 2u;
public const val `CC_FLUSH_AND_PURGE_NO_PURGE`: UInt = 1u;
public const val `CC_FLUSH_AND_PURGE_WRITEABLE_VIEWS_NOTSEEN`: UInt = 4u;
// UNSUPPORTED Rust 1329:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct COMPRESSED_DATA_INFO {
//     pub CompressionFormatAndEngine: u16,
//     pub CompressionUnitShift: u8,
//     pub ChunkShift: u8,
//     pub ClusterShift: u8,
//     pub Reserved: u8,
//     pub NumberOfChunks: u16,
//     pub CompressedChunkSizes: [u32; 1],
// }

// UNSUPPORTED Rust 1340:1: declaration Impl has no candidate rule
// impl Default for COMPRESSED_DATA_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `COMPRESSION_ENGINE_MASK`: UInt = 65280u;
public const val `COMPRESSION_ENGINE_MAX`: UInt = 512u;
public const val `COMPRESSION_FORMAT_MASK`: UInt = 255u;
public const val `COMPRESSION_FORMAT_MAX`: UInt = 5u;
// UNSUPPORTED Rust 1349:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CONTAINER_ROOT_INFO_INPUT {
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 1354:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CONTAINER_ROOT_INFO_OUTPUT {
//     pub ContainerRootIdLength: u16,
//     pub ContainerRootId: [u8; 1],
// }

// UNSUPPORTED Rust 1360:1: declaration Impl has no candidate rule
// impl Default for CONTAINER_ROOT_INFO_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1365:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CONTAINER_VOLUME_STATE {
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 1370:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct COPY_INFORMATION {
//     pub SourceFileObject: *mut super::super::Foundation::FILE_OBJECT,
//     pub SourceFileOffset: i64,
// }

// UNSUPPORTED Rust 1377:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for COPY_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1383:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CPTABLEINFO {
//     pub CodePage: u16,
//     pub MaximumCharacterSize: u16,
//     pub DefaultChar: u16,
//     pub UniDefaultChar: u16,
//     pub TransDefaultChar: u16,
//     pub TransUniDefaultChar: u16,
//     pub DBCSCodePage: u16,
//     pub LeadByte: [u8; 12],
//     pub MultiByteTable: *mut u16,
//     pub WideCharTable: *mut core::ffi::c_void,
//     pub DBCSRanges: *mut u16,
//     pub DBCSOffsets: *mut u16,
// }

// UNSUPPORTED Rust 1399:1: declaration Impl has no candidate rule
// impl Default for CPTABLEINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1404:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Storage_FileSystem")]
// #[derive(Clone, Copy, Default)]
// pub struct CREATE_REDIRECTION_ECP_CONTEXT {
//     pub Size: u16,
//     pub Flags: u16,
//     pub FileId: super::super::super::Win32::Storage::FileSystem::FILE_ID_128,
//     pub VolumeGuid: windows_sys::core::GUID,
// }

public const val `CREATE_REDIRECTION_FLAGS_SERVICED_FROM_LAYER`: UInt = 1u;
public const val `CREATE_REDIRECTION_FLAGS_SERVICED_FROM_REGISTERED_LAYER`: UInt = 4u;
public const val `CREATE_REDIRECTION_FLAGS_SERVICED_FROM_REMOTE_LAYER`: UInt = 8u;
public const val `CREATE_REDIRECTION_FLAGS_SERVICED_FROM_SCRATCH`: UInt = 2u;
public const val `CREATE_REDIRECTION_FLAGS_SERVICED_FROM_USER_MODE`: UInt = 16u;
// UNSUPPORTED Rust 1418:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CREATE_USN_JOURNAL_DATA {
//     pub MaximumSize: u64,
//     pub AllocationDelta: u64,
// }

public typealias `CSV_DOWN_LEVEL_FILE_TYPE` = Int;
// UNSUPPORTED Rust 1425:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CSV_DOWN_LEVEL_OPEN_ECP_CONTEXT {
//     pub Version: u32,
//     pub IsResume: bool,
//     pub FileType: CSV_DOWN_LEVEL_FILE_TYPE,
//     pub SourceNodeId: u32,
//     pub DestinationNodeId: u32,
// }

// UNSUPPORTED Rust 1434:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CSV_QUERY_FILE_REVISION_ECP_CONTEXT {
//     pub FileId: i64,
//     pub FileRevision: [i64; 3],
// }

// UNSUPPORTED Rust 1440:1: declaration Impl has no candidate rule
// impl Default for CSV_QUERY_FILE_REVISION_ECP_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1445:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Storage_FileSystem")]
// #[derive(Clone, Copy)]
// pub struct CSV_QUERY_FILE_REVISION_ECP_CONTEXT_FILE_ID_128 {
//     pub FileId: super::super::super::Win32::Storage::FileSystem::FILE_ID_128,
//     pub FileRevision: [i64; 3],
// }

// UNSUPPORTED Rust 1452:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for CSV_QUERY_FILE_REVISION_ECP_CONTEXT_FILE_ID_128 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1458:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CSV_SET_HANDLE_PROPERTIES_ECP_CONTEXT {
//     pub Size: usize,
//     pub PauseTimeoutInSeconds: u32,
//     pub Flags: u32,
// }

public const val `CSV_SET_HANDLE_PROPERTIES_ECP_CONTEXT_FLAGS_VALID_ONLY_IF_CSV_COORDINATOR`: UInt = 1u;
public const val `ChangeDataControlArea`: `FSRTL_CHANGE_BACKING_TYPE` = 0;
public const val `ChangeImageControlArea`: `FSRTL_CHANGE_BACKING_TYPE` = 1;
public const val `ChangeSharedCacheMap`: `FSRTL_CHANGE_BACKING_TYPE` = 2;
public const val `CsvCsvFsInternalFileObject`: `CSV_DOWN_LEVEL_FILE_TYPE` = 1;
public const val `CsvDownLevelFileObject`: `CSV_DOWN_LEVEL_FILE_TYPE` = 0;
// UNSUPPORTED Rust 1471:1: non-scalar type Ptr unsupported
// pub const DD_MUP_DEVICE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("\\Device\\Mup");

public const val `DEVICE_RESET_KEEP_STACK`: UInt = 4u;
public const val `DEVICE_RESET_RESERVED_0`: UInt = 1u;
public const val `DEVICE_RESET_RESERVED_1`: UInt = 2u;
public const val `DO_BOOT_CRITICAL`: UInt = 536870912u;
public const val `DO_BUFFERED_IO`: UInt = 4u;
public const val `DO_BUS_ENUMERATED_DEVICE`: UInt = 4096u;
public const val `DO_DAX_VOLUME`: UInt = 268435456u;
public const val `DO_DEVICE_HAS_NAME`: UInt = 64u;
public const val `DO_DEVICE_INITIALIZING`: UInt = 128u;
public const val `DO_DEVICE_IRP_REQUIRES_EXTENSION`: UInt = 134217728u;
public const val `DO_DEVICE_TO_BE_RESET`: UInt = 67108864u;
public const val `DO_DIRECT_IO`: UInt = 16u;
public const val `DO_DISALLOW_EXECUTE`: UInt = 8388608u;
public const val `DO_EXCLUSIVE`: UInt = 8u;
public const val `DO_FORCE_NEITHER_IO`: UInt = 524288u;
public const val `DO_LONG_TERM_REQUESTS`: UInt = 512u;
public const val `DO_LOW_PRIORITY_FILESYSTEM`: UInt = 65536u;
public const val `DO_MAP_IO_BUFFER`: UInt = 32u;
public const val `DO_NEVER_LAST_DEVICE`: UInt = 1024u;
public const val `DO_NOT_PURGE_DIRTY_PAGES`: UInt = 4u;
public const val `DO_NOT_RETRY_PURGE`: UInt = 2u;
public const val `DO_POWER_INRUSH`: UInt = 16384u;
public const val `DO_POWER_PAGABLE`: UInt = 8192u;
public const val `DO_SHUTDOWN_REGISTERED`: UInt = 2048u;
public const val `DO_SUPPORTS_PERSISTENT_ACLS`: UInt = 131072u;
public const val `DO_SUPPORTS_TRANSACTIONS`: UInt = 262144u;
public const val `DO_SYSTEM_BOOT_PARTITION`: UInt = 256u;
public const val `DO_SYSTEM_CRITICAL_PARTITION`: UInt = 4194304u;
public const val `DO_SYSTEM_SYSTEM_PARTITION`: UInt = 2097152u;
public const val `DO_VERIFY_VOLUME`: UInt = 2u;
public const val `DO_VOLUME_DEVICE_OBJECT`: UInt = 1048576u;
// UNSUPPORTED Rust 1503:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DUAL_OPLOCK_KEY_ECP_CONTEXT {
//     pub ParentOplockKey: windows_sys::core::GUID,
//     pub TargetOplockKey: windows_sys::core::GUID,
//     pub ParentOplockKeySet: bool,
//     pub TargetOplockKeySet: bool,
// }

// UNSUPPORTED Rust 1511:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DUPLICATE_CLUSTER_DATA {
//     pub SourceLcn: i64,
//     pub TargetFileOffset: i64,
//     pub DuplicationLimit: u32,
//     pub Reserved: u32,
// }

public const val `DfsLinkTrackingInformation`: `LINK_TRACKING_INFORMATION_TYPE` = 1;
// UNSUPPORTED Rust 1520:1: non-scalar type Ptr unsupported
// pub const EA_NAME_NETWORK_OPEN_ECP_INTEGRITY: windows_sys::core::PCSTR = windows_sys::core::s!("ECP{c584edbf-00df-4d28-00b8-8435baca8911e8}-INTEGRITY");

// UNSUPPORTED Rust 1521:1: non-scalar type Ptr unsupported
// pub const EA_NAME_NETWORK_OPEN_ECP_INTEGRITY_U: windows_sys::core::PCWSTR = windows_sys::core::w!("ECP{c584edbf-00df-4d28-00b8-8435baca8911e8}-INTEGRITY");

// UNSUPPORTED Rust 1522:1: non-scalar type Ptr unsupported
// pub const EA_NAME_NETWORK_OPEN_ECP_PRIVACY: windows_sys::core::PCSTR = windows_sys::core::s!("ECP{c584edbf-00df-4d28-00b8-8435baca8911e8}-PRIVACY");

// UNSUPPORTED Rust 1523:1: non-scalar type Ptr unsupported
// pub const EA_NAME_NETWORK_OPEN_ECP_PRIVACY_U: windows_sys::core::PCWSTR = windows_sys::core::w!("ECP{c584edbf-00df-4d28-00b8-8435baca8911e8}-PRIVACY");

// UNSUPPORTED Rust 1524:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ECP_OPEN_PARAMETERS {
//     pub Size: u16,
//     pub Reserved: u16,
//     pub Flags: u32,
// }

public const val `ECP_OPEN_PARAMETERS_FLAG_FAIL_ON_CASE_SENSITIVE_DIR`: UInt = 16u;
public const val `ECP_OPEN_PARAMETERS_FLAG_IGNORE_DIR_CASE_SENSITIVITY`: UInt = 8u;
public const val `ECP_OPEN_PARAMETERS_FLAG_OPEN_FOR_DELETE`: UInt = 4u;
public const val `ECP_OPEN_PARAMETERS_FLAG_OPEN_FOR_READ`: UInt = 1u;
public const val `ECP_OPEN_PARAMETERS_FLAG_OPEN_FOR_WRITE`: UInt = 2u;
// UNSUPPORTED Rust 1536:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ECP_TYPE_CLFS_CREATE_CONTAINER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8650c9fe_0cec_8bf6_bd1e_835956541090);

// UNSUPPORTED Rust 1537:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ECP_TYPE_IO_STOP_ON_SYMLINK_FILTER_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x940e5d56_1646_4d3c_87b6_577ec36a1466);

// UNSUPPORTED Rust 1538:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ECP_TYPE_OPEN_REPARSE_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x323eb6a8_affd_4d95_8230_863bce09d37a);

// UNSUPPORTED Rust 1539:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// #[derive(Clone, Copy)]
// pub struct EOF_WAIT_BLOCK {
//     pub EofWaitLinks: super::super::super::Win32::System::Kernel::LIST_ENTRY,
//     pub Event: super::super::Foundation::KEVENT,
// }

// UNSUPPORTED Rust 1546:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// impl Default for EOF_WAIT_BLOCK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `EVENT_INCREMENT`: UInt = 1u;
// UNSUPPORTED Rust 1553:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EXTENT_READ_CACHE_INFO_BUFFER {
//     pub AllocatedCache: i64,
//     pub PopulatedCache: i64,
//     pub InErrorCache: i64,
// }

public const val `EqualTo`: `FSRTL_COMPARISON_RESULT` = 0;
public typealias `FAST_IO_POSSIBLE` = Int;
// UNSUPPORTED Rust 1562:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_ACCESS_INFORMATION {
//     pub AccessFlags: u32,
// }

public const val `FILE_ACTION_ADDED_STREAM`: UInt = 6u;
public const val `FILE_ACTION_ID_NOT_TUNNELLED`: UInt = 10u;
public const val `FILE_ACTION_MODIFIED_STREAM`: UInt = 8u;
public const val `FILE_ACTION_REMOVED_BY_DELETE`: UInt = 9u;
public const val `FILE_ACTION_REMOVED_STREAM`: UInt = 7u;
public const val `FILE_ACTION_TUNNELLED_ID_COLLISION`: UInt = 11u;
// UNSUPPORTED Rust 1573:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_ALIGNMENT_INFORMATION {
//     pub AlignmentRequirement: u32,
// }

// UNSUPPORTED Rust 1578:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_ALLOCATION_INFORMATION {
//     pub AllocationSize: i64,
// }

// UNSUPPORTED Rust 1583:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_ALL_INFORMATION {
//     pub BasicInformation: FILE_BASIC_INFORMATION,
//     pub StandardInformation: FILE_STANDARD_INFORMATION,
//     pub InternalInformation: FILE_INTERNAL_INFORMATION,
//     pub EaInformation: FILE_EA_INFORMATION,
//     pub AccessInformation: FILE_ACCESS_INFORMATION,
//     pub PositionInformation: FILE_POSITION_INFORMATION,
//     pub ModeInformation: FILE_MODE_INFORMATION,
//     pub AlignmentInformation: FILE_ALIGNMENT_INFORMATION,
//     pub NameInformation: FILE_NAME_INFORMATION,
// }

// UNSUPPORTED Rust 1596:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_BASIC_INFORMATION {
//     pub CreationTime: i64,
//     pub LastAccessTime: i64,
//     pub LastWriteTime: i64,
//     pub ChangeTime: i64,
//     pub FileAttributes: u32,
// }

// UNSUPPORTED Rust 1605:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_BOTH_DIR_INFORMATION {
//     pub NextEntryOffset: u32,
//     pub FileIndex: u32,
//     pub CreationTime: i64,
//     pub LastAccessTime: i64,
//     pub LastWriteTime: i64,
//     pub ChangeTime: i64,
//     pub EndOfFile: i64,
//     pub AllocationSize: i64,
//     pub FileAttributes: u32,
//     pub FileNameLength: u32,
//     pub EaSize: u32,
//     pub ShortNameLength: i8,
//     pub ShortName: [u16; 12],
//     pub FileName: [u16; 1],
// }

// UNSUPPORTED Rust 1623:1: declaration Impl has no candidate rule
// impl Default for FILE_BOTH_DIR_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1628:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_CASE_SENSITIVE_INFORMATION {
//     pub Flags: u32,
// }

public const val `FILE_CLEANUP_FILE_DELETED`: UInt = 4u;
public const val `FILE_CLEANUP_FILE_REMAINS`: UInt = 2u;
public const val `FILE_CLEANUP_LINK_DELETED`: UInt = 8u;
public const val `FILE_CLEANUP_POSIX_STYLE_DELETE`: UInt = 32u;
public const val `FILE_CLEANUP_STREAM_DELETED`: UInt = 16u;
public const val `FILE_CLEANUP_UNKNOWN`: UInt = 0u;
public const val `FILE_CLEANUP_WRONG_DEVICE`: UInt = 1u;
public const val `FILE_COMPLETE_IF_OPLOCKED`: `NTCREATEFILE_CREATE_OPTIONS` = 256u;
// UNSUPPORTED Rust 1641:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_COMPLETION_INFORMATION {
//     pub Port: super::super::super::Win32::Foundation::HANDLE,
//     pub Key: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1647:1: declaration Impl has no candidate rule
// impl Default for FILE_COMPLETION_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1652:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_COMPRESSION_INFORMATION {
//     pub CompressedFileSize: i64,
//     pub CompressionFormat: u16,
//     pub CompressionUnitShift: u8,
//     pub ChunkShift: u8,
//     pub ClusterShift: u8,
//     pub Reserved: [u8; 3],
// }

// UNSUPPORTED Rust 1662:1: declaration Impl has no candidate rule
// impl Default for FILE_COMPRESSION_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILE_CONTAINS_EXTENDED_CREATE_INFORMATION`: `NTCREATEFILE_CREATE_OPTIONS` = 268435456u;
public const val `FILE_CREATE`: `NTCREATEFILE_CREATE_DISPOSITION` = 2u;
public const val `FILE_CREATE_TREE_CONNECTION`: `NTCREATEFILE_CREATE_OPTIONS` = 128u;
public const val `FILE_DELETE_ON_CLOSE`: `NTCREATEFILE_CREATE_OPTIONS` = 4096u;
public const val `FILE_DIRECTORY_FILE`: `NTCREATEFILE_CREATE_OPTIONS` = 1u;
// UNSUPPORTED Rust 1672:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_DIRECTORY_INFORMATION {
//     pub NextEntryOffset: u32,
//     pub FileIndex: u32,
//     pub CreationTime: i64,
//     pub LastAccessTime: i64,
//     pub LastWriteTime: i64,
//     pub ChangeTime: i64,
//     pub EndOfFile: i64,
//     pub AllocationSize: i64,
//     pub FileAttributes: u32,
//     pub FileNameLength: u32,
//     pub FileName: [u16; 1],
// }

// UNSUPPORTED Rust 1687:1: declaration Impl has no candidate rule
// impl Default for FILE_DIRECTORY_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILE_DISALLOW_EXCLUSIVE`: `NTCREATEFILE_CREATE_OPTIONS` = 131072u;
public const val `FILE_DISPOSITION_DELETE`: `FILE_DISPOSITION_INFORMATION_EX_FLAGS` = 1u;
public const val `FILE_DISPOSITION_DO_NOT_DELETE`: `FILE_DISPOSITION_INFORMATION_EX_FLAGS` = 0u;
public const val `FILE_DISPOSITION_FORCE_IMAGE_SECTION_CHECK`: `FILE_DISPOSITION_INFORMATION_EX_FLAGS` = 4u;
public const val `FILE_DISPOSITION_IGNORE_READONLY_ATTRIBUTE`: `FILE_DISPOSITION_INFORMATION_EX_FLAGS` = 16u;
// UNSUPPORTED Rust 1697:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_DISPOSITION_INFORMATION {
//     pub DeleteFile: bool,
// }

// UNSUPPORTED Rust 1702:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_DISPOSITION_INFORMATION_EX {
//     pub Flags: FILE_DISPOSITION_INFORMATION_EX_FLAGS,
// }

public typealias `FILE_DISPOSITION_INFORMATION_EX_FLAGS` = UInt;
public const val `FILE_DISPOSITION_ON_CLOSE`: `FILE_DISPOSITION_INFORMATION_EX_FLAGS` = 8u;
public const val `FILE_DISPOSITION_POSIX_SEMANTICS`: `FILE_DISPOSITION_INFORMATION_EX_FLAGS` = 2u;
// UNSUPPORTED Rust 1710:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_EA_INFORMATION {
//     pub EaSize: u32,
// }

public const val `FILE_EA_TYPE_ASCII`: UInt = 65533u;
public const val `FILE_EA_TYPE_ASN1`: UInt = 65501u;
public const val `FILE_EA_TYPE_BINARY`: UInt = 65534u;
public const val `FILE_EA_TYPE_BITMAP`: UInt = 65531u;
public const val `FILE_EA_TYPE_EA`: UInt = 65518u;
public const val `FILE_EA_TYPE_FAMILY_IDS`: UInt = 65281u;
public const val `FILE_EA_TYPE_ICON`: UInt = 65529u;
public const val `FILE_EA_TYPE_METAFILE`: UInt = 65530u;
public const val `FILE_EA_TYPE_MVMT`: UInt = 65503u;
public const val `FILE_EA_TYPE_MVST`: UInt = 65502u;
// UNSUPPORTED Rust 1725:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_END_OF_FILE_INFORMATION_EX {
//     pub EndOfFile: i64,
//     pub PagingFileSizeInMM: i64,
//     pub PagingFileMaxSize: i64,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 1733:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_FS_ATTRIBUTE_INFORMATION {
//     pub FileSystemAttributes: u32,
//     pub MaximumComponentNameLength: i32,
//     pub FileSystemNameLength: u32,
//     pub FileSystemName: [u16; 1],
// }

// UNSUPPORTED Rust 1741:1: declaration Impl has no candidate rule
// impl Default for FILE_FS_ATTRIBUTE_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1746:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_FS_CONTROL_INFORMATION {
//     pub FreeSpaceStartFiltering: i64,
//     pub FreeSpaceThreshold: i64,
//     pub FreeSpaceStopFiltering: i64,
//     pub DefaultQuotaThreshold: i64,
//     pub DefaultQuotaLimit: i64,
//     pub FileSystemControlFlags: u32,
// }

// UNSUPPORTED Rust 1756:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_FS_DATA_COPY_INFORMATION {
//     pub NumberOfCopies: u32,
// }

// UNSUPPORTED Rust 1761:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_FS_DRIVER_PATH_INFORMATION {
//     pub DriverInPath: bool,
//     pub DriverNameLength: u32,
//     pub DriverName: [u16; 1],
// }

// UNSUPPORTED Rust 1768:1: declaration Impl has no candidate rule
// impl Default for FILE_FS_DRIVER_PATH_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1773:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_FS_SECTOR_SIZE_INFORMATION {
//     pub LogicalBytesPerSector: u32,
//     pub PhysicalBytesPerSectorForAtomicity: u32,
//     pub PhysicalBytesPerSectorForPerformance: u32,
//     pub FileSystemEffectivePhysicalBytesPerSectorForAtomicity: u32,
//     pub Flags: u32,
//     pub ByteOffsetForSectorAlignment: u32,
//     pub ByteOffsetForPartitionAlignment: u32,
// }

// UNSUPPORTED Rust 1784:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_FS_VOLUME_FLAGS_INFORMATION {
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 1789:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_FULL_DIR_INFORMATION {
//     pub NextEntryOffset: u32,
//     pub FileIndex: u32,
//     pub CreationTime: i64,
//     pub LastAccessTime: i64,
//     pub LastWriteTime: i64,
//     pub ChangeTime: i64,
//     pub EndOfFile: i64,
//     pub AllocationSize: i64,
//     pub FileAttributes: u32,
//     pub FileNameLength: u32,
//     pub EaSize: u32,
//     pub FileName: [u16; 1],
// }

// UNSUPPORTED Rust 1805:1: declaration Impl has no candidate rule
// impl Default for FILE_FULL_DIR_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1810:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_FULL_EA_INFORMATION {
//     pub NextEntryOffset: u32,
//     pub Flags: u8,
//     pub EaNameLength: u8,
//     pub EaValueLength: u16,
//     pub EaName: [i8; 1],
// }

// UNSUPPORTED Rust 1819:1: declaration Impl has no candidate rule
// impl Default for FILE_FULL_EA_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1824:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_GET_EA_INFORMATION {
//     pub NextEntryOffset: u32,
//     pub EaNameLength: u8,
//     pub EaName: [i8; 1],
// }

// UNSUPPORTED Rust 1831:1: declaration Impl has no candidate rule
// impl Default for FILE_GET_EA_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1836:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_GET_QUOTA_INFORMATION {
//     pub NextEntryOffset: u32,
//     pub SidLength: u32,
//     pub Sid: super::super::super::Win32::Security::SID,
// }

// UNSUPPORTED Rust 1844:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_ID_BOTH_DIR_INFORMATION {
//     pub NextEntryOffset: u32,
//     pub FileIndex: u32,
//     pub CreationTime: i64,
//     pub LastAccessTime: i64,
//     pub LastWriteTime: i64,
//     pub ChangeTime: i64,
//     pub EndOfFile: i64,
//     pub AllocationSize: i64,
//     pub FileAttributes: u32,
//     pub FileNameLength: u32,
//     pub EaSize: u32,
//     pub ShortNameLength: i8,
//     pub ShortName: [u16; 12],
//     pub FileId: i64,
//     pub FileName: [u16; 1],
// }

// UNSUPPORTED Rust 1863:1: declaration Impl has no candidate rule
// impl Default for FILE_ID_BOTH_DIR_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1868:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Storage_FileSystem")]
// #[derive(Clone, Copy)]
// pub struct FILE_ID_EXTD_BOTH_DIR_INFORMATION {
//     pub NextEntryOffset: u32,
//     pub FileIndex: u32,
//     pub CreationTime: i64,
//     pub LastAccessTime: i64,
//     pub LastWriteTime: i64,
//     pub ChangeTime: i64,
//     pub EndOfFile: i64,
//     pub AllocationSize: i64,
//     pub FileAttributes: u32,
//     pub FileNameLength: u32,
//     pub EaSize: u32,
//     pub ReparsePointTag: u32,
//     pub FileId: super::super::super::Win32::Storage::FileSystem::FILE_ID_128,
//     pub ShortNameLength: i8,
//     pub ShortName: [u16; 12],
//     pub FileName: [u16; 1],
// }

// UNSUPPORTED Rust 1889:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for FILE_ID_EXTD_BOTH_DIR_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1895:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Storage_FileSystem")]
// #[derive(Clone, Copy)]
// pub struct FILE_ID_EXTD_DIR_INFORMATION {
//     pub NextEntryOffset: u32,
//     pub FileIndex: u32,
//     pub CreationTime: i64,
//     pub LastAccessTime: i64,
//     pub LastWriteTime: i64,
//     pub ChangeTime: i64,
//     pub EndOfFile: i64,
//     pub AllocationSize: i64,
//     pub FileAttributes: u32,
//     pub FileNameLength: u32,
//     pub EaSize: u32,
//     pub ReparsePointTag: u32,
//     pub FileId: super::super::super::Win32::Storage::FileSystem::FILE_ID_128,
//     pub FileName: [u16; 1],
// }

// UNSUPPORTED Rust 1914:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for FILE_ID_EXTD_DIR_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1920:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_ID_FULL_DIR_INFORMATION {
//     pub NextEntryOffset: u32,
//     pub FileIndex: u32,
//     pub CreationTime: i64,
//     pub LastAccessTime: i64,
//     pub LastWriteTime: i64,
//     pub ChangeTime: i64,
//     pub EndOfFile: i64,
//     pub AllocationSize: i64,
//     pub FileAttributes: u32,
//     pub FileNameLength: u32,
//     pub EaSize: u32,
//     pub FileId: i64,
//     pub FileName: [u16; 1],
// }

// UNSUPPORTED Rust 1937:1: declaration Impl has no candidate rule
// impl Default for FILE_ID_FULL_DIR_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1942:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_ID_GLOBAL_TX_DIR_INFORMATION {
//     pub NextEntryOffset: u32,
//     pub FileIndex: u32,
//     pub CreationTime: i64,
//     pub LastAccessTime: i64,
//     pub LastWriteTime: i64,
//     pub ChangeTime: i64,
//     pub EndOfFile: i64,
//     pub AllocationSize: i64,
//     pub FileAttributes: u32,
//     pub FileNameLength: u32,
//     pub FileId: i64,
//     pub LockingTransactionId: windows_sys::core::GUID,
//     pub TxInfoFlags: u32,
//     pub FileName: [u16; 1],
// }

// UNSUPPORTED Rust 1960:1: declaration Impl has no candidate rule
// impl Default for FILE_ID_GLOBAL_TX_DIR_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILE_ID_GLOBAL_TX_DIR_INFO_FLAG_VISIBLE_OUTSIDE_TX`: UInt = 4u;
public const val `FILE_ID_GLOBAL_TX_DIR_INFO_FLAG_VISIBLE_TO_TX`: UInt = 2u;
public const val `FILE_ID_GLOBAL_TX_DIR_INFO_FLAG_WRITELOCKED`: UInt = 1u;
// UNSUPPORTED Rust 1968:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Storage_FileSystem")]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_ID_INFORMATION {
//     pub VolumeSerialNumber: u64,
//     pub FileId: super::super::super::Win32::Storage::FileSystem::FILE_ID_128,
// }

public typealias `FILE_INFORMATION_CLASS` = Int;
// UNSUPPORTED Rust 1976:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_INFORMATION_DEFINITION {
//     pub Class: FILE_INFORMATION_CLASS,
//     pub NextEntryOffset: u32,
//     pub FileNameLengthOffset: u32,
//     pub FileNameOffset: u32,
// }

// UNSUPPORTED Rust 1984:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_INTERNAL_INFORMATION {
//     pub IndexNumber: i64,
// }

// UNSUPPORTED Rust 1989:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_KNOWN_FOLDER_INFORMATION {
//     pub Type: FILE_KNOWN_FOLDER_TYPE,
// }

public typealias `FILE_KNOWN_FOLDER_TYPE` = Int;
// UNSUPPORTED Rust 1995:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Storage_FileSystem")]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_LINKS_FULL_ID_INFORMATION {
//     pub BytesNeeded: u32,
//     pub EntriesReturned: u32,
//     pub Entry: FILE_LINK_ENTRY_FULL_ID_INFORMATION,
// }

// UNSUPPORTED Rust 2003:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_LINKS_INFORMATION {
//     pub BytesNeeded: u32,
//     pub EntriesReturned: u32,
//     pub Entry: FILE_LINK_ENTRY_INFORMATION,
// }

// UNSUPPORTED Rust 2010:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Storage_FileSystem")]
// #[derive(Clone, Copy)]
// pub struct FILE_LINK_ENTRY_FULL_ID_INFORMATION {
//     pub NextEntryOffset: u32,
//     pub ParentFileId: super::super::super::Win32::Storage::FileSystem::FILE_ID_128,
//     pub FileNameLength: u32,
//     pub FileName: [u16; 1],
// }

// UNSUPPORTED Rust 2019:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for FILE_LINK_ENTRY_FULL_ID_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2025:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_LINK_ENTRY_INFORMATION {
//     pub NextEntryOffset: u32,
//     pub ParentFileId: i64,
//     pub FileNameLength: u32,
//     pub FileName: [u16; 1],
// }

// UNSUPPORTED Rust 2033:1: declaration Impl has no candidate rule
// impl Default for FILE_LINK_ENTRY_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILE_LINK_FORCE_RESIZE_SOURCE_SR`: UInt = 256u;
public const val `FILE_LINK_FORCE_RESIZE_SR`: UInt = 384u;
public const val `FILE_LINK_FORCE_RESIZE_TARGET_SR`: UInt = 128u;
public const val `FILE_LINK_IGNORE_READONLY_ATTRIBUTE`: UInt = 64u;
// UNSUPPORTED Rust 2042:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_LINK_INFORMATION {
//     pub Anonymous: FILE_LINK_INFORMATION_0,
//     pub RootDirectory: super::super::super::Win32::Foundation::HANDLE,
//     pub FileNameLength: u32,
//     pub FileName: [u16; 1],
// }

// UNSUPPORTED Rust 2050:1: declaration Impl has no candidate rule
// impl Default for FILE_LINK_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2055:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FILE_LINK_INFORMATION_0 {
//     pub ReplaceIfExists: bool,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 2061:1: declaration Impl has no candidate rule
// impl Default for FILE_LINK_INFORMATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILE_LINK_NO_DECREASE_AVAILABLE_SPACE`: UInt = 32u;
public const val `FILE_LINK_NO_INCREASE_AVAILABLE_SPACE`: UInt = 16u;
public const val `FILE_LINK_POSIX_SEMANTICS`: UInt = 2u;
public const val `FILE_LINK_PRESERVE_AVAILABLE_SPACE`: UInt = 48u;
public const val `FILE_LINK_REPLACE_IF_EXISTS`: UInt = 1u;
public const val `FILE_LINK_SUPPRESS_STORAGE_RESERVE_INHERITANCE`: UInt = 8u;
// UNSUPPORTED Rust 2072:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FILE_LOCK {
//     pub CompleteLockIrpRoutine: PCOMPLETE_LOCK_IRP_ROUTINE,
//     pub UnlockRoutine: PUNLOCK_ROUTINE,
//     pub FastIoIsQuestionable: bool,
//     pub SpareC: [bool; 3],
//     pub LockInformation: *mut core::ffi::c_void,
//     pub LastReturnedLockInfo: FILE_LOCK_INFO,
//     pub LastReturnedLock: *mut core::ffi::c_void,
//     pub LockRequestsInProgress: i32,
// }

// UNSUPPORTED Rust 2085:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FILE_LOCK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2091:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FILE_LOCK_INFO {
//     pub StartingByte: i64,
//     pub Length: i64,
//     pub ExclusiveLock: bool,
//     pub Key: u32,
//     pub FileObject: *mut super::super::Foundation::FILE_OBJECT,
//     pub ProcessId: *mut core::ffi::c_void,
//     pub EndingByte: i64,
// }

// UNSUPPORTED Rust 2103:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FILE_LOCK_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2109:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_MAILSLOT_QUERY_INFORMATION {
//     pub MaximumMessageSize: u32,
//     pub MailslotQuota: u32,
//     pub NextMessageSize: u32,
//     pub MessagesAvailable: u32,
//     pub ReadTimeout: i64,
// }

// UNSUPPORTED Rust 2118:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_MAILSLOT_SET_INFORMATION {
//     pub ReadTimeout: *mut i64,
// }

// UNSUPPORTED Rust 2123:1: declaration Impl has no candidate rule
// impl Default for FILE_MAILSLOT_SET_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2128:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_MODE_INFORMATION {
//     pub Mode: u32,
// }

// UNSUPPORTED Rust 2133:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_MOVE_CLUSTER_INFORMATION {
//     pub ClusterCount: u32,
//     pub RootDirectory: super::super::super::Win32::Foundation::HANDLE,
//     pub FileNameLength: u32,
//     pub FileName: [u16; 1],
// }

// UNSUPPORTED Rust 2141:1: declaration Impl has no candidate rule
// impl Default for FILE_MOVE_CLUSTER_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2146:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_NAMES_INFORMATION {
//     pub NextEntryOffset: u32,
//     pub FileIndex: u32,
//     pub FileNameLength: u32,
//     pub FileName: [u16; 1],
// }

// UNSUPPORTED Rust 2154:1: declaration Impl has no candidate rule
// impl Default for FILE_NAMES_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2159:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_NAME_INFORMATION {
//     pub FileNameLength: u32,
//     pub FileName: [u16; 1],
// }

// UNSUPPORTED Rust 2165:1: declaration Impl has no candidate rule
// impl Default for FILE_NAME_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILE_NEED_EA`: UInt = 128u;
// UNSUPPORTED Rust 2171:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_NETWORK_OPEN_INFORMATION {
//     pub CreationTime: i64,
//     pub LastAccessTime: i64,
//     pub LastWriteTime: i64,
//     pub ChangeTime: i64,
//     pub AllocationSize: i64,
//     pub EndOfFile: i64,
//     pub FileAttributes: u32,
// }

// UNSUPPORTED Rust 2182:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_NETWORK_PHYSICAL_NAME_INFORMATION {
//     pub FileNameLength: u32,
//     pub FileName: [u16; 1],
// }

// UNSUPPORTED Rust 2188:1: declaration Impl has no candidate rule
// impl Default for FILE_NETWORK_PHYSICAL_NAME_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILE_NON_DIRECTORY_FILE`: `NTCREATEFILE_CREATE_OPTIONS` = 64u;
public const val `FILE_NOTIFY_CHANGE_EA`: UInt = 128u;
public const val `FILE_NOTIFY_CHANGE_NAME`: UInt = 3u;
public const val `FILE_NOTIFY_CHANGE_STREAM_NAME`: UInt = 512u;
public const val `FILE_NOTIFY_CHANGE_STREAM_SIZE`: UInt = 1024u;
public const val `FILE_NOTIFY_CHANGE_STREAM_WRITE`: UInt = 2048u;
public const val `FILE_NOTIFY_VALID_MASK`: UInt = 4095u;
public const val `FILE_NO_COMPRESSION`: `NTCREATEFILE_CREATE_OPTIONS` = 32768u;
public const val `FILE_NO_EA_KNOWLEDGE`: `NTCREATEFILE_CREATE_OPTIONS` = 512u;
public const val `FILE_NO_INTERMEDIATE_BUFFERING`: `NTCREATEFILE_CREATE_OPTIONS` = 8u;
// UNSUPPORTED Rust 2203:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_OBJECTID_INFORMATION {
//     pub FileReference: i64,
//     pub ObjectId: [u8; 16],
//     pub Anonymous: FILE_OBJECTID_INFORMATION_0,
// }

// UNSUPPORTED Rust 2210:1: declaration Impl has no candidate rule
// impl Default for FILE_OBJECTID_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2215:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FILE_OBJECTID_INFORMATION_0 {
//     pub Anonymous: FILE_OBJECTID_INFORMATION_0_0,
//     pub ExtendedInfo: [u8; 48],
// }

// UNSUPPORTED Rust 2221:1: declaration Impl has no candidate rule
// impl Default for FILE_OBJECTID_INFORMATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2226:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_OBJECTID_INFORMATION_0_0 {
//     pub BirthVolumeId: [u8; 16],
//     pub BirthObjectId: [u8; 16],
//     pub DomainId: [u8; 16],
// }

// UNSUPPORTED Rust 2233:1: declaration Impl has no candidate rule
// impl Default for FILE_OBJECTID_INFORMATION_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILE_OPBATCH_BREAK_UNDERWAY`: UInt = 9u;
public const val `FILE_OPEN`: `NTCREATEFILE_CREATE_DISPOSITION` = 1u;
public const val `FILE_OPEN_BY_FILE_ID`: `NTCREATEFILE_CREATE_OPTIONS` = 8192u;
public const val `FILE_OPEN_FOR_BACKUP_INTENT`: `NTCREATEFILE_CREATE_OPTIONS` = 16384u;
public const val `FILE_OPEN_FOR_FREE_SPACE_QUERY`: `NTCREATEFILE_CREATE_OPTIONS` = 8388608u;
public const val `FILE_OPEN_IF`: `NTCREATEFILE_CREATE_DISPOSITION` = 3u;
public const val `FILE_OPEN_NO_RECALL`: `NTCREATEFILE_CREATE_OPTIONS` = 4194304u;
public const val `FILE_OPEN_REPARSE_POINT`: `NTCREATEFILE_CREATE_OPTIONS` = 2097152u;
public const val `FILE_OPEN_REQUIRING_OPLOCK`: `NTCREATEFILE_CREATE_OPTIONS` = 65536u;
public const val `FILE_OPLOCK_BROKEN_TO_LEVEL_2`: UInt = 7u;
public const val `FILE_OPLOCK_BROKEN_TO_NONE`: UInt = 8u;
public const val `FILE_OVERWRITE`: `NTCREATEFILE_CREATE_DISPOSITION` = 4u;
public const val `FILE_OVERWRITE_IF`: `NTCREATEFILE_CREATE_DISPOSITION` = 5u;
public const val `FILE_PIPE_ACCEPT_REMOTE_CLIENTS`: UInt = 0u;
// UNSUPPORTED Rust 2252:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_PIPE_ASSIGN_EVENT_BUFFER {
//     pub EventHandle: super::super::super::Win32::Foundation::HANDLE,
//     pub KeyValue: u32,
// }

// UNSUPPORTED Rust 2258:1: declaration Impl has no candidate rule
// impl Default for FILE_PIPE_ASSIGN_EVENT_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILE_PIPE_BYTE_STREAM_MODE`: UInt = 0u;
public const val `FILE_PIPE_BYTE_STREAM_TYPE`: UInt = 0u;
public const val `FILE_PIPE_CLIENT_END`: UInt = 0u;
// UNSUPPORTED Rust 2266:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_PIPE_CLIENT_PROCESS_BUFFER {
//     pub ClientSession: *mut core::ffi::c_void,
//     pub ClientProcess: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 2272:1: declaration Impl has no candidate rule
// impl Default for FILE_PIPE_CLIENT_PROCESS_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2277:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_PIPE_CLIENT_PROCESS_BUFFER_EX {
//     pub ClientSession: *mut core::ffi::c_void,
//     pub ClientProcess: *mut core::ffi::c_void,
//     pub ClientComputerNameLength: u16,
//     pub ClientComputerBuffer: [u16; 16],
// }

// UNSUPPORTED Rust 2285:1: declaration Impl has no candidate rule
// impl Default for FILE_PIPE_CLIENT_PROCESS_BUFFER_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2290:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_PIPE_CLIENT_PROCESS_BUFFER_V2 {
//     pub ClientSession: u64,
//     pub ClientProcess: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 2296:1: declaration Impl has no candidate rule
// impl Default for FILE_PIPE_CLIENT_PROCESS_BUFFER_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILE_PIPE_CLOSING_STATE`: UInt = 4u;
public const val `FILE_PIPE_COMPLETE_OPERATION`: UInt = 1u;
public const val `FILE_PIPE_COMPUTER_NAME_LENGTH`: UInt = 15u;
public const val `FILE_PIPE_CONNECTED_STATE`: UInt = 3u;
// UNSUPPORTED Rust 2305:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_PIPE_CREATE_SYMLINK_INPUT {
//     pub NameOffset: u16,
//     pub NameLength: u16,
//     pub SubstituteNameOffset: u16,
//     pub SubstituteNameLength: u16,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 2314:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_PIPE_DELETE_SYMLINK_INPUT {
//     pub NameOffset: u16,
//     pub NameLength: u16,
// }

public const val `FILE_PIPE_DISCONNECTED_STATE`: UInt = 1u;
// UNSUPPORTED Rust 2321:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_PIPE_EVENT_BUFFER {
//     pub NamedPipeState: u32,
//     pub EntryType: u32,
//     pub ByteCount: u32,
//     pub KeyValue: u32,
//     pub NumberRequests: u32,
// }

public const val `FILE_PIPE_FULL_DUPLEX`: UInt = 2u;
public const val `FILE_PIPE_INBOUND`: UInt = 0u;
// UNSUPPORTED Rust 2332:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_PIPE_INFORMATION {
//     pub ReadMode: u32,
//     pub CompletionMode: u32,
// }

public const val `FILE_PIPE_LISTENING_STATE`: UInt = 2u;
// UNSUPPORTED Rust 2339:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_PIPE_LOCAL_INFORMATION {
//     pub NamedPipeType: u32,
//     pub NamedPipeConfiguration: u32,
//     pub MaximumInstances: u32,
//     pub CurrentInstances: u32,
//     pub InboundQuota: u32,
//     pub ReadDataAvailable: u32,
//     pub OutboundQuota: u32,
//     pub WriteQuotaAvailable: u32,
//     pub NamedPipeState: u32,
//     pub NamedPipeEnd: u32,
// }

public const val `FILE_PIPE_MESSAGE_MODE`: UInt = 1u;
public const val `FILE_PIPE_MESSAGE_TYPE`: UInt = 1u;
public const val `FILE_PIPE_OUTBOUND`: UInt = 1u;
// UNSUPPORTED Rust 2356:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_PIPE_PEEK_BUFFER {
//     pub NamedPipeState: u32,
//     pub ReadDataAvailable: u32,
//     pub NumberOfMessages: u32,
//     pub MessageLength: u32,
//     pub Data: [i8; 1],
// }

// UNSUPPORTED Rust 2365:1: declaration Impl has no candidate rule
// impl Default for FILE_PIPE_PEEK_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILE_PIPE_QUEUE_OPERATION`: UInt = 0u;
public const val `FILE_PIPE_READ_DATA`: UInt = 0u;
public const val `FILE_PIPE_REJECT_REMOTE_CLIENTS`: UInt = 2u;
// UNSUPPORTED Rust 2373:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_PIPE_REMOTE_INFORMATION {
//     pub CollectDataTime: i64,
//     pub MaximumCollectionCount: u32,
// }

public const val `FILE_PIPE_SERVER_END`: UInt = 1u;
// UNSUPPORTED Rust 2380:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_PIPE_SILO_ARRIVAL_INPUT {
//     pub JobHandle: super::super::super::Win32::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 2385:1: declaration Impl has no candidate rule
// impl Default for FILE_PIPE_SILO_ARRIVAL_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILE_PIPE_SYMLINK_FLAG_GLOBAL`: UInt = 1u;
public const val `FILE_PIPE_SYMLINK_FLAG_RELATIVE`: UInt = 2u;
public const val `FILE_PIPE_TYPE_VALID_MASK`: UInt = 3u;
// UNSUPPORTED Rust 2393:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_PIPE_WAIT_FOR_BUFFER {
//     pub Timeout: i64,
//     pub NameLength: u32,
//     pub TimeoutSpecified: bool,
//     pub Name: [u16; 1],
// }

// UNSUPPORTED Rust 2401:1: declaration Impl has no candidate rule
// impl Default for FILE_PIPE_WAIT_FOR_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILE_PIPE_WRITE_SPACE`: UInt = 1u;
// UNSUPPORTED Rust 2407:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_POSITION_INFORMATION {
//     pub CurrentByteOffset: i64,
// }

// UNSUPPORTED Rust 2412:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_QUOTA_INFORMATION {
//     pub NextEntryOffset: u32,
//     pub SidLength: u32,
//     pub ChangeTime: i64,
//     pub QuotaUsed: i64,
//     pub QuotaThreshold: i64,
//     pub QuotaLimit: i64,
//     pub Sid: super::super::super::Win32::Security::SID,
// }

public const val `FILE_RANDOM_ACCESS`: `NTCREATEFILE_CREATE_OPTIONS` = 2048u;
// UNSUPPORTED Rust 2425:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_REMOTE_PROTOCOL_INFORMATION {
//     pub StructureVersion: u16,
//     pub StructureSize: u16,
//     pub Protocol: u32,
//     pub ProtocolMajorVersion: u16,
//     pub ProtocolMinorVersion: u16,
//     pub ProtocolRevision: u16,
//     pub Reserved: u16,
//     pub Flags: u32,
//     pub GenericReserved: FILE_REMOTE_PROTOCOL_INFORMATION_0,
//     pub ProtocolSpecific: FILE_REMOTE_PROTOCOL_INFORMATION_1,
// }

// UNSUPPORTED Rust 2439:1: declaration Impl has no candidate rule
// impl Default for FILE_REMOTE_PROTOCOL_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2444:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_REMOTE_PROTOCOL_INFORMATION_0 {
//     pub Reserved: [u32; 8],
// }

// UNSUPPORTED Rust 2449:1: declaration Impl has no candidate rule
// impl Default for FILE_REMOTE_PROTOCOL_INFORMATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2454:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FILE_REMOTE_PROTOCOL_INFORMATION_1 {
//     pub Smb2: FILE_REMOTE_PROTOCOL_INFORMATION_1_0,
//     pub Reserved: [u32; 16],
// }

// UNSUPPORTED Rust 2460:1: declaration Impl has no candidate rule
// impl Default for FILE_REMOTE_PROTOCOL_INFORMATION_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2465:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_REMOTE_PROTOCOL_INFORMATION_1_0 {
//     pub Server: FILE_REMOTE_PROTOCOL_INFORMATION_1_0_0,
//     pub Share: FILE_REMOTE_PROTOCOL_INFORMATION_1_0_1,
// }

// UNSUPPORTED Rust 2471:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_REMOTE_PROTOCOL_INFORMATION_1_0_0 {
//     pub Capabilities: u32,
// }

// UNSUPPORTED Rust 2476:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_REMOTE_PROTOCOL_INFORMATION_1_0_1 {
//     pub Capabilities: u32,
//     pub ShareFlags: u32,
//     pub ShareType: u8,
//     pub Reserved0: [u8; 3],
//     pub Reserved1: u32,
// }

// UNSUPPORTED Rust 2485:1: declaration Impl has no candidate rule
// impl Default for FILE_REMOTE_PROTOCOL_INFORMATION_1_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILE_RENAME_FORCE_RESIZE_SOURCE_SR`: UInt = 256u;
public const val `FILE_RENAME_FORCE_RESIZE_SR`: UInt = 384u;
public const val `FILE_RENAME_FORCE_RESIZE_TARGET_SR`: UInt = 128u;
public const val `FILE_RENAME_IGNORE_READONLY_ATTRIBUTE`: UInt = 64u;
// UNSUPPORTED Rust 2494:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_RENAME_INFORMATION {
//     pub Anonymous: FILE_RENAME_INFORMATION_0,
//     pub RootDirectory: super::super::super::Win32::Foundation::HANDLE,
//     pub FileNameLength: u32,
//     pub FileName: [u16; 1],
// }

// UNSUPPORTED Rust 2502:1: declaration Impl has no candidate rule
// impl Default for FILE_RENAME_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2507:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FILE_RENAME_INFORMATION_0 {
//     pub ReplaceIfExists: bool,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 2513:1: declaration Impl has no candidate rule
// impl Default for FILE_RENAME_INFORMATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILE_RENAME_NO_DECREASE_AVAILABLE_SPACE`: UInt = 32u;
public const val `FILE_RENAME_NO_INCREASE_AVAILABLE_SPACE`: UInt = 16u;
public const val `FILE_RENAME_POSIX_SEMANTICS`: UInt = 2u;
public const val `FILE_RENAME_PRESERVE_AVAILABLE_SPACE`: UInt = 48u;
public const val `FILE_RENAME_REPLACE_IF_EXISTS`: UInt = 1u;
public const val `FILE_RENAME_SUPPRESS_PIN_STATE_INHERITANCE`: UInt = 4u;
public const val `FILE_RENAME_SUPPRESS_STORAGE_RESERVE_INHERITANCE`: UInt = 8u;
// UNSUPPORTED Rust 2525:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_REPARSE_POINT_INFORMATION {
//     pub FileReference: i64,
//     pub Tag: u32,
// }

public const val `FILE_RESERVE_OPFILTER`: `NTCREATEFILE_CREATE_OPTIONS` = 1048576u;
public const val `FILE_SEQUENTIAL_ONLY`: `NTCREATEFILE_CREATE_OPTIONS` = 4u;
public const val `FILE_SESSION_AWARE`: `NTCREATEFILE_CREATE_OPTIONS` = 262144u;
// UNSUPPORTED Rust 2534:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_STANDARD_INFORMATION {
//     pub AllocationSize: i64,
//     pub EndOfFile: i64,
//     pub NumberOfLinks: u32,
//     pub DeletePending: bool,
//     pub Directory: bool,
// }

// UNSUPPORTED Rust 2543:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_STANDARD_LINK_INFORMATION {
//     pub NumberOfAccessibleLinks: u32,
//     pub TotalNumberOfLinks: u32,
//     pub DeletePending: bool,
//     pub Directory: bool,
// }

// UNSUPPORTED Rust 2551:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_STAT_INFORMATION {
//     pub FileId: i64,
//     pub CreationTime: i64,
//     pub LastAccessTime: i64,
//     pub LastWriteTime: i64,
//     pub ChangeTime: i64,
//     pub AllocationSize: i64,
//     pub EndOfFile: i64,
//     pub FileAttributes: u32,
//     pub ReparseTag: u32,
//     pub NumberOfLinks: u32,
//     pub EffectiveAccess: u32,
// }

// UNSUPPORTED Rust 2566:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_STAT_LX_INFORMATION {
//     pub FileId: i64,
//     pub CreationTime: i64,
//     pub LastAccessTime: i64,
//     pub LastWriteTime: i64,
//     pub ChangeTime: i64,
//     pub AllocationSize: i64,
//     pub EndOfFile: i64,
//     pub FileAttributes: u32,
//     pub ReparseTag: u32,
//     pub NumberOfLinks: u32,
//     pub EffectiveAccess: u32,
//     pub LxFlags: u32,
//     pub LxUid: u32,
//     pub LxGid: u32,
//     pub LxMode: u32,
//     pub LxDeviceIdMajor: u32,
//     pub LxDeviceIdMinor: u32,
// }

// UNSUPPORTED Rust 2587:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Ioctl")]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_STORAGE_RESERVE_ID_INFORMATION {
//     pub StorageReserveId: super::super::super::Win32::System::Ioctl::STORAGE_RESERVE_ID,
// }

// UNSUPPORTED Rust 2593:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_STREAM_INFORMATION {
//     pub NextEntryOffset: u32,
//     pub StreamNameLength: u32,
//     pub StreamSize: i64,
//     pub StreamAllocationSize: i64,
//     pub StreamName: [u16; 1],
// }

// UNSUPPORTED Rust 2602:1: declaration Impl has no candidate rule
// impl Default for FILE_STREAM_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILE_SUPERSEDE`: `NTCREATEFILE_CREATE_DISPOSITION` = 0u;
public const val `FILE_SYNCHRONOUS_IO_ALERT`: `NTCREATEFILE_CREATE_OPTIONS` = 16u;
public const val `FILE_SYNCHRONOUS_IO_NONALERT`: `NTCREATEFILE_CREATE_OPTIONS` = 32u;
// UNSUPPORTED Rust 2610:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FILE_TIMESTAMPS {
//     pub CreationTime: i64,
//     pub LastAccessTime: i64,
//     pub LastWriteTime: i64,
//     pub ChangeTime: i64,
// }

// UNSUPPORTED Rust 2618:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_TRACKING_INFORMATION {
//     pub DestinationFile: super::super::super::Win32::Foundation::HANDLE,
//     pub ObjectInformationLength: u32,
//     pub ObjectInformation: [i8; 1],
// }

// UNSUPPORTED Rust 2625:1: declaration Impl has no candidate rule
// impl Default for FILE_TRACKING_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILE_VC_CONTENT_INDEX_DISABLED`: UInt = 8u;
public const val `FILE_VC_LOG_QUOTA_LIMIT`: UInt = 32u;
public const val `FILE_VC_LOG_QUOTA_THRESHOLD`: UInt = 16u;
public const val `FILE_VC_LOG_VOLUME_LIMIT`: UInt = 128u;
public const val `FILE_VC_LOG_VOLUME_THRESHOLD`: UInt = 64u;
public const val `FILE_VC_QUOTAS_INCOMPLETE`: UInt = 256u;
public const val `FILE_VC_QUOTAS_REBUILDING`: UInt = 512u;
public const val `FILE_VC_QUOTA_ENFORCE`: UInt = 2u;
public const val `FILE_VC_QUOTA_MASK`: UInt = 3u;
public const val `FILE_VC_QUOTA_NONE`: UInt = 0u;
public const val `FILE_VC_QUOTA_TRACK`: UInt = 1u;
public const val `FILE_VC_VALID_MASK`: UInt = 1023u;
// UNSUPPORTED Rust 2642:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_VOLUME_NAME_INFORMATION {
//     pub DeviceNameLength: u32,
//     pub DeviceName: [u16; 1],
// }

// UNSUPPORTED Rust 2648:1: declaration Impl has no candidate rule
// impl Default for FILE_VOLUME_NAME_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILE_WRITE_THROUGH`: `NTCREATEFILE_CREATE_OPTIONS` = 2u;
public const val `FLAGS_DELAY_REASONS_BITMAP_SCANNED`: UInt = 2u;
public const val `FLAGS_DELAY_REASONS_LOG_FILE_FULL`: UInt = 1u;
public const val `FLAGS_END_OF_FILE_INFO_EX_EXTEND_PAGING`: UInt = 1u;
public const val `FLAGS_END_OF_FILE_INFO_EX_NO_EXTRA_PAGING_EXTEND`: UInt = 2u;
public const val `FLAGS_END_OF_FILE_INFO_EX_TIME_CONSTRAINED`: UInt = 4u;
// UNSUPPORTED Rust 2659:1: generic scalar type unsupported
// pub type FREE_VIRTUAL_MEMORY_EX_CALLBACK = Option<unsafe extern "system" fn(callbackcontext: super::super::super::Win32::Foundation::HANDLE, processhandle: super::super::super::Win32::Foundation::HANDLE, baseaddress: *mut *mut core::ffi::c_void, regionsize: *mut usize, freetype: u32) -> super::super::super::Win32::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2660:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FSCTL_GHOST_FILE_EXTENTS_INPUT_BUFFER {
//     pub FileOffset: i64,
//     pub ByteCount: i64,
//     pub RecallOwnerGuid: windows_sys::core::GUID,
//     pub RecallMetadataBufferSize: u32,
//     pub RecallMetadataBuffer: [u8; 1],
// }

// UNSUPPORTED Rust 2669:1: declaration Impl has no candidate rule
// impl Default for FSCTL_GHOST_FILE_EXTENTS_INPUT_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FSCTL_LMR_GET_LINK_TRACKING_INFORMATION`: UInt = 1310952u;
public const val `FSCTL_LMR_SET_LINK_TRACKING_INFORMATION`: UInt = 1310956u;
public const val `FSCTL_MAILSLOT_PEEK`: UInt = 802819u;
public const val `FSCTL_PIPE_ASSIGN_EVENT`: UInt = 1114112u;
public const val `FSCTL_PIPE_CREATE_SYMLINK`: UInt = 1114188u;
public const val `FSCTL_PIPE_DELETE_SYMLINK`: UInt = 1114192u;
public const val `FSCTL_PIPE_DISABLE_IMPERSONATE`: UInt = 1114180u;
public const val `FSCTL_PIPE_DISCONNECT`: UInt = 1114116u;
public const val `FSCTL_PIPE_FLUSH`: UInt = 1146944u;
public const val `FSCTL_PIPE_GET_CONNECTION_ATTRIBUTE`: UInt = 1114160u;
public const val `FSCTL_PIPE_GET_HANDLE_ATTRIBUTE`: UInt = 1114168u;
public const val `FSCTL_PIPE_GET_PIPE_ATTRIBUTE`: UInt = 1114152u;
public const val `FSCTL_PIPE_IMPERSONATE`: UInt = 1114140u;
public const val `FSCTL_PIPE_INTERNAL_READ`: UInt = 1138676u;
public const val `FSCTL_PIPE_INTERNAL_READ_OVFLOW`: UInt = 1138688u;
public const val `FSCTL_PIPE_INTERNAL_TRANSCEIVE`: UInt = 1171455u;
public const val `FSCTL_PIPE_INTERNAL_WRITE`: UInt = 1155064u;
public const val `FSCTL_PIPE_LISTEN`: UInt = 1114120u;
public const val `FSCTL_PIPE_PEEK`: UInt = 1130508u;
public const val `FSCTL_PIPE_QUERY_CLIENT_PROCESS`: UInt = 1114148u;
public const val `FSCTL_PIPE_QUERY_CLIENT_PROCESS_V2`: UInt = 1114196u;
public const val `FSCTL_PIPE_QUERY_EVENT`: UInt = 1114128u;
public const val `FSCTL_PIPE_SET_CLIENT_PROCESS`: UInt = 1114144u;
public const val `FSCTL_PIPE_SET_CONNECTION_ATTRIBUTE`: UInt = 1114164u;
public const val `FSCTL_PIPE_SET_HANDLE_ATTRIBUTE`: UInt = 1114172u;
public const val `FSCTL_PIPE_SET_PIPE_ATTRIBUTE`: UInt = 1114156u;
public const val `FSCTL_PIPE_SILO_ARRIVAL`: UInt = 1146952u;
public const val `FSCTL_PIPE_TRANSCEIVE`: UInt = 1163287u;
public const val `FSCTL_PIPE_WAIT`: UInt = 1114136u;
// UNSUPPORTED Rust 2703:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FSCTL_QUERY_GHOSTED_FILE_EXTENTS_INPUT_RANGE {
//     pub FileOffset: i64,
//     pub ByteCount: i64,
// }

// UNSUPPORTED Rust 2709:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FSCTL_QUERY_GHOSTED_FILE_EXTENTS_OUTPUT {
//     pub ExtentCount: u32,
//     pub TotalExtentCount: u32,
//     pub Extents: [u8; 1],
// }

// UNSUPPORTED Rust 2716:1: declaration Impl has no candidate rule
// impl Default for FSCTL_QUERY_GHOSTED_FILE_EXTENTS_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2721:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FSCTL_QUERY_VOLUME_NUMA_INFO_OUTPUT {
//     pub NumaNode: u32,
// }

// UNSUPPORTED Rust 2726:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FSCTL_UNMAP_SPACE_INPUT_BUFFER {
//     pub BytesToUnmap: i64,
// }

// UNSUPPORTED Rust 2731:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FSCTL_UNMAP_SPACE_OUTPUT {
//     pub BytesUnmapped: i64,
// }

public const val `FSRTL_ADD_TC_CASE_SENSITIVE`: UInt = 1u;
public const val `FSRTL_ADD_TC_KEY_BY_SHORT_NAME`: UInt = 2u;
// UNSUPPORTED Rust 2738:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// #[derive(Clone, Copy)]
// pub struct FSRTL_ADVANCED_FCB_HEADER {
//     pub Base: FSRTL_COMMON_FCB_HEADER,
//     pub FastMutex: *mut super::super::Foundation::FAST_MUTEX,
//     pub FilterContexts: super::super::super::Win32::System::Kernel::LIST_ENTRY,
//     pub PushLock: usize,
//     pub FileContextSupportPointer: *mut *mut core::ffi::c_void,
//     pub Anonymous: FSRTL_ADVANCED_FCB_HEADER_0,
//     pub AePushLock: *mut core::ffi::c_void,
//     pub BypassIoOpenCount: u32,
// }

// UNSUPPORTED Rust 2751:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// impl Default for FSRTL_ADVANCED_FCB_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2757:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// #[derive(Clone, Copy)]
// pub union FSRTL_ADVANCED_FCB_HEADER_0 {
//     pub Oplock: *mut core::ffi::c_void,
//     pub ReservedForRemote: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 2764:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// impl Default for FSRTL_ADVANCED_FCB_HEADER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FSRTL_ALLOCATE_ECPLIST_FLAG_CHARGE_QUOTA`: UInt = 1u;
public const val `FSRTL_ALLOCATE_ECP_FLAG_CHARGE_QUOTA`: UInt = 1u;
public const val `FSRTL_ALLOCATE_ECP_FLAG_NONPAGED_POOL`: UInt = 2u;
// UNSUPPORTED Rust 2773:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Wdk_Foundation")]
// #[derive(Clone, Copy)]
// pub struct FSRTL_AUXILIARY_BUFFER {
//     pub Buffer: *mut core::ffi::c_void,
//     pub Length: u32,
//     pub Flags: u32,
//     pub Mdl: *mut super::super::Foundation::MDL,
// }

// UNSUPPORTED Rust 2782:1: declaration Impl has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// impl Default for FSRTL_AUXILIARY_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FSRTL_AUXILIARY_FLAG_DEALLOCATE`: UInt = 1u;
public const val `FSRTL_CC_FLUSH_ERROR_FLAG_NO_HARD_ERROR`: UInt = 1u;
public const val `FSRTL_CC_FLUSH_ERROR_FLAG_NO_LOG_ENTRY`: UInt = 2u;
public typealias `FSRTL_CHANGE_BACKING_TYPE` = Int;
// UNSUPPORTED Rust 2792:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// #[derive(Clone, Copy)]
// pub struct FSRTL_COMMON_FCB_HEADER {
//     pub NodeTypeCode: i16,
//     pub NodeByteSize: i16,
//     pub Flags: u8,
//     pub IsFastIoPossible: u8,
//     pub Flags2: u8,
//     pub _bitfield: u8,
//     pub Resource: *mut super::super::Foundation::ERESOURCE,
//     pub PagingIoResource: *mut super::super::Foundation::ERESOURCE,
//     pub AllocationSize: i64,
//     pub FileSize: i64,
//     pub ValidDataLength: i64,
// }

// UNSUPPORTED Rust 2808:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// impl Default for FSRTL_COMMON_FCB_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `FSRTL_COMPARISON_RESULT` = Int;
public const val `FSRTL_DRIVER_BACKING_FLAG_USE_PAGE_FILE`: UInt = 1u;
public const val `FSRTL_ECP_LOOKASIDE_FLAG_NONPAGED_POOL`: UInt = 2u;
public const val `FSRTL_FAT_LEGAL`: UInt = 1u;
public const val `FSRTL_FCB_HEADER_V0`: UInt = 0u;
public const val `FSRTL_FCB_HEADER_V1`: UInt = 1u;
public const val `FSRTL_FCB_HEADER_V2`: UInt = 2u;
public const val `FSRTL_FCB_HEADER_V3`: UInt = 3u;
public const val `FSRTL_FCB_HEADER_V4`: UInt = 4u;
public const val `FSRTL_FIND_TC_CASE_SENSITIVE`: UInt = 1u;
public const val `FSRTL_FLAG2_BYPASSIO_STREAM_PAUSED`: UInt = 32u;
public const val `FSRTL_FLAG2_DO_MODIFIED_WRITE`: UInt = 1u;
public const val `FSRTL_FLAG2_IS_PAGING_FILE`: UInt = 8u;
public const val `FSRTL_FLAG2_PURGE_WHEN_MAPPED`: UInt = 4u;
public const val `FSRTL_FLAG2_SUPPORTS_FILTER_CONTEXTS`: UInt = 2u;
public const val `FSRTL_FLAG2_WRITABLE_USER_MAPPED_FILE`: UInt = 16u;
public const val `FSRTL_FLAG_ACQUIRE_MAIN_RSRC_EX`: UInt = 8u;
public const val `FSRTL_FLAG_ACQUIRE_MAIN_RSRC_SH`: UInt = 16u;
public const val `FSRTL_FLAG_ADVANCED_HEADER`: UInt = 64u;
public const val `FSRTL_FLAG_EOF_ADVANCE_ACTIVE`: UInt = 128u;
public const val `FSRTL_FLAG_FILE_LENGTH_CHANGED`: UInt = 2u;
public const val `FSRTL_FLAG_FILE_MODIFIED`: UInt = 1u;
public const val `FSRTL_FLAG_LIMIT_MODIFIED_PAGES`: UInt = 4u;
public const val `FSRTL_FLAG_USER_MAPPED_FILE`: UInt = 32u;
public const val `FSRTL_HPFS_LEGAL`: UInt = 2u;
// UNSUPPORTED Rust 2839:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FSRTL_MUP_PROVIDER_INFO_LEVEL_1 {
//     pub ProviderId: u32,
// }

// UNSUPPORTED Rust 2844:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FSRTL_MUP_PROVIDER_INFO_LEVEL_2 {
//     pub ProviderId: u32,
//     pub ProviderName: super::super::super::Win32::Foundation::UNICODE_STRING,
// }

public const val `FSRTL_NTFS_LEGAL`: UInt = 4u;
public const val `FSRTL_OLE_LEGAL`: UInt = 16u;
// UNSUPPORTED Rust 2852:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub struct FSRTL_PER_FILEOBJECT_CONTEXT {
//     pub Links: super::super::super::Win32::System::Kernel::LIST_ENTRY,
//     pub OwnerId: *mut core::ffi::c_void,
//     pub InstanceId: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 2860:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for FSRTL_PER_FILEOBJECT_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2866:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// #[derive(Clone, Copy)]
// pub struct FSRTL_PER_FILE_CONTEXT {
//     pub Links: super::super::super::Win32::System::Kernel::LIST_ENTRY,
//     pub OwnerId: *mut core::ffi::c_void,
//     pub InstanceId: *mut core::ffi::c_void,
//     pub FreeCallback: super::super::Foundation::PFREE_FUNCTION,
// }

// UNSUPPORTED Rust 2875:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// impl Default for FSRTL_PER_FILE_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2881:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// #[derive(Clone, Copy)]
// pub struct FSRTL_PER_STREAM_CONTEXT {
//     pub Links: super::super::super::Win32::System::Kernel::LIST_ENTRY,
//     pub OwnerId: *mut core::ffi::c_void,
//     pub InstanceId: *mut core::ffi::c_void,
//     pub FreeCallback: super::super::Foundation::PFREE_FUNCTION,
// }

// UNSUPPORTED Rust 2890:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// impl Default for FSRTL_PER_STREAM_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FSRTL_UNC_HARDENING_CAPABILITIES_INTEGRITY`: UInt = 2u;
public const val `FSRTL_UNC_HARDENING_CAPABILITIES_MUTUAL_AUTH`: UInt = 1u;
public const val `FSRTL_UNC_HARDENING_CAPABILITIES_PRIVACY`: UInt = 4u;
public const val `FSRTL_UNC_PROVIDER_FLAGS_CONTAINER_AWARE`: UInt = 8u;
public const val `FSRTL_UNC_PROVIDER_FLAGS_CSC_ENABLED`: UInt = 2u;
public const val `FSRTL_UNC_PROVIDER_FLAGS_DOMAIN_SVC_AWARE`: UInt = 4u;
public const val `FSRTL_UNC_PROVIDER_FLAGS_MAILSLOTS_SUPPORTED`: UInt = 1u;
// UNSUPPORTED Rust 2903:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FSRTL_UNC_PROVIDER_REGISTRATION {
//     pub Size: u16,
//     pub Version: u16,
//     pub Anonymous1: FSRTL_UNC_PROVIDER_REGISTRATION_0,
//     pub Anonymous2: FSRTL_UNC_PROVIDER_REGISTRATION_1,
// }

// UNSUPPORTED Rust 2911:1: declaration Impl has no candidate rule
// impl Default for FSRTL_UNC_PROVIDER_REGISTRATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2916:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FSRTL_UNC_PROVIDER_REGISTRATION_0 {
//     pub ProviderFlags: u32,
//     pub Anonymous: FSRTL_UNC_PROVIDER_REGISTRATION_0_0,
// }

// UNSUPPORTED Rust 2922:1: declaration Impl has no candidate rule
// impl Default for FSRTL_UNC_PROVIDER_REGISTRATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2927:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FSRTL_UNC_PROVIDER_REGISTRATION_0_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 2932:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FSRTL_UNC_PROVIDER_REGISTRATION_1 {
//     pub HardeningCapabilities: u32,
//     pub Anonymous: FSRTL_UNC_PROVIDER_REGISTRATION_1_0,
// }

// UNSUPPORTED Rust 2938:1: declaration Impl has no candidate rule
// impl Default for FSRTL_UNC_PROVIDER_REGISTRATION_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2943:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FSRTL_UNC_PROVIDER_REGISTRATION_1_0 {
//     pub _bitfield: u32,
// }

public const val `FSRTL_UNC_REGISTRATION_CURRENT_VERSION`: UInt = 513u;
public const val `FSRTL_UNC_REGISTRATION_VERSION_0200`: UInt = 512u;
public const val `FSRTL_UNC_REGISTRATION_VERSION_0201`: UInt = 513u;
public const val `FSRTL_VIRTDISK_FULLY_ALLOCATED`: UInt = 1u;
public const val `FSRTL_VIRTDISK_NO_DRIVE_LETTER`: UInt = 2u;
public const val `FSRTL_VOLUME_BACKGROUND_FORMAT`: UInt = 14u;
public const val `FSRTL_VOLUME_CHANGE_SIZE`: UInt = 13u;
public const val `FSRTL_VOLUME_DISMOUNT`: UInt = 1u;
public const val `FSRTL_VOLUME_DISMOUNT_FAILED`: UInt = 2u;
public const val `FSRTL_VOLUME_FORCED_CLOSED`: UInt = 10u;
public const val `FSRTL_VOLUME_INFO_MAKE_COMPAT`: UInt = 11u;
public const val `FSRTL_VOLUME_LOCK`: UInt = 3u;
public const val `FSRTL_VOLUME_LOCK_FAILED`: UInt = 4u;
public const val `FSRTL_VOLUME_MOUNT`: UInt = 6u;
public const val `FSRTL_VOLUME_NEEDS_CHKDSK`: UInt = 7u;
public const val `FSRTL_VOLUME_PREPARING_EJECT`: UInt = 12u;
public const val `FSRTL_VOLUME_UNLOCK`: UInt = 5u;
public const val `FSRTL_VOLUME_WEARING_OUT`: UInt = 9u;
public const val `FSRTL_VOLUME_WORM_NEAR_FULL`: UInt = 8u;
public const val `FSRTL_WILD_CHARACTER`: UInt = 8u;
// UNSUPPORTED Rust 2968:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FS_BPIO_INFO {
//     pub ActiveBypassIoCount: u32,
//     pub StorageDriverNameLen: u16,
//     pub StorageDriverName: [u16; 32],
// }

// UNSUPPORTED Rust 2975:1: declaration Impl has no candidate rule
// impl Default for FS_BPIO_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2980:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Ioctl")]
// #[derive(Clone, Copy, Default)]
// pub struct FS_BPIO_INPUT {
//     pub Operation: super::super::super::Win32::System::Ioctl::FS_BPIO_OPERATIONS,
//     pub InFlags: super::super::super::Win32::System::Ioctl::FS_BPIO_INFLAGS,
//     pub Reserved1: u64,
//     pub Reserved2: u64,
// }

public const val `FS_FILTER_ACQUIRE_FOR_CC_FLUSH`: UShort = 65531u;
public const val `FS_FILTER_ACQUIRE_FOR_MOD_WRITE`: UShort = 65533u;
public const val `FS_FILTER_ACQUIRE_FOR_SECTION_SYNCHRONIZATION`: UShort = 65535u;
// UNSUPPORTED Rust 2992:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy, Default)]
// pub struct FS_FILTER_CALLBACKS {
//     pub SizeOfFsFilterCallbacks: u32,
//     pub Reserved: u32,
//     pub PreAcquireForSectionSynchronization: PFS_FILTER_CALLBACK,
//     pub PostAcquireForSectionSynchronization: PFS_FILTER_COMPLETION_CALLBACK,
//     pub PreReleaseForSectionSynchronization: PFS_FILTER_CALLBACK,
//     pub PostReleaseForSectionSynchronization: PFS_FILTER_COMPLETION_CALLBACK,
//     pub PreAcquireForCcFlush: PFS_FILTER_CALLBACK,
//     pub PostAcquireForCcFlush: PFS_FILTER_COMPLETION_CALLBACK,
//     pub PreReleaseForCcFlush: PFS_FILTER_CALLBACK,
//     pub PostReleaseForCcFlush: PFS_FILTER_COMPLETION_CALLBACK,
//     pub PreAcquireForModifiedPageWriter: PFS_FILTER_CALLBACK,
//     pub PostAcquireForModifiedPageWriter: PFS_FILTER_COMPLETION_CALLBACK,
//     pub PreReleaseForModifiedPageWriter: PFS_FILTER_CALLBACK,
//     pub PostReleaseForModifiedPageWriter: PFS_FILTER_COMPLETION_CALLBACK,
//     pub PreQueryOpen: PFS_FILTER_CALLBACK,
//     pub PostQueryOpen: PFS_FILTER_COMPLETION_CALLBACK,
// }

// UNSUPPORTED Rust 3013:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FS_FILTER_CALLBACK_DATA {
//     pub SizeOfFsFilterCallbackData: u32,
//     pub Operation: u8,
//     pub Reserved: u8,
//     pub DeviceObject: *mut super::super::Foundation::DEVICE_OBJECT,
//     pub FileObject: *mut super::super::Foundation::FILE_OBJECT,
//     pub Parameters: FS_FILTER_PARAMETERS,
// }

// UNSUPPORTED Rust 3024:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FS_FILTER_CALLBACK_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3030:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub union FS_FILTER_PARAMETERS {
//     pub AcquireForModifiedPageWriter: FS_FILTER_PARAMETERS_0,
//     pub ReleaseForModifiedPageWriter: FS_FILTER_PARAMETERS_1,
//     pub AcquireForSectionSynchronization: FS_FILTER_PARAMETERS_2,
//     pub QueryOpen: FS_FILTER_PARAMETERS_3,
//     pub Others: FS_FILTER_PARAMETERS_4,
// }

// UNSUPPORTED Rust 3040:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FS_FILTER_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3046:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FS_FILTER_PARAMETERS_0 {
//     pub EndingOffset: *mut i64,
//     pub ResourceToRelease: *mut *mut super::super::Foundation::ERESOURCE,
// }

// UNSUPPORTED Rust 3053:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FS_FILTER_PARAMETERS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3059:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FS_FILTER_PARAMETERS_2 {
//     pub SyncType: FS_FILTER_SECTION_SYNC_TYPE,
//     pub PageProtection: u32,
//     pub OutputInformation: *mut FS_FILTER_SECTION_SYNC_OUTPUT,
//     pub Flags: u32,
//     pub AllocationAttributes: u32,
// }

// UNSUPPORTED Rust 3069:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FS_FILTER_PARAMETERS_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3075:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FS_FILTER_PARAMETERS_4 {
//     pub Argument1: *mut core::ffi::c_void,
//     pub Argument2: *mut core::ffi::c_void,
//     pub Argument3: *mut core::ffi::c_void,
//     pub Argument4: *mut core::ffi::c_void,
//     pub Argument5: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 3085:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FS_FILTER_PARAMETERS_4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3091:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FS_FILTER_PARAMETERS_3 {
//     pub Irp: *mut super::super::Foundation::IRP,
//     pub FileInformation: *mut core::ffi::c_void,
//     pub Length: *mut u32,
//     pub FileInformationClass: FILE_INFORMATION_CLASS,
//     pub CompletionStatus: super::super::super::Win32::Foundation::NTSTATUS,
// }

// UNSUPPORTED Rust 3101:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FS_FILTER_PARAMETERS_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3107:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct FS_FILTER_PARAMETERS_1 {
//     pub ResourceToRelease: *mut super::super::Foundation::ERESOURCE,
// }

// UNSUPPORTED Rust 3113:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for FS_FILTER_PARAMETERS_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FS_FILTER_QUERY_OPEN`: UShort = 65529u;
public const val `FS_FILTER_RELEASE_FOR_CC_FLUSH`: UShort = 65530u;
public const val `FS_FILTER_RELEASE_FOR_MOD_WRITE`: UShort = 65532u;
public const val `FS_FILTER_RELEASE_FOR_SECTION_SYNCHRONIZATION`: UShort = 65534u;
public const val `FS_FILTER_SECTION_SYNC_IMAGE_EXTENTS_ARE_NOT_RVA`: UInt = 8u;
public const val `FS_FILTER_SECTION_SYNC_IN_FLAG_DONT_UPDATE_LAST_ACCESS`: UInt = 1u;
public const val `FS_FILTER_SECTION_SYNC_IN_FLAG_DONT_UPDATE_LAST_WRITE`: UInt = 2u;
// UNSUPPORTED Rust 3126:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FS_FILTER_SECTION_SYNC_OUTPUT {
//     pub StructureSize: u32,
//     pub SizeReturned: u32,
//     pub Flags: u32,
//     pub DesiredReadAlignment: u32,
// }

public const val `FS_FILTER_SECTION_SYNC_SUPPORTS_ASYNC_PARALLEL_IO`: UInt = 1u;
public const val `FS_FILTER_SECTION_SYNC_SUPPORTS_DIRECT_MAP_DATA`: UInt = 2u;
public const val `FS_FILTER_SECTION_SYNC_SUPPORTS_DIRECT_MAP_IMAGE`: UInt = 4u;
public typealias `FS_FILTER_SECTION_SYNC_TYPE` = Int;
public typealias `FS_FILTER_STREAM_FO_NOTIFICATION_TYPE` = Int;
public typealias `FS_INFORMATION_CLASS` = Int;
public const val `FastIoIsNotPossible`: `FAST_IO_POSSIBLE` = 0;
public const val `FastIoIsPossible`: `FAST_IO_POSSIBLE` = 1;
public const val `FastIoIsQuestionable`: `FAST_IO_POSSIBLE` = 2;
public const val `FileAccessInformation`: `FILE_INFORMATION_CLASS` = 8;
public const val `FileAlignmentInformation`: `FILE_INFORMATION_CLASS` = 17;
public const val `FileAllInformation`: `FILE_INFORMATION_CLASS` = 18;
public const val `FileAllocationInformation`: `FILE_INFORMATION_CLASS` = 19;
public const val `FileAlternateNameInformation`: `FILE_INFORMATION_CLASS` = 21;
public const val `FileAttributeTagInformation`: `FILE_INFORMATION_CLASS` = 35;
public const val `FileBasicInformation`: `FILE_INFORMATION_CLASS` = 4;
public const val `FileBothDirectoryInformation`: `FILE_INFORMATION_CLASS` = 3;
public const val `FileCaseSensitiveInformation`: `FILE_INFORMATION_CLASS` = 71;
public const val `FileCaseSensitiveInformationForceAccessCheck`: `FILE_INFORMATION_CLASS` = 75;
public const val `FileCompletionInformation`: `FILE_INFORMATION_CLASS` = 30;
public const val `FileCompressionInformation`: `FILE_INFORMATION_CLASS` = 28;
public const val `FileDesiredStorageClassInformation`: `FILE_INFORMATION_CLASS` = 67;
public const val `FileDirectoryInformation`: `FILE_INFORMATION_CLASS` = 1;
public const val `FileDispositionInformation`: `FILE_INFORMATION_CLASS` = 13;
public const val `FileDispositionInformationEx`: `FILE_INFORMATION_CLASS` = 64;
public const val `FileEaInformation`: `FILE_INFORMATION_CLASS` = 7;
public const val `FileEndOfFileInformation`: `FILE_INFORMATION_CLASS` = 20;
public const val `FileFsAttributeInformation`: `FS_INFORMATION_CLASS` = 5;
public const val `FileFsControlInformation`: `FS_INFORMATION_CLASS` = 6;
public const val `FileFsDataCopyInformation`: `FS_INFORMATION_CLASS` = 12;
public const val `FileFsDeviceInformation`: `FS_INFORMATION_CLASS` = 4;
public const val `FileFsDriverPathInformation`: `FS_INFORMATION_CLASS` = 9;
public const val `FileFsFullSizeInformation`: `FS_INFORMATION_CLASS` = 7;
public const val `FileFsFullSizeInformationEx`: `FS_INFORMATION_CLASS` = 14;
public const val `FileFsLabelInformation`: `FS_INFORMATION_CLASS` = 2;
public const val `FileFsMaximumInformation`: `FS_INFORMATION_CLASS` = 15;
public const val `FileFsMetadataSizeInformation`: `FS_INFORMATION_CLASS` = 13;
public const val `FileFsObjectIdInformation`: `FS_INFORMATION_CLASS` = 8;
public const val `FileFsSectorSizeInformation`: `FS_INFORMATION_CLASS` = 11;
public const val `FileFsSizeInformation`: `FS_INFORMATION_CLASS` = 3;
public const val `FileFsVolumeFlagsInformation`: `FS_INFORMATION_CLASS` = 10;
public const val `FileFsVolumeInformation`: `FS_INFORMATION_CLASS` = 1;
public const val `FileFullDirectoryInformation`: `FILE_INFORMATION_CLASS` = 2;
public const val `FileFullEaInformation`: `FILE_INFORMATION_CLASS` = 15;
public const val `FileHardLinkFullIdInformation`: `FILE_INFORMATION_CLASS` = 62;
public const val `FileHardLinkInformation`: `FILE_INFORMATION_CLASS` = 46;
public const val `FileIdBothDirectoryInformation`: `FILE_INFORMATION_CLASS` = 37;
public const val `FileIdExtdBothDirectoryInformation`: `FILE_INFORMATION_CLASS` = 63;
public const val `FileIdExtdDirectoryInformation`: `FILE_INFORMATION_CLASS` = 60;
public const val `FileIdFullDirectoryInformation`: `FILE_INFORMATION_CLASS` = 38;
public const val `FileIdGlobalTxDirectoryInformation`: `FILE_INFORMATION_CLASS` = 50;
public const val `FileIdInformation`: `FILE_INFORMATION_CLASS` = 59;
public const val `FileInternalInformation`: `FILE_INFORMATION_CLASS` = 6;
public const val `FileIoCompletionNotificationInformation`: `FILE_INFORMATION_CLASS` = 41;
public const val `FileIoPriorityHintInformation`: `FILE_INFORMATION_CLASS` = 43;
public const val `FileIoStatusBlockRangeInformation`: `FILE_INFORMATION_CLASS` = 42;
public const val `FileIsRemoteDeviceInformation`: `FILE_INFORMATION_CLASS` = 51;
public const val `FileKnownFolderInformation`: `FILE_INFORMATION_CLASS` = 76;
public const val `FileLinkInformation`: `FILE_INFORMATION_CLASS` = 11;
public const val `FileLinkInformationBypassAccessCheck`: `FILE_INFORMATION_CLASS` = 57;
public const val `FileLinkInformationEx`: `FILE_INFORMATION_CLASS` = 72;
public const val `FileLinkInformationExBypassAccessCheck`: `FILE_INFORMATION_CLASS` = 73;
public const val `FileMailslotQueryInformation`: `FILE_INFORMATION_CLASS` = 26;
public const val `FileMailslotSetInformation`: `FILE_INFORMATION_CLASS` = 27;
public const val `FileMaximumInformation`: `FILE_INFORMATION_CLASS` = 77;
public const val `FileMemoryPartitionInformation`: `FILE_INFORMATION_CLASS` = 69;
public const val `FileModeInformation`: `FILE_INFORMATION_CLASS` = 16;
public const val `FileMoveClusterInformation`: `FILE_INFORMATION_CLASS` = 31;
public const val `FileNameInformation`: `FILE_INFORMATION_CLASS` = 9;
public const val `FileNamesInformation`: `FILE_INFORMATION_CLASS` = 12;
public const val `FileNetworkOpenInformation`: `FILE_INFORMATION_CLASS` = 34;
public const val `FileNetworkPhysicalNameInformation`: `FILE_INFORMATION_CLASS` = 49;
public const val `FileNormalizedNameInformation`: `FILE_INFORMATION_CLASS` = 48;
public const val `FileNumaNodeInformation`: `FILE_INFORMATION_CLASS` = 53;
public const val `FileObjectIdInformation`: `FILE_INFORMATION_CLASS` = 29;
public const val `FilePipeInformation`: `FILE_INFORMATION_CLASS` = 23;
public const val `FilePipeLocalInformation`: `FILE_INFORMATION_CLASS` = 24;
public const val `FilePipeRemoteInformation`: `FILE_INFORMATION_CLASS` = 25;
public const val `FilePositionInformation`: `FILE_INFORMATION_CLASS` = 14;
public const val `FileProcessIdsUsingFileInformation`: `FILE_INFORMATION_CLASS` = 47;
public const val `FileQuotaInformation`: `FILE_INFORMATION_CLASS` = 32;
public const val `FileRemoteProtocolInformation`: `FILE_INFORMATION_CLASS` = 55;
public const val `FileRenameInformation`: `FILE_INFORMATION_CLASS` = 10;
public const val `FileRenameInformationBypassAccessCheck`: `FILE_INFORMATION_CLASS` = 56;
public const val `FileRenameInformationEx`: `FILE_INFORMATION_CLASS` = 65;
public const val `FileRenameInformationExBypassAccessCheck`: `FILE_INFORMATION_CLASS` = 66;
public const val `FileReparsePointInformation`: `FILE_INFORMATION_CLASS` = 33;
public const val `FileReplaceCompletionInformation`: `FILE_INFORMATION_CLASS` = 61;
public const val `FileSfioReserveInformation`: `FILE_INFORMATION_CLASS` = 44;
public const val `FileSfioVolumeInformation`: `FILE_INFORMATION_CLASS` = 45;
public const val `FileShortNameInformation`: `FILE_INFORMATION_CLASS` = 40;
public const val `FileStandardInformation`: `FILE_INFORMATION_CLASS` = 5;
public const val `FileStandardLinkInformation`: `FILE_INFORMATION_CLASS` = 54;
public const val `FileStatInformation`: `FILE_INFORMATION_CLASS` = 68;
public const val `FileStatLxInformation`: `FILE_INFORMATION_CLASS` = 70;
public const val `FileStorageReserveIdInformation`: `FILE_INFORMATION_CLASS` = 74;
public const val `FileStreamInformation`: `FILE_INFORMATION_CLASS` = 22;
public const val `FileTrackingInformation`: `FILE_INFORMATION_CLASS` = 36;
public const val `FileUnusedInformation`: `FILE_INFORMATION_CLASS` = 52;
public const val `FileValidDataLengthInformation`: `FILE_INFORMATION_CLASS` = 39;
public const val `FileVolumeNameInformation`: `FILE_INFORMATION_CLASS` = 58;
public const val `GCR_ALLOW_LM`: UInt = 4096u;
public const val `GCR_ALLOW_NO_TARGET`: UInt = 8192u;
public const val `GCR_ALLOW_NTLM`: UInt = 256u;
public const val `GCR_MACHINE_CREDENTIAL`: UInt = 1024u;
public const val `GCR_NTLM3_PARMS`: UInt = 32u;
public const val `GCR_TARGET_INFO`: UInt = 64u;
public const val `GCR_USE_OEM_SET`: UInt = 512u;
public const val `GCR_USE_OWF_PASSWORD`: UInt = 2048u;
public const val `GCR_VSM_PROTECTED_PASSWORD`: UInt = 16384u;
public const val `GENERATE_CLIENT_CHALLENGE`: UInt = 16u;
// UNSUPPORTED Rust 3245:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GENERATE_NAME_CONTEXT {
//     pub Checksum: u16,
//     pub ChecksumInserted: bool,
//     pub NameLength: u8,
//     pub NameBuffer: [u16; 8],
//     pub ExtensionLength: u32,
//     pub ExtensionBuffer: [u16; 4],
//     pub LastIndexValue: u32,
// }

// UNSUPPORTED Rust 3256:1: declaration Impl has no candidate rule
// impl Default for GENERATE_NAME_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3261:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GHOSTED_FILE_EXTENT {
//     pub FileOffset: i64,
//     pub ByteCount: i64,
//     pub RecallOwnerGuid: windows_sys::core::GUID,
//     pub NextEntryOffset: u32,
//     pub RecallMetadataBufferSize: u32,
//     pub RecallMetadataBuffer: [u8; 1],
// }

// UNSUPPORTED Rust 3271:1: declaration Impl has no candidate rule
// impl Default for GHOSTED_FILE_EXTENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3276:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_ECP_ATOMIC_CREATE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4720bd83_52ac_4104_a130_d1ec6a8cc8e5);

// UNSUPPORTED Rust 3277:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_ECP_CLOUDFILES_ATTRIBUTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2932ff52_8378_4fc1_8edb_6bdc8f602709);

// UNSUPPORTED Rust 3278:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_ECP_CREATE_REDIRECTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x188d6bd6_a126_4fa8_bdf2_1ccdf896f3e0);

// UNSUPPORTED Rust 3279:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_ECP_CSV_DOWN_LEVEL_OPEN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4248be44_647f_488f_8be5_a08aaf70f028);

// UNSUPPORTED Rust 3280:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_ECP_CSV_QUERY_FILE_REVISION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x44aec90b_de65_4d46_8fbf_763f9d970b1d);

// UNSUPPORTED Rust 3281:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_ECP_CSV_QUERY_FILE_REVISION_FILE_ID_128: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7a3a4aa1_aa74_4bc6_b070_ab56a38c1fed);

// UNSUPPORTED Rust 3282:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_ECP_CSV_SET_HANDLE_PROPERTIES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7a9fdd94_7b58_42bb_9740_3cb86983a615);

// UNSUPPORTED Rust 3283:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_ECP_DUAL_OPLOCK_KEY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x41621a14_b08b_4df1_b676_a05ffdf01bea);

// UNSUPPORTED Rust 3284:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_ECP_IO_DEVICE_HINT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf315b732_ac6b_4d4d_be0c_b3126490e1a3);

// UNSUPPORTED Rust 3285:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_ECP_NETWORK_APP_INSTANCE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6aa6bc45_a7ef_4af7_9008_fa462e144d74);

// UNSUPPORTED Rust 3286:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_ECP_NETWORK_APP_INSTANCE_VERSION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb7d082b9_563b_4f07_a07b_524a8116a010);

// UNSUPPORTED Rust 3287:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_ECP_NETWORK_OPEN_CONTEXT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc584edbf_00df_4d28_b884_35baca8911e8);

// UNSUPPORTED Rust 3288:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_ECP_NFS_OPEN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf326d30c_e5f8_4fe7_ab74_f5a3196d92db);

// UNSUPPORTED Rust 3289:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_ECP_OPEN_PARAMETERS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcd0a93c3_3bb7_463d_accb_969d3435a5a5);

// UNSUPPORTED Rust 3290:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_ECP_OPLOCK_KEY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x48850596_3050_4be7_9863_fec350ce8d7f);

// UNSUPPORTED Rust 3291:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_ECP_PREFETCH_OPEN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe1777b21_847e_4837_aa45_64161d280655);

// UNSUPPORTED Rust 3292:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_ECP_QUERY_ON_CREATE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1aca62e9_abb4_4ff2_bb5c_1c79025e417f);

// UNSUPPORTED Rust 3293:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_ECP_RKF_BYPASS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x02378cc6_f73c_489c_8282_564d1a99131b);

// UNSUPPORTED Rust 3294:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_ECP_SRV_OPEN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbebfaebc_aabf_489d_9d2c_e9e361102853);

public const val `GreaterThan`: `FSRTL_COMPARISON_RESULT` = 1;
public const val `HEAP_CLASS_0`: UInt = 0u;
public const val `HEAP_CLASS_1`: UInt = 4096u;
public const val `HEAP_CLASS_2`: UInt = 8192u;
public const val `HEAP_CLASS_3`: UInt = 12288u;
public const val `HEAP_CLASS_4`: UInt = 16384u;
public const val `HEAP_CLASS_5`: UInt = 20480u;
public const val `HEAP_CLASS_6`: UInt = 24576u;
public const val `HEAP_CLASS_7`: UInt = 28672u;
public const val `HEAP_CLASS_8`: UInt = 32768u;
public const val `HEAP_CLASS_MASK`: UInt = 61440u;
public const val `HEAP_CREATE_ALIGN_16`: UInt = 65536u;
public const val `HEAP_CREATE_ENABLE_EXECUTE`: UInt = 262144u;
public const val `HEAP_CREATE_ENABLE_TRACING`: UInt = 131072u;
public const val `HEAP_CREATE_HARDENED`: UInt = 512u;
public const val `HEAP_CREATE_SEGMENT_HEAP`: UInt = 256u;
public const val `HEAP_DISABLE_COALESCE_ON_FREE`: UInt = 128u;
public const val `HEAP_FREE_CHECKING_ENABLED`: UInt = 64u;
public const val `HEAP_GENERATE_EXCEPTIONS`: UInt = 4u;
public const val `HEAP_GLOBAL_TAG`: UInt = 2048u;
public const val `HEAP_GROWABLE`: UInt = 2u;
public const val `HEAP_MAXIMUM_TAG`: UInt = 4095u;
public typealias `HEAP_MEMORY_INFO_CLASS` = Int;
public const val `HEAP_NO_SERIALIZE`: UInt = 1u;
public const val `HEAP_PSEUDO_TAG_FLAG`: UInt = 32768u;
public const val `HEAP_REALLOC_IN_PLACE_ONLY`: UInt = 16u;
public const val `HEAP_SETTABLE_USER_FLAG1`: UInt = 512u;
public const val `HEAP_SETTABLE_USER_FLAG2`: UInt = 1024u;
public const val `HEAP_SETTABLE_USER_FLAG3`: UInt = 2048u;
public const val `HEAP_SETTABLE_USER_FLAGS`: UInt = 3584u;
public const val `HEAP_SETTABLE_USER_VALUE`: UInt = 256u;
public const val `HEAP_TAG_SHIFT`: UInt = 18u;
public const val `HEAP_TAIL_CHECKING_ENABLED`: UInt = 32u;
public const val `HEAP_ZERO_MEMORY`: UInt = 8u;
public const val `HeapMemoryBasicInformation`: `HEAP_MEMORY_INFO_CLASS` = 0;
public const val `INVALID_PROCESSOR_INDEX`: UInt = 4294967295u;
public const val `IOCTL_LMR_ARE_FILE_OBJECTS_ON_SAME_SERVER`: UInt = 1310960u;
public const val `IOCTL_REDIR_QUERY_PATH`: UInt = 1311119u;
public const val `IOCTL_REDIR_QUERY_PATH_EX`: UInt = 1311123u;
public const val `IOCTL_VOLSNAP_FLUSH_AND_HOLD_WRITES`: UInt = 5488640u;
public const val `IO_CD_ROM_INCREMENT`: UInt = 1u;
public const val `IO_CREATE_STREAM_FILE_LITE`: UInt = 2u;
// UNSUPPORTED Rust 3337:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct IO_CREATE_STREAM_FILE_OPTIONS {
//     pub Size: u16,
//     pub Flags: u16,
//     pub TargetDeviceObject: *mut super::super::Foundation::DEVICE_OBJECT,
// }

// UNSUPPORTED Rust 3345:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IO_CREATE_STREAM_FILE_OPTIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IO_CREATE_STREAM_FILE_RAISE_ON_ERROR`: UInt = 1u;
// UNSUPPORTED Rust 3352:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct IO_DEVICE_HINT_ECP_CONTEXT {
//     pub TargetDevice: *mut super::super::Foundation::DEVICE_OBJECT,
//     pub RemainingName: super::super::super::Win32::Foundation::UNICODE_STRING,
// }

// UNSUPPORTED Rust 3359:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for IO_DEVICE_HINT_ECP_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IO_DISK_INCREMENT`: UInt = 1u;
public const val `IO_FILE_OBJECT_NON_PAGED_POOL_CHARGE`: UInt = 64u;
public const val `IO_FILE_OBJECT_PAGED_POOL_CHARGE`: UInt = 1024u;
public const val `IO_IGNORE_READONLY_ATTRIBUTE`: UInt = 64u;
public const val `IO_MAILSLOT_INCREMENT`: UInt = 2u;
public const val `IO_MM_PAGING_FILE`: UInt = 16u;
public const val `IO_NAMED_PIPE_INCREMENT`: UInt = 2u;
public const val `IO_NETWORK_INCREMENT`: UInt = 2u;
public const val `IO_NO_INCREMENT`: UInt = 0u;
public const val `IO_OPEN_PAGING_FILE`: UInt = 2u;
public const val `IO_OPEN_TARGET_DIRECTORY`: UInt = 4u;
// UNSUPPORTED Rust 3376:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Wdk_Foundation")]
// #[derive(Clone, Copy, Default)]
// pub struct IO_PRIORITY_INFO {
//     pub Size: u32,
//     pub ThreadPriority: u32,
//     pub PagePriority: u32,
//     pub IoPriority: super::super::Foundation::IO_PRIORITY_HINT,
// }

public const val `IO_REPARSE_TAG_ACRONIS_HSM_0`: Int = 96;
public const val `IO_REPARSE_TAG_ACRONIS_HSM_1`: Int = 97;
public const val `IO_REPARSE_TAG_ACRONIS_HSM_2`: Int = 98;
public const val `IO_REPARSE_TAG_ACRONIS_HSM_3`: Int = 99;
public const val `IO_REPARSE_TAG_ACRONIS_HSM_4`: Int = 100;
public const val `IO_REPARSE_TAG_ACRONIS_HSM_5`: Int = 101;
public const val `IO_REPARSE_TAG_ACRONIS_HSM_6`: Int = 102;
public const val `IO_REPARSE_TAG_ACRONIS_HSM_7`: Int = 103;
public const val `IO_REPARSE_TAG_ACRONIS_HSM_8`: Int = 104;
public const val `IO_REPARSE_TAG_ACRONIS_HSM_9`: Int = 105;
public const val `IO_REPARSE_TAG_ACRONIS_HSM_A`: Int = 106;
public const val `IO_REPARSE_TAG_ACRONIS_HSM_B`: Int = 107;
public const val `IO_REPARSE_TAG_ACRONIS_HSM_C`: Int = 108;
public const val `IO_REPARSE_TAG_ACRONIS_HSM_D`: Int = 109;
public const val `IO_REPARSE_TAG_ACRONIS_HSM_E`: Int = 110;
public const val `IO_REPARSE_TAG_ACRONIS_HSM_F`: Int = 111;
public const val `IO_REPARSE_TAG_ACTIVISION_HSM`: Int = 71;
public const val `IO_REPARSE_TAG_ADA_HSM`: Int = 38;
public const val `IO_REPARSE_TAG_ADOBE_HSM`: Int = 69;
public const val `IO_REPARSE_TAG_ALERTBOOT`: Int = 536870988;
public const val `IO_REPARSE_TAG_ALTIRIS_HSM`: Int = 25;
public const val `IO_REPARSE_TAG_APPXSTRM`: Int = -1073741804;
public const val `IO_REPARSE_TAG_ARCO_BACKUP`: Int = 59;
public const val `IO_REPARSE_TAG_ARKIVIO`: Int = 12;
public const val `IO_REPARSE_TAG_AURISTOR_FS`: Int = 73;
public const val `IO_REPARSE_TAG_AUTN_HSM`: Int = 39;
public const val `IO_REPARSE_TAG_BRIDGEHEAD_HSM`: Int = 22;
public const val `IO_REPARSE_TAG_C2CSYSTEMS_HSM`: Int = 49;
public const val `IO_REPARSE_TAG_CARINGO_HSM`: Int = 52;
public const val `IO_REPARSE_TAG_CARROLL_HSM`: Int = 60;
public const val `IO_REPARSE_TAG_CITRIX_PM`: Int = 54;
public const val `IO_REPARSE_TAG_COMMVAULT`: Int = 14;
public const val `IO_REPARSE_TAG_COMMVAULT_HSM`: Int = 29;
public const val `IO_REPARSE_TAG_COMTRADE_HSM`: Int = 61;
public const val `IO_REPARSE_TAG_CTERA_HSM`: Int = 78;
public const val `IO_REPARSE_TAG_DATAFIRST_HSM`: Int = 48;
public const val `IO_REPARSE_TAG_DATAGLOBAL_HSM`: Int = 46;
public const val `IO_REPARSE_TAG_DATASTOR_SIS`: Int = 30;
public const val `IO_REPARSE_TAG_DFM`: Int = -2147483626;
public const val `IO_REPARSE_TAG_DOR_HSM`: Int = 82;
public const val `IO_REPARSE_TAG_DOUBLE_TAKE_HSM`: Int = 34;
public const val `IO_REPARSE_TAG_DOUBLE_TAKE_SIS`: Int = 41;
public const val `IO_REPARSE_TAG_DRIVE_EXTENDER`: Int = -2147483643;
public const val `IO_REPARSE_TAG_DROPBOX_HSM`: Int = 68;
public const val `IO_REPARSE_TAG_EASEFILTER_HSM`: Int = 87;
public const val `IO_REPARSE_TAG_EASEVAULT_HSM`: Int = 62;
public const val `IO_REPARSE_TAG_EDSI_HSM`: Int = 31;
public const val `IO_REPARSE_TAG_ELTAN_HSM`: Int = 43;
public const val `IO_REPARSE_TAG_EMC_HSM`: Int = 57;
public const val `IO_REPARSE_TAG_ENIGMA_HSM`: Int = 17;
public const val `IO_REPARSE_TAG_FILTER_MANAGER`: Int = -2147483637;
public const val `IO_REPARSE_TAG_GLOBAL360_HSM`: Int = 24;
public const val `IO_REPARSE_TAG_GOOGLE_HSM`: Int = 65;
public const val `IO_REPARSE_TAG_GRAU_DATASTORAGE_HSM`: Int = 28;
public const val `IO_REPARSE_TAG_HDS_HCP_HSM`: Int = 72;
public const val `IO_REPARSE_TAG_HDS_HSM`: Int = 63;
public const val `IO_REPARSE_TAG_HERMES_HSM`: Int = 26;
public const val `IO_REPARSE_TAG_HP_BACKUP`: Int = 67;
public const val `IO_REPARSE_TAG_HP_DATA_PROTECT`: Int = 70;
public const val `IO_REPARSE_TAG_HP_HSM`: Int = 32;
public const val `IO_REPARSE_TAG_HSAG_HSM`: Int = 37;
public const val `IO_REPARSE_TAG_HUBSTOR_HSM`: Int = 85;
public const val `IO_REPARSE_TAG_IFSTEST_CONGRUENT`: Int = 9;
public const val `IO_REPARSE_TAG_IIS_CACHE`: Int = -1610612720;
public const val `IO_REPARSE_TAG_IMANAGE_HSM`: Int = 536870998;
public const val `IO_REPARSE_TAG_INTERCOPE_HSM`: Int = 19;
public const val `IO_REPARSE_TAG_ITSTATION`: Int = 74;
public const val `IO_REPARSE_TAG_KOM_NETWORKS_HSM`: Int = 20;
public const val `IO_REPARSE_TAG_LX_BLK`: Int = -2147483610;
public const val `IO_REPARSE_TAG_LX_CHR`: Int = -2147483611;
public const val `IO_REPARSE_TAG_LX_FIFO`: Int = -2147483612;
public const val `IO_REPARSE_TAG_LX_SYMLINK`: Int = -1610612707;
public const val `IO_REPARSE_TAG_MAGINATICS_RDR`: Int = 64;
public const val `IO_REPARSE_TAG_MAXISCALE_HSM`: Int = 536870965;
public const val `IO_REPARSE_TAG_MEMORY_TECH_HSM`: Int = 21;
public const val `IO_REPARSE_TAG_MIMOSA_HSM`: Int = 36;
public const val `IO_REPARSE_TAG_MOONWALK_HSM`: Int = 10;
public const val `IO_REPARSE_TAG_MTALOS`: Int = 77;
public const val `IO_REPARSE_TAG_NEUSHIELD`: Int = 81;
public const val `IO_REPARSE_TAG_NEXSAN_HSM`: Int = 40;
public const val `IO_REPARSE_TAG_NIPPON_HSM`: Int = 79;
public const val `IO_REPARSE_TAG_NVIDIA_UNIONFS`: Int = 536870996;
public const val `IO_REPARSE_TAG_OPENAFS_DFS`: Int = 55;
public const val `IO_REPARSE_TAG_OSR_SAMPLE`: Int = 536870935;
public const val `IO_REPARSE_TAG_OVERTONE`: Int = 15;
public const val `IO_REPARSE_TAG_POINTSOFT_HSM`: Int = 27;
public const val `IO_REPARSE_TAG_QI_TECH_HSM`: Int = 536870959;
public const val `IO_REPARSE_TAG_QUADDRA_HSM`: Int = 66;
public const val `IO_REPARSE_TAG_QUEST_HSM`: Int = 45;
public const val `IO_REPARSE_TAG_REDSTOR_HSM`: Int = 80;
public const val `IO_REPARSE_TAG_RIVERBED_HSM`: Int = 51;
public const val `IO_REPARSE_TAG_SER_HSM`: Int = 33;
public const val `IO_REPARSE_TAG_SHX_BACKUP`: Int = 83;
public const val `IO_REPARSE_TAG_SOLUTIONSOFT`: Int = 536870925;
public const val `IO_REPARSE_TAG_SONY_HSM`: Int = 42;
public const val `IO_REPARSE_TAG_SPHARSOFT`: Int = 75;
public const val `IO_REPARSE_TAG_SYMANTEC_HSM`: Int = 18;
public const val `IO_REPARSE_TAG_SYMANTEC_HSM2`: Int = 16;
public const val `IO_REPARSE_TAG_TSINGHUA_UNIVERSITY_RESEARCH`: Int = 11;
public const val `IO_REPARSE_TAG_UTIXO_HSM`: Int = 44;
public const val `IO_REPARSE_TAG_VALID_VALUES`: UInt = 4026597375u;
public const val `IO_REPARSE_TAG_VMWARE_PM`: Int = 58;
public const val `IO_REPARSE_TAG_WATERFORD`: Int = 50;
public const val `IO_REPARSE_TAG_WISDATA_HSM`: Int = 35;
public const val `IO_REPARSE_TAG_ZLTI_HSM`: Int = 56;
public const val `IO_STOP_ON_SYMLINK`: UInt = 8u;
// UNSUPPORTED Rust 3491:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IO_STOP_ON_SYMLINK_FILTER_ECP_v0 {
//     pub Out: IO_STOP_ON_SYMLINK_FILTER_ECP_v0_0,
// }

// UNSUPPORTED Rust 3496:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IO_STOP_ON_SYMLINK_FILTER_ECP_v0_0 {
//     pub ReparseCount: u32,
//     pub RemainingPathLength: u32,
// }

// UNSUPPORTED Rust 3502:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub struct KAPC_STATE {
//     pub ApcListHead: [super::super::super::Win32::System::Kernel::LIST_ENTRY; 2],
//     pub Process: *mut isize,
//     pub Anonymous1: KAPC_STATE_0,
//     pub KernelApcPending: bool,
//     pub Anonymous2: KAPC_STATE_1,
// }

// UNSUPPORTED Rust 3512:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for KAPC_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3518:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub union KAPC_STATE_0 {
//     pub InProgressFlags: u8,
//     pub Anonymous: KAPC_STATE_0_0,
// }

// UNSUPPORTED Rust 3525:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for KAPC_STATE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3531:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy, Default)]
// pub struct KAPC_STATE_0_0 {
//     pub _bitfield: u8,
// }

// UNSUPPORTED Rust 3537:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub union KAPC_STATE_1 {
//     pub UserApcPendingAll: bool,
//     pub Anonymous: KAPC_STATE_1_0,
// }

// UNSUPPORTED Rust 3544:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for KAPC_STATE_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3550:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy, Default)]
// pub struct KAPC_STATE_1_0 {
//     pub _bitfield: u8,
// }

public const val `KnownFolderDesktop`: `FILE_KNOWN_FOLDER_TYPE` = 1;
public const val `KnownFolderDocuments`: `FILE_KNOWN_FOLDER_TYPE` = 2;
public const val `KnownFolderDownloads`: `FILE_KNOWN_FOLDER_TYPE` = 3;
public const val `KnownFolderMax`: `FILE_KNOWN_FOLDER_TYPE` = 7;
public const val `KnownFolderMusic`: `FILE_KNOWN_FOLDER_TYPE` = 4;
public const val `KnownFolderNone`: `FILE_KNOWN_FOLDER_TYPE` = 0;
public const val `KnownFolderOther`: `FILE_KNOWN_FOLDER_TYPE` = 7;
public const val `KnownFolderPictures`: `FILE_KNOWN_FOLDER_TYPE` = 5;
public const val `KnownFolderVideos`: `FILE_KNOWN_FOLDER_TYPE` = 6;
// UNSUPPORTED Rust 3565:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// #[derive(Clone, Copy)]
// pub struct LARGE_MCB {
//     pub GuardedMutex: *mut super::super::Foundation::FAST_MUTEX,
//     pub BaseMcb: BASE_MCB,
// }

// UNSUPPORTED Rust 3572:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// impl Default for LARGE_MCB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LCN_CHECKSUM_VALID`: `_LCN_WEAK_REFERENCE_STATE` = 2;
// UNSUPPORTED Rust 3579:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct LCN_WEAK_REFERENCE_BUFFER {
//     pub Lcn: i64,
//     pub LengthInClusters: i64,
//     pub ReferenceCount: u32,
//     pub State: u16,
// }

// UNSUPPORTED Rust 3587:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct LCN_WEAK_REFERENCE_CREATE_INPUT_BUFFER {
//     pub Offset: i64,
//     pub Length: i64,
//     pub Flags: u32,
//     pub Reserved: u32,
// }

public const val `LCN_WEAK_REFERENCE_VALID`: `_LCN_WEAK_REFERENCE_STATE` = 1;
// UNSUPPORTED Rust 3596:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LINK_TRACKING_INFORMATION {
//     pub Type: LINK_TRACKING_INFORMATION_TYPE,
//     pub VolumeId: [u8; 16],
// }

// UNSUPPORTED Rust 3602:1: declaration Impl has no candidate rule
// impl Default for LINK_TRACKING_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `LINK_TRACKING_INFORMATION_TYPE` = Int;
public const val `LX_FILE_CASE_SENSITIVE_DIR`: UInt = 16u;
// UNSUPPORTED Rust 3609:1: non-scalar type Ptr unsupported
// pub const LX_FILE_METADATA_DEVICE_ID_EA_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("$LXDEV");

// UNSUPPORTED Rust 3610:1: non-scalar type Ptr unsupported
// pub const LX_FILE_METADATA_GID_EA_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("$LXGID");

public const val `LX_FILE_METADATA_HAS_DEVICE_ID`: UInt = 8u;
public const val `LX_FILE_METADATA_HAS_GID`: UInt = 2u;
public const val `LX_FILE_METADATA_HAS_MODE`: UInt = 4u;
public const val `LX_FILE_METADATA_HAS_UID`: UInt = 1u;
// UNSUPPORTED Rust 3615:1: non-scalar type Ptr unsupported
// pub const LX_FILE_METADATA_MODE_EA_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("$LXMOD");

// UNSUPPORTED Rust 3616:1: non-scalar type Ptr unsupported
// pub const LX_FILE_METADATA_UID_EA_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("$LXUID");

public const val `LessThan`: `FSRTL_COMPARISON_RESULT` = -1;
public const val `MAP_DISABLE_PAGEFAULT_CLUSTERING`: UInt = 256u;
public const val `MAP_HIGH_PRIORITY`: UInt = 64u;
public const val `MAP_NO_READ`: UInt = 16u;
public const val `MAP_WAIT`: UInt = 1u;
public const val `MAXIMUM_LEADBYTES`: UInt = 12u;
public const val `MAX_UNICODE_STACK_BUFFER_LENGTH`: UInt = 256u;
// UNSUPPORTED Rust 3624:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// #[derive(Clone, Copy, Default)]
// pub struct MCB {
//     pub DummyFieldThatSizesThisStructureCorrectly: LARGE_MCB,
// }

public const val `MCB_FLAG_RAISE_ON_ALLOCATION_FAILURE`: UInt = 1u;
public typealias `MEMORY_INFORMATION_CLASS` = Int;
// UNSUPPORTED Rust 3632:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MEMORY_RANGE_ENTRY {
//     pub VirtualAddress: *mut core::ffi::c_void,
//     pub NumberOfBytes: usize,
// }

// UNSUPPORTED Rust 3638:1: declaration Impl has no candidate rule
// impl Default for MEMORY_RANGE_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3643:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MFT_ENUM_DATA {
//     pub StartFileReferenceNumber: u64,
//     pub LowUsn: i64,
//     pub HighUsn: i64,
//     pub MinMajorVersion: u16,
//     pub MaxMajorVersion: u16,
// }

public typealias `MMFLUSH_TYPE` = Int;
public const val `MM_FORCE_CLOSED_DATA`: UInt = 1u;
public const val `MM_FORCE_CLOSED_IMAGE`: UInt = 2u;
public const val `MM_FORCE_CLOSED_LATER_OK`: UInt = 4u;
public const val `MM_IS_FILE_SECTION_ACTIVE_DATA`: UInt = 2u;
public const val `MM_IS_FILE_SECTION_ACTIVE_IMAGE`: UInt = 1u;
public const val `MM_IS_FILE_SECTION_ACTIVE_USER`: UInt = 4u;
// UNSUPPORTED Rust 3659:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MM_PREFETCH_FLAGS {
//     pub Flags: MM_PREFETCH_FLAGS_0,
//     pub AllFlags: u32,
// }

// UNSUPPORTED Rust 3665:1: declaration Impl has no candidate rule
// impl Default for MM_PREFETCH_FLAGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3670:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MM_PREFETCH_FLAGS_0 {
//     pub _bitfield: u32,
// }

public typealias `MSV1_0_AVID` = Int;
// UNSUPPORTED Rust 3676:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Authentication_Identity")]
// #[derive(Clone, Copy, Default)]
// pub struct MSV1_0_ENUMUSERS_REQUEST {
//     pub MessageType: super::super::super::Win32::Security::Authentication::Identity::MSV1_0_PROTOCOL_MESSAGE_TYPE,
// }

// UNSUPPORTED Rust 3682:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Authentication_Identity")]
// #[derive(Clone, Copy)]
// pub struct MSV1_0_ENUMUSERS_RESPONSE {
//     pub MessageType: super::super::super::Win32::Security::Authentication::Identity::MSV1_0_PROTOCOL_MESSAGE_TYPE,
//     pub NumberOfLoggedOnUsers: u32,
//     pub LogonIds: *mut super::super::super::Win32::Foundation::LUID,
//     pub EnumHandles: *mut u32,
// }

// UNSUPPORTED Rust 3691:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Authentication_Identity")]
// impl Default for MSV1_0_ENUMUSERS_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3697:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Authentication_Identity")]
// #[derive(Clone, Copy)]
// pub struct MSV1_0_GETCHALLENRESP_REQUEST {
//     pub MessageType: super::super::super::Win32::Security::Authentication::Identity::MSV1_0_PROTOCOL_MESSAGE_TYPE,
//     pub ParameterControl: u32,
//     pub LogonId: super::super::super::Win32::Foundation::LUID,
//     pub Password: super::super::super::Win32::Foundation::UNICODE_STRING,
//     pub ChallengeToClient: [u8; 8],
//     pub UserName: super::super::super::Win32::Foundation::UNICODE_STRING,
//     pub LogonDomainName: super::super::super::Win32::Foundation::UNICODE_STRING,
//     pub ServerName: super::super::super::Win32::Foundation::UNICODE_STRING,
// }

// UNSUPPORTED Rust 3710:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Authentication_Identity")]
// impl Default for MSV1_0_GETCHALLENRESP_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3716:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Authentication_Identity")]
// #[derive(Clone, Copy)]
// pub struct MSV1_0_GETCHALLENRESP_REQUEST_V1 {
//     pub MessageType: super::super::super::Win32::Security::Authentication::Identity::MSV1_0_PROTOCOL_MESSAGE_TYPE,
//     pub ParameterControl: u32,
//     pub LogonId: super::super::super::Win32::Foundation::LUID,
//     pub Password: super::super::super::Win32::Foundation::UNICODE_STRING,
//     pub ChallengeToClient: [u8; 8],
// }

// UNSUPPORTED Rust 3726:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Authentication_Identity")]
// impl Default for MSV1_0_GETCHALLENRESP_REQUEST_V1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3732:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Security_Authentication_Identity", feature = "Win32_System_Kernel"))]
// #[derive(Clone, Copy)]
// pub struct MSV1_0_GETCHALLENRESP_RESPONSE {
//     pub MessageType: super::super::super::Win32::Security::Authentication::Identity::MSV1_0_PROTOCOL_MESSAGE_TYPE,
//     pub CaseSensitiveChallengeResponse: super::super::super::Win32::System::Kernel::STRING,
//     pub CaseInsensitiveChallengeResponse: super::super::super::Win32::System::Kernel::STRING,
//     pub UserName: super::super::super::Win32::Foundation::UNICODE_STRING,
//     pub LogonDomainName: super::super::super::Win32::Foundation::UNICODE_STRING,
//     pub UserSessionKey: [u8; 16],
//     pub LanmanSessionKey: [u8; 8],
// }

// UNSUPPORTED Rust 3744:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Security_Authentication_Identity", feature = "Win32_System_Kernel"))]
// impl Default for MSV1_0_GETCHALLENRESP_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3750:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Authentication_Identity")]
// #[derive(Clone, Copy, Default)]
// pub struct MSV1_0_GETUSERINFO_REQUEST {
//     pub MessageType: super::super::super::Win32::Security::Authentication::Identity::MSV1_0_PROTOCOL_MESSAGE_TYPE,
//     pub LogonId: super::super::super::Win32::Foundation::LUID,
// }

// UNSUPPORTED Rust 3757:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Authentication_Identity")]
// #[derive(Clone, Copy)]
// pub struct MSV1_0_GETUSERINFO_RESPONSE {
//     pub MessageType: super::super::super::Win32::Security::Authentication::Identity::MSV1_0_PROTOCOL_MESSAGE_TYPE,
//     pub UserSid: super::super::super::Win32::Security::PSID,
//     pub UserName: super::super::super::Win32::Foundation::UNICODE_STRING,
//     pub LogonDomainName: super::super::super::Win32::Foundation::UNICODE_STRING,
//     pub LogonServer: super::super::super::Win32::Foundation::UNICODE_STRING,
//     pub LogonType: super::super::super::Win32::Security::Authentication::Identity::SECURITY_LOGON_TYPE,
// }

// UNSUPPORTED Rust 3768:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Authentication_Identity")]
// impl Default for MSV1_0_GETUSERINFO_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3774:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Authentication_Identity")]
// #[derive(Clone, Copy, Default)]
// pub struct MSV1_0_LM20_CHALLENGE_REQUEST {
//     pub MessageType: super::super::super::Win32::Security::Authentication::Identity::MSV1_0_PROTOCOL_MESSAGE_TYPE,
// }

// UNSUPPORTED Rust 3780:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Authentication_Identity")]
// #[derive(Clone, Copy)]
// pub struct MSV1_0_LM20_CHALLENGE_RESPONSE {
//     pub MessageType: super::super::super::Win32::Security::Authentication::Identity::MSV1_0_PROTOCOL_MESSAGE_TYPE,
//     pub ChallengeToClient: [u8; 8],
// }

// UNSUPPORTED Rust 3787:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Authentication_Identity")]
// impl Default for MSV1_0_LM20_CHALLENGE_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MemoryBasicInformation`: `MEMORY_INFORMATION_CLASS` = 0;
public const val `MemoryType64KPage`: `RTL_MEMORY_TYPE` = 2;
public const val `MemoryTypeCustom`: `RTL_MEMORY_TYPE` = 5;
public const val `MemoryTypeHugePage`: `RTL_MEMORY_TYPE` = 4;
public const val `MemoryTypeLargePage`: `RTL_MEMORY_TYPE` = 3;
public const val `MemoryTypeMax`: `RTL_MEMORY_TYPE` = 6;
public const val `MemoryTypeNonPaged`: `RTL_MEMORY_TYPE` = 1;
public const val `MemoryTypePaged`: `RTL_MEMORY_TYPE` = 0;
public const val `MmFlushForDelete`: `MMFLUSH_TYPE` = 0;
public const val `MmFlushForWrite`: `MMFLUSH_TYPE` = 1;
public const val `MsvAvChannelBindings`: `MSV1_0_AVID` = 10;
public const val `MsvAvDnsComputerName`: `MSV1_0_AVID` = 3;
public const val `MsvAvDnsDomainName`: `MSV1_0_AVID` = 4;
public const val `MsvAvDnsTreeName`: `MSV1_0_AVID` = 5;
public const val `MsvAvEOL`: `MSV1_0_AVID` = 0;
public const val `MsvAvFlags`: `MSV1_0_AVID` = 6;
public const val `MsvAvNbComputerName`: `MSV1_0_AVID` = 1;
public const val `MsvAvNbDomainName`: `MSV1_0_AVID` = 2;
public const val `MsvAvRestrictions`: `MSV1_0_AVID` = 8;
public const val `MsvAvTargetName`: `MSV1_0_AVID` = 9;
public const val `MsvAvTimestamp`: `MSV1_0_AVID` = 7;
// UNSUPPORTED Rust 3814:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NETWORK_APP_INSTANCE_ECP_CONTEXT {
//     pub Size: u16,
//     pub Reserved: u16,
//     pub AppInstanceID: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 3821:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NETWORK_APP_INSTANCE_VERSION_ECP_CONTEXT {
//     pub Size: u16,
//     pub Reserved: u16,
//     pub VersionHigh: u64,
//     pub VersionLow: u64,
// }

// UNSUPPORTED Rust 3829:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NETWORK_OPEN_ECP_CONTEXT {
//     pub Size: u16,
//     pub Reserved: u16,
//     pub Anonymous: NETWORK_OPEN_ECP_CONTEXT_0,
// }

// UNSUPPORTED Rust 3836:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NETWORK_OPEN_ECP_CONTEXT_0 {
//     pub r#in: NETWORK_OPEN_ECP_CONTEXT_0_0,
//     pub out: NETWORK_OPEN_ECP_CONTEXT_0_1,
// }

// UNSUPPORTED Rust 3842:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NETWORK_OPEN_ECP_CONTEXT_0_0 {
//     pub Location: NETWORK_OPEN_LOCATION_QUALIFIER,
//     pub Integrity: NETWORK_OPEN_INTEGRITY_QUALIFIER,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 3849:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NETWORK_OPEN_ECP_CONTEXT_0_1 {
//     pub Location: NETWORK_OPEN_LOCATION_QUALIFIER,
//     pub Integrity: NETWORK_OPEN_INTEGRITY_QUALIFIER,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 3856:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NETWORK_OPEN_ECP_CONTEXT_V0 {
//     pub Size: u16,
//     pub Reserved: u16,
//     pub Anonymous: NETWORK_OPEN_ECP_CONTEXT_V0_0,
// }

// UNSUPPORTED Rust 3863:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NETWORK_OPEN_ECP_CONTEXT_V0_0 {
//     pub r#in: NETWORK_OPEN_ECP_CONTEXT_V0_0_0,
//     pub out: NETWORK_OPEN_ECP_CONTEXT_V0_0_1,
// }

// UNSUPPORTED Rust 3869:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NETWORK_OPEN_ECP_CONTEXT_V0_0_0 {
//     pub Location: NETWORK_OPEN_LOCATION_QUALIFIER,
//     pub Integrity: NETWORK_OPEN_INTEGRITY_QUALIFIER,
// }

// UNSUPPORTED Rust 3875:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NETWORK_OPEN_ECP_CONTEXT_V0_0_1 {
//     pub Location: NETWORK_OPEN_LOCATION_QUALIFIER,
//     pub Integrity: NETWORK_OPEN_INTEGRITY_QUALIFIER,
// }

public const val `NETWORK_OPEN_ECP_IN_FLAG_DISABLE_HANDLE_COLLAPSING`: UInt = 1u;
public const val `NETWORK_OPEN_ECP_IN_FLAG_DISABLE_HANDLE_DURABILITY`: UInt = 2u;
public const val `NETWORK_OPEN_ECP_IN_FLAG_DISABLE_OPLOCKS`: UInt = 4u;
public const val `NETWORK_OPEN_ECP_IN_FLAG_FORCE_BUFFERED_SYNCHRONOUS_IO_HACK`: UInt = 2147483648u;
public const val `NETWORK_OPEN_ECP_IN_FLAG_FORCE_MAX_EOF_HACK`: UInt = 1073741824u;
public const val `NETWORK_OPEN_ECP_IN_FLAG_REQ_MUTUAL_AUTH`: UInt = 8u;
public const val `NETWORK_OPEN_ECP_OUT_FLAG_RET_MUTUAL_AUTH`: UInt = 8u;
public typealias `NETWORK_OPEN_INTEGRITY_QUALIFIER` = Int;
public typealias `NETWORK_OPEN_LOCATION_QUALIFIER` = Int;
// UNSUPPORTED Rust 3890:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct NFS_OPEN_ECP_CONTEXT {
//     pub ExportAlias: *mut super::super::super::Win32::Foundation::UNICODE_STRING,
//     pub ClientSocketAddress: *mut super::super::super::Win32::Networking::WinSock::SOCKADDR_STORAGE,
// }

// UNSUPPORTED Rust 3897:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for NFS_OPEN_ECP_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3903:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NLSTABLEINFO {
//     pub OemTableInfo: CPTABLEINFO,
//     pub AnsiTableInfo: CPTABLEINFO,
//     pub UpperCaseTable: *mut u16,
//     pub LowerCaseTable: *mut u16,
// }

// UNSUPPORTED Rust 3911:1: declaration Impl has no candidate rule
// impl Default for NLSTABLEINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NO_8DOT3_NAME_PRESENT`: UInt = 1u;
public typealias `NTCREATEFILE_CREATE_DISPOSITION` = UInt;
public typealias `NTCREATEFILE_CREATE_OPTIONS` = UInt;
public const val `NetworkOpenIntegrityAny`: `NETWORK_OPEN_INTEGRITY_QUALIFIER` = 0;
public const val `NetworkOpenIntegrityEncrypted`: `NETWORK_OPEN_INTEGRITY_QUALIFIER` = 3;
public const val `NetworkOpenIntegrityMaximum`: `NETWORK_OPEN_INTEGRITY_QUALIFIER` = 4;
public const val `NetworkOpenIntegrityNone`: `NETWORK_OPEN_INTEGRITY_QUALIFIER` = 1;
public const val `NetworkOpenIntegritySigned`: `NETWORK_OPEN_INTEGRITY_QUALIFIER` = 2;
public const val `NetworkOpenLocationAny`: `NETWORK_OPEN_LOCATION_QUALIFIER` = 0;
public const val `NetworkOpenLocationLoopback`: `NETWORK_OPEN_LOCATION_QUALIFIER` = 2;
public const val `NetworkOpenLocationRemote`: `NETWORK_OPEN_LOCATION_QUALIFIER` = 1;
public const val `NotifyTypeCreate`: `FS_FILTER_STREAM_FO_NOTIFICATION_TYPE` = 0;
public const val `NotifyTypeRetired`: `FS_FILTER_STREAM_FO_NOTIFICATION_TYPE` = 1;
public const val `NtfsLinkTrackingInformation`: `LINK_TRACKING_INFORMATION_TYPE` = 0;
// UNSUPPORTED Rust 3930:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy, Default)]
// pub struct OPEN_REPARSE_LIST {
//     pub OpenReparseList: super::super::super::Win32::System::Kernel::LIST_ENTRY,
// }

// UNSUPPORTED Rust 3936:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy, Default)]
// pub struct OPEN_REPARSE_LIST_ENTRY {
//     pub OpenReparseListEntry: super::super::super::Win32::System::Kernel::LIST_ENTRY,
//     pub ReparseTag: u32,
//     pub Flags: u32,
//     pub ReparseGuid: windows_sys::core::GUID,
//     pub Size: u16,
//     pub RemainingLength: u16,
// }

public const val `OPEN_REPARSE_POINT_OVERRIDE_CREATE_OPTION`: UInt = 64u;
public const val `OPEN_REPARSE_POINT_REPARSE_ALWAYS`: UInt = 126u;
public const val `OPEN_REPARSE_POINT_REPARSE_IF_CHILD_EXISTS`: UInt = 2u;
public const val `OPEN_REPARSE_POINT_REPARSE_IF_CHILD_NOT_EXISTS`: UInt = 4u;
public const val `OPEN_REPARSE_POINT_REPARSE_IF_DIRECTORY_FINAL_COMPONENT`: UInt = 8u;
public const val `OPEN_REPARSE_POINT_REPARSE_IF_DIRECTORY_FINAL_COMPONENT_ALWAYS`: UInt = 72u;
public const val `OPEN_REPARSE_POINT_REPARSE_IF_FINAL_COMPONENT`: UInt = 40u;
public const val `OPEN_REPARSE_POINT_REPARSE_IF_FINAL_COMPONENT_ALWAYS`: UInt = 104u;
public const val `OPEN_REPARSE_POINT_REPARSE_IF_NON_DIRECTORY_FINAL_COMPONENT`: UInt = 32u;
public const val `OPEN_REPARSE_POINT_REPARSE_IF_NON_DIRECTORY_FINAL_COMPONENT_ALWAYS`: UInt = 96u;
public const val `OPEN_REPARSE_POINT_REPARSE_IF_NON_DIRECTORY_NON_FINAL_COMPONENT`: UInt = 16u;
public const val `OPEN_REPARSE_POINT_REPARSE_IF_NON_DIRECTORY_NON_FINAL_COMPONENT_ALWAYS`: UInt = 80u;
public const val `OPEN_REPARSE_POINT_REPARSE_IF_NON_FINAL_COMPONENT`: UInt = 22u;
public const val `OPEN_REPARSE_POINT_RETURN_REPARSE_DATA_BUFFER`: UInt = 128u;
public const val `OPEN_REPARSE_POINT_TAG_ENCOUNTERED`: UInt = 1u;
public const val `OPEN_REPARSE_POINT_VERSION_EX`: UInt = 2147483648u;
public const val `OPLOCK_FLAG_BACK_OUT_ATOMIC_OPLOCK`: UInt = 4u;
public const val `OPLOCK_FLAG_BREAKING_FOR_SHARING_VIOLATION`: UInt = 128u;
public const val `OPLOCK_FLAG_CLOSING_DELETE_ON_CLOSE`: UInt = 32u;
public const val `OPLOCK_FLAG_COMPLETE_IF_OPLOCKED`: UInt = 1u;
public const val `OPLOCK_FLAG_IGNORE_OPLOCK_KEYS`: UInt = 8u;
public const val `OPLOCK_FLAG_OPLOCK_KEY_CHECK_ONLY`: UInt = 2u;
public const val `OPLOCK_FLAG_PARENT_OBJECT`: UInt = 16u;
public const val `OPLOCK_FLAG_REMOVING_FILE_OR_LINK`: UInt = 64u;
public const val `OPLOCK_FSCTRL_FLAG_ALL_KEYS_MATCH`: UInt = 1u;
// UNSUPPORTED Rust 3972:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct OPLOCK_KEY_CONTEXT {
//     pub Version: u16,
//     pub Flags: u16,
//     pub ParentOplockKey: windows_sys::core::GUID,
//     pub TargetOplockKey: windows_sys::core::GUID,
//     pub Reserved: u32,
// }

// UNSUPPORTED Rust 3981:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct OPLOCK_KEY_ECP_CONTEXT {
//     pub OplockKey: windows_sys::core::GUID,
//     pub Reserved: u32,
// }

public const val `OPLOCK_NOTIFY_BREAK_WAIT_INTERIM_TIMEOUT`: `OPLOCK_NOTIFY_REASON` = 0;
public const val `OPLOCK_NOTIFY_BREAK_WAIT_TERMINATED`: `OPLOCK_NOTIFY_REASON` = 1;
// UNSUPPORTED Rust 3989:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct OPLOCK_NOTIFY_PARAMS {
//     pub NotifyReason: OPLOCK_NOTIFY_REASON,
//     pub NotifyContext: *mut core::ffi::c_void,
//     pub Irp: *mut super::super::Foundation::IRP,
//     pub Status: super::super::super::Win32::Foundation::NTSTATUS,
// }

// UNSUPPORTED Rust 3998:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for OPLOCK_NOTIFY_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `OPLOCK_NOTIFY_REASON` = Int;
public const val `OPLOCK_UPPER_FLAG_CHECK_NO_BREAK`: UInt = 65536u;
public const val `OPLOCK_UPPER_FLAG_NOTIFY_REFRESH_READ`: UInt = 131072u;
// UNSUPPORTED Rust 4007:1: generic scalar type unsupported
// pub type PACQUIRE_FOR_LAZY_WRITE = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, wait: bool) -> bool>;

// UNSUPPORTED Rust 4008:1: generic scalar type unsupported
// pub type PACQUIRE_FOR_LAZY_WRITE_EX = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, inflags: u32, outflags: *mut u32) -> bool>;

// UNSUPPORTED Rust 4009:1: generic scalar type unsupported
// pub type PACQUIRE_FOR_READ_AHEAD = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, wait: bool) -> bool>;

// UNSUPPORTED Rust 4010:1: generic scalar type unsupported
// pub type PALLOCATE_VIRTUAL_MEMORY_EX_CALLBACK = Option<unsafe extern "system" fn() -> super::super::super::Win32::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 4011:1: generic scalar type unsupported
// pub type PASYNC_READ_COMPLETION_CALLBACK = Option<unsafe extern "system" fn(context: *const core::ffi::c_void) -> bool>;

// UNSUPPORTED Rust 4012:1: generic scalar type unsupported
// pub type PCC_POST_DEFERRED_WRITE = Option<unsafe extern "system" fn(context1: *const core::ffi::c_void, context2: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 4013:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// pub type PCHECK_FOR_TRAVERSE_ACCESS = Option<unsafe extern "system" fn(notifycontext: *const core::ffi::c_void, targetcontext: *const core::ffi::c_void, subjectcontext: *const super::super::Foundation::SECURITY_SUBJECT_CONTEXT) -> bool>;

// UNSUPPORTED Rust 4015:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// pub type PCOMPLETE_LOCK_IRP_ROUTINE = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, irp: *const super::super::Foundation::IRP) -> super::super::super::Win32::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 4017:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// pub type PDIRTY_PAGE_ROUTINE = Option<unsafe extern "system" fn(fileobject: *const super::super::Foundation::FILE_OBJECT, fileoffset: *const i64, length: u32, oldestlsn: *const i64, newestlsn: *const i64, context1: *const core::ffi::c_void, context2: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 4019:1: generic scalar type unsupported
// pub type PFILTER_REPORT_CHANGE = Option<unsafe extern "system" fn(notifycontext: *const core::ffi::c_void, filtercontext: *const core::ffi::c_void) -> bool>;

// UNSUPPORTED Rust 4020:1: generic scalar type unsupported
// pub type PFLUSH_TO_LSN = Option<unsafe extern "system" fn(loghandle: *const core::ffi::c_void, lsn: i64)>;

// UNSUPPORTED Rust 4021:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// pub type PFN_FSRTLTEARDOWNPERSTREAMCONTEXTS = Option<unsafe extern "system" fn(advancedheader: *const FSRTL_ADVANCED_FCB_HEADER)>;

// UNSUPPORTED Rust 4023:1: generic scalar type unsupported
// pub type PFREE_VIRTUAL_MEMORY_EX_CALLBACK = Option<unsafe extern "system" fn() -> super::super::super::Win32::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 4024:1: generic scalar type unsupported
// pub type PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK = Option<unsafe extern "system" fn(ecpcontext: *mut core::ffi::c_void, ecptype: *const windows_sys::core::GUID)>;

// UNSUPPORTED Rust 4025:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// pub type PFSRTL_STACK_OVERFLOW_ROUTINE = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, event: *const super::super::Foundation::KEVENT)>;

// UNSUPPORTED Rust 4027:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// pub type PFS_FILTER_CALLBACK = Option<unsafe extern "system" fn(data: *const FS_FILTER_CALLBACK_DATA, completioncontext: *mut *mut core::ffi::c_void) -> super::super::super::Win32::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 4029:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// pub type PFS_FILTER_COMPLETION_CALLBACK = Option<unsafe extern "system" fn(data: *const FS_FILTER_CALLBACK_DATA, operationstatus: super::super::super::Win32::Foundation::NTSTATUS, completioncontext: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 4031:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PHYSICAL_EXTENTS_DESCRIPTOR {
//     pub NumberOfRuns: u32,
//     pub NumberOfValidRuns: u32,
//     pub Run: [PHYSICAL_MEMORY_RUN; 1],
// }

// UNSUPPORTED Rust 4038:1: declaration Impl has no candidate rule
// impl Default for PHYSICAL_EXTENTS_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4043:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PHYSICAL_MEMORY_DESCRIPTOR {
//     pub NumberOfRuns: u32,
//     pub NumberOfPages: u32,
//     pub Run: [PHYSICAL_MEMORY_RUN; 1],
// }

// UNSUPPORTED Rust 4050:1: declaration Impl has no candidate rule
// impl Default for PHYSICAL_MEMORY_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4055:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PHYSICAL_MEMORY_RUN {
//     pub BasePage: u32,
//     pub PageCount: u32,
// }

public const val `PIN_CALLER_TRACKS_DIRTY_DATA`: UInt = 32u;
public const val `PIN_EXCLUSIVE`: UInt = 2u;
public const val `PIN_HIGH_PRIORITY`: UInt = 64u;
public const val `PIN_IF_BCB`: UInt = 8u;
public const val `PIN_NO_READ`: UInt = 4u;
public const val `PIN_VERIFY_REQUIRED`: UInt = 128u;
public const val `PIN_WAIT`: UInt = 1u;
public const val `POLICY_AUDIT_SUBCATEGORY_COUNT`: UInt = 59u;
// UNSUPPORTED Rust 4069:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// pub type POPLOCK_FS_PREPOST_IRP = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, irp: *const super::super::Foundation::IRP)>;

// UNSUPPORTED Rust 4071:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// pub type POPLOCK_NOTIFY_ROUTINE = Option<unsafe extern "system" fn(notifyparams: *const OPLOCK_NOTIFY_PARAMS) -> super::super::super::Win32::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 4073:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// pub type POPLOCK_WAIT_COMPLETE_ROUTINE = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, irp: *const super::super::Foundation::IRP)>;

public const val `PO_CB_AC_STATUS`: UInt = 1u;
public const val `PO_CB_BUTTON_COLLISION`: UInt = 2u;
public const val `PO_CB_LID_SWITCH_STATE`: UInt = 4u;
public const val `PO_CB_PROCESSOR_POWER_POLICY`: UInt = 5u;
public const val `PO_CB_SYSTEM_POWER_POLICY`: UInt = 0u;
public const val `PO_CB_SYSTEM_STATE_LOCK`: UInt = 3u;
// UNSUPPORTED Rust 4081:1: generic scalar type unsupported
// pub type PQUERY_LOG_USAGE = Option<unsafe extern "system" fn(loghandle: *const core::ffi::c_void, percentagefull: *mut u16)>;

// UNSUPPORTED Rust 4082:1: generic scalar type unsupported
// pub type PQUERY_VIRTUAL_MEMORY_CALLBACK = Option<unsafe extern "system" fn() -> super::super::super::Win32::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 4083:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PREFETCH_OPEN_ECP_CONTEXT {
//     pub Context: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 4088:1: declaration Impl has no candidate rule
// impl Default for PREFETCH_OPEN_ECP_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4093:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// #[derive(Clone, Copy)]
// pub struct PREFIX_TABLE {
//     pub NodeTypeCode: i16,
//     pub NameLength: i16,
//     pub NextPrefixTree: *mut PREFIX_TABLE_ENTRY,
// }

// UNSUPPORTED Rust 4101:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// impl Default for PREFIX_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4107:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// #[derive(Clone, Copy)]
// pub struct PREFIX_TABLE_ENTRY {
//     pub NodeTypeCode: i16,
//     pub NameLength: i16,
//     pub NextPrefixTree: *mut PREFIX_TABLE_ENTRY,
//     pub Links: super::super::Foundation::RTL_SPLAY_LINKS,
//     pub Prefix: *mut super::super::super::Win32::System::Kernel::STRING,
// }

// UNSUPPORTED Rust 4117:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// impl Default for PREFIX_TABLE_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4123:1: generic scalar type unsupported
// pub type PRELEASE_FROM_LAZY_WRITE = Option<unsafe extern "system" fn(context: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 4124:1: generic scalar type unsupported
// pub type PRELEASE_FROM_READ_AHEAD = Option<unsafe extern "system" fn(context: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 4125:1: generic scalar type unsupported
// pub type PRTL_ALLOCATE_STRING_ROUTINE = Option<unsafe extern "system" fn() -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 4126:1: generic scalar type unsupported
// pub type PRTL_FREE_STRING_ROUTINE = Option<unsafe extern "system" fn()>;

// UNSUPPORTED Rust 4127:1: generic scalar type unsupported
// pub type PRTL_HEAP_COMMIT_ROUTINE = Option<unsafe extern "system" fn() -> super::super::super::Win32::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 4128:1: generic scalar type unsupported
// pub type PRTL_REALLOCATE_STRING_ROUTINE = Option<unsafe extern "system" fn() -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 4129:1: generic scalar type unsupported
// pub type PSE_LOGON_SESSION_TERMINATED_ROUTINE = Option<unsafe extern "system" fn() -> super::super::super::Win32::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 4130:1: generic scalar type unsupported
// pub type PSE_LOGON_SESSION_TERMINATED_ROUTINE_EX = Option<unsafe extern "system" fn() -> super::super::super::Win32::Foundation::NTSTATUS>;

public const val `PSMP_MAXIMUM_SYSAPP_CLAIM_VALUES`: UInt = 4u;
public const val `PSMP_MINIMUM_SYSAPP_CLAIM_VALUES`: UInt = 2u;
// UNSUPPORTED Rust 4133:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PUBLIC_BCB {
//     pub NodeTypeCode: i16,
//     pub NodeByteSize: i16,
//     pub MappedLength: u32,
//     pub MappedFileOffset: i64,
// }

// UNSUPPORTED Rust 4141:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// pub type PUNLOCK_ROUTINE = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, filelockinfo: *const FILE_LOCK_INFO)>;

public const val `PURGE_WITH_ACTIVE_VIEWS`: UInt = 8u;
// UNSUPPORTED Rust 4144:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Ioctl")]
// #[derive(Clone, Copy)]
// pub struct QUERY_BAD_RANGES_INPUT {
//     pub Flags: u32,
//     pub NumRanges: u32,
//     pub Ranges: [super::super::super::Win32::System::Ioctl::QUERY_BAD_RANGES_INPUT_RANGE; 1],
// }

// UNSUPPORTED Rust 4152:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Ioctl")]
// impl Default for QUERY_BAD_RANGES_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `QUERY_DIRECT_ACCESS_DATA_EXTENTS`: UInt = 2u;
// UNSUPPORTED Rust 4159:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct QUERY_DIRECT_ACCESS_EXTENTS {
//     pub FileOffset: i64,
//     pub Length: i64,
//     pub Flags: u32,
//     pub Reserved: u32,
// }

public const val `QUERY_DIRECT_ACCESS_IMAGE_EXTENTS`: UInt = 1u;
// UNSUPPORTED Rust 4168:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct QUERY_ON_CREATE_EA_INFORMATION {
//     pub EaBufferSize: u32,
//     pub EaBuffer: *mut FILE_FULL_EA_INFORMATION,
// }

// UNSUPPORTED Rust 4174:1: declaration Impl has no candidate rule
// impl Default for QUERY_ON_CREATE_EA_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4179:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct QUERY_ON_CREATE_ECP_CONTEXT {
//     pub RequestedClasses: u32,
//     pub ClassesProcessed: u32,
//     pub ClassesWithErrors: u32,
//     pub ClassesWithNoData: u32,
//     pub StatInformation: QUERY_ON_CREATE_FILE_STAT_INFORMATION,
//     pub LxInformation: QUERY_ON_CREATE_FILE_LX_INFORMATION,
//     pub EaInformation: QUERY_ON_CREATE_EA_INFORMATION,
// }

// UNSUPPORTED Rust 4190:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct QUERY_ON_CREATE_FILE_LX_INFORMATION {
//     pub EffectiveAccess: u32,
//     pub LxFlags: u32,
//     pub LxUid: u32,
//     pub LxGid: u32,
//     pub LxMode: u32,
//     pub LxDeviceIdMajor: u32,
//     pub LxDeviceIdMinor: u32,
// }

// UNSUPPORTED Rust 4201:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct QUERY_ON_CREATE_FILE_STAT_INFORMATION {
//     pub FileId: i64,
//     pub CreationTime: i64,
//     pub LastAccessTime: i64,
//     pub LastWriteTime: i64,
//     pub ChangeTime: i64,
//     pub AllocationSize: i64,
//     pub EndOfFile: i64,
//     pub FileAttributes: u32,
//     pub ReparseTag: u32,
//     pub NumberOfLinks: u32,
// }

// UNSUPPORTED Rust 4215:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security"))]
// #[derive(Clone, Copy)]
// pub struct QUERY_PATH_REQUEST {
//     pub PathNameLength: u32,
//     pub SecurityContext: *mut super::super::Foundation::IO_SECURITY_CONTEXT,
//     pub FilePathName: [u16; 1],
// }

// UNSUPPORTED Rust 4223:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security"))]
// impl Default for QUERY_PATH_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4229:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security"))]
// #[derive(Clone, Copy)]
// pub struct QUERY_PATH_REQUEST_EX {
//     pub pSecurityContext: *mut super::super::Foundation::IO_SECURITY_CONTEXT,
//     pub EaLength: u32,
//     pub pEaBuffer: *mut core::ffi::c_void,
//     pub PathName: super::super::super::Win32::Foundation::UNICODE_STRING,
//     pub DomainServiceName: super::super::super::Win32::Foundation::UNICODE_STRING,
//     pub EcpList: *mut super::super::Foundation::ECP_LIST,
//     pub Silo: super::super::Foundation::PESILO,
//     pub Reserved: usize,
// }

// UNSUPPORTED Rust 4242:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security"))]
// impl Default for QUERY_PATH_REQUEST_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4248:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct QUERY_PATH_RESPONSE {
//     pub LengthAccepted: u32,
// }

// UNSUPPORTED Rust 4253:1: generic scalar type unsupported
// pub type QUERY_VIRTUAL_MEMORY_CALLBACK = Option<unsafe extern "system" fn(callbackcontext: super::super::super::Win32::Foundation::HANDLE, processhandle: super::super::super::Win32::Foundation::HANDLE, baseaddress: *const core::ffi::c_void, memoryinformationclass: HEAP_MEMORY_INFO_CLASS, memoryinformation: *mut core::ffi::c_void, memoryinformationlength: usize, returnlength: *mut usize) -> super::super::super::Win32::Foundation::NTSTATUS>;

public const val `QoCFileEaInformation`: UInt = 4u;
public const val `QoCFileLxInformation`: UInt = 2u;
public const val `QoCFileStatInformation`: UInt = 1u;
// UNSUPPORTED Rust 4257:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct READ_AHEAD_PARAMETERS {
//     pub NodeByteSize: i16,
//     pub Granularity: u32,
//     pub PipelinedRequestSize: u32,
//     pub ReadAheadGrowthPercentage: u32,
// }

// UNSUPPORTED Rust 4265:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_Storage_FileSystem", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// #[derive(Clone, Copy)]
// pub struct READ_LIST {
//     pub FileObject: *mut super::super::Foundation::FILE_OBJECT,
//     pub NumberOfEntries: u32,
//     pub IsImage: u32,
//     pub List: [super::super::super::Win32::Storage::FileSystem::FILE_SEGMENT_ELEMENT; 1],
// }

// UNSUPPORTED Rust 4274:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Wdk_System_SystemServices", feature = "Win32_Security", feature = "Win32_Storage_FileSystem", feature = "Win32_System_IO", feature = "Win32_System_Kernel", feature = "Win32_System_Power"))]
// impl Default for READ_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4280:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct READ_USN_JOURNAL_DATA {
//     pub StartUsn: i64,
//     pub ReasonMask: u32,
//     pub ReturnOnlyOnClose: u32,
//     pub Timeout: u64,
//     pub BytesToWaitFor: u64,
//     pub UsnJournalID: u64,
//     pub MinMajorVersion: u16,
//     pub MaxMajorVersion: u16,
// }

public typealias `REFS_COMPRESSION_FORMATS` = Int;
public const val `REFS_COMPRESSION_FORMAT_LZ4`: `REFS_COMPRESSION_FORMATS` = 1;
public const val `REFS_COMPRESSION_FORMAT_MAX`: `REFS_COMPRESSION_FORMATS` = 3;
public const val `REFS_COMPRESSION_FORMAT_UNCOMPRESSED`: `REFS_COMPRESSION_FORMATS` = 0;
public const val `REFS_COMPRESSION_FORMAT_ZSTD`: `REFS_COMPRESSION_FORMATS` = 2;
public typealias `REFS_DEALLOCATE_RANGES_ALLOCATOR` = Int;
public const val `REFS_DEALLOCATE_RANGES_ALLOCATOR_CAA`: `REFS_DEALLOCATE_RANGES_ALLOCATOR` = 2;
public const val `REFS_DEALLOCATE_RANGES_ALLOCATOR_MAA`: `REFS_DEALLOCATE_RANGES_ALLOCATOR` = 3;
public const val `REFS_DEALLOCATE_RANGES_ALLOCATOR_NONE`: `REFS_DEALLOCATE_RANGES_ALLOCATOR` = 0;
public const val `REFS_DEALLOCATE_RANGES_ALLOCATOR_SAA`: `REFS_DEALLOCATE_RANGES_ALLOCATOR` = 1;
// UNSUPPORTED Rust 4302:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REFS_DEALLOCATE_RANGES_INPUT_BUFFER {
//     pub RangeCount: u32,
//     pub Ranges: [REFS_DEALLOCATE_RANGES_RANGE; 1],
// }

// UNSUPPORTED Rust 4308:1: declaration Impl has no candidate rule
// impl Default for REFS_DEALLOCATE_RANGES_INPUT_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4313:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REFS_DEALLOCATE_RANGES_INPUT_BUFFER_EX {
//     pub RangeCount: u32,
//     pub Allocator: REFS_DEALLOCATE_RANGES_ALLOCATOR,
//     pub StreamReserveUpdateCount: i64,
//     pub OffsetToRanges: u32,
//     pub OffsetToLeakCounts: u32,
//     pub Reserved: [u64; 2],
// }

// UNSUPPORTED Rust 4323:1: declaration Impl has no candidate rule
// impl Default for REFS_DEALLOCATE_RANGES_INPUT_BUFFER_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4328:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct REFS_DEALLOCATE_RANGES_RANGE {
//     pub StartOfRange: u64,
//     pub CountOfRange: u64,
// }

// UNSUPPORTED Rust 4334:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REFS_QUERY_VOLUME_COMPRESSION_INFO_OUTPUT_BUFFER {
//     pub DefaultCompressionFormat: REFS_COMPRESSION_FORMATS,
//     pub DefaultCompressionLevel: i16,
//     pub DefaultCompressionChunkSizeBytes: u32,
//     pub VolumeClusterSizeBytes: u32,
//     pub TotalVolumeClusters: u64,
//     pub TotalAllocatedClusters: u64,
//     pub TotalCompressibleClustersAllocated: u64,
//     pub TotalCompressibleClustersInUse: u64,
//     pub TotalCompressedClusters: u64,
//     pub Reserved: [u64; 6],
// }

// UNSUPPORTED Rust 4348:1: declaration Impl has no candidate rule
// impl Default for REFS_QUERY_VOLUME_COMPRESSION_INFO_OUTPUT_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4353:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct REFS_QUERY_VOLUME_DEDUP_INFO_OUTPUT_BUFFER {
//     pub Enabled: bool,
// }

// UNSUPPORTED Rust 4358:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REFS_REMOVE_HARDLINK_BACKPOINTER {
//     pub ParentDirectory: u64,
//     pub Reserved: u64,
//     pub FileName: [u16; 1],
// }

// UNSUPPORTED Rust 4365:1: declaration Impl has no candidate rule
// impl Default for REFS_REMOVE_HARDLINK_BACKPOINTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `REFS_SET_VOLUME_COMPRESSION_INFO_FLAGS` = Int;
public const val `REFS_SET_VOLUME_COMPRESSION_INFO_FLAG_COMPRESS_SYNC`: `REFS_SET_VOLUME_COMPRESSION_INFO_FLAGS` = 1;
public const val `REFS_SET_VOLUME_COMPRESSION_INFO_FLAG_MAX`: `REFS_SET_VOLUME_COMPRESSION_INFO_FLAGS` = 1;
// UNSUPPORTED Rust 4373:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REFS_SET_VOLUME_COMPRESSION_INFO_INPUT_BUFFER {
//     pub CompressionFormat: REFS_COMPRESSION_FORMATS,
//     pub CompressionLevel: i16,
//     pub CompressionChunkSizeBytes: u32,
//     pub Flags: REFS_SET_VOLUME_COMPRESSION_INFO_FLAGS,
//     pub Reserved: [u64; 8],
// }

// UNSUPPORTED Rust 4382:1: declaration Impl has no candidate rule
// impl Default for REFS_SET_VOLUME_COMPRESSION_INFO_INPUT_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4387:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct REFS_SET_VOLUME_DEDUP_INFO_INPUT_BUFFER {
//     pub Enable: bool,
// }

// UNSUPPORTED Rust 4392:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct REFS_STREAM_EXTENT {
//     pub Vcn: i64,
//     pub Lcn: i64,
//     pub Length: i64,
//     pub Properties: u16,
// }

public const val `REFS_STREAM_EXTENT_PROPERTY_CRC32`: `_REFS_STREAM_EXTENT_PROPERTIES` = 128;
public const val `REFS_STREAM_EXTENT_PROPERTY_CRC64`: `_REFS_STREAM_EXTENT_PROPERTIES` = 256;
public const val `REFS_STREAM_EXTENT_PROPERTY_GHOSTED`: `_REFS_STREAM_EXTENT_PROPERTIES` = 512;
public const val `REFS_STREAM_EXTENT_PROPERTY_READONLY`: `_REFS_STREAM_EXTENT_PROPERTIES` = 1024;
public const val `REFS_STREAM_EXTENT_PROPERTY_SPARSE`: `_REFS_STREAM_EXTENT_PROPERTIES` = 8;
public const val `REFS_STREAM_EXTENT_PROPERTY_STREAM_RESERVED`: `_REFS_STREAM_EXTENT_PROPERTIES` = 32;
public const val `REFS_STREAM_EXTENT_PROPERTY_VALID`: `_REFS_STREAM_EXTENT_PROPERTIES` = 16;
// UNSUPPORTED Rust 4407:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REFS_STREAM_SNAPSHOT_LIST_OUTPUT_BUFFER {
//     pub EntryCount: u32,
//     pub BufferSizeRequiredForQuery: u32,
//     pub Reserved: [u32; 2],
//     pub Entries: [REFS_STREAM_SNAPSHOT_LIST_OUTPUT_BUFFER_ENTRY; 1],
// }

// UNSUPPORTED Rust 4415:1: declaration Impl has no candidate rule
// impl Default for REFS_STREAM_SNAPSHOT_LIST_OUTPUT_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4420:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REFS_STREAM_SNAPSHOT_LIST_OUTPUT_BUFFER_ENTRY {
//     pub NextEntryOffset: u32,
//     pub SnapshotNameLength: u16,
//     pub SnapshotCreationTime: u64,
//     pub StreamSize: u64,
//     pub StreamAllocationSize: u64,
//     pub Reserved: [u64; 2],
//     pub SnapshotName: [u16; 1],
// }

// UNSUPPORTED Rust 4431:1: declaration Impl has no candidate rule
// impl Default for REFS_STREAM_SNAPSHOT_LIST_OUTPUT_BUFFER_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4436:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REFS_STREAM_SNAPSHOT_MANAGEMENT_INPUT_BUFFER {
//     pub Operation: REFS_STREAM_SNAPSHOT_OPERATION,
//     pub SnapshotNameLength: u16,
//     pub OperationInputBufferLength: u16,
//     pub Reserved: [u64; 2],
//     pub NameAndInputBuffer: [u16; 1],
// }

// UNSUPPORTED Rust 4445:1: declaration Impl has no candidate rule
// impl Default for REFS_STREAM_SNAPSHOT_MANAGEMENT_INPUT_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `REFS_STREAM_SNAPSHOT_OPERATION` = Int;
public const val `REFS_STREAM_SNAPSHOT_OPERATION_CLEAR_SHADOW_BTREE`: `REFS_STREAM_SNAPSHOT_OPERATION` = 6;
public const val `REFS_STREAM_SNAPSHOT_OPERATION_CREATE`: `REFS_STREAM_SNAPSHOT_OPERATION` = 1;
public const val `REFS_STREAM_SNAPSHOT_OPERATION_INVALID`: `REFS_STREAM_SNAPSHOT_OPERATION` = 0;
public const val `REFS_STREAM_SNAPSHOT_OPERATION_LIST`: `REFS_STREAM_SNAPSHOT_OPERATION` = 2;
public const val `REFS_STREAM_SNAPSHOT_OPERATION_MAX`: `REFS_STREAM_SNAPSHOT_OPERATION` = 6;
public const val `REFS_STREAM_SNAPSHOT_OPERATION_QUERY_DELTAS`: `REFS_STREAM_SNAPSHOT_OPERATION` = 3;
public const val `REFS_STREAM_SNAPSHOT_OPERATION_REVERT`: `REFS_STREAM_SNAPSHOT_OPERATION` = 4;
public const val `REFS_STREAM_SNAPSHOT_OPERATION_SET_SHADOW_BTREE`: `REFS_STREAM_SNAPSHOT_OPERATION` = 5;
// UNSUPPORTED Rust 4459:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct REFS_STREAM_SNAPSHOT_QUERY_DELTAS_INPUT_BUFFER {
//     pub StartingVcn: i64,
//     pub Flags: u32,
//     pub Reserved: u32,
// }

// UNSUPPORTED Rust 4466:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REFS_STREAM_SNAPSHOT_QUERY_DELTAS_OUTPUT_BUFFER {
//     pub ExtentCount: u32,
//     pub Reserved: [u32; 2],
//     pub Extents: [REFS_STREAM_EXTENT; 1],
// }

// UNSUPPORTED Rust 4473:1: declaration Impl has no candidate rule
// impl Default for REFS_STREAM_SNAPSHOT_QUERY_DELTAS_OUTPUT_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4478:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct REFS_VOLUME_COUNTER_INFO_INPUT_BUFFER {
//     pub ResetCounters: bool,
// }

// UNSUPPORTED Rust 4483:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REFS_VOLUME_DATA_BUFFER {
//     pub ByteCount: u32,
//     pub MajorVersion: u32,
//     pub MinorVersion: u32,
//     pub BytesPerPhysicalSector: u32,
//     pub VolumeSerialNumber: i64,
//     pub NumberSectors: i64,
//     pub TotalClusters: i64,
//     pub FreeClusters: i64,
//     pub TotalReserved: i64,
//     pub BytesPerSector: u32,
//     pub BytesPerCluster: u32,
//     pub MaximumSizeOfResidentFile: i64,
//     pub FastTierDataFillRatio: u16,
//     pub SlowTierDataFillRatio: u16,
//     pub DestagesFastTierToSlowTierRate: u32,
//     pub Reserved: [i64; 9],
// }

// UNSUPPORTED Rust 4503:1: declaration Impl has no candidate rule
// impl Default for REFS_VOLUME_DATA_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4508:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REMOTE_LINK_TRACKING_INFORMATION {
//     pub TargetFileObject: *mut core::ffi::c_void,
//     pub TargetLinkTrackingInformationLength: u32,
//     pub TargetLinkTrackingInformationBuffer: [u8; 1],
// }

// UNSUPPORTED Rust 4515:1: declaration Impl has no candidate rule
// impl Default for REMOTE_LINK_TRACKING_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `REMOTE_PROTOCOL_FLAG_INTEGRITY`: UInt = 16u;
public const val `REMOTE_PROTOCOL_FLAG_LOOPBACK`: UInt = 1u;
public const val `REMOTE_PROTOCOL_FLAG_MUTUAL_AUTH`: UInt = 32u;
public const val `REMOTE_PROTOCOL_FLAG_OFFLINE`: UInt = 2u;
public const val `REMOTE_PROTOCOL_FLAG_PERSISTENT_HANDLE`: UInt = 4u;
public const val `REMOTE_PROTOCOL_FLAG_PRIVACY`: UInt = 8u;
public const val `REMOVED_8DOT3_NAME`: UInt = 2u;
// UNSUPPORTED Rust 4527:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REPARSE_DATA_BUFFER {
//     pub ReparseTag: u32,
//     pub ReparseDataLength: u16,
//     pub Reserved: u16,
//     pub Anonymous: REPARSE_DATA_BUFFER_0,
// }

// UNSUPPORTED Rust 4535:1: declaration Impl has no candidate rule
// impl Default for REPARSE_DATA_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4540:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union REPARSE_DATA_BUFFER_0 {
//     pub SymbolicLinkReparseBuffer: REPARSE_DATA_BUFFER_0_0,
//     pub MountPointReparseBuffer: REPARSE_DATA_BUFFER_0_1,
//     pub GenericReparseBuffer: REPARSE_DATA_BUFFER_0_2,
// }

// UNSUPPORTED Rust 4547:1: declaration Impl has no candidate rule
// impl Default for REPARSE_DATA_BUFFER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4552:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REPARSE_DATA_BUFFER_0_2 {
//     pub DataBuffer: [u8; 1],
// }

// UNSUPPORTED Rust 4557:1: declaration Impl has no candidate rule
// impl Default for REPARSE_DATA_BUFFER_0_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4562:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REPARSE_DATA_BUFFER_0_1 {
//     pub SubstituteNameOffset: u16,
//     pub SubstituteNameLength: u16,
//     pub PrintNameOffset: u16,
//     pub PrintNameLength: u16,
//     pub PathBuffer: [u16; 1],
// }

// UNSUPPORTED Rust 4571:1: declaration Impl has no candidate rule
// impl Default for REPARSE_DATA_BUFFER_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4576:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REPARSE_DATA_BUFFER_0_0 {
//     pub SubstituteNameOffset: u16,
//     pub SubstituteNameLength: u16,
//     pub PrintNameOffset: u16,
//     pub PrintNameLength: u16,
//     pub Flags: u32,
//     pub PathBuffer: [u16; 1],
// }

// UNSUPPORTED Rust 4586:1: declaration Impl has no candidate rule
// impl Default for REPARSE_DATA_BUFFER_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4591:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Storage_FileSystem")]
// #[derive(Clone, Copy)]
// pub struct REPARSE_DATA_BUFFER_EX {
//     pub Flags: u32,
//     pub ExistingReparseTag: u32,
//     pub ExistingReparseGuid: windows_sys::core::GUID,
//     pub Reserved: u64,
//     pub Anonymous: REPARSE_DATA_BUFFER_EX_0,
// }

// UNSUPPORTED Rust 4601:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for REPARSE_DATA_BUFFER_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4607:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Storage_FileSystem")]
// #[derive(Clone, Copy)]
// pub union REPARSE_DATA_BUFFER_EX_0 {
//     pub ReparseDataBuffer: REPARSE_DATA_BUFFER,
//     pub ReparseGuidDataBuffer: super::super::super::Win32::Storage::FileSystem::REPARSE_GUID_DATA_BUFFER,
// }

// UNSUPPORTED Rust 4614:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for REPARSE_DATA_BUFFER_EX_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `REPARSE_DATA_EX_FLAG_GIVEN_TAG_OR_NONE`: UInt = 1u;
// UNSUPPORTED Rust 4621:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct REPARSE_INDEX_KEY {
//     pub FileReparseTag: u32,
//     pub FileId: i64,
// }

// UNSUPPORTED Rust 4627:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RETRIEVAL_POINTERS_AND_REFCOUNT_BUFFER {
//     pub ExtentCount: u32,
//     pub StartingVcn: i64,
//     pub Extents: [RETRIEVAL_POINTERS_AND_REFCOUNT_BUFFER_0; 1],
// }

// UNSUPPORTED Rust 4634:1: declaration Impl has no candidate rule
// impl Default for RETRIEVAL_POINTERS_AND_REFCOUNT_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4639:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RETRIEVAL_POINTERS_AND_REFCOUNT_BUFFER_0 {
//     pub NextVcn: i64,
//     pub Lcn: i64,
//     pub ReferenceCount: u32,
// }

public const val `RETURN_NON_NT_USER_SESSION_KEY`: UInt = 8u;
public const val `RETURN_PRIMARY_LOGON_DOMAINNAME`: UInt = 4u;
public const val `RETURN_PRIMARY_USERNAME`: UInt = 2u;
public const val `RETURN_RESERVED_PARAMETER`: UInt = 128u;
// UNSUPPORTED Rust 4650:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RKF_BYPASS_ECP_CONTEXT {
//     pub Reserved: i32,
//     pub Version: i32,
// }

public const val `RPI_SMB2_SERVERCAP_DFS`: UInt = 1u;
public const val `RPI_SMB2_SERVERCAP_DIRECTORY_LEASING`: UInt = 32u;
public const val `RPI_SMB2_SERVERCAP_ENCRYPTION_AWARE`: UInt = 64u;
public const val `RPI_SMB2_SERVERCAP_LARGEMTU`: UInt = 4u;
public const val `RPI_SMB2_SERVERCAP_LEASING`: UInt = 2u;
public const val `RPI_SMB2_SERVERCAP_MULTICHANNEL`: UInt = 8u;
public const val `RPI_SMB2_SERVERCAP_PERSISTENT_HANDLES`: UInt = 16u;
public const val `RPI_SMB2_SHARECAP_ACCESS_BASED_DIRECTORY_ENUM`: UInt = 256u;
public const val `RPI_SMB2_SHARECAP_ASYMMETRIC_SCALEOUT`: UInt = 1024u;
public const val `RPI_SMB2_SHARECAP_CLUSTER`: UInt = 64u;
public const val `RPI_SMB2_SHARECAP_CONTINUOUS_AVAILABILITY`: UInt = 16u;
public const val `RPI_SMB2_SHARECAP_DFS`: UInt = 8u;
public const val `RPI_SMB2_SHARECAP_ENCRYPTED`: UInt = 128u;
public const val `RPI_SMB2_SHARECAP_IDENTITY_REMOTING`: UInt = 512u;
public const val `RPI_SMB2_SHARECAP_SCALEOUT`: UInt = 32u;
public const val `RPI_SMB2_SHARECAP_TIMEWARP`: UInt = 2u;
public const val `RPI_SMB2_SHARETYPE_DISK`: UInt = 0u;
public const val `RPI_SMB2_SHARETYPE_PIPE`: UInt = 1u;
public const val `RPI_SMB2_SHARETYPE_PRINT`: UInt = 2u;
// UNSUPPORTED Rust 4675:1: generic scalar type unsupported
// pub type RTL_ALLOCATE_STRING_ROUTINE = Option<unsafe extern "system" fn(numberofbytes: usize) -> *mut core::ffi::c_void>;

public const val `RTL_DUPLICATE_UNICODE_STRING_ALLOCATE_NULL_STRING`: UInt = 2u;
public const val `RTL_DUPLICATE_UNICODE_STRING_NULL_TERMINATE`: UInt = 1u;
// UNSUPPORTED Rust 4678:1: generic scalar type unsupported
// pub type RTL_FREE_STRING_ROUTINE = Option<unsafe extern "system" fn(buffer: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 4679:1: generic scalar type unsupported
// pub type RTL_HEAP_COMMIT_ROUTINE = Option<unsafe extern "system" fn(base: *const core::ffi::c_void, commitaddress: *mut *mut core::ffi::c_void, commitsize: *mut usize) -> super::super::super::Win32::Foundation::NTSTATUS>;

public const val `RTL_HEAP_MEMORY_LIMIT_CURRENT_VERSION`: UInt = 1u;
// UNSUPPORTED Rust 4681:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RTL_HEAP_MEMORY_LIMIT_DATA {
//     pub CommitLimitBytes: usize,
//     pub CommitLimitFailureCode: usize,
//     pub MaxAllocationSizeBytes: usize,
//     pub AllocationLimitFailureCode: usize,
// }

// UNSUPPORTED Rust 4689:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RTL_HEAP_MEMORY_LIMIT_INFO {
//     pub Version: u32,
//     pub Data: RTL_HEAP_MEMORY_LIMIT_DATA,
// }

// UNSUPPORTED Rust 4695:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RTL_HEAP_PARAMETERS {
//     pub Length: u32,
//     pub SegmentReserve: usize,
//     pub SegmentCommit: usize,
//     pub DeCommitFreeBlockThreshold: usize,
//     pub DeCommitTotalFreeThreshold: usize,
//     pub MaximumAllocationSize: usize,
//     pub VirtualMemoryThreshold: usize,
//     pub InitialCommit: usize,
//     pub InitialReserve: usize,
//     pub CommitRoutine: PRTL_HEAP_COMMIT_ROUTINE,
//     pub Reserved: [usize; 2],
// }

// UNSUPPORTED Rust 4710:1: declaration Impl has no candidate rule
// impl Default for RTL_HEAP_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `RTL_MEMORY_TYPE` = Int;
// UNSUPPORTED Rust 4716:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RTL_NLS_STATE {
//     pub DefaultAcpTableInfo: CPTABLEINFO,
//     pub DefaultOemTableInfo: CPTABLEINFO,
//     pub ActiveCodePageData: *mut u16,
//     pub OemCodePageData: *mut u16,
//     pub LeadByteInfo: *mut u16,
//     pub OemLeadByteInfo: *mut u16,
//     pub CaseMappingData: *mut u16,
//     pub UnicodeUpcaseTable844: *mut u16,
//     pub UnicodeLowercaseTable844: *mut u16,
// }

// UNSUPPORTED Rust 4729:1: declaration Impl has no candidate rule
// impl Default for RTL_NLS_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4734:1: generic scalar type unsupported
// pub type RTL_REALLOCATE_STRING_ROUTINE = Option<unsafe extern "system" fn(numberofbytes: usize, buffer: *const core::ffi::c_void) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 4735:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RTL_SEGMENT_HEAP_MEMORY_SOURCE {
//     pub Flags: u32,
//     pub MemoryTypeMask: u32,
//     pub NumaNode: u32,
//     pub Anonymous: RTL_SEGMENT_HEAP_MEMORY_SOURCE_0,
//     pub Reserved: [usize; 2],
// }

// UNSUPPORTED Rust 4744:1: declaration Impl has no candidate rule
// impl Default for RTL_SEGMENT_HEAP_MEMORY_SOURCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4749:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union RTL_SEGMENT_HEAP_MEMORY_SOURCE_0 {
//     pub PartitionHandle: super::super::super::Win32::Foundation::HANDLE,
//     pub Callbacks: *mut RTL_SEGMENT_HEAP_VA_CALLBACKS,
// }

// UNSUPPORTED Rust 4755:1: declaration Impl has no candidate rule
// impl Default for RTL_SEGMENT_HEAP_MEMORY_SOURCE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4760:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RTL_SEGMENT_HEAP_PARAMETERS {
//     pub Version: u16,
//     pub Size: u16,
//     pub Flags: u32,
//     pub MemorySource: RTL_SEGMENT_HEAP_MEMORY_SOURCE,
//     pub Reserved: [usize; 4],
// }

// UNSUPPORTED Rust 4769:1: declaration Impl has no candidate rule
// impl Default for RTL_SEGMENT_HEAP_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4774:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RTL_SEGMENT_HEAP_VA_CALLBACKS {
//     pub CallbackContext: super::super::super::Win32::Foundation::HANDLE,
//     pub AllocateVirtualMemory: PALLOCATE_VIRTUAL_MEMORY_EX_CALLBACK,
//     pub FreeVirtualMemory: PFREE_VIRTUAL_MEMORY_EX_CALLBACK,
//     pub QueryVirtualMemory: PQUERY_VIRTUAL_MEMORY_CALLBACK,
// }

// UNSUPPORTED Rust 4782:1: declaration Impl has no candidate rule
// impl Default for RTL_SEGMENT_HEAP_VA_CALLBACKS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4787:1: non-scalar type Ptr unsupported
// pub const RTL_SYSTEM_VOLUME_INFORMATION_FOLDER: windows_sys::core::PCWSTR = windows_sys::core::w!("System Volume Information");

public const val `SECURITY_ANONYMOUS_LOGON_RID`: Int = 7;
// UNSUPPORTED Rust 4789:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct SECURITY_CLIENT_CONTEXT {
//     pub SecurityQos: super::super::super::Win32::Security::SECURITY_QUALITY_OF_SERVICE,
//     pub ClientToken: *mut core::ffi::c_void,
//     pub DirectlyAccessClientToken: bool,
//     pub DirectAccessEffectiveOnly: bool,
//     pub ServerIsRemote: bool,
//     pub ClientTokenControl: super::super::super::Win32::Security::TOKEN_CONTROL,
// }

// UNSUPPORTED Rust 4800:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for SECURITY_CLIENT_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4806:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Authentication_Identity")]
// #[derive(Clone, Copy)]
// pub struct SEC_APPLICATION_PROTOCOLS {
//     pub ProtocolListsSize: u32,
//     pub ProtocolLists: [super::super::super::Win32::Security::Authentication::Identity::SEC_APPLICATION_PROTOCOL_LIST; 1],
// }

// UNSUPPORTED Rust 4813:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Authentication_Identity")]
// impl Default for SEC_APPLICATION_PROTOCOLS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4819:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SEC_DTLS_MTU {
//     pub PathMTU: u16,
// }

// UNSUPPORTED Rust 4824:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SEC_FLAGS {
//     pub Flags: u64,
// }

// UNSUPPORTED Rust 4829:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SEC_NEGOTIATION_INFO {
//     pub Size: u32,
//     pub NameLength: u32,
//     pub Name: *mut u16,
//     pub Reserved: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 4837:1: declaration Impl has no candidate rule
// impl Default for SEC_NEGOTIATION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4842:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SEC_PRESHAREDKEY {
//     pub KeySize: u16,
//     pub Key: [u8; 1],
// }

// UNSUPPORTED Rust 4848:1: declaration Impl has no candidate rule
// impl Default for SEC_PRESHAREDKEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4853:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SEC_SRTP_MASTER_KEY_IDENTIFIER {
//     pub MasterKeyIdentifierSize: u8,
//     pub MasterKeyIdentifier: [u8; 1],
// }

// UNSUPPORTED Rust 4859:1: declaration Impl has no candidate rule
// impl Default for SEC_SRTP_MASTER_KEY_IDENTIFIER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SEGMENT_HEAP_FLG_USE_PAGE_HEAP`: UInt = 1u;
public const val `SEGMENT_HEAP_PARAMETERS_VERSION`: UInt = 3u;
public const val `SEGMENT_HEAP_PARAMS_VALID_FLAGS`: UInt = 1u;
public const val `SEMAPHORE_INCREMENT`: UInt = 1u;
// UNSUPPORTED Rust 4868:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SET_CACHED_RUNS_STATE_INPUT_BUFFER {
//     pub Enable: bool,
// }

public const val `SET_PURGE_FAILURE_MODE_DISABLED`: UInt = 2u;
// UNSUPPORTED Rust 4874:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct SE_AUDIT_INFO {
//     pub Size: u32,
//     pub AuditType: super::super::super::Win32::Security::AUDIT_EVENT_TYPE,
//     pub AuditOperation: SE_AUDIT_OPERATION,
//     pub AuditFlags: u32,
//     pub SubsystemName: super::super::super::Win32::Foundation::UNICODE_STRING,
//     pub ObjectTypeName: super::super::super::Win32::Foundation::UNICODE_STRING,
//     pub ObjectName: super::super::super::Win32::Foundation::UNICODE_STRING,
//     pub HandleId: *mut core::ffi::c_void,
//     pub TransactionId: *mut windows_sys::core::GUID,
//     pub OperationId: *mut super::super::super::Win32::Foundation::LUID,
//     pub ObjectCreation: bool,
//     pub GenerateOnClose: bool,
// }

// UNSUPPORTED Rust 4891:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for SE_AUDIT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SE_AUDIT_OPERATION` = Int;
public const val `SE_BACKUP_PRIVILEGES_CHECKED`: UInt = 256u;
public const val `SE_DACL_UNTRUSTED`: UInt = 64u;
// UNSUPPORTED Rust 4900:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct SE_EXPORTS {
//     pub SeCreateTokenPrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeAssignPrimaryTokenPrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeLockMemoryPrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeIncreaseQuotaPrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeUnsolicitedInputPrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeTcbPrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeSecurityPrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeTakeOwnershipPrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeLoadDriverPrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeCreatePagefilePrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeIncreaseBasePriorityPrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeSystemProfilePrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeSystemtimePrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeProfileSingleProcessPrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeCreatePermanentPrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeBackupPrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeRestorePrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeShutdownPrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeDebugPrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeAuditPrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeSystemEnvironmentPrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeChangeNotifyPrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeRemoteShutdownPrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeNullSid: super::super::super::Win32::Security::PSID,
//     pub SeWorldSid: super::super::super::Win32::Security::PSID,
//     pub SeLocalSid: super::super::super::Win32::Security::PSID,
//     pub SeCreatorOwnerSid: super::super::super::Win32::Security::PSID,
//     pub SeCreatorGroupSid: super::super::super::Win32::Security::PSID,
//     pub SeNtAuthoritySid: super::super::super::Win32::Security::PSID,
//     pub SeDialupSid: super::super::super::Win32::Security::PSID,
//     pub SeNetworkSid: super::super::super::Win32::Security::PSID,
//     pub SeBatchSid: super::super::super::Win32::Security::PSID,
//     pub SeInteractiveSid: super::super::super::Win32::Security::PSID,
//     pub SeLocalSystemSid: super::super::super::Win32::Security::PSID,
//     pub SeAliasAdminsSid: super::super::super::Win32::Security::PSID,
//     pub SeAliasUsersSid: super::super::super::Win32::Security::PSID,
//     pub SeAliasGuestsSid: super::super::super::Win32::Security::PSID,
//     pub SeAliasPowerUsersSid: super::super::super::Win32::Security::PSID,
//     pub SeAliasAccountOpsSid: super::super::super::Win32::Security::PSID,
//     pub SeAliasSystemOpsSid: super::super::super::Win32::Security::PSID,
//     pub SeAliasPrintOpsSid: super::super::super::Win32::Security::PSID,
//     pub SeAliasBackupOpsSid: super::super::super::Win32::Security::PSID,
//     pub SeAuthenticatedUsersSid: super::super::super::Win32::Security::PSID,
//     pub SeRestrictedSid: super::super::super::Win32::Security::PSID,
//     pub SeAnonymousLogonSid: super::super::super::Win32::Security::PSID,
//     pub SeUndockPrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeSyncAgentPrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeEnableDelegationPrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeLocalServiceSid: super::super::super::Win32::Security::PSID,
//     pub SeNetworkServiceSid: super::super::super::Win32::Security::PSID,
//     pub SeManageVolumePrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeImpersonatePrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeCreateGlobalPrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeTrustedCredManAccessPrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeRelabelPrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeIncreaseWorkingSetPrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeTimeZonePrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeCreateSymbolicLinkPrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeIUserSid: super::super::super::Win32::Security::PSID,
//     pub SeUntrustedMandatorySid: super::super::super::Win32::Security::PSID,
//     pub SeLowMandatorySid: super::super::super::Win32::Security::PSID,
//     pub SeMediumMandatorySid: super::super::super::Win32::Security::PSID,
//     pub SeHighMandatorySid: super::super::super::Win32::Security::PSID,
//     pub SeSystemMandatorySid: super::super::super::Win32::Security::PSID,
//     pub SeOwnerRightsSid: super::super::super::Win32::Security::PSID,
//     pub SeAllAppPackagesSid: super::super::super::Win32::Security::PSID,
//     pub SeUserModeDriversSid: super::super::super::Win32::Security::PSID,
//     pub SeProcTrustWinTcbSid: super::super::super::Win32::Security::PSID,
//     pub SeTrustedInstallerSid: super::super::super::Win32::Security::PSID,
//     pub SeDelegateSessionUserImpersonatePrivilege: super::super::super::Win32::Foundation::LUID,
//     pub SeAppSiloSid: super::super::super::Win32::Security::PSID,
//     pub SeAppSiloVolumeRootMinimalCapabilitySid: super::super::super::Win32::Security::PSID,
//     pub SeAppSiloProfilesRootMinimalCapabilitySid: super::super::super::Win32::Security::PSID,
// }

// UNSUPPORTED Rust 4978:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for SE_EXPORTS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4984:1: generic scalar type unsupported
// pub type SE_LOGON_SESSION_TERMINATED_ROUTINE = Option<unsafe extern "system" fn(logonid: *const super::super::super::Win32::Foundation::LUID) -> super::super::super::Win32::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 4985:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Wdk_Foundation")]
// pub type SE_LOGON_SESSION_TERMINATED_ROUTINE_EX = Option<unsafe extern "system" fn(logonid: *const super::super::super::Win32::Foundation::LUID, pserversilo: super::super::Foundation::PESILO, context: *const core::ffi::c_void) -> super::super::super::Win32::Foundation::NTSTATUS>;

public const val `SE_SERVER_SECURITY`: UInt = 128u;
public const val `SPECIAL_ENCRYPTED_OPEN`: UInt = 262144u;
public typealias `SRV_INSTANCE_TYPE` = Int;
// UNSUPPORTED Rust 4990:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct SRV_OPEN_ECP_CONTEXT {
//     pub ShareName: *mut super::super::super::Win32::Foundation::UNICODE_STRING,
//     pub SocketAddress: *mut super::super::super::Win32::Networking::WinSock::SOCKADDR_STORAGE,
//     pub OplockBlockState: bool,
//     pub OplockAppState: bool,
//     pub OplockFinalState: bool,
//     pub Version: u16,
//     pub InstanceType: SRV_INSTANCE_TYPE,
// }

// UNSUPPORTED Rust 5002:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for SRV_OPEN_ECP_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SRV_OPEN_ECP_CONTEXT_VERSION_2`: UInt = 2u;
public const val `SUPPORTED_FS_FEATURES_BYPASS_IO`: UInt = 8u;
public const val `SUPPORTED_FS_FEATURES_OFFLOAD_READ`: UInt = 1u;
public const val `SUPPORTED_FS_FEATURES_OFFLOAD_WRITE`: UInt = 2u;
public const val `SUPPORTED_FS_FEATURES_QUERY_OPEN`: UInt = 4u;
public const val `SYMLINK_DIRECTORY`: UInt = 2147483648u;
public const val `SYMLINK_FILE`: UInt = 1073741824u;
public const val `SYMLINK_FLAG_RELATIVE`: UInt = 1u;
public const val `SYMLINK_RESERVED_MASK`: UInt = 4026531840u;
public const val `SYSTEM_PAGE_PRIORITY_BITS`: UInt = 3u;
// UNSUPPORTED Rust 5018:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SYSTEM_PROCESS_TRUST_LABEL_ACE {
//     pub Header: ACE_HEADER,
//     pub Mask: u32,
//     pub SidStart: u32,
// }

// UNSUPPORTED Rust 5025:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecBuffer {
//     pub cbBuffer: u32,
//     pub BufferType: u32,
//     pub pvBuffer: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 5032:1: declaration Impl has no candidate rule
// impl Default for SecBuffer {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5037:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecBufferDesc {
//     pub ulVersion: u32,
//     pub cBuffers: u32,
//     pub pBuffers: *mut SecBuffer,
// }

// UNSUPPORTED Rust 5044:1: declaration Impl has no candidate rule
// impl Default for SecBufferDesc {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5049:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SecHandle {
//     pub dwLower: usize,
//     pub dwUpper: usize,
// }

public const val `SharedVirtualDiskCDPSnapshotsSupported`: `SharedVirtualDiskSupportType` = 7;
public typealias `SharedVirtualDiskHandleState` = Int;
public const val `SharedVirtualDiskHandleStateFileShared`: `SharedVirtualDiskHandleState` = 1;
public const val `SharedVirtualDiskHandleStateHandleShared`: `SharedVirtualDiskHandleState` = 3;
public const val `SharedVirtualDiskHandleStateNone`: `SharedVirtualDiskHandleState` = 0;
public const val `SharedVirtualDiskSnapshotsSupported`: `SharedVirtualDiskSupportType` = 3;
public typealias `SharedVirtualDiskSupportType` = Int;
public const val `SharedVirtualDisksSupported`: `SharedVirtualDiskSupportType` = 1;
public const val `SharedVirtualDisksUnsupported`: `SharedVirtualDiskSupportType` = 0;
public const val `SrvInstanceTypeCsv`: `SRV_INSTANCE_TYPE` = 2;
public const val `SrvInstanceTypePrimary`: `SRV_INSTANCE_TYPE` = 1;
public const val `SrvInstanceTypeSBL`: `SRV_INSTANCE_TYPE` = 3;
public const val `SrvInstanceTypeSR`: `SRV_INSTANCE_TYPE` = 4;
public const val `SrvInstanceTypeUndefined`: `SRV_INSTANCE_TYPE` = 0;
public const val `SrvInstanceTypeVSMB`: `SRV_INSTANCE_TYPE` = 5;
// UNSUPPORTED Rust 5070:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Wdk_Foundation")]
// pub type SspiAsyncNotifyCallback = Option<unsafe extern "system" fn(handle: *const super::super::Foundation::SspiAsyncContext, callbackdata: *const core::ffi::c_void)>;

public const val `SyncTypeCreateSection`: `FS_FILTER_SECTION_SYNC_TYPE` = 1;
public const val `SyncTypeOther`: `FS_FILTER_SECTION_SYNC_TYPE` = 0;
public const val `TOKEN_AUDIT_NO_CHILD_PROCESS`: UInt = 2097152u;
public const val `TOKEN_AUDIT_REDIRECTION_TRUST`: UInt = 8388608u;
public const val `TOKEN_DO_NOT_USE_GLOBAL_ATTRIBS_FOR_QUERY`: UInt = 131072u;
public const val `TOKEN_ENFORCE_REDIRECTION_TRUST`: UInt = 4194304u;
public const val `TOKEN_HAS_BACKUP_PRIVILEGE`: UInt = 2u;
public const val `TOKEN_HAS_IMPERSONATE_PRIVILEGE`: UInt = 128u;
public const val `TOKEN_HAS_OWN_CLAIM_ATTRIBUTES`: UInt = 32768u;
public const val `TOKEN_HAS_RESTORE_PRIVILEGE`: UInt = 4u;
public const val `TOKEN_HAS_TRAVERSE_PRIVILEGE`: UInt = 1u;
public const val `TOKEN_IS_FILTERED`: UInt = 2048u;
public const val `TOKEN_IS_RESTRICTED`: UInt = 16u;
public const val `TOKEN_LEARNING_MODE_LOGGING`: UInt = 16777216u;
public const val `TOKEN_LOWBOX`: UInt = 16384u;
public const val `TOKEN_NOT_LOW`: UInt = 8192u;
public const val `TOKEN_NO_CHILD_PROCESS`: UInt = 524288u;
public const val `TOKEN_NO_CHILD_PROCESS_UNLESS_SECURE`: UInt = 1048576u;
public const val `TOKEN_PERMISSIVE_LEARNING_MODE`: UInt = 50331648u;
public const val `TOKEN_PRIVATE_NAMESPACE`: UInt = 65536u;
public const val `TOKEN_SANDBOX_INERT`: UInt = 64u;
public const val `TOKEN_SESSION_NOT_REFERENCED`: UInt = 32u;
public const val `TOKEN_UIACCESS`: UInt = 4096u;
public const val `TOKEN_VIRTUALIZE_ALLOWED`: UInt = 512u;
public const val `TOKEN_VIRTUALIZE_ENABLED`: UInt = 1024u;
public const val `TOKEN_WRITE_RESTRICTED`: UInt = 8u;
// UNSUPPORTED Rust 5098:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// #[derive(Clone, Copy)]
// pub struct TUNNEL {
//     pub Mutex: super::super::Foundation::FAST_MUTEX,
//     pub Cache: *mut super::super::Foundation::RTL_SPLAY_LINKS,
//     pub TimerQueue: super::super::super::Win32::System::Kernel::LIST_ENTRY,
//     pub NumEntries: u16,
// }

// UNSUPPORTED Rust 5107:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_System_Kernel"))]
// impl Default for TUNNEL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5113:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Wdk_Foundation")]
// #[derive(Clone, Copy)]
// pub struct UNICODE_PREFIX_TABLE {
//     pub NodeTypeCode: i16,
//     pub NameLength: i16,
//     pub NextPrefixTree: *mut UNICODE_PREFIX_TABLE_ENTRY,
//     pub LastNextEntry: *mut UNICODE_PREFIX_TABLE_ENTRY,
// }

// UNSUPPORTED Rust 5122:1: declaration Impl has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// impl Default for UNICODE_PREFIX_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5128:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Wdk_Foundation")]
// #[derive(Clone, Copy)]
// pub struct UNICODE_PREFIX_TABLE_ENTRY {
//     pub NodeTypeCode: i16,
//     pub NameLength: i16,
//     pub NextPrefixTree: *mut UNICODE_PREFIX_TABLE_ENTRY,
//     pub CaseMatch: *mut UNICODE_PREFIX_TABLE_ENTRY,
//     pub Links: super::super::Foundation::RTL_SPLAY_LINKS,
//     pub Prefix: *mut super::super::super::Win32::Foundation::UNICODE_STRING,
// }

// UNSUPPORTED Rust 5139:1: declaration Impl has no candidate rule
// #[cfg(feature = "Wdk_Foundation")]
// impl Default for UNICODE_PREFIX_TABLE_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `UNINITIALIZE_CACHE_MAPS`: UInt = 1u;
public const val `USE_PRIMARY_PASSWORD`: UInt = 1u;
public const val `USN_DELETE_FLAG_DELETE`: UInt = 1u;
// UNSUPPORTED Rust 5148:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USN_JOURNAL_DATA {
//     pub UsnJournalID: u64,
//     pub FirstUsn: i64,
//     pub NextUsn: i64,
//     pub LowestValidUsn: i64,
//     pub MaxUsn: i64,
//     pub MaximumSize: u64,
//     pub AllocationDelta: u64,
//     pub MinSupportedMajorVersion: u16,
//     pub MaxSupportedMajorVersion: u16,
// }

// UNSUPPORTED Rust 5161:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USN_RECORD {
//     pub RecordLength: u32,
//     pub MajorVersion: u16,
//     pub MinorVersion: u16,
//     pub FileReferenceNumber: u64,
//     pub ParentFileReferenceNumber: u64,
//     pub Usn: i64,
//     pub TimeStamp: i64,
//     pub Reason: u32,
//     pub SourceInfo: u32,
//     pub SecurityId: u32,
//     pub FileAttributes: u32,
//     pub FileNameLength: u16,
//     pub FileNameOffset: u16,
//     pub FileName: [u16; 1],
// }

// UNSUPPORTED Rust 5179:1: declaration Impl has no candidate rule
// impl Default for USN_RECORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `VACB_MAPPING_GRANULARITY`: UInt = 262144u;
public const val `VACB_OFFSET_SHIFT`: UInt = 18u;
public const val `VALID_INHERIT_FLAGS`: UInt = 31u;
// UNSUPPORTED Rust 5187:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct VCN_RANGE_INPUT_BUFFER {
//     pub StartingVcn: i64,
//     pub ClusterCount: i64,
// }

public typealias `VIRTUAL_MEMORY_INFORMATION_CLASS` = Int;
public const val `VOLSNAPCONTROLTYPE`: UInt = 83u;
// UNSUPPORTED Rust 5195:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct VOLUME_REFS_INFO_BUFFER {
//     pub CacheSizeInBytes: i64,
//     pub AllocatedCacheInBytes: i64,
//     pub PopulatedCacheInBytes: i64,
//     pub InErrorCacheInBytes: i64,
//     pub MemoryUsedForCacheMetadata: i64,
//     pub CacheLineSize: u32,
//     pub CacheTransactionsOutstanding: i32,
//     pub CacheLinesFree: i32,
//     pub CacheLinesInError: i32,
//     pub CacheHitsInBytes: i64,
//     pub CacheMissesInBytes: i64,
//     pub CachePopulationUpdatesInBytes: i64,
//     pub CacheWriteThroughUpdatesInBytes: i64,
//     pub CacheInvalidationsInBytes: i64,
//     pub CacheOverReadsInBytes: i64,
//     pub MetadataWrittenBytes: i64,
//     pub CacheHitCounter: i32,
//     pub CacheMissCounter: i32,
//     pub CacheLineAllocationCounter: i32,
//     pub CacheInvalidationsCounter: i32,
//     pub CachePopulationUpdatesCounter: i32,
//     pub CacheWriteThroughUpdatesCounter: i32,
//     pub MaxCacheTransactionsOutstanding: i32,
//     pub DataWritesReallocationCount: i32,
//     pub DataInPlaceWriteCount: i32,
//     pub MetadataAllocationsFastTierCount: i32,
//     pub MetadataAllocationsSlowTierCount: i32,
//     pub DataAllocationsFastTierCount: i32,
//     pub DataAllocationsSlowTierCount: i32,
//     pub DestagesSlowTierToFastTier: i32,
//     pub DestagesFastTierToSlowTier: i32,
//     pub SlowTierDataFillRatio: i32,
//     pub FastTierDataFillRatio: i32,
//     pub SlowTierMetadataFillRatio: i32,
//     pub FastTierMetadataFillRatio: i32,
//     pub SlowToFastDestageReadLatency: i32,
//     pub SlowToFastDestageReadLatencyBase: i32,
//     pub SlowToFastDestageWriteLatency: i32,
//     pub SlowToFastDestageWriteLatencyBase: i32,
//     pub FastToSlowDestageReadLatency: i32,
//     pub FastToSlowDestageReadLatencyBase: i32,
//     pub FastToSlowDestageWriteLatency: i32,
//     pub FastToSlowDestageWriteLatencyBase: i32,
//     pub SlowTierContainerFillRatio: i32,
//     pub SlowTierContainerFillRatioBase: i32,
//     pub FastTierContainerFillRatio: i32,
//     pub FastTierContainerFillRatioBase: i32,
//     pub TreeUpdateLatency: i32,
//     pub TreeUpdateLatencyBase: i32,
//     pub CheckpointLatency: i32,
//     pub CheckpointLatencyBase: i32,
//     pub TreeUpdateCount: i32,
//     pub CheckpointCount: i32,
//     pub LogWriteCount: i32,
//     pub LogFillRatio: i32,
//     pub ReadCacheInvalidationsForOverwrite: i32,
//     pub ReadCacheInvalidationsForReuse: i32,
//     pub ReadCacheInvalidationsGeneral: i32,
//     pub ReadCacheChecksOnMount: i32,
//     pub ReadCacheIssuesOnMount: i32,
//     pub TrimLatency: i32,
//     pub TrimLatencyBase: i32,
//     pub DataCompactionCount: i32,
//     pub CompactionReadLatency: i32,
//     pub CompactionReadLatencyBase: i32,
//     pub CompactionWriteLatency: i32,
//     pub CompactionWriteLatencyBase: i32,
//     pub DataInPlaceWriteClusterCount: i64,
//     pub CompactionFailedDueToIneligibleContainer: i32,
//     pub CompactionFailedDueToMaxFragmentation: i32,
//     pub CompactedContainerFillRatio: i32,
//     pub CompactedContainerFillRatioBase: i32,
//     pub ContainerMoveRetryCount: i32,
//     pub ContainerMoveFailedDueToIneligibleContainer: i32,
//     pub CompactionFailureCount: i32,
//     pub ContainerMoveFailureCount: i32,
//     pub NumberOfDirtyMetadataPages: i64,
//     pub NumberOfDirtyTableListEntries: i32,
//     pub NumberOfDeleteQueueEntries: i32,
// }

public const val `VmPrefetchInformation`: `VIRTUAL_MEMORY_INFORMATION_CLASS` = 0;
public const val `WCIFS_REDIRECTION_FLAGS_CREATE_SERVICED_FROM_LAYER`: UInt = 1u;
public const val `WCIFS_REDIRECTION_FLAGS_CREATE_SERVICED_FROM_REGISTERED_LAYER`: UInt = 4u;
public const val `WCIFS_REDIRECTION_FLAGS_CREATE_SERVICED_FROM_REMOTE_LAYER`: UInt = 8u;
public const val `WCIFS_REDIRECTION_FLAGS_CREATE_SERVICED_FROM_SCRATCH`: UInt = 2u;
public typealias `_LCN_WEAK_REFERENCE_STATE` = Int;
public typealias `_REFS_STREAM_EXTENT_PROPERTIES` = Int;
