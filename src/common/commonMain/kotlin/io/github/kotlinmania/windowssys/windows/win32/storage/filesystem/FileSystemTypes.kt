package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.GenericMapping
import io.github.kotlinmania.windowssys.windows.win32.security.PrivilegeSet
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

public fun interface CacheAccessCheckFn {
    public operator fun invoke(psecuritydescriptor: PsecurityDescriptor, hclienttoken: Handle, dwdesiredaccess: UInt, genericmapping: MutPtr<GenericMapping>, privilegeset: MutPtr<PrivilegeSet>, privilegesetlength: MutPtr<UInt>, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Bool>): Bool
}

public typealias CacheAccessCheck = CacheAccessCheckFn?

public fun interface CacheDestroyCallbackFn {
    public operator fun invoke(cb: UInt, lpb: MutPtr<UByte>)
}

public typealias CacheDestroyCallback = CacheDestroyCallbackFn?

public fun interface CacheKeyCompareFn {
    public operator fun invoke(cbkey1: UInt, lpbkey1: MutPtr<UByte>, cbkey2: UInt, lpbkey2: MutPtr<UByte>): Int
}

public typealias CacheKeyCompare = CacheKeyCompareFn?

public fun interface CacheKeyHashFn {
    public operator fun invoke(lpbkey: MutPtr<UByte>, cbkey: UInt): UInt
}

public typealias CacheKeyHash = CacheKeyHashFn?

public fun interface CacheReadCallbackFn {
    public operator fun invoke(cb: UInt, lpb: MutPtr<UByte>, lpvcontext: MutPtr<CVoid>): Bool
}

public typealias CacheReadCallback = CacheReadCallbackFn?

public fun interface ClaimmedialabelFn {
    public operator fun invoke(pbuffer: ConstPtr<UByte>, nbuffersize: UInt, plabelinfo: MutPtr<MediaLabelInfo>): UInt
}

public typealias Claimmedialabel = ClaimmedialabelFn?

public fun interface ClaimmedialabelexFn {
    public operator fun invoke(pbuffer: ConstPtr<UByte>, nbuffersize: UInt, plabelinfo: MutPtr<MediaLabelInfo>, labelguid: MutPtr<Guid>): UInt
}

public typealias Claimmedialabelex = ClaimmedialabelexFn?

public fun interface ClfsBlockAllocationFn {
    public operator fun invoke(cbbufferlength: UInt, pvusercontext: MutPtr<CVoid>): MutPtr<CVoid>
}

public typealias ClfsBlockAllocation = ClfsBlockAllocationFn?

public fun interface ClfsBlockDeallocationFn {
    public operator fun invoke(pvbuffer: MutPtr<CVoid>, pvusercontext: MutPtr<CVoid>)
}

public typealias ClfsBlockDeallocation = ClfsBlockDeallocationFn?

public typealias ClfsContextMode = Int

public typealias ClfsFlag = UInt

public typealias ClfsIostatsClass = Int

public typealias ClfsLogArchiveMode = Int

public typealias ClfsMgmtNotificationType = Int

public typealias ClfsMgmtPolicyType = Int

public typealias ClsContextMode = Int

public typealias ClsIostatsClass = Int

public typealias ClsLogInformationClass = Int

public typealias CompressionFormat = UShort

public typealias Copyfile2CopyPhase = Int

public typealias Copyfile2MessageAction = Int

public typealias Copyfile2MessageType = Int

public typealias Copyfile2V2Flags = UInt

public typealias CopyfileFlags = UInt

public typealias CopyprogressroutineProgress = UInt

public typealias CreateTapePartitionMethod = UInt

public typealias DefineDosDeviceFlags = UInt

public typealias DiskquotaUsernameResolve = UInt

public typealias EraseTapeType = UInt

public fun interface FcacheCreateCallbackFn {
    public operator fun invoke(lpstrname: Pcstr, lpvdata: MutPtr<CVoid>, cbfilesize: MutPtr<UInt>, cbfilesizehigh: MutPtr<UInt>): Handle
}

public typealias FcacheCreateCallback = FcacheCreateCallbackFn?

public fun interface FcacheRichcreateCallbackFn {
    public operator fun invoke(lpstrname: Pcstr, lpvdata: MutPtr<CVoid>, cbfilesize: MutPtr<UInt>, cbfilesizehigh: MutPtr<UInt>, pfdidwescanit: MutPtr<Bool>, pfisstuffed: MutPtr<Bool>, pfstoredwithdots: MutPtr<Bool>, pfstoredwithterminatingdot: MutPtr<Bool>): Handle
}

public typealias FcacheRichcreateCallback = FcacheRichcreateCallbackFn?

public typealias FileAccessRights = UInt

public typealias FileAction = UInt

public typealias FileCreationDisposition = UInt

public typealias FileDeviceType = UInt

public typealias FileDispositionInfoExFlags = UInt

public typealias FileFlagsAndAttributes = UInt

public typealias FileFlushMode = Int

public typealias FileIdType = Int

public typealias FileInfoByHandleClass = Int

public typealias FileInfoFlagsPermissions = UInt

public typealias FileNotifyChange = UInt

public typealias FileShareMode = UInt

public typealias FileType = UInt

public typealias FileWriteFlags = Int

public typealias FindexInfoLevels = Int

public typealias FindexSearchOps = Int

public typealias FindFirstExFlags = UInt

public typealias GetfinalpathnamebyhandleFlags = UInt

public typealias GetFileexInfoLevels = Int

public typealias GetFileVersionInfoFlags = UInt

public typealias GetTapeDriveParametersOperation = UInt

public typealias Hioring = MutPtr<CVoid>

public typealias IoringCreateAdvisoryFlags = Int

public typealias IoringCreateRequiredFlags = Int

public typealias IoringFeatureFlags = Int

public typealias IoringOpCode = Int

public typealias IoringRefKind = Int

public typealias IoringSqeFlags = Int

public typealias IoringVersion = Int

public typealias LockFileFlags = UInt

public fun interface LpprogressRoutineFn {
    public operator fun invoke(totalfilesize: Long, totalbytestransferred: Long, streamsize: Long, streambytestransferred: Long, dwstreamnumber: UInt, dwcallbackreason: LpprogressRoutineCallbackReason, hsourcefile: Handle, hdestinationfile: Handle, lpdata: ConstPtr<CVoid>): CopyprogressroutineProgress
}

public typealias LpprogressRoutine = LpprogressRoutineFn?

public typealias LpprogressRoutineCallbackReason = UInt

public typealias LzopenfileStyle = UShort

public fun interface MaxmedialabelFn {
    public operator fun invoke(pmaxsize: MutPtr<UInt>): UInt
}

public typealias Maxmedialabel = MaxmedialabelFn?

public typealias MoveFileFlags = UInt

public typealias NtmsOmidType = UInt

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

public fun interface PclfsCompletionRoutineFn {
    public operator fun invoke(pvoverlapped: MutPtr<CVoid>, ulreserved: UInt)
}

public typealias PclfsCompletionRoutine = PclfsCompletionRoutineFn?

public fun interface Pcopyfile2ProgressRoutineFn {
    public operator fun invoke(pmessage: ConstPtr<Copyfile2Message>, pvcallbackcontext: ConstPtr<CVoid>): Copyfile2MessageAction
}

public typealias Pcopyfile2ProgressRoutine = Pcopyfile2ProgressRoutineFn?

public fun interface PfeExportFuncFn {
    public operator fun invoke(pbdata: ConstPtr<UByte>, pvcallbackcontext: ConstPtr<CVoid>, ullength: UInt): UInt
}

public typealias PfeExportFunc = PfeExportFuncFn?

public fun interface PfeImportFuncFn {
    public operator fun invoke(pbdata: MutPtr<UByte>, pvcallbackcontext: ConstPtr<CVoid>, ullength: MutPtr<UInt>): UInt
}

public typealias PfeImportFunc = PfeImportFuncFn?

public fun interface PfnIoCompletionFn {
    public operator fun invoke(pcontext: MutPtr<FioContext>, lpo: MutPtr<FhOverlapped>, cb: UInt, dwcompletionstatus: UInt)
}

public typealias PfnIoCompletion = PfnIoCompletionFn?

public fun interface PlogFullHandlerCallbackFn {
    public operator fun invoke(hlogfile: Handle, dwerror: UInt, flogispinned: Bool, pvclientcontext: MutPtr<CVoid>)
}

public typealias PlogFullHandlerCallback = PlogFullHandlerCallbackFn?

public fun interface PlogTailAdvanceCallbackFn {
    public operator fun invoke(hlogfile: Handle, lsntarget: ClsLsn, pvclientcontext: MutPtr<CVoid>)
}

public typealias PlogTailAdvanceCallback = PlogTailAdvanceCallbackFn?

public fun interface PlogUnpinnedCallbackFn {
    public operator fun invoke(hlogfile: Handle, pvclientcontext: MutPtr<CVoid>)
}

public typealias PlogUnpinnedCallback = PlogUnpinnedCallbackFn?

public typealias PrepareTapeOperation = UInt

public typealias PriorityHint = Int

public typealias ReadDirectoryNotifyInformationClass = Int

public typealias ReplaceFileFlags = UInt

public typealias ServerCertificateType = Int

public typealias SessionInfoUserFlags = UInt

public typealias SetFilePointerMoveMethod = UInt

public typealias ShareInfoPermissions = UInt

public typealias ShareType = UInt

public typealias StorageBusType = Int

public typealias StreamInfoLevels = Int

public typealias SymbolicLinkFlags = UInt

public typealias TapemarkType = UInt

public typealias TapeInformationType = UInt

public typealias TapePositionMethod = UInt

public typealias TapePositionType = UInt

public typealias TransactionOutcome = Int

public typealias TxfsMiniversion = UInt

public typealias TxfLogRecordType = UShort

public typealias VerFindFileFlags = UInt

public typealias VerFindFileStatus = UInt

public typealias VerInstallFileFlags = UInt

public typealias VerInstallFileStatus = UInt

public typealias VsFixedfileinfoFileFlags = UInt

public typealias VsFixedfileinfoFileOs = UInt

public typealias VsFixedfileinfoFileSubtype = Int

public typealias VsFixedfileinfoFileType = Int

public typealias WinStreamId = UInt

public fun interface WofEnumEntryProcFn {
    public operator fun invoke(entryinfo: ConstPtr<CVoid>, userdata: ConstPtr<CVoid>): Bool
}

public typealias WofEnumEntryProc = WofEnumEntryProcFn?

public fun interface WofEnumFilesProcFn {
    public operator fun invoke(filepath: Pcwstr, externalfileinfo: ConstPtr<CVoid>, userdata: ConstPtr<CVoid>): Bool
}

public typealias WofEnumFilesProc = WofEnumFilesProcFn?
