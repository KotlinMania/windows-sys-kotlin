package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DriverCancel
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DriverControl
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DriverNotificationCallbackRoutine
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DriverReinitialize
import io.github.kotlinmania.windowssys.windows.wdk.foundation.IoPriorityHint
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
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FileInformationClass
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClfsContextMode
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClfsIostatsClass
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClfsMgmtPolicyType
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClsLogInformationClass
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClsLsn
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.BugcheckError
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.EventInfoClass
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.Reghandle
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.EventType
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.SuiteType
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.FirmwareType

public expect fun clfsAddLogContainer(plfolog: COpaquePointer?, pcbcontainer: COpaquePointer?, puszcontainerpath: COpaquePointer?): Ntstatus

public expect fun clfsAddLogContainerSet(plfolog: COpaquePointer?, ccontainers: UShort, pcbcontainer: COpaquePointer?, rguszcontainerpath: COpaquePointer?): Ntstatus

public expect fun clfsAdvanceLogBase(pvmarshalcontext: COpaquePointer?, plsnbase: COpaquePointer?, fflags: UInt): Ntstatus

public expect fun clfsAlignReservedLog(pvmarshalcontext: COpaquePointer?, crecords: UInt, rgcbreservation: COpaquePointer?, pcbalignreservation: COpaquePointer?): Ntstatus

public expect fun clfsAllocReservedLog(pvmarshalcontext: COpaquePointer?, crecords: UInt, pcbadjustment: COpaquePointer?): Ntstatus

public expect fun clfsCloseAndResetLogFile(plfolog: COpaquePointer?): Ntstatus

public expect fun clfsCloseLogFileObject(plfolog: COpaquePointer?): Ntstatus

public expect fun clfsCreateLogFile(pplfolog: COpaquePointer?, puszlogfilename: COpaquePointer?, fdesiredaccess: UInt, dwsharemode: UInt, psdlogfile: PsecurityDescriptor, fcreatedisposition: UInt, fcreateoptions: UInt, fflagsandattributes: UInt, flogoptionflag: UInt, pvcontext: COpaquePointer?, cbcontext: UInt): Ntstatus

public expect fun clfsCreateMarshallingArea(plfolog: COpaquePointer?, epooltype: PoolType, pfnallocbuffer: PallocateFunction, pfnfreebuffer: PfreeFunction, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshalcontext: COpaquePointer?): Ntstatus

public expect fun clfsCreateMarshallingAreaEx(plfolog: COpaquePointer?, epooltype: PoolType, pfnallocbuffer: PallocateFunction, pfnfreebuffer: PfreeFunction, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, calignmentsize: UInt, fflags: ULong, ppvmarshalcontext: COpaquePointer?): Ntstatus

public expect fun clfsCreateScanContext(plfolog: COpaquePointer?, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: COpaquePointer?): Ntstatus

public expect fun clfsDeleteLogByPointer(plfolog: COpaquePointer?): Ntstatus

public expect fun clfsDeleteLogFile(puszlogfilename: COpaquePointer?, pvreserved: COpaquePointer?, flogoptionflag: UInt, pvcontext: COpaquePointer?, cbcontext: UInt): Ntstatus

public expect fun clfsDeleteMarshallingArea(pvmarshalcontext: COpaquePointer?): Ntstatus

public expect fun clfsEarlierLsn(plsn: COpaquePointer?): ClsLsn

public expect fun clfsFinalize()

public expect fun clfsFlushBuffers(pvmarshalcontext: COpaquePointer?): Ntstatus

public expect fun clfsFlushToLsn(pvmarshalcontext: COpaquePointer?, plsnflush: COpaquePointer?, plsnlastflushed: COpaquePointer?): Ntstatus

public expect fun clfsFreeReservedLog(pvmarshalcontext: COpaquePointer?, crecords: UInt, pcbadjustment: COpaquePointer?): Ntstatus

public expect fun clfsGetContainerName(plfolog: COpaquePointer?, cidlogicalcontainer: UInt, puszcontainername: COpaquePointer?, pcactuallencontainername: COpaquePointer?): Ntstatus

public expect fun clfsGetIoStatistics(plfolog: COpaquePointer?, pvstatsbuffer: COpaquePointer?, cbstatsbuffer: UInt, estatsclass: ClfsIostatsClass, pcbstatswritten: COpaquePointer?): Ntstatus

public expect fun clfsGetLogFileInformation(plfolog: COpaquePointer?, pinfobuffer: COpaquePointer?, pcbinfobuffer: COpaquePointer?): Ntstatus

public expect fun clfsInitialize(): Ntstatus

public expect fun clfsLaterLsn(plsn: COpaquePointer?): ClsLsn

public expect fun clfsLsnBlockOffset(plsn: COpaquePointer?): UInt

public expect fun clfsLsnContainer(plsn: COpaquePointer?): UInt

public expect fun clfsLsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): ClsLsn

public expect fun clfsLsnDifference(plsnstart: COpaquePointer?, plsnfinish: COpaquePointer?, cbcontainer: UInt, cbmaxblock: UInt, pcbdifference: COpaquePointer?): Ntstatus

public expect fun clfsLsnEqual(plsn1: COpaquePointer?, plsn2: COpaquePointer?): Boolean

public expect fun clfsLsnGreater(plsn1: COpaquePointer?, plsn2: COpaquePointer?): Boolean

public expect fun clfsLsnInvalid(plsn: COpaquePointer?): Boolean

public expect fun clfsLsnLess(plsn1: COpaquePointer?, plsn2: COpaquePointer?): Boolean

public expect fun clfsLsnNull(plsn: COpaquePointer?): Boolean

public expect fun clfsLsnRecordSequence(plsn: COpaquePointer?): UInt

public expect fun clfsMgmtDeregisterManagedClient(clientcookie: COpaquePointer?): Ntstatus

public expect fun clfsMgmtHandleLogFileFull(client: COpaquePointer?): Ntstatus

public expect fun clfsMgmtInstallPolicy(logfile: COpaquePointer?, policy: COpaquePointer?, policylength: UInt): Ntstatus

public expect fun clfsMgmtQueryPolicy(logfile: COpaquePointer?, policytype: ClfsMgmtPolicyType, policy: COpaquePointer?, policylength: COpaquePointer?): Ntstatus

public expect fun clfsMgmtRegisterManagedClient(logfile: COpaquePointer?, registrationdata: COpaquePointer?, clientcookie: COpaquePointer?): Ntstatus

public expect fun clfsMgmtRemovePolicy(logfile: COpaquePointer?, policytype: ClfsMgmtPolicyType): Ntstatus

public expect fun clfsMgmtSetLogFileSize(logfile: COpaquePointer?, newsizeincontainers: COpaquePointer?, resultingsizeincontainers: COpaquePointer?, completionroutine: PclfsSetLogSizeCompleteCallback, completionroutinedata: COpaquePointer?): Ntstatus

public expect fun clfsMgmtSetLogFileSizeAsClient(logfile: COpaquePointer?, clientcookie: COpaquePointer?, newsizeincontainers: COpaquePointer?, resultingsizeincontainers: COpaquePointer?, completionroutine: PclfsSetLogSizeCompleteCallback, completionroutinedata: COpaquePointer?): Ntstatus

public expect fun clfsMgmtTailAdvanceFailure(client: COpaquePointer?, reason: Ntstatus): Ntstatus

public expect fun clfsQueryLogFileInformation(plfolog: COpaquePointer?, einformationclass: ClsLogInformationClass, pinfoinputbuffer: COpaquePointer?, cbinfoinputbuffer: UInt, pinfobuffer: COpaquePointer?, pcbinfobuffer: COpaquePointer?): Ntstatus

public expect fun clfsReadLogRecord(pvmarshalcontext: COpaquePointer?, plsnfirst: COpaquePointer?, pecontextmode: ClfsContextMode, ppvreadbuffer: COpaquePointer?, pcbreadbuffer: COpaquePointer?, perecordtype: COpaquePointer?, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, ppvreadcontext: COpaquePointer?): Ntstatus

public expect fun clfsReadNextLogRecord(pvreadcontext: COpaquePointer?, ppvbuffer: COpaquePointer?, pcbbuffer: COpaquePointer?, perecordtype: COpaquePointer?, plsnuser: COpaquePointer?, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, plsnrecord: COpaquePointer?): Ntstatus

public expect fun clfsReadPreviousRestartArea(pvreadcontext: COpaquePointer?, ppvrestartbuffer: COpaquePointer?, pcbrestartbuffer: COpaquePointer?, plsnrestart: COpaquePointer?): Ntstatus

public expect fun clfsReadRestartArea(pvmarshalcontext: COpaquePointer?, ppvrestartbuffer: COpaquePointer?, pcbrestartbuffer: COpaquePointer?, plsn: COpaquePointer?, ppvreadcontext: COpaquePointer?): Ntstatus

public expect fun clfsRemoveLogContainer(plfolog: COpaquePointer?, puszcontainerpath: COpaquePointer?, fforce: Boolean): Ntstatus

public expect fun clfsRemoveLogContainerSet(plfolog: COpaquePointer?, ccontainers: UShort, rgwszcontainerpath: COpaquePointer?, fforce: Boolean): Ntstatus

public expect fun clfsReserveAndAppendLog(pvmarshalcontext: COpaquePointer?, rgwriteentries: COpaquePointer?, cwriteentries: UInt, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, creserverecords: UInt, rgcbreservation: COpaquePointer?, fflags: UInt, plsn: COpaquePointer?): Ntstatus

public expect fun clfsReserveAndAppendLogAligned(pvmarshalcontext: COpaquePointer?, rgwriteentries: COpaquePointer?, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, creserverecords: UInt, rgcbreservation: COpaquePointer?, fflags: UInt, plsn: COpaquePointer?): Ntstatus

public expect fun clfsScanLogContainers(pcxscan: COpaquePointer?, escanmode: UByte): Ntstatus

public expect fun clfsSetArchiveTail(plfolog: COpaquePointer?, plsnarchivetail: COpaquePointer?): Ntstatus

public expect fun clfsSetEndOfLog(plfolog: COpaquePointer?, plsnend: COpaquePointer?): Ntstatus

public expect fun clfsSetLogFileInformation(plfolog: COpaquePointer?, einformationclass: ClsLogInformationClass, pinfobuffer: COpaquePointer?, cbbuffer: UInt): Ntstatus

public expect fun clfsTerminateReadLog(pvcursorcontext: COpaquePointer?): Ntstatus

public expect fun clfsWriteRestartArea(pvmarshalcontext: COpaquePointer?, pvrestartbuffer: COpaquePointer?, cbrestartbuffer: UInt, plsnbase: COpaquePointer?, fflags: UInt, pcbwritten: COpaquePointer?, plsnnext: COpaquePointer?): Ntstatus

public expect fun cmCallbackGetKeyObjectID(cookie: COpaquePointer?, obj: COpaquePointer?, objectid: COpaquePointer?, objectname: COpaquePointer?): Ntstatus

public expect fun cmCallbackGetKeyObjectIDEx(cookie: COpaquePointer?, obj: COpaquePointer?, objectid: COpaquePointer?, objectname: COpaquePointer?, flags: UInt): Ntstatus

public expect fun cmCallbackReleaseKeyObjectIDEx(objectname: COpaquePointer?)

public expect fun cmGetBoundTransaction(cookie: COpaquePointer?, obj: COpaquePointer?): COpaquePointer?

public expect fun cmGetCallbackVersion(major: COpaquePointer?, minor: COpaquePointer?)

public expect fun cmRegisterCallback(function: PexCallbackFunction, context: COpaquePointer?, cookie: COpaquePointer?): Ntstatus

public expect fun cmRegisterCallbackEx(function: PexCallbackFunction, altitude: COpaquePointer?, driver: COpaquePointer?, context: COpaquePointer?, cookie: COpaquePointer?, reserved: COpaquePointer?): Ntstatus

public expect fun cmSetCallbackObjectContext(obj: COpaquePointer?, cookie: COpaquePointer?, newcontext: COpaquePointer?, oldcontext: COpaquePointer?): Ntstatus

public expect fun cmUnRegisterCallback(cookie: Long): Ntstatus

public expect fun dbgBreakPointWithStatus(status: UInt)

public expect fun dbgPrint(format: Pcstr, vararg variadicArgs: Long): UInt

public expect fun dbgPrintEx(componentid: UInt, level: UInt, format: Pcstr, vararg variadicArgs: Long): UInt

public expect fun dbgPrintReturnControlC(format: Pcstr, vararg variadicArgs: Long): UInt

public expect fun dbgPrompt(prompt: Pcstr, response: Pstr, length: UInt): UInt

public expect fun dbgQueryDebugFilterState(componentid: UInt, level: UInt): Ntstatus

public expect fun dbgSetDebugFilterState(componentid: UInt, level: UInt, state: Boolean): Ntstatus

public expect fun dbgSetDebugPrintCallback(debugprintcallback: PdebugPrintCallback, enable: Boolean): Ntstatus

public expect fun etwActivityIdControl(controlcode: UInt, activityid: COpaquePointer?): Ntstatus

public expect fun etwEventEnabled(reghandle: Reghandle, eventdescriptor: COpaquePointer?): Boolean

public expect fun etwProviderEnabled(reghandle: Reghandle, level: UByte, keyword: ULong): Boolean

public expect fun etwRegister(providerid: COpaquePointer?, enablecallback: Petwenablecallback, callbackcontext: COpaquePointer?, reghandle: COpaquePointer?): Ntstatus

public expect fun etwSetInformation(reghandle: Reghandle, informationclass: EventInfoClass, eventinformation: COpaquePointer?, informationlength: UInt): Ntstatus

public expect fun etwUnregister(reghandle: Reghandle): Ntstatus

public expect fun etwWrite(reghandle: Reghandle, eventdescriptor: COpaquePointer?, activityid: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): Ntstatus

public expect fun etwWriteEx(reghandle: Reghandle, eventdescriptor: COpaquePointer?, filter: ULong, flags: UInt, activityid: COpaquePointer?, relatedactivityid: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): Ntstatus

public expect fun etwWriteString(reghandle: Reghandle, level: UByte, keyword: ULong, activityid: COpaquePointer?, string: Pcwstr): Ntstatus

public expect fun etwWriteTransfer(reghandle: Reghandle, eventdescriptor: COpaquePointer?, activityid: COpaquePointer?, relatedactivityid: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): Ntstatus

public expect fun exAcquireFastMutex(fastmutex: COpaquePointer?)

public expect fun exAcquireFastMutexUnsafe(fastmutex: COpaquePointer?)

public expect fun exAcquirePushLockExclusiveEx(pushlock: COpaquePointer?, flags: UInt)

public expect fun exAcquirePushLockSharedEx(pushlock: COpaquePointer?, flags: UInt)

public expect fun exAcquireResourceExclusiveLite(resource: COpaquePointer?, wait: Boolean): Boolean

public expect fun exAcquireResourceSharedLite(resource: COpaquePointer?, wait: Boolean): Boolean

public expect fun exAcquireRundownProtection(runref: COpaquePointer?): Boolean

public expect fun exAcquireRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware): Boolean

public expect fun exAcquireRundownProtectionCacheAwareEx(runrefcacheaware: PexRundownRefCacheAware, count: UInt): Boolean

public expect fun exAcquireRundownProtectionEx(runref: COpaquePointer?, count: UInt): Boolean

public expect fun exAcquireSharedStarveExclusive(resource: COpaquePointer?, wait: Boolean): Boolean

public expect fun exAcquireSharedWaitForExclusive(resource: COpaquePointer?, wait: Boolean): Boolean

public expect fun exAcquireSpinLockExclusive(spinlock: COpaquePointer?): UByte

public expect fun exAcquireSpinLockExclusiveAtDpcLevel(spinlock: COpaquePointer?)

public expect fun exAcquireSpinLockShared(spinlock: COpaquePointer?): UByte

public expect fun exAcquireSpinLockSharedAtDpcLevel(spinlock: COpaquePointer?)

public expect fun exAllocateCacheAwareRundownProtection(pooltype: PoolType, pooltag: UInt): PexRundownRefCacheAware

public expect fun exAllocatePool(pooltype: PoolType, numberofbytes: ULong): COpaquePointer?

public expect fun exAllocatePool2(flags: ULong, numberofbytes: ULong, tag: UInt): COpaquePointer?

public expect fun exAllocatePool3(flags: ULong, numberofbytes: ULong, tag: UInt, extendedparameters: COpaquePointer?, extendedparameterscount: UInt): COpaquePointer?

public expect fun exAllocatePoolWithQuota(pooltype: PoolType, numberofbytes: ULong): COpaquePointer?

public expect fun exAllocatePoolWithQuotaTag(pooltype: PoolType, numberofbytes: ULong, tag: UInt): COpaquePointer?

public expect fun exAllocatePoolWithTag(pooltype: PoolType, numberofbytes: ULong, tag: UInt): COpaquePointer?

public expect fun exAllocatePoolWithTagPriority(pooltype: PoolType, numberofbytes: ULong, tag: UInt, priority: ExPoolPriority): COpaquePointer?

public expect fun exAllocateTimer(callback: PextCallback, callbackcontext: COpaquePointer?, attributes: UInt): PexTimer

public expect fun exCancelTimer(timer: PexTimer, parameters: COpaquePointer?): Boolean

public expect fun exCleanupRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware)

public expect fun exConvertExclusiveToSharedLite(resource: COpaquePointer?)

public expect fun exCreateCallback(callbackobject: COpaquePointer?, objectattributes: COpaquePointer?, create: Boolean, allowmultiplecallbacks: Boolean): Ntstatus

public expect fun exCreatePool(flags: UInt, tag: ULong, params: COpaquePointer?, poolhandle: COpaquePointer?): Ntstatus

public expect fun exDeleteResourceLite(resource: COpaquePointer?): Ntstatus

public expect fun exDeleteTimer(timer: PexTimer, cancel: Boolean, wait: Boolean, parameters: COpaquePointer?): Boolean

public expect fun exDestroyPool(poolhandle: Handle)

public expect fun exEnterCriticalRegionAndAcquireResourceExclusive(resource: COpaquePointer?): COpaquePointer?

public expect fun exEnterCriticalRegionAndAcquireResourceShared(resource: COpaquePointer?): COpaquePointer?

public expect fun exEnterCriticalRegionAndAcquireSharedWaitForExclusive(resource: COpaquePointer?): COpaquePointer?

public expect fun exEnumerateSystemFirmwareTables(firmwaretableprovidersignature: UInt, firmwaretablebuffer: COpaquePointer?, bufferlength: UInt, returnlength: COpaquePointer?): Ntstatus

public expect fun exExtendZone(zone: COpaquePointer?, segment: COpaquePointer?, segmentsize: UInt): Ntstatus

public expect fun exFreeCacheAwareRundownProtection(runrefcacheaware: PexRundownRefCacheAware)

public expect fun exFreePool(p: COpaquePointer?)

public expect fun exFreePool2(p: COpaquePointer?, tag: UInt, extendedparameters: COpaquePointer?, extendedparameterscount: UInt)

public expect fun exFreePoolWithTag(p: COpaquePointer?, tag: UInt)

public expect fun exGetExclusiveWaiterCount(resource: COpaquePointer?): UInt

public expect fun exGetFirmwareEnvironmentVariable(variablename: COpaquePointer?, vendorguid: COpaquePointer?, value: COpaquePointer?, valuelength: COpaquePointer?, attributes: COpaquePointer?): Ntstatus

public expect fun exGetFirmwareType(): FirmwareType

public expect fun exGetPreviousMode(): Byte

public expect fun exGetSharedWaiterCount(resource: COpaquePointer?): UInt

public expect fun exGetSystemFirmwareTable(firmwaretableprovidersignature: UInt, firmwaretableid: UInt, firmwaretablebuffer: COpaquePointer?, bufferlength: UInt, returnlength: COpaquePointer?): Ntstatus

public expect fun exInitializePushLock(pushlock: COpaquePointer?)

public expect fun exInitializeResourceLite(resource: COpaquePointer?): Ntstatus

public expect fun exInitializeRundownProtection(runref: COpaquePointer?)

public expect fun exInitializeRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware, runrefsize: ULong)

public expect fun exInitializeRundownProtectionCacheAwareEx(runrefcacheaware: PexRundownRefCacheAware, flags: UInt)

public expect fun exInitializeZone(zone: COpaquePointer?, blocksize: UInt, initialsegment: COpaquePointer?, initialsegmentsize: UInt): Ntstatus

public expect fun exInterlockedAddLargeInteger(addend: COpaquePointer?, increment: Long, lock: COpaquePointer?): Long

public expect fun exInterlockedExtendZone(zone: COpaquePointer?, segment: COpaquePointer?, segmentsize: UInt, lock: COpaquePointer?): Ntstatus

public expect fun exIsManufacturingModeEnabled(): Boolean

public expect fun exIsProcessorFeaturePresent(processorfeature: UInt): Boolean

public expect fun exIsResourceAcquiredExclusiveLite(resource: COpaquePointer?): Boolean

public expect fun exIsResourceAcquiredSharedLite(resource: COpaquePointer?): UInt

public expect fun exIsSoftBoot(): Boolean

public expect fun exLocalTimeToSystemTime(localtime: COpaquePointer?, systemtime: COpaquePointer?)

public expect fun exNotifyCallback(callbackobject: COpaquePointer?, argument1: COpaquePointer?, argument2: COpaquePointer?)

public expect fun exQueryTimerResolution(maximumtime: COpaquePointer?, minimumtime: COpaquePointer?, currenttime: COpaquePointer?)

public expect fun exQueueWorkItem(workitem: COpaquePointer?, queuetype: WorkQueueType)

public expect fun exRaiseAccessViolation()

public expect fun exRaiseDatatypeMisalignment()

public expect fun exRaiseStatus(status: Ntstatus)

public expect fun exReInitializeRundownProtection(runref: COpaquePointer?)

public expect fun exReInitializeRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware)

public expect fun exRegisterCallback(callbackobject: PcallbackObject, callbackfunction: PcallbackFunction, callbackcontext: COpaquePointer?): COpaquePointer?

public expect fun exReinitializeResourceLite(resource: COpaquePointer?): Ntstatus

public expect fun exReleaseFastMutex(fastmutex: COpaquePointer?)

public expect fun exReleaseFastMutexUnsafe(fastmutex: COpaquePointer?)

public expect fun exReleasePushLockExclusiveEx(pushlock: COpaquePointer?, flags: UInt)

public expect fun exReleasePushLockSharedEx(pushlock: COpaquePointer?, flags: UInt)

public expect fun exReleaseResourceAndLeaveCriticalRegion(resource: COpaquePointer?)

public expect fun exReleaseResourceForThreadLite(resource: COpaquePointer?, resourcethreadid: ULong)

public expect fun exReleaseResourceLite(resource: COpaquePointer?)

public expect fun exReleaseRundownProtection(runref: COpaquePointer?)

public expect fun exReleaseRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware)

public expect fun exReleaseRundownProtectionCacheAwareEx(runref: PexRundownRefCacheAware, count: UInt)

public expect fun exReleaseRundownProtectionEx(runref: COpaquePointer?, count: UInt)

public expect fun exReleaseSpinLockExclusive(spinlock: COpaquePointer?, oldirql: UByte)

public expect fun exReleaseSpinLockExclusiveFromDpcLevel(spinlock: COpaquePointer?)

public expect fun exReleaseSpinLockShared(spinlock: COpaquePointer?, oldirql: UByte)

public expect fun exReleaseSpinLockSharedFromDpcLevel(spinlock: COpaquePointer?)

public expect fun exRundownCompleted(runref: COpaquePointer?)

public expect fun exRundownCompletedCacheAware(runrefcacheaware: PexRundownRefCacheAware)

public expect fun exSecurePoolUpdate(securepoolhandle: Handle, tag: UInt, allocation: COpaquePointer?, cookie: ULong, offset: ULong, size: ULong, buffer: COpaquePointer?): Ntstatus

public expect fun exSecurePoolValidate(securepoolhandle: Handle, tag: UInt, allocation: COpaquePointer?, cookie: ULong): UInt

public expect fun exSetFirmwareEnvironmentVariable(variablename: COpaquePointer?, vendorguid: COpaquePointer?, value: COpaquePointer?, valuelength: UInt, attributes: UInt): Ntstatus

public expect fun exSetResourceOwnerPointer(resource: COpaquePointer?, ownerpointer: COpaquePointer?)

public expect fun exSetResourceOwnerPointerEx(resource: COpaquePointer?, ownerpointer: COpaquePointer?, flags: UInt)

public expect fun exSetTimer(timer: PexTimer, duetime: Long, period: Long, parameters: COpaquePointer?): Boolean

public expect fun exSetTimerResolution(desiredtime: UInt, setresolution: Boolean): UInt

public expect fun exSizeOfRundownProtectionCacheAware(): ULong

public expect fun exSystemTimeToLocalTime(systemtime: COpaquePointer?, localtime: COpaquePointer?)

public expect fun exTryAcquireSpinLockExclusiveAtDpcLevel(spinlock: COpaquePointer?): UInt

public expect fun exTryAcquireSpinLockSharedAtDpcLevel(spinlock: COpaquePointer?): UInt

public expect fun exTryConvertSharedSpinLockExclusive(spinlock: COpaquePointer?): UInt

public expect fun exTryToAcquireFastMutex(fastmutex: COpaquePointer?): Boolean

public expect fun exUnregisterCallback(callbackregistration: COpaquePointer?)

public expect fun exUuidCreate(uuid: COpaquePointer?): Ntstatus

public expect fun exVerifySuite(suitetype: SuiteType): Boolean

public expect fun exWaitForRundownProtectionRelease(runref: COpaquePointer?)

public expect fun exWaitForRundownProtectionReleaseCacheAware(runref: PexRundownRefCacheAware)

public expect fun fsRtlIsTotalDeviceFailure(status: Ntstatus): Boolean

public expect fun halAcquireDisplayOwnership(resetdisplayparameters: PhalResetDisplayParameters)

public expect fun halAllocateAdapterChannel(adapterobject: COpaquePointer?, wcb: COpaquePointer?, numberofmapregisters: UInt, executionroutine: DriverControl): Ntstatus

public expect fun halAllocateCommonBuffer(adapterobject: COpaquePointer?, length: UInt, logicaladdress: COpaquePointer?, cacheenabled: Boolean): COpaquePointer?

public expect fun halAllocateCrashDumpRegisters(adapterobject: COpaquePointer?, numberofmapregisters: COpaquePointer?): COpaquePointer?

public expect fun halAllocateHardwareCounters(groupaffinty: COpaquePointer?, groupcount: UInt, resourcelist: COpaquePointer?, countersethandle: COpaquePointer?): Ntstatus

public expect fun halAssignSlotResources(registrypath: COpaquePointer?, driverclassname: COpaquePointer?, driverobject: COpaquePointer?, deviceobject: COpaquePointer?, bustype: InterfaceType, busnumber: UInt, slotnumber: UInt, allocatedresources: COpaquePointer?): Ntstatus

public expect fun halBugCheckSystem(errorsource: COpaquePointer?, errorrecord: COpaquePointer?)

public expect fun halDmaAllocateCrashDumpRegistersEx(adapter: COpaquePointer?, numberofmapregisters: UInt, type: HalDmaCrashDumpRegisterType, mapregisterbase: COpaquePointer?, mapregistersavailable: COpaquePointer?): Ntstatus

public expect fun halDmaFreeCrashDumpRegistersEx(adapter: COpaquePointer?, type: HalDmaCrashDumpRegisterType): Ntstatus

public expect fun halExamineMBR(deviceobject: COpaquePointer?, sectorsize: UInt, mbrtypeidentifier: UInt, buffer: COpaquePointer?)

public expect fun halFreeCommonBuffer(adapterobject: COpaquePointer?, length: UInt, logicaladdress: Long, virtualaddress: COpaquePointer?, cacheenabled: Boolean)

public expect fun halFreeHardwareCounters(countersethandle: Handle): Ntstatus

public expect fun halGetAdapter(devicedescription: COpaquePointer?, numberofmapregisters: COpaquePointer?): COpaquePointer?

public expect fun halGetBusData(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: COpaquePointer?, length: UInt): UInt

public expect fun halGetBusDataByOffset(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: COpaquePointer?, offset: UInt, length: UInt): UInt

public expect fun halGetInterruptVector(interfacetype: InterfaceType, busnumber: UInt, businterruptlevel: UInt, businterruptvector: UInt, irql: COpaquePointer?, affinity: COpaquePointer?): UInt

public expect fun halMakeBeep(frequency: UInt): Boolean

public expect fun halReadDmaCounter(adapterobject: COpaquePointer?): UInt

public expect fun halSetBusData(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: COpaquePointer?, length: UInt): UInt

public expect fun halSetBusDataByOffset(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: COpaquePointer?, offset: UInt, length: UInt): UInt

public expect fun halTranslateBusAddress(interfacetype: InterfaceType, busnumber: UInt, busaddress: Long, addressspace: COpaquePointer?, translatedaddress: COpaquePointer?): Boolean

public expect fun hvlRegisterWheaErrorNotification(callback: PhvlWheaErrorNotification): Ntstatus

public expect fun hvlUnregisterWheaErrorNotification(callback: PhvlWheaErrorNotification): Ntstatus

public expect fun ioAcquireCancelSpinLock(irql: COpaquePointer?)

public expect fun ioAcquireKsrPersistentMemory(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, buffer: COpaquePointer?, size: COpaquePointer?): Ntstatus

public expect fun ioAcquireKsrPersistentMemoryEx(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, physicaldeviceid: COpaquePointer?, datatag: COpaquePointer?, dataversion: COpaquePointer?, buffer: COpaquePointer?, size: COpaquePointer?): Ntstatus

public expect fun ioAcquireRemoveLockEx(removelock: COpaquePointer?, tag: COpaquePointer?, file: Pcstr, line: UInt, remlocksize: UInt): Ntstatus

public expect fun ioAllocateAdapterChannel(adapterobject: COpaquePointer?, deviceobject: COpaquePointer?, numberofmapregisters: UInt, executionroutine: DriverControl, context: COpaquePointer?): Ntstatus

public expect fun ioAllocateController(controllerobject: COpaquePointer?, deviceobject: COpaquePointer?, executionroutine: DriverControl, context: COpaquePointer?)

public expect fun ioAllocateDriverObjectExtension(driverobject: COpaquePointer?, clientidentificationaddress: COpaquePointer?, driverobjectextensionsize: UInt, driverobjectextension: COpaquePointer?): Ntstatus

public expect fun ioAllocateErrorLogEntry(ioobject: COpaquePointer?, entrysize: UByte): COpaquePointer?

public expect fun ioAllocateIrp(stacksize: Byte, chargequota: Boolean): COpaquePointer?

public expect fun ioAllocateIrpEx(deviceobject: COpaquePointer?, stacksize: Byte, chargequota: Boolean): COpaquePointer?

public expect fun ioAllocateMdl(virtualaddress: COpaquePointer?, length: UInt, secondarybuffer: Boolean, chargequota: Boolean, irp: COpaquePointer?): COpaquePointer?

public expect fun ioAllocateSfioStreamIdentifier(fileobject: COpaquePointer?, length: UInt, signature: COpaquePointer?, streamidentifier: COpaquePointer?): Ntstatus

public expect fun ioAllocateWorkItem(deviceobject: COpaquePointer?): PioWorkitem

public expect fun ioAssignResources(registrypath: COpaquePointer?, driverclassname: COpaquePointer?, driverobject: COpaquePointer?, deviceobject: COpaquePointer?, requestedresources: COpaquePointer?, allocatedresources: COpaquePointer?): Ntstatus

public expect fun ioAttachDevice(sourcedevice: COpaquePointer?, targetdevice: COpaquePointer?, attacheddevice: COpaquePointer?): Ntstatus

public expect fun ioAttachDeviceByPointer(sourcedevice: COpaquePointer?, targetdevice: COpaquePointer?): Ntstatus

public expect fun ioAttachDeviceToDeviceStack(sourcedevice: COpaquePointer?, targetdevice: COpaquePointer?): COpaquePointer?

public expect fun ioAttachDeviceToDeviceStackSafe(sourcedevice: COpaquePointer?, targetdevice: COpaquePointer?, attachedtodeviceobject: COpaquePointer?): Ntstatus

public expect fun ioBuildAsynchronousFsdRequest(majorfunction: UInt, deviceobject: COpaquePointer?, buffer: COpaquePointer?, length: UInt, startingoffset: COpaquePointer?, iostatusblock: COpaquePointer?): COpaquePointer?

public expect fun ioBuildDeviceIoControlRequest(iocontrolcode: UInt, deviceobject: COpaquePointer?, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt, internaldeviceiocontrol: Boolean, event: COpaquePointer?, iostatusblock: COpaquePointer?): COpaquePointer?

public expect fun ioBuildPartialMdl(sourcemdl: COpaquePointer?, targetmdl: COpaquePointer?, virtualaddress: COpaquePointer?, length: UInt)

public expect fun ioBuildSynchronousFsdRequest(majorfunction: UInt, deviceobject: COpaquePointer?, buffer: COpaquePointer?, length: UInt, startingoffset: COpaquePointer?, event: COpaquePointer?, iostatusblock: COpaquePointer?): COpaquePointer?

public expect fun ioCancelFileOpen(deviceobject: COpaquePointer?, fileobject: COpaquePointer?)

public expect fun ioCancelIrp(irp: COpaquePointer?): Boolean

public expect fun ioCheckLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: COpaquePointer?, shareaccess: COpaquePointer?, linkshareaccess: COpaquePointer?, ioshareaccessflags: UInt): Ntstatus

public expect fun ioCheckShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: COpaquePointer?, shareaccess: COpaquePointer?, update: Boolean): Ntstatus

public expect fun ioCheckShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: COpaquePointer?, shareaccess: COpaquePointer?, update: Boolean, writepermission: COpaquePointer?): Ntstatus

public expect fun ioCleanupIrp(irp: COpaquePointer?)

public expect fun ioClearActivityIdThread(originalid: COpaquePointer?)

public expect fun ioClearIrpExtraCreateParameter(irp: COpaquePointer?)

public expect fun ioConnectInterrupt(interruptobject: COpaquePointer?, serviceroutine: PkserviceRoutine, servicecontext: COpaquePointer?, spinlock: COpaquePointer?, vector: UInt, irql: UByte, synchronizeirql: UByte, interruptmode: KinterruptMode, sharevector: Boolean, processorenablemask: ULong, floatingsave: Boolean): Ntstatus

public expect fun ioConnectInterruptEx(parameters: COpaquePointer?): Ntstatus

public expect fun ioCreateController(size: UInt): COpaquePointer?

public expect fun ioCreateDevice(driverobject: COpaquePointer?, deviceextensionsize: UInt, devicename: COpaquePointer?, devicetype: UInt, devicecharacteristics: UInt, exclusive: Boolean, deviceobject: COpaquePointer?): Ntstatus

public expect fun ioCreateDisk(deviceobject: COpaquePointer?, disk: COpaquePointer?): Ntstatus

public expect fun ioCreateFile(filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt, createfiletype: CreateFileType, internalparameters: COpaquePointer?, options: UInt): Ntstatus

public expect fun ioCreateFileEx(filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt, createfiletype: CreateFileType, internalparameters: COpaquePointer?, options: UInt, drivercontext: COpaquePointer?): Ntstatus

public expect fun ioCreateFileSpecifyDeviceObjectHint(filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt, createfiletype: CreateFileType, internalparameters: COpaquePointer?, options: UInt, deviceobject: COpaquePointer?): Ntstatus

public expect fun ioCreateNotificationEvent(eventname: COpaquePointer?, eventhandle: COpaquePointer?): COpaquePointer?

public expect fun ioCreateSymbolicLink(symboliclinkname: COpaquePointer?, devicename: COpaquePointer?): Ntstatus

public expect fun ioCreateSynchronizationEvent(eventname: COpaquePointer?, eventhandle: COpaquePointer?): COpaquePointer?

public expect fun ioCreateSystemThread(ioobject: COpaquePointer?, threadhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, processhandle: Handle, clientid: COpaquePointer?, startroutine: PkstartRoutine, startcontext: COpaquePointer?): Ntstatus

public expect fun ioCreateUnprotectedSymbolicLink(symboliclinkname: COpaquePointer?, devicename: COpaquePointer?): Ntstatus

public expect fun ioCsqInitialize(csq: COpaquePointer?, csqinsertirp: PioCsqInsertIrp, csqremoveirp: PioCsqRemoveIrp, csqpeeknextirp: PioCsqPeekNextIrp, csqacquirelock: PioCsqAcquireLock, csqreleaselock: PioCsqReleaseLock, csqcompletecanceledirp: PioCsqCompleteCanceledIrp): Ntstatus

public expect fun ioCsqInitializeEx(csq: COpaquePointer?, csqinsertirp: PioCsqInsertIrpEx, csqremoveirp: PioCsqRemoveIrp, csqpeeknextirp: PioCsqPeekNextIrp, csqacquirelock: PioCsqAcquireLock, csqreleaselock: PioCsqReleaseLock, csqcompletecanceledirp: PioCsqCompleteCanceledIrp): Ntstatus

public expect fun ioCsqInsertIrp(csq: COpaquePointer?, irp: COpaquePointer?, context: COpaquePointer?)

public expect fun ioCsqInsertIrpEx(csq: COpaquePointer?, irp: COpaquePointer?, context: COpaquePointer?, insertcontext: COpaquePointer?): Ntstatus

public expect fun ioCsqRemoveIrp(csq: COpaquePointer?, context: COpaquePointer?): COpaquePointer?

public expect fun ioCsqRemoveNextIrp(csq: COpaquePointer?, peekcontext: COpaquePointer?): COpaquePointer?

public expect fun ioDecrementKeepAliveCount(fileobject: COpaquePointer?, process: Peprocess): Ntstatus

public expect fun ioDeleteController(controllerobject: COpaquePointer?)

public expect fun ioDeleteDevice(deviceobject: COpaquePointer?)

public expect fun ioDeleteSymbolicLink(symboliclinkname: COpaquePointer?): Ntstatus

public expect fun ioDetachDevice(targetdevice: COpaquePointer?)

public expect fun ioDisconnectInterrupt(interruptobject: Pkinterrupt)

public expect fun ioDisconnectInterruptEx(parameters: COpaquePointer?)

public expect fun ioEnumerateKsrPersistentMemoryEx(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, physicaldeviceid: COpaquePointer?, callback: PioPersistedMemoryEnumerationCallback, callbackcontext: COpaquePointer?): Ntstatus

public expect fun ioFlushAdapterBuffers(adapterobject: COpaquePointer?, mdl: COpaquePointer?, mapregisterbase: COpaquePointer?, currentva: COpaquePointer?, length: UInt, writetodevice: Boolean): Boolean

public expect fun ioForwardIrpSynchronously(deviceobject: COpaquePointer?, irp: COpaquePointer?): Boolean

public expect fun ioFreeAdapterChannel(adapterobject: COpaquePointer?)

public expect fun ioFreeController(controllerobject: COpaquePointer?)

public expect fun ioFreeErrorLogEntry(elentry: COpaquePointer?)

public expect fun ioFreeIrp(irp: COpaquePointer?)

public expect fun ioFreeKsrPersistentMemory(datahandle: COpaquePointer?): Ntstatus

public expect fun ioFreeMapRegisters(adapterobject: COpaquePointer?, mapregisterbase: COpaquePointer?, numberofmapregisters: UInt)

public expect fun ioFreeMdl(mdl: COpaquePointer?)

public expect fun ioFreeSfioStreamIdentifier(fileobject: COpaquePointer?, signature: COpaquePointer?): Ntstatus

public expect fun ioFreeWorkItem(ioworkitem: PioWorkitem)

public expect fun ioGetActivityIdIrp(irp: COpaquePointer?, guid: COpaquePointer?): Ntstatus

public expect fun ioGetActivityIdThread(): COpaquePointer?

public expect fun ioGetAffinityInterrupt(interruptobject: Pkinterrupt, groupaffinity: COpaquePointer?): Ntstatus

public expect fun ioGetAttachedDeviceReference(deviceobject: COpaquePointer?): COpaquePointer?

public expect fun ioGetBootDiskInformation(bootdiskinformation: COpaquePointer?, size: UInt): Ntstatus

public expect fun ioGetBootDiskInformationLite(bootdiskinformation: COpaquePointer?): Ntstatus

public expect fun ioGetConfigurationInformation(): COpaquePointer?

public expect fun ioGetContainerInformation(informationclass: IoContainerInformationClass, containerobject: COpaquePointer?, buffer: COpaquePointer?, bufferlength: UInt): Ntstatus

public expect fun ioGetCurrentProcess(): Peprocess

public expect fun ioGetDeviceDirectory(physicaldeviceobject: COpaquePointer?, directorytype: DeviceDirectoryType, flags: UInt, reserved: COpaquePointer?, devicedirectoryhandle: COpaquePointer?): Ntstatus

public expect fun ioGetDeviceInterfaceAlias(symboliclinkname: COpaquePointer?, aliasinterfaceclassguid: COpaquePointer?, aliassymboliclinkname: COpaquePointer?): Ntstatus

public expect fun ioGetDeviceInterfacePropertyData(symboliclinkname: COpaquePointer?, propertykey: COpaquePointer?, lcid: UInt, flags: UInt, size: UInt, data: COpaquePointer?, requiredsize: COpaquePointer?, type: COpaquePointer?): Ntstatus

public expect fun ioGetDeviceInterfaces(interfaceclassguid: COpaquePointer?, physicaldeviceobject: COpaquePointer?, flags: UInt, symboliclinklist: COpaquePointer?): Ntstatus

public expect fun ioGetDeviceNumaNode(pdo: COpaquePointer?, nodenumber: COpaquePointer?): Ntstatus

public expect fun ioGetDeviceObjectPointer(objectname: COpaquePointer?, desiredaccess: UInt, fileobject: COpaquePointer?, deviceobject: COpaquePointer?): Ntstatus

public expect fun ioGetDeviceProperty(deviceobject: COpaquePointer?, deviceproperty: DeviceRegistryProperty, bufferlength: UInt, propertybuffer: COpaquePointer?, resultlength: COpaquePointer?): Ntstatus

public expect fun ioGetDevicePropertyData(pdo: COpaquePointer?, propertykey: COpaquePointer?, lcid: UInt, flags: UInt, size: UInt, data: COpaquePointer?, requiredsize: COpaquePointer?, type: COpaquePointer?): Ntstatus

public expect fun ioGetDmaAdapter(physicaldeviceobject: COpaquePointer?, devicedescription: COpaquePointer?, numberofmapregisters: COpaquePointer?): COpaquePointer?

public expect fun ioGetDriverDirectory(driverobject: COpaquePointer?, directorytype: DriverDirectoryType, flags: UInt, driverdirectoryhandle: COpaquePointer?): Ntstatus

public expect fun ioGetDriverObjectExtension(driverobject: COpaquePointer?, clientidentificationaddress: COpaquePointer?): COpaquePointer?

public expect fun ioGetFileObjectGenericMapping(): COpaquePointer?

public expect fun ioGetFsZeroingOffset(irp: COpaquePointer?, zeroingoffset: COpaquePointer?): Ntstatus

public expect fun ioGetInitialStack(): COpaquePointer?

public expect fun ioGetInitiatorProcess(fileobject: COpaquePointer?): Peprocess

public expect fun ioGetIoAttributionHandle(irp: COpaquePointer?, ioattributionhandle: COpaquePointer?): Ntstatus

public expect fun ioGetIoPriorityHint(irp: COpaquePointer?): IoPriorityHint

public expect fun ioGetIommuInterface(version: UInt, interfaceout: COpaquePointer?): Ntstatus

public expect fun ioGetIommuInterfaceEx(version: UInt, flags: ULong, interfaceout: COpaquePointer?): Ntstatus

public expect fun ioGetIrpExtraCreateParameter(irp: COpaquePointer?, extracreateparameter: COpaquePointer?): Ntstatus

public expect fun ioGetPagingIoPriority(irp: COpaquePointer?): IoPagingPriority

public expect fun ioGetRelatedDeviceObject(fileobject: COpaquePointer?): COpaquePointer?

public expect fun ioGetSfioStreamIdentifier(fileobject: COpaquePointer?, signature: COpaquePointer?): COpaquePointer?

public expect fun ioGetSilo(fileobject: COpaquePointer?): Pesilo

public expect fun ioGetSiloParameters(fileobject: COpaquePointer?): COpaquePointer?

public expect fun ioGetStackLimits(lowlimit: COpaquePointer?, highlimit: COpaquePointer?)

public expect fun ioGetTopLevelIrp(): COpaquePointer?

public expect fun ioGetTransactionParameterBlock(fileobject: COpaquePointer?): COpaquePointer?

public expect fun ioIncrementKeepAliveCount(fileobject: COpaquePointer?, process: Peprocess): Ntstatus

public expect fun ioInitializeIrp(irp: COpaquePointer?, packetsize: UShort, stacksize: Byte)

public expect fun ioInitializeIrpEx(irp: COpaquePointer?, deviceobject: COpaquePointer?, packetsize: UShort, stacksize: Byte)

public expect fun ioInitializeRemoveLockEx(lock: COpaquePointer?, allocatetag: UInt, maxlockedminutes: UInt, highwatermark: UInt, remlocksize: UInt)

public expect fun ioInitializeTimer(deviceobject: COpaquePointer?, timerroutine: PioTimerRoutine, context: COpaquePointer?): Ntstatus

public expect fun ioInitializeWorkItem(ioobject: COpaquePointer?, ioworkitem: PioWorkitem)

public expect fun ioInvalidateDeviceRelations(deviceobject: COpaquePointer?, type: DeviceRelationType)

public expect fun ioInvalidateDeviceState(physicaldeviceobject: COpaquePointer?)

public expect fun ioIs32bitProcess(irp: COpaquePointer?): Boolean

public expect fun ioIsFileObjectIgnoringSharing(fileobject: COpaquePointer?): Boolean

public expect fun ioIsFileOriginRemote(fileobject: COpaquePointer?): Boolean

public expect fun ioIsInitiator32bitProcess(irp: COpaquePointer?): Boolean

public expect fun ioIsValidIrpStatus(status: Ntstatus): UInt

public expect fun ioIsWdmVersionAvailable(majorversion: UByte, minorversion: UByte): Boolean

public expect fun ioMakeAssociatedIrp(irp: COpaquePointer?, stacksize: Byte): COpaquePointer?

public expect fun ioMakeAssociatedIrpEx(irp: COpaquePointer?, deviceobject: COpaquePointer?, stacksize: Byte): COpaquePointer?

public expect fun ioMapTransfer(adapterobject: COpaquePointer?, mdl: COpaquePointer?, mapregisterbase: COpaquePointer?, currentva: COpaquePointer?, length: COpaquePointer?, writetodevice: Boolean): Long

public expect fun ioOpenDeviceInterfaceRegistryKey(symboliclinkname: COpaquePointer?, desiredaccess: UInt, deviceinterfaceregkey: COpaquePointer?): Ntstatus

public expect fun ioOpenDeviceRegistryKey(deviceobject: COpaquePointer?, devinstkeytype: UInt, desiredaccess: UInt, deviceregkey: COpaquePointer?): Ntstatus

public expect fun ioOpenDriverRegistryKey(driverobject: COpaquePointer?, regkeytype: DriverRegkeyType, desiredaccess: UInt, flags: UInt, driverregkey: COpaquePointer?): Ntstatus

public expect fun ioPropagateActivityIdToThread(irp: COpaquePointer?, propagatedid: COpaquePointer?, originalid: COpaquePointer?): Ntstatus

public expect fun ioQueryDeviceDescription(bustype: COpaquePointer?, busnumber: COpaquePointer?, controllertype: COpaquePointer?, controllernumber: COpaquePointer?, peripheraltype: COpaquePointer?, peripheralnumber: COpaquePointer?, calloutroutine: PioQueryDeviceRoutine, context: COpaquePointer?): Ntstatus

public expect fun ioQueryFullDriverPath(driverobject: COpaquePointer?, fullpath: COpaquePointer?): Ntstatus

public expect fun ioQueryInformationByName(objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, options: UInt, drivercontext: COpaquePointer?): Ntstatus

public expect fun ioQueryKsrPersistentMemorySize(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, buffersize: COpaquePointer?): Ntstatus

public expect fun ioQueryKsrPersistentMemorySizeEx(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, physicaldeviceid: COpaquePointer?, datatag: COpaquePointer?, dataversion: COpaquePointer?, buffersize: COpaquePointer?): Ntstatus

public expect fun ioQueueWorkItem(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutine, queuetype: WorkQueueType, context: COpaquePointer?)

public expect fun ioQueueWorkItemEx(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutineEx, queuetype: WorkQueueType, context: COpaquePointer?)

public expect fun ioRaiseHardError(irp: COpaquePointer?, vpb: COpaquePointer?, realdeviceobject: COpaquePointer?)

public expect fun ioRaiseInformationalHardError(errorstatus: Ntstatus, string: COpaquePointer?, thread: Pkthread): Boolean

public expect fun ioReadDiskSignature(deviceobject: COpaquePointer?, bytespersector: UInt, signature: COpaquePointer?): Ntstatus

public expect fun ioReadPartitionTable(deviceobject: COpaquePointer?, sectorsize: UInt, returnrecognizedpartitions: Boolean, partitionbuffer: COpaquePointer?): Ntstatus

public expect fun ioReadPartitionTableEx(deviceobject: COpaquePointer?, drivelayout: COpaquePointer?): Ntstatus

public expect fun ioRecordIoAttribution(opaquehandle: COpaquePointer?, attributioninformation: COpaquePointer?): Ntstatus

public expect fun ioRegisterBootDriverCallback(callbackfunction: PbootDriverCallbackFunction, callbackcontext: COpaquePointer?): COpaquePointer?

public expect fun ioRegisterBootDriverReinitialization(driverobject: COpaquePointer?, driverreinitializationroutine: DriverReinitialize, context: COpaquePointer?)

public expect fun ioRegisterContainerNotification(notificationclass: IoContainerNotificationClass, callbackfunction: PioContainerNotificationFunction, notificationinformation: COpaquePointer?, notificationinformationlength: UInt, callbackregistration: COpaquePointer?): Ntstatus

public expect fun ioRegisterDeviceInterface(physicaldeviceobject: COpaquePointer?, interfaceclassguid: COpaquePointer?, referencestring: COpaquePointer?, symboliclinkname: COpaquePointer?): Ntstatus

public expect fun ioRegisterDriverReinitialization(driverobject: COpaquePointer?, driverreinitializationroutine: DriverReinitialize, context: COpaquePointer?)

public expect fun ioRegisterLastChanceShutdownNotification(deviceobject: COpaquePointer?): Ntstatus

public expect fun ioRegisterPlugPlayNotification(eventcategory: IoNotificationEventCategory, eventcategoryflags: UInt, eventcategorydata: COpaquePointer?, driverobject: COpaquePointer?, callbackroutine: DriverNotificationCallbackRoutine, context: COpaquePointer?, notificationentry: COpaquePointer?): Ntstatus

public expect fun ioRegisterShutdownNotification(deviceobject: COpaquePointer?): Ntstatus

public expect fun ioReleaseCancelSpinLock(irql: UByte)

public expect fun ioReleaseRemoveLockAndWaitEx(removelock: COpaquePointer?, tag: COpaquePointer?, remlocksize: UInt)

public expect fun ioReleaseRemoveLockEx(removelock: COpaquePointer?, tag: COpaquePointer?, remlocksize: UInt)

public expect fun ioRemoveLinkShareAccess(fileobject: COpaquePointer?, shareaccess: COpaquePointer?, linkshareaccess: COpaquePointer?)

public expect fun ioRemoveLinkShareAccessEx(fileobject: COpaquePointer?, shareaccess: COpaquePointer?, linkshareaccess: COpaquePointer?, ioshareaccessflags: UInt)

public expect fun ioRemoveShareAccess(fileobject: COpaquePointer?, shareaccess: COpaquePointer?)

public expect fun ioReplacePartitionUnit(targetpdo: COpaquePointer?, sparepdo: COpaquePointer?, flags: UInt): Ntstatus

public expect fun ioReportDetectedDevice(driverobject: COpaquePointer?, legacybustype: InterfaceType, busnumber: UInt, slotnumber: UInt, resourcelist: COpaquePointer?, resourcerequirements: COpaquePointer?, resourceassigned: Boolean, deviceobject: COpaquePointer?): Ntstatus

public expect fun ioReportInterruptActive(parameters: COpaquePointer?)

public expect fun ioReportInterruptInactive(parameters: COpaquePointer?)

public expect fun ioReportResourceForDetection(driverobject: COpaquePointer?, driverlist: COpaquePointer?, driverlistsize: UInt, deviceobject: COpaquePointer?, devicelist: COpaquePointer?, devicelistsize: UInt, conflictdetected: COpaquePointer?): Ntstatus

public expect fun ioReportResourceUsage(driverclassname: COpaquePointer?, driverobject: COpaquePointer?, driverlist: COpaquePointer?, driverlistsize: UInt, deviceobject: COpaquePointer?, devicelist: COpaquePointer?, devicelistsize: UInt, overrideconflict: Boolean, conflictdetected: COpaquePointer?): Ntstatus

public expect fun ioReportRootDevice(driverobject: COpaquePointer?): Ntstatus

public expect fun ioReportTargetDeviceChange(physicaldeviceobject: COpaquePointer?, notificationstructure: COpaquePointer?): Ntstatus

public expect fun ioReportTargetDeviceChangeAsynchronous(physicaldeviceobject: COpaquePointer?, notificationstructure: COpaquePointer?, callback: PdeviceChangeCompleteCallback, context: COpaquePointer?): Ntstatus

public expect fun ioRequestDeviceEject(physicaldeviceobject: COpaquePointer?)

public expect fun ioRequestDeviceEjectEx(physicaldeviceobject: COpaquePointer?, callback: PioDeviceEjectCallback, context: COpaquePointer?, driverobject: COpaquePointer?): Ntstatus

public expect fun ioReserveKsrPersistentMemory(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, size: ULong, flags: UInt, datahandle: COpaquePointer?): Ntstatus

public expect fun ioReserveKsrPersistentMemoryEx(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, physicaldeviceid: COpaquePointer?, datatag: COpaquePointer?, dataversion: UInt, size: ULong, flags: UInt, datahandle: COpaquePointer?): Ntstatus

public expect fun ioReuseIrp(irp: COpaquePointer?, iostatus: Ntstatus)

public expect fun ioSetActivityIdIrp(irp: COpaquePointer?, guid: COpaquePointer?): Ntstatus

public expect fun ioSetActivityIdThread(activityid: COpaquePointer?): COpaquePointer?

public expect fun ioSetCompletionRoutineEx(deviceobject: COpaquePointer?, irp: COpaquePointer?, completionroutine: PioCompletionRoutine, context: COpaquePointer?, invokeonsuccess: Boolean, invokeonerror: Boolean, invokeoncancel: Boolean): Ntstatus

public expect fun ioSetDeviceInterfacePropertyData(symboliclinkname: COpaquePointer?, propertykey: COpaquePointer?, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: COpaquePointer?): Ntstatus

public expect fun ioSetDeviceInterfaceState(symboliclinkname: COpaquePointer?, enable: Boolean): Ntstatus

public expect fun ioSetDevicePropertyData(pdo: COpaquePointer?, propertykey: COpaquePointer?, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: COpaquePointer?): Ntstatus

public expect fun ioSetFileObjectIgnoreSharing(fileobject: COpaquePointer?): Ntstatus

public expect fun ioSetFileOrigin(fileobject: COpaquePointer?, remote: Boolean): Ntstatus

public expect fun ioSetFsZeroingOffset(irp: COpaquePointer?, zeroingoffset: UInt): Ntstatus

public expect fun ioSetFsZeroingOffsetRequired(irp: COpaquePointer?): Ntstatus

public expect fun ioSetHardErrorOrVerifyDevice(irp: COpaquePointer?, deviceobject: COpaquePointer?)

public expect fun ioSetIoAttributionIrp(irp: COpaquePointer?, attributionsource: COpaquePointer?, flags: UInt): Ntstatus

public expect fun ioSetIoPriorityHint(irp: COpaquePointer?, priorityhint: IoPriorityHint): Ntstatus

public expect fun ioSetIrpExtraCreateParameter(irp: COpaquePointer?, extracreateparameter: COpaquePointer?): Ntstatus

public expect fun ioSetLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: COpaquePointer?, shareaccess: COpaquePointer?, linkshareaccess: COpaquePointer?, ioshareaccessflags: UInt)

public expect fun ioSetMasterIrpStatus(masterirp: COpaquePointer?, status: Ntstatus)

public expect fun ioSetPartitionInformation(deviceobject: COpaquePointer?, sectorsize: UInt, partitionnumber: UInt, partitiontype: UInt): Ntstatus

public expect fun ioSetPartitionInformationEx(deviceobject: COpaquePointer?, partitionnumber: UInt, partitioninfo: COpaquePointer?): Ntstatus

public expect fun ioSetShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: COpaquePointer?, shareaccess: COpaquePointer?)

public expect fun ioSetShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: COpaquePointer?, shareaccess: COpaquePointer?, writepermission: COpaquePointer?)

public expect fun ioSetStartIoAttributes(deviceobject: COpaquePointer?, deferredstartio: Boolean, noncancelable: Boolean)

public expect fun ioSetSystemPartition(volumenamestring: COpaquePointer?): Ntstatus

public expect fun ioSetThreadHardErrorMode(enableharderrors: Boolean): Boolean

public expect fun ioSetTopLevelIrp(irp: COpaquePointer?)

public expect fun ioSizeOfIrpEx(deviceobject: COpaquePointer?, stacksize: Byte): UShort

public expect fun ioSizeofWorkItem(): UInt

public expect fun ioStartNextPacket(deviceobject: COpaquePointer?, cancelable: Boolean)

public expect fun ioStartNextPacketByKey(deviceobject: COpaquePointer?, cancelable: Boolean, key: UInt)

public expect fun ioStartPacket(deviceobject: COpaquePointer?, irp: COpaquePointer?, key: COpaquePointer?, cancelfunction: DriverCancel)

public expect fun ioStartTimer(deviceobject: COpaquePointer?)

public expect fun ioStopTimer(deviceobject: COpaquePointer?)

public expect fun ioSynchronousCallDriver(deviceobject: COpaquePointer?, irp: COpaquePointer?): Ntstatus

public expect fun ioTransferActivityId(activityid: COpaquePointer?, relatedactivityid: COpaquePointer?)

public expect fun ioTranslateBusAddress(interfacetype: InterfaceType, busnumber: UInt, busaddress: Long, addressspace: COpaquePointer?, translatedaddress: COpaquePointer?): Boolean

public expect fun ioTryQueueWorkItem(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutineEx, queuetype: WorkQueueType, context: COpaquePointer?): Boolean

public expect fun ioUninitializeWorkItem(ioworkitem: PioWorkitem)

public expect fun ioUnregisterBootDriverCallback(callbackhandle: COpaquePointer?)

public expect fun ioUnregisterContainerNotification(callbackregistration: COpaquePointer?)

public expect fun ioUnregisterPlugPlayNotification(notificationentry: COpaquePointer?): Ntstatus

public expect fun ioUnregisterPlugPlayNotificationEx(notificationentry: COpaquePointer?): Ntstatus

public expect fun ioUnregisterShutdownNotification(deviceobject: COpaquePointer?)

public expect fun ioUpdateLinkShareAccess(fileobject: COpaquePointer?, shareaccess: COpaquePointer?, linkshareaccess: COpaquePointer?)

public expect fun ioUpdateLinkShareAccessEx(fileobject: COpaquePointer?, shareaccess: COpaquePointer?, linkshareaccess: COpaquePointer?, ioshareaccessflags: UInt)

public expect fun ioUpdateShareAccess(fileobject: COpaquePointer?, shareaccess: COpaquePointer?)

public expect fun ioValidateDeviceIoControlAccess(irp: COpaquePointer?, requiredaccess: UInt): Ntstatus

public expect fun ioVerifyPartitionTable(deviceobject: COpaquePointer?, fixerrors: Boolean): Ntstatus

public expect fun ioVolumeDeviceNameToGuid(volumedevicename: COpaquePointer?, guid: COpaquePointer?): Ntstatus

public expect fun ioVolumeDeviceNameToGuidPath(volumedevicename: COpaquePointer?, guidpath: COpaquePointer?): Ntstatus

public expect fun ioVolumeDeviceToDosName(volumedeviceobject: COpaquePointer?, dosname: COpaquePointer?): Ntstatus

public expect fun ioVolumeDeviceToGuid(volumedeviceobject: COpaquePointer?, guid: COpaquePointer?): Ntstatus

public expect fun ioVolumeDeviceToGuidPath(volumedeviceobject: COpaquePointer?, guidpath: COpaquePointer?): Ntstatus

public expect fun ioWMIAllocateInstanceIds(guid: COpaquePointer?, instancecount: UInt, firstinstanceid: COpaquePointer?): Ntstatus

public expect fun ioWMIDeviceObjectToInstanceName(datablockobject: COpaquePointer?, deviceobject: COpaquePointer?, instancename: COpaquePointer?): Ntstatus

public expect fun ioWMIExecuteMethod(datablockobject: COpaquePointer?, instancename: COpaquePointer?, methodid: UInt, inbuffersize: UInt, outbuffersize: COpaquePointer?, inoutbuffer: COpaquePointer?): Ntstatus

public expect fun ioWMIHandleToInstanceName(datablockobject: COpaquePointer?, filehandle: Handle, instancename: COpaquePointer?): Ntstatus

public expect fun ioWMIOpenBlock(guid: COpaquePointer?, desiredaccess: UInt, datablockobject: COpaquePointer?): Ntstatus

public expect fun ioWMIQueryAllData(datablockobject: COpaquePointer?, inoutbuffersize: COpaquePointer?, outbuffer: COpaquePointer?): Ntstatus

public expect fun ioWMIQueryAllDataMultiple(datablockobjectlist: COpaquePointer?, objectcount: UInt, inoutbuffersize: COpaquePointer?, outbuffer: COpaquePointer?): Ntstatus

public expect fun ioWMIQuerySingleInstance(datablockobject: COpaquePointer?, instancename: COpaquePointer?, inoutbuffersize: COpaquePointer?, outbuffer: COpaquePointer?): Ntstatus

public expect fun ioWMIQuerySingleInstanceMultiple(datablockobjectlist: COpaquePointer?, instancenames: COpaquePointer?, objectcount: UInt, inoutbuffersize: COpaquePointer?, outbuffer: COpaquePointer?): Ntstatus

public expect fun ioWMIRegistrationControl(deviceobject: COpaquePointer?, action: UInt): Ntstatus

public expect fun ioWMISetNotificationCallback(obj: COpaquePointer?, callback: WmiNotificationCallback, context: COpaquePointer?): Ntstatus

public expect fun ioWMISetSingleInstance(datablockobject: COpaquePointer?, instancename: COpaquePointer?, version: UInt, valuebuffersize: UInt, valuebuffer: COpaquePointer?): Ntstatus

public expect fun ioWMISetSingleItem(datablockobject: COpaquePointer?, instancename: COpaquePointer?, dataitemid: UInt, version: UInt, valuebuffersize: UInt, valuebuffer: COpaquePointer?): Ntstatus

public expect fun ioWMISuggestInstanceName(physicaldeviceobject: COpaquePointer?, symboliclinkname: COpaquePointer?, combinenames: Boolean, suggestedinstancename: COpaquePointer?): Ntstatus

public expect fun ioWMIWriteEvent(wnodeeventitem: COpaquePointer?): Ntstatus

public expect fun ioWithinStackLimits(regionstart: ULong, regionsize: ULong): UInt

public expect fun ioWriteErrorLogEntry(elentry: COpaquePointer?)

public expect fun ioWriteKsrPersistentMemory(datahandle: COpaquePointer?, buffer: COpaquePointer?, size: ULong): Ntstatus

public expect fun ioWritePartitionTable(deviceobject: COpaquePointer?, sectorsize: UInt, sectorspertrack: UInt, numberofheads: UInt, partitionbuffer: COpaquePointer?): Ntstatus

public expect fun ioWritePartitionTableEx(deviceobject: COpaquePointer?, drivelayout: COpaquePointer?): Ntstatus

public expect fun iofCallDriver(deviceobject: COpaquePointer?, irp: COpaquePointer?): Ntstatus

public expect fun iofCompleteRequest(irp: COpaquePointer?, priorityboost: Byte)

public expect fun kdChangeOption(option: KdOption, inbufferbytes: UInt, inbuffer: COpaquePointer?, outbufferbytes: UInt, outbuffer: COpaquePointer?, outbufferneeded: COpaquePointer?): Ntstatus

public expect fun kdDisableDebugger(): Ntstatus

public expect fun kdEnableDebugger(): Ntstatus

public expect fun kdRefreshDebuggerNotPresent(): Boolean

public expect fun keAcquireGuardedMutex(mutex: COpaquePointer?)

public expect fun keAcquireGuardedMutexUnsafe(fastmutex: COpaquePointer?)

public expect fun keAcquireInStackQueuedSpinLock(spinlock: COpaquePointer?, lockhandle: COpaquePointer?)

public expect fun keAcquireInStackQueuedSpinLockAtDpcLevel(spinlock: COpaquePointer?, lockhandle: COpaquePointer?)

public expect fun keAcquireInStackQueuedSpinLockForDpc(spinlock: COpaquePointer?, lockhandle: COpaquePointer?)

public expect fun keAcquireInterruptSpinLock(interrupt: Pkinterrupt): UByte

public expect fun keAcquireSpinLockForDpc(spinlock: COpaquePointer?): UByte

public expect fun keAddTriageDumpDataBlock(ktriagedumpdataarray: COpaquePointer?, address: COpaquePointer?, size: ULong): Ntstatus

public expect fun keAreAllApcsDisabled(): Boolean

public expect fun keAreApcsDisabled(): Boolean

public expect fun keBugCheck(bugcheckcode: BugcheckError)

public expect fun keBugCheckEx(bugcheckcode: BugcheckError, bugcheckparameter1: ULong, bugcheckparameter2: ULong, bugcheckparameter3: ULong, bugcheckparameter4: ULong)

public expect fun keCancelTimer(param0: COpaquePointer?): Boolean

public expect fun keClearEvent(event: COpaquePointer?)

public expect fun keConvertAuxiliaryCounterToPerformanceCounter(auxiliarycountervalue: ULong, performancecountervalue: COpaquePointer?, conversionerror: COpaquePointer?): Ntstatus

public expect fun keConvertPerformanceCounterToAuxiliaryCounter(performancecountervalue: ULong, auxiliarycountervalue: COpaquePointer?, conversionerror: COpaquePointer?): Ntstatus

public expect fun keDelayExecutionThread(waitmode: Byte, alertable: Boolean, interval: COpaquePointer?): Ntstatus

public expect fun keDeregisterBoundCallback(handle: COpaquePointer?): Ntstatus

public expect fun keDeregisterBugCheckCallback(callbackrecord: COpaquePointer?): Boolean

public expect fun keDeregisterBugCheckReasonCallback(callbackrecord: COpaquePointer?): Boolean

public expect fun keDeregisterNmiCallback(handle: COpaquePointer?): Ntstatus

public expect fun keDeregisterProcessorChangeCallback(callbackhandle: COpaquePointer?)

public expect fun keEnterCriticalRegion()

public expect fun keEnterGuardedRegion()

public expect fun keExpandKernelStackAndCallout(callout: PexpandStackCallout, parameter: COpaquePointer?, size: ULong): Ntstatus

public expect fun keExpandKernelStackAndCalloutEx(callout: PexpandStackCallout, parameter: COpaquePointer?, size: ULong, wait: Boolean, context: COpaquePointer?): Ntstatus

public expect fun keFlushIoBuffers(mdl: COpaquePointer?, readoperation: Boolean, dmaoperation: Boolean)

public expect fun keFlushQueuedDpcs()

public expect fun keFlushWriteBuffer()

public expect fun keGetCurrentIrql(): UByte

public expect fun keGetCurrentNodeNumber(): UShort

public expect fun keGetCurrentProcessorNumberEx(procnumber: COpaquePointer?): UInt

public expect fun keGetProcessorIndexFromNumber(procnumber: COpaquePointer?): UInt

public expect fun keGetProcessorNumberFromIndex(procindex: UInt, procnumber: COpaquePointer?): Ntstatus

public expect fun keGetRecommendedSharedDataAlignment(): UInt

public expect fun keInitializeCrashDumpHeader(dumptype: UInt, flags: UInt, buffer: COpaquePointer?, buffersize: UInt, bufferneeded: COpaquePointer?): Ntstatus

public expect fun keInitializeDeviceQueue(devicequeue: COpaquePointer?)

public expect fun keInitializeDpc(dpc: COpaquePointer?, deferredroutine: PkdeferredRoutine, deferredcontext: COpaquePointer?)

public expect fun keInitializeEvent(event: COpaquePointer?, type: EventType, state: Boolean)

public expect fun keInitializeGuardedMutex(mutex: COpaquePointer?)
