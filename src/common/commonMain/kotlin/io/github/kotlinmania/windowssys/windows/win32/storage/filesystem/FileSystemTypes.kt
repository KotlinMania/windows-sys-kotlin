package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

public fun interface CACHE_ACCESS_CHECKFn {
    public operator fun invoke(psecuritydescriptor: PSECURITY_DESCRIPTOR, hclienttoken: HANDLE, dwdesiredaccess: UInt, genericmapping: Long, privilegeset: Long, privilegesetlength: Long, grantedaccess: Long, accessstatus: Long): BOOL
}

public typealias CACHE_ACCESS_CHECK = CACHE_ACCESS_CHECKFn?

public fun interface CACHE_DESTROY_CALLBACKFn {
    public operator fun invoke(cb: UInt, lpb: Long)
}

public typealias CACHE_DESTROY_CALLBACK = CACHE_DESTROY_CALLBACKFn?

public fun interface CACHE_KEY_COMPAREFn {
    public operator fun invoke(cbkey1: UInt, lpbkey1: Long, cbkey2: UInt, lpbkey2: Long): Int
}

public typealias CACHE_KEY_COMPARE = CACHE_KEY_COMPAREFn?

public fun interface CACHE_KEY_HASHFn {
    public operator fun invoke(lpbkey: Long, cbkey: UInt): UInt
}

public typealias CACHE_KEY_HASH = CACHE_KEY_HASHFn?

public fun interface CACHE_READ_CALLBACKFn {
    public operator fun invoke(cb: UInt, lpb: Long, lpvcontext: Long): BOOL
}

public typealias CACHE_READ_CALLBACK = CACHE_READ_CALLBACKFn?

public fun interface CLAIMMEDIALABELFn {
    public operator fun invoke(pbuffer: Long, nbuffersize: UInt, plabelinfo: Long): UInt
}

public typealias CLAIMMEDIALABEL = CLAIMMEDIALABELFn?

public fun interface CLAIMMEDIALABELEXFn {
    public operator fun invoke(pbuffer: Long, nbuffersize: UInt, plabelinfo: Long, labelguid: Long): UInt
}

public typealias CLAIMMEDIALABELEX = CLAIMMEDIALABELEXFn?

public fun interface CLFS_BLOCK_ALLOCATIONFn {
    public operator fun invoke(cbbufferlength: UInt, pvusercontext: Long): Long
}

public typealias CLFS_BLOCK_ALLOCATION = CLFS_BLOCK_ALLOCATIONFn?

public fun interface CLFS_BLOCK_DEALLOCATIONFn {
    public operator fun invoke(pvbuffer: Long, pvusercontext: Long)
}

public typealias CLFS_BLOCK_DEALLOCATION = CLFS_BLOCK_DEALLOCATIONFn?

public typealias CLFS_CONTEXT_MODE = Int

public typealias CLFS_FLAG = UInt

public typealias CLFS_IOSTATS_CLASS = Int

public typealias CLFS_LOG_ARCHIVE_MODE = Int

public typealias CLFS_MGMT_NOTIFICATION_TYPE = Int

public typealias CLFS_MGMT_POLICY_TYPE = Int

public typealias CLS_CONTEXT_MODE = Int

public typealias CLS_IOSTATS_CLASS = Int

public typealias CLS_LOG_INFORMATION_CLASS = Int

public typealias COMPRESSION_FORMAT = UShort

public typealias COPYFILE2_COPY_PHASE = Int

public typealias COPYFILE2_MESSAGE_ACTION = Int

public typealias COPYFILE2_MESSAGE_TYPE = Int

public typealias COPYFILE2_V2_FLAGS = UInt

public typealias COPYFILE_FLAGS = UInt

public typealias COPYPROGRESSROUTINE_PROGRESS = UInt

public typealias CREATE_TAPE_PARTITION_METHOD = UInt

public typealias DEFINE_DOS_DEVICE_FLAGS = UInt

public typealias DISKQUOTA_USERNAME_RESOLVE = UInt

public typealias ERASE_TAPE_TYPE = UInt

public fun interface FCACHE_CREATE_CALLBACKFn {
    public operator fun invoke(lpstrname: PCSTR, lpvdata: Long, cbfilesize: Long, cbfilesizehigh: Long): HANDLE
}

public typealias FCACHE_CREATE_CALLBACK = FCACHE_CREATE_CALLBACKFn?

public fun interface FCACHE_RICHCREATE_CALLBACKFn {
    public operator fun invoke(lpstrname: PCSTR, lpvdata: Long, cbfilesize: Long, cbfilesizehigh: Long, pfdidwescanit: Long, pfisstuffed: Long, pfstoredwithdots: Long, pfstoredwithterminatingdot: Long): HANDLE
}

public typealias FCACHE_RICHCREATE_CALLBACK = FCACHE_RICHCREATE_CALLBACKFn?

public typealias FILE_ACCESS_RIGHTS = UInt

public typealias FILE_ACTION = UInt

public typealias FILE_CREATION_DISPOSITION = UInt

public typealias FILE_DEVICE_TYPE = UInt

public typealias FILE_DISPOSITION_INFO_EX_FLAGS = UInt

public typealias FILE_FLAGS_AND_ATTRIBUTES = UInt

public typealias FILE_FLUSH_MODE = Int

public typealias FILE_ID_TYPE = Int

public typealias FILE_INFO_BY_HANDLE_CLASS = Int

public typealias FILE_INFO_FLAGS_PERMISSIONS = UInt

public typealias FILE_NOTIFY_CHANGE = UInt

public typealias FILE_SHARE_MODE = UInt

public typealias FILE_TYPE = UInt

public typealias FILE_WRITE_FLAGS = Int

public typealias FINDEX_INFO_LEVELS = Int

public typealias FINDEX_SEARCH_OPS = Int

public typealias FIND_FIRST_EX_FLAGS = UInt

public typealias GETFINALPATHNAMEBYHANDLE_FLAGS = UInt

public typealias GET_FILEEX_INFO_LEVELS = Int

public typealias GET_FILE_VERSION_INFO_FLAGS = UInt

public typealias GET_TAPE_DRIVE_PARAMETERS_OPERATION = UInt

public typealias HIORING = Long

public typealias IORING_CREATE_ADVISORY_FLAGS = Int

public typealias IORING_CREATE_REQUIRED_FLAGS = Int

public typealias IORING_FEATURE_FLAGS = Int

public typealias IORING_OP_CODE = Int

public typealias IORING_REF_KIND = Int

public typealias IORING_SQE_FLAGS = Int

public typealias IORING_VERSION = Int

public typealias LOCK_FILE_FLAGS = UInt

public fun interface LPPROGRESS_ROUTINEFn {
    public operator fun invoke(totalfilesize: Long, totalbytestransferred: Long, streamsize: Long, streambytestransferred: Long, dwstreamnumber: UInt, dwcallbackreason: LPPROGRESS_ROUTINE_CALLBACK_REASON, hsourcefile: HANDLE, hdestinationfile: HANDLE, lpdata: Long): COPYPROGRESSROUTINE_PROGRESS
}

public typealias LPPROGRESS_ROUTINE = LPPROGRESS_ROUTINEFn?

public typealias LPPROGRESS_ROUTINE_CALLBACK_REASON = UInt

public typealias LZOPENFILE_STYLE = UShort

public fun interface MAXMEDIALABELFn {
    public operator fun invoke(pmaxsize: Long): UInt
}

public typealias MAXMEDIALABEL = MAXMEDIALABELFn?

public typealias MOVE_FILE_FLAGS = UInt

public typealias NTMS_OMID_TYPE = UInt

public typealias NtmsAccessMask = Int

public typealias NtmsAllocateOptions = Int

public typealias NtmsAllocationPolicy = Int

public typealias NtmsAsyncOperations = Int

public typealias NtmsAsyncStatus = Int

public typealias NtmsBarCodeState = Int

public typealias NtmsCreateNtmsMediaOptions = Int

public typealias NtmsCreateOptions = Int

public typealias NtmsDeallocationPolicy = Int

public typealias NtmsDismountOptions = Int

public typealias NtmsDoorState = Int

public typealias NtmsDriveState = Int

public typealias NtmsDriveType = Int

public typealias NtmsEjectOperation = Int

public typealias NtmsEnumerateOption = Int

public typealias NtmsInjectOperation = Int

public typealias NtmsInventoryMethod = Int

public typealias NtmsLibRequestFlags = Int

public typealias NtmsLibraryFlags = Int

public typealias NtmsLibraryType = Int

public typealias NtmsLmOperation = Int

public typealias NtmsLmState = Int

public typealias NtmsMediaPoolPolicy = Int

public typealias NtmsMediaState = Int

public typealias NtmsMountOptions = Int

public typealias NtmsMountPriority = Int

public typealias NtmsNotificationOperations = Int

public typealias NtmsObjectsTypes = Int

public typealias NtmsOpRequestFlags = Int

public typealias NtmsOperationalState = Int

public typealias NtmsOpreqCommand = Int

public typealias NtmsOpreqState = Int

public typealias NtmsPartitionState = Int

public typealias NtmsPoolType = Int

public typealias NtmsPortContent = Int

public typealias NtmsPortPosition = Int

public typealias NtmsReadWriteCharacteristics = Int

public typealias NtmsSessionOptions = Int

public typealias NtmsSlotState = Int

public typealias NtmsUIOperations = Int

public typealias NtmsUITypes = Int

public fun interface PCLFS_COMPLETION_ROUTINEFn {
    public operator fun invoke(pvoverlapped: Long, ulreserved: UInt)
}

public typealias PCLFS_COMPLETION_ROUTINE = PCLFS_COMPLETION_ROUTINEFn?

public fun interface PCOPYFILE2_PROGRESS_ROUTINEFn {
    public operator fun invoke(pmessage: Long, pvcallbackcontext: Long): COPYFILE2_MESSAGE_ACTION
}

public typealias PCOPYFILE2_PROGRESS_ROUTINE = PCOPYFILE2_PROGRESS_ROUTINEFn?

public fun interface PFE_EXPORT_FUNCFn {
    public operator fun invoke(pbdata: Long, pvcallbackcontext: Long, ullength: UInt): UInt
}

public typealias PFE_EXPORT_FUNC = PFE_EXPORT_FUNCFn?

public fun interface PFE_IMPORT_FUNCFn {
    public operator fun invoke(pbdata: Long, pvcallbackcontext: Long, ullength: Long): UInt
}

public typealias PFE_IMPORT_FUNC = PFE_IMPORT_FUNCFn?

public fun interface PFN_IO_COMPLETIONFn {
    public operator fun invoke(pcontext: Long, lpo: Long, cb: UInt, dwcompletionstatus: UInt)
}

public typealias PFN_IO_COMPLETION = PFN_IO_COMPLETIONFn?

public fun interface PLOG_FULL_HANDLER_CALLBACKFn {
    public operator fun invoke(hlogfile: HANDLE, dwerror: UInt, flogispinned: BOOL, pvclientcontext: Long)
}

public typealias PLOG_FULL_HANDLER_CALLBACK = PLOG_FULL_HANDLER_CALLBACKFn?

public fun interface PLOG_TAIL_ADVANCE_CALLBACKFn {
    public operator fun invoke(hlogfile: HANDLE, lsntarget: CLS_LSN, pvclientcontext: Long)
}

public typealias PLOG_TAIL_ADVANCE_CALLBACK = PLOG_TAIL_ADVANCE_CALLBACKFn?

public fun interface PLOG_UNPINNED_CALLBACKFn {
    public operator fun invoke(hlogfile: HANDLE, pvclientcontext: Long)
}

public typealias PLOG_UNPINNED_CALLBACK = PLOG_UNPINNED_CALLBACKFn?

public typealias PREPARE_TAPE_OPERATION = UInt

public typealias PRIORITY_HINT = Int

public typealias READ_DIRECTORY_NOTIFY_INFORMATION_CLASS = Int

public typealias REPLACE_FILE_FLAGS = UInt

public typealias SERVER_CERTIFICATE_TYPE = Int

public typealias SESSION_INFO_USER_FLAGS = UInt

public typealias SET_FILE_POINTER_MOVE_METHOD = UInt

public typealias SHARE_INFO_PERMISSIONS = UInt

public typealias SHARE_TYPE = UInt

public typealias STORAGE_BUS_TYPE = Int

public typealias STREAM_INFO_LEVELS = Int

public typealias SYMBOLIC_LINK_FLAGS = UInt

public typealias TAPEMARK_TYPE = UInt

public typealias TAPE_INFORMATION_TYPE = UInt

public typealias TAPE_POSITION_METHOD = UInt

public typealias TAPE_POSITION_TYPE = UInt

public typealias TRANSACTION_OUTCOME = Int

public typealias TXFS_MINIVERSION = UInt

public typealias TXF_LOG_RECORD_TYPE = UShort

public typealias VER_FIND_FILE_FLAGS = UInt

public typealias VER_FIND_FILE_STATUS = UInt

public typealias VER_INSTALL_FILE_FLAGS = UInt

public typealias VER_INSTALL_FILE_STATUS = UInt

public typealias VS_FIXEDFILEINFO_FILE_FLAGS = UInt

public typealias VS_FIXEDFILEINFO_FILE_OS = UInt

public typealias VS_FIXEDFILEINFO_FILE_SUBTYPE = Int

public typealias VS_FIXEDFILEINFO_FILE_TYPE = Int

public typealias WIN_STREAM_ID = UInt

public fun interface WofEnumEntryProcFn {
    public operator fun invoke(entryinfo: Long, userdata: Long): BOOL
}

public typealias WofEnumEntryProc = WofEnumEntryProcFn?

public fun interface WofEnumFilesProcFn {
    public operator fun invoke(filepath: PCWSTR, externalfileinfo: Long, userdata: Long): BOOL
}

public typealias WofEnumFilesProc = WofEnumFilesProcFn?
