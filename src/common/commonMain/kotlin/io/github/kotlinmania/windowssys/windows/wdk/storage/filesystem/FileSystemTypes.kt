package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem

public fun interface ALLOCATE_VIRTUAL_MEMORY_EX_CALLBACKFn {
    public operator fun invoke(callbackcontext: Win32.Foundation.HANDLE, processhandle: Win32.Foundation.HANDLE, baseaddress: Long, regionsize: Long, allocationtype: UInt, pageprotection: UInt, extendedparameters: Long, extendedparametercount: UInt): Win32.Foundation.NTSTATUS
}

public typealias ALLOCATE_VIRTUAL_MEMORY_EX_CALLBACK = ALLOCATE_VIRTUAL_MEMORY_EX_CALLBACKFn?

public typealias CSV_DOWN_LEVEL_FILE_TYPE = Int

public typealias FAST_IO_POSSIBLE = Int

public typealias FILE_DISPOSITION_INFORMATION_EX_FLAGS = UInt

public typealias FILE_INFORMATION_CLASS = Int

public typealias FILE_KNOWN_FOLDER_TYPE = Int

public fun interface FREE_VIRTUAL_MEMORY_EX_CALLBACKFn {
    public operator fun invoke(callbackcontext: Win32.Foundation.HANDLE, processhandle: Win32.Foundation.HANDLE, baseaddress: Long, regionsize: Long, freetype: UInt): Win32.Foundation.NTSTATUS
}

public typealias FREE_VIRTUAL_MEMORY_EX_CALLBACK = FREE_VIRTUAL_MEMORY_EX_CALLBACKFn?

public typealias FSRTL_CHANGE_BACKING_TYPE = Int

public typealias FSRTL_COMPARISON_RESULT = Int

public typealias FS_FILTER_SECTION_SYNC_TYPE = Int

public typealias FS_FILTER_STREAM_FO_NOTIFICATION_TYPE = Int

public typealias FS_INFORMATION_CLASS = Int

public typealias HEAP_MEMORY_INFO_CLASS = Int

public typealias LINK_TRACKING_INFORMATION_TYPE = Int

public typealias MEMORY_INFORMATION_CLASS = Int

public typealias MMFLUSH_TYPE = Int

public typealias MSV1_0_AVID = Int

public typealias NETWORK_OPEN_INTEGRITY_QUALIFIER = Int

public typealias NETWORK_OPEN_LOCATION_QUALIFIER = Int

public typealias NTCREATEFILE_CREATE_DISPOSITION = UInt

public typealias NTCREATEFILE_CREATE_OPTIONS = UInt

public typealias OPLOCK_NOTIFY_REASON = Int

public fun interface PACQUIRE_FOR_LAZY_WRITEFn {
    public operator fun invoke(context: Long, wait: Boolean): Boolean
}

public typealias PACQUIRE_FOR_LAZY_WRITE = PACQUIRE_FOR_LAZY_WRITEFn?

public fun interface PACQUIRE_FOR_LAZY_WRITE_EXFn {
    public operator fun invoke(context: Long, inflags: UInt, outflags: Long): Boolean
}

public typealias PACQUIRE_FOR_LAZY_WRITE_EX = PACQUIRE_FOR_LAZY_WRITE_EXFn?

public fun interface PACQUIRE_FOR_READ_AHEADFn {
    public operator fun invoke(context: Long, wait: Boolean): Boolean
}

public typealias PACQUIRE_FOR_READ_AHEAD = PACQUIRE_FOR_READ_AHEADFn?

public fun interface PALLOCATE_VIRTUAL_MEMORY_EX_CALLBACKFn {
    public operator fun invoke(): Win32.Foundation.NTSTATUS
}

public typealias PALLOCATE_VIRTUAL_MEMORY_EX_CALLBACK = PALLOCATE_VIRTUAL_MEMORY_EX_CALLBACKFn?

public fun interface PASYNC_READ_COMPLETION_CALLBACKFn {
    public operator fun invoke(context: Long): Boolean
}

public typealias PASYNC_READ_COMPLETION_CALLBACK = PASYNC_READ_COMPLETION_CALLBACKFn?

public fun interface PCC_POST_DEFERRED_WRITEFn {
    public operator fun invoke(context1: Long, context2: Long)
}

public typealias PCC_POST_DEFERRED_WRITE = PCC_POST_DEFERRED_WRITEFn?

public fun interface PCHECK_FOR_TRAVERSE_ACCESSFn {
    public operator fun invoke(notifycontext: Long, targetcontext: Long, subjectcontext: Long): Boolean
}

public typealias PCHECK_FOR_TRAVERSE_ACCESS = PCHECK_FOR_TRAVERSE_ACCESSFn?

public fun interface PCOMPLETE_LOCK_IRP_ROUTINEFn {
    public operator fun invoke(context: Long, irp: Long): Win32.Foundation.NTSTATUS
}

public typealias PCOMPLETE_LOCK_IRP_ROUTINE = PCOMPLETE_LOCK_IRP_ROUTINEFn?

public fun interface PDIRTY_PAGE_ROUTINEFn {
    public operator fun invoke(fileobject: Long, fileoffset: Long, length: UInt, oldestlsn: Long, newestlsn: Long, context1: Long, context2: Long)
}

public typealias PDIRTY_PAGE_ROUTINE = PDIRTY_PAGE_ROUTINEFn?

public fun interface PFILTER_REPORT_CHANGEFn {
    public operator fun invoke(notifycontext: Long, filtercontext: Long): Boolean
}

public typealias PFILTER_REPORT_CHANGE = PFILTER_REPORT_CHANGEFn?

public fun interface PFLUSH_TO_LSNFn {
    public operator fun invoke(loghandle: Long, lsn: Long)
}

public typealias PFLUSH_TO_LSN = PFLUSH_TO_LSNFn?

public fun interface PFN_FSRTLTEARDOWNPERSTREAMCONTEXTSFn {
    public operator fun invoke(advancedheader: Long)
}

public typealias PFN_FSRTLTEARDOWNPERSTREAMCONTEXTS = PFN_FSRTLTEARDOWNPERSTREAMCONTEXTSFn?

public fun interface PFREE_VIRTUAL_MEMORY_EX_CALLBACKFn {
    public operator fun invoke(): Win32.Foundation.NTSTATUS
}

public typealias PFREE_VIRTUAL_MEMORY_EX_CALLBACK = PFREE_VIRTUAL_MEMORY_EX_CALLBACKFn?

public fun interface PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACKFn {
    public operator fun invoke(ecpcontext: Long, ecptype: Long)
}

public typealias PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK = PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACKFn?

public fun interface PFSRTL_STACK_OVERFLOW_ROUTINEFn {
    public operator fun invoke(context: Long, event: Long)
}

public typealias PFSRTL_STACK_OVERFLOW_ROUTINE = PFSRTL_STACK_OVERFLOW_ROUTINEFn?

public fun interface PFS_FILTER_CALLBACKFn {
    public operator fun invoke(data: Long, completioncontext: Long): Win32.Foundation.NTSTATUS
}

public typealias PFS_FILTER_CALLBACK = PFS_FILTER_CALLBACKFn?

public fun interface PFS_FILTER_COMPLETION_CALLBACKFn {
    public operator fun invoke(data: Long, operationstatus: Win32.Foundation.NTSTATUS, completioncontext: Long)
}

public typealias PFS_FILTER_COMPLETION_CALLBACK = PFS_FILTER_COMPLETION_CALLBACKFn?

public fun interface POPLOCK_FS_PREPOST_IRPFn {
    public operator fun invoke(context: Long, irp: Long)
}

public typealias POPLOCK_FS_PREPOST_IRP = POPLOCK_FS_PREPOST_IRPFn?

public fun interface POPLOCK_NOTIFY_ROUTINEFn {
    public operator fun invoke(notifyparams: Long): Win32.Foundation.NTSTATUS
}

public typealias POPLOCK_NOTIFY_ROUTINE = POPLOCK_NOTIFY_ROUTINEFn?

public fun interface POPLOCK_WAIT_COMPLETE_ROUTINEFn {
    public operator fun invoke(context: Long, irp: Long)
}

public typealias POPLOCK_WAIT_COMPLETE_ROUTINE = POPLOCK_WAIT_COMPLETE_ROUTINEFn?

public fun interface PQUERY_LOG_USAGEFn {
    public operator fun invoke(loghandle: Long, percentagefull: Long)
}

public typealias PQUERY_LOG_USAGE = PQUERY_LOG_USAGEFn?

public fun interface PQUERY_VIRTUAL_MEMORY_CALLBACKFn {
    public operator fun invoke(): Win32.Foundation.NTSTATUS
}

public typealias PQUERY_VIRTUAL_MEMORY_CALLBACK = PQUERY_VIRTUAL_MEMORY_CALLBACKFn?

public fun interface PRELEASE_FROM_LAZY_WRITEFn {
    public operator fun invoke(context: Long)
}

public typealias PRELEASE_FROM_LAZY_WRITE = PRELEASE_FROM_LAZY_WRITEFn?

public fun interface PRELEASE_FROM_READ_AHEADFn {
    public operator fun invoke(context: Long)
}

public typealias PRELEASE_FROM_READ_AHEAD = PRELEASE_FROM_READ_AHEADFn?

public fun interface PRTL_ALLOCATE_STRING_ROUTINEFn {
    public operator fun invoke(): Long
}

public typealias PRTL_ALLOCATE_STRING_ROUTINE = PRTL_ALLOCATE_STRING_ROUTINEFn?

public fun interface PRTL_FREE_STRING_ROUTINEFn {
    public operator fun invoke()
}

public typealias PRTL_FREE_STRING_ROUTINE = PRTL_FREE_STRING_ROUTINEFn?

public fun interface PRTL_HEAP_COMMIT_ROUTINEFn {
    public operator fun invoke(): Win32.Foundation.NTSTATUS
}

public typealias PRTL_HEAP_COMMIT_ROUTINE = PRTL_HEAP_COMMIT_ROUTINEFn?

public fun interface PRTL_REALLOCATE_STRING_ROUTINEFn {
    public operator fun invoke(): Long
}

public typealias PRTL_REALLOCATE_STRING_ROUTINE = PRTL_REALLOCATE_STRING_ROUTINEFn?

public fun interface PSE_LOGON_SESSION_TERMINATED_ROUTINEFn {
    public operator fun invoke(): Win32.Foundation.NTSTATUS
}

public typealias PSE_LOGON_SESSION_TERMINATED_ROUTINE = PSE_LOGON_SESSION_TERMINATED_ROUTINEFn?

public fun interface PSE_LOGON_SESSION_TERMINATED_ROUTINE_EXFn {
    public operator fun invoke(): Win32.Foundation.NTSTATUS
}

public typealias PSE_LOGON_SESSION_TERMINATED_ROUTINE_EX = PSE_LOGON_SESSION_TERMINATED_ROUTINE_EXFn?

public fun interface PUNLOCK_ROUTINEFn {
    public operator fun invoke(context: Long, filelockinfo: Long)
}

public typealias PUNLOCK_ROUTINE = PUNLOCK_ROUTINEFn?

public fun interface QUERY_VIRTUAL_MEMORY_CALLBACKFn {
    public operator fun invoke(callbackcontext: Win32.Foundation.HANDLE, processhandle: Win32.Foundation.HANDLE, baseaddress: Long, memoryinformationclass: HEAP_MEMORY_INFO_CLASS, memoryinformation: Long, memoryinformationlength: ULong, returnlength: Long): Win32.Foundation.NTSTATUS
}

public typealias QUERY_VIRTUAL_MEMORY_CALLBACK = QUERY_VIRTUAL_MEMORY_CALLBACKFn?

public typealias REFS_COMPRESSION_FORMATS = Int

public typealias REFS_DEALLOCATE_RANGES_ALLOCATOR = Int

public typealias REFS_SET_VOLUME_COMPRESSION_INFO_FLAGS = Int

public typealias REFS_STREAM_SNAPSHOT_OPERATION = Int

public fun interface RTL_ALLOCATE_STRING_ROUTINEFn {
    public operator fun invoke(numberofbytes: ULong): Long
}

public typealias RTL_ALLOCATE_STRING_ROUTINE = RTL_ALLOCATE_STRING_ROUTINEFn?

public fun interface RTL_FREE_STRING_ROUTINEFn {
    public operator fun invoke(buffer: Long)
}

public typealias RTL_FREE_STRING_ROUTINE = RTL_FREE_STRING_ROUTINEFn?

public fun interface RTL_HEAP_COMMIT_ROUTINEFn {
    public operator fun invoke(base: Long, commitaddress: Long, commitsize: Long): Win32.Foundation.NTSTATUS
}

public typealias RTL_HEAP_COMMIT_ROUTINE = RTL_HEAP_COMMIT_ROUTINEFn?

public typealias RTL_MEMORY_TYPE = Int

public fun interface RTL_REALLOCATE_STRING_ROUTINEFn {
    public operator fun invoke(numberofbytes: ULong, buffer: Long): Long
}

public typealias RTL_REALLOCATE_STRING_ROUTINE = RTL_REALLOCATE_STRING_ROUTINEFn?

public typealias SE_AUDIT_OPERATION = Int

public fun interface SE_LOGON_SESSION_TERMINATED_ROUTINEFn {
    public operator fun invoke(logonid: Long): Win32.Foundation.NTSTATUS
}

public typealias SE_LOGON_SESSION_TERMINATED_ROUTINE = SE_LOGON_SESSION_TERMINATED_ROUTINEFn?

public fun interface SE_LOGON_SESSION_TERMINATED_ROUTINE_EXFn {
    public operator fun invoke(logonid: Long, pserversilo: Foundation.PESILO, context: Long): Win32.Foundation.NTSTATUS
}

public typealias SE_LOGON_SESSION_TERMINATED_ROUTINE_EX = SE_LOGON_SESSION_TERMINATED_ROUTINE_EXFn?

public typealias SRV_INSTANCE_TYPE = Int

public typealias SharedVirtualDiskHandleState = Int

public typealias SharedVirtualDiskSupportType = Int

public fun interface SspiAsyncNotifyCallbackFn {
    public operator fun invoke(handle: Long, callbackdata: Long)
}

public typealias SspiAsyncNotifyCallback = SspiAsyncNotifyCallbackFn?

public typealias VIRTUAL_MEMORY_INFORMATION_CLASS = Int

public typealias _LCN_WEAK_REFERENCE_STATE = Int

public typealias _REFS_STREAM_EXTENT_PROPERTIES = Int
