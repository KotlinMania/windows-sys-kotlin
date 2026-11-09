package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DRIVER_CANCEL
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DRIVER_CONTROL
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DRIVER_NOTIFICATION_CALLBACK_ROUTINE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DRIVER_REINITIALIZE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.IO_PRIORITY_HINT
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PCALLBACK_OBJECT
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PEPROCESS
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PESILO
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PEX_RUNDOWN_REF_CACHE_AWARE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PEX_TIMER
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PFREE_FUNCTION
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PIO_COMPLETION_ROUTINE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PIO_WORKITEM
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PKDEFERRED_ROUTINE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PKINTERRUPT
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PKTHREAD
import io.github.kotlinmania.windowssys.windows.wdk.foundation.POOL_TYPE
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FILE_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.CLFS_CONTEXT_MODE
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.CLFS_IOSTATS_CLASS
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.CLFS_MGMT_POLICY_TYPE
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.CLS_LOG_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.CLS_LSN
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.BUGCHECK_ERROR
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.EVENT_INFO_CLASS
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.REGHANDLE
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.EVENT_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.SUITE_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.FIRMWARE_TYPE

public expect fun ClfsAddLogContainer(plfolog: Long, pcbcontainer: Long, puszcontainerpath: Long): NTSTATUS

public expect fun ClfsAddLogContainerSet(plfolog: Long, ccontainers: UShort, pcbcontainer: Long, rguszcontainerpath: Long): NTSTATUS

public expect fun ClfsAdvanceLogBase(pvmarshalcontext: Long, plsnbase: Long, fflags: UInt): NTSTATUS

public expect fun ClfsAlignReservedLog(pvmarshalcontext: Long, crecords: UInt, rgcbreservation: Long, pcbalignreservation: Long): NTSTATUS

public expect fun ClfsAllocReservedLog(pvmarshalcontext: Long, crecords: UInt, pcbadjustment: Long): NTSTATUS

public expect fun ClfsCloseAndResetLogFile(plfolog: Long): NTSTATUS

public expect fun ClfsCloseLogFileObject(plfolog: Long): NTSTATUS

public expect fun ClfsCreateLogFile(pplfolog: Long, puszlogfilename: Long, fdesiredaccess: UInt, dwsharemode: UInt, psdlogfile: PSECURITY_DESCRIPTOR, fcreatedisposition: UInt, fcreateoptions: UInt, fflagsandattributes: UInt, flogoptionflag: UInt, pvcontext: Long, cbcontext: UInt): NTSTATUS

public expect fun ClfsCreateMarshallingArea(plfolog: Long, epooltype: POOL_TYPE, pfnallocbuffer: PALLOCATE_FUNCTION, pfnfreebuffer: PFREE_FUNCTION, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshalcontext: Long): NTSTATUS

public expect fun ClfsCreateMarshallingAreaEx(plfolog: Long, epooltype: POOL_TYPE, pfnallocbuffer: PALLOCATE_FUNCTION, pfnfreebuffer: PFREE_FUNCTION, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, calignmentsize: UInt, fflags: ULong, ppvmarshalcontext: Long): NTSTATUS

public expect fun ClfsCreateScanContext(plfolog: Long, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: Long): NTSTATUS

public expect fun ClfsDeleteLogByPointer(plfolog: Long): NTSTATUS

public expect fun ClfsDeleteLogFile(puszlogfilename: Long, pvreserved: Long, flogoptionflag: UInt, pvcontext: Long, cbcontext: UInt): NTSTATUS

public expect fun ClfsDeleteMarshallingArea(pvmarshalcontext: Long): NTSTATUS

public expect fun ClfsEarlierLsn(plsn: Long): CLS_LSN

public expect fun ClfsFinalize()

public expect fun ClfsFlushBuffers(pvmarshalcontext: Long): NTSTATUS

public expect fun ClfsFlushToLsn(pvmarshalcontext: Long, plsnflush: Long, plsnlastflushed: Long): NTSTATUS

public expect fun ClfsFreeReservedLog(pvmarshalcontext: Long, crecords: UInt, pcbadjustment: Long): NTSTATUS

public expect fun ClfsGetContainerName(plfolog: Long, cidlogicalcontainer: UInt, puszcontainername: Long, pcactuallencontainername: Long): NTSTATUS

public expect fun ClfsGetIoStatistics(plfolog: Long, pvstatsbuffer: Long, cbstatsbuffer: UInt, estatsclass: CLFS_IOSTATS_CLASS, pcbstatswritten: Long): NTSTATUS

public expect fun ClfsGetLogFileInformation(plfolog: Long, pinfobuffer: Long, pcbinfobuffer: Long): NTSTATUS

public expect fun ClfsInitialize(): NTSTATUS

public expect fun ClfsLaterLsn(plsn: Long): CLS_LSN

public expect fun ClfsLsnBlockOffset(plsn: Long): UInt

public expect fun ClfsLsnContainer(plsn: Long): UInt

public expect fun ClfsLsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): CLS_LSN

public expect fun ClfsLsnDifference(plsnstart: Long, plsnfinish: Long, cbcontainer: UInt, cbmaxblock: UInt, pcbdifference: Long): NTSTATUS

public expect fun ClfsLsnEqual(plsn1: Long, plsn2: Long): Boolean

public expect fun ClfsLsnGreater(plsn1: Long, plsn2: Long): Boolean

public expect fun ClfsLsnInvalid(plsn: Long): Boolean

public expect fun ClfsLsnLess(plsn1: Long, plsn2: Long): Boolean

public expect fun ClfsLsnNull(plsn: Long): Boolean

public expect fun ClfsLsnRecordSequence(plsn: Long): UInt

public expect fun ClfsMgmtDeregisterManagedClient(clientcookie: Long): NTSTATUS

public expect fun ClfsMgmtHandleLogFileFull(client: Long): NTSTATUS

public expect fun ClfsMgmtInstallPolicy(logfile: Long, policy: Long, policylength: UInt): NTSTATUS

public expect fun ClfsMgmtQueryPolicy(logfile: Long, policytype: CLFS_MGMT_POLICY_TYPE, policy: Long, policylength: Long): NTSTATUS

public expect fun ClfsMgmtRegisterManagedClient(logfile: Long, registrationdata: Long, clientcookie: Long): NTSTATUS

public expect fun ClfsMgmtRemovePolicy(logfile: Long, policytype: CLFS_MGMT_POLICY_TYPE): NTSTATUS

public expect fun ClfsMgmtSetLogFileSize(logfile: Long, newsizeincontainers: Long, resultingsizeincontainers: Long, completionroutine: PCLFS_SET_LOG_SIZE_COMPLETE_CALLBACK, completionroutinedata: Long): NTSTATUS

public expect fun ClfsMgmtSetLogFileSizeAsClient(logfile: Long, clientcookie: Long, newsizeincontainers: Long, resultingsizeincontainers: Long, completionroutine: PCLFS_SET_LOG_SIZE_COMPLETE_CALLBACK, completionroutinedata: Long): NTSTATUS

public expect fun ClfsMgmtTailAdvanceFailure(client: Long, reason: NTSTATUS): NTSTATUS

public expect fun ClfsQueryLogFileInformation(plfolog: Long, einformationclass: CLS_LOG_INFORMATION_CLASS, pinfoinputbuffer: Long, cbinfoinputbuffer: UInt, pinfobuffer: Long, pcbinfobuffer: Long): NTSTATUS

public expect fun ClfsReadLogRecord(pvmarshalcontext: Long, plsnfirst: Long, pecontextmode: CLFS_CONTEXT_MODE, ppvreadbuffer: Long, pcbreadbuffer: Long, perecordtype: Long, plsnundonext: Long, plsnprevious: Long, ppvreadcontext: Long): NTSTATUS

public expect fun ClfsReadNextLogRecord(pvreadcontext: Long, ppvbuffer: Long, pcbbuffer: Long, perecordtype: Long, plsnuser: Long, plsnundonext: Long, plsnprevious: Long, plsnrecord: Long): NTSTATUS

public expect fun ClfsReadPreviousRestartArea(pvreadcontext: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsnrestart: Long): NTSTATUS

public expect fun ClfsReadRestartArea(pvmarshalcontext: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsn: Long, ppvreadcontext: Long): NTSTATUS

public expect fun ClfsRemoveLogContainer(plfolog: Long, puszcontainerpath: Long, fforce: Boolean): NTSTATUS

public expect fun ClfsRemoveLogContainerSet(plfolog: Long, ccontainers: UShort, rgwszcontainerpath: Long, fforce: Boolean): NTSTATUS

public expect fun ClfsReserveAndAppendLog(pvmarshalcontext: Long, rgwriteentries: Long, cwriteentries: UInt, plsnundonext: Long, plsnprevious: Long, creserverecords: UInt, rgcbreservation: Long, fflags: UInt, plsn: Long): NTSTATUS

public expect fun ClfsReserveAndAppendLogAligned(pvmarshalcontext: Long, rgwriteentries: Long, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: Long, plsnprevious: Long, creserverecords: UInt, rgcbreservation: Long, fflags: UInt, plsn: Long): NTSTATUS

public expect fun ClfsScanLogContainers(pcxscan: Long, escanmode: UByte): NTSTATUS

public expect fun ClfsSetArchiveTail(plfolog: Long, plsnarchivetail: Long): NTSTATUS

public expect fun ClfsSetEndOfLog(plfolog: Long, plsnend: Long): NTSTATUS

public expect fun ClfsSetLogFileInformation(plfolog: Long, einformationclass: CLS_LOG_INFORMATION_CLASS, pinfobuffer: Long, cbbuffer: UInt): NTSTATUS

public expect fun ClfsTerminateReadLog(pvcursorcontext: Long): NTSTATUS

public expect fun ClfsWriteRestartArea(pvmarshalcontext: Long, pvrestartbuffer: Long, cbrestartbuffer: UInt, plsnbase: Long, fflags: UInt, pcbwritten: Long, plsnnext: Long): NTSTATUS

public expect fun CmCallbackGetKeyObjectID(cookie: Long, obj: Long, objectid: Long, objectname: Long): NTSTATUS

public expect fun CmCallbackGetKeyObjectIDEx(cookie: Long, obj: Long, objectid: Long, objectname: Long, flags: UInt): NTSTATUS

public expect fun CmCallbackReleaseKeyObjectIDEx(objectname: Long)

public expect fun CmGetBoundTransaction(cookie: Long, obj: Long): Long

public expect fun CmGetCallbackVersion(major: Long, minor: Long)

public expect fun CmRegisterCallback(function: PEX_CALLBACK_FUNCTION, context: Long, cookie: Long): NTSTATUS

public expect fun CmRegisterCallbackEx(function: PEX_CALLBACK_FUNCTION, altitude: Long, driver: Long, context: Long, cookie: Long, reserved: Long): NTSTATUS

public expect fun CmSetCallbackObjectContext(obj: Long, cookie: Long, newcontext: Long, oldcontext: Long): NTSTATUS

public expect fun CmUnRegisterCallback(cookie: Long): NTSTATUS

public expect fun DbgBreakPointWithStatus(status: UInt)

public expect fun DbgPrint(format: PCSTR, vararg variadicArgs: Long): UInt

public expect fun DbgPrintEx(componentid: UInt, level: UInt, format: PCSTR, vararg variadicArgs: Long): UInt

public expect fun DbgPrintReturnControlC(format: PCSTR, vararg variadicArgs: Long): UInt

public expect fun DbgPrompt(prompt: PCSTR, response: PSTR, length: UInt): UInt

public expect fun DbgQueryDebugFilterState(componentid: UInt, level: UInt): NTSTATUS

public expect fun DbgSetDebugFilterState(componentid: UInt, level: UInt, state: Boolean): NTSTATUS

public expect fun DbgSetDebugPrintCallback(debugprintcallback: PDEBUG_PRINT_CALLBACK, enable: Boolean): NTSTATUS

public expect fun EtwActivityIdControl(controlcode: UInt, activityid: Long): NTSTATUS

public expect fun EtwEventEnabled(reghandle: REGHANDLE, eventdescriptor: Long): Boolean

public expect fun EtwProviderEnabled(reghandle: REGHANDLE, level: UByte, keyword: ULong): Boolean

public expect fun EtwRegister(providerid: Long, enablecallback: PETWENABLECALLBACK, callbackcontext: Long, reghandle: Long): NTSTATUS

public expect fun EtwSetInformation(reghandle: REGHANDLE, informationclass: EVENT_INFO_CLASS, eventinformation: Long, informationlength: UInt): NTSTATUS

public expect fun EtwUnregister(reghandle: REGHANDLE): NTSTATUS

public expect fun EtwWrite(reghandle: REGHANDLE, eventdescriptor: Long, activityid: Long, userdatacount: UInt, userdata: Long): NTSTATUS

public expect fun EtwWriteEx(reghandle: REGHANDLE, eventdescriptor: Long, filter: ULong, flags: UInt, activityid: Long, relatedactivityid: Long, userdatacount: UInt, userdata: Long): NTSTATUS

public expect fun EtwWriteString(reghandle: REGHANDLE, level: UByte, keyword: ULong, activityid: Long, string: PCWSTR): NTSTATUS

public expect fun EtwWriteTransfer(reghandle: REGHANDLE, eventdescriptor: Long, activityid: Long, relatedactivityid: Long, userdatacount: UInt, userdata: Long): NTSTATUS

public expect fun ExAcquireFastMutex(fastmutex: Long)

public expect fun ExAcquireFastMutexUnsafe(fastmutex: Long)

public expect fun ExAcquirePushLockExclusiveEx(pushlock: Long, flags: UInt)

public expect fun ExAcquirePushLockSharedEx(pushlock: Long, flags: UInt)

public expect fun ExAcquireResourceExclusiveLite(resource: Long, wait: Boolean): Boolean

public expect fun ExAcquireResourceSharedLite(resource: Long, wait: Boolean): Boolean

public expect fun ExAcquireRundownProtection(runref: Long): Boolean

public expect fun ExAcquireRundownProtectionCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE): Boolean

public expect fun ExAcquireRundownProtectionCacheAwareEx(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE, count: UInt): Boolean

public expect fun ExAcquireRundownProtectionEx(runref: Long, count: UInt): Boolean

public expect fun ExAcquireSharedStarveExclusive(resource: Long, wait: Boolean): Boolean

public expect fun ExAcquireSharedWaitForExclusive(resource: Long, wait: Boolean): Boolean

public expect fun ExAcquireSpinLockExclusive(spinlock: Long): UByte

public expect fun ExAcquireSpinLockExclusiveAtDpcLevel(spinlock: Long)

public expect fun ExAcquireSpinLockShared(spinlock: Long): UByte

public expect fun ExAcquireSpinLockSharedAtDpcLevel(spinlock: Long)

public expect fun ExAllocateCacheAwareRundownProtection(pooltype: POOL_TYPE, pooltag: UInt): PEX_RUNDOWN_REF_CACHE_AWARE

public expect fun ExAllocatePool(pooltype: POOL_TYPE, numberofbytes: ULong): Long

public expect fun ExAllocatePool2(flags: ULong, numberofbytes: ULong, tag: UInt): Long

public expect fun ExAllocatePool3(flags: ULong, numberofbytes: ULong, tag: UInt, extendedparameters: Long, extendedparameterscount: UInt): Long

public expect fun ExAllocatePoolWithQuota(pooltype: POOL_TYPE, numberofbytes: ULong): Long

public expect fun ExAllocatePoolWithQuotaTag(pooltype: POOL_TYPE, numberofbytes: ULong, tag: UInt): Long

public expect fun ExAllocatePoolWithTag(pooltype: POOL_TYPE, numberofbytes: ULong, tag: UInt): Long

public expect fun ExAllocatePoolWithTagPriority(pooltype: POOL_TYPE, numberofbytes: ULong, tag: UInt, priority: EX_POOL_PRIORITY): Long

public expect fun ExAllocateTimer(callback: PEXT_CALLBACK, callbackcontext: Long, attributes: UInt): PEX_TIMER

public expect fun ExCancelTimer(timer: PEX_TIMER, parameters: Long): Boolean

public expect fun ExCleanupRundownProtectionCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE)

public expect fun ExConvertExclusiveToSharedLite(resource: Long)

public expect fun ExCreateCallback(callbackobject: Long, objectattributes: Long, create: Boolean, allowmultiplecallbacks: Boolean): NTSTATUS

public expect fun ExCreatePool(flags: UInt, tag: ULong, params: Long, poolhandle: Long): NTSTATUS

public expect fun ExDeleteResourceLite(resource: Long): NTSTATUS

public expect fun ExDeleteTimer(timer: PEX_TIMER, cancel: Boolean, wait: Boolean, parameters: Long): Boolean

public expect fun ExDestroyPool(poolhandle: HANDLE)

public expect fun ExEnterCriticalRegionAndAcquireResourceExclusive(resource: Long): Long

public expect fun ExEnterCriticalRegionAndAcquireResourceShared(resource: Long): Long

public expect fun ExEnterCriticalRegionAndAcquireSharedWaitForExclusive(resource: Long): Long

public expect fun ExEnumerateSystemFirmwareTables(firmwaretableprovidersignature: UInt, firmwaretablebuffer: Long, bufferlength: UInt, returnlength: Long): NTSTATUS

public expect fun ExExtendZone(zone: Long, segment: Long, segmentsize: UInt): NTSTATUS

public expect fun ExFreeCacheAwareRundownProtection(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE)

public expect fun ExFreePool(p: Long)

public expect fun ExFreePool2(p: Long, tag: UInt, extendedparameters: Long, extendedparameterscount: UInt)

public expect fun ExFreePoolWithTag(p: Long, tag: UInt)

public expect fun ExGetExclusiveWaiterCount(resource: Long): UInt

public expect fun ExGetFirmwareEnvironmentVariable(variablename: Long, vendorguid: Long, value: Long, valuelength: Long, attributes: Long): NTSTATUS

public expect fun ExGetFirmwareType(): FIRMWARE_TYPE

public expect fun ExGetPreviousMode(): Byte

public expect fun ExGetSharedWaiterCount(resource: Long): UInt

public expect fun ExGetSystemFirmwareTable(firmwaretableprovidersignature: UInt, firmwaretableid: UInt, firmwaretablebuffer: Long, bufferlength: UInt, returnlength: Long): NTSTATUS

public expect fun ExInitializePushLock(pushlock: Long)

public expect fun ExInitializeResourceLite(resource: Long): NTSTATUS

public expect fun ExInitializeRundownProtection(runref: Long)

public expect fun ExInitializeRundownProtectionCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE, runrefsize: ULong)

public expect fun ExInitializeRundownProtectionCacheAwareEx(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE, flags: UInt)

public expect fun ExInitializeZone(zone: Long, blocksize: UInt, initialsegment: Long, initialsegmentsize: UInt): NTSTATUS

public expect fun ExInterlockedAddLargeInteger(addend: Long, increment: Long, lock: Long): Long

public expect fun ExInterlockedExtendZone(zone: Long, segment: Long, segmentsize: UInt, lock: Long): NTSTATUS

public expect fun ExIsManufacturingModeEnabled(): Boolean

public expect fun ExIsProcessorFeaturePresent(processorfeature: UInt): Boolean

public expect fun ExIsResourceAcquiredExclusiveLite(resource: Long): Boolean

public expect fun ExIsResourceAcquiredSharedLite(resource: Long): UInt

public expect fun ExIsSoftBoot(): Boolean

public expect fun ExLocalTimeToSystemTime(localtime: Long, systemtime: Long)

public expect fun ExNotifyCallback(callbackobject: Long, argument1: Long, argument2: Long)

public expect fun ExQueryTimerResolution(maximumtime: Long, minimumtime: Long, currenttime: Long)

public expect fun ExQueueWorkItem(workitem: Long, queuetype: WORK_QUEUE_TYPE)

public expect fun ExRaiseAccessViolation()

public expect fun ExRaiseDatatypeMisalignment()

public expect fun ExRaiseStatus(status: NTSTATUS)

public expect fun ExReInitializeRundownProtection(runref: Long)

public expect fun ExReInitializeRundownProtectionCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE)

public expect fun ExRegisterCallback(callbackobject: PCALLBACK_OBJECT, callbackfunction: PCALLBACK_FUNCTION, callbackcontext: Long): Long

public expect fun ExReinitializeResourceLite(resource: Long): NTSTATUS

public expect fun ExReleaseFastMutex(fastmutex: Long)

public expect fun ExReleaseFastMutexUnsafe(fastmutex: Long)

public expect fun ExReleasePushLockExclusiveEx(pushlock: Long, flags: UInt)

public expect fun ExReleasePushLockSharedEx(pushlock: Long, flags: UInt)

public expect fun ExReleaseResourceAndLeaveCriticalRegion(resource: Long)

public expect fun ExReleaseResourceForThreadLite(resource: Long, resourcethreadid: ULong)

public expect fun ExReleaseResourceLite(resource: Long)

public expect fun ExReleaseRundownProtection(runref: Long)

public expect fun ExReleaseRundownProtectionCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE)

public expect fun ExReleaseRundownProtectionCacheAwareEx(runref: PEX_RUNDOWN_REF_CACHE_AWARE, count: UInt)

public expect fun ExReleaseRundownProtectionEx(runref: Long, count: UInt)

public expect fun ExReleaseSpinLockExclusive(spinlock: Long, oldirql: UByte)

public expect fun ExReleaseSpinLockExclusiveFromDpcLevel(spinlock: Long)

public expect fun ExReleaseSpinLockShared(spinlock: Long, oldirql: UByte)

public expect fun ExReleaseSpinLockSharedFromDpcLevel(spinlock: Long)

public expect fun ExRundownCompleted(runref: Long)

public expect fun ExRundownCompletedCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE)

public expect fun ExSecurePoolUpdate(securepoolhandle: HANDLE, tag: UInt, allocation: Long, cookie: ULong, offset: ULong, size: ULong, buffer: Long): NTSTATUS

public expect fun ExSecurePoolValidate(securepoolhandle: HANDLE, tag: UInt, allocation: Long, cookie: ULong): UInt

public expect fun ExSetFirmwareEnvironmentVariable(variablename: Long, vendorguid: Long, value: Long, valuelength: UInt, attributes: UInt): NTSTATUS

public expect fun ExSetResourceOwnerPointer(resource: Long, ownerpointer: Long)

public expect fun ExSetResourceOwnerPointerEx(resource: Long, ownerpointer: Long, flags: UInt)

public expect fun ExSetTimer(timer: PEX_TIMER, duetime: Long, period: Long, parameters: Long): Boolean

public expect fun ExSetTimerResolution(desiredtime: UInt, setresolution: Boolean): UInt

public expect fun ExSizeOfRundownProtectionCacheAware(): ULong

public expect fun ExSystemTimeToLocalTime(systemtime: Long, localtime: Long)

public expect fun ExTryAcquireSpinLockExclusiveAtDpcLevel(spinlock: Long): UInt

public expect fun ExTryAcquireSpinLockSharedAtDpcLevel(spinlock: Long): UInt

public expect fun ExTryConvertSharedSpinLockExclusive(spinlock: Long): UInt

public expect fun ExTryToAcquireFastMutex(fastmutex: Long): Boolean

public expect fun ExUnregisterCallback(callbackregistration: Long)

public expect fun ExUuidCreate(uuid: Long): NTSTATUS

public expect fun ExVerifySuite(suitetype: SUITE_TYPE): Boolean

public expect fun ExWaitForRundownProtectionRelease(runref: Long)

public expect fun ExWaitForRundownProtectionReleaseCacheAware(runref: PEX_RUNDOWN_REF_CACHE_AWARE)

public expect fun FsRtlIsTotalDeviceFailure(status: NTSTATUS): Boolean

public expect fun HalAcquireDisplayOwnership(resetdisplayparameters: PHAL_RESET_DISPLAY_PARAMETERS)

public expect fun HalAllocateAdapterChannel(adapterobject: Long, wcb: Long, numberofmapregisters: UInt, executionroutine: DRIVER_CONTROL): NTSTATUS

public expect fun HalAllocateCommonBuffer(adapterobject: Long, length: UInt, logicaladdress: Long, cacheenabled: Boolean): Long

public expect fun HalAllocateCrashDumpRegisters(adapterobject: Long, numberofmapregisters: Long): Long

public expect fun HalAllocateHardwareCounters(groupaffinty: Long, groupcount: UInt, resourcelist: Long, countersethandle: Long): NTSTATUS

public expect fun HalAssignSlotResources(registrypath: Long, driverclassname: Long, driverobject: Long, deviceobject: Long, bustype: INTERFACE_TYPE, busnumber: UInt, slotnumber: UInt, allocatedresources: Long): NTSTATUS

public expect fun HalBugCheckSystem(errorsource: Long, errorrecord: Long)

public expect fun HalDmaAllocateCrashDumpRegistersEx(adapter: Long, numberofmapregisters: UInt, type: HAL_DMA_CRASH_DUMP_REGISTER_TYPE, mapregisterbase: Long, mapregistersavailable: Long): NTSTATUS

public expect fun HalDmaFreeCrashDumpRegistersEx(adapter: Long, type: HAL_DMA_CRASH_DUMP_REGISTER_TYPE): NTSTATUS

public expect fun HalExamineMBR(deviceobject: Long, sectorsize: UInt, mbrtypeidentifier: UInt, buffer: Long)

public expect fun HalFreeCommonBuffer(adapterobject: Long, length: UInt, logicaladdress: Long, virtualaddress: Long, cacheenabled: Boolean)

public expect fun HalFreeHardwareCounters(countersethandle: HANDLE): NTSTATUS

public expect fun HalGetAdapter(devicedescription: Long, numberofmapregisters: Long): Long

public expect fun HalGetBusData(busdatatype: BUS_DATA_TYPE, busnumber: UInt, slotnumber: UInt, buffer: Long, length: UInt): UInt

public expect fun HalGetBusDataByOffset(busdatatype: BUS_DATA_TYPE, busnumber: UInt, slotnumber: UInt, buffer: Long, offset: UInt, length: UInt): UInt

public expect fun HalGetInterruptVector(interfacetype: INTERFACE_TYPE, busnumber: UInt, businterruptlevel: UInt, businterruptvector: UInt, irql: Long, affinity: Long): UInt

public expect fun HalMakeBeep(frequency: UInt): Boolean

public expect fun HalReadDmaCounter(adapterobject: Long): UInt

public expect fun HalSetBusData(busdatatype: BUS_DATA_TYPE, busnumber: UInt, slotnumber: UInt, buffer: Long, length: UInt): UInt

public expect fun HalSetBusDataByOffset(busdatatype: BUS_DATA_TYPE, busnumber: UInt, slotnumber: UInt, buffer: Long, offset: UInt, length: UInt): UInt

public expect fun HalTranslateBusAddress(interfacetype: INTERFACE_TYPE, busnumber: UInt, busaddress: Long, addressspace: Long, translatedaddress: Long): Boolean

public expect fun HvlRegisterWheaErrorNotification(callback: PHVL_WHEA_ERROR_NOTIFICATION): NTSTATUS

public expect fun HvlUnregisterWheaErrorNotification(callback: PHVL_WHEA_ERROR_NOTIFICATION): NTSTATUS

public expect fun IoAcquireCancelSpinLock(irql: Long)

public expect fun IoAcquireKsrPersistentMemory(driverobject: Long, physicaldeviceobject: Long, buffer: Long, size: Long): NTSTATUS

public expect fun IoAcquireKsrPersistentMemoryEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, datatag: Long, dataversion: Long, buffer: Long, size: Long): NTSTATUS

public expect fun IoAcquireRemoveLockEx(removelock: Long, tag: Long, file: PCSTR, line: UInt, remlocksize: UInt): NTSTATUS

public expect fun IoAllocateAdapterChannel(adapterobject: Long, deviceobject: Long, numberofmapregisters: UInt, executionroutine: DRIVER_CONTROL, context: Long): NTSTATUS

public expect fun IoAllocateController(controllerobject: Long, deviceobject: Long, executionroutine: DRIVER_CONTROL, context: Long)

public expect fun IoAllocateDriverObjectExtension(driverobject: Long, clientidentificationaddress: Long, driverobjectextensionsize: UInt, driverobjectextension: Long): NTSTATUS

public expect fun IoAllocateErrorLogEntry(ioobject: Long, entrysize: UByte): Long

public expect fun IoAllocateIrp(stacksize: Byte, chargequota: Boolean): Long

public expect fun IoAllocateIrpEx(deviceobject: Long, stacksize: Byte, chargequota: Boolean): Long

public expect fun IoAllocateMdl(virtualaddress: Long, length: UInt, secondarybuffer: Boolean, chargequota: Boolean, irp: Long): Long

public expect fun IoAllocateSfioStreamIdentifier(fileobject: Long, length: UInt, signature: Long, streamidentifier: Long): NTSTATUS

public expect fun IoAllocateWorkItem(deviceobject: Long): PIO_WORKITEM

public expect fun IoAssignResources(registrypath: Long, driverclassname: Long, driverobject: Long, deviceobject: Long, requestedresources: Long, allocatedresources: Long): NTSTATUS

public expect fun IoAttachDevice(sourcedevice: Long, targetdevice: Long, attacheddevice: Long): NTSTATUS

public expect fun IoAttachDeviceByPointer(sourcedevice: Long, targetdevice: Long): NTSTATUS

public expect fun IoAttachDeviceToDeviceStack(sourcedevice: Long, targetdevice: Long): Long

public expect fun IoAttachDeviceToDeviceStackSafe(sourcedevice: Long, targetdevice: Long, attachedtodeviceobject: Long): NTSTATUS

public expect fun IoBuildAsynchronousFsdRequest(majorfunction: UInt, deviceobject: Long, buffer: Long, length: UInt, startingoffset: Long, iostatusblock: Long): Long

public expect fun IoBuildDeviceIoControlRequest(iocontrolcode: UInt, deviceobject: Long, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, internaldeviceiocontrol: Boolean, event: Long, iostatusblock: Long): Long

public expect fun IoBuildPartialMdl(sourcemdl: Long, targetmdl: Long, virtualaddress: Long, length: UInt)

public expect fun IoBuildSynchronousFsdRequest(majorfunction: UInt, deviceobject: Long, buffer: Long, length: UInt, startingoffset: Long, event: Long, iostatusblock: Long): Long

public expect fun IoCancelFileOpen(deviceobject: Long, fileobject: Long)

public expect fun IoCancelIrp(irp: Long): Boolean

public expect fun IoCheckLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: UInt): NTSTATUS

public expect fun IoCheckShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long, update: Boolean): NTSTATUS

public expect fun IoCheckShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long, update: Boolean, writepermission: Long): NTSTATUS

public expect fun IoCleanupIrp(irp: Long)

public expect fun IoClearActivityIdThread(originalid: Long)

public expect fun IoClearIrpExtraCreateParameter(irp: Long)

public expect fun IoConnectInterrupt(interruptobject: Long, serviceroutine: PKSERVICE_ROUTINE, servicecontext: Long, spinlock: Long, vector: UInt, irql: UByte, synchronizeirql: UByte, interruptmode: KINTERRUPT_MODE, sharevector: Boolean, processorenablemask: ULong, floatingsave: Boolean): NTSTATUS

public expect fun IoConnectInterruptEx(parameters: Long): NTSTATUS

public expect fun IoCreateController(size: UInt): Long

public expect fun IoCreateDevice(driverobject: Long, deviceextensionsize: UInt, devicename: Long, devicetype: UInt, devicecharacteristics: UInt, exclusive: Boolean, deviceobject: Long): NTSTATUS

public expect fun IoCreateDisk(deviceobject: Long, disk: Long): NTSTATUS

public expect fun IoCreateFile(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, createfiletype: CREATE_FILE_TYPE, internalparameters: Long, options: UInt): NTSTATUS

public expect fun IoCreateFileEx(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, createfiletype: CREATE_FILE_TYPE, internalparameters: Long, options: UInt, drivercontext: Long): NTSTATUS

public expect fun IoCreateFileSpecifyDeviceObjectHint(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, createfiletype: CREATE_FILE_TYPE, internalparameters: Long, options: UInt, deviceobject: Long): NTSTATUS

public expect fun IoCreateNotificationEvent(eventname: Long, eventhandle: Long): Long

public expect fun IoCreateSymbolicLink(symboliclinkname: Long, devicename: Long): NTSTATUS

public expect fun IoCreateSynchronizationEvent(eventname: Long, eventhandle: Long): Long

public expect fun IoCreateSystemThread(ioobject: Long, threadhandle: Long, desiredaccess: UInt, objectattributes: Long, processhandle: HANDLE, clientid: Long, startroutine: PKSTART_ROUTINE, startcontext: Long): NTSTATUS

public expect fun IoCreateUnprotectedSymbolicLink(symboliclinkname: Long, devicename: Long): NTSTATUS

public expect fun IoCsqInitialize(csq: Long, csqinsertirp: PIO_CSQ_INSERT_IRP, csqremoveirp: PIO_CSQ_REMOVE_IRP, csqpeeknextirp: PIO_CSQ_PEEK_NEXT_IRP, csqacquirelock: PIO_CSQ_ACQUIRE_LOCK, csqreleaselock: PIO_CSQ_RELEASE_LOCK, csqcompletecanceledirp: PIO_CSQ_COMPLETE_CANCELED_IRP): NTSTATUS

public expect fun IoCsqInitializeEx(csq: Long, csqinsertirp: PIO_CSQ_INSERT_IRP_EX, csqremoveirp: PIO_CSQ_REMOVE_IRP, csqpeeknextirp: PIO_CSQ_PEEK_NEXT_IRP, csqacquirelock: PIO_CSQ_ACQUIRE_LOCK, csqreleaselock: PIO_CSQ_RELEASE_LOCK, csqcompletecanceledirp: PIO_CSQ_COMPLETE_CANCELED_IRP): NTSTATUS

public expect fun IoCsqInsertIrp(csq: Long, irp: Long, context: Long)

public expect fun IoCsqInsertIrpEx(csq: Long, irp: Long, context: Long, insertcontext: Long): NTSTATUS

public expect fun IoCsqRemoveIrp(csq: Long, context: Long): Long

public expect fun IoCsqRemoveNextIrp(csq: Long, peekcontext: Long): Long

public expect fun IoDecrementKeepAliveCount(fileobject: Long, process: PEPROCESS): NTSTATUS

public expect fun IoDeleteController(controllerobject: Long)

public expect fun IoDeleteDevice(deviceobject: Long)

public expect fun IoDeleteSymbolicLink(symboliclinkname: Long): NTSTATUS

public expect fun IoDetachDevice(targetdevice: Long)

public expect fun IoDisconnectInterrupt(interruptobject: PKINTERRUPT)

public expect fun IoDisconnectInterruptEx(parameters: Long)

public expect fun IoEnumerateKsrPersistentMemoryEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, callback: PIO_PERSISTED_MEMORY_ENUMERATION_CALLBACK, callbackcontext: Long): NTSTATUS

public expect fun IoFlushAdapterBuffers(adapterobject: Long, mdl: Long, mapregisterbase: Long, currentva: Long, length: UInt, writetodevice: Boolean): Boolean

public expect fun IoForwardIrpSynchronously(deviceobject: Long, irp: Long): Boolean

public expect fun IoFreeAdapterChannel(adapterobject: Long)

public expect fun IoFreeController(controllerobject: Long)

public expect fun IoFreeErrorLogEntry(elentry: Long)

public expect fun IoFreeIrp(irp: Long)

public expect fun IoFreeKsrPersistentMemory(datahandle: Long): NTSTATUS

public expect fun IoFreeMapRegisters(adapterobject: Long, mapregisterbase: Long, numberofmapregisters: UInt)

public expect fun IoFreeMdl(mdl: Long)

public expect fun IoFreeSfioStreamIdentifier(fileobject: Long, signature: Long): NTSTATUS

public expect fun IoFreeWorkItem(ioworkitem: PIO_WORKITEM)

public expect fun IoGetActivityIdIrp(irp: Long, guid: Long): NTSTATUS

public expect fun IoGetActivityIdThread(): Long

public expect fun IoGetAffinityInterrupt(interruptobject: PKINTERRUPT, groupaffinity: Long): NTSTATUS

public expect fun IoGetAttachedDeviceReference(deviceobject: Long): Long

public expect fun IoGetBootDiskInformation(bootdiskinformation: Long, size: UInt): NTSTATUS

public expect fun IoGetBootDiskInformationLite(bootdiskinformation: Long): NTSTATUS

public expect fun IoGetConfigurationInformation(): Long

public expect fun IoGetContainerInformation(informationclass: IO_CONTAINER_INFORMATION_CLASS, containerobject: Long, buffer: Long, bufferlength: UInt): NTSTATUS

public expect fun IoGetCurrentProcess(): PEPROCESS

public expect fun IoGetDeviceDirectory(physicaldeviceobject: Long, directorytype: DEVICE_DIRECTORY_TYPE, flags: UInt, reserved: Long, devicedirectoryhandle: Long): NTSTATUS

public expect fun IoGetDeviceInterfaceAlias(symboliclinkname: Long, aliasinterfaceclassguid: Long, aliassymboliclinkname: Long): NTSTATUS

public expect fun IoGetDeviceInterfacePropertyData(symboliclinkname: Long, propertykey: Long, lcid: UInt, flags: UInt, size: UInt, data: Long, requiredsize: Long, type: Long): NTSTATUS

public expect fun IoGetDeviceInterfaces(interfaceclassguid: Long, physicaldeviceobject: Long, flags: UInt, symboliclinklist: Long): NTSTATUS

public expect fun IoGetDeviceNumaNode(pdo: Long, nodenumber: Long): NTSTATUS

public expect fun IoGetDeviceObjectPointer(objectname: Long, desiredaccess: UInt, fileobject: Long, deviceobject: Long): NTSTATUS

public expect fun IoGetDeviceProperty(deviceobject: Long, deviceproperty: DEVICE_REGISTRY_PROPERTY, bufferlength: UInt, propertybuffer: Long, resultlength: Long): NTSTATUS

public expect fun IoGetDevicePropertyData(pdo: Long, propertykey: Long, lcid: UInt, flags: UInt, size: UInt, data: Long, requiredsize: Long, type: Long): NTSTATUS

public expect fun IoGetDmaAdapter(physicaldeviceobject: Long, devicedescription: Long, numberofmapregisters: Long): Long

public expect fun IoGetDriverDirectory(driverobject: Long, directorytype: DRIVER_DIRECTORY_TYPE, flags: UInt, driverdirectoryhandle: Long): NTSTATUS

public expect fun IoGetDriverObjectExtension(driverobject: Long, clientidentificationaddress: Long): Long

public expect fun IoGetFileObjectGenericMapping(): Long

public expect fun IoGetFsZeroingOffset(irp: Long, zeroingoffset: Long): NTSTATUS

public expect fun IoGetInitialStack(): Long

public expect fun IoGetInitiatorProcess(fileobject: Long): PEPROCESS

public expect fun IoGetIoAttributionHandle(irp: Long, ioattributionhandle: Long): NTSTATUS

public expect fun IoGetIoPriorityHint(irp: Long): IO_PRIORITY_HINT

public expect fun IoGetIommuInterface(version: UInt, interfaceout: Long): NTSTATUS

public expect fun IoGetIommuInterfaceEx(version: UInt, flags: ULong, interfaceout: Long): NTSTATUS

public expect fun IoGetIrpExtraCreateParameter(irp: Long, extracreateparameter: Long): NTSTATUS

public expect fun IoGetPagingIoPriority(irp: Long): IO_PAGING_PRIORITY

public expect fun IoGetRelatedDeviceObject(fileobject: Long): Long

public expect fun IoGetSfioStreamIdentifier(fileobject: Long, signature: Long): Long

public expect fun IoGetSilo(fileobject: Long): PESILO

public expect fun IoGetSiloParameters(fileobject: Long): Long

public expect fun IoGetStackLimits(lowlimit: Long, highlimit: Long)

public expect fun IoGetTopLevelIrp(): Long

public expect fun IoGetTransactionParameterBlock(fileobject: Long): Long

public expect fun IoIncrementKeepAliveCount(fileobject: Long, process: PEPROCESS): NTSTATUS

public expect fun IoInitializeIrp(irp: Long, packetsize: UShort, stacksize: Byte)

public expect fun IoInitializeIrpEx(irp: Long, deviceobject: Long, packetsize: UShort, stacksize: Byte)

public expect fun IoInitializeRemoveLockEx(lock: Long, allocatetag: UInt, maxlockedminutes: UInt, highwatermark: UInt, remlocksize: UInt)

public expect fun IoInitializeTimer(deviceobject: Long, timerroutine: PIO_TIMER_ROUTINE, context: Long): NTSTATUS

public expect fun IoInitializeWorkItem(ioobject: Long, ioworkitem: PIO_WORKITEM)

public expect fun IoInvalidateDeviceRelations(deviceobject: Long, type: DEVICE_RELATION_TYPE)

public expect fun IoInvalidateDeviceState(physicaldeviceobject: Long)

public expect fun IoIs32bitProcess(irp: Long): Boolean

public expect fun IoIsFileObjectIgnoringSharing(fileobject: Long): Boolean

public expect fun IoIsFileOriginRemote(fileobject: Long): Boolean

public expect fun IoIsInitiator32bitProcess(irp: Long): Boolean

public expect fun IoIsValidIrpStatus(status: NTSTATUS): UInt

public expect fun IoIsWdmVersionAvailable(majorversion: UByte, minorversion: UByte): Boolean

public expect fun IoMakeAssociatedIrp(irp: Long, stacksize: Byte): Long

public expect fun IoMakeAssociatedIrpEx(irp: Long, deviceobject: Long, stacksize: Byte): Long

public expect fun IoMapTransfer(adapterobject: Long, mdl: Long, mapregisterbase: Long, currentva: Long, length: Long, writetodevice: Boolean): Long

public expect fun IoOpenDeviceInterfaceRegistryKey(symboliclinkname: Long, desiredaccess: UInt, deviceinterfaceregkey: Long): NTSTATUS

public expect fun IoOpenDeviceRegistryKey(deviceobject: Long, devinstkeytype: UInt, desiredaccess: UInt, deviceregkey: Long): NTSTATUS

public expect fun IoOpenDriverRegistryKey(driverobject: Long, regkeytype: DRIVER_REGKEY_TYPE, desiredaccess: UInt, flags: UInt, driverregkey: Long): NTSTATUS

public expect fun IoPropagateActivityIdToThread(irp: Long, propagatedid: Long, originalid: Long): NTSTATUS

public expect fun IoQueryDeviceDescription(bustype: Long, busnumber: Long, controllertype: Long, controllernumber: Long, peripheraltype: Long, peripheralnumber: Long, calloutroutine: PIO_QUERY_DEVICE_ROUTINE, context: Long): NTSTATUS

public expect fun IoQueryFullDriverPath(driverobject: Long, fullpath: Long): NTSTATUS

public expect fun IoQueryInformationByName(objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, options: UInt, drivercontext: Long): NTSTATUS

public expect fun IoQueryKsrPersistentMemorySize(driverobject: Long, physicaldeviceobject: Long, buffersize: Long): NTSTATUS

public expect fun IoQueryKsrPersistentMemorySizeEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, datatag: Long, dataversion: Long, buffersize: Long): NTSTATUS

public expect fun IoQueueWorkItem(ioworkitem: PIO_WORKITEM, workerroutine: PIO_WORKITEM_ROUTINE, queuetype: WORK_QUEUE_TYPE, context: Long)

public expect fun IoQueueWorkItemEx(ioworkitem: PIO_WORKITEM, workerroutine: PIO_WORKITEM_ROUTINE_EX, queuetype: WORK_QUEUE_TYPE, context: Long)

public expect fun IoRaiseHardError(irp: Long, vpb: Long, realdeviceobject: Long)

public expect fun IoRaiseInformationalHardError(errorstatus: NTSTATUS, string: Long, thread: PKTHREAD): Boolean

public expect fun IoReadDiskSignature(deviceobject: Long, bytespersector: UInt, signature: Long): NTSTATUS

public expect fun IoReadPartitionTable(deviceobject: Long, sectorsize: UInt, returnrecognizedpartitions: Boolean, partitionbuffer: Long): NTSTATUS

public expect fun IoReadPartitionTableEx(deviceobject: Long, drivelayout: Long): NTSTATUS

public expect fun IoRecordIoAttribution(opaquehandle: Long, attributioninformation: Long): NTSTATUS

public expect fun IoRegisterBootDriverCallback(callbackfunction: PBOOT_DRIVER_CALLBACK_FUNCTION, callbackcontext: Long): Long

public expect fun IoRegisterBootDriverReinitialization(driverobject: Long, driverreinitializationroutine: DRIVER_REINITIALIZE, context: Long)

public expect fun IoRegisterContainerNotification(notificationclass: IO_CONTAINER_NOTIFICATION_CLASS, callbackfunction: PIO_CONTAINER_NOTIFICATION_FUNCTION, notificationinformation: Long, notificationinformationlength: UInt, callbackregistration: Long): NTSTATUS

public expect fun IoRegisterDeviceInterface(physicaldeviceobject: Long, interfaceclassguid: Long, referencestring: Long, symboliclinkname: Long): NTSTATUS

public expect fun IoRegisterDriverReinitialization(driverobject: Long, driverreinitializationroutine: DRIVER_REINITIALIZE, context: Long)

public expect fun IoRegisterLastChanceShutdownNotification(deviceobject: Long): NTSTATUS

public expect fun IoRegisterPlugPlayNotification(eventcategory: IO_NOTIFICATION_EVENT_CATEGORY, eventcategoryflags: UInt, eventcategorydata: Long, driverobject: Long, callbackroutine: DRIVER_NOTIFICATION_CALLBACK_ROUTINE, context: Long, notificationentry: Long): NTSTATUS

public expect fun IoRegisterShutdownNotification(deviceobject: Long): NTSTATUS

public expect fun IoReleaseCancelSpinLock(irql: UByte)

public expect fun IoReleaseRemoveLockAndWaitEx(removelock: Long, tag: Long, remlocksize: UInt)

public expect fun IoReleaseRemoveLockEx(removelock: Long, tag: Long, remlocksize: UInt)

public expect fun IoRemoveLinkShareAccess(fileobject: Long, shareaccess: Long, linkshareaccess: Long)

public expect fun IoRemoveLinkShareAccessEx(fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: UInt)

public expect fun IoRemoveShareAccess(fileobject: Long, shareaccess: Long)

public expect fun IoReplacePartitionUnit(targetpdo: Long, sparepdo: Long, flags: UInt): NTSTATUS

public expect fun IoReportDetectedDevice(driverobject: Long, legacybustype: INTERFACE_TYPE, busnumber: UInt, slotnumber: UInt, resourcelist: Long, resourcerequirements: Long, resourceassigned: Boolean, deviceobject: Long): NTSTATUS

public expect fun IoReportInterruptActive(parameters: Long)

public expect fun IoReportInterruptInactive(parameters: Long)

public expect fun IoReportResourceForDetection(driverobject: Long, driverlist: Long, driverlistsize: UInt, deviceobject: Long, devicelist: Long, devicelistsize: UInt, conflictdetected: Long): NTSTATUS

public expect fun IoReportResourceUsage(driverclassname: Long, driverobject: Long, driverlist: Long, driverlistsize: UInt, deviceobject: Long, devicelist: Long, devicelistsize: UInt, overrideconflict: Boolean, conflictdetected: Long): NTSTATUS

public expect fun IoReportRootDevice(driverobject: Long): NTSTATUS

public expect fun IoReportTargetDeviceChange(physicaldeviceobject: Long, notificationstructure: Long): NTSTATUS

public expect fun IoReportTargetDeviceChangeAsynchronous(physicaldeviceobject: Long, notificationstructure: Long, callback: PDEVICE_CHANGE_COMPLETE_CALLBACK, context: Long): NTSTATUS

public expect fun IoRequestDeviceEject(physicaldeviceobject: Long)

public expect fun IoRequestDeviceEjectEx(physicaldeviceobject: Long, callback: PIO_DEVICE_EJECT_CALLBACK, context: Long, driverobject: Long): NTSTATUS

public expect fun IoReserveKsrPersistentMemory(driverobject: Long, physicaldeviceobject: Long, size: ULong, flags: UInt, datahandle: Long): NTSTATUS

public expect fun IoReserveKsrPersistentMemoryEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, datatag: Long, dataversion: UInt, size: ULong, flags: UInt, datahandle: Long): NTSTATUS

public expect fun IoReuseIrp(irp: Long, iostatus: NTSTATUS)

public expect fun IoSetActivityIdIrp(irp: Long, guid: Long): NTSTATUS

public expect fun IoSetActivityIdThread(activityid: Long): Long

public expect fun IoSetCompletionRoutineEx(deviceobject: Long, irp: Long, completionroutine: PIO_COMPLETION_ROUTINE, context: Long, invokeonsuccess: Boolean, invokeonerror: Boolean, invokeoncancel: Boolean): NTSTATUS

public expect fun IoSetDeviceInterfacePropertyData(symboliclinkname: Long, propertykey: Long, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: Long): NTSTATUS

public expect fun IoSetDeviceInterfaceState(symboliclinkname: Long, enable: Boolean): NTSTATUS

public expect fun IoSetDevicePropertyData(pdo: Long, propertykey: Long, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: Long): NTSTATUS

public expect fun IoSetFileObjectIgnoreSharing(fileobject: Long): NTSTATUS

public expect fun IoSetFileOrigin(fileobject: Long, remote: Boolean): NTSTATUS

public expect fun IoSetFsZeroingOffset(irp: Long, zeroingoffset: UInt): NTSTATUS

public expect fun IoSetFsZeroingOffsetRequired(irp: Long): NTSTATUS

public expect fun IoSetHardErrorOrVerifyDevice(irp: Long, deviceobject: Long)

public expect fun IoSetIoAttributionIrp(irp: Long, attributionsource: Long, flags: UInt): NTSTATUS

public expect fun IoSetIoPriorityHint(irp: Long, priorityhint: IO_PRIORITY_HINT): NTSTATUS

public expect fun IoSetIrpExtraCreateParameter(irp: Long, extracreateparameter: Long): NTSTATUS

public expect fun IoSetLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: UInt)

public expect fun IoSetMasterIrpStatus(masterirp: Long, status: NTSTATUS)

public expect fun IoSetPartitionInformation(deviceobject: Long, sectorsize: UInt, partitionnumber: UInt, partitiontype: UInt): NTSTATUS

public expect fun IoSetPartitionInformationEx(deviceobject: Long, partitionnumber: UInt, partitioninfo: Long): NTSTATUS

public expect fun IoSetShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long)

public expect fun IoSetShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long, writepermission: Long)

public expect fun IoSetStartIoAttributes(deviceobject: Long, deferredstartio: Boolean, noncancelable: Boolean)

public expect fun IoSetSystemPartition(volumenamestring: Long): NTSTATUS

public expect fun IoSetThreadHardErrorMode(enableharderrors: Boolean): Boolean

public expect fun IoSetTopLevelIrp(irp: Long)

public expect fun IoSizeOfIrpEx(deviceobject: Long, stacksize: Byte): UShort

public expect fun IoSizeofWorkItem(): UInt

public expect fun IoStartNextPacket(deviceobject: Long, cancelable: Boolean)

public expect fun IoStartNextPacketByKey(deviceobject: Long, cancelable: Boolean, key: UInt)

public expect fun IoStartPacket(deviceobject: Long, irp: Long, key: Long, cancelfunction: DRIVER_CANCEL)

public expect fun IoStartTimer(deviceobject: Long)

public expect fun IoStopTimer(deviceobject: Long)

public expect fun IoSynchronousCallDriver(deviceobject: Long, irp: Long): NTSTATUS

public expect fun IoTransferActivityId(activityid: Long, relatedactivityid: Long)

public expect fun IoTranslateBusAddress(interfacetype: INTERFACE_TYPE, busnumber: UInt, busaddress: Long, addressspace: Long, translatedaddress: Long): Boolean

public expect fun IoTryQueueWorkItem(ioworkitem: PIO_WORKITEM, workerroutine: PIO_WORKITEM_ROUTINE_EX, queuetype: WORK_QUEUE_TYPE, context: Long): Boolean

public expect fun IoUninitializeWorkItem(ioworkitem: PIO_WORKITEM)

public expect fun IoUnregisterBootDriverCallback(callbackhandle: Long)

public expect fun IoUnregisterContainerNotification(callbackregistration: Long)

public expect fun IoUnregisterPlugPlayNotification(notificationentry: Long): NTSTATUS

public expect fun IoUnregisterPlugPlayNotificationEx(notificationentry: Long): NTSTATUS

public expect fun IoUnregisterShutdownNotification(deviceobject: Long)

public expect fun IoUpdateLinkShareAccess(fileobject: Long, shareaccess: Long, linkshareaccess: Long)

public expect fun IoUpdateLinkShareAccessEx(fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: UInt)

public expect fun IoUpdateShareAccess(fileobject: Long, shareaccess: Long)

public expect fun IoValidateDeviceIoControlAccess(irp: Long, requiredaccess: UInt): NTSTATUS

public expect fun IoVerifyPartitionTable(deviceobject: Long, fixerrors: Boolean): NTSTATUS

public expect fun IoVolumeDeviceNameToGuid(volumedevicename: Long, guid: Long): NTSTATUS

public expect fun IoVolumeDeviceNameToGuidPath(volumedevicename: Long, guidpath: Long): NTSTATUS

public expect fun IoVolumeDeviceToDosName(volumedeviceobject: Long, dosname: Long): NTSTATUS

public expect fun IoVolumeDeviceToGuid(volumedeviceobject: Long, guid: Long): NTSTATUS

public expect fun IoVolumeDeviceToGuidPath(volumedeviceobject: Long, guidpath: Long): NTSTATUS

public expect fun IoWMIAllocateInstanceIds(guid: Long, instancecount: UInt, firstinstanceid: Long): NTSTATUS

public expect fun IoWMIDeviceObjectToInstanceName(datablockobject: Long, deviceobject: Long, instancename: Long): NTSTATUS

public expect fun IoWMIExecuteMethod(datablockobject: Long, instancename: Long, methodid: UInt, inbuffersize: UInt, outbuffersize: Long, inoutbuffer: Long): NTSTATUS

public expect fun IoWMIHandleToInstanceName(datablockobject: Long, filehandle: HANDLE, instancename: Long): NTSTATUS

public expect fun IoWMIOpenBlock(guid: Long, desiredaccess: UInt, datablockobject: Long): NTSTATUS

public expect fun IoWMIQueryAllData(datablockobject: Long, inoutbuffersize: Long, outbuffer: Long): NTSTATUS

public expect fun IoWMIQueryAllDataMultiple(datablockobjectlist: Long, objectcount: UInt, inoutbuffersize: Long, outbuffer: Long): NTSTATUS

public expect fun IoWMIQuerySingleInstance(datablockobject: Long, instancename: Long, inoutbuffersize: Long, outbuffer: Long): NTSTATUS

public expect fun IoWMIQuerySingleInstanceMultiple(datablockobjectlist: Long, instancenames: Long, objectcount: UInt, inoutbuffersize: Long, outbuffer: Long): NTSTATUS

public expect fun IoWMIRegistrationControl(deviceobject: Long, action: UInt): NTSTATUS

public expect fun IoWMISetNotificationCallback(obj: Long, callback: WMI_NOTIFICATION_CALLBACK, context: Long): NTSTATUS

public expect fun IoWMISetSingleInstance(datablockobject: Long, instancename: Long, version: UInt, valuebuffersize: UInt, valuebuffer: Long): NTSTATUS

public expect fun IoWMISetSingleItem(datablockobject: Long, instancename: Long, dataitemid: UInt, version: UInt, valuebuffersize: UInt, valuebuffer: Long): NTSTATUS

public expect fun IoWMISuggestInstanceName(physicaldeviceobject: Long, symboliclinkname: Long, combinenames: Boolean, suggestedinstancename: Long): NTSTATUS

public expect fun IoWMIWriteEvent(wnodeeventitem: Long): NTSTATUS

public expect fun IoWithinStackLimits(regionstart: ULong, regionsize: ULong): UInt

public expect fun IoWriteErrorLogEntry(elentry: Long)

public expect fun IoWriteKsrPersistentMemory(datahandle: Long, buffer: Long, size: ULong): NTSTATUS

public expect fun IoWritePartitionTable(deviceobject: Long, sectorsize: UInt, sectorspertrack: UInt, numberofheads: UInt, partitionbuffer: Long): NTSTATUS

public expect fun IoWritePartitionTableEx(deviceobject: Long, drivelayout: Long): NTSTATUS

public expect fun IofCallDriver(deviceobject: Long, irp: Long): NTSTATUS

public expect fun IofCompleteRequest(irp: Long, priorityboost: Byte)

public expect fun KdChangeOption(option: KD_OPTION, inbufferbytes: UInt, inbuffer: Long, outbufferbytes: UInt, outbuffer: Long, outbufferneeded: Long): NTSTATUS

public expect fun KdDisableDebugger(): NTSTATUS

public expect fun KdEnableDebugger(): NTSTATUS

public expect fun KdRefreshDebuggerNotPresent(): Boolean

public expect fun KeAcquireGuardedMutex(mutex: Long)

public expect fun KeAcquireGuardedMutexUnsafe(fastmutex: Long)

public expect fun KeAcquireInStackQueuedSpinLock(spinlock: Long, lockhandle: Long)

public expect fun KeAcquireInStackQueuedSpinLockAtDpcLevel(spinlock: Long, lockhandle: Long)

public expect fun KeAcquireInStackQueuedSpinLockForDpc(spinlock: Long, lockhandle: Long)

public expect fun KeAcquireInterruptSpinLock(interrupt: PKINTERRUPT): UByte

public expect fun KeAcquireSpinLockForDpc(spinlock: Long): UByte

public expect fun KeAddTriageDumpDataBlock(ktriagedumpdataarray: Long, address: Long, size: ULong): NTSTATUS

public expect fun KeAreAllApcsDisabled(): Boolean

public expect fun KeAreApcsDisabled(): Boolean

public expect fun KeBugCheck(bugcheckcode: BUGCHECK_ERROR)

public expect fun KeBugCheckEx(bugcheckcode: BUGCHECK_ERROR, bugcheckparameter1: ULong, bugcheckparameter2: ULong, bugcheckparameter3: ULong, bugcheckparameter4: ULong)

public expect fun KeCancelTimer(param0: Long): Boolean

public expect fun KeClearEvent(event: Long)

public expect fun KeConvertAuxiliaryCounterToPerformanceCounter(auxiliarycountervalue: ULong, performancecountervalue: Long, conversionerror: Long): NTSTATUS

public expect fun KeConvertPerformanceCounterToAuxiliaryCounter(performancecountervalue: ULong, auxiliarycountervalue: Long, conversionerror: Long): NTSTATUS

public expect fun KeDelayExecutionThread(waitmode: Byte, alertable: Boolean, interval: Long): NTSTATUS

public expect fun KeDeregisterBoundCallback(handle: Long): NTSTATUS

public expect fun KeDeregisterBugCheckCallback(callbackrecord: Long): Boolean

public expect fun KeDeregisterBugCheckReasonCallback(callbackrecord: Long): Boolean

public expect fun KeDeregisterNmiCallback(handle: Long): NTSTATUS

public expect fun KeDeregisterProcessorChangeCallback(callbackhandle: Long)

public expect fun KeEnterCriticalRegion()

public expect fun KeEnterGuardedRegion()

public expect fun KeExpandKernelStackAndCallout(callout: PEXPAND_STACK_CALLOUT, parameter: Long, size: ULong): NTSTATUS

public expect fun KeExpandKernelStackAndCalloutEx(callout: PEXPAND_STACK_CALLOUT, parameter: Long, size: ULong, wait: Boolean, context: Long): NTSTATUS

public expect fun KeFlushIoBuffers(mdl: Long, readoperation: Boolean, dmaoperation: Boolean)

public expect fun KeFlushQueuedDpcs()

public expect fun KeFlushWriteBuffer()

public expect fun KeGetCurrentIrql(): UByte

public expect fun KeGetCurrentNodeNumber(): UShort

public expect fun KeGetCurrentProcessorNumberEx(procnumber: Long): UInt

public expect fun KeGetProcessorIndexFromNumber(procnumber: Long): UInt

public expect fun KeGetProcessorNumberFromIndex(procindex: UInt, procnumber: Long): NTSTATUS

public expect fun KeGetRecommendedSharedDataAlignment(): UInt

public expect fun KeInitializeCrashDumpHeader(dumptype: UInt, flags: UInt, buffer: Long, buffersize: UInt, bufferneeded: Long): NTSTATUS

public expect fun KeInitializeDeviceQueue(devicequeue: Long)

public expect fun KeInitializeDpc(dpc: Long, deferredroutine: PKDEFERRED_ROUTINE, deferredcontext: Long)

public expect fun KeInitializeEvent(event: Long, type: EVENT_TYPE, state: Boolean)

public expect fun KeInitializeGuardedMutex(mutex: Long)
