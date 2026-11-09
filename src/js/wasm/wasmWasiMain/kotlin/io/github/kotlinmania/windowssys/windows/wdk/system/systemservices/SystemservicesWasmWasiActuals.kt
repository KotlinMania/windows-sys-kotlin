@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DRIVER_CANCEL
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DRIVER_CONTROL
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DRIVER_NOTIFICATION_CALLBACK_ROUTINE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DRIVER_REINITIALIZE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.IO_PRIORITY_HINT
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PAFFINITY_TOKEN
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PCALLBACK_OBJECT
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PEJOB
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PEPROCESS
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PESILO
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PETHREAD
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PEX_RUNDOWN_REF_CACHE_AWARE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PEX_TIMER
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PFREE_FUNCTION
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PIO_COMPLETION_ROUTINE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PIO_WORKITEM
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PKDEFERRED_ROUTINE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PKINTERRUPT
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PKTHREAD
import io.github.kotlinmania.windowssys.windows.wdk.foundation.POBJECT_TYPE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.POHANDLE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.POOL_TYPE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PPCW_BUFFER
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PPCW_INSTANCE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PPCW_REGISTRATION
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PSILO_MONITOR
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FILE_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.LUID
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.security.PSID
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SE_ADT_PARAMETER_TYPE
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.CLFS_CONTEXT_MODE
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.CLFS_IOSTATS_CLASS
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.CLFS_MGMT_POLICY_TYPE
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.CLS_LOG_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.CLS_LSN
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.BUGCHECK_ERROR
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WHEA_ERROR_SOURCE_STATE
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WHEA_ERROR_SOURCE_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.EVENT_INFO_CLASS
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.REGHANDLE
import io.github.kotlinmania.windowssys.windows.win32.system.io.PIO_APC_ROUTINE
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.EVENT_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.SUITE_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.TIMER_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.WAIT_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.power.DEVICE_POWER_STATE
import io.github.kotlinmania.windowssys.windows.win32.system.power.POWER_INFORMATION_LEVEL
import io.github.kotlinmania.windowssys.windows.win32.system.power.POWER_REQUEST_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.FIRMWARE_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.LOGICAL_PROCESSOR_RELATIONSHIP
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.RTL_SYSTEM_GLOBAL_DATA_ID
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.ENLISTMENT_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.KTMOBJECT_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.RESOURCEMANAGER_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.TRANSACTIONMANAGER_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.TRANSACTION_INFORMATION_CLASS

public actual fun ClfsAddLogContainer(plfolog: Long, pcbcontainer: Long, puszcontainerpath: Long): NTSTATUS =
    0

public actual fun ClfsAddLogContainerSet(plfolog: Long, ccontainers: UShort, pcbcontainer: Long, rguszcontainerpath: Long): NTSTATUS =
    0

public actual fun ClfsAdvanceLogBase(pvmarshalcontext: Long, plsnbase: Long, fflags: UInt): NTSTATUS =
    0

public actual fun ClfsAlignReservedLog(pvmarshalcontext: Long, crecords: UInt, rgcbreservation: Long, pcbalignreservation: Long): NTSTATUS =
    0

public actual fun ClfsAllocReservedLog(pvmarshalcontext: Long, crecords: UInt, pcbadjustment: Long): NTSTATUS =
    0

public actual fun ClfsCloseAndResetLogFile(plfolog: Long): NTSTATUS =
    0

public actual fun ClfsCloseLogFileObject(plfolog: Long): NTSTATUS =
    0

public actual fun ClfsCreateLogFile(pplfolog: Long, puszlogfilename: Long, fdesiredaccess: UInt, dwsharemode: UInt, psdlogfile: PSECURITY_DESCRIPTOR, fcreatedisposition: UInt, fcreateoptions: UInt, fflagsandattributes: UInt, flogoptionflag: UInt, pvcontext: Long, cbcontext: UInt): NTSTATUS =
    0

public actual fun ClfsCreateMarshallingArea(plfolog: Long, epooltype: POOL_TYPE, pfnallocbuffer: PALLOCATE_FUNCTION, pfnfreebuffer: PFREE_FUNCTION, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshalcontext: Long): NTSTATUS =
    0

public actual fun ClfsCreateMarshallingAreaEx(plfolog: Long, epooltype: POOL_TYPE, pfnallocbuffer: PALLOCATE_FUNCTION, pfnfreebuffer: PFREE_FUNCTION, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, calignmentsize: UInt, fflags: ULong, ppvmarshalcontext: Long): NTSTATUS =
    0

public actual fun ClfsCreateScanContext(plfolog: Long, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: Long): NTSTATUS =
    0

public actual fun ClfsDeleteLogByPointer(plfolog: Long): NTSTATUS =
    0

public actual fun ClfsDeleteLogFile(puszlogfilename: Long, pvreserved: Long, flogoptionflag: UInt, pvcontext: Long, cbcontext: UInt): NTSTATUS =
    0

public actual fun ClfsDeleteMarshallingArea(pvmarshalcontext: Long): NTSTATUS =
    0

public actual fun ClfsEarlierLsn(plsn: Long): CLS_LSN =
    CLS_LSN()

public actual fun ClfsFinalize() {
}

public actual fun ClfsFlushBuffers(pvmarshalcontext: Long): NTSTATUS =
    0

public actual fun ClfsFlushToLsn(pvmarshalcontext: Long, plsnflush: Long, plsnlastflushed: Long): NTSTATUS =
    0

public actual fun ClfsFreeReservedLog(pvmarshalcontext: Long, crecords: UInt, pcbadjustment: Long): NTSTATUS =
    0

public actual fun ClfsGetContainerName(plfolog: Long, cidlogicalcontainer: UInt, puszcontainername: Long, pcactuallencontainername: Long): NTSTATUS =
    0

public actual fun ClfsGetIoStatistics(plfolog: Long, pvstatsbuffer: Long, cbstatsbuffer: UInt, estatsclass: CLFS_IOSTATS_CLASS, pcbstatswritten: Long): NTSTATUS =
    0

public actual fun ClfsGetLogFileInformation(plfolog: Long, pinfobuffer: Long, pcbinfobuffer: Long): NTSTATUS =
    0

public actual fun ClfsInitialize(): NTSTATUS =
    0

public actual fun ClfsLaterLsn(plsn: Long): CLS_LSN =
    CLS_LSN()

public actual fun ClfsLsnBlockOffset(plsn: Long): UInt =
    0u

public actual fun ClfsLsnContainer(plsn: Long): UInt =
    0u

public actual fun ClfsLsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): CLS_LSN =
    CLS_LSN()

public actual fun ClfsLsnDifference(plsnstart: Long, plsnfinish: Long, cbcontainer: UInt, cbmaxblock: UInt, pcbdifference: Long): NTSTATUS =
    0

public actual fun ClfsLsnEqual(plsn1: Long, plsn2: Long): Boolean =
    false

public actual fun ClfsLsnGreater(plsn1: Long, plsn2: Long): Boolean =
    false

public actual fun ClfsLsnInvalid(plsn: Long): Boolean =
    false

public actual fun ClfsLsnLess(plsn1: Long, plsn2: Long): Boolean =
    false

public actual fun ClfsLsnNull(plsn: Long): Boolean =
    false

public actual fun ClfsLsnRecordSequence(plsn: Long): UInt =
    0u

public actual fun ClfsMgmtDeregisterManagedClient(clientcookie: Long): NTSTATUS =
    0

public actual fun ClfsMgmtHandleLogFileFull(client: Long): NTSTATUS =
    0

public actual fun ClfsMgmtInstallPolicy(logfile: Long, policy: Long, policylength: UInt): NTSTATUS =
    0

public actual fun ClfsMgmtQueryPolicy(logfile: Long, policytype: CLFS_MGMT_POLICY_TYPE, policy: Long, policylength: Long): NTSTATUS =
    0

public actual fun ClfsMgmtRegisterManagedClient(logfile: Long, registrationdata: Long, clientcookie: Long): NTSTATUS =
    0

public actual fun ClfsMgmtRemovePolicy(logfile: Long, policytype: CLFS_MGMT_POLICY_TYPE): NTSTATUS =
    0

public actual fun ClfsMgmtSetLogFileSize(logfile: Long, newsizeincontainers: Long, resultingsizeincontainers: Long, completionroutine: PCLFS_SET_LOG_SIZE_COMPLETE_CALLBACK, completionroutinedata: Long): NTSTATUS =
    0

public actual fun ClfsMgmtSetLogFileSizeAsClient(logfile: Long, clientcookie: Long, newsizeincontainers: Long, resultingsizeincontainers: Long, completionroutine: PCLFS_SET_LOG_SIZE_COMPLETE_CALLBACK, completionroutinedata: Long): NTSTATUS =
    0

public actual fun ClfsMgmtTailAdvanceFailure(client: Long, reason: NTSTATUS): NTSTATUS =
    0

public actual fun ClfsQueryLogFileInformation(plfolog: Long, einformationclass: CLS_LOG_INFORMATION_CLASS, pinfoinputbuffer: Long, cbinfoinputbuffer: UInt, pinfobuffer: Long, pcbinfobuffer: Long): NTSTATUS =
    0

public actual fun ClfsReadLogRecord(pvmarshalcontext: Long, plsnfirst: Long, pecontextmode: CLFS_CONTEXT_MODE, ppvreadbuffer: Long, pcbreadbuffer: Long, perecordtype: Long, plsnundonext: Long, plsnprevious: Long, ppvreadcontext: Long): NTSTATUS =
    0

public actual fun ClfsReadNextLogRecord(pvreadcontext: Long, ppvbuffer: Long, pcbbuffer: Long, perecordtype: Long, plsnuser: Long, plsnundonext: Long, plsnprevious: Long, plsnrecord: Long): NTSTATUS =
    0

public actual fun ClfsReadPreviousRestartArea(pvreadcontext: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsnrestart: Long): NTSTATUS =
    0

public actual fun ClfsReadRestartArea(pvmarshalcontext: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsn: Long, ppvreadcontext: Long): NTSTATUS =
    0

public actual fun ClfsRemoveLogContainer(plfolog: Long, puszcontainerpath: Long, fforce: Boolean): NTSTATUS =
    0

public actual fun ClfsRemoveLogContainerSet(plfolog: Long, ccontainers: UShort, rgwszcontainerpath: Long, fforce: Boolean): NTSTATUS =
    0

public actual fun ClfsReserveAndAppendLog(pvmarshalcontext: Long, rgwriteentries: Long, cwriteentries: UInt, plsnundonext: Long, plsnprevious: Long, creserverecords: UInt, rgcbreservation: Long, fflags: UInt, plsn: Long): NTSTATUS =
    0

public actual fun ClfsReserveAndAppendLogAligned(pvmarshalcontext: Long, rgwriteentries: Long, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: Long, plsnprevious: Long, creserverecords: UInt, rgcbreservation: Long, fflags: UInt, plsn: Long): NTSTATUS =
    0

public actual fun ClfsScanLogContainers(pcxscan: Long, escanmode: UByte): NTSTATUS =
    0

public actual fun ClfsSetArchiveTail(plfolog: Long, plsnarchivetail: Long): NTSTATUS =
    0

public actual fun ClfsSetEndOfLog(plfolog: Long, plsnend: Long): NTSTATUS =
    0

public actual fun ClfsSetLogFileInformation(plfolog: Long, einformationclass: CLS_LOG_INFORMATION_CLASS, pinfobuffer: Long, cbbuffer: UInt): NTSTATUS =
    0

public actual fun ClfsTerminateReadLog(pvcursorcontext: Long): NTSTATUS =
    0

public actual fun ClfsWriteRestartArea(pvmarshalcontext: Long, pvrestartbuffer: Long, cbrestartbuffer: UInt, plsnbase: Long, fflags: UInt, pcbwritten: Long, plsnnext: Long): NTSTATUS =
    0

public actual fun CmCallbackGetKeyObjectID(cookie: Long, obj: Long, objectid: Long, objectname: Long): NTSTATUS =
    0

public actual fun CmCallbackGetKeyObjectIDEx(cookie: Long, obj: Long, objectid: Long, objectname: Long, flags: UInt): NTSTATUS =
    0

public actual fun CmCallbackReleaseKeyObjectIDEx(objectname: Long) {
}

public actual fun CmGetBoundTransaction(cookie: Long, obj: Long): Long =
    0L

public actual fun CmGetCallbackVersion(major: Long, minor: Long) {
}

public actual fun CmRegisterCallback(function: PEX_CALLBACK_FUNCTION, context: Long, cookie: Long): NTSTATUS =
    0

public actual fun CmRegisterCallbackEx(function: PEX_CALLBACK_FUNCTION, altitude: Long, driver: Long, context: Long, cookie: Long, reserved: Long): NTSTATUS =
    0

public actual fun CmSetCallbackObjectContext(obj: Long, cookie: Long, newcontext: Long, oldcontext: Long): NTSTATUS =
    0

public actual fun CmUnRegisterCallback(cookie: Long): NTSTATUS =
    0

public actual fun DbgBreakPointWithStatus(status: UInt) {
}

public actual fun DbgPrint(format: PCSTR): UInt =
    0u

public actual fun DbgPrintEx(componentid: UInt, level: UInt, format: PCSTR): UInt =
    0u

public actual fun DbgPrintReturnControlC(format: PCSTR): UInt =
    0u

public actual fun DbgPrompt(prompt: PCSTR, response: PSTR, length: UInt): UInt =
    0u

public actual fun DbgQueryDebugFilterState(componentid: UInt, level: UInt): NTSTATUS =
    0

public actual fun DbgSetDebugFilterState(componentid: UInt, level: UInt, state: Boolean): NTSTATUS =
    0

public actual fun DbgSetDebugPrintCallback(debugprintcallback: PDEBUG_PRINT_CALLBACK, enable: Boolean): NTSTATUS =
    0

public actual fun EtwActivityIdControl(controlcode: UInt, activityid: Long): NTSTATUS =
    0

public actual fun EtwEventEnabled(reghandle: REGHANDLE, eventdescriptor: Long): Boolean =
    false

public actual fun EtwProviderEnabled(reghandle: REGHANDLE, level: UByte, keyword: ULong): Boolean =
    false

public actual fun EtwRegister(providerid: Long, enablecallback: PETWENABLECALLBACK, callbackcontext: Long, reghandle: Long): NTSTATUS =
    0

public actual fun EtwSetInformation(reghandle: REGHANDLE, informationclass: EVENT_INFO_CLASS, eventinformation: Long, informationlength: UInt): NTSTATUS =
    0

public actual fun EtwUnregister(reghandle: REGHANDLE): NTSTATUS =
    0

public actual fun EtwWrite(reghandle: REGHANDLE, eventdescriptor: Long, activityid: Long, userdatacount: UInt, userdata: Long): NTSTATUS =
    0

public actual fun EtwWriteEx(reghandle: REGHANDLE, eventdescriptor: Long, filter: ULong, flags: UInt, activityid: Long, relatedactivityid: Long, userdatacount: UInt, userdata: Long): NTSTATUS =
    0

public actual fun EtwWriteString(reghandle: REGHANDLE, level: UByte, keyword: ULong, activityid: Long, string: PCWSTR): NTSTATUS =
    0

public actual fun EtwWriteTransfer(reghandle: REGHANDLE, eventdescriptor: Long, activityid: Long, relatedactivityid: Long, userdatacount: UInt, userdata: Long): NTSTATUS =
    0

public actual fun ExAcquireFastMutex(fastmutex: Long) {
}

public actual fun ExAcquireFastMutexUnsafe(fastmutex: Long) {
}

public actual fun ExAcquirePushLockExclusiveEx(pushlock: Long, flags: UInt) {
}

public actual fun ExAcquirePushLockSharedEx(pushlock: Long, flags: UInt) {
}

public actual fun ExAcquireResourceExclusiveLite(resource: Long, wait: Boolean): Boolean =
    false

public actual fun ExAcquireResourceSharedLite(resource: Long, wait: Boolean): Boolean =
    false

public actual fun ExAcquireRundownProtection(runref: Long): Boolean =
    false

public actual fun ExAcquireRundownProtectionCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE): Boolean =
    false

public actual fun ExAcquireRundownProtectionCacheAwareEx(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE, count: UInt): Boolean =
    false

public actual fun ExAcquireRundownProtectionEx(runref: Long, count: UInt): Boolean =
    false

public actual fun ExAcquireSharedStarveExclusive(resource: Long, wait: Boolean): Boolean =
    false

public actual fun ExAcquireSharedWaitForExclusive(resource: Long, wait: Boolean): Boolean =
    false

public actual fun ExAcquireSpinLockExclusive(spinlock: Long): UByte =
    0u

public actual fun ExAcquireSpinLockExclusiveAtDpcLevel(spinlock: Long) {
}

public actual fun ExAcquireSpinLockShared(spinlock: Long): UByte =
    0u

public actual fun ExAcquireSpinLockSharedAtDpcLevel(spinlock: Long) {
}

public actual fun ExAllocateCacheAwareRundownProtection(pooltype: POOL_TYPE, pooltag: UInt): PEX_RUNDOWN_REF_CACHE_AWARE =
    0L

public actual fun ExAllocatePool(pooltype: POOL_TYPE, numberofbytes: ULong): Long =
    0L

public actual fun ExAllocatePool2(flags: ULong, numberofbytes: ULong, tag: UInt): Long =
    0L

public actual fun ExAllocatePool3(flags: ULong, numberofbytes: ULong, tag: UInt, extendedparameters: Long, extendedparameterscount: UInt): Long =
    0L

public actual fun ExAllocatePoolWithQuota(pooltype: POOL_TYPE, numberofbytes: ULong): Long =
    0L

public actual fun ExAllocatePoolWithQuotaTag(pooltype: POOL_TYPE, numberofbytes: ULong, tag: UInt): Long =
    0L

public actual fun ExAllocatePoolWithTag(pooltype: POOL_TYPE, numberofbytes: ULong, tag: UInt): Long =
    0L

public actual fun ExAllocatePoolWithTagPriority(pooltype: POOL_TYPE, numberofbytes: ULong, tag: UInt, priority: EX_POOL_PRIORITY): Long =
    0L

public actual fun ExAllocateTimer(callback: PEXT_CALLBACK, callbackcontext: Long, attributes: UInt): PEX_TIMER =
    0L

public actual fun ExCancelTimer(timer: PEX_TIMER, parameters: Long): Boolean =
    false

public actual fun ExCleanupRundownProtectionCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE) {
}

public actual fun ExConvertExclusiveToSharedLite(resource: Long) {
}

public actual fun ExCreateCallback(callbackobject: Long, objectattributes: Long, create: Boolean, allowmultiplecallbacks: Boolean): NTSTATUS =
    0

public actual fun ExCreatePool(flags: UInt, tag: ULong, params: Long, poolhandle: Long): NTSTATUS =
    0

public actual fun ExDeleteResourceLite(resource: Long): NTSTATUS =
    0

public actual fun ExDeleteTimer(timer: PEX_TIMER, cancel: Boolean, wait: Boolean, parameters: Long): Boolean =
    false

public actual fun ExDestroyPool(poolhandle: HANDLE) {
}

public actual fun ExEnterCriticalRegionAndAcquireResourceExclusive(resource: Long): Long =
    0L

public actual fun ExEnterCriticalRegionAndAcquireResourceShared(resource: Long): Long =
    0L

public actual fun ExEnterCriticalRegionAndAcquireSharedWaitForExclusive(resource: Long): Long =
    0L

public actual fun ExEnumerateSystemFirmwareTables(firmwaretableprovidersignature: UInt, firmwaretablebuffer: Long, bufferlength: UInt, returnlength: Long): NTSTATUS =
    0

public actual fun ExExtendZone(zone: Long, segment: Long, segmentsize: UInt): NTSTATUS =
    0

public actual fun ExFreeCacheAwareRundownProtection(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE) {
}

public actual fun ExFreePool(p: Long) {
}

public actual fun ExFreePool2(p: Long, tag: UInt, extendedparameters: Long, extendedparameterscount: UInt) {
}

public actual fun ExFreePoolWithTag(p: Long, tag: UInt) {
}

public actual fun ExGetExclusiveWaiterCount(resource: Long): UInt =
    0u

public actual fun ExGetFirmwareEnvironmentVariable(variablename: Long, vendorguid: Long, value: Long, valuelength: Long, attributes: Long): NTSTATUS =
    0

public actual fun ExGetFirmwareType(): FIRMWARE_TYPE =
    0

public actual fun ExGetPreviousMode(): Byte =
    0

public actual fun ExGetSharedWaiterCount(resource: Long): UInt =
    0u

public actual fun ExGetSystemFirmwareTable(firmwaretableprovidersignature: UInt, firmwaretableid: UInt, firmwaretablebuffer: Long, bufferlength: UInt, returnlength: Long): NTSTATUS =
    0

public actual fun ExInitializePushLock(pushlock: Long) {
}

public actual fun ExInitializeResourceLite(resource: Long): NTSTATUS =
    0

public actual fun ExInitializeRundownProtection(runref: Long) {
}

public actual fun ExInitializeRundownProtectionCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE, runrefsize: ULong) {
}

public actual fun ExInitializeRundownProtectionCacheAwareEx(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE, flags: UInt) {
}

public actual fun ExInitializeZone(zone: Long, blocksize: UInt, initialsegment: Long, initialsegmentsize: UInt): NTSTATUS =
    0

public actual fun ExInterlockedAddLargeInteger(addend: Long, increment: Long, lock: Long): Long =
    0L

public actual fun ExInterlockedExtendZone(zone: Long, segment: Long, segmentsize: UInt, lock: Long): NTSTATUS =
    0

public actual fun ExIsManufacturingModeEnabled(): Boolean =
    false

public actual fun ExIsProcessorFeaturePresent(processorfeature: UInt): Boolean =
    false

public actual fun ExIsResourceAcquiredExclusiveLite(resource: Long): Boolean =
    false

public actual fun ExIsResourceAcquiredSharedLite(resource: Long): UInt =
    0u

public actual fun ExIsSoftBoot(): Boolean =
    false

public actual fun ExLocalTimeToSystemTime(localtime: Long, systemtime: Long) {
}

public actual fun ExNotifyCallback(callbackobject: Long, argument1: Long, argument2: Long) {
}

public actual fun ExQueryTimerResolution(maximumtime: Long, minimumtime: Long, currenttime: Long) {
}

public actual fun ExQueueWorkItem(workitem: Long, queuetype: WORK_QUEUE_TYPE) {
}

public actual fun ExRaiseAccessViolation() {
}

public actual fun ExRaiseDatatypeMisalignment() {
}

public actual fun ExRaiseStatus(status: NTSTATUS) {
}

public actual fun ExReInitializeRundownProtection(runref: Long) {
}

public actual fun ExReInitializeRundownProtectionCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE) {
}

public actual fun ExRegisterCallback(callbackobject: PCALLBACK_OBJECT, callbackfunction: PCALLBACK_FUNCTION, callbackcontext: Long): Long =
    0L

public actual fun ExReinitializeResourceLite(resource: Long): NTSTATUS =
    0

public actual fun ExReleaseFastMutex(fastmutex: Long) {
}

public actual fun ExReleaseFastMutexUnsafe(fastmutex: Long) {
}

public actual fun ExReleasePushLockExclusiveEx(pushlock: Long, flags: UInt) {
}

public actual fun ExReleasePushLockSharedEx(pushlock: Long, flags: UInt) {
}

public actual fun ExReleaseResourceAndLeaveCriticalRegion(resource: Long) {
}

public actual fun ExReleaseResourceForThreadLite(resource: Long, resourcethreadid: ULong) {
}

public actual fun ExReleaseResourceLite(resource: Long) {
}

public actual fun ExReleaseRundownProtection(runref: Long) {
}

public actual fun ExReleaseRundownProtectionCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE) {
}

public actual fun ExReleaseRundownProtectionCacheAwareEx(runref: PEX_RUNDOWN_REF_CACHE_AWARE, count: UInt) {
}

public actual fun ExReleaseRundownProtectionEx(runref: Long, count: UInt) {
}

public actual fun ExReleaseSpinLockExclusive(spinlock: Long, oldirql: UByte) {
}

public actual fun ExReleaseSpinLockExclusiveFromDpcLevel(spinlock: Long) {
}

public actual fun ExReleaseSpinLockShared(spinlock: Long, oldirql: UByte) {
}

public actual fun ExReleaseSpinLockSharedFromDpcLevel(spinlock: Long) {
}

public actual fun ExRundownCompleted(runref: Long) {
}

public actual fun ExRundownCompletedCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE) {
}

public actual fun ExSecurePoolUpdate(securepoolhandle: HANDLE, tag: UInt, allocation: Long, cookie: ULong, offset: ULong, size: ULong, buffer: Long): NTSTATUS =
    0

public actual fun ExSecurePoolValidate(securepoolhandle: HANDLE, tag: UInt, allocation: Long, cookie: ULong): UInt =
    0u

public actual fun ExSetFirmwareEnvironmentVariable(variablename: Long, vendorguid: Long, value: Long, valuelength: UInt, attributes: UInt): NTSTATUS =
    0

public actual fun ExSetResourceOwnerPointer(resource: Long, ownerpointer: Long) {
}

public actual fun ExSetResourceOwnerPointerEx(resource: Long, ownerpointer: Long, flags: UInt) {
}

public actual fun ExSetTimer(timer: PEX_TIMER, duetime: Long, period: Long, parameters: Long): Boolean =
    false

public actual fun ExSetTimerResolution(desiredtime: UInt, setresolution: Boolean): UInt =
    0u

public actual fun ExSizeOfRundownProtectionCacheAware(): ULong =
    0uL

public actual fun ExSystemTimeToLocalTime(systemtime: Long, localtime: Long) {
}

public actual fun ExTryAcquireSpinLockExclusiveAtDpcLevel(spinlock: Long): UInt =
    0u

public actual fun ExTryAcquireSpinLockSharedAtDpcLevel(spinlock: Long): UInt =
    0u

public actual fun ExTryConvertSharedSpinLockExclusive(spinlock: Long): UInt =
    0u

public actual fun ExTryToAcquireFastMutex(fastmutex: Long): Boolean =
    false

public actual fun ExUnregisterCallback(callbackregistration: Long) {
}

public actual fun ExUuidCreate(uuid: Long): NTSTATUS =
    0

public actual fun ExVerifySuite(suitetype: SUITE_TYPE): Boolean =
    false

public actual fun ExWaitForRundownProtectionRelease(runref: Long) {
}

public actual fun ExWaitForRundownProtectionReleaseCacheAware(runref: PEX_RUNDOWN_REF_CACHE_AWARE) {
}

public actual fun FsRtlIsTotalDeviceFailure(status: NTSTATUS): Boolean =
    false

public actual fun HalAcquireDisplayOwnership(resetdisplayparameters: PHAL_RESET_DISPLAY_PARAMETERS) {
}

public actual fun HalAllocateAdapterChannel(adapterobject: Long, wcb: Long, numberofmapregisters: UInt, executionroutine: DRIVER_CONTROL): NTSTATUS =
    0

public actual fun HalAllocateCommonBuffer(adapterobject: Long, length: UInt, logicaladdress: Long, cacheenabled: Boolean): Long =
    0L

public actual fun HalAllocateCrashDumpRegisters(adapterobject: Long, numberofmapregisters: Long): Long =
    0L

public actual fun HalAllocateHardwareCounters(groupaffinty: Long, groupcount: UInt, resourcelist: Long, countersethandle: Long): NTSTATUS =
    0

public actual fun HalAssignSlotResources(registrypath: Long, driverclassname: Long, driverobject: Long, deviceobject: Long, bustype: INTERFACE_TYPE, busnumber: UInt, slotnumber: UInt, allocatedresources: Long): NTSTATUS =
    0

public actual fun HalBugCheckSystem(errorsource: Long, errorrecord: Long) {
}

public actual fun HalDmaAllocateCrashDumpRegistersEx(adapter: Long, numberofmapregisters: UInt, type: HAL_DMA_CRASH_DUMP_REGISTER_TYPE, mapregisterbase: Long, mapregistersavailable: Long): NTSTATUS =
    0

public actual fun HalDmaFreeCrashDumpRegistersEx(adapter: Long, type: HAL_DMA_CRASH_DUMP_REGISTER_TYPE): NTSTATUS =
    0

public actual fun HalExamineMBR(deviceobject: Long, sectorsize: UInt, mbrtypeidentifier: UInt, buffer: Long) {
}

public actual fun HalFreeCommonBuffer(adapterobject: Long, length: UInt, logicaladdress: Long, virtualaddress: Long, cacheenabled: Boolean) {
}

public actual fun HalFreeHardwareCounters(countersethandle: HANDLE): NTSTATUS =
    0

public actual fun HalGetAdapter(devicedescription: Long, numberofmapregisters: Long): Long =
    0L

public actual fun HalGetBusData(busdatatype: BUS_DATA_TYPE, busnumber: UInt, slotnumber: UInt, buffer: Long, length: UInt): UInt =
    0u

public actual fun HalGetBusDataByOffset(busdatatype: BUS_DATA_TYPE, busnumber: UInt, slotnumber: UInt, buffer: Long, offset: UInt, length: UInt): UInt =
    0u

public actual fun HalGetInterruptVector(interfacetype: INTERFACE_TYPE, busnumber: UInt, businterruptlevel: UInt, businterruptvector: UInt, irql: Long, affinity: Long): UInt =
    0u

public actual fun HalMakeBeep(frequency: UInt): Boolean =
    false

public actual fun HalReadDmaCounter(adapterobject: Long): UInt =
    0u

public actual fun HalSetBusData(busdatatype: BUS_DATA_TYPE, busnumber: UInt, slotnumber: UInt, buffer: Long, length: UInt): UInt =
    0u

public actual fun HalSetBusDataByOffset(busdatatype: BUS_DATA_TYPE, busnumber: UInt, slotnumber: UInt, buffer: Long, offset: UInt, length: UInt): UInt =
    0u

public actual fun HalTranslateBusAddress(interfacetype: INTERFACE_TYPE, busnumber: UInt, busaddress: Long, addressspace: Long, translatedaddress: Long): Boolean =
    false

public actual fun HvlRegisterWheaErrorNotification(callback: PHVL_WHEA_ERROR_NOTIFICATION): NTSTATUS =
    0

public actual fun HvlUnregisterWheaErrorNotification(callback: PHVL_WHEA_ERROR_NOTIFICATION): NTSTATUS =
    0

public actual fun IoAcquireCancelSpinLock(irql: Long) {
}

public actual fun IoAcquireKsrPersistentMemory(driverobject: Long, physicaldeviceobject: Long, buffer: Long, size: Long): NTSTATUS =
    0

public actual fun IoAcquireKsrPersistentMemoryEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, datatag: Long, dataversion: Long, buffer: Long, size: Long): NTSTATUS =
    0

public actual fun IoAcquireRemoveLockEx(removelock: Long, tag: Long, file: PCSTR, line: UInt, remlocksize: UInt): NTSTATUS =
    0

public actual fun IoAllocateAdapterChannel(adapterobject: Long, deviceobject: Long, numberofmapregisters: UInt, executionroutine: DRIVER_CONTROL, context: Long): NTSTATUS =
    0

public actual fun IoAllocateController(controllerobject: Long, deviceobject: Long, executionroutine: DRIVER_CONTROL, context: Long) {
}

public actual fun IoAllocateDriverObjectExtension(driverobject: Long, clientidentificationaddress: Long, driverobjectextensionsize: UInt, driverobjectextension: Long): NTSTATUS =
    0

public actual fun IoAllocateErrorLogEntry(ioobject: Long, entrysize: UByte): Long =
    0L

public actual fun IoAllocateIrp(stacksize: Byte, chargequota: Boolean): Long =
    0L

public actual fun IoAllocateIrpEx(deviceobject: Long, stacksize: Byte, chargequota: Boolean): Long =
    0L

public actual fun IoAllocateMdl(virtualaddress: Long, length: UInt, secondarybuffer: Boolean, chargequota: Boolean, irp: Long): Long =
    0L

public actual fun IoAllocateSfioStreamIdentifier(fileobject: Long, length: UInt, signature: Long, streamidentifier: Long): NTSTATUS =
    0

public actual fun IoAllocateWorkItem(deviceobject: Long): PIO_WORKITEM =
    0L

public actual fun IoAssignResources(registrypath: Long, driverclassname: Long, driverobject: Long, deviceobject: Long, requestedresources: Long, allocatedresources: Long): NTSTATUS =
    0

public actual fun IoAttachDevice(sourcedevice: Long, targetdevice: Long, attacheddevice: Long): NTSTATUS =
    0

public actual fun IoAttachDeviceByPointer(sourcedevice: Long, targetdevice: Long): NTSTATUS =
    0

public actual fun IoAttachDeviceToDeviceStack(sourcedevice: Long, targetdevice: Long): Long =
    0L

public actual fun IoAttachDeviceToDeviceStackSafe(sourcedevice: Long, targetdevice: Long, attachedtodeviceobject: Long): NTSTATUS =
    0

public actual fun IoBuildAsynchronousFsdRequest(majorfunction: UInt, deviceobject: Long, buffer: Long, length: UInt, startingoffset: Long, iostatusblock: Long): Long =
    0L

public actual fun IoBuildDeviceIoControlRequest(iocontrolcode: UInt, deviceobject: Long, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, internaldeviceiocontrol: Boolean, event: Long, iostatusblock: Long): Long =
    0L

public actual fun IoBuildPartialMdl(sourcemdl: Long, targetmdl: Long, virtualaddress: Long, length: UInt) {
}

public actual fun IoBuildSynchronousFsdRequest(majorfunction: UInt, deviceobject: Long, buffer: Long, length: UInt, startingoffset: Long, event: Long, iostatusblock: Long): Long =
    0L

public actual fun IoCancelFileOpen(deviceobject: Long, fileobject: Long) {
}

public actual fun IoCancelIrp(irp: Long): Boolean =
    false

public actual fun IoCheckLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: UInt): NTSTATUS =
    0

public actual fun IoCheckShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long, update: Boolean): NTSTATUS =
    0

public actual fun IoCheckShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long, update: Boolean, writepermission: Long): NTSTATUS =
    0

public actual fun IoCleanupIrp(irp: Long) {
}

public actual fun IoClearActivityIdThread(originalid: Long) {
}

public actual fun IoClearIrpExtraCreateParameter(irp: Long) {
}

public actual fun IoConnectInterrupt(interruptobject: Long, serviceroutine: PKSERVICE_ROUTINE, servicecontext: Long, spinlock: Long, vector: UInt, irql: UByte, synchronizeirql: UByte, interruptmode: KINTERRUPT_MODE, sharevector: Boolean, processorenablemask: ULong, floatingsave: Boolean): NTSTATUS =
    0

public actual fun IoConnectInterruptEx(parameters: Long): NTSTATUS =
    0

public actual fun IoCreateController(size: UInt): Long =
    0L

public actual fun IoCreateDevice(driverobject: Long, deviceextensionsize: UInt, devicename: Long, devicetype: UInt, devicecharacteristics: UInt, exclusive: Boolean, deviceobject: Long): NTSTATUS =
    0

public actual fun IoCreateDisk(deviceobject: Long, disk: Long): NTSTATUS =
    0

public actual fun IoCreateFile(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, createfiletype: CREATE_FILE_TYPE, internalparameters: Long, options: UInt): NTSTATUS =
    0

public actual fun IoCreateFileEx(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, createfiletype: CREATE_FILE_TYPE, internalparameters: Long, options: UInt, drivercontext: Long): NTSTATUS =
    0

public actual fun IoCreateFileSpecifyDeviceObjectHint(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, createfiletype: CREATE_FILE_TYPE, internalparameters: Long, options: UInt, deviceobject: Long): NTSTATUS =
    0

public actual fun IoCreateNotificationEvent(eventname: Long, eventhandle: Long): Long =
    0L

public actual fun IoCreateSymbolicLink(symboliclinkname: Long, devicename: Long): NTSTATUS =
    0

public actual fun IoCreateSynchronizationEvent(eventname: Long, eventhandle: Long): Long =
    0L

public actual fun IoCreateSystemThread(ioobject: Long, threadhandle: Long, desiredaccess: UInt, objectattributes: Long, processhandle: HANDLE, clientid: Long, startroutine: PKSTART_ROUTINE, startcontext: Long): NTSTATUS =
    0

public actual fun IoCreateUnprotectedSymbolicLink(symboliclinkname: Long, devicename: Long): NTSTATUS =
    0

public actual fun IoCsqInitialize(csq: Long, csqinsertirp: PIO_CSQ_INSERT_IRP, csqremoveirp: PIO_CSQ_REMOVE_IRP, csqpeeknextirp: PIO_CSQ_PEEK_NEXT_IRP, csqacquirelock: PIO_CSQ_ACQUIRE_LOCK, csqreleaselock: PIO_CSQ_RELEASE_LOCK, csqcompletecanceledirp: PIO_CSQ_COMPLETE_CANCELED_IRP): NTSTATUS =
    0

public actual fun IoCsqInitializeEx(csq: Long, csqinsertirp: PIO_CSQ_INSERT_IRP_EX, csqremoveirp: PIO_CSQ_REMOVE_IRP, csqpeeknextirp: PIO_CSQ_PEEK_NEXT_IRP, csqacquirelock: PIO_CSQ_ACQUIRE_LOCK, csqreleaselock: PIO_CSQ_RELEASE_LOCK, csqcompletecanceledirp: PIO_CSQ_COMPLETE_CANCELED_IRP): NTSTATUS =
    0

public actual fun IoCsqInsertIrp(csq: Long, irp: Long, context: Long) {
}

public actual fun IoCsqInsertIrpEx(csq: Long, irp: Long, context: Long, insertcontext: Long): NTSTATUS =
    0

public actual fun IoCsqRemoveIrp(csq: Long, context: Long): Long =
    0L

public actual fun IoCsqRemoveNextIrp(csq: Long, peekcontext: Long): Long =
    0L

public actual fun IoDecrementKeepAliveCount(fileobject: Long, process: PEPROCESS): NTSTATUS =
    0

public actual fun IoDeleteController(controllerobject: Long) {
}

public actual fun IoDeleteDevice(deviceobject: Long) {
}

public actual fun IoDeleteSymbolicLink(symboliclinkname: Long): NTSTATUS =
    0

public actual fun IoDetachDevice(targetdevice: Long) {
}

public actual fun IoDisconnectInterrupt(interruptobject: PKINTERRUPT) {
}

public actual fun IoDisconnectInterruptEx(parameters: Long) {
}

public actual fun IoEnumerateKsrPersistentMemoryEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, callback: PIO_PERSISTED_MEMORY_ENUMERATION_CALLBACK, callbackcontext: Long): NTSTATUS =
    0

public actual fun IoFlushAdapterBuffers(adapterobject: Long, mdl: Long, mapregisterbase: Long, currentva: Long, length: UInt, writetodevice: Boolean): Boolean =
    false

public actual fun IoForwardIrpSynchronously(deviceobject: Long, irp: Long): Boolean =
    false

public actual fun IoFreeAdapterChannel(adapterobject: Long) {
}

public actual fun IoFreeController(controllerobject: Long) {
}

public actual fun IoFreeErrorLogEntry(elentry: Long) {
}

public actual fun IoFreeIrp(irp: Long) {
}

public actual fun IoFreeKsrPersistentMemory(datahandle: Long): NTSTATUS =
    0

public actual fun IoFreeMapRegisters(adapterobject: Long, mapregisterbase: Long, numberofmapregisters: UInt) {
}

public actual fun IoFreeMdl(mdl: Long) {
}

public actual fun IoFreeSfioStreamIdentifier(fileobject: Long, signature: Long): NTSTATUS =
    0

public actual fun IoFreeWorkItem(ioworkitem: PIO_WORKITEM) {
}

public actual fun IoGetActivityIdIrp(irp: Long, guid: Long): NTSTATUS =
    0

public actual fun IoGetActivityIdThread(): Long =
    0L

public actual fun IoGetAffinityInterrupt(interruptobject: PKINTERRUPT, groupaffinity: Long): NTSTATUS =
    0

public actual fun IoGetAttachedDeviceReference(deviceobject: Long): Long =
    0L

public actual fun IoGetBootDiskInformation(bootdiskinformation: Long, size: UInt): NTSTATUS =
    0

public actual fun IoGetBootDiskInformationLite(bootdiskinformation: Long): NTSTATUS =
    0

public actual fun IoGetConfigurationInformation(): Long =
    0L

public actual fun IoGetContainerInformation(informationclass: IO_CONTAINER_INFORMATION_CLASS, containerobject: Long, buffer: Long, bufferlength: UInt): NTSTATUS =
    0

public actual fun IoGetCurrentProcess(): PEPROCESS =
    0L

public actual fun IoGetDeviceDirectory(physicaldeviceobject: Long, directorytype: DEVICE_DIRECTORY_TYPE, flags: UInt, reserved: Long, devicedirectoryhandle: Long): NTSTATUS =
    0

public actual fun IoGetDeviceInterfaceAlias(symboliclinkname: Long, aliasinterfaceclassguid: Long, aliassymboliclinkname: Long): NTSTATUS =
    0

public actual fun IoGetDeviceInterfacePropertyData(symboliclinkname: Long, propertykey: Long, lcid: UInt, flags: UInt, size: UInt, data: Long, requiredsize: Long, type: Long): NTSTATUS =
    0

public actual fun IoGetDeviceInterfaces(interfaceclassguid: Long, physicaldeviceobject: Long, flags: UInt, symboliclinklist: Long): NTSTATUS =
    0

public actual fun IoGetDeviceNumaNode(pdo: Long, nodenumber: Long): NTSTATUS =
    0

public actual fun IoGetDeviceObjectPointer(objectname: Long, desiredaccess: UInt, fileobject: Long, deviceobject: Long): NTSTATUS =
    0

public actual fun IoGetDeviceProperty(deviceobject: Long, deviceproperty: DEVICE_REGISTRY_PROPERTY, bufferlength: UInt, propertybuffer: Long, resultlength: Long): NTSTATUS =
    0

public actual fun IoGetDevicePropertyData(pdo: Long, propertykey: Long, lcid: UInt, flags: UInt, size: UInt, data: Long, requiredsize: Long, type: Long): NTSTATUS =
    0

public actual fun IoGetDmaAdapter(physicaldeviceobject: Long, devicedescription: Long, numberofmapregisters: Long): Long =
    0L

public actual fun IoGetDriverDirectory(driverobject: Long, directorytype: DRIVER_DIRECTORY_TYPE, flags: UInt, driverdirectoryhandle: Long): NTSTATUS =
    0

public actual fun IoGetDriverObjectExtension(driverobject: Long, clientidentificationaddress: Long): Long =
    0L

public actual fun IoGetFileObjectGenericMapping(): Long =
    0L

public actual fun IoGetFsZeroingOffset(irp: Long, zeroingoffset: Long): NTSTATUS =
    0

public actual fun IoGetInitialStack(): Long =
    0L

public actual fun IoGetInitiatorProcess(fileobject: Long): PEPROCESS =
    0L

public actual fun IoGetIoAttributionHandle(irp: Long, ioattributionhandle: Long): NTSTATUS =
    0

public actual fun IoGetIoPriorityHint(irp: Long): IO_PRIORITY_HINT =
    0

public actual fun IoGetIommuInterface(version: UInt, interfaceout: Long): NTSTATUS =
    0

public actual fun IoGetIommuInterfaceEx(version: UInt, flags: ULong, interfaceout: Long): NTSTATUS =
    0

public actual fun IoGetIrpExtraCreateParameter(irp: Long, extracreateparameter: Long): NTSTATUS =
    0

public actual fun IoGetPagingIoPriority(irp: Long): IO_PAGING_PRIORITY =
    0

public actual fun IoGetRelatedDeviceObject(fileobject: Long): Long =
    0L

public actual fun IoGetSfioStreamIdentifier(fileobject: Long, signature: Long): Long =
    0L

public actual fun IoGetSilo(fileobject: Long): PESILO =
    0L

public actual fun IoGetSiloParameters(fileobject: Long): Long =
    0L

public actual fun IoGetStackLimits(lowlimit: Long, highlimit: Long) {
}

public actual fun IoGetTopLevelIrp(): Long =
    0L

public actual fun IoGetTransactionParameterBlock(fileobject: Long): Long =
    0L

public actual fun IoIncrementKeepAliveCount(fileobject: Long, process: PEPROCESS): NTSTATUS =
    0

public actual fun IoInitializeIrp(irp: Long, packetsize: UShort, stacksize: Byte) {
}

public actual fun IoInitializeIrpEx(irp: Long, deviceobject: Long, packetsize: UShort, stacksize: Byte) {
}

public actual fun IoInitializeRemoveLockEx(lock: Long, allocatetag: UInt, maxlockedminutes: UInt, highwatermark: UInt, remlocksize: UInt) {
}

public actual fun IoInitializeTimer(deviceobject: Long, timerroutine: PIO_TIMER_ROUTINE, context: Long): NTSTATUS =
    0

public actual fun IoInitializeWorkItem(ioobject: Long, ioworkitem: PIO_WORKITEM) {
}

public actual fun IoInvalidateDeviceRelations(deviceobject: Long, type: DEVICE_RELATION_TYPE) {
}

public actual fun IoInvalidateDeviceState(physicaldeviceobject: Long) {
}

public actual fun IoIs32bitProcess(irp: Long): Boolean =
    false

public actual fun IoIsFileObjectIgnoringSharing(fileobject: Long): Boolean =
    false

public actual fun IoIsFileOriginRemote(fileobject: Long): Boolean =
    false

public actual fun IoIsInitiator32bitProcess(irp: Long): Boolean =
    false

public actual fun IoIsValidIrpStatus(status: NTSTATUS): UInt =
    0u

public actual fun IoIsWdmVersionAvailable(majorversion: UByte, minorversion: UByte): Boolean =
    false

public actual fun IoMakeAssociatedIrp(irp: Long, stacksize: Byte): Long =
    0L

public actual fun IoMakeAssociatedIrpEx(irp: Long, deviceobject: Long, stacksize: Byte): Long =
    0L

public actual fun IoMapTransfer(adapterobject: Long, mdl: Long, mapregisterbase: Long, currentva: Long, length: Long, writetodevice: Boolean): Long =
    0L

public actual fun IoOpenDeviceInterfaceRegistryKey(symboliclinkname: Long, desiredaccess: UInt, deviceinterfaceregkey: Long): NTSTATUS =
    0

public actual fun IoOpenDeviceRegistryKey(deviceobject: Long, devinstkeytype: UInt, desiredaccess: UInt, deviceregkey: Long): NTSTATUS =
    0

public actual fun IoOpenDriverRegistryKey(driverobject: Long, regkeytype: DRIVER_REGKEY_TYPE, desiredaccess: UInt, flags: UInt, driverregkey: Long): NTSTATUS =
    0

public actual fun IoPropagateActivityIdToThread(irp: Long, propagatedid: Long, originalid: Long): NTSTATUS =
    0

public actual fun IoQueryDeviceDescription(bustype: Long, busnumber: Long, controllertype: Long, controllernumber: Long, peripheraltype: Long, peripheralnumber: Long, calloutroutine: PIO_QUERY_DEVICE_ROUTINE, context: Long): NTSTATUS =
    0

public actual fun IoQueryFullDriverPath(driverobject: Long, fullpath: Long): NTSTATUS =
    0

public actual fun IoQueryInformationByName(objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, options: UInt, drivercontext: Long): NTSTATUS =
    0

public actual fun IoQueryKsrPersistentMemorySize(driverobject: Long, physicaldeviceobject: Long, buffersize: Long): NTSTATUS =
    0

public actual fun IoQueryKsrPersistentMemorySizeEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, datatag: Long, dataversion: Long, buffersize: Long): NTSTATUS =
    0

public actual fun IoQueueWorkItem(ioworkitem: PIO_WORKITEM, workerroutine: PIO_WORKITEM_ROUTINE, queuetype: WORK_QUEUE_TYPE, context: Long) {
}

public actual fun IoQueueWorkItemEx(ioworkitem: PIO_WORKITEM, workerroutine: PIO_WORKITEM_ROUTINE_EX, queuetype: WORK_QUEUE_TYPE, context: Long) {
}

public actual fun IoRaiseHardError(irp: Long, vpb: Long, realdeviceobject: Long) {
}

public actual fun IoRaiseInformationalHardError(errorstatus: NTSTATUS, string: Long, thread: PKTHREAD): Boolean =
    false

public actual fun IoReadDiskSignature(deviceobject: Long, bytespersector: UInt, signature: Long): NTSTATUS =
    0

public actual fun IoReadPartitionTable(deviceobject: Long, sectorsize: UInt, returnrecognizedpartitions: Boolean, partitionbuffer: Long): NTSTATUS =
    0

public actual fun IoReadPartitionTableEx(deviceobject: Long, drivelayout: Long): NTSTATUS =
    0

public actual fun IoRecordIoAttribution(opaquehandle: Long, attributioninformation: Long): NTSTATUS =
    0

public actual fun IoRegisterBootDriverCallback(callbackfunction: PBOOT_DRIVER_CALLBACK_FUNCTION, callbackcontext: Long): Long =
    0L

public actual fun IoRegisterBootDriverReinitialization(driverobject: Long, driverreinitializationroutine: DRIVER_REINITIALIZE, context: Long) {
}

public actual fun IoRegisterContainerNotification(notificationclass: IO_CONTAINER_NOTIFICATION_CLASS, callbackfunction: PIO_CONTAINER_NOTIFICATION_FUNCTION, notificationinformation: Long, notificationinformationlength: UInt, callbackregistration: Long): NTSTATUS =
    0

public actual fun IoRegisterDeviceInterface(physicaldeviceobject: Long, interfaceclassguid: Long, referencestring: Long, symboliclinkname: Long): NTSTATUS =
    0

public actual fun IoRegisterDriverReinitialization(driverobject: Long, driverreinitializationroutine: DRIVER_REINITIALIZE, context: Long) {
}

public actual fun IoRegisterLastChanceShutdownNotification(deviceobject: Long): NTSTATUS =
    0

public actual fun IoRegisterPlugPlayNotification(eventcategory: IO_NOTIFICATION_EVENT_CATEGORY, eventcategoryflags: UInt, eventcategorydata: Long, driverobject: Long, callbackroutine: DRIVER_NOTIFICATION_CALLBACK_ROUTINE, context: Long, notificationentry: Long): NTSTATUS =
    0

public actual fun IoRegisterShutdownNotification(deviceobject: Long): NTSTATUS =
    0

public actual fun IoReleaseCancelSpinLock(irql: UByte) {
}

public actual fun IoReleaseRemoveLockAndWaitEx(removelock: Long, tag: Long, remlocksize: UInt) {
}

public actual fun IoReleaseRemoveLockEx(removelock: Long, tag: Long, remlocksize: UInt) {
}

public actual fun IoRemoveLinkShareAccess(fileobject: Long, shareaccess: Long, linkshareaccess: Long) {
}

public actual fun IoRemoveLinkShareAccessEx(fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: UInt) {
}

public actual fun IoRemoveShareAccess(fileobject: Long, shareaccess: Long) {
}

public actual fun IoReplacePartitionUnit(targetpdo: Long, sparepdo: Long, flags: UInt): NTSTATUS =
    0

public actual fun IoReportDetectedDevice(driverobject: Long, legacybustype: INTERFACE_TYPE, busnumber: UInt, slotnumber: UInt, resourcelist: Long, resourcerequirements: Long, resourceassigned: Boolean, deviceobject: Long): NTSTATUS =
    0

public actual fun IoReportInterruptActive(parameters: Long) {
}

public actual fun IoReportInterruptInactive(parameters: Long) {
}

public actual fun IoReportResourceForDetection(driverobject: Long, driverlist: Long, driverlistsize: UInt, deviceobject: Long, devicelist: Long, devicelistsize: UInt, conflictdetected: Long): NTSTATUS =
    0

public actual fun IoReportResourceUsage(driverclassname: Long, driverobject: Long, driverlist: Long, driverlistsize: UInt, deviceobject: Long, devicelist: Long, devicelistsize: UInt, overrideconflict: Boolean, conflictdetected: Long): NTSTATUS =
    0

public actual fun IoReportRootDevice(driverobject: Long): NTSTATUS =
    0

public actual fun IoReportTargetDeviceChange(physicaldeviceobject: Long, notificationstructure: Long): NTSTATUS =
    0

public actual fun IoReportTargetDeviceChangeAsynchronous(physicaldeviceobject: Long, notificationstructure: Long, callback: PDEVICE_CHANGE_COMPLETE_CALLBACK, context: Long): NTSTATUS =
    0

public actual fun IoRequestDeviceEject(physicaldeviceobject: Long) {
}

public actual fun IoRequestDeviceEjectEx(physicaldeviceobject: Long, callback: PIO_DEVICE_EJECT_CALLBACK, context: Long, driverobject: Long): NTSTATUS =
    0

public actual fun IoReserveKsrPersistentMemory(driverobject: Long, physicaldeviceobject: Long, size: ULong, flags: UInt, datahandle: Long): NTSTATUS =
    0

public actual fun IoReserveKsrPersistentMemoryEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, datatag: Long, dataversion: UInt, size: ULong, flags: UInt, datahandle: Long): NTSTATUS =
    0

public actual fun IoReuseIrp(irp: Long, iostatus: NTSTATUS) {
}

public actual fun IoSetActivityIdIrp(irp: Long, guid: Long): NTSTATUS =
    0

public actual fun IoSetActivityIdThread(activityid: Long): Long =
    0L

public actual fun IoSetCompletionRoutineEx(deviceobject: Long, irp: Long, completionroutine: PIO_COMPLETION_ROUTINE, context: Long, invokeonsuccess: Boolean, invokeonerror: Boolean, invokeoncancel: Boolean): NTSTATUS =
    0

public actual fun IoSetDeviceInterfacePropertyData(symboliclinkname: Long, propertykey: Long, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: Long): NTSTATUS =
    0

public actual fun IoSetDeviceInterfaceState(symboliclinkname: Long, enable: Boolean): NTSTATUS =
    0

public actual fun IoSetDevicePropertyData(pdo: Long, propertykey: Long, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: Long): NTSTATUS =
    0

public actual fun IoSetFileObjectIgnoreSharing(fileobject: Long): NTSTATUS =
    0

public actual fun IoSetFileOrigin(fileobject: Long, remote: Boolean): NTSTATUS =
    0

public actual fun IoSetFsZeroingOffset(irp: Long, zeroingoffset: UInt): NTSTATUS =
    0

public actual fun IoSetFsZeroingOffsetRequired(irp: Long): NTSTATUS =
    0

public actual fun IoSetHardErrorOrVerifyDevice(irp: Long, deviceobject: Long) {
}

public actual fun IoSetIoAttributionIrp(irp: Long, attributionsource: Long, flags: UInt): NTSTATUS =
    0

public actual fun IoSetIoPriorityHint(irp: Long, priorityhint: IO_PRIORITY_HINT): NTSTATUS =
    0

public actual fun IoSetIrpExtraCreateParameter(irp: Long, extracreateparameter: Long): NTSTATUS =
    0

public actual fun IoSetLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: UInt) {
}

public actual fun IoSetMasterIrpStatus(masterirp: Long, status: NTSTATUS) {
}

public actual fun IoSetPartitionInformation(deviceobject: Long, sectorsize: UInt, partitionnumber: UInt, partitiontype: UInt): NTSTATUS =
    0

public actual fun IoSetPartitionInformationEx(deviceobject: Long, partitionnumber: UInt, partitioninfo: Long): NTSTATUS =
    0

public actual fun IoSetShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long) {
}

public actual fun IoSetShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long, writepermission: Long) {
}

public actual fun IoSetStartIoAttributes(deviceobject: Long, deferredstartio: Boolean, noncancelable: Boolean) {
}

public actual fun IoSetSystemPartition(volumenamestring: Long): NTSTATUS =
    0

public actual fun IoSetThreadHardErrorMode(enableharderrors: Boolean): Boolean =
    false

public actual fun IoSetTopLevelIrp(irp: Long) {
}

public actual fun IoSizeOfIrpEx(deviceobject: Long, stacksize: Byte): UShort =
    0u

public actual fun IoSizeofWorkItem(): UInt =
    0u

public actual fun IoStartNextPacket(deviceobject: Long, cancelable: Boolean) {
}

public actual fun IoStartNextPacketByKey(deviceobject: Long, cancelable: Boolean, key: UInt) {
}

public actual fun IoStartPacket(deviceobject: Long, irp: Long, key: Long, cancelfunction: DRIVER_CANCEL) {
}

public actual fun IoStartTimer(deviceobject: Long) {
}

public actual fun IoStopTimer(deviceobject: Long) {
}

public actual fun IoSynchronousCallDriver(deviceobject: Long, irp: Long): NTSTATUS =
    0

public actual fun IoTransferActivityId(activityid: Long, relatedactivityid: Long) {
}

public actual fun IoTranslateBusAddress(interfacetype: INTERFACE_TYPE, busnumber: UInt, busaddress: Long, addressspace: Long, translatedaddress: Long): Boolean =
    false

public actual fun IoTryQueueWorkItem(ioworkitem: PIO_WORKITEM, workerroutine: PIO_WORKITEM_ROUTINE_EX, queuetype: WORK_QUEUE_TYPE, context: Long): Boolean =
    false

public actual fun IoUninitializeWorkItem(ioworkitem: PIO_WORKITEM) {
}

public actual fun IoUnregisterBootDriverCallback(callbackhandle: Long) {
}

public actual fun IoUnregisterContainerNotification(callbackregistration: Long) {
}

public actual fun IoUnregisterPlugPlayNotification(notificationentry: Long): NTSTATUS =
    0

public actual fun IoUnregisterPlugPlayNotificationEx(notificationentry: Long): NTSTATUS =
    0

public actual fun IoUnregisterShutdownNotification(deviceobject: Long) {
}

public actual fun IoUpdateLinkShareAccess(fileobject: Long, shareaccess: Long, linkshareaccess: Long) {
}

public actual fun IoUpdateLinkShareAccessEx(fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: UInt) {
}

public actual fun IoUpdateShareAccess(fileobject: Long, shareaccess: Long) {
}

public actual fun IoValidateDeviceIoControlAccess(irp: Long, requiredaccess: UInt): NTSTATUS =
    0

public actual fun IoVerifyPartitionTable(deviceobject: Long, fixerrors: Boolean): NTSTATUS =
    0

public actual fun IoVolumeDeviceNameToGuid(volumedevicename: Long, guid: Long): NTSTATUS =
    0

public actual fun IoVolumeDeviceNameToGuidPath(volumedevicename: Long, guidpath: Long): NTSTATUS =
    0

public actual fun IoVolumeDeviceToDosName(volumedeviceobject: Long, dosname: Long): NTSTATUS =
    0

public actual fun IoVolumeDeviceToGuid(volumedeviceobject: Long, guid: Long): NTSTATUS =
    0

public actual fun IoVolumeDeviceToGuidPath(volumedeviceobject: Long, guidpath: Long): NTSTATUS =
    0

public actual fun IoWMIAllocateInstanceIds(guid: Long, instancecount: UInt, firstinstanceid: Long): NTSTATUS =
    0

public actual fun IoWMIDeviceObjectToInstanceName(datablockobject: Long, deviceobject: Long, instancename: Long): NTSTATUS =
    0

public actual fun IoWMIExecuteMethod(datablockobject: Long, instancename: Long, methodid: UInt, inbuffersize: UInt, outbuffersize: Long, inoutbuffer: Long): NTSTATUS =
    0

public actual fun IoWMIHandleToInstanceName(datablockobject: Long, filehandle: HANDLE, instancename: Long): NTSTATUS =
    0

public actual fun IoWMIOpenBlock(guid: Long, desiredaccess: UInt, datablockobject: Long): NTSTATUS =
    0

public actual fun IoWMIQueryAllData(datablockobject: Long, inoutbuffersize: Long, outbuffer: Long): NTSTATUS =
    0

public actual fun IoWMIQueryAllDataMultiple(datablockobjectlist: Long, objectcount: UInt, inoutbuffersize: Long, outbuffer: Long): NTSTATUS =
    0

public actual fun IoWMIQuerySingleInstance(datablockobject: Long, instancename: Long, inoutbuffersize: Long, outbuffer: Long): NTSTATUS =
    0

public actual fun IoWMIQuerySingleInstanceMultiple(datablockobjectlist: Long, instancenames: Long, objectcount: UInt, inoutbuffersize: Long, outbuffer: Long): NTSTATUS =
    0

public actual fun IoWMIRegistrationControl(deviceobject: Long, action: UInt): NTSTATUS =
    0

public actual fun IoWMISetNotificationCallback(obj: Long, callback: WMI_NOTIFICATION_CALLBACK, context: Long): NTSTATUS =
    0

public actual fun IoWMISetSingleInstance(datablockobject: Long, instancename: Long, version: UInt, valuebuffersize: UInt, valuebuffer: Long): NTSTATUS =
    0

public actual fun IoWMISetSingleItem(datablockobject: Long, instancename: Long, dataitemid: UInt, version: UInt, valuebuffersize: UInt, valuebuffer: Long): NTSTATUS =
    0

public actual fun IoWMISuggestInstanceName(physicaldeviceobject: Long, symboliclinkname: Long, combinenames: Boolean, suggestedinstancename: Long): NTSTATUS =
    0

public actual fun IoWMIWriteEvent(wnodeeventitem: Long): NTSTATUS =
    0

public actual fun IoWithinStackLimits(regionstart: ULong, regionsize: ULong): UInt =
    0u

public actual fun IoWriteErrorLogEntry(elentry: Long) {
}

public actual fun IoWriteKsrPersistentMemory(datahandle: Long, buffer: Long, size: ULong): NTSTATUS =
    0

public actual fun IoWritePartitionTable(deviceobject: Long, sectorsize: UInt, sectorspertrack: UInt, numberofheads: UInt, partitionbuffer: Long): NTSTATUS =
    0

public actual fun IoWritePartitionTableEx(deviceobject: Long, drivelayout: Long): NTSTATUS =
    0

public actual fun IofCallDriver(deviceobject: Long, irp: Long): NTSTATUS =
    0

public actual fun IofCompleteRequest(irp: Long, priorityboost: Byte) {
}

public actual fun KdChangeOption(option: KD_OPTION, inbufferbytes: UInt, inbuffer: Long, outbufferbytes: UInt, outbuffer: Long, outbufferneeded: Long): NTSTATUS =
    0

public actual fun KdDisableDebugger(): NTSTATUS =
    0

public actual fun KdEnableDebugger(): NTSTATUS =
    0

public actual fun KdRefreshDebuggerNotPresent(): Boolean =
    false

public actual fun KeAcquireGuardedMutex(mutex: Long) {
}

public actual fun KeAcquireGuardedMutexUnsafe(fastmutex: Long) {
}

public actual fun KeAcquireInStackQueuedSpinLock(spinlock: Long, lockhandle: Long) {
}

public actual fun KeAcquireInStackQueuedSpinLockAtDpcLevel(spinlock: Long, lockhandle: Long) {
}

public actual fun KeAcquireInStackQueuedSpinLockForDpc(spinlock: Long, lockhandle: Long) {
}

public actual fun KeAcquireInterruptSpinLock(interrupt: PKINTERRUPT): UByte =
    0u

public actual fun KeAcquireSpinLockForDpc(spinlock: Long): UByte =
    0u

public actual fun KeAddTriageDumpDataBlock(ktriagedumpdataarray: Long, address: Long, size: ULong): NTSTATUS =
    0

public actual fun KeAreAllApcsDisabled(): Boolean =
    false

public actual fun KeAreApcsDisabled(): Boolean =
    false

public actual fun KeBugCheck(bugcheckcode: BUGCHECK_ERROR) {
}

public actual fun KeBugCheckEx(bugcheckcode: BUGCHECK_ERROR, bugcheckparameter1: ULong, bugcheckparameter2: ULong, bugcheckparameter3: ULong, bugcheckparameter4: ULong) {
}

public actual fun KeCancelTimer(param0: Long): Boolean =
    false

public actual fun KeClearEvent(event: Long) {
}

public actual fun KeConvertAuxiliaryCounterToPerformanceCounter(auxiliarycountervalue: ULong, performancecountervalue: Long, conversionerror: Long): NTSTATUS =
    0

public actual fun KeConvertPerformanceCounterToAuxiliaryCounter(performancecountervalue: ULong, auxiliarycountervalue: Long, conversionerror: Long): NTSTATUS =
    0

public actual fun KeDelayExecutionThread(waitmode: Byte, alertable: Boolean, interval: Long): NTSTATUS =
    0

public actual fun KeDeregisterBoundCallback(handle: Long): NTSTATUS =
    0

public actual fun KeDeregisterBugCheckCallback(callbackrecord: Long): Boolean =
    false

public actual fun KeDeregisterBugCheckReasonCallback(callbackrecord: Long): Boolean =
    false

public actual fun KeDeregisterNmiCallback(handle: Long): NTSTATUS =
    0

public actual fun KeDeregisterProcessorChangeCallback(callbackhandle: Long) {
}

public actual fun KeEnterCriticalRegion() {
}

public actual fun KeEnterGuardedRegion() {
}

public actual fun KeExpandKernelStackAndCallout(callout: PEXPAND_STACK_CALLOUT, parameter: Long, size: ULong): NTSTATUS =
    0

public actual fun KeExpandKernelStackAndCalloutEx(callout: PEXPAND_STACK_CALLOUT, parameter: Long, size: ULong, wait: Boolean, context: Long): NTSTATUS =
    0

public actual fun KeFlushIoBuffers(mdl: Long, readoperation: Boolean, dmaoperation: Boolean) {
}

public actual fun KeFlushQueuedDpcs() {
}

public actual fun KeFlushWriteBuffer() {
}

public actual fun KeGetCurrentIrql(): UByte =
    0u

public actual fun KeGetCurrentNodeNumber(): UShort =
    0u

public actual fun KeGetCurrentProcessorNumberEx(procnumber: Long): UInt =
    0u

public actual fun KeGetProcessorIndexFromNumber(procnumber: Long): UInt =
    0u

public actual fun KeGetProcessorNumberFromIndex(procindex: UInt, procnumber: Long): NTSTATUS =
    0

public actual fun KeGetRecommendedSharedDataAlignment(): UInt =
    0u

public actual fun KeInitializeCrashDumpHeader(dumptype: UInt, flags: UInt, buffer: Long, buffersize: UInt, bufferneeded: Long): NTSTATUS =
    0

public actual fun KeInitializeDeviceQueue(devicequeue: Long) {
}

public actual fun KeInitializeDpc(dpc: Long, deferredroutine: PKDEFERRED_ROUTINE, deferredcontext: Long) {
}

public actual fun KeInitializeEvent(event: Long, type: EVENT_TYPE, state: Boolean) {
}

public actual fun KeInitializeGuardedMutex(mutex: Long) {
}

public actual fun KeInitializeMutex(mutex: Long, level: UInt) {
}

public actual fun KeInitializeSemaphore(semaphore: Long, count: Int, limit: Int) {
}

public actual fun KeInitializeSpinLock(spinlock: Long) {
}

public actual fun KeInitializeThreadedDpc(dpc: Long, deferredroutine: PKDEFERRED_ROUTINE, deferredcontext: Long) {
}

public actual fun KeInitializeTimer(timer: Long) {
}

public actual fun KeInitializeTimerEx(timer: Long, type: TIMER_TYPE) {
}

public actual fun KeInitializeTriageDumpDataArray(ktriagedumpdataarray: Long, size: UInt): NTSTATUS =
    0

public actual fun KeInsertByKeyDeviceQueue(devicequeue: Long, devicequeueentry: Long, sortkey: UInt): Boolean =
    false

public actual fun KeInsertDeviceQueue(devicequeue: Long, devicequeueentry: Long): Boolean =
    false

public actual fun KeInsertQueueDpc(dpc: Long, systemargument1: Long, systemargument2: Long): Boolean =
    false

public actual fun KeInvalidateAllCaches(): Boolean =
    false

public actual fun KeInvalidateRangeAllCaches(baseaddress: Long, length: UInt) {
}

public actual fun KeIpiGenericCall(broadcastfunction: PKIPI_BROADCAST_WORKER, context: ULong): ULong =
    0uL

public actual fun KeIsExecutingDpc(): UInt =
    0u

public actual fun KeLeaveCriticalRegion() {
}

public actual fun KeLeaveGuardedRegion() {
}

public actual fun KePulseEvent(event: Long, increment: Int, wait: Boolean): Int =
    0

public actual fun KeQueryActiveGroupCount(): UShort =
    0u

public actual fun KeQueryActiveProcessorCount(activeprocessors: Long): UInt =
    0u

public actual fun KeQueryActiveProcessorCountEx(groupnumber: UShort): UInt =
    0u

public actual fun KeQueryActiveProcessors(): ULong =
    0uL

public actual fun KeQueryAuxiliaryCounterFrequency(auxiliarycounterfrequency: Long): NTSTATUS =
    0

public actual fun KeQueryDpcWatchdogInformation(watchdoginformation: Long): NTSTATUS =
    0

public actual fun KeQueryGroupAffinity(groupnumber: UShort): ULong =
    0uL

public actual fun KeQueryHardwareCounterConfiguration(counterarray: Long, maximumcount: UInt, count: Long): NTSTATUS =
    0

public actual fun KeQueryHighestNodeNumber(): UShort =
    0u

public actual fun KeQueryInterruptTimePrecise(qpctimestamp: Long): ULong =
    0uL

public actual fun KeQueryLogicalProcessorRelationship(processornumber: Long, relationshiptype: LOGICAL_PROCESSOR_RELATIONSHIP, information: Long, length: Long): NTSTATUS =
    0

public actual fun KeQueryMaximumGroupCount(): UShort =
    0u

public actual fun KeQueryMaximumProcessorCount(): UInt =
    0u

public actual fun KeQueryMaximumProcessorCountEx(groupnumber: UShort): UInt =
    0u

public actual fun KeQueryNodeActiveAffinity(nodenumber: UShort, affinity: Long, count: Long) {
}

public actual fun KeQueryNodeActiveAffinity2(nodenumber: UShort, groupaffinities: Long, groupaffinitiescount: UShort, groupaffinitiesrequired: Long): NTSTATUS =
    0

public actual fun KeQueryNodeActiveProcessorCount(nodenumber: UShort): UInt =
    0u

public actual fun KeQueryNodeMaximumProcessorCount(nodenumber: UShort): UShort =
    0u

public actual fun KeQueryPerformanceCounter(performancefrequency: Long): Long =
    0L

public actual fun KeQueryPriorityThread(thread: PKTHREAD): Int =
    0

public actual fun KeQueryRuntimeThread(thread: PKTHREAD, usertime: Long): UInt =
    0u

public actual fun KeQuerySystemTimePrecise(currenttime: Long) {
}

public actual fun KeQueryTimeIncrement(): UInt =
    0u

public actual fun KeQueryTotalCycleTimeThread(thread: PKTHREAD, cycletimestamp: Long): ULong =
    0uL

public actual fun KeQueryUnbiasedInterruptTime(): ULong =
    0uL

public actual fun KeQueryUnbiasedInterruptTimePrecise(qpctimestamp: Long): ULong =
    0uL

public actual fun KeReadStateEvent(event: Long): Int =
    0

public actual fun KeReadStateMutex(mutex: Long): Int =
    0

public actual fun KeReadStateSemaphore(semaphore: Long): Int =
    0

public actual fun KeReadStateTimer(timer: Long): Boolean =
    false

public actual fun KeRegisterBoundCallback(callbackroutine: PBOUND_CALLBACK): Long =
    0L

public actual fun KeRegisterBugCheckCallback(callbackrecord: Long, callbackroutine: PKBUGCHECK_CALLBACK_ROUTINE, buffer: Long, length: UInt, component: Long): Boolean =
    false

public actual fun KeRegisterBugCheckReasonCallback(callbackrecord: Long, callbackroutine: PKBUGCHECK_REASON_CALLBACK_ROUTINE, reason: KBUGCHECK_CALLBACK_REASON, component: Long): Boolean =
    false

public actual fun KeRegisterNmiCallback(callbackroutine: PNMI_CALLBACK, context: Long): Long =
    0L

public actual fun KeRegisterProcessorChangeCallback(callbackfunction: PPROCESSOR_CALLBACK_FUNCTION, callbackcontext: Long, flags: UInt): Long =
    0L

public actual fun KeReleaseGuardedMutex(mutex: Long) {
}

public actual fun KeReleaseGuardedMutexUnsafe(fastmutex: Long) {
}

public actual fun KeReleaseInStackQueuedSpinLock(lockhandle: Long) {
}

public actual fun KeReleaseInStackQueuedSpinLockForDpc(lockhandle: Long) {
}

public actual fun KeReleaseInStackQueuedSpinLockFromDpcLevel(lockhandle: Long) {
}

public actual fun KeReleaseInterruptSpinLock(interrupt: PKINTERRUPT, oldirql: UByte) {
}

public actual fun KeReleaseMutex(mutex: Long, wait: Boolean): Int =
    0

public actual fun KeReleaseSemaphore(semaphore: Long, increment: Int, adjustment: Int, wait: Boolean): Int =
    0

public actual fun KeReleaseSpinLockForDpc(spinlock: Long, oldirql: UByte) {
}

public actual fun KeRemoveByKeyDeviceQueue(devicequeue: Long, sortkey: UInt): Long =
    0L

public actual fun KeRemoveByKeyDeviceQueueIfBusy(devicequeue: Long, sortkey: UInt): Long =
    0L

public actual fun KeRemoveDeviceQueue(devicequeue: Long): Long =
    0L

public actual fun KeRemoveEntryDeviceQueue(devicequeue: Long, devicequeueentry: Long): Boolean =
    false

public actual fun KeRemoveQueueDpc(dpc: Long): Boolean =
    false

public actual fun KeRemoveQueueDpcEx(dpc: Long, waitifactive: Boolean): Boolean =
    false

public actual fun KeResetEvent(event: Long): Int =
    0

public actual fun KeRestoreExtendedProcessorState(xstatesave: Long) {
}

public actual fun KeRevertToUserAffinityThread() {
}

public actual fun KeRevertToUserAffinityThreadEx(affinity: ULong) {
}

public actual fun KeRevertToUserGroupAffinityThread(previousaffinity: Long) {
}

public actual fun KeSaveExtendedProcessorState(mask: ULong, xstatesave: Long): NTSTATUS =
    0

public actual fun KeSetBasePriorityThread(thread: PKTHREAD, increment: Int): Int =
    0

public actual fun KeSetCoalescableTimer(timer: Long, duetime: Long, period: UInt, tolerabledelay: UInt, dpc: Long): Boolean =
    false

public actual fun KeSetEvent(event: Long, increment: Int, wait: Boolean): Int =
    0

public actual fun KeSetHardwareCounterConfiguration(counterarray: Long, count: UInt): NTSTATUS =
    0

public actual fun KeSetImportanceDpc(dpc: Long, importance: KDPC_IMPORTANCE) {
}

public actual fun KeSetPriorityThread(thread: PKTHREAD, priority: Int): Int =
    0

public actual fun KeSetSystemAffinityThread(affinity: ULong) {
}

public actual fun KeSetSystemAffinityThreadEx(affinity: ULong): ULong =
    0uL

public actual fun KeSetSystemGroupAffinityThread(affinity: Long, previousaffinity: Long) {
}

public actual fun KeSetTargetProcessorDpc(dpc: Long, number: Byte) {
}

public actual fun KeSetTargetProcessorDpcEx(dpc: Long, procnumber: Long): NTSTATUS =
    0

public actual fun KeSetTimer(timer: Long, duetime: Long, dpc: Long): Boolean =
    false

public actual fun KeSetTimerEx(timer: Long, duetime: Long, period: Int, dpc: Long): Boolean =
    false

public actual fun KeShouldYieldProcessor(): UInt =
    0u

public actual fun KeStallExecutionProcessor(microseconds: UInt) {
}

public actual fun KeSynchronizeExecution(interrupt: PKINTERRUPT, synchronizeroutine: PKSYNCHRONIZE_ROUTINE, synchronizecontext: Long): Boolean =
    false

public actual fun KeTestSpinLock(spinlock: Long): Boolean =
    false

public actual fun KeTryToAcquireGuardedMutex(mutex: Long): Boolean =
    false

public actual fun KeTryToAcquireSpinLockAtDpcLevel(spinlock: Long): Boolean =
    false

public actual fun KeWaitForMultipleObjects(count: UInt, obj: Long, waittype: WAIT_TYPE, waitreason: KWAIT_REASON, waitmode: Byte, alertable: Boolean, timeout: Long, waitblockarray: Long): NTSTATUS =
    0

public actual fun KeWaitForSingleObject(obj: Long, waitreason: KWAIT_REASON, waitmode: Byte, alertable: Boolean, timeout: Long): NTSTATUS =
    0

public actual fun KfRaiseIrql(newirql: UByte): UByte =
    0u

public actual fun MmAddPhysicalMemory(startaddress: Long, numberofbytes: Long): NTSTATUS =
    0

public actual fun MmAddVerifierSpecialThunks(entryroutine: ULong, thunkbuffer: Long, thunkbuffersize: UInt): NTSTATUS =
    0

public actual fun MmAddVerifierThunks(thunkbuffer: Long, thunkbuffersize: UInt): NTSTATUS =
    0

public actual fun MmAdvanceMdl(mdl: Long, numberofbytes: UInt): NTSTATUS =
    0

public actual fun MmAllocateContiguousMemory(numberofbytes: ULong, highestacceptableaddress: Long): Long =
    0L

public actual fun MmAllocateContiguousMemoryEx(numberofbytes: Long, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, preferrednode: UInt, protect: UInt, partitionobject: Long, tag: UInt, flags: UInt, baseaddress: Long): NTSTATUS =
    0

public actual fun MmAllocateContiguousMemorySpecifyCache(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MEMORY_CACHING_TYPE): Long =
    0L

public actual fun MmAllocateContiguousMemorySpecifyCacheNode(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MEMORY_CACHING_TYPE, preferrednode: UInt): Long =
    0L

public actual fun MmAllocateContiguousNodeMemory(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, protect: UInt, preferrednode: UInt): Long =
    0L

public actual fun MmAllocateMappingAddress(numberofbytes: ULong, pooltag: UInt): Long =
    0L

public actual fun MmAllocateMappingAddressEx(numberofbytes: ULong, pooltag: UInt, flags: UInt): Long =
    0L

public actual fun MmAllocateMdlForIoSpace(physicaladdresslist: Long, numberofentries: ULong, newmdl: Long): NTSTATUS =
    0

public actual fun MmAllocateNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MEMORY_CACHING_TYPE, idealnode: UInt, flags: UInt): Long =
    0L

public actual fun MmAllocateNonCachedMemory(numberofbytes: ULong): Long =
    0L

public actual fun MmAllocatePagesForMdl(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong): Long =
    0L

public actual fun MmAllocatePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MEMORY_CACHING_TYPE, flags: UInt): Long =
    0L

public actual fun MmAllocatePartitionNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MEMORY_CACHING_TYPE, idealnode: UInt, flags: UInt, partitionobject: Long): Long =
    0L

public actual fun MmAreMdlPagesCached(memorydescriptorlist: Long): UInt =
    0u

public actual fun MmBuildMdlForNonPagedPool(memorydescriptorlist: Long) {
}

public actual fun MmCopyMemory(targetaddress: Long, sourceaddress: MM_COPY_ADDRESS, numberofbytes: ULong, flags: UInt, numberofbytestransferred: Long): NTSTATUS =
    0

public actual fun MmCreateMdl(memorydescriptorlist: Long, base: Long, length: ULong): Long =
    0L

public actual fun MmCreateMirror(): NTSTATUS =
    0

public actual fun MmFreeContiguousMemory(baseaddress: Long) {
}

public actual fun MmFreeContiguousMemorySpecifyCache(baseaddress: Long, numberofbytes: ULong, cachetype: MEMORY_CACHING_TYPE) {
}

public actual fun MmFreeMappingAddress(baseaddress: Long, pooltag: UInt) {
}

public actual fun MmFreeNonCachedMemory(baseaddress: Long, numberofbytes: ULong) {
}

public actual fun MmFreePagesFromMdl(memorydescriptorlist: Long) {
}

public actual fun MmFreePagesFromMdlEx(memorydescriptorlist: Long, flags: UInt) {
}

public actual fun MmGetCacheAttribute(physicaladdress: Long, cachetype: Long): NTSTATUS =
    0

public actual fun MmGetCacheAttributeEx(physicaladdress: Long, flags: UInt, cachetype: Long): NTSTATUS =
    0

public actual fun MmGetPhysicalAddress(baseaddress: Long): Long =
    0L

public actual fun MmGetPhysicalMemoryRanges(): Long =
    0L

public actual fun MmGetPhysicalMemoryRangesEx(partitionobject: Long): Long =
    0L

public actual fun MmGetPhysicalMemoryRangesEx2(partitionobject: Long, flags: UInt): Long =
    0L

public actual fun MmGetSystemRoutineAddress(systemroutinename: Long): Long =
    0L

public actual fun MmGetVirtualForPhysical(physicaladdress: Long): Long =
    0L

public actual fun MmIsAddressValid(virtualaddress: Long): Boolean =
    false

public actual fun MmIsDriverSuspectForVerifier(driverobject: Long): UInt =
    0u

public actual fun MmIsDriverVerifying(driverobject: Long): UInt =
    0u

public actual fun MmIsDriverVerifyingByAddress(addresswithinsection: Long): UInt =
    0u

public actual fun MmIsIoSpaceActive(startaddress: Long, numberofbytes: ULong): UInt =
    0u

public actual fun MmIsNonPagedSystemAddressValid(virtualaddress: Long): Boolean =
    false

public actual fun MmIsThisAnNtAsSystem(): Boolean =
    false

public actual fun MmIsVerifierEnabled(verifierflags: Long): NTSTATUS =
    0

public actual fun MmLockPagableDataSection(addresswithinsection: Long): Long =
    0L

public actual fun MmLockPagableSectionByHandle(imagesectionhandle: Long) {
}

public actual fun MmMapIoSpace(physicaladdress: Long, numberofbytes: ULong, cachetype: MEMORY_CACHING_TYPE): Long =
    0L

public actual fun MmMapIoSpaceEx(physicaladdress: Long, numberofbytes: ULong, protect: UInt): Long =
    0L

public actual fun MmMapLockedPages(memorydescriptorlist: Long, accessmode: Byte): Long =
    0L

public actual fun MmMapLockedPagesSpecifyCache(memorydescriptorlist: Long, accessmode: Byte, cachetype: MEMORY_CACHING_TYPE, requestedaddress: Long, bugcheckonfailure: UInt, priority: UInt): Long =
    0L

public actual fun MmMapLockedPagesWithReservedMapping(mappingaddress: Long, pooltag: UInt, memorydescriptorlist: Long, cachetype: MEMORY_CACHING_TYPE): Long =
    0L

public actual fun MmMapMdl(memorydescriptorlist: Long, protection: UInt, driverroutine: PMM_MDL_ROUTINE, drivercontext: Long): NTSTATUS =
    0

public actual fun MmMapMemoryDumpMdlEx(va: Long, pagetotal: UInt, memorydumpmdl: Long, flags: UInt): NTSTATUS =
    0

public actual fun MmMapUserAddressesToPage(baseaddress: Long, numberofbytes: ULong, pageaddress: Long): NTSTATUS =
    0

public actual fun MmMapVideoDisplay(physicaladdress: Long, numberofbytes: ULong, cachetype: MEMORY_CACHING_TYPE): Long =
    0L

public actual fun MmMapViewInSessionSpace(section: Long, mappedbase: Long, viewsize: Long): NTSTATUS =
    0

public actual fun MmMapViewInSessionSpaceEx(section: Long, mappedbase: Long, viewsize: Long, sectionoffset: Long, flags: ULong): NTSTATUS =
    0

public actual fun MmMapViewInSystemSpace(section: Long, mappedbase: Long, viewsize: Long): NTSTATUS =
    0

public actual fun MmMapViewInSystemSpaceEx(section: Long, mappedbase: Long, viewsize: Long, sectionoffset: Long, flags: ULong): NTSTATUS =
    0

public actual fun MmMdlPageContentsState(memorydescriptorlist: Long, state: MM_MDL_PAGE_CONTENTS_STATE): MM_MDL_PAGE_CONTENTS_STATE =
    0

public actual fun MmPageEntireDriver(addresswithinsection: Long): Long =
    0L

public actual fun MmProbeAndLockPages(memorydescriptorlist: Long, accessmode: Byte, operation: LOCK_OPERATION) {
}

public actual fun MmProbeAndLockProcessPages(memorydescriptorlist: Long, process: PEPROCESS, accessmode: Byte, operation: LOCK_OPERATION) {
}

public actual fun MmProbeAndLockSelectedPages(memorydescriptorlist: Long, segmentarray: Long, accessmode: Byte, operation: LOCK_OPERATION) {
}

public actual fun MmProtectDriverSection(addresswithinsection: Long, size: ULong, flags: UInt): NTSTATUS =
    0

public actual fun MmProtectMdlSystemAddress(memorydescriptorlist: Long, newprotect: UInt): NTSTATUS =
    0

public actual fun MmQuerySystemSize(): MM_SYSTEMSIZE =
    0

public actual fun MmRemovePhysicalMemory(startaddress: Long, numberofbytes: Long): NTSTATUS =
    0

public actual fun MmResetDriverPaging(addresswithinsection: Long) {
}

public actual fun MmRotatePhysicalView(virtualaddress: Long, numberofbytes: Long, newmdl: Long, direction: MM_ROTATE_DIRECTION, copyfunction: PMM_ROTATE_COPY_CALLBACK_FUNCTION, context: Long): NTSTATUS =
    0

public actual fun MmSecureVirtualMemory(address: Long, size: ULong, probemode: UInt): HANDLE =
    0L

public actual fun MmSecureVirtualMemoryEx(address: Long, size: ULong, probemode: UInt, flags: UInt): HANDLE =
    0L

public actual fun MmSetPermanentCacheAttribute(startaddress: Long, numberofbytes: Long, cachetype: MEMORY_CACHING_TYPE, flags: UInt): NTSTATUS =
    0

public actual fun MmSizeOfMdl(base: Long, length: ULong): ULong =
    0uL

public actual fun MmUnlockPagableImageSection(imagesectionhandle: Long) {
}

public actual fun MmUnlockPages(memorydescriptorlist: Long) {
}

public actual fun MmUnmapIoSpace(baseaddress: Long, numberofbytes: ULong) {
}

public actual fun MmUnmapLockedPages(baseaddress: Long, memorydescriptorlist: Long) {
}

public actual fun MmUnmapReservedMapping(baseaddress: Long, pooltag: UInt, memorydescriptorlist: Long) {
}

public actual fun MmUnmapVideoDisplay(baseaddress: Long, numberofbytes: ULong) {
}

public actual fun MmUnmapViewInSessionSpace(mappedbase: Long): NTSTATUS =
    0

public actual fun MmUnmapViewInSystemSpace(mappedbase: Long): NTSTATUS =
    0

public actual fun MmUnsecureVirtualMemory(securehandle: HANDLE) {
}

public actual fun NtAllocateLocallyUniqueId(luid: Long): NTSTATUS =
    0

public actual fun NtCommitComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun NtCommitEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun NtCommitTransaction(transactionhandle: HANDLE, wait: Boolean): NTSTATUS =
    0

public actual fun NtCreateEnlistment(enlistmenthandle: Long, desiredaccess: UInt, resourcemanagerhandle: HANDLE, transactionhandle: HANDLE, objectattributes: Long, createoptions: UInt, notificationmask: UInt, enlistmentkey: Long): NTSTATUS =
    0

public actual fun NtCreateResourceManager(resourcemanagerhandle: Long, desiredaccess: UInt, tmhandle: HANDLE, rmguid: Long, objectattributes: Long, createoptions: UInt, description: Long): NTSTATUS =
    0

public actual fun NtCreateTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, uow: Long, tmhandle: HANDLE, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: Long, description: Long): NTSTATUS =
    0

public actual fun NtCreateTransactionManager(tmhandle: Long, desiredaccess: UInt, objectattributes: Long, logfilename: Long, createoptions: UInt, commitstrength: UInt): NTSTATUS =
    0

public actual fun NtDisplayString(string: Long): NTSTATUS =
    0

public actual fun NtEnumerateTransactionObject(rootobjecthandle: HANDLE, querytype: KTMOBJECT_TYPE, objectcursor: Long, objectcursorlength: UInt, returnlength: Long): NTSTATUS =
    0

public actual fun NtGetNotificationResourceManager(resourcemanagerhandle: HANDLE, transactionnotification: Long, notificationlength: UInt, timeout: Long, returnlength: Long, asynchronous: UInt, asynchronouscontext: ULong): NTSTATUS =
    0

public actual fun NtLoadDriver(driverservicename: Long): NTSTATUS =
    0

public actual fun NtMakeTemporaryObject(handle: HANDLE): NTSTATUS =
    0

public actual fun NtManagePartition(targethandle: HANDLE, sourcehandle: HANDLE, partitioninformationclass: PARTITION_INFORMATION_CLASS, partitioninformation: Long, partitioninformationlength: UInt): NTSTATUS =
    0

public actual fun NtOpenEnlistment(enlistmenthandle: Long, desiredaccess: UInt, resourcemanagerhandle: HANDLE, enlistmentguid: Long, objectattributes: Long): NTSTATUS =
    0

public actual fun NtOpenResourceManager(resourcemanagerhandle: Long, desiredaccess: UInt, tmhandle: HANDLE, resourcemanagerguid: Long, objectattributes: Long): NTSTATUS =
    0

public actual fun NtOpenTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, uow: Long, tmhandle: HANDLE): NTSTATUS =
    0

public actual fun NtOpenTransactionManager(tmhandle: Long, desiredaccess: UInt, objectattributes: Long, logfilename: Long, tmidentity: Long, openoptions: UInt): NTSTATUS =
    0

public actual fun NtPowerInformation(informationlevel: POWER_INFORMATION_LEVEL, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS =
    0

public actual fun NtPrePrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun NtPrePrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun NtPrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun NtPrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun NtPropagationComplete(resourcemanagerhandle: HANDLE, requestcookie: UInt, bufferlength: UInt, buffer: Long): NTSTATUS =
    0

public actual fun NtPropagationFailed(resourcemanagerhandle: HANDLE, requestcookie: UInt, propstatus: NTSTATUS): NTSTATUS =
    0

public actual fun NtQueryInformationEnlistment(enlistmenthandle: HANDLE, enlistmentinformationclass: ENLISTMENT_INFORMATION_CLASS, enlistmentinformation: Long, enlistmentinformationlength: UInt, returnlength: Long): NTSTATUS =
    0

public actual fun NtQueryInformationResourceManager(resourcemanagerhandle: HANDLE, resourcemanagerinformationclass: RESOURCEMANAGER_INFORMATION_CLASS, resourcemanagerinformation: Long, resourcemanagerinformationlength: UInt, returnlength: Long): NTSTATUS =
    0

public actual fun NtQueryInformationTransaction(transactionhandle: HANDLE, transactioninformationclass: TRANSACTION_INFORMATION_CLASS, transactioninformation: Long, transactioninformationlength: UInt, returnlength: Long): NTSTATUS =
    0

public actual fun NtQueryInformationTransactionManager(transactionmanagerhandle: HANDLE, transactionmanagerinformationclass: TRANSACTIONMANAGER_INFORMATION_CLASS, transactionmanagerinformation: Long, transactionmanagerinformationlength: UInt, returnlength: Long): NTSTATUS =
    0

public actual fun NtReadOnlyEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun NtRecoverEnlistment(enlistmenthandle: HANDLE, enlistmentkey: Long): NTSTATUS =
    0

public actual fun NtRecoverResourceManager(resourcemanagerhandle: HANDLE): NTSTATUS =
    0

public actual fun NtRecoverTransactionManager(transactionmanagerhandle: HANDLE): NTSTATUS =
    0

public actual fun NtRegisterProtocolAddressInformation(resourcemanager: HANDLE, protocolid: Long, protocolinformationsize: UInt, protocolinformation: Long, createoptions: UInt): NTSTATUS =
    0

public actual fun NtRenameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): NTSTATUS =
    0

public actual fun NtRollbackComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun NtRollbackEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun NtRollbackTransaction(transactionhandle: HANDLE, wait: Boolean): NTSTATUS =
    0

public actual fun NtRollforwardTransactionManager(transactionmanagerhandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun NtSetInformationEnlistment(enlistmenthandle: HANDLE, enlistmentinformationclass: ENLISTMENT_INFORMATION_CLASS, enlistmentinformation: Long, enlistmentinformationlength: UInt): NTSTATUS =
    0

public actual fun NtSetInformationResourceManager(resourcemanagerhandle: HANDLE, resourcemanagerinformationclass: RESOURCEMANAGER_INFORMATION_CLASS, resourcemanagerinformation: Long, resourcemanagerinformationlength: UInt): NTSTATUS =
    0

public actual fun NtSetInformationTransaction(transactionhandle: HANDLE, transactioninformationclass: TRANSACTION_INFORMATION_CLASS, transactioninformation: Long, transactioninformationlength: UInt): NTSTATUS =
    0

public actual fun NtSetInformationTransactionManager(tmhandle: HANDLE, transactionmanagerinformationclass: TRANSACTIONMANAGER_INFORMATION_CLASS, transactionmanagerinformation: Long, transactionmanagerinformationlength: UInt): NTSTATUS =
    0

public actual fun NtSinglePhaseReject(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun NtUnloadDriver(driverservicename: Long): NTSTATUS =
    0

public actual fun ObCloseHandle(handle: HANDLE, previousmode: Byte): NTSTATUS =
    0

public actual fun ObDereferenceObjectDeferDelete(obj: Long) {
}

public actual fun ObDereferenceObjectDeferDeleteWithTag(obj: Long, tag: UInt) {
}

public actual fun ObGetFilterVersion(): UShort =
    0u

public actual fun ObGetObjectSecurity(obj: Long, securitydescriptor: Long, memoryallocated: Long): NTSTATUS =
    0

public actual fun ObReferenceObjectByHandle(handle: HANDLE, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte, obj: Long, handleinformation: Long): NTSTATUS =
    0

public actual fun ObReferenceObjectByHandleWithTag(handle: HANDLE, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte, tag: UInt, obj: Long, handleinformation: Long): NTSTATUS =
    0

public actual fun ObReferenceObjectByPointer(obj: Long, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte): NTSTATUS =
    0

public actual fun ObReferenceObjectByPointerWithTag(obj: Long, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte, tag: UInt): NTSTATUS =
    0

public actual fun ObReferenceObjectSafe(obj: Long): Boolean =
    false

public actual fun ObReferenceObjectSafeWithTag(obj: Long, tag: UInt): Boolean =
    false

public actual fun ObRegisterCallbacks(callbackregistration: Long, registrationhandle: Long): NTSTATUS =
    0

public actual fun ObReleaseObjectSecurity(securitydescriptor: PSECURITY_DESCRIPTOR, memoryallocated: Boolean) {
}

public actual fun ObUnRegisterCallbacks(registrationhandle: Long) {
}

public actual fun ObfDereferenceObject(obj: Long): Long =
    0L

public actual fun ObfDereferenceObjectWithTag(obj: Long, tag: UInt): Long =
    0L

public actual fun ObfReferenceObject(obj: Long): Long =
    0L

public actual fun ObfReferenceObjectWithTag(obj: Long, tag: UInt): Long =
    0L

public actual fun PcwAddInstance(buffer: PPCW_BUFFER, name: Long, id: UInt, count: UInt, data: Long): NTSTATUS =
    0

public actual fun PcwCloseInstance(instance: PPCW_INSTANCE) {
}

public actual fun PcwCreateInstance(instance: Long, registration: PPCW_REGISTRATION, name: Long, count: UInt, data: Long): NTSTATUS =
    0

public actual fun PcwRegister(registration: Long, info: Long): NTSTATUS =
    0

public actual fun PcwUnregister(registration: PPCW_REGISTRATION) {
}

public actual fun PoCallDriver(deviceobject: Long, irp: Long): NTSTATUS =
    0

public actual fun PoClearPowerRequest(powerrequest: Long, type: POWER_REQUEST_TYPE): NTSTATUS =
    0

public actual fun PoCreatePowerRequest(powerrequest: Long, deviceobject: Long, context: Long): NTSTATUS =
    0

public actual fun PoCreateThermalRequest(thermalrequest: Long, targetdeviceobject: Long, policydeviceobject: Long, context: Long, flags: UInt): NTSTATUS =
    0

public actual fun PoDeletePowerRequest(powerrequest: Long) {
}

public actual fun PoDeleteThermalRequest(thermalrequest: Long) {
}

public actual fun PoEndDeviceBusy(idlepointer: Long) {
}

public actual fun PoFxActivateComponent(handle: POHANDLE, component: UInt, flags: UInt) {
}

public actual fun PoFxCompleteDevicePowerNotRequired(handle: POHANDLE) {
}

public actual fun PoFxCompleteDirectedPowerDown(handle: POHANDLE) {
}

public actual fun PoFxCompleteIdleCondition(handle: POHANDLE, component: UInt) {
}

public actual fun PoFxCompleteIdleState(handle: POHANDLE, component: UInt) {
}

public actual fun PoFxIdleComponent(handle: POHANDLE, component: UInt, flags: UInt) {
}

public actual fun PoFxIssueComponentPerfStateChange(handle: POHANDLE, flags: UInt, component: UInt, perfchange: Long, context: Long) {
}

public actual fun PoFxIssueComponentPerfStateChangeMultiple(handle: POHANDLE, flags: UInt, component: UInt, perfchangescount: UInt, perfchanges: Long, context: Long) {
}

public actual fun PoFxNotifySurprisePowerOn(pdo: Long) {
}

public actual fun PoFxPowerControl(handle: POHANDLE, powercontrolcode: Long, inbuffer: Long, inbuffersize: ULong, outbuffer: Long, outbuffersize: ULong, bytesreturned: Long): NTSTATUS =
    0

public actual fun PoFxPowerOnCrashdumpDevice(handle: POHANDLE, context: Long): NTSTATUS =
    0

public actual fun PoFxQueryCurrentComponentPerfState(handle: POHANDLE, flags: UInt, component: UInt, setindex: UInt, currentperf: Long): NTSTATUS =
    0

public actual fun PoFxRegisterComponentPerfStates(handle: POHANDLE, component: UInt, flags: ULong, componentperfstatecallback: PPO_FX_COMPONENT_PERF_STATE_CALLBACK, inputstateinfo: Long, outputstateinfo: Long): NTSTATUS =
    0

public actual fun PoFxRegisterCrashdumpDevice(handle: POHANDLE): NTSTATUS =
    0

public actual fun PoFxRegisterDevice(pdo: Long, device: Long, handle: Long): NTSTATUS =
    0

public actual fun PoFxRegisterDripsWatchdogCallback(handle: POHANDLE, callback: PPO_FX_DRIPS_WATCHDOG_CALLBACK, includechilddevices: Boolean, matchingdriverobject: Long) {
}

public actual fun PoFxReportDevicePoweredOn(handle: POHANDLE) {
}

public actual fun PoFxSetComponentLatency(handle: POHANDLE, component: UInt, latency: ULong) {
}

public actual fun PoFxSetComponentResidency(handle: POHANDLE, component: UInt, residency: ULong) {
}

public actual fun PoFxSetComponentWake(handle: POHANDLE, component: UInt, wakehint: Boolean) {
}

public actual fun PoFxSetDeviceIdleTimeout(handle: POHANDLE, idletimeout: ULong) {
}

public actual fun PoFxSetTargetDripsDevicePowerState(handle: POHANDLE, targetstate: DEVICE_POWER_STATE): NTSTATUS =
    0

public actual fun PoFxStartDevicePowerManagement(handle: POHANDLE) {
}

public actual fun PoFxUnregisterDevice(handle: POHANDLE) {
}

public actual fun PoGetSystemWake(irp: Long): Boolean =
    false

public actual fun PoGetThermalRequestSupport(thermalrequest: Long, type: PO_THERMAL_REQUEST_TYPE): Boolean =
    false

public actual fun PoQueryWatchdogTime(pdo: Long, secondsremaining: Long): Boolean =
    false

public actual fun PoRegisterDeviceForIdleDetection(deviceobject: Long, conservationidletime: UInt, performanceidletime: UInt, state: DEVICE_POWER_STATE): Long =
    0L

public actual fun PoRegisterPowerSettingCallback(deviceobject: Long, settingguid: Long, callback: PPOWER_SETTING_CALLBACK, context: Long, handle: Long): NTSTATUS =
    0

public actual fun PoRegisterSystemState(statehandle: Long, flags: UInt): Long =
    0L

public actual fun PoRequestPowerIrp(deviceobject: Long, minorfunction: UByte, powerstate: POWER_STATE, completionfunction: PREQUEST_POWER_COMPLETE, context: Long, irp: Long): NTSTATUS =
    0

public actual fun PoSetDeviceBusyEx(idlepointer: Long) {
}

public actual fun PoSetHiberRange(memorymap: Long, flags: UInt, address: Long, length: ULong, tag: UInt) {
}

public actual fun PoSetPowerRequest(powerrequest: Long, type: POWER_REQUEST_TYPE): NTSTATUS =
    0

public actual fun PoSetPowerState(deviceobject: Long, type: POWER_STATE_TYPE, state: POWER_STATE): POWER_STATE =
    POWER_STATE()

public actual fun PoSetSystemState(flags: UInt) {
}

public actual fun PoSetSystemWake(irp: Long) {
}

public actual fun PoSetSystemWakeDevice(deviceobject: Long) {
}

public actual fun PoSetThermalActiveCooling(thermalrequest: Long, engaged: Boolean): NTSTATUS =
    0

public actual fun PoSetThermalPassiveCooling(thermalrequest: Long, throttle: UByte): NTSTATUS =
    0

public actual fun PoStartDeviceBusy(idlepointer: Long) {
}

public actual fun PoStartNextPowerIrp(irp: Long) {
}

public actual fun PoUnregisterPowerSettingCallback(handle: Long): NTSTATUS =
    0

public actual fun PoUnregisterSystemState(statehandle: Long) {
}

public actual fun ProbeForRead(address: Long, length: ULong, alignment: UInt) {
}

public actual fun ProbeForWrite(address: Long, length: ULong, alignment: UInt) {
}

public actual fun PsAcquireSiloHardReference(silo: PESILO): NTSTATUS =
    0

public actual fun PsAllocSiloContextSlot(reserved: ULong, returnedcontextslot: Long): NTSTATUS =
    0

public actual fun PsAllocateAffinityToken(affinitytoken: Long): NTSTATUS =
    0

public actual fun PsAttachSiloToCurrentThread(silo: PESILO): PESILO =
    0L

public actual fun PsCreateSiloContext(silo: PESILO, size: UInt, pooltype: POOL_TYPE, contextcleanupcallback: SILO_CONTEXT_CLEANUP_CALLBACK, returnedsilocontext: Long): NTSTATUS =
    0

public actual fun PsCreateSystemThread(threadhandle: Long, desiredaccess: UInt, objectattributes: Long, processhandle: HANDLE, clientid: Long, startroutine: PKSTART_ROUTINE, startcontext: Long): NTSTATUS =
    0

public actual fun PsDereferenceSiloContext(silocontext: Long) {
}

public actual fun PsDetachSiloFromCurrentThread(previoussilo: PESILO) {
}

public actual fun PsFreeAffinityToken(affinitytoken: PAFFINITY_TOKEN) {
}

public actual fun PsFreeSiloContextSlot(contextslot: UInt): NTSTATUS =
    0

public actual fun PsGetCurrentProcessId(): HANDLE =
    0L

public actual fun PsGetCurrentServerSilo(): PESILO =
    0L

public actual fun PsGetCurrentServerSiloName(): Long =
    0L

public actual fun PsGetCurrentSilo(): PESILO =
    0L

public actual fun PsGetCurrentThreadId(): HANDLE =
    0L

public actual fun PsGetCurrentThreadTeb(): Long =
    0L

public actual fun PsGetEffectiveServerSilo(silo: PESILO): PESILO =
    0L

public actual fun PsGetHostSilo(): PESILO =
    0L

public actual fun PsGetJobServerSilo(job: PEJOB, serversilo: Long): NTSTATUS =
    0

public actual fun PsGetJobSilo(job: PEJOB, silo: Long): NTSTATUS =
    0

public actual fun PsGetParentSilo(job: PEJOB): PESILO =
    0L

public actual fun PsGetPermanentSiloContext(silo: PESILO, contextslot: UInt, returnedsilocontext: Long): NTSTATUS =
    0

public actual fun PsGetProcessCreateTimeQuadPart(process: PEPROCESS): Long =
    0L

public actual fun PsGetProcessExitStatus(process: PEPROCESS): NTSTATUS =
    0

public actual fun PsGetProcessId(process: PEPROCESS): HANDLE =
    0L

public actual fun PsGetProcessStartKey(process: PEPROCESS): ULong =
    0uL

public actual fun PsGetServerSiloServiceSessionId(silo: PESILO): UInt =
    0u

public actual fun PsGetSiloContainerId(silo: PESILO): Long =
    0L

public actual fun PsGetSiloContext(silo: PESILO, contextslot: UInt, returnedsilocontext: Long): NTSTATUS =
    0

public actual fun PsGetSiloMonitorContextSlot(monitor: PSILO_MONITOR): UInt =
    0u

public actual fun PsGetThreadCreateTime(thread: PETHREAD): Long =
    0L

public actual fun PsGetThreadExitStatus(thread: PETHREAD): NTSTATUS =
    0

public actual fun PsGetThreadId(thread: PETHREAD): HANDLE =
    0L

public actual fun PsGetThreadProcessId(thread: PETHREAD): HANDLE =
    0L

public actual fun PsGetThreadProperty(thread: PETHREAD, key: ULong, flags: UInt): Long =
    0L

public actual fun PsGetThreadServerSilo(thread: PETHREAD): PESILO =
    0L

public actual fun PsGetVersion(majorversion: Long, minorversion: Long, buildnumber: Long, csdversion: Long): Boolean =
    false

public actual fun PsInsertPermanentSiloContext(silo: PESILO, contextslot: UInt, silocontext: Long): NTSTATUS =
    0

public actual fun PsInsertSiloContext(silo: PESILO, contextslot: UInt, silocontext: Long): NTSTATUS =
    0

public actual fun PsIsCurrentThreadInServerSilo(): Boolean =
    false

public actual fun PsIsCurrentThreadPrefetching(): Boolean =
    false

public actual fun PsIsHostSilo(silo: PESILO): Boolean =
    false

public actual fun PsMakeSiloContextPermanent(silo: PESILO, contextslot: UInt): NTSTATUS =
    0

public actual fun PsQueryTotalCycleTimeProcess(process: PEPROCESS, cycletimestamp: Long): ULong =
    0uL

public actual fun PsReferenceSiloContext(silocontext: Long) {
}

public actual fun PsRegisterSiloMonitor(registration: Long, returnedmonitor: Long): NTSTATUS =
    0

public actual fun PsReleaseSiloHardReference(silo: PESILO) {
}

public actual fun PsRemoveCreateThreadNotifyRoutine(notifyroutine: PCREATE_THREAD_NOTIFY_ROUTINE): NTSTATUS =
    0

public actual fun PsRemoveLoadImageNotifyRoutine(notifyroutine: PLOAD_IMAGE_NOTIFY_ROUTINE): NTSTATUS =
    0

public actual fun PsRemoveSiloContext(silo: PESILO, contextslot: UInt, removedsilocontext: Long): NTSTATUS =
    0

public actual fun PsReplaceSiloContext(silo: PESILO, contextslot: UInt, newsilocontext: Long, oldsilocontext: Long): NTSTATUS =
    0

public actual fun PsRevertToUserMultipleGroupAffinityThread(affinitytoken: PAFFINITY_TOKEN) {
}

public actual fun PsSetCreateProcessNotifyRoutine(notifyroutine: PCREATE_PROCESS_NOTIFY_ROUTINE, remove: Boolean): NTSTATUS =
    0

public actual fun PsSetCreateProcessNotifyRoutineEx(notifyroutine: PCREATE_PROCESS_NOTIFY_ROUTINE_EX, remove: Boolean): NTSTATUS =
    0

public actual fun PsSetCreateProcessNotifyRoutineEx2(notifytype: PSCREATEPROCESSNOTIFYTYPE, notifyinformation: Long, remove: Boolean): NTSTATUS =
    0

public actual fun PsSetCreateThreadNotifyRoutine(notifyroutine: PCREATE_THREAD_NOTIFY_ROUTINE): NTSTATUS =
    0

public actual fun PsSetCreateThreadNotifyRoutineEx(notifytype: PSCREATETHREADNOTIFYTYPE, notifyinformation: Long): NTSTATUS =
    0

public actual fun PsSetCurrentThreadPrefetching(prefetching: Boolean): Boolean =
    false

public actual fun PsSetLoadImageNotifyRoutine(notifyroutine: PLOAD_IMAGE_NOTIFY_ROUTINE): NTSTATUS =
    0

public actual fun PsSetLoadImageNotifyRoutineEx(notifyroutine: PLOAD_IMAGE_NOTIFY_ROUTINE, flags: ULong): NTSTATUS =
    0

public actual fun PsSetSystemMultipleGroupAffinityThread(groupaffinities: Long, groupcount: UShort, affinitytoken: PAFFINITY_TOKEN): NTSTATUS =
    0

public actual fun PsStartSiloMonitor(monitor: PSILO_MONITOR): NTSTATUS =
    0

public actual fun PsTerminateServerSilo(serversilo: PESILO, exitstatus: NTSTATUS) {
}

public actual fun PsTerminateSystemThread(exitstatus: NTSTATUS): NTSTATUS =
    0

public actual fun PsUnregisterSiloMonitor(monitor: PSILO_MONITOR) {
}

public actual fun PsWrapApcWow64Thread(apccontext: Long, apcroutine: Long): NTSTATUS =
    0

public actual fun PshedAllocateMemory(size: UInt): Long =
    0L

public actual fun PshedFreeMemory(address: Long) {
}

public actual fun PshedIsSystemWheaEnabled(): Boolean =
    false

public actual fun PshedRegisterPlugin(packet: Long): NTSTATUS =
    0

public actual fun PshedSynchronizeExecution(errorsource: Long, synchronizeroutine: PKSYNCHRONIZE_ROUTINE, synchronizecontext: Long): Boolean =
    false

public actual fun PshedUnregisterPlugin(pluginhandle: Long) {
}

public actual fun RtlAppendUnicodeStringToString(destination: Long, source: Long): NTSTATUS =
    0

public actual fun RtlAppendUnicodeToString(destination: Long, source: PCWSTR): NTSTATUS =
    0

public actual fun RtlAreBitsClear(bitmapheader: Long, startingindex: UInt, length: UInt): Boolean =
    false

public actual fun RtlAreBitsSet(bitmapheader: Long, startingindex: UInt, length: UInt): Boolean =
    false

public actual fun RtlAssert(voidfailedassertion: Long, voidfilename: Long, linenumber: UInt, mutablemessage: PCSTR) {
}

public actual fun RtlCheckRegistryKey(relativeto: UInt, path: PCWSTR): NTSTATUS =
    0

public actual fun RtlClearAllBits(bitmapheader: Long) {
}

public actual fun RtlClearBit(bitmapheader: Long, bitnumber: UInt) {
}

public actual fun RtlClearBits(bitmapheader: Long, startingindex: UInt, numbertoclear: UInt) {
}

public actual fun RtlCmDecodeMemIoResource(descriptor: Long, start: Long): ULong =
    0uL

public actual fun RtlCmEncodeMemIoResource(descriptor: Long, type: UByte, length: ULong, start: ULong): NTSTATUS =
    0

public actual fun RtlCompareString(string1: Long, string2: Long, caseinsensitive: Boolean): Int =
    0

public actual fun RtlCompareUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Int =
    0

public actual fun RtlCompareUnicodeStrings(string1: Long, string1length: ULong, string2: Long, string2length: ULong, caseinsensitive: Boolean): Int =
    0

public actual fun RtlContractHashTable(hashtable: Long): Boolean =
    false

public actual fun RtlCopyBitMap(source: Long, destination: Long, targetbit: UInt) {
}

public actual fun RtlCopyString(destinationstring: Long, sourcestring: Long) {
}

public actual fun RtlCopyUnicodeString(destinationstring: Long, sourcestring: Long) {
}

public actual fun RtlCreateHashTable(hashtable: Long, shift: UInt, flags: UInt): Boolean =
    false

public actual fun RtlCreateHashTableEx(hashtable: Long, initialsize: UInt, shift: UInt, flags: UInt): Boolean =
    false

public actual fun RtlCreateRegistryKey(relativeto: UInt, path: PCWSTR): NTSTATUS =
    0

public actual fun RtlCreateSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, revision: UInt): NTSTATUS =
    0

public actual fun RtlDelete(links: Long): Long =
    0L

public actual fun RtlDeleteElementGenericTable(table: Long, buffer: Long): Boolean =
    false

public actual fun RtlDeleteElementGenericTableAvl(table: Long, buffer: Long): Boolean =
    false

public actual fun RtlDeleteElementGenericTableAvlEx(table: Long, nodeorparent: Long) {
}

public actual fun RtlDeleteHashTable(hashtable: Long) {
}

public actual fun RtlDeleteNoSplay(links: Long, root: Long) {
}

public actual fun RtlDeleteRegistryValue(relativeto: UInt, path: PCWSTR, valuename: PCWSTR): NTSTATUS =
    0

public actual fun RtlDowncaseUnicodeChar(sourcecharacter: UShort): UShort =
    0u

public actual fun RtlEndEnumerationHashTable(hashtable: Long, enumerator: Long) {
}

public actual fun RtlEndStrongEnumerationHashTable(hashtable: Long, enumerator: Long) {
}

public actual fun RtlEndWeakEnumerationHashTable(hashtable: Long, enumerator: Long) {
}

public actual fun RtlEnumerateEntryHashTable(hashtable: Long, enumerator: Long): Long =
    0L

public actual fun RtlEnumerateGenericTable(table: Long, restart: Boolean): Long =
    0L

public actual fun RtlEnumerateGenericTableAvl(table: Long, restart: Boolean): Long =
    0L

public actual fun RtlEnumerateGenericTableLikeADirectory(table: Long, matchfunction: PRTL_AVL_MATCH_FUNCTION, matchdata: Long, nextflag: UInt, restartkey: Long, deletecount: Long, buffer: Long): Long =
    0L

public actual fun RtlEnumerateGenericTableWithoutSplaying(table: Long, restartkey: Long): Long =
    0L

public actual fun RtlEnumerateGenericTableWithoutSplayingAvl(table: Long, restartkey: Long): Long =
    0L

public actual fun RtlEqualString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean =
    false

public actual fun RtlEqualUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean =
    false

public actual fun RtlExpandHashTable(hashtable: Long): Boolean =
    false

public actual fun RtlExtractBitMap(source: Long, destination: Long, targetbit: UInt, numberofbits: UInt) {
}

public actual fun RtlFindClearBits(bitmapheader: Long, numbertofind: UInt, hintindex: UInt): UInt =
    0u

public actual fun RtlFindClearBitsAndSet(bitmapheader: Long, numbertofind: UInt, hintindex: UInt): UInt =
    0u

public actual fun RtlFindClearRuns(bitmapheader: Long, runarray: Long, sizeofrunarray: UInt, locatelongestruns: Boolean): UInt =
    0u

public actual fun RtlFindClosestEncodableLength(sourcelength: ULong, targetlength: Long): NTSTATUS =
    0

public actual fun RtlFindFirstRunClear(bitmapheader: Long, startingindex: Long): UInt =
    0u

public actual fun RtlFindLastBackwardRunClear(bitmapheader: Long, fromindex: UInt, startingrunindex: Long): UInt =
    0u

public actual fun RtlFindLeastSignificantBit(set: ULong): Byte =
    0

public actual fun RtlFindLongestRunClear(bitmapheader: Long, startingindex: Long): UInt =
    0u

public actual fun RtlFindMostSignificantBit(set: ULong): Byte =
    0

public actual fun RtlFindNextForwardRunClear(bitmapheader: Long, fromindex: UInt, startingrunindex: Long): UInt =
    0u

public actual fun RtlFindSetBits(bitmapheader: Long, numbertofind: UInt, hintindex: UInt): UInt =
    0u

public actual fun RtlFindSetBitsAndClear(bitmapheader: Long, numbertofind: UInt, hintindex: UInt): UInt =
    0u

public actual fun RtlFreeUTF8String(utf8string: Long) {
}

public actual fun RtlGUIDFromString(guidstring: Long, guid: Long): NTSTATUS =
    0

public actual fun RtlGenerateClass5Guid(namespaceguid: Long, buffer: Long, buffersize: UInt, guid: Long): NTSTATUS =
    0

public actual fun RtlGetActiveConsoleId(): UInt =
    0u

public actual fun RtlGetCallersAddress(callersaddress: Long, callerscaller: Long) {
}

public actual fun RtlGetConsoleSessionForegroundProcessId(): ULong =
    0uL

public actual fun RtlGetElementGenericTable(table: Long, i: UInt): Long =
    0L

public actual fun RtlGetElementGenericTableAvl(table: Long, i: UInt): Long =
    0L

public actual fun RtlGetEnabledExtendedFeatures(featuremask: ULong): ULong =
    0uL

public actual fun RtlGetNextEntryHashTable(hashtable: Long, context: Long): Long =
    0L

public actual fun RtlGetNtProductType(ntproducttype: Long): Boolean =
    false

public actual fun RtlGetNtSystemRoot(): PCWSTR =
    0L

public actual fun RtlGetPersistedStateLocation(sourceid: PCWSTR, customvalue: PCWSTR, defaultpath: PCWSTR, statelocationtype: STATE_LOCATION_TYPE, targetpath: PWSTR, bufferlengthin: UInt, bufferlengthout: Long): NTSTATUS =
    0

public actual fun RtlGetSuiteMask(): UInt =
    0u

public actual fun RtlGetVersion(lpversioninformation: Long): NTSTATUS =
    0

public actual fun RtlHashUnicodeString(string: Long, caseinsensitive: Boolean, hashalgorithm: UInt, hashvalue: Long): NTSTATUS =
    0

public actual fun RtlInitEnumerationHashTable(hashtable: Long, enumerator: Long): Boolean =
    false

public actual fun RtlInitStrongEnumerationHashTable(hashtable: Long, enumerator: Long): Boolean =
    false

public actual fun RtlInitUTF8String(destinationstring: Long, sourcestring: Long) {
}

public actual fun RtlInitUTF8StringEx(destinationstring: Long, sourcestring: Long): NTSTATUS =
    0

public actual fun RtlInitWeakEnumerationHashTable(hashtable: Long, enumerator: Long): Boolean =
    false

public actual fun RtlInitializeBitMap(bitmapheader: Long, bitmapbuffer: Long, sizeofbitmap: UInt) {
}

public actual fun RtlInitializeGenericTable(table: Long, compareroutine: PRTL_GENERIC_COMPARE_ROUTINE, allocateroutine: PRTL_GENERIC_ALLOCATE_ROUTINE, freeroutine: PRTL_GENERIC_FREE_ROUTINE, tablecontext: Long) {
}

public actual fun RtlInitializeGenericTableAvl(table: Long, compareroutine: PRTL_AVL_COMPARE_ROUTINE, allocateroutine: PRTL_AVL_ALLOCATE_ROUTINE, freeroutine: PRTL_AVL_FREE_ROUTINE, tablecontext: Long) {
}

public actual fun RtlInsertElementGenericTable(table: Long, buffer: Long, buffersize: UInt, newelement: Long): Long =
    0L

public actual fun RtlInsertElementGenericTableAvl(table: Long, buffer: Long, buffersize: UInt, newelement: Long): Long =
    0L

public actual fun RtlInsertElementGenericTableFull(table: Long, buffer: Long, buffersize: UInt, newelement: Long, nodeorparent: Long, searchresult: TABLE_SEARCH_RESULT): Long =
    0L

public actual fun RtlInsertElementGenericTableFullAvl(table: Long, buffer: Long, buffersize: UInt, newelement: Long, nodeorparent: Long, searchresult: TABLE_SEARCH_RESULT): Long =
    0L

public actual fun RtlInsertEntryHashTable(hashtable: Long, entry: Long, signature: ULong, context: Long): Boolean =
    false

public actual fun RtlInt64ToUnicodeString(value: ULong, base: UInt, string: Long): NTSTATUS =
    0

public actual fun RtlIntegerToUnicodeString(value: UInt, base: UInt, string: Long): NTSTATUS =
    0

public actual fun RtlIoDecodeMemIoResource(descriptor: Long, alignment: Long, minimumaddress: Long, maximumaddress: Long): ULong =
    0uL

public actual fun RtlIoEncodeMemIoResource(descriptor: Long, type: UByte, length: ULong, alignment: ULong, minimumaddress: ULong, maximumaddress: ULong): NTSTATUS =
    0

public actual fun RtlIsApiSetImplemented(apisetname: PCSTR): NTSTATUS =
    0

public actual fun RtlIsGenericTableEmpty(table: Long): Boolean =
    false

public actual fun RtlIsGenericTableEmptyAvl(table: Long): Boolean =
    false

public actual fun RtlIsMultiSessionSku(): Boolean =
    false

public actual fun RtlIsMultiUsersInSessionSku(): Boolean =
    false

public actual fun RtlIsNtDdiVersionAvailable(version: UInt): Boolean =
    false

public actual fun RtlIsServicePackVersionInstalled(version: UInt): Boolean =
    false

public actual fun RtlIsStateSeparationEnabled(): Boolean =
    false

public actual fun RtlIsUntrustedObject(handle: HANDLE, obj: Long, untrustedobject: Long): NTSTATUS =
    0

public actual fun RtlLengthSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR): UInt =
    0u

public actual fun RtlLookupElementGenericTable(table: Long, buffer: Long): Long =
    0L

public actual fun RtlLookupElementGenericTableAvl(table: Long, buffer: Long): Long =
    0L

public actual fun RtlLookupElementGenericTableFull(table: Long, buffer: Long, nodeorparent: Long, searchresult: Long): Long =
    0L

public actual fun RtlLookupElementGenericTableFullAvl(table: Long, buffer: Long, nodeorparent: Long, searchresult: Long): Long =
    0L

public actual fun RtlLookupEntryHashTable(hashtable: Long, signature: ULong, context: Long): Long =
    0L

public actual fun RtlLookupFirstMatchingElementGenericTableAvl(table: Long, buffer: Long, restartkey: Long): Long =
    0L

public actual fun RtlMapGenericMask(accessmask: Long, genericmapping: Long) {
}

public actual fun RtlNormalizeSecurityDescriptor(securitydescriptor: Long, securitydescriptorlength: UInt, newsecuritydescriptor: Long, newsecuritydescriptorlength: Long, checkonly: Boolean): Boolean =
    false

public actual fun RtlNumberGenericTableElements(table: Long): UInt =
    0u

public actual fun RtlNumberGenericTableElementsAvl(table: Long): UInt =
    0u

public actual fun RtlNumberOfClearBits(bitmapheader: Long): UInt =
    0u

public actual fun RtlNumberOfClearBitsInRange(bitmapheader: Long, startingindex: UInt, length: UInt): UInt =
    0u

public actual fun RtlNumberOfSetBits(bitmapheader: Long): UInt =
    0u

public actual fun RtlNumberOfSetBitsInRange(bitmapheader: Long, startingindex: UInt, length: UInt): UInt =
    0u

public actual fun RtlNumberOfSetBitsUlongPtr(target: ULong): UInt =
    0u

public actual fun RtlPrefetchMemoryNonTemporal(source: Long, length: ULong) {
}

public actual fun RtlPrefixUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean =
    false

public actual fun RtlQueryRegistryValueWithFallback(primaryhandle: HANDLE, fallbackhandle: HANDLE, valuename: Long, valuelength: UInt, valuetype: Long, valuedata: Long, resultlength: Long): NTSTATUS =
    0

public actual fun RtlQueryRegistryValues(relativeto: UInt, path: PCWSTR, querytable: Long, context: Long, environment: Long): NTSTATUS =
    0

public actual fun RtlQueryValidationRunlevel(componentname: Long): UInt =
    0u

public actual fun RtlRealPredecessor(links: Long): Long =
    0L

public actual fun RtlRealSuccessor(links: Long): Long =
    0L

public actual fun RtlRemoveEntryHashTable(hashtable: Long, entry: Long, context: Long): Boolean =
    false

public actual fun RtlRunOnceBeginInitialize(runonce: Long, flags: UInt, context: Long): NTSTATUS =
    0

public actual fun RtlRunOnceComplete(runonce: Long, flags: UInt, context: Long): NTSTATUS =
    0

public actual fun RtlRunOnceExecuteOnce(runonce: Long, initfn: PRTL_RUN_ONCE_INIT_FN, parameter: Long, context: Long): NTSTATUS =
    0

public actual fun RtlRunOnceInitialize(runonce: Long) {
}

public actual fun RtlSetAllBits(bitmapheader: Long) {
}

public actual fun RtlSetBit(bitmapheader: Long, bitnumber: UInt) {
}

public actual fun RtlSetBits(bitmapheader: Long, startingindex: UInt, numbertoset: UInt) {
}

public actual fun RtlSetDaclSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, daclpresent: Boolean, dacl: Long, dacldefaulted: Boolean): NTSTATUS =
    0

public actual fun RtlSetSystemGlobalData(dataid: RTL_SYSTEM_GLOBAL_DATA_ID, buffer: Long, size: UInt): NTSTATUS =
    0

public actual fun RtlSplay(links: Long): Long =
    0L

public actual fun RtlStringFromGUID(guid: Long, guidstring: Long): NTSTATUS =
    0

public actual fun RtlStronglyEnumerateEntryHashTable(hashtable: Long, enumerator: Long): Long =
    0L

public actual fun RtlSubtreePredecessor(links: Long): Long =
    0L

public actual fun RtlSubtreeSuccessor(links: Long): Long =
    0L

public actual fun RtlSuffixUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean =
    false

public actual fun RtlTestBit(bitmapheader: Long, bitnumber: UInt): Boolean =
    false

public actual fun RtlTimeFieldsToTime(timefields: Long, time: Long): Boolean =
    false

public actual fun RtlTimeToTimeFields(time: Long, timefields: Long) {
}

public actual fun RtlUTF8StringToUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    0

public actual fun RtlUTF8ToUnicodeN(unicodestringdestination: PWSTR, unicodestringmaxbytecount: UInt, unicodestringactualbytecount: Long, utf8stringsource: PCSTR, utf8stringbytecount: UInt): NTSTATUS =
    0

public actual fun RtlUnicodeStringToInt64(string: Long, base: UInt, number: Long, endpointer: Long): NTSTATUS =
    0

public actual fun RtlUnicodeStringToInteger(string: Long, base: UInt, value: Long): NTSTATUS =
    0

public actual fun RtlUnicodeStringToUTF8String(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    0

public actual fun RtlUnicodeToUTF8N(utf8stringdestination: PSTR, utf8stringmaxbytecount: UInt, utf8stringactualbytecount: Long, unicodestringsource: Long, unicodestringbytecount: UInt): NTSTATUS =
    0

public actual fun RtlUpcaseUnicodeChar(sourcecharacter: UShort): UShort =
    0u

public actual fun RtlUpcaseUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    0

public actual fun RtlUpperChar(character: Byte): Byte =
    0

public actual fun RtlUpperString(destinationstring: Long, sourcestring: Long) {
}

public actual fun RtlValidRelativeSecurityDescriptor(securitydescriptorinput: PSECURITY_DESCRIPTOR, securitydescriptorlength: UInt, requiredinformation: UInt): Boolean =
    false

public actual fun RtlValidSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR): Boolean =
    false

public actual fun RtlVerifyVersionInfo(versioninfo: Long, typemask: UInt, conditionmask: ULong): NTSTATUS =
    0

public actual fun RtlVolumeDeviceToDosName(volumedeviceobject: Long, dosname: Long): NTSTATUS =
    0

public actual fun RtlWalkFrameChain(callers: Long, count: UInt, flags: UInt): UInt =
    0u

public actual fun RtlWeaklyEnumerateEntryHashTable(hashtable: Long, enumerator: Long): Long =
    0L

public actual fun RtlWriteRegistryValue(relativeto: UInt, path: PCWSTR, valuename: PCWSTR, valuetype: UInt, valuedata: Long, valuelength: UInt): NTSTATUS =
    0

public actual fun RtlxAnsiStringToUnicodeSize(ansistring: Long): UInt =
    0u

public actual fun RtlxUnicodeStringToAnsiSize(unicodestring: Long): UInt =
    0u

public actual fun SeAccessCheck(securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, subjectcontextlocked: Boolean, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: Long, genericmapping: Long, accessmode: Byte, grantedaccess: Long, accessstatus: Long): Boolean =
    false

public actual fun SeAssignSecurity(parentdescriptor: PSECURITY_DESCRIPTOR, explicitdescriptor: PSECURITY_DESCRIPTOR, newdescriptor: Long, isdirectoryobject: Boolean, subjectcontext: Long, genericmapping: Long, pooltype: POOL_TYPE): NTSTATUS =
    0

public actual fun SeAssignSecurityEx(parentdescriptor: PSECURITY_DESCRIPTOR, explicitdescriptor: PSECURITY_DESCRIPTOR, newdescriptor: Long, objecttype: Long, isdirectoryobject: Boolean, autoinheritflags: UInt, subjectcontext: Long, genericmapping: Long, pooltype: POOL_TYPE): NTSTATUS =
    0

public actual fun SeCaptureSubjectContext(subjectcontext: Long) {
}

public actual fun SeComputeAutoInheritByObjectType(objecttype: Long, securitydescriptor: PSECURITY_DESCRIPTOR, parentsecuritydescriptor: PSECURITY_DESCRIPTOR): UInt =
    0u

public actual fun SeDeassignSecurity(securitydescriptor: Long): NTSTATUS =
    0

public actual fun SeEtwWriteKMCveEvent(cveid: Long, additionaldetails: Long): NTSTATUS =
    0

public actual fun SeLockSubjectContext(subjectcontext: Long) {
}

public actual fun SeRegisterImageVerificationCallback(imagetype: SE_IMAGE_TYPE, callbacktype: SE_IMAGE_VERIFICATION_CALLBACK_TYPE, callbackfunction: PSE_IMAGE_VERIFICATION_CALLBACK_FUNCTION, callbackcontext: Long, token: Long, callbackhandle: Long): NTSTATUS =
    0

public actual fun SeReleaseSubjectContext(subjectcontext: Long) {
}

public actual fun SeReportSecurityEvent(flags: UInt, sourcename: Long, usersid: PSID, auditparameters: Long): NTSTATUS =
    0

public actual fun SeSetAuditParameter(auditparameters: Long, type: SE_ADT_PARAMETER_TYPE, index: UInt, data: Long): NTSTATUS =
    0

public actual fun SeSinglePrivilegeCheck(privilegevalue: LUID, previousmode: Byte): Boolean =
    false

public actual fun SeUnlockSubjectContext(subjectcontext: Long) {
}

public actual fun SeUnregisterImageVerificationCallback(callbackhandle: Long) {
}

public actual fun SeValidSecurityDescriptor(length: UInt, securitydescriptor: PSECURITY_DESCRIPTOR): Boolean =
    false

public actual fun TmCommitComplete(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun TmCommitEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun TmCommitTransaction(transaction: Long, wait: Boolean): NTSTATUS =
    0

public actual fun TmCreateEnlistment(enlistmenthandle: Long, previousmode: Byte, desiredaccess: UInt, objectattributes: Long, resourcemanager: Long, transaction: Long, createoptions: UInt, notificationmask: UInt, enlistmentkey: Long): NTSTATUS =
    0

public actual fun TmDereferenceEnlistmentKey(enlistment: Long, lastreference: Long): NTSTATUS =
    0

public actual fun TmEnableCallbacks(resourcemanager: Long, callbackroutine: PTM_RM_NOTIFICATION, rmkey: Long): NTSTATUS =
    0

public actual fun TmGetTransactionId(transaction: Long, transactionid: Long) {
}

public actual fun TmInitializeTransactionManager(transactionmanager: Long, logfilename: Long, tmid: Long, createoptions: UInt): NTSTATUS =
    0

public actual fun TmIsTransactionActive(transaction: Long): Boolean =
    false

public actual fun TmPrePrepareComplete(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun TmPrePrepareEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun TmPrepareComplete(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun TmPrepareEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun TmPropagationComplete(resourcemanager: Long, requestcookie: UInt, bufferlength: UInt, buffer: Long): NTSTATUS =
    0

public actual fun TmPropagationFailed(resourcemanager: Long, requestcookie: UInt, status: NTSTATUS): NTSTATUS =
    0

public actual fun TmReadOnlyEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun TmRecoverEnlistment(enlistment: Long, enlistmentkey: Long): NTSTATUS =
    0

public actual fun TmRecoverResourceManager(resourcemanager: Long): NTSTATUS =
    0

public actual fun TmRecoverTransactionManager(tm: Long, targetvirtualclock: Long): NTSTATUS =
    0

public actual fun TmReferenceEnlistmentKey(enlistment: Long, key: Long): NTSTATUS =
    0

public actual fun TmRenameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): NTSTATUS =
    0

public actual fun TmRequestOutcomeEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun TmRollbackComplete(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun TmRollbackEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun TmRollbackTransaction(transaction: Long, wait: Boolean): NTSTATUS =
    0

public actual fun TmSinglePhaseReject(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun VslCreateSecureSection(handle: Long, targetprocess: PEPROCESS, mdl: Long, devicepageprotection: UInt, attributes: UInt): NTSTATUS =
    0

public actual fun VslDeleteSecureSection(globalhandle: HANDLE): NTSTATUS =
    0

public actual fun WheaAddErrorSource(errorsource: Long, context: Long): NTSTATUS =
    0

public actual fun WheaAddErrorSourceDeviceDriver(context: Long, configuration: Long, numberpreallocatederrorreports: UInt): NTSTATUS =
    0

public actual fun WheaAddErrorSourceDeviceDriverV1(context: Long, configuration: Long, numbufferstopreallocate: UInt, maxdatalength: UInt): NTSTATUS =
    0

public actual fun WheaAddHwErrorReportSectionDeviceDriver(errorhandle: Long, sectiondatalength: UInt, bufferset: Long): NTSTATUS =
    0

public actual fun WheaConfigureErrorSource(sourcetype: WHEA_ERROR_SOURCE_TYPE, configuration: Long): NTSTATUS =
    0

public actual fun WheaCreateHwErrorReportDeviceDriver(errorsourceid: UInt, deviceobject: Long): Long =
    0L

public actual fun WheaErrorSourceGetState(errorsourceid: UInt): WHEA_ERROR_SOURCE_STATE =
    0

public actual fun WheaGetNotifyAllOfflinesPolicy(): Boolean =
    false

public actual fun WheaHighIrqlLogSelEventHandlerRegister(handler: PFN_WHEA_HIGH_IRQL_LOG_SEL_EVENT_HANDLER, context: Long): Boolean =
    false

public actual fun WheaHighIrqlLogSelEventHandlerUnregister() {
}

public actual fun WheaHwErrorReportAbandonDeviceDriver(errorhandle: Long): NTSTATUS =
    0

public actual fun WheaHwErrorReportSetSectionNameDeviceDriver(bufferset: Long, namelength: UInt, name: Long): NTSTATUS =
    0

public actual fun WheaHwErrorReportSetSeverityDeviceDriver(errorhandle: Long, errorseverity: WHEA_ERROR_SEVERITY): NTSTATUS =
    0

public actual fun WheaHwErrorReportSubmitDeviceDriver(errorhandle: Long): NTSTATUS =
    0

public actual fun WheaInitializeRecordHeader(header: Long): NTSTATUS =
    0

public actual fun WheaIsCriticalState(): Boolean =
    false

public actual fun WheaLogInternalEvent(entry: Long) {
}

public actual fun WheaRegisterInUsePageOfflineNotification(callback: PFN_IN_USE_PAGE_OFFLINE_NOTIFY, context: Long): NTSTATUS =
    0

public actual fun WheaRemoveErrorSource(errorsourceid: UInt) {
}

public actual fun WheaRemoveErrorSourceDeviceDriver(errorsourceid: UInt): NTSTATUS =
    0

public actual fun WheaReportHwError(errorpacket: Long): NTSTATUS =
    0

public actual fun WheaReportHwErrorDeviceDriver(errorsourceid: UInt, deviceobject: Long, errordata: Long, errordatalength: UInt, sectiontypeguid: Long, errorseverity: WHEA_ERROR_SEVERITY, devicefriendlyname: PCSTR): NTSTATUS =
    0

public actual fun WheaUnconfigureErrorSource(sourcetype: WHEA_ERROR_SOURCE_TYPE): NTSTATUS =
    0

public actual fun WheaUnregisterInUsePageOfflineNotification(callback: PFN_IN_USE_PAGE_OFFLINE_NOTIFY): NTSTATUS =
    0

public actual fun WmiQueryTraceInformation(traceinformationclass: TRACE_INFORMATION_CLASS, traceinformation: Long, traceinformationlength: UInt, requiredlength: Long, buffer: Long): NTSTATUS =
    0

public actual fun ZwAllocateLocallyUniqueId(luid: Long): NTSTATUS =
    0

public actual fun ZwClose(handle: HANDLE): NTSTATUS =
    0

public actual fun ZwCommitComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun ZwCommitEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun ZwCommitTransaction(transactionhandle: HANDLE, wait: Boolean): NTSTATUS =
    0

public actual fun ZwCreateEnlistment(enlistmenthandle: Long, desiredaccess: UInt, resourcemanagerhandle: HANDLE, transactionhandle: HANDLE, objectattributes: Long, createoptions: UInt, notificationmask: UInt, enlistmentkey: Long): NTSTATUS =
    0

public actual fun ZwCreateFile(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt): NTSTATUS =
    0

public actual fun ZwCreateResourceManager(resourcemanagerhandle: Long, desiredaccess: UInt, tmhandle: HANDLE, resourcemanagerguid: Long, objectattributes: Long, createoptions: UInt, description: Long): NTSTATUS =
    0

public actual fun ZwCreateSection(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: HANDLE): NTSTATUS =
    0

public actual fun ZwCreateTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, uow: Long, tmhandle: HANDLE, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: Long, description: Long): NTSTATUS =
    0

public actual fun ZwCreateTransactionManager(tmhandle: Long, desiredaccess: UInt, objectattributes: Long, logfilename: Long, createoptions: UInt, commitstrength: UInt): NTSTATUS =
    0

public actual fun ZwDeviceIoControlFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, iocontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS =
    0

public actual fun ZwDisplayString(string: Long): NTSTATUS =
    0

public actual fun ZwEnumerateTransactionObject(rootobjecthandle: HANDLE, querytype: KTMOBJECT_TYPE, objectcursor: Long, objectcursorlength: UInt, returnlength: Long): NTSTATUS =
    0

public actual fun ZwGetNotificationResourceManager(resourcemanagerhandle: HANDLE, transactionnotification: Long, notificationlength: UInt, timeout: Long, returnlength: Long, asynchronous: UInt, asynchronouscontext: ULong): NTSTATUS =
    0

public actual fun ZwLoadDriver(driverservicename: Long): NTSTATUS =
    0

public actual fun ZwMakeTemporaryObject(handle: HANDLE): NTSTATUS =
    0

public actual fun ZwManagePartition(targethandle: HANDLE, sourcehandle: HANDLE, partitioninformationclass: PARTITION_INFORMATION_CLASS, partitioninformation: Long, partitioninformationlength: UInt): NTSTATUS =
    0

public actual fun ZwOpenEnlistment(enlistmenthandle: Long, desiredaccess: UInt, rmhandle: HANDLE, enlistmentguid: Long, objectattributes: Long): NTSTATUS =
    0

public actual fun ZwOpenFile(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, shareaccess: UInt, openoptions: UInt): NTSTATUS =
    0

public actual fun ZwOpenResourceManager(resourcemanagerhandle: Long, desiredaccess: UInt, tmhandle: HANDLE, resourcemanagerguid: Long, objectattributes: Long): NTSTATUS =
    0

public actual fun ZwOpenSymbolicLinkObject(linkhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    0

public actual fun ZwOpenTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, uow: Long, tmhandle: HANDLE): NTSTATUS =
    0

public actual fun ZwOpenTransactionManager(tmhandle: Long, desiredaccess: UInt, objectattributes: Long, logfilename: Long, tmidentity: Long, openoptions: UInt): NTSTATUS =
    0

public actual fun ZwPowerInformation(informationlevel: POWER_INFORMATION_LEVEL, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS =
    0

public actual fun ZwPrePrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun ZwPrePrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun ZwPrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun ZwPrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun ZwPropagationComplete(resourcemanagerhandle: HANDLE, requestcookie: UInt, bufferlength: UInt, buffer: Long): NTSTATUS =
    0

public actual fun ZwPropagationFailed(resourcemanagerhandle: HANDLE, requestcookie: UInt, propstatus: NTSTATUS): NTSTATUS =
    0

public actual fun ZwQueryInformationByName(objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS =
    0

public actual fun ZwQueryInformationEnlistment(enlistmenthandle: HANDLE, enlistmentinformationclass: ENLISTMENT_INFORMATION_CLASS, enlistmentinformation: Long, enlistmentinformationlength: UInt, returnlength: Long): NTSTATUS =
    0

public actual fun ZwQueryInformationFile(filehandle: HANDLE, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS =
    0

public actual fun ZwQueryInformationResourceManager(resourcemanagerhandle: HANDLE, resourcemanagerinformationclass: RESOURCEMANAGER_INFORMATION_CLASS, resourcemanagerinformation: Long, resourcemanagerinformationlength: UInt, returnlength: Long): NTSTATUS =
    0

public actual fun ZwQueryInformationTransaction(transactionhandle: HANDLE, transactioninformationclass: TRANSACTION_INFORMATION_CLASS, transactioninformation: Long, transactioninformationlength: UInt, returnlength: Long): NTSTATUS =
    0

public actual fun ZwQueryInformationTransactionManager(transactionmanagerhandle: HANDLE, transactionmanagerinformationclass: TRANSACTIONMANAGER_INFORMATION_CLASS, transactionmanagerinformation: Long, transactionmanagerinformationlength: UInt, returnlength: Long): NTSTATUS =
    0

public actual fun ZwQuerySymbolicLinkObject(linkhandle: HANDLE, linktarget: Long, returnedlength: Long): NTSTATUS =
    0

public actual fun ZwReadFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, buffer: Long, length: UInt, byteoffset: Long, key: Long): NTSTATUS =
    0

public actual fun ZwReadOnlyEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun ZwRecoverEnlistment(enlistmenthandle: HANDLE, enlistmentkey: Long): NTSTATUS =
    0

public actual fun ZwRecoverResourceManager(resourcemanagerhandle: HANDLE): NTSTATUS =
    0

public actual fun ZwRecoverTransactionManager(transactionmanagerhandle: HANDLE): NTSTATUS =
    0

public actual fun ZwRegisterProtocolAddressInformation(resourcemanager: HANDLE, protocolid: Long, protocolinformationsize: UInt, protocolinformation: Long, createoptions: UInt): NTSTATUS =
    0

public actual fun ZwRenameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): NTSTATUS =
    0

public actual fun ZwRollbackComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun ZwRollbackEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun ZwRollbackTransaction(transactionhandle: HANDLE, wait: Boolean): NTSTATUS =
    0

public actual fun ZwRollforwardTransactionManager(transactionmanagerhandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun ZwSetInformationEnlistment(enlistmenthandle: HANDLE, enlistmentinformationclass: ENLISTMENT_INFORMATION_CLASS, enlistmentinformation: Long, enlistmentinformationlength: UInt): NTSTATUS =
    0

public actual fun ZwSetInformationFile(filehandle: HANDLE, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS =
    0

public actual fun ZwSetInformationResourceManager(resourcemanagerhandle: HANDLE, resourcemanagerinformationclass: RESOURCEMANAGER_INFORMATION_CLASS, resourcemanagerinformation: Long, resourcemanagerinformationlength: UInt): NTSTATUS =
    0

public actual fun ZwSetInformationTransaction(transactionhandle: HANDLE, transactioninformationclass: TRANSACTION_INFORMATION_CLASS, transactioninformation: Long, transactioninformationlength: UInt): NTSTATUS =
    0

public actual fun ZwSetInformationTransactionManager(tmhandle: HANDLE, transactionmanagerinformationclass: TRANSACTIONMANAGER_INFORMATION_CLASS, transactionmanagerinformation: Long, transactionmanagerinformationlength: UInt): NTSTATUS =
    0

public actual fun ZwSinglePhaseReject(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    0

public actual fun ZwUnloadDriver(driverservicename: Long): NTSTATUS =
    0

public actual fun ZwWriteFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, buffer: Long, length: UInt, byteoffset: Long, key: Long): NTSTATUS =
    0

public actual fun vDbgPrintEx(componentid: UInt, level: UInt, format: PCSTR, arglist: Long): UInt =
    0u

public actual fun vDbgPrintExWithPrefix(prefix: PCSTR, componentid: UInt, level: UInt, format: PCSTR, arglist: Long): UInt =
    0u
