package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

public expect fun clfsAddLogContainer(plfolog: ConstPtr, pcbcontainer: ConstPtr, puszcontainerpath: ConstPtr): Ntstatus

public expect fun clfsAddLogContainerSet(plfolog: ConstPtr, ccontainers: UShort, pcbcontainer: ConstPtr, rguszcontainerpath: ConstPtr): Ntstatus

public expect fun clfsAdvanceLogBase(pvmarshalcontext: MutPtr, plsnbase: ConstPtr, fflags: UInt): Ntstatus

public expect fun clfsAlignReservedLog(pvmarshalcontext: ConstPtr, crecords: UInt, rgcbreservation: ConstPtr, pcbalignreservation: MutPtr): Ntstatus

public expect fun clfsAllocReservedLog(pvmarshalcontext: ConstPtr, crecords: UInt, pcbadjustment: ConstPtr): Ntstatus

public expect fun clfsCloseAndResetLogFile(plfolog: ConstPtr): Ntstatus

public expect fun clfsCloseLogFileObject(plfolog: ConstPtr): Ntstatus

public expect fun clfsCreateLogFile(pplfolog: MutPtr, puszlogfilename: ConstPtr, fdesiredaccess: UInt, dwsharemode: UInt, psdlogfile: PsecurityDescriptor, fcreatedisposition: UInt, fcreateoptions: UInt, fflagsandattributes: UInt, flogoptionflag: UInt, pvcontext: ConstPtr, cbcontext: UInt): Ntstatus

public expect fun clfsCreateMarshallingArea(plfolog: ConstPtr, epooltype: PoolType, pfnallocbuffer: PallocateFunction, pfnfreebuffer: PfreeFunction, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshalcontext: MutPtr): Ntstatus

public expect fun clfsCreateMarshallingAreaEx(plfolog: ConstPtr, epooltype: PoolType, pfnallocbuffer: PallocateFunction, pfnfreebuffer: PfreeFunction, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, calignmentsize: UInt, fflags: ULong, ppvmarshalcontext: MutPtr): Ntstatus

public expect fun clfsCreateScanContext(plfolog: ConstPtr, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: MutPtr): Ntstatus

public expect fun clfsDeleteLogByPointer(plfolog: ConstPtr): Ntstatus

public expect fun clfsDeleteLogFile(puszlogfilename: ConstPtr, pvreserved: ConstPtr, flogoptionflag: UInt, pvcontext: ConstPtr, cbcontext: UInt): Ntstatus

public expect fun clfsDeleteMarshallingArea(pvmarshalcontext: ConstPtr): Ntstatus

public expect fun clfsEarlierLsn(plsn: ConstPtr): ClsLsn

public expect fun clfsFinalize()

public expect fun clfsFlushBuffers(pvmarshalcontext: ConstPtr): Ntstatus

public expect fun clfsFlushToLsn(pvmarshalcontext: ConstPtr, plsnflush: ConstPtr, plsnlastflushed: MutPtr): Ntstatus

public expect fun clfsFreeReservedLog(pvmarshalcontext: ConstPtr, crecords: UInt, pcbadjustment: ConstPtr): Ntstatus

public expect fun clfsGetContainerName(plfolog: ConstPtr, cidlogicalcontainer: UInt, puszcontainername: MutPtr, pcactuallencontainername: MutPtr): Ntstatus

public expect fun clfsGetIoStatistics(plfolog: ConstPtr, pvstatsbuffer: MutPtr, cbstatsbuffer: UInt, estatsclass: ClfsIostatsClass, pcbstatswritten: MutPtr): Ntstatus

public expect fun clfsGetLogFileInformation(plfolog: ConstPtr, pinfobuffer: MutPtr, pcbinfobuffer: MutPtr): Ntstatus

public expect fun clfsInitialize(): Ntstatus

public expect fun clfsLaterLsn(plsn: ConstPtr): ClsLsn

public expect fun clfsLsnBlockOffset(plsn: ConstPtr): UInt

public expect fun clfsLsnContainer(plsn: ConstPtr): UInt

public expect fun clfsLsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): ClsLsn

public expect fun clfsLsnDifference(plsnstart: ConstPtr, plsnfinish: ConstPtr, cbcontainer: UInt, cbmaxblock: UInt, pcbdifference: MutPtr): Ntstatus

public expect fun clfsLsnEqual(plsn1: ConstPtr, plsn2: ConstPtr): Boolean

public expect fun clfsLsnGreater(plsn1: ConstPtr, plsn2: ConstPtr): Boolean

public expect fun clfsLsnInvalid(plsn: ConstPtr): Boolean

public expect fun clfsLsnLess(plsn1: ConstPtr, plsn2: ConstPtr): Boolean

public expect fun clfsLsnNull(plsn: ConstPtr): Boolean

public expect fun clfsLsnRecordSequence(plsn: ConstPtr): UInt

public expect fun clfsMgmtDeregisterManagedClient(clientcookie: ConstPtr): Ntstatus

public expect fun clfsMgmtHandleLogFileFull(client: ConstPtr): Ntstatus

public expect fun clfsMgmtInstallPolicy(logfile: ConstPtr, policy: ConstPtr, policylength: UInt): Ntstatus

public expect fun clfsMgmtQueryPolicy(logfile: ConstPtr, policytype: ClfsMgmtPolicyType, policy: MutPtr, policylength: MutPtr): Ntstatus

public expect fun clfsMgmtRegisterManagedClient(logfile: ConstPtr, registrationdata: ConstPtr, clientcookie: MutPtr): Ntstatus

public expect fun clfsMgmtRemovePolicy(logfile: ConstPtr, policytype: ClfsMgmtPolicyType): Ntstatus

public expect fun clfsMgmtSetLogFileSize(logfile: ConstPtr, newsizeincontainers: ConstPtr, resultingsizeincontainers: MutPtr, completionroutine: PclfsSetLogSizeCompleteCallback, completionroutinedata: ConstPtr): Ntstatus

public expect fun clfsMgmtSetLogFileSizeAsClient(logfile: ConstPtr, clientcookie: ConstPtr, newsizeincontainers: ConstPtr, resultingsizeincontainers: MutPtr, completionroutine: PclfsSetLogSizeCompleteCallback, completionroutinedata: ConstPtr): Ntstatus

public expect fun clfsMgmtTailAdvanceFailure(client: ConstPtr, reason: Ntstatus): Ntstatus

public expect fun clfsQueryLogFileInformation(plfolog: ConstPtr, einformationclass: ClsLogInformationClass, pinfoinputbuffer: ConstPtr, cbinfoinputbuffer: UInt, pinfobuffer: MutPtr, pcbinfobuffer: MutPtr): Ntstatus

public expect fun clfsReadLogRecord(pvmarshalcontext: ConstPtr, plsnfirst: MutPtr, pecontextmode: ClfsContextMode, ppvreadbuffer: MutPtr, pcbreadbuffer: MutPtr, perecordtype: MutPtr, plsnundonext: MutPtr, plsnprevious: MutPtr, ppvreadcontext: MutPtr): Ntstatus

public expect fun clfsReadNextLogRecord(pvreadcontext: MutPtr, ppvbuffer: MutPtr, pcbbuffer: MutPtr, perecordtype: MutPtr, plsnuser: ConstPtr, plsnundonext: MutPtr, plsnprevious: MutPtr, plsnrecord: MutPtr): Ntstatus

public expect fun clfsReadPreviousRestartArea(pvreadcontext: ConstPtr, ppvrestartbuffer: MutPtr, pcbrestartbuffer: MutPtr, plsnrestart: MutPtr): Ntstatus

public expect fun clfsReadRestartArea(pvmarshalcontext: MutPtr, ppvrestartbuffer: MutPtr, pcbrestartbuffer: MutPtr, plsn: MutPtr, ppvreadcontext: MutPtr): Ntstatus

public expect fun clfsRemoveLogContainer(plfolog: ConstPtr, puszcontainerpath: ConstPtr, fforce: Boolean): Ntstatus

public expect fun clfsRemoveLogContainerSet(plfolog: ConstPtr, ccontainers: UShort, rgwszcontainerpath: ConstPtr, fforce: Boolean): Ntstatus

public expect fun clfsReserveAndAppendLog(pvmarshalcontext: ConstPtr, rgwriteentries: ConstPtr, cwriteentries: UInt, plsnundonext: ConstPtr, plsnprevious: ConstPtr, creserverecords: UInt, rgcbreservation: MutPtr, fflags: UInt, plsn: MutPtr): Ntstatus

public expect fun clfsReserveAndAppendLogAligned(pvmarshalcontext: ConstPtr, rgwriteentries: ConstPtr, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: ConstPtr, plsnprevious: ConstPtr, creserverecords: UInt, rgcbreservation: MutPtr, fflags: UInt, plsn: MutPtr): Ntstatus

public expect fun clfsScanLogContainers(pcxscan: MutPtr, escanmode: UByte): Ntstatus

public expect fun clfsSetArchiveTail(plfolog: ConstPtr, plsnarchivetail: ConstPtr): Ntstatus

public expect fun clfsSetEndOfLog(plfolog: ConstPtr, plsnend: ConstPtr): Ntstatus

public expect fun clfsSetLogFileInformation(plfolog: ConstPtr, einformationclass: ClsLogInformationClass, pinfobuffer: ConstPtr, cbbuffer: UInt): Ntstatus

public expect fun clfsTerminateReadLog(pvcursorcontext: ConstPtr): Ntstatus

public expect fun clfsWriteRestartArea(pvmarshalcontext: MutPtr, pvrestartbuffer: ConstPtr, cbrestartbuffer: UInt, plsnbase: ConstPtr, fflags: UInt, pcbwritten: MutPtr, plsnnext: MutPtr): Ntstatus

public expect fun cmCallbackGetKeyObjectID(cookie: ConstPtr, obj: ConstPtr, objectid: MutPtr, objectname: MutPtr): Ntstatus

public expect fun cmCallbackGetKeyObjectIDEx(cookie: ConstPtr, obj: ConstPtr, objectid: MutPtr, objectname: MutPtr, flags: UInt): Ntstatus

public expect fun cmCallbackReleaseKeyObjectIDEx(objectname: ConstPtr)

public expect fun cmGetBoundTransaction(cookie: ConstPtr, obj: ConstPtr): MutPtr

public expect fun cmGetCallbackVersion(major: MutPtr, minor: MutPtr)

public expect fun cmRegisterCallback(function: PexCallbackFunction, context: ConstPtr, cookie: MutPtr): Ntstatus

public expect fun cmRegisterCallbackEx(function: PexCallbackFunction, altitude: ConstPtr, driver: ConstPtr, context: ConstPtr, cookie: MutPtr, reserved: ConstPtr): Ntstatus

public expect fun cmSetCallbackObjectContext(obj: MutPtr, cookie: ConstPtr, newcontext: ConstPtr, oldcontext: MutPtr): Ntstatus

public expect fun cmUnRegisterCallback(cookie: Long): Ntstatus

public expect fun dbgBreakPointWithStatus(status: UInt)

public expect fun dbgPrint(format: Pcstr, vararg variadicArgs: Long): UInt

public expect fun dbgPrintEx(componentid: UInt, level: UInt, format: Pcstr, vararg variadicArgs: Long): UInt

public expect fun dbgPrintReturnControlC(format: Pcstr, vararg variadicArgs: Long): UInt

public expect fun dbgPrompt(prompt: Pcstr, response: Pstr, length: UInt): UInt

public expect fun dbgQueryDebugFilterState(componentid: UInt, level: UInt): Ntstatus

public expect fun dbgSetDebugFilterState(componentid: UInt, level: UInt, state: Boolean): Ntstatus

public expect fun dbgSetDebugPrintCallback(debugprintcallback: PdebugPrintCallback, enable: Boolean): Ntstatus

public expect fun etwActivityIdControl(controlcode: UInt, activityid: MutPtr): Ntstatus

public expect fun etwEventEnabled(reghandle: Reghandle, eventdescriptor: ConstPtr): Boolean

public expect fun etwProviderEnabled(reghandle: Reghandle, level: UByte, keyword: ULong): Boolean

public expect fun etwRegister(providerid: ConstPtr, enablecallback: Petwenablecallback, callbackcontext: ConstPtr, reghandle: MutPtr): Ntstatus

public expect fun etwSetInformation(reghandle: Reghandle, informationclass: EventInfoClass, eventinformation: ConstPtr, informationlength: UInt): Ntstatus

public expect fun etwUnregister(reghandle: Reghandle): Ntstatus

public expect fun etwWrite(reghandle: Reghandle, eventdescriptor: ConstPtr, activityid: ConstPtr, userdatacount: UInt, userdata: ConstPtr): Ntstatus

public expect fun etwWriteEx(reghandle: Reghandle, eventdescriptor: ConstPtr, filter: ULong, flags: UInt, activityid: ConstPtr, relatedactivityid: ConstPtr, userdatacount: UInt, userdata: ConstPtr): Ntstatus

public expect fun etwWriteString(reghandle: Reghandle, level: UByte, keyword: ULong, activityid: ConstPtr, string: Pcwstr): Ntstatus

public expect fun etwWriteTransfer(reghandle: Reghandle, eventdescriptor: ConstPtr, activityid: ConstPtr, relatedactivityid: ConstPtr, userdatacount: UInt, userdata: ConstPtr): Ntstatus

public expect fun exAcquireFastMutex(fastmutex: MutPtr)

public expect fun exAcquireFastMutexUnsafe(fastmutex: MutPtr)

public expect fun exAcquirePushLockExclusiveEx(pushlock: MutPtr, flags: UInt)

public expect fun exAcquirePushLockSharedEx(pushlock: MutPtr, flags: UInt)

public expect fun exAcquireResourceExclusiveLite(resource: MutPtr, wait: Boolean): Boolean

public expect fun exAcquireResourceSharedLite(resource: MutPtr, wait: Boolean): Boolean

public expect fun exAcquireRundownProtection(runref: MutPtr): Boolean

public expect fun exAcquireRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware): Boolean

public expect fun exAcquireRundownProtectionCacheAwareEx(runrefcacheaware: PexRundownRefCacheAware, count: UInt): Boolean

public expect fun exAcquireRundownProtectionEx(runref: MutPtr, count: UInt): Boolean

public expect fun exAcquireSharedStarveExclusive(resource: MutPtr, wait: Boolean): Boolean

public expect fun exAcquireSharedWaitForExclusive(resource: MutPtr, wait: Boolean): Boolean

public expect fun exAcquireSpinLockExclusive(spinlock: MutPtr): UByte

public expect fun exAcquireSpinLockExclusiveAtDpcLevel(spinlock: MutPtr)

public expect fun exAcquireSpinLockShared(spinlock: MutPtr): UByte

public expect fun exAcquireSpinLockSharedAtDpcLevel(spinlock: MutPtr)

public expect fun exAllocateCacheAwareRundownProtection(pooltype: PoolType, pooltag: UInt): PexRundownRefCacheAware

public expect fun exAllocatePool(pooltype: PoolType, numberofbytes: ULong): MutPtr

public expect fun exAllocatePool2(flags: ULong, numberofbytes: ULong, tag: UInt): MutPtr

public expect fun exAllocatePool3(flags: ULong, numberofbytes: ULong, tag: UInt, extendedparameters: ConstPtr, extendedparameterscount: UInt): MutPtr

public expect fun exAllocatePoolWithQuota(pooltype: PoolType, numberofbytes: ULong): MutPtr

public expect fun exAllocatePoolWithQuotaTag(pooltype: PoolType, numberofbytes: ULong, tag: UInt): MutPtr

public expect fun exAllocatePoolWithTag(pooltype: PoolType, numberofbytes: ULong, tag: UInt): MutPtr

public expect fun exAllocatePoolWithTagPriority(pooltype: PoolType, numberofbytes: ULong, tag: UInt, priority: ExPoolPriority): MutPtr

public expect fun exAllocateTimer(callback: PextCallback, callbackcontext: ConstPtr, attributes: UInt): PexTimer

public expect fun exCancelTimer(timer: PexTimer, parameters: ConstPtr): Boolean

public expect fun exCleanupRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware)

public expect fun exConvertExclusiveToSharedLite(resource: MutPtr)

public expect fun exCreateCallback(callbackobject: MutPtr, objectattributes: ConstPtr, create: Boolean, allowmultiplecallbacks: Boolean): Ntstatus

public expect fun exCreatePool(flags: UInt, tag: ULong, params: ConstPtr, poolhandle: MutPtr): Ntstatus

public expect fun exDeleteResourceLite(resource: MutPtr): Ntstatus

public expect fun exDeleteTimer(timer: PexTimer, cancel: Boolean, wait: Boolean, parameters: ConstPtr): Boolean

public expect fun exDestroyPool(poolhandle: Handle)

public expect fun exEnterCriticalRegionAndAcquireResourceExclusive(resource: MutPtr): MutPtr

public expect fun exEnterCriticalRegionAndAcquireResourceShared(resource: MutPtr): MutPtr

public expect fun exEnterCriticalRegionAndAcquireSharedWaitForExclusive(resource: MutPtr): MutPtr

public expect fun exEnumerateSystemFirmwareTables(firmwaretableprovidersignature: UInt, firmwaretablebuffer: MutPtr, bufferlength: UInt, returnlength: MutPtr): Ntstatus

public expect fun exExtendZone(zone: MutPtr, segment: MutPtr, segmentsize: UInt): Ntstatus

public expect fun exFreeCacheAwareRundownProtection(runrefcacheaware: PexRundownRefCacheAware)

public expect fun exFreePool(p: MutPtr)

public expect fun exFreePool2(p: MutPtr, tag: UInt, extendedparameters: ConstPtr, extendedparameterscount: UInt)

public expect fun exFreePoolWithTag(p: MutPtr, tag: UInt)

public expect fun exGetExclusiveWaiterCount(resource: ConstPtr): UInt

public expect fun exGetFirmwareEnvironmentVariable(variablename: ConstPtr, vendorguid: ConstPtr, value: MutPtr, valuelength: MutPtr, attributes: MutPtr): Ntstatus

public expect fun exGetFirmwareType(): FirmwareType

public expect fun exGetPreviousMode(): Byte

public expect fun exGetSharedWaiterCount(resource: ConstPtr): UInt

public expect fun exGetSystemFirmwareTable(firmwaretableprovidersignature: UInt, firmwaretableid: UInt, firmwaretablebuffer: MutPtr, bufferlength: UInt, returnlength: MutPtr): Ntstatus

public expect fun exInitializePushLock(pushlock: MutPtr)

public expect fun exInitializeResourceLite(resource: MutPtr): Ntstatus

public expect fun exInitializeRundownProtection(runref: MutPtr)

public expect fun exInitializeRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware, runrefsize: ULong)

public expect fun exInitializeRundownProtectionCacheAwareEx(runrefcacheaware: PexRundownRefCacheAware, flags: UInt)

public expect fun exInitializeZone(zone: MutPtr, blocksize: UInt, initialsegment: MutPtr, initialsegmentsize: UInt): Ntstatus

public expect fun exInterlockedAddLargeInteger(addend: MutPtr, increment: Long, lock: MutPtr): Long

public expect fun exInterlockedExtendZone(zone: MutPtr, segment: MutPtr, segmentsize: UInt, lock: MutPtr): Ntstatus

public expect fun exIsManufacturingModeEnabled(): Boolean

public expect fun exIsProcessorFeaturePresent(processorfeature: UInt): Boolean

public expect fun exIsResourceAcquiredExclusiveLite(resource: ConstPtr): Boolean

public expect fun exIsResourceAcquiredSharedLite(resource: ConstPtr): UInt

public expect fun exIsSoftBoot(): Boolean

public expect fun exLocalTimeToSystemTime(localtime: ConstPtr, systemtime: MutPtr)

public expect fun exNotifyCallback(callbackobject: ConstPtr, argument1: ConstPtr, argument2: ConstPtr)

public expect fun exQueryTimerResolution(maximumtime: MutPtr, minimumtime: MutPtr, currenttime: MutPtr)

public expect fun exQueueWorkItem(workitem: MutPtr, queuetype: WorkQueueType)

public expect fun exRaiseAccessViolation()

public expect fun exRaiseDatatypeMisalignment()

public expect fun exRaiseStatus(status: Ntstatus)

public expect fun exReInitializeRundownProtection(runref: MutPtr)

public expect fun exReInitializeRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware)

public expect fun exRegisterCallback(callbackobject: PcallbackObject, callbackfunction: PcallbackFunction, callbackcontext: ConstPtr): MutPtr

public expect fun exReinitializeResourceLite(resource: MutPtr): Ntstatus

public expect fun exReleaseFastMutex(fastmutex: MutPtr)

public expect fun exReleaseFastMutexUnsafe(fastmutex: MutPtr)

public expect fun exReleasePushLockExclusiveEx(pushlock: MutPtr, flags: UInt)

public expect fun exReleasePushLockSharedEx(pushlock: MutPtr, flags: UInt)

public expect fun exReleaseResourceAndLeaveCriticalRegion(resource: MutPtr)

public expect fun exReleaseResourceForThreadLite(resource: MutPtr, resourcethreadid: ULong)

public expect fun exReleaseResourceLite(resource: MutPtr)

public expect fun exReleaseRundownProtection(runref: MutPtr)

public expect fun exReleaseRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware)

public expect fun exReleaseRundownProtectionCacheAwareEx(runref: PexRundownRefCacheAware, count: UInt)

public expect fun exReleaseRundownProtectionEx(runref: MutPtr, count: UInt)

public expect fun exReleaseSpinLockExclusive(spinlock: MutPtr, oldirql: UByte)

public expect fun exReleaseSpinLockExclusiveFromDpcLevel(spinlock: MutPtr)

public expect fun exReleaseSpinLockShared(spinlock: MutPtr, oldirql: UByte)

public expect fun exReleaseSpinLockSharedFromDpcLevel(spinlock: MutPtr)

public expect fun exRundownCompleted(runref: MutPtr)

public expect fun exRundownCompletedCacheAware(runrefcacheaware: PexRundownRefCacheAware)

public expect fun exSecurePoolUpdate(securepoolhandle: Handle, tag: UInt, allocation: ConstPtr, cookie: ULong, offset: ULong, size: ULong, buffer: ConstPtr): Ntstatus

public expect fun exSecurePoolValidate(securepoolhandle: Handle, tag: UInt, allocation: ConstPtr, cookie: ULong): UInt

public expect fun exSetFirmwareEnvironmentVariable(variablename: ConstPtr, vendorguid: ConstPtr, value: ConstPtr, valuelength: UInt, attributes: UInt): Ntstatus

public expect fun exSetResourceOwnerPointer(resource: MutPtr, ownerpointer: ConstPtr)

public expect fun exSetResourceOwnerPointerEx(resource: MutPtr, ownerpointer: ConstPtr, flags: UInt)

public expect fun exSetTimer(timer: PexTimer, duetime: Long, period: Long, parameters: ConstPtr): Boolean

public expect fun exSetTimerResolution(desiredtime: UInt, setresolution: Boolean): UInt

public expect fun exSizeOfRundownProtectionCacheAware(): ULong

public expect fun exSystemTimeToLocalTime(systemtime: ConstPtr, localtime: MutPtr)

public expect fun exTryAcquireSpinLockExclusiveAtDpcLevel(spinlock: MutPtr): UInt

public expect fun exTryAcquireSpinLockSharedAtDpcLevel(spinlock: MutPtr): UInt

public expect fun exTryConvertSharedSpinLockExclusive(spinlock: MutPtr): UInt

public expect fun exTryToAcquireFastMutex(fastmutex: MutPtr): Boolean

public expect fun exUnregisterCallback(callbackregistration: MutPtr)

public expect fun exUuidCreate(uuid: MutPtr): Ntstatus

public expect fun exVerifySuite(suitetype: SuiteType): Boolean

public expect fun exWaitForRundownProtectionRelease(runref: MutPtr)

public expect fun exWaitForRundownProtectionReleaseCacheAware(runref: PexRundownRefCacheAware)

public expect fun fsRtlIsTotalDeviceFailure(status: Ntstatus): Boolean

public expect fun halAcquireDisplayOwnership(resetdisplayparameters: PhalResetDisplayParameters)

public expect fun halAllocateAdapterChannel(adapterobject: ConstPtr, wcb: ConstPtr, numberofmapregisters: UInt, executionroutine: DriverControl): Ntstatus

public expect fun halAllocateCommonBuffer(adapterobject: ConstPtr, length: UInt, logicaladdress: MutPtr, cacheenabled: Boolean): MutPtr

public expect fun halAllocateCrashDumpRegisters(adapterobject: ConstPtr, numberofmapregisters: MutPtr): MutPtr

public expect fun halAllocateHardwareCounters(groupaffinty: ConstPtr, groupcount: UInt, resourcelist: ConstPtr, countersethandle: MutPtr): Ntstatus

public expect fun halAssignSlotResources(registrypath: ConstPtr, driverclassname: ConstPtr, driverobject: ConstPtr, deviceobject: ConstPtr, bustype: InterfaceType, busnumber: UInt, slotnumber: UInt, allocatedresources: MutPtr): Ntstatus

public expect fun halBugCheckSystem(errorsource: ConstPtr, errorrecord: ConstPtr)

public expect fun halDmaAllocateCrashDumpRegistersEx(adapter: ConstPtr, numberofmapregisters: UInt, type: HalDmaCrashDumpRegisterType, mapregisterbase: MutPtr, mapregistersavailable: MutPtr): Ntstatus

public expect fun halDmaFreeCrashDumpRegistersEx(adapter: ConstPtr, type: HalDmaCrashDumpRegisterType): Ntstatus

public expect fun halExamineMBR(deviceobject: ConstPtr, sectorsize: UInt, mbrtypeidentifier: UInt, buffer: MutPtr)

public expect fun halFreeCommonBuffer(adapterobject: ConstPtr, length: UInt, logicaladdress: Long, virtualaddress: ConstPtr, cacheenabled: Boolean)

public expect fun halFreeHardwareCounters(countersethandle: Handle): Ntstatus

public expect fun halGetAdapter(devicedescription: ConstPtr, numberofmapregisters: MutPtr): MutPtr

public expect fun halGetBusData(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: MutPtr, length: UInt): UInt

public expect fun halGetBusDataByOffset(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: MutPtr, offset: UInt, length: UInt): UInt

public expect fun halGetInterruptVector(interfacetype: InterfaceType, busnumber: UInt, businterruptlevel: UInt, businterruptvector: UInt, irql: MutPtr, affinity: MutPtr): UInt

public expect fun halMakeBeep(frequency: UInt): Boolean

public expect fun halReadDmaCounter(adapterobject: ConstPtr): UInt

public expect fun halSetBusData(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: ConstPtr, length: UInt): UInt

public expect fun halSetBusDataByOffset(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: ConstPtr, offset: UInt, length: UInt): UInt

public expect fun halTranslateBusAddress(interfacetype: InterfaceType, busnumber: UInt, busaddress: Long, addressspace: MutPtr, translatedaddress: MutPtr): Boolean

public expect fun hvlRegisterWheaErrorNotification(callback: PhvlWheaErrorNotification): Ntstatus

public expect fun hvlUnregisterWheaErrorNotification(callback: PhvlWheaErrorNotification): Ntstatus

public expect fun ioAcquireCancelSpinLock(irql: MutPtr)

public expect fun ioAcquireKsrPersistentMemory(driverobject: ConstPtr, physicaldeviceobject: ConstPtr, buffer: MutPtr, size: MutPtr): Ntstatus

public expect fun ioAcquireKsrPersistentMemoryEx(driverobject: ConstPtr, physicaldeviceobject: ConstPtr, physicaldeviceid: ConstPtr, datatag: ConstPtr, dataversion: MutPtr, buffer: MutPtr, size: MutPtr): Ntstatus

public expect fun ioAcquireRemoveLockEx(removelock: MutPtr, tag: ConstPtr, file: Pcstr, line: UInt, remlocksize: UInt): Ntstatus

public expect fun ioAllocateAdapterChannel(adapterobject: ConstPtr, deviceobject: ConstPtr, numberofmapregisters: UInt, executionroutine: DriverControl, context: ConstPtr): Ntstatus

public expect fun ioAllocateController(controllerobject: ConstPtr, deviceobject: ConstPtr, executionroutine: DriverControl, context: ConstPtr)

public expect fun ioAllocateDriverObjectExtension(driverobject: ConstPtr, clientidentificationaddress: ConstPtr, driverobjectextensionsize: UInt, driverobjectextension: MutPtr): Ntstatus

public expect fun ioAllocateErrorLogEntry(ioobject: ConstPtr, entrysize: UByte): MutPtr

public expect fun ioAllocateIrp(stacksize: Byte, chargequota: Boolean): MutPtr

public expect fun ioAllocateIrpEx(deviceobject: ConstPtr, stacksize: Byte, chargequota: Boolean): MutPtr

public expect fun ioAllocateMdl(virtualaddress: ConstPtr, length: UInt, secondarybuffer: Boolean, chargequota: Boolean, irp: MutPtr): MutPtr

public expect fun ioAllocateSfioStreamIdentifier(fileobject: ConstPtr, length: UInt, signature: ConstPtr, streamidentifier: MutPtr): Ntstatus

public expect fun ioAllocateWorkItem(deviceobject: ConstPtr): PioWorkitem

public expect fun ioAssignResources(registrypath: ConstPtr, driverclassname: ConstPtr, driverobject: ConstPtr, deviceobject: ConstPtr, requestedresources: ConstPtr, allocatedresources: MutPtr): Ntstatus

public expect fun ioAttachDevice(sourcedevice: ConstPtr, targetdevice: ConstPtr, attacheddevice: MutPtr): Ntstatus

public expect fun ioAttachDeviceByPointer(sourcedevice: ConstPtr, targetdevice: ConstPtr): Ntstatus

public expect fun ioAttachDeviceToDeviceStack(sourcedevice: ConstPtr, targetdevice: ConstPtr): MutPtr

public expect fun ioAttachDeviceToDeviceStackSafe(sourcedevice: ConstPtr, targetdevice: ConstPtr, attachedtodeviceobject: MutPtr): Ntstatus

public expect fun ioBuildAsynchronousFsdRequest(majorfunction: UInt, deviceobject: ConstPtr, buffer: MutPtr, length: UInt, startingoffset: ConstPtr, iostatusblock: ConstPtr): MutPtr

public expect fun ioBuildDeviceIoControlRequest(iocontrolcode: UInt, deviceobject: ConstPtr, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt, internaldeviceiocontrol: Boolean, event: ConstPtr, iostatusblock: MutPtr): MutPtr

public expect fun ioBuildPartialMdl(sourcemdl: ConstPtr, targetmdl: MutPtr, virtualaddress: MutPtr, length: UInt)

public expect fun ioBuildSynchronousFsdRequest(majorfunction: UInt, deviceobject: ConstPtr, buffer: MutPtr, length: UInt, startingoffset: ConstPtr, event: ConstPtr, iostatusblock: MutPtr): MutPtr

public expect fun ioCancelFileOpen(deviceobject: ConstPtr, fileobject: ConstPtr)

public expect fun ioCancelIrp(irp: ConstPtr): Boolean

public expect fun ioCheckLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr, shareaccess: MutPtr, linkshareaccess: MutPtr, ioshareaccessflags: UInt): Ntstatus

public expect fun ioCheckShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr, shareaccess: MutPtr, update: Boolean): Ntstatus

public expect fun ioCheckShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr, shareaccess: MutPtr, update: Boolean, writepermission: ConstPtr): Ntstatus

public expect fun ioCleanupIrp(irp: MutPtr)

public expect fun ioClearActivityIdThread(originalid: ConstPtr)

public expect fun ioClearIrpExtraCreateParameter(irp: MutPtr)

public expect fun ioConnectInterrupt(interruptobject: MutPtr, serviceroutine: PkserviceRoutine, servicecontext: ConstPtr, spinlock: ConstPtr, vector: UInt, irql: UByte, synchronizeirql: UByte, interruptmode: KinterruptMode, sharevector: Boolean, processorenablemask: ULong, floatingsave: Boolean): Ntstatus

public expect fun ioConnectInterruptEx(parameters: MutPtr): Ntstatus

public expect fun ioCreateController(size: UInt): MutPtr

public expect fun ioCreateDevice(driverobject: ConstPtr, deviceextensionsize: UInt, devicename: ConstPtr, devicetype: UInt, devicecharacteristics: UInt, exclusive: Boolean, deviceobject: MutPtr): Ntstatus

public expect fun ioCreateDisk(deviceobject: ConstPtr, disk: ConstPtr): Ntstatus

public expect fun ioCreateFile(filehandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, allocationsize: ConstPtr, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: ConstPtr, ealength: UInt, createfiletype: CreateFileType, internalparameters: ConstPtr, options: UInt): Ntstatus

public expect fun ioCreateFileEx(filehandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, allocationsize: ConstPtr, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: ConstPtr, ealength: UInt, createfiletype: CreateFileType, internalparameters: ConstPtr, options: UInt, drivercontext: ConstPtr): Ntstatus

public expect fun ioCreateFileSpecifyDeviceObjectHint(filehandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, allocationsize: ConstPtr, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: ConstPtr, ealength: UInt, createfiletype: CreateFileType, internalparameters: ConstPtr, options: UInt, deviceobject: ConstPtr): Ntstatus

public expect fun ioCreateNotificationEvent(eventname: ConstPtr, eventhandle: MutPtr): MutPtr

public expect fun ioCreateSymbolicLink(symboliclinkname: ConstPtr, devicename: ConstPtr): Ntstatus

public expect fun ioCreateSynchronizationEvent(eventname: ConstPtr, eventhandle: MutPtr): MutPtr

public expect fun ioCreateSystemThread(ioobject: MutPtr, threadhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, processhandle: Handle, clientid: MutPtr, startroutine: PkstartRoutine, startcontext: ConstPtr): Ntstatus

public expect fun ioCreateUnprotectedSymbolicLink(symboliclinkname: ConstPtr, devicename: ConstPtr): Ntstatus

public expect fun ioCsqInitialize(csq: MutPtr, csqinsertirp: PioCsqInsertIrp, csqremoveirp: PioCsqRemoveIrp, csqpeeknextirp: PioCsqPeekNextIrp, csqacquirelock: PioCsqAcquireLock, csqreleaselock: PioCsqReleaseLock, csqcompletecanceledirp: PioCsqCompleteCanceledIrp): Ntstatus

public expect fun ioCsqInitializeEx(csq: MutPtr, csqinsertirp: PioCsqInsertIrpEx, csqremoveirp: PioCsqRemoveIrp, csqpeeknextirp: PioCsqPeekNextIrp, csqacquirelock: PioCsqAcquireLock, csqreleaselock: PioCsqReleaseLock, csqcompletecanceledirp: PioCsqCompleteCanceledIrp): Ntstatus

public expect fun ioCsqInsertIrp(csq: MutPtr, irp: MutPtr, context: MutPtr)

public expect fun ioCsqInsertIrpEx(csq: MutPtr, irp: MutPtr, context: MutPtr, insertcontext: ConstPtr): Ntstatus

public expect fun ioCsqRemoveIrp(csq: MutPtr, context: MutPtr): MutPtr

public expect fun ioCsqRemoveNextIrp(csq: MutPtr, peekcontext: ConstPtr): MutPtr

public expect fun ioDecrementKeepAliveCount(fileobject: MutPtr, process: Peprocess): Ntstatus

public expect fun ioDeleteController(controllerobject: ConstPtr)

public expect fun ioDeleteDevice(deviceobject: ConstPtr)

public expect fun ioDeleteSymbolicLink(symboliclinkname: ConstPtr): Ntstatus

public expect fun ioDetachDevice(targetdevice: MutPtr)

public expect fun ioDisconnectInterrupt(interruptobject: Pkinterrupt)

public expect fun ioDisconnectInterruptEx(parameters: ConstPtr)

public expect fun ioEnumerateKsrPersistentMemoryEx(driverobject: ConstPtr, physicaldeviceobject: ConstPtr, physicaldeviceid: ConstPtr, callback: PioPersistedMemoryEnumerationCallback, callbackcontext: ConstPtr): Ntstatus

public expect fun ioFlushAdapterBuffers(adapterobject: ConstPtr, mdl: ConstPtr, mapregisterbase: ConstPtr, currentva: ConstPtr, length: UInt, writetodevice: Boolean): Boolean

public expect fun ioForwardIrpSynchronously(deviceobject: ConstPtr, irp: ConstPtr): Boolean

public expect fun ioFreeAdapterChannel(adapterobject: ConstPtr)

public expect fun ioFreeController(controllerobject: ConstPtr)

public expect fun ioFreeErrorLogEntry(elentry: ConstPtr)

public expect fun ioFreeIrp(irp: ConstPtr)

public expect fun ioFreeKsrPersistentMemory(datahandle: ConstPtr): Ntstatus

public expect fun ioFreeMapRegisters(adapterobject: ConstPtr, mapregisterbase: ConstPtr, numberofmapregisters: UInt)

public expect fun ioFreeMdl(mdl: MutPtr)

public expect fun ioFreeSfioStreamIdentifier(fileobject: ConstPtr, signature: ConstPtr): Ntstatus

public expect fun ioFreeWorkItem(ioworkitem: PioWorkitem)

public expect fun ioGetActivityIdIrp(irp: ConstPtr, guid: MutPtr): Ntstatus

public expect fun ioGetActivityIdThread(): MutPtr

public expect fun ioGetAffinityInterrupt(interruptobject: Pkinterrupt, groupaffinity: MutPtr): Ntstatus

public expect fun ioGetAttachedDeviceReference(deviceobject: ConstPtr): MutPtr

public expect fun ioGetBootDiskInformation(bootdiskinformation: MutPtr, size: UInt): Ntstatus

public expect fun ioGetBootDiskInformationLite(bootdiskinformation: MutPtr): Ntstatus

public expect fun ioGetConfigurationInformation(): MutPtr

public expect fun ioGetContainerInformation(informationclass: IoContainerInformationClass, containerobject: ConstPtr, buffer: MutPtr, bufferlength: UInt): Ntstatus

public expect fun ioGetCurrentProcess(): Peprocess

public expect fun ioGetDeviceDirectory(physicaldeviceobject: ConstPtr, directorytype: DeviceDirectoryType, flags: UInt, reserved: ConstPtr, devicedirectoryhandle: MutPtr): Ntstatus

public expect fun ioGetDeviceInterfaceAlias(symboliclinkname: ConstPtr, aliasinterfaceclassguid: ConstPtr, aliassymboliclinkname: MutPtr): Ntstatus

public expect fun ioGetDeviceInterfacePropertyData(symboliclinkname: ConstPtr, propertykey: ConstPtr, lcid: UInt, flags: UInt, size: UInt, data: MutPtr, requiredsize: MutPtr, type: MutPtr): Ntstatus

public expect fun ioGetDeviceInterfaces(interfaceclassguid: ConstPtr, physicaldeviceobject: ConstPtr, flags: UInt, symboliclinklist: MutPtr): Ntstatus

public expect fun ioGetDeviceNumaNode(pdo: ConstPtr, nodenumber: MutPtr): Ntstatus

public expect fun ioGetDeviceObjectPointer(objectname: ConstPtr, desiredaccess: UInt, fileobject: MutPtr, deviceobject: MutPtr): Ntstatus

public expect fun ioGetDeviceProperty(deviceobject: ConstPtr, deviceproperty: DeviceRegistryProperty, bufferlength: UInt, propertybuffer: MutPtr, resultlength: MutPtr): Ntstatus

public expect fun ioGetDevicePropertyData(pdo: ConstPtr, propertykey: ConstPtr, lcid: UInt, flags: UInt, size: UInt, data: MutPtr, requiredsize: MutPtr, type: MutPtr): Ntstatus

public expect fun ioGetDmaAdapter(physicaldeviceobject: ConstPtr, devicedescription: ConstPtr, numberofmapregisters: MutPtr): MutPtr

public expect fun ioGetDriverDirectory(driverobject: ConstPtr, directorytype: DriverDirectoryType, flags: UInt, driverdirectoryhandle: MutPtr): Ntstatus

public expect fun ioGetDriverObjectExtension(driverobject: ConstPtr, clientidentificationaddress: ConstPtr): MutPtr

public expect fun ioGetFileObjectGenericMapping(): MutPtr

public expect fun ioGetFsZeroingOffset(irp: ConstPtr, zeroingoffset: MutPtr): Ntstatus

public expect fun ioGetInitialStack(): MutPtr

public expect fun ioGetInitiatorProcess(fileobject: ConstPtr): Peprocess

public expect fun ioGetIoAttributionHandle(irp: ConstPtr, ioattributionhandle: MutPtr): Ntstatus

public expect fun ioGetIoPriorityHint(irp: ConstPtr): IoPriorityHint

public expect fun ioGetIommuInterface(version: UInt, interfaceout: MutPtr): Ntstatus

public expect fun ioGetIommuInterfaceEx(version: UInt, flags: ULong, interfaceout: MutPtr): Ntstatus

public expect fun ioGetIrpExtraCreateParameter(irp: ConstPtr, extracreateparameter: MutPtr): Ntstatus

public expect fun ioGetPagingIoPriority(irp: ConstPtr): IoPagingPriority

public expect fun ioGetRelatedDeviceObject(fileobject: ConstPtr): MutPtr

public expect fun ioGetSfioStreamIdentifier(fileobject: ConstPtr, signature: ConstPtr): MutPtr

public expect fun ioGetSilo(fileobject: ConstPtr): Pesilo

public expect fun ioGetSiloParameters(fileobject: ConstPtr): MutPtr

public expect fun ioGetStackLimits(lowlimit: MutPtr, highlimit: MutPtr)

public expect fun ioGetTopLevelIrp(): MutPtr

public expect fun ioGetTransactionParameterBlock(fileobject: ConstPtr): MutPtr

public expect fun ioIncrementKeepAliveCount(fileobject: MutPtr, process: Peprocess): Ntstatus

public expect fun ioInitializeIrp(irp: MutPtr, packetsize: UShort, stacksize: Byte)

public expect fun ioInitializeIrpEx(irp: MutPtr, deviceobject: ConstPtr, packetsize: UShort, stacksize: Byte)

public expect fun ioInitializeRemoveLockEx(lock: MutPtr, allocatetag: UInt, maxlockedminutes: UInt, highwatermark: UInt, remlocksize: UInt)

public expect fun ioInitializeTimer(deviceobject: ConstPtr, timerroutine: PioTimerRoutine, context: ConstPtr): Ntstatus

public expect fun ioInitializeWorkItem(ioobject: ConstPtr, ioworkitem: PioWorkitem)

public expect fun ioInvalidateDeviceRelations(deviceobject: ConstPtr, type: DeviceRelationType)

public expect fun ioInvalidateDeviceState(physicaldeviceobject: ConstPtr)

public expect fun ioIs32bitProcess(irp: ConstPtr): Boolean

public expect fun ioIsFileObjectIgnoringSharing(fileobject: ConstPtr): Boolean

public expect fun ioIsFileOriginRemote(fileobject: ConstPtr): Boolean

public expect fun ioIsInitiator32bitProcess(irp: ConstPtr): Boolean

public expect fun ioIsValidIrpStatus(status: Ntstatus): UInt

public expect fun ioIsWdmVersionAvailable(majorversion: UByte, minorversion: UByte): Boolean

public expect fun ioMakeAssociatedIrp(irp: ConstPtr, stacksize: Byte): MutPtr

public expect fun ioMakeAssociatedIrpEx(irp: ConstPtr, deviceobject: ConstPtr, stacksize: Byte): MutPtr

public expect fun ioMapTransfer(adapterobject: ConstPtr, mdl: ConstPtr, mapregisterbase: ConstPtr, currentva: ConstPtr, length: MutPtr, writetodevice: Boolean): Long

public expect fun ioOpenDeviceInterfaceRegistryKey(symboliclinkname: ConstPtr, desiredaccess: UInt, deviceinterfaceregkey: MutPtr): Ntstatus

public expect fun ioOpenDeviceRegistryKey(deviceobject: ConstPtr, devinstkeytype: UInt, desiredaccess: UInt, deviceregkey: MutPtr): Ntstatus

public expect fun ioOpenDriverRegistryKey(driverobject: ConstPtr, regkeytype: DriverRegkeyType, desiredaccess: UInt, flags: UInt, driverregkey: MutPtr): Ntstatus

public expect fun ioPropagateActivityIdToThread(irp: ConstPtr, propagatedid: MutPtr, originalid: MutPtr): Ntstatus

public expect fun ioQueryDeviceDescription(bustype: ConstPtr, busnumber: ConstPtr, controllertype: ConstPtr, controllernumber: ConstPtr, peripheraltype: ConstPtr, peripheralnumber: ConstPtr, calloutroutine: PioQueryDeviceRoutine, context: MutPtr): Ntstatus

public expect fun ioQueryFullDriverPath(driverobject: ConstPtr, fullpath: MutPtr): Ntstatus

public expect fun ioQueryInformationByName(objectattributes: ConstPtr, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, options: UInt, drivercontext: ConstPtr): Ntstatus

public expect fun ioQueryKsrPersistentMemorySize(driverobject: ConstPtr, physicaldeviceobject: ConstPtr, buffersize: MutPtr): Ntstatus

public expect fun ioQueryKsrPersistentMemorySizeEx(driverobject: ConstPtr, physicaldeviceobject: ConstPtr, physicaldeviceid: ConstPtr, datatag: ConstPtr, dataversion: MutPtr, buffersize: MutPtr): Ntstatus

public expect fun ioQueueWorkItem(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutine, queuetype: WorkQueueType, context: ConstPtr)

public expect fun ioQueueWorkItemEx(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutineEx, queuetype: WorkQueueType, context: ConstPtr)

public expect fun ioRaiseHardError(irp: ConstPtr, vpb: ConstPtr, realdeviceobject: ConstPtr)

public expect fun ioRaiseInformationalHardError(errorstatus: Ntstatus, string: ConstPtr, thread: Pkthread): Boolean

public expect fun ioReadDiskSignature(deviceobject: ConstPtr, bytespersector: UInt, signature: MutPtr): Ntstatus

public expect fun ioReadPartitionTable(deviceobject: ConstPtr, sectorsize: UInt, returnrecognizedpartitions: Boolean, partitionbuffer: MutPtr): Ntstatus

public expect fun ioReadPartitionTableEx(deviceobject: ConstPtr, drivelayout: MutPtr): Ntstatus

public expect fun ioRecordIoAttribution(opaquehandle: MutPtr, attributioninformation: ConstPtr): Ntstatus

public expect fun ioRegisterBootDriverCallback(callbackfunction: PbootDriverCallbackFunction, callbackcontext: ConstPtr): MutPtr

public expect fun ioRegisterBootDriverReinitialization(driverobject: ConstPtr, driverreinitializationroutine: DriverReinitialize, context: ConstPtr)

public expect fun ioRegisterContainerNotification(notificationclass: IoContainerNotificationClass, callbackfunction: PioContainerNotificationFunction, notificationinformation: ConstPtr, notificationinformationlength: UInt, callbackregistration: MutPtr): Ntstatus

public expect fun ioRegisterDeviceInterface(physicaldeviceobject: ConstPtr, interfaceclassguid: ConstPtr, referencestring: ConstPtr, symboliclinkname: MutPtr): Ntstatus

public expect fun ioRegisterDriverReinitialization(driverobject: ConstPtr, driverreinitializationroutine: DriverReinitialize, context: ConstPtr)

public expect fun ioRegisterLastChanceShutdownNotification(deviceobject: ConstPtr): Ntstatus

public expect fun ioRegisterPlugPlayNotification(eventcategory: IoNotificationEventCategory, eventcategoryflags: UInt, eventcategorydata: ConstPtr, driverobject: ConstPtr, callbackroutine: DriverNotificationCallbackRoutine, context: MutPtr, notificationentry: MutPtr): Ntstatus

public expect fun ioRegisterShutdownNotification(deviceobject: ConstPtr): Ntstatus

public expect fun ioReleaseCancelSpinLock(irql: UByte)

public expect fun ioReleaseRemoveLockAndWaitEx(removelock: MutPtr, tag: ConstPtr, remlocksize: UInt)

public expect fun ioReleaseRemoveLockEx(removelock: MutPtr, tag: ConstPtr, remlocksize: UInt)

public expect fun ioRemoveLinkShareAccess(fileobject: ConstPtr, shareaccess: MutPtr, linkshareaccess: MutPtr)

public expect fun ioRemoveLinkShareAccessEx(fileobject: ConstPtr, shareaccess: MutPtr, linkshareaccess: MutPtr, ioshareaccessflags: UInt)

public expect fun ioRemoveShareAccess(fileobject: ConstPtr, shareaccess: MutPtr)

public expect fun ioReplacePartitionUnit(targetpdo: ConstPtr, sparepdo: ConstPtr, flags: UInt): Ntstatus

public expect fun ioReportDetectedDevice(driverobject: ConstPtr, legacybustype: InterfaceType, busnumber: UInt, slotnumber: UInt, resourcelist: ConstPtr, resourcerequirements: ConstPtr, resourceassigned: Boolean, deviceobject: MutPtr): Ntstatus

public expect fun ioReportInterruptActive(parameters: ConstPtr)

public expect fun ioReportInterruptInactive(parameters: ConstPtr)

public expect fun ioReportResourceForDetection(driverobject: ConstPtr, driverlist: ConstPtr, driverlistsize: UInt, deviceobject: ConstPtr, devicelist: ConstPtr, devicelistsize: UInt, conflictdetected: MutPtr): Ntstatus

public expect fun ioReportResourceUsage(driverclassname: ConstPtr, driverobject: ConstPtr, driverlist: ConstPtr, driverlistsize: UInt, deviceobject: ConstPtr, devicelist: ConstPtr, devicelistsize: UInt, overrideconflict: Boolean, conflictdetected: MutPtr): Ntstatus

public expect fun ioReportRootDevice(driverobject: ConstPtr): Ntstatus

public expect fun ioReportTargetDeviceChange(physicaldeviceobject: ConstPtr, notificationstructure: ConstPtr): Ntstatus

public expect fun ioReportTargetDeviceChangeAsynchronous(physicaldeviceobject: ConstPtr, notificationstructure: ConstPtr, callback: PdeviceChangeCompleteCallback, context: ConstPtr): Ntstatus

public expect fun ioRequestDeviceEject(physicaldeviceobject: ConstPtr)

public expect fun ioRequestDeviceEjectEx(physicaldeviceobject: ConstPtr, callback: PioDeviceEjectCallback, context: ConstPtr, driverobject: ConstPtr): Ntstatus

public expect fun ioReserveKsrPersistentMemory(driverobject: ConstPtr, physicaldeviceobject: ConstPtr, size: ULong, flags: UInt, datahandle: MutPtr): Ntstatus

public expect fun ioReserveKsrPersistentMemoryEx(driverobject: ConstPtr, physicaldeviceobject: ConstPtr, physicaldeviceid: ConstPtr, datatag: ConstPtr, dataversion: UInt, size: ULong, flags: UInt, datahandle: MutPtr): Ntstatus

public expect fun ioReuseIrp(irp: MutPtr, iostatus: Ntstatus)

public expect fun ioSetActivityIdIrp(irp: MutPtr, guid: ConstPtr): Ntstatus

public expect fun ioSetActivityIdThread(activityid: ConstPtr): MutPtr

public expect fun ioSetCompletionRoutineEx(deviceobject: ConstPtr, irp: ConstPtr, completionroutine: PioCompletionRoutine, context: ConstPtr, invokeonsuccess: Boolean, invokeonerror: Boolean, invokeoncancel: Boolean): Ntstatus

public expect fun ioSetDeviceInterfacePropertyData(symboliclinkname: ConstPtr, propertykey: ConstPtr, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: ConstPtr): Ntstatus

public expect fun ioSetDeviceInterfaceState(symboliclinkname: ConstPtr, enable: Boolean): Ntstatus

public expect fun ioSetDevicePropertyData(pdo: ConstPtr, propertykey: ConstPtr, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: ConstPtr): Ntstatus

public expect fun ioSetFileObjectIgnoreSharing(fileobject: ConstPtr): Ntstatus

public expect fun ioSetFileOrigin(fileobject: ConstPtr, remote: Boolean): Ntstatus

public expect fun ioSetFsZeroingOffset(irp: MutPtr, zeroingoffset: UInt): Ntstatus

public expect fun ioSetFsZeroingOffsetRequired(irp: MutPtr): Ntstatus

public expect fun ioSetHardErrorOrVerifyDevice(irp: ConstPtr, deviceobject: ConstPtr)

public expect fun ioSetIoAttributionIrp(irp: MutPtr, attributionsource: ConstPtr, flags: UInt): Ntstatus

public expect fun ioSetIoPriorityHint(irp: ConstPtr, priorityhint: IoPriorityHint): Ntstatus

public expect fun ioSetIrpExtraCreateParameter(irp: MutPtr, extracreateparameter: ConstPtr): Ntstatus

public expect fun ioSetLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr, shareaccess: MutPtr, linkshareaccess: MutPtr, ioshareaccessflags: UInt)

public expect fun ioSetMasterIrpStatus(masterirp: MutPtr, status: Ntstatus)

public expect fun ioSetPartitionInformation(deviceobject: ConstPtr, sectorsize: UInt, partitionnumber: UInt, partitiontype: UInt): Ntstatus

public expect fun ioSetPartitionInformationEx(deviceobject: ConstPtr, partitionnumber: UInt, partitioninfo: ConstPtr): Ntstatus

public expect fun ioSetShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr, shareaccess: MutPtr)

public expect fun ioSetShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr, shareaccess: MutPtr, writepermission: ConstPtr)

public expect fun ioSetStartIoAttributes(deviceobject: ConstPtr, deferredstartio: Boolean, noncancelable: Boolean)

public expect fun ioSetSystemPartition(volumenamestring: ConstPtr): Ntstatus

public expect fun ioSetThreadHardErrorMode(enableharderrors: Boolean): Boolean

public expect fun ioSetTopLevelIrp(irp: ConstPtr)

public expect fun ioSizeOfIrpEx(deviceobject: ConstPtr, stacksize: Byte): UShort

public expect fun ioSizeofWorkItem(): UInt

public expect fun ioStartNextPacket(deviceobject: ConstPtr, cancelable: Boolean)

public expect fun ioStartNextPacketByKey(deviceobject: ConstPtr, cancelable: Boolean, key: UInt)

public expect fun ioStartPacket(deviceobject: ConstPtr, irp: ConstPtr, key: ConstPtr, cancelfunction: DriverCancel)

public expect fun ioStartTimer(deviceobject: ConstPtr)

public expect fun ioStopTimer(deviceobject: ConstPtr)

public expect fun ioSynchronousCallDriver(deviceobject: ConstPtr, irp: ConstPtr): Ntstatus

public expect fun ioTransferActivityId(activityid: ConstPtr, relatedactivityid: ConstPtr)

public expect fun ioTranslateBusAddress(interfacetype: InterfaceType, busnumber: UInt, busaddress: Long, addressspace: MutPtr, translatedaddress: MutPtr): Boolean

public expect fun ioTryQueueWorkItem(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutineEx, queuetype: WorkQueueType, context: ConstPtr): Boolean

public expect fun ioUninitializeWorkItem(ioworkitem: PioWorkitem)

public expect fun ioUnregisterBootDriverCallback(callbackhandle: ConstPtr)

public expect fun ioUnregisterContainerNotification(callbackregistration: ConstPtr)

public expect fun ioUnregisterPlugPlayNotification(notificationentry: ConstPtr): Ntstatus

public expect fun ioUnregisterPlugPlayNotificationEx(notificationentry: ConstPtr): Ntstatus

public expect fun ioUnregisterShutdownNotification(deviceobject: ConstPtr)

public expect fun ioUpdateLinkShareAccess(fileobject: ConstPtr, shareaccess: MutPtr, linkshareaccess: MutPtr)

public expect fun ioUpdateLinkShareAccessEx(fileobject: ConstPtr, shareaccess: MutPtr, linkshareaccess: MutPtr, ioshareaccessflags: UInt)

public expect fun ioUpdateShareAccess(fileobject: ConstPtr, shareaccess: MutPtr)

public expect fun ioValidateDeviceIoControlAccess(irp: ConstPtr, requiredaccess: UInt): Ntstatus

public expect fun ioVerifyPartitionTable(deviceobject: ConstPtr, fixerrors: Boolean): Ntstatus

public expect fun ioVolumeDeviceNameToGuid(volumedevicename: ConstPtr, guid: MutPtr): Ntstatus

public expect fun ioVolumeDeviceNameToGuidPath(volumedevicename: ConstPtr, guidpath: MutPtr): Ntstatus

public expect fun ioVolumeDeviceToDosName(volumedeviceobject: ConstPtr, dosname: MutPtr): Ntstatus

public expect fun ioVolumeDeviceToGuid(volumedeviceobject: ConstPtr, guid: MutPtr): Ntstatus

public expect fun ioVolumeDeviceToGuidPath(volumedeviceobject: ConstPtr, guidpath: MutPtr): Ntstatus

public expect fun ioWMIAllocateInstanceIds(guid: ConstPtr, instancecount: UInt, firstinstanceid: MutPtr): Ntstatus

public expect fun ioWMIDeviceObjectToInstanceName(datablockobject: ConstPtr, deviceobject: ConstPtr, instancename: MutPtr): Ntstatus

public expect fun ioWMIExecuteMethod(datablockobject: ConstPtr, instancename: ConstPtr, methodid: UInt, inbuffersize: UInt, outbuffersize: MutPtr, inoutbuffer: MutPtr): Ntstatus

public expect fun ioWMIHandleToInstanceName(datablockobject: ConstPtr, filehandle: Handle, instancename: MutPtr): Ntstatus

public expect fun ioWMIOpenBlock(guid: ConstPtr, desiredaccess: UInt, datablockobject: MutPtr): Ntstatus

public expect fun ioWMIQueryAllData(datablockobject: ConstPtr, inoutbuffersize: MutPtr, outbuffer: MutPtr): Ntstatus

public expect fun ioWMIQueryAllDataMultiple(datablockobjectlist: ConstPtr, objectcount: UInt, inoutbuffersize: MutPtr, outbuffer: MutPtr): Ntstatus

public expect fun ioWMIQuerySingleInstance(datablockobject: ConstPtr, instancename: ConstPtr, inoutbuffersize: MutPtr, outbuffer: MutPtr): Ntstatus

public expect fun ioWMIQuerySingleInstanceMultiple(datablockobjectlist: ConstPtr, instancenames: ConstPtr, objectcount: UInt, inoutbuffersize: MutPtr, outbuffer: MutPtr): Ntstatus

public expect fun ioWMIRegistrationControl(deviceobject: ConstPtr, action: UInt): Ntstatus

public expect fun ioWMISetNotificationCallback(obj: MutPtr, callback: WmiNotificationCallback, context: ConstPtr): Ntstatus

public expect fun ioWMISetSingleInstance(datablockobject: ConstPtr, instancename: ConstPtr, version: UInt, valuebuffersize: UInt, valuebuffer: ConstPtr): Ntstatus

public expect fun ioWMISetSingleItem(datablockobject: ConstPtr, instancename: ConstPtr, dataitemid: UInt, version: UInt, valuebuffersize: UInt, valuebuffer: ConstPtr): Ntstatus

public expect fun ioWMISuggestInstanceName(physicaldeviceobject: ConstPtr, symboliclinkname: ConstPtr, combinenames: Boolean, suggestedinstancename: MutPtr): Ntstatus

public expect fun ioWMIWriteEvent(wnodeeventitem: MutPtr): Ntstatus

public expect fun ioWithinStackLimits(regionstart: ULong, regionsize: ULong): UInt

public expect fun ioWriteErrorLogEntry(elentry: ConstPtr)

public expect fun ioWriteKsrPersistentMemory(datahandle: ConstPtr, buffer: ConstPtr, size: ULong): Ntstatus

public expect fun ioWritePartitionTable(deviceobject: ConstPtr, sectorsize: UInt, sectorspertrack: UInt, numberofheads: UInt, partitionbuffer: ConstPtr): Ntstatus

public expect fun ioWritePartitionTableEx(deviceobject: ConstPtr, drivelayout: ConstPtr): Ntstatus

public expect fun iofCallDriver(deviceobject: ConstPtr, irp: MutPtr): Ntstatus

public expect fun iofCompleteRequest(irp: ConstPtr, priorityboost: Byte)

public expect fun kdChangeOption(option: KdOption, inbufferbytes: UInt, inbuffer: ConstPtr, outbufferbytes: UInt, outbuffer: MutPtr, outbufferneeded: MutPtr): Ntstatus

public expect fun kdDisableDebugger(): Ntstatus

public expect fun kdEnableDebugger(): Ntstatus

public expect fun kdRefreshDebuggerNotPresent(): Boolean

public expect fun keAcquireGuardedMutex(mutex: MutPtr)

public expect fun keAcquireGuardedMutexUnsafe(fastmutex: MutPtr)

public expect fun keAcquireInStackQueuedSpinLock(spinlock: MutPtr, lockhandle: MutPtr)

public expect fun keAcquireInStackQueuedSpinLockAtDpcLevel(spinlock: MutPtr, lockhandle: MutPtr)

public expect fun keAcquireInStackQueuedSpinLockForDpc(spinlock: MutPtr, lockhandle: MutPtr)

public expect fun keAcquireInterruptSpinLock(interrupt: Pkinterrupt): UByte

public expect fun keAcquireSpinLockForDpc(spinlock: MutPtr): UByte

public expect fun keAddTriageDumpDataBlock(ktriagedumpdataarray: MutPtr, address: ConstPtr, size: ULong): Ntstatus

public expect fun keAreAllApcsDisabled(): Boolean

public expect fun keAreApcsDisabled(): Boolean

public expect fun keBugCheck(bugcheckcode: BugcheckError)

public expect fun keBugCheckEx(bugcheckcode: BugcheckError, bugcheckparameter1: ULong, bugcheckparameter2: ULong, bugcheckparameter3: ULong, bugcheckparameter4: ULong)

public expect fun keCancelTimer(param0: MutPtr): Boolean

public expect fun keClearEvent(event: MutPtr)

public expect fun keConvertAuxiliaryCounterToPerformanceCounter(auxiliarycountervalue: ULong, performancecountervalue: MutPtr, conversionerror: MutPtr): Ntstatus

public expect fun keConvertPerformanceCounterToAuxiliaryCounter(performancecountervalue: ULong, auxiliarycountervalue: MutPtr, conversionerror: MutPtr): Ntstatus

public expect fun keDelayExecutionThread(waitmode: Byte, alertable: Boolean, interval: ConstPtr): Ntstatus

public expect fun keDeregisterBoundCallback(handle: ConstPtr): Ntstatus

public expect fun keDeregisterBugCheckCallback(callbackrecord: MutPtr): Boolean

public expect fun keDeregisterBugCheckReasonCallback(callbackrecord: MutPtr): Boolean

public expect fun keDeregisterNmiCallback(handle: ConstPtr): Ntstatus

public expect fun keDeregisterProcessorChangeCallback(callbackhandle: ConstPtr)

public expect fun keEnterCriticalRegion()

public expect fun keEnterGuardedRegion()

public expect fun keExpandKernelStackAndCallout(callout: PexpandStackCallout, parameter: ConstPtr, size: ULong): Ntstatus

public expect fun keExpandKernelStackAndCalloutEx(callout: PexpandStackCallout, parameter: ConstPtr, size: ULong, wait: Boolean, context: ConstPtr): Ntstatus

public expect fun keFlushIoBuffers(mdl: ConstPtr, readoperation: Boolean, dmaoperation: Boolean)

public expect fun keFlushQueuedDpcs()

public expect fun keFlushWriteBuffer()

public expect fun keGetCurrentIrql(): UByte

public expect fun keGetCurrentNodeNumber(): UShort

public expect fun keGetCurrentProcessorNumberEx(procnumber: MutPtr): UInt

public expect fun keGetProcessorIndexFromNumber(procnumber: ConstPtr): UInt

public expect fun keGetProcessorNumberFromIndex(procindex: UInt, procnumber: MutPtr): Ntstatus

public expect fun keGetRecommendedSharedDataAlignment(): UInt

public expect fun keInitializeCrashDumpHeader(dumptype: UInt, flags: UInt, buffer: MutPtr, buffersize: UInt, bufferneeded: MutPtr): Ntstatus

public expect fun keInitializeDeviceQueue(devicequeue: MutPtr)

public expect fun keInitializeDpc(dpc: MutPtr, deferredroutine: PkdeferredRoutine, deferredcontext: ConstPtr)

public expect fun keInitializeEvent(event: MutPtr, type: EventType, state: Boolean)

public expect fun keInitializeGuardedMutex(mutex: MutPtr)
