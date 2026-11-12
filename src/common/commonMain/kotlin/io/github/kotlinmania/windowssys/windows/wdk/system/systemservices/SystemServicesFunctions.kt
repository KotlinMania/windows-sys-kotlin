package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DeviceObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DriverCancel
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DriverControl
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DriverNotificationCallbackRoutine
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DriverObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DriverReinitialize
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Eresource
import io.github.kotlinmania.windowssys.windows.wdk.foundation.FastMutex
import io.github.kotlinmania.windowssys.windows.wdk.foundation.FileObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.IoPriorityHint
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Irp
import io.github.kotlinmania.windowssys.windows.wdk.foundation.KdeviceQueue
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Kdpc
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Kevent
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Mdl
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectAttributes
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PcallbackObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Peprocess
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pesilo
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PexRundownRefCacheAware
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PexTimer
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PfreeFunction
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PioCompletionRoutine
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PioWorkitem
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PkdeferredRoutine
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pkinterrupt
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pkthread
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PoolType
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Vpb
import io.github.kotlinmania.windowssys.windows.wdk.foundation.WorkQueueItem
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FileInformationClass
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devproptype
import io.github.kotlinmania.windowssys.windows.win32.foundation.Devpropkey
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.security.GenericMapping
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClfsContextMode
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClfsIostatsClass
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClfsMgmtPolicy
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClfsMgmtPolicyType
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClsInformation
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClsLogInformationClass
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClsLsn
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClsScanContext
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClsWriteEntry
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.AdapterObject
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.BugcheckError
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WheaErrorSourceDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.EventDataDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.EventDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.EventInfoClass
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.Reghandle
import io.github.kotlinmania.windowssys.windows.win32.system.io.IoStatusBlock
import io.github.kotlinmania.windowssys.windows.win32.system.ioctl.CreateDisk
import io.github.kotlinmania.windowssys.windows.win32.system.ioctl.DriveLayoutInformation
import io.github.kotlinmania.windowssys.windows.win32.system.ioctl.DriveLayoutInformationEx
import io.github.kotlinmania.windowssys.windows.win32.system.ioctl.SetPartitionInformationEx
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.EventType
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ProcessorNumber
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.SuiteType
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.FirmwareType
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.GroupAffinity
import io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.ClientId

public expect fun clfsAddLogContainer(plfolog: ConstPtr<FileObject>, pcbcontainer: ConstPtr<ULong>, puszcontainerpath: ConstPtr<UnicodeString>): Ntstatus

public expect fun clfsAddLogContainerSet(plfolog: ConstPtr<FileObject>, ccontainers: UShort, pcbcontainer: ConstPtr<ULong>, rguszcontainerpath: ConstPtr<UnicodeString>): Ntstatus

public expect fun clfsAdvanceLogBase(pvmarshalcontext: MutPtr<CVoid>, plsnbase: ConstPtr<ClsLsn>, fflags: UInt): Ntstatus

public expect fun clfsAlignReservedLog(pvmarshalcontext: ConstPtr<CVoid>, crecords: UInt, rgcbreservation: ConstPtr<Long>, pcbalignreservation: MutPtr<Long>): Ntstatus

public expect fun clfsAllocReservedLog(pvmarshalcontext: ConstPtr<CVoid>, crecords: UInt, pcbadjustment: ConstPtr<Long>): Ntstatus

public expect fun clfsCloseAndResetLogFile(plfolog: ConstPtr<FileObject>): Ntstatus

public expect fun clfsCloseLogFileObject(plfolog: ConstPtr<FileObject>): Ntstatus

public expect fun clfsCreateLogFile(pplfolog: MutPtr<MutPtr<FileObject>>, puszlogfilename: ConstPtr<UnicodeString>, fdesiredaccess: UInt, dwsharemode: UInt, psdlogfile: PsecurityDescriptor, fcreatedisposition: UInt, fcreateoptions: UInt, fflagsandattributes: UInt, flogoptionflag: UInt, pvcontext: ConstPtr<CVoid>, cbcontext: UInt): Ntstatus

public expect fun clfsCreateMarshallingArea(plfolog: ConstPtr<FileObject>, epooltype: PoolType, pfnallocbuffer: PallocateFunction, pfnfreebuffer: PfreeFunction, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshalcontext: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun clfsCreateMarshallingAreaEx(plfolog: ConstPtr<FileObject>, epooltype: PoolType, pfnallocbuffer: PallocateFunction, pfnfreebuffer: PfreeFunction, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, calignmentsize: UInt, fflags: ULong, ppvmarshalcontext: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun clfsCreateScanContext(plfolog: ConstPtr<FileObject>, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: MutPtr<ClsScanContext>): Ntstatus

public expect fun clfsDeleteLogByPointer(plfolog: ConstPtr<FileObject>): Ntstatus

public expect fun clfsDeleteLogFile(puszlogfilename: ConstPtr<UnicodeString>, pvreserved: ConstPtr<CVoid>, flogoptionflag: UInt, pvcontext: ConstPtr<CVoid>, cbcontext: UInt): Ntstatus

public expect fun clfsDeleteMarshallingArea(pvmarshalcontext: ConstPtr<CVoid>): Ntstatus

public expect fun clfsEarlierLsn(plsn: ConstPtr<ClsLsn>): ClsLsn

public expect fun clfsFinalize()

public expect fun clfsFlushBuffers(pvmarshalcontext: ConstPtr<CVoid>): Ntstatus

public expect fun clfsFlushToLsn(pvmarshalcontext: ConstPtr<CVoid>, plsnflush: ConstPtr<ClsLsn>, plsnlastflushed: MutPtr<ClsLsn>): Ntstatus

public expect fun clfsFreeReservedLog(pvmarshalcontext: ConstPtr<CVoid>, crecords: UInt, pcbadjustment: ConstPtr<Long>): Ntstatus

public expect fun clfsGetContainerName(plfolog: ConstPtr<FileObject>, cidlogicalcontainer: UInt, puszcontainername: MutPtr<UnicodeString>, pcactuallencontainername: MutPtr<UInt>): Ntstatus

public expect fun clfsGetIoStatistics(plfolog: ConstPtr<FileObject>, pvstatsbuffer: MutPtr<CVoid>, cbstatsbuffer: UInt, estatsclass: ClfsIostatsClass, pcbstatswritten: MutPtr<UInt>): Ntstatus

public expect fun clfsGetLogFileInformation(plfolog: ConstPtr<FileObject>, pinfobuffer: MutPtr<ClsInformation>, pcbinfobuffer: MutPtr<UInt>): Ntstatus

public expect fun clfsInitialize(): Ntstatus

public expect fun clfsLaterLsn(plsn: ConstPtr<ClsLsn>): ClsLsn

public expect fun clfsLsnBlockOffset(plsn: ConstPtr<ClsLsn>): UInt

public expect fun clfsLsnContainer(plsn: ConstPtr<ClsLsn>): UInt

public expect fun clfsLsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): ClsLsn

public expect fun clfsLsnDifference(plsnstart: ConstPtr<ClsLsn>, plsnfinish: ConstPtr<ClsLsn>, cbcontainer: UInt, cbmaxblock: UInt, pcbdifference: MutPtr<Long>): Ntstatus

public expect fun clfsLsnEqual(plsn1: ConstPtr<ClsLsn>, plsn2: ConstPtr<ClsLsn>): Boolean

public expect fun clfsLsnGreater(plsn1: ConstPtr<ClsLsn>, plsn2: ConstPtr<ClsLsn>): Boolean

public expect fun clfsLsnInvalid(plsn: ConstPtr<ClsLsn>): Boolean

public expect fun clfsLsnLess(plsn1: ConstPtr<ClsLsn>, plsn2: ConstPtr<ClsLsn>): Boolean

public expect fun clfsLsnNull(plsn: ConstPtr<ClsLsn>): Boolean

public expect fun clfsLsnRecordSequence(plsn: ConstPtr<ClsLsn>): UInt

public expect fun clfsMgmtDeregisterManagedClient(clientcookie: ConstPtr<CVoid>): Ntstatus

public expect fun clfsMgmtHandleLogFileFull(client: ConstPtr<CVoid>): Ntstatus

public expect fun clfsMgmtInstallPolicy(logfile: ConstPtr<FileObject>, policy: ConstPtr<ClfsMgmtPolicy>, policylength: UInt): Ntstatus

public expect fun clfsMgmtQueryPolicy(logfile: ConstPtr<FileObject>, policytype: ClfsMgmtPolicyType, policy: MutPtr<ClfsMgmtPolicy>, policylength: MutPtr<UInt>): Ntstatus

public expect fun clfsMgmtRegisterManagedClient(logfile: ConstPtr<FileObject>, registrationdata: ConstPtr<ClfsMgmtClientRegistration>, clientcookie: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun clfsMgmtRemovePolicy(logfile: ConstPtr<FileObject>, policytype: ClfsMgmtPolicyType): Ntstatus

public expect fun clfsMgmtSetLogFileSize(logfile: ConstPtr<FileObject>, newsizeincontainers: ConstPtr<ULong>, resultingsizeincontainers: MutPtr<ULong>, completionroutine: PclfsSetLogSizeCompleteCallback, completionroutinedata: ConstPtr<CVoid>): Ntstatus

public expect fun clfsMgmtSetLogFileSizeAsClient(logfile: ConstPtr<FileObject>, clientcookie: ConstPtr<ConstPtr<CVoid>>, newsizeincontainers: ConstPtr<ULong>, resultingsizeincontainers: MutPtr<ULong>, completionroutine: PclfsSetLogSizeCompleteCallback, completionroutinedata: ConstPtr<CVoid>): Ntstatus

public expect fun clfsMgmtTailAdvanceFailure(client: ConstPtr<CVoid>, reason: Ntstatus): Ntstatus

public expect fun clfsQueryLogFileInformation(plfolog: ConstPtr<FileObject>, einformationclass: ClsLogInformationClass, pinfoinputbuffer: ConstPtr<CVoid>, cbinfoinputbuffer: UInt, pinfobuffer: MutPtr<CVoid>, pcbinfobuffer: MutPtr<UInt>): Ntstatus

public expect fun clfsReadLogRecord(pvmarshalcontext: ConstPtr<CVoid>, plsnfirst: MutPtr<ClsLsn>, pecontextmode: ClfsContextMode, ppvreadbuffer: MutPtr<MutPtr<CVoid>>, pcbreadbuffer: MutPtr<UInt>, perecordtype: MutPtr<UByte>, plsnundonext: MutPtr<ClsLsn>, plsnprevious: MutPtr<ClsLsn>, ppvreadcontext: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun clfsReadNextLogRecord(pvreadcontext: MutPtr<CVoid>, ppvbuffer: MutPtr<MutPtr<CVoid>>, pcbbuffer: MutPtr<UInt>, perecordtype: MutPtr<UByte>, plsnuser: ConstPtr<ClsLsn>, plsnundonext: MutPtr<ClsLsn>, plsnprevious: MutPtr<ClsLsn>, plsnrecord: MutPtr<ClsLsn>): Ntstatus

public expect fun clfsReadPreviousRestartArea(pvreadcontext: ConstPtr<CVoid>, ppvrestartbuffer: MutPtr<MutPtr<CVoid>>, pcbrestartbuffer: MutPtr<UInt>, plsnrestart: MutPtr<ClsLsn>): Ntstatus

public expect fun clfsReadRestartArea(pvmarshalcontext: MutPtr<CVoid>, ppvrestartbuffer: MutPtr<MutPtr<CVoid>>, pcbrestartbuffer: MutPtr<UInt>, plsn: MutPtr<ClsLsn>, ppvreadcontext: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun clfsRemoveLogContainer(plfolog: ConstPtr<FileObject>, puszcontainerpath: ConstPtr<UnicodeString>, fforce: Boolean): Ntstatus

public expect fun clfsRemoveLogContainerSet(plfolog: ConstPtr<FileObject>, ccontainers: UShort, rgwszcontainerpath: ConstPtr<UnicodeString>, fforce: Boolean): Ntstatus

public expect fun clfsReserveAndAppendLog(pvmarshalcontext: ConstPtr<CVoid>, rgwriteentries: ConstPtr<ClsWriteEntry>, cwriteentries: UInt, plsnundonext: ConstPtr<ClsLsn>, plsnprevious: ConstPtr<ClsLsn>, creserverecords: UInt, rgcbreservation: MutPtr<Long>, fflags: UInt, plsn: MutPtr<ClsLsn>): Ntstatus

public expect fun clfsReserveAndAppendLogAligned(pvmarshalcontext: ConstPtr<CVoid>, rgwriteentries: ConstPtr<ClsWriteEntry>, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: ConstPtr<ClsLsn>, plsnprevious: ConstPtr<ClsLsn>, creserverecords: UInt, rgcbreservation: MutPtr<Long>, fflags: UInt, plsn: MutPtr<ClsLsn>): Ntstatus

public expect fun clfsScanLogContainers(pcxscan: MutPtr<ClsScanContext>, escanmode: UByte): Ntstatus

public expect fun clfsSetArchiveTail(plfolog: ConstPtr<FileObject>, plsnarchivetail: ConstPtr<ClsLsn>): Ntstatus

public expect fun clfsSetEndOfLog(plfolog: ConstPtr<FileObject>, plsnend: ConstPtr<ClsLsn>): Ntstatus

public expect fun clfsSetLogFileInformation(plfolog: ConstPtr<FileObject>, einformationclass: ClsLogInformationClass, pinfobuffer: ConstPtr<CVoid>, cbbuffer: UInt): Ntstatus

public expect fun clfsTerminateReadLog(pvcursorcontext: ConstPtr<CVoid>): Ntstatus

public expect fun clfsWriteRestartArea(pvmarshalcontext: MutPtr<CVoid>, pvrestartbuffer: ConstPtr<CVoid>, cbrestartbuffer: UInt, plsnbase: ConstPtr<ClsLsn>, fflags: UInt, pcbwritten: MutPtr<UInt>, plsnnext: MutPtr<ClsLsn>): Ntstatus

public expect fun cmCallbackGetKeyObjectID(cookie: ConstPtr<Long>, obj: ConstPtr<CVoid>, objectid: MutPtr<ULong>, objectname: MutPtr<MutPtr<UnicodeString>>): Ntstatus

public expect fun cmCallbackGetKeyObjectIDEx(cookie: ConstPtr<Long>, obj: ConstPtr<CVoid>, objectid: MutPtr<ULong>, objectname: MutPtr<MutPtr<UnicodeString>>, flags: UInt): Ntstatus

public expect fun cmCallbackReleaseKeyObjectIDEx(objectname: ConstPtr<UnicodeString>)

public expect fun cmGetBoundTransaction(cookie: ConstPtr<Long>, obj: ConstPtr<CVoid>): MutPtr<CVoid>

public expect fun cmGetCallbackVersion(major: MutPtr<UInt>, minor: MutPtr<UInt>)

public expect fun cmRegisterCallback(function: PexCallbackFunction, context: ConstPtr<CVoid>, cookie: MutPtr<Long>): Ntstatus

public expect fun cmRegisterCallbackEx(function: PexCallbackFunction, altitude: ConstPtr<UnicodeString>, driver: ConstPtr<CVoid>, context: ConstPtr<CVoid>, cookie: MutPtr<Long>, reserved: ConstPtr<CVoid>): Ntstatus

public expect fun cmSetCallbackObjectContext(obj: MutPtr<CVoid>, cookie: ConstPtr<Long>, newcontext: ConstPtr<CVoid>, oldcontext: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun cmUnRegisterCallback(cookie: Long): Ntstatus

public expect fun dbgBreakPointWithStatus(status: UInt)

public expect fun dbgPrint(format: Pcstr, vararg variadicArgs: Long): UInt

public expect fun dbgPrintEx(componentid: UInt, level: UInt, format: Pcstr, vararg variadicArgs: Long): UInt

public expect fun dbgPrintReturnControlC(format: Pcstr, vararg variadicArgs: Long): UInt

public expect fun dbgPrompt(prompt: Pcstr, response: Pstr, length: UInt): UInt

public expect fun dbgQueryDebugFilterState(componentid: UInt, level: UInt): Ntstatus

public expect fun dbgSetDebugFilterState(componentid: UInt, level: UInt, state: Boolean): Ntstatus

public expect fun dbgSetDebugPrintCallback(debugprintcallback: PdebugPrintCallback, enable: Boolean): Ntstatus

public expect fun etwActivityIdControl(controlcode: UInt, activityid: MutPtr<Guid>): Ntstatus

public expect fun etwEventEnabled(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>): Boolean

public expect fun etwProviderEnabled(reghandle: Reghandle, level: UByte, keyword: ULong): Boolean

public expect fun etwRegister(providerid: ConstPtr<Guid>, enablecallback: Petwenablecallback, callbackcontext: ConstPtr<CVoid>, reghandle: MutPtr<Reghandle>): Ntstatus

public expect fun etwSetInformation(reghandle: Reghandle, informationclass: EventInfoClass, eventinformation: ConstPtr<CVoid>, informationlength: UInt): Ntstatus

public expect fun etwUnregister(reghandle: Reghandle): Ntstatus

public expect fun etwWrite(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, activityid: ConstPtr<Guid>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): Ntstatus

public expect fun etwWriteEx(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, filter: ULong, flags: UInt, activityid: ConstPtr<Guid>, relatedactivityid: ConstPtr<Guid>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): Ntstatus

public expect fun etwWriteString(reghandle: Reghandle, level: UByte, keyword: ULong, activityid: ConstPtr<Guid>, string: Pcwstr): Ntstatus

public expect fun etwWriteTransfer(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, activityid: ConstPtr<Guid>, relatedactivityid: ConstPtr<Guid>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): Ntstatus

public expect fun exAcquireFastMutex(fastmutex: MutPtr<FastMutex>)

public expect fun exAcquireFastMutexUnsafe(fastmutex: MutPtr<FastMutex>)

public expect fun exAcquirePushLockExclusiveEx(pushlock: MutPtr<ULong>, flags: UInt)

public expect fun exAcquirePushLockSharedEx(pushlock: MutPtr<ULong>, flags: UInt)

public expect fun exAcquireResourceExclusiveLite(resource: MutPtr<Eresource>, wait: Boolean): Boolean

public expect fun exAcquireResourceSharedLite(resource: MutPtr<Eresource>, wait: Boolean): Boolean

public expect fun exAcquireRundownProtection(runref: MutPtr<ExRundownRef>): Boolean

public expect fun exAcquireRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware): Boolean

public expect fun exAcquireRundownProtectionCacheAwareEx(runrefcacheaware: PexRundownRefCacheAware, count: UInt): Boolean

public expect fun exAcquireRundownProtectionEx(runref: MutPtr<ExRundownRef>, count: UInt): Boolean

public expect fun exAcquireSharedStarveExclusive(resource: MutPtr<Eresource>, wait: Boolean): Boolean

public expect fun exAcquireSharedWaitForExclusive(resource: MutPtr<Eresource>, wait: Boolean): Boolean

public expect fun exAcquireSpinLockExclusive(spinlock: MutPtr<Int>): UByte

public expect fun exAcquireSpinLockExclusiveAtDpcLevel(spinlock: MutPtr<Int>)

public expect fun exAcquireSpinLockShared(spinlock: MutPtr<Int>): UByte

public expect fun exAcquireSpinLockSharedAtDpcLevel(spinlock: MutPtr<Int>)

public expect fun exAllocateCacheAwareRundownProtection(pooltype: PoolType, pooltag: UInt): PexRundownRefCacheAware

public expect fun exAllocatePool(pooltype: PoolType, numberofbytes: ULong): MutPtr<CVoid>

public expect fun exAllocatePool2(flags: ULong, numberofbytes: ULong, tag: UInt): MutPtr<CVoid>

public expect fun exAllocatePool3(flags: ULong, numberofbytes: ULong, tag: UInt, extendedparameters: ConstPtr<PoolExtendedParameter>, extendedparameterscount: UInt): MutPtr<CVoid>

public expect fun exAllocatePoolWithQuota(pooltype: PoolType, numberofbytes: ULong): MutPtr<CVoid>

public expect fun exAllocatePoolWithQuotaTag(pooltype: PoolType, numberofbytes: ULong, tag: UInt): MutPtr<CVoid>

public expect fun exAllocatePoolWithTag(pooltype: PoolType, numberofbytes: ULong, tag: UInt): MutPtr<CVoid>

public expect fun exAllocatePoolWithTagPriority(pooltype: PoolType, numberofbytes: ULong, tag: UInt, priority: ExPoolPriority): MutPtr<CVoid>

public expect fun exAllocateTimer(callback: PextCallback, callbackcontext: ConstPtr<CVoid>, attributes: UInt): PexTimer

public expect fun exCancelTimer(timer: PexTimer, parameters: ConstPtr<CVoid>): Boolean

public expect fun exCleanupRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware)

public expect fun exConvertExclusiveToSharedLite(resource: MutPtr<Eresource>)

public expect fun exCreateCallback(callbackobject: MutPtr<PcallbackObject>, objectattributes: ConstPtr<ObjectAttributes>, create: Boolean, allowmultiplecallbacks: Boolean): Ntstatus

public expect fun exCreatePool(flags: UInt, tag: ULong, params: ConstPtr<PoolCreateExtendedParams>, poolhandle: MutPtr<Handle>): Ntstatus

public expect fun exDeleteResourceLite(resource: MutPtr<Eresource>): Ntstatus

public expect fun exDeleteTimer(timer: PexTimer, cancel: Boolean, wait: Boolean, parameters: ConstPtr<ExtDeleteParameters>): Boolean

public expect fun exDestroyPool(poolhandle: Handle)

public expect fun exEnterCriticalRegionAndAcquireResourceExclusive(resource: MutPtr<Eresource>): MutPtr<CVoid>

public expect fun exEnterCriticalRegionAndAcquireResourceShared(resource: MutPtr<Eresource>): MutPtr<CVoid>

public expect fun exEnterCriticalRegionAndAcquireSharedWaitForExclusive(resource: MutPtr<Eresource>): MutPtr<CVoid>

public expect fun exEnumerateSystemFirmwareTables(firmwaretableprovidersignature: UInt, firmwaretablebuffer: MutPtr<CVoid>, bufferlength: UInt, returnlength: MutPtr<UInt>): Ntstatus

public expect fun exExtendZone(zone: MutPtr<ZoneHeader>, segment: MutPtr<CVoid>, segmentsize: UInt): Ntstatus

public expect fun exFreeCacheAwareRundownProtection(runrefcacheaware: PexRundownRefCacheAware)

public expect fun exFreePool(p: MutPtr<CVoid>)

public expect fun exFreePool2(p: MutPtr<CVoid>, tag: UInt, extendedparameters: ConstPtr<PoolExtendedParameter>, extendedparameterscount: UInt)

public expect fun exFreePoolWithTag(p: MutPtr<CVoid>, tag: UInt)

public expect fun exGetExclusiveWaiterCount(resource: ConstPtr<Eresource>): UInt

public expect fun exGetFirmwareEnvironmentVariable(variablename: ConstPtr<UnicodeString>, vendorguid: ConstPtr<Guid>, value: MutPtr<CVoid>, valuelength: MutPtr<UInt>, attributes: MutPtr<UInt>): Ntstatus

public expect fun exGetFirmwareType(): FirmwareType

public expect fun exGetPreviousMode(): Byte

public expect fun exGetSharedWaiterCount(resource: ConstPtr<Eresource>): UInt

public expect fun exGetSystemFirmwareTable(firmwaretableprovidersignature: UInt, firmwaretableid: UInt, firmwaretablebuffer: MutPtr<CVoid>, bufferlength: UInt, returnlength: MutPtr<UInt>): Ntstatus

public expect fun exInitializePushLock(pushlock: MutPtr<ULong>)

public expect fun exInitializeResourceLite(resource: MutPtr<Eresource>): Ntstatus

public expect fun exInitializeRundownProtection(runref: MutPtr<ExRundownRef>)

public expect fun exInitializeRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware, runrefsize: ULong)

public expect fun exInitializeRundownProtectionCacheAwareEx(runrefcacheaware: PexRundownRefCacheAware, flags: UInt)

public expect fun exInitializeZone(zone: MutPtr<ZoneHeader>, blocksize: UInt, initialsegment: MutPtr<CVoid>, initialsegmentsize: UInt): Ntstatus

public expect fun exInterlockedAddLargeInteger(addend: MutPtr<Long>, increment: Long, lock: MutPtr<ULong>): Long

public expect fun exInterlockedExtendZone(zone: MutPtr<ZoneHeader>, segment: MutPtr<CVoid>, segmentsize: UInt, lock: MutPtr<ULong>): Ntstatus

public expect fun exIsManufacturingModeEnabled(): Boolean

public expect fun exIsProcessorFeaturePresent(processorfeature: UInt): Boolean

public expect fun exIsResourceAcquiredExclusiveLite(resource: ConstPtr<Eresource>): Boolean

public expect fun exIsResourceAcquiredSharedLite(resource: ConstPtr<Eresource>): UInt

public expect fun exIsSoftBoot(): Boolean

public expect fun exLocalTimeToSystemTime(localtime: ConstPtr<Long>, systemtime: MutPtr<Long>)

public expect fun exNotifyCallback(callbackobject: ConstPtr<CVoid>, argument1: ConstPtr<CVoid>, argument2: ConstPtr<CVoid>)

public expect fun exQueryTimerResolution(maximumtime: MutPtr<UInt>, minimumtime: MutPtr<UInt>, currenttime: MutPtr<UInt>)

public expect fun exQueueWorkItem(workitem: MutPtr<WorkQueueItem>, queuetype: WorkQueueType)

public expect fun exRaiseAccessViolation()

public expect fun exRaiseDatatypeMisalignment()

public expect fun exRaiseStatus(status: Ntstatus)

public expect fun exReInitializeRundownProtection(runref: MutPtr<ExRundownRef>)

public expect fun exReInitializeRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware)

public expect fun exRegisterCallback(callbackobject: PcallbackObject, callbackfunction: PcallbackFunction, callbackcontext: ConstPtr<CVoid>): MutPtr<CVoid>

public expect fun exReinitializeResourceLite(resource: MutPtr<Eresource>): Ntstatus

public expect fun exReleaseFastMutex(fastmutex: MutPtr<FastMutex>)

public expect fun exReleaseFastMutexUnsafe(fastmutex: MutPtr<FastMutex>)

public expect fun exReleasePushLockExclusiveEx(pushlock: MutPtr<ULong>, flags: UInt)

public expect fun exReleasePushLockSharedEx(pushlock: MutPtr<ULong>, flags: UInt)

public expect fun exReleaseResourceAndLeaveCriticalRegion(resource: MutPtr<Eresource>)

public expect fun exReleaseResourceForThreadLite(resource: MutPtr<Eresource>, resourcethreadid: ULong)

public expect fun exReleaseResourceLite(resource: MutPtr<Eresource>)

public expect fun exReleaseRundownProtection(runref: MutPtr<ExRundownRef>)

public expect fun exReleaseRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware)

public expect fun exReleaseRundownProtectionCacheAwareEx(runref: PexRundownRefCacheAware, count: UInt)

public expect fun exReleaseRundownProtectionEx(runref: MutPtr<ExRundownRef>, count: UInt)

public expect fun exReleaseSpinLockExclusive(spinlock: MutPtr<Int>, oldirql: UByte)

public expect fun exReleaseSpinLockExclusiveFromDpcLevel(spinlock: MutPtr<Int>)

public expect fun exReleaseSpinLockShared(spinlock: MutPtr<Int>, oldirql: UByte)

public expect fun exReleaseSpinLockSharedFromDpcLevel(spinlock: MutPtr<Int>)

public expect fun exRundownCompleted(runref: MutPtr<ExRundownRef>)

public expect fun exRundownCompletedCacheAware(runrefcacheaware: PexRundownRefCacheAware)

public expect fun exSecurePoolUpdate(securepoolhandle: Handle, tag: UInt, allocation: ConstPtr<CVoid>, cookie: ULong, offset: ULong, size: ULong, buffer: ConstPtr<CVoid>): Ntstatus

public expect fun exSecurePoolValidate(securepoolhandle: Handle, tag: UInt, allocation: ConstPtr<CVoid>, cookie: ULong): UInt

public expect fun exSetFirmwareEnvironmentVariable(variablename: ConstPtr<UnicodeString>, vendorguid: ConstPtr<Guid>, value: ConstPtr<CVoid>, valuelength: UInt, attributes: UInt): Ntstatus

public expect fun exSetResourceOwnerPointer(resource: MutPtr<Eresource>, ownerpointer: ConstPtr<CVoid>)

public expect fun exSetResourceOwnerPointerEx(resource: MutPtr<Eresource>, ownerpointer: ConstPtr<CVoid>, flags: UInt)

public expect fun exSetTimer(timer: PexTimer, duetime: Long, period: Long, parameters: ConstPtr<ExtSetParametersV0>): Boolean

public expect fun exSetTimerResolution(desiredtime: UInt, setresolution: Boolean): UInt

public expect fun exSizeOfRundownProtectionCacheAware(): ULong

public expect fun exSystemTimeToLocalTime(systemtime: ConstPtr<Long>, localtime: MutPtr<Long>)

public expect fun exTryAcquireSpinLockExclusiveAtDpcLevel(spinlock: MutPtr<Int>): UInt

public expect fun exTryAcquireSpinLockSharedAtDpcLevel(spinlock: MutPtr<Int>): UInt

public expect fun exTryConvertSharedSpinLockExclusive(spinlock: MutPtr<Int>): UInt

public expect fun exTryToAcquireFastMutex(fastmutex: MutPtr<FastMutex>): Boolean

public expect fun exUnregisterCallback(callbackregistration: MutPtr<CVoid>)

public expect fun exUuidCreate(uuid: MutPtr<Guid>): Ntstatus

public expect fun exVerifySuite(suitetype: SuiteType): Boolean

public expect fun exWaitForRundownProtectionRelease(runref: MutPtr<ExRundownRef>)

public expect fun exWaitForRundownProtectionReleaseCacheAware(runref: PexRundownRefCacheAware)

public expect fun fsRtlIsTotalDeviceFailure(status: Ntstatus): Boolean

public expect fun halAcquireDisplayOwnership(resetdisplayparameters: PhalResetDisplayParameters)

public expect fun halAllocateAdapterChannel(adapterobject: ConstPtr<AdapterObject>, wcb: ConstPtr<WaitContextBlock>, numberofmapregisters: UInt, executionroutine: DriverControl): Ntstatus

public expect fun halAllocateCommonBuffer(adapterobject: ConstPtr<AdapterObject>, length: UInt, logicaladdress: MutPtr<Long>, cacheenabled: Boolean): MutPtr<CVoid>

public expect fun halAllocateCrashDumpRegisters(adapterobject: ConstPtr<AdapterObject>, numberofmapregisters: MutPtr<UInt>): MutPtr<CVoid>

public expect fun halAllocateHardwareCounters(groupaffinty: ConstPtr<GroupAffinity>, groupcount: UInt, resourcelist: ConstPtr<PhysicalCounterResourceList>, countersethandle: MutPtr<Handle>): Ntstatus

public expect fun halAssignSlotResources(registrypath: ConstPtr<UnicodeString>, driverclassname: ConstPtr<UnicodeString>, driverobject: ConstPtr<DriverObject>, deviceobject: ConstPtr<DeviceObject>, bustype: InterfaceType, busnumber: UInt, slotnumber: UInt, allocatedresources: MutPtr<MutPtr<CmResourceList>>): Ntstatus

public expect fun halBugCheckSystem(errorsource: ConstPtr<WheaErrorSourceDescriptor>, errorrecord: ConstPtr<WheaErrorRecord>)

public expect fun halDmaAllocateCrashDumpRegistersEx(adapter: ConstPtr<AdapterObject>, numberofmapregisters: UInt, type: HalDmaCrashDumpRegisterType, mapregisterbase: MutPtr<MutPtr<CVoid>>, mapregistersavailable: MutPtr<UInt>): Ntstatus

public expect fun halDmaFreeCrashDumpRegistersEx(adapter: ConstPtr<AdapterObject>, type: HalDmaCrashDumpRegisterType): Ntstatus

public expect fun halExamineMBR(deviceobject: ConstPtr<DeviceObject>, sectorsize: UInt, mbrtypeidentifier: UInt, buffer: MutPtr<MutPtr<CVoid>>)

public expect fun halFreeCommonBuffer(adapterobject: ConstPtr<AdapterObject>, length: UInt, logicaladdress: Long, virtualaddress: ConstPtr<CVoid>, cacheenabled: Boolean)

public expect fun halFreeHardwareCounters(countersethandle: Handle): Ntstatus

public expect fun halGetAdapter(devicedescription: ConstPtr<DeviceDescription>, numberofmapregisters: MutPtr<UInt>): MutPtr<AdapterObject>

public expect fun halGetBusData(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: MutPtr<CVoid>, length: UInt): UInt

public expect fun halGetBusDataByOffset(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: MutPtr<CVoid>, offset: UInt, length: UInt): UInt

public expect fun halGetInterruptVector(interfacetype: InterfaceType, busnumber: UInt, businterruptlevel: UInt, businterruptvector: UInt, irql: MutPtr<UByte>, affinity: MutPtr<ULong>): UInt

public expect fun halMakeBeep(frequency: UInt): Boolean

public expect fun halReadDmaCounter(adapterobject: ConstPtr<AdapterObject>): UInt

public expect fun halSetBusData(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: ConstPtr<CVoid>, length: UInt): UInt

public expect fun halSetBusDataByOffset(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: ConstPtr<CVoid>, offset: UInt, length: UInt): UInt

public expect fun halTranslateBusAddress(interfacetype: InterfaceType, busnumber: UInt, busaddress: Long, addressspace: MutPtr<UInt>, translatedaddress: MutPtr<Long>): Boolean

public expect fun hvlRegisterWheaErrorNotification(callback: PhvlWheaErrorNotification): Ntstatus

public expect fun hvlUnregisterWheaErrorNotification(callback: PhvlWheaErrorNotification): Ntstatus

public expect fun ioAcquireCancelSpinLock(irql: MutPtr<UByte>)

public expect fun ioAcquireKsrPersistentMemory(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, buffer: MutPtr<CVoid>, size: MutPtr<ULong>): Ntstatus

public expect fun ioAcquireKsrPersistentMemoryEx(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, physicaldeviceid: ConstPtr<UnicodeString>, datatag: ConstPtr<UShort>, dataversion: MutPtr<UInt>, buffer: MutPtr<CVoid>, size: MutPtr<ULong>): Ntstatus

public expect fun ioAcquireRemoveLockEx(removelock: MutPtr<IoRemoveLock>, tag: ConstPtr<CVoid>, file: Pcstr, line: UInt, remlocksize: UInt): Ntstatus

public expect fun ioAllocateAdapterChannel(adapterobject: ConstPtr<AdapterObject>, deviceobject: ConstPtr<DeviceObject>, numberofmapregisters: UInt, executionroutine: DriverControl, context: ConstPtr<CVoid>): Ntstatus

public expect fun ioAllocateController(controllerobject: ConstPtr<ControllerObject>, deviceobject: ConstPtr<DeviceObject>, executionroutine: DriverControl, context: ConstPtr<CVoid>)

public expect fun ioAllocateDriverObjectExtension(driverobject: ConstPtr<DriverObject>, clientidentificationaddress: ConstPtr<CVoid>, driverobjectextensionsize: UInt, driverobjectextension: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun ioAllocateErrorLogEntry(ioobject: ConstPtr<CVoid>, entrysize: UByte): MutPtr<CVoid>

public expect fun ioAllocateIrp(stacksize: Byte, chargequota: Boolean): MutPtr<Irp>

public expect fun ioAllocateIrpEx(deviceobject: ConstPtr<DeviceObject>, stacksize: Byte, chargequota: Boolean): MutPtr<Irp>

public expect fun ioAllocateMdl(virtualaddress: ConstPtr<CVoid>, length: UInt, secondarybuffer: Boolean, chargequota: Boolean, irp: MutPtr<Irp>): MutPtr<Mdl>

public expect fun ioAllocateSfioStreamIdentifier(fileobject: ConstPtr<FileObject>, length: UInt, signature: ConstPtr<CVoid>, streamidentifier: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun ioAllocateWorkItem(deviceobject: ConstPtr<DeviceObject>): PioWorkitem

public expect fun ioAssignResources(registrypath: ConstPtr<UnicodeString>, driverclassname: ConstPtr<UnicodeString>, driverobject: ConstPtr<DriverObject>, deviceobject: ConstPtr<DeviceObject>, requestedresources: ConstPtr<IoResourceRequirementsList>, allocatedresources: MutPtr<MutPtr<CmResourceList>>): Ntstatus

public expect fun ioAttachDevice(sourcedevice: ConstPtr<DeviceObject>, targetdevice: ConstPtr<UnicodeString>, attacheddevice: MutPtr<MutPtr<DeviceObject>>): Ntstatus

public expect fun ioAttachDeviceByPointer(sourcedevice: ConstPtr<DeviceObject>, targetdevice: ConstPtr<DeviceObject>): Ntstatus

public expect fun ioAttachDeviceToDeviceStack(sourcedevice: ConstPtr<DeviceObject>, targetdevice: ConstPtr<DeviceObject>): MutPtr<DeviceObject>

public expect fun ioAttachDeviceToDeviceStackSafe(sourcedevice: ConstPtr<DeviceObject>, targetdevice: ConstPtr<DeviceObject>, attachedtodeviceobject: MutPtr<MutPtr<DeviceObject>>): Ntstatus

public expect fun ioBuildAsynchronousFsdRequest(majorfunction: UInt, deviceobject: ConstPtr<DeviceObject>, buffer: MutPtr<CVoid>, length: UInt, startingoffset: ConstPtr<Long>, iostatusblock: ConstPtr<IoStatusBlock>): MutPtr<Irp>

public expect fun ioBuildDeviceIoControlRequest(iocontrolcode: UInt, deviceobject: ConstPtr<DeviceObject>, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt, internaldeviceiocontrol: Boolean, event: ConstPtr<Kevent>, iostatusblock: MutPtr<IoStatusBlock>): MutPtr<Irp>

public expect fun ioBuildPartialMdl(sourcemdl: ConstPtr<Mdl>, targetmdl: MutPtr<Mdl>, virtualaddress: MutPtr<CVoid>, length: UInt)

public expect fun ioBuildSynchronousFsdRequest(majorfunction: UInt, deviceobject: ConstPtr<DeviceObject>, buffer: MutPtr<CVoid>, length: UInt, startingoffset: ConstPtr<Long>, event: ConstPtr<Kevent>, iostatusblock: MutPtr<IoStatusBlock>): MutPtr<Irp>

public expect fun ioCancelFileOpen(deviceobject: ConstPtr<DeviceObject>, fileobject: ConstPtr<FileObject>)

public expect fun ioCancelIrp(irp: ConstPtr<Irp>): Boolean

public expect fun ioCheckLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, linkshareaccess: MutPtr<LinkShareAccess>, ioshareaccessflags: UInt): Ntstatus

public expect fun ioCheckShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, update: Boolean): Ntstatus

public expect fun ioCheckShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, update: Boolean, writepermission: ConstPtr<Boolean>): Ntstatus

public expect fun ioCleanupIrp(irp: MutPtr<Irp>)

public expect fun ioClearActivityIdThread(originalid: ConstPtr<Guid>)

public expect fun ioClearIrpExtraCreateParameter(irp: MutPtr<Irp>)

public expect fun ioConnectInterrupt(interruptobject: MutPtr<Pkinterrupt>, serviceroutine: PkserviceRoutine, servicecontext: ConstPtr<CVoid>, spinlock: ConstPtr<ULong>, vector: UInt, irql: UByte, synchronizeirql: UByte, interruptmode: KinterruptMode, sharevector: Boolean, processorenablemask: ULong, floatingsave: Boolean): Ntstatus

public expect fun ioConnectInterruptEx(parameters: MutPtr<IoConnectInterruptParameters>): Ntstatus

public expect fun ioCreateController(size: UInt): MutPtr<ControllerObject>

public expect fun ioCreateDevice(driverobject: ConstPtr<DriverObject>, deviceextensionsize: UInt, devicename: ConstPtr<UnicodeString>, devicetype: UInt, devicecharacteristics: UInt, exclusive: Boolean, deviceobject: MutPtr<MutPtr<DeviceObject>>): Ntstatus

public expect fun ioCreateDisk(deviceobject: ConstPtr<DeviceObject>, disk: ConstPtr<CreateDisk>): Ntstatus

public expect fun ioCreateFile(filehandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: ConstPtr<CVoid>, ealength: UInt, createfiletype: CreateFileType, internalparameters: ConstPtr<CVoid>, options: UInt): Ntstatus

public expect fun ioCreateFileEx(filehandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: ConstPtr<CVoid>, ealength: UInt, createfiletype: CreateFileType, internalparameters: ConstPtr<CVoid>, options: UInt, drivercontext: ConstPtr<IoDriverCreateContext>): Ntstatus

public expect fun ioCreateFileSpecifyDeviceObjectHint(filehandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: ConstPtr<CVoid>, ealength: UInt, createfiletype: CreateFileType, internalparameters: ConstPtr<CVoid>, options: UInt, deviceobject: ConstPtr<CVoid>): Ntstatus

public expect fun ioCreateNotificationEvent(eventname: ConstPtr<UnicodeString>, eventhandle: MutPtr<Handle>): MutPtr<Kevent>

public expect fun ioCreateSymbolicLink(symboliclinkname: ConstPtr<UnicodeString>, devicename: ConstPtr<UnicodeString>): Ntstatus

public expect fun ioCreateSynchronizationEvent(eventname: ConstPtr<UnicodeString>, eventhandle: MutPtr<Handle>): MutPtr<Kevent>

public expect fun ioCreateSystemThread(ioobject: MutPtr<CVoid>, threadhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, processhandle: Handle, clientid: MutPtr<ClientId>, startroutine: PkstartRoutine, startcontext: ConstPtr<CVoid>): Ntstatus

public expect fun ioCreateUnprotectedSymbolicLink(symboliclinkname: ConstPtr<UnicodeString>, devicename: ConstPtr<UnicodeString>): Ntstatus

public expect fun ioCsqInitialize(csq: MutPtr<IoCsq>, csqinsertirp: PioCsqInsertIrp, csqremoveirp: PioCsqRemoveIrp, csqpeeknextirp: PioCsqPeekNextIrp, csqacquirelock: PioCsqAcquireLock, csqreleaselock: PioCsqReleaseLock, csqcompletecanceledirp: PioCsqCompleteCanceledIrp): Ntstatus

public expect fun ioCsqInitializeEx(csq: MutPtr<IoCsq>, csqinsertirp: PioCsqInsertIrpEx, csqremoveirp: PioCsqRemoveIrp, csqpeeknextirp: PioCsqPeekNextIrp, csqacquirelock: PioCsqAcquireLock, csqreleaselock: PioCsqReleaseLock, csqcompletecanceledirp: PioCsqCompleteCanceledIrp): Ntstatus

public expect fun ioCsqInsertIrp(csq: MutPtr<IoCsq>, irp: MutPtr<Irp>, context: MutPtr<IoCsqIrpContext>)

public expect fun ioCsqInsertIrpEx(csq: MutPtr<IoCsq>, irp: MutPtr<Irp>, context: MutPtr<IoCsqIrpContext>, insertcontext: ConstPtr<CVoid>): Ntstatus

public expect fun ioCsqRemoveIrp(csq: MutPtr<IoCsq>, context: MutPtr<IoCsqIrpContext>): MutPtr<Irp>

public expect fun ioCsqRemoveNextIrp(csq: MutPtr<IoCsq>, peekcontext: ConstPtr<CVoid>): MutPtr<Irp>

public expect fun ioDecrementKeepAliveCount(fileobject: MutPtr<FileObject>, process: Peprocess): Ntstatus

public expect fun ioDeleteController(controllerobject: ConstPtr<ControllerObject>)

public expect fun ioDeleteDevice(deviceobject: ConstPtr<DeviceObject>)

public expect fun ioDeleteSymbolicLink(symboliclinkname: ConstPtr<UnicodeString>): Ntstatus

public expect fun ioDetachDevice(targetdevice: MutPtr<DeviceObject>)

public expect fun ioDisconnectInterrupt(interruptobject: Pkinterrupt)

public expect fun ioDisconnectInterruptEx(parameters: ConstPtr<IoDisconnectInterruptParameters>)

public expect fun ioEnumerateKsrPersistentMemoryEx(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, physicaldeviceid: ConstPtr<UnicodeString>, callback: PioPersistedMemoryEnumerationCallback, callbackcontext: ConstPtr<CVoid>): Ntstatus

public expect fun ioFlushAdapterBuffers(adapterobject: ConstPtr<AdapterObject>, mdl: ConstPtr<Mdl>, mapregisterbase: ConstPtr<CVoid>, currentva: ConstPtr<CVoid>, length: UInt, writetodevice: Boolean): Boolean

public expect fun ioForwardIrpSynchronously(deviceobject: ConstPtr<DeviceObject>, irp: ConstPtr<Irp>): Boolean

public expect fun ioFreeAdapterChannel(adapterobject: ConstPtr<AdapterObject>)

public expect fun ioFreeController(controllerobject: ConstPtr<ControllerObject>)

public expect fun ioFreeErrorLogEntry(elentry: ConstPtr<CVoid>)

public expect fun ioFreeIrp(irp: ConstPtr<Irp>)

public expect fun ioFreeKsrPersistentMemory(datahandle: ConstPtr<CVoid>): Ntstatus

public expect fun ioFreeMapRegisters(adapterobject: ConstPtr<AdapterObject>, mapregisterbase: ConstPtr<CVoid>, numberofmapregisters: UInt)

public expect fun ioFreeMdl(mdl: MutPtr<Mdl>)

public expect fun ioFreeSfioStreamIdentifier(fileobject: ConstPtr<FileObject>, signature: ConstPtr<CVoid>): Ntstatus

public expect fun ioFreeWorkItem(ioworkitem: PioWorkitem)

public expect fun ioGetActivityIdIrp(irp: ConstPtr<Irp>, guid: MutPtr<Guid>): Ntstatus

public expect fun ioGetActivityIdThread(): MutPtr<Guid>

public expect fun ioGetAffinityInterrupt(interruptobject: Pkinterrupt, groupaffinity: MutPtr<GroupAffinity>): Ntstatus

public expect fun ioGetAttachedDeviceReference(deviceobject: ConstPtr<DeviceObject>): MutPtr<DeviceObject>

public expect fun ioGetBootDiskInformation(bootdiskinformation: MutPtr<BootdiskInformation>, size: UInt): Ntstatus

public expect fun ioGetBootDiskInformationLite(bootdiskinformation: MutPtr<MutPtr<BootdiskInformationLite>>): Ntstatus

public expect fun ioGetConfigurationInformation(): MutPtr<ConfigurationInformation>

public expect fun ioGetContainerInformation(informationclass: IoContainerInformationClass, containerobject: ConstPtr<CVoid>, buffer: MutPtr<CVoid>, bufferlength: UInt): Ntstatus

public expect fun ioGetCurrentProcess(): Peprocess

public expect fun ioGetDeviceDirectory(physicaldeviceobject: ConstPtr<DeviceObject>, directorytype: DeviceDirectoryType, flags: UInt, reserved: ConstPtr<CVoid>, devicedirectoryhandle: MutPtr<Handle>): Ntstatus

public expect fun ioGetDeviceInterfaceAlias(symboliclinkname: ConstPtr<UnicodeString>, aliasinterfaceclassguid: ConstPtr<Guid>, aliassymboliclinkname: MutPtr<UnicodeString>): Ntstatus

public expect fun ioGetDeviceInterfacePropertyData(symboliclinkname: ConstPtr<UnicodeString>, propertykey: ConstPtr<Devpropkey>, lcid: UInt, flags: UInt, size: UInt, data: MutPtr<CVoid>, requiredsize: MutPtr<UInt>, type: MutPtr<Devproptype>): Ntstatus

public expect fun ioGetDeviceInterfaces(interfaceclassguid: ConstPtr<Guid>, physicaldeviceobject: ConstPtr<DeviceObject>, flags: UInt, symboliclinklist: MutPtr<Pwstr>): Ntstatus

public expect fun ioGetDeviceNumaNode(pdo: ConstPtr<DeviceObject>, nodenumber: MutPtr<UShort>): Ntstatus

public expect fun ioGetDeviceObjectPointer(objectname: ConstPtr<UnicodeString>, desiredaccess: UInt, fileobject: MutPtr<MutPtr<FileObject>>, deviceobject: MutPtr<MutPtr<DeviceObject>>): Ntstatus

public expect fun ioGetDeviceProperty(deviceobject: ConstPtr<DeviceObject>, deviceproperty: DeviceRegistryProperty, bufferlength: UInt, propertybuffer: MutPtr<CVoid>, resultlength: MutPtr<UInt>): Ntstatus

public expect fun ioGetDevicePropertyData(pdo: ConstPtr<DeviceObject>, propertykey: ConstPtr<Devpropkey>, lcid: UInt, flags: UInt, size: UInt, data: MutPtr<CVoid>, requiredsize: MutPtr<UInt>, type: MutPtr<Devproptype>): Ntstatus

public expect fun ioGetDmaAdapter(physicaldeviceobject: ConstPtr<DeviceObject>, devicedescription: ConstPtr<DeviceDescription>, numberofmapregisters: MutPtr<UInt>): MutPtr<DmaAdapter>

public expect fun ioGetDriverDirectory(driverobject: ConstPtr<DriverObject>, directorytype: DriverDirectoryType, flags: UInt, driverdirectoryhandle: MutPtr<Handle>): Ntstatus

public expect fun ioGetDriverObjectExtension(driverobject: ConstPtr<DriverObject>, clientidentificationaddress: ConstPtr<CVoid>): MutPtr<CVoid>

public expect fun ioGetFileObjectGenericMapping(): MutPtr<GenericMapping>

public expect fun ioGetFsZeroingOffset(irp: ConstPtr<Irp>, zeroingoffset: MutPtr<UInt>): Ntstatus

public expect fun ioGetInitialStack(): MutPtr<CVoid>

public expect fun ioGetInitiatorProcess(fileobject: ConstPtr<FileObject>): Peprocess

public expect fun ioGetIoAttributionHandle(irp: ConstPtr<Irp>, ioattributionhandle: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun ioGetIoPriorityHint(irp: ConstPtr<Irp>): IoPriorityHint

public expect fun ioGetIommuInterface(version: UInt, interfaceout: MutPtr<DmaIommuInterface>): Ntstatus

public expect fun ioGetIommuInterfaceEx(version: UInt, flags: ULong, interfaceout: MutPtr<DmaIommuInterfaceEx>): Ntstatus

public expect fun ioGetIrpExtraCreateParameter(irp: ConstPtr<Irp>, extracreateparameter: MutPtr<MutPtr<Long>>): Ntstatus

public expect fun ioGetPagingIoPriority(irp: ConstPtr<Irp>): IoPagingPriority

public expect fun ioGetRelatedDeviceObject(fileobject: ConstPtr<FileObject>): MutPtr<DeviceObject>

public expect fun ioGetSfioStreamIdentifier(fileobject: ConstPtr<FileObject>, signature: ConstPtr<CVoid>): MutPtr<CVoid>

public expect fun ioGetSilo(fileobject: ConstPtr<FileObject>): Pesilo

public expect fun ioGetSiloParameters(fileobject: ConstPtr<FileObject>): MutPtr<IoFoextSiloParameters>

public expect fun ioGetStackLimits(lowlimit: MutPtr<ULong>, highlimit: MutPtr<ULong>)

public expect fun ioGetTopLevelIrp(): MutPtr<Irp>

public expect fun ioGetTransactionParameterBlock(fileobject: ConstPtr<FileObject>): MutPtr<TxnParameterBlock>

public expect fun ioIncrementKeepAliveCount(fileobject: MutPtr<FileObject>, process: Peprocess): Ntstatus

public expect fun ioInitializeIrp(irp: MutPtr<Irp>, packetsize: UShort, stacksize: Byte)

public expect fun ioInitializeIrpEx(irp: MutPtr<Irp>, deviceobject: ConstPtr<DeviceObject>, packetsize: UShort, stacksize: Byte)

public expect fun ioInitializeRemoveLockEx(lock: MutPtr<IoRemoveLock>, allocatetag: UInt, maxlockedminutes: UInt, highwatermark: UInt, remlocksize: UInt)

public expect fun ioInitializeTimer(deviceobject: ConstPtr<DeviceObject>, timerroutine: PioTimerRoutine, context: ConstPtr<CVoid>): Ntstatus

public expect fun ioInitializeWorkItem(ioobject: ConstPtr<CVoid>, ioworkitem: PioWorkitem)

public expect fun ioInvalidateDeviceRelations(deviceobject: ConstPtr<DeviceObject>, type: DeviceRelationType)

public expect fun ioInvalidateDeviceState(physicaldeviceobject: ConstPtr<DeviceObject>)

public expect fun ioIs32bitProcess(irp: ConstPtr<Irp>): Boolean

public expect fun ioIsFileObjectIgnoringSharing(fileobject: ConstPtr<FileObject>): Boolean

public expect fun ioIsFileOriginRemote(fileobject: ConstPtr<FileObject>): Boolean

public expect fun ioIsInitiator32bitProcess(irp: ConstPtr<Irp>): Boolean

public expect fun ioIsValidIrpStatus(status: Ntstatus): UInt

public expect fun ioIsWdmVersionAvailable(majorversion: UByte, minorversion: UByte): Boolean

public expect fun ioMakeAssociatedIrp(irp: ConstPtr<Irp>, stacksize: Byte): MutPtr<Irp>

public expect fun ioMakeAssociatedIrpEx(irp: ConstPtr<Irp>, deviceobject: ConstPtr<DeviceObject>, stacksize: Byte): MutPtr<Irp>

public expect fun ioMapTransfer(adapterobject: ConstPtr<AdapterObject>, mdl: ConstPtr<Mdl>, mapregisterbase: ConstPtr<CVoid>, currentva: ConstPtr<CVoid>, length: MutPtr<UInt>, writetodevice: Boolean): Long

public expect fun ioOpenDeviceInterfaceRegistryKey(symboliclinkname: ConstPtr<UnicodeString>, desiredaccess: UInt, deviceinterfaceregkey: MutPtr<Handle>): Ntstatus

public expect fun ioOpenDeviceRegistryKey(deviceobject: ConstPtr<DeviceObject>, devinstkeytype: UInt, desiredaccess: UInt, deviceregkey: MutPtr<Handle>): Ntstatus

public expect fun ioOpenDriverRegistryKey(driverobject: ConstPtr<DriverObject>, regkeytype: DriverRegkeyType, desiredaccess: UInt, flags: UInt, driverregkey: MutPtr<Handle>): Ntstatus

public expect fun ioPropagateActivityIdToThread(irp: ConstPtr<Irp>, propagatedid: MutPtr<Guid>, originalid: MutPtr<MutPtr<Guid>>): Ntstatus

public expect fun ioQueryDeviceDescription(bustype: ConstPtr<InterfaceType>, busnumber: ConstPtr<UInt>, controllertype: ConstPtr<ConfigurationType>, controllernumber: ConstPtr<UInt>, peripheraltype: ConstPtr<ConfigurationType>, peripheralnumber: ConstPtr<UInt>, calloutroutine: PioQueryDeviceRoutine, context: MutPtr<CVoid>): Ntstatus

public expect fun ioQueryFullDriverPath(driverobject: ConstPtr<DriverObject>, fullpath: MutPtr<UnicodeString>): Ntstatus

public expect fun ioQueryInformationByName(objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, options: UInt, drivercontext: ConstPtr<IoDriverCreateContext>): Ntstatus

public expect fun ioQueryKsrPersistentMemorySize(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, buffersize: MutPtr<ULong>): Ntstatus

public expect fun ioQueryKsrPersistentMemorySizeEx(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, physicaldeviceid: ConstPtr<UnicodeString>, datatag: ConstPtr<UShort>, dataversion: MutPtr<UInt>, buffersize: MutPtr<ULong>): Ntstatus

public expect fun ioQueueWorkItem(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutine, queuetype: WorkQueueType, context: ConstPtr<CVoid>)

public expect fun ioQueueWorkItemEx(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutineEx, queuetype: WorkQueueType, context: ConstPtr<CVoid>)

public expect fun ioRaiseHardError(irp: ConstPtr<Irp>, vpb: ConstPtr<Vpb>, realdeviceobject: ConstPtr<DeviceObject>)

public expect fun ioRaiseInformationalHardError(errorstatus: Ntstatus, string: ConstPtr<UnicodeString>, thread: Pkthread): Boolean

public expect fun ioReadDiskSignature(deviceobject: ConstPtr<DeviceObject>, bytespersector: UInt, signature: MutPtr<DiskSignature>): Ntstatus

public expect fun ioReadPartitionTable(deviceobject: ConstPtr<DeviceObject>, sectorsize: UInt, returnrecognizedpartitions: Boolean, partitionbuffer: MutPtr<MutPtr<DriveLayoutInformation>>): Ntstatus

public expect fun ioReadPartitionTableEx(deviceobject: ConstPtr<DeviceObject>, drivelayout: MutPtr<MutPtr<DriveLayoutInformationEx>>): Ntstatus

public expect fun ioRecordIoAttribution(opaquehandle: MutPtr<CVoid>, attributioninformation: ConstPtr<IoAttributionInformation>): Ntstatus

public expect fun ioRegisterBootDriverCallback(callbackfunction: PbootDriverCallbackFunction, callbackcontext: ConstPtr<CVoid>): MutPtr<CVoid>

public expect fun ioRegisterBootDriverReinitialization(driverobject: ConstPtr<DriverObject>, driverreinitializationroutine: DriverReinitialize, context: ConstPtr<CVoid>)

public expect fun ioRegisterContainerNotification(notificationclass: IoContainerNotificationClass, callbackfunction: PioContainerNotificationFunction, notificationinformation: ConstPtr<CVoid>, notificationinformationlength: UInt, callbackregistration: MutPtr<CVoid>): Ntstatus

public expect fun ioRegisterDeviceInterface(physicaldeviceobject: ConstPtr<DeviceObject>, interfaceclassguid: ConstPtr<Guid>, referencestring: ConstPtr<UnicodeString>, symboliclinkname: MutPtr<UnicodeString>): Ntstatus

public expect fun ioRegisterDriverReinitialization(driverobject: ConstPtr<DriverObject>, driverreinitializationroutine: DriverReinitialize, context: ConstPtr<CVoid>)

public expect fun ioRegisterLastChanceShutdownNotification(deviceobject: ConstPtr<DeviceObject>): Ntstatus

public expect fun ioRegisterPlugPlayNotification(eventcategory: IoNotificationEventCategory, eventcategoryflags: UInt, eventcategorydata: ConstPtr<CVoid>, driverobject: ConstPtr<DriverObject>, callbackroutine: DriverNotificationCallbackRoutine, context: MutPtr<CVoid>, notificationentry: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun ioRegisterShutdownNotification(deviceobject: ConstPtr<DeviceObject>): Ntstatus

public expect fun ioReleaseCancelSpinLock(irql: UByte)

public expect fun ioReleaseRemoveLockAndWaitEx(removelock: MutPtr<IoRemoveLock>, tag: ConstPtr<CVoid>, remlocksize: UInt)

public expect fun ioReleaseRemoveLockEx(removelock: MutPtr<IoRemoveLock>, tag: ConstPtr<CVoid>, remlocksize: UInt)

public expect fun ioRemoveLinkShareAccess(fileobject: ConstPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, linkshareaccess: MutPtr<LinkShareAccess>)

public expect fun ioRemoveLinkShareAccessEx(fileobject: ConstPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, linkshareaccess: MutPtr<LinkShareAccess>, ioshareaccessflags: UInt)

public expect fun ioRemoveShareAccess(fileobject: ConstPtr<FileObject>, shareaccess: MutPtr<ShareAccess>)

public expect fun ioReplacePartitionUnit(targetpdo: ConstPtr<DeviceObject>, sparepdo: ConstPtr<DeviceObject>, flags: UInt): Ntstatus

public expect fun ioReportDetectedDevice(driverobject: ConstPtr<DriverObject>, legacybustype: InterfaceType, busnumber: UInt, slotnumber: UInt, resourcelist: ConstPtr<CmResourceList>, resourcerequirements: ConstPtr<IoResourceRequirementsList>, resourceassigned: Boolean, deviceobject: MutPtr<MutPtr<DeviceObject>>): Ntstatus

public expect fun ioReportInterruptActive(parameters: ConstPtr<IoReportInterruptActiveStateParameters>)

public expect fun ioReportInterruptInactive(parameters: ConstPtr<IoReportInterruptActiveStateParameters>)

public expect fun ioReportResourceForDetection(driverobject: ConstPtr<DriverObject>, driverlist: ConstPtr<CmResourceList>, driverlistsize: UInt, deviceobject: ConstPtr<DeviceObject>, devicelist: ConstPtr<CmResourceList>, devicelistsize: UInt, conflictdetected: MutPtr<Boolean>): Ntstatus

public expect fun ioReportResourceUsage(driverclassname: ConstPtr<UnicodeString>, driverobject: ConstPtr<DriverObject>, driverlist: ConstPtr<CmResourceList>, driverlistsize: UInt, deviceobject: ConstPtr<DeviceObject>, devicelist: ConstPtr<CmResourceList>, devicelistsize: UInt, overrideconflict: Boolean, conflictdetected: MutPtr<Boolean>): Ntstatus

public expect fun ioReportRootDevice(driverobject: ConstPtr<DriverObject>): Ntstatus

public expect fun ioReportTargetDeviceChange(physicaldeviceobject: ConstPtr<DeviceObject>, notificationstructure: ConstPtr<CVoid>): Ntstatus

public expect fun ioReportTargetDeviceChangeAsynchronous(physicaldeviceobject: ConstPtr<DeviceObject>, notificationstructure: ConstPtr<CVoid>, callback: PdeviceChangeCompleteCallback, context: ConstPtr<CVoid>): Ntstatus

public expect fun ioRequestDeviceEject(physicaldeviceobject: ConstPtr<DeviceObject>)

public expect fun ioRequestDeviceEjectEx(physicaldeviceobject: ConstPtr<DeviceObject>, callback: PioDeviceEjectCallback, context: ConstPtr<CVoid>, driverobject: ConstPtr<DriverObject>): Ntstatus

public expect fun ioReserveKsrPersistentMemory(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, size: ULong, flags: UInt, datahandle: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun ioReserveKsrPersistentMemoryEx(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, physicaldeviceid: ConstPtr<UnicodeString>, datatag: ConstPtr<UShort>, dataversion: UInt, size: ULong, flags: UInt, datahandle: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun ioReuseIrp(irp: MutPtr<Irp>, iostatus: Ntstatus)

public expect fun ioSetActivityIdIrp(irp: MutPtr<Irp>, guid: ConstPtr<Guid>): Ntstatus

public expect fun ioSetActivityIdThread(activityid: ConstPtr<Guid>): MutPtr<Guid>

public expect fun ioSetCompletionRoutineEx(deviceobject: ConstPtr<DeviceObject>, irp: ConstPtr<Irp>, completionroutine: PioCompletionRoutine, context: ConstPtr<CVoid>, invokeonsuccess: Boolean, invokeonerror: Boolean, invokeoncancel: Boolean): Ntstatus

public expect fun ioSetDeviceInterfacePropertyData(symboliclinkname: ConstPtr<UnicodeString>, propertykey: ConstPtr<Devpropkey>, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: ConstPtr<CVoid>): Ntstatus

public expect fun ioSetDeviceInterfaceState(symboliclinkname: ConstPtr<UnicodeString>, enable: Boolean): Ntstatus

public expect fun ioSetDevicePropertyData(pdo: ConstPtr<DeviceObject>, propertykey: ConstPtr<Devpropkey>, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: ConstPtr<CVoid>): Ntstatus

public expect fun ioSetFileObjectIgnoreSharing(fileobject: ConstPtr<FileObject>): Ntstatus

public expect fun ioSetFileOrigin(fileobject: ConstPtr<FileObject>, remote: Boolean): Ntstatus

public expect fun ioSetFsZeroingOffset(irp: MutPtr<Irp>, zeroingoffset: UInt): Ntstatus

public expect fun ioSetFsZeroingOffsetRequired(irp: MutPtr<Irp>): Ntstatus

public expect fun ioSetHardErrorOrVerifyDevice(irp: ConstPtr<Irp>, deviceobject: ConstPtr<DeviceObject>)

public expect fun ioSetIoAttributionIrp(irp: MutPtr<Irp>, attributionsource: ConstPtr<CVoid>, flags: UInt): Ntstatus

public expect fun ioSetIoPriorityHint(irp: ConstPtr<Irp>, priorityhint: IoPriorityHint): Ntstatus

public expect fun ioSetIrpExtraCreateParameter(irp: MutPtr<Irp>, extracreateparameter: ConstPtr<Long>): Ntstatus

public expect fun ioSetLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, linkshareaccess: MutPtr<LinkShareAccess>, ioshareaccessflags: UInt)

public expect fun ioSetMasterIrpStatus(masterirp: MutPtr<Irp>, status: Ntstatus)

public expect fun ioSetPartitionInformation(deviceobject: ConstPtr<DeviceObject>, sectorsize: UInt, partitionnumber: UInt, partitiontype: UInt): Ntstatus

public expect fun ioSetPartitionInformationEx(deviceobject: ConstPtr<DeviceObject>, partitionnumber: UInt, partitioninfo: ConstPtr<SetPartitionInformationEx>): Ntstatus

public expect fun ioSetShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr<FileObject>, shareaccess: MutPtr<ShareAccess>)

public expect fun ioSetShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, writepermission: ConstPtr<Boolean>)

public expect fun ioSetStartIoAttributes(deviceobject: ConstPtr<DeviceObject>, deferredstartio: Boolean, noncancelable: Boolean)

public expect fun ioSetSystemPartition(volumenamestring: ConstPtr<UnicodeString>): Ntstatus

public expect fun ioSetThreadHardErrorMode(enableharderrors: Boolean): Boolean

public expect fun ioSetTopLevelIrp(irp: ConstPtr<Irp>)

public expect fun ioSizeOfIrpEx(deviceobject: ConstPtr<DeviceObject>, stacksize: Byte): UShort

public expect fun ioSizeofWorkItem(): UInt

public expect fun ioStartNextPacket(deviceobject: ConstPtr<DeviceObject>, cancelable: Boolean)

public expect fun ioStartNextPacketByKey(deviceobject: ConstPtr<DeviceObject>, cancelable: Boolean, key: UInt)

public expect fun ioStartPacket(deviceobject: ConstPtr<DeviceObject>, irp: ConstPtr<Irp>, key: ConstPtr<UInt>, cancelfunction: DriverCancel)

public expect fun ioStartTimer(deviceobject: ConstPtr<DeviceObject>)

public expect fun ioStopTimer(deviceobject: ConstPtr<DeviceObject>)

public expect fun ioSynchronousCallDriver(deviceobject: ConstPtr<DeviceObject>, irp: ConstPtr<Irp>): Ntstatus

public expect fun ioTransferActivityId(activityid: ConstPtr<Guid>, relatedactivityid: ConstPtr<Guid>)

public expect fun ioTranslateBusAddress(interfacetype: InterfaceType, busnumber: UInt, busaddress: Long, addressspace: MutPtr<UInt>, translatedaddress: MutPtr<Long>): Boolean

public expect fun ioTryQueueWorkItem(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutineEx, queuetype: WorkQueueType, context: ConstPtr<CVoid>): Boolean

public expect fun ioUninitializeWorkItem(ioworkitem: PioWorkitem)

public expect fun ioUnregisterBootDriverCallback(callbackhandle: ConstPtr<CVoid>)

public expect fun ioUnregisterContainerNotification(callbackregistration: ConstPtr<CVoid>)

public expect fun ioUnregisterPlugPlayNotification(notificationentry: ConstPtr<CVoid>): Ntstatus

public expect fun ioUnregisterPlugPlayNotificationEx(notificationentry: ConstPtr<CVoid>): Ntstatus

public expect fun ioUnregisterShutdownNotification(deviceobject: ConstPtr<DeviceObject>)

public expect fun ioUpdateLinkShareAccess(fileobject: ConstPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, linkshareaccess: MutPtr<LinkShareAccess>)

public expect fun ioUpdateLinkShareAccessEx(fileobject: ConstPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, linkshareaccess: MutPtr<LinkShareAccess>, ioshareaccessflags: UInt)

public expect fun ioUpdateShareAccess(fileobject: ConstPtr<FileObject>, shareaccess: MutPtr<ShareAccess>)

public expect fun ioValidateDeviceIoControlAccess(irp: ConstPtr<Irp>, requiredaccess: UInt): Ntstatus

public expect fun ioVerifyPartitionTable(deviceobject: ConstPtr<DeviceObject>, fixerrors: Boolean): Ntstatus

public expect fun ioVolumeDeviceNameToGuid(volumedevicename: ConstPtr<UnicodeString>, guid: MutPtr<Guid>): Ntstatus

public expect fun ioVolumeDeviceNameToGuidPath(volumedevicename: ConstPtr<UnicodeString>, guidpath: MutPtr<UnicodeString>): Ntstatus

public expect fun ioVolumeDeviceToDosName(volumedeviceobject: ConstPtr<CVoid>, dosname: MutPtr<UnicodeString>): Ntstatus

public expect fun ioVolumeDeviceToGuid(volumedeviceobject: ConstPtr<CVoid>, guid: MutPtr<Guid>): Ntstatus

public expect fun ioVolumeDeviceToGuidPath(volumedeviceobject: ConstPtr<CVoid>, guidpath: MutPtr<UnicodeString>): Ntstatus

public expect fun ioWMIAllocateInstanceIds(guid: ConstPtr<Guid>, instancecount: UInt, firstinstanceid: MutPtr<UInt>): Ntstatus

public expect fun ioWMIDeviceObjectToInstanceName(datablockobject: ConstPtr<CVoid>, deviceobject: ConstPtr<DeviceObject>, instancename: MutPtr<UnicodeString>): Ntstatus

public expect fun ioWMIExecuteMethod(datablockobject: ConstPtr<CVoid>, instancename: ConstPtr<UnicodeString>, methodid: UInt, inbuffersize: UInt, outbuffersize: MutPtr<UInt>, inoutbuffer: MutPtr<UByte>): Ntstatus

public expect fun ioWMIHandleToInstanceName(datablockobject: ConstPtr<CVoid>, filehandle: Handle, instancename: MutPtr<UnicodeString>): Ntstatus

public expect fun ioWMIOpenBlock(guid: ConstPtr<Guid>, desiredaccess: UInt, datablockobject: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun ioWMIQueryAllData(datablockobject: ConstPtr<CVoid>, inoutbuffersize: MutPtr<UInt>, outbuffer: MutPtr<CVoid>): Ntstatus

public expect fun ioWMIQueryAllDataMultiple(datablockobjectlist: ConstPtr<ConstPtr<CVoid>>, objectcount: UInt, inoutbuffersize: MutPtr<UInt>, outbuffer: MutPtr<CVoid>): Ntstatus

public expect fun ioWMIQuerySingleInstance(datablockobject: ConstPtr<CVoid>, instancename: ConstPtr<UnicodeString>, inoutbuffersize: MutPtr<UInt>, outbuffer: MutPtr<CVoid>): Ntstatus

public expect fun ioWMIQuerySingleInstanceMultiple(datablockobjectlist: ConstPtr<ConstPtr<CVoid>>, instancenames: ConstPtr<UnicodeString>, objectcount: UInt, inoutbuffersize: MutPtr<UInt>, outbuffer: MutPtr<CVoid>): Ntstatus

public expect fun ioWMIRegistrationControl(deviceobject: ConstPtr<DeviceObject>, action: UInt): Ntstatus

public expect fun ioWMISetNotificationCallback(obj: MutPtr<CVoid>, callback: WmiNotificationCallback, context: ConstPtr<CVoid>): Ntstatus

public expect fun ioWMISetSingleInstance(datablockobject: ConstPtr<CVoid>, instancename: ConstPtr<UnicodeString>, version: UInt, valuebuffersize: UInt, valuebuffer: ConstPtr<CVoid>): Ntstatus

public expect fun ioWMISetSingleItem(datablockobject: ConstPtr<CVoid>, instancename: ConstPtr<UnicodeString>, dataitemid: UInt, version: UInt, valuebuffersize: UInt, valuebuffer: ConstPtr<CVoid>): Ntstatus

public expect fun ioWMISuggestInstanceName(physicaldeviceobject: ConstPtr<DeviceObject>, symboliclinkname: ConstPtr<UnicodeString>, combinenames: Boolean, suggestedinstancename: MutPtr<UnicodeString>): Ntstatus

public expect fun ioWMIWriteEvent(wnodeeventitem: MutPtr<CVoid>): Ntstatus

public expect fun ioWithinStackLimits(regionstart: ULong, regionsize: ULong): UInt

public expect fun ioWriteErrorLogEntry(elentry: ConstPtr<CVoid>)

public expect fun ioWriteKsrPersistentMemory(datahandle: ConstPtr<CVoid>, buffer: ConstPtr<CVoid>, size: ULong): Ntstatus

public expect fun ioWritePartitionTable(deviceobject: ConstPtr<DeviceObject>, sectorsize: UInt, sectorspertrack: UInt, numberofheads: UInt, partitionbuffer: ConstPtr<DriveLayoutInformation>): Ntstatus

public expect fun ioWritePartitionTableEx(deviceobject: ConstPtr<DeviceObject>, drivelayout: ConstPtr<DriveLayoutInformationEx>): Ntstatus

public expect fun iofCallDriver(deviceobject: ConstPtr<DeviceObject>, irp: MutPtr<Irp>): Ntstatus

public expect fun iofCompleteRequest(irp: ConstPtr<Irp>, priorityboost: Byte)

public expect fun kdChangeOption(option: KdOption, inbufferbytes: UInt, inbuffer: ConstPtr<CVoid>, outbufferbytes: UInt, outbuffer: MutPtr<CVoid>, outbufferneeded: MutPtr<UInt>): Ntstatus

public expect fun kdDisableDebugger(): Ntstatus

public expect fun kdEnableDebugger(): Ntstatus

public expect fun kdRefreshDebuggerNotPresent(): Boolean

public expect fun keAcquireGuardedMutex(mutex: MutPtr<FastMutex>)

public expect fun keAcquireGuardedMutexUnsafe(fastmutex: MutPtr<FastMutex>)

public expect fun keAcquireInStackQueuedSpinLock(spinlock: MutPtr<ULong>, lockhandle: MutPtr<KlockQueueHandle>)

public expect fun keAcquireInStackQueuedSpinLockAtDpcLevel(spinlock: MutPtr<ULong>, lockhandle: MutPtr<KlockQueueHandle>)

public expect fun keAcquireInStackQueuedSpinLockForDpc(spinlock: MutPtr<ULong>, lockhandle: MutPtr<KlockQueueHandle>)

public expect fun keAcquireInterruptSpinLock(interrupt: Pkinterrupt): UByte

public expect fun keAcquireSpinLockForDpc(spinlock: MutPtr<ULong>): UByte

public expect fun keAddTriageDumpDataBlock(ktriagedumpdataarray: MutPtr<KtriageDumpDataArray>, address: ConstPtr<CVoid>, size: ULong): Ntstatus

public expect fun keAreAllApcsDisabled(): Boolean

public expect fun keAreApcsDisabled(): Boolean

public expect fun keBugCheck(bugcheckcode: BugcheckError)

public expect fun keBugCheckEx(bugcheckcode: BugcheckError, bugcheckparameter1: ULong, bugcheckparameter2: ULong, bugcheckparameter3: ULong, bugcheckparameter4: ULong)

public expect fun keCancelTimer(param0: MutPtr<Ktimer>): Boolean

public expect fun keClearEvent(event: MutPtr<Kevent>)

public expect fun keConvertAuxiliaryCounterToPerformanceCounter(auxiliarycountervalue: ULong, performancecountervalue: MutPtr<ULong>, conversionerror: MutPtr<ULong>): Ntstatus

public expect fun keConvertPerformanceCounterToAuxiliaryCounter(performancecountervalue: ULong, auxiliarycountervalue: MutPtr<ULong>, conversionerror: MutPtr<ULong>): Ntstatus

public expect fun keDelayExecutionThread(waitmode: Byte, alertable: Boolean, interval: ConstPtr<Long>): Ntstatus

public expect fun keDeregisterBoundCallback(handle: ConstPtr<CVoid>): Ntstatus

public expect fun keDeregisterBugCheckCallback(callbackrecord: MutPtr<KbugcheckCallbackRecord>): Boolean

public expect fun keDeregisterBugCheckReasonCallback(callbackrecord: MutPtr<KbugcheckReasonCallbackRecord>): Boolean

public expect fun keDeregisterNmiCallback(handle: ConstPtr<CVoid>): Ntstatus

public expect fun keDeregisterProcessorChangeCallback(callbackhandle: ConstPtr<CVoid>)

public expect fun keEnterCriticalRegion()

public expect fun keEnterGuardedRegion()

public expect fun keExpandKernelStackAndCallout(callout: PexpandStackCallout, parameter: ConstPtr<CVoid>, size: ULong): Ntstatus

public expect fun keExpandKernelStackAndCalloutEx(callout: PexpandStackCallout, parameter: ConstPtr<CVoid>, size: ULong, wait: Boolean, context: ConstPtr<CVoid>): Ntstatus

public expect fun keFlushIoBuffers(mdl: ConstPtr<Mdl>, readoperation: Boolean, dmaoperation: Boolean)

public expect fun keFlushQueuedDpcs()

public expect fun keFlushWriteBuffer()

public expect fun keGetCurrentIrql(): UByte

public expect fun keGetCurrentNodeNumber(): UShort

public expect fun keGetCurrentProcessorNumberEx(procnumber: MutPtr<ProcessorNumber>): UInt

public expect fun keGetProcessorIndexFromNumber(procnumber: ConstPtr<ProcessorNumber>): UInt

public expect fun keGetProcessorNumberFromIndex(procindex: UInt, procnumber: MutPtr<ProcessorNumber>): Ntstatus

public expect fun keGetRecommendedSharedDataAlignment(): UInt

public expect fun keInitializeCrashDumpHeader(dumptype: UInt, flags: UInt, buffer: MutPtr<CVoid>, buffersize: UInt, bufferneeded: MutPtr<UInt>): Ntstatus

public expect fun keInitializeDeviceQueue(devicequeue: MutPtr<KdeviceQueue>)

public expect fun keInitializeDpc(dpc: MutPtr<Kdpc>, deferredroutine: PkdeferredRoutine, deferredcontext: ConstPtr<CVoid>)

public expect fun keInitializeEvent(event: MutPtr<Kevent>, type: EventType, state: Boolean)

public expect fun keInitializeGuardedMutex(mutex: MutPtr<FastMutex>)
